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
package com.netsuite.suitetalk.proxy.v2022_1.lists.accounting;

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

public class ItemVendor
implements Serializable {
    private RecordRef vendor;
    private String vendorCode;
    private String vendorCurrencyName;
    private RecordRef vendorCurrency;
    private Double purchasePrice;
    private Boolean preferredVendor;
    private RecordRef schedule;
    private RecordRef subsidiary;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(ItemVendor.class, true);

    public ItemVendor() {
    }

    public ItemVendor(RecordRef vendor, String vendorCode, String vendorCurrencyName, RecordRef vendorCurrency, Double purchasePrice, Boolean preferredVendor, RecordRef schedule, RecordRef subsidiary) {
        this.vendor = vendor;
        this.vendorCode = vendorCode;
        this.vendorCurrencyName = vendorCurrencyName;
        this.vendorCurrency = vendorCurrency;
        this.purchasePrice = purchasePrice;
        this.preferredVendor = preferredVendor;
        this.schedule = schedule;
        this.subsidiary = subsidiary;
    }

    public RecordRef getVendor() {
        return this.vendor;
    }

    public void setVendor(RecordRef vendor) {
        this.vendor = vendor;
    }

    public String getVendorCode() {
        return this.vendorCode;
    }

    public void setVendorCode(String vendorCode) {
        this.vendorCode = vendorCode;
    }

    public String getVendorCurrencyName() {
        return this.vendorCurrencyName;
    }

    public void setVendorCurrencyName(String vendorCurrencyName) {
        this.vendorCurrencyName = vendorCurrencyName;
    }

    public RecordRef getVendorCurrency() {
        return this.vendorCurrency;
    }

    public void setVendorCurrency(RecordRef vendorCurrency) {
        this.vendorCurrency = vendorCurrency;
    }

    public Double getPurchasePrice() {
        return this.purchasePrice;
    }

    public void setPurchasePrice(Double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Boolean getPreferredVendor() {
        return this.preferredVendor;
    }

    public void setPreferredVendor(Boolean preferredVendor) {
        this.preferredVendor = preferredVendor;
    }

    public RecordRef getSchedule() {
        return this.schedule;
    }

    public void setSchedule(RecordRef schedule) {
        this.schedule = schedule;
    }

    public RecordRef getSubsidiary() {
        return this.subsidiary;
    }

    public void setSubsidiary(RecordRef subsidiary) {
        this.subsidiary = subsidiary;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ItemVendor)) {
            return false;
        }
        ItemVendor other = (ItemVendor)obj;
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
        boolean _equals = (this.vendor == null && other.getVendor() == null || this.vendor != null && this.vendor.equals(other.getVendor())) && (this.vendorCode == null && other.getVendorCode() == null || this.vendorCode != null && this.vendorCode.equals(other.getVendorCode())) && (this.vendorCurrencyName == null && other.getVendorCurrencyName() == null || this.vendorCurrencyName != null && this.vendorCurrencyName.equals(other.getVendorCurrencyName())) && (this.vendorCurrency == null && other.getVendorCurrency() == null || this.vendorCurrency != null && this.vendorCurrency.equals(other.getVendorCurrency())) && (this.purchasePrice == null && other.getPurchasePrice() == null || this.purchasePrice != null && this.purchasePrice.equals(other.getPurchasePrice())) && (this.preferredVendor == null && other.getPreferredVendor() == null || this.preferredVendor != null && this.preferredVendor.equals(other.getPreferredVendor())) && (this.schedule == null && other.getSchedule() == null || this.schedule != null && this.schedule.equals(other.getSchedule())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && this.subsidiary.equals(other.getSubsidiary()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getVendor() != null) {
            _hashCode += this.getVendor().hashCode();
        }
        if (this.getVendorCode() != null) {
            _hashCode += this.getVendorCode().hashCode();
        }
        if (this.getVendorCurrencyName() != null) {
            _hashCode += this.getVendorCurrencyName().hashCode();
        }
        if (this.getVendorCurrency() != null) {
            _hashCode += this.getVendorCurrency().hashCode();
        }
        if (this.getPurchasePrice() != null) {
            _hashCode += this.getPurchasePrice().hashCode();
        }
        if (this.getPreferredVendor() != null) {
            _hashCode += this.getPreferredVendor().hashCode();
        }
        if (this.getSchedule() != null) {
            _hashCode += this.getSchedule().hashCode();
        }
        if (this.getSubsidiary() != null) {
            _hashCode += this.getSubsidiary().hashCode();
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
        typeDesc.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "ItemVendor"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("vendor");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "vendor"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vendorCode");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "vendorCode"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vendorCurrencyName");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "vendorCurrencyName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vendorCurrency");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "vendorCurrency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("purchasePrice");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "purchasePrice"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("preferredVendor");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "preferredVendor"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("schedule");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "schedule"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

