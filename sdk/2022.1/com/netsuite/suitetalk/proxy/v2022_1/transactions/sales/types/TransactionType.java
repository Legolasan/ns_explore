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

public class TransactionType
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __assemblyBuild = "_assemblyBuild";
    public static final String __assemblyUnbuild = "_assemblyUnbuild";
    public static final String __binTransfer = "_binTransfer";
    public static final String __binWorksheet = "_binWorksheet";
    public static final String __cashRefund = "_cashRefund";
    public static final String __cashSale = "_cashSale";
    public static final String __check = "_check";
    public static final String __creditMemo = "_creditMemo";
    public static final String __custom = "_custom";
    public static final String __customPurchase = "_customPurchase";
    public static final String __customSale = "_customSale";
    public static final String __customerDeposit = "_customerDeposit";
    public static final String __customerPayment = "_customerPayment";
    public static final String __customerRefund = "_customerRefund";
    public static final String __deposit = "_deposit";
    public static final String __depositApplication = "_depositApplication";
    public static final String __estimate = "_estimate";
    public static final String __expenseReport = "_expenseReport";
    public static final String __inboundShipment = "_inboundShipment";
    public static final String __inventoryAdjustment = "_inventoryAdjustment";
    public static final String __inventoryCostRevaluation = "_inventoryCostRevaluation";
    public static final String __inventoryTransfer = "_inventoryTransfer";
    public static final String __invoice = "_invoice";
    public static final String __itemFulfillment = "_itemFulfillment";
    public static final String __itemReceipt = "_itemReceipt";
    public static final String __journal = "_journal";
    public static final String __opportunity = "_opportunity";
    public static final String __paycheck = "_paycheck";
    public static final String __paycheckJournal = "_paycheckJournal";
    public static final String __periodEndJournal = "_periodEndJournal";
    public static final String __purchaseOrder = "_purchaseOrder";
    public static final String __requisition = "_requisition";
    public static final String __returnAuthorization = "_returnAuthorization";
    public static final String __salesOrder = "_salesOrder";
    public static final String __transferOrder = "_transferOrder";
    public static final String __vendorBill = "_vendorBill";
    public static final String __vendorCredit = "_vendorCredit";
    public static final String __vendorPayment = "_vendorPayment";
    public static final String __vendorReturnAuthorization = "_vendorReturnAuthorization";
    public static final String __workOrder = "_workOrder";
    public static final String __workOrderClose = "_workOrderClose";
    public static final String __workOrderCompletion = "_workOrderCompletion";
    public static final String __workOrderIssue = "_workOrderIssue";
    public static final TransactionType _assemblyBuild = new TransactionType("_assemblyBuild");
    public static final TransactionType _assemblyUnbuild = new TransactionType("_assemblyUnbuild");
    public static final TransactionType _binTransfer = new TransactionType("_binTransfer");
    public static final TransactionType _binWorksheet = new TransactionType("_binWorksheet");
    public static final TransactionType _cashRefund = new TransactionType("_cashRefund");
    public static final TransactionType _cashSale = new TransactionType("_cashSale");
    public static final TransactionType _check = new TransactionType("_check");
    public static final TransactionType _creditMemo = new TransactionType("_creditMemo");
    public static final TransactionType _custom = new TransactionType("_custom");
    public static final TransactionType _customPurchase = new TransactionType("_customPurchase");
    public static final TransactionType _customSale = new TransactionType("_customSale");
    public static final TransactionType _customerDeposit = new TransactionType("_customerDeposit");
    public static final TransactionType _customerPayment = new TransactionType("_customerPayment");
    public static final TransactionType _customerRefund = new TransactionType("_customerRefund");
    public static final TransactionType _deposit = new TransactionType("_deposit");
    public static final TransactionType _depositApplication = new TransactionType("_depositApplication");
    public static final TransactionType _estimate = new TransactionType("_estimate");
    public static final TransactionType _expenseReport = new TransactionType("_expenseReport");
    public static final TransactionType _inboundShipment = new TransactionType("_inboundShipment");
    public static final TransactionType _inventoryAdjustment = new TransactionType("_inventoryAdjustment");
    public static final TransactionType _inventoryCostRevaluation = new TransactionType("_inventoryCostRevaluation");
    public static final TransactionType _inventoryTransfer = new TransactionType("_inventoryTransfer");
    public static final TransactionType _invoice = new TransactionType("_invoice");
    public static final TransactionType _itemFulfillment = new TransactionType("_itemFulfillment");
    public static final TransactionType _itemReceipt = new TransactionType("_itemReceipt");
    public static final TransactionType _journal = new TransactionType("_journal");
    public static final TransactionType _opportunity = new TransactionType("_opportunity");
    public static final TransactionType _paycheck = new TransactionType("_paycheck");
    public static final TransactionType _paycheckJournal = new TransactionType("_paycheckJournal");
    public static final TransactionType _periodEndJournal = new TransactionType("_periodEndJournal");
    public static final TransactionType _purchaseOrder = new TransactionType("_purchaseOrder");
    public static final TransactionType _requisition = new TransactionType("_requisition");
    public static final TransactionType _returnAuthorization = new TransactionType("_returnAuthorization");
    public static final TransactionType _salesOrder = new TransactionType("_salesOrder");
    public static final TransactionType _transferOrder = new TransactionType("_transferOrder");
    public static final TransactionType _vendorBill = new TransactionType("_vendorBill");
    public static final TransactionType _vendorCredit = new TransactionType("_vendorCredit");
    public static final TransactionType _vendorPayment = new TransactionType("_vendorPayment");
    public static final TransactionType _vendorReturnAuthorization = new TransactionType("_vendorReturnAuthorization");
    public static final TransactionType _workOrder = new TransactionType("_workOrder");
    public static final TransactionType _workOrderClose = new TransactionType("_workOrderClose");
    public static final TransactionType _workOrderCompletion = new TransactionType("_workOrderCompletion");
    public static final TransactionType _workOrderIssue = new TransactionType("_workOrderIssue");
    private static TypeDesc typeDesc = new TypeDesc(TransactionType.class);

    protected TransactionType(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static TransactionType fromValue(String value) throws IllegalArgumentException {
        TransactionType enumeration = (TransactionType)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static TransactionType fromString(String value) throws IllegalArgumentException {
        return TransactionType.fromValue(value);
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
        return TransactionType.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.sales_2022_1.transactions.webservices.netsuite.com", "TransactionType"));
    }
}

