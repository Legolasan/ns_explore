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
package com.netsuite.suitetalk.proxy.v2022_1.platform.core.types;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

public class InitializeAuxRefType
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String _shippingGroup = "shippingGroup";
    public static final String _arAccount = "arAccount";
    public static final String _apAccount = "apAccount";
    public static final String _itemFulfillment = "itemFulfillment";
    public static final String _tranType = "tranType";
    public static final InitializeAuxRefType shippingGroup = new InitializeAuxRefType("shippingGroup");
    public static final InitializeAuxRefType arAccount = new InitializeAuxRefType("arAccount");
    public static final InitializeAuxRefType apAccount = new InitializeAuxRefType("apAccount");
    public static final InitializeAuxRefType itemFulfillment = new InitializeAuxRefType("itemFulfillment");
    public static final InitializeAuxRefType tranType = new InitializeAuxRefType("tranType");
    private static TypeDesc typeDesc = new TypeDesc(InitializeAuxRefType.class);

    protected InitializeAuxRefType(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static InitializeAuxRefType fromValue(String value) throws IllegalArgumentException {
        InitializeAuxRefType enumeration = (InitializeAuxRefType)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static InitializeAuxRefType fromString(String value) throws IllegalArgumentException {
        return InitializeAuxRefType.fromValue(value);
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
        return InitializeAuxRefType.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.core_2022_1.platform.webservices.netsuite.com", "InitializeAuxRefType"));
    }
}

