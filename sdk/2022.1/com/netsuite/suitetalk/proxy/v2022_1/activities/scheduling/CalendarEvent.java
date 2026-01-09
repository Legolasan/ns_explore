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

import com.netsuite.suitetalk.proxy.v2022_1.activities.scheduling.CalendarEventAttendeeList;
import com.netsuite.suitetalk.proxy.v2022_1.activities.scheduling.CalendarEventResourceList;
import com.netsuite.suitetalk.proxy.v2022_1.activities.scheduling.CalendarEventTimeItemList;
import com.netsuite.suitetalk.proxy.v2022_1.activities.scheduling.ExclusionDateList;
import com.netsuite.suitetalk.proxy.v2022_1.activities.scheduling.types.CalendarEventAccessLevel;
import com.netsuite.suitetalk.proxy.v2022_1.activities.scheduling.types.CalendarEventReminderMinutes;
import com.netsuite.suitetalk.proxy.v2022_1.activities.scheduling.types.CalendarEventReminderType;
import com.netsuite.suitetalk.proxy.v2022_1.activities.scheduling.types.CalendarEventStatus;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.RecurrenceDowMaskList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.types.RecurrenceDow;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.types.RecurrenceDowim;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.types.RecurrenceFrequency;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.CustomFieldList;
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

