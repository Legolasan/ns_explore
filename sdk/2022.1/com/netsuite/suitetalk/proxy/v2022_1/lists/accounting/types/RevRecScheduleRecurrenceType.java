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
package com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.types;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

public class RevRecScheduleRecurrenceType
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __custom = "_custom";
    public static final String __straightLineByEvenPeriods = "_straightLineByEvenPeriods";
    public static final String __straightLineProrateFirstAndLastPeriod = "_straightLineProrateFirstAndLastPeriod";
    public static final String __straightLineProrateFirstAndLastPeriodPeriodRate = "_straightLineProrateFirstAndLastPeriodPeriodRate";
    public static final String __straightLineUsingExactDays = "_straightLineUsingExactDays";
    public static final RevRecScheduleRecurrenceType _custom = new RevRecScheduleRecurrenceType("_custom");
    public static final RevRecScheduleRecurrenceType _straightLineByEvenPeriods = new RevRecScheduleRecurrenceType("_straightLineByEvenPeriods");
    public static final RevRecScheduleRecurrenceType _straightLineProrateFirstAndLastPeriod = new RevRecScheduleRecurrenceType("_straightLineProrateFirstAndLastPeriod");
    public static final RevRecScheduleRecurrenceType _straightLineProrateFirstAndLastPeriodPeriodRate = new RevRecScheduleRecurrenceType("_straightLineProrateFirstAndLastPeriodPeriodRate");
    public static final RevRecScheduleRecurrenceType _straightLineUsingExactDays = new RevRecScheduleRecurrenceType("_straightLineUsingExactDays");
    private static TypeDesc typeDesc = new TypeDesc(RevRecScheduleRecurrenceType.class);

    protected RevRecScheduleRecurrenceType(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static RevRecScheduleRecurrenceType fromValue(String value) throws IllegalArgumentException {
        RevRecScheduleRecurrenceType enumeration = (RevRecScheduleRecurrenceType)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static RevRecScheduleRecurrenceType fromString(String value) throws IllegalArgumentException {
        return RevRecScheduleRecurrenceType.fromValue(value);
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
        return RevRecScheduleRecurrenceType.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "RevRecScheduleRecurrenceType"));
    }
}

