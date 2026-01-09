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
package com.netsuite.suitetalk.proxy.v2022_1.transactions.customers.types;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

public class CashRefundPaymentOperation
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __authorization = "_authorization";
    public static final String __capture = "_capture";
    public static final String __sale = "_sale";
    public static final String __refund = "_refund";
    public static final String __credit = "_credit";
    public static final String __refresh = "_refresh";
    public static final String __void = "_void";
    public static final CashRefundPaymentOperation _authorization = new CashRefundPaymentOperation("_authorization");
    public static final CashRefundPaymentOperation _capture = new CashRefundPaymentOperation("_capture");
    public static final CashRefundPaymentOperation _sale = new CashRefundPaymentOperation("_sale");
    public static final CashRefundPaymentOperation _refund = new CashRefundPaymentOperation("_refund");
    public static final CashRefundPaymentOperation _credit = new CashRefundPaymentOperation("_credit");
    public static final CashRefundPaymentOperation _refresh = new CashRefundPaymentOperation("_refresh");
    public static final CashRefundPaymentOperation _void = new CashRefundPaymentOperation("_void");
    private static TypeDesc typeDesc = new TypeDesc(CashRefundPaymentOperation.class);

    protected CashRefundPaymentOperation(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static CashRefundPaymentOperation fromValue(String value) throws IllegalArgumentException {
        CashRefundPaymentOperation enumeration = (CashRefundPaymentOperation)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static CashRefundPaymentOperation fromString(String value) throws IllegalArgumentException {
        return CashRefundPaymentOperation.fromValue(value);
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
        return CashRefundPaymentOperation.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.customers_2022_1.transactions.webservices.netsuite.com", "CashRefundPaymentOperation"));
    }
}

