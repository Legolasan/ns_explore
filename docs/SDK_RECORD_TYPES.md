# NetSuite SuiteTalk SDK - Record Types Guide

This document explains the 191 record types available in the NetSuite SuiteTalk SDK (version 2022.1) and what they represent.

## What Are the 191 Record Types?

The SDK provides access to **191 distinct business entities** (record types) that you can interact with via the SOAP API. Each record type essentially represents a "table" that you can:

- **Read** (get, getList, search)
- **Write** (add, update, upsert)
- **Delete** (delete)

## Record Types by Category

| Category | Count | Description | Examples |
|----------|-------|-------------|----------|
| **accounting** | ~65 | Chart of accounts, items, tax setup | `account`, `item`, `currency`, `taxCode`, `subsidiary` |
| **customization** | ~15 | Custom records and fields | `customRecord`, `customList`, `customField`, `customSegment` |
| **inventory** | ~14 | Inventory management | `inventoryAdjustment`, `transferOrder`, `workOrder`, `bin` |
| **relationships** | ~11 | CRM entities | `customer`, `vendor`, `contact`, `partner`, `job` |
| **marketing** | ~11 | Marketing campaigns | `campaign`, `promotionCode`, `couponCode` |
| **support** | ~9 | Customer support | `supportCase`, `issue`, `solution`, `topic` |
| **customers** | ~8 | Customer transactions | `cashRefund`, `creditMemo`, `customerPayment`, `charge` |
| **employees** | ~8 | HR and payroll | `employee`, `expenseReport`, `paycheck`, `timeBill` |
| **purchases** | ~8 | Procurement | `purchaseOrder`, `vendorBill`, `vendorPayment`, `itemReceipt` |
| **sales** | ~7 | Sales transactions | `salesOrder`, `invoice`, `estimate`, `opportunity` |
| **scheduling** | ~5 | Calendar and tasks | `calendarEvent`, `task`, `phoneCall`, `projectTask` |
| **general** | ~5 | General ledger | `journalEntry`, `interCompanyJournalEntry` |
| **supplychain** | 3 | Manufacturing | `manufacturingOperationTask`, `manufacturingRouting` |
| **filecabinet** | 2 | File storage | `file`, `folder` |
| **communication** | 2 | Messages and notes | `message`, `note` |
| **bank** | 2 | Banking | `check`, `deposit` |
| **demandplanning** | 2 | Demand planning | `itemDemandPlan`, `itemSupplyPlan` |
| **financial** | 1 | Financial planning | `budget` |

## Transaction Types Explained

There is **no single "Transaction" record type** in NetSuite. Instead, "Transaction" is a **category** that encompasses 50+ specific transaction types:

```
             ┌─────────────────┐
             │  Transaction    │  ← Abstract Category (not a record type)
             │   (concept)     │
             └────────┬────────┘
                      │
   ┌──────────────────┼──────────────────┐
   │                  │                  │
┌──▼───┐         ┌────▼────┐       ┌─────▼─────┐
│Sales │         │Purchases│       │ Inventory │
└──┬───┘         └────┬────┘       └─────┬─────┘
   │                  │                  │
┌──▼──────┐    ┌──────▼─────┐    ┌───────▼────────┐
│salesOrder│   │purchaseOrder│   │inventoryTransfer│
│invoice   │   │vendorBill   │   │workOrder        │
│cashSale  │   │itemReceipt  │   │assemblyBuild    │
│...       │   │...          │   │...              │
└──────────┘   └─────────────┘   └────────────────┘
```

### Transaction Types Available

| Category | Transaction Types |
|----------|------------------|
| **Sales** | `salesOrder`, `invoice`, `cashSale`, `estimate`, `opportunity`, `itemFulfillment`, `usage` |
| **Customers** | `customerPayment`, `customerDeposit`, `customerRefund`, `creditMemo`, `cashRefund`, `charge`, `depositApplication`, `returnAuthorization` |
| **Purchases** | `purchaseOrder`, `purchaseRequisition`, `vendorBill`, `vendorCredit`, `vendorPayment`, `itemReceipt`, `inboundShipment`, `vendorReturnAuthorization` |
| **Inventory** | `inventoryAdjustment`, `inventoryTransfer`, `transferOrder`, `assemblyBuild`, `assemblyUnbuild`, `workOrder`, `binTransfer` |
| **Bank** | `check`, `deposit` |
| **General** | `journalEntry`, `interCompanyJournalEntry`, `advInterCompanyJournalEntry`, `statisticalJournalEntry`, `periodEndJournal` |
| **Employees** | `expenseReport`, `paycheck`, `timeBill`, `timeSheet` |

### Searching Across All Transactions

The SDK provides `TransactionSearch` to query across all transaction types at once:

```java
TransactionSearch search = new TransactionSearch();
TransactionSearchBasic basic = new TransactionSearchBasic();
// Set search criteria
search.setBasic(basic);
```

## Understanding Field Types

### RecordRef Fields

When a field is typed as `RecordRef`, it means the field stores a **reference to another record** (like a foreign key):

```
┌─────────────────────┐         ┌──────────────────┐
│   SalesOrder        │         │    Customer      │
├─────────────────────┤         ├──────────────────┤
│ entity: RecordRef ──┼────────►│ internalId: 123  │
│ item: RecordRef     │         │ companyName: ABC │
└─────────────────────┘         └──────────────────┘
```

A `RecordRef` typically contains:
- `internalId` - NetSuite's internal ID
- `externalId` - Optional external identifier
- `type` - The type of record being referenced

## What's NOT in the 191 Record Types

Some NetSuite data is **not accessible** via these 191 record types:

1. **Deleted Records** - Requires separate `getDeleted` API call
2. **Audit Trail / System Tables** - Internal NetSuite tables
3. **SuiteAnalytics-only Tables** - Some reporting tables
4. **Custom Fields** - These are attributes on records, not separate tables
5. **Some Setup Records** - Accessed via different APIs

## For Data Integration (Hevo Connector)

**191 record types = 191 entities you can extract and load**

This includes:
- ✅ **Master Data**: Customers, Vendors, Items, Accounts, Employees
- ✅ **Transactions**: Sales Orders, Invoices, Purchase Orders, Payments
- ✅ **Supporting Data**: Currencies, Tax Codes, Subsidiaries, Departments
- ✅ **Custom Records**: User-defined record types

## API Operations by Record Type

Not all record types support all operations:

| Operation Support | Examples |
|-------------------|----------|
| **Full CRUD** | `customer`, `salesOrder`, `invoice`, `item` |
| **Read-only** | Some configuration/setup records |
| **Search-only** | `TransactionSearch` (cross-type queries) |

## Related SDK Classes

For each record type, the SDK typically provides:

| Class Type | Purpose | Example |
|------------|---------|---------|
| `{Record}` | The main record class | `Customer.java` |
| `{Record}Search` | Search criteria | `CustomerSearch.java` |
| `{Record}SearchAdvanced` | Advanced search | `CustomerSearchAdvanced.java` |
| `{Record}SearchRow` | Search result row | `CustomerSearchRow.java` |

## Version Information

- **SDK Version**: 2022.1
- **Total Record Types**: 191
- **Total Fields**: ~18,000+

---

*This documentation is auto-generated based on analysis of the NetSuite SuiteTalk SDK.*
