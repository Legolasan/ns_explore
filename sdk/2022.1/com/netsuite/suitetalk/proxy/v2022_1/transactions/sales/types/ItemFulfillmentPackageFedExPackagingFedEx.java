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

public class ItemFulfillmentPackageFedExPackagingFedEx
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __fedExBox = "_fedExBox";
    public static final String __fedEx10kgBox = "_fedEx10kgBox";
    public static final String __fedEx25kgBox = "_fedEx25kgBox";
    public static final String __fedExEnvelope = "_fedExEnvelope";
    public static final String __fedExPak = "_fedExPak";
    public static final String __fedExTube = "_fedExTube";
    public static final String __yourPackaging = "_yourPackaging";
    public static final ItemFulfillmentPackageFedExPackagingFedEx _fedExBox = new ItemFulfillmentPackageFedExPackagingFedEx("_fedExBox");
    public static final ItemFulfillmentPackageFedExPackagingFedEx _fedEx10kgBox = new ItemFulfillmentPackageFedExPackagingFedEx("_fedEx10kgBox");
    public static final ItemFulfillmentPackageFedExPackagingFedEx _fedEx25kgBox = new ItemFulfillmentPackageFedExPackagingFedEx("_fedEx25kgBox");
    public static final ItemFulfillmentPackageFedExPackagingFedEx _fedExEnvelope = new ItemFulfillmentPackageFedExPackagingFedEx("_fedExEnvelope");
    public static final ItemFulfillmentPackageFedExPackagingFedEx _fedExPak = new ItemFulfillmentPackageFedExPackagingFedEx("_fedExPak");
    public static final ItemFulfillmentPackageFedExPackagingFedEx _fedExTube = new ItemFulfillmentPackageFedExPackagingFedEx("_fedExTube");
    public static final ItemFulfillmentPackageFedExPackagingFedEx _yourPackaging = new ItemFulfillmentPackageFedExPackagingFedEx("_yourPackaging");
    private static TypeDesc typeDesc = new TypeDesc(ItemFulfillmentPackageFedExPackagingFedEx.class);

    protected ItemFulfillmentPackageFedExPackagingFedEx(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static ItemFulfillmentPackageFedExPackagingFedEx fromValue(String value) throws IllegalArgumentException {
        ItemFulfillmentPackageFedExPackagingFedEx enumeration = (ItemFulfillmentPackageFedExPackagingFedEx)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static ItemFulfillmentPackageFedExPackagingFedEx fromString(String value) throws IllegalArgumentException {
        return ItemFulfillmentPackageFedExPackagingFedEx.fromValue(value);
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
        return ItemFulfillmentPackageFedExPackagingFedEx.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.sales_2022_1.transactions.webservices.netsuite.com", "ItemFulfillmentPackageFedExPackagingFedEx"));
    }
}

