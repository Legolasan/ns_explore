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

public class ProjectTaskSearchBasic
extends SearchRecordBasic
implements Serializable {
    private SearchDoubleField actualWork;
    private SearchMultiSelectField assignee;
    private SearchMultiSelectField company;
    private SearchEnumMultiSelectField constraintType;
    private SearchMultiSelectField contact;
    private SearchDoubleField cost;
    private SearchDoubleField costBase;
    private SearchDoubleField costBaseBaseline;
    private SearchDoubleField costBaseline;
    private SearchDoubleField costBaseVariance;
    private SearchDoubleField costVariance;
    private SearchDoubleField costVariancePercent;
    private SearchDateField createdDate;
    private SearchDateField endDate;
    private SearchDateField endDateBaseline;
    private SearchDoubleField endDateVariance;
    private SearchDoubleField estimatedWork;
    private SearchDoubleField estimatedWorkBaseline;
    private SearchDoubleField estimatedWorkVariance;
    private SearchDoubleField estimatedWorkVariancePercent;
    private SearchMultiSelectField externalId;
    private SearchStringField externalIdString;
    private SearchDateField finishByDate;
    private SearchLongField id;
    private SearchMultiSelectField internalId;
    private SearchLongField internalIdNumber;
    private SearchBooleanField isMilestone;
    private SearchBooleanField isSummaryTask;
    private SearchDateField lastModifiedDate;
    private SearchBooleanField nonBillableTask;
    private SearchMultiSelectField owner;
    private SearchMultiSelectField parent;
    private SearchDoubleField percentWorkComplete;
    private SearchDoubleField plannedWork;
    private SearchDoubleField plannedWorkBaseline;
    private SearchMultiSelectField predecessor;
    private SearchStringField predecessors;
    private SearchEnumMultiSelectField priority;
    private SearchDoubleField remainingWork;
    private SearchDateField startDate;
    private SearchDateField startDateBaseline;
    private SearchDoubleField startDateVariance;
    private SearchEnumMultiSelectField status;
    private SearchMultiSelectField successor;
    private SearchStringField title;
    private SearchCustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(ProjectTaskSearchBasic.class, true);

    public ProjectTaskSearchBasic() {
    }

    public ProjectTaskSearchBasic(SearchDoubleField actualWork, SearchMultiSelectField assignee, SearchMultiSelectField company, SearchEnumMultiSelectField constraintType, SearchMultiSelectField contact, SearchDoubleField cost, SearchDoubleField costBase, SearchDoubleField costBaseBaseline, SearchDoubleField costBaseline, SearchDoubleField costBaseVariance, SearchDoubleField costVariance, SearchDoubleField costVariancePercent, SearchDateField createdDate, SearchDateField endDate, SearchDateField endDateBaseline, SearchDoubleField endDateVariance, SearchDoubleField estimatedWork, SearchDoubleField estimatedWorkBaseline, SearchDoubleField estimatedWorkVariance, SearchDoubleField estimatedWorkVariancePercent, SearchMultiSelectField externalId, SearchStringField externalIdString, SearchDateField finishByDate, SearchLongField id, SearchMultiSelectField internalId, SearchLongField internalIdNumber, SearchBooleanField isMilestone, SearchBooleanField isSummaryTask, SearchDateField lastModifiedDate, SearchBooleanField nonBillableTask, SearchMultiSelectField owner, SearchMultiSelectField parent, SearchDoubleField percentWorkComplete, SearchDoubleField plannedWork, SearchDoubleField plannedWorkBaseline, SearchMultiSelectField predecessor, SearchStringField predecessors, SearchEnumMultiSelectField priority, SearchDoubleField remainingWork, SearchDateField startDate, SearchDateField startDateBaseline, SearchDoubleField startDateVariance, SearchEnumMultiSelectField status, SearchMultiSelectField successor, SearchStringField title, SearchCustomFieldList customFieldList) {
        this.actualWork = actualWork;
        this.assignee = assignee;
        this.company = company;
        this.constraintType = constraintType;
        this.contact = contact;
        this.cost = cost;
        this.costBase = costBase;
        this.costBaseBaseline = costBaseBaseline;
        this.costBaseline = costBaseline;
        this.costBaseVariance = costBaseVariance;
        this.costVariance = costVariance;
        this.costVariancePercent = costVariancePercent;
        this.createdDate = createdDate;
        this.endDate = endDate;
        this.endDateBaseline = endDateBaseline;
        this.endDateVariance = endDateVariance;
        this.estimatedWork = estimatedWork;
        this.estimatedWorkBaseline = estimatedWorkBaseline;
        this.estimatedWorkVariance = estimatedWorkVariance;
        this.estimatedWorkVariancePercent = estimatedWorkVariancePercent;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.finishByDate = finishByDate;
        this.id = id;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isMilestone = isMilestone;
        this.isSummaryTask = isSummaryTask;
        this.lastModifiedDate = lastModifiedDate;
        this.nonBillableTask = nonBillableTask;
        this.owner = owner;
        this.parent = parent;
        this.percentWorkComplete = percentWorkComplete;
        this.plannedWork = plannedWork;
        this.plannedWorkBaseline = plannedWorkBaseline;
        this.predecessor = predecessor;
        this.predecessors = predecessors;
        this.priority = priority;
        this.remainingWork = remainingWork;
        this.startDate = startDate;
        this.startDateBaseline = startDateBaseline;
        this.startDateVariance = startDateVariance;
        this.status = status;
        this.successor = successor;
        this.title = title;
        this.customFieldList = customFieldList;
    }

    public SearchDoubleField getActualWork() {
        return this.actualWork;
    }

    public void setActualWork(SearchDoubleField actualWork) {
        this.actualWork = actualWork;
    }

    public SearchMultiSelectField getAssignee() {
        return this.assignee;
    }

    public void setAssignee(SearchMultiSelectField assignee) {
        this.assignee = assignee;
    }

    public SearchMultiSelectField getCompany() {
        return this.company;
    }

    public void setCompany(SearchMultiSelectField company) {
        this.company = company;
    }

    public SearchEnumMultiSelectField getConstraintType() {
        return this.constraintType;
    }

    public void setConstraintType(SearchEnumMultiSelectField constraintType) {
        this.constraintType = constraintType;
    }

    public SearchMultiSelectField getContact() {
        return this.contact;
    }

    public void setContact(SearchMultiSelectField contact) {
        this.contact = contact;
    }

    public SearchDoubleField getCost() {
        return this.cost;
    }

    public void setCost(SearchDoubleField cost) {
        this.cost = cost;
    }

    public SearchDoubleField getCostBase() {
        return this.costBase;
    }

    public void setCostBase(SearchDoubleField costBase) {
        this.costBase = costBase;
    }

    public SearchDoubleField getCostBaseBaseline() {
        return this.costBaseBaseline;
    }

    public void setCostBaseBaseline(SearchDoubleField costBaseBaseline) {
        this.costBaseBaseline = costBaseBaseline;
    }

    public SearchDoubleField getCostBaseline() {
        return this.costBaseline;
    }

    public void setCostBaseline(SearchDoubleField costBaseline) {
        this.costBaseline = costBaseline;
    }

    public SearchDoubleField getCostBaseVariance() {
        return this.costBaseVariance;
    }

    public void setCostBaseVariance(SearchDoubleField costBaseVariance) {
        this.costBaseVariance = costBaseVariance;
    }

    public SearchDoubleField getCostVariance() {
        return this.costVariance;
    }

    public void setCostVariance(SearchDoubleField costVariance) {
        this.costVariance = costVariance;
    }

    public SearchDoubleField getCostVariancePercent() {
        return this.costVariancePercent;
    }

    public void setCostVariancePercent(SearchDoubleField costVariancePercent) {
        this.costVariancePercent = costVariancePercent;
    }

    public SearchDateField getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(SearchDateField createdDate) {
        this.createdDate = createdDate;
    }

    public SearchDateField getEndDate() {
        return this.endDate;
    }

    public void setEndDate(SearchDateField endDate) {
        this.endDate = endDate;
    }

    public SearchDateField getEndDateBaseline() {
        return this.endDateBaseline;
    }

    public void setEndDateBaseline(SearchDateField endDateBaseline) {
        this.endDateBaseline = endDateBaseline;
    }

    public SearchDoubleField getEndDateVariance() {
        return this.endDateVariance;
    }

    public void setEndDateVariance(SearchDoubleField endDateVariance) {
        this.endDateVariance = endDateVariance;
    }

    public SearchDoubleField getEstimatedWork() {
        return this.estimatedWork;
    }

    public void setEstimatedWork(SearchDoubleField estimatedWork) {
        this.estimatedWork = estimatedWork;
    }

    public SearchDoubleField getEstimatedWorkBaseline() {
        return this.estimatedWorkBaseline;
    }

    public void setEstimatedWorkBaseline(SearchDoubleField estimatedWorkBaseline) {
        this.estimatedWorkBaseline = estimatedWorkBaseline;
    }

    public SearchDoubleField getEstimatedWorkVariance() {
        return this.estimatedWorkVariance;
    }

    public void setEstimatedWorkVariance(SearchDoubleField estimatedWorkVariance) {
        this.estimatedWorkVariance = estimatedWorkVariance;
    }

    public SearchDoubleField getEstimatedWorkVariancePercent() {
        return this.estimatedWorkVariancePercent;
    }

    public void setEstimatedWorkVariancePercent(SearchDoubleField estimatedWorkVariancePercent) {
        this.estimatedWorkVariancePercent = estimatedWorkVariancePercent;
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

    public SearchDateField getFinishByDate() {
        return this.finishByDate;
    }

    public void setFinishByDate(SearchDateField finishByDate) {
        this.finishByDate = finishByDate;
    }

    public SearchLongField getId() {
        return this.id;
    }

    public void setId(SearchLongField id) {
        this.id = id;
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

    public SearchBooleanField getIsMilestone() {
        return this.isMilestone;
    }

    public void setIsMilestone(SearchBooleanField isMilestone) {
        this.isMilestone = isMilestone;
    }

    public SearchBooleanField getIsSummaryTask() {
        return this.isSummaryTask;
    }

    public void setIsSummaryTask(SearchBooleanField isSummaryTask) {
        this.isSummaryTask = isSummaryTask;
    }

    public SearchDateField getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    public void setLastModifiedDate(SearchDateField lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public SearchBooleanField getNonBillableTask() {
        return this.nonBillableTask;
    }

    public void setNonBillableTask(SearchBooleanField nonBillableTask) {
        this.nonBillableTask = nonBillableTask;
    }

    public SearchMultiSelectField getOwner() {
        return this.owner;
    }

    public void setOwner(SearchMultiSelectField owner) {
        this.owner = owner;
    }

    public SearchMultiSelectField getParent() {
        return this.parent;
    }

    public void setParent(SearchMultiSelectField parent) {
        this.parent = parent;
    }

    public SearchDoubleField getPercentWorkComplete() {
        return this.percentWorkComplete;
    }

    public void setPercentWorkComplete(SearchDoubleField percentWorkComplete) {
        this.percentWorkComplete = percentWorkComplete;
    }

    public SearchDoubleField getPlannedWork() {
        return this.plannedWork;
    }

    public void setPlannedWork(SearchDoubleField plannedWork) {
        this.plannedWork = plannedWork;
    }

    public SearchDoubleField getPlannedWorkBaseline() {
        return this.plannedWorkBaseline;
    }

    public void setPlannedWorkBaseline(SearchDoubleField plannedWorkBaseline) {
        this.plannedWorkBaseline = plannedWorkBaseline;
    }

    public SearchMultiSelectField getPredecessor() {
        return this.predecessor;
    }

    public void setPredecessor(SearchMultiSelectField predecessor) {
        this.predecessor = predecessor;
    }

    public SearchStringField getPredecessors() {
        return this.predecessors;
    }

    public void setPredecessors(SearchStringField predecessors) {
        this.predecessors = predecessors;
    }

    public SearchEnumMultiSelectField getPriority() {
        return this.priority;
    }

    public void setPriority(SearchEnumMultiSelectField priority) {
        this.priority = priority;
    }

    public SearchDoubleField getRemainingWork() {
        return this.remainingWork;
    }

    public void setRemainingWork(SearchDoubleField remainingWork) {
        this.remainingWork = remainingWork;
    }

    public SearchDateField getStartDate() {
        return this.startDate;
    }

    public void setStartDate(SearchDateField startDate) {
        this.startDate = startDate;
    }

    public SearchDateField getStartDateBaseline() {
        return this.startDateBaseline;
    }

    public void setStartDateBaseline(SearchDateField startDateBaseline) {
        this.startDateBaseline = startDateBaseline;
    }

    public SearchDoubleField getStartDateVariance() {
        return this.startDateVariance;
    }

    public void setStartDateVariance(SearchDoubleField startDateVariance) {
        this.startDateVariance = startDateVariance;
    }

    public SearchEnumMultiSelectField getStatus() {
        return this.status;
    }

    public void setStatus(SearchEnumMultiSelectField status) {
        this.status = status;
    }

    public SearchMultiSelectField getSuccessor() {
        return this.successor;
    }

    public void setSuccessor(SearchMultiSelectField successor) {
        this.successor = successor;
    }

    public SearchStringField getTitle() {
        return this.title;
    }

    public void setTitle(SearchStringField title) {
        this.title = title;
    }

    public SearchCustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ProjectTaskSearchBasic)) {
            return false;
        }
        ProjectTaskSearchBasic other = (ProjectTaskSearchBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.actualWork == null && other.getActualWork() == null || this.actualWork != null && this.actualWork.equals(other.getActualWork())) && (this.assignee == null && other.getAssignee() == null || this.assignee != null && this.assignee.equals(other.getAssignee())) && (this.company == null && other.getCompany() == null || this.company != null && this.company.equals(other.getCompany())) && (this.constraintType == null && other.getConstraintType() == null || this.constraintType != null && this.constraintType.equals(other.getConstraintType())) && (this.contact == null && other.getContact() == null || this.contact != null && this.contact.equals(other.getContact())) && (this.cost == null && other.getCost() == null || this.cost != null && this.cost.equals(other.getCost())) && (this.costBase == null && other.getCostBase() == null || this.costBase != null && this.costBase.equals(other.getCostBase())) && (this.costBaseBaseline == null && other.getCostBaseBaseline() == null || this.costBaseBaseline != null && this.costBaseBaseline.equals(other.getCostBaseBaseline())) && (this.costBaseline == null && other.getCostBaseline() == null || this.costBaseline != null && this.costBaseline.equals(other.getCostBaseline())) && (this.costBaseVariance == null && other.getCostBaseVariance() == null || this.costBaseVariance != null && this.costBaseVariance.equals(other.getCostBaseVariance())) && (this.costVariance == null && other.getCostVariance() == null || this.costVariance != null && this.costVariance.equals(other.getCostVariance())) && (this.costVariancePercent == null && other.getCostVariancePercent() == null || this.costVariancePercent != null && this.costVariancePercent.equals(other.getCostVariancePercent())) && (this.createdDate == null && other.getCreatedDate() == null || this.createdDate != null && this.createdDate.equals(other.getCreatedDate())) && (this.endDate == null && other.getEndDate() == null || this.endDate != null && this.endDate.equals(other.getEndDate())) && (this.endDateBaseline == null && other.getEndDateBaseline() == null || this.endDateBaseline != null && this.endDateBaseline.equals(other.getEndDateBaseline())) && (this.endDateVariance == null && other.getEndDateVariance() == null || this.endDateVariance != null && this.endDateVariance.equals(other.getEndDateVariance())) && (this.estimatedWork == null && other.getEstimatedWork() == null || this.estimatedWork != null && this.estimatedWork.equals(other.getEstimatedWork())) && (this.estimatedWorkBaseline == null && other.getEstimatedWorkBaseline() == null || this.estimatedWorkBaseline != null && this.estimatedWorkBaseline.equals(other.getEstimatedWorkBaseline())) && (this.estimatedWorkVariance == null && other.getEstimatedWorkVariance() == null || this.estimatedWorkVariance != null && this.estimatedWorkVariance.equals(other.getEstimatedWorkVariance())) && (this.estimatedWorkVariancePercent == null && other.getEstimatedWorkVariancePercent() == null || this.estimatedWorkVariancePercent != null && this.estimatedWorkVariancePercent.equals(other.getEstimatedWorkVariancePercent())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId())) && (this.externalIdString == null && other.getExternalIdString() == null || this.externalIdString != null && this.externalIdString.equals(other.getExternalIdString())) && (this.finishByDate == null && other.getFinishByDate() == null || this.finishByDate != null && this.finishByDate.equals(other.getFinishByDate())) && (this.id == null && other.getId() == null || this.id != null && this.id.equals(other.getId())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.internalIdNumber == null && other.getInternalIdNumber() == null || this.internalIdNumber != null && this.internalIdNumber.equals(other.getInternalIdNumber())) && (this.isMilestone == null && other.getIsMilestone() == null || this.isMilestone != null && this.isMilestone.equals(other.getIsMilestone())) && (this.isSummaryTask == null && other.getIsSummaryTask() == null || this.isSummaryTask != null && this.isSummaryTask.equals(other.getIsSummaryTask())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && this.lastModifiedDate.equals(other.getLastModifiedDate())) && (this.nonBillableTask == null && other.getNonBillableTask() == null || this.nonBillableTask != null && this.nonBillableTask.equals(other.getNonBillableTask())) && (this.owner == null && other.getOwner() == null || this.owner != null && this.owner.equals(other.getOwner())) && (this.parent == null && other.getParent() == null || this.parent != null && this.parent.equals(other.getParent())) && (this.percentWorkComplete == null && other.getPercentWorkComplete() == null || this.percentWorkComplete != null && this.percentWorkComplete.equals(other.getPercentWorkComplete())) && (this.plannedWork == null && other.getPlannedWork() == null || this.plannedWork != null && this.plannedWork.equals(other.getPlannedWork())) && (this.plannedWorkBaseline == null && other.getPlannedWorkBaseline() == null || this.plannedWorkBaseline != null && this.plannedWorkBaseline.equals(other.getPlannedWorkBaseline())) && (this.predecessor == null && other.getPredecessor() == null || this.predecessor != null && this.predecessor.equals(other.getPredecessor())) && (this.predecessors == null && other.getPredecessors() == null || this.predecessors != null && this.predecessors.equals(other.getPredecessors())) && (this.priority == null && other.getPriority() == null || this.priority != null && this.priority.equals(other.getPriority())) && (this.remainingWork == null && other.getRemainingWork() == null || this.remainingWork != null && this.remainingWork.equals(other.getRemainingWork())) && (this.startDate == null && other.getStartDate() == null || this.startDate != null && this.startDate.equals(other.getStartDate())) && (this.startDateBaseline == null && other.getStartDateBaseline() == null || this.startDateBaseline != null && this.startDateBaseline.equals(other.getStartDateBaseline())) && (this.startDateVariance == null && other.getStartDateVariance() == null || this.startDateVariance != null && this.startDateVariance.equals(other.getStartDateVariance())) && (this.status == null && other.getStatus() == null || this.status != null && this.status.equals(other.getStatus())) && (this.successor == null && other.getSuccessor() == null || this.successor != null && this.successor.equals(other.getSuccessor())) && (this.title == null && other.getTitle() == null || this.title != null && this.title.equals(other.getTitle())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
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
        if (this.getActualWork() != null) {
            _hashCode += this.getActualWork().hashCode();
        }
        if (this.getAssignee() != null) {
            _hashCode += this.getAssignee().hashCode();
        }
        if (this.getCompany() != null) {
            _hashCode += this.getCompany().hashCode();
        }
        if (this.getConstraintType() != null) {
            _hashCode += this.getConstraintType().hashCode();
        }
        if (this.getContact() != null) {
            _hashCode += this.getContact().hashCode();
        }
        if (this.getCost() != null) {
            _hashCode += this.getCost().hashCode();
        }
        if (this.getCostBase() != null) {
            _hashCode += this.getCostBase().hashCode();
        }
        if (this.getCostBaseBaseline() != null) {
            _hashCode += this.getCostBaseBaseline().hashCode();
        }
        if (this.getCostBaseline() != null) {
            _hashCode += this.getCostBaseline().hashCode();
        }
        if (this.getCostBaseVariance() != null) {
            _hashCode += this.getCostBaseVariance().hashCode();
        }
        if (this.getCostVariance() != null) {
            _hashCode += this.getCostVariance().hashCode();
        }
        if (this.getCostVariancePercent() != null) {
            _hashCode += this.getCostVariancePercent().hashCode();
        }
        if (this.getCreatedDate() != null) {
            _hashCode += this.getCreatedDate().hashCode();
        }
        if (this.getEndDate() != null) {
            _hashCode += this.getEndDate().hashCode();
        }
        if (this.getEndDateBaseline() != null) {
            _hashCode += this.getEndDateBaseline().hashCode();
        }
        if (this.getEndDateVariance() != null) {
            _hashCode += this.getEndDateVariance().hashCode();
        }
        if (this.getEstimatedWork() != null) {
            _hashCode += this.getEstimatedWork().hashCode();
        }
        if (this.getEstimatedWorkBaseline() != null) {
            _hashCode += this.getEstimatedWorkBaseline().hashCode();
        }
        if (this.getEstimatedWorkVariance() != null) {
            _hashCode += this.getEstimatedWorkVariance().hashCode();
        }
        if (this.getEstimatedWorkVariancePercent() != null) {
            _hashCode += this.getEstimatedWorkVariancePercent().hashCode();
        }
        if (this.getExternalId() != null) {
            _hashCode += this.getExternalId().hashCode();
        }
        if (this.getExternalIdString() != null) {
            _hashCode += this.getExternalIdString().hashCode();
        }
        if (this.getFinishByDate() != null) {
            _hashCode += this.getFinishByDate().hashCode();
        }
        if (this.getId() != null) {
            _hashCode += this.getId().hashCode();
        }
        if (this.getInternalId() != null) {
            _hashCode += this.getInternalId().hashCode();
        }
        if (this.getInternalIdNumber() != null) {
            _hashCode += this.getInternalIdNumber().hashCode();
        }
        if (this.getIsMilestone() != null) {
            _hashCode += this.getIsMilestone().hashCode();
        }
        if (this.getIsSummaryTask() != null) {
            _hashCode += this.getIsSummaryTask().hashCode();
        }
        if (this.getLastModifiedDate() != null) {
            _hashCode += this.getLastModifiedDate().hashCode();
        }
        if (this.getNonBillableTask() != null) {
            _hashCode += this.getNonBillableTask().hashCode();
        }
        if (this.getOwner() != null) {
            _hashCode += this.getOwner().hashCode();
        }
        if (this.getParent() != null) {
            _hashCode += this.getParent().hashCode();
        }
        if (this.getPercentWorkComplete() != null) {
            _hashCode += this.getPercentWorkComplete().hashCode();
        }
        if (this.getPlannedWork() != null) {
            _hashCode += this.getPlannedWork().hashCode();
        }
        if (this.getPlannedWorkBaseline() != null) {
            _hashCode += this.getPlannedWorkBaseline().hashCode();
        }
        if (this.getPredecessor() != null) {
            _hashCode += this.getPredecessor().hashCode();
        }
        if (this.getPredecessors() != null) {
            _hashCode += this.getPredecessors().hashCode();
        }
        if (this.getPriority() != null) {
            _hashCode += this.getPriority().hashCode();
        }
        if (this.getRemainingWork() != null) {
            _hashCode += this.getRemainingWork().hashCode();
        }
        if (this.getStartDate() != null) {
            _hashCode += this.getStartDate().hashCode();
        }
        if (this.getStartDateBaseline() != null) {
            _hashCode += this.getStartDateBaseline().hashCode();
        }
        if (this.getStartDateVariance() != null) {
            _hashCode += this.getStartDateVariance().hashCode();
        }
        if (this.getStatus() != null) {
            _hashCode += this.getStatus().hashCode();
        }
        if (this.getSuccessor() != null) {
            _hashCode += this.getSuccessor().hashCode();
        }
        if (this.getTitle() != null) {
            _hashCode += this.getTitle().hashCode();
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ProjectTaskSearchBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("actualWork");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "actualWork"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("assignee");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "assignee"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("company");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "company"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("constraintType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "constraintType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("contact");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "contact"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("cost");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "cost"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("costBase");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "costBase"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("costBaseBaseline");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "costBaseBaseline"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("costBaseline");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "costBaseline"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("costBaseVariance");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "costBaseVariance"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("costVariance");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "costVariance"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("costVariancePercent");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "costVariancePercent"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
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
        elemField.setFieldName("endDateBaseline");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "endDateBaseline"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("endDateVariance");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "endDateVariance"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("estimatedWork");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "estimatedWork"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("estimatedWorkBaseline");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "estimatedWorkBaseline"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("estimatedWorkVariance");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "estimatedWorkVariance"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("estimatedWorkVariancePercent");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "estimatedWorkVariancePercent"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
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
        elemField.setFieldName("finishByDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "finishByDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "id"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
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
        elemField.setFieldName("isMilestone");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isMilestone"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isSummaryTask");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isSummaryTask"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("nonBillableTask");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "nonBillableTask"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "owner"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "parent"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("percentWorkComplete");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "percentWorkComplete"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("plannedWork");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "plannedWork"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("plannedWorkBaseline");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "plannedWorkBaseline"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("predecessor");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "predecessor"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("predecessors");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "predecessors"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "priority"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("remainingWork");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "remainingWork"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
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
        elemField.setFieldName("startDateBaseline");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "startDateBaseline"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("startDateVariance");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "startDateVariance"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "status"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("successor");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "successor"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "title"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
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

