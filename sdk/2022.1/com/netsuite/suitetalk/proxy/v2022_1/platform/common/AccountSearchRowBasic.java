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

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnBooleanField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnCustomFieldList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnDoubleField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnEnumSelectField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnSelectField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnStringField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchRowBasic;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class AccountSearchRowBasic
extends SearchRowBasic
implements Serializable {
    private SearchColumnStringField[] accountingContext;
    private SearchColumnDoubleField[] balance;
    private SearchColumnEnumSelectField[] cashFlowRateType;
    private SearchColumnSelectField[] category1099Misc;
    private SearchColumnStringField[] description;
    private SearchColumnStringField[] displayName;
    private SearchColumnSelectField[] externalId;
    private SearchColumnEnumSelectField[] generalRateType;
    private SearchColumnSelectField[] internalId;
    private SearchColumnBooleanField[] isInactive;
    private SearchColumnStringField[] legalName;
    private SearchColumnStringField[] locale;
    private SearchColumnStringField[] localizedLegalName;
    private SearchColumnStringField[] localizedName;
    private SearchColumnStringField[] localizedNumber;
    private SearchColumnStringField[] name;
    private SearchColumnStringField[] number;
    private SearchColumnSelectField[] subsidiary;
    private SearchColumnEnumSelectField[] type;
    private SearchColumnCustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(AccountSearchRowBasic.class, true);

    public AccountSearchRowBasic() {
    }

    public AccountSearchRowBasic(SearchColumnStringField[] accountingContext, SearchColumnDoubleField[] balance, SearchColumnEnumSelectField[] cashFlowRateType, SearchColumnSelectField[] category1099Misc, SearchColumnStringField[] description, SearchColumnStringField[] displayName, SearchColumnSelectField[] externalId, SearchColumnEnumSelectField[] generalRateType, SearchColumnSelectField[] internalId, SearchColumnBooleanField[] isInactive, SearchColumnStringField[] legalName, SearchColumnStringField[] locale, SearchColumnStringField[] localizedLegalName, SearchColumnStringField[] localizedName, SearchColumnStringField[] localizedNumber, SearchColumnStringField[] name, SearchColumnStringField[] number, SearchColumnSelectField[] subsidiary, SearchColumnEnumSelectField[] type, SearchColumnCustomFieldList customFieldList) {
        this.accountingContext = accountingContext;
        this.balance = balance;
        this.cashFlowRateType = cashFlowRateType;
        this.category1099Misc = category1099Misc;
        this.description = description;
        this.displayName = displayName;
        this.externalId = externalId;
        this.generalRateType = generalRateType;
        this.internalId = internalId;
        this.isInactive = isInactive;
        this.legalName = legalName;
        this.locale = locale;
        this.localizedLegalName = localizedLegalName;
        this.localizedName = localizedName;
        this.localizedNumber = localizedNumber;
        this.name = name;
        this.number = number;
        this.subsidiary = subsidiary;
        this.type = type;
        this.customFieldList = customFieldList;
    }

    public SearchColumnStringField[] getAccountingContext() {
        return this.accountingContext;
    }

    public void setAccountingContext(SearchColumnStringField[] accountingContext) {
        this.accountingContext = accountingContext;
    }

    public SearchColumnStringField getAccountingContext(int i) {
        return this.accountingContext[i];
    }

    public void setAccountingContext(int i, SearchColumnStringField _value) {
        this.accountingContext[i] = _value;
    }

    public SearchColumnDoubleField[] getBalance() {
        return this.balance;
    }

    public void setBalance(SearchColumnDoubleField[] balance) {
        this.balance = balance;
    }

    public SearchColumnDoubleField getBalance(int i) {
        return this.balance[i];
    }

    public void setBalance(int i, SearchColumnDoubleField _value) {
        this.balance[i] = _value;
    }

    public SearchColumnEnumSelectField[] getCashFlowRateType() {
        return this.cashFlowRateType;
    }

    public void setCashFlowRateType(SearchColumnEnumSelectField[] cashFlowRateType) {
        this.cashFlowRateType = cashFlowRateType;
    }

    public SearchColumnEnumSelectField getCashFlowRateType(int i) {
        return this.cashFlowRateType[i];
    }

    public void setCashFlowRateType(int i, SearchColumnEnumSelectField _value) {
        this.cashFlowRateType[i] = _value;
    }

    public SearchColumnSelectField[] getCategory1099Misc() {
        return this.category1099Misc;
    }

    public void setCategory1099Misc(SearchColumnSelectField[] category1099Misc) {
        this.category1099Misc = category1099Misc;
    }

    public SearchColumnSelectField getCategory1099Misc(int i) {
        return this.category1099Misc[i];
    }

    public void setCategory1099Misc(int i, SearchColumnSelectField _value) {
        this.category1099Misc[i] = _value;
    }

    public SearchColumnStringField[] getDescription() {
        return this.description;
    }

    public void setDescription(SearchColumnStringField[] description) {
        this.description = description;
    }

    public SearchColumnStringField getDescription(int i) {
        return this.description[i];
    }

    public void setDescription(int i, SearchColumnStringField _value) {
        this.description[i] = _value;
    }

    public SearchColumnStringField[] getDisplayName() {
        return this.displayName;
    }

    public void setDisplayName(SearchColumnStringField[] displayName) {
        this.displayName = displayName;
    }

    public SearchColumnStringField getDisplayName(int i) {
        return this.displayName[i];
    }

    public void setDisplayName(int i, SearchColumnStringField _value) {
        this.displayName[i] = _value;
    }

    public SearchColumnSelectField[] getExternalId() {
        return this.externalId;
    }

    public void setExternalId(SearchColumnSelectField[] externalId) {
        this.externalId = externalId;
    }

    public SearchColumnSelectField getExternalId(int i) {
        return this.externalId[i];
    }

    public void setExternalId(int i, SearchColumnSelectField _value) {
        this.externalId[i] = _value;
    }

    public SearchColumnEnumSelectField[] getGeneralRateType() {
        return this.generalRateType;
    }

    public void setGeneralRateType(SearchColumnEnumSelectField[] generalRateType) {
        this.generalRateType = generalRateType;
    }

    public SearchColumnEnumSelectField getGeneralRateType(int i) {
        return this.generalRateType[i];
    }

    public void setGeneralRateType(int i, SearchColumnEnumSelectField _value) {
        this.generalRateType[i] = _value;
    }

    public SearchColumnSelectField[] getInternalId() {
        return this.internalId;
    }

    public void setInternalId(SearchColumnSelectField[] internalId) {
        this.internalId = internalId;
    }

    public SearchColumnSelectField getInternalId(int i) {
        return this.internalId[i];
    }

    public void setInternalId(int i, SearchColumnSelectField _value) {
        this.internalId[i] = _value;
    }

    public SearchColumnBooleanField[] getIsInactive() {
        return this.isInactive;
    }

    public void setIsInactive(SearchColumnBooleanField[] isInactive) {
        this.isInactive = isInactive;
    }

    public SearchColumnBooleanField getIsInactive(int i) {
        return this.isInactive[i];
    }

    public void setIsInactive(int i, SearchColumnBooleanField _value) {
        this.isInactive[i] = _value;
    }

    public SearchColumnStringField[] getLegalName() {
        return this.legalName;
    }

    public void setLegalName(SearchColumnStringField[] legalName) {
        this.legalName = legalName;
    }

    public SearchColumnStringField getLegalName(int i) {
        return this.legalName[i];
    }

    public void setLegalName(int i, SearchColumnStringField _value) {
        this.legalName[i] = _value;
    }

    public SearchColumnStringField[] getLocale() {
        return this.locale;
    }

    public void setLocale(SearchColumnStringField[] locale) {
        this.locale = locale;
    }

    public SearchColumnStringField getLocale(int i) {
        return this.locale[i];
    }

    public void setLocale(int i, SearchColumnStringField _value) {
        this.locale[i] = _value;
    }

    public SearchColumnStringField[] getLocalizedLegalName() {
        return this.localizedLegalName;
    }

    public void setLocalizedLegalName(SearchColumnStringField[] localizedLegalName) {
        this.localizedLegalName = localizedLegalName;
    }

    public SearchColumnStringField getLocalizedLegalName(int i) {
        return this.localizedLegalName[i];
    }

    public void setLocalizedLegalName(int i, SearchColumnStringField _value) {
        this.localizedLegalName[i] = _value;
    }

    public SearchColumnStringField[] getLocalizedName() {
        return this.localizedName;
    }

    public void setLocalizedName(SearchColumnStringField[] localizedName) {
        this.localizedName = localizedName;
    }

    public SearchColumnStringField getLocalizedName(int i) {
        return this.localizedName[i];
    }

    public void setLocalizedName(int i, SearchColumnStringField _value) {
        this.localizedName[i] = _value;
    }

    public SearchColumnStringField[] getLocalizedNumber() {
        return this.localizedNumber;
    }

    public void setLocalizedNumber(SearchColumnStringField[] localizedNumber) {
        this.localizedNumber = localizedNumber;
    }

    public SearchColumnStringField getLocalizedNumber(int i) {
        return this.localizedNumber[i];
    }

    public void setLocalizedNumber(int i, SearchColumnStringField _value) {
        this.localizedNumber[i] = _value;
    }

    public SearchColumnStringField[] getName() {
        return this.name;
    }

    public void setName(SearchColumnStringField[] name) {
        this.name = name;
    }

    public SearchColumnStringField getName(int i) {
        return this.name[i];
    }

    public void setName(int i, SearchColumnStringField _value) {
        this.name[i] = _value;
    }

    public SearchColumnStringField[] getNumber() {
        return this.number;
    }

    public void setNumber(SearchColumnStringField[] number) {
        this.number = number;
    }

    public SearchColumnStringField getNumber(int i) {
        return this.number[i];
    }

    public void setNumber(int i, SearchColumnStringField _value) {
        this.number[i] = _value;
    }

    public SearchColumnSelectField[] getSubsidiary() {
        return this.subsidiary;
    }

    public void setSubsidiary(SearchColumnSelectField[] subsidiary) {
        this.subsidiary = subsidiary;
    }

    public SearchColumnSelectField getSubsidiary(int i) {
        return this.subsidiary[i];
    }

    public void setSubsidiary(int i, SearchColumnSelectField _value) {
        this.subsidiary[i] = _value;
    }

    public SearchColumnEnumSelectField[] getType() {
        return this.type;
    }

    public void setType(SearchColumnEnumSelectField[] type) {
        this.type = type;
    }

    public SearchColumnEnumSelectField getType(int i) {
        return this.type[i];
    }

    public void setType(int i, SearchColumnEnumSelectField _value) {
        this.type[i] = _value;
    }

    public SearchColumnCustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof AccountSearchRowBasic)) {
            return false;
        }
        AccountSearchRowBasic other = (AccountSearchRowBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.accountingContext == null && other.getAccountingContext() == null || this.accountingContext != null && Arrays.equals(this.accountingContext, other.getAccountingContext())) && (this.balance == null && other.getBalance() == null || this.balance != null && Arrays.equals(this.balance, other.getBalance())) && (this.cashFlowRateType == null && other.getCashFlowRateType() == null || this.cashFlowRateType != null && Arrays.equals(this.cashFlowRateType, other.getCashFlowRateType())) && (this.category1099Misc == null && other.getCategory1099Misc() == null || this.category1099Misc != null && Arrays.equals(this.category1099Misc, other.getCategory1099Misc())) && (this.description == null && other.getDescription() == null || this.description != null && Arrays.equals(this.description, other.getDescription())) && (this.displayName == null && other.getDisplayName() == null || this.displayName != null && Arrays.equals(this.displayName, other.getDisplayName())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && Arrays.equals(this.externalId, other.getExternalId())) && (this.generalRateType == null && other.getGeneralRateType() == null || this.generalRateType != null && Arrays.equals(this.generalRateType, other.getGeneralRateType())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && Arrays.equals(this.internalId, other.getInternalId())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && Arrays.equals(this.isInactive, other.getIsInactive())) && (this.legalName == null && other.getLegalName() == null || this.legalName != null && Arrays.equals(this.legalName, other.getLegalName())) && (this.locale == null && other.getLocale() == null || this.locale != null && Arrays.equals(this.locale, other.getLocale())) && (this.localizedLegalName == null && other.getLocalizedLegalName() == null || this.localizedLegalName != null && Arrays.equals(this.localizedLegalName, other.getLocalizedLegalName())) && (this.localizedName == null && other.getLocalizedName() == null || this.localizedName != null && Arrays.equals(this.localizedName, other.getLocalizedName())) && (this.localizedNumber == null && other.getLocalizedNumber() == null || this.localizedNumber != null && Arrays.equals(this.localizedNumber, other.getLocalizedNumber())) && (this.name == null && other.getName() == null || this.name != null && Arrays.equals(this.name, other.getName())) && (this.number == null && other.getNumber() == null || this.number != null && Arrays.equals(this.number, other.getNumber())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && Arrays.equals(this.subsidiary, other.getSubsidiary())) && (this.type == null && other.getType() == null || this.type != null && Arrays.equals(this.type, other.getType())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
        this.__equalsCalc = null;
        return _equals;
    }

    @Override
    public synchronized int hashCode() {
        Object obj;
        int i;
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (this.getAccountingContext() != null) {
            for (i = 0; i < Array.getLength(this.getAccountingContext()); ++i) {
                obj = Array.get(this.getAccountingContext(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBalance() != null) {
            for (i = 0; i < Array.getLength(this.getBalance()); ++i) {
                obj = Array.get(this.getBalance(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCashFlowRateType() != null) {
            for (i = 0; i < Array.getLength(this.getCashFlowRateType()); ++i) {
                obj = Array.get(this.getCashFlowRateType(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCategory1099Misc() != null) {
            for (i = 0; i < Array.getLength(this.getCategory1099Misc()); ++i) {
                obj = Array.get(this.getCategory1099Misc(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDescription() != null) {
            for (i = 0; i < Array.getLength(this.getDescription()); ++i) {
                obj = Array.get(this.getDescription(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDisplayName() != null) {
            for (i = 0; i < Array.getLength(this.getDisplayName()); ++i) {
                obj = Array.get(this.getDisplayName(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getExternalId() != null) {
            for (i = 0; i < Array.getLength(this.getExternalId()); ++i) {
                obj = Array.get(this.getExternalId(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getGeneralRateType() != null) {
            for (i = 0; i < Array.getLength(this.getGeneralRateType()); ++i) {
                obj = Array.get(this.getGeneralRateType(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getInternalId() != null) {
            for (i = 0; i < Array.getLength(this.getInternalId()); ++i) {
                obj = Array.get(this.getInternalId(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsInactive() != null) {
            for (i = 0; i < Array.getLength(this.getIsInactive()); ++i) {
                obj = Array.get(this.getIsInactive(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLegalName() != null) {
            for (i = 0; i < Array.getLength(this.getLegalName()); ++i) {
                obj = Array.get(this.getLegalName(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLocale() != null) {
            for (i = 0; i < Array.getLength(this.getLocale()); ++i) {
                obj = Array.get(this.getLocale(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLocalizedLegalName() != null) {
            for (i = 0; i < Array.getLength(this.getLocalizedLegalName()); ++i) {
                obj = Array.get(this.getLocalizedLegalName(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLocalizedName() != null) {
            for (i = 0; i < Array.getLength(this.getLocalizedName()); ++i) {
                obj = Array.get(this.getLocalizedName(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLocalizedNumber() != null) {
            for (i = 0; i < Array.getLength(this.getLocalizedNumber()); ++i) {
                obj = Array.get(this.getLocalizedNumber(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getName() != null) {
            for (i = 0; i < Array.getLength(this.getName()); ++i) {
                obj = Array.get(this.getName(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getNumber() != null) {
            for (i = 0; i < Array.getLength(this.getNumber()); ++i) {
                obj = Array.get(this.getNumber(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSubsidiary() != null) {
            for (i = 0; i < Array.getLength(this.getSubsidiary()); ++i) {
                obj = Array.get(this.getSubsidiary(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getType() != null) {
            for (i = 0; i < Array.getLength(this.getType()); ++i) {
                obj = Array.get(this.getType(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "AccountSearchRowBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("accountingContext");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "accountingContext"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "balance"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("cashFlowRateType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "cashFlowRateType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("category1099Misc");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "category1099Misc"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "description"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("displayName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "displayName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "externalId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("generalRateType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "generalRateType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("legalName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "legalName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locale");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locale"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("localizedLegalName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "localizedLegalName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("localizedName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "localizedName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("localizedNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "localizedNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "name"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "number"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "type"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnCustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

