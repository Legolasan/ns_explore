/**
 * NetSuite SDK Explorer - Frontend Application
 */

// API Base URL - adjust for production
const API_BASE = window.location.hostname === 'localhost' 
    ? 'http://localhost:8000/api'
    : '/api';

// State
let currentCategory = '';
let selectedRecord = null;
let allRecords = [];
let categories = [];

// DOM Elements
const elements = {
    // Stats
    statRecords: document.getElementById('statRecords'),
    statFields: document.getElementById('statFields'),
    statVersion: document.getElementById('statVersion'),
    
    // Tabs
    navTabs: document.querySelectorAll('.nav-tab'),
    tabContents: document.querySelectorAll('.tab-content'),
    
    // Record Search
    recordSearch: document.getElementById('recordSearch'),
    categoryFilters: document.getElementById('categoryFilters'),
    recordResults: document.getElementById('recordResults'),
    recordDetail: document.getElementById('recordDetail'),
    
    // Field Search
    fieldSearch: document.getElementById('fieldSearch'),
    fieldResults: document.getElementById('fieldResults'),
    
    // Live API
    accountId: document.getElementById('accountId'),
    consumerKey: document.getElementById('consumerKey'),
    consumerSecret: document.getElementById('consumerSecret'),
    tokenId: document.getElementById('tokenId'),
    tokenSecret: document.getElementById('tokenSecret'),
    testConnection: document.getElementById('testConnection'),
    connectionStatus: document.getElementById('connectionStatus'),
    getRecordType: document.getElementById('getRecordType'),
    getInternalId: document.getElementById('getInternalId'),
    getRecord: document.getElementById('getRecord'),
    searchRecordType: document.getElementById('searchRecordType'),
    searchPageSize: document.getElementById('searchPageSize'),
    searchRecords: document.getElementById('searchRecords'),
    apiResponse: document.getElementById('apiResponse'),
};

// Initialize
document.addEventListener('DOMContentLoaded', () => {
    initTabs();
    loadStats();
    loadCategories();
    loadRecords();
    initSearchHandlers();
    initLiveAPIHandlers();
});

// Tab Navigation
function initTabs() {
    elements.navTabs.forEach(tab => {
        tab.addEventListener('click', () => {
            const tabId = tab.dataset.tab;
            
            // Update active states
            elements.navTabs.forEach(t => t.classList.remove('active'));
            elements.tabContents.forEach(c => c.classList.remove('active'));
            
            tab.classList.add('active');
            document.getElementById(`${tabId}-tab`).classList.add('active');
        });
    });
}

// Load SDK Stats
async function loadStats() {
    try {
        const response = await fetch(`${API_BASE}/stats`);
        const stats = await response.json();
        
        elements.statRecords.textContent = stats.total_record_types;
        elements.statFields.textContent = stats.total_fields.toLocaleString();
        elements.statVersion.textContent = `v${stats.sdk_version}`;
    } catch (error) {
        console.error('Failed to load stats:', error);
    }
}

// Load Categories
async function loadCategories() {
    try {
        const response = await fetch(`${API_BASE}/records/categories`);
        categories = await response.json();
        
        renderCategoryFilters();
    } catch (error) {
        console.error('Failed to load categories:', error);
    }
}

function renderCategoryFilters() {
    const html = `
        <button class="filter-pill active" data-category="">All (${allRecords.length || '...'})</button>
        ${categories.map(cat => `
            <button class="filter-pill" data-category="${cat.name}">
                ${cat.name} (${cat.count})
            </button>
        `).join('')}
    `;
    
    elements.categoryFilters.innerHTML = html;
    
    // Add click handlers
    elements.categoryFilters.querySelectorAll('.filter-pill').forEach(pill => {
        pill.addEventListener('click', () => {
            currentCategory = pill.dataset.category;
            
            // Update active state
            elements.categoryFilters.querySelectorAll('.filter-pill').forEach(p => 
                p.classList.remove('active'));
            pill.classList.add('active');
            
            // Re-filter results
            filterAndDisplayRecords();
        });
    });
}

// Load Records
async function loadRecords() {
    elements.recordResults.innerHTML = '<div class="loading">Loading records</div>';
    
    try {
        const response = await fetch(`${API_BASE}/records?limit=500`);
        const data = await response.json();
        allRecords = data.records;
        
        renderCategoryFilters();
        filterAndDisplayRecords();
    } catch (error) {
        console.error('Failed to load records:', error);
        elements.recordResults.innerHTML = '<div class="loading">Failed to load records</div>';
    }
}

function filterAndDisplayRecords() {
    const query = elements.recordSearch.value.toLowerCase();
    
    let filtered = allRecords;
    
    // Filter by category
    if (currentCategory) {
        filtered = filtered.filter(r => r.category === currentCategory);
    }
    
    // Filter by search query
    if (query) {
        filtered = filtered.filter(r => 
            r.name.toLowerCase().includes(query) ||
            r.class_name.toLowerCase().includes(query)
        );
    }
    
    renderRecordList(filtered);
}

