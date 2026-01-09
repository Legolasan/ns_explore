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
package com.netsuite.suitetalk.proxy.v2022_1.lists.support.types;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

public class IssueTrackCode
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __never = "_never";
    public static final String __onAnyChange = "_onAnyChange";
    public static final String __whenBaseStatusIsClosed = "_whenBaseStatusIsClosed";
    public static final String __whenBaseStatusIsOnHold = "_whenBaseStatusIsOnHold";
    public static final String __whenBaseStatusIsOpen = "_whenBaseStatusIsOpen";
    public static final String __whenBaseStatusIsResolved = "_whenBaseStatusIsResolved";
    public static final IssueTrackCode _never = new IssueTrackCode("_never");
    public static final IssueTrackCode _onAnyChange = new IssueTrackCode("_onAnyChange");
    public static final IssueTrackCode _whenBaseStatusIsClosed = new IssueTrackCode("_whenBaseStatusIsClosed");
    public static final IssueTrackCode _whenBaseStatusIsOnHold = new IssueTrackCode("_whenBaseStatusIsOnHold");
    public static final IssueTrackCode _whenBaseStatusIsOpen = new IssueTrackCode("_whenBaseStatusIsOpen");
    public static final IssueTrackCode _whenBaseStatusIsResolved = new IssueTrackCode("_whenBaseStatusIsResolved");
    private static TypeDesc typeDesc = new TypeDesc(IssueTrackCode.class);

    protected IssueTrackCode(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static IssueTrackCode fromValue(String value) throws IllegalArgumentException {
        IssueTrackCode enumeration = (IssueTrackCode)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static IssueTrackCode fromString(String value) throws IllegalArgumentException {
        return IssueTrackCode.fromValue(value);
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
        return IssueTrackCode.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.support_2022_1.lists.webservices.netsuite.com", "IssueTrackCode"));
    }
}

