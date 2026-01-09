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

public class TermRecurrenceFrequency
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __annually = "_annually";
    public static final String __daily = "_daily";
    public static final String __monthly = "_monthly";
    public static final String __weekly = "_weekly";
    public static final TermRecurrenceFrequency _annually = new TermRecurrenceFrequency("_annually");
    public static final TermRecurrenceFrequency _daily = new TermRecurrenceFrequency("_daily");
    public static final TermRecurrenceFrequency _monthly = new TermRecurrenceFrequency("_monthly");
    public static final TermRecurrenceFrequency _weekly = new TermRecurrenceFrequency("_weekly");
    private static TypeDesc typeDesc = new TypeDesc(TermRecurrenceFrequency.class);

    protected TermRecurrenceFrequency(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static TermRecurrenceFrequency fromValue(String value) throws IllegalArgumentException {
        TermRecurrenceFrequency enumeration = (TermRecurrenceFrequency)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static TermRecurrenceFrequency fromString(String value) throws IllegalArgumentException {
        return TermRecurrenceFrequency.fromValue(value);
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
        return TermRecurrenceFrequency.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "TermRecurrenceFrequency"));
    }
}

