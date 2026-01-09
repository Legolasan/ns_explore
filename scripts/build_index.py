#!/usr/bin/env python3
"""
Build the SDK index from source files.
Run this script to generate/update the sdk_index.json file.

Usage:
    python scripts/build_index.py [--sdk-path PATH] [--output PATH]
"""
import argparse
import os
import sys

# Add parent directory to path for imports
sys.path.insert(0, os.path.join(os.path.dirname(__file__), '..'))

from backend.app.services.sdk_indexer import SDKIndexer


def main():
    parser = argparse.ArgumentParser(description='Build NetSuite SDK index')
    parser.add_argument(
        '--sdk-path', 
        default='../netsuite-sdk-src',
        help='Path to the decompiled SDK source'
    )
    parser.add_argument(
        '--output',
        default='backend/data/sdk_index.json',
        help='Output path for the index JSON'
    )
    
    args = parser.parse_args()
    
    # Resolve paths
    script_dir = os.path.dirname(os.path.abspath(__file__))
    project_root = os.path.dirname(script_dir)
    
    sdk_path = os.path.abspath(os.path.join(project_root, args.sdk_path))
    output_path = os.path.abspath(os.path.join(project_root, args.output))
    
    print(f"SDK Path: {sdk_path}")
    print(f"Output Path: {output_path}")
    
    if not os.path.exists(sdk_path):
        print(f"ERROR: SDK path does not exist: {sdk_path}")
        sys.exit(1)
    
    # Build the index
    indexer = SDKIndexer(sdk_path, output_path)
    index = indexer.build_index(save=True)
    
    # Print summary
    print("\n" + "="*50)
    print("INDEX SUMMARY")
    print("="*50)
    print(f"SDK Version: {index.version}")
    print(f"Total Record Types: {index.total_records}")
    print(f"Total Fields: {index.total_fields}")
    print(f"Enum Types: {len(index.enum_types)}")
    
    print("\nCategories:")
    categories = {}
    for record in index.record_types.values():
        cat = record.category
        categories[cat] = categories.get(cat, 0) + 1
    
    for cat, count in sorted(categories.items()):
        print(f"  - {cat}: {count} records")
    
    print(f"\nIndex saved to: {output_path}")


if __name__ == '__main__':
    main()
