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

public class ItemProductFeed
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __googleBase = "_googleBase";
    public static final String __nexTag = "_nexTag";
    public static final String __shoppingCom = "_shoppingCom";
    public static final String __shopzilla = "_shopzilla";
    public static final String __yahooShopping = "_yahooShopping";
    public static final ItemProductFeed _googleBase = new ItemProductFeed("_googleBase");
    public static final ItemProductFeed _nexTag = new ItemProductFeed("_nexTag");
    public static final ItemProductFeed _shoppingCom = new ItemProductFeed("_shoppingCom");
    public static final ItemProductFeed _shopzilla = new ItemProductFeed("_shopzilla");
    public static final ItemProductFeed _yahooShopping = new ItemProductFeed("_yahooShopping");
    private static TypeDesc typeDesc = new TypeDesc(ItemProductFeed.class);

    protected ItemProductFeed(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static ItemProductFeed fromValue(String value) throws IllegalArgumentException {
        ItemProductFeed enumeration = (ItemProductFeed)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static ItemProductFeed fromString(String value) throws IllegalArgumentException {
        return ItemProductFeed.fromValue(value);
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
        return ItemProductFeed.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "ItemProductFeed"));
    }
}

