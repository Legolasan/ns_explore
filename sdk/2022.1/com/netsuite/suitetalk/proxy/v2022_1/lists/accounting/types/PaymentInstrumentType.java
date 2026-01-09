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

public class PaymentInstrumentType
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __paymentCard = "_paymentCard";
    public static final String __generalToken = "_generalToken";
    public static final String __paymentCardToken = "_paymentCardToken";
    public static final String __paymentCardSwipe = "_paymentCardSwipe";
    public static final String __emv = "_emv";
    public static final String __externalCheckout = "_externalCheckout";
    public static final String __cash = "_cash";
    public static final String __check = "_check";
    public static final String __offline = "_offline";
    public static final String __payByReference = "_payByReference";
    public static final String __ach = "_ach";
    public static final String __payPal = "_payPal";
    public static final PaymentInstrumentType _paymentCard = new PaymentInstrumentType("_paymentCard");
    public static final PaymentInstrumentType _generalToken = new PaymentInstrumentType("_generalToken");
    public static final PaymentInstrumentType _paymentCardToken = new PaymentInstrumentType("_paymentCardToken");
    public static final PaymentInstrumentType _paymentCardSwipe = new PaymentInstrumentType("_paymentCardSwipe");
    public static final PaymentInstrumentType _emv = new PaymentInstrumentType("_emv");
    public static final PaymentInstrumentType _externalCheckout = new PaymentInstrumentType("_externalCheckout");
    public static final PaymentInstrumentType _cash = new PaymentInstrumentType("_cash");
    public static final PaymentInstrumentType _check = new PaymentInstrumentType("_check");
    public static final PaymentInstrumentType _offline = new PaymentInstrumentType("_offline");
    public static final PaymentInstrumentType _payByReference = new PaymentInstrumentType("_payByReference");
    public static final PaymentInstrumentType _ach = new PaymentInstrumentType("_ach");
    public static final PaymentInstrumentType _payPal = new PaymentInstrumentType("_payPal");
    private static TypeDesc typeDesc = new TypeDesc(PaymentInstrumentType.class);

    protected PaymentInstrumentType(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static PaymentInstrumentType fromValue(String value) throws IllegalArgumentException {
        PaymentInstrumentType enumeration = (PaymentInstrumentType)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static PaymentInstrumentType fromString(String value) throws IllegalArgumentException {
        return PaymentInstrumentType.fromValue(value);
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
        return PaymentInstrumentType.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "PaymentInstrumentType"));
    }
}

