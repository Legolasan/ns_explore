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

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnEnumSelectField;
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

public class PaymentOptionSearchRowBasic
extends SearchRowBasic
implements Serializable {
    private SearchColumnSelectField[] internalId;
    private SearchColumnStringField[] mask;
    private SearchColumnEnumSelectField[] paymentInstrumentType;
    private SearchColumnSelectField[] paymentMethod;
    private SearchColumnStringField[] preserveOnFile;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(PaymentOptionSearchRowBasic.class, true);

    public PaymentOptionSearchRowBasic() {
    }

    public PaymentOptionSearchRowBasic(SearchColumnSelectField[] internalId, SearchColumnStringField[] mask, SearchColumnEnumSelectField[] paymentInstrumentType, SearchColumnSelectField[] paymentMethod, SearchColumnStringField[] preserveOnFile) {
        this.internalId = internalId;
        this.mask = mask;
        this.paymentInstrumentType = paymentInstrumentType;
        this.paymentMethod = paymentMethod;
        this.preserveOnFile = preserveOnFile;
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

    public SearchColumnStringField[] getMask() {
        return this.mask;
    }

    public void setMask(SearchColumnStringField[] mask) {
        this.mask = mask;
    }

    public SearchColumnStringField getMask(int i) {
        return this.mask[i];
    }

    public void setMask(int i, SearchColumnStringField _value) {
        this.mask[i] = _value;
    }

    public SearchColumnEnumSelectField[] getPaymentInstrumentType() {
        return this.paymentInstrumentType;
    }

    public void setPaymentInstrumentType(SearchColumnEnumSelectField[] paymentInstrumentType) {
        this.paymentInstrumentType = paymentInstrumentType;
    }

    public SearchColumnEnumSelectField getPaymentInstrumentType(int i) {
        return this.paymentInstrumentType[i];
    }

    public void setPaymentInstrumentType(int i, SearchColumnEnumSelectField _value) {
        this.paymentInstrumentType[i] = _value;
    }

    public SearchColumnSelectField[] getPaymentMethod() {
        return this.paymentMethod;
    }

    public void setPaymentMethod(SearchColumnSelectField[] paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public SearchColumnSelectField getPaymentMethod(int i) {
        return this.paymentMethod[i];
    }

    public void setPaymentMethod(int i, SearchColumnSelectField _value) {
        this.paymentMethod[i] = _value;
    }

    public SearchColumnStringField[] getPreserveOnFile() {
        return this.preserveOnFile;
    }

    public void setPreserveOnFile(SearchColumnStringField[] preserveOnFile) {
        this.preserveOnFile = preserveOnFile;
    }

    public SearchColumnStringField getPreserveOnFile(int i) {
        return this.preserveOnFile[i];
    }

    public void setPreserveOnFile(int i, SearchColumnStringField _value) {
        this.preserveOnFile[i] = _value;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PaymentOptionSearchRowBasic)) {
            return false;
        }
        PaymentOptionSearchRowBasic other = (PaymentOptionSearchRowBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && Arrays.equals(this.internalId, other.getInternalId())) && (this.mask == null && other.getMask() == null || this.mask != null && Arrays.equals(this.mask, other.getMask())) && (this.paymentInstrumentType == null && other.getPaymentInstrumentType() == null || this.paymentInstrumentType != null && Arrays.equals(this.paymentInstrumentType, other.getPaymentInstrumentType())) && (this.paymentMethod == null && other.getPaymentMethod() == null || this.paymentMethod != null && Arrays.equals(this.paymentMethod, other.getPaymentMethod())) && (this.preserveOnFile == null && other.getPreserveOnFile() == null || this.preserveOnFile != null && Arrays.equals(this.preserveOnFile, other.getPreserveOnFile()));
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
        if (this.getInternalId() != null) {
            for (i = 0; i < Array.getLength(this.getInternalId()); ++i) {
                obj = Array.get(this.getInternalId(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getMask() != null) {
            for (i = 0; i < Array.getLength(this.getMask()); ++i) {
                obj = Array.get(this.getMask(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPaymentInstrumentType() != null) {
            for (i = 0; i < Array.getLength(this.getPaymentInstrumentType()); ++i) {
                obj = Array.get(this.getPaymentInstrumentType(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPaymentMethod() != null) {
            for (i = 0; i < Array.getLength(this.getPaymentMethod()); ++i) {
                obj = Array.get(this.getPaymentMethod(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPreserveOnFile() != null) {
            for (i = 0; i < Array.getLength(this.getPreserveOnFile()); ++i) {
                obj = Array.get(this.getPreserveOnFile(), i);
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "PaymentOptionSearchRowBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("mask");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "mask"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("paymentInstrumentType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "paymentInstrumentType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("paymentMethod");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "paymentMethod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("preserveOnFile");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "preserveOnFile"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

