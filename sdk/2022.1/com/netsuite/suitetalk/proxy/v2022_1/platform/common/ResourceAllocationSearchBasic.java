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
package com.netsuite.suitetalk.proxy.v2022_1.platform.common;

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchCustomFieldList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchDateField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchDoubleField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchEnumMultiSelectField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchLongField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchMultiSelectField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchRecordBasic;
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

public class ResourceAllocationSearchBasic
extends SearchRecordBasic
implements Serializable {
    private SearchMultiSelectField allocationType;
    private SearchEnumMultiSelectField allocationUnit;
    private SearchEnumMultiSelectField approvalStatus;
    private SearchMultiSelectField customer;
    private SearchDateField endDate;
    private SearchMultiSelectField externalId;
    private SearchStringField externalIdString;
    private SearchMultiSelectField internalId;
    private SearchLongField internalIdNumber;
    private SearchMultiSelectField nextApprover;
    private SearchStringField notes;
    private SearchDoubleField numberHours;
    private SearchDoubleField percentOfTime;
    private SearchMultiSelectField project;
    private SearchMultiSelectField requestedBy;
    private SearchMultiSelectField resource;
    private SearchDateField startDate;
    private SearchCustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(ResourceAllocationSearchBasic.class, true);

    public ResourceAllocationSearchBasic() {
    }

    public ResourceAllocationSearchBasic(SearchMultiSelectField allocationType, SearchEnumMultiSelectField allocationUnit, SearchEnumMultiSelectField approvalStatus, SearchMultiSelectField customer, SearchDateField endDate, SearchMultiSelectField externalId, SearchStringField externalIdString, SearchMultiSelectField internalId, SearchLongField internalIdNumber, SearchMultiSelectField nextApprover, SearchStringField notes, SearchDoubleField numberHours, SearchDoubleField percentOfTime, SearchMultiSelectField project, SearchMultiSelectField requestedBy, SearchMultiSelectField resource, SearchDateField startDate, SearchCustomFieldList customFieldList) {
        this.allocationType = allocationType;
        this.allocationUnit = allocationUnit;
        this.approvalStatus = approvalStatus;
        this.customer = customer;
        this.endDate = endDate;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.nextApprover = nextApprover;
        this.notes = notes;
        this.numberHours = numberHours;
        this.percentOfTime = percentOfTime;
        this.project = project;
        this.requestedBy = requestedBy;
        this.resource = resource;
        this.startDate = startDate;
        this.customFieldList = customFieldList;
    }

    public SearchMultiSelectField getAllocationType() {
        return this.allocationType;
    }

    public void setAllocationType(SearchMultiSelectField allocationType) {
        this.allocationType = allocationType;
    }

    public SearchEnumMultiSelectField getAllocationUnit() {
        return this.allocationUnit;
    }

    public void setAllocationUnit(SearchEnumMultiSelectField allocationUnit) {
        this.allocationUnit = allocationUnit;
    }

    public SearchEnumMultiSelectField getApprovalStatus() {
        return this.approvalStatus;
    }

    public void setApprovalStatus(SearchEnumMultiSelectField approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public SearchMultiSelectField getCustomer() {
        return this.customer;
    }

    public void setCustomer(SearchMultiSelectField customer) {
        this.customer = customer;
    }

    public SearchDateField getEndDate() {
        return this.endDate;
    }

    public void setEndDate(SearchDateField endDate) {
        this.endDate = endDate;
    }

    public SearchMultiSelectField getExternalId() {
        return this.externalId;
    }

    public void setExternalId(SearchMultiSelectField externalId) {
        this.externalId = externalId;
    }

    public SearchStringField getExternalIdString() {
        return this.externalIdString;
    }

    public void setExternalIdString(SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }

    public SearchMultiSelectField getInternalId() {
        return this.internalId;
    }

    public void setInternalId(SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }

    public SearchLongField getInternalIdNumber() {
        return this.internalIdNumber;
    }

    public void setInternalIdNumber(SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }

    public SearchMultiSelectField getNextApprover() {
        return this.nextApprover;
    }

    public void setNextApprover(SearchMultiSelectField nextApprover) {
        this.nextApprover = nextApprover;
    }

    public SearchStringField getNotes() {
        return this.notes;
    }

    public void setNotes(SearchStringField notes) {
        this.notes = notes;
    }

    public SearchDoubleField getNumberHours() {
        return this.numberHours;
    }

    public void setNumberHours(SearchDoubleField numberHours) {
        this.numberHours = numberHours;
    }

    public SearchDoubleField getPercentOfTime() {
        return this.percentOfTime;
    }

    public void setPercentOfTime(SearchDoubleField percentOfTime) {
        this.percentOfTime = percentOfTime;
    }

    public SearchMultiSelectField getProject() {
        return this.project;
    }

    public void setProject(SearchMultiSelectField project) {
        this.project = project;
    }

    public SearchMultiSelectField getRequestedBy() {
        return this.requestedBy;
    }

    public void setRequestedBy(SearchMultiSelectField requestedBy) {
        this.requestedBy = requestedBy;
    }

    public SearchMultiSelectField getResource() {
        return this.resource;
    }

    public void setResource(SearchMultiSelectField resource) {
        this.resource = resource;
    }

    public SearchDateField getStartDate() {
        return this.startDate;
    }

    public void setStartDate(SearchDateField startDate) {
        this.startDate = startDate;
    }

    public SearchCustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ResourceAllocationSearchBasic)) {
            return false;
        }
        ResourceAllocationSearchBasic other = (ResourceAllocationSearchBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.allocationType == null && other.getAllocationType() == null || this.allocationType != null && this.allocationType.equals(other.getAllocationType())) && (this.allocationUnit == null && other.getAllocationUnit() == null || this.allocationUnit != null && this.allocationUnit.equals(other.getAllocationUnit())) && (this.approvalStatus == null && other.getApprovalStatus() == null || this.approvalStatus != null && this.approvalStatus.equals(other.getApprovalStatus())) && (this.customer == null && other.getCustomer() == null || this.customer != null && this.customer.equals(other.getCustomer())) && (this.endDate == null && other.getEndDate() == null || this.endDate != null && this.endDate.equals(other.getEndDate())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId())) && (this.externalIdString == null && other.getExternalIdString() == null || this.externalIdString != null && this.externalIdString.equals(other.getExternalIdString())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.internalIdNumber == null && other.getInternalIdNumber() == null || this.internalIdNumber != null && this.internalIdNumber.equals(other.getInternalIdNumber())) && (this.nextApprover == null && other.getNextApprover() == null || this.nextApprover != null && this.nextApprover.equals(other.getNextApprover())) && (this.notes == null && other.getNotes() == null || this.notes != null && this.notes.equals(other.getNotes())) && (this.numberHours == null && other.getNumberHours() == null || this.numberHours != null && this.numberHours.equals(other.getNumberHours())) && (this.percentOfTime == null && other.getPercentOfTime() == null || this.percentOfTime != null && this.percentOfTime.equals(other.getPercentOfTime())) && (this.project == null && other.getProject() == null || this.project != null && this.project.equals(other.getProject())) && (this.requestedBy == null && other.getRequestedBy() == null || this.requestedBy != null && this.requestedBy.equals(other.getRequestedBy())) && (this.resource == null && other.getResource() == null || this.resource != null && this.resource.equals(other.getResource())) && (this.startDate == null && other.getStartDate() == null || this.startDate != null && this.startDate.equals(other.getStartDate())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
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
        if (this.getAllocationType() != null) {
            _hashCode += this.getAllocationType().hashCode();
        }
        if (this.getAllocationUnit() != null) {
            _hashCode += this.getAllocationUnit().hashCode();
        }
        if (this.getApprovalStatus() != null) {
            _hashCode += this.getApprovalStatus().hashCode();
        }
        if (this.getCustomer() != null) {
            _hashCode += this.getCustomer().hashCode();
        }
        if (this.getEndDate() != null) {
            _hashCode += this.getEndDate().hashCode();
        }
        if (this.getExternalId() != null) {
            _hashCode += this.getExternalId().hashCode();
        }
        if (this.getExternalIdString() != null) {
            _hashCode += this.getExternalIdString().hashCode();
        }
        if (this.getInternalId() != null) {
            _hashCode += this.getInternalId().hashCode();
        }
        if (this.getInternalIdNumber() != null) {
            _hashCode += this.getInternalIdNumber().hashCode();
        }
        if (this.getNextApprover() != null) {
            _hashCode += this.getNextApprover().hashCode();
        }
        if (this.getNotes() != null) {
            _hashCode += this.getNotes().hashCode();
        }
        if (this.getNumberHours() != null) {
            _hashCode += this.getNumberHours().hashCode();
        }
        if (this.getPercentOfTime() != null) {
            _hashCode += this.getPercentOfTime().hashCode();
        }
        if (this.getProject() != null) {
            _hashCode += this.getProject().hashCode();
        }
        if (this.getRequestedBy() != null) {
            _hashCode += this.getRequestedBy().hashCode();
        }
        if (this.getResource() != null) {
            _hashCode += this.getResource().hashCode();
        }
        if (this.getStartDate() != null) {
            _hashCode += this.getStartDate().hashCode();
        }
        if (this.getCustomFieldList() != null) {
            _hashCode += this.getCustomFieldList().hashCode();
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ResourceAllocationSearchBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("allocationType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "allocationType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("allocationUnit");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "allocationUnit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("approvalStatus");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "approvalStatus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customer");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "customer"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "endDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "externalId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("externalIdString");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "externalIdString"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("internalIdNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "internalIdNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("nextApprover");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "nextApprover"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("notes");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "notes"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("numberHours");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "numberHours"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("percentOfTime");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "percentOfTime"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("project");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "project"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("requestedBy");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "requestedBy"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("resource");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "resource"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchCustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

