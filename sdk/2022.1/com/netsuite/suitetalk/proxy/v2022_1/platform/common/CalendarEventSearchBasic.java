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

public class CalendarEventSearchBasic
extends SearchRecordBasic
implements Serializable {
    private SearchEnumMultiSelectField accessLevel;
    private SearchMultiSelectField attendee;
    private SearchMultiSelectField calendar;
    private SearchDateField completedDate;
    private SearchDateField createdDate;
    private SearchMultiSelectField externalId;
    private SearchStringField externalIdString;
    private SearchDateField instanceStart;
    private SearchMultiSelectField internalId;
    private SearchLongField internalIdNumber;
    private SearchBooleanField isUpcomingEvent;
    private SearchDateField lastModifiedDate;
    private SearchStringField location;
    private SearchStringField message;
    private SearchMultiSelectField organizer;
    private SearchMultiSelectField owner;
    private SearchMultiSelectField resource;
    private SearchEnumMultiSelectField response;
    private SearchDateField startDate;
    private SearchEnumMultiSelectField status;
    private SearchStringField title;
    private SearchCustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(CalendarEventSearchBasic.class, true);

    public CalendarEventSearchBasic() {
    }

    public CalendarEventSearchBasic(SearchEnumMultiSelectField accessLevel, SearchMultiSelectField attendee, SearchMultiSelectField calendar, SearchDateField completedDate, SearchDateField createdDate, SearchMultiSelectField externalId, SearchStringField externalIdString, SearchDateField instanceStart, SearchMultiSelectField internalId, SearchLongField internalIdNumber, SearchBooleanField isUpcomingEvent, SearchDateField lastModifiedDate, SearchStringField location, SearchStringField message, SearchMultiSelectField organizer, SearchMultiSelectField owner, SearchMultiSelectField resource, SearchEnumMultiSelectField response, SearchDateField startDate, SearchEnumMultiSelectField status, SearchStringField title, SearchCustomFieldList customFieldList) {
        this.accessLevel = accessLevel;
        this.attendee = attendee;
        this.calendar = calendar;
        this.completedDate = completedDate;
        this.createdDate = createdDate;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.instanceStart = instanceStart;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isUpcomingEvent = isUpcomingEvent;
        this.lastModifiedDate = lastModifiedDate;
        this.location = location;
        this.message = message;
        this.organizer = organizer;
        this.owner = owner;
        this.resource = resource;
        this.response = response;
        this.startDate = startDate;
        this.status = status;
        this.title = title;
        this.customFieldList = customFieldList;
    }

    public SearchEnumMultiSelectField getAccessLevel() {
        return this.accessLevel;
    }

    public void setAccessLevel(SearchEnumMultiSelectField accessLevel) {
        this.accessLevel = accessLevel;
    }

    public SearchMultiSelectField getAttendee() {
        return this.attendee;
    }

    public void setAttendee(SearchMultiSelectField attendee) {
        this.attendee = attendee;
    }

    public SearchMultiSelectField getCalendar() {
        return this.calendar;
    }

    public void setCalendar(SearchMultiSelectField calendar) {
        this.calendar = calendar;
    }

    public SearchDateField getCompletedDate() {
        return this.completedDate;
    }

    public void setCompletedDate(SearchDateField completedDate) {
        this.completedDate = completedDate;
    }

    public SearchDateField getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(SearchDateField createdDate) {
        this.createdDate = createdDate;
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

    public SearchDateField getInstanceStart() {
        return this.instanceStart;
    }

    public void setInstanceStart(SearchDateField instanceStart) {
        this.instanceStart = instanceStart;
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

    public SearchBooleanField getIsUpcomingEvent() {
        return this.isUpcomingEvent;
    }

    public void setIsUpcomingEvent(SearchBooleanField isUpcomingEvent) {
        this.isUpcomingEvent = isUpcomingEvent;
    }

    public SearchDateField getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    public void setLastModifiedDate(SearchDateField lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public SearchStringField getLocation() {
        return this.location;
    }

    public void setLocation(SearchStringField location) {
        this.location = location;
    }

    public SearchStringField getMessage() {
        return this.message;
    }

    public void setMessage(SearchStringField message) {
        this.message = message;
    }

    public SearchMultiSelectField getOrganizer() {
        return this.organizer;
    }

    public void setOrganizer(SearchMultiSelectField organizer) {
        this.organizer = organizer;
    }

    public SearchMultiSelectField getOwner() {
        return this.owner;
    }

    public void setOwner(SearchMultiSelectField owner) {
        this.owner = owner;
    }

    public SearchMultiSelectField getResource() {
        return this.resource;
    }

    public void setResource(SearchMultiSelectField resource) {
        this.resource = resource;
    }

    public SearchEnumMultiSelectField getResponse() {
        return this.response;
    }

    public void setResponse(SearchEnumMultiSelectField response) {
        this.response = response;
    }

    public SearchDateField getStartDate() {
        return this.startDate;
    }

    public void setStartDate(SearchDateField startDate) {
        this.startDate = startDate;
    }

    public SearchEnumMultiSelectField getStatus() {
        return this.status;
    }

    public void setStatus(SearchEnumMultiSelectField status) {
        this.status = status;
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
        if (!(obj instanceof CalendarEventSearchBasic)) {
            return false;
        }
        CalendarEventSearchBasic other = (CalendarEventSearchBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.accessLevel == null && other.getAccessLevel() == null || this.accessLevel != null && this.accessLevel.equals(other.getAccessLevel())) && (this.attendee == null && other.getAttendee() == null || this.attendee != null && this.attendee.equals(other.getAttendee())) && (this.calendar == null && other.getCalendar() == null || this.calendar != null && this.calendar.equals(other.getCalendar())) && (this.completedDate == null && other.getCompletedDate() == null || this.completedDate != null && this.completedDate.equals(other.getCompletedDate())) && (this.createdDate == null && other.getCreatedDate() == null || this.createdDate != null && this.createdDate.equals(other.getCreatedDate())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId())) && (this.externalIdString == null && other.getExternalIdString() == null || this.externalIdString != null && this.externalIdString.equals(other.getExternalIdString())) && (this.instanceStart == null && other.getInstanceStart() == null || this.instanceStart != null && this.instanceStart.equals(other.getInstanceStart())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.internalIdNumber == null && other.getInternalIdNumber() == null || this.internalIdNumber != null && this.internalIdNumber.equals(other.getInternalIdNumber())) && (this.isUpcomingEvent == null && other.getIsUpcomingEvent() == null || this.isUpcomingEvent != null && this.isUpcomingEvent.equals(other.getIsUpcomingEvent())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && this.lastModifiedDate.equals(other.getLastModifiedDate())) && (this.location == null && other.getLocation() == null || this.location != null && this.location.equals(other.getLocation())) && (this.message == null && other.getMessage() == null || this.message != null && this.message.equals(other.getMessage())) && (this.organizer == null && other.getOrganizer() == null || this.organizer != null && this.organizer.equals(other.getOrganizer())) && (this.owner == null && other.getOwner() == null || this.owner != null && this.owner.equals(other.getOwner())) && (this.resource == null && other.getResource() == null || this.resource != null && this.resource.equals(other.getResource())) && (this.response == null && other.getResponse() == null || this.response != null && this.response.equals(other.getResponse())) && (this.startDate == null && other.getStartDate() == null || this.startDate != null && this.startDate.equals(other.getStartDate())) && (this.status == null && other.getStatus() == null || this.status != null && this.status.equals(other.getStatus())) && (this.title == null && other.getTitle() == null || this.title != null && this.title.equals(other.getTitle())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
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
        if (this.getAccessLevel() != null) {
            _hashCode += this.getAccessLevel().hashCode();
        }
        if (this.getAttendee() != null) {
            _hashCode += this.getAttendee().hashCode();
        }
        if (this.getCalendar() != null) {
            _hashCode += this.getCalendar().hashCode();
        }
        if (this.getCompletedDate() != null) {
            _hashCode += this.getCompletedDate().hashCode();
        }
        if (this.getCreatedDate() != null) {
            _hashCode += this.getCreatedDate().hashCode();
        }
        if (this.getExternalId() != null) {
            _hashCode += this.getExternalId().hashCode();
        }
        if (this.getExternalIdString() != null) {
            _hashCode += this.getExternalIdString().hashCode();
        }
        if (this.getInstanceStart() != null) {
            _hashCode += this.getInstanceStart().hashCode();
        }
        if (this.getInternalId() != null) {
            _hashCode += this.getInternalId().hashCode();
        }
        if (this.getInternalIdNumber() != null) {
            _hashCode += this.getInternalIdNumber().hashCode();
        }
        if (this.getIsUpcomingEvent() != null) {
            _hashCode += this.getIsUpcomingEvent().hashCode();
        }
        if (this.getLastModifiedDate() != null) {
            _hashCode += this.getLastModifiedDate().hashCode();
        }
        if (this.getLocation() != null) {
            _hashCode += this.getLocation().hashCode();
        }
        if (this.getMessage() != null) {
            _hashCode += this.getMessage().hashCode();
        }
        if (this.getOrganizer() != null) {
            _hashCode += this.getOrganizer().hashCode();
        }
        if (this.getOwner() != null) {
            _hashCode += this.getOwner().hashCode();
        }
        if (this.getResource() != null) {
            _hashCode += this.getResource().hashCode();
        }
        if (this.getResponse() != null) {
            _hashCode += this.getResponse().hashCode();
        }
        if (this.getStartDate() != null) {
            _hashCode += this.getStartDate().hashCode();
        }
        if (this.getStatus() != null) {
            _hashCode += this.getStatus().hashCode();
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "CalendarEventSearchBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("accessLevel");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "accessLevel"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("attendee");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "attendee"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("calendar");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "calendar"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("completedDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "completedDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
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
        elemField.setFieldName("instanceStart");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "instanceStart"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
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
        elemField.setFieldName("isUpcomingEvent");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isUpcomingEvent"));
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
        elemField.setFieldName("location");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "location"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "message"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("organizer");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "organizer"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("resource");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "resource"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("response");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "response"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
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
        elemField.setFieldName("status");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "status"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
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

