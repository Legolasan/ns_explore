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

public class RecurrenceDow
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
    public static final RecurrenceDow _sunday = new RecurrenceDow("_sunday");
    public static final RecurrenceDow _monday = new RecurrenceDow("_monday");
    public static final RecurrenceDow _tuesday = new RecurrenceDow("_tuesday");
    public static final RecurrenceDow _wednesday = new RecurrenceDow("_wednesday");
    public static final RecurrenceDow _thursday = new RecurrenceDow("_thursday");
    public static final RecurrenceDow _friday = new RecurrenceDow("_friday");
    public static final RecurrenceDow _saturday = new RecurrenceDow("_saturday");
    private static TypeDesc typeDesc = new TypeDesc(RecurrenceDow.class);

    protected RecurrenceDow(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static RecurrenceDow fromValue(String value) throws IllegalArgumentException {
        RecurrenceDow enumeration = (RecurrenceDow)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static RecurrenceDow fromString(String value) throws IllegalArgumentException {
        return RecurrenceDow.fromValue(value);
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
        return RecurrenceDow.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "RecurrenceDow"));
    }
}

