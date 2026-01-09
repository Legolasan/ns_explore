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

public class PaycheckPayExp
implements Serializable {
    private Boolean apply;
    private Long line;
    private Long origDoc;
    private String transaction;
    private Double amount;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(PaycheckPayExp.class, true);

    public PaycheckPayExp() {
    }

    public PaycheckPayExp(Boolean apply, Long line, Long origDoc, String transaction, Double amount) {
        this.apply = apply;
        this.line = line;
        this.origDoc = origDoc;
        this.transaction = transaction;
        this.amount = amount;
    }

    public Boolean getApply() {
        return this.apply;
    }

    public void setApply(Boolean apply) {
        this.apply = apply;
    }

    public Long getLine() {
        return this.line;
    }

    public void setLine(Long line) {
        this.line = line;
    }

    public Long getOrigDoc() {
        return this.origDoc;
    }

    public void setOrigDoc(Long origDoc) {
        this.origDoc = origDoc;
    }

    public String getTransaction() {
        return this.transaction;
    }

    public void setTransaction(String transaction) {
        this.transaction = transaction;
    }

    public Double getAmount() {
        return this.amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PaycheckPayExp)) {
            return false;
        }
        PaycheckPayExp other = (PaycheckPayExp)obj;
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
        boolean _equals = (this.apply == null && other.getApply() == null || this.apply != null && this.apply.equals(other.getApply())) && (this.line == null && other.getLine() == null || this.line != null && this.line.equals(other.getLine())) && (this.origDoc == null && other.getOrigDoc() == null || this.origDoc != null && this.origDoc.equals(other.getOrigDoc())) && (this.transaction == null && other.getTransaction() == null || this.transaction != null && this.transaction.equals(other.getTransaction())) && (this.amount == null && other.getAmount() == null || this.amount != null && this.amount.equals(other.getAmount()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getApply() != null) {
            _hashCode += this.getApply().hashCode();
        }
        if (this.getLine() != null) {
            _hashCode += this.getLine().hashCode();
        }
        if (this.getOrigDoc() != null) {
            _hashCode += this.getOrigDoc().hashCode();
        }
        if (this.getTransaction() != null) {
            _hashCode += this.getTransaction().hashCode();
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
        typeDesc.setXmlType(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "PaycheckPayExp"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("apply");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "apply"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("line");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "line"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("origDoc");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "origDoc"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("transaction");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "transaction"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
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

