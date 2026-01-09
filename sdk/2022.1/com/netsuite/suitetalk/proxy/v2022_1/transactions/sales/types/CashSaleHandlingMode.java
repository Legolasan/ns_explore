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

public class CashSaleHandlingMode
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __process = "_process";
    public static final String __recordExternalEvent = "_recordExternalEvent";
    public static final String __saveOnly = "_saveOnly";
    public static final CashSaleHandlingMode _process = new CashSaleHandlingMode("_process");
    public static final CashSaleHandlingMode _recordExternalEvent = new CashSaleHandlingMode("_recordExternalEvent");
    public static final CashSaleHandlingMode _saveOnly = new CashSaleHandlingMode("_saveOnly");
    private static TypeDesc typeDesc = new TypeDesc(CashSaleHandlingMode.class);

    protected CashSaleHandlingMode(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static CashSaleHandlingMode fromValue(String value) throws IllegalArgumentException {
        CashSaleHandlingMode enumeration = (CashSaleHandlingMode)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static CashSaleHandlingMode fromString(String value) throws IllegalArgumentException {
        return CashSaleHandlingMode.fromValue(value);
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
        return CashSaleHandlingMode.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.sales_2022_1.transactions.webservices.netsuite.com", "CashSaleHandlingMode"));
    }
}

