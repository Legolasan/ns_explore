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
import java.lang.reflect.Array;
import java.util.Arrays;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class EmailEmployeesList
implements Serializable {
    private RecordRef[] emailEmployees;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(EmailEmployeesList.class, true);

    public EmailEmployeesList() {
    }

    public EmailEmployeesList(RecordRef[] emailEmployees) {
        this.emailEmployees = emailEmployees;
    }

    public RecordRef[] getEmailEmployees() {
        return this.emailEmployees;
    }

    public void setEmailEmployees(RecordRef[] emailEmployees) {
        this.emailEmployees = emailEmployees;
    }

    public RecordRef getEmailEmployees(int i) {
        return this.emailEmployees[i];
    }

    public void setEmailEmployees(int i, RecordRef _value) {
        this.emailEmployees[i] = _value;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof EmailEmployeesList)) {
            return false;
        }
        EmailEmployeesList other = (EmailEmployeesList)obj;
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
        boolean _equals = this.emailEmployees == null && other.getEmailEmployees() == null || this.emailEmployees != null && Arrays.equals(this.emailEmployees, other.getEmailEmployees());
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getEmailEmployees() != null) {
            for (int i = 0; i < Array.getLength(this.getEmailEmployees()); ++i) {
                Object obj = Array.get(this.getEmailEmployees(), i);
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
        typeDesc.setXmlType(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "EmailEmployeesList"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("emailEmployees");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "emailEmployees"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

