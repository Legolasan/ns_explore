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

public class CustomizationDisplayType
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __disabled = "_disabled";
    public static final String __hidden = "_hidden";
    public static final String __inlineText = "_inlineText";
    public static final String __normal = "_normal";
    public static final String __showAsList = "_showAsList";
    public static final CustomizationDisplayType _disabled = new CustomizationDisplayType("_disabled");
    public static final CustomizationDisplayType _hidden = new CustomizationDisplayType("_hidden");
    public static final CustomizationDisplayType _inlineText = new CustomizationDisplayType("_inlineText");
    public static final CustomizationDisplayType _normal = new CustomizationDisplayType("_normal");
    public static final CustomizationDisplayType _showAsList = new CustomizationDisplayType("_showAsList");
    private static TypeDesc typeDesc = new TypeDesc(CustomizationDisplayType.class);

    protected CustomizationDisplayType(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static CustomizationDisplayType fromValue(String value) throws IllegalArgumentException {
        CustomizationDisplayType enumeration = (CustomizationDisplayType)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static CustomizationDisplayType fromString(String value) throws IllegalArgumentException {
        return CustomizationDisplayType.fromValue(value);
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
        return CustomizationDisplayType.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.customization_2022_1.setup.webservices.netsuite.com", "CustomizationDisplayType"));
    }
}

