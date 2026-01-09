/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.axis.description.TypeDesc
 *  org.apache.axis.encoding.Deserializer
 *  org.apache.axis.encoding.Serializer
 *  org.apache.axis.encoding.ser.EnumDeserializer
 *  org.apache.axis.encoding.ser.EnumSerializer
 */
package com.netsuite.suitetalk.proxy.v2022_1.platform.core.types;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

public class DeletedRecordType
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String _advInterCompanyJournalEntry = "advInterCompanyJournalEntry";
    public static final String _assemblyBuild = "assemblyBuild";
    public static final String _assemblyItem = "assemblyItem";
    public static final String _assemblyUnbuild = "assemblyUnbuild";
    public static final String _billingSchedule = "billingSchedule";
    public static final String _bin = "bin";
    public static final String _binTransfer = "binTransfer";
    public static final String _binWorksheet = "binWorksheet";
    public static final String _bom = "bom";
    public static final String _bomRevision = "bomRevision";
    public static final String _calendarEvent = "calendarEvent";
    public static final String _campaign = "campaign";
    public static final String _cashRefund = "cashRefund";
    public static final String _cashSale = "cashSale";
    public static final String _charge = "charge";
    public static final String _check = "check";
    public static final String _contact = "contact";
    public static final String _contactCategory = "contactCategory";
    public static final String _costCategory = "costCategory";
    public static final String _couponCode = "couponCode";
    public static final String _creditMemo = "creditMemo";
    public static final String _currencyRate = "currencyRate";
    public static final String _customPurchase = "customPurchase";
    public static final String _customRecord = "customRecord";
    public static final String _customSale = "customSale";
    public static final String _customTransaction = "customTransaction";
    public static final String _customer = "customer";
    public static final String _customerCategory = "customerCategory";
    public static final String _customerMessage = "customerMessage";
    public static final String _customerDeposit = "customerDeposit";
    public static final String _customerPayment = "customerPayment";
    public static final String _customerRefund = "customerRefund";
    public static final String _customerStatus = "customerStatus";
    public static final String _customerSubsidiaryRelationship = "customerSubsidiaryRelationship";
    public static final String _deposit = "deposit";
    public static final String _depositApplication = "depositApplication";
    public static final String _descriptionItem = "descriptionItem";
    public static final String _discountItem = "discountItem";
    public static final String _downloadItem = "downloadItem";
    public static final String _employee = "employee";
    public static final String _estimate = "estimate";
    public static final String _expenseReport = "expenseReport";
    public static final String _file = "file";
    public static final String _folder = "folder";
    public static final String _giftCertificateItem = "giftCertificateItem";
    public static final String _globalAccountMapping = "globalAccountMapping";
    public static final String _interCompanyJournalEntry = "interCompanyJournalEntry";
    public static final String _interCompanyTransferOrder = "interCompanyTransferOrder";
    public static final String _inventoryAdjustment = "inventoryAdjustment";
    public static final String _inventoryCostRevaluation = "inventoryCostRevaluation";
    public static final String _inventoryItem = "inventoryItem";
    public static final String _inventoryNumber = "inventoryNumber";
    public static final String _inventoryTransfer = "inventoryTransfer";
    public static final String _invoice = "invoice";
    public static final String _issue = "issue";
    public static final String _itemAccountMapping = "itemAccountMapping";
    public static final String _itemDemandPlan = "itemDemandPlan";
    public static final String _itemFulfillment = "itemFulfillment";
    public static final String _itemSupplyPlan = "itemSupplyPlan";
    public static final String _itemGroup = "itemGroup";
    public static final String _itemReceipt = "itemReceipt";
    public static final String _itemRevision = "itemRevision";
    public static final String _job = "job";
    public static final String _jobStatus = "jobStatus";
    public static final String _journalEntry = "journalEntry";
    public static final String _kitItem = "kitItem";
    public static final String _lotNumberedAssemblyItem = "lotNumberedAssemblyItem";
    public static final String _lotNumberedInventoryItem = "lotNumberedInventoryItem";
    public static final String _markupItem = "markupItem";
    public static final String _message = "message";
    public static final String _manufacturingCostTemplate = "manufacturingCostTemplate";
    public static final String _manufacturingOperationTask = "manufacturingOperationTask";
    public static final String _manufacturingRouting = "manufacturingRouting";
    public static final String _merchandiseHierarchyNode = "merchandiseHierarchyNode";
    public static final String _nexus = "nexus";
    public static final String _nonInventoryPurchaseItem = "nonInventoryPurchaseItem";
    public static final String _nonInventoryResaleItem = "nonInventoryResaleItem";
    public static final String _nonInventorySaleItem = "nonInventorySaleItem";
    public static final String _note = "note";
    public static final String _noteType = "noteType";
    public static final String _opportunity = "opportunity";
    public static final String _otherChargePurchaseItem = "otherChargePurchaseItem";
    public static final String _otherChargeResaleItem = "otherChargeResaleItem";
    public static final String _otherChargeSaleItem = "otherChargeSaleItem";
    public static final String _otherNameCategory = "otherNameCategory";
    public static final String _partner = "partner";
    public static final String _paycheck = "paycheck";
    public static final String _paymentItem = "paymentItem";
    public static final String _paymentMethod = "paymentMethod";
    public static final String _payrollItem = "payrollItem";
    public static final String _periodEndJournal = "periodEndJournal";
    public static final String _phoneCall = "phoneCall";
    public static final String _priceLevel = "priceLevel";
    public static final String _pricingGroup = "pricingGroup";
    public static final String _projectTask = "projectTask";
    public static final String _promotionCode = "promotionCode";
    public static final String _purchaseOrder = "purchaseOrder";
    public static final String _purchaseRequisition = "purchaseRequisition";
    public static final String _resourceAllocation = "resourceAllocation";
    public static final String _returnAuthorization = "returnAuthorization";
    public static final String _salesOrder = "salesOrder";
    public static final String _salesTaxItem = "salesTaxItem";
    public static final String _serializedAssemblyItem = "serializedAssemblyItem";
    public static final String _serializedInventoryItem = "serializedInventoryItem";
    public static final String _servicePurchaseItem = "servicePurchaseItem";
    public static final String _serviceResaleItem = "serviceResaleItem";
    public static final String _serviceSaleItem = "serviceSaleItem";
    public static final String _statisticalJournalEntry = "statisticalJournalEntry";
    public static final String _subtotalItem = "subtotalItem";
    public static final String _supportCase = "supportCase";
    public static final String _supportCaseIssue = "supportCaseIssue";
    public static final String _supportCaseOrigin = "supportCaseOrigin";
    public static final String _supportCasePriority = "supportCasePriority";
    public static final String _supportCaseStatus = "supportCaseStatus";
    public static final String _supportCaseType = "supportCaseType";
    public static final String _task = "task";
    public static final String _term = "term";
    public static final String _timeSheet = "timeSheet";
    public static final String _transferOrder = "transferOrder";
    public static final String _usage = "usage";
    public static final String _vendor = "vendor";
    public static final String _vendorBill = "vendorBill";
    public static final String _vendorCredit = "vendorCredit";
    public static final String _vendorPayment = "vendorPayment";
    public static final String _vendorReturnAuthorization = "vendorReturnAuthorization";
    public static final String _vendorSubsidiaryRelationship = "vendorSubsidiaryRelationship";
    public static final String _winLossReason = "winLossReason";
    public static final String _workOrder = "workOrder";
    public static final String _workOrderIssue = "workOrderIssue";
    public static final String _workOrderCompletion = "workOrderCompletion";
    public static final String _workOrderClose = "workOrderClose";
    public static final DeletedRecordType advInterCompanyJournalEntry = new DeletedRecordType("advInterCompanyJournalEntry");
    public static final DeletedRecordType assemblyBuild = new DeletedRecordType("assemblyBuild");
    public static final DeletedRecordType assemblyItem = new DeletedRecordType("assemblyItem");
    public static final DeletedRecordType assemblyUnbuild = new DeletedRecordType("assemblyUnbuild");
    public static final DeletedRecordType billingSchedule = new DeletedRecordType("billingSchedule");
    public static final DeletedRecordType bin = new DeletedRecordType("bin");
    public static final DeletedRecordType binTransfer = new DeletedRecordType("binTransfer");
    public static final DeletedRecordType binWorksheet = new DeletedRecordType("binWorksheet");
    public static final DeletedRecordType bom = new DeletedRecordType("bom");
    public static final DeletedRecordType bomRevision = new DeletedRecordType("bomRevision");
    public static final DeletedRecordType calendarEvent = new DeletedRecordType("calendarEvent");
    public static final DeletedRecordType campaign = new DeletedRecordType("campaign");
    public static final DeletedRecordType cashRefund = new DeletedRecordType("cashRefund");
    public static final DeletedRecordType cashSale = new DeletedRecordType("cashSale");
    public static final DeletedRecordType charge = new DeletedRecordType("charge");
    public static final DeletedRecordType check = new DeletedRecordType("check");
    public static final DeletedRecordType contact = new DeletedRecordType("contact");
    public static final DeletedRecordType contactCategory = new DeletedRecordType("contactCategory");
    public static final DeletedRecordType costCategory = new DeletedRecordType("costCategory");
    public static final DeletedRecordType couponCode = new DeletedRecordType("couponCode");
    public static final DeletedRecordType creditMemo = new DeletedRecordType("creditMemo");
    public static final DeletedRecordType currencyRate = new DeletedRecordType("currencyRate");
    public static final DeletedRecordType customPurchase = new DeletedRecordType("customPurchase");
    public static final DeletedRecordType customRecord = new DeletedRecordType("customRecord");
    public static final DeletedRecordType customSale = new DeletedRecordType("customSale");
    public static final DeletedRecordType customTransaction = new DeletedRecordType("customTransaction");
    public static final DeletedRecordType customer = new DeletedRecordType("customer");
    public static final DeletedRecordType customerCategory = new DeletedRecordType("customerCategory");
    public static final DeletedRecordType customerMessage = new DeletedRecordType("customerMessage");
    public static final DeletedRecordType customerDeposit = new DeletedRecordType("customerDeposit");
    public static final DeletedRecordType customerPayment = new DeletedRecordType("customerPayment");
    public static final DeletedRecordType customerRefund = new DeletedRecordType("customerRefund");
    public static final DeletedRecordType customerStatus = new DeletedRecordType("customerStatus");
    public static final DeletedRecordType customerSubsidiaryRelationship = new DeletedRecordType("customerSubsidiaryRelationship");
    public static final DeletedRecordType deposit = new DeletedRecordType("deposit");
    public static final DeletedRecordType depositApplication = new DeletedRecordType("depositApplication");
    public static final DeletedRecordType descriptionItem = new DeletedRecordType("descriptionItem");
    public static final DeletedRecordType discountItem = new DeletedRecordType("discountItem");
    public static final DeletedRecordType downloadItem = new DeletedRecordType("downloadItem");
    public static final DeletedRecordType employee = new DeletedRecordType("employee");
    public static final DeletedRecordType estimate = new DeletedRecordType("estimate");
    public static final DeletedRecordType expenseReport = new DeletedRecordType("expenseReport");
    public static final DeletedRecordType file = new DeletedRecordType("file");
    public static final DeletedRecordType folder = new DeletedRecordType("folder");
    public static final DeletedRecordType giftCertificateItem = new DeletedRecordType("giftCertificateItem");
    public static final DeletedRecordType globalAccountMapping = new DeletedRecordType("globalAccountMapping");
    public static final DeletedRecordType interCompanyJournalEntry = new DeletedRecordType("interCompanyJournalEntry");
    public static final DeletedRecordType interCompanyTransferOrder = new DeletedRecordType("interCompanyTransferOrder");
    public static final DeletedRecordType inventoryAdjustment = new DeletedRecordType("inventoryAdjustment");
    public static final DeletedRecordType inventoryCostRevaluation = new DeletedRecordType("inventoryCostRevaluation");
    public static final DeletedRecordType inventoryItem = new DeletedRecordType("inventoryItem");
    public static final DeletedRecordType inventoryNumber = new DeletedRecordType("inventoryNumber");
    public static final DeletedRecordType inventoryTransfer = new DeletedRecordType("inventoryTransfer");
    public static final DeletedRecordType invoice = new DeletedRecordType("invoice");
    public static final DeletedRecordType issue = new DeletedRecordType("issue");
    public static final DeletedRecordType itemAccountMapping = new DeletedRecordType("itemAccountMapping");
    public static final DeletedRecordType itemDemandPlan = new DeletedRecordType("itemDemandPlan");
    public static final DeletedRecordType itemFulfillment = new DeletedRecordType("itemFulfillment");
    public static final DeletedRecordType itemSupplyPlan = new DeletedRecordType("itemSupplyPlan");
    public static final DeletedRecordType itemGroup = new DeletedRecordType("itemGroup");
    public static final DeletedRecordType itemReceipt = new DeletedRecordType("itemReceipt");
    public static final DeletedRecordType itemRevision = new DeletedRecordType("itemRevision");
    public static final DeletedRecordType job = new DeletedRecordType("job");
    public static final DeletedRecordType jobStatus = new DeletedRecordType("jobStatus");
    public static final DeletedRecordType journalEntry = new DeletedRecordType("journalEntry");
    public static final DeletedRecordType kitItem = new DeletedRecordType("kitItem");
    public static final DeletedRecordType lotNumberedAssemblyItem = new DeletedRecordType("lotNumberedAssemblyItem");
    public static final DeletedRecordType lotNumberedInventoryItem = new DeletedRecordType("lotNumberedInventoryItem");
    public static final DeletedRecordType markupItem = new DeletedRecordType("markupItem");
    public static final DeletedRecordType message = new DeletedRecordType("message");
    public static final DeletedRecordType manufacturingCostTemplate = new DeletedRecordType("manufacturingCostTemplate");
    public static final DeletedRecordType manufacturingOperationTask = new DeletedRecordType("manufacturingOperationTask");
    public static final DeletedRecordType manufacturingRouting = new DeletedRecordType("manufacturingRouting");
    public static final DeletedRecordType merchandiseHierarchyNode = new DeletedRecordType("merchandiseHierarchyNode");
    public static final DeletedRecordType nexus = new DeletedRecordType("nexus");
    public static final DeletedRecordType nonInventoryPurchaseItem = new DeletedRecordType("nonInventoryPurchaseItem");
    public static final DeletedRecordType nonInventoryResaleItem = new DeletedRecordType("nonInventoryResaleItem");
    public static final DeletedRecordType nonInventorySaleItem = new DeletedRecordType("nonInventorySaleItem");
    public static final DeletedRecordType note = new DeletedRecordType("note");
    public static final DeletedRecordType noteType = new DeletedRecordType("noteType");
    public static final DeletedRecordType opportunity = new DeletedRecordType("opportunity");
    public static final DeletedRecordType otherChargePurchaseItem = new DeletedRecordType("otherChargePurchaseItem");
    public static final DeletedRecordType otherChargeResaleItem = new DeletedRecordType("otherChargeResaleItem");
    public static final DeletedRecordType otherChargeSaleItem = new DeletedRecordType("otherChargeSaleItem");
    public static final DeletedRecordType otherNameCategory = new DeletedRecordType("otherNameCategory");
    public static final DeletedRecordType partner = new DeletedRecordType("partner");
    public static final DeletedRecordType paycheck = new DeletedRecordType("paycheck");
    public static final DeletedRecordType paymentItem = new DeletedRecordType("paymentItem");
    public static final DeletedRecordType paymentMethod = new DeletedRecordType("paymentMethod");
    public static final DeletedRecordType payrollItem = new DeletedRecordType("payrollItem");
    public static final DeletedRecordType periodEndJournal = new DeletedRecordType("periodEndJournal");
    public static final DeletedRecordType phoneCall = new DeletedRecordType("phoneCall");
    public static final DeletedRecordType priceLevel = new DeletedRecordType("priceLevel");
    public static final DeletedRecordType pricingGroup = new DeletedRecordType("pricingGroup");
    public static final DeletedRecordType projectTask = new DeletedRecordType("projectTask");
    public static final DeletedRecordType promotionCode = new DeletedRecordType("promotionCode");
    public static final DeletedRecordType purchaseOrder = new DeletedRecordType("purchaseOrder");
    public static final DeletedRecordType purchaseRequisition = new DeletedRecordType("purchaseRequisition");
    public static final DeletedRecordType resourceAllocation = new DeletedRecordType("resourceAllocation");
    public static final DeletedRecordType returnAuthorization = new DeletedRecordType("returnAuthorization");
    public static final DeletedRecordType salesOrder = new DeletedRecordType("salesOrder");
    public static final DeletedRecordType salesTaxItem = new DeletedRecordType("salesTaxItem");
    public static final DeletedRecordType serializedAssemblyItem = new DeletedRecordType("serializedAssemblyItem");
    public static final DeletedRecordType serializedInventoryItem = new DeletedRecordType("serializedInventoryItem");
    public static final DeletedRecordType servicePurchaseItem = new DeletedRecordType("servicePurchaseItem");
    public static final DeletedRecordType serviceResaleItem = new DeletedRecordType("serviceResaleItem");
    public static final DeletedRecordType serviceSaleItem = new DeletedRecordType("serviceSaleItem");
    public static final DeletedRecordType statisticalJournalEntry = new DeletedRecordType("statisticalJournalEntry");
    public static final DeletedRecordType subtotalItem = new DeletedRecordType("subtotalItem");
    public static final DeletedRecordType supportCase = new DeletedRecordType("supportCase");
    public static final DeletedRecordType supportCaseIssue = new DeletedRecordType("supportCaseIssue");
    public static final DeletedRecordType supportCaseOrigin = new DeletedRecordType("supportCaseOrigin");
    public static final DeletedRecordType supportCasePriority = new DeletedRecordType("supportCasePriority");
    public static final DeletedRecordType supportCaseStatus = new DeletedRecordType("supportCaseStatus");
    public static final DeletedRecordType supportCaseType = new DeletedRecordType("supportCaseType");
    public static final DeletedRecordType task = new DeletedRecordType("task");
    public static final DeletedRecordType term = new DeletedRecordType("term");
    public static final DeletedRecordType timeSheet = new DeletedRecordType("timeSheet");
    public static final DeletedRecordType transferOrder = new DeletedRecordType("transferOrder");
    public static final DeletedRecordType usage = new DeletedRecordType("usage");
    public static final DeletedRecordType vendor = new DeletedRecordType("vendor");
    public static final DeletedRecordType vendorBill = new DeletedRecordType("vendorBill");
    public static final DeletedRecordType vendorCredit = new DeletedRecordType("vendorCredit");
    public static final DeletedRecordType vendorPayment = new DeletedRecordType("vendorPayment");
    public static final DeletedRecordType vendorReturnAuthorization = new DeletedRecordType("vendorReturnAuthorization");
    public static final DeletedRecordType vendorSubsidiaryRelationship = new DeletedRecordType("vendorSubsidiaryRelationship");
    public static final DeletedRecordType winLossReason = new DeletedRecordType("winLossReason");
    public static final DeletedRecordType workOrder = new DeletedRecordType("workOrder");
    public static final DeletedRecordType workOrderIssue = new DeletedRecordType("workOrderIssue");
    public static final DeletedRecordType workOrderCompletion = new DeletedRecordType("workOrderCompletion");
    public static final DeletedRecordType workOrderClose = new DeletedRecordType("workOrderClose");
    private static TypeDesc typeDesc = new TypeDesc(DeletedRecordType.class);

    protected DeletedRecordType(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static DeletedRecordType fromValue(String value) throws IllegalArgumentException {
        DeletedRecordType enumeration = (DeletedRecordType)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static DeletedRecordType fromString(String value) throws IllegalArgumentException {
        return DeletedRecordType.fromValue(value);
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return this.toString().hashCode();
    }

    public String toString() {
        return this._value_;
    }

    public Object readResolve() throws ObjectStreamException {
        return DeletedRecordType.fromValue(this._value_);
    }

    public static Serializer getSerializer(String mechType, Class _javaType, QName _xmlType) {
        return new EnumSerializer(_javaType, _xmlType);
    }

    public static Deserializer getDeserializer(String mechType, Class _javaType, QName _xmlType) {
        return new EnumDeserializer(_javaType, _xmlType);
    }

    public static TypeDesc getTypeDesc() {
        return typeDesc;
    }

    static {
        typeDesc.setXmlType(new QName("urn:types.core_2022_1.platform.webservices.netsuite.com", "DeletedRecordType"));
    }
}

