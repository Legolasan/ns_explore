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

public class SearchRecordType
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String _account = "account";
    public static final String _accountingPeriod = "accountingPeriod";
    public static final String _accountingTransaction = "accountingTransaction";
    public static final String _billingAccount = "billingAccount";
    public static final String _billingSchedule = "billingSchedule";
    public static final String _bin = "bin";
    public static final String _bom = "bom";
    public static final String _bomRevision = "bomRevision";
    public static final String _budget = "budget";
    public static final String _calendarEvent = "calendarEvent";
    public static final String _campaign = "campaign";
    public static final String _charge = "charge";
    public static final String _classification = "classification";
    public static final String _contact = "contact";
    public static final String _contactCategory = "contactCategory";
    public static final String _contactRole = "contactRole";
    public static final String _costCategory = "costCategory";
    public static final String _consolidatedExchangeRate = "consolidatedExchangeRate";
    public static final String _couponCode = "couponCode";
    public static final String _currencyRate = "currencyRate";
    public static final String _customer = "customer";
    public static final String _customerCategory = "customerCategory";
    public static final String _customerMessage = "customerMessage";
    public static final String _customerStatus = "customerStatus";
    public static final String _customerSubsidiaryRelationship = "customerSubsidiaryRelationship";
    public static final String _customList = "customList";
    public static final String _customRecord = "customRecord";
    public static final String _department = "department";
    public static final String _employee = "employee";
    public static final String _entityGroup = "entityGroup";
    public static final String _expenseCategory = "expenseCategory";
    public static final String _fairValuePrice = "fairValuePrice";
    public static final String _file = "file";
    public static final String _folder = "folder";
    public static final String _giftCertificate = "giftCertificate";
    public static final String _globalAccountMapping = "globalAccountMapping";
    public static final String _hcmJob = "hcmJob";
    public static final String _inboundShipment = "inboundShipment";
    public static final String _inventoryNumber = "inventoryNumber";
    public static final String _item = "item";
    public static final String _itemAccountMapping = "itemAccountMapping";
    public static final String _itemDemandPlan = "itemDemandPlan";
    public static final String _itemRevision = "itemRevision";
    public static final String _itemSupplyPlan = "itemSupplyPlan";
    public static final String _issue = "issue";
    public static final String _job = "job";
    public static final String _jobStatus = "jobStatus";
    public static final String _jobType = "jobType";
    public static final String _location = "location";
    public static final String _manufacturingCostTemplate = "manufacturingCostTemplate";
    public static final String _manufacturingOperationTask = "manufacturingOperationTask";
    public static final String _manufacturingRouting = "manufacturingRouting";
    public static final String _merchandiseHierarchyNode = "merchandiseHierarchyNode";
    public static final String _message = "message";
    public static final String _nexus = "nexus";
    public static final String _note = "note";
    public static final String _noteType = "noteType";
    public static final String _opportunity = "opportunity";
    public static final String _otherNameCategory = "otherNameCategory";
    public static final String _partner = "partner";
    public static final String _partnerCategory = "partnerCategory";
    public static final String _paycheck = "paycheck";
    public static final String _paymentMethod = "paymentMethod";
    public static final String _payrollItem = "payrollItem";
    public static final String _phoneCall = "phoneCall";
    public static final String _priceLevel = "priceLevel";
    public static final String _pricingGroup = "pricingGroup";
    public static final String _projectTask = "projectTask";
    public static final String _promotionCode = "promotionCode";
    public static final String _resourceAllocation = "resourceAllocation";
    public static final String _revRecSchedule = "revRecSchedule";
    public static final String _revRecTemplate = "revRecTemplate";
    public static final String _salesRole = "salesRole";
    public static final String _salesTaxItem = "salesTaxItem";
    public static final String _solution = "solution";
    public static final String _siteCategory = "siteCategory";
    public static final String _subsidiary = "subsidiary";
    public static final String _supportCase = "supportCase";
    public static final String _task = "task";
    public static final String _taxGroup = "taxGroup";
    public static final String _taxType = "taxType";
    public static final String _term = "term";
    public static final String _timeBill = "timeBill";
    public static final String _timeSheet = "timeSheet";
    public static final String _topic = "topic";
    public static final String _transaction = "transaction";
    public static final String _unitsType = "unitsType";
    public static final String _usage = "usage";
    public static final String _vendor = "vendor";
    public static final String _vendorCategory = "vendorCategory";
    public static final String _vendorSubsidiaryRelationship = "vendorSubsidiaryRelationship";
    public static final String _winLossReason = "winLossReason";
    public static final SearchRecordType account = new SearchRecordType("account");
    public static final SearchRecordType accountingPeriod = new SearchRecordType("accountingPeriod");
    public static final SearchRecordType accountingTransaction = new SearchRecordType("accountingTransaction");
    public static final SearchRecordType billingAccount = new SearchRecordType("billingAccount");
    public static final SearchRecordType billingSchedule = new SearchRecordType("billingSchedule");
    public static final SearchRecordType bin = new SearchRecordType("bin");
    public static final SearchRecordType bom = new SearchRecordType("bom");
    public static final SearchRecordType bomRevision = new SearchRecordType("bomRevision");
    public static final SearchRecordType budget = new SearchRecordType("budget");
    public static final SearchRecordType calendarEvent = new SearchRecordType("calendarEvent");
    public static final SearchRecordType campaign = new SearchRecordType("campaign");
    public static final SearchRecordType charge = new SearchRecordType("charge");
    public static final SearchRecordType classification = new SearchRecordType("classification");
    public static final SearchRecordType contact = new SearchRecordType("contact");
    public static final SearchRecordType contactCategory = new SearchRecordType("contactCategory");
    public static final SearchRecordType contactRole = new SearchRecordType("contactRole");
    public static final SearchRecordType costCategory = new SearchRecordType("costCategory");
    public static final SearchRecordType consolidatedExchangeRate = new SearchRecordType("consolidatedExchangeRate");
    public static final SearchRecordType couponCode = new SearchRecordType("couponCode");
    public static final SearchRecordType currencyRate = new SearchRecordType("currencyRate");
    public static final SearchRecordType customer = new SearchRecordType("customer");
    public static final SearchRecordType customerCategory = new SearchRecordType("customerCategory");
    public static final SearchRecordType customerMessage = new SearchRecordType("customerMessage");
    public static final SearchRecordType customerStatus = new SearchRecordType("customerStatus");
    public static final SearchRecordType customerSubsidiaryRelationship = new SearchRecordType("customerSubsidiaryRelationship");
    public static final SearchRecordType customList = new SearchRecordType("customList");
    public static final SearchRecordType customRecord = new SearchRecordType("customRecord");
    public static final SearchRecordType department = new SearchRecordType("department");
    public static final SearchRecordType employee = new SearchRecordType("employee");
    public static final SearchRecordType entityGroup = new SearchRecordType("entityGroup");
    public static final SearchRecordType expenseCategory = new SearchRecordType("expenseCategory");
    public static final SearchRecordType fairValuePrice = new SearchRecordType("fairValuePrice");
    public static final SearchRecordType file = new SearchRecordType("file");
    public static final SearchRecordType folder = new SearchRecordType("folder");
    public static final SearchRecordType giftCertificate = new SearchRecordType("giftCertificate");
    public static final SearchRecordType globalAccountMapping = new SearchRecordType("globalAccountMapping");
    public static final SearchRecordType hcmJob = new SearchRecordType("hcmJob");
    public static final SearchRecordType inboundShipment = new SearchRecordType("inboundShipment");
    public static final SearchRecordType inventoryNumber = new SearchRecordType("inventoryNumber");
    public static final SearchRecordType item = new SearchRecordType("item");
    public static final SearchRecordType itemAccountMapping = new SearchRecordType("itemAccountMapping");
    public static final SearchRecordType itemDemandPlan = new SearchRecordType("itemDemandPlan");
    public static final SearchRecordType itemRevision = new SearchRecordType("itemRevision");
    public static final SearchRecordType itemSupplyPlan = new SearchRecordType("itemSupplyPlan");
    public static final SearchRecordType issue = new SearchRecordType("issue");
    public static final SearchRecordType job = new SearchRecordType("job");
    public static final SearchRecordType jobStatus = new SearchRecordType("jobStatus");
    public static final SearchRecordType jobType = new SearchRecordType("jobType");
    public static final SearchRecordType location = new SearchRecordType("location");
    public static final SearchRecordType manufacturingCostTemplate = new SearchRecordType("manufacturingCostTemplate");
    public static final SearchRecordType manufacturingOperationTask = new SearchRecordType("manufacturingOperationTask");
    public static final SearchRecordType manufacturingRouting = new SearchRecordType("manufacturingRouting");
    public static final SearchRecordType merchandiseHierarchyNode = new SearchRecordType("merchandiseHierarchyNode");
    public static final SearchRecordType message = new SearchRecordType("message");
    public static final SearchRecordType nexus = new SearchRecordType("nexus");
    public static final SearchRecordType note = new SearchRecordType("note");
    public static final SearchRecordType noteType = new SearchRecordType("noteType");
    public static final SearchRecordType opportunity = new SearchRecordType("opportunity");
    public static final SearchRecordType otherNameCategory = new SearchRecordType("otherNameCategory");
    public static final SearchRecordType partner = new SearchRecordType("partner");
    public static final SearchRecordType partnerCategory = new SearchRecordType("partnerCategory");
    public static final SearchRecordType paycheck = new SearchRecordType("paycheck");
    public static final SearchRecordType paymentMethod = new SearchRecordType("paymentMethod");
    public static final SearchRecordType payrollItem = new SearchRecordType("payrollItem");
    public static final SearchRecordType phoneCall = new SearchRecordType("phoneCall");
    public static final SearchRecordType priceLevel = new SearchRecordType("priceLevel");
    public static final SearchRecordType pricingGroup = new SearchRecordType("pricingGroup");
    public static final SearchRecordType projectTask = new SearchRecordType("projectTask");
    public static final SearchRecordType promotionCode = new SearchRecordType("promotionCode");
    public static final SearchRecordType resourceAllocation = new SearchRecordType("resourceAllocation");
    public static final SearchRecordType revRecSchedule = new SearchRecordType("revRecSchedule");
    public static final SearchRecordType revRecTemplate = new SearchRecordType("revRecTemplate");
    public static final SearchRecordType salesRole = new SearchRecordType("salesRole");
    public static final SearchRecordType salesTaxItem = new SearchRecordType("salesTaxItem");
    public static final SearchRecordType solution = new SearchRecordType("solution");
    public static final SearchRecordType siteCategory = new SearchRecordType("siteCategory");
    public static final SearchRecordType subsidiary = new SearchRecordType("subsidiary");
    public static final SearchRecordType supportCase = new SearchRecordType("supportCase");
    public static final SearchRecordType task = new SearchRecordType("task");
    public static final SearchRecordType taxGroup = new SearchRecordType("taxGroup");
    public static final SearchRecordType taxType = new SearchRecordType("taxType");
    public static final SearchRecordType term = new SearchRecordType("term");
    public static final SearchRecordType timeBill = new SearchRecordType("timeBill");
    public static final SearchRecordType timeSheet = new SearchRecordType("timeSheet");
    public static final SearchRecordType topic = new SearchRecordType("topic");
    public static final SearchRecordType transaction = new SearchRecordType("transaction");
    public static final SearchRecordType unitsType = new SearchRecordType("unitsType");
    public static final SearchRecordType usage = new SearchRecordType("usage");
    public static final SearchRecordType vendor = new SearchRecordType("vendor");
    public static final SearchRecordType vendorCategory = new SearchRecordType("vendorCategory");
    public static final SearchRecordType vendorSubsidiaryRelationship = new SearchRecordType("vendorSubsidiaryRelationship");
    public static final SearchRecordType winLossReason = new SearchRecordType("winLossReason");
    private static TypeDesc typeDesc = new TypeDesc(SearchRecordType.class);

    protected SearchRecordType(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static SearchRecordType fromValue(String value) throws IllegalArgumentException {
        SearchRecordType enumeration = (SearchRecordType)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static SearchRecordType fromString(String value) throws IllegalArgumentException {
        return SearchRecordType.fromValue(value);
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
        return SearchRecordType.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.core_2022_1.platform.webservices.netsuite.com", "SearchRecordType"));
    }
}

