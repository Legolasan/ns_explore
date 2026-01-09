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

public class CouponCodeSearchRowBasic
extends SearchRowBasic
implements Serializable {
    private SearchColumnStringField[] code;
    private SearchColumnDateField[] dateSent;
    private SearchColumnSelectField[] externalId;
    private SearchColumnLongField[] id;
    private SearchColumnSelectField[] internalId;
    private SearchColumnStringField[] promotion;
    private SearchColumnStringField[] recipient;
    private SearchColumnLongField[] useCount;
    private SearchColumnBooleanField[] used;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(CouponCodeSearchRowBasic.class, true);

    public CouponCodeSearchRowBasic() {
    }

    public CouponCodeSearchRowBasic(SearchColumnStringField[] code, SearchColumnDateField[] dateSent, SearchColumnSelectField[] externalId, SearchColumnLongField[] id, SearchColumnSelectField[] internalId, SearchColumnStringField[] promotion, SearchColumnStringField[] recipient, SearchColumnLongField[] useCount, SearchColumnBooleanField[] used) {
        this.code = code;
        this.dateSent = dateSent;
        this.externalId = externalId;
        this.id = id;
        this.internalId = internalId;
        this.promotion = promotion;
        this.recipient = recipient;
        this.useCount = useCount;
        this.used = used;
    }

    public SearchColumnStringField[] getCode() {
        return this.code;
    }

    public void setCode(SearchColumnStringField[] code) {
        this.code = code;
    }

    public SearchColumnStringField getCode(int i) {
        return this.code[i];
    }

    public void setCode(int i, SearchColumnStringField _value) {
        this.code[i] = _value;
    }

    public SearchColumnDateField[] getDateSent() {
        return this.dateSent;
    }

    public void setDateSent(SearchColumnDateField[] dateSent) {
        this.dateSent = dateSent;
    }

    public SearchColumnDateField getDateSent(int i) {
        return this.dateSent[i];
    }

    public void setDateSent(int i, SearchColumnDateField _value) {
        this.dateSent[i] = _value;
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

    public SearchColumnLongField[] getId() {
        return this.id;
    }

    public void setId(SearchColumnLongField[] id) {
        this.id = id;
    }

    public SearchColumnLongField getId(int i) {
        return this.id[i];
    }

    public void setId(int i, SearchColumnLongField _value) {
        this.id[i] = _value;
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

    public SearchColumnStringField[] getPromotion() {
        return this.promotion;
    }

    public void setPromotion(SearchColumnStringField[] promotion) {
        this.promotion = promotion;
    }

    public SearchColumnStringField getPromotion(int i) {
        return this.promotion[i];
    }

    public void setPromotion(int i, SearchColumnStringField _value) {
        this.promotion[i] = _value;
    }

    public SearchColumnStringField[] getRecipient() {
        return this.recipient;
    }

    public void setRecipient(SearchColumnStringField[] recipient) {
        this.recipient = recipient;
    }

    public SearchColumnStringField getRecipient(int i) {
        return this.recipient[i];
    }

    public void setRecipient(int i, SearchColumnStringField _value) {
        this.recipient[i] = _value;
    }

    public SearchColumnLongField[] getUseCount() {
        return this.useCount;
    }

    public void setUseCount(SearchColumnLongField[] useCount) {
        this.useCount = useCount;
    }

    public SearchColumnLongField getUseCount(int i) {
        return this.useCount[i];
    }

    public void setUseCount(int i, SearchColumnLongField _value) {
        this.useCount[i] = _value;
    }

    public SearchColumnBooleanField[] getUsed() {
        return this.used;
    }

    public void setUsed(SearchColumnBooleanField[] used) {
        this.used = used;
    }

    public SearchColumnBooleanField getUsed(int i) {
        return this.used[i];
    }

    public void setUsed(int i, SearchColumnBooleanField _value) {
        this.used[i] = _value;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CouponCodeSearchRowBasic)) {
            return false;
        }
        CouponCodeSearchRowBasic other = (CouponCodeSearchRowBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.code == null && other.getCode() == null || this.code != null && Arrays.equals(this.code, other.getCode())) && (this.dateSent == null && other.getDateSent() == null || this.dateSent != null && Arrays.equals(this.dateSent, other.getDateSent())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && Arrays.equals(this.externalId, other.getExternalId())) && (this.id == null && other.getId() == null || this.id != null && Arrays.equals(this.id, other.getId())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && Arrays.equals(this.internalId, other.getInternalId())) && (this.promotion == null && other.getPromotion() == null || this.promotion != null && Arrays.equals(this.promotion, other.getPromotion())) && (this.recipient == null && other.getRecipient() == null || this.recipient != null && Arrays.equals(this.recipient, other.getRecipient())) && (this.useCount == null && other.getUseCount() == null || this.useCount != null && Arrays.equals(this.useCount, other.getUseCount())) && (this.used == null && other.getUsed() == null || this.used != null && Arrays.equals(this.used, other.getUsed()));
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
        if (this.getCode() != null) {
            for (i = 0; i < Array.getLength(this.getCode()); ++i) {
                obj = Array.get(this.getCode(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDateSent() != null) {
            for (i = 0; i < Array.getLength(this.getDateSent()); ++i) {
                obj = Array.get(this.getDateSent(), i);
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
        if (this.getId() != null) {
            for (i = 0; i < Array.getLength(this.getId()); ++i) {
                obj = Array.get(this.getId(), i);
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
        if (this.getPromotion() != null) {
            for (i = 0; i < Array.getLength(this.getPromotion()); ++i) {
                obj = Array.get(this.getPromotion(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRecipient() != null) {
            for (i = 0; i < Array.getLength(this.getRecipient()); ++i) {
                obj = Array.get(this.getRecipient(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getUseCount() != null) {
            for (i = 0; i < Array.getLength(this.getUseCount()); ++i) {
                obj = Array.get(this.getUseCount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getUsed() != null) {
            for (i = 0; i < Array.getLength(this.getUsed()); ++i) {
                obj = Array.get(this.getUsed(), i);
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "CouponCodeSearchRowBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "code"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("dateSent");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "dateSent"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
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
        elemField.setFieldName("id");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "id"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
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
        elemField.setFieldName("promotion");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "promotion"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recipient");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "recipient"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("useCount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "useCount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("used");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "used"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

