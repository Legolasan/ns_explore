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
package com.netsuite.suitetalk.proxy.v2022_1.lists.accounting;

import com.netsuite.suitetalk.proxy.v2022_1.platform.common.types.Country;
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

public class SubsidiaryTaxRegistration
implements Serializable {
    private Long id;
    private Country nexusCountry;
    private RecordRef nexus;
    private RecordRef taxAgency;
    private String taxRegistrationNumber;
    private RecordRef taxEngine;
    private Calendar effectiveFrom;
    private Calendar validUntil;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(SubsidiaryTaxRegistration.class, true);

    public SubsidiaryTaxRegistration() {
    }

    public SubsidiaryTaxRegistration(Long id, Country nexusCountry, RecordRef nexus, RecordRef taxAgency, String taxRegistrationNumber, RecordRef taxEngine, Calendar effectiveFrom, Calendar validUntil) {
        this.id = id;
        this.nexusCountry = nexusCountry;
        this.nexus = nexus;
        this.taxAgency = taxAgency;
        this.taxRegistrationNumber = taxRegistrationNumber;
        this.taxEngine = taxEngine;
        this.effectiveFrom = effectiveFrom;
        this.validUntil = validUntil;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
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

    public RecordRef getTaxAgency() {
        return this.taxAgency;
    }

    public void setTaxAgency(RecordRef taxAgency) {
        this.taxAgency = taxAgency;
    }

    public String getTaxRegistrationNumber() {
        return this.taxRegistrationNumber;
    }

    public void setTaxRegistrationNumber(String taxRegistrationNumber) {
        this.taxRegistrationNumber = taxRegistrationNumber;
    }

    public RecordRef getTaxEngine() {
        return this.taxEngine;
    }

    public void setTaxEngine(RecordRef taxEngine) {
        this.taxEngine = taxEngine;
    }

    public Calendar getEffectiveFrom() {
        return this.effectiveFrom;
    }

    public void setEffectiveFrom(Calendar effectiveFrom) {
        this.effectiveFrom = effectiveFrom;
    }

    public Calendar getValidUntil() {
        return this.validUntil;
    }

    public void setValidUntil(Calendar validUntil) {
        this.validUntil = validUntil;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SubsidiaryTaxRegistration)) {
            return false;
        }
        SubsidiaryTaxRegistration other = (SubsidiaryTaxRegistration)obj;
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
        boolean _equals = (this.id == null && other.getId() == null || this.id != null && this.id.equals(other.getId())) && (this.nexusCountry == null && other.getNexusCountry() == null || this.nexusCountry != null && this.nexusCountry.equals(other.getNexusCountry())) && (this.nexus == null && other.getNexus() == null || this.nexus != null && this.nexus.equals(other.getNexus())) && (this.taxAgency == null && other.getTaxAgency() == null || this.taxAgency != null && this.taxAgency.equals(other.getTaxAgency())) && (this.taxRegistrationNumber == null && other.getTaxRegistrationNumber() == null || this.taxRegistrationNumber != null && this.taxRegistrationNumber.equals(other.getTaxRegistrationNumber())) && (this.taxEngine == null && other.getTaxEngine() == null || this.taxEngine != null && this.taxEngine.equals(other.getTaxEngine())) && (this.effectiveFrom == null && other.getEffectiveFrom() == null || this.effectiveFrom != null && this.effectiveFrom.equals(other.getEffectiveFrom())) && (this.validUntil == null && other.getValidUntil() == null || this.validUntil != null && this.validUntil.equals(other.getValidUntil()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getId() != null) {
            _hashCode += this.getId().hashCode();
        }
        if (this.getNexusCountry() != null) {
            _hashCode += this.getNexusCountry().hashCode();
        }
        if (this.getNexus() != null) {
            _hashCode += this.getNexus().hashCode();
        }
        if (this.getTaxAgency() != null) {
            _hashCode += this.getTaxAgency().hashCode();
        }
        if (this.getTaxRegistrationNumber() != null) {
            _hashCode += this.getTaxRegistrationNumber().hashCode();
        }
        if (this.getTaxEngine() != null) {
            _hashCode += this.getTaxEngine().hashCode();
        }
        if (this.getEffectiveFrom() != null) {
            _hashCode += this.getEffectiveFrom().hashCode();
        }
        if (this.getValidUntil() != null) {
            _hashCode += this.getValidUntil().hashCode();
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
        typeDesc.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "SubsidiaryTaxRegistration"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "id"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("nexusCountry");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "nexusCountry"));
        elemField.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "Country"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("nexus");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "nexus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxAgency");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "taxAgency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxRegistrationNumber");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "taxRegistrationNumber"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxEngine");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "taxEngine"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("effectiveFrom");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "effectiveFrom"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("validUntil");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "validUntil"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

