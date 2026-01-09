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
package com.netsuite.suitetalk.proxy.v2022_1.lists.supplychain;

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

public class ManufacturingRoutingRoutingComponent
implements Serializable {
    private String itemName;
    private String revision;
    private String description;
    private Double yield;
    private Double bomQuantity;
    private Double quantity;
    private String units;
    private RecordRef operationDisplayText;
    private Long operationSequenceNumber;
    private String component;
    private String item;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(ManufacturingRoutingRoutingComponent.class, true);

    public ManufacturingRoutingRoutingComponent() {
    }

    public ManufacturingRoutingRoutingComponent(String itemName, String revision, String description, Double yield, Double bomQuantity, Double quantity, String units, RecordRef operationDisplayText, Long operationSequenceNumber, String component, String item) {
        this.itemName = itemName;
        this.revision = revision;
        this.description = description;
        this.yield = yield;
        this.bomQuantity = bomQuantity;
        this.quantity = quantity;
        this.units = units;
        this.operationDisplayText = operationDisplayText;
        this.operationSequenceNumber = operationSequenceNumber;
        this.component = component;
        this.item = item;
    }

    public String getItemName() {
        return this.itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getRevision() {
        return this.revision;
    }

    public void setRevision(String revision) {
        this.revision = revision;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getYield() {
        return this.yield;
    }

    public void setYield(Double yield) {
        this.yield = yield;
    }

    public Double getBomQuantity() {
        return this.bomQuantity;
    }

    public void setBomQuantity(Double bomQuantity) {
        this.bomQuantity = bomQuantity;
    }

    public Double getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public String getUnits() {
        return this.units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    public RecordRef getOperationDisplayText() {
        return this.operationDisplayText;
    }

    public void setOperationDisplayText(RecordRef operationDisplayText) {
        this.operationDisplayText = operationDisplayText;
    }

    public Long getOperationSequenceNumber() {
        return this.operationSequenceNumber;
    }

    public void setOperationSequenceNumber(Long operationSequenceNumber) {
        this.operationSequenceNumber = operationSequenceNumber;
    }

    public String getComponent() {
        return this.component;
    }

    public void setComponent(String component) {
        this.component = component;
    }

    public String getItem() {
        return this.item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ManufacturingRoutingRoutingComponent)) {
            return false;
        }
        ManufacturingRoutingRoutingComponent other = (ManufacturingRoutingRoutingComponent)obj;
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
        boolean _equals = (this.itemName == null && other.getItemName() == null || this.itemName != null && this.itemName.equals(other.getItemName())) && (this.revision == null && other.getRevision() == null || this.revision != null && this.revision.equals(other.getRevision())) && (this.description == null && other.getDescription() == null || this.description != null && this.description.equals(other.getDescription())) && (this.yield == null && other.getYield() == null || this.yield != null && this.yield.equals(other.getYield())) && (this.bomQuantity == null && other.getBomQuantity() == null || this.bomQuantity != null && this.bomQuantity.equals(other.getBomQuantity())) && (this.quantity == null && other.getQuantity() == null || this.quantity != null && this.quantity.equals(other.getQuantity())) && (this.units == null && other.getUnits() == null || this.units != null && this.units.equals(other.getUnits())) && (this.operationDisplayText == null && other.getOperationDisplayText() == null || this.operationDisplayText != null && this.operationDisplayText.equals(other.getOperationDisplayText())) && (this.operationSequenceNumber == null && other.getOperationSequenceNumber() == null || this.operationSequenceNumber != null && this.operationSequenceNumber.equals(other.getOperationSequenceNumber())) && (this.component == null && other.getComponent() == null || this.component != null && this.component.equals(other.getComponent())) && (this.item == null && other.getItem() == null || this.item != null && this.item.equals(other.getItem()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getItemName() != null) {
            _hashCode += this.getItemName().hashCode();
        }
        if (this.getRevision() != null) {
            _hashCode += this.getRevision().hashCode();
        }
        if (this.getDescription() != null) {
            _hashCode += this.getDescription().hashCode();
        }
        if (this.getYield() != null) {
            _hashCode += this.getYield().hashCode();
        }
        if (this.getBomQuantity() != null) {
            _hashCode += this.getBomQuantity().hashCode();
        }
        if (this.getQuantity() != null) {
            _hashCode += this.getQuantity().hashCode();
        }
        if (this.getUnits() != null) {
            _hashCode += this.getUnits().hashCode();
        }
        if (this.getOperationDisplayText() != null) {
            _hashCode += this.getOperationDisplayText().hashCode();
        }
        if (this.getOperationSequenceNumber() != null) {
            _hashCode += this.getOperationSequenceNumber().hashCode();
        }
        if (this.getComponent() != null) {
            _hashCode += this.getComponent().hashCode();
        }
        if (this.getItem() != null) {
            _hashCode += this.getItem().hashCode();
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
        typeDesc.setXmlType(new QName("urn:supplychain_2022_1.lists.webservices.netsuite.com", "ManufacturingRoutingRoutingComponent"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("itemName");
        elemField.setXmlName(new QName("urn:supplychain_2022_1.lists.webservices.netsuite.com", "itemName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revision");
        elemField.setXmlName(new QName("urn:supplychain_2022_1.lists.webservices.netsuite.com", "revision"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new QName("urn:supplychain_2022_1.lists.webservices.netsuite.com", "description"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("yield");
        elemField.setXmlName(new QName("urn:supplychain_2022_1.lists.webservices.netsuite.com", "yield"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("bomQuantity");
        elemField.setXmlName(new QName("urn:supplychain_2022_1.lists.webservices.netsuite.com", "bomQuantity"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new QName("urn:supplychain_2022_1.lists.webservices.netsuite.com", "quantity"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("units");
        elemField.setXmlName(new QName("urn:supplychain_2022_1.lists.webservices.netsuite.com", "units"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("operationDisplayText");
        elemField.setXmlName(new QName("urn:supplychain_2022_1.lists.webservices.netsuite.com", "operationDisplayText"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("operationSequenceNumber");
        elemField.setXmlName(new QName("urn:supplychain_2022_1.lists.webservices.netsuite.com", "operationSequenceNumber"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("component");
        elemField.setXmlName(new QName("urn:supplychain_2022_1.lists.webservices.netsuite.com", "component"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new QName("urn:supplychain_2022_1.lists.webservices.netsuite.com", "item"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

