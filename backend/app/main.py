"""
NetSuite SDK Explorer - FastAPI Application

A web-based tool for exploring the NetSuite SDK capabilities,
checking record type support, browsing fields, and testing live API calls.
"""
import os
from contextlib import asynccontextmanager
from pathlib import Path
from typing import Dict, List, Optional
from fastapi import FastAPI, Query
from fastapi.middleware.cors import CORSMiddleware
from fastapi.staticfiles import StaticFiles
from fastapi.responses import FileResponse, JSONResponse

from .api import records, fields, live_test
from .services.sdk_indexer import SDKIndexer, MultiVersionIndexer


# Determine paths - handle both local and Docker environments
def get_paths():
    """Get paths that work in both local and Docker environments"""
    # Try to find the app root directory
    current_file = Path(__file__).resolve()
    
    # backend/app/main.py -> backend/app -> backend -> project_root
    app_dir = current_file.parent  # backend/app
    backend_dir = app_dir.parent   # backend
    project_root = backend_dir.parent  # project root (netsuite-sdk-explorer)
    
    # If running in Docker/Railway, /app is the project root
    docker_root = Path("/app")
    if docker_root.exists() and (docker_root / "backend").exists():
        project_root = docker_root
        backend_dir = docker_root / "backend"
    
    data_dir = backend_dir / "data"
    frontend_dir = project_root / "frontend"
    sdk_dir = project_root / "sdk"
    
    return {
        "project_root": project_root,
        "backend_dir": backend_dir,
        "data_dir": data_dir,
        "frontend_dir": frontend_dir,
        "sdk_dir": sdk_dir,
    }


PATHS = get_paths()

print(f"=== Path Configuration ===")
print(f"Project root: {PATHS['project_root']}")
print(f"Backend dir: {PATHS['backend_dir']}")
print(f"Data dir: {PATHS['data_dir']}")
print(f"Frontend dir: {PATHS['frontend_dir']}")
print(f"SDK dir: {PATHS['sdk_dir']}")
print("==========================")

# Global multi-version indexer
_multi_indexer: Optional[MultiVersionIndexer] = None


def get_multi_indexer() -> MultiVersionIndexer:
    """Get the multi-version indexer"""
    global _multi_indexer
    if _multi_indexer is None:
        raise RuntimeError("Multi-version indexer not initialized")
    return _multi_indexer


@asynccontextmanager
async def lifespan(app: FastAPI):
    """Application lifespan - load SDK indexes on startup"""
    global _multi_indexer
    
    data_dir = PATHS["data_dir"]
    sdk_dir = PATHS["sdk_dir"]
    
    print(f"Loading SDK indexes from: {data_dir}")
    
    # Initialize multi-version indexer
    _multi_indexer = MultiVersionIndexer(
        sdk_base_path=str(sdk_dir),
        data_path=str(data_dir)
    )
    
    # Load all available indexes
    indexers = _multi_indexer.load_all_indexes()
    versions = _multi_indexer.get_versions()
    
    if versions:
        print(f"Loaded SDK versions: {', '.join(versions)}")
        # Set default version for backward compatibility
        default_version = _multi_indexer.get_default_version()
        if default_version:
            default_indexer = _multi_indexer.get_indexer(default_version)
            if default_indexer:
                records.set_indexer(default_indexer)
                print(f"Default version: {default_version}")
    else:
        print("WARNING: No SDK indexes found!")
        print("Run: python scripts/build_all_indexes.py to generate indexes")
    
    yield
    
    # Cleanup on shutdown
    print("Shutting down...")


# Create FastAPI app
app = FastAPI(
    title="NetSuite SDK Explorer",
    description="""
    A web-based tool for Hevo support team to explore the NetSuite SDK.
    
    ## Features
    
    - **Multi-Version Support**: Switch between different SDK versions
    - **Record Type Search**: Check if a record type is supported
    - **Field Explorer**: Browse all fields for any record type
    - **Live API Testing**: Test against customer NetSuite instances
    
    ## SDK Versions
    
    The API supports multiple SDK versions. Use the `version` query parameter
    to specify which version to query (defaults to the latest version).
    
    ## Authentication for Live API
    
    Live API testing requires NetSuite TBA (Token-Based Authentication):
    - Account ID
    - Consumer Key & Secret
    - Token ID & Secret
    """,
    version="2.0.0",
    lifespan=lifespan
)

# CORS middleware for frontend
app.add_middleware(
    CORSMiddleware,
    allow_origins=["*"],  # Configure appropriately for production
    allow_credentials=True,
    allow_methods=["*"],
    allow_headers=["*"],
)

# Include API routers
app.include_router(records.router, prefix="/api")
app.include_router(fields.router, prefix="/api")
app.include_router(live_test.router, prefix="/api")


# Version management endpoints
@app.get("/api/versions", response_model=dict)
async def list_versions():
    """
    List all available SDK versions.
    
    Returns available versions and the default (latest) version.
    """
    multi_indexer = get_multi_indexer()
    versions = multi_indexer.get_versions()
    default = multi_indexer.get_default_version()
    
    version_info = []
    for v in versions:
        indexer = multi_indexer.get_indexer(v)
        if indexer:
            index = indexer.get_index()
            version_info.append({
                "version": v,
                "record_count": index.total_records,
                "field_count": index.total_fields,
                "enum_count": len(index.enum_types),
            })
    
    return {
        "versions": versions,
        "default": default,
        "details": version_info,
    }


