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
package com.netsuite.suitetalk.proxy.v2022_1.lists.support;

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

public class SupportCaseSolutions
implements Serializable {
    private RecordRef solution;
    private String message;
    private Calendar dateApplied;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(SupportCaseSolutions.class, true);

    public SupportCaseSolutions() {
    }

    public SupportCaseSolutions(RecordRef solution, String message, Calendar dateApplied) {
        this.solution = solution;
        this.message = message;
        this.dateApplied = dateApplied;
    }

    public RecordRef getSolution() {
        return this.solution;
    }

    public void setSolution(RecordRef solution) {
        this.solution = solution;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Calendar getDateApplied() {
        return this.dateApplied;
    }

    public void setDateApplied(Calendar dateApplied) {
        this.dateApplied = dateApplied;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SupportCaseSolutions)) {
            return false;
        }
        SupportCaseSolutions other = (SupportCaseSolutions)obj;
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
        boolean _equals = (this.solution == null && other.getSolution() == null || this.solution != null && this.solution.equals(other.getSolution())) && (this.message == null && other.getMessage() == null || this.message != null && this.message.equals(other.getMessage())) && (this.dateApplied == null && other.getDateApplied() == null || this.dateApplied != null && this.dateApplied.equals(other.getDateApplied()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getSolution() != null) {
            _hashCode += this.getSolution().hashCode();
        }
        if (this.getMessage() != null) {
            _hashCode += this.getMessage().hashCode();
        }
        if (this.getDateApplied() != null) {
            _hashCode += this.getDateApplied().hashCode();
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
        typeDesc.setXmlType(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "SupportCaseSolutions"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("solution");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "solution"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "message"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("dateApplied");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "dateApplied"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

