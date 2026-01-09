# NetSuite SDK Explorer

A web-based tool for exploring the NetSuite SuiteTalk SDK (v2022.1) capabilities. Built for Hevo support team to quickly check record type support, browse fields, and test live API calls.

## Features

- **Record Type Search**: Check if a record type is supported in the SDK
- **Field Explorer**: Browse all fields for any record type with data types
- **Field Search**: Find which record types contain a specific field
- **Live API Testing**: Test get/search operations against customer NetSuite instances

## Quick Stats

- **191 Record Types** indexed
- **7,533 Fields** cataloged
- **180 Enum Types** documented

## Local Development

### Prerequisites

- Python 3.10+
- The NetSuite SDK source files (decompiled JAR)

### Setup

```bash
# Clone the repository
git clone https://github.com/Legolasan/ns_explore.git
cd netsuite-sdk-explorer

# Create virtual environment
python3 -m venv venv
source venv/bin/activate  # On Windows: venv\Scripts\activate

# Install dependencies
pip install -r requirements.txt

# (Optional) Rebuild the SDK index
python scripts/build_index.py --sdk-path ../netsuite-sdk-src

# Run the server
uvicorn backend.app.main:app --reload --port 8000
```

### Access

- Frontend: http://localhost:8000
- API Docs: http://localhost:8000/docs

## API Endpoints

### Record Types

| Endpoint | Description |
|----------|-------------|
| `GET /api/records` | List all record types |
| `GET /api/records/search?q=` | Search record types |
| `GET /api/records/check/{type}` | Check if record type is supported |
| `GET /api/records/{type}` | Get record type details with all fields |
| `GET /api/records/categories` | List all categories |

### Fields

| Endpoint | Description |
|----------|-------------|
| `GET /api/fields/search?q=` | Search fields across all records |
| `GET /api/fields/common` | Get commonly used fields |
| `GET /api/fields/record-refs` | Get all RecordRef fields |

### Live API Testing

| Endpoint | Description |
|----------|-------------|
| `POST /api/live/test-connection` | Test NetSuite credentials |
| `POST /api/live/get-record` | Fetch a specific record |
| `POST /api/live/search` | Search for records |

## Deployment (Railway)

This project is configured for Railway deployment:

1. Connect your GitHub repository to Railway
2. Railway will auto-detect the Python project
3. The app uses the `Procfile` for the start command
4. Set environment variable `PORT` if needed (Railway sets this automatically)

### Files for Deployment

- `Procfile` - Defines the web process
- `railway.json` - Railway-specific configuration
- `nixpacks.toml` - Build configuration
- `requirements.txt` - Python dependencies
- `runtime.txt` - Python version

## Project Structure

```
netsuite-sdk-explorer/
├── backend/
│   ├── app/
│   │   ├── main.py              # FastAPI application
│   │   ├── api/
│   │   │   ├── records.py       # Record type endpoints
│   │   │   ├── fields.py        # Field search endpoints
│   │   │   └── live_test.py     # Live API endpoints
│   │   ├── services/
│   │   │   ├── sdk_parser.py    # Java SDK parser
│   │   │   ├── sdk_indexer.py   # Index builder
│   │   │   └── netsuite_client.py # SOAP client
│   │   └── models/
│   │       └── schemas.py       # Pydantic models
│   └── data/
│       └── sdk_index.json       # Pre-built SDK index
├── frontend/
│   ├── index.html
│   ├── styles.css
│   └── app.js
├── scripts/
│   └── build_index.py           # Index generation script
├── requirements.txt
├── Procfile
└── README.md
```

## Authentication for Live API

The live API testing feature uses NetSuite TBA (Token-Based Authentication):

1. **Account ID**: Your NetSuite account ID (e.g., `1234567` or `1234567_SB1` for sandbox)
2. **Consumer Key/Secret**: From your NetSuite Integration record
3. **Token ID/Secret**: From your Access Token

**Note**: Credentials are never stored - they're only used for the duration of the API call.

## Rebuilding the SDK Index

If you have updated SDK source files:

```bash
python scripts/build_index.py \
    --sdk-path /path/to/netsuite-sdk-src \
    --output backend/data/sdk_index.json
```

## Tech Stack

- **Backend**: Python 3.11, FastAPI, Pydantic
- **Frontend**: Vanilla HTML/CSS/JavaScript
- **SDK Parsing**: Custom Java parser
- **Live API**: zeep (SOAP client)

## License

Internal tool for Hevo Data.
