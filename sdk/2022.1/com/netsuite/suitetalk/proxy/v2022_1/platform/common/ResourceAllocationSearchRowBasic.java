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

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnCustomFieldList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnDateField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnDoubleField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnEnumSelectField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnSelectField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnStringField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchRowBasic;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class ResourceAllocationSearchRowBasic
extends SearchRowBasic
implements Serializable {
    private SearchColumnSelectField[] allocationType;
    private SearchColumnEnumSelectField[] allocationUnit;
    private SearchColumnEnumSelectField[] approvalStatus;
    private SearchColumnSelectField[] customer;
    private SearchColumnDateField[] endDate;
    private SearchColumnSelectField[] externalId;
    private SearchColumnSelectField[] internalId;
    private SearchColumnSelectField[] nextApprover;
    private SearchColumnStringField[] notes;
    private SearchColumnDoubleField[] numberHours;
    private SearchColumnDoubleField[] percentOfTime;
    private SearchColumnSelectField[] project;
    private SearchColumnSelectField[] requestedBy;
    private SearchColumnSelectField[] resource;
    private SearchColumnDateField[] startDate;
    private SearchColumnCustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(ResourceAllocationSearchRowBasic.class, true);

    public ResourceAllocationSearchRowBasic() {
    }

    public ResourceAllocationSearchRowBasic(SearchColumnSelectField[] allocationType, SearchColumnEnumSelectField[] allocationUnit, SearchColumnEnumSelectField[] approvalStatus, SearchColumnSelectField[] customer, SearchColumnDateField[] endDate, SearchColumnSelectField[] externalId, SearchColumnSelectField[] internalId, SearchColumnSelectField[] nextApprover, SearchColumnStringField[] notes, SearchColumnDoubleField[] numberHours, SearchColumnDoubleField[] percentOfTime, SearchColumnSelectField[] project, SearchColumnSelectField[] requestedBy, SearchColumnSelectField[] resource, SearchColumnDateField[] startDate, SearchColumnCustomFieldList customFieldList) {
        this.allocationType = allocationType;
        this.allocationUnit = allocationUnit;
        this.approvalStatus = approvalStatus;
        this.customer = customer;
        this.endDate = endDate;
        this.externalId = externalId;
        this.internalId = internalId;
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

    public SearchColumnSelectField[] getAllocationType() {
        return this.allocationType;
    }

    public void setAllocationType(SearchColumnSelectField[] allocationType) {
        this.allocationType = allocationType;
    }

    public SearchColumnSelectField getAllocationType(int i) {
        return this.allocationType[i];
    }

    public void setAllocationType(int i, SearchColumnSelectField _value) {
        this.allocationType[i] = _value;
    }

    public SearchColumnEnumSelectField[] getAllocationUnit() {
        return this.allocationUnit;
    }

    public void setAllocationUnit(SearchColumnEnumSelectField[] allocationUnit) {
        this.allocationUnit = allocationUnit;
    }

    public SearchColumnEnumSelectField getAllocationUnit(int i) {
        return this.allocationUnit[i];
    }

    public void setAllocationUnit(int i, SearchColumnEnumSelectField _value) {
        this.allocationUnit[i] = _value;
    }

    public SearchColumnEnumSelectField[] getApprovalStatus() {
        return this.approvalStatus;
    }

    public void setApprovalStatus(SearchColumnEnumSelectField[] approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public SearchColumnEnumSelectField getApprovalStatus(int i) {
        return this.approvalStatus[i];
    }

    public void setApprovalStatus(int i, SearchColumnEnumSelectField _value) {
        this.approvalStatus[i] = _value;
    }

    public SearchColumnSelectField[] getCustomer() {
        return this.customer;
    }

    public void setCustomer(SearchColumnSelectField[] customer) {
        this.customer = customer;
    }

    public SearchColumnSelectField getCustomer(int i) {
        return this.customer[i];
    }

    public void setCustomer(int i, SearchColumnSelectField _value) {
        this.customer[i] = _value;
    }

    public SearchColumnDateField[] getEndDate() {
        return this.endDate;
    }

    public void setEndDate(SearchColumnDateField[] endDate) {
        this.endDate = endDate;
    }

    public SearchColumnDateField getEndDate(int i) {
        return this.endDate[i];
    }

    public void setEndDate(int i, SearchColumnDateField _value) {
        this.endDate[i] = _value;
    }

    public SearchColumnSelectField[] getExternalId() {
        return this.externalId;
    }

    public void setExternalId(SearchColumnSelectField[] externalId) {
        this.externalId = externalId;
    }

    public SearchColumnSelectField getExternalId(int i) {
        return this.externalId[i];
    }

    public void setExternalId(int i, SearchColumnSelectField _value) {
        this.externalId[i] = _value;
    }

    public SearchColumnSelectField[] getInternalId() {
        return this.internalId;
    }

    public void setInternalId(SearchColumnSelectField[] internalId) {
        this.internalId = internalId;
    }

    public SearchColumnSelectField getInternalId(int i) {
        return this.internalId[i];
    }

    public void setInternalId(int i, SearchColumnSelectField _value) {
        this.internalId[i] = _value;
    }

    public SearchColumnSelectField[] getNextApprover() {
        return this.nextApprover;
    }

    public void setNextApprover(SearchColumnSelectField[] nextApprover) {
        this.nextApprover = nextApprover;
    }

    public SearchColumnSelectField getNextApprover(int i) {
        return this.nextApprover[i];
    }

    public void setNextApprover(int i, SearchColumnSelectField _value) {
        this.nextApprover[i] = _value;
    }

    public SearchColumnStringField[] getNotes() {
        return this.notes;
    }

    public void setNotes(SearchColumnStringField[] notes) {
        this.notes = notes;
    }

    public SearchColumnStringField getNotes(int i) {
        return this.notes[i];
    }

    public void setNotes(int i, SearchColumnStringField _value) {
        this.notes[i] = _value;
    }

    public SearchColumnDoubleField[] getNumberHours() {
        return this.numberHours;
    }

    public void setNumberHours(SearchColumnDoubleField[] numberHours) {
        this.numberHours = numberHours;
    }

    public SearchColumnDoubleField getNumberHours(int i) {
        return this.numberHours[i];
    }

    public void setNumberHours(int i, SearchColumnDoubleField _value) {
        this.numberHours[i] = _value;
    }

    public SearchColumnDoubleField[] getPercentOfTime() {
        return this.percentOfTime;
    }

    public void setPercentOfTime(SearchColumnDoubleField[] percentOfTime) {
        this.percentOfTime = percentOfTime;
    }

    public SearchColumnDoubleField getPercentOfTime(int i) {
        return this.percentOfTime[i];
    }

    public void setPercentOfTime(int i, SearchColumnDoubleField _value) {
        this.percentOfTime[i] = _value;
    }

    public SearchColumnSelectField[] getProject() {
        return this.project;
    }

    public void setProject(SearchColumnSelectField[] project) {
        this.project = project;
    }

    public SearchColumnSelectField getProject(int i) {
        return this.project[i];
    }

    public void setProject(int i, SearchColumnSelectField _value) {
        this.project[i] = _value;
    }

    public SearchColumnSelectField[] getRequestedBy() {
        return this.requestedBy;
    }

    public void setRequestedBy(SearchColumnSelectField[] requestedBy) {
        this.requestedBy = requestedBy;
    }

    public SearchColumnSelectField getRequestedBy(int i) {
        return this.requestedBy[i];
    }

    public void setRequestedBy(int i, SearchColumnSelectField _value) {
        this.requestedBy[i] = _value;
    }

    public SearchColumnSelectField[] getResource() {
        return this.resource;
    }

    public void setResource(SearchColumnSelectField[] resource) {
        this.resource = resource;
    }

    public SearchColumnSelectField getResource(int i) {
        return this.resource[i];
    }

    public void setResource(int i, SearchColumnSelectField _value) {
        this.resource[i] = _value;
    }

    public SearchColumnDateField[] getStartDate() {
        return this.startDate;
    }

    public void setStartDate(SearchColumnDateField[] startDate) {
        this.startDate = startDate;
    }

    public SearchColumnDateField getStartDate(int i) {
        return this.startDate[i];
    }

    public void setStartDate(int i, SearchColumnDateField _value) {
        this.startDate[i] = _value;
    }

    public SearchColumnCustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ResourceAllocationSearchRowBasic)) {
            return false;
        }
        ResourceAllocationSearchRowBasic other = (ResourceAllocationSearchRowBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.allocationType == null && other.getAllocationType() == null || this.allocationType != null && Arrays.equals(this.allocationType, other.getAllocationType())) && (this.allocationUnit == null && other.getAllocationUnit() == null || this.allocationUnit != null && Arrays.equals(this.allocationUnit, other.getAllocationUnit())) && (this.approvalStatus == null && other.getApprovalStatus() == null || this.approvalStatus != null && Arrays.equals(this.approvalStatus, other.getApprovalStatus())) && (this.customer == null && other.getCustomer() == null || this.customer != null && Arrays.equals(this.customer, other.getCustomer())) && (this.endDate == null && other.getEndDate() == null || this.endDate != null && Arrays.equals(this.endDate, other.getEndDate())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && Arrays.equals(this.externalId, other.getExternalId())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && Arrays.equals(this.internalId, other.getInternalId())) && (this.nextApprover == null && other.getNextApprover() == null || this.nextApprover != null && Arrays.equals(this.nextApprover, other.getNextApprover())) && (this.notes == null && other.getNotes() == null || this.notes != null && Arrays.equals(this.notes, other.getNotes())) && (this.numberHours == null && other.getNumberHours() == null || this.numberHours != null && Arrays.equals(this.numberHours, other.getNumberHours())) && (this.percentOfTime == null && other.getPercentOfTime() == null || this.percentOfTime != null && Arrays.equals(this.percentOfTime, other.getPercentOfTime())) && (this.project == null && other.getProject() == null || this.project != null && Arrays.equals(this.project, other.getProject())) && (this.requestedBy == null && other.getRequestedBy() == null || this.requestedBy != null && Arrays.equals(this.requestedBy, other.getRequestedBy())) && (this.resource == null && other.getResource() == null || this.resource != null && Arrays.equals(this.resource, other.getResource())) && (this.startDate == null && other.getStartDate() == null || this.startDate != null && Arrays.equals(this.startDate, other.getStartDate())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
        this.__equalsCalc = null;
        return _equals;
    }

    @Override
    public synchronized int hashCode() {
        Object obj;
        int i;
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (this.getAllocationType() != null) {
            for (i = 0; i < Array.getLength(this.getAllocationType()); ++i) {
                obj = Array.get(this.getAllocationType(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAllocationUnit() != null) {
            for (i = 0; i < Array.getLength(this.getAllocationUnit()); ++i) {
                obj = Array.get(this.getAllocationUnit(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getApprovalStatus() != null) {
            for (i = 0; i < Array.getLength(this.getApprovalStatus()); ++i) {
                obj = Array.get(this.getApprovalStatus(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCustomer() != null) {
            for (i = 0; i < Array.getLength(this.getCustomer()); ++i) {
                obj = Array.get(this.getCustomer(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getEndDate() != null) {
            for (i = 0; i < Array.getLength(this.getEndDate()); ++i) {
                obj = Array.get(this.getEndDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getExternalId() != null) {
            for (i = 0; i < Array.getLength(this.getExternalId()); ++i) {
                obj = Array.get(this.getExternalId(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getInternalId() != null) {
            for (i = 0; i < Array.getLength(this.getInternalId()); ++i) {
                obj = Array.get(this.getInternalId(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getNextApprover() != null) {
            for (i = 0; i < Array.getLength(this.getNextApprover()); ++i) {
                obj = Array.get(this.getNextApprover(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getNotes() != null) {
            for (i = 0; i < Array.getLength(this.getNotes()); ++i) {
                obj = Array.get(this.getNotes(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getNumberHours() != null) {
            for (i = 0; i < Array.getLength(this.getNumberHours()); ++i) {
                obj = Array.get(this.getNumberHours(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPercentOfTime() != null) {
            for (i = 0; i < Array.getLength(this.getPercentOfTime()); ++i) {
                obj = Array.get(this.getPercentOfTime(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getProject() != null) {
            for (i = 0; i < Array.getLength(this.getProject()); ++i) {
                obj = Array.get(this.getProject(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRequestedBy() != null) {
            for (i = 0; i < Array.getLength(this.getRequestedBy()); ++i) {
                obj = Array.get(this.getRequestedBy(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getResource() != null) {
            for (i = 0; i < Array.getLength(this.getResource()); ++i) {
                obj = Array.get(this.getResource(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getStartDate() != null) {
            for (i = 0; i < Array.getLength(this.getStartDate()); ++i) {
                obj = Array.get(this.getStartDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ResourceAllocationSearchRowBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("allocationType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "allocationType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("allocationUnit");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "allocationUnit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("approvalStatus");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "approvalStatus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customer");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "customer"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "endDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "externalId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("nextApprover");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "nextApprover"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("notes");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "notes"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("numberHours");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "numberHours"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("percentOfTime");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "percentOfTime"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("project");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "project"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("requestedBy");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "requestedBy"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("resource");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "resource"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnCustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

