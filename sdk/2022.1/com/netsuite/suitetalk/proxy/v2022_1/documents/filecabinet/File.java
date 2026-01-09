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

import com.netsuite.suitetalk.proxy.v2022_1.documents.filecabinet.FileSiteCategoryList;
import com.netsuite.suitetalk.proxy.v2022_1.documents.filecabinet.types.FileAttachFrom;
import com.netsuite.suitetalk.proxy.v2022_1.documents.filecabinet.types.FileEncoding;
import com.netsuite.suitetalk.proxy.v2022_1.documents.filecabinet.types.MediaType;
import com.netsuite.suitetalk.proxy.v2022_1.documents.filecabinet.types.TextFileEncoding;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.NullField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.Record;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Calendar;
import javax.xml.namespace.QName;
import org.apache.axis.description.AttributeDesc;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class File
extends Record
implements Serializable {
    private String name;
    private FileAttachFrom attachFrom;
    private String mediaTypeName;
    private MediaType fileType;
    private byte[] content;
    private RecordRef folder;
    private Double fileSize;
    private String url;
    private String urlComponent;
    private RecordRef mediaFile;
    private TextFileEncoding textFileEncoding;
    private String description;
    private FileEncoding encoding;
    private String altTagCaption;
    private Boolean isOnline;
    private Boolean isInactive;
    private String _class;
    private Boolean bundleable;
    private String department;
    private Boolean hideInBundle;
    private Boolean isPrivate;
    private RecordRef owner;
    private String caption;
    private RecordRef storeDisplayThumbnail;
    private String siteDescription;
    private String featuredDescription;
    private Calendar lastModifiedDate;
    private Calendar createdDate;
    private FileSiteCategoryList siteCategoryList;
    private String internalId;
    private String externalId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(File.class, true);

    public File() {
    }

    public File(NullField nullFieldList, String internalId, String externalId, String name, FileAttachFrom attachFrom, String mediaTypeName, MediaType fileType, byte[] content, RecordRef folder, Double fileSize, String url, String urlComponent, RecordRef mediaFile, TextFileEncoding textFileEncoding, String description, FileEncoding encoding, String altTagCaption, Boolean isOnline, Boolean isInactive, String _class, Boolean bundleable, String department, Boolean hideInBundle, Boolean isPrivate, RecordRef owner, String caption, RecordRef storeDisplayThumbnail, String siteDescription, String featuredDescription, Calendar lastModifiedDate, Calendar createdDate, FileSiteCategoryList siteCategoryList) {
        super(nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.name = name;
        this.attachFrom = attachFrom;
        this.mediaTypeName = mediaTypeName;
        this.fileType = fileType;
        this.content = content;
        this.folder = folder;
        this.fileSize = fileSize;
        this.url = url;
        this.urlComponent = urlComponent;
        this.mediaFile = mediaFile;
        this.textFileEncoding = textFileEncoding;
        this.description = description;
        this.encoding = encoding;
        this.altTagCaption = altTagCaption;
        this.isOnline = isOnline;
        this.isInactive = isInactive;
        this._class = _class;
        this.bundleable = bundleable;
        this.department = department;
        this.hideInBundle = hideInBundle;
        this.isPrivate = isPrivate;
        this.owner = owner;
        this.caption = caption;
        this.storeDisplayThumbnail = storeDisplayThumbnail;
        this.siteDescription = siteDescription;
        this.featuredDescription = featuredDescription;
        this.lastModifiedDate = lastModifiedDate;
        this.createdDate = createdDate;
        this.siteCategoryList = siteCategoryList;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public FileAttachFrom getAttachFrom() {
        return this.attachFrom;
    }

    public void setAttachFrom(FileAttachFrom attachFrom) {
        this.attachFrom = attachFrom;
    }

    public String getMediaTypeName() {
        return this.mediaTypeName;
    }

    public void setMediaTypeName(String mediaTypeName) {
        this.mediaTypeName = mediaTypeName;
    }

    public MediaType getFileType() {
        return this.fileType;
    }

    public void setFileType(MediaType fileType) {
        this.fileType = fileType;
    }

    public byte[] getContent() {
        return this.content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }

    public RecordRef getFolder() {
        return this.folder;
    }

    public void setFolder(RecordRef folder) {
        this.folder = folder;
    }

    public Double getFileSize() {
        return this.fileSize;
    }

    public void setFileSize(Double fileSize) {
        this.fileSize = fileSize;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUrlComponent() {
        return this.urlComponent;
    }

    public void setUrlComponent(String urlComponent) {
        this.urlComponent = urlComponent;
    }

    public RecordRef getMediaFile() {
        return this.mediaFile;
    }

    public void setMediaFile(RecordRef mediaFile) {
        this.mediaFile = mediaFile;
    }

    public TextFileEncoding getTextFileEncoding() {
        return this.textFileEncoding;
    }

    public void setTextFileEncoding(TextFileEncoding textFileEncoding) {
        this.textFileEncoding = textFileEncoding;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public FileEncoding getEncoding() {
        return this.encoding;
    }

    public void setEncoding(FileEncoding encoding) {
        this.encoding = encoding;
    }

    public String getAltTagCaption() {
        return this.altTagCaption;
    }

    public void setAltTagCaption(String altTagCaption) {
        this.altTagCaption = altTagCaption;
    }

    public Boolean getIsOnline() {
        return this.isOnline;
    }

    public void setIsOnline(Boolean isOnline) {
        this.isOnline = isOnline;
    }

    public Boolean getIsInactive() {
        return this.isInactive;
    }

    public void setIsInactive(Boolean isInactive) {
        this.isInactive = isInactive;
    }

    public String get_class() {
        return this._class;
    }

    public void set_class(String _class) {
        this._class = _class;
    }

    public Boolean getBundleable() {
        return this.bundleable;
    }

    public void setBundleable(Boolean bundleable) {
        this.bundleable = bundleable;
    }

    public String getDepartment() {
        return this.department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Boolean getHideInBundle() {
        return this.hideInBundle;
    }

    public void setHideInBundle(Boolean hideInBundle) {
        this.hideInBundle = hideInBundle;
    }

    public Boolean getIsPrivate() {
        return this.isPrivate;
    }

    public void setIsPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    public RecordRef getOwner() {
        return this.owner;
    }

    public void setOwner(RecordRef owner) {
        this.owner = owner;
    }

    public String getCaption() {
        return this.caption;
    }

    public void setCaption(String caption) {
        this.caption = caption;
    }

    public RecordRef getStoreDisplayThumbnail() {
        return this.storeDisplayThumbnail;
    }

    public void setStoreDisplayThumbnail(RecordRef storeDisplayThumbnail) {
        this.storeDisplayThumbnail = storeDisplayThumbnail;
    }

    public String getSiteDescription() {
        return this.siteDescription;
    }

    public void setSiteDescription(String siteDescription) {
        this.siteDescription = siteDescription;
    }

    public String getFeaturedDescription() {
        return this.featuredDescription;
    }

    public void setFeaturedDescription(String featuredDescription) {
        this.featuredDescription = featuredDescription;
    }

    public Calendar getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    public void setLastModifiedDate(Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public Calendar getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(Calendar createdDate) {
        this.createdDate = createdDate;
    }

    public FileSiteCategoryList getSiteCategoryList() {
        return this.siteCategoryList;
    }

    public void setSiteCategoryList(FileSiteCategoryList siteCategoryList) {
        this.siteCategoryList = siteCategoryList;
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
        if (!(obj instanceof File)) {
            return false;
        }
        File other = (File)obj;
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
        boolean _equals = super.equals(obj) && (this.name == null && other.getName() == null || this.name != null && this.name.equals(other.getName())) && (this.attachFrom == null && other.getAttachFrom() == null || this.attachFrom != null && this.attachFrom.equals(other.getAttachFrom())) && (this.mediaTypeName == null && other.getMediaTypeName() == null || this.mediaTypeName != null && this.mediaTypeName.equals(other.getMediaTypeName())) && (this.fileType == null && other.getFileType() == null || this.fileType != null && this.fileType.equals(other.getFileType())) && (this.content == null && other.getContent() == null || this.content != null && Arrays.equals(this.content, other.getContent())) && (this.folder == null && other.getFolder() == null || this.folder != null && this.folder.equals(other.getFolder())) && (this.fileSize == null && other.getFileSize() == null || this.fileSize != null && this.fileSize.equals(other.getFileSize())) && (this.url == null && other.getUrl() == null || this.url != null && this.url.equals(other.getUrl())) && (this.urlComponent == null && other.getUrlComponent() == null || this.urlComponent != null && this.urlComponent.equals(other.getUrlComponent())) && (this.mediaFile == null && other.getMediaFile() == null || this.mediaFile != null && this.mediaFile.equals(other.getMediaFile())) && (this.textFileEncoding == null && other.getTextFileEncoding() == null || this.textFileEncoding != null && this.textFileEncoding.equals(other.getTextFileEncoding())) && (this.description == null && other.getDescription() == null || this.description != null && this.description.equals(other.getDescription())) && (this.encoding == null && other.getEncoding() == null || this.encoding != null && this.encoding.equals(other.getEncoding())) && (this.altTagCaption == null && other.getAltTagCaption() == null || this.altTagCaption != null && this.altTagCaption.equals(other.getAltTagCaption())) && (this.isOnline == null && other.getIsOnline() == null || this.isOnline != null && this.isOnline.equals(other.getIsOnline())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && this.isInactive.equals(other.getIsInactive())) && (this._class == null && other.get_class() == null || this._class != null && this._class.equals(other.get_class())) && (this.bundleable == null && other.getBundleable() == null || this.bundleable != null && this.bundleable.equals(other.getBundleable())) && (this.department == null && other.getDepartment() == null || this.department != null && this.department.equals(other.getDepartment())) && (this.hideInBundle == null && other.getHideInBundle() == null || this.hideInBundle != null && this.hideInBundle.equals(other.getHideInBundle())) && (this.isPrivate == null && other.getIsPrivate() == null || this.isPrivate != null && this.isPrivate.equals(other.getIsPrivate())) && (this.owner == null && other.getOwner() == null || this.owner != null && this.owner.equals(other.getOwner())) && (this.caption == null && other.getCaption() == null || this.caption != null && this.caption.equals(other.getCaption())) && (this.storeDisplayThumbnail == null && other.getStoreDisplayThumbnail() == null || this.storeDisplayThumbnail != null && this.storeDisplayThumbnail.equals(other.getStoreDisplayThumbnail())) && (this.siteDescription == null && other.getSiteDescription() == null || this.siteDescription != null && this.siteDescription.equals(other.getSiteDescription())) && (this.featuredDescription == null && other.getFeaturedDescription() == null || this.featuredDescription != null && this.featuredDescription.equals(other.getFeaturedDescription())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && this.lastModifiedDate.equals(other.getLastModifiedDate())) && (this.createdDate == null && other.getCreatedDate() == null || this.createdDate != null && this.createdDate.equals(other.getCreatedDate())) && (this.siteCategoryList == null && other.getSiteCategoryList() == null || this.siteCategoryList != null && this.siteCategoryList.equals(other.getSiteCategoryList())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
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
        if (this.getAttachFrom() != null) {
            _hashCode += this.getAttachFrom().hashCode();
        }
        if (this.getMediaTypeName() != null) {
            _hashCode += this.getMediaTypeName().hashCode();
        }
        if (this.getFileType() != null) {
            _hashCode += this.getFileType().hashCode();
        }
        if (this.getContent() != null) {
            for (int i = 0; i < Array.getLength(this.getContent()); ++i) {
                Object obj = Array.get(this.getContent(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getFolder() != null) {
            _hashCode += this.getFolder().hashCode();
        }
        if (this.getFileSize() != null) {
            _hashCode += this.getFileSize().hashCode();
        }
        if (this.getUrl() != null) {
            _hashCode += this.getUrl().hashCode();
        }
        if (this.getUrlComponent() != null) {
            _hashCode += this.getUrlComponent().hashCode();
        }
        if (this.getMediaFile() != null) {
            _hashCode += this.getMediaFile().hashCode();
        }
        if (this.getTextFileEncoding() != null) {
            _hashCode += this.getTextFileEncoding().hashCode();
        }
        if (this.getDescription() != null) {
            _hashCode += this.getDescription().hashCode();
        }
        if (this.getEncoding() != null) {
            _hashCode += this.getEncoding().hashCode();
        }
        if (this.getAltTagCaption() != null) {
            _hashCode += this.getAltTagCaption().hashCode();
        }
        if (this.getIsOnline() != null) {
            _hashCode += this.getIsOnline().hashCode();
        }
        if (this.getIsInactive() != null) {
            _hashCode += this.getIsInactive().hashCode();
        }
        if (this.get_class() != null) {
            _hashCode += this.get_class().hashCode();
        }
        if (this.getBundleable() != null) {
            _hashCode += this.getBundleable().hashCode();
        }
        if (this.getDepartment() != null) {
            _hashCode += this.getDepartment().hashCode();
        }
        if (this.getHideInBundle() != null) {
            _hashCode += this.getHideInBundle().hashCode();
        }
        if (this.getIsPrivate() != null) {
            _hashCode += this.getIsPrivate().hashCode();
        }
        if (this.getOwner() != null) {
            _hashCode += this.getOwner().hashCode();
        }
        if (this.getCaption() != null) {
            _hashCode += this.getCaption().hashCode();
        }
        if (this.getStoreDisplayThumbnail() != null) {
            _hashCode += this.getStoreDisplayThumbnail().hashCode();
        }
        if (this.getSiteDescription() != null) {
            _hashCode += this.getSiteDescription().hashCode();
        }
        if (this.getFeaturedDescription() != null) {
            _hashCode += this.getFeaturedDescription().hashCode();
        }
        if (this.getLastModifiedDate() != null) {
            _hashCode += this.getLastModifiedDate().hashCode();
        }
        if (this.getCreatedDate() != null) {
            _hashCode += this.getCreatedDate().hashCode();
        }
        if (this.getSiteCategoryList() != null) {
            _hashCode += this.getSiteCategoryList().hashCode();
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
        typeDesc.setXmlType(new QName("urn:filecabinet_2022_1.documents.webservices.netsuite.com", "File"));
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
        elemField.setFieldName("attachFrom");
        elemField.setXmlName(new QName("urn:filecabinet_2022_1.documents.webservices.netsuite.com", "attachFrom"));
        elemField.setXmlType(new QName("urn:types.filecabinet_2022_1.documents.webservices.netsuite.com", "FileAttachFrom"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("mediaTypeName");
        elemField.setXmlName(new QName("urn:filecabinet_2022_1.documents.webservices.netsuite.com", "mediaTypeName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fileType");
        elemField.setXmlName(new QName("urn:filecabinet_2022_1.documents.webservices.netsuite.com", "fileType"));
        elemField.setXmlType(new QName("urn:types.filecabinet_2022_1.documents.webservices.netsuite.com", "MediaType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("content");
        elemField.setXmlName(new QName("urn:filecabinet_2022_1.documents.webservices.netsuite.com", "content"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("folder");
        elemField.setXmlName(new QName("urn:filecabinet_2022_1.documents.webservices.netsuite.com", "folder"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fileSize");
        elemField.setXmlName(new QName("urn:filecabinet_2022_1.documents.webservices.netsuite.com", "fileSize"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new QName("urn:filecabinet_2022_1.documents.webservices.netsuite.com", "url"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("urlComponent");
        elemField.setXmlName(new QName("urn:filecabinet_2022_1.documents.webservices.netsuite.com", "urlComponent"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("mediaFile");
        elemField.setXmlName(new QName("urn:filecabinet_2022_1.documents.webservices.netsuite.com", "mediaFile"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("textFileEncoding");
        elemField.setXmlName(new QName("urn:filecabinet_2022_1.documents.webservices.netsuite.com", "textFileEncoding"));
        elemField.setXmlType(new QName("urn:types.filecabinet_2022_1.documents.webservices.netsuite.com", "TextFileEncoding"));
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
        elemField.setFieldName("encoding");
        elemField.setXmlName(new QName("urn:filecabinet_2022_1.documents.webservices.netsuite.com", "encoding"));
        elemField.setXmlType(new QName("urn:types.filecabinet_2022_1.documents.webservices.netsuite.com", "FileEncoding"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("altTagCaption");
        elemField.setXmlName(new QName("urn:filecabinet_2022_1.documents.webservices.netsuite.com", "altTagCaption"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new QName("urn:filecabinet_2022_1.documents.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new QName("urn:filecabinet_2022_1.documents.webservices.netsuite.com", "class"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("department");
        elemField.setXmlName(new QName("urn:filecabinet_2022_1.documents.webservices.netsuite.com", "department"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("isPrivate");
        elemField.setXmlName(new QName("urn:filecabinet_2022_1.documents.webservices.netsuite.com", "isPrivate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new QName("urn:filecabinet_2022_1.documents.webservices.netsuite.com", "owner"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("caption");
        elemField.setXmlName(new QName("urn:filecabinet_2022_1.documents.webservices.netsuite.com", "caption"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("storeDisplayThumbnail");
        elemField.setXmlName(new QName("urn:filecabinet_2022_1.documents.webservices.netsuite.com", "storeDisplayThumbnail"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("siteDescription");
        elemField.setXmlName(new QName("urn:filecabinet_2022_1.documents.webservices.netsuite.com", "siteDescription"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("featuredDescription");
        elemField.setXmlName(new QName("urn:filecabinet_2022_1.documents.webservices.netsuite.com", "featuredDescription"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new QName("urn:filecabinet_2022_1.documents.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new QName("urn:filecabinet_2022_1.documents.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("siteCategoryList");
        elemField.setXmlName(new QName("urn:filecabinet_2022_1.documents.webservices.netsuite.com", "siteCategoryList"));
        elemField.setXmlType(new QName("urn:filecabinet_2022_1.documents.webservices.netsuite.com", "FileSiteCategoryList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

