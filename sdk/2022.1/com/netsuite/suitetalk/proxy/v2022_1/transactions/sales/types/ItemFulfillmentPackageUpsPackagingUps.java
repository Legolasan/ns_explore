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

public class ItemFulfillmentPackageUpsPackagingUps
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __upsExpressBox = "_upsExpressBox";
    public static final String __upsLetter = "_upsLetter";
    public static final String __upsPak = "_upsPak";
    public static final String __upsTube = "_upsTube";
    public static final String __yourPackaging = "_yourPackaging";
    public static final ItemFulfillmentPackageUpsPackagingUps _upsExpressBox = new ItemFulfillmentPackageUpsPackagingUps("_upsExpressBox");
    public static final ItemFulfillmentPackageUpsPackagingUps _upsLetter = new ItemFulfillmentPackageUpsPackagingUps("_upsLetter");
    public static final ItemFulfillmentPackageUpsPackagingUps _upsPak = new ItemFulfillmentPackageUpsPackagingUps("_upsPak");
    public static final ItemFulfillmentPackageUpsPackagingUps _upsTube = new ItemFulfillmentPackageUpsPackagingUps("_upsTube");
    public static final ItemFulfillmentPackageUpsPackagingUps _yourPackaging = new ItemFulfillmentPackageUpsPackagingUps("_yourPackaging");
    private static TypeDesc typeDesc = new TypeDesc(ItemFulfillmentPackageUpsPackagingUps.class);

    protected ItemFulfillmentPackageUpsPackagingUps(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static ItemFulfillmentPackageUpsPackagingUps fromValue(String value) throws IllegalArgumentException {
        ItemFulfillmentPackageUpsPackagingUps enumeration = (ItemFulfillmentPackageUpsPackagingUps)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static ItemFulfillmentPackageUpsPackagingUps fromString(String value) throws IllegalArgumentException {
        return ItemFulfillmentPackageUpsPackagingUps.fromValue(value);
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
        return ItemFulfillmentPackageUpsPackagingUps.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.sales_2022_1.transactions.webservices.netsuite.com", "ItemFulfillmentPackageUpsPackagingUps"));
    }
}

