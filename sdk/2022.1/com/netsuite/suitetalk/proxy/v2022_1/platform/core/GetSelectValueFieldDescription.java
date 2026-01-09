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

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.GetSelectFilterByFieldValueList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.GetSelectValueFilter;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.types.RecordType;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class GetSelectValueFieldDescription
implements Serializable {
    private RecordType recordType;
    private RecordRef customRecordType;
    private RecordRef customTransactionType;
    private String sublist;
    private String field;
    private RecordRef customForm;
    private GetSelectValueFilter filter;
    private GetSelectFilterByFieldValueList filterByValueList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(GetSelectValueFieldDescription.class, true);

    public GetSelectValueFieldDescription() {
    }

    public GetSelectValueFieldDescription(RecordType recordType, RecordRef customRecordType, RecordRef customTransactionType, String sublist, String field, RecordRef customForm, GetSelectValueFilter filter, GetSelectFilterByFieldValueList filterByValueList) {
        this.recordType = recordType;
        this.customRecordType = customRecordType;
        this.customTransactionType = customTransactionType;
        this.sublist = sublist;
        this.field = field;
        this.customForm = customForm;
        this.filter = filter;
        this.filterByValueList = filterByValueList;
    }

    public RecordType getRecordType() {
        return this.recordType;
    }

    public void setRecordType(RecordType recordType) {
        this.recordType = recordType;
    }

    public RecordRef getCustomRecordType() {
        return this.customRecordType;
    }

    public void setCustomRecordType(RecordRef customRecordType) {
        this.customRecordType = customRecordType;
    }

    public RecordRef getCustomTransactionType() {
        return this.customTransactionType;
    }

    public void setCustomTransactionType(RecordRef customTransactionType) {
        this.customTransactionType = customTransactionType;
    }

    public String getSublist() {
        return this.sublist;
    }

    public void setSublist(String sublist) {
        this.sublist = sublist;
    }

    public String getField() {
        return this.field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public RecordRef getCustomForm() {
        return this.customForm;
    }

    public void setCustomForm(RecordRef customForm) {
        this.customForm = customForm;
    }

    public GetSelectValueFilter getFilter() {
        return this.filter;
    }

    public void setFilter(GetSelectValueFilter filter) {
        this.filter = filter;
    }

    public GetSelectFilterByFieldValueList getFilterByValueList() {
        return this.filterByValueList;
    }

    public void setFilterByValueList(GetSelectFilterByFieldValueList filterByValueList) {
        this.filterByValueList = filterByValueList;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetSelectValueFieldDescription)) {
            return false;
        }
        GetSelectValueFieldDescription other = (GetSelectValueFieldDescription)obj;
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
        boolean _equals = (this.recordType == null && other.getRecordType() == null || this.recordType != null && this.recordType.equals(other.getRecordType())) && (this.customRecordType == null && other.getCustomRecordType() == null || this.customRecordType != null && this.customRecordType.equals(other.getCustomRecordType())) && (this.customTransactionType == null && other.getCustomTransactionType() == null || this.customTransactionType != null && this.customTransactionType.equals(other.getCustomTransactionType())) && (this.sublist == null && other.getSublist() == null || this.sublist != null && this.sublist.equals(other.getSublist())) && (this.field == null && other.getField() == null || this.field != null && this.field.equals(other.getField())) && (this.customForm == null && other.getCustomForm() == null || this.customForm != null && this.customForm.equals(other.getCustomForm())) && (this.filter == null && other.getFilter() == null || this.filter != null && this.filter.equals(other.getFilter())) && (this.filterByValueList == null && other.getFilterByValueList() == null || this.filterByValueList != null && this.filterByValueList.equals(other.getFilterByValueList()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getRecordType() != null) {
            _hashCode += this.getRecordType().hashCode();
        }
        if (this.getCustomRecordType() != null) {
            _hashCode += this.getCustomRecordType().hashCode();
        }
        if (this.getCustomTransactionType() != null) {
            _hashCode += this.getCustomTransactionType().hashCode();
        }
        if (this.getSublist() != null) {
            _hashCode += this.getSublist().hashCode();
        }
        if (this.getField() != null) {
            _hashCode += this.getField().hashCode();
        }
        if (this.getCustomForm() != null) {
            _hashCode += this.getCustomForm().hashCode();
        }
        if (this.getFilter() != null) {
            _hashCode += this.getFilter().hashCode();
        }
        if (this.getFilterByValueList() != null) {
            _hashCode += this.getFilterByValueList().hashCode();
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
        typeDesc.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "GetSelectValueFieldDescription"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("recordType");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "recordType"));
        elemField.setXmlType(new QName("urn:types.core_2022_1.platform.webservices.netsuite.com", "RecordType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customRecordType");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "customRecordType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customTransactionType");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "customTransactionType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("sublist");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "sublist"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("field");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "field"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customForm");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("filter");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "filter"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "GetSelectValueFilter"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("filterByValueList");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "filterByValueList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "GetSelectFilterByFieldValueList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

