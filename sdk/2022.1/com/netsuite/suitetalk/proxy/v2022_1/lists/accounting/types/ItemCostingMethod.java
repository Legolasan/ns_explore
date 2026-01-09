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

public class ItemCostingMethod
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __average = "_average";
    public static final String __fifo = "_fifo";
    public static final String __groupAverage = "_groupAverage";
    public static final String __lifo = "_lifo";
    public static final String __lotNumbered = "_lotNumbered";
    public static final String __serialized = "_serialized";
    public static final String __standard = "_standard";
    public static final ItemCostingMethod _average = new ItemCostingMethod("_average");
    public static final ItemCostingMethod _fifo = new ItemCostingMethod("_fifo");
    public static final ItemCostingMethod _groupAverage = new ItemCostingMethod("_groupAverage");
    public static final ItemCostingMethod _lifo = new ItemCostingMethod("_lifo");
    public static final ItemCostingMethod _lotNumbered = new ItemCostingMethod("_lotNumbered");
    public static final ItemCostingMethod _serialized = new ItemCostingMethod("_serialized");
    public static final ItemCostingMethod _standard = new ItemCostingMethod("_standard");
    private static TypeDesc typeDesc = new TypeDesc(ItemCostingMethod.class);

    protected ItemCostingMethod(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static ItemCostingMethod fromValue(String value) throws IllegalArgumentException {
        ItemCostingMethod enumeration = (ItemCostingMethod)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static ItemCostingMethod fromString(String value) throws IllegalArgumentException {
        return ItemCostingMethod.fromValue(value);
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
        return ItemCostingMethod.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "ItemCostingMethod"));
    }
}

