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

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnCustomFieldList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnDateField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnDoubleField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnEnumSelectField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnSelectField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnStringField;
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

public class InboundShipmentSearchRowBasic
extends SearchRowBasic
implements Serializable {
    private SearchColumnDateField[] actualDeliveryDate;
    private SearchColumnDateField[] actualShippingDate;
    private SearchColumnStringField[] billOfLading;
    private SearchColumnDateField[] createdDate;
    private SearchColumnSelectField[] currency;
    private SearchColumnStringField[] description;
    private SearchColumnDateField[] expectedDeliveryDate;
    private SearchColumnDoubleField[] expectedRate;
    private SearchColumnDateField[] expectedShippingDate;
    private SearchColumnStringField[] externalDocumentNumber;
    private SearchColumnSelectField[] externalId;
    private SearchColumnSelectField[] incoterm;
    private SearchColumnSelectField[] internalId;
    private SearchColumnSelectField[] item;
    private SearchColumnDateField[] itemEffectiveDate;
    private SearchColumnDoubleField[] itemExchangeRate;
    private SearchColumnEnumSelectField[] landedCostAllocationMethod;
    private SearchColumnDoubleField[] landedCostAmount;
    private SearchColumnSelectField[] landedCostCostCategory;
    private SearchColumnSelectField[] landedCostCurrency;
    private SearchColumnDateField[] landedCostEffectiveDate;
    private SearchColumnDoubleField[] landedCostExchangeRate;
    private SearchColumnStringField[] memo;
    private SearchColumnDoubleField[] poAmount;
    private SearchColumnDoubleField[] poRate;
    private SearchColumnSelectField[] purchaseOrder;
    private SearchColumnDoubleField[] quantityBilled;
    private SearchColumnDoubleField[] quantityExpected;
    private SearchColumnDoubleField[] quantityReceived;
    private SearchColumnDoubleField[] quantityRemaining;
    private SearchColumnSelectField[] receivingLocation;
    private SearchColumnSelectField[] shipmentBaseCurrency;
    private SearchColumnStringField[] shipmentNumber;
    private SearchColumnStringField[] status;
    private SearchColumnDoubleField[] totalUnitCost;
    private SearchColumnSelectField[] unit;
    private SearchColumnDoubleField[] unitLandedCost;
    private SearchColumnSelectField[] vendor;
    private SearchColumnStringField[] vesselNumber;
    private SearchColumnCustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(InboundShipmentSearchRowBasic.class, true);

    public InboundShipmentSearchRowBasic() {
    }

    public InboundShipmentSearchRowBasic(SearchColumnDateField[] actualDeliveryDate, SearchColumnDateField[] actualShippingDate, SearchColumnStringField[] billOfLading, SearchColumnDateField[] createdDate, SearchColumnSelectField[] currency, SearchColumnStringField[] description, SearchColumnDateField[] expectedDeliveryDate, SearchColumnDoubleField[] expectedRate, SearchColumnDateField[] expectedShippingDate, SearchColumnStringField[] externalDocumentNumber, SearchColumnSelectField[] externalId, SearchColumnSelectField[] incoterm, SearchColumnSelectField[] internalId, SearchColumnSelectField[] item, SearchColumnDateField[] itemEffectiveDate, SearchColumnDoubleField[] itemExchangeRate, SearchColumnEnumSelectField[] landedCostAllocationMethod, SearchColumnDoubleField[] landedCostAmount, SearchColumnSelectField[] landedCostCostCategory, SearchColumnSelectField[] landedCostCurrency, SearchColumnDateField[] landedCostEffectiveDate, SearchColumnDoubleField[] landedCostExchangeRate, SearchColumnStringField[] memo, SearchColumnDoubleField[] poAmount, SearchColumnDoubleField[] poRate, SearchColumnSelectField[] purchaseOrder, SearchColumnDoubleField[] quantityBilled, SearchColumnDoubleField[] quantityExpected, SearchColumnDoubleField[] quantityReceived, SearchColumnDoubleField[] quantityRemaining, SearchColumnSelectField[] receivingLocation, SearchColumnSelectField[] shipmentBaseCurrency, SearchColumnStringField[] shipmentNumber, SearchColumnStringField[] status, SearchColumnDoubleField[] totalUnitCost, SearchColumnSelectField[] unit, SearchColumnDoubleField[] unitLandedCost, SearchColumnSelectField[] vendor, SearchColumnStringField[] vesselNumber, SearchColumnCustomFieldList customFieldList) {
        this.actualDeliveryDate = actualDeliveryDate;
        this.actualShippingDate = actualShippingDate;
        this.billOfLading = billOfLading;
        this.createdDate = createdDate;
        this.currency = currency;
        this.description = description;
        this.expectedDeliveryDate = expectedDeliveryDate;
        this.expectedRate = expectedRate;
        this.expectedShippingDate = expectedShippingDate;
        this.externalDocumentNumber = externalDocumentNumber;
        this.externalId = externalId;
        this.incoterm = incoterm;
        this.internalId = internalId;
        this.item = item;
        this.itemEffectiveDate = itemEffectiveDate;
        this.itemExchangeRate = itemExchangeRate;
        this.landedCostAllocationMethod = landedCostAllocationMethod;
        this.landedCostAmount = landedCostAmount;
        this.landedCostCostCategory = landedCostCostCategory;
        this.landedCostCurrency = landedCostCurrency;
        this.landedCostEffectiveDate = landedCostEffectiveDate;
        this.landedCostExchangeRate = landedCostExchangeRate;
        this.memo = memo;
        this.poAmount = poAmount;
        this.poRate = poRate;
        this.purchaseOrder = purchaseOrder;
        this.quantityBilled = quantityBilled;
        this.quantityExpected = quantityExpected;
        this.quantityReceived = quantityReceived;
        this.quantityRemaining = quantityRemaining;
        this.receivingLocation = receivingLocation;
        this.shipmentBaseCurrency = shipmentBaseCurrency;
        this.shipmentNumber = shipmentNumber;
        this.status = status;
        this.totalUnitCost = totalUnitCost;
        this.unit = unit;
        this.unitLandedCost = unitLandedCost;
        this.vendor = vendor;
        this.vesselNumber = vesselNumber;
        this.customFieldList = customFieldList;
    }

    public SearchColumnDateField[] getActualDeliveryDate() {
        return this.actualDeliveryDate;
    }

    public void setActualDeliveryDate(SearchColumnDateField[] actualDeliveryDate) {
        this.actualDeliveryDate = actualDeliveryDate;
    }

    public SearchColumnDateField getActualDeliveryDate(int i) {
        return this.actualDeliveryDate[i];
    }

    public void setActualDeliveryDate(int i, SearchColumnDateField _value) {
        this.actualDeliveryDate[i] = _value;
    }

    public SearchColumnDateField[] getActualShippingDate() {
        return this.actualShippingDate;
    }

    public void setActualShippingDate(SearchColumnDateField[] actualShippingDate) {
        this.actualShippingDate = actualShippingDate;
    }

    public SearchColumnDateField getActualShippingDate(int i) {
        return this.actualShippingDate[i];
    }

    public void setActualShippingDate(int i, SearchColumnDateField _value) {
        this.actualShippingDate[i] = _value;
    }

    public SearchColumnStringField[] getBillOfLading() {
        return this.billOfLading;
    }

    public void setBillOfLading(SearchColumnStringField[] billOfLading) {
        this.billOfLading = billOfLading;
    }

    public SearchColumnStringField getBillOfLading(int i) {
        return this.billOfLading[i];
    }

    public void setBillOfLading(int i, SearchColumnStringField _value) {
        this.billOfLading[i] = _value;
    }

    public SearchColumnDateField[] getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(SearchColumnDateField[] createdDate) {
        this.createdDate = createdDate;
    }

    public SearchColumnDateField getCreatedDate(int i) {
        return this.createdDate[i];
    }

    public void setCreatedDate(int i, SearchColumnDateField _value) {
        this.createdDate[i] = _value;
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

    public SearchColumnStringField[] getDescription() {
        return this.description;
    }

    public void setDescription(SearchColumnStringField[] description) {
        this.description = description;
    }

    public SearchColumnStringField getDescription(int i) {
        return this.description[i];
    }

    public void setDescription(int i, SearchColumnStringField _value) {
        this.description[i] = _value;
    }

    public SearchColumnDateField[] getExpectedDeliveryDate() {
        return this.expectedDeliveryDate;
    }

    public void setExpectedDeliveryDate(SearchColumnDateField[] expectedDeliveryDate) {
        this.expectedDeliveryDate = expectedDeliveryDate;
    }

    public SearchColumnDateField getExpectedDeliveryDate(int i) {
        return this.expectedDeliveryDate[i];
    }

    public void setExpectedDeliveryDate(int i, SearchColumnDateField _value) {
        this.expectedDeliveryDate[i] = _value;
    }

    public SearchColumnDoubleField[] getExpectedRate() {
        return this.expectedRate;
    }

    public void setExpectedRate(SearchColumnDoubleField[] expectedRate) {
        this.expectedRate = expectedRate;
    }

    public SearchColumnDoubleField getExpectedRate(int i) {
        return this.expectedRate[i];
    }

    public void setExpectedRate(int i, SearchColumnDoubleField _value) {
        this.expectedRate[i] = _value;
    }

    public SearchColumnDateField[] getExpectedShippingDate() {
        return this.expectedShippingDate;
    }

    public void setExpectedShippingDate(SearchColumnDateField[] expectedShippingDate) {
        this.expectedShippingDate = expectedShippingDate;
    }

    public SearchColumnDateField getExpectedShippingDate(int i) {
        return this.expectedShippingDate[i];
    }

    public void setExpectedShippingDate(int i, SearchColumnDateField _value) {
        this.expectedShippingDate[i] = _value;
    }

    public SearchColumnStringField[] getExternalDocumentNumber() {
        return this.externalDocumentNumber;
    }

    public void setExternalDocumentNumber(SearchColumnStringField[] externalDocumentNumber) {
        this.externalDocumentNumber = externalDocumentNumber;
    }

    public SearchColumnStringField getExternalDocumentNumber(int i) {
        return this.externalDocumentNumber[i];
    }

    public void setExternalDocumentNumber(int i, SearchColumnStringField _value) {
        this.externalDocumentNumber[i] = _value;
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

    public SearchColumnDateField[] getItemEffectiveDate() {
        return this.itemEffectiveDate;
    }

    public void setItemEffectiveDate(SearchColumnDateField[] itemEffectiveDate) {
        this.itemEffectiveDate = itemEffectiveDate;
    }

    public SearchColumnDateField getItemEffectiveDate(int i) {
        return this.itemEffectiveDate[i];
    }

    public void setItemEffectiveDate(int i, SearchColumnDateField _value) {
        this.itemEffectiveDate[i] = _value;
    }

    public SearchColumnDoubleField[] getItemExchangeRate() {
        return this.itemExchangeRate;
    }

    public void setItemExchangeRate(SearchColumnDoubleField[] itemExchangeRate) {
        this.itemExchangeRate = itemExchangeRate;
    }

    public SearchColumnDoubleField getItemExchangeRate(int i) {
        return this.itemExchangeRate[i];
    }

    public void setItemExchangeRate(int i, SearchColumnDoubleField _value) {
        this.itemExchangeRate[i] = _value;
    }

    public SearchColumnEnumSelectField[] getLandedCostAllocationMethod() {
        return this.landedCostAllocationMethod;
    }

    public void setLandedCostAllocationMethod(SearchColumnEnumSelectField[] landedCostAllocationMethod) {
        this.landedCostAllocationMethod = landedCostAllocationMethod;
    }

    public SearchColumnEnumSelectField getLandedCostAllocationMethod(int i) {
        return this.landedCostAllocationMethod[i];
    }

    public void setLandedCostAllocationMethod(int i, SearchColumnEnumSelectField _value) {
        this.landedCostAllocationMethod[i] = _value;
    }

    public SearchColumnDoubleField[] getLandedCostAmount() {
        return this.landedCostAmount;
    }

    public void setLandedCostAmount(SearchColumnDoubleField[] landedCostAmount) {
        this.landedCostAmount = landedCostAmount;
    }

    public SearchColumnDoubleField getLandedCostAmount(int i) {
        return this.landedCostAmount[i];
    }

    public void setLandedCostAmount(int i, SearchColumnDoubleField _value) {
        this.landedCostAmount[i] = _value;
    }

    public SearchColumnSelectField[] getLandedCostCostCategory() {
        return this.landedCostCostCategory;
    }

    public void setLandedCostCostCategory(SearchColumnSelectField[] landedCostCostCategory) {
        this.landedCostCostCategory = landedCostCostCategory;
    }

    public SearchColumnSelectField getLandedCostCostCategory(int i) {
        return this.landedCostCostCategory[i];
    }

    public void setLandedCostCostCategory(int i, SearchColumnSelectField _value) {
        this.landedCostCostCategory[i] = _value;
    }

    public SearchColumnSelectField[] getLandedCostCurrency() {
        return this.landedCostCurrency;
    }

    public void setLandedCostCurrency(SearchColumnSelectField[] landedCostCurrency) {
        this.landedCostCurrency = landedCostCurrency;
    }

    public SearchColumnSelectField getLandedCostCurrency(int i) {
        return this.landedCostCurrency[i];
    }

    public void setLandedCostCurrency(int i, SearchColumnSelectField _value) {
        this.landedCostCurrency[i] = _value;
    }

    public SearchColumnDateField[] getLandedCostEffectiveDate() {
        return this.landedCostEffectiveDate;
    }

    public void setLandedCostEffectiveDate(SearchColumnDateField[] landedCostEffectiveDate) {
        this.landedCostEffectiveDate = landedCostEffectiveDate;
    }

    public SearchColumnDateField getLandedCostEffectiveDate(int i) {
        return this.landedCostEffectiveDate[i];
    }

    public void setLandedCostEffectiveDate(int i, SearchColumnDateField _value) {
        this.landedCostEffectiveDate[i] = _value;
    }

    public SearchColumnDoubleField[] getLandedCostExchangeRate() {
        return this.landedCostExchangeRate;
    }

    public void setLandedCostExchangeRate(SearchColumnDoubleField[] landedCostExchangeRate) {
        this.landedCostExchangeRate = landedCostExchangeRate;
    }

    public SearchColumnDoubleField getLandedCostExchangeRate(int i) {
        return this.landedCostExchangeRate[i];
    }

    public void setLandedCostExchangeRate(int i, SearchColumnDoubleField _value) {
        this.landedCostExchangeRate[i] = _value;
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

    public SearchColumnDoubleField[] getPoAmount() {
        return this.poAmount;
    }

    public void setPoAmount(SearchColumnDoubleField[] poAmount) {
        this.poAmount = poAmount;
    }

    public SearchColumnDoubleField getPoAmount(int i) {
        return this.poAmount[i];
    }

    public void setPoAmount(int i, SearchColumnDoubleField _value) {
        this.poAmount[i] = _value;
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

    public SearchColumnDoubleField[] getQuantityExpected() {
        return this.quantityExpected;
    }

    public void setQuantityExpected(SearchColumnDoubleField[] quantityExpected) {
        this.quantityExpected = quantityExpected;
    }

    public SearchColumnDoubleField getQuantityExpected(int i) {
        return this.quantityExpected[i];
    }

    public void setQuantityExpected(int i, SearchColumnDoubleField _value) {
        this.quantityExpected[i] = _value;
    }

    public SearchColumnDoubleField[] getQuantityReceived() {
        return this.quantityReceived;
    }

    public void setQuantityReceived(SearchColumnDoubleField[] quantityReceived) {
        this.quantityReceived = quantityReceived;
    }

    public SearchColumnDoubleField getQuantityReceived(int i) {
        return this.quantityReceived[i];
    }

    public void setQuantityReceived(int i, SearchColumnDoubleField _value) {
        this.quantityReceived[i] = _value;
    }

    public SearchColumnDoubleField[] getQuantityRemaining() {
        return this.quantityRemaining;
    }

    public void setQuantityRemaining(SearchColumnDoubleField[] quantityRemaining) {
        this.quantityRemaining = quantityRemaining;
    }

    public SearchColumnDoubleField getQuantityRemaining(int i) {
        return this.quantityRemaining[i];
    }

    public void setQuantityRemaining(int i, SearchColumnDoubleField _value) {
        this.quantityRemaining[i] = _value;
    }

    public SearchColumnSelectField[] getReceivingLocation() {
        return this.receivingLocation;
    }

    public void setReceivingLocation(SearchColumnSelectField[] receivingLocation) {
        this.receivingLocation = receivingLocation;
    }

    public SearchColumnSelectField getReceivingLocation(int i) {
        return this.receivingLocation[i];
    }

    public void setReceivingLocation(int i, SearchColumnSelectField _value) {
        this.receivingLocation[i] = _value;
    }

    public SearchColumnSelectField[] getShipmentBaseCurrency() {
        return this.shipmentBaseCurrency;
    }

    public void setShipmentBaseCurrency(SearchColumnSelectField[] shipmentBaseCurrency) {
        this.shipmentBaseCurrency = shipmentBaseCurrency;
    }

    public SearchColumnSelectField getShipmentBaseCurrency(int i) {
        return this.shipmentBaseCurrency[i];
    }

    public void setShipmentBaseCurrency(int i, SearchColumnSelectField _value) {
        this.shipmentBaseCurrency[i] = _value;
    }

    public SearchColumnStringField[] getShipmentNumber() {
        return this.shipmentNumber;
    }

    public void setShipmentNumber(SearchColumnStringField[] shipmentNumber) {
        this.shipmentNumber = shipmentNumber;
    }

    public SearchColumnStringField getShipmentNumber(int i) {
        return this.shipmentNumber[i];
    }

    public void setShipmentNumber(int i, SearchColumnStringField _value) {
        this.shipmentNumber[i] = _value;
    }

    public SearchColumnStringField[] getStatus() {
        return this.status;
    }

    public void setStatus(SearchColumnStringField[] status) {
        this.status = status;
    }

    public SearchColumnStringField getStatus(int i) {
        return this.status[i];
    }

    public void setStatus(int i, SearchColumnStringField _value) {
        this.status[i] = _value;
    }

    public SearchColumnDoubleField[] getTotalUnitCost() {
        return this.totalUnitCost;
    }

    public void setTotalUnitCost(SearchColumnDoubleField[] totalUnitCost) {
        this.totalUnitCost = totalUnitCost;
    }

    public SearchColumnDoubleField getTotalUnitCost(int i) {
        return this.totalUnitCost[i];
    }

    public void setTotalUnitCost(int i, SearchColumnDoubleField _value) {
        this.totalUnitCost[i] = _value;
    }

    public SearchColumnSelectField[] getUnit() {
        return this.unit;
    }

    public void setUnit(SearchColumnSelectField[] unit) {
        this.unit = unit;
    }

    public SearchColumnSelectField getUnit(int i) {
        return this.unit[i];
    }

    public void setUnit(int i, SearchColumnSelectField _value) {
        this.unit[i] = _value;
    }

    public SearchColumnDoubleField[] getUnitLandedCost() {
        return this.unitLandedCost;
    }

    public void setUnitLandedCost(SearchColumnDoubleField[] unitLandedCost) {
        this.unitLandedCost = unitLandedCost;
    }

    public SearchColumnDoubleField getUnitLandedCost(int i) {
        return this.unitLandedCost[i];
    }

    public void setUnitLandedCost(int i, SearchColumnDoubleField _value) {
        this.unitLandedCost[i] = _value;
    }

    public SearchColumnSelectField[] getVendor() {
        return this.vendor;
    }

    public void setVendor(SearchColumnSelectField[] vendor) {
        this.vendor = vendor;
    }

    public SearchColumnSelectField getVendor(int i) {
        return this.vendor[i];
    }

    public void setVendor(int i, SearchColumnSelectField _value) {
        this.vendor[i] = _value;
    }

    public SearchColumnStringField[] getVesselNumber() {
        return this.vesselNumber;
    }

    public void setVesselNumber(SearchColumnStringField[] vesselNumber) {
        this.vesselNumber = vesselNumber;
    }

    public SearchColumnStringField getVesselNumber(int i) {
        return this.vesselNumber[i];
    }

    public void setVesselNumber(int i, SearchColumnStringField _value) {
        this.vesselNumber[i] = _value;
    }

    public SearchColumnCustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof InboundShipmentSearchRowBasic)) {
            return false;
        }
        InboundShipmentSearchRowBasic other = (InboundShipmentSearchRowBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.actualDeliveryDate == null && other.getActualDeliveryDate() == null || this.actualDeliveryDate != null && Arrays.equals(this.actualDeliveryDate, other.getActualDeliveryDate())) && (this.actualShippingDate == null && other.getActualShippingDate() == null || this.actualShippingDate != null && Arrays.equals(this.actualShippingDate, other.getActualShippingDate())) && (this.billOfLading == null && other.getBillOfLading() == null || this.billOfLading != null && Arrays.equals(this.billOfLading, other.getBillOfLading())) && (this.createdDate == null && other.getCreatedDate() == null || this.createdDate != null && Arrays.equals(this.createdDate, other.getCreatedDate())) && (this.currency == null && other.getCurrency() == null || this.currency != null && Arrays.equals(this.currency, other.getCurrency())) && (this.description == null && other.getDescription() == null || this.description != null && Arrays.equals(this.description, other.getDescription())) && (this.expectedDeliveryDate == null && other.getExpectedDeliveryDate() == null || this.expectedDeliveryDate != null && Arrays.equals(this.expectedDeliveryDate, other.getExpectedDeliveryDate())) && (this.expectedRate == null && other.getExpectedRate() == null || this.expectedRate != null && Arrays.equals(this.expectedRate, other.getExpectedRate())) && (this.expectedShippingDate == null && other.getExpectedShippingDate() == null || this.expectedShippingDate != null && Arrays.equals(this.expectedShippingDate, other.getExpectedShippingDate())) && (this.externalDocumentNumber == null && other.getExternalDocumentNumber() == null || this.externalDocumentNumber != null && Arrays.equals(this.externalDocumentNumber, other.getExternalDocumentNumber())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && Arrays.equals(this.externalId, other.getExternalId())) && (this.incoterm == null && other.getIncoterm() == null || this.incoterm != null && Arrays.equals(this.incoterm, other.getIncoterm())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && Arrays.equals(this.internalId, other.getInternalId())) && (this.item == null && other.getItem() == null || this.item != null && Arrays.equals(this.item, other.getItem())) && (this.itemEffectiveDate == null && other.getItemEffectiveDate() == null || this.itemEffectiveDate != null && Arrays.equals(this.itemEffectiveDate, other.getItemEffectiveDate())) && (this.itemExchangeRate == null && other.getItemExchangeRate() == null || this.itemExchangeRate != null && Arrays.equals(this.itemExchangeRate, other.getItemExchangeRate())) && (this.landedCostAllocationMethod == null && other.getLandedCostAllocationMethod() == null || this.landedCostAllocationMethod != null && Arrays.equals(this.landedCostAllocationMethod, other.getLandedCostAllocationMethod())) && (this.landedCostAmount == null && other.getLandedCostAmount() == null || this.landedCostAmount != null && Arrays.equals(this.landedCostAmount, other.getLandedCostAmount())) && (this.landedCostCostCategory == null && other.getLandedCostCostCategory() == null || this.landedCostCostCategory != null && Arrays.equals(this.landedCostCostCategory, other.getLandedCostCostCategory())) && (this.landedCostCurrency == null && other.getLandedCostCurrency() == null || this.landedCostCurrency != null && Arrays.equals(this.landedCostCurrency, other.getLandedCostCurrency())) && (this.landedCostEffectiveDate == null && other.getLandedCostEffectiveDate() == null || this.landedCostEffectiveDate != null && Arrays.equals(this.landedCostEffectiveDate, other.getLandedCostEffectiveDate())) && (this.landedCostExchangeRate == null && other.getLandedCostExchangeRate() == null || this.landedCostExchangeRate != null && Arrays.equals(this.landedCostExchangeRate, other.getLandedCostExchangeRate())) && (this.memo == null && other.getMemo() == null || this.memo != null && Arrays.equals(this.memo, other.getMemo())) && (this.poAmount == null && other.getPoAmount() == null || this.poAmount != null && Arrays.equals(this.poAmount, other.getPoAmount())) && (this.poRate == null && other.getPoRate() == null || this.poRate != null && Arrays.equals(this.poRate, other.getPoRate())) && (this.purchaseOrder == null && other.getPurchaseOrder() == null || this.purchaseOrder != null && Arrays.equals(this.purchaseOrder, other.getPurchaseOrder())) && (this.quantityBilled == null && other.getQuantityBilled() == null || this.quantityBilled != null && Arrays.equals(this.quantityBilled, other.getQuantityBilled())) && (this.quantityExpected == null && other.getQuantityExpected() == null || this.quantityExpected != null && Arrays.equals(this.quantityExpected, other.getQuantityExpected())) && (this.quantityReceived == null && other.getQuantityReceived() == null || this.quantityReceived != null && Arrays.equals(this.quantityReceived, other.getQuantityReceived())) && (this.quantityRemaining == null && other.getQuantityRemaining() == null || this.quantityRemaining != null && Arrays.equals(this.quantityRemaining, other.getQuantityRemaining())) && (this.receivingLocation == null && other.getReceivingLocation() == null || this.receivingLocation != null && Arrays.equals(this.receivingLocation, other.getReceivingLocation())) && (this.shipmentBaseCurrency == null && other.getShipmentBaseCurrency() == null || this.shipmentBaseCurrency != null && Arrays.equals(this.shipmentBaseCurrency, other.getShipmentBaseCurrency())) && (this.shipmentNumber == null && other.getShipmentNumber() == null || this.shipmentNumber != null && Arrays.equals(this.shipmentNumber, other.getShipmentNumber())) && (this.status == null && other.getStatus() == null || this.status != null && Arrays.equals(this.status, other.getStatus())) && (this.totalUnitCost == null && other.getTotalUnitCost() == null || this.totalUnitCost != null && Arrays.equals(this.totalUnitCost, other.getTotalUnitCost())) && (this.unit == null && other.getUnit() == null || this.unit != null && Arrays.equals(this.unit, other.getUnit())) && (this.unitLandedCost == null && other.getUnitLandedCost() == null || this.unitLandedCost != null && Arrays.equals(this.unitLandedCost, other.getUnitLandedCost())) && (this.vendor == null && other.getVendor() == null || this.vendor != null && Arrays.equals(this.vendor, other.getVendor())) && (this.vesselNumber == null && other.getVesselNumber() == null || this.vesselNumber != null && Arrays.equals(this.vesselNumber, other.getVesselNumber())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
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
        if (this.getActualDeliveryDate() != null) {
            for (i = 0; i < Array.getLength(this.getActualDeliveryDate()); ++i) {
                obj = Array.get(this.getActualDeliveryDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getActualShippingDate() != null) {
            for (i = 0; i < Array.getLength(this.getActualShippingDate()); ++i) {
                obj = Array.get(this.getActualShippingDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBillOfLading() != null) {
            for (i = 0; i < Array.getLength(this.getBillOfLading()); ++i) {
                obj = Array.get(this.getBillOfLading(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCreatedDate() != null) {
            for (i = 0; i < Array.getLength(this.getCreatedDate()); ++i) {
                obj = Array.get(this.getCreatedDate(), i);
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
        if (this.getDescription() != null) {
            for (i = 0; i < Array.getLength(this.getDescription()); ++i) {
                obj = Array.get(this.getDescription(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getExpectedDeliveryDate() != null) {
            for (i = 0; i < Array.getLength(this.getExpectedDeliveryDate()); ++i) {
                obj = Array.get(this.getExpectedDeliveryDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getExpectedRate() != null) {
            for (i = 0; i < Array.getLength(this.getExpectedRate()); ++i) {
                obj = Array.get(this.getExpectedRate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getExpectedShippingDate() != null) {
            for (i = 0; i < Array.getLength(this.getExpectedShippingDate()); ++i) {
                obj = Array.get(this.getExpectedShippingDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getExternalDocumentNumber() != null) {
            for (i = 0; i < Array.getLength(this.getExternalDocumentNumber()); ++i) {
                obj = Array.get(this.getExternalDocumentNumber(), i);
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
        if (this.getIncoterm() != null) {
            for (i = 0; i < Array.getLength(this.getIncoterm()); ++i) {
                obj = Array.get(this.getIncoterm(), i);
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
        if (this.getItem() != null) {
            for (i = 0; i < Array.getLength(this.getItem()); ++i) {
                obj = Array.get(this.getItem(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getItemEffectiveDate() != null) {
            for (i = 0; i < Array.getLength(this.getItemEffectiveDate()); ++i) {
                obj = Array.get(this.getItemEffectiveDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getItemExchangeRate() != null) {
            for (i = 0; i < Array.getLength(this.getItemExchangeRate()); ++i) {
                obj = Array.get(this.getItemExchangeRate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLandedCostAllocationMethod() != null) {
            for (i = 0; i < Array.getLength(this.getLandedCostAllocationMethod()); ++i) {
                obj = Array.get(this.getLandedCostAllocationMethod(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLandedCostAmount() != null) {
            for (i = 0; i < Array.getLength(this.getLandedCostAmount()); ++i) {
                obj = Array.get(this.getLandedCostAmount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLandedCostCostCategory() != null) {
            for (i = 0; i < Array.getLength(this.getLandedCostCostCategory()); ++i) {
                obj = Array.get(this.getLandedCostCostCategory(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLandedCostCurrency() != null) {
            for (i = 0; i < Array.getLength(this.getLandedCostCurrency()); ++i) {
                obj = Array.get(this.getLandedCostCurrency(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLandedCostEffectiveDate() != null) {
            for (i = 0; i < Array.getLength(this.getLandedCostEffectiveDate()); ++i) {
                obj = Array.get(this.getLandedCostEffectiveDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLandedCostExchangeRate() != null) {
            for (i = 0; i < Array.getLength(this.getLandedCostExchangeRate()); ++i) {
                obj = Array.get(this.getLandedCostExchangeRate(), i);
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
        if (this.getPoAmount() != null) {
            for (i = 0; i < Array.getLength(this.getPoAmount()); ++i) {
                obj = Array.get(this.getPoAmount(), i);
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
        if (this.getPurchaseOrder() != null) {
            for (i = 0; i < Array.getLength(this.getPurchaseOrder()); ++i) {
                obj = Array.get(this.getPurchaseOrder(), i);
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
        if (this.getQuantityExpected() != null) {
            for (i = 0; i < Array.getLength(this.getQuantityExpected()); ++i) {
                obj = Array.get(this.getQuantityExpected(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getQuantityReceived() != null) {
            for (i = 0; i < Array.getLength(this.getQuantityReceived()); ++i) {
                obj = Array.get(this.getQuantityReceived(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getQuantityRemaining() != null) {
            for (i = 0; i < Array.getLength(this.getQuantityRemaining()); ++i) {
                obj = Array.get(this.getQuantityRemaining(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getReceivingLocation() != null) {
            for (i = 0; i < Array.getLength(this.getReceivingLocation()); ++i) {
                obj = Array.get(this.getReceivingLocation(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getShipmentBaseCurrency() != null) {
            for (i = 0; i < Array.getLength(this.getShipmentBaseCurrency()); ++i) {
                obj = Array.get(this.getShipmentBaseCurrency(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getShipmentNumber() != null) {
            for (i = 0; i < Array.getLength(this.getShipmentNumber()); ++i) {
                obj = Array.get(this.getShipmentNumber(), i);
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
        if (this.getTotalUnitCost() != null) {
            for (i = 0; i < Array.getLength(this.getTotalUnitCost()); ++i) {
                obj = Array.get(this.getTotalUnitCost(), i);
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
        if (this.getUnitLandedCost() != null) {
            for (i = 0; i < Array.getLength(this.getUnitLandedCost()); ++i) {
                obj = Array.get(this.getUnitLandedCost(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getVendor() != null) {
            for (i = 0; i < Array.getLength(this.getVendor()); ++i) {
                obj = Array.get(this.getVendor(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getVesselNumber() != null) {
            for (i = 0; i < Array.getLength(this.getVesselNumber()); ++i) {
                obj = Array.get(this.getVesselNumber(), i);
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "InboundShipmentSearchRowBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("actualDeliveryDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "actualDeliveryDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("actualShippingDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "actualShippingDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billOfLading");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billOfLading"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
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
        elemField.setFieldName("description");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "description"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("expectedDeliveryDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "expectedDeliveryDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("expectedRate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "expectedRate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("expectedShippingDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "expectedShippingDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("externalDocumentNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "externalDocumentNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("incoterm");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "incoterm"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("item");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemEffectiveDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "itemEffectiveDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemExchangeRate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "itemExchangeRate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("landedCostAllocationMethod");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "landedCostAllocationMethod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("landedCostAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "landedCostAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("landedCostCostCategory");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "landedCostCostCategory"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("landedCostCurrency");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "landedCostCurrency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("landedCostEffectiveDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "landedCostEffectiveDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("landedCostExchangeRate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "landedCostExchangeRate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
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
        elemField.setFieldName("poAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "poAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
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
        elemField.setFieldName("purchaseOrder");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "purchaseOrder"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("quantityExpected");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "quantityExpected"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityReceived");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "quantityReceived"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityRemaining");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "quantityRemaining"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("receivingLocation");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "receivingLocation"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipmentBaseCurrency");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipmentBaseCurrency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipmentNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipmentNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "status"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("totalUnitCost");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "totalUnitCost"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("unit");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "unit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("unitLandedCost");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "unitLandedCost"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vendor");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "vendor"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vesselNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "vesselNumber"));
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

