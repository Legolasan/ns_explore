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
package com.netsuite.suitetalk.proxy.v2022_1.setup.customization;

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

public class CustomRecordTypeLinks
implements Serializable {
    private RecordRef linkCenter;
    private RecordRef linkSection;
    private String linkLabel;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(CustomRecordTypeLinks.class, true);

    public CustomRecordTypeLinks() {
    }

    public CustomRecordTypeLinks(RecordRef linkCenter, RecordRef linkSection, String linkLabel) {
        this.linkCenter = linkCenter;
        this.linkSection = linkSection;
        this.linkLabel = linkLabel;
    }

    public RecordRef getLinkCenter() {
        return this.linkCenter;
    }

    public void setLinkCenter(RecordRef linkCenter) {
        this.linkCenter = linkCenter;
    }

    public RecordRef getLinkSection() {
        return this.linkSection;
    }

    public void setLinkSection(RecordRef linkSection) {
        this.linkSection = linkSection;
    }

    public String getLinkLabel() {
        return this.linkLabel;
    }

    public void setLinkLabel(String linkLabel) {
        this.linkLabel = linkLabel;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CustomRecordTypeLinks)) {
            return false;
        }
        CustomRecordTypeLinks other = (CustomRecordTypeLinks)obj;
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
        boolean _equals = (this.linkCenter == null && other.getLinkCenter() == null || this.linkCenter != null && this.linkCenter.equals(other.getLinkCenter())) && (this.linkSection == null && other.getLinkSection() == null || this.linkSection != null && this.linkSection.equals(other.getLinkSection())) && (this.linkLabel == null && other.getLinkLabel() == null || this.linkLabel != null && this.linkLabel.equals(other.getLinkLabel()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getLinkCenter() != null) {
            _hashCode += this.getLinkCenter().hashCode();
        }
        if (this.getLinkSection() != null) {
            _hashCode += this.getLinkSection().hashCode();
        }
        if (this.getLinkLabel() != null) {
            _hashCode += this.getLinkLabel().hashCode();
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
        typeDesc.setXmlType(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "CustomRecordTypeLinks"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("linkCenter");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "linkCenter"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("linkSection");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "linkSection"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("linkLabel");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "linkLabel"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

