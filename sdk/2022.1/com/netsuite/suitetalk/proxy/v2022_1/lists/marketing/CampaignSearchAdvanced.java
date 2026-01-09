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
package com.netsuite.suitetalk.proxy.v2022_1.lists.marketing;

import com.netsuite.suitetalk.proxy.v2022_1.lists.marketing.CampaignSearch;
import com.netsuite.suitetalk.proxy.v2022_1.lists.marketing.CampaignSearchRow;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchRecord;
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

public class CampaignSearchAdvanced
extends SearchRecord
implements Serializable {
    private CampaignSearch criteria;
    private CampaignSearchRow columns;
    private String savedSearchId;
    private String savedSearchScriptId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(CampaignSearchAdvanced.class, true);

    public CampaignSearchAdvanced() {
    }

    public CampaignSearchAdvanced(String savedSearchId, String savedSearchScriptId, CampaignSearch criteria, CampaignSearchRow columns) {
        this.savedSearchId = savedSearchId;
        this.savedSearchScriptId = savedSearchScriptId;
        this.criteria = criteria;
        this.columns = columns;
    }

    public CampaignSearch getCriteria() {
        return this.criteria;
    }

    public void setCriteria(CampaignSearch criteria) {
        this.criteria = criteria;
    }

    public CampaignSearchRow getColumns() {
        return this.columns;
    }

    public void setColumns(CampaignSearchRow columns) {
        this.columns = columns;
    }

    public String getSavedSearchId() {
        return this.savedSearchId;
    }

    public void setSavedSearchId(String savedSearchId) {
        this.savedSearchId = savedSearchId;
    }

    public String getSavedSearchScriptId() {
        return this.savedSearchScriptId;
    }

    public void setSavedSearchScriptId(String savedSearchScriptId) {
        this.savedSearchScriptId = savedSearchScriptId;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CampaignSearchAdvanced)) {
            return false;
        }
        CampaignSearchAdvanced other = (CampaignSearchAdvanced)obj;
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
        boolean _equals = super.equals(obj) && (this.criteria == null && other.getCriteria() == null || this.criteria != null && this.criteria.equals(other.getCriteria())) && (this.columns == null && other.getColumns() == null || this.columns != null && this.columns.equals(other.getColumns())) && (this.savedSearchId == null && other.getSavedSearchId() == null || this.savedSearchId != null && this.savedSearchId.equals(other.getSavedSearchId())) && (this.savedSearchScriptId == null && other.getSavedSearchScriptId() == null || this.savedSearchScriptId != null && this.savedSearchScriptId.equals(other.getSavedSearchScriptId()));
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
        if (this.getCriteria() != null) {
            _hashCode += this.getCriteria().hashCode();
        }
        if (this.getColumns() != null) {
            _hashCode += this.getColumns().hashCode();
        }
        if (this.getSavedSearchId() != null) {
            _hashCode += this.getSavedSearchId().hashCode();
        }
        if (this.getSavedSearchScriptId() != null) {
            _hashCode += this.getSavedSearchScriptId().hashCode();
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
        typeDesc.setXmlType(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "CampaignSearchAdvanced"));
        AttributeDesc attrField = new AttributeDesc();
        attrField.setFieldName("savedSearchId");
        attrField.setXmlName(new QName("", "savedSearchId"));
        attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc((FieldDesc)attrField);
        attrField = new AttributeDesc();
        attrField.setFieldName("savedSearchScriptId");
        attrField.setXmlName(new QName("", "savedSearchScriptId"));
        attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc((FieldDesc)attrField);
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("criteria");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "criteria"));
        elemField.setXmlType(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "CampaignSearch"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("columns");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "columns"));
        elemField.setXmlType(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "CampaignSearchRow"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

