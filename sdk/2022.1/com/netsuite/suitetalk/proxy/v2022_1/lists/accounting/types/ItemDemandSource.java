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

public class ItemDemandSource
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __enteredAndPlannedOrders = "_enteredAndPlannedOrders";
    public static final String __forecastAndOrders = "_forecastAndOrders";
    public static final String __forecastConsumption = "_forecastConsumption";
    public static final String __forecastFromDemandPlan = "_forecastFromDemandPlan";
    public static final ItemDemandSource _enteredAndPlannedOrders = new ItemDemandSource("_enteredAndPlannedOrders");
    public static final ItemDemandSource _forecastAndOrders = new ItemDemandSource("_forecastAndOrders");
    public static final ItemDemandSource _forecastConsumption = new ItemDemandSource("_forecastConsumption");
    public static final ItemDemandSource _forecastFromDemandPlan = new ItemDemandSource("_forecastFromDemandPlan");
    private static TypeDesc typeDesc = new TypeDesc(ItemDemandSource.class);

    protected ItemDemandSource(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static ItemDemandSource fromValue(String value) throws IllegalArgumentException {
        ItemDemandSource enumeration = (ItemDemandSource)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static ItemDemandSource fromString(String value) throws IllegalArgumentException {
        return ItemDemandSource.fromValue(value);
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
        return ItemDemandSource.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "ItemDemandSource"));
    }
}

