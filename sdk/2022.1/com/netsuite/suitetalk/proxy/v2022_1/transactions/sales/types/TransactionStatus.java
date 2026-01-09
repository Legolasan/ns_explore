/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.axis.description.TypeDesc
 *  org.apache.axis.encoding.Deserializer
 *  org.apache.axis.encoding.Serializer
 *  org.apache.axis.encoding.ser.EnumDeserializer
 *  org.apache.axis.encoding.ser.EnumSerializer
 */
package com.netsuite.suitetalk.proxy.v2022_1.transactions.sales.types;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

public class TransactionStatus
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __billCancelled = "_billCancelled";
    public static final String __billOpen = "_billOpen";
    public static final String __billPaidInFull = "_billPaidInFull";
    public static final String __billPaymentApproved = "_billPaymentApproved";
    public static final String __billPaymentConfirmed = "_billPaymentConfirmed";
    public static final String __billPaymentDeclined = "_billPaymentDeclined";
    public static final String __billPaymentInTransit = "_billPaymentInTransit";
    public static final String __billPaymentOnlineBillPayPendingAccountingApproval = "_billPaymentOnlineBillPayPendingAccountingApproval";
    public static final String __billPaymentPendingApproval = "_billPaymentPendingApproval";
    public static final String __billPaymentRejected = "_billPaymentRejected";
    public static final String __billPaymentVoided = "_billPaymentVoided";
    public static final String __billPendingApproval = "_billPendingApproval";
    public static final String __billRejected = "_billRejected";
    public static final String __cashSaleDeposited = "_cashSaleDeposited";
    public static final String __cashSaleNotDeposited = "_cashSaleNotDeposited";
    public static final String __cashSaleUnapprovedPayment = "_cashSaleUnapprovedPayment";
    public static final String __checkOnlineBillPayPendingAccountingApproval = "_checkOnlineBillPayPendingAccountingApproval";
    public static final String __checkVoided = "_checkVoided";
    public static final String __commissionOverpaid = "_commissionOverpaid";
    public static final String __commissionPaidInFull = "_commissionPaidInFull";
    public static final String __commissionPendingAccountingApproval = "_commissionPendingAccountingApproval";
    public static final String __commissionPendingPayment = "_commissionPendingPayment";
    public static final String __commissionRejectedByAccounting = "_commissionRejectedByAccounting";
    public static final String __creditMemoFullyApplied = "_creditMemoFullyApplied";
    public static final String __creditMemoOpen = "_creditMemoOpen";
    public static final String __creditMemoVoided = "_creditMemoVoided";
    public static final String __customerDepositCancelled = "_customerDepositCancelled";
    public static final String __customerDepositDeposited = "_customerDepositDeposited";
    public static final String __customerDepositFullyApplied = "_customerDepositFullyApplied";
    public static final String __customerDepositNotDeposited = "_customerDepositNotDeposited";
    public static final String __customerDepositUnapprovedPayment = "_customerDepositUnapprovedPayment";
    public static final String __customerRefundCancelled = "_customerRefundCancelled";
    public static final String __customerRefundVoided = "_customerRefundVoided";
    public static final String __estimateClosed = "_estimateClosed";
    public static final String __estimateExpired = "_estimateExpired";
    public static final String __estimateOpen = "_estimateOpen";
    public static final String __estimateProcessed = "_estimateProcessed";
    public static final String __estimateVoided = "_estimateVoided";
    public static final String __expenseReportApprovedByAccounting = "_expenseReportApprovedByAccounting";
    public static final String __expenseReportApprovedOverriddenByAccounting = "_expenseReportApprovedOverriddenByAccounting";
    public static final String __expenseReportInProgress = "_expenseReportInProgress";
    public static final String __expenseReportPaidInFull = "_expenseReportPaidInFull";
    public static final String __expenseReportPaymentInTransit = "_expenseReportPaymentInTransit";
    public static final String __expenseReportPendingAccountingApproval = "_expenseReportPendingAccountingApproval";
    public static final String __expenseReportPendingSupervisorApproval = "_expenseReportPendingSupervisorApproval";
    public static final String __expenseReportRejectedByAccounting = "_expenseReportRejectedByAccounting";
    public static final String __expenseReportRejectedBySupervisor = "_expenseReportRejectedBySupervisor";
    public static final String __expenseReportRejectedOverriddenByAccounting = "_expenseReportRejectedOverriddenByAccounting";
    public static final String __expenseReportVoided = "_expenseReportVoided";
    public static final String __invoiceOpen = "_invoiceOpen";
    public static final String __invoicePaidInFull = "_invoicePaidInFull";
    public static final String __invoicePendingApproval = "_invoicePendingApproval";
    public static final String __invoiceRejected = "_invoiceRejected";
    public static final String __invoiceVoided = "_invoiceVoided";
    public static final String __itemFulfillmentPacked = "_itemFulfillmentPacked";
    public static final String __itemFulfillmentPicked = "_itemFulfillmentPicked";
    public static final String __itemFulfillmentShipped = "_itemFulfillmentShipped";
    public static final String __journalApprovedForPosting = "_journalApprovedForPosting";
    public static final String __journalPendingApproval = "_journalPendingApproval";
    public static final String __journalRejected = "_journalRejected";
    public static final String __opportunityClosedLost = "_opportunityClosedLost";
    public static final String __opportunityClosedWon = "_opportunityClosedWon";
    public static final String __opportunityInProgress = "_opportunityInProgress";
    public static final String __opportunityIssuedEstimate = "_opportunityIssuedEstimate";
    public static final String __paycheckCommitted = "_paycheckCommitted";
    public static final String __paycheckCreated = "_paycheckCreated";
    public static final String __paycheckError = "_paycheckError";
    public static final String __paycheckPendingCommitment = "_paycheckPendingCommitment";
    public static final String __paycheckPendingTaxCalculation = "_paycheckPendingTaxCalculation";
    public static final String __paycheckPreview = "_paycheckPreview";
    public static final String __paycheckReversed = "_paycheckReversed";
    public static final String __paymentCancelled = "_paymentCancelled";
    public static final String __paymentDeposited = "_paymentDeposited";
    public static final String __paymentNotDeposited = "_paymentNotDeposited";
    public static final String __paymentUnapprovedPayment = "_paymentUnapprovedPayment";
    public static final String __payrollLiabilityCheckVoided = "_payrollLiabilityCheckVoided";
    public static final String __periodEndJournalApprovedForPosting = "_periodEndJournalApprovedForPosting";
    public static final String __periodEndJournalPendingApproval = "_periodEndJournalPendingApproval";
    public static final String __periodEndJournalRejected = "_periodEndJournalRejected";
    public static final String __purchaseOrderClosed = "_purchaseOrderClosed";
    public static final String __purchaseOrderFullyBilled = "_purchaseOrderFullyBilled";
    public static final String __purchaseOrderPartiallyReceived = "_purchaseOrderPartiallyReceived";
    public static final String __purchaseOrderPendingBill = "_purchaseOrderPendingBill";
    public static final String __purchaseOrderPendingBillingPartiallyReceived = "_purchaseOrderPendingBillingPartiallyReceived";
    public static final String __purchaseOrderPendingReceipt = "_purchaseOrderPendingReceipt";
    public static final String __purchaseOrderPendingSupervisorApproval = "_purchaseOrderPendingSupervisorApproval";
    public static final String __purchaseOrderPlanned = "_purchaseOrderPlanned";
    public static final String __purchaseOrderRejectedBySupervisor = "_purchaseOrderRejectedBySupervisor";
    public static final String __requisitionCancelled = "_requisitionCancelled";
    public static final String __requisitionClosed = "_requisitionClosed";
    public static final String __requisitionFullyOrdered = "_requisitionFullyOrdered";
    public static final String __requisitionFullyReceived = "_requisitionFullyReceived";
    public static final String __requisitionPartiallyOrdered = "_requisitionPartiallyOrdered";
    public static final String __requisitionPartiallyReceived = "_requisitionPartiallyReceived";
    public static final String __requisitionPendingApproval = "_requisitionPendingApproval";
    public static final String __requisitionPendingOrder = "_requisitionPendingOrder";
    public static final String __requisitionRejected = "_requisitionRejected";
    public static final String __returnAuthorizationCancelled = "_returnAuthorizationCancelled";
    public static final String __returnAuthorizationClosed = "_returnAuthorizationClosed";
    public static final String __returnAuthorizationPartiallyReceived = "_returnAuthorizationPartiallyReceived";
    public static final String __returnAuthorizationPendingApproval = "_returnAuthorizationPendingApproval";
    public static final String __returnAuthorizationPendingReceipt = "_returnAuthorizationPendingReceipt";
    public static final String __returnAuthorizationPendingRefund = "_returnAuthorizationPendingRefund";
    public static final String __returnAuthorizationPendingRefundPartiallyReceived = "_returnAuthorizationPendingRefundPartiallyReceived";
    public static final String __returnAuthorizationRefunded = "_returnAuthorizationRefunded";
    public static final String __salesOrderBilled = "_salesOrderBilled";
    public static final String __salesOrderCancelled = "_salesOrderCancelled";
    public static final String __salesOrderClosed = "_salesOrderClosed";
    public static final String __salesOrderPartiallyFulfilled = "_salesOrderPartiallyFulfilled";
    public static final String __salesOrderPendingApproval = "_salesOrderPendingApproval";
    public static final String __salesOrderPendingBilling = "_salesOrderPendingBilling";
    public static final String __salesOrderPendingBillingPartiallyFulfilled = "_salesOrderPendingBillingPartiallyFulfilled";
    public static final String __salesOrderPendingFulfillment = "_salesOrderPendingFulfillment";
    public static final String __salesTaxPaymentOnlineBillPayPendingAccountingApproval = "_salesTaxPaymentOnlineBillPayPendingAccountingApproval";
    public static final String __salesTaxPaymentVoided = "_salesTaxPaymentVoided";
    public static final String __statementChargeOpen = "_statementChargeOpen";
    public static final String __statementChargePaidInFull = "_statementChargePaidInFull";
    public static final String __taxLiabilityChequeVoided = "_taxLiabilityChequeVoided";
    public static final String __tegataPayableEndorsed = "_tegataPayableEndorsed";
    public static final String __tegataPayableIssued = "_tegataPayableIssued";
    public static final String __tegataPayablePaid = "_tegataPayablePaid";
    public static final String __tegataReceivablesCollected = "_tegataReceivablesCollected";
    public static final String __tegataReceivablesDiscounted = "_tegataReceivablesDiscounted";
    public static final String __tegataReceivablesEndorsed = "_tegataReceivablesEndorsed";
    public static final String __tegataReceivablesHolding = "_tegataReceivablesHolding";
    public static final String __tegataReceivablesVoided = "_tegataReceivablesVoided";
    public static final String __transferOrderClosed = "_transferOrderClosed";
    public static final String __transferOrderPartiallyFulfilled = "_transferOrderPartiallyFulfilled";
    public static final String __transferOrderPendingApproval = "_transferOrderPendingApproval";
    public static final String __transferOrderPendingFulfillment = "_transferOrderPendingFulfillment";
    public static final String __transferOrderPendingReceipt = "_transferOrderPendingReceipt";
    public static final String __transferOrderPendingReceiptPartiallyFulfilled = "_transferOrderPendingReceiptPartiallyFulfilled";
    public static final String __transferOrderReceived = "_transferOrderReceived";
    public static final String __transferOrderRejected = "_transferOrderRejected";
    public static final String __vendorReturnAuthorizationCancelled = "_vendorReturnAuthorizationCancelled";
    public static final String __vendorReturnAuthorizationClosed = "_vendorReturnAuthorizationClosed";
    public static final String __vendorReturnAuthorizationCredited = "_vendorReturnAuthorizationCredited";
    public static final String __vendorReturnAuthorizationPartiallyReturned = "_vendorReturnAuthorizationPartiallyReturned";
    public static final String __vendorReturnAuthorizationPendingApproval = "_vendorReturnAuthorizationPendingApproval";
    public static final String __vendorReturnAuthorizationPendingCredit = "_vendorReturnAuthorizationPendingCredit";
    public static final String __vendorReturnAuthorizationPendingCreditPartiallyReturned = "_vendorReturnAuthorizationPendingCreditPartiallyReturned";
    public static final String __vendorReturnAuthorizationPendingReturn = "_vendorReturnAuthorizationPendingReturn";
    public static final String __workOrderBuilt = "_workOrderBuilt";
    public static final String __workOrderCancelled = "_workOrderCancelled";
    public static final String __workOrderClosed = "_workOrderClosed";
    public static final String __workOrderPartiallyBuilt = "_workOrderPartiallyBuilt";
    public static final String __workOrderPendingBuild = "_workOrderPendingBuild";
    public static final String __workOrderPlanned = "_workOrderPlanned";
    public static final TransactionStatus _billCancelled = new TransactionStatus("_billCancelled");
    public static final TransactionStatus _billOpen = new TransactionStatus("_billOpen");
    public static final TransactionStatus _billPaidInFull = new TransactionStatus("_billPaidInFull");
    public static final TransactionStatus _billPaymentApproved = new TransactionStatus("_billPaymentApproved");
    public static final TransactionStatus _billPaymentConfirmed = new TransactionStatus("_billPaymentConfirmed");
    public static final TransactionStatus _billPaymentDeclined = new TransactionStatus("_billPaymentDeclined");
    public static final TransactionStatus _billPaymentInTransit = new TransactionStatus("_billPaymentInTransit");
    public static final TransactionStatus _billPaymentOnlineBillPayPendingAccountingApproval = new TransactionStatus("_billPaymentOnlineBillPayPendingAccountingApproval");
    public static final TransactionStatus _billPaymentPendingApproval = new TransactionStatus("_billPaymentPendingApproval");
    public static final TransactionStatus _billPaymentRejected = new TransactionStatus("_billPaymentRejected");
    public static final TransactionStatus _billPaymentVoided = new TransactionStatus("_billPaymentVoided");
    public static final TransactionStatus _billPendingApproval = new TransactionStatus("_billPendingApproval");
    public static final TransactionStatus _billRejected = new TransactionStatus("_billRejected");
    public static final TransactionStatus _cashSaleDeposited = new TransactionStatus("_cashSaleDeposited");
    public static final TransactionStatus _cashSaleNotDeposited = new TransactionStatus("_cashSaleNotDeposited");
    public static final TransactionStatus _cashSaleUnapprovedPayment = new TransactionStatus("_cashSaleUnapprovedPayment");
    public static final TransactionStatus _checkOnlineBillPayPendingAccountingApproval = new TransactionStatus("_checkOnlineBillPayPendingAccountingApproval");
    public static final TransactionStatus _checkVoided = new TransactionStatus("_checkVoided");
    public static final TransactionStatus _commissionOverpaid = new TransactionStatus("_commissionOverpaid");
    public static final TransactionStatus _commissionPaidInFull = new TransactionStatus("_commissionPaidInFull");
    public static final TransactionStatus _commissionPendingAccountingApproval = new TransactionStatus("_commissionPendingAccountingApproval");
    public static final TransactionStatus _commissionPendingPayment = new TransactionStatus("_commissionPendingPayment");
    public static final TransactionStatus _commissionRejectedByAccounting = new TransactionStatus("_commissionRejectedByAccounting");
    public static final TransactionStatus _creditMemoFullyApplied = new TransactionStatus("_creditMemoFullyApplied");
    public static final TransactionStatus _creditMemoOpen = new TransactionStatus("_creditMemoOpen");
    public static final TransactionStatus _creditMemoVoided = new TransactionStatus("_creditMemoVoided");
    public static final TransactionStatus _customerDepositCancelled = new TransactionStatus("_customerDepositCancelled");
    public static final TransactionStatus _customerDepositDeposited = new TransactionStatus("_customerDepositDeposited");
    public static final TransactionStatus _customerDepositFullyApplied = new TransactionStatus("_customerDepositFullyApplied");
    public static final TransactionStatus _customerDepositNotDeposited = new TransactionStatus("_customerDepositNotDeposited");
    public static final TransactionStatus _customerDepositUnapprovedPayment = new TransactionStatus("_customerDepositUnapprovedPayment");
    public static final TransactionStatus _customerRefundCancelled = new TransactionStatus("_customerRefundCancelled");
    public static final TransactionStatus _customerRefundVoided = new TransactionStatus("_customerRefundVoided");
    public static final TransactionStatus _estimateClosed = new TransactionStatus("_estimateClosed");
    public static final TransactionStatus _estimateExpired = new TransactionStatus("_estimateExpired");
    public static final TransactionStatus _estimateOpen = new TransactionStatus("_estimateOpen");
    public static final TransactionStatus _estimateProcessed = new TransactionStatus("_estimateProcessed");
    public static final TransactionStatus _estimateVoided = new TransactionStatus("_estimateVoided");
    public static final TransactionStatus _expenseReportApprovedByAccounting = new TransactionStatus("_expenseReportApprovedByAccounting");
    public static final TransactionStatus _expenseReportApprovedOverriddenByAccounting = new TransactionStatus("_expenseReportApprovedOverriddenByAccounting");
    public static final TransactionStatus _expenseReportInProgress = new TransactionStatus("_expenseReportInProgress");
    public static final TransactionStatus _expenseReportPaidInFull = new TransactionStatus("_expenseReportPaidInFull");
    public static final TransactionStatus _expenseReportPaymentInTransit = new TransactionStatus("_expenseReportPaymentInTransit");
    public static final TransactionStatus _expenseReportPendingAccountingApproval = new TransactionStatus("_expenseReportPendingAccountingApproval");
    public static final TransactionStatus _expenseReportPendingSupervisorApproval = new TransactionStatus("_expenseReportPendingSupervisorApproval");
    public static final TransactionStatus _expenseReportRejectedByAccounting = new TransactionStatus("_expenseReportRejectedByAccounting");
    public static final TransactionStatus _expenseReportRejectedBySupervisor = new TransactionStatus("_expenseReportRejectedBySupervisor");
    public static final TransactionStatus _expenseReportRejectedOverriddenByAccounting = new TransactionStatus("_expenseReportRejectedOverriddenByAccounting");
    public static final TransactionStatus _expenseReportVoided = new TransactionStatus("_expenseReportVoided");
    public static final TransactionStatus _invoiceOpen = new TransactionStatus("_invoiceOpen");
    public static final TransactionStatus _invoicePaidInFull = new TransactionStatus("_invoicePaidInFull");
    public static final TransactionStatus _invoicePendingApproval = new TransactionStatus("_invoicePendingApproval");
    public static final TransactionStatus _invoiceRejected = new TransactionStatus("_invoiceRejected");
    public static final TransactionStatus _invoiceVoided = new TransactionStatus("_invoiceVoided");
    public static final TransactionStatus _itemFulfillmentPacked = new TransactionStatus("_itemFulfillmentPacked");
    public static final TransactionStatus _itemFulfillmentPicked = new TransactionStatus("_itemFulfillmentPicked");
    public static final TransactionStatus _itemFulfillmentShipped = new TransactionStatus("_itemFulfillmentShipped");
    public static final TransactionStatus _journalApprovedForPosting = new TransactionStatus("_journalApprovedForPosting");
    public static final TransactionStatus _journalPendingApproval = new TransactionStatus("_journalPendingApproval");
    public static final TransactionStatus _journalRejected = new TransactionStatus("_journalRejected");
    public static final TransactionStatus _opportunityClosedLost = new TransactionStatus("_opportunityClosedLost");
    public static final TransactionStatus _opportunityClosedWon = new TransactionStatus("_opportunityClosedWon");
    public static final TransactionStatus _opportunityInProgress = new TransactionStatus("_opportunityInProgress");
    public static final TransactionStatus _opportunityIssuedEstimate = new TransactionStatus("_opportunityIssuedEstimate");
    public static final TransactionStatus _paycheckCommitted = new TransactionStatus("_paycheckCommitted");
    public static final TransactionStatus _paycheckCreated = new TransactionStatus("_paycheckCreated");
    public static final TransactionStatus _paycheckError = new TransactionStatus("_paycheckError");
    public static final TransactionStatus _paycheckPendingCommitment = new TransactionStatus("_paycheckPendingCommitment");
    public static final TransactionStatus _paycheckPendingTaxCalculation = new TransactionStatus("_paycheckPendingTaxCalculation");
    public static final TransactionStatus _paycheckPreview = new TransactionStatus("_paycheckPreview");
    public static final TransactionStatus _paycheckReversed = new TransactionStatus("_paycheckReversed");
    public static final TransactionStatus _paymentCancelled = new TransactionStatus("_paymentCancelled");
    public static final TransactionStatus _paymentDeposited = new TransactionStatus("_paymentDeposited");
    public static final TransactionStatus _paymentNotDeposited = new TransactionStatus("_paymentNotDeposited");
    public static final TransactionStatus _paymentUnapprovedPayment = new TransactionStatus("_paymentUnapprovedPayment");
    public static final TransactionStatus _payrollLiabilityCheckVoided = new TransactionStatus("_payrollLiabilityCheckVoided");
    public static final TransactionStatus _periodEndJournalApprovedForPosting = new TransactionStatus("_periodEndJournalApprovedForPosting");
    public static final TransactionStatus _periodEndJournalPendingApproval = new TransactionStatus("_periodEndJournalPendingApproval");
    public static final TransactionStatus _periodEndJournalRejected = new TransactionStatus("_periodEndJournalRejected");
    public static final TransactionStatus _purchaseOrderClosed = new TransactionStatus("_purchaseOrderClosed");
    public static final TransactionStatus _purchaseOrderFullyBilled = new TransactionStatus("_purchaseOrderFullyBilled");
    public static final TransactionStatus _purchaseOrderPartiallyReceived = new TransactionStatus("_purchaseOrderPartiallyReceived");
    public static final TransactionStatus _purchaseOrderPendingBill = new TransactionStatus("_purchaseOrderPendingBill");
    public static final TransactionStatus _purchaseOrderPendingBillingPartiallyReceived = new TransactionStatus("_purchaseOrderPendingBillingPartiallyReceived");
    public static final TransactionStatus _purchaseOrderPendingReceipt = new TransactionStatus("_purchaseOrderPendingReceipt");
    public static final TransactionStatus _purchaseOrderPendingSupervisorApproval = new TransactionStatus("_purchaseOrderPendingSupervisorApproval");
    public static final TransactionStatus _purchaseOrderPlanned = new TransactionStatus("_purchaseOrderPlanned");
    public static final TransactionStatus _purchaseOrderRejectedBySupervisor = new TransactionStatus("_purchaseOrderRejectedBySupervisor");
    public static final TransactionStatus _requisitionCancelled = new TransactionStatus("_requisitionCancelled");
    public static final TransactionStatus _requisitionClosed = new TransactionStatus("_requisitionClosed");
    public static final TransactionStatus _requisitionFullyOrdered = new TransactionStatus("_requisitionFullyOrdered");
    public static final TransactionStatus _requisitionFullyReceived = new TransactionStatus("_requisitionFullyReceived");
    public static final TransactionStatus _requisitionPartiallyOrdered = new TransactionStatus("_requisitionPartiallyOrdered");
    public static final TransactionStatus _requisitionPartiallyReceived = new TransactionStatus("_requisitionPartiallyReceived");
    public static final TransactionStatus _requisitionPendingApproval = new TransactionStatus("_requisitionPendingApproval");
    public static final TransactionStatus _requisitionPendingOrder = new TransactionStatus("_requisitionPendingOrder");
    public static final TransactionStatus _requisitionRejected = new TransactionStatus("_requisitionRejected");
    public static final TransactionStatus _returnAuthorizationCancelled = new TransactionStatus("_returnAuthorizationCancelled");
    public static final TransactionStatus _returnAuthorizationClosed = new TransactionStatus("_returnAuthorizationClosed");
    public static final TransactionStatus _returnAuthorizationPartiallyReceived = new TransactionStatus("_returnAuthorizationPartiallyReceived");
    public static final TransactionStatus _returnAuthorizationPendingApproval = new TransactionStatus("_returnAuthorizationPendingApproval");
    public static final TransactionStatus _returnAuthorizationPendingReceipt = new TransactionStatus("_returnAuthorizationPendingReceipt");
    public static final TransactionStatus _returnAuthorizationPendingRefund = new TransactionStatus("_returnAuthorizationPendingRefund");
    public static final TransactionStatus _returnAuthorizationPendingRefundPartiallyReceived = new TransactionStatus("_returnAuthorizationPendingRefundPartiallyReceived");
    public static final TransactionStatus _returnAuthorizationRefunded = new TransactionStatus("_returnAuthorizationRefunded");
    public static final TransactionStatus _salesOrderBilled = new TransactionStatus("_salesOrderBilled");
    public static final TransactionStatus _salesOrderCancelled = new TransactionStatus("_salesOrderCancelled");
    public static final TransactionStatus _salesOrderClosed = new TransactionStatus("_salesOrderClosed");
    public static final TransactionStatus _salesOrderPartiallyFulfilled = new TransactionStatus("_salesOrderPartiallyFulfilled");
    public static final TransactionStatus _salesOrderPendingApproval = new TransactionStatus("_salesOrderPendingApproval");
    public static final TransactionStatus _salesOrderPendingBilling = new TransactionStatus("_salesOrderPendingBilling");
    public static final TransactionStatus _salesOrderPendingBillingPartiallyFulfilled = new TransactionStatus("_salesOrderPendingBillingPartiallyFulfilled");
    public static final TransactionStatus _salesOrderPendingFulfillment = new TransactionStatus("_salesOrderPendingFulfillment");
    public static final TransactionStatus _salesTaxPaymentOnlineBillPayPendingAccountingApproval = new TransactionStatus("_salesTaxPaymentOnlineBillPayPendingAccountingApproval");
    public static final TransactionStatus _salesTaxPaymentVoided = new TransactionStatus("_salesTaxPaymentVoided");
    public static final TransactionStatus _statementChargeOpen = new TransactionStatus("_statementChargeOpen");
    public static final TransactionStatus _statementChargePaidInFull = new TransactionStatus("_statementChargePaidInFull");
    public static final TransactionStatus _taxLiabilityChequeVoided = new TransactionStatus("_taxLiabilityChequeVoided");
    public static final TransactionStatus _tegataPayableEndorsed = new TransactionStatus("_tegataPayableEndorsed");
    public static final TransactionStatus _tegataPayableIssued = new TransactionStatus("_tegataPayableIssued");
    public static final TransactionStatus _tegataPayablePaid = new TransactionStatus("_tegataPayablePaid");
    public static final TransactionStatus _tegataReceivablesCollected = new TransactionStatus("_tegataReceivablesCollected");
    public static final TransactionStatus _tegataReceivablesDiscounted = new TransactionStatus("_tegataReceivablesDiscounted");
    public static final TransactionStatus _tegataReceivablesEndorsed = new TransactionStatus("_tegataReceivablesEndorsed");
    public static final TransactionStatus _tegataReceivablesHolding = new TransactionStatus("_tegataReceivablesHolding");
    public static final TransactionStatus _tegataReceivablesVoided = new TransactionStatus("_tegataReceivablesVoided");
    public static final TransactionStatus _transferOrderClosed = new TransactionStatus("_transferOrderClosed");
    public static final TransactionStatus _transferOrderPartiallyFulfilled = new TransactionStatus("_transferOrderPartiallyFulfilled");
    public static final TransactionStatus _transferOrderPendingApproval = new TransactionStatus("_transferOrderPendingApproval");
    public static final TransactionStatus _transferOrderPendingFulfillment = new TransactionStatus("_transferOrderPendingFulfillment");
    public static final TransactionStatus _transferOrderPendingReceipt = new TransactionStatus("_transferOrderPendingReceipt");
    public static final TransactionStatus _transferOrderPendingReceiptPartiallyFulfilled = new TransactionStatus("_transferOrderPendingReceiptPartiallyFulfilled");
    public static final TransactionStatus _transferOrderReceived = new TransactionStatus("_transferOrderReceived");
    public static final TransactionStatus _transferOrderRejected = new TransactionStatus("_transferOrderRejected");
    public static final TransactionStatus _vendorReturnAuthorizationCancelled = new TransactionStatus("_vendorReturnAuthorizationCancelled");
    public static final TransactionStatus _vendorReturnAuthorizationClosed = new TransactionStatus("_vendorReturnAuthorizationClosed");
    public static final TransactionStatus _vendorReturnAuthorizationCredited = new TransactionStatus("_vendorReturnAuthorizationCredited");
    public static final TransactionStatus _vendorReturnAuthorizationPartiallyReturned = new TransactionStatus("_vendorReturnAuthorizationPartiallyReturned");
    public static final TransactionStatus _vendorReturnAuthorizationPendingApproval = new TransactionStatus("_vendorReturnAuthorizationPendingApproval");
    public static final TransactionStatus _vendorReturnAuthorizationPendingCredit = new TransactionStatus("_vendorReturnAuthorizationPendingCredit");
    public static final TransactionStatus _vendorReturnAuthorizationPendingCreditPartiallyReturned = new TransactionStatus("_vendorReturnAuthorizationPendingCreditPartiallyReturned");
    public static final TransactionStatus _vendorReturnAuthorizationPendingReturn = new TransactionStatus("_vendorReturnAuthorizationPendingReturn");
    public static final TransactionStatus _workOrderBuilt = new TransactionStatus("_workOrderBuilt");
    public static final TransactionStatus _workOrderCancelled = new TransactionStatus("_workOrderCancelled");
    public static final TransactionStatus _workOrderClosed = new TransactionStatus("_workOrderClosed");
    public static final TransactionStatus _workOrderPartiallyBuilt = new TransactionStatus("_workOrderPartiallyBuilt");
    public static final TransactionStatus _workOrderPendingBuild = new TransactionStatus("_workOrderPendingBuild");
    public static final TransactionStatus _workOrderPlanned = new TransactionStatus("_workOrderPlanned");
    private static TypeDesc typeDesc = new TypeDesc(TransactionStatus.class);

    protected TransactionStatus(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static TransactionStatus fromValue(String value) throws IllegalArgumentException {
        TransactionStatus enumeration = (TransactionStatus)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static TransactionStatus fromString(String value) throws IllegalArgumentException {
        return TransactionStatus.fromValue(value);
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return this.toString().hashCode();
    }

    public String toString() {
        return this._value_;
    }

    public Object readResolve() throws ObjectStreamException {
        return TransactionStatus.fromValue(this._value_);
    }

    public static Serializer getSerializer(String mechType, Class _javaType, QName _xmlType) {
        return new EnumSerializer(_javaType, _xmlType);
    }

    public static Deserializer getDeserializer(String mechType, Class _javaType, QName _xmlType) {
        return new EnumDeserializer(_javaType, _xmlType);
    }

    public static TypeDesc getTypeDesc() {
        return typeDesc;
    }

    static {
        typeDesc.setXmlType(new QName("urn:types.sales_2022_1.transactions.webservices.netsuite.com", "TransactionStatus"));
    }
}

