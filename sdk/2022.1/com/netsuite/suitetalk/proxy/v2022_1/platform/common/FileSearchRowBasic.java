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
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnDateField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnEnumSelectField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnLongField;
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

public class FileSearchRowBasic
extends SearchRowBasic
implements Serializable {
    private SearchColumnBooleanField[] availableWithoutLogin;
    private SearchColumnDateField[] created;
    private SearchColumnDateField[] dateViewed;
    private SearchColumnStringField[] description;
    private SearchColumnLongField[] documentSize;
    private SearchColumnSelectField[] externalId;
    private SearchColumnEnumSelectField[] fileType;
    private SearchColumnSelectField[] folder;
    private SearchColumnLongField[] hits;
    private SearchColumnStringField[] hostedPath;
    private SearchColumnSelectField[] internalId;
    private SearchColumnBooleanField[] isAvailable;
    private SearchColumnDateField[] modified;
    private SearchColumnStringField[] name;
    private SearchColumnSelectField[] owner;
    private SearchColumnStringField[] url;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(FileSearchRowBasic.class, true);

    public FileSearchRowBasic() {
    }

    public FileSearchRowBasic(SearchColumnBooleanField[] availableWithoutLogin, SearchColumnDateField[] created, SearchColumnDateField[] dateViewed, SearchColumnStringField[] description, SearchColumnLongField[] documentSize, SearchColumnSelectField[] externalId, SearchColumnEnumSelectField[] fileType, SearchColumnSelectField[] folder, SearchColumnLongField[] hits, SearchColumnStringField[] hostedPath, SearchColumnSelectField[] internalId, SearchColumnBooleanField[] isAvailable, SearchColumnDateField[] modified, SearchColumnStringField[] name, SearchColumnSelectField[] owner, SearchColumnStringField[] url) {
        this.availableWithoutLogin = availableWithoutLogin;
        this.created = created;
        this.dateViewed = dateViewed;
        this.description = description;
        this.documentSize = documentSize;
        this.externalId = externalId;
        this.fileType = fileType;
        this.folder = folder;
        this.hits = hits;
        this.hostedPath = hostedPath;
        this.internalId = internalId;
        this.isAvailable = isAvailable;
        this.modified = modified;
        this.name = name;
        this.owner = owner;
        this.url = url;
    }

    public SearchColumnBooleanField[] getAvailableWithoutLogin() {
        return this.availableWithoutLogin;
    }

    public void setAvailableWithoutLogin(SearchColumnBooleanField[] availableWithoutLogin) {
        this.availableWithoutLogin = availableWithoutLogin;
    }

    public SearchColumnBooleanField getAvailableWithoutLogin(int i) {
        return this.availableWithoutLogin[i];
    }

    public void setAvailableWithoutLogin(int i, SearchColumnBooleanField _value) {
        this.availableWithoutLogin[i] = _value;
    }

    public SearchColumnDateField[] getCreated() {
        return this.created;
    }

    public void setCreated(SearchColumnDateField[] created) {
        this.created = created;
    }

    public SearchColumnDateField getCreated(int i) {
        return this.created[i];
    }

    public void setCreated(int i, SearchColumnDateField _value) {
        this.created[i] = _value;
    }

    public SearchColumnDateField[] getDateViewed() {
        return this.dateViewed;
    }

    public void setDateViewed(SearchColumnDateField[] dateViewed) {
        this.dateViewed = dateViewed;
    }

    public SearchColumnDateField getDateViewed(int i) {
        return this.dateViewed[i];
    }

    public void setDateViewed(int i, SearchColumnDateField _value) {
        this.dateViewed[i] = _value;
    }

    public SearchColumnStringField[] getDescription() {
        return this.description;
    }

    public void setDescription(SearchColumnStringField[] description) {
        this.description = description;
    }

    public SearchColumnStringField getDescription(int i) {
        return this.description[i];
    }

    public void setDescription(int i, SearchColumnStringField _value) {
        this.description[i] = _value;
    }

    public SearchColumnLongField[] getDocumentSize() {
        return this.documentSize;
    }

    public void setDocumentSize(SearchColumnLongField[] documentSize) {
        this.documentSize = documentSize;
    }

    public SearchColumnLongField getDocumentSize(int i) {
        return this.documentSize[i];
    }

    public void setDocumentSize(int i, SearchColumnLongField _value) {
        this.documentSize[i] = _value;
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

    public SearchColumnEnumSelectField[] getFileType() {
        return this.fileType;
    }

    public void setFileType(SearchColumnEnumSelectField[] fileType) {
        this.fileType = fileType;
    }

    public SearchColumnEnumSelectField getFileType(int i) {
        return this.fileType[i];
    }

    public void setFileType(int i, SearchColumnEnumSelectField _value) {
        this.fileType[i] = _value;
    }

    public SearchColumnSelectField[] getFolder() {
        return this.folder;
    }

    public void setFolder(SearchColumnSelectField[] folder) {
        this.folder = folder;
    }

    public SearchColumnSelectField getFolder(int i) {
        return this.folder[i];
    }

    public void setFolder(int i, SearchColumnSelectField _value) {
        this.folder[i] = _value;
    }

    public SearchColumnLongField[] getHits() {
        return this.hits;
    }

    public void setHits(SearchColumnLongField[] hits) {
        this.hits = hits;
    }

    public SearchColumnLongField getHits(int i) {
        return this.hits[i];
    }

    public void setHits(int i, SearchColumnLongField _value) {
        this.hits[i] = _value;
    }

    public SearchColumnStringField[] getHostedPath() {
        return this.hostedPath;
    }

    public void setHostedPath(SearchColumnStringField[] hostedPath) {
        this.hostedPath = hostedPath;
    }

    public SearchColumnStringField getHostedPath(int i) {
        return this.hostedPath[i];
    }

    public void setHostedPath(int i, SearchColumnStringField _value) {
        this.hostedPath[i] = _value;
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

    public SearchColumnBooleanField[] getIsAvailable() {
        return this.isAvailable;
    }

    public void setIsAvailable(SearchColumnBooleanField[] isAvailable) {
        this.isAvailable = isAvailable;
    }

    public SearchColumnBooleanField getIsAvailable(int i) {
        return this.isAvailable[i];
    }

    public void setIsAvailable(int i, SearchColumnBooleanField _value) {
        this.isAvailable[i] = _value;
    }

    public SearchColumnDateField[] getModified() {
        return this.modified;
    }

    public void setModified(SearchColumnDateField[] modified) {
        this.modified = modified;
    }

    public SearchColumnDateField getModified(int i) {
        return this.modified[i];
    }

    public void setModified(int i, SearchColumnDateField _value) {
        this.modified[i] = _value;
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

    public SearchColumnSelectField[] getOwner() {
        return this.owner;
    }

    public void setOwner(SearchColumnSelectField[] owner) {
        this.owner = owner;
    }

    public SearchColumnSelectField getOwner(int i) {
        return this.owner[i];
    }

    public void setOwner(int i, SearchColumnSelectField _value) {
        this.owner[i] = _value;
    }

    public SearchColumnStringField[] getUrl() {
        return this.url;
    }

    public void setUrl(SearchColumnStringField[] url) {
        this.url = url;
    }

    public SearchColumnStringField getUrl(int i) {
        return this.url[i];
    }

    public void setUrl(int i, SearchColumnStringField _value) {
        this.url[i] = _value;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof FileSearchRowBasic)) {
            return false;
        }
        FileSearchRowBasic other = (FileSearchRowBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.availableWithoutLogin == null && other.getAvailableWithoutLogin() == null || this.availableWithoutLogin != null && Arrays.equals(this.availableWithoutLogin, other.getAvailableWithoutLogin())) && (this.created == null && other.getCreated() == null || this.created != null && Arrays.equals(this.created, other.getCreated())) && (this.dateViewed == null && other.getDateViewed() == null || this.dateViewed != null && Arrays.equals(this.dateViewed, other.getDateViewed())) && (this.description == null && other.getDescription() == null || this.description != null && Arrays.equals(this.description, other.getDescription())) && (this.documentSize == null && other.getDocumentSize() == null || this.documentSize != null && Arrays.equals(this.documentSize, other.getDocumentSize())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && Arrays.equals(this.externalId, other.getExternalId())) && (this.fileType == null && other.getFileType() == null || this.fileType != null && Arrays.equals(this.fileType, other.getFileType())) && (this.folder == null && other.getFolder() == null || this.folder != null && Arrays.equals(this.folder, other.getFolder())) && (this.hits == null && other.getHits() == null || this.hits != null && Arrays.equals(this.hits, other.getHits())) && (this.hostedPath == null && other.getHostedPath() == null || this.hostedPath != null && Arrays.equals(this.hostedPath, other.getHostedPath())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && Arrays.equals(this.internalId, other.getInternalId())) && (this.isAvailable == null && other.getIsAvailable() == null || this.isAvailable != null && Arrays.equals(this.isAvailable, other.getIsAvailable())) && (this.modified == null && other.getModified() == null || this.modified != null && Arrays.equals(this.modified, other.getModified())) && (this.name == null && other.getName() == null || this.name != null && Arrays.equals(this.name, other.getName())) && (this.owner == null && other.getOwner() == null || this.owner != null && Arrays.equals(this.owner, other.getOwner())) && (this.url == null && other.getUrl() == null || this.url != null && Arrays.equals(this.url, other.getUrl()));
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
        if (this.getAvailableWithoutLogin() != null) {
            for (i = 0; i < Array.getLength(this.getAvailableWithoutLogin()); ++i) {
                obj = Array.get(this.getAvailableWithoutLogin(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCreated() != null) {
            for (i = 0; i < Array.getLength(this.getCreated()); ++i) {
                obj = Array.get(this.getCreated(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDateViewed() != null) {
            for (i = 0; i < Array.getLength(this.getDateViewed()); ++i) {
                obj = Array.get(this.getDateViewed(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDescription() != null) {
            for (i = 0; i < Array.getLength(this.getDescription()); ++i) {
                obj = Array.get(this.getDescription(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDocumentSize() != null) {
            for (i = 0; i < Array.getLength(this.getDocumentSize()); ++i) {
                obj = Array.get(this.getDocumentSize(), i);
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
        if (this.getFileType() != null) {
            for (i = 0; i < Array.getLength(this.getFileType()); ++i) {
                obj = Array.get(this.getFileType(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getFolder() != null) {
            for (i = 0; i < Array.getLength(this.getFolder()); ++i) {
                obj = Array.get(this.getFolder(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getHits() != null) {
            for (i = 0; i < Array.getLength(this.getHits()); ++i) {
                obj = Array.get(this.getHits(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getHostedPath() != null) {
            for (i = 0; i < Array.getLength(this.getHostedPath()); ++i) {
                obj = Array.get(this.getHostedPath(), i);
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
        if (this.getIsAvailable() != null) {
            for (i = 0; i < Array.getLength(this.getIsAvailable()); ++i) {
                obj = Array.get(this.getIsAvailable(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getModified() != null) {
            for (i = 0; i < Array.getLength(this.getModified()); ++i) {
                obj = Array.get(this.getModified(), i);
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
        if (this.getOwner() != null) {
            for (i = 0; i < Array.getLength(this.getOwner()); ++i) {
                obj = Array.get(this.getOwner(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getUrl() != null) {
            for (i = 0; i < Array.getLength(this.getUrl()); ++i) {
                obj = Array.get(this.getUrl(), i);
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "FileSearchRowBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("availableWithoutLogin");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "availableWithoutLogin"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("created");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "created"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("dateViewed");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "dateViewed"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "description"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("documentSize");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "documentSize"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
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
        elemField.setFieldName("fileType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fileType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("folder");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "folder"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("hits");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "hits"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("hostedPath");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "hostedPath"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("isAvailable");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isAvailable"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("modified");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "modified"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
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
        elemField.setFieldName("owner");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "owner"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "url"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

