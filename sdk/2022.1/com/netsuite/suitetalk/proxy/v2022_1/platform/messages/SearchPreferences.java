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
package com.netsuite.suitetalk.proxy.v2022_1.platform.messages;

import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class SearchPreferences
implements Serializable {
    private Boolean bodyFieldsOnly;
    private Boolean returnSearchColumns;
    private Integer pageSize;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(SearchPreferences.class, true);

    public SearchPreferences() {
    }

    public SearchPreferences(Boolean bodyFieldsOnly, Boolean returnSearchColumns, Integer pageSize) {
        this.bodyFieldsOnly = bodyFieldsOnly;
        this.returnSearchColumns = returnSearchColumns;
        this.pageSize = pageSize;
    }

    public Boolean getBodyFieldsOnly() {
        return this.bodyFieldsOnly;
    }

    public void setBodyFieldsOnly(Boolean bodyFieldsOnly) {
        this.bodyFieldsOnly = bodyFieldsOnly;
    }

    public Boolean getReturnSearchColumns() {
        return this.returnSearchColumns;
    }

    public void setReturnSearchColumns(Boolean returnSearchColumns) {
        this.returnSearchColumns = returnSearchColumns;
    }

    public Integer getPageSize() {
        return this.pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SearchPreferences)) {
            return false;
        }
        SearchPreferences other = (SearchPreferences)obj;
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
        boolean _equals = (this.bodyFieldsOnly == null && other.getBodyFieldsOnly() == null || this.bodyFieldsOnly != null && this.bodyFieldsOnly.equals(other.getBodyFieldsOnly())) && (this.returnSearchColumns == null && other.getReturnSearchColumns() == null || this.returnSearchColumns != null && this.returnSearchColumns.equals(other.getReturnSearchColumns())) && (this.pageSize == null && other.getPageSize() == null || this.pageSize != null && this.pageSize.equals(other.getPageSize()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getBodyFieldsOnly() != null) {
            _hashCode += this.getBodyFieldsOnly().hashCode();
        }
        if (this.getReturnSearchColumns() != null) {
            _hashCode += this.getReturnSearchColumns().hashCode();
        }
        if (this.getPageSize() != null) {
            _hashCode += this.getPageSize().hashCode();
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
        typeDesc.setXmlType(new QName("urn:messages_2022_1.platform.webservices.netsuite.com", "SearchPreferences"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("bodyFieldsOnly");
        elemField.setXmlName(new QName("urn:messages_2022_1.platform.webservices.netsuite.com", "bodyFieldsOnly"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("returnSearchColumns");
        elemField.setXmlName(new QName("urn:messages_2022_1.platform.webservices.netsuite.com", "returnSearchColumns"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("pageSize");
        elemField.setXmlName(new QName("urn:messages_2022_1.platform.webservices.netsuite.com", "pageSize"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

