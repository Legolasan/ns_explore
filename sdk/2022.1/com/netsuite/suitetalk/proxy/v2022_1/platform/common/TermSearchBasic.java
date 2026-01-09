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

public class TermSearchBasic
extends SearchRecordBasic
implements Serializable {
    private SearchBooleanField dateDriven;
    private SearchLongField dayDiscountExpires;
    private SearchLongField dayOfMonthNetDue;
    private SearchLongField daysUntilExpiry;
    private SearchLongField daysUntilNetDue;
    private SearchDoubleField discountPercent;
    private SearchDoubleField discountPercentDateDriven;
    private SearchLongField dueNextMonthIfWithinDays;
    private SearchMultiSelectField externalId;
    private SearchStringField externalIdString;
    private SearchBooleanField installment;
    private SearchMultiSelectField internalId;
    private SearchLongField internalIdNumber;
    private SearchBooleanField isInactive;
    private SearchStringField name;
    private SearchBooleanField preferred;
    private SearchLongField recurrenceCount;
    private SearchEnumMultiSelectField recurrenceFrequency;
    private SearchLongField repeatEvery;
    private SearchBooleanField splitEvenly;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(TermSearchBasic.class, true);

    public TermSearchBasic() {
    }

    public TermSearchBasic(SearchBooleanField dateDriven, SearchLongField dayDiscountExpires, SearchLongField dayOfMonthNetDue, SearchLongField daysUntilExpiry, SearchLongField daysUntilNetDue, SearchDoubleField discountPercent, SearchDoubleField discountPercentDateDriven, SearchLongField dueNextMonthIfWithinDays, SearchMultiSelectField externalId, SearchStringField externalIdString, SearchBooleanField installment, SearchMultiSelectField internalId, SearchLongField internalIdNumber, SearchBooleanField isInactive, SearchStringField name, SearchBooleanField preferred, SearchLongField recurrenceCount, SearchEnumMultiSelectField recurrenceFrequency, SearchLongField repeatEvery, SearchBooleanField splitEvenly) {
        this.dateDriven = dateDriven;
        this.dayDiscountExpires = dayDiscountExpires;
        this.dayOfMonthNetDue = dayOfMonthNetDue;
        this.daysUntilExpiry = daysUntilExpiry;
        this.daysUntilNetDue = daysUntilNetDue;
        this.discountPercent = discountPercent;
        this.discountPercentDateDriven = discountPercentDateDriven;
        this.dueNextMonthIfWithinDays = dueNextMonthIfWithinDays;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.installment = installment;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isInactive = isInactive;
        this.name = name;
        this.preferred = preferred;
        this.recurrenceCount = recurrenceCount;
        this.recurrenceFrequency = recurrenceFrequency;
        this.repeatEvery = repeatEvery;
        this.splitEvenly = splitEvenly;
    }

    public SearchBooleanField getDateDriven() {
        return this.dateDriven;
    }

    public void setDateDriven(SearchBooleanField dateDriven) {
        this.dateDriven = dateDriven;
    }

    public SearchLongField getDayDiscountExpires() {
        return this.dayDiscountExpires;
    }

    public void setDayDiscountExpires(SearchLongField dayDiscountExpires) {
        this.dayDiscountExpires = dayDiscountExpires;
    }

    public SearchLongField getDayOfMonthNetDue() {
        return this.dayOfMonthNetDue;
    }

    public void setDayOfMonthNetDue(SearchLongField dayOfMonthNetDue) {
        this.dayOfMonthNetDue = dayOfMonthNetDue;
    }

    public SearchLongField getDaysUntilExpiry() {
        return this.daysUntilExpiry;
    }

    public void setDaysUntilExpiry(SearchLongField daysUntilExpiry) {
        this.daysUntilExpiry = daysUntilExpiry;
    }

    public SearchLongField getDaysUntilNetDue() {
        return this.daysUntilNetDue;
    }

    public void setDaysUntilNetDue(SearchLongField daysUntilNetDue) {
        this.daysUntilNetDue = daysUntilNetDue;
    }

    public SearchDoubleField getDiscountPercent() {
        return this.discountPercent;
    }

    public void setDiscountPercent(SearchDoubleField discountPercent) {
        this.discountPercent = discountPercent;
    }

    public SearchDoubleField getDiscountPercentDateDriven() {
        return this.discountPercentDateDriven;
    }

    public void setDiscountPercentDateDriven(SearchDoubleField discountPercentDateDriven) {
        this.discountPercentDateDriven = discountPercentDateDriven;
    }

    public SearchLongField getDueNextMonthIfWithinDays() {
        return this.dueNextMonthIfWithinDays;
    }

    public void setDueNextMonthIfWithinDays(SearchLongField dueNextMonthIfWithinDays) {
        this.dueNextMonthIfWithinDays = dueNextMonthIfWithinDays;
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

    public SearchBooleanField getInstallment() {
        return this.installment;
    }

    public void setInstallment(SearchBooleanField installment) {
        this.installment = installment;
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

    public SearchBooleanField getPreferred() {
        return this.preferred;
    }

    public void setPreferred(SearchBooleanField preferred) {
        this.preferred = preferred;
    }

    public SearchLongField getRecurrenceCount() {
        return this.recurrenceCount;
    }

    public void setRecurrenceCount(SearchLongField recurrenceCount) {
        this.recurrenceCount = recurrenceCount;
    }

    public SearchEnumMultiSelectField getRecurrenceFrequency() {
        return this.recurrenceFrequency;
    }

    public void setRecurrenceFrequency(SearchEnumMultiSelectField recurrenceFrequency) {
        this.recurrenceFrequency = recurrenceFrequency;
    }

    public SearchLongField getRepeatEvery() {
        return this.repeatEvery;
    }

    public void setRepeatEvery(SearchLongField repeatEvery) {
        this.repeatEvery = repeatEvery;
    }

    public SearchBooleanField getSplitEvenly() {
        return this.splitEvenly;
    }

    public void setSplitEvenly(SearchBooleanField splitEvenly) {
        this.splitEvenly = splitEvenly;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TermSearchBasic)) {
            return false;
        }
        TermSearchBasic other = (TermSearchBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.dateDriven == null && other.getDateDriven() == null || this.dateDriven != null && this.dateDriven.equals(other.getDateDriven())) && (this.dayDiscountExpires == null && other.getDayDiscountExpires() == null || this.dayDiscountExpires != null && this.dayDiscountExpires.equals(other.getDayDiscountExpires())) && (this.dayOfMonthNetDue == null && other.getDayOfMonthNetDue() == null || this.dayOfMonthNetDue != null && this.dayOfMonthNetDue.equals(other.getDayOfMonthNetDue())) && (this.daysUntilExpiry == null && other.getDaysUntilExpiry() == null || this.daysUntilExpiry != null && this.daysUntilExpiry.equals(other.getDaysUntilExpiry())) && (this.daysUntilNetDue == null && other.getDaysUntilNetDue() == null || this.daysUntilNetDue != null && this.daysUntilNetDue.equals(other.getDaysUntilNetDue())) && (this.discountPercent == null && other.getDiscountPercent() == null || this.discountPercent != null && this.discountPercent.equals(other.getDiscountPercent())) && (this.discountPercentDateDriven == null && other.getDiscountPercentDateDriven() == null || this.discountPercentDateDriven != null && this.discountPercentDateDriven.equals(other.getDiscountPercentDateDriven())) && (this.dueNextMonthIfWithinDays == null && other.getDueNextMonthIfWithinDays() == null || this.dueNextMonthIfWithinDays != null && this.dueNextMonthIfWithinDays.equals(other.getDueNextMonthIfWithinDays())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId())) && (this.externalIdString == null && other.getExternalIdString() == null || this.externalIdString != null && this.externalIdString.equals(other.getExternalIdString())) && (this.installment == null && other.getInstallment() == null || this.installment != null && this.installment.equals(other.getInstallment())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.internalIdNumber == null && other.getInternalIdNumber() == null || this.internalIdNumber != null && this.internalIdNumber.equals(other.getInternalIdNumber())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && this.isInactive.equals(other.getIsInactive())) && (this.name == null && other.getName() == null || this.name != null && this.name.equals(other.getName())) && (this.preferred == null && other.getPreferred() == null || this.preferred != null && this.preferred.equals(other.getPreferred())) && (this.recurrenceCount == null && other.getRecurrenceCount() == null || this.recurrenceCount != null && this.recurrenceCount.equals(other.getRecurrenceCount())) && (this.recurrenceFrequency == null && other.getRecurrenceFrequency() == null || this.recurrenceFrequency != null && this.recurrenceFrequency.equals(other.getRecurrenceFrequency())) && (this.repeatEvery == null && other.getRepeatEvery() == null || this.repeatEvery != null && this.repeatEvery.equals(other.getRepeatEvery())) && (this.splitEvenly == null && other.getSplitEvenly() == null || this.splitEvenly != null && this.splitEvenly.equals(other.getSplitEvenly()));
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
        if (this.getDateDriven() != null) {
            _hashCode += this.getDateDriven().hashCode();
        }
        if (this.getDayDiscountExpires() != null) {
            _hashCode += this.getDayDiscountExpires().hashCode();
        }
        if (this.getDayOfMonthNetDue() != null) {
            _hashCode += this.getDayOfMonthNetDue().hashCode();
        }
        if (this.getDaysUntilExpiry() != null) {
            _hashCode += this.getDaysUntilExpiry().hashCode();
        }
        if (this.getDaysUntilNetDue() != null) {
            _hashCode += this.getDaysUntilNetDue().hashCode();
        }
        if (this.getDiscountPercent() != null) {
            _hashCode += this.getDiscountPercent().hashCode();
        }
        if (this.getDiscountPercentDateDriven() != null) {
            _hashCode += this.getDiscountPercentDateDriven().hashCode();
        }
        if (this.getDueNextMonthIfWithinDays() != null) {
            _hashCode += this.getDueNextMonthIfWithinDays().hashCode();
        }
        if (this.getExternalId() != null) {
            _hashCode += this.getExternalId().hashCode();
        }
        if (this.getExternalIdString() != null) {
            _hashCode += this.getExternalIdString().hashCode();
        }
        if (this.getInstallment() != null) {
            _hashCode += this.getInstallment().hashCode();
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
        if (this.getPreferred() != null) {
            _hashCode += this.getPreferred().hashCode();
        }
        if (this.getRecurrenceCount() != null) {
            _hashCode += this.getRecurrenceCount().hashCode();
        }
        if (this.getRecurrenceFrequency() != null) {
            _hashCode += this.getRecurrenceFrequency().hashCode();
        }
        if (this.getRepeatEvery() != null) {
            _hashCode += this.getRepeatEvery().hashCode();
        }
        if (this.getSplitEvenly() != null) {
            _hashCode += this.getSplitEvenly().hashCode();
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TermSearchBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("dateDriven");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "dateDriven"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("dayDiscountExpires");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "dayDiscountExpires"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("dayOfMonthNetDue");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "dayOfMonthNetDue"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("daysUntilExpiry");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "daysUntilExpiry"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("daysUntilNetDue");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "daysUntilNetDue"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("discountPercent");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "discountPercent"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("discountPercentDateDriven");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "discountPercentDateDriven"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("dueNextMonthIfWithinDays");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "dueNextMonthIfWithinDays"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
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
        elemField.setFieldName("installment");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "installment"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("preferred");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "preferred"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("recurrenceFrequency");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "recurrenceFrequency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
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
        elemField.setFieldName("splitEvenly");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "splitEvenly"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

