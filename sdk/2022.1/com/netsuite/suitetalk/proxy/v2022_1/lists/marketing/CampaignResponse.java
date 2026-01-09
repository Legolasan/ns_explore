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
package com.netsuite.suitetalk.proxy.v2022_1.lists.marketing;

import com.netsuite.suitetalk.proxy.v2022_1.lists.marketing.CampaignResponseResponsesList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.marketing.types.CampaignResponseResponse;
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

public class CampaignResponse
extends Record
implements Serializable {
    private RecordRef entity;
    private RecordRef leadSource;
    private RecordRef campaignEvent;
    private Calendar campaignResponseDate;
    private String channel;
    private CampaignResponseResponse response;
    private String note;
    private CampaignResponseResponsesList responsesList;
    private String internalId;
    private String externalId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(CampaignResponse.class, true);

    public CampaignResponse() {
    }

    public CampaignResponse(NullField nullFieldList, String internalId, String externalId, RecordRef entity, RecordRef leadSource, RecordRef campaignEvent, Calendar campaignResponseDate, String channel, CampaignResponseResponse response, String note, CampaignResponseResponsesList responsesList) {
        super(nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.entity = entity;
        this.leadSource = leadSource;
        this.campaignEvent = campaignEvent;
        this.campaignResponseDate = campaignResponseDate;
        this.channel = channel;
        this.response = response;
        this.note = note;
        this.responsesList = responsesList;
    }

    public RecordRef getEntity() {
        return this.entity;
    }

    public void setEntity(RecordRef entity) {
        this.entity = entity;
    }

    public RecordRef getLeadSource() {
        return this.leadSource;
    }

    public void setLeadSource(RecordRef leadSource) {
        this.leadSource = leadSource;
    }

    public RecordRef getCampaignEvent() {
        return this.campaignEvent;
    }

    public void setCampaignEvent(RecordRef campaignEvent) {
        this.campaignEvent = campaignEvent;
    }

    public Calendar getCampaignResponseDate() {
        return this.campaignResponseDate;
    }

    public void setCampaignResponseDate(Calendar campaignResponseDate) {
        this.campaignResponseDate = campaignResponseDate;
    }

    public String getChannel() {
        return this.channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public CampaignResponseResponse getResponse() {
        return this.response;
    }

    public void setResponse(CampaignResponseResponse response) {
        this.response = response;
    }

    public String getNote() {
        return this.note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public CampaignResponseResponsesList getResponsesList() {
        return this.responsesList;
    }

    public void setResponsesList(CampaignResponseResponsesList responsesList) {
        this.responsesList = responsesList;
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
        if (!(obj instanceof CampaignResponse)) {
            return false;
        }
        CampaignResponse other = (CampaignResponse)obj;
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
        boolean _equals = super.equals(obj) && (this.entity == null && other.getEntity() == null || this.entity != null && this.entity.equals(other.getEntity())) && (this.leadSource == null && other.getLeadSource() == null || this.leadSource != null && this.leadSource.equals(other.getLeadSource())) && (this.campaignEvent == null && other.getCampaignEvent() == null || this.campaignEvent != null && this.campaignEvent.equals(other.getCampaignEvent())) && (this.campaignResponseDate == null && other.getCampaignResponseDate() == null || this.campaignResponseDate != null && this.campaignResponseDate.equals(other.getCampaignResponseDate())) && (this.channel == null && other.getChannel() == null || this.channel != null && this.channel.equals(other.getChannel())) && (this.response == null && other.getResponse() == null || this.response != null && this.response.equals(other.getResponse())) && (this.note == null && other.getNote() == null || this.note != null && this.note.equals(other.getNote())) && (this.responsesList == null && other.getResponsesList() == null || this.responsesList != null && this.responsesList.equals(other.getResponsesList())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
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
        if (this.getEntity() != null) {
            _hashCode += this.getEntity().hashCode();
        }
        if (this.getLeadSource() != null) {
            _hashCode += this.getLeadSource().hashCode();
        }
        if (this.getCampaignEvent() != null) {
            _hashCode += this.getCampaignEvent().hashCode();
        }
        if (this.getCampaignResponseDate() != null) {
            _hashCode += this.getCampaignResponseDate().hashCode();
        }
        if (this.getChannel() != null) {
            _hashCode += this.getChannel().hashCode();
        }
        if (this.getResponse() != null) {
            _hashCode += this.getResponse().hashCode();
        }
        if (this.getNote() != null) {
            _hashCode += this.getNote().hashCode();
        }
        if (this.getResponsesList() != null) {
            _hashCode += this.getResponsesList().hashCode();
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
        typeDesc.setXmlType(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "CampaignResponse"));
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
        elemField.setFieldName("entity");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "entity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("leadSource");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "leadSource"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("campaignEvent");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "campaignEvent"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("campaignResponseDate");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "campaignResponseDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("channel");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "channel"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("response");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "response"));
        elemField.setXmlType(new QName("urn:types.marketing_2022_1.lists.webservices.netsuite.com", "CampaignResponseResponse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("note");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "note"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("responsesList");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "responsesList"));
        elemField.setXmlType(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "CampaignResponseResponsesList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

