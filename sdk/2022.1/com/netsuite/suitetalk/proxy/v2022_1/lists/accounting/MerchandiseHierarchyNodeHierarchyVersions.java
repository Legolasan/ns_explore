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
package com.netsuite.suitetalk.proxy.v2022_1.lists.accounting;

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import java.io.Serializable;
import java.util.Calendar;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class MerchandiseHierarchyNodeHierarchyVersions
implements Serializable {
    private Boolean isIncluded;
    private RecordRef hierarchyVersion;
    private Calendar startDate;
    private Calendar endDate;
    private RecordRef hierarchyLevel;
    private RecordRef parentNode;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(MerchandiseHierarchyNodeHierarchyVersions.class, true);

    public MerchandiseHierarchyNodeHierarchyVersions() {
    }

    public MerchandiseHierarchyNodeHierarchyVersions(Boolean isIncluded, RecordRef hierarchyVersion, Calendar startDate, Calendar endDate, RecordRef hierarchyLevel, RecordRef parentNode) {
        this.isIncluded = isIncluded;
        this.hierarchyVersion = hierarchyVersion;
        this.startDate = startDate;
        this.endDate = endDate;
        this.hierarchyLevel = hierarchyLevel;
        this.parentNode = parentNode;
    }

    public Boolean getIsIncluded() {
        return this.isIncluded;
    }

    public void setIsIncluded(Boolean isIncluded) {
        this.isIncluded = isIncluded;
    }

    public RecordRef getHierarchyVersion() {
        return this.hierarchyVersion;
    }

    public void setHierarchyVersion(RecordRef hierarchyVersion) {
        this.hierarchyVersion = hierarchyVersion;
    }

    public Calendar getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Calendar startDate) {
        this.startDate = startDate;
    }

    public Calendar getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Calendar endDate) {
        this.endDate = endDate;
    }

    public RecordRef getHierarchyLevel() {
        return this.hierarchyLevel;
    }

    public void setHierarchyLevel(RecordRef hierarchyLevel) {
        this.hierarchyLevel = hierarchyLevel;
    }

    public RecordRef getParentNode() {
        return this.parentNode;
    }

    public void setParentNode(RecordRef parentNode) {
        this.parentNode = parentNode;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof MerchandiseHierarchyNodeHierarchyVersions)) {
            return false;
        }
        MerchandiseHierarchyNodeHierarchyVersions other = (MerchandiseHierarchyNodeHierarchyVersions)obj;
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
        boolean _equals = (this.isIncluded == null && other.getIsIncluded() == null || this.isIncluded != null && this.isIncluded.equals(other.getIsIncluded())) && (this.hierarchyVersion == null && other.getHierarchyVersion() == null || this.hierarchyVersion != null && this.hierarchyVersion.equals(other.getHierarchyVersion())) && (this.startDate == null && other.getStartDate() == null || this.startDate != null && this.startDate.equals(other.getStartDate())) && (this.endDate == null && other.getEndDate() == null || this.endDate != null && this.endDate.equals(other.getEndDate())) && (this.hierarchyLevel == null && other.getHierarchyLevel() == null || this.hierarchyLevel != null && this.hierarchyLevel.equals(other.getHierarchyLevel())) && (this.parentNode == null && other.getParentNode() == null || this.parentNode != null && this.parentNode.equals(other.getParentNode()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getIsIncluded() != null) {
            _hashCode += this.getIsIncluded().hashCode();
        }
        if (this.getHierarchyVersion() != null) {
            _hashCode += this.getHierarchyVersion().hashCode();
        }
        if (this.getStartDate() != null) {
            _hashCode += this.getStartDate().hashCode();
        }
        if (this.getEndDate() != null) {
            _hashCode += this.getEndDate().hashCode();
        }
        if (this.getHierarchyLevel() != null) {
            _hashCode += this.getHierarchyLevel().hashCode();
        }
        if (this.getParentNode() != null) {
            _hashCode += this.getParentNode().hashCode();
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
        typeDesc.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "MerchandiseHierarchyNodeHierarchyVersions"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("isIncluded");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "isIncluded"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("hierarchyVersion");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "hierarchyVersion"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "endDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("hierarchyLevel");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "hierarchyLevel"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("parentNode");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "parentNode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

