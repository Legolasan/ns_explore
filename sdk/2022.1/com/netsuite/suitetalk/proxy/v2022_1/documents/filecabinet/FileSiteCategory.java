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
package com.netsuite.suitetalk.proxy.v2022_1.documents.filecabinet;

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class FileSiteCategory
implements Serializable {
    private Boolean isDefault;
    private RecordRef category;
    private String categoryDescription;
    private RecordRef website;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(FileSiteCategory.class, true);

    public FileSiteCategory() {
    }

    public FileSiteCategory(Boolean isDefault, RecordRef category, String categoryDescription, RecordRef website) {
        this.isDefault = isDefault;
        this.category = category;
        this.categoryDescription = categoryDescription;
        this.website = website;
    }

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public RecordRef getCategory() {
        return this.category;
    }

    public void setCategory(RecordRef category) {
        this.category = category;
    }

    public String getCategoryDescription() {
        return this.categoryDescription;
    }

    public void setCategoryDescription(String categoryDescription) {
        this.categoryDescription = categoryDescription;
    }

    public RecordRef getWebsite() {
        return this.website;
    }

    public void setWebsite(RecordRef website) {
        this.website = website;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof FileSiteCategory)) {
            return false;
        }
        FileSiteCategory other = (FileSiteCategory)obj;
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
        boolean _equals = (this.isDefault == null && other.getIsDefault() == null || this.isDefault != null && this.isDefault.equals(other.getIsDefault())) && (this.category == null && other.getCategory() == null || this.category != null && this.category.equals(other.getCategory())) && (this.categoryDescription == null && other.getCategoryDescription() == null || this.categoryDescription != null && this.categoryDescription.equals(other.getCategoryDescription())) && (this.website == null && other.getWebsite() == null || this.website != null && this.website.equals(other.getWebsite()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getIsDefault() != null) {
            _hashCode += this.getIsDefault().hashCode();
        }
        if (this.getCategory() != null) {
            _hashCode += this.getCategory().hashCode();
        }
        if (this.getCategoryDescription() != null) {
            _hashCode += this.getCategoryDescription().hashCode();
        }
        if (this.getWebsite() != null) {
            _hashCode += this.getWebsite().hashCode();
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
        typeDesc.setXmlType(new QName("urn:filecabinet_2022_1.documents.webservices.netsuite.com", "FileSiteCategory"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("isDefault");
        elemField.setXmlName(new QName("urn:filecabinet_2022_1.documents.webservices.netsuite.com", "isDefault"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new QName("urn:filecabinet_2022_1.documents.webservices.netsuite.com", "category"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("categoryDescription");
        elemField.setXmlName(new QName("urn:filecabinet_2022_1.documents.webservices.netsuite.com", "categoryDescription"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("website");
        elemField.setXmlName(new QName("urn:filecabinet_2022_1.documents.webservices.netsuite.com", "website"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