# Root endpoint
@app.get("/api")
async def api_root():
    """API root - returns available endpoints"""
    multi_indexer = get_multi_indexer()
    versions = multi_indexer.get_versions()
    
    return {
        "message": "NetSuite SDK Explorer API",
        "version": "2.0.0",
        "sdk_versions": versions,
        "endpoints": {
            "versions": "/api/versions",
            "records": "/api/records",
            "fields": "/api/fields",
            "live": "/api/live",
            "docs": "/docs"
        }
    }


@app.get("/api/stats")
async def get_stats(
    version: Optional[str] = Query(None, description="SDK version (defaults to latest)")
):
    """Get SDK statistics for a specific version"""
    try:
        multi_indexer = get_multi_indexer()
        
        # Use specified version or default
        target_version = version or multi_indexer.get_default_version()
        if not target_version:
            return JSONResponse(
                status_code=503,
                content={"error": "No SDK versions available"}
            )
        
        indexer = multi_indexer.get_indexer(target_version)
        if indexer is None:
            return JSONResponse(
                status_code=404,
                content={"error": f"SDK version {target_version} not found"}
            )
        
        index = indexer.get_index()
        
        return {
            "sdk_version": index.version,
            "total_record_types": index.total_records,
            "total_fields": index.total_fields,
            "total_enum_types": len(index.enum_types),
            "categories": indexer.get_all_categories(),
            "available_versions": multi_indexer.get_versions(),
        }
    except Exception as e:
        return JSONResponse(
            status_code=500,
            content={"error": str(e)}
        )


# Helper function for API endpoints to get versioned indexer
def get_versioned_indexer(version: Optional[str] = None) -> SDKIndexer:
    """Get indexer for specified version or default"""
    multi_indexer = get_multi_indexer()
    target_version = version or multi_indexer.get_default_version()
    
    if not target_version:
        raise ValueError("No SDK versions available")
    
    indexer = multi_indexer.get_indexer(target_version)
    if indexer is None:
        raise ValueError(f"SDK version {target_version} not found")
    
    return indexer


# Make helper available to other modules
records.get_versioned_indexer = get_versioned_indexer
fields.get_versioned_indexer = get_versioned_indexer


# Serve frontend static files
@app.get("/")
async def serve_frontend():
    """Serve the frontend application"""
    frontend_dir = PATHS["frontend_dir"]
    index_path = frontend_dir / "index.html"
    
    if index_path.exists():
        return FileResponse(str(index_path))
    
    return JSONResponse(
        content={
            "message": "NetSuite SDK Explorer API",
            "api_docs": "/docs",
            "debug": {
                "frontend_dir": str(frontend_dir),
                "frontend_exists": frontend_dir.exists(),
                "index_html_exists": index_path.exists(),
            }
        }
    )


@app.get("/styles.css")
async def serve_styles():
    """Serve CSS file"""
    css_path = PATHS["frontend_dir"] / "styles.css"
    if css_path.exists():
        return FileResponse(str(css_path), media_type="text/css")
    return JSONResponse(status_code=404, content={"error": "CSS not found", "path": str(css_path)})


@app.get("/app.js")
async def serve_js():
    """Serve JavaScript file"""
    js_path = PATHS["frontend_dir"] / "app.js"
    if js_path.exists():
        return FileResponse(str(js_path), media_type="application/javascript")
    return JSONResponse(status_code=404, content={"error": "JS not found", "path": str(js_path)})


# Health check for Railway deployment
@app.get("/health")
async def health_check():
    """Health check endpoint for deployment platforms"""
    multi_indexer = get_multi_indexer()
    versions = multi_indexer.get_versions()
    
    return {
        "status": "healthy",
        "service": "netsuite-sdk-explorer",
        "sdk_versions_loaded": len(versions),
        "versions": versions,
    }


# Debug endpoint to check paths
@app.get("/debug/paths")
async def debug_paths():
    """Debug endpoint to check path configuration"""
    frontend_dir = PATHS["frontend_dir"]
    data_dir = PATHS["data_dir"]
    sdk_dir = PATHS["sdk_dir"]
    
    frontend_files = []
    if frontend_dir.exists():
        frontend_files = [f.name for f in frontend_dir.iterdir()]
    
    data_files = []
    if data_dir.exists():
        data_files = [f.name for f in data_dir.iterdir()]
    
    sdk_versions = []
    if sdk_dir.exists():
        sdk_versions = [f.name for f in sdk_dir.iterdir() if f.is_dir()]
    
    return {
        "paths": {k: str(v) for k, v in PATHS.items()},
        "frontend_exists": frontend_dir.exists(),
        "frontend_files": frontend_files,
        "data_exists": data_dir.exists(),
        "data_files": data_files,
        "sdk_exists": sdk_dir.exists(),
        "sdk_versions": sdk_versions,
        "cwd": os.getcwd(),
    }


if __name__ == "__main__":
    import uvicorn
    port = int(os.environ.get("PORT", 8000))
    uvicorn.run("backend.app.main:app", host="0.0.0.0", port=port, reload=True)
