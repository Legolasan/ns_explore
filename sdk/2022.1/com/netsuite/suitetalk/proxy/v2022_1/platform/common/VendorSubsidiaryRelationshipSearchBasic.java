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

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchBooleanField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchCustomFieldList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchDoubleField;
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

public class VendorSubsidiaryRelationshipSearchBasic
extends SearchRecordBasic
implements Serializable {
    private SearchDoubleField balance;
    private SearchDoubleField balanceBase;
    private SearchMultiSelectField baseCurrency;
    private SearchDoubleField creditLimit;
    private SearchMultiSelectField entity;
    private SearchMultiSelectField externalId;
    private SearchStringField externalIdString;
    private SearchMultiSelectField internalId;
    private SearchLongField internalIdNumber;
    private SearchDoubleField inTransitBalance;
    private SearchDoubleField inTransitBalanceBase;
    private SearchBooleanField isPrimarySub;
    private SearchMultiSelectField primaryCurrency;
    private SearchMultiSelectField subsidiary;
    private SearchMultiSelectField taxItem;
    private SearchDoubleField unbilledOrders;
    private SearchDoubleField unbilledOrdersBase;
    private SearchCustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(VendorSubsidiaryRelationshipSearchBasic.class, true);

    public VendorSubsidiaryRelationshipSearchBasic() {
    }

    public VendorSubsidiaryRelationshipSearchBasic(SearchDoubleField balance, SearchDoubleField balanceBase, SearchMultiSelectField baseCurrency, SearchDoubleField creditLimit, SearchMultiSelectField entity, SearchMultiSelectField externalId, SearchStringField externalIdString, SearchMultiSelectField internalId, SearchLongField internalIdNumber, SearchDoubleField inTransitBalance, SearchDoubleField inTransitBalanceBase, SearchBooleanField isPrimarySub, SearchMultiSelectField primaryCurrency, SearchMultiSelectField subsidiary, SearchMultiSelectField taxItem, SearchDoubleField unbilledOrders, SearchDoubleField unbilledOrdersBase, SearchCustomFieldList customFieldList) {
        this.balance = balance;
        this.balanceBase = balanceBase;
        this.baseCurrency = baseCurrency;
        this.creditLimit = creditLimit;
        this.entity = entity;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.inTransitBalance = inTransitBalance;
        this.inTransitBalanceBase = inTransitBalanceBase;
        this.isPrimarySub = isPrimarySub;
        this.primaryCurrency = primaryCurrency;
        this.subsidiary = subsidiary;
        this.taxItem = taxItem;
        this.unbilledOrders = unbilledOrders;
        this.unbilledOrdersBase = unbilledOrdersBase;
        this.customFieldList = customFieldList;
    }

    public SearchDoubleField getBalance() {
        return this.balance;
    }

    public void setBalance(SearchDoubleField balance) {
        this.balance = balance;
    }

    public SearchDoubleField getBalanceBase() {
        return this.balanceBase;
    }

    public void setBalanceBase(SearchDoubleField balanceBase) {
        this.balanceBase = balanceBase;
    }

    public SearchMultiSelectField getBaseCurrency() {
        return this.baseCurrency;
    }

    public void setBaseCurrency(SearchMultiSelectField baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public SearchDoubleField getCreditLimit() {
        return this.creditLimit;
    }

    public void setCreditLimit(SearchDoubleField creditLimit) {
        this.creditLimit = creditLimit;
    }

    public SearchMultiSelectField getEntity() {
        return this.entity;
    }

    public void setEntity(SearchMultiSelectField entity) {
        this.entity = entity;
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

    public SearchDoubleField getInTransitBalance() {
        return this.inTransitBalance;
    }

    public void setInTransitBalance(SearchDoubleField inTransitBalance) {
        this.inTransitBalance = inTransitBalance;
    }

    public SearchDoubleField getInTransitBalanceBase() {
        return this.inTransitBalanceBase;
    }

    public void setInTransitBalanceBase(SearchDoubleField inTransitBalanceBase) {
        this.inTransitBalanceBase = inTransitBalanceBase;
    }

    public SearchBooleanField getIsPrimarySub() {
        return this.isPrimarySub;
    }

    public void setIsPrimarySub(SearchBooleanField isPrimarySub) {
        this.isPrimarySub = isPrimarySub;
    }

    public SearchMultiSelectField getPrimaryCurrency() {
        return this.primaryCurrency;
    }

    public void setPrimaryCurrency(SearchMultiSelectField primaryCurrency) {
        this.primaryCurrency = primaryCurrency;
    }

    public SearchMultiSelectField getSubsidiary() {
        return this.subsidiary;
    }

    public void setSubsidiary(SearchMultiSelectField subsidiary) {
        this.subsidiary = subsidiary;
    }

    public SearchMultiSelectField getTaxItem() {
        return this.taxItem;
    }

    public void setTaxItem(SearchMultiSelectField taxItem) {
        this.taxItem = taxItem;
    }

    public SearchDoubleField getUnbilledOrders() {
        return this.unbilledOrders;
    }

    public void setUnbilledOrders(SearchDoubleField unbilledOrders) {
        this.unbilledOrders = unbilledOrders;
    }

    public SearchDoubleField getUnbilledOrdersBase() {
        return this.unbilledOrdersBase;
    }

    public void setUnbilledOrdersBase(SearchDoubleField unbilledOrdersBase) {
        this.unbilledOrdersBase = unbilledOrdersBase;
    }

    public SearchCustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof VendorSubsidiaryRelationshipSearchBasic)) {
            return false;
        }
        VendorSubsidiaryRelationshipSearchBasic other = (VendorSubsidiaryRelationshipSearchBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.balance == null && other.getBalance() == null || this.balance != null && this.balance.equals(other.getBalance())) && (this.balanceBase == null && other.getBalanceBase() == null || this.balanceBase != null && this.balanceBase.equals(other.getBalanceBase())) && (this.baseCurrency == null && other.getBaseCurrency() == null || this.baseCurrency != null && this.baseCurrency.equals(other.getBaseCurrency())) && (this.creditLimit == null && other.getCreditLimit() == null || this.creditLimit != null && this.creditLimit.equals(other.getCreditLimit())) && (this.entity == null && other.getEntity() == null || this.entity != null && this.entity.equals(other.getEntity())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId())) && (this.externalIdString == null && other.getExternalIdString() == null || this.externalIdString != null && this.externalIdString.equals(other.getExternalIdString())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.internalIdNumber == null && other.getInternalIdNumber() == null || this.internalIdNumber != null && this.internalIdNumber.equals(other.getInternalIdNumber())) && (this.inTransitBalance == null && other.getInTransitBalance() == null || this.inTransitBalance != null && this.inTransitBalance.equals(other.getInTransitBalance())) && (this.inTransitBalanceBase == null && other.getInTransitBalanceBase() == null || this.inTransitBalanceBase != null && this.inTransitBalanceBase.equals(other.getInTransitBalanceBase())) && (this.isPrimarySub == null && other.getIsPrimarySub() == null || this.isPrimarySub != null && this.isPrimarySub.equals(other.getIsPrimarySub())) && (this.primaryCurrency == null && other.getPrimaryCurrency() == null || this.primaryCurrency != null && this.primaryCurrency.equals(other.getPrimaryCurrency())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && this.subsidiary.equals(other.getSubsidiary())) && (this.taxItem == null && other.getTaxItem() == null || this.taxItem != null && this.taxItem.equals(other.getTaxItem())) && (this.unbilledOrders == null && other.getUnbilledOrders() == null || this.unbilledOrders != null && this.unbilledOrders.equals(other.getUnbilledOrders())) && (this.unbilledOrdersBase == null && other.getUnbilledOrdersBase() == null || this.unbilledOrdersBase != null && this.unbilledOrdersBase.equals(other.getUnbilledOrdersBase())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
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
        if (this.getBalance() != null) {
            _hashCode += this.getBalance().hashCode();
        }
        if (this.getBalanceBase() != null) {
            _hashCode += this.getBalanceBase().hashCode();
        }
        if (this.getBaseCurrency() != null) {
            _hashCode += this.getBaseCurrency().hashCode();
        }
        if (this.getCreditLimit() != null) {
            _hashCode += this.getCreditLimit().hashCode();
        }
        if (this.getEntity() != null) {
            _hashCode += this.getEntity().hashCode();
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
        if (this.getInTransitBalance() != null) {
            _hashCode += this.getInTransitBalance().hashCode();
        }
        if (this.getInTransitBalanceBase() != null) {
            _hashCode += this.getInTransitBalanceBase().hashCode();
        }
        if (this.getIsPrimarySub() != null) {
            _hashCode += this.getIsPrimarySub().hashCode();
        }
        if (this.getPrimaryCurrency() != null) {
            _hashCode += this.getPrimaryCurrency().hashCode();
        }
        if (this.getSubsidiary() != null) {
            _hashCode += this.getSubsidiary().hashCode();
        }
        if (this.getTaxItem() != null) {
            _hashCode += this.getTaxItem().hashCode();
        }
        if (this.getUnbilledOrders() != null) {
            _hashCode += this.getUnbilledOrders().hashCode();
        }
        if (this.getUnbilledOrdersBase() != null) {
            _hashCode += this.getUnbilledOrdersBase().hashCode();
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "VendorSubsidiaryRelationshipSearchBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "balance"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("balanceBase");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "balanceBase"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("baseCurrency");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "baseCurrency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("creditLimit");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "creditLimit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("entity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "entity"));
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
        elemField.setFieldName("inTransitBalance");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "inTransitBalance"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("inTransitBalanceBase");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "inTransitBalanceBase"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isPrimarySub");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isPrimarySub"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("primaryCurrency");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "primaryCurrency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxItem");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "taxItem"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("unbilledOrders");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "unbilledOrders"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("unbilledOrdersBase");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "unbilledOrdersBase"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
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

