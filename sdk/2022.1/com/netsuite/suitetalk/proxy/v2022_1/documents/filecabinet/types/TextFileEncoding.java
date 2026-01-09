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

public class TextFileEncoding
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __big5 = "_big5";
    public static final String __gb2312 = "_gb2312";
    public static final String __gb18030 = "_gb18030";
    public static final String __iso88591 = "_iso88591";
    public static final String __macRoman = "_macRoman";
    public static final String __shiftJis = "_shiftJis";
    public static final String __utf8 = "_utf8";
    public static final String __windows1252 = "_windows1252";
    public static final TextFileEncoding _big5 = new TextFileEncoding("_big5");
    public static final TextFileEncoding _gb2312 = new TextFileEncoding("_gb2312");
    public static final TextFileEncoding _gb18030 = new TextFileEncoding("_gb18030");
    public static final TextFileEncoding _iso88591 = new TextFileEncoding("_iso88591");
    public static final TextFileEncoding _macRoman = new TextFileEncoding("_macRoman");
    public static final TextFileEncoding _shiftJis = new TextFileEncoding("_shiftJis");
    public static final TextFileEncoding _utf8 = new TextFileEncoding("_utf8");
    public static final TextFileEncoding _windows1252 = new TextFileEncoding("_windows1252");
    private static TypeDesc typeDesc = new TypeDesc(TextFileEncoding.class);

    protected TextFileEncoding(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static TextFileEncoding fromValue(String value) throws IllegalArgumentException {
        TextFileEncoding enumeration = (TextFileEncoding)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static TextFileEncoding fromString(String value) throws IllegalArgumentException {
        return TextFileEncoding.fromValue(value);
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
        return TextFileEncoding.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.filecabinet_2022_1.documents.webservices.netsuite.com", "TextFileEncoding"));
    }
}

