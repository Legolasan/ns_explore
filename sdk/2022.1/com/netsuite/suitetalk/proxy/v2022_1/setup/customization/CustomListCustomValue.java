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
package com.netsuite.suitetalk.proxy.v2022_1.setup.customization;

import com.netsuite.suitetalk.proxy.v2022_1.setup.customization.LanguageValueList;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class CustomListCustomValue
implements Serializable {
    private String value;
    private String abbreviation;
    private Boolean isInactive;
    private Long valueId;
    private LanguageValueList valueLanguageValueList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(CustomListCustomValue.class, true);

    public CustomListCustomValue() {
    }

    public CustomListCustomValue(String value, String abbreviation, Boolean isInactive, Long valueId, LanguageValueList valueLanguageValueList) {
        this.value = value;
        this.abbreviation = abbreviation;
        this.isInactive = isInactive;
        this.valueId = valueId;
        this.valueLanguageValueList = valueLanguageValueList;
    }

    public String getValue() {
        return this.value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getAbbreviation() {
        return this.abbreviation;
    }

    public void setAbbreviation(String abbreviation) {
        this.abbreviation = abbreviation;
    }

    public Boolean getIsInactive() {
        return this.isInactive;
    }

    public void setIsInactive(Boolean isInactive) {
        this.isInactive = isInactive;
    }

    public Long getValueId() {
        return this.valueId;
    }

    public void setValueId(Long valueId) {
        this.valueId = valueId;
    }

    public LanguageValueList getValueLanguageValueList() {
        return this.valueLanguageValueList;
    }

    public void setValueLanguageValueList(LanguageValueList valueLanguageValueList) {
        this.valueLanguageValueList = valueLanguageValueList;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CustomListCustomValue)) {
            return false;
        }
        CustomListCustomValue other = (CustomListCustomValue)obj;
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
        boolean _equals = (this.value == null && other.getValue() == null || this.value != null && this.value.equals(other.getValue())) && (this.abbreviation == null && other.getAbbreviation() == null || this.abbreviation != null && this.abbreviation.equals(other.getAbbreviation())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && this.isInactive.equals(other.getIsInactive())) && (this.valueId == null && other.getValueId() == null || this.valueId != null && this.valueId.equals(other.getValueId())) && (this.valueLanguageValueList == null && other.getValueLanguageValueList() == null || this.valueLanguageValueList != null && this.valueLanguageValueList.equals(other.getValueLanguageValueList()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getValue() != null) {
            _hashCode += this.getValue().hashCode();
        }
        if (this.getAbbreviation() != null) {
            _hashCode += this.getAbbreviation().hashCode();
        }
        if (this.getIsInactive() != null) {
            _hashCode += this.getIsInactive().hashCode();
        }
        if (this.getValueId() != null) {
            _hashCode += this.getValueId().hashCode();
        }
        if (this.getValueLanguageValueList() != null) {
            _hashCode += this.getValueLanguageValueList().hashCode();
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
        typeDesc.setXmlType(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "CustomListCustomValue"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("value");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "value"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("abbreviation");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "abbreviation"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("valueId");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "valueId"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("valueLanguageValueList");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "valueLanguageValueList"));
        elemField.setXmlType(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "LanguageValueList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

