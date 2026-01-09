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

import com.netsuite.suitetalk.proxy.v2022_1.platform.common.types.RecurrenceDow;
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

public class RecurrenceDowMaskList
implements Serializable {
    private RecurrenceDow[] recurrenceDowMask;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(RecurrenceDowMaskList.class, true);

    public RecurrenceDowMaskList() {
    }

    public RecurrenceDowMaskList(RecurrenceDow[] recurrenceDowMask) {
        this.recurrenceDowMask = recurrenceDowMask;
    }

    public RecurrenceDow[] getRecurrenceDowMask() {
        return this.recurrenceDowMask;
    }

    public void setRecurrenceDowMask(RecurrenceDow[] recurrenceDowMask) {
        this.recurrenceDowMask = recurrenceDowMask;
    }

    public RecurrenceDow getRecurrenceDowMask(int i) {
        return this.recurrenceDowMask[i];
    }

    public void setRecurrenceDowMask(int i, RecurrenceDow _value) {
        this.recurrenceDowMask[i] = _value;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof RecurrenceDowMaskList)) {
            return false;
        }
        RecurrenceDowMaskList other = (RecurrenceDowMaskList)obj;
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
        boolean _equals = this.recurrenceDowMask == null && other.getRecurrenceDowMask() == null || this.recurrenceDowMask != null && Arrays.equals(this.recurrenceDowMask, other.getRecurrenceDowMask());
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getRecurrenceDowMask() != null) {
            for (int i = 0; i < Array.getLength(this.getRecurrenceDowMask()); ++i) {
                Object obj = Array.get(this.getRecurrenceDowMask(), i);
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "RecurrenceDowMaskList"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("recurrenceDowMask");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "recurrenceDowMask"));
        elemField.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "RecurrenceDow"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

