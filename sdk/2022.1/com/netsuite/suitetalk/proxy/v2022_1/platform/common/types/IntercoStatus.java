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

public class IntercoStatus
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __paired = "_paired";
    public static final String __pending = "_pending";
    public static final String __rejected = "_rejected";
    public static final IntercoStatus _paired = new IntercoStatus("_paired");
    public static final IntercoStatus _pending = new IntercoStatus("_pending");
    public static final IntercoStatus _rejected = new IntercoStatus("_rejected");
    private static TypeDesc typeDesc = new TypeDesc(IntercoStatus.class);

    protected IntercoStatus(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static IntercoStatus fromValue(String value) throws IllegalArgumentException {
        IntercoStatus enumeration = (IntercoStatus)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static IntercoStatus fromString(String value) throws IllegalArgumentException {
        return IntercoStatus.fromValue(value);
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
        return IntercoStatus.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "IntercoStatus"));
    }
}

