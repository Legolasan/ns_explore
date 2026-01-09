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

public class Source
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __adp = "_adp";
    public static final String __automatedMemorizedTransaction = "_automatedMemorizedTransaction";
    public static final String __csv = "_csv";
    public static final String __customerCenter = "_customerCenter";
    public static final String __ebay = "_ebay";
    public static final String __mobile = "_mobile";
    public static final String __offlineClient = "_offlineClient";
    public static final String __paymentLink = "_paymentLink";
    public static final String __perquest = "_perquest";
    public static final String __qif = "_qif";
    public static final String __quickbooks = "_quickbooks";
    public static final String __restWebServices = "_restWebServices";
    public static final String __scis = "_scis";
    public static final String __smbxml = "_smbxml";
    public static final String __sync = "_sync";
    public static final String __web = "_web";
    public static final String __webServices = "_webServices";
    public static final String __yahoo = "_yahoo";
    public static final Source _adp = new Source("_adp");
    public static final Source _automatedMemorizedTransaction = new Source("_automatedMemorizedTransaction");
    public static final Source _csv = new Source("_csv");
    public static final Source _customerCenter = new Source("_customerCenter");
    public static final Source _ebay = new Source("_ebay");
    public static final Source _mobile = new Source("_mobile");
    public static final Source _offlineClient = new Source("_offlineClient");
    public static final Source _paymentLink = new Source("_paymentLink");
    public static final Source _perquest = new Source("_perquest");
    public static final Source _qif = new Source("_qif");
    public static final Source _quickbooks = new Source("_quickbooks");
    public static final Source _restWebServices = new Source("_restWebServices");
    public static final Source _scis = new Source("_scis");
    public static final Source _smbxml = new Source("_smbxml");
    public static final Source _sync = new Source("_sync");
    public static final Source _web = new Source("_web");
    public static final Source _webServices = new Source("_webServices");
    public static final Source _yahoo = new Source("_yahoo");
    private static TypeDesc typeDesc = new TypeDesc(Source.class);

    protected Source(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static Source fromValue(String value) throws IllegalArgumentException {
        Source enumeration = (Source)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static Source fromString(String value) throws IllegalArgumentException {
        return Source.fromValue(value);
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
        return Source.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "Source"));
    }
}

