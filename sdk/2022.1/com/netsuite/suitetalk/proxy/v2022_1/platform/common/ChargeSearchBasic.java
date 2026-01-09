/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.axis.description.ElementDesc
 *  org.apache.axis.description.FieldDesc
 *  org.apache.axis.description.TypeDesc
 *  org.apache.axis.encoding.Deserializer
 *  org.apache.axis.encoding.Serializer
 *  org.apache.axis.encoding.ser.BeanDeserializer
 *  org.apache.axis.encoding.ser.BeanSerializer
 */
package com.netsuite.suitetalk.proxy.v2022_1.platform.common;

import com.netsuite.suitetalk.proxy.v2022_1.platform.common.types.PostingPeriodDate;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchCustomFieldList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchDateField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchDoubleField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchEnumMultiSelectField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchLongField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchMultiSelectField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchRecordBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchStringField;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class ChargeSearchBasic
extends SearchRecordBasic
implements Serializable {
    private SearchDoubleField amount;
    private SearchMultiSelectField billingAccount;
    private SearchMultiSelectField billingItem;
    private SearchMultiSelectField billTo;
    private SearchDateField chargeDate;
    private SearchMultiSelectField chargeType;
    private SearchMultiSelectField _class;
    private SearchDateField createdDate;
    private SearchMultiSelectField currency;
    private SearchMultiSelectField department;
    private SearchMultiSelectField externalId;
    private SearchStringField externalIdString;
    private SearchMultiSelectField internalId;
    private SearchLongField internalIdNumber;
    private SearchMultiSelectField location;
    private SearchDateField modifiedDate;
    private RecordRef postingPeriod;
    private PostingPeriodDate postingPeriodRelative;
    private SearchDoubleField quantity;
    private SearchDoubleField rate;
    private SearchMultiSelectField rule;
    private SearchStringField runId;
    private SearchLongField salesOrder;
    private SearchEnumMultiSelectField stage;
    private SearchMultiSelectField subscriptionLine;
    private SearchEnumMultiSelectField use;
    private SearchCustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(ChargeSearchBasic.class, true);

    public ChargeSearchBasic() {
    }

    public ChargeSearchBasic(SearchDoubleField amount, SearchMultiSelectField billingAccount, SearchMultiSelectField billingItem, SearchMultiSelectField billTo, SearchDateField chargeDate, SearchMultiSelectField chargeType, SearchMultiSelectField _class, SearchDateField createdDate, SearchMultiSelectField currency, SearchMultiSelectField department, SearchMultiSelectField externalId, SearchStringField externalIdString, SearchMultiSelectField internalId, SearchLongField internalIdNumber, SearchMultiSelectField location, SearchDateField modifiedDate, RecordRef postingPeriod, PostingPeriodDate postingPeriodRelative, SearchDoubleField quantity, SearchDoubleField rate, SearchMultiSelectField rule, SearchStringField runId, SearchLongField salesOrder, SearchEnumMultiSelectField stage, SearchMultiSelectField subscriptionLine, SearchEnumMultiSelectField use, SearchCustomFieldList customFieldList) {
        this.amount = amount;
        this.billingAccount = billingAccount;
        this.billingItem = billingItem;
        this.billTo = billTo;
        this.chargeDate = chargeDate;
        this.chargeType = chargeType;
        this._class = _class;
        this.createdDate = createdDate;
        this.currency = currency;
        this.department = department;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.location = location;
        this.modifiedDate = modifiedDate;
        this.postingPeriod = postingPeriod;
        this.postingPeriodRelative = postingPeriodRelative;
        this.quantity = quantity;
        this.rate = rate;
        this.rule = rule;
        this.runId = runId;
        this.salesOrder = salesOrder;
        this.stage = stage;
        this.subscriptionLine = subscriptionLine;
        this.use = use;
        this.customFieldList = customFieldList;
    }

    public SearchDoubleField getAmount() {
        return this.amount;
    }

    public void setAmount(SearchDoubleField amount) {
        this.amount = amount;
    }

    public SearchMultiSelectField getBillingAccount() {
        return this.billingAccount;
    }

    public void setBillingAccount(SearchMultiSelectField billingAccount) {
        this.billingAccount = billingAccount;
    }

    public SearchMultiSelectField getBillingItem() {
        return this.billingItem;
    }

    public void setBillingItem(SearchMultiSelectField billingItem) {
        this.billingItem = billingItem;
    }

    public SearchMultiSelectField getBillTo() {
        return this.billTo;
    }

    public void setBillTo(SearchMultiSelectField billTo) {
        this.billTo = billTo;
    }

    public SearchDateField getChargeDate() {
        return this.chargeDate;
    }

    public void setChargeDate(SearchDateField chargeDate) {
        this.chargeDate = chargeDate;
    }

    public SearchMultiSelectField getChargeType() {
        return this.chargeType;
    }

    public void setChargeType(SearchMultiSelectField chargeType) {
        this.chargeType = chargeType;
    }

    public SearchMultiSelectField get_class() {
        return this._class;
    }

    public void set_class(SearchMultiSelectField _class) {
        this._class = _class;
    }

    public SearchDateField getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(SearchDateField createdDate) {
        this.createdDate = createdDate;
    }

    public SearchMultiSelectField getCurrency() {
        return this.currency;
    }

    public void setCurrency(SearchMultiSelectField currency) {
        this.currency = currency;
    }

    public SearchMultiSelectField getDepartment() {
        return this.department;
    }

    public void setDepartment(SearchMultiSelectField department) {
        this.department = department;
    }

    public SearchMultiSelectField getExternalId() {
        return this.externalId;
    }

    public void setExternalId(SearchMultiSelectField externalId) {
        this.externalId = externalId;
    }

    public SearchStringField getExternalIdString() {
        return this.externalIdString;
    }

    public void setExternalIdString(SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }

    public SearchMultiSelectField getInternalId() {
        return this.internalId;
    }

    public void setInternalId(SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }

    public SearchLongField getInternalIdNumber() {
        return this.internalIdNumber;
    }

    public void setInternalIdNumber(SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }

    public SearchMultiSelectField getLocation() {
        return this.location;
    }

    public void setLocation(SearchMultiSelectField location) {
        this.location = location;
    }

    public SearchDateField getModifiedDate() {
        return this.modifiedDate;
    }

    public void setModifiedDate(SearchDateField modifiedDate) {
        this.modifiedDate = modifiedDate;
    }

    public RecordRef getPostingPeriod() {
        return this.postingPeriod;
    }

    public void setPostingPeriod(RecordRef postingPeriod) {
        this.postingPeriod = postingPeriod;
    }

    public PostingPeriodDate getPostingPeriodRelative() {
        return this.postingPeriodRelative;
    }

    public void setPostingPeriodRelative(PostingPeriodDate postingPeriodRelative) {
        this.postingPeriodRelative = postingPeriodRelative;
    }

    public SearchDoubleField getQuantity() {
        return this.quantity;
    }

    public void setQuantity(SearchDoubleField quantity) {
        this.quantity = quantity;
    }

    public SearchDoubleField getRate() {
        return this.rate;
    }

    public void setRate(SearchDoubleField rate) {
        this.rate = rate;
    }

    public SearchMultiSelectField getRule() {
        return this.rule;
    }

    public void setRule(SearchMultiSelectField rule) {
        this.rule = rule;
    }

    public SearchStringField getRunId() {
        return this.runId;
    }

    public void setRunId(SearchStringField runId) {
        this.runId = runId;
    }

    public SearchLongField getSalesOrder() {
        return this.salesOrder;
    }

    public void setSalesOrder(SearchLongField salesOrder) {
        this.salesOrder = salesOrder;
    }

    public SearchEnumMultiSelectField getStage() {
        return this.stage;
    }

    public void setStage(SearchEnumMultiSelectField stage) {
        this.stage = stage;
    }

    public SearchMultiSelectField getSubscriptionLine() {
        return this.subscriptionLine;
    }

    public void setSubscriptionLine(SearchMultiSelectField subscriptionLine) {
        this.subscriptionLine = subscriptionLine;
    }

    public SearchEnumMultiSelectField getUse() {
        return this.use;
    }

    public void setUse(SearchEnumMultiSelectField use) {
        this.use = use;
    }

    public SearchCustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ChargeSearchBasic)) {
            return false;
        }
        ChargeSearchBasic other = (ChargeSearchBasic)obj;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
        }
        this.__equalsCalc = obj;
        boolean _equals = super.equals(obj) && (this.amount == null && other.getAmount() == null || this.amount != null && this.amount.equals(other.getAmount())) && (this.billingAccount == null && other.getBillingAccount() == null || this.billingAccount != null && this.billingAccount.equals(other.getBillingAccount())) && (this.billingItem == null && other.getBillingItem() == null || this.billingItem != null && this.billingItem.equals(other.getBillingItem())) && (this.billTo == null && other.getBillTo() == null || this.billTo != null && this.billTo.equals(other.getBillTo())) && (this.chargeDate == null && other.getChargeDate() == null || this.chargeDate != null && this.chargeDate.equals(other.getChargeDate())) && (this.chargeType == null && other.getChargeType() == null || this.chargeType != null && this.chargeType.equals(other.getChargeType())) && (this._class == null && other.get_class() == null || this._class != null && this._class.equals(other.get_class())) && (this.createdDate == null && other.getCreatedDate() == null || this.createdDate != null && this.createdDate.equals(other.getCreatedDate())) && (this.currency == null && other.getCurrency() == null || this.currency != null && this.currency.equals(other.getCurrency())) && (this.department == null && other.getDepartment() == null || this.department != null && this.department.equals(other.getDepartment())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId())) && (this.externalIdString == null && other.getExternalIdString() == null || this.externalIdString != null && this.externalIdString.equals(other.getExternalIdString())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.internalIdNumber == null && other.getInternalIdNumber() == null || this.internalIdNumber != null && this.internalIdNumber.equals(other.getInternalIdNumber())) && (this.location == null && other.getLocation() == null || this.location != null && this.location.equals(other.getLocation())) && (this.modifiedDate == null && other.getModifiedDate() == null || this.modifiedDate != null && this.modifiedDate.equals(other.getModifiedDate())) && (this.postingPeriod == null && other.getPostingPeriod() == null || this.postingPeriod != null && this.postingPeriod.equals(other.getPostingPeriod())) && (this.postingPeriodRelative == null && other.getPostingPeriodRelative() == null || this.postingPeriodRelative != null && this.postingPeriodRelative.equals(other.getPostingPeriodRelative())) && (this.quantity == null && other.getQuantity() == null || this.quantity != null && this.quantity.equals(other.getQuantity())) && (this.rate == null && other.getRate() == null || this.rate != null && this.rate.equals(other.getRate())) && (this.rule == null && other.getRule() == null || this.rule != null && this.rule.equals(other.getRule())) && (this.runId == null && other.getRunId() == null || this.runId != null && this.runId.equals(other.getRunId())) && (this.salesOrder == null && other.getSalesOrder() == null || this.salesOrder != null && this.salesOrder.equals(other.getSalesOrder())) && (this.stage == null && other.getStage() == null || this.stage != null && this.stage.equals(other.getStage())) && (this.subscriptionLine == null && other.getSubscriptionLine() == null || this.subscriptionLine != null && this.subscriptionLine.equals(other.getSubscriptionLine())) && (this.use == null && other.getUse() == null || this.use != null && this.use.equals(other.getUse())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
        this.__equalsCalc = null;
        return _equals;
    }

    @Override
    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (this.getAmount() != null) {
            _hashCode += this.getAmount().hashCode();
        }
        if (this.getBillingAccount() != null) {
            _hashCode += this.getBillingAccount().hashCode();
        }
        if (this.getBillingItem() != null) {
            _hashCode += this.getBillingItem().hashCode();
        }
        if (this.getBillTo() != null) {
            _hashCode += this.getBillTo().hashCode();
        }
        if (this.getChargeDate() != null) {
            _hashCode += this.getChargeDate().hashCode();
        }
        if (this.getChargeType() != null) {
            _hashCode += this.getChargeType().hashCode();
        }
        if (this.get_class() != null) {
            _hashCode += this.get_class().hashCode();
        }
        if (this.getCreatedDate() != null) {
            _hashCode += this.getCreatedDate().hashCode();
        }
        if (this.getCurrency() != null) {
            _hashCode += this.getCurrency().hashCode();
        }
        if (this.getDepartment() != null) {
            _hashCode += this.getDepartment().hashCode();
        }
        if (this.getExternalId() != null) {
            _hashCode += this.getExternalId().hashCode();
        }
        if (this.getExternalIdString() != null) {
            _hashCode += this.getExternalIdString().hashCode();
        }
        if (this.getInternalId() != null) {
            _hashCode += this.getInternalId().hashCode();
        }
        if (this.getInternalIdNumber() != null) {
            _hashCode += this.getInternalIdNumber().hashCode();
        }
        if (this.getLocation() != null) {
            _hashCode += this.getLocation().hashCode();
        }
        if (this.getModifiedDate() != null) {
            _hashCode += this.getModifiedDate().hashCode();
        }
        if (this.getPostingPeriod() != null) {
            _hashCode += this.getPostingPeriod().hashCode();
        }
        if (this.getPostingPeriodRelative() != null) {
            _hashCode += this.getPostingPeriodRelative().hashCode();
        }
        if (this.getQuantity() != null) {
            _hashCode += this.getQuantity().hashCode();
        }
        if (this.getRate() != null) {
            _hashCode += this.getRate().hashCode();
        }
        if (this.getRule() != null) {
            _hashCode += this.getRule().hashCode();
        }
        if (this.getRunId() != null) {
            _hashCode += this.getRunId().hashCode();
        }
        if (this.getSalesOrder() != null) {
            _hashCode += this.getSalesOrder().hashCode();
        }
        if (this.getStage() != null) {
            _hashCode += this.getStage().hashCode();
        }
        if (this.getSubscriptionLine() != null) {
            _hashCode += this.getSubscriptionLine().hashCode();
        }
        if (this.getUse() != null) {
            _hashCode += this.getUse().hashCode();
        }
        if (this.getCustomFieldList() != null) {
            _hashCode += this.getCustomFieldList().hashCode();
        }
        this.__hashCodeCalc = false;
        return _hashCode;
    }

    public static TypeDesc getTypeDesc() {
        return typeDesc;
    }

    public static Serializer getSerializer(String mechType, Class _javaType, QName _xmlType) {
        return new BeanSerializer(_javaType, _xmlType, typeDesc);
    }

    public static Deserializer getDeserializer(String mechType, Class _javaType, QName _xmlType) {
        return new BeanDeserializer(_javaType, _xmlType, typeDesc);
    }

    static {
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ChargeSearchBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "amount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billingAccount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billingAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billingItem");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billingItem"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billTo");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billTo"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("chargeDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "chargeDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("chargeType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "chargeType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "class"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "department"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "externalId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("externalIdString");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "externalIdString"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("internalIdNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "internalIdNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "location"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("modifiedDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "modifiedDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("postingPeriod");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "postingPeriod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("postingPeriodRelative");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "postingPeriodRelative"));
        elemField.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "PostingPeriodDate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "quantity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("rate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "rate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("rule");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "rule"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("runId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "runId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("salesOrder");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "salesOrder"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("stage");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "stage"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subscriptionLine");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "subscriptionLine"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("use");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "use"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchCustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

