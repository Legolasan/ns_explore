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

public class BillingScheduleFrequency
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __annually = "_annually";
    public static final String __custom = "_custom";
    public static final String __daily = "_daily";
    public static final String __endOfPeriod = "_endOfPeriod";
    public static final String __monthly = "_monthly";
    public static final String __never = "_never";
    public static final String __oneTime = "_oneTime";
    public static final String __quarterly = "_quarterly";
    public static final String __startOfPeriod = "_startOfPeriod";
    public static final String __weekly = "_weekly";
    public static final BillingScheduleFrequency _annually = new BillingScheduleFrequency("_annually");
    public static final BillingScheduleFrequency _custom = new BillingScheduleFrequency("_custom");
    public static final BillingScheduleFrequency _daily = new BillingScheduleFrequency("_daily");
    public static final BillingScheduleFrequency _endOfPeriod = new BillingScheduleFrequency("_endOfPeriod");
    public static final BillingScheduleFrequency _monthly = new BillingScheduleFrequency("_monthly");
    public static final BillingScheduleFrequency _never = new BillingScheduleFrequency("_never");
    public static final BillingScheduleFrequency _oneTime = new BillingScheduleFrequency("_oneTime");
    public static final BillingScheduleFrequency _quarterly = new BillingScheduleFrequency("_quarterly");
    public static final BillingScheduleFrequency _startOfPeriod = new BillingScheduleFrequency("_startOfPeriod");
    public static final BillingScheduleFrequency _weekly = new BillingScheduleFrequency("_weekly");
    private static TypeDesc typeDesc = new TypeDesc(BillingScheduleFrequency.class);

    protected BillingScheduleFrequency(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static BillingScheduleFrequency fromValue(String value) throws IllegalArgumentException {
        BillingScheduleFrequency enumeration = (BillingScheduleFrequency)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static BillingScheduleFrequency fromString(String value) throws IllegalArgumentException {
        return BillingScheduleFrequency.fromValue(value);
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
        return BillingScheduleFrequency.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "BillingScheduleFrequency"));
    }
}

