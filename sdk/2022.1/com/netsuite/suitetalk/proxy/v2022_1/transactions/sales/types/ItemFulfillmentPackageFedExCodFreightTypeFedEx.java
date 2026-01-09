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

public class ItemFulfillmentPackageFedExCodFreightTypeFedEx
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __cODCharge = "_cODCharge";
    public static final String __noneSelected = "_noneSelected";
    public static final String __orderChargeNet = "_orderChargeNet";
    public static final String __orderChargeTotal = "_orderChargeTotal";
    public static final String __shippingCharge = "_shippingCharge";
    public static final String __totalCharge = "_totalCharge";
    public static final ItemFulfillmentPackageFedExCodFreightTypeFedEx _cODCharge = new ItemFulfillmentPackageFedExCodFreightTypeFedEx("_cODCharge");
    public static final ItemFulfillmentPackageFedExCodFreightTypeFedEx _noneSelected = new ItemFulfillmentPackageFedExCodFreightTypeFedEx("_noneSelected");
    public static final ItemFulfillmentPackageFedExCodFreightTypeFedEx _orderChargeNet = new ItemFulfillmentPackageFedExCodFreightTypeFedEx("_orderChargeNet");
    public static final ItemFulfillmentPackageFedExCodFreightTypeFedEx _orderChargeTotal = new ItemFulfillmentPackageFedExCodFreightTypeFedEx("_orderChargeTotal");
    public static final ItemFulfillmentPackageFedExCodFreightTypeFedEx _shippingCharge = new ItemFulfillmentPackageFedExCodFreightTypeFedEx("_shippingCharge");
    public static final ItemFulfillmentPackageFedExCodFreightTypeFedEx _totalCharge = new ItemFulfillmentPackageFedExCodFreightTypeFedEx("_totalCharge");
    private static TypeDesc typeDesc = new TypeDesc(ItemFulfillmentPackageFedExCodFreightTypeFedEx.class);

    protected ItemFulfillmentPackageFedExCodFreightTypeFedEx(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static ItemFulfillmentPackageFedExCodFreightTypeFedEx fromValue(String value) throws IllegalArgumentException {
        ItemFulfillmentPackageFedExCodFreightTypeFedEx enumeration = (ItemFulfillmentPackageFedExCodFreightTypeFedEx)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static ItemFulfillmentPackageFedExCodFreightTypeFedEx fromString(String value) throws IllegalArgumentException {
        return ItemFulfillmentPackageFedExCodFreightTypeFedEx.fromValue(value);
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
        return ItemFulfillmentPackageFedExCodFreightTypeFedEx.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.sales_2022_1.transactions.webservices.netsuite.com", "ItemFulfillmentPackageFedExCodFreightTypeFedEx"));
    }
}

