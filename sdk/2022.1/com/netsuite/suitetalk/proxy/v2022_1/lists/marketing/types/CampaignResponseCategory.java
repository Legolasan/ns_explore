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

public class CampaignResponseCategory
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __bounced = "_bounced";
    public static final String __clickedThrough = "_clickedThrough";
    public static final String __failed = "_failed";
    public static final String __purchased = "_purchased";
    public static final String __queued = "_queued";
    public static final String __received = "_received";
    public static final String __responded = "_responded";
    public static final String __sent = "_sent";
    public static final String __subscribed = "_subscribed";
    public static final String __unsubscribed = "_unsubscribed";
    public static final CampaignResponseCategory _bounced = new CampaignResponseCategory("_bounced");
    public static final CampaignResponseCategory _clickedThrough = new CampaignResponseCategory("_clickedThrough");
    public static final CampaignResponseCategory _failed = new CampaignResponseCategory("_failed");
    public static final CampaignResponseCategory _purchased = new CampaignResponseCategory("_purchased");
    public static final CampaignResponseCategory _queued = new CampaignResponseCategory("_queued");
    public static final CampaignResponseCategory _received = new CampaignResponseCategory("_received");
    public static final CampaignResponseCategory _responded = new CampaignResponseCategory("_responded");
    public static final CampaignResponseCategory _sent = new CampaignResponseCategory("_sent");
    public static final CampaignResponseCategory _subscribed = new CampaignResponseCategory("_subscribed");
    public static final CampaignResponseCategory _unsubscribed = new CampaignResponseCategory("_unsubscribed");
    private static TypeDesc typeDesc = new TypeDesc(CampaignResponseCategory.class);

    protected CampaignResponseCategory(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static CampaignResponseCategory fromValue(String value) throws IllegalArgumentException {
        CampaignResponseCategory enumeration = (CampaignResponseCategory)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static CampaignResponseCategory fromString(String value) throws IllegalArgumentException {
        return CampaignResponseCategory.fromValue(value);
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
        return CampaignResponseCategory.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.marketing_2022_1.lists.webservices.netsuite.com", "CampaignResponseCategory"));
    }
}

