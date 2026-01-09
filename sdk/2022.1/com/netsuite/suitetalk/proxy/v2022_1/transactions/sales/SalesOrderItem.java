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
import com.netsuite.suitetalk.proxy.v2022_1.transactions.sales.types.SalesOrderItemCommitInventory;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.sales.types.SalesOrderItemCreatePo;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.sales.types.SalesOrderItemFulfillmentChoice;
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

public class SalesOrderItem
implements Serializable {
    private RecordRef job;
    private RecordRef subscription;
    private RecordRef item;
    private Double quantityAvailable;
    private Boolean expandItemGroup;
    private Long lineUniqueKey;
    private Double quantityOnHand;
    private Double quantity;
    private RecordRef units;
    private InventoryDetail inventoryDetail;
    private String description;
    private RecordRef price;
    private String rate;
    private String serialNumbers;
    private Double amount;
    private Boolean isTaxable;
    private SalesOrderItemCommitInventory commitInventory;
    private Double orderPriority;
    private String licenseCode;
    private CustomFieldList options;
    private RecordRef department;
    private RecordRef _class;
    private RecordRef location;
    private SalesOrderItemCreatePo createPo;
    private RecordRef createdPo;
    private Double altSalesAmt;
    private Boolean createWo;
    private RecordRef poVendor;
    private String poCurrency;
    private Double poRate;
    private RecordRef revRecSchedule;
    private Calendar revRecStartDate;
    private Long revRecTermInMonths;
    private Calendar revRecEndDate;
    private Boolean deferRevRec;
    private Boolean isClosed;
    private SalesOrderItemFulfillmentChoice itemFulfillmentChoice;
    private RecordRef catchUpPeriod;
    private RecordRef billingSchedule;
    private Boolean fromJob;
    private Double grossAmt;
    private Double taxAmount;
    private Boolean excludeFromRateRequest;
    private Boolean isEstimate;
    private RecordRef inventoryLocation;
    private RecordRef inventorySubsidiary;
    private Long line;
    private Double percentComplete;
    private ItemCostEstimateType costEstimateType;
    private Double costEstimate;
    private Double quantityBackOrdered;
    private Double quantityBilled;
    private Double quantityCommitted;
    private Double quantityFulfilled;
    private Double quantityPacked;
    private Double quantityPicked;
    private Double tax1Amt;
    private RecordRef taxCode;
    private Double taxRate1;
    private Double taxRate2;
    private String giftCertFrom;
    private String giftCertRecipientName;
    private String giftCertRecipientEmail;
    private String giftCertMessage;
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
    private Calendar expectedShipDate;
    private Boolean noAutoAssignLocation;
    private Boolean locationAutoAssigned;
    private String taxDetailsReference;
    private RecordRef chargeType;
    private RecordRef orderAllocationStrategy;
    private Calendar requestedDate;
    private CustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(SalesOrderItem.class, true);

    public SalesOrderItem() {
    }

    public SalesOrderItem(RecordRef job, RecordRef subscription, RecordRef item, Double quantityAvailable, Boolean expandItemGroup, Long lineUniqueKey, Double quantityOnHand, Double quantity, RecordRef units, InventoryDetail inventoryDetail, String description, RecordRef price, String rate, String serialNumbers, Double amount, Boolean isTaxable, SalesOrderItemCommitInventory commitInventory, Double orderPriority, String licenseCode, CustomFieldList options, RecordRef department, RecordRef _class, RecordRef location, SalesOrderItemCreatePo createPo, RecordRef createdPo, Double altSalesAmt, Boolean createWo, RecordRef poVendor, String poCurrency, Double poRate, RecordRef revRecSchedule, Calendar revRecStartDate, Long revRecTermInMonths, Calendar revRecEndDate, Boolean deferRevRec, Boolean isClosed, SalesOrderItemFulfillmentChoice itemFulfillmentChoice, RecordRef catchUpPeriod, RecordRef billingSchedule, Boolean fromJob, Double grossAmt, Double taxAmount, Boolean excludeFromRateRequest, Boolean isEstimate, RecordRef inventoryLocation, RecordRef inventorySubsidiary, Long line, Double percentComplete, ItemCostEstimateType costEstimateType, Double costEstimate, Double quantityBackOrdered, Double quantityBilled, Double quantityCommitted, Double quantityFulfilled, Double quantityPacked, Double quantityPicked, Double tax1Amt, RecordRef taxCode, Double taxRate1, Double taxRate2, String giftCertFrom, String giftCertRecipientName, String giftCertRecipientEmail, String giftCertMessage, String giftCertNumber, Long shipGroup, Boolean itemIsFulfilled, RecordRef shipAddress, RecordRef shipMethod, VsoeSopGroup vsoeSopGroup, Boolean vsoeIsEstimate, Double vsoePrice, Double vsoeAmount, Double vsoeAllocation, VsoeDeferral vsoeDeferral, VsoePermitDiscount vsoePermitDiscount, Boolean vsoeDelivered, Calendar expectedShipDate, Boolean noAutoAssignLocation, Boolean locationAutoAssigned, String taxDetailsReference, RecordRef chargeType, RecordRef orderAllocationStrategy, Calendar requestedDate, CustomFieldList customFieldList) {
        this.job = job;
        this.subscription = subscription;
        this.item = item;
        this.quantityAvailable = quantityAvailable;
        this.expandItemGroup = expandItemGroup;
        this.lineUniqueKey = lineUniqueKey;
        this.quantityOnHand = quantityOnHand;
        this.quantity = quantity;
        this.units = units;
        this.inventoryDetail = inventoryDetail;
        this.description = description;
        this.price = price;
        this.rate = rate;
        this.serialNumbers = serialNumbers;
        this.amount = amount;
        this.isTaxable = isTaxable;
        this.commitInventory = commitInventory;
        this.orderPriority = orderPriority;
        this.licenseCode = licenseCode;
        this.options = options;
        this.department = department;
        this._class = _class;
        this.location = location;
        this.createPo = createPo;
        this.createdPo = createdPo;
        this.altSalesAmt = altSalesAmt;
        this.createWo = createWo;
        this.poVendor = poVendor;
        this.poCurrency = poCurrency;
        this.poRate = poRate;
        this.revRecSchedule = revRecSchedule;
        this.revRecStartDate = revRecStartDate;
        this.revRecTermInMonths = revRecTermInMonths;
        this.revRecEndDate = revRecEndDate;
        this.deferRevRec = deferRevRec;
        this.isClosed = isClosed;
        this.itemFulfillmentChoice = itemFulfillmentChoice;
        this.catchUpPeriod = catchUpPeriod;
        this.billingSchedule = billingSchedule;
        this.fromJob = fromJob;
        this.grossAmt = grossAmt;
        this.taxAmount = taxAmount;
        this.excludeFromRateRequest = excludeFromRateRequest;
        this.isEstimate = isEstimate;
        this.inventoryLocation = inventoryLocation;
        this.inventorySubsidiary = inventorySubsidiary;
        this.line = line;
        this.percentComplete = percentComplete;
        this.costEstimateType = costEstimateType;
        this.costEstimate = costEstimate;
        this.quantityBackOrdered = quantityBackOrdered;
        this.quantityBilled = quantityBilled;
        this.quantityCommitted = quantityCommitted;
        this.quantityFulfilled = quantityFulfilled;
        this.quantityPacked = quantityPacked;
        this.quantityPicked = quantityPicked;
        this.tax1Amt = tax1Amt;
        this.taxCode = taxCode;
        this.taxRate1 = taxRate1;
        this.taxRate2 = taxRate2;
        this.giftCertFrom = giftCertFrom;
        this.giftCertRecipientName = giftCertRecipientName;
        this.giftCertRecipientEmail = giftCertRecipientEmail;
        this.giftCertMessage = giftCertMessage;
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
        this.expectedShipDate = expectedShipDate;
        this.noAutoAssignLocation = noAutoAssignLocation;
        this.locationAutoAssigned = locationAutoAssigned;
        this.taxDetailsReference = taxDetailsReference;
        this.chargeType = chargeType;
        this.orderAllocationStrategy = orderAllocationStrategy;
        this.requestedDate = requestedDate;
        this.customFieldList = customFieldList;
    }

    public RecordRef getJob() {
        return this.job;
    }

    public void setJob(RecordRef job) {
        this.job = job;
    }

    public RecordRef getSubscription() {
        return this.subscription;
    }

    public void setSubscription(RecordRef subscription) {
        this.subscription = subscription;
    }

    public RecordRef getItem() {
        return this.item;
    }

    public void setItem(RecordRef item) {
        this.item = item;
    }

    public Double getQuantityAvailable() {
        return this.quantityAvailable;
    }

    public void setQuantityAvailable(Double quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

    public Boolean getExpandItemGroup() {
        return this.expandItemGroup;
    }

    public void setExpandItemGroup(Boolean expandItemGroup) {
        this.expandItemGroup = expandItemGroup;
    }

    public Long getLineUniqueKey() {
        return this.lineUniqueKey;
    }

    public void setLineUniqueKey(Long lineUniqueKey) {
        this.lineUniqueKey = lineUniqueKey;
    }

    public Double getQuantityOnHand() {
        return this.quantityOnHand;
    }

    public void setQuantityOnHand(Double quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
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

    public String getSerialNumbers() {
        return this.serialNumbers;
    }

    public void setSerialNumbers(String serialNumbers) {
        this.serialNumbers = serialNumbers;
    }

    public Double getAmount() {
        return this.amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public Boolean getIsTaxable() {
        return this.isTaxable;
    }

    public void setIsTaxable(Boolean isTaxable) {
        this.isTaxable = isTaxable;
    }

    public SalesOrderItemCommitInventory getCommitInventory() {
        return this.commitInventory;
    }

    public void setCommitInventory(SalesOrderItemCommitInventory commitInventory) {
        this.commitInventory = commitInventory;
    }

    public Double getOrderPriority() {
        return this.orderPriority;
    }

    public void setOrderPriority(Double orderPriority) {
        this.orderPriority = orderPriority;
    }

    public String getLicenseCode() {
        return this.licenseCode;
    }

    public void setLicenseCode(String licenseCode) {
        this.licenseCode = licenseCode;
    }

    public CustomFieldList getOptions() {
        return this.options;
    }

    public void setOptions(CustomFieldList options) {
        this.options = options;
    }

    public RecordRef getDepartment() {
        return this.department;
    }

    public void setDepartment(RecordRef department) {
        this.department = department;
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

    public SalesOrderItemCreatePo getCreatePo() {
        return this.createPo;
    }

    public void setCreatePo(SalesOrderItemCreatePo createPo) {
        this.createPo = createPo;
    }

    public RecordRef getCreatedPo() {
        return this.createdPo;
    }

    public void setCreatedPo(RecordRef createdPo) {
        this.createdPo = createdPo;
    }

    public Double getAltSalesAmt() {
        return this.altSalesAmt;
    }

    public void setAltSalesAmt(Double altSalesAmt) {
        this.altSalesAmt = altSalesAmt;
    }

    public Boolean getCreateWo() {
        return this.createWo;
    }

    public void setCreateWo(Boolean createWo) {
        this.createWo = createWo;
    }

    public RecordRef getPoVendor() {
        return this.poVendor;
    }

    public void setPoVendor(RecordRef poVendor) {
        this.poVendor = poVendor;
    }

    public String getPoCurrency() {
        return this.poCurrency;
    }

    public void setPoCurrency(String poCurrency) {
        this.poCurrency = poCurrency;
    }

    public Double getPoRate() {
        return this.poRate;
    }

    public void setPoRate(Double poRate) {
        this.poRate = poRate;
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

    public Long getRevRecTermInMonths() {
        return this.revRecTermInMonths;
    }

    public void setRevRecTermInMonths(Long revRecTermInMonths) {
        this.revRecTermInMonths = revRecTermInMonths;
    }

    public Calendar getRevRecEndDate() {
        return this.revRecEndDate;
    }

    public void setRevRecEndDate(Calendar revRecEndDate) {
        this.revRecEndDate = revRecEndDate;
    }

    public Boolean getDeferRevRec() {
        return this.deferRevRec;
    }

    public void setDeferRevRec(Boolean deferRevRec) {
        this.deferRevRec = deferRevRec;
    }

    public Boolean getIsClosed() {
        return this.isClosed;
    }

    public void setIsClosed(Boolean isClosed) {
        this.isClosed = isClosed;
    }

    public SalesOrderItemFulfillmentChoice getItemFulfillmentChoice() {
        return this.itemFulfillmentChoice;
    }

    public void setItemFulfillmentChoice(SalesOrderItemFulfillmentChoice itemFulfillmentChoice) {
        this.itemFulfillmentChoice = itemFulfillmentChoice;
    }

    public RecordRef getCatchUpPeriod() {
        return this.catchUpPeriod;
    }

    public void setCatchUpPeriod(RecordRef catchUpPeriod) {
        this.catchUpPeriod = catchUpPeriod;
    }

    public RecordRef getBillingSchedule() {
        return this.billingSchedule;
    }

    public void setBillingSchedule(RecordRef billingSchedule) {
        this.billingSchedule = billingSchedule;
    }

    public Boolean getFromJob() {
        return this.fromJob;
    }

    public void setFromJob(Boolean fromJob) {
        this.fromJob = fromJob;
    }

    public Double getGrossAmt() {
        return this.grossAmt;
    }

    public void setGrossAmt(Double grossAmt) {
        this.grossAmt = grossAmt;
    }

    public Double getTaxAmount() {
        return this.taxAmount;
    }

    public void setTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
    }

    public Boolean getExcludeFromRateRequest() {
        return this.excludeFromRateRequest;
    }

    public void setExcludeFromRateRequest(Boolean excludeFromRateRequest) {
        this.excludeFromRateRequest = excludeFromRateRequest;
    }

    public Boolean getIsEstimate() {
        return this.isEstimate;
    }

    public void setIsEstimate(Boolean isEstimate) {
        this.isEstimate = isEstimate;
    }

    public RecordRef getInventoryLocation() {
        return this.inventoryLocation;
    }

    public void setInventoryLocation(RecordRef inventoryLocation) {
        this.inventoryLocation = inventoryLocation;
    }

    public RecordRef getInventorySubsidiary() {
        return this.inventorySubsidiary;
    }

    public void setInventorySubsidiary(RecordRef inventorySubsidiary) {
        this.inventorySubsidiary = inventorySubsidiary;
    }

    public Long getLine() {
        return this.line;
    }

    public void setLine(Long line) {
        this.line = line;
    }

    public Double getPercentComplete() {
        return this.percentComplete;
    }

    public void setPercentComplete(Double percentComplete) {
        this.percentComplete = percentComplete;
    }

    public ItemCostEstimateType getCostEstimateType() {
        return this.costEstimateType;
    }

    public void setCostEstimateType(ItemCostEstimateType costEstimateType) {
        this.costEstimateType = costEstimateType;
    }

    public Double getCostEstimate() {
        return this.costEstimate;
    }

    public void setCostEstimate(Double costEstimate) {
        this.costEstimate = costEstimate;
    }

    public Double getQuantityBackOrdered() {
        return this.quantityBackOrdered;
    }

    public void setQuantityBackOrdered(Double quantityBackOrdered) {
        this.quantityBackOrdered = quantityBackOrdered;
    }

    public Double getQuantityBilled() {
        return this.quantityBilled;
    }

    public void setQuantityBilled(Double quantityBilled) {
        this.quantityBilled = quantityBilled;
    }

    public Double getQuantityCommitted() {
        return this.quantityCommitted;
    }

    public void setQuantityCommitted(Double quantityCommitted) {
        this.quantityCommitted = quantityCommitted;
    }

    public Double getQuantityFulfilled() {
        return this.quantityFulfilled;
    }

    public void setQuantityFulfilled(Double quantityFulfilled) {
        this.quantityFulfilled = quantityFulfilled;
    }

    public Double getQuantityPacked() {
        return this.quantityPacked;
    }

    public void setQuantityPacked(Double quantityPacked) {
        this.quantityPacked = quantityPacked;
    }

    public Double getQuantityPicked() {
        return this.quantityPicked;
    }

    public void setQuantityPicked(Double quantityPicked) {
        this.quantityPicked = quantityPicked;
    }

    public Double getTax1Amt() {
        return this.tax1Amt;
    }

    public void setTax1Amt(Double tax1Amt) {
        this.tax1Amt = tax1Amt;
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

    public Calendar getExpectedShipDate() {
        return this.expectedShipDate;
    }

    public void setExpectedShipDate(Calendar expectedShipDate) {
        this.expectedShipDate = expectedShipDate;
    }

    public Boolean getNoAutoAssignLocation() {
        return this.noAutoAssignLocation;
    }

    public void setNoAutoAssignLocation(Boolean noAutoAssignLocation) {
        this.noAutoAssignLocation = noAutoAssignLocation;
    }

    public Boolean getLocationAutoAssigned() {
        return this.locationAutoAssigned;
    }

    public void setLocationAutoAssigned(Boolean locationAutoAssigned) {
        this.locationAutoAssigned = locationAutoAssigned;
    }

    public String getTaxDetailsReference() {
        return this.taxDetailsReference;
    }

    public void setTaxDetailsReference(String taxDetailsReference) {
        this.taxDetailsReference = taxDetailsReference;
    }

    public RecordRef getChargeType() {
        return this.chargeType;
    }

    public void setChargeType(RecordRef chargeType) {
        this.chargeType = chargeType;
    }

    public RecordRef getOrderAllocationStrategy() {
        return this.orderAllocationStrategy;
    }

    public void setOrderAllocationStrategy(RecordRef orderAllocationStrategy) {
        this.orderAllocationStrategy = orderAllocationStrategy;
    }

    public Calendar getRequestedDate() {
        return this.requestedDate;
    }

    public void setRequestedDate(Calendar requestedDate) {
        this.requestedDate = requestedDate;
    }

    public CustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SalesOrderItem)) {
            return false;
        }
        SalesOrderItem other = (SalesOrderItem)obj;
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
        boolean _equals = (this.job == null && other.getJob() == null || this.job != null && this.job.equals(other.getJob())) && (this.subscription == null && other.getSubscription() == null || this.subscription != null && this.subscription.equals(other.getSubscription())) && (this.item == null && other.getItem() == null || this.item != null && this.item.equals(other.getItem())) && (this.quantityAvailable == null && other.getQuantityAvailable() == null || this.quantityAvailable != null && this.quantityAvailable.equals(other.getQuantityAvailable())) && (this.expandItemGroup == null && other.getExpandItemGroup() == null || this.expandItemGroup != null && this.expandItemGroup.equals(other.getExpandItemGroup())) && (this.lineUniqueKey == null && other.getLineUniqueKey() == null || this.lineUniqueKey != null && this.lineUniqueKey.equals(other.getLineUniqueKey())) && (this.quantityOnHand == null && other.getQuantityOnHand() == null || this.quantityOnHand != null && this.quantityOnHand.equals(other.getQuantityOnHand())) && (this.quantity == null && other.getQuantity() == null || this.quantity != null && this.quantity.equals(other.getQuantity())) && (this.units == null && other.getUnits() == null || this.units != null && this.units.equals(other.getUnits())) && (this.inventoryDetail == null && other.getInventoryDetail() == null || this.inventoryDetail != null && this.inventoryDetail.equals(other.getInventoryDetail())) && (this.description == null && other.getDescription() == null || this.description != null && this.description.equals(other.getDescription())) && (this.price == null && other.getPrice() == null || this.price != null && this.price.equals(other.getPrice())) && (this.rate == null && other.getRate() == null || this.rate != null && this.rate.equals(other.getRate())) && (this.serialNumbers == null && other.getSerialNumbers() == null || this.serialNumbers != null && this.serialNumbers.equals(other.getSerialNumbers())) && (this.amount == null && other.getAmount() == null || this.amount != null && this.amount.equals(other.getAmount())) && (this.isTaxable == null && other.getIsTaxable() == null || this.isTaxable != null && this.isTaxable.equals(other.getIsTaxable())) && (this.commitInventory == null && other.getCommitInventory() == null || this.commitInventory != null && this.commitInventory.equals(other.getCommitInventory())) && (this.orderPriority == null && other.getOrderPriority() == null || this.orderPriority != null && this.orderPriority.equals(other.getOrderPriority())) && (this.licenseCode == null && other.getLicenseCode() == null || this.licenseCode != null && this.licenseCode.equals(other.getLicenseCode())) && (this.options == null && other.getOptions() == null || this.options != null && this.options.equals(other.getOptions())) && (this.department == null && other.getDepartment() == null || this.department != null && this.department.equals(other.getDepartment())) && (this._class == null && other.get_class() == null || this._class != null && this._class.equals(other.get_class())) && (this.location == null && other.getLocation() == null || this.location != null && this.location.equals(other.getLocation())) && (this.createPo == null && other.getCreatePo() == null || this.createPo != null && this.createPo.equals(other.getCreatePo())) && (this.createdPo == null && other.getCreatedPo() == null || this.createdPo != null && this.createdPo.equals(other.getCreatedPo())) && (this.altSalesAmt == null && other.getAltSalesAmt() == null || this.altSalesAmt != null && this.altSalesAmt.equals(other.getAltSalesAmt())) && (this.createWo == null && other.getCreateWo() == null || this.createWo != null && this.createWo.equals(other.getCreateWo())) && (this.poVendor == null && other.getPoVendor() == null || this.poVendor != null && this.poVendor.equals(other.getPoVendor())) && (this.poCurrency == null && other.getPoCurrency() == null || this.poCurrency != null && this.poCurrency.equals(other.getPoCurrency())) && (this.poRate == null && other.getPoRate() == null || this.poRate != null && this.poRate.equals(other.getPoRate())) && (this.revRecSchedule == null && other.getRevRecSchedule() == null || this.revRecSchedule != null && this.revRecSchedule.equals(other.getRevRecSchedule())) && (this.revRecStartDate == null && other.getRevRecStartDate() == null || this.revRecStartDate != null && this.revRecStartDate.equals(other.getRevRecStartDate())) && (this.revRecTermInMonths == null && other.getRevRecTermInMonths() == null || this.revRecTermInMonths != null && this.revRecTermInMonths.equals(other.getRevRecTermInMonths())) && (this.revRecEndDate == null && other.getRevRecEndDate() == null || this.revRecEndDate != null && this.revRecEndDate.equals(other.getRevRecEndDate())) && (this.deferRevRec == null && other.getDeferRevRec() == null || this.deferRevRec != null && this.deferRevRec.equals(other.getDeferRevRec())) && (this.isClosed == null && other.getIsClosed() == null || this.isClosed != null && this.isClosed.equals(other.getIsClosed())) && (this.itemFulfillmentChoice == null && other.getItemFulfillmentChoice() == null || this.itemFulfillmentChoice != null && this.itemFulfillmentChoice.equals(other.getItemFulfillmentChoice())) && (this.catchUpPeriod == null && other.getCatchUpPeriod() == null || this.catchUpPeriod != null && this.catchUpPeriod.equals(other.getCatchUpPeriod())) && (this.billingSchedule == null && other.getBillingSchedule() == null || this.billingSchedule != null && this.billingSchedule.equals(other.getBillingSchedule())) && (this.fromJob == null && other.getFromJob() == null || this.fromJob != null && this.fromJob.equals(other.getFromJob())) && (this.grossAmt == null && other.getGrossAmt() == null || this.grossAmt != null && this.grossAmt.equals(other.getGrossAmt())) && (this.taxAmount == null && other.getTaxAmount() == null || this.taxAmount != null && this.taxAmount.equals(other.getTaxAmount())) && (this.excludeFromRateRequest == null && other.getExcludeFromRateRequest() == null || this.excludeFromRateRequest != null && this.excludeFromRateRequest.equals(other.getExcludeFromRateRequest())) && (this.isEstimate == null && other.getIsEstimate() == null || this.isEstimate != null && this.isEstimate.equals(other.getIsEstimate())) && (this.inventoryLocation == null && other.getInventoryLocation() == null || this.inventoryLocation != null && this.inventoryLocation.equals(other.getInventoryLocation())) && (this.inventorySubsidiary == null && other.getInventorySubsidiary() == null || this.inventorySubsidiary != null && this.inventorySubsidiary.equals(other.getInventorySubsidiary())) && (this.line == null && other.getLine() == null || this.line != null && this.line.equals(other.getLine())) && (this.percentComplete == null && other.getPercentComplete() == null || this.percentComplete != null && this.percentComplete.equals(other.getPercentComplete())) && (this.costEstimateType == null && other.getCostEstimateType() == null || this.costEstimateType != null && this.costEstimateType.equals(other.getCostEstimateType())) && (this.costEstimate == null && other.getCostEstimate() == null || this.costEstimate != null && this.costEstimate.equals(other.getCostEstimate())) && (this.quantityBackOrdered == null && other.getQuantityBackOrdered() == null || this.quantityBackOrdered != null && this.quantityBackOrdered.equals(other.getQuantityBackOrdered())) && (this.quantityBilled == null && other.getQuantityBilled() == null || this.quantityBilled != null && this.quantityBilled.equals(other.getQuantityBilled())) && (this.quantityCommitted == null && other.getQuantityCommitted() == null || this.quantityCommitted != null && this.quantityCommitted.equals(other.getQuantityCommitted())) && (this.quantityFulfilled == null && other.getQuantityFulfilled() == null || this.quantityFulfilled != null && this.quantityFulfilled.equals(other.getQuantityFulfilled())) && (this.quantityPacked == null && other.getQuantityPacked() == null || this.quantityPacked != null && this.quantityPacked.equals(other.getQuantityPacked())) && (this.quantityPicked == null && other.getQuantityPicked() == null || this.quantityPicked != null && this.quantityPicked.equals(other.getQuantityPicked())) && (this.tax1Amt == null && other.getTax1Amt() == null || this.tax1Amt != null && this.tax1Amt.equals(other.getTax1Amt())) && (this.taxCode == null && other.getTaxCode() == null || this.taxCode != null && this.taxCode.equals(other.getTaxCode())) && (this.taxRate1 == null && other.getTaxRate1() == null || this.taxRate1 != null && this.taxRate1.equals(other.getTaxRate1())) && (this.taxRate2 == null && other.getTaxRate2() == null || this.taxRate2 != null && this.taxRate2.equals(other.getTaxRate2())) && (this.giftCertFrom == null && other.getGiftCertFrom() == null || this.giftCertFrom != null && this.giftCertFrom.equals(other.getGiftCertFrom())) && (this.giftCertRecipientName == null && other.getGiftCertRecipientName() == null || this.giftCertRecipientName != null && this.giftCertRecipientName.equals(other.getGiftCertRecipientName())) && (this.giftCertRecipientEmail == null && other.getGiftCertRecipientEmail() == null || this.giftCertRecipientEmail != null && this.giftCertRecipientEmail.equals(other.getGiftCertRecipientEmail())) && (this.giftCertMessage == null && other.getGiftCertMessage() == null || this.giftCertMessage != null && this.giftCertMessage.equals(other.getGiftCertMessage())) && (this.giftCertNumber == null && other.getGiftCertNumber() == null || this.giftCertNumber != null && this.giftCertNumber.equals(other.getGiftCertNumber())) && (this.shipGroup == null && other.getShipGroup() == null || this.shipGroup != null && this.shipGroup.equals(other.getShipGroup())) && (this.itemIsFulfilled == null && other.getItemIsFulfilled() == null || this.itemIsFulfilled != null && this.itemIsFulfilled.equals(other.getItemIsFulfilled())) && (this.shipAddress == null && other.getShipAddress() == null || this.shipAddress != null && this.shipAddress.equals(other.getShipAddress())) && (this.shipMethod == null && other.getShipMethod() == null || this.shipMethod != null && this.shipMethod.equals(other.getShipMethod())) && (this.vsoeSopGroup == null && other.getVsoeSopGroup() == null || this.vsoeSopGroup != null && this.vsoeSopGroup.equals(other.getVsoeSopGroup())) && (this.vsoeIsEstimate == null && other.getVsoeIsEstimate() == null || this.vsoeIsEstimate != null && this.vsoeIsEstimate.equals(other.getVsoeIsEstimate())) && (this.vsoePrice == null && other.getVsoePrice() == null || this.vsoePrice != null && this.vsoePrice.equals(other.getVsoePrice())) && (this.vsoeAmount == null && other.getVsoeAmount() == null || this.vsoeAmount != null && this.vsoeAmount.equals(other.getVsoeAmount())) && (this.vsoeAllocation == null && other.getVsoeAllocation() == null || this.vsoeAllocation != null && this.vsoeAllocation.equals(other.getVsoeAllocation())) && (this.vsoeDeferral == null && other.getVsoeDeferral() == null || this.vsoeDeferral != null && this.vsoeDeferral.equals(other.getVsoeDeferral())) && (this.vsoePermitDiscount == null && other.getVsoePermitDiscount() == null || this.vsoePermitDiscount != null && this.vsoePermitDiscount.equals(other.getVsoePermitDiscount())) && (this.vsoeDelivered == null && other.getVsoeDelivered() == null || this.vsoeDelivered != null && this.vsoeDelivered.equals(other.getVsoeDelivered())) && (this.expectedShipDate == null && other.getExpectedShipDate() == null || this.expectedShipDate != null && this.expectedShipDate.equals(other.getExpectedShipDate())) && (this.noAutoAssignLocation == null && other.getNoAutoAssignLocation() == null || this.noAutoAssignLocation != null && this.noAutoAssignLocation.equals(other.getNoAutoAssignLocation())) && (this.locationAutoAssigned == null && other.getLocationAutoAssigned() == null || this.locationAutoAssigned != null && this.locationAutoAssigned.equals(other.getLocationAutoAssigned())) && (this.taxDetailsReference == null && other.getTaxDetailsReference() == null || this.taxDetailsReference != null && this.taxDetailsReference.equals(other.getTaxDetailsReference())) && (this.chargeType == null && other.getChargeType() == null || this.chargeType != null && this.chargeType.equals(other.getChargeType())) && (this.orderAllocationStrategy == null && other.getOrderAllocationStrategy() == null || this.orderAllocationStrategy != null && this.orderAllocationStrategy.equals(other.getOrderAllocationStrategy())) && (this.requestedDate == null && other.getRequestedDate() == null || this.requestedDate != null && this.requestedDate.equals(other.getRequestedDate())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
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
        if (this.getSubscription() != null) {
            _hashCode += this.getSubscription().hashCode();
        }
        if (this.getItem() != null) {
            _hashCode += this.getItem().hashCode();
        }
        if (this.getQuantityAvailable() != null) {
            _hashCode += this.getQuantityAvailable().hashCode();
        }
        if (this.getExpandItemGroup() != null) {
            _hashCode += this.getExpandItemGroup().hashCode();
        }
        if (this.getLineUniqueKey() != null) {
            _hashCode += this.getLineUniqueKey().hashCode();
        }
        if (this.getQuantityOnHand() != null) {
            _hashCode += this.getQuantityOnHand().hashCode();
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
        if (this.getDescription() != null) {
            _hashCode += this.getDescription().hashCode();
        }
        if (this.getPrice() != null) {
            _hashCode += this.getPrice().hashCode();
        }
        if (this.getRate() != null) {
            _hashCode += this.getRate().hashCode();
        }
        if (this.getSerialNumbers() != null) {
            _hashCode += this.getSerialNumbers().hashCode();
        }
        if (this.getAmount() != null) {
            _hashCode += this.getAmount().hashCode();
        }
        if (this.getIsTaxable() != null) {
            _hashCode += this.getIsTaxable().hashCode();
        }
        if (this.getCommitInventory() != null) {
            _hashCode += this.getCommitInventory().hashCode();
        }
        if (this.getOrderPriority() != null) {
            _hashCode += this.getOrderPriority().hashCode();
        }
        if (this.getLicenseCode() != null) {
            _hashCode += this.getLicenseCode().hashCode();
        }
        if (this.getOptions() != null) {
            _hashCode += this.getOptions().hashCode();
        }
        if (this.getDepartment() != null) {
            _hashCode += this.getDepartment().hashCode();
        }
        if (this.get_class() != null) {
            _hashCode += this.get_class().hashCode();
        }
        if (this.getLocation() != null) {
            _hashCode += this.getLocation().hashCode();
        }
        if (this.getCreatePo() != null) {
            _hashCode += this.getCreatePo().hashCode();
        }
        if (this.getCreatedPo() != null) {
            _hashCode += this.getCreatedPo().hashCode();
        }
        if (this.getAltSalesAmt() != null) {
            _hashCode += this.getAltSalesAmt().hashCode();
        }
        if (this.getCreateWo() != null) {
            _hashCode += this.getCreateWo().hashCode();
        }
        if (this.getPoVendor() != null) {
            _hashCode += this.getPoVendor().hashCode();
        }
        if (this.getPoCurrency() != null) {
            _hashCode += this.getPoCurrency().hashCode();
        }
        if (this.getPoRate() != null) {
            _hashCode += this.getPoRate().hashCode();
        }
        if (this.getRevRecSchedule() != null) {
            _hashCode += this.getRevRecSchedule().hashCode();
        }
        if (this.getRevRecStartDate() != null) {
            _hashCode += this.getRevRecStartDate().hashCode();
        }
        if (this.getRevRecTermInMonths() != null) {
            _hashCode += this.getRevRecTermInMonths().hashCode();
        }
        if (this.getRevRecEndDate() != null) {
            _hashCode += this.getRevRecEndDate().hashCode();
        }
        if (this.getDeferRevRec() != null) {
            _hashCode += this.getDeferRevRec().hashCode();
        }
        if (this.getIsClosed() != null) {
            _hashCode += this.getIsClosed().hashCode();
        }
        if (this.getItemFulfillmentChoice() != null) {
            _hashCode += this.getItemFulfillmentChoice().hashCode();
        }
        if (this.getCatchUpPeriod() != null) {
            _hashCode += this.getCatchUpPeriod().hashCode();
        }
        if (this.getBillingSchedule() != null) {
            _hashCode += this.getBillingSchedule().hashCode();
        }
        if (this.getFromJob() != null) {
            _hashCode += this.getFromJob().hashCode();
        }
        if (this.getGrossAmt() != null) {
            _hashCode += this.getGrossAmt().hashCode();
        }
        if (this.getTaxAmount() != null) {
            _hashCode += this.getTaxAmount().hashCode();
        }
        if (this.getExcludeFromRateRequest() != null) {
            _hashCode += this.getExcludeFromRateRequest().hashCode();
        }
        if (this.getIsEstimate() != null) {
            _hashCode += this.getIsEstimate().hashCode();
        }
        if (this.getInventoryLocation() != null) {
            _hashCode += this.getInventoryLocation().hashCode();
        }
        if (this.getInventorySubsidiary() != null) {
            _hashCode += this.getInventorySubsidiary().hashCode();
        }
        if (this.getLine() != null) {
            _hashCode += this.getLine().hashCode();
        }
        if (this.getPercentComplete() != null) {
            _hashCode += this.getPercentComplete().hashCode();
        }
        if (this.getCostEstimateType() != null) {
            _hashCode += this.getCostEstimateType().hashCode();
        }
        if (this.getCostEstimate() != null) {
            _hashCode += this.getCostEstimate().hashCode();
        }
        if (this.getQuantityBackOrdered() != null) {
            _hashCode += this.getQuantityBackOrdered().hashCode();
        }
        if (this.getQuantityBilled() != null) {
            _hashCode += this.getQuantityBilled().hashCode();
        }
        if (this.getQuantityCommitted() != null) {
            _hashCode += this.getQuantityCommitted().hashCode();
        }
        if (this.getQuantityFulfilled() != null) {
            _hashCode += this.getQuantityFulfilled().hashCode();
        }
        if (this.getQuantityPacked() != null) {
            _hashCode += this.getQuantityPacked().hashCode();
        }
        if (this.getQuantityPicked() != null) {
            _hashCode += this.getQuantityPicked().hashCode();
        }
        if (this.getTax1Amt() != null) {
            _hashCode += this.getTax1Amt().hashCode();
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
        if (this.getExpectedShipDate() != null) {
            _hashCode += this.getExpectedShipDate().hashCode();
        }
        if (this.getNoAutoAssignLocation() != null) {
            _hashCode += this.getNoAutoAssignLocation().hashCode();
        }
        if (this.getLocationAutoAssigned() != null) {
            _hashCode += this.getLocationAutoAssigned().hashCode();
        }
        if (this.getTaxDetailsReference() != null) {
            _hashCode += this.getTaxDetailsReference().hashCode();
        }
        if (this.getChargeType() != null) {
            _hashCode += this.getChargeType().hashCode();
        }
        if (this.getOrderAllocationStrategy() != null) {
            _hashCode += this.getOrderAllocationStrategy().hashCode();
        }
        if (this.getRequestedDate() != null) {
            _hashCode += this.getRequestedDate().hashCode();
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
        typeDesc.setXmlType(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "SalesOrderItem"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("job");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "job"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subscription");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "subscription"));
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
        elemField.setFieldName("quantityAvailable");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "quantityAvailable"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("expandItemGroup");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "expandItemGroup"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lineUniqueKey");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "lineUniqueKey"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("serialNumbers");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "serialNumbers"));
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
        elemField.setFieldName("isTaxable");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "isTaxable"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("commitInventory");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "commitInventory"));
        elemField.setXmlType(new QName("urn:types.sales_2022_1.transactions.webservices.netsuite.com", "SalesOrderItemCommitInventory"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("orderPriority");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "orderPriority"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("options");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "options"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "CustomFieldList"));
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
        elemField.setFieldName("createPo");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "createPo"));
        elemField.setXmlType(new QName("urn:types.sales_2022_1.transactions.webservices.netsuite.com", "SalesOrderItemCreatePo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("createdPo");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "createdPo"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("altSalesAmt");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "altSalesAmt"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("createWo");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "createWo"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("poVendor");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "poVendor"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("poCurrency");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "poCurrency"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("poRate");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "poRate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("revRecTermInMonths");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "revRecTermInMonths"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("deferRevRec");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "deferRevRec"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isClosed");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "isClosed"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemFulfillmentChoice");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "itemFulfillmentChoice"));
        elemField.setXmlType(new QName("urn:types.sales_2022_1.transactions.webservices.netsuite.com", "SalesOrderItemFulfillmentChoice"));
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
        elemField.setFieldName("billingSchedule");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "billingSchedule"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fromJob");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "fromJob"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("taxAmount");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "taxAmount"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("isEstimate");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "isEstimate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("inventoryLocation");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "inventoryLocation"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("inventorySubsidiary");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "inventorySubsidiary"));
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
        elemField.setFieldName("percentComplete");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "percentComplete"));
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
        elemField.setFieldName("costEstimate");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "costEstimate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityBackOrdered");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "quantityBackOrdered"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityBilled");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "quantityBilled"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityCommitted");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "quantityCommitted"));
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
        elemField.setFieldName("quantityPacked");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "quantityPacked"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityPicked");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "quantityPicked"));
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
        elemField.setFieldName("expectedShipDate");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "expectedShipDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("noAutoAssignLocation");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "noAutoAssignLocation"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationAutoAssigned");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "locationAutoAssigned"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("chargeType");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "chargeType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("orderAllocationStrategy");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "orderAllocationStrategy"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("requestedDate");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "requestedDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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

