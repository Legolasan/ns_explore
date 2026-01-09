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

public class TransactionLineType
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __adjustedQuantity = "_adjustedQuantity";
    public static final String __advanceToApplyAmount = "_advanceToApplyAmount";
    public static final String __billExchangeRateVariance = "_billExchangeRateVariance";
    public static final String __billPriceVariance = "_billPriceVariance";
    public static final String __billQuantityVariance = "_billQuantityVariance";
    public static final String __countQuantity = "_countQuantity";
    public static final String __dropshipExpense = "_dropshipExpense";
    public static final String __gainLoss = "_gainLoss";
    public static final String __inTransit = "_inTransit";
    public static final String __item = "_item";
    public static final String __materialOverhead = "_materialOverhead";
    public static final String __nonReimbursuableExpenseOffset = "_nonReimbursuableExpenseOffset";
    public static final String __nonReimbursuableExpenseOriginal = "_nonReimbursuableExpenseOriginal";
    public static final String __outsourcingCharge = "_outsourcingCharge";
    public static final String __ownershipTransfer = "_ownershipTransfer";
    public static final String __personalExpensesNettingLine = "_personalExpensesNettingLine";
    public static final String __personalExpensesTheExpenseLine = "_personalExpensesTheExpenseLine";
    public static final String __pickingLine = "_pickingLine";
    public static final String __productionPriceVariance = "_productionPriceVariance";
    public static final String __productionQuantityVariance = "_productionQuantityVariance";
    public static final String __purchasePriceVariance = "_purchasePriceVariance";
    public static final String __receiving = "_receiving";
    public static final String __routingItem = "_routingItem";
    public static final String __routingWorkInProcess = "_routingWorkInProcess";
    public static final String __scrap = "_scrap";
    public static final String __shipping = "_shipping";
    public static final String __snapshotQuantity = "_snapshotQuantity";
    public static final String __stagingLine = "_stagingLine";
    public static final String __totalBillVariance = "_totalBillVariance";
    public static final String __unbuildVariance = "_unbuildVariance";
    public static final String __workInProcess = "_workInProcess";
    public static final String __workInProcessVariance = "_workInProcessVariance";
    public static final TransactionLineType _adjustedQuantity = new TransactionLineType("_adjustedQuantity");
    public static final TransactionLineType _advanceToApplyAmount = new TransactionLineType("_advanceToApplyAmount");
    public static final TransactionLineType _billExchangeRateVariance = new TransactionLineType("_billExchangeRateVariance");
    public static final TransactionLineType _billPriceVariance = new TransactionLineType("_billPriceVariance");
    public static final TransactionLineType _billQuantityVariance = new TransactionLineType("_billQuantityVariance");
    public static final TransactionLineType _countQuantity = new TransactionLineType("_countQuantity");
    public static final TransactionLineType _dropshipExpense = new TransactionLineType("_dropshipExpense");
    public static final TransactionLineType _gainLoss = new TransactionLineType("_gainLoss");
    public static final TransactionLineType _inTransit = new TransactionLineType("_inTransit");
    public static final TransactionLineType _item = new TransactionLineType("_item");
    public static final TransactionLineType _materialOverhead = new TransactionLineType("_materialOverhead");
    public static final TransactionLineType _nonReimbursuableExpenseOffset = new TransactionLineType("_nonReimbursuableExpenseOffset");
    public static final TransactionLineType _nonReimbursuableExpenseOriginal = new TransactionLineType("_nonReimbursuableExpenseOriginal");
    public static final TransactionLineType _outsourcingCharge = new TransactionLineType("_outsourcingCharge");
    public static final TransactionLineType _ownershipTransfer = new TransactionLineType("_ownershipTransfer");
    public static final TransactionLineType _personalExpensesNettingLine = new TransactionLineType("_personalExpensesNettingLine");
    public static final TransactionLineType _personalExpensesTheExpenseLine = new TransactionLineType("_personalExpensesTheExpenseLine");
    public static final TransactionLineType _pickingLine = new TransactionLineType("_pickingLine");
    public static final TransactionLineType _productionPriceVariance = new TransactionLineType("_productionPriceVariance");
    public static final TransactionLineType _productionQuantityVariance = new TransactionLineType("_productionQuantityVariance");
    public static final TransactionLineType _purchasePriceVariance = new TransactionLineType("_purchasePriceVariance");
    public static final TransactionLineType _receiving = new TransactionLineType("_receiving");
    public static final TransactionLineType _routingItem = new TransactionLineType("_routingItem");
    public static final TransactionLineType _routingWorkInProcess = new TransactionLineType("_routingWorkInProcess");
    public static final TransactionLineType _scrap = new TransactionLineType("_scrap");
    public static final TransactionLineType _shipping = new TransactionLineType("_shipping");
    public static final TransactionLineType _snapshotQuantity = new TransactionLineType("_snapshotQuantity");
    public static final TransactionLineType _stagingLine = new TransactionLineType("_stagingLine");
    public static final TransactionLineType _totalBillVariance = new TransactionLineType("_totalBillVariance");
    public static final TransactionLineType _unbuildVariance = new TransactionLineType("_unbuildVariance");
    public static final TransactionLineType _workInProcess = new TransactionLineType("_workInProcess");
    public static final TransactionLineType _workInProcessVariance = new TransactionLineType("_workInProcessVariance");
    private static TypeDesc typeDesc = new TypeDesc(TransactionLineType.class);

    protected TransactionLineType(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static TransactionLineType fromValue(String value) throws IllegalArgumentException {
        TransactionLineType enumeration = (TransactionLineType)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static TransactionLineType fromString(String value) throws IllegalArgumentException {
        return TransactionLineType.fromValue(value);
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
        return TransactionLineType.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.sales_2022_1.transactions.webservices.netsuite.com", "TransactionLineType"));
    }
}

