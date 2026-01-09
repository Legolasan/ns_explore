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
package com.netsuite.suitetalk.proxy.v2022_1.transactions.employees;

import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class PaycheckPayTax
implements Serializable {
    private Long line;
    private Boolean apply;
    private String payTax;
    private Long payItem;
    private Double taxableWageBase;
    private Double taxedWageBase;
    private Double reportableWageBase;
    private Boolean isExempt;
    private Boolean isResidentTax;
    private Double amount;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(PaycheckPayTax.class, true);

    public PaycheckPayTax() {
    }

    public PaycheckPayTax(Long line, Boolean apply, String payTax, Long payItem, Double taxableWageBase, Double taxedWageBase, Double reportableWageBase, Boolean isExempt, Boolean isResidentTax, Double amount) {
        this.line = line;
        this.apply = apply;
        this.payTax = payTax;
        this.payItem = payItem;
        this.taxableWageBase = taxableWageBase;
        this.taxedWageBase = taxedWageBase;
        this.reportableWageBase = reportableWageBase;
        this.isExempt = isExempt;
        this.isResidentTax = isResidentTax;
        this.amount = amount;
    }

    public Long getLine() {
        return this.line;
    }

    public void setLine(Long line) {
        this.line = line;
    }

    public Boolean getApply() {
        return this.apply;
    }

    public void setApply(Boolean apply) {
        this.apply = apply;
    }

    public String getPayTax() {
        return this.payTax;
    }

    public void setPayTax(String payTax) {
        this.payTax = payTax;
    }

    public Long getPayItem() {
        return this.payItem;
    }

    public void setPayItem(Long payItem) {
        this.payItem = payItem;
    }

    public Double getTaxableWageBase() {
        return this.taxableWageBase;
    }

    public void setTaxableWageBase(Double taxableWageBase) {
        this.taxableWageBase = taxableWageBase;
    }

    public Double getTaxedWageBase() {
        return this.taxedWageBase;
    }

    public void setTaxedWageBase(Double taxedWageBase) {
        this.taxedWageBase = taxedWageBase;
    }

    public Double getReportableWageBase() {
        return this.reportableWageBase;
    }

    public void setReportableWageBase(Double reportableWageBase) {
        this.reportableWageBase = reportableWageBase;
    }

    public Boolean getIsExempt() {
        return this.isExempt;
    }

    public void setIsExempt(Boolean isExempt) {
        this.isExempt = isExempt;
    }

    public Boolean getIsResidentTax() {
        return this.isResidentTax;
    }

    public void setIsResidentTax(Boolean isResidentTax) {
        this.isResidentTax = isResidentTax;
    }

    public Double getAmount() {
        return this.amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PaycheckPayTax)) {
            return false;
        }
        PaycheckPayTax other = (PaycheckPayTax)obj;
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
        boolean _equals = (this.line == null && other.getLine() == null || this.line != null && this.line.equals(other.getLine())) && (this.apply == null && other.getApply() == null || this.apply != null && this.apply.equals(other.getApply())) && (this.payTax == null && other.getPayTax() == null || this.payTax != null && this.payTax.equals(other.getPayTax())) && (this.payItem == null && other.getPayItem() == null || this.payItem != null && this.payItem.equals(other.getPayItem())) && (this.taxableWageBase == null && other.getTaxableWageBase() == null || this.taxableWageBase != null && this.taxableWageBase.equals(other.getTaxableWageBase())) && (this.taxedWageBase == null && other.getTaxedWageBase() == null || this.taxedWageBase != null && this.taxedWageBase.equals(other.getTaxedWageBase())) && (this.reportableWageBase == null && other.getReportableWageBase() == null || this.reportableWageBase != null && this.reportableWageBase.equals(other.getReportableWageBase())) && (this.isExempt == null && other.getIsExempt() == null || this.isExempt != null && this.isExempt.equals(other.getIsExempt())) && (this.isResidentTax == null && other.getIsResidentTax() == null || this.isResidentTax != null && this.isResidentTax.equals(other.getIsResidentTax())) && (this.amount == null && other.getAmount() == null || this.amount != null && this.amount.equals(other.getAmount()));
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
        if (this.getApply() != null) {
            _hashCode += this.getApply().hashCode();
        }
        if (this.getPayTax() != null) {
            _hashCode += this.getPayTax().hashCode();
        }
        if (this.getPayItem() != null) {
            _hashCode += this.getPayItem().hashCode();
        }
        if (this.getTaxableWageBase() != null) {
            _hashCode += this.getTaxableWageBase().hashCode();
        }
        if (this.getTaxedWageBase() != null) {
            _hashCode += this.getTaxedWageBase().hashCode();
        }
        if (this.getReportableWageBase() != null) {
            _hashCode += this.getReportableWageBase().hashCode();
        }
        if (this.getIsExempt() != null) {
            _hashCode += this.getIsExempt().hashCode();
        }
        if (this.getIsResidentTax() != null) {
            _hashCode += this.getIsResidentTax().hashCode();
        }
        if (this.getAmount() != null) {
            _hashCode += this.getAmount().hashCode();
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
        typeDesc.setXmlType(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "PaycheckPayTax"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("line");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "line"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("apply");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "apply"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("payTax");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "payTax"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("payItem");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "payItem"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxableWageBase");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "taxableWageBase"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxedWageBase");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "taxedWageBase"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("reportableWageBase");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "reportableWageBase"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isExempt");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "isExempt"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isResidentTax");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "isResidentTax"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "amount"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

