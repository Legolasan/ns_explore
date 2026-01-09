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

public class CustomerSearchBasic
extends SearchRecordBasic
implements Serializable {
    private SearchStringField accountNumber;
    private SearchStringField address;
    private SearchStringField addressee;
    private SearchStringField addressLabel;
    private SearchStringField addressPhone;
    private SearchMultiSelectField assignedSite;
    private SearchMultiSelectField assignedSiteId;
    private SearchStringField attention;
    private SearchBooleanField availableOffline;
    private SearchDoubleField balance;
    private SearchStringField billAddress;
    private SearchDoubleField boughtAmount;
    private SearchDateField boughtDate;
    private SearchMultiSelectField buyingReason;
    private SearchMultiSelectField buyingTimeFrame;
    private SearchMultiSelectField category;
    private SearchStringField ccCustomerCode;
    private SearchBooleanField ccDefault;
    private SearchDateField ccExpDate;
    private SearchStringField ccHolderName;
    private SearchStringField ccNumber;
    private SearchMultiSelectField ccState;
    private SearchDateField ccStateFrom;
    private SearchMultiSelectField ccType;
    private SearchStringField city;
    private SearchMultiSelectField classBought;
    private SearchStringField comments;
    private SearchStringField companyName;
    private SearchDoubleField consolBalance;
    private SearchLongField consolDaysOverdue;
    private SearchDoubleField consolDepositBalance;
    private SearchDoubleField consolOverdueBalance;
    private SearchDoubleField consolUnbilledOrders;
    private SearchStringField contact;
    private SearchLongField contribution;
    private SearchDateField conversionDate;
    private SearchEnumMultiSelectField country;
    private SearchStringField county;
    private SearchEnumMultiSelectField creditHold;
    private SearchBooleanField creditHoldOverride;
    private SearchDoubleField creditLimit;
    private SearchMultiSelectField currency;
    private SearchMultiSelectField custStage;
    private SearchMultiSelectField custStatus;
    private SearchDateField dateClosed;
    private SearchDateField dateCreated;
    private SearchLongField daysOverdue;
    private SearchMultiSelectField defaultAllocationStrategy;
    private SearchDoubleField defaultOrderPriority;
    private SearchMultiSelectField defaultTaxReg;
    private SearchStringField defaultTaxRegText;
    private SearchDoubleField depositBalance;
    private SearchMultiSelectField deptBought;
    private SearchMultiSelectField drAccount;
    private SearchStringField email;
    private SearchEnumMultiSelectField emailPreference;
    private SearchBooleanField emailTransactions;
    private SearchDateField endDate;
    private SearchStringField entityId;
    private SearchMultiSelectField entityStatus;
    private SearchDoubleField estimatedBudget;
    private SearchBooleanField explicitConversion;
    private SearchMultiSelectField externalId;
    private SearchStringField externalIdString;
    private SearchStringField fax;
    private SearchBooleanField faxTransactions;
    private SearchStringField firstName;
    private SearchDateField firstOrderDate;
    private SearchDateField firstSaleDate;
    private SearchMultiSelectField fxAccount;
    private SearchDoubleField fxBalance;
    private SearchDoubleField fxConsolBalance;
    private SearchDoubleField fxConsolUnbilledOrders;
    private SearchDoubleField fxUnbilledOrders;
    private SearchBooleanField giveAccess;
    private SearchEnumMultiSelectField globalSubscriptionStatus;
    private SearchMultiSelectField group;
    private SearchMultiSelectField groupPricingLevel;
    private SearchBooleanField hasDuplicates;
    private SearchStringField image;
    private SearchMultiSelectField internalId;
    private SearchLongField internalIdNumber;
    private SearchBooleanField isBudgetApproved;
    private SearchBooleanField isDefaultBilling;
    private SearchBooleanField isDefaultShipping;
    private SearchBooleanField isInactive;
    private SearchBooleanField isPerson;
    private SearchBooleanField isReportedLead;
    private SearchBooleanField isShipAddress;
    private SearchMultiSelectField itemPricingLevel;
    private SearchDoubleField itemPricingUnitPrice;
    private SearchMultiSelectField itemsBought;
    private SearchMultiSelectField itemsOrdered;
    private SearchEnumMultiSelectField language;
    private SearchDateField lastModifiedDate;
    private SearchStringField lastName;
    private SearchDateField lastOrderDate;
    private SearchDateField lastSaleDate;
    private SearchDateField leadDate;
    private SearchMultiSelectField leadSource;
    private SearchEnumMultiSelectField level;
    private SearchMultiSelectField locationBought;
    private SearchBooleanField manualCreditHold;
    private SearchMultiSelectField merchantAccount;
    private SearchStringField middleName;
    private SearchEnumMultiSelectField monthlyClosing;
    private SearchBooleanField onCreditHold;
    private SearchDoubleField orderedAmount;
    private SearchDateField orderedDate;
    private SearchEnumMultiSelectField otherRelationships;
    private SearchDoubleField overdueBalance;
    private SearchMultiSelectField parent;
    private SearchMultiSelectField parentItemsBought;
    private SearchMultiSelectField parentItemsOrdered;
    private SearchMultiSelectField partner;
    private SearchLongField partnerContribution;
    private SearchMultiSelectField partnerRole;
    private SearchMultiSelectField partnerTeamMember;
    private SearchStringField pec;
    private SearchEnumMultiSelectField permission;
    private SearchStringField phone;
    private SearchStringField phoneticName;
    private SearchMultiSelectField priceLevel;
    private SearchMultiSelectField pricingGroup;
    private SearchMultiSelectField pricingItem;
    private SearchBooleanField printTransactions;
    private SearchDateField prospectDate;
    private SearchBooleanField pstExempt;
    private SearchMultiSelectField receivablesAccount;
    private SearchDateField reminderDate;
    private SearchStringField resaleNumber;
    private SearchMultiSelectField role;
    private SearchMultiSelectField salesReadiness;
    private SearchMultiSelectField salesRep;
    private SearchMultiSelectField salesTeamMember;
    private SearchMultiSelectField salesTeamRole;
    private SearchStringField salutation;
    private SearchStringField shipAddress;
    private SearchBooleanField shipComplete;
    private SearchMultiSelectField shippingItem;
    private SearchMultiSelectField sourceSite;
    private SearchMultiSelectField sourceSiteId;
    private SearchEnumMultiSelectField stage;
    private SearchDateField startDate;
    private SearchStringField state;
    private SearchMultiSelectField subsidBought;
    private SearchMultiSelectField subsidiary;
    private SearchBooleanField taxable;
    private SearchMultiSelectField terms;
    private SearchMultiSelectField territory;
    private SearchStringField title;
    private SearchDoubleField unbilledOrders;
    private SearchStringField url;
    private SearchStringField vatRegNumber;
    private SearchBooleanField webLead;
    private SearchStringField zipCode;
    private SearchCustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(CustomerSearchBasic.class, true);

    public CustomerSearchBasic() {
    }

    public CustomerSearchBasic(SearchStringField accountNumber, SearchStringField address, SearchStringField addressee, SearchStringField addressLabel, SearchStringField addressPhone, SearchMultiSelectField assignedSite, SearchMultiSelectField assignedSiteId, SearchStringField attention, SearchBooleanField availableOffline, SearchDoubleField balance, SearchStringField billAddress, SearchDoubleField boughtAmount, SearchDateField boughtDate, SearchMultiSelectField buyingReason, SearchMultiSelectField buyingTimeFrame, SearchMultiSelectField category, SearchStringField ccCustomerCode, SearchBooleanField ccDefault, SearchDateField ccExpDate, SearchStringField ccHolderName, SearchStringField ccNumber, SearchMultiSelectField ccState, SearchDateField ccStateFrom, SearchMultiSelectField ccType, SearchStringField city, SearchMultiSelectField classBought, SearchStringField comments, SearchStringField companyName, SearchDoubleField consolBalance, SearchLongField consolDaysOverdue, SearchDoubleField consolDepositBalance, SearchDoubleField consolOverdueBalance, SearchDoubleField consolUnbilledOrders, SearchStringField contact, SearchLongField contribution, SearchDateField conversionDate, SearchEnumMultiSelectField country, SearchStringField county, SearchEnumMultiSelectField creditHold, SearchBooleanField creditHoldOverride, SearchDoubleField creditLimit, SearchMultiSelectField currency, SearchMultiSelectField custStage, SearchMultiSelectField custStatus, SearchDateField dateClosed, SearchDateField dateCreated, SearchLongField daysOverdue, SearchMultiSelectField defaultAllocationStrategy, SearchDoubleField defaultOrderPriority, SearchMultiSelectField defaultTaxReg, SearchStringField defaultTaxRegText, SearchDoubleField depositBalance, SearchMultiSelectField deptBought, SearchMultiSelectField drAccount, SearchStringField email, SearchEnumMultiSelectField emailPreference, SearchBooleanField emailTransactions, SearchDateField endDate, SearchStringField entityId, SearchMultiSelectField entityStatus, SearchDoubleField estimatedBudget, SearchBooleanField explicitConversion, SearchMultiSelectField externalId, SearchStringField externalIdString, SearchStringField fax, SearchBooleanField faxTransactions, SearchStringField firstName, SearchDateField firstOrderDate, SearchDateField firstSaleDate, SearchMultiSelectField fxAccount, SearchDoubleField fxBalance, SearchDoubleField fxConsolBalance, SearchDoubleField fxConsolUnbilledOrders, SearchDoubleField fxUnbilledOrders, SearchBooleanField giveAccess, SearchEnumMultiSelectField globalSubscriptionStatus, SearchMultiSelectField group, SearchMultiSelectField groupPricingLevel, SearchBooleanField hasDuplicates, SearchStringField image, SearchMultiSelectField internalId, SearchLongField internalIdNumber, SearchBooleanField isBudgetApproved, SearchBooleanField isDefaultBilling, SearchBooleanField isDefaultShipping, SearchBooleanField isInactive, SearchBooleanField isPerson, SearchBooleanField isReportedLead, SearchBooleanField isShipAddress, SearchMultiSelectField itemPricingLevel, SearchDoubleField itemPricingUnitPrice, SearchMultiSelectField itemsBought, SearchMultiSelectField itemsOrdered, SearchEnumMultiSelectField language, SearchDateField lastModifiedDate, SearchStringField lastName, SearchDateField lastOrderDate, SearchDateField lastSaleDate, SearchDateField leadDate, SearchMultiSelectField leadSource, SearchEnumMultiSelectField level, SearchMultiSelectField locationBought, SearchBooleanField manualCreditHold, SearchMultiSelectField merchantAccount, SearchStringField middleName, SearchEnumMultiSelectField monthlyClosing, SearchBooleanField onCreditHold, SearchDoubleField orderedAmount, SearchDateField orderedDate, SearchEnumMultiSelectField otherRelationships, SearchDoubleField overdueBalance, SearchMultiSelectField parent, SearchMultiSelectField parentItemsBought, SearchMultiSelectField parentItemsOrdered, SearchMultiSelectField partner, SearchLongField partnerContribution, SearchMultiSelectField partnerRole, SearchMultiSelectField partnerTeamMember, SearchStringField pec, SearchEnumMultiSelectField permission, SearchStringField phone, SearchStringField phoneticName, SearchMultiSelectField priceLevel, SearchMultiSelectField pricingGroup, SearchMultiSelectField pricingItem, SearchBooleanField printTransactions, SearchDateField prospectDate, SearchBooleanField pstExempt, SearchMultiSelectField receivablesAccount, SearchDateField reminderDate, SearchStringField resaleNumber, SearchMultiSelectField role, SearchMultiSelectField salesReadiness, SearchMultiSelectField salesRep, SearchMultiSelectField salesTeamMember, SearchMultiSelectField salesTeamRole, SearchStringField salutation, SearchStringField shipAddress, SearchBooleanField shipComplete, SearchMultiSelectField shippingItem, SearchMultiSelectField sourceSite, SearchMultiSelectField sourceSiteId, SearchEnumMultiSelectField stage, SearchDateField startDate, SearchStringField state, SearchMultiSelectField subsidBought, SearchMultiSelectField subsidiary, SearchBooleanField taxable, SearchMultiSelectField terms, SearchMultiSelectField territory, SearchStringField title, SearchDoubleField unbilledOrders, SearchStringField url, SearchStringField vatRegNumber, SearchBooleanField webLead, SearchStringField zipCode, SearchCustomFieldList customFieldList) {
        this.accountNumber = accountNumber;
        this.address = address;
        this.addressee = addressee;
        this.addressLabel = addressLabel;
        this.addressPhone = addressPhone;
        this.assignedSite = assignedSite;
        this.assignedSiteId = assignedSiteId;
        this.attention = attention;
        this.availableOffline = availableOffline;
        this.balance = balance;
        this.billAddress = billAddress;
        this.boughtAmount = boughtAmount;
        this.boughtDate = boughtDate;
        this.buyingReason = buyingReason;
        this.buyingTimeFrame = buyingTimeFrame;
        this.category = category;
        this.ccCustomerCode = ccCustomerCode;
        this.ccDefault = ccDefault;
        this.ccExpDate = ccExpDate;
        this.ccHolderName = ccHolderName;
        this.ccNumber = ccNumber;
        this.ccState = ccState;
        this.ccStateFrom = ccStateFrom;
        this.ccType = ccType;
        this.city = city;
        this.classBought = classBought;
        this.comments = comments;
        this.companyName = companyName;
        this.consolBalance = consolBalance;
        this.consolDaysOverdue = consolDaysOverdue;
        this.consolDepositBalance = consolDepositBalance;
        this.consolOverdueBalance = consolOverdueBalance;
        this.consolUnbilledOrders = consolUnbilledOrders;
        this.contact = contact;
        this.contribution = contribution;
        this.conversionDate = conversionDate;
        this.country = country;
        this.county = county;
        this.creditHold = creditHold;
        this.creditHoldOverride = creditHoldOverride;
        this.creditLimit = creditLimit;
        this.currency = currency;
        this.custStage = custStage;
        this.custStatus = custStatus;
        this.dateClosed = dateClosed;
        this.dateCreated = dateCreated;
        this.daysOverdue = daysOverdue;
        this.defaultAllocationStrategy = defaultAllocationStrategy;
        this.defaultOrderPriority = defaultOrderPriority;
        this.defaultTaxReg = defaultTaxReg;
        this.defaultTaxRegText = defaultTaxRegText;
        this.depositBalance = depositBalance;
        this.deptBought = deptBought;
        this.drAccount = drAccount;
        this.email = email;
        this.emailPreference = emailPreference;
        this.emailTransactions = emailTransactions;
        this.endDate = endDate;
        this.entityId = entityId;
        this.entityStatus = entityStatus;
        this.estimatedBudget = estimatedBudget;
        this.explicitConversion = explicitConversion;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
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
        this.group = group;
        this.groupPricingLevel = groupPricingLevel;
        this.hasDuplicates = hasDuplicates;
        this.image = image;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isBudgetApproved = isBudgetApproved;
        this.isDefaultBilling = isDefaultBilling;
        this.isDefaultShipping = isDefaultShipping;
        this.isInactive = isInactive;
        this.isPerson = isPerson;
        this.isReportedLead = isReportedLead;
        this.isShipAddress = isShipAddress;
        this.itemPricingLevel = itemPricingLevel;
        this.itemPricingUnitPrice = itemPricingUnitPrice;
        this.itemsBought = itemsBought;
        this.itemsOrdered = itemsOrdered;
        this.language = language;
        this.lastModifiedDate = lastModifiedDate;
        this.lastName = lastName;
        this.lastOrderDate = lastOrderDate;
        this.lastSaleDate = lastSaleDate;
        this.leadDate = leadDate;
        this.leadSource = leadSource;
        this.level = level;
        this.locationBought = locationBought;
        this.manualCreditHold = manualCreditHold;
        this.merchantAccount = merchantAccount;
        this.middleName = middleName;
        this.monthlyClosing = monthlyClosing;
        this.onCreditHold = onCreditHold;
        this.orderedAmount = orderedAmount;
        this.orderedDate = orderedDate;
        this.otherRelationships = otherRelationships;
        this.overdueBalance = overdueBalance;
        this.parent = parent;
        this.parentItemsBought = parentItemsBought;
        this.parentItemsOrdered = parentItemsOrdered;
        this.partner = partner;
        this.partnerContribution = partnerContribution;
        this.partnerRole = partnerRole;
        this.partnerTeamMember = partnerTeamMember;
        this.pec = pec;
        this.permission = permission;
        this.phone = phone;
        this.phoneticName = phoneticName;
        this.priceLevel = priceLevel;
        this.pricingGroup = pricingGroup;
        this.pricingItem = pricingItem;
        this.printTransactions = printTransactions;
        this.prospectDate = prospectDate;
        this.pstExempt = pstExempt;
        this.receivablesAccount = receivablesAccount;
        this.reminderDate = reminderDate;
        this.resaleNumber = resaleNumber;
        this.role = role;
        this.salesReadiness = salesReadiness;
        this.salesRep = salesRep;
        this.salesTeamMember = salesTeamMember;
        this.salesTeamRole = salesTeamRole;
        this.salutation = salutation;
        this.shipAddress = shipAddress;
        this.shipComplete = shipComplete;
        this.shippingItem = shippingItem;
        this.sourceSite = sourceSite;
        this.sourceSiteId = sourceSiteId;
        this.stage = stage;
        this.startDate = startDate;
        this.state = state;
        this.subsidBought = subsidBought;
        this.subsidiary = subsidiary;
        this.taxable = taxable;
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

    public SearchMultiSelectField getAssignedSite() {
        return this.assignedSite;
    }

    public void setAssignedSite(SearchMultiSelectField assignedSite) {
        this.assignedSite = assignedSite;
    }

    public SearchMultiSelectField getAssignedSiteId() {
        return this.assignedSiteId;
    }

    public void setAssignedSiteId(SearchMultiSelectField assignedSiteId) {
        this.assignedSiteId = assignedSiteId;
    }

    public SearchStringField getAttention() {
        return this.attention;
    }

    public void setAttention(SearchStringField attention) {
        this.attention = attention;
    }

    public SearchBooleanField getAvailableOffline() {
        return this.availableOffline;
    }

    public void setAvailableOffline(SearchBooleanField availableOffline) {
        this.availableOffline = availableOffline;
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

    public SearchDoubleField getBoughtAmount() {
        return this.boughtAmount;
    }

    public void setBoughtAmount(SearchDoubleField boughtAmount) {
        this.boughtAmount = boughtAmount;
    }

    public SearchDateField getBoughtDate() {
        return this.boughtDate;
    }

    public void setBoughtDate(SearchDateField boughtDate) {
        this.boughtDate = boughtDate;
    }

    public SearchMultiSelectField getBuyingReason() {
        return this.buyingReason;
    }

    public void setBuyingReason(SearchMultiSelectField buyingReason) {
        this.buyingReason = buyingReason;
    }

    public SearchMultiSelectField getBuyingTimeFrame() {
        return this.buyingTimeFrame;
    }

    public void setBuyingTimeFrame(SearchMultiSelectField buyingTimeFrame) {
        this.buyingTimeFrame = buyingTimeFrame;
    }

    public SearchMultiSelectField getCategory() {
        return this.category;
    }

    public void setCategory(SearchMultiSelectField category) {
        this.category = category;
    }

    public SearchStringField getCcCustomerCode() {
        return this.ccCustomerCode;
    }

    public void setCcCustomerCode(SearchStringField ccCustomerCode) {
        this.ccCustomerCode = ccCustomerCode;
    }

    public SearchBooleanField getCcDefault() {
        return this.ccDefault;
    }

    public void setCcDefault(SearchBooleanField ccDefault) {
        this.ccDefault = ccDefault;
    }

    public SearchDateField getCcExpDate() {
        return this.ccExpDate;
    }

    public void setCcExpDate(SearchDateField ccExpDate) {
        this.ccExpDate = ccExpDate;
    }

    public SearchStringField getCcHolderName() {
        return this.ccHolderName;
    }

    public void setCcHolderName(SearchStringField ccHolderName) {
        this.ccHolderName = ccHolderName;
    }

    public SearchStringField getCcNumber() {
        return this.ccNumber;
    }

    public void setCcNumber(SearchStringField ccNumber) {
        this.ccNumber = ccNumber;
    }

    public SearchMultiSelectField getCcState() {
        return this.ccState;
    }

    public void setCcState(SearchMultiSelectField ccState) {
        this.ccState = ccState;
    }

    public SearchDateField getCcStateFrom() {
        return this.ccStateFrom;
    }

    public void setCcStateFrom(SearchDateField ccStateFrom) {
        this.ccStateFrom = ccStateFrom;
    }

    public SearchMultiSelectField getCcType() {
        return this.ccType;
    }

    public void setCcType(SearchMultiSelectField ccType) {
        this.ccType = ccType;
    }

    public SearchStringField getCity() {
        return this.city;
    }

    public void setCity(SearchStringField city) {
        this.city = city;
    }

    public SearchMultiSelectField getClassBought() {
        return this.classBought;
    }

    public void setClassBought(SearchMultiSelectField classBought) {
        this.classBought = classBought;
    }

    public SearchStringField getComments() {
        return this.comments;
    }

    public void setComments(SearchStringField comments) {
        this.comments = comments;
    }

    public SearchStringField getCompanyName() {
        return this.companyName;
    }

    public void setCompanyName(SearchStringField companyName) {
        this.companyName = companyName;
    }

    public SearchDoubleField getConsolBalance() {
        return this.consolBalance;
    }

    public void setConsolBalance(SearchDoubleField consolBalance) {
        this.consolBalance = consolBalance;
    }

    public SearchLongField getConsolDaysOverdue() {
        return this.consolDaysOverdue;
    }

    public void setConsolDaysOverdue(SearchLongField consolDaysOverdue) {
        this.consolDaysOverdue = consolDaysOverdue;
    }

    public SearchDoubleField getConsolDepositBalance() {
        return this.consolDepositBalance;
    }

    public void setConsolDepositBalance(SearchDoubleField consolDepositBalance) {
        this.consolDepositBalance = consolDepositBalance;
    }

    public SearchDoubleField getConsolOverdueBalance() {
        return this.consolOverdueBalance;
    }

    public void setConsolOverdueBalance(SearchDoubleField consolOverdueBalance) {
        this.consolOverdueBalance = consolOverdueBalance;
    }

    public SearchDoubleField getConsolUnbilledOrders() {
        return this.consolUnbilledOrders;
    }

    public void setConsolUnbilledOrders(SearchDoubleField consolUnbilledOrders) {
        this.consolUnbilledOrders = consolUnbilledOrders;
    }

    public SearchStringField getContact() {
        return this.contact;
    }

    public void setContact(SearchStringField contact) {
        this.contact = contact;
    }

    public SearchLongField getContribution() {
        return this.contribution;
    }

    public void setContribution(SearchLongField contribution) {
        this.contribution = contribution;
    }

    public SearchDateField getConversionDate() {
        return this.conversionDate;
    }

    public void setConversionDate(SearchDateField conversionDate) {
        this.conversionDate = conversionDate;
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

    public SearchEnumMultiSelectField getCreditHold() {
        return this.creditHold;
    }

    public void setCreditHold(SearchEnumMultiSelectField creditHold) {
        this.creditHold = creditHold;
    }

    public SearchBooleanField getCreditHoldOverride() {
        return this.creditHoldOverride;
    }

    public void setCreditHoldOverride(SearchBooleanField creditHoldOverride) {
        this.creditHoldOverride = creditHoldOverride;
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

    public SearchMultiSelectField getCustStage() {
        return this.custStage;
    }

    public void setCustStage(SearchMultiSelectField custStage) {
        this.custStage = custStage;
    }

    public SearchMultiSelectField getCustStatus() {
        return this.custStatus;
    }

    public void setCustStatus(SearchMultiSelectField custStatus) {
        this.custStatus = custStatus;
    }

    public SearchDateField getDateClosed() {
        return this.dateClosed;
    }

    public void setDateClosed(SearchDateField dateClosed) {
        this.dateClosed = dateClosed;
    }

    public SearchDateField getDateCreated() {
        return this.dateCreated;
    }

    public void setDateCreated(SearchDateField dateCreated) {
        this.dateCreated = dateCreated;
    }

    public SearchLongField getDaysOverdue() {
        return this.daysOverdue;
    }

    public void setDaysOverdue(SearchLongField daysOverdue) {
        this.daysOverdue = daysOverdue;
    }

    public SearchMultiSelectField getDefaultAllocationStrategy() {
        return this.defaultAllocationStrategy;
    }

    public void setDefaultAllocationStrategy(SearchMultiSelectField defaultAllocationStrategy) {
        this.defaultAllocationStrategy = defaultAllocationStrategy;
    }

    public SearchDoubleField getDefaultOrderPriority() {
        return this.defaultOrderPriority;
    }

    public void setDefaultOrderPriority(SearchDoubleField defaultOrderPriority) {
        this.defaultOrderPriority = defaultOrderPriority;
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

    public SearchDoubleField getDepositBalance() {
        return this.depositBalance;
    }

    public void setDepositBalance(SearchDoubleField depositBalance) {
        this.depositBalance = depositBalance;
    }

    public SearchMultiSelectField getDeptBought() {
        return this.deptBought;
    }

    public void setDeptBought(SearchMultiSelectField deptBought) {
        this.deptBought = deptBought;
    }

    public SearchMultiSelectField getDrAccount() {
        return this.drAccount;
    }

    public void setDrAccount(SearchMultiSelectField drAccount) {
        this.drAccount = drAccount;
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

    public SearchDateField getEndDate() {
        return this.endDate;
    }

    public void setEndDate(SearchDateField endDate) {
        this.endDate = endDate;
    }

    public SearchStringField getEntityId() {
        return this.entityId;
    }

    public void setEntityId(SearchStringField entityId) {
        this.entityId = entityId;
    }

    public SearchMultiSelectField getEntityStatus() {
        return this.entityStatus;
    }

    public void setEntityStatus(SearchMultiSelectField entityStatus) {
        this.entityStatus = entityStatus;
    }

    public SearchDoubleField getEstimatedBudget() {
        return this.estimatedBudget;
    }

    public void setEstimatedBudget(SearchDoubleField estimatedBudget) {
        this.estimatedBudget = estimatedBudget;
    }

    public SearchBooleanField getExplicitConversion() {
        return this.explicitConversion;
    }

    public void setExplicitConversion(SearchBooleanField explicitConversion) {
        this.explicitConversion = explicitConversion;
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

    public SearchDateField getFirstOrderDate() {
        return this.firstOrderDate;
    }

    public void setFirstOrderDate(SearchDateField firstOrderDate) {
        this.firstOrderDate = firstOrderDate;
    }

    public SearchDateField getFirstSaleDate() {
        return this.firstSaleDate;
    }

    public void setFirstSaleDate(SearchDateField firstSaleDate) {
        this.firstSaleDate = firstSaleDate;
    }

    public SearchMultiSelectField getFxAccount() {
        return this.fxAccount;
    }

    public void setFxAccount(SearchMultiSelectField fxAccount) {
        this.fxAccount = fxAccount;
    }

    public SearchDoubleField getFxBalance() {
        return this.fxBalance;
    }

    public void setFxBalance(SearchDoubleField fxBalance) {
        this.fxBalance = fxBalance;
    }

    public SearchDoubleField getFxConsolBalance() {
        return this.fxConsolBalance;
    }

    public void setFxConsolBalance(SearchDoubleField fxConsolBalance) {
        this.fxConsolBalance = fxConsolBalance;
    }

    public SearchDoubleField getFxConsolUnbilledOrders() {
        return this.fxConsolUnbilledOrders;
    }

    public void setFxConsolUnbilledOrders(SearchDoubleField fxConsolUnbilledOrders) {
        this.fxConsolUnbilledOrders = fxConsolUnbilledOrders;
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

    public SearchMultiSelectField getGroupPricingLevel() {
        return this.groupPricingLevel;
    }

    public void setGroupPricingLevel(SearchMultiSelectField groupPricingLevel) {
        this.groupPricingLevel = groupPricingLevel;
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

    public SearchBooleanField getIsBudgetApproved() {
        return this.isBudgetApproved;
    }

    public void setIsBudgetApproved(SearchBooleanField isBudgetApproved) {
        this.isBudgetApproved = isBudgetApproved;
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

    public SearchBooleanField getIsPerson() {
        return this.isPerson;
    }

    public void setIsPerson(SearchBooleanField isPerson) {
        this.isPerson = isPerson;
    }

    public SearchBooleanField getIsReportedLead() {
        return this.isReportedLead;
    }

    public void setIsReportedLead(SearchBooleanField isReportedLead) {
        this.isReportedLead = isReportedLead;
    }

    public SearchBooleanField getIsShipAddress() {
        return this.isShipAddress;
    }

    public void setIsShipAddress(SearchBooleanField isShipAddress) {
        this.isShipAddress = isShipAddress;
    }

    public SearchMultiSelectField getItemPricingLevel() {
        return this.itemPricingLevel;
    }

    public void setItemPricingLevel(SearchMultiSelectField itemPricingLevel) {
        this.itemPricingLevel = itemPricingLevel;
    }

    public SearchDoubleField getItemPricingUnitPrice() {
        return this.itemPricingUnitPrice;
    }

    public void setItemPricingUnitPrice(SearchDoubleField itemPricingUnitPrice) {
        this.itemPricingUnitPrice = itemPricingUnitPrice;
    }

    public SearchMultiSelectField getItemsBought() {
        return this.itemsBought;
    }

    public void setItemsBought(SearchMultiSelectField itemsBought) {
        this.itemsBought = itemsBought;
    }

    public SearchMultiSelectField getItemsOrdered() {
        return this.itemsOrdered;
    }

    public void setItemsOrdered(SearchMultiSelectField itemsOrdered) {
        this.itemsOrdered = itemsOrdered;
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

    public SearchDateField getLastOrderDate() {
        return this.lastOrderDate;
    }

    public void setLastOrderDate(SearchDateField lastOrderDate) {
        this.lastOrderDate = lastOrderDate;
    }

    public SearchDateField getLastSaleDate() {
        return this.lastSaleDate;
    }

    public void setLastSaleDate(SearchDateField lastSaleDate) {
        this.lastSaleDate = lastSaleDate;
    }

    public SearchDateField getLeadDate() {
        return this.leadDate;
    }

    public void setLeadDate(SearchDateField leadDate) {
        this.leadDate = leadDate;
    }

    public SearchMultiSelectField getLeadSource() {
        return this.leadSource;
    }

    public void setLeadSource(SearchMultiSelectField leadSource) {
        this.leadSource = leadSource;
    }

    public SearchEnumMultiSelectField getLevel() {
        return this.level;
    }

    public void setLevel(SearchEnumMultiSelectField level) {
        this.level = level;
    }

    public SearchMultiSelectField getLocationBought() {
        return this.locationBought;
    }

    public void setLocationBought(SearchMultiSelectField locationBought) {
        this.locationBought = locationBought;
    }

    public SearchBooleanField getManualCreditHold() {
        return this.manualCreditHold;
    }

    public void setManualCreditHold(SearchBooleanField manualCreditHold) {
        this.manualCreditHold = manualCreditHold;
    }

    public SearchMultiSelectField getMerchantAccount() {
        return this.merchantAccount;
    }

    public void setMerchantAccount(SearchMultiSelectField merchantAccount) {
        this.merchantAccount = merchantAccount;
    }

    public SearchStringField getMiddleName() {
        return this.middleName;
    }

    public void setMiddleName(SearchStringField middleName) {
        this.middleName = middleName;
    }

    public SearchEnumMultiSelectField getMonthlyClosing() {
        return this.monthlyClosing;
    }

    public void setMonthlyClosing(SearchEnumMultiSelectField monthlyClosing) {
        this.monthlyClosing = monthlyClosing;
    }

    public SearchBooleanField getOnCreditHold() {
        return this.onCreditHold;
    }

    public void setOnCreditHold(SearchBooleanField onCreditHold) {
        this.onCreditHold = onCreditHold;
    }

    public SearchDoubleField getOrderedAmount() {
        return this.orderedAmount;
    }

    public void setOrderedAmount(SearchDoubleField orderedAmount) {
        this.orderedAmount = orderedAmount;
    }

    public SearchDateField getOrderedDate() {
        return this.orderedDate;
    }

    public void setOrderedDate(SearchDateField orderedDate) {
        this.orderedDate = orderedDate;
    }

    public SearchEnumMultiSelectField getOtherRelationships() {
        return this.otherRelationships;
    }

    public void setOtherRelationships(SearchEnumMultiSelectField otherRelationships) {
        this.otherRelationships = otherRelationships;
    }

    public SearchDoubleField getOverdueBalance() {
        return this.overdueBalance;
    }

    public void setOverdueBalance(SearchDoubleField overdueBalance) {
        this.overdueBalance = overdueBalance;
    }

    public SearchMultiSelectField getParent() {
        return this.parent;
    }

    public void setParent(SearchMultiSelectField parent) {
        this.parent = parent;
    }

    public SearchMultiSelectField getParentItemsBought() {
        return this.parentItemsBought;
    }

    public void setParentItemsBought(SearchMultiSelectField parentItemsBought) {
        this.parentItemsBought = parentItemsBought;
    }

    public SearchMultiSelectField getParentItemsOrdered() {
        return this.parentItemsOrdered;
    }

    public void setParentItemsOrdered(SearchMultiSelectField parentItemsOrdered) {
        this.parentItemsOrdered = parentItemsOrdered;
    }

    public SearchMultiSelectField getPartner() {
        return this.partner;
    }

    public void setPartner(SearchMultiSelectField partner) {
        this.partner = partner;
    }

    public SearchLongField getPartnerContribution() {
        return this.partnerContribution;
    }

    public void setPartnerContribution(SearchLongField partnerContribution) {
        this.partnerContribution = partnerContribution;
    }

    public SearchMultiSelectField getPartnerRole() {
        return this.partnerRole;
    }

    public void setPartnerRole(SearchMultiSelectField partnerRole) {
        this.partnerRole = partnerRole;
    }

    public SearchMultiSelectField getPartnerTeamMember() {
        return this.partnerTeamMember;
    }

    public void setPartnerTeamMember(SearchMultiSelectField partnerTeamMember) {
        this.partnerTeamMember = partnerTeamMember;
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

    public SearchMultiSelectField getPriceLevel() {
        return this.priceLevel;
    }

    public void setPriceLevel(SearchMultiSelectField priceLevel) {
        this.priceLevel = priceLevel;
    }

    public SearchMultiSelectField getPricingGroup() {
        return this.pricingGroup;
    }

    public void setPricingGroup(SearchMultiSelectField pricingGroup) {
        this.pricingGroup = pricingGroup;
    }

    public SearchMultiSelectField getPricingItem() {
        return this.pricingItem;
    }

    public void setPricingItem(SearchMultiSelectField pricingItem) {
        this.pricingItem = pricingItem;
    }

    public SearchBooleanField getPrintTransactions() {
        return this.printTransactions;
    }

    public void setPrintTransactions(SearchBooleanField printTransactions) {
        this.printTransactions = printTransactions;
    }

    public SearchDateField getProspectDate() {
        return this.prospectDate;
    }

    public void setProspectDate(SearchDateField prospectDate) {
        this.prospectDate = prospectDate;
    }

    public SearchBooleanField getPstExempt() {
        return this.pstExempt;
    }

    public void setPstExempt(SearchBooleanField pstExempt) {
        this.pstExempt = pstExempt;
    }

    public SearchMultiSelectField getReceivablesAccount() {
        return this.receivablesAccount;
    }

    public void setReceivablesAccount(SearchMultiSelectField receivablesAccount) {
        this.receivablesAccount = receivablesAccount;
    }

    public SearchDateField getReminderDate() {
        return this.reminderDate;
    }

    public void setReminderDate(SearchDateField reminderDate) {
        this.reminderDate = reminderDate;
    }

    public SearchStringField getResaleNumber() {
        return this.resaleNumber;
    }

    public void setResaleNumber(SearchStringField resaleNumber) {
        this.resaleNumber = resaleNumber;
    }

    public SearchMultiSelectField getRole() {
        return this.role;
    }

    public void setRole(SearchMultiSelectField role) {
        this.role = role;
    }

    public SearchMultiSelectField getSalesReadiness() {
        return this.salesReadiness;
    }

    public void setSalesReadiness(SearchMultiSelectField salesReadiness) {
        this.salesReadiness = salesReadiness;
    }

    public SearchMultiSelectField getSalesRep() {
        return this.salesRep;
    }

    public void setSalesRep(SearchMultiSelectField salesRep) {
        this.salesRep = salesRep;
    }

    public SearchMultiSelectField getSalesTeamMember() {
        return this.salesTeamMember;
    }

    public void setSalesTeamMember(SearchMultiSelectField salesTeamMember) {
        this.salesTeamMember = salesTeamMember;
    }

    public SearchMultiSelectField getSalesTeamRole() {
        return this.salesTeamRole;
    }

    public void setSalesTeamRole(SearchMultiSelectField salesTeamRole) {
        this.salesTeamRole = salesTeamRole;
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

    public SearchBooleanField getShipComplete() {
        return this.shipComplete;
    }

    public void setShipComplete(SearchBooleanField shipComplete) {
        this.shipComplete = shipComplete;
    }

    public SearchMultiSelectField getShippingItem() {
        return this.shippingItem;
    }

    public void setShippingItem(SearchMultiSelectField shippingItem) {
        this.shippingItem = shippingItem;
    }

    public SearchMultiSelectField getSourceSite() {
        return this.sourceSite;
    }

    public void setSourceSite(SearchMultiSelectField sourceSite) {
        this.sourceSite = sourceSite;
    }

    public SearchMultiSelectField getSourceSiteId() {
        return this.sourceSiteId;
    }

    public void setSourceSiteId(SearchMultiSelectField sourceSiteId) {
        this.sourceSiteId = sourceSiteId;
    }

    public SearchEnumMultiSelectField getStage() {
        return this.stage;
    }

    public void setStage(SearchEnumMultiSelectField stage) {
        this.stage = stage;
    }

    public SearchDateField getStartDate() {
        return this.startDate;
    }

    public void setStartDate(SearchDateField startDate) {
        this.startDate = startDate;
    }

    public SearchStringField getState() {
        return this.state;
    }

    public void setState(SearchStringField state) {
        this.state = state;
    }

    public SearchMultiSelectField getSubsidBought() {
        return this.subsidBought;
    }

    public void setSubsidBought(SearchMultiSelectField subsidBought) {
        this.subsidBought = subsidBought;
    }

    public SearchMultiSelectField getSubsidiary() {
        return this.subsidiary;
    }

    public void setSubsidiary(SearchMultiSelectField subsidiary) {
        this.subsidiary = subsidiary;
    }

    public SearchBooleanField getTaxable() {
        return this.taxable;
    }

    public void setTaxable(SearchBooleanField taxable) {
        this.taxable = taxable;
    }

    public SearchMultiSelectField getTerms() {
        return this.terms;
    }

    public void setTerms(SearchMultiSelectField terms) {
        this.terms = terms;
    }

    public SearchMultiSelectField getTerritory() {
        return this.territory;
    }

    public void setTerritory(SearchMultiSelectField territory) {
        this.territory = territory;
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

    public SearchBooleanField getWebLead() {
        return this.webLead;
    }

    public void setWebLead(SearchBooleanField webLead) {
        this.webLead = webLead;
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
        if (!(obj instanceof CustomerSearchBasic)) {
            return false;
        }
        CustomerSearchBasic other = (CustomerSearchBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.accountNumber == null && other.getAccountNumber() == null || this.accountNumber != null && this.accountNumber.equals(other.getAccountNumber())) && (this.address == null && other.getAddress() == null || this.address != null && this.address.equals(other.getAddress())) && (this.addressee == null && other.getAddressee() == null || this.addressee != null && this.addressee.equals(other.getAddressee())) && (this.addressLabel == null && other.getAddressLabel() == null || this.addressLabel != null && this.addressLabel.equals(other.getAddressLabel())) && (this.addressPhone == null && other.getAddressPhone() == null || this.addressPhone != null && this.addressPhone.equals(other.getAddressPhone())) && (this.assignedSite == null && other.getAssignedSite() == null || this.assignedSite != null && this.assignedSite.equals(other.getAssignedSite())) && (this.assignedSiteId == null && other.getAssignedSiteId() == null || this.assignedSiteId != null && this.assignedSiteId.equals(other.getAssignedSiteId())) && (this.attention == null && other.getAttention() == null || this.attention != null && this.attention.equals(other.getAttention())) && (this.availableOffline == null && other.getAvailableOffline() == null || this.availableOffline != null && this.availableOffline.equals(other.getAvailableOffline())) && (this.balance == null && other.getBalance() == null || this.balance != null && this.balance.equals(other.getBalance())) && (this.billAddress == null && other.getBillAddress() == null || this.billAddress != null && this.billAddress.equals(other.getBillAddress())) && (this.boughtAmount == null && other.getBoughtAmount() == null || this.boughtAmount != null && this.boughtAmount.equals(other.getBoughtAmount())) && (this.boughtDate == null && other.getBoughtDate() == null || this.boughtDate != null && this.boughtDate.equals(other.getBoughtDate())) && (this.buyingReason == null && other.getBuyingReason() == null || this.buyingReason != null && this.buyingReason.equals(other.getBuyingReason())) && (this.buyingTimeFrame == null && other.getBuyingTimeFrame() == null || this.buyingTimeFrame != null && this.buyingTimeFrame.equals(other.getBuyingTimeFrame())) && (this.category == null && other.getCategory() == null || this.category != null && this.category.equals(other.getCategory())) && (this.ccCustomerCode == null && other.getCcCustomerCode() == null || this.ccCustomerCode != null && this.ccCustomerCode.equals(other.getCcCustomerCode())) && (this.ccDefault == null && other.getCcDefault() == null || this.ccDefault != null && this.ccDefault.equals(other.getCcDefault())) && (this.ccExpDate == null && other.getCcExpDate() == null || this.ccExpDate != null && this.ccExpDate.equals(other.getCcExpDate())) && (this.ccHolderName == null && other.getCcHolderName() == null || this.ccHolderName != null && this.ccHolderName.equals(other.getCcHolderName())) && (this.ccNumber == null && other.getCcNumber() == null || this.ccNumber != null && this.ccNumber.equals(other.getCcNumber())) && (this.ccState == null && other.getCcState() == null || this.ccState != null && this.ccState.equals(other.getCcState())) && (this.ccStateFrom == null && other.getCcStateFrom() == null || this.ccStateFrom != null && this.ccStateFrom.equals(other.getCcStateFrom())) && (this.ccType == null && other.getCcType() == null || this.ccType != null && this.ccType.equals(other.getCcType())) && (this.city == null && other.getCity() == null || this.city != null && this.city.equals(other.getCity())) && (this.classBought == null && other.getClassBought() == null || this.classBought != null && this.classBought.equals(other.getClassBought())) && (this.comments == null && other.getComments() == null || this.comments != null && this.comments.equals(other.getComments())) && (this.companyName == null && other.getCompanyName() == null || this.companyName != null && this.companyName.equals(other.getCompanyName())) && (this.consolBalance == null && other.getConsolBalance() == null || this.consolBalance != null && this.consolBalance.equals(other.getConsolBalance())) && (this.consolDaysOverdue == null && other.getConsolDaysOverdue() == null || this.consolDaysOverdue != null && this.consolDaysOverdue.equals(other.getConsolDaysOverdue())) && (this.consolDepositBalance == null && other.getConsolDepositBalance() == null || this.consolDepositBalance != null && this.consolDepositBalance.equals(other.getConsolDepositBalance())) && (this.consolOverdueBalance == null && other.getConsolOverdueBalance() == null || this.consolOverdueBalance != null && this.consolOverdueBalance.equals(other.getConsolOverdueBalance())) && (this.consolUnbilledOrders == null && other.getConsolUnbilledOrders() == null || this.consolUnbilledOrders != null && this.consolUnbilledOrders.equals(other.getConsolUnbilledOrders())) && (this.contact == null && other.getContact() == null || this.contact != null && this.contact.equals(other.getContact())) && (this.contribution == null && other.getContribution() == null || this.contribution != null && this.contribution.equals(other.getContribution())) && (this.conversionDate == null && other.getConversionDate() == null || this.conversionDate != null && this.conversionDate.equals(other.getConversionDate())) && (this.country == null && other.getCountry() == null || this.country != null && this.country.equals(other.getCountry())) && (this.county == null && other.getCounty() == null || this.county != null && this.county.equals(other.getCounty())) && (this.creditHold == null && other.getCreditHold() == null || this.creditHold != null && this.creditHold.equals(other.getCreditHold())) && (this.creditHoldOverride == null && other.getCreditHoldOverride() == null || this.creditHoldOverride != null && this.creditHoldOverride.equals(other.getCreditHoldOverride())) && (this.creditLimit == null && other.getCreditLimit() == null || this.creditLimit != null && this.creditLimit.equals(other.getCreditLimit())) && (this.currency == null && other.getCurrency() == null || this.currency != null && this.currency.equals(other.getCurrency())) && (this.custStage == null && other.getCustStage() == null || this.custStage != null && this.custStage.equals(other.getCustStage())) && (this.custStatus == null && other.getCustStatus() == null || this.custStatus != null && this.custStatus.equals(other.getCustStatus())) && (this.dateClosed == null && other.getDateClosed() == null || this.dateClosed != null && this.dateClosed.equals(other.getDateClosed())) && (this.dateCreated == null && other.getDateCreated() == null || this.dateCreated != null && this.dateCreated.equals(other.getDateCreated())) && (this.daysOverdue == null && other.getDaysOverdue() == null || this.daysOverdue != null && this.daysOverdue.equals(other.getDaysOverdue())) && (this.defaultAllocationStrategy == null && other.getDefaultAllocationStrategy() == null || this.defaultAllocationStrategy != null && this.defaultAllocationStrategy.equals(other.getDefaultAllocationStrategy())) && (this.defaultOrderPriority == null && other.getDefaultOrderPriority() == null || this.defaultOrderPriority != null && this.defaultOrderPriority.equals(other.getDefaultOrderPriority())) && (this.defaultTaxReg == null && other.getDefaultTaxReg() == null || this.defaultTaxReg != null && this.defaultTaxReg.equals(other.getDefaultTaxReg())) && (this.defaultTaxRegText == null && other.getDefaultTaxRegText() == null || this.defaultTaxRegText != null && this.defaultTaxRegText.equals(other.getDefaultTaxRegText())) && (this.depositBalance == null && other.getDepositBalance() == null || this.depositBalance != null && this.depositBalance.equals(other.getDepositBalance())) && (this.deptBought == null && other.getDeptBought() == null || this.deptBought != null && this.deptBought.equals(other.getDeptBought())) && (this.drAccount == null && other.getDrAccount() == null || this.drAccount != null && this.drAccount.equals(other.getDrAccount())) && (this.email == null && other.getEmail() == null || this.email != null && this.email.equals(other.getEmail())) && (this.emailPreference == null && other.getEmailPreference() == null || this.emailPreference != null && this.emailPreference.equals(other.getEmailPreference())) && (this.emailTransactions == null && other.getEmailTransactions() == null || this.emailTransactions != null && this.emailTransactions.equals(other.getEmailTransactions())) && (this.endDate == null && other.getEndDate() == null || this.endDate != null && this.endDate.equals(other.getEndDate())) && (this.entityId == null && other.getEntityId() == null || this.entityId != null && this.entityId.equals(other.getEntityId())) && (this.entityStatus == null && other.getEntityStatus() == null || this.entityStatus != null && this.entityStatus.equals(other.getEntityStatus())) && (this.estimatedBudget == null && other.getEstimatedBudget() == null || this.estimatedBudget != null && this.estimatedBudget.equals(other.getEstimatedBudget())) && (this.explicitConversion == null && other.getExplicitConversion() == null || this.explicitConversion != null && this.explicitConversion.equals(other.getExplicitConversion())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId())) && (this.externalIdString == null && other.getExternalIdString() == null || this.externalIdString != null && this.externalIdString.equals(other.getExternalIdString())) && (this.fax == null && other.getFax() == null || this.fax != null && this.fax.equals(other.getFax())) && (this.faxTransactions == null && other.getFaxTransactions() == null || this.faxTransactions != null && this.faxTransactions.equals(other.getFaxTransactions())) && (this.firstName == null && other.getFirstName() == null || this.firstName != null && this.firstName.equals(other.getFirstName())) && (this.firstOrderDate == null && other.getFirstOrderDate() == null || this.firstOrderDate != null && this.firstOrderDate.equals(other.getFirstOrderDate())) && (this.firstSaleDate == null && other.getFirstSaleDate() == null || this.firstSaleDate != null && this.firstSaleDate.equals(other.getFirstSaleDate())) && (this.fxAccount == null && other.getFxAccount() == null || this.fxAccount != null && this.fxAccount.equals(other.getFxAccount())) && (this.fxBalance == null && other.getFxBalance() == null || this.fxBalance != null && this.fxBalance.equals(other.getFxBalance())) && (this.fxConsolBalance == null && other.getFxConsolBalance() == null || this.fxConsolBalance != null && this.fxConsolBalance.equals(other.getFxConsolBalance())) && (this.fxConsolUnbilledOrders == null && other.getFxConsolUnbilledOrders() == null || this.fxConsolUnbilledOrders != null && this.fxConsolUnbilledOrders.equals(other.getFxConsolUnbilledOrders())) && (this.fxUnbilledOrders == null && other.getFxUnbilledOrders() == null || this.fxUnbilledOrders != null && this.fxUnbilledOrders.equals(other.getFxUnbilledOrders())) && (this.giveAccess == null && other.getGiveAccess() == null || this.giveAccess != null && this.giveAccess.equals(other.getGiveAccess())) && (this.globalSubscriptionStatus == null && other.getGlobalSubscriptionStatus() == null || this.globalSubscriptionStatus != null && this.globalSubscriptionStatus.equals(other.getGlobalSubscriptionStatus())) && (this.group == null && other.getGroup() == null || this.group != null && this.group.equals(other.getGroup())) && (this.groupPricingLevel == null && other.getGroupPricingLevel() == null || this.groupPricingLevel != null && this.groupPricingLevel.equals(other.getGroupPricingLevel())) && (this.hasDuplicates == null && other.getHasDuplicates() == null || this.hasDuplicates != null && this.hasDuplicates.equals(other.getHasDuplicates())) && (this.image == null && other.getImage() == null || this.image != null && this.image.equals(other.getImage())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.internalIdNumber == null && other.getInternalIdNumber() == null || this.internalIdNumber != null && this.internalIdNumber.equals(other.getInternalIdNumber())) && (this.isBudgetApproved == null && other.getIsBudgetApproved() == null || this.isBudgetApproved != null && this.isBudgetApproved.equals(other.getIsBudgetApproved())) && (this.isDefaultBilling == null && other.getIsDefaultBilling() == null || this.isDefaultBilling != null && this.isDefaultBilling.equals(other.getIsDefaultBilling())) && (this.isDefaultShipping == null && other.getIsDefaultShipping() == null || this.isDefaultShipping != null && this.isDefaultShipping.equals(other.getIsDefaultShipping())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && this.isInactive.equals(other.getIsInactive())) && (this.isPerson == null && other.getIsPerson() == null || this.isPerson != null && this.isPerson.equals(other.getIsPerson())) && (this.isReportedLead == null && other.getIsReportedLead() == null || this.isReportedLead != null && this.isReportedLead.equals(other.getIsReportedLead())) && (this.isShipAddress == null && other.getIsShipAddress() == null || this.isShipAddress != null && this.isShipAddress.equals(other.getIsShipAddress())) && (this.itemPricingLevel == null && other.getItemPricingLevel() == null || this.itemPricingLevel != null && this.itemPricingLevel.equals(other.getItemPricingLevel())) && (this.itemPricingUnitPrice == null && other.getItemPricingUnitPrice() == null || this.itemPricingUnitPrice != null && this.itemPricingUnitPrice.equals(other.getItemPricingUnitPrice())) && (this.itemsBought == null && other.getItemsBought() == null || this.itemsBought != null && this.itemsBought.equals(other.getItemsBought())) && (this.itemsOrdered == null && other.getItemsOrdered() == null || this.itemsOrdered != null && this.itemsOrdered.equals(other.getItemsOrdered())) && (this.language == null && other.getLanguage() == null || this.language != null && this.language.equals(other.getLanguage())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && this.lastModifiedDate.equals(other.getLastModifiedDate())) && (this.lastName == null && other.getLastName() == null || this.lastName != null && this.lastName.equals(other.getLastName())) && (this.lastOrderDate == null && other.getLastOrderDate() == null || this.lastOrderDate != null && this.lastOrderDate.equals(other.getLastOrderDate())) && (this.lastSaleDate == null && other.getLastSaleDate() == null || this.lastSaleDate != null && this.lastSaleDate.equals(other.getLastSaleDate())) && (this.leadDate == null && other.getLeadDate() == null || this.leadDate != null && this.leadDate.equals(other.getLeadDate())) && (this.leadSource == null && other.getLeadSource() == null || this.leadSource != null && this.leadSource.equals(other.getLeadSource())) && (this.level == null && other.getLevel() == null || this.level != null && this.level.equals(other.getLevel())) && (this.locationBought == null && other.getLocationBought() == null || this.locationBought != null && this.locationBought.equals(other.getLocationBought())) && (this.manualCreditHold == null && other.getManualCreditHold() == null || this.manualCreditHold != null && this.manualCreditHold.equals(other.getManualCreditHold())) && (this.merchantAccount == null && other.getMerchantAccount() == null || this.merchantAccount != null && this.merchantAccount.equals(other.getMerchantAccount())) && (this.middleName == null && other.getMiddleName() == null || this.middleName != null && this.middleName.equals(other.getMiddleName())) && (this.monthlyClosing == null && other.getMonthlyClosing() == null || this.monthlyClosing != null && this.monthlyClosing.equals(other.getMonthlyClosing())) && (this.onCreditHold == null && other.getOnCreditHold() == null || this.onCreditHold != null && this.onCreditHold.equals(other.getOnCreditHold())) && (this.orderedAmount == null && other.getOrderedAmount() == null || this.orderedAmount != null && this.orderedAmount.equals(other.getOrderedAmount())) && (this.orderedDate == null && other.getOrderedDate() == null || this.orderedDate != null && this.orderedDate.equals(other.getOrderedDate())) && (this.otherRelationships == null && other.getOtherRelationships() == null || this.otherRelationships != null && this.otherRelationships.equals(other.getOtherRelationships())) && (this.overdueBalance == null && other.getOverdueBalance() == null || this.overdueBalance != null && this.overdueBalance.equals(other.getOverdueBalance())) && (this.parent == null && other.getParent() == null || this.parent != null && this.parent.equals(other.getParent())) && (this.parentItemsBought == null && other.getParentItemsBought() == null || this.parentItemsBought != null && this.parentItemsBought.equals(other.getParentItemsBought())) && (this.parentItemsOrdered == null && other.getParentItemsOrdered() == null || this.parentItemsOrdered != null && this.parentItemsOrdered.equals(other.getParentItemsOrdered())) && (this.partner == null && other.getPartner() == null || this.partner != null && this.partner.equals(other.getPartner())) && (this.partnerContribution == null && other.getPartnerContribution() == null || this.partnerContribution != null && this.partnerContribution.equals(other.getPartnerContribution())) && (this.partnerRole == null && other.getPartnerRole() == null || this.partnerRole != null && this.partnerRole.equals(other.getPartnerRole())) && (this.partnerTeamMember == null && other.getPartnerTeamMember() == null || this.partnerTeamMember != null && this.partnerTeamMember.equals(other.getPartnerTeamMember())) && (this.pec == null && other.getPec() == null || this.pec != null && this.pec.equals(other.getPec())) && (this.permission == null && other.getPermission() == null || this.permission != null && this.permission.equals(other.getPermission())) && (this.phone == null && other.getPhone() == null || this.phone != null && this.phone.equals(other.getPhone())) && (this.phoneticName == null && other.getPhoneticName() == null || this.phoneticName != null && this.phoneticName.equals(other.getPhoneticName())) && (this.priceLevel == null && other.getPriceLevel() == null || this.priceLevel != null && this.priceLevel.equals(other.getPriceLevel())) && (this.pricingGroup == null && other.getPricingGroup() == null || this.pricingGroup != null && this.pricingGroup.equals(other.getPricingGroup())) && (this.pricingItem == null && other.getPricingItem() == null || this.pricingItem != null && this.pricingItem.equals(other.getPricingItem())) && (this.printTransactions == null && other.getPrintTransactions() == null || this.printTransactions != null && this.printTransactions.equals(other.getPrintTransactions())) && (this.prospectDate == null && other.getProspectDate() == null || this.prospectDate != null && this.prospectDate.equals(other.getProspectDate())) && (this.pstExempt == null && other.getPstExempt() == null || this.pstExempt != null && this.pstExempt.equals(other.getPstExempt())) && (this.receivablesAccount == null && other.getReceivablesAccount() == null || this.receivablesAccount != null && this.receivablesAccount.equals(other.getReceivablesAccount())) && (this.reminderDate == null && other.getReminderDate() == null || this.reminderDate != null && this.reminderDate.equals(other.getReminderDate())) && (this.resaleNumber == null && other.getResaleNumber() == null || this.resaleNumber != null && this.resaleNumber.equals(other.getResaleNumber())) && (this.role == null && other.getRole() == null || this.role != null && this.role.equals(other.getRole())) && (this.salesReadiness == null && other.getSalesReadiness() == null || this.salesReadiness != null && this.salesReadiness.equals(other.getSalesReadiness())) && (this.salesRep == null && other.getSalesRep() == null || this.salesRep != null && this.salesRep.equals(other.getSalesRep())) && (this.salesTeamMember == null && other.getSalesTeamMember() == null || this.salesTeamMember != null && this.salesTeamMember.equals(other.getSalesTeamMember())) && (this.salesTeamRole == null && other.getSalesTeamRole() == null || this.salesTeamRole != null && this.salesTeamRole.equals(other.getSalesTeamRole())) && (this.salutation == null && other.getSalutation() == null || this.salutation != null && this.salutation.equals(other.getSalutation())) && (this.shipAddress == null && other.getShipAddress() == null || this.shipAddress != null && this.shipAddress.equals(other.getShipAddress())) && (this.shipComplete == null && other.getShipComplete() == null || this.shipComplete != null && this.shipComplete.equals(other.getShipComplete())) && (this.shippingItem == null && other.getShippingItem() == null || this.shippingItem != null && this.shippingItem.equals(other.getShippingItem())) && (this.sourceSite == null && other.getSourceSite() == null || this.sourceSite != null && this.sourceSite.equals(other.getSourceSite())) && (this.sourceSiteId == null && other.getSourceSiteId() == null || this.sourceSiteId != null && this.sourceSiteId.equals(other.getSourceSiteId())) && (this.stage == null && other.getStage() == null || this.stage != null && this.stage.equals(other.getStage())) && (this.startDate == null && other.getStartDate() == null || this.startDate != null && this.startDate.equals(other.getStartDate())) && (this.state == null && other.getState() == null || this.state != null && this.state.equals(other.getState())) && (this.subsidBought == null && other.getSubsidBought() == null || this.subsidBought != null && this.subsidBought.equals(other.getSubsidBought())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && this.subsidiary.equals(other.getSubsidiary())) && (this.taxable == null && other.getTaxable() == null || this.taxable != null && this.taxable.equals(other.getTaxable())) && (this.terms == null && other.getTerms() == null || this.terms != null && this.terms.equals(other.getTerms())) && (this.territory == null && other.getTerritory() == null || this.territory != null && this.territory.equals(other.getTerritory())) && (this.title == null && other.getTitle() == null || this.title != null && this.title.equals(other.getTitle())) && (this.unbilledOrders == null && other.getUnbilledOrders() == null || this.unbilledOrders != null && this.unbilledOrders.equals(other.getUnbilledOrders())) && (this.url == null && other.getUrl() == null || this.url != null && this.url.equals(other.getUrl())) && (this.vatRegNumber == null && other.getVatRegNumber() == null || this.vatRegNumber != null && this.vatRegNumber.equals(other.getVatRegNumber())) && (this.webLead == null && other.getWebLead() == null || this.webLead != null && this.webLead.equals(other.getWebLead())) && (this.zipCode == null && other.getZipCode() == null || this.zipCode != null && this.zipCode.equals(other.getZipCode())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
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
        if (this.getAssignedSite() != null) {
            _hashCode += this.getAssignedSite().hashCode();
        }
        if (this.getAssignedSiteId() != null) {
            _hashCode += this.getAssignedSiteId().hashCode();
        }
        if (this.getAttention() != null) {
            _hashCode += this.getAttention().hashCode();
        }
        if (this.getAvailableOffline() != null) {
            _hashCode += this.getAvailableOffline().hashCode();
        }
        if (this.getBalance() != null) {
            _hashCode += this.getBalance().hashCode();
        }
        if (this.getBillAddress() != null) {
            _hashCode += this.getBillAddress().hashCode();
        }
        if (this.getBoughtAmount() != null) {
            _hashCode += this.getBoughtAmount().hashCode();
        }
        if (this.getBoughtDate() != null) {
            _hashCode += this.getBoughtDate().hashCode();
        }
        if (this.getBuyingReason() != null) {
            _hashCode += this.getBuyingReason().hashCode();
        }
        if (this.getBuyingTimeFrame() != null) {
            _hashCode += this.getBuyingTimeFrame().hashCode();
        }
        if (this.getCategory() != null) {
            _hashCode += this.getCategory().hashCode();
        }
        if (this.getCcCustomerCode() != null) {
            _hashCode += this.getCcCustomerCode().hashCode();
        }
        if (this.getCcDefault() != null) {
            _hashCode += this.getCcDefault().hashCode();
        }
        if (this.getCcExpDate() != null) {
            _hashCode += this.getCcExpDate().hashCode();
        }
        if (this.getCcHolderName() != null) {
            _hashCode += this.getCcHolderName().hashCode();
        }
        if (this.getCcNumber() != null) {
            _hashCode += this.getCcNumber().hashCode();
        }
        if (this.getCcState() != null) {
            _hashCode += this.getCcState().hashCode();
        }
        if (this.getCcStateFrom() != null) {
            _hashCode += this.getCcStateFrom().hashCode();
        }
        if (this.getCcType() != null) {
            _hashCode += this.getCcType().hashCode();
        }
        if (this.getCity() != null) {
            _hashCode += this.getCity().hashCode();
        }
        if (this.getClassBought() != null) {
            _hashCode += this.getClassBought().hashCode();
        }
        if (this.getComments() != null) {
            _hashCode += this.getComments().hashCode();
        }
        if (this.getCompanyName() != null) {
            _hashCode += this.getCompanyName().hashCode();
        }
        if (this.getConsolBalance() != null) {
            _hashCode += this.getConsolBalance().hashCode();
        }
        if (this.getConsolDaysOverdue() != null) {
            _hashCode += this.getConsolDaysOverdue().hashCode();
        }
        if (this.getConsolDepositBalance() != null) {
            _hashCode += this.getConsolDepositBalance().hashCode();
        }
        if (this.getConsolOverdueBalance() != null) {
            _hashCode += this.getConsolOverdueBalance().hashCode();
        }
        if (this.getConsolUnbilledOrders() != null) {
            _hashCode += this.getConsolUnbilledOrders().hashCode();
        }
        if (this.getContact() != null) {
            _hashCode += this.getContact().hashCode();
        }
        if (this.getContribution() != null) {
            _hashCode += this.getContribution().hashCode();
        }
        if (this.getConversionDate() != null) {
            _hashCode += this.getConversionDate().hashCode();
        }
        if (this.getCountry() != null) {
            _hashCode += this.getCountry().hashCode();
        }
        if (this.getCounty() != null) {
            _hashCode += this.getCounty().hashCode();
        }
        if (this.getCreditHold() != null) {
            _hashCode += this.getCreditHold().hashCode();
        }
        if (this.getCreditHoldOverride() != null) {
            _hashCode += this.getCreditHoldOverride().hashCode();
        }
        if (this.getCreditLimit() != null) {
            _hashCode += this.getCreditLimit().hashCode();
        }
        if (this.getCurrency() != null) {
            _hashCode += this.getCurrency().hashCode();
        }
        if (this.getCustStage() != null) {
            _hashCode += this.getCustStage().hashCode();
        }
        if (this.getCustStatus() != null) {
            _hashCode += this.getCustStatus().hashCode();
        }
        if (this.getDateClosed() != null) {
            _hashCode += this.getDateClosed().hashCode();
        }
        if (this.getDateCreated() != null) {
            _hashCode += this.getDateCreated().hashCode();
        }
        if (this.getDaysOverdue() != null) {
            _hashCode += this.getDaysOverdue().hashCode();
        }
        if (this.getDefaultAllocationStrategy() != null) {
            _hashCode += this.getDefaultAllocationStrategy().hashCode();
        }
        if (this.getDefaultOrderPriority() != null) {
            _hashCode += this.getDefaultOrderPriority().hashCode();
        }
        if (this.getDefaultTaxReg() != null) {
            _hashCode += this.getDefaultTaxReg().hashCode();
        }
        if (this.getDefaultTaxRegText() != null) {
            _hashCode += this.getDefaultTaxRegText().hashCode();
        }
        if (this.getDepositBalance() != null) {
            _hashCode += this.getDepositBalance().hashCode();
        }
        if (this.getDeptBought() != null) {
            _hashCode += this.getDeptBought().hashCode();
        }
        if (this.getDrAccount() != null) {
            _hashCode += this.getDrAccount().hashCode();
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
        if (this.getEndDate() != null) {
            _hashCode += this.getEndDate().hashCode();
        }
        if (this.getEntityId() != null) {
            _hashCode += this.getEntityId().hashCode();
        }
        if (this.getEntityStatus() != null) {
            _hashCode += this.getEntityStatus().hashCode();
        }
        if (this.getEstimatedBudget() != null) {
            _hashCode += this.getEstimatedBudget().hashCode();
        }
        if (this.getExplicitConversion() != null) {
            _hashCode += this.getExplicitConversion().hashCode();
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
        if (this.getFirstOrderDate() != null) {
            _hashCode += this.getFirstOrderDate().hashCode();
        }
        if (this.getFirstSaleDate() != null) {
            _hashCode += this.getFirstSaleDate().hashCode();
        }
        if (this.getFxAccount() != null) {
            _hashCode += this.getFxAccount().hashCode();
        }
        if (this.getFxBalance() != null) {
            _hashCode += this.getFxBalance().hashCode();
        }
        if (this.getFxConsolBalance() != null) {
            _hashCode += this.getFxConsolBalance().hashCode();
        }
        if (this.getFxConsolUnbilledOrders() != null) {
            _hashCode += this.getFxConsolUnbilledOrders().hashCode();
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
        if (this.getGroupPricingLevel() != null) {
            _hashCode += this.getGroupPricingLevel().hashCode();
        }
        if (this.getHasDuplicates() != null) {
            _hashCode += this.getHasDuplicates().hashCode();
        }
        if (this.getImage() != null) {
            _hashCode += this.getImage().hashCode();
        }
        if (this.getInternalId() != null) {
            _hashCode += this.getInternalId().hashCode();
        }
        if (this.getInternalIdNumber() != null) {
            _hashCode += this.getInternalIdNumber().hashCode();
        }
        if (this.getIsBudgetApproved() != null) {
            _hashCode += this.getIsBudgetApproved().hashCode();
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
        if (this.getIsPerson() != null) {
            _hashCode += this.getIsPerson().hashCode();
        }
        if (this.getIsReportedLead() != null) {
            _hashCode += this.getIsReportedLead().hashCode();
        }
        if (this.getIsShipAddress() != null) {
            _hashCode += this.getIsShipAddress().hashCode();
        }
        if (this.getItemPricingLevel() != null) {
            _hashCode += this.getItemPricingLevel().hashCode();
        }
        if (this.getItemPricingUnitPrice() != null) {
            _hashCode += this.getItemPricingUnitPrice().hashCode();
        }
        if (this.getItemsBought() != null) {
            _hashCode += this.getItemsBought().hashCode();
        }
        if (this.getItemsOrdered() != null) {
            _hashCode += this.getItemsOrdered().hashCode();
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
        if (this.getLastOrderDate() != null) {
            _hashCode += this.getLastOrderDate().hashCode();
        }
        if (this.getLastSaleDate() != null) {
            _hashCode += this.getLastSaleDate().hashCode();
        }
        if (this.getLeadDate() != null) {
            _hashCode += this.getLeadDate().hashCode();
        }
        if (this.getLeadSource() != null) {
            _hashCode += this.getLeadSource().hashCode();
        }
        if (this.getLevel() != null) {
            _hashCode += this.getLevel().hashCode();
        }
        if (this.getLocationBought() != null) {
            _hashCode += this.getLocationBought().hashCode();
        }
        if (this.getManualCreditHold() != null) {
            _hashCode += this.getManualCreditHold().hashCode();
        }
        if (this.getMerchantAccount() != null) {
            _hashCode += this.getMerchantAccount().hashCode();
        }
        if (this.getMiddleName() != null) {
            _hashCode += this.getMiddleName().hashCode();
        }
        if (this.getMonthlyClosing() != null) {
            _hashCode += this.getMonthlyClosing().hashCode();
        }
        if (this.getOnCreditHold() != null) {
            _hashCode += this.getOnCreditHold().hashCode();
        }
        if (this.getOrderedAmount() != null) {
            _hashCode += this.getOrderedAmount().hashCode();
        }
        if (this.getOrderedDate() != null) {
            _hashCode += this.getOrderedDate().hashCode();
        }
        if (this.getOtherRelationships() != null) {
            _hashCode += this.getOtherRelationships().hashCode();
        }
        if (this.getOverdueBalance() != null) {
            _hashCode += this.getOverdueBalance().hashCode();
        }
        if (this.getParent() != null) {
            _hashCode += this.getParent().hashCode();
        }
        if (this.getParentItemsBought() != null) {
            _hashCode += this.getParentItemsBought().hashCode();
        }
        if (this.getParentItemsOrdered() != null) {
            _hashCode += this.getParentItemsOrdered().hashCode();
        }
        if (this.getPartner() != null) {
            _hashCode += this.getPartner().hashCode();
        }
        if (this.getPartnerContribution() != null) {
            _hashCode += this.getPartnerContribution().hashCode();
        }
        if (this.getPartnerRole() != null) {
            _hashCode += this.getPartnerRole().hashCode();
        }
        if (this.getPartnerTeamMember() != null) {
            _hashCode += this.getPartnerTeamMember().hashCode();
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
        if (this.getPriceLevel() != null) {
            _hashCode += this.getPriceLevel().hashCode();
        }
        if (this.getPricingGroup() != null) {
            _hashCode += this.getPricingGroup().hashCode();
        }
        if (this.getPricingItem() != null) {
            _hashCode += this.getPricingItem().hashCode();
        }
        if (this.getPrintTransactions() != null) {
            _hashCode += this.getPrintTransactions().hashCode();
        }
        if (this.getProspectDate() != null) {
            _hashCode += this.getProspectDate().hashCode();
        }
        if (this.getPstExempt() != null) {
            _hashCode += this.getPstExempt().hashCode();
        }
        if (this.getReceivablesAccount() != null) {
            _hashCode += this.getReceivablesAccount().hashCode();
        }
        if (this.getReminderDate() != null) {
            _hashCode += this.getReminderDate().hashCode();
        }
        if (this.getResaleNumber() != null) {
            _hashCode += this.getResaleNumber().hashCode();
        }
        if (this.getRole() != null) {
            _hashCode += this.getRole().hashCode();
        }
        if (this.getSalesReadiness() != null) {
            _hashCode += this.getSalesReadiness().hashCode();
        }
        if (this.getSalesRep() != null) {
            _hashCode += this.getSalesRep().hashCode();
        }
        if (this.getSalesTeamMember() != null) {
            _hashCode += this.getSalesTeamMember().hashCode();
        }
        if (this.getSalesTeamRole() != null) {
            _hashCode += this.getSalesTeamRole().hashCode();
        }
        if (this.getSalutation() != null) {
            _hashCode += this.getSalutation().hashCode();
        }
        if (this.getShipAddress() != null) {
            _hashCode += this.getShipAddress().hashCode();
        }
        if (this.getShipComplete() != null) {
            _hashCode += this.getShipComplete().hashCode();
        }
        if (this.getShippingItem() != null) {
            _hashCode += this.getShippingItem().hashCode();
        }
        if (this.getSourceSite() != null) {
            _hashCode += this.getSourceSite().hashCode();
        }
        if (this.getSourceSiteId() != null) {
            _hashCode += this.getSourceSiteId().hashCode();
        }
        if (this.getStage() != null) {
            _hashCode += this.getStage().hashCode();
        }
        if (this.getStartDate() != null) {
            _hashCode += this.getStartDate().hashCode();
        }
        if (this.getState() != null) {
            _hashCode += this.getState().hashCode();
        }
        if (this.getSubsidBought() != null) {
            _hashCode += this.getSubsidBought().hashCode();
        }
        if (this.getSubsidiary() != null) {
            _hashCode += this.getSubsidiary().hashCode();
        }
        if (this.getTaxable() != null) {
            _hashCode += this.getTaxable().hashCode();
        }
        if (this.getTerms() != null) {
            _hashCode += this.getTerms().hashCode();
        }
        if (this.getTerritory() != null) {
            _hashCode += this.getTerritory().hashCode();
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
        if (this.getWebLead() != null) {
            _hashCode += this.getWebLead().hashCode();
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "CustomerSearchBasic"));
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
        elemField.setFieldName("assignedSite");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "assignedSite"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("assignedSiteId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "assignedSiteId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("availableOffline");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "availableOffline"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("boughtAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "boughtAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("boughtDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "boughtDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("buyingReason");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "buyingReason"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("buyingTimeFrame");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "buyingTimeFrame"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("ccCustomerCode");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ccCustomerCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ccDefault");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ccDefault"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ccExpDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ccExpDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ccHolderName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ccHolderName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ccNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ccNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ccState");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ccState"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ccStateFrom");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ccStateFrom"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ccType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ccType"));
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
        elemField.setFieldName("classBought");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "classBought"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("companyName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "companyName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("consolBalance");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "consolBalance"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("consolDaysOverdue");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "consolDaysOverdue"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("consolDepositBalance");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "consolDepositBalance"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("consolOverdueBalance");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "consolOverdueBalance"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("consolUnbilledOrders");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "consolUnbilledOrders"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
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
        elemField.setFieldName("contribution");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "contribution"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("conversionDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "conversionDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
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
        elemField.setFieldName("creditHold");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "creditHold"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("creditHoldOverride");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "creditHoldOverride"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("custStage");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "custStage"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("custStatus");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "custStatus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("dateClosed");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "dateClosed"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
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
        elemField.setFieldName("daysOverdue");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "daysOverdue"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("defaultAllocationStrategy");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "defaultAllocationStrategy"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("defaultOrderPriority");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "defaultOrderPriority"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
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
        elemField.setFieldName("depositBalance");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "depositBalance"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("deptBought");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "deptBought"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("drAccount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "drAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("endDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "endDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
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
        elemField.setFieldName("entityStatus");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "entityStatus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("estimatedBudget");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "estimatedBudget"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("explicitConversion");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "explicitConversion"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("firstOrderDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "firstOrderDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("firstSaleDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "firstSaleDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fxAccount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fxAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("fxConsolBalance");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fxConsolBalance"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fxConsolUnbilledOrders");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fxConsolUnbilledOrders"));
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
        elemField.setFieldName("groupPricingLevel");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "groupPricingLevel"));
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
        elemField.setFieldName("isBudgetApproved");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isBudgetApproved"));
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
        elemField.setFieldName("isPerson");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isPerson"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isReportedLead");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isReportedLead"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isShipAddress");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isShipAddress"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemPricingLevel");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "itemPricingLevel"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemPricingUnitPrice");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "itemPricingUnitPrice"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemsBought");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "itemsBought"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemsOrdered");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "itemsOrdered"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("lastOrderDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lastOrderDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastSaleDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lastSaleDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("leadDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "leadDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("leadSource");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "leadSource"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("locationBought");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationBought"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("manualCreditHold");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "manualCreditHold"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("merchantAccount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "merchantAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("monthlyClosing");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "monthlyClosing"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("onCreditHold");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "onCreditHold"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("orderedAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "orderedAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("orderedDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "orderedDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
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
        elemField.setFieldName("overdueBalance");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "overdueBalance"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "parent"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("parentItemsBought");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "parentItemsBought"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("parentItemsOrdered");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "parentItemsOrdered"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("partner");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "partner"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("partnerContribution");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "partnerContribution"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("partnerRole");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "partnerRole"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("partnerTeamMember");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "partnerTeamMember"));
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
        elemField.setFieldName("priceLevel");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "priceLevel"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("pricingGroup");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "pricingGroup"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("pricingItem");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "pricingItem"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("prospectDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "prospectDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("pstExempt");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "pstExempt"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("receivablesAccount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "receivablesAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("reminderDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "reminderDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("resaleNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "resaleNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("role");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "role"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("salesReadiness");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "salesReadiness"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("salesRep");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "salesRep"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("salesTeamMember");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "salesTeamMember"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("salesTeamRole");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "salesTeamRole"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("shipComplete");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipComplete"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shippingItem");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shippingItem"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("sourceSite");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "sourceSite"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("sourceSiteId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "sourceSiteId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("stage");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "stage"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
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
        elemField.setFieldName("subsidBought");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "subsidBought"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("taxable");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "taxable"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("terms");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "terms"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("territory");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "territory"));
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
        elemField.setFieldName("webLead");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "webLead"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
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

