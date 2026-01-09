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

public class BudgetExchangeRateFilter
implements Serializable {
    private RecordRef period;
    private RecordRef fromSubsidiary;
    private RecordRef toSubsidiary;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(BudgetExchangeRateFilter.class, true);

    public BudgetExchangeRateFilter() {
    }

    public BudgetExchangeRateFilter(RecordRef period, RecordRef fromSubsidiary, RecordRef toSubsidiary) {
        this.period = period;
        this.fromSubsidiary = fromSubsidiary;
        this.toSubsidiary = toSubsidiary;
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

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof BudgetExchangeRateFilter)) {
            return false;
        }
        BudgetExchangeRateFilter other = (BudgetExchangeRateFilter)obj;
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
        boolean _equals = (this.period == null && other.getPeriod() == null || this.period != null && this.period.equals(other.getPeriod())) && (this.fromSubsidiary == null && other.getFromSubsidiary() == null || this.fromSubsidiary != null && this.fromSubsidiary.equals(other.getFromSubsidiary())) && (this.toSubsidiary == null && other.getToSubsidiary() == null || this.toSubsidiary != null && this.toSubsidiary.equals(other.getToSubsidiary()));
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
        typeDesc.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "BudgetExchangeRateFilter"));
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
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("toSubsidiary");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "toSubsidiary"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

