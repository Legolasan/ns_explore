"""
Connector Parser Service

Parses the Hevo NetSuite connector implementation code to extract:
- Which record types are used in production
- Field mappings for each record type
- Load type (Full/Incremental)
- Complex data types handling
"""

import os
import re
import json
from pathlib import Path
from typing import Dict, List, Optional, Set, Tuple
from dataclasses import dataclass, field, asdict


@dataclass
class ConnectorRecordType:
    """Represents a record type used in the connector"""
    name: str
    category: str  # transaction, item, standard
    load_type: str  # incremental, full_load
    sdk_class: str
    search_class: str
    fields_extracted: List[str] = field(default_factory=list)
    complex_types: List[str] = field(default_factory=list)
    source_file: str = ""


@dataclass
class ConnectorUsageIndex:
    """The complete connector usage index"""
    record_types: Dict[str, dict] = field(default_factory=dict)
    coverage_stats: dict = field(default_factory=dict)
    
    def to_dict(self) -> dict:
        return {
            "record_types": self.record_types,
            "coverage_stats": self.coverage_stats
        }


class ConnectorParser:
    """Parser for Hevo NetSuite connector implementation code"""
    
    # Patterns for parsing Java enum files
    ENUM_ENTRY_PATTERN = re.compile(
        r'(\w+)\s*\(\s*"(\w+)"\s*,\s*(\w+)\.class\s*,\s*(\w+)\.class\s*\)',
        re.MULTILINE
    )
    
    # Pattern for field mappings: put("fieldName", ...)
    FIELD_PUT_PATTERN = re.compile(r'put\s*\(\s*"([^"]+)"')
    
    # Pattern for complex type declarations in enum files
    COMPLEX_TYPE_PATTERN = re.compile(r'(\w+(?:List|Matrix|Detail|Address))\.class')
    
    def __init__(self, connector_path: str):
        """
        Initialize parser with connector source path.
        
        Args:
            connector_path: Path to the connector source (e.g., /path/to/erp)
        """
        self.connector_path = Path(connector_path)
        self.record_dir = self.connector_path / "connector" / "record"
        self.fields_dir = self.connector_path / "connector" / "fields"
        
    def parse_enum_file(self, filename: str, category: str, load_type: str) -> List[ConnectorRecordType]:
        """
        Parse a Java enum file to extract record type definitions.
        
        Args:
            filename: Name of the enum file
            category: Category (transaction, item, standard)
            load_type: Load type (incremental, full_load)
            
        Returns:
            List of ConnectorRecordType objects
        """
        file_path = self.record_dir / filename
        if not file_path.exists():
            print(f"Warning: Enum file not found: {file_path}")
            return []
            
        with open(file_path, 'r', encoding='utf-8') as f:
            content = f.read()
            
        record_types = []
        
        # Find all enum entries
        for match in self.ENUM_ENTRY_PATTERN.finditer(content):
            enum_name, record_name, record_class, search_class = match.groups()
            
            record_type = ConnectorRecordType(
                name=record_name,
                category=category,
                load_type=load_type,
                sdk_class=record_class,
                search_class=search_class,
                source_file=filename
            )
            record_types.append(record_type)
            
        # Extract complex types from the file
        complex_types = set(self.COMPLEX_TYPE_PATTERN.findall(content))
        
        return record_types, complex_types
    
    def parse_field_mappings(self, filename: str) -> Dict[str, List[str]]:
        """
        Parse a field mapping file to extract fields for each record type.
        
        Args:
            filename: Name of the field mapping file
            
        Returns:
            Dict mapping record class name to list of field names
        """
        file_path = self.fields_dir / filename
        if not file_path.exists():
            print(f"Warning: Field mapping file not found: {file_path}")
            return {}
            
        with open(file_path, 'r', encoding='utf-8') as f:
            content = f.read()
            
        # Split content by constructor definitions
        # Pattern: public ClassName(RecordType record) or ClassName(RecordType txn)
        constructor_pattern = re.compile(
            r'(?:public\s+)?\w+Fields?\s*\(\s*(\w+)\s+(?:record|txn|item)\s*\)\s*\{([^}]+(?:\{[^}]*\}[^}]*)*)\}',
            re.MULTILINE | re.DOTALL
        )
        
        field_mappings = {}
        
        for match in constructor_pattern.finditer(content):
            record_class = match.group(1)
            constructor_body = match.group(2)
            
            # Extract all put("fieldName", ...) calls
            fields = self.FIELD_PUT_PATTERN.findall(constructor_body)
            
            # Map the record class to a record name
            # E.g., AssemblyBuild -> assemblyBuild (camelCase)
            record_name = record_class[0].lower() + record_class[1:]
            field_mappings[record_class] = fields
            
        return field_mappings
    
    def parse_all_record_types(self) -> Tuple[List[ConnectorRecordType], Dict[str, Set[str]]]:
        """
        Parse all record type enum files.
        
        Returns:
            Tuple of (list of all record types, dict of complex types by category)
        """
        all_records = []
        all_complex_types = {}
        
        # Parse transaction types (incremental load)
        txn_records, txn_complex = self.parse_enum_file(
            "NetsuiteTransactionRecordType.java",
            "transaction",
            "incremental"
        )
        all_records.extend(txn_records)
        all_complex_types["transaction"] = txn_complex
        
        # Parse item types (incremental load)
        item_records, item_complex = self.parse_enum_file(
            "NetsuiteItemRecordType.java",
            "item",
            "incremental"
        )
        all_records.extend(item_records)
        all_complex_types["item"] = item_complex
        
        # Parse standard full load types
        std_records, std_complex = self.parse_enum_file(
            "NetsuiteStandardFullLoadRecordType.java",
            "standard",
            "full_load"
        )
        all_records.extend(std_records)
        all_complex_types["standard"] = std_complex
        
        return all_records, all_complex_types
    
    def parse_all_field_mappings(self) -> Dict[str, List[str]]:
        """
        Parse all field mapping files.
        
        Returns:
            Dict mapping record class name to list of field names
        """
        all_mappings = {}
        
        # Parse transaction field mappings
        txn_mappings = self.parse_field_mappings("TransactionRecordTypeFields.java")
        all_mappings.update(txn_mappings)
        
        # Parse item field mappings
        item_mappings = self.parse_field_mappings("ItemRecordTypeFields.java")
        all_mappings.update(item_mappings)
        
        # Parse standard full load field mappings
        std_mappings = self.parse_field_mappings("FullLoadStdRecordTypeFields.java")
        all_mappings.update(std_mappings)
        
        # Parse incremental standard record type fields
        incr_std_mappings = self.parse_field_mappings("IncrStdRecordTypeFields.java")
        all_mappings.update(incr_std_mappings)
        
        return all_mappings
    
    def build_usage_index(self, sdk_record_count: int = 191) -> ConnectorUsageIndex:
        """
        Build the complete connector usage index.
        
        Args:
            sdk_record_count: Total number of record types in the SDK
            
        Returns:
            ConnectorUsageIndex with all parsed data
        """
        # Parse all record types
        all_records, complex_types_by_category = self.parse_all_record_types()
        
        # Parse all field mappings
        field_mappings = self.parse_all_field_mappings()
        
        # Build the index
        index = ConnectorUsageIndex()
        
        for record in all_records:
            # Try to find field mappings for this record
            record.fields_extracted = field_mappings.get(record.sdk_class, [])
            
            # Add complex types from the category
            category_complex = complex_types_by_category.get(record.category, set())
            record.complex_types = list(category_complex)
            
            # Convert to dict for JSON serialization
            index.record_types[record.name] = {
                "used_in_connector": True,
                "category": record.category,
                "load_type": record.load_type,
                "sdk_class": record.sdk_class,
                "search_class": record.search_class,
                "fields_extracted": record.fields_extracted,
                "field_count": len(record.fields_extracted),
                "source_file": record.source_file
            }
        
        # Calculate coverage stats
        connector_count = len(index.record_types)
        index.coverage_stats = {
            "total_sdk_records": sdk_record_count,
            "connector_records": connector_count,
            "coverage_percent": round((connector_count / sdk_record_count) * 100, 1) if sdk_record_count > 0 else 0,
            "categories": {
                "transaction": len([r for r in all_records if r.category == "transaction"]),
                "item": len([r for r in all_records if r.category == "item"]),
                "standard": len([r for r in all_records if r.category == "standard"])
            }
        }
        
        return index
    
    def save_index(self, output_path: str, sdk_record_count: int = 191) -> ConnectorUsageIndex:
        """
        Build and save the connector usage index to a JSON file.
        
        Args:
            output_path: Path to save the JSON file
            sdk_record_count: Total number of record types in the SDK
            
        Returns:
            The generated ConnectorUsageIndex
        """
        index = self.build_usage_index(sdk_record_count)
        
        # Ensure output directory exists
        os.makedirs(os.path.dirname(output_path), exist_ok=True)
        
        with open(output_path, 'w', encoding='utf-8') as f:
            json.dump(index.to_dict(), f, indent=2)
            
        print(f"Connector usage index saved to: {output_path}")
        print(f"  - Total records in connector: {index.coverage_stats['connector_records']}")
        print(f"  - Coverage: {index.coverage_stats['coverage_percent']}%")
        
        return index


