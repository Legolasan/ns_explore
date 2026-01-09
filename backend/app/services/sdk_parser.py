"""
SDK Parser - Parses decompiled Java SDK files to extract metadata
"""
import os
import re
from typing import Dict, List, Optional, Tuple
from pathlib import Path


class SDKParser:
    """Parser for NetSuite SDK Java source files"""
    
    # Map of record type names to their expected package locations
    RECORD_PACKAGES = {
        # Lists
        "accounting": "lists.accounting",
        "employees": "lists.employees", 
        "marketing": "lists.marketing",
        "relationships": "lists.relationships",
        "supplychain": "lists.supplychain",
        "support": "lists.support",
        "website": "lists.website",
        # Transactions
        "bank": "transactions.bank",
        "customers": "transactions.customers",
        "demandplanning": "transactions.demandplanning",
        "employees_txn": "transactions.employees",
        "financial": "transactions.financial",
        "general": "transactions.general",
        "inventory": "transactions.inventory",
        "purchases": "transactions.purchases",
        "sales": "transactions.sales",
        # Activities
        "scheduling": "activities.scheduling",
        # Documents
        "filecabinet": "documents.filecabinet",
        # General
        "communication": "general.communication",
        # Setup
        "customization": "setup.customization",
        # Platform
        "core": "platform.core",
        "common": "platform.common",
        "messages": "platform.messages",
    }
    
    # Java type to simple type mapping
    TYPE_MAPPING = {
        "String": "String",
        "Long": "Number",
        "Double": "Number",
        "Integer": "Number",
        "Boolean": "Boolean",
        "Calendar": "Date",
        "RecordRef": "RecordRef",
        "CustomFieldList": "CustomFields",
    }
    
    def __init__(self, sdk_path: str, version: str = "2022.1"):
        """
        Initialize parser with SDK source path and version.
        
        Args:
            sdk_path: Path to the decompiled SDK source (e.g., /path/to/sdk/2022.1)
            version: SDK version string (e.g., "2022.1")
        """
        self.sdk_path = Path(sdk_path)
        self.version = version
        # Convert version like "2022.1" to path format "v2022_1"
        version_path = f"v{version.replace('.', '_')}"
        self.base_package = f"com/netsuite/suitetalk/proxy/{version_path}"
        
    def parse_record_types_enum(self) -> Dict[str, str]:
        """
        Parse RecordType.java to get all supported record types.
        
        Returns:
            Dict mapping record type name to its string constant
        """
        record_type_file = self.sdk_path / self.base_package / "platform/core/types/RecordType.java"
        
        if not record_type_file.exists():
            raise FileNotFoundError(f"RecordType.java not found at {record_type_file}")
        
        content = record_type_file.read_text()
        
        # Find all record type constants: public static final String _customer = "customer";
        pattern = r'public static final String _(\w+) = "(\w+)"'
        matches = re.findall(pattern, content)
        
        # Also find the static instances: public static final RecordType customer = new RecordType("customer");
        instance_pattern = r'public static final RecordType (\w+) = new RecordType\("(\w+)"\)'
        instance_matches = re.findall(instance_pattern, content)
        
        record_types = {}
        for var_name, value in matches:
            record_types[value] = var_name
            
        return record_types
    
    def find_record_class(self, record_type: str) -> Optional[Path]:
        """
        Find the Java class file for a given record type.
        
        Args:
            record_type: The record type name (e.g., "customer", "salesOrder")
            
        Returns:
            Path to the Java class file, or None if not found
        """
        # Convert camelCase to class name (e.g., salesOrder -> SalesOrder)
        class_name = record_type[0].upper() + record_type[1:]
        
        # Search in known package locations
        search_paths = [
            f"lists/accounting/{class_name}.java",
            f"lists/employees/{class_name}.java",
            f"lists/marketing/{class_name}.java",
            f"lists/relationships/{class_name}.java",
            f"lists/supplychain/{class_name}.java",
            f"lists/support/{class_name}.java",
            f"lists/website/{class_name}.java",
            f"transactions/bank/{class_name}.java",
            f"transactions/customers/{class_name}.java",
            f"transactions/demandplanning/{class_name}.java",
            f"transactions/employees/{class_name}.java",
            f"transactions/financial/{class_name}.java",
            f"transactions/general/{class_name}.java",
            f"transactions/inventory/{class_name}.java",
            f"transactions/purchases/{class_name}.java",
            f"transactions/sales/{class_name}.java",
            f"activities/scheduling/{class_name}.java",
            f"documents/filecabinet/{class_name}.java",
            f"general/communication/{class_name}.java",
            f"setup/customization/{class_name}.java",
            f"platform/core/{class_name}.java",
        ]
        
        for search_path in search_paths:
            full_path = self.sdk_path / self.base_package / search_path
            if full_path.exists():
                return full_path
                
        return None
    
    def parse_class_fields(self, java_file: Path) -> List[Dict]:
        """
        Parse a Java class file to extract field definitions.
        
        Args:
            java_file: Path to the Java file
            
        Returns:
            List of field dictionaries with name, type, etc.
        """
        content = java_file.read_text()
        fields = []
        
        # Match private field declarations: private Type fieldName;
        # Handle generic types like List<Something>
        field_pattern = r'private\s+([\w<>]+(?:\[\])?)\s+(\w+)\s*;'
        matches = re.findall(field_pattern, content)
        
        for java_type, field_name in matches:
            # Skip internal/meta fields
            if field_name.startswith('__') or field_name == 'typeDesc':
                continue
                
            field_info = self._parse_field_type(java_type, field_name)
            if field_info:
                fields.append(field_info)
                
        return fields
    
    def _parse_field_type(self, java_type: str, field_name: str) -> Optional[Dict]:
        """
        Parse a Java type into a simplified field info dict.
        """
        is_list = False
        is_record_ref = False
        is_enum = False
        ref_type = None
        enum_values = None
        
        # Handle List types
        if 'List' in java_type or java_type.endswith('[]'):
            is_list = True
            # Extract inner type if generic
            inner_match = re.search(r'<(\w+)>', java_type)
            if inner_match:
                java_type = inner_match.group(1)
        
        # Determine simple type
        simple_type = self.TYPE_MAPPING.get(java_type, "Custom")
        
        # Check if it's a RecordRef
        if java_type == "RecordRef":
            is_record_ref = True
            simple_type = "RecordRef"
            # Try to infer the referenced type from field name
            ref_type = self._infer_ref_type(field_name)
        
        # Check if it looks like an enum (ends with common enum suffixes or has specific patterns)
        if java_type not in self.TYPE_MAPPING and not java_type.endswith('List'):
            # It's likely an enum or custom type
            if self._is_likely_enum(java_type):
                is_enum = True
                simple_type = "Enum"
            else:
                simple_type = "Custom"
        
        return {
            "name": field_name,
            "java_type": java_type,
            "simple_type": simple_type,
            "is_list": is_list,
            "is_record_ref": is_record_ref,
            "ref_type": ref_type,
            "is_enum": is_enum,
            "enum_values": enum_values,
        }
    
    def _infer_ref_type(self, field_name: str) -> Optional[str]:
        """
        Try to infer the record type from a RecordRef field name.
        """
        # Common patterns
        ref_mappings = {
            "customer": "customer",
            "entity": "customer",  # Could be customer, vendor, employee, etc.
            "subsidiary": "subsidiary",
            "department": "department",
            "location": "location",
            "class": "classification",
            "_class": "classification",
            "currency": "currency",
            "salesRep": "employee",
            "employee": "employee",
            "vendor": "vendor",
            "partner": "partner",
            "terms": "term",
            "priceLevel": "priceLevel",
            "taxItem": "salesTaxItem",
            "shipMethod": "shipItem",
            "paymentMethod": "paymentMethod",
            "account": "account",
            "item": "inventoryItem",
            "job": "job",
            "opportunity": "opportunity",
            "campaign": "campaign",
            "leadSource": "leadSource",
            "contact": "contact",
            "customForm": "customRecordType",
            "parent": None,  # Could be any record type
        }
        
        # Direct match
        if field_name.lower() in ref_mappings:
            return ref_mappings[field_name.lower()]
            
        # Check for common suffixes
        for key, value in ref_mappings.items():
            if field_name.lower().endswith(key.lower()):
                return value
                
        return None
    
    def _is_likely_enum(self, java_type: str) -> bool:
        """
        Check if a Java type is likely an enum.
        """
        # Common enum naming patterns in NetSuite SDK
        enum_patterns = [
            "Status", "Type", "Category", "Stage", "State",
            "Mode", "Method", "Format", "Preference", "Code",
            "Level", "Priority", "Response", "Result", "Override",
        ]
        
        for pattern in enum_patterns:
            if pattern in java_type:
                return True
                
        return False
    
    def parse_enum_type(self, enum_file: Path) -> Optional[Dict]:
        """
        Parse an enum Java file to extract its values.
        """
        content = enum_file.read_text()
        
        # Find enum values from static fields: public static final EnumType _value = new EnumType("_value");
        pattern = r'public static final \w+ (\w+) = new \w+\("([^"]+)"\)'
        matches = re.findall(pattern, content)
        
        if not matches:
            # Try alternate pattern: public static final String __value = "_value";
            pattern2 = r'public static final String __(\w+) = "_(\w+)"'
            matches = re.findall(pattern2, content)
        
        values = [m[1] if len(m) > 1 else m[0] for m in matches]
        
        if values:
            return {
                "name": enum_file.stem,
                "values": values
            }
        return None
    
    def find_search_class(self, record_type: str) -> Optional[Path]:
        """
        Find the Search class for a record type.
        """
        class_name = record_type[0].upper() + record_type[1:] + "Search"
        
        # Search in known locations
        search_paths = [
            f"lists/accounting/{class_name}.java",
            f"lists/relationships/{class_name}.java",
            f"transactions/sales/{class_name}.java",
            f"transactions/purchases/{class_name}.java",
            f"transactions/inventory/{class_name}.java",
            f"activities/scheduling/{class_name}.java",
            f"setup/customization/{class_name}.java",
        ]
        
        for search_path in search_paths:
            full_path = self.sdk_path / self.base_package / search_path
            if full_path.exists():
                return full_path
                
        return None
    
    def get_package_from_path(self, file_path: Path) -> str:
        """
        Extract package path from a Java file path.
        """
        # Convert path to package notation
        rel_path = file_path.relative_to(self.sdk_path / self.base_package)
        package_path = str(rel_path.parent).replace("/", ".").replace("\\", ".")
        return package_path
    
    def get_category_from_package(self, package: str) -> str:
        """
        Extract category from package path.
        """
        parts = package.split(".")
        if len(parts) >= 2:
            return parts[-1]  # e.g., "relationships" from "lists.relationships"
        return "unknown"
