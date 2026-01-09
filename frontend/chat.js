/**
 * NetSuite Support Assistant - Chat Interface
 * 
 * Provides an AI-powered chat interface for support team queries
 * about SDK record types, fields, and connector support.
 */

// API Configuration
const API_BASE = window.location.origin;

// Session management
let sessionId = localStorage.getItem('chatSessionId') || generateSessionId();
localStorage.setItem('chatSessionId', sessionId);

// DOM Elements
const elements = {
    statusIndicator: document.getElementById('statusIndicator'),
    statusDot: null,
    statusText: null,
    clearBtn: document.getElementById('clearBtn'),
    messagesContainer: document.getElementById('messagesContainer'),
    welcomeMessage: document.getElementById('welcomeMessage'),
    suggestionsGrid: document.getElementById('suggestionsGrid'),
    messageInput: document.getElementById('messageInput'),
    sendBtn: document.getElementById('sendBtn')
};

// State
let isLoading = false;
let chatAvailable = false;

// Initialize
document.addEventListener('DOMContentLoaded', () => {
    elements.statusDot = elements.statusIndicator.querySelector('.status-dot');
    elements.statusText = elements.statusIndicator.querySelector('.status-text');
    
    checkChatStatus();
    loadSuggestions();
    setupEventListeners();
    loadChatHistory();
});

// Event Listeners
function setupEventListeners() {
    // Send button
    elements.sendBtn.addEventListener('click', sendMessage);
    
    // Input handling
    elements.messageInput.addEventListener('input', handleInputChange);
    elements.messageInput.addEventListener('keydown', handleKeyDown);
    
    // Clear button
    elements.clearBtn.addEventListener('click', clearConversation);
}

function handleInputChange() {
    const hasText = elements.messageInput.value.trim().length > 0;
    elements.sendBtn.disabled = !hasText || isLoading || !chatAvailable;
    
    // Auto-resize textarea
    elements.messageInput.style.height = 'auto';
    elements.messageInput.style.height = Math.min(elements.messageInput.scrollHeight, 150) + 'px';
}

function handleKeyDown(event) {
    if (event.key === 'Enter' && !event.shiftKey) {
        event.preventDefault();
        if (!elements.sendBtn.disabled) {
            sendMessage();
        }
    }
}

// API Functions
async function checkChatStatus() {
    try {
        const response = await fetch(`${API_BASE}/api/chat/status`);
        const data = await response.json();
        
        chatAvailable = data.available;
        updateStatusIndicator(data.available, data.available ? 'AI Ready' : data.reason);
        
        if (!data.available) {
            showSystemMessage('Chat is currently unavailable: ' + (data.reason || 'Unknown error'));
        }
    } catch (error) {
        chatAvailable = false;
        updateStatusIndicator(false, 'Connection error');
        showSystemMessage('Unable to connect to chat service. Please check your connection.');
    }
}

function updateStatusIndicator(available, text) {
    elements.statusDot.className = 'status-dot ' + (available ? 'online' : 'offline');
    elements.statusText.textContent = text;
}

async function loadSuggestions() {
    try {
        const response = await fetch(`${API_BASE}/api/chat/suggestions`);
        const data = await response.json();
        
        renderSuggestions(data.suggestions);
    } catch (error) {
        console.error('Failed to load suggestions:', error);
        // Show default suggestions
        renderSuggestions([
            {
                category: 'Quick Questions',
                questions: [
                    'Is Invoice supported?',
                    'Where can I find accounting book data?',
                    'What fields does Customer have?'
                ]
            }
        ]);
    }
}

function renderSuggestions(suggestions) {
    const html = suggestions.map(category => `
        <div class="suggestion-category">
            <h4>${category.category}</h4>
            <div class="suggestion-buttons">
                ${category.questions.map(q => `
                    <button class="suggestion-btn" data-question="${escapeHtml(q)}">
                        ${escapeHtml(q)}
                    </button>
                `).join('')}
            </div>
        </div>
    `).join('');
    
    elements.suggestionsGrid.innerHTML = html;
    
    // Add click handlers
    elements.suggestionsGrid.querySelectorAll('.suggestion-btn').forEach(btn => {
        btn.addEventListener('click', () => {
            elements.messageInput.value = btn.dataset.question;
            handleInputChange();
            elements.messageInput.focus();
        });
    });
}

async function sendMessage() {
    const message = elements.messageInput.value.trim();
    if (!message || isLoading || !chatAvailable) return;
    
    // Hide welcome message
    if (elements.welcomeMessage) {
        elements.welcomeMessage.style.display = 'none';
    }
    
    // Add user message to UI
    addMessageToUI('user', message);
    
    // Clear input
    elements.messageInput.value = '';
    handleInputChange();
    
    // Show loading indicator
    isLoading = true;
    elements.sendBtn.disabled = true;
    const loadingId = addLoadingMessage();
    
    try {
        const response = await fetch(`${API_BASE}/api/chat`, {
            method: 'POST',
            headers: {
                'Content-Type': 'application/json'
            },
            body: JSON.stringify({
                message: message,
                session_id: sessionId
            })
        });
        
        const data = await response.json();
        
        // Remove loading indicator
        removeLoadingMessage(loadingId);
        
        if (data.success && data.response) {
            addMessageToUI('assistant', data.response, data.quick_answer);
        } else {
            addMessageToUI('error', data.error || 'Failed to get response');
        }
        
    } catch (error) {
        removeLoadingMessage(loadingId);
        addMessageToUI('error', 'Network error: ' + error.message);
    } finally {
        isLoading = false;
        handleInputChange();
    }
}

