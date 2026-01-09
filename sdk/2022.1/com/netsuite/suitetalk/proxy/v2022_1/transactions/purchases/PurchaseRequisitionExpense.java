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
package com.netsuite.suitetalk.proxy.v2022_1.transactions.purchases;

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRefList;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class PurchaseRequisitionExpense
implements Serializable {
    private Long line;
    private RecordRef category;
    private RecordRef location;
    private Boolean isClosed;
    private RecordRef account;
    private RecordRef poVendor;
    private Double estimatedAmount;
    private Double amount;
    private String memo;
    private RecordRef department;
    private RecordRef _class;
    private RecordRef customer;
    private RecordRefList linkedOrderList;
    private String linkedOrderStatus;
    private Boolean isBillable;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(PurchaseRequisitionExpense.class, true);

    public PurchaseRequisitionExpense() {
    }

    public PurchaseRequisitionExpense(Long line, RecordRef category, RecordRef location, Boolean isClosed, RecordRef account, RecordRef poVendor, Double estimatedAmount, Double amount, String memo, RecordRef department, RecordRef _class, RecordRef customer, RecordRefList linkedOrderList, String linkedOrderStatus, Boolean isBillable) {
        this.line = line;
        this.category = category;
        this.location = location;
        this.isClosed = isClosed;
        this.account = account;
        this.poVendor = poVendor;
        this.estimatedAmount = estimatedAmount;
        this.amount = amount;
        this.memo = memo;
        this.department = department;
        this._class = _class;
        this.customer = customer;
        this.linkedOrderList = linkedOrderList;
        this.linkedOrderStatus = linkedOrderStatus;
        this.isBillable = isBillable;
    }

    public Long getLine() {
        return this.line;
    }

    public void setLine(Long line) {
        this.line = line;
    }

    public RecordRef getCategory() {
        return this.category;
    }

    public void setCategory(RecordRef category) {
        this.category = category;
    }

    public RecordRef getLocation() {
        return this.location;
    }

    public void setLocation(RecordRef location) {
        this.location = location;
    }

    public Boolean getIsClosed() {
        return this.isClosed;
    }

    public void setIsClosed(Boolean isClosed) {
        this.isClosed = isClosed;
    }

    public RecordRef getAccount() {
        return this.account;
    }

    public void setAccount(RecordRef account) {
        this.account = account;
    }

    public RecordRef getPoVendor() {
        return this.poVendor;
    }

    public void setPoVendor(RecordRef poVendor) {
        this.poVendor = poVendor;
    }

    public Double getEstimatedAmount() {
        return this.estimatedAmount;
    }

    public void setEstimatedAmount(Double estimatedAmount) {
        this.estimatedAmount = estimatedAmount;
    }

    public Double getAmount() {
        return this.amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public String getMemo() {
        return this.memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
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

    public RecordRef getCustomer() {
        return this.customer;
    }

    public void setCustomer(RecordRef customer) {
        this.customer = customer;
    }

    public RecordRefList getLinkedOrderList() {
        return this.linkedOrderList;
    }

    public void setLinkedOrderList(RecordRefList linkedOrderList) {
        this.linkedOrderList = linkedOrderList;
    }

    public String getLinkedOrderStatus() {
        return this.linkedOrderStatus;
    }

    public void setLinkedOrderStatus(String linkedOrderStatus) {
        this.linkedOrderStatus = linkedOrderStatus;
    }

    public Boolean getIsBillable() {
        return this.isBillable;
    }

    public void setIsBillable(Boolean isBillable) {
        this.isBillable = isBillable;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PurchaseRequisitionExpense)) {
            return false;
        }
        PurchaseRequisitionExpense other = (PurchaseRequisitionExpense)obj;
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
        boolean _equals = (this.line == null && other.getLine() == null || this.line != null && this.line.equals(other.getLine())) && (this.category == null && other.getCategory() == null || this.category != null && this.category.equals(other.getCategory())) && (this.location == null && other.getLocation() == null || this.location != null && this.location.equals(other.getLocation())) && (this.isClosed == null && other.getIsClosed() == null || this.isClosed != null && this.isClosed.equals(other.getIsClosed())) && (this.account == null && other.getAccount() == null || this.account != null && this.account.equals(other.getAccount())) && (this.poVendor == null && other.getPoVendor() == null || this.poVendor != null && this.poVendor.equals(other.getPoVendor())) && (this.estimatedAmount == null && other.getEstimatedAmount() == null || this.estimatedAmount != null && this.estimatedAmount.equals(other.getEstimatedAmount())) && (this.amount == null && other.getAmount() == null || this.amount != null && this.amount.equals(other.getAmount())) && (this.memo == null && other.getMemo() == null || this.memo != null && this.memo.equals(other.getMemo())) && (this.department == null && other.getDepartment() == null || this.department != null && this.department.equals(other.getDepartment())) && (this._class == null && other.get_class() == null || this._class != null && this._class.equals(other.get_class())) && (this.customer == null && other.getCustomer() == null || this.customer != null && this.customer.equals(other.getCustomer())) && (this.linkedOrderList == null && other.getLinkedOrderList() == null || this.linkedOrderList != null && this.linkedOrderList.equals(other.getLinkedOrderList())) && (this.linkedOrderStatus == null && other.getLinkedOrderStatus() == null || this.linkedOrderStatus != null && this.linkedOrderStatus.equals(other.getLinkedOrderStatus())) && (this.isBillable == null && other.getIsBillable() == null || this.isBillable != null && this.isBillable.equals(other.getIsBillable()));
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
        if (this.getCategory() != null) {
            _hashCode += this.getCategory().hashCode();
        }
        if (this.getLocation() != null) {
            _hashCode += this.getLocation().hashCode();
        }
        if (this.getIsClosed() != null) {
            _hashCode += this.getIsClosed().hashCode();
        }
        if (this.getAccount() != null) {
            _hashCode += this.getAccount().hashCode();
        }
        if (this.getPoVendor() != null) {
            _hashCode += this.getPoVendor().hashCode();
        }
        if (this.getEstimatedAmount() != null) {
            _hashCode += this.getEstimatedAmount().hashCode();
        }
        if (this.getAmount() != null) {
            _hashCode += this.getAmount().hashCode();
        }
        if (this.getMemo() != null) {
            _hashCode += this.getMemo().hashCode();
        }
        if (this.getDepartment() != null) {
            _hashCode += this.getDepartment().hashCode();
        }
        if (this.get_class() != null) {
            _hashCode += this.get_class().hashCode();
        }
        if (this.getCustomer() != null) {
            _hashCode += this.getCustomer().hashCode();
        }
        if (this.getLinkedOrderList() != null) {
            _hashCode += this.getLinkedOrderList().hashCode();
        }
        if (this.getLinkedOrderStatus() != null) {
            _hashCode += this.getLinkedOrderStatus().hashCode();
        }
        if (this.getIsBillable() != null) {
            _hashCode += this.getIsBillable().hashCode();
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
        typeDesc.setXmlType(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "PurchaseRequisitionExpense"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("line");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "line"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "category"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "location"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isClosed");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "isClosed"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "account"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("poVendor");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "poVendor"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("estimatedAmount");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "estimatedAmount"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "amount"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "department"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "class"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customer");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "customer"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("linkedOrderList");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "linkedOrderList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRefList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("linkedOrderStatus");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "linkedOrderStatus"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isBillable");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "isBillable"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

