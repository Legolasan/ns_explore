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
package com.netsuite.suitetalk.proxy.v2022_1.platform.core;

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import java.io.Serializable;
import java.util.Calendar;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class CurrencyRate
implements Serializable {
    private RecordRef baseCurrency;
    private RecordRef fromCurrency;
    private double exchangeRate;
    private Calendar effectiveDate;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(CurrencyRate.class, true);

    public CurrencyRate() {
    }

    public CurrencyRate(RecordRef baseCurrency, RecordRef fromCurrency, double exchangeRate, Calendar effectiveDate) {
        this.baseCurrency = baseCurrency;
        this.fromCurrency = fromCurrency;
        this.exchangeRate = exchangeRate;
        this.effectiveDate = effectiveDate;
    }

    public RecordRef getBaseCurrency() {
        return this.baseCurrency;
    }

    public void setBaseCurrency(RecordRef baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public RecordRef getFromCurrency() {
        return this.fromCurrency;
    }

    public void setFromCurrency(RecordRef fromCurrency) {
        this.fromCurrency = fromCurrency;
    }

    public double getExchangeRate() {
        return this.exchangeRate;
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public Calendar getEffectiveDate() {
        return this.effectiveDate;
    }

    public void setEffectiveDate(Calendar effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CurrencyRate)) {
            return false;
        }
        CurrencyRate other = (CurrencyRate)obj;
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
        boolean _equals = (this.baseCurrency == null && other.getBaseCurrency() == null || this.baseCurrency != null && this.baseCurrency.equals(other.getBaseCurrency())) && (this.fromCurrency == null && other.getFromCurrency() == null || this.fromCurrency != null && this.fromCurrency.equals(other.getFromCurrency())) && this.exchangeRate == other.getExchangeRate() && (this.effectiveDate == null && other.getEffectiveDate() == null || this.effectiveDate != null && this.effectiveDate.equals(other.getEffectiveDate()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getBaseCurrency() != null) {
            _hashCode += this.getBaseCurrency().hashCode();
        }
        if (this.getFromCurrency() != null) {
            _hashCode += this.getFromCurrency().hashCode();
        }
        _hashCode += new Double(this.getExchangeRate()).hashCode();
        if (this.getEffectiveDate() != null) {
            _hashCode += this.getEffectiveDate().hashCode();
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
        typeDesc.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "CurrencyRate"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("baseCurrency");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "baseCurrency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fromCurrency");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "fromCurrency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("exchangeRate");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "exchangeRate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("effectiveDate");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "effectiveDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

