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
package com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.types;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

public class ItemSupplyReplenishmentMethod
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __masterProductionScheduling = "_masterProductionScheduling";
    public static final String __materialRequirementsPlanning = "_materialRequirementsPlanning";
    public static final String __reorderPoint = "_reorderPoint";
    public static final String __timePhased = "_timePhased";
    public static final ItemSupplyReplenishmentMethod _masterProductionScheduling = new ItemSupplyReplenishmentMethod("_masterProductionScheduling");
    public static final ItemSupplyReplenishmentMethod _materialRequirementsPlanning = new ItemSupplyReplenishmentMethod("_materialRequirementsPlanning");
    public static final ItemSupplyReplenishmentMethod _reorderPoint = new ItemSupplyReplenishmentMethod("_reorderPoint");
    public static final ItemSupplyReplenishmentMethod _timePhased = new ItemSupplyReplenishmentMethod("_timePhased");
    private static TypeDesc typeDesc = new TypeDesc(ItemSupplyReplenishmentMethod.class);

    protected ItemSupplyReplenishmentMethod(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static ItemSupplyReplenishmentMethod fromValue(String value) throws IllegalArgumentException {
        ItemSupplyReplenishmentMethod enumeration = (ItemSupplyReplenishmentMethod)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static ItemSupplyReplenishmentMethod fromString(String value) throws IllegalArgumentException {
        return ItemSupplyReplenishmentMethod.fromValue(value);
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
        return ItemSupplyReplenishmentMethod.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "ItemSupplyReplenishmentMethod"));
    }
}

