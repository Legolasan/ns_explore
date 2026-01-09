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
package com.netsuite.suitetalk.proxy.v2022_1.platform.core;

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.BaseRef;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.DetachReference;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class DetachBasicReference
extends DetachReference
implements Serializable {
    private BaseRef detachedRecord;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(DetachBasicReference.class, true);

    public DetachBasicReference() {
    }

    public DetachBasicReference(BaseRef detachFrom, BaseRef detachedRecord) {
        super(detachFrom);
        this.detachedRecord = detachedRecord;
    }

    public BaseRef getDetachedRecord() {
        return this.detachedRecord;
    }

    public void setDetachedRecord(BaseRef detachedRecord) {
        this.detachedRecord = detachedRecord;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof DetachBasicReference)) {
            return false;
        }
        DetachBasicReference other = (DetachBasicReference)obj;
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
        boolean _equals = super.equals(obj) && (this.detachedRecord == null && other.getDetachedRecord() == null || this.detachedRecord != null && this.detachedRecord.equals(other.getDetachedRecord()));
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
        if (this.getDetachedRecord() != null) {
            _hashCode += this.getDetachedRecord().hashCode();
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
        typeDesc.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "DetachBasicReference"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("detachedRecord");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "detachedRecord"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "BaseRef"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

