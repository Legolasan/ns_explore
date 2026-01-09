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

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.types.SearchEnumMultiSelectFieldOperator;
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

public class SearchEnumMultiSelectField
implements Serializable {
    private String[] searchValue;
    private SearchEnumMultiSelectFieldOperator operator;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(SearchEnumMultiSelectField.class, true);

    public SearchEnumMultiSelectField() {
    }

    public SearchEnumMultiSelectField(String[] searchValue, SearchEnumMultiSelectFieldOperator operator) {
        this.searchValue = searchValue;
        this.operator = operator;
    }

    public String[] getSearchValue() {
        return this.searchValue;
    }

    public void setSearchValue(String[] searchValue) {
        this.searchValue = searchValue;
    }

    public String getSearchValue(int i) {
        return this.searchValue[i];
    }

    public void setSearchValue(int i, String _value) {
        this.searchValue[i] = _value;
    }

    public SearchEnumMultiSelectFieldOperator getOperator() {
        return this.operator;
    }

    public void setOperator(SearchEnumMultiSelectFieldOperator operator) {
        this.operator = operator;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SearchEnumMultiSelectField)) {
            return false;
        }
        SearchEnumMultiSelectField other = (SearchEnumMultiSelectField)obj;
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
        typeDesc.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        AttributeDesc attrField = new AttributeDesc();
        attrField.setFieldName("operator");
        attrField.setXmlName(new QName("", "operator"));
        attrField.setXmlType(new QName("urn:types.core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectFieldOperator"));
        typeDesc.addFieldDesc((FieldDesc)attrField);
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("searchValue");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "searchValue"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

