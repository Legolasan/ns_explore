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

public class CampaignCampaignEventType
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __default = "_default";
    public static final String __directMail = "_directMail";
    public static final String __email = "_email";
    public static final String __integration = "_integration";
    public static final String __leadNurturingEmail = "_leadNurturingEmail";
    public static final String __other = "_other";
    public static final CampaignCampaignEventType _default = new CampaignCampaignEventType("_default");
    public static final CampaignCampaignEventType _directMail = new CampaignCampaignEventType("_directMail");
    public static final CampaignCampaignEventType _email = new CampaignCampaignEventType("_email");
    public static final CampaignCampaignEventType _integration = new CampaignCampaignEventType("_integration");
    public static final CampaignCampaignEventType _leadNurturingEmail = new CampaignCampaignEventType("_leadNurturingEmail");
    public static final CampaignCampaignEventType _other = new CampaignCampaignEventType("_other");
    private static TypeDesc typeDesc = new TypeDesc(CampaignCampaignEventType.class);

    protected CampaignCampaignEventType(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static CampaignCampaignEventType fromValue(String value) throws IllegalArgumentException {
        CampaignCampaignEventType enumeration = (CampaignCampaignEventType)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static CampaignCampaignEventType fromString(String value) throws IllegalArgumentException {
        return CampaignCampaignEventType.fromValue(value);
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
        return CampaignCampaignEventType.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.marketing_2022_1.lists.webservices.netsuite.com", "CampaignCampaignEventType"));
    }
}

