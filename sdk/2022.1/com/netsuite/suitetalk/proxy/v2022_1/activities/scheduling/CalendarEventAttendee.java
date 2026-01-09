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
package com.netsuite.suitetalk.proxy.v2022_1.activities.scheduling;

import com.netsuite.suitetalk.proxy.v2022_1.activities.scheduling.types.CalendarEventAttendeeAttendance;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.types.CalendarEventAttendeeResponse;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class CalendarEventAttendee
implements Serializable {
    private Boolean sendEmail;
    private RecordRef attendee;
    private CalendarEventAttendeeResponse response;
    private CalendarEventAttendeeAttendance attendance;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(CalendarEventAttendee.class, true);

    public CalendarEventAttendee() {
    }

    public CalendarEventAttendee(Boolean sendEmail, RecordRef attendee, CalendarEventAttendeeResponse response, CalendarEventAttendeeAttendance attendance) {
        this.sendEmail = sendEmail;
        this.attendee = attendee;
        this.response = response;
        this.attendance = attendance;
    }

    public Boolean getSendEmail() {
        return this.sendEmail;
    }

    public void setSendEmail(Boolean sendEmail) {
        this.sendEmail = sendEmail;
    }

    public RecordRef getAttendee() {
        return this.attendee;
    }

    public void setAttendee(RecordRef attendee) {
        this.attendee = attendee;
    }

    public CalendarEventAttendeeResponse getResponse() {
        return this.response;
    }

    public void setResponse(CalendarEventAttendeeResponse response) {
        this.response = response;
    }

    public CalendarEventAttendeeAttendance getAttendance() {
        return this.attendance;
    }

    public void setAttendance(CalendarEventAttendeeAttendance attendance) {
        this.attendance = attendance;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CalendarEventAttendee)) {
            return false;
        }
        CalendarEventAttendee other = (CalendarEventAttendee)obj;
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
        boolean _equals = (this.sendEmail == null && other.getSendEmail() == null || this.sendEmail != null && this.sendEmail.equals(other.getSendEmail())) && (this.attendee == null && other.getAttendee() == null || this.attendee != null && this.attendee.equals(other.getAttendee())) && (this.response == null && other.getResponse() == null || this.response != null && this.response.equals(other.getResponse())) && (this.attendance == null && other.getAttendance() == null || this.attendance != null && this.attendance.equals(other.getAttendance()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getSendEmail() != null) {
            _hashCode += this.getSendEmail().hashCode();
        }
        if (this.getAttendee() != null) {
            _hashCode += this.getAttendee().hashCode();
        }
        if (this.getResponse() != null) {
            _hashCode += this.getResponse().hashCode();
        }
        if (this.getAttendance() != null) {
            _hashCode += this.getAttendance().hashCode();
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
        typeDesc.setXmlType(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "CalendarEventAttendee"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("sendEmail");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "sendEmail"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("attendee");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "attendee"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("response");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "response"));
        elemField.setXmlType(new QName("urn:types.core_2022_1.platform.webservices.netsuite.com", "CalendarEventAttendeeResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("attendance");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "attendance"));
        elemField.setXmlType(new QName("urn:types.scheduling_2022_1.activities.webservices.netsuite.com", "CalendarEventAttendeeAttendance"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

