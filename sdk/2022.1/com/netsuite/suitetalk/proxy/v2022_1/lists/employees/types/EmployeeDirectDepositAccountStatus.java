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

public class EmployeeDirectDepositAccountStatus
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __active = "_active";
    public static final String __pending = "_pending";
    public static final String __verifying = "_verifying";
    public static final String __failed = "_failed";
    public static final String __inactive = "_inactive";
    public static final EmployeeDirectDepositAccountStatus _active = new EmployeeDirectDepositAccountStatus("_active");
    public static final EmployeeDirectDepositAccountStatus _pending = new EmployeeDirectDepositAccountStatus("_pending");
    public static final EmployeeDirectDepositAccountStatus _verifying = new EmployeeDirectDepositAccountStatus("_verifying");
    public static final EmployeeDirectDepositAccountStatus _failed = new EmployeeDirectDepositAccountStatus("_failed");
    public static final EmployeeDirectDepositAccountStatus _inactive = new EmployeeDirectDepositAccountStatus("_inactive");
    private static TypeDesc typeDesc = new TypeDesc(EmployeeDirectDepositAccountStatus.class);

    protected EmployeeDirectDepositAccountStatus(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static EmployeeDirectDepositAccountStatus fromValue(String value) throws IllegalArgumentException {
        EmployeeDirectDepositAccountStatus enumeration = (EmployeeDirectDepositAccountStatus)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static EmployeeDirectDepositAccountStatus fromString(String value) throws IllegalArgumentException {
        return EmployeeDirectDepositAccountStatus.fromValue(value);
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
        return EmployeeDirectDepositAccountStatus.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.employees_2022_1.lists.webservices.netsuite.com", "EmployeeDirectDepositAccountStatus"));
    }
}

