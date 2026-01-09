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

public class CustomListSearchBasic
extends SearchRecordBasic
implements Serializable {
    private SearchStringField description;
    private SearchMultiSelectField internalId;
    private SearchLongField internalIdNumber;
    private SearchBooleanField isInactive;
    private SearchBooleanField isOrdered;
    private SearchStringField name;
    private SearchMultiSelectField owner;
    private SearchStringField scriptId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(CustomListSearchBasic.class, true);

    public CustomListSearchBasic() {
    }

    public CustomListSearchBasic(SearchStringField description, SearchMultiSelectField internalId, SearchLongField internalIdNumber, SearchBooleanField isInactive, SearchBooleanField isOrdered, SearchStringField name, SearchMultiSelectField owner, SearchStringField scriptId) {
        this.description = description;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isInactive = isInactive;
        this.isOrdered = isOrdered;
        this.name = name;
        this.owner = owner;
        this.scriptId = scriptId;
    }

    public SearchStringField getDescription() {
        return this.description;
    }

    public void setDescription(SearchStringField description) {
        this.description = description;
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

    public SearchBooleanField getIsInactive() {
        return this.isInactive;
    }

    public void setIsInactive(SearchBooleanField isInactive) {
        this.isInactive = isInactive;
    }

    public SearchBooleanField getIsOrdered() {
        return this.isOrdered;
    }

    public void setIsOrdered(SearchBooleanField isOrdered) {
        this.isOrdered = isOrdered;
    }

    public SearchStringField getName() {
        return this.name;
    }

    public void setName(SearchStringField name) {
        this.name = name;
    }

    public SearchMultiSelectField getOwner() {
        return this.owner;
    }

    public void setOwner(SearchMultiSelectField owner) {
        this.owner = owner;
    }

    public SearchStringField getScriptId() {
        return this.scriptId;
    }

    public void setScriptId(SearchStringField scriptId) {
        this.scriptId = scriptId;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CustomListSearchBasic)) {
            return false;
        }
        CustomListSearchBasic other = (CustomListSearchBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.description == null && other.getDescription() == null || this.description != null && this.description.equals(other.getDescription())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.internalIdNumber == null && other.getInternalIdNumber() == null || this.internalIdNumber != null && this.internalIdNumber.equals(other.getInternalIdNumber())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && this.isInactive.equals(other.getIsInactive())) && (this.isOrdered == null && other.getIsOrdered() == null || this.isOrdered != null && this.isOrdered.equals(other.getIsOrdered())) && (this.name == null && other.getName() == null || this.name != null && this.name.equals(other.getName())) && (this.owner == null && other.getOwner() == null || this.owner != null && this.owner.equals(other.getOwner())) && (this.scriptId == null && other.getScriptId() == null || this.scriptId != null && this.scriptId.equals(other.getScriptId()));
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
        if (this.getDescription() != null) {
            _hashCode += this.getDescription().hashCode();
        }
        if (this.getInternalId() != null) {
            _hashCode += this.getInternalId().hashCode();
        }
        if (this.getInternalIdNumber() != null) {
            _hashCode += this.getInternalIdNumber().hashCode();
        }
        if (this.getIsInactive() != null) {
            _hashCode += this.getIsInactive().hashCode();
        }
        if (this.getIsOrdered() != null) {
            _hashCode += this.getIsOrdered().hashCode();
        }
        if (this.getName() != null) {
            _hashCode += this.getName().hashCode();
        }
        if (this.getOwner() != null) {
            _hashCode += this.getOwner().hashCode();
        }
        if (this.getScriptId() != null) {
            _hashCode += this.getScriptId().hashCode();
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "CustomListSearchBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "description"));
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
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isOrdered");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isOrdered"));
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
        elemField.setFieldName("owner");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "owner"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("scriptId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "scriptId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

