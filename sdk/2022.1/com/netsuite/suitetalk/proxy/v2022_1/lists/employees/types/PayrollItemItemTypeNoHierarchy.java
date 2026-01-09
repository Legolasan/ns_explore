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

public class PayrollItemItemTypeNoHierarchy
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __addition = "_addition";
    public static final String __commission = "_commission";
    public static final String __deduction = "_deduction";
    public static final String __directDeposit = "_directDeposit";
    public static final String __disability = "_disability";
    public static final String __earning = "_earning";
    public static final String __employerContribution = "_employerContribution";
    public static final String __expense = "_expense";
    public static final String __federal = "_federal";
    public static final String __medicare = "_medicare";
    public static final String __other = "_other";
    public static final String __salary = "_salary";
    public static final String __sick = "_sick";
    public static final String __socialSecurity = "_socialSecurity";
    public static final String __state = "_state";
    public static final String __tax = "_tax";
    public static final String __unemployment = "_unemployment";
    public static final String __vacation = "_vacation";
    public static final String __wage = "_wage";
    public static final PayrollItemItemTypeNoHierarchy _addition = new PayrollItemItemTypeNoHierarchy("_addition");
    public static final PayrollItemItemTypeNoHierarchy _commission = new PayrollItemItemTypeNoHierarchy("_commission");
    public static final PayrollItemItemTypeNoHierarchy _deduction = new PayrollItemItemTypeNoHierarchy("_deduction");
    public static final PayrollItemItemTypeNoHierarchy _directDeposit = new PayrollItemItemTypeNoHierarchy("_directDeposit");
    public static final PayrollItemItemTypeNoHierarchy _disability = new PayrollItemItemTypeNoHierarchy("_disability");
    public static final PayrollItemItemTypeNoHierarchy _earning = new PayrollItemItemTypeNoHierarchy("_earning");
    public static final PayrollItemItemTypeNoHierarchy _employerContribution = new PayrollItemItemTypeNoHierarchy("_employerContribution");
    public static final PayrollItemItemTypeNoHierarchy _expense = new PayrollItemItemTypeNoHierarchy("_expense");
    public static final PayrollItemItemTypeNoHierarchy _federal = new PayrollItemItemTypeNoHierarchy("_federal");
    public static final PayrollItemItemTypeNoHierarchy _medicare = new PayrollItemItemTypeNoHierarchy("_medicare");
    public static final PayrollItemItemTypeNoHierarchy _other = new PayrollItemItemTypeNoHierarchy("_other");
    public static final PayrollItemItemTypeNoHierarchy _salary = new PayrollItemItemTypeNoHierarchy("_salary");
    public static final PayrollItemItemTypeNoHierarchy _sick = new PayrollItemItemTypeNoHierarchy("_sick");
    public static final PayrollItemItemTypeNoHierarchy _socialSecurity = new PayrollItemItemTypeNoHierarchy("_socialSecurity");
    public static final PayrollItemItemTypeNoHierarchy _state = new PayrollItemItemTypeNoHierarchy("_state");
    public static final PayrollItemItemTypeNoHierarchy _tax = new PayrollItemItemTypeNoHierarchy("_tax");
    public static final PayrollItemItemTypeNoHierarchy _unemployment = new PayrollItemItemTypeNoHierarchy("_unemployment");
    public static final PayrollItemItemTypeNoHierarchy _vacation = new PayrollItemItemTypeNoHierarchy("_vacation");
    public static final PayrollItemItemTypeNoHierarchy _wage = new PayrollItemItemTypeNoHierarchy("_wage");
    private static TypeDesc typeDesc = new TypeDesc(PayrollItemItemTypeNoHierarchy.class);

    protected PayrollItemItemTypeNoHierarchy(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static PayrollItemItemTypeNoHierarchy fromValue(String value) throws IllegalArgumentException {
        PayrollItemItemTypeNoHierarchy enumeration = (PayrollItemItemTypeNoHierarchy)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static PayrollItemItemTypeNoHierarchy fromString(String value) throws IllegalArgumentException {
        return PayrollItemItemTypeNoHierarchy.fromValue(value);
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
        return PayrollItemItemTypeNoHierarchy.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.employees_2022_1.lists.webservices.netsuite.com", "PayrollItemItemTypeNoHierarchy"));
    }
}

