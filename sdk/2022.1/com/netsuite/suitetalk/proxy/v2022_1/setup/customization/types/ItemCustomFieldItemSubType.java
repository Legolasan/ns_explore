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

public class ItemCustomFieldItemSubType
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __both = "_both";
    public static final String __purchase = "_purchase";
    public static final String __sale = "_sale";
    public static final ItemCustomFieldItemSubType _both = new ItemCustomFieldItemSubType("_both");
    public static final ItemCustomFieldItemSubType _purchase = new ItemCustomFieldItemSubType("_purchase");
    public static final ItemCustomFieldItemSubType _sale = new ItemCustomFieldItemSubType("_sale");
    private static TypeDesc typeDesc = new TypeDesc(ItemCustomFieldItemSubType.class);

    protected ItemCustomFieldItemSubType(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static ItemCustomFieldItemSubType fromValue(String value) throws IllegalArgumentException {
        ItemCustomFieldItemSubType enumeration = (ItemCustomFieldItemSubType)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static ItemCustomFieldItemSubType fromString(String value) throws IllegalArgumentException {
        return ItemCustomFieldItemSubType.fromValue(value);
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
        return ItemCustomFieldItemSubType.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.customization_2022_1.setup.webservices.netsuite.com", "ItemCustomFieldItemSubType"));
    }
}

