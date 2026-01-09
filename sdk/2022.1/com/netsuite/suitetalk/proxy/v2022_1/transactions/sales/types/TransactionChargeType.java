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

public class TransactionChargeType
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __concession = "_concession";
    public static final String __fixedDate = "_fixedDate";
    public static final String __fixedUsage = "_fixedUsage";
    public static final String __milestone = "_milestone";
    public static final String __oneTime = "_oneTime";
    public static final String __penalty = "_penalty";
    public static final String __projectProgress = "_projectProgress";
    public static final String __recurringService = "_recurringService";
    public static final String __timeBased = "_timeBased";
    public static final String __variableUsage = "_variableUsage";
    public static final TransactionChargeType _concession = new TransactionChargeType("_concession");
    public static final TransactionChargeType _fixedDate = new TransactionChargeType("_fixedDate");
    public static final TransactionChargeType _fixedUsage = new TransactionChargeType("_fixedUsage");
    public static final TransactionChargeType _milestone = new TransactionChargeType("_milestone");
    public static final TransactionChargeType _oneTime = new TransactionChargeType("_oneTime");
    public static final TransactionChargeType _penalty = new TransactionChargeType("_penalty");
    public static final TransactionChargeType _projectProgress = new TransactionChargeType("_projectProgress");
    public static final TransactionChargeType _recurringService = new TransactionChargeType("_recurringService");
    public static final TransactionChargeType _timeBased = new TransactionChargeType("_timeBased");
    public static final TransactionChargeType _variableUsage = new TransactionChargeType("_variableUsage");
    private static TypeDesc typeDesc = new TypeDesc(TransactionChargeType.class);

    protected TransactionChargeType(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static TransactionChargeType fromValue(String value) throws IllegalArgumentException {
        TransactionChargeType enumeration = (TransactionChargeType)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static TransactionChargeType fromString(String value) throws IllegalArgumentException {
        return TransactionChargeType.fromValue(value);
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
        return TransactionChargeType.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.sales_2022_1.transactions.webservices.netsuite.com", "TransactionChargeType"));
    }
}

