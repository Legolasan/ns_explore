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

public class ChangeEmail
implements Serializable {
    private String currentPassword;
    private String newEmail;
    private String newEmail2;
    private Boolean justThisAccount;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(ChangeEmail.class, true);

    public ChangeEmail() {
    }

    public ChangeEmail(String currentPassword, String newEmail, String newEmail2, Boolean justThisAccount) {
        this.currentPassword = currentPassword;
        this.newEmail = newEmail;
        this.newEmail2 = newEmail2;
        this.justThisAccount = justThisAccount;
    }

    public String getCurrentPassword() {
        return this.currentPassword;
    }

    public void setCurrentPassword(String currentPassword) {
        this.currentPassword = currentPassword;
    }

    public String getNewEmail() {
        return this.newEmail;
    }

    public void setNewEmail(String newEmail) {
        this.newEmail = newEmail;
    }

    public String getNewEmail2() {
        return this.newEmail2;
    }

    public void setNewEmail2(String newEmail2) {
        this.newEmail2 = newEmail2;
    }

    public Boolean getJustThisAccount() {
        return this.justThisAccount;
    }

    public void setJustThisAccount(Boolean justThisAccount) {
        this.justThisAccount = justThisAccount;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ChangeEmail)) {
            return false;
        }
        ChangeEmail other = (ChangeEmail)obj;
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
        boolean _equals = (this.currentPassword == null && other.getCurrentPassword() == null || this.currentPassword != null && this.currentPassword.equals(other.getCurrentPassword())) && (this.newEmail == null && other.getNewEmail() == null || this.newEmail != null && this.newEmail.equals(other.getNewEmail())) && (this.newEmail2 == null && other.getNewEmail2() == null || this.newEmail2 != null && this.newEmail2.equals(other.getNewEmail2())) && (this.justThisAccount == null && other.getJustThisAccount() == null || this.justThisAccount != null && this.justThisAccount.equals(other.getJustThisAccount()));
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
        if (this.getNewEmail() != null) {
            _hashCode += this.getNewEmail().hashCode();
        }
        if (this.getNewEmail2() != null) {
            _hashCode += this.getNewEmail2().hashCode();
        }
        if (this.getJustThisAccount() != null) {
            _hashCode += this.getJustThisAccount().hashCode();
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
        typeDesc.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "ChangeEmail"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("currentPassword");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "currentPassword"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("newEmail");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "newEmail"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("newEmail2");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "newEmail2"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("justThisAccount");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "justThisAccount"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

