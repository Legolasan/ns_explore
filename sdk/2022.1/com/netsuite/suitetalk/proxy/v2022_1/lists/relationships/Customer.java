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
package com.netsuite.suitetalk.proxy.v2022_1.lists.relationships;

import com.netsuite.suitetalk.proxy.v2022_1.lists.relationships.ContactAccessRolesList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.relationships.CustomerAddressbookList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.relationships.CustomerCreditCardsList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.relationships.CustomerCurrencyList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.relationships.CustomerDownloadList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.relationships.CustomerGroupPricingList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.relationships.CustomerItemPricingList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.relationships.CustomerPartnersList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.relationships.CustomerSalesTeamList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.relationships.CustomerTaxRegistrationList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.relationships.SubscriptionsList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.relationships.types.CustomerCreditHoldOverride;
import com.netsuite.suitetalk.proxy.v2022_1.lists.relationships.types.CustomerMonthlyClosing;
import com.netsuite.suitetalk.proxy.v2022_1.lists.relationships.types.CustomerNegativeNumberFormat;
import com.netsuite.suitetalk.proxy.v2022_1.lists.relationships.types.CustomerNumberFormat;
import com.netsuite.suitetalk.proxy.v2022_1.lists.relationships.types.CustomerStage;
import com.netsuite.suitetalk.proxy.v2022_1.lists.relationships.types.CustomerThirdPartyCarrier;
import com.netsuite.suitetalk.proxy.v2022_1.lists.relationships.types.EmailPreference;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.types.AlcoholRecipientType;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.types.Country;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.types.CurrencySymbolPlacement;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.types.GlobalSubscriptionStatus;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.types.Language;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.CustomFieldList;
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

