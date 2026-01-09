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
package com.netsuite.suitetalk.proxy.v2022_1.transactions.sales.types;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

public class ForecastType
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __omitted = "_omitted";
    public static final String __worstCase = "_worstCase";
    public static final String __mostLikely = "_mostLikely";
    public static final String __upside = "_upside";
    public static final ForecastType _omitted = new ForecastType("_omitted");
    public static final ForecastType _worstCase = new ForecastType("_worstCase");
    public static final ForecastType _mostLikely = new ForecastType("_mostLikely");
    public static final ForecastType _upside = new ForecastType("_upside");
    private static TypeDesc typeDesc = new TypeDesc(ForecastType.class);

    protected ForecastType(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static ForecastType fromValue(String value) throws IllegalArgumentException {
        ForecastType enumeration = (ForecastType)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static ForecastType fromString(String value) throws IllegalArgumentException {
        return ForecastType.fromValue(value);
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
        return ForecastType.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.sales_2022_1.transactions.webservices.netsuite.com", "ForecastType"));
    }
}

