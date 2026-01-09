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
package com.netsuite.suitetalk.proxy.v2022_1.lists.employees;

import com.netsuite.suitetalk.proxy.v2022_1.lists.employees.EmployeeAccruedTimeList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.employees.EmployeeAddressbookList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.employees.EmployeeCompanyContributionList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.employees.EmployeeCorporateCardsList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.employees.EmployeeCurrencyList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.employees.EmployeeDeductionList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.employees.EmployeeDirectDepositList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.employees.EmployeeEarningList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.employees.EmployeeEmergencyContactList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.employees.EmployeeHcmPositionList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.employees.EmployeeHrEducationList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.employees.EmployeeRatesList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.employees.EmployeeRolesList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.employees.EmployeeSubscriptionsList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.employees.types.EmployeeBaseWageType;
import com.netsuite.suitetalk.proxy.v2022_1.lists.employees.types.EmployeeBonusTargetPayFrequency;
import com.netsuite.suitetalk.proxy.v2022_1.lists.employees.types.EmployeeBonusTargetType;
import com.netsuite.suitetalk.proxy.v2022_1.lists.employees.types.EmployeeCommissionPaymentPreference;
import com.netsuite.suitetalk.proxy.v2022_1.lists.employees.types.EmployeeCompensationCurrency;
import com.netsuite.suitetalk.proxy.v2022_1.lists.employees.types.EmployeePayFrequency;
import com.netsuite.suitetalk.proxy.v2022_1.lists.employees.types.EmployeeTerminationCategory;
import com.netsuite.suitetalk.proxy.v2022_1.lists.employees.types.EmployeeTerminationRegretted;
import com.netsuite.suitetalk.proxy.v2022_1.lists.employees.types.EmployeeUseTimeData;
import com.netsuite.suitetalk.proxy.v2022_1.lists.employees.types.EmployeeWorkAssignment;
import com.netsuite.suitetalk.proxy.v2022_1.lists.employees.types.Gender;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.types.GlobalSubscriptionStatus;
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

