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
package com.netsuite.suitetalk.proxy.v2022_1.transactions.inventory;

import com.netsuite.suitetalk.proxy.v2022_1.platform.common.InventoryDetail;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.CustomFieldList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.inventory.types.TransferOrderItemCommitInventory;
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

public class TransferOrderItem
implements Serializable {
    private RecordRef item;
    private Long line;
    private Double quantityAvailable;
    private Double quantityOnHand;
    private Double quantityBackOrdered;
    private Double quantityCommitted;
    private Double quantityFulfilled;
    private Double quantityPacked;
    private Double quantityPicked;
    private Double quantityReceived;
    private Double quantity;
    private Double rate;
    private RecordRef units;
    private Double amount;
    private String description;
    private InventoryDetail inventoryDetail;
    private String serialNumbers;
    private TransferOrderItemCommitInventory commitInventory;
    private Double orderPriority;
    private CustomFieldList options;
    private Boolean isClosed;
    private RecordRef department;
    private RecordRef _class;
    private Double lastPurchasePrice;
    private Double averageCost;
    private Calendar expectedShipDate;
    private Calendar expectedReceiptDate;
    private Calendar requestedDate;
    private RecordRef orderAllocationStrategy;
    private CustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(TransferOrderItem.class, true);

    public TransferOrderItem() {
    }

    public TransferOrderItem(RecordRef item, Long line, Double quantityAvailable, Double quantityOnHand, Double quantityBackOrdered, Double quantityCommitted, Double quantityFulfilled, Double quantityPacked, Double quantityPicked, Double quantityReceived, Double quantity, Double rate, RecordRef units, Double amount, String description, InventoryDetail inventoryDetail, String serialNumbers, TransferOrderItemCommitInventory commitInventory, Double orderPriority, CustomFieldList options, Boolean isClosed, RecordRef department, RecordRef _class, Double lastPurchasePrice, Double averageCost, Calendar expectedShipDate, Calendar expectedReceiptDate, Calendar requestedDate, RecordRef orderAllocationStrategy, CustomFieldList customFieldList) {
        this.item = item;
        this.line = line;
        this.quantityAvailable = quantityAvailable;
        this.quantityOnHand = quantityOnHand;
        this.quantityBackOrdered = quantityBackOrdered;
        this.quantityCommitted = quantityCommitted;
        this.quantityFulfilled = quantityFulfilled;
        this.quantityPacked = quantityPacked;
        this.quantityPicked = quantityPicked;
        this.quantityReceived = quantityReceived;
        this.quantity = quantity;
        this.rate = rate;
        this.units = units;
        this.amount = amount;
        this.description = description;
        this.inventoryDetail = inventoryDetail;
        this.serialNumbers = serialNumbers;
        this.commitInventory = commitInventory;
        this.orderPriority = orderPriority;
        this.options = options;
        this.isClosed = isClosed;
        this.department = department;
        this._class = _class;
        this.lastPurchasePrice = lastPurchasePrice;
        this.averageCost = averageCost;
        this.expectedShipDate = expectedShipDate;
        this.expectedReceiptDate = expectedReceiptDate;
        this.requestedDate = requestedDate;
        this.orderAllocationStrategy = orderAllocationStrategy;
        this.customFieldList = customFieldList;
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

    public Double getQuantityBackOrdered() {
        return this.quantityBackOrdered;
    }

    public void setQuantityBackOrdered(Double quantityBackOrdered) {
        this.quantityBackOrdered = quantityBackOrdered;
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

    public Double getQuantityReceived() {
        return this.quantityReceived;
    }

    public void setQuantityReceived(Double quantityReceived) {
        this.quantityReceived = quantityReceived;
    }

    public Double getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Double getRate() {
        return this.rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public RecordRef getUnits() {
        return this.units;
    }

    public void setUnits(RecordRef units) {
        this.units = units;
    }

    public Double getAmount() {
        return this.amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public TransferOrderItemCommitInventory getCommitInventory() {
        return this.commitInventory;
    }

    public void setCommitInventory(TransferOrderItemCommitInventory commitInventory) {
        this.commitInventory = commitInventory;
    }

    public Double getOrderPriority() {
        return this.orderPriority;
    }

    public void setOrderPriority(Double orderPriority) {
        this.orderPriority = orderPriority;
    }

    public CustomFieldList getOptions() {
        return this.options;
    }

    public void setOptions(CustomFieldList options) {
        this.options = options;
    }

    public Boolean getIsClosed() {
        return this.isClosed;
    }

    public void setIsClosed(Boolean isClosed) {
        this.isClosed = isClosed;
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

    public Double getLastPurchasePrice() {
        return this.lastPurchasePrice;
    }

    public void setLastPurchasePrice(Double lastPurchasePrice) {
        this.lastPurchasePrice = lastPurchasePrice;
    }

    public Double getAverageCost() {
        return this.averageCost;
    }

    public void setAverageCost(Double averageCost) {
        this.averageCost = averageCost;
    }

    public Calendar getExpectedShipDate() {
        return this.expectedShipDate;
    }

    public void setExpectedShipDate(Calendar expectedShipDate) {
        this.expectedShipDate = expectedShipDate;
    }

    public Calendar getExpectedReceiptDate() {
        return this.expectedReceiptDate;
    }

    public void setExpectedReceiptDate(Calendar expectedReceiptDate) {
        this.expectedReceiptDate = expectedReceiptDate;
    }

    public Calendar getRequestedDate() {
        return this.requestedDate;
    }

    public void setRequestedDate(Calendar requestedDate) {
        this.requestedDate = requestedDate;
    }

    public RecordRef getOrderAllocationStrategy() {
        return this.orderAllocationStrategy;
    }

    public void setOrderAllocationStrategy(RecordRef orderAllocationStrategy) {
        this.orderAllocationStrategy = orderAllocationStrategy;
    }

    public CustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TransferOrderItem)) {
            return false;
        }
        TransferOrderItem other = (TransferOrderItem)obj;
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
        boolean _equals = (this.item == null && other.getItem() == null || this.item != null && this.item.equals(other.getItem())) && (this.line == null && other.getLine() == null || this.line != null && this.line.equals(other.getLine())) && (this.quantityAvailable == null && other.getQuantityAvailable() == null || this.quantityAvailable != null && this.quantityAvailable.equals(other.getQuantityAvailable())) && (this.quantityOnHand == null && other.getQuantityOnHand() == null || this.quantityOnHand != null && this.quantityOnHand.equals(other.getQuantityOnHand())) && (this.quantityBackOrdered == null && other.getQuantityBackOrdered() == null || this.quantityBackOrdered != null && this.quantityBackOrdered.equals(other.getQuantityBackOrdered())) && (this.quantityCommitted == null && other.getQuantityCommitted() == null || this.quantityCommitted != null && this.quantityCommitted.equals(other.getQuantityCommitted())) && (this.quantityFulfilled == null && other.getQuantityFulfilled() == null || this.quantityFulfilled != null && this.quantityFulfilled.equals(other.getQuantityFulfilled())) && (this.quantityPacked == null && other.getQuantityPacked() == null || this.quantityPacked != null && this.quantityPacked.equals(other.getQuantityPacked())) && (this.quantityPicked == null && other.getQuantityPicked() == null || this.quantityPicked != null && this.quantityPicked.equals(other.getQuantityPicked())) && (this.quantityReceived == null && other.getQuantityReceived() == null || this.quantityReceived != null && this.quantityReceived.equals(other.getQuantityReceived())) && (this.quantity == null && other.getQuantity() == null || this.quantity != null && this.quantity.equals(other.getQuantity())) && (this.rate == null && other.getRate() == null || this.rate != null && this.rate.equals(other.getRate())) && (this.units == null && other.getUnits() == null || this.units != null && this.units.equals(other.getUnits())) && (this.amount == null && other.getAmount() == null || this.amount != null && this.amount.equals(other.getAmount())) && (this.description == null && other.getDescription() == null || this.description != null && this.description.equals(other.getDescription())) && (this.inventoryDetail == null && other.getInventoryDetail() == null || this.inventoryDetail != null && this.inventoryDetail.equals(other.getInventoryDetail())) && (this.serialNumbers == null && other.getSerialNumbers() == null || this.serialNumbers != null && this.serialNumbers.equals(other.getSerialNumbers())) && (this.commitInventory == null && other.getCommitInventory() == null || this.commitInventory != null && this.commitInventory.equals(other.getCommitInventory())) && (this.orderPriority == null && other.getOrderPriority() == null || this.orderPriority != null && this.orderPriority.equals(other.getOrderPriority())) && (this.options == null && other.getOptions() == null || this.options != null && this.options.equals(other.getOptions())) && (this.isClosed == null && other.getIsClosed() == null || this.isClosed != null && this.isClosed.equals(other.getIsClosed())) && (this.department == null && other.getDepartment() == null || this.department != null && this.department.equals(other.getDepartment())) && (this._class == null && other.get_class() == null || this._class != null && this._class.equals(other.get_class())) && (this.lastPurchasePrice == null && other.getLastPurchasePrice() == null || this.lastPurchasePrice != null && this.lastPurchasePrice.equals(other.getLastPurchasePrice())) && (this.averageCost == null && other.getAverageCost() == null || this.averageCost != null && this.averageCost.equals(other.getAverageCost())) && (this.expectedShipDate == null && other.getExpectedShipDate() == null || this.expectedShipDate != null && this.expectedShipDate.equals(other.getExpectedShipDate())) && (this.expectedReceiptDate == null && other.getExpectedReceiptDate() == null || this.expectedReceiptDate != null && this.expectedReceiptDate.equals(other.getExpectedReceiptDate())) && (this.requestedDate == null && other.getRequestedDate() == null || this.requestedDate != null && this.requestedDate.equals(other.getRequestedDate())) && (this.orderAllocationStrategy == null && other.getOrderAllocationStrategy() == null || this.orderAllocationStrategy != null && this.orderAllocationStrategy.equals(other.getOrderAllocationStrategy())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
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
        if (this.getQuantityBackOrdered() != null) {
            _hashCode += this.getQuantityBackOrdered().hashCode();
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
        if (this.getQuantityReceived() != null) {
            _hashCode += this.getQuantityReceived().hashCode();
        }
        if (this.getQuantity() != null) {
            _hashCode += this.getQuantity().hashCode();
        }
        if (this.getRate() != null) {
            _hashCode += this.getRate().hashCode();
        }
        if (this.getUnits() != null) {
            _hashCode += this.getUnits().hashCode();
        }
        if (this.getAmount() != null) {
            _hashCode += this.getAmount().hashCode();
        }
        if (this.getDescription() != null) {
            _hashCode += this.getDescription().hashCode();
        }
        if (this.getInventoryDetail() != null) {
            _hashCode += this.getInventoryDetail().hashCode();
        }
        if (this.getSerialNumbers() != null) {
            _hashCode += this.getSerialNumbers().hashCode();
        }
        if (this.getCommitInventory() != null) {
            _hashCode += this.getCommitInventory().hashCode();
        }
        if (this.getOrderPriority() != null) {
            _hashCode += this.getOrderPriority().hashCode();
        }
        if (this.getOptions() != null) {
            _hashCode += this.getOptions().hashCode();
        }
        if (this.getIsClosed() != null) {
            _hashCode += this.getIsClosed().hashCode();
        }
        if (this.getDepartment() != null) {
            _hashCode += this.getDepartment().hashCode();
        }
        if (this.get_class() != null) {
            _hashCode += this.get_class().hashCode();
        }
        if (this.getLastPurchasePrice() != null) {
            _hashCode += this.getLastPurchasePrice().hashCode();
        }
        if (this.getAverageCost() != null) {
            _hashCode += this.getAverageCost().hashCode();
        }
        if (this.getExpectedShipDate() != null) {
            _hashCode += this.getExpectedShipDate().hashCode();
        }
        if (this.getExpectedReceiptDate() != null) {
            _hashCode += this.getExpectedReceiptDate().hashCode();
        }
        if (this.getRequestedDate() != null) {
            _hashCode += this.getRequestedDate().hashCode();
        }
        if (this.getOrderAllocationStrategy() != null) {
            _hashCode += this.getOrderAllocationStrategy().hashCode();
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
        typeDesc.setXmlType(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "TransferOrderItem"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "item"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("line");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "line"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityAvailable");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "quantityAvailable"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityOnHand");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "quantityOnHand"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityBackOrdered");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "quantityBackOrdered"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityCommitted");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "quantityCommitted"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityFulfilled");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "quantityFulfilled"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityPacked");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "quantityPacked"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityPicked");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "quantityPicked"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityReceived");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "quantityReceived"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "quantity"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("rate");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "rate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("units");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "units"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "amount"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "description"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("inventoryDetail");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "inventoryDetail"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "InventoryDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("serialNumbers");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "serialNumbers"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("commitInventory");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "commitInventory"));
        elemField.setXmlType(new QName("urn:types.inventory_2022_1.transactions.webservices.netsuite.com", "TransferOrderItemCommitInventory"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("orderPriority");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "orderPriority"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("options");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "options"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "CustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isClosed");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "isClosed"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "department"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "class"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastPurchasePrice");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "lastPurchasePrice"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("averageCost");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "averageCost"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("expectedShipDate");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "expectedShipDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("expectedReceiptDate");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "expectedReceiptDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("requestedDate");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "requestedDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("orderAllocationStrategy");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "orderAllocationStrategy"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "CustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

