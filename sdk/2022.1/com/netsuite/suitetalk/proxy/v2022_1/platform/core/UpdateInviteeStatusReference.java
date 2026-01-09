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
package com.netsuite.suitetalk.proxy.v2022_1.platform.core;

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

public class UpdateInviteeStatusReference
implements Serializable {
    private RecordRef eventId;
    private CalendarEventAttendeeResponse responseCode;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(UpdateInviteeStatusReference.class, true);

    public UpdateInviteeStatusReference() {
    }

    public UpdateInviteeStatusReference(RecordRef eventId, CalendarEventAttendeeResponse responseCode) {
        this.eventId = eventId;
        this.responseCode = responseCode;
    }

    public RecordRef getEventId() {
        return this.eventId;
    }

    public void setEventId(RecordRef eventId) {
        this.eventId = eventId;
    }

    public CalendarEventAttendeeResponse getResponseCode() {
        return this.responseCode;
    }

    public void setResponseCode(CalendarEventAttendeeResponse responseCode) {
        this.responseCode = responseCode;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UpdateInviteeStatusReference)) {
            return false;
        }
        UpdateInviteeStatusReference other = (UpdateInviteeStatusReference)obj;
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
        boolean _equals = (this.eventId == null && other.getEventId() == null || this.eventId != null && this.eventId.equals(other.getEventId())) && (this.responseCode == null && other.getResponseCode() == null || this.responseCode != null && this.responseCode.equals(other.getResponseCode()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getEventId() != null) {
            _hashCode += this.getEventId().hashCode();
        }
        if (this.getResponseCode() != null) {
            _hashCode += this.getResponseCode().hashCode();
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
        typeDesc.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "UpdateInviteeStatusReference"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("eventId");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "eventId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("responseCode");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "responseCode"));
        elemField.setXmlType(new QName("urn:types.core_2022_1.platform.webservices.netsuite.com", "CalendarEventAttendeeResponse"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

