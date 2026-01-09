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
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.types.RevenueStatus;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.CustomFieldList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.NullField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.Record;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.sales.CashSaleExpCostList;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.sales.CashSaleItemCostList;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.sales.CashSaleItemList;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.sales.CashSalePartnersList;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.sales.CashSaleSalesTeamList;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.sales.CashSaleShipGroupList;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.sales.CashSaleTimeList;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.sales.types.CashSaleHandlingMode;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.sales.types.CashSalePaymentOperation;
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

public class CashSale
extends Record
implements Serializable {
    private Calendar createdDate;
    private Calendar lastModifiedDate;
    private RecordRef nexus;
    private RecordRef subsidiaryTaxRegNum;
    private Boolean taxRegOverride;
    private Boolean taxDetailsOverride;
    private RecordRef customForm;
    private RecordRef entity;
    private RecordRef billingAccount;
    private Boolean recurringBill;
    private Calendar tranDate;
    private String tranId;
    private RecordRef entityTaxRegNum;
    private Calendar taxPointDate;
    private String source;
    private RecordRef postingPeriod;
    private RecordRef createdFrom;
    private RecordRef opportunity;
    private RecordRef department;
    private RecordRef _class;
    private RecordRef location;
    private RecordRef subsidiary;
    private RecordRef salesRep;
    private String contribPct;
    private RecordRef partner;
    private RecordRef leadSource;
    private Calendar startDate;
    private Calendar endDate;
    private String otherRefNum;
    private String memo;
    private Calendar salesEffectiveDate;
    private Boolean excludeCommission;
    private RecordRef revRecSchedule;
    private Boolean undepFunds;
    private Boolean canHaveStackable;
    private RecordRef currency;
    private RecordRef account;
    private Calendar revRecStartDate;
    private Calendar revRecEndDate;
    private Double totalCostEstimate;
    private Double estGrossProfit;
    private Double estGrossProfitPercent;
    private Double exchangeRate;
    private String currencyName;
    private RecordRef promoCode;
    private RecordRef discountItem;
    private String discountRate;
    private Boolean isTaxable;
    private RecordRef taxItem;
    private Double taxRate;
    private Boolean toBePrinted;
    private Boolean toBeEmailed;
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
    private CashSaleHandlingMode handlingMode;
    private String outputAuthCode;
    private String outputReferenceCode;
    private CashSalePaymentOperation paymentOperation;
    private String dynamicDescriptor;
    private Address billingAddress;
    private RecordRef billAddressList;
    private Address shippingAddress;
    private Boolean shipIsResidential;
    private RecordRef shipAddressList;
    private String fob;
    private Calendar shipDate;
    private RecordRef shipMethod;
    private Double shippingCost;
    private Double shippingTax1Rate;
    private String shippingTax2Rate;
    private RecordRef shippingTaxCode;
    private RecordRef handlingTaxCode;
    private Double handlingTax1Rate;
    private Double handlingCost;
    private String handlingTax2Rate;
    private String linkedTrackingNumbers;
    private String trackingNumbers;
    private RecordRef salesGroup;
    private RevenueStatus revenueStatus;
    private Double recognizedRevenue;
    private Double deferredRevenue;
    private Boolean revRecOnRevCommitment;
    private Boolean syncSalesTeams;
    private RecordRef paymentMethod;
    private String payPalStatus;
    private RecordRef creditCard;
    private String ccNumber;
    private Calendar ccExpireDate;
    private String ccName;
    private String ccStreet;
    private String ccZipCode;
    private RecordRef creditCardProcessor;
    private Boolean ccApproved;
    private String authCode;
    private AvsMatchCode ccAvsStreetMatch;
    private AvsMatchCode ccAvsZipMatch;
    private Boolean isRecurringPayment;
    private String payPalTranId;
    private Double subTotal;
    private Boolean ccIsPurchaseCardBin;
    private Boolean ignoreAvs;
    private Boolean ccProcessAsPurchaseCard;
    private RecordRef itemCostDiscount;
    private String itemCostDiscRate;
    private Double itemCostDiscAmount;
    private Double itemCostTaxRate1;
    private Double itemCostTaxRate2;
    private Boolean itemCostDiscTaxable;
    private RecordRef itemCostTaxCode;
    private Double itemCostDiscTax1Amt;
    private Boolean itemCostDiscPrint;
    private RecordRef expCostDiscount;
    private String expCostDiscRate;
    private Double expCostDiscAmount;
    private Boolean expCostDiscTaxable;
    private Boolean expCostDiscprint;
    private Double expCostTaxRate1;
    private RecordRef timeDiscount;
    private RecordRef expCostTaxCode;
    private String timeDiscRate;
    private Double expCostTaxRate2;
    private Double expCostDiscTax1Amt;
    private Double timeDiscAmount;
    private Boolean timeDiscTaxable;
    private Boolean timeDiscPrint;
    private Double discountTotal;
    private Double taxTotal;
    private Double timeTaxRate1;
    private Double altShippingCost;
    private RecordRef timeTaxCode;
    private Double altHandlingCost;
    private Double total;
    private Double timeDiscTax1Amt;
    private String ccSecurityCode;
    private Double timeTaxRate2;
    private AvsMatchCode ccSecurityCodeMatch;
    private Boolean chargeIt;
    private String debitCardIssueNo;
    private String threeDStatusCode;
    private String pnRefNum;
    private String paypalAuthId;
    private String status;
    private Boolean paypalProcess;
    private RecordRef job;
    private RecordRef billingSchedule;
    private String email;
    private Double tax2Total;
    private Calendar validFrom;
    private String vatRegNum;
    private Double giftCertApplied;
    private Boolean tranIsVsoeBundle;
    private Boolean vsoeAutoCalc;
    private Boolean syncPartnerTeams;
    private CashSaleSalesTeamList salesTeamList;
    private CashSalePartnersList partnersList;
    private CashSaleItemList itemList;
    private AccountingBookDetailList accountingBookDetailList;
    private CashSaleItemCostList itemCostList;
    private GiftCertRedemptionList giftCertRedemptionList;
    private PromotionsList promotionsList;
    private CashSaleExpCostList expCostList;
    private CashSaleTimeList timeList;
    private CashSaleShipGroupList shipGroupList;
    private TaxDetailsList taxDetailsList;
    private CustomFieldList customFieldList;
    private String internalId;
    private String externalId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(CashSale.class, true);

    public CashSale() {
    }

    public CashSale(NullField nullFieldList, String internalId, String externalId, Calendar createdDate, Calendar lastModifiedDate, RecordRef nexus, RecordRef subsidiaryTaxRegNum, Boolean taxRegOverride, Boolean taxDetailsOverride, RecordRef customForm, RecordRef entity, RecordRef billingAccount, Boolean recurringBill, Calendar tranDate, String tranId, RecordRef entityTaxRegNum, Calendar taxPointDate, String source, RecordRef postingPeriod, RecordRef createdFrom, RecordRef opportunity, RecordRef department, RecordRef _class, RecordRef location, RecordRef subsidiary, RecordRef salesRep, String contribPct, RecordRef partner, RecordRef leadSource, Calendar startDate, Calendar endDate, String otherRefNum, String memo, Calendar salesEffectiveDate, Boolean excludeCommission, RecordRef revRecSchedule, Boolean undepFunds, Boolean canHaveStackable, RecordRef currency, RecordRef account, Calendar revRecStartDate, Calendar revRecEndDate, Double totalCostEstimate, Double estGrossProfit, Double estGrossProfitPercent, Double exchangeRate, String currencyName, RecordRef promoCode, RecordRef discountItem, String discountRate, Boolean isTaxable, RecordRef taxItem, Double taxRate, Boolean toBePrinted, Boolean toBeEmailed, Boolean toBeFaxed, String fax, RecordRef messageSel, String message, RecordRef paymentOption, String inputAuthCode, String inputReferenceCode, String checkNumber, String paymentCardCsc, RecordRef paymentProcessingProfile, CashSaleHandlingMode handlingMode, String outputAuthCode, String outputReferenceCode, CashSalePaymentOperation paymentOperation, String dynamicDescriptor, Address billingAddress, RecordRef billAddressList, Address shippingAddress, Boolean shipIsResidential, RecordRef shipAddressList, String fob, Calendar shipDate, RecordRef shipMethod, Double shippingCost, Double shippingTax1Rate, String shippingTax2Rate, RecordRef shippingTaxCode, RecordRef handlingTaxCode, Double handlingTax1Rate, Double handlingCost, String handlingTax2Rate, String linkedTrackingNumbers, String trackingNumbers, RecordRef salesGroup, RevenueStatus revenueStatus, Double recognizedRevenue, Double deferredRevenue, Boolean revRecOnRevCommitment, Boolean syncSalesTeams, RecordRef paymentMethod, String payPalStatus, RecordRef creditCard, String ccNumber, Calendar ccExpireDate, String ccName, String ccStreet, String ccZipCode, RecordRef creditCardProcessor, Boolean ccApproved, String authCode, AvsMatchCode ccAvsStreetMatch, AvsMatchCode ccAvsZipMatch, Boolean isRecurringPayment, String payPalTranId, Double subTotal, Boolean ccIsPurchaseCardBin, Boolean ignoreAvs, Boolean ccProcessAsPurchaseCard, RecordRef itemCostDiscount, String itemCostDiscRate, Double itemCostDiscAmount, Double itemCostTaxRate1, Double itemCostTaxRate2, Boolean itemCostDiscTaxable, RecordRef itemCostTaxCode, Double itemCostDiscTax1Amt, Boolean itemCostDiscPrint, RecordRef expCostDiscount, String expCostDiscRate, Double expCostDiscAmount, Boolean expCostDiscTaxable, Boolean expCostDiscprint, Double expCostTaxRate1, RecordRef timeDiscount, RecordRef expCostTaxCode, String timeDiscRate, Double expCostTaxRate2, Double expCostDiscTax1Amt, Double timeDiscAmount, Boolean timeDiscTaxable, Boolean timeDiscPrint, Double discountTotal, Double taxTotal, Double timeTaxRate1, Double altShippingCost, RecordRef timeTaxCode, Double altHandlingCost, Double total, Double timeDiscTax1Amt, String ccSecurityCode, Double timeTaxRate2, AvsMatchCode ccSecurityCodeMatch, Boolean chargeIt, String debitCardIssueNo, String threeDStatusCode, String pnRefNum, String paypalAuthId, String status, Boolean paypalProcess, RecordRef job, RecordRef billingSchedule, String email, Double tax2Total, Calendar validFrom, String vatRegNum, Double giftCertApplied, Boolean tranIsVsoeBundle, Boolean vsoeAutoCalc, Boolean syncPartnerTeams, CashSaleSalesTeamList salesTeamList, CashSalePartnersList partnersList, CashSaleItemList itemList, AccountingBookDetailList accountingBookDetailList, CashSaleItemCostList itemCostList, GiftCertRedemptionList giftCertRedemptionList, PromotionsList promotionsList, CashSaleExpCostList expCostList, CashSaleTimeList timeList, CashSaleShipGroupList shipGroupList, TaxDetailsList taxDetailsList, CustomFieldList customFieldList) {
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
        this.entity = entity;
        this.billingAccount = billingAccount;
        this.recurringBill = recurringBill;
        this.tranDate = tranDate;
        this.tranId = tranId;
        this.entityTaxRegNum = entityTaxRegNum;
        this.taxPointDate = taxPointDate;
        this.source = source;
        this.postingPeriod = postingPeriod;
        this.createdFrom = createdFrom;
        this.opportunity = opportunity;
        this.department = department;
        this._class = _class;
        this.location = location;
        this.subsidiary = subsidiary;
        this.salesRep = salesRep;
        this.contribPct = contribPct;
        this.partner = partner;
        this.leadSource = leadSource;
        this.startDate = startDate;
        this.endDate = endDate;
        this.otherRefNum = otherRefNum;
        this.memo = memo;
        this.salesEffectiveDate = salesEffectiveDate;
        this.excludeCommission = excludeCommission;
        this.revRecSchedule = revRecSchedule;
        this.undepFunds = undepFunds;
        this.canHaveStackable = canHaveStackable;
        this.currency = currency;
        this.account = account;
        this.revRecStartDate = revRecStartDate;
        this.revRecEndDate = revRecEndDate;
        this.totalCostEstimate = totalCostEstimate;
        this.estGrossProfit = estGrossProfit;
        this.estGrossProfitPercent = estGrossProfitPercent;
        this.exchangeRate = exchangeRate;
        this.currencyName = currencyName;
        this.promoCode = promoCode;
        this.discountItem = discountItem;
        this.discountRate = discountRate;
        this.isTaxable = isTaxable;
        this.taxItem = taxItem;
        this.taxRate = taxRate;
        this.toBePrinted = toBePrinted;
        this.toBeEmailed = toBeEmailed;
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
        this.shipMethod = shipMethod;
        this.shippingCost = shippingCost;
        this.shippingTax1Rate = shippingTax1Rate;
        this.shippingTax2Rate = shippingTax2Rate;
        this.shippingTaxCode = shippingTaxCode;
        this.handlingTaxCode = handlingTaxCode;
        this.handlingTax1Rate = handlingTax1Rate;
        this.handlingCost = handlingCost;
        this.handlingTax2Rate = handlingTax2Rate;
        this.linkedTrackingNumbers = linkedTrackingNumbers;
        this.trackingNumbers = trackingNumbers;
        this.salesGroup = salesGroup;
        this.revenueStatus = revenueStatus;
        this.recognizedRevenue = recognizedRevenue;
        this.deferredRevenue = deferredRevenue;
        this.revRecOnRevCommitment = revRecOnRevCommitment;
        this.syncSalesTeams = syncSalesTeams;
        this.paymentMethod = paymentMethod;
        this.payPalStatus = payPalStatus;
        this.creditCard = creditCard;
        this.ccNumber = ccNumber;
        this.ccExpireDate = ccExpireDate;
        this.ccName = ccName;
        this.ccStreet = ccStreet;
        this.ccZipCode = ccZipCode;
        this.creditCardProcessor = creditCardProcessor;
        this.ccApproved = ccApproved;
        this.authCode = authCode;
        this.ccAvsStreetMatch = ccAvsStreetMatch;
        this.ccAvsZipMatch = ccAvsZipMatch;
        this.isRecurringPayment = isRecurringPayment;
        this.payPalTranId = payPalTranId;
        this.subTotal = subTotal;
        this.ccIsPurchaseCardBin = ccIsPurchaseCardBin;
        this.ignoreAvs = ignoreAvs;
        this.ccProcessAsPurchaseCard = ccProcessAsPurchaseCard;
        this.itemCostDiscount = itemCostDiscount;
        this.itemCostDiscRate = itemCostDiscRate;
        this.itemCostDiscAmount = itemCostDiscAmount;
        this.itemCostTaxRate1 = itemCostTaxRate1;
        this.itemCostTaxRate2 = itemCostTaxRate2;
        this.itemCostDiscTaxable = itemCostDiscTaxable;
        this.itemCostTaxCode = itemCostTaxCode;
        this.itemCostDiscTax1Amt = itemCostDiscTax1Amt;
        this.itemCostDiscPrint = itemCostDiscPrint;
        this.expCostDiscount = expCostDiscount;
        this.expCostDiscRate = expCostDiscRate;
        this.expCostDiscAmount = expCostDiscAmount;
        this.expCostDiscTaxable = expCostDiscTaxable;
        this.expCostDiscprint = expCostDiscprint;
        this.expCostTaxRate1 = expCostTaxRate1;
        this.timeDiscount = timeDiscount;
        this.expCostTaxCode = expCostTaxCode;
        this.timeDiscRate = timeDiscRate;
        this.expCostTaxRate2 = expCostTaxRate2;
        this.expCostDiscTax1Amt = expCostDiscTax1Amt;
        this.timeDiscAmount = timeDiscAmount;
        this.timeDiscTaxable = timeDiscTaxable;
        this.timeDiscPrint = timeDiscPrint;
        this.discountTotal = discountTotal;
        this.taxTotal = taxTotal;
        this.timeTaxRate1 = timeTaxRate1;
        this.altShippingCost = altShippingCost;
        this.timeTaxCode = timeTaxCode;
        this.altHandlingCost = altHandlingCost;
        this.total = total;
        this.timeDiscTax1Amt = timeDiscTax1Amt;
        this.ccSecurityCode = ccSecurityCode;
        this.timeTaxRate2 = timeTaxRate2;
        this.ccSecurityCodeMatch = ccSecurityCodeMatch;
        this.chargeIt = chargeIt;
        this.debitCardIssueNo = debitCardIssueNo;
        this.threeDStatusCode = threeDStatusCode;
        this.pnRefNum = pnRefNum;
        this.paypalAuthId = paypalAuthId;
        this.status = status;
        this.paypalProcess = paypalProcess;
        this.job = job;
        this.billingSchedule = billingSchedule;
        this.email = email;
        this.tax2Total = tax2Total;
        this.validFrom = validFrom;
        this.vatRegNum = vatRegNum;
        this.giftCertApplied = giftCertApplied;
        this.tranIsVsoeBundle = tranIsVsoeBundle;
        this.vsoeAutoCalc = vsoeAutoCalc;
        this.syncPartnerTeams = syncPartnerTeams;
        this.salesTeamList = salesTeamList;
        this.partnersList = partnersList;
        this.itemList = itemList;
        this.accountingBookDetailList = accountingBookDetailList;
        this.itemCostList = itemCostList;
        this.giftCertRedemptionList = giftCertRedemptionList;
        this.promotionsList = promotionsList;
        this.expCostList = expCostList;
        this.timeList = timeList;
        this.shipGroupList = shipGroupList;
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

    public RecordRef getEntity() {
        return this.entity;
    }

    public void setEntity(RecordRef entity) {
        this.entity = entity;
    }

    public RecordRef getBillingAccount() {
        return this.billingAccount;
    }

    public void setBillingAccount(RecordRef billingAccount) {
        this.billingAccount = billingAccount;
    }

    public Boolean getRecurringBill() {
        return this.recurringBill;
    }

    public void setRecurringBill(Boolean recurringBill) {
        this.recurringBill = recurringBill;
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

    public String getSource() {
        return this.source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public RecordRef getPostingPeriod() {
        return this.postingPeriod;
    }

    public void setPostingPeriod(RecordRef postingPeriod) {
        this.postingPeriod = postingPeriod;
    }

    public RecordRef getCreatedFrom() {
        return this.createdFrom;
    }

    public void setCreatedFrom(RecordRef createdFrom) {
        this.createdFrom = createdFrom;
    }

    public RecordRef getOpportunity() {
        return this.opportunity;
    }

    public void setOpportunity(RecordRef opportunity) {
        this.opportunity = opportunity;
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

    public RecordRef getRevRecSchedule() {
        return this.revRecSchedule;
    }

    public void setRevRecSchedule(RecordRef revRecSchedule) {
        this.revRecSchedule = revRecSchedule;
    }

    public Boolean getUndepFunds() {
        return this.undepFunds;
    }

    public void setUndepFunds(Boolean undepFunds) {
        this.undepFunds = undepFunds;
    }

    public Boolean getCanHaveStackable() {
        return this.canHaveStackable;
    }

    public void setCanHaveStackable(Boolean canHaveStackable) {
        this.canHaveStackable = canHaveStackable;
    }

    public RecordRef getCurrency() {
        return this.currency;
    }

    public void setCurrency(RecordRef currency) {
        this.currency = currency;
    }

    public RecordRef getAccount() {
        return this.account;
    }

    public void setAccount(RecordRef account) {
        this.account = account;
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

    public CashSaleHandlingMode getHandlingMode() {
        return this.handlingMode;
    }

    public void setHandlingMode(CashSaleHandlingMode handlingMode) {
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

    public CashSalePaymentOperation getPaymentOperation() {
        return this.paymentOperation;
    }

    public void setPaymentOperation(CashSalePaymentOperation paymentOperation) {
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

    public Double getHandlingCost() {
        return this.handlingCost;
    }

    public void setHandlingCost(Double handlingCost) {
        this.handlingCost = handlingCost;
    }

    public String getHandlingTax2Rate() {
        return this.handlingTax2Rate;
    }

    public void setHandlingTax2Rate(String handlingTax2Rate) {
        this.handlingTax2Rate = handlingTax2Rate;
    }

    public String getLinkedTrackingNumbers() {
        return this.linkedTrackingNumbers;
    }

    public void setLinkedTrackingNumbers(String linkedTrackingNumbers) {
        this.linkedTrackingNumbers = linkedTrackingNumbers;
    }

    public String getTrackingNumbers() {
        return this.trackingNumbers;
    }

    public void setTrackingNumbers(String trackingNumbers) {
        this.trackingNumbers = trackingNumbers;
    }

    public RecordRef getSalesGroup() {
        return this.salesGroup;
    }

    public void setSalesGroup(RecordRef salesGroup) {
        this.salesGroup = salesGroup;
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

    public Boolean getSyncSalesTeams() {
        return this.syncSalesTeams;
    }

    public void setSyncSalesTeams(Boolean syncSalesTeams) {
        this.syncSalesTeams = syncSalesTeams;
    }

    public RecordRef getPaymentMethod() {
        return this.paymentMethod;
    }

    public void setPaymentMethod(RecordRef paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getPayPalStatus() {
        return this.payPalStatus;
    }

    public void setPayPalStatus(String payPalStatus) {
        this.payPalStatus = payPalStatus;
    }

    public RecordRef getCreditCard() {
        return this.creditCard;
    }

    public void setCreditCard(RecordRef creditCard) {
        this.creditCard = creditCard;
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

    public RecordRef getCreditCardProcessor() {
        return this.creditCardProcessor;
    }

    public void setCreditCardProcessor(RecordRef creditCardProcessor) {
        this.creditCardProcessor = creditCardProcessor;
    }

    public Boolean getCcApproved() {
        return this.ccApproved;
    }

    public void setCcApproved(Boolean ccApproved) {
        this.ccApproved = ccApproved;
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

    public String getPayPalTranId() {
        return this.payPalTranId;
    }

    public void setPayPalTranId(String payPalTranId) {
        this.payPalTranId = payPalTranId;
    }

    public Double getSubTotal() {
        return this.subTotal;
    }

    public void setSubTotal(Double subTotal) {
        this.subTotal = subTotal;
    }

    public Boolean getCcIsPurchaseCardBin() {
        return this.ccIsPurchaseCardBin;
    }

    public void setCcIsPurchaseCardBin(Boolean ccIsPurchaseCardBin) {
        this.ccIsPurchaseCardBin = ccIsPurchaseCardBin;
    }

    public Boolean getIgnoreAvs() {
        return this.ignoreAvs;
    }

    public void setIgnoreAvs(Boolean ignoreAvs) {
        this.ignoreAvs = ignoreAvs;
    }

    public Boolean getCcProcessAsPurchaseCard() {
        return this.ccProcessAsPurchaseCard;
    }

    public void setCcProcessAsPurchaseCard(Boolean ccProcessAsPurchaseCard) {
        this.ccProcessAsPurchaseCard = ccProcessAsPurchaseCard;
    }

    public RecordRef getItemCostDiscount() {
        return this.itemCostDiscount;
    }

    public void setItemCostDiscount(RecordRef itemCostDiscount) {
        this.itemCostDiscount = itemCostDiscount;
    }

    public String getItemCostDiscRate() {
        return this.itemCostDiscRate;
    }

    public void setItemCostDiscRate(String itemCostDiscRate) {
        this.itemCostDiscRate = itemCostDiscRate;
    }

    public Double getItemCostDiscAmount() {
        return this.itemCostDiscAmount;
    }

    public void setItemCostDiscAmount(Double itemCostDiscAmount) {
        this.itemCostDiscAmount = itemCostDiscAmount;
    }

    public Double getItemCostTaxRate1() {
        return this.itemCostTaxRate1;
    }

    public void setItemCostTaxRate1(Double itemCostTaxRate1) {
        this.itemCostTaxRate1 = itemCostTaxRate1;
    }

    public Double getItemCostTaxRate2() {
        return this.itemCostTaxRate2;
    }

    public void setItemCostTaxRate2(Double itemCostTaxRate2) {
        this.itemCostTaxRate2 = itemCostTaxRate2;
    }

    public Boolean getItemCostDiscTaxable() {
        return this.itemCostDiscTaxable;
    }

    public void setItemCostDiscTaxable(Boolean itemCostDiscTaxable) {
        this.itemCostDiscTaxable = itemCostDiscTaxable;
    }

    public RecordRef getItemCostTaxCode() {
        return this.itemCostTaxCode;
    }

    public void setItemCostTaxCode(RecordRef itemCostTaxCode) {
        this.itemCostTaxCode = itemCostTaxCode;
    }

    public Double getItemCostDiscTax1Amt() {
        return this.itemCostDiscTax1Amt;
    }

    public void setItemCostDiscTax1Amt(Double itemCostDiscTax1Amt) {
        this.itemCostDiscTax1Amt = itemCostDiscTax1Amt;
    }

    public Boolean getItemCostDiscPrint() {
        return this.itemCostDiscPrint;
    }

    public void setItemCostDiscPrint(Boolean itemCostDiscPrint) {
        this.itemCostDiscPrint = itemCostDiscPrint;
    }

    public RecordRef getExpCostDiscount() {
        return this.expCostDiscount;
    }

    public void setExpCostDiscount(RecordRef expCostDiscount) {
        this.expCostDiscount = expCostDiscount;
    }

    public String getExpCostDiscRate() {
        return this.expCostDiscRate;
    }

    public void setExpCostDiscRate(String expCostDiscRate) {
        this.expCostDiscRate = expCostDiscRate;
    }

    public Double getExpCostDiscAmount() {
        return this.expCostDiscAmount;
    }

    public void setExpCostDiscAmount(Double expCostDiscAmount) {
        this.expCostDiscAmount = expCostDiscAmount;
    }

    public Boolean getExpCostDiscTaxable() {
        return this.expCostDiscTaxable;
    }

    public void setExpCostDiscTaxable(Boolean expCostDiscTaxable) {
        this.expCostDiscTaxable = expCostDiscTaxable;
    }

    public Boolean getExpCostDiscprint() {
        return this.expCostDiscprint;
    }

    public void setExpCostDiscprint(Boolean expCostDiscprint) {
        this.expCostDiscprint = expCostDiscprint;
    }

    public Double getExpCostTaxRate1() {
        return this.expCostTaxRate1;
    }

    public void setExpCostTaxRate1(Double expCostTaxRate1) {
        this.expCostTaxRate1 = expCostTaxRate1;
    }

    public RecordRef getTimeDiscount() {
        return this.timeDiscount;
    }

    public void setTimeDiscount(RecordRef timeDiscount) {
        this.timeDiscount = timeDiscount;
    }

    public RecordRef getExpCostTaxCode() {
        return this.expCostTaxCode;
    }

    public void setExpCostTaxCode(RecordRef expCostTaxCode) {
        this.expCostTaxCode = expCostTaxCode;
    }

    public String getTimeDiscRate() {
        return this.timeDiscRate;
    }

    public void setTimeDiscRate(String timeDiscRate) {
        this.timeDiscRate = timeDiscRate;
    }

    public Double getExpCostTaxRate2() {
        return this.expCostTaxRate2;
    }

    public void setExpCostTaxRate2(Double expCostTaxRate2) {
        this.expCostTaxRate2 = expCostTaxRate2;
    }

    public Double getExpCostDiscTax1Amt() {
        return this.expCostDiscTax1Amt;
    }

    public void setExpCostDiscTax1Amt(Double expCostDiscTax1Amt) {
        this.expCostDiscTax1Amt = expCostDiscTax1Amt;
    }

    public Double getTimeDiscAmount() {
        return this.timeDiscAmount;
    }

    public void setTimeDiscAmount(Double timeDiscAmount) {
        this.timeDiscAmount = timeDiscAmount;
    }

    public Boolean getTimeDiscTaxable() {
        return this.timeDiscTaxable;
    }

    public void setTimeDiscTaxable(Boolean timeDiscTaxable) {
        this.timeDiscTaxable = timeDiscTaxable;
    }

    public Boolean getTimeDiscPrint() {
        return this.timeDiscPrint;
    }

    public void setTimeDiscPrint(Boolean timeDiscPrint) {
        this.timeDiscPrint = timeDiscPrint;
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

    public Double getTimeTaxRate1() {
        return this.timeTaxRate1;
    }

    public void setTimeTaxRate1(Double timeTaxRate1) {
        this.timeTaxRate1 = timeTaxRate1;
    }

    public Double getAltShippingCost() {
        return this.altShippingCost;
    }

    public void setAltShippingCost(Double altShippingCost) {
        this.altShippingCost = altShippingCost;
    }

    public RecordRef getTimeTaxCode() {
        return this.timeTaxCode;
    }

    public void setTimeTaxCode(RecordRef timeTaxCode) {
        this.timeTaxCode = timeTaxCode;
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

    public Double getTimeDiscTax1Amt() {
        return this.timeDiscTax1Amt;
    }

    public void setTimeDiscTax1Amt(Double timeDiscTax1Amt) {
        this.timeDiscTax1Amt = timeDiscTax1Amt;
    }

    public String getCcSecurityCode() {
        return this.ccSecurityCode;
    }

    public void setCcSecurityCode(String ccSecurityCode) {
        this.ccSecurityCode = ccSecurityCode;
    }

    public Double getTimeTaxRate2() {
        return this.timeTaxRate2;
    }

    public void setTimeTaxRate2(Double timeTaxRate2) {
        this.timeTaxRate2 = timeTaxRate2;
    }

    public AvsMatchCode getCcSecurityCodeMatch() {
        return this.ccSecurityCodeMatch;
    }

    public void setCcSecurityCodeMatch(AvsMatchCode ccSecurityCodeMatch) {
        this.ccSecurityCodeMatch = ccSecurityCodeMatch;
    }

    public Boolean getChargeIt() {
        return this.chargeIt;
    }

    public void setChargeIt(Boolean chargeIt) {
        this.chargeIt = chargeIt;
    }

    public String getDebitCardIssueNo() {
        return this.debitCardIssueNo;
    }

    public void setDebitCardIssueNo(String debitCardIssueNo) {
        this.debitCardIssueNo = debitCardIssueNo;
    }

    public String getThreeDStatusCode() {
        return this.threeDStatusCode;
    }

    public void setThreeDStatusCode(String threeDStatusCode) {
        this.threeDStatusCode = threeDStatusCode;
    }

    public String getPnRefNum() {
        return this.pnRefNum;
    }

    public void setPnRefNum(String pnRefNum) {
        this.pnRefNum = pnRefNum;
    }

    public String getPaypalAuthId() {
        return this.paypalAuthId;
    }

    public void setPaypalAuthId(String paypalAuthId) {
        this.paypalAuthId = paypalAuthId;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getPaypalProcess() {
        return this.paypalProcess;
    }

    public void setPaypalProcess(Boolean paypalProcess) {
        this.paypalProcess = paypalProcess;
    }

    public RecordRef getJob() {
        return this.job;
    }

    public void setJob(RecordRef job) {
        this.job = job;
    }

    public RecordRef getBillingSchedule() {
        return this.billingSchedule;
    }

    public void setBillingSchedule(RecordRef billingSchedule) {
        this.billingSchedule = billingSchedule;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getTax2Total() {
        return this.tax2Total;
    }

    public void setTax2Total(Double tax2Total) {
        this.tax2Total = tax2Total;
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

    public CashSaleSalesTeamList getSalesTeamList() {
        return this.salesTeamList;
    }

    public void setSalesTeamList(CashSaleSalesTeamList salesTeamList) {
        this.salesTeamList = salesTeamList;
    }

    public CashSalePartnersList getPartnersList() {
        return this.partnersList;
    }

    public void setPartnersList(CashSalePartnersList partnersList) {
        this.partnersList = partnersList;
    }

    public CashSaleItemList getItemList() {
        return this.itemList;
    }

    public void setItemList(CashSaleItemList itemList) {
        this.itemList = itemList;
    }

    public AccountingBookDetailList getAccountingBookDetailList() {
        return this.accountingBookDetailList;
    }

    public void setAccountingBookDetailList(AccountingBookDetailList accountingBookDetailList) {
        this.accountingBookDetailList = accountingBookDetailList;
    }

    public CashSaleItemCostList getItemCostList() {
        return this.itemCostList;
    }

    public void setItemCostList(CashSaleItemCostList itemCostList) {
        this.itemCostList = itemCostList;
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

    public CashSaleExpCostList getExpCostList() {
        return this.expCostList;
    }

    public void setExpCostList(CashSaleExpCostList expCostList) {
        this.expCostList = expCostList;
    }

    public CashSaleTimeList getTimeList() {
        return this.timeList;
    }

    public void setTimeList(CashSaleTimeList timeList) {
        this.timeList = timeList;
    }

    public CashSaleShipGroupList getShipGroupList() {
        return this.shipGroupList;
    }

    public void setShipGroupList(CashSaleShipGroupList shipGroupList) {
        this.shipGroupList = shipGroupList;
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
        if (!(obj instanceof CashSale)) {
            return false;
        }
        CashSale other = (CashSale)obj;
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
        boolean _equals = super.equals(obj) && (this.createdDate == null && other.getCreatedDate() == null || this.createdDate != null && this.createdDate.equals(other.getCreatedDate())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && this.lastModifiedDate.equals(other.getLastModifiedDate())) && (this.nexus == null && other.getNexus() == null || this.nexus != null && this.nexus.equals(other.getNexus())) && (this.subsidiaryTaxRegNum == null && other.getSubsidiaryTaxRegNum() == null || this.subsidiaryTaxRegNum != null && this.subsidiaryTaxRegNum.equals(other.getSubsidiaryTaxRegNum())) && (this.taxRegOverride == null && other.getTaxRegOverride() == null || this.taxRegOverride != null && this.taxRegOverride.equals(other.getTaxRegOverride())) && (this.taxDetailsOverride == null && other.getTaxDetailsOverride() == null || this.taxDetailsOverride != null && this.taxDetailsOverride.equals(other.getTaxDetailsOverride())) && (this.customForm == null && other.getCustomForm() == null || this.customForm != null && this.customForm.equals(other.getCustomForm())) && (this.entity == null && other.getEntity() == null || this.entity != null && this.entity.equals(other.getEntity())) && (this.billingAccount == null && other.getBillingAccount() == null || this.billingAccount != null && this.billingAccount.equals(other.getBillingAccount())) && (this.recurringBill == null && other.getRecurringBill() == null || this.recurringBill != null && this.recurringBill.equals(other.getRecurringBill())) && (this.tranDate == null && other.getTranDate() == null || this.tranDate != null && this.tranDate.equals(other.getTranDate())) && (this.tranId == null && other.getTranId() == null || this.tranId != null && this.tranId.equals(other.getTranId())) && (this.entityTaxRegNum == null && other.getEntityTaxRegNum() == null || this.entityTaxRegNum != null && this.entityTaxRegNum.equals(other.getEntityTaxRegNum())) && (this.taxPointDate == null && other.getTaxPointDate() == null || this.taxPointDate != null && this.taxPointDate.equals(other.getTaxPointDate())) && (this.source == null && other.getSource() == null || this.source != null && this.source.equals(other.getSource())) && (this.postingPeriod == null && other.getPostingPeriod() == null || this.postingPeriod != null && this.postingPeriod.equals(other.getPostingPeriod())) && (this.createdFrom == null && other.getCreatedFrom() == null || this.createdFrom != null && this.createdFrom.equals(other.getCreatedFrom())) && (this.opportunity == null && other.getOpportunity() == null || this.opportunity != null && this.opportunity.equals(other.getOpportunity())) && (this.department == null && other.getDepartment() == null || this.department != null && this.department.equals(other.getDepartment())) && (this._class == null && other.get_class() == null || this._class != null && this._class.equals(other.get_class())) && (this.location == null && other.getLocation() == null || this.location != null && this.location.equals(other.getLocation())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && this.subsidiary.equals(other.getSubsidiary())) && (this.salesRep == null && other.getSalesRep() == null || this.salesRep != null && this.salesRep.equals(other.getSalesRep())) && (this.contribPct == null && other.getContribPct() == null || this.contribPct != null && this.contribPct.equals(other.getContribPct())) && (this.partner == null && other.getPartner() == null || this.partner != null && this.partner.equals(other.getPartner())) && (this.leadSource == null && other.getLeadSource() == null || this.leadSource != null && this.leadSource.equals(other.getLeadSource())) && (this.startDate == null && other.getStartDate() == null || this.startDate != null && this.startDate.equals(other.getStartDate())) && (this.endDate == null && other.getEndDate() == null || this.endDate != null && this.endDate.equals(other.getEndDate())) && (this.otherRefNum == null && other.getOtherRefNum() == null || this.otherRefNum != null && this.otherRefNum.equals(other.getOtherRefNum())) && (this.memo == null && other.getMemo() == null || this.memo != null && this.memo.equals(other.getMemo())) && (this.salesEffectiveDate == null && other.getSalesEffectiveDate() == null || this.salesEffectiveDate != null && this.salesEffectiveDate.equals(other.getSalesEffectiveDate())) && (this.excludeCommission == null && other.getExcludeCommission() == null || this.excludeCommission != null && this.excludeCommission.equals(other.getExcludeCommission())) && (this.revRecSchedule == null && other.getRevRecSchedule() == null || this.revRecSchedule != null && this.revRecSchedule.equals(other.getRevRecSchedule())) && (this.undepFunds == null && other.getUndepFunds() == null || this.undepFunds != null && this.undepFunds.equals(other.getUndepFunds())) && (this.canHaveStackable == null && other.getCanHaveStackable() == null || this.canHaveStackable != null && this.canHaveStackable.equals(other.getCanHaveStackable())) && (this.currency == null && other.getCurrency() == null || this.currency != null && this.currency.equals(other.getCurrency())) && (this.account == null && other.getAccount() == null || this.account != null && this.account.equals(other.getAccount())) && (this.revRecStartDate == null && other.getRevRecStartDate() == null || this.revRecStartDate != null && this.revRecStartDate.equals(other.getRevRecStartDate())) && (this.revRecEndDate == null && other.getRevRecEndDate() == null || this.revRecEndDate != null && this.revRecEndDate.equals(other.getRevRecEndDate())) && (this.totalCostEstimate == null && other.getTotalCostEstimate() == null || this.totalCostEstimate != null && this.totalCostEstimate.equals(other.getTotalCostEstimate())) && (this.estGrossProfit == null && other.getEstGrossProfit() == null || this.estGrossProfit != null && this.estGrossProfit.equals(other.getEstGrossProfit())) && (this.estGrossProfitPercent == null && other.getEstGrossProfitPercent() == null || this.estGrossProfitPercent != null && this.estGrossProfitPercent.equals(other.getEstGrossProfitPercent())) && (this.exchangeRate == null && other.getExchangeRate() == null || this.exchangeRate != null && this.exchangeRate.equals(other.getExchangeRate())) && (this.currencyName == null && other.getCurrencyName() == null || this.currencyName != null && this.currencyName.equals(other.getCurrencyName())) && (this.promoCode == null && other.getPromoCode() == null || this.promoCode != null && this.promoCode.equals(other.getPromoCode())) && (this.discountItem == null && other.getDiscountItem() == null || this.discountItem != null && this.discountItem.equals(other.getDiscountItem())) && (this.discountRate == null && other.getDiscountRate() == null || this.discountRate != null && this.discountRate.equals(other.getDiscountRate())) && (this.isTaxable == null && other.getIsTaxable() == null || this.isTaxable != null && this.isTaxable.equals(other.getIsTaxable())) && (this.taxItem == null && other.getTaxItem() == null || this.taxItem != null && this.taxItem.equals(other.getTaxItem())) && (this.taxRate == null && other.getTaxRate() == null || this.taxRate != null && this.taxRate.equals(other.getTaxRate())) && (this.toBePrinted == null && other.getToBePrinted() == null || this.toBePrinted != null && this.toBePrinted.equals(other.getToBePrinted())) && (this.toBeEmailed == null && other.getToBeEmailed() == null || this.toBeEmailed != null && this.toBeEmailed.equals(other.getToBeEmailed())) && (this.toBeFaxed == null && other.getToBeFaxed() == null || this.toBeFaxed != null && this.toBeFaxed.equals(other.getToBeFaxed())) && (this.fax == null && other.getFax() == null || this.fax != null && this.fax.equals(other.getFax())) && (this.messageSel == null && other.getMessageSel() == null || this.messageSel != null && this.messageSel.equals(other.getMessageSel())) && (this.message == null && other.getMessage() == null || this.message != null && this.message.equals(other.getMessage())) && (this.paymentOption == null && other.getPaymentOption() == null || this.paymentOption != null && this.paymentOption.equals(other.getPaymentOption())) && (this.inputAuthCode == null && other.getInputAuthCode() == null || this.inputAuthCode != null && this.inputAuthCode.equals(other.getInputAuthCode())) && (this.inputReferenceCode == null && other.getInputReferenceCode() == null || this.inputReferenceCode != null && this.inputReferenceCode.equals(other.getInputReferenceCode())) && (this.checkNumber == null && other.getCheckNumber() == null || this.checkNumber != null && this.checkNumber.equals(other.getCheckNumber())) && (this.paymentCardCsc == null && other.getPaymentCardCsc() == null || this.paymentCardCsc != null && this.paymentCardCsc.equals(other.getPaymentCardCsc())) && (this.paymentProcessingProfile == null && other.getPaymentProcessingProfile() == null || this.paymentProcessingProfile != null && this.paymentProcessingProfile.equals(other.getPaymentProcessingProfile())) && (this.handlingMode == null && other.getHandlingMode() == null || this.handlingMode != null && this.handlingMode.equals(other.getHandlingMode())) && (this.outputAuthCode == null && other.getOutputAuthCode() == null || this.outputAuthCode != null && this.outputAuthCode.equals(other.getOutputAuthCode())) && (this.outputReferenceCode == null && other.getOutputReferenceCode() == null || this.outputReferenceCode != null && this.outputReferenceCode.equals(other.getOutputReferenceCode())) && (this.paymentOperation == null && other.getPaymentOperation() == null || this.paymentOperation != null && this.paymentOperation.equals(other.getPaymentOperation())) && (this.dynamicDescriptor == null && other.getDynamicDescriptor() == null || this.dynamicDescriptor != null && this.dynamicDescriptor.equals(other.getDynamicDescriptor())) && (this.billingAddress == null && other.getBillingAddress() == null || this.billingAddress != null && this.billingAddress.equals(other.getBillingAddress())) && (this.billAddressList == null && other.getBillAddressList() == null || this.billAddressList != null && this.billAddressList.equals(other.getBillAddressList())) && (this.shippingAddress == null && other.getShippingAddress() == null || this.shippingAddress != null && this.shippingAddress.equals(other.getShippingAddress())) && (this.shipIsResidential == null && other.getShipIsResidential() == null || this.shipIsResidential != null && this.shipIsResidential.equals(other.getShipIsResidential())) && (this.shipAddressList == null && other.getShipAddressList() == null || this.shipAddressList != null && this.shipAddressList.equals(other.getShipAddressList())) && (this.fob == null && other.getFob() == null || this.fob != null && this.fob.equals(other.getFob())) && (this.shipDate == null && other.getShipDate() == null || this.shipDate != null && this.shipDate.equals(other.getShipDate())) && (this.shipMethod == null && other.getShipMethod() == null || this.shipMethod != null && this.shipMethod.equals(other.getShipMethod())) && (this.shippingCost == null && other.getShippingCost() == null || this.shippingCost != null && this.shippingCost.equals(other.getShippingCost())) && (this.shippingTax1Rate == null && other.getShippingTax1Rate() == null || this.shippingTax1Rate != null && this.shippingTax1Rate.equals(other.getShippingTax1Rate())) && (this.shippingTax2Rate == null && other.getShippingTax2Rate() == null || this.shippingTax2Rate != null && this.shippingTax2Rate.equals(other.getShippingTax2Rate())) && (this.shippingTaxCode == null && other.getShippingTaxCode() == null || this.shippingTaxCode != null && this.shippingTaxCode.equals(other.getShippingTaxCode())) && (this.handlingTaxCode == null && other.getHandlingTaxCode() == null || this.handlingTaxCode != null && this.handlingTaxCode.equals(other.getHandlingTaxCode())) && (this.handlingTax1Rate == null && other.getHandlingTax1Rate() == null || this.handlingTax1Rate != null && this.handlingTax1Rate.equals(other.getHandlingTax1Rate())) && (this.handlingCost == null && other.getHandlingCost() == null || this.handlingCost != null && this.handlingCost.equals(other.getHandlingCost())) && (this.handlingTax2Rate == null && other.getHandlingTax2Rate() == null || this.handlingTax2Rate != null && this.handlingTax2Rate.equals(other.getHandlingTax2Rate())) && (this.linkedTrackingNumbers == null && other.getLinkedTrackingNumbers() == null || this.linkedTrackingNumbers != null && this.linkedTrackingNumbers.equals(other.getLinkedTrackingNumbers())) && (this.trackingNumbers == null && other.getTrackingNumbers() == null || this.trackingNumbers != null && this.trackingNumbers.equals(other.getTrackingNumbers())) && (this.salesGroup == null && other.getSalesGroup() == null || this.salesGroup != null && this.salesGroup.equals(other.getSalesGroup())) && (this.revenueStatus == null && other.getRevenueStatus() == null || this.revenueStatus != null && this.revenueStatus.equals(other.getRevenueStatus())) && (this.recognizedRevenue == null && other.getRecognizedRevenue() == null || this.recognizedRevenue != null && this.recognizedRevenue.equals(other.getRecognizedRevenue())) && (this.deferredRevenue == null && other.getDeferredRevenue() == null || this.deferredRevenue != null && this.deferredRevenue.equals(other.getDeferredRevenue())) && (this.revRecOnRevCommitment == null && other.getRevRecOnRevCommitment() == null || this.revRecOnRevCommitment != null && this.revRecOnRevCommitment.equals(other.getRevRecOnRevCommitment())) && (this.syncSalesTeams == null && other.getSyncSalesTeams() == null || this.syncSalesTeams != null && this.syncSalesTeams.equals(other.getSyncSalesTeams())) && (this.paymentMethod == null && other.getPaymentMethod() == null || this.paymentMethod != null && this.paymentMethod.equals(other.getPaymentMethod())) && (this.payPalStatus == null && other.getPayPalStatus() == null || this.payPalStatus != null && this.payPalStatus.equals(other.getPayPalStatus())) && (this.creditCard == null && other.getCreditCard() == null || this.creditCard != null && this.creditCard.equals(other.getCreditCard())) && (this.ccNumber == null && other.getCcNumber() == null || this.ccNumber != null && this.ccNumber.equals(other.getCcNumber())) && (this.ccExpireDate == null && other.getCcExpireDate() == null || this.ccExpireDate != null && this.ccExpireDate.equals(other.getCcExpireDate())) && (this.ccName == null && other.getCcName() == null || this.ccName != null && this.ccName.equals(other.getCcName())) && (this.ccStreet == null && other.getCcStreet() == null || this.ccStreet != null && this.ccStreet.equals(other.getCcStreet())) && (this.ccZipCode == null && other.getCcZipCode() == null || this.ccZipCode != null && this.ccZipCode.equals(other.getCcZipCode())) && (this.creditCardProcessor == null && other.getCreditCardProcessor() == null || this.creditCardProcessor != null && this.creditCardProcessor.equals(other.getCreditCardProcessor())) && (this.ccApproved == null && other.getCcApproved() == null || this.ccApproved != null && this.ccApproved.equals(other.getCcApproved())) && (this.authCode == null && other.getAuthCode() == null || this.authCode != null && this.authCode.equals(other.getAuthCode())) && (this.ccAvsStreetMatch == null && other.getCcAvsStreetMatch() == null || this.ccAvsStreetMatch != null && this.ccAvsStreetMatch.equals(other.getCcAvsStreetMatch())) && (this.ccAvsZipMatch == null && other.getCcAvsZipMatch() == null || this.ccAvsZipMatch != null && this.ccAvsZipMatch.equals(other.getCcAvsZipMatch())) && (this.isRecurringPayment == null && other.getIsRecurringPayment() == null || this.isRecurringPayment != null && this.isRecurringPayment.equals(other.getIsRecurringPayment())) && (this.payPalTranId == null && other.getPayPalTranId() == null || this.payPalTranId != null && this.payPalTranId.equals(other.getPayPalTranId())) && (this.subTotal == null && other.getSubTotal() == null || this.subTotal != null && this.subTotal.equals(other.getSubTotal())) && (this.ccIsPurchaseCardBin == null && other.getCcIsPurchaseCardBin() == null || this.ccIsPurchaseCardBin != null && this.ccIsPurchaseCardBin.equals(other.getCcIsPurchaseCardBin())) && (this.ignoreAvs == null && other.getIgnoreAvs() == null || this.ignoreAvs != null && this.ignoreAvs.equals(other.getIgnoreAvs())) && (this.ccProcessAsPurchaseCard == null && other.getCcProcessAsPurchaseCard() == null || this.ccProcessAsPurchaseCard != null && this.ccProcessAsPurchaseCard.equals(other.getCcProcessAsPurchaseCard())) && (this.itemCostDiscount == null && other.getItemCostDiscount() == null || this.itemCostDiscount != null && this.itemCostDiscount.equals(other.getItemCostDiscount())) && (this.itemCostDiscRate == null && other.getItemCostDiscRate() == null || this.itemCostDiscRate != null && this.itemCostDiscRate.equals(other.getItemCostDiscRate())) && (this.itemCostDiscAmount == null && other.getItemCostDiscAmount() == null || this.itemCostDiscAmount != null && this.itemCostDiscAmount.equals(other.getItemCostDiscAmount())) && (this.itemCostTaxRate1 == null && other.getItemCostTaxRate1() == null || this.itemCostTaxRate1 != null && this.itemCostTaxRate1.equals(other.getItemCostTaxRate1())) && (this.itemCostTaxRate2 == null && other.getItemCostTaxRate2() == null || this.itemCostTaxRate2 != null && this.itemCostTaxRate2.equals(other.getItemCostTaxRate2())) && (this.itemCostDiscTaxable == null && other.getItemCostDiscTaxable() == null || this.itemCostDiscTaxable != null && this.itemCostDiscTaxable.equals(other.getItemCostDiscTaxable())) && (this.itemCostTaxCode == null && other.getItemCostTaxCode() == null || this.itemCostTaxCode != null && this.itemCostTaxCode.equals(other.getItemCostTaxCode())) && (this.itemCostDiscTax1Amt == null && other.getItemCostDiscTax1Amt() == null || this.itemCostDiscTax1Amt != null && this.itemCostDiscTax1Amt.equals(other.getItemCostDiscTax1Amt())) && (this.itemCostDiscPrint == null && other.getItemCostDiscPrint() == null || this.itemCostDiscPrint != null && this.itemCostDiscPrint.equals(other.getItemCostDiscPrint())) && (this.expCostDiscount == null && other.getExpCostDiscount() == null || this.expCostDiscount != null && this.expCostDiscount.equals(other.getExpCostDiscount())) && (this.expCostDiscRate == null && other.getExpCostDiscRate() == null || this.expCostDiscRate != null && this.expCostDiscRate.equals(other.getExpCostDiscRate())) && (this.expCostDiscAmount == null && other.getExpCostDiscAmount() == null || this.expCostDiscAmount != null && this.expCostDiscAmount.equals(other.getExpCostDiscAmount())) && (this.expCostDiscTaxable == null && other.getExpCostDiscTaxable() == null || this.expCostDiscTaxable != null && this.expCostDiscTaxable.equals(other.getExpCostDiscTaxable())) && (this.expCostDiscprint == null && other.getExpCostDiscprint() == null || this.expCostDiscprint != null && this.expCostDiscprint.equals(other.getExpCostDiscprint())) && (this.expCostTaxRate1 == null && other.getExpCostTaxRate1() == null || this.expCostTaxRate1 != null && this.expCostTaxRate1.equals(other.getExpCostTaxRate1())) && (this.timeDiscount == null && other.getTimeDiscount() == null || this.timeDiscount != null && this.timeDiscount.equals(other.getTimeDiscount())) && (this.expCostTaxCode == null && other.getExpCostTaxCode() == null || this.expCostTaxCode != null && this.expCostTaxCode.equals(other.getExpCostTaxCode())) && (this.timeDiscRate == null && other.getTimeDiscRate() == null || this.timeDiscRate != null && this.timeDiscRate.equals(other.getTimeDiscRate())) && (this.expCostTaxRate2 == null && other.getExpCostTaxRate2() == null || this.expCostTaxRate2 != null && this.expCostTaxRate2.equals(other.getExpCostTaxRate2())) && (this.expCostDiscTax1Amt == null && other.getExpCostDiscTax1Amt() == null || this.expCostDiscTax1Amt != null && this.expCostDiscTax1Amt.equals(other.getExpCostDiscTax1Amt())) && (this.timeDiscAmount == null && other.getTimeDiscAmount() == null || this.timeDiscAmount != null && this.timeDiscAmount.equals(other.getTimeDiscAmount())) && (this.timeDiscTaxable == null && other.getTimeDiscTaxable() == null || this.timeDiscTaxable != null && this.timeDiscTaxable.equals(other.getTimeDiscTaxable())) && (this.timeDiscPrint == null && other.getTimeDiscPrint() == null || this.timeDiscPrint != null && this.timeDiscPrint.equals(other.getTimeDiscPrint())) && (this.discountTotal == null && other.getDiscountTotal() == null || this.discountTotal != null && this.discountTotal.equals(other.getDiscountTotal())) && (this.taxTotal == null && other.getTaxTotal() == null || this.taxTotal != null && this.taxTotal.equals(other.getTaxTotal())) && (this.timeTaxRate1 == null && other.getTimeTaxRate1() == null || this.timeTaxRate1 != null && this.timeTaxRate1.equals(other.getTimeTaxRate1())) && (this.altShippingCost == null && other.getAltShippingCost() == null || this.altShippingCost != null && this.altShippingCost.equals(other.getAltShippingCost())) && (this.timeTaxCode == null && other.getTimeTaxCode() == null || this.timeTaxCode != null && this.timeTaxCode.equals(other.getTimeTaxCode())) && (this.altHandlingCost == null && other.getAltHandlingCost() == null || this.altHandlingCost != null && this.altHandlingCost.equals(other.getAltHandlingCost())) && (this.total == null && other.getTotal() == null || this.total != null && this.total.equals(other.getTotal())) && (this.timeDiscTax1Amt == null && other.getTimeDiscTax1Amt() == null || this.timeDiscTax1Amt != null && this.timeDiscTax1Amt.equals(other.getTimeDiscTax1Amt())) && (this.ccSecurityCode == null && other.getCcSecurityCode() == null || this.ccSecurityCode != null && this.ccSecurityCode.equals(other.getCcSecurityCode())) && (this.timeTaxRate2 == null && other.getTimeTaxRate2() == null || this.timeTaxRate2 != null && this.timeTaxRate2.equals(other.getTimeTaxRate2())) && (this.ccSecurityCodeMatch == null && other.getCcSecurityCodeMatch() == null || this.ccSecurityCodeMatch != null && this.ccSecurityCodeMatch.equals(other.getCcSecurityCodeMatch())) && (this.chargeIt == null && other.getChargeIt() == null || this.chargeIt != null && this.chargeIt.equals(other.getChargeIt())) && (this.debitCardIssueNo == null && other.getDebitCardIssueNo() == null || this.debitCardIssueNo != null && this.debitCardIssueNo.equals(other.getDebitCardIssueNo())) && (this.threeDStatusCode == null && other.getThreeDStatusCode() == null || this.threeDStatusCode != null && this.threeDStatusCode.equals(other.getThreeDStatusCode())) && (this.pnRefNum == null && other.getPnRefNum() == null || this.pnRefNum != null && this.pnRefNum.equals(other.getPnRefNum())) && (this.paypalAuthId == null && other.getPaypalAuthId() == null || this.paypalAuthId != null && this.paypalAuthId.equals(other.getPaypalAuthId())) && (this.status == null && other.getStatus() == null || this.status != null && this.status.equals(other.getStatus())) && (this.paypalProcess == null && other.getPaypalProcess() == null || this.paypalProcess != null && this.paypalProcess.equals(other.getPaypalProcess())) && (this.job == null && other.getJob() == null || this.job != null && this.job.equals(other.getJob())) && (this.billingSchedule == null && other.getBillingSchedule() == null || this.billingSchedule != null && this.billingSchedule.equals(other.getBillingSchedule())) && (this.email == null && other.getEmail() == null || this.email != null && this.email.equals(other.getEmail())) && (this.tax2Total == null && other.getTax2Total() == null || this.tax2Total != null && this.tax2Total.equals(other.getTax2Total())) && (this.validFrom == null && other.getValidFrom() == null || this.validFrom != null && this.validFrom.equals(other.getValidFrom())) && (this.vatRegNum == null && other.getVatRegNum() == null || this.vatRegNum != null && this.vatRegNum.equals(other.getVatRegNum())) && (this.giftCertApplied == null && other.getGiftCertApplied() == null || this.giftCertApplied != null && this.giftCertApplied.equals(other.getGiftCertApplied())) && (this.tranIsVsoeBundle == null && other.getTranIsVsoeBundle() == null || this.tranIsVsoeBundle != null && this.tranIsVsoeBundle.equals(other.getTranIsVsoeBundle())) && (this.vsoeAutoCalc == null && other.getVsoeAutoCalc() == null || this.vsoeAutoCalc != null && this.vsoeAutoCalc.equals(other.getVsoeAutoCalc())) && (this.syncPartnerTeams == null && other.getSyncPartnerTeams() == null || this.syncPartnerTeams != null && this.syncPartnerTeams.equals(other.getSyncPartnerTeams())) && (this.salesTeamList == null && other.getSalesTeamList() == null || this.salesTeamList != null && this.salesTeamList.equals(other.getSalesTeamList())) && (this.partnersList == null && other.getPartnersList() == null || this.partnersList != null && this.partnersList.equals(other.getPartnersList())) && (this.itemList == null && other.getItemList() == null || this.itemList != null && this.itemList.equals(other.getItemList())) && (this.accountingBookDetailList == null && other.getAccountingBookDetailList() == null || this.accountingBookDetailList != null && this.accountingBookDetailList.equals(other.getAccountingBookDetailList())) && (this.itemCostList == null && other.getItemCostList() == null || this.itemCostList != null && this.itemCostList.equals(other.getItemCostList())) && (this.giftCertRedemptionList == null && other.getGiftCertRedemptionList() == null || this.giftCertRedemptionList != null && this.giftCertRedemptionList.equals(other.getGiftCertRedemptionList())) && (this.promotionsList == null && other.getPromotionsList() == null || this.promotionsList != null && this.promotionsList.equals(other.getPromotionsList())) && (this.expCostList == null && other.getExpCostList() == null || this.expCostList != null && this.expCostList.equals(other.getExpCostList())) && (this.timeList == null && other.getTimeList() == null || this.timeList != null && this.timeList.equals(other.getTimeList())) && (this.shipGroupList == null && other.getShipGroupList() == null || this.shipGroupList != null && this.shipGroupList.equals(other.getShipGroupList())) && (this.taxDetailsList == null && other.getTaxDetailsList() == null || this.taxDetailsList != null && this.taxDetailsList.equals(other.getTaxDetailsList())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
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
        if (this.getEntity() != null) {
            _hashCode += this.getEntity().hashCode();
        }
        if (this.getBillingAccount() != null) {
            _hashCode += this.getBillingAccount().hashCode();
        }
        if (this.getRecurringBill() != null) {
            _hashCode += this.getRecurringBill().hashCode();
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
        if (this.getSource() != null) {
            _hashCode += this.getSource().hashCode();
        }
        if (this.getPostingPeriod() != null) {
            _hashCode += this.getPostingPeriod().hashCode();
        }
        if (this.getCreatedFrom() != null) {
            _hashCode += this.getCreatedFrom().hashCode();
        }
        if (this.getOpportunity() != null) {
            _hashCode += this.getOpportunity().hashCode();
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
        if (this.getSalesRep() != null) {
            _hashCode += this.getSalesRep().hashCode();
        }
        if (this.getContribPct() != null) {
            _hashCode += this.getContribPct().hashCode();
        }
        if (this.getPartner() != null) {
            _hashCode += this.getPartner().hashCode();
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
        if (this.getRevRecSchedule() != null) {
            _hashCode += this.getRevRecSchedule().hashCode();
        }
        if (this.getUndepFunds() != null) {
            _hashCode += this.getUndepFunds().hashCode();
        }
        if (this.getCanHaveStackable() != null) {
            _hashCode += this.getCanHaveStackable().hashCode();
        }
        if (this.getCurrency() != null) {
            _hashCode += this.getCurrency().hashCode();
        }
        if (this.getAccount() != null) {
            _hashCode += this.getAccount().hashCode();
        }
        if (this.getRevRecStartDate() != null) {
            _hashCode += this.getRevRecStartDate().hashCode();
        }
        if (this.getRevRecEndDate() != null) {
            _hashCode += this.getRevRecEndDate().hashCode();
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
        if (this.getCurrencyName() != null) {
            _hashCode += this.getCurrencyName().hashCode();
        }
        if (this.getPromoCode() != null) {
            _hashCode += this.getPromoCode().hashCode();
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
        if (this.getShipMethod() != null) {
            _hashCode += this.getShipMethod().hashCode();
        }
        if (this.getShippingCost() != null) {
            _hashCode += this.getShippingCost().hashCode();
        }
        if (this.getShippingTax1Rate() != null) {
            _hashCode += this.getShippingTax1Rate().hashCode();
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
        if (this.getHandlingCost() != null) {
            _hashCode += this.getHandlingCost().hashCode();
        }
        if (this.getHandlingTax2Rate() != null) {
            _hashCode += this.getHandlingTax2Rate().hashCode();
        }
        if (this.getLinkedTrackingNumbers() != null) {
            _hashCode += this.getLinkedTrackingNumbers().hashCode();
        }
        if (this.getTrackingNumbers() != null) {
            _hashCode += this.getTrackingNumbers().hashCode();
        }
        if (this.getSalesGroup() != null) {
            _hashCode += this.getSalesGroup().hashCode();
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
        if (this.getSyncSalesTeams() != null) {
            _hashCode += this.getSyncSalesTeams().hashCode();
        }
        if (this.getPaymentMethod() != null) {
            _hashCode += this.getPaymentMethod().hashCode();
        }
        if (this.getPayPalStatus() != null) {
            _hashCode += this.getPayPalStatus().hashCode();
        }
        if (this.getCreditCard() != null) {
            _hashCode += this.getCreditCard().hashCode();
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
        if (this.getCreditCardProcessor() != null) {
            _hashCode += this.getCreditCardProcessor().hashCode();
        }
        if (this.getCcApproved() != null) {
            _hashCode += this.getCcApproved().hashCode();
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
        if (this.getPayPalTranId() != null) {
            _hashCode += this.getPayPalTranId().hashCode();
        }
        if (this.getSubTotal() != null) {
            _hashCode += this.getSubTotal().hashCode();
        }
        if (this.getCcIsPurchaseCardBin() != null) {
            _hashCode += this.getCcIsPurchaseCardBin().hashCode();
        }
        if (this.getIgnoreAvs() != null) {
            _hashCode += this.getIgnoreAvs().hashCode();
        }
        if (this.getCcProcessAsPurchaseCard() != null) {
            _hashCode += this.getCcProcessAsPurchaseCard().hashCode();
        }
        if (this.getItemCostDiscount() != null) {
            _hashCode += this.getItemCostDiscount().hashCode();
        }
        if (this.getItemCostDiscRate() != null) {
            _hashCode += this.getItemCostDiscRate().hashCode();
        }
        if (this.getItemCostDiscAmount() != null) {
            _hashCode += this.getItemCostDiscAmount().hashCode();
        }
        if (this.getItemCostTaxRate1() != null) {
            _hashCode += this.getItemCostTaxRate1().hashCode();
        }
        if (this.getItemCostTaxRate2() != null) {
            _hashCode += this.getItemCostTaxRate2().hashCode();
        }
        if (this.getItemCostDiscTaxable() != null) {
            _hashCode += this.getItemCostDiscTaxable().hashCode();
        }
        if (this.getItemCostTaxCode() != null) {
            _hashCode += this.getItemCostTaxCode().hashCode();
        }
        if (this.getItemCostDiscTax1Amt() != null) {
            _hashCode += this.getItemCostDiscTax1Amt().hashCode();
        }
        if (this.getItemCostDiscPrint() != null) {
            _hashCode += this.getItemCostDiscPrint().hashCode();
        }
        if (this.getExpCostDiscount() != null) {
            _hashCode += this.getExpCostDiscount().hashCode();
        }
        if (this.getExpCostDiscRate() != null) {
            _hashCode += this.getExpCostDiscRate().hashCode();
        }
        if (this.getExpCostDiscAmount() != null) {
            _hashCode += this.getExpCostDiscAmount().hashCode();
        }
        if (this.getExpCostDiscTaxable() != null) {
            _hashCode += this.getExpCostDiscTaxable().hashCode();
        }
        if (this.getExpCostDiscprint() != null) {
            _hashCode += this.getExpCostDiscprint().hashCode();
        }
        if (this.getExpCostTaxRate1() != null) {
            _hashCode += this.getExpCostTaxRate1().hashCode();
        }
        if (this.getTimeDiscount() != null) {
            _hashCode += this.getTimeDiscount().hashCode();
        }
        if (this.getExpCostTaxCode() != null) {
            _hashCode += this.getExpCostTaxCode().hashCode();
        }
        if (this.getTimeDiscRate() != null) {
            _hashCode += this.getTimeDiscRate().hashCode();
        }
        if (this.getExpCostTaxRate2() != null) {
            _hashCode += this.getExpCostTaxRate2().hashCode();
        }
        if (this.getExpCostDiscTax1Amt() != null) {
            _hashCode += this.getExpCostDiscTax1Amt().hashCode();
        }
        if (this.getTimeDiscAmount() != null) {
            _hashCode += this.getTimeDiscAmount().hashCode();
        }
        if (this.getTimeDiscTaxable() != null) {
            _hashCode += this.getTimeDiscTaxable().hashCode();
        }
        if (this.getTimeDiscPrint() != null) {
            _hashCode += this.getTimeDiscPrint().hashCode();
        }
        if (this.getDiscountTotal() != null) {
            _hashCode += this.getDiscountTotal().hashCode();
        }
        if (this.getTaxTotal() != null) {
            _hashCode += this.getTaxTotal().hashCode();
        }
        if (this.getTimeTaxRate1() != null) {
            _hashCode += this.getTimeTaxRate1().hashCode();
        }
        if (this.getAltShippingCost() != null) {
            _hashCode += this.getAltShippingCost().hashCode();
        }
        if (this.getTimeTaxCode() != null) {
            _hashCode += this.getTimeTaxCode().hashCode();
        }
        if (this.getAltHandlingCost() != null) {
            _hashCode += this.getAltHandlingCost().hashCode();
        }
        if (this.getTotal() != null) {
            _hashCode += this.getTotal().hashCode();
        }
        if (this.getTimeDiscTax1Amt() != null) {
            _hashCode += this.getTimeDiscTax1Amt().hashCode();
        }
        if (this.getCcSecurityCode() != null) {
            _hashCode += this.getCcSecurityCode().hashCode();
        }
        if (this.getTimeTaxRate2() != null) {
            _hashCode += this.getTimeTaxRate2().hashCode();
        }
        if (this.getCcSecurityCodeMatch() != null) {
            _hashCode += this.getCcSecurityCodeMatch().hashCode();
        }
        if (this.getChargeIt() != null) {
            _hashCode += this.getChargeIt().hashCode();
        }
        if (this.getDebitCardIssueNo() != null) {
            _hashCode += this.getDebitCardIssueNo().hashCode();
        }
        if (this.getThreeDStatusCode() != null) {
            _hashCode += this.getThreeDStatusCode().hashCode();
        }
        if (this.getPnRefNum() != null) {
            _hashCode += this.getPnRefNum().hashCode();
        }
        if (this.getPaypalAuthId() != null) {
            _hashCode += this.getPaypalAuthId().hashCode();
        }
        if (this.getStatus() != null) {
            _hashCode += this.getStatus().hashCode();
        }
        if (this.getPaypalProcess() != null) {
            _hashCode += this.getPaypalProcess().hashCode();
        }
        if (this.getJob() != null) {
            _hashCode += this.getJob().hashCode();
        }
        if (this.getBillingSchedule() != null) {
            _hashCode += this.getBillingSchedule().hashCode();
        }
        if (this.getEmail() != null) {
            _hashCode += this.getEmail().hashCode();
        }
        if (this.getTax2Total() != null) {
            _hashCode += this.getTax2Total().hashCode();
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
        if (this.getItemList() != null) {
            _hashCode += this.getItemList().hashCode();
        }
        if (this.getAccountingBookDetailList() != null) {
            _hashCode += this.getAccountingBookDetailList().hashCode();
        }
        if (this.getItemCostList() != null) {
            _hashCode += this.getItemCostList().hashCode();
        }
        if (this.getGiftCertRedemptionList() != null) {
            _hashCode += this.getGiftCertRedemptionList().hashCode();
        }
        if (this.getPromotionsList() != null) {
            _hashCode += this.getPromotionsList().hashCode();
        }
        if (this.getExpCostList() != null) {
            _hashCode += this.getExpCostList().hashCode();
        }
        if (this.getTimeList() != null) {
            _hashCode += this.getTimeList().hashCode();
        }
        if (this.getShipGroupList() != null) {
            _hashCode += this.getShipGroupList().hashCode();
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
        typeDesc.setXmlType(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "CashSale"));
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
        elemField.setFieldName("billingAccount");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "billingAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recurringBill");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "recurringBill"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("taxPointDate");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "taxPointDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("postingPeriod");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "postingPeriod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("opportunity");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "opportunity"));
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
        elemField.setFieldName("_class");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "class"));
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
        elemField.setFieldName("revRecSchedule");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "revRecSchedule"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("undepFunds");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "undepFunds"));
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
        elemField.setFieldName("currency");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "account"));
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
        elemField.setFieldName("currencyName");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "currencyName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setXmlType(new QName("urn:types.sales_2022_1.transactions.webservices.netsuite.com", "CashSaleHandlingMode"));
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
        elemField.setXmlType(new QName("urn:types.sales_2022_1.transactions.webservices.netsuite.com", "CashSalePaymentOperation"));
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
        elemField.setFieldName("handlingCost");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "handlingCost"));
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
        elemField.setFieldName("linkedTrackingNumbers");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "linkedTrackingNumbers"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("salesGroup");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "salesGroup"));
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
        elemField.setFieldName("syncSalesTeams");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "syncSalesTeams"));
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
        elemField.setFieldName("payPalStatus");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "payPalStatus"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("creditCardProcessor");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "creditCardProcessor"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("payPalTranId");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "payPalTranId"));
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
        elemField.setFieldName("ccIsPurchaseCardBin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "ccIsPurchaseCardBin"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("ccProcessAsPurchaseCard");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "ccProcessAsPurchaseCard"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemCostDiscount");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "itemCostDiscount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemCostDiscRate");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "itemCostDiscRate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemCostDiscAmount");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "itemCostDiscAmount"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemCostTaxRate1");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "itemCostTaxRate1"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemCostTaxRate2");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "itemCostTaxRate2"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemCostDiscTaxable");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "itemCostDiscTaxable"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemCostTaxCode");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "itemCostTaxCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemCostDiscTax1Amt");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "itemCostDiscTax1Amt"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemCostDiscPrint");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "itemCostDiscPrint"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("expCostDiscount");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "expCostDiscount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("expCostDiscRate");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "expCostDiscRate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("expCostDiscAmount");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "expCostDiscAmount"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("expCostDiscTaxable");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "expCostDiscTaxable"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("expCostDiscprint");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "expCostDiscprint"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("expCostTaxRate1");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "expCostTaxRate1"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("timeDiscount");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "timeDiscount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("expCostTaxCode");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "expCostTaxCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("timeDiscRate");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "timeDiscRate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("expCostTaxRate2");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "expCostTaxRate2"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("expCostDiscTax1Amt");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "expCostDiscTax1Amt"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("timeDiscAmount");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "timeDiscAmount"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("timeDiscTaxable");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "timeDiscTaxable"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("timeDiscPrint");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "timeDiscPrint"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("timeTaxRate1");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "timeTaxRate1"));
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
        elemField.setFieldName("timeTaxCode");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "timeTaxCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("timeDiscTax1Amt");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "timeDiscTax1Amt"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("timeTaxRate2");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "timeTaxRate2"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("chargeIt");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "chargeIt"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("threeDStatusCode");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "threeDStatusCode"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("paypalAuthId");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "paypalAuthId"));
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
        elemField.setFieldName("paypalProcess");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "paypalProcess"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("billingSchedule");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "billingSchedule"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("tax2Total");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "tax2Total"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setXmlType(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "CashSaleSalesTeamList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("partnersList");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "partnersList"));
        elemField.setXmlType(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "CashSalePartnersList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemList");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "itemList"));
        elemField.setXmlType(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "CashSaleItemList"));
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
        elemField.setFieldName("itemCostList");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "itemCostList"));
        elemField.setXmlType(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "CashSaleItemCostList"));
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
        elemField.setFieldName("expCostList");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "expCostList"));
        elemField.setXmlType(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "CashSaleExpCostList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("timeList");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "timeList"));
        elemField.setXmlType(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "CashSaleTimeList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipGroupList");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "shipGroupList"));
        elemField.setXmlType(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "CashSaleShipGroupList"));
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

