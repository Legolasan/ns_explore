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

public class ContactType
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __customer = "_customer";
    public static final String __employee = "_employee";
    public static final String __otherName = "_otherName";
    public static final String __partner = "_partner";
    public static final String __vendor = "_vendor";
    public static final ContactType _customer = new ContactType("_customer");
    public static final ContactType _employee = new ContactType("_employee");
    public static final ContactType _otherName = new ContactType("_otherName");
    public static final ContactType _partner = new ContactType("_partner");
    public static final ContactType _vendor = new ContactType("_vendor");
    private static TypeDesc typeDesc = new TypeDesc(ContactType.class);

    protected ContactType(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static ContactType fromValue(String value) throws IllegalArgumentException {
        ContactType enumeration = (ContactType)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static ContactType fromString(String value) throws IllegalArgumentException {
        return ContactType.fromValue(value);
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
        return ContactType.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.relationships_2022_1.lists.webservices.netsuite.com", "ContactType"));
    }
}

