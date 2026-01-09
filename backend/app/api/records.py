"""
Record Type API endpoints
"""
from typing import List, Optional, Callable
from fastapi import APIRouter, HTTPException, Query

from ..services.sdk_indexer import SDKIndexer
from ..services.connector_parser import ConnectorIndexer, get_connector_indexer
from ..models.schemas import RecordTypeInfo, SearchResult

router = APIRouter(prefix="/records", tags=["records"])

# Initialize indexer (will be properly configured in main.py)
_indexer: Optional[SDKIndexer] = None

# Connector indexer (will be configured in main.py)
_connector_indexer: Optional[ConnectorIndexer] = None

# Function to get versioned indexer (set by main.py)
get_versioned_indexer: Optional[Callable[[Optional[str]], SDKIndexer]] = None


def get_indexer(version: Optional[str] = None) -> SDKIndexer:
    """Get the SDK indexer instance for a specific version"""
    global _indexer, get_versioned_indexer
    
    # If version-aware function is available, use it
    if get_versioned_indexer is not None:
        try:
            return get_versioned_indexer(version)
        except ValueError as e:
            raise HTTPException(status_code=404, detail=str(e))
    
    # Fall back to default indexer
    if _indexer is None:
        raise HTTPException(status_code=500, detail="SDK indexer not initialized")
    return _indexer


def set_indexer(indexer: SDKIndexer):
    """Set the SDK indexer instance (for backward compatibility)"""
    global _indexer
    _indexer = indexer


def set_connector_indexer(indexer: ConnectorIndexer):
    """Set the connector indexer instance"""
    global _connector_indexer
    _connector_indexer = indexer


def get_connector_index():
    """Get the connector indexer instance"""
    global _connector_indexer
    if _connector_indexer is None:
        # Try to get from global
        return get_connector_indexer()
    return _connector_indexer


@router.get("", response_model=dict)
async def list_record_types(
    version: Optional[str] = Query(None, description="SDK version (defaults to latest)"),
    category: Optional[str] = Query(None, description="Filter by category"),
    limit: int = Query(100, ge=1, le=500, description="Maximum results"),
    offset: int = Query(0, ge=0, description="Offset for pagination")
):
    """
    List all supported record types.
    
    Returns a summary of all record types with optional category filtering.
    """
    indexer = get_indexer(version)
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
        "sdk_version": index.version,
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
                "field_names": [f.name for f in r.fields],  # Include field names for client-side search
            }
            for r in records
        ]
    }


@router.get("/categories", response_model=List[dict])
async def list_categories(
    version: Optional[str] = Query(None, description="SDK version (defaults to latest)")
):
    """
    List all record type categories with counts.
    """
    indexer = get_indexer(version)
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
    version: Optional[str] = Query(None, description="SDK version (defaults to latest)"),
    limit: int = Query(50, ge=1, le=100, description="Maximum results")
):
    """
    Search for record types by name.
    
    Returns matching record types sorted by relevance.
    """
    indexer = get_indexer(version)
    results = indexer.search_record_types(q)
    
    # Add version info to results
    index = indexer.get_index()
    for r in results:
        r["sdk_version"] = index.version
    
    return results[:limit]


@router.get("/check/{record_type}", response_model=dict)
async def check_record_type(
    record_type: str,
    version: Optional[str] = Query(None, description="SDK version (defaults to latest)")
):
    """
    Check if a specific record type is supported.
    
    Returns support status and basic info.
    """
    indexer = get_indexer(version)
    index = indexer.get_index()
    record_info = indexer.get_record_type(record_type.lower())
    
    if record_info:
        return {
            "supported": True,
            "sdk_version": index.version,
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
            "sdk_version": index.version,
            "name": record_type,
            "message": f"Record type '{record_type}' is not supported in SDK version {index.version}.",
            "suggestions": suggestions,
        }


