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

import com.netsuite.suitetalk.proxy.v2022_1.platform.common.types.AlcoholRecipientType;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.sales.types.ItemFulfillmentPackageFedExAdmPackageTypeFedEx;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.sales.types.ItemFulfillmentPackageFedExCodFreightTypeFedEx;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.sales.types.ItemFulfillmentPackageFedExCodMethodFedEx;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.sales.types.ItemFulfillmentPackageFedExDeliveryConfFedEx;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.sales.types.ItemFulfillmentPackageFedExPackagingFedEx;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.sales.types.ItemFulfillmentPackageFedExPriorityAlertTypeFedEx;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.sales.types.ItemFulfillmentPackageFedExSignatureOptionsFedEx;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class ItemFulfillmentPackageFedEx
implements Serializable {
    private Double packageWeightFedEx;
    private Double dryIceWeightFedEx;
    private String packageTrackingNumberFedEx;
    private ItemFulfillmentPackageFedExPackagingFedEx packagingFedEx;
    private ItemFulfillmentPackageFedExAdmPackageTypeFedEx admPackageTypeFedEx;
    private Boolean isNonStandardContainerFedEx;
    private Boolean isAlcoholFedEx;
    private AlcoholRecipientType alcoholRecipientTypeFedEx;
    private Boolean isNonHazLithiumFedEx;
    private Double insuredValueFedEx;
    private Boolean useInsuredValueFedEx;
    private String reference1FedEx;
    private ItemFulfillmentPackageFedExPriorityAlertTypeFedEx priorityAlertTypeFedEx;
    private String priorityAlertContentFedEx;
    private Long packageLengthFedEx;
    private Long packageWidthFedEx;
    private Long packageHeightFedEx;
    private Boolean useCodFedEx;
    private Double codAmountFedEx;
    private ItemFulfillmentPackageFedExCodMethodFedEx codMethodFedEx;
    private ItemFulfillmentPackageFedExCodFreightTypeFedEx codFreightTypeFedEx;
    private ItemFulfillmentPackageFedExDeliveryConfFedEx deliveryConfFedEx;
    private ItemFulfillmentPackageFedExSignatureOptionsFedEx signatureOptionsFedEx;
    private String signatureReleaseFedEx;
    private String authorizationNumberFedEx;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(ItemFulfillmentPackageFedEx.class, true);

    public ItemFulfillmentPackageFedEx() {
    }

    public ItemFulfillmentPackageFedEx(Double packageWeightFedEx, Double dryIceWeightFedEx, String packageTrackingNumberFedEx, ItemFulfillmentPackageFedExPackagingFedEx packagingFedEx, ItemFulfillmentPackageFedExAdmPackageTypeFedEx admPackageTypeFedEx, Boolean isNonStandardContainerFedEx, Boolean isAlcoholFedEx, AlcoholRecipientType alcoholRecipientTypeFedEx, Boolean isNonHazLithiumFedEx, Double insuredValueFedEx, Boolean useInsuredValueFedEx, String reference1FedEx, ItemFulfillmentPackageFedExPriorityAlertTypeFedEx priorityAlertTypeFedEx, String priorityAlertContentFedEx, Long packageLengthFedEx, Long packageWidthFedEx, Long packageHeightFedEx, Boolean useCodFedEx, Double codAmountFedEx, ItemFulfillmentPackageFedExCodMethodFedEx codMethodFedEx, ItemFulfillmentPackageFedExCodFreightTypeFedEx codFreightTypeFedEx, ItemFulfillmentPackageFedExDeliveryConfFedEx deliveryConfFedEx, ItemFulfillmentPackageFedExSignatureOptionsFedEx signatureOptionsFedEx, String signatureReleaseFedEx, String authorizationNumberFedEx) {
        this.packageWeightFedEx = packageWeightFedEx;
        this.dryIceWeightFedEx = dryIceWeightFedEx;
        this.packageTrackingNumberFedEx = packageTrackingNumberFedEx;
        this.packagingFedEx = packagingFedEx;
        this.admPackageTypeFedEx = admPackageTypeFedEx;
        this.isNonStandardContainerFedEx = isNonStandardContainerFedEx;
        this.isAlcoholFedEx = isAlcoholFedEx;
        this.alcoholRecipientTypeFedEx = alcoholRecipientTypeFedEx;
        this.isNonHazLithiumFedEx = isNonHazLithiumFedEx;
        this.insuredValueFedEx = insuredValueFedEx;
        this.useInsuredValueFedEx = useInsuredValueFedEx;
        this.reference1FedEx = reference1FedEx;
        this.priorityAlertTypeFedEx = priorityAlertTypeFedEx;
        this.priorityAlertContentFedEx = priorityAlertContentFedEx;
        this.packageLengthFedEx = packageLengthFedEx;
        this.packageWidthFedEx = packageWidthFedEx;
        this.packageHeightFedEx = packageHeightFedEx;
        this.useCodFedEx = useCodFedEx;
        this.codAmountFedEx = codAmountFedEx;
        this.codMethodFedEx = codMethodFedEx;
        this.codFreightTypeFedEx = codFreightTypeFedEx;
        this.deliveryConfFedEx = deliveryConfFedEx;
        this.signatureOptionsFedEx = signatureOptionsFedEx;
        this.signatureReleaseFedEx = signatureReleaseFedEx;
        this.authorizationNumberFedEx = authorizationNumberFedEx;
    }

    public Double getPackageWeightFedEx() {
        return this.packageWeightFedEx;
    }

    public void setPackageWeightFedEx(Double packageWeightFedEx) {
        this.packageWeightFedEx = packageWeightFedEx;
    }

    public Double getDryIceWeightFedEx() {
        return this.dryIceWeightFedEx;
    }

    public void setDryIceWeightFedEx(Double dryIceWeightFedEx) {
        this.dryIceWeightFedEx = dryIceWeightFedEx;
    }

    public String getPackageTrackingNumberFedEx() {
        return this.packageTrackingNumberFedEx;
    }

    public void setPackageTrackingNumberFedEx(String packageTrackingNumberFedEx) {
        this.packageTrackingNumberFedEx = packageTrackingNumberFedEx;
    }

    public ItemFulfillmentPackageFedExPackagingFedEx getPackagingFedEx() {
        return this.packagingFedEx;
    }

    public void setPackagingFedEx(ItemFulfillmentPackageFedExPackagingFedEx packagingFedEx) {
        this.packagingFedEx = packagingFedEx;
    }

    public ItemFulfillmentPackageFedExAdmPackageTypeFedEx getAdmPackageTypeFedEx() {
        return this.admPackageTypeFedEx;
    }

    public void setAdmPackageTypeFedEx(ItemFulfillmentPackageFedExAdmPackageTypeFedEx admPackageTypeFedEx) {
        this.admPackageTypeFedEx = admPackageTypeFedEx;
    }

    public Boolean getIsNonStandardContainerFedEx() {
        return this.isNonStandardContainerFedEx;
    }

    public void setIsNonStandardContainerFedEx(Boolean isNonStandardContainerFedEx) {
        this.isNonStandardContainerFedEx = isNonStandardContainerFedEx;
    }

    public Boolean getIsAlcoholFedEx() {
        return this.isAlcoholFedEx;
    }

    public void setIsAlcoholFedEx(Boolean isAlcoholFedEx) {
        this.isAlcoholFedEx = isAlcoholFedEx;
    }

    public AlcoholRecipientType getAlcoholRecipientTypeFedEx() {
        return this.alcoholRecipientTypeFedEx;
    }

    public void setAlcoholRecipientTypeFedEx(AlcoholRecipientType alcoholRecipientTypeFedEx) {
        this.alcoholRecipientTypeFedEx = alcoholRecipientTypeFedEx;
    }

    public Boolean getIsNonHazLithiumFedEx() {
        return this.isNonHazLithiumFedEx;
    }

    public void setIsNonHazLithiumFedEx(Boolean isNonHazLithiumFedEx) {
        this.isNonHazLithiumFedEx = isNonHazLithiumFedEx;
    }

    public Double getInsuredValueFedEx() {
        return this.insuredValueFedEx;
    }

    public void setInsuredValueFedEx(Double insuredValueFedEx) {
        this.insuredValueFedEx = insuredValueFedEx;
    }

    public Boolean getUseInsuredValueFedEx() {
        return this.useInsuredValueFedEx;
    }

    public void setUseInsuredValueFedEx(Boolean useInsuredValueFedEx) {
        this.useInsuredValueFedEx = useInsuredValueFedEx;
    }

    public String getReference1FedEx() {
        return this.reference1FedEx;
    }

    public void setReference1FedEx(String reference1FedEx) {
        this.reference1FedEx = reference1FedEx;
    }

    public ItemFulfillmentPackageFedExPriorityAlertTypeFedEx getPriorityAlertTypeFedEx() {
        return this.priorityAlertTypeFedEx;
    }

    public void setPriorityAlertTypeFedEx(ItemFulfillmentPackageFedExPriorityAlertTypeFedEx priorityAlertTypeFedEx) {
        this.priorityAlertTypeFedEx = priorityAlertTypeFedEx;
    }

    public String getPriorityAlertContentFedEx() {
        return this.priorityAlertContentFedEx;
    }

    public void setPriorityAlertContentFedEx(String priorityAlertContentFedEx) {
        this.priorityAlertContentFedEx = priorityAlertContentFedEx;
    }

    public Long getPackageLengthFedEx() {
        return this.packageLengthFedEx;
    }

    public void setPackageLengthFedEx(Long packageLengthFedEx) {
        this.packageLengthFedEx = packageLengthFedEx;
    }

    public Long getPackageWidthFedEx() {
        return this.packageWidthFedEx;
    }

    public void setPackageWidthFedEx(Long packageWidthFedEx) {
        this.packageWidthFedEx = packageWidthFedEx;
    }

    public Long getPackageHeightFedEx() {
        return this.packageHeightFedEx;
    }

    public void setPackageHeightFedEx(Long packageHeightFedEx) {
        this.packageHeightFedEx = packageHeightFedEx;
    }

    public Boolean getUseCodFedEx() {
        return this.useCodFedEx;
    }

    public void setUseCodFedEx(Boolean useCodFedEx) {
        this.useCodFedEx = useCodFedEx;
    }

    public Double getCodAmountFedEx() {
        return this.codAmountFedEx;
    }

    public void setCodAmountFedEx(Double codAmountFedEx) {
        this.codAmountFedEx = codAmountFedEx;
    }

    public ItemFulfillmentPackageFedExCodMethodFedEx getCodMethodFedEx() {
        return this.codMethodFedEx;
    }

    public void setCodMethodFedEx(ItemFulfillmentPackageFedExCodMethodFedEx codMethodFedEx) {
        this.codMethodFedEx = codMethodFedEx;
    }

    public ItemFulfillmentPackageFedExCodFreightTypeFedEx getCodFreightTypeFedEx() {
        return this.codFreightTypeFedEx;
    }

    public void setCodFreightTypeFedEx(ItemFulfillmentPackageFedExCodFreightTypeFedEx codFreightTypeFedEx) {
        this.codFreightTypeFedEx = codFreightTypeFedEx;
    }

    public ItemFulfillmentPackageFedExDeliveryConfFedEx getDeliveryConfFedEx() {
        return this.deliveryConfFedEx;
    }

    public void setDeliveryConfFedEx(ItemFulfillmentPackageFedExDeliveryConfFedEx deliveryConfFedEx) {
        this.deliveryConfFedEx = deliveryConfFedEx;
    }

    public ItemFulfillmentPackageFedExSignatureOptionsFedEx getSignatureOptionsFedEx() {
        return this.signatureOptionsFedEx;
    }

    public void setSignatureOptionsFedEx(ItemFulfillmentPackageFedExSignatureOptionsFedEx signatureOptionsFedEx) {
        this.signatureOptionsFedEx = signatureOptionsFedEx;
    }

    public String getSignatureReleaseFedEx() {
        return this.signatureReleaseFedEx;
    }

    public void setSignatureReleaseFedEx(String signatureReleaseFedEx) {
        this.signatureReleaseFedEx = signatureReleaseFedEx;
    }

    public String getAuthorizationNumberFedEx() {
        return this.authorizationNumberFedEx;
    }

    public void setAuthorizationNumberFedEx(String authorizationNumberFedEx) {
        this.authorizationNumberFedEx = authorizationNumberFedEx;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ItemFulfillmentPackageFedEx)) {
            return false;
        }
        ItemFulfillmentPackageFedEx other = (ItemFulfillmentPackageFedEx)obj;
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
        boolean _equals = (this.packageWeightFedEx == null && other.getPackageWeightFedEx() == null || this.packageWeightFedEx != null && this.packageWeightFedEx.equals(other.getPackageWeightFedEx())) && (this.dryIceWeightFedEx == null && other.getDryIceWeightFedEx() == null || this.dryIceWeightFedEx != null && this.dryIceWeightFedEx.equals(other.getDryIceWeightFedEx())) && (this.packageTrackingNumberFedEx == null && other.getPackageTrackingNumberFedEx() == null || this.packageTrackingNumberFedEx != null && this.packageTrackingNumberFedEx.equals(other.getPackageTrackingNumberFedEx())) && (this.packagingFedEx == null && other.getPackagingFedEx() == null || this.packagingFedEx != null && this.packagingFedEx.equals(other.getPackagingFedEx())) && (this.admPackageTypeFedEx == null && other.getAdmPackageTypeFedEx() == null || this.admPackageTypeFedEx != null && this.admPackageTypeFedEx.equals(other.getAdmPackageTypeFedEx())) && (this.isNonStandardContainerFedEx == null && other.getIsNonStandardContainerFedEx() == null || this.isNonStandardContainerFedEx != null && this.isNonStandardContainerFedEx.equals(other.getIsNonStandardContainerFedEx())) && (this.isAlcoholFedEx == null && other.getIsAlcoholFedEx() == null || this.isAlcoholFedEx != null && this.isAlcoholFedEx.equals(other.getIsAlcoholFedEx())) && (this.alcoholRecipientTypeFedEx == null && other.getAlcoholRecipientTypeFedEx() == null || this.alcoholRecipientTypeFedEx != null && this.alcoholRecipientTypeFedEx.equals(other.getAlcoholRecipientTypeFedEx())) && (this.isNonHazLithiumFedEx == null && other.getIsNonHazLithiumFedEx() == null || this.isNonHazLithiumFedEx != null && this.isNonHazLithiumFedEx.equals(other.getIsNonHazLithiumFedEx())) && (this.insuredValueFedEx == null && other.getInsuredValueFedEx() == null || this.insuredValueFedEx != null && this.insuredValueFedEx.equals(other.getInsuredValueFedEx())) && (this.useInsuredValueFedEx == null && other.getUseInsuredValueFedEx() == null || this.useInsuredValueFedEx != null && this.useInsuredValueFedEx.equals(other.getUseInsuredValueFedEx())) && (this.reference1FedEx == null && other.getReference1FedEx() == null || this.reference1FedEx != null && this.reference1FedEx.equals(other.getReference1FedEx())) && (this.priorityAlertTypeFedEx == null && other.getPriorityAlertTypeFedEx() == null || this.priorityAlertTypeFedEx != null && this.priorityAlertTypeFedEx.equals(other.getPriorityAlertTypeFedEx())) && (this.priorityAlertContentFedEx == null && other.getPriorityAlertContentFedEx() == null || this.priorityAlertContentFedEx != null && this.priorityAlertContentFedEx.equals(other.getPriorityAlertContentFedEx())) && (this.packageLengthFedEx == null && other.getPackageLengthFedEx() == null || this.packageLengthFedEx != null && this.packageLengthFedEx.equals(other.getPackageLengthFedEx())) && (this.packageWidthFedEx == null && other.getPackageWidthFedEx() == null || this.packageWidthFedEx != null && this.packageWidthFedEx.equals(other.getPackageWidthFedEx())) && (this.packageHeightFedEx == null && other.getPackageHeightFedEx() == null || this.packageHeightFedEx != null && this.packageHeightFedEx.equals(other.getPackageHeightFedEx())) && (this.useCodFedEx == null && other.getUseCodFedEx() == null || this.useCodFedEx != null && this.useCodFedEx.equals(other.getUseCodFedEx())) && (this.codAmountFedEx == null && other.getCodAmountFedEx() == null || this.codAmountFedEx != null && this.codAmountFedEx.equals(other.getCodAmountFedEx())) && (this.codMethodFedEx == null && other.getCodMethodFedEx() == null || this.codMethodFedEx != null && this.codMethodFedEx.equals(other.getCodMethodFedEx())) && (this.codFreightTypeFedEx == null && other.getCodFreightTypeFedEx() == null || this.codFreightTypeFedEx != null && this.codFreightTypeFedEx.equals(other.getCodFreightTypeFedEx())) && (this.deliveryConfFedEx == null && other.getDeliveryConfFedEx() == null || this.deliveryConfFedEx != null && this.deliveryConfFedEx.equals(other.getDeliveryConfFedEx())) && (this.signatureOptionsFedEx == null && other.getSignatureOptionsFedEx() == null || this.signatureOptionsFedEx != null && this.signatureOptionsFedEx.equals(other.getSignatureOptionsFedEx())) && (this.signatureReleaseFedEx == null && other.getSignatureReleaseFedEx() == null || this.signatureReleaseFedEx != null && this.signatureReleaseFedEx.equals(other.getSignatureReleaseFedEx())) && (this.authorizationNumberFedEx == null && other.getAuthorizationNumberFedEx() == null || this.authorizationNumberFedEx != null && this.authorizationNumberFedEx.equals(other.getAuthorizationNumberFedEx()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getPackageWeightFedEx() != null) {
            _hashCode += this.getPackageWeightFedEx().hashCode();
        }
        if (this.getDryIceWeightFedEx() != null) {
            _hashCode += this.getDryIceWeightFedEx().hashCode();
        }
        if (this.getPackageTrackingNumberFedEx() != null) {
            _hashCode += this.getPackageTrackingNumberFedEx().hashCode();
        }
        if (this.getPackagingFedEx() != null) {
            _hashCode += this.getPackagingFedEx().hashCode();
        }
        if (this.getAdmPackageTypeFedEx() != null) {
            _hashCode += this.getAdmPackageTypeFedEx().hashCode();
        }
        if (this.getIsNonStandardContainerFedEx() != null) {
            _hashCode += this.getIsNonStandardContainerFedEx().hashCode();
        }
        if (this.getIsAlcoholFedEx() != null) {
            _hashCode += this.getIsAlcoholFedEx().hashCode();
        }
        if (this.getAlcoholRecipientTypeFedEx() != null) {
            _hashCode += this.getAlcoholRecipientTypeFedEx().hashCode();
        }
        if (this.getIsNonHazLithiumFedEx() != null) {
            _hashCode += this.getIsNonHazLithiumFedEx().hashCode();
        }
        if (this.getInsuredValueFedEx() != null) {
            _hashCode += this.getInsuredValueFedEx().hashCode();
        }
        if (this.getUseInsuredValueFedEx() != null) {
            _hashCode += this.getUseInsuredValueFedEx().hashCode();
        }
        if (this.getReference1FedEx() != null) {
            _hashCode += this.getReference1FedEx().hashCode();
        }
        if (this.getPriorityAlertTypeFedEx() != null) {
            _hashCode += this.getPriorityAlertTypeFedEx().hashCode();
        }
        if (this.getPriorityAlertContentFedEx() != null) {
            _hashCode += this.getPriorityAlertContentFedEx().hashCode();
        }
        if (this.getPackageLengthFedEx() != null) {
            _hashCode += this.getPackageLengthFedEx().hashCode();
        }
        if (this.getPackageWidthFedEx() != null) {
            _hashCode += this.getPackageWidthFedEx().hashCode();
        }
        if (this.getPackageHeightFedEx() != null) {
            _hashCode += this.getPackageHeightFedEx().hashCode();
        }
        if (this.getUseCodFedEx() != null) {
            _hashCode += this.getUseCodFedEx().hashCode();
        }
        if (this.getCodAmountFedEx() != null) {
            _hashCode += this.getCodAmountFedEx().hashCode();
        }
        if (this.getCodMethodFedEx() != null) {
            _hashCode += this.getCodMethodFedEx().hashCode();
        }
        if (this.getCodFreightTypeFedEx() != null) {
            _hashCode += this.getCodFreightTypeFedEx().hashCode();
        }
        if (this.getDeliveryConfFedEx() != null) {
            _hashCode += this.getDeliveryConfFedEx().hashCode();
        }
        if (this.getSignatureOptionsFedEx() != null) {
            _hashCode += this.getSignatureOptionsFedEx().hashCode();
        }
        if (this.getSignatureReleaseFedEx() != null) {
            _hashCode += this.getSignatureReleaseFedEx().hashCode();
        }
        if (this.getAuthorizationNumberFedEx() != null) {
            _hashCode += this.getAuthorizationNumberFedEx().hashCode();
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
        typeDesc.setXmlType(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "ItemFulfillmentPackageFedEx"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("packageWeightFedEx");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "packageWeightFedEx"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("dryIceWeightFedEx");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "dryIceWeightFedEx"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("packageTrackingNumberFedEx");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "packageTrackingNumberFedEx"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("packagingFedEx");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "packagingFedEx"));
        elemField.setXmlType(new QName("urn:types.sales_2022_1.transactions.webservices.netsuite.com", "ItemFulfillmentPackageFedExPackagingFedEx"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("admPackageTypeFedEx");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "admPackageTypeFedEx"));
        elemField.setXmlType(new QName("urn:types.sales_2022_1.transactions.webservices.netsuite.com", "ItemFulfillmentPackageFedExAdmPackageTypeFedEx"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isNonStandardContainerFedEx");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "isNonStandardContainerFedEx"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isAlcoholFedEx");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "isAlcoholFedEx"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("alcoholRecipientTypeFedEx");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "alcoholRecipientTypeFedEx"));
        elemField.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "AlcoholRecipientType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isNonHazLithiumFedEx");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "isNonHazLithiumFedEx"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("insuredValueFedEx");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "insuredValueFedEx"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("useInsuredValueFedEx");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "useInsuredValueFedEx"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("reference1FedEx");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "reference1FedEx"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("priorityAlertTypeFedEx");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "priorityAlertTypeFedEx"));
        elemField.setXmlType(new QName("urn:types.sales_2022_1.transactions.webservices.netsuite.com", "ItemFulfillmentPackageFedExPriorityAlertTypeFedEx"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("priorityAlertContentFedEx");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "priorityAlertContentFedEx"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("packageLengthFedEx");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "packageLengthFedEx"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("packageWidthFedEx");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "packageWidthFedEx"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("packageHeightFedEx");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "packageHeightFedEx"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("useCodFedEx");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "useCodFedEx"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("codAmountFedEx");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "codAmountFedEx"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("codMethodFedEx");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "codMethodFedEx"));
        elemField.setXmlType(new QName("urn:types.sales_2022_1.transactions.webservices.netsuite.com", "ItemFulfillmentPackageFedExCodMethodFedEx"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("codFreightTypeFedEx");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "codFreightTypeFedEx"));
        elemField.setXmlType(new QName("urn:types.sales_2022_1.transactions.webservices.netsuite.com", "ItemFulfillmentPackageFedExCodFreightTypeFedEx"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("deliveryConfFedEx");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "deliveryConfFedEx"));
        elemField.setXmlType(new QName("urn:types.sales_2022_1.transactions.webservices.netsuite.com", "ItemFulfillmentPackageFedExDeliveryConfFedEx"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("signatureOptionsFedEx");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "signatureOptionsFedEx"));
        elemField.setXmlType(new QName("urn:types.sales_2022_1.transactions.webservices.netsuite.com", "ItemFulfillmentPackageFedExSignatureOptionsFedEx"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("signatureReleaseFedEx");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "signatureReleaseFedEx"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("authorizationNumberFedEx");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "authorizationNumberFedEx"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

