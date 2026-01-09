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

public class PermissionLevel
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __create = "_create";
    public static final String __edit = "_edit";
    public static final String __full = "_full";
    public static final String __none = "_none";
    public static final String __view = "_view";
    public static final PermissionLevel _create = new PermissionLevel("_create");
    public static final PermissionLevel _edit = new PermissionLevel("_edit");
    public static final PermissionLevel _full = new PermissionLevel("_full");
    public static final PermissionLevel _none = new PermissionLevel("_none");
    public static final PermissionLevel _view = new PermissionLevel("_view");
    private static TypeDesc typeDesc = new TypeDesc(PermissionLevel.class);

    protected PermissionLevel(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static PermissionLevel fromValue(String value) throws IllegalArgumentException {
        PermissionLevel enumeration = (PermissionLevel)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static PermissionLevel fromString(String value) throws IllegalArgumentException {
        return PermissionLevel.fromValue(value);
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
        return PermissionLevel.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "PermissionLevel"));
    }
}

