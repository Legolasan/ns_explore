/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.axis.description.TypeDesc
 *  org.apache.axis.encoding.Deserializer
 *  org.apache.axis.encoding.Serializer
 *  org.apache.axis.encoding.ser.EnumDeserializer
 *  org.apache.axis.encoding.ser.EnumSerializer
 */
package com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.types;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

public class TokenFamily
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __adyen = "_adyen";
    public static final String __altaPay = "_altaPay";
    public static final String __cyberSource = "_cyberSource";
    public static final String __eway = "_eway";
    public static final String __freedomPay = "_freedomPay";
    public static final String __merchantESolutions = "_merchantESolutions";
    public static final String __payCorp = "_payCorp";
    public static final String __payu = "_payu";
    public static final String __securePay = "_securePay";
    public static final String __soluPay = "_soluPay";
    public static final String __vantivPayments = "_vantivPayments";
    public static final TokenFamily _adyen = new TokenFamily("_adyen");
    public static final TokenFamily _altaPay = new TokenFamily("_altaPay");
    public static final TokenFamily _cyberSource = new TokenFamily("_cyberSource");
    public static final TokenFamily _eway = new TokenFamily("_eway");
    public static final TokenFamily _freedomPay = new TokenFamily("_freedomPay");
    public static final TokenFamily _merchantESolutions = new TokenFamily("_merchantESolutions");
    public static final TokenFamily _payCorp = new TokenFamily("_payCorp");
    public static final TokenFamily _payu = new TokenFamily("_payu");
    public static final TokenFamily _securePay = new TokenFamily("_securePay");
    public static final TokenFamily _soluPay = new TokenFamily("_soluPay");
    public static final TokenFamily _vantivPayments = new TokenFamily("_vantivPayments");
    private static TypeDesc typeDesc = new TypeDesc(TokenFamily.class);

    protected TokenFamily(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static TokenFamily fromValue(String value) throws IllegalArgumentException {
        TokenFamily enumeration = (TokenFamily)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static TokenFamily fromString(String value) throws IllegalArgumentException {
        return TokenFamily.fromValue(value);
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return this.toString().hashCode();
    }

    public String toString() {
        return this._value_;
    }

    public Object readResolve() throws ObjectStreamException {
        return TokenFamily.fromValue(this._value_);
    }

    public static Serializer getSerializer(String mechType, Class _javaType, QName _xmlType) {
        return new EnumSerializer(_javaType, _xmlType);
    }

    public static Deserializer getDeserializer(String mechType, Class _javaType, QName _xmlType) {
        return new EnumDeserializer(_javaType, _xmlType);
    }

    public static TypeDesc getTypeDesc() {
        return typeDesc;
    }

    static {
        typeDesc.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "TokenFamily"));
    }
}

