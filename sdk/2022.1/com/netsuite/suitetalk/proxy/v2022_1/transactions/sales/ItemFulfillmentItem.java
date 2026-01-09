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
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.CustomFieldList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class ItemFulfillmentItem
implements Serializable {
    private String jobName;
    private Boolean itemReceive;
    private String itemName;
    private String description;
    private RecordRef department;
    private RecordRef _class;
    private RecordRef location;
    private Double onHand;
    private Double quantity;
    private String unitsDisplay;
    private String createPo;
    private InventoryDetail inventoryDetail;
    private String binNumbers;
    private String serialNumbers;
    private String poNum;
    private RecordRef item;
    private Long orderLine;
    private Double quantityRemaining;
    private CustomFieldList options;
    private Long shipGroup;
    private Boolean itemIsFulfilled;
    private RecordRef shipAddress;
    private RecordRef shipMethod;
    private CustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(ItemFulfillmentItem.class, true);

    public ItemFulfillmentItem() {
    }

    public ItemFulfillmentItem(String jobName, Boolean itemReceive, String itemName, String description, RecordRef department, RecordRef _class, RecordRef location, Double onHand, Double quantity, String unitsDisplay, String createPo, InventoryDetail inventoryDetail, String binNumbers, String serialNumbers, String poNum, RecordRef item, Long orderLine, Double quantityRemaining, CustomFieldList options, Long shipGroup, Boolean itemIsFulfilled, RecordRef shipAddress, RecordRef shipMethod, CustomFieldList customFieldList) {
        this.jobName = jobName;
        this.itemReceive = itemReceive;
        this.itemName = itemName;
        this.description = description;
        this.department = department;
        this._class = _class;
        this.location = location;
        this.onHand = onHand;
        this.quantity = quantity;
        this.unitsDisplay = unitsDisplay;
        this.createPo = createPo;
        this.inventoryDetail = inventoryDetail;
        this.binNumbers = binNumbers;
        this.serialNumbers = serialNumbers;
        this.poNum = poNum;
        this.item = item;
        this.orderLine = orderLine;
        this.quantityRemaining = quantityRemaining;
        this.options = options;
        this.shipGroup = shipGroup;
        this.itemIsFulfilled = itemIsFulfilled;
        this.shipAddress = shipAddress;
        this.shipMethod = shipMethod;
        this.customFieldList = customFieldList;
    }

    public String getJobName() {
        return this.jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public Boolean getItemReceive() {
        return this.itemReceive;
    }

    public void setItemReceive(Boolean itemReceive) {
        this.itemReceive = itemReceive;
    }

    public String getItemName() {
        return this.itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public Double getOnHand() {
        return this.onHand;
    }

    public void setOnHand(Double onHand) {
        this.onHand = onHand;
    }

    public Double getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public String getUnitsDisplay() {
        return this.unitsDisplay;
    }

    public void setUnitsDisplay(String unitsDisplay) {
        this.unitsDisplay = unitsDisplay;
    }

    public String getCreatePo() {
        return this.createPo;
    }

    public void setCreatePo(String createPo) {
        this.createPo = createPo;
    }

    public InventoryDetail getInventoryDetail() {
        return this.inventoryDetail;
    }

    public void setInventoryDetail(InventoryDetail inventoryDetail) {
        this.inventoryDetail = inventoryDetail;
    }

    public String getBinNumbers() {
        return this.binNumbers;
    }

    public void setBinNumbers(String binNumbers) {
        this.binNumbers = binNumbers;
    }

    public String getSerialNumbers() {
        return this.serialNumbers;
    }

    public void setSerialNumbers(String serialNumbers) {
        this.serialNumbers = serialNumbers;
    }

    public String getPoNum() {
        return this.poNum;
    }

    public void setPoNum(String poNum) {
        this.poNum = poNum;
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

    public Double getQuantityRemaining() {
        return this.quantityRemaining;
    }

    public void setQuantityRemaining(Double quantityRemaining) {
        this.quantityRemaining = quantityRemaining;
    }

    public CustomFieldList getOptions() {
        return this.options;
    }

    public void setOptions(CustomFieldList options) {
        this.options = options;
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

    public CustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ItemFulfillmentItem)) {
            return false;
        }
        ItemFulfillmentItem other = (ItemFulfillmentItem)obj;
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
        boolean _equals = (this.jobName == null && other.getJobName() == null || this.jobName != null && this.jobName.equals(other.getJobName())) && (this.itemReceive == null && other.getItemReceive() == null || this.itemReceive != null && this.itemReceive.equals(other.getItemReceive())) && (this.itemName == null && other.getItemName() == null || this.itemName != null && this.itemName.equals(other.getItemName())) && (this.description == null && other.getDescription() == null || this.description != null && this.description.equals(other.getDescription())) && (this.department == null && other.getDepartment() == null || this.department != null && this.department.equals(other.getDepartment())) && (this._class == null && other.get_class() == null || this._class != null && this._class.equals(other.get_class())) && (this.location == null && other.getLocation() == null || this.location != null && this.location.equals(other.getLocation())) && (this.onHand == null && other.getOnHand() == null || this.onHand != null && this.onHand.equals(other.getOnHand())) && (this.quantity == null && other.getQuantity() == null || this.quantity != null && this.quantity.equals(other.getQuantity())) && (this.unitsDisplay == null && other.getUnitsDisplay() == null || this.unitsDisplay != null && this.unitsDisplay.equals(other.getUnitsDisplay())) && (this.createPo == null && other.getCreatePo() == null || this.createPo != null && this.createPo.equals(other.getCreatePo())) && (this.inventoryDetail == null && other.getInventoryDetail() == null || this.inventoryDetail != null && this.inventoryDetail.equals(other.getInventoryDetail())) && (this.binNumbers == null && other.getBinNumbers() == null || this.binNumbers != null && this.binNumbers.equals(other.getBinNumbers())) && (this.serialNumbers == null && other.getSerialNumbers() == null || this.serialNumbers != null && this.serialNumbers.equals(other.getSerialNumbers())) && (this.poNum == null && other.getPoNum() == null || this.poNum != null && this.poNum.equals(other.getPoNum())) && (this.item == null && other.getItem() == null || this.item != null && this.item.equals(other.getItem())) && (this.orderLine == null && other.getOrderLine() == null || this.orderLine != null && this.orderLine.equals(other.getOrderLine())) && (this.quantityRemaining == null && other.getQuantityRemaining() == null || this.quantityRemaining != null && this.quantityRemaining.equals(other.getQuantityRemaining())) && (this.options == null && other.getOptions() == null || this.options != null && this.options.equals(other.getOptions())) && (this.shipGroup == null && other.getShipGroup() == null || this.shipGroup != null && this.shipGroup.equals(other.getShipGroup())) && (this.itemIsFulfilled == null && other.getItemIsFulfilled() == null || this.itemIsFulfilled != null && this.itemIsFulfilled.equals(other.getItemIsFulfilled())) && (this.shipAddress == null && other.getShipAddress() == null || this.shipAddress != null && this.shipAddress.equals(other.getShipAddress())) && (this.shipMethod == null && other.getShipMethod() == null || this.shipMethod != null && this.shipMethod.equals(other.getShipMethod())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getJobName() != null) {
            _hashCode += this.getJobName().hashCode();
        }
        if (this.getItemReceive() != null) {
            _hashCode += this.getItemReceive().hashCode();
        }
        if (this.getItemName() != null) {
            _hashCode += this.getItemName().hashCode();
        }
        if (this.getDescription() != null) {
            _hashCode += this.getDescription().hashCode();
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
        if (this.getOnHand() != null) {
            _hashCode += this.getOnHand().hashCode();
        }
        if (this.getQuantity() != null) {
            _hashCode += this.getQuantity().hashCode();
        }
        if (this.getUnitsDisplay() != null) {
            _hashCode += this.getUnitsDisplay().hashCode();
        }
        if (this.getCreatePo() != null) {
            _hashCode += this.getCreatePo().hashCode();
        }
        if (this.getInventoryDetail() != null) {
            _hashCode += this.getInventoryDetail().hashCode();
        }
        if (this.getBinNumbers() != null) {
            _hashCode += this.getBinNumbers().hashCode();
        }
        if (this.getSerialNumbers() != null) {
            _hashCode += this.getSerialNumbers().hashCode();
        }
        if (this.getPoNum() != null) {
            _hashCode += this.getPoNum().hashCode();
        }
        if (this.getItem() != null) {
            _hashCode += this.getItem().hashCode();
        }
        if (this.getOrderLine() != null) {
            _hashCode += this.getOrderLine().hashCode();
        }
        if (this.getQuantityRemaining() != null) {
            _hashCode += this.getQuantityRemaining().hashCode();
        }
        if (this.getOptions() != null) {
            _hashCode += this.getOptions().hashCode();
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
        typeDesc.setXmlType(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "ItemFulfillmentItem"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("jobName");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "jobName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemReceive");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "itemReceive"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemName");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "itemName"));
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
        elemField.setFieldName("onHand");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "onHand"));
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
        elemField.setFieldName("unitsDisplay");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "unitsDisplay"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("createPo");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "createPo"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("binNumbers");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "binNumbers"));
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
        elemField.setFieldName("poNum");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "poNum"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("orderLine");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "orderLine"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("options");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "options"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "CustomFieldList"));
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
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "CustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

