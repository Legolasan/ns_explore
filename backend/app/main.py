"""
NetSuite SDK Explorer - FastAPI Application

A web-based tool for exploring the NetSuite SDK capabilities,
checking record type support, browsing fields, and testing live API calls.
"""
import os
from contextlib import asynccontextmanager
from pathlib import Path
from fastapi import FastAPI
from fastapi.middleware.cors import CORSMiddleware
from fastapi.staticfiles import StaticFiles
from fastapi.responses import FileResponse, JSONResponse

from .api import records, fields, live_test
from .services.sdk_indexer import SDKIndexer


# Determine paths - handle both local and Docker environments
def get_paths():
    """Get paths that work in both local and Docker environments"""
    # Try to find the app root directory
    current_file = Path(__file__).resolve()
    
    # backend/app/main.py -> backend/app -> backend -> project_root
    app_dir = current_file.parent  # backend/app
    backend_dir = app_dir.parent   # backend
    project_root = backend_dir.parent  # project root (netsuite-sdk-explorer)
    
    # If running in Docker, /app is the project root
    docker_root = Path("/app")
    if docker_root.exists() and (docker_root / "backend").exists():
        project_root = docker_root
        backend_dir = docker_root / "backend"
    
    data_dir = backend_dir / "data"
    frontend_dir = project_root / "frontend"
    index_path = data_dir / "sdk_index.json"
    
    return {
        "project_root": project_root,
        "backend_dir": backend_dir,
        "data_dir": data_dir,
        "frontend_dir": frontend_dir,
        "index_path": index_path,
    }


PATHS = get_paths()

print(f"=== Path Configuration ===")
print(f"Project root: {PATHS['project_root']}")
print(f"Backend dir: {PATHS['backend_dir']}")
print(f"Data dir: {PATHS['data_dir']}")
print(f"Frontend dir: {PATHS['frontend_dir']}")
print(f"Index path: {PATHS['index_path']}")
print(f"Index exists: {PATHS['index_path'].exists()}")
print(f"Frontend exists: {PATHS['frontend_dir'].exists()}")
print("==========================")


@asynccontextmanager
async def lifespan(app: FastAPI):
    """Application lifespan - load SDK index on startup"""
    index_path = PATHS["index_path"]
    print(f"Loading SDK index from: {index_path}")
    
    if index_path.exists():
        indexer = SDKIndexer(sdk_path="", index_path=str(index_path))
        indexer.load_index()
        records.set_indexer(indexer)
        print(f"SDK index loaded: {indexer.get_index().total_records} record types")
    else:
        print(f"WARNING: SDK index not found at {index_path}")
        print("Run: python scripts/build_index.py to generate the index")
    
    yield
    
    # Cleanup on shutdown
    print("Shutting down...")


# Create FastAPI app
app = FastAPI(
    title="NetSuite SDK Explorer",
    description="""
    A web-based tool for Hevo support team to explore the NetSuite SDK.
    
    ## Features
    
    - **Record Type Search**: Check if a record type is supported
    - **Field Explorer**: Browse all fields for any record type
    - **Live API Testing**: Test against customer NetSuite instances
    
    ## Authentication for Live API
    
    Live API testing requires NetSuite TBA (Token-Based Authentication):
    - Account ID
    - Consumer Key & Secret
    - Token ID & Secret
    """,
    version="1.0.0",
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


# Root endpoint
@app.get("/api")
async def api_root():
    """API root - returns available endpoints"""
    return {
        "message": "NetSuite SDK Explorer API",
        "version": "1.0.0",
        "endpoints": {
            "records": "/api/records",
            "fields": "/api/fields",
            "live": "/api/live",
            "docs": "/docs"
        }
    }


@app.get("/api/stats")
async def get_stats():
    """Get SDK statistics"""
    try:
        indexer = records.get_indexer()
        if indexer is None:
            return JSONResponse(
                status_code=503,
                content={"error": "SDK index not loaded"}
            )
        index = indexer.get_index()
        
        return {
            "sdk_version": index.version,
            "total_record_types": index.total_records,
            "total_fields": index.total_fields,
            "total_enum_types": len(index.enum_types),
            "categories": indexer.get_all_categories()
        }
    except Exception as e:
        return JSONResponse(
            status_code=500,
            content={"error": str(e)}
        )


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
    return {"status": "healthy", "service": "netsuite-sdk-explorer"}


# Debug endpoint to check paths
@app.get("/debug/paths")
async def debug_paths():
    """Debug endpoint to check path configuration"""
    frontend_dir = PATHS["frontend_dir"]
    data_dir = PATHS["data_dir"]
    
    frontend_files = []
    if frontend_dir.exists():
        frontend_files = [f.name for f in frontend_dir.iterdir()]
    
    data_files = []
    if data_dir.exists():
        data_files = [f.name for f in data_dir.iterdir()]
    
    return {
        "paths": {k: str(v) for k, v in PATHS.items()},
        "frontend_exists": frontend_dir.exists(),
        "frontend_files": frontend_files,
        "data_exists": data_dir.exists(),
        "data_files": data_files,
        "index_exists": PATHS["index_path"].exists(),
        "cwd": os.getcwd(),
    }


if __name__ == "__main__":
    import uvicorn
    port = int(os.environ.get("PORT", 8000))
    uvicorn.run("backend.app.main:app", host="0.0.0.0", port=port, reload=True)
