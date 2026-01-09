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

public class ItemAtpMethod
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __cumulativeAtpWithLookAhead = "_cumulativeAtpWithLookAhead";
    public static final String __discreteAtp = "_discreteAtp";
    public static final ItemAtpMethod _cumulativeAtpWithLookAhead = new ItemAtpMethod("_cumulativeAtpWithLookAhead");
    public static final ItemAtpMethod _discreteAtp = new ItemAtpMethod("_discreteAtp");
    private static TypeDesc typeDesc = new TypeDesc(ItemAtpMethod.class);

    protected ItemAtpMethod(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static ItemAtpMethod fromValue(String value) throws IllegalArgumentException {
        ItemAtpMethod enumeration = (ItemAtpMethod)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static ItemAtpMethod fromString(String value) throws IllegalArgumentException {
        return ItemAtpMethod.fromValue(value);
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
        return ItemAtpMethod.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "ItemAtpMethod"));
    }
}

