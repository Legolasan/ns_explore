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

public class PaymentCardBrand
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __amex = "_amex";
    public static final String __cirrus = "_cirrus";
    public static final String __dinersClub = "_dinersClub";
    public static final String __discover = "_discover";
    public static final String __jcb = "_jcb";
    public static final String __laser = "_laser";
    public static final String __localCard = "_localCard";
    public static final String __maestro = "_maestro";
    public static final String __masterCard = "_masterCard";
    public static final String __solo = "_solo";
    public static final String __unionPay = "_unionPay";
    public static final String __visa = "_visa";
    public static final PaymentCardBrand _amex = new PaymentCardBrand("_amex");
    public static final PaymentCardBrand _cirrus = new PaymentCardBrand("_cirrus");
    public static final PaymentCardBrand _dinersClub = new PaymentCardBrand("_dinersClub");
    public static final PaymentCardBrand _discover = new PaymentCardBrand("_discover");
    public static final PaymentCardBrand _jcb = new PaymentCardBrand("_jcb");
    public static final PaymentCardBrand _laser = new PaymentCardBrand("_laser");
    public static final PaymentCardBrand _localCard = new PaymentCardBrand("_localCard");
    public static final PaymentCardBrand _maestro = new PaymentCardBrand("_maestro");
    public static final PaymentCardBrand _masterCard = new PaymentCardBrand("_masterCard");
    public static final PaymentCardBrand _solo = new PaymentCardBrand("_solo");
    public static final PaymentCardBrand _unionPay = new PaymentCardBrand("_unionPay");
    public static final PaymentCardBrand _visa = new PaymentCardBrand("_visa");
    private static TypeDesc typeDesc = new TypeDesc(PaymentCardBrand.class);

    protected PaymentCardBrand(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static PaymentCardBrand fromValue(String value) throws IllegalArgumentException {
        PaymentCardBrand enumeration = (PaymentCardBrand)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static PaymentCardBrand fromString(String value) throws IllegalArgumentException {
        return PaymentCardBrand.fromValue(value);
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
        return PaymentCardBrand.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "PaymentCardBrand"));
    }
}

