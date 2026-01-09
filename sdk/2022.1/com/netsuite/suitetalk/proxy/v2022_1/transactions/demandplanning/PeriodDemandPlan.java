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
package com.netsuite.suitetalk.proxy.v2022_1.transactions.demandplanning;

import com.netsuite.suitetalk.proxy.v2022_1.transactions.demandplanning.types.DayOfTheWeek;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class PeriodDemandPlan
implements Serializable {
    private double quantity;
    private DayOfTheWeek dayOfTheWeek;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(PeriodDemandPlan.class, true);

    public PeriodDemandPlan() {
    }

    public PeriodDemandPlan(double quantity, DayOfTheWeek dayOfTheWeek) {
        this.quantity = quantity;
        this.dayOfTheWeek = dayOfTheWeek;
    }

    public double getQuantity() {
        return this.quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }

    public DayOfTheWeek getDayOfTheWeek() {
        return this.dayOfTheWeek;
    }

    public void setDayOfTheWeek(DayOfTheWeek dayOfTheWeek) {
        this.dayOfTheWeek = dayOfTheWeek;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PeriodDemandPlan)) {
            return false;
        }
        PeriodDemandPlan other = (PeriodDemandPlan)obj;
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
        boolean _equals = this.quantity == other.getQuantity() && (this.dayOfTheWeek == null && other.getDayOfTheWeek() == null || this.dayOfTheWeek != null && this.dayOfTheWeek.equals(other.getDayOfTheWeek()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += new Double(this.getQuantity()).hashCode();
        if (this.getDayOfTheWeek() != null) {
            _hashCode += this.getDayOfTheWeek().hashCode();
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
        typeDesc.setXmlType(new QName("urn:demandplanning_2022_1.transactions.webservices.netsuite.com", "PeriodDemandPlan"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new QName("urn:demandplanning_2022_1.transactions.webservices.netsuite.com", "quantity"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("dayOfTheWeek");
        elemField.setXmlName(new QName("urn:demandplanning_2022_1.transactions.webservices.netsuite.com", "dayOfTheWeek"));
        elemField.setXmlType(new QName("urn:types.demandplanning_2022_1.transactions.webservices.netsuite.com", "DayOfTheWeek"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

