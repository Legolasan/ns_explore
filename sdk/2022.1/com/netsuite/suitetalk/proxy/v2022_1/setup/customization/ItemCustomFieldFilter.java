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
package com.netsuite.suitetalk.proxy.v2022_1.setup.customization;

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import com.netsuite.suitetalk.proxy.v2022_1.setup.customization.FldFilterSelList;
import com.netsuite.suitetalk.proxy.v2022_1.setup.customization.types.CustomizationFilterCompareType;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class ItemCustomFieldFilter
implements Serializable {
    private RecordRef fldFilter;
    private Boolean fldFilterChecked;
    private CustomizationFilterCompareType fldFilterCompareType;
    private String fldFilterVal;
    private FldFilterSelList fldFilterSelList;
    private Boolean fldFilterNotNull;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(ItemCustomFieldFilter.class, true);

    public ItemCustomFieldFilter() {
    }

    public ItemCustomFieldFilter(RecordRef fldFilter, Boolean fldFilterChecked, CustomizationFilterCompareType fldFilterCompareType, String fldFilterVal, FldFilterSelList fldFilterSelList, Boolean fldFilterNotNull) {
        this.fldFilter = fldFilter;
        this.fldFilterChecked = fldFilterChecked;
        this.fldFilterCompareType = fldFilterCompareType;
        this.fldFilterVal = fldFilterVal;
        this.fldFilterSelList = fldFilterSelList;
        this.fldFilterNotNull = fldFilterNotNull;
    }

    public RecordRef getFldFilter() {
        return this.fldFilter;
    }

    public void setFldFilter(RecordRef fldFilter) {
        this.fldFilter = fldFilter;
    }

    public Boolean getFldFilterChecked() {
        return this.fldFilterChecked;
    }

    public void setFldFilterChecked(Boolean fldFilterChecked) {
        this.fldFilterChecked = fldFilterChecked;
    }

    public CustomizationFilterCompareType getFldFilterCompareType() {
        return this.fldFilterCompareType;
    }

    public void setFldFilterCompareType(CustomizationFilterCompareType fldFilterCompareType) {
        this.fldFilterCompareType = fldFilterCompareType;
    }

    public String getFldFilterVal() {
        return this.fldFilterVal;
    }

    public void setFldFilterVal(String fldFilterVal) {
        this.fldFilterVal = fldFilterVal;
    }

    public FldFilterSelList getFldFilterSelList() {
        return this.fldFilterSelList;
    }

    public void setFldFilterSelList(FldFilterSelList fldFilterSelList) {
        this.fldFilterSelList = fldFilterSelList;
    }

    public Boolean getFldFilterNotNull() {
        return this.fldFilterNotNull;
    }

    public void setFldFilterNotNull(Boolean fldFilterNotNull) {
        this.fldFilterNotNull = fldFilterNotNull;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ItemCustomFieldFilter)) {
            return false;
        }
        ItemCustomFieldFilter other = (ItemCustomFieldFilter)obj;
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
        boolean _equals = (this.fldFilter == null && other.getFldFilter() == null || this.fldFilter != null && this.fldFilter.equals(other.getFldFilter())) && (this.fldFilterChecked == null && other.getFldFilterChecked() == null || this.fldFilterChecked != null && this.fldFilterChecked.equals(other.getFldFilterChecked())) && (this.fldFilterCompareType == null && other.getFldFilterCompareType() == null || this.fldFilterCompareType != null && this.fldFilterCompareType.equals(other.getFldFilterCompareType())) && (this.fldFilterVal == null && other.getFldFilterVal() == null || this.fldFilterVal != null && this.fldFilterVal.equals(other.getFldFilterVal())) && (this.fldFilterSelList == null && other.getFldFilterSelList() == null || this.fldFilterSelList != null && this.fldFilterSelList.equals(other.getFldFilterSelList())) && (this.fldFilterNotNull == null && other.getFldFilterNotNull() == null || this.fldFilterNotNull != null && this.fldFilterNotNull.equals(other.getFldFilterNotNull()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getFldFilter() != null) {
            _hashCode += this.getFldFilter().hashCode();
        }
        if (this.getFldFilterChecked() != null) {
            _hashCode += this.getFldFilterChecked().hashCode();
        }
        if (this.getFldFilterCompareType() != null) {
            _hashCode += this.getFldFilterCompareType().hashCode();
        }
        if (this.getFldFilterVal() != null) {
            _hashCode += this.getFldFilterVal().hashCode();
        }
        if (this.getFldFilterSelList() != null) {
            _hashCode += this.getFldFilterSelList().hashCode();
        }
        if (this.getFldFilterNotNull() != null) {
            _hashCode += this.getFldFilterNotNull().hashCode();
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
        typeDesc.setXmlType(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "ItemCustomFieldFilter"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("fldFilter");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "fldFilter"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fldFilterChecked");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "fldFilterChecked"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fldFilterCompareType");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "fldFilterCompareType"));
        elemField.setXmlType(new QName("urn:types.customization_2022_1.setup.webservices.netsuite.com", "CustomizationFilterCompareType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fldFilterVal");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "fldFilterVal"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fldFilterSelList");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "fldFilterSelList"));
        elemField.setXmlType(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "FldFilterSelList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fldFilterNotNull");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "fldFilterNotNull"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

