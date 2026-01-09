# NetSuite SDK Explorer

A web-based tool for exploring the NetSuite SuiteTalk SDK (v2022.1) capabilities. Built for Hevo support team to quickly check record type support, browse fields, and test live API calls.

## Features

- **AI Support Assistant**: Natural language queries about SDK support powered by Claude AI
- **Record Type Search**: Check if a record type is supported in the SDK
- **Connector Coverage**: See which records/fields are actively used in the Hevo connector
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

### AI Chat

| Endpoint | Description |
|----------|-------------|
| `GET /api/chat/status` | Check if AI chat is available |
| `POST /api/chat` | Send a message, get AI response |
| `GET /api/chat/session/{id}` | Get conversation history |
| `DELETE /api/chat/session/{id}` | Clear conversation |
| `GET /api/chat/suggestions` | Get suggested questions |

## Deployment (Railway)

This project is configured for Railway deployment:

1. Connect your GitHub repository to Railway
2. Railway will auto-detect the Python project
3. The app uses the `Procfile` for the start command
4. Set environment variables as needed (see below)

### Environment Variables

| Variable | Required | Description |
|----------|----------|-------------|
| `PORT` | No | Server port (Railway sets automatically) |
| `ANTHROPIC_API_KEY` | **Yes** for AI Chat | Your Anthropic Claude API key |
| `DEBUG` | No | Enable debug mode (default: false) |

#### Setting Up Claude AI Chat

To enable the AI-powered support assistant:

1. Get an API key from [Anthropic Console](https://console.anthropic.com/)
2. In Railway dashboard, go to your service → Variables
3. Add `ANTHROPIC_API_KEY` with your API key
4. Redeploy the service

Without this key, the app will work but the AI Chat feature will be disabled.

### Files for Deployment

- `Procfile` - Defines the web process
- `railway.json` - Railway-specific configuration
- `requirements.txt` - Python dependencies
- `runtime.txt` - Python version

## Project Structure

```
netsuite-sdk-explorer/
├── backend/
│   ├── app/
│   │   ├── main.py               # FastAPI application
│   │   ├── api/
│   │   │   ├── records.py        # Record type endpoints
│   │   │   ├── fields.py         # Field search endpoints
│   │   │   ├── live_test.py      # Live API endpoints
│   │   │   └── chat.py           # AI chat endpoints
│   │   ├── core/
│   │   │   └── config.py         # Configuration management
│   │   ├── services/
│   │   │   ├── sdk_parser.py     # Java SDK parser
│   │   │   ├── sdk_indexer.py    # SDK index builder
│   │   │   ├── connector_parser.py # Hevo connector parser
│   │   │   ├── field_indexer.py  # Field reverse index
│   │   │   ├── claude_client.py  # Claude AI integration
│   │   │   └── netsuite_client.py # SOAP client
│   │   └── models/
│   │       └── schemas.py        # Pydantic models
│   └── data/
│       ├── sdk_index_*.json      # SDK indexes (per version)
│       ├── connector_usage.json  # Connector usage data
│       └── field_index.json      # Field reverse index
├── frontend/
│   ├── index.html                # Main explorer UI
│   ├── styles.css                # Explorer styles
│   ├── app.js                    # Explorer logic
│   ├── chat.html                 # AI chat UI
│   ├── chat.css                  # Chat styles
│   └── chat.js                   # Chat logic
├── scripts/
│   └── build_all_indexes.py      # Index generation script
├── sdk/
│   └── 2022.1/                   # SDK source files
├── requirements.txt
├── Procfile
├── railway.json
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
