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

import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.types.PaymentCardBrand;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.types.PaymentCardType;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.types.PaymentInstrumentState;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.NullField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.Record;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import java.io.Serializable;
import java.util.Calendar;
import javax.xml.namespace.QName;
import org.apache.axis.description.AttributeDesc;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class PaymentCard
extends Record
implements Serializable {
    private String lastFourDigits;
    private String issuerIdNumber;
    private RecordRef entity;
    private String mask;
    private RecordRef paymentMethod;
    private String memo;
    private PaymentInstrumentState state;
    private Boolean isInactive;
    private Boolean preserveOnFile;
    private Boolean isDefault;
    private String cardNumber;
    private Calendar expirationDate;
    private PaymentCardBrand cardBrand;
    private PaymentCardType cardType;
    private String nameOnCard;
    private String street;
    private String zipCode;
    private Calendar validFromDate;
    private String issueNumber;
    private String internalId;
    private String externalId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(PaymentCard.class, true);

    public PaymentCard() {
    }

    public PaymentCard(NullField nullFieldList, String internalId, String externalId, String lastFourDigits, String issuerIdNumber, RecordRef entity, String mask, RecordRef paymentMethod, String memo, PaymentInstrumentState state, Boolean isInactive, Boolean preserveOnFile, Boolean isDefault, String cardNumber, Calendar expirationDate, PaymentCardBrand cardBrand, PaymentCardType cardType, String nameOnCard, String street, String zipCode, Calendar validFromDate, String issueNumber) {
        super(nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.lastFourDigits = lastFourDigits;
        this.issuerIdNumber = issuerIdNumber;
        this.entity = entity;
        this.mask = mask;
        this.paymentMethod = paymentMethod;
        this.memo = memo;
        this.state = state;
        this.isInactive = isInactive;
        this.preserveOnFile = preserveOnFile;
        this.isDefault = isDefault;
        this.cardNumber = cardNumber;
        this.expirationDate = expirationDate;
        this.cardBrand = cardBrand;
        this.cardType = cardType;
        this.nameOnCard = nameOnCard;
        this.street = street;
        this.zipCode = zipCode;
        this.validFromDate = validFromDate;
        this.issueNumber = issueNumber;
    }

    public String getLastFourDigits() {
        return this.lastFourDigits;
    }

    public void setLastFourDigits(String lastFourDigits) {
        this.lastFourDigits = lastFourDigits;
    }

    public String getIssuerIdNumber() {
        return this.issuerIdNumber;
    }

    public void setIssuerIdNumber(String issuerIdNumber) {
        this.issuerIdNumber = issuerIdNumber;
    }

    public RecordRef getEntity() {
        return this.entity;
    }

    public void setEntity(RecordRef entity) {
        this.entity = entity;
    }

    public String getMask() {
        return this.mask;
    }

    public void setMask(String mask) {
        this.mask = mask;
    }

    public RecordRef getPaymentMethod() {
        return this.paymentMethod;
    }

    public void setPaymentMethod(RecordRef paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public String getMemo() {
        return this.memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public PaymentInstrumentState getState() {
        return this.state;
    }

    public void setState(PaymentInstrumentState state) {
        this.state = state;
    }

    public Boolean getIsInactive() {
        return this.isInactive;
    }

    public void setIsInactive(Boolean isInactive) {
        this.isInactive = isInactive;
    }

    public Boolean getPreserveOnFile() {
        return this.preserveOnFile;
    }

    public void setPreserveOnFile(Boolean preserveOnFile) {
        this.preserveOnFile = preserveOnFile;
    }

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public Calendar getExpirationDate() {
        return this.expirationDate;
    }

    public void setExpirationDate(Calendar expirationDate) {
        this.expirationDate = expirationDate;
    }

    public PaymentCardBrand getCardBrand() {
        return this.cardBrand;
    }

    public void setCardBrand(PaymentCardBrand cardBrand) {
        this.cardBrand = cardBrand;
    }

    public PaymentCardType getCardType() {
        return this.cardType;
    }

    public void setCardType(PaymentCardType cardType) {
        this.cardType = cardType;
    }

    public String getNameOnCard() {
        return this.nameOnCard;
    }

    public void setNameOnCard(String nameOnCard) {
        this.nameOnCard = nameOnCard;
    }

    public String getStreet() {
        return this.street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipCode() {
        return this.zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public Calendar getValidFromDate() {
        return this.validFromDate;
    }

    public void setValidFromDate(Calendar validFromDate) {
        this.validFromDate = validFromDate;
    }

    public String getIssueNumber() {
        return this.issueNumber;
    }

    public void setIssueNumber(String issueNumber) {
        this.issueNumber = issueNumber;
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
        if (!(obj instanceof PaymentCard)) {
            return false;
        }
        PaymentCard other = (PaymentCard)obj;
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
        boolean _equals = super.equals(obj) && (this.lastFourDigits == null && other.getLastFourDigits() == null || this.lastFourDigits != null && this.lastFourDigits.equals(other.getLastFourDigits())) && (this.issuerIdNumber == null && other.getIssuerIdNumber() == null || this.issuerIdNumber != null && this.issuerIdNumber.equals(other.getIssuerIdNumber())) && (this.entity == null && other.getEntity() == null || this.entity != null && this.entity.equals(other.getEntity())) && (this.mask == null && other.getMask() == null || this.mask != null && this.mask.equals(other.getMask())) && (this.paymentMethod == null && other.getPaymentMethod() == null || this.paymentMethod != null && this.paymentMethod.equals(other.getPaymentMethod())) && (this.memo == null && other.getMemo() == null || this.memo != null && this.memo.equals(other.getMemo())) && (this.state == null && other.getState() == null || this.state != null && this.state.equals(other.getState())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && this.isInactive.equals(other.getIsInactive())) && (this.preserveOnFile == null && other.getPreserveOnFile() == null || this.preserveOnFile != null && this.preserveOnFile.equals(other.getPreserveOnFile())) && (this.isDefault == null && other.getIsDefault() == null || this.isDefault != null && this.isDefault.equals(other.getIsDefault())) && (this.cardNumber == null && other.getCardNumber() == null || this.cardNumber != null && this.cardNumber.equals(other.getCardNumber())) && (this.expirationDate == null && other.getExpirationDate() == null || this.expirationDate != null && this.expirationDate.equals(other.getExpirationDate())) && (this.cardBrand == null && other.getCardBrand() == null || this.cardBrand != null && this.cardBrand.equals(other.getCardBrand())) && (this.cardType == null && other.getCardType() == null || this.cardType != null && this.cardType.equals(other.getCardType())) && (this.nameOnCard == null && other.getNameOnCard() == null || this.nameOnCard != null && this.nameOnCard.equals(other.getNameOnCard())) && (this.street == null && other.getStreet() == null || this.street != null && this.street.equals(other.getStreet())) && (this.zipCode == null && other.getZipCode() == null || this.zipCode != null && this.zipCode.equals(other.getZipCode())) && (this.validFromDate == null && other.getValidFromDate() == null || this.validFromDate != null && this.validFromDate.equals(other.getValidFromDate())) && (this.issueNumber == null && other.getIssueNumber() == null || this.issueNumber != null && this.issueNumber.equals(other.getIssueNumber())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
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
        if (this.getLastFourDigits() != null) {
            _hashCode += this.getLastFourDigits().hashCode();
        }
        if (this.getIssuerIdNumber() != null) {
            _hashCode += this.getIssuerIdNumber().hashCode();
        }
        if (this.getEntity() != null) {
            _hashCode += this.getEntity().hashCode();
        }
        if (this.getMask() != null) {
            _hashCode += this.getMask().hashCode();
        }
        if (this.getPaymentMethod() != null) {
            _hashCode += this.getPaymentMethod().hashCode();
        }
        if (this.getMemo() != null) {
            _hashCode += this.getMemo().hashCode();
        }
        if (this.getState() != null) {
            _hashCode += this.getState().hashCode();
        }
        if (this.getIsInactive() != null) {
            _hashCode += this.getIsInactive().hashCode();
        }
        if (this.getPreserveOnFile() != null) {
            _hashCode += this.getPreserveOnFile().hashCode();
        }
        if (this.getIsDefault() != null) {
            _hashCode += this.getIsDefault().hashCode();
        }
        if (this.getCardNumber() != null) {
            _hashCode += this.getCardNumber().hashCode();
        }
        if (this.getExpirationDate() != null) {
            _hashCode += this.getExpirationDate().hashCode();
        }
        if (this.getCardBrand() != null) {
            _hashCode += this.getCardBrand().hashCode();
        }
        if (this.getCardType() != null) {
            _hashCode += this.getCardType().hashCode();
        }
        if (this.getNameOnCard() != null) {
            _hashCode += this.getNameOnCard().hashCode();
        }
        if (this.getStreet() != null) {
            _hashCode += this.getStreet().hashCode();
        }
        if (this.getZipCode() != null) {
            _hashCode += this.getZipCode().hashCode();
        }
        if (this.getValidFromDate() != null) {
            _hashCode += this.getValidFromDate().hashCode();
        }
        if (this.getIssueNumber() != null) {
            _hashCode += this.getIssueNumber().hashCode();
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
        typeDesc.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "PaymentCard"));
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
        elemField.setFieldName("lastFourDigits");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "lastFourDigits"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("issuerIdNumber");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "issuerIdNumber"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("entity");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "entity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("mask");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "mask"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("paymentMethod");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "paymentMethod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "state"));
        elemField.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "PaymentInstrumentState"));
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
        elemField.setFieldName("preserveOnFile");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "preserveOnFile"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isDefault");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "isDefault"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("cardNumber");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "cardNumber"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "expirationDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("cardBrand");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "cardBrand"));
        elemField.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "PaymentCardBrand"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("cardType");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "cardType"));
        elemField.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "PaymentCardType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("nameOnCard");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "nameOnCard"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("street");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "street"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("zipCode");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "zipCode"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("validFromDate");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "validFromDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("issueNumber");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "issueNumber"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

