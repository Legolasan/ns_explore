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

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.types.SearchLongFieldOperator;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.AttributeDesc;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class SearchLongField
implements Serializable {
    private Long searchValue;
    private Long searchValue2;
    private SearchLongFieldOperator operator;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(SearchLongField.class, true);

    public SearchLongField() {
    }

    public SearchLongField(Long searchValue, Long searchValue2, SearchLongFieldOperator operator) {
        this.searchValue = searchValue;
        this.searchValue2 = searchValue2;
        this.operator = operator;
    }

    public Long getSearchValue() {
        return this.searchValue;
    }

    public void setSearchValue(Long searchValue) {
        this.searchValue = searchValue;
    }

    public Long getSearchValue2() {
        return this.searchValue2;
    }

    public void setSearchValue2(Long searchValue2) {
        this.searchValue2 = searchValue2;
    }

    public SearchLongFieldOperator getOperator() {
        return this.operator;
    }

    public void setOperator(SearchLongFieldOperator operator) {
        this.operator = operator;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SearchLongField)) {
            return false;
        }
        SearchLongField other = (SearchLongField)obj;
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
        boolean _equals = (this.searchValue == null && other.getSearchValue() == null || this.searchValue != null && this.searchValue.equals(other.getSearchValue())) && (this.searchValue2 == null && other.getSearchValue2() == null || this.searchValue2 != null && this.searchValue2.equals(other.getSearchValue2())) && (this.operator == null && other.getOperator() == null || this.operator != null && this.operator.equals(other.getOperator()));
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
            _hashCode += this.getSearchValue().hashCode();
        }
        if (this.getSearchValue2() != null) {
            _hashCode += this.getSearchValue2().hashCode();
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
        typeDesc.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        AttributeDesc attrField = new AttributeDesc();
        attrField.setFieldName("operator");
        attrField.setXmlName(new QName("", "operator"));
        attrField.setXmlType(new QName("urn:types.core_2022_1.platform.webservices.netsuite.com", "SearchLongFieldOperator"));
        typeDesc.addFieldDesc((FieldDesc)attrField);
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("searchValue");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "searchValue"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("searchValue2");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "searchValue2"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

