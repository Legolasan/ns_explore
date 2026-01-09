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
package com.netsuite.suitetalk.proxy.v2022_1.platform.core.types;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

public class GetCustomizationType
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String _crmCustomField = "crmCustomField";
    public static final String _customList = "customList";
    public static final String _customRecordCustomField = "customRecordCustomField";
    public static final String _customRecordType = "customRecordType";
    public static final String _customSegment = "customSegment";
    public static final String _customTransactionType = "customTransactionType";
    public static final String _entityCustomField = "entityCustomField";
    public static final String _itemCustomField = "itemCustomField";
    public static final String _itemNumberCustomField = "itemNumberCustomField";
    public static final String _itemOptionCustomField = "itemOptionCustomField";
    public static final String _otherCustomField = "otherCustomField";
    public static final String _transactionBodyCustomField = "transactionBodyCustomField";
    public static final String _transactionColumnCustomField = "transactionColumnCustomField";
    public static final GetCustomizationType crmCustomField = new GetCustomizationType("crmCustomField");
    public static final GetCustomizationType customList = new GetCustomizationType("customList");
    public static final GetCustomizationType customRecordCustomField = new GetCustomizationType("customRecordCustomField");
    public static final GetCustomizationType customRecordType = new GetCustomizationType("customRecordType");
    public static final GetCustomizationType customSegment = new GetCustomizationType("customSegment");
    public static final GetCustomizationType customTransactionType = new GetCustomizationType("customTransactionType");
    public static final GetCustomizationType entityCustomField = new GetCustomizationType("entityCustomField");
    public static final GetCustomizationType itemCustomField = new GetCustomizationType("itemCustomField");
    public static final GetCustomizationType itemNumberCustomField = new GetCustomizationType("itemNumberCustomField");
    public static final GetCustomizationType itemOptionCustomField = new GetCustomizationType("itemOptionCustomField");
    public static final GetCustomizationType otherCustomField = new GetCustomizationType("otherCustomField");
    public static final GetCustomizationType transactionBodyCustomField = new GetCustomizationType("transactionBodyCustomField");
    public static final GetCustomizationType transactionColumnCustomField = new GetCustomizationType("transactionColumnCustomField");
    private static TypeDesc typeDesc = new TypeDesc(GetCustomizationType.class);

    protected GetCustomizationType(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static GetCustomizationType fromValue(String value) throws IllegalArgumentException {
        GetCustomizationType enumeration = (GetCustomizationType)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static GetCustomizationType fromString(String value) throws IllegalArgumentException {
        return GetCustomizationType.fromValue(value);
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
        return GetCustomizationType.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.core_2022_1.platform.webservices.netsuite.com", "GetCustomizationType"));
    }
}

