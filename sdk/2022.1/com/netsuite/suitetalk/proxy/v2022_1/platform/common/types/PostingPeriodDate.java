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
package com.netsuite.suitetalk.proxy.v2022_1.platform.common.types;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

public class PostingPeriodDate
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __firstFiscalQuarterOfLastFy = "_firstFiscalQuarterOfLastFy";
    public static final String __firstFiscalQuarterOfThisFy = "_firstFiscalQuarterOfThisFy";
    public static final String __fiscalQuarterBeforeLast = "_fiscalQuarterBeforeLast";
    public static final String __fiscalYearBeforeLast = "_fiscalYearBeforeLast";
    public static final String __fourthFiscalQuarterOfLastFy = "_fourthFiscalQuarterOfLastFy";
    public static final String __fourthFiscalQuarterOfThisFy = "_fourthFiscalQuarterOfThisFy";
    public static final String __lastFiscalQuarter = "_lastFiscalQuarter";
    public static final String __lastFiscalQuarterOneFiscalYearAgo = "_lastFiscalQuarterOneFiscalYearAgo";
    public static final String __lastFiscalQuarterToPeriod = "_lastFiscalQuarterToPeriod";
    public static final String __lastFiscalYear = "_lastFiscalYear";
    public static final String __lastFiscalYearToPeriod = "_lastFiscalYearToPeriod";
    public static final String __lastPeriod = "_lastPeriod";
    public static final String __lastPeriodOneFiscalQuarterAgo = "_lastPeriodOneFiscalQuarterAgo";
    public static final String __lastPeriodOneFiscalYearAgo = "_lastPeriodOneFiscalYearAgo";
    public static final String __lastRolling18periods = "_lastRolling18periods";
    public static final String __lastRolling6fiscalQuarters = "_lastRolling6fiscalQuarters";
    public static final String __periodBeforeLast = "_periodBeforeLast";
    public static final String __sameFiscalQuarterOfLastFy = "_sameFiscalQuarterOfLastFy";
    public static final String __sameFiscalQuarterOfLastFyToPeriod = "_sameFiscalQuarterOfLastFyToPeriod";
    public static final String __samePeriodOfLastFiscalQuarter = "_samePeriodOfLastFiscalQuarter";
    public static final String __samePeriodOfLastFy = "_samePeriodOfLastFy";
    public static final String __secondFiscalQuarterOfLastFy = "_secondFiscalQuarterOfLastFy";
    public static final String __secondFiscalQuarterOfThisFy = "_secondFiscalQuarterOfThisFy";
    public static final String __thirdFiscalQuarterOfLastFy = "_thirdFiscalQuarterOfLastFy";
    public static final String __thirdFiscalQuarterOfThisFy = "_thirdFiscalQuarterOfThisFy";
    public static final String __thisFiscalQuarter = "_thisFiscalQuarter";
    public static final String __thisFiscalQuarterToPeriod = "_thisFiscalQuarterToPeriod";
    public static final String __thisFiscalYear = "_thisFiscalYear";
    public static final String __thisFiscalYearToPeriod = "_thisFiscalYearToPeriod";
    public static final String __thisPeriod = "_thisPeriod";
    public static final PostingPeriodDate _firstFiscalQuarterOfLastFy = new PostingPeriodDate("_firstFiscalQuarterOfLastFy");
    public static final PostingPeriodDate _firstFiscalQuarterOfThisFy = new PostingPeriodDate("_firstFiscalQuarterOfThisFy");
    public static final PostingPeriodDate _fiscalQuarterBeforeLast = new PostingPeriodDate("_fiscalQuarterBeforeLast");
    public static final PostingPeriodDate _fiscalYearBeforeLast = new PostingPeriodDate("_fiscalYearBeforeLast");
    public static final PostingPeriodDate _fourthFiscalQuarterOfLastFy = new PostingPeriodDate("_fourthFiscalQuarterOfLastFy");
    public static final PostingPeriodDate _fourthFiscalQuarterOfThisFy = new PostingPeriodDate("_fourthFiscalQuarterOfThisFy");
    public static final PostingPeriodDate _lastFiscalQuarter = new PostingPeriodDate("_lastFiscalQuarter");
    public static final PostingPeriodDate _lastFiscalQuarterOneFiscalYearAgo = new PostingPeriodDate("_lastFiscalQuarterOneFiscalYearAgo");
    public static final PostingPeriodDate _lastFiscalQuarterToPeriod = new PostingPeriodDate("_lastFiscalQuarterToPeriod");
    public static final PostingPeriodDate _lastFiscalYear = new PostingPeriodDate("_lastFiscalYear");
    public static final PostingPeriodDate _lastFiscalYearToPeriod = new PostingPeriodDate("_lastFiscalYearToPeriod");
    public static final PostingPeriodDate _lastPeriod = new PostingPeriodDate("_lastPeriod");
    public static final PostingPeriodDate _lastPeriodOneFiscalQuarterAgo = new PostingPeriodDate("_lastPeriodOneFiscalQuarterAgo");
    public static final PostingPeriodDate _lastPeriodOneFiscalYearAgo = new PostingPeriodDate("_lastPeriodOneFiscalYearAgo");
    public static final PostingPeriodDate _lastRolling18periods = new PostingPeriodDate("_lastRolling18periods");
    public static final PostingPeriodDate _lastRolling6fiscalQuarters = new PostingPeriodDate("_lastRolling6fiscalQuarters");
    public static final PostingPeriodDate _periodBeforeLast = new PostingPeriodDate("_periodBeforeLast");
    public static final PostingPeriodDate _sameFiscalQuarterOfLastFy = new PostingPeriodDate("_sameFiscalQuarterOfLastFy");
    public static final PostingPeriodDate _sameFiscalQuarterOfLastFyToPeriod = new PostingPeriodDate("_sameFiscalQuarterOfLastFyToPeriod");
    public static final PostingPeriodDate _samePeriodOfLastFiscalQuarter = new PostingPeriodDate("_samePeriodOfLastFiscalQuarter");
    public static final PostingPeriodDate _samePeriodOfLastFy = new PostingPeriodDate("_samePeriodOfLastFy");
    public static final PostingPeriodDate _secondFiscalQuarterOfLastFy = new PostingPeriodDate("_secondFiscalQuarterOfLastFy");
    public static final PostingPeriodDate _secondFiscalQuarterOfThisFy = new PostingPeriodDate("_secondFiscalQuarterOfThisFy");
    public static final PostingPeriodDate _thirdFiscalQuarterOfLastFy = new PostingPeriodDate("_thirdFiscalQuarterOfLastFy");
    public static final PostingPeriodDate _thirdFiscalQuarterOfThisFy = new PostingPeriodDate("_thirdFiscalQuarterOfThisFy");
    public static final PostingPeriodDate _thisFiscalQuarter = new PostingPeriodDate("_thisFiscalQuarter");
    public static final PostingPeriodDate _thisFiscalQuarterToPeriod = new PostingPeriodDate("_thisFiscalQuarterToPeriod");
    public static final PostingPeriodDate _thisFiscalYear = new PostingPeriodDate("_thisFiscalYear");
    public static final PostingPeriodDate _thisFiscalYearToPeriod = new PostingPeriodDate("_thisFiscalYearToPeriod");
    public static final PostingPeriodDate _thisPeriod = new PostingPeriodDate("_thisPeriod");
    private static TypeDesc typeDesc = new TypeDesc(PostingPeriodDate.class);

    protected PostingPeriodDate(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static PostingPeriodDate fromValue(String value) throws IllegalArgumentException {
        PostingPeriodDate enumeration = (PostingPeriodDate)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static PostingPeriodDate fromString(String value) throws IllegalArgumentException {
        return PostingPeriodDate.fromValue(value);
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
        return PostingPeriodDate.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "PostingPeriodDate"));
    }
}

