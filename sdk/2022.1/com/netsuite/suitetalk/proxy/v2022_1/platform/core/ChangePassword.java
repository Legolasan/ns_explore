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

import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class ChangePassword
implements Serializable {
    private String currentPassword;
    private String newPassword;
    private String newPassword2;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(ChangePassword.class, true);

    public ChangePassword() {
    }

    public ChangePassword(String currentPassword, String newPassword, String newPassword2) {
        this.currentPassword = currentPassword;
        this.newPassword = newPassword;
        this.newPassword2 = newPassword2;
    }

    public String getCurrentPassword() {
        return this.currentPassword;
    }

    public void setCurrentPassword(String currentPassword) {
        this.currentPassword = currentPassword;
    }

    public String getNewPassword() {
        return this.newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getNewPassword2() {
        return this.newPassword2;
    }

    public void setNewPassword2(String newPassword2) {
        this.newPassword2 = newPassword2;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ChangePassword)) {
            return false;
        }
        ChangePassword other = (ChangePassword)obj;
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
        boolean _equals = (this.currentPassword == null && other.getCurrentPassword() == null || this.currentPassword != null && this.currentPassword.equals(other.getCurrentPassword())) && (this.newPassword == null && other.getNewPassword() == null || this.newPassword != null && this.newPassword.equals(other.getNewPassword())) && (this.newPassword2 == null && other.getNewPassword2() == null || this.newPassword2 != null && this.newPassword2.equals(other.getNewPassword2()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getCurrentPassword() != null) {
            _hashCode += this.getCurrentPassword().hashCode();
        }
        if (this.getNewPassword() != null) {
            _hashCode += this.getNewPassword().hashCode();
        }
        if (this.getNewPassword2() != null) {
            _hashCode += this.getNewPassword2().hashCode();
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
        typeDesc.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "ChangePassword"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("currentPassword");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "currentPassword"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("newPassword");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "newPassword"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("newPassword2");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "newPassword2"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

