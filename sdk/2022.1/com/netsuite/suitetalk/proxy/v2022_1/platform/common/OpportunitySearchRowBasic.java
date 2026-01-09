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

public class OpportunitySearchRowBasic
extends SearchRowBasic
implements Serializable {
    private SearchColumnStringField[] actionItem;
    private SearchColumnBooleanField[] availableOffline;
    private SearchColumnStringField[] buyingReason;
    private SearchColumnStringField[] buyingTimeFrame;
    private SearchColumnSelectField[] _class;
    private SearchColumnDateField[] closeDate;
    private SearchColumnSelectField[] competitor;
    private SearchColumnDoubleField[] contribution;
    private SearchColumnDoubleField[] contributionPrimary;
    private SearchColumnSelectField[] currency;
    private SearchColumnStringField[] custType;
    private SearchColumnDateField[] dateCreated;
    private SearchColumnLongField[] daysOpen;
    private SearchColumnLongField[] daysToClose;
    private SearchColumnSelectField[] decisionMaker;
    private SearchColumnSelectField[] department;
    private SearchColumnSelectField[] entity;
    private SearchColumnSelectField[] entityStatus;
    private SearchColumnDoubleField[] estimatedBudget;
    private SearchColumnDateField[] expectedCloseDate;
    private SearchColumnSelectField[] externalId;
    private SearchColumnEnumSelectField[] forecastType;
    private SearchColumnDoubleField[] foreignProjectedAmount;
    private SearchColumnDoubleField[] foreignRangeHigh;
    private SearchColumnDoubleField[] foreignRangeLow;
    private SearchColumnDoubleField[] fxTranCostEstimate;
    private SearchColumnSelectField[] internalId;
    private SearchColumnBooleanField[] isBudgetApproved;
    private SearchColumnDateField[] lastModifiedDate;
    private SearchColumnSelectField[] leadSource;
    private SearchColumnSelectField[] location;
    private SearchColumnStringField[] memo;
    private SearchColumnSelectField[] partner;
    private SearchColumnDoubleField[] partnerContribution;
    private SearchColumnSelectField[] partnerRole;
    private SearchColumnSelectField[] partnerTeamMember;
    private SearchColumnStringField[] period;
    private SearchColumnDoubleField[] probability;
    private SearchColumnDoubleField[] projAltSalesAmt;
    private SearchColumnDoubleField[] projectedTotal;
    private SearchColumnDoubleField[] rangeHigh;
    private SearchColumnDoubleField[] rangeHighAlt;
    private SearchColumnDoubleField[] rangeLow;
    private SearchColumnDoubleField[] rangeLowAlt;
    private SearchColumnStringField[] salesReadiness;
    private SearchColumnSelectField[] salesRep;
    private SearchColumnSelectField[] salesTeamMember;
    private SearchColumnSelectField[] salesTeamRole;
    private SearchColumnEnumSelectField[] status;
    private SearchColumnSelectField[] subsidiary;
    private SearchColumnSelectField[] taxPeriod;
    private SearchColumnStringField[] title;
    private SearchColumnDoubleField[] total;
    private SearchColumnDoubleField[] tranCostEstimate;
    private SearchColumnDateField[] tranDate;
    private SearchColumnDoubleField[] tranEstGrossProfit;
    private SearchColumnDoubleField[] tranEstGrossProfitPct;
    private SearchColumnDoubleField[] tranFxEstGrossProfit;
    private SearchColumnStringField[] tranId;
    private SearchColumnDoubleField[] weightedTotal;
    private SearchColumnSelectField[] winLossReason;
    private SearchColumnSelectField[] wonBy;
    private SearchColumnCustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(OpportunitySearchRowBasic.class, true);

    public OpportunitySearchRowBasic() {
    }

    public OpportunitySearchRowBasic(SearchColumnStringField[] actionItem, SearchColumnBooleanField[] availableOffline, SearchColumnStringField[] buyingReason, SearchColumnStringField[] buyingTimeFrame, SearchColumnSelectField[] _class, SearchColumnDateField[] closeDate, SearchColumnSelectField[] competitor, SearchColumnDoubleField[] contribution, SearchColumnDoubleField[] contributionPrimary, SearchColumnSelectField[] currency, SearchColumnStringField[] custType, SearchColumnDateField[] dateCreated, SearchColumnLongField[] daysOpen, SearchColumnLongField[] daysToClose, SearchColumnSelectField[] decisionMaker, SearchColumnSelectField[] department, SearchColumnSelectField[] entity, SearchColumnSelectField[] entityStatus, SearchColumnDoubleField[] estimatedBudget, SearchColumnDateField[] expectedCloseDate, SearchColumnSelectField[] externalId, SearchColumnEnumSelectField[] forecastType, SearchColumnDoubleField[] foreignProjectedAmount, SearchColumnDoubleField[] foreignRangeHigh, SearchColumnDoubleField[] foreignRangeLow, SearchColumnDoubleField[] fxTranCostEstimate, SearchColumnSelectField[] internalId, SearchColumnBooleanField[] isBudgetApproved, SearchColumnDateField[] lastModifiedDate, SearchColumnSelectField[] leadSource, SearchColumnSelectField[] location, SearchColumnStringField[] memo, SearchColumnSelectField[] partner, SearchColumnDoubleField[] partnerContribution, SearchColumnSelectField[] partnerRole, SearchColumnSelectField[] partnerTeamMember, SearchColumnStringField[] period, SearchColumnDoubleField[] probability, SearchColumnDoubleField[] projAltSalesAmt, SearchColumnDoubleField[] projectedTotal, SearchColumnDoubleField[] rangeHigh, SearchColumnDoubleField[] rangeHighAlt, SearchColumnDoubleField[] rangeLow, SearchColumnDoubleField[] rangeLowAlt, SearchColumnStringField[] salesReadiness, SearchColumnSelectField[] salesRep, SearchColumnSelectField[] salesTeamMember, SearchColumnSelectField[] salesTeamRole, SearchColumnEnumSelectField[] status, SearchColumnSelectField[] subsidiary, SearchColumnSelectField[] taxPeriod, SearchColumnStringField[] title, SearchColumnDoubleField[] total, SearchColumnDoubleField[] tranCostEstimate, SearchColumnDateField[] tranDate, SearchColumnDoubleField[] tranEstGrossProfit, SearchColumnDoubleField[] tranEstGrossProfitPct, SearchColumnDoubleField[] tranFxEstGrossProfit, SearchColumnStringField[] tranId, SearchColumnDoubleField[] weightedTotal, SearchColumnSelectField[] winLossReason, SearchColumnSelectField[] wonBy, SearchColumnCustomFieldList customFieldList) {
        this.actionItem = actionItem;
        this.availableOffline = availableOffline;
        this.buyingReason = buyingReason;
        this.buyingTimeFrame = buyingTimeFrame;
        this._class = _class;
        this.closeDate = closeDate;
        this.competitor = competitor;
        this.contribution = contribution;
        this.contributionPrimary = contributionPrimary;
        this.currency = currency;
        this.custType = custType;
        this.dateCreated = dateCreated;
        this.daysOpen = daysOpen;
        this.daysToClose = daysToClose;
        this.decisionMaker = decisionMaker;
        this.department = department;
        this.entity = entity;
        this.entityStatus = entityStatus;
        this.estimatedBudget = estimatedBudget;
        this.expectedCloseDate = expectedCloseDate;
        this.externalId = externalId;
        this.forecastType = forecastType;
        this.foreignProjectedAmount = foreignProjectedAmount;
        this.foreignRangeHigh = foreignRangeHigh;
        this.foreignRangeLow = foreignRangeLow;
        this.fxTranCostEstimate = fxTranCostEstimate;
        this.internalId = internalId;
        this.isBudgetApproved = isBudgetApproved;
        this.lastModifiedDate = lastModifiedDate;
        this.leadSource = leadSource;
        this.location = location;
        this.memo = memo;
        this.partner = partner;
        this.partnerContribution = partnerContribution;
        this.partnerRole = partnerRole;
        this.partnerTeamMember = partnerTeamMember;
        this.period = period;
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
        this.title = title;
        this.total = total;
        this.tranCostEstimate = tranCostEstimate;
        this.tranDate = tranDate;
        this.tranEstGrossProfit = tranEstGrossProfit;
        this.tranEstGrossProfitPct = tranEstGrossProfitPct;
        this.tranFxEstGrossProfit = tranFxEstGrossProfit;
        this.tranId = tranId;
        this.weightedTotal = weightedTotal;
        this.winLossReason = winLossReason;
        this.wonBy = wonBy;
        this.customFieldList = customFieldList;
    }

    public SearchColumnStringField[] getActionItem() {
        return this.actionItem;
    }

    public void setActionItem(SearchColumnStringField[] actionItem) {
        this.actionItem = actionItem;
    }

    public SearchColumnStringField getActionItem(int i) {
        return this.actionItem[i];
    }

    public void setActionItem(int i, SearchColumnStringField _value) {
        this.actionItem[i] = _value;
    }

    public SearchColumnBooleanField[] getAvailableOffline() {
        return this.availableOffline;
    }

    public void setAvailableOffline(SearchColumnBooleanField[] availableOffline) {
        this.availableOffline = availableOffline;
    }

    public SearchColumnBooleanField getAvailableOffline(int i) {
        return this.availableOffline[i];
    }

    public void setAvailableOffline(int i, SearchColumnBooleanField _value) {
        this.availableOffline[i] = _value;
    }

    public SearchColumnStringField[] getBuyingReason() {
        return this.buyingReason;
    }

    public void setBuyingReason(SearchColumnStringField[] buyingReason) {
        this.buyingReason = buyingReason;
    }

    public SearchColumnStringField getBuyingReason(int i) {
        return this.buyingReason[i];
    }

    public void setBuyingReason(int i, SearchColumnStringField _value) {
        this.buyingReason[i] = _value;
    }

    public SearchColumnStringField[] getBuyingTimeFrame() {
        return this.buyingTimeFrame;
    }

    public void setBuyingTimeFrame(SearchColumnStringField[] buyingTimeFrame) {
        this.buyingTimeFrame = buyingTimeFrame;
    }

    public SearchColumnStringField getBuyingTimeFrame(int i) {
        return this.buyingTimeFrame[i];
    }

    public void setBuyingTimeFrame(int i, SearchColumnStringField _value) {
        this.buyingTimeFrame[i] = _value;
    }

    public SearchColumnSelectField[] get_class() {
        return this._class;
    }

    public void set_class(SearchColumnSelectField[] _class) {
        this._class = _class;
    }

    public SearchColumnSelectField get_class(int i) {
        return this._class[i];
    }

    public void set_class(int i, SearchColumnSelectField _value) {
        this._class[i] = _value;
    }

    public SearchColumnDateField[] getCloseDate() {
        return this.closeDate;
    }

    public void setCloseDate(SearchColumnDateField[] closeDate) {
        this.closeDate = closeDate;
    }

    public SearchColumnDateField getCloseDate(int i) {
        return this.closeDate[i];
    }

    public void setCloseDate(int i, SearchColumnDateField _value) {
        this.closeDate[i] = _value;
    }

    public SearchColumnSelectField[] getCompetitor() {
        return this.competitor;
    }

    public void setCompetitor(SearchColumnSelectField[] competitor) {
        this.competitor = competitor;
    }

    public SearchColumnSelectField getCompetitor(int i) {
        return this.competitor[i];
    }

    public void setCompetitor(int i, SearchColumnSelectField _value) {
        this.competitor[i] = _value;
    }

    public SearchColumnDoubleField[] getContribution() {
        return this.contribution;
    }

    public void setContribution(SearchColumnDoubleField[] contribution) {
        this.contribution = contribution;
    }

    public SearchColumnDoubleField getContribution(int i) {
        return this.contribution[i];
    }

    public void setContribution(int i, SearchColumnDoubleField _value) {
        this.contribution[i] = _value;
    }

    public SearchColumnDoubleField[] getContributionPrimary() {
        return this.contributionPrimary;
    }

    public void setContributionPrimary(SearchColumnDoubleField[] contributionPrimary) {
        this.contributionPrimary = contributionPrimary;
    }

    public SearchColumnDoubleField getContributionPrimary(int i) {
        return this.contributionPrimary[i];
    }

    public void setContributionPrimary(int i, SearchColumnDoubleField _value) {
        this.contributionPrimary[i] = _value;
    }

    public SearchColumnSelectField[] getCurrency() {
        return this.currency;
    }

    public void setCurrency(SearchColumnSelectField[] currency) {
        this.currency = currency;
    }

    public SearchColumnSelectField getCurrency(int i) {
        return this.currency[i];
    }

    public void setCurrency(int i, SearchColumnSelectField _value) {
        this.currency[i] = _value;
    }

    public SearchColumnStringField[] getCustType() {
        return this.custType;
    }

    public void setCustType(SearchColumnStringField[] custType) {
        this.custType = custType;
    }

    public SearchColumnStringField getCustType(int i) {
        return this.custType[i];
    }

    public void setCustType(int i, SearchColumnStringField _value) {
        this.custType[i] = _value;
    }

    public SearchColumnDateField[] getDateCreated() {
        return this.dateCreated;
    }

    public void setDateCreated(SearchColumnDateField[] dateCreated) {
        this.dateCreated = dateCreated;
    }

    public SearchColumnDateField getDateCreated(int i) {
        return this.dateCreated[i];
    }

    public void setDateCreated(int i, SearchColumnDateField _value) {
        this.dateCreated[i] = _value;
    }

    public SearchColumnLongField[] getDaysOpen() {
        return this.daysOpen;
    }

    public void setDaysOpen(SearchColumnLongField[] daysOpen) {
        this.daysOpen = daysOpen;
    }

    public SearchColumnLongField getDaysOpen(int i) {
        return this.daysOpen[i];
    }

    public void setDaysOpen(int i, SearchColumnLongField _value) {
        this.daysOpen[i] = _value;
    }

    public SearchColumnLongField[] getDaysToClose() {
        return this.daysToClose;
    }

    public void setDaysToClose(SearchColumnLongField[] daysToClose) {
        this.daysToClose = daysToClose;
    }

    public SearchColumnLongField getDaysToClose(int i) {
        return this.daysToClose[i];
    }

    public void setDaysToClose(int i, SearchColumnLongField _value) {
        this.daysToClose[i] = _value;
    }

    public SearchColumnSelectField[] getDecisionMaker() {
        return this.decisionMaker;
    }

    public void setDecisionMaker(SearchColumnSelectField[] decisionMaker) {
        this.decisionMaker = decisionMaker;
    }

    public SearchColumnSelectField getDecisionMaker(int i) {
        return this.decisionMaker[i];
    }

    public void setDecisionMaker(int i, SearchColumnSelectField _value) {
        this.decisionMaker[i] = _value;
    }

    public SearchColumnSelectField[] getDepartment() {
        return this.department;
    }

    public void setDepartment(SearchColumnSelectField[] department) {
        this.department = department;
    }

    public SearchColumnSelectField getDepartment(int i) {
        return this.department[i];
    }

    public void setDepartment(int i, SearchColumnSelectField _value) {
        this.department[i] = _value;
    }

    public SearchColumnSelectField[] getEntity() {
        return this.entity;
    }

    public void setEntity(SearchColumnSelectField[] entity) {
        this.entity = entity;
    }

    public SearchColumnSelectField getEntity(int i) {
        return this.entity[i];
    }

    public void setEntity(int i, SearchColumnSelectField _value) {
        this.entity[i] = _value;
    }

    public SearchColumnSelectField[] getEntityStatus() {
        return this.entityStatus;
    }

    public void setEntityStatus(SearchColumnSelectField[] entityStatus) {
        this.entityStatus = entityStatus;
    }

    public SearchColumnSelectField getEntityStatus(int i) {
        return this.entityStatus[i];
    }

    public void setEntityStatus(int i, SearchColumnSelectField _value) {
        this.entityStatus[i] = _value;
    }

    public SearchColumnDoubleField[] getEstimatedBudget() {
        return this.estimatedBudget;
    }

    public void setEstimatedBudget(SearchColumnDoubleField[] estimatedBudget) {
        this.estimatedBudget = estimatedBudget;
    }

    public SearchColumnDoubleField getEstimatedBudget(int i) {
        return this.estimatedBudget[i];
    }

    public void setEstimatedBudget(int i, SearchColumnDoubleField _value) {
        this.estimatedBudget[i] = _value;
    }

    public SearchColumnDateField[] getExpectedCloseDate() {
        return this.expectedCloseDate;
    }

    public void setExpectedCloseDate(SearchColumnDateField[] expectedCloseDate) {
        this.expectedCloseDate = expectedCloseDate;
    }

    public SearchColumnDateField getExpectedCloseDate(int i) {
        return this.expectedCloseDate[i];
    }

    public void setExpectedCloseDate(int i, SearchColumnDateField _value) {
        this.expectedCloseDate[i] = _value;
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

    public SearchColumnEnumSelectField[] getForecastType() {
        return this.forecastType;
    }

    public void setForecastType(SearchColumnEnumSelectField[] forecastType) {
        this.forecastType = forecastType;
    }

    public SearchColumnEnumSelectField getForecastType(int i) {
        return this.forecastType[i];
    }

    public void setForecastType(int i, SearchColumnEnumSelectField _value) {
        this.forecastType[i] = _value;
    }

    public SearchColumnDoubleField[] getForeignProjectedAmount() {
        return this.foreignProjectedAmount;
    }

    public void setForeignProjectedAmount(SearchColumnDoubleField[] foreignProjectedAmount) {
        this.foreignProjectedAmount = foreignProjectedAmount;
    }

    public SearchColumnDoubleField getForeignProjectedAmount(int i) {
        return this.foreignProjectedAmount[i];
    }

    public void setForeignProjectedAmount(int i, SearchColumnDoubleField _value) {
        this.foreignProjectedAmount[i] = _value;
    }

    public SearchColumnDoubleField[] getForeignRangeHigh() {
        return this.foreignRangeHigh;
    }

    public void setForeignRangeHigh(SearchColumnDoubleField[] foreignRangeHigh) {
        this.foreignRangeHigh = foreignRangeHigh;
    }

    public SearchColumnDoubleField getForeignRangeHigh(int i) {
        return this.foreignRangeHigh[i];
    }

    public void setForeignRangeHigh(int i, SearchColumnDoubleField _value) {
        this.foreignRangeHigh[i] = _value;
    }

    public SearchColumnDoubleField[] getForeignRangeLow() {
        return this.foreignRangeLow;
    }

    public void setForeignRangeLow(SearchColumnDoubleField[] foreignRangeLow) {
        this.foreignRangeLow = foreignRangeLow;
    }

    public SearchColumnDoubleField getForeignRangeLow(int i) {
        return this.foreignRangeLow[i];
    }

    public void setForeignRangeLow(int i, SearchColumnDoubleField _value) {
        this.foreignRangeLow[i] = _value;
    }

    public SearchColumnDoubleField[] getFxTranCostEstimate() {
        return this.fxTranCostEstimate;
    }

    public void setFxTranCostEstimate(SearchColumnDoubleField[] fxTranCostEstimate) {
        this.fxTranCostEstimate = fxTranCostEstimate;
    }

    public SearchColumnDoubleField getFxTranCostEstimate(int i) {
        return this.fxTranCostEstimate[i];
    }

    public void setFxTranCostEstimate(int i, SearchColumnDoubleField _value) {
        this.fxTranCostEstimate[i] = _value;
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

    public SearchColumnBooleanField[] getIsBudgetApproved() {
        return this.isBudgetApproved;
    }

    public void setIsBudgetApproved(SearchColumnBooleanField[] isBudgetApproved) {
        this.isBudgetApproved = isBudgetApproved;
    }

    public SearchColumnBooleanField getIsBudgetApproved(int i) {
        return this.isBudgetApproved[i];
    }

    public void setIsBudgetApproved(int i, SearchColumnBooleanField _value) {
        this.isBudgetApproved[i] = _value;
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

    public SearchColumnSelectField[] getLeadSource() {
        return this.leadSource;
    }

    public void setLeadSource(SearchColumnSelectField[] leadSource) {
        this.leadSource = leadSource;
    }

    public SearchColumnSelectField getLeadSource(int i) {
        return this.leadSource[i];
    }

    public void setLeadSource(int i, SearchColumnSelectField _value) {
        this.leadSource[i] = _value;
    }

    public SearchColumnSelectField[] getLocation() {
        return this.location;
    }

    public void setLocation(SearchColumnSelectField[] location) {
        this.location = location;
    }

    public SearchColumnSelectField getLocation(int i) {
        return this.location[i];
    }

    public void setLocation(int i, SearchColumnSelectField _value) {
        this.location[i] = _value;
    }

    public SearchColumnStringField[] getMemo() {
        return this.memo;
    }

    public void setMemo(SearchColumnStringField[] memo) {
        this.memo = memo;
    }

    public SearchColumnStringField getMemo(int i) {
        return this.memo[i];
    }

    public void setMemo(int i, SearchColumnStringField _value) {
        this.memo[i] = _value;
    }

    public SearchColumnSelectField[] getPartner() {
        return this.partner;
    }

    public void setPartner(SearchColumnSelectField[] partner) {
        this.partner = partner;
    }

    public SearchColumnSelectField getPartner(int i) {
        return this.partner[i];
    }

    public void setPartner(int i, SearchColumnSelectField _value) {
        this.partner[i] = _value;
    }

    public SearchColumnDoubleField[] getPartnerContribution() {
        return this.partnerContribution;
    }

    public void setPartnerContribution(SearchColumnDoubleField[] partnerContribution) {
        this.partnerContribution = partnerContribution;
    }

    public SearchColumnDoubleField getPartnerContribution(int i) {
        return this.partnerContribution[i];
    }

    public void setPartnerContribution(int i, SearchColumnDoubleField _value) {
        this.partnerContribution[i] = _value;
    }

    public SearchColumnSelectField[] getPartnerRole() {
        return this.partnerRole;
    }

    public void setPartnerRole(SearchColumnSelectField[] partnerRole) {
        this.partnerRole = partnerRole;
    }

    public SearchColumnSelectField getPartnerRole(int i) {
        return this.partnerRole[i];
    }

    public void setPartnerRole(int i, SearchColumnSelectField _value) {
        this.partnerRole[i] = _value;
    }

    public SearchColumnSelectField[] getPartnerTeamMember() {
        return this.partnerTeamMember;
    }

    public void setPartnerTeamMember(SearchColumnSelectField[] partnerTeamMember) {
        this.partnerTeamMember = partnerTeamMember;
    }

    public SearchColumnSelectField getPartnerTeamMember(int i) {
        return this.partnerTeamMember[i];
    }

    public void setPartnerTeamMember(int i, SearchColumnSelectField _value) {
        this.partnerTeamMember[i] = _value;
    }

    public SearchColumnStringField[] getPeriod() {
        return this.period;
    }

    public void setPeriod(SearchColumnStringField[] period) {
        this.period = period;
    }

    public SearchColumnStringField getPeriod(int i) {
        return this.period[i];
    }

    public void setPeriod(int i, SearchColumnStringField _value) {
        this.period[i] = _value;
    }

    public SearchColumnDoubleField[] getProbability() {
        return this.probability;
    }

    public void setProbability(SearchColumnDoubleField[] probability) {
        this.probability = probability;
    }

    public SearchColumnDoubleField getProbability(int i) {
        return this.probability[i];
    }

    public void setProbability(int i, SearchColumnDoubleField _value) {
        this.probability[i] = _value;
    }

    public SearchColumnDoubleField[] getProjAltSalesAmt() {
        return this.projAltSalesAmt;
    }

    public void setProjAltSalesAmt(SearchColumnDoubleField[] projAltSalesAmt) {
        this.projAltSalesAmt = projAltSalesAmt;
    }

    public SearchColumnDoubleField getProjAltSalesAmt(int i) {
        return this.projAltSalesAmt[i];
    }

    public void setProjAltSalesAmt(int i, SearchColumnDoubleField _value) {
        this.projAltSalesAmt[i] = _value;
    }

    public SearchColumnDoubleField[] getProjectedTotal() {
        return this.projectedTotal;
    }

    public void setProjectedTotal(SearchColumnDoubleField[] projectedTotal) {
        this.projectedTotal = projectedTotal;
    }

    public SearchColumnDoubleField getProjectedTotal(int i) {
        return this.projectedTotal[i];
    }

    public void setProjectedTotal(int i, SearchColumnDoubleField _value) {
        this.projectedTotal[i] = _value;
    }

    public SearchColumnDoubleField[] getRangeHigh() {
        return this.rangeHigh;
    }

    public void setRangeHigh(SearchColumnDoubleField[] rangeHigh) {
        this.rangeHigh = rangeHigh;
    }

    public SearchColumnDoubleField getRangeHigh(int i) {
        return this.rangeHigh[i];
    }

    public void setRangeHigh(int i, SearchColumnDoubleField _value) {
        this.rangeHigh[i] = _value;
    }

    public SearchColumnDoubleField[] getRangeHighAlt() {
        return this.rangeHighAlt;
    }

    public void setRangeHighAlt(SearchColumnDoubleField[] rangeHighAlt) {
        this.rangeHighAlt = rangeHighAlt;
    }

    public SearchColumnDoubleField getRangeHighAlt(int i) {
        return this.rangeHighAlt[i];
    }

    public void setRangeHighAlt(int i, SearchColumnDoubleField _value) {
        this.rangeHighAlt[i] = _value;
    }

    public SearchColumnDoubleField[] getRangeLow() {
        return this.rangeLow;
    }

    public void setRangeLow(SearchColumnDoubleField[] rangeLow) {
        this.rangeLow = rangeLow;
    }

    public SearchColumnDoubleField getRangeLow(int i) {
        return this.rangeLow[i];
    }

    public void setRangeLow(int i, SearchColumnDoubleField _value) {
        this.rangeLow[i] = _value;
    }

    public SearchColumnDoubleField[] getRangeLowAlt() {
        return this.rangeLowAlt;
    }

    public void setRangeLowAlt(SearchColumnDoubleField[] rangeLowAlt) {
        this.rangeLowAlt = rangeLowAlt;
    }

    public SearchColumnDoubleField getRangeLowAlt(int i) {
        return this.rangeLowAlt[i];
    }

    public void setRangeLowAlt(int i, SearchColumnDoubleField _value) {
        this.rangeLowAlt[i] = _value;
    }

    public SearchColumnStringField[] getSalesReadiness() {
        return this.salesReadiness;
    }

    public void setSalesReadiness(SearchColumnStringField[] salesReadiness) {
        this.salesReadiness = salesReadiness;
    }

    public SearchColumnStringField getSalesReadiness(int i) {
        return this.salesReadiness[i];
    }

    public void setSalesReadiness(int i, SearchColumnStringField _value) {
        this.salesReadiness[i] = _value;
    }

    public SearchColumnSelectField[] getSalesRep() {
        return this.salesRep;
    }

    public void setSalesRep(SearchColumnSelectField[] salesRep) {
        this.salesRep = salesRep;
    }

    public SearchColumnSelectField getSalesRep(int i) {
        return this.salesRep[i];
    }

    public void setSalesRep(int i, SearchColumnSelectField _value) {
        this.salesRep[i] = _value;
    }

    public SearchColumnSelectField[] getSalesTeamMember() {
        return this.salesTeamMember;
    }

    public void setSalesTeamMember(SearchColumnSelectField[] salesTeamMember) {
        this.salesTeamMember = salesTeamMember;
    }

    public SearchColumnSelectField getSalesTeamMember(int i) {
        return this.salesTeamMember[i];
    }

    public void setSalesTeamMember(int i, SearchColumnSelectField _value) {
        this.salesTeamMember[i] = _value;
    }

    public SearchColumnSelectField[] getSalesTeamRole() {
        return this.salesTeamRole;
    }

    public void setSalesTeamRole(SearchColumnSelectField[] salesTeamRole) {
        this.salesTeamRole = salesTeamRole;
    }

    public SearchColumnSelectField getSalesTeamRole(int i) {
        return this.salesTeamRole[i];
    }

    public void setSalesTeamRole(int i, SearchColumnSelectField _value) {
        this.salesTeamRole[i] = _value;
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

    public SearchColumnSelectField[] getSubsidiary() {
        return this.subsidiary;
    }

    public void setSubsidiary(SearchColumnSelectField[] subsidiary) {
        this.subsidiary = subsidiary;
    }

    public SearchColumnSelectField getSubsidiary(int i) {
        return this.subsidiary[i];
    }

    public void setSubsidiary(int i, SearchColumnSelectField _value) {
        this.subsidiary[i] = _value;
    }

    public SearchColumnSelectField[] getTaxPeriod() {
        return this.taxPeriod;
    }

    public void setTaxPeriod(SearchColumnSelectField[] taxPeriod) {
        this.taxPeriod = taxPeriod;
    }

    public SearchColumnSelectField getTaxPeriod(int i) {
        return this.taxPeriod[i];
    }

    public void setTaxPeriod(int i, SearchColumnSelectField _value) {
        this.taxPeriod[i] = _value;
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

    public SearchColumnDoubleField[] getTotal() {
        return this.total;
    }

    public void setTotal(SearchColumnDoubleField[] total) {
        this.total = total;
    }

    public SearchColumnDoubleField getTotal(int i) {
        return this.total[i];
    }

    public void setTotal(int i, SearchColumnDoubleField _value) {
        this.total[i] = _value;
    }

    public SearchColumnDoubleField[] getTranCostEstimate() {
        return this.tranCostEstimate;
    }

    public void setTranCostEstimate(SearchColumnDoubleField[] tranCostEstimate) {
        this.tranCostEstimate = tranCostEstimate;
    }

    public SearchColumnDoubleField getTranCostEstimate(int i) {
        return this.tranCostEstimate[i];
    }

    public void setTranCostEstimate(int i, SearchColumnDoubleField _value) {
        this.tranCostEstimate[i] = _value;
    }

    public SearchColumnDateField[] getTranDate() {
        return this.tranDate;
    }

    public void setTranDate(SearchColumnDateField[] tranDate) {
        this.tranDate = tranDate;
    }

    public SearchColumnDateField getTranDate(int i) {
        return this.tranDate[i];
    }

    public void setTranDate(int i, SearchColumnDateField _value) {
        this.tranDate[i] = _value;
    }

    public SearchColumnDoubleField[] getTranEstGrossProfit() {
        return this.tranEstGrossProfit;
    }

    public void setTranEstGrossProfit(SearchColumnDoubleField[] tranEstGrossProfit) {
        this.tranEstGrossProfit = tranEstGrossProfit;
    }

    public SearchColumnDoubleField getTranEstGrossProfit(int i) {
        return this.tranEstGrossProfit[i];
    }

    public void setTranEstGrossProfit(int i, SearchColumnDoubleField _value) {
        this.tranEstGrossProfit[i] = _value;
    }

    public SearchColumnDoubleField[] getTranEstGrossProfitPct() {
        return this.tranEstGrossProfitPct;
    }

    public void setTranEstGrossProfitPct(SearchColumnDoubleField[] tranEstGrossProfitPct) {
        this.tranEstGrossProfitPct = tranEstGrossProfitPct;
    }

    public SearchColumnDoubleField getTranEstGrossProfitPct(int i) {
        return this.tranEstGrossProfitPct[i];
    }

    public void setTranEstGrossProfitPct(int i, SearchColumnDoubleField _value) {
        this.tranEstGrossProfitPct[i] = _value;
    }

    public SearchColumnDoubleField[] getTranFxEstGrossProfit() {
        return this.tranFxEstGrossProfit;
    }

    public void setTranFxEstGrossProfit(SearchColumnDoubleField[] tranFxEstGrossProfit) {
        this.tranFxEstGrossProfit = tranFxEstGrossProfit;
    }

    public SearchColumnDoubleField getTranFxEstGrossProfit(int i) {
        return this.tranFxEstGrossProfit[i];
    }

    public void setTranFxEstGrossProfit(int i, SearchColumnDoubleField _value) {
        this.tranFxEstGrossProfit[i] = _value;
    }

    public SearchColumnStringField[] getTranId() {
        return this.tranId;
    }

    public void setTranId(SearchColumnStringField[] tranId) {
        this.tranId = tranId;
    }

    public SearchColumnStringField getTranId(int i) {
        return this.tranId[i];
    }

    public void setTranId(int i, SearchColumnStringField _value) {
        this.tranId[i] = _value;
    }

    public SearchColumnDoubleField[] getWeightedTotal() {
        return this.weightedTotal;
    }

    public void setWeightedTotal(SearchColumnDoubleField[] weightedTotal) {
        this.weightedTotal = weightedTotal;
    }

    public SearchColumnDoubleField getWeightedTotal(int i) {
        return this.weightedTotal[i];
    }

    public void setWeightedTotal(int i, SearchColumnDoubleField _value) {
        this.weightedTotal[i] = _value;
    }

    public SearchColumnSelectField[] getWinLossReason() {
        return this.winLossReason;
    }

    public void setWinLossReason(SearchColumnSelectField[] winLossReason) {
        this.winLossReason = winLossReason;
    }

    public SearchColumnSelectField getWinLossReason(int i) {
        return this.winLossReason[i];
    }

    public void setWinLossReason(int i, SearchColumnSelectField _value) {
        this.winLossReason[i] = _value;
    }

    public SearchColumnSelectField[] getWonBy() {
        return this.wonBy;
    }

    public void setWonBy(SearchColumnSelectField[] wonBy) {
        this.wonBy = wonBy;
    }

    public SearchColumnSelectField getWonBy(int i) {
        return this.wonBy[i];
    }

    public void setWonBy(int i, SearchColumnSelectField _value) {
        this.wonBy[i] = _value;
    }

    public SearchColumnCustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof OpportunitySearchRowBasic)) {
            return false;
        }
        OpportunitySearchRowBasic other = (OpportunitySearchRowBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.actionItem == null && other.getActionItem() == null || this.actionItem != null && Arrays.equals(this.actionItem, other.getActionItem())) && (this.availableOffline == null && other.getAvailableOffline() == null || this.availableOffline != null && Arrays.equals(this.availableOffline, other.getAvailableOffline())) && (this.buyingReason == null && other.getBuyingReason() == null || this.buyingReason != null && Arrays.equals(this.buyingReason, other.getBuyingReason())) && (this.buyingTimeFrame == null && other.getBuyingTimeFrame() == null || this.buyingTimeFrame != null && Arrays.equals(this.buyingTimeFrame, other.getBuyingTimeFrame())) && (this._class == null && other.get_class() == null || this._class != null && Arrays.equals(this._class, other.get_class())) && (this.closeDate == null && other.getCloseDate() == null || this.closeDate != null && Arrays.equals(this.closeDate, other.getCloseDate())) && (this.competitor == null && other.getCompetitor() == null || this.competitor != null && Arrays.equals(this.competitor, other.getCompetitor())) && (this.contribution == null && other.getContribution() == null || this.contribution != null && Arrays.equals(this.contribution, other.getContribution())) && (this.contributionPrimary == null && other.getContributionPrimary() == null || this.contributionPrimary != null && Arrays.equals(this.contributionPrimary, other.getContributionPrimary())) && (this.currency == null && other.getCurrency() == null || this.currency != null && Arrays.equals(this.currency, other.getCurrency())) && (this.custType == null && other.getCustType() == null || this.custType != null && Arrays.equals(this.custType, other.getCustType())) && (this.dateCreated == null && other.getDateCreated() == null || this.dateCreated != null && Arrays.equals(this.dateCreated, other.getDateCreated())) && (this.daysOpen == null && other.getDaysOpen() == null || this.daysOpen != null && Arrays.equals(this.daysOpen, other.getDaysOpen())) && (this.daysToClose == null && other.getDaysToClose() == null || this.daysToClose != null && Arrays.equals(this.daysToClose, other.getDaysToClose())) && (this.decisionMaker == null && other.getDecisionMaker() == null || this.decisionMaker != null && Arrays.equals(this.decisionMaker, other.getDecisionMaker())) && (this.department == null && other.getDepartment() == null || this.department != null && Arrays.equals(this.department, other.getDepartment())) && (this.entity == null && other.getEntity() == null || this.entity != null && Arrays.equals(this.entity, other.getEntity())) && (this.entityStatus == null && other.getEntityStatus() == null || this.entityStatus != null && Arrays.equals(this.entityStatus, other.getEntityStatus())) && (this.estimatedBudget == null && other.getEstimatedBudget() == null || this.estimatedBudget != null && Arrays.equals(this.estimatedBudget, other.getEstimatedBudget())) && (this.expectedCloseDate == null && other.getExpectedCloseDate() == null || this.expectedCloseDate != null && Arrays.equals(this.expectedCloseDate, other.getExpectedCloseDate())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && Arrays.equals(this.externalId, other.getExternalId())) && (this.forecastType == null && other.getForecastType() == null || this.forecastType != null && Arrays.equals(this.forecastType, other.getForecastType())) && (this.foreignProjectedAmount == null && other.getForeignProjectedAmount() == null || this.foreignProjectedAmount != null && Arrays.equals(this.foreignProjectedAmount, other.getForeignProjectedAmount())) && (this.foreignRangeHigh == null && other.getForeignRangeHigh() == null || this.foreignRangeHigh != null && Arrays.equals(this.foreignRangeHigh, other.getForeignRangeHigh())) && (this.foreignRangeLow == null && other.getForeignRangeLow() == null || this.foreignRangeLow != null && Arrays.equals(this.foreignRangeLow, other.getForeignRangeLow())) && (this.fxTranCostEstimate == null && other.getFxTranCostEstimate() == null || this.fxTranCostEstimate != null && Arrays.equals(this.fxTranCostEstimate, other.getFxTranCostEstimate())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && Arrays.equals(this.internalId, other.getInternalId())) && (this.isBudgetApproved == null && other.getIsBudgetApproved() == null || this.isBudgetApproved != null && Arrays.equals(this.isBudgetApproved, other.getIsBudgetApproved())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && Arrays.equals(this.lastModifiedDate, other.getLastModifiedDate())) && (this.leadSource == null && other.getLeadSource() == null || this.leadSource != null && Arrays.equals(this.leadSource, other.getLeadSource())) && (this.location == null && other.getLocation() == null || this.location != null && Arrays.equals(this.location, other.getLocation())) && (this.memo == null && other.getMemo() == null || this.memo != null && Arrays.equals(this.memo, other.getMemo())) && (this.partner == null && other.getPartner() == null || this.partner != null && Arrays.equals(this.partner, other.getPartner())) && (this.partnerContribution == null && other.getPartnerContribution() == null || this.partnerContribution != null && Arrays.equals(this.partnerContribution, other.getPartnerContribution())) && (this.partnerRole == null && other.getPartnerRole() == null || this.partnerRole != null && Arrays.equals(this.partnerRole, other.getPartnerRole())) && (this.partnerTeamMember == null && other.getPartnerTeamMember() == null || this.partnerTeamMember != null && Arrays.equals(this.partnerTeamMember, other.getPartnerTeamMember())) && (this.period == null && other.getPeriod() == null || this.period != null && Arrays.equals(this.period, other.getPeriod())) && (this.probability == null && other.getProbability() == null || this.probability != null && Arrays.equals(this.probability, other.getProbability())) && (this.projAltSalesAmt == null && other.getProjAltSalesAmt() == null || this.projAltSalesAmt != null && Arrays.equals(this.projAltSalesAmt, other.getProjAltSalesAmt())) && (this.projectedTotal == null && other.getProjectedTotal() == null || this.projectedTotal != null && Arrays.equals(this.projectedTotal, other.getProjectedTotal())) && (this.rangeHigh == null && other.getRangeHigh() == null || this.rangeHigh != null && Arrays.equals(this.rangeHigh, other.getRangeHigh())) && (this.rangeHighAlt == null && other.getRangeHighAlt() == null || this.rangeHighAlt != null && Arrays.equals(this.rangeHighAlt, other.getRangeHighAlt())) && (this.rangeLow == null && other.getRangeLow() == null || this.rangeLow != null && Arrays.equals(this.rangeLow, other.getRangeLow())) && (this.rangeLowAlt == null && other.getRangeLowAlt() == null || this.rangeLowAlt != null && Arrays.equals(this.rangeLowAlt, other.getRangeLowAlt())) && (this.salesReadiness == null && other.getSalesReadiness() == null || this.salesReadiness != null && Arrays.equals(this.salesReadiness, other.getSalesReadiness())) && (this.salesRep == null && other.getSalesRep() == null || this.salesRep != null && Arrays.equals(this.salesRep, other.getSalesRep())) && (this.salesTeamMember == null && other.getSalesTeamMember() == null || this.salesTeamMember != null && Arrays.equals(this.salesTeamMember, other.getSalesTeamMember())) && (this.salesTeamRole == null && other.getSalesTeamRole() == null || this.salesTeamRole != null && Arrays.equals(this.salesTeamRole, other.getSalesTeamRole())) && (this.status == null && other.getStatus() == null || this.status != null && Arrays.equals(this.status, other.getStatus())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && Arrays.equals(this.subsidiary, other.getSubsidiary())) && (this.taxPeriod == null && other.getTaxPeriod() == null || this.taxPeriod != null && Arrays.equals(this.taxPeriod, other.getTaxPeriod())) && (this.title == null && other.getTitle() == null || this.title != null && Arrays.equals(this.title, other.getTitle())) && (this.total == null && other.getTotal() == null || this.total != null && Arrays.equals(this.total, other.getTotal())) && (this.tranCostEstimate == null && other.getTranCostEstimate() == null || this.tranCostEstimate != null && Arrays.equals(this.tranCostEstimate, other.getTranCostEstimate())) && (this.tranDate == null && other.getTranDate() == null || this.tranDate != null && Arrays.equals(this.tranDate, other.getTranDate())) && (this.tranEstGrossProfit == null && other.getTranEstGrossProfit() == null || this.tranEstGrossProfit != null && Arrays.equals(this.tranEstGrossProfit, other.getTranEstGrossProfit())) && (this.tranEstGrossProfitPct == null && other.getTranEstGrossProfitPct() == null || this.tranEstGrossProfitPct != null && Arrays.equals(this.tranEstGrossProfitPct, other.getTranEstGrossProfitPct())) && (this.tranFxEstGrossProfit == null && other.getTranFxEstGrossProfit() == null || this.tranFxEstGrossProfit != null && Arrays.equals(this.tranFxEstGrossProfit, other.getTranFxEstGrossProfit())) && (this.tranId == null && other.getTranId() == null || this.tranId != null && Arrays.equals(this.tranId, other.getTranId())) && (this.weightedTotal == null && other.getWeightedTotal() == null || this.weightedTotal != null && Arrays.equals(this.weightedTotal, other.getWeightedTotal())) && (this.winLossReason == null && other.getWinLossReason() == null || this.winLossReason != null && Arrays.equals(this.winLossReason, other.getWinLossReason())) && (this.wonBy == null && other.getWonBy() == null || this.wonBy != null && Arrays.equals(this.wonBy, other.getWonBy())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
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
        if (this.getActionItem() != null) {
            for (i = 0; i < Array.getLength(this.getActionItem()); ++i) {
                obj = Array.get(this.getActionItem(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAvailableOffline() != null) {
            for (i = 0; i < Array.getLength(this.getAvailableOffline()); ++i) {
                obj = Array.get(this.getAvailableOffline(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBuyingReason() != null) {
            for (i = 0; i < Array.getLength(this.getBuyingReason()); ++i) {
                obj = Array.get(this.getBuyingReason(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBuyingTimeFrame() != null) {
            for (i = 0; i < Array.getLength(this.getBuyingTimeFrame()); ++i) {
                obj = Array.get(this.getBuyingTimeFrame(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.get_class() != null) {
            for (i = 0; i < Array.getLength(this.get_class()); ++i) {
                obj = Array.get(this.get_class(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCloseDate() != null) {
            for (i = 0; i < Array.getLength(this.getCloseDate()); ++i) {
                obj = Array.get(this.getCloseDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCompetitor() != null) {
            for (i = 0; i < Array.getLength(this.getCompetitor()); ++i) {
                obj = Array.get(this.getCompetitor(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getContribution() != null) {
            for (i = 0; i < Array.getLength(this.getContribution()); ++i) {
                obj = Array.get(this.getContribution(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getContributionPrimary() != null) {
            for (i = 0; i < Array.getLength(this.getContributionPrimary()); ++i) {
                obj = Array.get(this.getContributionPrimary(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCurrency() != null) {
            for (i = 0; i < Array.getLength(this.getCurrency()); ++i) {
                obj = Array.get(this.getCurrency(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCustType() != null) {
            for (i = 0; i < Array.getLength(this.getCustType()); ++i) {
                obj = Array.get(this.getCustType(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDateCreated() != null) {
            for (i = 0; i < Array.getLength(this.getDateCreated()); ++i) {
                obj = Array.get(this.getDateCreated(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDaysOpen() != null) {
            for (i = 0; i < Array.getLength(this.getDaysOpen()); ++i) {
                obj = Array.get(this.getDaysOpen(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDaysToClose() != null) {
            for (i = 0; i < Array.getLength(this.getDaysToClose()); ++i) {
                obj = Array.get(this.getDaysToClose(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDecisionMaker() != null) {
            for (i = 0; i < Array.getLength(this.getDecisionMaker()); ++i) {
                obj = Array.get(this.getDecisionMaker(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDepartment() != null) {
            for (i = 0; i < Array.getLength(this.getDepartment()); ++i) {
                obj = Array.get(this.getDepartment(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getEntity() != null) {
            for (i = 0; i < Array.getLength(this.getEntity()); ++i) {
                obj = Array.get(this.getEntity(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getEntityStatus() != null) {
            for (i = 0; i < Array.getLength(this.getEntityStatus()); ++i) {
                obj = Array.get(this.getEntityStatus(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getEstimatedBudget() != null) {
            for (i = 0; i < Array.getLength(this.getEstimatedBudget()); ++i) {
                obj = Array.get(this.getEstimatedBudget(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getExpectedCloseDate() != null) {
            for (i = 0; i < Array.getLength(this.getExpectedCloseDate()); ++i) {
                obj = Array.get(this.getExpectedCloseDate(), i);
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
        if (this.getForecastType() != null) {
            for (i = 0; i < Array.getLength(this.getForecastType()); ++i) {
                obj = Array.get(this.getForecastType(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getForeignProjectedAmount() != null) {
            for (i = 0; i < Array.getLength(this.getForeignProjectedAmount()); ++i) {
                obj = Array.get(this.getForeignProjectedAmount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getForeignRangeHigh() != null) {
            for (i = 0; i < Array.getLength(this.getForeignRangeHigh()); ++i) {
                obj = Array.get(this.getForeignRangeHigh(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getForeignRangeLow() != null) {
            for (i = 0; i < Array.getLength(this.getForeignRangeLow()); ++i) {
                obj = Array.get(this.getForeignRangeLow(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getFxTranCostEstimate() != null) {
            for (i = 0; i < Array.getLength(this.getFxTranCostEstimate()); ++i) {
                obj = Array.get(this.getFxTranCostEstimate(), i);
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
        if (this.getIsBudgetApproved() != null) {
            for (i = 0; i < Array.getLength(this.getIsBudgetApproved()); ++i) {
                obj = Array.get(this.getIsBudgetApproved(), i);
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
        if (this.getLeadSource() != null) {
            for (i = 0; i < Array.getLength(this.getLeadSource()); ++i) {
                obj = Array.get(this.getLeadSource(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLocation() != null) {
            for (i = 0; i < Array.getLength(this.getLocation()); ++i) {
                obj = Array.get(this.getLocation(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getMemo() != null) {
            for (i = 0; i < Array.getLength(this.getMemo()); ++i) {
                obj = Array.get(this.getMemo(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPartner() != null) {
            for (i = 0; i < Array.getLength(this.getPartner()); ++i) {
                obj = Array.get(this.getPartner(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPartnerContribution() != null) {
            for (i = 0; i < Array.getLength(this.getPartnerContribution()); ++i) {
                obj = Array.get(this.getPartnerContribution(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPartnerRole() != null) {
            for (i = 0; i < Array.getLength(this.getPartnerRole()); ++i) {
                obj = Array.get(this.getPartnerRole(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPartnerTeamMember() != null) {
            for (i = 0; i < Array.getLength(this.getPartnerTeamMember()); ++i) {
                obj = Array.get(this.getPartnerTeamMember(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPeriod() != null) {
            for (i = 0; i < Array.getLength(this.getPeriod()); ++i) {
                obj = Array.get(this.getPeriod(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getProbability() != null) {
            for (i = 0; i < Array.getLength(this.getProbability()); ++i) {
                obj = Array.get(this.getProbability(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getProjAltSalesAmt() != null) {
            for (i = 0; i < Array.getLength(this.getProjAltSalesAmt()); ++i) {
                obj = Array.get(this.getProjAltSalesAmt(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getProjectedTotal() != null) {
            for (i = 0; i < Array.getLength(this.getProjectedTotal()); ++i) {
                obj = Array.get(this.getProjectedTotal(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRangeHigh() != null) {
            for (i = 0; i < Array.getLength(this.getRangeHigh()); ++i) {
                obj = Array.get(this.getRangeHigh(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRangeHighAlt() != null) {
            for (i = 0; i < Array.getLength(this.getRangeHighAlt()); ++i) {
                obj = Array.get(this.getRangeHighAlt(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRangeLow() != null) {
            for (i = 0; i < Array.getLength(this.getRangeLow()); ++i) {
                obj = Array.get(this.getRangeLow(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRangeLowAlt() != null) {
            for (i = 0; i < Array.getLength(this.getRangeLowAlt()); ++i) {
                obj = Array.get(this.getRangeLowAlt(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSalesReadiness() != null) {
            for (i = 0; i < Array.getLength(this.getSalesReadiness()); ++i) {
                obj = Array.get(this.getSalesReadiness(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSalesRep() != null) {
            for (i = 0; i < Array.getLength(this.getSalesRep()); ++i) {
                obj = Array.get(this.getSalesRep(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSalesTeamMember() != null) {
            for (i = 0; i < Array.getLength(this.getSalesTeamMember()); ++i) {
                obj = Array.get(this.getSalesTeamMember(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSalesTeamRole() != null) {
            for (i = 0; i < Array.getLength(this.getSalesTeamRole()); ++i) {
                obj = Array.get(this.getSalesTeamRole(), i);
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
        if (this.getSubsidiary() != null) {
            for (i = 0; i < Array.getLength(this.getSubsidiary()); ++i) {
                obj = Array.get(this.getSubsidiary(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTaxPeriod() != null) {
            for (i = 0; i < Array.getLength(this.getTaxPeriod()); ++i) {
                obj = Array.get(this.getTaxPeriod(), i);
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
        if (this.getTotal() != null) {
            for (i = 0; i < Array.getLength(this.getTotal()); ++i) {
                obj = Array.get(this.getTotal(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTranCostEstimate() != null) {
            for (i = 0; i < Array.getLength(this.getTranCostEstimate()); ++i) {
                obj = Array.get(this.getTranCostEstimate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTranDate() != null) {
            for (i = 0; i < Array.getLength(this.getTranDate()); ++i) {
                obj = Array.get(this.getTranDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTranEstGrossProfit() != null) {
            for (i = 0; i < Array.getLength(this.getTranEstGrossProfit()); ++i) {
                obj = Array.get(this.getTranEstGrossProfit(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTranEstGrossProfitPct() != null) {
            for (i = 0; i < Array.getLength(this.getTranEstGrossProfitPct()); ++i) {
                obj = Array.get(this.getTranEstGrossProfitPct(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTranFxEstGrossProfit() != null) {
            for (i = 0; i < Array.getLength(this.getTranFxEstGrossProfit()); ++i) {
                obj = Array.get(this.getTranFxEstGrossProfit(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTranId() != null) {
            for (i = 0; i < Array.getLength(this.getTranId()); ++i) {
                obj = Array.get(this.getTranId(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getWeightedTotal() != null) {
            for (i = 0; i < Array.getLength(this.getWeightedTotal()); ++i) {
                obj = Array.get(this.getWeightedTotal(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getWinLossReason() != null) {
            for (i = 0; i < Array.getLength(this.getWinLossReason()); ++i) {
                obj = Array.get(this.getWinLossReason(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getWonBy() != null) {
            for (i = 0; i < Array.getLength(this.getWonBy()); ++i) {
                obj = Array.get(this.getWonBy(), i);
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "OpportunitySearchRowBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("actionItem");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "actionItem"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("availableOffline");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "availableOffline"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("buyingReason");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "buyingReason"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("buyingTimeFrame");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "buyingTimeFrame"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "class"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("closeDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "closeDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("competitor");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "competitor"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("contribution");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "contribution"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("contributionPrimary");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "contributionPrimary"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("custType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "custType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("dateCreated");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "dateCreated"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("daysOpen");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "daysOpen"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("daysToClose");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "daysToClose"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("decisionMaker");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "decisionMaker"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "department"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("entity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "entity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("entityStatus");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "entityStatus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("estimatedBudget");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "estimatedBudget"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("expectedCloseDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "expectedCloseDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
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
        elemField.setFieldName("forecastType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "forecastType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("foreignProjectedAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "foreignProjectedAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("foreignRangeHigh");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "foreignRangeHigh"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("foreignRangeLow");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "foreignRangeLow"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fxTranCostEstimate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fxTranCostEstimate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
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
        elemField.setFieldName("isBudgetApproved");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isBudgetApproved"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
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
        elemField.setFieldName("leadSource");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "leadSource"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "location"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("partner");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "partner"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("partnerContribution");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "partnerContribution"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("partnerRole");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "partnerRole"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("partnerTeamMember");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "partnerTeamMember"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("period");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "period"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("probability");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "probability"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("projAltSalesAmt");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "projAltSalesAmt"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("projectedTotal");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "projectedTotal"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("rangeHigh");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "rangeHigh"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("rangeHighAlt");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "rangeHighAlt"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("rangeLow");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "rangeLow"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("rangeLowAlt");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "rangeLowAlt"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("salesReadiness");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "salesReadiness"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("salesRep");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "salesRep"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("salesTeamMember");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "salesTeamMember"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("salesTeamRole");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "salesTeamRole"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxPeriod");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "taxPeriod"));
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
        elemField.setFieldName("total");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "total"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("tranCostEstimate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "tranCostEstimate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("tranDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "tranDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("tranEstGrossProfit");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "tranEstGrossProfit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("tranEstGrossProfitPct");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "tranEstGrossProfitPct"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("tranFxEstGrossProfit");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "tranFxEstGrossProfit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("tranId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "tranId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("weightedTotal");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "weightedTotal"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("winLossReason");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "winLossReason"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("wonBy");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "wonBy"));
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

