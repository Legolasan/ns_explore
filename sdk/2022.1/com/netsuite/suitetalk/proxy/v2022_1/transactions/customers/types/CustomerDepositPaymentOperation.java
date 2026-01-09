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

public class CustomerDepositPaymentOperation
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
    public static final CustomerDepositPaymentOperation _authorization = new CustomerDepositPaymentOperation("_authorization");
    public static final CustomerDepositPaymentOperation _capture = new CustomerDepositPaymentOperation("_capture");
    public static final CustomerDepositPaymentOperation _sale = new CustomerDepositPaymentOperation("_sale");
    public static final CustomerDepositPaymentOperation _refund = new CustomerDepositPaymentOperation("_refund");
    public static final CustomerDepositPaymentOperation _credit = new CustomerDepositPaymentOperation("_credit");
    public static final CustomerDepositPaymentOperation _refresh = new CustomerDepositPaymentOperation("_refresh");
    public static final CustomerDepositPaymentOperation _void = new CustomerDepositPaymentOperation("_void");
    private static TypeDesc typeDesc = new TypeDesc(CustomerDepositPaymentOperation.class);

    protected CustomerDepositPaymentOperation(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static CustomerDepositPaymentOperation fromValue(String value) throws IllegalArgumentException {
        CustomerDepositPaymentOperation enumeration = (CustomerDepositPaymentOperation)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static CustomerDepositPaymentOperation fromString(String value) throws IllegalArgumentException {
        return CustomerDepositPaymentOperation.fromValue(value);
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
        return CustomerDepositPaymentOperation.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.customers_2022_1.transactions.webservices.netsuite.com", "CustomerDepositPaymentOperation"));
    }
}

