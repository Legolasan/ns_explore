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

import com.netsuite.suitetalk.proxy.v2022_1.platform.common.types.Country;
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

public class PartnerTaxRegistration
implements Serializable {
    private Country nexusCountry;
    private RecordRef nexus;
    private RecordRef address;
    private String taxRegistrationNumber;
    private Long id;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(PartnerTaxRegistration.class, true);

    public PartnerTaxRegistration() {
    }

    public PartnerTaxRegistration(Country nexusCountry, RecordRef nexus, RecordRef address, String taxRegistrationNumber, Long id) {
        this.nexusCountry = nexusCountry;
        this.nexus = nexus;
        this.address = address;
        this.taxRegistrationNumber = taxRegistrationNumber;
        this.id = id;
    }

    public Country getNexusCountry() {
        return this.nexusCountry;
    }

    public void setNexusCountry(Country nexusCountry) {
        this.nexusCountry = nexusCountry;
    }

    public RecordRef getNexus() {
        return this.nexus;
    }

    public void setNexus(RecordRef nexus) {
        this.nexus = nexus;
    }

    public RecordRef getAddress() {
        return this.address;
    }

    public void setAddress(RecordRef address) {
        this.address = address;
    }

    public String getTaxRegistrationNumber() {
        return this.taxRegistrationNumber;
    }

    public void setTaxRegistrationNumber(String taxRegistrationNumber) {
        this.taxRegistrationNumber = taxRegistrationNumber;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PartnerTaxRegistration)) {
            return false;
        }
        PartnerTaxRegistration other = (PartnerTaxRegistration)obj;
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
        boolean _equals = (this.nexusCountry == null && other.getNexusCountry() == null || this.nexusCountry != null && this.nexusCountry.equals(other.getNexusCountry())) && (this.nexus == null && other.getNexus() == null || this.nexus != null && this.nexus.equals(other.getNexus())) && (this.address == null && other.getAddress() == null || this.address != null && this.address.equals(other.getAddress())) && (this.taxRegistrationNumber == null && other.getTaxRegistrationNumber() == null || this.taxRegistrationNumber != null && this.taxRegistrationNumber.equals(other.getTaxRegistrationNumber())) && (this.id == null && other.getId() == null || this.id != null && this.id.equals(other.getId()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getNexusCountry() != null) {
            _hashCode += this.getNexusCountry().hashCode();
        }
        if (this.getNexus() != null) {
            _hashCode += this.getNexus().hashCode();
        }
        if (this.getAddress() != null) {
            _hashCode += this.getAddress().hashCode();
        }
        if (this.getTaxRegistrationNumber() != null) {
            _hashCode += this.getTaxRegistrationNumber().hashCode();
        }
        if (this.getId() != null) {
            _hashCode += this.getId().hashCode();
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
        typeDesc.setXmlType(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "PartnerTaxRegistration"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("nexusCountry");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "nexusCountry"));
        elemField.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "Country"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("nexus");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "nexus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "address"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxRegistrationNumber");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "taxRegistrationNumber"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "id"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

