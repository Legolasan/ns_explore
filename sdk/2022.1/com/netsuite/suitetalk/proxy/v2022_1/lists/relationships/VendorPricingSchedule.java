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
package com.netsuite.suitetalk.proxy.v2022_1.lists.relationships;

import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class VendorPricingSchedule
implements Serializable {
    private String scheduleName;
    private Double scheduleDiscount;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(VendorPricingSchedule.class, true);

    public VendorPricingSchedule() {
    }

    public VendorPricingSchedule(String scheduleName, Double scheduleDiscount) {
        this.scheduleName = scheduleName;
        this.scheduleDiscount = scheduleDiscount;
    }

    public String getScheduleName() {
        return this.scheduleName;
    }

    public void setScheduleName(String scheduleName) {
        this.scheduleName = scheduleName;
    }

    public Double getScheduleDiscount() {
        return this.scheduleDiscount;
    }

    public void setScheduleDiscount(Double scheduleDiscount) {
        this.scheduleDiscount = scheduleDiscount;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof VendorPricingSchedule)) {
            return false;
        }
        VendorPricingSchedule other = (VendorPricingSchedule)obj;
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
        boolean _equals = (this.scheduleName == null && other.getScheduleName() == null || this.scheduleName != null && this.scheduleName.equals(other.getScheduleName())) && (this.scheduleDiscount == null && other.getScheduleDiscount() == null || this.scheduleDiscount != null && this.scheduleDiscount.equals(other.getScheduleDiscount()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getScheduleName() != null) {
            _hashCode += this.getScheduleName().hashCode();
        }
        if (this.getScheduleDiscount() != null) {
            _hashCode += this.getScheduleDiscount().hashCode();
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
        typeDesc.setXmlType(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "VendorPricingSchedule"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("scheduleName");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "scheduleName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("scheduleDiscount");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "scheduleDiscount"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