@router.get("/{record_type}", response_model=dict)
async def get_record_type_details(
    record_type: str,
    version: Optional[str] = Query(None, description="SDK version (defaults to latest)")
):
    """
    Get detailed information about a record type including all fields.
    """
    indexer = get_indexer(version)
    index = indexer.get_index()
    record_info = indexer.get_record_type(record_type.lower())
    
    if not record_info:
        raise HTTPException(
            status_code=404, 
            detail=f"Record type '{record_type}' not found in SDK version {index.version}"
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
        "sdk_version": index.version,
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
    version: Optional[str] = Query(None, description="SDK version (defaults to latest)"),
    type_filter: Optional[str] = Query(None, description="Filter by field type"),
    search: Optional[str] = Query(None, description="Search field names")
):
    """
    Get fields for a specific record type with optional filtering.
    """
    indexer = get_indexer(version)
    index = indexer.get_index()
    record_info = indexer.get_record_type(record_type.lower())
    
    if not record_info:
        raise HTTPException(
            status_code=404, 
            detail=f"Record type '{record_type}' not found in SDK version {index.version}"
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


@router.get("/{record_type}/connector-usage", response_model=dict)
async def get_connector_usage(
    record_type: str,
    version: Optional[str] = Query(None, description="SDK version (defaults to latest)")
):
    """
    Get Hevo connector usage information for a specific record type.
    
    Returns details about whether this record type is used in the Hevo NetSuite connector,
    which fields are extracted, load type, and other connector-specific information.
    """
    # First verify the record exists in SDK
    indexer = get_indexer(version)
    index = indexer.get_index()
    record_info = indexer.get_record_type(record_type.lower())
    
    if not record_info:
        raise HTTPException(
            status_code=404, 
            detail=f"Record type '{record_type}' not found in SDK version {index.version}"
        )
    
    # Get connector usage info
    connector_indexer = get_connector_index()
    
    if connector_indexer is None:
        return {
            "sdk_version": index.version,
            "record_name": record_info.name,
            "used_in_connector": False,
            "message": "Connector usage data not available"
        }
    
    usage = connector_indexer.get_record_usage(record_info.name)
    
    if usage is None:
        return {
            "sdk_version": index.version,
            "record_name": record_info.name,
            "used_in_connector": False,
            "message": f"Record type '{record_info.name}' is NOT used in the Hevo connector",
            "total_sdk_fields": record_info.field_count,
            "fields_extracted": 0
        }
    
    # Calculate field coverage - only count fields that exist in SDK
    sdk_field_names = {f.name.lower() for f in record_info.fields}
    connector_fields = usage.get("fields_extracted", [])
    
    # Match fields: check if field exists in SDK (case-insensitive) or is the special "_class" field
    matched_fields = [f for f in connector_fields if f.lower() in sdk_field_names or f == "_class"]
    extra_fields = [f for f in connector_fields if f.lower() not in sdk_field_names and f != "_class"]
    
    matched_count = len(matched_fields)
    coverage_percent = round((matched_count / record_info.field_count) * 100, 1) if record_info.field_count > 0 else 0
    
    return {
        "sdk_version": index.version,
        "record_name": record_info.name,
        "used_in_connector": True,
        "category": usage.get("category"),
        "load_type": usage.get("load_type"),
        "sdk_class": usage.get("sdk_class"),
        "search_class": usage.get("search_class"),
        "total_sdk_fields": record_info.field_count,
        "fields_extracted": matched_count,
        "field_coverage_percent": coverage_percent,
        "extracted_field_names": matched_fields,
        "extra_connector_fields": extra_fields,  # Fields added by connector not in SDK
        "source_file": usage.get("source_file")
    }


@router.get("/connector/stats", response_model=dict)
async def get_connector_stats():
    """
    Get overall connector usage statistics.
    
    Returns summary of how many SDK record types are used in the Hevo connector.
    """
    connector_indexer = get_connector_index()
    
    if connector_indexer is None:
        return {
            "available": False,
            "message": "Connector usage data not available"
        }
    
    index = connector_indexer.get_index()
    
    if index is None:
        return {
            "available": False,
            "message": "Connector usage index not loaded"
        }
    
    return {
        "available": True,
        "total_sdk_records": index.coverage_stats.get("total_sdk_records", 0),
        "connector_records": index.coverage_stats.get("connector_records", 0),
        "coverage_percent": index.coverage_stats.get("coverage_percent", 0),
        "categories": index.coverage_stats.get("categories", {}),
        "used_record_names": list(index.record_types.keys())
    }
