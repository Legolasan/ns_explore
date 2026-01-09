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
package com.netsuite.suitetalk.proxy.v2022_1.transactions.sales;

import com.netsuite.suitetalk.proxy.v2022_1.platform.common.InventoryDetail;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.types.ItemCostEstimateType;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.types.VsoeDeferral;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.types.VsoePermitDiscount;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.types.VsoeSopGroup;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.CustomFieldList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRefList;
import java.io.Serializable;
import java.util.Calendar;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class CashSaleItem
implements Serializable {
    private RecordRef job;
    private RecordRef item;
    private Long line;
    private Double quantityAvailable;
    private Double quantityOnHand;
    private Double quantityFulfilled;
    private Double quantity;
    private RecordRef units;
    private InventoryDetail inventoryDetail;
    private String serialNumbers;
    private String binNumbers;
    private String description;
    private RecordRef price;
    private String rate;
    private Double amount;
    private Long orderLine;
    private String licenseCode;
    private Boolean isTaxable;
    private CustomFieldList options;
    private Boolean deferRevRec;
    private Double currentPercent;
    private RecordRef department;
    private Double percentComplete;
    private RecordRef _class;
    private RecordRef location;
    private RecordRef revRecSchedule;
    private Calendar revRecStartDate;
    private Calendar revRecEndDate;
    private RecordRef subscriptionLine;
    private Double grossAmt;
    private ItemCostEstimateType costEstimateType;
    private Boolean excludeFromRateRequest;
    private RecordRef catchUpPeriod;
    private Double costEstimate;
    private String taxDetailsReference;
    private Double amountOrdered;
    private Double tax1Amt;
    private Double quantityOrdered;
    private Double quantityRemaining;
    private RecordRef taxCode;
    private Double taxRate1;
    private Double taxRate2;
    private String giftCertFrom;
    private String giftCertRecipientName;
    private String giftCertRecipientEmail;
    private String giftCertMessage;
    private Double taxAmount;
    private String giftCertNumber;
    private Long shipGroup;
    private Boolean itemIsFulfilled;
    private RecordRef shipAddress;
    private RecordRef shipMethod;
    private VsoeSopGroup vsoeSopGroup;
    private Boolean vsoeIsEstimate;
    private Double vsoePrice;
    private Double vsoeAmount;
    private Double vsoeAllocation;
    private VsoeDeferral vsoeDeferral;
    private VsoePermitDiscount vsoePermitDiscount;
    private Boolean vsoeDelivered;
    private RecordRef chargeType;
    private RecordRefList chargesList;
    private CustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(CashSaleItem.class, true);

    public CashSaleItem() {
    }

    public CashSaleItem(RecordRef job, RecordRef item, Long line, Double quantityAvailable, Double quantityOnHand, Double quantityFulfilled, Double quantity, RecordRef units, InventoryDetail inventoryDetail, String serialNumbers, String binNumbers, String description, RecordRef price, String rate, Double amount, Long orderLine, String licenseCode, Boolean isTaxable, CustomFieldList options, Boolean deferRevRec, Double currentPercent, RecordRef department, Double percentComplete, RecordRef _class, RecordRef location, RecordRef revRecSchedule, Calendar revRecStartDate, Calendar revRecEndDate, RecordRef subscriptionLine, Double grossAmt, ItemCostEstimateType costEstimateType, Boolean excludeFromRateRequest, RecordRef catchUpPeriod, Double costEstimate, String taxDetailsReference, Double amountOrdered, Double tax1Amt, Double quantityOrdered, Double quantityRemaining, RecordRef taxCode, Double taxRate1, Double taxRate2, String giftCertFrom, String giftCertRecipientName, String giftCertRecipientEmail, String giftCertMessage, Double taxAmount, String giftCertNumber, Long shipGroup, Boolean itemIsFulfilled, RecordRef shipAddress, RecordRef shipMethod, VsoeSopGroup vsoeSopGroup, Boolean vsoeIsEstimate, Double vsoePrice, Double vsoeAmount, Double vsoeAllocation, VsoeDeferral vsoeDeferral, VsoePermitDiscount vsoePermitDiscount, Boolean vsoeDelivered, RecordRef chargeType, RecordRefList chargesList, CustomFieldList customFieldList) {
        this.job = job;
        this.item = item;
        this.line = line;
        this.quantityAvailable = quantityAvailable;
        this.quantityOnHand = quantityOnHand;
        this.quantityFulfilled = quantityFulfilled;
        this.quantity = quantity;
        this.units = units;
        this.inventoryDetail = inventoryDetail;
        this.serialNumbers = serialNumbers;
        this.binNumbers = binNumbers;
        this.description = description;
        this.price = price;
        this.rate = rate;
        this.amount = amount;
        this.orderLine = orderLine;
        this.licenseCode = licenseCode;
        this.isTaxable = isTaxable;
        this.options = options;
        this.deferRevRec = deferRevRec;
        this.currentPercent = currentPercent;
        this.department = department;
        this.percentComplete = percentComplete;
        this._class = _class;
        this.location = location;
        this.revRecSchedule = revRecSchedule;
        this.revRecStartDate = revRecStartDate;
        this.revRecEndDate = revRecEndDate;
        this.subscriptionLine = subscriptionLine;
        this.grossAmt = grossAmt;
        this.costEstimateType = costEstimateType;
        this.excludeFromRateRequest = excludeFromRateRequest;
        this.catchUpPeriod = catchUpPeriod;
        this.costEstimate = costEstimate;
        this.taxDetailsReference = taxDetailsReference;
        this.amountOrdered = amountOrdered;
        this.tax1Amt = tax1Amt;
        this.quantityOrdered = quantityOrdered;
        this.quantityRemaining = quantityRemaining;
        this.taxCode = taxCode;
        this.taxRate1 = taxRate1;
        this.taxRate2 = taxRate2;
        this.giftCertFrom = giftCertFrom;
        this.giftCertRecipientName = giftCertRecipientName;
        this.giftCertRecipientEmail = giftCertRecipientEmail;
        this.giftCertMessage = giftCertMessage;
        this.taxAmount = taxAmount;
        this.giftCertNumber = giftCertNumber;
        this.shipGroup = shipGroup;
        this.itemIsFulfilled = itemIsFulfilled;
        this.shipAddress = shipAddress;
        this.shipMethod = shipMethod;
        this.vsoeSopGroup = vsoeSopGroup;
        this.vsoeIsEstimate = vsoeIsEstimate;
        this.vsoePrice = vsoePrice;
        this.vsoeAmount = vsoeAmount;
        this.vsoeAllocation = vsoeAllocation;
        this.vsoeDeferral = vsoeDeferral;
        this.vsoePermitDiscount = vsoePermitDiscount;
        this.vsoeDelivered = vsoeDelivered;
        this.chargeType = chargeType;
        this.chargesList = chargesList;
        this.customFieldList = customFieldList;
    }

    public RecordRef getJob() {
        return this.job;
    }

    public void setJob(RecordRef job) {
        this.job = job;
    }

    public RecordRef getItem() {
        return this.item;
    }

    public void setItem(RecordRef item) {
        this.item = item;
    }

    public Long getLine() {
        return this.line;
    }

    public void setLine(Long line) {
        this.line = line;
    }

    public Double getQuantityAvailable() {
        return this.quantityAvailable;
    }

    public void setQuantityAvailable(Double quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

    public Double getQuantityOnHand() {
        return this.quantityOnHand;
    }

    public void setQuantityOnHand(Double quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }

    public Double getQuantityFulfilled() {
        return this.quantityFulfilled;
    }

    public void setQuantityFulfilled(Double quantityFulfilled) {
        this.quantityFulfilled = quantityFulfilled;
    }

    public Double getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public RecordRef getUnits() {
        return this.units;
    }

    public void setUnits(RecordRef units) {
        this.units = units;
    }

    public InventoryDetail getInventoryDetail() {
        return this.inventoryDetail;
    }

    public void setInventoryDetail(InventoryDetail inventoryDetail) {
        this.inventoryDetail = inventoryDetail;
    }

    public String getSerialNumbers() {
        return this.serialNumbers;
    }

    public void setSerialNumbers(String serialNumbers) {
        this.serialNumbers = serialNumbers;
    }

    public String getBinNumbers() {
        return this.binNumbers;
    }

    public void setBinNumbers(String binNumbers) {
        this.binNumbers = binNumbers;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public RecordRef getPrice() {
        return this.price;
    }

    public void setPrice(RecordRef price) {
        this.price = price;
    }

    public String getRate() {
        return this.rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public Double getAmount() {
        return this.amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Long getOrderLine() {
        return this.orderLine;
    }

    public void setOrderLine(Long orderLine) {
        this.orderLine = orderLine;
    }

    public String getLicenseCode() {
        return this.licenseCode;
    }

    public void setLicenseCode(String licenseCode) {
        this.licenseCode = licenseCode;
    }

    public Boolean getIsTaxable() {
        return this.isTaxable;
    }

    public void setIsTaxable(Boolean isTaxable) {
        this.isTaxable = isTaxable;
    }

    public CustomFieldList getOptions() {
        return this.options;
    }

    public void setOptions(CustomFieldList options) {
        this.options = options;
    }

    public Boolean getDeferRevRec() {
        return this.deferRevRec;
    }

    public void setDeferRevRec(Boolean deferRevRec) {
        this.deferRevRec = deferRevRec;
    }

    public Double getCurrentPercent() {
        return this.currentPercent;
    }

    public void setCurrentPercent(Double currentPercent) {
        this.currentPercent = currentPercent;
    }

    public RecordRef getDepartment() {
        return this.department;
    }

    public void setDepartment(RecordRef department) {
        this.department = department;
    }

    public Double getPercentComplete() {
        return this.percentComplete;
    }

    public void setPercentComplete(Double percentComplete) {
        this.percentComplete = percentComplete;
    }

    public RecordRef get_class() {
        return this._class;
    }

    public void set_class(RecordRef _class) {
        this._class = _class;
    }

    public RecordRef getLocation() {
        return this.location;
    }

    public void setLocation(RecordRef location) {
        this.location = location;
    }

    public RecordRef getRevRecSchedule() {
        return this.revRecSchedule;
    }

    public void setRevRecSchedule(RecordRef revRecSchedule) {
        this.revRecSchedule = revRecSchedule;
    }

    public Calendar getRevRecStartDate() {
        return this.revRecStartDate;
    }

    public void setRevRecStartDate(Calendar revRecStartDate) {
        this.revRecStartDate = revRecStartDate;
    }

    public Calendar getRevRecEndDate() {
        return this.revRecEndDate;
    }

    public void setRevRecEndDate(Calendar revRecEndDate) {
        this.revRecEndDate = revRecEndDate;
    }

    public RecordRef getSubscriptionLine() {
        return this.subscriptionLine;
    }

    public void setSubscriptionLine(RecordRef subscriptionLine) {
        this.subscriptionLine = subscriptionLine;
    }

    public Double getGrossAmt() {
        return this.grossAmt;
    }

    public void setGrossAmt(Double grossAmt) {
        this.grossAmt = grossAmt;
    }

    public ItemCostEstimateType getCostEstimateType() {
        return this.costEstimateType;
    }

    public void setCostEstimateType(ItemCostEstimateType costEstimateType) {
        this.costEstimateType = costEstimateType;
    }

    public Boolean getExcludeFromRateRequest() {
        return this.excludeFromRateRequest;
    }

    public void setExcludeFromRateRequest(Boolean excludeFromRateRequest) {
        this.excludeFromRateRequest = excludeFromRateRequest;
    }

    public RecordRef getCatchUpPeriod() {
        return this.catchUpPeriod;
    }

    public void setCatchUpPeriod(RecordRef catchUpPeriod) {
        this.catchUpPeriod = catchUpPeriod;
    }

    public Double getCostEstimate() {
        return this.costEstimate;
    }

    public void setCostEstimate(Double costEstimate) {
        this.costEstimate = costEstimate;
    }

    public String getTaxDetailsReference() {
        return this.taxDetailsReference;
    }

    public void setTaxDetailsReference(String taxDetailsReference) {
        this.taxDetailsReference = taxDetailsReference;
    }

    public Double getAmountOrdered() {
        return this.amountOrdered;
    }

    public void setAmountOrdered(Double amountOrdered) {
        this.amountOrdered = amountOrdered;
    }

    public Double getTax1Amt() {
        return this.tax1Amt;
    }

    public void setTax1Amt(Double tax1Amt) {
        this.tax1Amt = tax1Amt;
    }

    public Double getQuantityOrdered() {
        return this.quantityOrdered;
    }

    public void setQuantityOrdered(Double quantityOrdered) {
        this.quantityOrdered = quantityOrdered;
    }

    public Double getQuantityRemaining() {
        return this.quantityRemaining;
    }

    public void setQuantityRemaining(Double quantityRemaining) {
        this.quantityRemaining = quantityRemaining;
    }

    public RecordRef getTaxCode() {
        return this.taxCode;
    }

    public void setTaxCode(RecordRef taxCode) {
        this.taxCode = taxCode;
    }

    public Double getTaxRate1() {
        return this.taxRate1;
    }

    public void setTaxRate1(Double taxRate1) {
        this.taxRate1 = taxRate1;
    }

    public Double getTaxRate2() {
        return this.taxRate2;
    }

    public void setTaxRate2(Double taxRate2) {
        this.taxRate2 = taxRate2;
    }

    public String getGiftCertFrom() {
        return this.giftCertFrom;
    }

    public void setGiftCertFrom(String giftCertFrom) {
        this.giftCertFrom = giftCertFrom;
    }

    public String getGiftCertRecipientName() {
        return this.giftCertRecipientName;
    }

    public void setGiftCertRecipientName(String giftCertRecipientName) {
        this.giftCertRecipientName = giftCertRecipientName;
    }

    public String getGiftCertRecipientEmail() {
        return this.giftCertRecipientEmail;
    }

    public void setGiftCertRecipientEmail(String giftCertRecipientEmail) {
        this.giftCertRecipientEmail = giftCertRecipientEmail;
    }

    public String getGiftCertMessage() {
        return this.giftCertMessage;
    }

    public void setGiftCertMessage(String giftCertMessage) {
        this.giftCertMessage = giftCertMessage;
    }

    public Double getTaxAmount() {
        return this.taxAmount;
    }

    public void setTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public String getGiftCertNumber() {
        return this.giftCertNumber;
    }

    public void setGiftCertNumber(String giftCertNumber) {
        this.giftCertNumber = giftCertNumber;
    }

    public Long getShipGroup() {
        return this.shipGroup;
    }

    public void setShipGroup(Long shipGroup) {
        this.shipGroup = shipGroup;
    }

    public Boolean getItemIsFulfilled() {
        return this.itemIsFulfilled;
    }

    public void setItemIsFulfilled(Boolean itemIsFulfilled) {
        this.itemIsFulfilled = itemIsFulfilled;
    }

    public RecordRef getShipAddress() {
        return this.shipAddress;
    }

    public void setShipAddress(RecordRef shipAddress) {
        this.shipAddress = shipAddress;
    }

    public RecordRef getShipMethod() {
        return this.shipMethod;
    }

    public void setShipMethod(RecordRef shipMethod) {
        this.shipMethod = shipMethod;
    }

    public VsoeSopGroup getVsoeSopGroup() {
        return this.vsoeSopGroup;
    }

    public void setVsoeSopGroup(VsoeSopGroup vsoeSopGroup) {
        this.vsoeSopGroup = vsoeSopGroup;
    }

    public Boolean getVsoeIsEstimate() {
        return this.vsoeIsEstimate;
    }

    public void setVsoeIsEstimate(Boolean vsoeIsEstimate) {
        this.vsoeIsEstimate = vsoeIsEstimate;
    }

    public Double getVsoePrice() {
        return this.vsoePrice;
    }

    public void setVsoePrice(Double vsoePrice) {
        this.vsoePrice = vsoePrice;
    }

    public Double getVsoeAmount() {
        return this.vsoeAmount;
    }

    public void setVsoeAmount(Double vsoeAmount) {
        this.vsoeAmount = vsoeAmount;
    }

    public Double getVsoeAllocation() {
        return this.vsoeAllocation;
    }

    public void setVsoeAllocation(Double vsoeAllocation) {
        this.vsoeAllocation = vsoeAllocation;
    }

    public VsoeDeferral getVsoeDeferral() {
        return this.vsoeDeferral;
    }

    public void setVsoeDeferral(VsoeDeferral vsoeDeferral) {
        this.vsoeDeferral = vsoeDeferral;
    }

    public VsoePermitDiscount getVsoePermitDiscount() {
        return this.vsoePermitDiscount;
    }

    public void setVsoePermitDiscount(VsoePermitDiscount vsoePermitDiscount) {
        this.vsoePermitDiscount = vsoePermitDiscount;
    }

    public Boolean getVsoeDelivered() {
        return this.vsoeDelivered;
    }

    public void setVsoeDelivered(Boolean vsoeDelivered) {
        this.vsoeDelivered = vsoeDelivered;
    }

    public RecordRef getChargeType() {
        return this.chargeType;
    }

    public void setChargeType(RecordRef chargeType) {
        this.chargeType = chargeType;
    }

    public RecordRefList getChargesList() {
        return this.chargesList;
    }

    public void setChargesList(RecordRefList chargesList) {
        this.chargesList = chargesList;
    }

    public CustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CashSaleItem)) {
            return false;
        }
        CashSaleItem other = (CashSaleItem)obj;
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
        boolean _equals = (this.job == null && other.getJob() == null || this.job != null && this.job.equals(other.getJob())) && (this.item == null && other.getItem() == null || this.item != null && this.item.equals(other.getItem())) && (this.line == null && other.getLine() == null || this.line != null && this.line.equals(other.getLine())) && (this.quantityAvailable == null && other.getQuantityAvailable() == null || this.quantityAvailable != null && this.quantityAvailable.equals(other.getQuantityAvailable())) && (this.quantityOnHand == null && other.getQuantityOnHand() == null || this.quantityOnHand != null && this.quantityOnHand.equals(other.getQuantityOnHand())) && (this.quantityFulfilled == null && other.getQuantityFulfilled() == null || this.quantityFulfilled != null && this.quantityFulfilled.equals(other.getQuantityFulfilled())) && (this.quantity == null && other.getQuantity() == null || this.quantity != null && this.quantity.equals(other.getQuantity())) && (this.units == null && other.getUnits() == null || this.units != null && this.units.equals(other.getUnits())) && (this.inventoryDetail == null && other.getInventoryDetail() == null || this.inventoryDetail != null && this.inventoryDetail.equals(other.getInventoryDetail())) && (this.serialNumbers == null && other.getSerialNumbers() == null || this.serialNumbers != null && this.serialNumbers.equals(other.getSerialNumbers())) && (this.binNumbers == null && other.getBinNumbers() == null || this.binNumbers != null && this.binNumbers.equals(other.getBinNumbers())) && (this.description == null && other.getDescription() == null || this.description != null && this.description.equals(other.getDescription())) && (this.price == null && other.getPrice() == null || this.price != null && this.price.equals(other.getPrice())) && (this.rate == null && other.getRate() == null || this.rate != null && this.rate.equals(other.getRate())) && (this.amount == null && other.getAmount() == null || this.amount != null && this.amount.equals(other.getAmount())) && (this.orderLine == null && other.getOrderLine() == null || this.orderLine != null && this.orderLine.equals(other.getOrderLine())) && (this.licenseCode == null && other.getLicenseCode() == null || this.licenseCode != null && this.licenseCode.equals(other.getLicenseCode())) && (this.isTaxable == null && other.getIsTaxable() == null || this.isTaxable != null && this.isTaxable.equals(other.getIsTaxable())) && (this.options == null && other.getOptions() == null || this.options != null && this.options.equals(other.getOptions())) && (this.deferRevRec == null && other.getDeferRevRec() == null || this.deferRevRec != null && this.deferRevRec.equals(other.getDeferRevRec())) && (this.currentPercent == null && other.getCurrentPercent() == null || this.currentPercent != null && this.currentPercent.equals(other.getCurrentPercent())) && (this.department == null && other.getDepartment() == null || this.department != null && this.department.equals(other.getDepartment())) && (this.percentComplete == null && other.getPercentComplete() == null || this.percentComplete != null && this.percentComplete.equals(other.getPercentComplete())) && (this._class == null && other.get_class() == null || this._class != null && this._class.equals(other.get_class())) && (this.location == null && other.getLocation() == null || this.location != null && this.location.equals(other.getLocation())) && (this.revRecSchedule == null && other.getRevRecSchedule() == null || this.revRecSchedule != null && this.revRecSchedule.equals(other.getRevRecSchedule())) && (this.revRecStartDate == null && other.getRevRecStartDate() == null || this.revRecStartDate != null && this.revRecStartDate.equals(other.getRevRecStartDate())) && (this.revRecEndDate == null && other.getRevRecEndDate() == null || this.revRecEndDate != null && this.revRecEndDate.equals(other.getRevRecEndDate())) && (this.subscriptionLine == null && other.getSubscriptionLine() == null || this.subscriptionLine != null && this.subscriptionLine.equals(other.getSubscriptionLine())) && (this.grossAmt == null && other.getGrossAmt() == null || this.grossAmt != null && this.grossAmt.equals(other.getGrossAmt())) && (this.costEstimateType == null && other.getCostEstimateType() == null || this.costEstimateType != null && this.costEstimateType.equals(other.getCostEstimateType())) && (this.excludeFromRateRequest == null && other.getExcludeFromRateRequest() == null || this.excludeFromRateRequest != null && this.excludeFromRateRequest.equals(other.getExcludeFromRateRequest())) && (this.catchUpPeriod == null && other.getCatchUpPeriod() == null || this.catchUpPeriod != null && this.catchUpPeriod.equals(other.getCatchUpPeriod())) && (this.costEstimate == null && other.getCostEstimate() == null || this.costEstimate != null && this.costEstimate.equals(other.getCostEstimate())) && (this.taxDetailsReference == null && other.getTaxDetailsReference() == null || this.taxDetailsReference != null && this.taxDetailsReference.equals(other.getTaxDetailsReference())) && (this.amountOrdered == null && other.getAmountOrdered() == null || this.amountOrdered != null && this.amountOrdered.equals(other.getAmountOrdered())) && (this.tax1Amt == null && other.getTax1Amt() == null || this.tax1Amt != null && this.tax1Amt.equals(other.getTax1Amt())) && (this.quantityOrdered == null && other.getQuantityOrdered() == null || this.quantityOrdered != null && this.quantityOrdered.equals(other.getQuantityOrdered())) && (this.quantityRemaining == null && other.getQuantityRemaining() == null || this.quantityRemaining != null && this.quantityRemaining.equals(other.getQuantityRemaining())) && (this.taxCode == null && other.getTaxCode() == null || this.taxCode != null && this.taxCode.equals(other.getTaxCode())) && (this.taxRate1 == null && other.getTaxRate1() == null || this.taxRate1 != null && this.taxRate1.equals(other.getTaxRate1())) && (this.taxRate2 == null && other.getTaxRate2() == null || this.taxRate2 != null && this.taxRate2.equals(other.getTaxRate2())) && (this.giftCertFrom == null && other.getGiftCertFrom() == null || this.giftCertFrom != null && this.giftCertFrom.equals(other.getGiftCertFrom())) && (this.giftCertRecipientName == null && other.getGiftCertRecipientName() == null || this.giftCertRecipientName != null && this.giftCertRecipientName.equals(other.getGiftCertRecipientName())) && (this.giftCertRecipientEmail == null && other.getGiftCertRecipientEmail() == null || this.giftCertRecipientEmail != null && this.giftCertRecipientEmail.equals(other.getGiftCertRecipientEmail())) && (this.giftCertMessage == null && other.getGiftCertMessage() == null || this.giftCertMessage != null && this.giftCertMessage.equals(other.getGiftCertMessage())) && (this.taxAmount == null && other.getTaxAmount() == null || this.taxAmount != null && this.taxAmount.equals(other.getTaxAmount())) && (this.giftCertNumber == null && other.getGiftCertNumber() == null || this.giftCertNumber != null && this.giftCertNumber.equals(other.getGiftCertNumber())) && (this.shipGroup == null && other.getShipGroup() == null || this.shipGroup != null && this.shipGroup.equals(other.getShipGroup())) && (this.itemIsFulfilled == null && other.getItemIsFulfilled() == null || this.itemIsFulfilled != null && this.itemIsFulfilled.equals(other.getItemIsFulfilled())) && (this.shipAddress == null && other.getShipAddress() == null || this.shipAddress != null && this.shipAddress.equals(other.getShipAddress())) && (this.shipMethod == null && other.getShipMethod() == null || this.shipMethod != null && this.shipMethod.equals(other.getShipMethod())) && (this.vsoeSopGroup == null && other.getVsoeSopGroup() == null || this.vsoeSopGroup != null && this.vsoeSopGroup.equals(other.getVsoeSopGroup())) && (this.vsoeIsEstimate == null && other.getVsoeIsEstimate() == null || this.vsoeIsEstimate != null && this.vsoeIsEstimate.equals(other.getVsoeIsEstimate())) && (this.vsoePrice == null && other.getVsoePrice() == null || this.vsoePrice != null && this.vsoePrice.equals(other.getVsoePrice())) && (this.vsoeAmount == null && other.getVsoeAmount() == null || this.vsoeAmount != null && this.vsoeAmount.equals(other.getVsoeAmount())) && (this.vsoeAllocation == null && other.getVsoeAllocation() == null || this.vsoeAllocation != null && this.vsoeAllocation.equals(other.getVsoeAllocation())) && (this.vsoeDeferral == null && other.getVsoeDeferral() == null || this.vsoeDeferral != null && this.vsoeDeferral.equals(other.getVsoeDeferral())) && (this.vsoePermitDiscount == null && other.getVsoePermitDiscount() == null || this.vsoePermitDiscount != null && this.vsoePermitDiscount.equals(other.getVsoePermitDiscount())) && (this.vsoeDelivered == null && other.getVsoeDelivered() == null || this.vsoeDelivered != null && this.vsoeDelivered.equals(other.getVsoeDelivered())) && (this.chargeType == null && other.getChargeType() == null || this.chargeType != null && this.chargeType.equals(other.getChargeType())) && (this.chargesList == null && other.getChargesList() == null || this.chargesList != null && this.chargesList.equals(other.getChargesList())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getJob() != null) {
            _hashCode += this.getJob().hashCode();
        }
        if (this.getItem() != null) {
            _hashCode += this.getItem().hashCode();
        }
        if (this.getLine() != null) {
            _hashCode += this.getLine().hashCode();
        }
        if (this.getQuantityAvailable() != null) {
            _hashCode += this.getQuantityAvailable().hashCode();
        }
        if (this.getQuantityOnHand() != null) {
            _hashCode += this.getQuantityOnHand().hashCode();
        }
        if (this.getQuantityFulfilled() != null) {
            _hashCode += this.getQuantityFulfilled().hashCode();
        }
        if (this.getQuantity() != null) {
            _hashCode += this.getQuantity().hashCode();
        }
        if (this.getUnits() != null) {
            _hashCode += this.getUnits().hashCode();
        }
        if (this.getInventoryDetail() != null) {
            _hashCode += this.getInventoryDetail().hashCode();
        }
        if (this.getSerialNumbers() != null) {
            _hashCode += this.getSerialNumbers().hashCode();
        }
        if (this.getBinNumbers() != null) {
            _hashCode += this.getBinNumbers().hashCode();
        }
        if (this.getDescription() != null) {
            _hashCode += this.getDescription().hashCode();
        }
        if (this.getPrice() != null) {
            _hashCode += this.getPrice().hashCode();
        }
        if (this.getRate() != null) {
            _hashCode += this.getRate().hashCode();
        }
        if (this.getAmount() != null) {
            _hashCode += this.getAmount().hashCode();
        }
        if (this.getOrderLine() != null) {
            _hashCode += this.getOrderLine().hashCode();
        }
        if (this.getLicenseCode() != null) {
            _hashCode += this.getLicenseCode().hashCode();
        }
        if (this.getIsTaxable() != null) {
            _hashCode += this.getIsTaxable().hashCode();
        }
        if (this.getOptions() != null) {
            _hashCode += this.getOptions().hashCode();
        }
        if (this.getDeferRevRec() != null) {
            _hashCode += this.getDeferRevRec().hashCode();
        }
        if (this.getCurrentPercent() != null) {
            _hashCode += this.getCurrentPercent().hashCode();
        }
        if (this.getDepartment() != null) {
            _hashCode += this.getDepartment().hashCode();
        }
        if (this.getPercentComplete() != null) {
            _hashCode += this.getPercentComplete().hashCode();
        }
        if (this.get_class() != null) {
            _hashCode += this.get_class().hashCode();
        }
        if (this.getLocation() != null) {
            _hashCode += this.getLocation().hashCode();
        }
        if (this.getRevRecSchedule() != null) {
            _hashCode += this.getRevRecSchedule().hashCode();
        }
        if (this.getRevRecStartDate() != null) {
            _hashCode += this.getRevRecStartDate().hashCode();
        }
        if (this.getRevRecEndDate() != null) {
            _hashCode += this.getRevRecEndDate().hashCode();
        }
        if (this.getSubscriptionLine() != null) {
            _hashCode += this.getSubscriptionLine().hashCode();
        }
        if (this.getGrossAmt() != null) {
            _hashCode += this.getGrossAmt().hashCode();
        }
        if (this.getCostEstimateType() != null) {
            _hashCode += this.getCostEstimateType().hashCode();
        }
        if (this.getExcludeFromRateRequest() != null) {
            _hashCode += this.getExcludeFromRateRequest().hashCode();
        }
        if (this.getCatchUpPeriod() != null) {
            _hashCode += this.getCatchUpPeriod().hashCode();
        }
        if (this.getCostEstimate() != null) {
            _hashCode += this.getCostEstimate().hashCode();
        }
        if (this.getTaxDetailsReference() != null) {
            _hashCode += this.getTaxDetailsReference().hashCode();
        }
        if (this.getAmountOrdered() != null) {
            _hashCode += this.getAmountOrdered().hashCode();
        }
        if (this.getTax1Amt() != null) {
            _hashCode += this.getTax1Amt().hashCode();
        }
        if (this.getQuantityOrdered() != null) {
            _hashCode += this.getQuantityOrdered().hashCode();
        }
        if (this.getQuantityRemaining() != null) {
            _hashCode += this.getQuantityRemaining().hashCode();
        }
        if (this.getTaxCode() != null) {
            _hashCode += this.getTaxCode().hashCode();
        }
        if (this.getTaxRate1() != null) {
            _hashCode += this.getTaxRate1().hashCode();
        }
        if (this.getTaxRate2() != null) {
            _hashCode += this.getTaxRate2().hashCode();
        }
        if (this.getGiftCertFrom() != null) {
            _hashCode += this.getGiftCertFrom().hashCode();
        }
        if (this.getGiftCertRecipientName() != null) {
            _hashCode += this.getGiftCertRecipientName().hashCode();
        }
        if (this.getGiftCertRecipientEmail() != null) {
            _hashCode += this.getGiftCertRecipientEmail().hashCode();
        }
        if (this.getGiftCertMessage() != null) {
            _hashCode += this.getGiftCertMessage().hashCode();
        }
        if (this.getTaxAmount() != null) {
            _hashCode += this.getTaxAmount().hashCode();
        }
        if (this.getGiftCertNumber() != null) {
            _hashCode += this.getGiftCertNumber().hashCode();
        }
        if (this.getShipGroup() != null) {
            _hashCode += this.getShipGroup().hashCode();
        }
        if (this.getItemIsFulfilled() != null) {
            _hashCode += this.getItemIsFulfilled().hashCode();
        }
        if (this.getShipAddress() != null) {
            _hashCode += this.getShipAddress().hashCode();
        }
        if (this.getShipMethod() != null) {
            _hashCode += this.getShipMethod().hashCode();
        }
        if (this.getVsoeSopGroup() != null) {
            _hashCode += this.getVsoeSopGroup().hashCode();
        }
        if (this.getVsoeIsEstimate() != null) {
            _hashCode += this.getVsoeIsEstimate().hashCode();
        }
        if (this.getVsoePrice() != null) {
            _hashCode += this.getVsoePrice().hashCode();
        }
        if (this.getVsoeAmount() != null) {
            _hashCode += this.getVsoeAmount().hashCode();
        }
        if (this.getVsoeAllocation() != null) {
            _hashCode += this.getVsoeAllocation().hashCode();
        }
        if (this.getVsoeDeferral() != null) {
            _hashCode += this.getVsoeDeferral().hashCode();
        }
        if (this.getVsoePermitDiscount() != null) {
            _hashCode += this.getVsoePermitDiscount().hashCode();
        }
        if (this.getVsoeDelivered() != null) {
            _hashCode += this.getVsoeDelivered().hashCode();
        }
        if (this.getChargeType() != null) {
            _hashCode += this.getChargeType().hashCode();
        }
        if (this.getChargesList() != null) {
            _hashCode += this.getChargesList().hashCode();
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
        typeDesc.setXmlType(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "CashSaleItem"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("job");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "job"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "item"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("line");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "line"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityAvailable");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "quantityAvailable"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityOnHand");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "quantityOnHand"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityFulfilled");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "quantityFulfilled"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "quantity"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("units");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "units"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("inventoryDetail");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "inventoryDetail"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "InventoryDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("serialNumbers");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "serialNumbers"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("binNumbers");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "binNumbers"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "description"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "price"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("rate");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "rate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "amount"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("orderLine");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "orderLine"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("licenseCode");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "licenseCode"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isTaxable");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "isTaxable"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("options");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "options"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "CustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("deferRevRec");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "deferRevRec"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("currentPercent");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "currentPercent"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "department"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("percentComplete");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "percentComplete"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "class"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "location"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revRecSchedule");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "revRecSchedule"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revRecStartDate");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "revRecStartDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revRecEndDate");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "revRecEndDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subscriptionLine");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "subscriptionLine"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("grossAmt");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "grossAmt"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("costEstimateType");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "costEstimateType"));
        elemField.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "ItemCostEstimateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("excludeFromRateRequest");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "excludeFromRateRequest"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("catchUpPeriod");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "catchUpPeriod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("costEstimate");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "costEstimate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxDetailsReference");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "taxDetailsReference"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("amountOrdered");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "amountOrdered"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("tax1Amt");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "tax1Amt"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityOrdered");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "quantityOrdered"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityRemaining");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "quantityRemaining"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxCode");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "taxCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxRate1");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "taxRate1"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxRate2");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "taxRate2"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("giftCertFrom");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "giftCertFrom"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("giftCertRecipientName");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "giftCertRecipientName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("giftCertRecipientEmail");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "giftCertRecipientEmail"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("giftCertMessage");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "giftCertMessage"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxAmount");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "taxAmount"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("giftCertNumber");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "giftCertNumber"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipGroup");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "shipGroup"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemIsFulfilled");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "itemIsFulfilled"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipAddress");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "shipAddress"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipMethod");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "shipMethod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vsoeSopGroup");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "vsoeSopGroup"));
        elemField.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "VsoeSopGroup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vsoeIsEstimate");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "vsoeIsEstimate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vsoePrice");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "vsoePrice"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vsoeAmount");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "vsoeAmount"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vsoeAllocation");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "vsoeAllocation"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vsoeDeferral");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "vsoeDeferral"));
        elemField.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "VsoeDeferral"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vsoePermitDiscount");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "vsoePermitDiscount"));
        elemField.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "VsoePermitDiscount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vsoeDelivered");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "vsoeDelivered"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("chargeType");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "chargeType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("chargesList");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "chargesList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRefList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "CustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

