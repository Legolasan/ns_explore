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

public class WsRole
implements Serializable {
    private RecordRef role;
    private Boolean isDefault;
    private Boolean isInactive;
    private Boolean isLoggedInRole;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(WsRole.class, true);

    public WsRole() {
    }

    public WsRole(RecordRef role, Boolean isDefault, Boolean isInactive, Boolean isLoggedInRole) {
        this.role = role;
        this.isDefault = isDefault;
        this.isInactive = isInactive;
        this.isLoggedInRole = isLoggedInRole;
    }

    public RecordRef getRole() {
        return this.role;
    }

    public void setRole(RecordRef role) {
        this.role = role;
    }

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public Boolean getIsInactive() {
        return this.isInactive;
    }

    public void setIsInactive(Boolean isInactive) {
        this.isInactive = isInactive;
    }

    public Boolean getIsLoggedInRole() {
        return this.isLoggedInRole;
    }

    public void setIsLoggedInRole(Boolean isLoggedInRole) {
        this.isLoggedInRole = isLoggedInRole;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof WsRole)) {
            return false;
        }
        WsRole other = (WsRole)obj;
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
        boolean _equals = (this.role == null && other.getRole() == null || this.role != null && this.role.equals(other.getRole())) && (this.isDefault == null && other.getIsDefault() == null || this.isDefault != null && this.isDefault.equals(other.getIsDefault())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && this.isInactive.equals(other.getIsInactive())) && (this.isLoggedInRole == null && other.getIsLoggedInRole() == null || this.isLoggedInRole != null && this.isLoggedInRole.equals(other.getIsLoggedInRole()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getRole() != null) {
            _hashCode += this.getRole().hashCode();
        }
        if (this.getIsDefault() != null) {
            _hashCode += this.getIsDefault().hashCode();
        }
        if (this.getIsInactive() != null) {
            _hashCode += this.getIsInactive().hashCode();
        }
        if (this.getIsLoggedInRole() != null) {
            _hashCode += this.getIsLoggedInRole().hashCode();
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
        typeDesc.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "WsRole"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("role");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "role"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isDefault");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "isDefault"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isLoggedInRole");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "isLoggedInRole"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

