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

public class BillingScheduleSearchBasic
extends SearchRecordBasic
implements Serializable {
    private SearchBooleanField applyToSubtotal;
    private SearchMultiSelectField externalId;
    private SearchStringField externalIdString;
    private SearchEnumMultiSelectField frequency;
    private SearchBooleanField inArrears;
    private SearchDoubleField initialAmount;
    private SearchMultiSelectField initialTerms;
    private SearchMultiSelectField internalId;
    private SearchLongField internalIdNumber;
    private SearchBooleanField isInactive;
    private SearchBooleanField isPublic;
    private SearchStringField name;
    private SearchLongField recurrenceCount;
    private SearchEnumMultiSelectField recurrencePattern;
    private SearchMultiSelectField recurrenceTerms;
    private SearchLongField repeatEvery;
    private SearchEnumMultiSelectField type;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(BillingScheduleSearchBasic.class, true);

    public BillingScheduleSearchBasic() {
    }

    public BillingScheduleSearchBasic(SearchBooleanField applyToSubtotal, SearchMultiSelectField externalId, SearchStringField externalIdString, SearchEnumMultiSelectField frequency, SearchBooleanField inArrears, SearchDoubleField initialAmount, SearchMultiSelectField initialTerms, SearchMultiSelectField internalId, SearchLongField internalIdNumber, SearchBooleanField isInactive, SearchBooleanField isPublic, SearchStringField name, SearchLongField recurrenceCount, SearchEnumMultiSelectField recurrencePattern, SearchMultiSelectField recurrenceTerms, SearchLongField repeatEvery, SearchEnumMultiSelectField type) {
        this.applyToSubtotal = applyToSubtotal;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.frequency = frequency;
        this.inArrears = inArrears;
        this.initialAmount = initialAmount;
        this.initialTerms = initialTerms;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isInactive = isInactive;
        this.isPublic = isPublic;
        this.name = name;
        this.recurrenceCount = recurrenceCount;
        this.recurrencePattern = recurrencePattern;
        this.recurrenceTerms = recurrenceTerms;
        this.repeatEvery = repeatEvery;
        this.type = type;
    }

    public SearchBooleanField getApplyToSubtotal() {
        return this.applyToSubtotal;
    }

    public void setApplyToSubtotal(SearchBooleanField applyToSubtotal) {
        this.applyToSubtotal = applyToSubtotal;
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

    public SearchEnumMultiSelectField getFrequency() {
        return this.frequency;
    }

    public void setFrequency(SearchEnumMultiSelectField frequency) {
        this.frequency = frequency;
    }

    public SearchBooleanField getInArrears() {
        return this.inArrears;
    }

    public void setInArrears(SearchBooleanField inArrears) {
        this.inArrears = inArrears;
    }

    public SearchDoubleField getInitialAmount() {
        return this.initialAmount;
    }

    public void setInitialAmount(SearchDoubleField initialAmount) {
        this.initialAmount = initialAmount;
    }

    public SearchMultiSelectField getInitialTerms() {
        return this.initialTerms;
    }

    public void setInitialTerms(SearchMultiSelectField initialTerms) {
        this.initialTerms = initialTerms;
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

    public SearchBooleanField getIsPublic() {
        return this.isPublic;
    }

    public void setIsPublic(SearchBooleanField isPublic) {
        this.isPublic = isPublic;
    }

    public SearchStringField getName() {
        return this.name;
    }

    public void setName(SearchStringField name) {
        this.name = name;
    }

    public SearchLongField getRecurrenceCount() {
        return this.recurrenceCount;
    }

    public void setRecurrenceCount(SearchLongField recurrenceCount) {
        this.recurrenceCount = recurrenceCount;
    }

    public SearchEnumMultiSelectField getRecurrencePattern() {
        return this.recurrencePattern;
    }

    public void setRecurrencePattern(SearchEnumMultiSelectField recurrencePattern) {
        this.recurrencePattern = recurrencePattern;
    }

    public SearchMultiSelectField getRecurrenceTerms() {
        return this.recurrenceTerms;
    }

    public void setRecurrenceTerms(SearchMultiSelectField recurrenceTerms) {
        this.recurrenceTerms = recurrenceTerms;
    }

    public SearchLongField getRepeatEvery() {
        return this.repeatEvery;
    }

    public void setRepeatEvery(SearchLongField repeatEvery) {
        this.repeatEvery = repeatEvery;
    }

    public SearchEnumMultiSelectField getType() {
        return this.type;
    }

    public void setType(SearchEnumMultiSelectField type) {
        this.type = type;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof BillingScheduleSearchBasic)) {
            return false;
        }
        BillingScheduleSearchBasic other = (BillingScheduleSearchBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.applyToSubtotal == null && other.getApplyToSubtotal() == null || this.applyToSubtotal != null && this.applyToSubtotal.equals(other.getApplyToSubtotal())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId())) && (this.externalIdString == null && other.getExternalIdString() == null || this.externalIdString != null && this.externalIdString.equals(other.getExternalIdString())) && (this.frequency == null && other.getFrequency() == null || this.frequency != null && this.frequency.equals(other.getFrequency())) && (this.inArrears == null && other.getInArrears() == null || this.inArrears != null && this.inArrears.equals(other.getInArrears())) && (this.initialAmount == null && other.getInitialAmount() == null || this.initialAmount != null && this.initialAmount.equals(other.getInitialAmount())) && (this.initialTerms == null && other.getInitialTerms() == null || this.initialTerms != null && this.initialTerms.equals(other.getInitialTerms())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.internalIdNumber == null && other.getInternalIdNumber() == null || this.internalIdNumber != null && this.internalIdNumber.equals(other.getInternalIdNumber())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && this.isInactive.equals(other.getIsInactive())) && (this.isPublic == null && other.getIsPublic() == null || this.isPublic != null && this.isPublic.equals(other.getIsPublic())) && (this.name == null && other.getName() == null || this.name != null && this.name.equals(other.getName())) && (this.recurrenceCount == null && other.getRecurrenceCount() == null || this.recurrenceCount != null && this.recurrenceCount.equals(other.getRecurrenceCount())) && (this.recurrencePattern == null && other.getRecurrencePattern() == null || this.recurrencePattern != null && this.recurrencePattern.equals(other.getRecurrencePattern())) && (this.recurrenceTerms == null && other.getRecurrenceTerms() == null || this.recurrenceTerms != null && this.recurrenceTerms.equals(other.getRecurrenceTerms())) && (this.repeatEvery == null && other.getRepeatEvery() == null || this.repeatEvery != null && this.repeatEvery.equals(other.getRepeatEvery())) && (this.type == null && other.getType() == null || this.type != null && this.type.equals(other.getType()));
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
        if (this.getApplyToSubtotal() != null) {
            _hashCode += this.getApplyToSubtotal().hashCode();
        }
        if (this.getExternalId() != null) {
            _hashCode += this.getExternalId().hashCode();
        }
        if (this.getExternalIdString() != null) {
            _hashCode += this.getExternalIdString().hashCode();
        }
        if (this.getFrequency() != null) {
            _hashCode += this.getFrequency().hashCode();
        }
        if (this.getInArrears() != null) {
            _hashCode += this.getInArrears().hashCode();
        }
        if (this.getInitialAmount() != null) {
            _hashCode += this.getInitialAmount().hashCode();
        }
        if (this.getInitialTerms() != null) {
            _hashCode += this.getInitialTerms().hashCode();
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
        if (this.getIsPublic() != null) {
            _hashCode += this.getIsPublic().hashCode();
        }
        if (this.getName() != null) {
            _hashCode += this.getName().hashCode();
        }
        if (this.getRecurrenceCount() != null) {
            _hashCode += this.getRecurrenceCount().hashCode();
        }
        if (this.getRecurrencePattern() != null) {
            _hashCode += this.getRecurrencePattern().hashCode();
        }
        if (this.getRecurrenceTerms() != null) {
            _hashCode += this.getRecurrenceTerms().hashCode();
        }
        if (this.getRepeatEvery() != null) {
            _hashCode += this.getRepeatEvery().hashCode();
        }
        if (this.getType() != null) {
            _hashCode += this.getType().hashCode();
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "BillingScheduleSearchBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("applyToSubtotal");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "applyToSubtotal"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("frequency");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "frequency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("inArrears");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "inArrears"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("initialAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "initialAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("initialTerms");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "initialTerms"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("isPublic");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isPublic"));
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
        elemField.setFieldName("recurrenceCount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "recurrenceCount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recurrencePattern");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "recurrencePattern"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recurrenceTerms");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "recurrenceTerms"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("repeatEvery");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "repeatEvery"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
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
    }
}

