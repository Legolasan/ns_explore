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

public class ContactAccessRoles
implements Serializable {
    private Boolean giveAccess;
    private RecordRef contact;
    private String email;
    private RecordRef role;
    private String password;
    private String password2;
    private Boolean sendEmail;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(ContactAccessRoles.class, true);

    public ContactAccessRoles() {
    }

    public ContactAccessRoles(Boolean giveAccess, RecordRef contact, String email, RecordRef role, String password, String password2, Boolean sendEmail) {
        this.giveAccess = giveAccess;
        this.contact = contact;
        this.email = email;
        this.role = role;
        this.password = password;
        this.password2 = password2;
        this.sendEmail = sendEmail;
    }

    public Boolean getGiveAccess() {
        return this.giveAccess;
    }

    public void setGiveAccess(Boolean giveAccess) {
        this.giveAccess = giveAccess;
    }

    public RecordRef getContact() {
        return this.contact;
    }

    public void setContact(RecordRef contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public RecordRef getRole() {
        return this.role;
    }

    public void setRole(RecordRef role) {
        this.role = role;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword2() {
        return this.password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    public Boolean getSendEmail() {
        return this.sendEmail;
    }

    public void setSendEmail(Boolean sendEmail) {
        this.sendEmail = sendEmail;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ContactAccessRoles)) {
            return false;
        }
        ContactAccessRoles other = (ContactAccessRoles)obj;
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
        boolean _equals = (this.giveAccess == null && other.getGiveAccess() == null || this.giveAccess != null && this.giveAccess.equals(other.getGiveAccess())) && (this.contact == null && other.getContact() == null || this.contact != null && this.contact.equals(other.getContact())) && (this.email == null && other.getEmail() == null || this.email != null && this.email.equals(other.getEmail())) && (this.role == null && other.getRole() == null || this.role != null && this.role.equals(other.getRole())) && (this.password == null && other.getPassword() == null || this.password != null && this.password.equals(other.getPassword())) && (this.password2 == null && other.getPassword2() == null || this.password2 != null && this.password2.equals(other.getPassword2())) && (this.sendEmail == null && other.getSendEmail() == null || this.sendEmail != null && this.sendEmail.equals(other.getSendEmail()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getGiveAccess() != null) {
            _hashCode += this.getGiveAccess().hashCode();
        }
        if (this.getContact() != null) {
            _hashCode += this.getContact().hashCode();
        }
        if (this.getEmail() != null) {
            _hashCode += this.getEmail().hashCode();
        }
        if (this.getRole() != null) {
            _hashCode += this.getRole().hashCode();
        }
        if (this.getPassword() != null) {
            _hashCode += this.getPassword().hashCode();
        }
        if (this.getPassword2() != null) {
            _hashCode += this.getPassword2().hashCode();
        }
        if (this.getSendEmail() != null) {
            _hashCode += this.getSendEmail().hashCode();
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
        typeDesc.setXmlType(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "ContactAccessRoles"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("giveAccess");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "giveAccess"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("contact");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "contact"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "email"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("role");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "role"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "password"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("password2");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "password2"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("sendEmail");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "sendEmail"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

