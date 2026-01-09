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

public class ItemEbayAuctionDuration
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __10days = "_10days";
    public static final String __120days = "_120days";
    public static final String __1day = "_1day";
    public static final String __30days = "_30days";
    public static final String __3days = "_3days";
    public static final String __5days = "_5days";
    public static final String __60days = "_60days";
    public static final String __7days = "_7days";
    public static final String __90days = "_90days";
    public static final String __goodUntilCancelled = "_goodUntilCancelled";
    public static final ItemEbayAuctionDuration _10days = new ItemEbayAuctionDuration("_10days");
    public static final ItemEbayAuctionDuration _120days = new ItemEbayAuctionDuration("_120days");
    public static final ItemEbayAuctionDuration _1day = new ItemEbayAuctionDuration("_1day");
    public static final ItemEbayAuctionDuration _30days = new ItemEbayAuctionDuration("_30days");
    public static final ItemEbayAuctionDuration _3days = new ItemEbayAuctionDuration("_3days");
    public static final ItemEbayAuctionDuration _5days = new ItemEbayAuctionDuration("_5days");
    public static final ItemEbayAuctionDuration _60days = new ItemEbayAuctionDuration("_60days");
    public static final ItemEbayAuctionDuration _7days = new ItemEbayAuctionDuration("_7days");
    public static final ItemEbayAuctionDuration _90days = new ItemEbayAuctionDuration("_90days");
    public static final ItemEbayAuctionDuration _goodUntilCancelled = new ItemEbayAuctionDuration("_goodUntilCancelled");
    private static TypeDesc typeDesc = new TypeDesc(ItemEbayAuctionDuration.class);

    protected ItemEbayAuctionDuration(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static ItemEbayAuctionDuration fromValue(String value) throws IllegalArgumentException {
        ItemEbayAuctionDuration enumeration = (ItemEbayAuctionDuration)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static ItemEbayAuctionDuration fromString(String value) throws IllegalArgumentException {
        return ItemEbayAuctionDuration.fromValue(value);
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
        return ItemEbayAuctionDuration.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "ItemEbayAuctionDuration"));
    }
}

