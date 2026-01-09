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

public class ItemEbayRelistingOption
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __doNotRelist = "_doNotRelist";
    public static final String __relistWhenItemExpires = "_relistWhenItemExpires";
    public static final String __relistWhenItemIsSold = "_relistWhenItemIsSold";
    public static final String __relistWhenItemIsSoldExpires = "_relistWhenItemIsSoldExpires";
    public static final ItemEbayRelistingOption _doNotRelist = new ItemEbayRelistingOption("_doNotRelist");
    public static final ItemEbayRelistingOption _relistWhenItemExpires = new ItemEbayRelistingOption("_relistWhenItemExpires");
    public static final ItemEbayRelistingOption _relistWhenItemIsSold = new ItemEbayRelistingOption("_relistWhenItemIsSold");
    public static final ItemEbayRelistingOption _relistWhenItemIsSoldExpires = new ItemEbayRelistingOption("_relistWhenItemIsSoldExpires");
    private static TypeDesc typeDesc = new TypeDesc(ItemEbayRelistingOption.class);

    protected ItemEbayRelistingOption(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static ItemEbayRelistingOption fromValue(String value) throws IllegalArgumentException {
        ItemEbayRelistingOption enumeration = (ItemEbayRelistingOption)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static ItemEbayRelistingOption fromString(String value) throws IllegalArgumentException {
        return ItemEbayRelistingOption.fromValue(value);
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
        return ItemEbayRelistingOption.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "ItemEbayRelistingOption"));
    }
}

