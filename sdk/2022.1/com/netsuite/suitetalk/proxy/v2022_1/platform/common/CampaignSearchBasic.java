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

public class CampaignSearchBasic
extends SearchRecordBasic
implements Serializable {
    private SearchMultiSelectField audience;
    private SearchDoubleField baseCost;
    private SearchEnumMultiSelectField campaignEventType;
    private SearchStringField campaignId;
    private SearchMultiSelectField category;
    private SearchMultiSelectField channel;
    private SearchDoubleField cost;
    private SearchDateField createdDate;
    private SearchDateField endDate;
    private SearchStringField event;
    private SearchDoubleField expectedRevenue;
    private SearchMultiSelectField externalId;
    private SearchStringField externalIdString;
    private SearchMultiSelectField family;
    private SearchMultiSelectField group;
    private SearchMultiSelectField internalId;
    private SearchLongField internalIdNumber;
    private SearchBooleanField isInactive;
    private SearchBooleanField isSalesCampaign;
    private SearchMultiSelectField item;
    private SearchStringField keyword;
    private SearchDateField lastModifiedDate;
    private SearchMultiSelectField manager;
    private SearchMultiSelectField managerRole;
    private SearchLongField number;
    private SearchMultiSelectField offer;
    private SearchMultiSelectField promoCode;
    private SearchMultiSelectField recipient;
    private SearchEnumMultiSelectField response;
    private SearchEnumMultiSelectField responseCategory;
    private SearchLongField responseCode;
    private SearchStringField responseComments;
    private SearchDateField responseDate;
    private SearchDateField scheduleDate;
    private SearchMultiSelectField searchEngine;
    private SearchDateField startDate;
    private SearchEnumMultiSelectField status;
    private SearchMultiSelectField subscription;
    private SearchMultiSelectField template;
    private SearchStringField title;
    private SearchMultiSelectField vertical;
    private SearchCustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(CampaignSearchBasic.class, true);

    public CampaignSearchBasic() {
    }

    public CampaignSearchBasic(SearchMultiSelectField audience, SearchDoubleField baseCost, SearchEnumMultiSelectField campaignEventType, SearchStringField campaignId, SearchMultiSelectField category, SearchMultiSelectField channel, SearchDoubleField cost, SearchDateField createdDate, SearchDateField endDate, SearchStringField event, SearchDoubleField expectedRevenue, SearchMultiSelectField externalId, SearchStringField externalIdString, SearchMultiSelectField family, SearchMultiSelectField group, SearchMultiSelectField internalId, SearchLongField internalIdNumber, SearchBooleanField isInactive, SearchBooleanField isSalesCampaign, SearchMultiSelectField item, SearchStringField keyword, SearchDateField lastModifiedDate, SearchMultiSelectField manager, SearchMultiSelectField managerRole, SearchLongField number, SearchMultiSelectField offer, SearchMultiSelectField promoCode, SearchMultiSelectField recipient, SearchEnumMultiSelectField response, SearchEnumMultiSelectField responseCategory, SearchLongField responseCode, SearchStringField responseComments, SearchDateField responseDate, SearchDateField scheduleDate, SearchMultiSelectField searchEngine, SearchDateField startDate, SearchEnumMultiSelectField status, SearchMultiSelectField subscription, SearchMultiSelectField template, SearchStringField title, SearchMultiSelectField vertical, SearchCustomFieldList customFieldList) {
        this.audience = audience;
        this.baseCost = baseCost;
        this.campaignEventType = campaignEventType;
        this.campaignId = campaignId;
        this.category = category;
        this.channel = channel;
        this.cost = cost;
        this.createdDate = createdDate;
        this.endDate = endDate;
        this.event = event;
        this.expectedRevenue = expectedRevenue;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.family = family;
        this.group = group;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isInactive = isInactive;
        this.isSalesCampaign = isSalesCampaign;
        this.item = item;
        this.keyword = keyword;
        this.lastModifiedDate = lastModifiedDate;
        this.manager = manager;
        this.managerRole = managerRole;
        this.number = number;
        this.offer = offer;
        this.promoCode = promoCode;
        this.recipient = recipient;
        this.response = response;
        this.responseCategory = responseCategory;
        this.responseCode = responseCode;
        this.responseComments = responseComments;
        this.responseDate = responseDate;
        this.scheduleDate = scheduleDate;
        this.searchEngine = searchEngine;
        this.startDate = startDate;
        this.status = status;
        this.subscription = subscription;
        this.template = template;
        this.title = title;
        this.vertical = vertical;
        this.customFieldList = customFieldList;
    }

    public SearchMultiSelectField getAudience() {
        return this.audience;
    }

    public void setAudience(SearchMultiSelectField audience) {
        this.audience = audience;
    }

    public SearchDoubleField getBaseCost() {
        return this.baseCost;
    }

    public void setBaseCost(SearchDoubleField baseCost) {
        this.baseCost = baseCost;
    }

    public SearchEnumMultiSelectField getCampaignEventType() {
        return this.campaignEventType;
    }

    public void setCampaignEventType(SearchEnumMultiSelectField campaignEventType) {
        this.campaignEventType = campaignEventType;
    }

    public SearchStringField getCampaignId() {
        return this.campaignId;
    }

    public void setCampaignId(SearchStringField campaignId) {
        this.campaignId = campaignId;
    }

    public SearchMultiSelectField getCategory() {
        return this.category;
    }

    public void setCategory(SearchMultiSelectField category) {
        this.category = category;
    }

    public SearchMultiSelectField getChannel() {
        return this.channel;
    }

    public void setChannel(SearchMultiSelectField channel) {
        this.channel = channel;
    }

    public SearchDoubleField getCost() {
        return this.cost;
    }

    public void setCost(SearchDoubleField cost) {
        this.cost = cost;
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

    public SearchStringField getEvent() {
        return this.event;
    }

    public void setEvent(SearchStringField event) {
        this.event = event;
    }

    public SearchDoubleField getExpectedRevenue() {
        return this.expectedRevenue;
    }

    public void setExpectedRevenue(SearchDoubleField expectedRevenue) {
        this.expectedRevenue = expectedRevenue;
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

    public SearchMultiSelectField getFamily() {
        return this.family;
    }

    public void setFamily(SearchMultiSelectField family) {
        this.family = family;
    }

    public SearchMultiSelectField getGroup() {
        return this.group;
    }

    public void setGroup(SearchMultiSelectField group) {
        this.group = group;
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

    public SearchBooleanField getIsInactive() {
        return this.isInactive;
    }

    public void setIsInactive(SearchBooleanField isInactive) {
        this.isInactive = isInactive;
    }

    public SearchBooleanField getIsSalesCampaign() {
        return this.isSalesCampaign;
    }

    public void setIsSalesCampaign(SearchBooleanField isSalesCampaign) {
        this.isSalesCampaign = isSalesCampaign;
    }

    public SearchMultiSelectField getItem() {
        return this.item;
    }

    public void setItem(SearchMultiSelectField item) {
        this.item = item;
    }

    public SearchStringField getKeyword() {
        return this.keyword;
    }

    public void setKeyword(SearchStringField keyword) {
        this.keyword = keyword;
    }

    public SearchDateField getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    public void setLastModifiedDate(SearchDateField lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public SearchMultiSelectField getManager() {
        return this.manager;
    }

    public void setManager(SearchMultiSelectField manager) {
        this.manager = manager;
    }

    public SearchMultiSelectField getManagerRole() {
        return this.managerRole;
    }

    public void setManagerRole(SearchMultiSelectField managerRole) {
        this.managerRole = managerRole;
    }

    public SearchLongField getNumber() {
        return this.number;
    }

    public void setNumber(SearchLongField number) {
        this.number = number;
    }

    public SearchMultiSelectField getOffer() {
        return this.offer;
    }

    public void setOffer(SearchMultiSelectField offer) {
        this.offer = offer;
    }

    public SearchMultiSelectField getPromoCode() {
        return this.promoCode;
    }

    public void setPromoCode(SearchMultiSelectField promoCode) {
        this.promoCode = promoCode;
    }

    public SearchMultiSelectField getRecipient() {
        return this.recipient;
    }

    public void setRecipient(SearchMultiSelectField recipient) {
        this.recipient = recipient;
    }

    public SearchEnumMultiSelectField getResponse() {
        return this.response;
    }

    public void setResponse(SearchEnumMultiSelectField response) {
        this.response = response;
    }

    public SearchEnumMultiSelectField getResponseCategory() {
        return this.responseCategory;
    }

    public void setResponseCategory(SearchEnumMultiSelectField responseCategory) {
        this.responseCategory = responseCategory;
    }

    public SearchLongField getResponseCode() {
        return this.responseCode;
    }

    public void setResponseCode(SearchLongField responseCode) {
        this.responseCode = responseCode;
    }

    public SearchStringField getResponseComments() {
        return this.responseComments;
    }

    public void setResponseComments(SearchStringField responseComments) {
        this.responseComments = responseComments;
    }

    public SearchDateField getResponseDate() {
        return this.responseDate;
    }

    public void setResponseDate(SearchDateField responseDate) {
        this.responseDate = responseDate;
    }

    public SearchDateField getScheduleDate() {
        return this.scheduleDate;
    }

    public void setScheduleDate(SearchDateField scheduleDate) {
        this.scheduleDate = scheduleDate;
    }

    public SearchMultiSelectField getSearchEngine() {
        return this.searchEngine;
    }

    public void setSearchEngine(SearchMultiSelectField searchEngine) {
        this.searchEngine = searchEngine;
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

    public SearchMultiSelectField getSubscription() {
        return this.subscription;
    }

    public void setSubscription(SearchMultiSelectField subscription) {
        this.subscription = subscription;
    }

    public SearchMultiSelectField getTemplate() {
        return this.template;
    }

    public void setTemplate(SearchMultiSelectField template) {
        this.template = template;
    }

    public SearchStringField getTitle() {
        return this.title;
    }

    public void setTitle(SearchStringField title) {
        this.title = title;
    }

    public SearchMultiSelectField getVertical() {
        return this.vertical;
    }

    public void setVertical(SearchMultiSelectField vertical) {
        this.vertical = vertical;
    }

    public SearchCustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CampaignSearchBasic)) {
            return false;
        }
        CampaignSearchBasic other = (CampaignSearchBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.audience == null && other.getAudience() == null || this.audience != null && this.audience.equals(other.getAudience())) && (this.baseCost == null && other.getBaseCost() == null || this.baseCost != null && this.baseCost.equals(other.getBaseCost())) && (this.campaignEventType == null && other.getCampaignEventType() == null || this.campaignEventType != null && this.campaignEventType.equals(other.getCampaignEventType())) && (this.campaignId == null && other.getCampaignId() == null || this.campaignId != null && this.campaignId.equals(other.getCampaignId())) && (this.category == null && other.getCategory() == null || this.category != null && this.category.equals(other.getCategory())) && (this.channel == null && other.getChannel() == null || this.channel != null && this.channel.equals(other.getChannel())) && (this.cost == null && other.getCost() == null || this.cost != null && this.cost.equals(other.getCost())) && (this.createdDate == null && other.getCreatedDate() == null || this.createdDate != null && this.createdDate.equals(other.getCreatedDate())) && (this.endDate == null && other.getEndDate() == null || this.endDate != null && this.endDate.equals(other.getEndDate())) && (this.event == null && other.getEvent() == null || this.event != null && this.event.equals(other.getEvent())) && (this.expectedRevenue == null && other.getExpectedRevenue() == null || this.expectedRevenue != null && this.expectedRevenue.equals(other.getExpectedRevenue())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId())) && (this.externalIdString == null && other.getExternalIdString() == null || this.externalIdString != null && this.externalIdString.equals(other.getExternalIdString())) && (this.family == null && other.getFamily() == null || this.family != null && this.family.equals(other.getFamily())) && (this.group == null && other.getGroup() == null || this.group != null && this.group.equals(other.getGroup())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.internalIdNumber == null && other.getInternalIdNumber() == null || this.internalIdNumber != null && this.internalIdNumber.equals(other.getInternalIdNumber())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && this.isInactive.equals(other.getIsInactive())) && (this.isSalesCampaign == null && other.getIsSalesCampaign() == null || this.isSalesCampaign != null && this.isSalesCampaign.equals(other.getIsSalesCampaign())) && (this.item == null && other.getItem() == null || this.item != null && this.item.equals(other.getItem())) && (this.keyword == null && other.getKeyword() == null || this.keyword != null && this.keyword.equals(other.getKeyword())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && this.lastModifiedDate.equals(other.getLastModifiedDate())) && (this.manager == null && other.getManager() == null || this.manager != null && this.manager.equals(other.getManager())) && (this.managerRole == null && other.getManagerRole() == null || this.managerRole != null && this.managerRole.equals(other.getManagerRole())) && (this.number == null && other.getNumber() == null || this.number != null && this.number.equals(other.getNumber())) && (this.offer == null && other.getOffer() == null || this.offer != null && this.offer.equals(other.getOffer())) && (this.promoCode == null && other.getPromoCode() == null || this.promoCode != null && this.promoCode.equals(other.getPromoCode())) && (this.recipient == null && other.getRecipient() == null || this.recipient != null && this.recipient.equals(other.getRecipient())) && (this.response == null && other.getResponse() == null || this.response != null && this.response.equals(other.getResponse())) && (this.responseCategory == null && other.getResponseCategory() == null || this.responseCategory != null && this.responseCategory.equals(other.getResponseCategory())) && (this.responseCode == null && other.getResponseCode() == null || this.responseCode != null && this.responseCode.equals(other.getResponseCode())) && (this.responseComments == null && other.getResponseComments() == null || this.responseComments != null && this.responseComments.equals(other.getResponseComments())) && (this.responseDate == null && other.getResponseDate() == null || this.responseDate != null && this.responseDate.equals(other.getResponseDate())) && (this.scheduleDate == null && other.getScheduleDate() == null || this.scheduleDate != null && this.scheduleDate.equals(other.getScheduleDate())) && (this.searchEngine == null && other.getSearchEngine() == null || this.searchEngine != null && this.searchEngine.equals(other.getSearchEngine())) && (this.startDate == null && other.getStartDate() == null || this.startDate != null && this.startDate.equals(other.getStartDate())) && (this.status == null && other.getStatus() == null || this.status != null && this.status.equals(other.getStatus())) && (this.subscription == null && other.getSubscription() == null || this.subscription != null && this.subscription.equals(other.getSubscription())) && (this.template == null && other.getTemplate() == null || this.template != null && this.template.equals(other.getTemplate())) && (this.title == null && other.getTitle() == null || this.title != null && this.title.equals(other.getTitle())) && (this.vertical == null && other.getVertical() == null || this.vertical != null && this.vertical.equals(other.getVertical())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
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
        if (this.getAudience() != null) {
            _hashCode += this.getAudience().hashCode();
        }
        if (this.getBaseCost() != null) {
            _hashCode += this.getBaseCost().hashCode();
        }
        if (this.getCampaignEventType() != null) {
            _hashCode += this.getCampaignEventType().hashCode();
        }
        if (this.getCampaignId() != null) {
            _hashCode += this.getCampaignId().hashCode();
        }
        if (this.getCategory() != null) {
            _hashCode += this.getCategory().hashCode();
        }
        if (this.getChannel() != null) {
            _hashCode += this.getChannel().hashCode();
        }
        if (this.getCost() != null) {
            _hashCode += this.getCost().hashCode();
        }
        if (this.getCreatedDate() != null) {
            _hashCode += this.getCreatedDate().hashCode();
        }
        if (this.getEndDate() != null) {
            _hashCode += this.getEndDate().hashCode();
        }
        if (this.getEvent() != null) {
            _hashCode += this.getEvent().hashCode();
        }
        if (this.getExpectedRevenue() != null) {
            _hashCode += this.getExpectedRevenue().hashCode();
        }
        if (this.getExternalId() != null) {
            _hashCode += this.getExternalId().hashCode();
        }
        if (this.getExternalIdString() != null) {
            _hashCode += this.getExternalIdString().hashCode();
        }
        if (this.getFamily() != null) {
            _hashCode += this.getFamily().hashCode();
        }
        if (this.getGroup() != null) {
            _hashCode += this.getGroup().hashCode();
        }
        if (this.getInternalId() != null) {
            _hashCode += this.getInternalId().hashCode();
        }
        if (this.getInternalIdNumber() != null) {
            _hashCode += this.getInternalIdNumber().hashCode();
        }
        if (this.getIsInactive() != null) {
            _hashCode += this.getIsInactive().hashCode();
        }
        if (this.getIsSalesCampaign() != null) {
            _hashCode += this.getIsSalesCampaign().hashCode();
        }
        if (this.getItem() != null) {
            _hashCode += this.getItem().hashCode();
        }
        if (this.getKeyword() != null) {
            _hashCode += this.getKeyword().hashCode();
        }
        if (this.getLastModifiedDate() != null) {
            _hashCode += this.getLastModifiedDate().hashCode();
        }
        if (this.getManager() != null) {
            _hashCode += this.getManager().hashCode();
        }
        if (this.getManagerRole() != null) {
            _hashCode += this.getManagerRole().hashCode();
        }
        if (this.getNumber() != null) {
            _hashCode += this.getNumber().hashCode();
        }
        if (this.getOffer() != null) {
            _hashCode += this.getOffer().hashCode();
        }
        if (this.getPromoCode() != null) {
            _hashCode += this.getPromoCode().hashCode();
        }
        if (this.getRecipient() != null) {
            _hashCode += this.getRecipient().hashCode();
        }
        if (this.getResponse() != null) {
            _hashCode += this.getResponse().hashCode();
        }
        if (this.getResponseCategory() != null) {
            _hashCode += this.getResponseCategory().hashCode();
        }
        if (this.getResponseCode() != null) {
            _hashCode += this.getResponseCode().hashCode();
        }
        if (this.getResponseComments() != null) {
            _hashCode += this.getResponseComments().hashCode();
        }
        if (this.getResponseDate() != null) {
            _hashCode += this.getResponseDate().hashCode();
        }
        if (this.getScheduleDate() != null) {
            _hashCode += this.getScheduleDate().hashCode();
        }
        if (this.getSearchEngine() != null) {
            _hashCode += this.getSearchEngine().hashCode();
        }
        if (this.getStartDate() != null) {
            _hashCode += this.getStartDate().hashCode();
        }
        if (this.getStatus() != null) {
            _hashCode += this.getStatus().hashCode();
        }
        if (this.getSubscription() != null) {
            _hashCode += this.getSubscription().hashCode();
        }
        if (this.getTemplate() != null) {
            _hashCode += this.getTemplate().hashCode();
        }
        if (this.getTitle() != null) {
            _hashCode += this.getTitle().hashCode();
        }
        if (this.getVertical() != null) {
            _hashCode += this.getVertical().hashCode();
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "CampaignSearchBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("audience");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "audience"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("baseCost");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "baseCost"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("campaignEventType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "campaignEventType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("campaignId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "campaignId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "category"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("channel");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "channel"));
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
        elemField.setFieldName("event");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "event"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("expectedRevenue");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "expectedRevenue"));
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
        elemField.setFieldName("family");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "family"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("group");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "group"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isSalesCampaign");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isSalesCampaign"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("keyword");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "keyword"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
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
        elemField.setFieldName("manager");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "manager"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("managerRole");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "managerRole"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "number"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("offer");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "offer"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("promoCode");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "promoCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recipient");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "recipient"));
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
        elemField.setFieldName("responseCategory");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "responseCategory"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("responseCode");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "responseCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("responseComments");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "responseComments"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("responseDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "responseDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("scheduleDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "scheduleDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("searchEngine");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "searchEngine"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("subscription");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "subscription"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("template");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "template"));
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
        elemField.setFieldName("vertical");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "vertical"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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

