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
package com.netsuite.suitetalk.proxy.v2022_1.transactions.sales;

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

public class TransactionShipGroup
implements Serializable {
    private Long id;
    private Boolean isFulfilled;
    private Double weight;
    private RecordRef sourceAddressRef;
    private String sourceAddress;
    private RecordRef destinationAddressRef;
    private String destinationAddress;
    private RecordRef shippingMethodRef;
    private String shippingMethod;
    private Boolean isHandlingTaxable;
    private RecordRef handlingTaxCode;
    private String handlingTaxRate;
    private String handlingTax2Rate;
    private Double handlingRate;
    private Double handlingTaxAmt;
    private Double handlingTax2Amt;
    private Boolean isShippingTaxable;
    private RecordRef shippingTaxCode;
    private String shippingTaxRate;
    private String shippingTax2Rate;
    private Double shippingRate;
    private Double shippingTaxAmt;
    private Double shippingTax2Amt;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(TransactionShipGroup.class, true);

    public TransactionShipGroup() {
    }

    public TransactionShipGroup(Long id, Boolean isFulfilled, Double weight, RecordRef sourceAddressRef, String sourceAddress, RecordRef destinationAddressRef, String destinationAddress, RecordRef shippingMethodRef, String shippingMethod, Boolean isHandlingTaxable, RecordRef handlingTaxCode, String handlingTaxRate, String handlingTax2Rate, Double handlingRate, Double handlingTaxAmt, Double handlingTax2Amt, Boolean isShippingTaxable, RecordRef shippingTaxCode, String shippingTaxRate, String shippingTax2Rate, Double shippingRate, Double shippingTaxAmt, Double shippingTax2Amt) {
        this.id = id;
        this.isFulfilled = isFulfilled;
        this.weight = weight;
        this.sourceAddressRef = sourceAddressRef;
        this.sourceAddress = sourceAddress;
        this.destinationAddressRef = destinationAddressRef;
        this.destinationAddress = destinationAddress;
        this.shippingMethodRef = shippingMethodRef;
        this.shippingMethod = shippingMethod;
        this.isHandlingTaxable = isHandlingTaxable;
        this.handlingTaxCode = handlingTaxCode;
        this.handlingTaxRate = handlingTaxRate;
        this.handlingTax2Rate = handlingTax2Rate;
        this.handlingRate = handlingRate;
        this.handlingTaxAmt = handlingTaxAmt;
        this.handlingTax2Amt = handlingTax2Amt;
        this.isShippingTaxable = isShippingTaxable;
        this.shippingTaxCode = shippingTaxCode;
        this.shippingTaxRate = shippingTaxRate;
        this.shippingTax2Rate = shippingTax2Rate;
        this.shippingRate = shippingRate;
        this.shippingTaxAmt = shippingTaxAmt;
        this.shippingTax2Amt = shippingTax2Amt;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getIsFulfilled() {
        return this.isFulfilled;
    }

    public void setIsFulfilled(Boolean isFulfilled) {
        this.isFulfilled = isFulfilled;
    }

    public Double getWeight() {
        return this.weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public RecordRef getSourceAddressRef() {
        return this.sourceAddressRef;
    }

    public void setSourceAddressRef(RecordRef sourceAddressRef) {
        this.sourceAddressRef = sourceAddressRef;
    }

    public String getSourceAddress() {
        return this.sourceAddress;
    }

    public void setSourceAddress(String sourceAddress) {
        this.sourceAddress = sourceAddress;
    }

    public RecordRef getDestinationAddressRef() {
        return this.destinationAddressRef;
    }

    public void setDestinationAddressRef(RecordRef destinationAddressRef) {
        this.destinationAddressRef = destinationAddressRef;
    }

    public String getDestinationAddress() {
        return this.destinationAddress;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public RecordRef getShippingMethodRef() {
        return this.shippingMethodRef;
    }

    public void setShippingMethodRef(RecordRef shippingMethodRef) {
        this.shippingMethodRef = shippingMethodRef;
    }

    public String getShippingMethod() {
        return this.shippingMethod;
    }

    public void setShippingMethod(String shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    public Boolean getIsHandlingTaxable() {
        return this.isHandlingTaxable;
    }

    public void setIsHandlingTaxable(Boolean isHandlingTaxable) {
        this.isHandlingTaxable = isHandlingTaxable;
    }

    public RecordRef getHandlingTaxCode() {
        return this.handlingTaxCode;
    }

    public void setHandlingTaxCode(RecordRef handlingTaxCode) {
        this.handlingTaxCode = handlingTaxCode;
    }

    public String getHandlingTaxRate() {
        return this.handlingTaxRate;
    }

    public void setHandlingTaxRate(String handlingTaxRate) {
        this.handlingTaxRate = handlingTaxRate;
    }

    public String getHandlingTax2Rate() {
        return this.handlingTax2Rate;
    }

    public void setHandlingTax2Rate(String handlingTax2Rate) {
        this.handlingTax2Rate = handlingTax2Rate;
    }

    public Double getHandlingRate() {
        return this.handlingRate;
    }

    public void setHandlingRate(Double handlingRate) {
        this.handlingRate = handlingRate;
    }

    public Double getHandlingTaxAmt() {
        return this.handlingTaxAmt;
    }

    public void setHandlingTaxAmt(Double handlingTaxAmt) {
        this.handlingTaxAmt = handlingTaxAmt;
    }

    public Double getHandlingTax2Amt() {
        return this.handlingTax2Amt;
    }

    public void setHandlingTax2Amt(Double handlingTax2Amt) {
        this.handlingTax2Amt = handlingTax2Amt;
    }

    public Boolean getIsShippingTaxable() {
        return this.isShippingTaxable;
    }

    public void setIsShippingTaxable(Boolean isShippingTaxable) {
        this.isShippingTaxable = isShippingTaxable;
    }

    public RecordRef getShippingTaxCode() {
        return this.shippingTaxCode;
    }

    public void setShippingTaxCode(RecordRef shippingTaxCode) {
        this.shippingTaxCode = shippingTaxCode;
    }

    public String getShippingTaxRate() {
        return this.shippingTaxRate;
    }

    public void setShippingTaxRate(String shippingTaxRate) {
        this.shippingTaxRate = shippingTaxRate;
    }

    public String getShippingTax2Rate() {
        return this.shippingTax2Rate;
    }

    public void setShippingTax2Rate(String shippingTax2Rate) {
        this.shippingTax2Rate = shippingTax2Rate;
    }

    public Double getShippingRate() {
        return this.shippingRate;
    }

    public void setShippingRate(Double shippingRate) {
        this.shippingRate = shippingRate;
    }

    public Double getShippingTaxAmt() {
        return this.shippingTaxAmt;
    }

    public void setShippingTaxAmt(Double shippingTaxAmt) {
        this.shippingTaxAmt = shippingTaxAmt;
    }

    public Double getShippingTax2Amt() {
        return this.shippingTax2Amt;
    }

    public void setShippingTax2Amt(Double shippingTax2Amt) {
        this.shippingTax2Amt = shippingTax2Amt;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TransactionShipGroup)) {
            return false;
        }
        TransactionShipGroup other = (TransactionShipGroup)obj;
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
        boolean _equals = (this.id == null && other.getId() == null || this.id != null && this.id.equals(other.getId())) && (this.isFulfilled == null && other.getIsFulfilled() == null || this.isFulfilled != null && this.isFulfilled.equals(other.getIsFulfilled())) && (this.weight == null && other.getWeight() == null || this.weight != null && this.weight.equals(other.getWeight())) && (this.sourceAddressRef == null && other.getSourceAddressRef() == null || this.sourceAddressRef != null && this.sourceAddressRef.equals(other.getSourceAddressRef())) && (this.sourceAddress == null && other.getSourceAddress() == null || this.sourceAddress != null && this.sourceAddress.equals(other.getSourceAddress())) && (this.destinationAddressRef == null && other.getDestinationAddressRef() == null || this.destinationAddressRef != null && this.destinationAddressRef.equals(other.getDestinationAddressRef())) && (this.destinationAddress == null && other.getDestinationAddress() == null || this.destinationAddress != null && this.destinationAddress.equals(other.getDestinationAddress())) && (this.shippingMethodRef == null && other.getShippingMethodRef() == null || this.shippingMethodRef != null && this.shippingMethodRef.equals(other.getShippingMethodRef())) && (this.shippingMethod == null && other.getShippingMethod() == null || this.shippingMethod != null && this.shippingMethod.equals(other.getShippingMethod())) && (this.isHandlingTaxable == null && other.getIsHandlingTaxable() == null || this.isHandlingTaxable != null && this.isHandlingTaxable.equals(other.getIsHandlingTaxable())) && (this.handlingTaxCode == null && other.getHandlingTaxCode() == null || this.handlingTaxCode != null && this.handlingTaxCode.equals(other.getHandlingTaxCode())) && (this.handlingTaxRate == null && other.getHandlingTaxRate() == null || this.handlingTaxRate != null && this.handlingTaxRate.equals(other.getHandlingTaxRate())) && (this.handlingTax2Rate == null && other.getHandlingTax2Rate() == null || this.handlingTax2Rate != null && this.handlingTax2Rate.equals(other.getHandlingTax2Rate())) && (this.handlingRate == null && other.getHandlingRate() == null || this.handlingRate != null && this.handlingRate.equals(other.getHandlingRate())) && (this.handlingTaxAmt == null && other.getHandlingTaxAmt() == null || this.handlingTaxAmt != null && this.handlingTaxAmt.equals(other.getHandlingTaxAmt())) && (this.handlingTax2Amt == null && other.getHandlingTax2Amt() == null || this.handlingTax2Amt != null && this.handlingTax2Amt.equals(other.getHandlingTax2Amt())) && (this.isShippingTaxable == null && other.getIsShippingTaxable() == null || this.isShippingTaxable != null && this.isShippingTaxable.equals(other.getIsShippingTaxable())) && (this.shippingTaxCode == null && other.getShippingTaxCode() == null || this.shippingTaxCode != null && this.shippingTaxCode.equals(other.getShippingTaxCode())) && (this.shippingTaxRate == null && other.getShippingTaxRate() == null || this.shippingTaxRate != null && this.shippingTaxRate.equals(other.getShippingTaxRate())) && (this.shippingTax2Rate == null && other.getShippingTax2Rate() == null || this.shippingTax2Rate != null && this.shippingTax2Rate.equals(other.getShippingTax2Rate())) && (this.shippingRate == null && other.getShippingRate() == null || this.shippingRate != null && this.shippingRate.equals(other.getShippingRate())) && (this.shippingTaxAmt == null && other.getShippingTaxAmt() == null || this.shippingTaxAmt != null && this.shippingTaxAmt.equals(other.getShippingTaxAmt())) && (this.shippingTax2Amt == null && other.getShippingTax2Amt() == null || this.shippingTax2Amt != null && this.shippingTax2Amt.equals(other.getShippingTax2Amt()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getId() != null) {
            _hashCode += this.getId().hashCode();
        }
        if (this.getIsFulfilled() != null) {
            _hashCode += this.getIsFulfilled().hashCode();
        }
        if (this.getWeight() != null) {
            _hashCode += this.getWeight().hashCode();
        }
        if (this.getSourceAddressRef() != null) {
            _hashCode += this.getSourceAddressRef().hashCode();
        }
        if (this.getSourceAddress() != null) {
            _hashCode += this.getSourceAddress().hashCode();
        }
        if (this.getDestinationAddressRef() != null) {
            _hashCode += this.getDestinationAddressRef().hashCode();
        }
        if (this.getDestinationAddress() != null) {
            _hashCode += this.getDestinationAddress().hashCode();
        }
        if (this.getShippingMethodRef() != null) {
            _hashCode += this.getShippingMethodRef().hashCode();
        }
        if (this.getShippingMethod() != null) {
            _hashCode += this.getShippingMethod().hashCode();
        }
        if (this.getIsHandlingTaxable() != null) {
            _hashCode += this.getIsHandlingTaxable().hashCode();
        }
        if (this.getHandlingTaxCode() != null) {
            _hashCode += this.getHandlingTaxCode().hashCode();
        }
        if (this.getHandlingTaxRate() != null) {
            _hashCode += this.getHandlingTaxRate().hashCode();
        }
        if (this.getHandlingTax2Rate() != null) {
            _hashCode += this.getHandlingTax2Rate().hashCode();
        }
        if (this.getHandlingRate() != null) {
            _hashCode += this.getHandlingRate().hashCode();
        }
        if (this.getHandlingTaxAmt() != null) {
            _hashCode += this.getHandlingTaxAmt().hashCode();
        }
        if (this.getHandlingTax2Amt() != null) {
            _hashCode += this.getHandlingTax2Amt().hashCode();
        }
        if (this.getIsShippingTaxable() != null) {
            _hashCode += this.getIsShippingTaxable().hashCode();
        }
        if (this.getShippingTaxCode() != null) {
            _hashCode += this.getShippingTaxCode().hashCode();
        }
        if (this.getShippingTaxRate() != null) {
            _hashCode += this.getShippingTaxRate().hashCode();
        }
        if (this.getShippingTax2Rate() != null) {
            _hashCode += this.getShippingTax2Rate().hashCode();
        }
        if (this.getShippingRate() != null) {
            _hashCode += this.getShippingRate().hashCode();
        }
        if (this.getShippingTaxAmt() != null) {
            _hashCode += this.getShippingTaxAmt().hashCode();
        }
        if (this.getShippingTax2Amt() != null) {
            _hashCode += this.getShippingTax2Amt().hashCode();
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
        typeDesc.setXmlType(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "TransactionShipGroup"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "id"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isFulfilled");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "isFulfilled"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("weight");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "weight"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("sourceAddressRef");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "sourceAddressRef"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("sourceAddress");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "sourceAddress"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("destinationAddressRef");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "destinationAddressRef"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("destinationAddress");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "destinationAddress"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shippingMethodRef");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "shippingMethodRef"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shippingMethod");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "shippingMethod"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isHandlingTaxable");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "isHandlingTaxable"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("handlingTaxCode");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "handlingTaxCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("handlingTaxRate");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "handlingTaxRate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("handlingTax2Rate");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "handlingTax2Rate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("handlingRate");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "handlingRate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("handlingTaxAmt");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "handlingTaxAmt"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("handlingTax2Amt");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "handlingTax2Amt"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isShippingTaxable");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "isShippingTaxable"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shippingTaxCode");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "shippingTaxCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shippingTaxRate");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "shippingTaxRate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shippingTax2Rate");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "shippingTax2Rate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shippingRate");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "shippingRate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shippingTaxAmt");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "shippingTaxAmt"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shippingTax2Amt");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "shippingTax2Amt"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

