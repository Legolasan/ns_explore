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
package com.netsuite.suitetalk.proxy.v2022_1.platform.common;

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchBooleanField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchCustomFieldList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchDateField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchDoubleField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchLongField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchMultiSelectField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchRecordBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchStringField;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class GiftCertificateSearchBasic
extends SearchRecordBasic
implements Serializable {
    private SearchDoubleField amountAvailableBilled;
    private SearchDoubleField amountRemaining;
    private SearchDateField createdDate;
    private SearchStringField email;
    private SearchDateField expirationDate;
    private SearchStringField giftCertCode;
    private SearchMultiSelectField incomeAccount;
    private SearchMultiSelectField internalId;
    private SearchLongField internalIdNumber;
    private SearchBooleanField isActive;
    private SearchMultiSelectField item;
    private SearchMultiSelectField liabilityAccount;
    private SearchStringField message;
    private SearchStringField name;
    private SearchDoubleField originalAmount;
    private SearchDateField purchaseDate;
    private SearchStringField sender;
    private SearchCustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(GiftCertificateSearchBasic.class, true);

    public GiftCertificateSearchBasic() {
    }

    public GiftCertificateSearchBasic(SearchDoubleField amountAvailableBilled, SearchDoubleField amountRemaining, SearchDateField createdDate, SearchStringField email, SearchDateField expirationDate, SearchStringField giftCertCode, SearchMultiSelectField incomeAccount, SearchMultiSelectField internalId, SearchLongField internalIdNumber, SearchBooleanField isActive, SearchMultiSelectField item, SearchMultiSelectField liabilityAccount, SearchStringField message, SearchStringField name, SearchDoubleField originalAmount, SearchDateField purchaseDate, SearchStringField sender, SearchCustomFieldList customFieldList) {
        this.amountAvailableBilled = amountAvailableBilled;
        this.amountRemaining = amountRemaining;
        this.createdDate = createdDate;
        this.email = email;
        this.expirationDate = expirationDate;
        this.giftCertCode = giftCertCode;
        this.incomeAccount = incomeAccount;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isActive = isActive;
        this.item = item;
        this.liabilityAccount = liabilityAccount;
        this.message = message;
        this.name = name;
        this.originalAmount = originalAmount;
        this.purchaseDate = purchaseDate;
        this.sender = sender;
        this.customFieldList = customFieldList;
    }

    public SearchDoubleField getAmountAvailableBilled() {
        return this.amountAvailableBilled;
    }

    public void setAmountAvailableBilled(SearchDoubleField amountAvailableBilled) {
        this.amountAvailableBilled = amountAvailableBilled;
    }

    public SearchDoubleField getAmountRemaining() {
        return this.amountRemaining;
    }

    public void setAmountRemaining(SearchDoubleField amountRemaining) {
        this.amountRemaining = amountRemaining;
    }

    public SearchDateField getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(SearchDateField createdDate) {
        this.createdDate = createdDate;
    }

    public SearchStringField getEmail() {
        return this.email;
    }

    public void setEmail(SearchStringField email) {
        this.email = email;
    }

    public SearchDateField getExpirationDate() {
        return this.expirationDate;
    }

    public void setExpirationDate(SearchDateField expirationDate) {
        this.expirationDate = expirationDate;
    }

    public SearchStringField getGiftCertCode() {
        return this.giftCertCode;
    }

    public void setGiftCertCode(SearchStringField giftCertCode) {
        this.giftCertCode = giftCertCode;
    }

    public SearchMultiSelectField getIncomeAccount() {
        return this.incomeAccount;
    }

    public void setIncomeAccount(SearchMultiSelectField incomeAccount) {
        this.incomeAccount = incomeAccount;
    }

    public SearchMultiSelectField getInternalId() {
        return this.internalId;
    }

    public void setInternalId(SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }

    public SearchLongField getInternalIdNumber() {
        return this.internalIdNumber;
    }

    public void setInternalIdNumber(SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }

    public SearchBooleanField getIsActive() {
        return this.isActive;
    }

    public void setIsActive(SearchBooleanField isActive) {
        this.isActive = isActive;
    }

    public SearchMultiSelectField getItem() {
        return this.item;
    }

    public void setItem(SearchMultiSelectField item) {
        this.item = item;
    }

    public SearchMultiSelectField getLiabilityAccount() {
        return this.liabilityAccount;
    }

    public void setLiabilityAccount(SearchMultiSelectField liabilityAccount) {
        this.liabilityAccount = liabilityAccount;
    }

    public SearchStringField getMessage() {
        return this.message;
    }

    public void setMessage(SearchStringField message) {
        this.message = message;
    }

    public SearchStringField getName() {
        return this.name;
    }

    public void setName(SearchStringField name) {
        this.name = name;
    }

    public SearchDoubleField getOriginalAmount() {
        return this.originalAmount;
    }

    public void setOriginalAmount(SearchDoubleField originalAmount) {
        this.originalAmount = originalAmount;
    }

    public SearchDateField getPurchaseDate() {
        return this.purchaseDate;
    }

    public void setPurchaseDate(SearchDateField purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public SearchStringField getSender() {
        return this.sender;
    }

    public void setSender(SearchStringField sender) {
        this.sender = sender;
    }

    public SearchCustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GiftCertificateSearchBasic)) {
            return false;
        }
        GiftCertificateSearchBasic other = (GiftCertificateSearchBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.amountAvailableBilled == null && other.getAmountAvailableBilled() == null || this.amountAvailableBilled != null && this.amountAvailableBilled.equals(other.getAmountAvailableBilled())) && (this.amountRemaining == null && other.getAmountRemaining() == null || this.amountRemaining != null && this.amountRemaining.equals(other.getAmountRemaining())) && (this.createdDate == null && other.getCreatedDate() == null || this.createdDate != null && this.createdDate.equals(other.getCreatedDate())) && (this.email == null && other.getEmail() == null || this.email != null && this.email.equals(other.getEmail())) && (this.expirationDate == null && other.getExpirationDate() == null || this.expirationDate != null && this.expirationDate.equals(other.getExpirationDate())) && (this.giftCertCode == null && other.getGiftCertCode() == null || this.giftCertCode != null && this.giftCertCode.equals(other.getGiftCertCode())) && (this.incomeAccount == null && other.getIncomeAccount() == null || this.incomeAccount != null && this.incomeAccount.equals(other.getIncomeAccount())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.internalIdNumber == null && other.getInternalIdNumber() == null || this.internalIdNumber != null && this.internalIdNumber.equals(other.getInternalIdNumber())) && (this.isActive == null && other.getIsActive() == null || this.isActive != null && this.isActive.equals(other.getIsActive())) && (this.item == null && other.getItem() == null || this.item != null && this.item.equals(other.getItem())) && (this.liabilityAccount == null && other.getLiabilityAccount() == null || this.liabilityAccount != null && this.liabilityAccount.equals(other.getLiabilityAccount())) && (this.message == null && other.getMessage() == null || this.message != null && this.message.equals(other.getMessage())) && (this.name == null && other.getName() == null || this.name != null && this.name.equals(other.getName())) && (this.originalAmount == null && other.getOriginalAmount() == null || this.originalAmount != null && this.originalAmount.equals(other.getOriginalAmount())) && (this.purchaseDate == null && other.getPurchaseDate() == null || this.purchaseDate != null && this.purchaseDate.equals(other.getPurchaseDate())) && (this.sender == null && other.getSender() == null || this.sender != null && this.sender.equals(other.getSender())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
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
        if (this.getAmountAvailableBilled() != null) {
            _hashCode += this.getAmountAvailableBilled().hashCode();
        }
        if (this.getAmountRemaining() != null) {
            _hashCode += this.getAmountRemaining().hashCode();
        }
        if (this.getCreatedDate() != null) {
            _hashCode += this.getCreatedDate().hashCode();
        }
        if (this.getEmail() != null) {
            _hashCode += this.getEmail().hashCode();
        }
        if (this.getExpirationDate() != null) {
            _hashCode += this.getExpirationDate().hashCode();
        }
        if (this.getGiftCertCode() != null) {
            _hashCode += this.getGiftCertCode().hashCode();
        }
        if (this.getIncomeAccount() != null) {
            _hashCode += this.getIncomeAccount().hashCode();
        }
        if (this.getInternalId() != null) {
            _hashCode += this.getInternalId().hashCode();
        }
        if (this.getInternalIdNumber() != null) {
            _hashCode += this.getInternalIdNumber().hashCode();
        }
        if (this.getIsActive() != null) {
            _hashCode += this.getIsActive().hashCode();
        }
        if (this.getItem() != null) {
            _hashCode += this.getItem().hashCode();
        }
        if (this.getLiabilityAccount() != null) {
            _hashCode += this.getLiabilityAccount().hashCode();
        }
        if (this.getMessage() != null) {
            _hashCode += this.getMessage().hashCode();
        }
        if (this.getName() != null) {
            _hashCode += this.getName().hashCode();
        }
        if (this.getOriginalAmount() != null) {
            _hashCode += this.getOriginalAmount().hashCode();
        }
        if (this.getPurchaseDate() != null) {
            _hashCode += this.getPurchaseDate().hashCode();
        }
        if (this.getSender() != null) {
            _hashCode += this.getSender().hashCode();
        }
        if (this.getCustomFieldList() != null) {
            _hashCode += this.getCustomFieldList().hashCode();
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "GiftCertificateSearchBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("amountAvailableBilled");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "amountAvailableBilled"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("amountRemaining");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "amountRemaining"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "email"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "expirationDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("giftCertCode");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "giftCertCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("incomeAccount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "incomeAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("internalIdNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "internalIdNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isActive");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isActive"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("liabilityAccount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "liabilityAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "message"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "name"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("originalAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "originalAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("purchaseDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "purchaseDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("sender");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "sender"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchCustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

