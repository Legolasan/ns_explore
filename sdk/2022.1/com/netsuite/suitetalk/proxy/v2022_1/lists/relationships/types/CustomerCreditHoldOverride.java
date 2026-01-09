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
package com.netsuite.suitetalk.proxy.v2022_1.lists.relationships.types;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

public class CustomerCreditHoldOverride
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __auto = "_auto";
    public static final String __on = "_on";
    public static final String __off = "_off";
    public static final CustomerCreditHoldOverride _auto = new CustomerCreditHoldOverride("_auto");
    public static final CustomerCreditHoldOverride _on = new CustomerCreditHoldOverride("_on");
    public static final CustomerCreditHoldOverride _off = new CustomerCreditHoldOverride("_off");
    private static TypeDesc typeDesc = new TypeDesc(CustomerCreditHoldOverride.class);

    protected CustomerCreditHoldOverride(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static CustomerCreditHoldOverride fromValue(String value) throws IllegalArgumentException {
        CustomerCreditHoldOverride enumeration = (CustomerCreditHoldOverride)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static CustomerCreditHoldOverride fromString(String value) throws IllegalArgumentException {
        return CustomerCreditHoldOverride.fromValue(value);
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
        return CustomerCreditHoldOverride.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.relationships_2022_1.lists.webservices.netsuite.com", "CustomerCreditHoldOverride"));
    }
}

