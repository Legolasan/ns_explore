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

public class CustomerRefundPaymentOperation
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
    public static final CustomerRefundPaymentOperation _authorization = new CustomerRefundPaymentOperation("_authorization");
    public static final CustomerRefundPaymentOperation _capture = new CustomerRefundPaymentOperation("_capture");
    public static final CustomerRefundPaymentOperation _sale = new CustomerRefundPaymentOperation("_sale");
    public static final CustomerRefundPaymentOperation _refund = new CustomerRefundPaymentOperation("_refund");
    public static final CustomerRefundPaymentOperation _credit = new CustomerRefundPaymentOperation("_credit");
    public static final CustomerRefundPaymentOperation _refresh = new CustomerRefundPaymentOperation("_refresh");
    public static final CustomerRefundPaymentOperation _void = new CustomerRefundPaymentOperation("_void");
    private static TypeDesc typeDesc = new TypeDesc(CustomerRefundPaymentOperation.class);

    protected CustomerRefundPaymentOperation(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static CustomerRefundPaymentOperation fromValue(String value) throws IllegalArgumentException {
        CustomerRefundPaymentOperation enumeration = (CustomerRefundPaymentOperation)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static CustomerRefundPaymentOperation fromString(String value) throws IllegalArgumentException {
        return CustomerRefundPaymentOperation.fromValue(value);
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
        return CustomerRefundPaymentOperation.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.customers_2022_1.transactions.webservices.netsuite.com", "CustomerRefundPaymentOperation"));
    }
}

