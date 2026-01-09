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

public class CampaignResponseResponse
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __bounced = "_bounced";
    public static final String __clickedThru = "_clickedThru";
    public static final String __purchased = "_purchased";
    public static final String __received = "_received";
    public static final String __responded = "_responded";
    public static final String __sent = "_sent";
    public static final String __subscribed = "_subscribed";
    public static final String __unsubscribed = "_unsubscribed";
    public static final CampaignResponseResponse _bounced = new CampaignResponseResponse("_bounced");
    public static final CampaignResponseResponse _clickedThru = new CampaignResponseResponse("_clickedThru");
    public static final CampaignResponseResponse _purchased = new CampaignResponseResponse("_purchased");
    public static final CampaignResponseResponse _received = new CampaignResponseResponse("_received");
    public static final CampaignResponseResponse _responded = new CampaignResponseResponse("_responded");
    public static final CampaignResponseResponse _sent = new CampaignResponseResponse("_sent");
    public static final CampaignResponseResponse _subscribed = new CampaignResponseResponse("_subscribed");
    public static final CampaignResponseResponse _unsubscribed = new CampaignResponseResponse("_unsubscribed");
    private static TypeDesc typeDesc = new TypeDesc(CampaignResponseResponse.class);

    protected CampaignResponseResponse(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static CampaignResponseResponse fromValue(String value) throws IllegalArgumentException {
        CampaignResponseResponse enumeration = (CampaignResponseResponse)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static CampaignResponseResponse fromString(String value) throws IllegalArgumentException {
        return CampaignResponseResponse.fromValue(value);
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
        return CampaignResponseResponse.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.marketing_2022_1.lists.webservices.netsuite.com", "CampaignResponseResponse"));
    }
}

