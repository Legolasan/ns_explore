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
package com.netsuite.suitetalk.proxy.v2022_1.transactions.sales.types;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

public class SalesOrderPaymentOperation
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
    public static final SalesOrderPaymentOperation _authorization = new SalesOrderPaymentOperation("_authorization");
    public static final SalesOrderPaymentOperation _capture = new SalesOrderPaymentOperation("_capture");
    public static final SalesOrderPaymentOperation _sale = new SalesOrderPaymentOperation("_sale");
    public static final SalesOrderPaymentOperation _refund = new SalesOrderPaymentOperation("_refund");
    public static final SalesOrderPaymentOperation _credit = new SalesOrderPaymentOperation("_credit");
    public static final SalesOrderPaymentOperation _refresh = new SalesOrderPaymentOperation("_refresh");
    public static final SalesOrderPaymentOperation _void = new SalesOrderPaymentOperation("_void");
    private static TypeDesc typeDesc = new TypeDesc(SalesOrderPaymentOperation.class);

    protected SalesOrderPaymentOperation(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static SalesOrderPaymentOperation fromValue(String value) throws IllegalArgumentException {
        SalesOrderPaymentOperation enumeration = (SalesOrderPaymentOperation)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static SalesOrderPaymentOperation fromString(String value) throws IllegalArgumentException {
        return SalesOrderPaymentOperation.fromValue(value);
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
        return SalesOrderPaymentOperation.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.sales_2022_1.transactions.webservices.netsuite.com", "SalesOrderPaymentOperation"));
    }
}

