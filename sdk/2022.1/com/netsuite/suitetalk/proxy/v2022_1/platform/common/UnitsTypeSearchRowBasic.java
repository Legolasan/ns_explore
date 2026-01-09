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

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnBooleanField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnSelectField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnStringField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchRowBasic;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class UnitsTypeSearchRowBasic
extends SearchRowBasic
implements Serializable {
    private SearchColumnStringField[] abbreviation;
    private SearchColumnBooleanField[] baseUnit;
    private SearchColumnStringField[] conversionRate;
    private SearchColumnSelectField[] externalId;
    private SearchColumnSelectField[] internalId;
    private SearchColumnBooleanField[] isInActive;
    private SearchColumnStringField[] name;
    private SearchColumnStringField[] pluralAbbreviation;
    private SearchColumnStringField[] pluralName;
    private SearchColumnStringField[] unitName;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(UnitsTypeSearchRowBasic.class, true);

    public UnitsTypeSearchRowBasic() {
    }

    public UnitsTypeSearchRowBasic(SearchColumnStringField[] abbreviation, SearchColumnBooleanField[] baseUnit, SearchColumnStringField[] conversionRate, SearchColumnSelectField[] externalId, SearchColumnSelectField[] internalId, SearchColumnBooleanField[] isInActive, SearchColumnStringField[] name, SearchColumnStringField[] pluralAbbreviation, SearchColumnStringField[] pluralName, SearchColumnStringField[] unitName) {
        this.abbreviation = abbreviation;
        this.baseUnit = baseUnit;
        this.conversionRate = conversionRate;
        this.externalId = externalId;
        this.internalId = internalId;
        this.isInActive = isInActive;
        this.name = name;
        this.pluralAbbreviation = pluralAbbreviation;
        this.pluralName = pluralName;
        this.unitName = unitName;
    }

    public SearchColumnStringField[] getAbbreviation() {
        return this.abbreviation;
    }

    public void setAbbreviation(SearchColumnStringField[] abbreviation) {
        this.abbreviation = abbreviation;
    }

    public SearchColumnStringField getAbbreviation(int i) {
        return this.abbreviation[i];
    }

    public void setAbbreviation(int i, SearchColumnStringField _value) {
        this.abbreviation[i] = _value;
    }

    public SearchColumnBooleanField[] getBaseUnit() {
        return this.baseUnit;
    }

    public void setBaseUnit(SearchColumnBooleanField[] baseUnit) {
        this.baseUnit = baseUnit;
    }

    public SearchColumnBooleanField getBaseUnit(int i) {
        return this.baseUnit[i];
    }

    public void setBaseUnit(int i, SearchColumnBooleanField _value) {
        this.baseUnit[i] = _value;
    }

    public SearchColumnStringField[] getConversionRate() {
        return this.conversionRate;
    }

    public void setConversionRate(SearchColumnStringField[] conversionRate) {
        this.conversionRate = conversionRate;
    }

    public SearchColumnStringField getConversionRate(int i) {
        return this.conversionRate[i];
    }

    public void setConversionRate(int i, SearchColumnStringField _value) {
        this.conversionRate[i] = _value;
    }

    public SearchColumnSelectField[] getExternalId() {
        return this.externalId;
    }

    public void setExternalId(SearchColumnSelectField[] externalId) {
        this.externalId = externalId;
    }

    public SearchColumnSelectField getExternalId(int i) {
        return this.externalId[i];
    }

    public void setExternalId(int i, SearchColumnSelectField _value) {
        this.externalId[i] = _value;
    }

    public SearchColumnSelectField[] getInternalId() {
        return this.internalId;
    }

    public void setInternalId(SearchColumnSelectField[] internalId) {
        this.internalId = internalId;
    }

    public SearchColumnSelectField getInternalId(int i) {
        return this.internalId[i];
    }

    public void setInternalId(int i, SearchColumnSelectField _value) {
        this.internalId[i] = _value;
    }

    public SearchColumnBooleanField[] getIsInActive() {
        return this.isInActive;
    }

    public void setIsInActive(SearchColumnBooleanField[] isInActive) {
        this.isInActive = isInActive;
    }

    public SearchColumnBooleanField getIsInActive(int i) {
        return this.isInActive[i];
    }

    public void setIsInActive(int i, SearchColumnBooleanField _value) {
        this.isInActive[i] = _value;
    }

    public SearchColumnStringField[] getName() {
        return this.name;
    }

    public void setName(SearchColumnStringField[] name) {
        this.name = name;
    }

    public SearchColumnStringField getName(int i) {
        return this.name[i];
    }

    public void setName(int i, SearchColumnStringField _value) {
        this.name[i] = _value;
    }

    public SearchColumnStringField[] getPluralAbbreviation() {
        return this.pluralAbbreviation;
    }

    public void setPluralAbbreviation(SearchColumnStringField[] pluralAbbreviation) {
        this.pluralAbbreviation = pluralAbbreviation;
    }

    public SearchColumnStringField getPluralAbbreviation(int i) {
        return this.pluralAbbreviation[i];
    }

    public void setPluralAbbreviation(int i, SearchColumnStringField _value) {
        this.pluralAbbreviation[i] = _value;
    }

    public SearchColumnStringField[] getPluralName() {
        return this.pluralName;
    }

    public void setPluralName(SearchColumnStringField[] pluralName) {
        this.pluralName = pluralName;
    }

    public SearchColumnStringField getPluralName(int i) {
        return this.pluralName[i];
    }

    public void setPluralName(int i, SearchColumnStringField _value) {
        this.pluralName[i] = _value;
    }

    public SearchColumnStringField[] getUnitName() {
        return this.unitName;
    }

    public void setUnitName(SearchColumnStringField[] unitName) {
        this.unitName = unitName;
    }

    public SearchColumnStringField getUnitName(int i) {
        return this.unitName[i];
    }

    public void setUnitName(int i, SearchColumnStringField _value) {
        this.unitName[i] = _value;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UnitsTypeSearchRowBasic)) {
            return false;
        }
        UnitsTypeSearchRowBasic other = (UnitsTypeSearchRowBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.abbreviation == null && other.getAbbreviation() == null || this.abbreviation != null && Arrays.equals(this.abbreviation, other.getAbbreviation())) && (this.baseUnit == null && other.getBaseUnit() == null || this.baseUnit != null && Arrays.equals(this.baseUnit, other.getBaseUnit())) && (this.conversionRate == null && other.getConversionRate() == null || this.conversionRate != null && Arrays.equals(this.conversionRate, other.getConversionRate())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && Arrays.equals(this.externalId, other.getExternalId())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && Arrays.equals(this.internalId, other.getInternalId())) && (this.isInActive == null && other.getIsInActive() == null || this.isInActive != null && Arrays.equals(this.isInActive, other.getIsInActive())) && (this.name == null && other.getName() == null || this.name != null && Arrays.equals(this.name, other.getName())) && (this.pluralAbbreviation == null && other.getPluralAbbreviation() == null || this.pluralAbbreviation != null && Arrays.equals(this.pluralAbbreviation, other.getPluralAbbreviation())) && (this.pluralName == null && other.getPluralName() == null || this.pluralName != null && Arrays.equals(this.pluralName, other.getPluralName())) && (this.unitName == null && other.getUnitName() == null || this.unitName != null && Arrays.equals(this.unitName, other.getUnitName()));
        this.__equalsCalc = null;
        return _equals;
    }

    @Override
    public synchronized int hashCode() {
        Object obj;
        int i;
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (this.getAbbreviation() != null) {
            for (i = 0; i < Array.getLength(this.getAbbreviation()); ++i) {
                obj = Array.get(this.getAbbreviation(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBaseUnit() != null) {
            for (i = 0; i < Array.getLength(this.getBaseUnit()); ++i) {
                obj = Array.get(this.getBaseUnit(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getConversionRate() != null) {
            for (i = 0; i < Array.getLength(this.getConversionRate()); ++i) {
                obj = Array.get(this.getConversionRate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getExternalId() != null) {
            for (i = 0; i < Array.getLength(this.getExternalId()); ++i) {
                obj = Array.get(this.getExternalId(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getInternalId() != null) {
            for (i = 0; i < Array.getLength(this.getInternalId()); ++i) {
                obj = Array.get(this.getInternalId(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsInActive() != null) {
            for (i = 0; i < Array.getLength(this.getIsInActive()); ++i) {
                obj = Array.get(this.getIsInActive(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getName() != null) {
            for (i = 0; i < Array.getLength(this.getName()); ++i) {
                obj = Array.get(this.getName(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPluralAbbreviation() != null) {
            for (i = 0; i < Array.getLength(this.getPluralAbbreviation()); ++i) {
                obj = Array.get(this.getPluralAbbreviation(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPluralName() != null) {
            for (i = 0; i < Array.getLength(this.getPluralName()); ++i) {
                obj = Array.get(this.getPluralName(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getUnitName() != null) {
            for (i = 0; i < Array.getLength(this.getUnitName()); ++i) {
                obj = Array.get(this.getUnitName(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "UnitsTypeSearchRowBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("abbreviation");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "abbreviation"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("baseUnit");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "baseUnit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("conversionRate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "conversionRate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "externalId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isInActive");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isInActive"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "name"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("pluralAbbreviation");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "pluralAbbreviation"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("pluralName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "pluralName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("unitName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "unitName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

