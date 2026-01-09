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

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.CurrencyRate;
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

public class CurrencyRateList
implements Serializable {
    private CurrencyRate[] currencyRate;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(CurrencyRateList.class, true);

    public CurrencyRateList() {
    }

    public CurrencyRateList(CurrencyRate[] currencyRate) {
        this.currencyRate = currencyRate;
    }

    public CurrencyRate[] getCurrencyRate() {
        return this.currencyRate;
    }

    public void setCurrencyRate(CurrencyRate[] currencyRate) {
        this.currencyRate = currencyRate;
    }

    public CurrencyRate getCurrencyRate(int i) {
        return this.currencyRate[i];
    }

    public void setCurrencyRate(int i, CurrencyRate _value) {
        this.currencyRate[i] = _value;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CurrencyRateList)) {
            return false;
        }
        CurrencyRateList other = (CurrencyRateList)obj;
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
        boolean _equals = this.currencyRate == null && other.getCurrencyRate() == null || this.currencyRate != null && Arrays.equals(this.currencyRate, other.getCurrencyRate());
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getCurrencyRate() != null) {
            for (int i = 0; i < Array.getLength(this.getCurrencyRate()); ++i) {
                Object obj = Array.get(this.getCurrencyRate(), i);
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
        typeDesc.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "CurrencyRateList"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("currencyRate");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "currencyRate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "CurrencyRate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

