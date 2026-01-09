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

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchBooleanField;
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

public class TimeBillSearchBasic
extends SearchRecordBasic
implements Serializable {
    private SearchMultiSelectField approvalStatus;
    private SearchBooleanField approved;
    private SearchBooleanField billable;
    private SearchMultiSelectField _class;
    private SearchMultiSelectField customer;
    private SearchDateField date;
    private SearchDateField dateCreated;
    private SearchMultiSelectField department;
    private SearchDoubleField duration;
    private SearchMultiSelectField employee;
    private SearchBooleanField exempt;
    private SearchMultiSelectField externalId;
    private SearchStringField externalIdString;
    private SearchMultiSelectField internalId;
    private SearchLongField internalIdNumber;
    private SearchMultiSelectField item;
    private SearchDateField lastModified;
    private SearchMultiSelectField location;
    private SearchStringField memo;
    private SearchBooleanField paidByPayroll;
    private SearchBooleanField paidExternally;
    private SearchMultiSelectField payItem;
    private SearchBooleanField productive;
    private SearchStringField rejectionNote;
    private SearchBooleanField status;
    private SearchMultiSelectField subsidiary;
    private SearchMultiSelectField temporaryLocalJurisdiction;
    private SearchMultiSelectField temporaryStateJurisdiction;
    private SearchBooleanField timeModified;
    private SearchMultiSelectField timeSheet;
    private SearchEnumMultiSelectField type;
    private SearchBooleanField utilized;
    private SearchCustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(TimeBillSearchBasic.class, true);

    public TimeBillSearchBasic() {
    }

    public TimeBillSearchBasic(SearchMultiSelectField approvalStatus, SearchBooleanField approved, SearchBooleanField billable, SearchMultiSelectField _class, SearchMultiSelectField customer, SearchDateField date, SearchDateField dateCreated, SearchMultiSelectField department, SearchDoubleField duration, SearchMultiSelectField employee, SearchBooleanField exempt, SearchMultiSelectField externalId, SearchStringField externalIdString, SearchMultiSelectField internalId, SearchLongField internalIdNumber, SearchMultiSelectField item, SearchDateField lastModified, SearchMultiSelectField location, SearchStringField memo, SearchBooleanField paidByPayroll, SearchBooleanField paidExternally, SearchMultiSelectField payItem, SearchBooleanField productive, SearchStringField rejectionNote, SearchBooleanField status, SearchMultiSelectField subsidiary, SearchMultiSelectField temporaryLocalJurisdiction, SearchMultiSelectField temporaryStateJurisdiction, SearchBooleanField timeModified, SearchMultiSelectField timeSheet, SearchEnumMultiSelectField type, SearchBooleanField utilized, SearchCustomFieldList customFieldList) {
        this.approvalStatus = approvalStatus;
        this.approved = approved;
        this.billable = billable;
        this._class = _class;
        this.customer = customer;
        this.date = date;
        this.dateCreated = dateCreated;
        this.department = department;
        this.duration = duration;
        this.employee = employee;
        this.exempt = exempt;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.item = item;
        this.lastModified = lastModified;
        this.location = location;
        this.memo = memo;
        this.paidByPayroll = paidByPayroll;
        this.paidExternally = paidExternally;
        this.payItem = payItem;
        this.productive = productive;
        this.rejectionNote = rejectionNote;
        this.status = status;
        this.subsidiary = subsidiary;
        this.temporaryLocalJurisdiction = temporaryLocalJurisdiction;
        this.temporaryStateJurisdiction = temporaryStateJurisdiction;
        this.timeModified = timeModified;
        this.timeSheet = timeSheet;
        this.type = type;
        this.utilized = utilized;
        this.customFieldList = customFieldList;
    }

    public SearchMultiSelectField getApprovalStatus() {
        return this.approvalStatus;
    }

    public void setApprovalStatus(SearchMultiSelectField approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public SearchBooleanField getApproved() {
        return this.approved;
    }

    public void setApproved(SearchBooleanField approved) {
        this.approved = approved;
    }

    public SearchBooleanField getBillable() {
        return this.billable;
    }

    public void setBillable(SearchBooleanField billable) {
        this.billable = billable;
    }

    public SearchMultiSelectField get_class() {
        return this._class;
    }

    public void set_class(SearchMultiSelectField _class) {
        this._class = _class;
    }

    public SearchMultiSelectField getCustomer() {
        return this.customer;
    }

    public void setCustomer(SearchMultiSelectField customer) {
        this.customer = customer;
    }

    public SearchDateField getDate() {
        return this.date;
    }

    public void setDate(SearchDateField date) {
        this.date = date;
    }

    public SearchDateField getDateCreated() {
        return this.dateCreated;
    }

    public void setDateCreated(SearchDateField dateCreated) {
        this.dateCreated = dateCreated;
    }

    public SearchMultiSelectField getDepartment() {
        return this.department;
    }

    public void setDepartment(SearchMultiSelectField department) {
        this.department = department;
    }

    public SearchDoubleField getDuration() {
        return this.duration;
    }

    public void setDuration(SearchDoubleField duration) {
        this.duration = duration;
    }

    public SearchMultiSelectField getEmployee() {
        return this.employee;
    }

    public void setEmployee(SearchMultiSelectField employee) {
        this.employee = employee;
    }

    public SearchBooleanField getExempt() {
        return this.exempt;
    }

    public void setExempt(SearchBooleanField exempt) {
        this.exempt = exempt;
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

    public SearchMultiSelectField getItem() {
        return this.item;
    }

    public void setItem(SearchMultiSelectField item) {
        this.item = item;
    }

    public SearchDateField getLastModified() {
        return this.lastModified;
    }

    public void setLastModified(SearchDateField lastModified) {
        this.lastModified = lastModified;
    }

    public SearchMultiSelectField getLocation() {
        return this.location;
    }

    public void setLocation(SearchMultiSelectField location) {
        this.location = location;
    }

    public SearchStringField getMemo() {
        return this.memo;
    }

    public void setMemo(SearchStringField memo) {
        this.memo = memo;
    }

    public SearchBooleanField getPaidByPayroll() {
        return this.paidByPayroll;
    }

    public void setPaidByPayroll(SearchBooleanField paidByPayroll) {
        this.paidByPayroll = paidByPayroll;
    }

    public SearchBooleanField getPaidExternally() {
        return this.paidExternally;
    }

    public void setPaidExternally(SearchBooleanField paidExternally) {
        this.paidExternally = paidExternally;
    }

    public SearchMultiSelectField getPayItem() {
        return this.payItem;
    }

    public void setPayItem(SearchMultiSelectField payItem) {
        this.payItem = payItem;
    }

    public SearchBooleanField getProductive() {
        return this.productive;
    }

    public void setProductive(SearchBooleanField productive) {
        this.productive = productive;
    }

    public SearchStringField getRejectionNote() {
        return this.rejectionNote;
    }

    public void setRejectionNote(SearchStringField rejectionNote) {
        this.rejectionNote = rejectionNote;
    }

    public SearchBooleanField getStatus() {
        return this.status;
    }

    public void setStatus(SearchBooleanField status) {
        this.status = status;
    }

    public SearchMultiSelectField getSubsidiary() {
        return this.subsidiary;
    }

    public void setSubsidiary(SearchMultiSelectField subsidiary) {
        this.subsidiary = subsidiary;
    }

    public SearchMultiSelectField getTemporaryLocalJurisdiction() {
        return this.temporaryLocalJurisdiction;
    }

    public void setTemporaryLocalJurisdiction(SearchMultiSelectField temporaryLocalJurisdiction) {
        this.temporaryLocalJurisdiction = temporaryLocalJurisdiction;
    }

    public SearchMultiSelectField getTemporaryStateJurisdiction() {
        return this.temporaryStateJurisdiction;
    }

    public void setTemporaryStateJurisdiction(SearchMultiSelectField temporaryStateJurisdiction) {
        this.temporaryStateJurisdiction = temporaryStateJurisdiction;
    }

    public SearchBooleanField getTimeModified() {
        return this.timeModified;
    }

    public void setTimeModified(SearchBooleanField timeModified) {
        this.timeModified = timeModified;
    }

    public SearchMultiSelectField getTimeSheet() {
        return this.timeSheet;
    }

    public void setTimeSheet(SearchMultiSelectField timeSheet) {
        this.timeSheet = timeSheet;
    }

    public SearchEnumMultiSelectField getType() {
        return this.type;
    }

    public void setType(SearchEnumMultiSelectField type) {
        this.type = type;
    }

    public SearchBooleanField getUtilized() {
        return this.utilized;
    }

    public void setUtilized(SearchBooleanField utilized) {
        this.utilized = utilized;
    }

    public SearchCustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TimeBillSearchBasic)) {
            return false;
        }
        TimeBillSearchBasic other = (TimeBillSearchBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.approvalStatus == null && other.getApprovalStatus() == null || this.approvalStatus != null && this.approvalStatus.equals(other.getApprovalStatus())) && (this.approved == null && other.getApproved() == null || this.approved != null && this.approved.equals(other.getApproved())) && (this.billable == null && other.getBillable() == null || this.billable != null && this.billable.equals(other.getBillable())) && (this._class == null && other.get_class() == null || this._class != null && this._class.equals(other.get_class())) && (this.customer == null && other.getCustomer() == null || this.customer != null && this.customer.equals(other.getCustomer())) && (this.date == null && other.getDate() == null || this.date != null && this.date.equals(other.getDate())) && (this.dateCreated == null && other.getDateCreated() == null || this.dateCreated != null && this.dateCreated.equals(other.getDateCreated())) && (this.department == null && other.getDepartment() == null || this.department != null && this.department.equals(other.getDepartment())) && (this.duration == null && other.getDuration() == null || this.duration != null && this.duration.equals(other.getDuration())) && (this.employee == null && other.getEmployee() == null || this.employee != null && this.employee.equals(other.getEmployee())) && (this.exempt == null && other.getExempt() == null || this.exempt != null && this.exempt.equals(other.getExempt())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId())) && (this.externalIdString == null && other.getExternalIdString() == null || this.externalIdString != null && this.externalIdString.equals(other.getExternalIdString())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.internalIdNumber == null && other.getInternalIdNumber() == null || this.internalIdNumber != null && this.internalIdNumber.equals(other.getInternalIdNumber())) && (this.item == null && other.getItem() == null || this.item != null && this.item.equals(other.getItem())) && (this.lastModified == null && other.getLastModified() == null || this.lastModified != null && this.lastModified.equals(other.getLastModified())) && (this.location == null && other.getLocation() == null || this.location != null && this.location.equals(other.getLocation())) && (this.memo == null && other.getMemo() == null || this.memo != null && this.memo.equals(other.getMemo())) && (this.paidByPayroll == null && other.getPaidByPayroll() == null || this.paidByPayroll != null && this.paidByPayroll.equals(other.getPaidByPayroll())) && (this.paidExternally == null && other.getPaidExternally() == null || this.paidExternally != null && this.paidExternally.equals(other.getPaidExternally())) && (this.payItem == null && other.getPayItem() == null || this.payItem != null && this.payItem.equals(other.getPayItem())) && (this.productive == null && other.getProductive() == null || this.productive != null && this.productive.equals(other.getProductive())) && (this.rejectionNote == null && other.getRejectionNote() == null || this.rejectionNote != null && this.rejectionNote.equals(other.getRejectionNote())) && (this.status == null && other.getStatus() == null || this.status != null && this.status.equals(other.getStatus())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && this.subsidiary.equals(other.getSubsidiary())) && (this.temporaryLocalJurisdiction == null && other.getTemporaryLocalJurisdiction() == null || this.temporaryLocalJurisdiction != null && this.temporaryLocalJurisdiction.equals(other.getTemporaryLocalJurisdiction())) && (this.temporaryStateJurisdiction == null && other.getTemporaryStateJurisdiction() == null || this.temporaryStateJurisdiction != null && this.temporaryStateJurisdiction.equals(other.getTemporaryStateJurisdiction())) && (this.timeModified == null && other.getTimeModified() == null || this.timeModified != null && this.timeModified.equals(other.getTimeModified())) && (this.timeSheet == null && other.getTimeSheet() == null || this.timeSheet != null && this.timeSheet.equals(other.getTimeSheet())) && (this.type == null && other.getType() == null || this.type != null && this.type.equals(other.getType())) && (this.utilized == null && other.getUtilized() == null || this.utilized != null && this.utilized.equals(other.getUtilized())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
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
        if (this.getApprovalStatus() != null) {
            _hashCode += this.getApprovalStatus().hashCode();
        }
        if (this.getApproved() != null) {
            _hashCode += this.getApproved().hashCode();
        }
        if (this.getBillable() != null) {
            _hashCode += this.getBillable().hashCode();
        }
        if (this.get_class() != null) {
            _hashCode += this.get_class().hashCode();
        }
        if (this.getCustomer() != null) {
            _hashCode += this.getCustomer().hashCode();
        }
        if (this.getDate() != null) {
            _hashCode += this.getDate().hashCode();
        }
        if (this.getDateCreated() != null) {
            _hashCode += this.getDateCreated().hashCode();
        }
        if (this.getDepartment() != null) {
            _hashCode += this.getDepartment().hashCode();
        }
        if (this.getDuration() != null) {
            _hashCode += this.getDuration().hashCode();
        }
        if (this.getEmployee() != null) {
            _hashCode += this.getEmployee().hashCode();
        }
        if (this.getExempt() != null) {
            _hashCode += this.getExempt().hashCode();
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
        if (this.getItem() != null) {
            _hashCode += this.getItem().hashCode();
        }
        if (this.getLastModified() != null) {
            _hashCode += this.getLastModified().hashCode();
        }
        if (this.getLocation() != null) {
            _hashCode += this.getLocation().hashCode();
        }
        if (this.getMemo() != null) {
            _hashCode += this.getMemo().hashCode();
        }
        if (this.getPaidByPayroll() != null) {
            _hashCode += this.getPaidByPayroll().hashCode();
        }
        if (this.getPaidExternally() != null) {
            _hashCode += this.getPaidExternally().hashCode();
        }
        if (this.getPayItem() != null) {
            _hashCode += this.getPayItem().hashCode();
        }
        if (this.getProductive() != null) {
            _hashCode += this.getProductive().hashCode();
        }
        if (this.getRejectionNote() != null) {
            _hashCode += this.getRejectionNote().hashCode();
        }
        if (this.getStatus() != null) {
            _hashCode += this.getStatus().hashCode();
        }
        if (this.getSubsidiary() != null) {
            _hashCode += this.getSubsidiary().hashCode();
        }
        if (this.getTemporaryLocalJurisdiction() != null) {
            _hashCode += this.getTemporaryLocalJurisdiction().hashCode();
        }
        if (this.getTemporaryStateJurisdiction() != null) {
            _hashCode += this.getTemporaryStateJurisdiction().hashCode();
        }
        if (this.getTimeModified() != null) {
            _hashCode += this.getTimeModified().hashCode();
        }
        if (this.getTimeSheet() != null) {
            _hashCode += this.getTimeSheet().hashCode();
        }
        if (this.getType() != null) {
            _hashCode += this.getType().hashCode();
        }
        if (this.getUtilized() != null) {
            _hashCode += this.getUtilized().hashCode();
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TimeBillSearchBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("approvalStatus");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "approvalStatus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("approved");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "approved"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billable");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billable"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "class"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("date");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "date"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("dateCreated");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "dateCreated"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "department"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("duration");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "duration"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("employee");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "employee"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("exempt");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "exempt"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("item");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastModified");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lastModified"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "location"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("paidByPayroll");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "paidByPayroll"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("paidExternally");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "paidExternally"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("payItem");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "payItem"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("productive");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "productive"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("rejectionNote");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "rejectionNote"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "status"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("temporaryLocalJurisdiction");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "temporaryLocalJurisdiction"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("temporaryStateJurisdiction");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "temporaryStateJurisdiction"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("timeModified");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "timeModified"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("timeSheet");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "timeSheet"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "type"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("utilized");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "utilized"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
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

