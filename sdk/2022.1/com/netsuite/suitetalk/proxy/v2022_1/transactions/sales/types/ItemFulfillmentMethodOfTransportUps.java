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

public class ItemFulfillmentMethodOfTransportUps
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __air = "_air";
    public static final String __airContainerized = "_airContainerized";
    public static final String __auto = "_auto";
    public static final String __fixedTransportInstallations = "_fixedTransportInstallations";
    public static final String __mail = "_mail";
    public static final String __passengerHandcarried = "_passengerHandcarried";
    public static final String __pedestrian = "_pedestrian";
    public static final String __rail = "_rail";
    public static final String __railContainerized = "_railContainerized";
    public static final String __roadOther = "_roadOther";
    public static final String __seaBarge = "_seaBarge";
    public static final String __seaContainerized = "_seaContainerized";
    public static final String __seaNoncontainerized = "_seaNoncontainerized";
    public static final String __truck = "_truck";
    public static final String __truckContainerized = "_truckContainerized";
    public static final ItemFulfillmentMethodOfTransportUps _air = new ItemFulfillmentMethodOfTransportUps("_air");
    public static final ItemFulfillmentMethodOfTransportUps _airContainerized = new ItemFulfillmentMethodOfTransportUps("_airContainerized");
    public static final ItemFulfillmentMethodOfTransportUps _auto = new ItemFulfillmentMethodOfTransportUps("_auto");
    public static final ItemFulfillmentMethodOfTransportUps _fixedTransportInstallations = new ItemFulfillmentMethodOfTransportUps("_fixedTransportInstallations");
    public static final ItemFulfillmentMethodOfTransportUps _mail = new ItemFulfillmentMethodOfTransportUps("_mail");
    public static final ItemFulfillmentMethodOfTransportUps _passengerHandcarried = new ItemFulfillmentMethodOfTransportUps("_passengerHandcarried");
    public static final ItemFulfillmentMethodOfTransportUps _pedestrian = new ItemFulfillmentMethodOfTransportUps("_pedestrian");
    public static final ItemFulfillmentMethodOfTransportUps _rail = new ItemFulfillmentMethodOfTransportUps("_rail");
    public static final ItemFulfillmentMethodOfTransportUps _railContainerized = new ItemFulfillmentMethodOfTransportUps("_railContainerized");
    public static final ItemFulfillmentMethodOfTransportUps _roadOther = new ItemFulfillmentMethodOfTransportUps("_roadOther");
    public static final ItemFulfillmentMethodOfTransportUps _seaBarge = new ItemFulfillmentMethodOfTransportUps("_seaBarge");
    public static final ItemFulfillmentMethodOfTransportUps _seaContainerized = new ItemFulfillmentMethodOfTransportUps("_seaContainerized");
    public static final ItemFulfillmentMethodOfTransportUps _seaNoncontainerized = new ItemFulfillmentMethodOfTransportUps("_seaNoncontainerized");
    public static final ItemFulfillmentMethodOfTransportUps _truck = new ItemFulfillmentMethodOfTransportUps("_truck");
    public static final ItemFulfillmentMethodOfTransportUps _truckContainerized = new ItemFulfillmentMethodOfTransportUps("_truckContainerized");
    private static TypeDesc typeDesc = new TypeDesc(ItemFulfillmentMethodOfTransportUps.class);

    protected ItemFulfillmentMethodOfTransportUps(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static ItemFulfillmentMethodOfTransportUps fromValue(String value) throws IllegalArgumentException {
        ItemFulfillmentMethodOfTransportUps enumeration = (ItemFulfillmentMethodOfTransportUps)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static ItemFulfillmentMethodOfTransportUps fromString(String value) throws IllegalArgumentException {
        return ItemFulfillmentMethodOfTransportUps.fromValue(value);
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
        return ItemFulfillmentMethodOfTransportUps.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.sales_2022_1.transactions.webservices.netsuite.com", "ItemFulfillmentMethodOfTransportUps"));
    }
}

