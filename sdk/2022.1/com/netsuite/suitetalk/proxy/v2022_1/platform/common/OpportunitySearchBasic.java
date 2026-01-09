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

import com.netsuite.suitetalk.proxy.v2022_1.platform.common.types.PostingPeriodDate;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
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

public class OpportunitySearchBasic
extends SearchRecordBasic
implements Serializable {
    private SearchDoubleField amount;
    private SearchBooleanField availableOffline;
    private SearchMultiSelectField buyingReason;
    private SearchMultiSelectField buyingTimeFrame;
    private SearchMultiSelectField _class;
    private SearchDateField closeDate;
    private SearchMultiSelectField competitor;
    private SearchLongField contribution;
    private SearchMultiSelectField currency;
    private SearchMultiSelectField custType;
    private SearchDateField dateCreated;
    private SearchLongField daysOpen;
    private SearchLongField daysToClose;
    private SearchMultiSelectField department;
    private SearchMultiSelectField entity;
    private SearchMultiSelectField entityStatus;
    private SearchDoubleField estimatedBudget;
    private SearchDateField expectedCloseDate;
    private SearchMultiSelectField externalId;
    private SearchStringField externalIdString;
    private SearchEnumMultiSelectField forecastType;
    private SearchDoubleField foreignProjectedAmount;
    private SearchDoubleField foreignRangeHigh;
    private SearchDoubleField foreignRangeLow;
    private SearchDoubleField fxTranCostEstimate;
    private SearchMultiSelectField internalId;
    private SearchLongField internalIdNumber;
    private SearchBooleanField isBudgetApproved;
    private SearchMultiSelectField item;
    private SearchDateField lastModifiedDate;
    private SearchMultiSelectField leadSource;
    private SearchMultiSelectField location;
    private SearchStringField memo;
    private SearchLongField number;
    private SearchMultiSelectField partner;
    private SearchLongField partnerContribution;
    private SearchMultiSelectField partnerRole;
    private SearchMultiSelectField partnerTeamMember;
    private RecordRef postingPeriod;
    private PostingPeriodDate postingPeriodRelative;
    private SearchLongField probability;
    private SearchDoubleField projAltSalesAmt;
    private SearchDoubleField projectedTotal;
    private SearchDoubleField rangeHigh;
    private SearchDoubleField rangeHighAlt;
    private SearchDoubleField rangeLow;
    private SearchDoubleField rangeLowAlt;
    private SearchMultiSelectField salesReadiness;
    private SearchMultiSelectField salesRep;
    private SearchMultiSelectField salesTeamMember;
    private SearchMultiSelectField salesTeamRole;
    private SearchEnumMultiSelectField status;
    private SearchMultiSelectField subsidiary;
    private RecordRef taxPeriod;
    private PostingPeriodDate taxPeriodRelative;
    private SearchStringField title;
    private SearchDoubleField tranCostEstimate;
    private SearchDateField tranDate;
    private SearchDoubleField tranEstGrossProfit;
    private SearchDoubleField tranEstGrossProfitPct;
    private SearchDoubleField tranFxEstGrossProfit;
    private SearchStringField tranId;
    private SearchMultiSelectField winLossReason;
    private SearchMultiSelectField wonBy;
    private SearchCustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(OpportunitySearchBasic.class, true);

    public OpportunitySearchBasic() {
    }

    public OpportunitySearchBasic(SearchDoubleField amount, SearchBooleanField availableOffline, SearchMultiSelectField buyingReason, SearchMultiSelectField buyingTimeFrame, SearchMultiSelectField _class, SearchDateField closeDate, SearchMultiSelectField competitor, SearchLongField contribution, SearchMultiSelectField currency, SearchMultiSelectField custType, SearchDateField dateCreated, SearchLongField daysOpen, SearchLongField daysToClose, SearchMultiSelectField department, SearchMultiSelectField entity, SearchMultiSelectField entityStatus, SearchDoubleField estimatedBudget, SearchDateField expectedCloseDate, SearchMultiSelectField externalId, SearchStringField externalIdString, SearchEnumMultiSelectField forecastType, SearchDoubleField foreignProjectedAmount, SearchDoubleField foreignRangeHigh, SearchDoubleField foreignRangeLow, SearchDoubleField fxTranCostEstimate, SearchMultiSelectField internalId, SearchLongField internalIdNumber, SearchBooleanField isBudgetApproved, SearchMultiSelectField item, SearchDateField lastModifiedDate, SearchMultiSelectField leadSource, SearchMultiSelectField location, SearchStringField memo, SearchLongField number, SearchMultiSelectField partner, SearchLongField partnerContribution, SearchMultiSelectField partnerRole, SearchMultiSelectField partnerTeamMember, RecordRef postingPeriod, PostingPeriodDate postingPeriodRelative, SearchLongField probability, SearchDoubleField projAltSalesAmt, SearchDoubleField projectedTotal, SearchDoubleField rangeHigh, SearchDoubleField rangeHighAlt, SearchDoubleField rangeLow, SearchDoubleField rangeLowAlt, SearchMultiSelectField salesReadiness, SearchMultiSelectField salesRep, SearchMultiSelectField salesTeamMember, SearchMultiSelectField salesTeamRole, SearchEnumMultiSelectField status, SearchMultiSelectField subsidiary, RecordRef taxPeriod, PostingPeriodDate taxPeriodRelative, SearchStringField title, SearchDoubleField tranCostEstimate, SearchDateField tranDate, SearchDoubleField tranEstGrossProfit, SearchDoubleField tranEstGrossProfitPct, SearchDoubleField tranFxEstGrossProfit, SearchStringField tranId, SearchMultiSelectField winLossReason, SearchMultiSelectField wonBy, SearchCustomFieldList customFieldList) {
        this.amount = amount;
        this.availableOffline = availableOffline;
        this.buyingReason = buyingReason;
        this.buyingTimeFrame = buyingTimeFrame;
        this._class = _class;
        this.closeDate = closeDate;
        this.competitor = competitor;
        this.contribution = contribution;
        this.currency = currency;
        this.custType = custType;
        this.dateCreated = dateCreated;
        this.daysOpen = daysOpen;
        this.daysToClose = daysToClose;
        this.department = department;
        this.entity = entity;
        this.entityStatus = entityStatus;
        this.estimatedBudget = estimatedBudget;
        this.expectedCloseDate = expectedCloseDate;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.forecastType = forecastType;
        this.foreignProjectedAmount = foreignProjectedAmount;
        this.foreignRangeHigh = foreignRangeHigh;
        this.foreignRangeLow = foreignRangeLow;
        this.fxTranCostEstimate = fxTranCostEstimate;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isBudgetApproved = isBudgetApproved;
        this.item = item;
        this.lastModifiedDate = lastModifiedDate;
        this.leadSource = leadSource;
        this.location = location;
        this.memo = memo;
        this.number = number;
        this.partner = partner;
        this.partnerContribution = partnerContribution;
        this.partnerRole = partnerRole;
        this.partnerTeamMember = partnerTeamMember;
        this.postingPeriod = postingPeriod;
        this.postingPeriodRelative = postingPeriodRelative;
        this.probability = probability;
        this.projAltSalesAmt = projAltSalesAmt;
        this.projectedTotal = projectedTotal;
        this.rangeHigh = rangeHigh;
        this.rangeHighAlt = rangeHighAlt;
        this.rangeLow = rangeLow;
        this.rangeLowAlt = rangeLowAlt;
        this.salesReadiness = salesReadiness;
        this.salesRep = salesRep;
        this.salesTeamMember = salesTeamMember;
        this.salesTeamRole = salesTeamRole;
        this.status = status;
        this.subsidiary = subsidiary;
        this.taxPeriod = taxPeriod;
        this.taxPeriodRelative = taxPeriodRelative;
        this.title = title;
        this.tranCostEstimate = tranCostEstimate;
        this.tranDate = tranDate;
        this.tranEstGrossProfit = tranEstGrossProfit;
        this.tranEstGrossProfitPct = tranEstGrossProfitPct;
        this.tranFxEstGrossProfit = tranFxEstGrossProfit;
        this.tranId = tranId;
        this.winLossReason = winLossReason;
        this.wonBy = wonBy;
        this.customFieldList = customFieldList;
    }

    public SearchDoubleField getAmount() {
        return this.amount;
    }

    public void setAmount(SearchDoubleField amount) {
        this.amount = amount;
    }

    public SearchBooleanField getAvailableOffline() {
        return this.availableOffline;
    }

    public void setAvailableOffline(SearchBooleanField availableOffline) {
        this.availableOffline = availableOffline;
    }

    public SearchMultiSelectField getBuyingReason() {
        return this.buyingReason;
    }

    public void setBuyingReason(SearchMultiSelectField buyingReason) {
        this.buyingReason = buyingReason;
    }

    public SearchMultiSelectField getBuyingTimeFrame() {
        return this.buyingTimeFrame;
    }

    public void setBuyingTimeFrame(SearchMultiSelectField buyingTimeFrame) {
        this.buyingTimeFrame = buyingTimeFrame;
    }

    public SearchMultiSelectField get_class() {
        return this._class;
    }

    public void set_class(SearchMultiSelectField _class) {
        this._class = _class;
    }

    public SearchDateField getCloseDate() {
        return this.closeDate;
    }

    public void setCloseDate(SearchDateField closeDate) {
        this.closeDate = closeDate;
    }

    public SearchMultiSelectField getCompetitor() {
        return this.competitor;
    }

    public void setCompetitor(SearchMultiSelectField competitor) {
        this.competitor = competitor;
    }

    public SearchLongField getContribution() {
        return this.contribution;
    }

    public void setContribution(SearchLongField contribution) {
        this.contribution = contribution;
    }

    public SearchMultiSelectField getCurrency() {
        return this.currency;
    }

    public void setCurrency(SearchMultiSelectField currency) {
        this.currency = currency;
    }

    public SearchMultiSelectField getCustType() {
        return this.custType;
    }

    public void setCustType(SearchMultiSelectField custType) {
        this.custType = custType;
    }

    public SearchDateField getDateCreated() {
        return this.dateCreated;
    }

    public void setDateCreated(SearchDateField dateCreated) {
        this.dateCreated = dateCreated;
    }

    public SearchLongField getDaysOpen() {
        return this.daysOpen;
    }

    public void setDaysOpen(SearchLongField daysOpen) {
        this.daysOpen = daysOpen;
    }

    public SearchLongField getDaysToClose() {
        return this.daysToClose;
    }

    public void setDaysToClose(SearchLongField daysToClose) {
        this.daysToClose = daysToClose;
    }

    public SearchMultiSelectField getDepartment() {
        return this.department;
    }

    public void setDepartment(SearchMultiSelectField department) {
        this.department = department;
    }

    public SearchMultiSelectField getEntity() {
        return this.entity;
    }

    public void setEntity(SearchMultiSelectField entity) {
        this.entity = entity;
    }

    public SearchMultiSelectField getEntityStatus() {
        return this.entityStatus;
    }

    public void setEntityStatus(SearchMultiSelectField entityStatus) {
        this.entityStatus = entityStatus;
    }

    public SearchDoubleField getEstimatedBudget() {
        return this.estimatedBudget;
    }

    public void setEstimatedBudget(SearchDoubleField estimatedBudget) {
        this.estimatedBudget = estimatedBudget;
    }

    public SearchDateField getExpectedCloseDate() {
        return this.expectedCloseDate;
    }

    public void setExpectedCloseDate(SearchDateField expectedCloseDate) {
        this.expectedCloseDate = expectedCloseDate;
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

    public SearchEnumMultiSelectField getForecastType() {
        return this.forecastType;
    }

    public void setForecastType(SearchEnumMultiSelectField forecastType) {
        this.forecastType = forecastType;
    }

    public SearchDoubleField getForeignProjectedAmount() {
        return this.foreignProjectedAmount;
    }

    public void setForeignProjectedAmount(SearchDoubleField foreignProjectedAmount) {
        this.foreignProjectedAmount = foreignProjectedAmount;
    }

    public SearchDoubleField getForeignRangeHigh() {
        return this.foreignRangeHigh;
    }

    public void setForeignRangeHigh(SearchDoubleField foreignRangeHigh) {
        this.foreignRangeHigh = foreignRangeHigh;
    }

    public SearchDoubleField getForeignRangeLow() {
        return this.foreignRangeLow;
    }

    public void setForeignRangeLow(SearchDoubleField foreignRangeLow) {
        this.foreignRangeLow = foreignRangeLow;
    }

    public SearchDoubleField getFxTranCostEstimate() {
        return this.fxTranCostEstimate;
    }

    public void setFxTranCostEstimate(SearchDoubleField fxTranCostEstimate) {
        this.fxTranCostEstimate = fxTranCostEstimate;
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

    public SearchBooleanField getIsBudgetApproved() {
        return this.isBudgetApproved;
    }

    public void setIsBudgetApproved(SearchBooleanField isBudgetApproved) {
        this.isBudgetApproved = isBudgetApproved;
    }

    public SearchMultiSelectField getItem() {
        return this.item;
    }

    public void setItem(SearchMultiSelectField item) {
        this.item = item;
    }

    public SearchDateField getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    public void setLastModifiedDate(SearchDateField lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public SearchMultiSelectField getLeadSource() {
        return this.leadSource;
    }

    public void setLeadSource(SearchMultiSelectField leadSource) {
        this.leadSource = leadSource;
    }

    public SearchMultiSelectField getLocation() {
        return this.location;
    }

    public void setLocation(SearchMultiSelectField location) {
        this.location = location;
    }

    public SearchStringField getMemo() {
        return this.memo;
    }

    public void setMemo(SearchStringField memo) {
        this.memo = memo;
    }

    public SearchLongField getNumber() {
        return this.number;
    }

    public void setNumber(SearchLongField number) {
        this.number = number;
    }

    public SearchMultiSelectField getPartner() {
        return this.partner;
    }

    public void setPartner(SearchMultiSelectField partner) {
        this.partner = partner;
    }

    public SearchLongField getPartnerContribution() {
        return this.partnerContribution;
    }

    public void setPartnerContribution(SearchLongField partnerContribution) {
        this.partnerContribution = partnerContribution;
    }

    public SearchMultiSelectField getPartnerRole() {
        return this.partnerRole;
    }

    public void setPartnerRole(SearchMultiSelectField partnerRole) {
        this.partnerRole = partnerRole;
    }

    public SearchMultiSelectField getPartnerTeamMember() {
        return this.partnerTeamMember;
    }

    public void setPartnerTeamMember(SearchMultiSelectField partnerTeamMember) {
        this.partnerTeamMember = partnerTeamMember;
    }

    public RecordRef getPostingPeriod() {
        return this.postingPeriod;
    }

    public void setPostingPeriod(RecordRef postingPeriod) {
        this.postingPeriod = postingPeriod;
    }

    public PostingPeriodDate getPostingPeriodRelative() {
        return this.postingPeriodRelative;
    }

    public void setPostingPeriodRelative(PostingPeriodDate postingPeriodRelative) {
        this.postingPeriodRelative = postingPeriodRelative;
    }

    public SearchLongField getProbability() {
        return this.probability;
    }

    public void setProbability(SearchLongField probability) {
        this.probability = probability;
    }

    public SearchDoubleField getProjAltSalesAmt() {
        return this.projAltSalesAmt;
    }

    public void setProjAltSalesAmt(SearchDoubleField projAltSalesAmt) {
        this.projAltSalesAmt = projAltSalesAmt;
    }

    public SearchDoubleField getProjectedTotal() {
        return this.projectedTotal;
    }

    public void setProjectedTotal(SearchDoubleField projectedTotal) {
        this.projectedTotal = projectedTotal;
    }

    public SearchDoubleField getRangeHigh() {
        return this.rangeHigh;
    }

    public void setRangeHigh(SearchDoubleField rangeHigh) {
        this.rangeHigh = rangeHigh;
    }

    public SearchDoubleField getRangeHighAlt() {
        return this.rangeHighAlt;
    }

    public void setRangeHighAlt(SearchDoubleField rangeHighAlt) {
        this.rangeHighAlt = rangeHighAlt;
    }

    public SearchDoubleField getRangeLow() {
        return this.rangeLow;
    }

    public void setRangeLow(SearchDoubleField rangeLow) {
        this.rangeLow = rangeLow;
    }

    public SearchDoubleField getRangeLowAlt() {
        return this.rangeLowAlt;
    }

    public void setRangeLowAlt(SearchDoubleField rangeLowAlt) {
        this.rangeLowAlt = rangeLowAlt;
    }

    public SearchMultiSelectField getSalesReadiness() {
        return this.salesReadiness;
    }

    public void setSalesReadiness(SearchMultiSelectField salesReadiness) {
        this.salesReadiness = salesReadiness;
    }

    public SearchMultiSelectField getSalesRep() {
        return this.salesRep;
    }

    public void setSalesRep(SearchMultiSelectField salesRep) {
        this.salesRep = salesRep;
    }

    public SearchMultiSelectField getSalesTeamMember() {
        return this.salesTeamMember;
    }

    public void setSalesTeamMember(SearchMultiSelectField salesTeamMember) {
        this.salesTeamMember = salesTeamMember;
    }

    public SearchMultiSelectField getSalesTeamRole() {
        return this.salesTeamRole;
    }

    public void setSalesTeamRole(SearchMultiSelectField salesTeamRole) {
        this.salesTeamRole = salesTeamRole;
    }

    public SearchEnumMultiSelectField getStatus() {
        return this.status;
    }

    public void setStatus(SearchEnumMultiSelectField status) {
        this.status = status;
    }

    public SearchMultiSelectField getSubsidiary() {
        return this.subsidiary;
    }

    public void setSubsidiary(SearchMultiSelectField subsidiary) {
        this.subsidiary = subsidiary;
    }

    public RecordRef getTaxPeriod() {
        return this.taxPeriod;
    }

    public void setTaxPeriod(RecordRef taxPeriod) {
        this.taxPeriod = taxPeriod;
    }

    public PostingPeriodDate getTaxPeriodRelative() {
        return this.taxPeriodRelative;
    }

    public void setTaxPeriodRelative(PostingPeriodDate taxPeriodRelative) {
        this.taxPeriodRelative = taxPeriodRelative;
    }

    public SearchStringField getTitle() {
        return this.title;
    }

    public void setTitle(SearchStringField title) {
        this.title = title;
    }

    public SearchDoubleField getTranCostEstimate() {
        return this.tranCostEstimate;
    }

    public void setTranCostEstimate(SearchDoubleField tranCostEstimate) {
        this.tranCostEstimate = tranCostEstimate;
    }

    public SearchDateField getTranDate() {
        return this.tranDate;
    }

    public void setTranDate(SearchDateField tranDate) {
        this.tranDate = tranDate;
    }

    public SearchDoubleField getTranEstGrossProfit() {
        return this.tranEstGrossProfit;
    }

    public void setTranEstGrossProfit(SearchDoubleField tranEstGrossProfit) {
        this.tranEstGrossProfit = tranEstGrossProfit;
    }

    public SearchDoubleField getTranEstGrossProfitPct() {
        return this.tranEstGrossProfitPct;
    }

    public void setTranEstGrossProfitPct(SearchDoubleField tranEstGrossProfitPct) {
        this.tranEstGrossProfitPct = tranEstGrossProfitPct;
    }

    public SearchDoubleField getTranFxEstGrossProfit() {
        return this.tranFxEstGrossProfit;
    }

    public void setTranFxEstGrossProfit(SearchDoubleField tranFxEstGrossProfit) {
        this.tranFxEstGrossProfit = tranFxEstGrossProfit;
    }

    public SearchStringField getTranId() {
        return this.tranId;
    }

    public void setTranId(SearchStringField tranId) {
        this.tranId = tranId;
    }

    public SearchMultiSelectField getWinLossReason() {
        return this.winLossReason;
    }

    public void setWinLossReason(SearchMultiSelectField winLossReason) {
        this.winLossReason = winLossReason;
    }

    public SearchMultiSelectField getWonBy() {
        return this.wonBy;
    }

    public void setWonBy(SearchMultiSelectField wonBy) {
        this.wonBy = wonBy;
    }

    public SearchCustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof OpportunitySearchBasic)) {
            return false;
        }
        OpportunitySearchBasic other = (OpportunitySearchBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.amount == null && other.getAmount() == null || this.amount != null && this.amount.equals(other.getAmount())) && (this.availableOffline == null && other.getAvailableOffline() == null || this.availableOffline != null && this.availableOffline.equals(other.getAvailableOffline())) && (this.buyingReason == null && other.getBuyingReason() == null || this.buyingReason != null && this.buyingReason.equals(other.getBuyingReason())) && (this.buyingTimeFrame == null && other.getBuyingTimeFrame() == null || this.buyingTimeFrame != null && this.buyingTimeFrame.equals(other.getBuyingTimeFrame())) && (this._class == null && other.get_class() == null || this._class != null && this._class.equals(other.get_class())) && (this.closeDate == null && other.getCloseDate() == null || this.closeDate != null && this.closeDate.equals(other.getCloseDate())) && (this.competitor == null && other.getCompetitor() == null || this.competitor != null && this.competitor.equals(other.getCompetitor())) && (this.contribution == null && other.getContribution() == null || this.contribution != null && this.contribution.equals(other.getContribution())) && (this.currency == null && other.getCurrency() == null || this.currency != null && this.currency.equals(other.getCurrency())) && (this.custType == null && other.getCustType() == null || this.custType != null && this.custType.equals(other.getCustType())) && (this.dateCreated == null && other.getDateCreated() == null || this.dateCreated != null && this.dateCreated.equals(other.getDateCreated())) && (this.daysOpen == null && other.getDaysOpen() == null || this.daysOpen != null && this.daysOpen.equals(other.getDaysOpen())) && (this.daysToClose == null && other.getDaysToClose() == null || this.daysToClose != null && this.daysToClose.equals(other.getDaysToClose())) && (this.department == null && other.getDepartment() == null || this.department != null && this.department.equals(other.getDepartment())) && (this.entity == null && other.getEntity() == null || this.entity != null && this.entity.equals(other.getEntity())) && (this.entityStatus == null && other.getEntityStatus() == null || this.entityStatus != null && this.entityStatus.equals(other.getEntityStatus())) && (this.estimatedBudget == null && other.getEstimatedBudget() == null || this.estimatedBudget != null && this.estimatedBudget.equals(other.getEstimatedBudget())) && (this.expectedCloseDate == null && other.getExpectedCloseDate() == null || this.expectedCloseDate != null && this.expectedCloseDate.equals(other.getExpectedCloseDate())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId())) && (this.externalIdString == null && other.getExternalIdString() == null || this.externalIdString != null && this.externalIdString.equals(other.getExternalIdString())) && (this.forecastType == null && other.getForecastType() == null || this.forecastType != null && this.forecastType.equals(other.getForecastType())) && (this.foreignProjectedAmount == null && other.getForeignProjectedAmount() == null || this.foreignProjectedAmount != null && this.foreignProjectedAmount.equals(other.getForeignProjectedAmount())) && (this.foreignRangeHigh == null && other.getForeignRangeHigh() == null || this.foreignRangeHigh != null && this.foreignRangeHigh.equals(other.getForeignRangeHigh())) && (this.foreignRangeLow == null && other.getForeignRangeLow() == null || this.foreignRangeLow != null && this.foreignRangeLow.equals(other.getForeignRangeLow())) && (this.fxTranCostEstimate == null && other.getFxTranCostEstimate() == null || this.fxTranCostEstimate != null && this.fxTranCostEstimate.equals(other.getFxTranCostEstimate())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.internalIdNumber == null && other.getInternalIdNumber() == null || this.internalIdNumber != null && this.internalIdNumber.equals(other.getInternalIdNumber())) && (this.isBudgetApproved == null && other.getIsBudgetApproved() == null || this.isBudgetApproved != null && this.isBudgetApproved.equals(other.getIsBudgetApproved())) && (this.item == null && other.getItem() == null || this.item != null && this.item.equals(other.getItem())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && this.lastModifiedDate.equals(other.getLastModifiedDate())) && (this.leadSource == null && other.getLeadSource() == null || this.leadSource != null && this.leadSource.equals(other.getLeadSource())) && (this.location == null && other.getLocation() == null || this.location != null && this.location.equals(other.getLocation())) && (this.memo == null && other.getMemo() == null || this.memo != null && this.memo.equals(other.getMemo())) && (this.number == null && other.getNumber() == null || this.number != null && this.number.equals(other.getNumber())) && (this.partner == null && other.getPartner() == null || this.partner != null && this.partner.equals(other.getPartner())) && (this.partnerContribution == null && other.getPartnerContribution() == null || this.partnerContribution != null && this.partnerContribution.equals(other.getPartnerContribution())) && (this.partnerRole == null && other.getPartnerRole() == null || this.partnerRole != null && this.partnerRole.equals(other.getPartnerRole())) && (this.partnerTeamMember == null && other.getPartnerTeamMember() == null || this.partnerTeamMember != null && this.partnerTeamMember.equals(other.getPartnerTeamMember())) && (this.postingPeriod == null && other.getPostingPeriod() == null || this.postingPeriod != null && this.postingPeriod.equals(other.getPostingPeriod())) && (this.postingPeriodRelative == null && other.getPostingPeriodRelative() == null || this.postingPeriodRelative != null && this.postingPeriodRelative.equals(other.getPostingPeriodRelative())) && (this.probability == null && other.getProbability() == null || this.probability != null && this.probability.equals(other.getProbability())) && (this.projAltSalesAmt == null && other.getProjAltSalesAmt() == null || this.projAltSalesAmt != null && this.projAltSalesAmt.equals(other.getProjAltSalesAmt())) && (this.projectedTotal == null && other.getProjectedTotal() == null || this.projectedTotal != null && this.projectedTotal.equals(other.getProjectedTotal())) && (this.rangeHigh == null && other.getRangeHigh() == null || this.rangeHigh != null && this.rangeHigh.equals(other.getRangeHigh())) && (this.rangeHighAlt == null && other.getRangeHighAlt() == null || this.rangeHighAlt != null && this.rangeHighAlt.equals(other.getRangeHighAlt())) && (this.rangeLow == null && other.getRangeLow() == null || this.rangeLow != null && this.rangeLow.equals(other.getRangeLow())) && (this.rangeLowAlt == null && other.getRangeLowAlt() == null || this.rangeLowAlt != null && this.rangeLowAlt.equals(other.getRangeLowAlt())) && (this.salesReadiness == null && other.getSalesReadiness() == null || this.salesReadiness != null && this.salesReadiness.equals(other.getSalesReadiness())) && (this.salesRep == null && other.getSalesRep() == null || this.salesRep != null && this.salesRep.equals(other.getSalesRep())) && (this.salesTeamMember == null && other.getSalesTeamMember() == null || this.salesTeamMember != null && this.salesTeamMember.equals(other.getSalesTeamMember())) && (this.salesTeamRole == null && other.getSalesTeamRole() == null || this.salesTeamRole != null && this.salesTeamRole.equals(other.getSalesTeamRole())) && (this.status == null && other.getStatus() == null || this.status != null && this.status.equals(other.getStatus())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && this.subsidiary.equals(other.getSubsidiary())) && (this.taxPeriod == null && other.getTaxPeriod() == null || this.taxPeriod != null && this.taxPeriod.equals(other.getTaxPeriod())) && (this.taxPeriodRelative == null && other.getTaxPeriodRelative() == null || this.taxPeriodRelative != null && this.taxPeriodRelative.equals(other.getTaxPeriodRelative())) && (this.title == null && other.getTitle() == null || this.title != null && this.title.equals(other.getTitle())) && (this.tranCostEstimate == null && other.getTranCostEstimate() == null || this.tranCostEstimate != null && this.tranCostEstimate.equals(other.getTranCostEstimate())) && (this.tranDate == null && other.getTranDate() == null || this.tranDate != null && this.tranDate.equals(other.getTranDate())) && (this.tranEstGrossProfit == null && other.getTranEstGrossProfit() == null || this.tranEstGrossProfit != null && this.tranEstGrossProfit.equals(other.getTranEstGrossProfit())) && (this.tranEstGrossProfitPct == null && other.getTranEstGrossProfitPct() == null || this.tranEstGrossProfitPct != null && this.tranEstGrossProfitPct.equals(other.getTranEstGrossProfitPct())) && (this.tranFxEstGrossProfit == null && other.getTranFxEstGrossProfit() == null || this.tranFxEstGrossProfit != null && this.tranFxEstGrossProfit.equals(other.getTranFxEstGrossProfit())) && (this.tranId == null && other.getTranId() == null || this.tranId != null && this.tranId.equals(other.getTranId())) && (this.winLossReason == null && other.getWinLossReason() == null || this.winLossReason != null && this.winLossReason.equals(other.getWinLossReason())) && (this.wonBy == null && other.getWonBy() == null || this.wonBy != null && this.wonBy.equals(other.getWonBy())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
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
        if (this.getAmount() != null) {
            _hashCode += this.getAmount().hashCode();
        }
        if (this.getAvailableOffline() != null) {
            _hashCode += this.getAvailableOffline().hashCode();
        }
        if (this.getBuyingReason() != null) {
            _hashCode += this.getBuyingReason().hashCode();
        }
        if (this.getBuyingTimeFrame() != null) {
            _hashCode += this.getBuyingTimeFrame().hashCode();
        }
        if (this.get_class() != null) {
            _hashCode += this.get_class().hashCode();
        }
        if (this.getCloseDate() != null) {
            _hashCode += this.getCloseDate().hashCode();
        }
        if (this.getCompetitor() != null) {
            _hashCode += this.getCompetitor().hashCode();
        }
        if (this.getContribution() != null) {
            _hashCode += this.getContribution().hashCode();
        }
        if (this.getCurrency() != null) {
            _hashCode += this.getCurrency().hashCode();
        }
        if (this.getCustType() != null) {
            _hashCode += this.getCustType().hashCode();
        }
        if (this.getDateCreated() != null) {
            _hashCode += this.getDateCreated().hashCode();
        }
        if (this.getDaysOpen() != null) {
            _hashCode += this.getDaysOpen().hashCode();
        }
        if (this.getDaysToClose() != null) {
            _hashCode += this.getDaysToClose().hashCode();
        }
        if (this.getDepartment() != null) {
            _hashCode += this.getDepartment().hashCode();
        }
        if (this.getEntity() != null) {
            _hashCode += this.getEntity().hashCode();
        }
        if (this.getEntityStatus() != null) {
            _hashCode += this.getEntityStatus().hashCode();
        }
        if (this.getEstimatedBudget() != null) {
            _hashCode += this.getEstimatedBudget().hashCode();
        }
        if (this.getExpectedCloseDate() != null) {
            _hashCode += this.getExpectedCloseDate().hashCode();
        }
        if (this.getExternalId() != null) {
            _hashCode += this.getExternalId().hashCode();
        }
        if (this.getExternalIdString() != null) {
            _hashCode += this.getExternalIdString().hashCode();
        }
        if (this.getForecastType() != null) {
            _hashCode += this.getForecastType().hashCode();
        }
        if (this.getForeignProjectedAmount() != null) {
            _hashCode += this.getForeignProjectedAmount().hashCode();
        }
        if (this.getForeignRangeHigh() != null) {
            _hashCode += this.getForeignRangeHigh().hashCode();
        }
        if (this.getForeignRangeLow() != null) {
            _hashCode += this.getForeignRangeLow().hashCode();
        }
        if (this.getFxTranCostEstimate() != null) {
            _hashCode += this.getFxTranCostEstimate().hashCode();
        }
        if (this.getInternalId() != null) {
            _hashCode += this.getInternalId().hashCode();
        }
        if (this.getInternalIdNumber() != null) {
            _hashCode += this.getInternalIdNumber().hashCode();
        }
        if (this.getIsBudgetApproved() != null) {
            _hashCode += this.getIsBudgetApproved().hashCode();
        }
        if (this.getItem() != null) {
            _hashCode += this.getItem().hashCode();
        }
        if (this.getLastModifiedDate() != null) {
            _hashCode += this.getLastModifiedDate().hashCode();
        }
        if (this.getLeadSource() != null) {
            _hashCode += this.getLeadSource().hashCode();
        }
        if (this.getLocation() != null) {
            _hashCode += this.getLocation().hashCode();
        }
        if (this.getMemo() != null) {
            _hashCode += this.getMemo().hashCode();
        }
        if (this.getNumber() != null) {
            _hashCode += this.getNumber().hashCode();
        }
        if (this.getPartner() != null) {
            _hashCode += this.getPartner().hashCode();
        }
        if (this.getPartnerContribution() != null) {
            _hashCode += this.getPartnerContribution().hashCode();
        }
        if (this.getPartnerRole() != null) {
            _hashCode += this.getPartnerRole().hashCode();
        }
        if (this.getPartnerTeamMember() != null) {
            _hashCode += this.getPartnerTeamMember().hashCode();
        }
        if (this.getPostingPeriod() != null) {
            _hashCode += this.getPostingPeriod().hashCode();
        }
        if (this.getPostingPeriodRelative() != null) {
            _hashCode += this.getPostingPeriodRelative().hashCode();
        }
        if (this.getProbability() != null) {
            _hashCode += this.getProbability().hashCode();
        }
        if (this.getProjAltSalesAmt() != null) {
            _hashCode += this.getProjAltSalesAmt().hashCode();
        }
        if (this.getProjectedTotal() != null) {
            _hashCode += this.getProjectedTotal().hashCode();
        }
        if (this.getRangeHigh() != null) {
            _hashCode += this.getRangeHigh().hashCode();
        }
        if (this.getRangeHighAlt() != null) {
            _hashCode += this.getRangeHighAlt().hashCode();
        }
        if (this.getRangeLow() != null) {
            _hashCode += this.getRangeLow().hashCode();
        }
        if (this.getRangeLowAlt() != null) {
            _hashCode += this.getRangeLowAlt().hashCode();
        }
        if (this.getSalesReadiness() != null) {
            _hashCode += this.getSalesReadiness().hashCode();
        }
        if (this.getSalesRep() != null) {
            _hashCode += this.getSalesRep().hashCode();
        }
        if (this.getSalesTeamMember() != null) {
            _hashCode += this.getSalesTeamMember().hashCode();
        }
        if (this.getSalesTeamRole() != null) {
            _hashCode += this.getSalesTeamRole().hashCode();
        }
        if (this.getStatus() != null) {
            _hashCode += this.getStatus().hashCode();
        }
        if (this.getSubsidiary() != null) {
            _hashCode += this.getSubsidiary().hashCode();
        }
        if (this.getTaxPeriod() != null) {
            _hashCode += this.getTaxPeriod().hashCode();
        }
        if (this.getTaxPeriodRelative() != null) {
            _hashCode += this.getTaxPeriodRelative().hashCode();
        }
        if (this.getTitle() != null) {
            _hashCode += this.getTitle().hashCode();
        }
        if (this.getTranCostEstimate() != null) {
            _hashCode += this.getTranCostEstimate().hashCode();
        }
        if (this.getTranDate() != null) {
            _hashCode += this.getTranDate().hashCode();
        }
        if (this.getTranEstGrossProfit() != null) {
            _hashCode += this.getTranEstGrossProfit().hashCode();
        }
        if (this.getTranEstGrossProfitPct() != null) {
            _hashCode += this.getTranEstGrossProfitPct().hashCode();
        }
        if (this.getTranFxEstGrossProfit() != null) {
            _hashCode += this.getTranFxEstGrossProfit().hashCode();
        }
        if (this.getTranId() != null) {
            _hashCode += this.getTranId().hashCode();
        }
        if (this.getWinLossReason() != null) {
            _hashCode += this.getWinLossReason().hashCode();
        }
        if (this.getWonBy() != null) {
            _hashCode += this.getWonBy().hashCode();
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "OpportunitySearchBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "amount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("availableOffline");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "availableOffline"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("buyingReason");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "buyingReason"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("buyingTimeFrame");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "buyingTimeFrame"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "class"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("closeDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "closeDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("competitor");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "competitor"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("contribution");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "contribution"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("custType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "custType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("dateCreated");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "dateCreated"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("daysOpen");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "daysOpen"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("daysToClose");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "daysToClose"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "department"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("entity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "entity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("entityStatus");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "entityStatus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("estimatedBudget");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "estimatedBudget"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("expectedCloseDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "expectedCloseDate"));
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
        elemField.setFieldName("forecastType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "forecastType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("foreignProjectedAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "foreignProjectedAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("foreignRangeHigh");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "foreignRangeHigh"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("foreignRangeLow");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "foreignRangeLow"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fxTranCostEstimate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fxTranCostEstimate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
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
        elemField.setFieldName("isBudgetApproved");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isBudgetApproved"));
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
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("leadSource");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "leadSource"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "location"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
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
        elemField.setFieldName("partner");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "partner"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("partnerContribution");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "partnerContribution"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("partnerRole");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "partnerRole"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("partnerTeamMember");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "partnerTeamMember"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("postingPeriod");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "postingPeriod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("postingPeriodRelative");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "postingPeriodRelative"));
        elemField.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "PostingPeriodDate"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("probability");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "probability"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("projAltSalesAmt");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "projAltSalesAmt"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("projectedTotal");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "projectedTotal"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("rangeHigh");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "rangeHigh"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("rangeHighAlt");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "rangeHighAlt"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("rangeLow");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "rangeLow"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("rangeLowAlt");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "rangeLowAlt"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("salesReadiness");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "salesReadiness"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("salesRep");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "salesRep"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("salesTeamMember");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "salesTeamMember"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("salesTeamRole");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "salesTeamRole"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxPeriod");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "taxPeriod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxPeriodRelative");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "taxPeriodRelative"));
        elemField.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "PostingPeriodDate"));
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
        elemField.setFieldName("tranCostEstimate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "tranCostEstimate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("tranDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "tranDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("tranEstGrossProfit");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "tranEstGrossProfit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("tranEstGrossProfitPct");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "tranEstGrossProfitPct"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("tranFxEstGrossProfit");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "tranFxEstGrossProfit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("tranId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "tranId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("winLossReason");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "winLossReason"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("wonBy");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "wonBy"));
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

