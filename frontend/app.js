/**
 * NetSuite SDK Explorer - Frontend Application
 * Supports multiple SDK versions
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
let currentVersion = null;  // Currently selected SDK version
let availableVersions = []; // All available SDK versions
let connectorStats = null;  // Connector usage statistics
let connectorRecords = new Set(); // Set of record names used in connector

// DOM Elements
const elements = {
    // Version selector
    versionSelect: document.getElementById('versionSelect'),
    
    // Stats
    statRecords: document.getElementById('statRecords'),
    statFields: document.getElementById('statFields'),
    
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
    soapEndpoint: document.getElementById('soapEndpoint'),
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
    loadVersions();  // Load versions first, then stats and records
    loadConnectorStats(); // Load connector usage stats
    initSearchHandlers();
    initLiveAPIHandlers();
    initVersionSelector();
});

// Load connector usage statistics
async function loadConnectorStats() {
    try {
        const response = await fetch(`${API_BASE}/records/connector/stats`);
        const data = await response.json();
        
        if (data.available) {
            connectorStats = data;
            connectorRecords = new Set(data.used_record_names || []);
            console.log(`Connector stats loaded: ${connectorStats.connector_records} records used`);
        }
    } catch (error) {
        console.log('Connector stats not available:', error);
    }
}

// Version Selector
function initVersionSelector() {
    elements.versionSelect.addEventListener('change', () => {
        const selectedVersion = elements.versionSelect.value;
        if (selectedVersion && selectedVersion !== currentVersion) {
            currentVersion = selectedVersion;
            localStorage.setItem('sdkVersion', currentVersion);
            
            // Reload data for new version
            loadStats();
            loadCategories();
            loadRecords();
            
            // Clear current detail panel
            elements.recordDetail.innerHTML = `
                <div class="detail-placeholder">
                    <span class="placeholder-icon">📋</span>
                    <p>Select a record type to view details</p>
                </div>
            `;
            selectedRecord = null;
        }
    });
}

// Load available SDK versions
async function loadVersions() {
    try {
        const response = await fetch(`${API_BASE}/versions`);
        const data = await response.json();
        
        availableVersions = data.versions;
        
        // Check for saved version preference
        const savedVersion = localStorage.getItem('sdkVersion');
        currentVersion = savedVersion && availableVersions.includes(savedVersion) 
            ? savedVersion 
            : data.default;
        
        // Populate version dropdown
        elements.versionSelect.innerHTML = availableVersions.map(v => 
            `<option value="${v}" ${v === currentVersion ? 'selected' : ''}>v${v}</option>`
        ).join('');
        
        // Now load data for current version
        loadStats();
        loadCategories();
        loadRecords();
    } catch (error) {
        console.error('Failed to load versions:', error);
        elements.versionSelect.innerHTML = '<option value="">Error loading versions</option>';
        
        // Try to load anyway without version
        loadStats();
        loadCategories();
        loadRecords();
    }
}

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

// Build API URL with version parameter
function apiUrl(endpoint) {
    const url = `${API_BASE}${endpoint}`;
    if (currentVersion) {
        const separator = url.includes('?') ? '&' : '?';
        return `${url}${separator}version=${currentVersion}`;
    }
    return url;
}

// Load SDK Stats
async function loadStats() {
    try {
        const response = await fetch(apiUrl('/stats'));
        const stats = await response.json();
        
        elements.statRecords.textContent = stats.total_record_types;
        elements.statFields.textContent = stats.total_fields.toLocaleString();
    } catch (error) {
        console.error('Failed to load stats:', error);
    }
}

// Load Categories
async function loadCategories() {
    try {
        const response = await fetch(apiUrl('/records/categories'));
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
        const response = await fetch(apiUrl('/records?limit=500'));
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
    const query = elements.recordSearch.value.toLowerCase().trim();
    
    let filtered = allRecords;
    
    // Filter by category
    if (currentCategory) {
        filtered = filtered.filter(r => r.category === currentCategory);
    }
    
    // Filter by search query (record name, class name, OR field names)
    if (query) {
        filtered = filtered.map(r => {
            const nameMatch = r.name.toLowerCase().includes(query) || 
                              r.class_name.toLowerCase().includes(query);
            
            // Search through field names
            const matchingFields = (r.field_names || []).filter(fieldName => 
                fieldName.toLowerCase().includes(query)
            );
            
            if (nameMatch || matchingFields.length > 0) {
                return {
                    ...r,
                    matchingFields: matchingFields,
                    matchType: nameMatch ? 'name' : 'field'
                };
            }
            return null;
        }).filter(Boolean);
    } else {
        // No query - reset match info
        filtered = filtered.map(r => ({
            ...r,
            matchingFields: [],
            matchType: null
        }));
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
    
    const html = records.map(record => {
        // Show matching fields if search matched by field name
        const matchingFieldsHtml = record.matchingFields && record.matchingFields.length > 0 
            ? `<div class="matching-fields">
                 <span class="matching-fields-label">Matched fields:</span>
                 ${record.matchingFields.slice(0, 5).map(f => `<span class="matched-field">${f}</span>`).join('')}
                 ${record.matchingFields.length > 5 ? `<span class="matched-field-more">+${record.matchingFields.length - 5} more</span>` : ''}
               </div>`
            : '';
        
        // Check if record is used in connector
        const isInConnector = connectorRecords.has(record.name) || connectorRecords.has(record.class_name);
        const connectorBadge = isInConnector 
            ? '<span class="badge badge-connector" title="Used in Hevo Connector">Hevo</span>'
            : '';
        
        return `
            <div class="record-item ${selectedRecord === record.name ? 'active' : ''}" 
                 data-record="${record.name}">
                <div class="record-item-header">
                    <span class="record-name">${record.name}</span>
                    <span class="badge badge-category">${record.category}</span>
                    ${connectorBadge}
                </div>
                <div class="record-meta">
                    <span>📋 ${record.field_count} fields</span>
                    ${record.has_search ? '<span class="badge badge-search">searchable</span>' : ''}
                </div>
                ${matchingFieldsHtml}
            </div>
        `;
    }).join('');
    
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
        const response = await fetch(apiUrl(`/records/${recordName}`));
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
    
    // Check if record is used in connector
    const isInConnector = connectorRecords.has(record.name) || connectorRecords.has(record.class_name);
    const connectorBadge = isInConnector 
        ? '<span class="badge badge-connector">Used in Hevo Connector</span>'
        : '';
    
    const html = `
        <div class="detail-header">
            <div class="detail-title">${record.name}</div>
            <div class="detail-subtitle">${record.full_class_path}</div>
            <div class="detail-badges">
                <span class="badge badge-version">SDK v${record.sdk_version}</span>
                <span class="badge badge-category">${record.category}</span>
                <span class="badge" style="background: var(--bg-tertiary);">${record.field_count} fields</span>
                ${record.has_search ? '<span class="badge badge-search">searchable</span>' : ''}
                ${connectorBadge}
            </div>
        </div>
        
        <!-- Detail Tabs -->
        <div class="detail-tabs">
            <button class="detail-tab active" data-detail-tab="fields">Fields</button>
            <button class="detail-tab" data-detail-tab="connector">Connector Usage</button>
        </div>
        
        <!-- Fields Tab Content -->
        <div class="detail-tab-content active" id="detail-fields-tab">
            <div class="detail-body">
                ${groupsHtml}
            </div>
        </div>
        
        <!-- Connector Tab Content -->
        <div class="detail-tab-content" id="detail-connector-tab">
            <div class="connector-loading">Loading connector usage...</div>
        </div>
    `;
    
    elements.recordDetail.innerHTML = html;
    
    // Initialize detail tabs
    initDetailTabs(record.name);
}

// Initialize tabs within the record detail panel
function initDetailTabs(recordName) {
    const tabs = elements.recordDetail.querySelectorAll('.detail-tab');
    const contents = elements.recordDetail.querySelectorAll('.detail-tab-content');
    
    tabs.forEach(tab => {
        tab.addEventListener('click', () => {
            const tabId = tab.dataset.detailTab;
            
            // Update active states
            tabs.forEach(t => t.classList.remove('active'));
            contents.forEach(c => c.classList.remove('active'));
            
            tab.classList.add('active');
            const targetContent = elements.recordDetail.querySelector(`#detail-${tabId}-tab`);
            if (targetContent) {
                targetContent.classList.add('active');
            }
            
            // Load connector usage when tab is clicked
            if (tabId === 'connector') {
                loadConnectorUsage(recordName);
            }
        });
    });
}

// Load connector usage for a specific record
async function loadConnectorUsage(recordName) {
    const connectorTab = elements.recordDetail.querySelector('#detail-connector-tab');
    if (!connectorTab) return;
    
    connectorTab.innerHTML = '<div class="connector-loading">Loading connector usage...</div>';
    
    try {
        const response = await fetch(apiUrl(`/records/${recordName}/connector-usage`));
        const usage = await response.json();
        
        renderConnectorUsage(usage, connectorTab);
    } catch (error) {
        console.error('Failed to load connector usage:', error);
        connectorTab.innerHTML = `
            <div class="connector-error">
                Failed to load connector usage information
            </div>
        `;
    }
}

// Render connector usage information
function renderConnectorUsage(usage, container) {
    if (!usage.used_in_connector) {
        container.innerHTML = `
            <div class="connector-not-used">
                <div class="connector-status-icon">✗</div>
                <h4>Not Used in Hevo Connector</h4>
                <p>${usage.message || 'This record type is not currently used in the Hevo NetSuite connector.'}</p>
                <p class="connector-note">Total SDK fields: ${usage.total_sdk_fields || 0}</p>
            </div>
        `;
        return;
    }
    
    // Calculate field list
    const fieldsList = (usage.extracted_field_names || []).map(f => 
        `<span class="connector-field">${f}</span>`
    ).join('');
    
    // Extra connector fields (added by connector, not in SDK)
    const extraFields = usage.extra_connector_fields || [];
    const extraFieldsHtml = extraFields.length > 0 
        ? `<div class="connector-extra-fields">
             <div class="connector-extra-header">
                 <h4>Additional Connector Fields (${extraFields.length})</h4>
                 <span class="connector-extra-note">Added by connector, not in SDK schema</span>
             </div>
             <div class="connector-fields-list">
                 ${extraFields.map(f => `<span class="connector-field extra">${f}</span>`).join('')}
             </div>
           </div>`
        : '';
    
    container.innerHTML = `
        <div class="connector-used">
            <div class="connector-status">
                <span class="connector-status-icon success">✓</span>
                <span class="connector-status-text">Used in Hevo Connector</span>
            </div>
            
            <div class="connector-info-grid">
                <div class="connector-info-item">
                    <span class="connector-info-label">Load Type</span>
                    <span class="connector-info-value badge-${usage.load_type}">${usage.load_type === 'incremental' ? 'Incremental' : 'Full Load'}</span>
                </div>
                <div class="connector-info-item">
                    <span class="connector-info-label">Category</span>
                    <span class="connector-info-value">${usage.category || 'N/A'}</span>
                </div>
                <div class="connector-info-item">
                    <span class="connector-info-label">SDK Class</span>
                    <span class="connector-info-value code">${usage.sdk_class || 'N/A'}</span>
                </div>
                <div class="connector-info-item">
                    <span class="connector-info-label">Search Class</span>
                    <span class="connector-info-value code">${usage.search_class || 'N/A'}</span>
                </div>
            </div>
            
            <div class="connector-fields-section">
                <div class="connector-fields-header">
                    <h4>Fields Extracted (${usage.fields_extracted} of ${usage.total_sdk_fields})</h4>
                    <span class="connector-coverage">${usage.field_coverage_percent}% coverage</span>
                </div>
                <div class="connector-fields-list">
                    ${fieldsList || '<span class="connector-no-fields">No field mapping available</span>'}
                </div>
            </div>
            
            ${extraFieldsHtml}
            
            <div class="connector-source">
                <span class="connector-source-label">Source:</span>
                <span class="connector-source-file">${usage.source_file || 'N/A'}</span>
            </div>
        </div>
    `;
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
        const response = await fetch(apiUrl(`/fields/search?q=${encodeURIComponent(query)}&limit=200`));
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
            <span class="badge badge-version">SDK v${data.sdk_version}</span>
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
    const soapEndpoint = elements.soapEndpoint?.value?.trim();
    return {
        account_id: elements.accountId.value.trim(),
        consumer_key: elements.consumerKey.value.trim(),
        consumer_secret: elements.consumerSecret.value.trim(),
        token_id: elements.tokenId.value.trim(),
        token_secret: elements.tokenSecret.value.trim(),
        soap_endpoint: soapEndpoint || null
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
