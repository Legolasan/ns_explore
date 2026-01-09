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
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnTextNumberField;
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

public class TransactionSearchRowBasic
extends SearchRowBasic
implements Serializable {
    private SearchColumnStringField[] abbrev;
    private SearchColumnSelectField[] account;
    private SearchColumnEnumSelectField[] accountType;
    private SearchColumnSelectField[] acctCorpCardExp;
    private SearchColumnDateField[] actualProductionEndDate;
    private SearchColumnDateField[] actualProductionStartDate;
    private SearchColumnDateField[] actualShipDate;
    private SearchColumnDoubleField[] altSalesAmount;
    private SearchColumnDoubleField[] altSalesNetAmount;
    private SearchColumnDoubleField[] amount;
    private SearchColumnDoubleField[] amountPaid;
    private SearchColumnDoubleField[] amountRemaining;
    private SearchColumnDoubleField[] amountUnbilled;
    private SearchColumnDoubleField[] appliedToForeignAmount;
    private SearchColumnBooleanField[] appliedToIsFxVariance;
    private SearchColumnDoubleField[] appliedToLinkAmount;
    private SearchColumnStringField[] appliedToLinkType;
    private SearchColumnSelectField[] appliedToTransaction;
    private SearchColumnDoubleField[] applyingForeignAmount;
    private SearchColumnBooleanField[] applyingIsFxVariance;
    private SearchColumnDoubleField[] applyingLinkAmount;
    private SearchColumnStringField[] applyingLinkType;
    private SearchColumnSelectField[] applyingTransaction;
    private SearchColumnEnumSelectField[] approvalStatus;
    private SearchColumnStringField[] authCode;
    private SearchColumnBooleanField[] autoCalculateLag;
    private SearchColumnEnumSelectField[] avsStreetMatch;
    private SearchColumnEnumSelectField[] avsZipMatch;
    private SearchColumnBooleanField[] billable;
    private SearchColumnStringField[] billAddress;
    private SearchColumnStringField[] billAddress1;
    private SearchColumnStringField[] billAddress2;
    private SearchColumnStringField[] billAddress3;
    private SearchColumnStringField[] billAddressee;
    private SearchColumnStringField[] billAttention;
    private SearchColumnStringField[] billCity;
    private SearchColumnEnumSelectField[] billCountry;
    private SearchColumnStringField[] billCountryCode;
    private SearchColumnDateField[] billedDate;
    private SearchColumnSelectField[] billingAccount;
    private SearchColumnDoubleField[] billingAmount;
    private SearchColumnSelectField[] billingSchedule;
    private SearchColumnSelectField[] billingTransaction;
    private SearchColumnStringField[] billPhone;
    private SearchColumnStringField[] billState;
    private SearchColumnEnumSelectField[] billVarianceStatus;
    private SearchColumnStringField[] billZip;
    private SearchColumnStringField[] binNumber;
    private SearchColumnDoubleField[] binNumberQuantity;
    private SearchColumnDoubleField[] bomQuantity;
    private SearchColumnBooleanField[] buildEntireAssembly;
    private SearchColumnDoubleField[] buildVariance;
    private SearchColumnDoubleField[] built;
    private SearchColumnBooleanField[] canHaveStackablePromotions;
    private SearchColumnStringField[] catchUpPeriod;
    private SearchColumnStringField[] ccCustomerCode;
    private SearchColumnDateField[] ccExpDate;
    private SearchColumnStringField[] ccHolderName;
    private SearchColumnStringField[] ccNumber;
    private SearchColumnStringField[] ccStreet;
    private SearchColumnStringField[] ccZipCode;
    private SearchColumnSelectField[] _class;
    private SearchColumnBooleanField[] cleared;
    private SearchColumnBooleanField[] closed;
    private SearchColumnDateField[] closeDate;
    private SearchColumnDoubleField[] cogsAmount;
    private SearchColumnDateField[] commissionEffectiveDate;
    private SearchColumnEnumSelectField[] commit;
    private SearchColumnDoubleField[] componentYield;
    private SearchColumnStringField[] confirmationNumber;
    private SearchColumnDoubleField[] contribution;
    private SearchColumnDoubleField[] contributionPrimary;
    private SearchColumnDoubleField[] costComponentAmount;
    private SearchColumnStringField[] costComponentCategory;
    private SearchColumnStringField[] costComponentItem;
    private SearchColumnDoubleField[] costComponentQuantity;
    private SearchColumnDoubleField[] costComponentStandardCost;
    private SearchColumnDoubleField[] costEstimate;
    private SearchColumnDoubleField[] costEstimateRate;
    private SearchColumnEnumSelectField[] costEstimateType;
    private SearchColumnSelectField[] createdBy;
    private SearchColumnSelectField[] createdFrom;
    private SearchColumnDoubleField[] creditAmount;
    private SearchColumnEnumSelectField[] cscMatch;
    private SearchColumnSelectField[] currency;
    private SearchColumnSelectField[] customForm;
    private SearchColumnBooleanField[] customGL;
    private SearchColumnSelectField[] custType;
    private SearchColumnDateField[] dateCreated;
    private SearchColumnLongField[] daysOpen;
    private SearchColumnLongField[] daysOverdue;
    private SearchColumnDoubleField[] debitAmount;
    private SearchColumnDoubleField[] deferredRevenue;
    private SearchColumnBooleanField[] deferRevRec;
    private SearchColumnSelectField[] department;
    private SearchColumnDateField[] depositDate;
    private SearchColumnSelectField[] depositTransaction;
    private SearchColumnDoubleField[] discountAmount;
    private SearchColumnStringField[] docUnit;
    private SearchColumnStringField[] drAccount;
    private SearchColumnDateField[] dueDate;
    private SearchColumnDoubleField[] effectiveRate;
    private SearchColumnStringField[] email;
    private SearchColumnDateField[] endDate;
    private SearchColumnSelectField[] entity;
    private SearchColumnSelectField[] entityStatus;
    private SearchColumnDoubleField[] estGrossProfit;
    private SearchColumnDoubleField[] estGrossProfitPct;
    private SearchColumnDoubleField[] estGrossProfitPercent;
    private SearchColumnDoubleField[] exchangeRate;
    private SearchColumnBooleanField[] excludeCommission;
    private SearchColumnBooleanField[] excludeFromRateRequest;
    private SearchColumnDateField[] expectedCloseDate;
    private SearchColumnDateField[] expectedReceiptDate;
    private SearchColumnSelectField[] expenseCategory;
    private SearchColumnDateField[] expenseDate;
    private SearchColumnSelectField[] externalId;
    private SearchColumnBooleanField[] firmed;
    private SearchColumnEnumSelectField[] forecastType;
    private SearchColumnSelectField[] fulfillingTransaction;
    private SearchColumnStringField[] fxAccount;
    private SearchColumnDoubleField[] fxAmount;
    private SearchColumnDoubleField[] fxCostEstimate;
    private SearchColumnDoubleField[] fxCostEstimateRate;
    private SearchColumnDoubleField[] fxEstGrossProfit;
    private SearchColumnDoubleField[] fxTranCostEstimate;
    private SearchColumnDoubleField[] fxVsoeAllocation;
    private SearchColumnDoubleField[] fxVsoeAmount;
    private SearchColumnDoubleField[] fxVsoePrice;
    private SearchColumnBooleanField[] gcoAvailabelToCharge;
    private SearchColumnBooleanField[] gcoAvailableToRefund;
    private SearchColumnEnumSelectField[] gcoAvsStreetMatch;
    private SearchColumnEnumSelectField[] gcoAvsZipMatch;
    private SearchColumnLongField[] gcoBuyerAccountAge;
    private SearchColumnStringField[] gcoBuyerIp;
    private SearchColumnDoubleField[] gcoChargeAmount;
    private SearchColumnDoubleField[] gcoChargebackAmount;
    private SearchColumnDoubleField[] gcoConfirmedChargedTotal;
    private SearchColumnDoubleField[] gcoConfirmedRefundedTotal;
    private SearchColumnStringField[] gcoCreditcardNumber;
    private SearchColumnEnumSelectField[] gcoCscMatch;
    private SearchColumnStringField[] gcoFinancialState;
    private SearchColumnStringField[] gcoFulfillmentState;
    private SearchColumnStringField[] gcoOrderId;
    private SearchColumnDoubleField[] gcoOrderTotal;
    private SearchColumnDoubleField[] gcoPromotionAmount;
    private SearchColumnStringField[] gcoPromotionName;
    private SearchColumnDoubleField[] gcoRefundAmount;
    private SearchColumnDoubleField[] gcoShippingTotal;
    private SearchColumnStringField[] gcoStateChangedDetail;
    private SearchColumnStringField[] giftCert;
    private SearchColumnDoubleField[] grossAmount;
    private SearchColumnBooleanField[] includeInForecast;
    private SearchColumnSelectField[] incoterm;
    private SearchColumnEnumSelectField[] intercoStatus;
    private SearchColumnStringField[] intercoTransaction;
    private SearchColumnSelectField[] internalId;
    private SearchColumnSelectField[] inventoryLocation;
    private SearchColumnSelectField[] inventorySubsidiary;
    private SearchColumnBooleanField[] inVsoeBundle;
    private SearchColumnBooleanField[] isAllocation;
    private SearchColumnBooleanField[] isBackflush;
    private SearchColumnBooleanField[] isGcoChargeback;
    private SearchColumnBooleanField[] isGcoChargeConfirmed;
    private SearchColumnBooleanField[] isGcoPaymentGuaranteed;
    private SearchColumnBooleanField[] isGcoRefundConfirmed;
    private SearchColumnBooleanField[] isInsideDelivery;
    private SearchColumnBooleanField[] isInsidePickup;
    private SearchColumnBooleanField[] isIntercompanyAdjustment;
    private SearchColumnBooleanField[] isInTransitPayment;
    private SearchColumnBooleanField[] isMultiShipTo;
    private SearchColumnBooleanField[] isReversal;
    private SearchColumnBooleanField[] isRevRecTransaction;
    private SearchColumnBooleanField[] isScrap;
    private SearchColumnBooleanField[] isShipAddress;
    private SearchColumnBooleanField[] isTransferPriceCosting;
    private SearchColumnBooleanField[] isWip;
    private SearchColumnSelectField[] item;
    private SearchColumnEnumSelectField[] itemFulfillmentChoice;
    private SearchColumnSelectField[] itemRevision;
    private SearchColumnBooleanField[] landedCostPerLine;
    private SearchColumnDateField[] lastModifiedDate;
    private SearchColumnSelectField[] leadSource;
    private SearchColumnLongField[] line;
    private SearchColumnLongField[] lineSequenceNumber;
    private SearchColumnLongField[] lineUniqueKey;
    private SearchColumnSelectField[] location;
    private SearchColumnBooleanField[] locationAutoAssigned;
    private SearchColumnBooleanField[] mainLine;
    private SearchColumnStringField[] mainName;
    private SearchColumnSelectField[] manufacturingRouting;
    private SearchColumnBooleanField[] matchBillToReceipt;
    private SearchColumnStringField[] memo;
    private SearchColumnStringField[] memoMain;
    private SearchColumnBooleanField[] memorized;
    private SearchColumnSelectField[] merchantAccount;
    private SearchColumnStringField[] message;
    private SearchColumnBooleanField[] multiSubsidiary;
    private SearchColumnDoubleField[] netAmount;
    private SearchColumnDoubleField[] netAmountNoTax;
    private SearchColumnSelectField[] nextApprover;
    private SearchColumnDateField[] nextBillDate;
    private SearchColumnSelectField[] nexus;
    private SearchColumnBooleanField[] noAutoAssignLocation;
    private SearchColumnBooleanField[] nonReimbursable;
    private SearchColumnDoubleField[] oneTimeTotal;
    private SearchColumnSelectField[] opportunity;
    private SearchColumnStringField[] options;
    private SearchColumnSelectField[] orderAllocationStrategy;
    private SearchColumnDoubleField[] orderPriority;
    private SearchColumnEnumSelectField[] originator;
    private SearchColumnTextNumberField[] otherRefNum;
    private SearchColumnSelectField[] overheadParentItem;
    private SearchColumnBooleanField[] overrideInstallments;
    private SearchColumnLongField[] packageCount;
    private SearchColumnDoubleField[] paidAmount;
    private SearchColumnSelectField[] paidTransaction;
    private SearchColumnSelectField[] partner;
    private SearchColumnDoubleField[] partnerContribution;
    private SearchColumnSelectField[] partnerRole;
    private SearchColumnSelectField[] partnerTeamMember;
    private SearchColumnDoubleField[] payingAmount;
    private SearchColumnSelectField[] payingTransaction;
    private SearchColumnBooleanField[] paymentApproved;
    private SearchColumnDateField[] paymentEventDate;
    private SearchColumnEnumSelectField[] paymentEventHoldReason;
    private SearchColumnBooleanField[] paymentEventPurchaseCardUsed;
    private SearchColumnBooleanField[] paymentEventPurchaseDataSent;
    private SearchColumnEnumSelectField[] paymentEventResult;
    private SearchColumnEnumSelectField[] paymentEventType;
    private SearchColumnBooleanField[] paymentHold;
    private SearchColumnSelectField[] paymentMethod;
    private SearchColumnSelectField[] paymentOption;
    private SearchColumnBooleanField[] payPalPending;
    private SearchColumnStringField[] payPalStatus;
    private SearchColumnStringField[] payPalTranId;
    private SearchColumnStringField[] payrollBatch;
    private SearchColumnStringField[] pnRefNum;
    private SearchColumnBooleanField[] policyViolated;
    private SearchColumnDoubleField[] poRate;
    private SearchColumnBooleanField[] posting;
    private SearchColumnSelectField[] postingPeriod;
    private SearchColumnSelectField[] priceLevel;
    private SearchColumnStringField[] print;
    private SearchColumnDoubleField[] probability;
    private SearchColumnDoubleField[] projectedAmount;
    private SearchColumnSelectField[] projectTask;
    private SearchColumnSelectField[] promoCode;
    private SearchColumnSelectField[] purchaseOrder;
    private SearchColumnDoubleField[] quantity;
    private SearchColumnDoubleField[] quantityBilled;
    private SearchColumnDoubleField[] quantityCommitted;
    private SearchColumnDoubleField[] quantityPacked;
    private SearchColumnDoubleField[] quantityPicked;
    private SearchColumnDoubleField[] quantityRevCommitted;
    private SearchColumnDoubleField[] quantityShipRecv;
    private SearchColumnDoubleField[] quantityUom;
    private SearchColumnDoubleField[] rate;
    private SearchColumnStringField[] realizedGainPostingTransaction;
    private SearchColumnDoubleField[] recognizedRevenue;
    private SearchColumnStringField[] recordType;
    private SearchColumnDoubleField[] recurAnnuallyTotal;
    private SearchColumnDoubleField[] recurMonthlyTotal;
    private SearchColumnDoubleField[] recurQuarterlyTotal;
    private SearchColumnBooleanField[] recurringBill;
    private SearchColumnDoubleField[] recurWeeklyTotal;
    private SearchColumnLongField[] refNumber;
    private SearchColumnDateField[] requestedDate;
    private SearchColumnDoubleField[] requiredDepositAmount;
    private SearchColumnDoubleField[] requiredDepositDue;
    private SearchColumnDoubleField[] requiredDepositPercentage;
    private SearchColumnEnumSelectField[] revCommitStatus;
    private SearchColumnSelectField[] revCommittingTransaction;
    private SearchColumnEnumSelectField[] revenueStatus;
    private SearchColumnDateField[] reversalDate;
    private SearchColumnStringField[] reversalNumber;
    private SearchColumnDateField[] revRecEndDate;
    private SearchColumnBooleanField[] revRecOnRevCommitment;
    private SearchColumnDateField[] revRecStartDate;
    private SearchColumnSelectField[] rgAccount;
    private SearchColumnDoubleField[] rgAmount;
    private SearchColumnDateField[] salesEffectiveDate;
    private SearchColumnSelectField[] salesOrder;
    private SearchColumnSelectField[] salesRep;
    private SearchColumnSelectField[] salesTeamMember;
    private SearchColumnSelectField[] salesTeamRole;
    private SearchColumnEnumSelectField[] schedulingMethod;
    private SearchColumnStringField[] serialNumber;
    private SearchColumnDoubleField[] serialNumberCost;
    private SearchColumnDoubleField[] serialNumberCostAdjustment;
    private SearchColumnDoubleField[] serialNumberQuantity;
    private SearchColumnStringField[] serialNumbers;
    private SearchColumnStringField[] shipAddress;
    private SearchColumnStringField[] shipAddress1;
    private SearchColumnStringField[] shipAddress2;
    private SearchColumnStringField[] shipAddress3;
    private SearchColumnStringField[] shipAddressee;
    private SearchColumnStringField[] shipAttention;
    private SearchColumnEnumSelectField[] shipCarrier;
    private SearchColumnStringField[] shipCity;
    private SearchColumnBooleanField[] shipComplete;
    private SearchColumnEnumSelectField[] shipCountry;
    private SearchColumnStringField[] shipCountryCode;
    private SearchColumnDateField[] shipDate;
    private SearchColumnLongField[] shipGroup;
    private SearchColumnSelectField[] shipMethod;
    private SearchColumnStringField[] shipPhone;
    private SearchColumnDoubleField[] shippingAmount;
    private SearchColumnBooleanField[] shipRecvStatusLine;
    private SearchColumnStringField[] shipState;
    private SearchColumnSelectField[] shipTo;
    private SearchColumnStringField[] shipZip;
    private SearchColumnDoubleField[] signedAmount;
    private SearchColumnStringField[] source;
    private SearchColumnDateField[] startDate;
    private SearchColumnEnumSelectField[] status;
    private SearchColumnSelectField[] subscription;
    private SearchColumnSelectField[] subscriptionLine;
    private SearchColumnSelectField[] subsidiary;
    private SearchColumnStringField[] subsidiaryTaxRegNum;
    private SearchColumnDoubleField[] taxAmount;
    private SearchColumnSelectField[] taxCode;
    private SearchColumnBooleanField[] taxLine;
    private SearchColumnSelectField[] taxPeriod;
    private SearchColumnDateField[] taxPointDate;
    private SearchColumnDoubleField[] taxTotal;
    private SearchColumnLongField[] termInMonths;
    private SearchColumnSelectField[] terms;
    private SearchColumnStringField[] termsOfSale;
    private SearchColumnStringField[] title;
    private SearchColumnBooleanField[] toBeEmailed;
    private SearchColumnBooleanField[] toBePrinted;
    private SearchColumnSelectField[] toSubsidiary;
    private SearchColumnDoubleField[] total;
    private SearchColumnDoubleField[] totalCostEstimate;
    private SearchColumnStringField[] trackingNumbers;
    private SearchColumnDateField[] tranDate;
    private SearchColumnDoubleField[] tranEstGrossProfit;
    private SearchColumnDoubleField[] tranFxEstGrossProfit;
    private SearchColumnStringField[] tranId;
    private SearchColumnBooleanField[] tranIsVsoeBundle;
    private SearchColumnBooleanField[] transactionDiscount;
    private SearchColumnEnumSelectField[] transactionLineType;
    private SearchColumnStringField[] transactionNumber;
    private SearchColumnSelectField[] transferLocation;
    private SearchColumnStringField[] transferOrderItemLine;
    private SearchColumnDoubleField[] transferOrderQuantityCommitted;
    private SearchColumnDoubleField[] transferOrderQuantityPacked;
    private SearchColumnDoubleField[] transferOrderQuantityPicked;
    private SearchColumnDoubleField[] transferOrderQuantityReceived;
    private SearchColumnDoubleField[] transferOrderQuantityShipped;
    private SearchColumnEnumSelectField[] type;
    private SearchColumnStringField[] unit;
    private SearchColumnDoubleField[] unitCostOverride;
    private SearchColumnSelectField[] vendType;
    private SearchColumnBooleanField[] visibleToCustomer;
    private SearchColumnDoubleField[] vsoeAllocation;
    private SearchColumnDoubleField[] vsoeAmount;
    private SearchColumnEnumSelectField[] vsoeDeferral;
    private SearchColumnBooleanField[] vsoeDelivered;
    private SearchColumnEnumSelectField[] vsoePermitDiscount;
    private SearchColumnDoubleField[] vsoePrice;
    private SearchColumnStringField[] webSite;
    private SearchColumnCustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(TransactionSearchRowBasic.class, true);

    public SearchColumnStringField[] getAbbrev() {
        return this.abbrev;
    }

    public void setAbbrev(SearchColumnStringField[] abbrev) {
        this.abbrev = abbrev;
    }

    public SearchColumnStringField getAbbrev(int i) {
        return this.abbrev[i];
    }

    public void setAbbrev(int i, SearchColumnStringField _value) {
        this.abbrev[i] = _value;
    }

    public SearchColumnSelectField[] getAccount() {
        return this.account;
    }

    public void setAccount(SearchColumnSelectField[] account) {
        this.account = account;
    }

    public SearchColumnSelectField getAccount(int i) {
        return this.account[i];
    }

    public void setAccount(int i, SearchColumnSelectField _value) {
        this.account[i] = _value;
    }

    public SearchColumnEnumSelectField[] getAccountType() {
        return this.accountType;
    }

    public void setAccountType(SearchColumnEnumSelectField[] accountType) {
        this.accountType = accountType;
    }

    public SearchColumnEnumSelectField getAccountType(int i) {
        return this.accountType[i];
    }

    public void setAccountType(int i, SearchColumnEnumSelectField _value) {
        this.accountType[i] = _value;
    }

    public SearchColumnSelectField[] getAcctCorpCardExp() {
        return this.acctCorpCardExp;
    }

    public void setAcctCorpCardExp(SearchColumnSelectField[] acctCorpCardExp) {
        this.acctCorpCardExp = acctCorpCardExp;
    }

    public SearchColumnSelectField getAcctCorpCardExp(int i) {
        return this.acctCorpCardExp[i];
    }

    public void setAcctCorpCardExp(int i, SearchColumnSelectField _value) {
        this.acctCorpCardExp[i] = _value;
    }

    public SearchColumnDateField[] getActualProductionEndDate() {
        return this.actualProductionEndDate;
    }

    public void setActualProductionEndDate(SearchColumnDateField[] actualProductionEndDate) {
        this.actualProductionEndDate = actualProductionEndDate;
    }

    public SearchColumnDateField getActualProductionEndDate(int i) {
        return this.actualProductionEndDate[i];
    }

    public void setActualProductionEndDate(int i, SearchColumnDateField _value) {
        this.actualProductionEndDate[i] = _value;
    }

    public SearchColumnDateField[] getActualProductionStartDate() {
        return this.actualProductionStartDate;
    }

    public void setActualProductionStartDate(SearchColumnDateField[] actualProductionStartDate) {
        this.actualProductionStartDate = actualProductionStartDate;
    }

    public SearchColumnDateField getActualProductionStartDate(int i) {
        return this.actualProductionStartDate[i];
    }

    public void setActualProductionStartDate(int i, SearchColumnDateField _value) {
        this.actualProductionStartDate[i] = _value;
    }

    public SearchColumnDateField[] getActualShipDate() {
        return this.actualShipDate;
    }

    public void setActualShipDate(SearchColumnDateField[] actualShipDate) {
        this.actualShipDate = actualShipDate;
    }

    public SearchColumnDateField getActualShipDate(int i) {
        return this.actualShipDate[i];
    }

    public void setActualShipDate(int i, SearchColumnDateField _value) {
        this.actualShipDate[i] = _value;
    }

    public SearchColumnDoubleField[] getAltSalesAmount() {
        return this.altSalesAmount;
    }

    public void setAltSalesAmount(SearchColumnDoubleField[] altSalesAmount) {
        this.altSalesAmount = altSalesAmount;
    }

    public SearchColumnDoubleField getAltSalesAmount(int i) {
        return this.altSalesAmount[i];
    }

    public void setAltSalesAmount(int i, SearchColumnDoubleField _value) {
        this.altSalesAmount[i] = _value;
    }

    public SearchColumnDoubleField[] getAltSalesNetAmount() {
        return this.altSalesNetAmount;
    }

    public void setAltSalesNetAmount(SearchColumnDoubleField[] altSalesNetAmount) {
        this.altSalesNetAmount = altSalesNetAmount;
    }

    public SearchColumnDoubleField getAltSalesNetAmount(int i) {
        return this.altSalesNetAmount[i];
    }

    public void setAltSalesNetAmount(int i, SearchColumnDoubleField _value) {
        this.altSalesNetAmount[i] = _value;
    }

    public SearchColumnDoubleField[] getAmount() {
        return this.amount;
    }

    public void setAmount(SearchColumnDoubleField[] amount) {
        this.amount = amount;
    }

    public SearchColumnDoubleField getAmount(int i) {
        return this.amount[i];
    }

    public void setAmount(int i, SearchColumnDoubleField _value) {
        this.amount[i] = _value;
    }

    public SearchColumnDoubleField[] getAmountPaid() {
        return this.amountPaid;
    }

    public void setAmountPaid(SearchColumnDoubleField[] amountPaid) {
        this.amountPaid = amountPaid;
    }

    public SearchColumnDoubleField getAmountPaid(int i) {
        return this.amountPaid[i];
    }

    public void setAmountPaid(int i, SearchColumnDoubleField _value) {
        this.amountPaid[i] = _value;
    }

    public SearchColumnDoubleField[] getAmountRemaining() {
        return this.amountRemaining;
    }

    public void setAmountRemaining(SearchColumnDoubleField[] amountRemaining) {
        this.amountRemaining = amountRemaining;
    }

    public SearchColumnDoubleField getAmountRemaining(int i) {
        return this.amountRemaining[i];
    }

    public void setAmountRemaining(int i, SearchColumnDoubleField _value) {
        this.amountRemaining[i] = _value;
    }

    public SearchColumnDoubleField[] getAmountUnbilled() {
        return this.amountUnbilled;
    }

    public void setAmountUnbilled(SearchColumnDoubleField[] amountUnbilled) {
        this.amountUnbilled = amountUnbilled;
    }

    public SearchColumnDoubleField getAmountUnbilled(int i) {
        return this.amountUnbilled[i];
    }

    public void setAmountUnbilled(int i, SearchColumnDoubleField _value) {
        this.amountUnbilled[i] = _value;
    }

    public SearchColumnDoubleField[] getAppliedToForeignAmount() {
        return this.appliedToForeignAmount;
    }

    public void setAppliedToForeignAmount(SearchColumnDoubleField[] appliedToForeignAmount) {
        this.appliedToForeignAmount = appliedToForeignAmount;
    }

    public SearchColumnDoubleField getAppliedToForeignAmount(int i) {
        return this.appliedToForeignAmount[i];
    }

    public void setAppliedToForeignAmount(int i, SearchColumnDoubleField _value) {
        this.appliedToForeignAmount[i] = _value;
    }

    public SearchColumnBooleanField[] getAppliedToIsFxVariance() {
        return this.appliedToIsFxVariance;
    }

    public void setAppliedToIsFxVariance(SearchColumnBooleanField[] appliedToIsFxVariance) {
        this.appliedToIsFxVariance = appliedToIsFxVariance;
    }

    public SearchColumnBooleanField getAppliedToIsFxVariance(int i) {
        return this.appliedToIsFxVariance[i];
    }

    public void setAppliedToIsFxVariance(int i, SearchColumnBooleanField _value) {
        this.appliedToIsFxVariance[i] = _value;
    }

    public SearchColumnDoubleField[] getAppliedToLinkAmount() {
        return this.appliedToLinkAmount;
    }

    public void setAppliedToLinkAmount(SearchColumnDoubleField[] appliedToLinkAmount) {
        this.appliedToLinkAmount = appliedToLinkAmount;
    }

    public SearchColumnDoubleField getAppliedToLinkAmount(int i) {
        return this.appliedToLinkAmount[i];
    }

    public void setAppliedToLinkAmount(int i, SearchColumnDoubleField _value) {
        this.appliedToLinkAmount[i] = _value;
    }

    public SearchColumnStringField[] getAppliedToLinkType() {
        return this.appliedToLinkType;
    }

    public void setAppliedToLinkType(SearchColumnStringField[] appliedToLinkType) {
        this.appliedToLinkType = appliedToLinkType;
    }

    public SearchColumnStringField getAppliedToLinkType(int i) {
        return this.appliedToLinkType[i];
    }

    public void setAppliedToLinkType(int i, SearchColumnStringField _value) {
        this.appliedToLinkType[i] = _value;
    }

    public SearchColumnSelectField[] getAppliedToTransaction() {
        return this.appliedToTransaction;
    }

    public void setAppliedToTransaction(SearchColumnSelectField[] appliedToTransaction) {
        this.appliedToTransaction = appliedToTransaction;
    }

    public SearchColumnSelectField getAppliedToTransaction(int i) {
        return this.appliedToTransaction[i];
    }

    public void setAppliedToTransaction(int i, SearchColumnSelectField _value) {
        this.appliedToTransaction[i] = _value;
    }

    public SearchColumnDoubleField[] getApplyingForeignAmount() {
        return this.applyingForeignAmount;
    }

    public void setApplyingForeignAmount(SearchColumnDoubleField[] applyingForeignAmount) {
        this.applyingForeignAmount = applyingForeignAmount;
    }

    public SearchColumnDoubleField getApplyingForeignAmount(int i) {
        return this.applyingForeignAmount[i];
    }

    public void setApplyingForeignAmount(int i, SearchColumnDoubleField _value) {
        this.applyingForeignAmount[i] = _value;
    }

    public SearchColumnBooleanField[] getApplyingIsFxVariance() {
        return this.applyingIsFxVariance;
    }

    public void setApplyingIsFxVariance(SearchColumnBooleanField[] applyingIsFxVariance) {
        this.applyingIsFxVariance = applyingIsFxVariance;
    }

    public SearchColumnBooleanField getApplyingIsFxVariance(int i) {
        return this.applyingIsFxVariance[i];
    }

    public void setApplyingIsFxVariance(int i, SearchColumnBooleanField _value) {
        this.applyingIsFxVariance[i] = _value;
    }

    public SearchColumnDoubleField[] getApplyingLinkAmount() {
        return this.applyingLinkAmount;
    }

    public void setApplyingLinkAmount(SearchColumnDoubleField[] applyingLinkAmount) {
        this.applyingLinkAmount = applyingLinkAmount;
    }

    public SearchColumnDoubleField getApplyingLinkAmount(int i) {
        return this.applyingLinkAmount[i];
    }

    public void setApplyingLinkAmount(int i, SearchColumnDoubleField _value) {
        this.applyingLinkAmount[i] = _value;
    }

    public SearchColumnStringField[] getApplyingLinkType() {
        return this.applyingLinkType;
    }

    public void setApplyingLinkType(SearchColumnStringField[] applyingLinkType) {
        this.applyingLinkType = applyingLinkType;
    }

    public SearchColumnStringField getApplyingLinkType(int i) {
        return this.applyingLinkType[i];
    }

    public void setApplyingLinkType(int i, SearchColumnStringField _value) {
        this.applyingLinkType[i] = _value;
    }

    public SearchColumnSelectField[] getApplyingTransaction() {
        return this.applyingTransaction;
    }

    public void setApplyingTransaction(SearchColumnSelectField[] applyingTransaction) {
        this.applyingTransaction = applyingTransaction;
    }

    public SearchColumnSelectField getApplyingTransaction(int i) {
        return this.applyingTransaction[i];
    }

    public void setApplyingTransaction(int i, SearchColumnSelectField _value) {
        this.applyingTransaction[i] = _value;
    }

    public SearchColumnEnumSelectField[] getApprovalStatus() {
        return this.approvalStatus;
    }

    public void setApprovalStatus(SearchColumnEnumSelectField[] approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public SearchColumnEnumSelectField getApprovalStatus(int i) {
        return this.approvalStatus[i];
    }

    public void setApprovalStatus(int i, SearchColumnEnumSelectField _value) {
        this.approvalStatus[i] = _value;
    }

    public SearchColumnStringField[] getAuthCode() {
        return this.authCode;
    }

    public void setAuthCode(SearchColumnStringField[] authCode) {
        this.authCode = authCode;
    }

    public SearchColumnStringField getAuthCode(int i) {
        return this.authCode[i];
    }

    public void setAuthCode(int i, SearchColumnStringField _value) {
        this.authCode[i] = _value;
    }

    public SearchColumnBooleanField[] getAutoCalculateLag() {
        return this.autoCalculateLag;
    }

    public void setAutoCalculateLag(SearchColumnBooleanField[] autoCalculateLag) {
        this.autoCalculateLag = autoCalculateLag;
    }

    public SearchColumnBooleanField getAutoCalculateLag(int i) {
        return this.autoCalculateLag[i];
    }

    public void setAutoCalculateLag(int i, SearchColumnBooleanField _value) {
        this.autoCalculateLag[i] = _value;
    }

    public SearchColumnEnumSelectField[] getAvsStreetMatch() {
        return this.avsStreetMatch;
    }

    public void setAvsStreetMatch(SearchColumnEnumSelectField[] avsStreetMatch) {
        this.avsStreetMatch = avsStreetMatch;
    }

    public SearchColumnEnumSelectField getAvsStreetMatch(int i) {
        return this.avsStreetMatch[i];
    }

    public void setAvsStreetMatch(int i, SearchColumnEnumSelectField _value) {
        this.avsStreetMatch[i] = _value;
    }

    public SearchColumnEnumSelectField[] getAvsZipMatch() {
        return this.avsZipMatch;
    }

    public void setAvsZipMatch(SearchColumnEnumSelectField[] avsZipMatch) {
        this.avsZipMatch = avsZipMatch;
    }

    public SearchColumnEnumSelectField getAvsZipMatch(int i) {
        return this.avsZipMatch[i];
    }

    public void setAvsZipMatch(int i, SearchColumnEnumSelectField _value) {
        this.avsZipMatch[i] = _value;
    }

    public SearchColumnBooleanField[] getBillable() {
        return this.billable;
    }

    public void setBillable(SearchColumnBooleanField[] billable) {
        this.billable = billable;
    }

    public SearchColumnBooleanField getBillable(int i) {
        return this.billable[i];
    }

    public void setBillable(int i, SearchColumnBooleanField _value) {
        this.billable[i] = _value;
    }

    public SearchColumnStringField[] getBillAddress() {
        return this.billAddress;
    }

    public void setBillAddress(SearchColumnStringField[] billAddress) {
        this.billAddress = billAddress;
    }

    public SearchColumnStringField getBillAddress(int i) {
        return this.billAddress[i];
    }

    public void setBillAddress(int i, SearchColumnStringField _value) {
        this.billAddress[i] = _value;
    }

    public SearchColumnStringField[] getBillAddress1() {
        return this.billAddress1;
    }

    public void setBillAddress1(SearchColumnStringField[] billAddress1) {
        this.billAddress1 = billAddress1;
    }

    public SearchColumnStringField getBillAddress1(int i) {
        return this.billAddress1[i];
    }

    public void setBillAddress1(int i, SearchColumnStringField _value) {
        this.billAddress1[i] = _value;
    }

    public SearchColumnStringField[] getBillAddress2() {
        return this.billAddress2;
    }

    public void setBillAddress2(SearchColumnStringField[] billAddress2) {
        this.billAddress2 = billAddress2;
    }

    public SearchColumnStringField getBillAddress2(int i) {
        return this.billAddress2[i];
    }

    public void setBillAddress2(int i, SearchColumnStringField _value) {
        this.billAddress2[i] = _value;
    }

    public SearchColumnStringField[] getBillAddress3() {
        return this.billAddress3;
    }

    public void setBillAddress3(SearchColumnStringField[] billAddress3) {
        this.billAddress3 = billAddress3;
    }

    public SearchColumnStringField getBillAddress3(int i) {
        return this.billAddress3[i];
    }

    public void setBillAddress3(int i, SearchColumnStringField _value) {
        this.billAddress3[i] = _value;
    }

    public SearchColumnStringField[] getBillAddressee() {
        return this.billAddressee;
    }

    public void setBillAddressee(SearchColumnStringField[] billAddressee) {
        this.billAddressee = billAddressee;
    }

    public SearchColumnStringField getBillAddressee(int i) {
        return this.billAddressee[i];
    }

    public void setBillAddressee(int i, SearchColumnStringField _value) {
        this.billAddressee[i] = _value;
    }

    public SearchColumnStringField[] getBillAttention() {
        return this.billAttention;
    }

    public void setBillAttention(SearchColumnStringField[] billAttention) {
        this.billAttention = billAttention;
    }

    public SearchColumnStringField getBillAttention(int i) {
        return this.billAttention[i];
    }

    public void setBillAttention(int i, SearchColumnStringField _value) {
        this.billAttention[i] = _value;
    }

    public SearchColumnStringField[] getBillCity() {
        return this.billCity;
    }

    public void setBillCity(SearchColumnStringField[] billCity) {
        this.billCity = billCity;
    }

    public SearchColumnStringField getBillCity(int i) {
        return this.billCity[i];
    }

    public void setBillCity(int i, SearchColumnStringField _value) {
        this.billCity[i] = _value;
    }

    public SearchColumnEnumSelectField[] getBillCountry() {
        return this.billCountry;
    }

    public void setBillCountry(SearchColumnEnumSelectField[] billCountry) {
        this.billCountry = billCountry;
    }

    public SearchColumnEnumSelectField getBillCountry(int i) {
        return this.billCountry[i];
    }

    public void setBillCountry(int i, SearchColumnEnumSelectField _value) {
        this.billCountry[i] = _value;
    }

    public SearchColumnStringField[] getBillCountryCode() {
        return this.billCountryCode;
    }

    public void setBillCountryCode(SearchColumnStringField[] billCountryCode) {
        this.billCountryCode = billCountryCode;
    }

    public SearchColumnStringField getBillCountryCode(int i) {
        return this.billCountryCode[i];
    }

    public void setBillCountryCode(int i, SearchColumnStringField _value) {
        this.billCountryCode[i] = _value;
    }

    public SearchColumnDateField[] getBilledDate() {
        return this.billedDate;
    }

    public void setBilledDate(SearchColumnDateField[] billedDate) {
        this.billedDate = billedDate;
    }

    public SearchColumnDateField getBilledDate(int i) {
        return this.billedDate[i];
    }

    public void setBilledDate(int i, SearchColumnDateField _value) {
        this.billedDate[i] = _value;
    }

    public SearchColumnSelectField[] getBillingAccount() {
        return this.billingAccount;
    }

    public void setBillingAccount(SearchColumnSelectField[] billingAccount) {
        this.billingAccount = billingAccount;
    }

    public SearchColumnSelectField getBillingAccount(int i) {
        return this.billingAccount[i];
    }

    public void setBillingAccount(int i, SearchColumnSelectField _value) {
        this.billingAccount[i] = _value;
    }

    public SearchColumnDoubleField[] getBillingAmount() {
        return this.billingAmount;
    }

    public void setBillingAmount(SearchColumnDoubleField[] billingAmount) {
        this.billingAmount = billingAmount;
    }

    public SearchColumnDoubleField getBillingAmount(int i) {
        return this.billingAmount[i];
    }

    public void setBillingAmount(int i, SearchColumnDoubleField _value) {
        this.billingAmount[i] = _value;
    }

    public SearchColumnSelectField[] getBillingSchedule() {
        return this.billingSchedule;
    }

    public void setBillingSchedule(SearchColumnSelectField[] billingSchedule) {
        this.billingSchedule = billingSchedule;
    }

    public SearchColumnSelectField getBillingSchedule(int i) {
        return this.billingSchedule[i];
    }

    public void setBillingSchedule(int i, SearchColumnSelectField _value) {
        this.billingSchedule[i] = _value;
    }

    public SearchColumnSelectField[] getBillingTransaction() {
        return this.billingTransaction;
    }

    public void setBillingTransaction(SearchColumnSelectField[] billingTransaction) {
        this.billingTransaction = billingTransaction;
    }

    public SearchColumnSelectField getBillingTransaction(int i) {
        return this.billingTransaction[i];
    }

    public void setBillingTransaction(int i, SearchColumnSelectField _value) {
        this.billingTransaction[i] = _value;
    }

    public SearchColumnStringField[] getBillPhone() {
        return this.billPhone;
    }

    public void setBillPhone(SearchColumnStringField[] billPhone) {
        this.billPhone = billPhone;
    }

    public SearchColumnStringField getBillPhone(int i) {
        return this.billPhone[i];
    }

    public void setBillPhone(int i, SearchColumnStringField _value) {
        this.billPhone[i] = _value;
    }

    public SearchColumnStringField[] getBillState() {
        return this.billState;
    }

    public void setBillState(SearchColumnStringField[] billState) {
        this.billState = billState;
    }

    public SearchColumnStringField getBillState(int i) {
        return this.billState[i];
    }

    public void setBillState(int i, SearchColumnStringField _value) {
        this.billState[i] = _value;
    }

    public SearchColumnEnumSelectField[] getBillVarianceStatus() {
        return this.billVarianceStatus;
    }

    public void setBillVarianceStatus(SearchColumnEnumSelectField[] billVarianceStatus) {
        this.billVarianceStatus = billVarianceStatus;
    }

    public SearchColumnEnumSelectField getBillVarianceStatus(int i) {
        return this.billVarianceStatus[i];
    }

    public void setBillVarianceStatus(int i, SearchColumnEnumSelectField _value) {
        this.billVarianceStatus[i] = _value;
    }

    public SearchColumnStringField[] getBillZip() {
        return this.billZip;
    }

    public void setBillZip(SearchColumnStringField[] billZip) {
        this.billZip = billZip;
    }

    public SearchColumnStringField getBillZip(int i) {
        return this.billZip[i];
    }

    public void setBillZip(int i, SearchColumnStringField _value) {
        this.billZip[i] = _value;
    }

    public SearchColumnStringField[] getBinNumber() {
        return this.binNumber;
    }

    public void setBinNumber(SearchColumnStringField[] binNumber) {
        this.binNumber = binNumber;
    }

    public SearchColumnStringField getBinNumber(int i) {
        return this.binNumber[i];
    }

    public void setBinNumber(int i, SearchColumnStringField _value) {
        this.binNumber[i] = _value;
    }

    public SearchColumnDoubleField[] getBinNumberQuantity() {
        return this.binNumberQuantity;
    }

    public void setBinNumberQuantity(SearchColumnDoubleField[] binNumberQuantity) {
        this.binNumberQuantity = binNumberQuantity;
    }

    public SearchColumnDoubleField getBinNumberQuantity(int i) {
        return this.binNumberQuantity[i];
    }

    public void setBinNumberQuantity(int i, SearchColumnDoubleField _value) {
        this.binNumberQuantity[i] = _value;
    }

    public SearchColumnDoubleField[] getBomQuantity() {
        return this.bomQuantity;
    }

    public void setBomQuantity(SearchColumnDoubleField[] bomQuantity) {
        this.bomQuantity = bomQuantity;
    }

    public SearchColumnDoubleField getBomQuantity(int i) {
        return this.bomQuantity[i];
    }

    public void setBomQuantity(int i, SearchColumnDoubleField _value) {
        this.bomQuantity[i] = _value;
    }

    public SearchColumnBooleanField[] getBuildEntireAssembly() {
        return this.buildEntireAssembly;
    }

    public void setBuildEntireAssembly(SearchColumnBooleanField[] buildEntireAssembly) {
        this.buildEntireAssembly = buildEntireAssembly;
    }

    public SearchColumnBooleanField getBuildEntireAssembly(int i) {
        return this.buildEntireAssembly[i];
    }

    public void setBuildEntireAssembly(int i, SearchColumnBooleanField _value) {
        this.buildEntireAssembly[i] = _value;
    }

    public SearchColumnDoubleField[] getBuildVariance() {
        return this.buildVariance;
    }

    public void setBuildVariance(SearchColumnDoubleField[] buildVariance) {
        this.buildVariance = buildVariance;
    }

    public SearchColumnDoubleField getBuildVariance(int i) {
        return this.buildVariance[i];
    }

    public void setBuildVariance(int i, SearchColumnDoubleField _value) {
        this.buildVariance[i] = _value;
    }

    public SearchColumnDoubleField[] getBuilt() {
        return this.built;
    }

    public void setBuilt(SearchColumnDoubleField[] built) {
        this.built = built;
    }

    public SearchColumnDoubleField getBuilt(int i) {
        return this.built[i];
    }

    public void setBuilt(int i, SearchColumnDoubleField _value) {
        this.built[i] = _value;
    }

    public SearchColumnBooleanField[] getCanHaveStackablePromotions() {
        return this.canHaveStackablePromotions;
    }

    public void setCanHaveStackablePromotions(SearchColumnBooleanField[] canHaveStackablePromotions) {
        this.canHaveStackablePromotions = canHaveStackablePromotions;
    }

    public SearchColumnBooleanField getCanHaveStackablePromotions(int i) {
        return this.canHaveStackablePromotions[i];
    }

    public void setCanHaveStackablePromotions(int i, SearchColumnBooleanField _value) {
        this.canHaveStackablePromotions[i] = _value;
    }

    public SearchColumnStringField[] getCatchUpPeriod() {
        return this.catchUpPeriod;
    }

    public void setCatchUpPeriod(SearchColumnStringField[] catchUpPeriod) {
        this.catchUpPeriod = catchUpPeriod;
    }

    public SearchColumnStringField getCatchUpPeriod(int i) {
        return this.catchUpPeriod[i];
    }

    public void setCatchUpPeriod(int i, SearchColumnStringField _value) {
        this.catchUpPeriod[i] = _value;
    }

    public SearchColumnStringField[] getCcCustomerCode() {
        return this.ccCustomerCode;
    }

    public void setCcCustomerCode(SearchColumnStringField[] ccCustomerCode) {
        this.ccCustomerCode = ccCustomerCode;
    }

    public SearchColumnStringField getCcCustomerCode(int i) {
        return this.ccCustomerCode[i];
    }

    public void setCcCustomerCode(int i, SearchColumnStringField _value) {
        this.ccCustomerCode[i] = _value;
    }

    public SearchColumnDateField[] getCcExpDate() {
        return this.ccExpDate;
    }

    public void setCcExpDate(SearchColumnDateField[] ccExpDate) {
        this.ccExpDate = ccExpDate;
    }

    public SearchColumnDateField getCcExpDate(int i) {
        return this.ccExpDate[i];
    }

    public void setCcExpDate(int i, SearchColumnDateField _value) {
        this.ccExpDate[i] = _value;
    }

    public SearchColumnStringField[] getCcHolderName() {
        return this.ccHolderName;
    }

    public void setCcHolderName(SearchColumnStringField[] ccHolderName) {
        this.ccHolderName = ccHolderName;
    }

    public SearchColumnStringField getCcHolderName(int i) {
        return this.ccHolderName[i];
    }

    public void setCcHolderName(int i, SearchColumnStringField _value) {
        this.ccHolderName[i] = _value;
    }

    public SearchColumnStringField[] getCcNumber() {
        return this.ccNumber;
    }

    public void setCcNumber(SearchColumnStringField[] ccNumber) {
        this.ccNumber = ccNumber;
    }

    public SearchColumnStringField getCcNumber(int i) {
        return this.ccNumber[i];
    }

    public void setCcNumber(int i, SearchColumnStringField _value) {
        this.ccNumber[i] = _value;
    }

    public SearchColumnStringField[] getCcStreet() {
        return this.ccStreet;
    }

    public void setCcStreet(SearchColumnStringField[] ccStreet) {
        this.ccStreet = ccStreet;
    }

    public SearchColumnStringField getCcStreet(int i) {
        return this.ccStreet[i];
    }

    public void setCcStreet(int i, SearchColumnStringField _value) {
        this.ccStreet[i] = _value;
    }

    public SearchColumnStringField[] getCcZipCode() {
        return this.ccZipCode;
    }

    public void setCcZipCode(SearchColumnStringField[] ccZipCode) {
        this.ccZipCode = ccZipCode;
    }

    public SearchColumnStringField getCcZipCode(int i) {
        return this.ccZipCode[i];
    }

    public void setCcZipCode(int i, SearchColumnStringField _value) {
        this.ccZipCode[i] = _value;
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

    public SearchColumnBooleanField[] getCleared() {
        return this.cleared;
    }

    public void setCleared(SearchColumnBooleanField[] cleared) {
        this.cleared = cleared;
    }

    public SearchColumnBooleanField getCleared(int i) {
        return this.cleared[i];
    }

    public void setCleared(int i, SearchColumnBooleanField _value) {
        this.cleared[i] = _value;
    }

    public SearchColumnBooleanField[] getClosed() {
        return this.closed;
    }

    public void setClosed(SearchColumnBooleanField[] closed) {
        this.closed = closed;
    }

    public SearchColumnBooleanField getClosed(int i) {
        return this.closed[i];
    }

    public void setClosed(int i, SearchColumnBooleanField _value) {
        this.closed[i] = _value;
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

    public SearchColumnDoubleField[] getCogsAmount() {
        return this.cogsAmount;
    }

    public void setCogsAmount(SearchColumnDoubleField[] cogsAmount) {
        this.cogsAmount = cogsAmount;
    }

    public SearchColumnDoubleField getCogsAmount(int i) {
        return this.cogsAmount[i];
    }

    public void setCogsAmount(int i, SearchColumnDoubleField _value) {
        this.cogsAmount[i] = _value;
    }

    public SearchColumnDateField[] getCommissionEffectiveDate() {
        return this.commissionEffectiveDate;
    }

    public void setCommissionEffectiveDate(SearchColumnDateField[] commissionEffectiveDate) {
        this.commissionEffectiveDate = commissionEffectiveDate;
    }

    public SearchColumnDateField getCommissionEffectiveDate(int i) {
        return this.commissionEffectiveDate[i];
    }

    public void setCommissionEffectiveDate(int i, SearchColumnDateField _value) {
        this.commissionEffectiveDate[i] = _value;
    }

    public SearchColumnEnumSelectField[] getCommit() {
        return this.commit;
    }

    public void setCommit(SearchColumnEnumSelectField[] commit) {
        this.commit = commit;
    }

    public SearchColumnEnumSelectField getCommit(int i) {
        return this.commit[i];
    }

    public void setCommit(int i, SearchColumnEnumSelectField _value) {
        this.commit[i] = _value;
    }

    public SearchColumnDoubleField[] getComponentYield() {
        return this.componentYield;
    }

    public void setComponentYield(SearchColumnDoubleField[] componentYield) {
        this.componentYield = componentYield;
    }

    public SearchColumnDoubleField getComponentYield(int i) {
        return this.componentYield[i];
    }

    public void setComponentYield(int i, SearchColumnDoubleField _value) {
        this.componentYield[i] = _value;
    }

    public SearchColumnStringField[] getConfirmationNumber() {
        return this.confirmationNumber;
    }

    public void setConfirmationNumber(SearchColumnStringField[] confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }

    public SearchColumnStringField getConfirmationNumber(int i) {
        return this.confirmationNumber[i];
    }

    public void setConfirmationNumber(int i, SearchColumnStringField _value) {
        this.confirmationNumber[i] = _value;
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

    public SearchColumnDoubleField[] getCostComponentAmount() {
        return this.costComponentAmount;
    }

    public void setCostComponentAmount(SearchColumnDoubleField[] costComponentAmount) {
        this.costComponentAmount = costComponentAmount;
    }

    public SearchColumnDoubleField getCostComponentAmount(int i) {
        return this.costComponentAmount[i];
    }

    public void setCostComponentAmount(int i, SearchColumnDoubleField _value) {
        this.costComponentAmount[i] = _value;
    }

    public SearchColumnStringField[] getCostComponentCategory() {
        return this.costComponentCategory;
    }

    public void setCostComponentCategory(SearchColumnStringField[] costComponentCategory) {
        this.costComponentCategory = costComponentCategory;
    }

    public SearchColumnStringField getCostComponentCategory(int i) {
        return this.costComponentCategory[i];
    }

    public void setCostComponentCategory(int i, SearchColumnStringField _value) {
        this.costComponentCategory[i] = _value;
    }

    public SearchColumnStringField[] getCostComponentItem() {
        return this.costComponentItem;
    }

    public void setCostComponentItem(SearchColumnStringField[] costComponentItem) {
        this.costComponentItem = costComponentItem;
    }

    public SearchColumnStringField getCostComponentItem(int i) {
        return this.costComponentItem[i];
    }

    public void setCostComponentItem(int i, SearchColumnStringField _value) {
        this.costComponentItem[i] = _value;
    }

    public SearchColumnDoubleField[] getCostComponentQuantity() {
        return this.costComponentQuantity;
    }

    public void setCostComponentQuantity(SearchColumnDoubleField[] costComponentQuantity) {
        this.costComponentQuantity = costComponentQuantity;
    }

    public SearchColumnDoubleField getCostComponentQuantity(int i) {
        return this.costComponentQuantity[i];
    }

    public void setCostComponentQuantity(int i, SearchColumnDoubleField _value) {
        this.costComponentQuantity[i] = _value;
    }

    public SearchColumnDoubleField[] getCostComponentStandardCost() {
        return this.costComponentStandardCost;
    }

    public void setCostComponentStandardCost(SearchColumnDoubleField[] costComponentStandardCost) {
        this.costComponentStandardCost = costComponentStandardCost;
    }

    public SearchColumnDoubleField getCostComponentStandardCost(int i) {
        return this.costComponentStandardCost[i];
    }

    public void setCostComponentStandardCost(int i, SearchColumnDoubleField _value) {
        this.costComponentStandardCost[i] = _value;
    }

    public SearchColumnDoubleField[] getCostEstimate() {
        return this.costEstimate;
    }

    public void setCostEstimate(SearchColumnDoubleField[] costEstimate) {
        this.costEstimate = costEstimate;
    }

    public SearchColumnDoubleField getCostEstimate(int i) {
        return this.costEstimate[i];
    }

    public void setCostEstimate(int i, SearchColumnDoubleField _value) {
        this.costEstimate[i] = _value;
    }

    public SearchColumnDoubleField[] getCostEstimateRate() {
        return this.costEstimateRate;
    }

    public void setCostEstimateRate(SearchColumnDoubleField[] costEstimateRate) {
        this.costEstimateRate = costEstimateRate;
    }

    public SearchColumnDoubleField getCostEstimateRate(int i) {
        return this.costEstimateRate[i];
    }

    public void setCostEstimateRate(int i, SearchColumnDoubleField _value) {
        this.costEstimateRate[i] = _value;
    }

    public SearchColumnEnumSelectField[] getCostEstimateType() {
        return this.costEstimateType;
    }

    public void setCostEstimateType(SearchColumnEnumSelectField[] costEstimateType) {
        this.costEstimateType = costEstimateType;
    }

    public SearchColumnEnumSelectField getCostEstimateType(int i) {
        return this.costEstimateType[i];
    }

    public void setCostEstimateType(int i, SearchColumnEnumSelectField _value) {
        this.costEstimateType[i] = _value;
    }

    public SearchColumnSelectField[] getCreatedBy() {
        return this.createdBy;
    }

    public void setCreatedBy(SearchColumnSelectField[] createdBy) {
        this.createdBy = createdBy;
    }

    public SearchColumnSelectField getCreatedBy(int i) {
        return this.createdBy[i];
    }

    public void setCreatedBy(int i, SearchColumnSelectField _value) {
        this.createdBy[i] = _value;
    }

    public SearchColumnSelectField[] getCreatedFrom() {
        return this.createdFrom;
    }

    public void setCreatedFrom(SearchColumnSelectField[] createdFrom) {
        this.createdFrom = createdFrom;
    }

    public SearchColumnSelectField getCreatedFrom(int i) {
        return this.createdFrom[i];
    }

    public void setCreatedFrom(int i, SearchColumnSelectField _value) {
        this.createdFrom[i] = _value;
    }

    public SearchColumnDoubleField[] getCreditAmount() {
        return this.creditAmount;
    }

    public void setCreditAmount(SearchColumnDoubleField[] creditAmount) {
        this.creditAmount = creditAmount;
    }

    public SearchColumnDoubleField getCreditAmount(int i) {
        return this.creditAmount[i];
    }

    public void setCreditAmount(int i, SearchColumnDoubleField _value) {
        this.creditAmount[i] = _value;
    }

    public SearchColumnEnumSelectField[] getCscMatch() {
        return this.cscMatch;
    }

    public void setCscMatch(SearchColumnEnumSelectField[] cscMatch) {
        this.cscMatch = cscMatch;
    }

    public SearchColumnEnumSelectField getCscMatch(int i) {
        return this.cscMatch[i];
    }

    public void setCscMatch(int i, SearchColumnEnumSelectField _value) {
        this.cscMatch[i] = _value;
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

    public SearchColumnSelectField[] getCustomForm() {
        return this.customForm;
    }

    public void setCustomForm(SearchColumnSelectField[] customForm) {
        this.customForm = customForm;
    }

    public SearchColumnSelectField getCustomForm(int i) {
        return this.customForm[i];
    }

    public void setCustomForm(int i, SearchColumnSelectField _value) {
        this.customForm[i] = _value;
    }

    public SearchColumnBooleanField[] getCustomGL() {
        return this.customGL;
    }

    public void setCustomGL(SearchColumnBooleanField[] customGL) {
        this.customGL = customGL;
    }

    public SearchColumnBooleanField getCustomGL(int i) {
        return this.customGL[i];
    }

    public void setCustomGL(int i, SearchColumnBooleanField _value) {
        this.customGL[i] = _value;
    }

    public SearchColumnSelectField[] getCustType() {
        return this.custType;
    }

    public void setCustType(SearchColumnSelectField[] custType) {
        this.custType = custType;
    }

    public SearchColumnSelectField getCustType(int i) {
        return this.custType[i];
    }

    public void setCustType(int i, SearchColumnSelectField _value) {
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

    public SearchColumnLongField[] getDaysOverdue() {
        return this.daysOverdue;
    }

    public void setDaysOverdue(SearchColumnLongField[] daysOverdue) {
        this.daysOverdue = daysOverdue;
    }

    public SearchColumnLongField getDaysOverdue(int i) {
        return this.daysOverdue[i];
    }

    public void setDaysOverdue(int i, SearchColumnLongField _value) {
        this.daysOverdue[i] = _value;
    }

    public SearchColumnDoubleField[] getDebitAmount() {
        return this.debitAmount;
    }

    public void setDebitAmount(SearchColumnDoubleField[] debitAmount) {
        this.debitAmount = debitAmount;
    }

    public SearchColumnDoubleField getDebitAmount(int i) {
        return this.debitAmount[i];
    }

    public void setDebitAmount(int i, SearchColumnDoubleField _value) {
        this.debitAmount[i] = _value;
    }

    public SearchColumnDoubleField[] getDeferredRevenue() {
        return this.deferredRevenue;
    }

    public void setDeferredRevenue(SearchColumnDoubleField[] deferredRevenue) {
        this.deferredRevenue = deferredRevenue;
    }

    public SearchColumnDoubleField getDeferredRevenue(int i) {
        return this.deferredRevenue[i];
    }

    public void setDeferredRevenue(int i, SearchColumnDoubleField _value) {
        this.deferredRevenue[i] = _value;
    }

    public SearchColumnBooleanField[] getDeferRevRec() {
        return this.deferRevRec;
    }

    public void setDeferRevRec(SearchColumnBooleanField[] deferRevRec) {
        this.deferRevRec = deferRevRec;
    }

    public SearchColumnBooleanField getDeferRevRec(int i) {
        return this.deferRevRec[i];
    }

    public void setDeferRevRec(int i, SearchColumnBooleanField _value) {
        this.deferRevRec[i] = _value;
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

    public SearchColumnDateField[] getDepositDate() {
        return this.depositDate;
    }

    public void setDepositDate(SearchColumnDateField[] depositDate) {
        this.depositDate = depositDate;
    }

    public SearchColumnDateField getDepositDate(int i) {
        return this.depositDate[i];
    }

    public void setDepositDate(int i, SearchColumnDateField _value) {
        this.depositDate[i] = _value;
    }

    public SearchColumnSelectField[] getDepositTransaction() {
        return this.depositTransaction;
    }

    public void setDepositTransaction(SearchColumnSelectField[] depositTransaction) {
        this.depositTransaction = depositTransaction;
    }

    public SearchColumnSelectField getDepositTransaction(int i) {
        return this.depositTransaction[i];
    }

    public void setDepositTransaction(int i, SearchColumnSelectField _value) {
        this.depositTransaction[i] = _value;
    }

    public SearchColumnDoubleField[] getDiscountAmount() {
        return this.discountAmount;
    }

    public void setDiscountAmount(SearchColumnDoubleField[] discountAmount) {
        this.discountAmount = discountAmount;
    }

    public SearchColumnDoubleField getDiscountAmount(int i) {
        return this.discountAmount[i];
    }

    public void setDiscountAmount(int i, SearchColumnDoubleField _value) {
        this.discountAmount[i] = _value;
    }

    public SearchColumnStringField[] getDocUnit() {
        return this.docUnit;
    }

    public void setDocUnit(SearchColumnStringField[] docUnit) {
        this.docUnit = docUnit;
    }

    public SearchColumnStringField getDocUnit(int i) {
        return this.docUnit[i];
    }

    public void setDocUnit(int i, SearchColumnStringField _value) {
        this.docUnit[i] = _value;
    }

    public SearchColumnStringField[] getDrAccount() {
        return this.drAccount;
    }

    public void setDrAccount(SearchColumnStringField[] drAccount) {
        this.drAccount = drAccount;
    }

    public SearchColumnStringField getDrAccount(int i) {
        return this.drAccount[i];
    }

    public void setDrAccount(int i, SearchColumnStringField _value) {
        this.drAccount[i] = _value;
    }

    public SearchColumnDateField[] getDueDate() {
        return this.dueDate;
    }

    public void setDueDate(SearchColumnDateField[] dueDate) {
        this.dueDate = dueDate;
    }

    public SearchColumnDateField getDueDate(int i) {
        return this.dueDate[i];
    }

    public void setDueDate(int i, SearchColumnDateField _value) {
        this.dueDate[i] = _value;
    }

    public SearchColumnDoubleField[] getEffectiveRate() {
        return this.effectiveRate;
    }

    public void setEffectiveRate(SearchColumnDoubleField[] effectiveRate) {
        this.effectiveRate = effectiveRate;
    }

    public SearchColumnDoubleField getEffectiveRate(int i) {
        return this.effectiveRate[i];
    }

    public void setEffectiveRate(int i, SearchColumnDoubleField _value) {
        this.effectiveRate[i] = _value;
    }

    public SearchColumnStringField[] getEmail() {
        return this.email;
    }

    public void setEmail(SearchColumnStringField[] email) {
        this.email = email;
    }

    public SearchColumnStringField getEmail(int i) {
        return this.email[i];
    }

    public void setEmail(int i, SearchColumnStringField _value) {
        this.email[i] = _value;
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

    public SearchColumnDoubleField[] getEstGrossProfit() {
        return this.estGrossProfit;
    }

    public void setEstGrossProfit(SearchColumnDoubleField[] estGrossProfit) {
        this.estGrossProfit = estGrossProfit;
    }

    public SearchColumnDoubleField getEstGrossProfit(int i) {
        return this.estGrossProfit[i];
    }

    public void setEstGrossProfit(int i, SearchColumnDoubleField _value) {
        this.estGrossProfit[i] = _value;
    }

    public SearchColumnDoubleField[] getEstGrossProfitPct() {
        return this.estGrossProfitPct;
    }

    public void setEstGrossProfitPct(SearchColumnDoubleField[] estGrossProfitPct) {
        this.estGrossProfitPct = estGrossProfitPct;
    }

    public SearchColumnDoubleField getEstGrossProfitPct(int i) {
        return this.estGrossProfitPct[i];
    }

    public void setEstGrossProfitPct(int i, SearchColumnDoubleField _value) {
        this.estGrossProfitPct[i] = _value;
    }

    public SearchColumnDoubleField[] getEstGrossProfitPercent() {
        return this.estGrossProfitPercent;
    }

    public void setEstGrossProfitPercent(SearchColumnDoubleField[] estGrossProfitPercent) {
        this.estGrossProfitPercent = estGrossProfitPercent;
    }

    public SearchColumnDoubleField getEstGrossProfitPercent(int i) {
        return this.estGrossProfitPercent[i];
    }

    public void setEstGrossProfitPercent(int i, SearchColumnDoubleField _value) {
        this.estGrossProfitPercent[i] = _value;
    }

    public SearchColumnDoubleField[] getExchangeRate() {
        return this.exchangeRate;
    }

    public void setExchangeRate(SearchColumnDoubleField[] exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public SearchColumnDoubleField getExchangeRate(int i) {
        return this.exchangeRate[i];
    }

    public void setExchangeRate(int i, SearchColumnDoubleField _value) {
        this.exchangeRate[i] = _value;
    }

    public SearchColumnBooleanField[] getExcludeCommission() {
        return this.excludeCommission;
    }

    public void setExcludeCommission(SearchColumnBooleanField[] excludeCommission) {
        this.excludeCommission = excludeCommission;
    }

    public SearchColumnBooleanField getExcludeCommission(int i) {
        return this.excludeCommission[i];
    }

    public void setExcludeCommission(int i, SearchColumnBooleanField _value) {
        this.excludeCommission[i] = _value;
    }

    public SearchColumnBooleanField[] getExcludeFromRateRequest() {
        return this.excludeFromRateRequest;
    }

    public void setExcludeFromRateRequest(SearchColumnBooleanField[] excludeFromRateRequest) {
        this.excludeFromRateRequest = excludeFromRateRequest;
    }

    public SearchColumnBooleanField getExcludeFromRateRequest(int i) {
        return this.excludeFromRateRequest[i];
    }

    public void setExcludeFromRateRequest(int i, SearchColumnBooleanField _value) {
        this.excludeFromRateRequest[i] = _value;
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

    public SearchColumnDateField[] getExpectedReceiptDate() {
        return this.expectedReceiptDate;
    }

    public void setExpectedReceiptDate(SearchColumnDateField[] expectedReceiptDate) {
        this.expectedReceiptDate = expectedReceiptDate;
    }

    public SearchColumnDateField getExpectedReceiptDate(int i) {
        return this.expectedReceiptDate[i];
    }

    public void setExpectedReceiptDate(int i, SearchColumnDateField _value) {
        this.expectedReceiptDate[i] = _value;
    }

    public SearchColumnSelectField[] getExpenseCategory() {
        return this.expenseCategory;
    }

    public void setExpenseCategory(SearchColumnSelectField[] expenseCategory) {
        this.expenseCategory = expenseCategory;
    }

    public SearchColumnSelectField getExpenseCategory(int i) {
        return this.expenseCategory[i];
    }

    public void setExpenseCategory(int i, SearchColumnSelectField _value) {
        this.expenseCategory[i] = _value;
    }

    public SearchColumnDateField[] getExpenseDate() {
        return this.expenseDate;
    }

    public void setExpenseDate(SearchColumnDateField[] expenseDate) {
        this.expenseDate = expenseDate;
    }

    public SearchColumnDateField getExpenseDate(int i) {
        return this.expenseDate[i];
    }

    public void setExpenseDate(int i, SearchColumnDateField _value) {
        this.expenseDate[i] = _value;
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

    public SearchColumnBooleanField[] getFirmed() {
        return this.firmed;
    }

    public void setFirmed(SearchColumnBooleanField[] firmed) {
        this.firmed = firmed;
    }

    public SearchColumnBooleanField getFirmed(int i) {
        return this.firmed[i];
    }

    public void setFirmed(int i, SearchColumnBooleanField _value) {
        this.firmed[i] = _value;
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

    public SearchColumnSelectField[] getFulfillingTransaction() {
        return this.fulfillingTransaction;
    }

    public void setFulfillingTransaction(SearchColumnSelectField[] fulfillingTransaction) {
        this.fulfillingTransaction = fulfillingTransaction;
    }

    public SearchColumnSelectField getFulfillingTransaction(int i) {
        return this.fulfillingTransaction[i];
    }

    public void setFulfillingTransaction(int i, SearchColumnSelectField _value) {
        this.fulfillingTransaction[i] = _value;
    }

    public SearchColumnStringField[] getFxAccount() {
        return this.fxAccount;
    }

    public void setFxAccount(SearchColumnStringField[] fxAccount) {
        this.fxAccount = fxAccount;
    }

    public SearchColumnStringField getFxAccount(int i) {
        return this.fxAccount[i];
    }

    public void setFxAccount(int i, SearchColumnStringField _value) {
        this.fxAccount[i] = _value;
    }

    public SearchColumnDoubleField[] getFxAmount() {
        return this.fxAmount;
    }

    public void setFxAmount(SearchColumnDoubleField[] fxAmount) {
        this.fxAmount = fxAmount;
    }

    public SearchColumnDoubleField getFxAmount(int i) {
        return this.fxAmount[i];
    }

    public void setFxAmount(int i, SearchColumnDoubleField _value) {
        this.fxAmount[i] = _value;
    }

    public SearchColumnDoubleField[] getFxCostEstimate() {
        return this.fxCostEstimate;
    }

    public void setFxCostEstimate(SearchColumnDoubleField[] fxCostEstimate) {
        this.fxCostEstimate = fxCostEstimate;
    }

    public SearchColumnDoubleField getFxCostEstimate(int i) {
        return this.fxCostEstimate[i];
    }

    public void setFxCostEstimate(int i, SearchColumnDoubleField _value) {
        this.fxCostEstimate[i] = _value;
    }

    public SearchColumnDoubleField[] getFxCostEstimateRate() {
        return this.fxCostEstimateRate;
    }

    public void setFxCostEstimateRate(SearchColumnDoubleField[] fxCostEstimateRate) {
        this.fxCostEstimateRate = fxCostEstimateRate;
    }

    public SearchColumnDoubleField getFxCostEstimateRate(int i) {
        return this.fxCostEstimateRate[i];
    }

    public void setFxCostEstimateRate(int i, SearchColumnDoubleField _value) {
        this.fxCostEstimateRate[i] = _value;
    }

    public SearchColumnDoubleField[] getFxEstGrossProfit() {
        return this.fxEstGrossProfit;
    }

    public void setFxEstGrossProfit(SearchColumnDoubleField[] fxEstGrossProfit) {
        this.fxEstGrossProfit = fxEstGrossProfit;
    }

    public SearchColumnDoubleField getFxEstGrossProfit(int i) {
        return this.fxEstGrossProfit[i];
    }

    public void setFxEstGrossProfit(int i, SearchColumnDoubleField _value) {
        this.fxEstGrossProfit[i] = _value;
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

    public SearchColumnDoubleField[] getFxVsoeAllocation() {
        return this.fxVsoeAllocation;
    }

    public void setFxVsoeAllocation(SearchColumnDoubleField[] fxVsoeAllocation) {
        this.fxVsoeAllocation = fxVsoeAllocation;
    }

    public SearchColumnDoubleField getFxVsoeAllocation(int i) {
        return this.fxVsoeAllocation[i];
    }

    public void setFxVsoeAllocation(int i, SearchColumnDoubleField _value) {
        this.fxVsoeAllocation[i] = _value;
    }

    public SearchColumnDoubleField[] getFxVsoeAmount() {
        return this.fxVsoeAmount;
    }

    public void setFxVsoeAmount(SearchColumnDoubleField[] fxVsoeAmount) {
        this.fxVsoeAmount = fxVsoeAmount;
    }

    public SearchColumnDoubleField getFxVsoeAmount(int i) {
        return this.fxVsoeAmount[i];
    }

    public void setFxVsoeAmount(int i, SearchColumnDoubleField _value) {
        this.fxVsoeAmount[i] = _value;
    }

    public SearchColumnDoubleField[] getFxVsoePrice() {
        return this.fxVsoePrice;
    }

    public void setFxVsoePrice(SearchColumnDoubleField[] fxVsoePrice) {
        this.fxVsoePrice = fxVsoePrice;
    }

    public SearchColumnDoubleField getFxVsoePrice(int i) {
        return this.fxVsoePrice[i];
    }

    public void setFxVsoePrice(int i, SearchColumnDoubleField _value) {
        this.fxVsoePrice[i] = _value;
    }

    public SearchColumnBooleanField[] getGcoAvailabelToCharge() {
        return this.gcoAvailabelToCharge;
    }

    public void setGcoAvailabelToCharge(SearchColumnBooleanField[] gcoAvailabelToCharge) {
        this.gcoAvailabelToCharge = gcoAvailabelToCharge;
    }

    public SearchColumnBooleanField getGcoAvailabelToCharge(int i) {
        return this.gcoAvailabelToCharge[i];
    }

    public void setGcoAvailabelToCharge(int i, SearchColumnBooleanField _value) {
        this.gcoAvailabelToCharge[i] = _value;
    }

    public SearchColumnBooleanField[] getGcoAvailableToRefund() {
        return this.gcoAvailableToRefund;
    }

    public void setGcoAvailableToRefund(SearchColumnBooleanField[] gcoAvailableToRefund) {
        this.gcoAvailableToRefund = gcoAvailableToRefund;
    }

    public SearchColumnBooleanField getGcoAvailableToRefund(int i) {
        return this.gcoAvailableToRefund[i];
    }

    public void setGcoAvailableToRefund(int i, SearchColumnBooleanField _value) {
        this.gcoAvailableToRefund[i] = _value;
    }

    public SearchColumnEnumSelectField[] getGcoAvsStreetMatch() {
        return this.gcoAvsStreetMatch;
    }

    public void setGcoAvsStreetMatch(SearchColumnEnumSelectField[] gcoAvsStreetMatch) {
        this.gcoAvsStreetMatch = gcoAvsStreetMatch;
    }

    public SearchColumnEnumSelectField getGcoAvsStreetMatch(int i) {
        return this.gcoAvsStreetMatch[i];
    }

    public void setGcoAvsStreetMatch(int i, SearchColumnEnumSelectField _value) {
        this.gcoAvsStreetMatch[i] = _value;
    }

    public SearchColumnEnumSelectField[] getGcoAvsZipMatch() {
        return this.gcoAvsZipMatch;
    }

    public void setGcoAvsZipMatch(SearchColumnEnumSelectField[] gcoAvsZipMatch) {
        this.gcoAvsZipMatch = gcoAvsZipMatch;
    }

    public SearchColumnEnumSelectField getGcoAvsZipMatch(int i) {
        return this.gcoAvsZipMatch[i];
    }

    public void setGcoAvsZipMatch(int i, SearchColumnEnumSelectField _value) {
        this.gcoAvsZipMatch[i] = _value;
    }

    public SearchColumnLongField[] getGcoBuyerAccountAge() {
        return this.gcoBuyerAccountAge;
    }

    public void setGcoBuyerAccountAge(SearchColumnLongField[] gcoBuyerAccountAge) {
        this.gcoBuyerAccountAge = gcoBuyerAccountAge;
    }

    public SearchColumnLongField getGcoBuyerAccountAge(int i) {
        return this.gcoBuyerAccountAge[i];
    }

    public void setGcoBuyerAccountAge(int i, SearchColumnLongField _value) {
        this.gcoBuyerAccountAge[i] = _value;
    }

    public SearchColumnStringField[] getGcoBuyerIp() {
        return this.gcoBuyerIp;
    }

    public void setGcoBuyerIp(SearchColumnStringField[] gcoBuyerIp) {
        this.gcoBuyerIp = gcoBuyerIp;
    }

    public SearchColumnStringField getGcoBuyerIp(int i) {
        return this.gcoBuyerIp[i];
    }

    public void setGcoBuyerIp(int i, SearchColumnStringField _value) {
        this.gcoBuyerIp[i] = _value;
    }

    public SearchColumnDoubleField[] getGcoChargeAmount() {
        return this.gcoChargeAmount;
    }

    public void setGcoChargeAmount(SearchColumnDoubleField[] gcoChargeAmount) {
        this.gcoChargeAmount = gcoChargeAmount;
    }

    public SearchColumnDoubleField getGcoChargeAmount(int i) {
        return this.gcoChargeAmount[i];
    }

    public void setGcoChargeAmount(int i, SearchColumnDoubleField _value) {
        this.gcoChargeAmount[i] = _value;
    }

    public SearchColumnDoubleField[] getGcoChargebackAmount() {
        return this.gcoChargebackAmount;
    }

    public void setGcoChargebackAmount(SearchColumnDoubleField[] gcoChargebackAmount) {
        this.gcoChargebackAmount = gcoChargebackAmount;
    }

    public SearchColumnDoubleField getGcoChargebackAmount(int i) {
        return this.gcoChargebackAmount[i];
    }

    public void setGcoChargebackAmount(int i, SearchColumnDoubleField _value) {
        this.gcoChargebackAmount[i] = _value;
    }

    public SearchColumnDoubleField[] getGcoConfirmedChargedTotal() {
        return this.gcoConfirmedChargedTotal;
    }

    public void setGcoConfirmedChargedTotal(SearchColumnDoubleField[] gcoConfirmedChargedTotal) {
        this.gcoConfirmedChargedTotal = gcoConfirmedChargedTotal;
    }

    public SearchColumnDoubleField getGcoConfirmedChargedTotal(int i) {
        return this.gcoConfirmedChargedTotal[i];
    }

    public void setGcoConfirmedChargedTotal(int i, SearchColumnDoubleField _value) {
        this.gcoConfirmedChargedTotal[i] = _value;
    }

    public SearchColumnDoubleField[] getGcoConfirmedRefundedTotal() {
        return this.gcoConfirmedRefundedTotal;
    }

    public void setGcoConfirmedRefundedTotal(SearchColumnDoubleField[] gcoConfirmedRefundedTotal) {
        this.gcoConfirmedRefundedTotal = gcoConfirmedRefundedTotal;
    }

    public SearchColumnDoubleField getGcoConfirmedRefundedTotal(int i) {
        return this.gcoConfirmedRefundedTotal[i];
    }

    public void setGcoConfirmedRefundedTotal(int i, SearchColumnDoubleField _value) {
        this.gcoConfirmedRefundedTotal[i] = _value;
    }

    public SearchColumnStringField[] getGcoCreditcardNumber() {
        return this.gcoCreditcardNumber;
    }

    public void setGcoCreditcardNumber(SearchColumnStringField[] gcoCreditcardNumber) {
        this.gcoCreditcardNumber = gcoCreditcardNumber;
    }

    public SearchColumnStringField getGcoCreditcardNumber(int i) {
        return this.gcoCreditcardNumber[i];
    }

    public void setGcoCreditcardNumber(int i, SearchColumnStringField _value) {
        this.gcoCreditcardNumber[i] = _value;
    }

    public SearchColumnEnumSelectField[] getGcoCscMatch() {
        return this.gcoCscMatch;
    }

    public void setGcoCscMatch(SearchColumnEnumSelectField[] gcoCscMatch) {
        this.gcoCscMatch = gcoCscMatch;
    }

    public SearchColumnEnumSelectField getGcoCscMatch(int i) {
        return this.gcoCscMatch[i];
    }

    public void setGcoCscMatch(int i, SearchColumnEnumSelectField _value) {
        this.gcoCscMatch[i] = _value;
    }

    public SearchColumnStringField[] getGcoFinancialState() {
        return this.gcoFinancialState;
    }

    public void setGcoFinancialState(SearchColumnStringField[] gcoFinancialState) {
        this.gcoFinancialState = gcoFinancialState;
    }

    public SearchColumnStringField getGcoFinancialState(int i) {
        return this.gcoFinancialState[i];
    }

    public void setGcoFinancialState(int i, SearchColumnStringField _value) {
        this.gcoFinancialState[i] = _value;
    }

    public SearchColumnStringField[] getGcoFulfillmentState() {
        return this.gcoFulfillmentState;
    }

    public void setGcoFulfillmentState(SearchColumnStringField[] gcoFulfillmentState) {
        this.gcoFulfillmentState = gcoFulfillmentState;
    }

    public SearchColumnStringField getGcoFulfillmentState(int i) {
        return this.gcoFulfillmentState[i];
    }

    public void setGcoFulfillmentState(int i, SearchColumnStringField _value) {
        this.gcoFulfillmentState[i] = _value;
    }

    public SearchColumnStringField[] getGcoOrderId() {
        return this.gcoOrderId;
    }

    public void setGcoOrderId(SearchColumnStringField[] gcoOrderId) {
        this.gcoOrderId = gcoOrderId;
    }

    public SearchColumnStringField getGcoOrderId(int i) {
        return this.gcoOrderId[i];
    }

    public void setGcoOrderId(int i, SearchColumnStringField _value) {
        this.gcoOrderId[i] = _value;
    }

    public SearchColumnDoubleField[] getGcoOrderTotal() {
        return this.gcoOrderTotal;
    }

    public void setGcoOrderTotal(SearchColumnDoubleField[] gcoOrderTotal) {
        this.gcoOrderTotal = gcoOrderTotal;
    }

    public SearchColumnDoubleField getGcoOrderTotal(int i) {
        return this.gcoOrderTotal[i];
    }

    public void setGcoOrderTotal(int i, SearchColumnDoubleField _value) {
        this.gcoOrderTotal[i] = _value;
    }

    public SearchColumnDoubleField[] getGcoPromotionAmount() {
        return this.gcoPromotionAmount;
    }

    public void setGcoPromotionAmount(SearchColumnDoubleField[] gcoPromotionAmount) {
        this.gcoPromotionAmount = gcoPromotionAmount;
    }

    public SearchColumnDoubleField getGcoPromotionAmount(int i) {
        return this.gcoPromotionAmount[i];
    }

    public void setGcoPromotionAmount(int i, SearchColumnDoubleField _value) {
        this.gcoPromotionAmount[i] = _value;
    }

    public SearchColumnStringField[] getGcoPromotionName() {
        return this.gcoPromotionName;
    }

    public void setGcoPromotionName(SearchColumnStringField[] gcoPromotionName) {
        this.gcoPromotionName = gcoPromotionName;
    }

    public SearchColumnStringField getGcoPromotionName(int i) {
        return this.gcoPromotionName[i];
    }

    public void setGcoPromotionName(int i, SearchColumnStringField _value) {
        this.gcoPromotionName[i] = _value;
    }

    public SearchColumnDoubleField[] getGcoRefundAmount() {
        return this.gcoRefundAmount;
    }

    public void setGcoRefundAmount(SearchColumnDoubleField[] gcoRefundAmount) {
        this.gcoRefundAmount = gcoRefundAmount;
    }

    public SearchColumnDoubleField getGcoRefundAmount(int i) {
        return this.gcoRefundAmount[i];
    }

    public void setGcoRefundAmount(int i, SearchColumnDoubleField _value) {
        this.gcoRefundAmount[i] = _value;
    }

    public SearchColumnDoubleField[] getGcoShippingTotal() {
        return this.gcoShippingTotal;
    }

    public void setGcoShippingTotal(SearchColumnDoubleField[] gcoShippingTotal) {
        this.gcoShippingTotal = gcoShippingTotal;
    }

    public SearchColumnDoubleField getGcoShippingTotal(int i) {
        return this.gcoShippingTotal[i];
    }

    public void setGcoShippingTotal(int i, SearchColumnDoubleField _value) {
        this.gcoShippingTotal[i] = _value;
    }

    public SearchColumnStringField[] getGcoStateChangedDetail() {
        return this.gcoStateChangedDetail;
    }

    public void setGcoStateChangedDetail(SearchColumnStringField[] gcoStateChangedDetail) {
        this.gcoStateChangedDetail = gcoStateChangedDetail;
    }

    public SearchColumnStringField getGcoStateChangedDetail(int i) {
        return this.gcoStateChangedDetail[i];
    }

    public void setGcoStateChangedDetail(int i, SearchColumnStringField _value) {
        this.gcoStateChangedDetail[i] = _value;
    }

    public SearchColumnStringField[] getGiftCert() {
        return this.giftCert;
    }

    public void setGiftCert(SearchColumnStringField[] giftCert) {
        this.giftCert = giftCert;
    }

    public SearchColumnStringField getGiftCert(int i) {
        return this.giftCert[i];
    }

    public void setGiftCert(int i, SearchColumnStringField _value) {
        this.giftCert[i] = _value;
    }

    public SearchColumnDoubleField[] getGrossAmount() {
        return this.grossAmount;
    }

    public void setGrossAmount(SearchColumnDoubleField[] grossAmount) {
        this.grossAmount = grossAmount;
    }

    public SearchColumnDoubleField getGrossAmount(int i) {
        return this.grossAmount[i];
    }

    public void setGrossAmount(int i, SearchColumnDoubleField _value) {
        this.grossAmount[i] = _value;
    }

    public SearchColumnBooleanField[] getIncludeInForecast() {
        return this.includeInForecast;
    }

    public void setIncludeInForecast(SearchColumnBooleanField[] includeInForecast) {
        this.includeInForecast = includeInForecast;
    }

    public SearchColumnBooleanField getIncludeInForecast(int i) {
        return this.includeInForecast[i];
    }

    public void setIncludeInForecast(int i, SearchColumnBooleanField _value) {
        this.includeInForecast[i] = _value;
    }

    public SearchColumnSelectField[] getIncoterm() {
        return this.incoterm;
    }

    public void setIncoterm(SearchColumnSelectField[] incoterm) {
        this.incoterm = incoterm;
    }

    public SearchColumnSelectField getIncoterm(int i) {
        return this.incoterm[i];
    }

    public void setIncoterm(int i, SearchColumnSelectField _value) {
        this.incoterm[i] = _value;
    }

    public SearchColumnEnumSelectField[] getIntercoStatus() {
        return this.intercoStatus;
    }

    public void setIntercoStatus(SearchColumnEnumSelectField[] intercoStatus) {
        this.intercoStatus = intercoStatus;
    }

    public SearchColumnEnumSelectField getIntercoStatus(int i) {
        return this.intercoStatus[i];
    }

    public void setIntercoStatus(int i, SearchColumnEnumSelectField _value) {
        this.intercoStatus[i] = _value;
    }

    public SearchColumnStringField[] getIntercoTransaction() {
        return this.intercoTransaction;
    }

    public void setIntercoTransaction(SearchColumnStringField[] intercoTransaction) {
        this.intercoTransaction = intercoTransaction;
    }

    public SearchColumnStringField getIntercoTransaction(int i) {
        return this.intercoTransaction[i];
    }

    public void setIntercoTransaction(int i, SearchColumnStringField _value) {
        this.intercoTransaction[i] = _value;
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

    public SearchColumnSelectField[] getInventoryLocation() {
        return this.inventoryLocation;
    }

    public void setInventoryLocation(SearchColumnSelectField[] inventoryLocation) {
        this.inventoryLocation = inventoryLocation;
    }

    public SearchColumnSelectField getInventoryLocation(int i) {
        return this.inventoryLocation[i];
    }

    public void setInventoryLocation(int i, SearchColumnSelectField _value) {
        this.inventoryLocation[i] = _value;
    }

    public SearchColumnSelectField[] getInventorySubsidiary() {
        return this.inventorySubsidiary;
    }

    public void setInventorySubsidiary(SearchColumnSelectField[] inventorySubsidiary) {
        this.inventorySubsidiary = inventorySubsidiary;
    }

    public SearchColumnSelectField getInventorySubsidiary(int i) {
        return this.inventorySubsidiary[i];
    }

    public void setInventorySubsidiary(int i, SearchColumnSelectField _value) {
        this.inventorySubsidiary[i] = _value;
    }

    public SearchColumnBooleanField[] getInVsoeBundle() {
        return this.inVsoeBundle;
    }

    public void setInVsoeBundle(SearchColumnBooleanField[] inVsoeBundle) {
        this.inVsoeBundle = inVsoeBundle;
    }

    public SearchColumnBooleanField getInVsoeBundle(int i) {
        return this.inVsoeBundle[i];
    }

    public void setInVsoeBundle(int i, SearchColumnBooleanField _value) {
        this.inVsoeBundle[i] = _value;
    }

    public SearchColumnBooleanField[] getIsAllocation() {
        return this.isAllocation;
    }

    public void setIsAllocation(SearchColumnBooleanField[] isAllocation) {
        this.isAllocation = isAllocation;
    }

    public SearchColumnBooleanField getIsAllocation(int i) {
        return this.isAllocation[i];
    }

    public void setIsAllocation(int i, SearchColumnBooleanField _value) {
        this.isAllocation[i] = _value;
    }

    public SearchColumnBooleanField[] getIsBackflush() {
        return this.isBackflush;
    }

    public void setIsBackflush(SearchColumnBooleanField[] isBackflush) {
        this.isBackflush = isBackflush;
    }

    public SearchColumnBooleanField getIsBackflush(int i) {
        return this.isBackflush[i];
    }

    public void setIsBackflush(int i, SearchColumnBooleanField _value) {
        this.isBackflush[i] = _value;
    }

    public SearchColumnBooleanField[] getIsGcoChargeback() {
        return this.isGcoChargeback;
    }

    public void setIsGcoChargeback(SearchColumnBooleanField[] isGcoChargeback) {
        this.isGcoChargeback = isGcoChargeback;
    }

    public SearchColumnBooleanField getIsGcoChargeback(int i) {
        return this.isGcoChargeback[i];
    }

    public void setIsGcoChargeback(int i, SearchColumnBooleanField _value) {
        this.isGcoChargeback[i] = _value;
    }

    public SearchColumnBooleanField[] getIsGcoChargeConfirmed() {
        return this.isGcoChargeConfirmed;
    }

    public void setIsGcoChargeConfirmed(SearchColumnBooleanField[] isGcoChargeConfirmed) {
        this.isGcoChargeConfirmed = isGcoChargeConfirmed;
    }

    public SearchColumnBooleanField getIsGcoChargeConfirmed(int i) {
        return this.isGcoChargeConfirmed[i];
    }

    public void setIsGcoChargeConfirmed(int i, SearchColumnBooleanField _value) {
        this.isGcoChargeConfirmed[i] = _value;
    }

    public SearchColumnBooleanField[] getIsGcoPaymentGuaranteed() {
        return this.isGcoPaymentGuaranteed;
    }

    public void setIsGcoPaymentGuaranteed(SearchColumnBooleanField[] isGcoPaymentGuaranteed) {
        this.isGcoPaymentGuaranteed = isGcoPaymentGuaranteed;
    }

    public SearchColumnBooleanField getIsGcoPaymentGuaranteed(int i) {
        return this.isGcoPaymentGuaranteed[i];
    }

    public void setIsGcoPaymentGuaranteed(int i, SearchColumnBooleanField _value) {
        this.isGcoPaymentGuaranteed[i] = _value;
    }

    public SearchColumnBooleanField[] getIsGcoRefundConfirmed() {
        return this.isGcoRefundConfirmed;
    }

    public void setIsGcoRefundConfirmed(SearchColumnBooleanField[] isGcoRefundConfirmed) {
        this.isGcoRefundConfirmed = isGcoRefundConfirmed;
    }

    public SearchColumnBooleanField getIsGcoRefundConfirmed(int i) {
        return this.isGcoRefundConfirmed[i];
    }

    public void setIsGcoRefundConfirmed(int i, SearchColumnBooleanField _value) {
        this.isGcoRefundConfirmed[i] = _value;
    }

    public SearchColumnBooleanField[] getIsInsideDelivery() {
        return this.isInsideDelivery;
    }

    public void setIsInsideDelivery(SearchColumnBooleanField[] isInsideDelivery) {
        this.isInsideDelivery = isInsideDelivery;
    }

    public SearchColumnBooleanField getIsInsideDelivery(int i) {
        return this.isInsideDelivery[i];
    }

    public void setIsInsideDelivery(int i, SearchColumnBooleanField _value) {
        this.isInsideDelivery[i] = _value;
    }

    public SearchColumnBooleanField[] getIsInsidePickup() {
        return this.isInsidePickup;
    }

    public void setIsInsidePickup(SearchColumnBooleanField[] isInsidePickup) {
        this.isInsidePickup = isInsidePickup;
    }

    public SearchColumnBooleanField getIsInsidePickup(int i) {
        return this.isInsidePickup[i];
    }

    public void setIsInsidePickup(int i, SearchColumnBooleanField _value) {
        this.isInsidePickup[i] = _value;
    }

    public SearchColumnBooleanField[] getIsIntercompanyAdjustment() {
        return this.isIntercompanyAdjustment;
    }

    public void setIsIntercompanyAdjustment(SearchColumnBooleanField[] isIntercompanyAdjustment) {
        this.isIntercompanyAdjustment = isIntercompanyAdjustment;
    }

    public SearchColumnBooleanField getIsIntercompanyAdjustment(int i) {
        return this.isIntercompanyAdjustment[i];
    }

    public void setIsIntercompanyAdjustment(int i, SearchColumnBooleanField _value) {
        this.isIntercompanyAdjustment[i] = _value;
    }

    public SearchColumnBooleanField[] getIsInTransitPayment() {
        return this.isInTransitPayment;
    }

    public void setIsInTransitPayment(SearchColumnBooleanField[] isInTransitPayment) {
        this.isInTransitPayment = isInTransitPayment;
    }

    public SearchColumnBooleanField getIsInTransitPayment(int i) {
        return this.isInTransitPayment[i];
    }

    public void setIsInTransitPayment(int i, SearchColumnBooleanField _value) {
        this.isInTransitPayment[i] = _value;
    }

    public SearchColumnBooleanField[] getIsMultiShipTo() {
        return this.isMultiShipTo;
    }

    public void setIsMultiShipTo(SearchColumnBooleanField[] isMultiShipTo) {
        this.isMultiShipTo = isMultiShipTo;
    }

    public SearchColumnBooleanField getIsMultiShipTo(int i) {
        return this.isMultiShipTo[i];
    }

    public void setIsMultiShipTo(int i, SearchColumnBooleanField _value) {
        this.isMultiShipTo[i] = _value;
    }

    public SearchColumnBooleanField[] getIsReversal() {
        return this.isReversal;
    }

    public void setIsReversal(SearchColumnBooleanField[] isReversal) {
        this.isReversal = isReversal;
    }

    public SearchColumnBooleanField getIsReversal(int i) {
        return this.isReversal[i];
    }

    public void setIsReversal(int i, SearchColumnBooleanField _value) {
        this.isReversal[i] = _value;
    }

    public SearchColumnBooleanField[] getIsRevRecTransaction() {
        return this.isRevRecTransaction;
    }

    public void setIsRevRecTransaction(SearchColumnBooleanField[] isRevRecTransaction) {
        this.isRevRecTransaction = isRevRecTransaction;
    }

    public SearchColumnBooleanField getIsRevRecTransaction(int i) {
        return this.isRevRecTransaction[i];
    }

    public void setIsRevRecTransaction(int i, SearchColumnBooleanField _value) {
        this.isRevRecTransaction[i] = _value;
    }

    public SearchColumnBooleanField[] getIsScrap() {
        return this.isScrap;
    }

    public void setIsScrap(SearchColumnBooleanField[] isScrap) {
        this.isScrap = isScrap;
    }

    public SearchColumnBooleanField getIsScrap(int i) {
        return this.isScrap[i];
    }

    public void setIsScrap(int i, SearchColumnBooleanField _value) {
        this.isScrap[i] = _value;
    }

    public SearchColumnBooleanField[] getIsShipAddress() {
        return this.isShipAddress;
    }

    public void setIsShipAddress(SearchColumnBooleanField[] isShipAddress) {
        this.isShipAddress = isShipAddress;
    }

    public SearchColumnBooleanField getIsShipAddress(int i) {
        return this.isShipAddress[i];
    }

    public void setIsShipAddress(int i, SearchColumnBooleanField _value) {
        this.isShipAddress[i] = _value;
    }

    public SearchColumnBooleanField[] getIsTransferPriceCosting() {
        return this.isTransferPriceCosting;
    }

    public void setIsTransferPriceCosting(SearchColumnBooleanField[] isTransferPriceCosting) {
        this.isTransferPriceCosting = isTransferPriceCosting;
    }

    public SearchColumnBooleanField getIsTransferPriceCosting(int i) {
        return this.isTransferPriceCosting[i];
    }

    public void setIsTransferPriceCosting(int i, SearchColumnBooleanField _value) {
        this.isTransferPriceCosting[i] = _value;
    }

    public SearchColumnBooleanField[] getIsWip() {
        return this.isWip;
    }

    public void setIsWip(SearchColumnBooleanField[] isWip) {
        this.isWip = isWip;
    }

    public SearchColumnBooleanField getIsWip(int i) {
        return this.isWip[i];
    }

    public void setIsWip(int i, SearchColumnBooleanField _value) {
        this.isWip[i] = _value;
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

    public SearchColumnEnumSelectField[] getItemFulfillmentChoice() {
        return this.itemFulfillmentChoice;
    }

    public void setItemFulfillmentChoice(SearchColumnEnumSelectField[] itemFulfillmentChoice) {
        this.itemFulfillmentChoice = itemFulfillmentChoice;
    }

    public SearchColumnEnumSelectField getItemFulfillmentChoice(int i) {
        return this.itemFulfillmentChoice[i];
    }

    public void setItemFulfillmentChoice(int i, SearchColumnEnumSelectField _value) {
        this.itemFulfillmentChoice[i] = _value;
    }

    public SearchColumnSelectField[] getItemRevision() {
        return this.itemRevision;
    }

    public void setItemRevision(SearchColumnSelectField[] itemRevision) {
        this.itemRevision = itemRevision;
    }

    public SearchColumnSelectField getItemRevision(int i) {
        return this.itemRevision[i];
    }

    public void setItemRevision(int i, SearchColumnSelectField _value) {
        this.itemRevision[i] = _value;
    }

    public SearchColumnBooleanField[] getLandedCostPerLine() {
        return this.landedCostPerLine;
    }

    public void setLandedCostPerLine(SearchColumnBooleanField[] landedCostPerLine) {
        this.landedCostPerLine = landedCostPerLine;
    }

    public SearchColumnBooleanField getLandedCostPerLine(int i) {
        return this.landedCostPerLine[i];
    }

    public void setLandedCostPerLine(int i, SearchColumnBooleanField _value) {
        this.landedCostPerLine[i] = _value;
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

    public SearchColumnLongField[] getLine() {
        return this.line;
    }

    public void setLine(SearchColumnLongField[] line) {
        this.line = line;
    }

    public SearchColumnLongField getLine(int i) {
        return this.line[i];
    }

    public void setLine(int i, SearchColumnLongField _value) {
        this.line[i] = _value;
    }

    public SearchColumnLongField[] getLineSequenceNumber() {
        return this.lineSequenceNumber;
    }

    public void setLineSequenceNumber(SearchColumnLongField[] lineSequenceNumber) {
        this.lineSequenceNumber = lineSequenceNumber;
    }

    public SearchColumnLongField getLineSequenceNumber(int i) {
        return this.lineSequenceNumber[i];
    }

    public void setLineSequenceNumber(int i, SearchColumnLongField _value) {
        this.lineSequenceNumber[i] = _value;
    }

    public SearchColumnLongField[] getLineUniqueKey() {
        return this.lineUniqueKey;
    }

    public void setLineUniqueKey(SearchColumnLongField[] lineUniqueKey) {
        this.lineUniqueKey = lineUniqueKey;
    }

    public SearchColumnLongField getLineUniqueKey(int i) {
        return this.lineUniqueKey[i];
    }

    public void setLineUniqueKey(int i, SearchColumnLongField _value) {
        this.lineUniqueKey[i] = _value;
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

    public SearchColumnBooleanField[] getLocationAutoAssigned() {
        return this.locationAutoAssigned;
    }

    public void setLocationAutoAssigned(SearchColumnBooleanField[] locationAutoAssigned) {
        this.locationAutoAssigned = locationAutoAssigned;
    }

    public SearchColumnBooleanField getLocationAutoAssigned(int i) {
        return this.locationAutoAssigned[i];
    }

    public void setLocationAutoAssigned(int i, SearchColumnBooleanField _value) {
        this.locationAutoAssigned[i] = _value;
    }

    public SearchColumnBooleanField[] getMainLine() {
        return this.mainLine;
    }

    public void setMainLine(SearchColumnBooleanField[] mainLine) {
        this.mainLine = mainLine;
    }

    public SearchColumnBooleanField getMainLine(int i) {
        return this.mainLine[i];
    }

    public void setMainLine(int i, SearchColumnBooleanField _value) {
        this.mainLine[i] = _value;
    }

    public SearchColumnStringField[] getMainName() {
        return this.mainName;
    }

    public void setMainName(SearchColumnStringField[] mainName) {
        this.mainName = mainName;
    }

    public SearchColumnStringField getMainName(int i) {
        return this.mainName[i];
    }

    public void setMainName(int i, SearchColumnStringField _value) {
        this.mainName[i] = _value;
    }

    public SearchColumnSelectField[] getManufacturingRouting() {
        return this.manufacturingRouting;
    }

    public void setManufacturingRouting(SearchColumnSelectField[] manufacturingRouting) {
        this.manufacturingRouting = manufacturingRouting;
    }

    public SearchColumnSelectField getManufacturingRouting(int i) {
        return this.manufacturingRouting[i];
    }

    public void setManufacturingRouting(int i, SearchColumnSelectField _value) {
        this.manufacturingRouting[i] = _value;
    }

    public SearchColumnBooleanField[] getMatchBillToReceipt() {
        return this.matchBillToReceipt;
    }

    public void setMatchBillToReceipt(SearchColumnBooleanField[] matchBillToReceipt) {
        this.matchBillToReceipt = matchBillToReceipt;
    }

    public SearchColumnBooleanField getMatchBillToReceipt(int i) {
        return this.matchBillToReceipt[i];
    }

    public void setMatchBillToReceipt(int i, SearchColumnBooleanField _value) {
        this.matchBillToReceipt[i] = _value;
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

    public SearchColumnStringField[] getMemoMain() {
        return this.memoMain;
    }

    public void setMemoMain(SearchColumnStringField[] memoMain) {
        this.memoMain = memoMain;
    }

    public SearchColumnStringField getMemoMain(int i) {
        return this.memoMain[i];
    }

    public void setMemoMain(int i, SearchColumnStringField _value) {
        this.memoMain[i] = _value;
    }

    public SearchColumnBooleanField[] getMemorized() {
        return this.memorized;
    }

    public void setMemorized(SearchColumnBooleanField[] memorized) {
        this.memorized = memorized;
    }

    public SearchColumnBooleanField getMemorized(int i) {
        return this.memorized[i];
    }

    public void setMemorized(int i, SearchColumnBooleanField _value) {
        this.memorized[i] = _value;
    }

    public SearchColumnSelectField[] getMerchantAccount() {
        return this.merchantAccount;
    }

    public void setMerchantAccount(SearchColumnSelectField[] merchantAccount) {
        this.merchantAccount = merchantAccount;
    }

    public SearchColumnSelectField getMerchantAccount(int i) {
        return this.merchantAccount[i];
    }

    public void setMerchantAccount(int i, SearchColumnSelectField _value) {
        this.merchantAccount[i] = _value;
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

    public SearchColumnBooleanField[] getMultiSubsidiary() {
        return this.multiSubsidiary;
    }

    public void setMultiSubsidiary(SearchColumnBooleanField[] multiSubsidiary) {
        this.multiSubsidiary = multiSubsidiary;
    }

    public SearchColumnBooleanField getMultiSubsidiary(int i) {
        return this.multiSubsidiary[i];
    }

    public void setMultiSubsidiary(int i, SearchColumnBooleanField _value) {
        this.multiSubsidiary[i] = _value;
    }

    public SearchColumnDoubleField[] getNetAmount() {
        return this.netAmount;
    }

    public void setNetAmount(SearchColumnDoubleField[] netAmount) {
        this.netAmount = netAmount;
    }

    public SearchColumnDoubleField getNetAmount(int i) {
        return this.netAmount[i];
    }

    public void setNetAmount(int i, SearchColumnDoubleField _value) {
        this.netAmount[i] = _value;
    }

    public SearchColumnDoubleField[] getNetAmountNoTax() {
        return this.netAmountNoTax;
    }

    public void setNetAmountNoTax(SearchColumnDoubleField[] netAmountNoTax) {
        this.netAmountNoTax = netAmountNoTax;
    }

    public SearchColumnDoubleField getNetAmountNoTax(int i) {
        return this.netAmountNoTax[i];
    }

    public void setNetAmountNoTax(int i, SearchColumnDoubleField _value) {
        this.netAmountNoTax[i] = _value;
    }

    public SearchColumnSelectField[] getNextApprover() {
        return this.nextApprover;
    }

    public void setNextApprover(SearchColumnSelectField[] nextApprover) {
        this.nextApprover = nextApprover;
    }

    public SearchColumnSelectField getNextApprover(int i) {
        return this.nextApprover[i];
    }

    public void setNextApprover(int i, SearchColumnSelectField _value) {
        this.nextApprover[i] = _value;
    }

    public SearchColumnDateField[] getNextBillDate() {
        return this.nextBillDate;
    }

    public void setNextBillDate(SearchColumnDateField[] nextBillDate) {
        this.nextBillDate = nextBillDate;
    }

    public SearchColumnDateField getNextBillDate(int i) {
        return this.nextBillDate[i];
    }

    public void setNextBillDate(int i, SearchColumnDateField _value) {
        this.nextBillDate[i] = _value;
    }

    public SearchColumnSelectField[] getNexus() {
        return this.nexus;
    }

    public void setNexus(SearchColumnSelectField[] nexus) {
        this.nexus = nexus;
    }

    public SearchColumnSelectField getNexus(int i) {
        return this.nexus[i];
    }

    public void setNexus(int i, SearchColumnSelectField _value) {
        this.nexus[i] = _value;
    }

    public SearchColumnBooleanField[] getNoAutoAssignLocation() {
        return this.noAutoAssignLocation;
    }

    public void setNoAutoAssignLocation(SearchColumnBooleanField[] noAutoAssignLocation) {
        this.noAutoAssignLocation = noAutoAssignLocation;
    }

    public SearchColumnBooleanField getNoAutoAssignLocation(int i) {
        return this.noAutoAssignLocation[i];
    }

    public void setNoAutoAssignLocation(int i, SearchColumnBooleanField _value) {
        this.noAutoAssignLocation[i] = _value;
    }

    public SearchColumnBooleanField[] getNonReimbursable() {
        return this.nonReimbursable;
    }

    public void setNonReimbursable(SearchColumnBooleanField[] nonReimbursable) {
        this.nonReimbursable = nonReimbursable;
    }

    public SearchColumnBooleanField getNonReimbursable(int i) {
        return this.nonReimbursable[i];
    }

    public void setNonReimbursable(int i, SearchColumnBooleanField _value) {
        this.nonReimbursable[i] = _value;
    }

    public SearchColumnDoubleField[] getOneTimeTotal() {
        return this.oneTimeTotal;
    }

    public void setOneTimeTotal(SearchColumnDoubleField[] oneTimeTotal) {
        this.oneTimeTotal = oneTimeTotal;
    }

    public SearchColumnDoubleField getOneTimeTotal(int i) {
        return this.oneTimeTotal[i];
    }

    public void setOneTimeTotal(int i, SearchColumnDoubleField _value) {
        this.oneTimeTotal[i] = _value;
    }

    public SearchColumnSelectField[] getOpportunity() {
        return this.opportunity;
    }

    public void setOpportunity(SearchColumnSelectField[] opportunity) {
        this.opportunity = opportunity;
    }

    public SearchColumnSelectField getOpportunity(int i) {
        return this.opportunity[i];
    }

    public void setOpportunity(int i, SearchColumnSelectField _value) {
        this.opportunity[i] = _value;
    }

    public SearchColumnStringField[] getOptions() {
        return this.options;
    }

    public void setOptions(SearchColumnStringField[] options) {
        this.options = options;
    }

    public SearchColumnStringField getOptions(int i) {
        return this.options[i];
    }

    public void setOptions(int i, SearchColumnStringField _value) {
        this.options[i] = _value;
    }

    public SearchColumnSelectField[] getOrderAllocationStrategy() {
        return this.orderAllocationStrategy;
    }

    public void setOrderAllocationStrategy(SearchColumnSelectField[] orderAllocationStrategy) {
        this.orderAllocationStrategy = orderAllocationStrategy;
    }

    public SearchColumnSelectField getOrderAllocationStrategy(int i) {
        return this.orderAllocationStrategy[i];
    }

    public void setOrderAllocationStrategy(int i, SearchColumnSelectField _value) {
        this.orderAllocationStrategy[i] = _value;
    }

    public SearchColumnDoubleField[] getOrderPriority() {
        return this.orderPriority;
    }

    public void setOrderPriority(SearchColumnDoubleField[] orderPriority) {
        this.orderPriority = orderPriority;
    }

    public SearchColumnDoubleField getOrderPriority(int i) {
        return this.orderPriority[i];
    }

    public void setOrderPriority(int i, SearchColumnDoubleField _value) {
        this.orderPriority[i] = _value;
    }

    public SearchColumnEnumSelectField[] getOriginator() {
        return this.originator;
    }

    public void setOriginator(SearchColumnEnumSelectField[] originator) {
        this.originator = originator;
    }

    public SearchColumnEnumSelectField getOriginator(int i) {
        return this.originator[i];
    }

    public void setOriginator(int i, SearchColumnEnumSelectField _value) {
        this.originator[i] = _value;
    }

    public SearchColumnTextNumberField[] getOtherRefNum() {
        return this.otherRefNum;
    }

    public void setOtherRefNum(SearchColumnTextNumberField[] otherRefNum) {
        this.otherRefNum = otherRefNum;
    }

    public SearchColumnTextNumberField getOtherRefNum(int i) {
        return this.otherRefNum[i];
    }

    public void setOtherRefNum(int i, SearchColumnTextNumberField _value) {
        this.otherRefNum[i] = _value;
    }

    public SearchColumnSelectField[] getOverheadParentItem() {
        return this.overheadParentItem;
    }

    public void setOverheadParentItem(SearchColumnSelectField[] overheadParentItem) {
        this.overheadParentItem = overheadParentItem;
    }

    public SearchColumnSelectField getOverheadParentItem(int i) {
        return this.overheadParentItem[i];
    }

    public void setOverheadParentItem(int i, SearchColumnSelectField _value) {
        this.overheadParentItem[i] = _value;
    }

    public SearchColumnBooleanField[] getOverrideInstallments() {
        return this.overrideInstallments;
    }

    public void setOverrideInstallments(SearchColumnBooleanField[] overrideInstallments) {
        this.overrideInstallments = overrideInstallments;
    }

    public SearchColumnBooleanField getOverrideInstallments(int i) {
        return this.overrideInstallments[i];
    }

    public void setOverrideInstallments(int i, SearchColumnBooleanField _value) {
        this.overrideInstallments[i] = _value;
    }

    public SearchColumnLongField[] getPackageCount() {
        return this.packageCount;
    }

    public void setPackageCount(SearchColumnLongField[] packageCount) {
        this.packageCount = packageCount;
    }

    public SearchColumnLongField getPackageCount(int i) {
        return this.packageCount[i];
    }

    public void setPackageCount(int i, SearchColumnLongField _value) {
        this.packageCount[i] = _value;
    }

    public SearchColumnDoubleField[] getPaidAmount() {
        return this.paidAmount;
    }

    public void setPaidAmount(SearchColumnDoubleField[] paidAmount) {
        this.paidAmount = paidAmount;
    }

    public SearchColumnDoubleField getPaidAmount(int i) {
        return this.paidAmount[i];
    }

    public void setPaidAmount(int i, SearchColumnDoubleField _value) {
        this.paidAmount[i] = _value;
    }

    public SearchColumnSelectField[] getPaidTransaction() {
        return this.paidTransaction;
    }

    public void setPaidTransaction(SearchColumnSelectField[] paidTransaction) {
        this.paidTransaction = paidTransaction;
    }

    public SearchColumnSelectField getPaidTransaction(int i) {
        return this.paidTransaction[i];
    }

    public void setPaidTransaction(int i, SearchColumnSelectField _value) {
        this.paidTransaction[i] = _value;
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

    public SearchColumnDoubleField[] getPayingAmount() {
        return this.payingAmount;
    }

    public void setPayingAmount(SearchColumnDoubleField[] payingAmount) {
        this.payingAmount = payingAmount;
    }

    public SearchColumnDoubleField getPayingAmount(int i) {
        return this.payingAmount[i];
    }

    public void setPayingAmount(int i, SearchColumnDoubleField _value) {
        this.payingAmount[i] = _value;
    }

    public SearchColumnSelectField[] getPayingTransaction() {
        return this.payingTransaction;
    }

    public void setPayingTransaction(SearchColumnSelectField[] payingTransaction) {
        this.payingTransaction = payingTransaction;
    }

    public SearchColumnSelectField getPayingTransaction(int i) {
        return this.payingTransaction[i];
    }

    public void setPayingTransaction(int i, SearchColumnSelectField _value) {
        this.payingTransaction[i] = _value;
    }

    public SearchColumnBooleanField[] getPaymentApproved() {
        return this.paymentApproved;
    }

    public void setPaymentApproved(SearchColumnBooleanField[] paymentApproved) {
        this.paymentApproved = paymentApproved;
    }

    public SearchColumnBooleanField getPaymentApproved(int i) {
        return this.paymentApproved[i];
    }

    public void setPaymentApproved(int i, SearchColumnBooleanField _value) {
        this.paymentApproved[i] = _value;
    }

    public SearchColumnDateField[] getPaymentEventDate() {
        return this.paymentEventDate;
    }

    public void setPaymentEventDate(SearchColumnDateField[] paymentEventDate) {
        this.paymentEventDate = paymentEventDate;
    }

    public SearchColumnDateField getPaymentEventDate(int i) {
        return this.paymentEventDate[i];
    }

    public void setPaymentEventDate(int i, SearchColumnDateField _value) {
        this.paymentEventDate[i] = _value;
    }

    public SearchColumnEnumSelectField[] getPaymentEventHoldReason() {
        return this.paymentEventHoldReason;
    }

    public void setPaymentEventHoldReason(SearchColumnEnumSelectField[] paymentEventHoldReason) {
        this.paymentEventHoldReason = paymentEventHoldReason;
    }

    public SearchColumnEnumSelectField getPaymentEventHoldReason(int i) {
        return this.paymentEventHoldReason[i];
    }

    public void setPaymentEventHoldReason(int i, SearchColumnEnumSelectField _value) {
        this.paymentEventHoldReason[i] = _value;
    }

    public SearchColumnBooleanField[] getPaymentEventPurchaseCardUsed() {
        return this.paymentEventPurchaseCardUsed;
    }

    public void setPaymentEventPurchaseCardUsed(SearchColumnBooleanField[] paymentEventPurchaseCardUsed) {
        this.paymentEventPurchaseCardUsed = paymentEventPurchaseCardUsed;
    }

    public SearchColumnBooleanField getPaymentEventPurchaseCardUsed(int i) {
        return this.paymentEventPurchaseCardUsed[i];
    }

    public void setPaymentEventPurchaseCardUsed(int i, SearchColumnBooleanField _value) {
        this.paymentEventPurchaseCardUsed[i] = _value;
    }

    public SearchColumnBooleanField[] getPaymentEventPurchaseDataSent() {
        return this.paymentEventPurchaseDataSent;
    }

    public void setPaymentEventPurchaseDataSent(SearchColumnBooleanField[] paymentEventPurchaseDataSent) {
        this.paymentEventPurchaseDataSent = paymentEventPurchaseDataSent;
    }

    public SearchColumnBooleanField getPaymentEventPurchaseDataSent(int i) {
        return this.paymentEventPurchaseDataSent[i];
    }

    public void setPaymentEventPurchaseDataSent(int i, SearchColumnBooleanField _value) {
        this.paymentEventPurchaseDataSent[i] = _value;
    }

    public SearchColumnEnumSelectField[] getPaymentEventResult() {
        return this.paymentEventResult;
    }

    public void setPaymentEventResult(SearchColumnEnumSelectField[] paymentEventResult) {
        this.paymentEventResult = paymentEventResult;
    }

    public SearchColumnEnumSelectField getPaymentEventResult(int i) {
        return this.paymentEventResult[i];
    }

    public void setPaymentEventResult(int i, SearchColumnEnumSelectField _value) {
        this.paymentEventResult[i] = _value;
    }

    public SearchColumnEnumSelectField[] getPaymentEventType() {
        return this.paymentEventType;
    }

    public void setPaymentEventType(SearchColumnEnumSelectField[] paymentEventType) {
        this.paymentEventType = paymentEventType;
    }

    public SearchColumnEnumSelectField getPaymentEventType(int i) {
        return this.paymentEventType[i];
    }

    public void setPaymentEventType(int i, SearchColumnEnumSelectField _value) {
        this.paymentEventType[i] = _value;
    }

    public SearchColumnBooleanField[] getPaymentHold() {
        return this.paymentHold;
    }

    public void setPaymentHold(SearchColumnBooleanField[] paymentHold) {
        this.paymentHold = paymentHold;
    }

    public SearchColumnBooleanField getPaymentHold(int i) {
        return this.paymentHold[i];
    }

    public void setPaymentHold(int i, SearchColumnBooleanField _value) {
        this.paymentHold[i] = _value;
    }

    public SearchColumnSelectField[] getPaymentMethod() {
        return this.paymentMethod;
    }

    public void setPaymentMethod(SearchColumnSelectField[] paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public SearchColumnSelectField getPaymentMethod(int i) {
        return this.paymentMethod[i];
    }

    public void setPaymentMethod(int i, SearchColumnSelectField _value) {
        this.paymentMethod[i] = _value;
    }

    public SearchColumnSelectField[] getPaymentOption() {
        return this.paymentOption;
    }

    public void setPaymentOption(SearchColumnSelectField[] paymentOption) {
        this.paymentOption = paymentOption;
    }

    public SearchColumnSelectField getPaymentOption(int i) {
        return this.paymentOption[i];
    }

    public void setPaymentOption(int i, SearchColumnSelectField _value) {
        this.paymentOption[i] = _value;
    }

    public SearchColumnBooleanField[] getPayPalPending() {
        return this.payPalPending;
    }

    public void setPayPalPending(SearchColumnBooleanField[] payPalPending) {
        this.payPalPending = payPalPending;
    }

    public SearchColumnBooleanField getPayPalPending(int i) {
        return this.payPalPending[i];
    }

    public void setPayPalPending(int i, SearchColumnBooleanField _value) {
        this.payPalPending[i] = _value;
    }

    public SearchColumnStringField[] getPayPalStatus() {
        return this.payPalStatus;
    }

    public void setPayPalStatus(SearchColumnStringField[] payPalStatus) {
        this.payPalStatus = payPalStatus;
    }

    public SearchColumnStringField getPayPalStatus(int i) {
        return this.payPalStatus[i];
    }

    public void setPayPalStatus(int i, SearchColumnStringField _value) {
        this.payPalStatus[i] = _value;
    }

    public SearchColumnStringField[] getPayPalTranId() {
        return this.payPalTranId;
    }

    public void setPayPalTranId(SearchColumnStringField[] payPalTranId) {
        this.payPalTranId = payPalTranId;
    }

    public SearchColumnStringField getPayPalTranId(int i) {
        return this.payPalTranId[i];
    }

    public void setPayPalTranId(int i, SearchColumnStringField _value) {
        this.payPalTranId[i] = _value;
    }

    public SearchColumnStringField[] getPayrollBatch() {
        return this.payrollBatch;
    }

    public void setPayrollBatch(SearchColumnStringField[] payrollBatch) {
        this.payrollBatch = payrollBatch;
    }

    public SearchColumnStringField getPayrollBatch(int i) {
        return this.payrollBatch[i];
    }

    public void setPayrollBatch(int i, SearchColumnStringField _value) {
        this.payrollBatch[i] = _value;
    }

    public SearchColumnStringField[] getPnRefNum() {
        return this.pnRefNum;
    }

    public void setPnRefNum(SearchColumnStringField[] pnRefNum) {
        this.pnRefNum = pnRefNum;
    }

    public SearchColumnStringField getPnRefNum(int i) {
        return this.pnRefNum[i];
    }

    public void setPnRefNum(int i, SearchColumnStringField _value) {
        this.pnRefNum[i] = _value;
    }

    public SearchColumnBooleanField[] getPolicyViolated() {
        return this.policyViolated;
    }

    public void setPolicyViolated(SearchColumnBooleanField[] policyViolated) {
        this.policyViolated = policyViolated;
    }

    public SearchColumnBooleanField getPolicyViolated(int i) {
        return this.policyViolated[i];
    }

    public void setPolicyViolated(int i, SearchColumnBooleanField _value) {
        this.policyViolated[i] = _value;
    }

    public SearchColumnDoubleField[] getPoRate() {
        return this.poRate;
    }

    public void setPoRate(SearchColumnDoubleField[] poRate) {
        this.poRate = poRate;
    }

    public SearchColumnDoubleField getPoRate(int i) {
        return this.poRate[i];
    }

    public void setPoRate(int i, SearchColumnDoubleField _value) {
        this.poRate[i] = _value;
    }

    public SearchColumnBooleanField[] getPosting() {
        return this.posting;
    }

    public void setPosting(SearchColumnBooleanField[] posting) {
        this.posting = posting;
    }

    public SearchColumnBooleanField getPosting(int i) {
        return this.posting[i];
    }

    public void setPosting(int i, SearchColumnBooleanField _value) {
        this.posting[i] = _value;
    }

    public SearchColumnSelectField[] getPostingPeriod() {
        return this.postingPeriod;
    }

    public void setPostingPeriod(SearchColumnSelectField[] postingPeriod) {
        this.postingPeriod = postingPeriod;
    }

    public SearchColumnSelectField getPostingPeriod(int i) {
        return this.postingPeriod[i];
    }

    public void setPostingPeriod(int i, SearchColumnSelectField _value) {
        this.postingPeriod[i] = _value;
    }

    public SearchColumnSelectField[] getPriceLevel() {
        return this.priceLevel;
    }

    public void setPriceLevel(SearchColumnSelectField[] priceLevel) {
        this.priceLevel = priceLevel;
    }

    public SearchColumnSelectField getPriceLevel(int i) {
        return this.priceLevel[i];
    }

    public void setPriceLevel(int i, SearchColumnSelectField _value) {
        this.priceLevel[i] = _value;
    }

    public SearchColumnStringField[] getPrint() {
        return this.print;
    }

    public void setPrint(SearchColumnStringField[] print) {
        this.print = print;
    }

    public SearchColumnStringField getPrint(int i) {
        return this.print[i];
    }

    public void setPrint(int i, SearchColumnStringField _value) {
        this.print[i] = _value;
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

    public SearchColumnDoubleField[] getProjectedAmount() {
        return this.projectedAmount;
    }

    public void setProjectedAmount(SearchColumnDoubleField[] projectedAmount) {
        this.projectedAmount = projectedAmount;
    }

    public SearchColumnDoubleField getProjectedAmount(int i) {
        return this.projectedAmount[i];
    }

    public void setProjectedAmount(int i, SearchColumnDoubleField _value) {
        this.projectedAmount[i] = _value;
    }

    public SearchColumnSelectField[] getProjectTask() {
        return this.projectTask;
    }

    public void setProjectTask(SearchColumnSelectField[] projectTask) {
        this.projectTask = projectTask;
    }

    public SearchColumnSelectField getProjectTask(int i) {
        return this.projectTask[i];
    }

    public void setProjectTask(int i, SearchColumnSelectField _value) {
        this.projectTask[i] = _value;
    }

    public SearchColumnSelectField[] getPromoCode() {
        return this.promoCode;
    }

    public void setPromoCode(SearchColumnSelectField[] promoCode) {
        this.promoCode = promoCode;
    }

    public SearchColumnSelectField getPromoCode(int i) {
        return this.promoCode[i];
    }

    public void setPromoCode(int i, SearchColumnSelectField _value) {
        this.promoCode[i] = _value;
    }

    public SearchColumnSelectField[] getPurchaseOrder() {
        return this.purchaseOrder;
    }

    public void setPurchaseOrder(SearchColumnSelectField[] purchaseOrder) {
        this.purchaseOrder = purchaseOrder;
    }

    public SearchColumnSelectField getPurchaseOrder(int i) {
        return this.purchaseOrder[i];
    }

    public void setPurchaseOrder(int i, SearchColumnSelectField _value) {
        this.purchaseOrder[i] = _value;
    }

    public SearchColumnDoubleField[] getQuantity() {
        return this.quantity;
    }

    public void setQuantity(SearchColumnDoubleField[] quantity) {
        this.quantity = quantity;
    }

    public SearchColumnDoubleField getQuantity(int i) {
        return this.quantity[i];
    }

    public void setQuantity(int i, SearchColumnDoubleField _value) {
        this.quantity[i] = _value;
    }

    public SearchColumnDoubleField[] getQuantityBilled() {
        return this.quantityBilled;
    }

    public void setQuantityBilled(SearchColumnDoubleField[] quantityBilled) {
        this.quantityBilled = quantityBilled;
    }

    public SearchColumnDoubleField getQuantityBilled(int i) {
        return this.quantityBilled[i];
    }

    public void setQuantityBilled(int i, SearchColumnDoubleField _value) {
        this.quantityBilled[i] = _value;
    }

    public SearchColumnDoubleField[] getQuantityCommitted() {
        return this.quantityCommitted;
    }

    public void setQuantityCommitted(SearchColumnDoubleField[] quantityCommitted) {
        this.quantityCommitted = quantityCommitted;
    }

    public SearchColumnDoubleField getQuantityCommitted(int i) {
        return this.quantityCommitted[i];
    }

    public void setQuantityCommitted(int i, SearchColumnDoubleField _value) {
        this.quantityCommitted[i] = _value;
    }

    public SearchColumnDoubleField[] getQuantityPacked() {
        return this.quantityPacked;
    }

    public void setQuantityPacked(SearchColumnDoubleField[] quantityPacked) {
        this.quantityPacked = quantityPacked;
    }

    public SearchColumnDoubleField getQuantityPacked(int i) {
        return this.quantityPacked[i];
    }

    public void setQuantityPacked(int i, SearchColumnDoubleField _value) {
        this.quantityPacked[i] = _value;
    }

    public SearchColumnDoubleField[] getQuantityPicked() {
        return this.quantityPicked;
    }

    public void setQuantityPicked(SearchColumnDoubleField[] quantityPicked) {
        this.quantityPicked = quantityPicked;
    }

    public SearchColumnDoubleField getQuantityPicked(int i) {
        return this.quantityPicked[i];
    }

    public void setQuantityPicked(int i, SearchColumnDoubleField _value) {
        this.quantityPicked[i] = _value;
    }

    public SearchColumnDoubleField[] getQuantityRevCommitted() {
        return this.quantityRevCommitted;
    }

    public void setQuantityRevCommitted(SearchColumnDoubleField[] quantityRevCommitted) {
        this.quantityRevCommitted = quantityRevCommitted;
    }

    public SearchColumnDoubleField getQuantityRevCommitted(int i) {
        return this.quantityRevCommitted[i];
    }

    public void setQuantityRevCommitted(int i, SearchColumnDoubleField _value) {
        this.quantityRevCommitted[i] = _value;
    }

    public SearchColumnDoubleField[] getQuantityShipRecv() {
        return this.quantityShipRecv;
    }

    public void setQuantityShipRecv(SearchColumnDoubleField[] quantityShipRecv) {
        this.quantityShipRecv = quantityShipRecv;
    }

    public SearchColumnDoubleField getQuantityShipRecv(int i) {
        return this.quantityShipRecv[i];
    }

    public void setQuantityShipRecv(int i, SearchColumnDoubleField _value) {
        this.quantityShipRecv[i] = _value;
    }

    public SearchColumnDoubleField[] getQuantityUom() {
        return this.quantityUom;
    }

    public void setQuantityUom(SearchColumnDoubleField[] quantityUom) {
        this.quantityUom = quantityUom;
    }

    public SearchColumnDoubleField getQuantityUom(int i) {
        return this.quantityUom[i];
    }

    public void setQuantityUom(int i, SearchColumnDoubleField _value) {
        this.quantityUom[i] = _value;
    }

    public SearchColumnDoubleField[] getRate() {
        return this.rate;
    }

    public void setRate(SearchColumnDoubleField[] rate) {
        this.rate = rate;
    }

    public SearchColumnDoubleField getRate(int i) {
        return this.rate[i];
    }

    public void setRate(int i, SearchColumnDoubleField _value) {
        this.rate[i] = _value;
    }

    public SearchColumnStringField[] getRealizedGainPostingTransaction() {
        return this.realizedGainPostingTransaction;
    }

    public void setRealizedGainPostingTransaction(SearchColumnStringField[] realizedGainPostingTransaction) {
        this.realizedGainPostingTransaction = realizedGainPostingTransaction;
    }

    public SearchColumnStringField getRealizedGainPostingTransaction(int i) {
        return this.realizedGainPostingTransaction[i];
    }

    public void setRealizedGainPostingTransaction(int i, SearchColumnStringField _value) {
        this.realizedGainPostingTransaction[i] = _value;
    }

    public SearchColumnDoubleField[] getRecognizedRevenue() {
        return this.recognizedRevenue;
    }

    public void setRecognizedRevenue(SearchColumnDoubleField[] recognizedRevenue) {
        this.recognizedRevenue = recognizedRevenue;
    }

    public SearchColumnDoubleField getRecognizedRevenue(int i) {
        return this.recognizedRevenue[i];
    }

    public void setRecognizedRevenue(int i, SearchColumnDoubleField _value) {
        this.recognizedRevenue[i] = _value;
    }

    public SearchColumnStringField[] getRecordType() {
        return this.recordType;
    }

    public void setRecordType(SearchColumnStringField[] recordType) {
        this.recordType = recordType;
    }

    public SearchColumnStringField getRecordType(int i) {
        return this.recordType[i];
    }

    public void setRecordType(int i, SearchColumnStringField _value) {
        this.recordType[i] = _value;
    }

    public SearchColumnDoubleField[] getRecurAnnuallyTotal() {
        return this.recurAnnuallyTotal;
    }

    public void setRecurAnnuallyTotal(SearchColumnDoubleField[] recurAnnuallyTotal) {
        this.recurAnnuallyTotal = recurAnnuallyTotal;
    }

    public SearchColumnDoubleField getRecurAnnuallyTotal(int i) {
        return this.recurAnnuallyTotal[i];
    }

    public void setRecurAnnuallyTotal(int i, SearchColumnDoubleField _value) {
        this.recurAnnuallyTotal[i] = _value;
    }

    public SearchColumnDoubleField[] getRecurMonthlyTotal() {
        return this.recurMonthlyTotal;
    }

    public void setRecurMonthlyTotal(SearchColumnDoubleField[] recurMonthlyTotal) {
        this.recurMonthlyTotal = recurMonthlyTotal;
    }

    public SearchColumnDoubleField getRecurMonthlyTotal(int i) {
        return this.recurMonthlyTotal[i];
    }

    public void setRecurMonthlyTotal(int i, SearchColumnDoubleField _value) {
        this.recurMonthlyTotal[i] = _value;
    }

    public SearchColumnDoubleField[] getRecurQuarterlyTotal() {
        return this.recurQuarterlyTotal;
    }

    public void setRecurQuarterlyTotal(SearchColumnDoubleField[] recurQuarterlyTotal) {
        this.recurQuarterlyTotal = recurQuarterlyTotal;
    }

    public SearchColumnDoubleField getRecurQuarterlyTotal(int i) {
        return this.recurQuarterlyTotal[i];
    }

    public void setRecurQuarterlyTotal(int i, SearchColumnDoubleField _value) {
        this.recurQuarterlyTotal[i] = _value;
    }

    public SearchColumnBooleanField[] getRecurringBill() {
        return this.recurringBill;
    }

    public void setRecurringBill(SearchColumnBooleanField[] recurringBill) {
        this.recurringBill = recurringBill;
    }

    public SearchColumnBooleanField getRecurringBill(int i) {
        return this.recurringBill[i];
    }

    public void setRecurringBill(int i, SearchColumnBooleanField _value) {
        this.recurringBill[i] = _value;
    }

    public SearchColumnDoubleField[] getRecurWeeklyTotal() {
        return this.recurWeeklyTotal;
    }

    public void setRecurWeeklyTotal(SearchColumnDoubleField[] recurWeeklyTotal) {
        this.recurWeeklyTotal = recurWeeklyTotal;
    }

    public SearchColumnDoubleField getRecurWeeklyTotal(int i) {
        return this.recurWeeklyTotal[i];
    }

    public void setRecurWeeklyTotal(int i, SearchColumnDoubleField _value) {
        this.recurWeeklyTotal[i] = _value;
    }

    public SearchColumnLongField[] getRefNumber() {
        return this.refNumber;
    }

    public void setRefNumber(SearchColumnLongField[] refNumber) {
        this.refNumber = refNumber;
    }

    public SearchColumnLongField getRefNumber(int i) {
        return this.refNumber[i];
    }

    public void setRefNumber(int i, SearchColumnLongField _value) {
        this.refNumber[i] = _value;
    }

    public SearchColumnDateField[] getRequestedDate() {
        return this.requestedDate;
    }

    public void setRequestedDate(SearchColumnDateField[] requestedDate) {
        this.requestedDate = requestedDate;
    }

    public SearchColumnDateField getRequestedDate(int i) {
        return this.requestedDate[i];
    }

    public void setRequestedDate(int i, SearchColumnDateField _value) {
        this.requestedDate[i] = _value;
    }

    public SearchColumnDoubleField[] getRequiredDepositAmount() {
        return this.requiredDepositAmount;
    }

    public void setRequiredDepositAmount(SearchColumnDoubleField[] requiredDepositAmount) {
        this.requiredDepositAmount = requiredDepositAmount;
    }

    public SearchColumnDoubleField getRequiredDepositAmount(int i) {
        return this.requiredDepositAmount[i];
    }

    public void setRequiredDepositAmount(int i, SearchColumnDoubleField _value) {
        this.requiredDepositAmount[i] = _value;
    }

    public SearchColumnDoubleField[] getRequiredDepositDue() {
        return this.requiredDepositDue;
    }

    public void setRequiredDepositDue(SearchColumnDoubleField[] requiredDepositDue) {
        this.requiredDepositDue = requiredDepositDue;
    }

    public SearchColumnDoubleField getRequiredDepositDue(int i) {
        return this.requiredDepositDue[i];
    }

    public void setRequiredDepositDue(int i, SearchColumnDoubleField _value) {
        this.requiredDepositDue[i] = _value;
    }

    public SearchColumnDoubleField[] getRequiredDepositPercentage() {
        return this.requiredDepositPercentage;
    }

    public void setRequiredDepositPercentage(SearchColumnDoubleField[] requiredDepositPercentage) {
        this.requiredDepositPercentage = requiredDepositPercentage;
    }

    public SearchColumnDoubleField getRequiredDepositPercentage(int i) {
        return this.requiredDepositPercentage[i];
    }

    public void setRequiredDepositPercentage(int i, SearchColumnDoubleField _value) {
        this.requiredDepositPercentage[i] = _value;
    }

    public SearchColumnEnumSelectField[] getRevCommitStatus() {
        return this.revCommitStatus;
    }

    public void setRevCommitStatus(SearchColumnEnumSelectField[] revCommitStatus) {
        this.revCommitStatus = revCommitStatus;
    }

    public SearchColumnEnumSelectField getRevCommitStatus(int i) {
        return this.revCommitStatus[i];
    }

    public void setRevCommitStatus(int i, SearchColumnEnumSelectField _value) {
        this.revCommitStatus[i] = _value;
    }

    public SearchColumnSelectField[] getRevCommittingTransaction() {
        return this.revCommittingTransaction;
    }

    public void setRevCommittingTransaction(SearchColumnSelectField[] revCommittingTransaction) {
        this.revCommittingTransaction = revCommittingTransaction;
    }

    public SearchColumnSelectField getRevCommittingTransaction(int i) {
        return this.revCommittingTransaction[i];
    }

    public void setRevCommittingTransaction(int i, SearchColumnSelectField _value) {
        this.revCommittingTransaction[i] = _value;
    }

    public SearchColumnEnumSelectField[] getRevenueStatus() {
        return this.revenueStatus;
    }

    public void setRevenueStatus(SearchColumnEnumSelectField[] revenueStatus) {
        this.revenueStatus = revenueStatus;
    }

    public SearchColumnEnumSelectField getRevenueStatus(int i) {
        return this.revenueStatus[i];
    }

    public void setRevenueStatus(int i, SearchColumnEnumSelectField _value) {
        this.revenueStatus[i] = _value;
    }

    public SearchColumnDateField[] getReversalDate() {
        return this.reversalDate;
    }

    public void setReversalDate(SearchColumnDateField[] reversalDate) {
        this.reversalDate = reversalDate;
    }

    public SearchColumnDateField getReversalDate(int i) {
        return this.reversalDate[i];
    }

    public void setReversalDate(int i, SearchColumnDateField _value) {
        this.reversalDate[i] = _value;
    }

    public SearchColumnStringField[] getReversalNumber() {
        return this.reversalNumber;
    }

    public void setReversalNumber(SearchColumnStringField[] reversalNumber) {
        this.reversalNumber = reversalNumber;
    }

    public SearchColumnStringField getReversalNumber(int i) {
        return this.reversalNumber[i];
    }

    public void setReversalNumber(int i, SearchColumnStringField _value) {
        this.reversalNumber[i] = _value;
    }

    public SearchColumnDateField[] getRevRecEndDate() {
        return this.revRecEndDate;
    }

    public void setRevRecEndDate(SearchColumnDateField[] revRecEndDate) {
        this.revRecEndDate = revRecEndDate;
    }

    public SearchColumnDateField getRevRecEndDate(int i) {
        return this.revRecEndDate[i];
    }

    public void setRevRecEndDate(int i, SearchColumnDateField _value) {
        this.revRecEndDate[i] = _value;
    }

    public SearchColumnBooleanField[] getRevRecOnRevCommitment() {
        return this.revRecOnRevCommitment;
    }

    public void setRevRecOnRevCommitment(SearchColumnBooleanField[] revRecOnRevCommitment) {
        this.revRecOnRevCommitment = revRecOnRevCommitment;
    }

    public SearchColumnBooleanField getRevRecOnRevCommitment(int i) {
        return this.revRecOnRevCommitment[i];
    }

    public void setRevRecOnRevCommitment(int i, SearchColumnBooleanField _value) {
        this.revRecOnRevCommitment[i] = _value;
    }

    public SearchColumnDateField[] getRevRecStartDate() {
        return this.revRecStartDate;
    }

    public void setRevRecStartDate(SearchColumnDateField[] revRecStartDate) {
        this.revRecStartDate = revRecStartDate;
    }

    public SearchColumnDateField getRevRecStartDate(int i) {
        return this.revRecStartDate[i];
    }

    public void setRevRecStartDate(int i, SearchColumnDateField _value) {
        this.revRecStartDate[i] = _value;
    }

    public SearchColumnSelectField[] getRgAccount() {
        return this.rgAccount;
    }

    public void setRgAccount(SearchColumnSelectField[] rgAccount) {
        this.rgAccount = rgAccount;
    }

    public SearchColumnSelectField getRgAccount(int i) {
        return this.rgAccount[i];
    }

    public void setRgAccount(int i, SearchColumnSelectField _value) {
        this.rgAccount[i] = _value;
    }

    public SearchColumnDoubleField[] getRgAmount() {
        return this.rgAmount;
    }

    public void setRgAmount(SearchColumnDoubleField[] rgAmount) {
        this.rgAmount = rgAmount;
    }

    public SearchColumnDoubleField getRgAmount(int i) {
        return this.rgAmount[i];
    }

    public void setRgAmount(int i, SearchColumnDoubleField _value) {
        this.rgAmount[i] = _value;
    }

    public SearchColumnDateField[] getSalesEffectiveDate() {
        return this.salesEffectiveDate;
    }

    public void setSalesEffectiveDate(SearchColumnDateField[] salesEffectiveDate) {
        this.salesEffectiveDate = salesEffectiveDate;
    }

    public SearchColumnDateField getSalesEffectiveDate(int i) {
        return this.salesEffectiveDate[i];
    }

    public void setSalesEffectiveDate(int i, SearchColumnDateField _value) {
        this.salesEffectiveDate[i] = _value;
    }

    public SearchColumnSelectField[] getSalesOrder() {
        return this.salesOrder;
    }

    public void setSalesOrder(SearchColumnSelectField[] salesOrder) {
        this.salesOrder = salesOrder;
    }

    public SearchColumnSelectField getSalesOrder(int i) {
        return this.salesOrder[i];
    }

    public void setSalesOrder(int i, SearchColumnSelectField _value) {
        this.salesOrder[i] = _value;
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

    public SearchColumnEnumSelectField[] getSchedulingMethod() {
        return this.schedulingMethod;
    }

    public void setSchedulingMethod(SearchColumnEnumSelectField[] schedulingMethod) {
        this.schedulingMethod = schedulingMethod;
    }

    public SearchColumnEnumSelectField getSchedulingMethod(int i) {
        return this.schedulingMethod[i];
    }

    public void setSchedulingMethod(int i, SearchColumnEnumSelectField _value) {
        this.schedulingMethod[i] = _value;
    }

    public SearchColumnStringField[] getSerialNumber() {
        return this.serialNumber;
    }

    public void setSerialNumber(SearchColumnStringField[] serialNumber) {
        this.serialNumber = serialNumber;
    }

    public SearchColumnStringField getSerialNumber(int i) {
        return this.serialNumber[i];
    }

    public void setSerialNumber(int i, SearchColumnStringField _value) {
        this.serialNumber[i] = _value;
    }

    public SearchColumnDoubleField[] getSerialNumberCost() {
        return this.serialNumberCost;
    }

    public void setSerialNumberCost(SearchColumnDoubleField[] serialNumberCost) {
        this.serialNumberCost = serialNumberCost;
    }

    public SearchColumnDoubleField getSerialNumberCost(int i) {
        return this.serialNumberCost[i];
    }

    public void setSerialNumberCost(int i, SearchColumnDoubleField _value) {
        this.serialNumberCost[i] = _value;
    }

    public SearchColumnDoubleField[] getSerialNumberCostAdjustment() {
        return this.serialNumberCostAdjustment;
    }

    public void setSerialNumberCostAdjustment(SearchColumnDoubleField[] serialNumberCostAdjustment) {
        this.serialNumberCostAdjustment = serialNumberCostAdjustment;
    }

    public SearchColumnDoubleField getSerialNumberCostAdjustment(int i) {
        return this.serialNumberCostAdjustment[i];
    }

    public void setSerialNumberCostAdjustment(int i, SearchColumnDoubleField _value) {
        this.serialNumberCostAdjustment[i] = _value;
    }

    public SearchColumnDoubleField[] getSerialNumberQuantity() {
        return this.serialNumberQuantity;
    }

    public void setSerialNumberQuantity(SearchColumnDoubleField[] serialNumberQuantity) {
        this.serialNumberQuantity = serialNumberQuantity;
    }

    public SearchColumnDoubleField getSerialNumberQuantity(int i) {
        return this.serialNumberQuantity[i];
    }

    public void setSerialNumberQuantity(int i, SearchColumnDoubleField _value) {
        this.serialNumberQuantity[i] = _value;
    }

    public SearchColumnStringField[] getSerialNumbers() {
        return this.serialNumbers;
    }

    public void setSerialNumbers(SearchColumnStringField[] serialNumbers) {
        this.serialNumbers = serialNumbers;
    }

    public SearchColumnStringField getSerialNumbers(int i) {
        return this.serialNumbers[i];
    }

    public void setSerialNumbers(int i, SearchColumnStringField _value) {
        this.serialNumbers[i] = _value;
    }

    public SearchColumnStringField[] getShipAddress() {
        return this.shipAddress;
    }

    public void setShipAddress(SearchColumnStringField[] shipAddress) {
        this.shipAddress = shipAddress;
    }

    public SearchColumnStringField getShipAddress(int i) {
        return this.shipAddress[i];
    }

    public void setShipAddress(int i, SearchColumnStringField _value) {
        this.shipAddress[i] = _value;
    }

    public SearchColumnStringField[] getShipAddress1() {
        return this.shipAddress1;
    }

    public void setShipAddress1(SearchColumnStringField[] shipAddress1) {
        this.shipAddress1 = shipAddress1;
    }

    public SearchColumnStringField getShipAddress1(int i) {
        return this.shipAddress1[i];
    }

    public void setShipAddress1(int i, SearchColumnStringField _value) {
        this.shipAddress1[i] = _value;
    }

    public SearchColumnStringField[] getShipAddress2() {
        return this.shipAddress2;
    }

    public void setShipAddress2(SearchColumnStringField[] shipAddress2) {
        this.shipAddress2 = shipAddress2;
    }

    public SearchColumnStringField getShipAddress2(int i) {
        return this.shipAddress2[i];
    }

    public void setShipAddress2(int i, SearchColumnStringField _value) {
        this.shipAddress2[i] = _value;
    }

    public SearchColumnStringField[] getShipAddress3() {
        return this.shipAddress3;
    }

    public void setShipAddress3(SearchColumnStringField[] shipAddress3) {
        this.shipAddress3 = shipAddress3;
    }

    public SearchColumnStringField getShipAddress3(int i) {
        return this.shipAddress3[i];
    }

    public void setShipAddress3(int i, SearchColumnStringField _value) {
        this.shipAddress3[i] = _value;
    }

    public SearchColumnStringField[] getShipAddressee() {
        return this.shipAddressee;
    }

    public void setShipAddressee(SearchColumnStringField[] shipAddressee) {
        this.shipAddressee = shipAddressee;
    }

    public SearchColumnStringField getShipAddressee(int i) {
        return this.shipAddressee[i];
    }

    public void setShipAddressee(int i, SearchColumnStringField _value) {
        this.shipAddressee[i] = _value;
    }

    public SearchColumnStringField[] getShipAttention() {
        return this.shipAttention;
    }

    public void setShipAttention(SearchColumnStringField[] shipAttention) {
        this.shipAttention = shipAttention;
    }

    public SearchColumnStringField getShipAttention(int i) {
        return this.shipAttention[i];
    }

    public void setShipAttention(int i, SearchColumnStringField _value) {
        this.shipAttention[i] = _value;
    }

    public SearchColumnEnumSelectField[] getShipCarrier() {
        return this.shipCarrier;
    }

    public void setShipCarrier(SearchColumnEnumSelectField[] shipCarrier) {
        this.shipCarrier = shipCarrier;
    }

    public SearchColumnEnumSelectField getShipCarrier(int i) {
        return this.shipCarrier[i];
    }

    public void setShipCarrier(int i, SearchColumnEnumSelectField _value) {
        this.shipCarrier[i] = _value;
    }

    public SearchColumnStringField[] getShipCity() {
        return this.shipCity;
    }

    public void setShipCity(SearchColumnStringField[] shipCity) {
        this.shipCity = shipCity;
    }

    public SearchColumnStringField getShipCity(int i) {
        return this.shipCity[i];
    }

    public void setShipCity(int i, SearchColumnStringField _value) {
        this.shipCity[i] = _value;
    }

    public SearchColumnBooleanField[] getShipComplete() {
        return this.shipComplete;
    }

    public void setShipComplete(SearchColumnBooleanField[] shipComplete) {
        this.shipComplete = shipComplete;
    }

    public SearchColumnBooleanField getShipComplete(int i) {
        return this.shipComplete[i];
    }

    public void setShipComplete(int i, SearchColumnBooleanField _value) {
        this.shipComplete[i] = _value;
    }

    public SearchColumnEnumSelectField[] getShipCountry() {
        return this.shipCountry;
    }

    public void setShipCountry(SearchColumnEnumSelectField[] shipCountry) {
        this.shipCountry = shipCountry;
    }

    public SearchColumnEnumSelectField getShipCountry(int i) {
        return this.shipCountry[i];
    }

    public void setShipCountry(int i, SearchColumnEnumSelectField _value) {
        this.shipCountry[i] = _value;
    }

    public SearchColumnStringField[] getShipCountryCode() {
        return this.shipCountryCode;
    }

    public void setShipCountryCode(SearchColumnStringField[] shipCountryCode) {
        this.shipCountryCode = shipCountryCode;
    }

    public SearchColumnStringField getShipCountryCode(int i) {
        return this.shipCountryCode[i];
    }

    public void setShipCountryCode(int i, SearchColumnStringField _value) {
        this.shipCountryCode[i] = _value;
    }

    public SearchColumnDateField[] getShipDate() {
        return this.shipDate;
    }

    public void setShipDate(SearchColumnDateField[] shipDate) {
        this.shipDate = shipDate;
    }

    public SearchColumnDateField getShipDate(int i) {
        return this.shipDate[i];
    }

    public void setShipDate(int i, SearchColumnDateField _value) {
        this.shipDate[i] = _value;
    }

    public SearchColumnLongField[] getShipGroup() {
        return this.shipGroup;
    }

    public void setShipGroup(SearchColumnLongField[] shipGroup) {
        this.shipGroup = shipGroup;
    }

    public SearchColumnLongField getShipGroup(int i) {
        return this.shipGroup[i];
    }

    public void setShipGroup(int i, SearchColumnLongField _value) {
        this.shipGroup[i] = _value;
    }

    public SearchColumnSelectField[] getShipMethod() {
        return this.shipMethod;
    }

    public void setShipMethod(SearchColumnSelectField[] shipMethod) {
        this.shipMethod = shipMethod;
    }

    public SearchColumnSelectField getShipMethod(int i) {
        return this.shipMethod[i];
    }

    public void setShipMethod(int i, SearchColumnSelectField _value) {
        this.shipMethod[i] = _value;
    }

    public SearchColumnStringField[] getShipPhone() {
        return this.shipPhone;
    }

    public void setShipPhone(SearchColumnStringField[] shipPhone) {
        this.shipPhone = shipPhone;
    }

    public SearchColumnStringField getShipPhone(int i) {
        return this.shipPhone[i];
    }

    public void setShipPhone(int i, SearchColumnStringField _value) {
        this.shipPhone[i] = _value;
    }

    public SearchColumnDoubleField[] getShippingAmount() {
        return this.shippingAmount;
    }

    public void setShippingAmount(SearchColumnDoubleField[] shippingAmount) {
        this.shippingAmount = shippingAmount;
    }

    public SearchColumnDoubleField getShippingAmount(int i) {
        return this.shippingAmount[i];
    }

    public void setShippingAmount(int i, SearchColumnDoubleField _value) {
        this.shippingAmount[i] = _value;
    }

    public SearchColumnBooleanField[] getShipRecvStatusLine() {
        return this.shipRecvStatusLine;
    }

    public void setShipRecvStatusLine(SearchColumnBooleanField[] shipRecvStatusLine) {
        this.shipRecvStatusLine = shipRecvStatusLine;
    }

    public SearchColumnBooleanField getShipRecvStatusLine(int i) {
        return this.shipRecvStatusLine[i];
    }

    public void setShipRecvStatusLine(int i, SearchColumnBooleanField _value) {
        this.shipRecvStatusLine[i] = _value;
    }

    public SearchColumnStringField[] getShipState() {
        return this.shipState;
    }

    public void setShipState(SearchColumnStringField[] shipState) {
        this.shipState = shipState;
    }

    public SearchColumnStringField getShipState(int i) {
        return this.shipState[i];
    }

    public void setShipState(int i, SearchColumnStringField _value) {
        this.shipState[i] = _value;
    }

    public SearchColumnSelectField[] getShipTo() {
        return this.shipTo;
    }

    public void setShipTo(SearchColumnSelectField[] shipTo) {
        this.shipTo = shipTo;
    }

    public SearchColumnSelectField getShipTo(int i) {
        return this.shipTo[i];
    }

    public void setShipTo(int i, SearchColumnSelectField _value) {
        this.shipTo[i] = _value;
    }

    public SearchColumnStringField[] getShipZip() {
        return this.shipZip;
    }

    public void setShipZip(SearchColumnStringField[] shipZip) {
        this.shipZip = shipZip;
    }

    public SearchColumnStringField getShipZip(int i) {
        return this.shipZip[i];
    }

    public void setShipZip(int i, SearchColumnStringField _value) {
        this.shipZip[i] = _value;
    }

    public SearchColumnDoubleField[] getSignedAmount() {
        return this.signedAmount;
    }

    public void setSignedAmount(SearchColumnDoubleField[] signedAmount) {
        this.signedAmount = signedAmount;
    }

    public SearchColumnDoubleField getSignedAmount(int i) {
        return this.signedAmount[i];
    }

    public void setSignedAmount(int i, SearchColumnDoubleField _value) {
        this.signedAmount[i] = _value;
    }

    public SearchColumnStringField[] getSource() {
        return this.source;
    }

    public void setSource(SearchColumnStringField[] source) {
        this.source = source;
    }

    public SearchColumnStringField getSource(int i) {
        return this.source[i];
    }

    public void setSource(int i, SearchColumnStringField _value) {
        this.source[i] = _value;
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

    public SearchColumnSelectField[] getSubscriptionLine() {
        return this.subscriptionLine;
    }

    public void setSubscriptionLine(SearchColumnSelectField[] subscriptionLine) {
        this.subscriptionLine = subscriptionLine;
    }

    public SearchColumnSelectField getSubscriptionLine(int i) {
        return this.subscriptionLine[i];
    }

    public void setSubscriptionLine(int i, SearchColumnSelectField _value) {
        this.subscriptionLine[i] = _value;
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

    public SearchColumnStringField[] getSubsidiaryTaxRegNum() {
        return this.subsidiaryTaxRegNum;
    }

    public void setSubsidiaryTaxRegNum(SearchColumnStringField[] subsidiaryTaxRegNum) {
        this.subsidiaryTaxRegNum = subsidiaryTaxRegNum;
    }

    public SearchColumnStringField getSubsidiaryTaxRegNum(int i) {
        return this.subsidiaryTaxRegNum[i];
    }

    public void setSubsidiaryTaxRegNum(int i, SearchColumnStringField _value) {
        this.subsidiaryTaxRegNum[i] = _value;
    }

    public SearchColumnDoubleField[] getTaxAmount() {
        return this.taxAmount;
    }

    public void setTaxAmount(SearchColumnDoubleField[] taxAmount) {
        this.taxAmount = taxAmount;
    }

    public SearchColumnDoubleField getTaxAmount(int i) {
        return this.taxAmount[i];
    }

    public void setTaxAmount(int i, SearchColumnDoubleField _value) {
        this.taxAmount[i] = _value;
    }

    public SearchColumnSelectField[] getTaxCode() {
        return this.taxCode;
    }

    public void setTaxCode(SearchColumnSelectField[] taxCode) {
        this.taxCode = taxCode;
    }

    public SearchColumnSelectField getTaxCode(int i) {
        return this.taxCode[i];
    }

    public void setTaxCode(int i, SearchColumnSelectField _value) {
        this.taxCode[i] = _value;
    }

    public SearchColumnBooleanField[] getTaxLine() {
        return this.taxLine;
    }

    public void setTaxLine(SearchColumnBooleanField[] taxLine) {
        this.taxLine = taxLine;
    }

    public SearchColumnBooleanField getTaxLine(int i) {
        return this.taxLine[i];
    }

    public void setTaxLine(int i, SearchColumnBooleanField _value) {
        this.taxLine[i] = _value;
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

    public SearchColumnDateField[] getTaxPointDate() {
        return this.taxPointDate;
    }

    public void setTaxPointDate(SearchColumnDateField[] taxPointDate) {
        this.taxPointDate = taxPointDate;
    }

    public SearchColumnDateField getTaxPointDate(int i) {
        return this.taxPointDate[i];
    }

    public void setTaxPointDate(int i, SearchColumnDateField _value) {
        this.taxPointDate[i] = _value;
    }

    public SearchColumnDoubleField[] getTaxTotal() {
        return this.taxTotal;
    }

    public void setTaxTotal(SearchColumnDoubleField[] taxTotal) {
        this.taxTotal = taxTotal;
    }

    public SearchColumnDoubleField getTaxTotal(int i) {
        return this.taxTotal[i];
    }

    public void setTaxTotal(int i, SearchColumnDoubleField _value) {
        this.taxTotal[i] = _value;
    }

    public SearchColumnLongField[] getTermInMonths() {
        return this.termInMonths;
    }

    public void setTermInMonths(SearchColumnLongField[] termInMonths) {
        this.termInMonths = termInMonths;
    }

    public SearchColumnLongField getTermInMonths(int i) {
        return this.termInMonths[i];
    }

    public void setTermInMonths(int i, SearchColumnLongField _value) {
        this.termInMonths[i] = _value;
    }

    public SearchColumnSelectField[] getTerms() {
        return this.terms;
    }

    public void setTerms(SearchColumnSelectField[] terms) {
        this.terms = terms;
    }

    public SearchColumnSelectField getTerms(int i) {
        return this.terms[i];
    }

    public void setTerms(int i, SearchColumnSelectField _value) {
        this.terms[i] = _value;
    }

    public SearchColumnStringField[] getTermsOfSale() {
        return this.termsOfSale;
    }

    public void setTermsOfSale(SearchColumnStringField[] termsOfSale) {
        this.termsOfSale = termsOfSale;
    }

    public SearchColumnStringField getTermsOfSale(int i) {
        return this.termsOfSale[i];
    }

    public void setTermsOfSale(int i, SearchColumnStringField _value) {
        this.termsOfSale[i] = _value;
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

    public SearchColumnBooleanField[] getToBeEmailed() {
        return this.toBeEmailed;
    }

    public void setToBeEmailed(SearchColumnBooleanField[] toBeEmailed) {
        this.toBeEmailed = toBeEmailed;
    }

    public SearchColumnBooleanField getToBeEmailed(int i) {
        return this.toBeEmailed[i];
    }

    public void setToBeEmailed(int i, SearchColumnBooleanField _value) {
        this.toBeEmailed[i] = _value;
    }

    public SearchColumnBooleanField[] getToBePrinted() {
        return this.toBePrinted;
    }

    public void setToBePrinted(SearchColumnBooleanField[] toBePrinted) {
        this.toBePrinted = toBePrinted;
    }

    public SearchColumnBooleanField getToBePrinted(int i) {
        return this.toBePrinted[i];
    }

    public void setToBePrinted(int i, SearchColumnBooleanField _value) {
        this.toBePrinted[i] = _value;
    }

    public SearchColumnSelectField[] getToSubsidiary() {
        return this.toSubsidiary;
    }

    public void setToSubsidiary(SearchColumnSelectField[] toSubsidiary) {
        this.toSubsidiary = toSubsidiary;
    }

    public SearchColumnSelectField getToSubsidiary(int i) {
        return this.toSubsidiary[i];
    }

    public void setToSubsidiary(int i, SearchColumnSelectField _value) {
        this.toSubsidiary[i] = _value;
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

    public SearchColumnDoubleField[] getTotalCostEstimate() {
        return this.totalCostEstimate;
    }

    public void setTotalCostEstimate(SearchColumnDoubleField[] totalCostEstimate) {
        this.totalCostEstimate = totalCostEstimate;
    }

    public SearchColumnDoubleField getTotalCostEstimate(int i) {
        return this.totalCostEstimate[i];
    }

    public void setTotalCostEstimate(int i, SearchColumnDoubleField _value) {
        this.totalCostEstimate[i] = _value;
    }

    public SearchColumnStringField[] getTrackingNumbers() {
        return this.trackingNumbers;
    }

    public void setTrackingNumbers(SearchColumnStringField[] trackingNumbers) {
        this.trackingNumbers = trackingNumbers;
    }

    public SearchColumnStringField getTrackingNumbers(int i) {
        return this.trackingNumbers[i];
    }

    public void setTrackingNumbers(int i, SearchColumnStringField _value) {
        this.trackingNumbers[i] = _value;
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

    public SearchColumnBooleanField[] getTranIsVsoeBundle() {
        return this.tranIsVsoeBundle;
    }

    public void setTranIsVsoeBundle(SearchColumnBooleanField[] tranIsVsoeBundle) {
        this.tranIsVsoeBundle = tranIsVsoeBundle;
    }

    public SearchColumnBooleanField getTranIsVsoeBundle(int i) {
        return this.tranIsVsoeBundle[i];
    }

    public void setTranIsVsoeBundle(int i, SearchColumnBooleanField _value) {
        this.tranIsVsoeBundle[i] = _value;
    }

    public SearchColumnBooleanField[] getTransactionDiscount() {
        return this.transactionDiscount;
    }

    public void setTransactionDiscount(SearchColumnBooleanField[] transactionDiscount) {
        this.transactionDiscount = transactionDiscount;
    }

    public SearchColumnBooleanField getTransactionDiscount(int i) {
        return this.transactionDiscount[i];
    }

    public void setTransactionDiscount(int i, SearchColumnBooleanField _value) {
        this.transactionDiscount[i] = _value;
    }

    public SearchColumnEnumSelectField[] getTransactionLineType() {
        return this.transactionLineType;
    }

    public void setTransactionLineType(SearchColumnEnumSelectField[] transactionLineType) {
        this.transactionLineType = transactionLineType;
    }

    public SearchColumnEnumSelectField getTransactionLineType(int i) {
        return this.transactionLineType[i];
    }

    public void setTransactionLineType(int i, SearchColumnEnumSelectField _value) {
        this.transactionLineType[i] = _value;
    }

    public SearchColumnStringField[] getTransactionNumber() {
        return this.transactionNumber;
    }

    public void setTransactionNumber(SearchColumnStringField[] transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    public SearchColumnStringField getTransactionNumber(int i) {
        return this.transactionNumber[i];
    }

    public void setTransactionNumber(int i, SearchColumnStringField _value) {
        this.transactionNumber[i] = _value;
    }

    public SearchColumnSelectField[] getTransferLocation() {
        return this.transferLocation;
    }

    public void setTransferLocation(SearchColumnSelectField[] transferLocation) {
        this.transferLocation = transferLocation;
    }

    public SearchColumnSelectField getTransferLocation(int i) {
        return this.transferLocation[i];
    }

    public void setTransferLocation(int i, SearchColumnSelectField _value) {
        this.transferLocation[i] = _value;
    }

    public SearchColumnStringField[] getTransferOrderItemLine() {
        return this.transferOrderItemLine;
    }

    public void setTransferOrderItemLine(SearchColumnStringField[] transferOrderItemLine) {
        this.transferOrderItemLine = transferOrderItemLine;
    }

    public SearchColumnStringField getTransferOrderItemLine(int i) {
        return this.transferOrderItemLine[i];
    }

    public void setTransferOrderItemLine(int i, SearchColumnStringField _value) {
        this.transferOrderItemLine[i] = _value;
    }

    public SearchColumnDoubleField[] getTransferOrderQuantityCommitted() {
        return this.transferOrderQuantityCommitted;
    }

    public void setTransferOrderQuantityCommitted(SearchColumnDoubleField[] transferOrderQuantityCommitted) {
        this.transferOrderQuantityCommitted = transferOrderQuantityCommitted;
    }

    public SearchColumnDoubleField getTransferOrderQuantityCommitted(int i) {
        return this.transferOrderQuantityCommitted[i];
    }

    public void setTransferOrderQuantityCommitted(int i, SearchColumnDoubleField _value) {
        this.transferOrderQuantityCommitted[i] = _value;
    }

    public SearchColumnDoubleField[] getTransferOrderQuantityPacked() {
        return this.transferOrderQuantityPacked;
    }

    public void setTransferOrderQuantityPacked(SearchColumnDoubleField[] transferOrderQuantityPacked) {
        this.transferOrderQuantityPacked = transferOrderQuantityPacked;
    }

    public SearchColumnDoubleField getTransferOrderQuantityPacked(int i) {
        return this.transferOrderQuantityPacked[i];
    }

    public void setTransferOrderQuantityPacked(int i, SearchColumnDoubleField _value) {
        this.transferOrderQuantityPacked[i] = _value;
    }

    public SearchColumnDoubleField[] getTransferOrderQuantityPicked() {
        return this.transferOrderQuantityPicked;
    }

    public void setTransferOrderQuantityPicked(SearchColumnDoubleField[] transferOrderQuantityPicked) {
        this.transferOrderQuantityPicked = transferOrderQuantityPicked;
    }

    public SearchColumnDoubleField getTransferOrderQuantityPicked(int i) {
        return this.transferOrderQuantityPicked[i];
    }

    public void setTransferOrderQuantityPicked(int i, SearchColumnDoubleField _value) {
        this.transferOrderQuantityPicked[i] = _value;
    }

    public SearchColumnDoubleField[] getTransferOrderQuantityReceived() {
        return this.transferOrderQuantityReceived;
    }

    public void setTransferOrderQuantityReceived(SearchColumnDoubleField[] transferOrderQuantityReceived) {
        this.transferOrderQuantityReceived = transferOrderQuantityReceived;
    }

    public SearchColumnDoubleField getTransferOrderQuantityReceived(int i) {
        return this.transferOrderQuantityReceived[i];
    }

    public void setTransferOrderQuantityReceived(int i, SearchColumnDoubleField _value) {
        this.transferOrderQuantityReceived[i] = _value;
    }

    public SearchColumnDoubleField[] getTransferOrderQuantityShipped() {
        return this.transferOrderQuantityShipped;
    }

    public void setTransferOrderQuantityShipped(SearchColumnDoubleField[] transferOrderQuantityShipped) {
        this.transferOrderQuantityShipped = transferOrderQuantityShipped;
    }

    public SearchColumnDoubleField getTransferOrderQuantityShipped(int i) {
        return this.transferOrderQuantityShipped[i];
    }

    public void setTransferOrderQuantityShipped(int i, SearchColumnDoubleField _value) {
        this.transferOrderQuantityShipped[i] = _value;
    }

    public SearchColumnEnumSelectField[] getType() {
        return this.type;
    }

    public void setType(SearchColumnEnumSelectField[] type) {
        this.type = type;
    }

    public SearchColumnEnumSelectField getType(int i) {
        return this.type[i];
    }

    public void setType(int i, SearchColumnEnumSelectField _value) {
        this.type[i] = _value;
    }

    public SearchColumnStringField[] getUnit() {
        return this.unit;
    }

    public void setUnit(SearchColumnStringField[] unit) {
        this.unit = unit;
    }

    public SearchColumnStringField getUnit(int i) {
        return this.unit[i];
    }

    public void setUnit(int i, SearchColumnStringField _value) {
        this.unit[i] = _value;
    }

    public SearchColumnDoubleField[] getUnitCostOverride() {
        return this.unitCostOverride;
    }

    public void setUnitCostOverride(SearchColumnDoubleField[] unitCostOverride) {
        this.unitCostOverride = unitCostOverride;
    }

    public SearchColumnDoubleField getUnitCostOverride(int i) {
        return this.unitCostOverride[i];
    }

    public void setUnitCostOverride(int i, SearchColumnDoubleField _value) {
        this.unitCostOverride[i] = _value;
    }

    public SearchColumnSelectField[] getVendType() {
        return this.vendType;
    }

    public void setVendType(SearchColumnSelectField[] vendType) {
        this.vendType = vendType;
    }

    public SearchColumnSelectField getVendType(int i) {
        return this.vendType[i];
    }

    public void setVendType(int i, SearchColumnSelectField _value) {
        this.vendType[i] = _value;
    }

    public SearchColumnBooleanField[] getVisibleToCustomer() {
        return this.visibleToCustomer;
    }

    public void setVisibleToCustomer(SearchColumnBooleanField[] visibleToCustomer) {
        this.visibleToCustomer = visibleToCustomer;
    }

    public SearchColumnBooleanField getVisibleToCustomer(int i) {
        return this.visibleToCustomer[i];
    }

    public void setVisibleToCustomer(int i, SearchColumnBooleanField _value) {
        this.visibleToCustomer[i] = _value;
    }

    public SearchColumnDoubleField[] getVsoeAllocation() {
        return this.vsoeAllocation;
    }

    public void setVsoeAllocation(SearchColumnDoubleField[] vsoeAllocation) {
        this.vsoeAllocation = vsoeAllocation;
    }

    public SearchColumnDoubleField getVsoeAllocation(int i) {
        return this.vsoeAllocation[i];
    }

    public void setVsoeAllocation(int i, SearchColumnDoubleField _value) {
        this.vsoeAllocation[i] = _value;
    }

    public SearchColumnDoubleField[] getVsoeAmount() {
        return this.vsoeAmount;
    }

    public void setVsoeAmount(SearchColumnDoubleField[] vsoeAmount) {
        this.vsoeAmount = vsoeAmount;
    }

    public SearchColumnDoubleField getVsoeAmount(int i) {
        return this.vsoeAmount[i];
    }

    public void setVsoeAmount(int i, SearchColumnDoubleField _value) {
        this.vsoeAmount[i] = _value;
    }

    public SearchColumnEnumSelectField[] getVsoeDeferral() {
        return this.vsoeDeferral;
    }

    public void setVsoeDeferral(SearchColumnEnumSelectField[] vsoeDeferral) {
        this.vsoeDeferral = vsoeDeferral;
    }

    public SearchColumnEnumSelectField getVsoeDeferral(int i) {
        return this.vsoeDeferral[i];
    }

    public void setVsoeDeferral(int i, SearchColumnEnumSelectField _value) {
        this.vsoeDeferral[i] = _value;
    }

    public SearchColumnBooleanField[] getVsoeDelivered() {
        return this.vsoeDelivered;
    }

    public void setVsoeDelivered(SearchColumnBooleanField[] vsoeDelivered) {
        this.vsoeDelivered = vsoeDelivered;
    }

    public SearchColumnBooleanField getVsoeDelivered(int i) {
        return this.vsoeDelivered[i];
    }

    public void setVsoeDelivered(int i, SearchColumnBooleanField _value) {
        this.vsoeDelivered[i] = _value;
    }

    public SearchColumnEnumSelectField[] getVsoePermitDiscount() {
        return this.vsoePermitDiscount;
    }

    public void setVsoePermitDiscount(SearchColumnEnumSelectField[] vsoePermitDiscount) {
        this.vsoePermitDiscount = vsoePermitDiscount;
    }

    public SearchColumnEnumSelectField getVsoePermitDiscount(int i) {
        return this.vsoePermitDiscount[i];
    }

    public void setVsoePermitDiscount(int i, SearchColumnEnumSelectField _value) {
        this.vsoePermitDiscount[i] = _value;
    }

    public SearchColumnDoubleField[] getVsoePrice() {
        return this.vsoePrice;
    }

    public void setVsoePrice(SearchColumnDoubleField[] vsoePrice) {
        this.vsoePrice = vsoePrice;
    }

    public SearchColumnDoubleField getVsoePrice(int i) {
        return this.vsoePrice[i];
    }

    public void setVsoePrice(int i, SearchColumnDoubleField _value) {
        this.vsoePrice[i] = _value;
    }

    public SearchColumnStringField[] getWebSite() {
        return this.webSite;
    }

    public void setWebSite(SearchColumnStringField[] webSite) {
        this.webSite = webSite;
    }

    public SearchColumnStringField getWebSite(int i) {
        return this.webSite[i];
    }

    public void setWebSite(int i, SearchColumnStringField _value) {
        this.webSite[i] = _value;
    }

    public SearchColumnCustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TransactionSearchRowBasic)) {
            return false;
        }
        TransactionSearchRowBasic other = (TransactionSearchRowBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.abbrev == null && other.getAbbrev() == null || this.abbrev != null && Arrays.equals(this.abbrev, other.getAbbrev())) && (this.account == null && other.getAccount() == null || this.account != null && Arrays.equals(this.account, other.getAccount())) && (this.accountType == null && other.getAccountType() == null || this.accountType != null && Arrays.equals(this.accountType, other.getAccountType())) && (this.acctCorpCardExp == null && other.getAcctCorpCardExp() == null || this.acctCorpCardExp != null && Arrays.equals(this.acctCorpCardExp, other.getAcctCorpCardExp())) && (this.actualProductionEndDate == null && other.getActualProductionEndDate() == null || this.actualProductionEndDate != null && Arrays.equals(this.actualProductionEndDate, other.getActualProductionEndDate())) && (this.actualProductionStartDate == null && other.getActualProductionStartDate() == null || this.actualProductionStartDate != null && Arrays.equals(this.actualProductionStartDate, other.getActualProductionStartDate())) && (this.actualShipDate == null && other.getActualShipDate() == null || this.actualShipDate != null && Arrays.equals(this.actualShipDate, other.getActualShipDate())) && (this.altSalesAmount == null && other.getAltSalesAmount() == null || this.altSalesAmount != null && Arrays.equals(this.altSalesAmount, other.getAltSalesAmount())) && (this.altSalesNetAmount == null && other.getAltSalesNetAmount() == null || this.altSalesNetAmount != null && Arrays.equals(this.altSalesNetAmount, other.getAltSalesNetAmount())) && (this.amount == null && other.getAmount() == null || this.amount != null && Arrays.equals(this.amount, other.getAmount())) && (this.amountPaid == null && other.getAmountPaid() == null || this.amountPaid != null && Arrays.equals(this.amountPaid, other.getAmountPaid())) && (this.amountRemaining == null && other.getAmountRemaining() == null || this.amountRemaining != null && Arrays.equals(this.amountRemaining, other.getAmountRemaining())) && (this.amountUnbilled == null && other.getAmountUnbilled() == null || this.amountUnbilled != null && Arrays.equals(this.amountUnbilled, other.getAmountUnbilled())) && (this.appliedToForeignAmount == null && other.getAppliedToForeignAmount() == null || this.appliedToForeignAmount != null && Arrays.equals(this.appliedToForeignAmount, other.getAppliedToForeignAmount())) && (this.appliedToIsFxVariance == null && other.getAppliedToIsFxVariance() == null || this.appliedToIsFxVariance != null && Arrays.equals(this.appliedToIsFxVariance, other.getAppliedToIsFxVariance())) && (this.appliedToLinkAmount == null && other.getAppliedToLinkAmount() == null || this.appliedToLinkAmount != null && Arrays.equals(this.appliedToLinkAmount, other.getAppliedToLinkAmount())) && (this.appliedToLinkType == null && other.getAppliedToLinkType() == null || this.appliedToLinkType != null && Arrays.equals(this.appliedToLinkType, other.getAppliedToLinkType())) && (this.appliedToTransaction == null && other.getAppliedToTransaction() == null || this.appliedToTransaction != null && Arrays.equals(this.appliedToTransaction, other.getAppliedToTransaction())) && (this.applyingForeignAmount == null && other.getApplyingForeignAmount() == null || this.applyingForeignAmount != null && Arrays.equals(this.applyingForeignAmount, other.getApplyingForeignAmount())) && (this.applyingIsFxVariance == null && other.getApplyingIsFxVariance() == null || this.applyingIsFxVariance != null && Arrays.equals(this.applyingIsFxVariance, other.getApplyingIsFxVariance())) && (this.applyingLinkAmount == null && other.getApplyingLinkAmount() == null || this.applyingLinkAmount != null && Arrays.equals(this.applyingLinkAmount, other.getApplyingLinkAmount())) && (this.applyingLinkType == null && other.getApplyingLinkType() == null || this.applyingLinkType != null && Arrays.equals(this.applyingLinkType, other.getApplyingLinkType())) && (this.applyingTransaction == null && other.getApplyingTransaction() == null || this.applyingTransaction != null && Arrays.equals(this.applyingTransaction, other.getApplyingTransaction())) && (this.approvalStatus == null && other.getApprovalStatus() == null || this.approvalStatus != null && Arrays.equals(this.approvalStatus, other.getApprovalStatus())) && (this.authCode == null && other.getAuthCode() == null || this.authCode != null && Arrays.equals(this.authCode, other.getAuthCode())) && (this.autoCalculateLag == null && other.getAutoCalculateLag() == null || this.autoCalculateLag != null && Arrays.equals(this.autoCalculateLag, other.getAutoCalculateLag())) && (this.avsStreetMatch == null && other.getAvsStreetMatch() == null || this.avsStreetMatch != null && Arrays.equals(this.avsStreetMatch, other.getAvsStreetMatch())) && (this.avsZipMatch == null && other.getAvsZipMatch() == null || this.avsZipMatch != null && Arrays.equals(this.avsZipMatch, other.getAvsZipMatch())) && (this.billable == null && other.getBillable() == null || this.billable != null && Arrays.equals(this.billable, other.getBillable())) && (this.billAddress == null && other.getBillAddress() == null || this.billAddress != null && Arrays.equals(this.billAddress, other.getBillAddress())) && (this.billAddress1 == null && other.getBillAddress1() == null || this.billAddress1 != null && Arrays.equals(this.billAddress1, other.getBillAddress1())) && (this.billAddress2 == null && other.getBillAddress2() == null || this.billAddress2 != null && Arrays.equals(this.billAddress2, other.getBillAddress2())) && (this.billAddress3 == null && other.getBillAddress3() == null || this.billAddress3 != null && Arrays.equals(this.billAddress3, other.getBillAddress3())) && (this.billAddressee == null && other.getBillAddressee() == null || this.billAddressee != null && Arrays.equals(this.billAddressee, other.getBillAddressee())) && (this.billAttention == null && other.getBillAttention() == null || this.billAttention != null && Arrays.equals(this.billAttention, other.getBillAttention())) && (this.billCity == null && other.getBillCity() == null || this.billCity != null && Arrays.equals(this.billCity, other.getBillCity())) && (this.billCountry == null && other.getBillCountry() == null || this.billCountry != null && Arrays.equals(this.billCountry, other.getBillCountry())) && (this.billCountryCode == null && other.getBillCountryCode() == null || this.billCountryCode != null && Arrays.equals(this.billCountryCode, other.getBillCountryCode())) && (this.billedDate == null && other.getBilledDate() == null || this.billedDate != null && Arrays.equals(this.billedDate, other.getBilledDate())) && (this.billingAccount == null && other.getBillingAccount() == null || this.billingAccount != null && Arrays.equals(this.billingAccount, other.getBillingAccount())) && (this.billingAmount == null && other.getBillingAmount() == null || this.billingAmount != null && Arrays.equals(this.billingAmount, other.getBillingAmount())) && (this.billingSchedule == null && other.getBillingSchedule() == null || this.billingSchedule != null && Arrays.equals(this.billingSchedule, other.getBillingSchedule())) && (this.billingTransaction == null && other.getBillingTransaction() == null || this.billingTransaction != null && Arrays.equals(this.billingTransaction, other.getBillingTransaction())) && (this.billPhone == null && other.getBillPhone() == null || this.billPhone != null && Arrays.equals(this.billPhone, other.getBillPhone())) && (this.billState == null && other.getBillState() == null || this.billState != null && Arrays.equals(this.billState, other.getBillState())) && (this.billVarianceStatus == null && other.getBillVarianceStatus() == null || this.billVarianceStatus != null && Arrays.equals(this.billVarianceStatus, other.getBillVarianceStatus())) && (this.billZip == null && other.getBillZip() == null || this.billZip != null && Arrays.equals(this.billZip, other.getBillZip())) && (this.binNumber == null && other.getBinNumber() == null || this.binNumber != null && Arrays.equals(this.binNumber, other.getBinNumber())) && (this.binNumberQuantity == null && other.getBinNumberQuantity() == null || this.binNumberQuantity != null && Arrays.equals(this.binNumberQuantity, other.getBinNumberQuantity())) && (this.bomQuantity == null && other.getBomQuantity() == null || this.bomQuantity != null && Arrays.equals(this.bomQuantity, other.getBomQuantity())) && (this.buildEntireAssembly == null && other.getBuildEntireAssembly() == null || this.buildEntireAssembly != null && Arrays.equals(this.buildEntireAssembly, other.getBuildEntireAssembly())) && (this.buildVariance == null && other.getBuildVariance() == null || this.buildVariance != null && Arrays.equals(this.buildVariance, other.getBuildVariance())) && (this.built == null && other.getBuilt() == null || this.built != null && Arrays.equals(this.built, other.getBuilt())) && (this.canHaveStackablePromotions == null && other.getCanHaveStackablePromotions() == null || this.canHaveStackablePromotions != null && Arrays.equals(this.canHaveStackablePromotions, other.getCanHaveStackablePromotions())) && (this.catchUpPeriod == null && other.getCatchUpPeriod() == null || this.catchUpPeriod != null && Arrays.equals(this.catchUpPeriod, other.getCatchUpPeriod())) && (this.ccCustomerCode == null && other.getCcCustomerCode() == null || this.ccCustomerCode != null && Arrays.equals(this.ccCustomerCode, other.getCcCustomerCode())) && (this.ccExpDate == null && other.getCcExpDate() == null || this.ccExpDate != null && Arrays.equals(this.ccExpDate, other.getCcExpDate())) && (this.ccHolderName == null && other.getCcHolderName() == null || this.ccHolderName != null && Arrays.equals(this.ccHolderName, other.getCcHolderName())) && (this.ccNumber == null && other.getCcNumber() == null || this.ccNumber != null && Arrays.equals(this.ccNumber, other.getCcNumber())) && (this.ccStreet == null && other.getCcStreet() == null || this.ccStreet != null && Arrays.equals(this.ccStreet, other.getCcStreet())) && (this.ccZipCode == null && other.getCcZipCode() == null || this.ccZipCode != null && Arrays.equals(this.ccZipCode, other.getCcZipCode())) && (this._class == null && other.get_class() == null || this._class != null && Arrays.equals(this._class, other.get_class())) && (this.cleared == null && other.getCleared() == null || this.cleared != null && Arrays.equals(this.cleared, other.getCleared())) && (this.closed == null && other.getClosed() == null || this.closed != null && Arrays.equals(this.closed, other.getClosed())) && (this.closeDate == null && other.getCloseDate() == null || this.closeDate != null && Arrays.equals(this.closeDate, other.getCloseDate())) && (this.cogsAmount == null && other.getCogsAmount() == null || this.cogsAmount != null && Arrays.equals(this.cogsAmount, other.getCogsAmount())) && (this.commissionEffectiveDate == null && other.getCommissionEffectiveDate() == null || this.commissionEffectiveDate != null && Arrays.equals(this.commissionEffectiveDate, other.getCommissionEffectiveDate())) && (this.commit == null && other.getCommit() == null || this.commit != null && Arrays.equals(this.commit, other.getCommit())) && (this.componentYield == null && other.getComponentYield() == null || this.componentYield != null && Arrays.equals(this.componentYield, other.getComponentYield())) && (this.confirmationNumber == null && other.getConfirmationNumber() == null || this.confirmationNumber != null && Arrays.equals(this.confirmationNumber, other.getConfirmationNumber())) && (this.contribution == null && other.getContribution() == null || this.contribution != null && Arrays.equals(this.contribution, other.getContribution())) && (this.contributionPrimary == null && other.getContributionPrimary() == null || this.contributionPrimary != null && Arrays.equals(this.contributionPrimary, other.getContributionPrimary())) && (this.costComponentAmount == null && other.getCostComponentAmount() == null || this.costComponentAmount != null && Arrays.equals(this.costComponentAmount, other.getCostComponentAmount())) && (this.costComponentCategory == null && other.getCostComponentCategory() == null || this.costComponentCategory != null && Arrays.equals(this.costComponentCategory, other.getCostComponentCategory())) && (this.costComponentItem == null && other.getCostComponentItem() == null || this.costComponentItem != null && Arrays.equals(this.costComponentItem, other.getCostComponentItem())) && (this.costComponentQuantity == null && other.getCostComponentQuantity() == null || this.costComponentQuantity != null && Arrays.equals(this.costComponentQuantity, other.getCostComponentQuantity())) && (this.costComponentStandardCost == null && other.getCostComponentStandardCost() == null || this.costComponentStandardCost != null && Arrays.equals(this.costComponentStandardCost, other.getCostComponentStandardCost())) && (this.costEstimate == null && other.getCostEstimate() == null || this.costEstimate != null && Arrays.equals(this.costEstimate, other.getCostEstimate())) && (this.costEstimateRate == null && other.getCostEstimateRate() == null || this.costEstimateRate != null && Arrays.equals(this.costEstimateRate, other.getCostEstimateRate())) && (this.costEstimateType == null && other.getCostEstimateType() == null || this.costEstimateType != null && Arrays.equals(this.costEstimateType, other.getCostEstimateType())) && (this.createdBy == null && other.getCreatedBy() == null || this.createdBy != null && Arrays.equals(this.createdBy, other.getCreatedBy())) && (this.createdFrom == null && other.getCreatedFrom() == null || this.createdFrom != null && Arrays.equals(this.createdFrom, other.getCreatedFrom())) && (this.creditAmount == null && other.getCreditAmount() == null || this.creditAmount != null && Arrays.equals(this.creditAmount, other.getCreditAmount())) && (this.cscMatch == null && other.getCscMatch() == null || this.cscMatch != null && Arrays.equals(this.cscMatch, other.getCscMatch())) && (this.currency == null && other.getCurrency() == null || this.currency != null && Arrays.equals(this.currency, other.getCurrency())) && (this.customForm == null && other.getCustomForm() == null || this.customForm != null && Arrays.equals(this.customForm, other.getCustomForm())) && (this.customGL == null && other.getCustomGL() == null || this.customGL != null && Arrays.equals(this.customGL, other.getCustomGL())) && (this.custType == null && other.getCustType() == null || this.custType != null && Arrays.equals(this.custType, other.getCustType())) && (this.dateCreated == null && other.getDateCreated() == null || this.dateCreated != null && Arrays.equals(this.dateCreated, other.getDateCreated())) && (this.daysOpen == null && other.getDaysOpen() == null || this.daysOpen != null && Arrays.equals(this.daysOpen, other.getDaysOpen())) && (this.daysOverdue == null && other.getDaysOverdue() == null || this.daysOverdue != null && Arrays.equals(this.daysOverdue, other.getDaysOverdue())) && (this.debitAmount == null && other.getDebitAmount() == null || this.debitAmount != null && Arrays.equals(this.debitAmount, other.getDebitAmount())) && (this.deferredRevenue == null && other.getDeferredRevenue() == null || this.deferredRevenue != null && Arrays.equals(this.deferredRevenue, other.getDeferredRevenue())) && (this.deferRevRec == null && other.getDeferRevRec() == null || this.deferRevRec != null && Arrays.equals(this.deferRevRec, other.getDeferRevRec())) && (this.department == null && other.getDepartment() == null || this.department != null && Arrays.equals(this.department, other.getDepartment())) && (this.depositDate == null && other.getDepositDate() == null || this.depositDate != null && Arrays.equals(this.depositDate, other.getDepositDate())) && (this.depositTransaction == null && other.getDepositTransaction() == null || this.depositTransaction != null && Arrays.equals(this.depositTransaction, other.getDepositTransaction())) && (this.discountAmount == null && other.getDiscountAmount() == null || this.discountAmount != null && Arrays.equals(this.discountAmount, other.getDiscountAmount())) && (this.docUnit == null && other.getDocUnit() == null || this.docUnit != null && Arrays.equals(this.docUnit, other.getDocUnit())) && (this.drAccount == null && other.getDrAccount() == null || this.drAccount != null && Arrays.equals(this.drAccount, other.getDrAccount())) && (this.dueDate == null && other.getDueDate() == null || this.dueDate != null && Arrays.equals(this.dueDate, other.getDueDate())) && (this.effectiveRate == null && other.getEffectiveRate() == null || this.effectiveRate != null && Arrays.equals(this.effectiveRate, other.getEffectiveRate())) && (this.email == null && other.getEmail() == null || this.email != null && Arrays.equals(this.email, other.getEmail())) && (this.endDate == null && other.getEndDate() == null || this.endDate != null && Arrays.equals(this.endDate, other.getEndDate())) && (this.entity == null && other.getEntity() == null || this.entity != null && Arrays.equals(this.entity, other.getEntity())) && (this.entityStatus == null && other.getEntityStatus() == null || this.entityStatus != null && Arrays.equals(this.entityStatus, other.getEntityStatus())) && (this.estGrossProfit == null && other.getEstGrossProfit() == null || this.estGrossProfit != null && Arrays.equals(this.estGrossProfit, other.getEstGrossProfit())) && (this.estGrossProfitPct == null && other.getEstGrossProfitPct() == null || this.estGrossProfitPct != null && Arrays.equals(this.estGrossProfitPct, other.getEstGrossProfitPct())) && (this.estGrossProfitPercent == null && other.getEstGrossProfitPercent() == null || this.estGrossProfitPercent != null && Arrays.equals(this.estGrossProfitPercent, other.getEstGrossProfitPercent())) && (this.exchangeRate == null && other.getExchangeRate() == null || this.exchangeRate != null && Arrays.equals(this.exchangeRate, other.getExchangeRate())) && (this.excludeCommission == null && other.getExcludeCommission() == null || this.excludeCommission != null && Arrays.equals(this.excludeCommission, other.getExcludeCommission())) && (this.excludeFromRateRequest == null && other.getExcludeFromRateRequest() == null || this.excludeFromRateRequest != null && Arrays.equals(this.excludeFromRateRequest, other.getExcludeFromRateRequest())) && (this.expectedCloseDate == null && other.getExpectedCloseDate() == null || this.expectedCloseDate != null && Arrays.equals(this.expectedCloseDate, other.getExpectedCloseDate())) && (this.expectedReceiptDate == null && other.getExpectedReceiptDate() == null || this.expectedReceiptDate != null && Arrays.equals(this.expectedReceiptDate, other.getExpectedReceiptDate())) && (this.expenseCategory == null && other.getExpenseCategory() == null || this.expenseCategory != null && Arrays.equals(this.expenseCategory, other.getExpenseCategory())) && (this.expenseDate == null && other.getExpenseDate() == null || this.expenseDate != null && Arrays.equals(this.expenseDate, other.getExpenseDate())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && Arrays.equals(this.externalId, other.getExternalId())) && (this.firmed == null && other.getFirmed() == null || this.firmed != null && Arrays.equals(this.firmed, other.getFirmed())) && (this.forecastType == null && other.getForecastType() == null || this.forecastType != null && Arrays.equals(this.forecastType, other.getForecastType())) && (this.fulfillingTransaction == null && other.getFulfillingTransaction() == null || this.fulfillingTransaction != null && Arrays.equals(this.fulfillingTransaction, other.getFulfillingTransaction())) && (this.fxAccount == null && other.getFxAccount() == null || this.fxAccount != null && Arrays.equals(this.fxAccount, other.getFxAccount())) && (this.fxAmount == null && other.getFxAmount() == null || this.fxAmount != null && Arrays.equals(this.fxAmount, other.getFxAmount())) && (this.fxCostEstimate == null && other.getFxCostEstimate() == null || this.fxCostEstimate != null && Arrays.equals(this.fxCostEstimate, other.getFxCostEstimate())) && (this.fxCostEstimateRate == null && other.getFxCostEstimateRate() == null || this.fxCostEstimateRate != null && Arrays.equals(this.fxCostEstimateRate, other.getFxCostEstimateRate())) && (this.fxEstGrossProfit == null && other.getFxEstGrossProfit() == null || this.fxEstGrossProfit != null && Arrays.equals(this.fxEstGrossProfit, other.getFxEstGrossProfit())) && (this.fxTranCostEstimate == null && other.getFxTranCostEstimate() == null || this.fxTranCostEstimate != null && Arrays.equals(this.fxTranCostEstimate, other.getFxTranCostEstimate())) && (this.fxVsoeAllocation == null && other.getFxVsoeAllocation() == null || this.fxVsoeAllocation != null && Arrays.equals(this.fxVsoeAllocation, other.getFxVsoeAllocation())) && (this.fxVsoeAmount == null && other.getFxVsoeAmount() == null || this.fxVsoeAmount != null && Arrays.equals(this.fxVsoeAmount, other.getFxVsoeAmount())) && (this.fxVsoePrice == null && other.getFxVsoePrice() == null || this.fxVsoePrice != null && Arrays.equals(this.fxVsoePrice, other.getFxVsoePrice())) && (this.gcoAvailabelToCharge == null && other.getGcoAvailabelToCharge() == null || this.gcoAvailabelToCharge != null && Arrays.equals(this.gcoAvailabelToCharge, other.getGcoAvailabelToCharge())) && (this.gcoAvailableToRefund == null && other.getGcoAvailableToRefund() == null || this.gcoAvailableToRefund != null && Arrays.equals(this.gcoAvailableToRefund, other.getGcoAvailableToRefund())) && (this.gcoAvsStreetMatch == null && other.getGcoAvsStreetMatch() == null || this.gcoAvsStreetMatch != null && Arrays.equals(this.gcoAvsStreetMatch, other.getGcoAvsStreetMatch())) && (this.gcoAvsZipMatch == null && other.getGcoAvsZipMatch() == null || this.gcoAvsZipMatch != null && Arrays.equals(this.gcoAvsZipMatch, other.getGcoAvsZipMatch())) && (this.gcoBuyerAccountAge == null && other.getGcoBuyerAccountAge() == null || this.gcoBuyerAccountAge != null && Arrays.equals(this.gcoBuyerAccountAge, other.getGcoBuyerAccountAge())) && (this.gcoBuyerIp == null && other.getGcoBuyerIp() == null || this.gcoBuyerIp != null && Arrays.equals(this.gcoBuyerIp, other.getGcoBuyerIp())) && (this.gcoChargeAmount == null && other.getGcoChargeAmount() == null || this.gcoChargeAmount != null && Arrays.equals(this.gcoChargeAmount, other.getGcoChargeAmount())) && (this.gcoChargebackAmount == null && other.getGcoChargebackAmount() == null || this.gcoChargebackAmount != null && Arrays.equals(this.gcoChargebackAmount, other.getGcoChargebackAmount())) && (this.gcoConfirmedChargedTotal == null && other.getGcoConfirmedChargedTotal() == null || this.gcoConfirmedChargedTotal != null && Arrays.equals(this.gcoConfirmedChargedTotal, other.getGcoConfirmedChargedTotal())) && (this.gcoConfirmedRefundedTotal == null && other.getGcoConfirmedRefundedTotal() == null || this.gcoConfirmedRefundedTotal != null && Arrays.equals(this.gcoConfirmedRefundedTotal, other.getGcoConfirmedRefundedTotal())) && (this.gcoCreditcardNumber == null && other.getGcoCreditcardNumber() == null || this.gcoCreditcardNumber != null && Arrays.equals(this.gcoCreditcardNumber, other.getGcoCreditcardNumber())) && (this.gcoCscMatch == null && other.getGcoCscMatch() == null || this.gcoCscMatch != null && Arrays.equals(this.gcoCscMatch, other.getGcoCscMatch())) && (this.gcoFinancialState == null && other.getGcoFinancialState() == null || this.gcoFinancialState != null && Arrays.equals(this.gcoFinancialState, other.getGcoFinancialState())) && (this.gcoFulfillmentState == null && other.getGcoFulfillmentState() == null || this.gcoFulfillmentState != null && Arrays.equals(this.gcoFulfillmentState, other.getGcoFulfillmentState())) && (this.gcoOrderId == null && other.getGcoOrderId() == null || this.gcoOrderId != null && Arrays.equals(this.gcoOrderId, other.getGcoOrderId())) && (this.gcoOrderTotal == null && other.getGcoOrderTotal() == null || this.gcoOrderTotal != null && Arrays.equals(this.gcoOrderTotal, other.getGcoOrderTotal())) && (this.gcoPromotionAmount == null && other.getGcoPromotionAmount() == null || this.gcoPromotionAmount != null && Arrays.equals(this.gcoPromotionAmount, other.getGcoPromotionAmount())) && (this.gcoPromotionName == null && other.getGcoPromotionName() == null || this.gcoPromotionName != null && Arrays.equals(this.gcoPromotionName, other.getGcoPromotionName())) && (this.gcoRefundAmount == null && other.getGcoRefundAmount() == null || this.gcoRefundAmount != null && Arrays.equals(this.gcoRefundAmount, other.getGcoRefundAmount())) && (this.gcoShippingTotal == null && other.getGcoShippingTotal() == null || this.gcoShippingTotal != null && Arrays.equals(this.gcoShippingTotal, other.getGcoShippingTotal())) && (this.gcoStateChangedDetail == null && other.getGcoStateChangedDetail() == null || this.gcoStateChangedDetail != null && Arrays.equals(this.gcoStateChangedDetail, other.getGcoStateChangedDetail())) && (this.giftCert == null && other.getGiftCert() == null || this.giftCert != null && Arrays.equals(this.giftCert, other.getGiftCert())) && (this.grossAmount == null && other.getGrossAmount() == null || this.grossAmount != null && Arrays.equals(this.grossAmount, other.getGrossAmount())) && (this.includeInForecast == null && other.getIncludeInForecast() == null || this.includeInForecast != null && Arrays.equals(this.includeInForecast, other.getIncludeInForecast())) && (this.incoterm == null && other.getIncoterm() == null || this.incoterm != null && Arrays.equals(this.incoterm, other.getIncoterm())) && (this.intercoStatus == null && other.getIntercoStatus() == null || this.intercoStatus != null && Arrays.equals(this.intercoStatus, other.getIntercoStatus())) && (this.intercoTransaction == null && other.getIntercoTransaction() == null || this.intercoTransaction != null && Arrays.equals(this.intercoTransaction, other.getIntercoTransaction())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && Arrays.equals(this.internalId, other.getInternalId())) && (this.inventoryLocation == null && other.getInventoryLocation() == null || this.inventoryLocation != null && Arrays.equals(this.inventoryLocation, other.getInventoryLocation())) && (this.inventorySubsidiary == null && other.getInventorySubsidiary() == null || this.inventorySubsidiary != null && Arrays.equals(this.inventorySubsidiary, other.getInventorySubsidiary())) && (this.inVsoeBundle == null && other.getInVsoeBundle() == null || this.inVsoeBundle != null && Arrays.equals(this.inVsoeBundle, other.getInVsoeBundle())) && (this.isAllocation == null && other.getIsAllocation() == null || this.isAllocation != null && Arrays.equals(this.isAllocation, other.getIsAllocation())) && (this.isBackflush == null && other.getIsBackflush() == null || this.isBackflush != null && Arrays.equals(this.isBackflush, other.getIsBackflush())) && (this.isGcoChargeback == null && other.getIsGcoChargeback() == null || this.isGcoChargeback != null && Arrays.equals(this.isGcoChargeback, other.getIsGcoChargeback())) && (this.isGcoChargeConfirmed == null && other.getIsGcoChargeConfirmed() == null || this.isGcoChargeConfirmed != null && Arrays.equals(this.isGcoChargeConfirmed, other.getIsGcoChargeConfirmed())) && (this.isGcoPaymentGuaranteed == null && other.getIsGcoPaymentGuaranteed() == null || this.isGcoPaymentGuaranteed != null && Arrays.equals(this.isGcoPaymentGuaranteed, other.getIsGcoPaymentGuaranteed())) && (this.isGcoRefundConfirmed == null && other.getIsGcoRefundConfirmed() == null || this.isGcoRefundConfirmed != null && Arrays.equals(this.isGcoRefundConfirmed, other.getIsGcoRefundConfirmed())) && (this.isInsideDelivery == null && other.getIsInsideDelivery() == null || this.isInsideDelivery != null && Arrays.equals(this.isInsideDelivery, other.getIsInsideDelivery())) && (this.isInsidePickup == null && other.getIsInsidePickup() == null || this.isInsidePickup != null && Arrays.equals(this.isInsidePickup, other.getIsInsidePickup())) && (this.isIntercompanyAdjustment == null && other.getIsIntercompanyAdjustment() == null || this.isIntercompanyAdjustment != null && Arrays.equals(this.isIntercompanyAdjustment, other.getIsIntercompanyAdjustment())) && (this.isInTransitPayment == null && other.getIsInTransitPayment() == null || this.isInTransitPayment != null && Arrays.equals(this.isInTransitPayment, other.getIsInTransitPayment())) && (this.isMultiShipTo == null && other.getIsMultiShipTo() == null || this.isMultiShipTo != null && Arrays.equals(this.isMultiShipTo, other.getIsMultiShipTo())) && (this.isReversal == null && other.getIsReversal() == null || this.isReversal != null && Arrays.equals(this.isReversal, other.getIsReversal())) && (this.isRevRecTransaction == null && other.getIsRevRecTransaction() == null || this.isRevRecTransaction != null && Arrays.equals(this.isRevRecTransaction, other.getIsRevRecTransaction())) && (this.isScrap == null && other.getIsScrap() == null || this.isScrap != null && Arrays.equals(this.isScrap, other.getIsScrap())) && (this.isShipAddress == null && other.getIsShipAddress() == null || this.isShipAddress != null && Arrays.equals(this.isShipAddress, other.getIsShipAddress())) && (this.isTransferPriceCosting == null && other.getIsTransferPriceCosting() == null || this.isTransferPriceCosting != null && Arrays.equals(this.isTransferPriceCosting, other.getIsTransferPriceCosting())) && (this.isWip == null && other.getIsWip() == null || this.isWip != null && Arrays.equals(this.isWip, other.getIsWip())) && (this.item == null && other.getItem() == null || this.item != null && Arrays.equals(this.item, other.getItem())) && (this.itemFulfillmentChoice == null && other.getItemFulfillmentChoice() == null || this.itemFulfillmentChoice != null && Arrays.equals(this.itemFulfillmentChoice, other.getItemFulfillmentChoice())) && (this.itemRevision == null && other.getItemRevision() == null || this.itemRevision != null && Arrays.equals(this.itemRevision, other.getItemRevision())) && (this.landedCostPerLine == null && other.getLandedCostPerLine() == null || this.landedCostPerLine != null && Arrays.equals(this.landedCostPerLine, other.getLandedCostPerLine())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && Arrays.equals(this.lastModifiedDate, other.getLastModifiedDate())) && (this.leadSource == null && other.getLeadSource() == null || this.leadSource != null && Arrays.equals(this.leadSource, other.getLeadSource())) && (this.line == null && other.getLine() == null || this.line != null && Arrays.equals(this.line, other.getLine())) && (this.lineSequenceNumber == null && other.getLineSequenceNumber() == null || this.lineSequenceNumber != null && Arrays.equals(this.lineSequenceNumber, other.getLineSequenceNumber())) && (this.lineUniqueKey == null && other.getLineUniqueKey() == null || this.lineUniqueKey != null && Arrays.equals(this.lineUniqueKey, other.getLineUniqueKey())) && (this.location == null && other.getLocation() == null || this.location != null && Arrays.equals(this.location, other.getLocation())) && (this.locationAutoAssigned == null && other.getLocationAutoAssigned() == null || this.locationAutoAssigned != null && Arrays.equals(this.locationAutoAssigned, other.getLocationAutoAssigned())) && (this.mainLine == null && other.getMainLine() == null || this.mainLine != null && Arrays.equals(this.mainLine, other.getMainLine())) && (this.mainName == null && other.getMainName() == null || this.mainName != null && Arrays.equals(this.mainName, other.getMainName())) && (this.manufacturingRouting == null && other.getManufacturingRouting() == null || this.manufacturingRouting != null && Arrays.equals(this.manufacturingRouting, other.getManufacturingRouting())) && (this.matchBillToReceipt == null && other.getMatchBillToReceipt() == null || this.matchBillToReceipt != null && Arrays.equals(this.matchBillToReceipt, other.getMatchBillToReceipt())) && (this.memo == null && other.getMemo() == null || this.memo != null && Arrays.equals(this.memo, other.getMemo())) && (this.memoMain == null && other.getMemoMain() == null || this.memoMain != null && Arrays.equals(this.memoMain, other.getMemoMain())) && (this.memorized == null && other.getMemorized() == null || this.memorized != null && Arrays.equals(this.memorized, other.getMemorized())) && (this.merchantAccount == null && other.getMerchantAccount() == null || this.merchantAccount != null && Arrays.equals(this.merchantAccount, other.getMerchantAccount())) && (this.message == null && other.getMessage() == null || this.message != null && Arrays.equals(this.message, other.getMessage())) && (this.multiSubsidiary == null && other.getMultiSubsidiary() == null || this.multiSubsidiary != null && Arrays.equals(this.multiSubsidiary, other.getMultiSubsidiary())) && (this.netAmount == null && other.getNetAmount() == null || this.netAmount != null && Arrays.equals(this.netAmount, other.getNetAmount())) && (this.netAmountNoTax == null && other.getNetAmountNoTax() == null || this.netAmountNoTax != null && Arrays.equals(this.netAmountNoTax, other.getNetAmountNoTax())) && (this.nextApprover == null && other.getNextApprover() == null || this.nextApprover != null && Arrays.equals(this.nextApprover, other.getNextApprover())) && (this.nextBillDate == null && other.getNextBillDate() == null || this.nextBillDate != null && Arrays.equals(this.nextBillDate, other.getNextBillDate())) && (this.nexus == null && other.getNexus() == null || this.nexus != null && Arrays.equals(this.nexus, other.getNexus())) && (this.noAutoAssignLocation == null && other.getNoAutoAssignLocation() == null || this.noAutoAssignLocation != null && Arrays.equals(this.noAutoAssignLocation, other.getNoAutoAssignLocation())) && (this.nonReimbursable == null && other.getNonReimbursable() == null || this.nonReimbursable != null && Arrays.equals(this.nonReimbursable, other.getNonReimbursable())) && (this.oneTimeTotal == null && other.getOneTimeTotal() == null || this.oneTimeTotal != null && Arrays.equals(this.oneTimeTotal, other.getOneTimeTotal())) && (this.opportunity == null && other.getOpportunity() == null || this.opportunity != null && Arrays.equals(this.opportunity, other.getOpportunity())) && (this.options == null && other.getOptions() == null || this.options != null && Arrays.equals(this.options, other.getOptions())) && (this.orderAllocationStrategy == null && other.getOrderAllocationStrategy() == null || this.orderAllocationStrategy != null && Arrays.equals(this.orderAllocationStrategy, other.getOrderAllocationStrategy())) && (this.orderPriority == null && other.getOrderPriority() == null || this.orderPriority != null && Arrays.equals(this.orderPriority, other.getOrderPriority())) && (this.originator == null && other.getOriginator() == null || this.originator != null && Arrays.equals(this.originator, other.getOriginator())) && (this.otherRefNum == null && other.getOtherRefNum() == null || this.otherRefNum != null && Arrays.equals(this.otherRefNum, other.getOtherRefNum())) && (this.overheadParentItem == null && other.getOverheadParentItem() == null || this.overheadParentItem != null && Arrays.equals(this.overheadParentItem, other.getOverheadParentItem())) && (this.overrideInstallments == null && other.getOverrideInstallments() == null || this.overrideInstallments != null && Arrays.equals(this.overrideInstallments, other.getOverrideInstallments())) && (this.packageCount == null && other.getPackageCount() == null || this.packageCount != null && Arrays.equals(this.packageCount, other.getPackageCount())) && (this.paidAmount == null && other.getPaidAmount() == null || this.paidAmount != null && Arrays.equals(this.paidAmount, other.getPaidAmount())) && (this.paidTransaction == null && other.getPaidTransaction() == null || this.paidTransaction != null && Arrays.equals(this.paidTransaction, other.getPaidTransaction())) && (this.partner == null && other.getPartner() == null || this.partner != null && Arrays.equals(this.partner, other.getPartner())) && (this.partnerContribution == null && other.getPartnerContribution() == null || this.partnerContribution != null && Arrays.equals(this.partnerContribution, other.getPartnerContribution())) && (this.partnerRole == null && other.getPartnerRole() == null || this.partnerRole != null && Arrays.equals(this.partnerRole, other.getPartnerRole())) && (this.partnerTeamMember == null && other.getPartnerTeamMember() == null || this.partnerTeamMember != null && Arrays.equals(this.partnerTeamMember, other.getPartnerTeamMember())) && (this.payingAmount == null && other.getPayingAmount() == null || this.payingAmount != null && Arrays.equals(this.payingAmount, other.getPayingAmount())) && (this.payingTransaction == null && other.getPayingTransaction() == null || this.payingTransaction != null && Arrays.equals(this.payingTransaction, other.getPayingTransaction())) && (this.paymentApproved == null && other.getPaymentApproved() == null || this.paymentApproved != null && Arrays.equals(this.paymentApproved, other.getPaymentApproved())) && (this.paymentEventDate == null && other.getPaymentEventDate() == null || this.paymentEventDate != null && Arrays.equals(this.paymentEventDate, other.getPaymentEventDate())) && (this.paymentEventHoldReason == null && other.getPaymentEventHoldReason() == null || this.paymentEventHoldReason != null && Arrays.equals(this.paymentEventHoldReason, other.getPaymentEventHoldReason())) && (this.paymentEventPurchaseCardUsed == null && other.getPaymentEventPurchaseCardUsed() == null || this.paymentEventPurchaseCardUsed != null && Arrays.equals(this.paymentEventPurchaseCardUsed, other.getPaymentEventPurchaseCardUsed())) && (this.paymentEventPurchaseDataSent == null && other.getPaymentEventPurchaseDataSent() == null || this.paymentEventPurchaseDataSent != null && Arrays.equals(this.paymentEventPurchaseDataSent, other.getPaymentEventPurchaseDataSent())) && (this.paymentEventResult == null && other.getPaymentEventResult() == null || this.paymentEventResult != null && Arrays.equals(this.paymentEventResult, other.getPaymentEventResult())) && (this.paymentEventType == null && other.getPaymentEventType() == null || this.paymentEventType != null && Arrays.equals(this.paymentEventType, other.getPaymentEventType())) && (this.paymentHold == null && other.getPaymentHold() == null || this.paymentHold != null && Arrays.equals(this.paymentHold, other.getPaymentHold())) && (this.paymentMethod == null && other.getPaymentMethod() == null || this.paymentMethod != null && Arrays.equals(this.paymentMethod, other.getPaymentMethod())) && (this.paymentOption == null && other.getPaymentOption() == null || this.paymentOption != null && Arrays.equals(this.paymentOption, other.getPaymentOption())) && (this.payPalPending == null && other.getPayPalPending() == null || this.payPalPending != null && Arrays.equals(this.payPalPending, other.getPayPalPending())) && (this.payPalStatus == null && other.getPayPalStatus() == null || this.payPalStatus != null && Arrays.equals(this.payPalStatus, other.getPayPalStatus())) && (this.payPalTranId == null && other.getPayPalTranId() == null || this.payPalTranId != null && Arrays.equals(this.payPalTranId, other.getPayPalTranId())) && (this.payrollBatch == null && other.getPayrollBatch() == null || this.payrollBatch != null && Arrays.equals(this.payrollBatch, other.getPayrollBatch())) && (this.pnRefNum == null && other.getPnRefNum() == null || this.pnRefNum != null && Arrays.equals(this.pnRefNum, other.getPnRefNum())) && (this.policyViolated == null && other.getPolicyViolated() == null || this.policyViolated != null && Arrays.equals(this.policyViolated, other.getPolicyViolated())) && (this.poRate == null && other.getPoRate() == null || this.poRate != null && Arrays.equals(this.poRate, other.getPoRate())) && (this.posting == null && other.getPosting() == null || this.posting != null && Arrays.equals(this.posting, other.getPosting())) && (this.postingPeriod == null && other.getPostingPeriod() == null || this.postingPeriod != null && Arrays.equals(this.postingPeriod, other.getPostingPeriod())) && (this.priceLevel == null && other.getPriceLevel() == null || this.priceLevel != null && Arrays.equals(this.priceLevel, other.getPriceLevel())) && (this.print == null && other.getPrint() == null || this.print != null && Arrays.equals(this.print, other.getPrint())) && (this.probability == null && other.getProbability() == null || this.probability != null && Arrays.equals(this.probability, other.getProbability())) && (this.projectedAmount == null && other.getProjectedAmount() == null || this.projectedAmount != null && Arrays.equals(this.projectedAmount, other.getProjectedAmount())) && (this.projectTask == null && other.getProjectTask() == null || this.projectTask != null && Arrays.equals(this.projectTask, other.getProjectTask())) && (this.promoCode == null && other.getPromoCode() == null || this.promoCode != null && Arrays.equals(this.promoCode, other.getPromoCode())) && (this.purchaseOrder == null && other.getPurchaseOrder() == null || this.purchaseOrder != null && Arrays.equals(this.purchaseOrder, other.getPurchaseOrder())) && (this.quantity == null && other.getQuantity() == null || this.quantity != null && Arrays.equals(this.quantity, other.getQuantity())) && (this.quantityBilled == null && other.getQuantityBilled() == null || this.quantityBilled != null && Arrays.equals(this.quantityBilled, other.getQuantityBilled())) && (this.quantityCommitted == null && other.getQuantityCommitted() == null || this.quantityCommitted != null && Arrays.equals(this.quantityCommitted, other.getQuantityCommitted())) && (this.quantityPacked == null && other.getQuantityPacked() == null || this.quantityPacked != null && Arrays.equals(this.quantityPacked, other.getQuantityPacked())) && (this.quantityPicked == null && other.getQuantityPicked() == null || this.quantityPicked != null && Arrays.equals(this.quantityPicked, other.getQuantityPicked())) && (this.quantityRevCommitted == null && other.getQuantityRevCommitted() == null || this.quantityRevCommitted != null && Arrays.equals(this.quantityRevCommitted, other.getQuantityRevCommitted())) && (this.quantityShipRecv == null && other.getQuantityShipRecv() == null || this.quantityShipRecv != null && Arrays.equals(this.quantityShipRecv, other.getQuantityShipRecv())) && (this.quantityUom == null && other.getQuantityUom() == null || this.quantityUom != null && Arrays.equals(this.quantityUom, other.getQuantityUom())) && (this.rate == null && other.getRate() == null || this.rate != null && Arrays.equals(this.rate, other.getRate())) && (this.realizedGainPostingTransaction == null && other.getRealizedGainPostingTransaction() == null || this.realizedGainPostingTransaction != null && Arrays.equals(this.realizedGainPostingTransaction, other.getRealizedGainPostingTransaction())) && (this.recognizedRevenue == null && other.getRecognizedRevenue() == null || this.recognizedRevenue != null && Arrays.equals(this.recognizedRevenue, other.getRecognizedRevenue())) && (this.recordType == null && other.getRecordType() == null || this.recordType != null && Arrays.equals(this.recordType, other.getRecordType())) && (this.recurAnnuallyTotal == null && other.getRecurAnnuallyTotal() == null || this.recurAnnuallyTotal != null && Arrays.equals(this.recurAnnuallyTotal, other.getRecurAnnuallyTotal())) && (this.recurMonthlyTotal == null && other.getRecurMonthlyTotal() == null || this.recurMonthlyTotal != null && Arrays.equals(this.recurMonthlyTotal, other.getRecurMonthlyTotal())) && (this.recurQuarterlyTotal == null && other.getRecurQuarterlyTotal() == null || this.recurQuarterlyTotal != null && Arrays.equals(this.recurQuarterlyTotal, other.getRecurQuarterlyTotal())) && (this.recurringBill == null && other.getRecurringBill() == null || this.recurringBill != null && Arrays.equals(this.recurringBill, other.getRecurringBill())) && (this.recurWeeklyTotal == null && other.getRecurWeeklyTotal() == null || this.recurWeeklyTotal != null && Arrays.equals(this.recurWeeklyTotal, other.getRecurWeeklyTotal())) && (this.refNumber == null && other.getRefNumber() == null || this.refNumber != null && Arrays.equals(this.refNumber, other.getRefNumber())) && (this.requestedDate == null && other.getRequestedDate() == null || this.requestedDate != null && Arrays.equals(this.requestedDate, other.getRequestedDate())) && (this.requiredDepositAmount == null && other.getRequiredDepositAmount() == null || this.requiredDepositAmount != null && Arrays.equals(this.requiredDepositAmount, other.getRequiredDepositAmount())) && (this.requiredDepositDue == null && other.getRequiredDepositDue() == null || this.requiredDepositDue != null && Arrays.equals(this.requiredDepositDue, other.getRequiredDepositDue())) && (this.requiredDepositPercentage == null && other.getRequiredDepositPercentage() == null || this.requiredDepositPercentage != null && Arrays.equals(this.requiredDepositPercentage, other.getRequiredDepositPercentage())) && (this.revCommitStatus == null && other.getRevCommitStatus() == null || this.revCommitStatus != null && Arrays.equals(this.revCommitStatus, other.getRevCommitStatus())) && (this.revCommittingTransaction == null && other.getRevCommittingTransaction() == null || this.revCommittingTransaction != null && Arrays.equals(this.revCommittingTransaction, other.getRevCommittingTransaction())) && (this.revenueStatus == null && other.getRevenueStatus() == null || this.revenueStatus != null && Arrays.equals(this.revenueStatus, other.getRevenueStatus())) && (this.reversalDate == null && other.getReversalDate() == null || this.reversalDate != null && Arrays.equals(this.reversalDate, other.getReversalDate())) && (this.reversalNumber == null && other.getReversalNumber() == null || this.reversalNumber != null && Arrays.equals(this.reversalNumber, other.getReversalNumber())) && (this.revRecEndDate == null && other.getRevRecEndDate() == null || this.revRecEndDate != null && Arrays.equals(this.revRecEndDate, other.getRevRecEndDate())) && (this.revRecOnRevCommitment == null && other.getRevRecOnRevCommitment() == null || this.revRecOnRevCommitment != null && Arrays.equals(this.revRecOnRevCommitment, other.getRevRecOnRevCommitment())) && (this.revRecStartDate == null && other.getRevRecStartDate() == null || this.revRecStartDate != null && Arrays.equals(this.revRecStartDate, other.getRevRecStartDate())) && (this.rgAccount == null && other.getRgAccount() == null || this.rgAccount != null && Arrays.equals(this.rgAccount, other.getRgAccount())) && (this.rgAmount == null && other.getRgAmount() == null || this.rgAmount != null && Arrays.equals(this.rgAmount, other.getRgAmount())) && (this.salesEffectiveDate == null && other.getSalesEffectiveDate() == null || this.salesEffectiveDate != null && Arrays.equals(this.salesEffectiveDate, other.getSalesEffectiveDate())) && (this.salesOrder == null && other.getSalesOrder() == null || this.salesOrder != null && Arrays.equals(this.salesOrder, other.getSalesOrder())) && (this.salesRep == null && other.getSalesRep() == null || this.salesRep != null && Arrays.equals(this.salesRep, other.getSalesRep())) && (this.salesTeamMember == null && other.getSalesTeamMember() == null || this.salesTeamMember != null && Arrays.equals(this.salesTeamMember, other.getSalesTeamMember())) && (this.salesTeamRole == null && other.getSalesTeamRole() == null || this.salesTeamRole != null && Arrays.equals(this.salesTeamRole, other.getSalesTeamRole())) && (this.schedulingMethod == null && other.getSchedulingMethod() == null || this.schedulingMethod != null && Arrays.equals(this.schedulingMethod, other.getSchedulingMethod())) && (this.serialNumber == null && other.getSerialNumber() == null || this.serialNumber != null && Arrays.equals(this.serialNumber, other.getSerialNumber())) && (this.serialNumberCost == null && other.getSerialNumberCost() == null || this.serialNumberCost != null && Arrays.equals(this.serialNumberCost, other.getSerialNumberCost())) && (this.serialNumberCostAdjustment == null && other.getSerialNumberCostAdjustment() == null || this.serialNumberCostAdjustment != null && Arrays.equals(this.serialNumberCostAdjustment, other.getSerialNumberCostAdjustment())) && (this.serialNumberQuantity == null && other.getSerialNumberQuantity() == null || this.serialNumberQuantity != null && Arrays.equals(this.serialNumberQuantity, other.getSerialNumberQuantity())) && (this.serialNumbers == null && other.getSerialNumbers() == null || this.serialNumbers != null && Arrays.equals(this.serialNumbers, other.getSerialNumbers())) && (this.shipAddress == null && other.getShipAddress() == null || this.shipAddress != null && Arrays.equals(this.shipAddress, other.getShipAddress())) && (this.shipAddress1 == null && other.getShipAddress1() == null || this.shipAddress1 != null && Arrays.equals(this.shipAddress1, other.getShipAddress1())) && (this.shipAddress2 == null && other.getShipAddress2() == null || this.shipAddress2 != null && Arrays.equals(this.shipAddress2, other.getShipAddress2())) && (this.shipAddress3 == null && other.getShipAddress3() == null || this.shipAddress3 != null && Arrays.equals(this.shipAddress3, other.getShipAddress3())) && (this.shipAddressee == null && other.getShipAddressee() == null || this.shipAddressee != null && Arrays.equals(this.shipAddressee, other.getShipAddressee())) && (this.shipAttention == null && other.getShipAttention() == null || this.shipAttention != null && Arrays.equals(this.shipAttention, other.getShipAttention())) && (this.shipCarrier == null && other.getShipCarrier() == null || this.shipCarrier != null && Arrays.equals(this.shipCarrier, other.getShipCarrier())) && (this.shipCity == null && other.getShipCity() == null || this.shipCity != null && Arrays.equals(this.shipCity, other.getShipCity())) && (this.shipComplete == null && other.getShipComplete() == null || this.shipComplete != null && Arrays.equals(this.shipComplete, other.getShipComplete())) && (this.shipCountry == null && other.getShipCountry() == null || this.shipCountry != null && Arrays.equals(this.shipCountry, other.getShipCountry())) && (this.shipCountryCode == null && other.getShipCountryCode() == null || this.shipCountryCode != null && Arrays.equals(this.shipCountryCode, other.getShipCountryCode())) && (this.shipDate == null && other.getShipDate() == null || this.shipDate != null && Arrays.equals(this.shipDate, other.getShipDate())) && (this.shipGroup == null && other.getShipGroup() == null || this.shipGroup != null && Arrays.equals(this.shipGroup, other.getShipGroup())) && (this.shipMethod == null && other.getShipMethod() == null || this.shipMethod != null && Arrays.equals(this.shipMethod, other.getShipMethod())) && (this.shipPhone == null && other.getShipPhone() == null || this.shipPhone != null && Arrays.equals(this.shipPhone, other.getShipPhone())) && (this.shippingAmount == null && other.getShippingAmount() == null || this.shippingAmount != null && Arrays.equals(this.shippingAmount, other.getShippingAmount())) && (this.shipRecvStatusLine == null && other.getShipRecvStatusLine() == null || this.shipRecvStatusLine != null && Arrays.equals(this.shipRecvStatusLine, other.getShipRecvStatusLine())) && (this.shipState == null && other.getShipState() == null || this.shipState != null && Arrays.equals(this.shipState, other.getShipState())) && (this.shipTo == null && other.getShipTo() == null || this.shipTo != null && Arrays.equals(this.shipTo, other.getShipTo())) && (this.shipZip == null && other.getShipZip() == null || this.shipZip != null && Arrays.equals(this.shipZip, other.getShipZip())) && (this.signedAmount == null && other.getSignedAmount() == null || this.signedAmount != null && Arrays.equals(this.signedAmount, other.getSignedAmount())) && (this.source == null && other.getSource() == null || this.source != null && Arrays.equals(this.source, other.getSource())) && (this.startDate == null && other.getStartDate() == null || this.startDate != null && Arrays.equals(this.startDate, other.getStartDate())) && (this.status == null && other.getStatus() == null || this.status != null && Arrays.equals(this.status, other.getStatus())) && (this.subscription == null && other.getSubscription() == null || this.subscription != null && Arrays.equals(this.subscription, other.getSubscription())) && (this.subscriptionLine == null && other.getSubscriptionLine() == null || this.subscriptionLine != null && Arrays.equals(this.subscriptionLine, other.getSubscriptionLine())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && Arrays.equals(this.subsidiary, other.getSubsidiary())) && (this.subsidiaryTaxRegNum == null && other.getSubsidiaryTaxRegNum() == null || this.subsidiaryTaxRegNum != null && Arrays.equals(this.subsidiaryTaxRegNum, other.getSubsidiaryTaxRegNum())) && (this.taxAmount == null && other.getTaxAmount() == null || this.taxAmount != null && Arrays.equals(this.taxAmount, other.getTaxAmount())) && (this.taxCode == null && other.getTaxCode() == null || this.taxCode != null && Arrays.equals(this.taxCode, other.getTaxCode())) && (this.taxLine == null && other.getTaxLine() == null || this.taxLine != null && Arrays.equals(this.taxLine, other.getTaxLine())) && (this.taxPeriod == null && other.getTaxPeriod() == null || this.taxPeriod != null && Arrays.equals(this.taxPeriod, other.getTaxPeriod())) && (this.taxPointDate == null && other.getTaxPointDate() == null || this.taxPointDate != null && Arrays.equals(this.taxPointDate, other.getTaxPointDate())) && (this.taxTotal == null && other.getTaxTotal() == null || this.taxTotal != null && Arrays.equals(this.taxTotal, other.getTaxTotal())) && (this.termInMonths == null && other.getTermInMonths() == null || this.termInMonths != null && Arrays.equals(this.termInMonths, other.getTermInMonths())) && (this.terms == null && other.getTerms() == null || this.terms != null && Arrays.equals(this.terms, other.getTerms())) && (this.termsOfSale == null && other.getTermsOfSale() == null || this.termsOfSale != null && Arrays.equals(this.termsOfSale, other.getTermsOfSale())) && (this.title == null && other.getTitle() == null || this.title != null && Arrays.equals(this.title, other.getTitle())) && (this.toBeEmailed == null && other.getToBeEmailed() == null || this.toBeEmailed != null && Arrays.equals(this.toBeEmailed, other.getToBeEmailed())) && (this.toBePrinted == null && other.getToBePrinted() == null || this.toBePrinted != null && Arrays.equals(this.toBePrinted, other.getToBePrinted())) && (this.toSubsidiary == null && other.getToSubsidiary() == null || this.toSubsidiary != null && Arrays.equals(this.toSubsidiary, other.getToSubsidiary())) && (this.total == null && other.getTotal() == null || this.total != null && Arrays.equals(this.total, other.getTotal())) && (this.totalCostEstimate == null && other.getTotalCostEstimate() == null || this.totalCostEstimate != null && Arrays.equals(this.totalCostEstimate, other.getTotalCostEstimate())) && (this.trackingNumbers == null && other.getTrackingNumbers() == null || this.trackingNumbers != null && Arrays.equals(this.trackingNumbers, other.getTrackingNumbers())) && (this.tranDate == null && other.getTranDate() == null || this.tranDate != null && Arrays.equals(this.tranDate, other.getTranDate())) && (this.tranEstGrossProfit == null && other.getTranEstGrossProfit() == null || this.tranEstGrossProfit != null && Arrays.equals(this.tranEstGrossProfit, other.getTranEstGrossProfit())) && (this.tranFxEstGrossProfit == null && other.getTranFxEstGrossProfit() == null || this.tranFxEstGrossProfit != null && Arrays.equals(this.tranFxEstGrossProfit, other.getTranFxEstGrossProfit())) && (this.tranId == null && other.getTranId() == null || this.tranId != null && Arrays.equals(this.tranId, other.getTranId())) && (this.tranIsVsoeBundle == null && other.getTranIsVsoeBundle() == null || this.tranIsVsoeBundle != null && Arrays.equals(this.tranIsVsoeBundle, other.getTranIsVsoeBundle())) && (this.transactionDiscount == null && other.getTransactionDiscount() == null || this.transactionDiscount != null && Arrays.equals(this.transactionDiscount, other.getTransactionDiscount())) && (this.transactionLineType == null && other.getTransactionLineType() == null || this.transactionLineType != null && Arrays.equals(this.transactionLineType, other.getTransactionLineType())) && (this.transactionNumber == null && other.getTransactionNumber() == null || this.transactionNumber != null && Arrays.equals(this.transactionNumber, other.getTransactionNumber())) && (this.transferLocation == null && other.getTransferLocation() == null || this.transferLocation != null && Arrays.equals(this.transferLocation, other.getTransferLocation())) && (this.transferOrderItemLine == null && other.getTransferOrderItemLine() == null || this.transferOrderItemLine != null && Arrays.equals(this.transferOrderItemLine, other.getTransferOrderItemLine())) && (this.transferOrderQuantityCommitted == null && other.getTransferOrderQuantityCommitted() == null || this.transferOrderQuantityCommitted != null && Arrays.equals(this.transferOrderQuantityCommitted, other.getTransferOrderQuantityCommitted())) && (this.transferOrderQuantityPacked == null && other.getTransferOrderQuantityPacked() == null || this.transferOrderQuantityPacked != null && Arrays.equals(this.transferOrderQuantityPacked, other.getTransferOrderQuantityPacked())) && (this.transferOrderQuantityPicked == null && other.getTransferOrderQuantityPicked() == null || this.transferOrderQuantityPicked != null && Arrays.equals(this.transferOrderQuantityPicked, other.getTransferOrderQuantityPicked())) && (this.transferOrderQuantityReceived == null && other.getTransferOrderQuantityReceived() == null || this.transferOrderQuantityReceived != null && Arrays.equals(this.transferOrderQuantityReceived, other.getTransferOrderQuantityReceived())) && (this.transferOrderQuantityShipped == null && other.getTransferOrderQuantityShipped() == null || this.transferOrderQuantityShipped != null && Arrays.equals(this.transferOrderQuantityShipped, other.getTransferOrderQuantityShipped())) && (this.type == null && other.getType() == null || this.type != null && Arrays.equals(this.type, other.getType())) && (this.unit == null && other.getUnit() == null || this.unit != null && Arrays.equals(this.unit, other.getUnit())) && (this.unitCostOverride == null && other.getUnitCostOverride() == null || this.unitCostOverride != null && Arrays.equals(this.unitCostOverride, other.getUnitCostOverride())) && (this.vendType == null && other.getVendType() == null || this.vendType != null && Arrays.equals(this.vendType, other.getVendType())) && (this.visibleToCustomer == null && other.getVisibleToCustomer() == null || this.visibleToCustomer != null && Arrays.equals(this.visibleToCustomer, other.getVisibleToCustomer())) && (this.vsoeAllocation == null && other.getVsoeAllocation() == null || this.vsoeAllocation != null && Arrays.equals(this.vsoeAllocation, other.getVsoeAllocation())) && (this.vsoeAmount == null && other.getVsoeAmount() == null || this.vsoeAmount != null && Arrays.equals(this.vsoeAmount, other.getVsoeAmount())) && (this.vsoeDeferral == null && other.getVsoeDeferral() == null || this.vsoeDeferral != null && Arrays.equals(this.vsoeDeferral, other.getVsoeDeferral())) && (this.vsoeDelivered == null && other.getVsoeDelivered() == null || this.vsoeDelivered != null && Arrays.equals(this.vsoeDelivered, other.getVsoeDelivered())) && (this.vsoePermitDiscount == null && other.getVsoePermitDiscount() == null || this.vsoePermitDiscount != null && Arrays.equals(this.vsoePermitDiscount, other.getVsoePermitDiscount())) && (this.vsoePrice == null && other.getVsoePrice() == null || this.vsoePrice != null && Arrays.equals(this.vsoePrice, other.getVsoePrice())) && (this.webSite == null && other.getWebSite() == null || this.webSite != null && Arrays.equals(this.webSite, other.getWebSite())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
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
        if (this.getAbbrev() != null) {
            for (i = 0; i < Array.getLength(this.getAbbrev()); ++i) {
                obj = Array.get(this.getAbbrev(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAccount() != null) {
            for (i = 0; i < Array.getLength(this.getAccount()); ++i) {
                obj = Array.get(this.getAccount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAccountType() != null) {
            for (i = 0; i < Array.getLength(this.getAccountType()); ++i) {
                obj = Array.get(this.getAccountType(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAcctCorpCardExp() != null) {
            for (i = 0; i < Array.getLength(this.getAcctCorpCardExp()); ++i) {
                obj = Array.get(this.getAcctCorpCardExp(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getActualProductionEndDate() != null) {
            for (i = 0; i < Array.getLength(this.getActualProductionEndDate()); ++i) {
                obj = Array.get(this.getActualProductionEndDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getActualProductionStartDate() != null) {
            for (i = 0; i < Array.getLength(this.getActualProductionStartDate()); ++i) {
                obj = Array.get(this.getActualProductionStartDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getActualShipDate() != null) {
            for (i = 0; i < Array.getLength(this.getActualShipDate()); ++i) {
                obj = Array.get(this.getActualShipDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAltSalesAmount() != null) {
            for (i = 0; i < Array.getLength(this.getAltSalesAmount()); ++i) {
                obj = Array.get(this.getAltSalesAmount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAltSalesNetAmount() != null) {
            for (i = 0; i < Array.getLength(this.getAltSalesNetAmount()); ++i) {
                obj = Array.get(this.getAltSalesNetAmount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAmount() != null) {
            for (i = 0; i < Array.getLength(this.getAmount()); ++i) {
                obj = Array.get(this.getAmount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAmountPaid() != null) {
            for (i = 0; i < Array.getLength(this.getAmountPaid()); ++i) {
                obj = Array.get(this.getAmountPaid(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAmountRemaining() != null) {
            for (i = 0; i < Array.getLength(this.getAmountRemaining()); ++i) {
                obj = Array.get(this.getAmountRemaining(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAmountUnbilled() != null) {
            for (i = 0; i < Array.getLength(this.getAmountUnbilled()); ++i) {
                obj = Array.get(this.getAmountUnbilled(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAppliedToForeignAmount() != null) {
            for (i = 0; i < Array.getLength(this.getAppliedToForeignAmount()); ++i) {
                obj = Array.get(this.getAppliedToForeignAmount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAppliedToIsFxVariance() != null) {
            for (i = 0; i < Array.getLength(this.getAppliedToIsFxVariance()); ++i) {
                obj = Array.get(this.getAppliedToIsFxVariance(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAppliedToLinkAmount() != null) {
            for (i = 0; i < Array.getLength(this.getAppliedToLinkAmount()); ++i) {
                obj = Array.get(this.getAppliedToLinkAmount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAppliedToLinkType() != null) {
            for (i = 0; i < Array.getLength(this.getAppliedToLinkType()); ++i) {
                obj = Array.get(this.getAppliedToLinkType(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAppliedToTransaction() != null) {
            for (i = 0; i < Array.getLength(this.getAppliedToTransaction()); ++i) {
                obj = Array.get(this.getAppliedToTransaction(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getApplyingForeignAmount() != null) {
            for (i = 0; i < Array.getLength(this.getApplyingForeignAmount()); ++i) {
                obj = Array.get(this.getApplyingForeignAmount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getApplyingIsFxVariance() != null) {
            for (i = 0; i < Array.getLength(this.getApplyingIsFxVariance()); ++i) {
                obj = Array.get(this.getApplyingIsFxVariance(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getApplyingLinkAmount() != null) {
            for (i = 0; i < Array.getLength(this.getApplyingLinkAmount()); ++i) {
                obj = Array.get(this.getApplyingLinkAmount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getApplyingLinkType() != null) {
            for (i = 0; i < Array.getLength(this.getApplyingLinkType()); ++i) {
                obj = Array.get(this.getApplyingLinkType(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getApplyingTransaction() != null) {
            for (i = 0; i < Array.getLength(this.getApplyingTransaction()); ++i) {
                obj = Array.get(this.getApplyingTransaction(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getApprovalStatus() != null) {
            for (i = 0; i < Array.getLength(this.getApprovalStatus()); ++i) {
                obj = Array.get(this.getApprovalStatus(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAuthCode() != null) {
            for (i = 0; i < Array.getLength(this.getAuthCode()); ++i) {
                obj = Array.get(this.getAuthCode(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAutoCalculateLag() != null) {
            for (i = 0; i < Array.getLength(this.getAutoCalculateLag()); ++i) {
                obj = Array.get(this.getAutoCalculateLag(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAvsStreetMatch() != null) {
            for (i = 0; i < Array.getLength(this.getAvsStreetMatch()); ++i) {
                obj = Array.get(this.getAvsStreetMatch(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAvsZipMatch() != null) {
            for (i = 0; i < Array.getLength(this.getAvsZipMatch()); ++i) {
                obj = Array.get(this.getAvsZipMatch(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBillable() != null) {
            for (i = 0; i < Array.getLength(this.getBillable()); ++i) {
                obj = Array.get(this.getBillable(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBillAddress() != null) {
            for (i = 0; i < Array.getLength(this.getBillAddress()); ++i) {
                obj = Array.get(this.getBillAddress(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBillAddress1() != null) {
            for (i = 0; i < Array.getLength(this.getBillAddress1()); ++i) {
                obj = Array.get(this.getBillAddress1(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBillAddress2() != null) {
            for (i = 0; i < Array.getLength(this.getBillAddress2()); ++i) {
                obj = Array.get(this.getBillAddress2(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBillAddress3() != null) {
            for (i = 0; i < Array.getLength(this.getBillAddress3()); ++i) {
                obj = Array.get(this.getBillAddress3(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBillAddressee() != null) {
            for (i = 0; i < Array.getLength(this.getBillAddressee()); ++i) {
                obj = Array.get(this.getBillAddressee(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBillAttention() != null) {
            for (i = 0; i < Array.getLength(this.getBillAttention()); ++i) {
                obj = Array.get(this.getBillAttention(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBillCity() != null) {
            for (i = 0; i < Array.getLength(this.getBillCity()); ++i) {
                obj = Array.get(this.getBillCity(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBillCountry() != null) {
            for (i = 0; i < Array.getLength(this.getBillCountry()); ++i) {
                obj = Array.get(this.getBillCountry(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBillCountryCode() != null) {
            for (i = 0; i < Array.getLength(this.getBillCountryCode()); ++i) {
                obj = Array.get(this.getBillCountryCode(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBilledDate() != null) {
            for (i = 0; i < Array.getLength(this.getBilledDate()); ++i) {
                obj = Array.get(this.getBilledDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBillingAccount() != null) {
            for (i = 0; i < Array.getLength(this.getBillingAccount()); ++i) {
                obj = Array.get(this.getBillingAccount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBillingAmount() != null) {
            for (i = 0; i < Array.getLength(this.getBillingAmount()); ++i) {
                obj = Array.get(this.getBillingAmount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBillingSchedule() != null) {
            for (i = 0; i < Array.getLength(this.getBillingSchedule()); ++i) {
                obj = Array.get(this.getBillingSchedule(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBillingTransaction() != null) {
            for (i = 0; i < Array.getLength(this.getBillingTransaction()); ++i) {
                obj = Array.get(this.getBillingTransaction(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBillPhone() != null) {
            for (i = 0; i < Array.getLength(this.getBillPhone()); ++i) {
                obj = Array.get(this.getBillPhone(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBillState() != null) {
            for (i = 0; i < Array.getLength(this.getBillState()); ++i) {
                obj = Array.get(this.getBillState(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBillVarianceStatus() != null) {
            for (i = 0; i < Array.getLength(this.getBillVarianceStatus()); ++i) {
                obj = Array.get(this.getBillVarianceStatus(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBillZip() != null) {
            for (i = 0; i < Array.getLength(this.getBillZip()); ++i) {
                obj = Array.get(this.getBillZip(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBinNumber() != null) {
            for (i = 0; i < Array.getLength(this.getBinNumber()); ++i) {
                obj = Array.get(this.getBinNumber(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBinNumberQuantity() != null) {
            for (i = 0; i < Array.getLength(this.getBinNumberQuantity()); ++i) {
                obj = Array.get(this.getBinNumberQuantity(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBomQuantity() != null) {
            for (i = 0; i < Array.getLength(this.getBomQuantity()); ++i) {
                obj = Array.get(this.getBomQuantity(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBuildEntireAssembly() != null) {
            for (i = 0; i < Array.getLength(this.getBuildEntireAssembly()); ++i) {
                obj = Array.get(this.getBuildEntireAssembly(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBuildVariance() != null) {
            for (i = 0; i < Array.getLength(this.getBuildVariance()); ++i) {
                obj = Array.get(this.getBuildVariance(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBuilt() != null) {
            for (i = 0; i < Array.getLength(this.getBuilt()); ++i) {
                obj = Array.get(this.getBuilt(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCanHaveStackablePromotions() != null) {
            for (i = 0; i < Array.getLength(this.getCanHaveStackablePromotions()); ++i) {
                obj = Array.get(this.getCanHaveStackablePromotions(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCatchUpPeriod() != null) {
            for (i = 0; i < Array.getLength(this.getCatchUpPeriod()); ++i) {
                obj = Array.get(this.getCatchUpPeriod(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCcCustomerCode() != null) {
            for (i = 0; i < Array.getLength(this.getCcCustomerCode()); ++i) {
                obj = Array.get(this.getCcCustomerCode(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCcExpDate() != null) {
            for (i = 0; i < Array.getLength(this.getCcExpDate()); ++i) {
                obj = Array.get(this.getCcExpDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCcHolderName() != null) {
            for (i = 0; i < Array.getLength(this.getCcHolderName()); ++i) {
                obj = Array.get(this.getCcHolderName(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCcNumber() != null) {
            for (i = 0; i < Array.getLength(this.getCcNumber()); ++i) {
                obj = Array.get(this.getCcNumber(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCcStreet() != null) {
            for (i = 0; i < Array.getLength(this.getCcStreet()); ++i) {
                obj = Array.get(this.getCcStreet(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCcZipCode() != null) {
            for (i = 0; i < Array.getLength(this.getCcZipCode()); ++i) {
                obj = Array.get(this.getCcZipCode(), i);
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
        if (this.getCleared() != null) {
            for (i = 0; i < Array.getLength(this.getCleared()); ++i) {
                obj = Array.get(this.getCleared(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getClosed() != null) {
            for (i = 0; i < Array.getLength(this.getClosed()); ++i) {
                obj = Array.get(this.getClosed(), i);
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
        if (this.getCogsAmount() != null) {
            for (i = 0; i < Array.getLength(this.getCogsAmount()); ++i) {
                obj = Array.get(this.getCogsAmount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCommissionEffectiveDate() != null) {
            for (i = 0; i < Array.getLength(this.getCommissionEffectiveDate()); ++i) {
                obj = Array.get(this.getCommissionEffectiveDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCommit() != null) {
            for (i = 0; i < Array.getLength(this.getCommit()); ++i) {
                obj = Array.get(this.getCommit(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getComponentYield() != null) {
            for (i = 0; i < Array.getLength(this.getComponentYield()); ++i) {
                obj = Array.get(this.getComponentYield(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getConfirmationNumber() != null) {
            for (i = 0; i < Array.getLength(this.getConfirmationNumber()); ++i) {
                obj = Array.get(this.getConfirmationNumber(), i);
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
        if (this.getCostComponentAmount() != null) {
            for (i = 0; i < Array.getLength(this.getCostComponentAmount()); ++i) {
                obj = Array.get(this.getCostComponentAmount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCostComponentCategory() != null) {
            for (i = 0; i < Array.getLength(this.getCostComponentCategory()); ++i) {
                obj = Array.get(this.getCostComponentCategory(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCostComponentItem() != null) {
            for (i = 0; i < Array.getLength(this.getCostComponentItem()); ++i) {
                obj = Array.get(this.getCostComponentItem(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCostComponentQuantity() != null) {
            for (i = 0; i < Array.getLength(this.getCostComponentQuantity()); ++i) {
                obj = Array.get(this.getCostComponentQuantity(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCostComponentStandardCost() != null) {
            for (i = 0; i < Array.getLength(this.getCostComponentStandardCost()); ++i) {
                obj = Array.get(this.getCostComponentStandardCost(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCostEstimate() != null) {
            for (i = 0; i < Array.getLength(this.getCostEstimate()); ++i) {
                obj = Array.get(this.getCostEstimate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCostEstimateRate() != null) {
            for (i = 0; i < Array.getLength(this.getCostEstimateRate()); ++i) {
                obj = Array.get(this.getCostEstimateRate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCostEstimateType() != null) {
            for (i = 0; i < Array.getLength(this.getCostEstimateType()); ++i) {
                obj = Array.get(this.getCostEstimateType(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCreatedBy() != null) {
            for (i = 0; i < Array.getLength(this.getCreatedBy()); ++i) {
                obj = Array.get(this.getCreatedBy(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCreatedFrom() != null) {
            for (i = 0; i < Array.getLength(this.getCreatedFrom()); ++i) {
                obj = Array.get(this.getCreatedFrom(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCreditAmount() != null) {
            for (i = 0; i < Array.getLength(this.getCreditAmount()); ++i) {
                obj = Array.get(this.getCreditAmount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCscMatch() != null) {
            for (i = 0; i < Array.getLength(this.getCscMatch()); ++i) {
                obj = Array.get(this.getCscMatch(), i);
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
        if (this.getCustomForm() != null) {
            for (i = 0; i < Array.getLength(this.getCustomForm()); ++i) {
                obj = Array.get(this.getCustomForm(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCustomGL() != null) {
            for (i = 0; i < Array.getLength(this.getCustomGL()); ++i) {
                obj = Array.get(this.getCustomGL(), i);
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
        if (this.getDaysOverdue() != null) {
            for (i = 0; i < Array.getLength(this.getDaysOverdue()); ++i) {
                obj = Array.get(this.getDaysOverdue(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDebitAmount() != null) {
            for (i = 0; i < Array.getLength(this.getDebitAmount()); ++i) {
                obj = Array.get(this.getDebitAmount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDeferredRevenue() != null) {
            for (i = 0; i < Array.getLength(this.getDeferredRevenue()); ++i) {
                obj = Array.get(this.getDeferredRevenue(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDeferRevRec() != null) {
            for (i = 0; i < Array.getLength(this.getDeferRevRec()); ++i) {
                obj = Array.get(this.getDeferRevRec(), i);
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
        if (this.getDepositDate() != null) {
            for (i = 0; i < Array.getLength(this.getDepositDate()); ++i) {
                obj = Array.get(this.getDepositDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDepositTransaction() != null) {
            for (i = 0; i < Array.getLength(this.getDepositTransaction()); ++i) {
                obj = Array.get(this.getDepositTransaction(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDiscountAmount() != null) {
            for (i = 0; i < Array.getLength(this.getDiscountAmount()); ++i) {
                obj = Array.get(this.getDiscountAmount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDocUnit() != null) {
            for (i = 0; i < Array.getLength(this.getDocUnit()); ++i) {
                obj = Array.get(this.getDocUnit(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDrAccount() != null) {
            for (i = 0; i < Array.getLength(this.getDrAccount()); ++i) {
                obj = Array.get(this.getDrAccount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDueDate() != null) {
            for (i = 0; i < Array.getLength(this.getDueDate()); ++i) {
                obj = Array.get(this.getDueDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getEffectiveRate() != null) {
            for (i = 0; i < Array.getLength(this.getEffectiveRate()); ++i) {
                obj = Array.get(this.getEffectiveRate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getEmail() != null) {
            for (i = 0; i < Array.getLength(this.getEmail()); ++i) {
                obj = Array.get(this.getEmail(), i);
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
        if (this.getEstGrossProfit() != null) {
            for (i = 0; i < Array.getLength(this.getEstGrossProfit()); ++i) {
                obj = Array.get(this.getEstGrossProfit(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getEstGrossProfitPct() != null) {
            for (i = 0; i < Array.getLength(this.getEstGrossProfitPct()); ++i) {
                obj = Array.get(this.getEstGrossProfitPct(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getEstGrossProfitPercent() != null) {
            for (i = 0; i < Array.getLength(this.getEstGrossProfitPercent()); ++i) {
                obj = Array.get(this.getEstGrossProfitPercent(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getExchangeRate() != null) {
            for (i = 0; i < Array.getLength(this.getExchangeRate()); ++i) {
                obj = Array.get(this.getExchangeRate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getExcludeCommission() != null) {
            for (i = 0; i < Array.getLength(this.getExcludeCommission()); ++i) {
                obj = Array.get(this.getExcludeCommission(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getExcludeFromRateRequest() != null) {
            for (i = 0; i < Array.getLength(this.getExcludeFromRateRequest()); ++i) {
                obj = Array.get(this.getExcludeFromRateRequest(), i);
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
        if (this.getExpectedReceiptDate() != null) {
            for (i = 0; i < Array.getLength(this.getExpectedReceiptDate()); ++i) {
                obj = Array.get(this.getExpectedReceiptDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getExpenseCategory() != null) {
            for (i = 0; i < Array.getLength(this.getExpenseCategory()); ++i) {
                obj = Array.get(this.getExpenseCategory(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getExpenseDate() != null) {
            for (i = 0; i < Array.getLength(this.getExpenseDate()); ++i) {
                obj = Array.get(this.getExpenseDate(), i);
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
        if (this.getFirmed() != null) {
            for (i = 0; i < Array.getLength(this.getFirmed()); ++i) {
                obj = Array.get(this.getFirmed(), i);
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
        if (this.getFulfillingTransaction() != null) {
            for (i = 0; i < Array.getLength(this.getFulfillingTransaction()); ++i) {
                obj = Array.get(this.getFulfillingTransaction(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getFxAccount() != null) {
            for (i = 0; i < Array.getLength(this.getFxAccount()); ++i) {
                obj = Array.get(this.getFxAccount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getFxAmount() != null) {
            for (i = 0; i < Array.getLength(this.getFxAmount()); ++i) {
                obj = Array.get(this.getFxAmount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getFxCostEstimate() != null) {
            for (i = 0; i < Array.getLength(this.getFxCostEstimate()); ++i) {
                obj = Array.get(this.getFxCostEstimate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getFxCostEstimateRate() != null) {
            for (i = 0; i < Array.getLength(this.getFxCostEstimateRate()); ++i) {
                obj = Array.get(this.getFxCostEstimateRate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getFxEstGrossProfit() != null) {
            for (i = 0; i < Array.getLength(this.getFxEstGrossProfit()); ++i) {
                obj = Array.get(this.getFxEstGrossProfit(), i);
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
        if (this.getFxVsoeAllocation() != null) {
            for (i = 0; i < Array.getLength(this.getFxVsoeAllocation()); ++i) {
                obj = Array.get(this.getFxVsoeAllocation(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getFxVsoeAmount() != null) {
            for (i = 0; i < Array.getLength(this.getFxVsoeAmount()); ++i) {
                obj = Array.get(this.getFxVsoeAmount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getFxVsoePrice() != null) {
            for (i = 0; i < Array.getLength(this.getFxVsoePrice()); ++i) {
                obj = Array.get(this.getFxVsoePrice(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getGcoAvailabelToCharge() != null) {
            for (i = 0; i < Array.getLength(this.getGcoAvailabelToCharge()); ++i) {
                obj = Array.get(this.getGcoAvailabelToCharge(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getGcoAvailableToRefund() != null) {
            for (i = 0; i < Array.getLength(this.getGcoAvailableToRefund()); ++i) {
                obj = Array.get(this.getGcoAvailableToRefund(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getGcoAvsStreetMatch() != null) {
            for (i = 0; i < Array.getLength(this.getGcoAvsStreetMatch()); ++i) {
                obj = Array.get(this.getGcoAvsStreetMatch(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getGcoAvsZipMatch() != null) {
            for (i = 0; i < Array.getLength(this.getGcoAvsZipMatch()); ++i) {
                obj = Array.get(this.getGcoAvsZipMatch(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getGcoBuyerAccountAge() != null) {
            for (i = 0; i < Array.getLength(this.getGcoBuyerAccountAge()); ++i) {
                obj = Array.get(this.getGcoBuyerAccountAge(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getGcoBuyerIp() != null) {
            for (i = 0; i < Array.getLength(this.getGcoBuyerIp()); ++i) {
                obj = Array.get(this.getGcoBuyerIp(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getGcoChargeAmount() != null) {
            for (i = 0; i < Array.getLength(this.getGcoChargeAmount()); ++i) {
                obj = Array.get(this.getGcoChargeAmount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getGcoChargebackAmount() != null) {
            for (i = 0; i < Array.getLength(this.getGcoChargebackAmount()); ++i) {
                obj = Array.get(this.getGcoChargebackAmount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getGcoConfirmedChargedTotal() != null) {
            for (i = 0; i < Array.getLength(this.getGcoConfirmedChargedTotal()); ++i) {
                obj = Array.get(this.getGcoConfirmedChargedTotal(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getGcoConfirmedRefundedTotal() != null) {
            for (i = 0; i < Array.getLength(this.getGcoConfirmedRefundedTotal()); ++i) {
                obj = Array.get(this.getGcoConfirmedRefundedTotal(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getGcoCreditcardNumber() != null) {
            for (i = 0; i < Array.getLength(this.getGcoCreditcardNumber()); ++i) {
                obj = Array.get(this.getGcoCreditcardNumber(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getGcoCscMatch() != null) {
            for (i = 0; i < Array.getLength(this.getGcoCscMatch()); ++i) {
                obj = Array.get(this.getGcoCscMatch(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getGcoFinancialState() != null) {
            for (i = 0; i < Array.getLength(this.getGcoFinancialState()); ++i) {
                obj = Array.get(this.getGcoFinancialState(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getGcoFulfillmentState() != null) {
            for (i = 0; i < Array.getLength(this.getGcoFulfillmentState()); ++i) {
                obj = Array.get(this.getGcoFulfillmentState(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getGcoOrderId() != null) {
            for (i = 0; i < Array.getLength(this.getGcoOrderId()); ++i) {
                obj = Array.get(this.getGcoOrderId(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getGcoOrderTotal() != null) {
            for (i = 0; i < Array.getLength(this.getGcoOrderTotal()); ++i) {
                obj = Array.get(this.getGcoOrderTotal(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getGcoPromotionAmount() != null) {
            for (i = 0; i < Array.getLength(this.getGcoPromotionAmount()); ++i) {
                obj = Array.get(this.getGcoPromotionAmount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getGcoPromotionName() != null) {
            for (i = 0; i < Array.getLength(this.getGcoPromotionName()); ++i) {
                obj = Array.get(this.getGcoPromotionName(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getGcoRefundAmount() != null) {
            for (i = 0; i < Array.getLength(this.getGcoRefundAmount()); ++i) {
                obj = Array.get(this.getGcoRefundAmount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getGcoShippingTotal() != null) {
            for (i = 0; i < Array.getLength(this.getGcoShippingTotal()); ++i) {
                obj = Array.get(this.getGcoShippingTotal(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getGcoStateChangedDetail() != null) {
            for (i = 0; i < Array.getLength(this.getGcoStateChangedDetail()); ++i) {
                obj = Array.get(this.getGcoStateChangedDetail(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getGiftCert() != null) {
            for (i = 0; i < Array.getLength(this.getGiftCert()); ++i) {
                obj = Array.get(this.getGiftCert(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getGrossAmount() != null) {
            for (i = 0; i < Array.getLength(this.getGrossAmount()); ++i) {
                obj = Array.get(this.getGrossAmount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIncludeInForecast() != null) {
            for (i = 0; i < Array.getLength(this.getIncludeInForecast()); ++i) {
                obj = Array.get(this.getIncludeInForecast(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIncoterm() != null) {
            for (i = 0; i < Array.getLength(this.getIncoterm()); ++i) {
                obj = Array.get(this.getIncoterm(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIntercoStatus() != null) {
            for (i = 0; i < Array.getLength(this.getIntercoStatus()); ++i) {
                obj = Array.get(this.getIntercoStatus(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIntercoTransaction() != null) {
            for (i = 0; i < Array.getLength(this.getIntercoTransaction()); ++i) {
                obj = Array.get(this.getIntercoTransaction(), i);
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
        if (this.getInventoryLocation() != null) {
            for (i = 0; i < Array.getLength(this.getInventoryLocation()); ++i) {
                obj = Array.get(this.getInventoryLocation(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getInventorySubsidiary() != null) {
            for (i = 0; i < Array.getLength(this.getInventorySubsidiary()); ++i) {
                obj = Array.get(this.getInventorySubsidiary(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getInVsoeBundle() != null) {
            for (i = 0; i < Array.getLength(this.getInVsoeBundle()); ++i) {
                obj = Array.get(this.getInVsoeBundle(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsAllocation() != null) {
            for (i = 0; i < Array.getLength(this.getIsAllocation()); ++i) {
                obj = Array.get(this.getIsAllocation(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsBackflush() != null) {
            for (i = 0; i < Array.getLength(this.getIsBackflush()); ++i) {
                obj = Array.get(this.getIsBackflush(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsGcoChargeback() != null) {
            for (i = 0; i < Array.getLength(this.getIsGcoChargeback()); ++i) {
                obj = Array.get(this.getIsGcoChargeback(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsGcoChargeConfirmed() != null) {
            for (i = 0; i < Array.getLength(this.getIsGcoChargeConfirmed()); ++i) {
                obj = Array.get(this.getIsGcoChargeConfirmed(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsGcoPaymentGuaranteed() != null) {
            for (i = 0; i < Array.getLength(this.getIsGcoPaymentGuaranteed()); ++i) {
                obj = Array.get(this.getIsGcoPaymentGuaranteed(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsGcoRefundConfirmed() != null) {
            for (i = 0; i < Array.getLength(this.getIsGcoRefundConfirmed()); ++i) {
                obj = Array.get(this.getIsGcoRefundConfirmed(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsInsideDelivery() != null) {
            for (i = 0; i < Array.getLength(this.getIsInsideDelivery()); ++i) {
                obj = Array.get(this.getIsInsideDelivery(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsInsidePickup() != null) {
            for (i = 0; i < Array.getLength(this.getIsInsidePickup()); ++i) {
                obj = Array.get(this.getIsInsidePickup(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsIntercompanyAdjustment() != null) {
            for (i = 0; i < Array.getLength(this.getIsIntercompanyAdjustment()); ++i) {
                obj = Array.get(this.getIsIntercompanyAdjustment(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsInTransitPayment() != null) {
            for (i = 0; i < Array.getLength(this.getIsInTransitPayment()); ++i) {
                obj = Array.get(this.getIsInTransitPayment(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsMultiShipTo() != null) {
            for (i = 0; i < Array.getLength(this.getIsMultiShipTo()); ++i) {
                obj = Array.get(this.getIsMultiShipTo(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsReversal() != null) {
            for (i = 0; i < Array.getLength(this.getIsReversal()); ++i) {
                obj = Array.get(this.getIsReversal(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsRevRecTransaction() != null) {
            for (i = 0; i < Array.getLength(this.getIsRevRecTransaction()); ++i) {
                obj = Array.get(this.getIsRevRecTransaction(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsScrap() != null) {
            for (i = 0; i < Array.getLength(this.getIsScrap()); ++i) {
                obj = Array.get(this.getIsScrap(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsShipAddress() != null) {
            for (i = 0; i < Array.getLength(this.getIsShipAddress()); ++i) {
                obj = Array.get(this.getIsShipAddress(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsTransferPriceCosting() != null) {
            for (i = 0; i < Array.getLength(this.getIsTransferPriceCosting()); ++i) {
                obj = Array.get(this.getIsTransferPriceCosting(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsWip() != null) {
            for (i = 0; i < Array.getLength(this.getIsWip()); ++i) {
                obj = Array.get(this.getIsWip(), i);
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
        if (this.getItemFulfillmentChoice() != null) {
            for (i = 0; i < Array.getLength(this.getItemFulfillmentChoice()); ++i) {
                obj = Array.get(this.getItemFulfillmentChoice(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getItemRevision() != null) {
            for (i = 0; i < Array.getLength(this.getItemRevision()); ++i) {
                obj = Array.get(this.getItemRevision(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLandedCostPerLine() != null) {
            for (i = 0; i < Array.getLength(this.getLandedCostPerLine()); ++i) {
                obj = Array.get(this.getLandedCostPerLine(), i);
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
        if (this.getLine() != null) {
            for (i = 0; i < Array.getLength(this.getLine()); ++i) {
                obj = Array.get(this.getLine(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLineSequenceNumber() != null) {
            for (i = 0; i < Array.getLength(this.getLineSequenceNumber()); ++i) {
                obj = Array.get(this.getLineSequenceNumber(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLineUniqueKey() != null) {
            for (i = 0; i < Array.getLength(this.getLineUniqueKey()); ++i) {
                obj = Array.get(this.getLineUniqueKey(), i);
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
        if (this.getLocationAutoAssigned() != null) {
            for (i = 0; i < Array.getLength(this.getLocationAutoAssigned()); ++i) {
                obj = Array.get(this.getLocationAutoAssigned(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getMainLine() != null) {
            for (i = 0; i < Array.getLength(this.getMainLine()); ++i) {
                obj = Array.get(this.getMainLine(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getMainName() != null) {
            for (i = 0; i < Array.getLength(this.getMainName()); ++i) {
                obj = Array.get(this.getMainName(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getManufacturingRouting() != null) {
            for (i = 0; i < Array.getLength(this.getManufacturingRouting()); ++i) {
                obj = Array.get(this.getManufacturingRouting(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getMatchBillToReceipt() != null) {
            for (i = 0; i < Array.getLength(this.getMatchBillToReceipt()); ++i) {
                obj = Array.get(this.getMatchBillToReceipt(), i);
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
        if (this.getMemoMain() != null) {
            for (i = 0; i < Array.getLength(this.getMemoMain()); ++i) {
                obj = Array.get(this.getMemoMain(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getMemorized() != null) {
            for (i = 0; i < Array.getLength(this.getMemorized()); ++i) {
                obj = Array.get(this.getMemorized(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getMerchantAccount() != null) {
            for (i = 0; i < Array.getLength(this.getMerchantAccount()); ++i) {
                obj = Array.get(this.getMerchantAccount(), i);
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
        if (this.getMultiSubsidiary() != null) {
            for (i = 0; i < Array.getLength(this.getMultiSubsidiary()); ++i) {
                obj = Array.get(this.getMultiSubsidiary(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getNetAmount() != null) {
            for (i = 0; i < Array.getLength(this.getNetAmount()); ++i) {
                obj = Array.get(this.getNetAmount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getNetAmountNoTax() != null) {
            for (i = 0; i < Array.getLength(this.getNetAmountNoTax()); ++i) {
                obj = Array.get(this.getNetAmountNoTax(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getNextApprover() != null) {
            for (i = 0; i < Array.getLength(this.getNextApprover()); ++i) {
                obj = Array.get(this.getNextApprover(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getNextBillDate() != null) {
            for (i = 0; i < Array.getLength(this.getNextBillDate()); ++i) {
                obj = Array.get(this.getNextBillDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getNexus() != null) {
            for (i = 0; i < Array.getLength(this.getNexus()); ++i) {
                obj = Array.get(this.getNexus(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getNoAutoAssignLocation() != null) {
            for (i = 0; i < Array.getLength(this.getNoAutoAssignLocation()); ++i) {
                obj = Array.get(this.getNoAutoAssignLocation(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getNonReimbursable() != null) {
            for (i = 0; i < Array.getLength(this.getNonReimbursable()); ++i) {
                obj = Array.get(this.getNonReimbursable(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getOneTimeTotal() != null) {
            for (i = 0; i < Array.getLength(this.getOneTimeTotal()); ++i) {
                obj = Array.get(this.getOneTimeTotal(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getOpportunity() != null) {
            for (i = 0; i < Array.getLength(this.getOpportunity()); ++i) {
                obj = Array.get(this.getOpportunity(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getOptions() != null) {
            for (i = 0; i < Array.getLength(this.getOptions()); ++i) {
                obj = Array.get(this.getOptions(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getOrderAllocationStrategy() != null) {
            for (i = 0; i < Array.getLength(this.getOrderAllocationStrategy()); ++i) {
                obj = Array.get(this.getOrderAllocationStrategy(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getOrderPriority() != null) {
            for (i = 0; i < Array.getLength(this.getOrderPriority()); ++i) {
                obj = Array.get(this.getOrderPriority(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getOriginator() != null) {
            for (i = 0; i < Array.getLength(this.getOriginator()); ++i) {
                obj = Array.get(this.getOriginator(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getOtherRefNum() != null) {
            for (i = 0; i < Array.getLength(this.getOtherRefNum()); ++i) {
                obj = Array.get(this.getOtherRefNum(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getOverheadParentItem() != null) {
            for (i = 0; i < Array.getLength(this.getOverheadParentItem()); ++i) {
                obj = Array.get(this.getOverheadParentItem(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getOverrideInstallments() != null) {
            for (i = 0; i < Array.getLength(this.getOverrideInstallments()); ++i) {
                obj = Array.get(this.getOverrideInstallments(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPackageCount() != null) {
            for (i = 0; i < Array.getLength(this.getPackageCount()); ++i) {
                obj = Array.get(this.getPackageCount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPaidAmount() != null) {
            for (i = 0; i < Array.getLength(this.getPaidAmount()); ++i) {
                obj = Array.get(this.getPaidAmount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPaidTransaction() != null) {
            for (i = 0; i < Array.getLength(this.getPaidTransaction()); ++i) {
                obj = Array.get(this.getPaidTransaction(), i);
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
        if (this.getPayingAmount() != null) {
            for (i = 0; i < Array.getLength(this.getPayingAmount()); ++i) {
                obj = Array.get(this.getPayingAmount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPayingTransaction() != null) {
            for (i = 0; i < Array.getLength(this.getPayingTransaction()); ++i) {
                obj = Array.get(this.getPayingTransaction(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPaymentApproved() != null) {
            for (i = 0; i < Array.getLength(this.getPaymentApproved()); ++i) {
                obj = Array.get(this.getPaymentApproved(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPaymentEventDate() != null) {
            for (i = 0; i < Array.getLength(this.getPaymentEventDate()); ++i) {
                obj = Array.get(this.getPaymentEventDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPaymentEventHoldReason() != null) {
            for (i = 0; i < Array.getLength(this.getPaymentEventHoldReason()); ++i) {
                obj = Array.get(this.getPaymentEventHoldReason(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPaymentEventPurchaseCardUsed() != null) {
            for (i = 0; i < Array.getLength(this.getPaymentEventPurchaseCardUsed()); ++i) {
                obj = Array.get(this.getPaymentEventPurchaseCardUsed(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPaymentEventPurchaseDataSent() != null) {
            for (i = 0; i < Array.getLength(this.getPaymentEventPurchaseDataSent()); ++i) {
                obj = Array.get(this.getPaymentEventPurchaseDataSent(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPaymentEventResult() != null) {
            for (i = 0; i < Array.getLength(this.getPaymentEventResult()); ++i) {
                obj = Array.get(this.getPaymentEventResult(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPaymentEventType() != null) {
            for (i = 0; i < Array.getLength(this.getPaymentEventType()); ++i) {
                obj = Array.get(this.getPaymentEventType(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPaymentHold() != null) {
            for (i = 0; i < Array.getLength(this.getPaymentHold()); ++i) {
                obj = Array.get(this.getPaymentHold(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPaymentMethod() != null) {
            for (i = 0; i < Array.getLength(this.getPaymentMethod()); ++i) {
                obj = Array.get(this.getPaymentMethod(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPaymentOption() != null) {
            for (i = 0; i < Array.getLength(this.getPaymentOption()); ++i) {
                obj = Array.get(this.getPaymentOption(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPayPalPending() != null) {
            for (i = 0; i < Array.getLength(this.getPayPalPending()); ++i) {
                obj = Array.get(this.getPayPalPending(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPayPalStatus() != null) {
            for (i = 0; i < Array.getLength(this.getPayPalStatus()); ++i) {
                obj = Array.get(this.getPayPalStatus(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPayPalTranId() != null) {
            for (i = 0; i < Array.getLength(this.getPayPalTranId()); ++i) {
                obj = Array.get(this.getPayPalTranId(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPayrollBatch() != null) {
            for (i = 0; i < Array.getLength(this.getPayrollBatch()); ++i) {
                obj = Array.get(this.getPayrollBatch(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPnRefNum() != null) {
            for (i = 0; i < Array.getLength(this.getPnRefNum()); ++i) {
                obj = Array.get(this.getPnRefNum(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPolicyViolated() != null) {
            for (i = 0; i < Array.getLength(this.getPolicyViolated()); ++i) {
                obj = Array.get(this.getPolicyViolated(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPoRate() != null) {
            for (i = 0; i < Array.getLength(this.getPoRate()); ++i) {
                obj = Array.get(this.getPoRate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPosting() != null) {
            for (i = 0; i < Array.getLength(this.getPosting()); ++i) {
                obj = Array.get(this.getPosting(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPostingPeriod() != null) {
            for (i = 0; i < Array.getLength(this.getPostingPeriod()); ++i) {
                obj = Array.get(this.getPostingPeriod(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPriceLevel() != null) {
            for (i = 0; i < Array.getLength(this.getPriceLevel()); ++i) {
                obj = Array.get(this.getPriceLevel(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPrint() != null) {
            for (i = 0; i < Array.getLength(this.getPrint()); ++i) {
                obj = Array.get(this.getPrint(), i);
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
        if (this.getProjectedAmount() != null) {
            for (i = 0; i < Array.getLength(this.getProjectedAmount()); ++i) {
                obj = Array.get(this.getProjectedAmount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getProjectTask() != null) {
            for (i = 0; i < Array.getLength(this.getProjectTask()); ++i) {
                obj = Array.get(this.getProjectTask(), i);
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
        if (this.getPurchaseOrder() != null) {
            for (i = 0; i < Array.getLength(this.getPurchaseOrder()); ++i) {
                obj = Array.get(this.getPurchaseOrder(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getQuantity() != null) {
            for (i = 0; i < Array.getLength(this.getQuantity()); ++i) {
                obj = Array.get(this.getQuantity(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getQuantityBilled() != null) {
            for (i = 0; i < Array.getLength(this.getQuantityBilled()); ++i) {
                obj = Array.get(this.getQuantityBilled(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getQuantityCommitted() != null) {
            for (i = 0; i < Array.getLength(this.getQuantityCommitted()); ++i) {
                obj = Array.get(this.getQuantityCommitted(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getQuantityPacked() != null) {
            for (i = 0; i < Array.getLength(this.getQuantityPacked()); ++i) {
                obj = Array.get(this.getQuantityPacked(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getQuantityPicked() != null) {
            for (i = 0; i < Array.getLength(this.getQuantityPicked()); ++i) {
                obj = Array.get(this.getQuantityPicked(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getQuantityRevCommitted() != null) {
            for (i = 0; i < Array.getLength(this.getQuantityRevCommitted()); ++i) {
                obj = Array.get(this.getQuantityRevCommitted(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getQuantityShipRecv() != null) {
            for (i = 0; i < Array.getLength(this.getQuantityShipRecv()); ++i) {
                obj = Array.get(this.getQuantityShipRecv(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getQuantityUom() != null) {
            for (i = 0; i < Array.getLength(this.getQuantityUom()); ++i) {
                obj = Array.get(this.getQuantityUom(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRate() != null) {
            for (i = 0; i < Array.getLength(this.getRate()); ++i) {
                obj = Array.get(this.getRate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRealizedGainPostingTransaction() != null) {
            for (i = 0; i < Array.getLength(this.getRealizedGainPostingTransaction()); ++i) {
                obj = Array.get(this.getRealizedGainPostingTransaction(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRecognizedRevenue() != null) {
            for (i = 0; i < Array.getLength(this.getRecognizedRevenue()); ++i) {
                obj = Array.get(this.getRecognizedRevenue(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRecordType() != null) {
            for (i = 0; i < Array.getLength(this.getRecordType()); ++i) {
                obj = Array.get(this.getRecordType(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRecurAnnuallyTotal() != null) {
            for (i = 0; i < Array.getLength(this.getRecurAnnuallyTotal()); ++i) {
                obj = Array.get(this.getRecurAnnuallyTotal(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRecurMonthlyTotal() != null) {
            for (i = 0; i < Array.getLength(this.getRecurMonthlyTotal()); ++i) {
                obj = Array.get(this.getRecurMonthlyTotal(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRecurQuarterlyTotal() != null) {
            for (i = 0; i < Array.getLength(this.getRecurQuarterlyTotal()); ++i) {
                obj = Array.get(this.getRecurQuarterlyTotal(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRecurringBill() != null) {
            for (i = 0; i < Array.getLength(this.getRecurringBill()); ++i) {
                obj = Array.get(this.getRecurringBill(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRecurWeeklyTotal() != null) {
            for (i = 0; i < Array.getLength(this.getRecurWeeklyTotal()); ++i) {
                obj = Array.get(this.getRecurWeeklyTotal(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRefNumber() != null) {
            for (i = 0; i < Array.getLength(this.getRefNumber()); ++i) {
                obj = Array.get(this.getRefNumber(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRequestedDate() != null) {
            for (i = 0; i < Array.getLength(this.getRequestedDate()); ++i) {
                obj = Array.get(this.getRequestedDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRequiredDepositAmount() != null) {
            for (i = 0; i < Array.getLength(this.getRequiredDepositAmount()); ++i) {
                obj = Array.get(this.getRequiredDepositAmount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRequiredDepositDue() != null) {
            for (i = 0; i < Array.getLength(this.getRequiredDepositDue()); ++i) {
                obj = Array.get(this.getRequiredDepositDue(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRequiredDepositPercentage() != null) {
            for (i = 0; i < Array.getLength(this.getRequiredDepositPercentage()); ++i) {
                obj = Array.get(this.getRequiredDepositPercentage(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRevCommitStatus() != null) {
            for (i = 0; i < Array.getLength(this.getRevCommitStatus()); ++i) {
                obj = Array.get(this.getRevCommitStatus(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRevCommittingTransaction() != null) {
            for (i = 0; i < Array.getLength(this.getRevCommittingTransaction()); ++i) {
                obj = Array.get(this.getRevCommittingTransaction(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRevenueStatus() != null) {
            for (i = 0; i < Array.getLength(this.getRevenueStatus()); ++i) {
                obj = Array.get(this.getRevenueStatus(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getReversalDate() != null) {
            for (i = 0; i < Array.getLength(this.getReversalDate()); ++i) {
                obj = Array.get(this.getReversalDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getReversalNumber() != null) {
            for (i = 0; i < Array.getLength(this.getReversalNumber()); ++i) {
                obj = Array.get(this.getReversalNumber(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRevRecEndDate() != null) {
            for (i = 0; i < Array.getLength(this.getRevRecEndDate()); ++i) {
                obj = Array.get(this.getRevRecEndDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRevRecOnRevCommitment() != null) {
            for (i = 0; i < Array.getLength(this.getRevRecOnRevCommitment()); ++i) {
                obj = Array.get(this.getRevRecOnRevCommitment(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRevRecStartDate() != null) {
            for (i = 0; i < Array.getLength(this.getRevRecStartDate()); ++i) {
                obj = Array.get(this.getRevRecStartDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRgAccount() != null) {
            for (i = 0; i < Array.getLength(this.getRgAccount()); ++i) {
                obj = Array.get(this.getRgAccount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRgAmount() != null) {
            for (i = 0; i < Array.getLength(this.getRgAmount()); ++i) {
                obj = Array.get(this.getRgAmount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSalesEffectiveDate() != null) {
            for (i = 0; i < Array.getLength(this.getSalesEffectiveDate()); ++i) {
                obj = Array.get(this.getSalesEffectiveDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSalesOrder() != null) {
            for (i = 0; i < Array.getLength(this.getSalesOrder()); ++i) {
                obj = Array.get(this.getSalesOrder(), i);
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
        if (this.getSchedulingMethod() != null) {
            for (i = 0; i < Array.getLength(this.getSchedulingMethod()); ++i) {
                obj = Array.get(this.getSchedulingMethod(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSerialNumber() != null) {
            for (i = 0; i < Array.getLength(this.getSerialNumber()); ++i) {
                obj = Array.get(this.getSerialNumber(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSerialNumberCost() != null) {
            for (i = 0; i < Array.getLength(this.getSerialNumberCost()); ++i) {
                obj = Array.get(this.getSerialNumberCost(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSerialNumberCostAdjustment() != null) {
            for (i = 0; i < Array.getLength(this.getSerialNumberCostAdjustment()); ++i) {
                obj = Array.get(this.getSerialNumberCostAdjustment(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSerialNumberQuantity() != null) {
            for (i = 0; i < Array.getLength(this.getSerialNumberQuantity()); ++i) {
                obj = Array.get(this.getSerialNumberQuantity(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSerialNumbers() != null) {
            for (i = 0; i < Array.getLength(this.getSerialNumbers()); ++i) {
                obj = Array.get(this.getSerialNumbers(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getShipAddress() != null) {
            for (i = 0; i < Array.getLength(this.getShipAddress()); ++i) {
                obj = Array.get(this.getShipAddress(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getShipAddress1() != null) {
            for (i = 0; i < Array.getLength(this.getShipAddress1()); ++i) {
                obj = Array.get(this.getShipAddress1(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getShipAddress2() != null) {
            for (i = 0; i < Array.getLength(this.getShipAddress2()); ++i) {
                obj = Array.get(this.getShipAddress2(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getShipAddress3() != null) {
            for (i = 0; i < Array.getLength(this.getShipAddress3()); ++i) {
                obj = Array.get(this.getShipAddress3(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getShipAddressee() != null) {
            for (i = 0; i < Array.getLength(this.getShipAddressee()); ++i) {
                obj = Array.get(this.getShipAddressee(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getShipAttention() != null) {
            for (i = 0; i < Array.getLength(this.getShipAttention()); ++i) {
                obj = Array.get(this.getShipAttention(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getShipCarrier() != null) {
            for (i = 0; i < Array.getLength(this.getShipCarrier()); ++i) {
                obj = Array.get(this.getShipCarrier(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getShipCity() != null) {
            for (i = 0; i < Array.getLength(this.getShipCity()); ++i) {
                obj = Array.get(this.getShipCity(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getShipComplete() != null) {
            for (i = 0; i < Array.getLength(this.getShipComplete()); ++i) {
                obj = Array.get(this.getShipComplete(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getShipCountry() != null) {
            for (i = 0; i < Array.getLength(this.getShipCountry()); ++i) {
                obj = Array.get(this.getShipCountry(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getShipCountryCode() != null) {
            for (i = 0; i < Array.getLength(this.getShipCountryCode()); ++i) {
                obj = Array.get(this.getShipCountryCode(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getShipDate() != null) {
            for (i = 0; i < Array.getLength(this.getShipDate()); ++i) {
                obj = Array.get(this.getShipDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getShipGroup() != null) {
            for (i = 0; i < Array.getLength(this.getShipGroup()); ++i) {
                obj = Array.get(this.getShipGroup(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getShipMethod() != null) {
            for (i = 0; i < Array.getLength(this.getShipMethod()); ++i) {
                obj = Array.get(this.getShipMethod(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getShipPhone() != null) {
            for (i = 0; i < Array.getLength(this.getShipPhone()); ++i) {
                obj = Array.get(this.getShipPhone(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getShippingAmount() != null) {
            for (i = 0; i < Array.getLength(this.getShippingAmount()); ++i) {
                obj = Array.get(this.getShippingAmount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getShipRecvStatusLine() != null) {
            for (i = 0; i < Array.getLength(this.getShipRecvStatusLine()); ++i) {
                obj = Array.get(this.getShipRecvStatusLine(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getShipState() != null) {
            for (i = 0; i < Array.getLength(this.getShipState()); ++i) {
                obj = Array.get(this.getShipState(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getShipTo() != null) {
            for (i = 0; i < Array.getLength(this.getShipTo()); ++i) {
                obj = Array.get(this.getShipTo(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getShipZip() != null) {
            for (i = 0; i < Array.getLength(this.getShipZip()); ++i) {
                obj = Array.get(this.getShipZip(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSignedAmount() != null) {
            for (i = 0; i < Array.getLength(this.getSignedAmount()); ++i) {
                obj = Array.get(this.getSignedAmount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSource() != null) {
            for (i = 0; i < Array.getLength(this.getSource()); ++i) {
                obj = Array.get(this.getSource(), i);
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
        if (this.getSubscriptionLine() != null) {
            for (i = 0; i < Array.getLength(this.getSubscriptionLine()); ++i) {
                obj = Array.get(this.getSubscriptionLine(), i);
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
        if (this.getSubsidiaryTaxRegNum() != null) {
            for (i = 0; i < Array.getLength(this.getSubsidiaryTaxRegNum()); ++i) {
                obj = Array.get(this.getSubsidiaryTaxRegNum(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTaxAmount() != null) {
            for (i = 0; i < Array.getLength(this.getTaxAmount()); ++i) {
                obj = Array.get(this.getTaxAmount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTaxCode() != null) {
            for (i = 0; i < Array.getLength(this.getTaxCode()); ++i) {
                obj = Array.get(this.getTaxCode(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTaxLine() != null) {
            for (i = 0; i < Array.getLength(this.getTaxLine()); ++i) {
                obj = Array.get(this.getTaxLine(), i);
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
        if (this.getTaxPointDate() != null) {
            for (i = 0; i < Array.getLength(this.getTaxPointDate()); ++i) {
                obj = Array.get(this.getTaxPointDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTaxTotal() != null) {
            for (i = 0; i < Array.getLength(this.getTaxTotal()); ++i) {
                obj = Array.get(this.getTaxTotal(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTermInMonths() != null) {
            for (i = 0; i < Array.getLength(this.getTermInMonths()); ++i) {
                obj = Array.get(this.getTermInMonths(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTerms() != null) {
            for (i = 0; i < Array.getLength(this.getTerms()); ++i) {
                obj = Array.get(this.getTerms(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTermsOfSale() != null) {
            for (i = 0; i < Array.getLength(this.getTermsOfSale()); ++i) {
                obj = Array.get(this.getTermsOfSale(), i);
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
        if (this.getToBeEmailed() != null) {
            for (i = 0; i < Array.getLength(this.getToBeEmailed()); ++i) {
                obj = Array.get(this.getToBeEmailed(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getToBePrinted() != null) {
            for (i = 0; i < Array.getLength(this.getToBePrinted()); ++i) {
                obj = Array.get(this.getToBePrinted(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getToSubsidiary() != null) {
            for (i = 0; i < Array.getLength(this.getToSubsidiary()); ++i) {
                obj = Array.get(this.getToSubsidiary(), i);
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
        if (this.getTotalCostEstimate() != null) {
            for (i = 0; i < Array.getLength(this.getTotalCostEstimate()); ++i) {
                obj = Array.get(this.getTotalCostEstimate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTrackingNumbers() != null) {
            for (i = 0; i < Array.getLength(this.getTrackingNumbers()); ++i) {
                obj = Array.get(this.getTrackingNumbers(), i);
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
        if (this.getTranIsVsoeBundle() != null) {
            for (i = 0; i < Array.getLength(this.getTranIsVsoeBundle()); ++i) {
                obj = Array.get(this.getTranIsVsoeBundle(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTransactionDiscount() != null) {
            for (i = 0; i < Array.getLength(this.getTransactionDiscount()); ++i) {
                obj = Array.get(this.getTransactionDiscount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTransactionLineType() != null) {
            for (i = 0; i < Array.getLength(this.getTransactionLineType()); ++i) {
                obj = Array.get(this.getTransactionLineType(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTransactionNumber() != null) {
            for (i = 0; i < Array.getLength(this.getTransactionNumber()); ++i) {
                obj = Array.get(this.getTransactionNumber(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTransferLocation() != null) {
            for (i = 0; i < Array.getLength(this.getTransferLocation()); ++i) {
                obj = Array.get(this.getTransferLocation(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTransferOrderItemLine() != null) {
            for (i = 0; i < Array.getLength(this.getTransferOrderItemLine()); ++i) {
                obj = Array.get(this.getTransferOrderItemLine(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTransferOrderQuantityCommitted() != null) {
            for (i = 0; i < Array.getLength(this.getTransferOrderQuantityCommitted()); ++i) {
                obj = Array.get(this.getTransferOrderQuantityCommitted(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTransferOrderQuantityPacked() != null) {
            for (i = 0; i < Array.getLength(this.getTransferOrderQuantityPacked()); ++i) {
                obj = Array.get(this.getTransferOrderQuantityPacked(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTransferOrderQuantityPicked() != null) {
            for (i = 0; i < Array.getLength(this.getTransferOrderQuantityPicked()); ++i) {
                obj = Array.get(this.getTransferOrderQuantityPicked(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTransferOrderQuantityReceived() != null) {
            for (i = 0; i < Array.getLength(this.getTransferOrderQuantityReceived()); ++i) {
                obj = Array.get(this.getTransferOrderQuantityReceived(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTransferOrderQuantityShipped() != null) {
            for (i = 0; i < Array.getLength(this.getTransferOrderQuantityShipped()); ++i) {
                obj = Array.get(this.getTransferOrderQuantityShipped(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getType() != null) {
            for (i = 0; i < Array.getLength(this.getType()); ++i) {
                obj = Array.get(this.getType(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getUnit() != null) {
            for (i = 0; i < Array.getLength(this.getUnit()); ++i) {
                obj = Array.get(this.getUnit(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getUnitCostOverride() != null) {
            for (i = 0; i < Array.getLength(this.getUnitCostOverride()); ++i) {
                obj = Array.get(this.getUnitCostOverride(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getVendType() != null) {
            for (i = 0; i < Array.getLength(this.getVendType()); ++i) {
                obj = Array.get(this.getVendType(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getVisibleToCustomer() != null) {
            for (i = 0; i < Array.getLength(this.getVisibleToCustomer()); ++i) {
                obj = Array.get(this.getVisibleToCustomer(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getVsoeAllocation() != null) {
            for (i = 0; i < Array.getLength(this.getVsoeAllocation()); ++i) {
                obj = Array.get(this.getVsoeAllocation(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getVsoeAmount() != null) {
            for (i = 0; i < Array.getLength(this.getVsoeAmount()); ++i) {
                obj = Array.get(this.getVsoeAmount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getVsoeDeferral() != null) {
            for (i = 0; i < Array.getLength(this.getVsoeDeferral()); ++i) {
                obj = Array.get(this.getVsoeDeferral(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getVsoeDelivered() != null) {
            for (i = 0; i < Array.getLength(this.getVsoeDelivered()); ++i) {
                obj = Array.get(this.getVsoeDelivered(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getVsoePermitDiscount() != null) {
            for (i = 0; i < Array.getLength(this.getVsoePermitDiscount()); ++i) {
                obj = Array.get(this.getVsoePermitDiscount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getVsoePrice() != null) {
            for (i = 0; i < Array.getLength(this.getVsoePrice()); ++i) {
                obj = Array.get(this.getVsoePrice(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getWebSite() != null) {
            for (i = 0; i < Array.getLength(this.getWebSite()); ++i) {
                obj = Array.get(this.getWebSite(), i);
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("abbrev");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "abbrev"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "account"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("accountType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "accountType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("acctCorpCardExp");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "acctCorpCardExp"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("actualProductionEndDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "actualProductionEndDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("actualProductionStartDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "actualProductionStartDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("actualShipDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "actualShipDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("altSalesAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "altSalesAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("altSalesNetAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "altSalesNetAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "amount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("amountPaid");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "amountPaid"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("amountRemaining");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "amountRemaining"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("amountUnbilled");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "amountUnbilled"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("appliedToForeignAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "appliedToForeignAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("appliedToIsFxVariance");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "appliedToIsFxVariance"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("appliedToLinkAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "appliedToLinkAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("appliedToLinkType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "appliedToLinkType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("appliedToTransaction");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "appliedToTransaction"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("applyingForeignAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "applyingForeignAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("applyingIsFxVariance");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "applyingIsFxVariance"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("applyingLinkAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "applyingLinkAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("applyingLinkType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "applyingLinkType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("applyingTransaction");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "applyingTransaction"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("approvalStatus");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "approvalStatus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("authCode");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "authCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("autoCalculateLag");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "autoCalculateLag"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("avsStreetMatch");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "avsStreetMatch"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("avsZipMatch");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "avsZipMatch"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billable");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billable"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billAddress");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billAddress"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billAddress1");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billAddress1"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billAddress2");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billAddress2"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billAddress3");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billAddress3"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billAddressee");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billAddressee"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billAttention");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billAttention"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billCity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billCity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billCountry");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billCountry"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billCountryCode");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billCountryCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billedDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billedDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billingAccount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billingAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billingAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billingAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billingSchedule");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billingSchedule"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billingTransaction");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billingTransaction"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billPhone");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billPhone"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billState");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billState"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billVarianceStatus");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billVarianceStatus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billZip");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billZip"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("binNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "binNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("binNumberQuantity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "binNumberQuantity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("bomQuantity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "bomQuantity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("buildEntireAssembly");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "buildEntireAssembly"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("buildVariance");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "buildVariance"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("built");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "built"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("canHaveStackablePromotions");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "canHaveStackablePromotions"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("catchUpPeriod");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "catchUpPeriod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ccCustomerCode");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ccCustomerCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ccExpDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ccExpDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ccHolderName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ccHolderName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ccNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ccNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ccStreet");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ccStreet"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ccZipCode");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ccZipCode"));
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
        elemField.setFieldName("cleared");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "cleared"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("closed");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "closed"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
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
        elemField.setFieldName("cogsAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "cogsAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("commissionEffectiveDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "commissionEffectiveDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("commit");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "commit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("componentYield");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "componentYield"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("confirmationNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "confirmationNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("costComponentAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "costComponentAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("costComponentCategory");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "costComponentCategory"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("costComponentItem");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "costComponentItem"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("costComponentQuantity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "costComponentQuantity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("costComponentStandardCost");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "costComponentStandardCost"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("costEstimate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "costEstimate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("costEstimateRate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "costEstimateRate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("costEstimateType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "costEstimateType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("createdBy");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "createdBy"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("createdFrom");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "createdFrom"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("creditAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "creditAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("cscMatch");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "cscMatch"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
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
        elemField.setFieldName("customForm");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customGL");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "customGL"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("custType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "custType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("daysOverdue");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "daysOverdue"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("debitAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "debitAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("deferredRevenue");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "deferredRevenue"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("deferRevRec");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "deferRevRec"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
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
        elemField.setFieldName("depositDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "depositDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("depositTransaction");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "depositTransaction"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("discountAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "discountAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("docUnit");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "docUnit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("drAccount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "drAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("dueDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "dueDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("effectiveRate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "effectiveRate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "email"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("estGrossProfit");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "estGrossProfit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("estGrossProfitPct");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "estGrossProfitPct"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("estGrossProfitPercent");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "estGrossProfitPercent"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("exchangeRate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "exchangeRate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("excludeCommission");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "excludeCommission"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("excludeFromRateRequest");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "excludeFromRateRequest"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
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
        elemField.setFieldName("expectedReceiptDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "expectedReceiptDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("expenseCategory");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "expenseCategory"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("expenseDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "expenseDate"));
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
        elemField.setFieldName("firmed");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "firmed"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
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
        elemField.setFieldName("fulfillingTransaction");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fulfillingTransaction"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fxAccount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fxAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fxAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fxAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fxCostEstimate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fxCostEstimate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fxCostEstimateRate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fxCostEstimateRate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fxEstGrossProfit");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fxEstGrossProfit"));
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
        elemField.setFieldName("fxVsoeAllocation");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fxVsoeAllocation"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fxVsoeAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fxVsoeAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fxVsoePrice");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fxVsoePrice"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("gcoAvailabelToCharge");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "gcoAvailabelToCharge"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("gcoAvailableToRefund");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "gcoAvailableToRefund"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("gcoAvsStreetMatch");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "gcoAvsStreetMatch"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("gcoAvsZipMatch");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "gcoAvsZipMatch"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("gcoBuyerAccountAge");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "gcoBuyerAccountAge"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("gcoBuyerIp");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "gcoBuyerIp"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("gcoChargeAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "gcoChargeAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("gcoChargebackAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "gcoChargebackAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("gcoConfirmedChargedTotal");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "gcoConfirmedChargedTotal"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("gcoConfirmedRefundedTotal");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "gcoConfirmedRefundedTotal"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("gcoCreditcardNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "gcoCreditcardNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("gcoCscMatch");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "gcoCscMatch"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("gcoFinancialState");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "gcoFinancialState"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("gcoFulfillmentState");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "gcoFulfillmentState"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("gcoOrderId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "gcoOrderId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("gcoOrderTotal");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "gcoOrderTotal"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("gcoPromotionAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "gcoPromotionAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("gcoPromotionName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "gcoPromotionName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("gcoRefundAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "gcoRefundAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("gcoShippingTotal");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "gcoShippingTotal"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("gcoStateChangedDetail");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "gcoStateChangedDetail"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("giftCert");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "giftCert"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("grossAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "grossAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("includeInForecast");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "includeInForecast"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("incoterm");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "incoterm"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("intercoStatus");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "intercoStatus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("intercoTransaction");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "intercoTransaction"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("inventoryLocation");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "inventoryLocation"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("inventorySubsidiary");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "inventorySubsidiary"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("inVsoeBundle");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "inVsoeBundle"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isAllocation");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isAllocation"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isBackflush");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isBackflush"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isGcoChargeback");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isGcoChargeback"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isGcoChargeConfirmed");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isGcoChargeConfirmed"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isGcoPaymentGuaranteed");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isGcoPaymentGuaranteed"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isGcoRefundConfirmed");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isGcoRefundConfirmed"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isInsideDelivery");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isInsideDelivery"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isInsidePickup");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isInsidePickup"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isIntercompanyAdjustment");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isIntercompanyAdjustment"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isInTransitPayment");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isInTransitPayment"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isMultiShipTo");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isMultiShipTo"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isReversal");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isReversal"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isRevRecTransaction");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isRevRecTransaction"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isScrap");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isScrap"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isShipAddress");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isShipAddress"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isTransferPriceCosting");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isTransferPriceCosting"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isWip");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isWip"));
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
        elemField.setFieldName("itemFulfillmentChoice");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "itemFulfillmentChoice"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemRevision");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "itemRevision"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("landedCostPerLine");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "landedCostPerLine"));
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
        elemField.setFieldName("line");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "line"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lineSequenceNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lineSequenceNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lineUniqueKey");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lineUniqueKey"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
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
        elemField.setFieldName("locationAutoAssigned");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationAutoAssigned"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("mainLine");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "mainLine"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("mainName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "mainName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("manufacturingRouting");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "manufacturingRouting"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("matchBillToReceipt");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "matchBillToReceipt"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
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
        elemField.setFieldName("memoMain");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "memoMain"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("memorized");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "memorized"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("merchantAccount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "merchantAccount"));
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
        elemField.setFieldName("multiSubsidiary");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "multiSubsidiary"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("netAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "netAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("netAmountNoTax");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "netAmountNoTax"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("nextApprover");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "nextApprover"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("nextBillDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "nextBillDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("nexus");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "nexus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("noAutoAssignLocation");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "noAutoAssignLocation"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("nonReimbursable");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "nonReimbursable"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("oneTimeTotal");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "oneTimeTotal"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("opportunity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "opportunity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("options");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "options"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("orderAllocationStrategy");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "orderAllocationStrategy"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("orderPriority");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "orderPriority"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("originator");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "originator"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("otherRefNum");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "otherRefNum"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnTextNumberField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("overheadParentItem");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "overheadParentItem"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("overrideInstallments");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "overrideInstallments"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("packageCount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "packageCount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("paidAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "paidAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("paidTransaction");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "paidTransaction"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("payingAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "payingAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("payingTransaction");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "payingTransaction"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("paymentApproved");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "paymentApproved"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("paymentEventDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "paymentEventDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("paymentEventHoldReason");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "paymentEventHoldReason"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("paymentEventPurchaseCardUsed");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "paymentEventPurchaseCardUsed"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("paymentEventPurchaseDataSent");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "paymentEventPurchaseDataSent"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("paymentEventResult");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "paymentEventResult"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("paymentEventType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "paymentEventType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("paymentHold");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "paymentHold"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("paymentMethod");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "paymentMethod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("paymentOption");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "paymentOption"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("payPalPending");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "payPalPending"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("payPalStatus");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "payPalStatus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("payPalTranId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "payPalTranId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("payrollBatch");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "payrollBatch"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("pnRefNum");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "pnRefNum"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("policyViolated");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "policyViolated"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("poRate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "poRate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("posting");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "posting"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("postingPeriod");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "postingPeriod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("priceLevel");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "priceLevel"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("print");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "print"));
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
        elemField.setFieldName("projectedAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "projectedAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("projectTask");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "projectTask"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("promoCode");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "promoCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("purchaseOrder");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "purchaseOrder"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "quantity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityBilled");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "quantityBilled"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityCommitted");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "quantityCommitted"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityPacked");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "quantityPacked"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityPicked");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "quantityPicked"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityRevCommitted");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "quantityRevCommitted"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityShipRecv");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "quantityShipRecv"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityUom");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "quantityUom"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("rate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "rate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("realizedGainPostingTransaction");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "realizedGainPostingTransaction"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recognizedRevenue");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "recognizedRevenue"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recordType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "recordType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recurAnnuallyTotal");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "recurAnnuallyTotal"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recurMonthlyTotal");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "recurMonthlyTotal"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recurQuarterlyTotal");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "recurQuarterlyTotal"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recurringBill");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "recurringBill"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recurWeeklyTotal");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "recurWeeklyTotal"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("refNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "refNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("requestedDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "requestedDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("requiredDepositAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "requiredDepositAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("requiredDepositDue");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "requiredDepositDue"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("requiredDepositPercentage");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "requiredDepositPercentage"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revCommitStatus");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "revCommitStatus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revCommittingTransaction");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "revCommittingTransaction"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revenueStatus");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "revenueStatus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("reversalDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "reversalDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("reversalNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "reversalNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revRecEndDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "revRecEndDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revRecOnRevCommitment");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "revRecOnRevCommitment"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revRecStartDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "revRecStartDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("rgAccount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "rgAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("rgAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "rgAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("salesEffectiveDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "salesEffectiveDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("salesOrder");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "salesOrder"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("schedulingMethod");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "schedulingMethod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("serialNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "serialNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("serialNumberCost");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "serialNumberCost"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("serialNumberCostAdjustment");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "serialNumberCostAdjustment"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("serialNumberQuantity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "serialNumberQuantity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("serialNumbers");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "serialNumbers"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipAddress");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipAddress"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipAddress1");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipAddress1"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipAddress2");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipAddress2"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipAddress3");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipAddress3"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipAddressee");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipAddressee"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipAttention");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipAttention"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipCarrier");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipCarrier"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipCity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipCity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipComplete");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipComplete"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipCountry");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipCountry"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipCountryCode");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipCountryCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipGroup");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipGroup"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipMethod");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipMethod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipPhone");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipPhone"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shippingAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shippingAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipRecvStatusLine");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipRecvStatusLine"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipState");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipState"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipTo");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipTo"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipZip");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipZip"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("signedAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "signedAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "source"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("subscriptionLine");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "subscriptionLine"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("subsidiaryTaxRegNum");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "subsidiaryTaxRegNum"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "taxAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxCode");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "taxCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxLine");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "taxLine"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
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
        elemField.setFieldName("taxPointDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "taxPointDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxTotal");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "taxTotal"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("termInMonths");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "termInMonths"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("terms");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "terms"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("termsOfSale");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "termsOfSale"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("toBeEmailed");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "toBeEmailed"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("toBePrinted");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "toBePrinted"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("toSubsidiary");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "toSubsidiary"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("totalCostEstimate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "totalCostEstimate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("trackingNumbers");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "trackingNumbers"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("tranIsVsoeBundle");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "tranIsVsoeBundle"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("transactionDiscount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "transactionDiscount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("transactionLineType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "transactionLineType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("transactionNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "transactionNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("transferLocation");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "transferLocation"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("transferOrderItemLine");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "transferOrderItemLine"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("transferOrderQuantityCommitted");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "transferOrderQuantityCommitted"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("transferOrderQuantityPacked");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "transferOrderQuantityPacked"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("transferOrderQuantityPicked");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "transferOrderQuantityPicked"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("transferOrderQuantityReceived");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "transferOrderQuantityReceived"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("transferOrderQuantityShipped");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "transferOrderQuantityShipped"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "type"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("unit");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "unit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("unitCostOverride");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "unitCostOverride"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vendType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "vendType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("visibleToCustomer");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "visibleToCustomer"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vsoeAllocation");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "vsoeAllocation"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vsoeAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "vsoeAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vsoeDeferral");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "vsoeDeferral"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vsoeDelivered");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "vsoeDelivered"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vsoePermitDiscount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "vsoePermitDiscount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vsoePrice");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "vsoePrice"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("webSite");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "webSite"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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