class ConnectorIndexer:
    """Manages the connector usage index"""
    
    _index: Optional[ConnectorUsageIndex] = None
    
    def __init__(self, connector_path: str, index_dir: Optional[str] = None):
        """
        Initialize indexer.
        
        Args:
            connector_path: Path to the connector source files
            index_dir: Directory to save/load index JSONs (defaults to backend/data)
        """
        self.connector_path = connector_path
        self.parser = ConnectorParser(connector_path)
        
        self.index_dir = index_dir or os.path.join(
            os.path.dirname(__file__), "../../data"
        )
        os.makedirs(self.index_dir, exist_ok=True)
        self.index_path = os.path.join(self.index_dir, "connector_usage.json")
        
    def build_index(self, sdk_record_count: int = 191, save: bool = True) -> ConnectorUsageIndex:
        """
        Build the connector usage index.
        
        Args:
            sdk_record_count: Total number of record types in the SDK
            save: Whether to save the index to disk
            
        Returns:
            The generated ConnectorUsageIndex
        """
        if save:
            self._index = self.parser.save_index(self.index_path, sdk_record_count)
        else:
            self._index = self.parser.build_usage_index(sdk_record_count)
            
        return self._index
    
    def load_index(self) -> Optional[ConnectorUsageIndex]:
        """
        Load the connector usage index from disk.
        
        Returns:
            The loaded ConnectorUsageIndex or None if not found
        """
        if self._index is not None:
            return self._index
            
        if not os.path.exists(self.index_path):
            print(f"Connector usage index not found: {self.index_path}")
            return None
            
        with open(self.index_path, 'r', encoding='utf-8') as f:
            data = json.load(f)
            
        self._index = ConnectorUsageIndex(
            record_types=data.get("record_types", {}),
            coverage_stats=data.get("coverage_stats", {})
        )
        
        return self._index
    
    def get_index(self) -> Optional[ConnectorUsageIndex]:
        """Get the current index, loading from disk if necessary."""
        if self._index is None:
            return self.load_index()
        return self._index
    
    def get_record_usage(self, record_name: str) -> Optional[dict]:
        """
        Get connector usage info for a specific record type.
        
        Args:
            record_name: Name of the record type (e.g., "Invoice")
            
        Returns:
            Dict with usage info or None if not found
        """
        index = self.get_index()
        if index is None:
            return None
            
        # Try exact match first
        if record_name in index.record_types:
            return index.record_types[record_name]
            
        # Try case-insensitive match
        record_name_lower = record_name.lower()
        for key, value in index.record_types.items():
            if key.lower() == record_name_lower:
                return value
                
        return None
    
    def is_used_in_connector(self, record_name: str) -> bool:
        """Check if a record type is used in the connector."""
        return self.get_record_usage(record_name) is not None


# Global instance for easy access
_connector_indexer: Optional[ConnectorIndexer] = None


def get_connector_indexer() -> Optional[ConnectorIndexer]:
    """Get the global connector indexer instance."""
    return _connector_indexer


def set_connector_indexer(indexer: ConnectorIndexer):
    """Set the global connector indexer instance."""
    global _connector_indexer
    _connector_indexer = indexer


if __name__ == "__main__":
    # Test the parser
    import sys
    
    if len(sys.argv) < 2:
        print("Usage: python connector_parser.py <connector_path> [output_path]")
        sys.exit(1)
        
    connector_path = sys.argv[1]
    output_path = sys.argv[2] if len(sys.argv) > 2 else "connector_usage.json"
    
    parser = ConnectorParser(connector_path)
    index = parser.save_index(output_path)
    
    print("\nSample records:")
    for name, info in list(index.record_types.items())[:5]:
        print(f"  {name}: {info['category']} ({info['load_type']}) - {info['field_count']} fields")
