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
package com.netsuite.suitetalk.proxy.v2022_1.documents.filecabinet.types;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

public class FileEncoding
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __autoDetect = "_autoDetect";
    public static final String __shiftJis = "_shiftJis";
    public static final String __utf8 = "_utf8";
    public static final String __windows1252 = "_windows1252";
    public static final FileEncoding _autoDetect = new FileEncoding("_autoDetect");
    public static final FileEncoding _shiftJis = new FileEncoding("_shiftJis");
    public static final FileEncoding _utf8 = new FileEncoding("_utf8");
    public static final FileEncoding _windows1252 = new FileEncoding("_windows1252");
    private static TypeDesc typeDesc = new TypeDesc(FileEncoding.class);

    protected FileEncoding(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static FileEncoding fromValue(String value) throws IllegalArgumentException {
        FileEncoding enumeration = (FileEncoding)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static FileEncoding fromString(String value) throws IllegalArgumentException {
        return FileEncoding.fromValue(value);
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
        return FileEncoding.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.filecabinet_2022_1.documents.webservices.netsuite.com", "FileEncoding"));
    }
}

