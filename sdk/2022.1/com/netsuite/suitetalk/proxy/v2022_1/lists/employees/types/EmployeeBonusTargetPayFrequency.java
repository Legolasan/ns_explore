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

public class EmployeeBonusTargetPayFrequency
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __annually = "_annually";
    public static final String __monthly = "_monthly";
    public static final String __oneTime = "_oneTime";
    public static final String __quarterly = "_quarterly";
    public static final EmployeeBonusTargetPayFrequency _annually = new EmployeeBonusTargetPayFrequency("_annually");
    public static final EmployeeBonusTargetPayFrequency _monthly = new EmployeeBonusTargetPayFrequency("_monthly");
    public static final EmployeeBonusTargetPayFrequency _oneTime = new EmployeeBonusTargetPayFrequency("_oneTime");
    public static final EmployeeBonusTargetPayFrequency _quarterly = new EmployeeBonusTargetPayFrequency("_quarterly");
    private static TypeDesc typeDesc = new TypeDesc(EmployeeBonusTargetPayFrequency.class);

    protected EmployeeBonusTargetPayFrequency(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static EmployeeBonusTargetPayFrequency fromValue(String value) throws IllegalArgumentException {
        EmployeeBonusTargetPayFrequency enumeration = (EmployeeBonusTargetPayFrequency)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static EmployeeBonusTargetPayFrequency fromString(String value) throws IllegalArgumentException {
        return EmployeeBonusTargetPayFrequency.fromValue(value);
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
        return EmployeeBonusTargetPayFrequency.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.employees_2022_1.lists.webservices.netsuite.com", "EmployeeBonusTargetPayFrequency"));
    }
}

