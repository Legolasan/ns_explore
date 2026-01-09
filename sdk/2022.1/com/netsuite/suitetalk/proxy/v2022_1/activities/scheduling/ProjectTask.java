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

import com.netsuite.suitetalk.proxy.v2022_1.activities.scheduling.ProjectTaskAssigneeList;
import com.netsuite.suitetalk.proxy.v2022_1.activities.scheduling.ProjectTaskPredecessorList;
import com.netsuite.suitetalk.proxy.v2022_1.activities.scheduling.ProjectTaskTimeItemList;
import com.netsuite.suitetalk.proxy.v2022_1.activities.scheduling.types.ProjectTaskConstraintType;
import com.netsuite.suitetalk.proxy.v2022_1.activities.scheduling.types.ProjectTaskStatus;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.CustomFieldList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.Duration;
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

public class ProjectTask
extends Record
implements Serializable {
    private RecordRef customForm;
    private RecordRef eventId;
    private Double percentTimeComplete;
    private String title;
    private RecordRef company;
    private RecordRef contact;
    private RecordRef order;
    private RecordRef owner;
    private RecordRef parent;
    private RecordRef priority;
    private Double estimatedWork;
    private Double estimatedWorkBaseline;
    private ProjectTaskConstraintType constraintType;
    private Calendar startDate;
    private Calendar startDateBaseline;
    private Calendar endDate;
    private Calendar finishByDate;
    private Calendar endDateBaseline;
    private Duration actualWork;
    private Duration remainingWork;
    private String message;
    private Boolean isMilestone;
    private String isOnCriticalPath;
    private Double slackMinutes;
    private Calendar lateEnd;
    private Calendar lateStart;
    private ProjectTaskStatus status;
    private Boolean nonBillableTask;
    private ProjectTaskAssigneeList assigneeList;
    private ProjectTaskPredecessorList predecessorList;
    private ProjectTaskTimeItemList timeItemList;
    private Double plannedWork;
    private Double plannedWorkBaseline;
    private CustomFieldList customFieldList;
    private String internalId;
    private String externalId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(ProjectTask.class, true);

    public ProjectTask() {
    }

    public ProjectTask(NullField nullFieldList, String internalId, String externalId, RecordRef customForm, RecordRef eventId, Double percentTimeComplete, String title, RecordRef company, RecordRef contact, RecordRef order, RecordRef owner, RecordRef parent, RecordRef priority, Double estimatedWork, Double estimatedWorkBaseline, ProjectTaskConstraintType constraintType, Calendar startDate, Calendar startDateBaseline, Calendar endDate, Calendar finishByDate, Calendar endDateBaseline, Duration actualWork, Duration remainingWork, String message, Boolean isMilestone, String isOnCriticalPath, Double slackMinutes, Calendar lateEnd, Calendar lateStart, ProjectTaskStatus status, Boolean nonBillableTask, ProjectTaskAssigneeList assigneeList, ProjectTaskPredecessorList predecessorList, ProjectTaskTimeItemList timeItemList, Double plannedWork, Double plannedWorkBaseline, CustomFieldList customFieldList) {
        super(nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.customForm = customForm;
        this.eventId = eventId;
        this.percentTimeComplete = percentTimeComplete;
        this.title = title;
        this.company = company;
        this.contact = contact;
        this.order = order;
        this.owner = owner;
        this.parent = parent;
        this.priority = priority;
        this.estimatedWork = estimatedWork;
        this.estimatedWorkBaseline = estimatedWorkBaseline;
        this.constraintType = constraintType;
        this.startDate = startDate;
        this.startDateBaseline = startDateBaseline;
        this.endDate = endDate;
        this.finishByDate = finishByDate;
        this.endDateBaseline = endDateBaseline;
        this.actualWork = actualWork;
        this.remainingWork = remainingWork;
        this.message = message;
        this.isMilestone = isMilestone;
        this.isOnCriticalPath = isOnCriticalPath;
        this.slackMinutes = slackMinutes;
        this.lateEnd = lateEnd;
        this.lateStart = lateStart;
        this.status = status;
        this.nonBillableTask = nonBillableTask;
        this.assigneeList = assigneeList;
        this.predecessorList = predecessorList;
        this.timeItemList = timeItemList;
        this.plannedWork = plannedWork;
        this.plannedWorkBaseline = plannedWorkBaseline;
        this.customFieldList = customFieldList;
    }

    public RecordRef getCustomForm() {
        return this.customForm;
    }

    public void setCustomForm(RecordRef customForm) {
        this.customForm = customForm;
    }

    public RecordRef getEventId() {
        return this.eventId;
    }

    public void setEventId(RecordRef eventId) {
        this.eventId = eventId;
    }

    public Double getPercentTimeComplete() {
        return this.percentTimeComplete;
    }

    public void setPercentTimeComplete(Double percentTimeComplete) {
        this.percentTimeComplete = percentTimeComplete;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public RecordRef getCompany() {
        return this.company;
    }

    public void setCompany(RecordRef company) {
        this.company = company;
    }

    public RecordRef getContact() {
        return this.contact;
    }

    public void setContact(RecordRef contact) {
        this.contact = contact;
    }

    public RecordRef getOrder() {
        return this.order;
    }

    public void setOrder(RecordRef order) {
        this.order = order;
    }

    public RecordRef getOwner() {
        return this.owner;
    }

    public void setOwner(RecordRef owner) {
        this.owner = owner;
    }

    public RecordRef getParent() {
        return this.parent;
    }

    public void setParent(RecordRef parent) {
        this.parent = parent;
    }

    public RecordRef getPriority() {
        return this.priority;
    }

    public void setPriority(RecordRef priority) {
        this.priority = priority;
    }

    public Double getEstimatedWork() {
        return this.estimatedWork;
    }

    public void setEstimatedWork(Double estimatedWork) {
        this.estimatedWork = estimatedWork;
    }

    public Double getEstimatedWorkBaseline() {
        return this.estimatedWorkBaseline;
    }

    public void setEstimatedWorkBaseline(Double estimatedWorkBaseline) {
        this.estimatedWorkBaseline = estimatedWorkBaseline;
    }

    public ProjectTaskConstraintType getConstraintType() {
        return this.constraintType;
    }

    public void setConstraintType(ProjectTaskConstraintType constraintType) {
        this.constraintType = constraintType;
    }

    public Calendar getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Calendar startDate) {
        this.startDate = startDate;
    }

    public Calendar getStartDateBaseline() {
        return this.startDateBaseline;
    }

    public void setStartDateBaseline(Calendar startDateBaseline) {
        this.startDateBaseline = startDateBaseline;
    }

    public Calendar getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Calendar endDate) {
        this.endDate = endDate;
    }

    public Calendar getFinishByDate() {
        return this.finishByDate;
    }

    public void setFinishByDate(Calendar finishByDate) {
        this.finishByDate = finishByDate;
    }

    public Calendar getEndDateBaseline() {
        return this.endDateBaseline;
    }

    public void setEndDateBaseline(Calendar endDateBaseline) {
        this.endDateBaseline = endDateBaseline;
    }

    public Duration getActualWork() {
        return this.actualWork;
    }

    public void setActualWork(Duration actualWork) {
        this.actualWork = actualWork;
    }

    public Duration getRemainingWork() {
        return this.remainingWork;
    }

    public void setRemainingWork(Duration remainingWork) {
        this.remainingWork = remainingWork;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getIsMilestone() {
        return this.isMilestone;
    }

    public void setIsMilestone(Boolean isMilestone) {
        this.isMilestone = isMilestone;
    }

    public String getIsOnCriticalPath() {
        return this.isOnCriticalPath;
    }

    public void setIsOnCriticalPath(String isOnCriticalPath) {
        this.isOnCriticalPath = isOnCriticalPath;
    }

    public Double getSlackMinutes() {
        return this.slackMinutes;
    }

    public void setSlackMinutes(Double slackMinutes) {
        this.slackMinutes = slackMinutes;
    }

    public Calendar getLateEnd() {
        return this.lateEnd;
    }

    public void setLateEnd(Calendar lateEnd) {
        this.lateEnd = lateEnd;
    }

    public Calendar getLateStart() {
        return this.lateStart;
    }

    public void setLateStart(Calendar lateStart) {
        this.lateStart = lateStart;
    }

    public ProjectTaskStatus getStatus() {
        return this.status;
    }

    public void setStatus(ProjectTaskStatus status) {
        this.status = status;
    }

    public Boolean getNonBillableTask() {
        return this.nonBillableTask;
    }

    public void setNonBillableTask(Boolean nonBillableTask) {
        this.nonBillableTask = nonBillableTask;
    }

    public ProjectTaskAssigneeList getAssigneeList() {
        return this.assigneeList;
    }

    public void setAssigneeList(ProjectTaskAssigneeList assigneeList) {
        this.assigneeList = assigneeList;
    }

    public ProjectTaskPredecessorList getPredecessorList() {
        return this.predecessorList;
    }

    public void setPredecessorList(ProjectTaskPredecessorList predecessorList) {
        this.predecessorList = predecessorList;
    }

    public ProjectTaskTimeItemList getTimeItemList() {
        return this.timeItemList;
    }

    public void setTimeItemList(ProjectTaskTimeItemList timeItemList) {
        this.timeItemList = timeItemList;
    }

    public Double getPlannedWork() {
        return this.plannedWork;
    }

    public void setPlannedWork(Double plannedWork) {
        this.plannedWork = plannedWork;
    }

    public Double getPlannedWorkBaseline() {
        return this.plannedWorkBaseline;
    }

    public void setPlannedWorkBaseline(Double plannedWorkBaseline) {
        this.plannedWorkBaseline = plannedWorkBaseline;
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
        if (!(obj instanceof ProjectTask)) {
            return false;
        }
        ProjectTask other = (ProjectTask)obj;
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
        boolean _equals = super.equals(obj) && (this.customForm == null && other.getCustomForm() == null || this.customForm != null && this.customForm.equals(other.getCustomForm())) && (this.eventId == null && other.getEventId() == null || this.eventId != null && this.eventId.equals(other.getEventId())) && (this.percentTimeComplete == null && other.getPercentTimeComplete() == null || this.percentTimeComplete != null && this.percentTimeComplete.equals(other.getPercentTimeComplete())) && (this.title == null && other.getTitle() == null || this.title != null && this.title.equals(other.getTitle())) && (this.company == null && other.getCompany() == null || this.company != null && this.company.equals(other.getCompany())) && (this.contact == null && other.getContact() == null || this.contact != null && this.contact.equals(other.getContact())) && (this.order == null && other.getOrder() == null || this.order != null && this.order.equals(other.getOrder())) && (this.owner == null && other.getOwner() == null || this.owner != null && this.owner.equals(other.getOwner())) && (this.parent == null && other.getParent() == null || this.parent != null && this.parent.equals(other.getParent())) && (this.priority == null && other.getPriority() == null || this.priority != null && this.priority.equals(other.getPriority())) && (this.estimatedWork == null && other.getEstimatedWork() == null || this.estimatedWork != null && this.estimatedWork.equals(other.getEstimatedWork())) && (this.estimatedWorkBaseline == null && other.getEstimatedWorkBaseline() == null || this.estimatedWorkBaseline != null && this.estimatedWorkBaseline.equals(other.getEstimatedWorkBaseline())) && (this.constraintType == null && other.getConstraintType() == null || this.constraintType != null && this.constraintType.equals(other.getConstraintType())) && (this.startDate == null && other.getStartDate() == null || this.startDate != null && this.startDate.equals(other.getStartDate())) && (this.startDateBaseline == null && other.getStartDateBaseline() == null || this.startDateBaseline != null && this.startDateBaseline.equals(other.getStartDateBaseline())) && (this.endDate == null && other.getEndDate() == null || this.endDate != null && this.endDate.equals(other.getEndDate())) && (this.finishByDate == null && other.getFinishByDate() == null || this.finishByDate != null && this.finishByDate.equals(other.getFinishByDate())) && (this.endDateBaseline == null && other.getEndDateBaseline() == null || this.endDateBaseline != null && this.endDateBaseline.equals(other.getEndDateBaseline())) && (this.actualWork == null && other.getActualWork() == null || this.actualWork != null && this.actualWork.equals(other.getActualWork())) && (this.remainingWork == null && other.getRemainingWork() == null || this.remainingWork != null && this.remainingWork.equals(other.getRemainingWork())) && (this.message == null && other.getMessage() == null || this.message != null && this.message.equals(other.getMessage())) && (this.isMilestone == null && other.getIsMilestone() == null || this.isMilestone != null && this.isMilestone.equals(other.getIsMilestone())) && (this.isOnCriticalPath == null && other.getIsOnCriticalPath() == null || this.isOnCriticalPath != null && this.isOnCriticalPath.equals(other.getIsOnCriticalPath())) && (this.slackMinutes == null && other.getSlackMinutes() == null || this.slackMinutes != null && this.slackMinutes.equals(other.getSlackMinutes())) && (this.lateEnd == null && other.getLateEnd() == null || this.lateEnd != null && this.lateEnd.equals(other.getLateEnd())) && (this.lateStart == null && other.getLateStart() == null || this.lateStart != null && this.lateStart.equals(other.getLateStart())) && (this.status == null && other.getStatus() == null || this.status != null && this.status.equals(other.getStatus())) && (this.nonBillableTask == null && other.getNonBillableTask() == null || this.nonBillableTask != null && this.nonBillableTask.equals(other.getNonBillableTask())) && (this.assigneeList == null && other.getAssigneeList() == null || this.assigneeList != null && this.assigneeList.equals(other.getAssigneeList())) && (this.predecessorList == null && other.getPredecessorList() == null || this.predecessorList != null && this.predecessorList.equals(other.getPredecessorList())) && (this.timeItemList == null && other.getTimeItemList() == null || this.timeItemList != null && this.timeItemList.equals(other.getTimeItemList())) && (this.plannedWork == null && other.getPlannedWork() == null || this.plannedWork != null && this.plannedWork.equals(other.getPlannedWork())) && (this.plannedWorkBaseline == null && other.getPlannedWorkBaseline() == null || this.plannedWorkBaseline != null && this.plannedWorkBaseline.equals(other.getPlannedWorkBaseline())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
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
        if (this.getEventId() != null) {
            _hashCode += this.getEventId().hashCode();
        }
        if (this.getPercentTimeComplete() != null) {
            _hashCode += this.getPercentTimeComplete().hashCode();
        }
        if (this.getTitle() != null) {
            _hashCode += this.getTitle().hashCode();
        }
        if (this.getCompany() != null) {
            _hashCode += this.getCompany().hashCode();
        }
        if (this.getContact() != null) {
            _hashCode += this.getContact().hashCode();
        }
        if (this.getOrder() != null) {
            _hashCode += this.getOrder().hashCode();
        }
        if (this.getOwner() != null) {
            _hashCode += this.getOwner().hashCode();
        }
        if (this.getParent() != null) {
            _hashCode += this.getParent().hashCode();
        }
        if (this.getPriority() != null) {
            _hashCode += this.getPriority().hashCode();
        }
        if (this.getEstimatedWork() != null) {
            _hashCode += this.getEstimatedWork().hashCode();
        }
        if (this.getEstimatedWorkBaseline() != null) {
            _hashCode += this.getEstimatedWorkBaseline().hashCode();
        }
        if (this.getConstraintType() != null) {
            _hashCode += this.getConstraintType().hashCode();
        }
        if (this.getStartDate() != null) {
            _hashCode += this.getStartDate().hashCode();
        }
        if (this.getStartDateBaseline() != null) {
            _hashCode += this.getStartDateBaseline().hashCode();
        }
        if (this.getEndDate() != null) {
            _hashCode += this.getEndDate().hashCode();
        }
        if (this.getFinishByDate() != null) {
            _hashCode += this.getFinishByDate().hashCode();
        }
        if (this.getEndDateBaseline() != null) {
            _hashCode += this.getEndDateBaseline().hashCode();
        }
        if (this.getActualWork() != null) {
            _hashCode += this.getActualWork().hashCode();
        }
        if (this.getRemainingWork() != null) {
            _hashCode += this.getRemainingWork().hashCode();
        }
        if (this.getMessage() != null) {
            _hashCode += this.getMessage().hashCode();
        }
        if (this.getIsMilestone() != null) {
            _hashCode += this.getIsMilestone().hashCode();
        }
        if (this.getIsOnCriticalPath() != null) {
            _hashCode += this.getIsOnCriticalPath().hashCode();
        }
        if (this.getSlackMinutes() != null) {
            _hashCode += this.getSlackMinutes().hashCode();
        }
        if (this.getLateEnd() != null) {
            _hashCode += this.getLateEnd().hashCode();
        }
        if (this.getLateStart() != null) {
            _hashCode += this.getLateStart().hashCode();
        }
        if (this.getStatus() != null) {
            _hashCode += this.getStatus().hashCode();
        }
        if (this.getNonBillableTask() != null) {
            _hashCode += this.getNonBillableTask().hashCode();
        }
        if (this.getAssigneeList() != null) {
            _hashCode += this.getAssigneeList().hashCode();
        }
        if (this.getPredecessorList() != null) {
            _hashCode += this.getPredecessorList().hashCode();
        }
        if (this.getTimeItemList() != null) {
            _hashCode += this.getTimeItemList().hashCode();
        }
        if (this.getPlannedWork() != null) {
            _hashCode += this.getPlannedWork().hashCode();
        }
        if (this.getPlannedWorkBaseline() != null) {
            _hashCode += this.getPlannedWorkBaseline().hashCode();
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
        typeDesc.setXmlType(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "ProjectTask"));
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
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("eventId");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "eventId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("percentTimeComplete");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "percentTimeComplete"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "title"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("company");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "company"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("contact");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "contact"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("order");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "order"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "owner"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "parent"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "priority"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("estimatedWork");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "estimatedWork"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("estimatedWorkBaseline");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "estimatedWorkBaseline"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("constraintType");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "constraintType"));
        elemField.setXmlType(new QName("urn:types.scheduling_2022_1.activities.webservices.netsuite.com", "ProjectTaskConstraintType"));
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
        elemField.setFieldName("startDateBaseline");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "startDateBaseline"));
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
        elemField.setFieldName("finishByDate");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "finishByDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("endDateBaseline");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "endDateBaseline"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("actualWork");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "actualWork"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "Duration"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("remainingWork");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "remainingWork"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "Duration"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "message"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isMilestone");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "isMilestone"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isOnCriticalPath");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "isOnCriticalPath"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("slackMinutes");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "slackMinutes"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lateEnd");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "lateEnd"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lateStart");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "lateStart"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "status"));
        elemField.setXmlType(new QName("urn:types.scheduling_2022_1.activities.webservices.netsuite.com", "ProjectTaskStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("nonBillableTask");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "nonBillableTask"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("assigneeList");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "assigneeList"));
        elemField.setXmlType(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "ProjectTaskAssigneeList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("predecessorList");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "predecessorList"));
        elemField.setXmlType(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "ProjectTaskPredecessorList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("timeItemList");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "timeItemList"));
        elemField.setXmlType(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "ProjectTaskTimeItemList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("plannedWork");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "plannedWork"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("plannedWorkBaseline");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "plannedWorkBaseline"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
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

