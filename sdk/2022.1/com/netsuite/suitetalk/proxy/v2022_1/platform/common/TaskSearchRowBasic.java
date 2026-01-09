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

public class TaskSearchRowBasic
extends SearchRowBasic
implements Serializable {
    private SearchColumnStringField[] accessLevel;
    private SearchColumnDoubleField[] actualTime;
    private SearchColumnSelectField[] assigned;
    private SearchColumnSelectField[] company;
    private SearchColumnDateField[] completedDate;
    private SearchColumnSelectField[] contact;
    private SearchColumnDateField[] createdDate;
    private SearchColumnDateField[] dueDate;
    private SearchColumnDoubleField[] estimatedTime;
    private SearchColumnDoubleField[] estimatedTimeOverride;
    private SearchColumnSelectField[] externalId;
    private SearchColumnSelectField[] internalId;
    private SearchColumnBooleanField[] isJobSummaryTask;
    private SearchColumnBooleanField[] isJobTask;
    private SearchColumnDateField[] lastModifiedDate;
    private SearchColumnStringField[] markdone;
    private SearchColumnStringField[] message;
    private SearchColumnSelectField[] milestone;
    private SearchColumnLongField[] order;
    private SearchColumnSelectField[] owner;
    private SearchColumnDoubleField[] percentComplete;
    private SearchColumnDoubleField[] percentTimeComplete;
    private SearchColumnEnumSelectField[] priority;
    private SearchColumnDateField[] startDate;
    private SearchColumnStringField[] startTime;
    private SearchColumnEnumSelectField[] status;
    private SearchColumnDoubleField[] timeRemaining;
    private SearchColumnStringField[] title;
    private SearchColumnSelectField[] transaction;
    private SearchColumnCustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(TaskSearchRowBasic.class, true);

    public TaskSearchRowBasic() {
    }

    public TaskSearchRowBasic(SearchColumnStringField[] accessLevel, SearchColumnDoubleField[] actualTime, SearchColumnSelectField[] assigned, SearchColumnSelectField[] company, SearchColumnDateField[] completedDate, SearchColumnSelectField[] contact, SearchColumnDateField[] createdDate, SearchColumnDateField[] dueDate, SearchColumnDoubleField[] estimatedTime, SearchColumnDoubleField[] estimatedTimeOverride, SearchColumnSelectField[] externalId, SearchColumnSelectField[] internalId, SearchColumnBooleanField[] isJobSummaryTask, SearchColumnBooleanField[] isJobTask, SearchColumnDateField[] lastModifiedDate, SearchColumnStringField[] markdone, SearchColumnStringField[] message, SearchColumnSelectField[] milestone, SearchColumnLongField[] order, SearchColumnSelectField[] owner, SearchColumnDoubleField[] percentComplete, SearchColumnDoubleField[] percentTimeComplete, SearchColumnEnumSelectField[] priority, SearchColumnDateField[] startDate, SearchColumnStringField[] startTime, SearchColumnEnumSelectField[] status, SearchColumnDoubleField[] timeRemaining, SearchColumnStringField[] title, SearchColumnSelectField[] transaction, SearchColumnCustomFieldList customFieldList) {
        this.accessLevel = accessLevel;
        this.actualTime = actualTime;
        this.assigned = assigned;
        this.company = company;
        this.completedDate = completedDate;
        this.contact = contact;
        this.createdDate = createdDate;
        this.dueDate = dueDate;
        this.estimatedTime = estimatedTime;
        this.estimatedTimeOverride = estimatedTimeOverride;
        this.externalId = externalId;
        this.internalId = internalId;
        this.isJobSummaryTask = isJobSummaryTask;
        this.isJobTask = isJobTask;
        this.lastModifiedDate = lastModifiedDate;
        this.markdone = markdone;
        this.message = message;
        this.milestone = milestone;
        this.order = order;
        this.owner = owner;
        this.percentComplete = percentComplete;
        this.percentTimeComplete = percentTimeComplete;
        this.priority = priority;
        this.startDate = startDate;
        this.startTime = startTime;
        this.status = status;
        this.timeRemaining = timeRemaining;
        this.title = title;
        this.transaction = transaction;
        this.customFieldList = customFieldList;
    }

    public SearchColumnStringField[] getAccessLevel() {
        return this.accessLevel;
    }

    public void setAccessLevel(SearchColumnStringField[] accessLevel) {
        this.accessLevel = accessLevel;
    }

    public SearchColumnStringField getAccessLevel(int i) {
        return this.accessLevel[i];
    }

    public void setAccessLevel(int i, SearchColumnStringField _value) {
        this.accessLevel[i] = _value;
    }

    public SearchColumnDoubleField[] getActualTime() {
        return this.actualTime;
    }

    public void setActualTime(SearchColumnDoubleField[] actualTime) {
        this.actualTime = actualTime;
    }

    public SearchColumnDoubleField getActualTime(int i) {
        return this.actualTime[i];
    }

    public void setActualTime(int i, SearchColumnDoubleField _value) {
        this.actualTime[i] = _value;
    }

    public SearchColumnSelectField[] getAssigned() {
        return this.assigned;
    }

    public void setAssigned(SearchColumnSelectField[] assigned) {
        this.assigned = assigned;
    }

    public SearchColumnSelectField getAssigned(int i) {
        return this.assigned[i];
    }

    public void setAssigned(int i, SearchColumnSelectField _value) {
        this.assigned[i] = _value;
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

    public SearchColumnDateField[] getCompletedDate() {
        return this.completedDate;
    }

    public void setCompletedDate(SearchColumnDateField[] completedDate) {
        this.completedDate = completedDate;
    }

    public SearchColumnDateField getCompletedDate(int i) {
        return this.completedDate[i];
    }

    public void setCompletedDate(int i, SearchColumnDateField _value) {
        this.completedDate[i] = _value;
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

    public SearchColumnDateField[] getDueDate() {
        return this.dueDate;
    }

    public void setDueDate(SearchColumnDateField[] dueDate) {
        this.dueDate = dueDate;
    }

    public SearchColumnDateField getDueDate(int i) {
        return this.dueDate[i];
    }

    public void setDueDate(int i, SearchColumnDateField _value) {
        this.dueDate[i] = _value;
    }

    public SearchColumnDoubleField[] getEstimatedTime() {
        return this.estimatedTime;
    }

    public void setEstimatedTime(SearchColumnDoubleField[] estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    public SearchColumnDoubleField getEstimatedTime(int i) {
        return this.estimatedTime[i];
    }

    public void setEstimatedTime(int i, SearchColumnDoubleField _value) {
        this.estimatedTime[i] = _value;
    }

    public SearchColumnDoubleField[] getEstimatedTimeOverride() {
        return this.estimatedTimeOverride;
    }

    public void setEstimatedTimeOverride(SearchColumnDoubleField[] estimatedTimeOverride) {
        this.estimatedTimeOverride = estimatedTimeOverride;
    }

    public SearchColumnDoubleField getEstimatedTimeOverride(int i) {
        return this.estimatedTimeOverride[i];
    }

    public void setEstimatedTimeOverride(int i, SearchColumnDoubleField _value) {
        this.estimatedTimeOverride[i] = _value;
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

    public SearchColumnBooleanField[] getIsJobSummaryTask() {
        return this.isJobSummaryTask;
    }

    public void setIsJobSummaryTask(SearchColumnBooleanField[] isJobSummaryTask) {
        this.isJobSummaryTask = isJobSummaryTask;
    }

    public SearchColumnBooleanField getIsJobSummaryTask(int i) {
        return this.isJobSummaryTask[i];
    }

    public void setIsJobSummaryTask(int i, SearchColumnBooleanField _value) {
        this.isJobSummaryTask[i] = _value;
    }

    public SearchColumnBooleanField[] getIsJobTask() {
        return this.isJobTask;
    }

    public void setIsJobTask(SearchColumnBooleanField[] isJobTask) {
        this.isJobTask = isJobTask;
    }

    public SearchColumnBooleanField getIsJobTask(int i) {
        return this.isJobTask[i];
    }

    public void setIsJobTask(int i, SearchColumnBooleanField _value) {
        this.isJobTask[i] = _value;
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

    public SearchColumnStringField[] getMarkdone() {
        return this.markdone;
    }

    public void setMarkdone(SearchColumnStringField[] markdone) {
        this.markdone = markdone;
    }

    public SearchColumnStringField getMarkdone(int i) {
        return this.markdone[i];
    }

    public void setMarkdone(int i, SearchColumnStringField _value) {
        this.markdone[i] = _value;
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

    public SearchColumnSelectField[] getMilestone() {
        return this.milestone;
    }

    public void setMilestone(SearchColumnSelectField[] milestone) {
        this.milestone = milestone;
    }

    public SearchColumnSelectField getMilestone(int i) {
        return this.milestone[i];
    }

    public void setMilestone(int i, SearchColumnSelectField _value) {
        this.milestone[i] = _value;
    }

    public SearchColumnLongField[] getOrder() {
        return this.order;
    }

    public void setOrder(SearchColumnLongField[] order) {
        this.order = order;
    }

    public SearchColumnLongField getOrder(int i) {
        return this.order[i];
    }

    public void setOrder(int i, SearchColumnLongField _value) {
        this.order[i] = _value;
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

    public SearchColumnDoubleField[] getPercentComplete() {
        return this.percentComplete;
    }

    public void setPercentComplete(SearchColumnDoubleField[] percentComplete) {
        this.percentComplete = percentComplete;
    }

    public SearchColumnDoubleField getPercentComplete(int i) {
        return this.percentComplete[i];
    }

    public void setPercentComplete(int i, SearchColumnDoubleField _value) {
        this.percentComplete[i] = _value;
    }

    public SearchColumnDoubleField[] getPercentTimeComplete() {
        return this.percentTimeComplete;
    }

    public void setPercentTimeComplete(SearchColumnDoubleField[] percentTimeComplete) {
        this.percentTimeComplete = percentTimeComplete;
    }

    public SearchColumnDoubleField getPercentTimeComplete(int i) {
        return this.percentTimeComplete[i];
    }

    public void setPercentTimeComplete(int i, SearchColumnDoubleField _value) {
        this.percentTimeComplete[i] = _value;
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

    public SearchColumnStringField[] getStartTime() {
        return this.startTime;
    }

    public void setStartTime(SearchColumnStringField[] startTime) {
        this.startTime = startTime;
    }

    public SearchColumnStringField getStartTime(int i) {
        return this.startTime[i];
    }

    public void setStartTime(int i, SearchColumnStringField _value) {
        this.startTime[i] = _value;
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

    public SearchColumnDoubleField[] getTimeRemaining() {
        return this.timeRemaining;
    }

    public void setTimeRemaining(SearchColumnDoubleField[] timeRemaining) {
        this.timeRemaining = timeRemaining;
    }

    public SearchColumnDoubleField getTimeRemaining(int i) {
        return this.timeRemaining[i];
    }

    public void setTimeRemaining(int i, SearchColumnDoubleField _value) {
        this.timeRemaining[i] = _value;
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

    public SearchColumnSelectField[] getTransaction() {
        return this.transaction;
    }

    public void setTransaction(SearchColumnSelectField[] transaction) {
        this.transaction = transaction;
    }

    public SearchColumnSelectField getTransaction(int i) {
        return this.transaction[i];
    }

    public void setTransaction(int i, SearchColumnSelectField _value) {
        this.transaction[i] = _value;
    }

    public SearchColumnCustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TaskSearchRowBasic)) {
            return false;
        }
        TaskSearchRowBasic other = (TaskSearchRowBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.accessLevel == null && other.getAccessLevel() == null || this.accessLevel != null && Arrays.equals(this.accessLevel, other.getAccessLevel())) && (this.actualTime == null && other.getActualTime() == null || this.actualTime != null && Arrays.equals(this.actualTime, other.getActualTime())) && (this.assigned == null && other.getAssigned() == null || this.assigned != null && Arrays.equals(this.assigned, other.getAssigned())) && (this.company == null && other.getCompany() == null || this.company != null && Arrays.equals(this.company, other.getCompany())) && (this.completedDate == null && other.getCompletedDate() == null || this.completedDate != null && Arrays.equals(this.completedDate, other.getCompletedDate())) && (this.contact == null && other.getContact() == null || this.contact != null && Arrays.equals(this.contact, other.getContact())) && (this.createdDate == null && other.getCreatedDate() == null || this.createdDate != null && Arrays.equals(this.createdDate, other.getCreatedDate())) && (this.dueDate == null && other.getDueDate() == null || this.dueDate != null && Arrays.equals(this.dueDate, other.getDueDate())) && (this.estimatedTime == null && other.getEstimatedTime() == null || this.estimatedTime != null && Arrays.equals(this.estimatedTime, other.getEstimatedTime())) && (this.estimatedTimeOverride == null && other.getEstimatedTimeOverride() == null || this.estimatedTimeOverride != null && Arrays.equals(this.estimatedTimeOverride, other.getEstimatedTimeOverride())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && Arrays.equals(this.externalId, other.getExternalId())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && Arrays.equals(this.internalId, other.getInternalId())) && (this.isJobSummaryTask == null && other.getIsJobSummaryTask() == null || this.isJobSummaryTask != null && Arrays.equals(this.isJobSummaryTask, other.getIsJobSummaryTask())) && (this.isJobTask == null && other.getIsJobTask() == null || this.isJobTask != null && Arrays.equals(this.isJobTask, other.getIsJobTask())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && Arrays.equals(this.lastModifiedDate, other.getLastModifiedDate())) && (this.markdone == null && other.getMarkdone() == null || this.markdone != null && Arrays.equals(this.markdone, other.getMarkdone())) && (this.message == null && other.getMessage() == null || this.message != null && Arrays.equals(this.message, other.getMessage())) && (this.milestone == null && other.getMilestone() == null || this.milestone != null && Arrays.equals(this.milestone, other.getMilestone())) && (this.order == null && other.getOrder() == null || this.order != null && Arrays.equals(this.order, other.getOrder())) && (this.owner == null && other.getOwner() == null || this.owner != null && Arrays.equals(this.owner, other.getOwner())) && (this.percentComplete == null && other.getPercentComplete() == null || this.percentComplete != null && Arrays.equals(this.percentComplete, other.getPercentComplete())) && (this.percentTimeComplete == null && other.getPercentTimeComplete() == null || this.percentTimeComplete != null && Arrays.equals(this.percentTimeComplete, other.getPercentTimeComplete())) && (this.priority == null && other.getPriority() == null || this.priority != null && Arrays.equals(this.priority, other.getPriority())) && (this.startDate == null && other.getStartDate() == null || this.startDate != null && Arrays.equals(this.startDate, other.getStartDate())) && (this.startTime == null && other.getStartTime() == null || this.startTime != null && Arrays.equals(this.startTime, other.getStartTime())) && (this.status == null && other.getStatus() == null || this.status != null && Arrays.equals(this.status, other.getStatus())) && (this.timeRemaining == null && other.getTimeRemaining() == null || this.timeRemaining != null && Arrays.equals(this.timeRemaining, other.getTimeRemaining())) && (this.title == null && other.getTitle() == null || this.title != null && Arrays.equals(this.title, other.getTitle())) && (this.transaction == null && other.getTransaction() == null || this.transaction != null && Arrays.equals(this.transaction, other.getTransaction())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
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
        if (this.getAccessLevel() != null) {
            for (i = 0; i < Array.getLength(this.getAccessLevel()); ++i) {
                obj = Array.get(this.getAccessLevel(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getActualTime() != null) {
            for (i = 0; i < Array.getLength(this.getActualTime()); ++i) {
                obj = Array.get(this.getActualTime(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAssigned() != null) {
            for (i = 0; i < Array.getLength(this.getAssigned()); ++i) {
                obj = Array.get(this.getAssigned(), i);
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
        if (this.getCompletedDate() != null) {
            for (i = 0; i < Array.getLength(this.getCompletedDate()); ++i) {
                obj = Array.get(this.getCompletedDate(), i);
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
        if (this.getCreatedDate() != null) {
            for (i = 0; i < Array.getLength(this.getCreatedDate()); ++i) {
                obj = Array.get(this.getCreatedDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDueDate() != null) {
            for (i = 0; i < Array.getLength(this.getDueDate()); ++i) {
                obj = Array.get(this.getDueDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getEstimatedTime() != null) {
            for (i = 0; i < Array.getLength(this.getEstimatedTime()); ++i) {
                obj = Array.get(this.getEstimatedTime(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getEstimatedTimeOverride() != null) {
            for (i = 0; i < Array.getLength(this.getEstimatedTimeOverride()); ++i) {
                obj = Array.get(this.getEstimatedTimeOverride(), i);
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
        if (this.getIsJobSummaryTask() != null) {
            for (i = 0; i < Array.getLength(this.getIsJobSummaryTask()); ++i) {
                obj = Array.get(this.getIsJobSummaryTask(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsJobTask() != null) {
            for (i = 0; i < Array.getLength(this.getIsJobTask()); ++i) {
                obj = Array.get(this.getIsJobTask(), i);
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
        if (this.getMarkdone() != null) {
            for (i = 0; i < Array.getLength(this.getMarkdone()); ++i) {
                obj = Array.get(this.getMarkdone(), i);
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
        if (this.getMilestone() != null) {
            for (i = 0; i < Array.getLength(this.getMilestone()); ++i) {
                obj = Array.get(this.getMilestone(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getOrder() != null) {
            for (i = 0; i < Array.getLength(this.getOrder()); ++i) {
                obj = Array.get(this.getOrder(), i);
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
        if (this.getPercentComplete() != null) {
            for (i = 0; i < Array.getLength(this.getPercentComplete()); ++i) {
                obj = Array.get(this.getPercentComplete(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPercentTimeComplete() != null) {
            for (i = 0; i < Array.getLength(this.getPercentTimeComplete()); ++i) {
                obj = Array.get(this.getPercentTimeComplete(), i);
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
        if (this.getStartDate() != null) {
            for (i = 0; i < Array.getLength(this.getStartDate()); ++i) {
                obj = Array.get(this.getStartDate(), i);
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
        if (this.getTimeRemaining() != null) {
            for (i = 0; i < Array.getLength(this.getTimeRemaining()); ++i) {
                obj = Array.get(this.getTimeRemaining(), i);
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
        if (this.getTransaction() != null) {
            for (i = 0; i < Array.getLength(this.getTransaction()); ++i) {
                obj = Array.get(this.getTransaction(), i);
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TaskSearchRowBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("accessLevel");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "accessLevel"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("actualTime");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "actualTime"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("assigned");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "assigned"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("completedDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "completedDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
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
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("dueDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "dueDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("estimatedTime");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "estimatedTime"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("estimatedTimeOverride");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "estimatedTimeOverride"));
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
        elemField.setFieldName("internalId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isJobSummaryTask");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isJobSummaryTask"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isJobTask");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isJobTask"));
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
        elemField.setFieldName("markdone");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "markdone"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("milestone");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "milestone"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("order");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "order"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
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
        elemField.setFieldName("percentComplete");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "percentComplete"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("percentTimeComplete");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "percentTimeComplete"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
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
        elemField.setFieldName("startDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "startTime"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("timeRemaining");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "timeRemaining"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
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
        elemField.setFieldName("transaction");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "transaction"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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

