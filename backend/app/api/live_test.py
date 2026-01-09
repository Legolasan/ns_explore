"""
Live API Testing endpoints for testing against customer NetSuite instances

Sensitive credentials (consumer_secret, token_secret) are encrypted client-side
before transmission to prevent them from appearing in plain text in browser
network inspection tools.
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
from ..services.encryption import get_encryption_service

router = APIRouter(prefix="/live", tags=["live-api"])


def decrypt_credentials(credentials: NetSuiteCredentials) -> NetSuiteCredentials:
    """Decrypt sensitive fields in credentials if they are encrypted."""
    encryption = get_encryption_service()
    decrypted = encryption.decrypt_credentials(credentials.model_dump())
    return NetSuiteCredentials(**decrypted)


@router.get("/encryption-key")
async def get_encryption_key():
    """
    Get the encryption key for client-side credential encryption.
    
    Returns a key that the client uses to encrypt sensitive fields
    (consumer_secret, token_secret) before sending them.
    """
    encryption = get_encryption_service()
    return {
        "key": encryption.client_key,
        "key_id": encryption.key_id,
        "algorithm": "xor-base64",
        "sensitive_fields": ["consumer_secret", "token_secret"]
    }


@router.get("/health")
async def health_check():
    """
    Quick health check for the Live API service.
    Returns info about SOAP client availability.
    """
    from ..services.netsuite_client import ZEEP_AVAILABLE
    return {
        "status": "ok",
        "zeep_available": ZEEP_AVAILABLE,
        "message": "Live API service is running" if ZEEP_AVAILABLE else "zeep library not available - live testing disabled"
    }


@router.post("/test-connection", response_model=ConnectionTestResult)
async def test_connection(credentials: NetSuiteCredentials):
    """
    Test connection to a customer's NetSuite instance.
    
    Uses the provided TBA credentials to make a getServerTime call.
    If the account requires account-specific domains, provide the soap_endpoint.
    
    Sensitive fields (consumer_secret, token_secret) should be encrypted
    client-side using the key from /encryption-key endpoint.
    """
    import traceback
    
    try:
        # Decrypt credentials if encrypted
        decrypted_creds = decrypt_credentials(credentials)
        
        # Log the attempt (without secrets)
        print(f"Testing connection for account: {decrypted_creds.account_id}")
        if decrypted_creds.soap_endpoint:
            print(f"Using custom endpoint: {decrypted_creds.soap_endpoint}")
        
        client = NetSuiteClient(
            account_id=decrypted_creds.account_id,
            consumer_key=decrypted_creds.consumer_key,
            consumer_secret=decrypted_creds.consumer_secret,
            token_id=decrypted_creds.token_id,
            token_secret=decrypted_creds.token_secret,
            soap_endpoint=decrypted_creds.soap_endpoint
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
    Sensitive fields should be encrypted client-side.
    """
    if not request.internal_id and not request.external_id:
        raise HTTPException(
            status_code=400,
            detail="Either internal_id or external_id must be provided"
        )
    
    try:
        # Decrypt credentials if encrypted
        decrypted_creds = decrypt_credentials(request.credentials)
        
        client = NetSuiteClient(
            account_id=decrypted_creds.account_id,
            consumer_key=decrypted_creds.consumer_key,
            consumer_secret=decrypted_creds.consumer_secret,
            token_id=decrypted_creds.token_id,
            token_secret=decrypted_creds.token_secret,
            soap_endpoint=decrypted_creds.soap_endpoint
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
    Sensitive fields should be encrypted client-side.
    """
    try:
        # Decrypt credentials if encrypted
        decrypted_creds = decrypt_credentials(request.credentials)
        
        client = NetSuiteClient(
            account_id=decrypted_creds.account_id,
            consumer_key=decrypted_creds.consumer_key,
            consumer_secret=decrypted_creds.consumer_secret,
            token_id=decrypted_creds.token_id,
            token_secret=decrypted_creds.token_secret,
            soap_endpoint=decrypted_creds.soap_endpoint
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
