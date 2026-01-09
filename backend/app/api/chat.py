"""
Chat API Endpoint

Provides AI-powered natural language interface for SDK queries.
"""

from typing import Optional, List
from fastapi import APIRouter, HTTPException, Query
from pydantic import BaseModel, Field
import uuid

from ..services.claude_client import get_claude_client, ClaudeClient


router = APIRouter(prefix="/chat", tags=["chat"])


# Request/Response Models
class ChatRequest(BaseModel):
    """Request to send a chat message"""
    message: str = Field(..., min_length=1, max_length=2000, description="User's question")
    session_id: Optional[str] = Field(None, description="Session ID for conversation continuity")


class ChatResponse(BaseModel):
    """Response from chat endpoint"""
    success: bool
    response: Optional[str] = None
    error: Optional[str] = None
    session_id: str
    message_count: int = 0
    quick_answer: Optional[dict] = None
    model: Optional[str] = None
    usage: Optional[dict] = None


class QuickAnswerResponse(BaseModel):
    """Response for quick lookups without AI"""
    found: bool
    type: str  # "record_type" or "field"
    name: str
    details: dict


class SessionInfo(BaseModel):
    """Information about a chat session"""
    session_id: str
    message_count: int
    messages: List[dict]


# Global client accessor
def get_client() -> ClaudeClient:
    """Get the Claude client, raising error if not configured"""
    client = get_claude_client()
    if client is None:
        raise HTTPException(
            status_code=503, 
            detail="Chat service not initialized. Please check server configuration."
        )
    return client


@router.get("/status")
async def get_chat_status():
    """
    Check if chat service is available and configured.
    """
    client = get_claude_client()
    
    if client is None:
        return {
            "available": False,
            "reason": "Claude client not initialized"
        }
    
    if not client.is_available():
        return {
            "available": False,
            "reason": "ANTHROPIC_API_KEY not configured"
        }
    
    return {
        "available": True,
        "model": "claude-sonnet-4-20250514"
    }


@router.post("", response_model=ChatResponse)
async def send_chat_message(request: ChatRequest):
    """
    Send a message and get an AI-powered response.
    
    The AI has context about:
    - All NetSuite SDK record types and fields
    - Which records/fields are used in the Hevo connector
    - Field data types and relationships
    
    Example questions:
    - "Is Invoice supported?"
    - "Where can I find accounting book data?"
    - "Which records have the memo field?"
    - "Is accountingBook a table or a field?"
    """
    client = get_client()
    
    # Generate session ID if not provided
    session_id = request.session_id or str(uuid.uuid4())
    
    # Try quick answer first
    quick_answer = client.get_quick_answer(request.message)
    if quick_answer:
        # Format a quick response without calling Claude
        if quick_answer["type"] == "record_type":
            response_text = format_record_quick_answer(quick_answer)
        else:
            response_text = format_field_quick_answer(quick_answer)
        
        return ChatResponse(
            success=True,
            response=response_text,
            session_id=session_id,
            message_count=1,
            quick_answer=quick_answer
        )
    
    # Call Claude for complex queries
    result = await client.chat(request.message, session_id)
    
    return ChatResponse(
        success=result.get("success", False),
        response=result.get("response"),
        error=result.get("error"),
        session_id=result.get("session_id", session_id),
        message_count=result.get("message_count", 0),
        model=result.get("model"),
        usage=result.get("usage")
    )


@router.get("/session/{session_id}", response_model=SessionInfo)
async def get_session_history(session_id: str):
    """
    Get conversation history for a session.
    """
    client = get_client()
    session = client.get_or_create_session(session_id)
    
    return SessionInfo(
        session_id=session.session_id,
        message_count=len(session.messages),
        messages=[{"role": m.role, "content": m.content} for m in session.messages]
    )


@router.delete("/session/{session_id}")
async def clear_session(session_id: str):
    """
    Clear conversation history for a session.
    """
    client = get_client()
    client.clear_session(session_id)
    
    return {"success": True, "message": f"Session {session_id} cleared"}


@router.get("/suggestions")
async def get_suggested_questions():
    """
    Get suggested starter questions for the chat interface.
    """
    return {
        "suggestions": [
            {
                "category": "Record Types",
                "questions": [
                    "Is Invoice supported in the SDK?",
                    "What record types are available for accounting?",
                    "Which transaction types does Hevo connector support?",
                    "Is there a Transactions record type?"
                ]
            },
            {
                "category": "Fields",
                "questions": [
                    "Where can I find accounting book data?",
                    "Which records have the memo field?",
                    "Is accountingBook a table or a field?",
                    "What fields does the Customer record have?"
                ]
            },
            {
                "category": "Connector Coverage",
                "questions": [
                    "What percentage of SDK records are in the connector?",
                    "Which Invoice fields does Hevo extract?",
                    "List all record types not yet in the connector",
                    "What's the difference between SDK support and connector support?"
                ]
            }
        ]
    }


def format_record_quick_answer(answer: dict) -> str:
    """Format a quick answer about a record type"""
    name = answer["name"]
    in_connector = answer.get("in_connector", False)
    category = answer.get("category", "unknown")
    field_count = answer.get("field_count", 0)
    
    status_emoji = "✅" if in_connector else "⚠️"
    connector_status = "USED in Hevo connector" if in_connector else "NOT used in Hevo connector"
    
    return f"""**{name}** is a supported record type in the NetSuite SDK.

{status_emoji} **Connector Status:** {connector_status}

**Details:**
- **Category:** {category}
- **Field Count:** {field_count}
- **Searchable:** {"Yes" if answer.get("has_search") else "No"}

{"This record type is actively fetched by the Hevo connector." if in_connector else "This record type is available in the SDK but not currently implemented in the Hevo connector."}"""


def format_field_quick_answer(answer: dict) -> str:
    """Format a quick answer about a field"""
    name = answer["name"]
    in_records = answer.get("in_records", 0)
    in_connector = answer.get("in_connector_records", 0)
    connector_records = answer.get("connector_records", [])
    field_types = answer.get("field_types", [])
    is_ref = answer.get("is_record_ref", False)
    
    type_desc = "RecordRef (reference to another record)" if is_ref else ", ".join(field_types)
    
    records_list = ""
    if connector_records:
        records_list = "\n".join(f"- {r}" for r in connector_records[:5])
        if len(connector_records) > 5:
            records_list += f"\n- ... and {len(connector_records) - 5} more"
    
    return f"""**'{name}'** exists as a **field** (not a record type) in the NetSuite SDK.

**Summary:**
- **Found in:** {in_records} record types
- **In Hevo Connector:** {in_connector} record types
- **Data Type:** {type_desc}

{"**Records containing this field (in connector):**" if connector_records else ""}
{records_list}

{"This field can be accessed through any of the record types listed above." if connector_records else "This field exists in the SDK but the containing records may not be in the connector yet."}"""
