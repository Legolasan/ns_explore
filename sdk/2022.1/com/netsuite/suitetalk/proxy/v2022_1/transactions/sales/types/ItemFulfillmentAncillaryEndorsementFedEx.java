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
package com.netsuite.suitetalk.proxy.v2022_1.transactions.sales.types;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

public class ItemFulfillmentAncillaryEndorsementFedEx
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __addressCorrection = "_addressCorrection";
    public static final String __carrierLeaveIfNoResponse = "_carrierLeaveIfNoResponse";
    public static final String __changeService = "_changeService";
    public static final String __forwardingService = "_forwardingService";
    public static final String __returnService = "_returnService";
    public static final ItemFulfillmentAncillaryEndorsementFedEx _addressCorrection = new ItemFulfillmentAncillaryEndorsementFedEx("_addressCorrection");
    public static final ItemFulfillmentAncillaryEndorsementFedEx _carrierLeaveIfNoResponse = new ItemFulfillmentAncillaryEndorsementFedEx("_carrierLeaveIfNoResponse");
    public static final ItemFulfillmentAncillaryEndorsementFedEx _changeService = new ItemFulfillmentAncillaryEndorsementFedEx("_changeService");
    public static final ItemFulfillmentAncillaryEndorsementFedEx _forwardingService = new ItemFulfillmentAncillaryEndorsementFedEx("_forwardingService");
    public static final ItemFulfillmentAncillaryEndorsementFedEx _returnService = new ItemFulfillmentAncillaryEndorsementFedEx("_returnService");
    private static TypeDesc typeDesc = new TypeDesc(ItemFulfillmentAncillaryEndorsementFedEx.class);

    protected ItemFulfillmentAncillaryEndorsementFedEx(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static ItemFulfillmentAncillaryEndorsementFedEx fromValue(String value) throws IllegalArgumentException {
        ItemFulfillmentAncillaryEndorsementFedEx enumeration = (ItemFulfillmentAncillaryEndorsementFedEx)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static ItemFulfillmentAncillaryEndorsementFedEx fromString(String value) throws IllegalArgumentException {
        return ItemFulfillmentAncillaryEndorsementFedEx.fromValue(value);
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
        return ItemFulfillmentAncillaryEndorsementFedEx.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.sales_2022_1.transactions.webservices.netsuite.com", "ItemFulfillmentAncillaryEndorsementFedEx"));
    }
}

