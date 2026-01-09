#!/usr/bin/env python3
"""
Build all SDK version indexes.
This script is run during the Railway build phase to generate indexes
for all available SDK versions.

Usage:
    python scripts/build_all_indexes.py
"""
import os
import sys

# Add parent directory to path for imports
sys.path.insert(0, os.path.join(os.path.dirname(__file__), '..'))

from backend.app.services.sdk_indexer import MultiVersionIndexer


def main():
    # Resolve paths
    script_dir = os.path.dirname(os.path.abspath(__file__))
    project_root = os.path.dirname(script_dir)
    
    sdk_base_path = os.path.join(project_root, 'sdk')
    data_path = os.path.join(project_root, 'backend', 'data')
    
    print("="*60)
    print("NetSuite SDK Multi-Version Indexer")
    print("="*60)
    print(f"SDK Base Path: {sdk_base_path}")
    print(f"Data Path: {data_path}")
    print()
    
    if not os.path.exists(sdk_base_path):
        print(f"ERROR: SDK base path does not exist: {sdk_base_path}")
        print("Please create sdk/<version>/ directories with SDK source files")
        sys.exit(1)
    
    # Build indexes for all versions
    indexer = MultiVersionIndexer(sdk_base_path, data_path)
    versions = indexer.discover_versions()
    
    if not versions:
        print("ERROR: No SDK versions found in sdk/ directory")
        print("Expected structure: sdk/2022.1/com/netsuite/...")
        sys.exit(1)
    
    print(f"Discovered SDK versions: {', '.join(versions)}")
    print()
    
    indexes = indexer.build_all_indexes()
    
    # Print summary
    print("\n" + "="*60)
    print("BUILD SUMMARY")
    print("="*60)
    
    for version, index in indexes.items():
        print(f"\nVersion {version}:")
        print(f"  - Record Types: {index.total_records}")
        print(f"  - Total Fields: {index.total_fields}")
        print(f"  - Enum Types: {len(index.enum_types)}")
    
    print(f"\nTotal versions indexed: {len(indexes)}")
    print("Index files saved to: backend/data/")
    print("Build complete!")


if __name__ == '__main__':
    main()
