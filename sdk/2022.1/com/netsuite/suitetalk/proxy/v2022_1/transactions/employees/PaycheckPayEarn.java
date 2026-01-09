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

public class PaycheckPayEarn
implements Serializable {
    private RecordRef payItem;
    private Long line;
    private Double count;
    private String rate;
    private RecordRef serviceItem;
    private Double grossAmount;
    private Boolean manualEntry;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(PaycheckPayEarn.class, true);

    public PaycheckPayEarn() {
    }

    public PaycheckPayEarn(RecordRef payItem, Long line, Double count, String rate, RecordRef serviceItem, Double grossAmount, Boolean manualEntry) {
        this.payItem = payItem;
        this.line = line;
        this.count = count;
        this.rate = rate;
        this.serviceItem = serviceItem;
        this.grossAmount = grossAmount;
        this.manualEntry = manualEntry;
    }

    public RecordRef getPayItem() {
        return this.payItem;
    }

    public void setPayItem(RecordRef payItem) {
        this.payItem = payItem;
    }

    public Long getLine() {
        return this.line;
    }

    public void setLine(Long line) {
        this.line = line;
    }

    public Double getCount() {
        return this.count;
    }

    public void setCount(Double count) {
        this.count = count;
    }

    public String getRate() {
        return this.rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public RecordRef getServiceItem() {
        return this.serviceItem;
    }

    public void setServiceItem(RecordRef serviceItem) {
        this.serviceItem = serviceItem;
    }

    public Double getGrossAmount() {
        return this.grossAmount;
    }

    public void setGrossAmount(Double grossAmount) {
        this.grossAmount = grossAmount;
    }

    public Boolean getManualEntry() {
        return this.manualEntry;
    }

    public void setManualEntry(Boolean manualEntry) {
        this.manualEntry = manualEntry;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PaycheckPayEarn)) {
            return false;
        }
        PaycheckPayEarn other = (PaycheckPayEarn)obj;
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
        boolean _equals = (this.payItem == null && other.getPayItem() == null || this.payItem != null && this.payItem.equals(other.getPayItem())) && (this.line == null && other.getLine() == null || this.line != null && this.line.equals(other.getLine())) && (this.count == null && other.getCount() == null || this.count != null && this.count.equals(other.getCount())) && (this.rate == null && other.getRate() == null || this.rate != null && this.rate.equals(other.getRate())) && (this.serviceItem == null && other.getServiceItem() == null || this.serviceItem != null && this.serviceItem.equals(other.getServiceItem())) && (this.grossAmount == null && other.getGrossAmount() == null || this.grossAmount != null && this.grossAmount.equals(other.getGrossAmount())) && (this.manualEntry == null && other.getManualEntry() == null || this.manualEntry != null && this.manualEntry.equals(other.getManualEntry()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getPayItem() != null) {
            _hashCode += this.getPayItem().hashCode();
        }
        if (this.getLine() != null) {
            _hashCode += this.getLine().hashCode();
        }
        if (this.getCount() != null) {
            _hashCode += this.getCount().hashCode();
        }
        if (this.getRate() != null) {
            _hashCode += this.getRate().hashCode();
        }
        if (this.getServiceItem() != null) {
            _hashCode += this.getServiceItem().hashCode();
        }
        if (this.getGrossAmount() != null) {
            _hashCode += this.getGrossAmount().hashCode();
        }
        if (this.getManualEntry() != null) {
            _hashCode += this.getManualEntry().hashCode();
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
        typeDesc.setXmlType(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "PaycheckPayEarn"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("payItem");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "payItem"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("count");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "count"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("rate");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "rate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("serviceItem");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "serviceItem"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("grossAmount");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "grossAmount"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("manualEntry");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "manualEntry"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

