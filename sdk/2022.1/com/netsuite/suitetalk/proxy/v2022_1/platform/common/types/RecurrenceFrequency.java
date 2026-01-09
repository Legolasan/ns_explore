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
package com.netsuite.suitetalk.proxy.v2022_1.platform.common.types;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

public class RecurrenceFrequency
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __none = "_none";
    public static final String __day = "_day";
    public static final String __week = "_week";
    public static final String __month = "_month";
    public static final String __year = "_year";
    public static final RecurrenceFrequency _none = new RecurrenceFrequency("_none");
    public static final RecurrenceFrequency _day = new RecurrenceFrequency("_day");
    public static final RecurrenceFrequency _week = new RecurrenceFrequency("_week");
    public static final RecurrenceFrequency _month = new RecurrenceFrequency("_month");
    public static final RecurrenceFrequency _year = new RecurrenceFrequency("_year");
    private static TypeDesc typeDesc = new TypeDesc(RecurrenceFrequency.class);

    protected RecurrenceFrequency(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static RecurrenceFrequency fromValue(String value) throws IllegalArgumentException {
        RecurrenceFrequency enumeration = (RecurrenceFrequency)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static RecurrenceFrequency fromString(String value) throws IllegalArgumentException {
        return RecurrenceFrequency.fromValue(value);
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
        return RecurrenceFrequency.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "RecurrenceFrequency"));
    }
}

