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

public class BillingScheduleYearDow
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
    public static final BillingScheduleYearDow _sunday = new BillingScheduleYearDow("_sunday");
    public static final BillingScheduleYearDow _monday = new BillingScheduleYearDow("_monday");
    public static final BillingScheduleYearDow _tuesday = new BillingScheduleYearDow("_tuesday");
    public static final BillingScheduleYearDow _wednesday = new BillingScheduleYearDow("_wednesday");
    public static final BillingScheduleYearDow _thursday = new BillingScheduleYearDow("_thursday");
    public static final BillingScheduleYearDow _friday = new BillingScheduleYearDow("_friday");
    public static final BillingScheduleYearDow _saturday = new BillingScheduleYearDow("_saturday");
    public static final BillingScheduleYearDow _day = new BillingScheduleYearDow("_day");
    private static TypeDesc typeDesc = new TypeDesc(BillingScheduleYearDow.class);

    protected BillingScheduleYearDow(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static BillingScheduleYearDow fromValue(String value) throws IllegalArgumentException {
        BillingScheduleYearDow enumeration = (BillingScheduleYearDow)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static BillingScheduleYearDow fromString(String value) throws IllegalArgumentException {
        return BillingScheduleYearDow.fromValue(value);
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
        return BillingScheduleYearDow.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "BillingScheduleYearDow"));
    }
}

