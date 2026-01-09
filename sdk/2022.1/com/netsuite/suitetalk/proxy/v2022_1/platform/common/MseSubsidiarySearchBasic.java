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
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchEnumMultiSelectField;
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

public class MseSubsidiarySearchBasic
extends SearchRecordBasic
implements Serializable {
    private SearchMultiSelectField accountingBook;
    private SearchMultiSelectField accountingBookCurrency;
    private SearchStringField address;
    private SearchStringField city;
    private SearchEnumMultiSelectField country;
    private SearchMultiSelectField currency;
    private SearchDateField effectiveFrom;
    private SearchStringField email;
    private SearchMultiSelectField externalId;
    private SearchStringField externalIdString;
    private SearchStringField fax;
    private SearchMultiSelectField internalId;
    private SearchLongField internalIdNumber;
    private SearchBooleanField isElimination;
    private SearchBooleanField isInactive;
    private SearchStringField legalName;
    private SearchStringField name;
    private SearchStringField nameNoHierarchy;
    private SearchMultiSelectField nexus;
    private SearchStringField phone;
    private SearchBooleanField primary;
    private SearchDoubleField purchaseOrderAmount;
    private SearchDoubleField purchaseOrderQuantity;
    private SearchDoubleField purchaseOrderQuantityDiff;
    private SearchDoubleField receiptAmount;
    private SearchDoubleField receiptQuantity;
    private SearchDoubleField receiptQuantityDiff;
    private SearchStringField state;
    private SearchMultiSelectField subsidiary;
    private SearchMultiSelectField taxEngine;
    private SearchStringField taxIdNum;
    private SearchStringField taxRegistrationNumber;
    private SearchStringField tranPrefix;
    private SearchStringField url;
    private SearchDateField validUntil;
    private SearchStringField zip;
    private SearchCustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(MseSubsidiarySearchBasic.class, true);

    public MseSubsidiarySearchBasic() {
    }

    public MseSubsidiarySearchBasic(SearchMultiSelectField accountingBook, SearchMultiSelectField accountingBookCurrency, SearchStringField address, SearchStringField city, SearchEnumMultiSelectField country, SearchMultiSelectField currency, SearchDateField effectiveFrom, SearchStringField email, SearchMultiSelectField externalId, SearchStringField externalIdString, SearchStringField fax, SearchMultiSelectField internalId, SearchLongField internalIdNumber, SearchBooleanField isElimination, SearchBooleanField isInactive, SearchStringField legalName, SearchStringField name, SearchStringField nameNoHierarchy, SearchMultiSelectField nexus, SearchStringField phone, SearchBooleanField primary, SearchDoubleField purchaseOrderAmount, SearchDoubleField purchaseOrderQuantity, SearchDoubleField purchaseOrderQuantityDiff, SearchDoubleField receiptAmount, SearchDoubleField receiptQuantity, SearchDoubleField receiptQuantityDiff, SearchStringField state, SearchMultiSelectField subsidiary, SearchMultiSelectField taxEngine, SearchStringField taxIdNum, SearchStringField taxRegistrationNumber, SearchStringField tranPrefix, SearchStringField url, SearchDateField validUntil, SearchStringField zip, SearchCustomFieldList customFieldList) {
        this.accountingBook = accountingBook;
        this.accountingBookCurrency = accountingBookCurrency;
        this.address = address;
        this.city = city;
        this.country = country;
        this.currency = currency;
        this.effectiveFrom = effectiveFrom;
        this.email = email;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.fax = fax;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isElimination = isElimination;
        this.isInactive = isInactive;
        this.legalName = legalName;
        this.name = name;
        this.nameNoHierarchy = nameNoHierarchy;
        this.nexus = nexus;
        this.phone = phone;
        this.primary = primary;
        this.purchaseOrderAmount = purchaseOrderAmount;
        this.purchaseOrderQuantity = purchaseOrderQuantity;
        this.purchaseOrderQuantityDiff = purchaseOrderQuantityDiff;
        this.receiptAmount = receiptAmount;
        this.receiptQuantity = receiptQuantity;
        this.receiptQuantityDiff = receiptQuantityDiff;
        this.state = state;
        this.subsidiary = subsidiary;
        this.taxEngine = taxEngine;
        this.taxIdNum = taxIdNum;
        this.taxRegistrationNumber = taxRegistrationNumber;
        this.tranPrefix = tranPrefix;
        this.url = url;
        this.validUntil = validUntil;
        this.zip = zip;
        this.customFieldList = customFieldList;
    }

    public SearchMultiSelectField getAccountingBook() {
        return this.accountingBook;
    }

    public void setAccountingBook(SearchMultiSelectField accountingBook) {
        this.accountingBook = accountingBook;
    }

    public SearchMultiSelectField getAccountingBookCurrency() {
        return this.accountingBookCurrency;
    }

    public void setAccountingBookCurrency(SearchMultiSelectField accountingBookCurrency) {
        this.accountingBookCurrency = accountingBookCurrency;
    }

    public SearchStringField getAddress() {
        return this.address;
    }

    public void setAddress(SearchStringField address) {
        this.address = address;
    }

    public SearchStringField getCity() {
        return this.city;
    }

    public void setCity(SearchStringField city) {
        this.city = city;
    }

    public SearchEnumMultiSelectField getCountry() {
        return this.country;
    }

    public void setCountry(SearchEnumMultiSelectField country) {
        this.country = country;
    }

    public SearchMultiSelectField getCurrency() {
        return this.currency;
    }

    public void setCurrency(SearchMultiSelectField currency) {
        this.currency = currency;
    }

    public SearchDateField getEffectiveFrom() {
        return this.effectiveFrom;
    }

    public void setEffectiveFrom(SearchDateField effectiveFrom) {
        this.effectiveFrom = effectiveFrom;
    }

    public SearchStringField getEmail() {
        return this.email;
    }

    public void setEmail(SearchStringField email) {
        this.email = email;
    }

    public SearchMultiSelectField getExternalId() {
        return this.externalId;
    }

    public void setExternalId(SearchMultiSelectField externalId) {
        this.externalId = externalId;
    }

    public SearchStringField getExternalIdString() {
        return this.externalIdString;
    }

    public void setExternalIdString(SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }

    public SearchStringField getFax() {
        return this.fax;
    }

    public void setFax(SearchStringField fax) {
        this.fax = fax;
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

    public SearchBooleanField getIsElimination() {
        return this.isElimination;
    }

    public void setIsElimination(SearchBooleanField isElimination) {
        this.isElimination = isElimination;
    }

    public SearchBooleanField getIsInactive() {
        return this.isInactive;
    }

    public void setIsInactive(SearchBooleanField isInactive) {
        this.isInactive = isInactive;
    }

    public SearchStringField getLegalName() {
        return this.legalName;
    }

    public void setLegalName(SearchStringField legalName) {
        this.legalName = legalName;
    }

    public SearchStringField getName() {
        return this.name;
    }

    public void setName(SearchStringField name) {
        this.name = name;
    }

    public SearchStringField getNameNoHierarchy() {
        return this.nameNoHierarchy;
    }

    public void setNameNoHierarchy(SearchStringField nameNoHierarchy) {
        this.nameNoHierarchy = nameNoHierarchy;
    }

    public SearchMultiSelectField getNexus() {
        return this.nexus;
    }

    public void setNexus(SearchMultiSelectField nexus) {
        this.nexus = nexus;
    }

    public SearchStringField getPhone() {
        return this.phone;
    }

    public void setPhone(SearchStringField phone) {
        this.phone = phone;
    }

    public SearchBooleanField getPrimary() {
        return this.primary;
    }

    public void setPrimary(SearchBooleanField primary) {
        this.primary = primary;
    }

    public SearchDoubleField getPurchaseOrderAmount() {
        return this.purchaseOrderAmount;
    }

    public void setPurchaseOrderAmount(SearchDoubleField purchaseOrderAmount) {
        this.purchaseOrderAmount = purchaseOrderAmount;
    }

    public SearchDoubleField getPurchaseOrderQuantity() {
        return this.purchaseOrderQuantity;
    }

    public void setPurchaseOrderQuantity(SearchDoubleField purchaseOrderQuantity) {
        this.purchaseOrderQuantity = purchaseOrderQuantity;
    }

    public SearchDoubleField getPurchaseOrderQuantityDiff() {
        return this.purchaseOrderQuantityDiff;
    }

    public void setPurchaseOrderQuantityDiff(SearchDoubleField purchaseOrderQuantityDiff) {
        this.purchaseOrderQuantityDiff = purchaseOrderQuantityDiff;
    }

    public SearchDoubleField getReceiptAmount() {
        return this.receiptAmount;
    }

    public void setReceiptAmount(SearchDoubleField receiptAmount) {
        this.receiptAmount = receiptAmount;
    }

    public SearchDoubleField getReceiptQuantity() {
        return this.receiptQuantity;
    }

    public void setReceiptQuantity(SearchDoubleField receiptQuantity) {
        this.receiptQuantity = receiptQuantity;
    }

    public SearchDoubleField getReceiptQuantityDiff() {
        return this.receiptQuantityDiff;
    }

    public void setReceiptQuantityDiff(SearchDoubleField receiptQuantityDiff) {
        this.receiptQuantityDiff = receiptQuantityDiff;
    }

    public SearchStringField getState() {
        return this.state;
    }

    public void setState(SearchStringField state) {
        this.state = state;
    }

    public SearchMultiSelectField getSubsidiary() {
        return this.subsidiary;
    }

    public void setSubsidiary(SearchMultiSelectField subsidiary) {
        this.subsidiary = subsidiary;
    }

    public SearchMultiSelectField getTaxEngine() {
        return this.taxEngine;
    }

    public void setTaxEngine(SearchMultiSelectField taxEngine) {
        this.taxEngine = taxEngine;
    }

    public SearchStringField getTaxIdNum() {
        return this.taxIdNum;
    }

    public void setTaxIdNum(SearchStringField taxIdNum) {
        this.taxIdNum = taxIdNum;
    }

    public SearchStringField getTaxRegistrationNumber() {
        return this.taxRegistrationNumber;
    }

    public void setTaxRegistrationNumber(SearchStringField taxRegistrationNumber) {
        this.taxRegistrationNumber = taxRegistrationNumber;
    }

    public SearchStringField getTranPrefix() {
        return this.tranPrefix;
    }

    public void setTranPrefix(SearchStringField tranPrefix) {
        this.tranPrefix = tranPrefix;
    }

    public SearchStringField getUrl() {
        return this.url;
    }

    public void setUrl(SearchStringField url) {
        this.url = url;
    }

    public SearchDateField getValidUntil() {
        return this.validUntil;
    }

    public void setValidUntil(SearchDateField validUntil) {
        this.validUntil = validUntil;
    }

    public SearchStringField getZip() {
        return this.zip;
    }

    public void setZip(SearchStringField zip) {
        this.zip = zip;
    }

    public SearchCustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof MseSubsidiarySearchBasic)) {
            return false;
        }
        MseSubsidiarySearchBasic other = (MseSubsidiarySearchBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.accountingBook == null && other.getAccountingBook() == null || this.accountingBook != null && this.accountingBook.equals(other.getAccountingBook())) && (this.accountingBookCurrency == null && other.getAccountingBookCurrency() == null || this.accountingBookCurrency != null && this.accountingBookCurrency.equals(other.getAccountingBookCurrency())) && (this.address == null && other.getAddress() == null || this.address != null && this.address.equals(other.getAddress())) && (this.city == null && other.getCity() == null || this.city != null && this.city.equals(other.getCity())) && (this.country == null && other.getCountry() == null || this.country != null && this.country.equals(other.getCountry())) && (this.currency == null && other.getCurrency() == null || this.currency != null && this.currency.equals(other.getCurrency())) && (this.effectiveFrom == null && other.getEffectiveFrom() == null || this.effectiveFrom != null && this.effectiveFrom.equals(other.getEffectiveFrom())) && (this.email == null && other.getEmail() == null || this.email != null && this.email.equals(other.getEmail())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId())) && (this.externalIdString == null && other.getExternalIdString() == null || this.externalIdString != null && this.externalIdString.equals(other.getExternalIdString())) && (this.fax == null && other.getFax() == null || this.fax != null && this.fax.equals(other.getFax())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.internalIdNumber == null && other.getInternalIdNumber() == null || this.internalIdNumber != null && this.internalIdNumber.equals(other.getInternalIdNumber())) && (this.isElimination == null && other.getIsElimination() == null || this.isElimination != null && this.isElimination.equals(other.getIsElimination())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && this.isInactive.equals(other.getIsInactive())) && (this.legalName == null && other.getLegalName() == null || this.legalName != null && this.legalName.equals(other.getLegalName())) && (this.name == null && other.getName() == null || this.name != null && this.name.equals(other.getName())) && (this.nameNoHierarchy == null && other.getNameNoHierarchy() == null || this.nameNoHierarchy != null && this.nameNoHierarchy.equals(other.getNameNoHierarchy())) && (this.nexus == null && other.getNexus() == null || this.nexus != null && this.nexus.equals(other.getNexus())) && (this.phone == null && other.getPhone() == null || this.phone != null && this.phone.equals(other.getPhone())) && (this.primary == null && other.getPrimary() == null || this.primary != null && this.primary.equals(other.getPrimary())) && (this.purchaseOrderAmount == null && other.getPurchaseOrderAmount() == null || this.purchaseOrderAmount != null && this.purchaseOrderAmount.equals(other.getPurchaseOrderAmount())) && (this.purchaseOrderQuantity == null && other.getPurchaseOrderQuantity() == null || this.purchaseOrderQuantity != null && this.purchaseOrderQuantity.equals(other.getPurchaseOrderQuantity())) && (this.purchaseOrderQuantityDiff == null && other.getPurchaseOrderQuantityDiff() == null || this.purchaseOrderQuantityDiff != null && this.purchaseOrderQuantityDiff.equals(other.getPurchaseOrderQuantityDiff())) && (this.receiptAmount == null && other.getReceiptAmount() == null || this.receiptAmount != null && this.receiptAmount.equals(other.getReceiptAmount())) && (this.receiptQuantity == null && other.getReceiptQuantity() == null || this.receiptQuantity != null && this.receiptQuantity.equals(other.getReceiptQuantity())) && (this.receiptQuantityDiff == null && other.getReceiptQuantityDiff() == null || this.receiptQuantityDiff != null && this.receiptQuantityDiff.equals(other.getReceiptQuantityDiff())) && (this.state == null && other.getState() == null || this.state != null && this.state.equals(other.getState())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && this.subsidiary.equals(other.getSubsidiary())) && (this.taxEngine == null && other.getTaxEngine() == null || this.taxEngine != null && this.taxEngine.equals(other.getTaxEngine())) && (this.taxIdNum == null && other.getTaxIdNum() == null || this.taxIdNum != null && this.taxIdNum.equals(other.getTaxIdNum())) && (this.taxRegistrationNumber == null && other.getTaxRegistrationNumber() == null || this.taxRegistrationNumber != null && this.taxRegistrationNumber.equals(other.getTaxRegistrationNumber())) && (this.tranPrefix == null && other.getTranPrefix() == null || this.tranPrefix != null && this.tranPrefix.equals(other.getTranPrefix())) && (this.url == null && other.getUrl() == null || this.url != null && this.url.equals(other.getUrl())) && (this.validUntil == null && other.getValidUntil() == null || this.validUntil != null && this.validUntil.equals(other.getValidUntil())) && (this.zip == null && other.getZip() == null || this.zip != null && this.zip.equals(other.getZip())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
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
        if (this.getAccountingBook() != null) {
            _hashCode += this.getAccountingBook().hashCode();
        }
        if (this.getAccountingBookCurrency() != null) {
            _hashCode += this.getAccountingBookCurrency().hashCode();
        }
        if (this.getAddress() != null) {
            _hashCode += this.getAddress().hashCode();
        }
        if (this.getCity() != null) {
            _hashCode += this.getCity().hashCode();
        }
        if (this.getCountry() != null) {
            _hashCode += this.getCountry().hashCode();
        }
        if (this.getCurrency() != null) {
            _hashCode += this.getCurrency().hashCode();
        }
        if (this.getEffectiveFrom() != null) {
            _hashCode += this.getEffectiveFrom().hashCode();
        }
        if (this.getEmail() != null) {
            _hashCode += this.getEmail().hashCode();
        }
        if (this.getExternalId() != null) {
            _hashCode += this.getExternalId().hashCode();
        }
        if (this.getExternalIdString() != null) {
            _hashCode += this.getExternalIdString().hashCode();
        }
        if (this.getFax() != null) {
            _hashCode += this.getFax().hashCode();
        }
        if (this.getInternalId() != null) {
            _hashCode += this.getInternalId().hashCode();
        }
        if (this.getInternalIdNumber() != null) {
            _hashCode += this.getInternalIdNumber().hashCode();
        }
        if (this.getIsElimination() != null) {
            _hashCode += this.getIsElimination().hashCode();
        }
        if (this.getIsInactive() != null) {
            _hashCode += this.getIsInactive().hashCode();
        }
        if (this.getLegalName() != null) {
            _hashCode += this.getLegalName().hashCode();
        }
        if (this.getName() != null) {
            _hashCode += this.getName().hashCode();
        }
        if (this.getNameNoHierarchy() != null) {
            _hashCode += this.getNameNoHierarchy().hashCode();
        }
        if (this.getNexus() != null) {
            _hashCode += this.getNexus().hashCode();
        }
        if (this.getPhone() != null) {
            _hashCode += this.getPhone().hashCode();
        }
        if (this.getPrimary() != null) {
            _hashCode += this.getPrimary().hashCode();
        }
        if (this.getPurchaseOrderAmount() != null) {
            _hashCode += this.getPurchaseOrderAmount().hashCode();
        }
        if (this.getPurchaseOrderQuantity() != null) {
            _hashCode += this.getPurchaseOrderQuantity().hashCode();
        }
        if (this.getPurchaseOrderQuantityDiff() != null) {
            _hashCode += this.getPurchaseOrderQuantityDiff().hashCode();
        }
        if (this.getReceiptAmount() != null) {
            _hashCode += this.getReceiptAmount().hashCode();
        }
        if (this.getReceiptQuantity() != null) {
            _hashCode += this.getReceiptQuantity().hashCode();
        }
        if (this.getReceiptQuantityDiff() != null) {
            _hashCode += this.getReceiptQuantityDiff().hashCode();
        }
        if (this.getState() != null) {
            _hashCode += this.getState().hashCode();
        }
        if (this.getSubsidiary() != null) {
            _hashCode += this.getSubsidiary().hashCode();
        }
        if (this.getTaxEngine() != null) {
            _hashCode += this.getTaxEngine().hashCode();
        }
        if (this.getTaxIdNum() != null) {
            _hashCode += this.getTaxIdNum().hashCode();
        }
        if (this.getTaxRegistrationNumber() != null) {
            _hashCode += this.getTaxRegistrationNumber().hashCode();
        }
        if (this.getTranPrefix() != null) {
            _hashCode += this.getTranPrefix().hashCode();
        }
        if (this.getUrl() != null) {
            _hashCode += this.getUrl().hashCode();
        }
        if (this.getValidUntil() != null) {
            _hashCode += this.getValidUntil().hashCode();
        }
        if (this.getZip() != null) {
            _hashCode += this.getZip().hashCode();
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "MseSubsidiarySearchBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("accountingBook");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "accountingBook"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("accountingBookCurrency");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "accountingBookCurrency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "address"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "city"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "country"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("effectiveFrom");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "effectiveFrom"));
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
        elemField.setFieldName("externalId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "externalId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("externalIdString");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "externalIdString"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fax");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fax"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
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
        elemField.setFieldName("isElimination");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isElimination"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("legalName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "legalName"));
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
        elemField.setFieldName("nameNoHierarchy");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "nameNoHierarchy"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("nexus");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "nexus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "phone"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("primary");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "primary"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("purchaseOrderAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "purchaseOrderAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("purchaseOrderQuantity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "purchaseOrderQuantity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("purchaseOrderQuantityDiff");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "purchaseOrderQuantityDiff"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("receiptAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "receiptAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("receiptQuantity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "receiptQuantity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("receiptQuantityDiff");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "receiptQuantityDiff"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "state"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxEngine");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "taxEngine"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxIdNum");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "taxIdNum"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxRegistrationNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "taxRegistrationNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("tranPrefix");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "tranPrefix"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "url"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("validUntil");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "validUntil"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("zip");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "zip"));
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

