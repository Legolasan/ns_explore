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
package com.netsuite.suitetalk.proxy.v2022_1.documents.filecabinet;

import com.netsuite.suitetalk.proxy.v2022_1.documents.filecabinet.types.FolderFolderType;
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

public class Folder
extends Record
implements Serializable {
    private String name;
    private RecordRef department;
    private String description;
    private Boolean isInactive;
    private Boolean isPrivate;
    private Boolean bundleable;
    private Boolean hideInBundle;
    private Boolean isOnline;
    private RecordRef group;
    private RecordRef parent;
    private FolderFolderType folderType;
    private RecordRef _class;
    private RecordRef location;
    private RecordRef subsidiary;
    private String internalId;
    private String externalId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(Folder.class, true);

    public Folder() {
    }

    public Folder(NullField nullFieldList, String internalId, String externalId, String name, RecordRef department, String description, Boolean isInactive, Boolean isPrivate, Boolean bundleable, Boolean hideInBundle, Boolean isOnline, RecordRef group, RecordRef parent, FolderFolderType folderType, RecordRef _class, RecordRef location, RecordRef subsidiary) {
        super(nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.name = name;
        this.department = department;
        this.description = description;
        this.isInactive = isInactive;
        this.isPrivate = isPrivate;
        this.bundleable = bundleable;
        this.hideInBundle = hideInBundle;
        this.isOnline = isOnline;
        this.group = group;
        this.parent = parent;
        this.folderType = folderType;
        this._class = _class;
        this.location = location;
        this.subsidiary = subsidiary;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RecordRef getDepartment() {
        return this.department;
    }

    public void setDepartment(RecordRef department) {
        this.department = department;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getIsInactive() {
        return this.isInactive;
    }

    public void setIsInactive(Boolean isInactive) {
        this.isInactive = isInactive;
    }

    public Boolean getIsPrivate() {
        return this.isPrivate;
    }

    public void setIsPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    public Boolean getBundleable() {
        return this.bundleable;
    }

    public void setBundleable(Boolean bundleable) {
        this.bundleable = bundleable;
    }

    public Boolean getHideInBundle() {
        return this.hideInBundle;
    }

    public void setHideInBundle(Boolean hideInBundle) {
        this.hideInBundle = hideInBundle;
    }

    public Boolean getIsOnline() {
        return this.isOnline;
    }

    public void setIsOnline(Boolean isOnline) {
        this.isOnline = isOnline;
    }

    public RecordRef getGroup() {
        return this.group;
    }

    public void setGroup(RecordRef group) {
        this.group = group;
    }

    public RecordRef getParent() {
        return this.parent;
    }

    public void setParent(RecordRef parent) {
        this.parent = parent;
    }

    public FolderFolderType getFolderType() {
        return this.folderType;
    }

    public void setFolderType(FolderFolderType folderType) {
        this.folderType = folderType;
    }

    public RecordRef get_class() {
        return this._class;
    }

    public void set_class(RecordRef _class) {
        this._class = _class;
    }

    public RecordRef getLocation() {
        return this.location;
    }

    public void setLocation(RecordRef location) {
        this.location = location;
    }

    public RecordRef getSubsidiary() {
        return this.subsidiary;
    }

    public void setSubsidiary(RecordRef subsidiary) {
        this.subsidiary = subsidiary;
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
        if (!(obj instanceof Folder)) {
            return false;
        }
        Folder other = (Folder)obj;
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
        boolean _equals = super.equals(obj) && (this.name == null && other.getName() == null || this.name != null && this.name.equals(other.getName())) && (this.department == null && other.getDepartment() == null || this.department != null && this.department.equals(other.getDepartment())) && (this.description == null && other.getDescription() == null || this.description != null && this.description.equals(other.getDescription())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && this.isInactive.equals(other.getIsInactive())) && (this.isPrivate == null && other.getIsPrivate() == null || this.isPrivate != null && this.isPrivate.equals(other.getIsPrivate())) && (this.bundleable == null && other.getBundleable() == null || this.bundleable != null && this.bundleable.equals(other.getBundleable())) && (this.hideInBundle == null && other.getHideInBundle() == null || this.hideInBundle != null && this.hideInBundle.equals(other.getHideInBundle())) && (this.isOnline == null && other.getIsOnline() == null || this.isOnline != null && this.isOnline.equals(other.getIsOnline())) && (this.group == null && other.getGroup() == null || this.group != null && this.group.equals(other.getGroup())) && (this.parent == null && other.getParent() == null || this.parent != null && this.parent.equals(other.getParent())) && (this.folderType == null && other.getFolderType() == null || this.folderType != null && this.folderType.equals(other.getFolderType())) && (this._class == null && other.get_class() == null || this._class != null && this._class.equals(other.get_class())) && (this.location == null && other.getLocation() == null || this.location != null && this.location.equals(other.getLocation())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && this.subsidiary.equals(other.getSubsidiary())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
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
        if (this.getDepartment() != null) {
            _hashCode += this.getDepartment().hashCode();
        }
        if (this.getDescription() != null) {
            _hashCode += this.getDescription().hashCode();
        }
        if (this.getIsInactive() != null) {
            _hashCode += this.getIsInactive().hashCode();
        }
        if (this.getIsPrivate() != null) {
            _hashCode += this.getIsPrivate().hashCode();
        }
        if (this.getBundleable() != null) {
            _hashCode += this.getBundleable().hashCode();
        }
        if (this.getHideInBundle() != null) {
            _hashCode += this.getHideInBundle().hashCode();
        }
        if (this.getIsOnline() != null) {
            _hashCode += this.getIsOnline().hashCode();
        }
        if (this.getGroup() != null) {
            _hashCode += this.getGroup().hashCode();
        }
        if (this.getParent() != null) {
            _hashCode += this.getParent().hashCode();
        }
        if (this.getFolderType() != null) {
            _hashCode += this.getFolderType().hashCode();
        }
        if (this.get_class() != null) {
            _hashCode += this.get_class().hashCode();
        }
        if (this.getLocation() != null) {
            _hashCode += this.getLocation().hashCode();
        }
        if (this.getSubsidiary() != null) {
            _hashCode += this.getSubsidiary().hashCode();
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
        typeDesc.setXmlType(new QName("urn:filecabinet_2022_1.documents.webservices.netsuite.com", "Folder"));
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
        elemField.setFieldName("name");
        elemField.setXmlName(new QName("urn:filecabinet_2022_1.documents.webservices.netsuite.com", "name"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new QName("urn:filecabinet_2022_1.documents.webservices.netsuite.com", "department"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new QName("urn:filecabinet_2022_1.documents.webservices.netsuite.com", "description"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new QName("urn:filecabinet_2022_1.documents.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isPrivate");
        elemField.setXmlName(new QName("urn:filecabinet_2022_1.documents.webservices.netsuite.com", "isPrivate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("bundleable");
        elemField.setXmlName(new QName("urn:filecabinet_2022_1.documents.webservices.netsuite.com", "bundleable"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("hideInBundle");
        elemField.setXmlName(new QName("urn:filecabinet_2022_1.documents.webservices.netsuite.com", "hideInBundle"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isOnline");
        elemField.setXmlName(new QName("urn:filecabinet_2022_1.documents.webservices.netsuite.com", "isOnline"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("group");
        elemField.setXmlName(new QName("urn:filecabinet_2022_1.documents.webservices.netsuite.com", "group"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new QName("urn:filecabinet_2022_1.documents.webservices.netsuite.com", "parent"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("folderType");
        elemField.setXmlName(new QName("urn:filecabinet_2022_1.documents.webservices.netsuite.com", "folderType"));
        elemField.setXmlType(new QName("urn:types.filecabinet_2022_1.documents.webservices.netsuite.com", "FolderFolderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new QName("urn:filecabinet_2022_1.documents.webservices.netsuite.com", "class"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new QName("urn:filecabinet_2022_1.documents.webservices.netsuite.com", "location"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new QName("urn:filecabinet_2022_1.documents.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

