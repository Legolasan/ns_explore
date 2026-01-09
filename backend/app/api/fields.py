"""
Field Search API endpoints
"""
from typing import List, Optional
from fastapi import APIRouter, Query

from ..services.sdk_indexer import SDKIndexer
from .records import get_indexer

router = APIRouter(prefix="/fields", tags=["fields"])


@router.get("/search", response_model=dict)
async def search_fields(
    q: str = Query(..., min_length=1, description="Field name to search"),
    record_type: Optional[str] = Query(None, description="Filter by record type"),
    field_type: Optional[str] = Query(None, description="Filter by field type"),
    limit: int = Query(100, ge=1, le=500, description="Maximum results")
):
    """
    Search for fields across all record types.
    
    Useful for finding which record types have a specific field.
    """
    indexer = get_indexer()
    results = indexer.search_fields(q)
    
    # Apply filters
    if record_type:
        record_type_lower = record_type.lower()
        results = [r for r in results if r["record_type"] == record_type_lower]
    
    if field_type:
        field_type_lower = field_type.lower()
        results = [r for r in results if r["field_type"].lower() == field_type_lower]
    
    # Group by field name for summary
    field_summary = {}
    for r in results[:limit]:
        field_name = r["field_name"]
        if field_name not in field_summary:
            field_summary[field_name] = {
                "field_name": field_name,
                "field_type": r["field_type"],
                "record_count": 0,
                "records": []
            }
        field_summary[field_name]["record_count"] += 1
        field_summary[field_name]["records"].append({
            "record_type": r["record_type"],
            "record_class": r["record_class"]
        })
    
    return {
        "query": q,
        "total_matches": len(results),
        "results": results[:limit],
        "summary": list(field_summary.values())
    }


@router.get("/common", response_model=List[dict])
async def get_common_fields(
    min_occurrences: int = Query(10, ge=2, description="Minimum occurrences across record types")
):
    """
    Get fields that appear in multiple record types.
    
    Useful for understanding common patterns across the SDK.
    """
    indexer = get_indexer()
    index = indexer.get_index()
    
    # Count field occurrences
    field_counts = {}
    
    for record_name, record_info in index.record_types.items():
        for field in record_info.fields:
            field_key = (field.name, field.simple_type)
            if field_key not in field_counts:
                field_counts[field_key] = {
                    "field_name": field.name,
                    "field_type": field.simple_type,
                    "java_type": field.java_type,
                    "occurrences": 0,
                    "record_types": []
                }
            field_counts[field_key]["occurrences"] += 1
            field_counts[field_key]["record_types"].append(record_name)
    
    # Filter by minimum occurrences
    common_fields = [
        f for f in field_counts.values() 
        if f["occurrences"] >= min_occurrences
    ]
    
    # Sort by occurrence count
    common_fields.sort(key=lambda f: -f["occurrences"])
    
    return common_fields


@router.get("/types", response_model=List[dict])
async def get_field_types():
    """
    Get all unique field types in the SDK with counts.
    """
    indexer = get_indexer()
    index = indexer.get_index()
    
    type_counts = {}
    
    for record_info in index.record_types.values():
        for field in record_info.fields:
            simple_type = field.simple_type
            if simple_type not in type_counts:
                type_counts[simple_type] = {"type": simple_type, "count": 0}
            type_counts[simple_type]["count"] += 1
    
    return sorted(type_counts.values(), key=lambda t: -t["count"])


@router.get("/record-refs", response_model=List[dict])
async def get_record_ref_fields(
    ref_type: Optional[str] = Query(None, description="Filter by referenced record type")
):
    """
    Get all RecordRef fields with their referenced types.
    
    Useful for understanding relationships between record types.
    """
    indexer = get_indexer()
    index = indexer.get_index()
    
    ref_fields = []
    
    for record_name, record_info in index.record_types.items():
        for field in record_info.fields:
            if field.is_record_ref:
                if ref_type is None or field.ref_type == ref_type:
                    ref_fields.append({
                        "field_name": field.name,
                        "source_record": record_name,
                        "source_class": record_info.class_name,
                        "ref_type": field.ref_type,
                    })
    
    # Sort by ref_type then field_name
    ref_fields.sort(key=lambda f: (f["ref_type"] or "zzz", f["field_name"]))
    
    return ref_fields
