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

public class SitemapPriority
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __00 = "_00";
    public static final String __01 = "_01";
    public static final String __02 = "_02";
    public static final String __03 = "_03";
    public static final String __04 = "_04";
    public static final String __05 = "_05";
    public static final String __06 = "_06";
    public static final String __07 = "_07";
    public static final String __08 = "_08";
    public static final String __09 = "_09";
    public static final String __10 = "_10";
    public static final String __auto = "_auto";
    public static final SitemapPriority _00 = new SitemapPriority("_00");
    public static final SitemapPriority _01 = new SitemapPriority("_01");
    public static final SitemapPriority _02 = new SitemapPriority("_02");
    public static final SitemapPriority _03 = new SitemapPriority("_03");
    public static final SitemapPriority _04 = new SitemapPriority("_04");
    public static final SitemapPriority _05 = new SitemapPriority("_05");
    public static final SitemapPriority _06 = new SitemapPriority("_06");
    public static final SitemapPriority _07 = new SitemapPriority("_07");
    public static final SitemapPriority _08 = new SitemapPriority("_08");
    public static final SitemapPriority _09 = new SitemapPriority("_09");
    public static final SitemapPriority _10 = new SitemapPriority("_10");
    public static final SitemapPriority _auto = new SitemapPriority("_auto");
    private static TypeDesc typeDesc = new TypeDesc(SitemapPriority.class);

    protected SitemapPriority(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static SitemapPriority fromValue(String value) throws IllegalArgumentException {
        SitemapPriority enumeration = (SitemapPriority)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static SitemapPriority fromString(String value) throws IllegalArgumentException {
        return SitemapPriority.fromValue(value);
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
        return SitemapPriority.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "SitemapPriority"));
    }
}

