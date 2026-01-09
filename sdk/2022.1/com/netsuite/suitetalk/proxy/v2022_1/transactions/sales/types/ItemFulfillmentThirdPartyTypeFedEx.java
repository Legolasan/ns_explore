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

public class ItemFulfillmentThirdPartyTypeFedEx
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __billRecipient = "_billRecipient";
    public static final String __billThirdParty = "_billThirdParty";
    public static final String __noneSelected = "_noneSelected";
    public static final ItemFulfillmentThirdPartyTypeFedEx _billRecipient = new ItemFulfillmentThirdPartyTypeFedEx("_billRecipient");
    public static final ItemFulfillmentThirdPartyTypeFedEx _billThirdParty = new ItemFulfillmentThirdPartyTypeFedEx("_billThirdParty");
    public static final ItemFulfillmentThirdPartyTypeFedEx _noneSelected = new ItemFulfillmentThirdPartyTypeFedEx("_noneSelected");
    private static TypeDesc typeDesc = new TypeDesc(ItemFulfillmentThirdPartyTypeFedEx.class);

    protected ItemFulfillmentThirdPartyTypeFedEx(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static ItemFulfillmentThirdPartyTypeFedEx fromValue(String value) throws IllegalArgumentException {
        ItemFulfillmentThirdPartyTypeFedEx enumeration = (ItemFulfillmentThirdPartyTypeFedEx)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static ItemFulfillmentThirdPartyTypeFedEx fromString(String value) throws IllegalArgumentException {
        return ItemFulfillmentThirdPartyTypeFedEx.fromValue(value);
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
        return ItemFulfillmentThirdPartyTypeFedEx.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.sales_2022_1.transactions.webservices.netsuite.com", "ItemFulfillmentThirdPartyTypeFedEx"));
    }
}

