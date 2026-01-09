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

public class BinWorksheetItem
implements Serializable {
    private RecordRef item;
    private String itemName;
    private String description;
    private Double quantity;
    private String itemOnHand;
    private String itemUnitsLabel;
    private InventoryDetail inventoryDetail;
    private String itemBins;
    private String itemBinNumbers;
    private String itemBinList;
    private String itemPreferBin;
    private String itemBlank;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(BinWorksheetItem.class, true);

    public BinWorksheetItem() {
    }

    public BinWorksheetItem(RecordRef item, String itemName, String description, Double quantity, String itemOnHand, String itemUnitsLabel, InventoryDetail inventoryDetail, String itemBins, String itemBinNumbers, String itemBinList, String itemPreferBin, String itemBlank) {
        this.item = item;
        this.itemName = itemName;
        this.description = description;
        this.quantity = quantity;
        this.itemOnHand = itemOnHand;
        this.itemUnitsLabel = itemUnitsLabel;
        this.inventoryDetail = inventoryDetail;
        this.itemBins = itemBins;
        this.itemBinNumbers = itemBinNumbers;
        this.itemBinList = itemBinList;
        this.itemPreferBin = itemPreferBin;
        this.itemBlank = itemBlank;
    }

    public RecordRef getItem() {
        return this.item;
    }

    public void setItem(RecordRef item) {
        this.item = item;
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

    public Double getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public String getItemOnHand() {
        return this.itemOnHand;
    }

    public void setItemOnHand(String itemOnHand) {
        this.itemOnHand = itemOnHand;
    }

    public String getItemUnitsLabel() {
        return this.itemUnitsLabel;
    }

    public void setItemUnitsLabel(String itemUnitsLabel) {
        this.itemUnitsLabel = itemUnitsLabel;
    }

    public InventoryDetail getInventoryDetail() {
        return this.inventoryDetail;
    }

    public void setInventoryDetail(InventoryDetail inventoryDetail) {
        this.inventoryDetail = inventoryDetail;
    }

    public String getItemBins() {
        return this.itemBins;
    }

    public void setItemBins(String itemBins) {
        this.itemBins = itemBins;
    }

    public String getItemBinNumbers() {
        return this.itemBinNumbers;
    }

    public void setItemBinNumbers(String itemBinNumbers) {
        this.itemBinNumbers = itemBinNumbers;
    }

    public String getItemBinList() {
        return this.itemBinList;
    }

    public void setItemBinList(String itemBinList) {
        this.itemBinList = itemBinList;
    }

    public String getItemPreferBin() {
        return this.itemPreferBin;
    }

    public void setItemPreferBin(String itemPreferBin) {
        this.itemPreferBin = itemPreferBin;
    }

    public String getItemBlank() {
        return this.itemBlank;
    }

    public void setItemBlank(String itemBlank) {
        this.itemBlank = itemBlank;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof BinWorksheetItem)) {
            return false;
        }
        BinWorksheetItem other = (BinWorksheetItem)obj;
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
        boolean _equals = (this.item == null && other.getItem() == null || this.item != null && this.item.equals(other.getItem())) && (this.itemName == null && other.getItemName() == null || this.itemName != null && this.itemName.equals(other.getItemName())) && (this.description == null && other.getDescription() == null || this.description != null && this.description.equals(other.getDescription())) && (this.quantity == null && other.getQuantity() == null || this.quantity != null && this.quantity.equals(other.getQuantity())) && (this.itemOnHand == null && other.getItemOnHand() == null || this.itemOnHand != null && this.itemOnHand.equals(other.getItemOnHand())) && (this.itemUnitsLabel == null && other.getItemUnitsLabel() == null || this.itemUnitsLabel != null && this.itemUnitsLabel.equals(other.getItemUnitsLabel())) && (this.inventoryDetail == null && other.getInventoryDetail() == null || this.inventoryDetail != null && this.inventoryDetail.equals(other.getInventoryDetail())) && (this.itemBins == null && other.getItemBins() == null || this.itemBins != null && this.itemBins.equals(other.getItemBins())) && (this.itemBinNumbers == null && other.getItemBinNumbers() == null || this.itemBinNumbers != null && this.itemBinNumbers.equals(other.getItemBinNumbers())) && (this.itemBinList == null && other.getItemBinList() == null || this.itemBinList != null && this.itemBinList.equals(other.getItemBinList())) && (this.itemPreferBin == null && other.getItemPreferBin() == null || this.itemPreferBin != null && this.itemPreferBin.equals(other.getItemPreferBin())) && (this.itemBlank == null && other.getItemBlank() == null || this.itemBlank != null && this.itemBlank.equals(other.getItemBlank()));
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
        if (this.getItemName() != null) {
            _hashCode += this.getItemName().hashCode();
        }
        if (this.getDescription() != null) {
            _hashCode += this.getDescription().hashCode();
        }
        if (this.getQuantity() != null) {
            _hashCode += this.getQuantity().hashCode();
        }
        if (this.getItemOnHand() != null) {
            _hashCode += this.getItemOnHand().hashCode();
        }
        if (this.getItemUnitsLabel() != null) {
            _hashCode += this.getItemUnitsLabel().hashCode();
        }
        if (this.getInventoryDetail() != null) {
            _hashCode += this.getInventoryDetail().hashCode();
        }
        if (this.getItemBins() != null) {
            _hashCode += this.getItemBins().hashCode();
        }
        if (this.getItemBinNumbers() != null) {
            _hashCode += this.getItemBinNumbers().hashCode();
        }
        if (this.getItemBinList() != null) {
            _hashCode += this.getItemBinList().hashCode();
        }
        if (this.getItemPreferBin() != null) {
            _hashCode += this.getItemPreferBin().hashCode();
        }
        if (this.getItemBlank() != null) {
            _hashCode += this.getItemBlank().hashCode();
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
        typeDesc.setXmlType(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "BinWorksheetItem"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "item"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemName");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "itemName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("quantity");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "quantity"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemOnHand");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "itemOnHand"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemUnitsLabel");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "itemUnitsLabel"));
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
        elemField.setFieldName("itemBins");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "itemBins"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemBinNumbers");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "itemBinNumbers"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemBinList");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "itemBinList"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemPreferBin");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "itemPreferBin"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemBlank");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "itemBlank"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

