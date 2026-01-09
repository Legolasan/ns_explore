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

public class RevRecTemplateSearchBasic
extends SearchRecordBasic
implements Serializable {
    private SearchEnumMultiSelectField amorMethod;
    private SearchLongField amorPeriod;
    private SearchLongField amorStartOffset;
    private SearchEnumMultiSelectField amorTermSrc;
    private SearchEnumMultiSelectField amorType;
    private SearchMultiSelectField contraAccount;
    private SearchMultiSelectField deferralAccount;
    private SearchMultiSelectField externalId;
    private SearchStringField externalIdString;
    private SearchMultiSelectField internalId;
    private SearchLongField internalIdNumber;
    private SearchBooleanField isInactive;
    private SearchStringField name;
    private SearchLongField periodOffset;
    private SearchMultiSelectField targetAccount;
    private SearchBooleanField useForeignAmounts;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(RevRecTemplateSearchBasic.class, true);

    public RevRecTemplateSearchBasic() {
    }

    public RevRecTemplateSearchBasic(SearchEnumMultiSelectField amorMethod, SearchLongField amorPeriod, SearchLongField amorStartOffset, SearchEnumMultiSelectField amorTermSrc, SearchEnumMultiSelectField amorType, SearchMultiSelectField contraAccount, SearchMultiSelectField deferralAccount, SearchMultiSelectField externalId, SearchStringField externalIdString, SearchMultiSelectField internalId, SearchLongField internalIdNumber, SearchBooleanField isInactive, SearchStringField name, SearchLongField periodOffset, SearchMultiSelectField targetAccount, SearchBooleanField useForeignAmounts) {
        this.amorMethod = amorMethod;
        this.amorPeriod = amorPeriod;
        this.amorStartOffset = amorStartOffset;
        this.amorTermSrc = amorTermSrc;
        this.amorType = amorType;
        this.contraAccount = contraAccount;
        this.deferralAccount = deferralAccount;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isInactive = isInactive;
        this.name = name;
        this.periodOffset = periodOffset;
        this.targetAccount = targetAccount;
        this.useForeignAmounts = useForeignAmounts;
    }

    public SearchEnumMultiSelectField getAmorMethod() {
        return this.amorMethod;
    }

    public void setAmorMethod(SearchEnumMultiSelectField amorMethod) {
        this.amorMethod = amorMethod;
    }

    public SearchLongField getAmorPeriod() {
        return this.amorPeriod;
    }

    public void setAmorPeriod(SearchLongField amorPeriod) {
        this.amorPeriod = amorPeriod;
    }

    public SearchLongField getAmorStartOffset() {
        return this.amorStartOffset;
    }

    public void setAmorStartOffset(SearchLongField amorStartOffset) {
        this.amorStartOffset = amorStartOffset;
    }

    public SearchEnumMultiSelectField getAmorTermSrc() {
        return this.amorTermSrc;
    }

    public void setAmorTermSrc(SearchEnumMultiSelectField amorTermSrc) {
        this.amorTermSrc = amorTermSrc;
    }

    public SearchEnumMultiSelectField getAmorType() {
        return this.amorType;
    }

    public void setAmorType(SearchEnumMultiSelectField amorType) {
        this.amorType = amorType;
    }

    public SearchMultiSelectField getContraAccount() {
        return this.contraAccount;
    }

    public void setContraAccount(SearchMultiSelectField contraAccount) {
        this.contraAccount = contraAccount;
    }

    public SearchMultiSelectField getDeferralAccount() {
        return this.deferralAccount;
    }

    public void setDeferralAccount(SearchMultiSelectField deferralAccount) {
        this.deferralAccount = deferralAccount;
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

    public SearchBooleanField getIsInactive() {
        return this.isInactive;
    }

    public void setIsInactive(SearchBooleanField isInactive) {
        this.isInactive = isInactive;
    }

    public SearchStringField getName() {
        return this.name;
    }

    public void setName(SearchStringField name) {
        this.name = name;
    }

    public SearchLongField getPeriodOffset() {
        return this.periodOffset;
    }

    public void setPeriodOffset(SearchLongField periodOffset) {
        this.periodOffset = periodOffset;
    }

    public SearchMultiSelectField getTargetAccount() {
        return this.targetAccount;
    }

    public void setTargetAccount(SearchMultiSelectField targetAccount) {
        this.targetAccount = targetAccount;
    }

    public SearchBooleanField getUseForeignAmounts() {
        return this.useForeignAmounts;
    }

    public void setUseForeignAmounts(SearchBooleanField useForeignAmounts) {
        this.useForeignAmounts = useForeignAmounts;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof RevRecTemplateSearchBasic)) {
            return false;
        }
        RevRecTemplateSearchBasic other = (RevRecTemplateSearchBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.amorMethod == null && other.getAmorMethod() == null || this.amorMethod != null && this.amorMethod.equals(other.getAmorMethod())) && (this.amorPeriod == null && other.getAmorPeriod() == null || this.amorPeriod != null && this.amorPeriod.equals(other.getAmorPeriod())) && (this.amorStartOffset == null && other.getAmorStartOffset() == null || this.amorStartOffset != null && this.amorStartOffset.equals(other.getAmorStartOffset())) && (this.amorTermSrc == null && other.getAmorTermSrc() == null || this.amorTermSrc != null && this.amorTermSrc.equals(other.getAmorTermSrc())) && (this.amorType == null && other.getAmorType() == null || this.amorType != null && this.amorType.equals(other.getAmorType())) && (this.contraAccount == null && other.getContraAccount() == null || this.contraAccount != null && this.contraAccount.equals(other.getContraAccount())) && (this.deferralAccount == null && other.getDeferralAccount() == null || this.deferralAccount != null && this.deferralAccount.equals(other.getDeferralAccount())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId())) && (this.externalIdString == null && other.getExternalIdString() == null || this.externalIdString != null && this.externalIdString.equals(other.getExternalIdString())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.internalIdNumber == null && other.getInternalIdNumber() == null || this.internalIdNumber != null && this.internalIdNumber.equals(other.getInternalIdNumber())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && this.isInactive.equals(other.getIsInactive())) && (this.name == null && other.getName() == null || this.name != null && this.name.equals(other.getName())) && (this.periodOffset == null && other.getPeriodOffset() == null || this.periodOffset != null && this.periodOffset.equals(other.getPeriodOffset())) && (this.targetAccount == null && other.getTargetAccount() == null || this.targetAccount != null && this.targetAccount.equals(other.getTargetAccount())) && (this.useForeignAmounts == null && other.getUseForeignAmounts() == null || this.useForeignAmounts != null && this.useForeignAmounts.equals(other.getUseForeignAmounts()));
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
        if (this.getAmorMethod() != null) {
            _hashCode += this.getAmorMethod().hashCode();
        }
        if (this.getAmorPeriod() != null) {
            _hashCode += this.getAmorPeriod().hashCode();
        }
        if (this.getAmorStartOffset() != null) {
            _hashCode += this.getAmorStartOffset().hashCode();
        }
        if (this.getAmorTermSrc() != null) {
            _hashCode += this.getAmorTermSrc().hashCode();
        }
        if (this.getAmorType() != null) {
            _hashCode += this.getAmorType().hashCode();
        }
        if (this.getContraAccount() != null) {
            _hashCode += this.getContraAccount().hashCode();
        }
        if (this.getDeferralAccount() != null) {
            _hashCode += this.getDeferralAccount().hashCode();
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
        if (this.getIsInactive() != null) {
            _hashCode += this.getIsInactive().hashCode();
        }
        if (this.getName() != null) {
            _hashCode += this.getName().hashCode();
        }
        if (this.getPeriodOffset() != null) {
            _hashCode += this.getPeriodOffset().hashCode();
        }
        if (this.getTargetAccount() != null) {
            _hashCode += this.getTargetAccount().hashCode();
        }
        if (this.getUseForeignAmounts() != null) {
            _hashCode += this.getUseForeignAmounts().hashCode();
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "RevRecTemplateSearchBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("amorMethod");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "amorMethod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("amorPeriod");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "amorPeriod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("amorStartOffset");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "amorStartOffset"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("amorTermSrc");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "amorTermSrc"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("amorType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "amorType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("contraAccount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "contraAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("deferralAccount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "deferralAccount"));
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
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("periodOffset");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "periodOffset"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("targetAccount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "targetAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("useForeignAmounts");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "useForeignAmounts"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

