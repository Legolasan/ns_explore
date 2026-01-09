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
package com.netsuite.suitetalk.proxy.v2022_1.transactions.customers;

import com.netsuite.suitetalk.proxy.v2022_1.platform.common.AccountingBookDetailList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.Address;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.TaxDetailsList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.types.RevenueStatus;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.CustomFieldList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.NullField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.Record;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.customers.CreditMemoApplyList;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.customers.CreditMemoItemList;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.customers.CreditMemoPartnersList;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.customers.CreditMemoSalesTeamList;
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

public class CreditMemo
extends Record
implements Serializable {
    private Calendar createdDate;
    private Calendar lastModifiedDate;
    private RecordRef nexus;
    private RecordRef subsidiaryTaxRegNum;
    private Boolean taxRegOverride;
    private Boolean taxDetailsOverride;
    private RecordRef customForm;
    private RecordRef currency;
    private RecordRef entity;
    private String vatRegNum;
    private Calendar tranDate;
    private String tranId;
    private RecordRef entityTaxRegNum;
    private Calendar taxPointDate;
    private RecordRef createdFrom;
    private RecordRef postingPeriod;
    private RecordRef department;
    private RecordRef _class;
    private RecordRef location;
    private RecordRef subsidiary;
    private RecordRef job;
    private RecordRef salesRep;
    private RecordRef partner;
    private String contribPct;
    private String otherRefNum;
    private String memo;
    private Boolean excludeCommission;
    private RecordRef leadSource;
    private Double balance;
    private RecordRef account;
    private Double exchangeRate;
    private String onCreditHold;
    private Double amountPaid;
    private Calendar salesEffectiveDate;
    private Double totalCostEstimate;
    private Double estGrossProfit;
    private Double estGrossProfitPercent;
    private String currencyName;
    private RecordRef promoCode;
    private Double amountRemaining;
    private RecordRef discountItem;
    private String source;
    private String discountRate;
    private Boolean isTaxable;
    private RecordRef taxItem;
    private Double taxRate;
    private Double unapplied;
    private Boolean autoApply;
    private Double applied;
    private Boolean toBePrinted;
    private Boolean toBeEmailed;
    private String email;
    private Boolean toBeFaxed;
    private String fax;
    private RecordRef messageSel;
    private String message;
    private Address billingAddress;
    private RecordRef billAddressList;
    private RecordRef shipMethod;
    private Double shippingCost;
    private Double shippingTax1Rate;
    private RecordRef shippingTaxCode;
    private RecordRef handlingTaxCode;
    private String shippingTax2Rate;
    private Double handlingTax1Rate;
    private String handlingTax2Rate;
    private Double handlingCost;
    private Double subTotal;
    private Double discountTotal;
    private RevenueStatus revenueStatus;
    private Double recognizedRevenue;
    private Double deferredRevenue;
    private Boolean revRecOnRevCommitment;
    private Double taxTotal;
    private Double tax2Total;
    private Double altShippingCost;
    private Double altHandlingCost;
    private Boolean isMultiShipTo;
    private Double total;
    private RecordRef salesGroup;
    private Boolean syncSalesTeams;
    private String status;
    private RecordRef giftCert;
    private Double giftCertTotal;
    private Double giftCertApplied;
    private Double giftCertAvailable;
    private Boolean tranIsVsoeBundle;
    private Boolean vsoeAutoCalc;
    private Boolean syncPartnerTeams;
    private CreditMemoSalesTeamList salesTeamList;
    private CreditMemoItemList itemList;
    private AccountingBookDetailList accountingBookDetailList;
    private CreditMemoPartnersList partnersList;
    private CreditMemoApplyList applyList;
    private TaxDetailsList taxDetailsList;
    private CustomFieldList customFieldList;
    private String internalId;
    private String externalId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(CreditMemo.class, true);

    public CreditMemo() {
    }

    public CreditMemo(NullField nullFieldList, String internalId, String externalId, Calendar createdDate, Calendar lastModifiedDate, RecordRef nexus, RecordRef subsidiaryTaxRegNum, Boolean taxRegOverride, Boolean taxDetailsOverride, RecordRef customForm, RecordRef currency, RecordRef entity, String vatRegNum, Calendar tranDate, String tranId, RecordRef entityTaxRegNum, Calendar taxPointDate, RecordRef createdFrom, RecordRef postingPeriod, RecordRef department, RecordRef _class, RecordRef location, RecordRef subsidiary, RecordRef job, RecordRef salesRep, RecordRef partner, String contribPct, String otherRefNum, String memo, Boolean excludeCommission, RecordRef leadSource, Double balance, RecordRef account, Double exchangeRate, String onCreditHold, Double amountPaid, Calendar salesEffectiveDate, Double totalCostEstimate, Double estGrossProfit, Double estGrossProfitPercent, String currencyName, RecordRef promoCode, Double amountRemaining, RecordRef discountItem, String source, String discountRate, Boolean isTaxable, RecordRef taxItem, Double taxRate, Double unapplied, Boolean autoApply, Double applied, Boolean toBePrinted, Boolean toBeEmailed, String email, Boolean toBeFaxed, String fax, RecordRef messageSel, String message, Address billingAddress, RecordRef billAddressList, RecordRef shipMethod, Double shippingCost, Double shippingTax1Rate, RecordRef shippingTaxCode, RecordRef handlingTaxCode, String shippingTax2Rate, Double handlingTax1Rate, String handlingTax2Rate, Double handlingCost, Double subTotal, Double discountTotal, RevenueStatus revenueStatus, Double recognizedRevenue, Double deferredRevenue, Boolean revRecOnRevCommitment, Double taxTotal, Double tax2Total, Double altShippingCost, Double altHandlingCost, Boolean isMultiShipTo, Double total, RecordRef salesGroup, Boolean syncSalesTeams, String status, RecordRef giftCert, Double giftCertTotal, Double giftCertApplied, Double giftCertAvailable, Boolean tranIsVsoeBundle, Boolean vsoeAutoCalc, Boolean syncPartnerTeams, CreditMemoSalesTeamList salesTeamList, CreditMemoItemList itemList, AccountingBookDetailList accountingBookDetailList, CreditMemoPartnersList partnersList, CreditMemoApplyList applyList, TaxDetailsList taxDetailsList, CustomFieldList customFieldList) {
        super(nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.nexus = nexus;
        this.subsidiaryTaxRegNum = subsidiaryTaxRegNum;
        this.taxRegOverride = taxRegOverride;
        this.taxDetailsOverride = taxDetailsOverride;
        this.customForm = customForm;
        this.currency = currency;
        this.entity = entity;
        this.vatRegNum = vatRegNum;
        this.tranDate = tranDate;
        this.tranId = tranId;
        this.entityTaxRegNum = entityTaxRegNum;
        this.taxPointDate = taxPointDate;
        this.createdFrom = createdFrom;
        this.postingPeriod = postingPeriod;
        this.department = department;
        this._class = _class;
        this.location = location;
        this.subsidiary = subsidiary;
        this.job = job;
        this.salesRep = salesRep;
        this.partner = partner;
        this.contribPct = contribPct;
        this.otherRefNum = otherRefNum;
        this.memo = memo;
        this.excludeCommission = excludeCommission;
        this.leadSource = leadSource;
        this.balance = balance;
        this.account = account;
        this.exchangeRate = exchangeRate;
        this.onCreditHold = onCreditHold;
        this.amountPaid = amountPaid;
        this.salesEffectiveDate = salesEffectiveDate;
        this.totalCostEstimate = totalCostEstimate;
        this.estGrossProfit = estGrossProfit;
        this.estGrossProfitPercent = estGrossProfitPercent;
        this.currencyName = currencyName;
        this.promoCode = promoCode;
        this.amountRemaining = amountRemaining;
        this.discountItem = discountItem;
        this.source = source;
        this.discountRate = discountRate;
        this.isTaxable = isTaxable;
        this.taxItem = taxItem;
        this.taxRate = taxRate;
        this.unapplied = unapplied;
        this.autoApply = autoApply;
        this.applied = applied;
        this.toBePrinted = toBePrinted;
        this.toBeEmailed = toBeEmailed;
        this.email = email;
        this.toBeFaxed = toBeFaxed;
        this.fax = fax;
        this.messageSel = messageSel;
        this.message = message;
        this.billingAddress = billingAddress;
        this.billAddressList = billAddressList;
        this.shipMethod = shipMethod;
        this.shippingCost = shippingCost;
        this.shippingTax1Rate = shippingTax1Rate;
        this.shippingTaxCode = shippingTaxCode;
        this.handlingTaxCode = handlingTaxCode;
        this.shippingTax2Rate = shippingTax2Rate;
        this.handlingTax1Rate = handlingTax1Rate;
        this.handlingTax2Rate = handlingTax2Rate;
        this.handlingCost = handlingCost;
        this.subTotal = subTotal;
        this.discountTotal = discountTotal;
        this.revenueStatus = revenueStatus;
        this.recognizedRevenue = recognizedRevenue;
        this.deferredRevenue = deferredRevenue;
        this.revRecOnRevCommitment = revRecOnRevCommitment;
        this.taxTotal = taxTotal;
        this.tax2Total = tax2Total;
        this.altShippingCost = altShippingCost;
        this.altHandlingCost = altHandlingCost;
        this.isMultiShipTo = isMultiShipTo;
        this.total = total;
        this.salesGroup = salesGroup;
        this.syncSalesTeams = syncSalesTeams;
        this.status = status;
        this.giftCert = giftCert;
        this.giftCertTotal = giftCertTotal;
        this.giftCertApplied = giftCertApplied;
        this.giftCertAvailable = giftCertAvailable;
        this.tranIsVsoeBundle = tranIsVsoeBundle;
        this.vsoeAutoCalc = vsoeAutoCalc;
        this.syncPartnerTeams = syncPartnerTeams;
        this.salesTeamList = salesTeamList;
        this.itemList = itemList;
        this.accountingBookDetailList = accountingBookDetailList;
        this.partnersList = partnersList;
        this.applyList = applyList;
        this.taxDetailsList = taxDetailsList;
        this.customFieldList = customFieldList;
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

    public RecordRef getEntity() {
        return this.entity;
    }

    public void setEntity(RecordRef entity) {
        this.entity = entity;
    }

    public String getVatRegNum() {
        return this.vatRegNum;
    }

    public void setVatRegNum(String vatRegNum) {
        this.vatRegNum = vatRegNum;
    }

    public Calendar getTranDate() {
        return this.tranDate;
    }

    public void setTranDate(Calendar tranDate) {
        this.tranDate = tranDate;
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

    public RecordRef getCreatedFrom() {
        return this.createdFrom;
    }

    public void setCreatedFrom(RecordRef createdFrom) {
        this.createdFrom = createdFrom;
    }

    public RecordRef getPostingPeriod() {
        return this.postingPeriod;
    }

    public void setPostingPeriod(RecordRef postingPeriod) {
        this.postingPeriod = postingPeriod;
    }

    public RecordRef getDepartment() {
        return this.department;
    }

    public void setDepartment(RecordRef department) {
        this.department = department;
    }

    public RecordRef get_class() {
        return this._class;
    }

    public void set_class(RecordRef _class) {
        this._class = _class;
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

    public RecordRef getJob() {
        return this.job;
    }

    public void setJob(RecordRef job) {
        this.job = job;
    }

    public RecordRef getSalesRep() {
        return this.salesRep;
    }

    public void setSalesRep(RecordRef salesRep) {
        this.salesRep = salesRep;
    }

    public RecordRef getPartner() {
        return this.partner;
    }

    public void setPartner(RecordRef partner) {
        this.partner = partner;
    }

    public String getContribPct() {
        return this.contribPct;
    }

    public void setContribPct(String contribPct) {
        this.contribPct = contribPct;
    }

    public String getOtherRefNum() {
        return this.otherRefNum;
    }

    public void setOtherRefNum(String otherRefNum) {
        this.otherRefNum = otherRefNum;
    }

    public String getMemo() {
        return this.memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Boolean getExcludeCommission() {
        return this.excludeCommission;
    }

    public void setExcludeCommission(Boolean excludeCommission) {
        this.excludeCommission = excludeCommission;
    }

    public RecordRef getLeadSource() {
        return this.leadSource;
    }

    public void setLeadSource(RecordRef leadSource) {
        this.leadSource = leadSource;
    }

    public Double getBalance() {
        return this.balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public RecordRef getAccount() {
        return this.account;
    }

    public void setAccount(RecordRef account) {
        this.account = account;
    }

    public Double getExchangeRate() {
        return this.exchangeRate;
    }

    public void setExchangeRate(Double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public String getOnCreditHold() {
        return this.onCreditHold;
    }

    public void setOnCreditHold(String onCreditHold) {
        this.onCreditHold = onCreditHold;
    }

    public Double getAmountPaid() {
        return this.amountPaid;
    }

    public void setAmountPaid(Double amountPaid) {
        this.amountPaid = amountPaid;
    }

    public Calendar getSalesEffectiveDate() {
        return this.salesEffectiveDate;
    }

    public void setSalesEffectiveDate(Calendar salesEffectiveDate) {
        this.salesEffectiveDate = salesEffectiveDate;
    }

    public Double getTotalCostEstimate() {
        return this.totalCostEstimate;
    }

    public void setTotalCostEstimate(Double totalCostEstimate) {
        this.totalCostEstimate = totalCostEstimate;
    }

    public Double getEstGrossProfit() {
        return this.estGrossProfit;
    }

    public void setEstGrossProfit(Double estGrossProfit) {
        this.estGrossProfit = estGrossProfit;
    }

    public Double getEstGrossProfitPercent() {
        return this.estGrossProfitPercent;
    }

    public void setEstGrossProfitPercent(Double estGrossProfitPercent) {
        this.estGrossProfitPercent = estGrossProfitPercent;
    }

    public String getCurrencyName() {
        return this.currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public RecordRef getPromoCode() {
        return this.promoCode;
    }

    public void setPromoCode(RecordRef promoCode) {
        this.promoCode = promoCode;
    }

    public Double getAmountRemaining() {
        return this.amountRemaining;
    }

    public void setAmountRemaining(Double amountRemaining) {
        this.amountRemaining = amountRemaining;
    }

    public RecordRef getDiscountItem() {
        return this.discountItem;
    }

    public void setDiscountItem(RecordRef discountItem) {
        this.discountItem = discountItem;
    }

    public String getSource() {
        return this.source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getDiscountRate() {
        return this.discountRate;
    }

    public void setDiscountRate(String discountRate) {
        this.discountRate = discountRate;
    }

    public Boolean getIsTaxable() {
        return this.isTaxable;
    }

    public void setIsTaxable(Boolean isTaxable) {
        this.isTaxable = isTaxable;
    }

    public RecordRef getTaxItem() {
        return this.taxItem;
    }

    public void setTaxItem(RecordRef taxItem) {
        this.taxItem = taxItem;
    }

    public Double getTaxRate() {
        return this.taxRate;
    }

    public void setTaxRate(Double taxRate) {
        this.taxRate = taxRate;
    }

    public Double getUnapplied() {
        return this.unapplied;
    }

    public void setUnapplied(Double unapplied) {
        this.unapplied = unapplied;
    }

    public Boolean getAutoApply() {
        return this.autoApply;
    }

    public void setAutoApply(Boolean autoApply) {
        this.autoApply = autoApply;
    }

    public Double getApplied() {
        return this.applied;
    }

    public void setApplied(Double applied) {
        this.applied = applied;
    }

    public Boolean getToBePrinted() {
        return this.toBePrinted;
    }

    public void setToBePrinted(Boolean toBePrinted) {
        this.toBePrinted = toBePrinted;
    }

    public Boolean getToBeEmailed() {
        return this.toBeEmailed;
    }

    public void setToBeEmailed(Boolean toBeEmailed) {
        this.toBeEmailed = toBeEmailed;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getToBeFaxed() {
        return this.toBeFaxed;
    }

    public void setToBeFaxed(Boolean toBeFaxed) {
        this.toBeFaxed = toBeFaxed;
    }

    public String getFax() {
        return this.fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public RecordRef getMessageSel() {
        return this.messageSel;
    }

    public void setMessageSel(RecordRef messageSel) {
        this.messageSel = messageSel;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
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

    public RecordRef getShipMethod() {
        return this.shipMethod;
    }

    public void setShipMethod(RecordRef shipMethod) {
        this.shipMethod = shipMethod;
    }

    public Double getShippingCost() {
        return this.shippingCost;
    }

    public void setShippingCost(Double shippingCost) {
        this.shippingCost = shippingCost;
    }

    public Double getShippingTax1Rate() {
        return this.shippingTax1Rate;
    }

    public void setShippingTax1Rate(Double shippingTax1Rate) {
        this.shippingTax1Rate = shippingTax1Rate;
    }

    public RecordRef getShippingTaxCode() {
        return this.shippingTaxCode;
    }

    public void setShippingTaxCode(RecordRef shippingTaxCode) {
        this.shippingTaxCode = shippingTaxCode;
    }

    public RecordRef getHandlingTaxCode() {
        return this.handlingTaxCode;
    }

    public void setHandlingTaxCode(RecordRef handlingTaxCode) {
        this.handlingTaxCode = handlingTaxCode;
    }

    public String getShippingTax2Rate() {
        return this.shippingTax2Rate;
    }

    public void setShippingTax2Rate(String shippingTax2Rate) {
        this.shippingTax2Rate = shippingTax2Rate;
    }

    public Double getHandlingTax1Rate() {
        return this.handlingTax1Rate;
    }

    public void setHandlingTax1Rate(Double handlingTax1Rate) {
        this.handlingTax1Rate = handlingTax1Rate;
    }

    public String getHandlingTax2Rate() {
        return this.handlingTax2Rate;
    }

    public void setHandlingTax2Rate(String handlingTax2Rate) {
        this.handlingTax2Rate = handlingTax2Rate;
    }

    public Double getHandlingCost() {
        return this.handlingCost;
    }

    public void setHandlingCost(Double handlingCost) {
        this.handlingCost = handlingCost;
    }

    public Double getSubTotal() {
        return this.subTotal;
    }

    public void setSubTotal(Double subTotal) {
        this.subTotal = subTotal;
    }

    public Double getDiscountTotal() {
        return this.discountTotal;
    }

    public void setDiscountTotal(Double discountTotal) {
        this.discountTotal = discountTotal;
    }

    public RevenueStatus getRevenueStatus() {
        return this.revenueStatus;
    }

    public void setRevenueStatus(RevenueStatus revenueStatus) {
        this.revenueStatus = revenueStatus;
    }

    public Double getRecognizedRevenue() {
        return this.recognizedRevenue;
    }

    public void setRecognizedRevenue(Double recognizedRevenue) {
        this.recognizedRevenue = recognizedRevenue;
    }

    public Double getDeferredRevenue() {
        return this.deferredRevenue;
    }

    public void setDeferredRevenue(Double deferredRevenue) {
        this.deferredRevenue = deferredRevenue;
    }

    public Boolean getRevRecOnRevCommitment() {
        return this.revRecOnRevCommitment;
    }

    public void setRevRecOnRevCommitment(Boolean revRecOnRevCommitment) {
        this.revRecOnRevCommitment = revRecOnRevCommitment;
    }

    public Double getTaxTotal() {
        return this.taxTotal;
    }

    public void setTaxTotal(Double taxTotal) {
        this.taxTotal = taxTotal;
    }

    public Double getTax2Total() {
        return this.tax2Total;
    }

    public void setTax2Total(Double tax2Total) {
        this.tax2Total = tax2Total;
    }

    public Double getAltShippingCost() {
        return this.altShippingCost;
    }

    public void setAltShippingCost(Double altShippingCost) {
        this.altShippingCost = altShippingCost;
    }

    public Double getAltHandlingCost() {
        return this.altHandlingCost;
    }

    public void setAltHandlingCost(Double altHandlingCost) {
        this.altHandlingCost = altHandlingCost;
    }

    public Boolean getIsMultiShipTo() {
        return this.isMultiShipTo;
    }

    public void setIsMultiShipTo(Boolean isMultiShipTo) {
        this.isMultiShipTo = isMultiShipTo;
    }

    public Double getTotal() {
        return this.total;
    }

    public void setTotal(Double total) {
        this.total = total;
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

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public RecordRef getGiftCert() {
        return this.giftCert;
    }

    public void setGiftCert(RecordRef giftCert) {
        this.giftCert = giftCert;
    }

    public Double getGiftCertTotal() {
        return this.giftCertTotal;
    }

    public void setGiftCertTotal(Double giftCertTotal) {
        this.giftCertTotal = giftCertTotal;
    }

    public Double getGiftCertApplied() {
        return this.giftCertApplied;
    }

    public void setGiftCertApplied(Double giftCertApplied) {
        this.giftCertApplied = giftCertApplied;
    }

    public Double getGiftCertAvailable() {
        return this.giftCertAvailable;
    }

    public void setGiftCertAvailable(Double giftCertAvailable) {
        this.giftCertAvailable = giftCertAvailable;
    }

    public Boolean getTranIsVsoeBundle() {
        return this.tranIsVsoeBundle;
    }

    public void setTranIsVsoeBundle(Boolean tranIsVsoeBundle) {
        this.tranIsVsoeBundle = tranIsVsoeBundle;
    }

    public Boolean getVsoeAutoCalc() {
        return this.vsoeAutoCalc;
    }

    public void setVsoeAutoCalc(Boolean vsoeAutoCalc) {
        this.vsoeAutoCalc = vsoeAutoCalc;
    }

    public Boolean getSyncPartnerTeams() {
        return this.syncPartnerTeams;
    }

    public void setSyncPartnerTeams(Boolean syncPartnerTeams) {
        this.syncPartnerTeams = syncPartnerTeams;
    }

    public CreditMemoSalesTeamList getSalesTeamList() {
        return this.salesTeamList;
    }

    public void setSalesTeamList(CreditMemoSalesTeamList salesTeamList) {
        this.salesTeamList = salesTeamList;
    }

    public CreditMemoItemList getItemList() {
        return this.itemList;
    }

    public void setItemList(CreditMemoItemList itemList) {
        this.itemList = itemList;
    }

    public AccountingBookDetailList getAccountingBookDetailList() {
        return this.accountingBookDetailList;
    }

    public void setAccountingBookDetailList(AccountingBookDetailList accountingBookDetailList) {
        this.accountingBookDetailList = accountingBookDetailList;
    }

    public CreditMemoPartnersList getPartnersList() {
        return this.partnersList;
    }

    public void setPartnersList(CreditMemoPartnersList partnersList) {
        this.partnersList = partnersList;
    }

    public CreditMemoApplyList getApplyList() {
        return this.applyList;
    }

    public void setApplyList(CreditMemoApplyList applyList) {
        this.applyList = applyList;
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
        if (!(obj instanceof CreditMemo)) {
            return false;
        }
        CreditMemo other = (CreditMemo)obj;
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
        boolean _equals = super.equals(obj) && (this.createdDate == null && other.getCreatedDate() == null || this.createdDate != null && this.createdDate.equals(other.getCreatedDate())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && this.lastModifiedDate.equals(other.getLastModifiedDate())) && (this.nexus == null && other.getNexus() == null || this.nexus != null && this.nexus.equals(other.getNexus())) && (this.subsidiaryTaxRegNum == null && other.getSubsidiaryTaxRegNum() == null || this.subsidiaryTaxRegNum != null && this.subsidiaryTaxRegNum.equals(other.getSubsidiaryTaxRegNum())) && (this.taxRegOverride == null && other.getTaxRegOverride() == null || this.taxRegOverride != null && this.taxRegOverride.equals(other.getTaxRegOverride())) && (this.taxDetailsOverride == null && other.getTaxDetailsOverride() == null || this.taxDetailsOverride != null && this.taxDetailsOverride.equals(other.getTaxDetailsOverride())) && (this.customForm == null && other.getCustomForm() == null || this.customForm != null && this.customForm.equals(other.getCustomForm())) && (this.currency == null && other.getCurrency() == null || this.currency != null && this.currency.equals(other.getCurrency())) && (this.entity == null && other.getEntity() == null || this.entity != null && this.entity.equals(other.getEntity())) && (this.vatRegNum == null && other.getVatRegNum() == null || this.vatRegNum != null && this.vatRegNum.equals(other.getVatRegNum())) && (this.tranDate == null && other.getTranDate() == null || this.tranDate != null && this.tranDate.equals(other.getTranDate())) && (this.tranId == null && other.getTranId() == null || this.tranId != null && this.tranId.equals(other.getTranId())) && (this.entityTaxRegNum == null && other.getEntityTaxRegNum() == null || this.entityTaxRegNum != null && this.entityTaxRegNum.equals(other.getEntityTaxRegNum())) && (this.taxPointDate == null && other.getTaxPointDate() == null || this.taxPointDate != null && this.taxPointDate.equals(other.getTaxPointDate())) && (this.createdFrom == null && other.getCreatedFrom() == null || this.createdFrom != null && this.createdFrom.equals(other.getCreatedFrom())) && (this.postingPeriod == null && other.getPostingPeriod() == null || this.postingPeriod != null && this.postingPeriod.equals(other.getPostingPeriod())) && (this.department == null && other.getDepartment() == null || this.department != null && this.department.equals(other.getDepartment())) && (this._class == null && other.get_class() == null || this._class != null && this._class.equals(other.get_class())) && (this.location == null && other.getLocation() == null || this.location != null && this.location.equals(other.getLocation())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && this.subsidiary.equals(other.getSubsidiary())) && (this.job == null && other.getJob() == null || this.job != null && this.job.equals(other.getJob())) && (this.salesRep == null && other.getSalesRep() == null || this.salesRep != null && this.salesRep.equals(other.getSalesRep())) && (this.partner == null && other.getPartner() == null || this.partner != null && this.partner.equals(other.getPartner())) && (this.contribPct == null && other.getContribPct() == null || this.contribPct != null && this.contribPct.equals(other.getContribPct())) && (this.otherRefNum == null && other.getOtherRefNum() == null || this.otherRefNum != null && this.otherRefNum.equals(other.getOtherRefNum())) && (this.memo == null && other.getMemo() == null || this.memo != null && this.memo.equals(other.getMemo())) && (this.excludeCommission == null && other.getExcludeCommission() == null || this.excludeCommission != null && this.excludeCommission.equals(other.getExcludeCommission())) && (this.leadSource == null && other.getLeadSource() == null || this.leadSource != null && this.leadSource.equals(other.getLeadSource())) && (this.balance == null && other.getBalance() == null || this.balance != null && this.balance.equals(other.getBalance())) && (this.account == null && other.getAccount() == null || this.account != null && this.account.equals(other.getAccount())) && (this.exchangeRate == null && other.getExchangeRate() == null || this.exchangeRate != null && this.exchangeRate.equals(other.getExchangeRate())) && (this.onCreditHold == null && other.getOnCreditHold() == null || this.onCreditHold != null && this.onCreditHold.equals(other.getOnCreditHold())) && (this.amountPaid == null && other.getAmountPaid() == null || this.amountPaid != null && this.amountPaid.equals(other.getAmountPaid())) && (this.salesEffectiveDate == null && other.getSalesEffectiveDate() == null || this.salesEffectiveDate != null && this.salesEffectiveDate.equals(other.getSalesEffectiveDate())) && (this.totalCostEstimate == null && other.getTotalCostEstimate() == null || this.totalCostEstimate != null && this.totalCostEstimate.equals(other.getTotalCostEstimate())) && (this.estGrossProfit == null && other.getEstGrossProfit() == null || this.estGrossProfit != null && this.estGrossProfit.equals(other.getEstGrossProfit())) && (this.estGrossProfitPercent == null && other.getEstGrossProfitPercent() == null || this.estGrossProfitPercent != null && this.estGrossProfitPercent.equals(other.getEstGrossProfitPercent())) && (this.currencyName == null && other.getCurrencyName() == null || this.currencyName != null && this.currencyName.equals(other.getCurrencyName())) && (this.promoCode == null && other.getPromoCode() == null || this.promoCode != null && this.promoCode.equals(other.getPromoCode())) && (this.amountRemaining == null && other.getAmountRemaining() == null || this.amountRemaining != null && this.amountRemaining.equals(other.getAmountRemaining())) && (this.discountItem == null && other.getDiscountItem() == null || this.discountItem != null && this.discountItem.equals(other.getDiscountItem())) && (this.source == null && other.getSource() == null || this.source != null && this.source.equals(other.getSource())) && (this.discountRate == null && other.getDiscountRate() == null || this.discountRate != null && this.discountRate.equals(other.getDiscountRate())) && (this.isTaxable == null && other.getIsTaxable() == null || this.isTaxable != null && this.isTaxable.equals(other.getIsTaxable())) && (this.taxItem == null && other.getTaxItem() == null || this.taxItem != null && this.taxItem.equals(other.getTaxItem())) && (this.taxRate == null && other.getTaxRate() == null || this.taxRate != null && this.taxRate.equals(other.getTaxRate())) && (this.unapplied == null && other.getUnapplied() == null || this.unapplied != null && this.unapplied.equals(other.getUnapplied())) && (this.autoApply == null && other.getAutoApply() == null || this.autoApply != null && this.autoApply.equals(other.getAutoApply())) && (this.applied == null && other.getApplied() == null || this.applied != null && this.applied.equals(other.getApplied())) && (this.toBePrinted == null && other.getToBePrinted() == null || this.toBePrinted != null && this.toBePrinted.equals(other.getToBePrinted())) && (this.toBeEmailed == null && other.getToBeEmailed() == null || this.toBeEmailed != null && this.toBeEmailed.equals(other.getToBeEmailed())) && (this.email == null && other.getEmail() == null || this.email != null && this.email.equals(other.getEmail())) && (this.toBeFaxed == null && other.getToBeFaxed() == null || this.toBeFaxed != null && this.toBeFaxed.equals(other.getToBeFaxed())) && (this.fax == null && other.getFax() == null || this.fax != null && this.fax.equals(other.getFax())) && (this.messageSel == null && other.getMessageSel() == null || this.messageSel != null && this.messageSel.equals(other.getMessageSel())) && (this.message == null && other.getMessage() == null || this.message != null && this.message.equals(other.getMessage())) && (this.billingAddress == null && other.getBillingAddress() == null || this.billingAddress != null && this.billingAddress.equals(other.getBillingAddress())) && (this.billAddressList == null && other.getBillAddressList() == null || this.billAddressList != null && this.billAddressList.equals(other.getBillAddressList())) && (this.shipMethod == null && other.getShipMethod() == null || this.shipMethod != null && this.shipMethod.equals(other.getShipMethod())) && (this.shippingCost == null && other.getShippingCost() == null || this.shippingCost != null && this.shippingCost.equals(other.getShippingCost())) && (this.shippingTax1Rate == null && other.getShippingTax1Rate() == null || this.shippingTax1Rate != null && this.shippingTax1Rate.equals(other.getShippingTax1Rate())) && (this.shippingTaxCode == null && other.getShippingTaxCode() == null || this.shippingTaxCode != null && this.shippingTaxCode.equals(other.getShippingTaxCode())) && (this.handlingTaxCode == null && other.getHandlingTaxCode() == null || this.handlingTaxCode != null && this.handlingTaxCode.equals(other.getHandlingTaxCode())) && (this.shippingTax2Rate == null && other.getShippingTax2Rate() == null || this.shippingTax2Rate != null && this.shippingTax2Rate.equals(other.getShippingTax2Rate())) && (this.handlingTax1Rate == null && other.getHandlingTax1Rate() == null || this.handlingTax1Rate != null && this.handlingTax1Rate.equals(other.getHandlingTax1Rate())) && (this.handlingTax2Rate == null && other.getHandlingTax2Rate() == null || this.handlingTax2Rate != null && this.handlingTax2Rate.equals(other.getHandlingTax2Rate())) && (this.handlingCost == null && other.getHandlingCost() == null || this.handlingCost != null && this.handlingCost.equals(other.getHandlingCost())) && (this.subTotal == null && other.getSubTotal() == null || this.subTotal != null && this.subTotal.equals(other.getSubTotal())) && (this.discountTotal == null && other.getDiscountTotal() == null || this.discountTotal != null && this.discountTotal.equals(other.getDiscountTotal())) && (this.revenueStatus == null && other.getRevenueStatus() == null || this.revenueStatus != null && this.revenueStatus.equals(other.getRevenueStatus())) && (this.recognizedRevenue == null && other.getRecognizedRevenue() == null || this.recognizedRevenue != null && this.recognizedRevenue.equals(other.getRecognizedRevenue())) && (this.deferredRevenue == null && other.getDeferredRevenue() == null || this.deferredRevenue != null && this.deferredRevenue.equals(other.getDeferredRevenue())) && (this.revRecOnRevCommitment == null && other.getRevRecOnRevCommitment() == null || this.revRecOnRevCommitment != null && this.revRecOnRevCommitment.equals(other.getRevRecOnRevCommitment())) && (this.taxTotal == null && other.getTaxTotal() == null || this.taxTotal != null && this.taxTotal.equals(other.getTaxTotal())) && (this.tax2Total == null && other.getTax2Total() == null || this.tax2Total != null && this.tax2Total.equals(other.getTax2Total())) && (this.altShippingCost == null && other.getAltShippingCost() == null || this.altShippingCost != null && this.altShippingCost.equals(other.getAltShippingCost())) && (this.altHandlingCost == null && other.getAltHandlingCost() == null || this.altHandlingCost != null && this.altHandlingCost.equals(other.getAltHandlingCost())) && (this.isMultiShipTo == null && other.getIsMultiShipTo() == null || this.isMultiShipTo != null && this.isMultiShipTo.equals(other.getIsMultiShipTo())) && (this.total == null && other.getTotal() == null || this.total != null && this.total.equals(other.getTotal())) && (this.salesGroup == null && other.getSalesGroup() == null || this.salesGroup != null && this.salesGroup.equals(other.getSalesGroup())) && (this.syncSalesTeams == null && other.getSyncSalesTeams() == null || this.syncSalesTeams != null && this.syncSalesTeams.equals(other.getSyncSalesTeams())) && (this.status == null && other.getStatus() == null || this.status != null && this.status.equals(other.getStatus())) && (this.giftCert == null && other.getGiftCert() == null || this.giftCert != null && this.giftCert.equals(other.getGiftCert())) && (this.giftCertTotal == null && other.getGiftCertTotal() == null || this.giftCertTotal != null && this.giftCertTotal.equals(other.getGiftCertTotal())) && (this.giftCertApplied == null && other.getGiftCertApplied() == null || this.giftCertApplied != null && this.giftCertApplied.equals(other.getGiftCertApplied())) && (this.giftCertAvailable == null && other.getGiftCertAvailable() == null || this.giftCertAvailable != null && this.giftCertAvailable.equals(other.getGiftCertAvailable())) && (this.tranIsVsoeBundle == null && other.getTranIsVsoeBundle() == null || this.tranIsVsoeBundle != null && this.tranIsVsoeBundle.equals(other.getTranIsVsoeBundle())) && (this.vsoeAutoCalc == null && other.getVsoeAutoCalc() == null || this.vsoeAutoCalc != null && this.vsoeAutoCalc.equals(other.getVsoeAutoCalc())) && (this.syncPartnerTeams == null && other.getSyncPartnerTeams() == null || this.syncPartnerTeams != null && this.syncPartnerTeams.equals(other.getSyncPartnerTeams())) && (this.salesTeamList == null && other.getSalesTeamList() == null || this.salesTeamList != null && this.salesTeamList.equals(other.getSalesTeamList())) && (this.itemList == null && other.getItemList() == null || this.itemList != null && this.itemList.equals(other.getItemList())) && (this.accountingBookDetailList == null && other.getAccountingBookDetailList() == null || this.accountingBookDetailList != null && this.accountingBookDetailList.equals(other.getAccountingBookDetailList())) && (this.partnersList == null && other.getPartnersList() == null || this.partnersList != null && this.partnersList.equals(other.getPartnersList())) && (this.applyList == null && other.getApplyList() == null || this.applyList != null && this.applyList.equals(other.getApplyList())) && (this.taxDetailsList == null && other.getTaxDetailsList() == null || this.taxDetailsList != null && this.taxDetailsList.equals(other.getTaxDetailsList())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
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
        if (this.getCustomForm() != null) {
            _hashCode += this.getCustomForm().hashCode();
        }
        if (this.getCurrency() != null) {
            _hashCode += this.getCurrency().hashCode();
        }
        if (this.getEntity() != null) {
            _hashCode += this.getEntity().hashCode();
        }
        if (this.getVatRegNum() != null) {
            _hashCode += this.getVatRegNum().hashCode();
        }
        if (this.getTranDate() != null) {
            _hashCode += this.getTranDate().hashCode();
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
        if (this.getCreatedFrom() != null) {
            _hashCode += this.getCreatedFrom().hashCode();
        }
        if (this.getPostingPeriod() != null) {
            _hashCode += this.getPostingPeriod().hashCode();
        }
        if (this.getDepartment() != null) {
            _hashCode += this.getDepartment().hashCode();
        }
        if (this.get_class() != null) {
            _hashCode += this.get_class().hashCode();
        }
        if (this.getLocation() != null) {
            _hashCode += this.getLocation().hashCode();
        }
        if (this.getSubsidiary() != null) {
            _hashCode += this.getSubsidiary().hashCode();
        }
        if (this.getJob() != null) {
            _hashCode += this.getJob().hashCode();
        }
        if (this.getSalesRep() != null) {
            _hashCode += this.getSalesRep().hashCode();
        }
        if (this.getPartner() != null) {
            _hashCode += this.getPartner().hashCode();
        }
        if (this.getContribPct() != null) {
            _hashCode += this.getContribPct().hashCode();
        }
        if (this.getOtherRefNum() != null) {
            _hashCode += this.getOtherRefNum().hashCode();
        }
        if (this.getMemo() != null) {
            _hashCode += this.getMemo().hashCode();
        }
        if (this.getExcludeCommission() != null) {
            _hashCode += this.getExcludeCommission().hashCode();
        }
        if (this.getLeadSource() != null) {
            _hashCode += this.getLeadSource().hashCode();
        }
        if (this.getBalance() != null) {
            _hashCode += this.getBalance().hashCode();
        }
        if (this.getAccount() != null) {
            _hashCode += this.getAccount().hashCode();
        }
        if (this.getExchangeRate() != null) {
            _hashCode += this.getExchangeRate().hashCode();
        }
        if (this.getOnCreditHold() != null) {
            _hashCode += this.getOnCreditHold().hashCode();
        }
        if (this.getAmountPaid() != null) {
            _hashCode += this.getAmountPaid().hashCode();
        }
        if (this.getSalesEffectiveDate() != null) {
            _hashCode += this.getSalesEffectiveDate().hashCode();
        }
        if (this.getTotalCostEstimate() != null) {
            _hashCode += this.getTotalCostEstimate().hashCode();
        }
        if (this.getEstGrossProfit() != null) {
            _hashCode += this.getEstGrossProfit().hashCode();
        }
        if (this.getEstGrossProfitPercent() != null) {
            _hashCode += this.getEstGrossProfitPercent().hashCode();
        }
        if (this.getCurrencyName() != null) {
            _hashCode += this.getCurrencyName().hashCode();
        }
        if (this.getPromoCode() != null) {
            _hashCode += this.getPromoCode().hashCode();
        }
        if (this.getAmountRemaining() != null) {
            _hashCode += this.getAmountRemaining().hashCode();
        }
        if (this.getDiscountItem() != null) {
            _hashCode += this.getDiscountItem().hashCode();
        }
        if (this.getSource() != null) {
            _hashCode += this.getSource().hashCode();
        }
        if (this.getDiscountRate() != null) {
            _hashCode += this.getDiscountRate().hashCode();
        }
        if (this.getIsTaxable() != null) {
            _hashCode += this.getIsTaxable().hashCode();
        }
        if (this.getTaxItem() != null) {
            _hashCode += this.getTaxItem().hashCode();
        }
        if (this.getTaxRate() != null) {
            _hashCode += this.getTaxRate().hashCode();
        }
        if (this.getUnapplied() != null) {
            _hashCode += this.getUnapplied().hashCode();
        }
        if (this.getAutoApply() != null) {
            _hashCode += this.getAutoApply().hashCode();
        }
        if (this.getApplied() != null) {
            _hashCode += this.getApplied().hashCode();
        }
        if (this.getToBePrinted() != null) {
            _hashCode += this.getToBePrinted().hashCode();
        }
        if (this.getToBeEmailed() != null) {
            _hashCode += this.getToBeEmailed().hashCode();
        }
        if (this.getEmail() != null) {
            _hashCode += this.getEmail().hashCode();
        }
        if (this.getToBeFaxed() != null) {
            _hashCode += this.getToBeFaxed().hashCode();
        }
        if (this.getFax() != null) {
            _hashCode += this.getFax().hashCode();
        }
        if (this.getMessageSel() != null) {
            _hashCode += this.getMessageSel().hashCode();
        }
        if (this.getMessage() != null) {
            _hashCode += this.getMessage().hashCode();
        }
        if (this.getBillingAddress() != null) {
            _hashCode += this.getBillingAddress().hashCode();
        }
        if (this.getBillAddressList() != null) {
            _hashCode += this.getBillAddressList().hashCode();
        }
        if (this.getShipMethod() != null) {
            _hashCode += this.getShipMethod().hashCode();
        }
        if (this.getShippingCost() != null) {
            _hashCode += this.getShippingCost().hashCode();
        }
        if (this.getShippingTax1Rate() != null) {
            _hashCode += this.getShippingTax1Rate().hashCode();
        }
        if (this.getShippingTaxCode() != null) {
            _hashCode += this.getShippingTaxCode().hashCode();
        }
        if (this.getHandlingTaxCode() != null) {
            _hashCode += this.getHandlingTaxCode().hashCode();
        }
        if (this.getShippingTax2Rate() != null) {
            _hashCode += this.getShippingTax2Rate().hashCode();
        }
        if (this.getHandlingTax1Rate() != null) {
            _hashCode += this.getHandlingTax1Rate().hashCode();
        }
        if (this.getHandlingTax2Rate() != null) {
            _hashCode += this.getHandlingTax2Rate().hashCode();
        }
        if (this.getHandlingCost() != null) {
            _hashCode += this.getHandlingCost().hashCode();
        }
        if (this.getSubTotal() != null) {
            _hashCode += this.getSubTotal().hashCode();
        }
        if (this.getDiscountTotal() != null) {
            _hashCode += this.getDiscountTotal().hashCode();
        }
        if (this.getRevenueStatus() != null) {
            _hashCode += this.getRevenueStatus().hashCode();
        }
        if (this.getRecognizedRevenue() != null) {
            _hashCode += this.getRecognizedRevenue().hashCode();
        }
        if (this.getDeferredRevenue() != null) {
            _hashCode += this.getDeferredRevenue().hashCode();
        }
        if (this.getRevRecOnRevCommitment() != null) {
            _hashCode += this.getRevRecOnRevCommitment().hashCode();
        }
        if (this.getTaxTotal() != null) {
            _hashCode += this.getTaxTotal().hashCode();
        }
        if (this.getTax2Total() != null) {
            _hashCode += this.getTax2Total().hashCode();
        }
        if (this.getAltShippingCost() != null) {
            _hashCode += this.getAltShippingCost().hashCode();
        }
        if (this.getAltHandlingCost() != null) {
            _hashCode += this.getAltHandlingCost().hashCode();
        }
        if (this.getIsMultiShipTo() != null) {
            _hashCode += this.getIsMultiShipTo().hashCode();
        }
        if (this.getTotal() != null) {
            _hashCode += this.getTotal().hashCode();
        }
        if (this.getSalesGroup() != null) {
            _hashCode += this.getSalesGroup().hashCode();
        }
        if (this.getSyncSalesTeams() != null) {
            _hashCode += this.getSyncSalesTeams().hashCode();
        }
        if (this.getStatus() != null) {
            _hashCode += this.getStatus().hashCode();
        }
        if (this.getGiftCert() != null) {
            _hashCode += this.getGiftCert().hashCode();
        }
        if (this.getGiftCertTotal() != null) {
            _hashCode += this.getGiftCertTotal().hashCode();
        }
        if (this.getGiftCertApplied() != null) {
            _hashCode += this.getGiftCertApplied().hashCode();
        }
        if (this.getGiftCertAvailable() != null) {
            _hashCode += this.getGiftCertAvailable().hashCode();
        }
        if (this.getTranIsVsoeBundle() != null) {
            _hashCode += this.getTranIsVsoeBundle().hashCode();
        }
        if (this.getVsoeAutoCalc() != null) {
            _hashCode += this.getVsoeAutoCalc().hashCode();
        }
        if (this.getSyncPartnerTeams() != null) {
            _hashCode += this.getSyncPartnerTeams().hashCode();
        }
        if (this.getSalesTeamList() != null) {
            _hashCode += this.getSalesTeamList().hashCode();
        }
        if (this.getItemList() != null) {
            _hashCode += this.getItemList().hashCode();
        }
        if (this.getAccountingBookDetailList() != null) {
            _hashCode += this.getAccountingBookDetailList().hashCode();
        }
        if (this.getPartnersList() != null) {
            _hashCode += this.getPartnersList().hashCode();
        }
        if (this.getApplyList() != null) {
            _hashCode += this.getApplyList().hashCode();
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
        typeDesc.setXmlType(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "CreditMemo"));
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
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("nexus");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "nexus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subsidiaryTaxRegNum");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "subsidiaryTaxRegNum"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxRegOverride");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "taxRegOverride"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxDetailsOverride");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "taxDetailsOverride"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customForm");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("entity");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "entity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vatRegNum");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "vatRegNum"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("tranDate");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "tranDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("tranId");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "tranId"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("entityTaxRegNum");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "entityTaxRegNum"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxPointDate");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "taxPointDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("createdFrom");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "createdFrom"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("postingPeriod");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "postingPeriod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "department"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "class"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "location"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("job");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "job"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("salesRep");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "salesRep"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("partner");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "partner"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("contribPct");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "contribPct"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("otherRefNum");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "otherRefNum"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("excludeCommission");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "excludeCommission"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("leadSource");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "leadSource"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "balance"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "account"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("exchangeRate");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "exchangeRate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("onCreditHold");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "onCreditHold"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("amountPaid");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "amountPaid"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("salesEffectiveDate");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "salesEffectiveDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("totalCostEstimate");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "totalCostEstimate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("estGrossProfit");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "estGrossProfit"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("estGrossProfitPercent");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "estGrossProfitPercent"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("currencyName");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "currencyName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("promoCode");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "promoCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("amountRemaining");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "amountRemaining"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("discountItem");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "discountItem"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "source"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("discountRate");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "discountRate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isTaxable");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "isTaxable"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxItem");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "taxItem"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxRate");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "taxRate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("unapplied");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "unapplied"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("autoApply");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "autoApply"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("applied");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "applied"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("toBePrinted");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "toBePrinted"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("toBeEmailed");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "toBeEmailed"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "email"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("toBeFaxed");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "toBeFaxed"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fax");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "fax"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("messageSel");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "messageSel"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "message"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billingAddress");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "billingAddress"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billAddressList");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "billAddressList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipMethod");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "shipMethod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shippingCost");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "shippingCost"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shippingTax1Rate");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "shippingTax1Rate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shippingTaxCode");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "shippingTaxCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("handlingTaxCode");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "handlingTaxCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shippingTax2Rate");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "shippingTax2Rate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("handlingTax1Rate");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "handlingTax1Rate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("handlingTax2Rate");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "handlingTax2Rate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("handlingCost");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "handlingCost"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subTotal");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "subTotal"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("discountTotal");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "discountTotal"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revenueStatus");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "revenueStatus"));
        elemField.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "RevenueStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recognizedRevenue");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "recognizedRevenue"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("deferredRevenue");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "deferredRevenue"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revRecOnRevCommitment");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "revRecOnRevCommitment"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxTotal");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "taxTotal"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("tax2Total");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "tax2Total"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("altShippingCost");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "altShippingCost"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("altHandlingCost");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "altHandlingCost"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isMultiShipTo");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "isMultiShipTo"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("total");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "total"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("salesGroup");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "salesGroup"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("syncSalesTeams");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "syncSalesTeams"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "status"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("giftCert");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "giftCert"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("giftCertTotal");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "giftCertTotal"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("giftCertApplied");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "giftCertApplied"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("giftCertAvailable");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "giftCertAvailable"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("tranIsVsoeBundle");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "tranIsVsoeBundle"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vsoeAutoCalc");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "vsoeAutoCalc"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("syncPartnerTeams");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "syncPartnerTeams"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("salesTeamList");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "salesTeamList"));
        elemField.setXmlType(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "CreditMemoSalesTeamList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemList");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "itemList"));
        elemField.setXmlType(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "CreditMemoItemList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("accountingBookDetailList");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "accountingBookDetailList"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "AccountingBookDetailList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("partnersList");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "partnersList"));
        elemField.setXmlType(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "CreditMemoPartnersList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("applyList");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "applyList"));
        elemField.setXmlType(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "CreditMemoApplyList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxDetailsList");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "taxDetailsList"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TaxDetailsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "CustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

