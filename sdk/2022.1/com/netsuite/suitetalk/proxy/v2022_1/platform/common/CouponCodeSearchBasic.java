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

public class CouponCodeSearchBasic
extends SearchRecordBasic
implements Serializable {
    private SearchStringField code;
    private SearchDateField dateSent;
    private SearchMultiSelectField externalId;
    private SearchStringField externalIdString;
    private SearchLongField id;
    private SearchMultiSelectField internalId;
    private SearchLongField internalIdNumber;
    private SearchMultiSelectField promotion;
    private SearchMultiSelectField recipient;
    private SearchLongField useCount;
    private SearchBooleanField used;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(CouponCodeSearchBasic.class, true);

    public CouponCodeSearchBasic() {
    }

    public CouponCodeSearchBasic(SearchStringField code, SearchDateField dateSent, SearchMultiSelectField externalId, SearchStringField externalIdString, SearchLongField id, SearchMultiSelectField internalId, SearchLongField internalIdNumber, SearchMultiSelectField promotion, SearchMultiSelectField recipient, SearchLongField useCount, SearchBooleanField used) {
        this.code = code;
        this.dateSent = dateSent;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.id = id;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.promotion = promotion;
        this.recipient = recipient;
        this.useCount = useCount;
        this.used = used;
    }

    public SearchStringField getCode() {
        return this.code;
    }

    public void setCode(SearchStringField code) {
        this.code = code;
    }

    public SearchDateField getDateSent() {
        return this.dateSent;
    }

    public void setDateSent(SearchDateField dateSent) {
        this.dateSent = dateSent;
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

    public SearchLongField getId() {
        return this.id;
    }

    public void setId(SearchLongField id) {
        this.id = id;
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

    public SearchMultiSelectField getPromotion() {
        return this.promotion;
    }

    public void setPromotion(SearchMultiSelectField promotion) {
        this.promotion = promotion;
    }

    public SearchMultiSelectField getRecipient() {
        return this.recipient;
    }

    public void setRecipient(SearchMultiSelectField recipient) {
        this.recipient = recipient;
    }

    public SearchLongField getUseCount() {
        return this.useCount;
    }

    public void setUseCount(SearchLongField useCount) {
        this.useCount = useCount;
    }

    public SearchBooleanField getUsed() {
        return this.used;
    }

    public void setUsed(SearchBooleanField used) {
        this.used = used;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CouponCodeSearchBasic)) {
            return false;
        }
        CouponCodeSearchBasic other = (CouponCodeSearchBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.code == null && other.getCode() == null || this.code != null && this.code.equals(other.getCode())) && (this.dateSent == null && other.getDateSent() == null || this.dateSent != null && this.dateSent.equals(other.getDateSent())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId())) && (this.externalIdString == null && other.getExternalIdString() == null || this.externalIdString != null && this.externalIdString.equals(other.getExternalIdString())) && (this.id == null && other.getId() == null || this.id != null && this.id.equals(other.getId())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.internalIdNumber == null && other.getInternalIdNumber() == null || this.internalIdNumber != null && this.internalIdNumber.equals(other.getInternalIdNumber())) && (this.promotion == null && other.getPromotion() == null || this.promotion != null && this.promotion.equals(other.getPromotion())) && (this.recipient == null && other.getRecipient() == null || this.recipient != null && this.recipient.equals(other.getRecipient())) && (this.useCount == null && other.getUseCount() == null || this.useCount != null && this.useCount.equals(other.getUseCount())) && (this.used == null && other.getUsed() == null || this.used != null && this.used.equals(other.getUsed()));
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
        if (this.getCode() != null) {
            _hashCode += this.getCode().hashCode();
        }
        if (this.getDateSent() != null) {
            _hashCode += this.getDateSent().hashCode();
        }
        if (this.getExternalId() != null) {
            _hashCode += this.getExternalId().hashCode();
        }
        if (this.getExternalIdString() != null) {
            _hashCode += this.getExternalIdString().hashCode();
        }
        if (this.getId() != null) {
            _hashCode += this.getId().hashCode();
        }
        if (this.getInternalId() != null) {
            _hashCode += this.getInternalId().hashCode();
        }
        if (this.getInternalIdNumber() != null) {
            _hashCode += this.getInternalIdNumber().hashCode();
        }
        if (this.getPromotion() != null) {
            _hashCode += this.getPromotion().hashCode();
        }
        if (this.getRecipient() != null) {
            _hashCode += this.getRecipient().hashCode();
        }
        if (this.getUseCount() != null) {
            _hashCode += this.getUseCount().hashCode();
        }
        if (this.getUsed() != null) {
            _hashCode += this.getUsed().hashCode();
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "CouponCodeSearchBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "code"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("dateSent");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "dateSent"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
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
        elemField.setFieldName("id");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "id"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
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
        elemField.setFieldName("promotion");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "promotion"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recipient");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "recipient"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("useCount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "useCount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("used");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "used"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

