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

public class ItemFulfillmentHomeDeliveryTypeFedEx
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __appointment = "_appointment";
    public static final String __dateCertain = "_dateCertain";
    public static final String __evening = "_evening";
    public static final ItemFulfillmentHomeDeliveryTypeFedEx _appointment = new ItemFulfillmentHomeDeliveryTypeFedEx("_appointment");
    public static final ItemFulfillmentHomeDeliveryTypeFedEx _dateCertain = new ItemFulfillmentHomeDeliveryTypeFedEx("_dateCertain");
    public static final ItemFulfillmentHomeDeliveryTypeFedEx _evening = new ItemFulfillmentHomeDeliveryTypeFedEx("_evening");
    private static TypeDesc typeDesc = new TypeDesc(ItemFulfillmentHomeDeliveryTypeFedEx.class);

    protected ItemFulfillmentHomeDeliveryTypeFedEx(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static ItemFulfillmentHomeDeliveryTypeFedEx fromValue(String value) throws IllegalArgumentException {
        ItemFulfillmentHomeDeliveryTypeFedEx enumeration = (ItemFulfillmentHomeDeliveryTypeFedEx)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static ItemFulfillmentHomeDeliveryTypeFedEx fromString(String value) throws IllegalArgumentException {
        return ItemFulfillmentHomeDeliveryTypeFedEx.fromValue(value);
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
        return ItemFulfillmentHomeDeliveryTypeFedEx.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.sales_2022_1.transactions.webservices.netsuite.com", "ItemFulfillmentHomeDeliveryTypeFedEx"));
    }
}

