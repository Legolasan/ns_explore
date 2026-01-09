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

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
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

public class RecordRefList
implements Serializable {
    private RecordRef[] recordRef;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(RecordRefList.class, true);

    public RecordRefList() {
    }

    public RecordRefList(RecordRef[] recordRef) {
        this.recordRef = recordRef;
    }

    public RecordRef[] getRecordRef() {
        return this.recordRef;
    }

    public void setRecordRef(RecordRef[] recordRef) {
        this.recordRef = recordRef;
    }

    public RecordRef getRecordRef(int i) {
        return this.recordRef[i];
    }

    public void setRecordRef(int i, RecordRef _value) {
        this.recordRef[i] = _value;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof RecordRefList)) {
            return false;
        }
        RecordRefList other = (RecordRefList)obj;
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
        boolean _equals = this.recordRef == null && other.getRecordRef() == null || this.recordRef != null && Arrays.equals(this.recordRef, other.getRecordRef());
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getRecordRef() != null) {
            for (int i = 0; i < Array.getLength(this.getRecordRef()); ++i) {
                Object obj = Array.get(this.getRecordRef(), i);
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
        typeDesc.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRefList"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("recordRef");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "recordRef"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

