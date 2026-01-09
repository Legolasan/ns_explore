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

public class VendorSearchBasic
extends SearchRecordBasic
implements Serializable {
    private SearchStringField accountNumber;
    private SearchStringField address;
    private SearchStringField addressee;
    private SearchStringField addressLabel;
    private SearchStringField addressPhone;
    private SearchStringField attention;
    private SearchDoubleField balance;
    private SearchStringField billAddress;
    private SearchMultiSelectField category;
    private SearchStringField city;
    private SearchStringField comments;
    private SearchStringField contact;
    private SearchEnumMultiSelectField country;
    private SearchStringField county;
    private SearchDoubleField creditLimit;
    private SearchMultiSelectField currency;
    private SearchDoubleField currentExchangeRate;
    private SearchDateField dateCreated;
    private SearchMultiSelectField defaultTaxReg;
    private SearchStringField defaultTaxRegText;
    private SearchBooleanField eligibleForCommission;
    private SearchStringField email;
    private SearchEnumMultiSelectField emailPreference;
    private SearchBooleanField emailTransactions;
    private SearchStringField entityId;
    private SearchMultiSelectField expenseAccount;
    private SearchMultiSelectField externalId;
    private SearchStringField externalIdString;
    private SearchStringField fax;
    private SearchBooleanField faxTransactions;
    private SearchStringField firstName;
    private SearchDoubleField fxBalance;
    private SearchDoubleField fxUnbilledOrders;
    private SearchBooleanField giveAccess;
    private SearchEnumMultiSelectField globalSubscriptionStatus;
    private SearchMultiSelectField group;
    private SearchBooleanField hasDuplicates;
    private SearchStringField image;
    private SearchMultiSelectField incoterm;
    private SearchMultiSelectField internalId;
    private SearchLongField internalIdNumber;
    private SearchBooleanField is1099Eligible;
    private SearchBooleanField isDefaultBilling;
    private SearchBooleanField isDefaultShipping;
    private SearchBooleanField isInactive;
    private SearchBooleanField isJobResourceVend;
    private SearchBooleanField isPerson;
    private SearchDoubleField laborCost;
    private SearchEnumMultiSelectField language;
    private SearchDateField lastModifiedDate;
    private SearchStringField lastName;
    private SearchEnumMultiSelectField level;
    private SearchStringField middleName;
    private SearchEnumMultiSelectField otherRelationships;
    private SearchMultiSelectField payablesAccount;
    private SearchStringField pec;
    private SearchEnumMultiSelectField permission;
    private SearchStringField phone;
    private SearchStringField phoneticName;
    private SearchDoubleField predConfidence;
    private SearchDoubleField predictedDays;
    private SearchBooleanField printTransactions;
    private SearchDoubleField purchaseOrderAmount;
    private SearchDoubleField purchaseOrderQuantity;
    private SearchDoubleField purchaseOrderQuantityDiff;
    private SearchDoubleField receiptAmount;
    private SearchDoubleField receiptQuantity;
    private SearchDoubleField receiptQuantityDiff;
    private SearchStringField salutation;
    private SearchStringField shipAddress;
    private SearchStringField state;
    private SearchMultiSelectField subsidiary;
    private SearchStringField taxIdNum;
    private SearchMultiSelectField timeApprover;
    private SearchStringField title;
    private SearchDoubleField unbilledOrders;
    private SearchStringField url;
    private SearchStringField vatRegNumber;
    private SearchMultiSelectField workCalendar;
    private SearchStringField zipCode;
    private SearchCustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(VendorSearchBasic.class, true);

    public VendorSearchBasic() {
    }

    public VendorSearchBasic(SearchStringField accountNumber, SearchStringField address, SearchStringField addressee, SearchStringField addressLabel, SearchStringField addressPhone, SearchStringField attention, SearchDoubleField balance, SearchStringField billAddress, SearchMultiSelectField category, SearchStringField city, SearchStringField comments, SearchStringField contact, SearchEnumMultiSelectField country, SearchStringField county, SearchDoubleField creditLimit, SearchMultiSelectField currency, SearchDoubleField currentExchangeRate, SearchDateField dateCreated, SearchMultiSelectField defaultTaxReg, SearchStringField defaultTaxRegText, SearchBooleanField eligibleForCommission, SearchStringField email, SearchEnumMultiSelectField emailPreference, SearchBooleanField emailTransactions, SearchStringField entityId, SearchMultiSelectField expenseAccount, SearchMultiSelectField externalId, SearchStringField externalIdString, SearchStringField fax, SearchBooleanField faxTransactions, SearchStringField firstName, SearchDoubleField fxBalance, SearchDoubleField fxUnbilledOrders, SearchBooleanField giveAccess, SearchEnumMultiSelectField globalSubscriptionStatus, SearchMultiSelectField group, SearchBooleanField hasDuplicates, SearchStringField image, SearchMultiSelectField incoterm, SearchMultiSelectField internalId, SearchLongField internalIdNumber, SearchBooleanField is1099Eligible, SearchBooleanField isDefaultBilling, SearchBooleanField isDefaultShipping, SearchBooleanField isInactive, SearchBooleanField isJobResourceVend, SearchBooleanField isPerson, SearchDoubleField laborCost, SearchEnumMultiSelectField language, SearchDateField lastModifiedDate, SearchStringField lastName, SearchEnumMultiSelectField level, SearchStringField middleName, SearchEnumMultiSelectField otherRelationships, SearchMultiSelectField payablesAccount, SearchStringField pec, SearchEnumMultiSelectField permission, SearchStringField phone, SearchStringField phoneticName, SearchDoubleField predConfidence, SearchDoubleField predictedDays, SearchBooleanField printTransactions, SearchDoubleField purchaseOrderAmount, SearchDoubleField purchaseOrderQuantity, SearchDoubleField purchaseOrderQuantityDiff, SearchDoubleField receiptAmount, SearchDoubleField receiptQuantity, SearchDoubleField receiptQuantityDiff, SearchStringField salutation, SearchStringField shipAddress, SearchStringField state, SearchMultiSelectField subsidiary, SearchStringField taxIdNum, SearchMultiSelectField timeApprover, SearchStringField title, SearchDoubleField unbilledOrders, SearchStringField url, SearchStringField vatRegNumber, SearchMultiSelectField workCalendar, SearchStringField zipCode, SearchCustomFieldList customFieldList) {
        this.accountNumber = accountNumber;
        this.address = address;
        this.addressee = addressee;
        this.addressLabel = addressLabel;
        this.addressPhone = addressPhone;
        this.attention = attention;
        this.balance = balance;
        this.billAddress = billAddress;
        this.category = category;
        this.city = city;
        this.comments = comments;
        this.contact = contact;
        this.country = country;
        this.county = county;
        this.creditLimit = creditLimit;
        this.currency = currency;
        this.currentExchangeRate = currentExchangeRate;
        this.dateCreated = dateCreated;
        this.defaultTaxReg = defaultTaxReg;
        this.defaultTaxRegText = defaultTaxRegText;
        this.eligibleForCommission = eligibleForCommission;
        this.email = email;
        this.emailPreference = emailPreference;
        this.emailTransactions = emailTransactions;
        this.entityId = entityId;
        this.expenseAccount = expenseAccount;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.fax = fax;
        this.faxTransactions = faxTransactions;
        this.firstName = firstName;
        this.fxBalance = fxBalance;
        this.fxUnbilledOrders = fxUnbilledOrders;
        this.giveAccess = giveAccess;
        this.globalSubscriptionStatus = globalSubscriptionStatus;
        this.group = group;
        this.hasDuplicates = hasDuplicates;
        this.image = image;
        this.incoterm = incoterm;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.is1099Eligible = is1099Eligible;
        this.isDefaultBilling = isDefaultBilling;
        this.isDefaultShipping = isDefaultShipping;
        this.isInactive = isInactive;
        this.isJobResourceVend = isJobResourceVend;
        this.isPerson = isPerson;
        this.laborCost = laborCost;
        this.language = language;
        this.lastModifiedDate = lastModifiedDate;
        this.lastName = lastName;
        this.level = level;
        this.middleName = middleName;
        this.otherRelationships = otherRelationships;
        this.payablesAccount = payablesAccount;
        this.pec = pec;
        this.permission = permission;
        this.phone = phone;
        this.phoneticName = phoneticName;
        this.predConfidence = predConfidence;
        this.predictedDays = predictedDays;
        this.printTransactions = printTransactions;
        this.purchaseOrderAmount = purchaseOrderAmount;
        this.purchaseOrderQuantity = purchaseOrderQuantity;
        this.purchaseOrderQuantityDiff = purchaseOrderQuantityDiff;
        this.receiptAmount = receiptAmount;
        this.receiptQuantity = receiptQuantity;
        this.receiptQuantityDiff = receiptQuantityDiff;
        this.salutation = salutation;
        this.shipAddress = shipAddress;
        this.state = state;
        this.subsidiary = subsidiary;
        this.taxIdNum = taxIdNum;
        this.timeApprover = timeApprover;
        this.title = title;
        this.unbilledOrders = unbilledOrders;
        this.url = url;
        this.vatRegNumber = vatRegNumber;
        this.workCalendar = workCalendar;
        this.zipCode = zipCode;
        this.customFieldList = customFieldList;
    }

    public SearchStringField getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(SearchStringField accountNumber) {
        this.accountNumber = accountNumber;
    }

    public SearchStringField getAddress() {
        return this.address;
    }

    public void setAddress(SearchStringField address) {
        this.address = address;
    }

    public SearchStringField getAddressee() {
        return this.addressee;
    }

    public void setAddressee(SearchStringField addressee) {
        this.addressee = addressee;
    }

    public SearchStringField getAddressLabel() {
        return this.addressLabel;
    }

    public void setAddressLabel(SearchStringField addressLabel) {
        this.addressLabel = addressLabel;
    }

    public SearchStringField getAddressPhone() {
        return this.addressPhone;
    }

    public void setAddressPhone(SearchStringField addressPhone) {
        this.addressPhone = addressPhone;
    }

    public SearchStringField getAttention() {
        return this.attention;
    }

    public void setAttention(SearchStringField attention) {
        this.attention = attention;
    }

    public SearchDoubleField getBalance() {
        return this.balance;
    }

    public void setBalance(SearchDoubleField balance) {
        this.balance = balance;
    }

    public SearchStringField getBillAddress() {
        return this.billAddress;
    }

    public void setBillAddress(SearchStringField billAddress) {
        this.billAddress = billAddress;
    }

    public SearchMultiSelectField getCategory() {
        return this.category;
    }

    public void setCategory(SearchMultiSelectField category) {
        this.category = category;
    }

    public SearchStringField getCity() {
        return this.city;
    }

    public void setCity(SearchStringField city) {
        this.city = city;
    }

    public SearchStringField getComments() {
        return this.comments;
    }

    public void setComments(SearchStringField comments) {
        this.comments = comments;
    }

    public SearchStringField getContact() {
        return this.contact;
    }

    public void setContact(SearchStringField contact) {
        this.contact = contact;
    }

    public SearchEnumMultiSelectField getCountry() {
        return this.country;
    }

    public void setCountry(SearchEnumMultiSelectField country) {
        this.country = country;
    }

    public SearchStringField getCounty() {
        return this.county;
    }

    public void setCounty(SearchStringField county) {
        this.county = county;
    }

    public SearchDoubleField getCreditLimit() {
        return this.creditLimit;
    }

    public void setCreditLimit(SearchDoubleField creditLimit) {
        this.creditLimit = creditLimit;
    }

    public SearchMultiSelectField getCurrency() {
        return this.currency;
    }

    public void setCurrency(SearchMultiSelectField currency) {
        this.currency = currency;
    }

    public SearchDoubleField getCurrentExchangeRate() {
        return this.currentExchangeRate;
    }

    public void setCurrentExchangeRate(SearchDoubleField currentExchangeRate) {
        this.currentExchangeRate = currentExchangeRate;
    }

    public SearchDateField getDateCreated() {
        return this.dateCreated;
    }

    public void setDateCreated(SearchDateField dateCreated) {
        this.dateCreated = dateCreated;
    }

    public SearchMultiSelectField getDefaultTaxReg() {
        return this.defaultTaxReg;
    }

    public void setDefaultTaxReg(SearchMultiSelectField defaultTaxReg) {
        this.defaultTaxReg = defaultTaxReg;
    }

    public SearchStringField getDefaultTaxRegText() {
        return this.defaultTaxRegText;
    }

    public void setDefaultTaxRegText(SearchStringField defaultTaxRegText) {
        this.defaultTaxRegText = defaultTaxRegText;
    }

    public SearchBooleanField getEligibleForCommission() {
        return this.eligibleForCommission;
    }

    public void setEligibleForCommission(SearchBooleanField eligibleForCommission) {
        this.eligibleForCommission = eligibleForCommission;
    }

    public SearchStringField getEmail() {
        return this.email;
    }

    public void setEmail(SearchStringField email) {
        this.email = email;
    }

    public SearchEnumMultiSelectField getEmailPreference() {
        return this.emailPreference;
    }

    public void setEmailPreference(SearchEnumMultiSelectField emailPreference) {
        this.emailPreference = emailPreference;
    }

    public SearchBooleanField getEmailTransactions() {
        return this.emailTransactions;
    }

    public void setEmailTransactions(SearchBooleanField emailTransactions) {
        this.emailTransactions = emailTransactions;
    }

    public SearchStringField getEntityId() {
        return this.entityId;
    }

    public void setEntityId(SearchStringField entityId) {
        this.entityId = entityId;
    }

    public SearchMultiSelectField getExpenseAccount() {
        return this.expenseAccount;
    }

    public void setExpenseAccount(SearchMultiSelectField expenseAccount) {
        this.expenseAccount = expenseAccount;
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

    public SearchBooleanField getFaxTransactions() {
        return this.faxTransactions;
    }

    public void setFaxTransactions(SearchBooleanField faxTransactions) {
        this.faxTransactions = faxTransactions;
    }

    public SearchStringField getFirstName() {
        return this.firstName;
    }

    public void setFirstName(SearchStringField firstName) {
        this.firstName = firstName;
    }

    public SearchDoubleField getFxBalance() {
        return this.fxBalance;
    }

    public void setFxBalance(SearchDoubleField fxBalance) {
        this.fxBalance = fxBalance;
    }

    public SearchDoubleField getFxUnbilledOrders() {
        return this.fxUnbilledOrders;
    }

    public void setFxUnbilledOrders(SearchDoubleField fxUnbilledOrders) {
        this.fxUnbilledOrders = fxUnbilledOrders;
    }

    public SearchBooleanField getGiveAccess() {
        return this.giveAccess;
    }

    public void setGiveAccess(SearchBooleanField giveAccess) {
        this.giveAccess = giveAccess;
    }

    public SearchEnumMultiSelectField getGlobalSubscriptionStatus() {
        return this.globalSubscriptionStatus;
    }

    public void setGlobalSubscriptionStatus(SearchEnumMultiSelectField globalSubscriptionStatus) {
        this.globalSubscriptionStatus = globalSubscriptionStatus;
    }

    public SearchMultiSelectField getGroup() {
        return this.group;
    }

    public void setGroup(SearchMultiSelectField group) {
        this.group = group;
    }

    public SearchBooleanField getHasDuplicates() {
        return this.hasDuplicates;
    }

    public void setHasDuplicates(SearchBooleanField hasDuplicates) {
        this.hasDuplicates = hasDuplicates;
    }

    public SearchStringField getImage() {
        return this.image;
    }

    public void setImage(SearchStringField image) {
        this.image = image;
    }

    public SearchMultiSelectField getIncoterm() {
        return this.incoterm;
    }

    public void setIncoterm(SearchMultiSelectField incoterm) {
        this.incoterm = incoterm;
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

    public SearchBooleanField getIs1099Eligible() {
        return this.is1099Eligible;
    }

    public void setIs1099Eligible(SearchBooleanField is1099Eligible) {
        this.is1099Eligible = is1099Eligible;
    }

    public SearchBooleanField getIsDefaultBilling() {
        return this.isDefaultBilling;
    }

    public void setIsDefaultBilling(SearchBooleanField isDefaultBilling) {
        this.isDefaultBilling = isDefaultBilling;
    }

    public SearchBooleanField getIsDefaultShipping() {
        return this.isDefaultShipping;
    }

    public void setIsDefaultShipping(SearchBooleanField isDefaultShipping) {
        this.isDefaultShipping = isDefaultShipping;
    }

    public SearchBooleanField getIsInactive() {
        return this.isInactive;
    }

    public void setIsInactive(SearchBooleanField isInactive) {
        this.isInactive = isInactive;
    }

    public SearchBooleanField getIsJobResourceVend() {
        return this.isJobResourceVend;
    }

    public void setIsJobResourceVend(SearchBooleanField isJobResourceVend) {
        this.isJobResourceVend = isJobResourceVend;
    }

    public SearchBooleanField getIsPerson() {
        return this.isPerson;
    }

    public void setIsPerson(SearchBooleanField isPerson) {
        this.isPerson = isPerson;
    }

    public SearchDoubleField getLaborCost() {
        return this.laborCost;
    }

    public void setLaborCost(SearchDoubleField laborCost) {
        this.laborCost = laborCost;
    }

    public SearchEnumMultiSelectField getLanguage() {
        return this.language;
    }

    public void setLanguage(SearchEnumMultiSelectField language) {
        this.language = language;
    }

    public SearchDateField getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    public void setLastModifiedDate(SearchDateField lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public SearchStringField getLastName() {
        return this.lastName;
    }

    public void setLastName(SearchStringField lastName) {
        this.lastName = lastName;
    }

    public SearchEnumMultiSelectField getLevel() {
        return this.level;
    }

    public void setLevel(SearchEnumMultiSelectField level) {
        this.level = level;
    }

    public SearchStringField getMiddleName() {
        return this.middleName;
    }

    public void setMiddleName(SearchStringField middleName) {
        this.middleName = middleName;
    }

    public SearchEnumMultiSelectField getOtherRelationships() {
        return this.otherRelationships;
    }

    public void setOtherRelationships(SearchEnumMultiSelectField otherRelationships) {
        this.otherRelationships = otherRelationships;
    }

    public SearchMultiSelectField getPayablesAccount() {
        return this.payablesAccount;
    }

    public void setPayablesAccount(SearchMultiSelectField payablesAccount) {
        this.payablesAccount = payablesAccount;
    }

    public SearchStringField getPec() {
        return this.pec;
    }

    public void setPec(SearchStringField pec) {
        this.pec = pec;
    }

    public SearchEnumMultiSelectField getPermission() {
        return this.permission;
    }

    public void setPermission(SearchEnumMultiSelectField permission) {
        this.permission = permission;
    }

    public SearchStringField getPhone() {
        return this.phone;
    }

    public void setPhone(SearchStringField phone) {
        this.phone = phone;
    }

    public SearchStringField getPhoneticName() {
        return this.phoneticName;
    }

    public void setPhoneticName(SearchStringField phoneticName) {
        this.phoneticName = phoneticName;
    }

    public SearchDoubleField getPredConfidence() {
        return this.predConfidence;
    }

    public void setPredConfidence(SearchDoubleField predConfidence) {
        this.predConfidence = predConfidence;
    }

    public SearchDoubleField getPredictedDays() {
        return this.predictedDays;
    }

    public void setPredictedDays(SearchDoubleField predictedDays) {
        this.predictedDays = predictedDays;
    }

    public SearchBooleanField getPrintTransactions() {
        return this.printTransactions;
    }

    public void setPrintTransactions(SearchBooleanField printTransactions) {
        this.printTransactions = printTransactions;
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

    public SearchStringField getSalutation() {
        return this.salutation;
    }

    public void setSalutation(SearchStringField salutation) {
        this.salutation = salutation;
    }

    public SearchStringField getShipAddress() {
        return this.shipAddress;
    }

    public void setShipAddress(SearchStringField shipAddress) {
        this.shipAddress = shipAddress;
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

    public SearchStringField getTaxIdNum() {
        return this.taxIdNum;
    }

    public void setTaxIdNum(SearchStringField taxIdNum) {
        this.taxIdNum = taxIdNum;
    }

    public SearchMultiSelectField getTimeApprover() {
        return this.timeApprover;
    }

    public void setTimeApprover(SearchMultiSelectField timeApprover) {
        this.timeApprover = timeApprover;
    }

    public SearchStringField getTitle() {
        return this.title;
    }

    public void setTitle(SearchStringField title) {
        this.title = title;
    }

    public SearchDoubleField getUnbilledOrders() {
        return this.unbilledOrders;
    }

    public void setUnbilledOrders(SearchDoubleField unbilledOrders) {
        this.unbilledOrders = unbilledOrders;
    }

    public SearchStringField getUrl() {
        return this.url;
    }

    public void setUrl(SearchStringField url) {
        this.url = url;
    }

    public SearchStringField getVatRegNumber() {
        return this.vatRegNumber;
    }

    public void setVatRegNumber(SearchStringField vatRegNumber) {
        this.vatRegNumber = vatRegNumber;
    }

    public SearchMultiSelectField getWorkCalendar() {
        return this.workCalendar;
    }

    public void setWorkCalendar(SearchMultiSelectField workCalendar) {
        this.workCalendar = workCalendar;
    }

    public SearchStringField getZipCode() {
        return this.zipCode;
    }

    public void setZipCode(SearchStringField zipCode) {
        this.zipCode = zipCode;
    }

    public SearchCustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof VendorSearchBasic)) {
            return false;
        }
        VendorSearchBasic other = (VendorSearchBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.accountNumber == null && other.getAccountNumber() == null || this.accountNumber != null && this.accountNumber.equals(other.getAccountNumber())) && (this.address == null && other.getAddress() == null || this.address != null && this.address.equals(other.getAddress())) && (this.addressee == null && other.getAddressee() == null || this.addressee != null && this.addressee.equals(other.getAddressee())) && (this.addressLabel == null && other.getAddressLabel() == null || this.addressLabel != null && this.addressLabel.equals(other.getAddressLabel())) && (this.addressPhone == null && other.getAddressPhone() == null || this.addressPhone != null && this.addressPhone.equals(other.getAddressPhone())) && (this.attention == null && other.getAttention() == null || this.attention != null && this.attention.equals(other.getAttention())) && (this.balance == null && other.getBalance() == null || this.balance != null && this.balance.equals(other.getBalance())) && (this.billAddress == null && other.getBillAddress() == null || this.billAddress != null && this.billAddress.equals(other.getBillAddress())) && (this.category == null && other.getCategory() == null || this.category != null && this.category.equals(other.getCategory())) && (this.city == null && other.getCity() == null || this.city != null && this.city.equals(other.getCity())) && (this.comments == null && other.getComments() == null || this.comments != null && this.comments.equals(other.getComments())) && (this.contact == null && other.getContact() == null || this.contact != null && this.contact.equals(other.getContact())) && (this.country == null && other.getCountry() == null || this.country != null && this.country.equals(other.getCountry())) && (this.county == null && other.getCounty() == null || this.county != null && this.county.equals(other.getCounty())) && (this.creditLimit == null && other.getCreditLimit() == null || this.creditLimit != null && this.creditLimit.equals(other.getCreditLimit())) && (this.currency == null && other.getCurrency() == null || this.currency != null && this.currency.equals(other.getCurrency())) && (this.currentExchangeRate == null && other.getCurrentExchangeRate() == null || this.currentExchangeRate != null && this.currentExchangeRate.equals(other.getCurrentExchangeRate())) && (this.dateCreated == null && other.getDateCreated() == null || this.dateCreated != null && this.dateCreated.equals(other.getDateCreated())) && (this.defaultTaxReg == null && other.getDefaultTaxReg() == null || this.defaultTaxReg != null && this.defaultTaxReg.equals(other.getDefaultTaxReg())) && (this.defaultTaxRegText == null && other.getDefaultTaxRegText() == null || this.defaultTaxRegText != null && this.defaultTaxRegText.equals(other.getDefaultTaxRegText())) && (this.eligibleForCommission == null && other.getEligibleForCommission() == null || this.eligibleForCommission != null && this.eligibleForCommission.equals(other.getEligibleForCommission())) && (this.email == null && other.getEmail() == null || this.email != null && this.email.equals(other.getEmail())) && (this.emailPreference == null && other.getEmailPreference() == null || this.emailPreference != null && this.emailPreference.equals(other.getEmailPreference())) && (this.emailTransactions == null && other.getEmailTransactions() == null || this.emailTransactions != null && this.emailTransactions.equals(other.getEmailTransactions())) && (this.entityId == null && other.getEntityId() == null || this.entityId != null && this.entityId.equals(other.getEntityId())) && (this.expenseAccount == null && other.getExpenseAccount() == null || this.expenseAccount != null && this.expenseAccount.equals(other.getExpenseAccount())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId())) && (this.externalIdString == null && other.getExternalIdString() == null || this.externalIdString != null && this.externalIdString.equals(other.getExternalIdString())) && (this.fax == null && other.getFax() == null || this.fax != null && this.fax.equals(other.getFax())) && (this.faxTransactions == null && other.getFaxTransactions() == null || this.faxTransactions != null && this.faxTransactions.equals(other.getFaxTransactions())) && (this.firstName == null && other.getFirstName() == null || this.firstName != null && this.firstName.equals(other.getFirstName())) && (this.fxBalance == null && other.getFxBalance() == null || this.fxBalance != null && this.fxBalance.equals(other.getFxBalance())) && (this.fxUnbilledOrders == null && other.getFxUnbilledOrders() == null || this.fxUnbilledOrders != null && this.fxUnbilledOrders.equals(other.getFxUnbilledOrders())) && (this.giveAccess == null && other.getGiveAccess() == null || this.giveAccess != null && this.giveAccess.equals(other.getGiveAccess())) && (this.globalSubscriptionStatus == null && other.getGlobalSubscriptionStatus() == null || this.globalSubscriptionStatus != null && this.globalSubscriptionStatus.equals(other.getGlobalSubscriptionStatus())) && (this.group == null && other.getGroup() == null || this.group != null && this.group.equals(other.getGroup())) && (this.hasDuplicates == null && other.getHasDuplicates() == null || this.hasDuplicates != null && this.hasDuplicates.equals(other.getHasDuplicates())) && (this.image == null && other.getImage() == null || this.image != null && this.image.equals(other.getImage())) && (this.incoterm == null && other.getIncoterm() == null || this.incoterm != null && this.incoterm.equals(other.getIncoterm())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.internalIdNumber == null && other.getInternalIdNumber() == null || this.internalIdNumber != null && this.internalIdNumber.equals(other.getInternalIdNumber())) && (this.is1099Eligible == null && other.getIs1099Eligible() == null || this.is1099Eligible != null && this.is1099Eligible.equals(other.getIs1099Eligible())) && (this.isDefaultBilling == null && other.getIsDefaultBilling() == null || this.isDefaultBilling != null && this.isDefaultBilling.equals(other.getIsDefaultBilling())) && (this.isDefaultShipping == null && other.getIsDefaultShipping() == null || this.isDefaultShipping != null && this.isDefaultShipping.equals(other.getIsDefaultShipping())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && this.isInactive.equals(other.getIsInactive())) && (this.isJobResourceVend == null && other.getIsJobResourceVend() == null || this.isJobResourceVend != null && this.isJobResourceVend.equals(other.getIsJobResourceVend())) && (this.isPerson == null && other.getIsPerson() == null || this.isPerson != null && this.isPerson.equals(other.getIsPerson())) && (this.laborCost == null && other.getLaborCost() == null || this.laborCost != null && this.laborCost.equals(other.getLaborCost())) && (this.language == null && other.getLanguage() == null || this.language != null && this.language.equals(other.getLanguage())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && this.lastModifiedDate.equals(other.getLastModifiedDate())) && (this.lastName == null && other.getLastName() == null || this.lastName != null && this.lastName.equals(other.getLastName())) && (this.level == null && other.getLevel() == null || this.level != null && this.level.equals(other.getLevel())) && (this.middleName == null && other.getMiddleName() == null || this.middleName != null && this.middleName.equals(other.getMiddleName())) && (this.otherRelationships == null && other.getOtherRelationships() == null || this.otherRelationships != null && this.otherRelationships.equals(other.getOtherRelationships())) && (this.payablesAccount == null && other.getPayablesAccount() == null || this.payablesAccount != null && this.payablesAccount.equals(other.getPayablesAccount())) && (this.pec == null && other.getPec() == null || this.pec != null && this.pec.equals(other.getPec())) && (this.permission == null && other.getPermission() == null || this.permission != null && this.permission.equals(other.getPermission())) && (this.phone == null && other.getPhone() == null || this.phone != null && this.phone.equals(other.getPhone())) && (this.phoneticName == null && other.getPhoneticName() == null || this.phoneticName != null && this.phoneticName.equals(other.getPhoneticName())) && (this.predConfidence == null && other.getPredConfidence() == null || this.predConfidence != null && this.predConfidence.equals(other.getPredConfidence())) && (this.predictedDays == null && other.getPredictedDays() == null || this.predictedDays != null && this.predictedDays.equals(other.getPredictedDays())) && (this.printTransactions == null && other.getPrintTransactions() == null || this.printTransactions != null && this.printTransactions.equals(other.getPrintTransactions())) && (this.purchaseOrderAmount == null && other.getPurchaseOrderAmount() == null || this.purchaseOrderAmount != null && this.purchaseOrderAmount.equals(other.getPurchaseOrderAmount())) && (this.purchaseOrderQuantity == null && other.getPurchaseOrderQuantity() == null || this.purchaseOrderQuantity != null && this.purchaseOrderQuantity.equals(other.getPurchaseOrderQuantity())) && (this.purchaseOrderQuantityDiff == null && other.getPurchaseOrderQuantityDiff() == null || this.purchaseOrderQuantityDiff != null && this.purchaseOrderQuantityDiff.equals(other.getPurchaseOrderQuantityDiff())) && (this.receiptAmount == null && other.getReceiptAmount() == null || this.receiptAmount != null && this.receiptAmount.equals(other.getReceiptAmount())) && (this.receiptQuantity == null && other.getReceiptQuantity() == null || this.receiptQuantity != null && this.receiptQuantity.equals(other.getReceiptQuantity())) && (this.receiptQuantityDiff == null && other.getReceiptQuantityDiff() == null || this.receiptQuantityDiff != null && this.receiptQuantityDiff.equals(other.getReceiptQuantityDiff())) && (this.salutation == null && other.getSalutation() == null || this.salutation != null && this.salutation.equals(other.getSalutation())) && (this.shipAddress == null && other.getShipAddress() == null || this.shipAddress != null && this.shipAddress.equals(other.getShipAddress())) && (this.state == null && other.getState() == null || this.state != null && this.state.equals(other.getState())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && this.subsidiary.equals(other.getSubsidiary())) && (this.taxIdNum == null && other.getTaxIdNum() == null || this.taxIdNum != null && this.taxIdNum.equals(other.getTaxIdNum())) && (this.timeApprover == null && other.getTimeApprover() == null || this.timeApprover != null && this.timeApprover.equals(other.getTimeApprover())) && (this.title == null && other.getTitle() == null || this.title != null && this.title.equals(other.getTitle())) && (this.unbilledOrders == null && other.getUnbilledOrders() == null || this.unbilledOrders != null && this.unbilledOrders.equals(other.getUnbilledOrders())) && (this.url == null && other.getUrl() == null || this.url != null && this.url.equals(other.getUrl())) && (this.vatRegNumber == null && other.getVatRegNumber() == null || this.vatRegNumber != null && this.vatRegNumber.equals(other.getVatRegNumber())) && (this.workCalendar == null && other.getWorkCalendar() == null || this.workCalendar != null && this.workCalendar.equals(other.getWorkCalendar())) && (this.zipCode == null && other.getZipCode() == null || this.zipCode != null && this.zipCode.equals(other.getZipCode())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
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
        if (this.getAccountNumber() != null) {
            _hashCode += this.getAccountNumber().hashCode();
        }
        if (this.getAddress() != null) {
            _hashCode += this.getAddress().hashCode();
        }
        if (this.getAddressee() != null) {
            _hashCode += this.getAddressee().hashCode();
        }
        if (this.getAddressLabel() != null) {
            _hashCode += this.getAddressLabel().hashCode();
        }
        if (this.getAddressPhone() != null) {
            _hashCode += this.getAddressPhone().hashCode();
        }
        if (this.getAttention() != null) {
            _hashCode += this.getAttention().hashCode();
        }
        if (this.getBalance() != null) {
            _hashCode += this.getBalance().hashCode();
        }
        if (this.getBillAddress() != null) {
            _hashCode += this.getBillAddress().hashCode();
        }
        if (this.getCategory() != null) {
            _hashCode += this.getCategory().hashCode();
        }
        if (this.getCity() != null) {
            _hashCode += this.getCity().hashCode();
        }
        if (this.getComments() != null) {
            _hashCode += this.getComments().hashCode();
        }
        if (this.getContact() != null) {
            _hashCode += this.getContact().hashCode();
        }
        if (this.getCountry() != null) {
            _hashCode += this.getCountry().hashCode();
        }
        if (this.getCounty() != null) {
            _hashCode += this.getCounty().hashCode();
        }
        if (this.getCreditLimit() != null) {
            _hashCode += this.getCreditLimit().hashCode();
        }
        if (this.getCurrency() != null) {
            _hashCode += this.getCurrency().hashCode();
        }
        if (this.getCurrentExchangeRate() != null) {
            _hashCode += this.getCurrentExchangeRate().hashCode();
        }
        if (this.getDateCreated() != null) {
            _hashCode += this.getDateCreated().hashCode();
        }
        if (this.getDefaultTaxReg() != null) {
            _hashCode += this.getDefaultTaxReg().hashCode();
        }
        if (this.getDefaultTaxRegText() != null) {
            _hashCode += this.getDefaultTaxRegText().hashCode();
        }
        if (this.getEligibleForCommission() != null) {
            _hashCode += this.getEligibleForCommission().hashCode();
        }
        if (this.getEmail() != null) {
            _hashCode += this.getEmail().hashCode();
        }
        if (this.getEmailPreference() != null) {
            _hashCode += this.getEmailPreference().hashCode();
        }
        if (this.getEmailTransactions() != null) {
            _hashCode += this.getEmailTransactions().hashCode();
        }
        if (this.getEntityId() != null) {
            _hashCode += this.getEntityId().hashCode();
        }
        if (this.getExpenseAccount() != null) {
            _hashCode += this.getExpenseAccount().hashCode();
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
        if (this.getFaxTransactions() != null) {
            _hashCode += this.getFaxTransactions().hashCode();
        }
        if (this.getFirstName() != null) {
            _hashCode += this.getFirstName().hashCode();
        }
        if (this.getFxBalance() != null) {
            _hashCode += this.getFxBalance().hashCode();
        }
        if (this.getFxUnbilledOrders() != null) {
            _hashCode += this.getFxUnbilledOrders().hashCode();
        }
        if (this.getGiveAccess() != null) {
            _hashCode += this.getGiveAccess().hashCode();
        }
        if (this.getGlobalSubscriptionStatus() != null) {
            _hashCode += this.getGlobalSubscriptionStatus().hashCode();
        }
        if (this.getGroup() != null) {
            _hashCode += this.getGroup().hashCode();
        }
        if (this.getHasDuplicates() != null) {
            _hashCode += this.getHasDuplicates().hashCode();
        }
        if (this.getImage() != null) {
            _hashCode += this.getImage().hashCode();
        }
        if (this.getIncoterm() != null) {
            _hashCode += this.getIncoterm().hashCode();
        }
        if (this.getInternalId() != null) {
            _hashCode += this.getInternalId().hashCode();
        }
        if (this.getInternalIdNumber() != null) {
            _hashCode += this.getInternalIdNumber().hashCode();
        }
        if (this.getIs1099Eligible() != null) {
            _hashCode += this.getIs1099Eligible().hashCode();
        }
        if (this.getIsDefaultBilling() != null) {
            _hashCode += this.getIsDefaultBilling().hashCode();
        }
        if (this.getIsDefaultShipping() != null) {
            _hashCode += this.getIsDefaultShipping().hashCode();
        }
        if (this.getIsInactive() != null) {
            _hashCode += this.getIsInactive().hashCode();
        }
        if (this.getIsJobResourceVend() != null) {
            _hashCode += this.getIsJobResourceVend().hashCode();
        }
        if (this.getIsPerson() != null) {
            _hashCode += this.getIsPerson().hashCode();
        }
        if (this.getLaborCost() != null) {
            _hashCode += this.getLaborCost().hashCode();
        }
        if (this.getLanguage() != null) {
            _hashCode += this.getLanguage().hashCode();
        }
        if (this.getLastModifiedDate() != null) {
            _hashCode += this.getLastModifiedDate().hashCode();
        }
        if (this.getLastName() != null) {
            _hashCode += this.getLastName().hashCode();
        }
        if (this.getLevel() != null) {
            _hashCode += this.getLevel().hashCode();
        }
        if (this.getMiddleName() != null) {
            _hashCode += this.getMiddleName().hashCode();
        }
        if (this.getOtherRelationships() != null) {
            _hashCode += this.getOtherRelationships().hashCode();
        }
        if (this.getPayablesAccount() != null) {
            _hashCode += this.getPayablesAccount().hashCode();
        }
        if (this.getPec() != null) {
            _hashCode += this.getPec().hashCode();
        }
        if (this.getPermission() != null) {
            _hashCode += this.getPermission().hashCode();
        }
        if (this.getPhone() != null) {
            _hashCode += this.getPhone().hashCode();
        }
        if (this.getPhoneticName() != null) {
            _hashCode += this.getPhoneticName().hashCode();
        }
        if (this.getPredConfidence() != null) {
            _hashCode += this.getPredConfidence().hashCode();
        }
        if (this.getPredictedDays() != null) {
            _hashCode += this.getPredictedDays().hashCode();
        }
        if (this.getPrintTransactions() != null) {
            _hashCode += this.getPrintTransactions().hashCode();
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
        if (this.getSalutation() != null) {
            _hashCode += this.getSalutation().hashCode();
        }
        if (this.getShipAddress() != null) {
            _hashCode += this.getShipAddress().hashCode();
        }
        if (this.getState() != null) {
            _hashCode += this.getState().hashCode();
        }
        if (this.getSubsidiary() != null) {
            _hashCode += this.getSubsidiary().hashCode();
        }
        if (this.getTaxIdNum() != null) {
            _hashCode += this.getTaxIdNum().hashCode();
        }
        if (this.getTimeApprover() != null) {
            _hashCode += this.getTimeApprover().hashCode();
        }
        if (this.getTitle() != null) {
            _hashCode += this.getTitle().hashCode();
        }
        if (this.getUnbilledOrders() != null) {
            _hashCode += this.getUnbilledOrders().hashCode();
        }
        if (this.getUrl() != null) {
            _hashCode += this.getUrl().hashCode();
        }
        if (this.getVatRegNumber() != null) {
            _hashCode += this.getVatRegNumber().hashCode();
        }
        if (this.getWorkCalendar() != null) {
            _hashCode += this.getWorkCalendar().hashCode();
        }
        if (this.getZipCode() != null) {
            _hashCode += this.getZipCode().hashCode();
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "VendorSearchBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "accountNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
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
        elemField.setFieldName("addressee");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "addressee"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("addressLabel");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "addressLabel"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("addressPhone");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "addressPhone"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("attention");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "attention"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "balance"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billAddress");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billAddress"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "category"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("comments");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "comments"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("contact");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "contact"));
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
        elemField.setFieldName("county");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "county"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("creditLimit");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "creditLimit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
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
        elemField.setFieldName("currentExchangeRate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "currentExchangeRate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("dateCreated");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "dateCreated"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("defaultTaxReg");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "defaultTaxReg"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("defaultTaxRegText");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "defaultTaxRegText"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("eligibleForCommission");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "eligibleForCommission"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("emailPreference");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "emailPreference"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("emailTransactions");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "emailTransactions"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("entityId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "entityId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("expenseAccount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "expenseAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("faxTransactions");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "faxTransactions"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "firstName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fxBalance");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fxBalance"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fxUnbilledOrders");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fxUnbilledOrders"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("giveAccess");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "giveAccess"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("globalSubscriptionStatus");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "globalSubscriptionStatus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("group");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "group"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("hasDuplicates");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "hasDuplicates"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("image");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "image"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("incoterm");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "incoterm"));
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
        elemField.setFieldName("is1099Eligible");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "is1099Eligible"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isDefaultBilling");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isDefaultBilling"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isDefaultShipping");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isDefaultShipping"));
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
        elemField.setFieldName("isJobResourceVend");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isJobResourceVend"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isPerson");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isPerson"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("laborCost");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "laborCost"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "language"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lastName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("level");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "level"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("middleName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "middleName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("otherRelationships");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "otherRelationships"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("payablesAccount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "payablesAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("pec");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "pec"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("permission");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "permission"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
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
        elemField.setFieldName("phoneticName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "phoneticName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("predConfidence");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "predConfidence"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("predictedDays");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "predictedDays"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("printTransactions");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "printTransactions"));
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
        elemField.setFieldName("salutation");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "salutation"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipAddress");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipAddress"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
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
        elemField.setFieldName("taxIdNum");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "taxIdNum"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("timeApprover");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "timeApprover"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "title"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("unbilledOrders");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "unbilledOrders"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
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
        elemField.setFieldName("vatRegNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "vatRegNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("workCalendar");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "workCalendar"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("zipCode");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "zipCode"));
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

