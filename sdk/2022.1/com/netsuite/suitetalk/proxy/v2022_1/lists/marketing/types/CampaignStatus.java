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

public class CampaignStatus
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __closed = "_closed";
    public static final String __completed = "_completed";
    public static final String __execute = "_execute";
    public static final String __inProgress = "_inProgress";
    public static final String __scheduled = "_scheduled";
    public static final String __sent = "_sent";
    public static final String __toPrint = "_toPrint";
    public static final CampaignStatus _closed = new CampaignStatus("_closed");
    public static final CampaignStatus _completed = new CampaignStatus("_completed");
    public static final CampaignStatus _execute = new CampaignStatus("_execute");
    public static final CampaignStatus _inProgress = new CampaignStatus("_inProgress");
    public static final CampaignStatus _scheduled = new CampaignStatus("_scheduled");
    public static final CampaignStatus _sent = new CampaignStatus("_sent");
    public static final CampaignStatus _toPrint = new CampaignStatus("_toPrint");
    private static TypeDesc typeDesc = new TypeDesc(CampaignStatus.class);

    protected CampaignStatus(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static CampaignStatus fromValue(String value) throws IllegalArgumentException {
        CampaignStatus enumeration = (CampaignStatus)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static CampaignStatus fromString(String value) throws IllegalArgumentException {
        return CampaignStatus.fromValue(value);
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
        return CampaignStatus.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.marketing_2022_1.lists.webservices.netsuite.com", "CampaignStatus"));
    }
}

