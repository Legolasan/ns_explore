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
import com.netsuite.suitetalk.proxy.v2022_1.transactions.purchases.types.InboundShipmentLandedCostAllocationMethod;
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

public class InboundShipmentLandedCost
implements Serializable {
    private RecordRef landedCostCostCategory;
    private Double landedCostAmount;
    private RecordRef landedCostCurrency;
    private Double landedCostExchangeRate;
    private Calendar landedCostEffectiveDate;
    private InboundShipmentLandedCostAllocationMethod landedCostAllocationMethod;
    private RecordRefList landedCostShipmentItemsList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(InboundShipmentLandedCost.class, true);

    public InboundShipmentLandedCost() {
    }

    public InboundShipmentLandedCost(RecordRef landedCostCostCategory, Double landedCostAmount, RecordRef landedCostCurrency, Double landedCostExchangeRate, Calendar landedCostEffectiveDate, InboundShipmentLandedCostAllocationMethod landedCostAllocationMethod, RecordRefList landedCostShipmentItemsList) {
        this.landedCostCostCategory = landedCostCostCategory;
        this.landedCostAmount = landedCostAmount;
        this.landedCostCurrency = landedCostCurrency;
        this.landedCostExchangeRate = landedCostExchangeRate;
        this.landedCostEffectiveDate = landedCostEffectiveDate;
        this.landedCostAllocationMethod = landedCostAllocationMethod;
        this.landedCostShipmentItemsList = landedCostShipmentItemsList;
    }

    public RecordRef getLandedCostCostCategory() {
        return this.landedCostCostCategory;
    }

    public void setLandedCostCostCategory(RecordRef landedCostCostCategory) {
        this.landedCostCostCategory = landedCostCostCategory;
    }

    public Double getLandedCostAmount() {
        return this.landedCostAmount;
    }

    public void setLandedCostAmount(Double landedCostAmount) {
        this.landedCostAmount = landedCostAmount;
    }

    public RecordRef getLandedCostCurrency() {
        return this.landedCostCurrency;
    }

    public void setLandedCostCurrency(RecordRef landedCostCurrency) {
        this.landedCostCurrency = landedCostCurrency;
    }

    public Double getLandedCostExchangeRate() {
        return this.landedCostExchangeRate;
    }

    public void setLandedCostExchangeRate(Double landedCostExchangeRate) {
        this.landedCostExchangeRate = landedCostExchangeRate;
    }

    public Calendar getLandedCostEffectiveDate() {
        return this.landedCostEffectiveDate;
    }

    public void setLandedCostEffectiveDate(Calendar landedCostEffectiveDate) {
        this.landedCostEffectiveDate = landedCostEffectiveDate;
    }

    public InboundShipmentLandedCostAllocationMethod getLandedCostAllocationMethod() {
        return this.landedCostAllocationMethod;
    }

    public void setLandedCostAllocationMethod(InboundShipmentLandedCostAllocationMethod landedCostAllocationMethod) {
        this.landedCostAllocationMethod = landedCostAllocationMethod;
    }

    public RecordRefList getLandedCostShipmentItemsList() {
        return this.landedCostShipmentItemsList;
    }

    public void setLandedCostShipmentItemsList(RecordRefList landedCostShipmentItemsList) {
        this.landedCostShipmentItemsList = landedCostShipmentItemsList;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof InboundShipmentLandedCost)) {
            return false;
        }
        InboundShipmentLandedCost other = (InboundShipmentLandedCost)obj;
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
        boolean _equals = (this.landedCostCostCategory == null && other.getLandedCostCostCategory() == null || this.landedCostCostCategory != null && this.landedCostCostCategory.equals(other.getLandedCostCostCategory())) && (this.landedCostAmount == null && other.getLandedCostAmount() == null || this.landedCostAmount != null && this.landedCostAmount.equals(other.getLandedCostAmount())) && (this.landedCostCurrency == null && other.getLandedCostCurrency() == null || this.landedCostCurrency != null && this.landedCostCurrency.equals(other.getLandedCostCurrency())) && (this.landedCostExchangeRate == null && other.getLandedCostExchangeRate() == null || this.landedCostExchangeRate != null && this.landedCostExchangeRate.equals(other.getLandedCostExchangeRate())) && (this.landedCostEffectiveDate == null && other.getLandedCostEffectiveDate() == null || this.landedCostEffectiveDate != null && this.landedCostEffectiveDate.equals(other.getLandedCostEffectiveDate())) && (this.landedCostAllocationMethod == null && other.getLandedCostAllocationMethod() == null || this.landedCostAllocationMethod != null && this.landedCostAllocationMethod.equals(other.getLandedCostAllocationMethod())) && (this.landedCostShipmentItemsList == null && other.getLandedCostShipmentItemsList() == null || this.landedCostShipmentItemsList != null && this.landedCostShipmentItemsList.equals(other.getLandedCostShipmentItemsList()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getLandedCostCostCategory() != null) {
            _hashCode += this.getLandedCostCostCategory().hashCode();
        }
        if (this.getLandedCostAmount() != null) {
            _hashCode += this.getLandedCostAmount().hashCode();
        }
        if (this.getLandedCostCurrency() != null) {
            _hashCode += this.getLandedCostCurrency().hashCode();
        }
        if (this.getLandedCostExchangeRate() != null) {
            _hashCode += this.getLandedCostExchangeRate().hashCode();
        }
        if (this.getLandedCostEffectiveDate() != null) {
            _hashCode += this.getLandedCostEffectiveDate().hashCode();
        }
        if (this.getLandedCostAllocationMethod() != null) {
            _hashCode += this.getLandedCostAllocationMethod().hashCode();
        }
        if (this.getLandedCostShipmentItemsList() != null) {
            _hashCode += this.getLandedCostShipmentItemsList().hashCode();
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
        typeDesc.setXmlType(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "InboundShipmentLandedCost"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("landedCostCostCategory");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "landedCostCostCategory"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("landedCostAmount");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "landedCostAmount"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("landedCostCurrency");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "landedCostCurrency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("landedCostExchangeRate");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "landedCostExchangeRate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("landedCostEffectiveDate");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "landedCostEffectiveDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("landedCostAllocationMethod");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "landedCostAllocationMethod"));
        elemField.setXmlType(new QName("urn:types.purchases_2022_1.transactions.webservices.netsuite.com", "InboundShipmentLandedCostAllocationMethod"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("landedCostShipmentItemsList");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "landedCostShipmentItemsList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRefList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

