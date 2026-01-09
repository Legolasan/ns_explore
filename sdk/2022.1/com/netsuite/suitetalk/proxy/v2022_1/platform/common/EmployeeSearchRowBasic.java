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
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchEnumMultiSelectField;
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

public class EmployeeSearchRowBasic
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
    private SearchColumnStringField[] alienNumber;
    private SearchColumnDoubleField[] allocation;
    private SearchColumnStringField[] altEmail;
    private SearchColumnStringField[] altName;
    private SearchColumnStringField[] altPhone;
    private SearchColumnDoubleField[] approvalLimit;
    private SearchColumnSelectField[] approver;
    private SearchColumnStringField[] attention;
    private SearchColumnDateField[] authWorkDate;
    private SearchColumnDoubleField[] baseWage;
    private SearchEnumMultiSelectField[] baseWageType;
    private SearchColumnStringField[] billAddress;
    private SearchColumnStringField[] billAddress1;
    private SearchColumnStringField[] billAddress2;
    private SearchColumnStringField[] billAddress3;
    private SearchColumnStringField[] billAddressee;
    private SearchColumnStringField[] billAttention;
    private SearchColumnStringField[] billCity;
    private SearchColumnEnumSelectField[] billCountry;
    private SearchColumnStringField[] billCountryCode;
    private SearchColumnSelectField[] billingClass;
    private SearchColumnStringField[] billPhone;
    private SearchColumnStringField[] billState;
    private SearchColumnStringField[] billZipCode;
    private SearchColumnDateField[] birthDate;
    private SearchColumnDateField[] birthDay;
    private SearchColumnDoubleField[] bonusTarget;
    private SearchColumnStringField[] bonusTargetComment;
    private SearchColumnEnumSelectField[] bonusTargetPayFrequency;
    private SearchColumnEnumSelectField[] bonusTargetType;
    private SearchColumnStringField[] city;
    private SearchColumnSelectField[] _class;
    private SearchColumnStringField[] comments;
    private SearchColumnEnumSelectField[] compensationCurrency;
    private SearchColumnBooleanField[] concurrentWebServicesUser;
    private SearchColumnSelectField[] corporateCardProfile;
    private SearchColumnEnumSelectField[] country;
    private SearchColumnStringField[] countryCode;
    private SearchColumnDateField[] dateCreated;
    private SearchColumnSelectField[] defaultAcctCorpCardExp;
    private SearchColumnSelectField[] defaultExpenseReportCurrency;
    private SearchColumnStringField[] defaultTaxReg;
    private SearchColumnSelectField[] department;
    private SearchColumnBooleanField[] eligibleForCommission;
    private SearchColumnStringField[] email;
    private SearchColumnStringField[] embossedName;
    private SearchColumnSelectField[] employeeStatus;
    private SearchColumnSelectField[] employeeType;
    private SearchColumnStringField[] entityId;
    private SearchColumnLongField[] entityNumber;
    private SearchColumnSelectField[] ethnicity;
    private SearchColumnDoubleField[] expenseLimit;
    private SearchColumnSelectField[] expenseReportCurrency;
    private SearchColumnDateField[] expiration;
    private SearchColumnSelectField[] externalId;
    private SearchColumnStringField[] fax;
    private SearchColumnStringField[] firstName;
    private SearchColumnEnumSelectField[] gender;
    private SearchColumnBooleanField[] giveAccess;
    private SearchColumnEnumSelectField[] globalSubscriptionStatus;
    private SearchColumnDateField[] hireDate;
    private SearchColumnStringField[] homePhone;
    private SearchColumnBooleanField[] i9Verified;
    private SearchColumnSelectField[] image;
    private SearchColumnSelectField[] internalId;
    private SearchColumnBooleanField[] isDefaultBilling;
    private SearchColumnBooleanField[] isDefaultShipping;
    private SearchColumnBooleanField[] isInactive;
    private SearchColumnBooleanField[] isJobManager;
    private SearchColumnBooleanField[] isJobResource;
    private SearchColumnBooleanField[] isSalesRep;
    private SearchColumnBooleanField[] isSupportRep;
    private SearchColumnBooleanField[] isTemplate;
    private SearchColumnSelectField[] job;
    private SearchColumnDoubleField[] laborCost;
    private SearchColumnEnumSelectField[] language;
    private SearchColumnDateField[] lastModifiedDate;
    private SearchColumnStringField[] lastName;
    private SearchColumnDateField[] lastPaidDate;
    private SearchColumnDateField[] lastReviewDate;
    private SearchColumnEnumSelectField[] level;
    private SearchColumnSelectField[] location;
    private SearchColumnSelectField[] maritalStatus;
    private SearchColumnStringField[] middleName;
    private SearchColumnStringField[] mobilePhone;
    private SearchColumnDateField[] nextReviewDate;
    private SearchColumnBooleanField[] offlineAccess;
    private SearchColumnEnumSelectField[] payFrequency;
    private SearchColumnDateField[] permChangeDate;
    private SearchColumnStringField[] permChangeLevel;
    private SearchColumnEnumSelectField[] permission;
    private SearchColumnEnumSelectField[] permissionChange;
    private SearchColumnStringField[] phone;
    private SearchColumnStringField[] phoneticName;
    private SearchColumnStringField[] positionTitle;
    private SearchColumnDoubleField[] primaryEarningAmount;
    private SearchColumnStringField[] primaryEarningItem;
    private SearchColumnStringField[] primaryEarningType;
    private SearchColumnDoubleField[] purchaseOrderApprovalLimit;
    private SearchColumnSelectField[] purchaseOrderApprover;
    private SearchColumnDoubleField[] purchaseOrderLimit;
    private SearchColumnDateField[] releaseDate;
    private SearchColumnSelectField[] residentStatus;
    private SearchColumnSelectField[] role;
    private SearchColumnStringField[] roleChange;
    private SearchColumnStringField[] roleChangeAction;
    private SearchColumnDateField[] roleChangeDate;
    private SearchColumnSelectField[] salesRole;
    private SearchColumnStringField[] salutation;
    private SearchColumnStringField[] shipAddress1;
    private SearchColumnStringField[] shipAddress2;
    private SearchColumnStringField[] shipAddress3;
    private SearchColumnStringField[] shipAddressee;
    private SearchColumnStringField[] shipAttention;
    private SearchColumnStringField[] shipCity;
    private SearchColumnEnumSelectField[] shipCountry;
    private SearchColumnStringField[] shipCountryCode;
    private SearchColumnStringField[] shipPhone;
    private SearchColumnStringField[] shipState;
    private SearchColumnStringField[] shipZip;
    private SearchColumnStringField[] socialSecurityNumber;
    private SearchColumnDateField[] startDateTimeOffCalc;
    private SearchColumnEnumSelectField[] state;
    private SearchColumnSelectField[] subscription;
    private SearchColumnDateField[] subscriptionDate;
    private SearchColumnBooleanField[] subscriptionStatus;
    private SearchColumnSelectField[] subsidiary;
    private SearchColumnSelectField[] supervisor;
    private SearchColumnDoubleField[] targetUtilization;
    private SearchColumnEnumSelectField[] terminationCategory;
    private SearchColumnStringField[] terminationDetails;
    private SearchColumnSelectField[] terminationReason;
    private SearchColumnEnumSelectField[] terminationRegretted;
    private SearchColumnSelectField[] timeApprover;
    private SearchColumnStringField[] timeOffPlan;
    private SearchColumnStringField[] title;
    private SearchColumnBooleanField[] usePerquest;
    private SearchColumnBooleanField[] useTimeData;
    private SearchColumnDateField[] visaExpDate;
    private SearchColumnSelectField[] visaType;
    private SearchColumnStringField[] workCalendar;
    private SearchColumnSelectField[] workplace;
    private SearchColumnStringField[] zipCode;
    private SearchColumnCustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(EmployeeSearchRowBasic.class, true);

    public EmployeeSearchRowBasic() {
    }

    public EmployeeSearchRowBasic(SearchColumnStringField[] accountNumber, SearchColumnStringField[] address, SearchColumnStringField[] address1, SearchColumnStringField[] address2, SearchColumnStringField[] address3, SearchColumnStringField[] addressee, SearchColumnStringField[] addressInternalId, SearchColumnStringField[] addressLabel, SearchColumnStringField[] addressPhone, SearchColumnStringField[] alienNumber, SearchColumnDoubleField[] allocation, SearchColumnStringField[] altEmail, SearchColumnStringField[] altName, SearchColumnStringField[] altPhone, SearchColumnDoubleField[] approvalLimit, SearchColumnSelectField[] approver, SearchColumnStringField[] attention, SearchColumnDateField[] authWorkDate, SearchColumnDoubleField[] baseWage, SearchEnumMultiSelectField[] baseWageType, SearchColumnStringField[] billAddress, SearchColumnStringField[] billAddress1, SearchColumnStringField[] billAddress2, SearchColumnStringField[] billAddress3, SearchColumnStringField[] billAddressee, SearchColumnStringField[] billAttention, SearchColumnStringField[] billCity, SearchColumnEnumSelectField[] billCountry, SearchColumnStringField[] billCountryCode, SearchColumnSelectField[] billingClass, SearchColumnStringField[] billPhone, SearchColumnStringField[] billState, SearchColumnStringField[] billZipCode, SearchColumnDateField[] birthDate, SearchColumnDateField[] birthDay, SearchColumnDoubleField[] bonusTarget, SearchColumnStringField[] bonusTargetComment, SearchColumnEnumSelectField[] bonusTargetPayFrequency, SearchColumnEnumSelectField[] bonusTargetType, SearchColumnStringField[] city, SearchColumnSelectField[] _class, SearchColumnStringField[] comments, SearchColumnEnumSelectField[] compensationCurrency, SearchColumnBooleanField[] concurrentWebServicesUser, SearchColumnSelectField[] corporateCardProfile, SearchColumnEnumSelectField[] country, SearchColumnStringField[] countryCode, SearchColumnDateField[] dateCreated, SearchColumnSelectField[] defaultAcctCorpCardExp, SearchColumnSelectField[] defaultExpenseReportCurrency, SearchColumnStringField[] defaultTaxReg, SearchColumnSelectField[] department, SearchColumnBooleanField[] eligibleForCommission, SearchColumnStringField[] email, SearchColumnStringField[] embossedName, SearchColumnSelectField[] employeeStatus, SearchColumnSelectField[] employeeType, SearchColumnStringField[] entityId, SearchColumnLongField[] entityNumber, SearchColumnSelectField[] ethnicity, SearchColumnDoubleField[] expenseLimit, SearchColumnSelectField[] expenseReportCurrency, SearchColumnDateField[] expiration, SearchColumnSelectField[] externalId, SearchColumnStringField[] fax, SearchColumnStringField[] firstName, SearchColumnEnumSelectField[] gender, SearchColumnBooleanField[] giveAccess, SearchColumnEnumSelectField[] globalSubscriptionStatus, SearchColumnDateField[] hireDate, SearchColumnStringField[] homePhone, SearchColumnBooleanField[] i9Verified, SearchColumnSelectField[] image, SearchColumnSelectField[] internalId, SearchColumnBooleanField[] isDefaultBilling, SearchColumnBooleanField[] isDefaultShipping, SearchColumnBooleanField[] isInactive, SearchColumnBooleanField[] isJobManager, SearchColumnBooleanField[] isJobResource, SearchColumnBooleanField[] isSalesRep, SearchColumnBooleanField[] isSupportRep, SearchColumnBooleanField[] isTemplate, SearchColumnSelectField[] job, SearchColumnDoubleField[] laborCost, SearchColumnEnumSelectField[] language, SearchColumnDateField[] lastModifiedDate, SearchColumnStringField[] lastName, SearchColumnDateField[] lastPaidDate, SearchColumnDateField[] lastReviewDate, SearchColumnEnumSelectField[] level, SearchColumnSelectField[] location, SearchColumnSelectField[] maritalStatus, SearchColumnStringField[] middleName, SearchColumnStringField[] mobilePhone, SearchColumnDateField[] nextReviewDate, SearchColumnBooleanField[] offlineAccess, SearchColumnEnumSelectField[] payFrequency, SearchColumnDateField[] permChangeDate, SearchColumnStringField[] permChangeLevel, SearchColumnEnumSelectField[] permission, SearchColumnEnumSelectField[] permissionChange, SearchColumnStringField[] phone, SearchColumnStringField[] phoneticName, SearchColumnStringField[] positionTitle, SearchColumnDoubleField[] primaryEarningAmount, SearchColumnStringField[] primaryEarningItem, SearchColumnStringField[] primaryEarningType, SearchColumnDoubleField[] purchaseOrderApprovalLimit, SearchColumnSelectField[] purchaseOrderApprover, SearchColumnDoubleField[] purchaseOrderLimit, SearchColumnDateField[] releaseDate, SearchColumnSelectField[] residentStatus, SearchColumnSelectField[] role, SearchColumnStringField[] roleChange, SearchColumnStringField[] roleChangeAction, SearchColumnDateField[] roleChangeDate, SearchColumnSelectField[] salesRole, SearchColumnStringField[] salutation, SearchColumnStringField[] shipAddress1, SearchColumnStringField[] shipAddress2, SearchColumnStringField[] shipAddress3, SearchColumnStringField[] shipAddressee, SearchColumnStringField[] shipAttention, SearchColumnStringField[] shipCity, SearchColumnEnumSelectField[] shipCountry, SearchColumnStringField[] shipCountryCode, SearchColumnStringField[] shipPhone, SearchColumnStringField[] shipState, SearchColumnStringField[] shipZip, SearchColumnStringField[] socialSecurityNumber, SearchColumnDateField[] startDateTimeOffCalc, SearchColumnEnumSelectField[] state, SearchColumnSelectField[] subscription, SearchColumnDateField[] subscriptionDate, SearchColumnBooleanField[] subscriptionStatus, SearchColumnSelectField[] subsidiary, SearchColumnSelectField[] supervisor, SearchColumnDoubleField[] targetUtilization, SearchColumnEnumSelectField[] terminationCategory, SearchColumnStringField[] terminationDetails, SearchColumnSelectField[] terminationReason, SearchColumnEnumSelectField[] terminationRegretted, SearchColumnSelectField[] timeApprover, SearchColumnStringField[] timeOffPlan, SearchColumnStringField[] title, SearchColumnBooleanField[] usePerquest, SearchColumnBooleanField[] useTimeData, SearchColumnDateField[] visaExpDate, SearchColumnSelectField[] visaType, SearchColumnStringField[] workCalendar, SearchColumnSelectField[] workplace, SearchColumnStringField[] zipCode, SearchColumnCustomFieldList customFieldList) {
        this.accountNumber = accountNumber;
        this.address = address;
        this.address1 = address1;
        this.address2 = address2;
        this.address3 = address3;
        this.addressee = addressee;
        this.addressInternalId = addressInternalId;
        this.addressLabel = addressLabel;
        this.addressPhone = addressPhone;
        this.alienNumber = alienNumber;
        this.allocation = allocation;
        this.altEmail = altEmail;
        this.altName = altName;
        this.altPhone = altPhone;
        this.approvalLimit = approvalLimit;
        this.approver = approver;
        this.attention = attention;
        this.authWorkDate = authWorkDate;
        this.baseWage = baseWage;
        this.baseWageType = baseWageType;
        this.billAddress = billAddress;
        this.billAddress1 = billAddress1;
        this.billAddress2 = billAddress2;
        this.billAddress3 = billAddress3;
        this.billAddressee = billAddressee;
        this.billAttention = billAttention;
        this.billCity = billCity;
        this.billCountry = billCountry;
        this.billCountryCode = billCountryCode;
        this.billingClass = billingClass;
        this.billPhone = billPhone;
        this.billState = billState;
        this.billZipCode = billZipCode;
        this.birthDate = birthDate;
        this.birthDay = birthDay;
        this.bonusTarget = bonusTarget;
        this.bonusTargetComment = bonusTargetComment;
        this.bonusTargetPayFrequency = bonusTargetPayFrequency;
        this.bonusTargetType = bonusTargetType;
        this.city = city;
        this._class = _class;
        this.comments = comments;
        this.compensationCurrency = compensationCurrency;
        this.concurrentWebServicesUser = concurrentWebServicesUser;
        this.corporateCardProfile = corporateCardProfile;
        this.country = country;
        this.countryCode = countryCode;
        this.dateCreated = dateCreated;
        this.defaultAcctCorpCardExp = defaultAcctCorpCardExp;
        this.defaultExpenseReportCurrency = defaultExpenseReportCurrency;
        this.defaultTaxReg = defaultTaxReg;
        this.department = department;
        this.eligibleForCommission = eligibleForCommission;
        this.email = email;
        this.embossedName = embossedName;
        this.employeeStatus = employeeStatus;
        this.employeeType = employeeType;
        this.entityId = entityId;
        this.entityNumber = entityNumber;
        this.ethnicity = ethnicity;
        this.expenseLimit = expenseLimit;
        this.expenseReportCurrency = expenseReportCurrency;
        this.expiration = expiration;
        this.externalId = externalId;
        this.fax = fax;
        this.firstName = firstName;
        this.gender = gender;
        this.giveAccess = giveAccess;
        this.globalSubscriptionStatus = globalSubscriptionStatus;
        this.hireDate = hireDate;
        this.homePhone = homePhone;
        this.i9Verified = i9Verified;
        this.image = image;
        this.internalId = internalId;
        this.isDefaultBilling = isDefaultBilling;
        this.isDefaultShipping = isDefaultShipping;
        this.isInactive = isInactive;
        this.isJobManager = isJobManager;
        this.isJobResource = isJobResource;
        this.isSalesRep = isSalesRep;
        this.isSupportRep = isSupportRep;
        this.isTemplate = isTemplate;
        this.job = job;
        this.laborCost = laborCost;
        this.language = language;
        this.lastModifiedDate = lastModifiedDate;
        this.lastName = lastName;
        this.lastPaidDate = lastPaidDate;
        this.lastReviewDate = lastReviewDate;
        this.level = level;
        this.location = location;
        this.maritalStatus = maritalStatus;
        this.middleName = middleName;
        this.mobilePhone = mobilePhone;
        this.nextReviewDate = nextReviewDate;
        this.offlineAccess = offlineAccess;
        this.payFrequency = payFrequency;
        this.permChangeDate = permChangeDate;
        this.permChangeLevel = permChangeLevel;
        this.permission = permission;
        this.permissionChange = permissionChange;
        this.phone = phone;
        this.phoneticName = phoneticName;
        this.positionTitle = positionTitle;
        this.primaryEarningAmount = primaryEarningAmount;
        this.primaryEarningItem = primaryEarningItem;
        this.primaryEarningType = primaryEarningType;
        this.purchaseOrderApprovalLimit = purchaseOrderApprovalLimit;
        this.purchaseOrderApprover = purchaseOrderApprover;
        this.purchaseOrderLimit = purchaseOrderLimit;
        this.releaseDate = releaseDate;
        this.residentStatus = residentStatus;
        this.role = role;
        this.roleChange = roleChange;
        this.roleChangeAction = roleChangeAction;
        this.roleChangeDate = roleChangeDate;
        this.salesRole = salesRole;
        this.salutation = salutation;
        this.shipAddress1 = shipAddress1;
        this.shipAddress2 = shipAddress2;
        this.shipAddress3 = shipAddress3;
        this.shipAddressee = shipAddressee;
        this.shipAttention = shipAttention;
        this.shipCity = shipCity;
        this.shipCountry = shipCountry;
        this.shipCountryCode = shipCountryCode;
        this.shipPhone = shipPhone;
        this.shipState = shipState;
        this.shipZip = shipZip;
        this.socialSecurityNumber = socialSecurityNumber;
        this.startDateTimeOffCalc = startDateTimeOffCalc;
        this.state = state;
        this.subscription = subscription;
        this.subscriptionDate = subscriptionDate;
        this.subscriptionStatus = subscriptionStatus;
        this.subsidiary = subsidiary;
        this.supervisor = supervisor;
        this.targetUtilization = targetUtilization;
        this.terminationCategory = terminationCategory;
        this.terminationDetails = terminationDetails;
        this.terminationReason = terminationReason;
        this.terminationRegretted = terminationRegretted;
        this.timeApprover = timeApprover;
        this.timeOffPlan = timeOffPlan;
        this.title = title;
        this.usePerquest = usePerquest;
        this.useTimeData = useTimeData;
        this.visaExpDate = visaExpDate;
        this.visaType = visaType;
        this.workCalendar = workCalendar;
        this.workplace = workplace;
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

    public SearchColumnStringField[] getAlienNumber() {
        return this.alienNumber;
    }

    public void setAlienNumber(SearchColumnStringField[] alienNumber) {
        this.alienNumber = alienNumber;
    }

    public SearchColumnStringField getAlienNumber(int i) {
        return this.alienNumber[i];
    }

    public void setAlienNumber(int i, SearchColumnStringField _value) {
        this.alienNumber[i] = _value;
    }

    public SearchColumnDoubleField[] getAllocation() {
        return this.allocation;
    }

    public void setAllocation(SearchColumnDoubleField[] allocation) {
        this.allocation = allocation;
    }

    public SearchColumnDoubleField getAllocation(int i) {
        return this.allocation[i];
    }

    public void setAllocation(int i, SearchColumnDoubleField _value) {
        this.allocation[i] = _value;
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

    public SearchColumnDoubleField[] getApprovalLimit() {
        return this.approvalLimit;
    }

    public void setApprovalLimit(SearchColumnDoubleField[] approvalLimit) {
        this.approvalLimit = approvalLimit;
    }

    public SearchColumnDoubleField getApprovalLimit(int i) {
        return this.approvalLimit[i];
    }

    public void setApprovalLimit(int i, SearchColumnDoubleField _value) {
        this.approvalLimit[i] = _value;
    }

    public SearchColumnSelectField[] getApprover() {
        return this.approver;
    }

    public void setApprover(SearchColumnSelectField[] approver) {
        this.approver = approver;
    }

    public SearchColumnSelectField getApprover(int i) {
        return this.approver[i];
    }

    public void setApprover(int i, SearchColumnSelectField _value) {
        this.approver[i] = _value;
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

    public SearchColumnDateField[] getAuthWorkDate() {
        return this.authWorkDate;
    }

    public void setAuthWorkDate(SearchColumnDateField[] authWorkDate) {
        this.authWorkDate = authWorkDate;
    }

    public SearchColumnDateField getAuthWorkDate(int i) {
        return this.authWorkDate[i];
    }

    public void setAuthWorkDate(int i, SearchColumnDateField _value) {
        this.authWorkDate[i] = _value;
    }

    public SearchColumnDoubleField[] getBaseWage() {
        return this.baseWage;
    }

    public void setBaseWage(SearchColumnDoubleField[] baseWage) {
        this.baseWage = baseWage;
    }

    public SearchColumnDoubleField getBaseWage(int i) {
        return this.baseWage[i];
    }

    public void setBaseWage(int i, SearchColumnDoubleField _value) {
        this.baseWage[i] = _value;
    }

    public SearchEnumMultiSelectField[] getBaseWageType() {
        return this.baseWageType;
    }

    public void setBaseWageType(SearchEnumMultiSelectField[] baseWageType) {
        this.baseWageType = baseWageType;
    }

    public SearchEnumMultiSelectField getBaseWageType(int i) {
        return this.baseWageType[i];
    }

    public void setBaseWageType(int i, SearchEnumMultiSelectField _value) {
        this.baseWageType[i] = _value;
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

    public SearchColumnSelectField[] getBillingClass() {
        return this.billingClass;
    }

    public void setBillingClass(SearchColumnSelectField[] billingClass) {
        this.billingClass = billingClass;
    }

    public SearchColumnSelectField getBillingClass(int i) {
        return this.billingClass[i];
    }

    public void setBillingClass(int i, SearchColumnSelectField _value) {
        this.billingClass[i] = _value;
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

    public SearchColumnDateField[] getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(SearchColumnDateField[] birthDate) {
        this.birthDate = birthDate;
    }

    public SearchColumnDateField getBirthDate(int i) {
        return this.birthDate[i];
    }

    public void setBirthDate(int i, SearchColumnDateField _value) {
        this.birthDate[i] = _value;
    }

    public SearchColumnDateField[] getBirthDay() {
        return this.birthDay;
    }

    public void setBirthDay(SearchColumnDateField[] birthDay) {
        this.birthDay = birthDay;
    }

    public SearchColumnDateField getBirthDay(int i) {
        return this.birthDay[i];
    }

    public void setBirthDay(int i, SearchColumnDateField _value) {
        this.birthDay[i] = _value;
    }

    public SearchColumnDoubleField[] getBonusTarget() {
        return this.bonusTarget;
    }

    public void setBonusTarget(SearchColumnDoubleField[] bonusTarget) {
        this.bonusTarget = bonusTarget;
    }

    public SearchColumnDoubleField getBonusTarget(int i) {
        return this.bonusTarget[i];
    }

    public void setBonusTarget(int i, SearchColumnDoubleField _value) {
        this.bonusTarget[i] = _value;
    }

    public SearchColumnStringField[] getBonusTargetComment() {
        return this.bonusTargetComment;
    }

    public void setBonusTargetComment(SearchColumnStringField[] bonusTargetComment) {
        this.bonusTargetComment = bonusTargetComment;
    }

    public SearchColumnStringField getBonusTargetComment(int i) {
        return this.bonusTargetComment[i];
    }

    public void setBonusTargetComment(int i, SearchColumnStringField _value) {
        this.bonusTargetComment[i] = _value;
    }

    public SearchColumnEnumSelectField[] getBonusTargetPayFrequency() {
        return this.bonusTargetPayFrequency;
    }

    public void setBonusTargetPayFrequency(SearchColumnEnumSelectField[] bonusTargetPayFrequency) {
        this.bonusTargetPayFrequency = bonusTargetPayFrequency;
    }

    public SearchColumnEnumSelectField getBonusTargetPayFrequency(int i) {
        return this.bonusTargetPayFrequency[i];
    }

    public void setBonusTargetPayFrequency(int i, SearchColumnEnumSelectField _value) {
        this.bonusTargetPayFrequency[i] = _value;
    }

    public SearchColumnEnumSelectField[] getBonusTargetType() {
        return this.bonusTargetType;
    }

    public void setBonusTargetType(SearchColumnEnumSelectField[] bonusTargetType) {
        this.bonusTargetType = bonusTargetType;
    }

    public SearchColumnEnumSelectField getBonusTargetType(int i) {
        return this.bonusTargetType[i];
    }

    public void setBonusTargetType(int i, SearchColumnEnumSelectField _value) {
        this.bonusTargetType[i] = _value;
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

    public SearchColumnSelectField[] get_class() {
        return this._class;
    }

    public void set_class(SearchColumnSelectField[] _class) {
        this._class = _class;
    }

    public SearchColumnSelectField get_class(int i) {
        return this._class[i];
    }

    public void set_class(int i, SearchColumnSelectField _value) {
        this._class[i] = _value;
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

    public SearchColumnEnumSelectField[] getCompensationCurrency() {
        return this.compensationCurrency;
    }

    public void setCompensationCurrency(SearchColumnEnumSelectField[] compensationCurrency) {
        this.compensationCurrency = compensationCurrency;
    }

    public SearchColumnEnumSelectField getCompensationCurrency(int i) {
        return this.compensationCurrency[i];
    }

    public void setCompensationCurrency(int i, SearchColumnEnumSelectField _value) {
        this.compensationCurrency[i] = _value;
    }

    public SearchColumnBooleanField[] getConcurrentWebServicesUser() {
        return this.concurrentWebServicesUser;
    }

    public void setConcurrentWebServicesUser(SearchColumnBooleanField[] concurrentWebServicesUser) {
        this.concurrentWebServicesUser = concurrentWebServicesUser;
    }

    public SearchColumnBooleanField getConcurrentWebServicesUser(int i) {
        return this.concurrentWebServicesUser[i];
    }

    public void setConcurrentWebServicesUser(int i, SearchColumnBooleanField _value) {
        this.concurrentWebServicesUser[i] = _value;
    }

    public SearchColumnSelectField[] getCorporateCardProfile() {
        return this.corporateCardProfile;
    }

    public void setCorporateCardProfile(SearchColumnSelectField[] corporateCardProfile) {
        this.corporateCardProfile = corporateCardProfile;
    }

    public SearchColumnSelectField getCorporateCardProfile(int i) {
        return this.corporateCardProfile[i];
    }

    public void setCorporateCardProfile(int i, SearchColumnSelectField _value) {
        this.corporateCardProfile[i] = _value;
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

    public SearchColumnSelectField[] getDefaultAcctCorpCardExp() {
        return this.defaultAcctCorpCardExp;
    }

    public void setDefaultAcctCorpCardExp(SearchColumnSelectField[] defaultAcctCorpCardExp) {
        this.defaultAcctCorpCardExp = defaultAcctCorpCardExp;
    }

    public SearchColumnSelectField getDefaultAcctCorpCardExp(int i) {
        return this.defaultAcctCorpCardExp[i];
    }

    public void setDefaultAcctCorpCardExp(int i, SearchColumnSelectField _value) {
        this.defaultAcctCorpCardExp[i] = _value;
    }

    public SearchColumnSelectField[] getDefaultExpenseReportCurrency() {
        return this.defaultExpenseReportCurrency;
    }

    public void setDefaultExpenseReportCurrency(SearchColumnSelectField[] defaultExpenseReportCurrency) {
        this.defaultExpenseReportCurrency = defaultExpenseReportCurrency;
    }

    public SearchColumnSelectField getDefaultExpenseReportCurrency(int i) {
        return this.defaultExpenseReportCurrency[i];
    }

    public void setDefaultExpenseReportCurrency(int i, SearchColumnSelectField _value) {
        this.defaultExpenseReportCurrency[i] = _value;
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

    public SearchColumnSelectField[] getDepartment() {
        return this.department;
    }

    public void setDepartment(SearchColumnSelectField[] department) {
        this.department = department;
    }

    public SearchColumnSelectField getDepartment(int i) {
        return this.department[i];
    }

    public void setDepartment(int i, SearchColumnSelectField _value) {
        this.department[i] = _value;
    }

    public SearchColumnBooleanField[] getEligibleForCommission() {
        return this.eligibleForCommission;
    }

    public void setEligibleForCommission(SearchColumnBooleanField[] eligibleForCommission) {
        this.eligibleForCommission = eligibleForCommission;
    }

    public SearchColumnBooleanField getEligibleForCommission(int i) {
        return this.eligibleForCommission[i];
    }

    public void setEligibleForCommission(int i, SearchColumnBooleanField _value) {
        this.eligibleForCommission[i] = _value;
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

    public SearchColumnStringField[] getEmbossedName() {
        return this.embossedName;
    }

    public void setEmbossedName(SearchColumnStringField[] embossedName) {
        this.embossedName = embossedName;
    }

    public SearchColumnStringField getEmbossedName(int i) {
        return this.embossedName[i];
    }

    public void setEmbossedName(int i, SearchColumnStringField _value) {
        this.embossedName[i] = _value;
    }

    public SearchColumnSelectField[] getEmployeeStatus() {
        return this.employeeStatus;
    }

    public void setEmployeeStatus(SearchColumnSelectField[] employeeStatus) {
        this.employeeStatus = employeeStatus;
    }

    public SearchColumnSelectField getEmployeeStatus(int i) {
        return this.employeeStatus[i];
    }

    public void setEmployeeStatus(int i, SearchColumnSelectField _value) {
        this.employeeStatus[i] = _value;
    }

    public SearchColumnSelectField[] getEmployeeType() {
        return this.employeeType;
    }

    public void setEmployeeType(SearchColumnSelectField[] employeeType) {
        this.employeeType = employeeType;
    }

    public SearchColumnSelectField getEmployeeType(int i) {
        return this.employeeType[i];
    }

    public void setEmployeeType(int i, SearchColumnSelectField _value) {
        this.employeeType[i] = _value;
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

    public SearchColumnSelectField[] getEthnicity() {
        return this.ethnicity;
    }

    public void setEthnicity(SearchColumnSelectField[] ethnicity) {
        this.ethnicity = ethnicity;
    }

    public SearchColumnSelectField getEthnicity(int i) {
        return this.ethnicity[i];
    }

    public void setEthnicity(int i, SearchColumnSelectField _value) {
        this.ethnicity[i] = _value;
    }

    public SearchColumnDoubleField[] getExpenseLimit() {
        return this.expenseLimit;
    }

    public void setExpenseLimit(SearchColumnDoubleField[] expenseLimit) {
        this.expenseLimit = expenseLimit;
    }

    public SearchColumnDoubleField getExpenseLimit(int i) {
        return this.expenseLimit[i];
    }

    public void setExpenseLimit(int i, SearchColumnDoubleField _value) {
        this.expenseLimit[i] = _value;
    }

    public SearchColumnSelectField[] getExpenseReportCurrency() {
        return this.expenseReportCurrency;
    }

    public void setExpenseReportCurrency(SearchColumnSelectField[] expenseReportCurrency) {
        this.expenseReportCurrency = expenseReportCurrency;
    }

    public SearchColumnSelectField getExpenseReportCurrency(int i) {
        return this.expenseReportCurrency[i];
    }

    public void setExpenseReportCurrency(int i, SearchColumnSelectField _value) {
        this.expenseReportCurrency[i] = _value;
    }

    public SearchColumnDateField[] getExpiration() {
        return this.expiration;
    }

    public void setExpiration(SearchColumnDateField[] expiration) {
        this.expiration = expiration;
    }

    public SearchColumnDateField getExpiration(int i) {
        return this.expiration[i];
    }

    public void setExpiration(int i, SearchColumnDateField _value) {
        this.expiration[i] = _value;
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

    public SearchColumnEnumSelectField[] getGender() {
        return this.gender;
    }

    public void setGender(SearchColumnEnumSelectField[] gender) {
        this.gender = gender;
    }

    public SearchColumnEnumSelectField getGender(int i) {
        return this.gender[i];
    }

    public void setGender(int i, SearchColumnEnumSelectField _value) {
        this.gender[i] = _value;
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

    public SearchColumnDateField[] getHireDate() {
        return this.hireDate;
    }

    public void setHireDate(SearchColumnDateField[] hireDate) {
        this.hireDate = hireDate;
    }

    public SearchColumnDateField getHireDate(int i) {
        return this.hireDate[i];
    }

    public void setHireDate(int i, SearchColumnDateField _value) {
        this.hireDate[i] = _value;
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

    public SearchColumnBooleanField[] getI9Verified() {
        return this.i9Verified;
    }

    public void setI9Verified(SearchColumnBooleanField[] i9Verified) {
        this.i9Verified = i9Verified;
    }

    public SearchColumnBooleanField getI9Verified(int i) {
        return this.i9Verified[i];
    }

    public void setI9Verified(int i, SearchColumnBooleanField _value) {
        this.i9Verified[i] = _value;
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

    public SearchColumnBooleanField[] getIsJobManager() {
        return this.isJobManager;
    }

    public void setIsJobManager(SearchColumnBooleanField[] isJobManager) {
        this.isJobManager = isJobManager;
    }

    public SearchColumnBooleanField getIsJobManager(int i) {
        return this.isJobManager[i];
    }

    public void setIsJobManager(int i, SearchColumnBooleanField _value) {
        this.isJobManager[i] = _value;
    }

    public SearchColumnBooleanField[] getIsJobResource() {
        return this.isJobResource;
    }

    public void setIsJobResource(SearchColumnBooleanField[] isJobResource) {
        this.isJobResource = isJobResource;
    }

    public SearchColumnBooleanField getIsJobResource(int i) {
        return this.isJobResource[i];
    }

    public void setIsJobResource(int i, SearchColumnBooleanField _value) {
        this.isJobResource[i] = _value;
    }

    public SearchColumnBooleanField[] getIsSalesRep() {
        return this.isSalesRep;
    }

    public void setIsSalesRep(SearchColumnBooleanField[] isSalesRep) {
        this.isSalesRep = isSalesRep;
    }

    public SearchColumnBooleanField getIsSalesRep(int i) {
        return this.isSalesRep[i];
    }

    public void setIsSalesRep(int i, SearchColumnBooleanField _value) {
        this.isSalesRep[i] = _value;
    }

    public SearchColumnBooleanField[] getIsSupportRep() {
        return this.isSupportRep;
    }

    public void setIsSupportRep(SearchColumnBooleanField[] isSupportRep) {
        this.isSupportRep = isSupportRep;
    }

    public SearchColumnBooleanField getIsSupportRep(int i) {
        return this.isSupportRep[i];
    }

    public void setIsSupportRep(int i, SearchColumnBooleanField _value) {
        this.isSupportRep[i] = _value;
    }

    public SearchColumnBooleanField[] getIsTemplate() {
        return this.isTemplate;
    }

    public void setIsTemplate(SearchColumnBooleanField[] isTemplate) {
        this.isTemplate = isTemplate;
    }

    public SearchColumnBooleanField getIsTemplate(int i) {
        return this.isTemplate[i];
    }

    public void setIsTemplate(int i, SearchColumnBooleanField _value) {
        this.isTemplate[i] = _value;
    }

    public SearchColumnSelectField[] getJob() {
        return this.job;
    }

    public void setJob(SearchColumnSelectField[] job) {
        this.job = job;
    }

    public SearchColumnSelectField getJob(int i) {
        return this.job[i];
    }

    public void setJob(int i, SearchColumnSelectField _value) {
        this.job[i] = _value;
    }

    public SearchColumnDoubleField[] getLaborCost() {
        return this.laborCost;
    }

    public void setLaborCost(SearchColumnDoubleField[] laborCost) {
        this.laborCost = laborCost;
    }

    public SearchColumnDoubleField getLaborCost(int i) {
        return this.laborCost[i];
    }

    public void setLaborCost(int i, SearchColumnDoubleField _value) {
        this.laborCost[i] = _value;
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

    public SearchColumnDateField[] getLastPaidDate() {
        return this.lastPaidDate;
    }

    public void setLastPaidDate(SearchColumnDateField[] lastPaidDate) {
        this.lastPaidDate = lastPaidDate;
    }

    public SearchColumnDateField getLastPaidDate(int i) {
        return this.lastPaidDate[i];
    }

    public void setLastPaidDate(int i, SearchColumnDateField _value) {
        this.lastPaidDate[i] = _value;
    }

    public SearchColumnDateField[] getLastReviewDate() {
        return this.lastReviewDate;
    }

    public void setLastReviewDate(SearchColumnDateField[] lastReviewDate) {
        this.lastReviewDate = lastReviewDate;
    }

    public SearchColumnDateField getLastReviewDate(int i) {
        return this.lastReviewDate[i];
    }

    public void setLastReviewDate(int i, SearchColumnDateField _value) {
        this.lastReviewDate[i] = _value;
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

    public SearchColumnSelectField[] getLocation() {
        return this.location;
    }

    public void setLocation(SearchColumnSelectField[] location) {
        this.location = location;
    }

    public SearchColumnSelectField getLocation(int i) {
        return this.location[i];
    }

    public void setLocation(int i, SearchColumnSelectField _value) {
        this.location[i] = _value;
    }

    public SearchColumnSelectField[] getMaritalStatus() {
        return this.maritalStatus;
    }

    public void setMaritalStatus(SearchColumnSelectField[] maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public SearchColumnSelectField getMaritalStatus(int i) {
        return this.maritalStatus[i];
    }

    public void setMaritalStatus(int i, SearchColumnSelectField _value) {
        this.maritalStatus[i] = _value;
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

    public SearchColumnDateField[] getNextReviewDate() {
        return this.nextReviewDate;
    }

    public void setNextReviewDate(SearchColumnDateField[] nextReviewDate) {
        this.nextReviewDate = nextReviewDate;
    }

    public SearchColumnDateField getNextReviewDate(int i) {
        return this.nextReviewDate[i];
    }

    public void setNextReviewDate(int i, SearchColumnDateField _value) {
        this.nextReviewDate[i] = _value;
    }

    public SearchColumnBooleanField[] getOfflineAccess() {
        return this.offlineAccess;
    }

    public void setOfflineAccess(SearchColumnBooleanField[] offlineAccess) {
        this.offlineAccess = offlineAccess;
    }

    public SearchColumnBooleanField getOfflineAccess(int i) {
        return this.offlineAccess[i];
    }

    public void setOfflineAccess(int i, SearchColumnBooleanField _value) {
        this.offlineAccess[i] = _value;
    }

    public SearchColumnEnumSelectField[] getPayFrequency() {
        return this.payFrequency;
    }

    public void setPayFrequency(SearchColumnEnumSelectField[] payFrequency) {
        this.payFrequency = payFrequency;
    }

    public SearchColumnEnumSelectField getPayFrequency(int i) {
        return this.payFrequency[i];
    }

    public void setPayFrequency(int i, SearchColumnEnumSelectField _value) {
        this.payFrequency[i] = _value;
    }

    public SearchColumnDateField[] getPermChangeDate() {
        return this.permChangeDate;
    }

    public void setPermChangeDate(SearchColumnDateField[] permChangeDate) {
        this.permChangeDate = permChangeDate;
    }

    public SearchColumnDateField getPermChangeDate(int i) {
        return this.permChangeDate[i];
    }

    public void setPermChangeDate(int i, SearchColumnDateField _value) {
        this.permChangeDate[i] = _value;
    }

    public SearchColumnStringField[] getPermChangeLevel() {
        return this.permChangeLevel;
    }

    public void setPermChangeLevel(SearchColumnStringField[] permChangeLevel) {
        this.permChangeLevel = permChangeLevel;
    }

    public SearchColumnStringField getPermChangeLevel(int i) {
        return this.permChangeLevel[i];
    }

    public void setPermChangeLevel(int i, SearchColumnStringField _value) {
        this.permChangeLevel[i] = _value;
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

    public SearchColumnEnumSelectField[] getPermissionChange() {
        return this.permissionChange;
    }

    public void setPermissionChange(SearchColumnEnumSelectField[] permissionChange) {
        this.permissionChange = permissionChange;
    }

    public SearchColumnEnumSelectField getPermissionChange(int i) {
        return this.permissionChange[i];
    }

    public void setPermissionChange(int i, SearchColumnEnumSelectField _value) {
        this.permissionChange[i] = _value;
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

    public SearchColumnStringField[] getPositionTitle() {
        return this.positionTitle;
    }

    public void setPositionTitle(SearchColumnStringField[] positionTitle) {
        this.positionTitle = positionTitle;
    }

    public SearchColumnStringField getPositionTitle(int i) {
        return this.positionTitle[i];
    }

    public void setPositionTitle(int i, SearchColumnStringField _value) {
        this.positionTitle[i] = _value;
    }

    public SearchColumnDoubleField[] getPrimaryEarningAmount() {
        return this.primaryEarningAmount;
    }

    public void setPrimaryEarningAmount(SearchColumnDoubleField[] primaryEarningAmount) {
        this.primaryEarningAmount = primaryEarningAmount;
    }

    public SearchColumnDoubleField getPrimaryEarningAmount(int i) {
        return this.primaryEarningAmount[i];
    }

    public void setPrimaryEarningAmount(int i, SearchColumnDoubleField _value) {
        this.primaryEarningAmount[i] = _value;
    }

    public SearchColumnStringField[] getPrimaryEarningItem() {
        return this.primaryEarningItem;
    }

    public void setPrimaryEarningItem(SearchColumnStringField[] primaryEarningItem) {
        this.primaryEarningItem = primaryEarningItem;
    }

    public SearchColumnStringField getPrimaryEarningItem(int i) {
        return this.primaryEarningItem[i];
    }

    public void setPrimaryEarningItem(int i, SearchColumnStringField _value) {
        this.primaryEarningItem[i] = _value;
    }

    public SearchColumnStringField[] getPrimaryEarningType() {
        return this.primaryEarningType;
    }

    public void setPrimaryEarningType(SearchColumnStringField[] primaryEarningType) {
        this.primaryEarningType = primaryEarningType;
    }

    public SearchColumnStringField getPrimaryEarningType(int i) {
        return this.primaryEarningType[i];
    }

    public void setPrimaryEarningType(int i, SearchColumnStringField _value) {
        this.primaryEarningType[i] = _value;
    }

    public SearchColumnDoubleField[] getPurchaseOrderApprovalLimit() {
        return this.purchaseOrderApprovalLimit;
    }

    public void setPurchaseOrderApprovalLimit(SearchColumnDoubleField[] purchaseOrderApprovalLimit) {
        this.purchaseOrderApprovalLimit = purchaseOrderApprovalLimit;
    }

    public SearchColumnDoubleField getPurchaseOrderApprovalLimit(int i) {
        return this.purchaseOrderApprovalLimit[i];
    }

    public void setPurchaseOrderApprovalLimit(int i, SearchColumnDoubleField _value) {
        this.purchaseOrderApprovalLimit[i] = _value;
    }

    public SearchColumnSelectField[] getPurchaseOrderApprover() {
        return this.purchaseOrderApprover;
    }

    public void setPurchaseOrderApprover(SearchColumnSelectField[] purchaseOrderApprover) {
        this.purchaseOrderApprover = purchaseOrderApprover;
    }

    public SearchColumnSelectField getPurchaseOrderApprover(int i) {
        return this.purchaseOrderApprover[i];
    }

    public void setPurchaseOrderApprover(int i, SearchColumnSelectField _value) {
        this.purchaseOrderApprover[i] = _value;
    }

    public SearchColumnDoubleField[] getPurchaseOrderLimit() {
        return this.purchaseOrderLimit;
    }

    public void setPurchaseOrderLimit(SearchColumnDoubleField[] purchaseOrderLimit) {
        this.purchaseOrderLimit = purchaseOrderLimit;
    }

    public SearchColumnDoubleField getPurchaseOrderLimit(int i) {
        return this.purchaseOrderLimit[i];
    }

    public void setPurchaseOrderLimit(int i, SearchColumnDoubleField _value) {
        this.purchaseOrderLimit[i] = _value;
    }

    public SearchColumnDateField[] getReleaseDate() {
        return this.releaseDate;
    }

    public void setReleaseDate(SearchColumnDateField[] releaseDate) {
        this.releaseDate = releaseDate;
    }

    public SearchColumnDateField getReleaseDate(int i) {
        return this.releaseDate[i];
    }

    public void setReleaseDate(int i, SearchColumnDateField _value) {
        this.releaseDate[i] = _value;
    }

    public SearchColumnSelectField[] getResidentStatus() {
        return this.residentStatus;
    }

    public void setResidentStatus(SearchColumnSelectField[] residentStatus) {
        this.residentStatus = residentStatus;
    }

    public SearchColumnSelectField getResidentStatus(int i) {
        return this.residentStatus[i];
    }

    public void setResidentStatus(int i, SearchColumnSelectField _value) {
        this.residentStatus[i] = _value;
    }

    public SearchColumnSelectField[] getRole() {
        return this.role;
    }

    public void setRole(SearchColumnSelectField[] role) {
        this.role = role;
    }

    public SearchColumnSelectField getRole(int i) {
        return this.role[i];
    }

    public void setRole(int i, SearchColumnSelectField _value) {
        this.role[i] = _value;
    }

    public SearchColumnStringField[] getRoleChange() {
        return this.roleChange;
    }

    public void setRoleChange(SearchColumnStringField[] roleChange) {
        this.roleChange = roleChange;
    }

    public SearchColumnStringField getRoleChange(int i) {
        return this.roleChange[i];
    }

    public void setRoleChange(int i, SearchColumnStringField _value) {
        this.roleChange[i] = _value;
    }

    public SearchColumnStringField[] getRoleChangeAction() {
        return this.roleChangeAction;
    }

    public void setRoleChangeAction(SearchColumnStringField[] roleChangeAction) {
        this.roleChangeAction = roleChangeAction;
    }

    public SearchColumnStringField getRoleChangeAction(int i) {
        return this.roleChangeAction[i];
    }

    public void setRoleChangeAction(int i, SearchColumnStringField _value) {
        this.roleChangeAction[i] = _value;
    }

    public SearchColumnDateField[] getRoleChangeDate() {
        return this.roleChangeDate;
    }

    public void setRoleChangeDate(SearchColumnDateField[] roleChangeDate) {
        this.roleChangeDate = roleChangeDate;
    }

    public SearchColumnDateField getRoleChangeDate(int i) {
        return this.roleChangeDate[i];
    }

    public void setRoleChangeDate(int i, SearchColumnDateField _value) {
        this.roleChangeDate[i] = _value;
    }

    public SearchColumnSelectField[] getSalesRole() {
        return this.salesRole;
    }

    public void setSalesRole(SearchColumnSelectField[] salesRole) {
        this.salesRole = salesRole;
    }

    public SearchColumnSelectField getSalesRole(int i) {
        return this.salesRole[i];
    }

    public void setSalesRole(int i, SearchColumnSelectField _value) {
        this.salesRole[i] = _value;
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

    public SearchColumnStringField[] getSocialSecurityNumber() {
        return this.socialSecurityNumber;
    }

    public void setSocialSecurityNumber(SearchColumnStringField[] socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public SearchColumnStringField getSocialSecurityNumber(int i) {
        return this.socialSecurityNumber[i];
    }

    public void setSocialSecurityNumber(int i, SearchColumnStringField _value) {
        this.socialSecurityNumber[i] = _value;
    }

    public SearchColumnDateField[] getStartDateTimeOffCalc() {
        return this.startDateTimeOffCalc;
    }

    public void setStartDateTimeOffCalc(SearchColumnDateField[] startDateTimeOffCalc) {
        this.startDateTimeOffCalc = startDateTimeOffCalc;
    }

    public SearchColumnDateField getStartDateTimeOffCalc(int i) {
        return this.startDateTimeOffCalc[i];
    }

    public void setStartDateTimeOffCalc(int i, SearchColumnDateField _value) {
        this.startDateTimeOffCalc[i] = _value;
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

    public SearchColumnSelectField[] getSupervisor() {
        return this.supervisor;
    }

    public void setSupervisor(SearchColumnSelectField[] supervisor) {
        this.supervisor = supervisor;
    }

    public SearchColumnSelectField getSupervisor(int i) {
        return this.supervisor[i];
    }

    public void setSupervisor(int i, SearchColumnSelectField _value) {
        this.supervisor[i] = _value;
    }

    public SearchColumnDoubleField[] getTargetUtilization() {
        return this.targetUtilization;
    }

    public void setTargetUtilization(SearchColumnDoubleField[] targetUtilization) {
        this.targetUtilization = targetUtilization;
    }

    public SearchColumnDoubleField getTargetUtilization(int i) {
        return this.targetUtilization[i];
    }

    public void setTargetUtilization(int i, SearchColumnDoubleField _value) {
        this.targetUtilization[i] = _value;
    }

    public SearchColumnEnumSelectField[] getTerminationCategory() {
        return this.terminationCategory;
    }

    public void setTerminationCategory(SearchColumnEnumSelectField[] terminationCategory) {
        this.terminationCategory = terminationCategory;
    }

    public SearchColumnEnumSelectField getTerminationCategory(int i) {
        return this.terminationCategory[i];
    }

    public void setTerminationCategory(int i, SearchColumnEnumSelectField _value) {
        this.terminationCategory[i] = _value;
    }

    public SearchColumnStringField[] getTerminationDetails() {
        return this.terminationDetails;
    }

    public void setTerminationDetails(SearchColumnStringField[] terminationDetails) {
        this.terminationDetails = terminationDetails;
    }

    public SearchColumnStringField getTerminationDetails(int i) {
        return this.terminationDetails[i];
    }

    public void setTerminationDetails(int i, SearchColumnStringField _value) {
        this.terminationDetails[i] = _value;
    }

    public SearchColumnSelectField[] getTerminationReason() {
        return this.terminationReason;
    }

    public void setTerminationReason(SearchColumnSelectField[] terminationReason) {
        this.terminationReason = terminationReason;
    }

    public SearchColumnSelectField getTerminationReason(int i) {
        return this.terminationReason[i];
    }

    public void setTerminationReason(int i, SearchColumnSelectField _value) {
        this.terminationReason[i] = _value;
    }

    public SearchColumnEnumSelectField[] getTerminationRegretted() {
        return this.terminationRegretted;
    }

    public void setTerminationRegretted(SearchColumnEnumSelectField[] terminationRegretted) {
        this.terminationRegretted = terminationRegretted;
    }

    public SearchColumnEnumSelectField getTerminationRegretted(int i) {
        return this.terminationRegretted[i];
    }

    public void setTerminationRegretted(int i, SearchColumnEnumSelectField _value) {
        this.terminationRegretted[i] = _value;
    }

    public SearchColumnSelectField[] getTimeApprover() {
        return this.timeApprover;
    }

    public void setTimeApprover(SearchColumnSelectField[] timeApprover) {
        this.timeApprover = timeApprover;
    }

    public SearchColumnSelectField getTimeApprover(int i) {
        return this.timeApprover[i];
    }

    public void setTimeApprover(int i, SearchColumnSelectField _value) {
        this.timeApprover[i] = _value;
    }

    public SearchColumnStringField[] getTimeOffPlan() {
        return this.timeOffPlan;
    }

    public void setTimeOffPlan(SearchColumnStringField[] timeOffPlan) {
        this.timeOffPlan = timeOffPlan;
    }

    public SearchColumnStringField getTimeOffPlan(int i) {
        return this.timeOffPlan[i];
    }

    public void setTimeOffPlan(int i, SearchColumnStringField _value) {
        this.timeOffPlan[i] = _value;
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

    public SearchColumnBooleanField[] getUsePerquest() {
        return this.usePerquest;
    }

    public void setUsePerquest(SearchColumnBooleanField[] usePerquest) {
        this.usePerquest = usePerquest;
    }

    public SearchColumnBooleanField getUsePerquest(int i) {
        return this.usePerquest[i];
    }

    public void setUsePerquest(int i, SearchColumnBooleanField _value) {
        this.usePerquest[i] = _value;
    }

    public SearchColumnBooleanField[] getUseTimeData() {
        return this.useTimeData;
    }

    public void setUseTimeData(SearchColumnBooleanField[] useTimeData) {
        this.useTimeData = useTimeData;
    }

    public SearchColumnBooleanField getUseTimeData(int i) {
        return this.useTimeData[i];
    }

    public void setUseTimeData(int i, SearchColumnBooleanField _value) {
        this.useTimeData[i] = _value;
    }

    public SearchColumnDateField[] getVisaExpDate() {
        return this.visaExpDate;
    }

    public void setVisaExpDate(SearchColumnDateField[] visaExpDate) {
        this.visaExpDate = visaExpDate;
    }

    public SearchColumnDateField getVisaExpDate(int i) {
        return this.visaExpDate[i];
    }

    public void setVisaExpDate(int i, SearchColumnDateField _value) {
        this.visaExpDate[i] = _value;
    }

    public SearchColumnSelectField[] getVisaType() {
        return this.visaType;
    }

    public void setVisaType(SearchColumnSelectField[] visaType) {
        this.visaType = visaType;
    }

    public SearchColumnSelectField getVisaType(int i) {
        return this.visaType[i];
    }

    public void setVisaType(int i, SearchColumnSelectField _value) {
        this.visaType[i] = _value;
    }

    public SearchColumnStringField[] getWorkCalendar() {
        return this.workCalendar;
    }

    public void setWorkCalendar(SearchColumnStringField[] workCalendar) {
        this.workCalendar = workCalendar;
    }

    public SearchColumnStringField getWorkCalendar(int i) {
        return this.workCalendar[i];
    }

    public void setWorkCalendar(int i, SearchColumnStringField _value) {
        this.workCalendar[i] = _value;
    }

    public SearchColumnSelectField[] getWorkplace() {
        return this.workplace;
    }

    public void setWorkplace(SearchColumnSelectField[] workplace) {
        this.workplace = workplace;
    }

    public SearchColumnSelectField getWorkplace(int i) {
        return this.workplace[i];
    }

    public void setWorkplace(int i, SearchColumnSelectField _value) {
        this.workplace[i] = _value;
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
        if (!(obj instanceof EmployeeSearchRowBasic)) {
            return false;
        }
        EmployeeSearchRowBasic other = (EmployeeSearchRowBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.accountNumber == null && other.getAccountNumber() == null || this.accountNumber != null && Arrays.equals(this.accountNumber, other.getAccountNumber())) && (this.address == null && other.getAddress() == null || this.address != null && Arrays.equals(this.address, other.getAddress())) && (this.address1 == null && other.getAddress1() == null || this.address1 != null && Arrays.equals(this.address1, other.getAddress1())) && (this.address2 == null && other.getAddress2() == null || this.address2 != null && Arrays.equals(this.address2, other.getAddress2())) && (this.address3 == null && other.getAddress3() == null || this.address3 != null && Arrays.equals(this.address3, other.getAddress3())) && (this.addressee == null && other.getAddressee() == null || this.addressee != null && Arrays.equals(this.addressee, other.getAddressee())) && (this.addressInternalId == null && other.getAddressInternalId() == null || this.addressInternalId != null && Arrays.equals(this.addressInternalId, other.getAddressInternalId())) && (this.addressLabel == null && other.getAddressLabel() == null || this.addressLabel != null && Arrays.equals(this.addressLabel, other.getAddressLabel())) && (this.addressPhone == null && other.getAddressPhone() == null || this.addressPhone != null && Arrays.equals(this.addressPhone, other.getAddressPhone())) && (this.alienNumber == null && other.getAlienNumber() == null || this.alienNumber != null && Arrays.equals(this.alienNumber, other.getAlienNumber())) && (this.allocation == null && other.getAllocation() == null || this.allocation != null && Arrays.equals(this.allocation, other.getAllocation())) && (this.altEmail == null && other.getAltEmail() == null || this.altEmail != null && Arrays.equals(this.altEmail, other.getAltEmail())) && (this.altName == null && other.getAltName() == null || this.altName != null && Arrays.equals(this.altName, other.getAltName())) && (this.altPhone == null && other.getAltPhone() == null || this.altPhone != null && Arrays.equals(this.altPhone, other.getAltPhone())) && (this.approvalLimit == null && other.getApprovalLimit() == null || this.approvalLimit != null && Arrays.equals(this.approvalLimit, other.getApprovalLimit())) && (this.approver == null && other.getApprover() == null || this.approver != null && Arrays.equals(this.approver, other.getApprover())) && (this.attention == null && other.getAttention() == null || this.attention != null && Arrays.equals(this.attention, other.getAttention())) && (this.authWorkDate == null && other.getAuthWorkDate() == null || this.authWorkDate != null && Arrays.equals(this.authWorkDate, other.getAuthWorkDate())) && (this.baseWage == null && other.getBaseWage() == null || this.baseWage != null && Arrays.equals(this.baseWage, other.getBaseWage())) && (this.baseWageType == null && other.getBaseWageType() == null || this.baseWageType != null && Arrays.equals(this.baseWageType, other.getBaseWageType())) && (this.billAddress == null && other.getBillAddress() == null || this.billAddress != null && Arrays.equals(this.billAddress, other.getBillAddress())) && (this.billAddress1 == null && other.getBillAddress1() == null || this.billAddress1 != null && Arrays.equals(this.billAddress1, other.getBillAddress1())) && (this.billAddress2 == null && other.getBillAddress2() == null || this.billAddress2 != null && Arrays.equals(this.billAddress2, other.getBillAddress2())) && (this.billAddress3 == null && other.getBillAddress3() == null || this.billAddress3 != null && Arrays.equals(this.billAddress3, other.getBillAddress3())) && (this.billAddressee == null && other.getBillAddressee() == null || this.billAddressee != null && Arrays.equals(this.billAddressee, other.getBillAddressee())) && (this.billAttention == null && other.getBillAttention() == null || this.billAttention != null && Arrays.equals(this.billAttention, other.getBillAttention())) && (this.billCity == null && other.getBillCity() == null || this.billCity != null && Arrays.equals(this.billCity, other.getBillCity())) && (this.billCountry == null && other.getBillCountry() == null || this.billCountry != null && Arrays.equals(this.billCountry, other.getBillCountry())) && (this.billCountryCode == null && other.getBillCountryCode() == null || this.billCountryCode != null && Arrays.equals(this.billCountryCode, other.getBillCountryCode())) && (this.billingClass == null && other.getBillingClass() == null || this.billingClass != null && Arrays.equals(this.billingClass, other.getBillingClass())) && (this.billPhone == null && other.getBillPhone() == null || this.billPhone != null && Arrays.equals(this.billPhone, other.getBillPhone())) && (this.billState == null && other.getBillState() == null || this.billState != null && Arrays.equals(this.billState, other.getBillState())) && (this.billZipCode == null && other.getBillZipCode() == null || this.billZipCode != null && Arrays.equals(this.billZipCode, other.getBillZipCode())) && (this.birthDate == null && other.getBirthDate() == null || this.birthDate != null && Arrays.equals(this.birthDate, other.getBirthDate())) && (this.birthDay == null && other.getBirthDay() == null || this.birthDay != null && Arrays.equals(this.birthDay, other.getBirthDay())) && (this.bonusTarget == null && other.getBonusTarget() == null || this.bonusTarget != null && Arrays.equals(this.bonusTarget, other.getBonusTarget())) && (this.bonusTargetComment == null && other.getBonusTargetComment() == null || this.bonusTargetComment != null && Arrays.equals(this.bonusTargetComment, other.getBonusTargetComment())) && (this.bonusTargetPayFrequency == null && other.getBonusTargetPayFrequency() == null || this.bonusTargetPayFrequency != null && Arrays.equals(this.bonusTargetPayFrequency, other.getBonusTargetPayFrequency())) && (this.bonusTargetType == null && other.getBonusTargetType() == null || this.bonusTargetType != null && Arrays.equals(this.bonusTargetType, other.getBonusTargetType())) && (this.city == null && other.getCity() == null || this.city != null && Arrays.equals(this.city, other.getCity())) && (this._class == null && other.get_class() == null || this._class != null && Arrays.equals(this._class, other.get_class())) && (this.comments == null && other.getComments() == null || this.comments != null && Arrays.equals(this.comments, other.getComments())) && (this.compensationCurrency == null && other.getCompensationCurrency() == null || this.compensationCurrency != null && Arrays.equals(this.compensationCurrency, other.getCompensationCurrency())) && (this.concurrentWebServicesUser == null && other.getConcurrentWebServicesUser() == null || this.concurrentWebServicesUser != null && Arrays.equals(this.concurrentWebServicesUser, other.getConcurrentWebServicesUser())) && (this.corporateCardProfile == null && other.getCorporateCardProfile() == null || this.corporateCardProfile != null && Arrays.equals(this.corporateCardProfile, other.getCorporateCardProfile())) && (this.country == null && other.getCountry() == null || this.country != null && Arrays.equals(this.country, other.getCountry())) && (this.countryCode == null && other.getCountryCode() == null || this.countryCode != null && Arrays.equals(this.countryCode, other.getCountryCode())) && (this.dateCreated == null && other.getDateCreated() == null || this.dateCreated != null && Arrays.equals(this.dateCreated, other.getDateCreated())) && (this.defaultAcctCorpCardExp == null && other.getDefaultAcctCorpCardExp() == null || this.defaultAcctCorpCardExp != null && Arrays.equals(this.defaultAcctCorpCardExp, other.getDefaultAcctCorpCardExp())) && (this.defaultExpenseReportCurrency == null && other.getDefaultExpenseReportCurrency() == null || this.defaultExpenseReportCurrency != null && Arrays.equals(this.defaultExpenseReportCurrency, other.getDefaultExpenseReportCurrency())) && (this.defaultTaxReg == null && other.getDefaultTaxReg() == null || this.defaultTaxReg != null && Arrays.equals(this.defaultTaxReg, other.getDefaultTaxReg())) && (this.department == null && other.getDepartment() == null || this.department != null && Arrays.equals(this.department, other.getDepartment())) && (this.eligibleForCommission == null && other.getEligibleForCommission() == null || this.eligibleForCommission != null && Arrays.equals(this.eligibleForCommission, other.getEligibleForCommission())) && (this.email == null && other.getEmail() == null || this.email != null && Arrays.equals(this.email, other.getEmail())) && (this.embossedName == null && other.getEmbossedName() == null || this.embossedName != null && Arrays.equals(this.embossedName, other.getEmbossedName())) && (this.employeeStatus == null && other.getEmployeeStatus() == null || this.employeeStatus != null && Arrays.equals(this.employeeStatus, other.getEmployeeStatus())) && (this.employeeType == null && other.getEmployeeType() == null || this.employeeType != null && Arrays.equals(this.employeeType, other.getEmployeeType())) && (this.entityId == null && other.getEntityId() == null || this.entityId != null && Arrays.equals(this.entityId, other.getEntityId())) && (this.entityNumber == null && other.getEntityNumber() == null || this.entityNumber != null && Arrays.equals(this.entityNumber, other.getEntityNumber())) && (this.ethnicity == null && other.getEthnicity() == null || this.ethnicity != null && Arrays.equals(this.ethnicity, other.getEthnicity())) && (this.expenseLimit == null && other.getExpenseLimit() == null || this.expenseLimit != null && Arrays.equals(this.expenseLimit, other.getExpenseLimit())) && (this.expenseReportCurrency == null && other.getExpenseReportCurrency() == null || this.expenseReportCurrency != null && Arrays.equals(this.expenseReportCurrency, other.getExpenseReportCurrency())) && (this.expiration == null && other.getExpiration() == null || this.expiration != null && Arrays.equals(this.expiration, other.getExpiration())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && Arrays.equals(this.externalId, other.getExternalId())) && (this.fax == null && other.getFax() == null || this.fax != null && Arrays.equals(this.fax, other.getFax())) && (this.firstName == null && other.getFirstName() == null || this.firstName != null && Arrays.equals(this.firstName, other.getFirstName())) && (this.gender == null && other.getGender() == null || this.gender != null && Arrays.equals(this.gender, other.getGender())) && (this.giveAccess == null && other.getGiveAccess() == null || this.giveAccess != null && Arrays.equals(this.giveAccess, other.getGiveAccess())) && (this.globalSubscriptionStatus == null && other.getGlobalSubscriptionStatus() == null || this.globalSubscriptionStatus != null && Arrays.equals(this.globalSubscriptionStatus, other.getGlobalSubscriptionStatus())) && (this.hireDate == null && other.getHireDate() == null || this.hireDate != null && Arrays.equals(this.hireDate, other.getHireDate())) && (this.homePhone == null && other.getHomePhone() == null || this.homePhone != null && Arrays.equals(this.homePhone, other.getHomePhone())) && (this.i9Verified == null && other.getI9Verified() == null || this.i9Verified != null && Arrays.equals(this.i9Verified, other.getI9Verified())) && (this.image == null && other.getImage() == null || this.image != null && Arrays.equals(this.image, other.getImage())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && Arrays.equals(this.internalId, other.getInternalId())) && (this.isDefaultBilling == null && other.getIsDefaultBilling() == null || this.isDefaultBilling != null && Arrays.equals(this.isDefaultBilling, other.getIsDefaultBilling())) && (this.isDefaultShipping == null && other.getIsDefaultShipping() == null || this.isDefaultShipping != null && Arrays.equals(this.isDefaultShipping, other.getIsDefaultShipping())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && Arrays.equals(this.isInactive, other.getIsInactive())) && (this.isJobManager == null && other.getIsJobManager() == null || this.isJobManager != null && Arrays.equals(this.isJobManager, other.getIsJobManager())) && (this.isJobResource == null && other.getIsJobResource() == null || this.isJobResource != null && Arrays.equals(this.isJobResource, other.getIsJobResource())) && (this.isSalesRep == null && other.getIsSalesRep() == null || this.isSalesRep != null && Arrays.equals(this.isSalesRep, other.getIsSalesRep())) && (this.isSupportRep == null && other.getIsSupportRep() == null || this.isSupportRep != null && Arrays.equals(this.isSupportRep, other.getIsSupportRep())) && (this.isTemplate == null && other.getIsTemplate() == null || this.isTemplate != null && Arrays.equals(this.isTemplate, other.getIsTemplate())) && (this.job == null && other.getJob() == null || this.job != null && Arrays.equals(this.job, other.getJob())) && (this.laborCost == null && other.getLaborCost() == null || this.laborCost != null && Arrays.equals(this.laborCost, other.getLaborCost())) && (this.language == null && other.getLanguage() == null || this.language != null && Arrays.equals(this.language, other.getLanguage())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && Arrays.equals(this.lastModifiedDate, other.getLastModifiedDate())) && (this.lastName == null && other.getLastName() == null || this.lastName != null && Arrays.equals(this.lastName, other.getLastName())) && (this.lastPaidDate == null && other.getLastPaidDate() == null || this.lastPaidDate != null && Arrays.equals(this.lastPaidDate, other.getLastPaidDate())) && (this.lastReviewDate == null && other.getLastReviewDate() == null || this.lastReviewDate != null && Arrays.equals(this.lastReviewDate, other.getLastReviewDate())) && (this.level == null && other.getLevel() == null || this.level != null && Arrays.equals(this.level, other.getLevel())) && (this.location == null && other.getLocation() == null || this.location != null && Arrays.equals(this.location, other.getLocation())) && (this.maritalStatus == null && other.getMaritalStatus() == null || this.maritalStatus != null && Arrays.equals(this.maritalStatus, other.getMaritalStatus())) && (this.middleName == null && other.getMiddleName() == null || this.middleName != null && Arrays.equals(this.middleName, other.getMiddleName())) && (this.mobilePhone == null && other.getMobilePhone() == null || this.mobilePhone != null && Arrays.equals(this.mobilePhone, other.getMobilePhone())) && (this.nextReviewDate == null && other.getNextReviewDate() == null || this.nextReviewDate != null && Arrays.equals(this.nextReviewDate, other.getNextReviewDate())) && (this.offlineAccess == null && other.getOfflineAccess() == null || this.offlineAccess != null && Arrays.equals(this.offlineAccess, other.getOfflineAccess())) && (this.payFrequency == null && other.getPayFrequency() == null || this.payFrequency != null && Arrays.equals(this.payFrequency, other.getPayFrequency())) && (this.permChangeDate == null && other.getPermChangeDate() == null || this.permChangeDate != null && Arrays.equals(this.permChangeDate, other.getPermChangeDate())) && (this.permChangeLevel == null && other.getPermChangeLevel() == null || this.permChangeLevel != null && Arrays.equals(this.permChangeLevel, other.getPermChangeLevel())) && (this.permission == null && other.getPermission() == null || this.permission != null && Arrays.equals(this.permission, other.getPermission())) && (this.permissionChange == null && other.getPermissionChange() == null || this.permissionChange != null && Arrays.equals(this.permissionChange, other.getPermissionChange())) && (this.phone == null && other.getPhone() == null || this.phone != null && Arrays.equals(this.phone, other.getPhone())) && (this.phoneticName == null && other.getPhoneticName() == null || this.phoneticName != null && Arrays.equals(this.phoneticName, other.getPhoneticName())) && (this.positionTitle == null && other.getPositionTitle() == null || this.positionTitle != null && Arrays.equals(this.positionTitle, other.getPositionTitle())) && (this.primaryEarningAmount == null && other.getPrimaryEarningAmount() == null || this.primaryEarningAmount != null && Arrays.equals(this.primaryEarningAmount, other.getPrimaryEarningAmount())) && (this.primaryEarningItem == null && other.getPrimaryEarningItem() == null || this.primaryEarningItem != null && Arrays.equals(this.primaryEarningItem, other.getPrimaryEarningItem())) && (this.primaryEarningType == null && other.getPrimaryEarningType() == null || this.primaryEarningType != null && Arrays.equals(this.primaryEarningType, other.getPrimaryEarningType())) && (this.purchaseOrderApprovalLimit == null && other.getPurchaseOrderApprovalLimit() == null || this.purchaseOrderApprovalLimit != null && Arrays.equals(this.purchaseOrderApprovalLimit, other.getPurchaseOrderApprovalLimit())) && (this.purchaseOrderApprover == null && other.getPurchaseOrderApprover() == null || this.purchaseOrderApprover != null && Arrays.equals(this.purchaseOrderApprover, other.getPurchaseOrderApprover())) && (this.purchaseOrderLimit == null && other.getPurchaseOrderLimit() == null || this.purchaseOrderLimit != null && Arrays.equals(this.purchaseOrderLimit, other.getPurchaseOrderLimit())) && (this.releaseDate == null && other.getReleaseDate() == null || this.releaseDate != null && Arrays.equals(this.releaseDate, other.getReleaseDate())) && (this.residentStatus == null && other.getResidentStatus() == null || this.residentStatus != null && Arrays.equals(this.residentStatus, other.getResidentStatus())) && (this.role == null && other.getRole() == null || this.role != null && Arrays.equals(this.role, other.getRole())) && (this.roleChange == null && other.getRoleChange() == null || this.roleChange != null && Arrays.equals(this.roleChange, other.getRoleChange())) && (this.roleChangeAction == null && other.getRoleChangeAction() == null || this.roleChangeAction != null && Arrays.equals(this.roleChangeAction, other.getRoleChangeAction())) && (this.roleChangeDate == null && other.getRoleChangeDate() == null || this.roleChangeDate != null && Arrays.equals(this.roleChangeDate, other.getRoleChangeDate())) && (this.salesRole == null && other.getSalesRole() == null || this.salesRole != null && Arrays.equals(this.salesRole, other.getSalesRole())) && (this.salutation == null && other.getSalutation() == null || this.salutation != null && Arrays.equals(this.salutation, other.getSalutation())) && (this.shipAddress1 == null && other.getShipAddress1() == null || this.shipAddress1 != null && Arrays.equals(this.shipAddress1, other.getShipAddress1())) && (this.shipAddress2 == null && other.getShipAddress2() == null || this.shipAddress2 != null && Arrays.equals(this.shipAddress2, other.getShipAddress2())) && (this.shipAddress3 == null && other.getShipAddress3() == null || this.shipAddress3 != null && Arrays.equals(this.shipAddress3, other.getShipAddress3())) && (this.shipAddressee == null && other.getShipAddressee() == null || this.shipAddressee != null && Arrays.equals(this.shipAddressee, other.getShipAddressee())) && (this.shipAttention == null && other.getShipAttention() == null || this.shipAttention != null && Arrays.equals(this.shipAttention, other.getShipAttention())) && (this.shipCity == null && other.getShipCity() == null || this.shipCity != null && Arrays.equals(this.shipCity, other.getShipCity())) && (this.shipCountry == null && other.getShipCountry() == null || this.shipCountry != null && Arrays.equals(this.shipCountry, other.getShipCountry())) && (this.shipCountryCode == null && other.getShipCountryCode() == null || this.shipCountryCode != null && Arrays.equals(this.shipCountryCode, other.getShipCountryCode())) && (this.shipPhone == null && other.getShipPhone() == null || this.shipPhone != null && Arrays.equals(this.shipPhone, other.getShipPhone())) && (this.shipState == null && other.getShipState() == null || this.shipState != null && Arrays.equals(this.shipState, other.getShipState())) && (this.shipZip == null && other.getShipZip() == null || this.shipZip != null && Arrays.equals(this.shipZip, other.getShipZip())) && (this.socialSecurityNumber == null && other.getSocialSecurityNumber() == null || this.socialSecurityNumber != null && Arrays.equals(this.socialSecurityNumber, other.getSocialSecurityNumber())) && (this.startDateTimeOffCalc == null && other.getStartDateTimeOffCalc() == null || this.startDateTimeOffCalc != null && Arrays.equals(this.startDateTimeOffCalc, other.getStartDateTimeOffCalc())) && (this.state == null && other.getState() == null || this.state != null && Arrays.equals(this.state, other.getState())) && (this.subscription == null && other.getSubscription() == null || this.subscription != null && Arrays.equals(this.subscription, other.getSubscription())) && (this.subscriptionDate == null && other.getSubscriptionDate() == null || this.subscriptionDate != null && Arrays.equals(this.subscriptionDate, other.getSubscriptionDate())) && (this.subscriptionStatus == null && other.getSubscriptionStatus() == null || this.subscriptionStatus != null && Arrays.equals(this.subscriptionStatus, other.getSubscriptionStatus())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && Arrays.equals(this.subsidiary, other.getSubsidiary())) && (this.supervisor == null && other.getSupervisor() == null || this.supervisor != null && Arrays.equals(this.supervisor, other.getSupervisor())) && (this.targetUtilization == null && other.getTargetUtilization() == null || this.targetUtilization != null && Arrays.equals(this.targetUtilization, other.getTargetUtilization())) && (this.terminationCategory == null && other.getTerminationCategory() == null || this.terminationCategory != null && Arrays.equals(this.terminationCategory, other.getTerminationCategory())) && (this.terminationDetails == null && other.getTerminationDetails() == null || this.terminationDetails != null && Arrays.equals(this.terminationDetails, other.getTerminationDetails())) && (this.terminationReason == null && other.getTerminationReason() == null || this.terminationReason != null && Arrays.equals(this.terminationReason, other.getTerminationReason())) && (this.terminationRegretted == null && other.getTerminationRegretted() == null || this.terminationRegretted != null && Arrays.equals(this.terminationRegretted, other.getTerminationRegretted())) && (this.timeApprover == null && other.getTimeApprover() == null || this.timeApprover != null && Arrays.equals(this.timeApprover, other.getTimeApprover())) && (this.timeOffPlan == null && other.getTimeOffPlan() == null || this.timeOffPlan != null && Arrays.equals(this.timeOffPlan, other.getTimeOffPlan())) && (this.title == null && other.getTitle() == null || this.title != null && Arrays.equals(this.title, other.getTitle())) && (this.usePerquest == null && other.getUsePerquest() == null || this.usePerquest != null && Arrays.equals(this.usePerquest, other.getUsePerquest())) && (this.useTimeData == null && other.getUseTimeData() == null || this.useTimeData != null && Arrays.equals(this.useTimeData, other.getUseTimeData())) && (this.visaExpDate == null && other.getVisaExpDate() == null || this.visaExpDate != null && Arrays.equals(this.visaExpDate, other.getVisaExpDate())) && (this.visaType == null && other.getVisaType() == null || this.visaType != null && Arrays.equals(this.visaType, other.getVisaType())) && (this.workCalendar == null && other.getWorkCalendar() == null || this.workCalendar != null && Arrays.equals(this.workCalendar, other.getWorkCalendar())) && (this.workplace == null && other.getWorkplace() == null || this.workplace != null && Arrays.equals(this.workplace, other.getWorkplace())) && (this.zipCode == null && other.getZipCode() == null || this.zipCode != null && Arrays.equals(this.zipCode, other.getZipCode())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
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
        if (this.getAlienNumber() != null) {
            for (i = 0; i < Array.getLength(this.getAlienNumber()); ++i) {
                obj = Array.get(this.getAlienNumber(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAllocation() != null) {
            for (i = 0; i < Array.getLength(this.getAllocation()); ++i) {
                obj = Array.get(this.getAllocation(), i);
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
        if (this.getApprovalLimit() != null) {
            for (i = 0; i < Array.getLength(this.getApprovalLimit()); ++i) {
                obj = Array.get(this.getApprovalLimit(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getApprover() != null) {
            for (i = 0; i < Array.getLength(this.getApprover()); ++i) {
                obj = Array.get(this.getApprover(), i);
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
        if (this.getAuthWorkDate() != null) {
            for (i = 0; i < Array.getLength(this.getAuthWorkDate()); ++i) {
                obj = Array.get(this.getAuthWorkDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBaseWage() != null) {
            for (i = 0; i < Array.getLength(this.getBaseWage()); ++i) {
                obj = Array.get(this.getBaseWage(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBaseWageType() != null) {
            for (i = 0; i < Array.getLength(this.getBaseWageType()); ++i) {
                obj = Array.get(this.getBaseWageType(), i);
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
        if (this.getBillingClass() != null) {
            for (i = 0; i < Array.getLength(this.getBillingClass()); ++i) {
                obj = Array.get(this.getBillingClass(), i);
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
        if (this.getBirthDate() != null) {
            for (i = 0; i < Array.getLength(this.getBirthDate()); ++i) {
                obj = Array.get(this.getBirthDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBirthDay() != null) {
            for (i = 0; i < Array.getLength(this.getBirthDay()); ++i) {
                obj = Array.get(this.getBirthDay(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBonusTarget() != null) {
            for (i = 0; i < Array.getLength(this.getBonusTarget()); ++i) {
                obj = Array.get(this.getBonusTarget(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBonusTargetComment() != null) {
            for (i = 0; i < Array.getLength(this.getBonusTargetComment()); ++i) {
                obj = Array.get(this.getBonusTargetComment(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBonusTargetPayFrequency() != null) {
            for (i = 0; i < Array.getLength(this.getBonusTargetPayFrequency()); ++i) {
                obj = Array.get(this.getBonusTargetPayFrequency(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBonusTargetType() != null) {
            for (i = 0; i < Array.getLength(this.getBonusTargetType()); ++i) {
                obj = Array.get(this.getBonusTargetType(), i);
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
        if (this.get_class() != null) {
            for (i = 0; i < Array.getLength(this.get_class()); ++i) {
                obj = Array.get(this.get_class(), i);
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
        if (this.getCompensationCurrency() != null) {
            for (i = 0; i < Array.getLength(this.getCompensationCurrency()); ++i) {
                obj = Array.get(this.getCompensationCurrency(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getConcurrentWebServicesUser() != null) {
            for (i = 0; i < Array.getLength(this.getConcurrentWebServicesUser()); ++i) {
                obj = Array.get(this.getConcurrentWebServicesUser(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCorporateCardProfile() != null) {
            for (i = 0; i < Array.getLength(this.getCorporateCardProfile()); ++i) {
                obj = Array.get(this.getCorporateCardProfile(), i);
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
        if (this.getDateCreated() != null) {
            for (i = 0; i < Array.getLength(this.getDateCreated()); ++i) {
                obj = Array.get(this.getDateCreated(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDefaultAcctCorpCardExp() != null) {
            for (i = 0; i < Array.getLength(this.getDefaultAcctCorpCardExp()); ++i) {
                obj = Array.get(this.getDefaultAcctCorpCardExp(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDefaultExpenseReportCurrency() != null) {
            for (i = 0; i < Array.getLength(this.getDefaultExpenseReportCurrency()); ++i) {
                obj = Array.get(this.getDefaultExpenseReportCurrency(), i);
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
        if (this.getDepartment() != null) {
            for (i = 0; i < Array.getLength(this.getDepartment()); ++i) {
                obj = Array.get(this.getDepartment(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getEligibleForCommission() != null) {
            for (i = 0; i < Array.getLength(this.getEligibleForCommission()); ++i) {
                obj = Array.get(this.getEligibleForCommission(), i);
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
        if (this.getEmbossedName() != null) {
            for (i = 0; i < Array.getLength(this.getEmbossedName()); ++i) {
                obj = Array.get(this.getEmbossedName(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getEmployeeStatus() != null) {
            for (i = 0; i < Array.getLength(this.getEmployeeStatus()); ++i) {
                obj = Array.get(this.getEmployeeStatus(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getEmployeeType() != null) {
            for (i = 0; i < Array.getLength(this.getEmployeeType()); ++i) {
                obj = Array.get(this.getEmployeeType(), i);
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
        if (this.getEthnicity() != null) {
            for (i = 0; i < Array.getLength(this.getEthnicity()); ++i) {
                obj = Array.get(this.getEthnicity(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getExpenseLimit() != null) {
            for (i = 0; i < Array.getLength(this.getExpenseLimit()); ++i) {
                obj = Array.get(this.getExpenseLimit(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getExpenseReportCurrency() != null) {
            for (i = 0; i < Array.getLength(this.getExpenseReportCurrency()); ++i) {
                obj = Array.get(this.getExpenseReportCurrency(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getExpiration() != null) {
            for (i = 0; i < Array.getLength(this.getExpiration()); ++i) {
                obj = Array.get(this.getExpiration(), i);
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
        if (this.getFirstName() != null) {
            for (i = 0; i < Array.getLength(this.getFirstName()); ++i) {
                obj = Array.get(this.getFirstName(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getGender() != null) {
            for (i = 0; i < Array.getLength(this.getGender()); ++i) {
                obj = Array.get(this.getGender(), i);
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
        if (this.getHireDate() != null) {
            for (i = 0; i < Array.getLength(this.getHireDate()); ++i) {
                obj = Array.get(this.getHireDate(), i);
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
        if (this.getI9Verified() != null) {
            for (i = 0; i < Array.getLength(this.getI9Verified()); ++i) {
                obj = Array.get(this.getI9Verified(), i);
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
        if (this.getIsJobManager() != null) {
            for (i = 0; i < Array.getLength(this.getIsJobManager()); ++i) {
                obj = Array.get(this.getIsJobManager(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsJobResource() != null) {
            for (i = 0; i < Array.getLength(this.getIsJobResource()); ++i) {
                obj = Array.get(this.getIsJobResource(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsSalesRep() != null) {
            for (i = 0; i < Array.getLength(this.getIsSalesRep()); ++i) {
                obj = Array.get(this.getIsSalesRep(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsSupportRep() != null) {
            for (i = 0; i < Array.getLength(this.getIsSupportRep()); ++i) {
                obj = Array.get(this.getIsSupportRep(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsTemplate() != null) {
            for (i = 0; i < Array.getLength(this.getIsTemplate()); ++i) {
                obj = Array.get(this.getIsTemplate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getJob() != null) {
            for (i = 0; i < Array.getLength(this.getJob()); ++i) {
                obj = Array.get(this.getJob(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLaborCost() != null) {
            for (i = 0; i < Array.getLength(this.getLaborCost()); ++i) {
                obj = Array.get(this.getLaborCost(), i);
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
        if (this.getLastPaidDate() != null) {
            for (i = 0; i < Array.getLength(this.getLastPaidDate()); ++i) {
                obj = Array.get(this.getLastPaidDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLastReviewDate() != null) {
            for (i = 0; i < Array.getLength(this.getLastReviewDate()); ++i) {
                obj = Array.get(this.getLastReviewDate(), i);
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
        if (this.getLocation() != null) {
            for (i = 0; i < Array.getLength(this.getLocation()); ++i) {
                obj = Array.get(this.getLocation(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getMaritalStatus() != null) {
            for (i = 0; i < Array.getLength(this.getMaritalStatus()); ++i) {
                obj = Array.get(this.getMaritalStatus(), i);
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
        if (this.getNextReviewDate() != null) {
            for (i = 0; i < Array.getLength(this.getNextReviewDate()); ++i) {
                obj = Array.get(this.getNextReviewDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getOfflineAccess() != null) {
            for (i = 0; i < Array.getLength(this.getOfflineAccess()); ++i) {
                obj = Array.get(this.getOfflineAccess(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPayFrequency() != null) {
            for (i = 0; i < Array.getLength(this.getPayFrequency()); ++i) {
                obj = Array.get(this.getPayFrequency(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPermChangeDate() != null) {
            for (i = 0; i < Array.getLength(this.getPermChangeDate()); ++i) {
                obj = Array.get(this.getPermChangeDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPermChangeLevel() != null) {
            for (i = 0; i < Array.getLength(this.getPermChangeLevel()); ++i) {
                obj = Array.get(this.getPermChangeLevel(), i);
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
        if (this.getPermissionChange() != null) {
            for (i = 0; i < Array.getLength(this.getPermissionChange()); ++i) {
                obj = Array.get(this.getPermissionChange(), i);
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
        if (this.getPositionTitle() != null) {
            for (i = 0; i < Array.getLength(this.getPositionTitle()); ++i) {
                obj = Array.get(this.getPositionTitle(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPrimaryEarningAmount() != null) {
            for (i = 0; i < Array.getLength(this.getPrimaryEarningAmount()); ++i) {
                obj = Array.get(this.getPrimaryEarningAmount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPrimaryEarningItem() != null) {
            for (i = 0; i < Array.getLength(this.getPrimaryEarningItem()); ++i) {
                obj = Array.get(this.getPrimaryEarningItem(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPrimaryEarningType() != null) {
            for (i = 0; i < Array.getLength(this.getPrimaryEarningType()); ++i) {
                obj = Array.get(this.getPrimaryEarningType(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPurchaseOrderApprovalLimit() != null) {
            for (i = 0; i < Array.getLength(this.getPurchaseOrderApprovalLimit()); ++i) {
                obj = Array.get(this.getPurchaseOrderApprovalLimit(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPurchaseOrderApprover() != null) {
            for (i = 0; i < Array.getLength(this.getPurchaseOrderApprover()); ++i) {
                obj = Array.get(this.getPurchaseOrderApprover(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPurchaseOrderLimit() != null) {
            for (i = 0; i < Array.getLength(this.getPurchaseOrderLimit()); ++i) {
                obj = Array.get(this.getPurchaseOrderLimit(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getReleaseDate() != null) {
            for (i = 0; i < Array.getLength(this.getReleaseDate()); ++i) {
                obj = Array.get(this.getReleaseDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getResidentStatus() != null) {
            for (i = 0; i < Array.getLength(this.getResidentStatus()); ++i) {
                obj = Array.get(this.getResidentStatus(), i);
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
        if (this.getRoleChange() != null) {
            for (i = 0; i < Array.getLength(this.getRoleChange()); ++i) {
                obj = Array.get(this.getRoleChange(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRoleChangeAction() != null) {
            for (i = 0; i < Array.getLength(this.getRoleChangeAction()); ++i) {
                obj = Array.get(this.getRoleChangeAction(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRoleChangeDate() != null) {
            for (i = 0; i < Array.getLength(this.getRoleChangeDate()); ++i) {
                obj = Array.get(this.getRoleChangeDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSalesRole() != null) {
            for (i = 0; i < Array.getLength(this.getSalesRole()); ++i) {
                obj = Array.get(this.getSalesRole(), i);
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
        if (this.getSocialSecurityNumber() != null) {
            for (i = 0; i < Array.getLength(this.getSocialSecurityNumber()); ++i) {
                obj = Array.get(this.getSocialSecurityNumber(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getStartDateTimeOffCalc() != null) {
            for (i = 0; i < Array.getLength(this.getStartDateTimeOffCalc()); ++i) {
                obj = Array.get(this.getStartDateTimeOffCalc(), i);
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
        if (this.getSupervisor() != null) {
            for (i = 0; i < Array.getLength(this.getSupervisor()); ++i) {
                obj = Array.get(this.getSupervisor(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTargetUtilization() != null) {
            for (i = 0; i < Array.getLength(this.getTargetUtilization()); ++i) {
                obj = Array.get(this.getTargetUtilization(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTerminationCategory() != null) {
            for (i = 0; i < Array.getLength(this.getTerminationCategory()); ++i) {
                obj = Array.get(this.getTerminationCategory(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTerminationDetails() != null) {
            for (i = 0; i < Array.getLength(this.getTerminationDetails()); ++i) {
                obj = Array.get(this.getTerminationDetails(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTerminationReason() != null) {
            for (i = 0; i < Array.getLength(this.getTerminationReason()); ++i) {
                obj = Array.get(this.getTerminationReason(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTerminationRegretted() != null) {
            for (i = 0; i < Array.getLength(this.getTerminationRegretted()); ++i) {
                obj = Array.get(this.getTerminationRegretted(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTimeApprover() != null) {
            for (i = 0; i < Array.getLength(this.getTimeApprover()); ++i) {
                obj = Array.get(this.getTimeApprover(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTimeOffPlan() != null) {
            for (i = 0; i < Array.getLength(this.getTimeOffPlan()); ++i) {
                obj = Array.get(this.getTimeOffPlan(), i);
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
        if (this.getUsePerquest() != null) {
            for (i = 0; i < Array.getLength(this.getUsePerquest()); ++i) {
                obj = Array.get(this.getUsePerquest(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getUseTimeData() != null) {
            for (i = 0; i < Array.getLength(this.getUseTimeData()); ++i) {
                obj = Array.get(this.getUseTimeData(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getVisaExpDate() != null) {
            for (i = 0; i < Array.getLength(this.getVisaExpDate()); ++i) {
                obj = Array.get(this.getVisaExpDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getVisaType() != null) {
            for (i = 0; i < Array.getLength(this.getVisaType()); ++i) {
                obj = Array.get(this.getVisaType(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getWorkCalendar() != null) {
            for (i = 0; i < Array.getLength(this.getWorkCalendar()); ++i) {
                obj = Array.get(this.getWorkCalendar(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getWorkplace() != null) {
            for (i = 0; i < Array.getLength(this.getWorkplace()); ++i) {
                obj = Array.get(this.getWorkplace(), i);
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "EmployeeSearchRowBasic"));
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
        elemField.setFieldName("alienNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "alienNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("allocation");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "allocation"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
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
        elemField.setFieldName("approvalLimit");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "approvalLimit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("approver");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "approver"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("authWorkDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "authWorkDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("baseWage");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "baseWage"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("baseWageType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "baseWageType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
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
        elemField.setFieldName("billingClass");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billingClass"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("birthDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "birthDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("birthDay");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "birthDay"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("bonusTarget");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "bonusTarget"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("bonusTargetComment");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "bonusTargetComment"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("bonusTargetPayFrequency");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "bonusTargetPayFrequency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("bonusTargetType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "bonusTargetType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
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
        elemField.setFieldName("_class");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "class"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("compensationCurrency");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "compensationCurrency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("concurrentWebServicesUser");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "concurrentWebServicesUser"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("corporateCardProfile");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "corporateCardProfile"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("dateCreated");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "dateCreated"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("defaultAcctCorpCardExp");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "defaultAcctCorpCardExp"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("defaultExpenseReportCurrency");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "defaultExpenseReportCurrency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("department");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "department"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("eligibleForCommission");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "eligibleForCommission"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
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
        elemField.setFieldName("embossedName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "embossedName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("employeeStatus");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "employeeStatus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("employeeType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "employeeType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("ethnicity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ethnicity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("expenseLimit");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "expenseLimit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("expenseReportCurrency");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "expenseReportCurrency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("expiration");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "expiration"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
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
        elemField.setFieldName("firstName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "firstName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("gender");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "gender"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
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
        elemField.setFieldName("hireDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "hireDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
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
        elemField.setFieldName("i9Verified");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "i9Verified"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
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
        elemField.setFieldName("isJobManager");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isJobManager"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isJobResource");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isJobResource"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isSalesRep");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isSalesRep"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isSupportRep");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isSupportRep"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isTemplate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isTemplate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("job");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "job"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("laborCost");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "laborCost"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
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
        elemField.setFieldName("lastPaidDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lastPaidDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastReviewDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lastReviewDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
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
        elemField.setFieldName("location");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "location"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("maritalStatus");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "maritalStatus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("nextReviewDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "nextReviewDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("offlineAccess");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "offlineAccess"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("payFrequency");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "payFrequency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("permChangeDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "permChangeDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("permChangeLevel");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "permChangeLevel"));
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
        elemField.setFieldName("permissionChange");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "permissionChange"));
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
        elemField.setFieldName("positionTitle");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "positionTitle"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("primaryEarningAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "primaryEarningAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("primaryEarningItem");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "primaryEarningItem"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("primaryEarningType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "primaryEarningType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("purchaseOrderApprovalLimit");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "purchaseOrderApprovalLimit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("purchaseOrderApprover");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "purchaseOrderApprover"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("purchaseOrderLimit");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "purchaseOrderLimit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("releaseDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "releaseDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("residentStatus");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "residentStatus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("role");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "role"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("roleChange");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "roleChange"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("roleChangeAction");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "roleChangeAction"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("roleChangeDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "roleChangeDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("salesRole");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "salesRole"));
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
        elemField.setFieldName("socialSecurityNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "socialSecurityNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("startDateTimeOffCalc");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "startDateTimeOffCalc"));
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
        elemField.setFieldName("supervisor");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "supervisor"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("targetUtilization");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "targetUtilization"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("terminationCategory");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "terminationCategory"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("terminationDetails");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "terminationDetails"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("terminationReason");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "terminationReason"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("terminationRegretted");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "terminationRegretted"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("timeApprover");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "timeApprover"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("timeOffPlan");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "timeOffPlan"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("usePerquest");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "usePerquest"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("useTimeData");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "useTimeData"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("visaExpDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "visaExpDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("visaType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "visaType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("workCalendar");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "workCalendar"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("workplace");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "workplace"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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

