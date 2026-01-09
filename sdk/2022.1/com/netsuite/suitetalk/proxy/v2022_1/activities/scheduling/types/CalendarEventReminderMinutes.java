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

public class CalendarEventReminderMinutes
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __none = "_none";
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
    public static final CalendarEventReminderMinutes _none = new CalendarEventReminderMinutes("_none");
    public static final CalendarEventReminderMinutes _0minutes = new CalendarEventReminderMinutes("_0minutes");
    public static final CalendarEventReminderMinutes _10minutes = new CalendarEventReminderMinutes("_10minutes");
    public static final CalendarEventReminderMinutes _12hours = new CalendarEventReminderMinutes("_12hours");
    public static final CalendarEventReminderMinutes _15minutes = new CalendarEventReminderMinutes("_15minutes");
    public static final CalendarEventReminderMinutes _1day = new CalendarEventReminderMinutes("_1day");
    public static final CalendarEventReminderMinutes _1hour = new CalendarEventReminderMinutes("_1hour");
    public static final CalendarEventReminderMinutes _1week = new CalendarEventReminderMinutes("_1week");
    public static final CalendarEventReminderMinutes _2days = new CalendarEventReminderMinutes("_2days");
    public static final CalendarEventReminderMinutes _2hours = new CalendarEventReminderMinutes("_2hours");
    public static final CalendarEventReminderMinutes _30minutes = new CalendarEventReminderMinutes("_30minutes");
    public static final CalendarEventReminderMinutes _3days = new CalendarEventReminderMinutes("_3days");
    public static final CalendarEventReminderMinutes _3hours = new CalendarEventReminderMinutes("_3hours");
    public static final CalendarEventReminderMinutes _4hours = new CalendarEventReminderMinutes("_4hours");
    public static final CalendarEventReminderMinutes _5hours = new CalendarEventReminderMinutes("_5hours");
    public static final CalendarEventReminderMinutes _5minutes = new CalendarEventReminderMinutes("_5minutes");
    public static final CalendarEventReminderMinutes _8hours = new CalendarEventReminderMinutes("_8hours");
    private static TypeDesc typeDesc = new TypeDesc(CalendarEventReminderMinutes.class);

    protected CalendarEventReminderMinutes(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static CalendarEventReminderMinutes fromValue(String value) throws IllegalArgumentException {
        CalendarEventReminderMinutes enumeration = (CalendarEventReminderMinutes)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static CalendarEventReminderMinutes fromString(String value) throws IllegalArgumentException {
        return CalendarEventReminderMinutes.fromValue(value);
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
        return CalendarEventReminderMinutes.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.scheduling_2022_1.activities.webservices.netsuite.com", "CalendarEventReminderMinutes"));
    }
}

