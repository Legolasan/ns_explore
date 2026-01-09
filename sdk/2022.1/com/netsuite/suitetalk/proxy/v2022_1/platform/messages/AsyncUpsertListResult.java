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
package com.netsuite.suitetalk.proxy.v2022_1.platform.messages;

import com.netsuite.suitetalk.proxy.v2022_1.platform.messages.AsyncResult;
import com.netsuite.suitetalk.proxy.v2022_1.platform.messages.WriteResponseList;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class AsyncUpsertListResult
extends AsyncResult
implements Serializable {
    private WriteResponseList writeResponseList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(AsyncUpsertListResult.class, true);

    public AsyncUpsertListResult() {
    }

    public AsyncUpsertListResult(WriteResponseList writeResponseList) {
        this.writeResponseList = writeResponseList;
    }

    public WriteResponseList getWriteResponseList() {
        return this.writeResponseList;
    }

    public void setWriteResponseList(WriteResponseList writeResponseList) {
        this.writeResponseList = writeResponseList;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof AsyncUpsertListResult)) {
            return false;
        }
        AsyncUpsertListResult other = (AsyncUpsertListResult)obj;
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
        boolean _equals = super.equals(obj) && (this.writeResponseList == null && other.getWriteResponseList() == null || this.writeResponseList != null && this.writeResponseList.equals(other.getWriteResponseList()));
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
        if (this.getWriteResponseList() != null) {
            _hashCode += this.getWriteResponseList().hashCode();
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
        typeDesc.setXmlType(new QName("urn:messages_2022_1.platform.webservices.netsuite.com", "AsyncUpsertListResult"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("writeResponseList");
        elemField.setXmlName(new QName("urn:messages_2022_1.platform.webservices.netsuite.com", "writeResponseList"));
        elemField.setXmlType(new QName("urn:messages_2022_1.platform.webservices.netsuite.com", "WriteResponseList"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

