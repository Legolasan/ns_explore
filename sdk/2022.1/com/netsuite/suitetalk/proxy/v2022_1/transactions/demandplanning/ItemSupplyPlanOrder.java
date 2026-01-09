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
package com.netsuite.suitetalk.proxy.v2022_1.transactions.demandplanning;

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.demandplanning.types.ItemSupplyPlanOrderType;
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

public class ItemSupplyPlanOrder
implements Serializable {
    private Long orderLineId;
    private Calendar orderDate;
    private Calendar receiptDate;
    private RecordRef sourceLocation;
    private Double quantity;
    private Boolean orderCreated;
    private ItemSupplyPlanOrderType orderType;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(ItemSupplyPlanOrder.class, true);

    public ItemSupplyPlanOrder() {
    }

    public ItemSupplyPlanOrder(Long orderLineId, Calendar orderDate, Calendar receiptDate, RecordRef sourceLocation, Double quantity, Boolean orderCreated, ItemSupplyPlanOrderType orderType) {
        this.orderLineId = orderLineId;
        this.orderDate = orderDate;
        this.receiptDate = receiptDate;
        this.sourceLocation = sourceLocation;
        this.quantity = quantity;
        this.orderCreated = orderCreated;
        this.orderType = orderType;
    }

    public Long getOrderLineId() {
        return this.orderLineId;
    }

    public void setOrderLineId(Long orderLineId) {
        this.orderLineId = orderLineId;
    }

    public Calendar getOrderDate() {
        return this.orderDate;
    }

    public void setOrderDate(Calendar orderDate) {
        this.orderDate = orderDate;
    }

    public Calendar getReceiptDate() {
        return this.receiptDate;
    }

    public void setReceiptDate(Calendar receiptDate) {
        this.receiptDate = receiptDate;
    }

    public RecordRef getSourceLocation() {
        return this.sourceLocation;
    }

    public void setSourceLocation(RecordRef sourceLocation) {
        this.sourceLocation = sourceLocation;
    }

    public Double getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Boolean getOrderCreated() {
        return this.orderCreated;
    }

    public void setOrderCreated(Boolean orderCreated) {
        this.orderCreated = orderCreated;
    }

    public ItemSupplyPlanOrderType getOrderType() {
        return this.orderType;
    }

    public void setOrderType(ItemSupplyPlanOrderType orderType) {
        this.orderType = orderType;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ItemSupplyPlanOrder)) {
            return false;
        }
        ItemSupplyPlanOrder other = (ItemSupplyPlanOrder)obj;
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
        boolean _equals = (this.orderLineId == null && other.getOrderLineId() == null || this.orderLineId != null && this.orderLineId.equals(other.getOrderLineId())) && (this.orderDate == null && other.getOrderDate() == null || this.orderDate != null && this.orderDate.equals(other.getOrderDate())) && (this.receiptDate == null && other.getReceiptDate() == null || this.receiptDate != null && this.receiptDate.equals(other.getReceiptDate())) && (this.sourceLocation == null && other.getSourceLocation() == null || this.sourceLocation != null && this.sourceLocation.equals(other.getSourceLocation())) && (this.quantity == null && other.getQuantity() == null || this.quantity != null && this.quantity.equals(other.getQuantity())) && (this.orderCreated == null && other.getOrderCreated() == null || this.orderCreated != null && this.orderCreated.equals(other.getOrderCreated())) && (this.orderType == null && other.getOrderType() == null || this.orderType != null && this.orderType.equals(other.getOrderType()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getOrderLineId() != null) {
            _hashCode += this.getOrderLineId().hashCode();
        }
        if (this.getOrderDate() != null) {
            _hashCode += this.getOrderDate().hashCode();
        }
        if (this.getReceiptDate() != null) {
            _hashCode += this.getReceiptDate().hashCode();
        }
        if (this.getSourceLocation() != null) {
            _hashCode += this.getSourceLocation().hashCode();
        }
        if (this.getQuantity() != null) {
            _hashCode += this.getQuantity().hashCode();
        }
        if (this.getOrderCreated() != null) {
            _hashCode += this.getOrderCreated().hashCode();
        }
        if (this.getOrderType() != null) {
            _hashCode += this.getOrderType().hashCode();
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
        typeDesc.setXmlType(new QName("urn:demandplanning_2022_1.transactions.webservices.netsuite.com", "ItemSupplyPlanOrder"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("orderLineId");
        elemField.setXmlName(new QName("urn:demandplanning_2022_1.transactions.webservices.netsuite.com", "orderLineId"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("orderDate");
        elemField.setXmlName(new QName("urn:demandplanning_2022_1.transactions.webservices.netsuite.com", "orderDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("receiptDate");
        elemField.setXmlName(new QName("urn:demandplanning_2022_1.transactions.webservices.netsuite.com", "receiptDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("sourceLocation");
        elemField.setXmlName(new QName("urn:demandplanning_2022_1.transactions.webservices.netsuite.com", "sourceLocation"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new QName("urn:demandplanning_2022_1.transactions.webservices.netsuite.com", "quantity"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("orderCreated");
        elemField.setXmlName(new QName("urn:demandplanning_2022_1.transactions.webservices.netsuite.com", "orderCreated"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("orderType");
        elemField.setXmlName(new QName("urn:demandplanning_2022_1.transactions.webservices.netsuite.com", "orderType"));
        elemField.setXmlType(new QName("urn:types.demandplanning_2022_1.transactions.webservices.netsuite.com", "ItemSupplyPlanOrderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

