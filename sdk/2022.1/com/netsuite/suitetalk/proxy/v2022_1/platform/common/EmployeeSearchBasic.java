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

public class EmployeeSearchBasic
extends SearchRecordBasic
implements Serializable {
    private SearchStringField address;
    private SearchStringField addressee;
    private SearchStringField addressLabel;
    private SearchStringField addressPhone;
    private SearchStringField alienNumber;
    private SearchDoubleField allocation;
    private SearchDateField anniversary;
    private SearchDoubleField approvalLimit;
    private SearchMultiSelectField approver;
    private SearchStringField attention;
    private SearchDateField authWorkDate;
    private SearchDoubleField baseWage;
    private SearchEnumMultiSelectField baseWageType;
    private SearchStringField billAddress;
    private SearchMultiSelectField billingClass;
    private SearchDateField birthDate;
    private SearchDateField birthDay;
    private SearchDoubleField bonusTarget;
    private SearchStringField bonusTargetComment;
    private SearchEnumMultiSelectField bonusTargetPayFrequency;
    private SearchEnumMultiSelectField bonusTargetType;
    private SearchMultiSelectField cContribution;
    private SearchStringField city;
    private SearchMultiSelectField _class;
    private SearchStringField comments;
    private SearchMultiSelectField commissionPlan;
    private SearchEnumMultiSelectField compensationCurrency;
    private SearchBooleanField concurrentWebServicesUser;
    private SearchMultiSelectField corporateCardProfile;
    private SearchEnumMultiSelectField country;
    private SearchStringField county;
    private SearchDateField dateCreated;
    private SearchMultiSelectField deduction;
    private SearchMultiSelectField defaultAcctCorpCardExp;
    private SearchMultiSelectField defaultExpenseReportCurrency;
    private SearchMultiSelectField defaultTaxReg;
    private SearchStringField defaultTaxRegText;
    private SearchMultiSelectField department;
    private SearchMultiSelectField earning;
    private SearchMultiSelectField education;
    private SearchBooleanField eligibleForCommission;
    private SearchStringField email;
    private SearchStringField embossedName;
    private SearchMultiSelectField employeeStatus;
    private SearchMultiSelectField employeeType;
    private SearchBooleanField employeeTypeKpi;
    private SearchStringField entityId;
    private SearchMultiSelectField ethnicity;
    private SearchDoubleField expenseLimit;
    private SearchMultiSelectField expenseReportCurrency;
    private SearchDateField expiration;
    private SearchMultiSelectField externalId;
    private SearchStringField externalIdString;
    private SearchStringField fax;
    private SearchStringField firstName;
    private SearchEnumMultiSelectField gender;
    private SearchBooleanField giveAccess;
    private SearchEnumMultiSelectField globalSubscriptionStatus;
    private SearchMultiSelectField group;
    private SearchDateField hireDate;
    private SearchBooleanField i9Verified;
    private SearchStringField image;
    private SearchMultiSelectField internalId;
    private SearchLongField internalIdNumber;
    private SearchBooleanField isDefaultBilling;
    private SearchBooleanField isDefaultShipping;
    private SearchBooleanField isInactive;
    private SearchBooleanField isJobManager;
    private SearchBooleanField isJobResource;
    private SearchBooleanField isTemplate;
    private SearchMultiSelectField job;
    private SearchStringField jobDescription;
    private SearchDoubleField laborCost;
    private SearchEnumMultiSelectField language;
    private SearchDateField lastModifiedDate;
    private SearchStringField lastName;
    private SearchDateField lastPaidDate;
    private SearchDateField lastReviewDate;
    private SearchEnumMultiSelectField level;
    private SearchMultiSelectField location;
    private SearchMultiSelectField maritalStatus;
    private SearchStringField middleName;
    private SearchDateField nextReviewDate;
    private SearchBooleanField offlineAccess;
    private SearchEnumMultiSelectField payFrequency;
    private SearchDateField permChangeDate;
    private SearchEnumMultiSelectField permission;
    private SearchEnumMultiSelectField permissionChange;
    private SearchStringField phone;
    private SearchStringField phoneticName;
    private SearchMultiSelectField positionTitle;
    private SearchDoubleField primaryEarningAmount;
    private SearchStringField primaryEarningItem;
    private SearchStringField primaryEarningType;
    private SearchDoubleField purchaseOrderApprovalLimit;
    private SearchMultiSelectField purchaseOrderApprover;
    private SearchDoubleField purchaseOrderLimit;
    private SearchDateField releaseDate;
    private SearchMultiSelectField residentStatus;
    private SearchMultiSelectField role;
    private SearchMultiSelectField roleChange;
    private SearchDateField roleChangeDate;
    private SearchBooleanField salesRep;
    private SearchMultiSelectField salesRole;
    private SearchStringField salutation;
    private SearchStringField socialSecurityNumber;
    private SearchDateField startDateTimeOffCalc;
    private SearchStringField state;
    private SearchMultiSelectField subsidiary;
    private SearchMultiSelectField supervisor;
    private SearchBooleanField supportRep;
    private SearchDoubleField targetUtilization;
    private SearchEnumMultiSelectField terminationCategory;
    private SearchStringField terminationDetails;
    private SearchMultiSelectField terminationReason;
    private SearchEnumMultiSelectField terminationRegretted;
    private SearchMultiSelectField timeApprover;
    private SearchMultiSelectField timeOffPlan;
    private SearchStringField title;
    private SearchBooleanField usePerquest;
    private SearchBooleanField useTimeData;
    private SearchDateField visaExpDate;
    private SearchMultiSelectField visaType;
    private SearchMultiSelectField withholding;
    private SearchMultiSelectField workCalendar;
    private SearchMultiSelectField workplace;
    private SearchStringField zipCode;
    private SearchCustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(EmployeeSearchBasic.class, true);

    public EmployeeSearchBasic() {
    }

    public EmployeeSearchBasic(SearchStringField address, SearchStringField addressee, SearchStringField addressLabel, SearchStringField addressPhone, SearchStringField alienNumber, SearchDoubleField allocation, SearchDateField anniversary, SearchDoubleField approvalLimit, SearchMultiSelectField approver, SearchStringField attention, SearchDateField authWorkDate, SearchDoubleField baseWage, SearchEnumMultiSelectField baseWageType, SearchStringField billAddress, SearchMultiSelectField billingClass, SearchDateField birthDate, SearchDateField birthDay, SearchDoubleField bonusTarget, SearchStringField bonusTargetComment, SearchEnumMultiSelectField bonusTargetPayFrequency, SearchEnumMultiSelectField bonusTargetType, SearchMultiSelectField cContribution, SearchStringField city, SearchMultiSelectField _class, SearchStringField comments, SearchMultiSelectField commissionPlan, SearchEnumMultiSelectField compensationCurrency, SearchBooleanField concurrentWebServicesUser, SearchMultiSelectField corporateCardProfile, SearchEnumMultiSelectField country, SearchStringField county, SearchDateField dateCreated, SearchMultiSelectField deduction, SearchMultiSelectField defaultAcctCorpCardExp, SearchMultiSelectField defaultExpenseReportCurrency, SearchMultiSelectField defaultTaxReg, SearchStringField defaultTaxRegText, SearchMultiSelectField department, SearchMultiSelectField earning, SearchMultiSelectField education, SearchBooleanField eligibleForCommission, SearchStringField email, SearchStringField embossedName, SearchMultiSelectField employeeStatus, SearchMultiSelectField employeeType, SearchBooleanField employeeTypeKpi, SearchStringField entityId, SearchMultiSelectField ethnicity, SearchDoubleField expenseLimit, SearchMultiSelectField expenseReportCurrency, SearchDateField expiration, SearchMultiSelectField externalId, SearchStringField externalIdString, SearchStringField fax, SearchStringField firstName, SearchEnumMultiSelectField gender, SearchBooleanField giveAccess, SearchEnumMultiSelectField globalSubscriptionStatus, SearchMultiSelectField group, SearchDateField hireDate, SearchBooleanField i9Verified, SearchStringField image, SearchMultiSelectField internalId, SearchLongField internalIdNumber, SearchBooleanField isDefaultBilling, SearchBooleanField isDefaultShipping, SearchBooleanField isInactive, SearchBooleanField isJobManager, SearchBooleanField isJobResource, SearchBooleanField isTemplate, SearchMultiSelectField job, SearchStringField jobDescription, SearchDoubleField laborCost, SearchEnumMultiSelectField language, SearchDateField lastModifiedDate, SearchStringField lastName, SearchDateField lastPaidDate, SearchDateField lastReviewDate, SearchEnumMultiSelectField level, SearchMultiSelectField location, SearchMultiSelectField maritalStatus, SearchStringField middleName, SearchDateField nextReviewDate, SearchBooleanField offlineAccess, SearchEnumMultiSelectField payFrequency, SearchDateField permChangeDate, SearchEnumMultiSelectField permission, SearchEnumMultiSelectField permissionChange, SearchStringField phone, SearchStringField phoneticName, SearchMultiSelectField positionTitle, SearchDoubleField primaryEarningAmount, SearchStringField primaryEarningItem, SearchStringField primaryEarningType, SearchDoubleField purchaseOrderApprovalLimit, SearchMultiSelectField purchaseOrderApprover, SearchDoubleField purchaseOrderLimit, SearchDateField releaseDate, SearchMultiSelectField residentStatus, SearchMultiSelectField role, SearchMultiSelectField roleChange, SearchDateField roleChangeDate, SearchBooleanField salesRep, SearchMultiSelectField salesRole, SearchStringField salutation, SearchStringField socialSecurityNumber, SearchDateField startDateTimeOffCalc, SearchStringField state, SearchMultiSelectField subsidiary, SearchMultiSelectField supervisor, SearchBooleanField supportRep, SearchDoubleField targetUtilization, SearchEnumMultiSelectField terminationCategory, SearchStringField terminationDetails, SearchMultiSelectField terminationReason, SearchEnumMultiSelectField terminationRegretted, SearchMultiSelectField timeApprover, SearchMultiSelectField timeOffPlan, SearchStringField title, SearchBooleanField usePerquest, SearchBooleanField useTimeData, SearchDateField visaExpDate, SearchMultiSelectField visaType, SearchMultiSelectField withholding, SearchMultiSelectField workCalendar, SearchMultiSelectField workplace, SearchStringField zipCode, SearchCustomFieldList customFieldList) {
        this.address = address;
        this.addressee = addressee;
        this.addressLabel = addressLabel;
        this.addressPhone = addressPhone;
        this.alienNumber = alienNumber;
        this.allocation = allocation;
        this.anniversary = anniversary;
        this.approvalLimit = approvalLimit;
        this.approver = approver;
        this.attention = attention;
        this.authWorkDate = authWorkDate;
        this.baseWage = baseWage;
        this.baseWageType = baseWageType;
        this.billAddress = billAddress;
        this.billingClass = billingClass;
        this.birthDate = birthDate;
        this.birthDay = birthDay;
        this.bonusTarget = bonusTarget;
        this.bonusTargetComment = bonusTargetComment;
        this.bonusTargetPayFrequency = bonusTargetPayFrequency;
        this.bonusTargetType = bonusTargetType;
        this.cContribution = cContribution;
        this.city = city;
        this._class = _class;
        this.comments = comments;
        this.commissionPlan = commissionPlan;
        this.compensationCurrency = compensationCurrency;
        this.concurrentWebServicesUser = concurrentWebServicesUser;
        this.corporateCardProfile = corporateCardProfile;
        this.country = country;
        this.county = county;
        this.dateCreated = dateCreated;
        this.deduction = deduction;
        this.defaultAcctCorpCardExp = defaultAcctCorpCardExp;
        this.defaultExpenseReportCurrency = defaultExpenseReportCurrency;
        this.defaultTaxReg = defaultTaxReg;
        this.defaultTaxRegText = defaultTaxRegText;
        this.department = department;
        this.earning = earning;
        this.education = education;
        this.eligibleForCommission = eligibleForCommission;
        this.email = email;
        this.embossedName = embossedName;
        this.employeeStatus = employeeStatus;
        this.employeeType = employeeType;
        this.employeeTypeKpi = employeeTypeKpi;
        this.entityId = entityId;
        this.ethnicity = ethnicity;
        this.expenseLimit = expenseLimit;
        this.expenseReportCurrency = expenseReportCurrency;
        this.expiration = expiration;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.fax = fax;
        this.firstName = firstName;
        this.gender = gender;
        this.giveAccess = giveAccess;
        this.globalSubscriptionStatus = globalSubscriptionStatus;
        this.group = group;
        this.hireDate = hireDate;
        this.i9Verified = i9Verified;
        this.image = image;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isDefaultBilling = isDefaultBilling;
        this.isDefaultShipping = isDefaultShipping;
        this.isInactive = isInactive;
        this.isJobManager = isJobManager;
        this.isJobResource = isJobResource;
        this.isTemplate = isTemplate;
        this.job = job;
        this.jobDescription = jobDescription;
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
        this.nextReviewDate = nextReviewDate;
        this.offlineAccess = offlineAccess;
        this.payFrequency = payFrequency;
        this.permChangeDate = permChangeDate;
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
        this.roleChangeDate = roleChangeDate;
        this.salesRep = salesRep;
        this.salesRole = salesRole;
        this.salutation = salutation;
        this.socialSecurityNumber = socialSecurityNumber;
        this.startDateTimeOffCalc = startDateTimeOffCalc;
        this.state = state;
        this.subsidiary = subsidiary;
        this.supervisor = supervisor;
        this.supportRep = supportRep;
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
        this.withholding = withholding;
        this.workCalendar = workCalendar;
        this.workplace = workplace;
        this.zipCode = zipCode;
        this.customFieldList = customFieldList;
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

    public SearchStringField getAlienNumber() {
        return this.alienNumber;
    }

    public void setAlienNumber(SearchStringField alienNumber) {
        this.alienNumber = alienNumber;
    }

    public SearchDoubleField getAllocation() {
        return this.allocation;
    }

    public void setAllocation(SearchDoubleField allocation) {
        this.allocation = allocation;
    }

    public SearchDateField getAnniversary() {
        return this.anniversary;
    }

    public void setAnniversary(SearchDateField anniversary) {
        this.anniversary = anniversary;
    }

    public SearchDoubleField getApprovalLimit() {
        return this.approvalLimit;
    }

    public void setApprovalLimit(SearchDoubleField approvalLimit) {
        this.approvalLimit = approvalLimit;
    }

    public SearchMultiSelectField getApprover() {
        return this.approver;
    }

    public void setApprover(SearchMultiSelectField approver) {
        this.approver = approver;
    }

    public SearchStringField getAttention() {
        return this.attention;
    }

    public void setAttention(SearchStringField attention) {
        this.attention = attention;
    }

    public SearchDateField getAuthWorkDate() {
        return this.authWorkDate;
    }

    public void setAuthWorkDate(SearchDateField authWorkDate) {
        this.authWorkDate = authWorkDate;
    }

    public SearchDoubleField getBaseWage() {
        return this.baseWage;
    }

    public void setBaseWage(SearchDoubleField baseWage) {
        this.baseWage = baseWage;
    }

    public SearchEnumMultiSelectField getBaseWageType() {
        return this.baseWageType;
    }

    public void setBaseWageType(SearchEnumMultiSelectField baseWageType) {
        this.baseWageType = baseWageType;
    }

    public SearchStringField getBillAddress() {
        return this.billAddress;
    }

    public void setBillAddress(SearchStringField billAddress) {
        this.billAddress = billAddress;
    }

    public SearchMultiSelectField getBillingClass() {
        return this.billingClass;
    }

    public void setBillingClass(SearchMultiSelectField billingClass) {
        this.billingClass = billingClass;
    }

    public SearchDateField getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(SearchDateField birthDate) {
        this.birthDate = birthDate;
    }

    public SearchDateField getBirthDay() {
        return this.birthDay;
    }

    public void setBirthDay(SearchDateField birthDay) {
        this.birthDay = birthDay;
    }

    public SearchDoubleField getBonusTarget() {
        return this.bonusTarget;
    }

    public void setBonusTarget(SearchDoubleField bonusTarget) {
        this.bonusTarget = bonusTarget;
    }

    public SearchStringField getBonusTargetComment() {
        return this.bonusTargetComment;
    }

    public void setBonusTargetComment(SearchStringField bonusTargetComment) {
        this.bonusTargetComment = bonusTargetComment;
    }

    public SearchEnumMultiSelectField getBonusTargetPayFrequency() {
        return this.bonusTargetPayFrequency;
    }

    public void setBonusTargetPayFrequency(SearchEnumMultiSelectField bonusTargetPayFrequency) {
        this.bonusTargetPayFrequency = bonusTargetPayFrequency;
    }

    public SearchEnumMultiSelectField getBonusTargetType() {
        return this.bonusTargetType;
    }

    public void setBonusTargetType(SearchEnumMultiSelectField bonusTargetType) {
        this.bonusTargetType = bonusTargetType;
    }

    public SearchMultiSelectField getCContribution() {
        return this.cContribution;
    }

    public void setCContribution(SearchMultiSelectField cContribution) {
        this.cContribution = cContribution;
    }

    public SearchStringField getCity() {
        return this.city;
    }

    public void setCity(SearchStringField city) {
        this.city = city;
    }

    public SearchMultiSelectField get_class() {
        return this._class;
    }

    public void set_class(SearchMultiSelectField _class) {
        this._class = _class;
    }

    public SearchStringField getComments() {
        return this.comments;
    }

    public void setComments(SearchStringField comments) {
        this.comments = comments;
    }

    public SearchMultiSelectField getCommissionPlan() {
        return this.commissionPlan;
    }

    public void setCommissionPlan(SearchMultiSelectField commissionPlan) {
        this.commissionPlan = commissionPlan;
    }

    public SearchEnumMultiSelectField getCompensationCurrency() {
        return this.compensationCurrency;
    }

    public void setCompensationCurrency(SearchEnumMultiSelectField compensationCurrency) {
        this.compensationCurrency = compensationCurrency;
    }

    public SearchBooleanField getConcurrentWebServicesUser() {
        return this.concurrentWebServicesUser;
    }

    public void setConcurrentWebServicesUser(SearchBooleanField concurrentWebServicesUser) {
        this.concurrentWebServicesUser = concurrentWebServicesUser;
    }

    public SearchMultiSelectField getCorporateCardProfile() {
        return this.corporateCardProfile;
    }

    public void setCorporateCardProfile(SearchMultiSelectField corporateCardProfile) {
        this.corporateCardProfile = corporateCardProfile;
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

    public SearchDateField getDateCreated() {
        return this.dateCreated;
    }

    public void setDateCreated(SearchDateField dateCreated) {
        this.dateCreated = dateCreated;
    }

    public SearchMultiSelectField getDeduction() {
        return this.deduction;
    }

    public void setDeduction(SearchMultiSelectField deduction) {
        this.deduction = deduction;
    }

    public SearchMultiSelectField getDefaultAcctCorpCardExp() {
        return this.defaultAcctCorpCardExp;
    }

    public void setDefaultAcctCorpCardExp(SearchMultiSelectField defaultAcctCorpCardExp) {
        this.defaultAcctCorpCardExp = defaultAcctCorpCardExp;
    }

    public SearchMultiSelectField getDefaultExpenseReportCurrency() {
        return this.defaultExpenseReportCurrency;
    }

    public void setDefaultExpenseReportCurrency(SearchMultiSelectField defaultExpenseReportCurrency) {
        this.defaultExpenseReportCurrency = defaultExpenseReportCurrency;
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

    public SearchMultiSelectField getDepartment() {
        return this.department;
    }

    public void setDepartment(SearchMultiSelectField department) {
        this.department = department;
    }

    public SearchMultiSelectField getEarning() {
        return this.earning;
    }

    public void setEarning(SearchMultiSelectField earning) {
        this.earning = earning;
    }

    public SearchMultiSelectField getEducation() {
        return this.education;
    }

    public void setEducation(SearchMultiSelectField education) {
        this.education = education;
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

    public SearchStringField getEmbossedName() {
        return this.embossedName;
    }

    public void setEmbossedName(SearchStringField embossedName) {
        this.embossedName = embossedName;
    }

    public SearchMultiSelectField getEmployeeStatus() {
        return this.employeeStatus;
    }

    public void setEmployeeStatus(SearchMultiSelectField employeeStatus) {
        this.employeeStatus = employeeStatus;
    }

    public SearchMultiSelectField getEmployeeType() {
        return this.employeeType;
    }

    public void setEmployeeType(SearchMultiSelectField employeeType) {
        this.employeeType = employeeType;
    }

    public SearchBooleanField getEmployeeTypeKpi() {
        return this.employeeTypeKpi;
    }

    public void setEmployeeTypeKpi(SearchBooleanField employeeTypeKpi) {
        this.employeeTypeKpi = employeeTypeKpi;
    }

    public SearchStringField getEntityId() {
        return this.entityId;
    }

    public void setEntityId(SearchStringField entityId) {
        this.entityId = entityId;
    }

    public SearchMultiSelectField getEthnicity() {
        return this.ethnicity;
    }

    public void setEthnicity(SearchMultiSelectField ethnicity) {
        this.ethnicity = ethnicity;
    }

    public SearchDoubleField getExpenseLimit() {
        return this.expenseLimit;
    }

    public void setExpenseLimit(SearchDoubleField expenseLimit) {
        this.expenseLimit = expenseLimit;
    }

    public SearchMultiSelectField getExpenseReportCurrency() {
        return this.expenseReportCurrency;
    }

    public void setExpenseReportCurrency(SearchMultiSelectField expenseReportCurrency) {
        this.expenseReportCurrency = expenseReportCurrency;
    }

    public SearchDateField getExpiration() {
        return this.expiration;
    }

    public void setExpiration(SearchDateField expiration) {
        this.expiration = expiration;
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

    public SearchStringField getFirstName() {
        return this.firstName;
    }

    public void setFirstName(SearchStringField firstName) {
        this.firstName = firstName;
    }

    public SearchEnumMultiSelectField getGender() {
        return this.gender;
    }

    public void setGender(SearchEnumMultiSelectField gender) {
        this.gender = gender;
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

    public SearchDateField getHireDate() {
        return this.hireDate;
    }

    public void setHireDate(SearchDateField hireDate) {
        this.hireDate = hireDate;
    }

    public SearchBooleanField getI9Verified() {
        return this.i9Verified;
    }

    public void setI9Verified(SearchBooleanField i9Verified) {
        this.i9Verified = i9Verified;
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

    public SearchBooleanField getIsJobManager() {
        return this.isJobManager;
    }

    public void setIsJobManager(SearchBooleanField isJobManager) {
        this.isJobManager = isJobManager;
    }

    public SearchBooleanField getIsJobResource() {
        return this.isJobResource;
    }

    public void setIsJobResource(SearchBooleanField isJobResource) {
        this.isJobResource = isJobResource;
    }

    public SearchBooleanField getIsTemplate() {
        return this.isTemplate;
    }

    public void setIsTemplate(SearchBooleanField isTemplate) {
        this.isTemplate = isTemplate;
    }

    public SearchMultiSelectField getJob() {
        return this.job;
    }

    public void setJob(SearchMultiSelectField job) {
        this.job = job;
    }

    public SearchStringField getJobDescription() {
        return this.jobDescription;
    }

    public void setJobDescription(SearchStringField jobDescription) {
        this.jobDescription = jobDescription;
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

    public SearchDateField getLastPaidDate() {
        return this.lastPaidDate;
    }

    public void setLastPaidDate(SearchDateField lastPaidDate) {
        this.lastPaidDate = lastPaidDate;
    }

    public SearchDateField getLastReviewDate() {
        return this.lastReviewDate;
    }

    public void setLastReviewDate(SearchDateField lastReviewDate) {
        this.lastReviewDate = lastReviewDate;
    }

    public SearchEnumMultiSelectField getLevel() {
        return this.level;
    }

    public void setLevel(SearchEnumMultiSelectField level) {
        this.level = level;
    }

    public SearchMultiSelectField getLocation() {
        return this.location;
    }

    public void setLocation(SearchMultiSelectField location) {
        this.location = location;
    }

    public SearchMultiSelectField getMaritalStatus() {
        return this.maritalStatus;
    }

    public void setMaritalStatus(SearchMultiSelectField maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public SearchStringField getMiddleName() {
        return this.middleName;
    }

    public void setMiddleName(SearchStringField middleName) {
        this.middleName = middleName;
    }

    public SearchDateField getNextReviewDate() {
        return this.nextReviewDate;
    }

    public void setNextReviewDate(SearchDateField nextReviewDate) {
        this.nextReviewDate = nextReviewDate;
    }

    public SearchBooleanField getOfflineAccess() {
        return this.offlineAccess;
    }

    public void setOfflineAccess(SearchBooleanField offlineAccess) {
        this.offlineAccess = offlineAccess;
    }

    public SearchEnumMultiSelectField getPayFrequency() {
        return this.payFrequency;
    }

    public void setPayFrequency(SearchEnumMultiSelectField payFrequency) {
        this.payFrequency = payFrequency;
    }

    public SearchDateField getPermChangeDate() {
        return this.permChangeDate;
    }

    public void setPermChangeDate(SearchDateField permChangeDate) {
        this.permChangeDate = permChangeDate;
    }

    public SearchEnumMultiSelectField getPermission() {
        return this.permission;
    }

    public void setPermission(SearchEnumMultiSelectField permission) {
        this.permission = permission;
    }

    public SearchEnumMultiSelectField getPermissionChange() {
        return this.permissionChange;
    }

    public void setPermissionChange(SearchEnumMultiSelectField permissionChange) {
        this.permissionChange = permissionChange;
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

    public SearchMultiSelectField getPositionTitle() {
        return this.positionTitle;
    }

    public void setPositionTitle(SearchMultiSelectField positionTitle) {
        this.positionTitle = positionTitle;
    }

    public SearchDoubleField getPrimaryEarningAmount() {
        return this.primaryEarningAmount;
    }

    public void setPrimaryEarningAmount(SearchDoubleField primaryEarningAmount) {
        this.primaryEarningAmount = primaryEarningAmount;
    }

    public SearchStringField getPrimaryEarningItem() {
        return this.primaryEarningItem;
    }

    public void setPrimaryEarningItem(SearchStringField primaryEarningItem) {
        this.primaryEarningItem = primaryEarningItem;
    }

    public SearchStringField getPrimaryEarningType() {
        return this.primaryEarningType;
    }

    public void setPrimaryEarningType(SearchStringField primaryEarningType) {
        this.primaryEarningType = primaryEarningType;
    }

    public SearchDoubleField getPurchaseOrderApprovalLimit() {
        return this.purchaseOrderApprovalLimit;
    }

    public void setPurchaseOrderApprovalLimit(SearchDoubleField purchaseOrderApprovalLimit) {
        this.purchaseOrderApprovalLimit = purchaseOrderApprovalLimit;
    }

    public SearchMultiSelectField getPurchaseOrderApprover() {
        return this.purchaseOrderApprover;
    }

    public void setPurchaseOrderApprover(SearchMultiSelectField purchaseOrderApprover) {
        this.purchaseOrderApprover = purchaseOrderApprover;
    }

    public SearchDoubleField getPurchaseOrderLimit() {
        return this.purchaseOrderLimit;
    }

    public void setPurchaseOrderLimit(SearchDoubleField purchaseOrderLimit) {
        this.purchaseOrderLimit = purchaseOrderLimit;
    }

    public SearchDateField getReleaseDate() {
        return this.releaseDate;
    }

    public void setReleaseDate(SearchDateField releaseDate) {
        this.releaseDate = releaseDate;
    }

    public SearchMultiSelectField getResidentStatus() {
        return this.residentStatus;
    }

    public void setResidentStatus(SearchMultiSelectField residentStatus) {
        this.residentStatus = residentStatus;
    }

    public SearchMultiSelectField getRole() {
        return this.role;
    }

    public void setRole(SearchMultiSelectField role) {
        this.role = role;
    }

    public SearchMultiSelectField getRoleChange() {
        return this.roleChange;
    }

    public void setRoleChange(SearchMultiSelectField roleChange) {
        this.roleChange = roleChange;
    }

    public SearchDateField getRoleChangeDate() {
        return this.roleChangeDate;
    }

    public void setRoleChangeDate(SearchDateField roleChangeDate) {
        this.roleChangeDate = roleChangeDate;
    }

    public SearchBooleanField getSalesRep() {
        return this.salesRep;
    }

    public void setSalesRep(SearchBooleanField salesRep) {
        this.salesRep = salesRep;
    }

    public SearchMultiSelectField getSalesRole() {
        return this.salesRole;
    }

    public void setSalesRole(SearchMultiSelectField salesRole) {
        this.salesRole = salesRole;
    }

    public SearchStringField getSalutation() {
        return this.salutation;
    }

    public void setSalutation(SearchStringField salutation) {
        this.salutation = salutation;
    }

    public SearchStringField getSocialSecurityNumber() {
        return this.socialSecurityNumber;
    }

    public void setSocialSecurityNumber(SearchStringField socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public SearchDateField getStartDateTimeOffCalc() {
        return this.startDateTimeOffCalc;
    }

    public void setStartDateTimeOffCalc(SearchDateField startDateTimeOffCalc) {
        this.startDateTimeOffCalc = startDateTimeOffCalc;
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

    public SearchMultiSelectField getSupervisor() {
        return this.supervisor;
    }

    public void setSupervisor(SearchMultiSelectField supervisor) {
        this.supervisor = supervisor;
    }

    public SearchBooleanField getSupportRep() {
        return this.supportRep;
    }

    public void setSupportRep(SearchBooleanField supportRep) {
        this.supportRep = supportRep;
    }

    public SearchDoubleField getTargetUtilization() {
        return this.targetUtilization;
    }

    public void setTargetUtilization(SearchDoubleField targetUtilization) {
        this.targetUtilization = targetUtilization;
    }

    public SearchEnumMultiSelectField getTerminationCategory() {
        return this.terminationCategory;
    }

    public void setTerminationCategory(SearchEnumMultiSelectField terminationCategory) {
        this.terminationCategory = terminationCategory;
    }

    public SearchStringField getTerminationDetails() {
        return this.terminationDetails;
    }

    public void setTerminationDetails(SearchStringField terminationDetails) {
        this.terminationDetails = terminationDetails;
    }

    public SearchMultiSelectField getTerminationReason() {
        return this.terminationReason;
    }

    public void setTerminationReason(SearchMultiSelectField terminationReason) {
        this.terminationReason = terminationReason;
    }

    public SearchEnumMultiSelectField getTerminationRegretted() {
        return this.terminationRegretted;
    }

    public void setTerminationRegretted(SearchEnumMultiSelectField terminationRegretted) {
        this.terminationRegretted = terminationRegretted;
    }

    public SearchMultiSelectField getTimeApprover() {
        return this.timeApprover;
    }

    public void setTimeApprover(SearchMultiSelectField timeApprover) {
        this.timeApprover = timeApprover;
    }

    public SearchMultiSelectField getTimeOffPlan() {
        return this.timeOffPlan;
    }

    public void setTimeOffPlan(SearchMultiSelectField timeOffPlan) {
        this.timeOffPlan = timeOffPlan;
    }

    public SearchStringField getTitle() {
        return this.title;
    }

    public void setTitle(SearchStringField title) {
        this.title = title;
    }

    public SearchBooleanField getUsePerquest() {
        return this.usePerquest;
    }

    public void setUsePerquest(SearchBooleanField usePerquest) {
        this.usePerquest = usePerquest;
    }

    public SearchBooleanField getUseTimeData() {
        return this.useTimeData;
    }

    public void setUseTimeData(SearchBooleanField useTimeData) {
        this.useTimeData = useTimeData;
    }

    public SearchDateField getVisaExpDate() {
        return this.visaExpDate;
    }

    public void setVisaExpDate(SearchDateField visaExpDate) {
        this.visaExpDate = visaExpDate;
    }

    public SearchMultiSelectField getVisaType() {
        return this.visaType;
    }

    public void setVisaType(SearchMultiSelectField visaType) {
        this.visaType = visaType;
    }

    public SearchMultiSelectField getWithholding() {
        return this.withholding;
    }

    public void setWithholding(SearchMultiSelectField withholding) {
        this.withholding = withholding;
    }

    public SearchMultiSelectField getWorkCalendar() {
        return this.workCalendar;
    }

    public void setWorkCalendar(SearchMultiSelectField workCalendar) {
        this.workCalendar = workCalendar;
    }

    public SearchMultiSelectField getWorkplace() {
        return this.workplace;
    }

    public void setWorkplace(SearchMultiSelectField workplace) {
        this.workplace = workplace;
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
        if (!(obj instanceof EmployeeSearchBasic)) {
            return false;
        }
        EmployeeSearchBasic other = (EmployeeSearchBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.address == null && other.getAddress() == null || this.address != null && this.address.equals(other.getAddress())) && (this.addressee == null && other.getAddressee() == null || this.addressee != null && this.addressee.equals(other.getAddressee())) && (this.addressLabel == null && other.getAddressLabel() == null || this.addressLabel != null && this.addressLabel.equals(other.getAddressLabel())) && (this.addressPhone == null && other.getAddressPhone() == null || this.addressPhone != null && this.addressPhone.equals(other.getAddressPhone())) && (this.alienNumber == null && other.getAlienNumber() == null || this.alienNumber != null && this.alienNumber.equals(other.getAlienNumber())) && (this.allocation == null && other.getAllocation() == null || this.allocation != null && this.allocation.equals(other.getAllocation())) && (this.anniversary == null && other.getAnniversary() == null || this.anniversary != null && this.anniversary.equals(other.getAnniversary())) && (this.approvalLimit == null && other.getApprovalLimit() == null || this.approvalLimit != null && this.approvalLimit.equals(other.getApprovalLimit())) && (this.approver == null && other.getApprover() == null || this.approver != null && this.approver.equals(other.getApprover())) && (this.attention == null && other.getAttention() == null || this.attention != null && this.attention.equals(other.getAttention())) && (this.authWorkDate == null && other.getAuthWorkDate() == null || this.authWorkDate != null && this.authWorkDate.equals(other.getAuthWorkDate())) && (this.baseWage == null && other.getBaseWage() == null || this.baseWage != null && this.baseWage.equals(other.getBaseWage())) && (this.baseWageType == null && other.getBaseWageType() == null || this.baseWageType != null && this.baseWageType.equals(other.getBaseWageType())) && (this.billAddress == null && other.getBillAddress() == null || this.billAddress != null && this.billAddress.equals(other.getBillAddress())) && (this.billingClass == null && other.getBillingClass() == null || this.billingClass != null && this.billingClass.equals(other.getBillingClass())) && (this.birthDate == null && other.getBirthDate() == null || this.birthDate != null && this.birthDate.equals(other.getBirthDate())) && (this.birthDay == null && other.getBirthDay() == null || this.birthDay != null && this.birthDay.equals(other.getBirthDay())) && (this.bonusTarget == null && other.getBonusTarget() == null || this.bonusTarget != null && this.bonusTarget.equals(other.getBonusTarget())) && (this.bonusTargetComment == null && other.getBonusTargetComment() == null || this.bonusTargetComment != null && this.bonusTargetComment.equals(other.getBonusTargetComment())) && (this.bonusTargetPayFrequency == null && other.getBonusTargetPayFrequency() == null || this.bonusTargetPayFrequency != null && this.bonusTargetPayFrequency.equals(other.getBonusTargetPayFrequency())) && (this.bonusTargetType == null && other.getBonusTargetType() == null || this.bonusTargetType != null && this.bonusTargetType.equals(other.getBonusTargetType())) && (this.cContribution == null && other.getCContribution() == null || this.cContribution != null && this.cContribution.equals(other.getCContribution())) && (this.city == null && other.getCity() == null || this.city != null && this.city.equals(other.getCity())) && (this._class == null && other.get_class() == null || this._class != null && this._class.equals(other.get_class())) && (this.comments == null && other.getComments() == null || this.comments != null && this.comments.equals(other.getComments())) && (this.commissionPlan == null && other.getCommissionPlan() == null || this.commissionPlan != null && this.commissionPlan.equals(other.getCommissionPlan())) && (this.compensationCurrency == null && other.getCompensationCurrency() == null || this.compensationCurrency != null && this.compensationCurrency.equals(other.getCompensationCurrency())) && (this.concurrentWebServicesUser == null && other.getConcurrentWebServicesUser() == null || this.concurrentWebServicesUser != null && this.concurrentWebServicesUser.equals(other.getConcurrentWebServicesUser())) && (this.corporateCardProfile == null && other.getCorporateCardProfile() == null || this.corporateCardProfile != null && this.corporateCardProfile.equals(other.getCorporateCardProfile())) && (this.country == null && other.getCountry() == null || this.country != null && this.country.equals(other.getCountry())) && (this.county == null && other.getCounty() == null || this.county != null && this.county.equals(other.getCounty())) && (this.dateCreated == null && other.getDateCreated() == null || this.dateCreated != null && this.dateCreated.equals(other.getDateCreated())) && (this.deduction == null && other.getDeduction() == null || this.deduction != null && this.deduction.equals(other.getDeduction())) && (this.defaultAcctCorpCardExp == null && other.getDefaultAcctCorpCardExp() == null || this.defaultAcctCorpCardExp != null && this.defaultAcctCorpCardExp.equals(other.getDefaultAcctCorpCardExp())) && (this.defaultExpenseReportCurrency == null && other.getDefaultExpenseReportCurrency() == null || this.defaultExpenseReportCurrency != null && this.defaultExpenseReportCurrency.equals(other.getDefaultExpenseReportCurrency())) && (this.defaultTaxReg == null && other.getDefaultTaxReg() == null || this.defaultTaxReg != null && this.defaultTaxReg.equals(other.getDefaultTaxReg())) && (this.defaultTaxRegText == null && other.getDefaultTaxRegText() == null || this.defaultTaxRegText != null && this.defaultTaxRegText.equals(other.getDefaultTaxRegText())) && (this.department == null && other.getDepartment() == null || this.department != null && this.department.equals(other.getDepartment())) && (this.earning == null && other.getEarning() == null || this.earning != null && this.earning.equals(other.getEarning())) && (this.education == null && other.getEducation() == null || this.education != null && this.education.equals(other.getEducation())) && (this.eligibleForCommission == null && other.getEligibleForCommission() == null || this.eligibleForCommission != null && this.eligibleForCommission.equals(other.getEligibleForCommission())) && (this.email == null && other.getEmail() == null || this.email != null && this.email.equals(other.getEmail())) && (this.embossedName == null && other.getEmbossedName() == null || this.embossedName != null && this.embossedName.equals(other.getEmbossedName())) && (this.employeeStatus == null && other.getEmployeeStatus() == null || this.employeeStatus != null && this.employeeStatus.equals(other.getEmployeeStatus())) && (this.employeeType == null && other.getEmployeeType() == null || this.employeeType != null && this.employeeType.equals(other.getEmployeeType())) && (this.employeeTypeKpi == null && other.getEmployeeTypeKpi() == null || this.employeeTypeKpi != null && this.employeeTypeKpi.equals(other.getEmployeeTypeKpi())) && (this.entityId == null && other.getEntityId() == null || this.entityId != null && this.entityId.equals(other.getEntityId())) && (this.ethnicity == null && other.getEthnicity() == null || this.ethnicity != null && this.ethnicity.equals(other.getEthnicity())) && (this.expenseLimit == null && other.getExpenseLimit() == null || this.expenseLimit != null && this.expenseLimit.equals(other.getExpenseLimit())) && (this.expenseReportCurrency == null && other.getExpenseReportCurrency() == null || this.expenseReportCurrency != null && this.expenseReportCurrency.equals(other.getExpenseReportCurrency())) && (this.expiration == null && other.getExpiration() == null || this.expiration != null && this.expiration.equals(other.getExpiration())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId())) && (this.externalIdString == null && other.getExternalIdString() == null || this.externalIdString != null && this.externalIdString.equals(other.getExternalIdString())) && (this.fax == null && other.getFax() == null || this.fax != null && this.fax.equals(other.getFax())) && (this.firstName == null && other.getFirstName() == null || this.firstName != null && this.firstName.equals(other.getFirstName())) && (this.gender == null && other.getGender() == null || this.gender != null && this.gender.equals(other.getGender())) && (this.giveAccess == null && other.getGiveAccess() == null || this.giveAccess != null && this.giveAccess.equals(other.getGiveAccess())) && (this.globalSubscriptionStatus == null && other.getGlobalSubscriptionStatus() == null || this.globalSubscriptionStatus != null && this.globalSubscriptionStatus.equals(other.getGlobalSubscriptionStatus())) && (this.group == null && other.getGroup() == null || this.group != null && this.group.equals(other.getGroup())) && (this.hireDate == null && other.getHireDate() == null || this.hireDate != null && this.hireDate.equals(other.getHireDate())) && (this.i9Verified == null && other.getI9Verified() == null || this.i9Verified != null && this.i9Verified.equals(other.getI9Verified())) && (this.image == null && other.getImage() == null || this.image != null && this.image.equals(other.getImage())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.internalIdNumber == null && other.getInternalIdNumber() == null || this.internalIdNumber != null && this.internalIdNumber.equals(other.getInternalIdNumber())) && (this.isDefaultBilling == null && other.getIsDefaultBilling() == null || this.isDefaultBilling != null && this.isDefaultBilling.equals(other.getIsDefaultBilling())) && (this.isDefaultShipping == null && other.getIsDefaultShipping() == null || this.isDefaultShipping != null && this.isDefaultShipping.equals(other.getIsDefaultShipping())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && this.isInactive.equals(other.getIsInactive())) && (this.isJobManager == null && other.getIsJobManager() == null || this.isJobManager != null && this.isJobManager.equals(other.getIsJobManager())) && (this.isJobResource == null && other.getIsJobResource() == null || this.isJobResource != null && this.isJobResource.equals(other.getIsJobResource())) && (this.isTemplate == null && other.getIsTemplate() == null || this.isTemplate != null && this.isTemplate.equals(other.getIsTemplate())) && (this.job == null && other.getJob() == null || this.job != null && this.job.equals(other.getJob())) && (this.jobDescription == null && other.getJobDescription() == null || this.jobDescription != null && this.jobDescription.equals(other.getJobDescription())) && (this.laborCost == null && other.getLaborCost() == null || this.laborCost != null && this.laborCost.equals(other.getLaborCost())) && (this.language == null && other.getLanguage() == null || this.language != null && this.language.equals(other.getLanguage())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && this.lastModifiedDate.equals(other.getLastModifiedDate())) && (this.lastName == null && other.getLastName() == null || this.lastName != null && this.lastName.equals(other.getLastName())) && (this.lastPaidDate == null && other.getLastPaidDate() == null || this.lastPaidDate != null && this.lastPaidDate.equals(other.getLastPaidDate())) && (this.lastReviewDate == null && other.getLastReviewDate() == null || this.lastReviewDate != null && this.lastReviewDate.equals(other.getLastReviewDate())) && (this.level == null && other.getLevel() == null || this.level != null && this.level.equals(other.getLevel())) && (this.location == null && other.getLocation() == null || this.location != null && this.location.equals(other.getLocation())) && (this.maritalStatus == null && other.getMaritalStatus() == null || this.maritalStatus != null && this.maritalStatus.equals(other.getMaritalStatus())) && (this.middleName == null && other.getMiddleName() == null || this.middleName != null && this.middleName.equals(other.getMiddleName())) && (this.nextReviewDate == null && other.getNextReviewDate() == null || this.nextReviewDate != null && this.nextReviewDate.equals(other.getNextReviewDate())) && (this.offlineAccess == null && other.getOfflineAccess() == null || this.offlineAccess != null && this.offlineAccess.equals(other.getOfflineAccess())) && (this.payFrequency == null && other.getPayFrequency() == null || this.payFrequency != null && this.payFrequency.equals(other.getPayFrequency())) && (this.permChangeDate == null && other.getPermChangeDate() == null || this.permChangeDate != null && this.permChangeDate.equals(other.getPermChangeDate())) && (this.permission == null && other.getPermission() == null || this.permission != null && this.permission.equals(other.getPermission())) && (this.permissionChange == null && other.getPermissionChange() == null || this.permissionChange != null && this.permissionChange.equals(other.getPermissionChange())) && (this.phone == null && other.getPhone() == null || this.phone != null && this.phone.equals(other.getPhone())) && (this.phoneticName == null && other.getPhoneticName() == null || this.phoneticName != null && this.phoneticName.equals(other.getPhoneticName())) && (this.positionTitle == null && other.getPositionTitle() == null || this.positionTitle != null && this.positionTitle.equals(other.getPositionTitle())) && (this.primaryEarningAmount == null && other.getPrimaryEarningAmount() == null || this.primaryEarningAmount != null && this.primaryEarningAmount.equals(other.getPrimaryEarningAmount())) && (this.primaryEarningItem == null && other.getPrimaryEarningItem() == null || this.primaryEarningItem != null && this.primaryEarningItem.equals(other.getPrimaryEarningItem())) && (this.primaryEarningType == null && other.getPrimaryEarningType() == null || this.primaryEarningType != null && this.primaryEarningType.equals(other.getPrimaryEarningType())) && (this.purchaseOrderApprovalLimit == null && other.getPurchaseOrderApprovalLimit() == null || this.purchaseOrderApprovalLimit != null && this.purchaseOrderApprovalLimit.equals(other.getPurchaseOrderApprovalLimit())) && (this.purchaseOrderApprover == null && other.getPurchaseOrderApprover() == null || this.purchaseOrderApprover != null && this.purchaseOrderApprover.equals(other.getPurchaseOrderApprover())) && (this.purchaseOrderLimit == null && other.getPurchaseOrderLimit() == null || this.purchaseOrderLimit != null && this.purchaseOrderLimit.equals(other.getPurchaseOrderLimit())) && (this.releaseDate == null && other.getReleaseDate() == null || this.releaseDate != null && this.releaseDate.equals(other.getReleaseDate())) && (this.residentStatus == null && other.getResidentStatus() == null || this.residentStatus != null && this.residentStatus.equals(other.getResidentStatus())) && (this.role == null && other.getRole() == null || this.role != null && this.role.equals(other.getRole())) && (this.roleChange == null && other.getRoleChange() == null || this.roleChange != null && this.roleChange.equals(other.getRoleChange())) && (this.roleChangeDate == null && other.getRoleChangeDate() == null || this.roleChangeDate != null && this.roleChangeDate.equals(other.getRoleChangeDate())) && (this.salesRep == null && other.getSalesRep() == null || this.salesRep != null && this.salesRep.equals(other.getSalesRep())) && (this.salesRole == null && other.getSalesRole() == null || this.salesRole != null && this.salesRole.equals(other.getSalesRole())) && (this.salutation == null && other.getSalutation() == null || this.salutation != null && this.salutation.equals(other.getSalutation())) && (this.socialSecurityNumber == null && other.getSocialSecurityNumber() == null || this.socialSecurityNumber != null && this.socialSecurityNumber.equals(other.getSocialSecurityNumber())) && (this.startDateTimeOffCalc == null && other.getStartDateTimeOffCalc() == null || this.startDateTimeOffCalc != null && this.startDateTimeOffCalc.equals(other.getStartDateTimeOffCalc())) && (this.state == null && other.getState() == null || this.state != null && this.state.equals(other.getState())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && this.subsidiary.equals(other.getSubsidiary())) && (this.supervisor == null && other.getSupervisor() == null || this.supervisor != null && this.supervisor.equals(other.getSupervisor())) && (this.supportRep == null && other.getSupportRep() == null || this.supportRep != null && this.supportRep.equals(other.getSupportRep())) && (this.targetUtilization == null && other.getTargetUtilization() == null || this.targetUtilization != null && this.targetUtilization.equals(other.getTargetUtilization())) && (this.terminationCategory == null && other.getTerminationCategory() == null || this.terminationCategory != null && this.terminationCategory.equals(other.getTerminationCategory())) && (this.terminationDetails == null && other.getTerminationDetails() == null || this.terminationDetails != null && this.terminationDetails.equals(other.getTerminationDetails())) && (this.terminationReason == null && other.getTerminationReason() == null || this.terminationReason != null && this.terminationReason.equals(other.getTerminationReason())) && (this.terminationRegretted == null && other.getTerminationRegretted() == null || this.terminationRegretted != null && this.terminationRegretted.equals(other.getTerminationRegretted())) && (this.timeApprover == null && other.getTimeApprover() == null || this.timeApprover != null && this.timeApprover.equals(other.getTimeApprover())) && (this.timeOffPlan == null && other.getTimeOffPlan() == null || this.timeOffPlan != null && this.timeOffPlan.equals(other.getTimeOffPlan())) && (this.title == null && other.getTitle() == null || this.title != null && this.title.equals(other.getTitle())) && (this.usePerquest == null && other.getUsePerquest() == null || this.usePerquest != null && this.usePerquest.equals(other.getUsePerquest())) && (this.useTimeData == null && other.getUseTimeData() == null || this.useTimeData != null && this.useTimeData.equals(other.getUseTimeData())) && (this.visaExpDate == null && other.getVisaExpDate() == null || this.visaExpDate != null && this.visaExpDate.equals(other.getVisaExpDate())) && (this.visaType == null && other.getVisaType() == null || this.visaType != null && this.visaType.equals(other.getVisaType())) && (this.withholding == null && other.getWithholding() == null || this.withholding != null && this.withholding.equals(other.getWithholding())) && (this.workCalendar == null && other.getWorkCalendar() == null || this.workCalendar != null && this.workCalendar.equals(other.getWorkCalendar())) && (this.workplace == null && other.getWorkplace() == null || this.workplace != null && this.workplace.equals(other.getWorkplace())) && (this.zipCode == null && other.getZipCode() == null || this.zipCode != null && this.zipCode.equals(other.getZipCode())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
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
        if (this.getAlienNumber() != null) {
            _hashCode += this.getAlienNumber().hashCode();
        }
        if (this.getAllocation() != null) {
            _hashCode += this.getAllocation().hashCode();
        }
        if (this.getAnniversary() != null) {
            _hashCode += this.getAnniversary().hashCode();
        }
        if (this.getApprovalLimit() != null) {
            _hashCode += this.getApprovalLimit().hashCode();
        }
        if (this.getApprover() != null) {
            _hashCode += this.getApprover().hashCode();
        }
        if (this.getAttention() != null) {
            _hashCode += this.getAttention().hashCode();
        }
        if (this.getAuthWorkDate() != null) {
            _hashCode += this.getAuthWorkDate().hashCode();
        }
        if (this.getBaseWage() != null) {
            _hashCode += this.getBaseWage().hashCode();
        }
        if (this.getBaseWageType() != null) {
            _hashCode += this.getBaseWageType().hashCode();
        }
        if (this.getBillAddress() != null) {
            _hashCode += this.getBillAddress().hashCode();
        }
        if (this.getBillingClass() != null) {
            _hashCode += this.getBillingClass().hashCode();
        }
        if (this.getBirthDate() != null) {
            _hashCode += this.getBirthDate().hashCode();
        }
        if (this.getBirthDay() != null) {
            _hashCode += this.getBirthDay().hashCode();
        }
        if (this.getBonusTarget() != null) {
            _hashCode += this.getBonusTarget().hashCode();
        }
        if (this.getBonusTargetComment() != null) {
            _hashCode += this.getBonusTargetComment().hashCode();
        }
        if (this.getBonusTargetPayFrequency() != null) {
            _hashCode += this.getBonusTargetPayFrequency().hashCode();
        }
        if (this.getBonusTargetType() != null) {
            _hashCode += this.getBonusTargetType().hashCode();
        }
        if (this.getCContribution() != null) {
            _hashCode += this.getCContribution().hashCode();
        }
        if (this.getCity() != null) {
            _hashCode += this.getCity().hashCode();
        }
        if (this.get_class() != null) {
            _hashCode += this.get_class().hashCode();
        }
        if (this.getComments() != null) {
            _hashCode += this.getComments().hashCode();
        }
        if (this.getCommissionPlan() != null) {
            _hashCode += this.getCommissionPlan().hashCode();
        }
        if (this.getCompensationCurrency() != null) {
            _hashCode += this.getCompensationCurrency().hashCode();
        }
        if (this.getConcurrentWebServicesUser() != null) {
            _hashCode += this.getConcurrentWebServicesUser().hashCode();
        }
        if (this.getCorporateCardProfile() != null) {
            _hashCode += this.getCorporateCardProfile().hashCode();
        }
        if (this.getCountry() != null) {
            _hashCode += this.getCountry().hashCode();
        }
        if (this.getCounty() != null) {
            _hashCode += this.getCounty().hashCode();
        }
        if (this.getDateCreated() != null) {
            _hashCode += this.getDateCreated().hashCode();
        }
        if (this.getDeduction() != null) {
            _hashCode += this.getDeduction().hashCode();
        }
        if (this.getDefaultAcctCorpCardExp() != null) {
            _hashCode += this.getDefaultAcctCorpCardExp().hashCode();
        }
        if (this.getDefaultExpenseReportCurrency() != null) {
            _hashCode += this.getDefaultExpenseReportCurrency().hashCode();
        }
        if (this.getDefaultTaxReg() != null) {
            _hashCode += this.getDefaultTaxReg().hashCode();
        }
        if (this.getDefaultTaxRegText() != null) {
            _hashCode += this.getDefaultTaxRegText().hashCode();
        }
        if (this.getDepartment() != null) {
            _hashCode += this.getDepartment().hashCode();
        }
        if (this.getEarning() != null) {
            _hashCode += this.getEarning().hashCode();
        }
        if (this.getEducation() != null) {
            _hashCode += this.getEducation().hashCode();
        }
        if (this.getEligibleForCommission() != null) {
            _hashCode += this.getEligibleForCommission().hashCode();
        }
        if (this.getEmail() != null) {
            _hashCode += this.getEmail().hashCode();
        }
        if (this.getEmbossedName() != null) {
            _hashCode += this.getEmbossedName().hashCode();
        }
        if (this.getEmployeeStatus() != null) {
            _hashCode += this.getEmployeeStatus().hashCode();
        }
        if (this.getEmployeeType() != null) {
            _hashCode += this.getEmployeeType().hashCode();
        }
        if (this.getEmployeeTypeKpi() != null) {
            _hashCode += this.getEmployeeTypeKpi().hashCode();
        }
        if (this.getEntityId() != null) {
            _hashCode += this.getEntityId().hashCode();
        }
        if (this.getEthnicity() != null) {
            _hashCode += this.getEthnicity().hashCode();
        }
        if (this.getExpenseLimit() != null) {
            _hashCode += this.getExpenseLimit().hashCode();
        }
        if (this.getExpenseReportCurrency() != null) {
            _hashCode += this.getExpenseReportCurrency().hashCode();
        }
        if (this.getExpiration() != null) {
            _hashCode += this.getExpiration().hashCode();
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
        if (this.getFirstName() != null) {
            _hashCode += this.getFirstName().hashCode();
        }
        if (this.getGender() != null) {
            _hashCode += this.getGender().hashCode();
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
        if (this.getHireDate() != null) {
            _hashCode += this.getHireDate().hashCode();
        }
        if (this.getI9Verified() != null) {
            _hashCode += this.getI9Verified().hashCode();
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
        if (this.getIsDefaultBilling() != null) {
            _hashCode += this.getIsDefaultBilling().hashCode();
        }
        if (this.getIsDefaultShipping() != null) {
            _hashCode += this.getIsDefaultShipping().hashCode();
        }
        if (this.getIsInactive() != null) {
            _hashCode += this.getIsInactive().hashCode();
        }
        if (this.getIsJobManager() != null) {
            _hashCode += this.getIsJobManager().hashCode();
        }
        if (this.getIsJobResource() != null) {
            _hashCode += this.getIsJobResource().hashCode();
        }
        if (this.getIsTemplate() != null) {
            _hashCode += this.getIsTemplate().hashCode();
        }
        if (this.getJob() != null) {
            _hashCode += this.getJob().hashCode();
        }
        if (this.getJobDescription() != null) {
            _hashCode += this.getJobDescription().hashCode();
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
        if (this.getLastPaidDate() != null) {
            _hashCode += this.getLastPaidDate().hashCode();
        }
        if (this.getLastReviewDate() != null) {
            _hashCode += this.getLastReviewDate().hashCode();
        }
        if (this.getLevel() != null) {
            _hashCode += this.getLevel().hashCode();
        }
        if (this.getLocation() != null) {
            _hashCode += this.getLocation().hashCode();
        }
        if (this.getMaritalStatus() != null) {
            _hashCode += this.getMaritalStatus().hashCode();
        }
        if (this.getMiddleName() != null) {
            _hashCode += this.getMiddleName().hashCode();
        }
        if (this.getNextReviewDate() != null) {
            _hashCode += this.getNextReviewDate().hashCode();
        }
        if (this.getOfflineAccess() != null) {
            _hashCode += this.getOfflineAccess().hashCode();
        }
        if (this.getPayFrequency() != null) {
            _hashCode += this.getPayFrequency().hashCode();
        }
        if (this.getPermChangeDate() != null) {
            _hashCode += this.getPermChangeDate().hashCode();
        }
        if (this.getPermission() != null) {
            _hashCode += this.getPermission().hashCode();
        }
        if (this.getPermissionChange() != null) {
            _hashCode += this.getPermissionChange().hashCode();
        }
        if (this.getPhone() != null) {
            _hashCode += this.getPhone().hashCode();
        }
        if (this.getPhoneticName() != null) {
            _hashCode += this.getPhoneticName().hashCode();
        }
        if (this.getPositionTitle() != null) {
            _hashCode += this.getPositionTitle().hashCode();
        }
        if (this.getPrimaryEarningAmount() != null) {
            _hashCode += this.getPrimaryEarningAmount().hashCode();
        }
        if (this.getPrimaryEarningItem() != null) {
            _hashCode += this.getPrimaryEarningItem().hashCode();
        }
        if (this.getPrimaryEarningType() != null) {
            _hashCode += this.getPrimaryEarningType().hashCode();
        }
        if (this.getPurchaseOrderApprovalLimit() != null) {
            _hashCode += this.getPurchaseOrderApprovalLimit().hashCode();
        }
        if (this.getPurchaseOrderApprover() != null) {
            _hashCode += this.getPurchaseOrderApprover().hashCode();
        }
        if (this.getPurchaseOrderLimit() != null) {
            _hashCode += this.getPurchaseOrderLimit().hashCode();
        }
        if (this.getReleaseDate() != null) {
            _hashCode += this.getReleaseDate().hashCode();
        }
        if (this.getResidentStatus() != null) {
            _hashCode += this.getResidentStatus().hashCode();
        }
        if (this.getRole() != null) {
            _hashCode += this.getRole().hashCode();
        }
        if (this.getRoleChange() != null) {
            _hashCode += this.getRoleChange().hashCode();
        }
        if (this.getRoleChangeDate() != null) {
            _hashCode += this.getRoleChangeDate().hashCode();
        }
        if (this.getSalesRep() != null) {
            _hashCode += this.getSalesRep().hashCode();
        }
        if (this.getSalesRole() != null) {
            _hashCode += this.getSalesRole().hashCode();
        }
        if (this.getSalutation() != null) {
            _hashCode += this.getSalutation().hashCode();
        }
        if (this.getSocialSecurityNumber() != null) {
            _hashCode += this.getSocialSecurityNumber().hashCode();
        }
        if (this.getStartDateTimeOffCalc() != null) {
            _hashCode += this.getStartDateTimeOffCalc().hashCode();
        }
        if (this.getState() != null) {
            _hashCode += this.getState().hashCode();
        }
        if (this.getSubsidiary() != null) {
            _hashCode += this.getSubsidiary().hashCode();
        }
        if (this.getSupervisor() != null) {
            _hashCode += this.getSupervisor().hashCode();
        }
        if (this.getSupportRep() != null) {
            _hashCode += this.getSupportRep().hashCode();
        }
        if (this.getTargetUtilization() != null) {
            _hashCode += this.getTargetUtilization().hashCode();
        }
        if (this.getTerminationCategory() != null) {
            _hashCode += this.getTerminationCategory().hashCode();
        }
        if (this.getTerminationDetails() != null) {
            _hashCode += this.getTerminationDetails().hashCode();
        }
        if (this.getTerminationReason() != null) {
            _hashCode += this.getTerminationReason().hashCode();
        }
        if (this.getTerminationRegretted() != null) {
            _hashCode += this.getTerminationRegretted().hashCode();
        }
        if (this.getTimeApprover() != null) {
            _hashCode += this.getTimeApprover().hashCode();
        }
        if (this.getTimeOffPlan() != null) {
            _hashCode += this.getTimeOffPlan().hashCode();
        }
        if (this.getTitle() != null) {
            _hashCode += this.getTitle().hashCode();
        }
        if (this.getUsePerquest() != null) {
            _hashCode += this.getUsePerquest().hashCode();
        }
        if (this.getUseTimeData() != null) {
            _hashCode += this.getUseTimeData().hashCode();
        }
        if (this.getVisaExpDate() != null) {
            _hashCode += this.getVisaExpDate().hashCode();
        }
        if (this.getVisaType() != null) {
            _hashCode += this.getVisaType().hashCode();
        }
        if (this.getWithholding() != null) {
            _hashCode += this.getWithholding().hashCode();
        }
        if (this.getWorkCalendar() != null) {
            _hashCode += this.getWorkCalendar().hashCode();
        }
        if (this.getWorkplace() != null) {
            _hashCode += this.getWorkplace().hashCode();
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "EmployeeSearchBasic"));
        ElementDesc elemField = new ElementDesc();
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
        elemField.setFieldName("alienNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "alienNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("allocation");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "allocation"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("anniversary");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "anniversary"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("approvalLimit");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "approvalLimit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("approver");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "approver"));
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
        elemField.setFieldName("authWorkDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "authWorkDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("baseWage");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "baseWage"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("baseWageType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "baseWageType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
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
        elemField.setFieldName("billingClass");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billingClass"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("birthDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "birthDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("birthDay");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "birthDay"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("bonusTarget");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "bonusTarget"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("bonusTargetComment");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "bonusTargetComment"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("bonusTargetPayFrequency");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "bonusTargetPayFrequency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("bonusTargetType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "bonusTargetType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("CContribution");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "cContribution"));
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
        elemField.setFieldName("_class");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "class"));
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
        elemField.setFieldName("commissionPlan");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "commissionPlan"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("compensationCurrency");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "compensationCurrency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("concurrentWebServicesUser");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "concurrentWebServicesUser"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("corporateCardProfile");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "corporateCardProfile"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("dateCreated");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "dateCreated"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("deduction");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "deduction"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("defaultAcctCorpCardExp");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "defaultAcctCorpCardExp"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("defaultExpenseReportCurrency");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "defaultExpenseReportCurrency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("department");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "department"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("earning");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "earning"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("education");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "education"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("embossedName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "embossedName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("employeeStatus");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "employeeStatus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("employeeType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "employeeType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("employeeTypeKpi");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "employeeTypeKpi"));
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
        elemField.setFieldName("ethnicity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ethnicity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("expenseLimit");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "expenseLimit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("expenseReportCurrency");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "expenseReportCurrency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("expiration");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "expiration"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
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
        elemField.setFieldName("firstName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "firstName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("gender");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "gender"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
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
        elemField.setFieldName("hireDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "hireDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("i9Verified");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "I9Verified"));
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
        elemField.setFieldName("isJobManager");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isJobManager"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isJobResource");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isJobResource"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isTemplate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isTemplate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("job");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "job"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("jobDescription");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "jobDescription"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
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
        elemField.setFieldName("lastPaidDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lastPaidDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastReviewDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lastReviewDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
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
        elemField.setFieldName("location");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "location"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("maritalStatus");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "maritalStatus"));
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
        elemField.setFieldName("nextReviewDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "nextReviewDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("offlineAccess");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "offlineAccess"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("payFrequency");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "payFrequency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("permChangeDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "permChangeDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
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
        elemField.setFieldName("permissionChange");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "permissionChange"));
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
        elemField.setFieldName("positionTitle");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "positionTitle"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("primaryEarningAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "primaryEarningAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("primaryEarningItem");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "primaryEarningItem"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("primaryEarningType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "primaryEarningType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("purchaseOrderApprovalLimit");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "purchaseOrderApprovalLimit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("purchaseOrderApprover");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "purchaseOrderApprover"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("purchaseOrderLimit");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "purchaseOrderLimit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("releaseDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "releaseDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("residentStatus");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "residentStatus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("roleChange");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "roleChange"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("roleChangeDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "roleChangeDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("salesRep");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "salesRep"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("salesRole");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "salesRole"));
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
        elemField.setFieldName("socialSecurityNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "socialSecurityNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("startDateTimeOffCalc");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "startDateTimeOffCalc"));
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
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("supervisor");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "supervisor"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("supportRep");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "supportRep"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("targetUtilization");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "targetUtilization"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("terminationCategory");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "terminationCategory"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("terminationDetails");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "terminationDetails"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("terminationReason");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "terminationReason"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("terminationRegretted");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "terminationRegretted"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
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
        elemField.setFieldName("timeOffPlan");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "timeOffPlan"));
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
        elemField.setFieldName("usePerquest");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "usePerquest"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("useTimeData");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "useTimeData"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("visaExpDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "visaExpDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("visaType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "visaType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("withholding");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "withholding"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("workplace");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "workplace"));
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

