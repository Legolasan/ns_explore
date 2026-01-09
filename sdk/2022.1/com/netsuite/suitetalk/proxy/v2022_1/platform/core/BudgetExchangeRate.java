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
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class BudgetExchangeRate
implements Serializable {
    private RecordRef period;
    private RecordRef fromSubsidiary;
    private RecordRef toSubsidiary;
    private Double currentRate;
    private Double averageRate;
    private Double historicalRate;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(BudgetExchangeRate.class, true);

    public BudgetExchangeRate() {
    }

    public BudgetExchangeRate(RecordRef period, RecordRef fromSubsidiary, RecordRef toSubsidiary, Double currentRate, Double averageRate, Double historicalRate) {
        this.period = period;
        this.fromSubsidiary = fromSubsidiary;
        this.toSubsidiary = toSubsidiary;
        this.currentRate = currentRate;
        this.averageRate = averageRate;
        this.historicalRate = historicalRate;
    }

    public RecordRef getPeriod() {
        return this.period;
    }

    public void setPeriod(RecordRef period) {
        this.period = period;
    }

    public RecordRef getFromSubsidiary() {
        return this.fromSubsidiary;
    }

    public void setFromSubsidiary(RecordRef fromSubsidiary) {
        this.fromSubsidiary = fromSubsidiary;
    }

    public RecordRef getToSubsidiary() {
        return this.toSubsidiary;
    }

    public void setToSubsidiary(RecordRef toSubsidiary) {
        this.toSubsidiary = toSubsidiary;
    }

    public Double getCurrentRate() {
        return this.currentRate;
    }

    public void setCurrentRate(Double currentRate) {
        this.currentRate = currentRate;
    }

    public Double getAverageRate() {
        return this.averageRate;
    }

    public void setAverageRate(Double averageRate) {
        this.averageRate = averageRate;
    }

    public Double getHistoricalRate() {
        return this.historicalRate;
    }

    public void setHistoricalRate(Double historicalRate) {
        this.historicalRate = historicalRate;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof BudgetExchangeRate)) {
            return false;
        }
        BudgetExchangeRate other = (BudgetExchangeRate)obj;
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
        boolean _equals = (this.period == null && other.getPeriod() == null || this.period != null && this.period.equals(other.getPeriod())) && (this.fromSubsidiary == null && other.getFromSubsidiary() == null || this.fromSubsidiary != null && this.fromSubsidiary.equals(other.getFromSubsidiary())) && (this.toSubsidiary == null && other.getToSubsidiary() == null || this.toSubsidiary != null && this.toSubsidiary.equals(other.getToSubsidiary())) && (this.currentRate == null && other.getCurrentRate() == null || this.currentRate != null && this.currentRate.equals(other.getCurrentRate())) && (this.averageRate == null && other.getAverageRate() == null || this.averageRate != null && this.averageRate.equals(other.getAverageRate())) && (this.historicalRate == null && other.getHistoricalRate() == null || this.historicalRate != null && this.historicalRate.equals(other.getHistoricalRate()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getPeriod() != null) {
            _hashCode += this.getPeriod().hashCode();
        }
        if (this.getFromSubsidiary() != null) {
            _hashCode += this.getFromSubsidiary().hashCode();
        }
        if (this.getToSubsidiary() != null) {
            _hashCode += this.getToSubsidiary().hashCode();
        }
        if (this.getCurrentRate() != null) {
            _hashCode += this.getCurrentRate().hashCode();
        }
        if (this.getAverageRate() != null) {
            _hashCode += this.getAverageRate().hashCode();
        }
        if (this.getHistoricalRate() != null) {
            _hashCode += this.getHistoricalRate().hashCode();
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
        typeDesc.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "BudgetExchangeRate"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("period");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "period"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fromSubsidiary");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "fromSubsidiary"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("toSubsidiary");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "toSubsidiary"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("currentRate");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "currentRate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("averageRate");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "averageRate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("historicalRate");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "historicalRate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

