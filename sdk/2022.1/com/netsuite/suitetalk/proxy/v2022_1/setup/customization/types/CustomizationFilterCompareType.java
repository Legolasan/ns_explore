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
package com.netsuite.suitetalk.proxy.v2022_1.setup.customization.types;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

public class CustomizationFilterCompareType
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __equal = "_equal";
    public static final String __greaterThan = "_greaterThan";
    public static final String __greaterThanOrEqual = "_greaterThanOrEqual";
    public static final String __lessThan = "_lessThan";
    public static final String __lessThanOrEqual = "_lessThanOrEqual";
    public static final String __notEqual = "_notEqual";
    public static final CustomizationFilterCompareType _equal = new CustomizationFilterCompareType("_equal");
    public static final CustomizationFilterCompareType _greaterThan = new CustomizationFilterCompareType("_greaterThan");
    public static final CustomizationFilterCompareType _greaterThanOrEqual = new CustomizationFilterCompareType("_greaterThanOrEqual");
    public static final CustomizationFilterCompareType _lessThan = new CustomizationFilterCompareType("_lessThan");
    public static final CustomizationFilterCompareType _lessThanOrEqual = new CustomizationFilterCompareType("_lessThanOrEqual");
    public static final CustomizationFilterCompareType _notEqual = new CustomizationFilterCompareType("_notEqual");
    private static TypeDesc typeDesc = new TypeDesc(CustomizationFilterCompareType.class);

    protected CustomizationFilterCompareType(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static CustomizationFilterCompareType fromValue(String value) throws IllegalArgumentException {
        CustomizationFilterCompareType enumeration = (CustomizationFilterCompareType)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static CustomizationFilterCompareType fromString(String value) throws IllegalArgumentException {
        return CustomizationFilterCompareType.fromValue(value);
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
        return CustomizationFilterCompareType.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.customization_2022_1.setup.webservices.netsuite.com", "CustomizationFilterCompareType"));
    }
}

