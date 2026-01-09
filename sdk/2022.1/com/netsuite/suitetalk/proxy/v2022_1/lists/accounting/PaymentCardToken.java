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
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.types.TokenFamily;
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

public class PaymentCardToken
extends Record
implements Serializable {
    private RecordRef entity;
    private String mask;
    private RecordRef paymentMethod;
    private String memo;
    private PaymentInstrumentState state;
    private Boolean isInactive;
    private Boolean preserveOnFile;
    private Boolean isDefault;
    private String token;
    private Calendar tokenExpirationDate;
    private TokenFamily tokenFamily;
    private String tokenNamespace;
    private String cardIssuerIdNumber;
    private PaymentCardBrand cardBrand;
    private PaymentCardType cardType;
    private String cardNameOnCard;
    private String cardLastFourDigits;
    private Calendar cardExpirationDate;
    private String internalId;
    private String externalId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(PaymentCardToken.class, true);

    public PaymentCardToken() {
    }

    public PaymentCardToken(NullField nullFieldList, String internalId, String externalId, RecordRef entity, String mask, RecordRef paymentMethod, String memo, PaymentInstrumentState state, Boolean isInactive, Boolean preserveOnFile, Boolean isDefault, String token, Calendar tokenExpirationDate, TokenFamily tokenFamily, String tokenNamespace, String cardIssuerIdNumber, PaymentCardBrand cardBrand, PaymentCardType cardType, String cardNameOnCard, String cardLastFourDigits, Calendar cardExpirationDate) {
        super(nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.entity = entity;
        this.mask = mask;
        this.paymentMethod = paymentMethod;
        this.memo = memo;
        this.state = state;
        this.isInactive = isInactive;
        this.preserveOnFile = preserveOnFile;
        this.isDefault = isDefault;
        this.token = token;
        this.tokenExpirationDate = tokenExpirationDate;
        this.tokenFamily = tokenFamily;
        this.tokenNamespace = tokenNamespace;
        this.cardIssuerIdNumber = cardIssuerIdNumber;
        this.cardBrand = cardBrand;
        this.cardType = cardType;
        this.cardNameOnCard = cardNameOnCard;
        this.cardLastFourDigits = cardLastFourDigits;
        this.cardExpirationDate = cardExpirationDate;
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

    public String getToken() {
        return this.token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Calendar getTokenExpirationDate() {
        return this.tokenExpirationDate;
    }

    public void setTokenExpirationDate(Calendar tokenExpirationDate) {
        this.tokenExpirationDate = tokenExpirationDate;
    }

    public TokenFamily getTokenFamily() {
        return this.tokenFamily;
    }

    public void setTokenFamily(TokenFamily tokenFamily) {
        this.tokenFamily = tokenFamily;
    }

    public String getTokenNamespace() {
        return this.tokenNamespace;
    }

    public void setTokenNamespace(String tokenNamespace) {
        this.tokenNamespace = tokenNamespace;
    }

    public String getCardIssuerIdNumber() {
        return this.cardIssuerIdNumber;
    }

    public void setCardIssuerIdNumber(String cardIssuerIdNumber) {
        this.cardIssuerIdNumber = cardIssuerIdNumber;
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

    public String getCardNameOnCard() {
        return this.cardNameOnCard;
    }

    public void setCardNameOnCard(String cardNameOnCard) {
        this.cardNameOnCard = cardNameOnCard;
    }

    public String getCardLastFourDigits() {
        return this.cardLastFourDigits;
    }

    public void setCardLastFourDigits(String cardLastFourDigits) {
        this.cardLastFourDigits = cardLastFourDigits;
    }

    public Calendar getCardExpirationDate() {
        return this.cardExpirationDate;
    }

    public void setCardExpirationDate(Calendar cardExpirationDate) {
        this.cardExpirationDate = cardExpirationDate;
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
        if (!(obj instanceof PaymentCardToken)) {
            return false;
        }
        PaymentCardToken other = (PaymentCardToken)obj;
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
        boolean _equals = super.equals(obj) && (this.entity == null && other.getEntity() == null || this.entity != null && this.entity.equals(other.getEntity())) && (this.mask == null && other.getMask() == null || this.mask != null && this.mask.equals(other.getMask())) && (this.paymentMethod == null && other.getPaymentMethod() == null || this.paymentMethod != null && this.paymentMethod.equals(other.getPaymentMethod())) && (this.memo == null && other.getMemo() == null || this.memo != null && this.memo.equals(other.getMemo())) && (this.state == null && other.getState() == null || this.state != null && this.state.equals(other.getState())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && this.isInactive.equals(other.getIsInactive())) && (this.preserveOnFile == null && other.getPreserveOnFile() == null || this.preserveOnFile != null && this.preserveOnFile.equals(other.getPreserveOnFile())) && (this.isDefault == null && other.getIsDefault() == null || this.isDefault != null && this.isDefault.equals(other.getIsDefault())) && (this.token == null && other.getToken() == null || this.token != null && this.token.equals(other.getToken())) && (this.tokenExpirationDate == null && other.getTokenExpirationDate() == null || this.tokenExpirationDate != null && this.tokenExpirationDate.equals(other.getTokenExpirationDate())) && (this.tokenFamily == null && other.getTokenFamily() == null || this.tokenFamily != null && this.tokenFamily.equals(other.getTokenFamily())) && (this.tokenNamespace == null && other.getTokenNamespace() == null || this.tokenNamespace != null && this.tokenNamespace.equals(other.getTokenNamespace())) && (this.cardIssuerIdNumber == null && other.getCardIssuerIdNumber() == null || this.cardIssuerIdNumber != null && this.cardIssuerIdNumber.equals(other.getCardIssuerIdNumber())) && (this.cardBrand == null && other.getCardBrand() == null || this.cardBrand != null && this.cardBrand.equals(other.getCardBrand())) && (this.cardType == null && other.getCardType() == null || this.cardType != null && this.cardType.equals(other.getCardType())) && (this.cardNameOnCard == null && other.getCardNameOnCard() == null || this.cardNameOnCard != null && this.cardNameOnCard.equals(other.getCardNameOnCard())) && (this.cardLastFourDigits == null && other.getCardLastFourDigits() == null || this.cardLastFourDigits != null && this.cardLastFourDigits.equals(other.getCardLastFourDigits())) && (this.cardExpirationDate == null && other.getCardExpirationDate() == null || this.cardExpirationDate != null && this.cardExpirationDate.equals(other.getCardExpirationDate())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
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
        if (this.getToken() != null) {
            _hashCode += this.getToken().hashCode();
        }
        if (this.getTokenExpirationDate() != null) {
            _hashCode += this.getTokenExpirationDate().hashCode();
        }
        if (this.getTokenFamily() != null) {
            _hashCode += this.getTokenFamily().hashCode();
        }
        if (this.getTokenNamespace() != null) {
            _hashCode += this.getTokenNamespace().hashCode();
        }
        if (this.getCardIssuerIdNumber() != null) {
            _hashCode += this.getCardIssuerIdNumber().hashCode();
        }
        if (this.getCardBrand() != null) {
            _hashCode += this.getCardBrand().hashCode();
        }
        if (this.getCardType() != null) {
            _hashCode += this.getCardType().hashCode();
        }
        if (this.getCardNameOnCard() != null) {
            _hashCode += this.getCardNameOnCard().hashCode();
        }
        if (this.getCardLastFourDigits() != null) {
            _hashCode += this.getCardLastFourDigits().hashCode();
        }
        if (this.getCardExpirationDate() != null) {
            _hashCode += this.getCardExpirationDate().hashCode();
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
        typeDesc.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "PaymentCardToken"));
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
        elemField.setFieldName("token");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "token"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("tokenExpirationDate");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "tokenExpirationDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("tokenFamily");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "tokenFamily"));
        elemField.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "TokenFamily"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("tokenNamespace");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "tokenNamespace"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("cardIssuerIdNumber");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "cardIssuerIdNumber"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("cardNameOnCard");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "cardNameOnCard"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("cardLastFourDigits");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "cardLastFourDigits"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("cardExpirationDate");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "cardExpirationDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

