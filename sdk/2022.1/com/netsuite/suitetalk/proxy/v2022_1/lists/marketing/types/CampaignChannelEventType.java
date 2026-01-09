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
package com.netsuite.suitetalk.proxy.v2022_1.lists.marketing.types;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

public class CampaignChannelEventType
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __directMail = "_directMail";
    public static final String __email = "_email";
    public static final String __integration = "_integration";
    public static final String __other = "_other";
    public static final CampaignChannelEventType _directMail = new CampaignChannelEventType("_directMail");
    public static final CampaignChannelEventType _email = new CampaignChannelEventType("_email");
    public static final CampaignChannelEventType _integration = new CampaignChannelEventType("_integration");
    public static final CampaignChannelEventType _other = new CampaignChannelEventType("_other");
    private static TypeDesc typeDesc = new TypeDesc(CampaignChannelEventType.class);

    protected CampaignChannelEventType(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static CampaignChannelEventType fromValue(String value) throws IllegalArgumentException {
        CampaignChannelEventType enumeration = (CampaignChannelEventType)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static CampaignChannelEventType fromString(String value) throws IllegalArgumentException {
        return CampaignChannelEventType.fromValue(value);
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
        return CampaignChannelEventType.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.marketing_2022_1.lists.webservices.netsuite.com", "CampaignChannelEventType"));
    }
}

