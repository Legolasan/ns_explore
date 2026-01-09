/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.axis.description.AttributeDesc
 *  org.apache.axis.description.ElementDesc
 *  org.apache.axis.description.FieldDesc
 *  org.apache.axis.description.TypeDesc
 *  org.apache.axis.encoding.Deserializer
 *  org.apache.axis.encoding.Serializer
 *  org.apache.axis.encoding.ser.BeanDeserializer
 *  org.apache.axis.encoding.ser.BeanSerializer
 */
package com.netsuite.suitetalk.proxy.v2022_1.lists.accounting;

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.NullField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.Record;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.AttributeDesc;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class ConsolidatedExchangeRate
extends Record
implements Serializable {
    private String postingPeriod;
    private String fromSubsidiary;
    private String fromCurrency;
    private String toSubsidiary;
    private String toCurrency;
    private Double averageRate;
    private Double currentRate;
    private Double historicalRate;
    private String accountingBook;
    private Boolean isPeriodClosed;
    private Boolean isDerived;
    private Boolean isEliminationSubsidiary;
    private String internalId;
    private String externalId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(ConsolidatedExchangeRate.class, true);

    public ConsolidatedExchangeRate() {
    }

    public ConsolidatedExchangeRate(NullField nullFieldList, String internalId, String externalId, String postingPeriod, String fromSubsidiary, String fromCurrency, String toSubsidiary, String toCurrency, Double averageRate, Double currentRate, Double historicalRate, String accountingBook, Boolean isPeriodClosed, Boolean isDerived, Boolean isEliminationSubsidiary) {
        super(nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.postingPeriod = postingPeriod;
        this.fromSubsidiary = fromSubsidiary;
        this.fromCurrency = fromCurrency;
        this.toSubsidiary = toSubsidiary;
        this.toCurrency = toCurrency;
        this.averageRate = averageRate;
        this.currentRate = currentRate;
        this.historicalRate = historicalRate;
        this.accountingBook = accountingBook;
        this.isPeriodClosed = isPeriodClosed;
        this.isDerived = isDerived;
        this.isEliminationSubsidiary = isEliminationSubsidiary;
    }

    public String getPostingPeriod() {
        return this.postingPeriod;
    }

    public void setPostingPeriod(String postingPeriod) {
        this.postingPeriod = postingPeriod;
    }

    public String getFromSubsidiary() {
        return this.fromSubsidiary;
    }

    public void setFromSubsidiary(String fromSubsidiary) {
        this.fromSubsidiary = fromSubsidiary;
    }

    public String getFromCurrency() {
        return this.fromCurrency;
    }

    public void setFromCurrency(String fromCurrency) {
        this.fromCurrency = fromCurrency;
    }

    public String getToSubsidiary() {
        return this.toSubsidiary;
    }

    public void setToSubsidiary(String toSubsidiary) {
        this.toSubsidiary = toSubsidiary;
    }

    public String getToCurrency() {
        return this.toCurrency;
    }

    public void setToCurrency(String toCurrency) {
        this.toCurrency = toCurrency;
    }

    public Double getAverageRate() {
        return this.averageRate;
    }

    public void setAverageRate(Double averageRate) {
        this.averageRate = averageRate;
    }

    public Double getCurrentRate() {
        return this.currentRate;
    }

    public void setCurrentRate(Double currentRate) {
        this.currentRate = currentRate;
    }

    public Double getHistoricalRate() {
        return this.historicalRate;
    }

    public void setHistoricalRate(Double historicalRate) {
        this.historicalRate = historicalRate;
    }

    public String getAccountingBook() {
        return this.accountingBook;
    }

    public void setAccountingBook(String accountingBook) {
        this.accountingBook = accountingBook;
    }

    public Boolean getIsPeriodClosed() {
        return this.isPeriodClosed;
    }

    public void setIsPeriodClosed(Boolean isPeriodClosed) {
        this.isPeriodClosed = isPeriodClosed;
    }

    public Boolean getIsDerived() {
        return this.isDerived;
    }

    public void setIsDerived(Boolean isDerived) {
        this.isDerived = isDerived;
    }

    public Boolean getIsEliminationSubsidiary() {
        return this.isEliminationSubsidiary;
    }

    public void setIsEliminationSubsidiary(Boolean isEliminationSubsidiary) {
        this.isEliminationSubsidiary = isEliminationSubsidiary;
    }

    public String getInternalId() {
        return this.internalId;
    }

    public void setInternalId(String internalId) {
        this.internalId = internalId;
    }

    public String getExternalId() {
        return this.externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ConsolidatedExchangeRate)) {
            return false;
        }
        ConsolidatedExchangeRate other = (ConsolidatedExchangeRate)obj;
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
        boolean _equals = super.equals(obj) && (this.postingPeriod == null && other.getPostingPeriod() == null || this.postingPeriod != null && this.postingPeriod.equals(other.getPostingPeriod())) && (this.fromSubsidiary == null && other.getFromSubsidiary() == null || this.fromSubsidiary != null && this.fromSubsidiary.equals(other.getFromSubsidiary())) && (this.fromCurrency == null && other.getFromCurrency() == null || this.fromCurrency != null && this.fromCurrency.equals(other.getFromCurrency())) && (this.toSubsidiary == null && other.getToSubsidiary() == null || this.toSubsidiary != null && this.toSubsidiary.equals(other.getToSubsidiary())) && (this.toCurrency == null && other.getToCurrency() == null || this.toCurrency != null && this.toCurrency.equals(other.getToCurrency())) && (this.averageRate == null && other.getAverageRate() == null || this.averageRate != null && this.averageRate.equals(other.getAverageRate())) && (this.currentRate == null && other.getCurrentRate() == null || this.currentRate != null && this.currentRate.equals(other.getCurrentRate())) && (this.historicalRate == null && other.getHistoricalRate() == null || this.historicalRate != null && this.historicalRate.equals(other.getHistoricalRate())) && (this.accountingBook == null && other.getAccountingBook() == null || this.accountingBook != null && this.accountingBook.equals(other.getAccountingBook())) && (this.isPeriodClosed == null && other.getIsPeriodClosed() == null || this.isPeriodClosed != null && this.isPeriodClosed.equals(other.getIsPeriodClosed())) && (this.isDerived == null && other.getIsDerived() == null || this.isDerived != null && this.isDerived.equals(other.getIsDerived())) && (this.isEliminationSubsidiary == null && other.getIsEliminationSubsidiary() == null || this.isEliminationSubsidiary != null && this.isEliminationSubsidiary.equals(other.getIsEliminationSubsidiary())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
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
        if (this.getPostingPeriod() != null) {
            _hashCode += this.getPostingPeriod().hashCode();
        }
        if (this.getFromSubsidiary() != null) {
            _hashCode += this.getFromSubsidiary().hashCode();
        }
        if (this.getFromCurrency() != null) {
            _hashCode += this.getFromCurrency().hashCode();
        }
        if (this.getToSubsidiary() != null) {
            _hashCode += this.getToSubsidiary().hashCode();
        }
        if (this.getToCurrency() != null) {
            _hashCode += this.getToCurrency().hashCode();
        }
        if (this.getAverageRate() != null) {
            _hashCode += this.getAverageRate().hashCode();
        }
        if (this.getCurrentRate() != null) {
            _hashCode += this.getCurrentRate().hashCode();
        }
        if (this.getHistoricalRate() != null) {
            _hashCode += this.getHistoricalRate().hashCode();
        }
        if (this.getAccountingBook() != null) {
            _hashCode += this.getAccountingBook().hashCode();
        }
        if (this.getIsPeriodClosed() != null) {
            _hashCode += this.getIsPeriodClosed().hashCode();
        }
        if (this.getIsDerived() != null) {
            _hashCode += this.getIsDerived().hashCode();
        }
        if (this.getIsEliminationSubsidiary() != null) {
            _hashCode += this.getIsEliminationSubsidiary().hashCode();
        }
        if (this.getInternalId() != null) {
            _hashCode += this.getInternalId().hashCode();
        }
        if (this.getExternalId() != null) {
            _hashCode += this.getExternalId().hashCode();
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
        typeDesc.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "ConsolidatedExchangeRate"));
        AttributeDesc attrField = new AttributeDesc();
        attrField.setFieldName("internalId");
        attrField.setXmlName(new QName("", "internalId"));
        attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc((FieldDesc)attrField);
        attrField = new AttributeDesc();
        attrField.setFieldName("externalId");
        attrField.setXmlName(new QName("", "externalId"));
        attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc((FieldDesc)attrField);
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("postingPeriod");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "postingPeriod"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fromSubsidiary");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "fromSubsidiary"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fromCurrency");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "fromCurrency"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("toSubsidiary");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "toSubsidiary"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("toCurrency");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "toCurrency"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("averageRate");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "averageRate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("currentRate");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "currentRate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("historicalRate");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "historicalRate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("accountingBook");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "accountingBook"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isPeriodClosed");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "isPeriodClosed"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isDerived");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "isDerived"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isEliminationSubsidiary");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "isEliminationSubsidiary"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

