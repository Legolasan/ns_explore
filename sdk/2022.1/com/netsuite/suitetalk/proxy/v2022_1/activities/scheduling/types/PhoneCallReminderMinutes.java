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
package com.netsuite.suitetalk.proxy.v2022_1.activities.scheduling.types;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

public class PhoneCallReminderMinutes
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __0minutes = "_0minutes";
    public static final String __10minutes = "_10minutes";
    public static final String __12hours = "_12hours";
    public static final String __15minutes = "_15minutes";
    public static final String __1day = "_1day";
    public static final String __1hour = "_1hour";
    public static final String __1week = "_1week";
    public static final String __2days = "_2days";
    public static final String __2hours = "_2hours";
    public static final String __30minutes = "_30minutes";
    public static final String __3days = "_3days";
    public static final String __3hours = "_3hours";
    public static final String __4hours = "_4hours";
    public static final String __5hours = "_5hours";
    public static final String __5minutes = "_5minutes";
    public static final String __8hours = "_8hours";
    public static final PhoneCallReminderMinutes _0minutes = new PhoneCallReminderMinutes("_0minutes");
    public static final PhoneCallReminderMinutes _10minutes = new PhoneCallReminderMinutes("_10minutes");
    public static final PhoneCallReminderMinutes _12hours = new PhoneCallReminderMinutes("_12hours");
    public static final PhoneCallReminderMinutes _15minutes = new PhoneCallReminderMinutes("_15minutes");
    public static final PhoneCallReminderMinutes _1day = new PhoneCallReminderMinutes("_1day");
    public static final PhoneCallReminderMinutes _1hour = new PhoneCallReminderMinutes("_1hour");
    public static final PhoneCallReminderMinutes _1week = new PhoneCallReminderMinutes("_1week");
    public static final PhoneCallReminderMinutes _2days = new PhoneCallReminderMinutes("_2days");
    public static final PhoneCallReminderMinutes _2hours = new PhoneCallReminderMinutes("_2hours");
    public static final PhoneCallReminderMinutes _30minutes = new PhoneCallReminderMinutes("_30minutes");
    public static final PhoneCallReminderMinutes _3days = new PhoneCallReminderMinutes("_3days");
    public static final PhoneCallReminderMinutes _3hours = new PhoneCallReminderMinutes("_3hours");
    public static final PhoneCallReminderMinutes _4hours = new PhoneCallReminderMinutes("_4hours");
    public static final PhoneCallReminderMinutes _5hours = new PhoneCallReminderMinutes("_5hours");
    public static final PhoneCallReminderMinutes _5minutes = new PhoneCallReminderMinutes("_5minutes");
    public static final PhoneCallReminderMinutes _8hours = new PhoneCallReminderMinutes("_8hours");
    private static TypeDesc typeDesc = new TypeDesc(PhoneCallReminderMinutes.class);

    protected PhoneCallReminderMinutes(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static PhoneCallReminderMinutes fromValue(String value) throws IllegalArgumentException {
        PhoneCallReminderMinutes enumeration = (PhoneCallReminderMinutes)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static PhoneCallReminderMinutes fromString(String value) throws IllegalArgumentException {
        return PhoneCallReminderMinutes.fromValue(value);
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
        return PhoneCallReminderMinutes.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.scheduling_2022_1.activities.webservices.netsuite.com", "PhoneCallReminderMinutes"));
    }
}

