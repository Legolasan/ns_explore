"""
Application Configuration

Manages environment variables and application settings.
Sensitive values like API keys are loaded from environment variables.
"""

import os
from typing import Optional
from functools import lru_cache
from pydantic_settings import BaseSettings


class Settings(BaseSettings):
    """Application settings loaded from environment variables"""
    
    # Application
    app_name: str = "NetSuite SDK Explorer"
    app_version: str = "1.0.0"
    debug: bool = False
    
    # API Configuration
    api_prefix: str = "/api"
    
    # Claude API (Anthropic)
    anthropic_api_key: Optional[str] = None
    claude_model: str = "claude-sonnet-4-20250514"
    claude_max_tokens: int = 4096
    
    # Rate limiting for chat endpoint
    chat_rate_limit_per_minute: int = 30
    
    # Paths
    sdk_base_path: str = "./sdk"
    data_path: str = "./backend/data"
    connector_path: Optional[str] = None
    
    # Server
    host: str = "0.0.0.0"
    port: int = 8080
    
    class Config:
        env_file = ".env"
        env_file_encoding = "utf-8"
        case_sensitive = False
        
    def is_claude_configured(self) -> bool:
        """Check if Claude API is properly configured"""
        return bool(self.anthropic_api_key)


@lru_cache()
def get_settings() -> Settings:
    """Get cached settings instance"""
    return Settings()


# Export a singleton instance
settings = get_settings()
