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
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.types.IntercoStatus;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.types.RevenueCommitStatus;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.types.RevenueStatus;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.CustomFieldList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.NullField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.Record;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.customers.ReturnAuthorizationItemList;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.customers.ReturnAuthorizationPartnersList;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.customers.ReturnAuthorizationSalesTeamList;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.customers.types.ReturnAuthorizationOrderStatus;
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

public class ReturnAuthorization
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
    private String source;
    private RecordRef department;
    private RecordRef _class;
    private RecordRef location;
    private RecordRef subsidiary;
    private RecordRef intercoTransaction;
    private IntercoStatus intercoStatus;
    private RecordRef job;
    private RecordRef partner;
    private String otherRefNum;
    private RecordRef leadSource;
    private String memo;
    private RecordRef drAccount;
    private RecordRef fxAccount;
    private Calendar salesEffectiveDate;
    private RecordRef createdFrom;
    private RecordRef revRecSchedule;
    private Double totalCostEstimate;
    private Double estGrossProfit;
    private Double estGrossProfitPercent;
    private Calendar revRecStartDate;
    private Calendar revRecEndDate;
    private Boolean excludeCommission;
    private Double exchangeRate;
    private String currencyName;
    private RecordRef discountItem;
    private String discountRate;
    private RecordRef taxItem;
    private Double taxRate;
    private Boolean toBePrinted;
    private Boolean toBeEmailed;
    private Boolean toBeFaxed;
    private RecordRef messageSel;
    private String message;
    private Address billingAddress;
    private RecordRef billAddressList;
    private RecordRef shipAddressList;
    private String shipAddress;
    private RecordRef salesGroup;
    private Boolean syncSalesTeams;
    private RevenueStatus revenueStatus;
    private Double recognizedRevenue;
    private Double deferredRevenue;
    private Boolean revRecOnRevCommitment;
    private RevenueCommitStatus revCommitStatus;
    private RecordRef paymentMethod;
    private RecordRef creditCard;
    private String ccNumber;
    private Double altSalesTotal;
    private Calendar ccExpireDate;
    private String ccName;
    private String ccStreet;
    private String ccZipCode;
    private Boolean ccApproved;
    private String pnRefNum;
    private Double subTotal;
    private Double discountTotal;
    private Double total;
    private RecordRef creditCardProcessor;
    private String payPalAuthId;
    private Boolean payPalProcess;
    private String email;
    private String fax;
    private String debitCardIssueNo;
    private Boolean isTaxable;
    private RecordRef promoCode;
    private String status;
    private Double taxTotal;
    private Double tax2Total;
    private Calendar validFrom;
    private ReturnAuthorizationOrderStatus orderStatus;
    private RecordRef salesRep;
    private RecordRef giftCert;
    private String contribPct;
    private Double giftCertTotal;
    private Double giftCertApplied;
    private Double giftCertAvailable;
    private Boolean tranIsVsoeBundle;
    private Boolean vsoeAutoCalc;
    private Boolean syncPartnerTeams;
    private ReturnAuthorizationItemList itemList;
    private AccountingBookDetailList accountingBookDetailList;
    private ReturnAuthorizationSalesTeamList salesTeamList;
    private ReturnAuthorizationPartnersList partnersList;
    private TaxDetailsList taxDetailsList;
    private CustomFieldList customFieldList;
    private String internalId;
    private String externalId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(ReturnAuthorization.class, true);

    public ReturnAuthorization() {
    }

    public ReturnAuthorization(NullField nullFieldList, String internalId, String externalId, Calendar createdDate, Calendar lastModifiedDate, RecordRef nexus, RecordRef subsidiaryTaxRegNum, Boolean taxRegOverride, Boolean taxDetailsOverride, RecordRef customForm, RecordRef currency, RecordRef entity, String vatRegNum, Calendar tranDate, String tranId, RecordRef entityTaxRegNum, Calendar taxPointDate, String source, RecordRef department, RecordRef _class, RecordRef location, RecordRef subsidiary, RecordRef intercoTransaction, IntercoStatus intercoStatus, RecordRef job, RecordRef partner, String otherRefNum, RecordRef leadSource, String memo, RecordRef drAccount, RecordRef fxAccount, Calendar salesEffectiveDate, RecordRef createdFrom, RecordRef revRecSchedule, Double totalCostEstimate, Double estGrossProfit, Double estGrossProfitPercent, Calendar revRecStartDate, Calendar revRecEndDate, Boolean excludeCommission, Double exchangeRate, String currencyName, RecordRef discountItem, String discountRate, RecordRef taxItem, Double taxRate, Boolean toBePrinted, Boolean toBeEmailed, Boolean toBeFaxed, RecordRef messageSel, String message, Address billingAddress, RecordRef billAddressList, RecordRef shipAddressList, String shipAddress, RecordRef salesGroup, Boolean syncSalesTeams, RevenueStatus revenueStatus, Double recognizedRevenue, Double deferredRevenue, Boolean revRecOnRevCommitment, RevenueCommitStatus revCommitStatus, RecordRef paymentMethod, RecordRef creditCard, String ccNumber, Double altSalesTotal, Calendar ccExpireDate, String ccName, String ccStreet, String ccZipCode, Boolean ccApproved, String pnRefNum, Double subTotal, Double discountTotal, Double total, RecordRef creditCardProcessor, String payPalAuthId, Boolean payPalProcess, String email, String fax, String debitCardIssueNo, Boolean isTaxable, RecordRef promoCode, String status, Double taxTotal, Double tax2Total, Calendar validFrom, ReturnAuthorizationOrderStatus orderStatus, RecordRef salesRep, RecordRef giftCert, String contribPct, Double giftCertTotal, Double giftCertApplied, Double giftCertAvailable, Boolean tranIsVsoeBundle, Boolean vsoeAutoCalc, Boolean syncPartnerTeams, ReturnAuthorizationItemList itemList, AccountingBookDetailList accountingBookDetailList, ReturnAuthorizationSalesTeamList salesTeamList, ReturnAuthorizationPartnersList partnersList, TaxDetailsList taxDetailsList, CustomFieldList customFieldList) {
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
        this.source = source;
        this.department = department;
        this._class = _class;
        this.location = location;
        this.subsidiary = subsidiary;
        this.intercoTransaction = intercoTransaction;
        this.intercoStatus = intercoStatus;
        this.job = job;
        this.partner = partner;
        this.otherRefNum = otherRefNum;
        this.leadSource = leadSource;
        this.memo = memo;
        this.drAccount = drAccount;
        this.fxAccount = fxAccount;
        this.salesEffectiveDate = salesEffectiveDate;
        this.createdFrom = createdFrom;
        this.revRecSchedule = revRecSchedule;
        this.totalCostEstimate = totalCostEstimate;
        this.estGrossProfit = estGrossProfit;
        this.estGrossProfitPercent = estGrossProfitPercent;
        this.revRecStartDate = revRecStartDate;
        this.revRecEndDate = revRecEndDate;
        this.excludeCommission = excludeCommission;
        this.exchangeRate = exchangeRate;
        this.currencyName = currencyName;
        this.discountItem = discountItem;
        this.discountRate = discountRate;
        this.taxItem = taxItem;
        this.taxRate = taxRate;
        this.toBePrinted = toBePrinted;
        this.toBeEmailed = toBeEmailed;
        this.toBeFaxed = toBeFaxed;
        this.messageSel = messageSel;
        this.message = message;
        this.billingAddress = billingAddress;
        this.billAddressList = billAddressList;
        this.shipAddressList = shipAddressList;
        this.shipAddress = shipAddress;
        this.salesGroup = salesGroup;
        this.syncSalesTeams = syncSalesTeams;
        this.revenueStatus = revenueStatus;
        this.recognizedRevenue = recognizedRevenue;
        this.deferredRevenue = deferredRevenue;
        this.revRecOnRevCommitment = revRecOnRevCommitment;
        this.revCommitStatus = revCommitStatus;
        this.paymentMethod = paymentMethod;
        this.creditCard = creditCard;
        this.ccNumber = ccNumber;
        this.altSalesTotal = altSalesTotal;
        this.ccExpireDate = ccExpireDate;
        this.ccName = ccName;
        this.ccStreet = ccStreet;
        this.ccZipCode = ccZipCode;
        this.ccApproved = ccApproved;
        this.pnRefNum = pnRefNum;
        this.subTotal = subTotal;
        this.discountTotal = discountTotal;
        this.total = total;
        this.creditCardProcessor = creditCardProcessor;
        this.payPalAuthId = payPalAuthId;
        this.payPalProcess = payPalProcess;
        this.email = email;
        this.fax = fax;
        this.debitCardIssueNo = debitCardIssueNo;
        this.isTaxable = isTaxable;
        this.promoCode = promoCode;
        this.status = status;
        this.taxTotal = taxTotal;
        this.tax2Total = tax2Total;
        this.validFrom = validFrom;
        this.orderStatus = orderStatus;
        this.salesRep = salesRep;
        this.giftCert = giftCert;
        this.contribPct = contribPct;
        this.giftCertTotal = giftCertTotal;
        this.giftCertApplied = giftCertApplied;
        this.giftCertAvailable = giftCertAvailable;
        this.tranIsVsoeBundle = tranIsVsoeBundle;
        this.vsoeAutoCalc = vsoeAutoCalc;
        this.syncPartnerTeams = syncPartnerTeams;
        this.itemList = itemList;
        this.accountingBookDetailList = accountingBookDetailList;
        this.salesTeamList = salesTeamList;
        this.partnersList = partnersList;
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

    public String getSource() {
        return this.source;
    }

    public void setSource(String source) {
        this.source = source;
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

    public RecordRef getJob() {
        return this.job;
    }

    public void setJob(RecordRef job) {
        this.job = job;
    }

    public RecordRef getPartner() {
        return this.partner;
    }

    public void setPartner(RecordRef partner) {
        this.partner = partner;
    }

    public String getOtherRefNum() {
        return this.otherRefNum;
    }

    public void setOtherRefNum(String otherRefNum) {
        this.otherRefNum = otherRefNum;
    }

    public RecordRef getLeadSource() {
        return this.leadSource;
    }

    public void setLeadSource(RecordRef leadSource) {
        this.leadSource = leadSource;
    }

    public String getMemo() {
        return this.memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
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

    public Calendar getSalesEffectiveDate() {
        return this.salesEffectiveDate;
    }

    public void setSalesEffectiveDate(Calendar salesEffectiveDate) {
        this.salesEffectiveDate = salesEffectiveDate;
    }

    public RecordRef getCreatedFrom() {
        return this.createdFrom;
    }

    public void setCreatedFrom(RecordRef createdFrom) {
        this.createdFrom = createdFrom;
    }

    public RecordRef getRevRecSchedule() {
        return this.revRecSchedule;
    }

    public void setRevRecSchedule(RecordRef revRecSchedule) {
        this.revRecSchedule = revRecSchedule;
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

    public Boolean getExcludeCommission() {
        return this.excludeCommission;
    }

    public void setExcludeCommission(Boolean excludeCommission) {
        this.excludeCommission = excludeCommission;
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

    public RecordRef getShipAddressList() {
        return this.shipAddressList;
    }

    public void setShipAddressList(RecordRef shipAddressList) {
        this.shipAddressList = shipAddressList;
    }

    public String getShipAddress() {
        return this.shipAddress;
    }

    public void setShipAddress(String shipAddress) {
        this.shipAddress = shipAddress;
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

    public RecordRef getPaymentMethod() {
        return this.paymentMethod;
    }

    public void setPaymentMethod(RecordRef paymentMethod) {
        this.paymentMethod = paymentMethod;
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

    public Double getAltSalesTotal() {
        return this.altSalesTotal;
    }

    public void setAltSalesTotal(Double altSalesTotal) {
        this.altSalesTotal = altSalesTotal;
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

    public Boolean getCcApproved() {
        return this.ccApproved;
    }

    public void setCcApproved(Boolean ccApproved) {
        this.ccApproved = ccApproved;
    }

    public String getPnRefNum() {
        return this.pnRefNum;
    }

    public void setPnRefNum(String pnRefNum) {
        this.pnRefNum = pnRefNum;
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

    public Double getTotal() {
        return this.total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public RecordRef getCreditCardProcessor() {
        return this.creditCardProcessor;
    }

    public void setCreditCardProcessor(RecordRef creditCardProcessor) {
        this.creditCardProcessor = creditCardProcessor;
    }

    public String getPayPalAuthId() {
        return this.payPalAuthId;
    }

    public void setPayPalAuthId(String payPalAuthId) {
        this.payPalAuthId = payPalAuthId;
    }

    public Boolean getPayPalProcess() {
        return this.payPalProcess;
    }

    public void setPayPalProcess(Boolean payPalProcess) {
        this.payPalProcess = payPalProcess;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFax() {
        return this.fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getDebitCardIssueNo() {
        return this.debitCardIssueNo;
    }

    public void setDebitCardIssueNo(String debitCardIssueNo) {
        this.debitCardIssueNo = debitCardIssueNo;
    }

    public Boolean getIsTaxable() {
        return this.isTaxable;
    }

    public void setIsTaxable(Boolean isTaxable) {
        this.isTaxable = isTaxable;
    }

    public RecordRef getPromoCode() {
        return this.promoCode;
    }

    public void setPromoCode(RecordRef promoCode) {
        this.promoCode = promoCode;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
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

    public Calendar getValidFrom() {
        return this.validFrom;
    }

    public void setValidFrom(Calendar validFrom) {
        this.validFrom = validFrom;
    }

    public ReturnAuthorizationOrderStatus getOrderStatus() {
        return this.orderStatus;
    }

    public void setOrderStatus(ReturnAuthorizationOrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public RecordRef getSalesRep() {
        return this.salesRep;
    }

    public void setSalesRep(RecordRef salesRep) {
        this.salesRep = salesRep;
    }

    public RecordRef getGiftCert() {
        return this.giftCert;
    }

    public void setGiftCert(RecordRef giftCert) {
        this.giftCert = giftCert;
    }

    public String getContribPct() {
        return this.contribPct;
    }

    public void setContribPct(String contribPct) {
        this.contribPct = contribPct;
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

    public ReturnAuthorizationItemList getItemList() {
        return this.itemList;
    }

    public void setItemList(ReturnAuthorizationItemList itemList) {
        this.itemList = itemList;
    }

    public AccountingBookDetailList getAccountingBookDetailList() {
        return this.accountingBookDetailList;
    }

    public void setAccountingBookDetailList(AccountingBookDetailList accountingBookDetailList) {
        this.accountingBookDetailList = accountingBookDetailList;
    }

    public ReturnAuthorizationSalesTeamList getSalesTeamList() {
        return this.salesTeamList;
    }

    public void setSalesTeamList(ReturnAuthorizationSalesTeamList salesTeamList) {
        this.salesTeamList = salesTeamList;
    }

    public ReturnAuthorizationPartnersList getPartnersList() {
        return this.partnersList;
    }

    public void setPartnersList(ReturnAuthorizationPartnersList partnersList) {
        this.partnersList = partnersList;
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
        if (!(obj instanceof ReturnAuthorization)) {
            return false;
        }
        ReturnAuthorization other = (ReturnAuthorization)obj;
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
        boolean _equals = super.equals(obj) && (this.createdDate == null && other.getCreatedDate() == null || this.createdDate != null && this.createdDate.equals(other.getCreatedDate())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && this.lastModifiedDate.equals(other.getLastModifiedDate())) && (this.nexus == null && other.getNexus() == null || this.nexus != null && this.nexus.equals(other.getNexus())) && (this.subsidiaryTaxRegNum == null && other.getSubsidiaryTaxRegNum() == null || this.subsidiaryTaxRegNum != null && this.subsidiaryTaxRegNum.equals(other.getSubsidiaryTaxRegNum())) && (this.taxRegOverride == null && other.getTaxRegOverride() == null || this.taxRegOverride != null && this.taxRegOverride.equals(other.getTaxRegOverride())) && (this.taxDetailsOverride == null && other.getTaxDetailsOverride() == null || this.taxDetailsOverride != null && this.taxDetailsOverride.equals(other.getTaxDetailsOverride())) && (this.customForm == null && other.getCustomForm() == null || this.customForm != null && this.customForm.equals(other.getCustomForm())) && (this.currency == null && other.getCurrency() == null || this.currency != null && this.currency.equals(other.getCurrency())) && (this.entity == null && other.getEntity() == null || this.entity != null && this.entity.equals(other.getEntity())) && (this.vatRegNum == null && other.getVatRegNum() == null || this.vatRegNum != null && this.vatRegNum.equals(other.getVatRegNum())) && (this.tranDate == null && other.getTranDate() == null || this.tranDate != null && this.tranDate.equals(other.getTranDate())) && (this.tranId == null && other.getTranId() == null || this.tranId != null && this.tranId.equals(other.getTranId())) && (this.entityTaxRegNum == null && other.getEntityTaxRegNum() == null || this.entityTaxRegNum != null && this.entityTaxRegNum.equals(other.getEntityTaxRegNum())) && (this.taxPointDate == null && other.getTaxPointDate() == null || this.taxPointDate != null && this.taxPointDate.equals(other.getTaxPointDate())) && (this.source == null && other.getSource() == null || this.source != null && this.source.equals(other.getSource())) && (this.department == null && other.getDepartment() == null || this.department != null && this.department.equals(other.getDepartment())) && (this._class == null && other.get_class() == null || this._class != null && this._class.equals(other.get_class())) && (this.location == null && other.getLocation() == null || this.location != null && this.location.equals(other.getLocation())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && this.subsidiary.equals(other.getSubsidiary())) && (this.intercoTransaction == null && other.getIntercoTransaction() == null || this.intercoTransaction != null && this.intercoTransaction.equals(other.getIntercoTransaction())) && (this.intercoStatus == null && other.getIntercoStatus() == null || this.intercoStatus != null && this.intercoStatus.equals(other.getIntercoStatus())) && (this.job == null && other.getJob() == null || this.job != null && this.job.equals(other.getJob())) && (this.partner == null && other.getPartner() == null || this.partner != null && this.partner.equals(other.getPartner())) && (this.otherRefNum == null && other.getOtherRefNum() == null || this.otherRefNum != null && this.otherRefNum.equals(other.getOtherRefNum())) && (this.leadSource == null && other.getLeadSource() == null || this.leadSource != null && this.leadSource.equals(other.getLeadSource())) && (this.memo == null && other.getMemo() == null || this.memo != null && this.memo.equals(other.getMemo())) && (this.drAccount == null && other.getDrAccount() == null || this.drAccount != null && this.drAccount.equals(other.getDrAccount())) && (this.fxAccount == null && other.getFxAccount() == null || this.fxAccount != null && this.fxAccount.equals(other.getFxAccount())) && (this.salesEffectiveDate == null && other.getSalesEffectiveDate() == null || this.salesEffectiveDate != null && this.salesEffectiveDate.equals(other.getSalesEffectiveDate())) && (this.createdFrom == null && other.getCreatedFrom() == null || this.createdFrom != null && this.createdFrom.equals(other.getCreatedFrom())) && (this.revRecSchedule == null && other.getRevRecSchedule() == null || this.revRecSchedule != null && this.revRecSchedule.equals(other.getRevRecSchedule())) && (this.totalCostEstimate == null && other.getTotalCostEstimate() == null || this.totalCostEstimate != null && this.totalCostEstimate.equals(other.getTotalCostEstimate())) && (this.estGrossProfit == null && other.getEstGrossProfit() == null || this.estGrossProfit != null && this.estGrossProfit.equals(other.getEstGrossProfit())) && (this.estGrossProfitPercent == null && other.getEstGrossProfitPercent() == null || this.estGrossProfitPercent != null && this.estGrossProfitPercent.equals(other.getEstGrossProfitPercent())) && (this.revRecStartDate == null && other.getRevRecStartDate() == null || this.revRecStartDate != null && this.revRecStartDate.equals(other.getRevRecStartDate())) && (this.revRecEndDate == null && other.getRevRecEndDate() == null || this.revRecEndDate != null && this.revRecEndDate.equals(other.getRevRecEndDate())) && (this.excludeCommission == null && other.getExcludeCommission() == null || this.excludeCommission != null && this.excludeCommission.equals(other.getExcludeCommission())) && (this.exchangeRate == null && other.getExchangeRate() == null || this.exchangeRate != null && this.exchangeRate.equals(other.getExchangeRate())) && (this.currencyName == null && other.getCurrencyName() == null || this.currencyName != null && this.currencyName.equals(other.getCurrencyName())) && (this.discountItem == null && other.getDiscountItem() == null || this.discountItem != null && this.discountItem.equals(other.getDiscountItem())) && (this.discountRate == null && other.getDiscountRate() == null || this.discountRate != null && this.discountRate.equals(other.getDiscountRate())) && (this.taxItem == null && other.getTaxItem() == null || this.taxItem != null && this.taxItem.equals(other.getTaxItem())) && (this.taxRate == null && other.getTaxRate() == null || this.taxRate != null && this.taxRate.equals(other.getTaxRate())) && (this.toBePrinted == null && other.getToBePrinted() == null || this.toBePrinted != null && this.toBePrinted.equals(other.getToBePrinted())) && (this.toBeEmailed == null && other.getToBeEmailed() == null || this.toBeEmailed != null && this.toBeEmailed.equals(other.getToBeEmailed())) && (this.toBeFaxed == null && other.getToBeFaxed() == null || this.toBeFaxed != null && this.toBeFaxed.equals(other.getToBeFaxed())) && (this.messageSel == null && other.getMessageSel() == null || this.messageSel != null && this.messageSel.equals(other.getMessageSel())) && (this.message == null && other.getMessage() == null || this.message != null && this.message.equals(other.getMessage())) && (this.billingAddress == null && other.getBillingAddress() == null || this.billingAddress != null && this.billingAddress.equals(other.getBillingAddress())) && (this.billAddressList == null && other.getBillAddressList() == null || this.billAddressList != null && this.billAddressList.equals(other.getBillAddressList())) && (this.shipAddressList == null && other.getShipAddressList() == null || this.shipAddressList != null && this.shipAddressList.equals(other.getShipAddressList())) && (this.shipAddress == null && other.getShipAddress() == null || this.shipAddress != null && this.shipAddress.equals(other.getShipAddress())) && (this.salesGroup == null && other.getSalesGroup() == null || this.salesGroup != null && this.salesGroup.equals(other.getSalesGroup())) && (this.syncSalesTeams == null && other.getSyncSalesTeams() == null || this.syncSalesTeams != null && this.syncSalesTeams.equals(other.getSyncSalesTeams())) && (this.revenueStatus == null && other.getRevenueStatus() == null || this.revenueStatus != null && this.revenueStatus.equals(other.getRevenueStatus())) && (this.recognizedRevenue == null && other.getRecognizedRevenue() == null || this.recognizedRevenue != null && this.recognizedRevenue.equals(other.getRecognizedRevenue())) && (this.deferredRevenue == null && other.getDeferredRevenue() == null || this.deferredRevenue != null && this.deferredRevenue.equals(other.getDeferredRevenue())) && (this.revRecOnRevCommitment == null && other.getRevRecOnRevCommitment() == null || this.revRecOnRevCommitment != null && this.revRecOnRevCommitment.equals(other.getRevRecOnRevCommitment())) && (this.revCommitStatus == null && other.getRevCommitStatus() == null || this.revCommitStatus != null && this.revCommitStatus.equals(other.getRevCommitStatus())) && (this.paymentMethod == null && other.getPaymentMethod() == null || this.paymentMethod != null && this.paymentMethod.equals(other.getPaymentMethod())) && (this.creditCard == null && other.getCreditCard() == null || this.creditCard != null && this.creditCard.equals(other.getCreditCard())) && (this.ccNumber == null && other.getCcNumber() == null || this.ccNumber != null && this.ccNumber.equals(other.getCcNumber())) && (this.altSalesTotal == null && other.getAltSalesTotal() == null || this.altSalesTotal != null && this.altSalesTotal.equals(other.getAltSalesTotal())) && (this.ccExpireDate == null && other.getCcExpireDate() == null || this.ccExpireDate != null && this.ccExpireDate.equals(other.getCcExpireDate())) && (this.ccName == null && other.getCcName() == null || this.ccName != null && this.ccName.equals(other.getCcName())) && (this.ccStreet == null && other.getCcStreet() == null || this.ccStreet != null && this.ccStreet.equals(other.getCcStreet())) && (this.ccZipCode == null && other.getCcZipCode() == null || this.ccZipCode != null && this.ccZipCode.equals(other.getCcZipCode())) && (this.ccApproved == null && other.getCcApproved() == null || this.ccApproved != null && this.ccApproved.equals(other.getCcApproved())) && (this.pnRefNum == null && other.getPnRefNum() == null || this.pnRefNum != null && this.pnRefNum.equals(other.getPnRefNum())) && (this.subTotal == null && other.getSubTotal() == null || this.subTotal != null && this.subTotal.equals(other.getSubTotal())) && (this.discountTotal == null && other.getDiscountTotal() == null || this.discountTotal != null && this.discountTotal.equals(other.getDiscountTotal())) && (this.total == null && other.getTotal() == null || this.total != null && this.total.equals(other.getTotal())) && (this.creditCardProcessor == null && other.getCreditCardProcessor() == null || this.creditCardProcessor != null && this.creditCardProcessor.equals(other.getCreditCardProcessor())) && (this.payPalAuthId == null && other.getPayPalAuthId() == null || this.payPalAuthId != null && this.payPalAuthId.equals(other.getPayPalAuthId())) && (this.payPalProcess == null && other.getPayPalProcess() == null || this.payPalProcess != null && this.payPalProcess.equals(other.getPayPalProcess())) && (this.email == null && other.getEmail() == null || this.email != null && this.email.equals(other.getEmail())) && (this.fax == null && other.getFax() == null || this.fax != null && this.fax.equals(other.getFax())) && (this.debitCardIssueNo == null && other.getDebitCardIssueNo() == null || this.debitCardIssueNo != null && this.debitCardIssueNo.equals(other.getDebitCardIssueNo())) && (this.isTaxable == null && other.getIsTaxable() == null || this.isTaxable != null && this.isTaxable.equals(other.getIsTaxable())) && (this.promoCode == null && other.getPromoCode() == null || this.promoCode != null && this.promoCode.equals(other.getPromoCode())) && (this.status == null && other.getStatus() == null || this.status != null && this.status.equals(other.getStatus())) && (this.taxTotal == null && other.getTaxTotal() == null || this.taxTotal != null && this.taxTotal.equals(other.getTaxTotal())) && (this.tax2Total == null && other.getTax2Total() == null || this.tax2Total != null && this.tax2Total.equals(other.getTax2Total())) && (this.validFrom == null && other.getValidFrom() == null || this.validFrom != null && this.validFrom.equals(other.getValidFrom())) && (this.orderStatus == null && other.getOrderStatus() == null || this.orderStatus != null && this.orderStatus.equals(other.getOrderStatus())) && (this.salesRep == null && other.getSalesRep() == null || this.salesRep != null && this.salesRep.equals(other.getSalesRep())) && (this.giftCert == null && other.getGiftCert() == null || this.giftCert != null && this.giftCert.equals(other.getGiftCert())) && (this.contribPct == null && other.getContribPct() == null || this.contribPct != null && this.contribPct.equals(other.getContribPct())) && (this.giftCertTotal == null && other.getGiftCertTotal() == null || this.giftCertTotal != null && this.giftCertTotal.equals(other.getGiftCertTotal())) && (this.giftCertApplied == null && other.getGiftCertApplied() == null || this.giftCertApplied != null && this.giftCertApplied.equals(other.getGiftCertApplied())) && (this.giftCertAvailable == null && other.getGiftCertAvailable() == null || this.giftCertAvailable != null && this.giftCertAvailable.equals(other.getGiftCertAvailable())) && (this.tranIsVsoeBundle == null && other.getTranIsVsoeBundle() == null || this.tranIsVsoeBundle != null && this.tranIsVsoeBundle.equals(other.getTranIsVsoeBundle())) && (this.vsoeAutoCalc == null && other.getVsoeAutoCalc() == null || this.vsoeAutoCalc != null && this.vsoeAutoCalc.equals(other.getVsoeAutoCalc())) && (this.syncPartnerTeams == null && other.getSyncPartnerTeams() == null || this.syncPartnerTeams != null && this.syncPartnerTeams.equals(other.getSyncPartnerTeams())) && (this.itemList == null && other.getItemList() == null || this.itemList != null && this.itemList.equals(other.getItemList())) && (this.accountingBookDetailList == null && other.getAccountingBookDetailList() == null || this.accountingBookDetailList != null && this.accountingBookDetailList.equals(other.getAccountingBookDetailList())) && (this.salesTeamList == null && other.getSalesTeamList() == null || this.salesTeamList != null && this.salesTeamList.equals(other.getSalesTeamList())) && (this.partnersList == null && other.getPartnersList() == null || this.partnersList != null && this.partnersList.equals(other.getPartnersList())) && (this.taxDetailsList == null && other.getTaxDetailsList() == null || this.taxDetailsList != null && this.taxDetailsList.equals(other.getTaxDetailsList())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
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
        if (this.getSource() != null) {
            _hashCode += this.getSource().hashCode();
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
        if (this.getIntercoTransaction() != null) {
            _hashCode += this.getIntercoTransaction().hashCode();
        }
        if (this.getIntercoStatus() != null) {
            _hashCode += this.getIntercoStatus().hashCode();
        }
        if (this.getJob() != null) {
            _hashCode += this.getJob().hashCode();
        }
        if (this.getPartner() != null) {
            _hashCode += this.getPartner().hashCode();
        }
        if (this.getOtherRefNum() != null) {
            _hashCode += this.getOtherRefNum().hashCode();
        }
        if (this.getLeadSource() != null) {
            _hashCode += this.getLeadSource().hashCode();
        }
        if (this.getMemo() != null) {
            _hashCode += this.getMemo().hashCode();
        }
        if (this.getDrAccount() != null) {
            _hashCode += this.getDrAccount().hashCode();
        }
        if (this.getFxAccount() != null) {
            _hashCode += this.getFxAccount().hashCode();
        }
        if (this.getSalesEffectiveDate() != null) {
            _hashCode += this.getSalesEffectiveDate().hashCode();
        }
        if (this.getCreatedFrom() != null) {
            _hashCode += this.getCreatedFrom().hashCode();
        }
        if (this.getRevRecSchedule() != null) {
            _hashCode += this.getRevRecSchedule().hashCode();
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
        if (this.getRevRecStartDate() != null) {
            _hashCode += this.getRevRecStartDate().hashCode();
        }
        if (this.getRevRecEndDate() != null) {
            _hashCode += this.getRevRecEndDate().hashCode();
        }
        if (this.getExcludeCommission() != null) {
            _hashCode += this.getExcludeCommission().hashCode();
        }
        if (this.getExchangeRate() != null) {
            _hashCode += this.getExchangeRate().hashCode();
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
        if (this.getShipAddressList() != null) {
            _hashCode += this.getShipAddressList().hashCode();
        }
        if (this.getShipAddress() != null) {
            _hashCode += this.getShipAddress().hashCode();
        }
        if (this.getSalesGroup() != null) {
            _hashCode += this.getSalesGroup().hashCode();
        }
        if (this.getSyncSalesTeams() != null) {
            _hashCode += this.getSyncSalesTeams().hashCode();
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
        if (this.getPaymentMethod() != null) {
            _hashCode += this.getPaymentMethod().hashCode();
        }
        if (this.getCreditCard() != null) {
            _hashCode += this.getCreditCard().hashCode();
        }
        if (this.getCcNumber() != null) {
            _hashCode += this.getCcNumber().hashCode();
        }
        if (this.getAltSalesTotal() != null) {
            _hashCode += this.getAltSalesTotal().hashCode();
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
        if (this.getCcApproved() != null) {
            _hashCode += this.getCcApproved().hashCode();
        }
        if (this.getPnRefNum() != null) {
            _hashCode += this.getPnRefNum().hashCode();
        }
        if (this.getSubTotal() != null) {
            _hashCode += this.getSubTotal().hashCode();
        }
        if (this.getDiscountTotal() != null) {
            _hashCode += this.getDiscountTotal().hashCode();
        }
        if (this.getTotal() != null) {
            _hashCode += this.getTotal().hashCode();
        }
        if (this.getCreditCardProcessor() != null) {
            _hashCode += this.getCreditCardProcessor().hashCode();
        }
        if (this.getPayPalAuthId() != null) {
            _hashCode += this.getPayPalAuthId().hashCode();
        }
        if (this.getPayPalProcess() != null) {
            _hashCode += this.getPayPalProcess().hashCode();
        }
        if (this.getEmail() != null) {
            _hashCode += this.getEmail().hashCode();
        }
        if (this.getFax() != null) {
            _hashCode += this.getFax().hashCode();
        }
        if (this.getDebitCardIssueNo() != null) {
            _hashCode += this.getDebitCardIssueNo().hashCode();
        }
        if (this.getIsTaxable() != null) {
            _hashCode += this.getIsTaxable().hashCode();
        }
        if (this.getPromoCode() != null) {
            _hashCode += this.getPromoCode().hashCode();
        }
        if (this.getStatus() != null) {
            _hashCode += this.getStatus().hashCode();
        }
        if (this.getTaxTotal() != null) {
            _hashCode += this.getTaxTotal().hashCode();
        }
        if (this.getTax2Total() != null) {
            _hashCode += this.getTax2Total().hashCode();
        }
        if (this.getValidFrom() != null) {
            _hashCode += this.getValidFrom().hashCode();
        }
        if (this.getOrderStatus() != null) {
            _hashCode += this.getOrderStatus().hashCode();
        }
        if (this.getSalesRep() != null) {
            _hashCode += this.getSalesRep().hashCode();
        }
        if (this.getGiftCert() != null) {
            _hashCode += this.getGiftCert().hashCode();
        }
        if (this.getContribPct() != null) {
            _hashCode += this.getContribPct().hashCode();
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
        if (this.getItemList() != null) {
            _hashCode += this.getItemList().hashCode();
        }
        if (this.getAccountingBookDetailList() != null) {
            _hashCode += this.getAccountingBookDetailList().hashCode();
        }
        if (this.getSalesTeamList() != null) {
            _hashCode += this.getSalesTeamList().hashCode();
        }
        if (this.getPartnersList() != null) {
            _hashCode += this.getPartnersList().hashCode();
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
        typeDesc.setXmlType(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "ReturnAuthorization"));
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
        elemField.setFieldName("source");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "source"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("intercoTransaction");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "intercoTransaction"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("intercoStatus");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "intercoStatus"));
        elemField.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "IntercoStatus"));
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
        elemField.setFieldName("partner");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "partner"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("leadSource");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "leadSource"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("drAccount");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "drAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fxAccount");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "fxAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("createdFrom");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "createdFrom"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revRecSchedule");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "revRecSchedule"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("revRecStartDate");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "revRecStartDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revRecEndDate");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "revRecEndDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("exchangeRate");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "exchangeRate"));
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
        elemField.setFieldName("discountItem");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "discountItem"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("toBeFaxed");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "toBeFaxed"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("shipAddressList");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "shipAddressList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipAddress");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "shipAddress"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("revCommitStatus");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "revCommitStatus"));
        elemField.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "RevenueCommitStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("paymentMethod");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "paymentMethod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("creditCard");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "creditCard"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ccNumber");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "ccNumber"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("altSalesTotal");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "altSalesTotal"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ccExpireDate");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "ccExpireDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ccName");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "ccName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ccStreet");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "ccStreet"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ccZipCode");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "ccZipCode"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ccApproved");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "ccApproved"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("pnRefNum");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "pnRefNum"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("total");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "total"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("creditCardProcessor");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "creditCardProcessor"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("payPalAuthId");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "payPalAuthId"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("payPalProcess");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "payPalProcess"));
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
        elemField.setFieldName("fax");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "fax"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("debitCardIssueNo");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "debitCardIssueNo"));
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
        elemField.setFieldName("promoCode");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "promoCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("validFrom");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "validFrom"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("orderStatus");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "orderStatus"));
        elemField.setXmlType(new QName("urn:types.customers_2022_1.transactions.webservices.netsuite.com", "ReturnAuthorizationOrderStatus"));
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
        elemField.setFieldName("giftCert");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "giftCert"));
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
        elemField.setFieldName("itemList");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "itemList"));
        elemField.setXmlType(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "ReturnAuthorizationItemList"));
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
        elemField.setFieldName("salesTeamList");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "salesTeamList"));
        elemField.setXmlType(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "ReturnAuthorizationSalesTeamList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("partnersList");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "partnersList"));
        elemField.setXmlType(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "ReturnAuthorizationPartnersList"));
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

