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
package com.netsuite.suitetalk.proxy.v2022_1.lists.relationships.types;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

public class TaxFractionUnit
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __001andBelow = "_001andBelow";
    public static final String __01andBelow = "_01andBelow";
    public static final String __100andBelow = "_100andBelow";
    public static final String __10andBelow = "_10andBelow";
    public static final String __1andBelow = "_1andBelow";
    public static final TaxFractionUnit _001andBelow = new TaxFractionUnit("_001andBelow");
    public static final TaxFractionUnit _01andBelow = new TaxFractionUnit("_01andBelow");
    public static final TaxFractionUnit _100andBelow = new TaxFractionUnit("_100andBelow");
    public static final TaxFractionUnit _10andBelow = new TaxFractionUnit("_10andBelow");
    public static final TaxFractionUnit _1andBelow = new TaxFractionUnit("_1andBelow");
    private static TypeDesc typeDesc = new TypeDesc(TaxFractionUnit.class);

    protected TaxFractionUnit(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static TaxFractionUnit fromValue(String value) throws IllegalArgumentException {
        TaxFractionUnit enumeration = (TaxFractionUnit)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static TaxFractionUnit fromString(String value) throws IllegalArgumentException {
        return TaxFractionUnit.fromValue(value);
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
        return TaxFractionUnit.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.relationships_2022_1.lists.webservices.netsuite.com", "TaxFractionUnit"));
    }
}

