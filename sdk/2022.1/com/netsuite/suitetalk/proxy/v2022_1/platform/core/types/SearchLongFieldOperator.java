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

public class SearchLongFieldOperator
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
    public static final SearchLongFieldOperator between = new SearchLongFieldOperator("between");
    public static final SearchLongFieldOperator empty = new SearchLongFieldOperator("empty");
    public static final SearchLongFieldOperator equalTo = new SearchLongFieldOperator("equalTo");
    public static final SearchLongFieldOperator greaterThan = new SearchLongFieldOperator("greaterThan");
    public static final SearchLongFieldOperator greaterThanOrEqualTo = new SearchLongFieldOperator("greaterThanOrEqualTo");
    public static final SearchLongFieldOperator lessThan = new SearchLongFieldOperator("lessThan");
    public static final SearchLongFieldOperator lessThanOrEqualTo = new SearchLongFieldOperator("lessThanOrEqualTo");
    public static final SearchLongFieldOperator notBetween = new SearchLongFieldOperator("notBetween");
    public static final SearchLongFieldOperator notEmpty = new SearchLongFieldOperator("notEmpty");
    public static final SearchLongFieldOperator notEqualTo = new SearchLongFieldOperator("notEqualTo");
    public static final SearchLongFieldOperator notGreaterThan = new SearchLongFieldOperator("notGreaterThan");
    public static final SearchLongFieldOperator notGreaterThanOrEqualTo = new SearchLongFieldOperator("notGreaterThanOrEqualTo");
    public static final SearchLongFieldOperator notLessThan = new SearchLongFieldOperator("notLessThan");
    public static final SearchLongFieldOperator notLessThanOrEqualTo = new SearchLongFieldOperator("notLessThanOrEqualTo");
    private static TypeDesc typeDesc = new TypeDesc(SearchLongFieldOperator.class);

    protected SearchLongFieldOperator(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static SearchLongFieldOperator fromValue(String value) throws IllegalArgumentException {
        SearchLongFieldOperator enumeration = (SearchLongFieldOperator)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static SearchLongFieldOperator fromString(String value) throws IllegalArgumentException {
        return SearchLongFieldOperator.fromValue(value);
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
        return SearchLongFieldOperator.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.core_2022_1.platform.webservices.netsuite.com", "SearchLongFieldOperator"));
    }
}

