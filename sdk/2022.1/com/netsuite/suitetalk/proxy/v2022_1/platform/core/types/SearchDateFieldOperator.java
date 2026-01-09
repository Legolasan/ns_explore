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

public class SearchDateFieldOperator
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String _after = "after";
    public static final String _before = "before";
    public static final String _empty = "empty";
    public static final String _notAfter = "notAfter";
    public static final String _notBefore = "notBefore";
    public static final String _notEmpty = "notEmpty";
    public static final String _notOn = "notOn";
    public static final String _notOnOrAfter = "notOnOrAfter";
    public static final String _notOnOrBefore = "notOnOrBefore";
    public static final String _notWithin = "notWithin";
    public static final String _on = "on";
    public static final String _onOrAfter = "onOrAfter";
    public static final String _onOrBefore = "onOrBefore";
    public static final String _within = "within";
    public static final SearchDateFieldOperator after = new SearchDateFieldOperator("after");
    public static final SearchDateFieldOperator before = new SearchDateFieldOperator("before");
    public static final SearchDateFieldOperator empty = new SearchDateFieldOperator("empty");
    public static final SearchDateFieldOperator notAfter = new SearchDateFieldOperator("notAfter");
    public static final SearchDateFieldOperator notBefore = new SearchDateFieldOperator("notBefore");
    public static final SearchDateFieldOperator notEmpty = new SearchDateFieldOperator("notEmpty");
    public static final SearchDateFieldOperator notOn = new SearchDateFieldOperator("notOn");
    public static final SearchDateFieldOperator notOnOrAfter = new SearchDateFieldOperator("notOnOrAfter");
    public static final SearchDateFieldOperator notOnOrBefore = new SearchDateFieldOperator("notOnOrBefore");
    public static final SearchDateFieldOperator notWithin = new SearchDateFieldOperator("notWithin");
    public static final SearchDateFieldOperator on = new SearchDateFieldOperator("on");
    public static final SearchDateFieldOperator onOrAfter = new SearchDateFieldOperator("onOrAfter");
    public static final SearchDateFieldOperator onOrBefore = new SearchDateFieldOperator("onOrBefore");
    public static final SearchDateFieldOperator within = new SearchDateFieldOperator("within");
    private static TypeDesc typeDesc = new TypeDesc(SearchDateFieldOperator.class);

    protected SearchDateFieldOperator(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static SearchDateFieldOperator fromValue(String value) throws IllegalArgumentException {
        SearchDateFieldOperator enumeration = (SearchDateFieldOperator)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static SearchDateFieldOperator fromString(String value) throws IllegalArgumentException {
        return SearchDateFieldOperator.fromValue(value);
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
        return SearchDateFieldOperator.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.core_2022_1.platform.webservices.netsuite.com", "SearchDateFieldOperator"));
    }
}

