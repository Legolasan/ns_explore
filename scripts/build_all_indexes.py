#!/usr/bin/env python3
"""
Build all SDK version indexes and connector usage index.
This script is run during the Railway build phase to generate indexes
for all available SDK versions and connector usage information.

Usage:
    python scripts/build_all_indexes.py
"""
import os
import sys

# Add parent directory to path for imports
sys.path.insert(0, os.path.join(os.path.dirname(__file__), '..'))

from backend.app.services.sdk_indexer import MultiVersionIndexer
from backend.app.services.connector_parser import ConnectorIndexer


def build_sdk_indexes(project_root: str, sdk_base_path: str, data_path: str) -> dict:
    """Build SDK indexes for all versions."""
    print("="*60)
    print("NetSuite SDK Multi-Version Indexer")
    print("="*60)
    print(f"SDK Base Path: {sdk_base_path}")
    print(f"Data Path: {data_path}")
    print()
    
    if not os.path.exists(sdk_base_path):
        print(f"WARNING: SDK base path does not exist: {sdk_base_path}")
        print("SDK indexes will not be built.")
        return {}
    
    # Build indexes for all versions
    indexer = MultiVersionIndexer(sdk_base_path, data_path)
    versions = indexer.discover_versions()
    
    if not versions:
        print("WARNING: No SDK versions found in sdk/ directory")
        print("Expected structure: sdk/2022.1/com/netsuite/...")
        return {}
    
    print(f"Discovered SDK versions: {', '.join(versions)}")
    print()
    
    indexes = indexer.build_all_indexes()
    return indexes


def build_connector_index(project_root: str, data_path: str, sdk_record_count: int = 191) -> dict:
    """Build connector usage index."""
    print()
    print("="*60)
    print("Hevo Connector Usage Indexer")
    print("="*60)
    
    # Look for connector source in multiple locations
    connector_paths = [
        os.path.join(project_root, 'erp'),           # Local development
        os.path.join(project_root, '..', 'erp'),     # Sibling directory
    ]
    
    connector_path = None
    for path in connector_paths:
        check_path = os.path.join(path, 'connector', 'record')
        if os.path.exists(check_path):
            connector_path = path
            break
    
    if not connector_path:
        print("INFO: Connector source not found. Skipping connector index.")
        print("  Checked locations:")
        for path in connector_paths:
            print(f"    - {os.path.abspath(path)}")
        return None
    
    print(f"Connector Path: {connector_path}")
    print(f"Data Path: {data_path}")
    print()
    
    try:
        indexer = ConnectorIndexer(
            connector_path=connector_path,
            index_dir=data_path
        )
        index = indexer.build_index(sdk_record_count=sdk_record_count, save=True)
        return index
    except Exception as e:
        print(f"WARNING: Failed to build connector index: {e}")
        return None


def main():
    # Resolve paths
    script_dir = os.path.dirname(os.path.abspath(__file__))
    project_root = os.path.dirname(script_dir)
    
    sdk_base_path = os.path.join(project_root, 'sdk')
    data_path = os.path.join(project_root, 'backend', 'data')
    
    # Ensure data directory exists
    os.makedirs(data_path, exist_ok=True)
    
    # Build SDK indexes
    sdk_indexes = build_sdk_indexes(project_root, sdk_base_path, data_path)
    
    # Calculate total SDK record count for connector coverage stats
    sdk_record_count = 191  # Default
    if sdk_indexes:
        # Use the record count from the first (or default) version
        for version, index in sdk_indexes.items():
            sdk_record_count = index.total_records
            break
    
    # Build connector usage index
    connector_index = build_connector_index(project_root, data_path, sdk_record_count)
    
    # Print summary
    print("\n" + "="*60)
    print("BUILD SUMMARY")
    print("="*60)
    
    if sdk_indexes:
        print("\nSDK Versions:")
        for version, index in sdk_indexes.items():
            print(f"  Version {version}:")
            print(f"    - Record Types: {index.total_records}")
            print(f"    - Total Fields: {index.total_fields}")
            print(f"    - Enum Types: {len(index.enum_types)}")
        print(f"\n  Total versions indexed: {len(sdk_indexes)}")
    else:
        print("\nSDK Versions: None (SDK source not found)")
    
    if connector_index:
        print("\nConnector Usage:")
        stats = connector_index.coverage_stats
        print(f"  - Records Used: {stats.get('connector_records', 0)}")
        print(f"  - Coverage: {stats.get('coverage_percent', 0)}%")
        print(f"  - Transaction Types: {stats.get('categories', {}).get('transaction', 0)}")
        print(f"  - Item Types: {stats.get('categories', {}).get('item', 0)}")
        print(f"  - Standard Types: {stats.get('categories', {}).get('standard', 0)}")
    else:
        print("\nConnector Usage: Not available (connector source not found)")
    
    print(f"\nIndex files saved to: {data_path}")
    print("Build complete!")


if __name__ == '__main__':
    main()
