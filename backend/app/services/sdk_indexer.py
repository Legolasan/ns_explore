"""
SDK Indexer - Builds a searchable index from the parsed SDK
"""
import json
import os
from pathlib import Path
from typing import Dict, List, Optional
from .sdk_parser import SDKParser
from ..models.schemas import SDKIndex, RecordTypeInfo, FieldInfo, EnumTypeInfo


class SDKIndexer:
    """Builds and manages the SDK index"""
    
    def __init__(self, sdk_path: str, index_path: Optional[str] = None):
        """
        Initialize indexer.
        
        Args:
            sdk_path: Path to the SDK source files
            index_path: Path to save/load the index JSON
        """
        self.sdk_path = sdk_path
        self.parser = SDKParser(sdk_path)
        self.index_path = index_path or os.path.join(
            os.path.dirname(__file__), 
            "../../data/sdk_index.json"
        )
        self._index: Optional[SDKIndex] = None
        
    def build_index(self, save: bool = True) -> SDKIndex:
        """
        Build the complete SDK index by parsing all files.
        
        Args:
            save: Whether to save the index to disk
            
        Returns:
            The complete SDKIndex
        """
        print("Starting SDK indexing...")
        
        # Get all record types
        record_types = self.parser.parse_record_types_enum()
        print(f"Found {len(record_types)} record types in RecordType.java")
        
        index = SDKIndex(version="2022.1")
        total_fields = 0
        
        for record_name, var_name in record_types.items():
            print(f"Processing: {record_name}")
            
            # Find the class file
            class_file = self.parser.find_record_class(record_name)
            
            if class_file:
                # Parse fields
                fields_data = self.parser.parse_class_fields(class_file)
                
                # Convert to FieldInfo objects
                fields = [
                    FieldInfo(
                        name=f["name"],
                        java_type=f["java_type"],
                        simple_type=f["simple_type"],
                        is_list=f["is_list"],
                        is_record_ref=f["is_record_ref"],
                        ref_type=f["ref_type"],
                        is_enum=f["is_enum"],
                        enum_values=f.get("enum_values"),
                    )
                    for f in fields_data
                ]
                
                # Get package info
                package = self.parser.get_package_from_path(class_file)
                category = self.parser.get_category_from_package(package)
                
                # Check for search class
                search_file = self.parser.find_search_class(record_name)
                has_search = search_file is not None
                
                # Create record type info
                class_name = class_file.stem
                full_path = f"com.netsuite.suitetalk.proxy.v2022_1.{package}.{class_name}"
                
                record_info = RecordTypeInfo(
                    name=record_name,
                    class_name=class_name,
                    package=package,
                    full_class_path=full_path,
                    category=category,
                    supported=True,
                    fields=fields,
                    field_count=len(fields),
                    has_search=has_search,
                    search_class=search_file.stem if search_file else None,
                )
                
                index.record_types[record_name] = record_info
                total_fields += len(fields)
                
            else:
                # Record type exists but class file not found
                index.record_types[record_name] = RecordTypeInfo(
                    name=record_name,
                    class_name=record_name[0].upper() + record_name[1:],
                    package="unknown",
                    full_class_path="unknown",
                    category="unknown",
                    supported=True,
                    fields=[],
                    field_count=0,
                    has_search=False,
                )
        
        # Build quick lookup list
        index.record_type_names = sorted(list(index.record_types.keys()))
        index.total_records = len(index.record_types)
        index.total_fields = total_fields
        
        # Parse common enum types
        self._index_enums(index)
        
        print(f"Indexing complete: {index.total_records} records, {index.total_fields} fields")
        
        self._index = index
        
        if save:
            self.save_index(index)
            
        return index
    
    def _index_enums(self, index: SDKIndex):
        """Index common enum types"""
        enum_dirs = [
            "platform/core/types",
            "platform/common/types",
            "lists/accounting/types",
            "lists/relationships/types",
            "transactions/sales/types",
        ]
        
        base_path = Path(self.sdk_path) / "com/netsuite/suitetalk/proxy/v2022_1"
        
        for enum_dir in enum_dirs:
            dir_path = base_path / enum_dir
            if dir_path.exists():
                for java_file in dir_path.glob("*.java"):
                    enum_data = self.parser.parse_enum_type(java_file)
                    if enum_data:
                        package = enum_dir.replace("/", ".")
                        index.enum_types[enum_data["name"]] = EnumTypeInfo(
                            name=enum_data["name"],
                            package=package,
                            values=enum_data["values"]
                        )
    
    def save_index(self, index: SDKIndex):
        """Save index to JSON file"""
        # Ensure directory exists
        os.makedirs(os.path.dirname(self.index_path), exist_ok=True)
        
        with open(self.index_path, 'w') as f:
            json.dump(index.model_dump(), f, indent=2)
        print(f"Index saved to {self.index_path}")
    
    def load_index(self) -> SDKIndex:
        """Load index from JSON file"""
        if self._index is not None:
            return self._index
            
        if os.path.exists(self.index_path):
            with open(self.index_path, 'r') as f:
                data = json.load(f)
            self._index = SDKIndex(**data)
            return self._index
        else:
            raise FileNotFoundError(f"Index file not found at {self.index_path}")
    
    def get_index(self) -> SDKIndex:
        """Get the index, loading from file if necessary"""
        if self._index is not None:
            return self._index
        return self.load_index()
    
    def search_record_types(self, query: str) -> List[Dict]:
        """
        Search for record types matching a query.
        
        Args:
            query: Search query string
            
        Returns:
            List of matching record types with match info
        """
        index = self.get_index()
        query_lower = query.lower()
        results = []
        
        for name, info in index.record_types.items():
            match_type = None
            
            # Exact match
            if name.lower() == query_lower:
                match_type = "exact"
            # Prefix match
            elif name.lower().startswith(query_lower):
                match_type = "prefix"
            # Contains match
            elif query_lower in name.lower():
                match_type = "contains"
            # Class name match
            elif query_lower in info.class_name.lower():
                match_type = "class_name"
                
            if match_type:
                results.append({
                    "name": name,
                    "class_name": info.class_name,
                    "category": info.category,
                    "field_count": info.field_count,
                    "match_type": match_type,
                    "has_search": info.has_search,
                })
        
        # Sort by match type priority
        priority = {"exact": 0, "prefix": 1, "contains": 2, "class_name": 3}
        results.sort(key=lambda x: (priority.get(x["match_type"], 99), x["name"]))
        
        return results
    
    def search_fields(self, query: str) -> List[Dict]:
        """
        Search for fields across all record types.
        
        Args:
            query: Field name to search for
            
        Returns:
            List of matching fields with record type info
        """
        index = self.get_index()
        query_lower = query.lower()
        results = []
        
        for record_name, record_info in index.record_types.items():
            for field in record_info.fields:
                if query_lower in field.name.lower():
                    results.append({
                        "field_name": field.name,
                        "field_type": field.simple_type,
                        "java_type": field.java_type,
                        "record_type": record_name,
                        "record_class": record_info.class_name,
                        "is_record_ref": field.is_record_ref,
                        "ref_type": field.ref_type,
                    })
        
        # Sort by exact match first, then alphabetically
        results.sort(key=lambda x: (
            0 if x["field_name"].lower() == query_lower else 1,
            x["field_name"],
            x["record_type"]
        ))
        
        return results
    
    def get_record_type(self, name: str) -> Optional[RecordTypeInfo]:
        """Get details for a specific record type"""
        index = self.get_index()
        return index.record_types.get(name)
    
    def get_enum_values(self, enum_name: str) -> Optional[List[str]]:
        """Get values for a specific enum type"""
        index = self.get_index()
        enum_info = index.enum_types.get(enum_name)
        if enum_info:
            return enum_info.values
        return None
    
    def get_all_categories(self) -> List[str]:
        """Get all unique categories"""
        index = self.get_index()
        categories = set()
        for record in index.record_types.values():
            categories.add(record.category)
        return sorted(list(categories))
    
    def get_records_by_category(self, category: str) -> List[RecordTypeInfo]:
        """Get all records in a category"""
        index = self.get_index()
        return [
            record for record in index.record_types.values()
            if record.category == category
        ]
