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

public class ItemFulfillmentPackageFedExAdmPackageTypeFedEx
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __bag = "_bag";
    public static final String __barrel = "_barrel";
    public static final String __basketOrHamper = "_basketOrHamper";
    public static final String __box = "_box";
    public static final String __bucket = "_bucket";
    public static final String __bundle = "_bundle";
    public static final String __cage = "_cage";
    public static final String __carton = "_carton";
    public static final String __case = "_case";
    public static final String __chest = "_chest";
    public static final String __container = "_container";
    public static final String __crate = "_crate";
    public static final String __cylinder = "_cylinder";
    public static final String __drum = "_drum";
    public static final String __envelope = "_envelope";
    public static final String __package = "_package";
    public static final String __pail = "_pail";
    public static final String __pallet = "_pallet";
    public static final String __parcel = "_parcel";
    public static final String __pieces = "_pieces";
    public static final String __reel = "_reel";
    public static final String __roll = "_roll";
    public static final String __sack = "_sack";
    public static final String __shrinkWrapped = "_shrinkWrapped";
    public static final String __skid = "_skid";
    public static final String __tank = "_tank";
    public static final String __toteBin = "_toteBin";
    public static final String __tube = "_tube";
    public static final String __unit = "_unit";
    public static final ItemFulfillmentPackageFedExAdmPackageTypeFedEx _bag = new ItemFulfillmentPackageFedExAdmPackageTypeFedEx("_bag");
    public static final ItemFulfillmentPackageFedExAdmPackageTypeFedEx _barrel = new ItemFulfillmentPackageFedExAdmPackageTypeFedEx("_barrel");
    public static final ItemFulfillmentPackageFedExAdmPackageTypeFedEx _basketOrHamper = new ItemFulfillmentPackageFedExAdmPackageTypeFedEx("_basketOrHamper");
    public static final ItemFulfillmentPackageFedExAdmPackageTypeFedEx _box = new ItemFulfillmentPackageFedExAdmPackageTypeFedEx("_box");
    public static final ItemFulfillmentPackageFedExAdmPackageTypeFedEx _bucket = new ItemFulfillmentPackageFedExAdmPackageTypeFedEx("_bucket");
    public static final ItemFulfillmentPackageFedExAdmPackageTypeFedEx _bundle = new ItemFulfillmentPackageFedExAdmPackageTypeFedEx("_bundle");
    public static final ItemFulfillmentPackageFedExAdmPackageTypeFedEx _cage = new ItemFulfillmentPackageFedExAdmPackageTypeFedEx("_cage");
    public static final ItemFulfillmentPackageFedExAdmPackageTypeFedEx _carton = new ItemFulfillmentPackageFedExAdmPackageTypeFedEx("_carton");
    public static final ItemFulfillmentPackageFedExAdmPackageTypeFedEx _case = new ItemFulfillmentPackageFedExAdmPackageTypeFedEx("_case");
    public static final ItemFulfillmentPackageFedExAdmPackageTypeFedEx _chest = new ItemFulfillmentPackageFedExAdmPackageTypeFedEx("_chest");
    public static final ItemFulfillmentPackageFedExAdmPackageTypeFedEx _container = new ItemFulfillmentPackageFedExAdmPackageTypeFedEx("_container");
    public static final ItemFulfillmentPackageFedExAdmPackageTypeFedEx _crate = new ItemFulfillmentPackageFedExAdmPackageTypeFedEx("_crate");
    public static final ItemFulfillmentPackageFedExAdmPackageTypeFedEx _cylinder = new ItemFulfillmentPackageFedExAdmPackageTypeFedEx("_cylinder");
    public static final ItemFulfillmentPackageFedExAdmPackageTypeFedEx _drum = new ItemFulfillmentPackageFedExAdmPackageTypeFedEx("_drum");
    public static final ItemFulfillmentPackageFedExAdmPackageTypeFedEx _envelope = new ItemFulfillmentPackageFedExAdmPackageTypeFedEx("_envelope");
    public static final ItemFulfillmentPackageFedExAdmPackageTypeFedEx _package = new ItemFulfillmentPackageFedExAdmPackageTypeFedEx("_package");
    public static final ItemFulfillmentPackageFedExAdmPackageTypeFedEx _pail = new ItemFulfillmentPackageFedExAdmPackageTypeFedEx("_pail");
    public static final ItemFulfillmentPackageFedExAdmPackageTypeFedEx _pallet = new ItemFulfillmentPackageFedExAdmPackageTypeFedEx("_pallet");
    public static final ItemFulfillmentPackageFedExAdmPackageTypeFedEx _parcel = new ItemFulfillmentPackageFedExAdmPackageTypeFedEx("_parcel");
    public static final ItemFulfillmentPackageFedExAdmPackageTypeFedEx _pieces = new ItemFulfillmentPackageFedExAdmPackageTypeFedEx("_pieces");
    public static final ItemFulfillmentPackageFedExAdmPackageTypeFedEx _reel = new ItemFulfillmentPackageFedExAdmPackageTypeFedEx("_reel");
    public static final ItemFulfillmentPackageFedExAdmPackageTypeFedEx _roll = new ItemFulfillmentPackageFedExAdmPackageTypeFedEx("_roll");
    public static final ItemFulfillmentPackageFedExAdmPackageTypeFedEx _sack = new ItemFulfillmentPackageFedExAdmPackageTypeFedEx("_sack");
    public static final ItemFulfillmentPackageFedExAdmPackageTypeFedEx _shrinkWrapped = new ItemFulfillmentPackageFedExAdmPackageTypeFedEx("_shrinkWrapped");
    public static final ItemFulfillmentPackageFedExAdmPackageTypeFedEx _skid = new ItemFulfillmentPackageFedExAdmPackageTypeFedEx("_skid");
    public static final ItemFulfillmentPackageFedExAdmPackageTypeFedEx _tank = new ItemFulfillmentPackageFedExAdmPackageTypeFedEx("_tank");
    public static final ItemFulfillmentPackageFedExAdmPackageTypeFedEx _toteBin = new ItemFulfillmentPackageFedExAdmPackageTypeFedEx("_toteBin");
    public static final ItemFulfillmentPackageFedExAdmPackageTypeFedEx _tube = new ItemFulfillmentPackageFedExAdmPackageTypeFedEx("_tube");
    public static final ItemFulfillmentPackageFedExAdmPackageTypeFedEx _unit = new ItemFulfillmentPackageFedExAdmPackageTypeFedEx("_unit");
    private static TypeDesc typeDesc = new TypeDesc(ItemFulfillmentPackageFedExAdmPackageTypeFedEx.class);

    protected ItemFulfillmentPackageFedExAdmPackageTypeFedEx(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static ItemFulfillmentPackageFedExAdmPackageTypeFedEx fromValue(String value) throws IllegalArgumentException {
        ItemFulfillmentPackageFedExAdmPackageTypeFedEx enumeration = (ItemFulfillmentPackageFedExAdmPackageTypeFedEx)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static ItemFulfillmentPackageFedExAdmPackageTypeFedEx fromString(String value) throws IllegalArgumentException {
        return ItemFulfillmentPackageFedExAdmPackageTypeFedEx.fromValue(value);
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
        return ItemFulfillmentPackageFedExAdmPackageTypeFedEx.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.sales_2022_1.transactions.webservices.netsuite.com", "ItemFulfillmentPackageFedExAdmPackageTypeFedEx"));
    }
}