function renderRecordList(records) {
    if (records.length === 0) {
        elements.recordResults.innerHTML = `
            <div class="detail-placeholder">
                <span class="placeholder-icon">🔍</span>
                <p>No records match your search</p>
            </div>
        `;
        return;
    }
    
    const html = records.map(record => `
        <div class="record-item ${selectedRecord === record.name ? 'active' : ''}" 
             data-record="${record.name}">
            <div class="record-item-header">
                <span class="record-name">${record.name}</span>
                <span class="badge badge-category">${record.category}</span>
            </div>
            <div class="record-meta">
                <span>📋 ${record.field_count} fields</span>
                ${record.has_search ? '<span class="badge badge-search">searchable</span>' : ''}
            </div>
        </div>
    `).join('');
    
    elements.recordResults.innerHTML = html;
    
    // Add click handlers
    elements.recordResults.querySelectorAll('.record-item').forEach(item => {
        item.addEventListener('click', () => {
            const recordName = item.dataset.record;
            selectRecord(recordName);
        });
    });
}

// Select and display record details
async function selectRecord(recordName) {
    selectedRecord = recordName;
    
    // Update active state in list
    elements.recordResults.querySelectorAll('.record-item').forEach(item => {
        item.classList.toggle('active', item.dataset.record === recordName);
    });
    
    // Show loading
    elements.recordDetail.innerHTML = '<div class="loading">Loading details</div>';
    
    try {
        const response = await fetch(`${API_BASE}/records/${recordName}`);
        const record = await response.json();
        
        renderRecordDetail(record);
    } catch (error) {
        console.error('Failed to load record details:', error);
        elements.recordDetail.innerHTML = '<div class="loading">Failed to load details</div>';
    }
}

function renderRecordDetail(record) {
    const fieldGroups = record.field_groups;
    
    const groupsHtml = [
        renderFieldGroup('String Fields', fieldGroups.string_fields, 'text'),
        renderFieldGroup('Number Fields', fieldGroups.number_fields, 'number'),
        renderFieldGroup('Boolean Fields', fieldGroups.boolean_fields, 'boolean'),
        renderFieldGroup('Date Fields', fieldGroups.date_fields, 'date'),
        renderFieldGroup('Record References', fieldGroups.record_ref_fields, 'ref'),
        renderFieldGroup('Enum Fields', fieldGroups.enum_fields, 'enum'),
        renderFieldGroup('List Fields', fieldGroups.list_fields, 'list'),
        renderFieldGroup('Custom/Other Fields', fieldGroups.custom_fields, 'custom'),
    ].filter(Boolean).join('');
    
    const html = `
        <div class="detail-header">
            <div class="detail-title">${record.name}</div>
            <div class="detail-subtitle">${record.full_class_path}</div>
            <div class="detail-badges">
                <span class="badge badge-category">${record.category}</span>
                <span class="badge" style="background: var(--bg-tertiary);">${record.field_count} fields</span>
                ${record.has_search ? '<span class="badge badge-search">searchable</span>' : ''}
            </div>
        </div>
        <div class="detail-body">
            ${groupsHtml}
        </div>
    `;
    
    elements.recordDetail.innerHTML = html;
}

function renderFieldGroup(title, fields, type) {
    if (!fields || fields.length === 0) return '';
    
    const fieldsHtml = fields.map(field => `
        <div class="field-item">
            <span class="field-name">${field.name}</span>
            <span class="field-type ${type}">${field.java_type}${field.ref_type ? ` → ${field.ref_type}` : ''}</span>
        </div>
    `).join('');
    
    return `
        <div class="field-group">
            <div class="field-group-title">
                ${title}
                <span class="field-group-count">${fields.length}</span>
            </div>
            <div class="field-list">
                ${fieldsHtml}
            </div>
        </div>
    `;
}

// Search Handlers
function initSearchHandlers() {
    // Record search
    let recordSearchTimeout;
    elements.recordSearch.addEventListener('input', () => {
        clearTimeout(recordSearchTimeout);
        recordSearchTimeout = setTimeout(() => {
            filterAndDisplayRecords();
        }, 200);
    });
    
    // Field search
    let fieldSearchTimeout;
    elements.fieldSearch.addEventListener('input', () => {
        clearTimeout(fieldSearchTimeout);
        fieldSearchTimeout = setTimeout(() => {
            searchFields();
        }, 300);
    });
}

