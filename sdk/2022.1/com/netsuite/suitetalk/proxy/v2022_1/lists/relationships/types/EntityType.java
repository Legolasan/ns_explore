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

public class EntityType
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __company = "_company";
    public static final String __contact = "_contact";
    public static final String __customer = "_customer";
    public static final String __employee = "_employee";
    public static final String __genericResource = "_genericResource";
    public static final String __group = "_group";
    public static final String __internal = "_internal";
    public static final String __job = "_job";
    public static final String __otherName = "_otherName";
    public static final String __partner = "_partner";
    public static final String __resourceGroup = "_resourceGroup";
    public static final String __vendor = "_vendor";
    public static final EntityType _company = new EntityType("_company");
    public static final EntityType _contact = new EntityType("_contact");
    public static final EntityType _customer = new EntityType("_customer");
    public static final EntityType _employee = new EntityType("_employee");
    public static final EntityType _genericResource = new EntityType("_genericResource");
    public static final EntityType _group = new EntityType("_group");
    public static final EntityType _internal = new EntityType("_internal");
    public static final EntityType _job = new EntityType("_job");
    public static final EntityType _otherName = new EntityType("_otherName");
    public static final EntityType _partner = new EntityType("_partner");
    public static final EntityType _resourceGroup = new EntityType("_resourceGroup");
    public static final EntityType _vendor = new EntityType("_vendor");
    private static TypeDesc typeDesc = new TypeDesc(EntityType.class);

    protected EntityType(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static EntityType fromValue(String value) throws IllegalArgumentException {
        EntityType enumeration = (EntityType)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static EntityType fromString(String value) throws IllegalArgumentException {
        return EntityType.fromValue(value);
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
        return EntityType.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.relationships_2022_1.lists.webservices.netsuite.com", "EntityType"));
    }
}

