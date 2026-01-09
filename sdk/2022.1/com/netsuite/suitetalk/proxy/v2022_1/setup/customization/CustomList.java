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
package com.netsuite.suitetalk.proxy.v2022_1.setup.customization;

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.NullField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.Record;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import com.netsuite.suitetalk.proxy.v2022_1.setup.customization.CustomListCustomValueList;
import com.netsuite.suitetalk.proxy.v2022_1.setup.customization.CustomListTranslationsList;
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

public class CustomList
extends Record
implements Serializable {
    private String name;
    private RecordRef owner;
    private Boolean isOrdered;
    private String description;
    private Boolean isMatrixOption;
    private String scriptId;
    private Boolean convertToCustomRecord;
    private Boolean isInactive;
    private CustomListCustomValueList customValueList;
    private CustomListTranslationsList translationsList;
    private String internalId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(CustomList.class, true);

    public CustomList() {
    }

    public CustomList(NullField nullFieldList, String internalId, String name, RecordRef owner, Boolean isOrdered, String description, Boolean isMatrixOption, String scriptId, Boolean convertToCustomRecord, Boolean isInactive, CustomListCustomValueList customValueList, CustomListTranslationsList translationsList) {
        super(nullFieldList);
        this.internalId = internalId;
        this.name = name;
        this.owner = owner;
        this.isOrdered = isOrdered;
        this.description = description;
        this.isMatrixOption = isMatrixOption;
        this.scriptId = scriptId;
        this.convertToCustomRecord = convertToCustomRecord;
        this.isInactive = isInactive;
        this.customValueList = customValueList;
        this.translationsList = translationsList;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RecordRef getOwner() {
        return this.owner;
    }

    public void setOwner(RecordRef owner) {
        this.owner = owner;
    }

    public Boolean getIsOrdered() {
        return this.isOrdered;
    }

    public void setIsOrdered(Boolean isOrdered) {
        this.isOrdered = isOrdered;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getIsMatrixOption() {
        return this.isMatrixOption;
    }

    public void setIsMatrixOption(Boolean isMatrixOption) {
        this.isMatrixOption = isMatrixOption;
    }

    public String getScriptId() {
        return this.scriptId;
    }

    public void setScriptId(String scriptId) {
        this.scriptId = scriptId;
    }

    public Boolean getConvertToCustomRecord() {
        return this.convertToCustomRecord;
    }

    public void setConvertToCustomRecord(Boolean convertToCustomRecord) {
        this.convertToCustomRecord = convertToCustomRecord;
    }

    public Boolean getIsInactive() {
        return this.isInactive;
    }

    public void setIsInactive(Boolean isInactive) {
        this.isInactive = isInactive;
    }

    public CustomListCustomValueList getCustomValueList() {
        return this.customValueList;
    }

    public void setCustomValueList(CustomListCustomValueList customValueList) {
        this.customValueList = customValueList;
    }

    public CustomListTranslationsList getTranslationsList() {
        return this.translationsList;
    }

    public void setTranslationsList(CustomListTranslationsList translationsList) {
        this.translationsList = translationsList;
    }

    public String getInternalId() {
        return this.internalId;
    }

    public void setInternalId(String internalId) {
        this.internalId = internalId;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CustomList)) {
            return false;
        }
        CustomList other = (CustomList)obj;
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
        boolean _equals = super.equals(obj) && (this.name == null && other.getName() == null || this.name != null && this.name.equals(other.getName())) && (this.owner == null && other.getOwner() == null || this.owner != null && this.owner.equals(other.getOwner())) && (this.isOrdered == null && other.getIsOrdered() == null || this.isOrdered != null && this.isOrdered.equals(other.getIsOrdered())) && (this.description == null && other.getDescription() == null || this.description != null && this.description.equals(other.getDescription())) && (this.isMatrixOption == null && other.getIsMatrixOption() == null || this.isMatrixOption != null && this.isMatrixOption.equals(other.getIsMatrixOption())) && (this.scriptId == null && other.getScriptId() == null || this.scriptId != null && this.scriptId.equals(other.getScriptId())) && (this.convertToCustomRecord == null && other.getConvertToCustomRecord() == null || this.convertToCustomRecord != null && this.convertToCustomRecord.equals(other.getConvertToCustomRecord())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && this.isInactive.equals(other.getIsInactive())) && (this.customValueList == null && other.getCustomValueList() == null || this.customValueList != null && this.customValueList.equals(other.getCustomValueList())) && (this.translationsList == null && other.getTranslationsList() == null || this.translationsList != null && this.translationsList.equals(other.getTranslationsList())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId()));
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
        if (this.getName() != null) {
            _hashCode += this.getName().hashCode();
        }
        if (this.getOwner() != null) {
            _hashCode += this.getOwner().hashCode();
        }
        if (this.getIsOrdered() != null) {
            _hashCode += this.getIsOrdered().hashCode();
        }
        if (this.getDescription() != null) {
            _hashCode += this.getDescription().hashCode();
        }
        if (this.getIsMatrixOption() != null) {
            _hashCode += this.getIsMatrixOption().hashCode();
        }
        if (this.getScriptId() != null) {
            _hashCode += this.getScriptId().hashCode();
        }
        if (this.getConvertToCustomRecord() != null) {
            _hashCode += this.getConvertToCustomRecord().hashCode();
        }
        if (this.getIsInactive() != null) {
            _hashCode += this.getIsInactive().hashCode();
        }
        if (this.getCustomValueList() != null) {
            _hashCode += this.getCustomValueList().hashCode();
        }
        if (this.getTranslationsList() != null) {
            _hashCode += this.getTranslationsList().hashCode();
        }
        if (this.getInternalId() != null) {
            _hashCode += this.getInternalId().hashCode();
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
        typeDesc.setXmlType(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "CustomList"));
        AttributeDesc attrField = new AttributeDesc();
        attrField.setFieldName("internalId");
        attrField.setXmlName(new QName("", "internalId"));
        attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc((FieldDesc)attrField);
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "name"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "owner"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isOrdered");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "isOrdered"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "description"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isMatrixOption");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "isMatrixOption"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("scriptId");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "scriptId"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("convertToCustomRecord");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "convertToCustomRecord"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("customValueList");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "customValueList"));
        elemField.setXmlType(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "CustomListCustomValueList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("translationsList");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "translationsList"));
        elemField.setXmlType(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "CustomListTranslationsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

