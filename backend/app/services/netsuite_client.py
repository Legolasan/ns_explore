"""
NetSuite SOAP Client for live API testing
Uses zeep library to make SOAP calls with TBA authentication

Signature generation matches the NetSuite SDK's TbaUtils.java implementation.
"""
import hashlib
import hmac
import time
import base64
import random
import string
import urllib.parse
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
    NetSuite SOAP client with TBA authentication.
    
    Signature generation follows the NetSuite SDK TbaUtils.java implementation exactly:
    - Base string: URL-encoded account&consumerKey&token&nonce&timestamp
    - Key: percentEncode(consumerSecret)&percentEncode(tokenSecret)
    - Signature: HMAC-SHA256, Base64 encoded
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
        # Store ORIGINAL account ID for signature (NetSuite SDK uses it as-is)
        self.account_id = account_id
        
        # For URL construction, convert to lowercase and replace underscores with dashes
        self.account_id_for_url = account_id.lower().replace("_", "-")
        
        self.consumer_key = consumer_key
        self.consumer_secret = consumer_secret
        self.token_id = token_id
        self.token_secret = token_secret
        self.soap_endpoint = soap_endpoint
        
        self._client = None
        self._history = None
        self._discovered_endpoint = None
        
    def _percent_encode(self, s: str) -> str:
        """
        Percent encode a string exactly like NetSuite SDK's TbaUtils.percentEncode().
        
        URLEncoder.encode() with UTF-8, then:
        - Replace '+' with '%20'
        - Replace '*' with '%2A'
        - Replace '%7E' with '~'
        """
        # URL encode with UTF-8
        encoded = urllib.parse.quote(s, safe='')
        # Apply NetSuite-specific replacements
        encoded = encoded.replace('+', '%20')
        # Note: urllib.parse.quote doesn't encode '*', so we need to do it
        encoded = encoded.replace('*', '%2A')
        # The tilde should NOT be encoded per RFC 3986, but URLEncoder encodes it
        # Then NetSuite replaces %7E back to ~
        # Since Python's quote doesn't encode ~, we're fine
        return encoded
    
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
        
        # Fall back to default template using URL-formatted account ID
        return f"https://{self.account_id_for_url}.suitetalk.api.netsuite.com/wsdl/v2022_1_0/netsuite.wsdl"
    
    def _discover_datacenter_url(self) -> Optional[str]:
        """
        Discover the account-specific data center URL using NetSuite's REST endpoint.
        
        Returns the webservices URL if found, None otherwise.
        """
        try:
            from requests import get as requests_get
            
            # Use the original account ID (with underscore, uppercase) for the API call
            # NetSuite expects account ID in format like "1234567" or "1234567_SB1"
            url = self.DATACENTER_URLS_ENDPOINT.format(account_id=self.account_id)
            print(f"DEBUG - Discovering data center for account: {self.account_id}")
            
            response = requests_get(url, timeout=10)
            if response.status_code == 200:
                data = response.json()
                print(f"DEBUG - Data center response: {data}")
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
        
        Matches NetSuite SDK TbaUtils.java exactly:
        - Base string: URL-encoded account&consumerKey&token&nonce&timestamp
        - Key: percentEncode(consumerSecret)&percentEncode(tokenSecret)
        """
        # Create the base string with URL-encoded parameters (like SDK does)
        # SDK uses URLEncoder.encode() on each parameter
        base_string = "&".join([
            urllib.parse.quote(self.account_id, safe=''),
            urllib.parse.quote(self.consumer_key, safe=''),
            urllib.parse.quote(self.token_id, safe=''),
            urllib.parse.quote(nonce, safe=''),
            urllib.parse.quote(str(timestamp), safe='')
        ])
        
        # Create the signing key with percent-encoded secrets (like SDK's getKey())
        key = "&".join([
            self._percent_encode(self.consumer_secret),
            self._percent_encode(self.token_secret)
        ])
        
        print(f"DEBUG - Base string: {base_string}")
        print(f"DEBUG - Key length: {len(key)}")
        
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
        
        # Fall back to default using URL-formatted account ID
        return f"https://{self.account_id_for_url}.suitetalk.api.netsuite.com/services/NetSuitePort_2022_1"
    
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
                
                # Parse the response - structure is response.body.getServerTimeResult
                # or sometimes response directly has the result
                result = None
                if hasattr(response, 'body') and hasattr(response.body, 'getServerTimeResult'):
                    result = response.body.getServerTimeResult
                elif hasattr(response, 'getServerTimeResult'):
                    result = response.getServerTimeResult
                else:
                    result = response
                
                # Check if successful
                is_success = False
                server_time = None
                
                if result:
                    if hasattr(result, 'status') and hasattr(result.status, 'isSuccess'):
                        is_success = result.status.isSuccess
                    if hasattr(result, 'serverTime'):
                        server_time = str(result.serverTime)
                
                if is_success:
                    return ConnectionTestResult(
                        success=True,
                        message="Connection successful!",
                        server_time=server_time,
                        account_info={"account_id": self.account_id}
                    )
                else:
                    # Try to extract error message
                    error_msg = "Connection failed - check credentials"
                    if result and hasattr(result, 'status') and hasattr(result.status, 'statusDetail'):
                        details = result.status.statusDetail
                        if details:
                            error_msg = str(details[0].message if hasattr(details[0], 'message') else details[0])
                    return ConnectionTestResult(
                        success=False,
                        message=error_msg,
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
            
            # Handle response - might be nested under body.readResponse
            read_response = response
            if hasattr(response, 'body') and hasattr(response.body, 'readResponse'):
                read_response = response.body.readResponse
            
            # Check for success
            if hasattr(read_response, 'status') and read_response.status.isSuccess:
                # Convert response to dict
                record = read_response.record if hasattr(read_response, 'record') else None
                record_data = self._serialize_response(record) if record else {}
                return LiveAPIResponse(
                    success=True,
                    message=f"Successfully retrieved {record_type}",
                    data=record_data
                )
            else:
                error_msg = "Unknown error"
                status = read_response.status if hasattr(read_response, 'status') else None
                if status and hasattr(status, 'statusDetail') and status.statusDetail:
                    details = status.statusDetail
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
            
            # Handle response - might be nested under body.searchResult
            search_result = response
            if hasattr(response, 'body') and hasattr(response.body, 'searchResult'):
                search_result = response.body.searchResult
            
            if hasattr(search_result, 'status') and search_result.status.isSuccess:
                # Extract records
                records = []
                total_records = getattr(search_result, 'totalRecords', 0)
                total_pages = getattr(search_result, 'totalPages', 0)
                
                if hasattr(search_result, 'recordList') and search_result.recordList:
                    record_list = search_result.recordList
                    if hasattr(record_list, 'record') and record_list.record:
                        for record in record_list.record:
                            records.append(self._serialize_response(record))
                
                return LiveAPIResponse(
                    success=True,
                    message=f"Found {total_records} records",
                    data={
                        "total_records": total_records,
                        "page_size": page_size,
                        "total_pages": total_pages,
                        "records": records[:10]  # Limit to first 10 for preview
                    }
                )
            else:
                error_msg = "Search failed"
                status = search_result.status if hasattr(search_result, 'status') else None
                if status and hasattr(status, 'statusDetail') and status.statusDetail:
                    details = status.statusDetail
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
    
    def _serialize_response(self, obj, max_depth: int = 5, current_depth: int = 0) -> Any:
        """
        Serialize a SOAP response object to a dict.
        Handles zeep CompoundValue objects specially.
        """
        if current_depth >= max_depth:
            return str(obj) if obj is not None else None
        
        if obj is None:
            return None
        
        if isinstance(obj, (str, int, float, bool)):
            return obj
        
        if isinstance(obj, datetime):
            return obj.isoformat()
        
        if isinstance(obj, list):
            return [self._serialize_response(item, max_depth, current_depth + 1) for item in obj[:20]]
        
        # Handle zeep CompoundValue objects (they have __iter__ but aren't regular dicts)
        if hasattr(obj, '__iter__') and hasattr(obj, '__getitem__'):
            try:
                # Try to iterate as dict-like (zeep objects support this)
                result = {}
                for key in obj:
                    try:
                        value = obj[key]
                        result[key] = self._serialize_response(value, max_depth, current_depth + 1)
                    except:
                        pass
                if result:
                    return result
            except:
                pass
        
        # Fallback: Try __dict__ for regular Python objects
        if hasattr(obj, '__dict__'):
            result = {}
            for key, value in obj.__dict__.items():
                if not key.startswith('_'):
                    result[key] = self._serialize_response(value, max_depth, current_depth + 1)
            if result:
                return result
        
        # Last resort: try to convert to dict if possible
        try:
            return dict(obj)
        except:
            return str(obj) if obj is not None else None
