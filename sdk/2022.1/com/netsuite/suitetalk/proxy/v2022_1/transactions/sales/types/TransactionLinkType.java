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

public class TransactionLinkType
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __advancedCostAmortization = "_advancedCostAmortization";
    public static final String __advancedExpenseAmortization = "_advancedExpenseAmortization";
    public static final String __authorizationDeposit = "_authorizationDeposit";
    public static final String __billReceipt = "_billReceipt";
    public static final String __blcgaJeFullfillment = "_blcgaJeFullfillment";
    public static final String __captureAuthorization = "_captureAuthorization";
    public static final String __closedPeriodFxVariance = "_closedPeriodFxVariance";
    public static final String __closeWorkOrder = "_closeWorkOrder";
    public static final String __cogsLink = "_cogsLink";
    public static final String __collectTegata = "_collectTegata";
    public static final String __commission = "_commission";
    public static final String __contractCostDeferral = "_contractCostDeferral";
    public static final String __contractCostDeferralReversal = "_contractCostDeferralReversal";
    public static final String __deferredRevenueReallocation = "_deferredRevenueReallocation";
    public static final String __depositApplication = "_depositApplication";
    public static final String __depositRefundCheck = "_depositRefundCheck";
    public static final String __discountTegata = "_discountTegata";
    public static final String __dropShipment = "_dropShipment";
    public static final String __endorseTegata = "_endorseTegata";
    public static final String __estimateInvoicing = "_estimateInvoicing";
    public static final String __foreignCurrencyGainLossOnContractAsset = "_foreignCurrencyGainLossOnContractAsset";
    public static final String __fulfillmentRequestFulfillment = "_fulfillmentRequestFulfillment";
    public static final String __glImpactAdjustment = "_glImpactAdjustment";
    public static final String __intercompanyAdjustment = "_intercompanyAdjustment";
    public static final String __inTransitPayment = "_inTransitPayment";
    public static final String __inventoryCountAdjustment = "_inventoryCountAdjustment";
    public static final String __kitShipment = "_kitShipment";
    public static final String __landedCost = "_landedCost";
    public static final String __linkedReturnCost = "_linkedReturnCost";
    public static final String __netContractAssetOrLiabilityPerElement = "_netContractAssetOrLiabilityPerElement";
    public static final String __opportunityClose = "_opportunityClose";
    public static final String __opportunityEstimate = "_opportunityEstimate";
    public static final String __orderBillInvoice = "_orderBillInvoice";
    public static final String __orderFulfillmentRequest = "_orderFulfillmentRequest";
    public static final String __orderPickingPacking = "_orderPickingPacking";
    public static final String __outsourcedManufacturing = "_outsourcedManufacturing";
    public static final String __ownershipTransferItemReceipt = "_ownershipTransferItemReceipt";
    public static final String __payment = "_payment";
    public static final String __paymentRefund = "_paymentRefund";
    public static final String __payTegata = "_payTegata";
    public static final String __poToOwnershipTransfer = "_poToOwnershipTransfer";
    public static final String __prepaymentApplication = "_prepaymentApplication";
    public static final String __purchaseContractOrder = "_purchaseContractOrder";
    public static final String __purchaseOrderPrepayment = "_purchaseOrderPrepayment";
    public static final String __purchaseOrderRequisition = "_purchaseOrderRequisition";
    public static final String __purchaseOrderToBlanket = "_purchaseOrderToBlanket";
    public static final String __purchaseReturn = "_purchaseReturn";
    public static final String __receiptBill = "_receiptBill";
    public static final String __receiptFulfillment = "_receiptFulfillment";
    public static final String __reimbursement = "_reimbursement";
    public static final String __reservationShipment = "_reservationShipment";
    public static final String __revalueWorkOrder = "_revalueWorkOrder";
    public static final String __revenueAmortizatonRecognition = "_revenueAmortizatonRecognition";
    public static final String __revenueArrangement = "_revenueArrangement";
    public static final String __revenueCommitted = "_revenueCommitted";
    public static final String __rfqToVendorRfq = "_rfqToVendorRfq";
    public static final String __saleReturn = "_saleReturn";
    public static final String __salesOrderAuthorization = "_salesOrderAuthorization";
    public static final String __salesOrderDegross = "_salesOrderDegross";
    public static final String __salesOrderDeposit = "_salesOrderDeposit";
    public static final String __salesOrderRevenueRevaluation = "_salesOrderRevenueRevaluation";
    public static final String __sourceOfRevenueContract = "_sourceOfRevenueContract";
    public static final String __specialOrder = "_specialOrder";
    public static final String __systemJournal = "_systemJournal";
    public static final String __transferOrderFulfillmentReceipt = "_transferOrderFulfillmentReceipt";
    public static final String __transformation = "_transformation";
    public static final String __vendorBillVariance = "_vendorBillVariance";
    public static final String __vendorRfqToPurchaseContract = "_vendorRfqToPurchaseContract";
    public static final String __waveOrder = "_waveOrder";
    public static final String __waveShipment = "_waveShipment";
    public static final String __wipBuild = "_wipBuild";
    public static final String __workOrderBuild = "_workOrderBuild";
    public static final TransactionLinkType _advancedCostAmortization = new TransactionLinkType("_advancedCostAmortization");
    public static final TransactionLinkType _advancedExpenseAmortization = new TransactionLinkType("_advancedExpenseAmortization");
    public static final TransactionLinkType _authorizationDeposit = new TransactionLinkType("_authorizationDeposit");
    public static final TransactionLinkType _billReceipt = new TransactionLinkType("_billReceipt");
    public static final TransactionLinkType _blcgaJeFullfillment = new TransactionLinkType("_blcgaJeFullfillment");
    public static final TransactionLinkType _captureAuthorization = new TransactionLinkType("_captureAuthorization");
    public static final TransactionLinkType _closedPeriodFxVariance = new TransactionLinkType("_closedPeriodFxVariance");
    public static final TransactionLinkType _closeWorkOrder = new TransactionLinkType("_closeWorkOrder");
    public static final TransactionLinkType _cogsLink = new TransactionLinkType("_cogsLink");
    public static final TransactionLinkType _collectTegata = new TransactionLinkType("_collectTegata");
    public static final TransactionLinkType _commission = new TransactionLinkType("_commission");
    public static final TransactionLinkType _contractCostDeferral = new TransactionLinkType("_contractCostDeferral");
    public static final TransactionLinkType _contractCostDeferralReversal = new TransactionLinkType("_contractCostDeferralReversal");
    public static final TransactionLinkType _deferredRevenueReallocation = new TransactionLinkType("_deferredRevenueReallocation");
    public static final TransactionLinkType _depositApplication = new TransactionLinkType("_depositApplication");
    public static final TransactionLinkType _depositRefundCheck = new TransactionLinkType("_depositRefundCheck");
    public static final TransactionLinkType _discountTegata = new TransactionLinkType("_discountTegata");
    public static final TransactionLinkType _dropShipment = new TransactionLinkType("_dropShipment");
    public static final TransactionLinkType _endorseTegata = new TransactionLinkType("_endorseTegata");
    public static final TransactionLinkType _estimateInvoicing = new TransactionLinkType("_estimateInvoicing");
    public static final TransactionLinkType _foreignCurrencyGainLossOnContractAsset = new TransactionLinkType("_foreignCurrencyGainLossOnContractAsset");
    public static final TransactionLinkType _fulfillmentRequestFulfillment = new TransactionLinkType("_fulfillmentRequestFulfillment");
    public static final TransactionLinkType _glImpactAdjustment = new TransactionLinkType("_glImpactAdjustment");
    public static final TransactionLinkType _intercompanyAdjustment = new TransactionLinkType("_intercompanyAdjustment");
    public static final TransactionLinkType _inTransitPayment = new TransactionLinkType("_inTransitPayment");
    public static final TransactionLinkType _inventoryCountAdjustment = new TransactionLinkType("_inventoryCountAdjustment");
    public static final TransactionLinkType _kitShipment = new TransactionLinkType("_kitShipment");
    public static final TransactionLinkType _landedCost = new TransactionLinkType("_landedCost");
    public static final TransactionLinkType _linkedReturnCost = new TransactionLinkType("_linkedReturnCost");
    public static final TransactionLinkType _netContractAssetOrLiabilityPerElement = new TransactionLinkType("_netContractAssetOrLiabilityPerElement");
    public static final TransactionLinkType _opportunityClose = new TransactionLinkType("_opportunityClose");
    public static final TransactionLinkType _opportunityEstimate = new TransactionLinkType("_opportunityEstimate");
    public static final TransactionLinkType _orderBillInvoice = new TransactionLinkType("_orderBillInvoice");
    public static final TransactionLinkType _orderFulfillmentRequest = new TransactionLinkType("_orderFulfillmentRequest");
    public static final TransactionLinkType _orderPickingPacking = new TransactionLinkType("_orderPickingPacking");
    public static final TransactionLinkType _outsourcedManufacturing = new TransactionLinkType("_outsourcedManufacturing");
    public static final TransactionLinkType _ownershipTransferItemReceipt = new TransactionLinkType("_ownershipTransferItemReceipt");
    public static final TransactionLinkType _payment = new TransactionLinkType("_payment");
    public static final TransactionLinkType _paymentRefund = new TransactionLinkType("_paymentRefund");
    public static final TransactionLinkType _payTegata = new TransactionLinkType("_payTegata");
    public static final TransactionLinkType _poToOwnershipTransfer = new TransactionLinkType("_poToOwnershipTransfer");
    public static final TransactionLinkType _prepaymentApplication = new TransactionLinkType("_prepaymentApplication");
    public static final TransactionLinkType _purchaseContractOrder = new TransactionLinkType("_purchaseContractOrder");
    public static final TransactionLinkType _purchaseOrderPrepayment = new TransactionLinkType("_purchaseOrderPrepayment");
    public static final TransactionLinkType _purchaseOrderRequisition = new TransactionLinkType("_purchaseOrderRequisition");
    public static final TransactionLinkType _purchaseOrderToBlanket = new TransactionLinkType("_purchaseOrderToBlanket");
    public static final TransactionLinkType _purchaseReturn = new TransactionLinkType("_purchaseReturn");
    public static final TransactionLinkType _receiptBill = new TransactionLinkType("_receiptBill");
    public static final TransactionLinkType _receiptFulfillment = new TransactionLinkType("_receiptFulfillment");
    public static final TransactionLinkType _reimbursement = new TransactionLinkType("_reimbursement");
    public static final TransactionLinkType _reservationShipment = new TransactionLinkType("_reservationShipment");
    public static final TransactionLinkType _revalueWorkOrder = new TransactionLinkType("_revalueWorkOrder");
    public static final TransactionLinkType _revenueAmortizatonRecognition = new TransactionLinkType("_revenueAmortizatonRecognition");
    public static final TransactionLinkType _revenueArrangement = new TransactionLinkType("_revenueArrangement");
    public static final TransactionLinkType _revenueCommitted = new TransactionLinkType("_revenueCommitted");
    public static final TransactionLinkType _rfqToVendorRfq = new TransactionLinkType("_rfqToVendorRfq");
    public static final TransactionLinkType _saleReturn = new TransactionLinkType("_saleReturn");
    public static final TransactionLinkType _salesOrderAuthorization = new TransactionLinkType("_salesOrderAuthorization");
    public static final TransactionLinkType _salesOrderDegross = new TransactionLinkType("_salesOrderDegross");
    public static final TransactionLinkType _salesOrderDeposit = new TransactionLinkType("_salesOrderDeposit");
    public static final TransactionLinkType _salesOrderRevenueRevaluation = new TransactionLinkType("_salesOrderRevenueRevaluation");
    public static final TransactionLinkType _sourceOfRevenueContract = new TransactionLinkType("_sourceOfRevenueContract");
    public static final TransactionLinkType _specialOrder = new TransactionLinkType("_specialOrder");
    public static final TransactionLinkType _systemJournal = new TransactionLinkType("_systemJournal");
    public static final TransactionLinkType _transferOrderFulfillmentReceipt = new TransactionLinkType("_transferOrderFulfillmentReceipt");
    public static final TransactionLinkType _transformation = new TransactionLinkType("_transformation");
    public static final TransactionLinkType _vendorBillVariance = new TransactionLinkType("_vendorBillVariance");
    public static final TransactionLinkType _vendorRfqToPurchaseContract = new TransactionLinkType("_vendorRfqToPurchaseContract");
    public static final TransactionLinkType _waveOrder = new TransactionLinkType("_waveOrder");
    public static final TransactionLinkType _waveShipment = new TransactionLinkType("_waveShipment");
    public static final TransactionLinkType _wipBuild = new TransactionLinkType("_wipBuild");
    public static final TransactionLinkType _workOrderBuild = new TransactionLinkType("_workOrderBuild");
    private static TypeDesc typeDesc = new TypeDesc(TransactionLinkType.class);

    protected TransactionLinkType(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static TransactionLinkType fromValue(String value) throws IllegalArgumentException {
        TransactionLinkType enumeration = (TransactionLinkType)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static TransactionLinkType fromString(String value) throws IllegalArgumentException {
        return TransactionLinkType.fromValue(value);
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
        return TransactionLinkType.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.sales_2022_1.transactions.webservices.netsuite.com", "TransactionLinkType"));
    }
}

