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
package com.netsuite.suitetalk.proxy.v2022_1.lists.employees;

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class EmployeeHcmPosition
implements Serializable {
    private RecordRef position;
    private Boolean primaryPosition;
    private String positionId;
    private Double positionAllocation;
    private Double fullTimeEquivalent;
    private RecordRef employmentCategory;
    private RecordRef reportsTo;
    private RecordRef subsidiary;
    private RecordRef location;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(EmployeeHcmPosition.class, true);

    public EmployeeHcmPosition() {
    }

    public EmployeeHcmPosition(RecordRef position, Boolean primaryPosition, String positionId, Double positionAllocation, Double fullTimeEquivalent, RecordRef employmentCategory, RecordRef reportsTo, RecordRef subsidiary, RecordRef location) {
        this.position = position;
        this.primaryPosition = primaryPosition;
        this.positionId = positionId;
        this.positionAllocation = positionAllocation;
        this.fullTimeEquivalent = fullTimeEquivalent;
        this.employmentCategory = employmentCategory;
        this.reportsTo = reportsTo;
        this.subsidiary = subsidiary;
        this.location = location;
    }

    public RecordRef getPosition() {
        return this.position;
    }

    public void setPosition(RecordRef position) {
        this.position = position;
    }

    public Boolean getPrimaryPosition() {
        return this.primaryPosition;
    }

    public void setPrimaryPosition(Boolean primaryPosition) {
        this.primaryPosition = primaryPosition;
    }

    public String getPositionId() {
        return this.positionId;
    }

    public void setPositionId(String positionId) {
        this.positionId = positionId;
    }

    public Double getPositionAllocation() {
        return this.positionAllocation;
    }

    public void setPositionAllocation(Double positionAllocation) {
        this.positionAllocation = positionAllocation;
    }

    public Double getFullTimeEquivalent() {
        return this.fullTimeEquivalent;
    }

    public void setFullTimeEquivalent(Double fullTimeEquivalent) {
        this.fullTimeEquivalent = fullTimeEquivalent;
    }

    public RecordRef getEmploymentCategory() {
        return this.employmentCategory;
    }

    public void setEmploymentCategory(RecordRef employmentCategory) {
        this.employmentCategory = employmentCategory;
    }

    public RecordRef getReportsTo() {
        return this.reportsTo;
    }

    public void setReportsTo(RecordRef reportsTo) {
        this.reportsTo = reportsTo;
    }

    public RecordRef getSubsidiary() {
        return this.subsidiary;
    }

    public void setSubsidiary(RecordRef subsidiary) {
        this.subsidiary = subsidiary;
    }

    public RecordRef getLocation() {
        return this.location;
    }

    public void setLocation(RecordRef location) {
        this.location = location;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof EmployeeHcmPosition)) {
            return false;
        }
        EmployeeHcmPosition other = (EmployeeHcmPosition)obj;
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
        boolean _equals = (this.position == null && other.getPosition() == null || this.position != null && this.position.equals(other.getPosition())) && (this.primaryPosition == null && other.getPrimaryPosition() == null || this.primaryPosition != null && this.primaryPosition.equals(other.getPrimaryPosition())) && (this.positionId == null && other.getPositionId() == null || this.positionId != null && this.positionId.equals(other.getPositionId())) && (this.positionAllocation == null && other.getPositionAllocation() == null || this.positionAllocation != null && this.positionAllocation.equals(other.getPositionAllocation())) && (this.fullTimeEquivalent == null && other.getFullTimeEquivalent() == null || this.fullTimeEquivalent != null && this.fullTimeEquivalent.equals(other.getFullTimeEquivalent())) && (this.employmentCategory == null && other.getEmploymentCategory() == null || this.employmentCategory != null && this.employmentCategory.equals(other.getEmploymentCategory())) && (this.reportsTo == null && other.getReportsTo() == null || this.reportsTo != null && this.reportsTo.equals(other.getReportsTo())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && this.subsidiary.equals(other.getSubsidiary())) && (this.location == null && other.getLocation() == null || this.location != null && this.location.equals(other.getLocation()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getPosition() != null) {
            _hashCode += this.getPosition().hashCode();
        }
        if (this.getPrimaryPosition() != null) {
            _hashCode += this.getPrimaryPosition().hashCode();
        }
        if (this.getPositionId() != null) {
            _hashCode += this.getPositionId().hashCode();
        }
        if (this.getPositionAllocation() != null) {
            _hashCode += this.getPositionAllocation().hashCode();
        }
        if (this.getFullTimeEquivalent() != null) {
            _hashCode += this.getFullTimeEquivalent().hashCode();
        }
        if (this.getEmploymentCategory() != null) {
            _hashCode += this.getEmploymentCategory().hashCode();
        }
        if (this.getReportsTo() != null) {
            _hashCode += this.getReportsTo().hashCode();
        }
        if (this.getSubsidiary() != null) {
            _hashCode += this.getSubsidiary().hashCode();
        }
        if (this.getLocation() != null) {
            _hashCode += this.getLocation().hashCode();
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
        typeDesc.setXmlType(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "EmployeeHcmPosition"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("position");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "position"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("primaryPosition");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "primaryPosition"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("positionId");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "positionId"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("positionAllocation");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "positionAllocation"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fullTimeEquivalent");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "fullTimeEquivalent"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("employmentCategory");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "employmentCategory"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("reportsTo");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "reportsTo"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "location"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

