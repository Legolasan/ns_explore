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

public class CustomerNumberFormat
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __spaceAsDigitGroupSeparatorAndDecimalComma = "_spaceAsDigitGroupSeparatorAndDecimalComma";
    public static final String __spaceAsDigitGroupSeparatorAndDecimalPoint = "_spaceAsDigitGroupSeparatorAndDecimalPoint";
    public static final String __commaAsDigitGroupSeparatorAndDecimalPoint = "_commaAsDigitGroupSeparatorAndDecimalPoint";
    public static final String __pointAsDigitGroupSeparatorAndDecimalComma = "_pointAsDigitGroupSeparatorAndDecimalComma";
    public static final String __apostropheAsDigitGroupSeparatorAndDecimalComma = "_apostropheAsDigitGroupSeparatorAndDecimalComma";
    public static final String __apostropheAsDigitGroupSeparatorAndDecimalPoint = "_apostropheAsDigitGroupSeparatorAndDecimalPoint";
    public static final CustomerNumberFormat _spaceAsDigitGroupSeparatorAndDecimalComma = new CustomerNumberFormat("_spaceAsDigitGroupSeparatorAndDecimalComma");
    public static final CustomerNumberFormat _spaceAsDigitGroupSeparatorAndDecimalPoint = new CustomerNumberFormat("_spaceAsDigitGroupSeparatorAndDecimalPoint");
    public static final CustomerNumberFormat _commaAsDigitGroupSeparatorAndDecimalPoint = new CustomerNumberFormat("_commaAsDigitGroupSeparatorAndDecimalPoint");
    public static final CustomerNumberFormat _pointAsDigitGroupSeparatorAndDecimalComma = new CustomerNumberFormat("_pointAsDigitGroupSeparatorAndDecimalComma");
    public static final CustomerNumberFormat _apostropheAsDigitGroupSeparatorAndDecimalComma = new CustomerNumberFormat("_apostropheAsDigitGroupSeparatorAndDecimalComma");
    public static final CustomerNumberFormat _apostropheAsDigitGroupSeparatorAndDecimalPoint = new CustomerNumberFormat("_apostropheAsDigitGroupSeparatorAndDecimalPoint");
    private static TypeDesc typeDesc = new TypeDesc(CustomerNumberFormat.class);

    protected CustomerNumberFormat(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static CustomerNumberFormat fromValue(String value) throws IllegalArgumentException {
        CustomerNumberFormat enumeration = (CustomerNumberFormat)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static CustomerNumberFormat fromString(String value) throws IllegalArgumentException {
        return CustomerNumberFormat.fromValue(value);
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
        return CustomerNumberFormat.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.relationships_2022_1.lists.webservices.netsuite.com", "CustomerNumberFormat"));
    }
}