async function searchFields() {
    const query = elements.fieldSearch.value.trim();
    
    if (!query) {
        elements.fieldResults.innerHTML = `
            <div class="detail-placeholder">
                <span class="placeholder-icon">🔍</span>
                <p>Search for a field name to see which record types contain it</p>
            </div>
        `;
        return;
    }
    
    elements.fieldResults.innerHTML = '<div class="loading">Searching</div>';
    
    try {
        const response = await fetch(`${API_BASE}/fields/search?q=${encodeURIComponent(query)}&limit=200`);
        const data = await response.json();
        
        renderFieldResults(data);
    } catch (error) {
        console.error('Failed to search fields:', error);
        elements.fieldResults.innerHTML = '<div class="loading">Search failed</div>';
    }
}

function renderFieldResults(data) {
    if (data.results.length === 0) {
        elements.fieldResults.innerHTML = `
            <div class="detail-placeholder">
                <span class="placeholder-icon">🔍</span>
                <p>No fields found matching "${data.query}"</p>
            </div>
        `;
        return;
    }
    
    const html = `
        <div style="padding: 16px; border-bottom: 1px solid var(--border-color);">
            <strong>${data.total_matches}</strong> fields found matching "<strong>${data.query}</strong>"
        </div>
        ${data.results.map(field => `
            <div class="field-result-item">
                <span class="field-result-name">${field.field_name}</span>
                <span class="field-result-type">${field.field_type}</span>
                <span class="field-result-record">
                    in <a href="#" onclick="selectRecordFromField('${field.record_type}'); return false;">${field.record_class}</a>
                </span>
            </div>
        `).join('')}
    `;
    
    elements.fieldResults.innerHTML = html;
}

function selectRecordFromField(recordName) {
    // Switch to records tab
    document.querySelector('[data-tab="records"]').click();
    
    // Select the record
    setTimeout(() => {
        selectRecord(recordName);
    }, 100);
}

// Live API Handlers
function initLiveAPIHandlers() {
    elements.testConnection.addEventListener('click', testConnection);
    elements.getRecord.addEventListener('click', getRecord);
    elements.searchRecords.addEventListener('click', searchRecordsAPI);
}

function getCredentials() {
    return {
        account_id: elements.accountId.value.trim(),
        consumer_key: elements.consumerKey.value.trim(),
        consumer_secret: elements.consumerSecret.value.trim(),
        token_id: elements.tokenId.value.trim(),
        token_secret: elements.tokenSecret.value.trim()
    };
}

async function testConnection() {
    const credentials = getCredentials();
    
    if (!credentials.account_id || !credentials.consumer_key) {
        showConnectionStatus('Please fill in all credential fields', false);
        return;
    }
    
    elements.connectionStatus.className = 'connection-status';
    elements.connectionStatus.style.display = 'block';
    elements.connectionStatus.textContent = 'Testing connection...';
    
    try {
        const response = await fetch(`${API_BASE}/live/test-connection`, {
            method: 'POST',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify(credentials)
        });
        
        const result = await response.json();
        showConnectionStatus(result.message, result.success);
    } catch (error) {
        showConnectionStatus(`Connection error: ${error.message}`, false);
    }
}

function showConnectionStatus(message, success) {
    elements.connectionStatus.className = `connection-status ${success ? 'success' : 'error'}`;
    elements.connectionStatus.textContent = message;
    elements.connectionStatus.style.display = 'block';
}

async function getRecord() {
    const credentials = getCredentials();
    const recordType = elements.getRecordType.value.trim();
    const internalId = elements.getInternalId.value.trim();
    
    if (!recordType || !internalId) {
        showAPIResponse({ error: 'Please provide record type and internal ID' });
        return;
    }
    
    showAPIResponse({ loading: true });
    
    try {
        const response = await fetch(`${API_BASE}/live/get-record`, {
            method: 'POST',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify({
                credentials,
                record_type: recordType,
                internal_id: internalId
            })
        });
        
        const result = await response.json();
        showAPIResponse(result);
    } catch (error) {
        showAPIResponse({ error: error.message });
    }
}

async function searchRecordsAPI() {
    const credentials = getCredentials();
    const recordType = elements.searchRecordType.value.trim();
    const pageSize = parseInt(elements.searchPageSize.value) || 10;
    
    if (!recordType) {
        showAPIResponse({ error: 'Please provide record type' });
        return;
    }
    
    showAPIResponse({ loading: true });
    
    try {
        const response = await fetch(`${API_BASE}/live/search`, {
            method: 'POST',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify({
                credentials,
                record_type: recordType,
                page_size: pageSize
            })
        });
        
        const result = await response.json();
        showAPIResponse(result);
    } catch (error) {
        showAPIResponse({ error: error.message });
    }
}

function showAPIResponse(data) {
    if (data.loading) {
        elements.apiResponse.innerHTML = '<div class="loading">Making API call</div>';
        return;
    }
    
    elements.apiResponse.innerHTML = `<pre>${JSON.stringify(data, null, 2)}</pre>`;
}

// Make function globally available for onclick handlers
window.selectRecordFromField = selectRecordFromField;
