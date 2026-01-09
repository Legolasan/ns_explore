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

public class CalendarEventSearchRowBasic
extends SearchRowBasic
implements Serializable {
    private SearchColumnEnumSelectField[] accessLevel;
    private SearchColumnSelectField[] attendee;
    private SearchColumnSelectField[] company;
    private SearchColumnDateField[] completedDate;
    private SearchColumnSelectField[] contact;
    private SearchColumnDateField[] createdDate;
    private SearchColumnStringField[] endTime;
    private SearchColumnSelectField[] externalId;
    private SearchColumnDateField[] instanceEnd;
    private SearchColumnDateField[] instanceStart;
    private SearchColumnSelectField[] internalId;
    private SearchColumnDateField[] lastModifiedDate;
    private SearchColumnStringField[] location;
    private SearchColumnStringField[] markdone;
    private SearchColumnStringField[] message;
    private SearchColumnSelectField[] organizer;
    private SearchColumnSelectField[] owner;
    private SearchColumnStringField[] recurrence;
    private SearchColumnSelectField[] resource;
    private SearchColumnEnumSelectField[] response;
    private SearchColumnStringField[] startDate;
    private SearchColumnStringField[] startTime;
    private SearchColumnEnumSelectField[] status;
    private SearchColumnStringField[] title;
    private SearchColumnSelectField[] transaction;
    private SearchColumnCustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(CalendarEventSearchRowBasic.class, true);

    public CalendarEventSearchRowBasic() {
    }

    public CalendarEventSearchRowBasic(SearchColumnEnumSelectField[] accessLevel, SearchColumnSelectField[] attendee, SearchColumnSelectField[] company, SearchColumnDateField[] completedDate, SearchColumnSelectField[] contact, SearchColumnDateField[] createdDate, SearchColumnStringField[] endTime, SearchColumnSelectField[] externalId, SearchColumnDateField[] instanceEnd, SearchColumnDateField[] instanceStart, SearchColumnSelectField[] internalId, SearchColumnDateField[] lastModifiedDate, SearchColumnStringField[] location, SearchColumnStringField[] markdone, SearchColumnStringField[] message, SearchColumnSelectField[] organizer, SearchColumnSelectField[] owner, SearchColumnStringField[] recurrence, SearchColumnSelectField[] resource, SearchColumnEnumSelectField[] response, SearchColumnStringField[] startDate, SearchColumnStringField[] startTime, SearchColumnEnumSelectField[] status, SearchColumnStringField[] title, SearchColumnSelectField[] transaction, SearchColumnCustomFieldList customFieldList) {
        this.accessLevel = accessLevel;
        this.attendee = attendee;
        this.company = company;
        this.completedDate = completedDate;
        this.contact = contact;
        this.createdDate = createdDate;
        this.endTime = endTime;
        this.externalId = externalId;
        this.instanceEnd = instanceEnd;
        this.instanceStart = instanceStart;
        this.internalId = internalId;
        this.lastModifiedDate = lastModifiedDate;
        this.location = location;
        this.markdone = markdone;
        this.message = message;
        this.organizer = organizer;
        this.owner = owner;
        this.recurrence = recurrence;
        this.resource = resource;
        this.response = response;
        this.startDate = startDate;
        this.startTime = startTime;
        this.status = status;
        this.title = title;
        this.transaction = transaction;
        this.customFieldList = customFieldList;
    }

    public SearchColumnEnumSelectField[] getAccessLevel() {
        return this.accessLevel;
    }

    public void setAccessLevel(SearchColumnEnumSelectField[] accessLevel) {
        this.accessLevel = accessLevel;
    }

    public SearchColumnEnumSelectField getAccessLevel(int i) {
        return this.accessLevel[i];
    }

    public void setAccessLevel(int i, SearchColumnEnumSelectField _value) {
        this.accessLevel[i] = _value;
    }

    public SearchColumnSelectField[] getAttendee() {
        return this.attendee;
    }

    public void setAttendee(SearchColumnSelectField[] attendee) {
        this.attendee = attendee;
    }

    public SearchColumnSelectField getAttendee(int i) {
        return this.attendee[i];
    }

    public void setAttendee(int i, SearchColumnSelectField _value) {
        this.attendee[i] = _value;
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

    public SearchColumnStringField[] getEndTime() {
        return this.endTime;
    }

    public void setEndTime(SearchColumnStringField[] endTime) {
        this.endTime = endTime;
    }

    public SearchColumnStringField getEndTime(int i) {
        return this.endTime[i];
    }

    public void setEndTime(int i, SearchColumnStringField _value) {
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

    public SearchColumnDateField[] getInstanceEnd() {
        return this.instanceEnd;
    }

    public void setInstanceEnd(SearchColumnDateField[] instanceEnd) {
        this.instanceEnd = instanceEnd;
    }

    public SearchColumnDateField getInstanceEnd(int i) {
        return this.instanceEnd[i];
    }

    public void setInstanceEnd(int i, SearchColumnDateField _value) {
        this.instanceEnd[i] = _value;
    }

    public SearchColumnDateField[] getInstanceStart() {
        return this.instanceStart;
    }

    public void setInstanceStart(SearchColumnDateField[] instanceStart) {
        this.instanceStart = instanceStart;
    }

    public SearchColumnDateField getInstanceStart(int i) {
        return this.instanceStart[i];
    }

    public void setInstanceStart(int i, SearchColumnDateField _value) {
        this.instanceStart[i] = _value;
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

    public SearchColumnStringField[] getLocation() {
        return this.location;
    }

    public void setLocation(SearchColumnStringField[] location) {
        this.location = location;
    }

    public SearchColumnStringField getLocation(int i) {
        return this.location[i];
    }

    public void setLocation(int i, SearchColumnStringField _value) {
        this.location[i] = _value;
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

    public SearchColumnSelectField[] getOrganizer() {
        return this.organizer;
    }

    public void setOrganizer(SearchColumnSelectField[] organizer) {
        this.organizer = organizer;
    }

    public SearchColumnSelectField getOrganizer(int i) {
        return this.organizer[i];
    }

    public void setOrganizer(int i, SearchColumnSelectField _value) {
        this.organizer[i] = _value;
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

    public SearchColumnStringField[] getRecurrence() {
        return this.recurrence;
    }

    public void setRecurrence(SearchColumnStringField[] recurrence) {
        this.recurrence = recurrence;
    }

    public SearchColumnStringField getRecurrence(int i) {
        return this.recurrence[i];
    }

    public void setRecurrence(int i, SearchColumnStringField _value) {
        this.recurrence[i] = _value;
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

    public SearchColumnEnumSelectField[] getResponse() {
        return this.response;
    }

    public void setResponse(SearchColumnEnumSelectField[] response) {
        this.response = response;
    }

    public SearchColumnEnumSelectField getResponse(int i) {
        return this.response[i];
    }

    public void setResponse(int i, SearchColumnEnumSelectField _value) {
        this.response[i] = _value;
    }

    public SearchColumnStringField[] getStartDate() {
        return this.startDate;
    }

    public void setStartDate(SearchColumnStringField[] startDate) {
        this.startDate = startDate;
    }

    public SearchColumnStringField getStartDate(int i) {
        return this.startDate[i];
    }

    public void setStartDate(int i, SearchColumnStringField _value) {
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
        if (!(obj instanceof CalendarEventSearchRowBasic)) {
            return false;
        }
        CalendarEventSearchRowBasic other = (CalendarEventSearchRowBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.accessLevel == null && other.getAccessLevel() == null || this.accessLevel != null && Arrays.equals(this.accessLevel, other.getAccessLevel())) && (this.attendee == null && other.getAttendee() == null || this.attendee != null && Arrays.equals(this.attendee, other.getAttendee())) && (this.company == null && other.getCompany() == null || this.company != null && Arrays.equals(this.company, other.getCompany())) && (this.completedDate == null && other.getCompletedDate() == null || this.completedDate != null && Arrays.equals(this.completedDate, other.getCompletedDate())) && (this.contact == null && other.getContact() == null || this.contact != null && Arrays.equals(this.contact, other.getContact())) && (this.createdDate == null && other.getCreatedDate() == null || this.createdDate != null && Arrays.equals(this.createdDate, other.getCreatedDate())) && (this.endTime == null && other.getEndTime() == null || this.endTime != null && Arrays.equals(this.endTime, other.getEndTime())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && Arrays.equals(this.externalId, other.getExternalId())) && (this.instanceEnd == null && other.getInstanceEnd() == null || this.instanceEnd != null && Arrays.equals(this.instanceEnd, other.getInstanceEnd())) && (this.instanceStart == null && other.getInstanceStart() == null || this.instanceStart != null && Arrays.equals(this.instanceStart, other.getInstanceStart())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && Arrays.equals(this.internalId, other.getInternalId())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && Arrays.equals(this.lastModifiedDate, other.getLastModifiedDate())) && (this.location == null && other.getLocation() == null || this.location != null && Arrays.equals(this.location, other.getLocation())) && (this.markdone == null && other.getMarkdone() == null || this.markdone != null && Arrays.equals(this.markdone, other.getMarkdone())) && (this.message == null && other.getMessage() == null || this.message != null && Arrays.equals(this.message, other.getMessage())) && (this.organizer == null && other.getOrganizer() == null || this.organizer != null && Arrays.equals(this.organizer, other.getOrganizer())) && (this.owner == null && other.getOwner() == null || this.owner != null && Arrays.equals(this.owner, other.getOwner())) && (this.recurrence == null && other.getRecurrence() == null || this.recurrence != null && Arrays.equals(this.recurrence, other.getRecurrence())) && (this.resource == null && other.getResource() == null || this.resource != null && Arrays.equals(this.resource, other.getResource())) && (this.response == null && other.getResponse() == null || this.response != null && Arrays.equals(this.response, other.getResponse())) && (this.startDate == null && other.getStartDate() == null || this.startDate != null && Arrays.equals(this.startDate, other.getStartDate())) && (this.startTime == null && other.getStartTime() == null || this.startTime != null && Arrays.equals(this.startTime, other.getStartTime())) && (this.status == null && other.getStatus() == null || this.status != null && Arrays.equals(this.status, other.getStatus())) && (this.title == null && other.getTitle() == null || this.title != null && Arrays.equals(this.title, other.getTitle())) && (this.transaction == null && other.getTransaction() == null || this.transaction != null && Arrays.equals(this.transaction, other.getTransaction())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
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
        if (this.getAttendee() != null) {
            for (i = 0; i < Array.getLength(this.getAttendee()); ++i) {
                obj = Array.get(this.getAttendee(), i);
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
        if (this.getInstanceEnd() != null) {
            for (i = 0; i < Array.getLength(this.getInstanceEnd()); ++i) {
                obj = Array.get(this.getInstanceEnd(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getInstanceStart() != null) {
            for (i = 0; i < Array.getLength(this.getInstanceStart()); ++i) {
                obj = Array.get(this.getInstanceStart(), i);
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
        if (this.getLastModifiedDate() != null) {
            for (i = 0; i < Array.getLength(this.getLastModifiedDate()); ++i) {
                obj = Array.get(this.getLastModifiedDate(), i);
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
        if (this.getOrganizer() != null) {
            for (i = 0; i < Array.getLength(this.getOrganizer()); ++i) {
                obj = Array.get(this.getOrganizer(), i);
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
        if (this.getRecurrence() != null) {
            for (i = 0; i < Array.getLength(this.getRecurrence()); ++i) {
                obj = Array.get(this.getRecurrence(), i);
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
        if (this.getResponse() != null) {
            for (i = 0; i < Array.getLength(this.getResponse()); ++i) {
                obj = Array.get(this.getResponse(), i);
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "CalendarEventSearchRowBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("accessLevel");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "accessLevel"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("attendee");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "attendee"));
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
        elemField.setFieldName("endTime");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "endTime"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("instanceEnd");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "instanceEnd"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("instanceStart");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "instanceStart"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
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
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "location"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("organizer");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "organizer"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("recurrence");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "recurrence"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("response");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "response"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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

