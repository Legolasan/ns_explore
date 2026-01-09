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
package com.netsuite.suitetalk.proxy.v2022_1.activities.scheduling;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Calendar;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class ExclusionDateList
implements Serializable {
    private Calendar[] exclusionDate;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(ExclusionDateList.class, true);

    public ExclusionDateList() {
    }

    public ExclusionDateList(Calendar[] exclusionDate) {
        this.exclusionDate = exclusionDate;
    }

    public Calendar[] getExclusionDate() {
        return this.exclusionDate;
    }

    public void setExclusionDate(Calendar[] exclusionDate) {
        this.exclusionDate = exclusionDate;
    }

    public Calendar getExclusionDate(int i) {
        return this.exclusionDate[i];
    }

    public void setExclusionDate(int i, Calendar _value) {
        this.exclusionDate[i] = _value;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ExclusionDateList)) {
            return false;
        }
        ExclusionDateList other = (ExclusionDateList)obj;
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
        boolean _equals = this.exclusionDate == null && other.getExclusionDate() == null || this.exclusionDate != null && Arrays.equals(this.exclusionDate, other.getExclusionDate());
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getExclusionDate() != null) {
            for (int i = 0; i < Array.getLength(this.getExclusionDate()); ++i) {
                Object obj = Array.get(this.getExclusionDate(), i);
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
        typeDesc.setXmlType(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "ExclusionDateList"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("exclusionDate");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "exclusionDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

