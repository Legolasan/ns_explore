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
package com.netsuite.suitetalk.proxy.v2022_1.lists.marketing;

import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class CampaignResponseResponses
implements Serializable {
    private String response;
    private String responseDate;
    private String author;
    private String note;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(CampaignResponseResponses.class, true);

    public CampaignResponseResponses() {
    }

    public CampaignResponseResponses(String response, String responseDate, String author, String note) {
        this.response = response;
        this.responseDate = responseDate;
        this.author = author;
        this.note = note;
    }

    public String getResponse() {
        return this.response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

    public String getResponseDate() {
        return this.responseDate;
    }

    public void setResponseDate(String responseDate) {
        this.responseDate = responseDate;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getNote() {
        return this.note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CampaignResponseResponses)) {
            return false;
        }
        CampaignResponseResponses other = (CampaignResponseResponses)obj;
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
        boolean _equals = (this.response == null && other.getResponse() == null || this.response != null && this.response.equals(other.getResponse())) && (this.responseDate == null && other.getResponseDate() == null || this.responseDate != null && this.responseDate.equals(other.getResponseDate())) && (this.author == null && other.getAuthor() == null || this.author != null && this.author.equals(other.getAuthor())) && (this.note == null && other.getNote() == null || this.note != null && this.note.equals(other.getNote()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getResponse() != null) {
            _hashCode += this.getResponse().hashCode();
        }
        if (this.getResponseDate() != null) {
            _hashCode += this.getResponseDate().hashCode();
        }
        if (this.getAuthor() != null) {
            _hashCode += this.getAuthor().hashCode();
        }
        if (this.getNote() != null) {
            _hashCode += this.getNote().hashCode();
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
        typeDesc.setXmlType(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "CampaignResponseResponses"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("response");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "response"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("responseDate");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "responseDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("author");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "author"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("note");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "note"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

