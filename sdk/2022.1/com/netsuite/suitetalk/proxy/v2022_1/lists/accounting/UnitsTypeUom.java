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

import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class UnitsTypeUom
implements Serializable {
    private String internalId;
    private String unitName;
    private String pluralName;
    private String abbreviation;
    private String pluralAbbreviation;
    private Double conversionRate;
    private Boolean baseUnit;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(UnitsTypeUom.class, true);

    public UnitsTypeUom() {
    }

    public UnitsTypeUom(String internalId, String unitName, String pluralName, String abbreviation, String pluralAbbreviation, Double conversionRate, Boolean baseUnit) {
        this.internalId = internalId;
        this.unitName = unitName;
        this.pluralName = pluralName;
        this.abbreviation = abbreviation;
        this.pluralAbbreviation = pluralAbbreviation;
        this.conversionRate = conversionRate;
        this.baseUnit = baseUnit;
    }

    public String getInternalId() {
        return this.internalId;
    }

    public void setInternalId(String internalId) {
        this.internalId = internalId;
    }

    public String getUnitName() {
        return this.unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getPluralName() {
        return this.pluralName;
    }

    public void setPluralName(String pluralName) {
        this.pluralName = pluralName;
    }

    public String getAbbreviation() {
        return this.abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public String getPluralAbbreviation() {
        return this.pluralAbbreviation;
    }

    public void setPluralAbbreviation(String pluralAbbreviation) {
        this.pluralAbbreviation = pluralAbbreviation;
    }

    public Double getConversionRate() {
        return this.conversionRate;
    }

    public void setConversionRate(Double conversionRate) {
        this.conversionRate = conversionRate;
    }

    public Boolean getBaseUnit() {
        return this.baseUnit;
    }

    public void setBaseUnit(Boolean baseUnit) {
        this.baseUnit = baseUnit;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UnitsTypeUom)) {
            return false;
        }
        UnitsTypeUom other = (UnitsTypeUom)obj;
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
        boolean _equals = (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.unitName == null && other.getUnitName() == null || this.unitName != null && this.unitName.equals(other.getUnitName())) && (this.pluralName == null && other.getPluralName() == null || this.pluralName != null && this.pluralName.equals(other.getPluralName())) && (this.abbreviation == null && other.getAbbreviation() == null || this.abbreviation != null && this.abbreviation.equals(other.getAbbreviation())) && (this.pluralAbbreviation == null && other.getPluralAbbreviation() == null || this.pluralAbbreviation != null && this.pluralAbbreviation.equals(other.getPluralAbbreviation())) && (this.conversionRate == null && other.getConversionRate() == null || this.conversionRate != null && this.conversionRate.equals(other.getConversionRate())) && (this.baseUnit == null && other.getBaseUnit() == null || this.baseUnit != null && this.baseUnit.equals(other.getBaseUnit()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getInternalId() != null) {
            _hashCode += this.getInternalId().hashCode();
        }
        if (this.getUnitName() != null) {
            _hashCode += this.getUnitName().hashCode();
        }
        if (this.getPluralName() != null) {
            _hashCode += this.getPluralName().hashCode();
        }
        if (this.getAbbreviation() != null) {
            _hashCode += this.getAbbreviation().hashCode();
        }
        if (this.getPluralAbbreviation() != null) {
            _hashCode += this.getPluralAbbreviation().hashCode();
        }
        if (this.getConversionRate() != null) {
            _hashCode += this.getConversionRate().hashCode();
        }
        if (this.getBaseUnit() != null) {
            _hashCode += this.getBaseUnit().hashCode();
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
        typeDesc.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "UnitsTypeUom"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("unitName");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "unitName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("pluralName");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "pluralName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("abbreviation");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "abbreviation"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("pluralAbbreviation");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "pluralAbbreviation"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("conversionRate");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "conversionRate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("baseUnit");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "baseUnit"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

