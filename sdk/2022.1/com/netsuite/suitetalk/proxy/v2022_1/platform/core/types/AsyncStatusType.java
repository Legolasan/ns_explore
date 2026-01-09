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

public class AsyncStatusType
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String _failed = "failed";
    public static final String _finishedWithErrors = "finishedWithErrors";
    public static final String _pending = "pending";
    public static final String _processing = "processing";
    public static final String _finished = "finished";
    public static final String _retry = "retry";
    public static final AsyncStatusType failed = new AsyncStatusType("failed");
    public static final AsyncStatusType finishedWithErrors = new AsyncStatusType("finishedWithErrors");
    public static final AsyncStatusType pending = new AsyncStatusType("pending");
    public static final AsyncStatusType processing = new AsyncStatusType("processing");
    public static final AsyncStatusType finished = new AsyncStatusType("finished");
    public static final AsyncStatusType retry = new AsyncStatusType("retry");
    private static TypeDesc typeDesc = new TypeDesc(AsyncStatusType.class);

    protected AsyncStatusType(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static AsyncStatusType fromValue(String value) throws IllegalArgumentException {
        AsyncStatusType enumeration = (AsyncStatusType)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static AsyncStatusType fromString(String value) throws IllegalArgumentException {
        return AsyncStatusType.fromValue(value);
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
        return AsyncStatusType.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.core_2022_1.platform.webservices.netsuite.com", "AsyncStatusType"));
    }
}

