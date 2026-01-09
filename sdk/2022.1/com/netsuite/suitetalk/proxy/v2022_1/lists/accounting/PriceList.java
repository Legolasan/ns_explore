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
package com.netsuite.suitetalk.proxy.v2022_1.lists.accounting;

import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.Price;
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

public class PriceList
implements Serializable {
    private Price[] price;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(PriceList.class, true);

    public PriceList() {
    }

    public PriceList(Price[] price) {
        this.price = price;
    }

    public Price[] getPrice() {
        return this.price;
    }

    public void setPrice(Price[] price) {
        this.price = price;
    }

    public Price getPrice(int i) {
        return this.price[i];
    }

    public void setPrice(int i, Price _value) {
        this.price[i] = _value;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PriceList)) {
            return false;
        }
        PriceList other = (PriceList)obj;
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
        boolean _equals = this.price == null && other.getPrice() == null || this.price != null && Arrays.equals(this.price, other.getPrice());
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getPrice() != null) {
            for (int i = 0; i < Array.getLength(this.getPrice()); ++i) {
                Object obj = Array.get(this.getPrice(), i);
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
        typeDesc.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "PriceList"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "price"));
        elemField.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "Price"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