public class Employee
extends Record
implements Serializable {
    private RecordRef customForm;
    private RecordRef template;
    private String entityId;
    private String salutation;
    private String firstName;
    private String middleName;
    private String lastName;
    private String altName;
    private String phone;
    private String fax;
    private String email;
    private String defaultAddress;
    private Boolean isInactive;
    private String phoneticName;
    private Calendar lastModifiedDate;
    private Calendar dateCreated;
    private String initials;
    private String officePhone;
    private String homePhone;
    private String mobilePhone;
    private RecordRef department;
    private RecordRef _class;
    private RecordRef location;
    private RecordRef subsidiary;
    private RecordRef billingClass;
    private String accountNumber;
    private EmployeeCompensationCurrency compensationCurrency;
    private EmployeeBaseWageType baseWageType;
    private Double baseWage;
    private String comments;
    private GlobalSubscriptionStatus globalSubscriptionStatus;
    private RecordRef image;
    private EmployeePayFrequency payFrequency;
    private Calendar lastPaidDate;
    private RecordRef currency;
    private EmployeeUseTimeData useTimeData;
    private Boolean usePerquest;
    private RecordRef workplace;
    private String adpId;
    private Boolean directDeposit;
    private Double expenseLimit;
    private Double purchaseOrderLimit;
    private Double purchaseOrderApprovalLimit;
    private String socialSecurityNumber;
    private RecordRef supervisor;
    private RecordRef approver;
    private Double approvalLimit;
    private RecordRef timeApprover;
    private RecordRef employeeType;
    private Boolean isSalesRep;
    private RecordRef salesRole;
    private Boolean isSupportRep;
    private Boolean isJobResource;
    private Double laborCost;
    private Calendar birthDate;
    private Calendar hireDate;
    private Calendar releaseDate;
    private String terminationDetails;
    private RecordRef terminationReason;
    private EmployeeTerminationRegretted terminationRegretted;
    private EmployeeTerminationCategory terminationCategory;
    private RecordRef timeOffPlan;
    private Calendar lastReviewDate;
    private Calendar nextReviewDate;
    private String title;
    private RecordRef employeeStatus;
    private String jobDescription;
    private EmployeeWorkAssignment workAssignment;
    private RecordRef job;
    private RecordRef maritalStatus;
    private RecordRef ethnicity;
    private Gender gender;
    private RecordRef purchaseOrderApprover;
    private RecordRef workCalendar;
    private Boolean giveAccess;
    private RecordRef defaultExpenseReportCurrency;
    private Boolean concurrentWebServicesUser;
    private Boolean sendEmail;
    private Boolean hasOfflineAccess;
    private String password;
    private String password2;
    private Boolean requirePwdChange;
    private Boolean inheritIPRules;
    private String IPAddressRule;
    private Calendar startDateTimeOffCalc;
    private EmployeeCommissionPaymentPreference commissionPaymentPreference;
    private Boolean billPay;
    private RecordRef defaultAcctCorpCardExp;
    private Boolean eligibleForCommission;
    private EmployeeSubscriptionsList subscriptionsList;
    private EmployeeRatesList ratesList;
    private EmployeeAddressbookList addressbookList;
    private EmployeeRolesList rolesList;
    private EmployeeHrEducationList hrEducationList;
    private EmployeeAccruedTimeList accruedTimeList;
    private EmployeeDirectDepositList directDepositList;
    private EmployeeCurrencyList currencyList;
    private EmployeeCompanyContributionList companyContributionList;
    private EmployeeEarningList earningList;
    private EmployeeEmergencyContactList emergencyContactList;
    private EmployeeHcmPositionList hcmPositionList;
    private EmployeeDeductionList deductionList;
    private Boolean isJobManager;
    private Double targetUtilization;
    private Double bonusTarget;
    private String bonusTargetComment;
    private EmployeeBonusTargetType bonusTargetType;
    private EmployeeBonusTargetPayFrequency bonusTargetPayFrequency;
    private EmployeeCorporateCardsList corporateCardsList;
    private CustomFieldList customFieldList;
    private String internalId;
    private String externalId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(Employee.class, true);

    public Employee() {
    }

    public Employee(NullField nullFieldList, String internalId, String externalId, RecordRef customForm, RecordRef template, String entityId, String salutation, String firstName, String middleName, String lastName, String altName, String phone, String fax, String email, String defaultAddress, Boolean isInactive, String phoneticName, Calendar lastModifiedDate, Calendar dateCreated, String initials, String officePhone, String homePhone, String mobilePhone, RecordRef department, RecordRef _class, RecordRef location, RecordRef subsidiary, RecordRef billingClass, String accountNumber, EmployeeCompensationCurrency compensationCurrency, EmployeeBaseWageType baseWageType, Double baseWage, String comments, GlobalSubscriptionStatus globalSubscriptionStatus, RecordRef image, EmployeePayFrequency payFrequency, Calendar lastPaidDate, RecordRef currency, EmployeeUseTimeData useTimeData, Boolean usePerquest, RecordRef workplace, String adpId, Boolean directDeposit, Double expenseLimit, Double purchaseOrderLimit, Double purchaseOrderApprovalLimit, String socialSecurityNumber, RecordRef supervisor, RecordRef approver, Double approvalLimit, RecordRef timeApprover, RecordRef employeeType, Boolean isSalesRep, RecordRef salesRole, Boolean isSupportRep, Boolean isJobResource, Double laborCost, Calendar birthDate, Calendar hireDate, Calendar releaseDate, String terminationDetails, RecordRef terminationReason, EmployeeTerminationRegretted terminationRegretted, EmployeeTerminationCategory terminationCategory, RecordRef timeOffPlan, Calendar lastReviewDate, Calendar nextReviewDate, String title, RecordRef employeeStatus, String jobDescription, EmployeeWorkAssignment workAssignment, RecordRef job, RecordRef maritalStatus, RecordRef ethnicity, Gender gender, RecordRef purchaseOrderApprover, RecordRef workCalendar, Boolean giveAccess, RecordRef defaultExpenseReportCurrency, Boolean concurrentWebServicesUser, Boolean sendEmail, Boolean hasOfflineAccess, String password, String password2, Boolean requirePwdChange, Boolean inheritIPRules, String IPAddressRule, Calendar startDateTimeOffCalc, EmployeeCommissionPaymentPreference commissionPaymentPreference, Boolean billPay, RecordRef defaultAcctCorpCardExp, Boolean eligibleForCommission, EmployeeSubscriptionsList subscriptionsList, EmployeeRatesList ratesList, EmployeeAddressbookList addressbookList, EmployeeRolesList rolesList, EmployeeHrEducationList hrEducationList, EmployeeAccruedTimeList accruedTimeList, EmployeeDirectDepositList directDepositList, EmployeeCurrencyList currencyList, EmployeeCompanyContributionList companyContributionList, EmployeeEarningList earningList, EmployeeEmergencyContactList emergencyContactList, EmployeeHcmPositionList hcmPositionList, EmployeeDeductionList deductionList, Boolean isJobManager, Double targetUtilization, Double bonusTarget, String bonusTargetComment, EmployeeBonusTargetType bonusTargetType, EmployeeBonusTargetPayFrequency bonusTargetPayFrequency, EmployeeCorporateCardsList corporateCardsList, CustomFieldList customFieldList) {
        super(nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.customForm = customForm;
        this.template = template;
        this.entityId = entityId;
        this.salutation = salutation;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.altName = altName;
        this.phone = phone;
        this.fax = fax;
        this.email = email;
        this.defaultAddress = defaultAddress;
        this.isInactive = isInactive;
        this.phoneticName = phoneticName;
        this.lastModifiedDate = lastModifiedDate;
        this.dateCreated = dateCreated;
        this.initials = initials;
        this.officePhone = officePhone;
        this.homePhone = homePhone;
        this.mobilePhone = mobilePhone;
        this.department = department;
        this._class = _class;
        this.location = location;
        this.subsidiary = subsidiary;
        this.billingClass = billingClass;
        this.accountNumber = accountNumber;
        this.compensationCurrency = compensationCurrency;
        this.baseWageType = baseWageType;
        this.baseWage = baseWage;
        this.comments = comments;
        this.globalSubscriptionStatus = globalSubscriptionStatus;
        this.image = image;
        this.payFrequency = payFrequency;
        this.lastPaidDate = lastPaidDate;
        this.currency = currency;
        this.useTimeData = useTimeData;
        this.usePerquest = usePerquest;
        this.workplace = workplace;
        this.adpId = adpId;
        this.directDeposit = directDeposit;
        this.expenseLimit = expenseLimit;
        this.purchaseOrderLimit = purchaseOrderLimit;
        this.purchaseOrderApprovalLimit = purchaseOrderApprovalLimit;
        this.socialSecurityNumber = socialSecurityNumber;
        this.supervisor = supervisor;
        this.approver = approver;
        this.approvalLimit = approvalLimit;
        this.timeApprover = timeApprover;
        this.employeeType = employeeType;
        this.isSalesRep = isSalesRep;
        this.salesRole = salesRole;
        this.isSupportRep = isSupportRep;
        this.isJobResource = isJobResource;
        this.laborCost = laborCost;
        this.birthDate = birthDate;
        this.hireDate = hireDate;
        this.releaseDate = releaseDate;
        this.terminationDetails = terminationDetails;
        this.terminationReason = terminationReason;
        this.terminationRegretted = terminationRegretted;
        this.terminationCategory = terminationCategory;
        this.timeOffPlan = timeOffPlan;
        this.lastReviewDate = lastReviewDate;
        this.nextReviewDate = nextReviewDate;
        this.title = title;
        this.employeeStatus = employeeStatus;
        this.jobDescription = jobDescription;
        this.workAssignment = workAssignment;
        this.job = job;
        this.maritalStatus = maritalStatus;
        this.ethnicity = ethnicity;
        this.gender = gender;
        this.purchaseOrderApprover = purchaseOrderApprover;
        this.workCalendar = workCalendar;
        this.giveAccess = giveAccess;
        this.defaultExpenseReportCurrency = defaultExpenseReportCurrency;
        this.concurrentWebServicesUser = concurrentWebServicesUser;
        this.sendEmail = sendEmail;
        this.hasOfflineAccess = hasOfflineAccess;
        this.password = password;
        this.password2 = password2;
        this.requirePwdChange = requirePwdChange;
        this.inheritIPRules = inheritIPRules;
        this.IPAddressRule = IPAddressRule;
        this.startDateTimeOffCalc = startDateTimeOffCalc;
        this.commissionPaymentPreference = commissionPaymentPreference;
        this.billPay = billPay;
        this.defaultAcctCorpCardExp = defaultAcctCorpCardExp;
        this.eligibleForCommission = eligibleForCommission;
        this.subscriptionsList = subscriptionsList;
        this.ratesList = ratesList;
        this.addressbookList = addressbookList;
        this.rolesList = rolesList;
        this.hrEducationList = hrEducationList;
        this.accruedTimeList = accruedTimeList;
        this.directDepositList = directDepositList;
        this.currencyList = currencyList;
        this.companyContributionList = companyContributionList;
        this.earningList = earningList;
        this.emergencyContactList = emergencyContactList;
        this.hcmPositionList = hcmPositionList;
        this.deductionList = deductionList;
        this.isJobManager = isJobManager;
        this.targetUtilization = targetUtilization;
        this.bonusTarget = bonusTarget;
        this.bonusTargetComment = bonusTargetComment;
        this.bonusTargetType = bonusTargetType;
        this.bonusTargetPayFrequency = bonusTargetPayFrequency;
        this.corporateCardsList = corporateCardsList;
        this.customFieldList = customFieldList;
    }

    public RecordRef getCustomForm() {
        return this.customForm;
    }

    public void setCustomForm(RecordRef customForm) {
        this.customForm = customForm;
    }

    public RecordRef getTemplate() {
        return this.template;
    }

    public void setTemplate(RecordRef template) {
        this.template = template;
    }

    public String getEntityId() {
        return this.entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
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

    public String getAltName() {
        return this.altName;
    }

    public void setAltName(String altName) {
        this.altName = altName;
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

    public String getPhoneticName() {
        return this.phoneticName;
    }

    public void setPhoneticName(String phoneticName) {
        this.phoneticName = phoneticName;
    }

    public Calendar getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    public void setLastModifiedDate(Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public Calendar getDateCreated() {
        return this.dateCreated;
    }

    public void setDateCreated(Calendar dateCreated) {
        this.dateCreated = dateCreated;
    }

    public String getInitials() {
        return this.initials;
    }

    public void setInitials(String initials) {
        this.initials = initials;
    }

    public String getOfficePhone() {
        return this.officePhone;
    }

    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
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

    public RecordRef getDepartment() {
        return this.department;
    }

    public void setDepartment(RecordRef department) {
        this.department = department;
    }

    public RecordRef get_class() {
        return this._class;
    }

    public void set_class(RecordRef _class) {
        this._class = _class;
    }

    public RecordRef getLocation() {
        return this.location;
    }

    public void setLocation(RecordRef location) {
        this.location = location;
    }

    public RecordRef getSubsidiary() {
        return this.subsidiary;
    }

    public void setSubsidiary(RecordRef subsidiary) {
        this.subsidiary = subsidiary;
    }

    public RecordRef getBillingClass() {
        return this.billingClass;
    }

    public void setBillingClass(RecordRef billingClass) {
        this.billingClass = billingClass;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public EmployeeCompensationCurrency getCompensationCurrency() {
        return this.compensationCurrency;
    }

    public void setCompensationCurrency(EmployeeCompensationCurrency compensationCurrency) {
        this.compensationCurrency = compensationCurrency;
    }

    public EmployeeBaseWageType getBaseWageType() {
        return this.baseWageType;
    }

    public void setBaseWageType(EmployeeBaseWageType baseWageType) {
        this.baseWageType = baseWageType;
    }

    public Double getBaseWage() {
        return this.baseWage;
    }

    public void setBaseWage(Double baseWage) {
        this.baseWage = baseWage;
    }

    public String getComments() {
        return this.comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public GlobalSubscriptionStatus getGlobalSubscriptionStatus() {
        return this.globalSubscriptionStatus;
    }

    public void setGlobalSubscriptionStatus(GlobalSubscriptionStatus globalSubscriptionStatus) {
        this.globalSubscriptionStatus = globalSubscriptionStatus;
    }

    public RecordRef getImage() {
        return this.image;
    }

    public void setImage(RecordRef image) {
        this.image = image;
    }

    public EmployeePayFrequency getPayFrequency() {
        return this.payFrequency;
    }

    public void setPayFrequency(EmployeePayFrequency payFrequency) {
        this.payFrequency = payFrequency;
    }

    public Calendar getLastPaidDate() {
        return this.lastPaidDate;
    }

    public void setLastPaidDate(Calendar lastPaidDate) {
        this.lastPaidDate = lastPaidDate;
    }

    public RecordRef getCurrency() {
        return this.currency;
    }

    public void setCurrency(RecordRef currency) {
        this.currency = currency;
    }

    public EmployeeUseTimeData getUseTimeData() {
        return this.useTimeData;
    }

    public void setUseTimeData(EmployeeUseTimeData useTimeData) {
        this.useTimeData = useTimeData;
    }

    public Boolean getUsePerquest() {
        return this.usePerquest;
    }

    public void setUsePerquest(Boolean usePerquest) {
        this.usePerquest = usePerquest;
    }

    public RecordRef getWorkplace() {
        return this.workplace;
    }

    public void setWorkplace(RecordRef workplace) {
        this.workplace = workplace;
    }

    public String getAdpId() {
        return this.adpId;
    }

    public void setAdpId(String adpId) {
        this.adpId = adpId;
    }

    public Boolean getDirectDeposit() {
        return this.directDeposit;
    }

    public void setDirectDeposit(Boolean directDeposit) {
        this.directDeposit = directDeposit;
    }

    public Double getExpenseLimit() {
        return this.expenseLimit;
    }

    public void setExpenseLimit(Double expenseLimit) {
        this.expenseLimit = expenseLimit;
    }

    public Double getPurchaseOrderLimit() {
        return this.purchaseOrderLimit;
    }

    public void setPurchaseOrderLimit(Double purchaseOrderLimit) {
        this.purchaseOrderLimit = purchaseOrderLimit;
    }

    public Double getPurchaseOrderApprovalLimit() {
        return this.purchaseOrderApprovalLimit;
    }

    public void setPurchaseOrderApprovalLimit(Double purchaseOrderApprovalLimit) {
        this.purchaseOrderApprovalLimit = purchaseOrderApprovalLimit;
    }

    public String getSocialSecurityNumber() {
        return this.socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public RecordRef getSupervisor() {
        return this.supervisor;
    }

    public void setSupervisor(RecordRef supervisor) {
        this.supervisor = supervisor;
    }

    public RecordRef getApprover() {
        return this.approver;
    }

    public void setApprover(RecordRef approver) {
        this.approver = approver;
    }

    public Double getApprovalLimit() {
        return this.approvalLimit;
    }

    public void setApprovalLimit(Double approvalLimit) {
        this.approvalLimit = approvalLimit;
    }

    public RecordRef getTimeApprover() {
        return this.timeApprover;
    }

    public void setTimeApprover(RecordRef timeApprover) {
        this.timeApprover = timeApprover;
    }

    public RecordRef getEmployeeType() {
        return this.employeeType;
    }

    public void setEmployeeType(RecordRef employeeType) {
        this.employeeType = employeeType;
    }

    public Boolean getIsSalesRep() {
        return this.isSalesRep;
    }

    public void setIsSalesRep(Boolean isSalesRep) {
        this.isSalesRep = isSalesRep;
    }

    public RecordRef getSalesRole() {
        return this.salesRole;
    }

    public void setSalesRole(RecordRef salesRole) {
        this.salesRole = salesRole;
    }

    public Boolean getIsSupportRep() {
        return this.isSupportRep;
    }

    public void setIsSupportRep(Boolean isSupportRep) {
        this.isSupportRep = isSupportRep;
    }

    public Boolean getIsJobResource() {
        return this.isJobResource;
    }

    public void setIsJobResource(Boolean isJobResource) {
        this.isJobResource = isJobResource;
    }

    public Double getLaborCost() {
        return this.laborCost;
    }

    public void setLaborCost(Double laborCost) {
        this.laborCost = laborCost;
    }

    public Calendar getBirthDate() {
        return this.birthDate;
    }

    public void setBirthDate(Calendar birthDate) {
        this.birthDate = birthDate;
    }

    public Calendar getHireDate() {
        return this.hireDate;
    }

    public void setHireDate(Calendar hireDate) {
        this.hireDate = hireDate;
    }

    public Calendar getReleaseDate() {
        return this.releaseDate;
    }

    public void setReleaseDate(Calendar releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getTerminationDetails() {
        return this.terminationDetails;
    }

    public void setTerminationDetails(String terminationDetails) {
        this.terminationDetails = terminationDetails;
    }

    public RecordRef getTerminationReason() {
        return this.terminationReason;
    }

    public void setTerminationReason(RecordRef terminationReason) {
        this.terminationReason = terminationReason;
    }

    public EmployeeTerminationRegretted getTerminationRegretted() {
        return this.terminationRegretted;
    }

    public void setTerminationRegretted(EmployeeTerminationRegretted terminationRegretted) {
        this.terminationRegretted = terminationRegretted;
    }

    public EmployeeTerminationCategory getTerminationCategory() {
        return this.terminationCategory;
    }

    public void setTerminationCategory(EmployeeTerminationCategory terminationCategory) {
        this.terminationCategory = terminationCategory;
    }

    public RecordRef getTimeOffPlan() {
        return this.timeOffPlan;
    }

    public void setTimeOffPlan(RecordRef timeOffPlan) {
        this.timeOffPlan = timeOffPlan;
    }

    public Calendar getLastReviewDate() {
        return this.lastReviewDate;
    }

    public void setLastReviewDate(Calendar lastReviewDate) {
        this.lastReviewDate = lastReviewDate;
    }

    public Calendar getNextReviewDate() {
        return this.nextReviewDate;
    }

    public void setNextReviewDate(Calendar nextReviewDate) {
        this.nextReviewDate = nextReviewDate;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public RecordRef getEmployeeStatus() {
        return this.employeeStatus;
    }

    public void setEmployeeStatus(RecordRef employeeStatus) {
        this.employeeStatus = employeeStatus;
    }

    public String getJobDescription() {
        return this.jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public EmployeeWorkAssignment getWorkAssignment() {
        return this.workAssignment;
    }

    public void setWorkAssignment(EmployeeWorkAssignment workAssignment) {
        this.workAssignment = workAssignment;
    }

    public RecordRef getJob() {
        return this.job;
    }

    public void setJob(RecordRef job) {
        this.job = job;
    }

    public RecordRef getMaritalStatus() {
        return this.maritalStatus;
    }

    public void setMaritalStatus(RecordRef maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public RecordRef getEthnicity() {
        return this.ethnicity;
    }

    public void setEthnicity(RecordRef ethnicity) {
        this.ethnicity = ethnicity;
    }

    public Gender getGender() {
        return this.gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public RecordRef getPurchaseOrderApprover() {
        return this.purchaseOrderApprover;
    }

    public void setPurchaseOrderApprover(RecordRef purchaseOrderApprover) {
        this.purchaseOrderApprover = purchaseOrderApprover;
    }

    public RecordRef getWorkCalendar() {
        return this.workCalendar;
    }

    public void setWorkCalendar(RecordRef workCalendar) {
        this.workCalendar = workCalendar;
    }

    public Boolean getGiveAccess() {
        return this.giveAccess;
    }

    public void setGiveAccess(Boolean giveAccess) {
        this.giveAccess = giveAccess;
    }

    public RecordRef getDefaultExpenseReportCurrency() {
        return this.defaultExpenseReportCurrency;
    }

    public void setDefaultExpenseReportCurrency(RecordRef defaultExpenseReportCurrency) {
        this.defaultExpenseReportCurrency = defaultExpenseReportCurrency;
    }

    public Boolean getConcurrentWebServicesUser() {
        return this.concurrentWebServicesUser;
    }

    public void setConcurrentWebServicesUser(Boolean concurrentWebServicesUser) {
        this.concurrentWebServicesUser = concurrentWebServicesUser;
    }

    public Boolean getSendEmail() {
        return this.sendEmail;
    }

    public void setSendEmail(Boolean sendEmail) {
        this.sendEmail = sendEmail;
    }

    public Boolean getHasOfflineAccess() {
        return this.hasOfflineAccess;
    }

    public void setHasOfflineAccess(Boolean hasOfflineAccess) {
        this.hasOfflineAccess = hasOfflineAccess;
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

    public Boolean getInheritIPRules() {
        return this.inheritIPRules;
    }

    public void setInheritIPRules(Boolean inheritIPRules) {
        this.inheritIPRules = inheritIPRules;
    }

    public String getIPAddressRule() {
        return this.IPAddressRule;
    }

    public void setIPAddressRule(String IPAddressRule) {
        this.IPAddressRule = IPAddressRule;
    }

    public Calendar getStartDateTimeOffCalc() {
        return this.startDateTimeOffCalc;
    }

    public void setStartDateTimeOffCalc(Calendar startDateTimeOffCalc) {
        this.startDateTimeOffCalc = startDateTimeOffCalc;
    }

    public EmployeeCommissionPaymentPreference getCommissionPaymentPreference() {
        return this.commissionPaymentPreference;
    }

    public void setCommissionPaymentPreference(EmployeeCommissionPaymentPreference commissionPaymentPreference) {
        this.commissionPaymentPreference = commissionPaymentPreference;
    }

    public Boolean getBillPay() {
        return this.billPay;
    }

    public void setBillPay(Boolean billPay) {
        this.billPay = billPay;
    }

    public RecordRef getDefaultAcctCorpCardExp() {
        return this.defaultAcctCorpCardExp;
    }

    public void setDefaultAcctCorpCardExp(RecordRef defaultAcctCorpCardExp) {
        this.defaultAcctCorpCardExp = defaultAcctCorpCardExp;
    }

    public Boolean getEligibleForCommission() {
        return this.eligibleForCommission;
    }

    public void setEligibleForCommission(Boolean eligibleForCommission) {
        this.eligibleForCommission = eligibleForCommission;
    }

    public EmployeeSubscriptionsList getSubscriptionsList() {
        return this.subscriptionsList;
    }

    public void setSubscriptionsList(EmployeeSubscriptionsList subscriptionsList) {
        this.subscriptionsList = subscriptionsList;
    }

    public EmployeeRatesList getRatesList() {
        return this.ratesList;
    }

    public void setRatesList(EmployeeRatesList ratesList) {
        this.ratesList = ratesList;
    }

    public EmployeeAddressbookList getAddressbookList() {
        return this.addressbookList;
    }

    public void setAddressbookList(EmployeeAddressbookList addressbookList) {
        this.addressbookList = addressbookList;
    }

    public EmployeeRolesList getRolesList() {
        return this.rolesList;
    }

    public void setRolesList(EmployeeRolesList rolesList) {
        this.rolesList = rolesList;
    }

    public EmployeeHrEducationList getHrEducationList() {
        return this.hrEducationList;
    }

    public void setHrEducationList(EmployeeHrEducationList hrEducationList) {
        this.hrEducationList = hrEducationList;
    }

    public EmployeeAccruedTimeList getAccruedTimeList() {
        return this.accruedTimeList;
    }

    public void setAccruedTimeList(EmployeeAccruedTimeList accruedTimeList) {
        this.accruedTimeList = accruedTimeList;
    }

    public EmployeeDirectDepositList getDirectDepositList() {
        return this.directDepositList;
    }

    public void setDirectDepositList(EmployeeDirectDepositList directDepositList) {
        this.directDepositList = directDepositList;
    }

    public EmployeeCurrencyList getCurrencyList() {
        return this.currencyList;
    }

    public void setCurrencyList(EmployeeCurrencyList currencyList) {
        this.currencyList = currencyList;
    }

    public EmployeeCompanyContributionList getCompanyContributionList() {
        return this.companyContributionList;
    }

    public void setCompanyContributionList(EmployeeCompanyContributionList companyContributionList) {
        this.companyContributionList = companyContributionList;
    }

    public EmployeeEarningList getEarningList() {
        return this.earningList;
    }

    public void setEarningList(EmployeeEarningList earningList) {
        this.earningList = earningList;
    }

    public EmployeeEmergencyContactList getEmergencyContactList() {
        return this.emergencyContactList;
    }

    public void setEmergencyContactList(EmployeeEmergencyContactList emergencyContactList) {
        this.emergencyContactList = emergencyContactList;
    }

    public EmployeeHcmPositionList getHcmPositionList() {
        return this.hcmPositionList;
    }

    public void setHcmPositionList(EmployeeHcmPositionList hcmPositionList) {
        this.hcmPositionList = hcmPositionList;
    }

    public EmployeeDeductionList getDeductionList() {
        return this.deductionList;
    }

    public void setDeductionList(EmployeeDeductionList deductionList) {
        this.deductionList = deductionList;
    }

    public Boolean getIsJobManager() {
        return this.isJobManager;
    }

    public void setIsJobManager(Boolean isJobManager) {
        this.isJobManager = isJobManager;
    }

    public Double getTargetUtilization() {
        return this.targetUtilization;
    }

    public void setTargetUtilization(Double targetUtilization) {
        this.targetUtilization = targetUtilization;
    }

    public Double getBonusTarget() {
        return this.bonusTarget;
    }

    public void setBonusTarget(Double bonusTarget) {
        this.bonusTarget = bonusTarget;
    }

    public String getBonusTargetComment() {
        return this.bonusTargetComment;
    }

    public void setBonusTargetComment(String bonusTargetComment) {
        this.bonusTargetComment = bonusTargetComment;
    }

    public EmployeeBonusTargetType getBonusTargetType() {
        return this.bonusTargetType;
    }

    public void setBonusTargetType(EmployeeBonusTargetType bonusTargetType) {
        this.bonusTargetType = bonusTargetType;
    }

    public EmployeeBonusTargetPayFrequency getBonusTargetPayFrequency() {
        return this.bonusTargetPayFrequency;
    }

    public void setBonusTargetPayFrequency(EmployeeBonusTargetPayFrequency bonusTargetPayFrequency) {
        this.bonusTargetPayFrequency = bonusTargetPayFrequency;
    }

    public EmployeeCorporateCardsList getCorporateCardsList() {
        return this.corporateCardsList;
    }

    public void setCorporateCardsList(EmployeeCorporateCardsList corporateCardsList) {
        this.corporateCardsList = corporateCardsList;
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
        if (!(obj instanceof Employee)) {
            return false;
        }
        Employee other = (Employee)obj;
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
        boolean _equals = super.equals(obj) && (this.customForm == null && other.getCustomForm() == null || this.customForm != null && this.customForm.equals(other.getCustomForm())) && (this.template == null && other.getTemplate() == null || this.template != null && this.template.equals(other.getTemplate())) && (this.entityId == null && other.getEntityId() == null || this.entityId != null && this.entityId.equals(other.getEntityId())) && (this.salutation == null && other.getSalutation() == null || this.salutation != null && this.salutation.equals(other.getSalutation())) && (this.firstName == null && other.getFirstName() == null || this.firstName != null && this.firstName.equals(other.getFirstName())) && (this.middleName == null && other.getMiddleName() == null || this.middleName != null && this.middleName.equals(other.getMiddleName())) && (this.lastName == null && other.getLastName() == null || this.lastName != null && this.lastName.equals(other.getLastName())) && (this.altName == null && other.getAltName() == null || this.altName != null && this.altName.equals(other.getAltName())) && (this.phone == null && other.getPhone() == null || this.phone != null && this.phone.equals(other.getPhone())) && (this.fax == null && other.getFax() == null || this.fax != null && this.fax.equals(other.getFax())) && (this.email == null && other.getEmail() == null || this.email != null && this.email.equals(other.getEmail())) && (this.defaultAddress == null && other.getDefaultAddress() == null || this.defaultAddress != null && this.defaultAddress.equals(other.getDefaultAddress())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && this.isInactive.equals(other.getIsInactive())) && (this.phoneticName == null && other.getPhoneticName() == null || this.phoneticName != null && this.phoneticName.equals(other.getPhoneticName())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && this.lastModifiedDate.equals(other.getLastModifiedDate())) && (this.dateCreated == null && other.getDateCreated() == null || this.dateCreated != null && this.dateCreated.equals(other.getDateCreated())) && (this.initials == null && other.getInitials() == null || this.initials != null && this.initials.equals(other.getInitials())) && (this.officePhone == null && other.getOfficePhone() == null || this.officePhone != null && this.officePhone.equals(other.getOfficePhone())) && (this.homePhone == null && other.getHomePhone() == null || this.homePhone != null && this.homePhone.equals(other.getHomePhone())) && (this.mobilePhone == null && other.getMobilePhone() == null || this.mobilePhone != null && this.mobilePhone.equals(other.getMobilePhone())) && (this.department == null && other.getDepartment() == null || this.department != null && this.department.equals(other.getDepartment())) && (this._class == null && other.get_class() == null || this._class != null && this._class.equals(other.get_class())) && (this.location == null && other.getLocation() == null || this.location != null && this.location.equals(other.getLocation())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && this.subsidiary.equals(other.getSubsidiary())) && (this.billingClass == null && other.getBillingClass() == null || this.billingClass != null && this.billingClass.equals(other.getBillingClass())) && (this.accountNumber == null && other.getAccountNumber() == null || this.accountNumber != null && this.accountNumber.equals(other.getAccountNumber())) && (this.compensationCurrency == null && other.getCompensationCurrency() == null || this.compensationCurrency != null && this.compensationCurrency.equals(other.getCompensationCurrency())) && (this.baseWageType == null && other.getBaseWageType() == null || this.baseWageType != null && this.baseWageType.equals(other.getBaseWageType())) && (this.baseWage == null && other.getBaseWage() == null || this.baseWage != null && this.baseWage.equals(other.getBaseWage())) && (this.comments == null && other.getComments() == null || this.comments != null && this.comments.equals(other.getComments())) && (this.globalSubscriptionStatus == null && other.getGlobalSubscriptionStatus() == null || this.globalSubscriptionStatus != null && this.globalSubscriptionStatus.equals(other.getGlobalSubscriptionStatus())) && (this.image == null && other.getImage() == null || this.image != null && this.image.equals(other.getImage())) && (this.payFrequency == null && other.getPayFrequency() == null || this.payFrequency != null && this.payFrequency.equals(other.getPayFrequency())) && (this.lastPaidDate == null && other.getLastPaidDate() == null || this.lastPaidDate != null && this.lastPaidDate.equals(other.getLastPaidDate())) && (this.currency == null && other.getCurrency() == null || this.currency != null && this.currency.equals(other.getCurrency())) && (this.useTimeData == null && other.getUseTimeData() == null || this.useTimeData != null && this.useTimeData.equals(other.getUseTimeData())) && (this.usePerquest == null && other.getUsePerquest() == null || this.usePerquest != null && this.usePerquest.equals(other.getUsePerquest())) && (this.workplace == null && other.getWorkplace() == null || this.workplace != null && this.workplace.equals(other.getWorkplace())) && (this.adpId == null && other.getAdpId() == null || this.adpId != null && this.adpId.equals(other.getAdpId())) && (this.directDeposit == null && other.getDirectDeposit() == null || this.directDeposit != null && this.directDeposit.equals(other.getDirectDeposit())) && (this.expenseLimit == null && other.getExpenseLimit() == null || this.expenseLimit != null && this.expenseLimit.equals(other.getExpenseLimit())) && (this.purchaseOrderLimit == null && other.getPurchaseOrderLimit() == null || this.purchaseOrderLimit != null && this.purchaseOrderLimit.equals(other.getPurchaseOrderLimit())) && (this.purchaseOrderApprovalLimit == null && other.getPurchaseOrderApprovalLimit() == null || this.purchaseOrderApprovalLimit != null && this.purchaseOrderApprovalLimit.equals(other.getPurchaseOrderApprovalLimit())) && (this.socialSecurityNumber == null && other.getSocialSecurityNumber() == null || this.socialSecurityNumber != null && this.socialSecurityNumber.equals(other.getSocialSecurityNumber())) && (this.supervisor == null && other.getSupervisor() == null || this.supervisor != null && this.supervisor.equals(other.getSupervisor())) && (this.approver == null && other.getApprover() == null || this.approver != null && this.approver.equals(other.getApprover())) && (this.approvalLimit == null && other.getApprovalLimit() == null || this.approvalLimit != null && this.approvalLimit.equals(other.getApprovalLimit())) && (this.timeApprover == null && other.getTimeApprover() == null || this.timeApprover != null && this.timeApprover.equals(other.getTimeApprover())) && (this.employeeType == null && other.getEmployeeType() == null || this.employeeType != null && this.employeeType.equals(other.getEmployeeType())) && (this.isSalesRep == null && other.getIsSalesRep() == null || this.isSalesRep != null && this.isSalesRep.equals(other.getIsSalesRep())) && (this.salesRole == null && other.getSalesRole() == null || this.salesRole != null && this.salesRole.equals(other.getSalesRole())) && (this.isSupportRep == null && other.getIsSupportRep() == null || this.isSupportRep != null && this.isSupportRep.equals(other.getIsSupportRep())) && (this.isJobResource == null && other.getIsJobResource() == null || this.isJobResource != null && this.isJobResource.equals(other.getIsJobResource())) && (this.laborCost == null && other.getLaborCost() == null || this.laborCost != null && this.laborCost.equals(other.getLaborCost())) && (this.birthDate == null && other.getBirthDate() == null || this.birthDate != null && this.birthDate.equals(other.getBirthDate())) && (this.hireDate == null && other.getHireDate() == null || this.hireDate != null && this.hireDate.equals(other.getHireDate())) && (this.releaseDate == null && other.getReleaseDate() == null || this.releaseDate != null && this.releaseDate.equals(other.getReleaseDate())) && (this.terminationDetails == null && other.getTerminationDetails() == null || this.terminationDetails != null && this.terminationDetails.equals(other.getTerminationDetails())) && (this.terminationReason == null && other.getTerminationReason() == null || this.terminationReason != null && this.terminationReason.equals(other.getTerminationReason())) && (this.terminationRegretted == null && other.getTerminationRegretted() == null || this.terminationRegretted != null && this.terminationRegretted.equals(other.getTerminationRegretted())) && (this.terminationCategory == null && other.getTerminationCategory() == null || this.terminationCategory != null && this.terminationCategory.equals(other.getTerminationCategory())) && (this.timeOffPlan == null && other.getTimeOffPlan() == null || this.timeOffPlan != null && this.timeOffPlan.equals(other.getTimeOffPlan())) && (this.lastReviewDate == null && other.getLastReviewDate() == null || this.lastReviewDate != null && this.lastReviewDate.equals(other.getLastReviewDate())) && (this.nextReviewDate == null && other.getNextReviewDate() == null || this.nextReviewDate != null && this.nextReviewDate.equals(other.getNextReviewDate())) && (this.title == null && other.getTitle() == null || this.title != null && this.title.equals(other.getTitle())) && (this.employeeStatus == null && other.getEmployeeStatus() == null || this.employeeStatus != null && this.employeeStatus.equals(other.getEmployeeStatus())) && (this.jobDescription == null && other.getJobDescription() == null || this.jobDescription != null && this.jobDescription.equals(other.getJobDescription())) && (this.workAssignment == null && other.getWorkAssignment() == null || this.workAssignment != null && this.workAssignment.equals(other.getWorkAssignment())) && (this.job == null && other.getJob() == null || this.job != null && this.job.equals(other.getJob())) && (this.maritalStatus == null && other.getMaritalStatus() == null || this.maritalStatus != null && this.maritalStatus.equals(other.getMaritalStatus())) && (this.ethnicity == null && other.getEthnicity() == null || this.ethnicity != null && this.ethnicity.equals(other.getEthnicity())) && (this.gender == null && other.getGender() == null || this.gender != null && this.gender.equals(other.getGender())) && (this.purchaseOrderApprover == null && other.getPurchaseOrderApprover() == null || this.purchaseOrderApprover != null && this.purchaseOrderApprover.equals(other.getPurchaseOrderApprover())) && (this.workCalendar == null && other.getWorkCalendar() == null || this.workCalendar != null && this.workCalendar.equals(other.getWorkCalendar())) && (this.giveAccess == null && other.getGiveAccess() == null || this.giveAccess != null && this.giveAccess.equals(other.getGiveAccess())) && (this.defaultExpenseReportCurrency == null && other.getDefaultExpenseReportCurrency() == null || this.defaultExpenseReportCurrency != null && this.defaultExpenseReportCurrency.equals(other.getDefaultExpenseReportCurrency())) && (this.concurrentWebServicesUser == null && other.getConcurrentWebServicesUser() == null || this.concurrentWebServicesUser != null && this.concurrentWebServicesUser.equals(other.getConcurrentWebServicesUser())) && (this.sendEmail == null && other.getSendEmail() == null || this.sendEmail != null && this.sendEmail.equals(other.getSendEmail())) && (this.hasOfflineAccess == null && other.getHasOfflineAccess() == null || this.hasOfflineAccess != null && this.hasOfflineAccess.equals(other.getHasOfflineAccess())) && (this.password == null && other.getPassword() == null || this.password != null && this.password.equals(other.getPassword())) && (this.password2 == null && other.getPassword2() == null || this.password2 != null && this.password2.equals(other.getPassword2())) && (this.requirePwdChange == null && other.getRequirePwdChange() == null || this.requirePwdChange != null && this.requirePwdChange.equals(other.getRequirePwdChange())) && (this.inheritIPRules == null && other.getInheritIPRules() == null || this.inheritIPRules != null && this.inheritIPRules.equals(other.getInheritIPRules())) && (this.IPAddressRule == null && other.getIPAddressRule() == null || this.IPAddressRule != null && this.IPAddressRule.equals(other.getIPAddressRule())) && (this.startDateTimeOffCalc == null && other.getStartDateTimeOffCalc() == null || this.startDateTimeOffCalc != null && this.startDateTimeOffCalc.equals(other.getStartDateTimeOffCalc())) && (this.commissionPaymentPreference == null && other.getCommissionPaymentPreference() == null || this.commissionPaymentPreference != null && this.commissionPaymentPreference.equals(other.getCommissionPaymentPreference())) && (this.billPay == null && other.getBillPay() == null || this.billPay != null && this.billPay.equals(other.getBillPay())) && (this.defaultAcctCorpCardExp == null && other.getDefaultAcctCorpCardExp() == null || this.defaultAcctCorpCardExp != null && this.defaultAcctCorpCardExp.equals(other.getDefaultAcctCorpCardExp())) && (this.eligibleForCommission == null && other.getEligibleForCommission() == null || this.eligibleForCommission != null && this.eligibleForCommission.equals(other.getEligibleForCommission())) && (this.subscriptionsList == null && other.getSubscriptionsList() == null || this.subscriptionsList != null && this.subscriptionsList.equals(other.getSubscriptionsList())) && (this.ratesList == null && other.getRatesList() == null || this.ratesList != null && this.ratesList.equals(other.getRatesList())) && (this.addressbookList == null && other.getAddressbookList() == null || this.addressbookList != null && this.addressbookList.equals(other.getAddressbookList())) && (this.rolesList == null && other.getRolesList() == null || this.rolesList != null && this.rolesList.equals(other.getRolesList())) && (this.hrEducationList == null && other.getHrEducationList() == null || this.hrEducationList != null && this.hrEducationList.equals(other.getHrEducationList())) && (this.accruedTimeList == null && other.getAccruedTimeList() == null || this.accruedTimeList != null && this.accruedTimeList.equals(other.getAccruedTimeList())) && (this.directDepositList == null && other.getDirectDepositList() == null || this.directDepositList != null && this.directDepositList.equals(other.getDirectDepositList())) && (this.currencyList == null && other.getCurrencyList() == null || this.currencyList != null && this.currencyList.equals(other.getCurrencyList())) && (this.companyContributionList == null && other.getCompanyContributionList() == null || this.companyContributionList != null && this.companyContributionList.equals(other.getCompanyContributionList())) && (this.earningList == null && other.getEarningList() == null || this.earningList != null && this.earningList.equals(other.getEarningList())) && (this.emergencyContactList == null && other.getEmergencyContactList() == null || this.emergencyContactList != null && this.emergencyContactList.equals(other.getEmergencyContactList())) && (this.hcmPositionList == null && other.getHcmPositionList() == null || this.hcmPositionList != null && this.hcmPositionList.equals(other.getHcmPositionList())) && (this.deductionList == null && other.getDeductionList() == null || this.deductionList != null && this.deductionList.equals(other.getDeductionList())) && (this.isJobManager == null && other.getIsJobManager() == null || this.isJobManager != null && this.isJobManager.equals(other.getIsJobManager())) && (this.targetUtilization == null && other.getTargetUtilization() == null || this.targetUtilization != null && this.targetUtilization.equals(other.getTargetUtilization())) && (this.bonusTarget == null && other.getBonusTarget() == null || this.bonusTarget != null && this.bonusTarget.equals(other.getBonusTarget())) && (this.bonusTargetComment == null && other.getBonusTargetComment() == null || this.bonusTargetComment != null && this.bonusTargetComment.equals(other.getBonusTargetComment())) && (this.bonusTargetType == null && other.getBonusTargetType() == null || this.bonusTargetType != null && this.bonusTargetType.equals(other.getBonusTargetType())) && (this.bonusTargetPayFrequency == null && other.getBonusTargetPayFrequency() == null || this.bonusTargetPayFrequency != null && this.bonusTargetPayFrequency.equals(other.getBonusTargetPayFrequency())) && (this.corporateCardsList == null && other.getCorporateCardsList() == null || this.corporateCardsList != null && this.corporateCardsList.equals(other.getCorporateCardsList())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
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
        if (this.getTemplate() != null) {
            _hashCode += this.getTemplate().hashCode();
        }
        if (this.getEntityId() != null) {
            _hashCode += this.getEntityId().hashCode();
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
        if (this.getAltName() != null) {
            _hashCode += this.getAltName().hashCode();
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
        if (this.getDefaultAddress() != null) {
            _hashCode += this.getDefaultAddress().hashCode();
        }
        if (this.getIsInactive() != null) {
            _hashCode += this.getIsInactive().hashCode();
        }
        if (this.getPhoneticName() != null) {
            _hashCode += this.getPhoneticName().hashCode();
        }
        if (this.getLastModifiedDate() != null) {
            _hashCode += this.getLastModifiedDate().hashCode();
        }
        if (this.getDateCreated() != null) {
            _hashCode += this.getDateCreated().hashCode();
        }
        if (this.getInitials() != null) {
            _hashCode += this.getInitials().hashCode();
        }
        if (this.getOfficePhone() != null) {
            _hashCode += this.getOfficePhone().hashCode();
        }
        if (this.getHomePhone() != null) {
            _hashCode += this.getHomePhone().hashCode();
        }
        if (this.getMobilePhone() != null) {
            _hashCode += this.getMobilePhone().hashCode();
        }
        if (this.getDepartment() != null) {
            _hashCode += this.getDepartment().hashCode();
        }
        if (this.get_class() != null) {
            _hashCode += this.get_class().hashCode();
        }
        if (this.getLocation() != null) {
            _hashCode += this.getLocation().hashCode();
        }
        if (this.getSubsidiary() != null) {
            _hashCode += this.getSubsidiary().hashCode();
        }
        if (this.getBillingClass() != null) {
            _hashCode += this.getBillingClass().hashCode();
        }
        if (this.getAccountNumber() != null) {
            _hashCode += this.getAccountNumber().hashCode();
        }
        if (this.getCompensationCurrency() != null) {
            _hashCode += this.getCompensationCurrency().hashCode();
        }
        if (this.getBaseWageType() != null) {
            _hashCode += this.getBaseWageType().hashCode();
        }
        if (this.getBaseWage() != null) {
            _hashCode += this.getBaseWage().hashCode();
        }
        if (this.getComments() != null) {
            _hashCode += this.getComments().hashCode();
        }
        if (this.getGlobalSubscriptionStatus() != null) {
            _hashCode += this.getGlobalSubscriptionStatus().hashCode();
        }
        if (this.getImage() != null) {
            _hashCode += this.getImage().hashCode();
        }
        if (this.getPayFrequency() != null) {
            _hashCode += this.getPayFrequency().hashCode();
        }
        if (this.getLastPaidDate() != null) {
            _hashCode += this.getLastPaidDate().hashCode();
        }
        if (this.getCurrency() != null) {
            _hashCode += this.getCurrency().hashCode();
        }
        if (this.getUseTimeData() != null) {
            _hashCode += this.getUseTimeData().hashCode();
        }
        if (this.getUsePerquest() != null) {
            _hashCode += this.getUsePerquest().hashCode();
        }
        if (this.getWorkplace() != null) {
            _hashCode += this.getWorkplace().hashCode();
        }
        if (this.getAdpId() != null) {
            _hashCode += this.getAdpId().hashCode();
        }
        if (this.getDirectDeposit() != null) {
            _hashCode += this.getDirectDeposit().hashCode();
        }
        if (this.getExpenseLimit() != null) {
            _hashCode += this.getExpenseLimit().hashCode();
        }
        if (this.getPurchaseOrderLimit() != null) {
            _hashCode += this.getPurchaseOrderLimit().hashCode();
        }
        if (this.getPurchaseOrderApprovalLimit() != null) {
            _hashCode += this.getPurchaseOrderApprovalLimit().hashCode();
        }
        if (this.getSocialSecurityNumber() != null) {
            _hashCode += this.getSocialSecurityNumber().hashCode();
        }
        if (this.getSupervisor() != null) {
            _hashCode += this.getSupervisor().hashCode();
        }
        if (this.getApprover() != null) {
            _hashCode += this.getApprover().hashCode();
        }
        if (this.getApprovalLimit() != null) {
            _hashCode += this.getApprovalLimit().hashCode();
        }
        if (this.getTimeApprover() != null) {
            _hashCode += this.getTimeApprover().hashCode();
        }
        if (this.getEmployeeType() != null) {
            _hashCode += this.getEmployeeType().hashCode();
        }
        if (this.getIsSalesRep() != null) {
            _hashCode += this.getIsSalesRep().hashCode();
        }
        if (this.getSalesRole() != null) {
            _hashCode += this.getSalesRole().hashCode();
        }
        if (this.getIsSupportRep() != null) {
            _hashCode += this.getIsSupportRep().hashCode();
        }
        if (this.getIsJobResource() != null) {
            _hashCode += this.getIsJobResource().hashCode();
        }
        if (this.getLaborCost() != null) {
            _hashCode += this.getLaborCost().hashCode();
        }
        if (this.getBirthDate() != null) {
            _hashCode += this.getBirthDate().hashCode();
        }
        if (this.getHireDate() != null) {
            _hashCode += this.getHireDate().hashCode();
        }
        if (this.getReleaseDate() != null) {
            _hashCode += this.getReleaseDate().hashCode();
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
        if (this.getTerminationCategory() != null) {
            _hashCode += this.getTerminationCategory().hashCode();
        }
        if (this.getTimeOffPlan() != null) {
            _hashCode += this.getTimeOffPlan().hashCode();
        }
        if (this.getLastReviewDate() != null) {
            _hashCode += this.getLastReviewDate().hashCode();
        }
        if (this.getNextReviewDate() != null) {
            _hashCode += this.getNextReviewDate().hashCode();
        }
        if (this.getTitle() != null) {
            _hashCode += this.getTitle().hashCode();
        }
        if (this.getEmployeeStatus() != null) {
            _hashCode += this.getEmployeeStatus().hashCode();
        }
        if (this.getJobDescription() != null) {
            _hashCode += this.getJobDescription().hashCode();
        }
        if (this.getWorkAssignment() != null) {
            _hashCode += this.getWorkAssignment().hashCode();
        }
        if (this.getJob() != null) {
            _hashCode += this.getJob().hashCode();
        }
        if (this.getMaritalStatus() != null) {
            _hashCode += this.getMaritalStatus().hashCode();
        }
        if (this.getEthnicity() != null) {
            _hashCode += this.getEthnicity().hashCode();
        }
        if (this.getGender() != null) {
            _hashCode += this.getGender().hashCode();
        }
        if (this.getPurchaseOrderApprover() != null) {
            _hashCode += this.getPurchaseOrderApprover().hashCode();
        }
        if (this.getWorkCalendar() != null) {
            _hashCode += this.getWorkCalendar().hashCode();
        }
        if (this.getGiveAccess() != null) {
            _hashCode += this.getGiveAccess().hashCode();
        }
        if (this.getDefaultExpenseReportCurrency() != null) {
            _hashCode += this.getDefaultExpenseReportCurrency().hashCode();
        }
        if (this.getConcurrentWebServicesUser() != null) {
            _hashCode += this.getConcurrentWebServicesUser().hashCode();
        }
        if (this.getSendEmail() != null) {
            _hashCode += this.getSendEmail().hashCode();
        }
        if (this.getHasOfflineAccess() != null) {
            _hashCode += this.getHasOfflineAccess().hashCode();
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
        if (this.getInheritIPRules() != null) {
            _hashCode += this.getInheritIPRules().hashCode();
        }
        if (this.getIPAddressRule() != null) {
            _hashCode += this.getIPAddressRule().hashCode();
        }
        if (this.getStartDateTimeOffCalc() != null) {
            _hashCode += this.getStartDateTimeOffCalc().hashCode();
        }
        if (this.getCommissionPaymentPreference() != null) {
            _hashCode += this.getCommissionPaymentPreference().hashCode();
        }
        if (this.getBillPay() != null) {
            _hashCode += this.getBillPay().hashCode();
        }
        if (this.getDefaultAcctCorpCardExp() != null) {
            _hashCode += this.getDefaultAcctCorpCardExp().hashCode();
        }
        if (this.getEligibleForCommission() != null) {
            _hashCode += this.getEligibleForCommission().hashCode();
        }
        if (this.getSubscriptionsList() != null) {
            _hashCode += this.getSubscriptionsList().hashCode();
        }
        if (this.getRatesList() != null) {
            _hashCode += this.getRatesList().hashCode();
        }
        if (this.getAddressbookList() != null) {
            _hashCode += this.getAddressbookList().hashCode();
        }
        if (this.getRolesList() != null) {
            _hashCode += this.getRolesList().hashCode();
        }
        if (this.getHrEducationList() != null) {
            _hashCode += this.getHrEducationList().hashCode();
        }
        if (this.getAccruedTimeList() != null) {
            _hashCode += this.getAccruedTimeList().hashCode();
        }
        if (this.getDirectDepositList() != null) {
            _hashCode += this.getDirectDepositList().hashCode();
        }
        if (this.getCurrencyList() != null) {
            _hashCode += this.getCurrencyList().hashCode();
        }
        if (this.getCompanyContributionList() != null) {
            _hashCode += this.getCompanyContributionList().hashCode();
        }
        if (this.getEarningList() != null) {
            _hashCode += this.getEarningList().hashCode();
        }
        if (this.getEmergencyContactList() != null) {
            _hashCode += this.getEmergencyContactList().hashCode();
        }
        if (this.getHcmPositionList() != null) {
            _hashCode += this.getHcmPositionList().hashCode();
        }
        if (this.getDeductionList() != null) {
            _hashCode += this.getDeductionList().hashCode();
        }
        if (this.getIsJobManager() != null) {
            _hashCode += this.getIsJobManager().hashCode();
        }
        if (this.getTargetUtilization() != null) {
            _hashCode += this.getTargetUtilization().hashCode();
        }
        if (this.getBonusTarget() != null) {
            _hashCode += this.getBonusTarget().hashCode();
        }
        if (this.getBonusTargetComment() != null) {
            _hashCode += this.getBonusTargetComment().hashCode();
        }
        if (this.getBonusTargetType() != null) {
            _hashCode += this.getBonusTargetType().hashCode();
        }
        if (this.getBonusTargetPayFrequency() != null) {
            _hashCode += this.getBonusTargetPayFrequency().hashCode();
        }
        if (this.getCorporateCardsList() != null) {
            _hashCode += this.getCorporateCardsList().hashCode();
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
        typeDesc.setXmlType(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "Employee"));
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
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("template");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "template"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("entityId");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "entityId"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("salutation");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "salutation"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "firstName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("middleName");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "middleName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "lastName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("altName");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "altName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "phone"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fax");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "fax"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "email"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("defaultAddress");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "defaultAddress"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("phoneticName");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "phoneticName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("dateCreated");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "dateCreated"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("initials");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "initials"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("officePhone");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "officePhone"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("homePhone");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "homePhone"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("mobilePhone");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "mobilePhone"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "department"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "class"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "location"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billingClass");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "billingClass"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "accountNumber"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("compensationCurrency");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "compensationCurrency"));
        elemField.setXmlType(new QName("urn:types.employees_2022_1.lists.webservices.netsuite.com", "EmployeeCompensationCurrency"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("baseWageType");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "baseWageType"));
        elemField.setXmlType(new QName("urn:types.employees_2022_1.lists.webservices.netsuite.com", "EmployeeBaseWageType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("baseWage");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "baseWage"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "comments"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("globalSubscriptionStatus");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "globalSubscriptionStatus"));
        elemField.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "GlobalSubscriptionStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("image");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "image"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("payFrequency");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "payFrequency"));
        elemField.setXmlType(new QName("urn:types.employees_2022_1.lists.webservices.netsuite.com", "EmployeePayFrequency"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastPaidDate");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "lastPaidDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("useTimeData");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "useTimeData"));
        elemField.setXmlType(new QName("urn:types.employees_2022_1.lists.webservices.netsuite.com", "EmployeeUseTimeData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("usePerquest");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "usePerquest"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("workplace");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "workplace"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("adpId");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "adpId"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("directDeposit");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "directDeposit"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("expenseLimit");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "expenseLimit"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("purchaseOrderLimit");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "purchaseOrderLimit"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("purchaseOrderApprovalLimit");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "purchaseOrderApprovalLimit"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("socialSecurityNumber");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "socialSecurityNumber"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("supervisor");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "supervisor"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("approver");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "approver"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("approvalLimit");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "approvalLimit"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("timeApprover");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "timeApprover"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("employeeType");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "employeeType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isSalesRep");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "isSalesRep"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("salesRole");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "salesRole"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isSupportRep");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "isSupportRep"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isJobResource");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "isJobResource"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("laborCost");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "laborCost"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("birthDate");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "birthDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("hireDate");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "hireDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("releaseDate");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "releaseDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("terminationDetails");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "terminationDetails"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("terminationReason");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "terminationReason"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("terminationRegretted");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "terminationRegretted"));
        elemField.setXmlType(new QName("urn:types.employees_2022_1.lists.webservices.netsuite.com", "EmployeeTerminationRegretted"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("terminationCategory");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "terminationCategory"));
        elemField.setXmlType(new QName("urn:types.employees_2022_1.lists.webservices.netsuite.com", "EmployeeTerminationCategory"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("timeOffPlan");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "timeOffPlan"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastReviewDate");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "lastReviewDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("nextReviewDate");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "nextReviewDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "title"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("employeeStatus");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "employeeStatus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("jobDescription");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "jobDescription"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("workAssignment");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "workAssignment"));
        elemField.setXmlType(new QName("urn:types.employees_2022_1.lists.webservices.netsuite.com", "EmployeeWorkAssignment"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("job");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "job"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("maritalStatus");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "maritalStatus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ethnicity");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "ethnicity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("gender");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "gender"));
        elemField.setXmlType(new QName("urn:types.employees_2022_1.lists.webservices.netsuite.com", "Gender"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("purchaseOrderApprover");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "purchaseOrderApprover"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("workCalendar");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "workCalendar"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("giveAccess");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "giveAccess"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("defaultExpenseReportCurrency");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "defaultExpenseReportCurrency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("concurrentWebServicesUser");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "concurrentWebServicesUser"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("sendEmail");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "sendEmail"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("hasOfflineAccess");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "hasOfflineAccess"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "password"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("password2");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "password2"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("requirePwdChange");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "requirePwdChange"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("inheritIPRules");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "inheritIPRules"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("IPAddressRule");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "IPAddressRule"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("startDateTimeOffCalc");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "startDateTimeOffCalc"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("commissionPaymentPreference");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "commissionPaymentPreference"));
        elemField.setXmlType(new QName("urn:types.employees_2022_1.lists.webservices.netsuite.com", "EmployeeCommissionPaymentPreference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billPay");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "billPay"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("defaultAcctCorpCardExp");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "defaultAcctCorpCardExp"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("eligibleForCommission");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "eligibleForCommission"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subscriptionsList");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "subscriptionsList"));
        elemField.setXmlType(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "EmployeeSubscriptionsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ratesList");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "ratesList"));
        elemField.setXmlType(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "EmployeeRatesList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("addressbookList");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "addressbookList"));
        elemField.setXmlType(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "EmployeeAddressbookList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("rolesList");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "rolesList"));
        elemField.setXmlType(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "EmployeeRolesList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("hrEducationList");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "hrEducationList"));
        elemField.setXmlType(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "EmployeeHrEducationList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("accruedTimeList");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "accruedTimeList"));
        elemField.setXmlType(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "EmployeeAccruedTimeList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("directDepositList");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "directDepositList"));
        elemField.setXmlType(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "EmployeeDirectDepositList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("currencyList");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "currencyList"));
        elemField.setXmlType(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "EmployeeCurrencyList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("companyContributionList");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "companyContributionList"));
        elemField.setXmlType(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "EmployeeCompanyContributionList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("earningList");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "earningList"));
        elemField.setXmlType(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "EmployeeEarningList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("emergencyContactList");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "emergencyContactList"));
        elemField.setXmlType(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "EmployeeEmergencyContactList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("hcmPositionList");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "hcmPositionList"));
        elemField.setXmlType(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "EmployeeHcmPositionList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("deductionList");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "deductionList"));
        elemField.setXmlType(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "EmployeeDeductionList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isJobManager");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "isJobManager"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("targetUtilization");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "targetUtilization"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("bonusTarget");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "bonusTarget"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("bonusTargetComment");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "bonusTargetComment"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("bonusTargetType");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "bonusTargetType"));
        elemField.setXmlType(new QName("urn:types.employees_2022_1.lists.webservices.netsuite.com", "EmployeeBonusTargetType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("bonusTargetPayFrequency");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "bonusTargetPayFrequency"));
        elemField.setXmlType(new QName("urn:types.employees_2022_1.lists.webservices.netsuite.com", "EmployeeBonusTargetPayFrequency"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("corporateCardsList");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "corporateCardsList"));
        elemField.setXmlType(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "EmployeeCorporateCardsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "CustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

