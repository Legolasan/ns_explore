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

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.CustomizationRefList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.Status;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class GetCustomizationIdResult
implements Serializable {
    private Status status;
    private Integer totalRecords;
    private CustomizationRefList customizationRefList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(GetCustomizationIdResult.class, true);

    public GetCustomizationIdResult() {
    }

    public GetCustomizationIdResult(Status status, Integer totalRecords, CustomizationRefList customizationRefList) {
        this.status = status;
        this.totalRecords = totalRecords;
        this.customizationRefList = customizationRefList;
    }

    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Integer getTotalRecords() {
        return this.totalRecords;
    }

    public void setTotalRecords(Integer totalRecords) {
        this.totalRecords = totalRecords;
    }

    public CustomizationRefList getCustomizationRefList() {
        return this.customizationRefList;
    }

    public void setCustomizationRefList(CustomizationRefList customizationRefList) {
        this.customizationRefList = customizationRefList;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetCustomizationIdResult)) {
            return false;
        }
        GetCustomizationIdResult other = (GetCustomizationIdResult)obj;
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
        boolean _equals = (this.status == null && other.getStatus() == null || this.status != null && this.status.equals(other.getStatus())) && (this.totalRecords == null && other.getTotalRecords() == null || this.totalRecords != null && this.totalRecords.equals(other.getTotalRecords())) && (this.customizationRefList == null && other.getCustomizationRefList() == null || this.customizationRefList != null && this.customizationRefList.equals(other.getCustomizationRefList()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getStatus() != null) {
            _hashCode += this.getStatus().hashCode();
        }
        if (this.getTotalRecords() != null) {
            _hashCode += this.getTotalRecords().hashCode();
        }
        if (this.getCustomizationRefList() != null) {
            _hashCode += this.getCustomizationRefList().hashCode();
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
        typeDesc.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "GetCustomizationIdResult"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "status"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "Status"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("totalRecords");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "totalRecords"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customizationRefList");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "customizationRefList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "CustomizationRefList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

