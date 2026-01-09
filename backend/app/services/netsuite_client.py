"""
NetSuite SOAP Client for live API testing
Uses zeep library to make SOAP calls with TBA authentication
"""
import hashlib
import hmac
import time
import base64
import random
import string
from typing import Optional, Dict, Any
from datetime import datetime

try:
    from zeep import Client, Settings
    from zeep.transports import Transport
    from zeep.plugins import HistoryPlugin
    from requests import Session
    ZEEP_AVAILABLE = True
except ImportError:
    ZEEP_AVAILABLE = False

from ..models.schemas import ConnectionTestResult, LiveAPIResponse


class NetSuiteClient:
    """
    NetSuite SOAP client with TBA authentication
    """
    
    # Default WSDL URL template (may not work for all accounts)
    WSDL_URL_TEMPLATE = "https://{account_id}.suitetalk.api.netsuite.com/wsdl/v2022_1_0/netsuite.wsdl"
    
    # Data center discovery endpoint
    DATACENTER_URLS_ENDPOINT = "https://rest.netsuite.com/rest/datacenterurls?account={account_id}"
    
    def __init__(
        self,
        account_id: str,
        consumer_key: str,
        consumer_secret: str,
        token_id: str,
        token_secret: str,
        soap_endpoint: Optional[str] = None
    ):
        """
        Initialize NetSuite client with TBA credentials.
        
        Args:
            account_id: NetSuite account ID (e.g., "1234567" or "1234567_SB1" for sandbox)
            consumer_key: Integration consumer key
            consumer_secret: Integration consumer secret
            token_id: Token ID
            token_secret: Token secret
            soap_endpoint: Optional custom SOAP endpoint URL (e.g., "https://1234567.suitetalk.api.netsuite.com")
        """
        self.account_id = account_id.replace("_", "-").upper()
        self.consumer_key = consumer_key
        self.consumer_secret = consumer_secret
        self.token_id = token_id
        self.token_secret = token_secret
        self.soap_endpoint = soap_endpoint
        
        self._client = None
        self._history = None
        self._discovered_endpoint = None
        
    def _get_wsdl_url(self) -> str:
        """Get the WSDL URL for this account"""
        # If custom endpoint provided, use it
        if self.soap_endpoint:
            endpoint = self.soap_endpoint.rstrip('/')
            return f"{endpoint}/wsdl/v2022_1_0/netsuite.wsdl"
        
        # If we've discovered an endpoint, use it
        if self._discovered_endpoint:
            return f"{self._discovered_endpoint}/wsdl/v2022_1_0/netsuite.wsdl"
        
        # Try to discover the data center URL
        discovered = self._discover_datacenter_url()
        if discovered:
            self._discovered_endpoint = discovered
            return f"{discovered}/wsdl/v2022_1_0/netsuite.wsdl"
        
        # Fall back to default template
        account_url = self.account_id.lower().replace("_", "-")
        return f"https://{account_url}.suitetalk.api.netsuite.com/wsdl/v2022_1_0/netsuite.wsdl"
    
    def _discover_datacenter_url(self) -> Optional[str]:
        """
        Discover the account-specific data center URL using NetSuite's REST endpoint.
        
        Returns the webservices URL if found, None otherwise.
        """
        try:
            from requests import get as requests_get
            
            # Clean account ID for the API call
            account_for_api = self.account_id.replace("-", "_").upper()
            url = self.DATACENTER_URLS_ENDPOINT.format(account_id=account_for_api)
            
            response = requests_get(url, timeout=10)
            if response.status_code == 200:
                data = response.json()
                # The response contains various URLs, we need webservicesDomain
                if 'webservicesDomain' in data:
                    return data['webservicesDomain']
                # Also try suitetalkDomain for newer API
                if 'dataCenterUrls' in data and 'suitetalkDomain' in data['dataCenterUrls']:
                    return data['dataCenterUrls']['suitetalkDomain']
        except Exception as e:
            # Log but don't fail - will fall back to default
            print(f"Data center discovery failed: {e}")
        
        return None
    
    def _generate_nonce(self, length: int = 20) -> str:
        """Generate a random nonce"""
        chars = string.ascii_letters + string.digits
        return ''.join(random.choice(chars) for _ in range(length))
    
    def _generate_signature(self, nonce: str, timestamp: int) -> str:
        """
        Generate HMAC-SHA256 signature for TBA.
        
        The base string format is: account&consumerKey&token&nonce&timestamp
        """
        # Create the base string
        base_string = "&".join([
            self.account_id,
            self.consumer_key,
            self.token_id,
            nonce,
            str(timestamp)
        ])
        
        # Create the signing key
        key = "&".join([self.consumer_secret, self.token_secret])
        
        # Generate HMAC-SHA256 signature
        signature = hmac.new(
            key.encode('utf-8'),
            base_string.encode('utf-8'),
            hashlib.sha256
        ).digest()
        
        # Base64 encode
        return base64.b64encode(signature).decode('utf-8')
    
    def _get_token_passport(self) -> Dict[str, Any]:
        """Generate token passport for SOAP header"""
        nonce = self._generate_nonce()
        timestamp = int(time.time())
        signature = self._generate_signature(nonce, timestamp)
        
        return {
            "account": self.account_id,
            "consumerKey": self.consumer_key,
            "token": self.token_id,
            "nonce": nonce,
            "timestamp": timestamp,
            "signature": {
                "algorithm": "HMAC-SHA256",
                "_value_1": signature
            }
        }
    
    def _get_service_url(self) -> str:
        """Get the SOAP service endpoint URL (where requests are sent)"""
        if self.soap_endpoint:
            endpoint = self.soap_endpoint.rstrip('/')
            return f"{endpoint}/services/NetSuitePort_2022_1"
        
        if self._discovered_endpoint:
            return f"{self._discovered_endpoint}/services/NetSuitePort_2022_1"
        
        # Fall back to default
        account_url = self.account_id.lower().replace("_", "-")
        return f"https://{account_url}.suitetalk.api.netsuite.com/services/NetSuitePort_2022_1"
    
    def _get_client(self):
        """Get or create the SOAP client"""
        if not ZEEP_AVAILABLE:
            raise ImportError(
                "zeep library is required for live API testing. "
                "Install with: pip install zeep"
            )
        
        if self._client is None:
            try:
                self._history = HistoryPlugin()
                session = Session()
                # Increase timeout for WSDL download (can be slow)
                transport = Transport(session=session, timeout=120, operation_timeout=60)
                settings = Settings(strict=False, xml_huge_tree=True)
                
                wsdl_url = self._get_wsdl_url()
                print(f"Loading WSDL from: {wsdl_url}")
                
                self._client = Client(
                    wsdl_url,
                    transport=transport,
                    settings=settings,
                    plugins=[self._history]
                )
                print("WSDL loaded successfully")
                
                # CRITICAL: Override the service address with account-specific endpoint
                # The WSDL contains a generic endpoint that won't work for accounts
                # requiring account-specific domains
                service_url = self._get_service_url()
                print(f"Using service endpoint: {service_url}")
                
                # Create a new service binding with the correct endpoint
                self._client.service._binding_options['address'] = service_url
                
            except Exception as e:
                print(f"Failed to create SOAP client: {e}")
                raise
        
        return self._client
    
    def test_connection(self) -> ConnectionTestResult:
        """
        Test connection by calling getServerTime.
        """
        if not ZEEP_AVAILABLE:
            return ConnectionTestResult(
                success=False,
                message="zeep library not installed. Live API testing unavailable.",
                server_time=None,
                account_info=None
            )
        
        try:
            client = self._get_client()
            service = client.service
            
            # Create token passport
            token_passport = self._get_token_passport()
            
            # Call getServerTime with token passport header
            with client.settings(extra_http_headers={}):
                # Get the header type
                TokenPassport = client.get_type('ns0:TokenPassport')
                TokenPassportSignature = client.get_type('ns0:TokenPassportSignature')
                
                signature = TokenPassportSignature(
                    algorithm="HMAC-SHA256",
                    _value_1=token_passport["signature"]["_value_1"]
                )
                
                passport = TokenPassport(
                    account=token_passport["account"],
                    consumerKey=token_passport["consumerKey"],
                    token=token_passport["token"],
                    nonce=token_passport["nonce"],
                    timestamp=token_passport["timestamp"],
                    signature=signature
                )
                
                # Make the call
                response = service.getServerTime(_soapheaders={"tokenPassport": passport})
                
                if hasattr(response, 'status') and response.status.isSuccess:
                    server_time = str(response.serverTime) if hasattr(response, 'serverTime') else None
                    return ConnectionTestResult(
                        success=True,
                        message="Connection successful!",
                        server_time=server_time,
                        account_info={"account_id": self.account_id}
                    )
                else:
                    return ConnectionTestResult(
                        success=False,
                        message="Connection failed - check credentials",
                        server_time=None,
                        account_info=None
                    )
                    
        except Exception as e:
            return ConnectionTestResult(
                success=False,
                message=f"Connection error: {str(e)}",
                server_time=None,
                account_info=None
            )
    
    def get_record(
        self,
        record_type: str,
        internal_id: Optional[str] = None,
        external_id: Optional[str] = None
    ) -> LiveAPIResponse:
        """
        Get a specific record by ID.
        """
        if not ZEEP_AVAILABLE:
            return LiveAPIResponse(
                success=False,
                message="zeep library not installed",
                error_details="Install zeep: pip install zeep"
            )
        
        try:
            client = self._get_client()
            
            # Create record reference
            RecordRef = client.get_type('ns0:RecordRef')
            
            ref_params = {"type": record_type}
            if internal_id:
                ref_params["internalId"] = internal_id
            if external_id:
                ref_params["externalId"] = external_id
            
            record_ref = RecordRef(**ref_params)
            
            # Create token passport
            token_passport = self._get_token_passport()
            TokenPassport = client.get_type('ns0:TokenPassport')
            TokenPassportSignature = client.get_type('ns0:TokenPassportSignature')
            
            signature = TokenPassportSignature(
                algorithm="HMAC-SHA256",
                _value_1=token_passport["signature"]["_value_1"]
            )
            
            passport = TokenPassport(
                account=token_passport["account"],
                consumerKey=token_passport["consumerKey"],
                token=token_passport["token"],
                nonce=token_passport["nonce"],
                timestamp=token_passport["timestamp"],
                signature=signature
            )
            
            # Make the call
            response = client.service.get(
                record_ref,
                _soapheaders={"tokenPassport": passport}
            )
            
            if hasattr(response, 'status') and response.status.isSuccess:
                # Convert response to dict
                record_data = self._serialize_response(response.record)
                return LiveAPIResponse(
                    success=True,
                    message=f"Successfully retrieved {record_type}",
                    data=record_data
                )
            else:
                error_msg = "Unknown error"
                if hasattr(response, 'status') and hasattr(response.status, 'statusDetail'):
                    details = response.status.statusDetail
                    if details:
                        error_msg = str(details[0].message if hasattr(details[0], 'message') else details)
                
                return LiveAPIResponse(
                    success=False,
                    message=f"Failed to get record: {error_msg}",
                    error_details=error_msg
                )
                
        except Exception as e:
            return LiveAPIResponse(
                success=False,
                message=f"Error getting record: {str(e)}",
                error_details=str(e)
            )
    
    def search_records(
        self,
        record_type: str,
        filters: Optional[Dict[str, Any]] = None,
        page_size: int = 100
    ) -> LiveAPIResponse:
        """
        Search for records of a given type.
        """
        if not ZEEP_AVAILABLE:
            return LiveAPIResponse(
                success=False,
                message="zeep library not installed",
                error_details="Install zeep: pip install zeep"
            )
        
        try:
            client = self._get_client()
            
            # Map record type to search type
            search_type_name = record_type[0].upper() + record_type[1:] + "SearchBasic"
            
            # Try to get the search type
            try:
                SearchType = client.get_type(f'ns5:{search_type_name}')
                search = SearchType()
            except:
                # Fall back to TransactionSearchBasic for transactions
                try:
                    SearchType = client.get_type('ns5:TransactionSearchBasic')
                    search = SearchType()
                except:
                    return LiveAPIResponse(
                        success=False,
                        message=f"Search type not found for {record_type}",
                        error_details=f"Could not find {search_type_name}"
                    )
            
            # Create token passport
            token_passport = self._get_token_passport()
            TokenPassport = client.get_type('ns0:TokenPassport')
            TokenPassportSignature = client.get_type('ns0:TokenPassportSignature')
            
            signature = TokenPassportSignature(
                algorithm="HMAC-SHA256",
                _value_1=token_passport["signature"]["_value_1"]
            )
            
            passport = TokenPassport(
                account=token_passport["account"],
                consumerKey=token_passport["consumerKey"],
                token=token_passport["token"],
                nonce=token_passport["nonce"],
                timestamp=token_passport["timestamp"],
                signature=signature
            )
            
            # Create search preferences
            SearchPreferences = client.get_type('ns4:SearchPreferences')
            prefs = SearchPreferences(
                pageSize=page_size,
                bodyFieldsOnly=False
            )
            
            # Make the call
            response = client.service.search(
                search,
                _soapheaders={
                    "tokenPassport": passport,
                    "searchPreferences": prefs
                }
            )
            
            if hasattr(response, 'status') and response.status.isSuccess:
                # Extract records
                records = []
                if hasattr(response, 'recordList') and response.recordList:
                    for record in response.recordList.record:
                        records.append(self._serialize_response(record))
                
                return LiveAPIResponse(
                    success=True,
                    message=f"Found {response.totalRecords} records",
                    data={
                        "total_records": response.totalRecords,
                        "page_size": page_size,
                        "total_pages": response.totalPages,
                        "records": records[:10]  # Limit to first 10 for preview
                    }
                )
            else:
                error_msg = "Search failed"
                if hasattr(response, 'status') and hasattr(response.status, 'statusDetail'):
                    details = response.status.statusDetail
                    if details:
                        error_msg = str(details[0].message if hasattr(details[0], 'message') else details)
                
                return LiveAPIResponse(
                    success=False,
                    message=error_msg,
                    error_details=error_msg
                )
                
        except Exception as e:
            return LiveAPIResponse(
                success=False,
                message=f"Search error: {str(e)}",
                error_details=str(e)
            )
    
    def _serialize_response(self, obj, max_depth: int = 3, current_depth: int = 0) -> Any:
        """
        Serialize a SOAP response object to a dict.
        """
        if current_depth >= max_depth:
            return str(obj)
        
        if obj is None:
            return None
        
        if isinstance(obj, (str, int, float, bool)):
            return obj
        
        if isinstance(obj, datetime):
            return obj.isoformat()
        
        if isinstance(obj, list):
            return [self._serialize_response(item, max_depth, current_depth + 1) for item in obj[:20]]
        
        if hasattr(obj, '__dict__'):
            result = {}
            for key, value in obj.__dict__.items():
                if not key.startswith('_'):
                    result[key] = self._serialize_response(value, max_depth, current_depth + 1)
            return result
        
        return str(obj)
