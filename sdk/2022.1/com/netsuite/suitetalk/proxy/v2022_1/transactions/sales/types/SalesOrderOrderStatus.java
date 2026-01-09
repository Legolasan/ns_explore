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

public class SalesOrderOrderStatus
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __pendingApproval = "_pendingApproval";
    public static final String __pendingFulfillment = "_pendingFulfillment";
    public static final String __cancelled = "_cancelled";
    public static final String __partiallyFulfilled = "_partiallyFulfilled";
    public static final String __pendingBillingPartFulfilled = "_pendingBillingPartFulfilled";
    public static final String __pendingBilling = "_pendingBilling";
    public static final String __fullyBilled = "_fullyBilled";
    public static final String __closed = "_closed";
    public static final String __undefined = "_undefined";
    public static final SalesOrderOrderStatus _pendingApproval = new SalesOrderOrderStatus("_pendingApproval");
    public static final SalesOrderOrderStatus _pendingFulfillment = new SalesOrderOrderStatus("_pendingFulfillment");
    public static final SalesOrderOrderStatus _cancelled = new SalesOrderOrderStatus("_cancelled");
    public static final SalesOrderOrderStatus _partiallyFulfilled = new SalesOrderOrderStatus("_partiallyFulfilled");
    public static final SalesOrderOrderStatus _pendingBillingPartFulfilled = new SalesOrderOrderStatus("_pendingBillingPartFulfilled");
    public static final SalesOrderOrderStatus _pendingBilling = new SalesOrderOrderStatus("_pendingBilling");
    public static final SalesOrderOrderStatus _fullyBilled = new SalesOrderOrderStatus("_fullyBilled");
    public static final SalesOrderOrderStatus _closed = new SalesOrderOrderStatus("_closed");
    public static final SalesOrderOrderStatus _undefined = new SalesOrderOrderStatus("_undefined");
    private static TypeDesc typeDesc = new TypeDesc(SalesOrderOrderStatus.class);

    protected SalesOrderOrderStatus(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static SalesOrderOrderStatus fromValue(String value) throws IllegalArgumentException {
        SalesOrderOrderStatus enumeration = (SalesOrderOrderStatus)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static SalesOrderOrderStatus fromString(String value) throws IllegalArgumentException {
        return SalesOrderOrderStatus.fromValue(value);
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
        return SalesOrderOrderStatus.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.sales_2022_1.transactions.webservices.netsuite.com", "SalesOrderOrderStatus"));
    }
}

