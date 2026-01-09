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

public class SearchStringFieldOperator
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String _contains = "contains";
    public static final String _doesNotContain = "doesNotContain";
    public static final String _doesNotStartWith = "doesNotStartWith";
    public static final String _empty = "empty";
    public static final String _hasKeywords = "hasKeywords";
    public static final String _is = "is";
    public static final String _isNot = "isNot";
    public static final String _notEmpty = "notEmpty";
    public static final String _startsWith = "startsWith";
    public static final SearchStringFieldOperator contains = new SearchStringFieldOperator("contains");
    public static final SearchStringFieldOperator doesNotContain = new SearchStringFieldOperator("doesNotContain");
    public static final SearchStringFieldOperator doesNotStartWith = new SearchStringFieldOperator("doesNotStartWith");
    public static final SearchStringFieldOperator empty = new SearchStringFieldOperator("empty");
    public static final SearchStringFieldOperator hasKeywords = new SearchStringFieldOperator("hasKeywords");
    public static final SearchStringFieldOperator is = new SearchStringFieldOperator("is");
    public static final SearchStringFieldOperator isNot = new SearchStringFieldOperator("isNot");
    public static final SearchStringFieldOperator notEmpty = new SearchStringFieldOperator("notEmpty");
    public static final SearchStringFieldOperator startsWith = new SearchStringFieldOperator("startsWith");
    private static TypeDesc typeDesc = new TypeDesc(SearchStringFieldOperator.class);

    protected SearchStringFieldOperator(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static SearchStringFieldOperator fromValue(String value) throws IllegalArgumentException {
        SearchStringFieldOperator enumeration = (SearchStringFieldOperator)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static SearchStringFieldOperator fromString(String value) throws IllegalArgumentException {
        return SearchStringFieldOperator.fromValue(value);
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
        return SearchStringFieldOperator.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.core_2022_1.platform.webservices.netsuite.com", "SearchStringFieldOperator"));
    }
}

