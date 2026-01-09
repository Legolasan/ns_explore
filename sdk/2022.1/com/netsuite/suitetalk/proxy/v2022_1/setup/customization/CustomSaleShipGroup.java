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
package com.netsuite.suitetalk.proxy.v2022_1.setup.customization;

import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class CustomSaleShipGroup
implements Serializable {
    private String sourceAddress;
    private String destinationAddress;
    private String shippingMethod;
    private Double shippingRate;
    private Double handlingRate;
    private Long id;
    private String isFulfilled;
    private Double weight;
    private String sourceAddressRef;
    private String destinationAddressRef;
    private String shippingMethodRef;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(CustomSaleShipGroup.class, true);

    public CustomSaleShipGroup() {
    }

    public CustomSaleShipGroup(String sourceAddress, String destinationAddress, String shippingMethod, Double shippingRate, Double handlingRate, Long id, String isFulfilled, Double weight, String sourceAddressRef, String destinationAddressRef, String shippingMethodRef) {
        this.sourceAddress = sourceAddress;
        this.destinationAddress = destinationAddress;
        this.shippingMethod = shippingMethod;
        this.shippingRate = shippingRate;
        this.handlingRate = handlingRate;
        this.id = id;
        this.isFulfilled = isFulfilled;
        this.weight = weight;
        this.sourceAddressRef = sourceAddressRef;
        this.destinationAddressRef = destinationAddressRef;
        this.shippingMethodRef = shippingMethodRef;
    }

    public String getSourceAddress() {
        return this.sourceAddress;
    }

    public void setSourceAddress(String sourceAddress) {
        this.sourceAddress = sourceAddress;
    }

    public String getDestinationAddress() {
        return this.destinationAddress;
    }

    public void setDestinationAddress(String destinationAddress) {
        this.destinationAddress = destinationAddress;
    }

    public String getShippingMethod() {
        return this.shippingMethod;
    }

    public void setShippingMethod(String shippingMethod) {
        this.shippingMethod = shippingMethod;
    }

    public Double getShippingRate() {
        return this.shippingRate;
    }

    public void setShippingRate(Double shippingRate) {
        this.shippingRate = shippingRate;
    }

    public Double getHandlingRate() {
        return this.handlingRate;
    }

    public void setHandlingRate(Double handlingRate) {
        this.handlingRate = handlingRate;
    }

    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getIsFulfilled() {
        return this.isFulfilled;
    }

    public void setIsFulfilled(String isFulfilled) {
        this.isFulfilled = isFulfilled;
    }

    public Double getWeight() {
        return this.weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getSourceAddressRef() {
        return this.sourceAddressRef;
    }

    public void setSourceAddressRef(String sourceAddressRef) {
        this.sourceAddressRef = sourceAddressRef;
    }

    public String getDestinationAddressRef() {
        return this.destinationAddressRef;
    }

    public void setDestinationAddressRef(String destinationAddressRef) {
        this.destinationAddressRef = destinationAddressRef;
    }

    public String getShippingMethodRef() {
        return this.shippingMethodRef;
    }

    public void setShippingMethodRef(String shippingMethodRef) {
        this.shippingMethodRef = shippingMethodRef;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CustomSaleShipGroup)) {
            return false;
        }
        CustomSaleShipGroup other = (CustomSaleShipGroup)obj;
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
        boolean _equals = (this.sourceAddress == null && other.getSourceAddress() == null || this.sourceAddress != null && this.sourceAddress.equals(other.getSourceAddress())) && (this.destinationAddress == null && other.getDestinationAddress() == null || this.destinationAddress != null && this.destinationAddress.equals(other.getDestinationAddress())) && (this.shippingMethod == null && other.getShippingMethod() == null || this.shippingMethod != null && this.shippingMethod.equals(other.getShippingMethod())) && (this.shippingRate == null && other.getShippingRate() == null || this.shippingRate != null && this.shippingRate.equals(other.getShippingRate())) && (this.handlingRate == null && other.getHandlingRate() == null || this.handlingRate != null && this.handlingRate.equals(other.getHandlingRate())) && (this.id == null && other.getId() == null || this.id != null && this.id.equals(other.getId())) && (this.isFulfilled == null && other.getIsFulfilled() == null || this.isFulfilled != null && this.isFulfilled.equals(other.getIsFulfilled())) && (this.weight == null && other.getWeight() == null || this.weight != null && this.weight.equals(other.getWeight())) && (this.sourceAddressRef == null && other.getSourceAddressRef() == null || this.sourceAddressRef != null && this.sourceAddressRef.equals(other.getSourceAddressRef())) && (this.destinationAddressRef == null && other.getDestinationAddressRef() == null || this.destinationAddressRef != null && this.destinationAddressRef.equals(other.getDestinationAddressRef())) && (this.shippingMethodRef == null && other.getShippingMethodRef() == null || this.shippingMethodRef != null && this.shippingMethodRef.equals(other.getShippingMethodRef()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getSourceAddress() != null) {
            _hashCode += this.getSourceAddress().hashCode();
        }
        if (this.getDestinationAddress() != null) {
            _hashCode += this.getDestinationAddress().hashCode();
        }
        if (this.getShippingMethod() != null) {
            _hashCode += this.getShippingMethod().hashCode();
        }
        if (this.getShippingRate() != null) {
            _hashCode += this.getShippingRate().hashCode();
        }
        if (this.getHandlingRate() != null) {
            _hashCode += this.getHandlingRate().hashCode();
        }
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
        if (this.getDestinationAddressRef() != null) {
            _hashCode += this.getDestinationAddressRef().hashCode();
        }
        if (this.getShippingMethodRef() != null) {
            _hashCode += this.getShippingMethodRef().hashCode();
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
        typeDesc.setXmlType(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "CustomSaleShipGroup"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("sourceAddress");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "sourceAddress"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("destinationAddress");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "destinationAddress"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shippingMethod");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "shippingMethod"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shippingRate");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "shippingRate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("handlingRate");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "handlingRate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "id"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isFulfilled");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "isFulfilled"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("weight");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "weight"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("sourceAddressRef");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "sourceAddressRef"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("destinationAddressRef");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "destinationAddressRef"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shippingMethodRef");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "shippingMethodRef"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

