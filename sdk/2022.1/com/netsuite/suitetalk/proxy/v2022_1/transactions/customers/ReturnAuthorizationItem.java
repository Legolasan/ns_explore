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
package com.netsuite.suitetalk.proxy.v2022_1.transactions.customers;

import com.netsuite.suitetalk.proxy.v2022_1.platform.common.InventoryDetail;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.types.ItemCostEstimateType;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.types.VsoeDeferral;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.types.VsoePermitDiscount;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.types.VsoeSopGroup;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.CustomFieldList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
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

public class ReturnAuthorizationItem
implements Serializable {
    private RecordRef job;
    private RecordRef item;
    private Long orderLine;
    private Long line;
    private Double quantity;
    private Double quantityReceived;
    private Double quantityBilled;
    private RecordRef units;
    private InventoryDetail inventoryDetail;
    private String description;
    private String serialNumbers;
    private RecordRef price;
    private String rate;
    private Double amount;
    private CustomFieldList options;
    private Long revRecTermInMonths;
    private Boolean deferRevRec;
    private Boolean isClosed;
    private Boolean isDropShipment;
    private RecordRef inventoryLocation;
    private RecordRef inventorySubsidiary;
    private RecordRef catchUpPeriod;
    private RecordRef department;
    private ItemCostEstimateType costEstimateType;
    private Double costEstimate;
    private String taxDetailsReference;
    private RecordRef _class;
    private RecordRef location;
    private RecordRef revRecSchedule;
    private Calendar revRecStartDate;
    private Calendar revRecEndDate;
    private RecordRef taxCode;
    private Double taxRate1;
    private Double taxRate2;
    private Double tax1Amt;
    private Double grossAmt;
    private Boolean isTaxable;
    private String giftCertFrom;
    private String giftCertRecipientName;
    private String giftCertRecipientEmail;
    private String giftCertMessage;
    private String giftCertNumber;
    private VsoeSopGroup vsoeSopGroup;
    private Boolean vsoeIsEstimate;
    private Double vsoePrice;
    private Double vsoeAmount;
    private Double altSalesAmt;
    private Double taxAmount;
    private Double vsoeAllocation;
    private VsoeDeferral vsoeDeferral;
    private VsoePermitDiscount vsoePermitDiscount;
    private Boolean vsoeDelivered;
    private CustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(ReturnAuthorizationItem.class, true);

    public ReturnAuthorizationItem() {
    }

    public ReturnAuthorizationItem(RecordRef job, RecordRef item, Long orderLine, Long line, Double quantity, Double quantityReceived, Double quantityBilled, RecordRef units, InventoryDetail inventoryDetail, String description, String serialNumbers, RecordRef price, String rate, Double amount, CustomFieldList options, Long revRecTermInMonths, Boolean deferRevRec, Boolean isClosed, Boolean isDropShipment, RecordRef inventoryLocation, RecordRef inventorySubsidiary, RecordRef catchUpPeriod, RecordRef department, ItemCostEstimateType costEstimateType, Double costEstimate, String taxDetailsReference, RecordRef _class, RecordRef location, RecordRef revRecSchedule, Calendar revRecStartDate, Calendar revRecEndDate, RecordRef taxCode, Double taxRate1, Double taxRate2, Double tax1Amt, Double grossAmt, Boolean isTaxable, String giftCertFrom, String giftCertRecipientName, String giftCertRecipientEmail, String giftCertMessage, String giftCertNumber, VsoeSopGroup vsoeSopGroup, Boolean vsoeIsEstimate, Double vsoePrice, Double vsoeAmount, Double altSalesAmt, Double taxAmount, Double vsoeAllocation, VsoeDeferral vsoeDeferral, VsoePermitDiscount vsoePermitDiscount, Boolean vsoeDelivered, CustomFieldList customFieldList) {
        this.job = job;
        this.item = item;
        this.orderLine = orderLine;
        this.line = line;
        this.quantity = quantity;
        this.quantityReceived = quantityReceived;
        this.quantityBilled = quantityBilled;
        this.units = units;
        this.inventoryDetail = inventoryDetail;
        this.description = description;
        this.serialNumbers = serialNumbers;
        this.price = price;
        this.rate = rate;
        this.amount = amount;
        this.options = options;
        this.revRecTermInMonths = revRecTermInMonths;
        this.deferRevRec = deferRevRec;
        this.isClosed = isClosed;
        this.isDropShipment = isDropShipment;
        this.inventoryLocation = inventoryLocation;
        this.inventorySubsidiary = inventorySubsidiary;
        this.catchUpPeriod = catchUpPeriod;
        this.department = department;
        this.costEstimateType = costEstimateType;
        this.costEstimate = costEstimate;
        this.taxDetailsReference = taxDetailsReference;
        this._class = _class;
        this.location = location;
        this.revRecSchedule = revRecSchedule;
        this.revRecStartDate = revRecStartDate;
        this.revRecEndDate = revRecEndDate;
        this.taxCode = taxCode;
        this.taxRate1 = taxRate1;
        this.taxRate2 = taxRate2;
        this.tax1Amt = tax1Amt;
        this.grossAmt = grossAmt;
        this.isTaxable = isTaxable;
        this.giftCertFrom = giftCertFrom;
        this.giftCertRecipientName = giftCertRecipientName;
        this.giftCertRecipientEmail = giftCertRecipientEmail;
        this.giftCertMessage = giftCertMessage;
        this.giftCertNumber = giftCertNumber;
        this.vsoeSopGroup = vsoeSopGroup;
        this.vsoeIsEstimate = vsoeIsEstimate;
        this.vsoePrice = vsoePrice;
        this.vsoeAmount = vsoeAmount;
        this.altSalesAmt = altSalesAmt;
        this.taxAmount = taxAmount;
        this.vsoeAllocation = vsoeAllocation;
        this.vsoeDeferral = vsoeDeferral;
        this.vsoePermitDiscount = vsoePermitDiscount;
        this.vsoeDelivered = vsoeDelivered;
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

    public Long getOrderLine() {
        return this.orderLine;
    }

    public void setOrderLine(Long orderLine) {
        this.orderLine = orderLine;
    }

    public Long getLine() {
        return this.line;
    }

    public void setLine(Long line) {
        this.line = line;
    }

    public Double getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Double getQuantityReceived() {
        return this.quantityReceived;
    }

    public void setQuantityReceived(Double quantityReceived) {
        this.quantityReceived = quantityReceived;
    }

    public Double getQuantityBilled() {
        return this.quantityBilled;
    }

    public void setQuantityBilled(Double quantityBilled) {
        this.quantityBilled = quantityBilled;
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

    public String getSerialNumbers() {
        return this.serialNumbers;
    }

    public void setSerialNumbers(String serialNumbers) {
        this.serialNumbers = serialNumbers;
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

    public CustomFieldList getOptions() {
        return this.options;
    }

    public void setOptions(CustomFieldList options) {
        this.options = options;
    }

    public Long getRevRecTermInMonths() {
        return this.revRecTermInMonths;
    }

    public void setRevRecTermInMonths(Long revRecTermInMonths) {
        this.revRecTermInMonths = revRecTermInMonths;
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

    public Boolean getIsDropShipment() {
        return this.isDropShipment;
    }

    public void setIsDropShipment(Boolean isDropShipment) {
        this.isDropShipment = isDropShipment;
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

    public RecordRef getCatchUpPeriod() {
        return this.catchUpPeriod;
    }

    public void setCatchUpPeriod(RecordRef catchUpPeriod) {
        this.catchUpPeriod = catchUpPeriod;
    }

    public RecordRef getDepartment() {
        return this.department;
    }

    public void setDepartment(RecordRef department) {
        this.department = department;
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

    public String getTaxDetailsReference() {
        return this.taxDetailsReference;
    }

    public void setTaxDetailsReference(String taxDetailsReference) {
        this.taxDetailsReference = taxDetailsReference;
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

    public Double getTax1Amt() {
        return this.tax1Amt;
    }

    public void setTax1Amt(Double tax1Amt) {
        this.tax1Amt = tax1Amt;
    }

    public Double getGrossAmt() {
        return this.grossAmt;
    }

    public void setGrossAmt(Double grossAmt) {
        this.grossAmt = grossAmt;
    }

    public Boolean getIsTaxable() {
        return this.isTaxable;
    }

    public void setIsTaxable(Boolean isTaxable) {
        this.isTaxable = isTaxable;
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

    public Double getAltSalesAmt() {
        return this.altSalesAmt;
    }

    public void setAltSalesAmt(Double altSalesAmt) {
        this.altSalesAmt = altSalesAmt;
    }

    public Double getTaxAmount() {
        return this.taxAmount;
    }

    public void setTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
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

    public CustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReturnAuthorizationItem)) {
            return false;
        }
        ReturnAuthorizationItem other = (ReturnAuthorizationItem)obj;
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
        boolean _equals = (this.job == null && other.getJob() == null || this.job != null && this.job.equals(other.getJob())) && (this.item == null && other.getItem() == null || this.item != null && this.item.equals(other.getItem())) && (this.orderLine == null && other.getOrderLine() == null || this.orderLine != null && this.orderLine.equals(other.getOrderLine())) && (this.line == null && other.getLine() == null || this.line != null && this.line.equals(other.getLine())) && (this.quantity == null && other.getQuantity() == null || this.quantity != null && this.quantity.equals(other.getQuantity())) && (this.quantityReceived == null && other.getQuantityReceived() == null || this.quantityReceived != null && this.quantityReceived.equals(other.getQuantityReceived())) && (this.quantityBilled == null && other.getQuantityBilled() == null || this.quantityBilled != null && this.quantityBilled.equals(other.getQuantityBilled())) && (this.units == null && other.getUnits() == null || this.units != null && this.units.equals(other.getUnits())) && (this.inventoryDetail == null && other.getInventoryDetail() == null || this.inventoryDetail != null && this.inventoryDetail.equals(other.getInventoryDetail())) && (this.description == null && other.getDescription() == null || this.description != null && this.description.equals(other.getDescription())) && (this.serialNumbers == null && other.getSerialNumbers() == null || this.serialNumbers != null && this.serialNumbers.equals(other.getSerialNumbers())) && (this.price == null && other.getPrice() == null || this.price != null && this.price.equals(other.getPrice())) && (this.rate == null && other.getRate() == null || this.rate != null && this.rate.equals(other.getRate())) && (this.amount == null && other.getAmount() == null || this.amount != null && this.amount.equals(other.getAmount())) && (this.options == null && other.getOptions() == null || this.options != null && this.options.equals(other.getOptions())) && (this.revRecTermInMonths == null && other.getRevRecTermInMonths() == null || this.revRecTermInMonths != null && this.revRecTermInMonths.equals(other.getRevRecTermInMonths())) && (this.deferRevRec == null && other.getDeferRevRec() == null || this.deferRevRec != null && this.deferRevRec.equals(other.getDeferRevRec())) && (this.isClosed == null && other.getIsClosed() == null || this.isClosed != null && this.isClosed.equals(other.getIsClosed())) && (this.isDropShipment == null && other.getIsDropShipment() == null || this.isDropShipment != null && this.isDropShipment.equals(other.getIsDropShipment())) && (this.inventoryLocation == null && other.getInventoryLocation() == null || this.inventoryLocation != null && this.inventoryLocation.equals(other.getInventoryLocation())) && (this.inventorySubsidiary == null && other.getInventorySubsidiary() == null || this.inventorySubsidiary != null && this.inventorySubsidiary.equals(other.getInventorySubsidiary())) && (this.catchUpPeriod == null && other.getCatchUpPeriod() == null || this.catchUpPeriod != null && this.catchUpPeriod.equals(other.getCatchUpPeriod())) && (this.department == null && other.getDepartment() == null || this.department != null && this.department.equals(other.getDepartment())) && (this.costEstimateType == null && other.getCostEstimateType() == null || this.costEstimateType != null && this.costEstimateType.equals(other.getCostEstimateType())) && (this.costEstimate == null && other.getCostEstimate() == null || this.costEstimate != null && this.costEstimate.equals(other.getCostEstimate())) && (this.taxDetailsReference == null && other.getTaxDetailsReference() == null || this.taxDetailsReference != null && this.taxDetailsReference.equals(other.getTaxDetailsReference())) && (this._class == null && other.get_class() == null || this._class != null && this._class.equals(other.get_class())) && (this.location == null && other.getLocation() == null || this.location != null && this.location.equals(other.getLocation())) && (this.revRecSchedule == null && other.getRevRecSchedule() == null || this.revRecSchedule != null && this.revRecSchedule.equals(other.getRevRecSchedule())) && (this.revRecStartDate == null && other.getRevRecStartDate() == null || this.revRecStartDate != null && this.revRecStartDate.equals(other.getRevRecStartDate())) && (this.revRecEndDate == null && other.getRevRecEndDate() == null || this.revRecEndDate != null && this.revRecEndDate.equals(other.getRevRecEndDate())) && (this.taxCode == null && other.getTaxCode() == null || this.taxCode != null && this.taxCode.equals(other.getTaxCode())) && (this.taxRate1 == null && other.getTaxRate1() == null || this.taxRate1 != null && this.taxRate1.equals(other.getTaxRate1())) && (this.taxRate2 == null && other.getTaxRate2() == null || this.taxRate2 != null && this.taxRate2.equals(other.getTaxRate2())) && (this.tax1Amt == null && other.getTax1Amt() == null || this.tax1Amt != null && this.tax1Amt.equals(other.getTax1Amt())) && (this.grossAmt == null && other.getGrossAmt() == null || this.grossAmt != null && this.grossAmt.equals(other.getGrossAmt())) && (this.isTaxable == null && other.getIsTaxable() == null || this.isTaxable != null && this.isTaxable.equals(other.getIsTaxable())) && (this.giftCertFrom == null && other.getGiftCertFrom() == null || this.giftCertFrom != null && this.giftCertFrom.equals(other.getGiftCertFrom())) && (this.giftCertRecipientName == null && other.getGiftCertRecipientName() == null || this.giftCertRecipientName != null && this.giftCertRecipientName.equals(other.getGiftCertRecipientName())) && (this.giftCertRecipientEmail == null && other.getGiftCertRecipientEmail() == null || this.giftCertRecipientEmail != null && this.giftCertRecipientEmail.equals(other.getGiftCertRecipientEmail())) && (this.giftCertMessage == null && other.getGiftCertMessage() == null || this.giftCertMessage != null && this.giftCertMessage.equals(other.getGiftCertMessage())) && (this.giftCertNumber == null && other.getGiftCertNumber() == null || this.giftCertNumber != null && this.giftCertNumber.equals(other.getGiftCertNumber())) && (this.vsoeSopGroup == null && other.getVsoeSopGroup() == null || this.vsoeSopGroup != null && this.vsoeSopGroup.equals(other.getVsoeSopGroup())) && (this.vsoeIsEstimate == null && other.getVsoeIsEstimate() == null || this.vsoeIsEstimate != null && this.vsoeIsEstimate.equals(other.getVsoeIsEstimate())) && (this.vsoePrice == null && other.getVsoePrice() == null || this.vsoePrice != null && this.vsoePrice.equals(other.getVsoePrice())) && (this.vsoeAmount == null && other.getVsoeAmount() == null || this.vsoeAmount != null && this.vsoeAmount.equals(other.getVsoeAmount())) && (this.altSalesAmt == null && other.getAltSalesAmt() == null || this.altSalesAmt != null && this.altSalesAmt.equals(other.getAltSalesAmt())) && (this.taxAmount == null && other.getTaxAmount() == null || this.taxAmount != null && this.taxAmount.equals(other.getTaxAmount())) && (this.vsoeAllocation == null && other.getVsoeAllocation() == null || this.vsoeAllocation != null && this.vsoeAllocation.equals(other.getVsoeAllocation())) && (this.vsoeDeferral == null && other.getVsoeDeferral() == null || this.vsoeDeferral != null && this.vsoeDeferral.equals(other.getVsoeDeferral())) && (this.vsoePermitDiscount == null && other.getVsoePermitDiscount() == null || this.vsoePermitDiscount != null && this.vsoePermitDiscount.equals(other.getVsoePermitDiscount())) && (this.vsoeDelivered == null && other.getVsoeDelivered() == null || this.vsoeDelivered != null && this.vsoeDelivered.equals(other.getVsoeDelivered())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
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
        if (this.getOrderLine() != null) {
            _hashCode += this.getOrderLine().hashCode();
        }
        if (this.getLine() != null) {
            _hashCode += this.getLine().hashCode();
        }
        if (this.getQuantity() != null) {
            _hashCode += this.getQuantity().hashCode();
        }
        if (this.getQuantityReceived() != null) {
            _hashCode += this.getQuantityReceived().hashCode();
        }
        if (this.getQuantityBilled() != null) {
            _hashCode += this.getQuantityBilled().hashCode();
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
        if (this.getSerialNumbers() != null) {
            _hashCode += this.getSerialNumbers().hashCode();
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
        if (this.getOptions() != null) {
            _hashCode += this.getOptions().hashCode();
        }
        if (this.getRevRecTermInMonths() != null) {
            _hashCode += this.getRevRecTermInMonths().hashCode();
        }
        if (this.getDeferRevRec() != null) {
            _hashCode += this.getDeferRevRec().hashCode();
        }
        if (this.getIsClosed() != null) {
            _hashCode += this.getIsClosed().hashCode();
        }
        if (this.getIsDropShipment() != null) {
            _hashCode += this.getIsDropShipment().hashCode();
        }
        if (this.getInventoryLocation() != null) {
            _hashCode += this.getInventoryLocation().hashCode();
        }
        if (this.getInventorySubsidiary() != null) {
            _hashCode += this.getInventorySubsidiary().hashCode();
        }
        if (this.getCatchUpPeriod() != null) {
            _hashCode += this.getCatchUpPeriod().hashCode();
        }
        if (this.getDepartment() != null) {
            _hashCode += this.getDepartment().hashCode();
        }
        if (this.getCostEstimateType() != null) {
            _hashCode += this.getCostEstimateType().hashCode();
        }
        if (this.getCostEstimate() != null) {
            _hashCode += this.getCostEstimate().hashCode();
        }
        if (this.getTaxDetailsReference() != null) {
            _hashCode += this.getTaxDetailsReference().hashCode();
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
        if (this.getTaxCode() != null) {
            _hashCode += this.getTaxCode().hashCode();
        }
        if (this.getTaxRate1() != null) {
            _hashCode += this.getTaxRate1().hashCode();
        }
        if (this.getTaxRate2() != null) {
            _hashCode += this.getTaxRate2().hashCode();
        }
        if (this.getTax1Amt() != null) {
            _hashCode += this.getTax1Amt().hashCode();
        }
        if (this.getGrossAmt() != null) {
            _hashCode += this.getGrossAmt().hashCode();
        }
        if (this.getIsTaxable() != null) {
            _hashCode += this.getIsTaxable().hashCode();
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
        if (this.getAltSalesAmt() != null) {
            _hashCode += this.getAltSalesAmt().hashCode();
        }
        if (this.getTaxAmount() != null) {
            _hashCode += this.getTaxAmount().hashCode();
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
        typeDesc.setXmlType(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "ReturnAuthorizationItem"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("job");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "job"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "item"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("orderLine");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "orderLine"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("line");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "line"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "quantity"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityReceived");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "quantityReceived"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityBilled");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "quantityBilled"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("units");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "units"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("inventoryDetail");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "inventoryDetail"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "InventoryDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "description"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("serialNumbers");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "serialNumbers"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "price"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("rate");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "rate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "amount"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("options");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "options"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "CustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revRecTermInMonths");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "revRecTermInMonths"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("deferRevRec");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "deferRevRec"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isClosed");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "isClosed"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isDropShipment");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "isDropShipment"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("inventoryLocation");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "inventoryLocation"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("inventorySubsidiary");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "inventorySubsidiary"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("catchUpPeriod");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "catchUpPeriod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "department"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("costEstimateType");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "costEstimateType"));
        elemField.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "ItemCostEstimateType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("costEstimate");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "costEstimate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxDetailsReference");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "taxDetailsReference"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "class"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "location"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revRecSchedule");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "revRecSchedule"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revRecStartDate");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "revRecStartDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revRecEndDate");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "revRecEndDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxCode");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "taxCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxRate1");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "taxRate1"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxRate2");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "taxRate2"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("tax1Amt");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "tax1Amt"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("grossAmt");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "grossAmt"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isTaxable");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "isTaxable"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("giftCertFrom");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "giftCertFrom"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("giftCertRecipientName");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "giftCertRecipientName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("giftCertRecipientEmail");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "giftCertRecipientEmail"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("giftCertMessage");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "giftCertMessage"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("giftCertNumber");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "giftCertNumber"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vsoeSopGroup");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "vsoeSopGroup"));
        elemField.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "VsoeSopGroup"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vsoeIsEstimate");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "vsoeIsEstimate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vsoePrice");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "vsoePrice"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vsoeAmount");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "vsoeAmount"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("altSalesAmt");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "altSalesAmt"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxAmount");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "taxAmount"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vsoeAllocation");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "vsoeAllocation"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vsoeDeferral");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "vsoeDeferral"));
        elemField.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "VsoeDeferral"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vsoePermitDiscount");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "vsoePermitDiscount"));
        elemField.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "VsoePermitDiscount"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vsoeDelivered");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "vsoeDelivered"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "CustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

