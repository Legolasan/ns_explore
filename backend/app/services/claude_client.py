"""
Claude AI Client Service

Handles communication with the Anthropic Claude API for natural language
queries about the NetSuite SDK and connector.
"""

import json
from typing import Dict, List, Optional, Any
from dataclasses import dataclass, field
import anthropic

from ..core.config import settings
from .field_indexer import get_field_indexer, FieldIndexer
from .sdk_indexer import SDKIndexer
from .connector_parser import ConnectorIndexer


@dataclass
class ChatMessage:
    """Represents a message in the conversation"""
    role: str  # "user" or "assistant"
    content: str


@dataclass
class ConversationContext:
    """Manages conversation state for a chat session"""
    session_id: str
    messages: List[ChatMessage] = field(default_factory=list)
    
    def add_message(self, role: str, content: str):
        self.messages.append(ChatMessage(role=role, content=content))
        
    def get_messages_for_api(self) -> List[dict]:
        """Format messages for Anthropic API"""
        return [{"role": m.role, "content": m.content} for m in self.messages]
    
    def to_dict(self) -> dict:
        return {
            "session_id": self.session_id,
            "messages": [{"role": m.role, "content": m.content} for m in self.messages]
        }


class ClaudeClient:
    """Client for Claude AI interactions with SDK context"""
    
    SYSTEM_PROMPT_TEMPLATE = """You are an expert support assistant for Hevo Data's NetSuite ERP connector. Your role is to help the support team answer questions about:

1. Whether specific NetSuite record types (tables) are supported in the SDK
2. Whether specific fields exist and which record types contain them
3. Whether record types/fields are actively used in the Hevo connector
4. Data types and field relationships

You have access to the following knowledge:

## SDK SUMMARY
{sdk_summary}

## RECORD TYPES IN CONNECTOR
The Hevo connector currently uses {connector_count} of {sdk_count} SDK record types ({coverage_percent}% coverage).

Connector categories:
- Transaction records (incremental load): {transaction_count}
- Item records (incremental load): {item_count}  
- Standard records (full load): {standard_count}

## FIELD INDEX
{field_summary}

## IMPORTANT TERMINOLOGY
- "Record Type" = A NetSuite table/entity (e.g., Invoice, Customer, Account)
- "Field" = A column/attribute within a record type
- "RecordRef" = A reference/foreign key to another record type
- "Used in Connector" = Actively fetched by Hevo's production connector
- "SDK Supported" = Available in the NetSuite SOAP API SDK (may not be in connector)

## RESPONSE GUIDELINES
1. Always clarify whether you're discussing SDK support vs connector implementation
2. When a "record type" doesn't exist, check if it exists as a field (e.g., "AccountingBook" is a field, not a record)
3. Provide specific record types and field counts
4. For fields, list the top record types containing them
5. Be concise but complete - support team needs actionable answers
6. If uncertain, say so and suggest what to verify

When users ask about support for something:
- First check if it's a record type
- Then check if it's a field name
- Explain the difference if relevant"""

    def __init__(
        self,
        sdk_indexer: Optional[SDKIndexer] = None,
        connector_indexer: Optional[ConnectorIndexer] = None,
        field_indexer: Optional[FieldIndexer] = None
    ):
        """
        Initialize Claude client with SDK context providers.
        
        Args:
            sdk_indexer: SDK index manager
            connector_indexer: Connector usage index manager
            field_indexer: Field reverse index manager
        """
        self.sdk_indexer = sdk_indexer
        self.connector_indexer = connector_indexer
        self.field_indexer = field_indexer or get_field_indexer()
        
        # Initialize Anthropic client if API key is available
        self.client = None
        if settings.is_claude_configured():
            self.client = anthropic.Anthropic(api_key=settings.anthropic_api_key)
        
        # Cache for system prompt
        self._system_prompt: Optional[str] = None
        
        # Session storage (in production, use Redis or similar)
        self._sessions: Dict[str, ConversationContext] = {}
        
    def is_available(self) -> bool:
        """Check if Claude API is available"""
        return self.client is not None
        
    def _build_system_prompt(self) -> str:
        """Build the system prompt with current SDK context"""
        if self._system_prompt:
            return self._system_prompt
            
        # Get SDK summary
        sdk_summary = "SDK information not available."
        sdk_count = 0
        record_type_list = []
        
        if self.sdk_indexer:
            try:
                index = self.sdk_indexer.get_index()
                sdk_count = index.total_records
                sdk_summary = f"""Version: {index.version}
Total Record Types: {index.total_records}
Total Fields: {index.total_fields}
Categories: {', '.join(self.sdk_indexer.get_all_categories())}

Top Record Types by Field Count:"""
                
                # Add top records by field count
                sorted_records = sorted(
                    index.record_types.values(),
                    key=lambda r: r.field_count,
                    reverse=True
                )[:20]
                
                for r in sorted_records:
                    sdk_summary += f"\n- {r.name} ({r.category}): {r.field_count} fields"
                    record_type_list.append(r.name)
                    
            except Exception as e:
                sdk_summary = f"Error loading SDK index: {e}"
        
        # Get connector stats
        connector_count = 0
        coverage_percent = 0
        transaction_count = 0
        item_count = 0
        standard_count = 0
        
        if self.connector_indexer:
            try:
                conn_index = self.connector_indexer.get_index()
                if conn_index:
                    stats = conn_index.coverage_stats
                    connector_count = stats.get("connector_records", 0)
                    coverage_percent = stats.get("coverage_percent", 0)
                    categories = stats.get("categories", {})
                    transaction_count = categories.get("transaction", 0)
                    item_count = categories.get("item", 0)
                    standard_count = categories.get("standard", 0)
            except Exception:
                pass
        
        # Get field summary
        field_summary = "Field index not available."
        if self.field_indexer:
            try:
                field_summary = self.field_indexer.build_context_for_ai()
            except Exception as e:
                field_summary = f"Error loading field index: {e}"
        
        self._system_prompt = self.SYSTEM_PROMPT_TEMPLATE.format(
            sdk_summary=sdk_summary,
            connector_count=connector_count,
            sdk_count=sdk_count,
            coverage_percent=coverage_percent,
            transaction_count=transaction_count,
            item_count=item_count,
            standard_count=standard_count,
            field_summary=field_summary
        )
        
        return self._system_prompt
    
    def get_or_create_session(self, session_id: str) -> ConversationContext:
        """Get existing session or create new one"""
        if session_id not in self._sessions:
            self._sessions[session_id] = ConversationContext(session_id=session_id)
        return self._sessions[session_id]
    
    def clear_session(self, session_id: str):
        """Clear a session's conversation history"""
        if session_id in self._sessions:
            del self._sessions[session_id]
    
    async def chat(
        self, 
        message: str, 
        session_id: str = "default"
    ) -> Dict[str, Any]:
        """
        Send a message and get a response from Claude.
        
        Args:
            message: User's question
            session_id: Conversation session identifier
            
        Returns:
            Dict with response and metadata
        """
        if not self.is_available():
            return {
                "success": False,
                "error": "Claude API is not configured. Please set ANTHROPIC_API_KEY environment variable.",
                "response": None
            }
        
        # Get or create session
        session = self.get_or_create_session(session_id)
        
        # Add user message to session
        session.add_message("user", message)
        
        try:
            # Build context-aware query
            enhanced_message = self._enhance_query(message)
            
            # Prepare messages for API
            messages = session.get_messages_for_api()
            
            # If we enhanced the last message, update it
            if enhanced_message != message:
                messages[-1]["content"] = enhanced_message
            
            # Call Claude API
            response = self.client.messages.create(
                model=settings.claude_model,
                max_tokens=settings.claude_max_tokens,
                system=self._build_system_prompt(),
                messages=messages
            )
            
            # Extract response text
            assistant_message = response.content[0].text
            
            # Add assistant response to session
            session.add_message("assistant", assistant_message)
            
            return {
                "success": True,
                "response": assistant_message,
                "session_id": session_id,
                "message_count": len(session.messages),
                "model": settings.claude_model,
                "usage": {
                    "input_tokens": response.usage.input_tokens,
                    "output_tokens": response.usage.output_tokens
                }
            }
            
        except anthropic.APIError as e:
            return {
                "success": False,
                "error": f"Claude API error: {str(e)}",
                "response": None
            }
        except Exception as e:
            return {
                "success": False,
                "error": f"Unexpected error: {str(e)}",
                "response": None
            }
    
    def _enhance_query(self, query: str) -> str:
        """
        Enhance user query with relevant context from indexes.
        
        Args:
            query: Original user query
            
        Returns:
            Enhanced query with additional context
        """
        enhancements = []
        query_lower = query.lower()
        
        # Check if query mentions specific record types
        if self.sdk_indexer:
            try:
                index = self.sdk_indexer.get_index()
                for record_name in index.record_type_names:
                    if record_name.lower() in query_lower:
                        record_info = index.record_types.get(record_name)
                        if record_info:
                            # Check connector usage
                            used_in_connector = False
                            if self.connector_indexer:
                                used_in_connector = self.connector_indexer.is_used_in_connector(record_name)
                            
                            enhancements.append(
                                f"\n[Context: '{record_name}' exists as SDK record type in {record_info.category}, "
                                f"{record_info.field_count} fields, "
                                f"{'USED' if used_in_connector else 'NOT used'} in connector]"
                            )
            except Exception:
                pass
        
        # Check if query mentions specific fields
        if self.field_indexer:
            try:
                # Look for potential field names (words that might be camelCase field names)
                import re
                potential_fields = re.findall(r'\b[a-z]+[A-Z][a-zA-Z]*\b', query)
                potential_fields += re.findall(r'\b[a-z]{4,}\b', query_lower)
                
                for potential_field in set(potential_fields):
                    field_info = self.field_indexer.find_field(potential_field)
                    if field_info:
                        connector_count = sum(1 for loc in field_info if loc.get("used_in_connector"))
                        enhancements.append(
                            f"\n[Context: '{potential_field}' field exists in {len(field_info)} record types, "
                            f"{connector_count} used in connector]"
                        )
            except Exception:
                pass
        
        if enhancements:
            return query + "\n" + "\n".join(enhancements)
        
        return query
    
    def get_quick_answer(self, query: str) -> Optional[Dict[str, Any]]:
        """
        Try to answer simple queries directly without calling Claude.
        
        Args:
            query: User query
            
        Returns:
            Quick answer dict or None if Claude is needed
        """
        query_lower = query.lower()
        
        # Check for simple "is X supported" questions
        if "supported" in query_lower or "support" in query_lower or "have" in query_lower:
            # Extract potential record/field name
            import re
            
            # Try to find what they're asking about
            match = re.search(r'(?:is|do we have|support)\s+["\']?(\w+)["\']?', query_lower)
            if match:
                term = match.group(1)
                
                # Check if it's a record type
                if self.sdk_indexer:
                    record_info = self.sdk_indexer.get_record_type(term)
                    if record_info:
                        used_in_connector = False
                        if self.connector_indexer:
                            used_in_connector = self.connector_indexer.is_used_in_connector(record_info.name)
                        
                        return {
                            "type": "record_type",
                            "name": record_info.name,
                            "found": True,
                            "sdk_supported": True,
                            "in_connector": used_in_connector,
                            "category": record_info.category,
                            "field_count": record_info.field_count,
                            "has_search": record_info.has_search
                        }
                
                # Check if it's a field
                if self.field_indexer:
                    field_info = self.field_indexer.get_field_summary(term)
                    if field_info:
                        return {
                            "type": "field",
                            "name": field_info["field_name"],
                            "found": True,
                            "in_records": field_info["total_occurrences"],
                            "in_connector_records": field_info["in_connector_count"],
                            "connector_records": field_info["connector_records"][:5],
                            "field_types": field_info["field_types"],
                            "is_record_ref": field_info["is_record_ref"]
                        }
        
        return None


# Global instance
_claude_client: Optional[ClaudeClient] = None


def get_claude_client() -> Optional[ClaudeClient]:
    """Get the global Claude client instance"""
    return _claude_client


def set_claude_client(client: ClaudeClient):
    """Set the global Claude client instance"""
    global _claude_client
    _claude_client = client


def init_claude_client(
    sdk_indexer: Optional[SDKIndexer] = None,
    connector_indexer: Optional[ConnectorIndexer] = None,
    field_indexer: Optional[FieldIndexer] = None
) -> ClaudeClient:
    """Initialize and set the global Claude client"""
    client = ClaudeClient(
        sdk_indexer=sdk_indexer,
        connector_indexer=connector_indexer,
        field_indexer=field_indexer
    )
    set_claude_client(client)
    return client
