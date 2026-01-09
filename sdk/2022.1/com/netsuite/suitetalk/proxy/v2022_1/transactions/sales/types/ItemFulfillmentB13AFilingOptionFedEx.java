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

public class ItemFulfillmentB13AFilingOptionFedEx
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __filedElectronically = "_filedElectronically";
    public static final String __manuallyAttached = "_manuallyAttached";
    public static final String __notRequired = "_notRequired";
    public static final String __summaryReporting = "_summaryReporting";
    public static final ItemFulfillmentB13AFilingOptionFedEx _filedElectronically = new ItemFulfillmentB13AFilingOptionFedEx("_filedElectronically");
    public static final ItemFulfillmentB13AFilingOptionFedEx _manuallyAttached = new ItemFulfillmentB13AFilingOptionFedEx("_manuallyAttached");
    public static final ItemFulfillmentB13AFilingOptionFedEx _notRequired = new ItemFulfillmentB13AFilingOptionFedEx("_notRequired");
    public static final ItemFulfillmentB13AFilingOptionFedEx _summaryReporting = new ItemFulfillmentB13AFilingOptionFedEx("_summaryReporting");
    private static TypeDesc typeDesc = new TypeDesc(ItemFulfillmentB13AFilingOptionFedEx.class);

    protected ItemFulfillmentB13AFilingOptionFedEx(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static ItemFulfillmentB13AFilingOptionFedEx fromValue(String value) throws IllegalArgumentException {
        ItemFulfillmentB13AFilingOptionFedEx enumeration = (ItemFulfillmentB13AFilingOptionFedEx)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static ItemFulfillmentB13AFilingOptionFedEx fromString(String value) throws IllegalArgumentException {
        return ItemFulfillmentB13AFilingOptionFedEx.fromValue(value);
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
        return ItemFulfillmentB13AFilingOptionFedEx.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.sales_2022_1.transactions.webservices.netsuite.com", "ItemFulfillmentB13AFilingOptionFedEx"));
    }
}

