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
package com.netsuite.suitetalk.proxy.v2022_1.lists.employees.types;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

public class EmployeePayFrequency
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
    public static final EmployeePayFrequency _annually = new EmployeePayFrequency("_annually");
    public static final EmployeePayFrequency _custom = new EmployeePayFrequency("_custom");
    public static final EmployeePayFrequency _daily = new EmployeePayFrequency("_daily");
    public static final EmployeePayFrequency _endOfPeriod = new EmployeePayFrequency("_endOfPeriod");
    public static final EmployeePayFrequency _everyFourWeeks = new EmployeePayFrequency("_everyFourWeeks");
    public static final EmployeePayFrequency _everyThreeYears = new EmployeePayFrequency("_everyThreeYears");
    public static final EmployeePayFrequency _everyTwoMonths = new EmployeePayFrequency("_everyTwoMonths");
    public static final EmployeePayFrequency _everyTwoWeeks = new EmployeePayFrequency("_everyTwoWeeks");
    public static final EmployeePayFrequency _everyTwoYears = new EmployeePayFrequency("_everyTwoYears");
    public static final EmployeePayFrequency _hourly = new EmployeePayFrequency("_hourly");
    public static final EmployeePayFrequency _monthly = new EmployeePayFrequency("_monthly");
    public static final EmployeePayFrequency _never = new EmployeePayFrequency("_never");
    public static final EmployeePayFrequency _oneTime = new EmployeePayFrequency("_oneTime");
    public static final EmployeePayFrequency _quarterly = new EmployeePayFrequency("_quarterly");
    public static final EmployeePayFrequency _startOfPeriod = new EmployeePayFrequency("_startOfPeriod");
    public static final EmployeePayFrequency _twiceAMonth = new EmployeePayFrequency("_twiceAMonth");
    public static final EmployeePayFrequency _twiceAYear = new EmployeePayFrequency("_twiceAYear");
    public static final EmployeePayFrequency _weekly = new EmployeePayFrequency("_weekly");
    private static TypeDesc typeDesc = new TypeDesc(EmployeePayFrequency.class);

    protected EmployeePayFrequency(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static EmployeePayFrequency fromValue(String value) throws IllegalArgumentException {
        EmployeePayFrequency enumeration = (EmployeePayFrequency)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static EmployeePayFrequency fromString(String value) throws IllegalArgumentException {
        return EmployeePayFrequency.fromValue(value);
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
        return EmployeePayFrequency.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.employees_2022_1.lists.webservices.netsuite.com", "EmployeePayFrequency"));
    }
}

