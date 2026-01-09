/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.axis.description.AttributeDesc
 *  org.apache.axis.description.ElementDesc
 *  org.apache.axis.description.FieldDesc
 *  org.apache.axis.description.TypeDesc
 *  org.apache.axis.encoding.Deserializer
 *  org.apache.axis.encoding.Serializer
 *  org.apache.axis.encoding.ser.BeanDeserializer
 *  org.apache.axis.encoding.ser.BeanSerializer
 */
package com.netsuite.suitetalk.proxy.v2022_1.platform.core;

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.types.SearchMultiSelectFieldOperator;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import javax.xml.namespace.QName;
import org.apache.axis.description.AttributeDesc;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class SearchMultiSelectField
implements Serializable {
    private RecordRef[] searchValue;
    private SearchMultiSelectFieldOperator operator;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(SearchMultiSelectField.class, true);

    public SearchMultiSelectField() {
    }

    public SearchMultiSelectField(RecordRef[] searchValue, SearchMultiSelectFieldOperator operator) {
        this.searchValue = searchValue;
        this.operator = operator;
    }

    public RecordRef[] getSearchValue() {
        return this.searchValue;
    }

    public void setSearchValue(RecordRef[] searchValue) {
        this.searchValue = searchValue;
    }

    public RecordRef getSearchValue(int i) {
        return this.searchValue[i];
    }

    public void setSearchValue(int i, RecordRef _value) {
        this.searchValue[i] = _value;
    }

    public SearchMultiSelectFieldOperator getOperator() {
        return this.operator;
    }

    public void setOperator(SearchMultiSelectFieldOperator operator) {
        this.operator = operator;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SearchMultiSelectField)) {
            return false;
        }
        SearchMultiSelectField other = (SearchMultiSelectField)obj;
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (this.__equalsCalc != null) {
            return this.__equalsCalc == obj;
        }
        this.__equalsCalc = obj;
        boolean _equals = (this.searchValue == null && other.getSearchValue() == null || this.searchValue != null && Arrays.equals(this.searchValue, other.getSearchValue())) && (this.operator == null && other.getOperator() == null || this.operator != null && this.operator.equals(other.getOperator()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getSearchValue() != null) {
            for (int i = 0; i < Array.getLength(this.getSearchValue()); ++i) {
                Object obj = Array.get(this.getSearchValue(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getOperator() != null) {
            _hashCode += this.getOperator().hashCode();
        }
        this.__hashCodeCalc = false;
        return _hashCode;
    }

    public static TypeDesc getTypeDesc() {
        return typeDesc;
    }

    public static Serializer getSerializer(String mechType, Class _javaType, QName _xmlType) {
        return new BeanSerializer(_javaType, _xmlType, typeDesc);
    }

    public static Deserializer getDeserializer(String mechType, Class _javaType, QName _xmlType) {
        return new BeanDeserializer(_javaType, _xmlType, typeDesc);
    }

    static {
        typeDesc.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        AttributeDesc attrField = new AttributeDesc();
        attrField.setFieldName("operator");
        attrField.setXmlName(new QName("", "operator"));
        attrField.setXmlType(new QName("urn:types.core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectFieldOperator"));
        typeDesc.addFieldDesc((FieldDesc)attrField);
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("searchValue");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "searchValue"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

