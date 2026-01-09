"""
Field Indexer Service

Builds a reverse index mapping field names to all record types containing them.
This enables quick lookup for questions like "Which records have the accountingBook field?"
"""

import json
import os
from pathlib import Path
from typing import Dict, List, Optional, Any
from dataclasses import dataclass, field, asdict


@dataclass
class FieldLocation:
    """Represents where a field is found"""
    record_name: str
    record_class: str
    category: str
    field_type: str  # String, Number, Boolean, RecordRef, List, etc.
    java_type: str
    is_record_ref: bool
    ref_type: Optional[str] = None
    used_in_connector: bool = False


@dataclass
class FieldIndex:
    """The complete field-to-record reverse index"""
    # Map field name -> list of locations
    fields: Dict[str, List[dict]] = field(default_factory=dict)
    # Stats
    total_unique_fields: int = 0
    total_field_occurrences: int = 0
    # Map lowercase field name -> canonical field name
    field_name_lookup: Dict[str, str] = field(default_factory=dict)
    
    def to_dict(self) -> dict:
        return {
            "fields": self.fields,
            "total_unique_fields": self.total_unique_fields,
            "total_field_occurrences": self.total_field_occurrences,
            "field_name_lookup": self.field_name_lookup
        }


class FieldIndexer:
    """Builds and manages the field-to-record reverse index"""
    
    def __init__(self, data_dir: Optional[str] = None):
        """
        Initialize the field indexer.
        
        Args:
            data_dir: Directory containing SDK and connector index files
        """
        self.data_dir = Path(data_dir) if data_dir else Path(__file__).parent.parent.parent / "data"
        self.index_path = self.data_dir / "field_index.json"
        self._index: Optional[FieldIndex] = None
        
    def build_index(self, sdk_index: dict, connector_index: Optional[dict] = None, save: bool = True) -> FieldIndex:
        """
        Build the reverse field index from SDK and connector indexes.
        
        Args:
            sdk_index: The loaded SDK index dictionary
            connector_index: Optional connector usage index
            save: Whether to save to disk
            
        Returns:
            The built FieldIndex
        """
        print("Building field-to-record reverse index...")
        
        index = FieldIndex()
        connector_records = set()
        
        # Get set of records used in connector
        if connector_index and "record_types" in connector_index:
            connector_records = set(connector_index["record_types"].keys())
        
        # Process all record types
        record_types = sdk_index.get("record_types", {})
        
        for record_name, record_info in record_types.items():
            category = record_info.get("category", "unknown")
            record_class = record_info.get("class_name", record_name)
            used_in_connector = record_name in connector_records
            
            fields = record_info.get("fields", [])
            
            for field_data in fields:
                field_name = field_data.get("name")
                if not field_name:
                    continue
                    
                # Create location entry
                location = {
                    "record_name": record_name,
                    "record_class": record_class,
                    "category": category,
                    "field_type": field_data.get("simple_type", "unknown"),
                    "java_type": field_data.get("java_type", "unknown"),
                    "is_record_ref": field_data.get("is_record_ref", False),
                    "ref_type": field_data.get("ref_type"),
                    "used_in_connector": used_in_connector
                }
                
                # Add to index
                if field_name not in index.fields:
                    index.fields[field_name] = []
                    # Store canonical name for lookup
                    index.field_name_lookup[field_name.lower()] = field_name
                    
                index.fields[field_name].append(location)
                index.total_field_occurrences += 1
        
        index.total_unique_fields = len(index.fields)
        
        print(f"Field index built: {index.total_unique_fields} unique fields across {index.total_field_occurrences} occurrences")
        
        self._index = index
        
        if save:
            self.save_index(index)
            
        return index
    
    def save_index(self, index: FieldIndex):
        """Save the field index to disk"""
        os.makedirs(self.data_dir, exist_ok=True)
        
        with open(self.index_path, 'w', encoding='utf-8') as f:
            json.dump(index.to_dict(), f, indent=2)
            
        print(f"Field index saved to: {self.index_path}")
    
    def load_index(self) -> Optional[FieldIndex]:
        """Load the field index from disk"""
        if self._index is not None:
            return self._index
            
        if not self.index_path.exists():
            print(f"Field index not found: {self.index_path}")
            return None
            
        with open(self.index_path, 'r', encoding='utf-8') as f:
            data = json.load(f)
            
        self._index = FieldIndex(
            fields=data.get("fields", {}),
            total_unique_fields=data.get("total_unique_fields", 0),
            total_field_occurrences=data.get("total_field_occurrences", 0),
            field_name_lookup=data.get("field_name_lookup", {})
        )
        
        return self._index
    
    def get_index(self) -> Optional[FieldIndex]:
        """Get the current index, loading from disk if necessary"""
        if self._index is None:
            return self.load_index()
        return self._index
    
    def find_field(self, field_name: str) -> Optional[List[dict]]:
        """
        Find all record types that contain a field.
        
        Args:
            field_name: The field name to search for (case-insensitive)
            
        Returns:
            List of location dicts or None if not found
        """
        index = self.get_index()
        if index is None:
            return None
            
        # Try exact match first
        if field_name in index.fields:
            return index.fields[field_name]
            
        # Try case-insensitive lookup
        canonical_name = index.field_name_lookup.get(field_name.lower())
        if canonical_name:
            return index.fields.get(canonical_name)
            
        return None
    
    def search_fields(self, query: str, limit: int = 50) -> List[dict]:
        """
        Search for fields matching a query.
        
        Args:
            query: Search query (partial match, case-insensitive)
            limit: Maximum results to return
            
        Returns:
            List of matching fields with their locations
        """
        index = self.get_index()
        if index is None:
            return []
            
        query_lower = query.lower()
        results = []
        
        for field_name, locations in index.fields.items():
            if query_lower in field_name.lower():
                # Count how many records have this field
                connector_count = sum(1 for loc in locations if loc["used_in_connector"])
                
                results.append({
                    "field_name": field_name,
                    "record_count": len(locations),
                    "connector_count": connector_count,
                    "locations": locations[:10],  # Limit locations per field
                    "match_type": "exact" if field_name.lower() == query_lower else "partial"
                })
                
                if len(results) >= limit:
                    break
        
        # Sort by exact match first, then by record count
        results.sort(key=lambda x: (0 if x["match_type"] == "exact" else 1, -x["record_count"]))
        
        return results
    
    def get_field_summary(self, field_name: str) -> Optional[dict]:
        """
        Get a summary of a field's usage across record types.
        
        Args:
            field_name: The field name
            
        Returns:
            Summary dict with usage statistics
        """
        locations = self.find_field(field_name)
        if not locations:
            return None
            
        # Categorize by category
        by_category = {}
        connector_records = []
        non_connector_records = []
        field_types = set()
        
        for loc in locations:
            category = loc["category"]
            if category not in by_category:
                by_category[category] = []
            by_category[category].append(loc["record_name"])
            
            if loc["used_in_connector"]:
                connector_records.append(loc["record_name"])
            else:
                non_connector_records.append(loc["record_name"])
                
            field_types.add(loc["field_type"])
        
        return {
            "field_name": field_name,
            "total_occurrences": len(locations),
            "field_types": list(field_types),
            "in_connector_count": len(connector_records),
            "connector_records": connector_records,
            "non_connector_records": non_connector_records[:10],  # Limit for readability
            "by_category": by_category,
            "is_record_ref": locations[0].get("is_record_ref", False) if locations else False,
            "ref_type": locations[0].get("ref_type") if locations else None
        }
    
    def build_context_for_ai(self, limit_per_field: int = 5) -> str:
        """
        Build a condensed context string for AI queries.
        
        Args:
            limit_per_field: Max records to list per field
            
        Returns:
            Context string summarizing the field index
        """
        index = self.get_index()
        if index is None:
            return "Field index not available."
            
        lines = [
            f"FIELD INDEX SUMMARY:",
            f"Total unique fields: {index.total_unique_fields}",
            f"Total field occurrences: {index.total_field_occurrences}",
            "",
            "COMMON FIELDS (appearing in 10+ records):"
        ]
        
        # Find fields in many records
        common_fields = sorted(
            [(name, len(locs)) for name, locs in index.fields.items()],
            key=lambda x: -x[1]
        )[:50]
        
        for field_name, count in common_fields:
            if count >= 10:
                lines.append(f"  - {field_name}: {count} records")
        
        return "\n".join(lines)


# Global instance
_field_indexer: Optional[FieldIndexer] = None


def get_field_indexer() -> Optional[FieldIndexer]:
    """Get the global field indexer instance"""
    return _field_indexer


def set_field_indexer(indexer: FieldIndexer):
    """Set the global field indexer instance"""
    global _field_indexer
    _field_indexer = indexer
