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

public class CustomerMonthlyClosing
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __one = "_one";
    public static final String __five = "_five";
    public static final String __ten = "_ten";
    public static final String __fifteen = "_fifteen";
    public static final String __twenty = "_twenty";
    public static final String __twentyFive = "_twentyFive";
    public static final String __endOfTheMonth = "_endOfTheMonth";
    public static final CustomerMonthlyClosing _one = new CustomerMonthlyClosing("_one");
    public static final CustomerMonthlyClosing _five = new CustomerMonthlyClosing("_five");
    public static final CustomerMonthlyClosing _ten = new CustomerMonthlyClosing("_ten");
    public static final CustomerMonthlyClosing _fifteen = new CustomerMonthlyClosing("_fifteen");
    public static final CustomerMonthlyClosing _twenty = new CustomerMonthlyClosing("_twenty");
    public static final CustomerMonthlyClosing _twentyFive = new CustomerMonthlyClosing("_twentyFive");
    public static final CustomerMonthlyClosing _endOfTheMonth = new CustomerMonthlyClosing("_endOfTheMonth");
    private static TypeDesc typeDesc = new TypeDesc(CustomerMonthlyClosing.class);

    protected CustomerMonthlyClosing(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static CustomerMonthlyClosing fromValue(String value) throws IllegalArgumentException {
        CustomerMonthlyClosing enumeration = (CustomerMonthlyClosing)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static CustomerMonthlyClosing fromString(String value) throws IllegalArgumentException {
        return CustomerMonthlyClosing.fromValue(value);
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
        return CustomerMonthlyClosing.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.relationships_2022_1.lists.webservices.netsuite.com", "CustomerMonthlyClosing"));
    }
}

