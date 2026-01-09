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
package com.netsuite.suitetalk.proxy.v2022_1.lists.relationships;

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import java.io.Serializable;
import java.util.Calendar;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class CustomerDownload
implements Serializable {
    private RecordRef file;
    private String licenseCode;
    private Long remainingDownloads;
    private Calendar expiration;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(CustomerDownload.class, true);

    public CustomerDownload() {
    }

    public CustomerDownload(RecordRef file, String licenseCode, Long remainingDownloads, Calendar expiration) {
        this.file = file;
        this.licenseCode = licenseCode;
        this.remainingDownloads = remainingDownloads;
        this.expiration = expiration;
    }

    public RecordRef getFile() {
        return this.file;
    }

    public void setFile(RecordRef file) {
        this.file = file;
    }

    public String getLicenseCode() {
        return this.licenseCode;
    }

    public void setLicenseCode(String licenseCode) {
        this.licenseCode = licenseCode;
    }

    public Long getRemainingDownloads() {
        return this.remainingDownloads;
    }

    public void setRemainingDownloads(Long remainingDownloads) {
        this.remainingDownloads = remainingDownloads;
    }

    public Calendar getExpiration() {
        return this.expiration;
    }

    public void setExpiration(Calendar expiration) {
        this.expiration = expiration;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CustomerDownload)) {
            return false;
        }
        CustomerDownload other = (CustomerDownload)obj;
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
        boolean _equals = (this.file == null && other.getFile() == null || this.file != null && this.file.equals(other.getFile())) && (this.licenseCode == null && other.getLicenseCode() == null || this.licenseCode != null && this.licenseCode.equals(other.getLicenseCode())) && (this.remainingDownloads == null && other.getRemainingDownloads() == null || this.remainingDownloads != null && this.remainingDownloads.equals(other.getRemainingDownloads())) && (this.expiration == null && other.getExpiration() == null || this.expiration != null && this.expiration.equals(other.getExpiration()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getFile() != null) {
            _hashCode += this.getFile().hashCode();
        }
        if (this.getLicenseCode() != null) {
            _hashCode += this.getLicenseCode().hashCode();
        }
        if (this.getRemainingDownloads() != null) {
            _hashCode += this.getRemainingDownloads().hashCode();
        }
        if (this.getExpiration() != null) {
            _hashCode += this.getExpiration().hashCode();
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
        typeDesc.setXmlType(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "CustomerDownload"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("file");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "file"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("licenseCode");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "licenseCode"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("remainingDownloads");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "remainingDownloads"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("expiration");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "expiration"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

