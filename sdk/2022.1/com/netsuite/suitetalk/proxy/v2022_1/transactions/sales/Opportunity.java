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
package com.netsuite.suitetalk.proxy.v2022_1.transactions.sales;

import com.netsuite.suitetalk.proxy.v2022_1.platform.common.AccountingBookDetailList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.Address;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.TaxDetailsList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.CustomFieldList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.NullField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.Record;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.sales.OpportunityCompetitorsList;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.sales.OpportunityItemList;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.sales.OpportunityPartnersList;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.sales.OpportunitySalesTeamList;
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

public class Opportunity
extends Record
implements Serializable {
    private RecordRef customForm;
    private RecordRef currency;
    private Double estimatedBudget;
    private RecordRef entity;
    private RecordRef job;
    private String title;
    private String tranId;
    private RecordRef entityTaxRegNum;
    private Calendar taxPointDate;
    private Double oneTime;
    private Double recurWeekly;
    private Double recurMonthly;
    private Double recurQuarterly;
    private Double recurAnnually;
    private String source;
    private RecordRef salesRep;
    private String contribPct;
    private RecordRef partner;
    private RecordRef salesGroup;
    private Boolean syncSalesTeams;
    private RecordRef leadSource;
    private RecordRef entityStatus;
    private Double probability;
    private Calendar tranDate;
    private Calendar expectedCloseDate;
    private Long daysOpen;
    private RecordRef forecastType;
    private String currencyName;
    private Double exchangeRate;
    private Double projectedTotal;
    private Double rangeLow;
    private Double rangeHigh;
    private Double projAltSalesAmt;
    private Double altSalesRangeLow;
    private Double altSalesRangeHigh;
    private Double weightedTotal;
    private String actionItem;
    private RecordRef winLossReason;
    private String memo;
    private Double taxTotal;
    private Boolean isBudgetApproved;
    private Double tax2Total;
    private RecordRef salesReadiness;
    private Double totalCostEstimate;
    private RecordRef buyingTimeFrame;
    private Double estGrossProfit;
    private RecordRef buyingReason;
    private Double estGrossProfitPercent;
    private Address billingAddress;
    private RecordRef billAddressList;
    private Address shippingAddress;
    private Boolean shipIsResidential;
    private RecordRef shipAddressList;
    private RecordRef _class;
    private Calendar closeDate;
    private Calendar createdDate;
    private Calendar lastModifiedDate;
    private RecordRef nexus;
    private RecordRef subsidiaryTaxRegNum;
    private Boolean taxRegOverride;
    private Boolean taxDetailsOverride;
    private RecordRef department;
    private RecordRef location;
    private RecordRef subsidiary;
    private String status;
    private String vatRegNum;
    private Boolean syncPartnerTeams;
    private OpportunitySalesTeamList salesTeamList;
    private OpportunityPartnersList partnersList;
    private OpportunityItemList itemList;
    private OpportunityCompetitorsList competitorsList;
    private AccountingBookDetailList accountingBookDetailList;
    private TaxDetailsList taxDetailsList;
    private CustomFieldList customFieldList;
    private String internalId;
    private String externalId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(Opportunity.class, true);

    public Opportunity() {
    }

    public Opportunity(NullField nullFieldList, String internalId, String externalId, RecordRef customForm, RecordRef currency, Double estimatedBudget, RecordRef entity, RecordRef job, String title, String tranId, RecordRef entityTaxRegNum, Calendar taxPointDate, Double oneTime, Double recurWeekly, Double recurMonthly, Double recurQuarterly, Double recurAnnually, String source, RecordRef salesRep, String contribPct, RecordRef partner, RecordRef salesGroup, Boolean syncSalesTeams, RecordRef leadSource, RecordRef entityStatus, Double probability, Calendar tranDate, Calendar expectedCloseDate, Long daysOpen, RecordRef forecastType, String currencyName, Double exchangeRate, Double projectedTotal, Double rangeLow, Double rangeHigh, Double projAltSalesAmt, Double altSalesRangeLow, Double altSalesRangeHigh, Double weightedTotal, String actionItem, RecordRef winLossReason, String memo, Double taxTotal, Boolean isBudgetApproved, Double tax2Total, RecordRef salesReadiness, Double totalCostEstimate, RecordRef buyingTimeFrame, Double estGrossProfit, RecordRef buyingReason, Double estGrossProfitPercent, Address billingAddress, RecordRef billAddressList, Address shippingAddress, Boolean shipIsResidential, RecordRef shipAddressList, RecordRef _class, Calendar closeDate, Calendar createdDate, Calendar lastModifiedDate, RecordRef nexus, RecordRef subsidiaryTaxRegNum, Boolean taxRegOverride, Boolean taxDetailsOverride, RecordRef department, RecordRef location, RecordRef subsidiary, String status, String vatRegNum, Boolean syncPartnerTeams, OpportunitySalesTeamList salesTeamList, OpportunityPartnersList partnersList, OpportunityItemList itemList, OpportunityCompetitorsList competitorsList, AccountingBookDetailList accountingBookDetailList, TaxDetailsList taxDetailsList, CustomFieldList customFieldList) {
        super(nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.customForm = customForm;
        this.currency = currency;
        this.estimatedBudget = estimatedBudget;
        this.entity = entity;
        this.job = job;
        this.title = title;
        this.tranId = tranId;
        this.entityTaxRegNum = entityTaxRegNum;
        this.taxPointDate = taxPointDate;
        this.oneTime = oneTime;
        this.recurWeekly = recurWeekly;
        this.recurMonthly = recurMonthly;
        this.recurQuarterly = recurQuarterly;
        this.recurAnnually = recurAnnually;
        this.source = source;
        this.salesRep = salesRep;
        this.contribPct = contribPct;
        this.partner = partner;
        this.salesGroup = salesGroup;
        this.syncSalesTeams = syncSalesTeams;
        this.leadSource = leadSource;
        this.entityStatus = entityStatus;
        this.probability = probability;
        this.tranDate = tranDate;
        this.expectedCloseDate = expectedCloseDate;
        this.daysOpen = daysOpen;
        this.forecastType = forecastType;
        this.currencyName = currencyName;
        this.exchangeRate = exchangeRate;
        this.projectedTotal = projectedTotal;
        this.rangeLow = rangeLow;
        this.rangeHigh = rangeHigh;
        this.projAltSalesAmt = projAltSalesAmt;
        this.altSalesRangeLow = altSalesRangeLow;
        this.altSalesRangeHigh = altSalesRangeHigh;
        this.weightedTotal = weightedTotal;
        this.actionItem = actionItem;
        this.winLossReason = winLossReason;
        this.memo = memo;
        this.taxTotal = taxTotal;
        this.isBudgetApproved = isBudgetApproved;
        this.tax2Total = tax2Total;
        this.salesReadiness = salesReadiness;
        this.totalCostEstimate = totalCostEstimate;
        this.buyingTimeFrame = buyingTimeFrame;
        this.estGrossProfit = estGrossProfit;
        this.buyingReason = buyingReason;
        this.estGrossProfitPercent = estGrossProfitPercent;
        this.billingAddress = billingAddress;
        this.billAddressList = billAddressList;
        this.shippingAddress = shippingAddress;
        this.shipIsResidential = shipIsResidential;
        this.shipAddressList = shipAddressList;
        this._class = _class;
        this.closeDate = closeDate;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.nexus = nexus;
        this.subsidiaryTaxRegNum = subsidiaryTaxRegNum;
        this.taxRegOverride = taxRegOverride;
        this.taxDetailsOverride = taxDetailsOverride;
        this.department = department;
        this.location = location;
        this.subsidiary = subsidiary;
        this.status = status;
        this.vatRegNum = vatRegNum;
        this.syncPartnerTeams = syncPartnerTeams;
        this.salesTeamList = salesTeamList;
        this.partnersList = partnersList;
        this.itemList = itemList;
        this.competitorsList = competitorsList;
        this.accountingBookDetailList = accountingBookDetailList;
        this.taxDetailsList = taxDetailsList;
        this.customFieldList = customFieldList;
    }

    public RecordRef getCustomForm() {
        return this.customForm;
    }

    public void setCustomForm(RecordRef customForm) {
        this.customForm = customForm;
    }

    public RecordRef getCurrency() {
        return this.currency;
    }

    public void setCurrency(RecordRef currency) {
        this.currency = currency;
    }

    public Double getEstimatedBudget() {
        return this.estimatedBudget;
    }

    public void setEstimatedBudget(Double estimatedBudget) {
        this.estimatedBudget = estimatedBudget;
    }

    public RecordRef getEntity() {
        return this.entity;
    }

    public void setEntity(RecordRef entity) {
        this.entity = entity;
    }

    public RecordRef getJob() {
        return this.job;
    }

    public void setJob(RecordRef job) {
        this.job = job;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTranId() {
        return this.tranId;
    }

    public void setTranId(String tranId) {
        this.tranId = tranId;
    }

    public RecordRef getEntityTaxRegNum() {
        return this.entityTaxRegNum;
    }

    public void setEntityTaxRegNum(RecordRef entityTaxRegNum) {
        this.entityTaxRegNum = entityTaxRegNum;
    }

    public Calendar getTaxPointDate() {
        return this.taxPointDate;
    }

    public void setTaxPointDate(Calendar taxPointDate) {
        this.taxPointDate = taxPointDate;
    }

    public Double getOneTime() {
        return this.oneTime;
    }

    public void setOneTime(Double oneTime) {
        this.oneTime = oneTime;
    }

    public Double getRecurWeekly() {
        return this.recurWeekly;
    }

    public void setRecurWeekly(Double recurWeekly) {
        this.recurWeekly = recurWeekly;
    }

    public Double getRecurMonthly() {
        return this.recurMonthly;
    }

    public void setRecurMonthly(Double recurMonthly) {
        this.recurMonthly = recurMonthly;
    }

    public Double getRecurQuarterly() {
        return this.recurQuarterly;
    }

    public void setRecurQuarterly(Double recurQuarterly) {
        this.recurQuarterly = recurQuarterly;
    }

    public Double getRecurAnnually() {
        return this.recurAnnually;
    }

    public void setRecurAnnually(Double recurAnnually) {
        this.recurAnnually = recurAnnually;
    }

    public String getSource() {
        return this.source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public RecordRef getSalesRep() {
        return this.salesRep;
    }

    public void setSalesRep(RecordRef salesRep) {
        this.salesRep = salesRep;
    }

    public String getContribPct() {
        return this.contribPct;
    }

    public void setContribPct(String contribPct) {
        this.contribPct = contribPct;
    }

    public RecordRef getPartner() {
        return this.partner;
    }

    public void setPartner(RecordRef partner) {
        this.partner = partner;
    }

    public RecordRef getSalesGroup() {
        return this.salesGroup;
    }

    public void setSalesGroup(RecordRef salesGroup) {
        this.salesGroup = salesGroup;
    }

    public Boolean getSyncSalesTeams() {
        return this.syncSalesTeams;
    }

    public void setSyncSalesTeams(Boolean syncSalesTeams) {
        this.syncSalesTeams = syncSalesTeams;
    }

    public RecordRef getLeadSource() {
        return this.leadSource;
    }

    public void setLeadSource(RecordRef leadSource) {
        this.leadSource = leadSource;
    }

    public RecordRef getEntityStatus() {
        return this.entityStatus;
    }

    public void setEntityStatus(RecordRef entityStatus) {
        this.entityStatus = entityStatus;
    }

    public Double getProbability() {
        return this.probability;
    }

    public void setProbability(Double probability) {
        this.probability = probability;
    }

    public Calendar getTranDate() {
        return this.tranDate;
    }

    public void setTranDate(Calendar tranDate) {
        this.tranDate = tranDate;
    }

    public Calendar getExpectedCloseDate() {
        return this.expectedCloseDate;
    }

    public void setExpectedCloseDate(Calendar expectedCloseDate) {
        this.expectedCloseDate = expectedCloseDate;
    }

    public Long getDaysOpen() {
        return this.daysOpen;
    }

    public void setDaysOpen(Long daysOpen) {
        this.daysOpen = daysOpen;
    }

    public RecordRef getForecastType() {
        return this.forecastType;
    }

    public void setForecastType(RecordRef forecastType) {
        this.forecastType = forecastType;
    }

    public String getCurrencyName() {
        return this.currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public Double getExchangeRate() {
        return this.exchangeRate;
    }

    public void setExchangeRate(Double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public Double getProjectedTotal() {
        return this.projectedTotal;
    }

    public void setProjectedTotal(Double projectedTotal) {
        this.projectedTotal = projectedTotal;
    }

    public Double getRangeLow() {
        return this.rangeLow;
    }

    public void setRangeLow(Double rangeLow) {
        this.rangeLow = rangeLow;
    }

    public Double getRangeHigh() {
        return this.rangeHigh;
    }

    public void setRangeHigh(Double rangeHigh) {
        this.rangeHigh = rangeHigh;
    }

    public Double getProjAltSalesAmt() {
        return this.projAltSalesAmt;
    }

    public void setProjAltSalesAmt(Double projAltSalesAmt) {
        this.projAltSalesAmt = projAltSalesAmt;
    }

    public Double getAltSalesRangeLow() {
        return this.altSalesRangeLow;
    }

    public void setAltSalesRangeLow(Double altSalesRangeLow) {
        this.altSalesRangeLow = altSalesRangeLow;
    }

    public Double getAltSalesRangeHigh() {
        return this.altSalesRangeHigh;
    }

    public void setAltSalesRangeHigh(Double altSalesRangeHigh) {
        this.altSalesRangeHigh = altSalesRangeHigh;
    }

    public Double getWeightedTotal() {
        return this.weightedTotal;
    }

    public void setWeightedTotal(Double weightedTotal) {
        this.weightedTotal = weightedTotal;
    }

    public String getActionItem() {
        return this.actionItem;
    }

    public void setActionItem(String actionItem) {
        this.actionItem = actionItem;
    }

    public RecordRef getWinLossReason() {
        return this.winLossReason;
    }

    public void setWinLossReason(RecordRef winLossReason) {
        this.winLossReason = winLossReason;
    }

    public String getMemo() {
        return this.memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Double getTaxTotal() {
        return this.taxTotal;
    }

    public void setTaxTotal(Double taxTotal) {
        this.taxTotal = taxTotal;
    }

    public Boolean getIsBudgetApproved() {
        return this.isBudgetApproved;
    }

    public void setIsBudgetApproved(Boolean isBudgetApproved) {
        this.isBudgetApproved = isBudgetApproved;
    }

    public Double getTax2Total() {
        return this.tax2Total;
    }

    public void setTax2Total(Double tax2Total) {
        this.tax2Total = tax2Total;
    }

    public RecordRef getSalesReadiness() {
        return this.salesReadiness;
    }

    public void setSalesReadiness(RecordRef salesReadiness) {
        this.salesReadiness = salesReadiness;
    }

    public Double getTotalCostEstimate() {
        return this.totalCostEstimate;
    }

    public void setTotalCostEstimate(Double totalCostEstimate) {
        this.totalCostEstimate = totalCostEstimate;
    }

    public RecordRef getBuyingTimeFrame() {
        return this.buyingTimeFrame;
    }

    public void setBuyingTimeFrame(RecordRef buyingTimeFrame) {
        this.buyingTimeFrame = buyingTimeFrame;
    }

    public Double getEstGrossProfit() {
        return this.estGrossProfit;
    }

    public void setEstGrossProfit(Double estGrossProfit) {
        this.estGrossProfit = estGrossProfit;
    }

    public RecordRef getBuyingReason() {
        return this.buyingReason;
    }

    public void setBuyingReason(RecordRef buyingReason) {
        this.buyingReason = buyingReason;
    }

    public Double getEstGrossProfitPercent() {
        return this.estGrossProfitPercent;
    }

    public void setEstGrossProfitPercent(Double estGrossProfitPercent) {
        this.estGrossProfitPercent = estGrossProfitPercent;
    }

    public Address getBillingAddress() {
        return this.billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public RecordRef getBillAddressList() {
        return this.billAddressList;
    }

    public void setBillAddressList(RecordRef billAddressList) {
        this.billAddressList = billAddressList;
    }

    public Address getShippingAddress() {
        return this.shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Boolean getShipIsResidential() {
        return this.shipIsResidential;
    }

    public void setShipIsResidential(Boolean shipIsResidential) {
        this.shipIsResidential = shipIsResidential;
    }

    public RecordRef getShipAddressList() {
        return this.shipAddressList;
    }

    public void setShipAddressList(RecordRef shipAddressList) {
        this.shipAddressList = shipAddressList;
    }

    public RecordRef get_class() {
        return this._class;
    }

    public void set_class(RecordRef _class) {
        this._class = _class;
    }

    public Calendar getCloseDate() {
        return this.closeDate;
    }

    public void setCloseDate(Calendar closeDate) {
        this.closeDate = closeDate;
    }

    public Calendar getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(Calendar createdDate) {
        this.createdDate = createdDate;
    }

    public Calendar getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    public void setLastModifiedDate(Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public RecordRef getNexus() {
        return this.nexus;
    }

    public void setNexus(RecordRef nexus) {
        this.nexus = nexus;
    }

    public RecordRef getSubsidiaryTaxRegNum() {
        return this.subsidiaryTaxRegNum;
    }

    public void setSubsidiaryTaxRegNum(RecordRef subsidiaryTaxRegNum) {
        this.subsidiaryTaxRegNum = subsidiaryTaxRegNum;
    }

    public Boolean getTaxRegOverride() {
        return this.taxRegOverride;
    }

    public void setTaxRegOverride(Boolean taxRegOverride) {
        this.taxRegOverride = taxRegOverride;
    }

    public Boolean getTaxDetailsOverride() {
        return this.taxDetailsOverride;
    }

    public void setTaxDetailsOverride(Boolean taxDetailsOverride) {
        this.taxDetailsOverride = taxDetailsOverride;
    }

    public RecordRef getDepartment() {
        return this.department;
    }

    public void setDepartment(RecordRef department) {
        this.department = department;
    }

    public RecordRef getLocation() {
        return this.location;
    }

    public void setLocation(RecordRef location) {
        this.location = location;
    }

    public RecordRef getSubsidiary() {
        return this.subsidiary;
    }

    public void setSubsidiary(RecordRef subsidiary) {
        this.subsidiary = subsidiary;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getVatRegNum() {
        return this.vatRegNum;
    }

    public void setVatRegNum(String vatRegNum) {
        this.vatRegNum = vatRegNum;
    }

    public Boolean getSyncPartnerTeams() {
        return this.syncPartnerTeams;
    }

    public void setSyncPartnerTeams(Boolean syncPartnerTeams) {
        this.syncPartnerTeams = syncPartnerTeams;
    }

    public OpportunitySalesTeamList getSalesTeamList() {
        return this.salesTeamList;
    }

    public void setSalesTeamList(OpportunitySalesTeamList salesTeamList) {
        this.salesTeamList = salesTeamList;
    }

    public OpportunityPartnersList getPartnersList() {
        return this.partnersList;
    }

    public void setPartnersList(OpportunityPartnersList partnersList) {
        this.partnersList = partnersList;
    }

    public OpportunityItemList getItemList() {
        return this.itemList;
    }

    public void setItemList(OpportunityItemList itemList) {
        this.itemList = itemList;
    }

    public OpportunityCompetitorsList getCompetitorsList() {
        return this.competitorsList;
    }

    public void setCompetitorsList(OpportunityCompetitorsList competitorsList) {
        this.competitorsList = competitorsList;
    }

    public AccountingBookDetailList getAccountingBookDetailList() {
        return this.accountingBookDetailList;
    }

    public void setAccountingBookDetailList(AccountingBookDetailList accountingBookDetailList) {
        this.accountingBookDetailList = accountingBookDetailList;
    }

    public TaxDetailsList getTaxDetailsList() {
        return this.taxDetailsList;
    }

    public void setTaxDetailsList(TaxDetailsList taxDetailsList) {
        this.taxDetailsList = taxDetailsList;
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
        if (!(obj instanceof Opportunity)) {
            return false;
        }
        Opportunity other = (Opportunity)obj;
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
        boolean _equals = super.equals(obj) && (this.customForm == null && other.getCustomForm() == null || this.customForm != null && this.customForm.equals(other.getCustomForm())) && (this.currency == null && other.getCurrency() == null || this.currency != null && this.currency.equals(other.getCurrency())) && (this.estimatedBudget == null && other.getEstimatedBudget() == null || this.estimatedBudget != null && this.estimatedBudget.equals(other.getEstimatedBudget())) && (this.entity == null && other.getEntity() == null || this.entity != null && this.entity.equals(other.getEntity())) && (this.job == null && other.getJob() == null || this.job != null && this.job.equals(other.getJob())) && (this.title == null && other.getTitle() == null || this.title != null && this.title.equals(other.getTitle())) && (this.tranId == null && other.getTranId() == null || this.tranId != null && this.tranId.equals(other.getTranId())) && (this.entityTaxRegNum == null && other.getEntityTaxRegNum() == null || this.entityTaxRegNum != null && this.entityTaxRegNum.equals(other.getEntityTaxRegNum())) && (this.taxPointDate == null && other.getTaxPointDate() == null || this.taxPointDate != null && this.taxPointDate.equals(other.getTaxPointDate())) && (this.oneTime == null && other.getOneTime() == null || this.oneTime != null && this.oneTime.equals(other.getOneTime())) && (this.recurWeekly == null && other.getRecurWeekly() == null || this.recurWeekly != null && this.recurWeekly.equals(other.getRecurWeekly())) && (this.recurMonthly == null && other.getRecurMonthly() == null || this.recurMonthly != null && this.recurMonthly.equals(other.getRecurMonthly())) && (this.recurQuarterly == null && other.getRecurQuarterly() == null || this.recurQuarterly != null && this.recurQuarterly.equals(other.getRecurQuarterly())) && (this.recurAnnually == null && other.getRecurAnnually() == null || this.recurAnnually != null && this.recurAnnually.equals(other.getRecurAnnually())) && (this.source == null && other.getSource() == null || this.source != null && this.source.equals(other.getSource())) && (this.salesRep == null && other.getSalesRep() == null || this.salesRep != null && this.salesRep.equals(other.getSalesRep())) && (this.contribPct == null && other.getContribPct() == null || this.contribPct != null && this.contribPct.equals(other.getContribPct())) && (this.partner == null && other.getPartner() == null || this.partner != null && this.partner.equals(other.getPartner())) && (this.salesGroup == null && other.getSalesGroup() == null || this.salesGroup != null && this.salesGroup.equals(other.getSalesGroup())) && (this.syncSalesTeams == null && other.getSyncSalesTeams() == null || this.syncSalesTeams != null && this.syncSalesTeams.equals(other.getSyncSalesTeams())) && (this.leadSource == null && other.getLeadSource() == null || this.leadSource != null && this.leadSource.equals(other.getLeadSource())) && (this.entityStatus == null && other.getEntityStatus() == null || this.entityStatus != null && this.entityStatus.equals(other.getEntityStatus())) && (this.probability == null && other.getProbability() == null || this.probability != null && this.probability.equals(other.getProbability())) && (this.tranDate == null && other.getTranDate() == null || this.tranDate != null && this.tranDate.equals(other.getTranDate())) && (this.expectedCloseDate == null && other.getExpectedCloseDate() == null || this.expectedCloseDate != null && this.expectedCloseDate.equals(other.getExpectedCloseDate())) && (this.daysOpen == null && other.getDaysOpen() == null || this.daysOpen != null && this.daysOpen.equals(other.getDaysOpen())) && (this.forecastType == null && other.getForecastType() == null || this.forecastType != null && this.forecastType.equals(other.getForecastType())) && (this.currencyName == null && other.getCurrencyName() == null || this.currencyName != null && this.currencyName.equals(other.getCurrencyName())) && (this.exchangeRate == null && other.getExchangeRate() == null || this.exchangeRate != null && this.exchangeRate.equals(other.getExchangeRate())) && (this.projectedTotal == null && other.getProjectedTotal() == null || this.projectedTotal != null && this.projectedTotal.equals(other.getProjectedTotal())) && (this.rangeLow == null && other.getRangeLow() == null || this.rangeLow != null && this.rangeLow.equals(other.getRangeLow())) && (this.rangeHigh == null && other.getRangeHigh() == null || this.rangeHigh != null && this.rangeHigh.equals(other.getRangeHigh())) && (this.projAltSalesAmt == null && other.getProjAltSalesAmt() == null || this.projAltSalesAmt != null && this.projAltSalesAmt.equals(other.getProjAltSalesAmt())) && (this.altSalesRangeLow == null && other.getAltSalesRangeLow() == null || this.altSalesRangeLow != null && this.altSalesRangeLow.equals(other.getAltSalesRangeLow())) && (this.altSalesRangeHigh == null && other.getAltSalesRangeHigh() == null || this.altSalesRangeHigh != null && this.altSalesRangeHigh.equals(other.getAltSalesRangeHigh())) && (this.weightedTotal == null && other.getWeightedTotal() == null || this.weightedTotal != null && this.weightedTotal.equals(other.getWeightedTotal())) && (this.actionItem == null && other.getActionItem() == null || this.actionItem != null && this.actionItem.equals(other.getActionItem())) && (this.winLossReason == null && other.getWinLossReason() == null || this.winLossReason != null && this.winLossReason.equals(other.getWinLossReason())) && (this.memo == null && other.getMemo() == null || this.memo != null && this.memo.equals(other.getMemo())) && (this.taxTotal == null && other.getTaxTotal() == null || this.taxTotal != null && this.taxTotal.equals(other.getTaxTotal())) && (this.isBudgetApproved == null && other.getIsBudgetApproved() == null || this.isBudgetApproved != null && this.isBudgetApproved.equals(other.getIsBudgetApproved())) && (this.tax2Total == null && other.getTax2Total() == null || this.tax2Total != null && this.tax2Total.equals(other.getTax2Total())) && (this.salesReadiness == null && other.getSalesReadiness() == null || this.salesReadiness != null && this.salesReadiness.equals(other.getSalesReadiness())) && (this.totalCostEstimate == null && other.getTotalCostEstimate() == null || this.totalCostEstimate != null && this.totalCostEstimate.equals(other.getTotalCostEstimate())) && (this.buyingTimeFrame == null && other.getBuyingTimeFrame() == null || this.buyingTimeFrame != null && this.buyingTimeFrame.equals(other.getBuyingTimeFrame())) && (this.estGrossProfit == null && other.getEstGrossProfit() == null || this.estGrossProfit != null && this.estGrossProfit.equals(other.getEstGrossProfit())) && (this.buyingReason == null && other.getBuyingReason() == null || this.buyingReason != null && this.buyingReason.equals(other.getBuyingReason())) && (this.estGrossProfitPercent == null && other.getEstGrossProfitPercent() == null || this.estGrossProfitPercent != null && this.estGrossProfitPercent.equals(other.getEstGrossProfitPercent())) && (this.billingAddress == null && other.getBillingAddress() == null || this.billingAddress != null && this.billingAddress.equals(other.getBillingAddress())) && (this.billAddressList == null && other.getBillAddressList() == null || this.billAddressList != null && this.billAddressList.equals(other.getBillAddressList())) && (this.shippingAddress == null && other.getShippingAddress() == null || this.shippingAddress != null && this.shippingAddress.equals(other.getShippingAddress())) && (this.shipIsResidential == null && other.getShipIsResidential() == null || this.shipIsResidential != null && this.shipIsResidential.equals(other.getShipIsResidential())) && (this.shipAddressList == null && other.getShipAddressList() == null || this.shipAddressList != null && this.shipAddressList.equals(other.getShipAddressList())) && (this._class == null && other.get_class() == null || this._class != null && this._class.equals(other.get_class())) && (this.closeDate == null && other.getCloseDate() == null || this.closeDate != null && this.closeDate.equals(other.getCloseDate())) && (this.createdDate == null && other.getCreatedDate() == null || this.createdDate != null && this.createdDate.equals(other.getCreatedDate())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && this.lastModifiedDate.equals(other.getLastModifiedDate())) && (this.nexus == null && other.getNexus() == null || this.nexus != null && this.nexus.equals(other.getNexus())) && (this.subsidiaryTaxRegNum == null && other.getSubsidiaryTaxRegNum() == null || this.subsidiaryTaxRegNum != null && this.subsidiaryTaxRegNum.equals(other.getSubsidiaryTaxRegNum())) && (this.taxRegOverride == null && other.getTaxRegOverride() == null || this.taxRegOverride != null && this.taxRegOverride.equals(other.getTaxRegOverride())) && (this.taxDetailsOverride == null && other.getTaxDetailsOverride() == null || this.taxDetailsOverride != null && this.taxDetailsOverride.equals(other.getTaxDetailsOverride())) && (this.department == null && other.getDepartment() == null || this.department != null && this.department.equals(other.getDepartment())) && (this.location == null && other.getLocation() == null || this.location != null && this.location.equals(other.getLocation())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && this.subsidiary.equals(other.getSubsidiary())) && (this.status == null && other.getStatus() == null || this.status != null && this.status.equals(other.getStatus())) && (this.vatRegNum == null && other.getVatRegNum() == null || this.vatRegNum != null && this.vatRegNum.equals(other.getVatRegNum())) && (this.syncPartnerTeams == null && other.getSyncPartnerTeams() == null || this.syncPartnerTeams != null && this.syncPartnerTeams.equals(other.getSyncPartnerTeams())) && (this.salesTeamList == null && other.getSalesTeamList() == null || this.salesTeamList != null && this.salesTeamList.equals(other.getSalesTeamList())) && (this.partnersList == null && other.getPartnersList() == null || this.partnersList != null && this.partnersList.equals(other.getPartnersList())) && (this.itemList == null && other.getItemList() == null || this.itemList != null && this.itemList.equals(other.getItemList())) && (this.competitorsList == null && other.getCompetitorsList() == null || this.competitorsList != null && this.competitorsList.equals(other.getCompetitorsList())) && (this.accountingBookDetailList == null && other.getAccountingBookDetailList() == null || this.accountingBookDetailList != null && this.accountingBookDetailList.equals(other.getAccountingBookDetailList())) && (this.taxDetailsList == null && other.getTaxDetailsList() == null || this.taxDetailsList != null && this.taxDetailsList.equals(other.getTaxDetailsList())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
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
        if (this.getCurrency() != null) {
            _hashCode += this.getCurrency().hashCode();
        }
        if (this.getEstimatedBudget() != null) {
            _hashCode += this.getEstimatedBudget().hashCode();
        }
        if (this.getEntity() != null) {
            _hashCode += this.getEntity().hashCode();
        }
        if (this.getJob() != null) {
            _hashCode += this.getJob().hashCode();
        }
        if (this.getTitle() != null) {
            _hashCode += this.getTitle().hashCode();
        }
        if (this.getTranId() != null) {
            _hashCode += this.getTranId().hashCode();
        }
        if (this.getEntityTaxRegNum() != null) {
            _hashCode += this.getEntityTaxRegNum().hashCode();
        }
        if (this.getTaxPointDate() != null) {
            _hashCode += this.getTaxPointDate().hashCode();
        }
        if (this.getOneTime() != null) {
            _hashCode += this.getOneTime().hashCode();
        }
        if (this.getRecurWeekly() != null) {
            _hashCode += this.getRecurWeekly().hashCode();
        }
        if (this.getRecurMonthly() != null) {
            _hashCode += this.getRecurMonthly().hashCode();
        }
        if (this.getRecurQuarterly() != null) {
            _hashCode += this.getRecurQuarterly().hashCode();
        }
        if (this.getRecurAnnually() != null) {
            _hashCode += this.getRecurAnnually().hashCode();
        }
        if (this.getSource() != null) {
            _hashCode += this.getSource().hashCode();
        }
        if (this.getSalesRep() != null) {
            _hashCode += this.getSalesRep().hashCode();
        }
        if (this.getContribPct() != null) {
            _hashCode += this.getContribPct().hashCode();
        }
        if (this.getPartner() != null) {
            _hashCode += this.getPartner().hashCode();
        }
        if (this.getSalesGroup() != null) {
            _hashCode += this.getSalesGroup().hashCode();
        }
        if (this.getSyncSalesTeams() != null) {
            _hashCode += this.getSyncSalesTeams().hashCode();
        }
        if (this.getLeadSource() != null) {
            _hashCode += this.getLeadSource().hashCode();
        }
        if (this.getEntityStatus() != null) {
            _hashCode += this.getEntityStatus().hashCode();
        }
        if (this.getProbability() != null) {
            _hashCode += this.getProbability().hashCode();
        }
        if (this.getTranDate() != null) {
            _hashCode += this.getTranDate().hashCode();
        }
        if (this.getExpectedCloseDate() != null) {
            _hashCode += this.getExpectedCloseDate().hashCode();
        }
        if (this.getDaysOpen() != null) {
            _hashCode += this.getDaysOpen().hashCode();
        }
        if (this.getForecastType() != null) {
            _hashCode += this.getForecastType().hashCode();
        }
        if (this.getCurrencyName() != null) {
            _hashCode += this.getCurrencyName().hashCode();
        }
        if (this.getExchangeRate() != null) {
            _hashCode += this.getExchangeRate().hashCode();
        }
        if (this.getProjectedTotal() != null) {
            _hashCode += this.getProjectedTotal().hashCode();
        }
        if (this.getRangeLow() != null) {
            _hashCode += this.getRangeLow().hashCode();
        }
        if (this.getRangeHigh() != null) {
            _hashCode += this.getRangeHigh().hashCode();
        }
        if (this.getProjAltSalesAmt() != null) {
            _hashCode += this.getProjAltSalesAmt().hashCode();
        }
        if (this.getAltSalesRangeLow() != null) {
            _hashCode += this.getAltSalesRangeLow().hashCode();
        }
        if (this.getAltSalesRangeHigh() != null) {
            _hashCode += this.getAltSalesRangeHigh().hashCode();
        }
        if (this.getWeightedTotal() != null) {
            _hashCode += this.getWeightedTotal().hashCode();
        }
        if (this.getActionItem() != null) {
            _hashCode += this.getActionItem().hashCode();
        }
        if (this.getWinLossReason() != null) {
            _hashCode += this.getWinLossReason().hashCode();
        }
        if (this.getMemo() != null) {
            _hashCode += this.getMemo().hashCode();
        }
        if (this.getTaxTotal() != null) {
            _hashCode += this.getTaxTotal().hashCode();
        }
        if (this.getIsBudgetApproved() != null) {
            _hashCode += this.getIsBudgetApproved().hashCode();
        }
        if (this.getTax2Total() != null) {
            _hashCode += this.getTax2Total().hashCode();
        }
        if (this.getSalesReadiness() != null) {
            _hashCode += this.getSalesReadiness().hashCode();
        }
        if (this.getTotalCostEstimate() != null) {
            _hashCode += this.getTotalCostEstimate().hashCode();
        }
        if (this.getBuyingTimeFrame() != null) {
            _hashCode += this.getBuyingTimeFrame().hashCode();
        }
        if (this.getEstGrossProfit() != null) {
            _hashCode += this.getEstGrossProfit().hashCode();
        }
        if (this.getBuyingReason() != null) {
            _hashCode += this.getBuyingReason().hashCode();
        }
        if (this.getEstGrossProfitPercent() != null) {
            _hashCode += this.getEstGrossProfitPercent().hashCode();
        }
        if (this.getBillingAddress() != null) {
            _hashCode += this.getBillingAddress().hashCode();
        }
        if (this.getBillAddressList() != null) {
            _hashCode += this.getBillAddressList().hashCode();
        }
        if (this.getShippingAddress() != null) {
            _hashCode += this.getShippingAddress().hashCode();
        }
        if (this.getShipIsResidential() != null) {
            _hashCode += this.getShipIsResidential().hashCode();
        }
        if (this.getShipAddressList() != null) {
            _hashCode += this.getShipAddressList().hashCode();
        }
        if (this.get_class() != null) {
            _hashCode += this.get_class().hashCode();
        }
        if (this.getCloseDate() != null) {
            _hashCode += this.getCloseDate().hashCode();
        }
        if (this.getCreatedDate() != null) {
            _hashCode += this.getCreatedDate().hashCode();
        }
        if (this.getLastModifiedDate() != null) {
            _hashCode += this.getLastModifiedDate().hashCode();
        }
        if (this.getNexus() != null) {
            _hashCode += this.getNexus().hashCode();
        }
        if (this.getSubsidiaryTaxRegNum() != null) {
            _hashCode += this.getSubsidiaryTaxRegNum().hashCode();
        }
        if (this.getTaxRegOverride() != null) {
            _hashCode += this.getTaxRegOverride().hashCode();
        }
        if (this.getTaxDetailsOverride() != null) {
            _hashCode += this.getTaxDetailsOverride().hashCode();
        }
        if (this.getDepartment() != null) {
            _hashCode += this.getDepartment().hashCode();
        }
        if (this.getLocation() != null) {
            _hashCode += this.getLocation().hashCode();
        }
        if (this.getSubsidiary() != null) {
            _hashCode += this.getSubsidiary().hashCode();
        }
        if (this.getStatus() != null) {
            _hashCode += this.getStatus().hashCode();
        }
        if (this.getVatRegNum() != null) {
            _hashCode += this.getVatRegNum().hashCode();
        }
        if (this.getSyncPartnerTeams() != null) {
            _hashCode += this.getSyncPartnerTeams().hashCode();
        }
        if (this.getSalesTeamList() != null) {
            _hashCode += this.getSalesTeamList().hashCode();
        }
        if (this.getPartnersList() != null) {
            _hashCode += this.getPartnersList().hashCode();
        }
        if (this.getItemList() != null) {
            _hashCode += this.getItemList().hashCode();
        }
        if (this.getCompetitorsList() != null) {
            _hashCode += this.getCompetitorsList().hashCode();
        }
        if (this.getAccountingBookDetailList() != null) {
            _hashCode += this.getAccountingBookDetailList().hashCode();
        }
        if (this.getTaxDetailsList() != null) {
            _hashCode += this.getTaxDetailsList().hashCode();
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
        typeDesc.setXmlType(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "Opportunity"));
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
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("estimatedBudget");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "estimatedBudget"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("entity");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "entity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("job");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "job"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "title"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("tranId");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "tranId"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("entityTaxRegNum");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "entityTaxRegNum"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxPointDate");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "taxPointDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("oneTime");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "oneTime"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recurWeekly");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "recurWeekly"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recurMonthly");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "recurMonthly"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recurQuarterly");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "recurQuarterly"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recurAnnually");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "recurAnnually"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "source"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("salesRep");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "salesRep"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("contribPct");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "contribPct"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("partner");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "partner"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("salesGroup");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "salesGroup"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("syncSalesTeams");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "syncSalesTeams"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("leadSource");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "leadSource"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("entityStatus");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "entityStatus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("probability");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "probability"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("tranDate");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "tranDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("expectedCloseDate");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "expectedCloseDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("daysOpen");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "daysOpen"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("forecastType");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "forecastType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("currencyName");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "currencyName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("exchangeRate");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "exchangeRate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("projectedTotal");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "projectedTotal"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("rangeLow");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "rangeLow"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("rangeHigh");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "rangeHigh"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("projAltSalesAmt");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "projAltSalesAmt"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("altSalesRangeLow");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "altSalesRangeLow"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("altSalesRangeHigh");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "altSalesRangeHigh"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("weightedTotal");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "weightedTotal"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("actionItem");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "actionItem"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("winLossReason");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "winLossReason"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxTotal");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "taxTotal"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isBudgetApproved");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "isBudgetApproved"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("tax2Total");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "tax2Total"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("salesReadiness");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "salesReadiness"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("totalCostEstimate");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "totalCostEstimate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("buyingTimeFrame");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "buyingTimeFrame"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("estGrossProfit");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "estGrossProfit"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("buyingReason");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "buyingReason"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("estGrossProfitPercent");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "estGrossProfitPercent"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billingAddress");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "billingAddress"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billAddressList");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "billAddressList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shippingAddress");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "shippingAddress"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipIsResidential");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "shipIsResidential"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipAddressList");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "shipAddressList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "class"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("closeDate");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "closeDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("nexus");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "nexus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subsidiaryTaxRegNum");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "subsidiaryTaxRegNum"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxRegOverride");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "taxRegOverride"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxDetailsOverride");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "taxDetailsOverride"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "department"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "location"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "status"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vatRegNum");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "vatRegNum"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("syncPartnerTeams");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "syncPartnerTeams"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("salesTeamList");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "salesTeamList"));
        elemField.setXmlType(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "OpportunitySalesTeamList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("partnersList");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "partnersList"));
        elemField.setXmlType(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "OpportunityPartnersList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemList");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "itemList"));
        elemField.setXmlType(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "OpportunityItemList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("competitorsList");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "competitorsList"));
        elemField.setXmlType(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "OpportunityCompetitorsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("accountingBookDetailList");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "accountingBookDetailList"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "AccountingBookDetailList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxDetailsList");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "taxDetailsList"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TaxDetailsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "CustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

