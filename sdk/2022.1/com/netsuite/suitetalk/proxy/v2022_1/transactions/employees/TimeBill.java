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
package com.netsuite.suitetalk.proxy.v2022_1.transactions.employees;

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.CustomFieldList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.Duration;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.NullField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.Record;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.employees.types.TimeBillTimeType;
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

public class TimeBill
extends Record
implements Serializable {
    private RecordRef customForm;
    private RecordRef employee;
    private Calendar tranDate;
    private RecordRef approvalStatus;
    private RecordRef customer;
    private RecordRef caseTaskEvent;
    private Boolean isBillable;
    private RecordRef payrollItem;
    private Boolean paidExternally;
    private RecordRef workplace;
    private RecordRef item;
    private RecordRef department;
    private RecordRef _class;
    private RecordRef location;
    private Duration hours;
    private RecordRef price;
    private TimeBillTimeType timeType;
    private Double rate;
    private Boolean overrideRate;
    private RecordRef temporaryLocalJurisdiction;
    private RecordRef temporaryStateJurisdiction;
    private String memo;
    private String rejectionNote;
    private RecordRef subsidiary;
    private Boolean supervisorApproval;
    private Calendar createdDate;
    private Calendar lastModifiedDate;
    private RecordRef timeSheet;
    private String status;
    private Boolean timeModified;
    private CustomFieldList customFieldList;
    private String internalId;
    private String externalId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(TimeBill.class, true);

    public TimeBill() {
    }

    public TimeBill(NullField nullFieldList, String internalId, String externalId, RecordRef customForm, RecordRef employee, Calendar tranDate, RecordRef approvalStatus, RecordRef customer, RecordRef caseTaskEvent, Boolean isBillable, RecordRef payrollItem, Boolean paidExternally, RecordRef workplace, RecordRef item, RecordRef department, RecordRef _class, RecordRef location, Duration hours, RecordRef price, TimeBillTimeType timeType, Double rate, Boolean overrideRate, RecordRef temporaryLocalJurisdiction, RecordRef temporaryStateJurisdiction, String memo, String rejectionNote, RecordRef subsidiary, Boolean supervisorApproval, Calendar createdDate, Calendar lastModifiedDate, RecordRef timeSheet, String status, Boolean timeModified, CustomFieldList customFieldList) {
        super(nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.customForm = customForm;
        this.employee = employee;
        this.tranDate = tranDate;
        this.approvalStatus = approvalStatus;
        this.customer = customer;
        this.caseTaskEvent = caseTaskEvent;
        this.isBillable = isBillable;
        this.payrollItem = payrollItem;
        this.paidExternally = paidExternally;
        this.workplace = workplace;
        this.item = item;
        this.department = department;
        this._class = _class;
        this.location = location;
        this.hours = hours;
        this.price = price;
        this.timeType = timeType;
        this.rate = rate;
        this.overrideRate = overrideRate;
        this.temporaryLocalJurisdiction = temporaryLocalJurisdiction;
        this.temporaryStateJurisdiction = temporaryStateJurisdiction;
        this.memo = memo;
        this.rejectionNote = rejectionNote;
        this.subsidiary = subsidiary;
        this.supervisorApproval = supervisorApproval;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.timeSheet = timeSheet;
        this.status = status;
        this.timeModified = timeModified;
        this.customFieldList = customFieldList;
    }

    public RecordRef getCustomForm() {
        return this.customForm;
    }

    public void setCustomForm(RecordRef customForm) {
        this.customForm = customForm;
    }

    public RecordRef getEmployee() {
        return this.employee;
    }

    public void setEmployee(RecordRef employee) {
        this.employee = employee;
    }

    public Calendar getTranDate() {
        return this.tranDate;
    }

    public void setTranDate(Calendar tranDate) {
        this.tranDate = tranDate;
    }

    public RecordRef getApprovalStatus() {
        return this.approvalStatus;
    }

    public void setApprovalStatus(RecordRef approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public RecordRef getCustomer() {
        return this.customer;
    }

    public void setCustomer(RecordRef customer) {
        this.customer = customer;
    }

    public RecordRef getCaseTaskEvent() {
        return this.caseTaskEvent;
    }

    public void setCaseTaskEvent(RecordRef caseTaskEvent) {
        this.caseTaskEvent = caseTaskEvent;
    }

    public Boolean getIsBillable() {
        return this.isBillable;
    }

    public void setIsBillable(Boolean isBillable) {
        this.isBillable = isBillable;
    }

    public RecordRef getPayrollItem() {
        return this.payrollItem;
    }

    public void setPayrollItem(RecordRef payrollItem) {
        this.payrollItem = payrollItem;
    }

    public Boolean getPaidExternally() {
        return this.paidExternally;
    }

    public void setPaidExternally(Boolean paidExternally) {
        this.paidExternally = paidExternally;
    }

    public RecordRef getWorkplace() {
        return this.workplace;
    }

    public void setWorkplace(RecordRef workplace) {
        this.workplace = workplace;
    }

    public RecordRef getItem() {
        return this.item;
    }

    public void setItem(RecordRef item) {
        this.item = item;
    }

    public RecordRef getDepartment() {
        return this.department;
    }

    public void setDepartment(RecordRef department) {
        this.department = department;
    }

    public RecordRef get_class() {
        return this._class;
    }

    public void set_class(RecordRef _class) {
        this._class = _class;
    }

    public RecordRef getLocation() {
        return this.location;
    }

    public void setLocation(RecordRef location) {
        this.location = location;
    }

    public Duration getHours() {
        return this.hours;
    }

    public void setHours(Duration hours) {
        this.hours = hours;
    }

    public RecordRef getPrice() {
        return this.price;
    }

    public void setPrice(RecordRef price) {
        this.price = price;
    }

    public TimeBillTimeType getTimeType() {
        return this.timeType;
    }

    public void setTimeType(TimeBillTimeType timeType) {
        this.timeType = timeType;
    }

    public Double getRate() {
        return this.rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Boolean getOverrideRate() {
        return this.overrideRate;
    }

    public void setOverrideRate(Boolean overrideRate) {
        this.overrideRate = overrideRate;
    }

    public RecordRef getTemporaryLocalJurisdiction() {
        return this.temporaryLocalJurisdiction;
    }

    public void setTemporaryLocalJurisdiction(RecordRef temporaryLocalJurisdiction) {
        this.temporaryLocalJurisdiction = temporaryLocalJurisdiction;
    }

    public RecordRef getTemporaryStateJurisdiction() {
        return this.temporaryStateJurisdiction;
    }

    public void setTemporaryStateJurisdiction(RecordRef temporaryStateJurisdiction) {
        this.temporaryStateJurisdiction = temporaryStateJurisdiction;
    }

    public String getMemo() {
        return this.memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getRejectionNote() {
        return this.rejectionNote;
    }

    public void setRejectionNote(String rejectionNote) {
        this.rejectionNote = rejectionNote;
    }

    public RecordRef getSubsidiary() {
        return this.subsidiary;
    }

    public void setSubsidiary(RecordRef subsidiary) {
        this.subsidiary = subsidiary;
    }

    public Boolean getSupervisorApproval() {
        return this.supervisorApproval;
    }

    public void setSupervisorApproval(Boolean supervisorApproval) {
        this.supervisorApproval = supervisorApproval;
    }

    public Calendar getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(Calendar createdDate) {
        this.createdDate = createdDate;
    }

    public Calendar getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    public void setLastModifiedDate(Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public RecordRef getTimeSheet() {
        return this.timeSheet;
    }

    public void setTimeSheet(RecordRef timeSheet) {
        this.timeSheet = timeSheet;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getTimeModified() {
        return this.timeModified;
    }

    public void setTimeModified(Boolean timeModified) {
        this.timeModified = timeModified;
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
        if (!(obj instanceof TimeBill)) {
            return false;
        }
        TimeBill other = (TimeBill)obj;
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
        boolean _equals = super.equals(obj) && (this.customForm == null && other.getCustomForm() == null || this.customForm != null && this.customForm.equals(other.getCustomForm())) && (this.employee == null && other.getEmployee() == null || this.employee != null && this.employee.equals(other.getEmployee())) && (this.tranDate == null && other.getTranDate() == null || this.tranDate != null && this.tranDate.equals(other.getTranDate())) && (this.approvalStatus == null && other.getApprovalStatus() == null || this.approvalStatus != null && this.approvalStatus.equals(other.getApprovalStatus())) && (this.customer == null && other.getCustomer() == null || this.customer != null && this.customer.equals(other.getCustomer())) && (this.caseTaskEvent == null && other.getCaseTaskEvent() == null || this.caseTaskEvent != null && this.caseTaskEvent.equals(other.getCaseTaskEvent())) && (this.isBillable == null && other.getIsBillable() == null || this.isBillable != null && this.isBillable.equals(other.getIsBillable())) && (this.payrollItem == null && other.getPayrollItem() == null || this.payrollItem != null && this.payrollItem.equals(other.getPayrollItem())) && (this.paidExternally == null && other.getPaidExternally() == null || this.paidExternally != null && this.paidExternally.equals(other.getPaidExternally())) && (this.workplace == null && other.getWorkplace() == null || this.workplace != null && this.workplace.equals(other.getWorkplace())) && (this.item == null && other.getItem() == null || this.item != null && this.item.equals(other.getItem())) && (this.department == null && other.getDepartment() == null || this.department != null && this.department.equals(other.getDepartment())) && (this._class == null && other.get_class() == null || this._class != null && this._class.equals(other.get_class())) && (this.location == null && other.getLocation() == null || this.location != null && this.location.equals(other.getLocation())) && (this.hours == null && other.getHours() == null || this.hours != null && this.hours.equals(other.getHours())) && (this.price == null && other.getPrice() == null || this.price != null && this.price.equals(other.getPrice())) && (this.timeType == null && other.getTimeType() == null || this.timeType != null && this.timeType.equals(other.getTimeType())) && (this.rate == null && other.getRate() == null || this.rate != null && this.rate.equals(other.getRate())) && (this.overrideRate == null && other.getOverrideRate() == null || this.overrideRate != null && this.overrideRate.equals(other.getOverrideRate())) && (this.temporaryLocalJurisdiction == null && other.getTemporaryLocalJurisdiction() == null || this.temporaryLocalJurisdiction != null && this.temporaryLocalJurisdiction.equals(other.getTemporaryLocalJurisdiction())) && (this.temporaryStateJurisdiction == null && other.getTemporaryStateJurisdiction() == null || this.temporaryStateJurisdiction != null && this.temporaryStateJurisdiction.equals(other.getTemporaryStateJurisdiction())) && (this.memo == null && other.getMemo() == null || this.memo != null && this.memo.equals(other.getMemo())) && (this.rejectionNote == null && other.getRejectionNote() == null || this.rejectionNote != null && this.rejectionNote.equals(other.getRejectionNote())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && this.subsidiary.equals(other.getSubsidiary())) && (this.supervisorApproval == null && other.getSupervisorApproval() == null || this.supervisorApproval != null && this.supervisorApproval.equals(other.getSupervisorApproval())) && (this.createdDate == null && other.getCreatedDate() == null || this.createdDate != null && this.createdDate.equals(other.getCreatedDate())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && this.lastModifiedDate.equals(other.getLastModifiedDate())) && (this.timeSheet == null && other.getTimeSheet() == null || this.timeSheet != null && this.timeSheet.equals(other.getTimeSheet())) && (this.status == null && other.getStatus() == null || this.status != null && this.status.equals(other.getStatus())) && (this.timeModified == null && other.getTimeModified() == null || this.timeModified != null && this.timeModified.equals(other.getTimeModified())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
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
        if (this.getCustomForm() != null) {
            _hashCode += this.getCustomForm().hashCode();
        }
        if (this.getEmployee() != null) {
            _hashCode += this.getEmployee().hashCode();
        }
        if (this.getTranDate() != null) {
            _hashCode += this.getTranDate().hashCode();
        }
        if (this.getApprovalStatus() != null) {
            _hashCode += this.getApprovalStatus().hashCode();
        }
        if (this.getCustomer() != null) {
            _hashCode += this.getCustomer().hashCode();
        }
        if (this.getCaseTaskEvent() != null) {
            _hashCode += this.getCaseTaskEvent().hashCode();
        }
        if (this.getIsBillable() != null) {
            _hashCode += this.getIsBillable().hashCode();
        }
        if (this.getPayrollItem() != null) {
            _hashCode += this.getPayrollItem().hashCode();
        }
        if (this.getPaidExternally() != null) {
            _hashCode += this.getPaidExternally().hashCode();
        }
        if (this.getWorkplace() != null) {
            _hashCode += this.getWorkplace().hashCode();
        }
        if (this.getItem() != null) {
            _hashCode += this.getItem().hashCode();
        }
        if (this.getDepartment() != null) {
            _hashCode += this.getDepartment().hashCode();
        }
        if (this.get_class() != null) {
            _hashCode += this.get_class().hashCode();
        }
        if (this.getLocation() != null) {
            _hashCode += this.getLocation().hashCode();
        }
        if (this.getHours() != null) {
            _hashCode += this.getHours().hashCode();
        }
        if (this.getPrice() != null) {
            _hashCode += this.getPrice().hashCode();
        }
        if (this.getTimeType() != null) {
            _hashCode += this.getTimeType().hashCode();
        }
        if (this.getRate() != null) {
            _hashCode += this.getRate().hashCode();
        }
        if (this.getOverrideRate() != null) {
            _hashCode += this.getOverrideRate().hashCode();
        }
        if (this.getTemporaryLocalJurisdiction() != null) {
            _hashCode += this.getTemporaryLocalJurisdiction().hashCode();
        }
        if (this.getTemporaryStateJurisdiction() != null) {
            _hashCode += this.getTemporaryStateJurisdiction().hashCode();
        }
        if (this.getMemo() != null) {
            _hashCode += this.getMemo().hashCode();
        }
        if (this.getRejectionNote() != null) {
            _hashCode += this.getRejectionNote().hashCode();
        }
        if (this.getSubsidiary() != null) {
            _hashCode += this.getSubsidiary().hashCode();
        }
        if (this.getSupervisorApproval() != null) {
            _hashCode += this.getSupervisorApproval().hashCode();
        }
        if (this.getCreatedDate() != null) {
            _hashCode += this.getCreatedDate().hashCode();
        }
        if (this.getLastModifiedDate() != null) {
            _hashCode += this.getLastModifiedDate().hashCode();
        }
        if (this.getTimeSheet() != null) {
            _hashCode += this.getTimeSheet().hashCode();
        }
        if (this.getStatus() != null) {
            _hashCode += this.getStatus().hashCode();
        }
        if (this.getTimeModified() != null) {
            _hashCode += this.getTimeModified().hashCode();
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
        typeDesc.setXmlType(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "TimeBill"));
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
        elemField.setFieldName("customForm");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("employee");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "employee"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("tranDate");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "tranDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("approvalStatus");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "approvalStatus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customer");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "customer"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("caseTaskEvent");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "caseTaskEvent"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isBillable");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "isBillable"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("payrollItem");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "payrollItem"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("paidExternally");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "paidExternally"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("workplace");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "workplace"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "item"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "department"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "class"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "location"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("hours");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "hours"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "Duration"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "price"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("timeType");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "timeType"));
        elemField.setXmlType(new QName("urn:types.employees_2022_1.transactions.webservices.netsuite.com", "TimeBillTimeType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("rate");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "rate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("overrideRate");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "overrideRate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("temporaryLocalJurisdiction");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "temporaryLocalJurisdiction"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("temporaryStateJurisdiction");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "temporaryStateJurisdiction"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("rejectionNote");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "rejectionNote"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("supervisorApproval");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "supervisorApproval"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("timeSheet");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "timeSheet"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "status"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("timeModified");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "timeModified"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "CustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

