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
package com.netsuite.suitetalk.proxy.v2022_1.platform.common;

import com.netsuite.suitetalk.proxy.v2022_1.platform.common.types.LandedCostSource;
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

public class LandedCostSummary
implements Serializable {
    private RecordRef category;
    private Double amount;
    private LandedCostSource source;
    private RecordRef transaction;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(LandedCostSummary.class, true);

    public LandedCostSummary() {
    }

    public LandedCostSummary(RecordRef category, Double amount, LandedCostSource source, RecordRef transaction) {
        this.category = category;
        this.amount = amount;
        this.source = source;
        this.transaction = transaction;
    }

    public RecordRef getCategory() {
        return this.category;
    }

    public void setCategory(RecordRef category) {
        this.category = category;
    }

    public Double getAmount() {
        return this.amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public LandedCostSource getSource() {
        return this.source;
    }

    public void setSource(LandedCostSource source) {
        this.source = source;
    }

    public RecordRef getTransaction() {
        return this.transaction;
    }

    public void setTransaction(RecordRef transaction) {
        this.transaction = transaction;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof LandedCostSummary)) {
            return false;
        }
        LandedCostSummary other = (LandedCostSummary)obj;
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
        boolean _equals = (this.category == null && other.getCategory() == null || this.category != null && this.category.equals(other.getCategory())) && (this.amount == null && other.getAmount() == null || this.amount != null && this.amount.equals(other.getAmount())) && (this.source == null && other.getSource() == null || this.source != null && this.source.equals(other.getSource())) && (this.transaction == null && other.getTransaction() == null || this.transaction != null && this.transaction.equals(other.getTransaction()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getCategory() != null) {
            _hashCode += this.getCategory().hashCode();
        }
        if (this.getAmount() != null) {
            _hashCode += this.getAmount().hashCode();
        }
        if (this.getSource() != null) {
            _hashCode += this.getSource().hashCode();
        }
        if (this.getTransaction() != null) {
            _hashCode += this.getTransaction().hashCode();
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "LandedCostSummary"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "category"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "amount"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "source"));
        elemField.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "LandedCostSource"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("transaction");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "transaction"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

