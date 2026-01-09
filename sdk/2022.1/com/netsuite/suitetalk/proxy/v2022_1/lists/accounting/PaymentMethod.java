/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.axis.description.AttributeDesc
 *  org.apache.axis.description.ElementDesc
 *  org.apache.axis.description.FieldDesc
 *  org.apache.axis.description.TypeDesc
 *  org.apache.axis.encoding.Deserializer
 *  org.apache.axis.encoding.Serializer
 *  org.apache.axis.encoding.ser.BeanDeserializer
 *  org.apache.axis.encoding.ser.BeanSerializer
 */
package com.netsuite.suitetalk.proxy.v2022_1.lists.accounting;

import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.PaymentMethodVisualsList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.NullField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.Record;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRefList;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.AttributeDesc;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class PaymentMethod
extends Record
implements Serializable {
    private String name;
    private Boolean creditCard;
    private Boolean undepFunds;
    private RecordRef account;
    private Boolean isInactive;
    private Boolean isOnline;
    private PaymentMethodVisualsList visualsList;
    private Boolean isDebitCard;
    private RecordRefList merchantAccountsList;
    private String payPalEmailAddress;
    private String expressCheckoutArrangement;
    private Boolean useExpressCheckout;
    private String internalId;
    private String externalId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(PaymentMethod.class, true);

    public PaymentMethod() {
    }

    public PaymentMethod(NullField nullFieldList, String internalId, String externalId, String name, Boolean creditCard, Boolean undepFunds, RecordRef account, Boolean isInactive, Boolean isOnline, PaymentMethodVisualsList visualsList, Boolean isDebitCard, RecordRefList merchantAccountsList, String payPalEmailAddress, String expressCheckoutArrangement, Boolean useExpressCheckout) {
        super(nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.name = name;
        this.creditCard = creditCard;
        this.undepFunds = undepFunds;
        this.account = account;
        this.isInactive = isInactive;
        this.isOnline = isOnline;
        this.visualsList = visualsList;
        this.isDebitCard = isDebitCard;
        this.merchantAccountsList = merchantAccountsList;
        this.payPalEmailAddress = payPalEmailAddress;
        this.expressCheckoutArrangement = expressCheckoutArrangement;
        this.useExpressCheckout = useExpressCheckout;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getCreditCard() {
        return this.creditCard;
    }

    public void setCreditCard(Boolean creditCard) {
        this.creditCard = creditCard;
    }

    public Boolean getUndepFunds() {
        return this.undepFunds;
    }

    public void setUndepFunds(Boolean undepFunds) {
        this.undepFunds = undepFunds;
    }

    public RecordRef getAccount() {
        return this.account;
    }

    public void setAccount(RecordRef account) {
        this.account = account;
    }

    public Boolean getIsInactive() {
        return this.isInactive;
    }

    public void setIsInactive(Boolean isInactive) {
        this.isInactive = isInactive;
    }

    public Boolean getIsOnline() {
        return this.isOnline;
    }

    public void setIsOnline(Boolean isOnline) {
        this.isOnline = isOnline;
    }

    public PaymentMethodVisualsList getVisualsList() {
        return this.visualsList;
    }

    public void setVisualsList(PaymentMethodVisualsList visualsList) {
        this.visualsList = visualsList;
    }

    public Boolean getIsDebitCard() {
        return this.isDebitCard;
    }

    public void setIsDebitCard(Boolean isDebitCard) {
        this.isDebitCard = isDebitCard;
    }

    public RecordRefList getMerchantAccountsList() {
        return this.merchantAccountsList;
    }

    public void setMerchantAccountsList(RecordRefList merchantAccountsList) {
        this.merchantAccountsList = merchantAccountsList;
    }

    public String getPayPalEmailAddress() {
        return this.payPalEmailAddress;
    }

    public void setPayPalEmailAddress(String payPalEmailAddress) {
        this.payPalEmailAddress = payPalEmailAddress;
    }

    public String getExpressCheckoutArrangement() {
        return this.expressCheckoutArrangement;
    }

    public void setExpressCheckoutArrangement(String expressCheckoutArrangement) {
        this.expressCheckoutArrangement = expressCheckoutArrangement;
    }

    public Boolean getUseExpressCheckout() {
        return this.useExpressCheckout;
    }

    public void setUseExpressCheckout(Boolean useExpressCheckout) {
        this.useExpressCheckout = useExpressCheckout;
    }

    public String getInternalId() {
        return this.internalId;
    }

    public void setInternalId(String internalId) {
        this.internalId = internalId;
    }

    public String getExternalId() {
        return this.externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PaymentMethod)) {
            return false;
        }
        PaymentMethod other = (PaymentMethod)obj;
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
        boolean _equals = super.equals(obj) && (this.name == null && other.getName() == null || this.name != null && this.name.equals(other.getName())) && (this.creditCard == null && other.getCreditCard() == null || this.creditCard != null && this.creditCard.equals(other.getCreditCard())) && (this.undepFunds == null && other.getUndepFunds() == null || this.undepFunds != null && this.undepFunds.equals(other.getUndepFunds())) && (this.account == null && other.getAccount() == null || this.account != null && this.account.equals(other.getAccount())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && this.isInactive.equals(other.getIsInactive())) && (this.isOnline == null && other.getIsOnline() == null || this.isOnline != null && this.isOnline.equals(other.getIsOnline())) && (this.visualsList == null && other.getVisualsList() == null || this.visualsList != null && this.visualsList.equals(other.getVisualsList())) && (this.isDebitCard == null && other.getIsDebitCard() == null || this.isDebitCard != null && this.isDebitCard.equals(other.getIsDebitCard())) && (this.merchantAccountsList == null && other.getMerchantAccountsList() == null || this.merchantAccountsList != null && this.merchantAccountsList.equals(other.getMerchantAccountsList())) && (this.payPalEmailAddress == null && other.getPayPalEmailAddress() == null || this.payPalEmailAddress != null && this.payPalEmailAddress.equals(other.getPayPalEmailAddress())) && (this.expressCheckoutArrangement == null && other.getExpressCheckoutArrangement() == null || this.expressCheckoutArrangement != null && this.expressCheckoutArrangement.equals(other.getExpressCheckoutArrangement())) && (this.useExpressCheckout == null && other.getUseExpressCheckout() == null || this.useExpressCheckout != null && this.useExpressCheckout.equals(other.getUseExpressCheckout())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
        this.__equalsCalc = null;
        return _equals;
    }

    @Override
    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (this.getName() != null) {
            _hashCode += this.getName().hashCode();
        }
        if (this.getCreditCard() != null) {
            _hashCode += this.getCreditCard().hashCode();
        }
        if (this.getUndepFunds() != null) {
            _hashCode += this.getUndepFunds().hashCode();
        }
        if (this.getAccount() != null) {
            _hashCode += this.getAccount().hashCode();
        }
        if (this.getIsInactive() != null) {
            _hashCode += this.getIsInactive().hashCode();
        }
        if (this.getIsOnline() != null) {
            _hashCode += this.getIsOnline().hashCode();
        }
        if (this.getVisualsList() != null) {
            _hashCode += this.getVisualsList().hashCode();
        }
        if (this.getIsDebitCard() != null) {
            _hashCode += this.getIsDebitCard().hashCode();
        }
        if (this.getMerchantAccountsList() != null) {
            _hashCode += this.getMerchantAccountsList().hashCode();
        }
        if (this.getPayPalEmailAddress() != null) {
            _hashCode += this.getPayPalEmailAddress().hashCode();
        }
        if (this.getExpressCheckoutArrangement() != null) {
            _hashCode += this.getExpressCheckoutArrangement().hashCode();
        }
        if (this.getUseExpressCheckout() != null) {
            _hashCode += this.getUseExpressCheckout().hashCode();
        }
        if (this.getInternalId() != null) {
            _hashCode += this.getInternalId().hashCode();
        }
        if (this.getExternalId() != null) {
            _hashCode += this.getExternalId().hashCode();
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
        typeDesc.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "PaymentMethod"));
        AttributeDesc attrField = new AttributeDesc();
        attrField.setFieldName("internalId");
        attrField.setXmlName(new QName("", "internalId"));
        attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc((FieldDesc)attrField);
        attrField = new AttributeDesc();
        attrField.setFieldName("externalId");
        attrField.setXmlName(new QName("", "externalId"));
        attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc((FieldDesc)attrField);
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "name"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("creditCard");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "creditCard"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("undepFunds");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "undepFunds"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "account"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isOnline");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "isOnline"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("visualsList");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "visualsList"));
        elemField.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "PaymentMethodVisualsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isDebitCard");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "isDebitCard"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("merchantAccountsList");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "merchantAccountsList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRefList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("payPalEmailAddress");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "payPalEmailAddress"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("expressCheckoutArrangement");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "expressCheckoutArrangement"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("useExpressCheckout");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "useExpressCheckout"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

