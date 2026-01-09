#!/usr/bin/env python3
"""Start script for Railway deployment - properly handles PORT env var"""
import os
import sys

def main():
    # Get port from environment variable, default to 8080
    port = os.environ.get("PORT", "8080")
    
    print(f"Starting NetSuite SDK Explorer on port {port}")
    
    # Import and run uvicorn
    import uvicorn
    uvicorn.run(
        "backend.app.main:app",
        host="0.0.0.0",
        port=int(port),
        log_level="info"
    )

if __name__ == "__main__":
    main()
