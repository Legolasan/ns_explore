/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.axis.description.TypeDesc
 *  org.apache.axis.encoding.Deserializer
 *  org.apache.axis.encoding.Serializer
 *  org.apache.axis.encoding.ser.EnumDeserializer
 *  org.apache.axis.encoding.ser.EnumSerializer
 */
package com.netsuite.suitetalk.proxy.v2022_1.documents.filecabinet.types;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

public class FolderFolderType
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __appPackages = "_appPackages";
    public static final String __attachmentsReceived = "_attachmentsReceived";
    public static final String __attachmentsSent = "_attachmentsSent";
    public static final String __certificates = "_certificates";
    public static final String __documentsAndFiles = "_documentsAndFiles";
    public static final String __emailTemplates = "_emailTemplates";
    public static final String __faxTemplates = "_faxTemplates";
    public static final String __images = "_images";
    public static final String __letterTemplates = "_letterTemplates";
    public static final String __mailMerge = "_mailMerge";
    public static final String __marketingTemplates = "_marketingTemplates";
    public static final String __pdfTemplates = "_pdfTemplates";
    public static final String __suitebundles = "_suitebundles";
    public static final String __suitecommerceAdvancedSiteTemplates = "_suitecommerceAdvancedSiteTemplates";
    public static final String __suitescripts = "_suitescripts";
    public static final String __templates = "_templates";
    public static final String __webSiteHostingFiles = "_webSiteHostingFiles";
    public static final FolderFolderType _appPackages = new FolderFolderType("_appPackages");
    public static final FolderFolderType _attachmentsReceived = new FolderFolderType("_attachmentsReceived");
    public static final FolderFolderType _attachmentsSent = new FolderFolderType("_attachmentsSent");
    public static final FolderFolderType _certificates = new FolderFolderType("_certificates");
    public static final FolderFolderType _documentsAndFiles = new FolderFolderType("_documentsAndFiles");
    public static final FolderFolderType _emailTemplates = new FolderFolderType("_emailTemplates");
    public static final FolderFolderType _faxTemplates = new FolderFolderType("_faxTemplates");
    public static final FolderFolderType _images = new FolderFolderType("_images");
    public static final FolderFolderType _letterTemplates = new FolderFolderType("_letterTemplates");
    public static final FolderFolderType _mailMerge = new FolderFolderType("_mailMerge");
    public static final FolderFolderType _marketingTemplates = new FolderFolderType("_marketingTemplates");
    public static final FolderFolderType _pdfTemplates = new FolderFolderType("_pdfTemplates");
    public static final FolderFolderType _suitebundles = new FolderFolderType("_suitebundles");
    public static final FolderFolderType _suitecommerceAdvancedSiteTemplates = new FolderFolderType("_suitecommerceAdvancedSiteTemplates");
    public static final FolderFolderType _suitescripts = new FolderFolderType("_suitescripts");
    public static final FolderFolderType _templates = new FolderFolderType("_templates");
    public static final FolderFolderType _webSiteHostingFiles = new FolderFolderType("_webSiteHostingFiles");
    private static TypeDesc typeDesc = new TypeDesc(FolderFolderType.class);

    protected FolderFolderType(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static FolderFolderType fromValue(String value) throws IllegalArgumentException {
        FolderFolderType enumeration = (FolderFolderType)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static FolderFolderType fromString(String value) throws IllegalArgumentException {
        return FolderFolderType.fromValue(value);
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return this.toString().hashCode();
    }

    public String toString() {
        return this._value_;
    }

    public Object readResolve() throws ObjectStreamException {
        return FolderFolderType.fromValue(this._value_);
    }

    public static Serializer getSerializer(String mechType, Class _javaType, QName _xmlType) {
        return new EnumSerializer(_javaType, _xmlType);
    }

    public static Deserializer getDeserializer(String mechType, Class _javaType, QName _xmlType) {
        return new EnumDeserializer(_javaType, _xmlType);
    }

    public static TypeDesc getTypeDesc() {
        return typeDesc;
    }

    static {
        typeDesc.setXmlType(new QName("urn:types.filecabinet_2022_1.documents.webservices.netsuite.com", "FolderFolderType"));
    }
}

