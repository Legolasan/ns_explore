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

public class CustomizationSearchLevel
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __none = "_none";
    public static final String __edit = "_edit";
    public static final String __run = "_run";
    public static final CustomizationSearchLevel _none = new CustomizationSearchLevel("_none");
    public static final CustomizationSearchLevel _edit = new CustomizationSearchLevel("_edit");
    public static final CustomizationSearchLevel _run = new CustomizationSearchLevel("_run");
    private static TypeDesc typeDesc = new TypeDesc(CustomizationSearchLevel.class);

    protected CustomizationSearchLevel(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static CustomizationSearchLevel fromValue(String value) throws IllegalArgumentException {
        CustomizationSearchLevel enumeration = (CustomizationSearchLevel)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static CustomizationSearchLevel fromString(String value) throws IllegalArgumentException {
        return CustomizationSearchLevel.fromValue(value);
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
        return CustomizationSearchLevel.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.customization_2022_1.setup.webservices.netsuite.com", "CustomizationSearchLevel"));
    }
}

