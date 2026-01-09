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
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.GiftCertRedemptionList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.PromotionsList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.TaxDetailsList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.types.AvsMatchCode;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.types.IntercoStatus;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.types.RevenueCommitStatus;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.types.RevenueStatus;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.CustomFieldList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.NullField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.Record;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.sales.SalesOrderItemList;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.sales.SalesOrderPartnersList;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.sales.SalesOrderSalesTeamList;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.sales.SalesOrderShipGroupList;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.sales.types.SalesOrderHandlingMode;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.sales.types.SalesOrderOrderStatus;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.sales.types.SalesOrderPaymentOperation;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.sales.types.TransactionPaymentEventHoldReason;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.sales.types.TransactionPaymentEventResult;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.sales.types.TransactionPaymentEventType;
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

public class SalesOrder
extends Record
implements Serializable {
    private Calendar createdDate;
    private RecordRef customForm;
    private RecordRef entity;
    private RecordRef job;
    private RecordRef currency;
    private RecordRef drAccount;
    private RecordRef fxAccount;
    private Calendar tranDate;
    private String tranId;
    private RecordRef entityTaxRegNum;
    private String source;
    private RecordRef createdFrom;
    private SalesOrderOrderStatus orderStatus;
    private Calendar nextBill;
    private RecordRef opportunity;
    private RecordRef salesRep;
    private String contribPct;
    private RecordRef partner;
    private RecordRef salesGroup;
    private Boolean syncSalesTeams;
    private RecordRef leadSource;
    private Calendar startDate;
    private Calendar endDate;
    private String otherRefNum;
    private String memo;
    private Calendar salesEffectiveDate;
    private Boolean excludeCommission;
    private Double totalCostEstimate;
    private Double estGrossProfit;
    private Double estGrossProfitPercent;
    private Double exchangeRate;
    private RecordRef promoCode;
    private String currencyName;
    private RecordRef discountItem;
    private String discountRate;
    private Boolean isTaxable;
    private RecordRef taxItem;
    private Double taxRate;
    private Boolean toBePrinted;
    private Boolean toBeEmailed;
    private String email;
    private Boolean toBeFaxed;
    private String fax;
    private RecordRef messageSel;
    private String message;
    private RecordRef paymentOption;
    private String inputAuthCode;
    private String inputReferenceCode;
    private String checkNumber;
    private String paymentCardCsc;
    private RecordRef paymentProcessingProfile;
    private SalesOrderHandlingMode handlingMode;
    private String outputAuthCode;
    private String outputReferenceCode;
    private SalesOrderPaymentOperation paymentOperation;
    private String dynamicDescriptor;
    private Address billingAddress;
    private RecordRef billAddressList;
    private Address shippingAddress;
    private Boolean shipIsResidential;
    private RecordRef shipAddressList;
    private String fob;
    private Calendar shipDate;
    private Calendar actualShipDate;
    private RecordRef shipMethod;
    private Double shippingCost;
    private Double shippingTax1Rate;
    private Boolean isMultiShipTo;
    private String shippingTax2Rate;
    private RecordRef shippingTaxCode;
    private RecordRef handlingTaxCode;
    private Double handlingTax1Rate;
    private String handlingTax2Rate;
    private Double handlingCost;
    private String trackingNumbers;
    private String linkedTrackingNumbers;
    private Boolean shipComplete;
    private RecordRef paymentMethod;
    private String shopperIpAddress;
    private Boolean saveOnAuthDecline;
    private Boolean canHaveStackable;
    private RecordRef creditCard;
    private RevenueStatus revenueStatus;
    private Double recognizedRevenue;
    private Double deferredRevenue;
    private Boolean revRecOnRevCommitment;
    private RevenueCommitStatus revCommitStatus;
    private String ccNumber;
    private Calendar ccExpireDate;
    private String ccName;
    private String ccStreet;
    private String ccZipCode;
    private String payPalStatus;
    private RecordRef creditCardProcessor;
    private String payPalTranId;
    private Boolean ccApproved;
    private Boolean getAuth;
    private String authCode;
    private AvsMatchCode ccAvsStreetMatch;
    private AvsMatchCode ccAvsZipMatch;
    private Boolean isRecurringPayment;
    private AvsMatchCode ccSecurityCodeMatch;
    private Double altSalesTotal;
    private Boolean ignoreAvs;
    private TransactionPaymentEventResult paymentEventResult;
    private TransactionPaymentEventHoldReason paymentEventHoldReason;
    private TransactionPaymentEventType paymentEventType;
    private Calendar paymentEventDate;
    private String paymentEventUpdatedBy;
    private Double subTotal;
    private Double discountTotal;
    private Double taxTotal;
    private Double altShippingCost;
    private Double altHandlingCost;
    private Double total;
    private RecordRef revRecSchedule;
    private Calendar revRecStartDate;
    private Calendar revRecEndDate;
    private String paypalAuthId;
    private Double balance;
    private Boolean paypalProcess;
    private RecordRef billingSchedule;
    private String ccSecurityCode;
    private String threeDStatusCode;
    private RecordRef _class;
    private RecordRef department;
    private RecordRef subsidiary;
    private RecordRef intercoTransaction;
    private IntercoStatus intercoStatus;
    private String debitCardIssueNo;
    private Calendar lastModifiedDate;
    private RecordRef nexus;
    private RecordRef subsidiaryTaxRegNum;
    private Boolean taxRegOverride;
    private Calendar taxPointDate;
    private Boolean taxDetailsOverride;
    private RecordRef location;
    private String pnRefNum;
    private String status;
    private Double tax2Total;
    private RecordRef terms;
    private Calendar validFrom;
    private String vatRegNum;
    private Double giftCertApplied;
    private Double oneTime;
    private Double recurWeekly;
    private Double recurMonthly;
    private Double recurQuarterly;
    private Double recurAnnually;
    private Boolean tranIsVsoeBundle;
    private Boolean vsoeAutoCalc;
    private Boolean syncPartnerTeams;
    private SalesOrderSalesTeamList salesTeamList;
    private SalesOrderPartnersList partnersList;
    private GiftCertRedemptionList giftCertRedemptionList;
    private PromotionsList promotionsList;
    private SalesOrderItemList itemList;
    private SalesOrderShipGroupList shipGroupList;
    private AccountingBookDetailList accountingBookDetailList;
    private TaxDetailsList taxDetailsList;
    private CustomFieldList customFieldList;
    private String internalId;
    private String externalId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(SalesOrder.class, true);

    public SalesOrder() {
    }

    public SalesOrder(NullField nullFieldList, String internalId, String externalId, Calendar createdDate, RecordRef customForm, RecordRef entity, RecordRef job, RecordRef currency, RecordRef drAccount, RecordRef fxAccount, Calendar tranDate, String tranId, RecordRef entityTaxRegNum, String source, RecordRef createdFrom, SalesOrderOrderStatus orderStatus, Calendar nextBill, RecordRef opportunity, RecordRef salesRep, String contribPct, RecordRef partner, RecordRef salesGroup, Boolean syncSalesTeams, RecordRef leadSource, Calendar startDate, Calendar endDate, String otherRefNum, String memo, Calendar salesEffectiveDate, Boolean excludeCommission, Double totalCostEstimate, Double estGrossProfit, Double estGrossProfitPercent, Double exchangeRate, RecordRef promoCode, String currencyName, RecordRef discountItem, String discountRate, Boolean isTaxable, RecordRef taxItem, Double taxRate, Boolean toBePrinted, Boolean toBeEmailed, String email, Boolean toBeFaxed, String fax, RecordRef messageSel, String message, RecordRef paymentOption, String inputAuthCode, String inputReferenceCode, String checkNumber, String paymentCardCsc, RecordRef paymentProcessingProfile, SalesOrderHandlingMode handlingMode, String outputAuthCode, String outputReferenceCode, SalesOrderPaymentOperation paymentOperation, String dynamicDescriptor, Address billingAddress, RecordRef billAddressList, Address shippingAddress, Boolean shipIsResidential, RecordRef shipAddressList, String fob, Calendar shipDate, Calendar actualShipDate, RecordRef shipMethod, Double shippingCost, Double shippingTax1Rate, Boolean isMultiShipTo, String shippingTax2Rate, RecordRef shippingTaxCode, RecordRef handlingTaxCode, Double handlingTax1Rate, String handlingTax2Rate, Double handlingCost, String trackingNumbers, String linkedTrackingNumbers, Boolean shipComplete, RecordRef paymentMethod, String shopperIpAddress, Boolean saveOnAuthDecline, Boolean canHaveStackable, RecordRef creditCard, RevenueStatus revenueStatus, Double recognizedRevenue, Double deferredRevenue, Boolean revRecOnRevCommitment, RevenueCommitStatus revCommitStatus, String ccNumber, Calendar ccExpireDate, String ccName, String ccStreet, String ccZipCode, String payPalStatus, RecordRef creditCardProcessor, String payPalTranId, Boolean ccApproved, Boolean getAuth, String authCode, AvsMatchCode ccAvsStreetMatch, AvsMatchCode ccAvsZipMatch, Boolean isRecurringPayment, AvsMatchCode ccSecurityCodeMatch, Double altSalesTotal, Boolean ignoreAvs, TransactionPaymentEventResult paymentEventResult, TransactionPaymentEventHoldReason paymentEventHoldReason, TransactionPaymentEventType paymentEventType, Calendar paymentEventDate, String paymentEventUpdatedBy, Double subTotal, Double discountTotal, Double taxTotal, Double altShippingCost, Double altHandlingCost, Double total, RecordRef revRecSchedule, Calendar revRecStartDate, Calendar revRecEndDate, String paypalAuthId, Double balance, Boolean paypalProcess, RecordRef billingSchedule, String ccSecurityCode, String threeDStatusCode, RecordRef _class, RecordRef department, RecordRef subsidiary, RecordRef intercoTransaction, IntercoStatus intercoStatus, String debitCardIssueNo, Calendar lastModifiedDate, RecordRef nexus, RecordRef subsidiaryTaxRegNum, Boolean taxRegOverride, Calendar taxPointDate, Boolean taxDetailsOverride, RecordRef location, String pnRefNum, String status, Double tax2Total, RecordRef terms, Calendar validFrom, String vatRegNum, Double giftCertApplied, Double oneTime, Double recurWeekly, Double recurMonthly, Double recurQuarterly, Double recurAnnually, Boolean tranIsVsoeBundle, Boolean vsoeAutoCalc, Boolean syncPartnerTeams, SalesOrderSalesTeamList salesTeamList, SalesOrderPartnersList partnersList, GiftCertRedemptionList giftCertRedemptionList, PromotionsList promotionsList, SalesOrderItemList itemList, SalesOrderShipGroupList shipGroupList, AccountingBookDetailList accountingBookDetailList, TaxDetailsList taxDetailsList, CustomFieldList customFieldList) {
        super(nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.createdDate = createdDate;
        this.customForm = customForm;
        this.entity = entity;
        this.job = job;
        this.currency = currency;
        this.drAccount = drAccount;
        this.fxAccount = fxAccount;
        this.tranDate = tranDate;
        this.tranId = tranId;
        this.entityTaxRegNum = entityTaxRegNum;
        this.source = source;
        this.createdFrom = createdFrom;
        this.orderStatus = orderStatus;
        this.nextBill = nextBill;
        this.opportunity = opportunity;
        this.salesRep = salesRep;
        this.contribPct = contribPct;
        this.partner = partner;
        this.salesGroup = salesGroup;
        this.syncSalesTeams = syncSalesTeams;
        this.leadSource = leadSource;
        this.startDate = startDate;
        this.endDate = endDate;
        this.otherRefNum = otherRefNum;
        this.memo = memo;
        this.salesEffectiveDate = salesEffectiveDate;
        this.excludeCommission = excludeCommission;
        this.totalCostEstimate = totalCostEstimate;
        this.estGrossProfit = estGrossProfit;
        this.estGrossProfitPercent = estGrossProfitPercent;
        this.exchangeRate = exchangeRate;
        this.promoCode = promoCode;
        this.currencyName = currencyName;
        this.discountItem = discountItem;
        this.discountRate = discountRate;
        this.isTaxable = isTaxable;
        this.taxItem = taxItem;
        this.taxRate = taxRate;
        this.toBePrinted = toBePrinted;
        this.toBeEmailed = toBeEmailed;
        this.email = email;
        this.toBeFaxed = toBeFaxed;
        this.fax = fax;
        this.messageSel = messageSel;
        this.message = message;
        this.paymentOption = paymentOption;
        this.inputAuthCode = inputAuthCode;
        this.inputReferenceCode = inputReferenceCode;
        this.checkNumber = checkNumber;
        this.paymentCardCsc = paymentCardCsc;
        this.paymentProcessingProfile = paymentProcessingProfile;
        this.handlingMode = handlingMode;
        this.outputAuthCode = outputAuthCode;
        this.outputReferenceCode = outputReferenceCode;
        this.paymentOperation = paymentOperation;
        this.dynamicDescriptor = dynamicDescriptor;
        this.billingAddress = billingAddress;
        this.billAddressList = billAddressList;
        this.shippingAddress = shippingAddress;
        this.shipIsResidential = shipIsResidential;
        this.shipAddressList = shipAddressList;
        this.fob = fob;
        this.shipDate = shipDate;
        this.actualShipDate = actualShipDate;
        this.shipMethod = shipMethod;
        this.shippingCost = shippingCost;
        this.shippingTax1Rate = shippingTax1Rate;
        this.isMultiShipTo = isMultiShipTo;
        this.shippingTax2Rate = shippingTax2Rate;
        this.shippingTaxCode = shippingTaxCode;
        this.handlingTaxCode = handlingTaxCode;
        this.handlingTax1Rate = handlingTax1Rate;
        this.handlingTax2Rate = handlingTax2Rate;
        this.handlingCost = handlingCost;
        this.trackingNumbers = trackingNumbers;
        this.linkedTrackingNumbers = linkedTrackingNumbers;
        this.shipComplete = shipComplete;
        this.paymentMethod = paymentMethod;
        this.shopperIpAddress = shopperIpAddress;
        this.saveOnAuthDecline = saveOnAuthDecline;
        this.canHaveStackable = canHaveStackable;
        this.creditCard = creditCard;
        this.revenueStatus = revenueStatus;
        this.recognizedRevenue = recognizedRevenue;
        this.deferredRevenue = deferredRevenue;
        this.revRecOnRevCommitment = revRecOnRevCommitment;
        this.revCommitStatus = revCommitStatus;
        this.ccNumber = ccNumber;
        this.ccExpireDate = ccExpireDate;
        this.ccName = ccName;
        this.ccStreet = ccStreet;
        this.ccZipCode = ccZipCode;
        this.payPalStatus = payPalStatus;
        this.creditCardProcessor = creditCardProcessor;
        this.payPalTranId = payPalTranId;
        this.ccApproved = ccApproved;
        this.getAuth = getAuth;
        this.authCode = authCode;
        this.ccAvsStreetMatch = ccAvsStreetMatch;
        this.ccAvsZipMatch = ccAvsZipMatch;
        this.isRecurringPayment = isRecurringPayment;
        this.ccSecurityCodeMatch = ccSecurityCodeMatch;
        this.altSalesTotal = altSalesTotal;
        this.ignoreAvs = ignoreAvs;
        this.paymentEventResult = paymentEventResult;
        this.paymentEventHoldReason = paymentEventHoldReason;
        this.paymentEventType = paymentEventType;
        this.paymentEventDate = paymentEventDate;
        this.paymentEventUpdatedBy = paymentEventUpdatedBy;
        this.subTotal = subTotal;
        this.discountTotal = discountTotal;
        this.taxTotal = taxTotal;
        this.altShippingCost = altShippingCost;
        this.altHandlingCost = altHandlingCost;
        this.total = total;
        this.revRecSchedule = revRecSchedule;
        this.revRecStartDate = revRecStartDate;
        this.revRecEndDate = revRecEndDate;
        this.paypalAuthId = paypalAuthId;
        this.balance = balance;
        this.paypalProcess = paypalProcess;
        this.billingSchedule = billingSchedule;
        this.ccSecurityCode = ccSecurityCode;
        this.threeDStatusCode = threeDStatusCode;
        this._class = _class;
        this.department = department;
        this.subsidiary = subsidiary;
        this.intercoTransaction = intercoTransaction;
        this.intercoStatus = intercoStatus;
        this.debitCardIssueNo = debitCardIssueNo;
        this.lastModifiedDate = lastModifiedDate;
        this.nexus = nexus;
        this.subsidiaryTaxRegNum = subsidiaryTaxRegNum;
        this.taxRegOverride = taxRegOverride;
        this.taxPointDate = taxPointDate;
        this.taxDetailsOverride = taxDetailsOverride;
        this.location = location;
        this.pnRefNum = pnRefNum;
        this.status = status;
        this.tax2Total = tax2Total;
        this.terms = terms;
        this.validFrom = validFrom;
        this.vatRegNum = vatRegNum;
        this.giftCertApplied = giftCertApplied;
        this.oneTime = oneTime;
        this.recurWeekly = recurWeekly;
        this.recurMonthly = recurMonthly;
        this.recurQuarterly = recurQuarterly;
        this.recurAnnually = recurAnnually;
        this.tranIsVsoeBundle = tranIsVsoeBundle;
        this.vsoeAutoCalc = vsoeAutoCalc;
        this.syncPartnerTeams = syncPartnerTeams;
        this.salesTeamList = salesTeamList;
        this.partnersList = partnersList;
        this.giftCertRedemptionList = giftCertRedemptionList;
        this.promotionsList = promotionsList;
        this.itemList = itemList;
        this.shipGroupList = shipGroupList;
        this.accountingBookDetailList = accountingBookDetailList;
        this.taxDetailsList = taxDetailsList;
        this.customFieldList = customFieldList;
    }

    public Calendar getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(Calendar createdDate) {
        this.createdDate = createdDate;
    }

    public RecordRef getCustomForm() {
        return this.customForm;
    }

    public void setCustomForm(RecordRef customForm) {
        this.customForm = customForm;
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

    public RecordRef getCurrency() {
        return this.currency;
    }

    public void setCurrency(RecordRef currency) {
        this.currency = currency;
    }

    public RecordRef getDrAccount() {
        return this.drAccount;
    }

    public void setDrAccount(RecordRef drAccount) {
        this.drAccount = drAccount;
    }

    public RecordRef getFxAccount() {
        return this.fxAccount;
    }

    public void setFxAccount(RecordRef fxAccount) {
        this.fxAccount = fxAccount;
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

    public String getSource() {
        return this.source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public RecordRef getCreatedFrom() {
        return this.createdFrom;
    }

    public void setCreatedFrom(RecordRef createdFrom) {
        this.createdFrom = createdFrom;
    }

    public SalesOrderOrderStatus getOrderStatus() {
        return this.orderStatus;
    }

    public void setOrderStatus(SalesOrderOrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Calendar getNextBill() {
        return this.nextBill;
    }

    public void setNextBill(Calendar nextBill) {
        this.nextBill = nextBill;
    }

    public RecordRef getOpportunity() {
        return this.opportunity;
    }

    public void setOpportunity(RecordRef opportunity) {
        this.opportunity = opportunity;
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

    public Calendar getSalesEffectiveDate() {
        return this.salesEffectiveDate;
    }

    public void setSalesEffectiveDate(Calendar salesEffectiveDate) {
        this.salesEffectiveDate = salesEffectiveDate;
    }

    public Boolean getExcludeCommission() {
        return this.excludeCommission;
    }

    public void setExcludeCommission(Boolean excludeCommission) {
        this.excludeCommission = excludeCommission;
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

    public Double getExchangeRate() {
        return this.exchangeRate;
    }

    public void setExchangeRate(Double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public RecordRef getPromoCode() {
        return this.promoCode;
    }

    public void setPromoCode(RecordRef promoCode) {
        this.promoCode = promoCode;
    }

    public String getCurrencyName() {
        return this.currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public RecordRef getDiscountItem() {
        return this.discountItem;
    }

    public void setDiscountItem(RecordRef discountItem) {
        this.discountItem = discountItem;
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

    public RecordRef getPaymentOption() {
        return this.paymentOption;
    }

    public void setPaymentOption(RecordRef paymentOption) {
        this.paymentOption = paymentOption;
    }

    public String getInputAuthCode() {
        return this.inputAuthCode;
    }

    public void setInputAuthCode(String inputAuthCode) {
        this.inputAuthCode = inputAuthCode;
    }

    public String getInputReferenceCode() {
        return this.inputReferenceCode;
    }

    public void setInputReferenceCode(String inputReferenceCode) {
        this.inputReferenceCode = inputReferenceCode;
    }

    public String getCheckNumber() {
        return this.checkNumber;
    }

    public void setCheckNumber(String checkNumber) {
        this.checkNumber = checkNumber;
    }

    public String getPaymentCardCsc() {
        return this.paymentCardCsc;
    }

    public void setPaymentCardCsc(String paymentCardCsc) {
        this.paymentCardCsc = paymentCardCsc;
    }

    public RecordRef getPaymentProcessingProfile() {
        return this.paymentProcessingProfile;
    }

    public void setPaymentProcessingProfile(RecordRef paymentProcessingProfile) {
        this.paymentProcessingProfile = paymentProcessingProfile;
    }

    public SalesOrderHandlingMode getHandlingMode() {
        return this.handlingMode;
    }

    public void setHandlingMode(SalesOrderHandlingMode handlingMode) {
        this.handlingMode = handlingMode;
    }

    public String getOutputAuthCode() {
        return this.outputAuthCode;
    }

    public void setOutputAuthCode(String outputAuthCode) {
        this.outputAuthCode = outputAuthCode;
    }

    public String getOutputReferenceCode() {
        return this.outputReferenceCode;
    }

    public void setOutputReferenceCode(String outputReferenceCode) {
        this.outputReferenceCode = outputReferenceCode;
    }

    public SalesOrderPaymentOperation getPaymentOperation() {
        return this.paymentOperation;
    }

    public void setPaymentOperation(SalesOrderPaymentOperation paymentOperation) {
        this.paymentOperation = paymentOperation;
    }

    public String getDynamicDescriptor() {
        return this.dynamicDescriptor;
    }

    public void setDynamicDescriptor(String dynamicDescriptor) {
        this.dynamicDescriptor = dynamicDescriptor;
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

    public String getFob() {
        return this.fob;
    }

    public void setFob(String fob) {
        this.fob = fob;
    }

    public Calendar getShipDate() {
        return this.shipDate;
    }

    public void setShipDate(Calendar shipDate) {
        this.shipDate = shipDate;
    }

    public Calendar getActualShipDate() {
        return this.actualShipDate;
    }

    public void setActualShipDate(Calendar actualShipDate) {
        this.actualShipDate = actualShipDate;
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

    public Boolean getIsMultiShipTo() {
        return this.isMultiShipTo;
    }

    public void setIsMultiShipTo(Boolean isMultiShipTo) {
        this.isMultiShipTo = isMultiShipTo;
    }

    public String getShippingTax2Rate() {
        return this.shippingTax2Rate;
    }

    public void setShippingTax2Rate(String shippingTax2Rate) {
        this.shippingTax2Rate = shippingTax2Rate;
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

    public String getTrackingNumbers() {
        return this.trackingNumbers;
    }

    public void setTrackingNumbers(String trackingNumbers) {
        this.trackingNumbers = trackingNumbers;
    }

    public String getLinkedTrackingNumbers() {
        return this.linkedTrackingNumbers;
    }

    public void setLinkedTrackingNumbers(String linkedTrackingNumbers) {
        this.linkedTrackingNumbers = linkedTrackingNumbers;
    }

    public Boolean getShipComplete() {
        return this.shipComplete;
    }

    public void setShipComplete(Boolean shipComplete) {
        this.shipComplete = shipComplete;
    }

    public RecordRef getPaymentMethod() {
        return this.paymentMethod;
    }

    public void setPaymentMethod(RecordRef paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getShopperIpAddress() {
        return this.shopperIpAddress;
    }

    public void setShopperIpAddress(String shopperIpAddress) {
        this.shopperIpAddress = shopperIpAddress;
    }

    public Boolean getSaveOnAuthDecline() {
        return this.saveOnAuthDecline;
    }

    public void setSaveOnAuthDecline(Boolean saveOnAuthDecline) {
        this.saveOnAuthDecline = saveOnAuthDecline;
    }

    public Boolean getCanHaveStackable() {
        return this.canHaveStackable;
    }

    public void setCanHaveStackable(Boolean canHaveStackable) {
        this.canHaveStackable = canHaveStackable;
    }

    public RecordRef getCreditCard() {
        return this.creditCard;
    }

    public void setCreditCard(RecordRef creditCard) {
        this.creditCard = creditCard;
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

    public RevenueCommitStatus getRevCommitStatus() {
        return this.revCommitStatus;
    }

    public void setRevCommitStatus(RevenueCommitStatus revCommitStatus) {
        this.revCommitStatus = revCommitStatus;
    }

    public String getCcNumber() {
        return this.ccNumber;
    }

    public void setCcNumber(String ccNumber) {
        this.ccNumber = ccNumber;
    }

    public Calendar getCcExpireDate() {
        return this.ccExpireDate;
    }

    public void setCcExpireDate(Calendar ccExpireDate) {
        this.ccExpireDate = ccExpireDate;
    }

    public String getCcName() {
        return this.ccName;
    }

    public void setCcName(String ccName) {
        this.ccName = ccName;
    }

    public String getCcStreet() {
        return this.ccStreet;
    }

    public void setCcStreet(String ccStreet) {
        this.ccStreet = ccStreet;
    }

    public String getCcZipCode() {
        return this.ccZipCode;
    }

    public void setCcZipCode(String ccZipCode) {
        this.ccZipCode = ccZipCode;
    }

    public String getPayPalStatus() {
        return this.payPalStatus;
    }

    public void setPayPalStatus(String payPalStatus) {
        this.payPalStatus = payPalStatus;
    }

    public RecordRef getCreditCardProcessor() {
        return this.creditCardProcessor;
    }

    public void setCreditCardProcessor(RecordRef creditCardProcessor) {
        this.creditCardProcessor = creditCardProcessor;
    }

    public String getPayPalTranId() {
        return this.payPalTranId;
    }

    public void setPayPalTranId(String payPalTranId) {
        this.payPalTranId = payPalTranId;
    }

    public Boolean getCcApproved() {
        return this.ccApproved;
    }

    public void setCcApproved(Boolean ccApproved) {
        this.ccApproved = ccApproved;
    }

    public Boolean getGetAuth() {
        return this.getAuth;
    }

    public void setGetAuth(Boolean getAuth) {
        this.getAuth = getAuth;
    }

    public String getAuthCode() {
        return this.authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    public AvsMatchCode getCcAvsStreetMatch() {
        return this.ccAvsStreetMatch;
    }

    public void setCcAvsStreetMatch(AvsMatchCode ccAvsStreetMatch) {
        this.ccAvsStreetMatch = ccAvsStreetMatch;
    }

    public AvsMatchCode getCcAvsZipMatch() {
        return this.ccAvsZipMatch;
    }

    public void setCcAvsZipMatch(AvsMatchCode ccAvsZipMatch) {
        this.ccAvsZipMatch = ccAvsZipMatch;
    }

    public Boolean getIsRecurringPayment() {
        return this.isRecurringPayment;
    }

    public void setIsRecurringPayment(Boolean isRecurringPayment) {
        this.isRecurringPayment = isRecurringPayment;
    }

    public AvsMatchCode getCcSecurityCodeMatch() {
        return this.ccSecurityCodeMatch;
    }

    public void setCcSecurityCodeMatch(AvsMatchCode ccSecurityCodeMatch) {
        this.ccSecurityCodeMatch = ccSecurityCodeMatch;
    }

    public Double getAltSalesTotal() {
        return this.altSalesTotal;
    }

    public void setAltSalesTotal(Double altSalesTotal) {
        this.altSalesTotal = altSalesTotal;
    }

    public Boolean getIgnoreAvs() {
        return this.ignoreAvs;
    }

    public void setIgnoreAvs(Boolean ignoreAvs) {
        this.ignoreAvs = ignoreAvs;
    }

    public TransactionPaymentEventResult getPaymentEventResult() {
        return this.paymentEventResult;
    }

    public void setPaymentEventResult(TransactionPaymentEventResult paymentEventResult) {
        this.paymentEventResult = paymentEventResult;
    }

    public TransactionPaymentEventHoldReason getPaymentEventHoldReason() {
        return this.paymentEventHoldReason;
    }

    public void setPaymentEventHoldReason(TransactionPaymentEventHoldReason paymentEventHoldReason) {
        this.paymentEventHoldReason = paymentEventHoldReason;
    }

    public TransactionPaymentEventType getPaymentEventType() {
        return this.paymentEventType;
    }

    public void setPaymentEventType(TransactionPaymentEventType paymentEventType) {
        this.paymentEventType = paymentEventType;
    }

    public Calendar getPaymentEventDate() {
        return this.paymentEventDate;
    }

    public void setPaymentEventDate(Calendar paymentEventDate) {
        this.paymentEventDate = paymentEventDate;
    }

    public String getPaymentEventUpdatedBy() {
        return this.paymentEventUpdatedBy;
    }

    public void setPaymentEventUpdatedBy(String paymentEventUpdatedBy) {
        this.paymentEventUpdatedBy = paymentEventUpdatedBy;
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

    public Double getTaxTotal() {
        return this.taxTotal;
    }

    public void setTaxTotal(Double taxTotal) {
        this.taxTotal = taxTotal;
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

    public Double getTotal() {
        return this.total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public RecordRef getRevRecSchedule() {
        return this.revRecSchedule;
    }

    public void setRevRecSchedule(RecordRef revRecSchedule) {
        this.revRecSchedule = revRecSchedule;
    }

    public Calendar getRevRecStartDate() {
        return this.revRecStartDate;
    }

    public void setRevRecStartDate(Calendar revRecStartDate) {
        this.revRecStartDate = revRecStartDate;
    }

    public Calendar getRevRecEndDate() {
        return this.revRecEndDate;
    }

    public void setRevRecEndDate(Calendar revRecEndDate) {
        this.revRecEndDate = revRecEndDate;
    }

    public String getPaypalAuthId() {
        return this.paypalAuthId;
    }

    public void setPaypalAuthId(String paypalAuthId) {
        this.paypalAuthId = paypalAuthId;
    }

    public Double getBalance() {
        return this.balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Boolean getPaypalProcess() {
        return this.paypalProcess;
    }

    public void setPaypalProcess(Boolean paypalProcess) {
        this.paypalProcess = paypalProcess;
    }

    public RecordRef getBillingSchedule() {
        return this.billingSchedule;
    }

    public void setBillingSchedule(RecordRef billingSchedule) {
        this.billingSchedule = billingSchedule;
    }

    public String getCcSecurityCode() {
        return this.ccSecurityCode;
    }

    public void setCcSecurityCode(String ccSecurityCode) {
        this.ccSecurityCode = ccSecurityCode;
    }

    public String getThreeDStatusCode() {
        return this.threeDStatusCode;
    }

    public void setThreeDStatusCode(String threeDStatusCode) {
        this.threeDStatusCode = threeDStatusCode;
    }

    public RecordRef get_class() {
        return this._class;
    }

    public void set_class(RecordRef _class) {
        this._class = _class;
    }

    public RecordRef getDepartment() {
        return this.department;
    }

    public void setDepartment(RecordRef department) {
        this.department = department;
    }

    public RecordRef getSubsidiary() {
        return this.subsidiary;
    }

    public void setSubsidiary(RecordRef subsidiary) {
        this.subsidiary = subsidiary;
    }

    public RecordRef getIntercoTransaction() {
        return this.intercoTransaction;
    }

    public void setIntercoTransaction(RecordRef intercoTransaction) {
        this.intercoTransaction = intercoTransaction;
    }

    public IntercoStatus getIntercoStatus() {
        return this.intercoStatus;
    }

    public void setIntercoStatus(IntercoStatus intercoStatus) {
        this.intercoStatus = intercoStatus;
    }

    public String getDebitCardIssueNo() {
        return this.debitCardIssueNo;
    }

    public void setDebitCardIssueNo(String debitCardIssueNo) {
        this.debitCardIssueNo = debitCardIssueNo;
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

    public Calendar getTaxPointDate() {
        return this.taxPointDate;
    }

    public void setTaxPointDate(Calendar taxPointDate) {
        this.taxPointDate = taxPointDate;
    }

    public Boolean getTaxDetailsOverride() {
        return this.taxDetailsOverride;
    }

    public void setTaxDetailsOverride(Boolean taxDetailsOverride) {
        this.taxDetailsOverride = taxDetailsOverride;
    }

    public RecordRef getLocation() {
        return this.location;
    }

    public void setLocation(RecordRef location) {
        this.location = location;
    }

    public String getPnRefNum() {
        return this.pnRefNum;
    }

    public void setPnRefNum(String pnRefNum) {
        this.pnRefNum = pnRefNum;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Double getTax2Total() {
        return this.tax2Total;
    }

    public void setTax2Total(Double tax2Total) {
        this.tax2Total = tax2Total;
    }

    public RecordRef getTerms() {
        return this.terms;
    }

    public void setTerms(RecordRef terms) {
        this.terms = terms;
    }

    public Calendar getValidFrom() {
        return this.validFrom;
    }

    public void setValidFrom(Calendar validFrom) {
        this.validFrom = validFrom;
    }

    public String getVatRegNum() {
        return this.vatRegNum;
    }

    public void setVatRegNum(String vatRegNum) {
        this.vatRegNum = vatRegNum;
    }

    public Double getGiftCertApplied() {
        return this.giftCertApplied;
    }

    public void setGiftCertApplied(Double giftCertApplied) {
        this.giftCertApplied = giftCertApplied;
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

    public SalesOrderSalesTeamList getSalesTeamList() {
        return this.salesTeamList;
    }

    public void setSalesTeamList(SalesOrderSalesTeamList salesTeamList) {
        this.salesTeamList = salesTeamList;
    }

    public SalesOrderPartnersList getPartnersList() {
        return this.partnersList;
    }

    public void setPartnersList(SalesOrderPartnersList partnersList) {
        this.partnersList = partnersList;
    }

    public GiftCertRedemptionList getGiftCertRedemptionList() {
        return this.giftCertRedemptionList;
    }

    public void setGiftCertRedemptionList(GiftCertRedemptionList giftCertRedemptionList) {
        this.giftCertRedemptionList = giftCertRedemptionList;
    }

    public PromotionsList getPromotionsList() {
        return this.promotionsList;
    }

    public void setPromotionsList(PromotionsList promotionsList) {
        this.promotionsList = promotionsList;
    }

    public SalesOrderItemList getItemList() {
        return this.itemList;
    }

    public void setItemList(SalesOrderItemList itemList) {
        this.itemList = itemList;
    }

    public SalesOrderShipGroupList getShipGroupList() {
        return this.shipGroupList;
    }

    public void setShipGroupList(SalesOrderShipGroupList shipGroupList) {
        this.shipGroupList = shipGroupList;
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
        if (!(obj instanceof SalesOrder)) {
            return false;
        }
        SalesOrder other = (SalesOrder)obj;
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
        boolean _equals = super.equals(obj) && (this.createdDate == null && other.getCreatedDate() == null || this.createdDate != null && this.createdDate.equals(other.getCreatedDate())) && (this.customForm == null && other.getCustomForm() == null || this.customForm != null && this.customForm.equals(other.getCustomForm())) && (this.entity == null && other.getEntity() == null || this.entity != null && this.entity.equals(other.getEntity())) && (this.job == null && other.getJob() == null || this.job != null && this.job.equals(other.getJob())) && (this.currency == null && other.getCurrency() == null || this.currency != null && this.currency.equals(other.getCurrency())) && (this.drAccount == null && other.getDrAccount() == null || this.drAccount != null && this.drAccount.equals(other.getDrAccount())) && (this.fxAccount == null && other.getFxAccount() == null || this.fxAccount != null && this.fxAccount.equals(other.getFxAccount())) && (this.tranDate == null && other.getTranDate() == null || this.tranDate != null && this.tranDate.equals(other.getTranDate())) && (this.tranId == null && other.getTranId() == null || this.tranId != null && this.tranId.equals(other.getTranId())) && (this.entityTaxRegNum == null && other.getEntityTaxRegNum() == null || this.entityTaxRegNum != null && this.entityTaxRegNum.equals(other.getEntityTaxRegNum())) && (this.source == null && other.getSource() == null || this.source != null && this.source.equals(other.getSource())) && (this.createdFrom == null && other.getCreatedFrom() == null || this.createdFrom != null && this.createdFrom.equals(other.getCreatedFrom())) && (this.orderStatus == null && other.getOrderStatus() == null || this.orderStatus != null && this.orderStatus.equals(other.getOrderStatus())) && (this.nextBill == null && other.getNextBill() == null || this.nextBill != null && this.nextBill.equals(other.getNextBill())) && (this.opportunity == null && other.getOpportunity() == null || this.opportunity != null && this.opportunity.equals(other.getOpportunity())) && (this.salesRep == null && other.getSalesRep() == null || this.salesRep != null && this.salesRep.equals(other.getSalesRep())) && (this.contribPct == null && other.getContribPct() == null || this.contribPct != null && this.contribPct.equals(other.getContribPct())) && (this.partner == null && other.getPartner() == null || this.partner != null && this.partner.equals(other.getPartner())) && (this.salesGroup == null && other.getSalesGroup() == null || this.salesGroup != null && this.salesGroup.equals(other.getSalesGroup())) && (this.syncSalesTeams == null && other.getSyncSalesTeams() == null || this.syncSalesTeams != null && this.syncSalesTeams.equals(other.getSyncSalesTeams())) && (this.leadSource == null && other.getLeadSource() == null || this.leadSource != null && this.leadSource.equals(other.getLeadSource())) && (this.startDate == null && other.getStartDate() == null || this.startDate != null && this.startDate.equals(other.getStartDate())) && (this.endDate == null && other.getEndDate() == null || this.endDate != null && this.endDate.equals(other.getEndDate())) && (this.otherRefNum == null && other.getOtherRefNum() == null || this.otherRefNum != null && this.otherRefNum.equals(other.getOtherRefNum())) && (this.memo == null && other.getMemo() == null || this.memo != null && this.memo.equals(other.getMemo())) && (this.salesEffectiveDate == null && other.getSalesEffectiveDate() == null || this.salesEffectiveDate != null && this.salesEffectiveDate.equals(other.getSalesEffectiveDate())) && (this.excludeCommission == null && other.getExcludeCommission() == null || this.excludeCommission != null && this.excludeCommission.equals(other.getExcludeCommission())) && (this.totalCostEstimate == null && other.getTotalCostEstimate() == null || this.totalCostEstimate != null && this.totalCostEstimate.equals(other.getTotalCostEstimate())) && (this.estGrossProfit == null && other.getEstGrossProfit() == null || this.estGrossProfit != null && this.estGrossProfit.equals(other.getEstGrossProfit())) && (this.estGrossProfitPercent == null && other.getEstGrossProfitPercent() == null || this.estGrossProfitPercent != null && this.estGrossProfitPercent.equals(other.getEstGrossProfitPercent())) && (this.exchangeRate == null && other.getExchangeRate() == null || this.exchangeRate != null && this.exchangeRate.equals(other.getExchangeRate())) && (this.promoCode == null && other.getPromoCode() == null || this.promoCode != null && this.promoCode.equals(other.getPromoCode())) && (this.currencyName == null && other.getCurrencyName() == null || this.currencyName != null && this.currencyName.equals(other.getCurrencyName())) && (this.discountItem == null && other.getDiscountItem() == null || this.discountItem != null && this.discountItem.equals(other.getDiscountItem())) && (this.discountRate == null && other.getDiscountRate() == null || this.discountRate != null && this.discountRate.equals(other.getDiscountRate())) && (this.isTaxable == null && other.getIsTaxable() == null || this.isTaxable != null && this.isTaxable.equals(other.getIsTaxable())) && (this.taxItem == null && other.getTaxItem() == null || this.taxItem != null && this.taxItem.equals(other.getTaxItem())) && (this.taxRate == null && other.getTaxRate() == null || this.taxRate != null && this.taxRate.equals(other.getTaxRate())) && (this.toBePrinted == null && other.getToBePrinted() == null || this.toBePrinted != null && this.toBePrinted.equals(other.getToBePrinted())) && (this.toBeEmailed == null && other.getToBeEmailed() == null || this.toBeEmailed != null && this.toBeEmailed.equals(other.getToBeEmailed())) && (this.email == null && other.getEmail() == null || this.email != null && this.email.equals(other.getEmail())) && (this.toBeFaxed == null && other.getToBeFaxed() == null || this.toBeFaxed != null && this.toBeFaxed.equals(other.getToBeFaxed())) && (this.fax == null && other.getFax() == null || this.fax != null && this.fax.equals(other.getFax())) && (this.messageSel == null && other.getMessageSel() == null || this.messageSel != null && this.messageSel.equals(other.getMessageSel())) && (this.message == null && other.getMessage() == null || this.message != null && this.message.equals(other.getMessage())) && (this.paymentOption == null && other.getPaymentOption() == null || this.paymentOption != null && this.paymentOption.equals(other.getPaymentOption())) && (this.inputAuthCode == null && other.getInputAuthCode() == null || this.inputAuthCode != null && this.inputAuthCode.equals(other.getInputAuthCode())) && (this.inputReferenceCode == null && other.getInputReferenceCode() == null || this.inputReferenceCode != null && this.inputReferenceCode.equals(other.getInputReferenceCode())) && (this.checkNumber == null && other.getCheckNumber() == null || this.checkNumber != null && this.checkNumber.equals(other.getCheckNumber())) && (this.paymentCardCsc == null && other.getPaymentCardCsc() == null || this.paymentCardCsc != null && this.paymentCardCsc.equals(other.getPaymentCardCsc())) && (this.paymentProcessingProfile == null && other.getPaymentProcessingProfile() == null || this.paymentProcessingProfile != null && this.paymentProcessingProfile.equals(other.getPaymentProcessingProfile())) && (this.handlingMode == null && other.getHandlingMode() == null || this.handlingMode != null && this.handlingMode.equals(other.getHandlingMode())) && (this.outputAuthCode == null && other.getOutputAuthCode() == null || this.outputAuthCode != null && this.outputAuthCode.equals(other.getOutputAuthCode())) && (this.outputReferenceCode == null && other.getOutputReferenceCode() == null || this.outputReferenceCode != null && this.outputReferenceCode.equals(other.getOutputReferenceCode())) && (this.paymentOperation == null && other.getPaymentOperation() == null || this.paymentOperation != null && this.paymentOperation.equals(other.getPaymentOperation())) && (this.dynamicDescriptor == null && other.getDynamicDescriptor() == null || this.dynamicDescriptor != null && this.dynamicDescriptor.equals(other.getDynamicDescriptor())) && (this.billingAddress == null && other.getBillingAddress() == null || this.billingAddress != null && this.billingAddress.equals(other.getBillingAddress())) && (this.billAddressList == null && other.getBillAddressList() == null || this.billAddressList != null && this.billAddressList.equals(other.getBillAddressList())) && (this.shippingAddress == null && other.getShippingAddress() == null || this.shippingAddress != null && this.shippingAddress.equals(other.getShippingAddress())) && (this.shipIsResidential == null && other.getShipIsResidential() == null || this.shipIsResidential != null && this.shipIsResidential.equals(other.getShipIsResidential())) && (this.shipAddressList == null && other.getShipAddressList() == null || this.shipAddressList != null && this.shipAddressList.equals(other.getShipAddressList())) && (this.fob == null && other.getFob() == null || this.fob != null && this.fob.equals(other.getFob())) && (this.shipDate == null && other.getShipDate() == null || this.shipDate != null && this.shipDate.equals(other.getShipDate())) && (this.actualShipDate == null && other.getActualShipDate() == null || this.actualShipDate != null && this.actualShipDate.equals(other.getActualShipDate())) && (this.shipMethod == null && other.getShipMethod() == null || this.shipMethod != null && this.shipMethod.equals(other.getShipMethod())) && (this.shippingCost == null && other.getShippingCost() == null || this.shippingCost != null && this.shippingCost.equals(other.getShippingCost())) && (this.shippingTax1Rate == null && other.getShippingTax1Rate() == null || this.shippingTax1Rate != null && this.shippingTax1Rate.equals(other.getShippingTax1Rate())) && (this.isMultiShipTo == null && other.getIsMultiShipTo() == null || this.isMultiShipTo != null && this.isMultiShipTo.equals(other.getIsMultiShipTo())) && (this.shippingTax2Rate == null && other.getShippingTax2Rate() == null || this.shippingTax2Rate != null && this.shippingTax2Rate.equals(other.getShippingTax2Rate())) && (this.shippingTaxCode == null && other.getShippingTaxCode() == null || this.shippingTaxCode != null && this.shippingTaxCode.equals(other.getShippingTaxCode())) && (this.handlingTaxCode == null && other.getHandlingTaxCode() == null || this.handlingTaxCode != null && this.handlingTaxCode.equals(other.getHandlingTaxCode())) && (this.handlingTax1Rate == null && other.getHandlingTax1Rate() == null || this.handlingTax1Rate != null && this.handlingTax1Rate.equals(other.getHandlingTax1Rate())) && (this.handlingTax2Rate == null && other.getHandlingTax2Rate() == null || this.handlingTax2Rate != null && this.handlingTax2Rate.equals(other.getHandlingTax2Rate())) && (this.handlingCost == null && other.getHandlingCost() == null || this.handlingCost != null && this.handlingCost.equals(other.getHandlingCost())) && (this.trackingNumbers == null && other.getTrackingNumbers() == null || this.trackingNumbers != null && this.trackingNumbers.equals(other.getTrackingNumbers())) && (this.linkedTrackingNumbers == null && other.getLinkedTrackingNumbers() == null || this.linkedTrackingNumbers != null && this.linkedTrackingNumbers.equals(other.getLinkedTrackingNumbers())) && (this.shipComplete == null && other.getShipComplete() == null || this.shipComplete != null && this.shipComplete.equals(other.getShipComplete())) && (this.paymentMethod == null && other.getPaymentMethod() == null || this.paymentMethod != null && this.paymentMethod.equals(other.getPaymentMethod())) && (this.shopperIpAddress == null && other.getShopperIpAddress() == null || this.shopperIpAddress != null && this.shopperIpAddress.equals(other.getShopperIpAddress())) && (this.saveOnAuthDecline == null && other.getSaveOnAuthDecline() == null || this.saveOnAuthDecline != null && this.saveOnAuthDecline.equals(other.getSaveOnAuthDecline())) && (this.canHaveStackable == null && other.getCanHaveStackable() == null || this.canHaveStackable != null && this.canHaveStackable.equals(other.getCanHaveStackable())) && (this.creditCard == null && other.getCreditCard() == null || this.creditCard != null && this.creditCard.equals(other.getCreditCard())) && (this.revenueStatus == null && other.getRevenueStatus() == null || this.revenueStatus != null && this.revenueStatus.equals(other.getRevenueStatus())) && (this.recognizedRevenue == null && other.getRecognizedRevenue() == null || this.recognizedRevenue != null && this.recognizedRevenue.equals(other.getRecognizedRevenue())) && (this.deferredRevenue == null && other.getDeferredRevenue() == null || this.deferredRevenue != null && this.deferredRevenue.equals(other.getDeferredRevenue())) && (this.revRecOnRevCommitment == null && other.getRevRecOnRevCommitment() == null || this.revRecOnRevCommitment != null && this.revRecOnRevCommitment.equals(other.getRevRecOnRevCommitment())) && (this.revCommitStatus == null && other.getRevCommitStatus() == null || this.revCommitStatus != null && this.revCommitStatus.equals(other.getRevCommitStatus())) && (this.ccNumber == null && other.getCcNumber() == null || this.ccNumber != null && this.ccNumber.equals(other.getCcNumber())) && (this.ccExpireDate == null && other.getCcExpireDate() == null || this.ccExpireDate != null && this.ccExpireDate.equals(other.getCcExpireDate())) && (this.ccName == null && other.getCcName() == null || this.ccName != null && this.ccName.equals(other.getCcName())) && (this.ccStreet == null && other.getCcStreet() == null || this.ccStreet != null && this.ccStreet.equals(other.getCcStreet())) && (this.ccZipCode == null && other.getCcZipCode() == null || this.ccZipCode != null && this.ccZipCode.equals(other.getCcZipCode())) && (this.payPalStatus == null && other.getPayPalStatus() == null || this.payPalStatus != null && this.payPalStatus.equals(other.getPayPalStatus())) && (this.creditCardProcessor == null && other.getCreditCardProcessor() == null || this.creditCardProcessor != null && this.creditCardProcessor.equals(other.getCreditCardProcessor())) && (this.payPalTranId == null && other.getPayPalTranId() == null || this.payPalTranId != null && this.payPalTranId.equals(other.getPayPalTranId())) && (this.ccApproved == null && other.getCcApproved() == null || this.ccApproved != null && this.ccApproved.equals(other.getCcApproved())) && (this.getAuth == null && other.getGetAuth() == null || this.getAuth != null && this.getAuth.equals(other.getGetAuth())) && (this.authCode == null && other.getAuthCode() == null || this.authCode != null && this.authCode.equals(other.getAuthCode())) && (this.ccAvsStreetMatch == null && other.getCcAvsStreetMatch() == null || this.ccAvsStreetMatch != null && this.ccAvsStreetMatch.equals(other.getCcAvsStreetMatch())) && (this.ccAvsZipMatch == null && other.getCcAvsZipMatch() == null || this.ccAvsZipMatch != null && this.ccAvsZipMatch.equals(other.getCcAvsZipMatch())) && (this.isRecurringPayment == null && other.getIsRecurringPayment() == null || this.isRecurringPayment != null && this.isRecurringPayment.equals(other.getIsRecurringPayment())) && (this.ccSecurityCodeMatch == null && other.getCcSecurityCodeMatch() == null || this.ccSecurityCodeMatch != null && this.ccSecurityCodeMatch.equals(other.getCcSecurityCodeMatch())) && (this.altSalesTotal == null && other.getAltSalesTotal() == null || this.altSalesTotal != null && this.altSalesTotal.equals(other.getAltSalesTotal())) && (this.ignoreAvs == null && other.getIgnoreAvs() == null || this.ignoreAvs != null && this.ignoreAvs.equals(other.getIgnoreAvs())) && (this.paymentEventResult == null && other.getPaymentEventResult() == null || this.paymentEventResult != null && this.paymentEventResult.equals(other.getPaymentEventResult())) && (this.paymentEventHoldReason == null && other.getPaymentEventHoldReason() == null || this.paymentEventHoldReason != null && this.paymentEventHoldReason.equals(other.getPaymentEventHoldReason())) && (this.paymentEventType == null && other.getPaymentEventType() == null || this.paymentEventType != null && this.paymentEventType.equals(other.getPaymentEventType())) && (this.paymentEventDate == null && other.getPaymentEventDate() == null || this.paymentEventDate != null && this.paymentEventDate.equals(other.getPaymentEventDate())) && (this.paymentEventUpdatedBy == null && other.getPaymentEventUpdatedBy() == null || this.paymentEventUpdatedBy != null && this.paymentEventUpdatedBy.equals(other.getPaymentEventUpdatedBy())) && (this.subTotal == null && other.getSubTotal() == null || this.subTotal != null && this.subTotal.equals(other.getSubTotal())) && (this.discountTotal == null && other.getDiscountTotal() == null || this.discountTotal != null && this.discountTotal.equals(other.getDiscountTotal())) && (this.taxTotal == null && other.getTaxTotal() == null || this.taxTotal != null && this.taxTotal.equals(other.getTaxTotal())) && (this.altShippingCost == null && other.getAltShippingCost() == null || this.altShippingCost != null && this.altShippingCost.equals(other.getAltShippingCost())) && (this.altHandlingCost == null && other.getAltHandlingCost() == null || this.altHandlingCost != null && this.altHandlingCost.equals(other.getAltHandlingCost())) && (this.total == null && other.getTotal() == null || this.total != null && this.total.equals(other.getTotal())) && (this.revRecSchedule == null && other.getRevRecSchedule() == null || this.revRecSchedule != null && this.revRecSchedule.equals(other.getRevRecSchedule())) && (this.revRecStartDate == null && other.getRevRecStartDate() == null || this.revRecStartDate != null && this.revRecStartDate.equals(other.getRevRecStartDate())) && (this.revRecEndDate == null && other.getRevRecEndDate() == null || this.revRecEndDate != null && this.revRecEndDate.equals(other.getRevRecEndDate())) && (this.paypalAuthId == null && other.getPaypalAuthId() == null || this.paypalAuthId != null && this.paypalAuthId.equals(other.getPaypalAuthId())) && (this.balance == null && other.getBalance() == null || this.balance != null && this.balance.equals(other.getBalance())) && (this.paypalProcess == null && other.getPaypalProcess() == null || this.paypalProcess != null && this.paypalProcess.equals(other.getPaypalProcess())) && (this.billingSchedule == null && other.getBillingSchedule() == null || this.billingSchedule != null && this.billingSchedule.equals(other.getBillingSchedule())) && (this.ccSecurityCode == null && other.getCcSecurityCode() == null || this.ccSecurityCode != null && this.ccSecurityCode.equals(other.getCcSecurityCode())) && (this.threeDStatusCode == null && other.getThreeDStatusCode() == null || this.threeDStatusCode != null && this.threeDStatusCode.equals(other.getThreeDStatusCode())) && (this._class == null && other.get_class() == null || this._class != null && this._class.equals(other.get_class())) && (this.department == null && other.getDepartment() == null || this.department != null && this.department.equals(other.getDepartment())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && this.subsidiary.equals(other.getSubsidiary())) && (this.intercoTransaction == null && other.getIntercoTransaction() == null || this.intercoTransaction != null && this.intercoTransaction.equals(other.getIntercoTransaction())) && (this.intercoStatus == null && other.getIntercoStatus() == null || this.intercoStatus != null && this.intercoStatus.equals(other.getIntercoStatus())) && (this.debitCardIssueNo == null && other.getDebitCardIssueNo() == null || this.debitCardIssueNo != null && this.debitCardIssueNo.equals(other.getDebitCardIssueNo())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && this.lastModifiedDate.equals(other.getLastModifiedDate())) && (this.nexus == null && other.getNexus() == null || this.nexus != null && this.nexus.equals(other.getNexus())) && (this.subsidiaryTaxRegNum == null && other.getSubsidiaryTaxRegNum() == null || this.subsidiaryTaxRegNum != null && this.subsidiaryTaxRegNum.equals(other.getSubsidiaryTaxRegNum())) && (this.taxRegOverride == null && other.getTaxRegOverride() == null || this.taxRegOverride != null && this.taxRegOverride.equals(other.getTaxRegOverride())) && (this.taxPointDate == null && other.getTaxPointDate() == null || this.taxPointDate != null && this.taxPointDate.equals(other.getTaxPointDate())) && (this.taxDetailsOverride == null && other.getTaxDetailsOverride() == null || this.taxDetailsOverride != null && this.taxDetailsOverride.equals(other.getTaxDetailsOverride())) && (this.location == null && other.getLocation() == null || this.location != null && this.location.equals(other.getLocation())) && (this.pnRefNum == null && other.getPnRefNum() == null || this.pnRefNum != null && this.pnRefNum.equals(other.getPnRefNum())) && (this.status == null && other.getStatus() == null || this.status != null && this.status.equals(other.getStatus())) && (this.tax2Total == null && other.getTax2Total() == null || this.tax2Total != null && this.tax2Total.equals(other.getTax2Total())) && (this.terms == null && other.getTerms() == null || this.terms != null && this.terms.equals(other.getTerms())) && (this.validFrom == null && other.getValidFrom() == null || this.validFrom != null && this.validFrom.equals(other.getValidFrom())) && (this.vatRegNum == null && other.getVatRegNum() == null || this.vatRegNum != null && this.vatRegNum.equals(other.getVatRegNum())) && (this.giftCertApplied == null && other.getGiftCertApplied() == null || this.giftCertApplied != null && this.giftCertApplied.equals(other.getGiftCertApplied())) && (this.oneTime == null && other.getOneTime() == null || this.oneTime != null && this.oneTime.equals(other.getOneTime())) && (this.recurWeekly == null && other.getRecurWeekly() == null || this.recurWeekly != null && this.recurWeekly.equals(other.getRecurWeekly())) && (this.recurMonthly == null && other.getRecurMonthly() == null || this.recurMonthly != null && this.recurMonthly.equals(other.getRecurMonthly())) && (this.recurQuarterly == null && other.getRecurQuarterly() == null || this.recurQuarterly != null && this.recurQuarterly.equals(other.getRecurQuarterly())) && (this.recurAnnually == null && other.getRecurAnnually() == null || this.recurAnnually != null && this.recurAnnually.equals(other.getRecurAnnually())) && (this.tranIsVsoeBundle == null && other.getTranIsVsoeBundle() == null || this.tranIsVsoeBundle != null && this.tranIsVsoeBundle.equals(other.getTranIsVsoeBundle())) && (this.vsoeAutoCalc == null && other.getVsoeAutoCalc() == null || this.vsoeAutoCalc != null && this.vsoeAutoCalc.equals(other.getVsoeAutoCalc())) && (this.syncPartnerTeams == null && other.getSyncPartnerTeams() == null || this.syncPartnerTeams != null && this.syncPartnerTeams.equals(other.getSyncPartnerTeams())) && (this.salesTeamList == null && other.getSalesTeamList() == null || this.salesTeamList != null && this.salesTeamList.equals(other.getSalesTeamList())) && (this.partnersList == null && other.getPartnersList() == null || this.partnersList != null && this.partnersList.equals(other.getPartnersList())) && (this.giftCertRedemptionList == null && other.getGiftCertRedemptionList() == null || this.giftCertRedemptionList != null && this.giftCertRedemptionList.equals(other.getGiftCertRedemptionList())) && (this.promotionsList == null && other.getPromotionsList() == null || this.promotionsList != null && this.promotionsList.equals(other.getPromotionsList())) && (this.itemList == null && other.getItemList() == null || this.itemList != null && this.itemList.equals(other.getItemList())) && (this.shipGroupList == null && other.getShipGroupList() == null || this.shipGroupList != null && this.shipGroupList.equals(other.getShipGroupList())) && (this.accountingBookDetailList == null && other.getAccountingBookDetailList() == null || this.accountingBookDetailList != null && this.accountingBookDetailList.equals(other.getAccountingBookDetailList())) && (this.taxDetailsList == null && other.getTaxDetailsList() == null || this.taxDetailsList != null && this.taxDetailsList.equals(other.getTaxDetailsList())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
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
        if (this.getCustomForm() != null) {
            _hashCode += this.getCustomForm().hashCode();
        }
        if (this.getEntity() != null) {
            _hashCode += this.getEntity().hashCode();
        }
        if (this.getJob() != null) {
            _hashCode += this.getJob().hashCode();
        }
        if (this.getCurrency() != null) {
            _hashCode += this.getCurrency().hashCode();
        }
        if (this.getDrAccount() != null) {
            _hashCode += this.getDrAccount().hashCode();
        }
        if (this.getFxAccount() != null) {
            _hashCode += this.getFxAccount().hashCode();
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
        if (this.getSource() != null) {
            _hashCode += this.getSource().hashCode();
        }
        if (this.getCreatedFrom() != null) {
            _hashCode += this.getCreatedFrom().hashCode();
        }
        if (this.getOrderStatus() != null) {
            _hashCode += this.getOrderStatus().hashCode();
        }
        if (this.getNextBill() != null) {
            _hashCode += this.getNextBill().hashCode();
        }
        if (this.getOpportunity() != null) {
            _hashCode += this.getOpportunity().hashCode();
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
        if (this.getStartDate() != null) {
            _hashCode += this.getStartDate().hashCode();
        }
        if (this.getEndDate() != null) {
            _hashCode += this.getEndDate().hashCode();
        }
        if (this.getOtherRefNum() != null) {
            _hashCode += this.getOtherRefNum().hashCode();
        }
        if (this.getMemo() != null) {
            _hashCode += this.getMemo().hashCode();
        }
        if (this.getSalesEffectiveDate() != null) {
            _hashCode += this.getSalesEffectiveDate().hashCode();
        }
        if (this.getExcludeCommission() != null) {
            _hashCode += this.getExcludeCommission().hashCode();
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
        if (this.getExchangeRate() != null) {
            _hashCode += this.getExchangeRate().hashCode();
        }
        if (this.getPromoCode() != null) {
            _hashCode += this.getPromoCode().hashCode();
        }
        if (this.getCurrencyName() != null) {
            _hashCode += this.getCurrencyName().hashCode();
        }
        if (this.getDiscountItem() != null) {
            _hashCode += this.getDiscountItem().hashCode();
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
        if (this.getPaymentOption() != null) {
            _hashCode += this.getPaymentOption().hashCode();
        }
        if (this.getInputAuthCode() != null) {
            _hashCode += this.getInputAuthCode().hashCode();
        }
        if (this.getInputReferenceCode() != null) {
            _hashCode += this.getInputReferenceCode().hashCode();
        }
        if (this.getCheckNumber() != null) {
            _hashCode += this.getCheckNumber().hashCode();
        }
        if (this.getPaymentCardCsc() != null) {
            _hashCode += this.getPaymentCardCsc().hashCode();
        }
        if (this.getPaymentProcessingProfile() != null) {
            _hashCode += this.getPaymentProcessingProfile().hashCode();
        }
        if (this.getHandlingMode() != null) {
            _hashCode += this.getHandlingMode().hashCode();
        }
        if (this.getOutputAuthCode() != null) {
            _hashCode += this.getOutputAuthCode().hashCode();
        }
        if (this.getOutputReferenceCode() != null) {
            _hashCode += this.getOutputReferenceCode().hashCode();
        }
        if (this.getPaymentOperation() != null) {
            _hashCode += this.getPaymentOperation().hashCode();
        }
        if (this.getDynamicDescriptor() != null) {
            _hashCode += this.getDynamicDescriptor().hashCode();
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
        if (this.getFob() != null) {
            _hashCode += this.getFob().hashCode();
        }
        if (this.getShipDate() != null) {
            _hashCode += this.getShipDate().hashCode();
        }
        if (this.getActualShipDate() != null) {
            _hashCode += this.getActualShipDate().hashCode();
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
        if (this.getIsMultiShipTo() != null) {
            _hashCode += this.getIsMultiShipTo().hashCode();
        }
        if (this.getShippingTax2Rate() != null) {
            _hashCode += this.getShippingTax2Rate().hashCode();
        }
        if (this.getShippingTaxCode() != null) {
            _hashCode += this.getShippingTaxCode().hashCode();
        }
        if (this.getHandlingTaxCode() != null) {
            _hashCode += this.getHandlingTaxCode().hashCode();
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
        if (this.getTrackingNumbers() != null) {
            _hashCode += this.getTrackingNumbers().hashCode();
        }
        if (this.getLinkedTrackingNumbers() != null) {
            _hashCode += this.getLinkedTrackingNumbers().hashCode();
        }
        if (this.getShipComplete() != null) {
            _hashCode += this.getShipComplete().hashCode();
        }
        if (this.getPaymentMethod() != null) {
            _hashCode += this.getPaymentMethod().hashCode();
        }
        if (this.getShopperIpAddress() != null) {
            _hashCode += this.getShopperIpAddress().hashCode();
        }
        if (this.getSaveOnAuthDecline() != null) {
            _hashCode += this.getSaveOnAuthDecline().hashCode();
        }
        if (this.getCanHaveStackable() != null) {
            _hashCode += this.getCanHaveStackable().hashCode();
        }
        if (this.getCreditCard() != null) {
            _hashCode += this.getCreditCard().hashCode();
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
        if (this.getRevCommitStatus() != null) {
            _hashCode += this.getRevCommitStatus().hashCode();
        }
        if (this.getCcNumber() != null) {
            _hashCode += this.getCcNumber().hashCode();
        }
        if (this.getCcExpireDate() != null) {
            _hashCode += this.getCcExpireDate().hashCode();
        }
        if (this.getCcName() != null) {
            _hashCode += this.getCcName().hashCode();
        }
        if (this.getCcStreet() != null) {
            _hashCode += this.getCcStreet().hashCode();
        }
        if (this.getCcZipCode() != null) {
            _hashCode += this.getCcZipCode().hashCode();
        }
        if (this.getPayPalStatus() != null) {
            _hashCode += this.getPayPalStatus().hashCode();
        }
        if (this.getCreditCardProcessor() != null) {
            _hashCode += this.getCreditCardProcessor().hashCode();
        }
        if (this.getPayPalTranId() != null) {
            _hashCode += this.getPayPalTranId().hashCode();
        }
        if (this.getCcApproved() != null) {
            _hashCode += this.getCcApproved().hashCode();
        }
        if (this.getGetAuth() != null) {
            _hashCode += this.getGetAuth().hashCode();
        }
        if (this.getAuthCode() != null) {
            _hashCode += this.getAuthCode().hashCode();
        }
        if (this.getCcAvsStreetMatch() != null) {
            _hashCode += this.getCcAvsStreetMatch().hashCode();
        }
        if (this.getCcAvsZipMatch() != null) {
            _hashCode += this.getCcAvsZipMatch().hashCode();
        }
        if (this.getIsRecurringPayment() != null) {
            _hashCode += this.getIsRecurringPayment().hashCode();
        }
        if (this.getCcSecurityCodeMatch() != null) {
            _hashCode += this.getCcSecurityCodeMatch().hashCode();
        }
        if (this.getAltSalesTotal() != null) {
            _hashCode += this.getAltSalesTotal().hashCode();
        }
        if (this.getIgnoreAvs() != null) {
            _hashCode += this.getIgnoreAvs().hashCode();
        }
        if (this.getPaymentEventResult() != null) {
            _hashCode += this.getPaymentEventResult().hashCode();
        }
        if (this.getPaymentEventHoldReason() != null) {
            _hashCode += this.getPaymentEventHoldReason().hashCode();
        }
        if (this.getPaymentEventType() != null) {
            _hashCode += this.getPaymentEventType().hashCode();
        }
        if (this.getPaymentEventDate() != null) {
            _hashCode += this.getPaymentEventDate().hashCode();
        }
        if (this.getPaymentEventUpdatedBy() != null) {
            _hashCode += this.getPaymentEventUpdatedBy().hashCode();
        }
        if (this.getSubTotal() != null) {
            _hashCode += this.getSubTotal().hashCode();
        }
        if (this.getDiscountTotal() != null) {
            _hashCode += this.getDiscountTotal().hashCode();
        }
        if (this.getTaxTotal() != null) {
            _hashCode += this.getTaxTotal().hashCode();
        }
        if (this.getAltShippingCost() != null) {
            _hashCode += this.getAltShippingCost().hashCode();
        }
        if (this.getAltHandlingCost() != null) {
            _hashCode += this.getAltHandlingCost().hashCode();
        }
        if (this.getTotal() != null) {
            _hashCode += this.getTotal().hashCode();
        }
        if (this.getRevRecSchedule() != null) {
            _hashCode += this.getRevRecSchedule().hashCode();
        }
        if (this.getRevRecStartDate() != null) {
            _hashCode += this.getRevRecStartDate().hashCode();
        }
        if (this.getRevRecEndDate() != null) {
            _hashCode += this.getRevRecEndDate().hashCode();
        }
        if (this.getPaypalAuthId() != null) {
            _hashCode += this.getPaypalAuthId().hashCode();
        }
        if (this.getBalance() != null) {
            _hashCode += this.getBalance().hashCode();
        }
        if (this.getPaypalProcess() != null) {
            _hashCode += this.getPaypalProcess().hashCode();
        }
        if (this.getBillingSchedule() != null) {
            _hashCode += this.getBillingSchedule().hashCode();
        }
        if (this.getCcSecurityCode() != null) {
            _hashCode += this.getCcSecurityCode().hashCode();
        }
        if (this.getThreeDStatusCode() != null) {
            _hashCode += this.getThreeDStatusCode().hashCode();
        }
        if (this.get_class() != null) {
            _hashCode += this.get_class().hashCode();
        }
        if (this.getDepartment() != null) {
            _hashCode += this.getDepartment().hashCode();
        }
        if (this.getSubsidiary() != null) {
            _hashCode += this.getSubsidiary().hashCode();
        }
        if (this.getIntercoTransaction() != null) {
            _hashCode += this.getIntercoTransaction().hashCode();
        }
        if (this.getIntercoStatus() != null) {
            _hashCode += this.getIntercoStatus().hashCode();
        }
        if (this.getDebitCardIssueNo() != null) {
            _hashCode += this.getDebitCardIssueNo().hashCode();
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
        if (this.getTaxPointDate() != null) {
            _hashCode += this.getTaxPointDate().hashCode();
        }
        if (this.getTaxDetailsOverride() != null) {
            _hashCode += this.getTaxDetailsOverride().hashCode();
        }
        if (this.getLocation() != null) {
            _hashCode += this.getLocation().hashCode();
        }
        if (this.getPnRefNum() != null) {
            _hashCode += this.getPnRefNum().hashCode();
        }
        if (this.getStatus() != null) {
            _hashCode += this.getStatus().hashCode();
        }
        if (this.getTax2Total() != null) {
            _hashCode += this.getTax2Total().hashCode();
        }
        if (this.getTerms() != null) {
            _hashCode += this.getTerms().hashCode();
        }
        if (this.getValidFrom() != null) {
            _hashCode += this.getValidFrom().hashCode();
        }
        if (this.getVatRegNum() != null) {
            _hashCode += this.getVatRegNum().hashCode();
        }
        if (this.getGiftCertApplied() != null) {
            _hashCode += this.getGiftCertApplied().hashCode();
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
        if (this.getPartnersList() != null) {
            _hashCode += this.getPartnersList().hashCode();
        }
        if (this.getGiftCertRedemptionList() != null) {
            _hashCode += this.getGiftCertRedemptionList().hashCode();
        }
        if (this.getPromotionsList() != null) {
            _hashCode += this.getPromotionsList().hashCode();
        }
        if (this.getItemList() != null) {
            _hashCode += this.getItemList().hashCode();
        }
        if (this.getShipGroupList() != null) {
            _hashCode += this.getShipGroupList().hashCode();
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
        typeDesc.setXmlType(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "SalesOrder"));
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
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customForm");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("currency");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("drAccount");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "drAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fxAccount");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "fxAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("source");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "source"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("createdFrom");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "createdFrom"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("orderStatus");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "orderStatus"));
        elemField.setXmlType(new QName("urn:types.sales_2022_1.transactions.webservices.netsuite.com", "SalesOrderOrderStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("nextBill");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "nextBill"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("opportunity");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "opportunity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("startDate");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "endDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("otherRefNum");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "otherRefNum"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("salesEffectiveDate");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "salesEffectiveDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("excludeCommission");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "excludeCommission"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("estGrossProfit");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "estGrossProfit"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("exchangeRate");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "exchangeRate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("promoCode");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "promoCode"));
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
        elemField.setFieldName("discountItem");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "discountItem"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("discountRate");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "discountRate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isTaxable");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "isTaxable"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxItem");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "taxItem"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxRate");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "taxRate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("toBePrinted");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "toBePrinted"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("toBeEmailed");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "toBeEmailed"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "email"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("toBeFaxed");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "toBeFaxed"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fax");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "fax"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("messageSel");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "messageSel"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "message"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("paymentOption");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "paymentOption"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("inputAuthCode");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "inputAuthCode"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("inputReferenceCode");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "inputReferenceCode"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("checkNumber");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "checkNumber"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("paymentCardCsc");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "paymentCardCsc"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("paymentProcessingProfile");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "paymentProcessingProfile"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("handlingMode");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "handlingMode"));
        elemField.setXmlType(new QName("urn:types.sales_2022_1.transactions.webservices.netsuite.com", "SalesOrderHandlingMode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("outputAuthCode");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "outputAuthCode"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("outputReferenceCode");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "outputReferenceCode"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("paymentOperation");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "paymentOperation"));
        elemField.setXmlType(new QName("urn:types.sales_2022_1.transactions.webservices.netsuite.com", "SalesOrderPaymentOperation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("dynamicDescriptor");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "dynamicDescriptor"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("fob");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "fob"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipDate");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "shipDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("actualShipDate");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "actualShipDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipMethod");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "shipMethod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shippingCost");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "shippingCost"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shippingTax1Rate");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "shippingTax1Rate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isMultiShipTo");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "isMultiShipTo"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shippingTax2Rate");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "shippingTax2Rate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shippingTaxCode");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "shippingTaxCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("handlingTaxCode");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "handlingTaxCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("handlingTax1Rate");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "handlingTax1Rate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("handlingTax2Rate");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "handlingTax2Rate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("handlingCost");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "handlingCost"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("trackingNumbers");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "trackingNumbers"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("linkedTrackingNumbers");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "linkedTrackingNumbers"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipComplete");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "shipComplete"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("paymentMethod");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "paymentMethod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shopperIpAddress");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "shopperIpAddress"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("saveOnAuthDecline");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "saveOnAuthDecline"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("canHaveStackable");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "canHaveStackable"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("creditCard");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "creditCard"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revenueStatus");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "revenueStatus"));
        elemField.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "RevenueStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recognizedRevenue");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "recognizedRevenue"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("deferredRevenue");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "deferredRevenue"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revRecOnRevCommitment");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "revRecOnRevCommitment"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revCommitStatus");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "revCommitStatus"));
        elemField.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "RevenueCommitStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ccNumber");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "ccNumber"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ccExpireDate");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "ccExpireDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ccName");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "ccName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ccStreet");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "ccStreet"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ccZipCode");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "ccZipCode"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("payPalStatus");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "payPalStatus"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("creditCardProcessor");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "creditCardProcessor"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("payPalTranId");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "payPalTranId"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ccApproved");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "ccApproved"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("getAuth");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "getAuth"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("authCode");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "authCode"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ccAvsStreetMatch");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "ccAvsStreetMatch"));
        elemField.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "AvsMatchCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ccAvsZipMatch");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "ccAvsZipMatch"));
        elemField.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "AvsMatchCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isRecurringPayment");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "isRecurringPayment"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ccSecurityCodeMatch");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "ccSecurityCodeMatch"));
        elemField.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "AvsMatchCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("altSalesTotal");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "altSalesTotal"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ignoreAvs");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "ignoreAvs"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("paymentEventResult");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "paymentEventResult"));
        elemField.setXmlType(new QName("urn:types.sales_2022_1.transactions.webservices.netsuite.com", "TransactionPaymentEventResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("paymentEventHoldReason");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "paymentEventHoldReason"));
        elemField.setXmlType(new QName("urn:types.sales_2022_1.transactions.webservices.netsuite.com", "TransactionPaymentEventHoldReason"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("paymentEventType");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "paymentEventType"));
        elemField.setXmlType(new QName("urn:types.sales_2022_1.transactions.webservices.netsuite.com", "TransactionPaymentEventType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("paymentEventDate");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "paymentEventDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("paymentEventUpdatedBy");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "paymentEventUpdatedBy"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subTotal");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "subTotal"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("discountTotal");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "discountTotal"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("altShippingCost");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "altShippingCost"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("altHandlingCost");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "altHandlingCost"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("total");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "total"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revRecSchedule");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "revRecSchedule"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revRecStartDate");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "revRecStartDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revRecEndDate");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "revRecEndDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("paypalAuthId");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "paypalAuthId"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "balance"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("paypalProcess");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "paypalProcess"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billingSchedule");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "billingSchedule"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ccSecurityCode");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "ccSecurityCode"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("threeDStatusCode");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "threeDStatusCode"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("department");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "department"));
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
        elemField.setFieldName("intercoTransaction");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "intercoTransaction"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("intercoStatus");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "intercoStatus"));
        elemField.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "IntercoStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("debitCardIssueNo");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "debitCardIssueNo"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("taxPointDate");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "taxPointDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("location");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "location"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("pnRefNum");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "pnRefNum"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("tax2Total");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "tax2Total"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("terms");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "terms"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("validFrom");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "validFrom"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("giftCertApplied");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "giftCertApplied"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("tranIsVsoeBundle");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "tranIsVsoeBundle"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vsoeAutoCalc");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "vsoeAutoCalc"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setXmlType(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "SalesOrderSalesTeamList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("partnersList");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "partnersList"));
        elemField.setXmlType(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "SalesOrderPartnersList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("giftCertRedemptionList");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "giftCertRedemptionList"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "GiftCertRedemptionList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("promotionsList");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "promotionsList"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "PromotionsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemList");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "itemList"));
        elemField.setXmlType(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "SalesOrderItemList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipGroupList");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "shipGroupList"));
        elemField.setXmlType(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "SalesOrderShipGroupList"));
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

