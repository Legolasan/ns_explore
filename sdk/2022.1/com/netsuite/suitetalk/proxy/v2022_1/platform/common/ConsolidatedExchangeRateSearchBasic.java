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
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchDateField;
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

public class ConsolidatedExchangeRateSearchBasic
extends SearchRecordBasic
implements Serializable {
    private SearchMultiSelectField accountingBook;
    private SearchMultiSelectField externalId;
    private SearchStringField externalIdString;
    private SearchMultiSelectField fromSubsidiary;
    private SearchMultiSelectField internalId;
    private SearchLongField internalIdNumber;
    private SearchBooleanField isDerivedRate;
    private SearchMultiSelectField period;
    private SearchDateField periodStartDate;
    private SearchMultiSelectField toSubsidiary;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(ConsolidatedExchangeRateSearchBasic.class, true);

    public ConsolidatedExchangeRateSearchBasic() {
    }

    public ConsolidatedExchangeRateSearchBasic(SearchMultiSelectField accountingBook, SearchMultiSelectField externalId, SearchStringField externalIdString, SearchMultiSelectField fromSubsidiary, SearchMultiSelectField internalId, SearchLongField internalIdNumber, SearchBooleanField isDerivedRate, SearchMultiSelectField period, SearchDateField periodStartDate, SearchMultiSelectField toSubsidiary) {
        this.accountingBook = accountingBook;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.fromSubsidiary = fromSubsidiary;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isDerivedRate = isDerivedRate;
        this.period = period;
        this.periodStartDate = periodStartDate;
        this.toSubsidiary = toSubsidiary;
    }

    public SearchMultiSelectField getAccountingBook() {
        return this.accountingBook;
    }

    public void setAccountingBook(SearchMultiSelectField accountingBook) {
        this.accountingBook = accountingBook;
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

    public SearchMultiSelectField getFromSubsidiary() {
        return this.fromSubsidiary;
    }

    public void setFromSubsidiary(SearchMultiSelectField fromSubsidiary) {
        this.fromSubsidiary = fromSubsidiary;
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

    public SearchBooleanField getIsDerivedRate() {
        return this.isDerivedRate;
    }

    public void setIsDerivedRate(SearchBooleanField isDerivedRate) {
        this.isDerivedRate = isDerivedRate;
    }

    public SearchMultiSelectField getPeriod() {
        return this.period;
    }

    public void setPeriod(SearchMultiSelectField period) {
        this.period = period;
    }

    public SearchDateField getPeriodStartDate() {
        return this.periodStartDate;
    }

    public void setPeriodStartDate(SearchDateField periodStartDate) {
        this.periodStartDate = periodStartDate;
    }

    public SearchMultiSelectField getToSubsidiary() {
        return this.toSubsidiary;
    }

    public void setToSubsidiary(SearchMultiSelectField toSubsidiary) {
        this.toSubsidiary = toSubsidiary;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ConsolidatedExchangeRateSearchBasic)) {
            return false;
        }
        ConsolidatedExchangeRateSearchBasic other = (ConsolidatedExchangeRateSearchBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.accountingBook == null && other.getAccountingBook() == null || this.accountingBook != null && this.accountingBook.equals(other.getAccountingBook())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId())) && (this.externalIdString == null && other.getExternalIdString() == null || this.externalIdString != null && this.externalIdString.equals(other.getExternalIdString())) && (this.fromSubsidiary == null && other.getFromSubsidiary() == null || this.fromSubsidiary != null && this.fromSubsidiary.equals(other.getFromSubsidiary())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.internalIdNumber == null && other.getInternalIdNumber() == null || this.internalIdNumber != null && this.internalIdNumber.equals(other.getInternalIdNumber())) && (this.isDerivedRate == null && other.getIsDerivedRate() == null || this.isDerivedRate != null && this.isDerivedRate.equals(other.getIsDerivedRate())) && (this.period == null && other.getPeriod() == null || this.period != null && this.period.equals(other.getPeriod())) && (this.periodStartDate == null && other.getPeriodStartDate() == null || this.periodStartDate != null && this.periodStartDate.equals(other.getPeriodStartDate())) && (this.toSubsidiary == null && other.getToSubsidiary() == null || this.toSubsidiary != null && this.toSubsidiary.equals(other.getToSubsidiary()));
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
        if (this.getAccountingBook() != null) {
            _hashCode += this.getAccountingBook().hashCode();
        }
        if (this.getExternalId() != null) {
            _hashCode += this.getExternalId().hashCode();
        }
        if (this.getExternalIdString() != null) {
            _hashCode += this.getExternalIdString().hashCode();
        }
        if (this.getFromSubsidiary() != null) {
            _hashCode += this.getFromSubsidiary().hashCode();
        }
        if (this.getInternalId() != null) {
            _hashCode += this.getInternalId().hashCode();
        }
        if (this.getInternalIdNumber() != null) {
            _hashCode += this.getInternalIdNumber().hashCode();
        }
        if (this.getIsDerivedRate() != null) {
            _hashCode += this.getIsDerivedRate().hashCode();
        }
        if (this.getPeriod() != null) {
            _hashCode += this.getPeriod().hashCode();
        }
        if (this.getPeriodStartDate() != null) {
            _hashCode += this.getPeriodStartDate().hashCode();
        }
        if (this.getToSubsidiary() != null) {
            _hashCode += this.getToSubsidiary().hashCode();
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ConsolidatedExchangeRateSearchBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("accountingBook");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "accountingBook"));
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
        elemField.setFieldName("fromSubsidiary");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fromSubsidiary"));
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
        elemField.setFieldName("isDerivedRate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isDerivedRate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("period");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "period"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("periodStartDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "periodStartDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("toSubsidiary");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "toSubsidiary"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

