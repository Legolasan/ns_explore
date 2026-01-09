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
package com.netsuite.suitetalk.proxy.v2022_1.lists.support.types;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

public class SupportCaseStatusStage
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __closed = "_closed";
    public static final String __escalated = "_escalated";
    public static final String __open = "_open";
    public static final SupportCaseStatusStage _closed = new SupportCaseStatusStage("_closed");
    public static final SupportCaseStatusStage _escalated = new SupportCaseStatusStage("_escalated");
    public static final SupportCaseStatusStage _open = new SupportCaseStatusStage("_open");
    private static TypeDesc typeDesc = new TypeDesc(SupportCaseStatusStage.class);

    protected SupportCaseStatusStage(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static SupportCaseStatusStage fromValue(String value) throws IllegalArgumentException {
        SupportCaseStatusStage enumeration = (SupportCaseStatusStage)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static SupportCaseStatusStage fromString(String value) throws IllegalArgumentException {
        return SupportCaseStatusStage.fromValue(value);
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
        return SupportCaseStatusStage.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.support_2022_1.lists.webservices.netsuite.com", "SupportCaseStatusStage"));
    }
}

