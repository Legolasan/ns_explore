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

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnBooleanField;
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

public class TimeBillSearchRowBasic
extends SearchRowBasic
implements Serializable {
    private SearchColumnSelectField[] approvalStatus;
    private SearchColumnStringField[] _break;
    private SearchColumnSelectField[] _class;
    private SearchColumnSelectField[] customer;
    private SearchColumnDateField[] date;
    private SearchColumnDateField[] dateCreated;
    private SearchColumnSelectField[] department;
    private SearchColumnDoubleField[] durationDecimal;
    private SearchColumnSelectField[] employee;
    private SearchColumnDateField[] endTime;
    private SearchColumnSelectField[] externalId;
    private SearchColumnStringField[] hours;
    private SearchColumnSelectField[] internalId;
    private SearchColumnBooleanField[] isBillable;
    private SearchColumnBooleanField[] isExempt;
    private SearchColumnBooleanField[] isProductive;
    private SearchColumnBooleanField[] isUtilized;
    private SearchColumnStringField[] item;
    private SearchColumnDateField[] lastModified;
    private SearchColumnSelectField[] location;
    private SearchColumnStringField[] memo;
    private SearchColumnBooleanField[] paidExternally;
    private SearchColumnSelectField[] payItem;
    private SearchColumnDateField[] payrollDate;
    private SearchColumnDoubleField[] rate;
    private SearchColumnStringField[] rejectionNote;
    private SearchColumnDateField[] startTime;
    private SearchColumnStringField[] status;
    private SearchColumnStringField[] subsidiary;
    private SearchColumnBooleanField[] supervisorApproval;
    private SearchColumnStringField[] temporaryLocalJurisdiction;
    private SearchColumnStringField[] temporaryStateJurisdiction;
    private SearchColumnBooleanField[] timeModified;
    private SearchColumnSelectField[] timeSheet;
    private SearchColumnEnumSelectField[] type;
    private SearchColumnCustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(TimeBillSearchRowBasic.class, true);

    public TimeBillSearchRowBasic() {
    }

    public TimeBillSearchRowBasic(SearchColumnSelectField[] approvalStatus, SearchColumnStringField[] _break, SearchColumnSelectField[] _class, SearchColumnSelectField[] customer, SearchColumnDateField[] date, SearchColumnDateField[] dateCreated, SearchColumnSelectField[] department, SearchColumnDoubleField[] durationDecimal, SearchColumnSelectField[] employee, SearchColumnDateField[] endTime, SearchColumnSelectField[] externalId, SearchColumnStringField[] hours, SearchColumnSelectField[] internalId, SearchColumnBooleanField[] isBillable, SearchColumnBooleanField[] isExempt, SearchColumnBooleanField[] isProductive, SearchColumnBooleanField[] isUtilized, SearchColumnStringField[] item, SearchColumnDateField[] lastModified, SearchColumnSelectField[] location, SearchColumnStringField[] memo, SearchColumnBooleanField[] paidExternally, SearchColumnSelectField[] payItem, SearchColumnDateField[] payrollDate, SearchColumnDoubleField[] rate, SearchColumnStringField[] rejectionNote, SearchColumnDateField[] startTime, SearchColumnStringField[] status, SearchColumnStringField[] subsidiary, SearchColumnBooleanField[] supervisorApproval, SearchColumnStringField[] temporaryLocalJurisdiction, SearchColumnStringField[] temporaryStateJurisdiction, SearchColumnBooleanField[] timeModified, SearchColumnSelectField[] timeSheet, SearchColumnEnumSelectField[] type, SearchColumnCustomFieldList customFieldList) {
        this.approvalStatus = approvalStatus;
        this._break = _break;
        this._class = _class;
        this.customer = customer;
        this.date = date;
        this.dateCreated = dateCreated;
        this.department = department;
        this.durationDecimal = durationDecimal;
        this.employee = employee;
        this.endTime = endTime;
        this.externalId = externalId;
        this.hours = hours;
        this.internalId = internalId;
        this.isBillable = isBillable;
        this.isExempt = isExempt;
        this.isProductive = isProductive;
        this.isUtilized = isUtilized;
        this.item = item;
        this.lastModified = lastModified;
        this.location = location;
        this.memo = memo;
        this.paidExternally = paidExternally;
        this.payItem = payItem;
        this.payrollDate = payrollDate;
        this.rate = rate;
        this.rejectionNote = rejectionNote;
        this.startTime = startTime;
        this.status = status;
        this.subsidiary = subsidiary;
        this.supervisorApproval = supervisorApproval;
        this.temporaryLocalJurisdiction = temporaryLocalJurisdiction;
        this.temporaryStateJurisdiction = temporaryStateJurisdiction;
        this.timeModified = timeModified;
        this.timeSheet = timeSheet;
        this.type = type;
        this.customFieldList = customFieldList;
    }

    public SearchColumnSelectField[] getApprovalStatus() {
        return this.approvalStatus;
    }

    public void setApprovalStatus(SearchColumnSelectField[] approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public SearchColumnSelectField getApprovalStatus(int i) {
        return this.approvalStatus[i];
    }

    public void setApprovalStatus(int i, SearchColumnSelectField _value) {
        this.approvalStatus[i] = _value;
    }

    public SearchColumnStringField[] get_break() {
        return this._break;
    }

    public void set_break(SearchColumnStringField[] _break) {
        this._break = _break;
    }

    public SearchColumnStringField get_break(int i) {
        return this._break[i];
    }

    public void set_break(int i, SearchColumnStringField _value) {
        this._break[i] = _value;
    }

    public SearchColumnSelectField[] get_class() {
        return this._class;
    }

    public void set_class(SearchColumnSelectField[] _class) {
        this._class = _class;
    }

    public SearchColumnSelectField get_class(int i) {
        return this._class[i];
    }

    public void set_class(int i, SearchColumnSelectField _value) {
        this._class[i] = _value;
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

    public SearchColumnDateField[] getDate() {
        return this.date;
    }

    public void setDate(SearchColumnDateField[] date) {
        this.date = date;
    }

    public SearchColumnDateField getDate(int i) {
        return this.date[i];
    }

    public void setDate(int i, SearchColumnDateField _value) {
        this.date[i] = _value;
    }

    public SearchColumnDateField[] getDateCreated() {
        return this.dateCreated;
    }

    public void setDateCreated(SearchColumnDateField[] dateCreated) {
        this.dateCreated = dateCreated;
    }

    public SearchColumnDateField getDateCreated(int i) {
        return this.dateCreated[i];
    }

    public void setDateCreated(int i, SearchColumnDateField _value) {
        this.dateCreated[i] = _value;
    }

    public SearchColumnSelectField[] getDepartment() {
        return this.department;
    }

    public void setDepartment(SearchColumnSelectField[] department) {
        this.department = department;
    }

    public SearchColumnSelectField getDepartment(int i) {
        return this.department[i];
    }

    public void setDepartment(int i, SearchColumnSelectField _value) {
        this.department[i] = _value;
    }

    public SearchColumnDoubleField[] getDurationDecimal() {
        return this.durationDecimal;
    }

    public void setDurationDecimal(SearchColumnDoubleField[] durationDecimal) {
        this.durationDecimal = durationDecimal;
    }

    public SearchColumnDoubleField getDurationDecimal(int i) {
        return this.durationDecimal[i];
    }

    public void setDurationDecimal(int i, SearchColumnDoubleField _value) {
        this.durationDecimal[i] = _value;
    }

    public SearchColumnSelectField[] getEmployee() {
        return this.employee;
    }

    public void setEmployee(SearchColumnSelectField[] employee) {
        this.employee = employee;
    }

    public SearchColumnSelectField getEmployee(int i) {
        return this.employee[i];
    }

    public void setEmployee(int i, SearchColumnSelectField _value) {
        this.employee[i] = _value;
    }

    public SearchColumnDateField[] getEndTime() {
        return this.endTime;
    }

    public void setEndTime(SearchColumnDateField[] endTime) {
        this.endTime = endTime;
    }

    public SearchColumnDateField getEndTime(int i) {
        return this.endTime[i];
    }

    public void setEndTime(int i, SearchColumnDateField _value) {
        this.endTime[i] = _value;
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

    public SearchColumnStringField[] getHours() {
        return this.hours;
    }

    public void setHours(SearchColumnStringField[] hours) {
        this.hours = hours;
    }

    public SearchColumnStringField getHours(int i) {
        return this.hours[i];
    }

    public void setHours(int i, SearchColumnStringField _value) {
        this.hours[i] = _value;
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

    public SearchColumnBooleanField[] getIsBillable() {
        return this.isBillable;
    }

    public void setIsBillable(SearchColumnBooleanField[] isBillable) {
        this.isBillable = isBillable;
    }

    public SearchColumnBooleanField getIsBillable(int i) {
        return this.isBillable[i];
    }

    public void setIsBillable(int i, SearchColumnBooleanField _value) {
        this.isBillable[i] = _value;
    }

    public SearchColumnBooleanField[] getIsExempt() {
        return this.isExempt;
    }

    public void setIsExempt(SearchColumnBooleanField[] isExempt) {
        this.isExempt = isExempt;
    }

    public SearchColumnBooleanField getIsExempt(int i) {
        return this.isExempt[i];
    }

    public void setIsExempt(int i, SearchColumnBooleanField _value) {
        this.isExempt[i] = _value;
    }

    public SearchColumnBooleanField[] getIsProductive() {
        return this.isProductive;
    }

    public void setIsProductive(SearchColumnBooleanField[] isProductive) {
        this.isProductive = isProductive;
    }

    public SearchColumnBooleanField getIsProductive(int i) {
        return this.isProductive[i];
    }

    public void setIsProductive(int i, SearchColumnBooleanField _value) {
        this.isProductive[i] = _value;
    }

    public SearchColumnBooleanField[] getIsUtilized() {
        return this.isUtilized;
    }

    public void setIsUtilized(SearchColumnBooleanField[] isUtilized) {
        this.isUtilized = isUtilized;
    }

    public SearchColumnBooleanField getIsUtilized(int i) {
        return this.isUtilized[i];
    }

    public void setIsUtilized(int i, SearchColumnBooleanField _value) {
        this.isUtilized[i] = _value;
    }

    public SearchColumnStringField[] getItem() {
        return this.item;
    }

    public void setItem(SearchColumnStringField[] item) {
        this.item = item;
    }

    public SearchColumnStringField getItem(int i) {
        return this.item[i];
    }

    public void setItem(int i, SearchColumnStringField _value) {
        this.item[i] = _value;
    }

    public SearchColumnDateField[] getLastModified() {
        return this.lastModified;
    }

    public void setLastModified(SearchColumnDateField[] lastModified) {
        this.lastModified = lastModified;
    }

    public SearchColumnDateField getLastModified(int i) {
        return this.lastModified[i];
    }

    public void setLastModified(int i, SearchColumnDateField _value) {
        this.lastModified[i] = _value;
    }

    public SearchColumnSelectField[] getLocation() {
        return this.location;
    }

    public void setLocation(SearchColumnSelectField[] location) {
        this.location = location;
    }

    public SearchColumnSelectField getLocation(int i) {
        return this.location[i];
    }

    public void setLocation(int i, SearchColumnSelectField _value) {
        this.location[i] = _value;
    }

    public SearchColumnStringField[] getMemo() {
        return this.memo;
    }

    public void setMemo(SearchColumnStringField[] memo) {
        this.memo = memo;
    }

    public SearchColumnStringField getMemo(int i) {
        return this.memo[i];
    }

    public void setMemo(int i, SearchColumnStringField _value) {
        this.memo[i] = _value;
    }

    public SearchColumnBooleanField[] getPaidExternally() {
        return this.paidExternally;
    }

    public void setPaidExternally(SearchColumnBooleanField[] paidExternally) {
        this.paidExternally = paidExternally;
    }

    public SearchColumnBooleanField getPaidExternally(int i) {
        return this.paidExternally[i];
    }

    public void setPaidExternally(int i, SearchColumnBooleanField _value) {
        this.paidExternally[i] = _value;
    }

    public SearchColumnSelectField[] getPayItem() {
        return this.payItem;
    }

    public void setPayItem(SearchColumnSelectField[] payItem) {
        this.payItem = payItem;
    }

    public SearchColumnSelectField getPayItem(int i) {
        return this.payItem[i];
    }

    public void setPayItem(int i, SearchColumnSelectField _value) {
        this.payItem[i] = _value;
    }

    public SearchColumnDateField[] getPayrollDate() {
        return this.payrollDate;
    }

    public void setPayrollDate(SearchColumnDateField[] payrollDate) {
        this.payrollDate = payrollDate;
    }

    public SearchColumnDateField getPayrollDate(int i) {
        return this.payrollDate[i];
    }

    public void setPayrollDate(int i, SearchColumnDateField _value) {
        this.payrollDate[i] = _value;
    }

    public SearchColumnDoubleField[] getRate() {
        return this.rate;
    }

    public void setRate(SearchColumnDoubleField[] rate) {
        this.rate = rate;
    }

    public SearchColumnDoubleField getRate(int i) {
        return this.rate[i];
    }

    public void setRate(int i, SearchColumnDoubleField _value) {
        this.rate[i] = _value;
    }

    public SearchColumnStringField[] getRejectionNote() {
        return this.rejectionNote;
    }

    public void setRejectionNote(SearchColumnStringField[] rejectionNote) {
        this.rejectionNote = rejectionNote;
    }

    public SearchColumnStringField getRejectionNote(int i) {
        return this.rejectionNote[i];
    }

    public void setRejectionNote(int i, SearchColumnStringField _value) {
        this.rejectionNote[i] = _value;
    }

    public SearchColumnDateField[] getStartTime() {
        return this.startTime;
    }

    public void setStartTime(SearchColumnDateField[] startTime) {
        this.startTime = startTime;
    }

    public SearchColumnDateField getStartTime(int i) {
        return this.startTime[i];
    }

    public void setStartTime(int i, SearchColumnDateField _value) {
        this.startTime[i] = _value;
    }

    public SearchColumnStringField[] getStatus() {
        return this.status;
    }

    public void setStatus(SearchColumnStringField[] status) {
        this.status = status;
    }

    public SearchColumnStringField getStatus(int i) {
        return this.status[i];
    }

    public void setStatus(int i, SearchColumnStringField _value) {
        this.status[i] = _value;
    }

    public SearchColumnStringField[] getSubsidiary() {
        return this.subsidiary;
    }

    public void setSubsidiary(SearchColumnStringField[] subsidiary) {
        this.subsidiary = subsidiary;
    }

    public SearchColumnStringField getSubsidiary(int i) {
        return this.subsidiary[i];
    }

    public void setSubsidiary(int i, SearchColumnStringField _value) {
        this.subsidiary[i] = _value;
    }

    public SearchColumnBooleanField[] getSupervisorApproval() {
        return this.supervisorApproval;
    }

    public void setSupervisorApproval(SearchColumnBooleanField[] supervisorApproval) {
        this.supervisorApproval = supervisorApproval;
    }

    public SearchColumnBooleanField getSupervisorApproval(int i) {
        return this.supervisorApproval[i];
    }

    public void setSupervisorApproval(int i, SearchColumnBooleanField _value) {
        this.supervisorApproval[i] = _value;
    }

    public SearchColumnStringField[] getTemporaryLocalJurisdiction() {
        return this.temporaryLocalJurisdiction;
    }

    public void setTemporaryLocalJurisdiction(SearchColumnStringField[] temporaryLocalJurisdiction) {
        this.temporaryLocalJurisdiction = temporaryLocalJurisdiction;
    }

    public SearchColumnStringField getTemporaryLocalJurisdiction(int i) {
        return this.temporaryLocalJurisdiction[i];
    }

    public void setTemporaryLocalJurisdiction(int i, SearchColumnStringField _value) {
        this.temporaryLocalJurisdiction[i] = _value;
    }

    public SearchColumnStringField[] getTemporaryStateJurisdiction() {
        return this.temporaryStateJurisdiction;
    }

    public void setTemporaryStateJurisdiction(SearchColumnStringField[] temporaryStateJurisdiction) {
        this.temporaryStateJurisdiction = temporaryStateJurisdiction;
    }

    public SearchColumnStringField getTemporaryStateJurisdiction(int i) {
        return this.temporaryStateJurisdiction[i];
    }

    public void setTemporaryStateJurisdiction(int i, SearchColumnStringField _value) {
        this.temporaryStateJurisdiction[i] = _value;
    }

    public SearchColumnBooleanField[] getTimeModified() {
        return this.timeModified;
    }

    public void setTimeModified(SearchColumnBooleanField[] timeModified) {
        this.timeModified = timeModified;
    }

    public SearchColumnBooleanField getTimeModified(int i) {
        return this.timeModified[i];
    }

    public void setTimeModified(int i, SearchColumnBooleanField _value) {
        this.timeModified[i] = _value;
    }

    public SearchColumnSelectField[] getTimeSheet() {
        return this.timeSheet;
    }

    public void setTimeSheet(SearchColumnSelectField[] timeSheet) {
        this.timeSheet = timeSheet;
    }

    public SearchColumnSelectField getTimeSheet(int i) {
        return this.timeSheet[i];
    }

    public void setTimeSheet(int i, SearchColumnSelectField _value) {
        this.timeSheet[i] = _value;
    }

    public SearchColumnEnumSelectField[] getType() {
        return this.type;
    }

    public void setType(SearchColumnEnumSelectField[] type) {
        this.type = type;
    }

    public SearchColumnEnumSelectField getType(int i) {
        return this.type[i];
    }

    public void setType(int i, SearchColumnEnumSelectField _value) {
        this.type[i] = _value;
    }

    public SearchColumnCustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TimeBillSearchRowBasic)) {
            return false;
        }
        TimeBillSearchRowBasic other = (TimeBillSearchRowBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.approvalStatus == null && other.getApprovalStatus() == null || this.approvalStatus != null && Arrays.equals(this.approvalStatus, other.getApprovalStatus())) && (this._break == null && other.get_break() == null || this._break != null && Arrays.equals(this._break, other.get_break())) && (this._class == null && other.get_class() == null || this._class != null && Arrays.equals(this._class, other.get_class())) && (this.customer == null && other.getCustomer() == null || this.customer != null && Arrays.equals(this.customer, other.getCustomer())) && (this.date == null && other.getDate() == null || this.date != null && Arrays.equals(this.date, other.getDate())) && (this.dateCreated == null && other.getDateCreated() == null || this.dateCreated != null && Arrays.equals(this.dateCreated, other.getDateCreated())) && (this.department == null && other.getDepartment() == null || this.department != null && Arrays.equals(this.department, other.getDepartment())) && (this.durationDecimal == null && other.getDurationDecimal() == null || this.durationDecimal != null && Arrays.equals(this.durationDecimal, other.getDurationDecimal())) && (this.employee == null && other.getEmployee() == null || this.employee != null && Arrays.equals(this.employee, other.getEmployee())) && (this.endTime == null && other.getEndTime() == null || this.endTime != null && Arrays.equals(this.endTime, other.getEndTime())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && Arrays.equals(this.externalId, other.getExternalId())) && (this.hours == null && other.getHours() == null || this.hours != null && Arrays.equals(this.hours, other.getHours())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && Arrays.equals(this.internalId, other.getInternalId())) && (this.isBillable == null && other.getIsBillable() == null || this.isBillable != null && Arrays.equals(this.isBillable, other.getIsBillable())) && (this.isExempt == null && other.getIsExempt() == null || this.isExempt != null && Arrays.equals(this.isExempt, other.getIsExempt())) && (this.isProductive == null && other.getIsProductive() == null || this.isProductive != null && Arrays.equals(this.isProductive, other.getIsProductive())) && (this.isUtilized == null && other.getIsUtilized() == null || this.isUtilized != null && Arrays.equals(this.isUtilized, other.getIsUtilized())) && (this.item == null && other.getItem() == null || this.item != null && Arrays.equals(this.item, other.getItem())) && (this.lastModified == null && other.getLastModified() == null || this.lastModified != null && Arrays.equals(this.lastModified, other.getLastModified())) && (this.location == null && other.getLocation() == null || this.location != null && Arrays.equals(this.location, other.getLocation())) && (this.memo == null && other.getMemo() == null || this.memo != null && Arrays.equals(this.memo, other.getMemo())) && (this.paidExternally == null && other.getPaidExternally() == null || this.paidExternally != null && Arrays.equals(this.paidExternally, other.getPaidExternally())) && (this.payItem == null && other.getPayItem() == null || this.payItem != null && Arrays.equals(this.payItem, other.getPayItem())) && (this.payrollDate == null && other.getPayrollDate() == null || this.payrollDate != null && Arrays.equals(this.payrollDate, other.getPayrollDate())) && (this.rate == null && other.getRate() == null || this.rate != null && Arrays.equals(this.rate, other.getRate())) && (this.rejectionNote == null && other.getRejectionNote() == null || this.rejectionNote != null && Arrays.equals(this.rejectionNote, other.getRejectionNote())) && (this.startTime == null && other.getStartTime() == null || this.startTime != null && Arrays.equals(this.startTime, other.getStartTime())) && (this.status == null && other.getStatus() == null || this.status != null && Arrays.equals(this.status, other.getStatus())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && Arrays.equals(this.subsidiary, other.getSubsidiary())) && (this.supervisorApproval == null && other.getSupervisorApproval() == null || this.supervisorApproval != null && Arrays.equals(this.supervisorApproval, other.getSupervisorApproval())) && (this.temporaryLocalJurisdiction == null && other.getTemporaryLocalJurisdiction() == null || this.temporaryLocalJurisdiction != null && Arrays.equals(this.temporaryLocalJurisdiction, other.getTemporaryLocalJurisdiction())) && (this.temporaryStateJurisdiction == null && other.getTemporaryStateJurisdiction() == null || this.temporaryStateJurisdiction != null && Arrays.equals(this.temporaryStateJurisdiction, other.getTemporaryStateJurisdiction())) && (this.timeModified == null && other.getTimeModified() == null || this.timeModified != null && Arrays.equals(this.timeModified, other.getTimeModified())) && (this.timeSheet == null && other.getTimeSheet() == null || this.timeSheet != null && Arrays.equals(this.timeSheet, other.getTimeSheet())) && (this.type == null && other.getType() == null || this.type != null && Arrays.equals(this.type, other.getType())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
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
        if (this.getApprovalStatus() != null) {
            for (i = 0; i < Array.getLength(this.getApprovalStatus()); ++i) {
                obj = Array.get(this.getApprovalStatus(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.get_break() != null) {
            for (i = 0; i < Array.getLength(this.get_break()); ++i) {
                obj = Array.get(this.get_break(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.get_class() != null) {
            for (i = 0; i < Array.getLength(this.get_class()); ++i) {
                obj = Array.get(this.get_class(), i);
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
        if (this.getDate() != null) {
            for (i = 0; i < Array.getLength(this.getDate()); ++i) {
                obj = Array.get(this.getDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDateCreated() != null) {
            for (i = 0; i < Array.getLength(this.getDateCreated()); ++i) {
                obj = Array.get(this.getDateCreated(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDepartment() != null) {
            for (i = 0; i < Array.getLength(this.getDepartment()); ++i) {
                obj = Array.get(this.getDepartment(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDurationDecimal() != null) {
            for (i = 0; i < Array.getLength(this.getDurationDecimal()); ++i) {
                obj = Array.get(this.getDurationDecimal(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getEmployee() != null) {
            for (i = 0; i < Array.getLength(this.getEmployee()); ++i) {
                obj = Array.get(this.getEmployee(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getEndTime() != null) {
            for (i = 0; i < Array.getLength(this.getEndTime()); ++i) {
                obj = Array.get(this.getEndTime(), i);
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
        if (this.getHours() != null) {
            for (i = 0; i < Array.getLength(this.getHours()); ++i) {
                obj = Array.get(this.getHours(), i);
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
        if (this.getIsBillable() != null) {
            for (i = 0; i < Array.getLength(this.getIsBillable()); ++i) {
                obj = Array.get(this.getIsBillable(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsExempt() != null) {
            for (i = 0; i < Array.getLength(this.getIsExempt()); ++i) {
                obj = Array.get(this.getIsExempt(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsProductive() != null) {
            for (i = 0; i < Array.getLength(this.getIsProductive()); ++i) {
                obj = Array.get(this.getIsProductive(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsUtilized() != null) {
            for (i = 0; i < Array.getLength(this.getIsUtilized()); ++i) {
                obj = Array.get(this.getIsUtilized(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getItem() != null) {
            for (i = 0; i < Array.getLength(this.getItem()); ++i) {
                obj = Array.get(this.getItem(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLastModified() != null) {
            for (i = 0; i < Array.getLength(this.getLastModified()); ++i) {
                obj = Array.get(this.getLastModified(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLocation() != null) {
            for (i = 0; i < Array.getLength(this.getLocation()); ++i) {
                obj = Array.get(this.getLocation(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getMemo() != null) {
            for (i = 0; i < Array.getLength(this.getMemo()); ++i) {
                obj = Array.get(this.getMemo(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPaidExternally() != null) {
            for (i = 0; i < Array.getLength(this.getPaidExternally()); ++i) {
                obj = Array.get(this.getPaidExternally(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPayItem() != null) {
            for (i = 0; i < Array.getLength(this.getPayItem()); ++i) {
                obj = Array.get(this.getPayItem(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPayrollDate() != null) {
            for (i = 0; i < Array.getLength(this.getPayrollDate()); ++i) {
                obj = Array.get(this.getPayrollDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRate() != null) {
            for (i = 0; i < Array.getLength(this.getRate()); ++i) {
                obj = Array.get(this.getRate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRejectionNote() != null) {
            for (i = 0; i < Array.getLength(this.getRejectionNote()); ++i) {
                obj = Array.get(this.getRejectionNote(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getStartTime() != null) {
            for (i = 0; i < Array.getLength(this.getStartTime()); ++i) {
                obj = Array.get(this.getStartTime(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getStatus() != null) {
            for (i = 0; i < Array.getLength(this.getStatus()); ++i) {
                obj = Array.get(this.getStatus(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSubsidiary() != null) {
            for (i = 0; i < Array.getLength(this.getSubsidiary()); ++i) {
                obj = Array.get(this.getSubsidiary(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSupervisorApproval() != null) {
            for (i = 0; i < Array.getLength(this.getSupervisorApproval()); ++i) {
                obj = Array.get(this.getSupervisorApproval(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTemporaryLocalJurisdiction() != null) {
            for (i = 0; i < Array.getLength(this.getTemporaryLocalJurisdiction()); ++i) {
                obj = Array.get(this.getTemporaryLocalJurisdiction(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTemporaryStateJurisdiction() != null) {
            for (i = 0; i < Array.getLength(this.getTemporaryStateJurisdiction()); ++i) {
                obj = Array.get(this.getTemporaryStateJurisdiction(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTimeModified() != null) {
            for (i = 0; i < Array.getLength(this.getTimeModified()); ++i) {
                obj = Array.get(this.getTimeModified(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTimeSheet() != null) {
            for (i = 0; i < Array.getLength(this.getTimeSheet()); ++i) {
                obj = Array.get(this.getTimeSheet(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getType() != null) {
            for (i = 0; i < Array.getLength(this.getType()); ++i) {
                obj = Array.get(this.getType(), i);
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TimeBillSearchRowBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("approvalStatus");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "approvalStatus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("_break");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "break"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "class"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("date");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "date"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("dateCreated");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "dateCreated"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "department"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("durationDecimal");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "durationDecimal"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("employee");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "employee"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("endTime");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "endTime"));
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
        elemField.setFieldName("hours");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "hours"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("isBillable");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isBillable"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isExempt");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isExempt"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isProductive");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isProductive"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isUtilized");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isUtilized"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastModified");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lastModified"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "location"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("paidExternally");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "paidExternally"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("payItem");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "payItem"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("payrollDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "payrollDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("rate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "rate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("rejectionNote");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "rejectionNote"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "startTime"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "status"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("supervisorApproval");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "supervisorApproval"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("temporaryLocalJurisdiction");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "temporaryLocalJurisdiction"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("temporaryStateJurisdiction");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "temporaryStateJurisdiction"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("timeModified");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "timeModified"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("timeSheet");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "timeSheet"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "type"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
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

