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

public class BillingScheduleMonthDow
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __sunday = "_sunday";
    public static final String __monday = "_monday";
    public static final String __tuesday = "_tuesday";
    public static final String __wednesday = "_wednesday";
    public static final String __thursday = "_thursday";
    public static final String __friday = "_friday";
    public static final String __saturday = "_saturday";
    public static final String __day = "_day";
    public static final BillingScheduleMonthDow _sunday = new BillingScheduleMonthDow("_sunday");
    public static final BillingScheduleMonthDow _monday = new BillingScheduleMonthDow("_monday");
    public static final BillingScheduleMonthDow _tuesday = new BillingScheduleMonthDow("_tuesday");
    public static final BillingScheduleMonthDow _wednesday = new BillingScheduleMonthDow("_wednesday");
    public static final BillingScheduleMonthDow _thursday = new BillingScheduleMonthDow("_thursday");
    public static final BillingScheduleMonthDow _friday = new BillingScheduleMonthDow("_friday");
    public static final BillingScheduleMonthDow _saturday = new BillingScheduleMonthDow("_saturday");
    public static final BillingScheduleMonthDow _day = new BillingScheduleMonthDow("_day");
    private static TypeDesc typeDesc = new TypeDesc(BillingScheduleMonthDow.class);

    protected BillingScheduleMonthDow(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static BillingScheduleMonthDow fromValue(String value) throws IllegalArgumentException {
        BillingScheduleMonthDow enumeration = (BillingScheduleMonthDow)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static BillingScheduleMonthDow fromString(String value) throws IllegalArgumentException {
        return BillingScheduleMonthDow.fromValue(value);
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
        return BillingScheduleMonthDow.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "BillingScheduleMonthDow"));
    }
}

