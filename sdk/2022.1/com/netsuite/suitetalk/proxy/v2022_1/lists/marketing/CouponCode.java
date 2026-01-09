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
package com.netsuite.suitetalk.proxy.v2022_1.lists.marketing;

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.NullField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.Record;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import java.io.Serializable;
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

public class CouponCode
extends Record
implements Serializable {
    private RecordRef promotion;
    private String code;
    private RecordRef recipient;
    private Calendar dateSent;
    private Boolean used;
    private Long useCount;
    private String internalId;
    private String externalId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(CouponCode.class, true);

    public CouponCode() {
    }

    public CouponCode(NullField nullFieldList, String internalId, String externalId, RecordRef promotion, String code, RecordRef recipient, Calendar dateSent, Boolean used, Long useCount) {
        super(nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.promotion = promotion;
        this.code = code;
        this.recipient = recipient;
        this.dateSent = dateSent;
        this.used = used;
        this.useCount = useCount;
    }

    public RecordRef getPromotion() {
        return this.promotion;
    }

    public void setPromotion(RecordRef promotion) {
        this.promotion = promotion;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public RecordRef getRecipient() {
        return this.recipient;
    }

    public void setRecipient(RecordRef recipient) {
        this.recipient = recipient;
    }

    public Calendar getDateSent() {
        return this.dateSent;
    }

    public void setDateSent(Calendar dateSent) {
        this.dateSent = dateSent;
    }

    public Boolean getUsed() {
        return this.used;
    }

    public void setUsed(Boolean used) {
        this.used = used;
    }

    public Long getUseCount() {
        return this.useCount;
    }

    public void setUseCount(Long useCount) {
        this.useCount = useCount;
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
        if (!(obj instanceof CouponCode)) {
            return false;
        }
        CouponCode other = (CouponCode)obj;
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
        boolean _equals = super.equals(obj) && (this.promotion == null && other.getPromotion() == null || this.promotion != null && this.promotion.equals(other.getPromotion())) && (this.code == null && other.getCode() == null || this.code != null && this.code.equals(other.getCode())) && (this.recipient == null && other.getRecipient() == null || this.recipient != null && this.recipient.equals(other.getRecipient())) && (this.dateSent == null && other.getDateSent() == null || this.dateSent != null && this.dateSent.equals(other.getDateSent())) && (this.used == null && other.getUsed() == null || this.used != null && this.used.equals(other.getUsed())) && (this.useCount == null && other.getUseCount() == null || this.useCount != null && this.useCount.equals(other.getUseCount())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
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
        if (this.getPromotion() != null) {
            _hashCode += this.getPromotion().hashCode();
        }
        if (this.getCode() != null) {
            _hashCode += this.getCode().hashCode();
        }
        if (this.getRecipient() != null) {
            _hashCode += this.getRecipient().hashCode();
        }
        if (this.getDateSent() != null) {
            _hashCode += this.getDateSent().hashCode();
        }
        if (this.getUsed() != null) {
            _hashCode += this.getUsed().hashCode();
        }
        if (this.getUseCount() != null) {
            _hashCode += this.getUseCount().hashCode();
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
        typeDesc.setXmlType(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "CouponCode"));
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
        elemField.setFieldName("promotion");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "promotion"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "code"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recipient");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "recipient"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("dateSent");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "dateSent"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("used");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "used"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("useCount");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "useCount"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

