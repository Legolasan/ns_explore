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
package com.netsuite.suitetalk.proxy.v2022_1.setup.customization.types;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

public class CustomizationDynamicDefault
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __currentDateTime = "_currentDateTime";
    public static final String __currentUser = "_currentUser";
    public static final String __currentUsersDepartment = "_currentUsersDepartment";
    public static final String __currentUsersLocation = "_currentUsersLocation";
    public static final String __currentUsersSupervisor = "_currentUsersSupervisor";
    public static final String __currentUsersSubsidiary = "_currentUsersSubsidiary";
    public static final CustomizationDynamicDefault _currentDateTime = new CustomizationDynamicDefault("_currentDateTime");
    public static final CustomizationDynamicDefault _currentUser = new CustomizationDynamicDefault("_currentUser");
    public static final CustomizationDynamicDefault _currentUsersDepartment = new CustomizationDynamicDefault("_currentUsersDepartment");
    public static final CustomizationDynamicDefault _currentUsersLocation = new CustomizationDynamicDefault("_currentUsersLocation");
    public static final CustomizationDynamicDefault _currentUsersSupervisor = new CustomizationDynamicDefault("_currentUsersSupervisor");
    public static final CustomizationDynamicDefault _currentUsersSubsidiary = new CustomizationDynamicDefault("_currentUsersSubsidiary");
    private static TypeDesc typeDesc = new TypeDesc(CustomizationDynamicDefault.class);

    protected CustomizationDynamicDefault(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static CustomizationDynamicDefault fromValue(String value) throws IllegalArgumentException {
        CustomizationDynamicDefault enumeration = (CustomizationDynamicDefault)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static CustomizationDynamicDefault fromString(String value) throws IllegalArgumentException {
        return CustomizationDynamicDefault.fromValue(value);
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
        return CustomizationDynamicDefault.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.customization_2022_1.setup.webservices.netsuite.com", "CustomizationDynamicDefault"));
    }
}

