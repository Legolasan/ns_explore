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
package com.netsuite.suitetalk.proxy.v2022_1.platform.common;

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchBooleanField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchLongField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchMultiSelectField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchRecordBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchStringField;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class UnitsTypeSearchBasic
extends SearchRecordBasic
implements Serializable {
    private SearchStringField abbreviation;
    private SearchBooleanField baseUnit;
    private SearchStringField conversionRate;
    private SearchMultiSelectField externalId;
    private SearchStringField externalIdString;
    private SearchMultiSelectField internalId;
    private SearchLongField internalIdNumber;
    private SearchBooleanField isInActive;
    private SearchStringField name;
    private SearchStringField pluralAbbreviation;
    private SearchStringField pluralName;
    private SearchStringField unitName;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(UnitsTypeSearchBasic.class, true);

    public UnitsTypeSearchBasic() {
    }

    public UnitsTypeSearchBasic(SearchStringField abbreviation, SearchBooleanField baseUnit, SearchStringField conversionRate, SearchMultiSelectField externalId, SearchStringField externalIdString, SearchMultiSelectField internalId, SearchLongField internalIdNumber, SearchBooleanField isInActive, SearchStringField name, SearchStringField pluralAbbreviation, SearchStringField pluralName, SearchStringField unitName) {
        this.abbreviation = abbreviation;
        this.baseUnit = baseUnit;
        this.conversionRate = conversionRate;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isInActive = isInActive;
        this.name = name;
        this.pluralAbbreviation = pluralAbbreviation;
        this.pluralName = pluralName;
        this.unitName = unitName;
    }

    public SearchStringField getAbbreviation() {
        return this.abbreviation;
    }

    public void setAbbreviation(SearchStringField abbreviation) {
        this.abbreviation = abbreviation;
    }

    public SearchBooleanField getBaseUnit() {
        return this.baseUnit;
    }

    public void setBaseUnit(SearchBooleanField baseUnit) {
        this.baseUnit = baseUnit;
    }

    public SearchStringField getConversionRate() {
        return this.conversionRate;
    }

    public void setConversionRate(SearchStringField conversionRate) {
        this.conversionRate = conversionRate;
    }

    public SearchMultiSelectField getExternalId() {
        return this.externalId;
    }

    public void setExternalId(SearchMultiSelectField externalId) {
        this.externalId = externalId;
    }

    public SearchStringField getExternalIdString() {
        return this.externalIdString;
    }

    public void setExternalIdString(SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }

    public SearchMultiSelectField getInternalId() {
        return this.internalId;
    }

    public void setInternalId(SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }

    public SearchLongField getInternalIdNumber() {
        return this.internalIdNumber;
    }

    public void setInternalIdNumber(SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }

    public SearchBooleanField getIsInActive() {
        return this.isInActive;
    }

    public void setIsInActive(SearchBooleanField isInActive) {
        this.isInActive = isInActive;
    }

    public SearchStringField getName() {
        return this.name;
    }

    public void setName(SearchStringField name) {
        this.name = name;
    }

    public SearchStringField getPluralAbbreviation() {
        return this.pluralAbbreviation;
    }

    public void setPluralAbbreviation(SearchStringField pluralAbbreviation) {
        this.pluralAbbreviation = pluralAbbreviation;
    }

    public SearchStringField getPluralName() {
        return this.pluralName;
    }

    public void setPluralName(SearchStringField pluralName) {
        this.pluralName = pluralName;
    }

    public SearchStringField getUnitName() {
        return this.unitName;
    }

    public void setUnitName(SearchStringField unitName) {
        this.unitName = unitName;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UnitsTypeSearchBasic)) {
            return false;
        }
        UnitsTypeSearchBasic other = (UnitsTypeSearchBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.abbreviation == null && other.getAbbreviation() == null || this.abbreviation != null && this.abbreviation.equals(other.getAbbreviation())) && (this.baseUnit == null && other.getBaseUnit() == null || this.baseUnit != null && this.baseUnit.equals(other.getBaseUnit())) && (this.conversionRate == null && other.getConversionRate() == null || this.conversionRate != null && this.conversionRate.equals(other.getConversionRate())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId())) && (this.externalIdString == null && other.getExternalIdString() == null || this.externalIdString != null && this.externalIdString.equals(other.getExternalIdString())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.internalIdNumber == null && other.getInternalIdNumber() == null || this.internalIdNumber != null && this.internalIdNumber.equals(other.getInternalIdNumber())) && (this.isInActive == null && other.getIsInActive() == null || this.isInActive != null && this.isInActive.equals(other.getIsInActive())) && (this.name == null && other.getName() == null || this.name != null && this.name.equals(other.getName())) && (this.pluralAbbreviation == null && other.getPluralAbbreviation() == null || this.pluralAbbreviation != null && this.pluralAbbreviation.equals(other.getPluralAbbreviation())) && (this.pluralName == null && other.getPluralName() == null || this.pluralName != null && this.pluralName.equals(other.getPluralName())) && (this.unitName == null && other.getUnitName() == null || this.unitName != null && this.unitName.equals(other.getUnitName()));
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
        if (this.getAbbreviation() != null) {
            _hashCode += this.getAbbreviation().hashCode();
        }
        if (this.getBaseUnit() != null) {
            _hashCode += this.getBaseUnit().hashCode();
        }
        if (this.getConversionRate() != null) {
            _hashCode += this.getConversionRate().hashCode();
        }
        if (this.getExternalId() != null) {
            _hashCode += this.getExternalId().hashCode();
        }
        if (this.getExternalIdString() != null) {
            _hashCode += this.getExternalIdString().hashCode();
        }
        if (this.getInternalId() != null) {
            _hashCode += this.getInternalId().hashCode();
        }
        if (this.getInternalIdNumber() != null) {
            _hashCode += this.getInternalIdNumber().hashCode();
        }
        if (this.getIsInActive() != null) {
            _hashCode += this.getIsInActive().hashCode();
        }
        if (this.getName() != null) {
            _hashCode += this.getName().hashCode();
        }
        if (this.getPluralAbbreviation() != null) {
            _hashCode += this.getPluralAbbreviation().hashCode();
        }
        if (this.getPluralName() != null) {
            _hashCode += this.getPluralName().hashCode();
        }
        if (this.getUnitName() != null) {
            _hashCode += this.getUnitName().hashCode();
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "UnitsTypeSearchBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("abbreviation");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "abbreviation"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("baseUnit");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "baseUnit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("conversionRate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "conversionRate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "externalId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("externalIdString");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "externalIdString"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("internalIdNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "internalIdNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isInActive");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isInActive"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "name"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("pluralAbbreviation");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "pluralAbbreviation"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("pluralName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "pluralName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("unitName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "unitName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

