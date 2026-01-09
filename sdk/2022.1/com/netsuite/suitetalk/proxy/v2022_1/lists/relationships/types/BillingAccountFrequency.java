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
package com.netsuite.suitetalk.proxy.v2022_1.lists.relationships.types;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

public class BillingAccountFrequency
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __annually = "_annually";
    public static final String __custom = "_custom";
    public static final String __daily = "_daily";
    public static final String __endOfPeriod = "_endOfPeriod";
    public static final String __everyFourWeeks = "_everyFourWeeks";
    public static final String __everyThreeYears = "_everyThreeYears";
    public static final String __everyTwoMonths = "_everyTwoMonths";
    public static final String __everyTwoWeeks = "_everyTwoWeeks";
    public static final String __everyTwoYears = "_everyTwoYears";
    public static final String __hourly = "_hourly";
    public static final String __monthly = "_monthly";
    public static final String __never = "_never";
    public static final String __oneTime = "_oneTime";
    public static final String __quarterly = "_quarterly";
    public static final String __startOfPeriod = "_startOfPeriod";
    public static final String __twiceAMonth = "_twiceAMonth";
    public static final String __twiceAYear = "_twiceAYear";
    public static final String __weekly = "_weekly";
    public static final BillingAccountFrequency _annually = new BillingAccountFrequency("_annually");
    public static final BillingAccountFrequency _custom = new BillingAccountFrequency("_custom");
    public static final BillingAccountFrequency _daily = new BillingAccountFrequency("_daily");
    public static final BillingAccountFrequency _endOfPeriod = new BillingAccountFrequency("_endOfPeriod");
    public static final BillingAccountFrequency _everyFourWeeks = new BillingAccountFrequency("_everyFourWeeks");
    public static final BillingAccountFrequency _everyThreeYears = new BillingAccountFrequency("_everyThreeYears");
    public static final BillingAccountFrequency _everyTwoMonths = new BillingAccountFrequency("_everyTwoMonths");
    public static final BillingAccountFrequency _everyTwoWeeks = new BillingAccountFrequency("_everyTwoWeeks");
    public static final BillingAccountFrequency _everyTwoYears = new BillingAccountFrequency("_everyTwoYears");
    public static final BillingAccountFrequency _hourly = new BillingAccountFrequency("_hourly");
    public static final BillingAccountFrequency _monthly = new BillingAccountFrequency("_monthly");
    public static final BillingAccountFrequency _never = new BillingAccountFrequency("_never");
    public static final BillingAccountFrequency _oneTime = new BillingAccountFrequency("_oneTime");
    public static final BillingAccountFrequency _quarterly = new BillingAccountFrequency("_quarterly");
    public static final BillingAccountFrequency _startOfPeriod = new BillingAccountFrequency("_startOfPeriod");
    public static final BillingAccountFrequency _twiceAMonth = new BillingAccountFrequency("_twiceAMonth");
    public static final BillingAccountFrequency _twiceAYear = new BillingAccountFrequency("_twiceAYear");
    public static final BillingAccountFrequency _weekly = new BillingAccountFrequency("_weekly");
    private static TypeDesc typeDesc = new TypeDesc(BillingAccountFrequency.class);

    protected BillingAccountFrequency(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static BillingAccountFrequency fromValue(String value) throws IllegalArgumentException {
        BillingAccountFrequency enumeration = (BillingAccountFrequency)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static BillingAccountFrequency fromString(String value) throws IllegalArgumentException {
        return BillingAccountFrequency.fromValue(value);
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
        return BillingAccountFrequency.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.relationships_2022_1.lists.webservices.netsuite.com", "BillingAccountFrequency"));
    }
}