public class CalendarEvent
extends Record
implements Serializable {
    private RecordRef company;
    private RecordRef contact;
    private RecordRef supportCase;
    private RecordRef transaction;
    private Long period;
    private RecurrenceFrequency frequency;
    private RecurrenceDowMaskList recurrenceDowMaskList;
    private RecurrenceDow recurrenceDow;
    private RecurrenceDowim recurrenceDowim;
    private Calendar seriesStartDate;
    private Calendar endByDate;
    private Boolean noEndDate;
    private Boolean sendEmail;
    private RecordRef customForm;
    private String title;
    private String recurrence;
    private String location;
    private Calendar startDate;
    private Boolean allDayEvent;
    private Boolean timedEvent;
    private CalendarEventReminderType reminderType;
    private CalendarEventReminderMinutes reminderMinutes;
    private CalendarEventStatus status;
    private CalendarEventAccessLevel accessLevel;
    private RecordRef organizer;
    private String message;
    private Calendar createdDate;
    private Calendar endDate;
    private ExclusionDateList exclusionDateList;
    private Calendar lastModifiedDate;
    private RecordRef owner;
    private CalendarEventAttendeeList attendeeList;
    private CalendarEventResourceList resourceList;
    private CalendarEventTimeItemList timeItemList;
    private CustomFieldList customFieldList;
    private String internalId;
    private String externalId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(CalendarEvent.class, true);

    public CalendarEvent() {
    }

    public CalendarEvent(NullField nullFieldList, String internalId, String externalId, RecordRef company, RecordRef contact, RecordRef supportCase, RecordRef transaction, Long period, RecurrenceFrequency frequency, RecurrenceDowMaskList recurrenceDowMaskList, RecurrenceDow recurrenceDow, RecurrenceDowim recurrenceDowim, Calendar seriesStartDate, Calendar endByDate, Boolean noEndDate, Boolean sendEmail, RecordRef customForm, String title, String recurrence, String location, Calendar startDate, Boolean allDayEvent, Boolean timedEvent, CalendarEventReminderType reminderType, CalendarEventReminderMinutes reminderMinutes, CalendarEventStatus status, CalendarEventAccessLevel accessLevel, RecordRef organizer, String message, Calendar createdDate, Calendar endDate, ExclusionDateList exclusionDateList, Calendar lastModifiedDate, RecordRef owner, CalendarEventAttendeeList attendeeList, CalendarEventResourceList resourceList, CalendarEventTimeItemList timeItemList, CustomFieldList customFieldList) {
        super(nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.company = company;
        this.contact = contact;
        this.supportCase = supportCase;
        this.transaction = transaction;
        this.period = period;
        this.frequency = frequency;
        this.recurrenceDowMaskList = recurrenceDowMaskList;
        this.recurrenceDow = recurrenceDow;
        this.recurrenceDowim = recurrenceDowim;
        this.seriesStartDate = seriesStartDate;
        this.endByDate = endByDate;
        this.noEndDate = noEndDate;
        this.sendEmail = sendEmail;
        this.customForm = customForm;
        this.title = title;
        this.recurrence = recurrence;
        this.location = location;
        this.startDate = startDate;
        this.allDayEvent = allDayEvent;
        this.timedEvent = timedEvent;
        this.reminderType = reminderType;
        this.reminderMinutes = reminderMinutes;
        this.status = status;
        this.accessLevel = accessLevel;
        this.organizer = organizer;
        this.message = message;
        this.createdDate = createdDate;
        this.endDate = endDate;
        this.exclusionDateList = exclusionDateList;
        this.lastModifiedDate = lastModifiedDate;
        this.owner = owner;
        this.attendeeList = attendeeList;
        this.resourceList = resourceList;
        this.timeItemList = timeItemList;
        this.customFieldList = customFieldList;
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

    public RecordRef getSupportCase() {
        return this.supportCase;
    }

    public void setSupportCase(RecordRef supportCase) {
        this.supportCase = supportCase;
    }

    public RecordRef getTransaction() {
        return this.transaction;
    }

    public void setTransaction(RecordRef transaction) {
        this.transaction = transaction;
    }

    public Long getPeriod() {
        return this.period;
    }

    public void setPeriod(Long period) {
        this.period = period;
    }

    public RecurrenceFrequency getFrequency() {
        return this.frequency;
    }

    public void setFrequency(RecurrenceFrequency frequency) {
        this.frequency = frequency;
    }

    public RecurrenceDowMaskList getRecurrenceDowMaskList() {
        return this.recurrenceDowMaskList;
    }

    public void setRecurrenceDowMaskList(RecurrenceDowMaskList recurrenceDowMaskList) {
        this.recurrenceDowMaskList = recurrenceDowMaskList;
    }

    public RecurrenceDow getRecurrenceDow() {
        return this.recurrenceDow;
    }

    public void setRecurrenceDow(RecurrenceDow recurrenceDow) {
        this.recurrenceDow = recurrenceDow;
    }

    public RecurrenceDowim getRecurrenceDowim() {
        return this.recurrenceDowim;
    }

    public void setRecurrenceDowim(RecurrenceDowim recurrenceDowim) {
        this.recurrenceDowim = recurrenceDowim;
    }

    public Calendar getSeriesStartDate() {
        return this.seriesStartDate;
    }

    public void setSeriesStartDate(Calendar seriesStartDate) {
        this.seriesStartDate = seriesStartDate;
    }

    public Calendar getEndByDate() {
        return this.endByDate;
    }

    public void setEndByDate(Calendar endByDate) {
        this.endByDate = endByDate;
    }

    public Boolean getNoEndDate() {
        return this.noEndDate;
    }

    public void setNoEndDate(Boolean noEndDate) {
        this.noEndDate = noEndDate;
    }

    public Boolean getSendEmail() {
        return this.sendEmail;
    }

    public void setSendEmail(Boolean sendEmail) {
        this.sendEmail = sendEmail;
    }

    public RecordRef getCustomForm() {
        return this.customForm;
    }

    public void setCustomForm(RecordRef customForm) {
        this.customForm = customForm;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRecurrence() {
        return this.recurrence;
    }

    public void setRecurrence(String recurrence) {
        this.recurrence = recurrence;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Calendar getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Calendar startDate) {
        this.startDate = startDate;
    }

    public Boolean getAllDayEvent() {
        return this.allDayEvent;
    }

    public void setAllDayEvent(Boolean allDayEvent) {
        this.allDayEvent = allDayEvent;
    }

    public Boolean getTimedEvent() {
        return this.timedEvent;
    }

    public void setTimedEvent(Boolean timedEvent) {
        this.timedEvent = timedEvent;
    }

    public CalendarEventReminderType getReminderType() {
        return this.reminderType;
    }

    public void setReminderType(CalendarEventReminderType reminderType) {
        this.reminderType = reminderType;
    }

    public CalendarEventReminderMinutes getReminderMinutes() {
        return this.reminderMinutes;
    }

    public void setReminderMinutes(CalendarEventReminderMinutes reminderMinutes) {
        this.reminderMinutes = reminderMinutes;
    }

    public CalendarEventStatus getStatus() {
        return this.status;
    }

    public void setStatus(CalendarEventStatus status) {
        this.status = status;
    }

    public CalendarEventAccessLevel getAccessLevel() {
        return this.accessLevel;
    }

    public void setAccessLevel(CalendarEventAccessLevel accessLevel) {
        this.accessLevel = accessLevel;
    }

    public RecordRef getOrganizer() {
        return this.organizer;
    }

    public void setOrganizer(RecordRef organizer) {
        this.organizer = organizer;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Calendar getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(Calendar createdDate) {
        this.createdDate = createdDate;
    }

    public Calendar getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Calendar endDate) {
        this.endDate = endDate;
    }

    public ExclusionDateList getExclusionDateList() {
        return this.exclusionDateList;
    }

    public void setExclusionDateList(ExclusionDateList exclusionDateList) {
        this.exclusionDateList = exclusionDateList;
    }

    public Calendar getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    public void setLastModifiedDate(Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public RecordRef getOwner() {
        return this.owner;
    }

    public void setOwner(RecordRef owner) {
        this.owner = owner;
    }

    public CalendarEventAttendeeList getAttendeeList() {
        return this.attendeeList;
    }

    public void setAttendeeList(CalendarEventAttendeeList attendeeList) {
        this.attendeeList = attendeeList;
    }

    public CalendarEventResourceList getResourceList() {
        return this.resourceList;
    }

    public void setResourceList(CalendarEventResourceList resourceList) {
        this.resourceList = resourceList;
    }

    public CalendarEventTimeItemList getTimeItemList() {
        return this.timeItemList;
    }

    public void setTimeItemList(CalendarEventTimeItemList timeItemList) {
        this.timeItemList = timeItemList;
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
        if (!(obj instanceof CalendarEvent)) {
            return false;
        }
        CalendarEvent other = (CalendarEvent)obj;
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
        boolean _equals = super.equals(obj) && (this.company == null && other.getCompany() == null || this.company != null && this.company.equals(other.getCompany())) && (this.contact == null && other.getContact() == null || this.contact != null && this.contact.equals(other.getContact())) && (this.supportCase == null && other.getSupportCase() == null || this.supportCase != null && this.supportCase.equals(other.getSupportCase())) && (this.transaction == null && other.getTransaction() == null || this.transaction != null && this.transaction.equals(other.getTransaction())) && (this.period == null && other.getPeriod() == null || this.period != null && this.period.equals(other.getPeriod())) && (this.frequency == null && other.getFrequency() == null || this.frequency != null && this.frequency.equals(other.getFrequency())) && (this.recurrenceDowMaskList == null && other.getRecurrenceDowMaskList() == null || this.recurrenceDowMaskList != null && this.recurrenceDowMaskList.equals(other.getRecurrenceDowMaskList())) && (this.recurrenceDow == null && other.getRecurrenceDow() == null || this.recurrenceDow != null && this.recurrenceDow.equals(other.getRecurrenceDow())) && (this.recurrenceDowim == null && other.getRecurrenceDowim() == null || this.recurrenceDowim != null && this.recurrenceDowim.equals(other.getRecurrenceDowim())) && (this.seriesStartDate == null && other.getSeriesStartDate() == null || this.seriesStartDate != null && this.seriesStartDate.equals(other.getSeriesStartDate())) && (this.endByDate == null && other.getEndByDate() == null || this.endByDate != null && this.endByDate.equals(other.getEndByDate())) && (this.noEndDate == null && other.getNoEndDate() == null || this.noEndDate != null && this.noEndDate.equals(other.getNoEndDate())) && (this.sendEmail == null && other.getSendEmail() == null || this.sendEmail != null && this.sendEmail.equals(other.getSendEmail())) && (this.customForm == null && other.getCustomForm() == null || this.customForm != null && this.customForm.equals(other.getCustomForm())) && (this.title == null && other.getTitle() == null || this.title != null && this.title.equals(other.getTitle())) && (this.recurrence == null && other.getRecurrence() == null || this.recurrence != null && this.recurrence.equals(other.getRecurrence())) && (this.location == null && other.getLocation() == null || this.location != null && this.location.equals(other.getLocation())) && (this.startDate == null && other.getStartDate() == null || this.startDate != null && this.startDate.equals(other.getStartDate())) && (this.allDayEvent == null && other.getAllDayEvent() == null || this.allDayEvent != null && this.allDayEvent.equals(other.getAllDayEvent())) && (this.timedEvent == null && other.getTimedEvent() == null || this.timedEvent != null && this.timedEvent.equals(other.getTimedEvent())) && (this.reminderType == null && other.getReminderType() == null || this.reminderType != null && this.reminderType.equals(other.getReminderType())) && (this.reminderMinutes == null && other.getReminderMinutes() == null || this.reminderMinutes != null && this.reminderMinutes.equals(other.getReminderMinutes())) && (this.status == null && other.getStatus() == null || this.status != null && this.status.equals(other.getStatus())) && (this.accessLevel == null && other.getAccessLevel() == null || this.accessLevel != null && this.accessLevel.equals(other.getAccessLevel())) && (this.organizer == null && other.getOrganizer() == null || this.organizer != null && this.organizer.equals(other.getOrganizer())) && (this.message == null && other.getMessage() == null || this.message != null && this.message.equals(other.getMessage())) && (this.createdDate == null && other.getCreatedDate() == null || this.createdDate != null && this.createdDate.equals(other.getCreatedDate())) && (this.endDate == null && other.getEndDate() == null || this.endDate != null && this.endDate.equals(other.getEndDate())) && (this.exclusionDateList == null && other.getExclusionDateList() == null || this.exclusionDateList != null && this.exclusionDateList.equals(other.getExclusionDateList())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && this.lastModifiedDate.equals(other.getLastModifiedDate())) && (this.owner == null && other.getOwner() == null || this.owner != null && this.owner.equals(other.getOwner())) && (this.attendeeList == null && other.getAttendeeList() == null || this.attendeeList != null && this.attendeeList.equals(other.getAttendeeList())) && (this.resourceList == null && other.getResourceList() == null || this.resourceList != null && this.resourceList.equals(other.getResourceList())) && (this.timeItemList == null && other.getTimeItemList() == null || this.timeItemList != null && this.timeItemList.equals(other.getTimeItemList())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
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
        if (this.getCompany() != null) {
            _hashCode += this.getCompany().hashCode();
        }
        if (this.getContact() != null) {
            _hashCode += this.getContact().hashCode();
        }
        if (this.getSupportCase() != null) {
            _hashCode += this.getSupportCase().hashCode();
        }
        if (this.getTransaction() != null) {
            _hashCode += this.getTransaction().hashCode();
        }
        if (this.getPeriod() != null) {
            _hashCode += this.getPeriod().hashCode();
        }
        if (this.getFrequency() != null) {
            _hashCode += this.getFrequency().hashCode();
        }
        if (this.getRecurrenceDowMaskList() != null) {
            _hashCode += this.getRecurrenceDowMaskList().hashCode();
        }
        if (this.getRecurrenceDow() != null) {
            _hashCode += this.getRecurrenceDow().hashCode();
        }
        if (this.getRecurrenceDowim() != null) {
            _hashCode += this.getRecurrenceDowim().hashCode();
        }
        if (this.getSeriesStartDate() != null) {
            _hashCode += this.getSeriesStartDate().hashCode();
        }
        if (this.getEndByDate() != null) {
            _hashCode += this.getEndByDate().hashCode();
        }
        if (this.getNoEndDate() != null) {
            _hashCode += this.getNoEndDate().hashCode();
        }
        if (this.getSendEmail() != null) {
            _hashCode += this.getSendEmail().hashCode();
        }
        if (this.getCustomForm() != null) {
            _hashCode += this.getCustomForm().hashCode();
        }
        if (this.getTitle() != null) {
            _hashCode += this.getTitle().hashCode();
        }
        if (this.getRecurrence() != null) {
            _hashCode += this.getRecurrence().hashCode();
        }
        if (this.getLocation() != null) {
            _hashCode += this.getLocation().hashCode();
        }
        if (this.getStartDate() != null) {
            _hashCode += this.getStartDate().hashCode();
        }
        if (this.getAllDayEvent() != null) {
            _hashCode += this.getAllDayEvent().hashCode();
        }
        if (this.getTimedEvent() != null) {
            _hashCode += this.getTimedEvent().hashCode();
        }
        if (this.getReminderType() != null) {
            _hashCode += this.getReminderType().hashCode();
        }
        if (this.getReminderMinutes() != null) {
            _hashCode += this.getReminderMinutes().hashCode();
        }
        if (this.getStatus() != null) {
            _hashCode += this.getStatus().hashCode();
        }
        if (this.getAccessLevel() != null) {
            _hashCode += this.getAccessLevel().hashCode();
        }
        if (this.getOrganizer() != null) {
            _hashCode += this.getOrganizer().hashCode();
        }
        if (this.getMessage() != null) {
            _hashCode += this.getMessage().hashCode();
        }
        if (this.getCreatedDate() != null) {
            _hashCode += this.getCreatedDate().hashCode();
        }
        if (this.getEndDate() != null) {
            _hashCode += this.getEndDate().hashCode();
        }
        if (this.getExclusionDateList() != null) {
            _hashCode += this.getExclusionDateList().hashCode();
        }
        if (this.getLastModifiedDate() != null) {
            _hashCode += this.getLastModifiedDate().hashCode();
        }
        if (this.getOwner() != null) {
            _hashCode += this.getOwner().hashCode();
        }
        if (this.getAttendeeList() != null) {
            _hashCode += this.getAttendeeList().hashCode();
        }
        if (this.getResourceList() != null) {
            _hashCode += this.getResourceList().hashCode();
        }
        if (this.getTimeItemList() != null) {
            _hashCode += this.getTimeItemList().hashCode();
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
        typeDesc.setXmlType(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "CalendarEvent"));
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
        elemField.setFieldName("supportCase");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "supportCase"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("transaction");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "transaction"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("period");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "period"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("frequency");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "frequency"));
        elemField.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "RecurrenceFrequency"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recurrenceDowMaskList");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "recurrenceDowMaskList"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "RecurrenceDowMaskList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recurrenceDow");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "recurrenceDow"));
        elemField.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "RecurrenceDow"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recurrenceDowim");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "recurrenceDowim"));
        elemField.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "RecurrenceDowim"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("seriesStartDate");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "seriesStartDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("endByDate");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "endByDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("noEndDate");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "noEndDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("sendEmail");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "sendEmail"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customForm");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("recurrence");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "recurrence"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "location"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("allDayEvent");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "allDayEvent"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("timedEvent");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "timedEvent"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("reminderType");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "reminderType"));
        elemField.setXmlType(new QName("urn:types.scheduling_2022_1.activities.webservices.netsuite.com", "CalendarEventReminderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("reminderMinutes");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "reminderMinutes"));
        elemField.setXmlType(new QName("urn:types.scheduling_2022_1.activities.webservices.netsuite.com", "CalendarEventReminderMinutes"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "status"));
        elemField.setXmlType(new QName("urn:types.scheduling_2022_1.activities.webservices.netsuite.com", "CalendarEventStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("accessLevel");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "accessLevel"));
        elemField.setXmlType(new QName("urn:types.scheduling_2022_1.activities.webservices.netsuite.com", "CalendarEventAccessLevel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("organizer");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "organizer"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "createdDate"));
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
        elemField.setFieldName("exclusionDateList");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "exclusionDateList"));
        elemField.setXmlType(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "ExclusionDateList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("attendeeList");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "attendeeList"));
        elemField.setXmlType(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "CalendarEventAttendeeList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("resourceList");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "resourceList"));
        elemField.setXmlType(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "CalendarEventResourceList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("timeItemList");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "timeItemList"));
        elemField.setXmlType(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "CalendarEventTimeItemList"));
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

