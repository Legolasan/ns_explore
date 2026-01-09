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
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRefList;
import com.netsuite.suitetalk.proxy.v2022_1.setup.customization.types.CustomizationFieldType;
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

public class CustomSegment
extends Record
implements Serializable {
    private String label;
    private String scriptId;
    private String recordScriptId;
    private RecordRef recordType;
    private CustomizationFieldType fieldType;
    private Boolean isInactive;
    private Boolean showInList;
    private RecordRefList filteredByList;
    private Boolean hasGLImpact;
    private String help;
    private String description;
    private Boolean isMandatory;
    private RecordRef defaultSelection;
    private String internalId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(CustomSegment.class, true);

    public CustomSegment() {
    }

    public CustomSegment(NullField nullFieldList, String internalId, String label, String scriptId, String recordScriptId, RecordRef recordType, CustomizationFieldType fieldType, Boolean isInactive, Boolean showInList, RecordRefList filteredByList, Boolean hasGLImpact, String help, String description, Boolean isMandatory, RecordRef defaultSelection) {
        super(nullFieldList);
        this.internalId = internalId;
        this.label = label;
        this.scriptId = scriptId;
        this.recordScriptId = recordScriptId;
        this.recordType = recordType;
        this.fieldType = fieldType;
        this.isInactive = isInactive;
        this.showInList = showInList;
        this.filteredByList = filteredByList;
        this.hasGLImpact = hasGLImpact;
        this.help = help;
        this.description = description;
        this.isMandatory = isMandatory;
        this.defaultSelection = defaultSelection;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getScriptId() {
        return this.scriptId;
    }

    public void setScriptId(String scriptId) {
        this.scriptId = scriptId;
    }

    public String getRecordScriptId() {
        return this.recordScriptId;
    }

    public void setRecordScriptId(String recordScriptId) {
        this.recordScriptId = recordScriptId;
    }

    public RecordRef getRecordType() {
        return this.recordType;
    }

    public void setRecordType(RecordRef recordType) {
        this.recordType = recordType;
    }

    public CustomizationFieldType getFieldType() {
        return this.fieldType;
    }

    public void setFieldType(CustomizationFieldType fieldType) {
        this.fieldType = fieldType;
    }

    public Boolean getIsInactive() {
        return this.isInactive;
    }

    public void setIsInactive(Boolean isInactive) {
        this.isInactive = isInactive;
    }

    public Boolean getShowInList() {
        return this.showInList;
    }

    public void setShowInList(Boolean showInList) {
        this.showInList = showInList;
    }

    public RecordRefList getFilteredByList() {
        return this.filteredByList;
    }

    public void setFilteredByList(RecordRefList filteredByList) {
        this.filteredByList = filteredByList;
    }

    public Boolean getHasGLImpact() {
        return this.hasGLImpact;
    }

    public void setHasGLImpact(Boolean hasGLImpact) {
        this.hasGLImpact = hasGLImpact;
    }

    public String getHelp() {
        return this.help;
    }

    public void setHelp(String help) {
        this.help = help;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getIsMandatory() {
        return this.isMandatory;
    }

    public void setIsMandatory(Boolean isMandatory) {
        this.isMandatory = isMandatory;
    }

    public RecordRef getDefaultSelection() {
        return this.defaultSelection;
    }

    public void setDefaultSelection(RecordRef defaultSelection) {
        this.defaultSelection = defaultSelection;
    }

    public String getInternalId() {
        return this.internalId;
    }

    public void setInternalId(String internalId) {
        this.internalId = internalId;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CustomSegment)) {
            return false;
        }
        CustomSegment other = (CustomSegment)obj;
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
        boolean _equals = super.equals(obj) && (this.label == null && other.getLabel() == null || this.label != null && this.label.equals(other.getLabel())) && (this.scriptId == null && other.getScriptId() == null || this.scriptId != null && this.scriptId.equals(other.getScriptId())) && (this.recordScriptId == null && other.getRecordScriptId() == null || this.recordScriptId != null && this.recordScriptId.equals(other.getRecordScriptId())) && (this.recordType == null && other.getRecordType() == null || this.recordType != null && this.recordType.equals(other.getRecordType())) && (this.fieldType == null && other.getFieldType() == null || this.fieldType != null && this.fieldType.equals(other.getFieldType())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && this.isInactive.equals(other.getIsInactive())) && (this.showInList == null && other.getShowInList() == null || this.showInList != null && this.showInList.equals(other.getShowInList())) && (this.filteredByList == null && other.getFilteredByList() == null || this.filteredByList != null && this.filteredByList.equals(other.getFilteredByList())) && (this.hasGLImpact == null && other.getHasGLImpact() == null || this.hasGLImpact != null && this.hasGLImpact.equals(other.getHasGLImpact())) && (this.help == null && other.getHelp() == null || this.help != null && this.help.equals(other.getHelp())) && (this.description == null && other.getDescription() == null || this.description != null && this.description.equals(other.getDescription())) && (this.isMandatory == null && other.getIsMandatory() == null || this.isMandatory != null && this.isMandatory.equals(other.getIsMandatory())) && (this.defaultSelection == null && other.getDefaultSelection() == null || this.defaultSelection != null && this.defaultSelection.equals(other.getDefaultSelection())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId()));
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
        if (this.getLabel() != null) {
            _hashCode += this.getLabel().hashCode();
        }
        if (this.getScriptId() != null) {
            _hashCode += this.getScriptId().hashCode();
        }
        if (this.getRecordScriptId() != null) {
            _hashCode += this.getRecordScriptId().hashCode();
        }
        if (this.getRecordType() != null) {
            _hashCode += this.getRecordType().hashCode();
        }
        if (this.getFieldType() != null) {
            _hashCode += this.getFieldType().hashCode();
        }
        if (this.getIsInactive() != null) {
            _hashCode += this.getIsInactive().hashCode();
        }
        if (this.getShowInList() != null) {
            _hashCode += this.getShowInList().hashCode();
        }
        if (this.getFilteredByList() != null) {
            _hashCode += this.getFilteredByList().hashCode();
        }
        if (this.getHasGLImpact() != null) {
            _hashCode += this.getHasGLImpact().hashCode();
        }
        if (this.getHelp() != null) {
            _hashCode += this.getHelp().hashCode();
        }
        if (this.getDescription() != null) {
            _hashCode += this.getDescription().hashCode();
        }
        if (this.getIsMandatory() != null) {
            _hashCode += this.getIsMandatory().hashCode();
        }
        if (this.getDefaultSelection() != null) {
            _hashCode += this.getDefaultSelection().hashCode();
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
        typeDesc.setXmlType(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "CustomSegment"));
        AttributeDesc attrField = new AttributeDesc();
        attrField.setFieldName("internalId");
        attrField.setXmlName(new QName("", "internalId"));
        attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc((FieldDesc)attrField);
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "label"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("recordScriptId");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "recordScriptId"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recordType");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "recordType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fieldType");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "fieldType"));
        elemField.setXmlType(new QName("urn:types.customization_2022_1.setup.webservices.netsuite.com", "CustomizationFieldType"));
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
        elemField.setFieldName("showInList");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "showInList"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("filteredByList");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "filteredByList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRefList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("hasGLImpact");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "hasGLImpact"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("help");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "help"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("isMandatory");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "isMandatory"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("defaultSelection");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "defaultSelection"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

