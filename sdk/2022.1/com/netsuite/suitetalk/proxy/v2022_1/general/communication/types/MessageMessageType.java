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
package com.netsuite.suitetalk.proxy.v2022_1.general.communication.types;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

public class MessageMessageType
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __email = "_email";
    public static final String __emailedReport = "_emailedReport";
    public static final String __fax = "_fax";
    public static final String __pdf = "_pdf";
    public static final String __print = "_print";
    public static final MessageMessageType _email = new MessageMessageType("_email");
    public static final MessageMessageType _emailedReport = new MessageMessageType("_emailedReport");
    public static final MessageMessageType _fax = new MessageMessageType("_fax");
    public static final MessageMessageType _pdf = new MessageMessageType("_pdf");
    public static final MessageMessageType _print = new MessageMessageType("_print");
    private static TypeDesc typeDesc = new TypeDesc(MessageMessageType.class);

    protected MessageMessageType(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static MessageMessageType fromValue(String value) throws IllegalArgumentException {
        MessageMessageType enumeration = (MessageMessageType)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static MessageMessageType fromString(String value) throws IllegalArgumentException {
        return MessageMessageType.fromValue(value);
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
        return MessageMessageType.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.communication_2022_1.general.webservices.netsuite.com", "MessageMessageType"));
    }
}

