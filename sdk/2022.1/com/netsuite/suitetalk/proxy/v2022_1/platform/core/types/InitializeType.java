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
package com.netsuite.suitetalk.proxy.v2022_1.platform.core.types;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

public class InitializeType
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String _assemblyBuild = "assemblyBuild";
    public static final String _assemblyUnbuild = "assemblyUnbuild";
    public static final String _binWorksheet = "binWorksheet";
    public static final String _cashRefund = "cashRefund";
    public static final String _cashSale = "cashSale";
    public static final String _creditMemo = "creditMemo";
    public static final String _customerPayment = "customerPayment";
    public static final String _customerRefund = "customerRefund";
    public static final String _customPurchase = "customPurchase";
    public static final String _customSale = "customSale";
    public static final String _depositApplication = "depositApplication";
    public static final String _estimate = "estimate";
    public static final String _invoice = "invoice";
    public static final String _itemFulfillment = "itemFulfillment";
    public static final String _itemReceipt = "itemReceipt";
    public static final String _inventoryTransfer = "inventoryTransfer";
    public static final String _purchaseOrder = "purchaseOrder";
    public static final String _returnAuthorization = "returnAuthorization";
    public static final String _salesOrder = "salesOrder";
    public static final String _vendorBill = "vendorBill";
    public static final String _vendorCredit = "vendorCredit";
    public static final String _vendorReturnAuthorization = "vendorReturnAuthorization";
    public static final String _vendorPayment = "vendorPayment";
    public static final String _workOrder = "workOrder";
    public static final String _workOrderIssue = "workOrderIssue";
    public static final String _workOrderCompletion = "workOrderCompletion";
    public static final String _workOrderClose = "workOrderClose";
    public static final InitializeType assemblyBuild = new InitializeType("assemblyBuild");
    public static final InitializeType assemblyUnbuild = new InitializeType("assemblyUnbuild");
    public static final InitializeType binWorksheet = new InitializeType("binWorksheet");
    public static final InitializeType cashRefund = new InitializeType("cashRefund");
    public static final InitializeType cashSale = new InitializeType("cashSale");
    public static final InitializeType creditMemo = new InitializeType("creditMemo");
    public static final InitializeType customerPayment = new InitializeType("customerPayment");
    public static final InitializeType customerRefund = new InitializeType("customerRefund");
    public static final InitializeType customPurchase = new InitializeType("customPurchase");
    public static final InitializeType customSale = new InitializeType("customSale");
    public static final InitializeType depositApplication = new InitializeType("depositApplication");
    public static final InitializeType estimate = new InitializeType("estimate");
    public static final InitializeType invoice = new InitializeType("invoice");
    public static final InitializeType itemFulfillment = new InitializeType("itemFulfillment");
    public static final InitializeType itemReceipt = new InitializeType("itemReceipt");
    public static final InitializeType inventoryTransfer = new InitializeType("inventoryTransfer");
    public static final InitializeType purchaseOrder = new InitializeType("purchaseOrder");
    public static final InitializeType returnAuthorization = new InitializeType("returnAuthorization");
    public static final InitializeType salesOrder = new InitializeType("salesOrder");
    public static final InitializeType vendorBill = new InitializeType("vendorBill");
    public static final InitializeType vendorCredit = new InitializeType("vendorCredit");
    public static final InitializeType vendorReturnAuthorization = new InitializeType("vendorReturnAuthorization");
    public static final InitializeType vendorPayment = new InitializeType("vendorPayment");
    public static final InitializeType workOrder = new InitializeType("workOrder");
    public static final InitializeType workOrderIssue = new InitializeType("workOrderIssue");
    public static final InitializeType workOrderCompletion = new InitializeType("workOrderCompletion");
    public static final InitializeType workOrderClose = new InitializeType("workOrderClose");
    private static TypeDesc typeDesc = new TypeDesc(InitializeType.class);

    protected InitializeType(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static InitializeType fromValue(String value) throws IllegalArgumentException {
        InitializeType enumeration = (InitializeType)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static InitializeType fromString(String value) throws IllegalArgumentException {
        return InitializeType.fromValue(value);
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
        return InitializeType.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.core_2022_1.platform.webservices.netsuite.com", "InitializeType"));
    }
}

