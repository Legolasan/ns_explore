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
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchTextNumberField;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class TransactionSearchBasic
extends SearchRecordBasic
implements Serializable {
    private SearchMultiSelectField account;
    private SearchEnumMultiSelectField accountType;
    private SearchMultiSelectField acctCorpCardExp;
    private SearchDateField actualProductionEndDate;
    private SearchDateField actualProductionStartDate;
    private SearchDateField actualShipDate;
    private SearchDoubleField altSalesAmount;
    private SearchDoubleField altSalesNetAmount;
    private SearchDoubleField amount;
    private SearchDoubleField amountPaid;
    private SearchDoubleField amountRemaining;
    private SearchDoubleField amountUnbilled;
    private SearchMultiSelectField anyLineItem;
    private SearchDoubleField appliedToForeignAmount;
    private SearchBooleanField appliedToIsFxVariance;
    private SearchDoubleField appliedToLinkAmount;
    private SearchEnumMultiSelectField appliedToLinkType;
    private SearchMultiSelectField appliedToTransaction;
    private SearchDoubleField applyingForeignAmount;
    private SearchBooleanField applyingIsFxVariance;
    private SearchDoubleField applyingLinkAmount;
    private SearchEnumMultiSelectField applyingLinkType;
    private SearchMultiSelectField applyingTransaction;
    private SearchEnumMultiSelectField approvalStatus;
    private SearchStringField authCode;
    private SearchBooleanField autoCalculateLag;
    private SearchEnumMultiSelectField avsStreetMatch;
    private SearchEnumMultiSelectField avsZipMatch;
    private SearchBooleanField billable;
    private SearchStringField billAddress;
    private SearchStringField billAddressee;
    private SearchStringField billAttention;
    private SearchStringField billCity;
    private SearchEnumMultiSelectField billCountry;
    private SearchStringField billCounty;
    private SearchDateField billedDate;
    private SearchMultiSelectField billingAccount;
    private SearchMultiSelectField billingSchedule;
    private SearchBooleanField billingStatus;
    private SearchMultiSelectField billingTransaction;
    private SearchStringField billPhone;
    private SearchStringField billState;
    private SearchEnumMultiSelectField billVarianceStatus;
    private SearchStringField billZip;
    private SearchStringField binNumber;
    private SearchDoubleField binNumberQuantity;
    private SearchDoubleField bomQuantity;
    private SearchBooleanField bookSpecificTransaction;
    private SearchBooleanField buildEntireAssembly;
    private SearchDoubleField buildVariance;
    private SearchDoubleField built;
    private SearchBooleanField canHaveStackablePromotions;
    private SearchMultiSelectField catchUpPeriod;
    private SearchStringField ccCustomerCode;
    private SearchDateField ccExpireDate;
    private SearchStringField ccName;
    private SearchStringField ccNumber;
    private SearchEnumMultiSelectField chargeType;
    private SearchMultiSelectField _class;
    private SearchBooleanField cleared;
    private SearchBooleanField closed;
    private SearchDateField closeDate;
    private SearchBooleanField cogs;
    private SearchDateField commissionEffectiveDate;
    private SearchEnumMultiSelectField commit;
    private SearchDoubleField componentYield;
    private SearchStringField confirmationNumber;
    private SearchLongField contribution;
    private SearchDoubleField costComponentAmount;
    private SearchMultiSelectField costComponentCategory;
    private SearchMultiSelectField costComponentItem;
    private SearchDoubleField costComponentQuantity;
    private SearchDoubleField costComponentStandardCost;
    private SearchDoubleField costEstimate;
    private SearchDoubleField costEstimateRate;
    private SearchEnumMultiSelectField costEstimateType;
    private SearchMultiSelectField createdBy;
    private SearchMultiSelectField createdFrom;
    private SearchDoubleField creditAmount;
    private SearchEnumMultiSelectField cscMatch;
    private SearchMultiSelectField currency;
    private SearchMultiSelectField customerSubOf;
    private SearchMultiSelectField customForm;
    private SearchBooleanField customGL;
    private SearchMultiSelectField custType;
    private SearchDateField dateCreated;
    private SearchLongField daysOpen;
    private SearchLongField daysOverdue;
    private SearchDoubleField debitAmount;
    private SearchDoubleField deferredRevenue;
    private SearchBooleanField deferRevRec;
    private SearchMultiSelectField department;
    private SearchDateField depositDate;
    private SearchMultiSelectField depositTransaction;
    private SearchMultiSelectField drAccount;
    private SearchDateField dueDate;
    private SearchStringField email;
    private SearchMultiSelectField employee;
    private SearchDateField endDate;
    private SearchMultiSelectField entity;
    private SearchMultiSelectField entityStatus;
    private SearchDoubleField estGrossProfit;
    private SearchDoubleField estGrossProfitPct;
    private SearchDoubleField exchangeRate;
    private SearchBooleanField excludeCommission;
    private SearchBooleanField excludeFromRateRequest;
    private SearchDateField expectedCloseDate;
    private SearchDateField expectedReceiptDate;
    private SearchMultiSelectField expenseCategory;
    private SearchDateField expenseDate;
    private SearchMultiSelectField externalId;
    private SearchStringField externalIdString;
    private SearchBooleanField finChrg;
    private SearchBooleanField firmed;
    private SearchEnumMultiSelectField forecastType;
    private SearchMultiSelectField fulfillingTransaction;
    private SearchMultiSelectField fxAccount;
    private SearchDoubleField fxAmount;
    private SearchDoubleField fxCostEstimate;
    private SearchDoubleField fxCostEstimateRate;
    private SearchDoubleField fxEstGrossProfit;
    private SearchDoubleField fxTranCostEstimate;
    private SearchDoubleField fxVsoeAllocation;
    private SearchDoubleField fxVsoeAmount;
    private SearchDoubleField fxVsoePrice;
    private SearchBooleanField gcoAvailabelToCharge;
    private SearchBooleanField gcoAvailableToRefund;
    private SearchEnumMultiSelectField gcoAvsStreetMatch;
    private SearchEnumMultiSelectField gcoAvsZipMatch;
    private SearchLongField gcoBuyerAccountAge;
    private SearchStringField gcoBuyerIp;
    private SearchDoubleField gcoChargeAmount;
    private SearchDoubleField gcoChargebackAmount;
    private SearchDoubleField gcoConfirmedChargedTotal;
    private SearchDoubleField gcoConfirmedRefundedTotal;
    private SearchStringField gcoCreditcardNumber;
    private SearchEnumMultiSelectField gcoCscMatch;
    private SearchStringField gcoFinancialState;
    private SearchStringField gcoFulfillmentState;
    private SearchStringField gcoOrderId;
    private SearchDoubleField gcoOrderTotal;
    private SearchDoubleField gcoPromotionAmount;
    private SearchStringField gcoPromotionName;
    private SearchDoubleField gcoRefundAmount;
    private SearchDoubleField gcoShippingTotal;
    private SearchStringField gcoStateChangedDetail;
    private SearchStringField giftCertificate;
    private SearchDoubleField grossAmount;
    private SearchBooleanField includeInForecast;
    private SearchMultiSelectField incoterm;
    private SearchEnumMultiSelectField intercoStatus;
    private SearchMultiSelectField intercoTransaction;
    private SearchMultiSelectField internalId;
    private SearchLongField internalIdNumber;
    private SearchMultiSelectField inventoryLocation;
    private SearchMultiSelectField inventorySubsidiary;
    private SearchBooleanField inVsoeBundle;
    private SearchBooleanField isAllocation;
    private SearchBooleanField isBackflush;
    private SearchBooleanField isGcoChargeback;
    private SearchBooleanField isGcoChargeConfirmed;
    private SearchBooleanField isGcoPaymentGuaranteed;
    private SearchBooleanField isGcoRefundConfirmed;
    private SearchBooleanField isInsideDelivery;
    private SearchBooleanField isInsidePickup;
    private SearchBooleanField isIntercompanyAdjustment;
    private SearchBooleanField isInTransitPayment;
    private SearchBooleanField isMultiShipTo;
    private SearchBooleanField isPayPalMeth;
    private SearchBooleanField isReversal;
    private SearchBooleanField isRevRecTransaction;
    private SearchBooleanField isScrap;
    private SearchBooleanField isShipAddress;
    private SearchBooleanField isTransferPriceCosting;
    private SearchBooleanField isVsoeAlloc;
    private SearchBooleanField isWip;
    private SearchMultiSelectField item;
    private SearchEnumMultiSelectField itemFulfillmentChoice;
    private SearchMultiSelectField itemRevision;
    private SearchMultiSelectField itemSubOf;
    private SearchBooleanField landedCostPerLine;
    private SearchDateField lastModifiedDate;
    private SearchMultiSelectField leadSource;
    private SearchLongField lineUniqueKey;
    private SearchMultiSelectField location;
    private SearchBooleanField locationAutoAssigned;
    private SearchBooleanField mainLine;
    private SearchMultiSelectField mainName;
    private SearchMultiSelectField manufacturingRouting;
    private SearchBooleanField matchBillToReceipt;
    private SearchStringField memo;
    private SearchStringField memoMain;
    private SearchBooleanField memorized;
    private SearchStringField merchantAccount;
    private SearchStringField message;
    private SearchBooleanField multiSubsidiary;
    private SearchStringField nameText;
    private SearchDoubleField netAmount;
    private SearchMultiSelectField nextApprover;
    private SearchDateField nextBillDate;
    private SearchMultiSelectField nexus;
    private SearchBooleanField noAutoAssignLocation;
    private SearchBooleanField nonReimbursable;
    private SearchLongField number;
    private SearchDoubleField oneTimeTotal;
    private SearchMultiSelectField opportunity;
    private SearchMultiSelectField orderAllocationStrategy;
    private SearchDoubleField orderPriority;
    private SearchTextNumberField otherRefNum;
    private SearchTextNumberField otherRefNumNonDeposit;
    private SearchMultiSelectField overheadParentItem;
    private SearchBooleanField overrideInstallments;
    private SearchLongField packageCount;
    private SearchMultiSelectField paidTransaction;
    private SearchLongField parent;
    private SearchMultiSelectField partner;
    private SearchLongField partnerContribution;
    private SearchMultiSelectField partnerRole;
    private SearchMultiSelectField partnerTeamMember;
    private SearchMultiSelectField payingTransaction;
    private SearchBooleanField paymentApproved;
    private SearchDateField paymentEventDate;
    private SearchEnumMultiSelectField paymentEventHoldReason;
    private SearchBooleanField paymentEventPurchaseCardUsed;
    private SearchBooleanField paymentEventPurchaseDataSent;
    private SearchEnumMultiSelectField paymentEventResult;
    private SearchEnumMultiSelectField paymentEventType;
    private SearchBooleanField paymentHold;
    private SearchMultiSelectField paymentMethod;
    private SearchStringField paymentOption;
    private SearchBooleanField payPalPending;
    private SearchStringField payPalStatus;
    private SearchStringField payPalTranId;
    private SearchStringField pnRefNum;
    private SearchStringField poAsText;
    private SearchBooleanField policyViolated;
    private SearchBooleanField posting;
    private RecordRef postingPeriod;
    private PostingPeriodDate postingPeriodRelative;
    private SearchMultiSelectField priceLevel;
    private SearchBooleanField printedPickingTicket;
    private SearchLongField probability;
    private SearchDoubleField projectedAmount;
    private SearchMultiSelectField projectTask;
    private SearchMultiSelectField promoCode;
    private SearchMultiSelectField purchaseOrder;
    private SearchDoubleField quantity;
    private SearchDoubleField quantityBilled;
    private SearchDoubleField quantityCommitted;
    private SearchDoubleField quantityPacked;
    private SearchDoubleField quantityPicked;
    private SearchDoubleField quantityRevCommitted;
    private SearchDoubleField quantityShipRecv;
    private SearchDoubleField recognizedRevenue;
    private SearchStringField recordType;
    private SearchDoubleField recurAnnuallyTotal;
    private SearchDoubleField recurMonthlyTotal;
    private SearchDoubleField recurQuarterlyTotal;
    private SearchBooleanField recurringBill;
    private SearchDoubleField recurWeeklyTotal;
    private SearchLongField refNumber;
    private SearchDateField requestedDate;
    private SearchEnumMultiSelectField revCommitStatus;
    private SearchBooleanField revCommittingStatus;
    private SearchMultiSelectField revCommittingTransaction;
    private SearchEnumMultiSelectField revenueStatus;
    private SearchDateField reversalDate;
    private SearchStringField reversalNumber;
    private SearchDateField revRecEndDate;
    private SearchBooleanField revRecOnRevCommitment;
    private SearchDateField revRecStartDate;
    private SearchLongField revRecTermInMonths;
    private SearchDateField salesEffectiveDate;
    private SearchMultiSelectField salesOrder;
    private SearchMultiSelectField salesRep;
    private SearchMultiSelectField salesTeamMember;
    private SearchMultiSelectField salesTeamRole;
    private SearchEnumMultiSelectField schedulingMethod;
    private SearchStringField serialNumber;
    private SearchDoubleField serialNumberCost;
    private SearchDoubleField serialNumberCostAdjustment;
    private SearchDoubleField serialNumberQuantity;
    private SearchStringField serialNumbers;
    private SearchStringField shipAddress;
    private SearchStringField shipAddressee;
    private SearchStringField shipAttention;
    private SearchEnumMultiSelectField shipCarrier;
    private SearchStringField shipCity;
    private SearchBooleanField shipComplete;
    private SearchEnumMultiSelectField shipCountry;
    private SearchStringField shipCounty;
    private SearchDateField shipDate;
    private SearchLongField shipGroup;
    private SearchMultiSelectField shipMethod;
    private SearchStringField shipPhone;
    private SearchBooleanField shipping;
    private SearchBooleanField shipRecvStatus;
    private SearchBooleanField shipRecvStatusLine;
    private SearchMultiSelectField shipState;
    private SearchMultiSelectField shipTo;
    private SearchStringField shipZip;
    private SearchEnumMultiSelectField source;
    private SearchDateField startDate;
    private SearchBooleanField statistical;
    private SearchEnumMultiSelectField status;
    private SearchMultiSelectField subscription;
    private SearchMultiSelectField subscriptionLine;
    private SearchMultiSelectField subsidiary;
    private SearchMultiSelectField subsidiaryTaxRegNum;
    private SearchMultiSelectField taxItem;
    private SearchBooleanField taxLine;
    private RecordRef taxPeriod;
    private PostingPeriodDate taxPeriodRelative;
    private SearchDateField taxPointDate;
    private SearchDoubleField taxRate;
    private SearchMultiSelectField terms;
    private SearchEnumMultiSelectField termsOfSale;
    private SearchStringField title;
    private SearchBooleanField toBeEmailed;
    private SearchBooleanField toBePrinted;
    private SearchMultiSelectField toSubsidiary;
    private SearchDoubleField totalAmount;
    private SearchStringField trackingNumbers;
    private SearchDoubleField tranCostEstimate;
    private SearchDateField tranDate;
    private SearchDoubleField tranEstGrossProfit;
    private SearchDoubleField tranEstGrossProfitPct;
    private SearchDoubleField tranFxEstGrossProfit;
    private SearchStringField tranId;
    private SearchBooleanField tranIsVsoeBundle;
    private SearchBooleanField transactionDiscount;
    private SearchEnumMultiSelectField transactionLineType;
    private SearchStringField transactionNumber;
    private SearchMultiSelectField transferLocation;
    private SearchDoubleField transferOrderQuantityCommitted;
    private SearchDoubleField transferOrderQuantityPacked;
    private SearchDoubleField transferOrderQuantityPicked;
    private SearchDoubleField transferOrderQuantityReceived;
    private SearchDoubleField transferOrderQuantityShipped;
    private SearchEnumMultiSelectField type;
    private SearchMultiSelectField unit;
    private SearchDoubleField unitCostOverride;
    private SearchMultiSelectField unitsType;
    private SearchMultiSelectField vendType;
    private SearchBooleanField visibleToCustomer;
    private SearchBooleanField voided;
    private SearchDoubleField vsoeAllocation;
    private SearchDoubleField vsoeAmount;
    private SearchEnumMultiSelectField vsoeDeferral;
    private SearchBooleanField vsoeDelivered;
    private SearchEnumMultiSelectField vsoePermitDiscount;
    private SearchDoubleField vsoePrice;
    private SearchMultiSelectField webSite;
    private SearchCustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(TransactionSearchBasic.class, true);

    public SearchMultiSelectField getAccount() {
        return this.account;
    }

    public void setAccount(SearchMultiSelectField account) {
        this.account = account;
    }

    public SearchEnumMultiSelectField getAccountType() {
        return this.accountType;
    }

    public void setAccountType(SearchEnumMultiSelectField accountType) {
        this.accountType = accountType;
    }

    public SearchMultiSelectField getAcctCorpCardExp() {
        return this.acctCorpCardExp;
    }

    public void setAcctCorpCardExp(SearchMultiSelectField acctCorpCardExp) {
        this.acctCorpCardExp = acctCorpCardExp;
    }

    public SearchDateField getActualProductionEndDate() {
        return this.actualProductionEndDate;
    }

    public void setActualProductionEndDate(SearchDateField actualProductionEndDate) {
        this.actualProductionEndDate = actualProductionEndDate;
    }

    public SearchDateField getActualProductionStartDate() {
        return this.actualProductionStartDate;
    }

    public void setActualProductionStartDate(SearchDateField actualProductionStartDate) {
        this.actualProductionStartDate = actualProductionStartDate;
    }

    public SearchDateField getActualShipDate() {
        return this.actualShipDate;
    }

    public void setActualShipDate(SearchDateField actualShipDate) {
        this.actualShipDate = actualShipDate;
    }

    public SearchDoubleField getAltSalesAmount() {
        return this.altSalesAmount;
    }

    public void setAltSalesAmount(SearchDoubleField altSalesAmount) {
        this.altSalesAmount = altSalesAmount;
    }

    public SearchDoubleField getAltSalesNetAmount() {
        return this.altSalesNetAmount;
    }

    public void setAltSalesNetAmount(SearchDoubleField altSalesNetAmount) {
        this.altSalesNetAmount = altSalesNetAmount;
    }

    public SearchDoubleField getAmount() {
        return this.amount;
    }

    public void setAmount(SearchDoubleField amount) {
        this.amount = amount;
    }

    public SearchDoubleField getAmountPaid() {
        return this.amountPaid;
    }

    public void setAmountPaid(SearchDoubleField amountPaid) {
        this.amountPaid = amountPaid;
    }

    public SearchDoubleField getAmountRemaining() {
        return this.amountRemaining;
    }

    public void setAmountRemaining(SearchDoubleField amountRemaining) {
        this.amountRemaining = amountRemaining;
    }

    public SearchDoubleField getAmountUnbilled() {
        return this.amountUnbilled;
    }

    public void setAmountUnbilled(SearchDoubleField amountUnbilled) {
        this.amountUnbilled = amountUnbilled;
    }

    public SearchMultiSelectField getAnyLineItem() {
        return this.anyLineItem;
    }

    public void setAnyLineItem(SearchMultiSelectField anyLineItem) {
        this.anyLineItem = anyLineItem;
    }

    public SearchDoubleField getAppliedToForeignAmount() {
        return this.appliedToForeignAmount;
    }

    public void setAppliedToForeignAmount(SearchDoubleField appliedToForeignAmount) {
        this.appliedToForeignAmount = appliedToForeignAmount;
    }

    public SearchBooleanField getAppliedToIsFxVariance() {
        return this.appliedToIsFxVariance;
    }

    public void setAppliedToIsFxVariance(SearchBooleanField appliedToIsFxVariance) {
        this.appliedToIsFxVariance = appliedToIsFxVariance;
    }

    public SearchDoubleField getAppliedToLinkAmount() {
        return this.appliedToLinkAmount;
    }

    public void setAppliedToLinkAmount(SearchDoubleField appliedToLinkAmount) {
        this.appliedToLinkAmount = appliedToLinkAmount;
    }

    public SearchEnumMultiSelectField getAppliedToLinkType() {
        return this.appliedToLinkType;
    }

    public void setAppliedToLinkType(SearchEnumMultiSelectField appliedToLinkType) {
        this.appliedToLinkType = appliedToLinkType;
    }

    public SearchMultiSelectField getAppliedToTransaction() {
        return this.appliedToTransaction;
    }

    public void setAppliedToTransaction(SearchMultiSelectField appliedToTransaction) {
        this.appliedToTransaction = appliedToTransaction;
    }

    public SearchDoubleField getApplyingForeignAmount() {
        return this.applyingForeignAmount;
    }

    public void setApplyingForeignAmount(SearchDoubleField applyingForeignAmount) {
        this.applyingForeignAmount = applyingForeignAmount;
    }

    public SearchBooleanField getApplyingIsFxVariance() {
        return this.applyingIsFxVariance;
    }

    public void setApplyingIsFxVariance(SearchBooleanField applyingIsFxVariance) {
        this.applyingIsFxVariance = applyingIsFxVariance;
    }

    public SearchDoubleField getApplyingLinkAmount() {
        return this.applyingLinkAmount;
    }

    public void setApplyingLinkAmount(SearchDoubleField applyingLinkAmount) {
        this.applyingLinkAmount = applyingLinkAmount;
    }

    public SearchEnumMultiSelectField getApplyingLinkType() {
        return this.applyingLinkType;
    }

    public void setApplyingLinkType(SearchEnumMultiSelectField applyingLinkType) {
        this.applyingLinkType = applyingLinkType;
    }

    public SearchMultiSelectField getApplyingTransaction() {
        return this.applyingTransaction;
    }

    public void setApplyingTransaction(SearchMultiSelectField applyingTransaction) {
        this.applyingTransaction = applyingTransaction;
    }

    public SearchEnumMultiSelectField getApprovalStatus() {
        return this.approvalStatus;
    }

    public void setApprovalStatus(SearchEnumMultiSelectField approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public SearchStringField getAuthCode() {
        return this.authCode;
    }

    public void setAuthCode(SearchStringField authCode) {
        this.authCode = authCode;
    }

    public SearchBooleanField getAutoCalculateLag() {
        return this.autoCalculateLag;
    }

    public void setAutoCalculateLag(SearchBooleanField autoCalculateLag) {
        this.autoCalculateLag = autoCalculateLag;
    }

    public SearchEnumMultiSelectField getAvsStreetMatch() {
        return this.avsStreetMatch;
    }

    public void setAvsStreetMatch(SearchEnumMultiSelectField avsStreetMatch) {
        this.avsStreetMatch = avsStreetMatch;
    }

    public SearchEnumMultiSelectField getAvsZipMatch() {
        return this.avsZipMatch;
    }

    public void setAvsZipMatch(SearchEnumMultiSelectField avsZipMatch) {
        this.avsZipMatch = avsZipMatch;
    }

    public SearchBooleanField getBillable() {
        return this.billable;
    }

    public void setBillable(SearchBooleanField billable) {
        this.billable = billable;
    }

    public SearchStringField getBillAddress() {
        return this.billAddress;
    }

    public void setBillAddress(SearchStringField billAddress) {
        this.billAddress = billAddress;
    }

    public SearchStringField getBillAddressee() {
        return this.billAddressee;
    }

    public void setBillAddressee(SearchStringField billAddressee) {
        this.billAddressee = billAddressee;
    }

    public SearchStringField getBillAttention() {
        return this.billAttention;
    }

    public void setBillAttention(SearchStringField billAttention) {
        this.billAttention = billAttention;
    }

    public SearchStringField getBillCity() {
        return this.billCity;
    }

    public void setBillCity(SearchStringField billCity) {
        this.billCity = billCity;
    }

    public SearchEnumMultiSelectField getBillCountry() {
        return this.billCountry;
    }

    public void setBillCountry(SearchEnumMultiSelectField billCountry) {
        this.billCountry = billCountry;
    }

    public SearchStringField getBillCounty() {
        return this.billCounty;
    }

    public void setBillCounty(SearchStringField billCounty) {
        this.billCounty = billCounty;
    }

    public SearchDateField getBilledDate() {
        return this.billedDate;
    }

    public void setBilledDate(SearchDateField billedDate) {
        this.billedDate = billedDate;
    }

    public SearchMultiSelectField getBillingAccount() {
        return this.billingAccount;
    }

    public void setBillingAccount(SearchMultiSelectField billingAccount) {
        this.billingAccount = billingAccount;
    }

    public SearchMultiSelectField getBillingSchedule() {
        return this.billingSchedule;
    }

    public void setBillingSchedule(SearchMultiSelectField billingSchedule) {
        this.billingSchedule = billingSchedule;
    }

    public SearchBooleanField getBillingStatus() {
        return this.billingStatus;
    }

    public void setBillingStatus(SearchBooleanField billingStatus) {
        this.billingStatus = billingStatus;
    }

    public SearchMultiSelectField getBillingTransaction() {
        return this.billingTransaction;
    }

    public void setBillingTransaction(SearchMultiSelectField billingTransaction) {
        this.billingTransaction = billingTransaction;
    }

    public SearchStringField getBillPhone() {
        return this.billPhone;
    }

    public void setBillPhone(SearchStringField billPhone) {
        this.billPhone = billPhone;
    }

    public SearchStringField getBillState() {
        return this.billState;
    }

    public void setBillState(SearchStringField billState) {
        this.billState = billState;
    }

    public SearchEnumMultiSelectField getBillVarianceStatus() {
        return this.billVarianceStatus;
    }

    public void setBillVarianceStatus(SearchEnumMultiSelectField billVarianceStatus) {
        this.billVarianceStatus = billVarianceStatus;
    }

    public SearchStringField getBillZip() {
        return this.billZip;
    }

    public void setBillZip(SearchStringField billZip) {
        this.billZip = billZip;
    }

    public SearchStringField getBinNumber() {
        return this.binNumber;
    }

    public void setBinNumber(SearchStringField binNumber) {
        this.binNumber = binNumber;
    }

    public SearchDoubleField getBinNumberQuantity() {
        return this.binNumberQuantity;
    }

    public void setBinNumberQuantity(SearchDoubleField binNumberQuantity) {
        this.binNumberQuantity = binNumberQuantity;
    }

    public SearchDoubleField getBomQuantity() {
        return this.bomQuantity;
    }

    public void setBomQuantity(SearchDoubleField bomQuantity) {
        this.bomQuantity = bomQuantity;
    }

    public SearchBooleanField getBookSpecificTransaction() {
        return this.bookSpecificTransaction;
    }

    public void setBookSpecificTransaction(SearchBooleanField bookSpecificTransaction) {
        this.bookSpecificTransaction = bookSpecificTransaction;
    }

    public SearchBooleanField getBuildEntireAssembly() {
        return this.buildEntireAssembly;
    }

    public void setBuildEntireAssembly(SearchBooleanField buildEntireAssembly) {
        this.buildEntireAssembly = buildEntireAssembly;
    }

    public SearchDoubleField getBuildVariance() {
        return this.buildVariance;
    }

    public void setBuildVariance(SearchDoubleField buildVariance) {
        this.buildVariance = buildVariance;
    }

    public SearchDoubleField getBuilt() {
        return this.built;
    }

    public void setBuilt(SearchDoubleField built) {
        this.built = built;
    }

    public SearchBooleanField getCanHaveStackablePromotions() {
        return this.canHaveStackablePromotions;
    }

    public void setCanHaveStackablePromotions(SearchBooleanField canHaveStackablePromotions) {
        this.canHaveStackablePromotions = canHaveStackablePromotions;
    }

    public SearchMultiSelectField getCatchUpPeriod() {
        return this.catchUpPeriod;
    }

    public void setCatchUpPeriod(SearchMultiSelectField catchUpPeriod) {
        this.catchUpPeriod = catchUpPeriod;
    }

    public SearchStringField getCcCustomerCode() {
        return this.ccCustomerCode;
    }

    public void setCcCustomerCode(SearchStringField ccCustomerCode) {
        this.ccCustomerCode = ccCustomerCode;
    }

    public SearchDateField getCcExpireDate() {
        return this.ccExpireDate;
    }

    public void setCcExpireDate(SearchDateField ccExpireDate) {
        this.ccExpireDate = ccExpireDate;
    }

    public SearchStringField getCcName() {
        return this.ccName;
    }

    public void setCcName(SearchStringField ccName) {
        this.ccName = ccName;
    }

    public SearchStringField getCcNumber() {
        return this.ccNumber;
    }

    public void setCcNumber(SearchStringField ccNumber) {
        this.ccNumber = ccNumber;
    }

    public SearchEnumMultiSelectField getChargeType() {
        return this.chargeType;
    }

    public void setChargeType(SearchEnumMultiSelectField chargeType) {
        this.chargeType = chargeType;
    }

    public SearchMultiSelectField get_class() {
        return this._class;
    }

    public void set_class(SearchMultiSelectField _class) {
        this._class = _class;
    }

    public SearchBooleanField getCleared() {
        return this.cleared;
    }

    public void setCleared(SearchBooleanField cleared) {
        this.cleared = cleared;
    }

    public SearchBooleanField getClosed() {
        return this.closed;
    }

    public void setClosed(SearchBooleanField closed) {
        this.closed = closed;
    }

    public SearchDateField getCloseDate() {
        return this.closeDate;
    }

    public void setCloseDate(SearchDateField closeDate) {
        this.closeDate = closeDate;
    }

    public SearchBooleanField getCogs() {
        return this.cogs;
    }

    public void setCogs(SearchBooleanField cogs) {
        this.cogs = cogs;
    }

    public SearchDateField getCommissionEffectiveDate() {
        return this.commissionEffectiveDate;
    }

    public void setCommissionEffectiveDate(SearchDateField commissionEffectiveDate) {
        this.commissionEffectiveDate = commissionEffectiveDate;
    }

    public SearchEnumMultiSelectField getCommit() {
        return this.commit;
    }

    public void setCommit(SearchEnumMultiSelectField commit) {
        this.commit = commit;
    }

    public SearchDoubleField getComponentYield() {
        return this.componentYield;
    }

    public void setComponentYield(SearchDoubleField componentYield) {
        this.componentYield = componentYield;
    }

    public SearchStringField getConfirmationNumber() {
        return this.confirmationNumber;
    }

    public void setConfirmationNumber(SearchStringField confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }

    public SearchLongField getContribution() {
        return this.contribution;
    }

    public void setContribution(SearchLongField contribution) {
        this.contribution = contribution;
    }

    public SearchDoubleField getCostComponentAmount() {
        return this.costComponentAmount;
    }

    public void setCostComponentAmount(SearchDoubleField costComponentAmount) {
        this.costComponentAmount = costComponentAmount;
    }

    public SearchMultiSelectField getCostComponentCategory() {
        return this.costComponentCategory;
    }

    public void setCostComponentCategory(SearchMultiSelectField costComponentCategory) {
        this.costComponentCategory = costComponentCategory;
    }

    public SearchMultiSelectField getCostComponentItem() {
        return this.costComponentItem;
    }

    public void setCostComponentItem(SearchMultiSelectField costComponentItem) {
        this.costComponentItem = costComponentItem;
    }

    public SearchDoubleField getCostComponentQuantity() {
        return this.costComponentQuantity;
    }

    public void setCostComponentQuantity(SearchDoubleField costComponentQuantity) {
        this.costComponentQuantity = costComponentQuantity;
    }

    public SearchDoubleField getCostComponentStandardCost() {
        return this.costComponentStandardCost;
    }

    public void setCostComponentStandardCost(SearchDoubleField costComponentStandardCost) {
        this.costComponentStandardCost = costComponentStandardCost;
    }

    public SearchDoubleField getCostEstimate() {
        return this.costEstimate;
    }

    public void setCostEstimate(SearchDoubleField costEstimate) {
        this.costEstimate = costEstimate;
    }

    public SearchDoubleField getCostEstimateRate() {
        return this.costEstimateRate;
    }

    public void setCostEstimateRate(SearchDoubleField costEstimateRate) {
        this.costEstimateRate = costEstimateRate;
    }

    public SearchEnumMultiSelectField getCostEstimateType() {
        return this.costEstimateType;
    }

    public void setCostEstimateType(SearchEnumMultiSelectField costEstimateType) {
        this.costEstimateType = costEstimateType;
    }

    public SearchMultiSelectField getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(SearchMultiSelectField createdBy) {
        this.createdBy = createdBy;
    }

    public SearchMultiSelectField getCreatedFrom() {
        return this.createdFrom;
    }

    public void setCreatedFrom(SearchMultiSelectField createdFrom) {
        this.createdFrom = createdFrom;
    }

    public SearchDoubleField getCreditAmount() {
        return this.creditAmount;
    }

    public void setCreditAmount(SearchDoubleField creditAmount) {
        this.creditAmount = creditAmount;
    }

    public SearchEnumMultiSelectField getCscMatch() {
        return this.cscMatch;
    }

    public void setCscMatch(SearchEnumMultiSelectField cscMatch) {
        this.cscMatch = cscMatch;
    }

    public SearchMultiSelectField getCurrency() {
        return this.currency;
    }

    public void setCurrency(SearchMultiSelectField currency) {
        this.currency = currency;
    }

    public SearchMultiSelectField getCustomerSubOf() {
        return this.customerSubOf;
    }

    public void setCustomerSubOf(SearchMultiSelectField customerSubOf) {
        this.customerSubOf = customerSubOf;
    }

    public SearchMultiSelectField getCustomForm() {
        return this.customForm;
    }

    public void setCustomForm(SearchMultiSelectField customForm) {
        this.customForm = customForm;
    }

    public SearchBooleanField getCustomGL() {
        return this.customGL;
    }

    public void setCustomGL(SearchBooleanField customGL) {
        this.customGL = customGL;
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

    public SearchLongField getDaysOverdue() {
        return this.daysOverdue;
    }

    public void setDaysOverdue(SearchLongField daysOverdue) {
        this.daysOverdue = daysOverdue;
    }

    public SearchDoubleField getDebitAmount() {
        return this.debitAmount;
    }

    public void setDebitAmount(SearchDoubleField debitAmount) {
        this.debitAmount = debitAmount;
    }

    public SearchDoubleField getDeferredRevenue() {
        return this.deferredRevenue;
    }

    public void setDeferredRevenue(SearchDoubleField deferredRevenue) {
        this.deferredRevenue = deferredRevenue;
    }

    public SearchBooleanField getDeferRevRec() {
        return this.deferRevRec;
    }

    public void setDeferRevRec(SearchBooleanField deferRevRec) {
        this.deferRevRec = deferRevRec;
    }

    public SearchMultiSelectField getDepartment() {
        return this.department;
    }

    public void setDepartment(SearchMultiSelectField department) {
        this.department = department;
    }

    public SearchDateField getDepositDate() {
        return this.depositDate;
    }

    public void setDepositDate(SearchDateField depositDate) {
        this.depositDate = depositDate;
    }

    public SearchMultiSelectField getDepositTransaction() {
        return this.depositTransaction;
    }

    public void setDepositTransaction(SearchMultiSelectField depositTransaction) {
        this.depositTransaction = depositTransaction;
    }

    public SearchMultiSelectField getDrAccount() {
        return this.drAccount;
    }

    public void setDrAccount(SearchMultiSelectField drAccount) {
        this.drAccount = drAccount;
    }

    public SearchDateField getDueDate() {
        return this.dueDate;
    }

    public void setDueDate(SearchDateField dueDate) {
        this.dueDate = dueDate;
    }

    public SearchStringField getEmail() {
        return this.email;
    }

    public void setEmail(SearchStringField email) {
        this.email = email;
    }

    public SearchMultiSelectField getEmployee() {
        return this.employee;
    }

    public void setEmployee(SearchMultiSelectField employee) {
        this.employee = employee;
    }

    public SearchDateField getEndDate() {
        return this.endDate;
    }

    public void setEndDate(SearchDateField endDate) {
        this.endDate = endDate;
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

    public SearchDoubleField getEstGrossProfit() {
        return this.estGrossProfit;
    }

    public void setEstGrossProfit(SearchDoubleField estGrossProfit) {
        this.estGrossProfit = estGrossProfit;
    }

    public SearchDoubleField getEstGrossProfitPct() {
        return this.estGrossProfitPct;
    }

    public void setEstGrossProfitPct(SearchDoubleField estGrossProfitPct) {
        this.estGrossProfitPct = estGrossProfitPct;
    }

    public SearchDoubleField getExchangeRate() {
        return this.exchangeRate;
    }

    public void setExchangeRate(SearchDoubleField exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public SearchBooleanField getExcludeCommission() {
        return this.excludeCommission;
    }

    public void setExcludeCommission(SearchBooleanField excludeCommission) {
        this.excludeCommission = excludeCommission;
    }

    public SearchBooleanField getExcludeFromRateRequest() {
        return this.excludeFromRateRequest;
    }

    public void setExcludeFromRateRequest(SearchBooleanField excludeFromRateRequest) {
        this.excludeFromRateRequest = excludeFromRateRequest;
    }

    public SearchDateField getExpectedCloseDate() {
        return this.expectedCloseDate;
    }

    public void setExpectedCloseDate(SearchDateField expectedCloseDate) {
        this.expectedCloseDate = expectedCloseDate;
    }

    public SearchDateField getExpectedReceiptDate() {
        return this.expectedReceiptDate;
    }

    public void setExpectedReceiptDate(SearchDateField expectedReceiptDate) {
        this.expectedReceiptDate = expectedReceiptDate;
    }

    public SearchMultiSelectField getExpenseCategory() {
        return this.expenseCategory;
    }

    public void setExpenseCategory(SearchMultiSelectField expenseCategory) {
        this.expenseCategory = expenseCategory;
    }

    public SearchDateField getExpenseDate() {
        return this.expenseDate;
    }

    public void setExpenseDate(SearchDateField expenseDate) {
        this.expenseDate = expenseDate;
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

    public SearchBooleanField getFinChrg() {
        return this.finChrg;
    }

    public void setFinChrg(SearchBooleanField finChrg) {
        this.finChrg = finChrg;
    }

    public SearchBooleanField getFirmed() {
        return this.firmed;
    }

    public void setFirmed(SearchBooleanField firmed) {
        this.firmed = firmed;
    }

    public SearchEnumMultiSelectField getForecastType() {
        return this.forecastType;
    }

    public void setForecastType(SearchEnumMultiSelectField forecastType) {
        this.forecastType = forecastType;
    }

    public SearchMultiSelectField getFulfillingTransaction() {
        return this.fulfillingTransaction;
    }

    public void setFulfillingTransaction(SearchMultiSelectField fulfillingTransaction) {
        this.fulfillingTransaction = fulfillingTransaction;
    }

    public SearchMultiSelectField getFxAccount() {
        return this.fxAccount;
    }

    public void setFxAccount(SearchMultiSelectField fxAccount) {
        this.fxAccount = fxAccount;
    }

    public SearchDoubleField getFxAmount() {
        return this.fxAmount;
    }

    public void setFxAmount(SearchDoubleField fxAmount) {
        this.fxAmount = fxAmount;
    }

    public SearchDoubleField getFxCostEstimate() {
        return this.fxCostEstimate;
    }

    public void setFxCostEstimate(SearchDoubleField fxCostEstimate) {
        this.fxCostEstimate = fxCostEstimate;
    }

    public SearchDoubleField getFxCostEstimateRate() {
        return this.fxCostEstimateRate;
    }

    public void setFxCostEstimateRate(SearchDoubleField fxCostEstimateRate) {
        this.fxCostEstimateRate = fxCostEstimateRate;
    }

    public SearchDoubleField getFxEstGrossProfit() {
        return this.fxEstGrossProfit;
    }

    public void setFxEstGrossProfit(SearchDoubleField fxEstGrossProfit) {
        this.fxEstGrossProfit = fxEstGrossProfit;
    }

    public SearchDoubleField getFxTranCostEstimate() {
        return this.fxTranCostEstimate;
    }

    public void setFxTranCostEstimate(SearchDoubleField fxTranCostEstimate) {
        this.fxTranCostEstimate = fxTranCostEstimate;
    }

    public SearchDoubleField getFxVsoeAllocation() {
        return this.fxVsoeAllocation;
    }

    public void setFxVsoeAllocation(SearchDoubleField fxVsoeAllocation) {
        this.fxVsoeAllocation = fxVsoeAllocation;
    }

    public SearchDoubleField getFxVsoeAmount() {
        return this.fxVsoeAmount;
    }

    public void setFxVsoeAmount(SearchDoubleField fxVsoeAmount) {
        this.fxVsoeAmount = fxVsoeAmount;
    }

    public SearchDoubleField getFxVsoePrice() {
        return this.fxVsoePrice;
    }

    public void setFxVsoePrice(SearchDoubleField fxVsoePrice) {
        this.fxVsoePrice = fxVsoePrice;
    }

    public SearchBooleanField getGcoAvailabelToCharge() {
        return this.gcoAvailabelToCharge;
    }

    public void setGcoAvailabelToCharge(SearchBooleanField gcoAvailabelToCharge) {
        this.gcoAvailabelToCharge = gcoAvailabelToCharge;
    }

    public SearchBooleanField getGcoAvailableToRefund() {
        return this.gcoAvailableToRefund;
    }

    public void setGcoAvailableToRefund(SearchBooleanField gcoAvailableToRefund) {
        this.gcoAvailableToRefund = gcoAvailableToRefund;
    }

    public SearchEnumMultiSelectField getGcoAvsStreetMatch() {
        return this.gcoAvsStreetMatch;
    }

    public void setGcoAvsStreetMatch(SearchEnumMultiSelectField gcoAvsStreetMatch) {
        this.gcoAvsStreetMatch = gcoAvsStreetMatch;
    }

    public SearchEnumMultiSelectField getGcoAvsZipMatch() {
        return this.gcoAvsZipMatch;
    }

    public void setGcoAvsZipMatch(SearchEnumMultiSelectField gcoAvsZipMatch) {
        this.gcoAvsZipMatch = gcoAvsZipMatch;
    }

    public SearchLongField getGcoBuyerAccountAge() {
        return this.gcoBuyerAccountAge;
    }

    public void setGcoBuyerAccountAge(SearchLongField gcoBuyerAccountAge) {
        this.gcoBuyerAccountAge = gcoBuyerAccountAge;
    }

    public SearchStringField getGcoBuyerIp() {
        return this.gcoBuyerIp;
    }

    public void setGcoBuyerIp(SearchStringField gcoBuyerIp) {
        this.gcoBuyerIp = gcoBuyerIp;
    }

    public SearchDoubleField getGcoChargeAmount() {
        return this.gcoChargeAmount;
    }

    public void setGcoChargeAmount(SearchDoubleField gcoChargeAmount) {
        this.gcoChargeAmount = gcoChargeAmount;
    }

    public SearchDoubleField getGcoChargebackAmount() {
        return this.gcoChargebackAmount;
    }

    public void setGcoChargebackAmount(SearchDoubleField gcoChargebackAmount) {
        this.gcoChargebackAmount = gcoChargebackAmount;
    }

    public SearchDoubleField getGcoConfirmedChargedTotal() {
        return this.gcoConfirmedChargedTotal;
    }

    public void setGcoConfirmedChargedTotal(SearchDoubleField gcoConfirmedChargedTotal) {
        this.gcoConfirmedChargedTotal = gcoConfirmedChargedTotal;
    }

    public SearchDoubleField getGcoConfirmedRefundedTotal() {
        return this.gcoConfirmedRefundedTotal;
    }

    public void setGcoConfirmedRefundedTotal(SearchDoubleField gcoConfirmedRefundedTotal) {
        this.gcoConfirmedRefundedTotal = gcoConfirmedRefundedTotal;
    }

    public SearchStringField getGcoCreditcardNumber() {
        return this.gcoCreditcardNumber;
    }

    public void setGcoCreditcardNumber(SearchStringField gcoCreditcardNumber) {
        this.gcoCreditcardNumber = gcoCreditcardNumber;
    }

    public SearchEnumMultiSelectField getGcoCscMatch() {
        return this.gcoCscMatch;
    }

    public void setGcoCscMatch(SearchEnumMultiSelectField gcoCscMatch) {
        this.gcoCscMatch = gcoCscMatch;
    }

    public SearchStringField getGcoFinancialState() {
        return this.gcoFinancialState;
    }

    public void setGcoFinancialState(SearchStringField gcoFinancialState) {
        this.gcoFinancialState = gcoFinancialState;
    }

    public SearchStringField getGcoFulfillmentState() {
        return this.gcoFulfillmentState;
    }

    public void setGcoFulfillmentState(SearchStringField gcoFulfillmentState) {
        this.gcoFulfillmentState = gcoFulfillmentState;
    }

    public SearchStringField getGcoOrderId() {
        return this.gcoOrderId;
    }

    public void setGcoOrderId(SearchStringField gcoOrderId) {
        this.gcoOrderId = gcoOrderId;
    }

    public SearchDoubleField getGcoOrderTotal() {
        return this.gcoOrderTotal;
    }

    public void setGcoOrderTotal(SearchDoubleField gcoOrderTotal) {
        this.gcoOrderTotal = gcoOrderTotal;
    }

    public SearchDoubleField getGcoPromotionAmount() {
        return this.gcoPromotionAmount;
    }

    public void setGcoPromotionAmount(SearchDoubleField gcoPromotionAmount) {
        this.gcoPromotionAmount = gcoPromotionAmount;
    }

    public SearchStringField getGcoPromotionName() {
        return this.gcoPromotionName;
    }

    public void setGcoPromotionName(SearchStringField gcoPromotionName) {
        this.gcoPromotionName = gcoPromotionName;
    }

    public SearchDoubleField getGcoRefundAmount() {
        return this.gcoRefundAmount;
    }

    public void setGcoRefundAmount(SearchDoubleField gcoRefundAmount) {
        this.gcoRefundAmount = gcoRefundAmount;
    }

    public SearchDoubleField getGcoShippingTotal() {
        return this.gcoShippingTotal;
    }

    public void setGcoShippingTotal(SearchDoubleField gcoShippingTotal) {
        this.gcoShippingTotal = gcoShippingTotal;
    }

    public SearchStringField getGcoStateChangedDetail() {
        return this.gcoStateChangedDetail;
    }

    public void setGcoStateChangedDetail(SearchStringField gcoStateChangedDetail) {
        this.gcoStateChangedDetail = gcoStateChangedDetail;
    }

    public SearchStringField getGiftCertificate() {
        return this.giftCertificate;
    }

    public void setGiftCertificate(SearchStringField giftCertificate) {
        this.giftCertificate = giftCertificate;
    }

    public SearchDoubleField getGrossAmount() {
        return this.grossAmount;
    }

    public void setGrossAmount(SearchDoubleField grossAmount) {
        this.grossAmount = grossAmount;
    }

    public SearchBooleanField getIncludeInForecast() {
        return this.includeInForecast;
    }

    public void setIncludeInForecast(SearchBooleanField includeInForecast) {
        this.includeInForecast = includeInForecast;
    }

    public SearchMultiSelectField getIncoterm() {
        return this.incoterm;
    }

    public void setIncoterm(SearchMultiSelectField incoterm) {
        this.incoterm = incoterm;
    }

    public SearchEnumMultiSelectField getIntercoStatus() {
        return this.intercoStatus;
    }

    public void setIntercoStatus(SearchEnumMultiSelectField intercoStatus) {
        this.intercoStatus = intercoStatus;
    }

    public SearchMultiSelectField getIntercoTransaction() {
        return this.intercoTransaction;
    }

    public void setIntercoTransaction(SearchMultiSelectField intercoTransaction) {
        this.intercoTransaction = intercoTransaction;
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

    public SearchMultiSelectField getInventoryLocation() {
        return this.inventoryLocation;
    }

    public void setInventoryLocation(SearchMultiSelectField inventoryLocation) {
        this.inventoryLocation = inventoryLocation;
    }

    public SearchMultiSelectField getInventorySubsidiary() {
        return this.inventorySubsidiary;
    }

    public void setInventorySubsidiary(SearchMultiSelectField inventorySubsidiary) {
        this.inventorySubsidiary = inventorySubsidiary;
    }

    public SearchBooleanField getInVsoeBundle() {
        return this.inVsoeBundle;
    }

    public void setInVsoeBundle(SearchBooleanField inVsoeBundle) {
        this.inVsoeBundle = inVsoeBundle;
    }

    public SearchBooleanField getIsAllocation() {
        return this.isAllocation;
    }

    public void setIsAllocation(SearchBooleanField isAllocation) {
        this.isAllocation = isAllocation;
    }

    public SearchBooleanField getIsBackflush() {
        return this.isBackflush;
    }

    public void setIsBackflush(SearchBooleanField isBackflush) {
        this.isBackflush = isBackflush;
    }

    public SearchBooleanField getIsGcoChargeback() {
        return this.isGcoChargeback;
    }

    public void setIsGcoChargeback(SearchBooleanField isGcoChargeback) {
        this.isGcoChargeback = isGcoChargeback;
    }

    public SearchBooleanField getIsGcoChargeConfirmed() {
        return this.isGcoChargeConfirmed;
    }

    public void setIsGcoChargeConfirmed(SearchBooleanField isGcoChargeConfirmed) {
        this.isGcoChargeConfirmed = isGcoChargeConfirmed;
    }

    public SearchBooleanField getIsGcoPaymentGuaranteed() {
        return this.isGcoPaymentGuaranteed;
    }

    public void setIsGcoPaymentGuaranteed(SearchBooleanField isGcoPaymentGuaranteed) {
        this.isGcoPaymentGuaranteed = isGcoPaymentGuaranteed;
    }

    public SearchBooleanField getIsGcoRefundConfirmed() {
        return this.isGcoRefundConfirmed;
    }

    public void setIsGcoRefundConfirmed(SearchBooleanField isGcoRefundConfirmed) {
        this.isGcoRefundConfirmed = isGcoRefundConfirmed;
    }

    public SearchBooleanField getIsInsideDelivery() {
        return this.isInsideDelivery;
    }

    public void setIsInsideDelivery(SearchBooleanField isInsideDelivery) {
        this.isInsideDelivery = isInsideDelivery;
    }

    public SearchBooleanField getIsInsidePickup() {
        return this.isInsidePickup;
    }

    public void setIsInsidePickup(SearchBooleanField isInsidePickup) {
        this.isInsidePickup = isInsidePickup;
    }

    public SearchBooleanField getIsIntercompanyAdjustment() {
        return this.isIntercompanyAdjustment;
    }

    public void setIsIntercompanyAdjustment(SearchBooleanField isIntercompanyAdjustment) {
        this.isIntercompanyAdjustment = isIntercompanyAdjustment;
    }

    public SearchBooleanField getIsInTransitPayment() {
        return this.isInTransitPayment;
    }

    public void setIsInTransitPayment(SearchBooleanField isInTransitPayment) {
        this.isInTransitPayment = isInTransitPayment;
    }

    public SearchBooleanField getIsMultiShipTo() {
        return this.isMultiShipTo;
    }

    public void setIsMultiShipTo(SearchBooleanField isMultiShipTo) {
        this.isMultiShipTo = isMultiShipTo;
    }

    public SearchBooleanField getIsPayPalMeth() {
        return this.isPayPalMeth;
    }

    public void setIsPayPalMeth(SearchBooleanField isPayPalMeth) {
        this.isPayPalMeth = isPayPalMeth;
    }

    public SearchBooleanField getIsReversal() {
        return this.isReversal;
    }

    public void setIsReversal(SearchBooleanField isReversal) {
        this.isReversal = isReversal;
    }

    public SearchBooleanField getIsRevRecTransaction() {
        return this.isRevRecTransaction;
    }

    public void setIsRevRecTransaction(SearchBooleanField isRevRecTransaction) {
        this.isRevRecTransaction = isRevRecTransaction;
    }

    public SearchBooleanField getIsScrap() {
        return this.isScrap;
    }

    public void setIsScrap(SearchBooleanField isScrap) {
        this.isScrap = isScrap;
    }

    public SearchBooleanField getIsShipAddress() {
        return this.isShipAddress;
    }

    public void setIsShipAddress(SearchBooleanField isShipAddress) {
        this.isShipAddress = isShipAddress;
    }

    public SearchBooleanField getIsTransferPriceCosting() {
        return this.isTransferPriceCosting;
    }

    public void setIsTransferPriceCosting(SearchBooleanField isTransferPriceCosting) {
        this.isTransferPriceCosting = isTransferPriceCosting;
    }

    public SearchBooleanField getIsVsoeAlloc() {
        return this.isVsoeAlloc;
    }

    public void setIsVsoeAlloc(SearchBooleanField isVsoeAlloc) {
        this.isVsoeAlloc = isVsoeAlloc;
    }

    public SearchBooleanField getIsWip() {
        return this.isWip;
    }

    public void setIsWip(SearchBooleanField isWip) {
        this.isWip = isWip;
    }

    public SearchMultiSelectField getItem() {
        return this.item;
    }

    public void setItem(SearchMultiSelectField item) {
        this.item = item;
    }

    public SearchEnumMultiSelectField getItemFulfillmentChoice() {
        return this.itemFulfillmentChoice;
    }

    public void setItemFulfillmentChoice(SearchEnumMultiSelectField itemFulfillmentChoice) {
        this.itemFulfillmentChoice = itemFulfillmentChoice;
    }

    public SearchMultiSelectField getItemRevision() {
        return this.itemRevision;
    }

    public void setItemRevision(SearchMultiSelectField itemRevision) {
        this.itemRevision = itemRevision;
    }

    public SearchMultiSelectField getItemSubOf() {
        return this.itemSubOf;
    }

    public void setItemSubOf(SearchMultiSelectField itemSubOf) {
        this.itemSubOf = itemSubOf;
    }

    public SearchBooleanField getLandedCostPerLine() {
        return this.landedCostPerLine;
    }

    public void setLandedCostPerLine(SearchBooleanField landedCostPerLine) {
        this.landedCostPerLine = landedCostPerLine;
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

    public SearchLongField getLineUniqueKey() {
        return this.lineUniqueKey;
    }

    public void setLineUniqueKey(SearchLongField lineUniqueKey) {
        this.lineUniqueKey = lineUniqueKey;
    }

    public SearchMultiSelectField getLocation() {
        return this.location;
    }

    public void setLocation(SearchMultiSelectField location) {
        this.location = location;
    }

    public SearchBooleanField getLocationAutoAssigned() {
        return this.locationAutoAssigned;
    }

    public void setLocationAutoAssigned(SearchBooleanField locationAutoAssigned) {
        this.locationAutoAssigned = locationAutoAssigned;
    }

    public SearchBooleanField getMainLine() {
        return this.mainLine;
    }

    public void setMainLine(SearchBooleanField mainLine) {
        this.mainLine = mainLine;
    }

    public SearchMultiSelectField getMainName() {
        return this.mainName;
    }

    public void setMainName(SearchMultiSelectField mainName) {
        this.mainName = mainName;
    }

    public SearchMultiSelectField getManufacturingRouting() {
        return this.manufacturingRouting;
    }

    public void setManufacturingRouting(SearchMultiSelectField manufacturingRouting) {
        this.manufacturingRouting = manufacturingRouting;
    }

    public SearchBooleanField getMatchBillToReceipt() {
        return this.matchBillToReceipt;
    }

    public void setMatchBillToReceipt(SearchBooleanField matchBillToReceipt) {
        this.matchBillToReceipt = matchBillToReceipt;
    }

    public SearchStringField getMemo() {
        return this.memo;
    }

    public void setMemo(SearchStringField memo) {
        this.memo = memo;
    }

    public SearchStringField getMemoMain() {
        return this.memoMain;
    }

    public void setMemoMain(SearchStringField memoMain) {
        this.memoMain = memoMain;
    }

    public SearchBooleanField getMemorized() {
        return this.memorized;
    }

    public void setMemorized(SearchBooleanField memorized) {
        this.memorized = memorized;
    }

    public SearchStringField getMerchantAccount() {
        return this.merchantAccount;
    }

    public void setMerchantAccount(SearchStringField merchantAccount) {
        this.merchantAccount = merchantAccount;
    }

    public SearchStringField getMessage() {
        return this.message;
    }

    public void setMessage(SearchStringField message) {
        this.message = message;
    }

    public SearchBooleanField getMultiSubsidiary() {
        return this.multiSubsidiary;
    }

    public void setMultiSubsidiary(SearchBooleanField multiSubsidiary) {
        this.multiSubsidiary = multiSubsidiary;
    }

    public SearchStringField getNameText() {
        return this.nameText;
    }

    public void setNameText(SearchStringField nameText) {
        this.nameText = nameText;
    }

    public SearchDoubleField getNetAmount() {
        return this.netAmount;
    }

    public void setNetAmount(SearchDoubleField netAmount) {
        this.netAmount = netAmount;
    }

    public SearchMultiSelectField getNextApprover() {
        return this.nextApprover;
    }

    public void setNextApprover(SearchMultiSelectField nextApprover) {
        this.nextApprover = nextApprover;
    }

    public SearchDateField getNextBillDate() {
        return this.nextBillDate;
    }

    public void setNextBillDate(SearchDateField nextBillDate) {
        this.nextBillDate = nextBillDate;
    }

    public SearchMultiSelectField getNexus() {
        return this.nexus;
    }

    public void setNexus(SearchMultiSelectField nexus) {
        this.nexus = nexus;
    }

    public SearchBooleanField getNoAutoAssignLocation() {
        return this.noAutoAssignLocation;
    }

    public void setNoAutoAssignLocation(SearchBooleanField noAutoAssignLocation) {
        this.noAutoAssignLocation = noAutoAssignLocation;
    }

    public SearchBooleanField getNonReimbursable() {
        return this.nonReimbursable;
    }

    public void setNonReimbursable(SearchBooleanField nonReimbursable) {
        this.nonReimbursable = nonReimbursable;
    }

    public SearchLongField getNumber() {
        return this.number;
    }

    public void setNumber(SearchLongField number) {
        this.number = number;
    }

    public SearchDoubleField getOneTimeTotal() {
        return this.oneTimeTotal;
    }

    public void setOneTimeTotal(SearchDoubleField oneTimeTotal) {
        this.oneTimeTotal = oneTimeTotal;
    }

    public SearchMultiSelectField getOpportunity() {
        return this.opportunity;
    }

    public void setOpportunity(SearchMultiSelectField opportunity) {
        this.opportunity = opportunity;
    }

    public SearchMultiSelectField getOrderAllocationStrategy() {
        return this.orderAllocationStrategy;
    }

    public void setOrderAllocationStrategy(SearchMultiSelectField orderAllocationStrategy) {
        this.orderAllocationStrategy = orderAllocationStrategy;
    }

    public SearchDoubleField getOrderPriority() {
        return this.orderPriority;
    }

    public void setOrderPriority(SearchDoubleField orderPriority) {
        this.orderPriority = orderPriority;
    }

    public SearchTextNumberField getOtherRefNum() {
        return this.otherRefNum;
    }

    public void setOtherRefNum(SearchTextNumberField otherRefNum) {
        this.otherRefNum = otherRefNum;
    }

    public SearchTextNumberField getOtherRefNumNonDeposit() {
        return this.otherRefNumNonDeposit;
    }

    public void setOtherRefNumNonDeposit(SearchTextNumberField otherRefNumNonDeposit) {
        this.otherRefNumNonDeposit = otherRefNumNonDeposit;
    }

    public SearchMultiSelectField getOverheadParentItem() {
        return this.overheadParentItem;
    }

    public void setOverheadParentItem(SearchMultiSelectField overheadParentItem) {
        this.overheadParentItem = overheadParentItem;
    }

    public SearchBooleanField getOverrideInstallments() {
        return this.overrideInstallments;
    }

    public void setOverrideInstallments(SearchBooleanField overrideInstallments) {
        this.overrideInstallments = overrideInstallments;
    }

    public SearchLongField getPackageCount() {
        return this.packageCount;
    }

    public void setPackageCount(SearchLongField packageCount) {
        this.packageCount = packageCount;
    }

    public SearchMultiSelectField getPaidTransaction() {
        return this.paidTransaction;
    }

    public void setPaidTransaction(SearchMultiSelectField paidTransaction) {
        this.paidTransaction = paidTransaction;
    }

    public SearchLongField getParent() {
        return this.parent;
    }

    public void setParent(SearchLongField parent) {
        this.parent = parent;
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

    public SearchMultiSelectField getPayingTransaction() {
        return this.payingTransaction;
    }

    public void setPayingTransaction(SearchMultiSelectField payingTransaction) {
        this.payingTransaction = payingTransaction;
    }

    public SearchBooleanField getPaymentApproved() {
        return this.paymentApproved;
    }

    public void setPaymentApproved(SearchBooleanField paymentApproved) {
        this.paymentApproved = paymentApproved;
    }

    public SearchDateField getPaymentEventDate() {
        return this.paymentEventDate;
    }

    public void setPaymentEventDate(SearchDateField paymentEventDate) {
        this.paymentEventDate = paymentEventDate;
    }

    public SearchEnumMultiSelectField getPaymentEventHoldReason() {
        return this.paymentEventHoldReason;
    }

    public void setPaymentEventHoldReason(SearchEnumMultiSelectField paymentEventHoldReason) {
        this.paymentEventHoldReason = paymentEventHoldReason;
    }

    public SearchBooleanField getPaymentEventPurchaseCardUsed() {
        return this.paymentEventPurchaseCardUsed;
    }

    public void setPaymentEventPurchaseCardUsed(SearchBooleanField paymentEventPurchaseCardUsed) {
        this.paymentEventPurchaseCardUsed = paymentEventPurchaseCardUsed;
    }

    public SearchBooleanField getPaymentEventPurchaseDataSent() {
        return this.paymentEventPurchaseDataSent;
    }

    public void setPaymentEventPurchaseDataSent(SearchBooleanField paymentEventPurchaseDataSent) {
        this.paymentEventPurchaseDataSent = paymentEventPurchaseDataSent;
    }

    public SearchEnumMultiSelectField getPaymentEventResult() {
        return this.paymentEventResult;
    }

    public void setPaymentEventResult(SearchEnumMultiSelectField paymentEventResult) {
        this.paymentEventResult = paymentEventResult;
    }

    public SearchEnumMultiSelectField getPaymentEventType() {
        return this.paymentEventType;
    }

    public void setPaymentEventType(SearchEnumMultiSelectField paymentEventType) {
        this.paymentEventType = paymentEventType;
    }

    public SearchBooleanField getPaymentHold() {
        return this.paymentHold;
    }

    public void setPaymentHold(SearchBooleanField paymentHold) {
        this.paymentHold = paymentHold;
    }

    public SearchMultiSelectField getPaymentMethod() {
        return this.paymentMethod;
    }

    public void setPaymentMethod(SearchMultiSelectField paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public SearchStringField getPaymentOption() {
        return this.paymentOption;
    }

    public void setPaymentOption(SearchStringField paymentOption) {
        this.paymentOption = paymentOption;
    }

    public SearchBooleanField getPayPalPending() {
        return this.payPalPending;
    }

    public void setPayPalPending(SearchBooleanField payPalPending) {
        this.payPalPending = payPalPending;
    }

    public SearchStringField getPayPalStatus() {
        return this.payPalStatus;
    }

    public void setPayPalStatus(SearchStringField payPalStatus) {
        this.payPalStatus = payPalStatus;
    }

    public SearchStringField getPayPalTranId() {
        return this.payPalTranId;
    }

    public void setPayPalTranId(SearchStringField payPalTranId) {
        this.payPalTranId = payPalTranId;
    }

    public SearchStringField getPnRefNum() {
        return this.pnRefNum;
    }

    public void setPnRefNum(SearchStringField pnRefNum) {
        this.pnRefNum = pnRefNum;
    }

    public SearchStringField getPoAsText() {
        return this.poAsText;
    }

    public void setPoAsText(SearchStringField poAsText) {
        this.poAsText = poAsText;
    }

    public SearchBooleanField getPolicyViolated() {
        return this.policyViolated;
    }

    public void setPolicyViolated(SearchBooleanField policyViolated) {
        this.policyViolated = policyViolated;
    }

    public SearchBooleanField getPosting() {
        return this.posting;
    }

    public void setPosting(SearchBooleanField posting) {
        this.posting = posting;
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

    public SearchMultiSelectField getPriceLevel() {
        return this.priceLevel;
    }

    public void setPriceLevel(SearchMultiSelectField priceLevel) {
        this.priceLevel = priceLevel;
    }

    public SearchBooleanField getPrintedPickingTicket() {
        return this.printedPickingTicket;
    }

    public void setPrintedPickingTicket(SearchBooleanField printedPickingTicket) {
        this.printedPickingTicket = printedPickingTicket;
    }

    public SearchLongField getProbability() {
        return this.probability;
    }

    public void setProbability(SearchLongField probability) {
        this.probability = probability;
    }

    public SearchDoubleField getProjectedAmount() {
        return this.projectedAmount;
    }

    public void setProjectedAmount(SearchDoubleField projectedAmount) {
        this.projectedAmount = projectedAmount;
    }

    public SearchMultiSelectField getProjectTask() {
        return this.projectTask;
    }

    public void setProjectTask(SearchMultiSelectField projectTask) {
        this.projectTask = projectTask;
    }

    public SearchMultiSelectField getPromoCode() {
        return this.promoCode;
    }

    public void setPromoCode(SearchMultiSelectField promoCode) {
        this.promoCode = promoCode;
    }

    public SearchMultiSelectField getPurchaseOrder() {
        return this.purchaseOrder;
    }

    public void setPurchaseOrder(SearchMultiSelectField purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }

    public SearchDoubleField getQuantity() {
        return this.quantity;
    }

    public void setQuantity(SearchDoubleField quantity) {
        this.quantity = quantity;
    }

    public SearchDoubleField getQuantityBilled() {
        return this.quantityBilled;
    }

    public void setQuantityBilled(SearchDoubleField quantityBilled) {
        this.quantityBilled = quantityBilled;
    }

    public SearchDoubleField getQuantityCommitted() {
        return this.quantityCommitted;
    }

    public void setQuantityCommitted(SearchDoubleField quantityCommitted) {
        this.quantityCommitted = quantityCommitted;
    }

    public SearchDoubleField getQuantityPacked() {
        return this.quantityPacked;
    }

    public void setQuantityPacked(SearchDoubleField quantityPacked) {
        this.quantityPacked = quantityPacked;
    }

    public SearchDoubleField getQuantityPicked() {
        return this.quantityPicked;
    }

    public void setQuantityPicked(SearchDoubleField quantityPicked) {
        this.quantityPicked = quantityPicked;
    }

    public SearchDoubleField getQuantityRevCommitted() {
        return this.quantityRevCommitted;
    }

    public void setQuantityRevCommitted(SearchDoubleField quantityRevCommitted) {
        this.quantityRevCommitted = quantityRevCommitted;
    }

    public SearchDoubleField getQuantityShipRecv() {
        return this.quantityShipRecv;
    }

    public void setQuantityShipRecv(SearchDoubleField quantityShipRecv) {
        this.quantityShipRecv = quantityShipRecv;
    }

    public SearchDoubleField getRecognizedRevenue() {
        return this.recognizedRevenue;
    }

    public void setRecognizedRevenue(SearchDoubleField recognizedRevenue) {
        this.recognizedRevenue = recognizedRevenue;
    }

    public SearchStringField getRecordType() {
        return this.recordType;
    }

    public void setRecordType(SearchStringField recordType) {
        this.recordType = recordType;
    }

    public SearchDoubleField getRecurAnnuallyTotal() {
        return this.recurAnnuallyTotal;
    }

    public void setRecurAnnuallyTotal(SearchDoubleField recurAnnuallyTotal) {
        this.recurAnnuallyTotal = recurAnnuallyTotal;
    }

    public SearchDoubleField getRecurMonthlyTotal() {
        return this.recurMonthlyTotal;
    }

    public void setRecurMonthlyTotal(SearchDoubleField recurMonthlyTotal) {
        this.recurMonthlyTotal = recurMonthlyTotal;
    }

    public SearchDoubleField getRecurQuarterlyTotal() {
        return this.recurQuarterlyTotal;
    }

    public void setRecurQuarterlyTotal(SearchDoubleField recurQuarterlyTotal) {
        this.recurQuarterlyTotal = recurQuarterlyTotal;
    }

    public SearchBooleanField getRecurringBill() {
        return this.recurringBill;
    }

    public void setRecurringBill(SearchBooleanField recurringBill) {
        this.recurringBill = recurringBill;
    }

    public SearchDoubleField getRecurWeeklyTotal() {
        return this.recurWeeklyTotal;
    }

    public void setRecurWeeklyTotal(SearchDoubleField recurWeeklyTotal) {
        this.recurWeeklyTotal = recurWeeklyTotal;
    }

    public SearchLongField getRefNumber() {
        return this.refNumber;
    }

    public void setRefNumber(SearchLongField refNumber) {
        this.refNumber = refNumber;
    }

    public SearchDateField getRequestedDate() {
        return this.requestedDate;
    }

    public void setRequestedDate(SearchDateField requestedDate) {
        this.requestedDate = requestedDate;
    }

    public SearchEnumMultiSelectField getRevCommitStatus() {
        return this.revCommitStatus;
    }

    public void setRevCommitStatus(SearchEnumMultiSelectField revCommitStatus) {
        this.revCommitStatus = revCommitStatus;
    }

    public SearchBooleanField getRevCommittingStatus() {
        return this.revCommittingStatus;
    }

    public void setRevCommittingStatus(SearchBooleanField revCommittingStatus) {
        this.revCommittingStatus = revCommittingStatus;
    }

    public SearchMultiSelectField getRevCommittingTransaction() {
        return this.revCommittingTransaction;
    }

    public void setRevCommittingTransaction(SearchMultiSelectField revCommittingTransaction) {
        this.revCommittingTransaction = revCommittingTransaction;
    }

    public SearchEnumMultiSelectField getRevenueStatus() {
        return this.revenueStatus;
    }

    public void setRevenueStatus(SearchEnumMultiSelectField revenueStatus) {
        this.revenueStatus = revenueStatus;
    }

    public SearchDateField getReversalDate() {
        return this.reversalDate;
    }

    public void setReversalDate(SearchDateField reversalDate) {
        this.reversalDate = reversalDate;
    }

    public SearchStringField getReversalNumber() {
        return this.reversalNumber;
    }

    public void setReversalNumber(SearchStringField reversalNumber) {
        this.reversalNumber = reversalNumber;
    }

    public SearchDateField getRevRecEndDate() {
        return this.revRecEndDate;
    }

    public void setRevRecEndDate(SearchDateField revRecEndDate) {
        this.revRecEndDate = revRecEndDate;
    }

    public SearchBooleanField getRevRecOnRevCommitment() {
        return this.revRecOnRevCommitment;
    }

    public void setRevRecOnRevCommitment(SearchBooleanField revRecOnRevCommitment) {
        this.revRecOnRevCommitment = revRecOnRevCommitment;
    }

    public SearchDateField getRevRecStartDate() {
        return this.revRecStartDate;
    }

    public void setRevRecStartDate(SearchDateField revRecStartDate) {
        this.revRecStartDate = revRecStartDate;
    }

    public SearchLongField getRevRecTermInMonths() {
        return this.revRecTermInMonths;
    }

    public void setRevRecTermInMonths(SearchLongField revRecTermInMonths) {
        this.revRecTermInMonths = revRecTermInMonths;
    }

    public SearchDateField getSalesEffectiveDate() {
        return this.salesEffectiveDate;
    }

    public void setSalesEffectiveDate(SearchDateField salesEffectiveDate) {
        this.salesEffectiveDate = salesEffectiveDate;
    }

    public SearchMultiSelectField getSalesOrder() {
        return this.salesOrder;
    }

    public void setSalesOrder(SearchMultiSelectField salesOrder) {
        this.salesOrder = salesOrder;
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

    public SearchEnumMultiSelectField getSchedulingMethod() {
        return this.schedulingMethod;
    }

    public void setSchedulingMethod(SearchEnumMultiSelectField schedulingMethod) {
        this.schedulingMethod = schedulingMethod;
    }

    public SearchStringField getSerialNumber() {
        return this.serialNumber;
    }

    public void setSerialNumber(SearchStringField serialNumber) {
        this.serialNumber = serialNumber;
    }

    public SearchDoubleField getSerialNumberCost() {
        return this.serialNumberCost;
    }

    public void setSerialNumberCost(SearchDoubleField serialNumberCost) {
        this.serialNumberCost = serialNumberCost;
    }

    public SearchDoubleField getSerialNumberCostAdjustment() {
        return this.serialNumberCostAdjustment;
    }

    public void setSerialNumberCostAdjustment(SearchDoubleField serialNumberCostAdjustment) {
        this.serialNumberCostAdjustment = serialNumberCostAdjustment;
    }

    public SearchDoubleField getSerialNumberQuantity() {
        return this.serialNumberQuantity;
    }

    public void setSerialNumberQuantity(SearchDoubleField serialNumberQuantity) {
        this.serialNumberQuantity = serialNumberQuantity;
    }

    public SearchStringField getSerialNumbers() {
        return this.serialNumbers;
    }

    public void setSerialNumbers(SearchStringField serialNumbers) {
        this.serialNumbers = serialNumbers;
    }

    public SearchStringField getShipAddress() {
        return this.shipAddress;
    }

    public void setShipAddress(SearchStringField shipAddress) {
        this.shipAddress = shipAddress;
    }

    public SearchStringField getShipAddressee() {
        return this.shipAddressee;
    }

    public void setShipAddressee(SearchStringField shipAddressee) {
        this.shipAddressee = shipAddressee;
    }

    public SearchStringField getShipAttention() {
        return this.shipAttention;
    }

    public void setShipAttention(SearchStringField shipAttention) {
        this.shipAttention = shipAttention;
    }

    public SearchEnumMultiSelectField getShipCarrier() {
        return this.shipCarrier;
    }

    public void setShipCarrier(SearchEnumMultiSelectField shipCarrier) {
        this.shipCarrier = shipCarrier;
    }

    public SearchStringField getShipCity() {
        return this.shipCity;
    }

    public void setShipCity(SearchStringField shipCity) {
        this.shipCity = shipCity;
    }

    public SearchBooleanField getShipComplete() {
        return this.shipComplete;
    }

    public void setShipComplete(SearchBooleanField shipComplete) {
        this.shipComplete = shipComplete;
    }

    public SearchEnumMultiSelectField getShipCountry() {
        return this.shipCountry;
    }

    public void setShipCountry(SearchEnumMultiSelectField shipCountry) {
        this.shipCountry = shipCountry;
    }

    public SearchStringField getShipCounty() {
        return this.shipCounty;
    }

    public void setShipCounty(SearchStringField shipCounty) {
        this.shipCounty = shipCounty;
    }

    public SearchDateField getShipDate() {
        return this.shipDate;
    }

    public void setShipDate(SearchDateField shipDate) {
        this.shipDate = shipDate;
    }

    public SearchLongField getShipGroup() {
        return this.shipGroup;
    }

    public void setShipGroup(SearchLongField shipGroup) {
        this.shipGroup = shipGroup;
    }

    public SearchMultiSelectField getShipMethod() {
        return this.shipMethod;
    }

    public void setShipMethod(SearchMultiSelectField shipMethod) {
        this.shipMethod = shipMethod;
    }

    public SearchStringField getShipPhone() {
        return this.shipPhone;
    }

    public void setShipPhone(SearchStringField shipPhone) {
        this.shipPhone = shipPhone;
    }

    public SearchBooleanField getShipping() {
        return this.shipping;
    }

    public void setShipping(SearchBooleanField shipping) {
        this.shipping = shipping;
    }

    public SearchBooleanField getShipRecvStatus() {
        return this.shipRecvStatus;
    }

    public void setShipRecvStatus(SearchBooleanField shipRecvStatus) {
        this.shipRecvStatus = shipRecvStatus;
    }

    public SearchBooleanField getShipRecvStatusLine() {
        return this.shipRecvStatusLine;
    }

    public void setShipRecvStatusLine(SearchBooleanField shipRecvStatusLine) {
        this.shipRecvStatusLine = shipRecvStatusLine;
    }

    public SearchMultiSelectField getShipState() {
        return this.shipState;
    }

    public void setShipState(SearchMultiSelectField shipState) {
        this.shipState = shipState;
    }

    public SearchMultiSelectField getShipTo() {
        return this.shipTo;
    }

    public void setShipTo(SearchMultiSelectField shipTo) {
        this.shipTo = shipTo;
    }

    public SearchStringField getShipZip() {
        return this.shipZip;
    }

    public void setShipZip(SearchStringField shipZip) {
        this.shipZip = shipZip;
    }

    public SearchEnumMultiSelectField getSource() {
        return this.source;
    }

    public void setSource(SearchEnumMultiSelectField source) {
        this.source = source;
    }

    public SearchDateField getStartDate() {
        return this.startDate;
    }

    public void setStartDate(SearchDateField startDate) {
        this.startDate = startDate;
    }

    public SearchBooleanField getStatistical() {
        return this.statistical;
    }

    public void setStatistical(SearchBooleanField statistical) {
        this.statistical = statistical;
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

    public SearchMultiSelectField getSubscriptionLine() {
        return this.subscriptionLine;
    }

    public void setSubscriptionLine(SearchMultiSelectField subscriptionLine) {
        this.subscriptionLine = subscriptionLine;
    }

    public SearchMultiSelectField getSubsidiary() {
        return this.subsidiary;
    }

    public void setSubsidiary(SearchMultiSelectField subsidiary) {
        this.subsidiary = subsidiary;
    }

    public SearchMultiSelectField getSubsidiaryTaxRegNum() {
        return this.subsidiaryTaxRegNum;
    }

    public void setSubsidiaryTaxRegNum(SearchMultiSelectField subsidiaryTaxRegNum) {
        this.subsidiaryTaxRegNum = subsidiaryTaxRegNum;
    }

    public SearchMultiSelectField getTaxItem() {
        return this.taxItem;
    }

    public void setTaxItem(SearchMultiSelectField taxItem) {
        this.taxItem = taxItem;
    }

    public SearchBooleanField getTaxLine() {
        return this.taxLine;
    }

    public void setTaxLine(SearchBooleanField taxLine) {
        this.taxLine = taxLine;
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

    public SearchDateField getTaxPointDate() {
        return this.taxPointDate;
    }

    public void setTaxPointDate(SearchDateField taxPointDate) {
        this.taxPointDate = taxPointDate;
    }

    public SearchDoubleField getTaxRate() {
        return this.taxRate;
    }

    public void setTaxRate(SearchDoubleField taxRate) {
        this.taxRate = taxRate;
    }

    public SearchMultiSelectField getTerms() {
        return this.terms;
    }

    public void setTerms(SearchMultiSelectField terms) {
        this.terms = terms;
    }

    public SearchEnumMultiSelectField getTermsOfSale() {
        return this.termsOfSale;
    }

    public void setTermsOfSale(SearchEnumMultiSelectField termsOfSale) {
        this.termsOfSale = termsOfSale;
    }

    public SearchStringField getTitle() {
        return this.title;
    }

    public void setTitle(SearchStringField title) {
        this.title = title;
    }

    public SearchBooleanField getToBeEmailed() {
        return this.toBeEmailed;
    }

    public void setToBeEmailed(SearchBooleanField toBeEmailed) {
        this.toBeEmailed = toBeEmailed;
    }

    public SearchBooleanField getToBePrinted() {
        return this.toBePrinted;
    }

    public void setToBePrinted(SearchBooleanField toBePrinted) {
        this.toBePrinted = toBePrinted;
    }

    public SearchMultiSelectField getToSubsidiary() {
        return this.toSubsidiary;
    }

    public void setToSubsidiary(SearchMultiSelectField toSubsidiary) {
        this.toSubsidiary = toSubsidiary;
    }

    public SearchDoubleField getTotalAmount() {
        return this.totalAmount;
    }

    public void setTotalAmount(SearchDoubleField totalAmount) {
        this.totalAmount = totalAmount;
    }

    public SearchStringField getTrackingNumbers() {
        return this.trackingNumbers;
    }

    public void setTrackingNumbers(SearchStringField trackingNumbers) {
        this.trackingNumbers = trackingNumbers;
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

    public SearchBooleanField getTranIsVsoeBundle() {
        return this.tranIsVsoeBundle;
    }

    public void setTranIsVsoeBundle(SearchBooleanField tranIsVsoeBundle) {
        this.tranIsVsoeBundle = tranIsVsoeBundle;
    }

    public SearchBooleanField getTransactionDiscount() {
        return this.transactionDiscount;
    }

    public void setTransactionDiscount(SearchBooleanField transactionDiscount) {
        this.transactionDiscount = transactionDiscount;
    }

    public SearchEnumMultiSelectField getTransactionLineType() {
        return this.transactionLineType;
    }

    public void setTransactionLineType(SearchEnumMultiSelectField transactionLineType) {
        this.transactionLineType = transactionLineType;
    }

    public SearchStringField getTransactionNumber() {
        return this.transactionNumber;
    }

    public void setTransactionNumber(SearchStringField transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    public SearchMultiSelectField getTransferLocation() {
        return this.transferLocation;
    }

    public void setTransferLocation(SearchMultiSelectField transferLocation) {
        this.transferLocation = transferLocation;
    }

    public SearchDoubleField getTransferOrderQuantityCommitted() {
        return this.transferOrderQuantityCommitted;
    }

    public void setTransferOrderQuantityCommitted(SearchDoubleField transferOrderQuantityCommitted) {
        this.transferOrderQuantityCommitted = transferOrderQuantityCommitted;
    }

    public SearchDoubleField getTransferOrderQuantityPacked() {
        return this.transferOrderQuantityPacked;
    }

    public void setTransferOrderQuantityPacked(SearchDoubleField transferOrderQuantityPacked) {
        this.transferOrderQuantityPacked = transferOrderQuantityPacked;
    }

    public SearchDoubleField getTransferOrderQuantityPicked() {
        return this.transferOrderQuantityPicked;
    }

    public void setTransferOrderQuantityPicked(SearchDoubleField transferOrderQuantityPicked) {
        this.transferOrderQuantityPicked = transferOrderQuantityPicked;
    }

    public SearchDoubleField getTransferOrderQuantityReceived() {
        return this.transferOrderQuantityReceived;
    }

    public void setTransferOrderQuantityReceived(SearchDoubleField transferOrderQuantityReceived) {
        this.transferOrderQuantityReceived = transferOrderQuantityReceived;
    }

    public SearchDoubleField getTransferOrderQuantityShipped() {
        return this.transferOrderQuantityShipped;
    }

    public void setTransferOrderQuantityShipped(SearchDoubleField transferOrderQuantityShipped) {
        this.transferOrderQuantityShipped = transferOrderQuantityShipped;
    }

    public SearchEnumMultiSelectField getType() {
        return this.type;
    }

    public void setType(SearchEnumMultiSelectField type) {
        this.type = type;
    }

    public SearchMultiSelectField getUnit() {
        return this.unit;
    }

    public void setUnit(SearchMultiSelectField unit) {
        this.unit = unit;
    }

    public SearchDoubleField getUnitCostOverride() {
        return this.unitCostOverride;
    }

    public void setUnitCostOverride(SearchDoubleField unitCostOverride) {
        this.unitCostOverride = unitCostOverride;
    }

    public SearchMultiSelectField getUnitsType() {
        return this.unitsType;
    }

    public void setUnitsType(SearchMultiSelectField unitsType) {
        this.unitsType = unitsType;
    }

    public SearchMultiSelectField getVendType() {
        return this.vendType;
    }

    public void setVendType(SearchMultiSelectField vendType) {
        this.vendType = vendType;
    }

    public SearchBooleanField getVisibleToCustomer() {
        return this.visibleToCustomer;
    }

    public void setVisibleToCustomer(SearchBooleanField visibleToCustomer) {
        this.visibleToCustomer = visibleToCustomer;
    }

    public SearchBooleanField getVoided() {
        return this.voided;
    }

    public void setVoided(SearchBooleanField voided) {
        this.voided = voided;
    }

    public SearchDoubleField getVsoeAllocation() {
        return this.vsoeAllocation;
    }

    public void setVsoeAllocation(SearchDoubleField vsoeAllocation) {
        this.vsoeAllocation = vsoeAllocation;
    }

    public SearchDoubleField getVsoeAmount() {
        return this.vsoeAmount;
    }

    public void setVsoeAmount(SearchDoubleField vsoeAmount) {
        this.vsoeAmount = vsoeAmount;
    }

    public SearchEnumMultiSelectField getVsoeDeferral() {
        return this.vsoeDeferral;
    }

    public void setVsoeDeferral(SearchEnumMultiSelectField vsoeDeferral) {
        this.vsoeDeferral = vsoeDeferral;
    }

    public SearchBooleanField getVsoeDelivered() {
        return this.vsoeDelivered;
    }

    public void setVsoeDelivered(SearchBooleanField vsoeDelivered) {
        this.vsoeDelivered = vsoeDelivered;
    }

    public SearchEnumMultiSelectField getVsoePermitDiscount() {
        return this.vsoePermitDiscount;
    }

    public void setVsoePermitDiscount(SearchEnumMultiSelectField vsoePermitDiscount) {
        this.vsoePermitDiscount = vsoePermitDiscount;
    }

    public SearchDoubleField getVsoePrice() {
        return this.vsoePrice;
    }

    public void setVsoePrice(SearchDoubleField vsoePrice) {
        this.vsoePrice = vsoePrice;
    }

    public SearchMultiSelectField getWebSite() {
        return this.webSite;
    }

    public void setWebSite(SearchMultiSelectField webSite) {
        this.webSite = webSite;
    }

    public SearchCustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TransactionSearchBasic)) {
            return false;
        }
        TransactionSearchBasic other = (TransactionSearchBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.account == null && other.getAccount() == null || this.account != null && this.account.equals(other.getAccount())) && (this.accountType == null && other.getAccountType() == null || this.accountType != null && this.accountType.equals(other.getAccountType())) && (this.acctCorpCardExp == null && other.getAcctCorpCardExp() == null || this.acctCorpCardExp != null && this.acctCorpCardExp.equals(other.getAcctCorpCardExp())) && (this.actualProductionEndDate == null && other.getActualProductionEndDate() == null || this.actualProductionEndDate != null && this.actualProductionEndDate.equals(other.getActualProductionEndDate())) && (this.actualProductionStartDate == null && other.getActualProductionStartDate() == null || this.actualProductionStartDate != null && this.actualProductionStartDate.equals(other.getActualProductionStartDate())) && (this.actualShipDate == null && other.getActualShipDate() == null || this.actualShipDate != null && this.actualShipDate.equals(other.getActualShipDate())) && (this.altSalesAmount == null && other.getAltSalesAmount() == null || this.altSalesAmount != null && this.altSalesAmount.equals(other.getAltSalesAmount())) && (this.altSalesNetAmount == null && other.getAltSalesNetAmount() == null || this.altSalesNetAmount != null && this.altSalesNetAmount.equals(other.getAltSalesNetAmount())) && (this.amount == null && other.getAmount() == null || this.amount != null && this.amount.equals(other.getAmount())) && (this.amountPaid == null && other.getAmountPaid() == null || this.amountPaid != null && this.amountPaid.equals(other.getAmountPaid())) && (this.amountRemaining == null && other.getAmountRemaining() == null || this.amountRemaining != null && this.amountRemaining.equals(other.getAmountRemaining())) && (this.amountUnbilled == null && other.getAmountUnbilled() == null || this.amountUnbilled != null && this.amountUnbilled.equals(other.getAmountUnbilled())) && (this.anyLineItem == null && other.getAnyLineItem() == null || this.anyLineItem != null && this.anyLineItem.equals(other.getAnyLineItem())) && (this.appliedToForeignAmount == null && other.getAppliedToForeignAmount() == null || this.appliedToForeignAmount != null && this.appliedToForeignAmount.equals(other.getAppliedToForeignAmount())) && (this.appliedToIsFxVariance == null && other.getAppliedToIsFxVariance() == null || this.appliedToIsFxVariance != null && this.appliedToIsFxVariance.equals(other.getAppliedToIsFxVariance())) && (this.appliedToLinkAmount == null && other.getAppliedToLinkAmount() == null || this.appliedToLinkAmount != null && this.appliedToLinkAmount.equals(other.getAppliedToLinkAmount())) && (this.appliedToLinkType == null && other.getAppliedToLinkType() == null || this.appliedToLinkType != null && this.appliedToLinkType.equals(other.getAppliedToLinkType())) && (this.appliedToTransaction == null && other.getAppliedToTransaction() == null || this.appliedToTransaction != null && this.appliedToTransaction.equals(other.getAppliedToTransaction())) && (this.applyingForeignAmount == null && other.getApplyingForeignAmount() == null || this.applyingForeignAmount != null && this.applyingForeignAmount.equals(other.getApplyingForeignAmount())) && (this.applyingIsFxVariance == null && other.getApplyingIsFxVariance() == null || this.applyingIsFxVariance != null && this.applyingIsFxVariance.equals(other.getApplyingIsFxVariance())) && (this.applyingLinkAmount == null && other.getApplyingLinkAmount() == null || this.applyingLinkAmount != null && this.applyingLinkAmount.equals(other.getApplyingLinkAmount())) && (this.applyingLinkType == null && other.getApplyingLinkType() == null || this.applyingLinkType != null && this.applyingLinkType.equals(other.getApplyingLinkType())) && (this.applyingTransaction == null && other.getApplyingTransaction() == null || this.applyingTransaction != null && this.applyingTransaction.equals(other.getApplyingTransaction())) && (this.approvalStatus == null && other.getApprovalStatus() == null || this.approvalStatus != null && this.approvalStatus.equals(other.getApprovalStatus())) && (this.authCode == null && other.getAuthCode() == null || this.authCode != null && this.authCode.equals(other.getAuthCode())) && (this.autoCalculateLag == null && other.getAutoCalculateLag() == null || this.autoCalculateLag != null && this.autoCalculateLag.equals(other.getAutoCalculateLag())) && (this.avsStreetMatch == null && other.getAvsStreetMatch() == null || this.avsStreetMatch != null && this.avsStreetMatch.equals(other.getAvsStreetMatch())) && (this.avsZipMatch == null && other.getAvsZipMatch() == null || this.avsZipMatch != null && this.avsZipMatch.equals(other.getAvsZipMatch())) && (this.billable == null && other.getBillable() == null || this.billable != null && this.billable.equals(other.getBillable())) && (this.billAddress == null && other.getBillAddress() == null || this.billAddress != null && this.billAddress.equals(other.getBillAddress())) && (this.billAddressee == null && other.getBillAddressee() == null || this.billAddressee != null && this.billAddressee.equals(other.getBillAddressee())) && (this.billAttention == null && other.getBillAttention() == null || this.billAttention != null && this.billAttention.equals(other.getBillAttention())) && (this.billCity == null && other.getBillCity() == null || this.billCity != null && this.billCity.equals(other.getBillCity())) && (this.billCountry == null && other.getBillCountry() == null || this.billCountry != null && this.billCountry.equals(other.getBillCountry())) && (this.billCounty == null && other.getBillCounty() == null || this.billCounty != null && this.billCounty.equals(other.getBillCounty())) && (this.billedDate == null && other.getBilledDate() == null || this.billedDate != null && this.billedDate.equals(other.getBilledDate())) && (this.billingAccount == null && other.getBillingAccount() == null || this.billingAccount != null && this.billingAccount.equals(other.getBillingAccount())) && (this.billingSchedule == null && other.getBillingSchedule() == null || this.billingSchedule != null && this.billingSchedule.equals(other.getBillingSchedule())) && (this.billingStatus == null && other.getBillingStatus() == null || this.billingStatus != null && this.billingStatus.equals(other.getBillingStatus())) && (this.billingTransaction == null && other.getBillingTransaction() == null || this.billingTransaction != null && this.billingTransaction.equals(other.getBillingTransaction())) && (this.billPhone == null && other.getBillPhone() == null || this.billPhone != null && this.billPhone.equals(other.getBillPhone())) && (this.billState == null && other.getBillState() == null || this.billState != null && this.billState.equals(other.getBillState())) && (this.billVarianceStatus == null && other.getBillVarianceStatus() == null || this.billVarianceStatus != null && this.billVarianceStatus.equals(other.getBillVarianceStatus())) && (this.billZip == null && other.getBillZip() == null || this.billZip != null && this.billZip.equals(other.getBillZip())) && (this.binNumber == null && other.getBinNumber() == null || this.binNumber != null && this.binNumber.equals(other.getBinNumber())) && (this.binNumberQuantity == null && other.getBinNumberQuantity() == null || this.binNumberQuantity != null && this.binNumberQuantity.equals(other.getBinNumberQuantity())) && (this.bomQuantity == null && other.getBomQuantity() == null || this.bomQuantity != null && this.bomQuantity.equals(other.getBomQuantity())) && (this.bookSpecificTransaction == null && other.getBookSpecificTransaction() == null || this.bookSpecificTransaction != null && this.bookSpecificTransaction.equals(other.getBookSpecificTransaction())) && (this.buildEntireAssembly == null && other.getBuildEntireAssembly() == null || this.buildEntireAssembly != null && this.buildEntireAssembly.equals(other.getBuildEntireAssembly())) && (this.buildVariance == null && other.getBuildVariance() == null || this.buildVariance != null && this.buildVariance.equals(other.getBuildVariance())) && (this.built == null && other.getBuilt() == null || this.built != null && this.built.equals(other.getBuilt())) && (this.canHaveStackablePromotions == null && other.getCanHaveStackablePromotions() == null || this.canHaveStackablePromotions != null && this.canHaveStackablePromotions.equals(other.getCanHaveStackablePromotions())) && (this.catchUpPeriod == null && other.getCatchUpPeriod() == null || this.catchUpPeriod != null && this.catchUpPeriod.equals(other.getCatchUpPeriod())) && (this.ccCustomerCode == null && other.getCcCustomerCode() == null || this.ccCustomerCode != null && this.ccCustomerCode.equals(other.getCcCustomerCode())) && (this.ccExpireDate == null && other.getCcExpireDate() == null || this.ccExpireDate != null && this.ccExpireDate.equals(other.getCcExpireDate())) && (this.ccName == null && other.getCcName() == null || this.ccName != null && this.ccName.equals(other.getCcName())) && (this.ccNumber == null && other.getCcNumber() == null || this.ccNumber != null && this.ccNumber.equals(other.getCcNumber())) && (this.chargeType == null && other.getChargeType() == null || this.chargeType != null && this.chargeType.equals(other.getChargeType())) && (this._class == null && other.get_class() == null || this._class != null && this._class.equals(other.get_class())) && (this.cleared == null && other.getCleared() == null || this.cleared != null && this.cleared.equals(other.getCleared())) && (this.closed == null && other.getClosed() == null || this.closed != null && this.closed.equals(other.getClosed())) && (this.closeDate == null && other.getCloseDate() == null || this.closeDate != null && this.closeDate.equals(other.getCloseDate())) && (this.cogs == null && other.getCogs() == null || this.cogs != null && this.cogs.equals(other.getCogs())) && (this.commissionEffectiveDate == null && other.getCommissionEffectiveDate() == null || this.commissionEffectiveDate != null && this.commissionEffectiveDate.equals(other.getCommissionEffectiveDate())) && (this.commit == null && other.getCommit() == null || this.commit != null && this.commit.equals(other.getCommit())) && (this.componentYield == null && other.getComponentYield() == null || this.componentYield != null && this.componentYield.equals(other.getComponentYield())) && (this.confirmationNumber == null && other.getConfirmationNumber() == null || this.confirmationNumber != null && this.confirmationNumber.equals(other.getConfirmationNumber())) && (this.contribution == null && other.getContribution() == null || this.contribution != null && this.contribution.equals(other.getContribution())) && (this.costComponentAmount == null && other.getCostComponentAmount() == null || this.costComponentAmount != null && this.costComponentAmount.equals(other.getCostComponentAmount())) && (this.costComponentCategory == null && other.getCostComponentCategory() == null || this.costComponentCategory != null && this.costComponentCategory.equals(other.getCostComponentCategory())) && (this.costComponentItem == null && other.getCostComponentItem() == null || this.costComponentItem != null && this.costComponentItem.equals(other.getCostComponentItem())) && (this.costComponentQuantity == null && other.getCostComponentQuantity() == null || this.costComponentQuantity != null && this.costComponentQuantity.equals(other.getCostComponentQuantity())) && (this.costComponentStandardCost == null && other.getCostComponentStandardCost() == null || this.costComponentStandardCost != null && this.costComponentStandardCost.equals(other.getCostComponentStandardCost())) && (this.costEstimate == null && other.getCostEstimate() == null || this.costEstimate != null && this.costEstimate.equals(other.getCostEstimate())) && (this.costEstimateRate == null && other.getCostEstimateRate() == null || this.costEstimateRate != null && this.costEstimateRate.equals(other.getCostEstimateRate())) && (this.costEstimateType == null && other.getCostEstimateType() == null || this.costEstimateType != null && this.costEstimateType.equals(other.getCostEstimateType())) && (this.createdBy == null && other.getCreatedBy() == null || this.createdBy != null && this.createdBy.equals(other.getCreatedBy())) && (this.createdFrom == null && other.getCreatedFrom() == null || this.createdFrom != null && this.createdFrom.equals(other.getCreatedFrom())) && (this.creditAmount == null && other.getCreditAmount() == null || this.creditAmount != null && this.creditAmount.equals(other.getCreditAmount())) && (this.cscMatch == null && other.getCscMatch() == null || this.cscMatch != null && this.cscMatch.equals(other.getCscMatch())) && (this.currency == null && other.getCurrency() == null || this.currency != null && this.currency.equals(other.getCurrency())) && (this.customerSubOf == null && other.getCustomerSubOf() == null || this.customerSubOf != null && this.customerSubOf.equals(other.getCustomerSubOf())) && (this.customForm == null && other.getCustomForm() == null || this.customForm != null && this.customForm.equals(other.getCustomForm())) && (this.customGL == null && other.getCustomGL() == null || this.customGL != null && this.customGL.equals(other.getCustomGL())) && (this.custType == null && other.getCustType() == null || this.custType != null && this.custType.equals(other.getCustType())) && (this.dateCreated == null && other.getDateCreated() == null || this.dateCreated != null && this.dateCreated.equals(other.getDateCreated())) && (this.daysOpen == null && other.getDaysOpen() == null || this.daysOpen != null && this.daysOpen.equals(other.getDaysOpen())) && (this.daysOverdue == null && other.getDaysOverdue() == null || this.daysOverdue != null && this.daysOverdue.equals(other.getDaysOverdue())) && (this.debitAmount == null && other.getDebitAmount() == null || this.debitAmount != null && this.debitAmount.equals(other.getDebitAmount())) && (this.deferredRevenue == null && other.getDeferredRevenue() == null || this.deferredRevenue != null && this.deferredRevenue.equals(other.getDeferredRevenue())) && (this.deferRevRec == null && other.getDeferRevRec() == null || this.deferRevRec != null && this.deferRevRec.equals(other.getDeferRevRec())) && (this.department == null && other.getDepartment() == null || this.department != null && this.department.equals(other.getDepartment())) && (this.depositDate == null && other.getDepositDate() == null || this.depositDate != null && this.depositDate.equals(other.getDepositDate())) && (this.depositTransaction == null && other.getDepositTransaction() == null || this.depositTransaction != null && this.depositTransaction.equals(other.getDepositTransaction())) && (this.drAccount == null && other.getDrAccount() == null || this.drAccount != null && this.drAccount.equals(other.getDrAccount())) && (this.dueDate == null && other.getDueDate() == null || this.dueDate != null && this.dueDate.equals(other.getDueDate())) && (this.email == null && other.getEmail() == null || this.email != null && this.email.equals(other.getEmail())) && (this.employee == null && other.getEmployee() == null || this.employee != null && this.employee.equals(other.getEmployee())) && (this.endDate == null && other.getEndDate() == null || this.endDate != null && this.endDate.equals(other.getEndDate())) && (this.entity == null && other.getEntity() == null || this.entity != null && this.entity.equals(other.getEntity())) && (this.entityStatus == null && other.getEntityStatus() == null || this.entityStatus != null && this.entityStatus.equals(other.getEntityStatus())) && (this.estGrossProfit == null && other.getEstGrossProfit() == null || this.estGrossProfit != null && this.estGrossProfit.equals(other.getEstGrossProfit())) && (this.estGrossProfitPct == null && other.getEstGrossProfitPct() == null || this.estGrossProfitPct != null && this.estGrossProfitPct.equals(other.getEstGrossProfitPct())) && (this.exchangeRate == null && other.getExchangeRate() == null || this.exchangeRate != null && this.exchangeRate.equals(other.getExchangeRate())) && (this.excludeCommission == null && other.getExcludeCommission() == null || this.excludeCommission != null && this.excludeCommission.equals(other.getExcludeCommission())) && (this.excludeFromRateRequest == null && other.getExcludeFromRateRequest() == null || this.excludeFromRateRequest != null && this.excludeFromRateRequest.equals(other.getExcludeFromRateRequest())) && (this.expectedCloseDate == null && other.getExpectedCloseDate() == null || this.expectedCloseDate != null && this.expectedCloseDate.equals(other.getExpectedCloseDate())) && (this.expectedReceiptDate == null && other.getExpectedReceiptDate() == null || this.expectedReceiptDate != null && this.expectedReceiptDate.equals(other.getExpectedReceiptDate())) && (this.expenseCategory == null && other.getExpenseCategory() == null || this.expenseCategory != null && this.expenseCategory.equals(other.getExpenseCategory())) && (this.expenseDate == null && other.getExpenseDate() == null || this.expenseDate != null && this.expenseDate.equals(other.getExpenseDate())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId())) && (this.externalIdString == null && other.getExternalIdString() == null || this.externalIdString != null && this.externalIdString.equals(other.getExternalIdString())) && (this.finChrg == null && other.getFinChrg() == null || this.finChrg != null && this.finChrg.equals(other.getFinChrg())) && (this.firmed == null && other.getFirmed() == null || this.firmed != null && this.firmed.equals(other.getFirmed())) && (this.forecastType == null && other.getForecastType() == null || this.forecastType != null && this.forecastType.equals(other.getForecastType())) && (this.fulfillingTransaction == null && other.getFulfillingTransaction() == null || this.fulfillingTransaction != null && this.fulfillingTransaction.equals(other.getFulfillingTransaction())) && (this.fxAccount == null && other.getFxAccount() == null || this.fxAccount != null && this.fxAccount.equals(other.getFxAccount())) && (this.fxAmount == null && other.getFxAmount() == null || this.fxAmount != null && this.fxAmount.equals(other.getFxAmount())) && (this.fxCostEstimate == null && other.getFxCostEstimate() == null || this.fxCostEstimate != null && this.fxCostEstimate.equals(other.getFxCostEstimate())) && (this.fxCostEstimateRate == null && other.getFxCostEstimateRate() == null || this.fxCostEstimateRate != null && this.fxCostEstimateRate.equals(other.getFxCostEstimateRate())) && (this.fxEstGrossProfit == null && other.getFxEstGrossProfit() == null || this.fxEstGrossProfit != null && this.fxEstGrossProfit.equals(other.getFxEstGrossProfit())) && (this.fxTranCostEstimate == null && other.getFxTranCostEstimate() == null || this.fxTranCostEstimate != null && this.fxTranCostEstimate.equals(other.getFxTranCostEstimate())) && (this.fxVsoeAllocation == null && other.getFxVsoeAllocation() == null || this.fxVsoeAllocation != null && this.fxVsoeAllocation.equals(other.getFxVsoeAllocation())) && (this.fxVsoeAmount == null && other.getFxVsoeAmount() == null || this.fxVsoeAmount != null && this.fxVsoeAmount.equals(other.getFxVsoeAmount())) && (this.fxVsoePrice == null && other.getFxVsoePrice() == null || this.fxVsoePrice != null && this.fxVsoePrice.equals(other.getFxVsoePrice())) && (this.gcoAvailabelToCharge == null && other.getGcoAvailabelToCharge() == null || this.gcoAvailabelToCharge != null && this.gcoAvailabelToCharge.equals(other.getGcoAvailabelToCharge())) && (this.gcoAvailableToRefund == null && other.getGcoAvailableToRefund() == null || this.gcoAvailableToRefund != null && this.gcoAvailableToRefund.equals(other.getGcoAvailableToRefund())) && (this.gcoAvsStreetMatch == null && other.getGcoAvsStreetMatch() == null || this.gcoAvsStreetMatch != null && this.gcoAvsStreetMatch.equals(other.getGcoAvsStreetMatch())) && (this.gcoAvsZipMatch == null && other.getGcoAvsZipMatch() == null || this.gcoAvsZipMatch != null && this.gcoAvsZipMatch.equals(other.getGcoAvsZipMatch())) && (this.gcoBuyerAccountAge == null && other.getGcoBuyerAccountAge() == null || this.gcoBuyerAccountAge != null && this.gcoBuyerAccountAge.equals(other.getGcoBuyerAccountAge())) && (this.gcoBuyerIp == null && other.getGcoBuyerIp() == null || this.gcoBuyerIp != null && this.gcoBuyerIp.equals(other.getGcoBuyerIp())) && (this.gcoChargeAmount == null && other.getGcoChargeAmount() == null || this.gcoChargeAmount != null && this.gcoChargeAmount.equals(other.getGcoChargeAmount())) && (this.gcoChargebackAmount == null && other.getGcoChargebackAmount() == null || this.gcoChargebackAmount != null && this.gcoChargebackAmount.equals(other.getGcoChargebackAmount())) && (this.gcoConfirmedChargedTotal == null && other.getGcoConfirmedChargedTotal() == null || this.gcoConfirmedChargedTotal != null && this.gcoConfirmedChargedTotal.equals(other.getGcoConfirmedChargedTotal())) && (this.gcoConfirmedRefundedTotal == null && other.getGcoConfirmedRefundedTotal() == null || this.gcoConfirmedRefundedTotal != null && this.gcoConfirmedRefundedTotal.equals(other.getGcoConfirmedRefundedTotal())) && (this.gcoCreditcardNumber == null && other.getGcoCreditcardNumber() == null || this.gcoCreditcardNumber != null && this.gcoCreditcardNumber.equals(other.getGcoCreditcardNumber())) && (this.gcoCscMatch == null && other.getGcoCscMatch() == null || this.gcoCscMatch != null && this.gcoCscMatch.equals(other.getGcoCscMatch())) && (this.gcoFinancialState == null && other.getGcoFinancialState() == null || this.gcoFinancialState != null && this.gcoFinancialState.equals(other.getGcoFinancialState())) && (this.gcoFulfillmentState == null && other.getGcoFulfillmentState() == null || this.gcoFulfillmentState != null && this.gcoFulfillmentState.equals(other.getGcoFulfillmentState())) && (this.gcoOrderId == null && other.getGcoOrderId() == null || this.gcoOrderId != null && this.gcoOrderId.equals(other.getGcoOrderId())) && (this.gcoOrderTotal == null && other.getGcoOrderTotal() == null || this.gcoOrderTotal != null && this.gcoOrderTotal.equals(other.getGcoOrderTotal())) && (this.gcoPromotionAmount == null && other.getGcoPromotionAmount() == null || this.gcoPromotionAmount != null && this.gcoPromotionAmount.equals(other.getGcoPromotionAmount())) && (this.gcoPromotionName == null && other.getGcoPromotionName() == null || this.gcoPromotionName != null && this.gcoPromotionName.equals(other.getGcoPromotionName())) && (this.gcoRefundAmount == null && other.getGcoRefundAmount() == null || this.gcoRefundAmount != null && this.gcoRefundAmount.equals(other.getGcoRefundAmount())) && (this.gcoShippingTotal == null && other.getGcoShippingTotal() == null || this.gcoShippingTotal != null && this.gcoShippingTotal.equals(other.getGcoShippingTotal())) && (this.gcoStateChangedDetail == null && other.getGcoStateChangedDetail() == null || this.gcoStateChangedDetail != null && this.gcoStateChangedDetail.equals(other.getGcoStateChangedDetail())) && (this.giftCertificate == null && other.getGiftCertificate() == null || this.giftCertificate != null && this.giftCertificate.equals(other.getGiftCertificate())) && (this.grossAmount == null && other.getGrossAmount() == null || this.grossAmount != null && this.grossAmount.equals(other.getGrossAmount())) && (this.includeInForecast == null && other.getIncludeInForecast() == null || this.includeInForecast != null && this.includeInForecast.equals(other.getIncludeInForecast())) && (this.incoterm == null && other.getIncoterm() == null || this.incoterm != null && this.incoterm.equals(other.getIncoterm())) && (this.intercoStatus == null && other.getIntercoStatus() == null || this.intercoStatus != null && this.intercoStatus.equals(other.getIntercoStatus())) && (this.intercoTransaction == null && other.getIntercoTransaction() == null || this.intercoTransaction != null && this.intercoTransaction.equals(other.getIntercoTransaction())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.internalIdNumber == null && other.getInternalIdNumber() == null || this.internalIdNumber != null && this.internalIdNumber.equals(other.getInternalIdNumber())) && (this.inventoryLocation == null && other.getInventoryLocation() == null || this.inventoryLocation != null && this.inventoryLocation.equals(other.getInventoryLocation())) && (this.inventorySubsidiary == null && other.getInventorySubsidiary() == null || this.inventorySubsidiary != null && this.inventorySubsidiary.equals(other.getInventorySubsidiary())) && (this.inVsoeBundle == null && other.getInVsoeBundle() == null || this.inVsoeBundle != null && this.inVsoeBundle.equals(other.getInVsoeBundle())) && (this.isAllocation == null && other.getIsAllocation() == null || this.isAllocation != null && this.isAllocation.equals(other.getIsAllocation())) && (this.isBackflush == null && other.getIsBackflush() == null || this.isBackflush != null && this.isBackflush.equals(other.getIsBackflush())) && (this.isGcoChargeback == null && other.getIsGcoChargeback() == null || this.isGcoChargeback != null && this.isGcoChargeback.equals(other.getIsGcoChargeback())) && (this.isGcoChargeConfirmed == null && other.getIsGcoChargeConfirmed() == null || this.isGcoChargeConfirmed != null && this.isGcoChargeConfirmed.equals(other.getIsGcoChargeConfirmed())) && (this.isGcoPaymentGuaranteed == null && other.getIsGcoPaymentGuaranteed() == null || this.isGcoPaymentGuaranteed != null && this.isGcoPaymentGuaranteed.equals(other.getIsGcoPaymentGuaranteed())) && (this.isGcoRefundConfirmed == null && other.getIsGcoRefundConfirmed() == null || this.isGcoRefundConfirmed != null && this.isGcoRefundConfirmed.equals(other.getIsGcoRefundConfirmed())) && (this.isInsideDelivery == null && other.getIsInsideDelivery() == null || this.isInsideDelivery != null && this.isInsideDelivery.equals(other.getIsInsideDelivery())) && (this.isInsidePickup == null && other.getIsInsidePickup() == null || this.isInsidePickup != null && this.isInsidePickup.equals(other.getIsInsidePickup())) && (this.isIntercompanyAdjustment == null && other.getIsIntercompanyAdjustment() == null || this.isIntercompanyAdjustment != null && this.isIntercompanyAdjustment.equals(other.getIsIntercompanyAdjustment())) && (this.isInTransitPayment == null && other.getIsInTransitPayment() == null || this.isInTransitPayment != null && this.isInTransitPayment.equals(other.getIsInTransitPayment())) && (this.isMultiShipTo == null && other.getIsMultiShipTo() == null || this.isMultiShipTo != null && this.isMultiShipTo.equals(other.getIsMultiShipTo())) && (this.isPayPalMeth == null && other.getIsPayPalMeth() == null || this.isPayPalMeth != null && this.isPayPalMeth.equals(other.getIsPayPalMeth())) && (this.isReversal == null && other.getIsReversal() == null || this.isReversal != null && this.isReversal.equals(other.getIsReversal())) && (this.isRevRecTransaction == null && other.getIsRevRecTransaction() == null || this.isRevRecTransaction != null && this.isRevRecTransaction.equals(other.getIsRevRecTransaction())) && (this.isScrap == null && other.getIsScrap() == null || this.isScrap != null && this.isScrap.equals(other.getIsScrap())) && (this.isShipAddress == null && other.getIsShipAddress() == null || this.isShipAddress != null && this.isShipAddress.equals(other.getIsShipAddress())) && (this.isTransferPriceCosting == null && other.getIsTransferPriceCosting() == null || this.isTransferPriceCosting != null && this.isTransferPriceCosting.equals(other.getIsTransferPriceCosting())) && (this.isVsoeAlloc == null && other.getIsVsoeAlloc() == null || this.isVsoeAlloc != null && this.isVsoeAlloc.equals(other.getIsVsoeAlloc())) && (this.isWip == null && other.getIsWip() == null || this.isWip != null && this.isWip.equals(other.getIsWip())) && (this.item == null && other.getItem() == null || this.item != null && this.item.equals(other.getItem())) && (this.itemFulfillmentChoice == null && other.getItemFulfillmentChoice() == null || this.itemFulfillmentChoice != null && this.itemFulfillmentChoice.equals(other.getItemFulfillmentChoice())) && (this.itemRevision == null && other.getItemRevision() == null || this.itemRevision != null && this.itemRevision.equals(other.getItemRevision())) && (this.itemSubOf == null && other.getItemSubOf() == null || this.itemSubOf != null && this.itemSubOf.equals(other.getItemSubOf())) && (this.landedCostPerLine == null && other.getLandedCostPerLine() == null || this.landedCostPerLine != null && this.landedCostPerLine.equals(other.getLandedCostPerLine())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && this.lastModifiedDate.equals(other.getLastModifiedDate())) && (this.leadSource == null && other.getLeadSource() == null || this.leadSource != null && this.leadSource.equals(other.getLeadSource())) && (this.lineUniqueKey == null && other.getLineUniqueKey() == null || this.lineUniqueKey != null && this.lineUniqueKey.equals(other.getLineUniqueKey())) && (this.location == null && other.getLocation() == null || this.location != null && this.location.equals(other.getLocation())) && (this.locationAutoAssigned == null && other.getLocationAutoAssigned() == null || this.locationAutoAssigned != null && this.locationAutoAssigned.equals(other.getLocationAutoAssigned())) && (this.mainLine == null && other.getMainLine() == null || this.mainLine != null && this.mainLine.equals(other.getMainLine())) && (this.mainName == null && other.getMainName() == null || this.mainName != null && this.mainName.equals(other.getMainName())) && (this.manufacturingRouting == null && other.getManufacturingRouting() == null || this.manufacturingRouting != null && this.manufacturingRouting.equals(other.getManufacturingRouting())) && (this.matchBillToReceipt == null && other.getMatchBillToReceipt() == null || this.matchBillToReceipt != null && this.matchBillToReceipt.equals(other.getMatchBillToReceipt())) && (this.memo == null && other.getMemo() == null || this.memo != null && this.memo.equals(other.getMemo())) && (this.memoMain == null && other.getMemoMain() == null || this.memoMain != null && this.memoMain.equals(other.getMemoMain())) && (this.memorized == null && other.getMemorized() == null || this.memorized != null && this.memorized.equals(other.getMemorized())) && (this.merchantAccount == null && other.getMerchantAccount() == null || this.merchantAccount != null && this.merchantAccount.equals(other.getMerchantAccount())) && (this.message == null && other.getMessage() == null || this.message != null && this.message.equals(other.getMessage())) && (this.multiSubsidiary == null && other.getMultiSubsidiary() == null || this.multiSubsidiary != null && this.multiSubsidiary.equals(other.getMultiSubsidiary())) && (this.nameText == null && other.getNameText() == null || this.nameText != null && this.nameText.equals(other.getNameText())) && (this.netAmount == null && other.getNetAmount() == null || this.netAmount != null && this.netAmount.equals(other.getNetAmount())) && (this.nextApprover == null && other.getNextApprover() == null || this.nextApprover != null && this.nextApprover.equals(other.getNextApprover())) && (this.nextBillDate == null && other.getNextBillDate() == null || this.nextBillDate != null && this.nextBillDate.equals(other.getNextBillDate())) && (this.nexus == null && other.getNexus() == null || this.nexus != null && this.nexus.equals(other.getNexus())) && (this.noAutoAssignLocation == null && other.getNoAutoAssignLocation() == null || this.noAutoAssignLocation != null && this.noAutoAssignLocation.equals(other.getNoAutoAssignLocation())) && (this.nonReimbursable == null && other.getNonReimbursable() == null || this.nonReimbursable != null && this.nonReimbursable.equals(other.getNonReimbursable())) && (this.number == null && other.getNumber() == null || this.number != null && this.number.equals(other.getNumber())) && (this.oneTimeTotal == null && other.getOneTimeTotal() == null || this.oneTimeTotal != null && this.oneTimeTotal.equals(other.getOneTimeTotal())) && (this.opportunity == null && other.getOpportunity() == null || this.opportunity != null && this.opportunity.equals(other.getOpportunity())) && (this.orderAllocationStrategy == null && other.getOrderAllocationStrategy() == null || this.orderAllocationStrategy != null && this.orderAllocationStrategy.equals(other.getOrderAllocationStrategy())) && (this.orderPriority == null && other.getOrderPriority() == null || this.orderPriority != null && this.orderPriority.equals(other.getOrderPriority())) && (this.otherRefNum == null && other.getOtherRefNum() == null || this.otherRefNum != null && this.otherRefNum.equals(other.getOtherRefNum())) && (this.otherRefNumNonDeposit == null && other.getOtherRefNumNonDeposit() == null || this.otherRefNumNonDeposit != null && this.otherRefNumNonDeposit.equals(other.getOtherRefNumNonDeposit())) && (this.overheadParentItem == null && other.getOverheadParentItem() == null || this.overheadParentItem != null && this.overheadParentItem.equals(other.getOverheadParentItem())) && (this.overrideInstallments == null && other.getOverrideInstallments() == null || this.overrideInstallments != null && this.overrideInstallments.equals(other.getOverrideInstallments())) && (this.packageCount == null && other.getPackageCount() == null || this.packageCount != null && this.packageCount.equals(other.getPackageCount())) && (this.paidTransaction == null && other.getPaidTransaction() == null || this.paidTransaction != null && this.paidTransaction.equals(other.getPaidTransaction())) && (this.parent == null && other.getParent() == null || this.parent != null && this.parent.equals(other.getParent())) && (this.partner == null && other.getPartner() == null || this.partner != null && this.partner.equals(other.getPartner())) && (this.partnerContribution == null && other.getPartnerContribution() == null || this.partnerContribution != null && this.partnerContribution.equals(other.getPartnerContribution())) && (this.partnerRole == null && other.getPartnerRole() == null || this.partnerRole != null && this.partnerRole.equals(other.getPartnerRole())) && (this.partnerTeamMember == null && other.getPartnerTeamMember() == null || this.partnerTeamMember != null && this.partnerTeamMember.equals(other.getPartnerTeamMember())) && (this.payingTransaction == null && other.getPayingTransaction() == null || this.payingTransaction != null && this.payingTransaction.equals(other.getPayingTransaction())) && (this.paymentApproved == null && other.getPaymentApproved() == null || this.paymentApproved != null && this.paymentApproved.equals(other.getPaymentApproved())) && (this.paymentEventDate == null && other.getPaymentEventDate() == null || this.paymentEventDate != null && this.paymentEventDate.equals(other.getPaymentEventDate())) && (this.paymentEventHoldReason == null && other.getPaymentEventHoldReason() == null || this.paymentEventHoldReason != null && this.paymentEventHoldReason.equals(other.getPaymentEventHoldReason())) && (this.paymentEventPurchaseCardUsed == null && other.getPaymentEventPurchaseCardUsed() == null || this.paymentEventPurchaseCardUsed != null && this.paymentEventPurchaseCardUsed.equals(other.getPaymentEventPurchaseCardUsed())) && (this.paymentEventPurchaseDataSent == null && other.getPaymentEventPurchaseDataSent() == null || this.paymentEventPurchaseDataSent != null && this.paymentEventPurchaseDataSent.equals(other.getPaymentEventPurchaseDataSent())) && (this.paymentEventResult == null && other.getPaymentEventResult() == null || this.paymentEventResult != null && this.paymentEventResult.equals(other.getPaymentEventResult())) && (this.paymentEventType == null && other.getPaymentEventType() == null || this.paymentEventType != null && this.paymentEventType.equals(other.getPaymentEventType())) && (this.paymentHold == null && other.getPaymentHold() == null || this.paymentHold != null && this.paymentHold.equals(other.getPaymentHold())) && (this.paymentMethod == null && other.getPaymentMethod() == null || this.paymentMethod != null && this.paymentMethod.equals(other.getPaymentMethod())) && (this.paymentOption == null && other.getPaymentOption() == null || this.paymentOption != null && this.paymentOption.equals(other.getPaymentOption())) && (this.payPalPending == null && other.getPayPalPending() == null || this.payPalPending != null && this.payPalPending.equals(other.getPayPalPending())) && (this.payPalStatus == null && other.getPayPalStatus() == null || this.payPalStatus != null && this.payPalStatus.equals(other.getPayPalStatus())) && (this.payPalTranId == null && other.getPayPalTranId() == null || this.payPalTranId != null && this.payPalTranId.equals(other.getPayPalTranId())) && (this.pnRefNum == null && other.getPnRefNum() == null || this.pnRefNum != null && this.pnRefNum.equals(other.getPnRefNum())) && (this.poAsText == null && other.getPoAsText() == null || this.poAsText != null && this.poAsText.equals(other.getPoAsText())) && (this.policyViolated == null && other.getPolicyViolated() == null || this.policyViolated != null && this.policyViolated.equals(other.getPolicyViolated())) && (this.posting == null && other.getPosting() == null || this.posting != null && this.posting.equals(other.getPosting())) && (this.postingPeriod == null && other.getPostingPeriod() == null || this.postingPeriod != null && this.postingPeriod.equals(other.getPostingPeriod())) && (this.postingPeriodRelative == null && other.getPostingPeriodRelative() == null || this.postingPeriodRelative != null && this.postingPeriodRelative.equals(other.getPostingPeriodRelative())) && (this.priceLevel == null && other.getPriceLevel() == null || this.priceLevel != null && this.priceLevel.equals(other.getPriceLevel())) && (this.printedPickingTicket == null && other.getPrintedPickingTicket() == null || this.printedPickingTicket != null && this.printedPickingTicket.equals(other.getPrintedPickingTicket())) && (this.probability == null && other.getProbability() == null || this.probability != null && this.probability.equals(other.getProbability())) && (this.projectedAmount == null && other.getProjectedAmount() == null || this.projectedAmount != null && this.projectedAmount.equals(other.getProjectedAmount())) && (this.projectTask == null && other.getProjectTask() == null || this.projectTask != null && this.projectTask.equals(other.getProjectTask())) && (this.promoCode == null && other.getPromoCode() == null || this.promoCode != null && this.promoCode.equals(other.getPromoCode())) && (this.purchaseOrder == null && other.getPurchaseOrder() == null || this.purchaseOrder != null && this.purchaseOrder.equals(other.getPurchaseOrder())) && (this.quantity == null && other.getQuantity() == null || this.quantity != null && this.quantity.equals(other.getQuantity())) && (this.quantityBilled == null && other.getQuantityBilled() == null || this.quantityBilled != null && this.quantityBilled.equals(other.getQuantityBilled())) && (this.quantityCommitted == null && other.getQuantityCommitted() == null || this.quantityCommitted != null && this.quantityCommitted.equals(other.getQuantityCommitted())) && (this.quantityPacked == null && other.getQuantityPacked() == null || this.quantityPacked != null && this.quantityPacked.equals(other.getQuantityPacked())) && (this.quantityPicked == null && other.getQuantityPicked() == null || this.quantityPicked != null && this.quantityPicked.equals(other.getQuantityPicked())) && (this.quantityRevCommitted == null && other.getQuantityRevCommitted() == null || this.quantityRevCommitted != null && this.quantityRevCommitted.equals(other.getQuantityRevCommitted())) && (this.quantityShipRecv == null && other.getQuantityShipRecv() == null || this.quantityShipRecv != null && this.quantityShipRecv.equals(other.getQuantityShipRecv())) && (this.recognizedRevenue == null && other.getRecognizedRevenue() == null || this.recognizedRevenue != null && this.recognizedRevenue.equals(other.getRecognizedRevenue())) && (this.recordType == null && other.getRecordType() == null || this.recordType != null && this.recordType.equals(other.getRecordType())) && (this.recurAnnuallyTotal == null && other.getRecurAnnuallyTotal() == null || this.recurAnnuallyTotal != null && this.recurAnnuallyTotal.equals(other.getRecurAnnuallyTotal())) && (this.recurMonthlyTotal == null && other.getRecurMonthlyTotal() == null || this.recurMonthlyTotal != null && this.recurMonthlyTotal.equals(other.getRecurMonthlyTotal())) && (this.recurQuarterlyTotal == null && other.getRecurQuarterlyTotal() == null || this.recurQuarterlyTotal != null && this.recurQuarterlyTotal.equals(other.getRecurQuarterlyTotal())) && (this.recurringBill == null && other.getRecurringBill() == null || this.recurringBill != null && this.recurringBill.equals(other.getRecurringBill())) && (this.recurWeeklyTotal == null && other.getRecurWeeklyTotal() == null || this.recurWeeklyTotal != null && this.recurWeeklyTotal.equals(other.getRecurWeeklyTotal())) && (this.refNumber == null && other.getRefNumber() == null || this.refNumber != null && this.refNumber.equals(other.getRefNumber())) && (this.requestedDate == null && other.getRequestedDate() == null || this.requestedDate != null && this.requestedDate.equals(other.getRequestedDate())) && (this.revCommitStatus == null && other.getRevCommitStatus() == null || this.revCommitStatus != null && this.revCommitStatus.equals(other.getRevCommitStatus())) && (this.revCommittingStatus == null && other.getRevCommittingStatus() == null || this.revCommittingStatus != null && this.revCommittingStatus.equals(other.getRevCommittingStatus())) && (this.revCommittingTransaction == null && other.getRevCommittingTransaction() == null || this.revCommittingTransaction != null && this.revCommittingTransaction.equals(other.getRevCommittingTransaction())) && (this.revenueStatus == null && other.getRevenueStatus() == null || this.revenueStatus != null && this.revenueStatus.equals(other.getRevenueStatus())) && (this.reversalDate == null && other.getReversalDate() == null || this.reversalDate != null && this.reversalDate.equals(other.getReversalDate())) && (this.reversalNumber == null && other.getReversalNumber() == null || this.reversalNumber != null && this.reversalNumber.equals(other.getReversalNumber())) && (this.revRecEndDate == null && other.getRevRecEndDate() == null || this.revRecEndDate != null && this.revRecEndDate.equals(other.getRevRecEndDate())) && (this.revRecOnRevCommitment == null && other.getRevRecOnRevCommitment() == null || this.revRecOnRevCommitment != null && this.revRecOnRevCommitment.equals(other.getRevRecOnRevCommitment())) && (this.revRecStartDate == null && other.getRevRecStartDate() == null || this.revRecStartDate != null && this.revRecStartDate.equals(other.getRevRecStartDate())) && (this.revRecTermInMonths == null && other.getRevRecTermInMonths() == null || this.revRecTermInMonths != null && this.revRecTermInMonths.equals(other.getRevRecTermInMonths())) && (this.salesEffectiveDate == null && other.getSalesEffectiveDate() == null || this.salesEffectiveDate != null && this.salesEffectiveDate.equals(other.getSalesEffectiveDate())) && (this.salesOrder == null && other.getSalesOrder() == null || this.salesOrder != null && this.salesOrder.equals(other.getSalesOrder())) && (this.salesRep == null && other.getSalesRep() == null || this.salesRep != null && this.salesRep.equals(other.getSalesRep())) && (this.salesTeamMember == null && other.getSalesTeamMember() == null || this.salesTeamMember != null && this.salesTeamMember.equals(other.getSalesTeamMember())) && (this.salesTeamRole == null && other.getSalesTeamRole() == null || this.salesTeamRole != null && this.salesTeamRole.equals(other.getSalesTeamRole())) && (this.schedulingMethod == null && other.getSchedulingMethod() == null || this.schedulingMethod != null && this.schedulingMethod.equals(other.getSchedulingMethod())) && (this.serialNumber == null && other.getSerialNumber() == null || this.serialNumber != null && this.serialNumber.equals(other.getSerialNumber())) && (this.serialNumberCost == null && other.getSerialNumberCost() == null || this.serialNumberCost != null && this.serialNumberCost.equals(other.getSerialNumberCost())) && (this.serialNumberCostAdjustment == null && other.getSerialNumberCostAdjustment() == null || this.serialNumberCostAdjustment != null && this.serialNumberCostAdjustment.equals(other.getSerialNumberCostAdjustment())) && (this.serialNumberQuantity == null && other.getSerialNumberQuantity() == null || this.serialNumberQuantity != null && this.serialNumberQuantity.equals(other.getSerialNumberQuantity())) && (this.serialNumbers == null && other.getSerialNumbers() == null || this.serialNumbers != null && this.serialNumbers.equals(other.getSerialNumbers())) && (this.shipAddress == null && other.getShipAddress() == null || this.shipAddress != null && this.shipAddress.equals(other.getShipAddress())) && (this.shipAddressee == null && other.getShipAddressee() == null || this.shipAddressee != null && this.shipAddressee.equals(other.getShipAddressee())) && (this.shipAttention == null && other.getShipAttention() == null || this.shipAttention != null && this.shipAttention.equals(other.getShipAttention())) && (this.shipCarrier == null && other.getShipCarrier() == null || this.shipCarrier != null && this.shipCarrier.equals(other.getShipCarrier())) && (this.shipCity == null && other.getShipCity() == null || this.shipCity != null && this.shipCity.equals(other.getShipCity())) && (this.shipComplete == null && other.getShipComplete() == null || this.shipComplete != null && this.shipComplete.equals(other.getShipComplete())) && (this.shipCountry == null && other.getShipCountry() == null || this.shipCountry != null && this.shipCountry.equals(other.getShipCountry())) && (this.shipCounty == null && other.getShipCounty() == null || this.shipCounty != null && this.shipCounty.equals(other.getShipCounty())) && (this.shipDate == null && other.getShipDate() == null || this.shipDate != null && this.shipDate.equals(other.getShipDate())) && (this.shipGroup == null && other.getShipGroup() == null || this.shipGroup != null && this.shipGroup.equals(other.getShipGroup())) && (this.shipMethod == null && other.getShipMethod() == null || this.shipMethod != null && this.shipMethod.equals(other.getShipMethod())) && (this.shipPhone == null && other.getShipPhone() == null || this.shipPhone != null && this.shipPhone.equals(other.getShipPhone())) && (this.shipping == null && other.getShipping() == null || this.shipping != null && this.shipping.equals(other.getShipping())) && (this.shipRecvStatus == null && other.getShipRecvStatus() == null || this.shipRecvStatus != null && this.shipRecvStatus.equals(other.getShipRecvStatus())) && (this.shipRecvStatusLine == null && other.getShipRecvStatusLine() == null || this.shipRecvStatusLine != null && this.shipRecvStatusLine.equals(other.getShipRecvStatusLine())) && (this.shipState == null && other.getShipState() == null || this.shipState != null && this.shipState.equals(other.getShipState())) && (this.shipTo == null && other.getShipTo() == null || this.shipTo != null && this.shipTo.equals(other.getShipTo())) && (this.shipZip == null && other.getShipZip() == null || this.shipZip != null && this.shipZip.equals(other.getShipZip())) && (this.source == null && other.getSource() == null || this.source != null && this.source.equals(other.getSource())) && (this.startDate == null && other.getStartDate() == null || this.startDate != null && this.startDate.equals(other.getStartDate())) && (this.statistical == null && other.getStatistical() == null || this.statistical != null && this.statistical.equals(other.getStatistical())) && (this.status == null && other.getStatus() == null || this.status != null && this.status.equals(other.getStatus())) && (this.subscription == null && other.getSubscription() == null || this.subscription != null && this.subscription.equals(other.getSubscription())) && (this.subscriptionLine == null && other.getSubscriptionLine() == null || this.subscriptionLine != null && this.subscriptionLine.equals(other.getSubscriptionLine())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && this.subsidiary.equals(other.getSubsidiary())) && (this.subsidiaryTaxRegNum == null && other.getSubsidiaryTaxRegNum() == null || this.subsidiaryTaxRegNum != null && this.subsidiaryTaxRegNum.equals(other.getSubsidiaryTaxRegNum())) && (this.taxItem == null && other.getTaxItem() == null || this.taxItem != null && this.taxItem.equals(other.getTaxItem())) && (this.taxLine == null && other.getTaxLine() == null || this.taxLine != null && this.taxLine.equals(other.getTaxLine())) && (this.taxPeriod == null && other.getTaxPeriod() == null || this.taxPeriod != null && this.taxPeriod.equals(other.getTaxPeriod())) && (this.taxPeriodRelative == null && other.getTaxPeriodRelative() == null || this.taxPeriodRelative != null && this.taxPeriodRelative.equals(other.getTaxPeriodRelative())) && (this.taxPointDate == null && other.getTaxPointDate() == null || this.taxPointDate != null && this.taxPointDate.equals(other.getTaxPointDate())) && (this.taxRate == null && other.getTaxRate() == null || this.taxRate != null && this.taxRate.equals(other.getTaxRate())) && (this.terms == null && other.getTerms() == null || this.terms != null && this.terms.equals(other.getTerms())) && (this.termsOfSale == null && other.getTermsOfSale() == null || this.termsOfSale != null && this.termsOfSale.equals(other.getTermsOfSale())) && (this.title == null && other.getTitle() == null || this.title != null && this.title.equals(other.getTitle())) && (this.toBeEmailed == null && other.getToBeEmailed() == null || this.toBeEmailed != null && this.toBeEmailed.equals(other.getToBeEmailed())) && (this.toBePrinted == null && other.getToBePrinted() == null || this.toBePrinted != null && this.toBePrinted.equals(other.getToBePrinted())) && (this.toSubsidiary == null && other.getToSubsidiary() == null || this.toSubsidiary != null && this.toSubsidiary.equals(other.getToSubsidiary())) && (this.totalAmount == null && other.getTotalAmount() == null || this.totalAmount != null && this.totalAmount.equals(other.getTotalAmount())) && (this.trackingNumbers == null && other.getTrackingNumbers() == null || this.trackingNumbers != null && this.trackingNumbers.equals(other.getTrackingNumbers())) && (this.tranCostEstimate == null && other.getTranCostEstimate() == null || this.tranCostEstimate != null && this.tranCostEstimate.equals(other.getTranCostEstimate())) && (this.tranDate == null && other.getTranDate() == null || this.tranDate != null && this.tranDate.equals(other.getTranDate())) && (this.tranEstGrossProfit == null && other.getTranEstGrossProfit() == null || this.tranEstGrossProfit != null && this.tranEstGrossProfit.equals(other.getTranEstGrossProfit())) && (this.tranEstGrossProfitPct == null && other.getTranEstGrossProfitPct() == null || this.tranEstGrossProfitPct != null && this.tranEstGrossProfitPct.equals(other.getTranEstGrossProfitPct())) && (this.tranFxEstGrossProfit == null && other.getTranFxEstGrossProfit() == null || this.tranFxEstGrossProfit != null && this.tranFxEstGrossProfit.equals(other.getTranFxEstGrossProfit())) && (this.tranId == null && other.getTranId() == null || this.tranId != null && this.tranId.equals(other.getTranId())) && (this.tranIsVsoeBundle == null && other.getTranIsVsoeBundle() == null || this.tranIsVsoeBundle != null && this.tranIsVsoeBundle.equals(other.getTranIsVsoeBundle())) && (this.transactionDiscount == null && other.getTransactionDiscount() == null || this.transactionDiscount != null && this.transactionDiscount.equals(other.getTransactionDiscount())) && (this.transactionLineType == null && other.getTransactionLineType() == null || this.transactionLineType != null && this.transactionLineType.equals(other.getTransactionLineType())) && (this.transactionNumber == null && other.getTransactionNumber() == null || this.transactionNumber != null && this.transactionNumber.equals(other.getTransactionNumber())) && (this.transferLocation == null && other.getTransferLocation() == null || this.transferLocation != null && this.transferLocation.equals(other.getTransferLocation())) && (this.transferOrderQuantityCommitted == null && other.getTransferOrderQuantityCommitted() == null || this.transferOrderQuantityCommitted != null && this.transferOrderQuantityCommitted.equals(other.getTransferOrderQuantityCommitted())) && (this.transferOrderQuantityPacked == null && other.getTransferOrderQuantityPacked() == null || this.transferOrderQuantityPacked != null && this.transferOrderQuantityPacked.equals(other.getTransferOrderQuantityPacked())) && (this.transferOrderQuantityPicked == null && other.getTransferOrderQuantityPicked() == null || this.transferOrderQuantityPicked != null && this.transferOrderQuantityPicked.equals(other.getTransferOrderQuantityPicked())) && (this.transferOrderQuantityReceived == null && other.getTransferOrderQuantityReceived() == null || this.transferOrderQuantityReceived != null && this.transferOrderQuantityReceived.equals(other.getTransferOrderQuantityReceived())) && (this.transferOrderQuantityShipped == null && other.getTransferOrderQuantityShipped() == null || this.transferOrderQuantityShipped != null && this.transferOrderQuantityShipped.equals(other.getTransferOrderQuantityShipped())) && (this.type == null && other.getType() == null || this.type != null && this.type.equals(other.getType())) && (this.unit == null && other.getUnit() == null || this.unit != null && this.unit.equals(other.getUnit())) && (this.unitCostOverride == null && other.getUnitCostOverride() == null || this.unitCostOverride != null && this.unitCostOverride.equals(other.getUnitCostOverride())) && (this.unitsType == null && other.getUnitsType() == null || this.unitsType != null && this.unitsType.equals(other.getUnitsType())) && (this.vendType == null && other.getVendType() == null || this.vendType != null && this.vendType.equals(other.getVendType())) && (this.visibleToCustomer == null && other.getVisibleToCustomer() == null || this.visibleToCustomer != null && this.visibleToCustomer.equals(other.getVisibleToCustomer())) && (this.voided == null && other.getVoided() == null || this.voided != null && this.voided.equals(other.getVoided())) && (this.vsoeAllocation == null && other.getVsoeAllocation() == null || this.vsoeAllocation != null && this.vsoeAllocation.equals(other.getVsoeAllocation())) && (this.vsoeAmount == null && other.getVsoeAmount() == null || this.vsoeAmount != null && this.vsoeAmount.equals(other.getVsoeAmount())) && (this.vsoeDeferral == null && other.getVsoeDeferral() == null || this.vsoeDeferral != null && this.vsoeDeferral.equals(other.getVsoeDeferral())) && (this.vsoeDelivered == null && other.getVsoeDelivered() == null || this.vsoeDelivered != null && this.vsoeDelivered.equals(other.getVsoeDelivered())) && (this.vsoePermitDiscount == null && other.getVsoePermitDiscount() == null || this.vsoePermitDiscount != null && this.vsoePermitDiscount.equals(other.getVsoePermitDiscount())) && (this.vsoePrice == null && other.getVsoePrice() == null || this.vsoePrice != null && this.vsoePrice.equals(other.getVsoePrice())) && (this.webSite == null && other.getWebSite() == null || this.webSite != null && this.webSite.equals(other.getWebSite())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
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
        if (this.getAccount() != null) {
            _hashCode += this.getAccount().hashCode();
        }
        if (this.getAccountType() != null) {
            _hashCode += this.getAccountType().hashCode();
        }
        if (this.getAcctCorpCardExp() != null) {
            _hashCode += this.getAcctCorpCardExp().hashCode();
        }
        if (this.getActualProductionEndDate() != null) {
            _hashCode += this.getActualProductionEndDate().hashCode();
        }
        if (this.getActualProductionStartDate() != null) {
            _hashCode += this.getActualProductionStartDate().hashCode();
        }
        if (this.getActualShipDate() != null) {
            _hashCode += this.getActualShipDate().hashCode();
        }
        if (this.getAltSalesAmount() != null) {
            _hashCode += this.getAltSalesAmount().hashCode();
        }
        if (this.getAltSalesNetAmount() != null) {
            _hashCode += this.getAltSalesNetAmount().hashCode();
        }
        if (this.getAmount() != null) {
            _hashCode += this.getAmount().hashCode();
        }
        if (this.getAmountPaid() != null) {
            _hashCode += this.getAmountPaid().hashCode();
        }
        if (this.getAmountRemaining() != null) {
            _hashCode += this.getAmountRemaining().hashCode();
        }
        if (this.getAmountUnbilled() != null) {
            _hashCode += this.getAmountUnbilled().hashCode();
        }
        if (this.getAnyLineItem() != null) {
            _hashCode += this.getAnyLineItem().hashCode();
        }
        if (this.getAppliedToForeignAmount() != null) {
            _hashCode += this.getAppliedToForeignAmount().hashCode();
        }
        if (this.getAppliedToIsFxVariance() != null) {
            _hashCode += this.getAppliedToIsFxVariance().hashCode();
        }
        if (this.getAppliedToLinkAmount() != null) {
            _hashCode += this.getAppliedToLinkAmount().hashCode();
        }
        if (this.getAppliedToLinkType() != null) {
            _hashCode += this.getAppliedToLinkType().hashCode();
        }
        if (this.getAppliedToTransaction() != null) {
            _hashCode += this.getAppliedToTransaction().hashCode();
        }
        if (this.getApplyingForeignAmount() != null) {
            _hashCode += this.getApplyingForeignAmount().hashCode();
        }
        if (this.getApplyingIsFxVariance() != null) {
            _hashCode += this.getApplyingIsFxVariance().hashCode();
        }
        if (this.getApplyingLinkAmount() != null) {
            _hashCode += this.getApplyingLinkAmount().hashCode();
        }
        if (this.getApplyingLinkType() != null) {
            _hashCode += this.getApplyingLinkType().hashCode();
        }
        if (this.getApplyingTransaction() != null) {
            _hashCode += this.getApplyingTransaction().hashCode();
        }
        if (this.getApprovalStatus() != null) {
            _hashCode += this.getApprovalStatus().hashCode();
        }
        if (this.getAuthCode() != null) {
            _hashCode += this.getAuthCode().hashCode();
        }
        if (this.getAutoCalculateLag() != null) {
            _hashCode += this.getAutoCalculateLag().hashCode();
        }
        if (this.getAvsStreetMatch() != null) {
            _hashCode += this.getAvsStreetMatch().hashCode();
        }
        if (this.getAvsZipMatch() != null) {
            _hashCode += this.getAvsZipMatch().hashCode();
        }
        if (this.getBillable() != null) {
            _hashCode += this.getBillable().hashCode();
        }
        if (this.getBillAddress() != null) {
            _hashCode += this.getBillAddress().hashCode();
        }
        if (this.getBillAddressee() != null) {
            _hashCode += this.getBillAddressee().hashCode();
        }
        if (this.getBillAttention() != null) {
            _hashCode += this.getBillAttention().hashCode();
        }
        if (this.getBillCity() != null) {
            _hashCode += this.getBillCity().hashCode();
        }
        if (this.getBillCountry() != null) {
            _hashCode += this.getBillCountry().hashCode();
        }
        if (this.getBillCounty() != null) {
            _hashCode += this.getBillCounty().hashCode();
        }
        if (this.getBilledDate() != null) {
            _hashCode += this.getBilledDate().hashCode();
        }
        if (this.getBillingAccount() != null) {
            _hashCode += this.getBillingAccount().hashCode();
        }
        if (this.getBillingSchedule() != null) {
            _hashCode += this.getBillingSchedule().hashCode();
        }
        if (this.getBillingStatus() != null) {
            _hashCode += this.getBillingStatus().hashCode();
        }
        if (this.getBillingTransaction() != null) {
            _hashCode += this.getBillingTransaction().hashCode();
        }
        if (this.getBillPhone() != null) {
            _hashCode += this.getBillPhone().hashCode();
        }
        if (this.getBillState() != null) {
            _hashCode += this.getBillState().hashCode();
        }
        if (this.getBillVarianceStatus() != null) {
            _hashCode += this.getBillVarianceStatus().hashCode();
        }
        if (this.getBillZip() != null) {
            _hashCode += this.getBillZip().hashCode();
        }
        if (this.getBinNumber() != null) {
            _hashCode += this.getBinNumber().hashCode();
        }
        if (this.getBinNumberQuantity() != null) {
            _hashCode += this.getBinNumberQuantity().hashCode();
        }
        if (this.getBomQuantity() != null) {
            _hashCode += this.getBomQuantity().hashCode();
        }
        if (this.getBookSpecificTransaction() != null) {
            _hashCode += this.getBookSpecificTransaction().hashCode();
        }
        if (this.getBuildEntireAssembly() != null) {
            _hashCode += this.getBuildEntireAssembly().hashCode();
        }
        if (this.getBuildVariance() != null) {
            _hashCode += this.getBuildVariance().hashCode();
        }
        if (this.getBuilt() != null) {
            _hashCode += this.getBuilt().hashCode();
        }
        if (this.getCanHaveStackablePromotions() != null) {
            _hashCode += this.getCanHaveStackablePromotions().hashCode();
        }
        if (this.getCatchUpPeriod() != null) {
            _hashCode += this.getCatchUpPeriod().hashCode();
        }
        if (this.getCcCustomerCode() != null) {
            _hashCode += this.getCcCustomerCode().hashCode();
        }
        if (this.getCcExpireDate() != null) {
            _hashCode += this.getCcExpireDate().hashCode();
        }
        if (this.getCcName() != null) {
            _hashCode += this.getCcName().hashCode();
        }
        if (this.getCcNumber() != null) {
            _hashCode += this.getCcNumber().hashCode();
        }
        if (this.getChargeType() != null) {
            _hashCode += this.getChargeType().hashCode();
        }
        if (this.get_class() != null) {
            _hashCode += this.get_class().hashCode();
        }
        if (this.getCleared() != null) {
            _hashCode += this.getCleared().hashCode();
        }
        if (this.getClosed() != null) {
            _hashCode += this.getClosed().hashCode();
        }
        if (this.getCloseDate() != null) {
            _hashCode += this.getCloseDate().hashCode();
        }
        if (this.getCogs() != null) {
            _hashCode += this.getCogs().hashCode();
        }
        if (this.getCommissionEffectiveDate() != null) {
            _hashCode += this.getCommissionEffectiveDate().hashCode();
        }
        if (this.getCommit() != null) {
            _hashCode += this.getCommit().hashCode();
        }
        if (this.getComponentYield() != null) {
            _hashCode += this.getComponentYield().hashCode();
        }
        if (this.getConfirmationNumber() != null) {
            _hashCode += this.getConfirmationNumber().hashCode();
        }
        if (this.getContribution() != null) {
            _hashCode += this.getContribution().hashCode();
        }
        if (this.getCostComponentAmount() != null) {
            _hashCode += this.getCostComponentAmount().hashCode();
        }
        if (this.getCostComponentCategory() != null) {
            _hashCode += this.getCostComponentCategory().hashCode();
        }
        if (this.getCostComponentItem() != null) {
            _hashCode += this.getCostComponentItem().hashCode();
        }
        if (this.getCostComponentQuantity() != null) {
            _hashCode += this.getCostComponentQuantity().hashCode();
        }
        if (this.getCostComponentStandardCost() != null) {
            _hashCode += this.getCostComponentStandardCost().hashCode();
        }
        if (this.getCostEstimate() != null) {
            _hashCode += this.getCostEstimate().hashCode();
        }
        if (this.getCostEstimateRate() != null) {
            _hashCode += this.getCostEstimateRate().hashCode();
        }
        if (this.getCostEstimateType() != null) {
            _hashCode += this.getCostEstimateType().hashCode();
        }
        if (this.getCreatedBy() != null) {
            _hashCode += this.getCreatedBy().hashCode();
        }
        if (this.getCreatedFrom() != null) {
            _hashCode += this.getCreatedFrom().hashCode();
        }
        if (this.getCreditAmount() != null) {
            _hashCode += this.getCreditAmount().hashCode();
        }
        if (this.getCscMatch() != null) {
            _hashCode += this.getCscMatch().hashCode();
        }
        if (this.getCurrency() != null) {
            _hashCode += this.getCurrency().hashCode();
        }
        if (this.getCustomerSubOf() != null) {
            _hashCode += this.getCustomerSubOf().hashCode();
        }
        if (this.getCustomForm() != null) {
            _hashCode += this.getCustomForm().hashCode();
        }
        if (this.getCustomGL() != null) {
            _hashCode += this.getCustomGL().hashCode();
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
        if (this.getDaysOverdue() != null) {
            _hashCode += this.getDaysOverdue().hashCode();
        }
        if (this.getDebitAmount() != null) {
            _hashCode += this.getDebitAmount().hashCode();
        }
        if (this.getDeferredRevenue() != null) {
            _hashCode += this.getDeferredRevenue().hashCode();
        }
        if (this.getDeferRevRec() != null) {
            _hashCode += this.getDeferRevRec().hashCode();
        }
        if (this.getDepartment() != null) {
            _hashCode += this.getDepartment().hashCode();
        }
        if (this.getDepositDate() != null) {
            _hashCode += this.getDepositDate().hashCode();
        }
        if (this.getDepositTransaction() != null) {
            _hashCode += this.getDepositTransaction().hashCode();
        }
        if (this.getDrAccount() != null) {
            _hashCode += this.getDrAccount().hashCode();
        }
        if (this.getDueDate() != null) {
            _hashCode += this.getDueDate().hashCode();
        }
        if (this.getEmail() != null) {
            _hashCode += this.getEmail().hashCode();
        }
        if (this.getEmployee() != null) {
            _hashCode += this.getEmployee().hashCode();
        }
        if (this.getEndDate() != null) {
            _hashCode += this.getEndDate().hashCode();
        }
        if (this.getEntity() != null) {
            _hashCode += this.getEntity().hashCode();
        }
        if (this.getEntityStatus() != null) {
            _hashCode += this.getEntityStatus().hashCode();
        }
        if (this.getEstGrossProfit() != null) {
            _hashCode += this.getEstGrossProfit().hashCode();
        }
        if (this.getEstGrossProfitPct() != null) {
            _hashCode += this.getEstGrossProfitPct().hashCode();
        }
        if (this.getExchangeRate() != null) {
            _hashCode += this.getExchangeRate().hashCode();
        }
        if (this.getExcludeCommission() != null) {
            _hashCode += this.getExcludeCommission().hashCode();
        }
        if (this.getExcludeFromRateRequest() != null) {
            _hashCode += this.getExcludeFromRateRequest().hashCode();
        }
        if (this.getExpectedCloseDate() != null) {
            _hashCode += this.getExpectedCloseDate().hashCode();
        }
        if (this.getExpectedReceiptDate() != null) {
            _hashCode += this.getExpectedReceiptDate().hashCode();
        }
        if (this.getExpenseCategory() != null) {
            _hashCode += this.getExpenseCategory().hashCode();
        }
        if (this.getExpenseDate() != null) {
            _hashCode += this.getExpenseDate().hashCode();
        }
        if (this.getExternalId() != null) {
            _hashCode += this.getExternalId().hashCode();
        }
        if (this.getExternalIdString() != null) {
            _hashCode += this.getExternalIdString().hashCode();
        }
        if (this.getFinChrg() != null) {
            _hashCode += this.getFinChrg().hashCode();
        }
        if (this.getFirmed() != null) {
            _hashCode += this.getFirmed().hashCode();
        }
        if (this.getForecastType() != null) {
            _hashCode += this.getForecastType().hashCode();
        }
        if (this.getFulfillingTransaction() != null) {
            _hashCode += this.getFulfillingTransaction().hashCode();
        }
        if (this.getFxAccount() != null) {
            _hashCode += this.getFxAccount().hashCode();
        }
        if (this.getFxAmount() != null) {
            _hashCode += this.getFxAmount().hashCode();
        }
        if (this.getFxCostEstimate() != null) {
            _hashCode += this.getFxCostEstimate().hashCode();
        }
        if (this.getFxCostEstimateRate() != null) {
            _hashCode += this.getFxCostEstimateRate().hashCode();
        }
        if (this.getFxEstGrossProfit() != null) {
            _hashCode += this.getFxEstGrossProfit().hashCode();
        }
        if (this.getFxTranCostEstimate() != null) {
            _hashCode += this.getFxTranCostEstimate().hashCode();
        }
        if (this.getFxVsoeAllocation() != null) {
            _hashCode += this.getFxVsoeAllocation().hashCode();
        }
        if (this.getFxVsoeAmount() != null) {
            _hashCode += this.getFxVsoeAmount().hashCode();
        }
        if (this.getFxVsoePrice() != null) {
            _hashCode += this.getFxVsoePrice().hashCode();
        }
        if (this.getGcoAvailabelToCharge() != null) {
            _hashCode += this.getGcoAvailabelToCharge().hashCode();
        }
        if (this.getGcoAvailableToRefund() != null) {
            _hashCode += this.getGcoAvailableToRefund().hashCode();
        }
        if (this.getGcoAvsStreetMatch() != null) {
            _hashCode += this.getGcoAvsStreetMatch().hashCode();
        }
        if (this.getGcoAvsZipMatch() != null) {
            _hashCode += this.getGcoAvsZipMatch().hashCode();
        }
        if (this.getGcoBuyerAccountAge() != null) {
            _hashCode += this.getGcoBuyerAccountAge().hashCode();
        }
        if (this.getGcoBuyerIp() != null) {
            _hashCode += this.getGcoBuyerIp().hashCode();
        }
        if (this.getGcoChargeAmount() != null) {
            _hashCode += this.getGcoChargeAmount().hashCode();
        }
        if (this.getGcoChargebackAmount() != null) {
            _hashCode += this.getGcoChargebackAmount().hashCode();
        }
        if (this.getGcoConfirmedChargedTotal() != null) {
            _hashCode += this.getGcoConfirmedChargedTotal().hashCode();
        }
        if (this.getGcoConfirmedRefundedTotal() != null) {
            _hashCode += this.getGcoConfirmedRefundedTotal().hashCode();
        }
        if (this.getGcoCreditcardNumber() != null) {
            _hashCode += this.getGcoCreditcardNumber().hashCode();
        }
        if (this.getGcoCscMatch() != null) {
            _hashCode += this.getGcoCscMatch().hashCode();
        }
        if (this.getGcoFinancialState() != null) {
            _hashCode += this.getGcoFinancialState().hashCode();
        }
        if (this.getGcoFulfillmentState() != null) {
            _hashCode += this.getGcoFulfillmentState().hashCode();
        }
        if (this.getGcoOrderId() != null) {
            _hashCode += this.getGcoOrderId().hashCode();
        }
        if (this.getGcoOrderTotal() != null) {
            _hashCode += this.getGcoOrderTotal().hashCode();
        }
        if (this.getGcoPromotionAmount() != null) {
            _hashCode += this.getGcoPromotionAmount().hashCode();
        }
        if (this.getGcoPromotionName() != null) {
            _hashCode += this.getGcoPromotionName().hashCode();
        }
        if (this.getGcoRefundAmount() != null) {
            _hashCode += this.getGcoRefundAmount().hashCode();
        }
        if (this.getGcoShippingTotal() != null) {
            _hashCode += this.getGcoShippingTotal().hashCode();
        }
        if (this.getGcoStateChangedDetail() != null) {
            _hashCode += this.getGcoStateChangedDetail().hashCode();
        }
        if (this.getGiftCertificate() != null) {
            _hashCode += this.getGiftCertificate().hashCode();
        }
        if (this.getGrossAmount() != null) {
            _hashCode += this.getGrossAmount().hashCode();
        }
        if (this.getIncludeInForecast() != null) {
            _hashCode += this.getIncludeInForecast().hashCode();
        }
        if (this.getIncoterm() != null) {
            _hashCode += this.getIncoterm().hashCode();
        }
        if (this.getIntercoStatus() != null) {
            _hashCode += this.getIntercoStatus().hashCode();
        }
        if (this.getIntercoTransaction() != null) {
            _hashCode += this.getIntercoTransaction().hashCode();
        }
        if (this.getInternalId() != null) {
            _hashCode += this.getInternalId().hashCode();
        }
        if (this.getInternalIdNumber() != null) {
            _hashCode += this.getInternalIdNumber().hashCode();
        }
        if (this.getInventoryLocation() != null) {
            _hashCode += this.getInventoryLocation().hashCode();
        }
        if (this.getInventorySubsidiary() != null) {
            _hashCode += this.getInventorySubsidiary().hashCode();
        }
        if (this.getInVsoeBundle() != null) {
            _hashCode += this.getInVsoeBundle().hashCode();
        }
        if (this.getIsAllocation() != null) {
            _hashCode += this.getIsAllocation().hashCode();
        }
        if (this.getIsBackflush() != null) {
            _hashCode += this.getIsBackflush().hashCode();
        }
        if (this.getIsGcoChargeback() != null) {
            _hashCode += this.getIsGcoChargeback().hashCode();
        }
        if (this.getIsGcoChargeConfirmed() != null) {
            _hashCode += this.getIsGcoChargeConfirmed().hashCode();
        }
        if (this.getIsGcoPaymentGuaranteed() != null) {
            _hashCode += this.getIsGcoPaymentGuaranteed().hashCode();
        }
        if (this.getIsGcoRefundConfirmed() != null) {
            _hashCode += this.getIsGcoRefundConfirmed().hashCode();
        }
        if (this.getIsInsideDelivery() != null) {
            _hashCode += this.getIsInsideDelivery().hashCode();
        }
        if (this.getIsInsidePickup() != null) {
            _hashCode += this.getIsInsidePickup().hashCode();
        }
        if (this.getIsIntercompanyAdjustment() != null) {
            _hashCode += this.getIsIntercompanyAdjustment().hashCode();
        }
        if (this.getIsInTransitPayment() != null) {
            _hashCode += this.getIsInTransitPayment().hashCode();
        }
        if (this.getIsMultiShipTo() != null) {
            _hashCode += this.getIsMultiShipTo().hashCode();
        }
        if (this.getIsPayPalMeth() != null) {
            _hashCode += this.getIsPayPalMeth().hashCode();
        }
        if (this.getIsReversal() != null) {
            _hashCode += this.getIsReversal().hashCode();
        }
        if (this.getIsRevRecTransaction() != null) {
            _hashCode += this.getIsRevRecTransaction().hashCode();
        }
        if (this.getIsScrap() != null) {
            _hashCode += this.getIsScrap().hashCode();
        }
        if (this.getIsShipAddress() != null) {
            _hashCode += this.getIsShipAddress().hashCode();
        }
        if (this.getIsTransferPriceCosting() != null) {
            _hashCode += this.getIsTransferPriceCosting().hashCode();
        }
        if (this.getIsVsoeAlloc() != null) {
            _hashCode += this.getIsVsoeAlloc().hashCode();
        }
        if (this.getIsWip() != null) {
            _hashCode += this.getIsWip().hashCode();
        }
        if (this.getItem() != null) {
            _hashCode += this.getItem().hashCode();
        }
        if (this.getItemFulfillmentChoice() != null) {
            _hashCode += this.getItemFulfillmentChoice().hashCode();
        }
        if (this.getItemRevision() != null) {
            _hashCode += this.getItemRevision().hashCode();
        }
        if (this.getItemSubOf() != null) {
            _hashCode += this.getItemSubOf().hashCode();
        }
        if (this.getLandedCostPerLine() != null) {
            _hashCode += this.getLandedCostPerLine().hashCode();
        }
        if (this.getLastModifiedDate() != null) {
            _hashCode += this.getLastModifiedDate().hashCode();
        }
        if (this.getLeadSource() != null) {
            _hashCode += this.getLeadSource().hashCode();
        }
        if (this.getLineUniqueKey() != null) {
            _hashCode += this.getLineUniqueKey().hashCode();
        }
        if (this.getLocation() != null) {
            _hashCode += this.getLocation().hashCode();
        }
        if (this.getLocationAutoAssigned() != null) {
            _hashCode += this.getLocationAutoAssigned().hashCode();
        }
        if (this.getMainLine() != null) {
            _hashCode += this.getMainLine().hashCode();
        }
        if (this.getMainName() != null) {
            _hashCode += this.getMainName().hashCode();
        }
        if (this.getManufacturingRouting() != null) {
            _hashCode += this.getManufacturingRouting().hashCode();
        }
        if (this.getMatchBillToReceipt() != null) {
            _hashCode += this.getMatchBillToReceipt().hashCode();
        }
        if (this.getMemo() != null) {
            _hashCode += this.getMemo().hashCode();
        }
        if (this.getMemoMain() != null) {
            _hashCode += this.getMemoMain().hashCode();
        }
        if (this.getMemorized() != null) {
            _hashCode += this.getMemorized().hashCode();
        }
        if (this.getMerchantAccount() != null) {
            _hashCode += this.getMerchantAccount().hashCode();
        }
        if (this.getMessage() != null) {
            _hashCode += this.getMessage().hashCode();
        }
        if (this.getMultiSubsidiary() != null) {
            _hashCode += this.getMultiSubsidiary().hashCode();
        }
        if (this.getNameText() != null) {
            _hashCode += this.getNameText().hashCode();
        }
        if (this.getNetAmount() != null) {
            _hashCode += this.getNetAmount().hashCode();
        }
        if (this.getNextApprover() != null) {
            _hashCode += this.getNextApprover().hashCode();
        }
        if (this.getNextBillDate() != null) {
            _hashCode += this.getNextBillDate().hashCode();
        }
        if (this.getNexus() != null) {
            _hashCode += this.getNexus().hashCode();
        }
        if (this.getNoAutoAssignLocation() != null) {
            _hashCode += this.getNoAutoAssignLocation().hashCode();
        }
        if (this.getNonReimbursable() != null) {
            _hashCode += this.getNonReimbursable().hashCode();
        }
        if (this.getNumber() != null) {
            _hashCode += this.getNumber().hashCode();
        }
        if (this.getOneTimeTotal() != null) {
            _hashCode += this.getOneTimeTotal().hashCode();
        }
        if (this.getOpportunity() != null) {
            _hashCode += this.getOpportunity().hashCode();
        }
        if (this.getOrderAllocationStrategy() != null) {
            _hashCode += this.getOrderAllocationStrategy().hashCode();
        }
        if (this.getOrderPriority() != null) {
            _hashCode += this.getOrderPriority().hashCode();
        }
        if (this.getOtherRefNum() != null) {
            _hashCode += this.getOtherRefNum().hashCode();
        }
        if (this.getOtherRefNumNonDeposit() != null) {
            _hashCode += this.getOtherRefNumNonDeposit().hashCode();
        }
        if (this.getOverheadParentItem() != null) {
            _hashCode += this.getOverheadParentItem().hashCode();
        }
        if (this.getOverrideInstallments() != null) {
            _hashCode += this.getOverrideInstallments().hashCode();
        }
        if (this.getPackageCount() != null) {
            _hashCode += this.getPackageCount().hashCode();
        }
        if (this.getPaidTransaction() != null) {
            _hashCode += this.getPaidTransaction().hashCode();
        }
        if (this.getParent() != null) {
            _hashCode += this.getParent().hashCode();
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
        if (this.getPayingTransaction() != null) {
            _hashCode += this.getPayingTransaction().hashCode();
        }
        if (this.getPaymentApproved() != null) {
            _hashCode += this.getPaymentApproved().hashCode();
        }
        if (this.getPaymentEventDate() != null) {
            _hashCode += this.getPaymentEventDate().hashCode();
        }
        if (this.getPaymentEventHoldReason() != null) {
            _hashCode += this.getPaymentEventHoldReason().hashCode();
        }
        if (this.getPaymentEventPurchaseCardUsed() != null) {
            _hashCode += this.getPaymentEventPurchaseCardUsed().hashCode();
        }
        if (this.getPaymentEventPurchaseDataSent() != null) {
            _hashCode += this.getPaymentEventPurchaseDataSent().hashCode();
        }
        if (this.getPaymentEventResult() != null) {
            _hashCode += this.getPaymentEventResult().hashCode();
        }
        if (this.getPaymentEventType() != null) {
            _hashCode += this.getPaymentEventType().hashCode();
        }
        if (this.getPaymentHold() != null) {
            _hashCode += this.getPaymentHold().hashCode();
        }
        if (this.getPaymentMethod() != null) {
            _hashCode += this.getPaymentMethod().hashCode();
        }
        if (this.getPaymentOption() != null) {
            _hashCode += this.getPaymentOption().hashCode();
        }
        if (this.getPayPalPending() != null) {
            _hashCode += this.getPayPalPending().hashCode();
        }
        if (this.getPayPalStatus() != null) {
            _hashCode += this.getPayPalStatus().hashCode();
        }
        if (this.getPayPalTranId() != null) {
            _hashCode += this.getPayPalTranId().hashCode();
        }
        if (this.getPnRefNum() != null) {
            _hashCode += this.getPnRefNum().hashCode();
        }
        if (this.getPoAsText() != null) {
            _hashCode += this.getPoAsText().hashCode();
        }
        if (this.getPolicyViolated() != null) {
            _hashCode += this.getPolicyViolated().hashCode();
        }
        if (this.getPosting() != null) {
            _hashCode += this.getPosting().hashCode();
        }
        if (this.getPostingPeriod() != null) {
            _hashCode += this.getPostingPeriod().hashCode();
        }
        if (this.getPostingPeriodRelative() != null) {
            _hashCode += this.getPostingPeriodRelative().hashCode();
        }
        if (this.getPriceLevel() != null) {
            _hashCode += this.getPriceLevel().hashCode();
        }
        if (this.getPrintedPickingTicket() != null) {
            _hashCode += this.getPrintedPickingTicket().hashCode();
        }
        if (this.getProbability() != null) {
            _hashCode += this.getProbability().hashCode();
        }
        if (this.getProjectedAmount() != null) {
            _hashCode += this.getProjectedAmount().hashCode();
        }
        if (this.getProjectTask() != null) {
            _hashCode += this.getProjectTask().hashCode();
        }
        if (this.getPromoCode() != null) {
            _hashCode += this.getPromoCode().hashCode();
        }
        if (this.getPurchaseOrder() != null) {
            _hashCode += this.getPurchaseOrder().hashCode();
        }
        if (this.getQuantity() != null) {
            _hashCode += this.getQuantity().hashCode();
        }
        if (this.getQuantityBilled() != null) {
            _hashCode += this.getQuantityBilled().hashCode();
        }
        if (this.getQuantityCommitted() != null) {
            _hashCode += this.getQuantityCommitted().hashCode();
        }
        if (this.getQuantityPacked() != null) {
            _hashCode += this.getQuantityPacked().hashCode();
        }
        if (this.getQuantityPicked() != null) {
            _hashCode += this.getQuantityPicked().hashCode();
        }
        if (this.getQuantityRevCommitted() != null) {
            _hashCode += this.getQuantityRevCommitted().hashCode();
        }
        if (this.getQuantityShipRecv() != null) {
            _hashCode += this.getQuantityShipRecv().hashCode();
        }
        if (this.getRecognizedRevenue() != null) {
            _hashCode += this.getRecognizedRevenue().hashCode();
        }
        if (this.getRecordType() != null) {
            _hashCode += this.getRecordType().hashCode();
        }
        if (this.getRecurAnnuallyTotal() != null) {
            _hashCode += this.getRecurAnnuallyTotal().hashCode();
        }
        if (this.getRecurMonthlyTotal() != null) {
            _hashCode += this.getRecurMonthlyTotal().hashCode();
        }
        if (this.getRecurQuarterlyTotal() != null) {
            _hashCode += this.getRecurQuarterlyTotal().hashCode();
        }
        if (this.getRecurringBill() != null) {
            _hashCode += this.getRecurringBill().hashCode();
        }
        if (this.getRecurWeeklyTotal() != null) {
            _hashCode += this.getRecurWeeklyTotal().hashCode();
        }
        if (this.getRefNumber() != null) {
            _hashCode += this.getRefNumber().hashCode();
        }
        if (this.getRequestedDate() != null) {
            _hashCode += this.getRequestedDate().hashCode();
        }
        if (this.getRevCommitStatus() != null) {
            _hashCode += this.getRevCommitStatus().hashCode();
        }
        if (this.getRevCommittingStatus() != null) {
            _hashCode += this.getRevCommittingStatus().hashCode();
        }
        if (this.getRevCommittingTransaction() != null) {
            _hashCode += this.getRevCommittingTransaction().hashCode();
        }
        if (this.getRevenueStatus() != null) {
            _hashCode += this.getRevenueStatus().hashCode();
        }
        if (this.getReversalDate() != null) {
            _hashCode += this.getReversalDate().hashCode();
        }
        if (this.getReversalNumber() != null) {
            _hashCode += this.getReversalNumber().hashCode();
        }
        if (this.getRevRecEndDate() != null) {
            _hashCode += this.getRevRecEndDate().hashCode();
        }
        if (this.getRevRecOnRevCommitment() != null) {
            _hashCode += this.getRevRecOnRevCommitment().hashCode();
        }
        if (this.getRevRecStartDate() != null) {
            _hashCode += this.getRevRecStartDate().hashCode();
        }
        if (this.getRevRecTermInMonths() != null) {
            _hashCode += this.getRevRecTermInMonths().hashCode();
        }
        if (this.getSalesEffectiveDate() != null) {
            _hashCode += this.getSalesEffectiveDate().hashCode();
        }
        if (this.getSalesOrder() != null) {
            _hashCode += this.getSalesOrder().hashCode();
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
        if (this.getSchedulingMethod() != null) {
            _hashCode += this.getSchedulingMethod().hashCode();
        }
        if (this.getSerialNumber() != null) {
            _hashCode += this.getSerialNumber().hashCode();
        }
        if (this.getSerialNumberCost() != null) {
            _hashCode += this.getSerialNumberCost().hashCode();
        }
        if (this.getSerialNumberCostAdjustment() != null) {
            _hashCode += this.getSerialNumberCostAdjustment().hashCode();
        }
        if (this.getSerialNumberQuantity() != null) {
            _hashCode += this.getSerialNumberQuantity().hashCode();
        }
        if (this.getSerialNumbers() != null) {
            _hashCode += this.getSerialNumbers().hashCode();
        }
        if (this.getShipAddress() != null) {
            _hashCode += this.getShipAddress().hashCode();
        }
        if (this.getShipAddressee() != null) {
            _hashCode += this.getShipAddressee().hashCode();
        }
        if (this.getShipAttention() != null) {
            _hashCode += this.getShipAttention().hashCode();
        }
        if (this.getShipCarrier() != null) {
            _hashCode += this.getShipCarrier().hashCode();
        }
        if (this.getShipCity() != null) {
            _hashCode += this.getShipCity().hashCode();
        }
        if (this.getShipComplete() != null) {
            _hashCode += this.getShipComplete().hashCode();
        }
        if (this.getShipCountry() != null) {
            _hashCode += this.getShipCountry().hashCode();
        }
        if (this.getShipCounty() != null) {
            _hashCode += this.getShipCounty().hashCode();
        }
        if (this.getShipDate() != null) {
            _hashCode += this.getShipDate().hashCode();
        }
        if (this.getShipGroup() != null) {
            _hashCode += this.getShipGroup().hashCode();
        }
        if (this.getShipMethod() != null) {
            _hashCode += this.getShipMethod().hashCode();
        }
        if (this.getShipPhone() != null) {
            _hashCode += this.getShipPhone().hashCode();
        }
        if (this.getShipping() != null) {
            _hashCode += this.getShipping().hashCode();
        }
        if (this.getShipRecvStatus() != null) {
            _hashCode += this.getShipRecvStatus().hashCode();
        }
        if (this.getShipRecvStatusLine() != null) {
            _hashCode += this.getShipRecvStatusLine().hashCode();
        }
        if (this.getShipState() != null) {
            _hashCode += this.getShipState().hashCode();
        }
        if (this.getShipTo() != null) {
            _hashCode += this.getShipTo().hashCode();
        }
        if (this.getShipZip() != null) {
            _hashCode += this.getShipZip().hashCode();
        }
        if (this.getSource() != null) {
            _hashCode += this.getSource().hashCode();
        }
        if (this.getStartDate() != null) {
            _hashCode += this.getStartDate().hashCode();
        }
        if (this.getStatistical() != null) {
            _hashCode += this.getStatistical().hashCode();
        }
        if (this.getStatus() != null) {
            _hashCode += this.getStatus().hashCode();
        }
        if (this.getSubscription() != null) {
            _hashCode += this.getSubscription().hashCode();
        }
        if (this.getSubscriptionLine() != null) {
            _hashCode += this.getSubscriptionLine().hashCode();
        }
        if (this.getSubsidiary() != null) {
            _hashCode += this.getSubsidiary().hashCode();
        }
        if (this.getSubsidiaryTaxRegNum() != null) {
            _hashCode += this.getSubsidiaryTaxRegNum().hashCode();
        }
        if (this.getTaxItem() != null) {
            _hashCode += this.getTaxItem().hashCode();
        }
        if (this.getTaxLine() != null) {
            _hashCode += this.getTaxLine().hashCode();
        }
        if (this.getTaxPeriod() != null) {
            _hashCode += this.getTaxPeriod().hashCode();
        }
        if (this.getTaxPeriodRelative() != null) {
            _hashCode += this.getTaxPeriodRelative().hashCode();
        }
        if (this.getTaxPointDate() != null) {
            _hashCode += this.getTaxPointDate().hashCode();
        }
        if (this.getTaxRate() != null) {
            _hashCode += this.getTaxRate().hashCode();
        }
        if (this.getTerms() != null) {
            _hashCode += this.getTerms().hashCode();
        }
        if (this.getTermsOfSale() != null) {
            _hashCode += this.getTermsOfSale().hashCode();
        }
        if (this.getTitle() != null) {
            _hashCode += this.getTitle().hashCode();
        }
        if (this.getToBeEmailed() != null) {
            _hashCode += this.getToBeEmailed().hashCode();
        }
        if (this.getToBePrinted() != null) {
            _hashCode += this.getToBePrinted().hashCode();
        }
        if (this.getToSubsidiary() != null) {
            _hashCode += this.getToSubsidiary().hashCode();
        }
        if (this.getTotalAmount() != null) {
            _hashCode += this.getTotalAmount().hashCode();
        }
        if (this.getTrackingNumbers() != null) {
            _hashCode += this.getTrackingNumbers().hashCode();
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
        if (this.getTranIsVsoeBundle() != null) {
            _hashCode += this.getTranIsVsoeBundle().hashCode();
        }
        if (this.getTransactionDiscount() != null) {
            _hashCode += this.getTransactionDiscount().hashCode();
        }
        if (this.getTransactionLineType() != null) {
            _hashCode += this.getTransactionLineType().hashCode();
        }
        if (this.getTransactionNumber() != null) {
            _hashCode += this.getTransactionNumber().hashCode();
        }
        if (this.getTransferLocation() != null) {
            _hashCode += this.getTransferLocation().hashCode();
        }
        if (this.getTransferOrderQuantityCommitted() != null) {
            _hashCode += this.getTransferOrderQuantityCommitted().hashCode();
        }
        if (this.getTransferOrderQuantityPacked() != null) {
            _hashCode += this.getTransferOrderQuantityPacked().hashCode();
        }
        if (this.getTransferOrderQuantityPicked() != null) {
            _hashCode += this.getTransferOrderQuantityPicked().hashCode();
        }
        if (this.getTransferOrderQuantityReceived() != null) {
            _hashCode += this.getTransferOrderQuantityReceived().hashCode();
        }
        if (this.getTransferOrderQuantityShipped() != null) {
            _hashCode += this.getTransferOrderQuantityShipped().hashCode();
        }
        if (this.getType() != null) {
            _hashCode += this.getType().hashCode();
        }
        if (this.getUnit() != null) {
            _hashCode += this.getUnit().hashCode();
        }
        if (this.getUnitCostOverride() != null) {
            _hashCode += this.getUnitCostOverride().hashCode();
        }
        if (this.getUnitsType() != null) {
            _hashCode += this.getUnitsType().hashCode();
        }
        if (this.getVendType() != null) {
            _hashCode += this.getVendType().hashCode();
        }
        if (this.getVisibleToCustomer() != null) {
            _hashCode += this.getVisibleToCustomer().hashCode();
        }
        if (this.getVoided() != null) {
            _hashCode += this.getVoided().hashCode();
        }
        if (this.getVsoeAllocation() != null) {
            _hashCode += this.getVsoeAllocation().hashCode();
        }
        if (this.getVsoeAmount() != null) {
            _hashCode += this.getVsoeAmount().hashCode();
        }
        if (this.getVsoeDeferral() != null) {
            _hashCode += this.getVsoeDeferral().hashCode();
        }
        if (this.getVsoeDelivered() != null) {
            _hashCode += this.getVsoeDelivered().hashCode();
        }
        if (this.getVsoePermitDiscount() != null) {
            _hashCode += this.getVsoePermitDiscount().hashCode();
        }
        if (this.getVsoePrice() != null) {
            _hashCode += this.getVsoePrice().hashCode();
        }
        if (this.getWebSite() != null) {
            _hashCode += this.getWebSite().hashCode();
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TransactionSearchBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "account"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("accountType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "accountType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("acctCorpCardExp");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "acctCorpCardExp"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("actualProductionEndDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "actualProductionEndDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("actualProductionStartDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "actualProductionStartDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("actualShipDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "actualShipDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("altSalesAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "altSalesAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("altSalesNetAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "altSalesNetAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "amount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("amountPaid");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "amountPaid"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("amountRemaining");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "amountRemaining"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("amountUnbilled");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "amountUnbilled"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("anyLineItem");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "anyLineItem"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("appliedToForeignAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "appliedToForeignAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("appliedToIsFxVariance");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "appliedToIsFxVariance"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("appliedToLinkAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "appliedToLinkAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("appliedToLinkType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "appliedToLinkType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("appliedToTransaction");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "appliedToTransaction"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("applyingForeignAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "applyingForeignAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("applyingIsFxVariance");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "applyingIsFxVariance"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("applyingLinkAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "applyingLinkAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("applyingLinkType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "applyingLinkType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("applyingTransaction");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "applyingTransaction"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("approvalStatus");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "approvalStatus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("authCode");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "authCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("autoCalculateLag");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "autoCalculateLag"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("avsStreetMatch");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "avsStreetMatch"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("avsZipMatch");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "avsZipMatch"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billable");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billable"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billAddress");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billAddress"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billAddressee");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billAddressee"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billAttention");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billAttention"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billCity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billCity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billCountry");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billCountry"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billCounty");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billCounty"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billedDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billedDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billingAccount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billingAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billingSchedule");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billingSchedule"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billingStatus");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billingStatus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billingTransaction");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billingTransaction"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billPhone");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billPhone"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billState");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billState"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billVarianceStatus");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billVarianceStatus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billZip");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billZip"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("binNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "binNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("binNumberQuantity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "binNumberQuantity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("bomQuantity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "bomQuantity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("bookSpecificTransaction");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "bookSpecificTransaction"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("buildEntireAssembly");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "buildEntireAssembly"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("buildVariance");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "buildVariance"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("built");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "built"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("canHaveStackablePromotions");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "canHaveStackablePromotions"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("catchUpPeriod");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "catchUpPeriod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ccCustomerCode");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ccCustomerCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ccExpireDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ccExpireDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ccName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ccName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ccNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ccNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("chargeType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "chargeType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
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
        elemField.setFieldName("cleared");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "cleared"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("closed");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "closed"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("cogs");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "cogs"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("commissionEffectiveDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "commissionEffectiveDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("commit");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "commit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("componentYield");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "componentYield"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("confirmationNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "confirmationNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
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
        elemField.setFieldName("costComponentAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "costComponentAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("costComponentCategory");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "costComponentCategory"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("costComponentItem");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "costComponentItem"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("costComponentQuantity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "costComponentQuantity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("costComponentStandardCost");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "costComponentStandardCost"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("costEstimate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "costEstimate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("costEstimateRate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "costEstimateRate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("costEstimateType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "costEstimateType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("createdBy");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "createdBy"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("createdFrom");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "createdFrom"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("creditAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "creditAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("cscMatch");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "cscMatch"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
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
        elemField.setFieldName("customerSubOf");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "customerSubOf"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customForm");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customGL");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "customGL"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("daysOverdue");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "daysOverdue"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("debitAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "debitAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("deferredRevenue");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "deferredRevenue"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("deferRevRec");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "deferRevRec"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("depositDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "depositDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("depositTransaction");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "depositTransaction"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("drAccount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "drAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("dueDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "dueDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "email"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("employee");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "employee"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("estGrossProfit");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "estGrossProfit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("estGrossProfitPct");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "estGrossProfitPct"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("exchangeRate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "exchangeRate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("excludeCommission");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "excludeCommission"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("excludeFromRateRequest");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "excludeFromRateRequest"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("expectedReceiptDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "expectedReceiptDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("expenseCategory");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "expenseCategory"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("expenseDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "expenseDate"));
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
        elemField.setFieldName("finChrg");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "finChrg"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("firmed");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "firmed"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("fulfillingTransaction");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fulfillingTransaction"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fxAccount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fxAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fxAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fxAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fxCostEstimate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fxCostEstimate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fxCostEstimateRate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fxCostEstimateRate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fxEstGrossProfit");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fxEstGrossProfit"));
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
        elemField.setFieldName("fxVsoeAllocation");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fxVsoeAllocation"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fxVsoeAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fxVsoeAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fxVsoePrice");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fxVsoePrice"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("gcoAvailabelToCharge");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "gcoAvailabelToCharge"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("gcoAvailableToRefund");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "gcoAvailableToRefund"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("gcoAvsStreetMatch");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "gcoAvsStreetMatch"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("gcoAvsZipMatch");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "gcoAvsZipMatch"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("gcoBuyerAccountAge");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "gcoBuyerAccountAge"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("gcoBuyerIp");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "gcoBuyerIp"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("gcoChargeAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "gcoChargeAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("gcoChargebackAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "gcoChargebackAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("gcoConfirmedChargedTotal");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "gcoConfirmedChargedTotal"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("gcoConfirmedRefundedTotal");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "gcoConfirmedRefundedTotal"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("gcoCreditcardNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "gcoCreditcardNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("gcoCscMatch");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "gcoCscMatch"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("gcoFinancialState");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "gcoFinancialState"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("gcoFulfillmentState");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "gcoFulfillmentState"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("gcoOrderId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "gcoOrderId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("gcoOrderTotal");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "gcoOrderTotal"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("gcoPromotionAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "gcoPromotionAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("gcoPromotionName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "gcoPromotionName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("gcoRefundAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "gcoRefundAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("gcoShippingTotal");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "gcoShippingTotal"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("gcoStateChangedDetail");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "gcoStateChangedDetail"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("giftCertificate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "giftCertificate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("grossAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "grossAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("includeInForecast");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "includeInForecast"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("incoterm");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "incoterm"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("intercoStatus");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "intercoStatus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("intercoTransaction");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "intercoTransaction"));
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
        elemField.setFieldName("inventoryLocation");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "inventoryLocation"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("inventorySubsidiary");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "inventorySubsidiary"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("inVsoeBundle");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "inVsoeBundle"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isAllocation");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isAllocation"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isBackflush");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isBackflush"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isGcoChargeback");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isGcoChargeback"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isGcoChargeConfirmed");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isGcoChargeConfirmed"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isGcoPaymentGuaranteed");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isGcoPaymentGuaranteed"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isGcoRefundConfirmed");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isGcoRefundConfirmed"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isInsideDelivery");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isInsideDelivery"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isInsidePickup");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isInsidePickup"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isIntercompanyAdjustment");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isIntercompanyAdjustment"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isInTransitPayment");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isInTransitPayment"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isMultiShipTo");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isMultiShipTo"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isPayPalMeth");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isPayPalMeth"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isReversal");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isReversal"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isRevRecTransaction");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isRevRecTransaction"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isScrap");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isScrap"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isShipAddress");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isShipAddress"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isTransferPriceCosting");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isTransferPriceCosting"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isVsoeAlloc");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isVsoeAlloc"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isWip");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isWip"));
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
        elemField.setFieldName("itemFulfillmentChoice");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "itemFulfillmentChoice"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemRevision");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "itemRevision"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemSubOf");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "itemSubOf"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("landedCostPerLine");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "landedCostPerLine"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("lineUniqueKey");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lineUniqueKey"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
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
        elemField.setFieldName("locationAutoAssigned");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationAutoAssigned"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("mainLine");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "mainLine"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("mainName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "mainName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("manufacturingRouting");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "manufacturingRouting"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("matchBillToReceipt");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "matchBillToReceipt"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("memoMain");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "memoMain"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("memorized");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "memorized"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("merchantAccount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "merchantAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "message"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("multiSubsidiary");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "multiSubsidiary"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("nameText");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "nameText"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("netAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "netAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("nextApprover");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "nextApprover"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("nextBillDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "nextBillDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("nexus");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "nexus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("noAutoAssignLocation");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "noAutoAssignLocation"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("nonReimbursable");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "nonReimbursable"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("oneTimeTotal");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "oneTimeTotal"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("opportunity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "opportunity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("orderAllocationStrategy");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "orderAllocationStrategy"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("orderPriority");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "orderPriority"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("otherRefNum");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "otherRefNum"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchTextNumberField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("otherRefNumNonDeposit");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "otherRefNumNonDeposit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchTextNumberField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("overheadParentItem");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "overheadParentItem"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("overrideInstallments");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "overrideInstallments"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("packageCount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "packageCount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("paidTransaction");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "paidTransaction"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "parent"));
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
        elemField.setFieldName("payingTransaction");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "payingTransaction"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("paymentApproved");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "paymentApproved"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("paymentEventDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "paymentEventDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("paymentEventHoldReason");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "paymentEventHoldReason"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("paymentEventPurchaseCardUsed");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "paymentEventPurchaseCardUsed"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("paymentEventPurchaseDataSent");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "paymentEventPurchaseDataSent"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("paymentEventResult");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "paymentEventResult"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("paymentEventType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "paymentEventType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("paymentHold");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "paymentHold"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("paymentMethod");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "paymentMethod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("paymentOption");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "paymentOption"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("payPalPending");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "payPalPending"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("payPalStatus");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "payPalStatus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("payPalTranId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "payPalTranId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("pnRefNum");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "pnRefNum"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("poAsText");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "poAsText"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("policyViolated");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "policyViolated"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("posting");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "posting"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("priceLevel");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "priceLevel"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("printedPickingTicket");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "printedPickingTicket"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("projectedAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "projectedAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("projectTask");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "projectTask"));
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
        elemField.setFieldName("purchaseOrder");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "purchaseOrder"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "quantity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityBilled");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "quantityBilled"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityCommitted");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "quantityCommitted"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityPacked");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "quantityPacked"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityPicked");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "quantityPicked"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityRevCommitted");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "quantityRevCommitted"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityShipRecv");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "quantityShipRecv"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recognizedRevenue");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "recognizedRevenue"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recordType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "recordType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recurAnnuallyTotal");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "recurAnnuallyTotal"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recurMonthlyTotal");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "recurMonthlyTotal"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recurQuarterlyTotal");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "recurQuarterlyTotal"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recurringBill");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "recurringBill"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recurWeeklyTotal");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "recurWeeklyTotal"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("refNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "refNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("requestedDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "requestedDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revCommitStatus");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "revCommitStatus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revCommittingStatus");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "revCommittingStatus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revCommittingTransaction");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "revCommittingTransaction"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revenueStatus");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "revenueStatus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("reversalDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "reversalDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("reversalNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "reversalNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revRecEndDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "revRecEndDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revRecOnRevCommitment");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "revRecOnRevCommitment"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revRecStartDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "revRecStartDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revRecTermInMonths");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "revRecTermInMonths"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("salesEffectiveDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "salesEffectiveDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("salesOrder");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "salesOrder"));
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
        elemField.setFieldName("schedulingMethod");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "schedulingMethod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("serialNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "serialNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("serialNumberCost");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "serialNumberCost"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("serialNumberCostAdjustment");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "serialNumberCostAdjustment"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("serialNumberQuantity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "serialNumberQuantity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("serialNumbers");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "serialNumbers"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipAddress");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipAddress"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipAddressee");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipAddressee"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipAttention");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipAttention"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipCarrier");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipCarrier"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipCity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipCity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipComplete");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipComplete"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipCountry");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipCountry"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipCounty");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipCounty"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipGroup");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipGroup"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipMethod");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipMethod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipPhone");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipPhone"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipping");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipping"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipRecvStatus");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipRecvStatus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipRecvStatusLine");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipRecvStatusLine"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipState");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipState"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipTo");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipTo"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipZip");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipZip"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "source"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
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
        elemField.setFieldName("statistical");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "statistical"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("subscriptionLine");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "subscriptionLine"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("subsidiaryTaxRegNum");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "subsidiaryTaxRegNum"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxItem");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "taxItem"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxLine");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "taxLine"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("taxPointDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "taxPointDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxRate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "taxRate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("terms");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "terms"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("termsOfSale");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "termsOfSale"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
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
        elemField.setFieldName("toBeEmailed");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "toBeEmailed"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("toBePrinted");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "toBePrinted"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("toSubsidiary");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "toSubsidiary"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("totalAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "totalAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("trackingNumbers");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "trackingNumbers"));
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
        elemField.setFieldName("tranIsVsoeBundle");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "tranIsVsoeBundle"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("transactionDiscount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "transactionDiscount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("transactionLineType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "transactionLineType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("transactionNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "transactionNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("transferLocation");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "transferLocation"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("transferOrderQuantityCommitted");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "transferOrderQuantityCommitted"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("transferOrderQuantityPacked");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "transferOrderQuantityPacked"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("transferOrderQuantityPicked");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "transferOrderQuantityPicked"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("transferOrderQuantityReceived");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "transferOrderQuantityReceived"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("transferOrderQuantityShipped");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "transferOrderQuantityShipped"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "type"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("unit");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "unit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("unitCostOverride");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "unitCostOverride"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("unitsType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "unitsType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vendType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "vendType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("visibleToCustomer");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "visibleToCustomer"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("voided");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "voided"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vsoeAllocation");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "vsoeAllocation"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vsoeAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "vsoeAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vsoeDeferral");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "vsoeDeferral"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vsoeDelivered");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "vsoeDelivered"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vsoePermitDiscount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "vsoePermitDiscount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vsoePrice");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "vsoePrice"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("webSite");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "webSite"));
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

