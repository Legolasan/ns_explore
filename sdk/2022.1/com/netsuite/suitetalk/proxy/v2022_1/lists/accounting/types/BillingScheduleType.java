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

public class BillingScheduleType
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __chargeBased = "_chargeBased";
    public static final String __fixedBidInterval = "_fixedBidInterval";
    public static final String __fixedBidMilestone = "_fixedBidMilestone";
    public static final String __standard = "_standard";
    public static final String __timeAndMaterials = "_timeAndMaterials";
    public static final BillingScheduleType _chargeBased = new BillingScheduleType("_chargeBased");
    public static final BillingScheduleType _fixedBidInterval = new BillingScheduleType("_fixedBidInterval");
    public static final BillingScheduleType _fixedBidMilestone = new BillingScheduleType("_fixedBidMilestone");
    public static final BillingScheduleType _standard = new BillingScheduleType("_standard");
    public static final BillingScheduleType _timeAndMaterials = new BillingScheduleType("_timeAndMaterials");
    private static TypeDesc typeDesc = new TypeDesc(BillingScheduleType.class);

    protected BillingScheduleType(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static BillingScheduleType fromValue(String value) throws IllegalArgumentException {
        BillingScheduleType enumeration = (BillingScheduleType)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static BillingScheduleType fromString(String value) throws IllegalArgumentException {
        return BillingScheduleType.fromValue(value);
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
        return BillingScheduleType.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "BillingScheduleType"));
    }
}

