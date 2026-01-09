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
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnLongField;
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

public class ProjectTaskSearchRowBasic
extends SearchRowBasic
implements Serializable {
    private SearchColumnDoubleField[] actualWork;
    private SearchColumnSelectField[] company;
    private SearchColumnEnumSelectField[] constraintType;
    private SearchColumnSelectField[] contact;
    private SearchColumnDoubleField[] cost;
    private SearchColumnDoubleField[] costBase;
    private SearchColumnDoubleField[] costBaseBaseline;
    private SearchColumnDoubleField[] costBaseline;
    private SearchColumnDoubleField[] costBaseVariance;
    private SearchColumnDoubleField[] costVariance;
    private SearchColumnDoubleField[] costVariancePercent;
    private SearchColumnDateField[] createdDate;
    private SearchColumnDateField[] endDate;
    private SearchColumnDateField[] endDateBaseline;
    private SearchColumnDoubleField[] endDateVariance;
    private SearchColumnDoubleField[] estimatedWork;
    private SearchColumnDoubleField[] estimatedWorkBaseline;
    private SearchColumnDoubleField[] estimatedWorkVariance;
    private SearchColumnDoubleField[] estimatedWorkVariancePercent;
    private SearchColumnSelectField[] externalId;
    private SearchColumnDateField[] finishByDate;
    private SearchColumnLongField[] id;
    private SearchColumnSelectField[] internalId;
    private SearchColumnBooleanField[] isMilestone;
    private SearchColumnBooleanField[] isSummaryTask;
    private SearchColumnDateField[] lastModifiedDate;
    private SearchColumnStringField[] message;
    private SearchColumnBooleanField[] nonBillableTask;
    private SearchColumnSelectField[] owner;
    private SearchColumnSelectField[] parent;
    private SearchColumnDoubleField[] percentWorkComplete;
    private SearchColumnDoubleField[] plannedWork;
    private SearchColumnDoubleField[] plannedWorkBaseline;
    private SearchColumnSelectField[] predecessor;
    private SearchColumnDoubleField[] predecessorLagDays;
    private SearchColumnStringField[] predecessors;
    private SearchColumnStringField[] predecessorType;
    private SearchColumnEnumSelectField[] priority;
    private SearchColumnDoubleField[] remainingWork;
    private SearchColumnDateField[] startDate;
    private SearchColumnDateField[] startDateBaseline;
    private SearchColumnDoubleField[] startDateVariance;
    private SearchColumnEnumSelectField[] status;
    private SearchColumnSelectField[] successor;
    private SearchColumnStringField[] successorType;
    private SearchColumnStringField[] title;
    private SearchColumnCustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(ProjectTaskSearchRowBasic.class, true);

    public ProjectTaskSearchRowBasic() {
    }

    public ProjectTaskSearchRowBasic(SearchColumnDoubleField[] actualWork, SearchColumnSelectField[] company, SearchColumnEnumSelectField[] constraintType, SearchColumnSelectField[] contact, SearchColumnDoubleField[] cost, SearchColumnDoubleField[] costBase, SearchColumnDoubleField[] costBaseBaseline, SearchColumnDoubleField[] costBaseline, SearchColumnDoubleField[] costBaseVariance, SearchColumnDoubleField[] costVariance, SearchColumnDoubleField[] costVariancePercent, SearchColumnDateField[] createdDate, SearchColumnDateField[] endDate, SearchColumnDateField[] endDateBaseline, SearchColumnDoubleField[] endDateVariance, SearchColumnDoubleField[] estimatedWork, SearchColumnDoubleField[] estimatedWorkBaseline, SearchColumnDoubleField[] estimatedWorkVariance, SearchColumnDoubleField[] estimatedWorkVariancePercent, SearchColumnSelectField[] externalId, SearchColumnDateField[] finishByDate, SearchColumnLongField[] id, SearchColumnSelectField[] internalId, SearchColumnBooleanField[] isMilestone, SearchColumnBooleanField[] isSummaryTask, SearchColumnDateField[] lastModifiedDate, SearchColumnStringField[] message, SearchColumnBooleanField[] nonBillableTask, SearchColumnSelectField[] owner, SearchColumnSelectField[] parent, SearchColumnDoubleField[] percentWorkComplete, SearchColumnDoubleField[] plannedWork, SearchColumnDoubleField[] plannedWorkBaseline, SearchColumnSelectField[] predecessor, SearchColumnDoubleField[] predecessorLagDays, SearchColumnStringField[] predecessors, SearchColumnStringField[] predecessorType, SearchColumnEnumSelectField[] priority, SearchColumnDoubleField[] remainingWork, SearchColumnDateField[] startDate, SearchColumnDateField[] startDateBaseline, SearchColumnDoubleField[] startDateVariance, SearchColumnEnumSelectField[] status, SearchColumnSelectField[] successor, SearchColumnStringField[] successorType, SearchColumnStringField[] title, SearchColumnCustomFieldList customFieldList) {
        this.actualWork = actualWork;
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
        this.finishByDate = finishByDate;
        this.id = id;
        this.internalId = internalId;
        this.isMilestone = isMilestone;
        this.isSummaryTask = isSummaryTask;
        this.lastModifiedDate = lastModifiedDate;
        this.message = message;
        this.nonBillableTask = nonBillableTask;
        this.owner = owner;
        this.parent = parent;
        this.percentWorkComplete = percentWorkComplete;
        this.plannedWork = plannedWork;
        this.plannedWorkBaseline = plannedWorkBaseline;
        this.predecessor = predecessor;
        this.predecessorLagDays = predecessorLagDays;
        this.predecessors = predecessors;
        this.predecessorType = predecessorType;
        this.priority = priority;
        this.remainingWork = remainingWork;
        this.startDate = startDate;
        this.startDateBaseline = startDateBaseline;
        this.startDateVariance = startDateVariance;
        this.status = status;
        this.successor = successor;
        this.successorType = successorType;
        this.title = title;
        this.customFieldList = customFieldList;
    }

    public SearchColumnDoubleField[] getActualWork() {
        return this.actualWork;
    }

    public void setActualWork(SearchColumnDoubleField[] actualWork) {
        this.actualWork = actualWork;
    }

    public SearchColumnDoubleField getActualWork(int i) {
        return this.actualWork[i];
    }

    public void setActualWork(int i, SearchColumnDoubleField _value) {
        this.actualWork[i] = _value;
    }

    public SearchColumnSelectField[] getCompany() {
        return this.company;
    }

    public void setCompany(SearchColumnSelectField[] company) {
        this.company = company;
    }

    public SearchColumnSelectField getCompany(int i) {
        return this.company[i];
    }

    public void setCompany(int i, SearchColumnSelectField _value) {
        this.company[i] = _value;
    }

    public SearchColumnEnumSelectField[] getConstraintType() {
        return this.constraintType;
    }

    public void setConstraintType(SearchColumnEnumSelectField[] constraintType) {
        this.constraintType = constraintType;
    }

    public SearchColumnEnumSelectField getConstraintType(int i) {
        return this.constraintType[i];
    }

    public void setConstraintType(int i, SearchColumnEnumSelectField _value) {
        this.constraintType[i] = _value;
    }

    public SearchColumnSelectField[] getContact() {
        return this.contact;
    }

    public void setContact(SearchColumnSelectField[] contact) {
        this.contact = contact;
    }

    public SearchColumnSelectField getContact(int i) {
        return this.contact[i];
    }

    public void setContact(int i, SearchColumnSelectField _value) {
        this.contact[i] = _value;
    }

    public SearchColumnDoubleField[] getCost() {
        return this.cost;
    }

    public void setCost(SearchColumnDoubleField[] cost) {
        this.cost = cost;
    }

    public SearchColumnDoubleField getCost(int i) {
        return this.cost[i];
    }

    public void setCost(int i, SearchColumnDoubleField _value) {
        this.cost[i] = _value;
    }

    public SearchColumnDoubleField[] getCostBase() {
        return this.costBase;
    }

    public void setCostBase(SearchColumnDoubleField[] costBase) {
        this.costBase = costBase;
    }

    public SearchColumnDoubleField getCostBase(int i) {
        return this.costBase[i];
    }

    public void setCostBase(int i, SearchColumnDoubleField _value) {
        this.costBase[i] = _value;
    }

    public SearchColumnDoubleField[] getCostBaseBaseline() {
        return this.costBaseBaseline;
    }

    public void setCostBaseBaseline(SearchColumnDoubleField[] costBaseBaseline) {
        this.costBaseBaseline = costBaseBaseline;
    }

    public SearchColumnDoubleField getCostBaseBaseline(int i) {
        return this.costBaseBaseline[i];
    }

    public void setCostBaseBaseline(int i, SearchColumnDoubleField _value) {
        this.costBaseBaseline[i] = _value;
    }

    public SearchColumnDoubleField[] getCostBaseline() {
        return this.costBaseline;
    }

    public void setCostBaseline(SearchColumnDoubleField[] costBaseline) {
        this.costBaseline = costBaseline;
    }

    public SearchColumnDoubleField getCostBaseline(int i) {
        return this.costBaseline[i];
    }

    public void setCostBaseline(int i, SearchColumnDoubleField _value) {
        this.costBaseline[i] = _value;
    }

    public SearchColumnDoubleField[] getCostBaseVariance() {
        return this.costBaseVariance;
    }

    public void setCostBaseVariance(SearchColumnDoubleField[] costBaseVariance) {
        this.costBaseVariance = costBaseVariance;
    }

    public SearchColumnDoubleField getCostBaseVariance(int i) {
        return this.costBaseVariance[i];
    }

    public void setCostBaseVariance(int i, SearchColumnDoubleField _value) {
        this.costBaseVariance[i] = _value;
    }

    public SearchColumnDoubleField[] getCostVariance() {
        return this.costVariance;
    }

    public void setCostVariance(SearchColumnDoubleField[] costVariance) {
        this.costVariance = costVariance;
    }

    public SearchColumnDoubleField getCostVariance(int i) {
        return this.costVariance[i];
    }

    public void setCostVariance(int i, SearchColumnDoubleField _value) {
        this.costVariance[i] = _value;
    }

    public SearchColumnDoubleField[] getCostVariancePercent() {
        return this.costVariancePercent;
    }

    public void setCostVariancePercent(SearchColumnDoubleField[] costVariancePercent) {
        this.costVariancePercent = costVariancePercent;
    }

    public SearchColumnDoubleField getCostVariancePercent(int i) {
        return this.costVariancePercent[i];
    }

    public void setCostVariancePercent(int i, SearchColumnDoubleField _value) {
        this.costVariancePercent[i] = _value;
    }

    public SearchColumnDateField[] getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(SearchColumnDateField[] createdDate) {
        this.createdDate = createdDate;
    }

    public SearchColumnDateField getCreatedDate(int i) {
        return this.createdDate[i];
    }

    public void setCreatedDate(int i, SearchColumnDateField _value) {
        this.createdDate[i] = _value;
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

    public SearchColumnDateField[] getEndDateBaseline() {
        return this.endDateBaseline;
    }

    public void setEndDateBaseline(SearchColumnDateField[] endDateBaseline) {
        this.endDateBaseline = endDateBaseline;
    }

    public SearchColumnDateField getEndDateBaseline(int i) {
        return this.endDateBaseline[i];
    }

    public void setEndDateBaseline(int i, SearchColumnDateField _value) {
        this.endDateBaseline[i] = _value;
    }

    public SearchColumnDoubleField[] getEndDateVariance() {
        return this.endDateVariance;
    }

    public void setEndDateVariance(SearchColumnDoubleField[] endDateVariance) {
        this.endDateVariance = endDateVariance;
    }

    public SearchColumnDoubleField getEndDateVariance(int i) {
        return this.endDateVariance[i];
    }

    public void setEndDateVariance(int i, SearchColumnDoubleField _value) {
        this.endDateVariance[i] = _value;
    }

    public SearchColumnDoubleField[] getEstimatedWork() {
        return this.estimatedWork;
    }

    public void setEstimatedWork(SearchColumnDoubleField[] estimatedWork) {
        this.estimatedWork = estimatedWork;
    }

    public SearchColumnDoubleField getEstimatedWork(int i) {
        return this.estimatedWork[i];
    }

    public void setEstimatedWork(int i, SearchColumnDoubleField _value) {
        this.estimatedWork[i] = _value;
    }

    public SearchColumnDoubleField[] getEstimatedWorkBaseline() {
        return this.estimatedWorkBaseline;
    }

    public void setEstimatedWorkBaseline(SearchColumnDoubleField[] estimatedWorkBaseline) {
        this.estimatedWorkBaseline = estimatedWorkBaseline;
    }

    public SearchColumnDoubleField getEstimatedWorkBaseline(int i) {
        return this.estimatedWorkBaseline[i];
    }

    public void setEstimatedWorkBaseline(int i, SearchColumnDoubleField _value) {
        this.estimatedWorkBaseline[i] = _value;
    }

    public SearchColumnDoubleField[] getEstimatedWorkVariance() {
        return this.estimatedWorkVariance;
    }

    public void setEstimatedWorkVariance(SearchColumnDoubleField[] estimatedWorkVariance) {
        this.estimatedWorkVariance = estimatedWorkVariance;
    }

    public SearchColumnDoubleField getEstimatedWorkVariance(int i) {
        return this.estimatedWorkVariance[i];
    }

    public void setEstimatedWorkVariance(int i, SearchColumnDoubleField _value) {
        this.estimatedWorkVariance[i] = _value;
    }

    public SearchColumnDoubleField[] getEstimatedWorkVariancePercent() {
        return this.estimatedWorkVariancePercent;
    }

    public void setEstimatedWorkVariancePercent(SearchColumnDoubleField[] estimatedWorkVariancePercent) {
        this.estimatedWorkVariancePercent = estimatedWorkVariancePercent;
    }

    public SearchColumnDoubleField getEstimatedWorkVariancePercent(int i) {
        return this.estimatedWorkVariancePercent[i];
    }

    public void setEstimatedWorkVariancePercent(int i, SearchColumnDoubleField _value) {
        this.estimatedWorkVariancePercent[i] = _value;
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

    public SearchColumnDateField[] getFinishByDate() {
        return this.finishByDate;
    }

    public void setFinishByDate(SearchColumnDateField[] finishByDate) {
        this.finishByDate = finishByDate;
    }

    public SearchColumnDateField getFinishByDate(int i) {
        return this.finishByDate[i];
    }

    public void setFinishByDate(int i, SearchColumnDateField _value) {
        this.finishByDate[i] = _value;
    }

    public SearchColumnLongField[] getId() {
        return this.id;
    }

    public void setId(SearchColumnLongField[] id) {
        this.id = id;
    }

    public SearchColumnLongField getId(int i) {
        return this.id[i];
    }

    public void setId(int i, SearchColumnLongField _value) {
        this.id[i] = _value;
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

    public SearchColumnBooleanField[] getIsMilestone() {
        return this.isMilestone;
    }

    public void setIsMilestone(SearchColumnBooleanField[] isMilestone) {
        this.isMilestone = isMilestone;
    }

    public SearchColumnBooleanField getIsMilestone(int i) {
        return this.isMilestone[i];
    }

    public void setIsMilestone(int i, SearchColumnBooleanField _value) {
        this.isMilestone[i] = _value;
    }

    public SearchColumnBooleanField[] getIsSummaryTask() {
        return this.isSummaryTask;
    }

    public void setIsSummaryTask(SearchColumnBooleanField[] isSummaryTask) {
        this.isSummaryTask = isSummaryTask;
    }

    public SearchColumnBooleanField getIsSummaryTask(int i) {
        return this.isSummaryTask[i];
    }

    public void setIsSummaryTask(int i, SearchColumnBooleanField _value) {
        this.isSummaryTask[i] = _value;
    }

    public SearchColumnDateField[] getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    public void setLastModifiedDate(SearchColumnDateField[] lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public SearchColumnDateField getLastModifiedDate(int i) {
        return this.lastModifiedDate[i];
    }

    public void setLastModifiedDate(int i, SearchColumnDateField _value) {
        this.lastModifiedDate[i] = _value;
    }

    public SearchColumnStringField[] getMessage() {
        return this.message;
    }

    public void setMessage(SearchColumnStringField[] message) {
        this.message = message;
    }

    public SearchColumnStringField getMessage(int i) {
        return this.message[i];
    }

    public void setMessage(int i, SearchColumnStringField _value) {
        this.message[i] = _value;
    }

    public SearchColumnBooleanField[] getNonBillableTask() {
        return this.nonBillableTask;
    }

    public void setNonBillableTask(SearchColumnBooleanField[] nonBillableTask) {
        this.nonBillableTask = nonBillableTask;
    }

    public SearchColumnBooleanField getNonBillableTask(int i) {
        return this.nonBillableTask[i];
    }

    public void setNonBillableTask(int i, SearchColumnBooleanField _value) {
        this.nonBillableTask[i] = _value;
    }

    public SearchColumnSelectField[] getOwner() {
        return this.owner;
    }

    public void setOwner(SearchColumnSelectField[] owner) {
        this.owner = owner;
    }

    public SearchColumnSelectField getOwner(int i) {
        return this.owner[i];
    }

    public void setOwner(int i, SearchColumnSelectField _value) {
        this.owner[i] = _value;
    }

    public SearchColumnSelectField[] getParent() {
        return this.parent;
    }

    public void setParent(SearchColumnSelectField[] parent) {
        this.parent = parent;
    }

    public SearchColumnSelectField getParent(int i) {
        return this.parent[i];
    }

    public void setParent(int i, SearchColumnSelectField _value) {
        this.parent[i] = _value;
    }

    public SearchColumnDoubleField[] getPercentWorkComplete() {
        return this.percentWorkComplete;
    }

    public void setPercentWorkComplete(SearchColumnDoubleField[] percentWorkComplete) {
        this.percentWorkComplete = percentWorkComplete;
    }

    public SearchColumnDoubleField getPercentWorkComplete(int i) {
        return this.percentWorkComplete[i];
    }

    public void setPercentWorkComplete(int i, SearchColumnDoubleField _value) {
        this.percentWorkComplete[i] = _value;
    }

    public SearchColumnDoubleField[] getPlannedWork() {
        return this.plannedWork;
    }

    public void setPlannedWork(SearchColumnDoubleField[] plannedWork) {
        this.plannedWork = plannedWork;
    }

    public SearchColumnDoubleField getPlannedWork(int i) {
        return this.plannedWork[i];
    }

    public void setPlannedWork(int i, SearchColumnDoubleField _value) {
        this.plannedWork[i] = _value;
    }

    public SearchColumnDoubleField[] getPlannedWorkBaseline() {
        return this.plannedWorkBaseline;
    }

    public void setPlannedWorkBaseline(SearchColumnDoubleField[] plannedWorkBaseline) {
        this.plannedWorkBaseline = plannedWorkBaseline;
    }

    public SearchColumnDoubleField getPlannedWorkBaseline(int i) {
        return this.plannedWorkBaseline[i];
    }

    public void setPlannedWorkBaseline(int i, SearchColumnDoubleField _value) {
        this.plannedWorkBaseline[i] = _value;
    }

    public SearchColumnSelectField[] getPredecessor() {
        return this.predecessor;
    }

    public void setPredecessor(SearchColumnSelectField[] predecessor) {
        this.predecessor = predecessor;
    }

    public SearchColumnSelectField getPredecessor(int i) {
        return this.predecessor[i];
    }

    public void setPredecessor(int i, SearchColumnSelectField _value) {
        this.predecessor[i] = _value;
    }

    public SearchColumnDoubleField[] getPredecessorLagDays() {
        return this.predecessorLagDays;
    }

    public void setPredecessorLagDays(SearchColumnDoubleField[] predecessorLagDays) {
        this.predecessorLagDays = predecessorLagDays;
    }

    public SearchColumnDoubleField getPredecessorLagDays(int i) {
        return this.predecessorLagDays[i];
    }

    public void setPredecessorLagDays(int i, SearchColumnDoubleField _value) {
        this.predecessorLagDays[i] = _value;
    }

    public SearchColumnStringField[] getPredecessors() {
        return this.predecessors;
    }

    public void setPredecessors(SearchColumnStringField[] predecessors) {
        this.predecessors = predecessors;
    }

    public SearchColumnStringField getPredecessors(int i) {
        return this.predecessors[i];
    }

    public void setPredecessors(int i, SearchColumnStringField _value) {
        this.predecessors[i] = _value;
    }

    public SearchColumnStringField[] getPredecessorType() {
        return this.predecessorType;
    }

    public void setPredecessorType(SearchColumnStringField[] predecessorType) {
        this.predecessorType = predecessorType;
    }

    public SearchColumnStringField getPredecessorType(int i) {
        return this.predecessorType[i];
    }

    public void setPredecessorType(int i, SearchColumnStringField _value) {
        this.predecessorType[i] = _value;
    }

    public SearchColumnEnumSelectField[] getPriority() {
        return this.priority;
    }

    public void setPriority(SearchColumnEnumSelectField[] priority) {
        this.priority = priority;
    }

    public SearchColumnEnumSelectField getPriority(int i) {
        return this.priority[i];
    }

    public void setPriority(int i, SearchColumnEnumSelectField _value) {
        this.priority[i] = _value;
    }

    public SearchColumnDoubleField[] getRemainingWork() {
        return this.remainingWork;
    }

    public void setRemainingWork(SearchColumnDoubleField[] remainingWork) {
        this.remainingWork = remainingWork;
    }

    public SearchColumnDoubleField getRemainingWork(int i) {
        return this.remainingWork[i];
    }

    public void setRemainingWork(int i, SearchColumnDoubleField _value) {
        this.remainingWork[i] = _value;
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

    public SearchColumnDateField[] getStartDateBaseline() {
        return this.startDateBaseline;
    }

    public void setStartDateBaseline(SearchColumnDateField[] startDateBaseline) {
        this.startDateBaseline = startDateBaseline;
    }

    public SearchColumnDateField getStartDateBaseline(int i) {
        return this.startDateBaseline[i];
    }

    public void setStartDateBaseline(int i, SearchColumnDateField _value) {
        this.startDateBaseline[i] = _value;
    }

    public SearchColumnDoubleField[] getStartDateVariance() {
        return this.startDateVariance;
    }

    public void setStartDateVariance(SearchColumnDoubleField[] startDateVariance) {
        this.startDateVariance = startDateVariance;
    }

    public SearchColumnDoubleField getStartDateVariance(int i) {
        return this.startDateVariance[i];
    }

    public void setStartDateVariance(int i, SearchColumnDoubleField _value) {
        this.startDateVariance[i] = _value;
    }

    public SearchColumnEnumSelectField[] getStatus() {
        return this.status;
    }

    public void setStatus(SearchColumnEnumSelectField[] status) {
        this.status = status;
    }

    public SearchColumnEnumSelectField getStatus(int i) {
        return this.status[i];
    }

    public void setStatus(int i, SearchColumnEnumSelectField _value) {
        this.status[i] = _value;
    }

    public SearchColumnSelectField[] getSuccessor() {
        return this.successor;
    }

    public void setSuccessor(SearchColumnSelectField[] successor) {
        this.successor = successor;
    }

    public SearchColumnSelectField getSuccessor(int i) {
        return this.successor[i];
    }

    public void setSuccessor(int i, SearchColumnSelectField _value) {
        this.successor[i] = _value;
    }

    public SearchColumnStringField[] getSuccessorType() {
        return this.successorType;
    }

    public void setSuccessorType(SearchColumnStringField[] successorType) {
        this.successorType = successorType;
    }

    public SearchColumnStringField getSuccessorType(int i) {
        return this.successorType[i];
    }

    public void setSuccessorType(int i, SearchColumnStringField _value) {
        this.successorType[i] = _value;
    }

    public SearchColumnStringField[] getTitle() {
        return this.title;
    }

    public void setTitle(SearchColumnStringField[] title) {
        this.title = title;
    }

    public SearchColumnStringField getTitle(int i) {
        return this.title[i];
    }

    public void setTitle(int i, SearchColumnStringField _value) {
        this.title[i] = _value;
    }

    public SearchColumnCustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ProjectTaskSearchRowBasic)) {
            return false;
        }
        ProjectTaskSearchRowBasic other = (ProjectTaskSearchRowBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.actualWork == null && other.getActualWork() == null || this.actualWork != null && Arrays.equals(this.actualWork, other.getActualWork())) && (this.company == null && other.getCompany() == null || this.company != null && Arrays.equals(this.company, other.getCompany())) && (this.constraintType == null && other.getConstraintType() == null || this.constraintType != null && Arrays.equals(this.constraintType, other.getConstraintType())) && (this.contact == null && other.getContact() == null || this.contact != null && Arrays.equals(this.contact, other.getContact())) && (this.cost == null && other.getCost() == null || this.cost != null && Arrays.equals(this.cost, other.getCost())) && (this.costBase == null && other.getCostBase() == null || this.costBase != null && Arrays.equals(this.costBase, other.getCostBase())) && (this.costBaseBaseline == null && other.getCostBaseBaseline() == null || this.costBaseBaseline != null && Arrays.equals(this.costBaseBaseline, other.getCostBaseBaseline())) && (this.costBaseline == null && other.getCostBaseline() == null || this.costBaseline != null && Arrays.equals(this.costBaseline, other.getCostBaseline())) && (this.costBaseVariance == null && other.getCostBaseVariance() == null || this.costBaseVariance != null && Arrays.equals(this.costBaseVariance, other.getCostBaseVariance())) && (this.costVariance == null && other.getCostVariance() == null || this.costVariance != null && Arrays.equals(this.costVariance, other.getCostVariance())) && (this.costVariancePercent == null && other.getCostVariancePercent() == null || this.costVariancePercent != null && Arrays.equals(this.costVariancePercent, other.getCostVariancePercent())) && (this.createdDate == null && other.getCreatedDate() == null || this.createdDate != null && Arrays.equals(this.createdDate, other.getCreatedDate())) && (this.endDate == null && other.getEndDate() == null || this.endDate != null && Arrays.equals(this.endDate, other.getEndDate())) && (this.endDateBaseline == null && other.getEndDateBaseline() == null || this.endDateBaseline != null && Arrays.equals(this.endDateBaseline, other.getEndDateBaseline())) && (this.endDateVariance == null && other.getEndDateVariance() == null || this.endDateVariance != null && Arrays.equals(this.endDateVariance, other.getEndDateVariance())) && (this.estimatedWork == null && other.getEstimatedWork() == null || this.estimatedWork != null && Arrays.equals(this.estimatedWork, other.getEstimatedWork())) && (this.estimatedWorkBaseline == null && other.getEstimatedWorkBaseline() == null || this.estimatedWorkBaseline != null && Arrays.equals(this.estimatedWorkBaseline, other.getEstimatedWorkBaseline())) && (this.estimatedWorkVariance == null && other.getEstimatedWorkVariance() == null || this.estimatedWorkVariance != null && Arrays.equals(this.estimatedWorkVariance, other.getEstimatedWorkVariance())) && (this.estimatedWorkVariancePercent == null && other.getEstimatedWorkVariancePercent() == null || this.estimatedWorkVariancePercent != null && Arrays.equals(this.estimatedWorkVariancePercent, other.getEstimatedWorkVariancePercent())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && Arrays.equals(this.externalId, other.getExternalId())) && (this.finishByDate == null && other.getFinishByDate() == null || this.finishByDate != null && Arrays.equals(this.finishByDate, other.getFinishByDate())) && (this.id == null && other.getId() == null || this.id != null && Arrays.equals(this.id, other.getId())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && Arrays.equals(this.internalId, other.getInternalId())) && (this.isMilestone == null && other.getIsMilestone() == null || this.isMilestone != null && Arrays.equals(this.isMilestone, other.getIsMilestone())) && (this.isSummaryTask == null && other.getIsSummaryTask() == null || this.isSummaryTask != null && Arrays.equals(this.isSummaryTask, other.getIsSummaryTask())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && Arrays.equals(this.lastModifiedDate, other.getLastModifiedDate())) && (this.message == null && other.getMessage() == null || this.message != null && Arrays.equals(this.message, other.getMessage())) && (this.nonBillableTask == null && other.getNonBillableTask() == null || this.nonBillableTask != null && Arrays.equals(this.nonBillableTask, other.getNonBillableTask())) && (this.owner == null && other.getOwner() == null || this.owner != null && Arrays.equals(this.owner, other.getOwner())) && (this.parent == null && other.getParent() == null || this.parent != null && Arrays.equals(this.parent, other.getParent())) && (this.percentWorkComplete == null && other.getPercentWorkComplete() == null || this.percentWorkComplete != null && Arrays.equals(this.percentWorkComplete, other.getPercentWorkComplete())) && (this.plannedWork == null && other.getPlannedWork() == null || this.plannedWork != null && Arrays.equals(this.plannedWork, other.getPlannedWork())) && (this.plannedWorkBaseline == null && other.getPlannedWorkBaseline() == null || this.plannedWorkBaseline != null && Arrays.equals(this.plannedWorkBaseline, other.getPlannedWorkBaseline())) && (this.predecessor == null && other.getPredecessor() == null || this.predecessor != null && Arrays.equals(this.predecessor, other.getPredecessor())) && (this.predecessorLagDays == null && other.getPredecessorLagDays() == null || this.predecessorLagDays != null && Arrays.equals(this.predecessorLagDays, other.getPredecessorLagDays())) && (this.predecessors == null && other.getPredecessors() == null || this.predecessors != null && Arrays.equals(this.predecessors, other.getPredecessors())) && (this.predecessorType == null && other.getPredecessorType() == null || this.predecessorType != null && Arrays.equals(this.predecessorType, other.getPredecessorType())) && (this.priority == null && other.getPriority() == null || this.priority != null && Arrays.equals(this.priority, other.getPriority())) && (this.remainingWork == null && other.getRemainingWork() == null || this.remainingWork != null && Arrays.equals(this.remainingWork, other.getRemainingWork())) && (this.startDate == null && other.getStartDate() == null || this.startDate != null && Arrays.equals(this.startDate, other.getStartDate())) && (this.startDateBaseline == null && other.getStartDateBaseline() == null || this.startDateBaseline != null && Arrays.equals(this.startDateBaseline, other.getStartDateBaseline())) && (this.startDateVariance == null && other.getStartDateVariance() == null || this.startDateVariance != null && Arrays.equals(this.startDateVariance, other.getStartDateVariance())) && (this.status == null && other.getStatus() == null || this.status != null && Arrays.equals(this.status, other.getStatus())) && (this.successor == null && other.getSuccessor() == null || this.successor != null && Arrays.equals(this.successor, other.getSuccessor())) && (this.successorType == null && other.getSuccessorType() == null || this.successorType != null && Arrays.equals(this.successorType, other.getSuccessorType())) && (this.title == null && other.getTitle() == null || this.title != null && Arrays.equals(this.title, other.getTitle())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
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
        if (this.getActualWork() != null) {
            for (i = 0; i < Array.getLength(this.getActualWork()); ++i) {
                obj = Array.get(this.getActualWork(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCompany() != null) {
            for (i = 0; i < Array.getLength(this.getCompany()); ++i) {
                obj = Array.get(this.getCompany(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getConstraintType() != null) {
            for (i = 0; i < Array.getLength(this.getConstraintType()); ++i) {
                obj = Array.get(this.getConstraintType(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getContact() != null) {
            for (i = 0; i < Array.getLength(this.getContact()); ++i) {
                obj = Array.get(this.getContact(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCost() != null) {
            for (i = 0; i < Array.getLength(this.getCost()); ++i) {
                obj = Array.get(this.getCost(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCostBase() != null) {
            for (i = 0; i < Array.getLength(this.getCostBase()); ++i) {
                obj = Array.get(this.getCostBase(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCostBaseBaseline() != null) {
            for (i = 0; i < Array.getLength(this.getCostBaseBaseline()); ++i) {
                obj = Array.get(this.getCostBaseBaseline(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCostBaseline() != null) {
            for (i = 0; i < Array.getLength(this.getCostBaseline()); ++i) {
                obj = Array.get(this.getCostBaseline(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCostBaseVariance() != null) {
            for (i = 0; i < Array.getLength(this.getCostBaseVariance()); ++i) {
                obj = Array.get(this.getCostBaseVariance(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCostVariance() != null) {
            for (i = 0; i < Array.getLength(this.getCostVariance()); ++i) {
                obj = Array.get(this.getCostVariance(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCostVariancePercent() != null) {
            for (i = 0; i < Array.getLength(this.getCostVariancePercent()); ++i) {
                obj = Array.get(this.getCostVariancePercent(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCreatedDate() != null) {
            for (i = 0; i < Array.getLength(this.getCreatedDate()); ++i) {
                obj = Array.get(this.getCreatedDate(), i);
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
        if (this.getEndDateBaseline() != null) {
            for (i = 0; i < Array.getLength(this.getEndDateBaseline()); ++i) {
                obj = Array.get(this.getEndDateBaseline(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getEndDateVariance() != null) {
            for (i = 0; i < Array.getLength(this.getEndDateVariance()); ++i) {
                obj = Array.get(this.getEndDateVariance(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getEstimatedWork() != null) {
            for (i = 0; i < Array.getLength(this.getEstimatedWork()); ++i) {
                obj = Array.get(this.getEstimatedWork(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getEstimatedWorkBaseline() != null) {
            for (i = 0; i < Array.getLength(this.getEstimatedWorkBaseline()); ++i) {
                obj = Array.get(this.getEstimatedWorkBaseline(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getEstimatedWorkVariance() != null) {
            for (i = 0; i < Array.getLength(this.getEstimatedWorkVariance()); ++i) {
                obj = Array.get(this.getEstimatedWorkVariance(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getEstimatedWorkVariancePercent() != null) {
            for (i = 0; i < Array.getLength(this.getEstimatedWorkVariancePercent()); ++i) {
                obj = Array.get(this.getEstimatedWorkVariancePercent(), i);
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
        if (this.getFinishByDate() != null) {
            for (i = 0; i < Array.getLength(this.getFinishByDate()); ++i) {
                obj = Array.get(this.getFinishByDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getId() != null) {
            for (i = 0; i < Array.getLength(this.getId()); ++i) {
                obj = Array.get(this.getId(), i);
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
        if (this.getIsMilestone() != null) {
            for (i = 0; i < Array.getLength(this.getIsMilestone()); ++i) {
                obj = Array.get(this.getIsMilestone(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsSummaryTask() != null) {
            for (i = 0; i < Array.getLength(this.getIsSummaryTask()); ++i) {
                obj = Array.get(this.getIsSummaryTask(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLastModifiedDate() != null) {
            for (i = 0; i < Array.getLength(this.getLastModifiedDate()); ++i) {
                obj = Array.get(this.getLastModifiedDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getMessage() != null) {
            for (i = 0; i < Array.getLength(this.getMessage()); ++i) {
                obj = Array.get(this.getMessage(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getNonBillableTask() != null) {
            for (i = 0; i < Array.getLength(this.getNonBillableTask()); ++i) {
                obj = Array.get(this.getNonBillableTask(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getOwner() != null) {
            for (i = 0; i < Array.getLength(this.getOwner()); ++i) {
                obj = Array.get(this.getOwner(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getParent() != null) {
            for (i = 0; i < Array.getLength(this.getParent()); ++i) {
                obj = Array.get(this.getParent(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPercentWorkComplete() != null) {
            for (i = 0; i < Array.getLength(this.getPercentWorkComplete()); ++i) {
                obj = Array.get(this.getPercentWorkComplete(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPlannedWork() != null) {
            for (i = 0; i < Array.getLength(this.getPlannedWork()); ++i) {
                obj = Array.get(this.getPlannedWork(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPlannedWorkBaseline() != null) {
            for (i = 0; i < Array.getLength(this.getPlannedWorkBaseline()); ++i) {
                obj = Array.get(this.getPlannedWorkBaseline(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPredecessor() != null) {
            for (i = 0; i < Array.getLength(this.getPredecessor()); ++i) {
                obj = Array.get(this.getPredecessor(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPredecessorLagDays() != null) {
            for (i = 0; i < Array.getLength(this.getPredecessorLagDays()); ++i) {
                obj = Array.get(this.getPredecessorLagDays(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPredecessors() != null) {
            for (i = 0; i < Array.getLength(this.getPredecessors()); ++i) {
                obj = Array.get(this.getPredecessors(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPredecessorType() != null) {
            for (i = 0; i < Array.getLength(this.getPredecessorType()); ++i) {
                obj = Array.get(this.getPredecessorType(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPriority() != null) {
            for (i = 0; i < Array.getLength(this.getPriority()); ++i) {
                obj = Array.get(this.getPriority(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRemainingWork() != null) {
            for (i = 0; i < Array.getLength(this.getRemainingWork()); ++i) {
                obj = Array.get(this.getRemainingWork(), i);
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
        if (this.getStartDateBaseline() != null) {
            for (i = 0; i < Array.getLength(this.getStartDateBaseline()); ++i) {
                obj = Array.get(this.getStartDateBaseline(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getStartDateVariance() != null) {
            for (i = 0; i < Array.getLength(this.getStartDateVariance()); ++i) {
                obj = Array.get(this.getStartDateVariance(), i);
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
        if (this.getSuccessor() != null) {
            for (i = 0; i < Array.getLength(this.getSuccessor()); ++i) {
                obj = Array.get(this.getSuccessor(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSuccessorType() != null) {
            for (i = 0; i < Array.getLength(this.getSuccessorType()); ++i) {
                obj = Array.get(this.getSuccessorType(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTitle() != null) {
            for (i = 0; i < Array.getLength(this.getTitle()); ++i) {
                obj = Array.get(this.getTitle(), i);
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ProjectTaskSearchRowBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("actualWork");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "actualWork"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("company");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "company"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("constraintType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "constraintType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("contact");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "contact"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("cost");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "cost"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("costBase");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "costBase"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("costBaseBaseline");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "costBaseBaseline"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("costBaseline");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "costBaseline"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("costBaseVariance");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "costBaseVariance"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("costVariance");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "costVariance"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("costVariancePercent");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "costVariancePercent"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
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
        elemField.setFieldName("endDateBaseline");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "endDateBaseline"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("endDateVariance");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "endDateVariance"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("estimatedWork");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "estimatedWork"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("estimatedWorkBaseline");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "estimatedWorkBaseline"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("estimatedWorkVariance");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "estimatedWorkVariance"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("estimatedWorkVariancePercent");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "estimatedWorkVariancePercent"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
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
        elemField.setFieldName("finishByDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "finishByDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "id"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
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
        elemField.setFieldName("isMilestone");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isMilestone"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isSummaryTask");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isSummaryTask"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "message"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("nonBillableTask");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "nonBillableTask"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "owner"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "parent"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("percentWorkComplete");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "percentWorkComplete"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("plannedWork");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "plannedWork"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("plannedWorkBaseline");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "plannedWorkBaseline"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("predecessor");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "predecessor"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("predecessorLagDays");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "predecessorLagDays"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("predecessors");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "predecessors"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("predecessorType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "predecessorType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "priority"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("remainingWork");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "remainingWork"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
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
        elemField.setFieldName("startDateBaseline");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "startDateBaseline"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("startDateVariance");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "startDateVariance"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "status"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("successor");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "successor"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("successorType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "successorType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "title"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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

