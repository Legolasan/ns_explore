"""
Record Type API endpoints
"""
from typing import List, Optional
from fastapi import APIRouter, HTTPException, Query

from ..services.sdk_indexer import SDKIndexer
from ..models.schemas import RecordTypeInfo, SearchResult

router = APIRouter(prefix="/records", tags=["records"])

# Initialize indexer (will be properly configured in main.py)
_indexer: Optional[SDKIndexer] = None


def get_indexer() -> SDKIndexer:
    """Get the SDK indexer instance"""
    global _indexer
    if _indexer is None:
        raise HTTPException(status_code=500, detail="SDK indexer not initialized")
    return _indexer


def set_indexer(indexer: SDKIndexer):
    """Set the SDK indexer instance"""
    global _indexer
    _indexer = indexer


@router.get("", response_model=dict)
async def list_record_types(
    category: Optional[str] = Query(None, description="Filter by category"),
    limit: int = Query(100, ge=1, le=500, description="Maximum results"),
    offset: int = Query(0, ge=0, description="Offset for pagination")
):
    """
    List all supported record types.
    
    Returns a summary of all record types with optional category filtering.
    """
    indexer = get_indexer()
    index = indexer.get_index()
    
    records = list(index.record_types.values())
    
    # Filter by category if specified
    if category:
        records = [r for r in records if r.category == category]
    
    # Sort alphabetically
    records.sort(key=lambda r: r.name)
    
    # Paginate
    total = len(records)
    records = records[offset:offset + limit]
    
    return {
        "total": total,
        "offset": offset,
        "limit": limit,
        "records": [
            {
                "name": r.name,
                "class_name": r.class_name,
                "category": r.category,
                "field_count": r.field_count,
                "has_search": r.has_search,
            }
            for r in records
        ]
    }


@router.get("/categories", response_model=List[dict])
async def list_categories():
    """
    List all record type categories with counts.
    """
    indexer = get_indexer()
    index = indexer.get_index()
    
    categories = {}
    for record in index.record_types.values():
        cat = record.category
        if cat not in categories:
            categories[cat] = {"name": cat, "count": 0}
        categories[cat]["count"] += 1
    
    return sorted(categories.values(), key=lambda c: c["name"])


@router.get("/search", response_model=List[dict])
async def search_record_types(
    q: str = Query(..., min_length=1, description="Search query"),
    limit: int = Query(50, ge=1, le=100, description="Maximum results")
):
    """
    Search for record types by name.
    
    Returns matching record types sorted by relevance.
    """
    indexer = get_indexer()
    results = indexer.search_record_types(q)
    return results[:limit]


@router.get("/check/{record_type}", response_model=dict)
async def check_record_type(record_type: str):
    """
    Check if a specific record type is supported.
    
    Returns support status and basic info.
    """
    indexer = get_indexer()
    record_info = indexer.get_record_type(record_type.lower())
    
    if record_info:
        return {
            "supported": True,
            "name": record_info.name,
            "class_name": record_info.class_name,
            "category": record_info.category,
            "field_count": record_info.field_count,
            "has_search": record_info.has_search,
            "package": record_info.package,
        }
    else:
        # Try fuzzy match
        results = indexer.search_record_types(record_type)
        suggestions = [r["name"] for r in results[:5]]
        
        return {
            "supported": False,
            "name": record_type,
            "message": f"Record type '{record_type}' is not supported in this SDK version.",
            "suggestions": suggestions,
        }


@router.get("/{record_type}", response_model=dict)
async def get_record_type_details(record_type: str):
    """
    Get detailed information about a record type including all fields.
    """
    indexer = get_indexer()
    record_info = indexer.get_record_type(record_type.lower())
    
    if not record_info:
        raise HTTPException(
            status_code=404, 
            detail=f"Record type '{record_type}' not found"
        )
    
    # Group fields by type for easier viewing
    field_groups = {
        "string_fields": [],
        "number_fields": [],
        "boolean_fields": [],
        "date_fields": [],
        "record_ref_fields": [],
        "enum_fields": [],
        "list_fields": [],
        "custom_fields": [],
    }
    
    for field in record_info.fields:
        field_data = {
            "name": field.name,
            "java_type": field.java_type,
            "simple_type": field.simple_type,
        }
        
        if field.is_record_ref:
            field_data["ref_type"] = field.ref_type
            field_groups["record_ref_fields"].append(field_data)
        elif field.is_enum:
            field_data["enum_values"] = field.enum_values
            field_groups["enum_fields"].append(field_data)
        elif field.is_list:
            field_groups["list_fields"].append(field_data)
        elif field.simple_type == "String":
            field_groups["string_fields"].append(field_data)
        elif field.simple_type == "Number":
            field_groups["number_fields"].append(field_data)
        elif field.simple_type == "Boolean":
            field_groups["boolean_fields"].append(field_data)
        elif field.simple_type == "Date":
            field_groups["date_fields"].append(field_data)
        else:
            field_groups["custom_fields"].append(field_data)
    
    return {
        "name": record_info.name,
        "class_name": record_info.class_name,
        "package": record_info.package,
        "full_class_path": record_info.full_class_path,
        "category": record_info.category,
        "field_count": record_info.field_count,
        "has_search": record_info.has_search,
        "search_class": record_info.search_class,
        "fields": [f.model_dump() for f in record_info.fields],
        "field_groups": field_groups,
    }


@router.get("/{record_type}/fields", response_model=List[dict])
async def get_record_fields(
    record_type: str,
    type_filter: Optional[str] = Query(None, description="Filter by field type"),
    search: Optional[str] = Query(None, description="Search field names")
):
    """
    Get fields for a specific record type with optional filtering.
    """
    indexer = get_indexer()
    record_info = indexer.get_record_type(record_type.lower())
    
    if not record_info:
        raise HTTPException(
            status_code=404, 
            detail=f"Record type '{record_type}' not found"
        )
    
    fields = record_info.fields
    
    # Filter by type if specified
    if type_filter:
        fields = [f for f in fields if f.simple_type.lower() == type_filter.lower()]
    
    # Search field names if specified
    if search:
        search_lower = search.lower()
        fields = [f for f in fields if search_lower in f.name.lower()]
    
    return [f.model_dump() for f in fields]
