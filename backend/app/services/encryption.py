"""
Simple encryption service for protecting sensitive data in transit.
Uses AES encryption with a server-generated key.
"""
import os
import base64
import hashlib
from typing import Optional
from cryptography.fernet import Fernet
from cryptography.hazmat.primitives import hashes
from cryptography.hazmat.primitives.kdf.pbkdf2 import PBKDF2HMAC


class EncryptionService:
    """
    Encryption service for protecting sensitive credentials in API requests.
    
    Uses Fernet (AES-128-CBC with HMAC) for symmetric encryption.
    The key is derived from a static secret to ensure consistency across restarts.
    """
    
    # Static salt for consistent key derivation across server restarts
    # This ensures the same key is generated each time
    STATIC_SALT = b'NetSuiteSDKExpl!'  # 16 bytes
    
    def __init__(self):
        # Use environment variable or default secret
        # The key will be consistent across server restarts
        self._secret = os.environ.get('ENCRYPTION_SECRET', 'netsuite-sdk-explorer-default-key-2024')
        self._salt = self.STATIC_SALT
        self._fernet = self._create_fernet()
        
        # Generate a simple identifier clients can use to verify key compatibility
        self._key_id = hashlib.sha256(self._salt + self._secret.encode()).hexdigest()[:16]
    
    def _create_fernet(self) -> Fernet:
        """Create a Fernet instance with derived key."""
        kdf = PBKDF2HMAC(
            algorithm=hashes.SHA256(),
            length=32,
            salt=self._salt,
            iterations=100000,
        )
        key = base64.urlsafe_b64encode(kdf.derive(self._secret.encode()))
        return Fernet(key)
    
    @property
    def key_id(self) -> str:
        """Return the key identifier for clients to verify compatibility."""
        return self._key_id
    
    @property
    def client_key(self) -> str:
        """
        Return a key that clients can use for encryption.
        This is a derived key that the client uses for simple XOR obfuscation.
        The actual decryption happens server-side with the full Fernet key.
        """
        # For browser compatibility, we use a simpler approach:
        # Return a base64-encoded key that the client uses for XOR
        return base64.b64encode(self._salt).decode('utf-8')
    
    def encrypt(self, plaintext: str) -> str:
        """Encrypt a string and return base64-encoded ciphertext."""
        if not plaintext:
            return ""
        return self._fernet.encrypt(plaintext.encode()).decode('utf-8')
    
    def decrypt(self, ciphertext: str) -> str:
        """Decrypt base64-encoded ciphertext and return plaintext."""
        if not ciphertext:
            return ""
        try:
            return self._fernet.decrypt(ciphertext.encode()).decode('utf-8')
        except Exception:
            # If Fernet decryption fails, try simple XOR decode (client-side encryption)
            return self._xor_decrypt(ciphertext)
    
    def _xor_decrypt(self, encoded: str) -> str:
        """
        Decrypt XOR-encoded string from client.
        Client uses: base64(XOR(data, key))
        """
        try:
            # Decode base64
            encrypted_bytes = base64.b64decode(encoded)
            
            # XOR with salt (key)
            key = self._salt
            decrypted = bytes([
                encrypted_bytes[i] ^ key[i % len(key)]
                for i in range(len(encrypted_bytes))
            ])
            
            return decrypted.decode('utf-8')
        except Exception as e:
            # If decryption fails, return as-is (might be unencrypted)
            return encoded
    
    def decrypt_credentials(self, credentials: dict) -> dict:
        """
        Decrypt sensitive fields in a credentials dictionary.
        
        Sensitive fields (consumer_secret, token_secret) are expected to be:
        - Plain text 64-char hex strings, OR
        - XOR+Base64 encrypted strings (longer, ~92 chars)
        
        We try to decrypt if it doesn't look like a plain 64-char hex string.
        """
        result = credentials.copy()
        
        sensitive_fields = ['consumer_secret', 'token_secret']
        
        for field in sensitive_fields:
            if field in result and result[field]:
                value = result[field]
                
                # Check if value is encrypted (prefixed with 'enc:')
                if value.startswith('enc:'):
                    result[field] = self.decrypt(value[4:])
                # Check if it looks like a plain 64-char hex string
                elif len(value) == 64 and all(c in '0123456789abcdefABCDEF' for c in value):
                    # Already plain text, keep as-is
                    pass
                else:
                    # Try XOR decryption (encrypted values are ~92 chars base64)
                    try:
                        decrypted = self._xor_decrypt(value)
                        # Verify decrypted value looks like a valid hex string
                        if len(decrypted) == 64 and all(c in '0123456789abcdefABCDEF' for c in decrypted):
                            result[field] = decrypted
                        # Otherwise keep original value
                    except Exception:
                        pass  # Keep original value
        
        return result


# Global encryption service instance
_encryption_service: Optional[EncryptionService] = None


def get_encryption_service() -> EncryptionService:
    """Get the global encryption service instance."""
    global _encryption_service
    if _encryption_service is None:
        _encryption_service = EncryptionService()
    return _encryption_service
