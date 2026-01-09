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

public class ItemFulfillmentLicenseExceptionUps
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __agr = "_agr";
    public static final String __apr = "_apr";
    public static final String __avs = "_avs";
    public static final String __bag = "_bag";
    public static final String __civ = "_civ";
    public static final String __ctp = "_ctp";
    public static final String __enc = "_enc";
    public static final String __gbs = "_gbs";
    public static final String __gft = "_gft";
    public static final String __gov = "_gov";
    public static final String __kmi = "_kmi";
    public static final String __lvs = "_lvs";
    public static final String __nlr = "_nlr";
    public static final String __rpl = "_rpl";
    public static final String __tmp = "_tmp";
    public static final String __tspa = "_tspa";
    public static final String __tsr = "_tsr";
    public static final String __tsu = "_tsu";
    public static final ItemFulfillmentLicenseExceptionUps _agr = new ItemFulfillmentLicenseExceptionUps("_agr");
    public static final ItemFulfillmentLicenseExceptionUps _apr = new ItemFulfillmentLicenseExceptionUps("_apr");
    public static final ItemFulfillmentLicenseExceptionUps _avs = new ItemFulfillmentLicenseExceptionUps("_avs");
    public static final ItemFulfillmentLicenseExceptionUps _bag = new ItemFulfillmentLicenseExceptionUps("_bag");
    public static final ItemFulfillmentLicenseExceptionUps _civ = new ItemFulfillmentLicenseExceptionUps("_civ");
    public static final ItemFulfillmentLicenseExceptionUps _ctp = new ItemFulfillmentLicenseExceptionUps("_ctp");
    public static final ItemFulfillmentLicenseExceptionUps _enc = new ItemFulfillmentLicenseExceptionUps("_enc");
    public static final ItemFulfillmentLicenseExceptionUps _gbs = new ItemFulfillmentLicenseExceptionUps("_gbs");
    public static final ItemFulfillmentLicenseExceptionUps _gft = new ItemFulfillmentLicenseExceptionUps("_gft");
    public static final ItemFulfillmentLicenseExceptionUps _gov = new ItemFulfillmentLicenseExceptionUps("_gov");
    public static final ItemFulfillmentLicenseExceptionUps _kmi = new ItemFulfillmentLicenseExceptionUps("_kmi");
    public static final ItemFulfillmentLicenseExceptionUps _lvs = new ItemFulfillmentLicenseExceptionUps("_lvs");
    public static final ItemFulfillmentLicenseExceptionUps _nlr = new ItemFulfillmentLicenseExceptionUps("_nlr");
    public static final ItemFulfillmentLicenseExceptionUps _rpl = new ItemFulfillmentLicenseExceptionUps("_rpl");
    public static final ItemFulfillmentLicenseExceptionUps _tmp = new ItemFulfillmentLicenseExceptionUps("_tmp");
    public static final ItemFulfillmentLicenseExceptionUps _tspa = new ItemFulfillmentLicenseExceptionUps("_tspa");
    public static final ItemFulfillmentLicenseExceptionUps _tsr = new ItemFulfillmentLicenseExceptionUps("_tsr");
    public static final ItemFulfillmentLicenseExceptionUps _tsu = new ItemFulfillmentLicenseExceptionUps("_tsu");
    private static TypeDesc typeDesc = new TypeDesc(ItemFulfillmentLicenseExceptionUps.class);

    protected ItemFulfillmentLicenseExceptionUps(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static ItemFulfillmentLicenseExceptionUps fromValue(String value) throws IllegalArgumentException {
        ItemFulfillmentLicenseExceptionUps enumeration = (ItemFulfillmentLicenseExceptionUps)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static ItemFulfillmentLicenseExceptionUps fromString(String value) throws IllegalArgumentException {
        return ItemFulfillmentLicenseExceptionUps.fromValue(value);
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
        return ItemFulfillmentLicenseExceptionUps.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.sales_2022_1.transactions.webservices.netsuite.com", "ItemFulfillmentLicenseExceptionUps"));
    }
}

