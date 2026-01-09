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

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchDateField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchEnumMultiSelectField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchStringField;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class GetDeletedFilter
implements Serializable {
    private SearchDateField deletedDate;
    private SearchEnumMultiSelectField type;
    private SearchStringField scriptId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(GetDeletedFilter.class, true);

    public GetDeletedFilter() {
    }

    public GetDeletedFilter(SearchDateField deletedDate, SearchEnumMultiSelectField type, SearchStringField scriptId) {
        this.deletedDate = deletedDate;
        this.type = type;
        this.scriptId = scriptId;
    }

    public SearchDateField getDeletedDate() {
        return this.deletedDate;
    }

    public void setDeletedDate(SearchDateField deletedDate) {
        this.deletedDate = deletedDate;
    }

    public SearchEnumMultiSelectField getType() {
        return this.type;
    }

    public void setType(SearchEnumMultiSelectField type) {
        this.type = type;
    }

    public SearchStringField getScriptId() {
        return this.scriptId;
    }

    public void setScriptId(SearchStringField scriptId) {
        this.scriptId = scriptId;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetDeletedFilter)) {
            return false;
        }
        GetDeletedFilter other = (GetDeletedFilter)obj;
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
        boolean _equals = (this.deletedDate == null && other.getDeletedDate() == null || this.deletedDate != null && this.deletedDate.equals(other.getDeletedDate())) && (this.type == null && other.getType() == null || this.type != null && this.type.equals(other.getType())) && (this.scriptId == null && other.getScriptId() == null || this.scriptId != null && this.scriptId.equals(other.getScriptId()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getDeletedDate() != null) {
            _hashCode += this.getDeletedDate().hashCode();
        }
        if (this.getType() != null) {
            _hashCode += this.getType().hashCode();
        }
        if (this.getScriptId() != null) {
            _hashCode += this.getScriptId().hashCode();
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
        typeDesc.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "GetDeletedFilter"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("deletedDate");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "deletedDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "type"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("scriptId");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "scriptId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

