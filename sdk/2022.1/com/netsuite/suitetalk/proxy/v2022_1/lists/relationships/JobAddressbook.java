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

import com.netsuite.suitetalk.proxy.v2022_1.platform.common.Address;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class JobAddressbook
implements Serializable {
    private Boolean defaultShipping;
    private Boolean defaultBilling;
    private Boolean isResidential;
    private String label;
    private String internalId;
    private Address addressbookAddress;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(JobAddressbook.class, true);

    public JobAddressbook() {
    }

    public JobAddressbook(Boolean defaultShipping, Boolean defaultBilling, Boolean isResidential, String label, String internalId, Address addressbookAddress) {
        this.defaultShipping = defaultShipping;
        this.defaultBilling = defaultBilling;
        this.isResidential = isResidential;
        this.label = label;
        this.internalId = internalId;
        this.addressbookAddress = addressbookAddress;
    }

    public Boolean getDefaultShipping() {
        return this.defaultShipping;
    }

    public void setDefaultShipping(Boolean defaultShipping) {
        this.defaultShipping = defaultShipping;
    }

    public Boolean getDefaultBilling() {
        return this.defaultBilling;
    }

    public void setDefaultBilling(Boolean defaultBilling) {
        this.defaultBilling = defaultBilling;
    }

    public Boolean getIsResidential() {
        return this.isResidential;
    }

    public void setIsResidential(Boolean isResidential) {
        this.isResidential = isResidential;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getInternalId() {
        return this.internalId;
    }

    public void setInternalId(String internalId) {
        this.internalId = internalId;
    }

    public Address getAddressbookAddress() {
        return this.addressbookAddress;
    }

    public void setAddressbookAddress(Address addressbookAddress) {
        this.addressbookAddress = addressbookAddress;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof JobAddressbook)) {
            return false;
        }
        JobAddressbook other = (JobAddressbook)obj;
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
        boolean _equals = (this.defaultShipping == null && other.getDefaultShipping() == null || this.defaultShipping != null && this.defaultShipping.equals(other.getDefaultShipping())) && (this.defaultBilling == null && other.getDefaultBilling() == null || this.defaultBilling != null && this.defaultBilling.equals(other.getDefaultBilling())) && (this.isResidential == null && other.getIsResidential() == null || this.isResidential != null && this.isResidential.equals(other.getIsResidential())) && (this.label == null && other.getLabel() == null || this.label != null && this.label.equals(other.getLabel())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.addressbookAddress == null && other.getAddressbookAddress() == null || this.addressbookAddress != null && this.addressbookAddress.equals(other.getAddressbookAddress()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getDefaultShipping() != null) {
            _hashCode += this.getDefaultShipping().hashCode();
        }
        if (this.getDefaultBilling() != null) {
            _hashCode += this.getDefaultBilling().hashCode();
        }
        if (this.getIsResidential() != null) {
            _hashCode += this.getIsResidential().hashCode();
        }
        if (this.getLabel() != null) {
            _hashCode += this.getLabel().hashCode();
        }
        if (this.getInternalId() != null) {
            _hashCode += this.getInternalId().hashCode();
        }
        if (this.getAddressbookAddress() != null) {
            _hashCode += this.getAddressbookAddress().hashCode();
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
        typeDesc.setXmlType(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "JobAddressbook"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("defaultShipping");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "defaultShipping"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("defaultBilling");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "defaultBilling"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isResidential");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "isResidential"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "label"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("addressbookAddress");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "addressbookAddress"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

