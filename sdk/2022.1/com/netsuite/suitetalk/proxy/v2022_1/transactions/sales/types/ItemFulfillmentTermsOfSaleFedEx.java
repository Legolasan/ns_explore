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

public class ItemFulfillmentTermsOfSaleFedEx
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __cfr = "_cfr";
    public static final String __cif = "_cif";
    public static final String __cip = "_cip";
    public static final String __cpt = "_cpt";
    public static final String __dap = "_dap";
    public static final String __dat = "_dat";
    public static final String __ddp = "_ddp";
    public static final String __ddu = "_ddu";
    public static final String __exw = "_exw";
    public static final String __fca = "_fca";
    public static final String __fob = "_fob";
    public static final ItemFulfillmentTermsOfSaleFedEx _cfr = new ItemFulfillmentTermsOfSaleFedEx("_cfr");
    public static final ItemFulfillmentTermsOfSaleFedEx _cif = new ItemFulfillmentTermsOfSaleFedEx("_cif");
    public static final ItemFulfillmentTermsOfSaleFedEx _cip = new ItemFulfillmentTermsOfSaleFedEx("_cip");
    public static final ItemFulfillmentTermsOfSaleFedEx _cpt = new ItemFulfillmentTermsOfSaleFedEx("_cpt");
    public static final ItemFulfillmentTermsOfSaleFedEx _dap = new ItemFulfillmentTermsOfSaleFedEx("_dap");
    public static final ItemFulfillmentTermsOfSaleFedEx _dat = new ItemFulfillmentTermsOfSaleFedEx("_dat");
    public static final ItemFulfillmentTermsOfSaleFedEx _ddp = new ItemFulfillmentTermsOfSaleFedEx("_ddp");
    public static final ItemFulfillmentTermsOfSaleFedEx _ddu = new ItemFulfillmentTermsOfSaleFedEx("_ddu");
    public static final ItemFulfillmentTermsOfSaleFedEx _exw = new ItemFulfillmentTermsOfSaleFedEx("_exw");
    public static final ItemFulfillmentTermsOfSaleFedEx _fca = new ItemFulfillmentTermsOfSaleFedEx("_fca");
    public static final ItemFulfillmentTermsOfSaleFedEx _fob = new ItemFulfillmentTermsOfSaleFedEx("_fob");
    private static TypeDesc typeDesc = new TypeDesc(ItemFulfillmentTermsOfSaleFedEx.class);

    protected ItemFulfillmentTermsOfSaleFedEx(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static ItemFulfillmentTermsOfSaleFedEx fromValue(String value) throws IllegalArgumentException {
        ItemFulfillmentTermsOfSaleFedEx enumeration = (ItemFulfillmentTermsOfSaleFedEx)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static ItemFulfillmentTermsOfSaleFedEx fromString(String value) throws IllegalArgumentException {
        return ItemFulfillmentTermsOfSaleFedEx.fromValue(value);
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
        return ItemFulfillmentTermsOfSaleFedEx.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.sales_2022_1.transactions.webservices.netsuite.com", "ItemFulfillmentTermsOfSaleFedEx"));
    }
}

