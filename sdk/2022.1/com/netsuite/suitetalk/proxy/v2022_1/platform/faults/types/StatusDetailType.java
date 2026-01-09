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
package com.netsuite.suitetalk.proxy.v2022_1.platform.faults.types;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

public class StatusDetailType
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String _ERROR = "ERROR";
    public static final String _WARN = "WARN";
    public static final String _INFO = "INFO";
    public static final StatusDetailType ERROR = new StatusDetailType("ERROR");
    public static final StatusDetailType WARN = new StatusDetailType("WARN");
    public static final StatusDetailType INFO = new StatusDetailType("INFO");
    private static TypeDesc typeDesc = new TypeDesc(StatusDetailType.class);

    protected StatusDetailType(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static StatusDetailType fromValue(String value) throws IllegalArgumentException {
        StatusDetailType enumeration = (StatusDetailType)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static StatusDetailType fromString(String value) throws IllegalArgumentException {
        return StatusDetailType.fromValue(value);
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
        return StatusDetailType.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.faults_2022_1.platform.webservices.netsuite.com", "StatusDetailType"));
    }
}

