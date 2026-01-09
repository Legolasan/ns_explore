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
package com.netsuite.suitetalk.proxy.v2022_1.transactions.inventory.types;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

public class TransferOrderOrderStatus
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __pendingApproval = "_pendingApproval";
    public static final String __pendingFulfillment = "_pendingFulfillment";
    public static final String __rejected = "_rejected";
    public static final String __partiallyFulfilled = "_partiallyFulfilled";
    public static final String __pendingReceiptPartFulfilled = "_pendingReceiptPartFulfilled";
    public static final String __pendingReceipt = "_pendingReceipt";
    public static final String __received = "_received";
    public static final String __closed = "_closed";
    public static final String __undefined = "_undefined";
    public static final TransferOrderOrderStatus _pendingApproval = new TransferOrderOrderStatus("_pendingApproval");
    public static final TransferOrderOrderStatus _pendingFulfillment = new TransferOrderOrderStatus("_pendingFulfillment");
    public static final TransferOrderOrderStatus _rejected = new TransferOrderOrderStatus("_rejected");
    public static final TransferOrderOrderStatus _partiallyFulfilled = new TransferOrderOrderStatus("_partiallyFulfilled");
    public static final TransferOrderOrderStatus _pendingReceiptPartFulfilled = new TransferOrderOrderStatus("_pendingReceiptPartFulfilled");
    public static final TransferOrderOrderStatus _pendingReceipt = new TransferOrderOrderStatus("_pendingReceipt");
    public static final TransferOrderOrderStatus _received = new TransferOrderOrderStatus("_received");
    public static final TransferOrderOrderStatus _closed = new TransferOrderOrderStatus("_closed");
    public static final TransferOrderOrderStatus _undefined = new TransferOrderOrderStatus("_undefined");
    private static TypeDesc typeDesc = new TypeDesc(TransferOrderOrderStatus.class);

    protected TransferOrderOrderStatus(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static TransferOrderOrderStatus fromValue(String value) throws IllegalArgumentException {
        TransferOrderOrderStatus enumeration = (TransferOrderOrderStatus)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static TransferOrderOrderStatus fromString(String value) throws IllegalArgumentException {
        return TransferOrderOrderStatus.fromValue(value);
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
        return TransferOrderOrderStatus.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.inventory_2022_1.transactions.webservices.netsuite.com", "TransferOrderOrderStatus"));
    }
}

