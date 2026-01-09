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

public class InitializeRefType
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String _assemblyItem = "assemblyItem";
    public static final String _assemblyBuild = "assemblyBuild";
    public static final String _cashSale = "cashSale";
    public static final String _creditMemo = "creditMemo";
    public static final String _customer = "customer";
    public static final String _customerDeposit = "customerDeposit";
    public static final String _customPurchase = "customPurchase";
    public static final String _customSale = "customSale";
    public static final String _employee = "employee";
    public static final String _estimate = "estimate";
    public static final String _interCompanyTransferOrder = "interCompanyTransferOrder";
    public static final String _invoice = "invoice";
    public static final String _location = "location";
    public static final String _lotNumberedAssemblyItem = "lotNumberedAssemblyItem";
    public static final String _opportunity = "opportunity";
    public static final String _purchaseOrder = "purchaseOrder";
    public static final String _purchaseRequisition = "purchaseRequisition";
    public static final String _returnAuthorization = "returnAuthorization";
    public static final String _salesOrder = "salesOrder";
    public static final String _serializedAssemblyItem = "serializedAssemblyItem";
    public static final String _transferOrder = "transferOrder";
    public static final String _vendor = "vendor";
    public static final String _vendorBill = "vendorBill";
    public static final String _vendorReturnAuthorization = "vendorReturnAuthorization";
    public static final String _workOrder = "workOrder";
    public static final InitializeRefType assemblyItem = new InitializeRefType("assemblyItem");
    public static final InitializeRefType assemblyBuild = new InitializeRefType("assemblyBuild");
    public static final InitializeRefType cashSale = new InitializeRefType("cashSale");
    public static final InitializeRefType creditMemo = new InitializeRefType("creditMemo");
    public static final InitializeRefType customer = new InitializeRefType("customer");
    public static final InitializeRefType customerDeposit = new InitializeRefType("customerDeposit");
    public static final InitializeRefType customPurchase = new InitializeRefType("customPurchase");
    public static final InitializeRefType customSale = new InitializeRefType("customSale");
    public static final InitializeRefType employee = new InitializeRefType("employee");
    public static final InitializeRefType estimate = new InitializeRefType("estimate");
    public static final InitializeRefType interCompanyTransferOrder = new InitializeRefType("interCompanyTransferOrder");
    public static final InitializeRefType invoice = new InitializeRefType("invoice");
    public static final InitializeRefType location = new InitializeRefType("location");
    public static final InitializeRefType lotNumberedAssemblyItem = new InitializeRefType("lotNumberedAssemblyItem");
    public static final InitializeRefType opportunity = new InitializeRefType("opportunity");
    public static final InitializeRefType purchaseOrder = new InitializeRefType("purchaseOrder");
    public static final InitializeRefType purchaseRequisition = new InitializeRefType("purchaseRequisition");
    public static final InitializeRefType returnAuthorization = new InitializeRefType("returnAuthorization");
    public static final InitializeRefType salesOrder = new InitializeRefType("salesOrder");
    public static final InitializeRefType serializedAssemblyItem = new InitializeRefType("serializedAssemblyItem");
    public static final InitializeRefType transferOrder = new InitializeRefType("transferOrder");
    public static final InitializeRefType vendor = new InitializeRefType("vendor");
    public static final InitializeRefType vendorBill = new InitializeRefType("vendorBill");
    public static final InitializeRefType vendorReturnAuthorization = new InitializeRefType("vendorReturnAuthorization");
    public static final InitializeRefType workOrder = new InitializeRefType("workOrder");
    private static TypeDesc typeDesc = new TypeDesc(InitializeRefType.class);

    protected InitializeRefType(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static InitializeRefType fromValue(String value) throws IllegalArgumentException {
        InitializeRefType enumeration = (InitializeRefType)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static InitializeRefType fromString(String value) throws IllegalArgumentException {
        return InitializeRefType.fromValue(value);
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
        return InitializeRefType.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.core_2022_1.platform.webservices.netsuite.com", "InitializeRefType"));
    }
}

