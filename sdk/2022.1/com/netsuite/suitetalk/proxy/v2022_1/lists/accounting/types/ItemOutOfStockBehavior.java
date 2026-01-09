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

public class ItemOutOfStockBehavior
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __allowBackOrdersButDisplayOutOfStockMessage = "_allowBackOrdersButDisplayOutOfStockMessage";
    public static final String __allowBackOrdersWithNoOutOfStockMessage = "_allowBackOrdersWithNoOutOfStockMessage";
    public static final String __default = "_default";
    public static final String __disallowBackOrdersButDisplayOutOfStockMessage = "_disallowBackOrdersButDisplayOutOfStockMessage";
    public static final String __removeItemWhenOutOfStock = "_removeItemWhenOutOfStock";
    public static final ItemOutOfStockBehavior _allowBackOrdersButDisplayOutOfStockMessage = new ItemOutOfStockBehavior("_allowBackOrdersButDisplayOutOfStockMessage");
    public static final ItemOutOfStockBehavior _allowBackOrdersWithNoOutOfStockMessage = new ItemOutOfStockBehavior("_allowBackOrdersWithNoOutOfStockMessage");
    public static final ItemOutOfStockBehavior _default = new ItemOutOfStockBehavior("_default");
    public static final ItemOutOfStockBehavior _disallowBackOrdersButDisplayOutOfStockMessage = new ItemOutOfStockBehavior("_disallowBackOrdersButDisplayOutOfStockMessage");
    public static final ItemOutOfStockBehavior _removeItemWhenOutOfStock = new ItemOutOfStockBehavior("_removeItemWhenOutOfStock");
    private static TypeDesc typeDesc = new TypeDesc(ItemOutOfStockBehavior.class);

    protected ItemOutOfStockBehavior(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static ItemOutOfStockBehavior fromValue(String value) throws IllegalArgumentException {
        ItemOutOfStockBehavior enumeration = (ItemOutOfStockBehavior)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static ItemOutOfStockBehavior fromString(String value) throws IllegalArgumentException {
        return ItemOutOfStockBehavior.fromValue(value);
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
        return ItemOutOfStockBehavior.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "ItemOutOfStockBehavior"));
    }
}

