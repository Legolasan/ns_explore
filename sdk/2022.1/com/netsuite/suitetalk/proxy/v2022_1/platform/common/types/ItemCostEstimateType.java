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

public class ItemCostEstimateType
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __averageCost = "_averageCost";
    public static final String __custom = "_custom";
    public static final String __derivedFromMemberItems = "_derivedFromMemberItems";
    public static final String __itemDefinedCost = "_itemDefinedCost";
    public static final String __lastPurchasePrice = "_lastPurchasePrice";
    public static final String __preferredVendorRate = "_preferredVendorRate";
    public static final String __purchaseOrderRate = "_purchaseOrderRate";
    public static final String __purchasePrice = "_purchasePrice";
    public static final ItemCostEstimateType _averageCost = new ItemCostEstimateType("_averageCost");
    public static final ItemCostEstimateType _custom = new ItemCostEstimateType("_custom");
    public static final ItemCostEstimateType _derivedFromMemberItems = new ItemCostEstimateType("_derivedFromMemberItems");
    public static final ItemCostEstimateType _itemDefinedCost = new ItemCostEstimateType("_itemDefinedCost");
    public static final ItemCostEstimateType _lastPurchasePrice = new ItemCostEstimateType("_lastPurchasePrice");
    public static final ItemCostEstimateType _preferredVendorRate = new ItemCostEstimateType("_preferredVendorRate");
    public static final ItemCostEstimateType _purchaseOrderRate = new ItemCostEstimateType("_purchaseOrderRate");
    public static final ItemCostEstimateType _purchasePrice = new ItemCostEstimateType("_purchasePrice");
    private static TypeDesc typeDesc = new TypeDesc(ItemCostEstimateType.class);

    protected ItemCostEstimateType(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static ItemCostEstimateType fromValue(String value) throws IllegalArgumentException {
        ItemCostEstimateType enumeration = (ItemCostEstimateType)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static ItemCostEstimateType fromString(String value) throws IllegalArgumentException {
        return ItemCostEstimateType.fromValue(value);
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
        return ItemCostEstimateType.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "ItemCostEstimateType"));
    }
}

