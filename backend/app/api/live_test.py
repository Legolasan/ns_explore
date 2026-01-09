"""
Live API Testing endpoints for testing against customer NetSuite instances
"""
from typing import Optional
from fastapi import APIRouter, HTTPException

from ..models.schemas import (
    NetSuiteCredentials,
    ConnectionTestResult,
    GetRecordRequest,
    SearchRecordRequest,
    LiveAPIResponse
)
from ..services.netsuite_client import NetSuiteClient

router = APIRouter(prefix="/live", tags=["live-api"])


@router.post("/test-connection", response_model=ConnectionTestResult)
async def test_connection(credentials: NetSuiteCredentials):
    """
    Test connection to a customer's NetSuite instance.
    
    Uses the provided TBA credentials to make a getServerTime call.
    If the account requires account-specific domains, provide the soap_endpoint.
    """
    import traceback
    
    try:
        # Log the attempt (without secrets)
        print(f"Testing connection for account: {credentials.account_id}")
        if credentials.soap_endpoint:
            print(f"Using custom endpoint: {credentials.soap_endpoint}")
        
        client = NetSuiteClient(
            account_id=credentials.account_id,
            consumer_key=credentials.consumer_key,
            consumer_secret=credentials.consumer_secret,
            token_id=credentials.token_id,
            token_secret=credentials.token_secret,
            soap_endpoint=credentials.soap_endpoint
        )
        
        result = client.test_connection()
        return result
        
    except ImportError as e:
        return ConnectionTestResult(
            success=False,
            message=f"Missing dependency: {str(e)}",
            server_time=None,
            account_info=None
        )
    except Exception as e:
        error_detail = traceback.format_exc()
        print(f"Connection test error: {error_detail}")
        return ConnectionTestResult(
            success=False,
            message=f"Connection failed: {str(e)}",
            server_time=None,
            account_info={"error_detail": str(e)[:500]}
        )


@router.post("/get-record", response_model=LiveAPIResponse)
async def get_record(request: GetRecordRequest):
    """
    Fetch a specific record from customer's NetSuite.
    
    Requires either internal_id or external_id.
    """
    if not request.internal_id and not request.external_id:
        raise HTTPException(
            status_code=400,
            detail="Either internal_id or external_id must be provided"
        )
    
    try:
        client = NetSuiteClient(
            account_id=request.credentials.account_id,
            consumer_key=request.credentials.consumer_key,
            consumer_secret=request.credentials.consumer_secret,
            token_id=request.credentials.token_id,
            token_secret=request.credentials.token_secret,
            soap_endpoint=request.credentials.soap_endpoint
        )
        
        result = client.get_record(
            record_type=request.record_type,
            internal_id=request.internal_id,
            external_id=request.external_id
        )
        
        return result
        
    except Exception as e:
        return LiveAPIResponse(
            success=False,
            message=f"Failed to get record: {str(e)}",
            error_details=str(e)
        )


@router.post("/search", response_model=LiveAPIResponse)
async def search_records(request: SearchRecordRequest):
    """
    Search for records in customer's NetSuite.
    
    Performs a basic search with optional filters.
    """
    try:
        client = NetSuiteClient(
            account_id=request.credentials.account_id,
            consumer_key=request.credentials.consumer_key,
            consumer_secret=request.credentials.consumer_secret,
            token_id=request.credentials.token_id,
            token_secret=request.credentials.token_secret,
            soap_endpoint=request.credentials.soap_endpoint
        )
        
        result = client.search_records(
            record_type=request.record_type,
            filters=request.filters,
            page_size=request.page_size
        )
        
        return result
        
    except Exception as e:
        return LiveAPIResponse(
            success=False,
            message=f"Search failed: {str(e)}",
            error_details=str(e)
        )


@router.get("/supported-operations", response_model=dict)
async def get_supported_operations():
    """
    Get list of supported live API operations.
    """
    return {
        "operations": [
            {
                "name": "test-connection",
                "description": "Test connection to NetSuite instance",
                "method": "POST",
                "endpoint": "/api/live/test-connection"
            },
            {
                "name": "get-record",
                "description": "Fetch a specific record by ID",
                "method": "POST",
                "endpoint": "/api/live/get-record"
            },
            {
                "name": "search",
                "description": "Search for records",
                "method": "POST",
                "endpoint": "/api/live/search"
            }
        ],
        "authentication": {
            "type": "TBA (Token-Based Authentication)",
            "required_fields": [
                "account_id",
                "consumer_key",
                "consumer_secret",
                "token_id",
                "token_secret"
            ]
        }
    }
