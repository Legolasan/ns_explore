/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.axis.description.AttributeDesc
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
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.NullField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.Record;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.AttributeDesc;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class Nexus
extends Record
implements Serializable {
    private Country country;
    private RecordRef state;
    private RecordRef taxAgency;
    private RecordRef taxAgencyPst;
    private RecordRef taxCode;
    private String description;
    private RecordRef parentNexus;
    private Boolean isInactive;
    private Boolean taxDateFromFulfillment;
    private String internalId;
    private String externalId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(Nexus.class, true);

    public Nexus() {
    }

    public Nexus(NullField nullFieldList, String internalId, String externalId, Country country, RecordRef state, RecordRef taxAgency, RecordRef taxAgencyPst, RecordRef taxCode, String description, RecordRef parentNexus, Boolean isInactive, Boolean taxDateFromFulfillment) {
        super(nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.country = country;
        this.state = state;
        this.taxAgency = taxAgency;
        this.taxAgencyPst = taxAgencyPst;
        this.taxCode = taxCode;
        this.description = description;
        this.parentNexus = parentNexus;
        this.isInactive = isInactive;
        this.taxDateFromFulfillment = taxDateFromFulfillment;
    }

    public Country getCountry() {
        return this.country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public RecordRef getState() {
        return this.state;
    }

    public void setState(RecordRef state) {
        this.state = state;
    }

    public RecordRef getTaxAgency() {
        return this.taxAgency;
    }

    public void setTaxAgency(RecordRef taxAgency) {
        this.taxAgency = taxAgency;
    }

    public RecordRef getTaxAgencyPst() {
        return this.taxAgencyPst;
    }

    public void setTaxAgencyPst(RecordRef taxAgencyPst) {
        this.taxAgencyPst = taxAgencyPst;
    }

    public RecordRef getTaxCode() {
        return this.taxCode;
    }

    public void setTaxCode(RecordRef taxCode) {
        this.taxCode = taxCode;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public RecordRef getParentNexus() {
        return this.parentNexus;
    }

    public void setParentNexus(RecordRef parentNexus) {
        this.parentNexus = parentNexus;
    }

    public Boolean getIsInactive() {
        return this.isInactive;
    }

    public void setIsInactive(Boolean isInactive) {
        this.isInactive = isInactive;
    }

    public Boolean getTaxDateFromFulfillment() {
        return this.taxDateFromFulfillment;
    }

    public void setTaxDateFromFulfillment(Boolean taxDateFromFulfillment) {
        this.taxDateFromFulfillment = taxDateFromFulfillment;
    }

    public String getInternalId() {
        return this.internalId;
    }

    public void setInternalId(String internalId) {
        this.internalId = internalId;
    }

    public String getExternalId() {
        return this.externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof Nexus)) {
            return false;
        }
        Nexus other = (Nexus)obj;
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
        boolean _equals = super.equals(obj) && (this.country == null && other.getCountry() == null || this.country != null && this.country.equals(other.getCountry())) && (this.state == null && other.getState() == null || this.state != null && this.state.equals(other.getState())) && (this.taxAgency == null && other.getTaxAgency() == null || this.taxAgency != null && this.taxAgency.equals(other.getTaxAgency())) && (this.taxAgencyPst == null && other.getTaxAgencyPst() == null || this.taxAgencyPst != null && this.taxAgencyPst.equals(other.getTaxAgencyPst())) && (this.taxCode == null && other.getTaxCode() == null || this.taxCode != null && this.taxCode.equals(other.getTaxCode())) && (this.description == null && other.getDescription() == null || this.description != null && this.description.equals(other.getDescription())) && (this.parentNexus == null && other.getParentNexus() == null || this.parentNexus != null && this.parentNexus.equals(other.getParentNexus())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && this.isInactive.equals(other.getIsInactive())) && (this.taxDateFromFulfillment == null && other.getTaxDateFromFulfillment() == null || this.taxDateFromFulfillment != null && this.taxDateFromFulfillment.equals(other.getTaxDateFromFulfillment())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
        this.__equalsCalc = null;
        return _equals;
    }

    @Override
    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (this.getCountry() != null) {
            _hashCode += this.getCountry().hashCode();
        }
        if (this.getState() != null) {
            _hashCode += this.getState().hashCode();
        }
        if (this.getTaxAgency() != null) {
            _hashCode += this.getTaxAgency().hashCode();
        }
        if (this.getTaxAgencyPst() != null) {
            _hashCode += this.getTaxAgencyPst().hashCode();
        }
        if (this.getTaxCode() != null) {
            _hashCode += this.getTaxCode().hashCode();
        }
        if (this.getDescription() != null) {
            _hashCode += this.getDescription().hashCode();
        }
        if (this.getParentNexus() != null) {
            _hashCode += this.getParentNexus().hashCode();
        }
        if (this.getIsInactive() != null) {
            _hashCode += this.getIsInactive().hashCode();
        }
        if (this.getTaxDateFromFulfillment() != null) {
            _hashCode += this.getTaxDateFromFulfillment().hashCode();
        }
        if (this.getInternalId() != null) {
            _hashCode += this.getInternalId().hashCode();
        }
        if (this.getExternalId() != null) {
            _hashCode += this.getExternalId().hashCode();
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
        typeDesc.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "Nexus"));
        AttributeDesc attrField = new AttributeDesc();
        attrField.setFieldName("internalId");
        attrField.setXmlName(new QName("", "internalId"));
        attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc((FieldDesc)attrField);
        attrField = new AttributeDesc();
        attrField.setFieldName("externalId");
        attrField.setXmlName(new QName("", "externalId"));
        attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc((FieldDesc)attrField);
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "country"));
        elemField.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "Country"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "state"));
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
        elemField.setFieldName("taxAgencyPst");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "taxAgencyPst"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxCode");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "taxCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "description"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("parentNexus");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "parentNexus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxDateFromFulfillment");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "taxDateFromFulfillment"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

