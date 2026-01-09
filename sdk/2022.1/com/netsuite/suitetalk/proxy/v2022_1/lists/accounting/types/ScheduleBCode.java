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

public class ScheduleBCode
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __1000 = "_1000";
    public static final String __1000cubicMeters = "_1000cubicMeters";
    public static final String __barrels = "_barrels";
    public static final String __carat = "_carat";
    public static final String __cleanYieldKilogram = "_cleanYieldKilogram";
    public static final String __contentKilogram = "_contentKilogram";
    public static final String __contentTon = "_contentTon";
    public static final String __cubicMeters = "_cubicMeters";
    public static final String __curie = "_curie";
    public static final String __dozen = "_dozen";
    public static final String __dozenPairs = "_dozenPairs";
    public static final String __dozenPieces = "_dozenPieces";
    public static final String __fiberMeter = "_fiberMeter";
    public static final String __gram = "_gram";
    public static final String __gross = "_gross";
    public static final String __grossContainers = "_grossContainers";
    public static final String __hundred = "_hundred";
    public static final String __kilogram = "_kilogram";
    public static final String __kilogramTotalSugars = "_kilogramTotalSugars";
    public static final String __liter = "_liter";
    public static final String __meter = "_meter";
    public static final String __millicurie = "_millicurie";
    public static final String __noQuantityReq = "_noQuantityReq";
    public static final String __number = "_number";
    public static final String __pack = "_pack";
    public static final String __pairs = "_pairs";
    public static final String __pieces = "_pieces";
    public static final String __proofLiter = "_proofLiter";
    public static final String __runningBales = "_runningBales";
    public static final String __square = "_square";
    public static final String __squareCentimeters = "_squareCentimeters";
    public static final String __squareMeters = "_squareMeters";
    public static final String __ton = "_ton";
    public static final ScheduleBCode _1000 = new ScheduleBCode("_1000");
    public static final ScheduleBCode _1000cubicMeters = new ScheduleBCode("_1000cubicMeters");
    public static final ScheduleBCode _barrels = new ScheduleBCode("_barrels");
    public static final ScheduleBCode _carat = new ScheduleBCode("_carat");
    public static final ScheduleBCode _cleanYieldKilogram = new ScheduleBCode("_cleanYieldKilogram");
    public static final ScheduleBCode _contentKilogram = new ScheduleBCode("_contentKilogram");
    public static final ScheduleBCode _contentTon = new ScheduleBCode("_contentTon");
    public static final ScheduleBCode _cubicMeters = new ScheduleBCode("_cubicMeters");
    public static final ScheduleBCode _curie = new ScheduleBCode("_curie");
    public static final ScheduleBCode _dozen = new ScheduleBCode("_dozen");
    public static final ScheduleBCode _dozenPairs = new ScheduleBCode("_dozenPairs");
    public static final ScheduleBCode _dozenPieces = new ScheduleBCode("_dozenPieces");
    public static final ScheduleBCode _fiberMeter = new ScheduleBCode("_fiberMeter");
    public static final ScheduleBCode _gram = new ScheduleBCode("_gram");
    public static final ScheduleBCode _gross = new ScheduleBCode("_gross");
    public static final ScheduleBCode _grossContainers = new ScheduleBCode("_grossContainers");
    public static final ScheduleBCode _hundred = new ScheduleBCode("_hundred");
    public static final ScheduleBCode _kilogram = new ScheduleBCode("_kilogram");
    public static final ScheduleBCode _kilogramTotalSugars = new ScheduleBCode("_kilogramTotalSugars");
    public static final ScheduleBCode _liter = new ScheduleBCode("_liter");
    public static final ScheduleBCode _meter = new ScheduleBCode("_meter");
    public static final ScheduleBCode _millicurie = new ScheduleBCode("_millicurie");
    public static final ScheduleBCode _noQuantityReq = new ScheduleBCode("_noQuantityReq");
    public static final ScheduleBCode _number = new ScheduleBCode("_number");
    public static final ScheduleBCode _pack = new ScheduleBCode("_pack");
    public static final ScheduleBCode _pairs = new ScheduleBCode("_pairs");
    public static final ScheduleBCode _pieces = new ScheduleBCode("_pieces");
    public static final ScheduleBCode _proofLiter = new ScheduleBCode("_proofLiter");
    public static final ScheduleBCode _runningBales = new ScheduleBCode("_runningBales");
    public static final ScheduleBCode _square = new ScheduleBCode("_square");
    public static final ScheduleBCode _squareCentimeters = new ScheduleBCode("_squareCentimeters");
    public static final ScheduleBCode _squareMeters = new ScheduleBCode("_squareMeters");
    public static final ScheduleBCode _ton = new ScheduleBCode("_ton");
    private static TypeDesc typeDesc = new TypeDesc(ScheduleBCode.class);

    protected ScheduleBCode(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static ScheduleBCode fromValue(String value) throws IllegalArgumentException {
        ScheduleBCode enumeration = (ScheduleBCode)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static ScheduleBCode fromString(String value) throws IllegalArgumentException {
        return ScheduleBCode.fromValue(value);
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
        return ScheduleBCode.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "ScheduleBCode"));
    }
}

