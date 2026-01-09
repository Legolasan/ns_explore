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
package com.netsuite.suitetalk.proxy.v2022_1.platform.core;

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.StatusDetail;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import javax.xml.namespace.QName;
import org.apache.axis.description.AttributeDesc;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class Status
implements Serializable {
    private StatusDetail[] statusDetail;
    private boolean isSuccess;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(Status.class, true);

    public Status() {
    }

    public Status(StatusDetail[] statusDetail, boolean isSuccess) {
        this.statusDetail = statusDetail;
        this.isSuccess = isSuccess;
    }

    public StatusDetail[] getStatusDetail() {
        return this.statusDetail;
    }

    public void setStatusDetail(StatusDetail[] statusDetail) {
        this.statusDetail = statusDetail;
    }

    public StatusDetail getStatusDetail(int i) {
        return this.statusDetail[i];
    }

    public void setStatusDetail(int i, StatusDetail _value) {
        this.statusDetail[i] = _value;
    }

    public boolean isIsSuccess() {
        return this.isSuccess;
    }

    public void setIsSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof Status)) {
            return false;
        }
        Status other = (Status)obj;
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
        boolean _equals = (this.statusDetail == null && other.getStatusDetail() == null || this.statusDetail != null && Arrays.equals(this.statusDetail, other.getStatusDetail())) && this.isSuccess == other.isIsSuccess();
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getStatusDetail() != null) {
            for (int i = 0; i < Array.getLength(this.getStatusDetail()); ++i) {
                Object obj = Array.get(this.getStatusDetail(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        Boolean bl = this.isIsSuccess() ? Boolean.TRUE : Boolean.FALSE;
        this.__hashCodeCalc = false;
        return _hashCode += bl.hashCode();
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
        typeDesc.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "Status"));
        AttributeDesc attrField = new AttributeDesc();
        attrField.setFieldName("isSuccess");
        attrField.setXmlName(new QName("", "isSuccess"));
        attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc((FieldDesc)attrField);
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("statusDetail");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "statusDetail"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "StatusDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