async function loadChatHistory() {
    try {
        const response = await fetch(`${API_BASE}/api/chat/session/${sessionId}`);
        if (response.ok) {
            const data = await response.json();
            if (data.messages && data.messages.length > 0) {
                // Hide welcome message
                if (elements.welcomeMessage) {
                    elements.welcomeMessage.style.display = 'none';
                }
                // Render existing messages
                data.messages.forEach(msg => {
                    addMessageToUI(msg.role, msg.content, null, false);
                });
            }
        }
    } catch (error) {
        console.error('Failed to load chat history:', error);
    }
}

async function clearConversation() {
    if (!confirm('Clear conversation history?')) return;
    
    try {
        await fetch(`${API_BASE}/api/chat/session/${sessionId}`, {
            method: 'DELETE'
        });
        
        // Generate new session
        sessionId = generateSessionId();
        localStorage.setItem('chatSessionId', sessionId);
        
        // Clear UI
        const messages = elements.messagesContainer.querySelectorAll('.message');
        messages.forEach(msg => msg.remove());
        
        // Show welcome message
        if (elements.welcomeMessage) {
            elements.welcomeMessage.style.display = 'block';
        }
        
    } catch (error) {
        console.error('Failed to clear conversation:', error);
    }
}

// UI Functions
function addMessageToUI(role, content, quickAnswer = null, scroll = true) {
    const messageDiv = document.createElement('div');
    messageDiv.className = `message message-${role}`;
    
    const avatar = role === 'user' ? '👤' : role === 'error' ? '⚠️' : '🤖';
    const roleName = role === 'user' ? 'You' : role === 'error' ? 'Error' : 'Assistant';
    
    let formattedContent = formatMessageContent(content);
    
    // Add quick answer badge if present
    let quickAnswerBadge = '';
    if (quickAnswer) {
        const type = quickAnswer.type === 'record_type' ? 'Record Type' : 'Field';
        quickAnswerBadge = `<span class="quick-answer-badge">⚡ Quick Lookup: ${type}</span>`;
    }
    
    messageDiv.innerHTML = `
        <div class="message-avatar">${avatar}</div>
        <div class="message-content">
            <div class="message-header">
                <span class="message-role">${roleName}</span>
                ${quickAnswerBadge}
                <span class="message-time">${formatTime(new Date())}</span>
            </div>
            <div class="message-body">${formattedContent}</div>
        </div>
    `;
    
    elements.messagesContainer.appendChild(messageDiv);
    
    if (scroll) {
        messageDiv.scrollIntoView({ behavior: 'smooth', block: 'end' });
    }
    
    return messageDiv;
}

function addLoadingMessage() {
    const id = 'loading-' + Date.now();
    const messageDiv = document.createElement('div');
    messageDiv.className = 'message message-assistant loading';
    messageDiv.id = id;
    
    messageDiv.innerHTML = `
        <div class="message-avatar">🤖</div>
        <div class="message-content">
            <div class="message-header">
                <span class="message-role">Assistant</span>
            </div>
            <div class="message-body">
                <div class="loading-dots">
                    <span></span>
                    <span></span>
                    <span></span>
                </div>
            </div>
        </div>
    `;
    
    elements.messagesContainer.appendChild(messageDiv);
    messageDiv.scrollIntoView({ behavior: 'smooth', block: 'end' });
    
    return id;
}

function removeLoadingMessage(id) {
    const loadingDiv = document.getElementById(id);
    if (loadingDiv) {
        loadingDiv.remove();
    }
}

function showSystemMessage(text) {
    const messageDiv = document.createElement('div');
    messageDiv.className = 'system-message';
    messageDiv.textContent = text;
    elements.messagesContainer.appendChild(messageDiv);
}

// Formatting Functions
function formatMessageContent(content) {
    // Convert markdown-style formatting to HTML
    let formatted = escapeHtml(content);
    
    // Bold: **text**
    formatted = formatted.replace(/\*\*([^*]+)\*\*/g, '<strong>$1</strong>');
    
    // Italic: *text* (but not inside code)
    formatted = formatted.replace(/(?<!\\)\*([^*]+)\*/g, '<em>$1</em>');
    
    // Code: `text`
    formatted = formatted.replace(/`([^`]+)`/g, '<code>$1</code>');
    
    // Lists: - item
    formatted = formatted.replace(/^- (.+)$/gm, '<li>$1</li>');
    formatted = formatted.replace(/(<li>.*<\/li>)+/gs, '<ul>$&</ul>');
    
    // Newlines
    formatted = formatted.replace(/\n\n/g, '</p><p>');
    formatted = formatted.replace(/\n/g, '<br>');
    
    // Wrap in paragraph
    if (!formatted.startsWith('<')) {
        formatted = '<p>' + formatted + '</p>';
    }
    
    return formatted;
}

function escapeHtml(text) {
    const div = document.createElement('div');
    div.textContent = text;
    return div.innerHTML;
}

function formatTime(date) {
    return date.toLocaleTimeString('en-US', { 
        hour: 'numeric', 
        minute: '2-digit',
        hour12: true 
    });
}

function generateSessionId() {
    return 'session_' + Math.random().toString(36).substr(2, 9) + '_' + Date.now();
}
