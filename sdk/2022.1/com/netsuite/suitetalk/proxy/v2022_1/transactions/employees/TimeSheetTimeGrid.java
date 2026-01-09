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
package com.netsuite.suitetalk.proxy.v2022_1.transactions.employees;

import com.netsuite.suitetalk.proxy.v2022_1.transactions.employees.TimeEntry;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class TimeSheetTimeGrid
implements Serializable {
    private TimeEntry sunday;
    private TimeEntry monday;
    private TimeEntry tuesday;
    private TimeEntry wednesday;
    private TimeEntry thursday;
    private TimeEntry friday;
    private TimeEntry saturday;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(TimeSheetTimeGrid.class, true);

    public TimeSheetTimeGrid() {
    }

    public TimeSheetTimeGrid(TimeEntry sunday, TimeEntry monday, TimeEntry tuesday, TimeEntry wednesday, TimeEntry thursday, TimeEntry friday, TimeEntry saturday) {
        this.sunday = sunday;
        this.monday = monday;
        this.tuesday = tuesday;
        this.wednesday = wednesday;
        this.thursday = thursday;
        this.friday = friday;
        this.saturday = saturday;
    }

    public TimeEntry getSunday() {
        return this.sunday;
    }

    public void setSunday(TimeEntry sunday) {
        this.sunday = sunday;
    }

    public TimeEntry getMonday() {
        return this.monday;
    }

    public void setMonday(TimeEntry monday) {
        this.monday = monday;
    }

    public TimeEntry getTuesday() {
        return this.tuesday;
    }

    public void setTuesday(TimeEntry tuesday) {
        this.tuesday = tuesday;
    }

    public TimeEntry getWednesday() {
        return this.wednesday;
    }

    public void setWednesday(TimeEntry wednesday) {
        this.wednesday = wednesday;
    }

    public TimeEntry getThursday() {
        return this.thursday;
    }

    public void setThursday(TimeEntry thursday) {
        this.thursday = thursday;
    }

    public TimeEntry getFriday() {
        return this.friday;
    }

    public void setFriday(TimeEntry friday) {
        this.friday = friday;
    }

    public TimeEntry getSaturday() {
        return this.saturday;
    }

    public void setSaturday(TimeEntry saturday) {
        this.saturday = saturday;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TimeSheetTimeGrid)) {
            return false;
        }
        TimeSheetTimeGrid other = (TimeSheetTimeGrid)obj;
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
        boolean _equals = (this.sunday == null && other.getSunday() == null || this.sunday != null && this.sunday.equals(other.getSunday())) && (this.monday == null && other.getMonday() == null || this.monday != null && this.monday.equals(other.getMonday())) && (this.tuesday == null && other.getTuesday() == null || this.tuesday != null && this.tuesday.equals(other.getTuesday())) && (this.wednesday == null && other.getWednesday() == null || this.wednesday != null && this.wednesday.equals(other.getWednesday())) && (this.thursday == null && other.getThursday() == null || this.thursday != null && this.thursday.equals(other.getThursday())) && (this.friday == null && other.getFriday() == null || this.friday != null && this.friday.equals(other.getFriday())) && (this.saturday == null && other.getSaturday() == null || this.saturday != null && this.saturday.equals(other.getSaturday()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getSunday() != null) {
            _hashCode += this.getSunday().hashCode();
        }
        if (this.getMonday() != null) {
            _hashCode += this.getMonday().hashCode();
        }
        if (this.getTuesday() != null) {
            _hashCode += this.getTuesday().hashCode();
        }
        if (this.getWednesday() != null) {
            _hashCode += this.getWednesday().hashCode();
        }
        if (this.getThursday() != null) {
            _hashCode += this.getThursday().hashCode();
        }
        if (this.getFriday() != null) {
            _hashCode += this.getFriday().hashCode();
        }
        if (this.getSaturday() != null) {
            _hashCode += this.getSaturday().hashCode();
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
        typeDesc.setXmlType(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "TimeSheetTimeGrid"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("sunday");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "sunday"));
        elemField.setXmlType(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "TimeEntry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("monday");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "monday"));
        elemField.setXmlType(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "TimeEntry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("tuesday");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "tuesday"));
        elemField.setXmlType(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "TimeEntry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("wednesday");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "wednesday"));
        elemField.setXmlType(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "TimeEntry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("thursday");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "thursday"));
        elemField.setXmlType(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "TimeEntry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("friday");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "friday"));
        elemField.setXmlType(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "TimeEntry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("saturday");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "saturday"));
        elemField.setXmlType(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "TimeEntry"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

