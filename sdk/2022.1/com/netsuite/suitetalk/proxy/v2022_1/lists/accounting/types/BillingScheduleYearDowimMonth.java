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

public class BillingScheduleYearDowimMonth
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
    public static final BillingScheduleYearDowimMonth _january = new BillingScheduleYearDowimMonth("_january");
    public static final BillingScheduleYearDowimMonth _february = new BillingScheduleYearDowimMonth("_february");
    public static final BillingScheduleYearDowimMonth _march = new BillingScheduleYearDowimMonth("_march");
    public static final BillingScheduleYearDowimMonth _april = new BillingScheduleYearDowimMonth("_april");
    public static final BillingScheduleYearDowimMonth _may = new BillingScheduleYearDowimMonth("_may");
    public static final BillingScheduleYearDowimMonth _june = new BillingScheduleYearDowimMonth("_june");
    public static final BillingScheduleYearDowimMonth _july = new BillingScheduleYearDowimMonth("_july");
    public static final BillingScheduleYearDowimMonth _august = new BillingScheduleYearDowimMonth("_august");
    public static final BillingScheduleYearDowimMonth _september = new BillingScheduleYearDowimMonth("_september");
    public static final BillingScheduleYearDowimMonth _october = new BillingScheduleYearDowimMonth("_october");
    public static final BillingScheduleYearDowimMonth _november = new BillingScheduleYearDowimMonth("_november");
    public static final BillingScheduleYearDowimMonth _december = new BillingScheduleYearDowimMonth("_december");
    private static TypeDesc typeDesc = new TypeDesc(BillingScheduleYearDowimMonth.class);

    protected BillingScheduleYearDowimMonth(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static BillingScheduleYearDowimMonth fromValue(String value) throws IllegalArgumentException {
        BillingScheduleYearDowimMonth enumeration = (BillingScheduleYearDowimMonth)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static BillingScheduleYearDowimMonth fromString(String value) throws IllegalArgumentException {
        return BillingScheduleYearDowimMonth.fromValue(value);
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
        return BillingScheduleYearDowimMonth.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "BillingScheduleYearDowimMonth"));
    }
}

