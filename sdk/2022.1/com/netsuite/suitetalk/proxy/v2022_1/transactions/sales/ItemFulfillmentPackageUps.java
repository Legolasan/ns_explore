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

import com.netsuite.suitetalk.proxy.v2022_1.transactions.sales.types.ItemFulfillmentPackageUpsCodMethodUps;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.sales.types.ItemFulfillmentPackageUpsDeliveryConfUps;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.sales.types.ItemFulfillmentPackageUpsPackagingUps;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class ItemFulfillmentPackageUps
implements Serializable {
    private Double packageWeightUps;
    private String packageDescrUps;
    private String packageTrackingNumberUps;
    private ItemFulfillmentPackageUpsPackagingUps packagingUps;
    private Boolean useInsuredValueUps;
    private Double insuredValueUps;
    private String reference1Ups;
    private String reference2Ups;
    private Long packageLengthUps;
    private Long packageWidthUps;
    private Long packageHeightUps;
    private Boolean additionalHandlingUps;
    private Boolean useCodUps;
    private Double codAmountUps;
    private ItemFulfillmentPackageUpsCodMethodUps codMethodUps;
    private ItemFulfillmentPackageUpsDeliveryConfUps deliveryConfUps;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(ItemFulfillmentPackageUps.class, true);

    public ItemFulfillmentPackageUps() {
    }

    public ItemFulfillmentPackageUps(Double packageWeightUps, String packageDescrUps, String packageTrackingNumberUps, ItemFulfillmentPackageUpsPackagingUps packagingUps, Boolean useInsuredValueUps, Double insuredValueUps, String reference1Ups, String reference2Ups, Long packageLengthUps, Long packageWidthUps, Long packageHeightUps, Boolean additionalHandlingUps, Boolean useCodUps, Double codAmountUps, ItemFulfillmentPackageUpsCodMethodUps codMethodUps, ItemFulfillmentPackageUpsDeliveryConfUps deliveryConfUps) {
        this.packageWeightUps = packageWeightUps;
        this.packageDescrUps = packageDescrUps;
        this.packageTrackingNumberUps = packageTrackingNumberUps;
        this.packagingUps = packagingUps;
        this.useInsuredValueUps = useInsuredValueUps;
        this.insuredValueUps = insuredValueUps;
        this.reference1Ups = reference1Ups;
        this.reference2Ups = reference2Ups;
        this.packageLengthUps = packageLengthUps;
        this.packageWidthUps = packageWidthUps;
        this.packageHeightUps = packageHeightUps;
        this.additionalHandlingUps = additionalHandlingUps;
        this.useCodUps = useCodUps;
        this.codAmountUps = codAmountUps;
        this.codMethodUps = codMethodUps;
        this.deliveryConfUps = deliveryConfUps;
    }

    public Double getPackageWeightUps() {
        return this.packageWeightUps;
    }

    public void setPackageWeightUps(Double packageWeightUps) {
        this.packageWeightUps = packageWeightUps;
    }

    public String getPackageDescrUps() {
        return this.packageDescrUps;
    }

    public void setPackageDescrUps(String packageDescrUps) {
        this.packageDescrUps = packageDescrUps;
    }

    public String getPackageTrackingNumberUps() {
        return this.packageTrackingNumberUps;
    }

    public void setPackageTrackingNumberUps(String packageTrackingNumberUps) {
        this.packageTrackingNumberUps = packageTrackingNumberUps;
    }

    public ItemFulfillmentPackageUpsPackagingUps getPackagingUps() {
        return this.packagingUps;
    }

    public void setPackagingUps(ItemFulfillmentPackageUpsPackagingUps packagingUps) {
        this.packagingUps = packagingUps;
    }

    public Boolean getUseInsuredValueUps() {
        return this.useInsuredValueUps;
    }

    public void setUseInsuredValueUps(Boolean useInsuredValueUps) {
        this.useInsuredValueUps = useInsuredValueUps;
    }

    public Double getInsuredValueUps() {
        return this.insuredValueUps;
    }

    public void setInsuredValueUps(Double insuredValueUps) {
        this.insuredValueUps = insuredValueUps;
    }

    public String getReference1Ups() {
        return this.reference1Ups;
    }

    public void setReference1Ups(String reference1Ups) {
        this.reference1Ups = reference1Ups;
    }

    public String getReference2Ups() {
        return this.reference2Ups;
    }

    public void setReference2Ups(String reference2Ups) {
        this.reference2Ups = reference2Ups;
    }

    public Long getPackageLengthUps() {
        return this.packageLengthUps;
    }

    public void setPackageLengthUps(Long packageLengthUps) {
        this.packageLengthUps = packageLengthUps;
    }

    public Long getPackageWidthUps() {
        return this.packageWidthUps;
    }

    public void setPackageWidthUps(Long packageWidthUps) {
        this.packageWidthUps = packageWidthUps;
    }

    public Long getPackageHeightUps() {
        return this.packageHeightUps;
    }

    public void setPackageHeightUps(Long packageHeightUps) {
        this.packageHeightUps = packageHeightUps;
    }

    public Boolean getAdditionalHandlingUps() {
        return this.additionalHandlingUps;
    }

    public void setAdditionalHandlingUps(Boolean additionalHandlingUps) {
        this.additionalHandlingUps = additionalHandlingUps;
    }

    public Boolean getUseCodUps() {
        return this.useCodUps;
    }

    public void setUseCodUps(Boolean useCodUps) {
        this.useCodUps = useCodUps;
    }

    public Double getCodAmountUps() {
        return this.codAmountUps;
    }

    public void setCodAmountUps(Double codAmountUps) {
        this.codAmountUps = codAmountUps;
    }

    public ItemFulfillmentPackageUpsCodMethodUps getCodMethodUps() {
        return this.codMethodUps;
    }

    public void setCodMethodUps(ItemFulfillmentPackageUpsCodMethodUps codMethodUps) {
        this.codMethodUps = codMethodUps;
    }

    public ItemFulfillmentPackageUpsDeliveryConfUps getDeliveryConfUps() {
        return this.deliveryConfUps;
    }

    public void setDeliveryConfUps(ItemFulfillmentPackageUpsDeliveryConfUps deliveryConfUps) {
        this.deliveryConfUps = deliveryConfUps;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ItemFulfillmentPackageUps)) {
            return false;
        }
        ItemFulfillmentPackageUps other = (ItemFulfillmentPackageUps)obj;
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
        boolean _equals = (this.packageWeightUps == null && other.getPackageWeightUps() == null || this.packageWeightUps != null && this.packageWeightUps.equals(other.getPackageWeightUps())) && (this.packageDescrUps == null && other.getPackageDescrUps() == null || this.packageDescrUps != null && this.packageDescrUps.equals(other.getPackageDescrUps())) && (this.packageTrackingNumberUps == null && other.getPackageTrackingNumberUps() == null || this.packageTrackingNumberUps != null && this.packageTrackingNumberUps.equals(other.getPackageTrackingNumberUps())) && (this.packagingUps == null && other.getPackagingUps() == null || this.packagingUps != null && this.packagingUps.equals(other.getPackagingUps())) && (this.useInsuredValueUps == null && other.getUseInsuredValueUps() == null || this.useInsuredValueUps != null && this.useInsuredValueUps.equals(other.getUseInsuredValueUps())) && (this.insuredValueUps == null && other.getInsuredValueUps() == null || this.insuredValueUps != null && this.insuredValueUps.equals(other.getInsuredValueUps())) && (this.reference1Ups == null && other.getReference1Ups() == null || this.reference1Ups != null && this.reference1Ups.equals(other.getReference1Ups())) && (this.reference2Ups == null && other.getReference2Ups() == null || this.reference2Ups != null && this.reference2Ups.equals(other.getReference2Ups())) && (this.packageLengthUps == null && other.getPackageLengthUps() == null || this.packageLengthUps != null && this.packageLengthUps.equals(other.getPackageLengthUps())) && (this.packageWidthUps == null && other.getPackageWidthUps() == null || this.packageWidthUps != null && this.packageWidthUps.equals(other.getPackageWidthUps())) && (this.packageHeightUps == null && other.getPackageHeightUps() == null || this.packageHeightUps != null && this.packageHeightUps.equals(other.getPackageHeightUps())) && (this.additionalHandlingUps == null && other.getAdditionalHandlingUps() == null || this.additionalHandlingUps != null && this.additionalHandlingUps.equals(other.getAdditionalHandlingUps())) && (this.useCodUps == null && other.getUseCodUps() == null || this.useCodUps != null && this.useCodUps.equals(other.getUseCodUps())) && (this.codAmountUps == null && other.getCodAmountUps() == null || this.codAmountUps != null && this.codAmountUps.equals(other.getCodAmountUps())) && (this.codMethodUps == null && other.getCodMethodUps() == null || this.codMethodUps != null && this.codMethodUps.equals(other.getCodMethodUps())) && (this.deliveryConfUps == null && other.getDeliveryConfUps() == null || this.deliveryConfUps != null && this.deliveryConfUps.equals(other.getDeliveryConfUps()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getPackageWeightUps() != null) {
            _hashCode += this.getPackageWeightUps().hashCode();
        }
        if (this.getPackageDescrUps() != null) {
            _hashCode += this.getPackageDescrUps().hashCode();
        }
        if (this.getPackageTrackingNumberUps() != null) {
            _hashCode += this.getPackageTrackingNumberUps().hashCode();
        }
        if (this.getPackagingUps() != null) {
            _hashCode += this.getPackagingUps().hashCode();
        }
        if (this.getUseInsuredValueUps() != null) {
            _hashCode += this.getUseInsuredValueUps().hashCode();
        }
        if (this.getInsuredValueUps() != null) {
            _hashCode += this.getInsuredValueUps().hashCode();
        }
        if (this.getReference1Ups() != null) {
            _hashCode += this.getReference1Ups().hashCode();
        }
        if (this.getReference2Ups() != null) {
            _hashCode += this.getReference2Ups().hashCode();
        }
        if (this.getPackageLengthUps() != null) {
            _hashCode += this.getPackageLengthUps().hashCode();
        }
        if (this.getPackageWidthUps() != null) {
            _hashCode += this.getPackageWidthUps().hashCode();
        }
        if (this.getPackageHeightUps() != null) {
            _hashCode += this.getPackageHeightUps().hashCode();
        }
        if (this.getAdditionalHandlingUps() != null) {
            _hashCode += this.getAdditionalHandlingUps().hashCode();
        }
        if (this.getUseCodUps() != null) {
            _hashCode += this.getUseCodUps().hashCode();
        }
        if (this.getCodAmountUps() != null) {
            _hashCode += this.getCodAmountUps().hashCode();
        }
        if (this.getCodMethodUps() != null) {
            _hashCode += this.getCodMethodUps().hashCode();
        }
        if (this.getDeliveryConfUps() != null) {
            _hashCode += this.getDeliveryConfUps().hashCode();
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
        typeDesc.setXmlType(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "ItemFulfillmentPackageUps"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("packageWeightUps");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "packageWeightUps"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("packageDescrUps");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "packageDescrUps"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("packageTrackingNumberUps");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "packageTrackingNumberUps"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("packagingUps");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "packagingUps"));
        elemField.setXmlType(new QName("urn:types.sales_2022_1.transactions.webservices.netsuite.com", "ItemFulfillmentPackageUpsPackagingUps"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("useInsuredValueUps");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "useInsuredValueUps"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("insuredValueUps");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "insuredValueUps"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("reference1Ups");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "reference1Ups"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("reference2Ups");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "reference2Ups"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("packageLengthUps");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "packageLengthUps"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("packageWidthUps");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "packageWidthUps"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("packageHeightUps");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "packageHeightUps"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("additionalHandlingUps");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "additionalHandlingUps"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("useCodUps");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "useCodUps"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("codAmountUps");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "codAmountUps"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("codMethodUps");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "codMethodUps"));
        elemField.setXmlType(new QName("urn:types.sales_2022_1.transactions.webservices.netsuite.com", "ItemFulfillmentPackageUpsCodMethodUps"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("deliveryConfUps");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "deliveryConfUps"));
        elemField.setXmlType(new QName("urn:types.sales_2022_1.transactions.webservices.netsuite.com", "ItemFulfillmentPackageUpsDeliveryConfUps"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

