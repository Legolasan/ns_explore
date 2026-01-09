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

public class SearchTextNumberFieldOperator
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String _between = "between";
    public static final String _empty = "empty";
    public static final String _equalTo = "equalTo";
    public static final String _greaterThan = "greaterThan";
    public static final String _greaterThanOrEqualTo = "greaterThanOrEqualTo";
    public static final String _lessThan = "lessThan";
    public static final String _lessThanOrEqualTo = "lessThanOrEqualTo";
    public static final String _notBetween = "notBetween";
    public static final String _notEmpty = "notEmpty";
    public static final String _notEqualTo = "notEqualTo";
    public static final String _notGreaterThan = "notGreaterThan";
    public static final String _notGreaterThanOrEqualTo = "notGreaterThanOrEqualTo";
    public static final String _notLessThan = "notLessThan";
    public static final String _notLessThanOrEqualTo = "notLessThanOrEqualTo";
    public static final SearchTextNumberFieldOperator between = new SearchTextNumberFieldOperator("between");
    public static final SearchTextNumberFieldOperator empty = new SearchTextNumberFieldOperator("empty");
    public static final SearchTextNumberFieldOperator equalTo = new SearchTextNumberFieldOperator("equalTo");
    public static final SearchTextNumberFieldOperator greaterThan = new SearchTextNumberFieldOperator("greaterThan");
    public static final SearchTextNumberFieldOperator greaterThanOrEqualTo = new SearchTextNumberFieldOperator("greaterThanOrEqualTo");
    public static final SearchTextNumberFieldOperator lessThan = new SearchTextNumberFieldOperator("lessThan");
    public static final SearchTextNumberFieldOperator lessThanOrEqualTo = new SearchTextNumberFieldOperator("lessThanOrEqualTo");
    public static final SearchTextNumberFieldOperator notBetween = new SearchTextNumberFieldOperator("notBetween");
    public static final SearchTextNumberFieldOperator notEmpty = new SearchTextNumberFieldOperator("notEmpty");
    public static final SearchTextNumberFieldOperator notEqualTo = new SearchTextNumberFieldOperator("notEqualTo");
    public static final SearchTextNumberFieldOperator notGreaterThan = new SearchTextNumberFieldOperator("notGreaterThan");
    public static final SearchTextNumberFieldOperator notGreaterThanOrEqualTo = new SearchTextNumberFieldOperator("notGreaterThanOrEqualTo");
    public static final SearchTextNumberFieldOperator notLessThan = new SearchTextNumberFieldOperator("notLessThan");
    public static final SearchTextNumberFieldOperator notLessThanOrEqualTo = new SearchTextNumberFieldOperator("notLessThanOrEqualTo");
    private static TypeDesc typeDesc = new TypeDesc(SearchTextNumberFieldOperator.class);

    protected SearchTextNumberFieldOperator(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static SearchTextNumberFieldOperator fromValue(String value) throws IllegalArgumentException {
        SearchTextNumberFieldOperator enumeration = (SearchTextNumberFieldOperator)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static SearchTextNumberFieldOperator fromString(String value) throws IllegalArgumentException {
        return SearchTextNumberFieldOperator.fromValue(value);
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
        return SearchTextNumberFieldOperator.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.core_2022_1.platform.webservices.netsuite.com", "SearchTextNumberFieldOperator"));
    }
}

