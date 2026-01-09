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

public class PaycheckPayDisburse
implements Serializable {
    private String method;
    private String bankName;
    private String bankAccountDecrypt;
    private String statusName;
    private Double amount;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(PaycheckPayDisburse.class, true);

    public PaycheckPayDisburse() {
    }

    public PaycheckPayDisburse(String method, String bankName, String bankAccountDecrypt, String statusName, Double amount) {
        this.method = method;
        this.bankName = bankName;
        this.bankAccountDecrypt = bankAccountDecrypt;
        this.statusName = statusName;
        this.amount = amount;
    }

    public String getMethod() {
        return this.method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getBankName() {
        return this.bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getBankAccountDecrypt() {
        return this.bankAccountDecrypt;
    }

    public void setBankAccountDecrypt(String bankAccountDecrypt) {
        this.bankAccountDecrypt = bankAccountDecrypt;
    }

    public String getStatusName() {
        return this.statusName;
    }

    public void setStatusName(String statusName) {
        this.statusName = statusName;
    }

    public Double getAmount() {
        return this.amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PaycheckPayDisburse)) {
            return false;
        }
        PaycheckPayDisburse other = (PaycheckPayDisburse)obj;
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
        boolean _equals = (this.method == null && other.getMethod() == null || this.method != null && this.method.equals(other.getMethod())) && (this.bankName == null && other.getBankName() == null || this.bankName != null && this.bankName.equals(other.getBankName())) && (this.bankAccountDecrypt == null && other.getBankAccountDecrypt() == null || this.bankAccountDecrypt != null && this.bankAccountDecrypt.equals(other.getBankAccountDecrypt())) && (this.statusName == null && other.getStatusName() == null || this.statusName != null && this.statusName.equals(other.getStatusName())) && (this.amount == null && other.getAmount() == null || this.amount != null && this.amount.equals(other.getAmount()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getMethod() != null) {
            _hashCode += this.getMethod().hashCode();
        }
        if (this.getBankName() != null) {
            _hashCode += this.getBankName().hashCode();
        }
        if (this.getBankAccountDecrypt() != null) {
            _hashCode += this.getBankAccountDecrypt().hashCode();
        }
        if (this.getStatusName() != null) {
            _hashCode += this.getStatusName().hashCode();
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
        typeDesc.setXmlType(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "PaycheckPayDisburse"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("method");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "method"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("bankName");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "bankName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("bankAccountDecrypt");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "bankAccountDecrypt"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("statusName");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "statusName"));
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

