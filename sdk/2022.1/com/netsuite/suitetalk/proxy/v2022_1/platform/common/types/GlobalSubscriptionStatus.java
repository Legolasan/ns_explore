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
package com.netsuite.suitetalk.proxy.v2022_1.platform.common.types;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

public class GlobalSubscriptionStatus
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __confirmedOptIn = "_confirmedOptIn";
    public static final String __confirmedOptOut = "_confirmedOptOut";
    public static final String __softOptIn = "_softOptIn";
    public static final String __softOptOut = "_softOptOut";
    public static final GlobalSubscriptionStatus _confirmedOptIn = new GlobalSubscriptionStatus("_confirmedOptIn");
    public static final GlobalSubscriptionStatus _confirmedOptOut = new GlobalSubscriptionStatus("_confirmedOptOut");
    public static final GlobalSubscriptionStatus _softOptIn = new GlobalSubscriptionStatus("_softOptIn");
    public static final GlobalSubscriptionStatus _softOptOut = new GlobalSubscriptionStatus("_softOptOut");
    private static TypeDesc typeDesc = new TypeDesc(GlobalSubscriptionStatus.class);

    protected GlobalSubscriptionStatus(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static GlobalSubscriptionStatus fromValue(String value) throws IllegalArgumentException {
        GlobalSubscriptionStatus enumeration = (GlobalSubscriptionStatus)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static GlobalSubscriptionStatus fromString(String value) throws IllegalArgumentException {
        return GlobalSubscriptionStatus.fromValue(value);
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
        return GlobalSubscriptionStatus.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "GlobalSubscriptionStatus"));
    }
}

