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

import com.netsuite.suitetalk.proxy.v2022_1.transactions.sales.types.ItemFulfillmentPackageUspsDeliveryConfUsps;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.sales.types.ItemFulfillmentPackageUspsPackagingUsps;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class ItemFulfillmentPackageUsps
implements Serializable {
    private Double packageWeightUsps;
    private String packageDescrUsps;
    private String packageTrackingNumberUsps;
    private ItemFulfillmentPackageUspsPackagingUsps packagingUsps;
    private Boolean useInsuredValueUsps;
    private Double insuredValueUsps;
    private String reference1Usps;
    private String reference2Usps;
    private Long packageLengthUsps;
    private Long packageWidthUsps;
    private Long packageHeightUsps;
    private ItemFulfillmentPackageUspsDeliveryConfUsps deliveryConfUsps;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(ItemFulfillmentPackageUsps.class, true);

    public ItemFulfillmentPackageUsps() {
    }

    public ItemFulfillmentPackageUsps(Double packageWeightUsps, String packageDescrUsps, String packageTrackingNumberUsps, ItemFulfillmentPackageUspsPackagingUsps packagingUsps, Boolean useInsuredValueUsps, Double insuredValueUsps, String reference1Usps, String reference2Usps, Long packageLengthUsps, Long packageWidthUsps, Long packageHeightUsps, ItemFulfillmentPackageUspsDeliveryConfUsps deliveryConfUsps) {
        this.packageWeightUsps = packageWeightUsps;
        this.packageDescrUsps = packageDescrUsps;
        this.packageTrackingNumberUsps = packageTrackingNumberUsps;
        this.packagingUsps = packagingUsps;
        this.useInsuredValueUsps = useInsuredValueUsps;
        this.insuredValueUsps = insuredValueUsps;
        this.reference1Usps = reference1Usps;
        this.reference2Usps = reference2Usps;
        this.packageLengthUsps = packageLengthUsps;
        this.packageWidthUsps = packageWidthUsps;
        this.packageHeightUsps = packageHeightUsps;
        this.deliveryConfUsps = deliveryConfUsps;
    }

    public Double getPackageWeightUsps() {
        return this.packageWeightUsps;
    }

    public void setPackageWeightUsps(Double packageWeightUsps) {
        this.packageWeightUsps = packageWeightUsps;
    }

    public String getPackageDescrUsps() {
        return this.packageDescrUsps;
    }

    public void setPackageDescrUsps(String packageDescrUsps) {
        this.packageDescrUsps = packageDescrUsps;
    }

    public String getPackageTrackingNumberUsps() {
        return this.packageTrackingNumberUsps;
    }

    public void setPackageTrackingNumberUsps(String packageTrackingNumberUsps) {
        this.packageTrackingNumberUsps = packageTrackingNumberUsps;
    }

    public ItemFulfillmentPackageUspsPackagingUsps getPackagingUsps() {
        return this.packagingUsps;
    }

    public void setPackagingUsps(ItemFulfillmentPackageUspsPackagingUsps packagingUsps) {
        this.packagingUsps = packagingUsps;
    }

    public Boolean getUseInsuredValueUsps() {
        return this.useInsuredValueUsps;
    }

    public void setUseInsuredValueUsps(Boolean useInsuredValueUsps) {
        this.useInsuredValueUsps = useInsuredValueUsps;
    }

    public Double getInsuredValueUsps() {
        return this.insuredValueUsps;
    }

    public void setInsuredValueUsps(Double insuredValueUsps) {
        this.insuredValueUsps = insuredValueUsps;
    }

    public String getReference1Usps() {
        return this.reference1Usps;
    }

    public void setReference1Usps(String reference1Usps) {
        this.reference1Usps = reference1Usps;
    }

    public String getReference2Usps() {
        return this.reference2Usps;
    }

    public void setReference2Usps(String reference2Usps) {
        this.reference2Usps = reference2Usps;
    }

    public Long getPackageLengthUsps() {
        return this.packageLengthUsps;
    }

    public void setPackageLengthUsps(Long packageLengthUsps) {
        this.packageLengthUsps = packageLengthUsps;
    }

    public Long getPackageWidthUsps() {
        return this.packageWidthUsps;
    }

    public void setPackageWidthUsps(Long packageWidthUsps) {
        this.packageWidthUsps = packageWidthUsps;
    }

    public Long getPackageHeightUsps() {
        return this.packageHeightUsps;
    }

    public void setPackageHeightUsps(Long packageHeightUsps) {
        this.packageHeightUsps = packageHeightUsps;
    }

    public ItemFulfillmentPackageUspsDeliveryConfUsps getDeliveryConfUsps() {
        return this.deliveryConfUsps;
    }

    public void setDeliveryConfUsps(ItemFulfillmentPackageUspsDeliveryConfUsps deliveryConfUsps) {
        this.deliveryConfUsps = deliveryConfUsps;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ItemFulfillmentPackageUsps)) {
            return false;
        }
        ItemFulfillmentPackageUsps other = (ItemFulfillmentPackageUsps)obj;
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
        boolean _equals = (this.packageWeightUsps == null && other.getPackageWeightUsps() == null || this.packageWeightUsps != null && this.packageWeightUsps.equals(other.getPackageWeightUsps())) && (this.packageDescrUsps == null && other.getPackageDescrUsps() == null || this.packageDescrUsps != null && this.packageDescrUsps.equals(other.getPackageDescrUsps())) && (this.packageTrackingNumberUsps == null && other.getPackageTrackingNumberUsps() == null || this.packageTrackingNumberUsps != null && this.packageTrackingNumberUsps.equals(other.getPackageTrackingNumberUsps())) && (this.packagingUsps == null && other.getPackagingUsps() == null || this.packagingUsps != null && this.packagingUsps.equals(other.getPackagingUsps())) && (this.useInsuredValueUsps == null && other.getUseInsuredValueUsps() == null || this.useInsuredValueUsps != null && this.useInsuredValueUsps.equals(other.getUseInsuredValueUsps())) && (this.insuredValueUsps == null && other.getInsuredValueUsps() == null || this.insuredValueUsps != null && this.insuredValueUsps.equals(other.getInsuredValueUsps())) && (this.reference1Usps == null && other.getReference1Usps() == null || this.reference1Usps != null && this.reference1Usps.equals(other.getReference1Usps())) && (this.reference2Usps == null && other.getReference2Usps() == null || this.reference2Usps != null && this.reference2Usps.equals(other.getReference2Usps())) && (this.packageLengthUsps == null && other.getPackageLengthUsps() == null || this.packageLengthUsps != null && this.packageLengthUsps.equals(other.getPackageLengthUsps())) && (this.packageWidthUsps == null && other.getPackageWidthUsps() == null || this.packageWidthUsps != null && this.packageWidthUsps.equals(other.getPackageWidthUsps())) && (this.packageHeightUsps == null && other.getPackageHeightUsps() == null || this.packageHeightUsps != null && this.packageHeightUsps.equals(other.getPackageHeightUsps())) && (this.deliveryConfUsps == null && other.getDeliveryConfUsps() == null || this.deliveryConfUsps != null && this.deliveryConfUsps.equals(other.getDeliveryConfUsps()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getPackageWeightUsps() != null) {
            _hashCode += this.getPackageWeightUsps().hashCode();
        }
        if (this.getPackageDescrUsps() != null) {
            _hashCode += this.getPackageDescrUsps().hashCode();
        }
        if (this.getPackageTrackingNumberUsps() != null) {
            _hashCode += this.getPackageTrackingNumberUsps().hashCode();
        }
        if (this.getPackagingUsps() != null) {
            _hashCode += this.getPackagingUsps().hashCode();
        }
        if (this.getUseInsuredValueUsps() != null) {
            _hashCode += this.getUseInsuredValueUsps().hashCode();
        }
        if (this.getInsuredValueUsps() != null) {
            _hashCode += this.getInsuredValueUsps().hashCode();
        }
        if (this.getReference1Usps() != null) {
            _hashCode += this.getReference1Usps().hashCode();
        }
        if (this.getReference2Usps() != null) {
            _hashCode += this.getReference2Usps().hashCode();
        }
        if (this.getPackageLengthUsps() != null) {
            _hashCode += this.getPackageLengthUsps().hashCode();
        }
        if (this.getPackageWidthUsps() != null) {
            _hashCode += this.getPackageWidthUsps().hashCode();
        }
        if (this.getPackageHeightUsps() != null) {
            _hashCode += this.getPackageHeightUsps().hashCode();
        }
        if (this.getDeliveryConfUsps() != null) {
            _hashCode += this.getDeliveryConfUsps().hashCode();
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
        typeDesc.setXmlType(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "ItemFulfillmentPackageUsps"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("packageWeightUsps");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "packageWeightUsps"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("packageDescrUsps");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "packageDescrUsps"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("packageTrackingNumberUsps");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "packageTrackingNumberUsps"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("packagingUsps");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "packagingUsps"));
        elemField.setXmlType(new QName("urn:types.sales_2022_1.transactions.webservices.netsuite.com", "ItemFulfillmentPackageUspsPackagingUsps"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("useInsuredValueUsps");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "useInsuredValueUsps"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("insuredValueUsps");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "insuredValueUsps"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("reference1Usps");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "reference1Usps"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("reference2Usps");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "reference2Usps"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("packageLengthUsps");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "packageLengthUsps"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("packageWidthUsps");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "packageWidthUsps"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("packageHeightUsps");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "packageHeightUsps"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("deliveryConfUsps");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "deliveryConfUsps"));
        elemField.setXmlType(new QName("urn:types.sales_2022_1.transactions.webservices.netsuite.com", "ItemFulfillmentPackageUspsDeliveryConfUsps"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

