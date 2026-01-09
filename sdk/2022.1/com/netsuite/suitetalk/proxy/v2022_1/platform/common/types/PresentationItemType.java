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

public class PresentationItemType
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __fileCabinetItem = "_fileCabinetItem";
    public static final String __informationItem = "_informationItem";
    public static final String __item = "_item";
    public static final String __presentationCategory = "_presentationCategory";
    public static final PresentationItemType _fileCabinetItem = new PresentationItemType("_fileCabinetItem");
    public static final PresentationItemType _informationItem = new PresentationItemType("_informationItem");
    public static final PresentationItemType _item = new PresentationItemType("_item");
    public static final PresentationItemType _presentationCategory = new PresentationItemType("_presentationCategory");
    private static TypeDesc typeDesc = new TypeDesc(PresentationItemType.class);

    protected PresentationItemType(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static PresentationItemType fromValue(String value) throws IllegalArgumentException {
        PresentationItemType enumeration = (PresentationItemType)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static PresentationItemType fromString(String value) throws IllegalArgumentException {
        return PresentationItemType.fromValue(value);
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
        return PresentationItemType.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "PresentationItemType"));
    }
}

