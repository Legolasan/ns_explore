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

public class ItemPreferenceCriterion
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __A = "_A";
    public static final String __B = "_B";
    public static final String __C = "_C";
    public static final String __D = "_D";
    public static final String __E = "_E";
    public static final String __F = "_F";
    public static final ItemPreferenceCriterion _A = new ItemPreferenceCriterion("_A");
    public static final ItemPreferenceCriterion _B = new ItemPreferenceCriterion("_B");
    public static final ItemPreferenceCriterion _C = new ItemPreferenceCriterion("_C");
    public static final ItemPreferenceCriterion _D = new ItemPreferenceCriterion("_D");
    public static final ItemPreferenceCriterion _E = new ItemPreferenceCriterion("_E");
    public static final ItemPreferenceCriterion _F = new ItemPreferenceCriterion("_F");
    private static TypeDesc typeDesc = new TypeDesc(ItemPreferenceCriterion.class);

    protected ItemPreferenceCriterion(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static ItemPreferenceCriterion fromValue(String value) throws IllegalArgumentException {
        ItemPreferenceCriterion enumeration = (ItemPreferenceCriterion)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static ItemPreferenceCriterion fromString(String value) throws IllegalArgumentException {
        return ItemPreferenceCriterion.fromValue(value);
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
        return ItemPreferenceCriterion.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "ItemPreferenceCriterion"));
    }
}

