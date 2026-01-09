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

public class AccountSearchBasic
extends SearchRecordBasic
implements Serializable {
    private SearchMultiSelectField accountingContext;
    private SearchDoubleField balance;
    private SearchEnumMultiSelectField cashFlowRateType;
    private SearchMultiSelectField category1099Misc;
    private SearchStringField description;
    private SearchStringField displayName;
    private SearchMultiSelectField externalId;
    private SearchStringField externalIdString;
    private SearchEnumMultiSelectField generalRateType;
    private SearchMultiSelectField internalId;
    private SearchLongField internalIdNumber;
    private SearchBooleanField isInactive;
    private SearchStringField legalName;
    private SearchEnumMultiSelectField locale;
    private SearchStringField localizedLegalName;
    private SearchStringField localizedName;
    private SearchStringField localizedNumber;
    private SearchStringField name;
    private SearchStringField number;
    private SearchMultiSelectField parent;
    private SearchMultiSelectField subsidiary;
    private SearchEnumMultiSelectField type;
    private SearchCustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(AccountSearchBasic.class, true);

    public AccountSearchBasic() {
    }

    public AccountSearchBasic(SearchMultiSelectField accountingContext, SearchDoubleField balance, SearchEnumMultiSelectField cashFlowRateType, SearchMultiSelectField category1099Misc, SearchStringField description, SearchStringField displayName, SearchMultiSelectField externalId, SearchStringField externalIdString, SearchEnumMultiSelectField generalRateType, SearchMultiSelectField internalId, SearchLongField internalIdNumber, SearchBooleanField isInactive, SearchStringField legalName, SearchEnumMultiSelectField locale, SearchStringField localizedLegalName, SearchStringField localizedName, SearchStringField localizedNumber, SearchStringField name, SearchStringField number, SearchMultiSelectField parent, SearchMultiSelectField subsidiary, SearchEnumMultiSelectField type, SearchCustomFieldList customFieldList) {
        this.accountingContext = accountingContext;
        this.balance = balance;
        this.cashFlowRateType = cashFlowRateType;
        this.category1099Misc = category1099Misc;
        this.description = description;
        this.displayName = displayName;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.generalRateType = generalRateType;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isInactive = isInactive;
        this.legalName = legalName;
        this.locale = locale;
        this.localizedLegalName = localizedLegalName;
        this.localizedName = localizedName;
        this.localizedNumber = localizedNumber;
        this.name = name;
        this.number = number;
        this.parent = parent;
        this.subsidiary = subsidiary;
        this.type = type;
        this.customFieldList = customFieldList;
    }

    public SearchMultiSelectField getAccountingContext() {
        return this.accountingContext;
    }

    public void setAccountingContext(SearchMultiSelectField accountingContext) {
        this.accountingContext = accountingContext;
    }

    public SearchDoubleField getBalance() {
        return this.balance;
    }

    public void setBalance(SearchDoubleField balance) {
        this.balance = balance;
    }

    public SearchEnumMultiSelectField getCashFlowRateType() {
        return this.cashFlowRateType;
    }

    public void setCashFlowRateType(SearchEnumMultiSelectField cashFlowRateType) {
        this.cashFlowRateType = cashFlowRateType;
    }

    public SearchMultiSelectField getCategory1099Misc() {
        return this.category1099Misc;
    }

    public void setCategory1099Misc(SearchMultiSelectField category1099Misc) {
        this.category1099Misc = category1099Misc;
    }

    public SearchStringField getDescription() {
        return this.description;
    }

    public void setDescription(SearchStringField description) {
        this.description = description;
    }

    public SearchStringField getDisplayName() {
        return this.displayName;
    }

    public void setDisplayName(SearchStringField displayName) {
        this.displayName = displayName;
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

    public SearchEnumMultiSelectField getGeneralRateType() {
        return this.generalRateType;
    }

    public void setGeneralRateType(SearchEnumMultiSelectField generalRateType) {
        this.generalRateType = generalRateType;
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

    public SearchBooleanField getIsInactive() {
        return this.isInactive;
    }

    public void setIsInactive(SearchBooleanField isInactive) {
        this.isInactive = isInactive;
    }

    public SearchStringField getLegalName() {
        return this.legalName;
    }

    public void setLegalName(SearchStringField legalName) {
        this.legalName = legalName;
    }

    public SearchEnumMultiSelectField getLocale() {
        return this.locale;
    }

    public void setLocale(SearchEnumMultiSelectField locale) {
        this.locale = locale;
    }

    public SearchStringField getLocalizedLegalName() {
        return this.localizedLegalName;
    }

    public void setLocalizedLegalName(SearchStringField localizedLegalName) {
        this.localizedLegalName = localizedLegalName;
    }

    public SearchStringField getLocalizedName() {
        return this.localizedName;
    }

    public void setLocalizedName(SearchStringField localizedName) {
        this.localizedName = localizedName;
    }

    public SearchStringField getLocalizedNumber() {
        return this.localizedNumber;
    }

    public void setLocalizedNumber(SearchStringField localizedNumber) {
        this.localizedNumber = localizedNumber;
    }

    public SearchStringField getName() {
        return this.name;
    }

    public void setName(SearchStringField name) {
        this.name = name;
    }

    public SearchStringField getNumber() {
        return this.number;
    }

    public void setNumber(SearchStringField number) {
        this.number = number;
    }

    public SearchMultiSelectField getParent() {
        return this.parent;
    }

    public void setParent(SearchMultiSelectField parent) {
        this.parent = parent;
    }

    public SearchMultiSelectField getSubsidiary() {
        return this.subsidiary;
    }

    public void setSubsidiary(SearchMultiSelectField subsidiary) {
        this.subsidiary = subsidiary;
    }

    public SearchEnumMultiSelectField getType() {
        return this.type;
    }

    public void setType(SearchEnumMultiSelectField type) {
        this.type = type;
    }

    public SearchCustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof AccountSearchBasic)) {
            return false;
        }
        AccountSearchBasic other = (AccountSearchBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.accountingContext == null && other.getAccountingContext() == null || this.accountingContext != null && this.accountingContext.equals(other.getAccountingContext())) && (this.balance == null && other.getBalance() == null || this.balance != null && this.balance.equals(other.getBalance())) && (this.cashFlowRateType == null && other.getCashFlowRateType() == null || this.cashFlowRateType != null && this.cashFlowRateType.equals(other.getCashFlowRateType())) && (this.category1099Misc == null && other.getCategory1099Misc() == null || this.category1099Misc != null && this.category1099Misc.equals(other.getCategory1099Misc())) && (this.description == null && other.getDescription() == null || this.description != null && this.description.equals(other.getDescription())) && (this.displayName == null && other.getDisplayName() == null || this.displayName != null && this.displayName.equals(other.getDisplayName())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId())) && (this.externalIdString == null && other.getExternalIdString() == null || this.externalIdString != null && this.externalIdString.equals(other.getExternalIdString())) && (this.generalRateType == null && other.getGeneralRateType() == null || this.generalRateType != null && this.generalRateType.equals(other.getGeneralRateType())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.internalIdNumber == null && other.getInternalIdNumber() == null || this.internalIdNumber != null && this.internalIdNumber.equals(other.getInternalIdNumber())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && this.isInactive.equals(other.getIsInactive())) && (this.legalName == null && other.getLegalName() == null || this.legalName != null && this.legalName.equals(other.getLegalName())) && (this.locale == null && other.getLocale() == null || this.locale != null && this.locale.equals(other.getLocale())) && (this.localizedLegalName == null && other.getLocalizedLegalName() == null || this.localizedLegalName != null && this.localizedLegalName.equals(other.getLocalizedLegalName())) && (this.localizedName == null && other.getLocalizedName() == null || this.localizedName != null && this.localizedName.equals(other.getLocalizedName())) && (this.localizedNumber == null && other.getLocalizedNumber() == null || this.localizedNumber != null && this.localizedNumber.equals(other.getLocalizedNumber())) && (this.name == null && other.getName() == null || this.name != null && this.name.equals(other.getName())) && (this.number == null && other.getNumber() == null || this.number != null && this.number.equals(other.getNumber())) && (this.parent == null && other.getParent() == null || this.parent != null && this.parent.equals(other.getParent())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && this.subsidiary.equals(other.getSubsidiary())) && (this.type == null && other.getType() == null || this.type != null && this.type.equals(other.getType())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
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
        if (this.getAccountingContext() != null) {
            _hashCode += this.getAccountingContext().hashCode();
        }
        if (this.getBalance() != null) {
            _hashCode += this.getBalance().hashCode();
        }
        if (this.getCashFlowRateType() != null) {
            _hashCode += this.getCashFlowRateType().hashCode();
        }
        if (this.getCategory1099Misc() != null) {
            _hashCode += this.getCategory1099Misc().hashCode();
        }
        if (this.getDescription() != null) {
            _hashCode += this.getDescription().hashCode();
        }
        if (this.getDisplayName() != null) {
            _hashCode += this.getDisplayName().hashCode();
        }
        if (this.getExternalId() != null) {
            _hashCode += this.getExternalId().hashCode();
        }
        if (this.getExternalIdString() != null) {
            _hashCode += this.getExternalIdString().hashCode();
        }
        if (this.getGeneralRateType() != null) {
            _hashCode += this.getGeneralRateType().hashCode();
        }
        if (this.getInternalId() != null) {
            _hashCode += this.getInternalId().hashCode();
        }
        if (this.getInternalIdNumber() != null) {
            _hashCode += this.getInternalIdNumber().hashCode();
        }
        if (this.getIsInactive() != null) {
            _hashCode += this.getIsInactive().hashCode();
        }
        if (this.getLegalName() != null) {
            _hashCode += this.getLegalName().hashCode();
        }
        if (this.getLocale() != null) {
            _hashCode += this.getLocale().hashCode();
        }
        if (this.getLocalizedLegalName() != null) {
            _hashCode += this.getLocalizedLegalName().hashCode();
        }
        if (this.getLocalizedName() != null) {
            _hashCode += this.getLocalizedName().hashCode();
        }
        if (this.getLocalizedNumber() != null) {
            _hashCode += this.getLocalizedNumber().hashCode();
        }
        if (this.getName() != null) {
            _hashCode += this.getName().hashCode();
        }
        if (this.getNumber() != null) {
            _hashCode += this.getNumber().hashCode();
        }
        if (this.getParent() != null) {
            _hashCode += this.getParent().hashCode();
        }
        if (this.getSubsidiary() != null) {
            _hashCode += this.getSubsidiary().hashCode();
        }
        if (this.getType() != null) {
            _hashCode += this.getType().hashCode();
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "AccountSearchBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("accountingContext");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "accountingContext"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "balance"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("cashFlowRateType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "cashFlowRateType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("category1099Misc");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "category1099Misc"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "description"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("displayName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "displayName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
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
        elemField.setFieldName("generalRateType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "generalRateType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
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
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("legalName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "legalName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locale");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locale"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("localizedLegalName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "localizedLegalName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("localizedName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "localizedName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("localizedNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "localizedNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "name"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "number"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "parent"));
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
        elemField.setFieldName("type");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "type"));
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

