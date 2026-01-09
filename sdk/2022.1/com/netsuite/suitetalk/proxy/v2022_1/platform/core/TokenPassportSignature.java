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
 *  org.apache.axis.encoding.SimpleType
 *  org.apache.axis.encoding.ser.SimpleDeserializer
 *  org.apache.axis.encoding.ser.SimpleSerializer
 */
package com.netsuite.suitetalk.proxy.v2022_1.platform.core;

import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.AttributeDesc;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.SimpleType;
import org.apache.axis.encoding.ser.SimpleDeserializer;
import org.apache.axis.encoding.ser.SimpleSerializer;

public class TokenPassportSignature
implements Serializable,
SimpleType {
    private String _value;
    private String algorithm;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(TokenPassportSignature.class, true);

    public TokenPassportSignature() {
    }

    public TokenPassportSignature(String _value) {
        this._value = _value;
    }

    public String toString() {
        return this._value;
    }

    public String get_value() {
        return this._value;
    }

    public void set_value(String _value) {
        this._value = _value;
    }

    public String getAlgorithm() {
        return this.algorithm;
    }

    public void setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TokenPassportSignature)) {
            return false;
        }
        TokenPassportSignature other = (TokenPassportSignature)obj;
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
        boolean _equals = (this._value == null && other.get_value() == null || this._value != null && this._value.equals(other.get_value())) && (this.algorithm == null && other.getAlgorithm() == null || this.algorithm != null && this.algorithm.equals(other.getAlgorithm()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.get_value() != null) {
            _hashCode += this.get_value().hashCode();
        }
        if (this.getAlgorithm() != null) {
            _hashCode += this.getAlgorithm().hashCode();
        }
        this.__hashCodeCalc = false;
        return _hashCode;
    }

    public static TypeDesc getTypeDesc() {
        return typeDesc;
    }

    public static Serializer getSerializer(String mechType, Class _javaType, QName _xmlType) {
        return new SimpleSerializer(_javaType, _xmlType, typeDesc);
    }

    public static Deserializer getDeserializer(String mechType, Class _javaType, QName _xmlType) {
        return new SimpleDeserializer(_javaType, _xmlType, typeDesc);
    }

    static {
        typeDesc.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "TokenPassportSignature"));
        AttributeDesc attrField = new AttributeDesc();
        attrField.setFieldName("algorithm");
        attrField.setXmlName(new QName("", "algorithm"));
        attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc((FieldDesc)attrField);
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("_value");
        elemField.setXmlName(new QName("", "_value"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

