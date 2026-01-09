/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.axis.description.TypeDesc
 *  org.apache.axis.encoding.Deserializer
 *  org.apache.axis.encoding.SerializationContext
 *  org.apache.axis.encoding.Serializer
 *  org.apache.axis.encoding.ser.BeanDeserializer
 *  org.apache.axis.encoding.ser.BeanSerializer
 */
package com.netsuite.suitetalk.proxy.v2022_1.platform.faults;

import com.netsuite.suitetalk.proxy.v2022_1.platform.faults.SoapFault;
import com.netsuite.suitetalk.proxy.v2022_1.platform.faults.types.FaultCodeType;
import java.io.IOException;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.SerializationContext;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class InsufficientPermissionFault
extends SoapFault
implements Serializable {
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(InsufficientPermissionFault.class, true);

    public InsufficientPermissionFault() {
    }

    public InsufficientPermissionFault(FaultCodeType code, String message1) {
        super(code, message1);
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof InsufficientPermissionFault)) {
            return false;
        }
        InsufficientPermissionFault other = (InsufficientPermissionFault)obj;
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
        boolean _equals = super.equals(obj);
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

    @Override
    public void writeDetails(QName qname, SerializationContext context) throws IOException {
        context.serialize(qname, null, (Object)this);
    }

    static {
        typeDesc.setXmlType(new QName("urn:faults_2022_1.platform.webservices.netsuite.com", "InsufficientPermissionFault"));
    }
}

