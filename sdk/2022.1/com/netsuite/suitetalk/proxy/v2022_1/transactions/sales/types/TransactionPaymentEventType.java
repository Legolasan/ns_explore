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

public class TransactionPaymentEventType
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __authentication = "_authentication";
    public static final String __authorization = "_authorization";
    public static final String __captureAuthorization = "_captureAuthorization";
    public static final String __credit = "_credit";
    public static final String __overrideHold = "_overrideHold";
    public static final String __refreshAuthorization = "_refreshAuthorization";
    public static final String __refund = "_refund";
    public static final String __sale = "_sale";
    public static final String __voidAuthorization = "_voidAuthorization";
    public static final TransactionPaymentEventType _authentication = new TransactionPaymentEventType("_authentication");
    public static final TransactionPaymentEventType _authorization = new TransactionPaymentEventType("_authorization");
    public static final TransactionPaymentEventType _captureAuthorization = new TransactionPaymentEventType("_captureAuthorization");
    public static final TransactionPaymentEventType _credit = new TransactionPaymentEventType("_credit");
    public static final TransactionPaymentEventType _overrideHold = new TransactionPaymentEventType("_overrideHold");
    public static final TransactionPaymentEventType _refreshAuthorization = new TransactionPaymentEventType("_refreshAuthorization");
    public static final TransactionPaymentEventType _refund = new TransactionPaymentEventType("_refund");
    public static final TransactionPaymentEventType _sale = new TransactionPaymentEventType("_sale");
    public static final TransactionPaymentEventType _voidAuthorization = new TransactionPaymentEventType("_voidAuthorization");
    private static TypeDesc typeDesc = new TypeDesc(TransactionPaymentEventType.class);

    protected TransactionPaymentEventType(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static TransactionPaymentEventType fromValue(String value) throws IllegalArgumentException {
        TransactionPaymentEventType enumeration = (TransactionPaymentEventType)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static TransactionPaymentEventType fromString(String value) throws IllegalArgumentException {
        return TransactionPaymentEventType.fromValue(value);
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
        return TransactionPaymentEventType.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.sales_2022_1.transactions.webservices.netsuite.com", "TransactionPaymentEventType"));
    }
}

