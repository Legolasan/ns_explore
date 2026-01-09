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
package com.netsuite.suitetalk.proxy.v2022_1.lists.accounting;

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

public class LocationBusinessHours
implements Serializable {
    private Calendar startTime;
    private Calendar endTime;
    private Boolean isSunday;
    private Boolean isMonday;
    private Boolean isTuesday;
    private Boolean isWednesday;
    private Boolean isThursday;
    private Boolean isFriday;
    private Boolean isSaturday;
    private Calendar sameDayPickupCutOffTime;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(LocationBusinessHours.class, true);

    public LocationBusinessHours() {
    }

    public LocationBusinessHours(Calendar startTime, Calendar endTime, Boolean isSunday, Boolean isMonday, Boolean isTuesday, Boolean isWednesday, Boolean isThursday, Boolean isFriday, Boolean isSaturday, Calendar sameDayPickupCutOffTime) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.isSunday = isSunday;
        this.isMonday = isMonday;
        this.isTuesday = isTuesday;
        this.isWednesday = isWednesday;
        this.isThursday = isThursday;
        this.isFriday = isFriday;
        this.isSaturday = isSaturday;
        this.sameDayPickupCutOffTime = sameDayPickupCutOffTime;
    }

    public Calendar getStartTime() {
        return this.startTime;
    }

    public void setStartTime(Calendar startTime) {
        this.startTime = startTime;
    }

    public Calendar getEndTime() {
        return this.endTime;
    }

    public void setEndTime(Calendar endTime) {
        this.endTime = endTime;
    }

    public Boolean getIsSunday() {
        return this.isSunday;
    }

    public void setIsSunday(Boolean isSunday) {
        this.isSunday = isSunday;
    }

    public Boolean getIsMonday() {
        return this.isMonday;
    }

    public void setIsMonday(Boolean isMonday) {
        this.isMonday = isMonday;
    }

    public Boolean getIsTuesday() {
        return this.isTuesday;
    }

    public void setIsTuesday(Boolean isTuesday) {
        this.isTuesday = isTuesday;
    }

    public Boolean getIsWednesday() {
        return this.isWednesday;
    }

    public void setIsWednesday(Boolean isWednesday) {
        this.isWednesday = isWednesday;
    }

    public Boolean getIsThursday() {
        return this.isThursday;
    }

    public void setIsThursday(Boolean isThursday) {
        this.isThursday = isThursday;
    }

    public Boolean getIsFriday() {
        return this.isFriday;
    }

    public void setIsFriday(Boolean isFriday) {
        this.isFriday = isFriday;
    }

    public Boolean getIsSaturday() {
        return this.isSaturday;
    }

    public void setIsSaturday(Boolean isSaturday) {
        this.isSaturday = isSaturday;
    }

    public Calendar getSameDayPickupCutOffTime() {
        return this.sameDayPickupCutOffTime;
    }

    public void setSameDayPickupCutOffTime(Calendar sameDayPickupCutOffTime) {
        this.sameDayPickupCutOffTime = sameDayPickupCutOffTime;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof LocationBusinessHours)) {
            return false;
        }
        LocationBusinessHours other = (LocationBusinessHours)obj;
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
        boolean _equals = (this.startTime == null && other.getStartTime() == null || this.startTime != null && this.startTime.equals(other.getStartTime())) && (this.endTime == null && other.getEndTime() == null || this.endTime != null && this.endTime.equals(other.getEndTime())) && (this.isSunday == null && other.getIsSunday() == null || this.isSunday != null && this.isSunday.equals(other.getIsSunday())) && (this.isMonday == null && other.getIsMonday() == null || this.isMonday != null && this.isMonday.equals(other.getIsMonday())) && (this.isTuesday == null && other.getIsTuesday() == null || this.isTuesday != null && this.isTuesday.equals(other.getIsTuesday())) && (this.isWednesday == null && other.getIsWednesday() == null || this.isWednesday != null && this.isWednesday.equals(other.getIsWednesday())) && (this.isThursday == null && other.getIsThursday() == null || this.isThursday != null && this.isThursday.equals(other.getIsThursday())) && (this.isFriday == null && other.getIsFriday() == null || this.isFriday != null && this.isFriday.equals(other.getIsFriday())) && (this.isSaturday == null && other.getIsSaturday() == null || this.isSaturday != null && this.isSaturday.equals(other.getIsSaturday())) && (this.sameDayPickupCutOffTime == null && other.getSameDayPickupCutOffTime() == null || this.sameDayPickupCutOffTime != null && this.sameDayPickupCutOffTime.equals(other.getSameDayPickupCutOffTime()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getStartTime() != null) {
            _hashCode += this.getStartTime().hashCode();
        }
        if (this.getEndTime() != null) {
            _hashCode += this.getEndTime().hashCode();
        }
        if (this.getIsSunday() != null) {
            _hashCode += this.getIsSunday().hashCode();
        }
        if (this.getIsMonday() != null) {
            _hashCode += this.getIsMonday().hashCode();
        }
        if (this.getIsTuesday() != null) {
            _hashCode += this.getIsTuesday().hashCode();
        }
        if (this.getIsWednesday() != null) {
            _hashCode += this.getIsWednesday().hashCode();
        }
        if (this.getIsThursday() != null) {
            _hashCode += this.getIsThursday().hashCode();
        }
        if (this.getIsFriday() != null) {
            _hashCode += this.getIsFriday().hashCode();
        }
        if (this.getIsSaturday() != null) {
            _hashCode += this.getIsSaturday().hashCode();
        }
        if (this.getSameDayPickupCutOffTime() != null) {
            _hashCode += this.getSameDayPickupCutOffTime().hashCode();
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
        typeDesc.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "LocationBusinessHours"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "startTime"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("endTime");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "endTime"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isSunday");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "isSunday"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isMonday");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "isMonday"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isTuesday");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "isTuesday"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isWednesday");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "isWednesday"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isThursday");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "isThursday"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isFriday");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "isFriday"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isSaturday");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "isSaturday"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("sameDayPickupCutOffTime");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "sameDayPickupCutOffTime"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

