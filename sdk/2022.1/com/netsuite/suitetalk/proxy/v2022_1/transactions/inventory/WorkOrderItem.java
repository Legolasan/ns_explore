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
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.types.ItemSource;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.CustomFieldList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.inventory.types.WorkOrderItemItemCommitInventory;
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

public class WorkOrderItem
implements Serializable {
    private Long line;
    private RecordRef item;
    private Long operationSequenceNumber;
    private Double componentYield;
    private Double bomQuantity;
    private Double quantityCommitted;
    private Double quantityBackOrdered;
    private Double quantityAvailable;
    private Double averageCost;
    private Double lastPurchasePrice;
    private Double quantityOnHand;
    private Double quantity;
    private RecordRef units;
    private InventoryDetail inventoryDetail;
    private String serialNumbers;
    private Double orderPriority;
    private CustomFieldList options;
    private ItemSource itemSource;
    private RecordRef department;
    private RecordRef _class;
    private RecordRef location;
    private RecordRef poVendor;
    private Double poRate;
    private Double percentComplete;
    private Double contribution;
    private String description;
    private WorkOrderItemItemCommitInventory commitInventory;
    private Calendar plannedIssueDate;
    private RecordRef orderAllocationStrategy;
    private CustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(WorkOrderItem.class, true);

    public WorkOrderItem() {
    }

    public WorkOrderItem(Long line, RecordRef item, Long operationSequenceNumber, Double componentYield, Double bomQuantity, Double quantityCommitted, Double quantityBackOrdered, Double quantityAvailable, Double averageCost, Double lastPurchasePrice, Double quantityOnHand, Double quantity, RecordRef units, InventoryDetail inventoryDetail, String serialNumbers, Double orderPriority, CustomFieldList options, ItemSource itemSource, RecordRef department, RecordRef _class, RecordRef location, RecordRef poVendor, Double poRate, Double percentComplete, Double contribution, String description, WorkOrderItemItemCommitInventory commitInventory, Calendar plannedIssueDate, RecordRef orderAllocationStrategy, CustomFieldList customFieldList) {
        this.line = line;
        this.item = item;
        this.operationSequenceNumber = operationSequenceNumber;
        this.componentYield = componentYield;
        this.bomQuantity = bomQuantity;
        this.quantityCommitted = quantityCommitted;
        this.quantityBackOrdered = quantityBackOrdered;
        this.quantityAvailable = quantityAvailable;
        this.averageCost = averageCost;
        this.lastPurchasePrice = lastPurchasePrice;
        this.quantityOnHand = quantityOnHand;
        this.quantity = quantity;
        this.units = units;
        this.inventoryDetail = inventoryDetail;
        this.serialNumbers = serialNumbers;
        this.orderPriority = orderPriority;
        this.options = options;
        this.itemSource = itemSource;
        this.department = department;
        this._class = _class;
        this.location = location;
        this.poVendor = poVendor;
        this.poRate = poRate;
        this.percentComplete = percentComplete;
        this.contribution = contribution;
        this.description = description;
        this.commitInventory = commitInventory;
        this.plannedIssueDate = plannedIssueDate;
        this.orderAllocationStrategy = orderAllocationStrategy;
        this.customFieldList = customFieldList;
    }

    public Long getLine() {
        return this.line;
    }

    public void setLine(Long line) {
        this.line = line;
    }

    public RecordRef getItem() {
        return this.item;
    }

    public void setItem(RecordRef item) {
        this.item = item;
    }

    public Long getOperationSequenceNumber() {
        return this.operationSequenceNumber;
    }

    public void setOperationSequenceNumber(Long operationSequenceNumber) {
        this.operationSequenceNumber = operationSequenceNumber;
    }

    public Double getComponentYield() {
        return this.componentYield;
    }

    public void setComponentYield(Double componentYield) {
        this.componentYield = componentYield;
    }

    public Double getBomQuantity() {
        return this.bomQuantity;
    }

    public void setBomQuantity(Double bomQuantity) {
        this.bomQuantity = bomQuantity;
    }

    public Double getQuantityCommitted() {
        return this.quantityCommitted;
    }

    public void setQuantityCommitted(Double quantityCommitted) {
        this.quantityCommitted = quantityCommitted;
    }

    public Double getQuantityBackOrdered() {
        return this.quantityBackOrdered;
    }

    public void setQuantityBackOrdered(Double quantityBackOrdered) {
        this.quantityBackOrdered = quantityBackOrdered;
    }

    public Double getQuantityAvailable() {
        return this.quantityAvailable;
    }

    public void setQuantityAvailable(Double quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

    public Double getAverageCost() {
        return this.averageCost;
    }

    public void setAverageCost(Double averageCost) {
        this.averageCost = averageCost;
    }

    public Double getLastPurchasePrice() {
        return this.lastPurchasePrice;
    }

    public void setLastPurchasePrice(Double lastPurchasePrice) {
        this.lastPurchasePrice = lastPurchasePrice;
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

    public String getSerialNumbers() {
        return this.serialNumbers;
    }

    public void setSerialNumbers(String serialNumbers) {
        this.serialNumbers = serialNumbers;
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

    public ItemSource getItemSource() {
        return this.itemSource;
    }

    public void setItemSource(ItemSource itemSource) {
        this.itemSource = itemSource;
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

    public RecordRef getPoVendor() {
        return this.poVendor;
    }

    public void setPoVendor(RecordRef poVendor) {
        this.poVendor = poVendor;
    }

    public Double getPoRate() {
        return this.poRate;
    }

    public void setPoRate(Double poRate) {
        this.poRate = poRate;
    }

    public Double getPercentComplete() {
        return this.percentComplete;
    }

    public void setPercentComplete(Double percentComplete) {
        this.percentComplete = percentComplete;
    }

    public Double getContribution() {
        return this.contribution;
    }

    public void setContribution(Double contribution) {
        this.contribution = contribution;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public WorkOrderItemItemCommitInventory getCommitInventory() {
        return this.commitInventory;
    }

    public void setCommitInventory(WorkOrderItemItemCommitInventory commitInventory) {
        this.commitInventory = commitInventory;
    }

    public Calendar getPlannedIssueDate() {
        return this.plannedIssueDate;
    }

    public void setPlannedIssueDate(Calendar plannedIssueDate) {
        this.plannedIssueDate = plannedIssueDate;
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
        if (!(obj instanceof WorkOrderItem)) {
            return false;
        }
        WorkOrderItem other = (WorkOrderItem)obj;
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
        boolean _equals = (this.line == null && other.getLine() == null || this.line != null && this.line.equals(other.getLine())) && (this.item == null && other.getItem() == null || this.item != null && this.item.equals(other.getItem())) && (this.operationSequenceNumber == null && other.getOperationSequenceNumber() == null || this.operationSequenceNumber != null && this.operationSequenceNumber.equals(other.getOperationSequenceNumber())) && (this.componentYield == null && other.getComponentYield() == null || this.componentYield != null && this.componentYield.equals(other.getComponentYield())) && (this.bomQuantity == null && other.getBomQuantity() == null || this.bomQuantity != null && this.bomQuantity.equals(other.getBomQuantity())) && (this.quantityCommitted == null && other.getQuantityCommitted() == null || this.quantityCommitted != null && this.quantityCommitted.equals(other.getQuantityCommitted())) && (this.quantityBackOrdered == null && other.getQuantityBackOrdered() == null || this.quantityBackOrdered != null && this.quantityBackOrdered.equals(other.getQuantityBackOrdered())) && (this.quantityAvailable == null && other.getQuantityAvailable() == null || this.quantityAvailable != null && this.quantityAvailable.equals(other.getQuantityAvailable())) && (this.averageCost == null && other.getAverageCost() == null || this.averageCost != null && this.averageCost.equals(other.getAverageCost())) && (this.lastPurchasePrice == null && other.getLastPurchasePrice() == null || this.lastPurchasePrice != null && this.lastPurchasePrice.equals(other.getLastPurchasePrice())) && (this.quantityOnHand == null && other.getQuantityOnHand() == null || this.quantityOnHand != null && this.quantityOnHand.equals(other.getQuantityOnHand())) && (this.quantity == null && other.getQuantity() == null || this.quantity != null && this.quantity.equals(other.getQuantity())) && (this.units == null && other.getUnits() == null || this.units != null && this.units.equals(other.getUnits())) && (this.inventoryDetail == null && other.getInventoryDetail() == null || this.inventoryDetail != null && this.inventoryDetail.equals(other.getInventoryDetail())) && (this.serialNumbers == null && other.getSerialNumbers() == null || this.serialNumbers != null && this.serialNumbers.equals(other.getSerialNumbers())) && (this.orderPriority == null && other.getOrderPriority() == null || this.orderPriority != null && this.orderPriority.equals(other.getOrderPriority())) && (this.options == null && other.getOptions() == null || this.options != null && this.options.equals(other.getOptions())) && (this.itemSource == null && other.getItemSource() == null || this.itemSource != null && this.itemSource.equals(other.getItemSource())) && (this.department == null && other.getDepartment() == null || this.department != null && this.department.equals(other.getDepartment())) && (this._class == null && other.get_class() == null || this._class != null && this._class.equals(other.get_class())) && (this.location == null && other.getLocation() == null || this.location != null && this.location.equals(other.getLocation())) && (this.poVendor == null && other.getPoVendor() == null || this.poVendor != null && this.poVendor.equals(other.getPoVendor())) && (this.poRate == null && other.getPoRate() == null || this.poRate != null && this.poRate.equals(other.getPoRate())) && (this.percentComplete == null && other.getPercentComplete() == null || this.percentComplete != null && this.percentComplete.equals(other.getPercentComplete())) && (this.contribution == null && other.getContribution() == null || this.contribution != null && this.contribution.equals(other.getContribution())) && (this.description == null && other.getDescription() == null || this.description != null && this.description.equals(other.getDescription())) && (this.commitInventory == null && other.getCommitInventory() == null || this.commitInventory != null && this.commitInventory.equals(other.getCommitInventory())) && (this.plannedIssueDate == null && other.getPlannedIssueDate() == null || this.plannedIssueDate != null && this.plannedIssueDate.equals(other.getPlannedIssueDate())) && (this.orderAllocationStrategy == null && other.getOrderAllocationStrategy() == null || this.orderAllocationStrategy != null && this.orderAllocationStrategy.equals(other.getOrderAllocationStrategy())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getLine() != null) {
            _hashCode += this.getLine().hashCode();
        }
        if (this.getItem() != null) {
            _hashCode += this.getItem().hashCode();
        }
        if (this.getOperationSequenceNumber() != null) {
            _hashCode += this.getOperationSequenceNumber().hashCode();
        }
        if (this.getComponentYield() != null) {
            _hashCode += this.getComponentYield().hashCode();
        }
        if (this.getBomQuantity() != null) {
            _hashCode += this.getBomQuantity().hashCode();
        }
        if (this.getQuantityCommitted() != null) {
            _hashCode += this.getQuantityCommitted().hashCode();
        }
        if (this.getQuantityBackOrdered() != null) {
            _hashCode += this.getQuantityBackOrdered().hashCode();
        }
        if (this.getQuantityAvailable() != null) {
            _hashCode += this.getQuantityAvailable().hashCode();
        }
        if (this.getAverageCost() != null) {
            _hashCode += this.getAverageCost().hashCode();
        }
        if (this.getLastPurchasePrice() != null) {
            _hashCode += this.getLastPurchasePrice().hashCode();
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
        if (this.getSerialNumbers() != null) {
            _hashCode += this.getSerialNumbers().hashCode();
        }
        if (this.getOrderPriority() != null) {
            _hashCode += this.getOrderPriority().hashCode();
        }
        if (this.getOptions() != null) {
            _hashCode += this.getOptions().hashCode();
        }
        if (this.getItemSource() != null) {
            _hashCode += this.getItemSource().hashCode();
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
        if (this.getPoVendor() != null) {
            _hashCode += this.getPoVendor().hashCode();
        }
        if (this.getPoRate() != null) {
            _hashCode += this.getPoRate().hashCode();
        }
        if (this.getPercentComplete() != null) {
            _hashCode += this.getPercentComplete().hashCode();
        }
        if (this.getContribution() != null) {
            _hashCode += this.getContribution().hashCode();
        }
        if (this.getDescription() != null) {
            _hashCode += this.getDescription().hashCode();
        }
        if (this.getCommitInventory() != null) {
            _hashCode += this.getCommitInventory().hashCode();
        }
        if (this.getPlannedIssueDate() != null) {
            _hashCode += this.getPlannedIssueDate().hashCode();
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
        typeDesc.setXmlType(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "WorkOrderItem"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("line");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "line"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "item"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("operationSequenceNumber");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "operationSequenceNumber"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("componentYield");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "componentYield"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("bomQuantity");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "bomQuantity"));
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
        elemField.setFieldName("quantityBackOrdered");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "quantityBackOrdered"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("averageCost");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "averageCost"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("quantityOnHand");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "quantityOnHand"));
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
        elemField.setFieldName("units");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "units"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("itemSource");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "itemSource"));
        elemField.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "ItemSource"));
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
        elemField.setFieldName("location");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "location"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("poVendor");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "poVendor"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("poRate");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "poRate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("percentComplete");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "percentComplete"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("contribution");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "contribution"));
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
        elemField.setFieldName("commitInventory");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "commitInventory"));
        elemField.setXmlType(new QName("urn:types.inventory_2022_1.transactions.webservices.netsuite.com", "WorkOrderItemItemCommitInventory"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("plannedIssueDate");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "plannedIssueDate"));
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

