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
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchDateField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchEnumMultiSelectField;
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

public class FileSearchBasic
extends SearchRecordBasic
implements Serializable {
    private SearchBooleanField availableWithoutLogin;
    private SearchDateField created;
    private SearchDateField dateViewed;
    private SearchStringField description;
    private SearchLongField documentSize;
    private SearchMultiSelectField externalId;
    private SearchStringField externalIdString;
    private SearchEnumMultiSelectField fileType;
    private SearchMultiSelectField folder;
    private SearchMultiSelectField internalId;
    private SearchLongField internalIdNumber;
    private SearchBooleanField isAvailable;
    private SearchBooleanField isLink;
    private SearchDateField modified;
    private SearchStringField name;
    private SearchMultiSelectField owner;
    private SearchStringField url;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(FileSearchBasic.class, true);

    public FileSearchBasic() {
    }

    public FileSearchBasic(SearchBooleanField availableWithoutLogin, SearchDateField created, SearchDateField dateViewed, SearchStringField description, SearchLongField documentSize, SearchMultiSelectField externalId, SearchStringField externalIdString, SearchEnumMultiSelectField fileType, SearchMultiSelectField folder, SearchMultiSelectField internalId, SearchLongField internalIdNumber, SearchBooleanField isAvailable, SearchBooleanField isLink, SearchDateField modified, SearchStringField name, SearchMultiSelectField owner, SearchStringField url) {
        this.availableWithoutLogin = availableWithoutLogin;
        this.created = created;
        this.dateViewed = dateViewed;
        this.description = description;
        this.documentSize = documentSize;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.fileType = fileType;
        this.folder = folder;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isAvailable = isAvailable;
        this.isLink = isLink;
        this.modified = modified;
        this.name = name;
        this.owner = owner;
        this.url = url;
    }

    public SearchBooleanField getAvailableWithoutLogin() {
        return this.availableWithoutLogin;
    }

    public void setAvailableWithoutLogin(SearchBooleanField availableWithoutLogin) {
        this.availableWithoutLogin = availableWithoutLogin;
    }

    public SearchDateField getCreated() {
        return this.created;
    }

    public void setCreated(SearchDateField created) {
        this.created = created;
    }

    public SearchDateField getDateViewed() {
        return this.dateViewed;
    }

    public void setDateViewed(SearchDateField dateViewed) {
        this.dateViewed = dateViewed;
    }

    public SearchStringField getDescription() {
        return this.description;
    }

    public void setDescription(SearchStringField description) {
        this.description = description;
    }

    public SearchLongField getDocumentSize() {
        return this.documentSize;
    }

    public void setDocumentSize(SearchLongField documentSize) {
        this.documentSize = documentSize;
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

    public SearchEnumMultiSelectField getFileType() {
        return this.fileType;
    }

    public void setFileType(SearchEnumMultiSelectField fileType) {
        this.fileType = fileType;
    }

    public SearchMultiSelectField getFolder() {
        return this.folder;
    }

    public void setFolder(SearchMultiSelectField folder) {
        this.folder = folder;
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

    public SearchBooleanField getIsAvailable() {
        return this.isAvailable;
    }

    public void setIsAvailable(SearchBooleanField isAvailable) {
        this.isAvailable = isAvailable;
    }

    public SearchBooleanField getIsLink() {
        return this.isLink;
    }

    public void setIsLink(SearchBooleanField isLink) {
        this.isLink = isLink;
    }

    public SearchDateField getModified() {
        return this.modified;
    }

    public void setModified(SearchDateField modified) {
        this.modified = modified;
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

    public SearchStringField getUrl() {
        return this.url;
    }

    public void setUrl(SearchStringField url) {
        this.url = url;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof FileSearchBasic)) {
            return false;
        }
        FileSearchBasic other = (FileSearchBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.availableWithoutLogin == null && other.getAvailableWithoutLogin() == null || this.availableWithoutLogin != null && this.availableWithoutLogin.equals(other.getAvailableWithoutLogin())) && (this.created == null && other.getCreated() == null || this.created != null && this.created.equals(other.getCreated())) && (this.dateViewed == null && other.getDateViewed() == null || this.dateViewed != null && this.dateViewed.equals(other.getDateViewed())) && (this.description == null && other.getDescription() == null || this.description != null && this.description.equals(other.getDescription())) && (this.documentSize == null && other.getDocumentSize() == null || this.documentSize != null && this.documentSize.equals(other.getDocumentSize())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId())) && (this.externalIdString == null && other.getExternalIdString() == null || this.externalIdString != null && this.externalIdString.equals(other.getExternalIdString())) && (this.fileType == null && other.getFileType() == null || this.fileType != null && this.fileType.equals(other.getFileType())) && (this.folder == null && other.getFolder() == null || this.folder != null && this.folder.equals(other.getFolder())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.internalIdNumber == null && other.getInternalIdNumber() == null || this.internalIdNumber != null && this.internalIdNumber.equals(other.getInternalIdNumber())) && (this.isAvailable == null && other.getIsAvailable() == null || this.isAvailable != null && this.isAvailable.equals(other.getIsAvailable())) && (this.isLink == null && other.getIsLink() == null || this.isLink != null && this.isLink.equals(other.getIsLink())) && (this.modified == null && other.getModified() == null || this.modified != null && this.modified.equals(other.getModified())) && (this.name == null && other.getName() == null || this.name != null && this.name.equals(other.getName())) && (this.owner == null && other.getOwner() == null || this.owner != null && this.owner.equals(other.getOwner())) && (this.url == null && other.getUrl() == null || this.url != null && this.url.equals(other.getUrl()));
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
        if (this.getAvailableWithoutLogin() != null) {
            _hashCode += this.getAvailableWithoutLogin().hashCode();
        }
        if (this.getCreated() != null) {
            _hashCode += this.getCreated().hashCode();
        }
        if (this.getDateViewed() != null) {
            _hashCode += this.getDateViewed().hashCode();
        }
        if (this.getDescription() != null) {
            _hashCode += this.getDescription().hashCode();
        }
        if (this.getDocumentSize() != null) {
            _hashCode += this.getDocumentSize().hashCode();
        }
        if (this.getExternalId() != null) {
            _hashCode += this.getExternalId().hashCode();
        }
        if (this.getExternalIdString() != null) {
            _hashCode += this.getExternalIdString().hashCode();
        }
        if (this.getFileType() != null) {
            _hashCode += this.getFileType().hashCode();
        }
        if (this.getFolder() != null) {
            _hashCode += this.getFolder().hashCode();
        }
        if (this.getInternalId() != null) {
            _hashCode += this.getInternalId().hashCode();
        }
        if (this.getInternalIdNumber() != null) {
            _hashCode += this.getInternalIdNumber().hashCode();
        }
        if (this.getIsAvailable() != null) {
            _hashCode += this.getIsAvailable().hashCode();
        }
        if (this.getIsLink() != null) {
            _hashCode += this.getIsLink().hashCode();
        }
        if (this.getModified() != null) {
            _hashCode += this.getModified().hashCode();
        }
        if (this.getName() != null) {
            _hashCode += this.getName().hashCode();
        }
        if (this.getOwner() != null) {
            _hashCode += this.getOwner().hashCode();
        }
        if (this.getUrl() != null) {
            _hashCode += this.getUrl().hashCode();
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "FileSearchBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("availableWithoutLogin");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "availableWithoutLogin"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("created");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "created"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("dateViewed");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "dateViewed"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "description"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("documentSize");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "documentSize"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
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
        elemField.setFieldName("fileType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fileType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("folder");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "folder"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("isAvailable");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isAvailable"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isLink");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isLink"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("modified");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "modified"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
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
        elemField.setFieldName("url");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "url"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

