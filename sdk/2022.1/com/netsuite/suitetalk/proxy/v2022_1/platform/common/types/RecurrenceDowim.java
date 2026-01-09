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

public class RecurrenceDowim
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __first = "_first";
    public static final String __second = "_second";
    public static final String __third = "_third";
    public static final String __fourth = "_fourth";
    public static final String __last = "_last";
    public static final RecurrenceDowim _first = new RecurrenceDowim("_first");
    public static final RecurrenceDowim _second = new RecurrenceDowim("_second");
    public static final RecurrenceDowim _third = new RecurrenceDowim("_third");
    public static final RecurrenceDowim _fourth = new RecurrenceDowim("_fourth");
    public static final RecurrenceDowim _last = new RecurrenceDowim("_last");
    private static TypeDesc typeDesc = new TypeDesc(RecurrenceDowim.class);

    protected RecurrenceDowim(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static RecurrenceDowim fromValue(String value) throws IllegalArgumentException {
        RecurrenceDowim enumeration = (RecurrenceDowim)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static RecurrenceDowim fromString(String value) throws IllegalArgumentException {
        return RecurrenceDowim.fromValue(value);
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
        return RecurrenceDowim.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "RecurrenceDowim"));
    }
}

