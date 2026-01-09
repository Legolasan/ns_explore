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

public class BillingScheduleYearMonth
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __january = "_january";
    public static final String __february = "_february";
    public static final String __march = "_march";
    public static final String __april = "_april";
    public static final String __may = "_may";
    public static final String __june = "_june";
    public static final String __july = "_july";
    public static final String __august = "_august";
    public static final String __september = "_september";
    public static final String __october = "_october";
    public static final String __november = "_november";
    public static final String __december = "_december";
    public static final BillingScheduleYearMonth _january = new BillingScheduleYearMonth("_january");
    public static final BillingScheduleYearMonth _february = new BillingScheduleYearMonth("_february");
    public static final BillingScheduleYearMonth _march = new BillingScheduleYearMonth("_march");
    public static final BillingScheduleYearMonth _april = new BillingScheduleYearMonth("_april");
    public static final BillingScheduleYearMonth _may = new BillingScheduleYearMonth("_may");
    public static final BillingScheduleYearMonth _june = new BillingScheduleYearMonth("_june");
    public static final BillingScheduleYearMonth _july = new BillingScheduleYearMonth("_july");
    public static final BillingScheduleYearMonth _august = new BillingScheduleYearMonth("_august");
    public static final BillingScheduleYearMonth _september = new BillingScheduleYearMonth("_september");
    public static final BillingScheduleYearMonth _october = new BillingScheduleYearMonth("_october");
    public static final BillingScheduleYearMonth _november = new BillingScheduleYearMonth("_november");
    public static final BillingScheduleYearMonth _december = new BillingScheduleYearMonth("_december");
    private static TypeDesc typeDesc = new TypeDesc(BillingScheduleYearMonth.class);

    protected BillingScheduleYearMonth(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static BillingScheduleYearMonth fromValue(String value) throws IllegalArgumentException {
        BillingScheduleYearMonth enumeration = (BillingScheduleYearMonth)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static BillingScheduleYearMonth fromString(String value) throws IllegalArgumentException {
        return BillingScheduleYearMonth.fromValue(value);
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
        return BillingScheduleYearMonth.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "BillingScheduleYearMonth"));
    }
}

