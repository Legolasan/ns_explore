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

public class SearchDoubleFieldOperator
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
    public static final SearchDoubleFieldOperator between = new SearchDoubleFieldOperator("between");
    public static final SearchDoubleFieldOperator empty = new SearchDoubleFieldOperator("empty");
    public static final SearchDoubleFieldOperator equalTo = new SearchDoubleFieldOperator("equalTo");
    public static final SearchDoubleFieldOperator greaterThan = new SearchDoubleFieldOperator("greaterThan");
    public static final SearchDoubleFieldOperator greaterThanOrEqualTo = new SearchDoubleFieldOperator("greaterThanOrEqualTo");
    public static final SearchDoubleFieldOperator lessThan = new SearchDoubleFieldOperator("lessThan");
    public static final SearchDoubleFieldOperator lessThanOrEqualTo = new SearchDoubleFieldOperator("lessThanOrEqualTo");
    public static final SearchDoubleFieldOperator notBetween = new SearchDoubleFieldOperator("notBetween");
    public static final SearchDoubleFieldOperator notEmpty = new SearchDoubleFieldOperator("notEmpty");
    public static final SearchDoubleFieldOperator notEqualTo = new SearchDoubleFieldOperator("notEqualTo");
    public static final SearchDoubleFieldOperator notGreaterThan = new SearchDoubleFieldOperator("notGreaterThan");
    public static final SearchDoubleFieldOperator notGreaterThanOrEqualTo = new SearchDoubleFieldOperator("notGreaterThanOrEqualTo");
    public static final SearchDoubleFieldOperator notLessThan = new SearchDoubleFieldOperator("notLessThan");
    public static final SearchDoubleFieldOperator notLessThanOrEqualTo = new SearchDoubleFieldOperator("notLessThanOrEqualTo");
    private static TypeDesc typeDesc = new TypeDesc(SearchDoubleFieldOperator.class);

    protected SearchDoubleFieldOperator(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static SearchDoubleFieldOperator fromValue(String value) throws IllegalArgumentException {
        SearchDoubleFieldOperator enumeration = (SearchDoubleFieldOperator)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static SearchDoubleFieldOperator fromString(String value) throws IllegalArgumentException {
        return SearchDoubleFieldOperator.fromValue(value);
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
        return SearchDoubleFieldOperator.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.core_2022_1.platform.webservices.netsuite.com", "SearchDoubleFieldOperator"));
    }
}

