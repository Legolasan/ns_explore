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
package com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.types;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

public class ItemAccountMappingItemAccount
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __asset = "_asset";
    public static final String __costOfGoods = "_costOfGoods";
    public static final String __customerReturnVariance = "_customerReturnVariance";
    public static final String __deferral = "_deferral";
    public static final String __deferredRevenue = "_deferredRevenue";
    public static final String __discount = "_discount";
    public static final String __dropShipExpense = "_dropShipExpense";
    public static final String __exchangeRateVariance = "_exchangeRateVariance";
    public static final String __expense = "_expense";
    public static final String __foreignCurrencyAdjustmentRevenueAccount = "_foreignCurrencyAdjustmentRevenueAccount";
    public static final String __gainLoss = "_gainLoss";
    public static final String __income = "_income";
    public static final String __intercompanyCostOfGoods = "_intercompanyCostOfGoods";
    public static final String __intercompanyDeferredRevenue = "_intercompanyDeferredRevenue";
    public static final String __intercompanyExpense = "_intercompanyExpense";
    public static final String __intercompanyIncome = "_intercompanyIncome";
    public static final String __liability = "_liability";
    public static final String __markup = "_markup";
    public static final String __payment = "_payment";
    public static final String __priceVariance = "_priceVariance";
    public static final String __productionPriceVariance = "_productionPriceVariance";
    public static final String __productionQuantityVariance = "_productionQuantityVariance";
    public static final String __purchasePriceVariance = "_purchasePriceVariance";
    public static final String __quantityVariance = "_quantityVariance";
    public static final String __scrap = "_scrap";
    public static final String __unbuildVariance = "_unbuildVariance";
    public static final String __vendorReturnVariance = "_vendorReturnVariance";
    public static final String __wipVariance = "_wipVariance";
    public static final String __workInProcess = "_workInProcess";
    public static final String __writeOff = "_writeOff";
    public static final ItemAccountMappingItemAccount _asset = new ItemAccountMappingItemAccount("_asset");
    public static final ItemAccountMappingItemAccount _costOfGoods = new ItemAccountMappingItemAccount("_costOfGoods");
    public static final ItemAccountMappingItemAccount _customerReturnVariance = new ItemAccountMappingItemAccount("_customerReturnVariance");
    public static final ItemAccountMappingItemAccount _deferral = new ItemAccountMappingItemAccount("_deferral");
    public static final ItemAccountMappingItemAccount _deferredRevenue = new ItemAccountMappingItemAccount("_deferredRevenue");
    public static final ItemAccountMappingItemAccount _discount = new ItemAccountMappingItemAccount("_discount");
    public static final ItemAccountMappingItemAccount _dropShipExpense = new ItemAccountMappingItemAccount("_dropShipExpense");
    public static final ItemAccountMappingItemAccount _exchangeRateVariance = new ItemAccountMappingItemAccount("_exchangeRateVariance");
    public static final ItemAccountMappingItemAccount _expense = new ItemAccountMappingItemAccount("_expense");
    public static final ItemAccountMappingItemAccount _foreignCurrencyAdjustmentRevenueAccount = new ItemAccountMappingItemAccount("_foreignCurrencyAdjustmentRevenueAccount");
    public static final ItemAccountMappingItemAccount _gainLoss = new ItemAccountMappingItemAccount("_gainLoss");
    public static final ItemAccountMappingItemAccount _income = new ItemAccountMappingItemAccount("_income");
    public static final ItemAccountMappingItemAccount _intercompanyCostOfGoods = new ItemAccountMappingItemAccount("_intercompanyCostOfGoods");
    public static final ItemAccountMappingItemAccount _intercompanyDeferredRevenue = new ItemAccountMappingItemAccount("_intercompanyDeferredRevenue");
    public static final ItemAccountMappingItemAccount _intercompanyExpense = new ItemAccountMappingItemAccount("_intercompanyExpense");
    public static final ItemAccountMappingItemAccount _intercompanyIncome = new ItemAccountMappingItemAccount("_intercompanyIncome");
    public static final ItemAccountMappingItemAccount _liability = new ItemAccountMappingItemAccount("_liability");
    public static final ItemAccountMappingItemAccount _markup = new ItemAccountMappingItemAccount("_markup");
    public static final ItemAccountMappingItemAccount _payment = new ItemAccountMappingItemAccount("_payment");
    public static final ItemAccountMappingItemAccount _priceVariance = new ItemAccountMappingItemAccount("_priceVariance");
    public static final ItemAccountMappingItemAccount _productionPriceVariance = new ItemAccountMappingItemAccount("_productionPriceVariance");
    public static final ItemAccountMappingItemAccount _productionQuantityVariance = new ItemAccountMappingItemAccount("_productionQuantityVariance");
    public static final ItemAccountMappingItemAccount _purchasePriceVariance = new ItemAccountMappingItemAccount("_purchasePriceVariance");
    public static final ItemAccountMappingItemAccount _quantityVariance = new ItemAccountMappingItemAccount("_quantityVariance");
    public static final ItemAccountMappingItemAccount _scrap = new ItemAccountMappingItemAccount("_scrap");
    public static final ItemAccountMappingItemAccount _unbuildVariance = new ItemAccountMappingItemAccount("_unbuildVariance");
    public static final ItemAccountMappingItemAccount _vendorReturnVariance = new ItemAccountMappingItemAccount("_vendorReturnVariance");
    public static final ItemAccountMappingItemAccount _wipVariance = new ItemAccountMappingItemAccount("_wipVariance");
    public static final ItemAccountMappingItemAccount _workInProcess = new ItemAccountMappingItemAccount("_workInProcess");
    public static final ItemAccountMappingItemAccount _writeOff = new ItemAccountMappingItemAccount("_writeOff");
    private static TypeDesc typeDesc = new TypeDesc(ItemAccountMappingItemAccount.class);

    protected ItemAccountMappingItemAccount(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static ItemAccountMappingItemAccount fromValue(String value) throws IllegalArgumentException {
        ItemAccountMappingItemAccount enumeration = (ItemAccountMappingItemAccount)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static ItemAccountMappingItemAccount fromString(String value) throws IllegalArgumentException {
        return ItemAccountMappingItemAccount.fromValue(value);
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
        return ItemAccountMappingItemAccount.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "ItemAccountMappingItemAccount"));
    }
}