public class Customer
extends Record
implements Serializable {
    private RecordRef customForm;
    private String entityId;
    private String altName;
    private Boolean isPerson;
    private String phoneticName;
    private String salutation;
    private String firstName;
    private String middleName;
    private String lastName;
    private String companyName;
    private RecordRef entityStatus;
    private RecordRef parent;
    private String phone;
    private String fax;
    private String email;
    private String url;
    private String defaultAddress;
    private Boolean isInactive;
    private RecordRef category;
    private String title;
    private String printOnCheckAs;
    private String altPhone;
    private String homePhone;
    private String mobilePhone;
    private String altEmail;
    private Language language;
    private String comments;
    private CustomerNumberFormat numberFormat;
    private CustomerNegativeNumberFormat negativeNumberFormat;
    private Calendar dateCreated;
    private RecordRef image;
    private EmailPreference emailPreference;
    private RecordRef subsidiary;
    private RecordRef representingSubsidiary;
    private RecordRef salesRep;
    private RecordRef territory;
    private String contribPct;
    private RecordRef partner;
    private RecordRef salesGroup;
    private String vatRegNumber;
    private String accountNumber;
    private Boolean taxExempt;
    private RecordRef terms;
    private Double creditLimit;
    private CustomerCreditHoldOverride creditHoldOverride;
    private CustomerMonthlyClosing monthlyClosing;
    private Boolean overrideCurrencyFormat;
    private String displaySymbol;
    private CurrencySymbolPlacement symbolPlacement;
    private Double balance;
    private Double overdueBalance;
    private Long daysOverdue;
    private Double unbilledOrders;
    private Double consolUnbilledOrders;
    private Double consolOverdueBalance;
    private Double consolDepositBalance;
    private Double consolBalance;
    private Double consolAging;
    private Double consolAging1;
    private Double consolAging2;
    private Double consolAging3;
    private Double consolAging4;
    private Long consolDaysOverdue;
    private RecordRef priceLevel;
    private RecordRef currency;
    private RecordRef prefCCProcessor;
    private Double depositBalance;
    private Boolean shipComplete;
    private Boolean taxable;
    private RecordRef taxItem;
    private String resaleNumber;
    private Double aging;
    private Double aging1;
    private Double aging2;
    private Double aging3;
    private Double aging4;
    private Calendar startDate;
    private AlcoholRecipientType alcoholRecipientType;
    private Calendar endDate;
    private Long reminderDays;
    private RecordRef shippingItem;
    private String thirdPartyAcct;
    private String thirdPartyZipcode;
    private Country thirdPartyCountry;
    private CustomerThirdPartyCarrier thirdPartyCarrier;
    private Boolean giveAccess;
    private Double estimatedBudget;
    private RecordRef accessRole;
    private Boolean sendEmail;
    private RecordRef assignedWebSite;
    private String password;
    private String password2;
    private Boolean requirePwdChange;
    private RecordRef campaignCategory;
    private RecordRef sourceWebSite;
    private RecordRef leadSource;
    private RecordRef receivablesAccount;
    private RecordRef drAccount;
    private RecordRef fxAccount;
    private Double defaultOrderPriority;
    private String webLead;
    private String referrer;
    private String keywords;
    private String clickStream;
    private String lastPageVisited;
    private Long visits;
    private Calendar firstVisit;
    private Calendar lastVisit;
    private Boolean billPay;
    private Double openingBalance;
    private Calendar lastModifiedDate;
    private Calendar openingBalanceDate;
    private RecordRef openingBalanceAccount;
    private CustomerStage stage;
    private Boolean emailTransactions;
    private Boolean printTransactions;
    private Boolean faxTransactions;
    private RecordRef defaultTaxReg;
    private Boolean syncPartnerTeams;
    private Boolean isBudgetApproved;
    private GlobalSubscriptionStatus globalSubscriptionStatus;
    private RecordRef salesReadiness;
    private CustomerSalesTeamList salesTeamList;
    private RecordRef buyingReason;
    private CustomerDownloadList downloadList;
    private RecordRef buyingTimeFrame;
    private CustomerAddressbookList addressbookList;
    private SubscriptionsList subscriptionsList;
    private ContactAccessRolesList contactRolesList;
    private CustomerCurrencyList currencyList;
    private CustomerCreditCardsList creditCardsList;
    private CustomerPartnersList partnersList;
    private CustomerGroupPricingList groupPricingList;
    private CustomerItemPricingList itemPricingList;
    private CustomerTaxRegistrationList taxRegistrationList;
    private RecordRef defaultAllocationStrategy;
    private CustomFieldList customFieldList;
    private String internalId;
    private String externalId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(Customer.class, true);

    public Customer() {
    }

    public Customer(NullField nullFieldList, String internalId, String externalId, RecordRef customForm, String entityId, String altName, Boolean isPerson, String phoneticName, String salutation, String firstName, String middleName, String lastName, String companyName, RecordRef entityStatus, RecordRef parent, String phone, String fax, String email, String url, String defaultAddress, Boolean isInactive, RecordRef category, String title, String printOnCheckAs, String altPhone, String homePhone, String mobilePhone, String altEmail, Language language, String comments, CustomerNumberFormat numberFormat, CustomerNegativeNumberFormat negativeNumberFormat, Calendar dateCreated, RecordRef image, EmailPreference emailPreference, RecordRef subsidiary, RecordRef representingSubsidiary, RecordRef salesRep, RecordRef territory, String contribPct, RecordRef partner, RecordRef salesGroup, String vatRegNumber, String accountNumber, Boolean taxExempt, RecordRef terms, Double creditLimit, CustomerCreditHoldOverride creditHoldOverride, CustomerMonthlyClosing monthlyClosing, Boolean overrideCurrencyFormat, String displaySymbol, CurrencySymbolPlacement symbolPlacement, Double balance, Double overdueBalance, Long daysOverdue, Double unbilledOrders, Double consolUnbilledOrders, Double consolOverdueBalance, Double consolDepositBalance, Double consolBalance, Double consolAging, Double consolAging1, Double consolAging2, Double consolAging3, Double consolAging4, Long consolDaysOverdue, RecordRef priceLevel, RecordRef currency, RecordRef prefCCProcessor, Double depositBalance, Boolean shipComplete, Boolean taxable, RecordRef taxItem, String resaleNumber, Double aging, Double aging1, Double aging2, Double aging3, Double aging4, Calendar startDate, AlcoholRecipientType alcoholRecipientType, Calendar endDate, Long reminderDays, RecordRef shippingItem, String thirdPartyAcct, String thirdPartyZipcode, Country thirdPartyCountry, CustomerThirdPartyCarrier thirdPartyCarrier, Boolean giveAccess, Double estimatedBudget, RecordRef accessRole, Boolean sendEmail, RecordRef assignedWebSite, String password, String password2, Boolean requirePwdChange, RecordRef campaignCategory, RecordRef sourceWebSite, RecordRef leadSource, RecordRef receivablesAccount, RecordRef drAccount, RecordRef fxAccount, Double defaultOrderPriority, String webLead, String referrer, String keywords, String clickStream, String lastPageVisited, Long visits, Calendar firstVisit, Calendar lastVisit, Boolean billPay, Double openingBalance, Calendar lastModifiedDate, Calendar openingBalanceDate, RecordRef openingBalanceAccount, CustomerStage stage, Boolean emailTransactions, Boolean printTransactions, Boolean faxTransactions, RecordRef defaultTaxReg, Boolean syncPartnerTeams, Boolean isBudgetApproved, GlobalSubscriptionStatus globalSubscriptionStatus, RecordRef salesReadiness, CustomerSalesTeamList salesTeamList, RecordRef buyingReason, CustomerDownloadList downloadList, RecordRef buyingTimeFrame, CustomerAddressbookList addressbookList, SubscriptionsList subscriptionsList, ContactAccessRolesList contactRolesList, CustomerCurrencyList currencyList, CustomerCreditCardsList creditCardsList, CustomerPartnersList partnersList, CustomerGroupPricingList groupPricingList, CustomerItemPricingList itemPricingList, CustomerTaxRegistrationList taxRegistrationList, RecordRef defaultAllocationStrategy, CustomFieldList customFieldList) {
        super(nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.customForm = customForm;
        this.entityId = entityId;
        this.altName = altName;
        this.isPerson = isPerson;
        this.phoneticName = phoneticName;
        this.salutation = salutation;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.companyName = companyName;
        this.entityStatus = entityStatus;
        this.parent = parent;
        this.phone = phone;
        this.fax = fax;
        this.email = email;
        this.url = url;
        this.defaultAddress = defaultAddress;
        this.isInactive = isInactive;
        this.category = category;
        this.title = title;
        this.printOnCheckAs = printOnCheckAs;
        this.altPhone = altPhone;
        this.homePhone = homePhone;
        this.mobilePhone = mobilePhone;
        this.altEmail = altEmail;
        this.language = language;
        this.comments = comments;
        this.numberFormat = numberFormat;
        this.negativeNumberFormat = negativeNumberFormat;
        this.dateCreated = dateCreated;
        this.image = image;
        this.emailPreference = emailPreference;
        this.subsidiary = subsidiary;
        this.representingSubsidiary = representingSubsidiary;
        this.salesRep = salesRep;
        this.territory = territory;
        this.contribPct = contribPct;
        this.partner = partner;
        this.salesGroup = salesGroup;
        this.vatRegNumber = vatRegNumber;
        this.accountNumber = accountNumber;
        this.taxExempt = taxExempt;
        this.terms = terms;
        this.creditLimit = creditLimit;
        this.creditHoldOverride = creditHoldOverride;
        this.monthlyClosing = monthlyClosing;
        this.overrideCurrencyFormat = overrideCurrencyFormat;
        this.displaySymbol = displaySymbol;
        this.symbolPlacement = symbolPlacement;
        this.balance = balance;
        this.overdueBalance = overdueBalance;
        this.daysOverdue = daysOverdue;
        this.unbilledOrders = unbilledOrders;
        this.consolUnbilledOrders = consolUnbilledOrders;
        this.consolOverdueBalance = consolOverdueBalance;
        this.consolDepositBalance = consolDepositBalance;
        this.consolBalance = consolBalance;
        this.consolAging = consolAging;
        this.consolAging1 = consolAging1;
        this.consolAging2 = consolAging2;
        this.consolAging3 = consolAging3;
        this.consolAging4 = consolAging4;
        this.consolDaysOverdue = consolDaysOverdue;
        this.priceLevel = priceLevel;
        this.currency = currency;
        this.prefCCProcessor = prefCCProcessor;
        this.depositBalance = depositBalance;
        this.shipComplete = shipComplete;
        this.taxable = taxable;
        this.taxItem = taxItem;
        this.resaleNumber = resaleNumber;
        this.aging = aging;
        this.aging1 = aging1;
        this.aging2 = aging2;
        this.aging3 = aging3;
        this.aging4 = aging4;
        this.startDate = startDate;
        this.alcoholRecipientType = alcoholRecipientType;
        this.endDate = endDate;
        this.reminderDays = reminderDays;
        this.shippingItem = shippingItem;
        this.thirdPartyAcct = thirdPartyAcct;
        this.thirdPartyZipcode = thirdPartyZipcode;
        this.thirdPartyCountry = thirdPartyCountry;
        this.thirdPartyCarrier = thirdPartyCarrier;
        this.giveAccess = giveAccess;
        this.estimatedBudget = estimatedBudget;
        this.accessRole = accessRole;
        this.sendEmail = sendEmail;
        this.assignedWebSite = assignedWebSite;
        this.password = password;
        this.password2 = password2;
        this.requirePwdChange = requirePwdChange;
        this.campaignCategory = campaignCategory;
        this.sourceWebSite = sourceWebSite;
        this.leadSource = leadSource;
        this.receivablesAccount = receivablesAccount;
        this.drAccount = drAccount;
        this.fxAccount = fxAccount;
        this.defaultOrderPriority = defaultOrderPriority;
        this.webLead = webLead;
        this.referrer = referrer;
        this.keywords = keywords;
        this.clickStream = clickStream;
        this.lastPageVisited = lastPageVisited;
        this.visits = visits;
        this.firstVisit = firstVisit;
        this.lastVisit = lastVisit;
        this.billPay = billPay;
        this.openingBalance = openingBalance;
        this.lastModifiedDate = lastModifiedDate;
        this.openingBalanceDate = openingBalanceDate;
        this.openingBalanceAccount = openingBalanceAccount;
        this.stage = stage;
        this.emailTransactions = emailTransactions;
        this.printTransactions = printTransactions;
        this.faxTransactions = faxTransactions;
        this.defaultTaxReg = defaultTaxReg;
        this.syncPartnerTeams = syncPartnerTeams;
        this.isBudgetApproved = isBudgetApproved;
        this.globalSubscriptionStatus = globalSubscriptionStatus;
        this.salesReadiness = salesReadiness;
        this.salesTeamList = salesTeamList;
        this.buyingReason = buyingReason;
        this.downloadList = downloadList;
        this.buyingTimeFrame = buyingTimeFrame;
        this.addressbookList = addressbookList;
        this.subscriptionsList = subscriptionsList;
        this.contactRolesList = contactRolesList;
        this.currencyList = currencyList;
        this.creditCardsList = creditCardsList;
        this.partnersList = partnersList;
        this.groupPricingList = groupPricingList;
        this.itemPricingList = itemPricingList;
        this.taxRegistrationList = taxRegistrationList;
        this.defaultAllocationStrategy = defaultAllocationStrategy;
        this.customFieldList = customFieldList;
    }

    public RecordRef getCustomForm() {
        return this.customForm;
    }

    public void setCustomForm(RecordRef customForm) {
        this.customForm = customForm;
    }

    public String getEntityId() {
        return this.entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public String getAltName() {
        return this.altName;
    }

    public void setAltName(String altName) {
        this.altName = altName;
    }

    public Boolean getIsPerson() {
        return this.isPerson;
    }

    public void setIsPerson(Boolean isPerson) {
        this.isPerson = isPerson;
    }

    public String getPhoneticName() {
        return this.phoneticName;
    }

    public void setPhoneticName(String phoneticName) {
        this.phoneticName = phoneticName;
    }

    public String getSalutation() {
        return this.salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public RecordRef getEntityStatus() {
        return this.entityStatus;
    }

    public void setEntityStatus(RecordRef entityStatus) {
        this.entityStatus = entityStatus;
    }

    public RecordRef getParent() {
        return this.parent;
    }

    public void setParent(RecordRef parent) {
        this.parent = parent;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return this.fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDefaultAddress() {
        return this.defaultAddress;
    }

    public void setDefaultAddress(String defaultAddress) {
        this.defaultAddress = defaultAddress;
    }

    public Boolean getIsInactive() {
        return this.isInactive;
    }

    public void setIsInactive(Boolean isInactive) {
        this.isInactive = isInactive;
    }

    public RecordRef getCategory() {
        return this.category;
    }

    public void setCategory(RecordRef category) {
        this.category = category;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrintOnCheckAs() {
        return this.printOnCheckAs;
    }

    public void setPrintOnCheckAs(String printOnCheckAs) {
        this.printOnCheckAs = printOnCheckAs;
    }

    public String getAltPhone() {
        return this.altPhone;
    }

    public void setAltPhone(String altPhone) {
        this.altPhone = altPhone;
    }

    public String getHomePhone() {
        return this.homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getMobilePhone() {
        return this.mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getAltEmail() {
        return this.altEmail;
    }

    public void setAltEmail(String altEmail) {
        this.altEmail = altEmail;
    }

    public Language getLanguage() {
        return this.language;
    }

    public void setLanguage(Language language) {
        this.language = language;
    }

    public String getComments() {
        return this.comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public CustomerNumberFormat getNumberFormat() {
        return this.numberFormat;
    }

    public void setNumberFormat(CustomerNumberFormat numberFormat) {
        this.numberFormat = numberFormat;
    }

    public CustomerNegativeNumberFormat getNegativeNumberFormat() {
        return this.negativeNumberFormat;
    }

    public void setNegativeNumberFormat(CustomerNegativeNumberFormat negativeNumberFormat) {
        this.negativeNumberFormat = negativeNumberFormat;
    }

    public Calendar getDateCreated() {
        return this.dateCreated;
    }

    public void setDateCreated(Calendar dateCreated) {
        this.dateCreated = dateCreated;
    }

    public RecordRef getImage() {
        return this.image;
    }

    public void setImage(RecordRef image) {
        this.image = image;
    }

    public EmailPreference getEmailPreference() {
        return this.emailPreference;
    }

    public void setEmailPreference(EmailPreference emailPreference) {
        this.emailPreference = emailPreference;
    }

    public RecordRef getSubsidiary() {
        return this.subsidiary;
    }

    public void setSubsidiary(RecordRef subsidiary) {
        this.subsidiary = subsidiary;
    }

    public RecordRef getRepresentingSubsidiary() {
        return this.representingSubsidiary;
    }

    public void setRepresentingSubsidiary(RecordRef representingSubsidiary) {
        this.representingSubsidiary = representingSubsidiary;
    }

    public RecordRef getSalesRep() {
        return this.salesRep;
    }

    public void setSalesRep(RecordRef salesRep) {
        this.salesRep = salesRep;
    }

    public RecordRef getTerritory() {
        return this.territory;
    }

    public void setTerritory(RecordRef territory) {
        this.territory = territory;
    }

    public String getContribPct() {
        return this.contribPct;
    }

    public void setContribPct(String contribPct) {
        this.contribPct = contribPct;
    }

    public RecordRef getPartner() {
        return this.partner;
    }

    public void setPartner(RecordRef partner) {
        this.partner = partner;
    }

    public RecordRef getSalesGroup() {
        return this.salesGroup;
    }

    public void setSalesGroup(RecordRef salesGroup) {
        this.salesGroup = salesGroup;
    }

    public String getVatRegNumber() {
        return this.vatRegNumber;
    }

    public void setVatRegNumber(String vatRegNumber) {
        this.vatRegNumber = vatRegNumber;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Boolean getTaxExempt() {
        return this.taxExempt;
    }

    public void setTaxExempt(Boolean taxExempt) {
        this.taxExempt = taxExempt;
    }

    public RecordRef getTerms() {
        return this.terms;
    }

    public void setTerms(RecordRef terms) {
        this.terms = terms;
    }

    public Double getCreditLimit() {
        return this.creditLimit;
    }

    public void setCreditLimit(Double creditLimit) {
        this.creditLimit = creditLimit;
    }

    public CustomerCreditHoldOverride getCreditHoldOverride() {
        return this.creditHoldOverride;
    }

    public void setCreditHoldOverride(CustomerCreditHoldOverride creditHoldOverride) {
        this.creditHoldOverride = creditHoldOverride;
    }

    public CustomerMonthlyClosing getMonthlyClosing() {
        return this.monthlyClosing;
    }

    public void setMonthlyClosing(CustomerMonthlyClosing monthlyClosing) {
        this.monthlyClosing = monthlyClosing;
    }

    public Boolean getOverrideCurrencyFormat() {
        return this.overrideCurrencyFormat;
    }

    public void setOverrideCurrencyFormat(Boolean overrideCurrencyFormat) {
        this.overrideCurrencyFormat = overrideCurrencyFormat;
    }

    public String getDisplaySymbol() {
        return this.displaySymbol;
    }

    public void setDisplaySymbol(String displaySymbol) {
        this.displaySymbol = displaySymbol;
    }

    public CurrencySymbolPlacement getSymbolPlacement() {
        return this.symbolPlacement;
    }

    public void setSymbolPlacement(CurrencySymbolPlacement symbolPlacement) {
        this.symbolPlacement = symbolPlacement;
    }

    public Double getBalance() {
        return this.balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getOverdueBalance() {
        return this.overdueBalance;
    }

    public void setOverdueBalance(Double overdueBalance) {
        this.overdueBalance = overdueBalance;
    }

    public Long getDaysOverdue() {
        return this.daysOverdue;
    }

    public void setDaysOverdue(Long daysOverdue) {
        this.daysOverdue = daysOverdue;
    }

    public Double getUnbilledOrders() {
        return this.unbilledOrders;
    }

    public void setUnbilledOrders(Double unbilledOrders) {
        this.unbilledOrders = unbilledOrders;
    }

    public Double getConsolUnbilledOrders() {
        return this.consolUnbilledOrders;
    }

    public void setConsolUnbilledOrders(Double consolUnbilledOrders) {
        this.consolUnbilledOrders = consolUnbilledOrders;
    }

    public Double getConsolOverdueBalance() {
        return this.consolOverdueBalance;
    }

    public void setConsolOverdueBalance(Double consolOverdueBalance) {
        this.consolOverdueBalance = consolOverdueBalance;
    }

    public Double getConsolDepositBalance() {
        return this.consolDepositBalance;
    }

    public void setConsolDepositBalance(Double consolDepositBalance) {
        this.consolDepositBalance = consolDepositBalance;
    }

    public Double getConsolBalance() {
        return this.consolBalance;
    }

    public void setConsolBalance(Double consolBalance) {
        this.consolBalance = consolBalance;
    }

    public Double getConsolAging() {
        return this.consolAging;
    }

    public void setConsolAging(Double consolAging) {
        this.consolAging = consolAging;
    }

    public Double getConsolAging1() {
        return this.consolAging1;
    }

    public void setConsolAging1(Double consolAging1) {
        this.consolAging1 = consolAging1;
    }

    public Double getConsolAging2() {
        return this.consolAging2;
    }

    public void setConsolAging2(Double consolAging2) {
        this.consolAging2 = consolAging2;
    }

    public Double getConsolAging3() {
        return this.consolAging3;
    }

    public void setConsolAging3(Double consolAging3) {
        this.consolAging3 = consolAging3;
    }

    public Double getConsolAging4() {
        return this.consolAging4;
    }

    public void setConsolAging4(Double consolAging4) {
        this.consolAging4 = consolAging4;
    }

    public Long getConsolDaysOverdue() {
        return this.consolDaysOverdue;
    }

    public void setConsolDaysOverdue(Long consolDaysOverdue) {
        this.consolDaysOverdue = consolDaysOverdue;
    }

    public RecordRef getPriceLevel() {
        return this.priceLevel;
    }

    public void setPriceLevel(RecordRef priceLevel) {
        this.priceLevel = priceLevel;
    }

    public RecordRef getCurrency() {
        return this.currency;
    }

    public void setCurrency(RecordRef currency) {
        this.currency = currency;
    }

    public RecordRef getPrefCCProcessor() {
        return this.prefCCProcessor;
    }

    public void setPrefCCProcessor(RecordRef prefCCProcessor) {
        this.prefCCProcessor = prefCCProcessor;
    }

    public Double getDepositBalance() {
        return this.depositBalance;
    }

    public void setDepositBalance(Double depositBalance) {
        this.depositBalance = depositBalance;
    }

    public Boolean getShipComplete() {
        return this.shipComplete;
    }

    public void setShipComplete(Boolean shipComplete) {
        this.shipComplete = shipComplete;
    }

    public Boolean getTaxable() {
        return this.taxable;
    }

    public void setTaxable(Boolean taxable) {
        this.taxable = taxable;
    }

    public RecordRef getTaxItem() {
        return this.taxItem;
    }

    public void setTaxItem(RecordRef taxItem) {
        this.taxItem = taxItem;
    }

    public String getResaleNumber() {
        return this.resaleNumber;
    }

    public void setResaleNumber(String resaleNumber) {
        this.resaleNumber = resaleNumber;
    }

    public Double getAging() {
        return this.aging;
    }

    public void setAging(Double aging) {
        this.aging = aging;
    }

    public Double getAging1() {
        return this.aging1;
    }

    public void setAging1(Double aging1) {
        this.aging1 = aging1;
    }

    public Double getAging2() {
        return this.aging2;
    }

    public void setAging2(Double aging2) {
        this.aging2 = aging2;
    }

    public Double getAging3() {
        return this.aging3;
    }

    public void setAging3(Double aging3) {
        this.aging3 = aging3;
    }

    public Double getAging4() {
        return this.aging4;
    }

    public void setAging4(Double aging4) {
        this.aging4 = aging4;
    }

    public Calendar getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Calendar startDate) {
        this.startDate = startDate;
    }

    public AlcoholRecipientType getAlcoholRecipientType() {
        return this.alcoholRecipientType;
    }

    public void setAlcoholRecipientType(AlcoholRecipientType alcoholRecipientType) {
        this.alcoholRecipientType = alcoholRecipientType;
    }

    public Calendar getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Calendar endDate) {
        this.endDate = endDate;
    }

    public Long getReminderDays() {
        return this.reminderDays;
    }

    public void setReminderDays(Long reminderDays) {
        this.reminderDays = reminderDays;
    }

    public RecordRef getShippingItem() {
        return this.shippingItem;
    }

    public void setShippingItem(RecordRef shippingItem) {
        this.shippingItem = shippingItem;
    }

    public String getThirdPartyAcct() {
        return this.thirdPartyAcct;
    }

    public void setThirdPartyAcct(String thirdPartyAcct) {
        this.thirdPartyAcct = thirdPartyAcct;
    }

    public String getThirdPartyZipcode() {
        return this.thirdPartyZipcode;
    }

    public void setThirdPartyZipcode(String thirdPartyZipcode) {
        this.thirdPartyZipcode = thirdPartyZipcode;
    }

    public Country getThirdPartyCountry() {
        return this.thirdPartyCountry;
    }

    public void setThirdPartyCountry(Country thirdPartyCountry) {
        this.thirdPartyCountry = thirdPartyCountry;
    }

    public CustomerThirdPartyCarrier getThirdPartyCarrier() {
        return this.thirdPartyCarrier;
    }

    public void setThirdPartyCarrier(CustomerThirdPartyCarrier thirdPartyCarrier) {
        this.thirdPartyCarrier = thirdPartyCarrier;
    }

    public Boolean getGiveAccess() {
        return this.giveAccess;
    }

    public void setGiveAccess(Boolean giveAccess) {
        this.giveAccess = giveAccess;
    }

    public Double getEstimatedBudget() {
        return this.estimatedBudget;
    }

    public void setEstimatedBudget(Double estimatedBudget) {
        this.estimatedBudget = estimatedBudget;
    }

    public RecordRef getAccessRole() {
        return this.accessRole;
    }

    public void setAccessRole(RecordRef accessRole) {
        this.accessRole = accessRole;
    }

    public Boolean getSendEmail() {
        return this.sendEmail;
    }

    public void setSendEmail(Boolean sendEmail) {
        this.sendEmail = sendEmail;
    }

    public RecordRef getAssignedWebSite() {
        return this.assignedWebSite;
    }

    public void setAssignedWebSite(RecordRef assignedWebSite) {
        this.assignedWebSite = assignedWebSite;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword2() {
        return this.password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    public Boolean getRequirePwdChange() {
        return this.requirePwdChange;
    }

    public void setRequirePwdChange(Boolean requirePwdChange) {
        this.requirePwdChange = requirePwdChange;
    }

    public RecordRef getCampaignCategory() {
        return this.campaignCategory;
    }

    public void setCampaignCategory(RecordRef campaignCategory) {
        this.campaignCategory = campaignCategory;
    }

    public RecordRef getSourceWebSite() {
        return this.sourceWebSite;
    }

    public void setSourceWebSite(RecordRef sourceWebSite) {
        this.sourceWebSite = sourceWebSite;
    }

    public RecordRef getLeadSource() {
        return this.leadSource;
    }

    public void setLeadSource(RecordRef leadSource) {
        this.leadSource = leadSource;
    }

    public RecordRef getReceivablesAccount() {
        return this.receivablesAccount;
    }

    public void setReceivablesAccount(RecordRef receivablesAccount) {
        this.receivablesAccount = receivablesAccount;
    }

    public RecordRef getDrAccount() {
        return this.drAccount;
    }

    public void setDrAccount(RecordRef drAccount) {
        this.drAccount = drAccount;
    }

    public RecordRef getFxAccount() {
        return this.fxAccount;
    }

    public void setFxAccount(RecordRef fxAccount) {
        this.fxAccount = fxAccount;
    }

    public Double getDefaultOrderPriority() {
        return this.defaultOrderPriority;
    }

    public void setDefaultOrderPriority(Double defaultOrderPriority) {
        this.defaultOrderPriority = defaultOrderPriority;
    }

    public String getWebLead() {
        return this.webLead;
    }

    public void setWebLead(String webLead) {
        this.webLead = webLead;
    }

    public String getReferrer() {
        return this.referrer;
    }

    public void setReferrer(String referrer) {
        this.referrer = referrer;
    }

    public String getKeywords() {
        return this.keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public String getClickStream() {
        return this.clickStream;
    }

    public void setClickStream(String clickStream) {
        this.clickStream = clickStream;
    }

    public String getLastPageVisited() {
        return this.lastPageVisited;
    }

    public void setLastPageVisited(String lastPageVisited) {
        this.lastPageVisited = lastPageVisited;
    }

    public Long getVisits() {
        return this.visits;
    }

    public void setVisits(Long visits) {
        this.visits = visits;
    }

    public Calendar getFirstVisit() {
        return this.firstVisit;
    }

    public void setFirstVisit(Calendar firstVisit) {
        this.firstVisit = firstVisit;
    }

    public Calendar getLastVisit() {
        return this.lastVisit;
    }

    public void setLastVisit(Calendar lastVisit) {
        this.lastVisit = lastVisit;
    }

    public Boolean getBillPay() {
        return this.billPay;
    }

    public void setBillPay(Boolean billPay) {
        this.billPay = billPay;
    }

    public Double getOpeningBalance() {
        return this.openingBalance;
    }

    public void setOpeningBalance(Double openingBalance) {
        this.openingBalance = openingBalance;
    }

    public Calendar getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    public void setLastModifiedDate(Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public Calendar getOpeningBalanceDate() {
        return this.openingBalanceDate;
    }

    public void setOpeningBalanceDate(Calendar openingBalanceDate) {
        this.openingBalanceDate = openingBalanceDate;
    }

    public RecordRef getOpeningBalanceAccount() {
        return this.openingBalanceAccount;
    }

    public void setOpeningBalanceAccount(RecordRef openingBalanceAccount) {
        this.openingBalanceAccount = openingBalanceAccount;
    }

    public CustomerStage getStage() {
        return this.stage;
    }

    public void setStage(CustomerStage stage) {
        this.stage = stage;
    }

    public Boolean getEmailTransactions() {
        return this.emailTransactions;
    }

    public void setEmailTransactions(Boolean emailTransactions) {
        this.emailTransactions = emailTransactions;
    }

    public Boolean getPrintTransactions() {
        return this.printTransactions;
    }

    public void setPrintTransactions(Boolean printTransactions) {
        this.printTransactions = printTransactions;
    }

    public Boolean getFaxTransactions() {
        return this.faxTransactions;
    }

    public void setFaxTransactions(Boolean faxTransactions) {
        this.faxTransactions = faxTransactions;
    }

    public RecordRef getDefaultTaxReg() {
        return this.defaultTaxReg;
    }

    public void setDefaultTaxReg(RecordRef defaultTaxReg) {
        this.defaultTaxReg = defaultTaxReg;
    }

    public Boolean getSyncPartnerTeams() {
        return this.syncPartnerTeams;
    }

    public void setSyncPartnerTeams(Boolean syncPartnerTeams) {
        this.syncPartnerTeams = syncPartnerTeams;
    }

    public Boolean getIsBudgetApproved() {
        return this.isBudgetApproved;
    }

    public void setIsBudgetApproved(Boolean isBudgetApproved) {
        this.isBudgetApproved = isBudgetApproved;
    }

    public GlobalSubscriptionStatus getGlobalSubscriptionStatus() {
        return this.globalSubscriptionStatus;
    }

    public void setGlobalSubscriptionStatus(GlobalSubscriptionStatus globalSubscriptionStatus) {
        this.globalSubscriptionStatus = globalSubscriptionStatus;
    }

    public RecordRef getSalesReadiness() {
        return this.salesReadiness;
    }

    public void setSalesReadiness(RecordRef salesReadiness) {
        this.salesReadiness = salesReadiness;
    }

    public CustomerSalesTeamList getSalesTeamList() {
        return this.salesTeamList;
    }

    public void setSalesTeamList(CustomerSalesTeamList salesTeamList) {
        this.salesTeamList = salesTeamList;
    }

    public RecordRef getBuyingReason() {
        return this.buyingReason;
    }

    public void setBuyingReason(RecordRef buyingReason) {
        this.buyingReason = buyingReason;
    }

    public CustomerDownloadList getDownloadList() {
        return this.downloadList;
    }

    public void setDownloadList(CustomerDownloadList downloadList) {
        this.downloadList = downloadList;
    }

    public RecordRef getBuyingTimeFrame() {
        return this.buyingTimeFrame;
    }

    public void setBuyingTimeFrame(RecordRef buyingTimeFrame) {
        this.buyingTimeFrame = buyingTimeFrame;
    }

    public CustomerAddressbookList getAddressbookList() {
        return this.addressbookList;
    }

    public void setAddressbookList(CustomerAddressbookList addressbookList) {
        this.addressbookList = addressbookList;
    }

    public SubscriptionsList getSubscriptionsList() {
        return this.subscriptionsList;
    }

    public void setSubscriptionsList(SubscriptionsList subscriptionsList) {
        this.subscriptionsList = subscriptionsList;
    }

    public ContactAccessRolesList getContactRolesList() {
        return this.contactRolesList;
    }

    public void setContactRolesList(ContactAccessRolesList contactRolesList) {
        this.contactRolesList = contactRolesList;
    }

    public CustomerCurrencyList getCurrencyList() {
        return this.currencyList;
    }

    public void setCurrencyList(CustomerCurrencyList currencyList) {
        this.currencyList = currencyList;
    }

    public CustomerCreditCardsList getCreditCardsList() {
        return this.creditCardsList;
    }

    public void setCreditCardsList(CustomerCreditCardsList creditCardsList) {
        this.creditCardsList = creditCardsList;
    }

    public CustomerPartnersList getPartnersList() {
        return this.partnersList;
    }

    public void setPartnersList(CustomerPartnersList partnersList) {
        this.partnersList = partnersList;
    }

    public CustomerGroupPricingList getGroupPricingList() {
        return this.groupPricingList;
    }

    public void setGroupPricingList(CustomerGroupPricingList groupPricingList) {
        this.groupPricingList = groupPricingList;
    }

    public CustomerItemPricingList getItemPricingList() {
        return this.itemPricingList;
    }

    public void setItemPricingList(CustomerItemPricingList itemPricingList) {
        this.itemPricingList = itemPricingList;
    }

    public CustomerTaxRegistrationList getTaxRegistrationList() {
        return this.taxRegistrationList;
    }

    public void setTaxRegistrationList(CustomerTaxRegistrationList taxRegistrationList) {
        this.taxRegistrationList = taxRegistrationList;
    }

    public RecordRef getDefaultAllocationStrategy() {
        return this.defaultAllocationStrategy;
    }

    public void setDefaultAllocationStrategy(RecordRef defaultAllocationStrategy) {
        this.defaultAllocationStrategy = defaultAllocationStrategy;
    }

    public CustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
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
        if (!(obj instanceof Customer)) {
            return false;
        }
        Customer other = (Customer)obj;
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
        boolean _equals = super.equals(obj) && (this.customForm == null && other.getCustomForm() == null || this.customForm != null && this.customForm.equals(other.getCustomForm())) && (this.entityId == null && other.getEntityId() == null || this.entityId != null && this.entityId.equals(other.getEntityId())) && (this.altName == null && other.getAltName() == null || this.altName != null && this.altName.equals(other.getAltName())) && (this.isPerson == null && other.getIsPerson() == null || this.isPerson != null && this.isPerson.equals(other.getIsPerson())) && (this.phoneticName == null && other.getPhoneticName() == null || this.phoneticName != null && this.phoneticName.equals(other.getPhoneticName())) && (this.salutation == null && other.getSalutation() == null || this.salutation != null && this.salutation.equals(other.getSalutation())) && (this.firstName == null && other.getFirstName() == null || this.firstName != null && this.firstName.equals(other.getFirstName())) && (this.middleName == null && other.getMiddleName() == null || this.middleName != null && this.middleName.equals(other.getMiddleName())) && (this.lastName == null && other.getLastName() == null || this.lastName != null && this.lastName.equals(other.getLastName())) && (this.companyName == null && other.getCompanyName() == null || this.companyName != null && this.companyName.equals(other.getCompanyName())) && (this.entityStatus == null && other.getEntityStatus() == null || this.entityStatus != null && this.entityStatus.equals(other.getEntityStatus())) && (this.parent == null && other.getParent() == null || this.parent != null && this.parent.equals(other.getParent())) && (this.phone == null && other.getPhone() == null || this.phone != null && this.phone.equals(other.getPhone())) && (this.fax == null && other.getFax() == null || this.fax != null && this.fax.equals(other.getFax())) && (this.email == null && other.getEmail() == null || this.email != null && this.email.equals(other.getEmail())) && (this.url == null && other.getUrl() == null || this.url != null && this.url.equals(other.getUrl())) && (this.defaultAddress == null && other.getDefaultAddress() == null || this.defaultAddress != null && this.defaultAddress.equals(other.getDefaultAddress())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && this.isInactive.equals(other.getIsInactive())) && (this.category == null && other.getCategory() == null || this.category != null && this.category.equals(other.getCategory())) && (this.title == null && other.getTitle() == null || this.title != null && this.title.equals(other.getTitle())) && (this.printOnCheckAs == null && other.getPrintOnCheckAs() == null || this.printOnCheckAs != null && this.printOnCheckAs.equals(other.getPrintOnCheckAs())) && (this.altPhone == null && other.getAltPhone() == null || this.altPhone != null && this.altPhone.equals(other.getAltPhone())) && (this.homePhone == null && other.getHomePhone() == null || this.homePhone != null && this.homePhone.equals(other.getHomePhone())) && (this.mobilePhone == null && other.getMobilePhone() == null || this.mobilePhone != null && this.mobilePhone.equals(other.getMobilePhone())) && (this.altEmail == null && other.getAltEmail() == null || this.altEmail != null && this.altEmail.equals(other.getAltEmail())) && (this.language == null && other.getLanguage() == null || this.language != null && this.language.equals(other.getLanguage())) && (this.comments == null && other.getComments() == null || this.comments != null && this.comments.equals(other.getComments())) && (this.numberFormat == null && other.getNumberFormat() == null || this.numberFormat != null && this.numberFormat.equals(other.getNumberFormat())) && (this.negativeNumberFormat == null && other.getNegativeNumberFormat() == null || this.negativeNumberFormat != null && this.negativeNumberFormat.equals(other.getNegativeNumberFormat())) && (this.dateCreated == null && other.getDateCreated() == null || this.dateCreated != null && this.dateCreated.equals(other.getDateCreated())) && (this.image == null && other.getImage() == null || this.image != null && this.image.equals(other.getImage())) && (this.emailPreference == null && other.getEmailPreference() == null || this.emailPreference != null && this.emailPreference.equals(other.getEmailPreference())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && this.subsidiary.equals(other.getSubsidiary())) && (this.representingSubsidiary == null && other.getRepresentingSubsidiary() == null || this.representingSubsidiary != null && this.representingSubsidiary.equals(other.getRepresentingSubsidiary())) && (this.salesRep == null && other.getSalesRep() == null || this.salesRep != null && this.salesRep.equals(other.getSalesRep())) && (this.territory == null && other.getTerritory() == null || this.territory != null && this.territory.equals(other.getTerritory())) && (this.contribPct == null && other.getContribPct() == null || this.contribPct != null && this.contribPct.equals(other.getContribPct())) && (this.partner == null && other.getPartner() == null || this.partner != null && this.partner.equals(other.getPartner())) && (this.salesGroup == null && other.getSalesGroup() == null || this.salesGroup != null && this.salesGroup.equals(other.getSalesGroup())) && (this.vatRegNumber == null && other.getVatRegNumber() == null || this.vatRegNumber != null && this.vatRegNumber.equals(other.getVatRegNumber())) && (this.accountNumber == null && other.getAccountNumber() == null || this.accountNumber != null && this.accountNumber.equals(other.getAccountNumber())) && (this.taxExempt == null && other.getTaxExempt() == null || this.taxExempt != null && this.taxExempt.equals(other.getTaxExempt())) && (this.terms == null && other.getTerms() == null || this.terms != null && this.terms.equals(other.getTerms())) && (this.creditLimit == null && other.getCreditLimit() == null || this.creditLimit != null && this.creditLimit.equals(other.getCreditLimit())) && (this.creditHoldOverride == null && other.getCreditHoldOverride() == null || this.creditHoldOverride != null && this.creditHoldOverride.equals(other.getCreditHoldOverride())) && (this.monthlyClosing == null && other.getMonthlyClosing() == null || this.monthlyClosing != null && this.monthlyClosing.equals(other.getMonthlyClosing())) && (this.overrideCurrencyFormat == null && other.getOverrideCurrencyFormat() == null || this.overrideCurrencyFormat != null && this.overrideCurrencyFormat.equals(other.getOverrideCurrencyFormat())) && (this.displaySymbol == null && other.getDisplaySymbol() == null || this.displaySymbol != null && this.displaySymbol.equals(other.getDisplaySymbol())) && (this.symbolPlacement == null && other.getSymbolPlacement() == null || this.symbolPlacement != null && this.symbolPlacement.equals(other.getSymbolPlacement())) && (this.balance == null && other.getBalance() == null || this.balance != null && this.balance.equals(other.getBalance())) && (this.overdueBalance == null && other.getOverdueBalance() == null || this.overdueBalance != null && this.overdueBalance.equals(other.getOverdueBalance())) && (this.daysOverdue == null && other.getDaysOverdue() == null || this.daysOverdue != null && this.daysOverdue.equals(other.getDaysOverdue())) && (this.unbilledOrders == null && other.getUnbilledOrders() == null || this.unbilledOrders != null && this.unbilledOrders.equals(other.getUnbilledOrders())) && (this.consolUnbilledOrders == null && other.getConsolUnbilledOrders() == null || this.consolUnbilledOrders != null && this.consolUnbilledOrders.equals(other.getConsolUnbilledOrders())) && (this.consolOverdueBalance == null && other.getConsolOverdueBalance() == null || this.consolOverdueBalance != null && this.consolOverdueBalance.equals(other.getConsolOverdueBalance())) && (this.consolDepositBalance == null && other.getConsolDepositBalance() == null || this.consolDepositBalance != null && this.consolDepositBalance.equals(other.getConsolDepositBalance())) && (this.consolBalance == null && other.getConsolBalance() == null || this.consolBalance != null && this.consolBalance.equals(other.getConsolBalance())) && (this.consolAging == null && other.getConsolAging() == null || this.consolAging != null && this.consolAging.equals(other.getConsolAging())) && (this.consolAging1 == null && other.getConsolAging1() == null || this.consolAging1 != null && this.consolAging1.equals(other.getConsolAging1())) && (this.consolAging2 == null && other.getConsolAging2() == null || this.consolAging2 != null && this.consolAging2.equals(other.getConsolAging2())) && (this.consolAging3 == null && other.getConsolAging3() == null || this.consolAging3 != null && this.consolAging3.equals(other.getConsolAging3())) && (this.consolAging4 == null && other.getConsolAging4() == null || this.consolAging4 != null && this.consolAging4.equals(other.getConsolAging4())) && (this.consolDaysOverdue == null && other.getConsolDaysOverdue() == null || this.consolDaysOverdue != null && this.consolDaysOverdue.equals(other.getConsolDaysOverdue())) && (this.priceLevel == null && other.getPriceLevel() == null || this.priceLevel != null && this.priceLevel.equals(other.getPriceLevel())) && (this.currency == null && other.getCurrency() == null || this.currency != null && this.currency.equals(other.getCurrency())) && (this.prefCCProcessor == null && other.getPrefCCProcessor() == null || this.prefCCProcessor != null && this.prefCCProcessor.equals(other.getPrefCCProcessor())) && (this.depositBalance == null && other.getDepositBalance() == null || this.depositBalance != null && this.depositBalance.equals(other.getDepositBalance())) && (this.shipComplete == null && other.getShipComplete() == null || this.shipComplete != null && this.shipComplete.equals(other.getShipComplete())) && (this.taxable == null && other.getTaxable() == null || this.taxable != null && this.taxable.equals(other.getTaxable())) && (this.taxItem == null && other.getTaxItem() == null || this.taxItem != null && this.taxItem.equals(other.getTaxItem())) && (this.resaleNumber == null && other.getResaleNumber() == null || this.resaleNumber != null && this.resaleNumber.equals(other.getResaleNumber())) && (this.aging == null && other.getAging() == null || this.aging != null && this.aging.equals(other.getAging())) && (this.aging1 == null && other.getAging1() == null || this.aging1 != null && this.aging1.equals(other.getAging1())) && (this.aging2 == null && other.getAging2() == null || this.aging2 != null && this.aging2.equals(other.getAging2())) && (this.aging3 == null && other.getAging3() == null || this.aging3 != null && this.aging3.equals(other.getAging3())) && (this.aging4 == null && other.getAging4() == null || this.aging4 != null && this.aging4.equals(other.getAging4())) && (this.startDate == null && other.getStartDate() == null || this.startDate != null && this.startDate.equals(other.getStartDate())) && (this.alcoholRecipientType == null && other.getAlcoholRecipientType() == null || this.alcoholRecipientType != null && this.alcoholRecipientType.equals(other.getAlcoholRecipientType())) && (this.endDate == null && other.getEndDate() == null || this.endDate != null && this.endDate.equals(other.getEndDate())) && (this.reminderDays == null && other.getReminderDays() == null || this.reminderDays != null && this.reminderDays.equals(other.getReminderDays())) && (this.shippingItem == null && other.getShippingItem() == null || this.shippingItem != null && this.shippingItem.equals(other.getShippingItem())) && (this.thirdPartyAcct == null && other.getThirdPartyAcct() == null || this.thirdPartyAcct != null && this.thirdPartyAcct.equals(other.getThirdPartyAcct())) && (this.thirdPartyZipcode == null && other.getThirdPartyZipcode() == null || this.thirdPartyZipcode != null && this.thirdPartyZipcode.equals(other.getThirdPartyZipcode())) && (this.thirdPartyCountry == null && other.getThirdPartyCountry() == null || this.thirdPartyCountry != null && this.thirdPartyCountry.equals(other.getThirdPartyCountry())) && (this.thirdPartyCarrier == null && other.getThirdPartyCarrier() == null || this.thirdPartyCarrier != null && this.thirdPartyCarrier.equals(other.getThirdPartyCarrier())) && (this.giveAccess == null && other.getGiveAccess() == null || this.giveAccess != null && this.giveAccess.equals(other.getGiveAccess())) && (this.estimatedBudget == null && other.getEstimatedBudget() == null || this.estimatedBudget != null && this.estimatedBudget.equals(other.getEstimatedBudget())) && (this.accessRole == null && other.getAccessRole() == null || this.accessRole != null && this.accessRole.equals(other.getAccessRole())) && (this.sendEmail == null && other.getSendEmail() == null || this.sendEmail != null && this.sendEmail.equals(other.getSendEmail())) && (this.assignedWebSite == null && other.getAssignedWebSite() == null || this.assignedWebSite != null && this.assignedWebSite.equals(other.getAssignedWebSite())) && (this.password == null && other.getPassword() == null || this.password != null && this.password.equals(other.getPassword())) && (this.password2 == null && other.getPassword2() == null || this.password2 != null && this.password2.equals(other.getPassword2())) && (this.requirePwdChange == null && other.getRequirePwdChange() == null || this.requirePwdChange != null && this.requirePwdChange.equals(other.getRequirePwdChange())) && (this.campaignCategory == null && other.getCampaignCategory() == null || this.campaignCategory != null && this.campaignCategory.equals(other.getCampaignCategory())) && (this.sourceWebSite == null && other.getSourceWebSite() == null || this.sourceWebSite != null && this.sourceWebSite.equals(other.getSourceWebSite())) && (this.leadSource == null && other.getLeadSource() == null || this.leadSource != null && this.leadSource.equals(other.getLeadSource())) && (this.receivablesAccount == null && other.getReceivablesAccount() == null || this.receivablesAccount != null && this.receivablesAccount.equals(other.getReceivablesAccount())) && (this.drAccount == null && other.getDrAccount() == null || this.drAccount != null && this.drAccount.equals(other.getDrAccount())) && (this.fxAccount == null && other.getFxAccount() == null || this.fxAccount != null && this.fxAccount.equals(other.getFxAccount())) && (this.defaultOrderPriority == null && other.getDefaultOrderPriority() == null || this.defaultOrderPriority != null && this.defaultOrderPriority.equals(other.getDefaultOrderPriority())) && (this.webLead == null && other.getWebLead() == null || this.webLead != null && this.webLead.equals(other.getWebLead())) && (this.referrer == null && other.getReferrer() == null || this.referrer != null && this.referrer.equals(other.getReferrer())) && (this.keywords == null && other.getKeywords() == null || this.keywords != null && this.keywords.equals(other.getKeywords())) && (this.clickStream == null && other.getClickStream() == null || this.clickStream != null && this.clickStream.equals(other.getClickStream())) && (this.lastPageVisited == null && other.getLastPageVisited() == null || this.lastPageVisited != null && this.lastPageVisited.equals(other.getLastPageVisited())) && (this.visits == null && other.getVisits() == null || this.visits != null && this.visits.equals(other.getVisits())) && (this.firstVisit == null && other.getFirstVisit() == null || this.firstVisit != null && this.firstVisit.equals(other.getFirstVisit())) && (this.lastVisit == null && other.getLastVisit() == null || this.lastVisit != null && this.lastVisit.equals(other.getLastVisit())) && (this.billPay == null && other.getBillPay() == null || this.billPay != null && this.billPay.equals(other.getBillPay())) && (this.openingBalance == null && other.getOpeningBalance() == null || this.openingBalance != null && this.openingBalance.equals(other.getOpeningBalance())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && this.lastModifiedDate.equals(other.getLastModifiedDate())) && (this.openingBalanceDate == null && other.getOpeningBalanceDate() == null || this.openingBalanceDate != null && this.openingBalanceDate.equals(other.getOpeningBalanceDate())) && (this.openingBalanceAccount == null && other.getOpeningBalanceAccount() == null || this.openingBalanceAccount != null && this.openingBalanceAccount.equals(other.getOpeningBalanceAccount())) && (this.stage == null && other.getStage() == null || this.stage != null && this.stage.equals(other.getStage())) && (this.emailTransactions == null && other.getEmailTransactions() == null || this.emailTransactions != null && this.emailTransactions.equals(other.getEmailTransactions())) && (this.printTransactions == null && other.getPrintTransactions() == null || this.printTransactions != null && this.printTransactions.equals(other.getPrintTransactions())) && (this.faxTransactions == null && other.getFaxTransactions() == null || this.faxTransactions != null && this.faxTransactions.equals(other.getFaxTransactions())) && (this.defaultTaxReg == null && other.getDefaultTaxReg() == null || this.defaultTaxReg != null && this.defaultTaxReg.equals(other.getDefaultTaxReg())) && (this.syncPartnerTeams == null && other.getSyncPartnerTeams() == null || this.syncPartnerTeams != null && this.syncPartnerTeams.equals(other.getSyncPartnerTeams())) && (this.isBudgetApproved == null && other.getIsBudgetApproved() == null || this.isBudgetApproved != null && this.isBudgetApproved.equals(other.getIsBudgetApproved())) && (this.globalSubscriptionStatus == null && other.getGlobalSubscriptionStatus() == null || this.globalSubscriptionStatus != null && this.globalSubscriptionStatus.equals(other.getGlobalSubscriptionStatus())) && (this.salesReadiness == null && other.getSalesReadiness() == null || this.salesReadiness != null && this.salesReadiness.equals(other.getSalesReadiness())) && (this.salesTeamList == null && other.getSalesTeamList() == null || this.salesTeamList != null && this.salesTeamList.equals(other.getSalesTeamList())) && (this.buyingReason == null && other.getBuyingReason() == null || this.buyingReason != null && this.buyingReason.equals(other.getBuyingReason())) && (this.downloadList == null && other.getDownloadList() == null || this.downloadList != null && this.downloadList.equals(other.getDownloadList())) && (this.buyingTimeFrame == null && other.getBuyingTimeFrame() == null || this.buyingTimeFrame != null && this.buyingTimeFrame.equals(other.getBuyingTimeFrame())) && (this.addressbookList == null && other.getAddressbookList() == null || this.addressbookList != null && this.addressbookList.equals(other.getAddressbookList())) && (this.subscriptionsList == null && other.getSubscriptionsList() == null || this.subscriptionsList != null && this.subscriptionsList.equals(other.getSubscriptionsList())) && (this.contactRolesList == null && other.getContactRolesList() == null || this.contactRolesList != null && this.contactRolesList.equals(other.getContactRolesList())) && (this.currencyList == null && other.getCurrencyList() == null || this.currencyList != null && this.currencyList.equals(other.getCurrencyList())) && (this.creditCardsList == null && other.getCreditCardsList() == null || this.creditCardsList != null && this.creditCardsList.equals(other.getCreditCardsList())) && (this.partnersList == null && other.getPartnersList() == null || this.partnersList != null && this.partnersList.equals(other.getPartnersList())) && (this.groupPricingList == null && other.getGroupPricingList() == null || this.groupPricingList != null && this.groupPricingList.equals(other.getGroupPricingList())) && (this.itemPricingList == null && other.getItemPricingList() == null || this.itemPricingList != null && this.itemPricingList.equals(other.getItemPricingList())) && (this.taxRegistrationList == null && other.getTaxRegistrationList() == null || this.taxRegistrationList != null && this.taxRegistrationList.equals(other.getTaxRegistrationList())) && (this.defaultAllocationStrategy == null && other.getDefaultAllocationStrategy() == null || this.defaultAllocationStrategy != null && this.defaultAllocationStrategy.equals(other.getDefaultAllocationStrategy())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
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
        if (this.getCustomForm() != null) {
            _hashCode += this.getCustomForm().hashCode();
        }
        if (this.getEntityId() != null) {
            _hashCode += this.getEntityId().hashCode();
        }
        if (this.getAltName() != null) {
            _hashCode += this.getAltName().hashCode();
        }
        if (this.getIsPerson() != null) {
            _hashCode += this.getIsPerson().hashCode();
        }
        if (this.getPhoneticName() != null) {
            _hashCode += this.getPhoneticName().hashCode();
        }
        if (this.getSalutation() != null) {
            _hashCode += this.getSalutation().hashCode();
        }
        if (this.getFirstName() != null) {
            _hashCode += this.getFirstName().hashCode();
        }
        if (this.getMiddleName() != null) {
            _hashCode += this.getMiddleName().hashCode();
        }
        if (this.getLastName() != null) {
            _hashCode += this.getLastName().hashCode();
        }
        if (this.getCompanyName() != null) {
            _hashCode += this.getCompanyName().hashCode();
        }
        if (this.getEntityStatus() != null) {
            _hashCode += this.getEntityStatus().hashCode();
        }
        if (this.getParent() != null) {
            _hashCode += this.getParent().hashCode();
        }
        if (this.getPhone() != null) {
            _hashCode += this.getPhone().hashCode();
        }
        if (this.getFax() != null) {
            _hashCode += this.getFax().hashCode();
        }
        if (this.getEmail() != null) {
            _hashCode += this.getEmail().hashCode();
        }
        if (this.getUrl() != null) {
            _hashCode += this.getUrl().hashCode();
        }
        if (this.getDefaultAddress() != null) {
            _hashCode += this.getDefaultAddress().hashCode();
        }
        if (this.getIsInactive() != null) {
            _hashCode += this.getIsInactive().hashCode();
        }
        if (this.getCategory() != null) {
            _hashCode += this.getCategory().hashCode();
        }
        if (this.getTitle() != null) {
            _hashCode += this.getTitle().hashCode();
        }
        if (this.getPrintOnCheckAs() != null) {
            _hashCode += this.getPrintOnCheckAs().hashCode();
        }
        if (this.getAltPhone() != null) {
            _hashCode += this.getAltPhone().hashCode();
        }
        if (this.getHomePhone() != null) {
            _hashCode += this.getHomePhone().hashCode();
        }
        if (this.getMobilePhone() != null) {
            _hashCode += this.getMobilePhone().hashCode();
        }
        if (this.getAltEmail() != null) {
            _hashCode += this.getAltEmail().hashCode();
        }
        if (this.getLanguage() != null) {
            _hashCode += this.getLanguage().hashCode();
        }
        if (this.getComments() != null) {
            _hashCode += this.getComments().hashCode();
        }
        if (this.getNumberFormat() != null) {
            _hashCode += this.getNumberFormat().hashCode();
        }
        if (this.getNegativeNumberFormat() != null) {
            _hashCode += this.getNegativeNumberFormat().hashCode();
        }
        if (this.getDateCreated() != null) {
            _hashCode += this.getDateCreated().hashCode();
        }
        if (this.getImage() != null) {
            _hashCode += this.getImage().hashCode();
        }
        if (this.getEmailPreference() != null) {
            _hashCode += this.getEmailPreference().hashCode();
        }
        if (this.getSubsidiary() != null) {
            _hashCode += this.getSubsidiary().hashCode();
        }
        if (this.getRepresentingSubsidiary() != null) {
            _hashCode += this.getRepresentingSubsidiary().hashCode();
        }
        if (this.getSalesRep() != null) {
            _hashCode += this.getSalesRep().hashCode();
        }
        if (this.getTerritory() != null) {
            _hashCode += this.getTerritory().hashCode();
        }
        if (this.getContribPct() != null) {
            _hashCode += this.getContribPct().hashCode();
        }
        if (this.getPartner() != null) {
            _hashCode += this.getPartner().hashCode();
        }
        if (this.getSalesGroup() != null) {
            _hashCode += this.getSalesGroup().hashCode();
        }
        if (this.getVatRegNumber() != null) {
            _hashCode += this.getVatRegNumber().hashCode();
        }
        if (this.getAccountNumber() != null) {
            _hashCode += this.getAccountNumber().hashCode();
        }
        if (this.getTaxExempt() != null) {
            _hashCode += this.getTaxExempt().hashCode();
        }
        if (this.getTerms() != null) {
            _hashCode += this.getTerms().hashCode();
        }
        if (this.getCreditLimit() != null) {
            _hashCode += this.getCreditLimit().hashCode();
        }
        if (this.getCreditHoldOverride() != null) {
            _hashCode += this.getCreditHoldOverride().hashCode();
        }
        if (this.getMonthlyClosing() != null) {
            _hashCode += this.getMonthlyClosing().hashCode();
        }
        if (this.getOverrideCurrencyFormat() != null) {
            _hashCode += this.getOverrideCurrencyFormat().hashCode();
        }
        if (this.getDisplaySymbol() != null) {
            _hashCode += this.getDisplaySymbol().hashCode();
        }
        if (this.getSymbolPlacement() != null) {
            _hashCode += this.getSymbolPlacement().hashCode();
        }
        if (this.getBalance() != null) {
            _hashCode += this.getBalance().hashCode();
        }
        if (this.getOverdueBalance() != null) {
            _hashCode += this.getOverdueBalance().hashCode();
        }
        if (this.getDaysOverdue() != null) {
            _hashCode += this.getDaysOverdue().hashCode();
        }
        if (this.getUnbilledOrders() != null) {
            _hashCode += this.getUnbilledOrders().hashCode();
        }
        if (this.getConsolUnbilledOrders() != null) {
            _hashCode += this.getConsolUnbilledOrders().hashCode();
        }
        if (this.getConsolOverdueBalance() != null) {
            _hashCode += this.getConsolOverdueBalance().hashCode();
        }
        if (this.getConsolDepositBalance() != null) {
            _hashCode += this.getConsolDepositBalance().hashCode();
        }
        if (this.getConsolBalance() != null) {
            _hashCode += this.getConsolBalance().hashCode();
        }
        if (this.getConsolAging() != null) {
            _hashCode += this.getConsolAging().hashCode();
        }
        if (this.getConsolAging1() != null) {
            _hashCode += this.getConsolAging1().hashCode();
        }
        if (this.getConsolAging2() != null) {
            _hashCode += this.getConsolAging2().hashCode();
        }
        if (this.getConsolAging3() != null) {
            _hashCode += this.getConsolAging3().hashCode();
        }
        if (this.getConsolAging4() != null) {
            _hashCode += this.getConsolAging4().hashCode();
        }
        if (this.getConsolDaysOverdue() != null) {
            _hashCode += this.getConsolDaysOverdue().hashCode();
        }
        if (this.getPriceLevel() != null) {
            _hashCode += this.getPriceLevel().hashCode();
        }
        if (this.getCurrency() != null) {
            _hashCode += this.getCurrency().hashCode();
        }
        if (this.getPrefCCProcessor() != null) {
            _hashCode += this.getPrefCCProcessor().hashCode();
        }
        if (this.getDepositBalance() != null) {
            _hashCode += this.getDepositBalance().hashCode();
        }
        if (this.getShipComplete() != null) {
            _hashCode += this.getShipComplete().hashCode();
        }
        if (this.getTaxable() != null) {
            _hashCode += this.getTaxable().hashCode();
        }
        if (this.getTaxItem() != null) {
            _hashCode += this.getTaxItem().hashCode();
        }
        if (this.getResaleNumber() != null) {
            _hashCode += this.getResaleNumber().hashCode();
        }
        if (this.getAging() != null) {
            _hashCode += this.getAging().hashCode();
        }
        if (this.getAging1() != null) {
            _hashCode += this.getAging1().hashCode();
        }
        if (this.getAging2() != null) {
            _hashCode += this.getAging2().hashCode();
        }
        if (this.getAging3() != null) {
            _hashCode += this.getAging3().hashCode();
        }
        if (this.getAging4() != null) {
            _hashCode += this.getAging4().hashCode();
        }
        if (this.getStartDate() != null) {
            _hashCode += this.getStartDate().hashCode();
        }
        if (this.getAlcoholRecipientType() != null) {
            _hashCode += this.getAlcoholRecipientType().hashCode();
        }
        if (this.getEndDate() != null) {
            _hashCode += this.getEndDate().hashCode();
        }
        if (this.getReminderDays() != null) {
            _hashCode += this.getReminderDays().hashCode();
        }
        if (this.getShippingItem() != null) {
            _hashCode += this.getShippingItem().hashCode();
        }
        if (this.getThirdPartyAcct() != null) {
            _hashCode += this.getThirdPartyAcct().hashCode();
        }
        if (this.getThirdPartyZipcode() != null) {
            _hashCode += this.getThirdPartyZipcode().hashCode();
        }
        if (this.getThirdPartyCountry() != null) {
            _hashCode += this.getThirdPartyCountry().hashCode();
        }
        if (this.getThirdPartyCarrier() != null) {
            _hashCode += this.getThirdPartyCarrier().hashCode();
        }
        if (this.getGiveAccess() != null) {
            _hashCode += this.getGiveAccess().hashCode();
        }
        if (this.getEstimatedBudget() != null) {
            _hashCode += this.getEstimatedBudget().hashCode();
        }
        if (this.getAccessRole() != null) {
            _hashCode += this.getAccessRole().hashCode();
        }
        if (this.getSendEmail() != null) {
            _hashCode += this.getSendEmail().hashCode();
        }
        if (this.getAssignedWebSite() != null) {
            _hashCode += this.getAssignedWebSite().hashCode();
        }
        if (this.getPassword() != null) {
            _hashCode += this.getPassword().hashCode();
        }
        if (this.getPassword2() != null) {
            _hashCode += this.getPassword2().hashCode();
        }
        if (this.getRequirePwdChange() != null) {
            _hashCode += this.getRequirePwdChange().hashCode();
        }
        if (this.getCampaignCategory() != null) {
            _hashCode += this.getCampaignCategory().hashCode();
        }
        if (this.getSourceWebSite() != null) {
            _hashCode += this.getSourceWebSite().hashCode();
        }
        if (this.getLeadSource() != null) {
            _hashCode += this.getLeadSource().hashCode();
        }
        if (this.getReceivablesAccount() != null) {
            _hashCode += this.getReceivablesAccount().hashCode();
        }
        if (this.getDrAccount() != null) {
            _hashCode += this.getDrAccount().hashCode();
        }
        if (this.getFxAccount() != null) {
            _hashCode += this.getFxAccount().hashCode();
        }
        if (this.getDefaultOrderPriority() != null) {
            _hashCode += this.getDefaultOrderPriority().hashCode();
        }
        if (this.getWebLead() != null) {
            _hashCode += this.getWebLead().hashCode();
        }
        if (this.getReferrer() != null) {
            _hashCode += this.getReferrer().hashCode();
        }
        if (this.getKeywords() != null) {
            _hashCode += this.getKeywords().hashCode();
        }
        if (this.getClickStream() != null) {
            _hashCode += this.getClickStream().hashCode();
        }
        if (this.getLastPageVisited() != null) {
            _hashCode += this.getLastPageVisited().hashCode();
        }
        if (this.getVisits() != null) {
            _hashCode += this.getVisits().hashCode();
        }
        if (this.getFirstVisit() != null) {
            _hashCode += this.getFirstVisit().hashCode();
        }
        if (this.getLastVisit() != null) {
            _hashCode += this.getLastVisit().hashCode();
        }
        if (this.getBillPay() != null) {
            _hashCode += this.getBillPay().hashCode();
        }
        if (this.getOpeningBalance() != null) {
            _hashCode += this.getOpeningBalance().hashCode();
        }
        if (this.getLastModifiedDate() != null) {
            _hashCode += this.getLastModifiedDate().hashCode();
        }
        if (this.getOpeningBalanceDate() != null) {
            _hashCode += this.getOpeningBalanceDate().hashCode();
        }
        if (this.getOpeningBalanceAccount() != null) {
            _hashCode += this.getOpeningBalanceAccount().hashCode();
        }
        if (this.getStage() != null) {
            _hashCode += this.getStage().hashCode();
        }
        if (this.getEmailTransactions() != null) {
            _hashCode += this.getEmailTransactions().hashCode();
        }
        if (this.getPrintTransactions() != null) {
            _hashCode += this.getPrintTransactions().hashCode();
        }
        if (this.getFaxTransactions() != null) {
            _hashCode += this.getFaxTransactions().hashCode();
        }
        if (this.getDefaultTaxReg() != null) {
            _hashCode += this.getDefaultTaxReg().hashCode();
        }
        if (this.getSyncPartnerTeams() != null) {
            _hashCode += this.getSyncPartnerTeams().hashCode();
        }
        if (this.getIsBudgetApproved() != null) {
            _hashCode += this.getIsBudgetApproved().hashCode();
        }
        if (this.getGlobalSubscriptionStatus() != null) {
            _hashCode += this.getGlobalSubscriptionStatus().hashCode();
        }
        if (this.getSalesReadiness() != null) {
            _hashCode += this.getSalesReadiness().hashCode();
        }
        if (this.getSalesTeamList() != null) {
            _hashCode += this.getSalesTeamList().hashCode();
        }
        if (this.getBuyingReason() != null) {
            _hashCode += this.getBuyingReason().hashCode();
        }
        if (this.getDownloadList() != null) {
            _hashCode += this.getDownloadList().hashCode();
        }
        if (this.getBuyingTimeFrame() != null) {
            _hashCode += this.getBuyingTimeFrame().hashCode();
        }
        if (this.getAddressbookList() != null) {
            _hashCode += this.getAddressbookList().hashCode();
        }
        if (this.getSubscriptionsList() != null) {
            _hashCode += this.getSubscriptionsList().hashCode();
        }
        if (this.getContactRolesList() != null) {
            _hashCode += this.getContactRolesList().hashCode();
        }
        if (this.getCurrencyList() != null) {
            _hashCode += this.getCurrencyList().hashCode();
        }
        if (this.getCreditCardsList() != null) {
            _hashCode += this.getCreditCardsList().hashCode();
        }
        if (this.getPartnersList() != null) {
            _hashCode += this.getPartnersList().hashCode();
        }
        if (this.getGroupPricingList() != null) {
            _hashCode += this.getGroupPricingList().hashCode();
        }
        if (this.getItemPricingList() != null) {
            _hashCode += this.getItemPricingList().hashCode();
        }
        if (this.getTaxRegistrationList() != null) {
            _hashCode += this.getTaxRegistrationList().hashCode();
        }
        if (this.getDefaultAllocationStrategy() != null) {
            _hashCode += this.getDefaultAllocationStrategy().hashCode();
        }
        if (this.getCustomFieldList() != null) {
            _hashCode += this.getCustomFieldList().hashCode();
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
        typeDesc.setXmlType(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "Customer"));
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
        elemField.setFieldName("customForm");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("entityId");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "entityId"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("altName");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "altName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isPerson");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "isPerson"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("phoneticName");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "phoneticName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("salutation");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "salutation"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "firstName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("middleName");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "middleName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "lastName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("companyName");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "companyName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("entityStatus");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "entityStatus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "parent"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "phone"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fax");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "fax"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "email"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "url"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("defaultAddress");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "defaultAddress"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "category"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "title"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("printOnCheckAs");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "printOnCheckAs"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("altPhone");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "altPhone"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("homePhone");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "homePhone"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("mobilePhone");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "mobilePhone"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("altEmail");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "altEmail"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "language"));
        elemField.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "Language"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "comments"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("numberFormat");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "numberFormat"));
        elemField.setXmlType(new QName("urn:types.relationships_2022_1.lists.webservices.netsuite.com", "CustomerNumberFormat"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("negativeNumberFormat");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "negativeNumberFormat"));
        elemField.setXmlType(new QName("urn:types.relationships_2022_1.lists.webservices.netsuite.com", "CustomerNegativeNumberFormat"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("dateCreated");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "dateCreated"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("image");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "image"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("emailPreference");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "emailPreference"));
        elemField.setXmlType(new QName("urn:types.relationships_2022_1.lists.webservices.netsuite.com", "EmailPreference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("representingSubsidiary");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "representingSubsidiary"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("salesRep");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "salesRep"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("territory");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "territory"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("contribPct");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "contribPct"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("partner");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "partner"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("salesGroup");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "salesGroup"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vatRegNumber");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "vatRegNumber"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "accountNumber"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxExempt");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "taxExempt"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("terms");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "terms"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("creditLimit");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "creditLimit"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("creditHoldOverride");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "creditHoldOverride"));
        elemField.setXmlType(new QName("urn:types.relationships_2022_1.lists.webservices.netsuite.com", "CustomerCreditHoldOverride"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("monthlyClosing");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "monthlyClosing"));
        elemField.setXmlType(new QName("urn:types.relationships_2022_1.lists.webservices.netsuite.com", "CustomerMonthlyClosing"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("overrideCurrencyFormat");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "overrideCurrencyFormat"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("displaySymbol");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "displaySymbol"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("symbolPlacement");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "symbolPlacement"));
        elemField.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "CurrencySymbolPlacement"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "balance"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("overdueBalance");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "overdueBalance"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("daysOverdue");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "daysOverdue"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("unbilledOrders");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "unbilledOrders"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("consolUnbilledOrders");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "consolUnbilledOrders"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("consolOverdueBalance");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "consolOverdueBalance"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("consolDepositBalance");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "consolDepositBalance"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("consolBalance");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "consolBalance"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("consolAging");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "consolAging"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("consolAging1");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "consolAging1"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("consolAging2");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "consolAging2"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("consolAging3");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "consolAging3"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("consolAging4");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "consolAging4"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("consolDaysOverdue");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "consolDaysOverdue"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("priceLevel");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "priceLevel"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("prefCCProcessor");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "prefCCProcessor"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("depositBalance");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "depositBalance"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipComplete");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "shipComplete"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxable");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "taxable"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxItem");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "taxItem"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("resaleNumber");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "resaleNumber"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("aging");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "aging"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("aging1");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "aging1"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("aging2");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "aging2"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("aging3");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "aging3"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("aging4");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "aging4"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("alcoholRecipientType");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "alcoholRecipientType"));
        elemField.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "AlcoholRecipientType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "endDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("reminderDays");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "reminderDays"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shippingItem");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "shippingItem"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("thirdPartyAcct");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "thirdPartyAcct"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("thirdPartyZipcode");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "thirdPartyZipcode"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("thirdPartyCountry");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "thirdPartyCountry"));
        elemField.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "Country"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("thirdPartyCarrier");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "thirdPartyCarrier"));
        elemField.setXmlType(new QName("urn:types.relationships_2022_1.lists.webservices.netsuite.com", "CustomerThirdPartyCarrier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("giveAccess");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "giveAccess"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("estimatedBudget");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "estimatedBudget"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("accessRole");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "accessRole"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("sendEmail");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "sendEmail"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("assignedWebSite");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "assignedWebSite"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "password"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("password2");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "password2"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("requirePwdChange");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "requirePwdChange"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("campaignCategory");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "campaignCategory"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("sourceWebSite");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "sourceWebSite"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("leadSource");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "leadSource"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("receivablesAccount");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "receivablesAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("drAccount");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "drAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fxAccount");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "fxAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("defaultOrderPriority");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "defaultOrderPriority"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("webLead");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "webLead"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("referrer");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "referrer"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("keywords");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "keywords"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("clickStream");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "clickStream"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastPageVisited");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "lastPageVisited"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("visits");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "visits"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("firstVisit");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "firstVisit"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastVisit");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "lastVisit"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billPay");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "billPay"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("openingBalance");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "openingBalance"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("openingBalanceDate");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "openingBalanceDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("openingBalanceAccount");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "openingBalanceAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("stage");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "stage"));
        elemField.setXmlType(new QName("urn:types.relationships_2022_1.lists.webservices.netsuite.com", "CustomerStage"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("emailTransactions");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "emailTransactions"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("printTransactions");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "printTransactions"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("faxTransactions");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "faxTransactions"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("defaultTaxReg");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "defaultTaxReg"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("syncPartnerTeams");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "syncPartnerTeams"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isBudgetApproved");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "isBudgetApproved"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("globalSubscriptionStatus");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "globalSubscriptionStatus"));
        elemField.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "GlobalSubscriptionStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("salesReadiness");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "salesReadiness"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("salesTeamList");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "salesTeamList"));
        elemField.setXmlType(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "CustomerSalesTeamList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("buyingReason");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "buyingReason"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("downloadList");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "downloadList"));
        elemField.setXmlType(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "CustomerDownloadList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("buyingTimeFrame");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "buyingTimeFrame"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("addressbookList");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "addressbookList"));
        elemField.setXmlType(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "CustomerAddressbookList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subscriptionsList");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "subscriptionsList"));
        elemField.setXmlType(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "SubscriptionsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("contactRolesList");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "contactRolesList"));
        elemField.setXmlType(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "ContactAccessRolesList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("currencyList");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "currencyList"));
        elemField.setXmlType(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "CustomerCurrencyList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("creditCardsList");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "creditCardsList"));
        elemField.setXmlType(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "CustomerCreditCardsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("partnersList");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "partnersList"));
        elemField.setXmlType(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "CustomerPartnersList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("groupPricingList");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "groupPricingList"));
        elemField.setXmlType(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "CustomerGroupPricingList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemPricingList");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "itemPricingList"));
        elemField.setXmlType(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "CustomerItemPricingList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxRegistrationList");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "taxRegistrationList"));
        elemField.setXmlType(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "CustomerTaxRegistrationList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("defaultAllocationStrategy");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "defaultAllocationStrategy"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "CustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

