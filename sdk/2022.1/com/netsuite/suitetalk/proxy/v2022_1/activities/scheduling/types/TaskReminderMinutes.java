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

public class TaskReminderMinutes
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
    public static final TaskReminderMinutes _0minutes = new TaskReminderMinutes("_0minutes");
    public static final TaskReminderMinutes _10minutes = new TaskReminderMinutes("_10minutes");
    public static final TaskReminderMinutes _12hours = new TaskReminderMinutes("_12hours");
    public static final TaskReminderMinutes _15minutes = new TaskReminderMinutes("_15minutes");
    public static final TaskReminderMinutes _1day = new TaskReminderMinutes("_1day");
    public static final TaskReminderMinutes _1hour = new TaskReminderMinutes("_1hour");
    public static final TaskReminderMinutes _1week = new TaskReminderMinutes("_1week");
    public static final TaskReminderMinutes _2days = new TaskReminderMinutes("_2days");
    public static final TaskReminderMinutes _2hours = new TaskReminderMinutes("_2hours");
    public static final TaskReminderMinutes _30minutes = new TaskReminderMinutes("_30minutes");
    public static final TaskReminderMinutes _3days = new TaskReminderMinutes("_3days");
    public static final TaskReminderMinutes _3hours = new TaskReminderMinutes("_3hours");
    public static final TaskReminderMinutes _4hours = new TaskReminderMinutes("_4hours");
    public static final TaskReminderMinutes _5hours = new TaskReminderMinutes("_5hours");
    public static final TaskReminderMinutes _5minutes = new TaskReminderMinutes("_5minutes");
    public static final TaskReminderMinutes _8hours = new TaskReminderMinutes("_8hours");
    private static TypeDesc typeDesc = new TypeDesc(TaskReminderMinutes.class);

    protected TaskReminderMinutes(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static TaskReminderMinutes fromValue(String value) throws IllegalArgumentException {
        TaskReminderMinutes enumeration = (TaskReminderMinutes)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static TaskReminderMinutes fromString(String value) throws IllegalArgumentException {
        return TaskReminderMinutes.fromValue(value);
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
        return TaskReminderMinutes.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.scheduling_2022_1.activities.webservices.netsuite.com", "TaskReminderMinutes"));
    }
}

