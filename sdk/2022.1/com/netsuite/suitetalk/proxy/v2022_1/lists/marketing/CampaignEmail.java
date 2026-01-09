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
package com.netsuite.suitetalk.proxy.v2022_1.lists.marketing;

import com.netsuite.suitetalk.proxy.v2022_1.lists.marketing.types.CampaignCampaignEmailStatus;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.CustomFieldList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import java.io.Serializable;
import java.util.Calendar;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class CampaignEmail
implements Serializable {
    private String internalId;
    private RecordRef campaignGroup;
    private RecordRef template;
    private String description;
    private RecordRef subscription;
    private RecordRef channel;
    private Double cost;
    private CampaignCampaignEmailStatus status;
    private Calendar dateScheduled;
    private RecordRef promoCode;
    private CustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(CampaignEmail.class, true);

    public CampaignEmail() {
    }

    public CampaignEmail(String internalId, RecordRef campaignGroup, RecordRef template, String description, RecordRef subscription, RecordRef channel, Double cost, CampaignCampaignEmailStatus status, Calendar dateScheduled, RecordRef promoCode, CustomFieldList customFieldList) {
        this.internalId = internalId;
        this.campaignGroup = campaignGroup;
        this.template = template;
        this.description = description;
        this.subscription = subscription;
        this.channel = channel;
        this.cost = cost;
        this.status = status;
        this.dateScheduled = dateScheduled;
        this.promoCode = promoCode;
        this.customFieldList = customFieldList;
    }

    public String getInternalId() {
        return this.internalId;
    }

    public void setInternalId(String internalId) {
        this.internalId = internalId;
    }

    public RecordRef getCampaignGroup() {
        return this.campaignGroup;
    }

    public void setCampaignGroup(RecordRef campaignGroup) {
        this.campaignGroup = campaignGroup;
    }

    public RecordRef getTemplate() {
        return this.template;
    }

    public void setTemplate(RecordRef template) {
        this.template = template;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public RecordRef getSubscription() {
        return this.subscription;
    }

    public void setSubscription(RecordRef subscription) {
        this.subscription = subscription;
    }

    public RecordRef getChannel() {
        return this.channel;
    }

    public void setChannel(RecordRef channel) {
        this.channel = channel;
    }

    public Double getCost() {
        return this.cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public CampaignCampaignEmailStatus getStatus() {
        return this.status;
    }

    public void setStatus(CampaignCampaignEmailStatus status) {
        this.status = status;
    }

    public Calendar getDateScheduled() {
        return this.dateScheduled;
    }

    public void setDateScheduled(Calendar dateScheduled) {
        this.dateScheduled = dateScheduled;
    }

    public RecordRef getPromoCode() {
        return this.promoCode;
    }

    public void setPromoCode(RecordRef promoCode) {
        this.promoCode = promoCode;
    }

    public CustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CampaignEmail)) {
            return false;
        }
        CampaignEmail other = (CampaignEmail)obj;
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
        boolean _equals = (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.campaignGroup == null && other.getCampaignGroup() == null || this.campaignGroup != null && this.campaignGroup.equals(other.getCampaignGroup())) && (this.template == null && other.getTemplate() == null || this.template != null && this.template.equals(other.getTemplate())) && (this.description == null && other.getDescription() == null || this.description != null && this.description.equals(other.getDescription())) && (this.subscription == null && other.getSubscription() == null || this.subscription != null && this.subscription.equals(other.getSubscription())) && (this.channel == null && other.getChannel() == null || this.channel != null && this.channel.equals(other.getChannel())) && (this.cost == null && other.getCost() == null || this.cost != null && this.cost.equals(other.getCost())) && (this.status == null && other.getStatus() == null || this.status != null && this.status.equals(other.getStatus())) && (this.dateScheduled == null && other.getDateScheduled() == null || this.dateScheduled != null && this.dateScheduled.equals(other.getDateScheduled())) && (this.promoCode == null && other.getPromoCode() == null || this.promoCode != null && this.promoCode.equals(other.getPromoCode())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getInternalId() != null) {
            _hashCode += this.getInternalId().hashCode();
        }
        if (this.getCampaignGroup() != null) {
            _hashCode += this.getCampaignGroup().hashCode();
        }
        if (this.getTemplate() != null) {
            _hashCode += this.getTemplate().hashCode();
        }
        if (this.getDescription() != null) {
            _hashCode += this.getDescription().hashCode();
        }
        if (this.getSubscription() != null) {
            _hashCode += this.getSubscription().hashCode();
        }
        if (this.getChannel() != null) {
            _hashCode += this.getChannel().hashCode();
        }
        if (this.getCost() != null) {
            _hashCode += this.getCost().hashCode();
        }
        if (this.getStatus() != null) {
            _hashCode += this.getStatus().hashCode();
        }
        if (this.getDateScheduled() != null) {
            _hashCode += this.getDateScheduled().hashCode();
        }
        if (this.getPromoCode() != null) {
            _hashCode += this.getPromoCode().hashCode();
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
        typeDesc.setXmlType(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "CampaignEmail"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("campaignGroup");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "campaignGroup"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("template");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "template"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "description"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subscription");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "subscription"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("channel");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "channel"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("cost");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "cost"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "status"));
        elemField.setXmlType(new QName("urn:types.marketing_2022_1.lists.webservices.netsuite.com", "CampaignCampaignEmailStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("dateScheduled");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "dateScheduled"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("promoCode");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "promoCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "CustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

