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
import com.netsuite.suitetalk.proxy.v2022_1.platform.messages.ReadResponseList;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class AsyncInitializeListResult
extends AsyncResult
implements Serializable {
    private ReadResponseList readResponseList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(AsyncInitializeListResult.class, true);

    public AsyncInitializeListResult() {
    }

    public AsyncInitializeListResult(ReadResponseList readResponseList) {
        this.readResponseList = readResponseList;
    }

    public ReadResponseList getReadResponseList() {
        return this.readResponseList;
    }

    public void setReadResponseList(ReadResponseList readResponseList) {
        this.readResponseList = readResponseList;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof AsyncInitializeListResult)) {
            return false;
        }
        AsyncInitializeListResult other = (AsyncInitializeListResult)obj;
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
        boolean _equals = super.equals(obj) && (this.readResponseList == null && other.getReadResponseList() == null || this.readResponseList != null && this.readResponseList.equals(other.getReadResponseList()));
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
        if (this.getReadResponseList() != null) {
            _hashCode += this.getReadResponseList().hashCode();
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
        typeDesc.setXmlType(new QName("urn:messages_2022_1.platform.webservices.netsuite.com", "AsyncInitializeListResult"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("readResponseList");
        elemField.setXmlName(new QName("urn:messages_2022_1.platform.webservices.netsuite.com", "readResponseList"));
        elemField.setXmlType(new QName("urn:messages_2022_1.platform.webservices.netsuite.com", "ReadResponseList"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

