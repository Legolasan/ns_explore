/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.axis.description.ElementDesc
 *  org.apache.axis.description.FieldDesc
 *  org.apache.axis.description.TypeDesc
 *  org.apache.axis.encoding.Deserializer
 *  org.apache.axis.encoding.Serializer
 *  org.apache.axis.encoding.ser.BeanDeserializer
 *  org.apache.axis.encoding.ser.BeanSerializer
 */
package com.netsuite.suitetalk.proxy.v2022_1.platform.core;

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnCustomField;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class SearchColumnLongCustomField
extends SearchColumnCustomField
implements Serializable {
    private Long searchValue;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(SearchColumnLongCustomField.class, true);

    public SearchColumnLongCustomField() {
    }

    public SearchColumnLongCustomField(String internalId, String scriptId, String customLabel, Long searchValue) {
        super(internalId, scriptId, customLabel);
        this.searchValue = searchValue;
    }

    public Long getSearchValue() {
        return this.searchValue;
    }

    public void setSearchValue(Long searchValue) {
        this.searchValue = searchValue;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SearchColumnLongCustomField)) {
            return false;
        }
        SearchColumnLongCustomField other = (SearchColumnLongCustomField)obj;
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
        boolean _equals = super.equals(obj) && (this.searchValue == null && other.getSearchValue() == null || this.searchValue != null && this.searchValue.equals(other.getSearchValue()));
        this.__equalsCalc = null;
        return _equals;
    }

    @Override
    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (this.getSearchValue() != null) {
            _hashCode += this.getSearchValue().hashCode();
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
        typeDesc.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongCustomField"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("searchValue");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "searchValue"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

