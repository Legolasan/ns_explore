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

public class AssemblyComponent
implements Serializable {
    private RecordRef item;
    private Double quantity;
    private Double quantityOnHand;
    private InventoryDetail componentInventoryDetail;
    private String componentNumbers;
    private String binNumbers;
    private Long lineNumber;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(AssemblyComponent.class, true);

    public AssemblyComponent() {
    }

    public AssemblyComponent(RecordRef item, Double quantity, Double quantityOnHand, InventoryDetail componentInventoryDetail, String componentNumbers, String binNumbers, Long lineNumber) {
        this.item = item;
        this.quantity = quantity;
        this.quantityOnHand = quantityOnHand;
        this.componentInventoryDetail = componentInventoryDetail;
        this.componentNumbers = componentNumbers;
        this.binNumbers = binNumbers;
        this.lineNumber = lineNumber;
    }

    public RecordRef getItem() {
        return this.item;
    }

    public void setItem(RecordRef item) {
        this.item = item;
    }

    public Double getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Double getQuantityOnHand() {
        return this.quantityOnHand;
    }

    public void setQuantityOnHand(Double quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }

    public InventoryDetail getComponentInventoryDetail() {
        return this.componentInventoryDetail;
    }

    public void setComponentInventoryDetail(InventoryDetail componentInventoryDetail) {
        this.componentInventoryDetail = componentInventoryDetail;
    }

    public String getComponentNumbers() {
        return this.componentNumbers;
    }

    public void setComponentNumbers(String componentNumbers) {
        this.componentNumbers = componentNumbers;
    }

    public String getBinNumbers() {
        return this.binNumbers;
    }

    public void setBinNumbers(String binNumbers) {
        this.binNumbers = binNumbers;
    }

    public Long getLineNumber() {
        return this.lineNumber;
    }

    public void setLineNumber(Long lineNumber) {
        this.lineNumber = lineNumber;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof AssemblyComponent)) {
            return false;
        }
        AssemblyComponent other = (AssemblyComponent)obj;
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
        boolean _equals = (this.item == null && other.getItem() == null || this.item != null && this.item.equals(other.getItem())) && (this.quantity == null && other.getQuantity() == null || this.quantity != null && this.quantity.equals(other.getQuantity())) && (this.quantityOnHand == null && other.getQuantityOnHand() == null || this.quantityOnHand != null && this.quantityOnHand.equals(other.getQuantityOnHand())) && (this.componentInventoryDetail == null && other.getComponentInventoryDetail() == null || this.componentInventoryDetail != null && this.componentInventoryDetail.equals(other.getComponentInventoryDetail())) && (this.componentNumbers == null && other.getComponentNumbers() == null || this.componentNumbers != null && this.componentNumbers.equals(other.getComponentNumbers())) && (this.binNumbers == null && other.getBinNumbers() == null || this.binNumbers != null && this.binNumbers.equals(other.getBinNumbers())) && (this.lineNumber == null && other.getLineNumber() == null || this.lineNumber != null && this.lineNumber.equals(other.getLineNumber()));
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
        if (this.getQuantity() != null) {
            _hashCode += this.getQuantity().hashCode();
        }
        if (this.getQuantityOnHand() != null) {
            _hashCode += this.getQuantityOnHand().hashCode();
        }
        if (this.getComponentInventoryDetail() != null) {
            _hashCode += this.getComponentInventoryDetail().hashCode();
        }
        if (this.getComponentNumbers() != null) {
            _hashCode += this.getComponentNumbers().hashCode();
        }
        if (this.getBinNumbers() != null) {
            _hashCode += this.getBinNumbers().hashCode();
        }
        if (this.getLineNumber() != null) {
            _hashCode += this.getLineNumber().hashCode();
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
        typeDesc.setXmlType(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "AssemblyComponent"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "item"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("quantityOnHand");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "quantityOnHand"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("componentInventoryDetail");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "componentInventoryDetail"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "InventoryDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("componentNumbers");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "componentNumbers"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("binNumbers");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "binNumbers"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lineNumber");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "lineNumber"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

