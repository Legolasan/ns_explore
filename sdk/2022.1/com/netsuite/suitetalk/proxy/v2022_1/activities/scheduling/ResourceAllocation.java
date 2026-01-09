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
package com.netsuite.suitetalk.proxy.v2022_1.activities.scheduling;

import com.netsuite.suitetalk.proxy.v2022_1.activities.scheduling.types.ResourceAllocationAllocationUnit;
import com.netsuite.suitetalk.proxy.v2022_1.activities.scheduling.types.ResourceAllocationApprovalStatus;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.CustomFieldList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.NullField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.Record;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import java.io.Serializable;
import java.util.Calendar;
import javax.xml.namespace.QName;
import org.apache.axis.description.AttributeDesc;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class ResourceAllocation
extends Record
implements Serializable {
    private RecordRef requestedby;
    private ResourceAllocationApprovalStatus approvalStatus;
    private RecordRef nextApprover;
    private RecordRef allocationResource;
    private RecordRef project;
    private String notes;
    private Calendar startDate;
    private Calendar endDate;
    private Double allocationAmount;
    private ResourceAllocationAllocationUnit allocationUnit;
    private Double numberHours;
    private Double percentOfTime;
    private RecordRef allocationType;
    private RecordRef customForm;
    private CustomFieldList customFieldList;
    private String internalId;
    private String externalId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(ResourceAllocation.class, true);

    public ResourceAllocation() {
    }

    public ResourceAllocation(NullField nullFieldList, String internalId, String externalId, RecordRef requestedby, ResourceAllocationApprovalStatus approvalStatus, RecordRef nextApprover, RecordRef allocationResource, RecordRef project, String notes, Calendar startDate, Calendar endDate, Double allocationAmount, ResourceAllocationAllocationUnit allocationUnit, Double numberHours, Double percentOfTime, RecordRef allocationType, RecordRef customForm, CustomFieldList customFieldList) {
        super(nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.requestedby = requestedby;
        this.approvalStatus = approvalStatus;
        this.nextApprover = nextApprover;
        this.allocationResource = allocationResource;
        this.project = project;
        this.notes = notes;
        this.startDate = startDate;
        this.endDate = endDate;
        this.allocationAmount = allocationAmount;
        this.allocationUnit = allocationUnit;
        this.numberHours = numberHours;
        this.percentOfTime = percentOfTime;
        this.allocationType = allocationType;
        this.customForm = customForm;
        this.customFieldList = customFieldList;
    }

    public RecordRef getRequestedby() {
        return this.requestedby;
    }

    public void setRequestedby(RecordRef requestedby) {
        this.requestedby = requestedby;
    }

    public ResourceAllocationApprovalStatus getApprovalStatus() {
        return this.approvalStatus;
    }

    public void setApprovalStatus(ResourceAllocationApprovalStatus approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public RecordRef getNextApprover() {
        return this.nextApprover;
    }

    public void setNextApprover(RecordRef nextApprover) {
        this.nextApprover = nextApprover;
    }

    public RecordRef getAllocationResource() {
        return this.allocationResource;
    }

    public void setAllocationResource(RecordRef allocationResource) {
        this.allocationResource = allocationResource;
    }

    public RecordRef getProject() {
        return this.project;
    }

    public void setProject(RecordRef project) {
        this.project = project;
    }

    public String getNotes() {
        return this.notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
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

    public Double getAllocationAmount() {
        return this.allocationAmount;
    }

    public void setAllocationAmount(Double allocationAmount) {
        this.allocationAmount = allocationAmount;
    }

    public ResourceAllocationAllocationUnit getAllocationUnit() {
        return this.allocationUnit;
    }

    public void setAllocationUnit(ResourceAllocationAllocationUnit allocationUnit) {
        this.allocationUnit = allocationUnit;
    }

    public Double getNumberHours() {
        return this.numberHours;
    }

    public void setNumberHours(Double numberHours) {
        this.numberHours = numberHours;
    }

    public Double getPercentOfTime() {
        return this.percentOfTime;
    }

    public void setPercentOfTime(Double percentOfTime) {
        this.percentOfTime = percentOfTime;
    }

    public RecordRef getAllocationType() {
        return this.allocationType;
    }

    public void setAllocationType(RecordRef allocationType) {
        this.allocationType = allocationType;
    }

    public RecordRef getCustomForm() {
        return this.customForm;
    }

    public void setCustomForm(RecordRef customForm) {
        this.customForm = customForm;
    }

    public CustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    public String getInternalId() {
        return this.internalId;
    }

    public void setInternalId(String internalId) {
        this.internalId = internalId;
    }

    public String getExternalId() {
        return this.externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ResourceAllocation)) {
            return false;
        }
        ResourceAllocation other = (ResourceAllocation)obj;
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
        boolean _equals = super.equals(obj) && (this.requestedby == null && other.getRequestedby() == null || this.requestedby != null && this.requestedby.equals(other.getRequestedby())) && (this.approvalStatus == null && other.getApprovalStatus() == null || this.approvalStatus != null && this.approvalStatus.equals(other.getApprovalStatus())) && (this.nextApprover == null && other.getNextApprover() == null || this.nextApprover != null && this.nextApprover.equals(other.getNextApprover())) && (this.allocationResource == null && other.getAllocationResource() == null || this.allocationResource != null && this.allocationResource.equals(other.getAllocationResource())) && (this.project == null && other.getProject() == null || this.project != null && this.project.equals(other.getProject())) && (this.notes == null && other.getNotes() == null || this.notes != null && this.notes.equals(other.getNotes())) && (this.startDate == null && other.getStartDate() == null || this.startDate != null && this.startDate.equals(other.getStartDate())) && (this.endDate == null && other.getEndDate() == null || this.endDate != null && this.endDate.equals(other.getEndDate())) && (this.allocationAmount == null && other.getAllocationAmount() == null || this.allocationAmount != null && this.allocationAmount.equals(other.getAllocationAmount())) && (this.allocationUnit == null && other.getAllocationUnit() == null || this.allocationUnit != null && this.allocationUnit.equals(other.getAllocationUnit())) && (this.numberHours == null && other.getNumberHours() == null || this.numberHours != null && this.numberHours.equals(other.getNumberHours())) && (this.percentOfTime == null && other.getPercentOfTime() == null || this.percentOfTime != null && this.percentOfTime.equals(other.getPercentOfTime())) && (this.allocationType == null && other.getAllocationType() == null || this.allocationType != null && this.allocationType.equals(other.getAllocationType())) && (this.customForm == null && other.getCustomForm() == null || this.customForm != null && this.customForm.equals(other.getCustomForm())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
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
        if (this.getRequestedby() != null) {
            _hashCode += this.getRequestedby().hashCode();
        }
        if (this.getApprovalStatus() != null) {
            _hashCode += this.getApprovalStatus().hashCode();
        }
        if (this.getNextApprover() != null) {
            _hashCode += this.getNextApprover().hashCode();
        }
        if (this.getAllocationResource() != null) {
            _hashCode += this.getAllocationResource().hashCode();
        }
        if (this.getProject() != null) {
            _hashCode += this.getProject().hashCode();
        }
        if (this.getNotes() != null) {
            _hashCode += this.getNotes().hashCode();
        }
        if (this.getStartDate() != null) {
            _hashCode += this.getStartDate().hashCode();
        }
        if (this.getEndDate() != null) {
            _hashCode += this.getEndDate().hashCode();
        }
        if (this.getAllocationAmount() != null) {
            _hashCode += this.getAllocationAmount().hashCode();
        }
        if (this.getAllocationUnit() != null) {
            _hashCode += this.getAllocationUnit().hashCode();
        }
        if (this.getNumberHours() != null) {
            _hashCode += this.getNumberHours().hashCode();
        }
        if (this.getPercentOfTime() != null) {
            _hashCode += this.getPercentOfTime().hashCode();
        }
        if (this.getAllocationType() != null) {
            _hashCode += this.getAllocationType().hashCode();
        }
        if (this.getCustomForm() != null) {
            _hashCode += this.getCustomForm().hashCode();
        }
        if (this.getCustomFieldList() != null) {
            _hashCode += this.getCustomFieldList().hashCode();
        }
        if (this.getInternalId() != null) {
            _hashCode += this.getInternalId().hashCode();
        }
        if (this.getExternalId() != null) {
            _hashCode += this.getExternalId().hashCode();
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
        typeDesc.setXmlType(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "ResourceAllocation"));
        AttributeDesc attrField = new AttributeDesc();
        attrField.setFieldName("internalId");
        attrField.setXmlName(new QName("", "internalId"));
        attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc((FieldDesc)attrField);
        attrField = new AttributeDesc();
        attrField.setFieldName("externalId");
        attrField.setXmlName(new QName("", "externalId"));
        attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc((FieldDesc)attrField);
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("requestedby");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "requestedby"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("approvalStatus");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "approvalStatus"));
        elemField.setXmlType(new QName("urn:types.scheduling_2022_1.activities.webservices.netsuite.com", "ResourceAllocationApprovalStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("nextApprover");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "nextApprover"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("allocationResource");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "allocationResource"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("project");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "project"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("notes");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "notes"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "endDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("allocationAmount");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "allocationAmount"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("allocationUnit");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "allocationUnit"));
        elemField.setXmlType(new QName("urn:types.scheduling_2022_1.activities.webservices.netsuite.com", "ResourceAllocationAllocationUnit"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("numberHours");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "numberHours"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("percentOfTime");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "percentOfTime"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("allocationType");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "allocationType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customForm");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "CustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

