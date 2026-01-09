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
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnDateField;
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

public class ConsolidatedExchangeRateSearchRowBasic
extends SearchRowBasic
implements Serializable {
    private SearchColumnStringField[] accountingBook;
    private SearchColumnStringField[] averageRate;
    private SearchColumnBooleanField[] closed;
    private SearchColumnStringField[] currentRate;
    private SearchColumnSelectField[] externalId;
    private SearchColumnStringField[] fromCurrency;
    private SearchColumnStringField[] fromSubsidiary;
    private SearchColumnStringField[] historicalRate;
    private SearchColumnSelectField[] internalId;
    private SearchColumnDateField[] periodEndDate;
    private SearchColumnStringField[] periodName;
    private SearchColumnDateField[] periodStartDate;
    private SearchColumnStringField[] toCurrency;
    private SearchColumnStringField[] toSubsidiary;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(ConsolidatedExchangeRateSearchRowBasic.class, true);

    public ConsolidatedExchangeRateSearchRowBasic() {
    }

    public ConsolidatedExchangeRateSearchRowBasic(SearchColumnStringField[] accountingBook, SearchColumnStringField[] averageRate, SearchColumnBooleanField[] closed, SearchColumnStringField[] currentRate, SearchColumnSelectField[] externalId, SearchColumnStringField[] fromCurrency, SearchColumnStringField[] fromSubsidiary, SearchColumnStringField[] historicalRate, SearchColumnSelectField[] internalId, SearchColumnDateField[] periodEndDate, SearchColumnStringField[] periodName, SearchColumnDateField[] periodStartDate, SearchColumnStringField[] toCurrency, SearchColumnStringField[] toSubsidiary) {
        this.accountingBook = accountingBook;
        this.averageRate = averageRate;
        this.closed = closed;
        this.currentRate = currentRate;
        this.externalId = externalId;
        this.fromCurrency = fromCurrency;
        this.fromSubsidiary = fromSubsidiary;
        this.historicalRate = historicalRate;
        this.internalId = internalId;
        this.periodEndDate = periodEndDate;
        this.periodName = periodName;
        this.periodStartDate = periodStartDate;
        this.toCurrency = toCurrency;
        this.toSubsidiary = toSubsidiary;
    }

    public SearchColumnStringField[] getAccountingBook() {
        return this.accountingBook;
    }

    public void setAccountingBook(SearchColumnStringField[] accountingBook) {
        this.accountingBook = accountingBook;
    }

    public SearchColumnStringField getAccountingBook(int i) {
        return this.accountingBook[i];
    }

    public void setAccountingBook(int i, SearchColumnStringField _value) {
        this.accountingBook[i] = _value;
    }

    public SearchColumnStringField[] getAverageRate() {
        return this.averageRate;
    }

    public void setAverageRate(SearchColumnStringField[] averageRate) {
        this.averageRate = averageRate;
    }

    public SearchColumnStringField getAverageRate(int i) {
        return this.averageRate[i];
    }

    public void setAverageRate(int i, SearchColumnStringField _value) {
        this.averageRate[i] = _value;
    }

    public SearchColumnBooleanField[] getClosed() {
        return this.closed;
    }

    public void setClosed(SearchColumnBooleanField[] closed) {
        this.closed = closed;
    }

    public SearchColumnBooleanField getClosed(int i) {
        return this.closed[i];
    }

    public void setClosed(int i, SearchColumnBooleanField _value) {
        this.closed[i] = _value;
    }

    public SearchColumnStringField[] getCurrentRate() {
        return this.currentRate;
    }

    public void setCurrentRate(SearchColumnStringField[] currentRate) {
        this.currentRate = currentRate;
    }

    public SearchColumnStringField getCurrentRate(int i) {
        return this.currentRate[i];
    }

    public void setCurrentRate(int i, SearchColumnStringField _value) {
        this.currentRate[i] = _value;
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

    public SearchColumnStringField[] getFromCurrency() {
        return this.fromCurrency;
    }

    public void setFromCurrency(SearchColumnStringField[] fromCurrency) {
        this.fromCurrency = fromCurrency;
    }

    public SearchColumnStringField getFromCurrency(int i) {
        return this.fromCurrency[i];
    }

    public void setFromCurrency(int i, SearchColumnStringField _value) {
        this.fromCurrency[i] = _value;
    }

    public SearchColumnStringField[] getFromSubsidiary() {
        return this.fromSubsidiary;
    }

    public void setFromSubsidiary(SearchColumnStringField[] fromSubsidiary) {
        this.fromSubsidiary = fromSubsidiary;
    }

    public SearchColumnStringField getFromSubsidiary(int i) {
        return this.fromSubsidiary[i];
    }

    public void setFromSubsidiary(int i, SearchColumnStringField _value) {
        this.fromSubsidiary[i] = _value;
    }

    public SearchColumnStringField[] getHistoricalRate() {
        return this.historicalRate;
    }

    public void setHistoricalRate(SearchColumnStringField[] historicalRate) {
        this.historicalRate = historicalRate;
    }

    public SearchColumnStringField getHistoricalRate(int i) {
        return this.historicalRate[i];
    }

    public void setHistoricalRate(int i, SearchColumnStringField _value) {
        this.historicalRate[i] = _value;
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

    public SearchColumnDateField[] getPeriodEndDate() {
        return this.periodEndDate;
    }

    public void setPeriodEndDate(SearchColumnDateField[] periodEndDate) {
        this.periodEndDate = periodEndDate;
    }

    public SearchColumnDateField getPeriodEndDate(int i) {
        return this.periodEndDate[i];
    }

    public void setPeriodEndDate(int i, SearchColumnDateField _value) {
        this.periodEndDate[i] = _value;
    }

    public SearchColumnStringField[] getPeriodName() {
        return this.periodName;
    }

    public void setPeriodName(SearchColumnStringField[] periodName) {
        this.periodName = periodName;
    }

    public SearchColumnStringField getPeriodName(int i) {
        return this.periodName[i];
    }

    public void setPeriodName(int i, SearchColumnStringField _value) {
        this.periodName[i] = _value;
    }

    public SearchColumnDateField[] getPeriodStartDate() {
        return this.periodStartDate;
    }

    public void setPeriodStartDate(SearchColumnDateField[] periodStartDate) {
        this.periodStartDate = periodStartDate;
    }

    public SearchColumnDateField getPeriodStartDate(int i) {
        return this.periodStartDate[i];
    }

    public void setPeriodStartDate(int i, SearchColumnDateField _value) {
        this.periodStartDate[i] = _value;
    }

    public SearchColumnStringField[] getToCurrency() {
        return this.toCurrency;
    }

    public void setToCurrency(SearchColumnStringField[] toCurrency) {
        this.toCurrency = toCurrency;
    }

    public SearchColumnStringField getToCurrency(int i) {
        return this.toCurrency[i];
    }

    public void setToCurrency(int i, SearchColumnStringField _value) {
        this.toCurrency[i] = _value;
    }

    public SearchColumnStringField[] getToSubsidiary() {
        return this.toSubsidiary;
    }

    public void setToSubsidiary(SearchColumnStringField[] toSubsidiary) {
        this.toSubsidiary = toSubsidiary;
    }

    public SearchColumnStringField getToSubsidiary(int i) {
        return this.toSubsidiary[i];
    }

    public void setToSubsidiary(int i, SearchColumnStringField _value) {
        this.toSubsidiary[i] = _value;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ConsolidatedExchangeRateSearchRowBasic)) {
            return false;
        }
        ConsolidatedExchangeRateSearchRowBasic other = (ConsolidatedExchangeRateSearchRowBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.accountingBook == null && other.getAccountingBook() == null || this.accountingBook != null && Arrays.equals(this.accountingBook, other.getAccountingBook())) && (this.averageRate == null && other.getAverageRate() == null || this.averageRate != null && Arrays.equals(this.averageRate, other.getAverageRate())) && (this.closed == null && other.getClosed() == null || this.closed != null && Arrays.equals(this.closed, other.getClosed())) && (this.currentRate == null && other.getCurrentRate() == null || this.currentRate != null && Arrays.equals(this.currentRate, other.getCurrentRate())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && Arrays.equals(this.externalId, other.getExternalId())) && (this.fromCurrency == null && other.getFromCurrency() == null || this.fromCurrency != null && Arrays.equals(this.fromCurrency, other.getFromCurrency())) && (this.fromSubsidiary == null && other.getFromSubsidiary() == null || this.fromSubsidiary != null && Arrays.equals(this.fromSubsidiary, other.getFromSubsidiary())) && (this.historicalRate == null && other.getHistoricalRate() == null || this.historicalRate != null && Arrays.equals(this.historicalRate, other.getHistoricalRate())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && Arrays.equals(this.internalId, other.getInternalId())) && (this.periodEndDate == null && other.getPeriodEndDate() == null || this.periodEndDate != null && Arrays.equals(this.periodEndDate, other.getPeriodEndDate())) && (this.periodName == null && other.getPeriodName() == null || this.periodName != null && Arrays.equals(this.periodName, other.getPeriodName())) && (this.periodStartDate == null && other.getPeriodStartDate() == null || this.periodStartDate != null && Arrays.equals(this.periodStartDate, other.getPeriodStartDate())) && (this.toCurrency == null && other.getToCurrency() == null || this.toCurrency != null && Arrays.equals(this.toCurrency, other.getToCurrency())) && (this.toSubsidiary == null && other.getToSubsidiary() == null || this.toSubsidiary != null && Arrays.equals(this.toSubsidiary, other.getToSubsidiary()));
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
        if (this.getAccountingBook() != null) {
            for (i = 0; i < Array.getLength(this.getAccountingBook()); ++i) {
                obj = Array.get(this.getAccountingBook(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAverageRate() != null) {
            for (i = 0; i < Array.getLength(this.getAverageRate()); ++i) {
                obj = Array.get(this.getAverageRate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getClosed() != null) {
            for (i = 0; i < Array.getLength(this.getClosed()); ++i) {
                obj = Array.get(this.getClosed(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCurrentRate() != null) {
            for (i = 0; i < Array.getLength(this.getCurrentRate()); ++i) {
                obj = Array.get(this.getCurrentRate(), i);
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
        if (this.getFromCurrency() != null) {
            for (i = 0; i < Array.getLength(this.getFromCurrency()); ++i) {
                obj = Array.get(this.getFromCurrency(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getFromSubsidiary() != null) {
            for (i = 0; i < Array.getLength(this.getFromSubsidiary()); ++i) {
                obj = Array.get(this.getFromSubsidiary(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getHistoricalRate() != null) {
            for (i = 0; i < Array.getLength(this.getHistoricalRate()); ++i) {
                obj = Array.get(this.getHistoricalRate(), i);
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
        if (this.getPeriodEndDate() != null) {
            for (i = 0; i < Array.getLength(this.getPeriodEndDate()); ++i) {
                obj = Array.get(this.getPeriodEndDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPeriodName() != null) {
            for (i = 0; i < Array.getLength(this.getPeriodName()); ++i) {
                obj = Array.get(this.getPeriodName(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPeriodStartDate() != null) {
            for (i = 0; i < Array.getLength(this.getPeriodStartDate()); ++i) {
                obj = Array.get(this.getPeriodStartDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getToCurrency() != null) {
            for (i = 0; i < Array.getLength(this.getToCurrency()); ++i) {
                obj = Array.get(this.getToCurrency(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getToSubsidiary() != null) {
            for (i = 0; i < Array.getLength(this.getToSubsidiary()); ++i) {
                obj = Array.get(this.getToSubsidiary(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ConsolidatedExchangeRateSearchRowBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("accountingBook");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "accountingBook"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("averageRate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "averageRate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("closed");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "closed"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("currentRate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "currentRate"));
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
        elemField.setFieldName("fromCurrency");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fromCurrency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fromSubsidiary");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fromSubsidiary"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("historicalRate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "historicalRate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("periodEndDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "periodEndDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("periodName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "periodName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("periodStartDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "periodStartDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("toCurrency");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "toCurrency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("toSubsidiary");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "toSubsidiary"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

