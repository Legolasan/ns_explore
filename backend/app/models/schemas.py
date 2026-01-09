"""
Pydantic models for NetSuite SDK Explorer
"""
from typing import Optional, List, Dict, Any
from pydantic import BaseModel, Field


class FieldInfo(BaseModel):
    """Represents a field in a NetSuite record type"""
    name: str
    java_type: str
    simple_type: str  # Simplified type (String, Number, Boolean, RecordRef, Enum, List, Date, Custom)
    is_list: bool = False
    is_record_ref: bool = False
    ref_type: Optional[str] = None  # For RecordRef fields, the referenced record type
    is_enum: bool = False
    enum_values: Optional[List[str]] = None
    description: Optional[str] = None


class RecordTypeInfo(BaseModel):
    """Represents a NetSuite record type"""
    name: str  # e.g., "customer"
    class_name: str  # e.g., "Customer"
    package: str  # e.g., "lists.relationships"
    full_class_path: str  # e.g., "com.netsuite.suitetalk.proxy.v2022_1.lists.relationships.Customer"
    category: str  # e.g., "relationships", "sales", "accounting"
    supported: bool = True
    fields: List[FieldInfo] = []
    field_count: int = 0
    has_search: bool = False
    search_class: Optional[str] = None


class EnumTypeInfo(BaseModel):
    """Represents an enum type in the SDK"""
    name: str
    package: str
    values: List[str]


class SDKIndex(BaseModel):
    """The complete SDK index"""
    version: str = "2022.1"
    record_types: Dict[str, RecordTypeInfo] = {}
    enum_types: Dict[str, EnumTypeInfo] = {}
    record_type_names: List[str] = []  # For quick lookup
    total_records: int = 0
    total_fields: int = 0


class SearchResult(BaseModel):
    """Search result for record types"""
    name: str
    class_name: str
    category: str
    field_count: int
    match_type: str  # "exact", "prefix", "contains"


class FieldSearchResult(BaseModel):
    """Search result for fields across record types"""
    field_name: str
    field_type: str
    record_type: str
    record_class: str


# Live API Models
class NetSuiteCredentials(BaseModel):
    """Customer NetSuite credentials for live API testing"""
    account_id: str = Field(..., description="NetSuite Account ID (e.g., 1234567 or 1234567_SB1)")
    consumer_key: str = Field(..., description="Integration Consumer Key")
    consumer_secret: str = Field(..., description="Integration Consumer Secret")
    token_id: str = Field(..., description="Token ID")
    token_secret: str = Field(..., description="Token Secret")
    soap_endpoint: Optional[str] = Field(
        None, 
        description="Account-specific SOAP endpoint URL (e.g., https://1234567.suitetalk.api.netsuite.com). If not provided, will attempt to auto-detect."
    )


class ConnectionTestResult(BaseModel):
    """Result of connection test"""
    success: bool
    message: str
    server_time: Optional[str] = None
    account_info: Optional[Dict[str, Any]] = None


class GetRecordRequest(BaseModel):
    """Request to get a specific record"""
    credentials: NetSuiteCredentials
    record_type: str
    internal_id: Optional[str] = None
    external_id: Optional[str] = None


class SearchRecordRequest(BaseModel):
    """Request to search records"""
    credentials: NetSuiteCredentials
    record_type: str
    filters: Optional[Dict[str, Any]] = None
    page_size: int = 100


class LiveAPIResponse(BaseModel):
    """Response from live API calls"""
    success: bool
    message: str
    data: Optional[Any] = None
    error_details: Optional[str] = None
