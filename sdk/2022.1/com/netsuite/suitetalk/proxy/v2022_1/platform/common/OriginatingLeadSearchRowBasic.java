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

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnBooleanField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnCustomFieldList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnDateField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnDoubleField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnEnumSelectField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnLongField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnSelectField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnStringField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchRowBasic;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class OriginatingLeadSearchRowBasic
extends SearchRowBasic
implements Serializable {
    private SearchColumnStringField[] accountNumber;
    private SearchColumnStringField[] address;
    private SearchColumnStringField[] address1;
    private SearchColumnStringField[] address2;
    private SearchColumnStringField[] address3;
    private SearchColumnStringField[] addressee;
    private SearchColumnStringField[] addressInternalId;
    private SearchColumnStringField[] addressLabel;
    private SearchColumnStringField[] addressPhone;
    private SearchColumnStringField[] altContact;
    private SearchColumnStringField[] altEmail;
    private SearchColumnStringField[] altName;
    private SearchColumnStringField[] altPhone;
    private SearchColumnSelectField[] assignedSite;
    private SearchColumnLongField[] assignedSiteId;
    private SearchColumnStringField[] attention;
    private SearchColumnBooleanField[] availableOffline;
    private SearchColumnDoubleField[] balance;
    private SearchColumnStringField[] billAddress;
    private SearchColumnStringField[] billAddress1;
    private SearchColumnStringField[] billAddress2;
    private SearchColumnStringField[] billAddress3;
    private SearchColumnStringField[] billAddressee;
    private SearchColumnStringField[] billAttention;
    private SearchColumnStringField[] billCity;
    private SearchColumnEnumSelectField[] billCountry;
    private SearchColumnStringField[] billCountryCode;
    private SearchColumnStringField[] billPhone;
    private SearchColumnStringField[] billState;
    private SearchColumnStringField[] billZipCode;
    private SearchColumnStringField[] buyingReason;
    private SearchColumnStringField[] buyingTimeFrame;
    private SearchColumnSelectField[] category;
    private SearchColumnStringField[] ccCustomerCode;
    private SearchColumnBooleanField[] ccDefault;
    private SearchColumnDateField[] ccExpDate;
    private SearchColumnStringField[] ccHolderName;
    private SearchColumnStringField[] ccInternalId;
    private SearchColumnStringField[] ccNumber;
    private SearchColumnSelectField[] ccState;
    private SearchColumnDateField[] ccStateFrom;
    private SearchColumnSelectField[] ccType;
    private SearchColumnStringField[] city;
    private SearchColumnStringField[] comments;
    private SearchColumnStringField[] companyName;
    private SearchColumnDoubleField[] consolBalance;
    private SearchColumnLongField[] consolDaysOverdue;
    private SearchColumnDoubleField[] consolDepositBalance;
    private SearchColumnDoubleField[] consolOverdueBalance;
    private SearchColumnDoubleField[] consolUnbilledOrders;
    private SearchColumnStringField[] contact;
    private SearchColumnDoubleField[] contribution;
    private SearchColumnDoubleField[] contributionPrimary;
    private SearchColumnDateField[] conversionDate;
    private SearchColumnEnumSelectField[] country;
    private SearchColumnStringField[] countryCode;
    private SearchColumnEnumSelectField[] creditHold;
    private SearchColumnBooleanField[] creditHoldOverride;
    private SearchColumnDoubleField[] creditLimit;
    private SearchColumnSelectField[] currency;
    private SearchColumnDateField[] dateClosed;
    private SearchColumnDateField[] dateCreated;
    private SearchColumnLongField[] daysOverdue;
    private SearchColumnDoubleField[] defaultOrderPriority;
    private SearchColumnStringField[] defaultTaxReg;
    private SearchColumnDoubleField[] depositBalance;
    private SearchColumnStringField[] drAccount;
    private SearchColumnStringField[] email;
    private SearchColumnEnumSelectField[] emailPreference;
    private SearchColumnBooleanField[] emailTransactions;
    private SearchColumnDateField[] endDate;
    private SearchColumnStringField[] entityId;
    private SearchColumnLongField[] entityNumber;
    private SearchColumnSelectField[] entityStatus;
    private SearchColumnDoubleField[] estimatedBudget;
    private SearchColumnBooleanField[] explicitConversion;
    private SearchColumnSelectField[] externalId;
    private SearchColumnStringField[] fax;
    private SearchColumnBooleanField[] faxTransactions;
    private SearchColumnStringField[] firstName;
    private SearchColumnDateField[] firstOrderDate;
    private SearchColumnDateField[] firstSaleDate;
    private SearchColumnStringField[] fxAccount;
    private SearchColumnDoubleField[] fxBalance;
    private SearchColumnDoubleField[] fxConsolBalance;
    private SearchColumnDoubleField[] fxConsolUnbilledOrders;
    private SearchColumnDoubleField[] fxUnbilledOrders;
    private SearchColumnBooleanField[] giveAccess;
    private SearchColumnEnumSelectField[] globalSubscriptionStatus;
    private SearchColumnStringField[] groupPricingLevel;
    private SearchColumnBooleanField[] hasDuplicates;
    private SearchColumnStringField[] homePhone;
    private SearchColumnSelectField[] image;
    private SearchColumnSelectField[] internalId;
    private SearchColumnBooleanField[] isBudgetApproved;
    private SearchColumnBooleanField[] isDefaultBilling;
    private SearchColumnBooleanField[] isDefaultShipping;
    private SearchColumnBooleanField[] isInactive;
    private SearchColumnBooleanField[] isPerson;
    private SearchColumnBooleanField[] isShipAddress;
    private SearchColumnStringField[] itemPricingLevel;
    private SearchColumnDoubleField[] itemPricingUnitPrice;
    private SearchColumnDateField[] jobEndDate;
    private SearchColumnDateField[] jobProjectedEnd;
    private SearchColumnDateField[] jobStartDate;
    private SearchColumnSelectField[] jobType;
    private SearchColumnEnumSelectField[] language;
    private SearchColumnDateField[] lastModifiedDate;
    private SearchColumnStringField[] lastName;
    private SearchColumnDateField[] lastOrderDate;
    private SearchColumnDateField[] lastSaleDate;
    private SearchColumnDateField[] leadDate;
    private SearchColumnSelectField[] leadSource;
    private SearchColumnEnumSelectField[] level;
    private SearchColumnBooleanField[] manualCreditHold;
    private SearchColumnStringField[] middleName;
    private SearchColumnStringField[] mobilePhone;
    private SearchColumnEnumSelectField[] monthlyClosing;
    private SearchColumnBooleanField[] onCreditHold;
    private SearchColumnDoubleField[] overdueBalance;
    private SearchColumnSelectField[] parent;
    private SearchColumnSelectField[] partner;
    private SearchColumnDoubleField[] partnerContribution;
    private SearchColumnStringField[] partnerRole;
    private SearchColumnSelectField[] partnerTeamMember;
    private SearchColumnStringField[] pec;
    private SearchColumnEnumSelectField[] permission;
    private SearchColumnStringField[] phone;
    private SearchColumnStringField[] phoneticName;
    private SearchColumnSelectField[] prefCCProcessor;
    private SearchColumnSelectField[] priceLevel;
    private SearchColumnStringField[] pricingGroup;
    private SearchColumnStringField[] pricingItem;
    private SearchColumnBooleanField[] printTransactions;
    private SearchColumnDateField[] prospectDate;
    private SearchColumnStringField[] receivablesAccount;
    private SearchColumnLongField[] reminderDays;
    private SearchColumnStringField[] resaleNumber;
    private SearchColumnStringField[] role;
    private SearchColumnStringField[] salesReadiness;
    private SearchColumnSelectField[] salesRep;
    private SearchColumnSelectField[] salesTeamMember;
    private SearchColumnSelectField[] salesTeamRole;
    private SearchColumnStringField[] salutation;
    private SearchColumnStringField[] shipAddress;
    private SearchColumnStringField[] shipAddress1;
    private SearchColumnStringField[] shipAddress2;
    private SearchColumnStringField[] shipAddress3;
    private SearchColumnStringField[] shipAddressee;
    private SearchColumnStringField[] shipAttention;
    private SearchColumnStringField[] shipCity;
    private SearchColumnBooleanField[] shipComplete;
    private SearchColumnEnumSelectField[] shipCountry;
    private SearchColumnStringField[] shipCountryCode;
    private SearchColumnStringField[] shipPhone;
    private SearchColumnSelectField[] shippingItem;
    private SearchColumnStringField[] shipState;
    private SearchColumnStringField[] shipZip;
    private SearchColumnSelectField[] sourceSite;
    private SearchColumnLongField[] sourceSiteId;
    private SearchColumnStringField[] stage;
    private SearchColumnDateField[] startDate;
    private SearchColumnEnumSelectField[] state;
    private SearchColumnSelectField[] subscription;
    private SearchColumnDateField[] subscriptionDate;
    private SearchColumnBooleanField[] subscriptionStatus;
    private SearchColumnSelectField[] subsidiary;
    private SearchColumnBooleanField[] taxable;
    private SearchColumnSelectField[] taxItem;
    private SearchColumnSelectField[] terms;
    private SearchColumnSelectField[] territory;
    private SearchColumnStringField[] title;
    private SearchColumnDoubleField[] unbilledOrders;
    private SearchColumnStringField[] url;
    private SearchColumnStringField[] vatRegNumber;
    private SearchColumnBooleanField[] webLead;
    private SearchColumnStringField[] zipCode;
    private SearchColumnCustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(OriginatingLeadSearchRowBasic.class, true);

    public OriginatingLeadSearchRowBasic() {
    }

    public OriginatingLeadSearchRowBasic(SearchColumnStringField[] accountNumber, SearchColumnStringField[] address, SearchColumnStringField[] address1, SearchColumnStringField[] address2, SearchColumnStringField[] address3, SearchColumnStringField[] addressee, SearchColumnStringField[] addressInternalId, SearchColumnStringField[] addressLabel, SearchColumnStringField[] addressPhone, SearchColumnStringField[] altContact, SearchColumnStringField[] altEmail, SearchColumnStringField[] altName, SearchColumnStringField[] altPhone, SearchColumnSelectField[] assignedSite, SearchColumnLongField[] assignedSiteId, SearchColumnStringField[] attention, SearchColumnBooleanField[] availableOffline, SearchColumnDoubleField[] balance, SearchColumnStringField[] billAddress, SearchColumnStringField[] billAddress1, SearchColumnStringField[] billAddress2, SearchColumnStringField[] billAddress3, SearchColumnStringField[] billAddressee, SearchColumnStringField[] billAttention, SearchColumnStringField[] billCity, SearchColumnEnumSelectField[] billCountry, SearchColumnStringField[] billCountryCode, SearchColumnStringField[] billPhone, SearchColumnStringField[] billState, SearchColumnStringField[] billZipCode, SearchColumnStringField[] buyingReason, SearchColumnStringField[] buyingTimeFrame, SearchColumnSelectField[] category, SearchColumnStringField[] ccCustomerCode, SearchColumnBooleanField[] ccDefault, SearchColumnDateField[] ccExpDate, SearchColumnStringField[] ccHolderName, SearchColumnStringField[] ccInternalId, SearchColumnStringField[] ccNumber, SearchColumnSelectField[] ccState, SearchColumnDateField[] ccStateFrom, SearchColumnSelectField[] ccType, SearchColumnStringField[] city, SearchColumnStringField[] comments, SearchColumnStringField[] companyName, SearchColumnDoubleField[] consolBalance, SearchColumnLongField[] consolDaysOverdue, SearchColumnDoubleField[] consolDepositBalance, SearchColumnDoubleField[] consolOverdueBalance, SearchColumnDoubleField[] consolUnbilledOrders, SearchColumnStringField[] contact, SearchColumnDoubleField[] contribution, SearchColumnDoubleField[] contributionPrimary, SearchColumnDateField[] conversionDate, SearchColumnEnumSelectField[] country, SearchColumnStringField[] countryCode, SearchColumnEnumSelectField[] creditHold, SearchColumnBooleanField[] creditHoldOverride, SearchColumnDoubleField[] creditLimit, SearchColumnSelectField[] currency, SearchColumnDateField[] dateClosed, SearchColumnDateField[] dateCreated, SearchColumnLongField[] daysOverdue, SearchColumnDoubleField[] defaultOrderPriority, SearchColumnStringField[] defaultTaxReg, SearchColumnDoubleField[] depositBalance, SearchColumnStringField[] drAccount, SearchColumnStringField[] email, SearchColumnEnumSelectField[] emailPreference, SearchColumnBooleanField[] emailTransactions, SearchColumnDateField[] endDate, SearchColumnStringField[] entityId, SearchColumnLongField[] entityNumber, SearchColumnSelectField[] entityStatus, SearchColumnDoubleField[] estimatedBudget, SearchColumnBooleanField[] explicitConversion, SearchColumnSelectField[] externalId, SearchColumnStringField[] fax, SearchColumnBooleanField[] faxTransactions, SearchColumnStringField[] firstName, SearchColumnDateField[] firstOrderDate, SearchColumnDateField[] firstSaleDate, SearchColumnStringField[] fxAccount, SearchColumnDoubleField[] fxBalance, SearchColumnDoubleField[] fxConsolBalance, SearchColumnDoubleField[] fxConsolUnbilledOrders, SearchColumnDoubleField[] fxUnbilledOrders, SearchColumnBooleanField[] giveAccess, SearchColumnEnumSelectField[] globalSubscriptionStatus, SearchColumnStringField[] groupPricingLevel, SearchColumnBooleanField[] hasDuplicates, SearchColumnStringField[] homePhone, SearchColumnSelectField[] image, SearchColumnSelectField[] internalId, SearchColumnBooleanField[] isBudgetApproved, SearchColumnBooleanField[] isDefaultBilling, SearchColumnBooleanField[] isDefaultShipping, SearchColumnBooleanField[] isInactive, SearchColumnBooleanField[] isPerson, SearchColumnBooleanField[] isShipAddress, SearchColumnStringField[] itemPricingLevel, SearchColumnDoubleField[] itemPricingUnitPrice, SearchColumnDateField[] jobEndDate, SearchColumnDateField[] jobProjectedEnd, SearchColumnDateField[] jobStartDate, SearchColumnSelectField[] jobType, SearchColumnEnumSelectField[] language, SearchColumnDateField[] lastModifiedDate, SearchColumnStringField[] lastName, SearchColumnDateField[] lastOrderDate, SearchColumnDateField[] lastSaleDate, SearchColumnDateField[] leadDate, SearchColumnSelectField[] leadSource, SearchColumnEnumSelectField[] level, SearchColumnBooleanField[] manualCreditHold, SearchColumnStringField[] middleName, SearchColumnStringField[] mobilePhone, SearchColumnEnumSelectField[] monthlyClosing, SearchColumnBooleanField[] onCreditHold, SearchColumnDoubleField[] overdueBalance, SearchColumnSelectField[] parent, SearchColumnSelectField[] partner, SearchColumnDoubleField[] partnerContribution, SearchColumnStringField[] partnerRole, SearchColumnSelectField[] partnerTeamMember, SearchColumnStringField[] pec, SearchColumnEnumSelectField[] permission, SearchColumnStringField[] phone, SearchColumnStringField[] phoneticName, SearchColumnSelectField[] prefCCProcessor, SearchColumnSelectField[] priceLevel, SearchColumnStringField[] pricingGroup, SearchColumnStringField[] pricingItem, SearchColumnBooleanField[] printTransactions, SearchColumnDateField[] prospectDate, SearchColumnStringField[] receivablesAccount, SearchColumnLongField[] reminderDays, SearchColumnStringField[] resaleNumber, SearchColumnStringField[] role, SearchColumnStringField[] salesReadiness, SearchColumnSelectField[] salesRep, SearchColumnSelectField[] salesTeamMember, SearchColumnSelectField[] salesTeamRole, SearchColumnStringField[] salutation, SearchColumnStringField[] shipAddress, SearchColumnStringField[] shipAddress1, SearchColumnStringField[] shipAddress2, SearchColumnStringField[] shipAddress3, SearchColumnStringField[] shipAddressee, SearchColumnStringField[] shipAttention, SearchColumnStringField[] shipCity, SearchColumnBooleanField[] shipComplete, SearchColumnEnumSelectField[] shipCountry, SearchColumnStringField[] shipCountryCode, SearchColumnStringField[] shipPhone, SearchColumnSelectField[] shippingItem, SearchColumnStringField[] shipState, SearchColumnStringField[] shipZip, SearchColumnSelectField[] sourceSite, SearchColumnLongField[] sourceSiteId, SearchColumnStringField[] stage, SearchColumnDateField[] startDate, SearchColumnEnumSelectField[] state, SearchColumnSelectField[] subscription, SearchColumnDateField[] subscriptionDate, SearchColumnBooleanField[] subscriptionStatus, SearchColumnSelectField[] subsidiary, SearchColumnBooleanField[] taxable, SearchColumnSelectField[] taxItem, SearchColumnSelectField[] terms, SearchColumnSelectField[] territory, SearchColumnStringField[] title, SearchColumnDoubleField[] unbilledOrders, SearchColumnStringField[] url, SearchColumnStringField[] vatRegNumber, SearchColumnBooleanField[] webLead, SearchColumnStringField[] zipCode, SearchColumnCustomFieldList customFieldList) {
        this.accountNumber = accountNumber;
        this.address = address;
        this.address1 = address1;
        this.address2 = address2;
        this.address3 = address3;
        this.addressee = addressee;
        this.addressInternalId = addressInternalId;
        this.addressLabel = addressLabel;
        this.addressPhone = addressPhone;
        this.altContact = altContact;
        this.altEmail = altEmail;
        this.altName = altName;
        this.altPhone = altPhone;
        this.assignedSite = assignedSite;
        this.assignedSiteId = assignedSiteId;
        this.attention = attention;
        this.availableOffline = availableOffline;
        this.balance = balance;
        this.billAddress = billAddress;
        this.billAddress1 = billAddress1;
        this.billAddress2 = billAddress2;
        this.billAddress3 = billAddress3;
        this.billAddressee = billAddressee;
        this.billAttention = billAttention;
        this.billCity = billCity;
        this.billCountry = billCountry;
        this.billCountryCode = billCountryCode;
        this.billPhone = billPhone;
        this.billState = billState;
        this.billZipCode = billZipCode;
        this.buyingReason = buyingReason;
        this.buyingTimeFrame = buyingTimeFrame;
        this.category = category;
        this.ccCustomerCode = ccCustomerCode;
        this.ccDefault = ccDefault;
        this.ccExpDate = ccExpDate;
        this.ccHolderName = ccHolderName;
        this.ccInternalId = ccInternalId;
        this.ccNumber = ccNumber;
        this.ccState = ccState;
        this.ccStateFrom = ccStateFrom;
        this.ccType = ccType;
        this.city = city;
        this.comments = comments;
        this.companyName = companyName;
        this.consolBalance = consolBalance;
        this.consolDaysOverdue = consolDaysOverdue;
        this.consolDepositBalance = consolDepositBalance;
        this.consolOverdueBalance = consolOverdueBalance;
        this.consolUnbilledOrders = consolUnbilledOrders;
        this.contact = contact;
        this.contribution = contribution;
        this.contributionPrimary = contributionPrimary;
        this.conversionDate = conversionDate;
        this.country = country;
        this.countryCode = countryCode;
        this.creditHold = creditHold;
        this.creditHoldOverride = creditHoldOverride;
        this.creditLimit = creditLimit;
        this.currency = currency;
        this.dateClosed = dateClosed;
        this.dateCreated = dateCreated;
        this.daysOverdue = daysOverdue;
        this.defaultOrderPriority = defaultOrderPriority;
        this.defaultTaxReg = defaultTaxReg;
        this.depositBalance = depositBalance;
        this.drAccount = drAccount;
        this.email = email;
        this.emailPreference = emailPreference;
        this.emailTransactions = emailTransactions;
        this.endDate = endDate;
        this.entityId = entityId;
        this.entityNumber = entityNumber;
        this.entityStatus = entityStatus;
        this.estimatedBudget = estimatedBudget;
        this.explicitConversion = explicitConversion;
        this.externalId = externalId;
        this.fax = fax;
        this.faxTransactions = faxTransactions;
        this.firstName = firstName;
        this.firstOrderDate = firstOrderDate;
        this.firstSaleDate = firstSaleDate;
        this.fxAccount = fxAccount;
        this.fxBalance = fxBalance;
        this.fxConsolBalance = fxConsolBalance;
        this.fxConsolUnbilledOrders = fxConsolUnbilledOrders;
        this.fxUnbilledOrders = fxUnbilledOrders;
        this.giveAccess = giveAccess;
        this.globalSubscriptionStatus = globalSubscriptionStatus;
        this.groupPricingLevel = groupPricingLevel;
        this.hasDuplicates = hasDuplicates;
        this.homePhone = homePhone;
        this.image = image;
        this.internalId = internalId;
        this.isBudgetApproved = isBudgetApproved;
        this.isDefaultBilling = isDefaultBilling;
        this.isDefaultShipping = isDefaultShipping;
        this.isInactive = isInactive;
        this.isPerson = isPerson;
        this.isShipAddress = isShipAddress;
        this.itemPricingLevel = itemPricingLevel;
        this.itemPricingUnitPrice = itemPricingUnitPrice;
        this.jobEndDate = jobEndDate;
        this.jobProjectedEnd = jobProjectedEnd;
        this.jobStartDate = jobStartDate;
        this.jobType = jobType;
        this.language = language;
        this.lastModifiedDate = lastModifiedDate;
        this.lastName = lastName;
        this.lastOrderDate = lastOrderDate;
        this.lastSaleDate = lastSaleDate;
        this.leadDate = leadDate;
        this.leadSource = leadSource;
        this.level = level;
        this.manualCreditHold = manualCreditHold;
        this.middleName = middleName;
        this.mobilePhone = mobilePhone;
        this.monthlyClosing = monthlyClosing;
        this.onCreditHold = onCreditHold;
        this.overdueBalance = overdueBalance;
        this.parent = parent;
        this.partner = partner;
        this.partnerContribution = partnerContribution;
        this.partnerRole = partnerRole;
        this.partnerTeamMember = partnerTeamMember;
        this.pec = pec;
        this.permission = permission;
        this.phone = phone;
        this.phoneticName = phoneticName;
        this.prefCCProcessor = prefCCProcessor;
        this.priceLevel = priceLevel;
        this.pricingGroup = pricingGroup;
        this.pricingItem = pricingItem;
        this.printTransactions = printTransactions;
        this.prospectDate = prospectDate;
        this.receivablesAccount = receivablesAccount;
        this.reminderDays = reminderDays;
        this.resaleNumber = resaleNumber;
        this.role = role;
        this.salesReadiness = salesReadiness;
        this.salesRep = salesRep;
        this.salesTeamMember = salesTeamMember;
        this.salesTeamRole = salesTeamRole;
        this.salutation = salutation;
        this.shipAddress = shipAddress;
        this.shipAddress1 = shipAddress1;
        this.shipAddress2 = shipAddress2;
        this.shipAddress3 = shipAddress3;
        this.shipAddressee = shipAddressee;
        this.shipAttention = shipAttention;
        this.shipCity = shipCity;
        this.shipComplete = shipComplete;
        this.shipCountry = shipCountry;
        this.shipCountryCode = shipCountryCode;
        this.shipPhone = shipPhone;
        this.shippingItem = shippingItem;
        this.shipState = shipState;
        this.shipZip = shipZip;
        this.sourceSite = sourceSite;
        this.sourceSiteId = sourceSiteId;
        this.stage = stage;
        this.startDate = startDate;
        this.state = state;
        this.subscription = subscription;
        this.subscriptionDate = subscriptionDate;
        this.subscriptionStatus = subscriptionStatus;
        this.subsidiary = subsidiary;
        this.taxable = taxable;
        this.taxItem = taxItem;
        this.terms = terms;
        this.territory = territory;
        this.title = title;
        this.unbilledOrders = unbilledOrders;
        this.url = url;
        this.vatRegNumber = vatRegNumber;
        this.webLead = webLead;
        this.zipCode = zipCode;
        this.customFieldList = customFieldList;
    }

    public SearchColumnStringField[] getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(SearchColumnStringField[] accountNumber) {
        this.accountNumber = accountNumber;
    }

    public SearchColumnStringField getAccountNumber(int i) {
        return this.accountNumber[i];
    }

    public void setAccountNumber(int i, SearchColumnStringField _value) {
        this.accountNumber[i] = _value;
    }

    public SearchColumnStringField[] getAddress() {
        return this.address;
    }

    public void setAddress(SearchColumnStringField[] address) {
        this.address = address;
    }

    public SearchColumnStringField getAddress(int i) {
        return this.address[i];
    }

    public void setAddress(int i, SearchColumnStringField _value) {
        this.address[i] = _value;
    }

    public SearchColumnStringField[] getAddress1() {
        return this.address1;
    }

    public void setAddress1(SearchColumnStringField[] address1) {
        this.address1 = address1;
    }

    public SearchColumnStringField getAddress1(int i) {
        return this.address1[i];
    }

    public void setAddress1(int i, SearchColumnStringField _value) {
        this.address1[i] = _value;
    }

    public SearchColumnStringField[] getAddress2() {
        return this.address2;
    }

    public void setAddress2(SearchColumnStringField[] address2) {
        this.address2 = address2;
    }

    public SearchColumnStringField getAddress2(int i) {
        return this.address2[i];
    }

    public void setAddress2(int i, SearchColumnStringField _value) {
        this.address2[i] = _value;
    }

    public SearchColumnStringField[] getAddress3() {
        return this.address3;
    }

    public void setAddress3(SearchColumnStringField[] address3) {
        this.address3 = address3;
    }

    public SearchColumnStringField getAddress3(int i) {
        return this.address3[i];
    }

    public void setAddress3(int i, SearchColumnStringField _value) {
        this.address3[i] = _value;
    }

    public SearchColumnStringField[] getAddressee() {
        return this.addressee;
    }

    public void setAddressee(SearchColumnStringField[] addressee) {
        this.addressee = addressee;
    }

    public SearchColumnStringField getAddressee(int i) {
        return this.addressee[i];
    }

    public void setAddressee(int i, SearchColumnStringField _value) {
        this.addressee[i] = _value;
    }

    public SearchColumnStringField[] getAddressInternalId() {
        return this.addressInternalId;
    }

    public void setAddressInternalId(SearchColumnStringField[] addressInternalId) {
        this.addressInternalId = addressInternalId;
    }

    public SearchColumnStringField getAddressInternalId(int i) {
        return this.addressInternalId[i];
    }

    public void setAddressInternalId(int i, SearchColumnStringField _value) {
        this.addressInternalId[i] = _value;
    }

    public SearchColumnStringField[] getAddressLabel() {
        return this.addressLabel;
    }

    public void setAddressLabel(SearchColumnStringField[] addressLabel) {
        this.addressLabel = addressLabel;
    }

    public SearchColumnStringField getAddressLabel(int i) {
        return this.addressLabel[i];
    }

    public void setAddressLabel(int i, SearchColumnStringField _value) {
        this.addressLabel[i] = _value;
    }

    public SearchColumnStringField[] getAddressPhone() {
        return this.addressPhone;
    }

    public void setAddressPhone(SearchColumnStringField[] addressPhone) {
        this.addressPhone = addressPhone;
    }

    public SearchColumnStringField getAddressPhone(int i) {
        return this.addressPhone[i];
    }

    public void setAddressPhone(int i, SearchColumnStringField _value) {
        this.addressPhone[i] = _value;
    }

    public SearchColumnStringField[] getAltContact() {
        return this.altContact;
    }

    public void setAltContact(SearchColumnStringField[] altContact) {
        this.altContact = altContact;
    }

    public SearchColumnStringField getAltContact(int i) {
        return this.altContact[i];
    }

    public void setAltContact(int i, SearchColumnStringField _value) {
        this.altContact[i] = _value;
    }

    public SearchColumnStringField[] getAltEmail() {
        return this.altEmail;
    }

    public void setAltEmail(SearchColumnStringField[] altEmail) {
        this.altEmail = altEmail;
    }

    public SearchColumnStringField getAltEmail(int i) {
        return this.altEmail[i];
    }

    public void setAltEmail(int i, SearchColumnStringField _value) {
        this.altEmail[i] = _value;
    }

    public SearchColumnStringField[] getAltName() {
        return this.altName;
    }

    public void setAltName(SearchColumnStringField[] altName) {
        this.altName = altName;
    }

    public SearchColumnStringField getAltName(int i) {
        return this.altName[i];
    }

    public void setAltName(int i, SearchColumnStringField _value) {
        this.altName[i] = _value;
    }

    public SearchColumnStringField[] getAltPhone() {
        return this.altPhone;
    }

    public void setAltPhone(SearchColumnStringField[] altPhone) {
        this.altPhone = altPhone;
    }

    public SearchColumnStringField getAltPhone(int i) {
        return this.altPhone[i];
    }

    public void setAltPhone(int i, SearchColumnStringField _value) {
        this.altPhone[i] = _value;
    }

    public SearchColumnSelectField[] getAssignedSite() {
        return this.assignedSite;
    }

    public void setAssignedSite(SearchColumnSelectField[] assignedSite) {
        this.assignedSite = assignedSite;
    }

    public SearchColumnSelectField getAssignedSite(int i) {
        return this.assignedSite[i];
    }

    public void setAssignedSite(int i, SearchColumnSelectField _value) {
        this.assignedSite[i] = _value;
    }

    public SearchColumnLongField[] getAssignedSiteId() {
        return this.assignedSiteId;
    }

    public void setAssignedSiteId(SearchColumnLongField[] assignedSiteId) {
        this.assignedSiteId = assignedSiteId;
    }

    public SearchColumnLongField getAssignedSiteId(int i) {
        return this.assignedSiteId[i];
    }

    public void setAssignedSiteId(int i, SearchColumnLongField _value) {
        this.assignedSiteId[i] = _value;
    }

    public SearchColumnStringField[] getAttention() {
        return this.attention;
    }

    public void setAttention(SearchColumnStringField[] attention) {
        this.attention = attention;
    }

    public SearchColumnStringField getAttention(int i) {
        return this.attention[i];
    }

    public void setAttention(int i, SearchColumnStringField _value) {
        this.attention[i] = _value;
    }

    public SearchColumnBooleanField[] getAvailableOffline() {
        return this.availableOffline;
    }

    public void setAvailableOffline(SearchColumnBooleanField[] availableOffline) {
        this.availableOffline = availableOffline;
    }

    public SearchColumnBooleanField getAvailableOffline(int i) {
        return this.availableOffline[i];
    }

    public void setAvailableOffline(int i, SearchColumnBooleanField _value) {
        this.availableOffline[i] = _value;
    }

    public SearchColumnDoubleField[] getBalance() {
        return this.balance;
    }

    public void setBalance(SearchColumnDoubleField[] balance) {
        this.balance = balance;
    }

    public SearchColumnDoubleField getBalance(int i) {
        return this.balance[i];
    }

    public void setBalance(int i, SearchColumnDoubleField _value) {
        this.balance[i] = _value;
    }

    public SearchColumnStringField[] getBillAddress() {
        return this.billAddress;
    }

    public void setBillAddress(SearchColumnStringField[] billAddress) {
        this.billAddress = billAddress;
    }

    public SearchColumnStringField getBillAddress(int i) {
        return this.billAddress[i];
    }

    public void setBillAddress(int i, SearchColumnStringField _value) {
        this.billAddress[i] = _value;
    }

    public SearchColumnStringField[] getBillAddress1() {
        return this.billAddress1;
    }

    public void setBillAddress1(SearchColumnStringField[] billAddress1) {
        this.billAddress1 = billAddress1;
    }

    public SearchColumnStringField getBillAddress1(int i) {
        return this.billAddress1[i];
    }

    public void setBillAddress1(int i, SearchColumnStringField _value) {
        this.billAddress1[i] = _value;
    }

    public SearchColumnStringField[] getBillAddress2() {
        return this.billAddress2;
    }

    public void setBillAddress2(SearchColumnStringField[] billAddress2) {
        this.billAddress2 = billAddress2;
    }

    public SearchColumnStringField getBillAddress2(int i) {
        return this.billAddress2[i];
    }

    public void setBillAddress2(int i, SearchColumnStringField _value) {
        this.billAddress2[i] = _value;
    }

    public SearchColumnStringField[] getBillAddress3() {
        return this.billAddress3;
    }

    public void setBillAddress3(SearchColumnStringField[] billAddress3) {
        this.billAddress3 = billAddress3;
    }

    public SearchColumnStringField getBillAddress3(int i) {
        return this.billAddress3[i];
    }

    public void setBillAddress3(int i, SearchColumnStringField _value) {
        this.billAddress3[i] = _value;
    }

    public SearchColumnStringField[] getBillAddressee() {
        return this.billAddressee;
    }

    public void setBillAddressee(SearchColumnStringField[] billAddressee) {
        this.billAddressee = billAddressee;
    }

    public SearchColumnStringField getBillAddressee(int i) {
        return this.billAddressee[i];
    }

    public void setBillAddressee(int i, SearchColumnStringField _value) {
        this.billAddressee[i] = _value;
    }

    public SearchColumnStringField[] getBillAttention() {
        return this.billAttention;
    }

    public void setBillAttention(SearchColumnStringField[] billAttention) {
        this.billAttention = billAttention;
    }

    public SearchColumnStringField getBillAttention(int i) {
        return this.billAttention[i];
    }

    public void setBillAttention(int i, SearchColumnStringField _value) {
        this.billAttention[i] = _value;
    }

    public SearchColumnStringField[] getBillCity() {
        return this.billCity;
    }

    public void setBillCity(SearchColumnStringField[] billCity) {
        this.billCity = billCity;
    }

    public SearchColumnStringField getBillCity(int i) {
        return this.billCity[i];
    }

    public void setBillCity(int i, SearchColumnStringField _value) {
        this.billCity[i] = _value;
    }

    public SearchColumnEnumSelectField[] getBillCountry() {
        return this.billCountry;
    }

    public void setBillCountry(SearchColumnEnumSelectField[] billCountry) {
        this.billCountry = billCountry;
    }

    public SearchColumnEnumSelectField getBillCountry(int i) {
        return this.billCountry[i];
    }

    public void setBillCountry(int i, SearchColumnEnumSelectField _value) {
        this.billCountry[i] = _value;
    }

    public SearchColumnStringField[] getBillCountryCode() {
        return this.billCountryCode;
    }

    public void setBillCountryCode(SearchColumnStringField[] billCountryCode) {
        this.billCountryCode = billCountryCode;
    }

    public SearchColumnStringField getBillCountryCode(int i) {
        return this.billCountryCode[i];
    }

    public void setBillCountryCode(int i, SearchColumnStringField _value) {
        this.billCountryCode[i] = _value;
    }

    public SearchColumnStringField[] getBillPhone() {
        return this.billPhone;
    }

    public void setBillPhone(SearchColumnStringField[] billPhone) {
        this.billPhone = billPhone;
    }

    public SearchColumnStringField getBillPhone(int i) {
        return this.billPhone[i];
    }

    public void setBillPhone(int i, SearchColumnStringField _value) {
        this.billPhone[i] = _value;
    }

    public SearchColumnStringField[] getBillState() {
        return this.billState;
    }

    public void setBillState(SearchColumnStringField[] billState) {
        this.billState = billState;
    }

    public SearchColumnStringField getBillState(int i) {
        return this.billState[i];
    }

    public void setBillState(int i, SearchColumnStringField _value) {
        this.billState[i] = _value;
    }

    public SearchColumnStringField[] getBillZipCode() {
        return this.billZipCode;
    }

    public void setBillZipCode(SearchColumnStringField[] billZipCode) {
        this.billZipCode = billZipCode;
    }

    public SearchColumnStringField getBillZipCode(int i) {
        return this.billZipCode[i];
    }

    public void setBillZipCode(int i, SearchColumnStringField _value) {
        this.billZipCode[i] = _value;
    }

    public SearchColumnStringField[] getBuyingReason() {
        return this.buyingReason;
    }

    public void setBuyingReason(SearchColumnStringField[] buyingReason) {
        this.buyingReason = buyingReason;
    }

    public SearchColumnStringField getBuyingReason(int i) {
        return this.buyingReason[i];
    }

    public void setBuyingReason(int i, SearchColumnStringField _value) {
        this.buyingReason[i] = _value;
    }

    public SearchColumnStringField[] getBuyingTimeFrame() {
        return this.buyingTimeFrame;
    }

    public void setBuyingTimeFrame(SearchColumnStringField[] buyingTimeFrame) {
        this.buyingTimeFrame = buyingTimeFrame;
    }

    public SearchColumnStringField getBuyingTimeFrame(int i) {
        return this.buyingTimeFrame[i];
    }

    public void setBuyingTimeFrame(int i, SearchColumnStringField _value) {
        this.buyingTimeFrame[i] = _value;
    }

    public SearchColumnSelectField[] getCategory() {
        return this.category;
    }

    public void setCategory(SearchColumnSelectField[] category) {
        this.category = category;
    }

    public SearchColumnSelectField getCategory(int i) {
        return this.category[i];
    }

    public void setCategory(int i, SearchColumnSelectField _value) {
        this.category[i] = _value;
    }

    public SearchColumnStringField[] getCcCustomerCode() {
        return this.ccCustomerCode;
    }

    public void setCcCustomerCode(SearchColumnStringField[] ccCustomerCode) {
        this.ccCustomerCode = ccCustomerCode;
    }

    public SearchColumnStringField getCcCustomerCode(int i) {
        return this.ccCustomerCode[i];
    }

    public void setCcCustomerCode(int i, SearchColumnStringField _value) {
        this.ccCustomerCode[i] = _value;
    }

    public SearchColumnBooleanField[] getCcDefault() {
        return this.ccDefault;
    }

    public void setCcDefault(SearchColumnBooleanField[] ccDefault) {
        this.ccDefault = ccDefault;
    }

    public SearchColumnBooleanField getCcDefault(int i) {
        return this.ccDefault[i];
    }

    public void setCcDefault(int i, SearchColumnBooleanField _value) {
        this.ccDefault[i] = _value;
    }

    public SearchColumnDateField[] getCcExpDate() {
        return this.ccExpDate;
    }

    public void setCcExpDate(SearchColumnDateField[] ccExpDate) {
        this.ccExpDate = ccExpDate;
    }

    public SearchColumnDateField getCcExpDate(int i) {
        return this.ccExpDate[i];
    }

    public void setCcExpDate(int i, SearchColumnDateField _value) {
        this.ccExpDate[i] = _value;
    }

    public SearchColumnStringField[] getCcHolderName() {
        return this.ccHolderName;
    }

    public void setCcHolderName(SearchColumnStringField[] ccHolderName) {
        this.ccHolderName = ccHolderName;
    }

    public SearchColumnStringField getCcHolderName(int i) {
        return this.ccHolderName[i];
    }

    public void setCcHolderName(int i, SearchColumnStringField _value) {
        this.ccHolderName[i] = _value;
    }

    public SearchColumnStringField[] getCcInternalId() {
        return this.ccInternalId;
    }

    public void setCcInternalId(SearchColumnStringField[] ccInternalId) {
        this.ccInternalId = ccInternalId;
    }

    public SearchColumnStringField getCcInternalId(int i) {
        return this.ccInternalId[i];
    }

    public void setCcInternalId(int i, SearchColumnStringField _value) {
        this.ccInternalId[i] = _value;
    }

    public SearchColumnStringField[] getCcNumber() {
        return this.ccNumber;
    }

    public void setCcNumber(SearchColumnStringField[] ccNumber) {
        this.ccNumber = ccNumber;
    }

    public SearchColumnStringField getCcNumber(int i) {
        return this.ccNumber[i];
    }

    public void setCcNumber(int i, SearchColumnStringField _value) {
        this.ccNumber[i] = _value;
    }

    public SearchColumnSelectField[] getCcState() {
        return this.ccState;
    }

    public void setCcState(SearchColumnSelectField[] ccState) {
        this.ccState = ccState;
    }

    public SearchColumnSelectField getCcState(int i) {
        return this.ccState[i];
    }

    public void setCcState(int i, SearchColumnSelectField _value) {
        this.ccState[i] = _value;
    }

    public SearchColumnDateField[] getCcStateFrom() {
        return this.ccStateFrom;
    }

    public void setCcStateFrom(SearchColumnDateField[] ccStateFrom) {
        this.ccStateFrom = ccStateFrom;
    }

    public SearchColumnDateField getCcStateFrom(int i) {
        return this.ccStateFrom[i];
    }

    public void setCcStateFrom(int i, SearchColumnDateField _value) {
        this.ccStateFrom[i] = _value;
    }

    public SearchColumnSelectField[] getCcType() {
        return this.ccType;
    }

    public void setCcType(SearchColumnSelectField[] ccType) {
        this.ccType = ccType;
    }

    public SearchColumnSelectField getCcType(int i) {
        return this.ccType[i];
    }

    public void setCcType(int i, SearchColumnSelectField _value) {
        this.ccType[i] = _value;
    }

    public SearchColumnStringField[] getCity() {
        return this.city;
    }

    public void setCity(SearchColumnStringField[] city) {
        this.city = city;
    }

    public SearchColumnStringField getCity(int i) {
        return this.city[i];
    }

    public void setCity(int i, SearchColumnStringField _value) {
        this.city[i] = _value;
    }

    public SearchColumnStringField[] getComments() {
        return this.comments;
    }

    public void setComments(SearchColumnStringField[] comments) {
        this.comments = comments;
    }

    public SearchColumnStringField getComments(int i) {
        return this.comments[i];
    }

    public void setComments(int i, SearchColumnStringField _value) {
        this.comments[i] = _value;
    }

    public SearchColumnStringField[] getCompanyName() {
        return this.companyName;
    }

    public void setCompanyName(SearchColumnStringField[] companyName) {
        this.companyName = companyName;
    }

    public SearchColumnStringField getCompanyName(int i) {
        return this.companyName[i];
    }

    public void setCompanyName(int i, SearchColumnStringField _value) {
        this.companyName[i] = _value;
    }

    public SearchColumnDoubleField[] getConsolBalance() {
        return this.consolBalance;
    }

    public void setConsolBalance(SearchColumnDoubleField[] consolBalance) {
        this.consolBalance = consolBalance;
    }

    public SearchColumnDoubleField getConsolBalance(int i) {
        return this.consolBalance[i];
    }

    public void setConsolBalance(int i, SearchColumnDoubleField _value) {
        this.consolBalance[i] = _value;
    }

    public SearchColumnLongField[] getConsolDaysOverdue() {
        return this.consolDaysOverdue;
    }

    public void setConsolDaysOverdue(SearchColumnLongField[] consolDaysOverdue) {
        this.consolDaysOverdue = consolDaysOverdue;
    }

    public SearchColumnLongField getConsolDaysOverdue(int i) {
        return this.consolDaysOverdue[i];
    }

    public void setConsolDaysOverdue(int i, SearchColumnLongField _value) {
        this.consolDaysOverdue[i] = _value;
    }

    public SearchColumnDoubleField[] getConsolDepositBalance() {
        return this.consolDepositBalance;
    }

    public void setConsolDepositBalance(SearchColumnDoubleField[] consolDepositBalance) {
        this.consolDepositBalance = consolDepositBalance;
    }

    public SearchColumnDoubleField getConsolDepositBalance(int i) {
        return this.consolDepositBalance[i];
    }

    public void setConsolDepositBalance(int i, SearchColumnDoubleField _value) {
        this.consolDepositBalance[i] = _value;
    }

    public SearchColumnDoubleField[] getConsolOverdueBalance() {
        return this.consolOverdueBalance;
    }

    public void setConsolOverdueBalance(SearchColumnDoubleField[] consolOverdueBalance) {
        this.consolOverdueBalance = consolOverdueBalance;
    }

    public SearchColumnDoubleField getConsolOverdueBalance(int i) {
        return this.consolOverdueBalance[i];
    }

    public void setConsolOverdueBalance(int i, SearchColumnDoubleField _value) {
        this.consolOverdueBalance[i] = _value;
    }

    public SearchColumnDoubleField[] getConsolUnbilledOrders() {
        return this.consolUnbilledOrders;
    }

    public void setConsolUnbilledOrders(SearchColumnDoubleField[] consolUnbilledOrders) {
        this.consolUnbilledOrders = consolUnbilledOrders;
    }

    public SearchColumnDoubleField getConsolUnbilledOrders(int i) {
        return this.consolUnbilledOrders[i];
    }

    public void setConsolUnbilledOrders(int i, SearchColumnDoubleField _value) {
        this.consolUnbilledOrders[i] = _value;
    }

    public SearchColumnStringField[] getContact() {
        return this.contact;
    }

    public void setContact(SearchColumnStringField[] contact) {
        this.contact = contact;
    }

    public SearchColumnStringField getContact(int i) {
        return this.contact[i];
    }

    public void setContact(int i, SearchColumnStringField _value) {
        this.contact[i] = _value;
    }

    public SearchColumnDoubleField[] getContribution() {
        return this.contribution;
    }

    public void setContribution(SearchColumnDoubleField[] contribution) {
        this.contribution = contribution;
    }

    public SearchColumnDoubleField getContribution(int i) {
        return this.contribution[i];
    }

    public void setContribution(int i, SearchColumnDoubleField _value) {
        this.contribution[i] = _value;
    }

    public SearchColumnDoubleField[] getContributionPrimary() {
        return this.contributionPrimary;
    }

    public void setContributionPrimary(SearchColumnDoubleField[] contributionPrimary) {
        this.contributionPrimary = contributionPrimary;
    }

    public SearchColumnDoubleField getContributionPrimary(int i) {
        return this.contributionPrimary[i];
    }

    public void setContributionPrimary(int i, SearchColumnDoubleField _value) {
        this.contributionPrimary[i] = _value;
    }

    public SearchColumnDateField[] getConversionDate() {
        return this.conversionDate;
    }

    public void setConversionDate(SearchColumnDateField[] conversionDate) {
        this.conversionDate = conversionDate;
    }

    public SearchColumnDateField getConversionDate(int i) {
        return this.conversionDate[i];
    }

    public void setConversionDate(int i, SearchColumnDateField _value) {
        this.conversionDate[i] = _value;
    }

    public SearchColumnEnumSelectField[] getCountry() {
        return this.country;
    }

    public void setCountry(SearchColumnEnumSelectField[] country) {
        this.country = country;
    }

    public SearchColumnEnumSelectField getCountry(int i) {
        return this.country[i];
    }

    public void setCountry(int i, SearchColumnEnumSelectField _value) {
        this.country[i] = _value;
    }

    public SearchColumnStringField[] getCountryCode() {
        return this.countryCode;
    }

    public void setCountryCode(SearchColumnStringField[] countryCode) {
        this.countryCode = countryCode;
    }

    public SearchColumnStringField getCountryCode(int i) {
        return this.countryCode[i];
    }

    public void setCountryCode(int i, SearchColumnStringField _value) {
        this.countryCode[i] = _value;
    }

    public SearchColumnEnumSelectField[] getCreditHold() {
        return this.creditHold;
    }

    public void setCreditHold(SearchColumnEnumSelectField[] creditHold) {
        this.creditHold = creditHold;
    }

    public SearchColumnEnumSelectField getCreditHold(int i) {
        return this.creditHold[i];
    }

    public void setCreditHold(int i, SearchColumnEnumSelectField _value) {
        this.creditHold[i] = _value;
    }

    public SearchColumnBooleanField[] getCreditHoldOverride() {
        return this.creditHoldOverride;
    }

    public void setCreditHoldOverride(SearchColumnBooleanField[] creditHoldOverride) {
        this.creditHoldOverride = creditHoldOverride;
    }

    public SearchColumnBooleanField getCreditHoldOverride(int i) {
        return this.creditHoldOverride[i];
    }

    public void setCreditHoldOverride(int i, SearchColumnBooleanField _value) {
        this.creditHoldOverride[i] = _value;
    }

    public SearchColumnDoubleField[] getCreditLimit() {
        return this.creditLimit;
    }

    public void setCreditLimit(SearchColumnDoubleField[] creditLimit) {
        this.creditLimit = creditLimit;
    }

    public SearchColumnDoubleField getCreditLimit(int i) {
        return this.creditLimit[i];
    }

    public void setCreditLimit(int i, SearchColumnDoubleField _value) {
        this.creditLimit[i] = _value;
    }

    public SearchColumnSelectField[] getCurrency() {
        return this.currency;
    }

    public void setCurrency(SearchColumnSelectField[] currency) {
        this.currency = currency;
    }

    public SearchColumnSelectField getCurrency(int i) {
        return this.currency[i];
    }

    public void setCurrency(int i, SearchColumnSelectField _value) {
        this.currency[i] = _value;
    }

    public SearchColumnDateField[] getDateClosed() {
        return this.dateClosed;
    }

    public void setDateClosed(SearchColumnDateField[] dateClosed) {
        this.dateClosed = dateClosed;
    }

    public SearchColumnDateField getDateClosed(int i) {
        return this.dateClosed[i];
    }

    public void setDateClosed(int i, SearchColumnDateField _value) {
        this.dateClosed[i] = _value;
    }

    public SearchColumnDateField[] getDateCreated() {
        return this.dateCreated;
    }

    public void setDateCreated(SearchColumnDateField[] dateCreated) {
        this.dateCreated = dateCreated;
    }

    public SearchColumnDateField getDateCreated(int i) {
        return this.dateCreated[i];
    }

    public void setDateCreated(int i, SearchColumnDateField _value) {
        this.dateCreated[i] = _value;
    }

    public SearchColumnLongField[] getDaysOverdue() {
        return this.daysOverdue;
    }

    public void setDaysOverdue(SearchColumnLongField[] daysOverdue) {
        this.daysOverdue = daysOverdue;
    }

    public SearchColumnLongField getDaysOverdue(int i) {
        return this.daysOverdue[i];
    }

    public void setDaysOverdue(int i, SearchColumnLongField _value) {
        this.daysOverdue[i] = _value;
    }

    public SearchColumnDoubleField[] getDefaultOrderPriority() {
        return this.defaultOrderPriority;
    }

    public void setDefaultOrderPriority(SearchColumnDoubleField[] defaultOrderPriority) {
        this.defaultOrderPriority = defaultOrderPriority;
    }

    public SearchColumnDoubleField getDefaultOrderPriority(int i) {
        return this.defaultOrderPriority[i];
    }

    public void setDefaultOrderPriority(int i, SearchColumnDoubleField _value) {
        this.defaultOrderPriority[i] = _value;
    }

    public SearchColumnStringField[] getDefaultTaxReg() {
        return this.defaultTaxReg;
    }

    public void setDefaultTaxReg(SearchColumnStringField[] defaultTaxReg) {
        this.defaultTaxReg = defaultTaxReg;
    }

    public SearchColumnStringField getDefaultTaxReg(int i) {
        return this.defaultTaxReg[i];
    }

    public void setDefaultTaxReg(int i, SearchColumnStringField _value) {
        this.defaultTaxReg[i] = _value;
    }

    public SearchColumnDoubleField[] getDepositBalance() {
        return this.depositBalance;
    }

    public void setDepositBalance(SearchColumnDoubleField[] depositBalance) {
        this.depositBalance = depositBalance;
    }

    public SearchColumnDoubleField getDepositBalance(int i) {
        return this.depositBalance[i];
    }

    public void setDepositBalance(int i, SearchColumnDoubleField _value) {
        this.depositBalance[i] = _value;
    }

    public SearchColumnStringField[] getDrAccount() {
        return this.drAccount;
    }

    public void setDrAccount(SearchColumnStringField[] drAccount) {
        this.drAccount = drAccount;
    }

    public SearchColumnStringField getDrAccount(int i) {
        return this.drAccount[i];
    }

    public void setDrAccount(int i, SearchColumnStringField _value) {
        this.drAccount[i] = _value;
    }

    public SearchColumnStringField[] getEmail() {
        return this.email;
    }

    public void setEmail(SearchColumnStringField[] email) {
        this.email = email;
    }

    public SearchColumnStringField getEmail(int i) {
        return this.email[i];
    }

    public void setEmail(int i, SearchColumnStringField _value) {
        this.email[i] = _value;
    }

    public SearchColumnEnumSelectField[] getEmailPreference() {
        return this.emailPreference;
    }

    public void setEmailPreference(SearchColumnEnumSelectField[] emailPreference) {
        this.emailPreference = emailPreference;
    }

    public SearchColumnEnumSelectField getEmailPreference(int i) {
        return this.emailPreference[i];
    }

    public void setEmailPreference(int i, SearchColumnEnumSelectField _value) {
        this.emailPreference[i] = _value;
    }

    public SearchColumnBooleanField[] getEmailTransactions() {
        return this.emailTransactions;
    }

    public void setEmailTransactions(SearchColumnBooleanField[] emailTransactions) {
        this.emailTransactions = emailTransactions;
    }

    public SearchColumnBooleanField getEmailTransactions(int i) {
        return this.emailTransactions[i];
    }

    public void setEmailTransactions(int i, SearchColumnBooleanField _value) {
        this.emailTransactions[i] = _value;
    }

    public SearchColumnDateField[] getEndDate() {
        return this.endDate;
    }

    public void setEndDate(SearchColumnDateField[] endDate) {
        this.endDate = endDate;
    }

    public SearchColumnDateField getEndDate(int i) {
        return this.endDate[i];
    }

    public void setEndDate(int i, SearchColumnDateField _value) {
        this.endDate[i] = _value;
    }

    public SearchColumnStringField[] getEntityId() {
        return this.entityId;
    }

    public void setEntityId(SearchColumnStringField[] entityId) {
        this.entityId = entityId;
    }

    public SearchColumnStringField getEntityId(int i) {
        return this.entityId[i];
    }

    public void setEntityId(int i, SearchColumnStringField _value) {
        this.entityId[i] = _value;
    }

    public SearchColumnLongField[] getEntityNumber() {
        return this.entityNumber;
    }

    public void setEntityNumber(SearchColumnLongField[] entityNumber) {
        this.entityNumber = entityNumber;
    }

    public SearchColumnLongField getEntityNumber(int i) {
        return this.entityNumber[i];
    }

    public void setEntityNumber(int i, SearchColumnLongField _value) {
        this.entityNumber[i] = _value;
    }

    public SearchColumnSelectField[] getEntityStatus() {
        return this.entityStatus;
    }

    public void setEntityStatus(SearchColumnSelectField[] entityStatus) {
        this.entityStatus = entityStatus;
    }

    public SearchColumnSelectField getEntityStatus(int i) {
        return this.entityStatus[i];
    }

    public void setEntityStatus(int i, SearchColumnSelectField _value) {
        this.entityStatus[i] = _value;
    }

    public SearchColumnDoubleField[] getEstimatedBudget() {
        return this.estimatedBudget;
    }

    public void setEstimatedBudget(SearchColumnDoubleField[] estimatedBudget) {
        this.estimatedBudget = estimatedBudget;
    }

    public SearchColumnDoubleField getEstimatedBudget(int i) {
        return this.estimatedBudget[i];
    }

    public void setEstimatedBudget(int i, SearchColumnDoubleField _value) {
        this.estimatedBudget[i] = _value;
    }

    public SearchColumnBooleanField[] getExplicitConversion() {
        return this.explicitConversion;
    }

    public void setExplicitConversion(SearchColumnBooleanField[] explicitConversion) {
        this.explicitConversion = explicitConversion;
    }

    public SearchColumnBooleanField getExplicitConversion(int i) {
        return this.explicitConversion[i];
    }

    public void setExplicitConversion(int i, SearchColumnBooleanField _value) {
        this.explicitConversion[i] = _value;
    }

    public SearchColumnSelectField[] getExternalId() {
        return this.externalId;
    }

    public void setExternalId(SearchColumnSelectField[] externalId) {
        this.externalId = externalId;
    }

    public SearchColumnSelectField getExternalId(int i) {
        return this.externalId[i];
    }

    public void setExternalId(int i, SearchColumnSelectField _value) {
        this.externalId[i] = _value;
    }

    public SearchColumnStringField[] getFax() {
        return this.fax;
    }

    public void setFax(SearchColumnStringField[] fax) {
        this.fax = fax;
    }

    public SearchColumnStringField getFax(int i) {
        return this.fax[i];
    }

    public void setFax(int i, SearchColumnStringField _value) {
        this.fax[i] = _value;
    }

    public SearchColumnBooleanField[] getFaxTransactions() {
        return this.faxTransactions;
    }

    public void setFaxTransactions(SearchColumnBooleanField[] faxTransactions) {
        this.faxTransactions = faxTransactions;
    }

    public SearchColumnBooleanField getFaxTransactions(int i) {
        return this.faxTransactions[i];
    }

    public void setFaxTransactions(int i, SearchColumnBooleanField _value) {
        this.faxTransactions[i] = _value;
    }

    public SearchColumnStringField[] getFirstName() {
        return this.firstName;
    }

    public void setFirstName(SearchColumnStringField[] firstName) {
        this.firstName = firstName;
    }

    public SearchColumnStringField getFirstName(int i) {
        return this.firstName[i];
    }

    public void setFirstName(int i, SearchColumnStringField _value) {
        this.firstName[i] = _value;
    }

    public SearchColumnDateField[] getFirstOrderDate() {
        return this.firstOrderDate;
    }

    public void setFirstOrderDate(SearchColumnDateField[] firstOrderDate) {
        this.firstOrderDate = firstOrderDate;
    }

    public SearchColumnDateField getFirstOrderDate(int i) {
        return this.firstOrderDate[i];
    }

    public void setFirstOrderDate(int i, SearchColumnDateField _value) {
        this.firstOrderDate[i] = _value;
    }

    public SearchColumnDateField[] getFirstSaleDate() {
        return this.firstSaleDate;
    }

    public void setFirstSaleDate(SearchColumnDateField[] firstSaleDate) {
        this.firstSaleDate = firstSaleDate;
    }

    public SearchColumnDateField getFirstSaleDate(int i) {
        return this.firstSaleDate[i];
    }

    public void setFirstSaleDate(int i, SearchColumnDateField _value) {
        this.firstSaleDate[i] = _value;
    }

    public SearchColumnStringField[] getFxAccount() {
        return this.fxAccount;
    }

    public void setFxAccount(SearchColumnStringField[] fxAccount) {
        this.fxAccount = fxAccount;
    }

    public SearchColumnStringField getFxAccount(int i) {
        return this.fxAccount[i];
    }

    public void setFxAccount(int i, SearchColumnStringField _value) {
        this.fxAccount[i] = _value;
    }

    public SearchColumnDoubleField[] getFxBalance() {
        return this.fxBalance;
    }

    public void setFxBalance(SearchColumnDoubleField[] fxBalance) {
        this.fxBalance = fxBalance;
    }

    public SearchColumnDoubleField getFxBalance(int i) {
        return this.fxBalance[i];
    }

    public void setFxBalance(int i, SearchColumnDoubleField _value) {
        this.fxBalance[i] = _value;
    }

    public SearchColumnDoubleField[] getFxConsolBalance() {
        return this.fxConsolBalance;
    }

    public void setFxConsolBalance(SearchColumnDoubleField[] fxConsolBalance) {
        this.fxConsolBalance = fxConsolBalance;
    }

    public SearchColumnDoubleField getFxConsolBalance(int i) {
        return this.fxConsolBalance[i];
    }

    public void setFxConsolBalance(int i, SearchColumnDoubleField _value) {
        this.fxConsolBalance[i] = _value;
    }

    public SearchColumnDoubleField[] getFxConsolUnbilledOrders() {
        return this.fxConsolUnbilledOrders;
    }

    public void setFxConsolUnbilledOrders(SearchColumnDoubleField[] fxConsolUnbilledOrders) {
        this.fxConsolUnbilledOrders = fxConsolUnbilledOrders;
    }

    public SearchColumnDoubleField getFxConsolUnbilledOrders(int i) {
        return this.fxConsolUnbilledOrders[i];
    }

    public void setFxConsolUnbilledOrders(int i, SearchColumnDoubleField _value) {
        this.fxConsolUnbilledOrders[i] = _value;
    }

    public SearchColumnDoubleField[] getFxUnbilledOrders() {
        return this.fxUnbilledOrders;
    }

    public void setFxUnbilledOrders(SearchColumnDoubleField[] fxUnbilledOrders) {
        this.fxUnbilledOrders = fxUnbilledOrders;
    }

    public SearchColumnDoubleField getFxUnbilledOrders(int i) {
        return this.fxUnbilledOrders[i];
    }

    public void setFxUnbilledOrders(int i, SearchColumnDoubleField _value) {
        this.fxUnbilledOrders[i] = _value;
    }

    public SearchColumnBooleanField[] getGiveAccess() {
        return this.giveAccess;
    }

    public void setGiveAccess(SearchColumnBooleanField[] giveAccess) {
        this.giveAccess = giveAccess;
    }

    public SearchColumnBooleanField getGiveAccess(int i) {
        return this.giveAccess[i];
    }

    public void setGiveAccess(int i, SearchColumnBooleanField _value) {
        this.giveAccess[i] = _value;
    }

    public SearchColumnEnumSelectField[] getGlobalSubscriptionStatus() {
        return this.globalSubscriptionStatus;
    }

    public void setGlobalSubscriptionStatus(SearchColumnEnumSelectField[] globalSubscriptionStatus) {
        this.globalSubscriptionStatus = globalSubscriptionStatus;
    }

    public SearchColumnEnumSelectField getGlobalSubscriptionStatus(int i) {
        return this.globalSubscriptionStatus[i];
    }

    public void setGlobalSubscriptionStatus(int i, SearchColumnEnumSelectField _value) {
        this.globalSubscriptionStatus[i] = _value;
    }

    public SearchColumnStringField[] getGroupPricingLevel() {
        return this.groupPricingLevel;
    }

    public void setGroupPricingLevel(SearchColumnStringField[] groupPricingLevel) {
        this.groupPricingLevel = groupPricingLevel;
    }

    public SearchColumnStringField getGroupPricingLevel(int i) {
        return this.groupPricingLevel[i];
    }

    public void setGroupPricingLevel(int i, SearchColumnStringField _value) {
        this.groupPricingLevel[i] = _value;
    }

    public SearchColumnBooleanField[] getHasDuplicates() {
        return this.hasDuplicates;
    }

    public void setHasDuplicates(SearchColumnBooleanField[] hasDuplicates) {
        this.hasDuplicates = hasDuplicates;
    }

    public SearchColumnBooleanField getHasDuplicates(int i) {
        return this.hasDuplicates[i];
    }

    public void setHasDuplicates(int i, SearchColumnBooleanField _value) {
        this.hasDuplicates[i] = _value;
    }

    public SearchColumnStringField[] getHomePhone() {
        return this.homePhone;
    }

    public void setHomePhone(SearchColumnStringField[] homePhone) {
        this.homePhone = homePhone;
    }

    public SearchColumnStringField getHomePhone(int i) {
        return this.homePhone[i];
    }

    public void setHomePhone(int i, SearchColumnStringField _value) {
        this.homePhone[i] = _value;
    }

    public SearchColumnSelectField[] getImage() {
        return this.image;
    }

    public void setImage(SearchColumnSelectField[] image) {
        this.image = image;
    }

    public SearchColumnSelectField getImage(int i) {
        return this.image[i];
    }

    public void setImage(int i, SearchColumnSelectField _value) {
        this.image[i] = _value;
    }

    public SearchColumnSelectField[] getInternalId() {
        return this.internalId;
    }

    public void setInternalId(SearchColumnSelectField[] internalId) {
        this.internalId = internalId;
    }

    public SearchColumnSelectField getInternalId(int i) {
        return this.internalId[i];
    }

    public void setInternalId(int i, SearchColumnSelectField _value) {
        this.internalId[i] = _value;
    }

    public SearchColumnBooleanField[] getIsBudgetApproved() {
        return this.isBudgetApproved;
    }

    public void setIsBudgetApproved(SearchColumnBooleanField[] isBudgetApproved) {
        this.isBudgetApproved = isBudgetApproved;
    }

    public SearchColumnBooleanField getIsBudgetApproved(int i) {
        return this.isBudgetApproved[i];
    }

    public void setIsBudgetApproved(int i, SearchColumnBooleanField _value) {
        this.isBudgetApproved[i] = _value;
    }

    public SearchColumnBooleanField[] getIsDefaultBilling() {
        return this.isDefaultBilling;
    }

    public void setIsDefaultBilling(SearchColumnBooleanField[] isDefaultBilling) {
        this.isDefaultBilling = isDefaultBilling;
    }

    public SearchColumnBooleanField getIsDefaultBilling(int i) {
        return this.isDefaultBilling[i];
    }

    public void setIsDefaultBilling(int i, SearchColumnBooleanField _value) {
        this.isDefaultBilling[i] = _value;
    }

    public SearchColumnBooleanField[] getIsDefaultShipping() {
        return this.isDefaultShipping;
    }

    public void setIsDefaultShipping(SearchColumnBooleanField[] isDefaultShipping) {
        this.isDefaultShipping = isDefaultShipping;
    }

    public SearchColumnBooleanField getIsDefaultShipping(int i) {
        return this.isDefaultShipping[i];
    }

    public void setIsDefaultShipping(int i, SearchColumnBooleanField _value) {
        this.isDefaultShipping[i] = _value;
    }

    public SearchColumnBooleanField[] getIsInactive() {
        return this.isInactive;
    }

    public void setIsInactive(SearchColumnBooleanField[] isInactive) {
        this.isInactive = isInactive;
    }

    public SearchColumnBooleanField getIsInactive(int i) {
        return this.isInactive[i];
    }

    public void setIsInactive(int i, SearchColumnBooleanField _value) {
        this.isInactive[i] = _value;
    }

    public SearchColumnBooleanField[] getIsPerson() {
        return this.isPerson;
    }

    public void setIsPerson(SearchColumnBooleanField[] isPerson) {
        this.isPerson = isPerson;
    }

    public SearchColumnBooleanField getIsPerson(int i) {
        return this.isPerson[i];
    }

    public void setIsPerson(int i, SearchColumnBooleanField _value) {
        this.isPerson[i] = _value;
    }

    public SearchColumnBooleanField[] getIsShipAddress() {
        return this.isShipAddress;
    }

    public void setIsShipAddress(SearchColumnBooleanField[] isShipAddress) {
        this.isShipAddress = isShipAddress;
    }

    public SearchColumnBooleanField getIsShipAddress(int i) {
        return this.isShipAddress[i];
    }

    public void setIsShipAddress(int i, SearchColumnBooleanField _value) {
        this.isShipAddress[i] = _value;
    }

    public SearchColumnStringField[] getItemPricingLevel() {
        return this.itemPricingLevel;
    }

    public void setItemPricingLevel(SearchColumnStringField[] itemPricingLevel) {
        this.itemPricingLevel = itemPricingLevel;
    }

    public SearchColumnStringField getItemPricingLevel(int i) {
        return this.itemPricingLevel[i];
    }

    public void setItemPricingLevel(int i, SearchColumnStringField _value) {
        this.itemPricingLevel[i] = _value;
    }

    public SearchColumnDoubleField[] getItemPricingUnitPrice() {
        return this.itemPricingUnitPrice;
    }

    public void setItemPricingUnitPrice(SearchColumnDoubleField[] itemPricingUnitPrice) {
        this.itemPricingUnitPrice = itemPricingUnitPrice;
    }

    public SearchColumnDoubleField getItemPricingUnitPrice(int i) {
        return this.itemPricingUnitPrice[i];
    }

    public void setItemPricingUnitPrice(int i, SearchColumnDoubleField _value) {
        this.itemPricingUnitPrice[i] = _value;
    }

    public SearchColumnDateField[] getJobEndDate() {
        return this.jobEndDate;
    }

    public void setJobEndDate(SearchColumnDateField[] jobEndDate) {
        this.jobEndDate = jobEndDate;
    }

    public SearchColumnDateField getJobEndDate(int i) {
        return this.jobEndDate[i];
    }

    public void setJobEndDate(int i, SearchColumnDateField _value) {
        this.jobEndDate[i] = _value;
    }

    public SearchColumnDateField[] getJobProjectedEnd() {
        return this.jobProjectedEnd;
    }

    public void setJobProjectedEnd(SearchColumnDateField[] jobProjectedEnd) {
        this.jobProjectedEnd = jobProjectedEnd;
    }

    public SearchColumnDateField getJobProjectedEnd(int i) {
        return this.jobProjectedEnd[i];
    }

    public void setJobProjectedEnd(int i, SearchColumnDateField _value) {
        this.jobProjectedEnd[i] = _value;
    }

    public SearchColumnDateField[] getJobStartDate() {
        return this.jobStartDate;
    }

    public void setJobStartDate(SearchColumnDateField[] jobStartDate) {
        this.jobStartDate = jobStartDate;
    }

    public SearchColumnDateField getJobStartDate(int i) {
        return this.jobStartDate[i];
    }

    public void setJobStartDate(int i, SearchColumnDateField _value) {
        this.jobStartDate[i] = _value;
    }

    public SearchColumnSelectField[] getJobType() {
        return this.jobType;
    }

    public void setJobType(SearchColumnSelectField[] jobType) {
        this.jobType = jobType;
    }

    public SearchColumnSelectField getJobType(int i) {
        return this.jobType[i];
    }

    public void setJobType(int i, SearchColumnSelectField _value) {
        this.jobType[i] = _value;
    }

    public SearchColumnEnumSelectField[] getLanguage() {
        return this.language;
    }

    public void setLanguage(SearchColumnEnumSelectField[] language) {
        this.language = language;
    }

    public SearchColumnEnumSelectField getLanguage(int i) {
        return this.language[i];
    }

    public void setLanguage(int i, SearchColumnEnumSelectField _value) {
        this.language[i] = _value;
    }

    public SearchColumnDateField[] getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    public void setLastModifiedDate(SearchColumnDateField[] lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public SearchColumnDateField getLastModifiedDate(int i) {
        return this.lastModifiedDate[i];
    }

    public void setLastModifiedDate(int i, SearchColumnDateField _value) {
        this.lastModifiedDate[i] = _value;
    }

    public SearchColumnStringField[] getLastName() {
        return this.lastName;
    }

    public void setLastName(SearchColumnStringField[] lastName) {
        this.lastName = lastName;
    }

    public SearchColumnStringField getLastName(int i) {
        return this.lastName[i];
    }

    public void setLastName(int i, SearchColumnStringField _value) {
        this.lastName[i] = _value;
    }

    public SearchColumnDateField[] getLastOrderDate() {
        return this.lastOrderDate;
    }

    public void setLastOrderDate(SearchColumnDateField[] lastOrderDate) {
        this.lastOrderDate = lastOrderDate;
    }

    public SearchColumnDateField getLastOrderDate(int i) {
        return this.lastOrderDate[i];
    }

    public void setLastOrderDate(int i, SearchColumnDateField _value) {
        this.lastOrderDate[i] = _value;
    }

    public SearchColumnDateField[] getLastSaleDate() {
        return this.lastSaleDate;
    }

    public void setLastSaleDate(SearchColumnDateField[] lastSaleDate) {
        this.lastSaleDate = lastSaleDate;
    }

    public SearchColumnDateField getLastSaleDate(int i) {
        return this.lastSaleDate[i];
    }

    public void setLastSaleDate(int i, SearchColumnDateField _value) {
        this.lastSaleDate[i] = _value;
    }

    public SearchColumnDateField[] getLeadDate() {
        return this.leadDate;
    }

    public void setLeadDate(SearchColumnDateField[] leadDate) {
        this.leadDate = leadDate;
    }

    public SearchColumnDateField getLeadDate(int i) {
        return this.leadDate[i];
    }

    public void setLeadDate(int i, SearchColumnDateField _value) {
        this.leadDate[i] = _value;
    }

    public SearchColumnSelectField[] getLeadSource() {
        return this.leadSource;
    }

    public void setLeadSource(SearchColumnSelectField[] leadSource) {
        this.leadSource = leadSource;
    }

    public SearchColumnSelectField getLeadSource(int i) {
        return this.leadSource[i];
    }

    public void setLeadSource(int i, SearchColumnSelectField _value) {
        this.leadSource[i] = _value;
    }

    public SearchColumnEnumSelectField[] getLevel() {
        return this.level;
    }

    public void setLevel(SearchColumnEnumSelectField[] level) {
        this.level = level;
    }

    public SearchColumnEnumSelectField getLevel(int i) {
        return this.level[i];
    }

    public void setLevel(int i, SearchColumnEnumSelectField _value) {
        this.level[i] = _value;
    }

    public SearchColumnBooleanField[] getManualCreditHold() {
        return this.manualCreditHold;
    }

    public void setManualCreditHold(SearchColumnBooleanField[] manualCreditHold) {
        this.manualCreditHold = manualCreditHold;
    }

    public SearchColumnBooleanField getManualCreditHold(int i) {
        return this.manualCreditHold[i];
    }

    public void setManualCreditHold(int i, SearchColumnBooleanField _value) {
        this.manualCreditHold[i] = _value;
    }

    public SearchColumnStringField[] getMiddleName() {
        return this.middleName;
    }

    public void setMiddleName(SearchColumnStringField[] middleName) {
        this.middleName = middleName;
    }

    public SearchColumnStringField getMiddleName(int i) {
        return this.middleName[i];
    }

    public void setMiddleName(int i, SearchColumnStringField _value) {
        this.middleName[i] = _value;
    }

    public SearchColumnStringField[] getMobilePhone() {
        return this.mobilePhone;
    }

    public void setMobilePhone(SearchColumnStringField[] mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public SearchColumnStringField getMobilePhone(int i) {
        return this.mobilePhone[i];
    }

    public void setMobilePhone(int i, SearchColumnStringField _value) {
        this.mobilePhone[i] = _value;
    }

    public SearchColumnEnumSelectField[] getMonthlyClosing() {
        return this.monthlyClosing;
    }

    public void setMonthlyClosing(SearchColumnEnumSelectField[] monthlyClosing) {
        this.monthlyClosing = monthlyClosing;
    }

    public SearchColumnEnumSelectField getMonthlyClosing(int i) {
        return this.monthlyClosing[i];
    }

    public void setMonthlyClosing(int i, SearchColumnEnumSelectField _value) {
        this.monthlyClosing[i] = _value;
    }

    public SearchColumnBooleanField[] getOnCreditHold() {
        return this.onCreditHold;
    }

    public void setOnCreditHold(SearchColumnBooleanField[] onCreditHold) {
        this.onCreditHold = onCreditHold;
    }

    public SearchColumnBooleanField getOnCreditHold(int i) {
        return this.onCreditHold[i];
    }

    public void setOnCreditHold(int i, SearchColumnBooleanField _value) {
        this.onCreditHold[i] = _value;
    }

    public SearchColumnDoubleField[] getOverdueBalance() {
        return this.overdueBalance;
    }

    public void setOverdueBalance(SearchColumnDoubleField[] overdueBalance) {
        this.overdueBalance = overdueBalance;
    }

    public SearchColumnDoubleField getOverdueBalance(int i) {
        return this.overdueBalance[i];
    }

    public void setOverdueBalance(int i, SearchColumnDoubleField _value) {
        this.overdueBalance[i] = _value;
    }

    public SearchColumnSelectField[] getParent() {
        return this.parent;
    }

    public void setParent(SearchColumnSelectField[] parent) {
        this.parent = parent;
    }

    public SearchColumnSelectField getParent(int i) {
        return this.parent[i];
    }

    public void setParent(int i, SearchColumnSelectField _value) {
        this.parent[i] = _value;
    }

    public SearchColumnSelectField[] getPartner() {
        return this.partner;
    }

    public void setPartner(SearchColumnSelectField[] partner) {
        this.partner = partner;
    }

    public SearchColumnSelectField getPartner(int i) {
        return this.partner[i];
    }

    public void setPartner(int i, SearchColumnSelectField _value) {
        this.partner[i] = _value;
    }

    public SearchColumnDoubleField[] getPartnerContribution() {
        return this.partnerContribution;
    }

    public void setPartnerContribution(SearchColumnDoubleField[] partnerContribution) {
        this.partnerContribution = partnerContribution;
    }

    public SearchColumnDoubleField getPartnerContribution(int i) {
        return this.partnerContribution[i];
    }

    public void setPartnerContribution(int i, SearchColumnDoubleField _value) {
        this.partnerContribution[i] = _value;
    }

    public SearchColumnStringField[] getPartnerRole() {
        return this.partnerRole;
    }

    public void setPartnerRole(SearchColumnStringField[] partnerRole) {
        this.partnerRole = partnerRole;
    }

    public SearchColumnStringField getPartnerRole(int i) {
        return this.partnerRole[i];
    }

    public void setPartnerRole(int i, SearchColumnStringField _value) {
        this.partnerRole[i] = _value;
    }

    public SearchColumnSelectField[] getPartnerTeamMember() {
        return this.partnerTeamMember;
    }

    public void setPartnerTeamMember(SearchColumnSelectField[] partnerTeamMember) {
        this.partnerTeamMember = partnerTeamMember;
    }

    public SearchColumnSelectField getPartnerTeamMember(int i) {
        return this.partnerTeamMember[i];
    }

    public void setPartnerTeamMember(int i, SearchColumnSelectField _value) {
        this.partnerTeamMember[i] = _value;
    }

    public SearchColumnStringField[] getPec() {
        return this.pec;
    }

    public void setPec(SearchColumnStringField[] pec) {
        this.pec = pec;
    }

    public SearchColumnStringField getPec(int i) {
        return this.pec[i];
    }

    public void setPec(int i, SearchColumnStringField _value) {
        this.pec[i] = _value;
    }

    public SearchColumnEnumSelectField[] getPermission() {
        return this.permission;
    }

    public void setPermission(SearchColumnEnumSelectField[] permission) {
        this.permission = permission;
    }

    public SearchColumnEnumSelectField getPermission(int i) {
        return this.permission[i];
    }

    public void setPermission(int i, SearchColumnEnumSelectField _value) {
        this.permission[i] = _value;
    }

    public SearchColumnStringField[] getPhone() {
        return this.phone;
    }

    public void setPhone(SearchColumnStringField[] phone) {
        this.phone = phone;
    }

    public SearchColumnStringField getPhone(int i) {
        return this.phone[i];
    }

    public void setPhone(int i, SearchColumnStringField _value) {
        this.phone[i] = _value;
    }

    public SearchColumnStringField[] getPhoneticName() {
        return this.phoneticName;
    }

    public void setPhoneticName(SearchColumnStringField[] phoneticName) {
        this.phoneticName = phoneticName;
    }

    public SearchColumnStringField getPhoneticName(int i) {
        return this.phoneticName[i];
    }

    public void setPhoneticName(int i, SearchColumnStringField _value) {
        this.phoneticName[i] = _value;
    }

    public SearchColumnSelectField[] getPrefCCProcessor() {
        return this.prefCCProcessor;
    }

    public void setPrefCCProcessor(SearchColumnSelectField[] prefCCProcessor) {
        this.prefCCProcessor = prefCCProcessor;
    }

    public SearchColumnSelectField getPrefCCProcessor(int i) {
        return this.prefCCProcessor[i];
    }

    public void setPrefCCProcessor(int i, SearchColumnSelectField _value) {
        this.prefCCProcessor[i] = _value;
    }

    public SearchColumnSelectField[] getPriceLevel() {
        return this.priceLevel;
    }

    public void setPriceLevel(SearchColumnSelectField[] priceLevel) {
        this.priceLevel = priceLevel;
    }

    public SearchColumnSelectField getPriceLevel(int i) {
        return this.priceLevel[i];
    }

    public void setPriceLevel(int i, SearchColumnSelectField _value) {
        this.priceLevel[i] = _value;
    }

    public SearchColumnStringField[] getPricingGroup() {
        return this.pricingGroup;
    }

    public void setPricingGroup(SearchColumnStringField[] pricingGroup) {
        this.pricingGroup = pricingGroup;
    }

    public SearchColumnStringField getPricingGroup(int i) {
        return this.pricingGroup[i];
    }

    public void setPricingGroup(int i, SearchColumnStringField _value) {
        this.pricingGroup[i] = _value;
    }

    public SearchColumnStringField[] getPricingItem() {
        return this.pricingItem;
    }

    public void setPricingItem(SearchColumnStringField[] pricingItem) {
        this.pricingItem = pricingItem;
    }

    public SearchColumnStringField getPricingItem(int i) {
        return this.pricingItem[i];
    }

    public void setPricingItem(int i, SearchColumnStringField _value) {
        this.pricingItem[i] = _value;
    }

    public SearchColumnBooleanField[] getPrintTransactions() {
        return this.printTransactions;
    }

    public void setPrintTransactions(SearchColumnBooleanField[] printTransactions) {
        this.printTransactions = printTransactions;
    }

    public SearchColumnBooleanField getPrintTransactions(int i) {
        return this.printTransactions[i];
    }

    public void setPrintTransactions(int i, SearchColumnBooleanField _value) {
        this.printTransactions[i] = _value;
    }

    public SearchColumnDateField[] getProspectDate() {
        return this.prospectDate;
    }

    public void setProspectDate(SearchColumnDateField[] prospectDate) {
        this.prospectDate = prospectDate;
    }

    public SearchColumnDateField getProspectDate(int i) {
        return this.prospectDate[i];
    }

    public void setProspectDate(int i, SearchColumnDateField _value) {
        this.prospectDate[i] = _value;
    }

    public SearchColumnStringField[] getReceivablesAccount() {
        return this.receivablesAccount;
    }

    public void setReceivablesAccount(SearchColumnStringField[] receivablesAccount) {
        this.receivablesAccount = receivablesAccount;
    }

    public SearchColumnStringField getReceivablesAccount(int i) {
        return this.receivablesAccount[i];
    }

    public void setReceivablesAccount(int i, SearchColumnStringField _value) {
        this.receivablesAccount[i] = _value;
    }

    public SearchColumnLongField[] getReminderDays() {
        return this.reminderDays;
    }

    public void setReminderDays(SearchColumnLongField[] reminderDays) {
        this.reminderDays = reminderDays;
    }

    public SearchColumnLongField getReminderDays(int i) {
        return this.reminderDays[i];
    }

    public void setReminderDays(int i, SearchColumnLongField _value) {
        this.reminderDays[i] = _value;
    }

    public SearchColumnStringField[] getResaleNumber() {
        return this.resaleNumber;
    }

    public void setResaleNumber(SearchColumnStringField[] resaleNumber) {
        this.resaleNumber = resaleNumber;
    }

    public SearchColumnStringField getResaleNumber(int i) {
        return this.resaleNumber[i];
    }

    public void setResaleNumber(int i, SearchColumnStringField _value) {
        this.resaleNumber[i] = _value;
    }

    public SearchColumnStringField[] getRole() {
        return this.role;
    }

    public void setRole(SearchColumnStringField[] role) {
        this.role = role;
    }

    public SearchColumnStringField getRole(int i) {
        return this.role[i];
    }

    public void setRole(int i, SearchColumnStringField _value) {
        this.role[i] = _value;
    }

    public SearchColumnStringField[] getSalesReadiness() {
        return this.salesReadiness;
    }

    public void setSalesReadiness(SearchColumnStringField[] salesReadiness) {
        this.salesReadiness = salesReadiness;
    }

    public SearchColumnStringField getSalesReadiness(int i) {
        return this.salesReadiness[i];
    }

    public void setSalesReadiness(int i, SearchColumnStringField _value) {
        this.salesReadiness[i] = _value;
    }

    public SearchColumnSelectField[] getSalesRep() {
        return this.salesRep;
    }

    public void setSalesRep(SearchColumnSelectField[] salesRep) {
        this.salesRep = salesRep;
    }

    public SearchColumnSelectField getSalesRep(int i) {
        return this.salesRep[i];
    }

    public void setSalesRep(int i, SearchColumnSelectField _value) {
        this.salesRep[i] = _value;
    }

    public SearchColumnSelectField[] getSalesTeamMember() {
        return this.salesTeamMember;
    }

    public void setSalesTeamMember(SearchColumnSelectField[] salesTeamMember) {
        this.salesTeamMember = salesTeamMember;
    }

    public SearchColumnSelectField getSalesTeamMember(int i) {
        return this.salesTeamMember[i];
    }

    public void setSalesTeamMember(int i, SearchColumnSelectField _value) {
        this.salesTeamMember[i] = _value;
    }

    public SearchColumnSelectField[] getSalesTeamRole() {
        return this.salesTeamRole;
    }

    public void setSalesTeamRole(SearchColumnSelectField[] salesTeamRole) {
        this.salesTeamRole = salesTeamRole;
    }

    public SearchColumnSelectField getSalesTeamRole(int i) {
        return this.salesTeamRole[i];
    }

    public void setSalesTeamRole(int i, SearchColumnSelectField _value) {
        this.salesTeamRole[i] = _value;
    }

    public SearchColumnStringField[] getSalutation() {
        return this.salutation;
    }

    public void setSalutation(SearchColumnStringField[] salutation) {
        this.salutation = salutation;
    }

    public SearchColumnStringField getSalutation(int i) {
        return this.salutation[i];
    }

    public void setSalutation(int i, SearchColumnStringField _value) {
        this.salutation[i] = _value;
    }

    public SearchColumnStringField[] getShipAddress() {
        return this.shipAddress;
    }

    public void setShipAddress(SearchColumnStringField[] shipAddress) {
        this.shipAddress = shipAddress;
    }

    public SearchColumnStringField getShipAddress(int i) {
        return this.shipAddress[i];
    }

    public void setShipAddress(int i, SearchColumnStringField _value) {
        this.shipAddress[i] = _value;
    }

    public SearchColumnStringField[] getShipAddress1() {
        return this.shipAddress1;
    }

    public void setShipAddress1(SearchColumnStringField[] shipAddress1) {
        this.shipAddress1 = shipAddress1;
    }

    public SearchColumnStringField getShipAddress1(int i) {
        return this.shipAddress1[i];
    }

    public void setShipAddress1(int i, SearchColumnStringField _value) {
        this.shipAddress1[i] = _value;
    }

    public SearchColumnStringField[] getShipAddress2() {
        return this.shipAddress2;
    }

    public void setShipAddress2(SearchColumnStringField[] shipAddress2) {
        this.shipAddress2 = shipAddress2;
    }

    public SearchColumnStringField getShipAddress2(int i) {
        return this.shipAddress2[i];
    }

    public void setShipAddress2(int i, SearchColumnStringField _value) {
        this.shipAddress2[i] = _value;
    }

    public SearchColumnStringField[] getShipAddress3() {
        return this.shipAddress3;
    }

    public void setShipAddress3(SearchColumnStringField[] shipAddress3) {
        this.shipAddress3 = shipAddress3;
    }

    public SearchColumnStringField getShipAddress3(int i) {
        return this.shipAddress3[i];
    }

    public void setShipAddress3(int i, SearchColumnStringField _value) {
        this.shipAddress3[i] = _value;
    }

    public SearchColumnStringField[] getShipAddressee() {
        return this.shipAddressee;
    }

    public void setShipAddressee(SearchColumnStringField[] shipAddressee) {
        this.shipAddressee = shipAddressee;
    }

    public SearchColumnStringField getShipAddressee(int i) {
        return this.shipAddressee[i];
    }

    public void setShipAddressee(int i, SearchColumnStringField _value) {
        this.shipAddressee[i] = _value;
    }

    public SearchColumnStringField[] getShipAttention() {
        return this.shipAttention;
    }

    public void setShipAttention(SearchColumnStringField[] shipAttention) {
        this.shipAttention = shipAttention;
    }

    public SearchColumnStringField getShipAttention(int i) {
        return this.shipAttention[i];
    }

    public void setShipAttention(int i, SearchColumnStringField _value) {
        this.shipAttention[i] = _value;
    }

    public SearchColumnStringField[] getShipCity() {
        return this.shipCity;
    }

    public void setShipCity(SearchColumnStringField[] shipCity) {
        this.shipCity = shipCity;
    }

    public SearchColumnStringField getShipCity(int i) {
        return this.shipCity[i];
    }

    public void setShipCity(int i, SearchColumnStringField _value) {
        this.shipCity[i] = _value;
    }

    public SearchColumnBooleanField[] getShipComplete() {
        return this.shipComplete;
    }

    public void setShipComplete(SearchColumnBooleanField[] shipComplete) {
        this.shipComplete = shipComplete;
    }

    public SearchColumnBooleanField getShipComplete(int i) {
        return this.shipComplete[i];
    }

    public void setShipComplete(int i, SearchColumnBooleanField _value) {
        this.shipComplete[i] = _value;
    }

    public SearchColumnEnumSelectField[] getShipCountry() {
        return this.shipCountry;
    }

    public void setShipCountry(SearchColumnEnumSelectField[] shipCountry) {
        this.shipCountry = shipCountry;
    }

    public SearchColumnEnumSelectField getShipCountry(int i) {
        return this.shipCountry[i];
    }

    public void setShipCountry(int i, SearchColumnEnumSelectField _value) {
        this.shipCountry[i] = _value;
    }

    public SearchColumnStringField[] getShipCountryCode() {
        return this.shipCountryCode;
    }

    public void setShipCountryCode(SearchColumnStringField[] shipCountryCode) {
        this.shipCountryCode = shipCountryCode;
    }

    public SearchColumnStringField getShipCountryCode(int i) {
        return this.shipCountryCode[i];
    }

    public void setShipCountryCode(int i, SearchColumnStringField _value) {
        this.shipCountryCode[i] = _value;
    }

    public SearchColumnStringField[] getShipPhone() {
        return this.shipPhone;
    }

    public void setShipPhone(SearchColumnStringField[] shipPhone) {
        this.shipPhone = shipPhone;
    }

    public SearchColumnStringField getShipPhone(int i) {
        return this.shipPhone[i];
    }

    public void setShipPhone(int i, SearchColumnStringField _value) {
        this.shipPhone[i] = _value;
    }

    public SearchColumnSelectField[] getShippingItem() {
        return this.shippingItem;
    }

    public void setShippingItem(SearchColumnSelectField[] shippingItem) {
        this.shippingItem = shippingItem;
    }

    public SearchColumnSelectField getShippingItem(int i) {
        return this.shippingItem[i];
    }

    public void setShippingItem(int i, SearchColumnSelectField _value) {
        this.shippingItem[i] = _value;
    }

    public SearchColumnStringField[] getShipState() {
        return this.shipState;
    }

    public void setShipState(SearchColumnStringField[] shipState) {
        this.shipState = shipState;
    }

    public SearchColumnStringField getShipState(int i) {
        return this.shipState[i];
    }

    public void setShipState(int i, SearchColumnStringField _value) {
        this.shipState[i] = _value;
    }

    public SearchColumnStringField[] getShipZip() {
        return this.shipZip;
    }

    public void setShipZip(SearchColumnStringField[] shipZip) {
        this.shipZip = shipZip;
    }

    public SearchColumnStringField getShipZip(int i) {
        return this.shipZip[i];
    }

    public void setShipZip(int i, SearchColumnStringField _value) {
        this.shipZip[i] = _value;
    }

    public SearchColumnSelectField[] getSourceSite() {
        return this.sourceSite;
    }

    public void setSourceSite(SearchColumnSelectField[] sourceSite) {
        this.sourceSite = sourceSite;
    }

    public SearchColumnSelectField getSourceSite(int i) {
        return this.sourceSite[i];
    }

    public void setSourceSite(int i, SearchColumnSelectField _value) {
        this.sourceSite[i] = _value;
    }

    public SearchColumnLongField[] getSourceSiteId() {
        return this.sourceSiteId;
    }

    public void setSourceSiteId(SearchColumnLongField[] sourceSiteId) {
        this.sourceSiteId = sourceSiteId;
    }

    public SearchColumnLongField getSourceSiteId(int i) {
        return this.sourceSiteId[i];
    }

    public void setSourceSiteId(int i, SearchColumnLongField _value) {
        this.sourceSiteId[i] = _value;
    }

    public SearchColumnStringField[] getStage() {
        return this.stage;
    }

    public void setStage(SearchColumnStringField[] stage) {
        this.stage = stage;
    }

    public SearchColumnStringField getStage(int i) {
        return this.stage[i];
    }

    public void setStage(int i, SearchColumnStringField _value) {
        this.stage[i] = _value;
    }

    public SearchColumnDateField[] getStartDate() {
        return this.startDate;
    }

    public void setStartDate(SearchColumnDateField[] startDate) {
        this.startDate = startDate;
    }

    public SearchColumnDateField getStartDate(int i) {
        return this.startDate[i];
    }

    public void setStartDate(int i, SearchColumnDateField _value) {
        this.startDate[i] = _value;
    }

    public SearchColumnEnumSelectField[] getState() {
        return this.state;
    }

    public void setState(SearchColumnEnumSelectField[] state) {
        this.state = state;
    }

    public SearchColumnEnumSelectField getState(int i) {
        return this.state[i];
    }

    public void setState(int i, SearchColumnEnumSelectField _value) {
        this.state[i] = _value;
    }

    public SearchColumnSelectField[] getSubscription() {
        return this.subscription;
    }

    public void setSubscription(SearchColumnSelectField[] subscription) {
        this.subscription = subscription;
    }

    public SearchColumnSelectField getSubscription(int i) {
        return this.subscription[i];
    }

    public void setSubscription(int i, SearchColumnSelectField _value) {
        this.subscription[i] = _value;
    }

    public SearchColumnDateField[] getSubscriptionDate() {
        return this.subscriptionDate;
    }

    public void setSubscriptionDate(SearchColumnDateField[] subscriptionDate) {
        this.subscriptionDate = subscriptionDate;
    }

    public SearchColumnDateField getSubscriptionDate(int i) {
        return this.subscriptionDate[i];
    }

    public void setSubscriptionDate(int i, SearchColumnDateField _value) {
        this.subscriptionDate[i] = _value;
    }

    public SearchColumnBooleanField[] getSubscriptionStatus() {
        return this.subscriptionStatus;
    }

    public void setSubscriptionStatus(SearchColumnBooleanField[] subscriptionStatus) {
        this.subscriptionStatus = subscriptionStatus;
    }

    public SearchColumnBooleanField getSubscriptionStatus(int i) {
        return this.subscriptionStatus[i];
    }

    public void setSubscriptionStatus(int i, SearchColumnBooleanField _value) {
        this.subscriptionStatus[i] = _value;
    }

    public SearchColumnSelectField[] getSubsidiary() {
        return this.subsidiary;
    }

    public void setSubsidiary(SearchColumnSelectField[] subsidiary) {
        this.subsidiary = subsidiary;
    }

    public SearchColumnSelectField getSubsidiary(int i) {
        return this.subsidiary[i];
    }

    public void setSubsidiary(int i, SearchColumnSelectField _value) {
        this.subsidiary[i] = _value;
    }

    public SearchColumnBooleanField[] getTaxable() {
        return this.taxable;
    }

    public void setTaxable(SearchColumnBooleanField[] taxable) {
        this.taxable = taxable;
    }

    public SearchColumnBooleanField getTaxable(int i) {
        return this.taxable[i];
    }

    public void setTaxable(int i, SearchColumnBooleanField _value) {
        this.taxable[i] = _value;
    }

    public SearchColumnSelectField[] getTaxItem() {
        return this.taxItem;
    }

    public void setTaxItem(SearchColumnSelectField[] taxItem) {
        this.taxItem = taxItem;
    }

    public SearchColumnSelectField getTaxItem(int i) {
        return this.taxItem[i];
    }

    public void setTaxItem(int i, SearchColumnSelectField _value) {
        this.taxItem[i] = _value;
    }

    public SearchColumnSelectField[] getTerms() {
        return this.terms;
    }

    public void setTerms(SearchColumnSelectField[] terms) {
        this.terms = terms;
    }

    public SearchColumnSelectField getTerms(int i) {
        return this.terms[i];
    }

    public void setTerms(int i, SearchColumnSelectField _value) {
        this.terms[i] = _value;
    }

    public SearchColumnSelectField[] getTerritory() {
        return this.territory;
    }

    public void setTerritory(SearchColumnSelectField[] territory) {
        this.territory = territory;
    }

    public SearchColumnSelectField getTerritory(int i) {
        return this.territory[i];
    }

    public void setTerritory(int i, SearchColumnSelectField _value) {
        this.territory[i] = _value;
    }

    public SearchColumnStringField[] getTitle() {
        return this.title;
    }

    public void setTitle(SearchColumnStringField[] title) {
        this.title = title;
    }

    public SearchColumnStringField getTitle(int i) {
        return this.title[i];
    }

    public void setTitle(int i, SearchColumnStringField _value) {
        this.title[i] = _value;
    }

    public SearchColumnDoubleField[] getUnbilledOrders() {
        return this.unbilledOrders;
    }

    public void setUnbilledOrders(SearchColumnDoubleField[] unbilledOrders) {
        this.unbilledOrders = unbilledOrders;
    }

    public SearchColumnDoubleField getUnbilledOrders(int i) {
        return this.unbilledOrders[i];
    }

    public void setUnbilledOrders(int i, SearchColumnDoubleField _value) {
        this.unbilledOrders[i] = _value;
    }

    public SearchColumnStringField[] getUrl() {
        return this.url;
    }

    public void setUrl(SearchColumnStringField[] url) {
        this.url = url;
    }

    public SearchColumnStringField getUrl(int i) {
        return this.url[i];
    }

    public void setUrl(int i, SearchColumnStringField _value) {
        this.url[i] = _value;
    }

    public SearchColumnStringField[] getVatRegNumber() {
        return this.vatRegNumber;
    }

    public void setVatRegNumber(SearchColumnStringField[] vatRegNumber) {
        this.vatRegNumber = vatRegNumber;
    }

    public SearchColumnStringField getVatRegNumber(int i) {
        return this.vatRegNumber[i];
    }

    public void setVatRegNumber(int i, SearchColumnStringField _value) {
        this.vatRegNumber[i] = _value;
    }

    public SearchColumnBooleanField[] getWebLead() {
        return this.webLead;
    }

    public void setWebLead(SearchColumnBooleanField[] webLead) {
        this.webLead = webLead;
    }

    public SearchColumnBooleanField getWebLead(int i) {
        return this.webLead[i];
    }

    public void setWebLead(int i, SearchColumnBooleanField _value) {
        this.webLead[i] = _value;
    }

    public SearchColumnStringField[] getZipCode() {
        return this.zipCode;
    }

    public void setZipCode(SearchColumnStringField[] zipCode) {
        this.zipCode = zipCode;
    }

    public SearchColumnStringField getZipCode(int i) {
        return this.zipCode[i];
    }

    public void setZipCode(int i, SearchColumnStringField _value) {
        this.zipCode[i] = _value;
    }

    public SearchColumnCustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof OriginatingLeadSearchRowBasic)) {
            return false;
        }
        OriginatingLeadSearchRowBasic other = (OriginatingLeadSearchRowBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.accountNumber == null && other.getAccountNumber() == null || this.accountNumber != null && Arrays.equals(this.accountNumber, other.getAccountNumber())) && (this.address == null && other.getAddress() == null || this.address != null && Arrays.equals(this.address, other.getAddress())) && (this.address1 == null && other.getAddress1() == null || this.address1 != null && Arrays.equals(this.address1, other.getAddress1())) && (this.address2 == null && other.getAddress2() == null || this.address2 != null && Arrays.equals(this.address2, other.getAddress2())) && (this.address3 == null && other.getAddress3() == null || this.address3 != null && Arrays.equals(this.address3, other.getAddress3())) && (this.addressee == null && other.getAddressee() == null || this.addressee != null && Arrays.equals(this.addressee, other.getAddressee())) && (this.addressInternalId == null && other.getAddressInternalId() == null || this.addressInternalId != null && Arrays.equals(this.addressInternalId, other.getAddressInternalId())) && (this.addressLabel == null && other.getAddressLabel() == null || this.addressLabel != null && Arrays.equals(this.addressLabel, other.getAddressLabel())) && (this.addressPhone == null && other.getAddressPhone() == null || this.addressPhone != null && Arrays.equals(this.addressPhone, other.getAddressPhone())) && (this.altContact == null && other.getAltContact() == null || this.altContact != null && Arrays.equals(this.altContact, other.getAltContact())) && (this.altEmail == null && other.getAltEmail() == null || this.altEmail != null && Arrays.equals(this.altEmail, other.getAltEmail())) && (this.altName == null && other.getAltName() == null || this.altName != null && Arrays.equals(this.altName, other.getAltName())) && (this.altPhone == null && other.getAltPhone() == null || this.altPhone != null && Arrays.equals(this.altPhone, other.getAltPhone())) && (this.assignedSite == null && other.getAssignedSite() == null || this.assignedSite != null && Arrays.equals(this.assignedSite, other.getAssignedSite())) && (this.assignedSiteId == null && other.getAssignedSiteId() == null || this.assignedSiteId != null && Arrays.equals(this.assignedSiteId, other.getAssignedSiteId())) && (this.attention == null && other.getAttention() == null || this.attention != null && Arrays.equals(this.attention, other.getAttention())) && (this.availableOffline == null && other.getAvailableOffline() == null || this.availableOffline != null && Arrays.equals(this.availableOffline, other.getAvailableOffline())) && (this.balance == null && other.getBalance() == null || this.balance != null && Arrays.equals(this.balance, other.getBalance())) && (this.billAddress == null && other.getBillAddress() == null || this.billAddress != null && Arrays.equals(this.billAddress, other.getBillAddress())) && (this.billAddress1 == null && other.getBillAddress1() == null || this.billAddress1 != null && Arrays.equals(this.billAddress1, other.getBillAddress1())) && (this.billAddress2 == null && other.getBillAddress2() == null || this.billAddress2 != null && Arrays.equals(this.billAddress2, other.getBillAddress2())) && (this.billAddress3 == null && other.getBillAddress3() == null || this.billAddress3 != null && Arrays.equals(this.billAddress3, other.getBillAddress3())) && (this.billAddressee == null && other.getBillAddressee() == null || this.billAddressee != null && Arrays.equals(this.billAddressee, other.getBillAddressee())) && (this.billAttention == null && other.getBillAttention() == null || this.billAttention != null && Arrays.equals(this.billAttention, other.getBillAttention())) && (this.billCity == null && other.getBillCity() == null || this.billCity != null && Arrays.equals(this.billCity, other.getBillCity())) && (this.billCountry == null && other.getBillCountry() == null || this.billCountry != null && Arrays.equals(this.billCountry, other.getBillCountry())) && (this.billCountryCode == null && other.getBillCountryCode() == null || this.billCountryCode != null && Arrays.equals(this.billCountryCode, other.getBillCountryCode())) && (this.billPhone == null && other.getBillPhone() == null || this.billPhone != null && Arrays.equals(this.billPhone, other.getBillPhone())) && (this.billState == null && other.getBillState() == null || this.billState != null && Arrays.equals(this.billState, other.getBillState())) && (this.billZipCode == null && other.getBillZipCode() == null || this.billZipCode != null && Arrays.equals(this.billZipCode, other.getBillZipCode())) && (this.buyingReason == null && other.getBuyingReason() == null || this.buyingReason != null && Arrays.equals(this.buyingReason, other.getBuyingReason())) && (this.buyingTimeFrame == null && other.getBuyingTimeFrame() == null || this.buyingTimeFrame != null && Arrays.equals(this.buyingTimeFrame, other.getBuyingTimeFrame())) && (this.category == null && other.getCategory() == null || this.category != null && Arrays.equals(this.category, other.getCategory())) && (this.ccCustomerCode == null && other.getCcCustomerCode() == null || this.ccCustomerCode != null && Arrays.equals(this.ccCustomerCode, other.getCcCustomerCode())) && (this.ccDefault == null && other.getCcDefault() == null || this.ccDefault != null && Arrays.equals(this.ccDefault, other.getCcDefault())) && (this.ccExpDate == null && other.getCcExpDate() == null || this.ccExpDate != null && Arrays.equals(this.ccExpDate, other.getCcExpDate())) && (this.ccHolderName == null && other.getCcHolderName() == null || this.ccHolderName != null && Arrays.equals(this.ccHolderName, other.getCcHolderName())) && (this.ccInternalId == null && other.getCcInternalId() == null || this.ccInternalId != null && Arrays.equals(this.ccInternalId, other.getCcInternalId())) && (this.ccNumber == null && other.getCcNumber() == null || this.ccNumber != null && Arrays.equals(this.ccNumber, other.getCcNumber())) && (this.ccState == null && other.getCcState() == null || this.ccState != null && Arrays.equals(this.ccState, other.getCcState())) && (this.ccStateFrom == null && other.getCcStateFrom() == null || this.ccStateFrom != null && Arrays.equals(this.ccStateFrom, other.getCcStateFrom())) && (this.ccType == null && other.getCcType() == null || this.ccType != null && Arrays.equals(this.ccType, other.getCcType())) && (this.city == null && other.getCity() == null || this.city != null && Arrays.equals(this.city, other.getCity())) && (this.comments == null && other.getComments() == null || this.comments != null && Arrays.equals(this.comments, other.getComments())) && (this.companyName == null && other.getCompanyName() == null || this.companyName != null && Arrays.equals(this.companyName, other.getCompanyName())) && (this.consolBalance == null && other.getConsolBalance() == null || this.consolBalance != null && Arrays.equals(this.consolBalance, other.getConsolBalance())) && (this.consolDaysOverdue == null && other.getConsolDaysOverdue() == null || this.consolDaysOverdue != null && Arrays.equals(this.consolDaysOverdue, other.getConsolDaysOverdue())) && (this.consolDepositBalance == null && other.getConsolDepositBalance() == null || this.consolDepositBalance != null && Arrays.equals(this.consolDepositBalance, other.getConsolDepositBalance())) && (this.consolOverdueBalance == null && other.getConsolOverdueBalance() == null || this.consolOverdueBalance != null && Arrays.equals(this.consolOverdueBalance, other.getConsolOverdueBalance())) && (this.consolUnbilledOrders == null && other.getConsolUnbilledOrders() == null || this.consolUnbilledOrders != null && Arrays.equals(this.consolUnbilledOrders, other.getConsolUnbilledOrders())) && (this.contact == null && other.getContact() == null || this.contact != null && Arrays.equals(this.contact, other.getContact())) && (this.contribution == null && other.getContribution() == null || this.contribution != null && Arrays.equals(this.contribution, other.getContribution())) && (this.contributionPrimary == null && other.getContributionPrimary() == null || this.contributionPrimary != null && Arrays.equals(this.contributionPrimary, other.getContributionPrimary())) && (this.conversionDate == null && other.getConversionDate() == null || this.conversionDate != null && Arrays.equals(this.conversionDate, other.getConversionDate())) && (this.country == null && other.getCountry() == null || this.country != null && Arrays.equals(this.country, other.getCountry())) && (this.countryCode == null && other.getCountryCode() == null || this.countryCode != null && Arrays.equals(this.countryCode, other.getCountryCode())) && (this.creditHold == null && other.getCreditHold() == null || this.creditHold != null && Arrays.equals(this.creditHold, other.getCreditHold())) && (this.creditHoldOverride == null && other.getCreditHoldOverride() == null || this.creditHoldOverride != null && Arrays.equals(this.creditHoldOverride, other.getCreditHoldOverride())) && (this.creditLimit == null && other.getCreditLimit() == null || this.creditLimit != null && Arrays.equals(this.creditLimit, other.getCreditLimit())) && (this.currency == null && other.getCurrency() == null || this.currency != null && Arrays.equals(this.currency, other.getCurrency())) && (this.dateClosed == null && other.getDateClosed() == null || this.dateClosed != null && Arrays.equals(this.dateClosed, other.getDateClosed())) && (this.dateCreated == null && other.getDateCreated() == null || this.dateCreated != null && Arrays.equals(this.dateCreated, other.getDateCreated())) && (this.daysOverdue == null && other.getDaysOverdue() == null || this.daysOverdue != null && Arrays.equals(this.daysOverdue, other.getDaysOverdue())) && (this.defaultOrderPriority == null && other.getDefaultOrderPriority() == null || this.defaultOrderPriority != null && Arrays.equals(this.defaultOrderPriority, other.getDefaultOrderPriority())) && (this.defaultTaxReg == null && other.getDefaultTaxReg() == null || this.defaultTaxReg != null && Arrays.equals(this.defaultTaxReg, other.getDefaultTaxReg())) && (this.depositBalance == null && other.getDepositBalance() == null || this.depositBalance != null && Arrays.equals(this.depositBalance, other.getDepositBalance())) && (this.drAccount == null && other.getDrAccount() == null || this.drAccount != null && Arrays.equals(this.drAccount, other.getDrAccount())) && (this.email == null && other.getEmail() == null || this.email != null && Arrays.equals(this.email, other.getEmail())) && (this.emailPreference == null && other.getEmailPreference() == null || this.emailPreference != null && Arrays.equals(this.emailPreference, other.getEmailPreference())) && (this.emailTransactions == null && other.getEmailTransactions() == null || this.emailTransactions != null && Arrays.equals(this.emailTransactions, other.getEmailTransactions())) && (this.endDate == null && other.getEndDate() == null || this.endDate != null && Arrays.equals(this.endDate, other.getEndDate())) && (this.entityId == null && other.getEntityId() == null || this.entityId != null && Arrays.equals(this.entityId, other.getEntityId())) && (this.entityNumber == null && other.getEntityNumber() == null || this.entityNumber != null && Arrays.equals(this.entityNumber, other.getEntityNumber())) && (this.entityStatus == null && other.getEntityStatus() == null || this.entityStatus != null && Arrays.equals(this.entityStatus, other.getEntityStatus())) && (this.estimatedBudget == null && other.getEstimatedBudget() == null || this.estimatedBudget != null && Arrays.equals(this.estimatedBudget, other.getEstimatedBudget())) && (this.explicitConversion == null && other.getExplicitConversion() == null || this.explicitConversion != null && Arrays.equals(this.explicitConversion, other.getExplicitConversion())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && Arrays.equals(this.externalId, other.getExternalId())) && (this.fax == null && other.getFax() == null || this.fax != null && Arrays.equals(this.fax, other.getFax())) && (this.faxTransactions == null && other.getFaxTransactions() == null || this.faxTransactions != null && Arrays.equals(this.faxTransactions, other.getFaxTransactions())) && (this.firstName == null && other.getFirstName() == null || this.firstName != null && Arrays.equals(this.firstName, other.getFirstName())) && (this.firstOrderDate == null && other.getFirstOrderDate() == null || this.firstOrderDate != null && Arrays.equals(this.firstOrderDate, other.getFirstOrderDate())) && (this.firstSaleDate == null && other.getFirstSaleDate() == null || this.firstSaleDate != null && Arrays.equals(this.firstSaleDate, other.getFirstSaleDate())) && (this.fxAccount == null && other.getFxAccount() == null || this.fxAccount != null && Arrays.equals(this.fxAccount, other.getFxAccount())) && (this.fxBalance == null && other.getFxBalance() == null || this.fxBalance != null && Arrays.equals(this.fxBalance, other.getFxBalance())) && (this.fxConsolBalance == null && other.getFxConsolBalance() == null || this.fxConsolBalance != null && Arrays.equals(this.fxConsolBalance, other.getFxConsolBalance())) && (this.fxConsolUnbilledOrders == null && other.getFxConsolUnbilledOrders() == null || this.fxConsolUnbilledOrders != null && Arrays.equals(this.fxConsolUnbilledOrders, other.getFxConsolUnbilledOrders())) && (this.fxUnbilledOrders == null && other.getFxUnbilledOrders() == null || this.fxUnbilledOrders != null && Arrays.equals(this.fxUnbilledOrders, other.getFxUnbilledOrders())) && (this.giveAccess == null && other.getGiveAccess() == null || this.giveAccess != null && Arrays.equals(this.giveAccess, other.getGiveAccess())) && (this.globalSubscriptionStatus == null && other.getGlobalSubscriptionStatus() == null || this.globalSubscriptionStatus != null && Arrays.equals(this.globalSubscriptionStatus, other.getGlobalSubscriptionStatus())) && (this.groupPricingLevel == null && other.getGroupPricingLevel() == null || this.groupPricingLevel != null && Arrays.equals(this.groupPricingLevel, other.getGroupPricingLevel())) && (this.hasDuplicates == null && other.getHasDuplicates() == null || this.hasDuplicates != null && Arrays.equals(this.hasDuplicates, other.getHasDuplicates())) && (this.homePhone == null && other.getHomePhone() == null || this.homePhone != null && Arrays.equals(this.homePhone, other.getHomePhone())) && (this.image == null && other.getImage() == null || this.image != null && Arrays.equals(this.image, other.getImage())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && Arrays.equals(this.internalId, other.getInternalId())) && (this.isBudgetApproved == null && other.getIsBudgetApproved() == null || this.isBudgetApproved != null && Arrays.equals(this.isBudgetApproved, other.getIsBudgetApproved())) && (this.isDefaultBilling == null && other.getIsDefaultBilling() == null || this.isDefaultBilling != null && Arrays.equals(this.isDefaultBilling, other.getIsDefaultBilling())) && (this.isDefaultShipping == null && other.getIsDefaultShipping() == null || this.isDefaultShipping != null && Arrays.equals(this.isDefaultShipping, other.getIsDefaultShipping())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && Arrays.equals(this.isInactive, other.getIsInactive())) && (this.isPerson == null && other.getIsPerson() == null || this.isPerson != null && Arrays.equals(this.isPerson, other.getIsPerson())) && (this.isShipAddress == null && other.getIsShipAddress() == null || this.isShipAddress != null && Arrays.equals(this.isShipAddress, other.getIsShipAddress())) && (this.itemPricingLevel == null && other.getItemPricingLevel() == null || this.itemPricingLevel != null && Arrays.equals(this.itemPricingLevel, other.getItemPricingLevel())) && (this.itemPricingUnitPrice == null && other.getItemPricingUnitPrice() == null || this.itemPricingUnitPrice != null && Arrays.equals(this.itemPricingUnitPrice, other.getItemPricingUnitPrice())) && (this.jobEndDate == null && other.getJobEndDate() == null || this.jobEndDate != null && Arrays.equals(this.jobEndDate, other.getJobEndDate())) && (this.jobProjectedEnd == null && other.getJobProjectedEnd() == null || this.jobProjectedEnd != null && Arrays.equals(this.jobProjectedEnd, other.getJobProjectedEnd())) && (this.jobStartDate == null && other.getJobStartDate() == null || this.jobStartDate != null && Arrays.equals(this.jobStartDate, other.getJobStartDate())) && (this.jobType == null && other.getJobType() == null || this.jobType != null && Arrays.equals(this.jobType, other.getJobType())) && (this.language == null && other.getLanguage() == null || this.language != null && Arrays.equals(this.language, other.getLanguage())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && Arrays.equals(this.lastModifiedDate, other.getLastModifiedDate())) && (this.lastName == null && other.getLastName() == null || this.lastName != null && Arrays.equals(this.lastName, other.getLastName())) && (this.lastOrderDate == null && other.getLastOrderDate() == null || this.lastOrderDate != null && Arrays.equals(this.lastOrderDate, other.getLastOrderDate())) && (this.lastSaleDate == null && other.getLastSaleDate() == null || this.lastSaleDate != null && Arrays.equals(this.lastSaleDate, other.getLastSaleDate())) && (this.leadDate == null && other.getLeadDate() == null || this.leadDate != null && Arrays.equals(this.leadDate, other.getLeadDate())) && (this.leadSource == null && other.getLeadSource() == null || this.leadSource != null && Arrays.equals(this.leadSource, other.getLeadSource())) && (this.level == null && other.getLevel() == null || this.level != null && Arrays.equals(this.level, other.getLevel())) && (this.manualCreditHold == null && other.getManualCreditHold() == null || this.manualCreditHold != null && Arrays.equals(this.manualCreditHold, other.getManualCreditHold())) && (this.middleName == null && other.getMiddleName() == null || this.middleName != null && Arrays.equals(this.middleName, other.getMiddleName())) && (this.mobilePhone == null && other.getMobilePhone() == null || this.mobilePhone != null && Arrays.equals(this.mobilePhone, other.getMobilePhone())) && (this.monthlyClosing == null && other.getMonthlyClosing() == null || this.monthlyClosing != null && Arrays.equals(this.monthlyClosing, other.getMonthlyClosing())) && (this.onCreditHold == null && other.getOnCreditHold() == null || this.onCreditHold != null && Arrays.equals(this.onCreditHold, other.getOnCreditHold())) && (this.overdueBalance == null && other.getOverdueBalance() == null || this.overdueBalance != null && Arrays.equals(this.overdueBalance, other.getOverdueBalance())) && (this.parent == null && other.getParent() == null || this.parent != null && Arrays.equals(this.parent, other.getParent())) && (this.partner == null && other.getPartner() == null || this.partner != null && Arrays.equals(this.partner, other.getPartner())) && (this.partnerContribution == null && other.getPartnerContribution() == null || this.partnerContribution != null && Arrays.equals(this.partnerContribution, other.getPartnerContribution())) && (this.partnerRole == null && other.getPartnerRole() == null || this.partnerRole != null && Arrays.equals(this.partnerRole, other.getPartnerRole())) && (this.partnerTeamMember == null && other.getPartnerTeamMember() == null || this.partnerTeamMember != null && Arrays.equals(this.partnerTeamMember, other.getPartnerTeamMember())) && (this.pec == null && other.getPec() == null || this.pec != null && Arrays.equals(this.pec, other.getPec())) && (this.permission == null && other.getPermission() == null || this.permission != null && Arrays.equals(this.permission, other.getPermission())) && (this.phone == null && other.getPhone() == null || this.phone != null && Arrays.equals(this.phone, other.getPhone())) && (this.phoneticName == null && other.getPhoneticName() == null || this.phoneticName != null && Arrays.equals(this.phoneticName, other.getPhoneticName())) && (this.prefCCProcessor == null && other.getPrefCCProcessor() == null || this.prefCCProcessor != null && Arrays.equals(this.prefCCProcessor, other.getPrefCCProcessor())) && (this.priceLevel == null && other.getPriceLevel() == null || this.priceLevel != null && Arrays.equals(this.priceLevel, other.getPriceLevel())) && (this.pricingGroup == null && other.getPricingGroup() == null || this.pricingGroup != null && Arrays.equals(this.pricingGroup, other.getPricingGroup())) && (this.pricingItem == null && other.getPricingItem() == null || this.pricingItem != null && Arrays.equals(this.pricingItem, other.getPricingItem())) && (this.printTransactions == null && other.getPrintTransactions() == null || this.printTransactions != null && Arrays.equals(this.printTransactions, other.getPrintTransactions())) && (this.prospectDate == null && other.getProspectDate() == null || this.prospectDate != null && Arrays.equals(this.prospectDate, other.getProspectDate())) && (this.receivablesAccount == null && other.getReceivablesAccount() == null || this.receivablesAccount != null && Arrays.equals(this.receivablesAccount, other.getReceivablesAccount())) && (this.reminderDays == null && other.getReminderDays() == null || this.reminderDays != null && Arrays.equals(this.reminderDays, other.getReminderDays())) && (this.resaleNumber == null && other.getResaleNumber() == null || this.resaleNumber != null && Arrays.equals(this.resaleNumber, other.getResaleNumber())) && (this.role == null && other.getRole() == null || this.role != null && Arrays.equals(this.role, other.getRole())) && (this.salesReadiness == null && other.getSalesReadiness() == null || this.salesReadiness != null && Arrays.equals(this.salesReadiness, other.getSalesReadiness())) && (this.salesRep == null && other.getSalesRep() == null || this.salesRep != null && Arrays.equals(this.salesRep, other.getSalesRep())) && (this.salesTeamMember == null && other.getSalesTeamMember() == null || this.salesTeamMember != null && Arrays.equals(this.salesTeamMember, other.getSalesTeamMember())) && (this.salesTeamRole == null && other.getSalesTeamRole() == null || this.salesTeamRole != null && Arrays.equals(this.salesTeamRole, other.getSalesTeamRole())) && (this.salutation == null && other.getSalutation() == null || this.salutation != null && Arrays.equals(this.salutation, other.getSalutation())) && (this.shipAddress == null && other.getShipAddress() == null || this.shipAddress != null && Arrays.equals(this.shipAddress, other.getShipAddress())) && (this.shipAddress1 == null && other.getShipAddress1() == null || this.shipAddress1 != null && Arrays.equals(this.shipAddress1, other.getShipAddress1())) && (this.shipAddress2 == null && other.getShipAddress2() == null || this.shipAddress2 != null && Arrays.equals(this.shipAddress2, other.getShipAddress2())) && (this.shipAddress3 == null && other.getShipAddress3() == null || this.shipAddress3 != null && Arrays.equals(this.shipAddress3, other.getShipAddress3())) && (this.shipAddressee == null && other.getShipAddressee() == null || this.shipAddressee != null && Arrays.equals(this.shipAddressee, other.getShipAddressee())) && (this.shipAttention == null && other.getShipAttention() == null || this.shipAttention != null && Arrays.equals(this.shipAttention, other.getShipAttention())) && (this.shipCity == null && other.getShipCity() == null || this.shipCity != null && Arrays.equals(this.shipCity, other.getShipCity())) && (this.shipComplete == null && other.getShipComplete() == null || this.shipComplete != null && Arrays.equals(this.shipComplete, other.getShipComplete())) && (this.shipCountry == null && other.getShipCountry() == null || this.shipCountry != null && Arrays.equals(this.shipCountry, other.getShipCountry())) && (this.shipCountryCode == null && other.getShipCountryCode() == null || this.shipCountryCode != null && Arrays.equals(this.shipCountryCode, other.getShipCountryCode())) && (this.shipPhone == null && other.getShipPhone() == null || this.shipPhone != null && Arrays.equals(this.shipPhone, other.getShipPhone())) && (this.shippingItem == null && other.getShippingItem() == null || this.shippingItem != null && Arrays.equals(this.shippingItem, other.getShippingItem())) && (this.shipState == null && other.getShipState() == null || this.shipState != null && Arrays.equals(this.shipState, other.getShipState())) && (this.shipZip == null && other.getShipZip() == null || this.shipZip != null && Arrays.equals(this.shipZip, other.getShipZip())) && (this.sourceSite == null && other.getSourceSite() == null || this.sourceSite != null && Arrays.equals(this.sourceSite, other.getSourceSite())) && (this.sourceSiteId == null && other.getSourceSiteId() == null || this.sourceSiteId != null && Arrays.equals(this.sourceSiteId, other.getSourceSiteId())) && (this.stage == null && other.getStage() == null || this.stage != null && Arrays.equals(this.stage, other.getStage())) && (this.startDate == null && other.getStartDate() == null || this.startDate != null && Arrays.equals(this.startDate, other.getStartDate())) && (this.state == null && other.getState() == null || this.state != null && Arrays.equals(this.state, other.getState())) && (this.subscription == null && other.getSubscription() == null || this.subscription != null && Arrays.equals(this.subscription, other.getSubscription())) && (this.subscriptionDate == null && other.getSubscriptionDate() == null || this.subscriptionDate != null && Arrays.equals(this.subscriptionDate, other.getSubscriptionDate())) && (this.subscriptionStatus == null && other.getSubscriptionStatus() == null || this.subscriptionStatus != null && Arrays.equals(this.subscriptionStatus, other.getSubscriptionStatus())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && Arrays.equals(this.subsidiary, other.getSubsidiary())) && (this.taxable == null && other.getTaxable() == null || this.taxable != null && Arrays.equals(this.taxable, other.getTaxable())) && (this.taxItem == null && other.getTaxItem() == null || this.taxItem != null && Arrays.equals(this.taxItem, other.getTaxItem())) && (this.terms == null && other.getTerms() == null || this.terms != null && Arrays.equals(this.terms, other.getTerms())) && (this.territory == null && other.getTerritory() == null || this.territory != null && Arrays.equals(this.territory, other.getTerritory())) && (this.title == null && other.getTitle() == null || this.title != null && Arrays.equals(this.title, other.getTitle())) && (this.unbilledOrders == null && other.getUnbilledOrders() == null || this.unbilledOrders != null && Arrays.equals(this.unbilledOrders, other.getUnbilledOrders())) && (this.url == null && other.getUrl() == null || this.url != null && Arrays.equals(this.url, other.getUrl())) && (this.vatRegNumber == null && other.getVatRegNumber() == null || this.vatRegNumber != null && Arrays.equals(this.vatRegNumber, other.getVatRegNumber())) && (this.webLead == null && other.getWebLead() == null || this.webLead != null && Arrays.equals(this.webLead, other.getWebLead())) && (this.zipCode == null && other.getZipCode() == null || this.zipCode != null && Arrays.equals(this.zipCode, other.getZipCode())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
        this.__equalsCalc = null;
        return _equals;
    }

    @Override
    public synchronized int hashCode() {
        Object obj;
        int i;
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (this.getAccountNumber() != null) {
            for (i = 0; i < Array.getLength(this.getAccountNumber()); ++i) {
                obj = Array.get(this.getAccountNumber(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAddress() != null) {
            for (i = 0; i < Array.getLength(this.getAddress()); ++i) {
                obj = Array.get(this.getAddress(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAddress1() != null) {
            for (i = 0; i < Array.getLength(this.getAddress1()); ++i) {
                obj = Array.get(this.getAddress1(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAddress2() != null) {
            for (i = 0; i < Array.getLength(this.getAddress2()); ++i) {
                obj = Array.get(this.getAddress2(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAddress3() != null) {
            for (i = 0; i < Array.getLength(this.getAddress3()); ++i) {
                obj = Array.get(this.getAddress3(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAddressee() != null) {
            for (i = 0; i < Array.getLength(this.getAddressee()); ++i) {
                obj = Array.get(this.getAddressee(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAddressInternalId() != null) {
            for (i = 0; i < Array.getLength(this.getAddressInternalId()); ++i) {
                obj = Array.get(this.getAddressInternalId(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAddressLabel() != null) {
            for (i = 0; i < Array.getLength(this.getAddressLabel()); ++i) {
                obj = Array.get(this.getAddressLabel(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAddressPhone() != null) {
            for (i = 0; i < Array.getLength(this.getAddressPhone()); ++i) {
                obj = Array.get(this.getAddressPhone(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAltContact() != null) {
            for (i = 0; i < Array.getLength(this.getAltContact()); ++i) {
                obj = Array.get(this.getAltContact(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAltEmail() != null) {
            for (i = 0; i < Array.getLength(this.getAltEmail()); ++i) {
                obj = Array.get(this.getAltEmail(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAltName() != null) {
            for (i = 0; i < Array.getLength(this.getAltName()); ++i) {
                obj = Array.get(this.getAltName(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAltPhone() != null) {
            for (i = 0; i < Array.getLength(this.getAltPhone()); ++i) {
                obj = Array.get(this.getAltPhone(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAssignedSite() != null) {
            for (i = 0; i < Array.getLength(this.getAssignedSite()); ++i) {
                obj = Array.get(this.getAssignedSite(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAssignedSiteId() != null) {
            for (i = 0; i < Array.getLength(this.getAssignedSiteId()); ++i) {
                obj = Array.get(this.getAssignedSiteId(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAttention() != null) {
            for (i = 0; i < Array.getLength(this.getAttention()); ++i) {
                obj = Array.get(this.getAttention(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAvailableOffline() != null) {
            for (i = 0; i < Array.getLength(this.getAvailableOffline()); ++i) {
                obj = Array.get(this.getAvailableOffline(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBalance() != null) {
            for (i = 0; i < Array.getLength(this.getBalance()); ++i) {
                obj = Array.get(this.getBalance(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBillAddress() != null) {
            for (i = 0; i < Array.getLength(this.getBillAddress()); ++i) {
                obj = Array.get(this.getBillAddress(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBillAddress1() != null) {
            for (i = 0; i < Array.getLength(this.getBillAddress1()); ++i) {
                obj = Array.get(this.getBillAddress1(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBillAddress2() != null) {
            for (i = 0; i < Array.getLength(this.getBillAddress2()); ++i) {
                obj = Array.get(this.getBillAddress2(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBillAddress3() != null) {
            for (i = 0; i < Array.getLength(this.getBillAddress3()); ++i) {
                obj = Array.get(this.getBillAddress3(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBillAddressee() != null) {
            for (i = 0; i < Array.getLength(this.getBillAddressee()); ++i) {
                obj = Array.get(this.getBillAddressee(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBillAttention() != null) {
            for (i = 0; i < Array.getLength(this.getBillAttention()); ++i) {
                obj = Array.get(this.getBillAttention(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBillCity() != null) {
            for (i = 0; i < Array.getLength(this.getBillCity()); ++i) {
                obj = Array.get(this.getBillCity(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBillCountry() != null) {
            for (i = 0; i < Array.getLength(this.getBillCountry()); ++i) {
                obj = Array.get(this.getBillCountry(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBillCountryCode() != null) {
            for (i = 0; i < Array.getLength(this.getBillCountryCode()); ++i) {
                obj = Array.get(this.getBillCountryCode(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBillPhone() != null) {
            for (i = 0; i < Array.getLength(this.getBillPhone()); ++i) {
                obj = Array.get(this.getBillPhone(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBillState() != null) {
            for (i = 0; i < Array.getLength(this.getBillState()); ++i) {
                obj = Array.get(this.getBillState(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBillZipCode() != null) {
            for (i = 0; i < Array.getLength(this.getBillZipCode()); ++i) {
                obj = Array.get(this.getBillZipCode(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBuyingReason() != null) {
            for (i = 0; i < Array.getLength(this.getBuyingReason()); ++i) {
                obj = Array.get(this.getBuyingReason(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBuyingTimeFrame() != null) {
            for (i = 0; i < Array.getLength(this.getBuyingTimeFrame()); ++i) {
                obj = Array.get(this.getBuyingTimeFrame(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCategory() != null) {
            for (i = 0; i < Array.getLength(this.getCategory()); ++i) {
                obj = Array.get(this.getCategory(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCcCustomerCode() != null) {
            for (i = 0; i < Array.getLength(this.getCcCustomerCode()); ++i) {
                obj = Array.get(this.getCcCustomerCode(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCcDefault() != null) {
            for (i = 0; i < Array.getLength(this.getCcDefault()); ++i) {
                obj = Array.get(this.getCcDefault(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCcExpDate() != null) {
            for (i = 0; i < Array.getLength(this.getCcExpDate()); ++i) {
                obj = Array.get(this.getCcExpDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCcHolderName() != null) {
            for (i = 0; i < Array.getLength(this.getCcHolderName()); ++i) {
                obj = Array.get(this.getCcHolderName(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCcInternalId() != null) {
            for (i = 0; i < Array.getLength(this.getCcInternalId()); ++i) {
                obj = Array.get(this.getCcInternalId(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCcNumber() != null) {
            for (i = 0; i < Array.getLength(this.getCcNumber()); ++i) {
                obj = Array.get(this.getCcNumber(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCcState() != null) {
            for (i = 0; i < Array.getLength(this.getCcState()); ++i) {
                obj = Array.get(this.getCcState(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCcStateFrom() != null) {
            for (i = 0; i < Array.getLength(this.getCcStateFrom()); ++i) {
                obj = Array.get(this.getCcStateFrom(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCcType() != null) {
            for (i = 0; i < Array.getLength(this.getCcType()); ++i) {
                obj = Array.get(this.getCcType(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCity() != null) {
            for (i = 0; i < Array.getLength(this.getCity()); ++i) {
                obj = Array.get(this.getCity(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getComments() != null) {
            for (i = 0; i < Array.getLength(this.getComments()); ++i) {
                obj = Array.get(this.getComments(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCompanyName() != null) {
            for (i = 0; i < Array.getLength(this.getCompanyName()); ++i) {
                obj = Array.get(this.getCompanyName(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getConsolBalance() != null) {
            for (i = 0; i < Array.getLength(this.getConsolBalance()); ++i) {
                obj = Array.get(this.getConsolBalance(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getConsolDaysOverdue() != null) {
            for (i = 0; i < Array.getLength(this.getConsolDaysOverdue()); ++i) {
                obj = Array.get(this.getConsolDaysOverdue(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getConsolDepositBalance() != null) {
            for (i = 0; i < Array.getLength(this.getConsolDepositBalance()); ++i) {
                obj = Array.get(this.getConsolDepositBalance(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getConsolOverdueBalance() != null) {
            for (i = 0; i < Array.getLength(this.getConsolOverdueBalance()); ++i) {
                obj = Array.get(this.getConsolOverdueBalance(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getConsolUnbilledOrders() != null) {
            for (i = 0; i < Array.getLength(this.getConsolUnbilledOrders()); ++i) {
                obj = Array.get(this.getConsolUnbilledOrders(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getContact() != null) {
            for (i = 0; i < Array.getLength(this.getContact()); ++i) {
                obj = Array.get(this.getContact(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getContribution() != null) {
            for (i = 0; i < Array.getLength(this.getContribution()); ++i) {
                obj = Array.get(this.getContribution(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getContributionPrimary() != null) {
            for (i = 0; i < Array.getLength(this.getContributionPrimary()); ++i) {
                obj = Array.get(this.getContributionPrimary(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getConversionDate() != null) {
            for (i = 0; i < Array.getLength(this.getConversionDate()); ++i) {
                obj = Array.get(this.getConversionDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCountry() != null) {
            for (i = 0; i < Array.getLength(this.getCountry()); ++i) {
                obj = Array.get(this.getCountry(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCountryCode() != null) {
            for (i = 0; i < Array.getLength(this.getCountryCode()); ++i) {
                obj = Array.get(this.getCountryCode(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCreditHold() != null) {
            for (i = 0; i < Array.getLength(this.getCreditHold()); ++i) {
                obj = Array.get(this.getCreditHold(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCreditHoldOverride() != null) {
            for (i = 0; i < Array.getLength(this.getCreditHoldOverride()); ++i) {
                obj = Array.get(this.getCreditHoldOverride(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCreditLimit() != null) {
            for (i = 0; i < Array.getLength(this.getCreditLimit()); ++i) {
                obj = Array.get(this.getCreditLimit(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCurrency() != null) {
            for (i = 0; i < Array.getLength(this.getCurrency()); ++i) {
                obj = Array.get(this.getCurrency(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDateClosed() != null) {
            for (i = 0; i < Array.getLength(this.getDateClosed()); ++i) {
                obj = Array.get(this.getDateClosed(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDateCreated() != null) {
            for (i = 0; i < Array.getLength(this.getDateCreated()); ++i) {
                obj = Array.get(this.getDateCreated(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDaysOverdue() != null) {
            for (i = 0; i < Array.getLength(this.getDaysOverdue()); ++i) {
                obj = Array.get(this.getDaysOverdue(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDefaultOrderPriority() != null) {
            for (i = 0; i < Array.getLength(this.getDefaultOrderPriority()); ++i) {
                obj = Array.get(this.getDefaultOrderPriority(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDefaultTaxReg() != null) {
            for (i = 0; i < Array.getLength(this.getDefaultTaxReg()); ++i) {
                obj = Array.get(this.getDefaultTaxReg(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDepositBalance() != null) {
            for (i = 0; i < Array.getLength(this.getDepositBalance()); ++i) {
                obj = Array.get(this.getDepositBalance(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDrAccount() != null) {
            for (i = 0; i < Array.getLength(this.getDrAccount()); ++i) {
                obj = Array.get(this.getDrAccount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getEmail() != null) {
            for (i = 0; i < Array.getLength(this.getEmail()); ++i) {
                obj = Array.get(this.getEmail(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getEmailPreference() != null) {
            for (i = 0; i < Array.getLength(this.getEmailPreference()); ++i) {
                obj = Array.get(this.getEmailPreference(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getEmailTransactions() != null) {
            for (i = 0; i < Array.getLength(this.getEmailTransactions()); ++i) {
                obj = Array.get(this.getEmailTransactions(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getEndDate() != null) {
            for (i = 0; i < Array.getLength(this.getEndDate()); ++i) {
                obj = Array.get(this.getEndDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getEntityId() != null) {
            for (i = 0; i < Array.getLength(this.getEntityId()); ++i) {
                obj = Array.get(this.getEntityId(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getEntityNumber() != null) {
            for (i = 0; i < Array.getLength(this.getEntityNumber()); ++i) {
                obj = Array.get(this.getEntityNumber(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getEntityStatus() != null) {
            for (i = 0; i < Array.getLength(this.getEntityStatus()); ++i) {
                obj = Array.get(this.getEntityStatus(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getEstimatedBudget() != null) {
            for (i = 0; i < Array.getLength(this.getEstimatedBudget()); ++i) {
                obj = Array.get(this.getEstimatedBudget(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getExplicitConversion() != null) {
            for (i = 0; i < Array.getLength(this.getExplicitConversion()); ++i) {
                obj = Array.get(this.getExplicitConversion(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getExternalId() != null) {
            for (i = 0; i < Array.getLength(this.getExternalId()); ++i) {
                obj = Array.get(this.getExternalId(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getFax() != null) {
            for (i = 0; i < Array.getLength(this.getFax()); ++i) {
                obj = Array.get(this.getFax(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getFaxTransactions() != null) {
            for (i = 0; i < Array.getLength(this.getFaxTransactions()); ++i) {
                obj = Array.get(this.getFaxTransactions(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getFirstName() != null) {
            for (i = 0; i < Array.getLength(this.getFirstName()); ++i) {
                obj = Array.get(this.getFirstName(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getFirstOrderDate() != null) {
            for (i = 0; i < Array.getLength(this.getFirstOrderDate()); ++i) {
                obj = Array.get(this.getFirstOrderDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getFirstSaleDate() != null) {
            for (i = 0; i < Array.getLength(this.getFirstSaleDate()); ++i) {
                obj = Array.get(this.getFirstSaleDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getFxAccount() != null) {
            for (i = 0; i < Array.getLength(this.getFxAccount()); ++i) {
                obj = Array.get(this.getFxAccount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getFxBalance() != null) {
            for (i = 0; i < Array.getLength(this.getFxBalance()); ++i) {
                obj = Array.get(this.getFxBalance(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getFxConsolBalance() != null) {
            for (i = 0; i < Array.getLength(this.getFxConsolBalance()); ++i) {
                obj = Array.get(this.getFxConsolBalance(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getFxConsolUnbilledOrders() != null) {
            for (i = 0; i < Array.getLength(this.getFxConsolUnbilledOrders()); ++i) {
                obj = Array.get(this.getFxConsolUnbilledOrders(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getFxUnbilledOrders() != null) {
            for (i = 0; i < Array.getLength(this.getFxUnbilledOrders()); ++i) {
                obj = Array.get(this.getFxUnbilledOrders(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getGiveAccess() != null) {
            for (i = 0; i < Array.getLength(this.getGiveAccess()); ++i) {
                obj = Array.get(this.getGiveAccess(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getGlobalSubscriptionStatus() != null) {
            for (i = 0; i < Array.getLength(this.getGlobalSubscriptionStatus()); ++i) {
                obj = Array.get(this.getGlobalSubscriptionStatus(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getGroupPricingLevel() != null) {
            for (i = 0; i < Array.getLength(this.getGroupPricingLevel()); ++i) {
                obj = Array.get(this.getGroupPricingLevel(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getHasDuplicates() != null) {
            for (i = 0; i < Array.getLength(this.getHasDuplicates()); ++i) {
                obj = Array.get(this.getHasDuplicates(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getHomePhone() != null) {
            for (i = 0; i < Array.getLength(this.getHomePhone()); ++i) {
                obj = Array.get(this.getHomePhone(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getImage() != null) {
            for (i = 0; i < Array.getLength(this.getImage()); ++i) {
                obj = Array.get(this.getImage(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getInternalId() != null) {
            for (i = 0; i < Array.getLength(this.getInternalId()); ++i) {
                obj = Array.get(this.getInternalId(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsBudgetApproved() != null) {
            for (i = 0; i < Array.getLength(this.getIsBudgetApproved()); ++i) {
                obj = Array.get(this.getIsBudgetApproved(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsDefaultBilling() != null) {
            for (i = 0; i < Array.getLength(this.getIsDefaultBilling()); ++i) {
                obj = Array.get(this.getIsDefaultBilling(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsDefaultShipping() != null) {
            for (i = 0; i < Array.getLength(this.getIsDefaultShipping()); ++i) {
                obj = Array.get(this.getIsDefaultShipping(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsInactive() != null) {
            for (i = 0; i < Array.getLength(this.getIsInactive()); ++i) {
                obj = Array.get(this.getIsInactive(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsPerson() != null) {
            for (i = 0; i < Array.getLength(this.getIsPerson()); ++i) {
                obj = Array.get(this.getIsPerson(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsShipAddress() != null) {
            for (i = 0; i < Array.getLength(this.getIsShipAddress()); ++i) {
                obj = Array.get(this.getIsShipAddress(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getItemPricingLevel() != null) {
            for (i = 0; i < Array.getLength(this.getItemPricingLevel()); ++i) {
                obj = Array.get(this.getItemPricingLevel(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getItemPricingUnitPrice() != null) {
            for (i = 0; i < Array.getLength(this.getItemPricingUnitPrice()); ++i) {
                obj = Array.get(this.getItemPricingUnitPrice(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getJobEndDate() != null) {
            for (i = 0; i < Array.getLength(this.getJobEndDate()); ++i) {
                obj = Array.get(this.getJobEndDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getJobProjectedEnd() != null) {
            for (i = 0; i < Array.getLength(this.getJobProjectedEnd()); ++i) {
                obj = Array.get(this.getJobProjectedEnd(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getJobStartDate() != null) {
            for (i = 0; i < Array.getLength(this.getJobStartDate()); ++i) {
                obj = Array.get(this.getJobStartDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getJobType() != null) {
            for (i = 0; i < Array.getLength(this.getJobType()); ++i) {
                obj = Array.get(this.getJobType(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLanguage() != null) {
            for (i = 0; i < Array.getLength(this.getLanguage()); ++i) {
                obj = Array.get(this.getLanguage(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLastModifiedDate() != null) {
            for (i = 0; i < Array.getLength(this.getLastModifiedDate()); ++i) {
                obj = Array.get(this.getLastModifiedDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLastName() != null) {
            for (i = 0; i < Array.getLength(this.getLastName()); ++i) {
                obj = Array.get(this.getLastName(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLastOrderDate() != null) {
            for (i = 0; i < Array.getLength(this.getLastOrderDate()); ++i) {
                obj = Array.get(this.getLastOrderDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLastSaleDate() != null) {
            for (i = 0; i < Array.getLength(this.getLastSaleDate()); ++i) {
                obj = Array.get(this.getLastSaleDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLeadDate() != null) {
            for (i = 0; i < Array.getLength(this.getLeadDate()); ++i) {
                obj = Array.get(this.getLeadDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLeadSource() != null) {
            for (i = 0; i < Array.getLength(this.getLeadSource()); ++i) {
                obj = Array.get(this.getLeadSource(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLevel() != null) {
            for (i = 0; i < Array.getLength(this.getLevel()); ++i) {
                obj = Array.get(this.getLevel(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getManualCreditHold() != null) {
            for (i = 0; i < Array.getLength(this.getManualCreditHold()); ++i) {
                obj = Array.get(this.getManualCreditHold(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getMiddleName() != null) {
            for (i = 0; i < Array.getLength(this.getMiddleName()); ++i) {
                obj = Array.get(this.getMiddleName(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getMobilePhone() != null) {
            for (i = 0; i < Array.getLength(this.getMobilePhone()); ++i) {
                obj = Array.get(this.getMobilePhone(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getMonthlyClosing() != null) {
            for (i = 0; i < Array.getLength(this.getMonthlyClosing()); ++i) {
                obj = Array.get(this.getMonthlyClosing(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getOnCreditHold() != null) {
            for (i = 0; i < Array.getLength(this.getOnCreditHold()); ++i) {
                obj = Array.get(this.getOnCreditHold(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getOverdueBalance() != null) {
            for (i = 0; i < Array.getLength(this.getOverdueBalance()); ++i) {
                obj = Array.get(this.getOverdueBalance(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getParent() != null) {
            for (i = 0; i < Array.getLength(this.getParent()); ++i) {
                obj = Array.get(this.getParent(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPartner() != null) {
            for (i = 0; i < Array.getLength(this.getPartner()); ++i) {
                obj = Array.get(this.getPartner(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPartnerContribution() != null) {
            for (i = 0; i < Array.getLength(this.getPartnerContribution()); ++i) {
                obj = Array.get(this.getPartnerContribution(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPartnerRole() != null) {
            for (i = 0; i < Array.getLength(this.getPartnerRole()); ++i) {
                obj = Array.get(this.getPartnerRole(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPartnerTeamMember() != null) {
            for (i = 0; i < Array.getLength(this.getPartnerTeamMember()); ++i) {
                obj = Array.get(this.getPartnerTeamMember(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPec() != null) {
            for (i = 0; i < Array.getLength(this.getPec()); ++i) {
                obj = Array.get(this.getPec(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPermission() != null) {
            for (i = 0; i < Array.getLength(this.getPermission()); ++i) {
                obj = Array.get(this.getPermission(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPhone() != null) {
            for (i = 0; i < Array.getLength(this.getPhone()); ++i) {
                obj = Array.get(this.getPhone(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPhoneticName() != null) {
            for (i = 0; i < Array.getLength(this.getPhoneticName()); ++i) {
                obj = Array.get(this.getPhoneticName(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPrefCCProcessor() != null) {
            for (i = 0; i < Array.getLength(this.getPrefCCProcessor()); ++i) {
                obj = Array.get(this.getPrefCCProcessor(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPriceLevel() != null) {
            for (i = 0; i < Array.getLength(this.getPriceLevel()); ++i) {
                obj = Array.get(this.getPriceLevel(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPricingGroup() != null) {
            for (i = 0; i < Array.getLength(this.getPricingGroup()); ++i) {
                obj = Array.get(this.getPricingGroup(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPricingItem() != null) {
            for (i = 0; i < Array.getLength(this.getPricingItem()); ++i) {
                obj = Array.get(this.getPricingItem(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPrintTransactions() != null) {
            for (i = 0; i < Array.getLength(this.getPrintTransactions()); ++i) {
                obj = Array.get(this.getPrintTransactions(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getProspectDate() != null) {
            for (i = 0; i < Array.getLength(this.getProspectDate()); ++i) {
                obj = Array.get(this.getProspectDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getReceivablesAccount() != null) {
            for (i = 0; i < Array.getLength(this.getReceivablesAccount()); ++i) {
                obj = Array.get(this.getReceivablesAccount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getReminderDays() != null) {
            for (i = 0; i < Array.getLength(this.getReminderDays()); ++i) {
                obj = Array.get(this.getReminderDays(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getResaleNumber() != null) {
            for (i = 0; i < Array.getLength(this.getResaleNumber()); ++i) {
                obj = Array.get(this.getResaleNumber(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRole() != null) {
            for (i = 0; i < Array.getLength(this.getRole()); ++i) {
                obj = Array.get(this.getRole(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSalesReadiness() != null) {
            for (i = 0; i < Array.getLength(this.getSalesReadiness()); ++i) {
                obj = Array.get(this.getSalesReadiness(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSalesRep() != null) {
            for (i = 0; i < Array.getLength(this.getSalesRep()); ++i) {
                obj = Array.get(this.getSalesRep(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSalesTeamMember() != null) {
            for (i = 0; i < Array.getLength(this.getSalesTeamMember()); ++i) {
                obj = Array.get(this.getSalesTeamMember(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSalesTeamRole() != null) {
            for (i = 0; i < Array.getLength(this.getSalesTeamRole()); ++i) {
                obj = Array.get(this.getSalesTeamRole(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSalutation() != null) {
            for (i = 0; i < Array.getLength(this.getSalutation()); ++i) {
                obj = Array.get(this.getSalutation(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getShipAddress() != null) {
            for (i = 0; i < Array.getLength(this.getShipAddress()); ++i) {
                obj = Array.get(this.getShipAddress(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getShipAddress1() != null) {
            for (i = 0; i < Array.getLength(this.getShipAddress1()); ++i) {
                obj = Array.get(this.getShipAddress1(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getShipAddress2() != null) {
            for (i = 0; i < Array.getLength(this.getShipAddress2()); ++i) {
                obj = Array.get(this.getShipAddress2(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getShipAddress3() != null) {
            for (i = 0; i < Array.getLength(this.getShipAddress3()); ++i) {
                obj = Array.get(this.getShipAddress3(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getShipAddressee() != null) {
            for (i = 0; i < Array.getLength(this.getShipAddressee()); ++i) {
                obj = Array.get(this.getShipAddressee(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getShipAttention() != null) {
            for (i = 0; i < Array.getLength(this.getShipAttention()); ++i) {
                obj = Array.get(this.getShipAttention(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getShipCity() != null) {
            for (i = 0; i < Array.getLength(this.getShipCity()); ++i) {
                obj = Array.get(this.getShipCity(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getShipComplete() != null) {
            for (i = 0; i < Array.getLength(this.getShipComplete()); ++i) {
                obj = Array.get(this.getShipComplete(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getShipCountry() != null) {
            for (i = 0; i < Array.getLength(this.getShipCountry()); ++i) {
                obj = Array.get(this.getShipCountry(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getShipCountryCode() != null) {
            for (i = 0; i < Array.getLength(this.getShipCountryCode()); ++i) {
                obj = Array.get(this.getShipCountryCode(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getShipPhone() != null) {
            for (i = 0; i < Array.getLength(this.getShipPhone()); ++i) {
                obj = Array.get(this.getShipPhone(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getShippingItem() != null) {
            for (i = 0; i < Array.getLength(this.getShippingItem()); ++i) {
                obj = Array.get(this.getShippingItem(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getShipState() != null) {
            for (i = 0; i < Array.getLength(this.getShipState()); ++i) {
                obj = Array.get(this.getShipState(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getShipZip() != null) {
            for (i = 0; i < Array.getLength(this.getShipZip()); ++i) {
                obj = Array.get(this.getShipZip(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSourceSite() != null) {
            for (i = 0; i < Array.getLength(this.getSourceSite()); ++i) {
                obj = Array.get(this.getSourceSite(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSourceSiteId() != null) {
            for (i = 0; i < Array.getLength(this.getSourceSiteId()); ++i) {
                obj = Array.get(this.getSourceSiteId(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getStage() != null) {
            for (i = 0; i < Array.getLength(this.getStage()); ++i) {
                obj = Array.get(this.getStage(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getStartDate() != null) {
            for (i = 0; i < Array.getLength(this.getStartDate()); ++i) {
                obj = Array.get(this.getStartDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getState() != null) {
            for (i = 0; i < Array.getLength(this.getState()); ++i) {
                obj = Array.get(this.getState(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSubscription() != null) {
            for (i = 0; i < Array.getLength(this.getSubscription()); ++i) {
                obj = Array.get(this.getSubscription(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSubscriptionDate() != null) {
            for (i = 0; i < Array.getLength(this.getSubscriptionDate()); ++i) {
                obj = Array.get(this.getSubscriptionDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSubscriptionStatus() != null) {
            for (i = 0; i < Array.getLength(this.getSubscriptionStatus()); ++i) {
                obj = Array.get(this.getSubscriptionStatus(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSubsidiary() != null) {
            for (i = 0; i < Array.getLength(this.getSubsidiary()); ++i) {
                obj = Array.get(this.getSubsidiary(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTaxable() != null) {
            for (i = 0; i < Array.getLength(this.getTaxable()); ++i) {
                obj = Array.get(this.getTaxable(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTaxItem() != null) {
            for (i = 0; i < Array.getLength(this.getTaxItem()); ++i) {
                obj = Array.get(this.getTaxItem(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTerms() != null) {
            for (i = 0; i < Array.getLength(this.getTerms()); ++i) {
                obj = Array.get(this.getTerms(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTerritory() != null) {
            for (i = 0; i < Array.getLength(this.getTerritory()); ++i) {
                obj = Array.get(this.getTerritory(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTitle() != null) {
            for (i = 0; i < Array.getLength(this.getTitle()); ++i) {
                obj = Array.get(this.getTitle(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getUnbilledOrders() != null) {
            for (i = 0; i < Array.getLength(this.getUnbilledOrders()); ++i) {
                obj = Array.get(this.getUnbilledOrders(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getUrl() != null) {
            for (i = 0; i < Array.getLength(this.getUrl()); ++i) {
                obj = Array.get(this.getUrl(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getVatRegNumber() != null) {
            for (i = 0; i < Array.getLength(this.getVatRegNumber()); ++i) {
                obj = Array.get(this.getVatRegNumber(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getWebLead() != null) {
            for (i = 0; i < Array.getLength(this.getWebLead()); ++i) {
                obj = Array.get(this.getWebLead(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getZipCode() != null) {
            for (i = 0; i < Array.getLength(this.getZipCode()); ++i) {
                obj = Array.get(this.getZipCode(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "OriginatingLeadSearchRowBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "accountNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "address"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("address1");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "address1"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("address2");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "address2"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("address3");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "address3"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("addressee");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "addressee"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("addressInternalId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "addressInternalId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("addressLabel");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "addressLabel"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("addressPhone");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "addressPhone"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("altContact");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "altContact"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("altEmail");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "altEmail"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("altName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "altName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("altPhone");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "altPhone"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("assignedSite");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "assignedSite"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("assignedSiteId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "assignedSiteId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("attention");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "attention"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("availableOffline");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "availableOffline"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "balance"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billAddress");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billAddress"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billAddress1");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billAddress1"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billAddress2");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billAddress2"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billAddress3");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billAddress3"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billAddressee");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billAddressee"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billAttention");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billAttention"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billCity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billCity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billCountry");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billCountry"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billCountryCode");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billCountryCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billPhone");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billPhone"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billState");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billState"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billZipCode");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billZipCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("buyingReason");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "buyingReason"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("buyingTimeFrame");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "buyingTimeFrame"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "category"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ccCustomerCode");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ccCustomerCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ccDefault");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ccDefault"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ccExpDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ccExpDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ccHolderName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ccHolderName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ccInternalId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ccInternalId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ccNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ccNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ccState");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ccState"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ccStateFrom");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ccStateFrom"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ccType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ccType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "city"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "comments"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("companyName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "companyName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("consolBalance");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "consolBalance"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("consolDaysOverdue");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "consolDaysOverdue"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("consolDepositBalance");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "consolDepositBalance"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("consolOverdueBalance");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "consolOverdueBalance"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("consolUnbilledOrders");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "consolUnbilledOrders"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("contact");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "contact"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("contribution");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "contribution"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("contributionPrimary");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "contributionPrimary"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("conversionDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "conversionDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "country"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("countryCode");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "countryCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("creditHold");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "creditHold"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("creditHoldOverride");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "creditHoldOverride"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("creditLimit");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "creditLimit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("dateClosed");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "dateClosed"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("dateCreated");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "dateCreated"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("daysOverdue");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "daysOverdue"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("defaultOrderPriority");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "defaultOrderPriority"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("defaultTaxReg");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "defaultTaxReg"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("depositBalance");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "depositBalance"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("drAccount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "drAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "email"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("emailPreference");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "emailPreference"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("emailTransactions");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "emailTransactions"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "endDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("entityId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "entityId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("entityNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "entityNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("entityStatus");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "entityStatus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("estimatedBudget");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "estimatedBudget"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("explicitConversion");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "explicitConversion"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "externalId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fax");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fax"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("faxTransactions");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "faxTransactions"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "firstName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("firstOrderDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "firstOrderDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("firstSaleDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "firstSaleDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fxAccount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fxAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fxBalance");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fxBalance"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fxConsolBalance");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fxConsolBalance"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fxConsolUnbilledOrders");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fxConsolUnbilledOrders"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fxUnbilledOrders");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fxUnbilledOrders"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("giveAccess");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "giveAccess"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("globalSubscriptionStatus");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "globalSubscriptionStatus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("groupPricingLevel");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "groupPricingLevel"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("hasDuplicates");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "hasDuplicates"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("homePhone");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "homePhone"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("image");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "image"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isBudgetApproved");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isBudgetApproved"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isDefaultBilling");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isDefaultBilling"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isDefaultShipping");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isDefaultShipping"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isPerson");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isPerson"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isShipAddress");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isShipAddress"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemPricingLevel");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "itemPricingLevel"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemPricingUnitPrice");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "itemPricingUnitPrice"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("jobEndDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "jobEndDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("jobProjectedEnd");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "jobProjectedEnd"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("jobStartDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "jobStartDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("jobType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "jobType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "language"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lastName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastOrderDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lastOrderDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastSaleDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lastSaleDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("leadDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "leadDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("leadSource");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "leadSource"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("level");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "level"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("manualCreditHold");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "manualCreditHold"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("middleName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "middleName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("mobilePhone");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "mobilePhone"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("monthlyClosing");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "monthlyClosing"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("onCreditHold");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "onCreditHold"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("overdueBalance");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "overdueBalance"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "parent"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("partner");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "partner"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("partnerContribution");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "partnerContribution"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("partnerRole");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "partnerRole"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("partnerTeamMember");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "partnerTeamMember"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("pec");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "pec"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("permission");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "permission"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "phone"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("phoneticName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "phoneticName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("prefCCProcessor");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "prefCCProcessor"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("priceLevel");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "priceLevel"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("pricingGroup");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "pricingGroup"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("pricingItem");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "pricingItem"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("printTransactions");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "printTransactions"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("prospectDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "prospectDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("receivablesAccount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "receivablesAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("reminderDays");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "reminderDays"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("resaleNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "resaleNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("role");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "role"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("salesReadiness");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "salesReadiness"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("salesRep");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "salesRep"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("salesTeamMember");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "salesTeamMember"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("salesTeamRole");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "salesTeamRole"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("salutation");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "salutation"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipAddress");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipAddress"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipAddress1");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipAddress1"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipAddress2");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipAddress2"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipAddress3");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipAddress3"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipAddressee");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipAddressee"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipAttention");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipAttention"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipCity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipCity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipComplete");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipComplete"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipCountry");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipCountry"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipCountryCode");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipCountryCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipPhone");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipPhone"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shippingItem");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shippingItem"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipState");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipState"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipZip");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipZip"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("sourceSite");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "sourceSite"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("sourceSiteId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "sourceSiteId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("stage");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "stage"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "state"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subscription");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "subscription"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subscriptionDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "subscriptionDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subscriptionStatus");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "subscriptionStatus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxable");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "taxable"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxItem");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "taxItem"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("terms");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "terms"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("territory");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "territory"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "title"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("unbilledOrders");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "unbilledOrders"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "url"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vatRegNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "vatRegNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("webLead");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "webLead"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("zipCode");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "zipCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnCustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

