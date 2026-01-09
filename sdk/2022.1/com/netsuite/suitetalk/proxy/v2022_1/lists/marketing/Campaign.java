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

import com.netsuite.suitetalk.proxy.v2022_1.lists.marketing.CampaignDirectMailList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.marketing.CampaignEmailList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.marketing.CampaignEventList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.marketing.CampaignEventResponseList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.CustomFieldList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.NullField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.Record;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRefList;
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

public class Campaign
extends Record
implements Serializable {
    private RecordRef customForm;
    private String campaignId;
    private String title;
    private RecordRef category;
    private RecordRef owner;
    private Calendar startDate;
    private Calendar endDate;
    private String url;
    private Double baseCost;
    private Double cost;
    private Double expectedRevenue;
    private String message;
    private Boolean isInactive;
    private Boolean local;
    private Double totalRevenue;
    private Double roi;
    private Double profit;
    private Double costPerCustomer;
    private Double convCostPerCustomer;
    private Long conversions;
    private Long leadsGenerated;
    private Long uniqueVisitors;
    private RecordRef vertical;
    private RecordRef audience;
    private RecordRef offer;
    private RecordRef promotionCode;
    private RecordRefList itemList;
    private RecordRef family;
    private RecordRef searchEngine;
    private String keyword;
    private CampaignEmailList campaignEmailList;
    private CampaignDirectMailList campaignDirectMailList;
    private CampaignEventList campaignEventList;
    private CampaignEventResponseList eventResponseList;
    private CustomFieldList customFieldList;
    private String internalId;
    private String externalId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(Campaign.class, true);

    public Campaign() {
    }

    public Campaign(NullField nullFieldList, String internalId, String externalId, RecordRef customForm, String campaignId, String title, RecordRef category, RecordRef owner, Calendar startDate, Calendar endDate, String url, Double baseCost, Double cost, Double expectedRevenue, String message, Boolean isInactive, Boolean local, Double totalRevenue, Double roi, Double profit, Double costPerCustomer, Double convCostPerCustomer, Long conversions, Long leadsGenerated, Long uniqueVisitors, RecordRef vertical, RecordRef audience, RecordRef offer, RecordRef promotionCode, RecordRefList itemList, RecordRef family, RecordRef searchEngine, String keyword, CampaignEmailList campaignEmailList, CampaignDirectMailList campaignDirectMailList, CampaignEventList campaignEventList, CampaignEventResponseList eventResponseList, CustomFieldList customFieldList) {
        super(nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.customForm = customForm;
        this.campaignId = campaignId;
        this.title = title;
        this.category = category;
        this.owner = owner;
        this.startDate = startDate;
        this.endDate = endDate;
        this.url = url;
        this.baseCost = baseCost;
        this.cost = cost;
        this.expectedRevenue = expectedRevenue;
        this.message = message;
        this.isInactive = isInactive;
        this.local = local;
        this.totalRevenue = totalRevenue;
        this.roi = roi;
        this.profit = profit;
        this.costPerCustomer = costPerCustomer;
        this.convCostPerCustomer = convCostPerCustomer;
        this.conversions = conversions;
        this.leadsGenerated = leadsGenerated;
        this.uniqueVisitors = uniqueVisitors;
        this.vertical = vertical;
        this.audience = audience;
        this.offer = offer;
        this.promotionCode = promotionCode;
        this.itemList = itemList;
        this.family = family;
        this.searchEngine = searchEngine;
        this.keyword = keyword;
        this.campaignEmailList = campaignEmailList;
        this.campaignDirectMailList = campaignDirectMailList;
        this.campaignEventList = campaignEventList;
        this.eventResponseList = eventResponseList;
        this.customFieldList = customFieldList;
    }

    public RecordRef getCustomForm() {
        return this.customForm;
    }

    public void setCustomForm(RecordRef customForm) {
        this.customForm = customForm;
    }

    public String getCampaignId() {
        return this.campaignId;
    }

    public void setCampaignId(String campaignId) {
        this.campaignId = campaignId;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public RecordRef getCategory() {
        return this.category;
    }

    public void setCategory(RecordRef category) {
        this.category = category;
    }

    public RecordRef getOwner() {
        return this.owner;
    }

    public void setOwner(RecordRef owner) {
        this.owner = owner;
    }

    public Calendar getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Calendar startDate) {
        this.startDate = startDate;
    }

    public Calendar getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Calendar endDate) {
        this.endDate = endDate;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Double getBaseCost() {
        return this.baseCost;
    }

    public void setBaseCost(Double baseCost) {
        this.baseCost = baseCost;
    }

    public Double getCost() {
        return this.cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Double getExpectedRevenue() {
        return this.expectedRevenue;
    }

    public void setExpectedRevenue(Double expectedRevenue) {
        this.expectedRevenue = expectedRevenue;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getIsInactive() {
        return this.isInactive;
    }

    public void setIsInactive(Boolean isInactive) {
        this.isInactive = isInactive;
    }

    public Boolean getLocal() {
        return this.local;
    }

    public void setLocal(Boolean local) {
        this.local = local;
    }

    public Double getTotalRevenue() {
        return this.totalRevenue;
    }

    public void setTotalRevenue(Double totalRevenue) {
        this.totalRevenue = totalRevenue;
    }

    public Double getRoi() {
        return this.roi;
    }

    public void setRoi(Double roi) {
        this.roi = roi;
    }

    public Double getProfit() {
        return this.profit;
    }

    public void setProfit(Double profit) {
        this.profit = profit;
    }

    public Double getCostPerCustomer() {
        return this.costPerCustomer;
    }

    public void setCostPerCustomer(Double costPerCustomer) {
        this.costPerCustomer = costPerCustomer;
    }

    public Double getConvCostPerCustomer() {
        return this.convCostPerCustomer;
    }

    public void setConvCostPerCustomer(Double convCostPerCustomer) {
        this.convCostPerCustomer = convCostPerCustomer;
    }

    public Long getConversions() {
        return this.conversions;
    }

    public void setConversions(Long conversions) {
        this.conversions = conversions;
    }

    public Long getLeadsGenerated() {
        return this.leadsGenerated;
    }

    public void setLeadsGenerated(Long leadsGenerated) {
        this.leadsGenerated = leadsGenerated;
    }

    public Long getUniqueVisitors() {
        return this.uniqueVisitors;
    }

    public void setUniqueVisitors(Long uniqueVisitors) {
        this.uniqueVisitors = uniqueVisitors;
    }

    public RecordRef getVertical() {
        return this.vertical;
    }

    public void setVertical(RecordRef vertical) {
        this.vertical = vertical;
    }

    public RecordRef getAudience() {
        return this.audience;
    }

    public void setAudience(RecordRef audience) {
        this.audience = audience;
    }

    public RecordRef getOffer() {
        return this.offer;
    }

    public void setOffer(RecordRef offer) {
        this.offer = offer;
    }

    public RecordRef getPromotionCode() {
        return this.promotionCode;
    }

    public void setPromotionCode(RecordRef promotionCode) {
        this.promotionCode = promotionCode;
    }

    public RecordRefList getItemList() {
        return this.itemList;
    }

    public void setItemList(RecordRefList itemList) {
        this.itemList = itemList;
    }

    public RecordRef getFamily() {
        return this.family;
    }

    public void setFamily(RecordRef family) {
        this.family = family;
    }

    public RecordRef getSearchEngine() {
        return this.searchEngine;
    }

    public void setSearchEngine(RecordRef searchEngine) {
        this.searchEngine = searchEngine;
    }

    public String getKeyword() {
        return this.keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public CampaignEmailList getCampaignEmailList() {
        return this.campaignEmailList;
    }

    public void setCampaignEmailList(CampaignEmailList campaignEmailList) {
        this.campaignEmailList = campaignEmailList;
    }

    public CampaignDirectMailList getCampaignDirectMailList() {
        return this.campaignDirectMailList;
    }

    public void setCampaignDirectMailList(CampaignDirectMailList campaignDirectMailList) {
        this.campaignDirectMailList = campaignDirectMailList;
    }

    public CampaignEventList getCampaignEventList() {
        return this.campaignEventList;
    }

    public void setCampaignEventList(CampaignEventList campaignEventList) {
        this.campaignEventList = campaignEventList;
    }

    public CampaignEventResponseList getEventResponseList() {
        return this.eventResponseList;
    }

    public void setEventResponseList(CampaignEventResponseList eventResponseList) {
        this.eventResponseList = eventResponseList;
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
        if (!(obj instanceof Campaign)) {
            return false;
        }
        Campaign other = (Campaign)obj;
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
        boolean _equals = super.equals(obj) && (this.customForm == null && other.getCustomForm() == null || this.customForm != null && this.customForm.equals(other.getCustomForm())) && (this.campaignId == null && other.getCampaignId() == null || this.campaignId != null && this.campaignId.equals(other.getCampaignId())) && (this.title == null && other.getTitle() == null || this.title != null && this.title.equals(other.getTitle())) && (this.category == null && other.getCategory() == null || this.category != null && this.category.equals(other.getCategory())) && (this.owner == null && other.getOwner() == null || this.owner != null && this.owner.equals(other.getOwner())) && (this.startDate == null && other.getStartDate() == null || this.startDate != null && this.startDate.equals(other.getStartDate())) && (this.endDate == null && other.getEndDate() == null || this.endDate != null && this.endDate.equals(other.getEndDate())) && (this.url == null && other.getUrl() == null || this.url != null && this.url.equals(other.getUrl())) && (this.baseCost == null && other.getBaseCost() == null || this.baseCost != null && this.baseCost.equals(other.getBaseCost())) && (this.cost == null && other.getCost() == null || this.cost != null && this.cost.equals(other.getCost())) && (this.expectedRevenue == null && other.getExpectedRevenue() == null || this.expectedRevenue != null && this.expectedRevenue.equals(other.getExpectedRevenue())) && (this.message == null && other.getMessage() == null || this.message != null && this.message.equals(other.getMessage())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && this.isInactive.equals(other.getIsInactive())) && (this.local == null && other.getLocal() == null || this.local != null && this.local.equals(other.getLocal())) && (this.totalRevenue == null && other.getTotalRevenue() == null || this.totalRevenue != null && this.totalRevenue.equals(other.getTotalRevenue())) && (this.roi == null && other.getRoi() == null || this.roi != null && this.roi.equals(other.getRoi())) && (this.profit == null && other.getProfit() == null || this.profit != null && this.profit.equals(other.getProfit())) && (this.costPerCustomer == null && other.getCostPerCustomer() == null || this.costPerCustomer != null && this.costPerCustomer.equals(other.getCostPerCustomer())) && (this.convCostPerCustomer == null && other.getConvCostPerCustomer() == null || this.convCostPerCustomer != null && this.convCostPerCustomer.equals(other.getConvCostPerCustomer())) && (this.conversions == null && other.getConversions() == null || this.conversions != null && this.conversions.equals(other.getConversions())) && (this.leadsGenerated == null && other.getLeadsGenerated() == null || this.leadsGenerated != null && this.leadsGenerated.equals(other.getLeadsGenerated())) && (this.uniqueVisitors == null && other.getUniqueVisitors() == null || this.uniqueVisitors != null && this.uniqueVisitors.equals(other.getUniqueVisitors())) && (this.vertical == null && other.getVertical() == null || this.vertical != null && this.vertical.equals(other.getVertical())) && (this.audience == null && other.getAudience() == null || this.audience != null && this.audience.equals(other.getAudience())) && (this.offer == null && other.getOffer() == null || this.offer != null && this.offer.equals(other.getOffer())) && (this.promotionCode == null && other.getPromotionCode() == null || this.promotionCode != null && this.promotionCode.equals(other.getPromotionCode())) && (this.itemList == null && other.getItemList() == null || this.itemList != null && this.itemList.equals(other.getItemList())) && (this.family == null && other.getFamily() == null || this.family != null && this.family.equals(other.getFamily())) && (this.searchEngine == null && other.getSearchEngine() == null || this.searchEngine != null && this.searchEngine.equals(other.getSearchEngine())) && (this.keyword == null && other.getKeyword() == null || this.keyword != null && this.keyword.equals(other.getKeyword())) && (this.campaignEmailList == null && other.getCampaignEmailList() == null || this.campaignEmailList != null && this.campaignEmailList.equals(other.getCampaignEmailList())) && (this.campaignDirectMailList == null && other.getCampaignDirectMailList() == null || this.campaignDirectMailList != null && this.campaignDirectMailList.equals(other.getCampaignDirectMailList())) && (this.campaignEventList == null && other.getCampaignEventList() == null || this.campaignEventList != null && this.campaignEventList.equals(other.getCampaignEventList())) && (this.eventResponseList == null && other.getEventResponseList() == null || this.eventResponseList != null && this.eventResponseList.equals(other.getEventResponseList())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
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
        if (this.getCustomForm() != null) {
            _hashCode += this.getCustomForm().hashCode();
        }
        if (this.getCampaignId() != null) {
            _hashCode += this.getCampaignId().hashCode();
        }
        if (this.getTitle() != null) {
            _hashCode += this.getTitle().hashCode();
        }
        if (this.getCategory() != null) {
            _hashCode += this.getCategory().hashCode();
        }
        if (this.getOwner() != null) {
            _hashCode += this.getOwner().hashCode();
        }
        if (this.getStartDate() != null) {
            _hashCode += this.getStartDate().hashCode();
        }
        if (this.getEndDate() != null) {
            _hashCode += this.getEndDate().hashCode();
        }
        if (this.getUrl() != null) {
            _hashCode += this.getUrl().hashCode();
        }
        if (this.getBaseCost() != null) {
            _hashCode += this.getBaseCost().hashCode();
        }
        if (this.getCost() != null) {
            _hashCode += this.getCost().hashCode();
        }
        if (this.getExpectedRevenue() != null) {
            _hashCode += this.getExpectedRevenue().hashCode();
        }
        if (this.getMessage() != null) {
            _hashCode += this.getMessage().hashCode();
        }
        if (this.getIsInactive() != null) {
            _hashCode += this.getIsInactive().hashCode();
        }
        if (this.getLocal() != null) {
            _hashCode += this.getLocal().hashCode();
        }
        if (this.getTotalRevenue() != null) {
            _hashCode += this.getTotalRevenue().hashCode();
        }
        if (this.getRoi() != null) {
            _hashCode += this.getRoi().hashCode();
        }
        if (this.getProfit() != null) {
            _hashCode += this.getProfit().hashCode();
        }
        if (this.getCostPerCustomer() != null) {
            _hashCode += this.getCostPerCustomer().hashCode();
        }
        if (this.getConvCostPerCustomer() != null) {
            _hashCode += this.getConvCostPerCustomer().hashCode();
        }
        if (this.getConversions() != null) {
            _hashCode += this.getConversions().hashCode();
        }
        if (this.getLeadsGenerated() != null) {
            _hashCode += this.getLeadsGenerated().hashCode();
        }
        if (this.getUniqueVisitors() != null) {
            _hashCode += this.getUniqueVisitors().hashCode();
        }
        if (this.getVertical() != null) {
            _hashCode += this.getVertical().hashCode();
        }
        if (this.getAudience() != null) {
            _hashCode += this.getAudience().hashCode();
        }
        if (this.getOffer() != null) {
            _hashCode += this.getOffer().hashCode();
        }
        if (this.getPromotionCode() != null) {
            _hashCode += this.getPromotionCode().hashCode();
        }
        if (this.getItemList() != null) {
            _hashCode += this.getItemList().hashCode();
        }
        if (this.getFamily() != null) {
            _hashCode += this.getFamily().hashCode();
        }
        if (this.getSearchEngine() != null) {
            _hashCode += this.getSearchEngine().hashCode();
        }
        if (this.getKeyword() != null) {
            _hashCode += this.getKeyword().hashCode();
        }
        if (this.getCampaignEmailList() != null) {
            _hashCode += this.getCampaignEmailList().hashCode();
        }
        if (this.getCampaignDirectMailList() != null) {
            _hashCode += this.getCampaignDirectMailList().hashCode();
        }
        if (this.getCampaignEventList() != null) {
            _hashCode += this.getCampaignEventList().hashCode();
        }
        if (this.getEventResponseList() != null) {
            _hashCode += this.getEventResponseList().hashCode();
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
        typeDesc.setXmlType(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "Campaign"));
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
        elemField.setFieldName("customForm");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("campaignId");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "campaignId"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "title"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "category"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "owner"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "endDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "url"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("baseCost");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "baseCost"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("expectedRevenue");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "expectedRevenue"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "message"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("local");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "local"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("totalRevenue");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "totalRevenue"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("roi");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "roi"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("profit");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "profit"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("costPerCustomer");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "costPerCustomer"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("convCostPerCustomer");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "convCostPerCustomer"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("conversions");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "conversions"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("leadsGenerated");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "leadsGenerated"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("uniqueVisitors");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "uniqueVisitors"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vertical");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "vertical"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("audience");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "audience"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("offer");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "offer"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("promotionCode");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "promotionCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemList");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "itemList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRefList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("family");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "family"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("searchEngine");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "searchEngine"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("keyword");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "keyword"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("campaignEmailList");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "campaignEmailList"));
        elemField.setXmlType(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "CampaignEmailList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("campaignDirectMailList");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "campaignDirectMailList"));
        elemField.setXmlType(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "CampaignDirectMailList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("campaignEventList");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "campaignEventList"));
        elemField.setXmlType(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "CampaignEventList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("eventResponseList");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "eventResponseList"));
        elemField.setXmlType(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "CampaignEventResponseList"));
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

