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
package com.netsuite.suitetalk.proxy.v2022_1.transactions.demandplanning.types;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

public class DemandPlanMonth
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __april = "_april";
    public static final String __august = "_august";
    public static final String __december = "_december";
    public static final String __february = "_february";
    public static final String __january = "_january";
    public static final String __july = "_july";
    public static final String __june = "_june";
    public static final String __march = "_march";
    public static final String __may = "_may";
    public static final String __november = "_november";
    public static final String __october = "_october";
    public static final String __september = "_september";
    public static final DemandPlanMonth _april = new DemandPlanMonth("_april");
    public static final DemandPlanMonth _august = new DemandPlanMonth("_august");
    public static final DemandPlanMonth _december = new DemandPlanMonth("_december");
    public static final DemandPlanMonth _february = new DemandPlanMonth("_february");
    public static final DemandPlanMonth _january = new DemandPlanMonth("_january");
    public static final DemandPlanMonth _july = new DemandPlanMonth("_july");
    public static final DemandPlanMonth _june = new DemandPlanMonth("_june");
    public static final DemandPlanMonth _march = new DemandPlanMonth("_march");
    public static final DemandPlanMonth _may = new DemandPlanMonth("_may");
    public static final DemandPlanMonth _november = new DemandPlanMonth("_november");
    public static final DemandPlanMonth _october = new DemandPlanMonth("_october");
    public static final DemandPlanMonth _september = new DemandPlanMonth("_september");
    private static TypeDesc typeDesc = new TypeDesc(DemandPlanMonth.class);

    protected DemandPlanMonth(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static DemandPlanMonth fromValue(String value) throws IllegalArgumentException {
        DemandPlanMonth enumeration = (DemandPlanMonth)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static DemandPlanMonth fromString(String value) throws IllegalArgumentException {
        return DemandPlanMonth.fromValue(value);
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
        return DemandPlanMonth.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.demandplanning_2022_1.transactions.webservices.netsuite.com", "DemandPlanMonth"));
    }
}

