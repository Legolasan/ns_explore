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
package com.netsuite.suitetalk.proxy.v2022_1.transactions.demandplanning.types;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

public class DayOfTheWeek
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __sunday = "_sunday";
    public static final String __monday = "_monday";
    public static final String __tuesday = "_tuesday";
    public static final String __wednesday = "_wednesday";
    public static final String __thursday = "_thursday";
    public static final String __friday = "_friday";
    public static final String __saturday = "_saturday";
    public static final DayOfTheWeek _sunday = new DayOfTheWeek("_sunday");
    public static final DayOfTheWeek _monday = new DayOfTheWeek("_monday");
    public static final DayOfTheWeek _tuesday = new DayOfTheWeek("_tuesday");
    public static final DayOfTheWeek _wednesday = new DayOfTheWeek("_wednesday");
    public static final DayOfTheWeek _thursday = new DayOfTheWeek("_thursday");
    public static final DayOfTheWeek _friday = new DayOfTheWeek("_friday");
    public static final DayOfTheWeek _saturday = new DayOfTheWeek("_saturday");
    private static TypeDesc typeDesc = new TypeDesc(DayOfTheWeek.class);

    protected DayOfTheWeek(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static DayOfTheWeek fromValue(String value) throws IllegalArgumentException {
        DayOfTheWeek enumeration = (DayOfTheWeek)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static DayOfTheWeek fromString(String value) throws IllegalArgumentException {
        return DayOfTheWeek.fromValue(value);
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
        return DayOfTheWeek.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.demandplanning_2022_1.transactions.webservices.netsuite.com", "DayOfTheWeek"));
    }
}

