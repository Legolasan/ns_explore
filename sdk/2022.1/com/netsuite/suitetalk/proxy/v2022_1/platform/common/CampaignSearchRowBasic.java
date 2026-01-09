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

public class CampaignSearchRowBasic
extends SearchRowBasic
implements Serializable {
    private SearchColumnSelectField[] audience;
    private SearchColumnDoubleField[] baseCost;
    private SearchColumnStringField[] campaignId;
    private SearchColumnSelectField[] category;
    private SearchColumnSelectField[] channel;
    private SearchColumnDoubleField[] cost;
    private SearchColumnDateField[] createdDate;
    private SearchColumnDateField[] endDate;
    private SearchColumnStringField[] event;
    private SearchColumnDateField[] executedDate;
    private SearchColumnDoubleField[] expectedRevenue;
    private SearchColumnSelectField[] externalId;
    private SearchColumnSelectField[] family;
    private SearchColumnSelectField[] internalId;
    private SearchColumnBooleanField[] isInactive;
    private SearchColumnBooleanField[] isSalesCampaign;
    private SearchColumnSelectField[] item;
    private SearchColumnStringField[] keyword;
    private SearchColumnDateField[] lastModifiedDate;
    private SearchColumnSelectField[] managerRole;
    private SearchColumnStringField[] message;
    private SearchColumnSelectField[] offer;
    private SearchColumnSelectField[] owner;
    private SearchColumnStringField[] promoCode;
    private SearchColumnSelectField[] recipient;
    private SearchColumnEnumSelectField[] response;
    private SearchColumnEnumSelectField[] responseCategory;
    private SearchColumnLongField[] responseCode;
    private SearchColumnDateField[] responseDate;
    private SearchColumnStringField[] responseNotes;
    private SearchColumnDoubleField[] revenue;
    private SearchColumnDoubleField[] roi;
    private SearchColumnDateField[] scheduledDate;
    private SearchColumnSelectField[] searchEngine;
    private SearchColumnDateField[] startDate;
    private SearchColumnEnumSelectField[] status;
    private SearchColumnSelectField[] subscription;
    private SearchColumnStringField[] title;
    private SearchColumnStringField[] url;
    private SearchColumnSelectField[] vertical;
    private SearchColumnCustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(CampaignSearchRowBasic.class, true);

    public CampaignSearchRowBasic() {
    }

    public CampaignSearchRowBasic(SearchColumnSelectField[] audience, SearchColumnDoubleField[] baseCost, SearchColumnStringField[] campaignId, SearchColumnSelectField[] category, SearchColumnSelectField[] channel, SearchColumnDoubleField[] cost, SearchColumnDateField[] createdDate, SearchColumnDateField[] endDate, SearchColumnStringField[] event, SearchColumnDateField[] executedDate, SearchColumnDoubleField[] expectedRevenue, SearchColumnSelectField[] externalId, SearchColumnSelectField[] family, SearchColumnSelectField[] internalId, SearchColumnBooleanField[] isInactive, SearchColumnBooleanField[] isSalesCampaign, SearchColumnSelectField[] item, SearchColumnStringField[] keyword, SearchColumnDateField[] lastModifiedDate, SearchColumnSelectField[] managerRole, SearchColumnStringField[] message, SearchColumnSelectField[] offer, SearchColumnSelectField[] owner, SearchColumnStringField[] promoCode, SearchColumnSelectField[] recipient, SearchColumnEnumSelectField[] response, SearchColumnEnumSelectField[] responseCategory, SearchColumnLongField[] responseCode, SearchColumnDateField[] responseDate, SearchColumnStringField[] responseNotes, SearchColumnDoubleField[] revenue, SearchColumnDoubleField[] roi, SearchColumnDateField[] scheduledDate, SearchColumnSelectField[] searchEngine, SearchColumnDateField[] startDate, SearchColumnEnumSelectField[] status, SearchColumnSelectField[] subscription, SearchColumnStringField[] title, SearchColumnStringField[] url, SearchColumnSelectField[] vertical, SearchColumnCustomFieldList customFieldList) {
        this.audience = audience;
        this.baseCost = baseCost;
        this.campaignId = campaignId;
        this.category = category;
        this.channel = channel;
        this.cost = cost;
        this.createdDate = createdDate;
        this.endDate = endDate;
        this.event = event;
        this.executedDate = executedDate;
        this.expectedRevenue = expectedRevenue;
        this.externalId = externalId;
        this.family = family;
        this.internalId = internalId;
        this.isInactive = isInactive;
        this.isSalesCampaign = isSalesCampaign;
        this.item = item;
        this.keyword = keyword;
        this.lastModifiedDate = lastModifiedDate;
        this.managerRole = managerRole;
        this.message = message;
        this.offer = offer;
        this.owner = owner;
        this.promoCode = promoCode;
        this.recipient = recipient;
        this.response = response;
        this.responseCategory = responseCategory;
        this.responseCode = responseCode;
        this.responseDate = responseDate;
        this.responseNotes = responseNotes;
        this.revenue = revenue;
        this.roi = roi;
        this.scheduledDate = scheduledDate;
        this.searchEngine = searchEngine;
        this.startDate = startDate;
        this.status = status;
        this.subscription = subscription;
        this.title = title;
        this.url = url;
        this.vertical = vertical;
        this.customFieldList = customFieldList;
    }

    public SearchColumnSelectField[] getAudience() {
        return this.audience;
    }

    public void setAudience(SearchColumnSelectField[] audience) {
        this.audience = audience;
    }

    public SearchColumnSelectField getAudience(int i) {
        return this.audience[i];
    }

    public void setAudience(int i, SearchColumnSelectField _value) {
        this.audience[i] = _value;
    }

    public SearchColumnDoubleField[] getBaseCost() {
        return this.baseCost;
    }

    public void setBaseCost(SearchColumnDoubleField[] baseCost) {
        this.baseCost = baseCost;
    }

    public SearchColumnDoubleField getBaseCost(int i) {
        return this.baseCost[i];
    }

    public void setBaseCost(int i, SearchColumnDoubleField _value) {
        this.baseCost[i] = _value;
    }

    public SearchColumnStringField[] getCampaignId() {
        return this.campaignId;
    }

    public void setCampaignId(SearchColumnStringField[] campaignId) {
        this.campaignId = campaignId;
    }

    public SearchColumnStringField getCampaignId(int i) {
        return this.campaignId[i];
    }

    public void setCampaignId(int i, SearchColumnStringField _value) {
        this.campaignId[i] = _value;
    }

    public SearchColumnSelectField[] getCategory() {
        return this.category;
    }

    public void setCategory(SearchColumnSelectField[] category) {
        this.category = category;
    }

    public SearchColumnSelectField getCategory(int i) {
        return this.category[i];
    }

    public void setCategory(int i, SearchColumnSelectField _value) {
        this.category[i] = _value;
    }

    public SearchColumnSelectField[] getChannel() {
        return this.channel;
    }

    public void setChannel(SearchColumnSelectField[] channel) {
        this.channel = channel;
    }

    public SearchColumnSelectField getChannel(int i) {
        return this.channel[i];
    }

    public void setChannel(int i, SearchColumnSelectField _value) {
        this.channel[i] = _value;
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

    public SearchColumnStringField[] getEvent() {
        return this.event;
    }

    public void setEvent(SearchColumnStringField[] event) {
        this.event = event;
    }

    public SearchColumnStringField getEvent(int i) {
        return this.event[i];
    }

    public void setEvent(int i, SearchColumnStringField _value) {
        this.event[i] = _value;
    }

    public SearchColumnDateField[] getExecutedDate() {
        return this.executedDate;
    }

    public void setExecutedDate(SearchColumnDateField[] executedDate) {
        this.executedDate = executedDate;
    }

    public SearchColumnDateField getExecutedDate(int i) {
        return this.executedDate[i];
    }

    public void setExecutedDate(int i, SearchColumnDateField _value) {
        this.executedDate[i] = _value;
    }

    public SearchColumnDoubleField[] getExpectedRevenue() {
        return this.expectedRevenue;
    }

    public void setExpectedRevenue(SearchColumnDoubleField[] expectedRevenue) {
        this.expectedRevenue = expectedRevenue;
    }

    public SearchColumnDoubleField getExpectedRevenue(int i) {
        return this.expectedRevenue[i];
    }

    public void setExpectedRevenue(int i, SearchColumnDoubleField _value) {
        this.expectedRevenue[i] = _value;
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

    public SearchColumnSelectField[] getFamily() {
        return this.family;
    }

    public void setFamily(SearchColumnSelectField[] family) {
        this.family = family;
    }

    public SearchColumnSelectField getFamily(int i) {
        return this.family[i];
    }

    public void setFamily(int i, SearchColumnSelectField _value) {
        this.family[i] = _value;
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

    public SearchColumnBooleanField[] getIsInactive() {
        return this.isInactive;
    }

    public void setIsInactive(SearchColumnBooleanField[] isInactive) {
        this.isInactive = isInactive;
    }

    public SearchColumnBooleanField getIsInactive(int i) {
        return this.isInactive[i];
    }

    public void setIsInactive(int i, SearchColumnBooleanField _value) {
        this.isInactive[i] = _value;
    }

    public SearchColumnBooleanField[] getIsSalesCampaign() {
        return this.isSalesCampaign;
    }

    public void setIsSalesCampaign(SearchColumnBooleanField[] isSalesCampaign) {
        this.isSalesCampaign = isSalesCampaign;
    }

    public SearchColumnBooleanField getIsSalesCampaign(int i) {
        return this.isSalesCampaign[i];
    }

    public void setIsSalesCampaign(int i, SearchColumnBooleanField _value) {
        this.isSalesCampaign[i] = _value;
    }

    public SearchColumnSelectField[] getItem() {
        return this.item;
    }

    public void setItem(SearchColumnSelectField[] item) {
        this.item = item;
    }

    public SearchColumnSelectField getItem(int i) {
        return this.item[i];
    }

    public void setItem(int i, SearchColumnSelectField _value) {
        this.item[i] = _value;
    }

    public SearchColumnStringField[] getKeyword() {
        return this.keyword;
    }

    public void setKeyword(SearchColumnStringField[] keyword) {
        this.keyword = keyword;
    }

    public SearchColumnStringField getKeyword(int i) {
        return this.keyword[i];
    }

    public void setKeyword(int i, SearchColumnStringField _value) {
        this.keyword[i] = _value;
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

    public SearchColumnSelectField[] getManagerRole() {
        return this.managerRole;
    }

    public void setManagerRole(SearchColumnSelectField[] managerRole) {
        this.managerRole = managerRole;
    }

    public SearchColumnSelectField getManagerRole(int i) {
        return this.managerRole[i];
    }

    public void setManagerRole(int i, SearchColumnSelectField _value) {
        this.managerRole[i] = _value;
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

    public SearchColumnSelectField[] getOffer() {
        return this.offer;
    }

    public void setOffer(SearchColumnSelectField[] offer) {
        this.offer = offer;
    }

    public SearchColumnSelectField getOffer(int i) {
        return this.offer[i];
    }

    public void setOffer(int i, SearchColumnSelectField _value) {
        this.offer[i] = _value;
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

    public SearchColumnStringField[] getPromoCode() {
        return this.promoCode;
    }

    public void setPromoCode(SearchColumnStringField[] promoCode) {
        this.promoCode = promoCode;
    }

    public SearchColumnStringField getPromoCode(int i) {
        return this.promoCode[i];
    }

    public void setPromoCode(int i, SearchColumnStringField _value) {
        this.promoCode[i] = _value;
    }

    public SearchColumnSelectField[] getRecipient() {
        return this.recipient;
    }

    public void setRecipient(SearchColumnSelectField[] recipient) {
        this.recipient = recipient;
    }

    public SearchColumnSelectField getRecipient(int i) {
        return this.recipient[i];
    }

    public void setRecipient(int i, SearchColumnSelectField _value) {
        this.recipient[i] = _value;
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

    public SearchColumnEnumSelectField[] getResponseCategory() {
        return this.responseCategory;
    }

    public void setResponseCategory(SearchColumnEnumSelectField[] responseCategory) {
        this.responseCategory = responseCategory;
    }

    public SearchColumnEnumSelectField getResponseCategory(int i) {
        return this.responseCategory[i];
    }

    public void setResponseCategory(int i, SearchColumnEnumSelectField _value) {
        this.responseCategory[i] = _value;
    }

    public SearchColumnLongField[] getResponseCode() {
        return this.responseCode;
    }

    public void setResponseCode(SearchColumnLongField[] responseCode) {
        this.responseCode = responseCode;
    }

    public SearchColumnLongField getResponseCode(int i) {
        return this.responseCode[i];
    }

    public void setResponseCode(int i, SearchColumnLongField _value) {
        this.responseCode[i] = _value;
    }

    public SearchColumnDateField[] getResponseDate() {
        return this.responseDate;
    }

    public void setResponseDate(SearchColumnDateField[] responseDate) {
        this.responseDate = responseDate;
    }

    public SearchColumnDateField getResponseDate(int i) {
        return this.responseDate[i];
    }

    public void setResponseDate(int i, SearchColumnDateField _value) {
        this.responseDate[i] = _value;
    }

    public SearchColumnStringField[] getResponseNotes() {
        return this.responseNotes;
    }

    public void setResponseNotes(SearchColumnStringField[] responseNotes) {
        this.responseNotes = responseNotes;
    }

    public SearchColumnStringField getResponseNotes(int i) {
        return this.responseNotes[i];
    }

    public void setResponseNotes(int i, SearchColumnStringField _value) {
        this.responseNotes[i] = _value;
    }

    public SearchColumnDoubleField[] getRevenue() {
        return this.revenue;
    }

    public void setRevenue(SearchColumnDoubleField[] revenue) {
        this.revenue = revenue;
    }

    public SearchColumnDoubleField getRevenue(int i) {
        return this.revenue[i];
    }

    public void setRevenue(int i, SearchColumnDoubleField _value) {
        this.revenue[i] = _value;
    }

    public SearchColumnDoubleField[] getRoi() {
        return this.roi;
    }

    public void setRoi(SearchColumnDoubleField[] roi) {
        this.roi = roi;
    }

    public SearchColumnDoubleField getRoi(int i) {
        return this.roi[i];
    }

    public void setRoi(int i, SearchColumnDoubleField _value) {
        this.roi[i] = _value;
    }

    public SearchColumnDateField[] getScheduledDate() {
        return this.scheduledDate;
    }

    public void setScheduledDate(SearchColumnDateField[] scheduledDate) {
        this.scheduledDate = scheduledDate;
    }

    public SearchColumnDateField getScheduledDate(int i) {
        return this.scheduledDate[i];
    }

    public void setScheduledDate(int i, SearchColumnDateField _value) {
        this.scheduledDate[i] = _value;
    }

    public SearchColumnSelectField[] getSearchEngine() {
        return this.searchEngine;
    }

    public void setSearchEngine(SearchColumnSelectField[] searchEngine) {
        this.searchEngine = searchEngine;
    }

    public SearchColumnSelectField getSearchEngine(int i) {
        return this.searchEngine[i];
    }

    public void setSearchEngine(int i, SearchColumnSelectField _value) {
        this.searchEngine[i] = _value;
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

    public SearchColumnSelectField[] getSubscription() {
        return this.subscription;
    }

    public void setSubscription(SearchColumnSelectField[] subscription) {
        this.subscription = subscription;
    }

    public SearchColumnSelectField getSubscription(int i) {
        return this.subscription[i];
    }

    public void setSubscription(int i, SearchColumnSelectField _value) {
        this.subscription[i] = _value;
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

    public SearchColumnStringField[] getUrl() {
        return this.url;
    }

    public void setUrl(SearchColumnStringField[] url) {
        this.url = url;
    }

    public SearchColumnStringField getUrl(int i) {
        return this.url[i];
    }

    public void setUrl(int i, SearchColumnStringField _value) {
        this.url[i] = _value;
    }

    public SearchColumnSelectField[] getVertical() {
        return this.vertical;
    }

    public void setVertical(SearchColumnSelectField[] vertical) {
        this.vertical = vertical;
    }

    public SearchColumnSelectField getVertical(int i) {
        return this.vertical[i];
    }

    public void setVertical(int i, SearchColumnSelectField _value) {
        this.vertical[i] = _value;
    }

    public SearchColumnCustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CampaignSearchRowBasic)) {
            return false;
        }
        CampaignSearchRowBasic other = (CampaignSearchRowBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.audience == null && other.getAudience() == null || this.audience != null && Arrays.equals(this.audience, other.getAudience())) && (this.baseCost == null && other.getBaseCost() == null || this.baseCost != null && Arrays.equals(this.baseCost, other.getBaseCost())) && (this.campaignId == null && other.getCampaignId() == null || this.campaignId != null && Arrays.equals(this.campaignId, other.getCampaignId())) && (this.category == null && other.getCategory() == null || this.category != null && Arrays.equals(this.category, other.getCategory())) && (this.channel == null && other.getChannel() == null || this.channel != null && Arrays.equals(this.channel, other.getChannel())) && (this.cost == null && other.getCost() == null || this.cost != null && Arrays.equals(this.cost, other.getCost())) && (this.createdDate == null && other.getCreatedDate() == null || this.createdDate != null && Arrays.equals(this.createdDate, other.getCreatedDate())) && (this.endDate == null && other.getEndDate() == null || this.endDate != null && Arrays.equals(this.endDate, other.getEndDate())) && (this.event == null && other.getEvent() == null || this.event != null && Arrays.equals(this.event, other.getEvent())) && (this.executedDate == null && other.getExecutedDate() == null || this.executedDate != null && Arrays.equals(this.executedDate, other.getExecutedDate())) && (this.expectedRevenue == null && other.getExpectedRevenue() == null || this.expectedRevenue != null && Arrays.equals(this.expectedRevenue, other.getExpectedRevenue())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && Arrays.equals(this.externalId, other.getExternalId())) && (this.family == null && other.getFamily() == null || this.family != null && Arrays.equals(this.family, other.getFamily())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && Arrays.equals(this.internalId, other.getInternalId())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && Arrays.equals(this.isInactive, other.getIsInactive())) && (this.isSalesCampaign == null && other.getIsSalesCampaign() == null || this.isSalesCampaign != null && Arrays.equals(this.isSalesCampaign, other.getIsSalesCampaign())) && (this.item == null && other.getItem() == null || this.item != null && Arrays.equals(this.item, other.getItem())) && (this.keyword == null && other.getKeyword() == null || this.keyword != null && Arrays.equals(this.keyword, other.getKeyword())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && Arrays.equals(this.lastModifiedDate, other.getLastModifiedDate())) && (this.managerRole == null && other.getManagerRole() == null || this.managerRole != null && Arrays.equals(this.managerRole, other.getManagerRole())) && (this.message == null && other.getMessage() == null || this.message != null && Arrays.equals(this.message, other.getMessage())) && (this.offer == null && other.getOffer() == null || this.offer != null && Arrays.equals(this.offer, other.getOffer())) && (this.owner == null && other.getOwner() == null || this.owner != null && Arrays.equals(this.owner, other.getOwner())) && (this.promoCode == null && other.getPromoCode() == null || this.promoCode != null && Arrays.equals(this.promoCode, other.getPromoCode())) && (this.recipient == null && other.getRecipient() == null || this.recipient != null && Arrays.equals(this.recipient, other.getRecipient())) && (this.response == null && other.getResponse() == null || this.response != null && Arrays.equals(this.response, other.getResponse())) && (this.responseCategory == null && other.getResponseCategory() == null || this.responseCategory != null && Arrays.equals(this.responseCategory, other.getResponseCategory())) && (this.responseCode == null && other.getResponseCode() == null || this.responseCode != null && Arrays.equals(this.responseCode, other.getResponseCode())) && (this.responseDate == null && other.getResponseDate() == null || this.responseDate != null && Arrays.equals(this.responseDate, other.getResponseDate())) && (this.responseNotes == null && other.getResponseNotes() == null || this.responseNotes != null && Arrays.equals(this.responseNotes, other.getResponseNotes())) && (this.revenue == null && other.getRevenue() == null || this.revenue != null && Arrays.equals(this.revenue, other.getRevenue())) && (this.roi == null && other.getRoi() == null || this.roi != null && Arrays.equals(this.roi, other.getRoi())) && (this.scheduledDate == null && other.getScheduledDate() == null || this.scheduledDate != null && Arrays.equals(this.scheduledDate, other.getScheduledDate())) && (this.searchEngine == null && other.getSearchEngine() == null || this.searchEngine != null && Arrays.equals(this.searchEngine, other.getSearchEngine())) && (this.startDate == null && other.getStartDate() == null || this.startDate != null && Arrays.equals(this.startDate, other.getStartDate())) && (this.status == null && other.getStatus() == null || this.status != null && Arrays.equals(this.status, other.getStatus())) && (this.subscription == null && other.getSubscription() == null || this.subscription != null && Arrays.equals(this.subscription, other.getSubscription())) && (this.title == null && other.getTitle() == null || this.title != null && Arrays.equals(this.title, other.getTitle())) && (this.url == null && other.getUrl() == null || this.url != null && Arrays.equals(this.url, other.getUrl())) && (this.vertical == null && other.getVertical() == null || this.vertical != null && Arrays.equals(this.vertical, other.getVertical())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
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
        if (this.getAudience() != null) {
            for (i = 0; i < Array.getLength(this.getAudience()); ++i) {
                obj = Array.get(this.getAudience(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBaseCost() != null) {
            for (i = 0; i < Array.getLength(this.getBaseCost()); ++i) {
                obj = Array.get(this.getBaseCost(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCampaignId() != null) {
            for (i = 0; i < Array.getLength(this.getCampaignId()); ++i) {
                obj = Array.get(this.getCampaignId(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCategory() != null) {
            for (i = 0; i < Array.getLength(this.getCategory()); ++i) {
                obj = Array.get(this.getCategory(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getChannel() != null) {
            for (i = 0; i < Array.getLength(this.getChannel()); ++i) {
                obj = Array.get(this.getChannel(), i);
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
        if (this.getEvent() != null) {
            for (i = 0; i < Array.getLength(this.getEvent()); ++i) {
                obj = Array.get(this.getEvent(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getExecutedDate() != null) {
            for (i = 0; i < Array.getLength(this.getExecutedDate()); ++i) {
                obj = Array.get(this.getExecutedDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getExpectedRevenue() != null) {
            for (i = 0; i < Array.getLength(this.getExpectedRevenue()); ++i) {
                obj = Array.get(this.getExpectedRevenue(), i);
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
        if (this.getFamily() != null) {
            for (i = 0; i < Array.getLength(this.getFamily()); ++i) {
                obj = Array.get(this.getFamily(), i);
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
        if (this.getIsInactive() != null) {
            for (i = 0; i < Array.getLength(this.getIsInactive()); ++i) {
                obj = Array.get(this.getIsInactive(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsSalesCampaign() != null) {
            for (i = 0; i < Array.getLength(this.getIsSalesCampaign()); ++i) {
                obj = Array.get(this.getIsSalesCampaign(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getItem() != null) {
            for (i = 0; i < Array.getLength(this.getItem()); ++i) {
                obj = Array.get(this.getItem(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getKeyword() != null) {
            for (i = 0; i < Array.getLength(this.getKeyword()); ++i) {
                obj = Array.get(this.getKeyword(), i);
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
        if (this.getManagerRole() != null) {
            for (i = 0; i < Array.getLength(this.getManagerRole()); ++i) {
                obj = Array.get(this.getManagerRole(), i);
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
        if (this.getOffer() != null) {
            for (i = 0; i < Array.getLength(this.getOffer()); ++i) {
                obj = Array.get(this.getOffer(), i);
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
        if (this.getPromoCode() != null) {
            for (i = 0; i < Array.getLength(this.getPromoCode()); ++i) {
                obj = Array.get(this.getPromoCode(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRecipient() != null) {
            for (i = 0; i < Array.getLength(this.getRecipient()); ++i) {
                obj = Array.get(this.getRecipient(), i);
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
        if (this.getResponseCategory() != null) {
            for (i = 0; i < Array.getLength(this.getResponseCategory()); ++i) {
                obj = Array.get(this.getResponseCategory(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getResponseCode() != null) {
            for (i = 0; i < Array.getLength(this.getResponseCode()); ++i) {
                obj = Array.get(this.getResponseCode(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getResponseDate() != null) {
            for (i = 0; i < Array.getLength(this.getResponseDate()); ++i) {
                obj = Array.get(this.getResponseDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getResponseNotes() != null) {
            for (i = 0; i < Array.getLength(this.getResponseNotes()); ++i) {
                obj = Array.get(this.getResponseNotes(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRevenue() != null) {
            for (i = 0; i < Array.getLength(this.getRevenue()); ++i) {
                obj = Array.get(this.getRevenue(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRoi() != null) {
            for (i = 0; i < Array.getLength(this.getRoi()); ++i) {
                obj = Array.get(this.getRoi(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getScheduledDate() != null) {
            for (i = 0; i < Array.getLength(this.getScheduledDate()); ++i) {
                obj = Array.get(this.getScheduledDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSearchEngine() != null) {
            for (i = 0; i < Array.getLength(this.getSearchEngine()); ++i) {
                obj = Array.get(this.getSearchEngine(), i);
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
        if (this.getStatus() != null) {
            for (i = 0; i < Array.getLength(this.getStatus()); ++i) {
                obj = Array.get(this.getStatus(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSubscription() != null) {
            for (i = 0; i < Array.getLength(this.getSubscription()); ++i) {
                obj = Array.get(this.getSubscription(), i);
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
        if (this.getUrl() != null) {
            for (i = 0; i < Array.getLength(this.getUrl()); ++i) {
                obj = Array.get(this.getUrl(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getVertical() != null) {
            for (i = 0; i < Array.getLength(this.getVertical()); ++i) {
                obj = Array.get(this.getVertical(), i);
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "CampaignSearchRowBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("audience");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "audience"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("baseCost");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "baseCost"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("campaignId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "campaignId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "category"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("channel");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "channel"));
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
        elemField.setFieldName("event");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "event"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("executedDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "executedDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("expectedRevenue");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "expectedRevenue"));
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
        elemField.setFieldName("family");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "family"));
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
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isSalesCampaign");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isSalesCampaign"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("keyword");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "keyword"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("managerRole");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "managerRole"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("offer");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "offer"));
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
        elemField.setFieldName("promoCode");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "promoCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recipient");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "recipient"));
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
        elemField.setFieldName("responseCategory");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "responseCategory"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("responseCode");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "responseCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("responseDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "responseDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("responseNotes");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "responseNotes"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revenue");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "revenue"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("roi");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "roi"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("scheduledDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "scheduledDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("searchEngine");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "searchEngine"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("status");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "status"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subscription");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "subscription"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("url");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "url"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vertical");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "vertical"));
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

