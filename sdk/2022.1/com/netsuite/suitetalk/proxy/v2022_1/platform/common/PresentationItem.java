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

import com.netsuite.suitetalk.proxy.v2022_1.platform.common.types.PresentationItemType;
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

public class PresentationItem
implements Serializable {
    private RecordRef item;
    private PresentationItemType itemType;
    private String description;
    private Double onlinePrice;
    private Double basePrice;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(PresentationItem.class, true);

    public PresentationItem() {
    }

    public PresentationItem(RecordRef item, PresentationItemType itemType, String description, Double onlinePrice, Double basePrice) {
        this.item = item;
        this.itemType = itemType;
        this.description = description;
        this.onlinePrice = onlinePrice;
        this.basePrice = basePrice;
    }

    public RecordRef getItem() {
        return this.item;
    }

    public void setItem(RecordRef item) {
        this.item = item;
    }

    public PresentationItemType getItemType() {
        return this.itemType;
    }

    public void setItemType(PresentationItemType itemType) {
        this.itemType = itemType;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getOnlinePrice() {
        return this.onlinePrice;
    }

    public void setOnlinePrice(Double onlinePrice) {
        this.onlinePrice = onlinePrice;
    }

    public Double getBasePrice() {
        return this.basePrice;
    }

    public void setBasePrice(Double basePrice) {
        this.basePrice = basePrice;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PresentationItem)) {
            return false;
        }
        PresentationItem other = (PresentationItem)obj;
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
        boolean _equals = (this.item == null && other.getItem() == null || this.item != null && this.item.equals(other.getItem())) && (this.itemType == null && other.getItemType() == null || this.itemType != null && this.itemType.equals(other.getItemType())) && (this.description == null && other.getDescription() == null || this.description != null && this.description.equals(other.getDescription())) && (this.onlinePrice == null && other.getOnlinePrice() == null || this.onlinePrice != null && this.onlinePrice.equals(other.getOnlinePrice())) && (this.basePrice == null && other.getBasePrice() == null || this.basePrice != null && this.basePrice.equals(other.getBasePrice()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getItem() != null) {
            _hashCode += this.getItem().hashCode();
        }
        if (this.getItemType() != null) {
            _hashCode += this.getItemType().hashCode();
        }
        if (this.getDescription() != null) {
            _hashCode += this.getDescription().hashCode();
        }
        if (this.getOnlinePrice() != null) {
            _hashCode += this.getOnlinePrice().hashCode();
        }
        if (this.getBasePrice() != null) {
            _hashCode += this.getBasePrice().hashCode();
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "PresentationItem"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "itemType"));
        elemField.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "PresentationItemType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "description"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("onlinePrice");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "onlinePrice"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("basePrice");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "basePrice"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

