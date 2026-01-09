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
package com.netsuite.suitetalk.proxy.v2022_1.activities.scheduling.types;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

public class ProjectTaskConstraintType
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __asSoonAsPossible = "_asSoonAsPossible";
    public static final String __fixedStart = "_fixedStart";
    public static final ProjectTaskConstraintType _asSoonAsPossible = new ProjectTaskConstraintType("_asSoonAsPossible");
    public static final ProjectTaskConstraintType _fixedStart = new ProjectTaskConstraintType("_fixedStart");
    private static TypeDesc typeDesc = new TypeDesc(ProjectTaskConstraintType.class);

    protected ProjectTaskConstraintType(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static ProjectTaskConstraintType fromValue(String value) throws IllegalArgumentException {
        ProjectTaskConstraintType enumeration = (ProjectTaskConstraintType)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static ProjectTaskConstraintType fromString(String value) throws IllegalArgumentException {
        return ProjectTaskConstraintType.fromValue(value);
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
        return ProjectTaskConstraintType.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.scheduling_2022_1.activities.webservices.netsuite.com", "ProjectTaskConstraintType"));
    }
}

