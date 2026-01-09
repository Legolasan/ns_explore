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

import com.netsuite.suitetalk.proxy.v2022_1.lists.relationships.JobAddressbookList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.relationships.JobCreditCardsList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.relationships.JobMilestonesList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.relationships.JobPercentCompleteOverrideList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.relationships.JobPlStatementList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.relationships.JobResourcesList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.relationships.types.EmailPreference;
import com.netsuite.suitetalk.proxy.v2022_1.lists.relationships.types.JobBillingType;
import com.netsuite.suitetalk.proxy.v2022_1.lists.relationships.types.JobSchedulingMethod;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.types.GlobalSubscriptionStatus;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.CustomFieldList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.Duration;
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

public class Job
extends Record
implements Serializable {
    private RecordRef customForm;
    private String entityId;
    private String altName;
    private String companyName;
    private String phoneticName;
    private RecordRef entityStatus;
    private String defaultAddress;
    private RecordRef parent;
    private Boolean isInactive;
    private JobPercentCompleteOverrideList percentCompleteOverrideList;
    private Calendar lastModifiedDate;
    private Boolean billPay;
    private Calendar dateCreated;
    private RecordRef category;
    private RecordRef workplace;
    private RecordRef language;
    private String comments;
    private String accountNumber;
    private RecordRef currency;
    private Double fxRate;
    private Calendar startDate;
    private Calendar endDate;
    private String phone;
    private String altPhone;
    private Calendar calculatedEndDate;
    private Calendar calculatedEndDateBaseline;
    private Calendar startDateBaseline;
    private Calendar projectedEndDate;
    private Calendar projectedEndDateBaseline;
    private Calendar lastBaselineDate;
    private RecordRef jobType;
    private Double percentComplete;
    private Double estimatedCost;
    private Double estimatedRevenue;
    private Duration estimatedTime;
    private Duration estimatedTimeOverride;
    private String fax;
    private String email;
    private EmailPreference emailPreference;
    private Double openingBalance;
    private Calendar openingBalanceDate;
    private RecordRef openingBalanceAccount;
    private RecordRef subsidiary;
    private JobBillingType jobBillingType;
    private RecordRef billingSchedule;
    private RecordRef jobItem;
    private Double percentTimeComplete;
    private Duration actualTime;
    private Boolean allowTime;
    private Duration timeRemaining;
    private Boolean limitTimeToAssignees;
    private Double estimatedLaborCost;
    private Double estimatedLaborCostBaseline;
    private RecordRef estimateRevRecTemplate;
    private RecordRef revRecForecastRule;
    private Boolean usePercentCompleteOverride;
    private Double estimatedLaborRevenue;
    private Double estimatedGrossProfit;
    private Double estimatedGrossProfitPercent;
    private RecordRef projectExpenseType;
    private Boolean applyProjectExpenseTypeToAll;
    private Boolean allowAllResourcesForTasks;
    private Double jobPrice;
    private Boolean isUtilizedTime;
    private Boolean isProductiveTime;
    private Boolean isExemptTime;
    private Boolean materializeTime;
    private Boolean allowExpenses;
    private Boolean allocatePayrollExpenses;
    private Boolean includeCrmTasksInTotals;
    private GlobalSubscriptionStatus globalSubscriptionStatus;
    private JobResourcesList jobResourcesList;
    private JobPlStatementList plStatementList;
    private JobAddressbookList addressbookList;
    private JobMilestonesList milestonesList;
    private JobCreditCardsList creditCardsList;
    private RecordRef timeApproval;
    private Duration plannedWork;
    private Duration plannedWorkBaseline;
    private RecordRef billingRateCard;
    private Boolean createChargeRule;
    private Boolean sourceServiceItemFromRateCard;
    private RecordRef projectManager;
    private JobSchedulingMethod schedulingMethod;
    private Calendar scheduledEndDate;
    private Calendar calculatedStartDate;
    private CustomFieldList customFieldList;
    private String internalId;
    private String externalId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(Job.class, true);

    public Job() {
    }

    public Job(NullField nullFieldList, String internalId, String externalId, RecordRef customForm, String entityId, String altName, String companyName, String phoneticName, RecordRef entityStatus, String defaultAddress, RecordRef parent, Boolean isInactive, JobPercentCompleteOverrideList percentCompleteOverrideList, Calendar lastModifiedDate, Boolean billPay, Calendar dateCreated, RecordRef category, RecordRef workplace, RecordRef language, String comments, String accountNumber, RecordRef currency, Double fxRate, Calendar startDate, Calendar endDate, String phone, String altPhone, Calendar calculatedEndDate, Calendar calculatedEndDateBaseline, Calendar startDateBaseline, Calendar projectedEndDate, Calendar projectedEndDateBaseline, Calendar lastBaselineDate, RecordRef jobType, Double percentComplete, Double estimatedCost, Double estimatedRevenue, Duration estimatedTime, Duration estimatedTimeOverride, String fax, String email, EmailPreference emailPreference, Double openingBalance, Calendar openingBalanceDate, RecordRef openingBalanceAccount, RecordRef subsidiary, JobBillingType jobBillingType, RecordRef billingSchedule, RecordRef jobItem, Double percentTimeComplete, Duration actualTime, Boolean allowTime, Duration timeRemaining, Boolean limitTimeToAssignees, Double estimatedLaborCost, Double estimatedLaborCostBaseline, RecordRef estimateRevRecTemplate, RecordRef revRecForecastRule, Boolean usePercentCompleteOverride, Double estimatedLaborRevenue, Double estimatedGrossProfit, Double estimatedGrossProfitPercent, RecordRef projectExpenseType, Boolean applyProjectExpenseTypeToAll, Boolean allowAllResourcesForTasks, Double jobPrice, Boolean isUtilizedTime, Boolean isProductiveTime, Boolean isExemptTime, Boolean materializeTime, Boolean allowExpenses, Boolean allocatePayrollExpenses, Boolean includeCrmTasksInTotals, GlobalSubscriptionStatus globalSubscriptionStatus, JobResourcesList jobResourcesList, JobPlStatementList plStatementList, JobAddressbookList addressbookList, JobMilestonesList milestonesList, JobCreditCardsList creditCardsList, RecordRef timeApproval, Duration plannedWork, Duration plannedWorkBaseline, RecordRef billingRateCard, Boolean createChargeRule, Boolean sourceServiceItemFromRateCard, RecordRef projectManager, JobSchedulingMethod schedulingMethod, Calendar scheduledEndDate, Calendar calculatedStartDate, CustomFieldList customFieldList) {
        super(nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.customForm = customForm;
        this.entityId = entityId;
        this.altName = altName;
        this.companyName = companyName;
        this.phoneticName = phoneticName;
        this.entityStatus = entityStatus;
        this.defaultAddress = defaultAddress;
        this.parent = parent;
        this.isInactive = isInactive;
        this.percentCompleteOverrideList = percentCompleteOverrideList;
        this.lastModifiedDate = lastModifiedDate;
        this.billPay = billPay;
        this.dateCreated = dateCreated;
        this.category = category;
        this.workplace = workplace;
        this.language = language;
        this.comments = comments;
        this.accountNumber = accountNumber;
        this.currency = currency;
        this.fxRate = fxRate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.phone = phone;
        this.altPhone = altPhone;
        this.calculatedEndDate = calculatedEndDate;
        this.calculatedEndDateBaseline = calculatedEndDateBaseline;
        this.startDateBaseline = startDateBaseline;
        this.projectedEndDate = projectedEndDate;
        this.projectedEndDateBaseline = projectedEndDateBaseline;
        this.lastBaselineDate = lastBaselineDate;
        this.jobType = jobType;
        this.percentComplete = percentComplete;
        this.estimatedCost = estimatedCost;
        this.estimatedRevenue = estimatedRevenue;
        this.estimatedTime = estimatedTime;
        this.estimatedTimeOverride = estimatedTimeOverride;
        this.fax = fax;
        this.email = email;
        this.emailPreference = emailPreference;
        this.openingBalance = openingBalance;
        this.openingBalanceDate = openingBalanceDate;
        this.openingBalanceAccount = openingBalanceAccount;
        this.subsidiary = subsidiary;
        this.jobBillingType = jobBillingType;
        this.billingSchedule = billingSchedule;
        this.jobItem = jobItem;
        this.percentTimeComplete = percentTimeComplete;
        this.actualTime = actualTime;
        this.allowTime = allowTime;
        this.timeRemaining = timeRemaining;
        this.limitTimeToAssignees = limitTimeToAssignees;
        this.estimatedLaborCost = estimatedLaborCost;
        this.estimatedLaborCostBaseline = estimatedLaborCostBaseline;
        this.estimateRevRecTemplate = estimateRevRecTemplate;
        this.revRecForecastRule = revRecForecastRule;
        this.usePercentCompleteOverride = usePercentCompleteOverride;
        this.estimatedLaborRevenue = estimatedLaborRevenue;
        this.estimatedGrossProfit = estimatedGrossProfit;
        this.estimatedGrossProfitPercent = estimatedGrossProfitPercent;
        this.projectExpenseType = projectExpenseType;
        this.applyProjectExpenseTypeToAll = applyProjectExpenseTypeToAll;
        this.allowAllResourcesForTasks = allowAllResourcesForTasks;
        this.jobPrice = jobPrice;
        this.isUtilizedTime = isUtilizedTime;
        this.isProductiveTime = isProductiveTime;
        this.isExemptTime = isExemptTime;
        this.materializeTime = materializeTime;
        this.allowExpenses = allowExpenses;
        this.allocatePayrollExpenses = allocatePayrollExpenses;
        this.includeCrmTasksInTotals = includeCrmTasksInTotals;
        this.globalSubscriptionStatus = globalSubscriptionStatus;
        this.jobResourcesList = jobResourcesList;
        this.plStatementList = plStatementList;
        this.addressbookList = addressbookList;
        this.milestonesList = milestonesList;
        this.creditCardsList = creditCardsList;
        this.timeApproval = timeApproval;
        this.plannedWork = plannedWork;
        this.plannedWorkBaseline = plannedWorkBaseline;
        this.billingRateCard = billingRateCard;
        this.createChargeRule = createChargeRule;
        this.sourceServiceItemFromRateCard = sourceServiceItemFromRateCard;
        this.projectManager = projectManager;
        this.schedulingMethod = schedulingMethod;
        this.scheduledEndDate = scheduledEndDate;
        this.calculatedStartDate = calculatedStartDate;
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

    public String getCompanyName() {
        return this.companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getPhoneticName() {
        return this.phoneticName;
    }

    public void setPhoneticName(String phoneticName) {
        this.phoneticName = phoneticName;
    }

    public RecordRef getEntityStatus() {
        return this.entityStatus;
    }

    public void setEntityStatus(RecordRef entityStatus) {
        this.entityStatus = entityStatus;
    }

    public String getDefaultAddress() {
        return this.defaultAddress;
    }

    public void setDefaultAddress(String defaultAddress) {
        this.defaultAddress = defaultAddress;
    }

    public RecordRef getParent() {
        return this.parent;
    }

    public void setParent(RecordRef parent) {
        this.parent = parent;
    }

    public Boolean getIsInactive() {
        return this.isInactive;
    }

    public void setIsInactive(Boolean isInactive) {
        this.isInactive = isInactive;
    }

    public JobPercentCompleteOverrideList getPercentCompleteOverrideList() {
        return this.percentCompleteOverrideList;
    }

    public void setPercentCompleteOverrideList(JobPercentCompleteOverrideList percentCompleteOverrideList) {
        this.percentCompleteOverrideList = percentCompleteOverrideList;
    }

    public Calendar getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    public void setLastModifiedDate(Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public Boolean getBillPay() {
        return this.billPay;
    }

    public void setBillPay(Boolean billPay) {
        this.billPay = billPay;
    }

    public Calendar getDateCreated() {
        return this.dateCreated;
    }

    public void setDateCreated(Calendar dateCreated) {
        this.dateCreated = dateCreated;
    }

    public RecordRef getCategory() {
        return this.category;
    }

    public void setCategory(RecordRef category) {
        this.category = category;
    }

    public RecordRef getWorkplace() {
        return this.workplace;
    }

    public void setWorkplace(RecordRef workplace) {
        this.workplace = workplace;
    }

    public RecordRef getLanguage() {
        return this.language;
    }

    public void setLanguage(RecordRef language) {
        this.language = language;
    }

    public String getComments() {
        return this.comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public RecordRef getCurrency() {
        return this.currency;
    }

    public void setCurrency(RecordRef currency) {
        this.currency = currency;
    }

    public Double getFxRate() {
        return this.fxRate;
    }

    public void setFxRate(Double fxRate) {
        this.fxRate = fxRate;
    }

    public Calendar getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Calendar startDate) {
        this.startDate = startDate;
    }

    public Calendar getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Calendar endDate) {
        this.endDate = endDate;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAltPhone() {
        return this.altPhone;
    }

    public void setAltPhone(String altPhone) {
        this.altPhone = altPhone;
    }

    public Calendar getCalculatedEndDate() {
        return this.calculatedEndDate;
    }

    public void setCalculatedEndDate(Calendar calculatedEndDate) {
        this.calculatedEndDate = calculatedEndDate;
    }

    public Calendar getCalculatedEndDateBaseline() {
        return this.calculatedEndDateBaseline;
    }

    public void setCalculatedEndDateBaseline(Calendar calculatedEndDateBaseline) {
        this.calculatedEndDateBaseline = calculatedEndDateBaseline;
    }

    public Calendar getStartDateBaseline() {
        return this.startDateBaseline;
    }

    public void setStartDateBaseline(Calendar startDateBaseline) {
        this.startDateBaseline = startDateBaseline;
    }

    public Calendar getProjectedEndDate() {
        return this.projectedEndDate;
    }

    public void setProjectedEndDate(Calendar projectedEndDate) {
        this.projectedEndDate = projectedEndDate;
    }

    public Calendar getProjectedEndDateBaseline() {
        return this.projectedEndDateBaseline;
    }

    public void setProjectedEndDateBaseline(Calendar projectedEndDateBaseline) {
        this.projectedEndDateBaseline = projectedEndDateBaseline;
    }

    public Calendar getLastBaselineDate() {
        return this.lastBaselineDate;
    }

    public void setLastBaselineDate(Calendar lastBaselineDate) {
        this.lastBaselineDate = lastBaselineDate;
    }

    public RecordRef getJobType() {
        return this.jobType;
    }

    public void setJobType(RecordRef jobType) {
        this.jobType = jobType;
    }

    public Double getPercentComplete() {
        return this.percentComplete;
    }

    public void setPercentComplete(Double percentComplete) {
        this.percentComplete = percentComplete;
    }

    public Double getEstimatedCost() {
        return this.estimatedCost;
    }

    public void setEstimatedCost(Double estimatedCost) {
        this.estimatedCost = estimatedCost;
    }

    public Double getEstimatedRevenue() {
        return this.estimatedRevenue;
    }

    public void setEstimatedRevenue(Double estimatedRevenue) {
        this.estimatedRevenue = estimatedRevenue;
    }

    public Duration getEstimatedTime() {
        return this.estimatedTime;
    }

    public void setEstimatedTime(Duration estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    public Duration getEstimatedTimeOverride() {
        return this.estimatedTimeOverride;
    }

    public void setEstimatedTimeOverride(Duration estimatedTimeOverride) {
        this.estimatedTimeOverride = estimatedTimeOverride;
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

    public EmailPreference getEmailPreference() {
        return this.emailPreference;
    }

    public void setEmailPreference(EmailPreference emailPreference) {
        this.emailPreference = emailPreference;
    }

    public Double getOpeningBalance() {
        return this.openingBalance;
    }

    public void setOpeningBalance(Double openingBalance) {
        this.openingBalance = openingBalance;
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

    public RecordRef getSubsidiary() {
        return this.subsidiary;
    }

    public void setSubsidiary(RecordRef subsidiary) {
        this.subsidiary = subsidiary;
    }

    public JobBillingType getJobBillingType() {
        return this.jobBillingType;
    }

    public void setJobBillingType(JobBillingType jobBillingType) {
        this.jobBillingType = jobBillingType;
    }

    public RecordRef getBillingSchedule() {
        return this.billingSchedule;
    }

    public void setBillingSchedule(RecordRef billingSchedule) {
        this.billingSchedule = billingSchedule;
    }

    public RecordRef getJobItem() {
        return this.jobItem;
    }

    public void setJobItem(RecordRef jobItem) {
        this.jobItem = jobItem;
    }

    public Double getPercentTimeComplete() {
        return this.percentTimeComplete;
    }

    public void setPercentTimeComplete(Double percentTimeComplete) {
        this.percentTimeComplete = percentTimeComplete;
    }

    public Duration getActualTime() {
        return this.actualTime;
    }

    public void setActualTime(Duration actualTime) {
        this.actualTime = actualTime;
    }

    public Boolean getAllowTime() {
        return this.allowTime;
    }

    public void setAllowTime(Boolean allowTime) {
        this.allowTime = allowTime;
    }

    public Duration getTimeRemaining() {
        return this.timeRemaining;
    }

    public void setTimeRemaining(Duration timeRemaining) {
        this.timeRemaining = timeRemaining;
    }

    public Boolean getLimitTimeToAssignees() {
        return this.limitTimeToAssignees;
    }

    public void setLimitTimeToAssignees(Boolean limitTimeToAssignees) {
        this.limitTimeToAssignees = limitTimeToAssignees;
    }

    public Double getEstimatedLaborCost() {
        return this.estimatedLaborCost;
    }

    public void setEstimatedLaborCost(Double estimatedLaborCost) {
        this.estimatedLaborCost = estimatedLaborCost;
    }

    public Double getEstimatedLaborCostBaseline() {
        return this.estimatedLaborCostBaseline;
    }

    public void setEstimatedLaborCostBaseline(Double estimatedLaborCostBaseline) {
        this.estimatedLaborCostBaseline = estimatedLaborCostBaseline;
    }

    public RecordRef getEstimateRevRecTemplate() {
        return this.estimateRevRecTemplate;
    }

    public void setEstimateRevRecTemplate(RecordRef estimateRevRecTemplate) {
        this.estimateRevRecTemplate = estimateRevRecTemplate;
    }

    public RecordRef getRevRecForecastRule() {
        return this.revRecForecastRule;
    }

    public void setRevRecForecastRule(RecordRef revRecForecastRule) {
        this.revRecForecastRule = revRecForecastRule;
    }

    public Boolean getUsePercentCompleteOverride() {
        return this.usePercentCompleteOverride;
    }

    public void setUsePercentCompleteOverride(Boolean usePercentCompleteOverride) {
        this.usePercentCompleteOverride = usePercentCompleteOverride;
    }

    public Double getEstimatedLaborRevenue() {
        return this.estimatedLaborRevenue;
    }

    public void setEstimatedLaborRevenue(Double estimatedLaborRevenue) {
        this.estimatedLaborRevenue = estimatedLaborRevenue;
    }

    public Double getEstimatedGrossProfit() {
        return this.estimatedGrossProfit;
    }

    public void setEstimatedGrossProfit(Double estimatedGrossProfit) {
        this.estimatedGrossProfit = estimatedGrossProfit;
    }

    public Double getEstimatedGrossProfitPercent() {
        return this.estimatedGrossProfitPercent;
    }

    public void setEstimatedGrossProfitPercent(Double estimatedGrossProfitPercent) {
        this.estimatedGrossProfitPercent = estimatedGrossProfitPercent;
    }

    public RecordRef getProjectExpenseType() {
        return this.projectExpenseType;
    }

    public void setProjectExpenseType(RecordRef projectExpenseType) {
        this.projectExpenseType = projectExpenseType;
    }

    public Boolean getApplyProjectExpenseTypeToAll() {
        return this.applyProjectExpenseTypeToAll;
    }

    public void setApplyProjectExpenseTypeToAll(Boolean applyProjectExpenseTypeToAll) {
        this.applyProjectExpenseTypeToAll = applyProjectExpenseTypeToAll;
    }

    public Boolean getAllowAllResourcesForTasks() {
        return this.allowAllResourcesForTasks;
    }

    public void setAllowAllResourcesForTasks(Boolean allowAllResourcesForTasks) {
        this.allowAllResourcesForTasks = allowAllResourcesForTasks;
    }

    public Double getJobPrice() {
        return this.jobPrice;
    }

    public void setJobPrice(Double jobPrice) {
        this.jobPrice = jobPrice;
    }

    public Boolean getIsUtilizedTime() {
        return this.isUtilizedTime;
    }

    public void setIsUtilizedTime(Boolean isUtilizedTime) {
        this.isUtilizedTime = isUtilizedTime;
    }

    public Boolean getIsProductiveTime() {
        return this.isProductiveTime;
    }

    public void setIsProductiveTime(Boolean isProductiveTime) {
        this.isProductiveTime = isProductiveTime;
    }

    public Boolean getIsExemptTime() {
        return this.isExemptTime;
    }

    public void setIsExemptTime(Boolean isExemptTime) {
        this.isExemptTime = isExemptTime;
    }

    public Boolean getMaterializeTime() {
        return this.materializeTime;
    }

    public void setMaterializeTime(Boolean materializeTime) {
        this.materializeTime = materializeTime;
    }

    public Boolean getAllowExpenses() {
        return this.allowExpenses;
    }

    public void setAllowExpenses(Boolean allowExpenses) {
        this.allowExpenses = allowExpenses;
    }

    public Boolean getAllocatePayrollExpenses() {
        return this.allocatePayrollExpenses;
    }

    public void setAllocatePayrollExpenses(Boolean allocatePayrollExpenses) {
        this.allocatePayrollExpenses = allocatePayrollExpenses;
    }

    public Boolean getIncludeCrmTasksInTotals() {
        return this.includeCrmTasksInTotals;
    }

    public void setIncludeCrmTasksInTotals(Boolean includeCrmTasksInTotals) {
        this.includeCrmTasksInTotals = includeCrmTasksInTotals;
    }

    public GlobalSubscriptionStatus getGlobalSubscriptionStatus() {
        return this.globalSubscriptionStatus;
    }

    public void setGlobalSubscriptionStatus(GlobalSubscriptionStatus globalSubscriptionStatus) {
        this.globalSubscriptionStatus = globalSubscriptionStatus;
    }

    public JobResourcesList getJobResourcesList() {
        return this.jobResourcesList;
    }

    public void setJobResourcesList(JobResourcesList jobResourcesList) {
        this.jobResourcesList = jobResourcesList;
    }

    public JobPlStatementList getPlStatementList() {
        return this.plStatementList;
    }

    public void setPlStatementList(JobPlStatementList plStatementList) {
        this.plStatementList = plStatementList;
    }

    public JobAddressbookList getAddressbookList() {
        return this.addressbookList;
    }

    public void setAddressbookList(JobAddressbookList addressbookList) {
        this.addressbookList = addressbookList;
    }

    public JobMilestonesList getMilestonesList() {
        return this.milestonesList;
    }

    public void setMilestonesList(JobMilestonesList milestonesList) {
        this.milestonesList = milestonesList;
    }

    public JobCreditCardsList getCreditCardsList() {
        return this.creditCardsList;
    }

    public void setCreditCardsList(JobCreditCardsList creditCardsList) {
        this.creditCardsList = creditCardsList;
    }

    public RecordRef getTimeApproval() {
        return this.timeApproval;
    }

    public void setTimeApproval(RecordRef timeApproval) {
        this.timeApproval = timeApproval;
    }

    public Duration getPlannedWork() {
        return this.plannedWork;
    }

    public void setPlannedWork(Duration plannedWork) {
        this.plannedWork = plannedWork;
    }

    public Duration getPlannedWorkBaseline() {
        return this.plannedWorkBaseline;
    }

    public void setPlannedWorkBaseline(Duration plannedWorkBaseline) {
        this.plannedWorkBaseline = plannedWorkBaseline;
    }

    public RecordRef getBillingRateCard() {
        return this.billingRateCard;
    }

    public void setBillingRateCard(RecordRef billingRateCard) {
        this.billingRateCard = billingRateCard;
    }

    public Boolean getCreateChargeRule() {
        return this.createChargeRule;
    }

    public void setCreateChargeRule(Boolean createChargeRule) {
        this.createChargeRule = createChargeRule;
    }

    public Boolean getSourceServiceItemFromRateCard() {
        return this.sourceServiceItemFromRateCard;
    }

    public void setSourceServiceItemFromRateCard(Boolean sourceServiceItemFromRateCard) {
        this.sourceServiceItemFromRateCard = sourceServiceItemFromRateCard;
    }

    public RecordRef getProjectManager() {
        return this.projectManager;
    }

    public void setProjectManager(RecordRef projectManager) {
        this.projectManager = projectManager;
    }

    public JobSchedulingMethod getSchedulingMethod() {
        return this.schedulingMethod;
    }

    public void setSchedulingMethod(JobSchedulingMethod schedulingMethod) {
        this.schedulingMethod = schedulingMethod;
    }

    public Calendar getScheduledEndDate() {
        return this.scheduledEndDate;
    }

    public void setScheduledEndDate(Calendar scheduledEndDate) {
        this.scheduledEndDate = scheduledEndDate;
    }

    public Calendar getCalculatedStartDate() {
        return this.calculatedStartDate;
    }

    public void setCalculatedStartDate(Calendar calculatedStartDate) {
        this.calculatedStartDate = calculatedStartDate;
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
        if (!(obj instanceof Job)) {
            return false;
        }
        Job other = (Job)obj;
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
        boolean _equals = super.equals(obj) && (this.customForm == null && other.getCustomForm() == null || this.customForm != null && this.customForm.equals(other.getCustomForm())) && (this.entityId == null && other.getEntityId() == null || this.entityId != null && this.entityId.equals(other.getEntityId())) && (this.altName == null && other.getAltName() == null || this.altName != null && this.altName.equals(other.getAltName())) && (this.companyName == null && other.getCompanyName() == null || this.companyName != null && this.companyName.equals(other.getCompanyName())) && (this.phoneticName == null && other.getPhoneticName() == null || this.phoneticName != null && this.phoneticName.equals(other.getPhoneticName())) && (this.entityStatus == null && other.getEntityStatus() == null || this.entityStatus != null && this.entityStatus.equals(other.getEntityStatus())) && (this.defaultAddress == null && other.getDefaultAddress() == null || this.defaultAddress != null && this.defaultAddress.equals(other.getDefaultAddress())) && (this.parent == null && other.getParent() == null || this.parent != null && this.parent.equals(other.getParent())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && this.isInactive.equals(other.getIsInactive())) && (this.percentCompleteOverrideList == null && other.getPercentCompleteOverrideList() == null || this.percentCompleteOverrideList != null && this.percentCompleteOverrideList.equals(other.getPercentCompleteOverrideList())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && this.lastModifiedDate.equals(other.getLastModifiedDate())) && (this.billPay == null && other.getBillPay() == null || this.billPay != null && this.billPay.equals(other.getBillPay())) && (this.dateCreated == null && other.getDateCreated() == null || this.dateCreated != null && this.dateCreated.equals(other.getDateCreated())) && (this.category == null && other.getCategory() == null || this.category != null && this.category.equals(other.getCategory())) && (this.workplace == null && other.getWorkplace() == null || this.workplace != null && this.workplace.equals(other.getWorkplace())) && (this.language == null && other.getLanguage() == null || this.language != null && this.language.equals(other.getLanguage())) && (this.comments == null && other.getComments() == null || this.comments != null && this.comments.equals(other.getComments())) && (this.accountNumber == null && other.getAccountNumber() == null || this.accountNumber != null && this.accountNumber.equals(other.getAccountNumber())) && (this.currency == null && other.getCurrency() == null || this.currency != null && this.currency.equals(other.getCurrency())) && (this.fxRate == null && other.getFxRate() == null || this.fxRate != null && this.fxRate.equals(other.getFxRate())) && (this.startDate == null && other.getStartDate() == null || this.startDate != null && this.startDate.equals(other.getStartDate())) && (this.endDate == null && other.getEndDate() == null || this.endDate != null && this.endDate.equals(other.getEndDate())) && (this.phone == null && other.getPhone() == null || this.phone != null && this.phone.equals(other.getPhone())) && (this.altPhone == null && other.getAltPhone() == null || this.altPhone != null && this.altPhone.equals(other.getAltPhone())) && (this.calculatedEndDate == null && other.getCalculatedEndDate() == null || this.calculatedEndDate != null && this.calculatedEndDate.equals(other.getCalculatedEndDate())) && (this.calculatedEndDateBaseline == null && other.getCalculatedEndDateBaseline() == null || this.calculatedEndDateBaseline != null && this.calculatedEndDateBaseline.equals(other.getCalculatedEndDateBaseline())) && (this.startDateBaseline == null && other.getStartDateBaseline() == null || this.startDateBaseline != null && this.startDateBaseline.equals(other.getStartDateBaseline())) && (this.projectedEndDate == null && other.getProjectedEndDate() == null || this.projectedEndDate != null && this.projectedEndDate.equals(other.getProjectedEndDate())) && (this.projectedEndDateBaseline == null && other.getProjectedEndDateBaseline() == null || this.projectedEndDateBaseline != null && this.projectedEndDateBaseline.equals(other.getProjectedEndDateBaseline())) && (this.lastBaselineDate == null && other.getLastBaselineDate() == null || this.lastBaselineDate != null && this.lastBaselineDate.equals(other.getLastBaselineDate())) && (this.jobType == null && other.getJobType() == null || this.jobType != null && this.jobType.equals(other.getJobType())) && (this.percentComplete == null && other.getPercentComplete() == null || this.percentComplete != null && this.percentComplete.equals(other.getPercentComplete())) && (this.estimatedCost == null && other.getEstimatedCost() == null || this.estimatedCost != null && this.estimatedCost.equals(other.getEstimatedCost())) && (this.estimatedRevenue == null && other.getEstimatedRevenue() == null || this.estimatedRevenue != null && this.estimatedRevenue.equals(other.getEstimatedRevenue())) && (this.estimatedTime == null && other.getEstimatedTime() == null || this.estimatedTime != null && this.estimatedTime.equals(other.getEstimatedTime())) && (this.estimatedTimeOverride == null && other.getEstimatedTimeOverride() == null || this.estimatedTimeOverride != null && this.estimatedTimeOverride.equals(other.getEstimatedTimeOverride())) && (this.fax == null && other.getFax() == null || this.fax != null && this.fax.equals(other.getFax())) && (this.email == null && other.getEmail() == null || this.email != null && this.email.equals(other.getEmail())) && (this.emailPreference == null && other.getEmailPreference() == null || this.emailPreference != null && this.emailPreference.equals(other.getEmailPreference())) && (this.openingBalance == null && other.getOpeningBalance() == null || this.openingBalance != null && this.openingBalance.equals(other.getOpeningBalance())) && (this.openingBalanceDate == null && other.getOpeningBalanceDate() == null || this.openingBalanceDate != null && this.openingBalanceDate.equals(other.getOpeningBalanceDate())) && (this.openingBalanceAccount == null && other.getOpeningBalanceAccount() == null || this.openingBalanceAccount != null && this.openingBalanceAccount.equals(other.getOpeningBalanceAccount())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && this.subsidiary.equals(other.getSubsidiary())) && (this.jobBillingType == null && other.getJobBillingType() == null || this.jobBillingType != null && this.jobBillingType.equals(other.getJobBillingType())) && (this.billingSchedule == null && other.getBillingSchedule() == null || this.billingSchedule != null && this.billingSchedule.equals(other.getBillingSchedule())) && (this.jobItem == null && other.getJobItem() == null || this.jobItem != null && this.jobItem.equals(other.getJobItem())) && (this.percentTimeComplete == null && other.getPercentTimeComplete() == null || this.percentTimeComplete != null && this.percentTimeComplete.equals(other.getPercentTimeComplete())) && (this.actualTime == null && other.getActualTime() == null || this.actualTime != null && this.actualTime.equals(other.getActualTime())) && (this.allowTime == null && other.getAllowTime() == null || this.allowTime != null && this.allowTime.equals(other.getAllowTime())) && (this.timeRemaining == null && other.getTimeRemaining() == null || this.timeRemaining != null && this.timeRemaining.equals(other.getTimeRemaining())) && (this.limitTimeToAssignees == null && other.getLimitTimeToAssignees() == null || this.limitTimeToAssignees != null && this.limitTimeToAssignees.equals(other.getLimitTimeToAssignees())) && (this.estimatedLaborCost == null && other.getEstimatedLaborCost() == null || this.estimatedLaborCost != null && this.estimatedLaborCost.equals(other.getEstimatedLaborCost())) && (this.estimatedLaborCostBaseline == null && other.getEstimatedLaborCostBaseline() == null || this.estimatedLaborCostBaseline != null && this.estimatedLaborCostBaseline.equals(other.getEstimatedLaborCostBaseline())) && (this.estimateRevRecTemplate == null && other.getEstimateRevRecTemplate() == null || this.estimateRevRecTemplate != null && this.estimateRevRecTemplate.equals(other.getEstimateRevRecTemplate())) && (this.revRecForecastRule == null && other.getRevRecForecastRule() == null || this.revRecForecastRule != null && this.revRecForecastRule.equals(other.getRevRecForecastRule())) && (this.usePercentCompleteOverride == null && other.getUsePercentCompleteOverride() == null || this.usePercentCompleteOverride != null && this.usePercentCompleteOverride.equals(other.getUsePercentCompleteOverride())) && (this.estimatedLaborRevenue == null && other.getEstimatedLaborRevenue() == null || this.estimatedLaborRevenue != null && this.estimatedLaborRevenue.equals(other.getEstimatedLaborRevenue())) && (this.estimatedGrossProfit == null && other.getEstimatedGrossProfit() == null || this.estimatedGrossProfit != null && this.estimatedGrossProfit.equals(other.getEstimatedGrossProfit())) && (this.estimatedGrossProfitPercent == null && other.getEstimatedGrossProfitPercent() == null || this.estimatedGrossProfitPercent != null && this.estimatedGrossProfitPercent.equals(other.getEstimatedGrossProfitPercent())) && (this.projectExpenseType == null && other.getProjectExpenseType() == null || this.projectExpenseType != null && this.projectExpenseType.equals(other.getProjectExpenseType())) && (this.applyProjectExpenseTypeToAll == null && other.getApplyProjectExpenseTypeToAll() == null || this.applyProjectExpenseTypeToAll != null && this.applyProjectExpenseTypeToAll.equals(other.getApplyProjectExpenseTypeToAll())) && (this.allowAllResourcesForTasks == null && other.getAllowAllResourcesForTasks() == null || this.allowAllResourcesForTasks != null && this.allowAllResourcesForTasks.equals(other.getAllowAllResourcesForTasks())) && (this.jobPrice == null && other.getJobPrice() == null || this.jobPrice != null && this.jobPrice.equals(other.getJobPrice())) && (this.isUtilizedTime == null && other.getIsUtilizedTime() == null || this.isUtilizedTime != null && this.isUtilizedTime.equals(other.getIsUtilizedTime())) && (this.isProductiveTime == null && other.getIsProductiveTime() == null || this.isProductiveTime != null && this.isProductiveTime.equals(other.getIsProductiveTime())) && (this.isExemptTime == null && other.getIsExemptTime() == null || this.isExemptTime != null && this.isExemptTime.equals(other.getIsExemptTime())) && (this.materializeTime == null && other.getMaterializeTime() == null || this.materializeTime != null && this.materializeTime.equals(other.getMaterializeTime())) && (this.allowExpenses == null && other.getAllowExpenses() == null || this.allowExpenses != null && this.allowExpenses.equals(other.getAllowExpenses())) && (this.allocatePayrollExpenses == null && other.getAllocatePayrollExpenses() == null || this.allocatePayrollExpenses != null && this.allocatePayrollExpenses.equals(other.getAllocatePayrollExpenses())) && (this.includeCrmTasksInTotals == null && other.getIncludeCrmTasksInTotals() == null || this.includeCrmTasksInTotals != null && this.includeCrmTasksInTotals.equals(other.getIncludeCrmTasksInTotals())) && (this.globalSubscriptionStatus == null && other.getGlobalSubscriptionStatus() == null || this.globalSubscriptionStatus != null && this.globalSubscriptionStatus.equals(other.getGlobalSubscriptionStatus())) && (this.jobResourcesList == null && other.getJobResourcesList() == null || this.jobResourcesList != null && this.jobResourcesList.equals(other.getJobResourcesList())) && (this.plStatementList == null && other.getPlStatementList() == null || this.plStatementList != null && this.plStatementList.equals(other.getPlStatementList())) && (this.addressbookList == null && other.getAddressbookList() == null || this.addressbookList != null && this.addressbookList.equals(other.getAddressbookList())) && (this.milestonesList == null && other.getMilestonesList() == null || this.milestonesList != null && this.milestonesList.equals(other.getMilestonesList())) && (this.creditCardsList == null && other.getCreditCardsList() == null || this.creditCardsList != null && this.creditCardsList.equals(other.getCreditCardsList())) && (this.timeApproval == null && other.getTimeApproval() == null || this.timeApproval != null && this.timeApproval.equals(other.getTimeApproval())) && (this.plannedWork == null && other.getPlannedWork() == null || this.plannedWork != null && this.plannedWork.equals(other.getPlannedWork())) && (this.plannedWorkBaseline == null && other.getPlannedWorkBaseline() == null || this.plannedWorkBaseline != null && this.plannedWorkBaseline.equals(other.getPlannedWorkBaseline())) && (this.billingRateCard == null && other.getBillingRateCard() == null || this.billingRateCard != null && this.billingRateCard.equals(other.getBillingRateCard())) && (this.createChargeRule == null && other.getCreateChargeRule() == null || this.createChargeRule != null && this.createChargeRule.equals(other.getCreateChargeRule())) && (this.sourceServiceItemFromRateCard == null && other.getSourceServiceItemFromRateCard() == null || this.sourceServiceItemFromRateCard != null && this.sourceServiceItemFromRateCard.equals(other.getSourceServiceItemFromRateCard())) && (this.projectManager == null && other.getProjectManager() == null || this.projectManager != null && this.projectManager.equals(other.getProjectManager())) && (this.schedulingMethod == null && other.getSchedulingMethod() == null || this.schedulingMethod != null && this.schedulingMethod.equals(other.getSchedulingMethod())) && (this.scheduledEndDate == null && other.getScheduledEndDate() == null || this.scheduledEndDate != null && this.scheduledEndDate.equals(other.getScheduledEndDate())) && (this.calculatedStartDate == null && other.getCalculatedStartDate() == null || this.calculatedStartDate != null && this.calculatedStartDate.equals(other.getCalculatedStartDate())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
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
        if (this.getCompanyName() != null) {
            _hashCode += this.getCompanyName().hashCode();
        }
        if (this.getPhoneticName() != null) {
            _hashCode += this.getPhoneticName().hashCode();
        }
        if (this.getEntityStatus() != null) {
            _hashCode += this.getEntityStatus().hashCode();
        }
        if (this.getDefaultAddress() != null) {
            _hashCode += this.getDefaultAddress().hashCode();
        }
        if (this.getParent() != null) {
            _hashCode += this.getParent().hashCode();
        }
        if (this.getIsInactive() != null) {
            _hashCode += this.getIsInactive().hashCode();
        }
        if (this.getPercentCompleteOverrideList() != null) {
            _hashCode += this.getPercentCompleteOverrideList().hashCode();
        }
        if (this.getLastModifiedDate() != null) {
            _hashCode += this.getLastModifiedDate().hashCode();
        }
        if (this.getBillPay() != null) {
            _hashCode += this.getBillPay().hashCode();
        }
        if (this.getDateCreated() != null) {
            _hashCode += this.getDateCreated().hashCode();
        }
        if (this.getCategory() != null) {
            _hashCode += this.getCategory().hashCode();
        }
        if (this.getWorkplace() != null) {
            _hashCode += this.getWorkplace().hashCode();
        }
        if (this.getLanguage() != null) {
            _hashCode += this.getLanguage().hashCode();
        }
        if (this.getComments() != null) {
            _hashCode += this.getComments().hashCode();
        }
        if (this.getAccountNumber() != null) {
            _hashCode += this.getAccountNumber().hashCode();
        }
        if (this.getCurrency() != null) {
            _hashCode += this.getCurrency().hashCode();
        }
        if (this.getFxRate() != null) {
            _hashCode += this.getFxRate().hashCode();
        }
        if (this.getStartDate() != null) {
            _hashCode += this.getStartDate().hashCode();
        }
        if (this.getEndDate() != null) {
            _hashCode += this.getEndDate().hashCode();
        }
        if (this.getPhone() != null) {
            _hashCode += this.getPhone().hashCode();
        }
        if (this.getAltPhone() != null) {
            _hashCode += this.getAltPhone().hashCode();
        }
        if (this.getCalculatedEndDate() != null) {
            _hashCode += this.getCalculatedEndDate().hashCode();
        }
        if (this.getCalculatedEndDateBaseline() != null) {
            _hashCode += this.getCalculatedEndDateBaseline().hashCode();
        }
        if (this.getStartDateBaseline() != null) {
            _hashCode += this.getStartDateBaseline().hashCode();
        }
        if (this.getProjectedEndDate() != null) {
            _hashCode += this.getProjectedEndDate().hashCode();
        }
        if (this.getProjectedEndDateBaseline() != null) {
            _hashCode += this.getProjectedEndDateBaseline().hashCode();
        }
        if (this.getLastBaselineDate() != null) {
            _hashCode += this.getLastBaselineDate().hashCode();
        }
        if (this.getJobType() != null) {
            _hashCode += this.getJobType().hashCode();
        }
        if (this.getPercentComplete() != null) {
            _hashCode += this.getPercentComplete().hashCode();
        }
        if (this.getEstimatedCost() != null) {
            _hashCode += this.getEstimatedCost().hashCode();
        }
        if (this.getEstimatedRevenue() != null) {
            _hashCode += this.getEstimatedRevenue().hashCode();
        }
        if (this.getEstimatedTime() != null) {
            _hashCode += this.getEstimatedTime().hashCode();
        }
        if (this.getEstimatedTimeOverride() != null) {
            _hashCode += this.getEstimatedTimeOverride().hashCode();
        }
        if (this.getFax() != null) {
            _hashCode += this.getFax().hashCode();
        }
        if (this.getEmail() != null) {
            _hashCode += this.getEmail().hashCode();
        }
        if (this.getEmailPreference() != null) {
            _hashCode += this.getEmailPreference().hashCode();
        }
        if (this.getOpeningBalance() != null) {
            _hashCode += this.getOpeningBalance().hashCode();
        }
        if (this.getOpeningBalanceDate() != null) {
            _hashCode += this.getOpeningBalanceDate().hashCode();
        }
        if (this.getOpeningBalanceAccount() != null) {
            _hashCode += this.getOpeningBalanceAccount().hashCode();
        }
        if (this.getSubsidiary() != null) {
            _hashCode += this.getSubsidiary().hashCode();
        }
        if (this.getJobBillingType() != null) {
            _hashCode += this.getJobBillingType().hashCode();
        }
        if (this.getBillingSchedule() != null) {
            _hashCode += this.getBillingSchedule().hashCode();
        }
        if (this.getJobItem() != null) {
            _hashCode += this.getJobItem().hashCode();
        }
        if (this.getPercentTimeComplete() != null) {
            _hashCode += this.getPercentTimeComplete().hashCode();
        }
        if (this.getActualTime() != null) {
            _hashCode += this.getActualTime().hashCode();
        }
        if (this.getAllowTime() != null) {
            _hashCode += this.getAllowTime().hashCode();
        }
        if (this.getTimeRemaining() != null) {
            _hashCode += this.getTimeRemaining().hashCode();
        }
        if (this.getLimitTimeToAssignees() != null) {
            _hashCode += this.getLimitTimeToAssignees().hashCode();
        }
        if (this.getEstimatedLaborCost() != null) {
            _hashCode += this.getEstimatedLaborCost().hashCode();
        }
        if (this.getEstimatedLaborCostBaseline() != null) {
            _hashCode += this.getEstimatedLaborCostBaseline().hashCode();
        }
        if (this.getEstimateRevRecTemplate() != null) {
            _hashCode += this.getEstimateRevRecTemplate().hashCode();
        }
        if (this.getRevRecForecastRule() != null) {
            _hashCode += this.getRevRecForecastRule().hashCode();
        }
        if (this.getUsePercentCompleteOverride() != null) {
            _hashCode += this.getUsePercentCompleteOverride().hashCode();
        }
        if (this.getEstimatedLaborRevenue() != null) {
            _hashCode += this.getEstimatedLaborRevenue().hashCode();
        }
        if (this.getEstimatedGrossProfit() != null) {
            _hashCode += this.getEstimatedGrossProfit().hashCode();
        }
        if (this.getEstimatedGrossProfitPercent() != null) {
            _hashCode += this.getEstimatedGrossProfitPercent().hashCode();
        }
        if (this.getProjectExpenseType() != null) {
            _hashCode += this.getProjectExpenseType().hashCode();
        }
        if (this.getApplyProjectExpenseTypeToAll() != null) {
            _hashCode += this.getApplyProjectExpenseTypeToAll().hashCode();
        }
        if (this.getAllowAllResourcesForTasks() != null) {
            _hashCode += this.getAllowAllResourcesForTasks().hashCode();
        }
        if (this.getJobPrice() != null) {
            _hashCode += this.getJobPrice().hashCode();
        }
        if (this.getIsUtilizedTime() != null) {
            _hashCode += this.getIsUtilizedTime().hashCode();
        }
        if (this.getIsProductiveTime() != null) {
            _hashCode += this.getIsProductiveTime().hashCode();
        }
        if (this.getIsExemptTime() != null) {
            _hashCode += this.getIsExemptTime().hashCode();
        }
        if (this.getMaterializeTime() != null) {
            _hashCode += this.getMaterializeTime().hashCode();
        }
        if (this.getAllowExpenses() != null) {
            _hashCode += this.getAllowExpenses().hashCode();
        }
        if (this.getAllocatePayrollExpenses() != null) {
            _hashCode += this.getAllocatePayrollExpenses().hashCode();
        }
        if (this.getIncludeCrmTasksInTotals() != null) {
            _hashCode += this.getIncludeCrmTasksInTotals().hashCode();
        }
        if (this.getGlobalSubscriptionStatus() != null) {
            _hashCode += this.getGlobalSubscriptionStatus().hashCode();
        }
        if (this.getJobResourcesList() != null) {
            _hashCode += this.getJobResourcesList().hashCode();
        }
        if (this.getPlStatementList() != null) {
            _hashCode += this.getPlStatementList().hashCode();
        }
        if (this.getAddressbookList() != null) {
            _hashCode += this.getAddressbookList().hashCode();
        }
        if (this.getMilestonesList() != null) {
            _hashCode += this.getMilestonesList().hashCode();
        }
        if (this.getCreditCardsList() != null) {
            _hashCode += this.getCreditCardsList().hashCode();
        }
        if (this.getTimeApproval() != null) {
            _hashCode += this.getTimeApproval().hashCode();
        }
        if (this.getPlannedWork() != null) {
            _hashCode += this.getPlannedWork().hashCode();
        }
        if (this.getPlannedWorkBaseline() != null) {
            _hashCode += this.getPlannedWorkBaseline().hashCode();
        }
        if (this.getBillingRateCard() != null) {
            _hashCode += this.getBillingRateCard().hashCode();
        }
        if (this.getCreateChargeRule() != null) {
            _hashCode += this.getCreateChargeRule().hashCode();
        }
        if (this.getSourceServiceItemFromRateCard() != null) {
            _hashCode += this.getSourceServiceItemFromRateCard().hashCode();
        }
        if (this.getProjectManager() != null) {
            _hashCode += this.getProjectManager().hashCode();
        }
        if (this.getSchedulingMethod() != null) {
            _hashCode += this.getSchedulingMethod().hashCode();
        }
        if (this.getScheduledEndDate() != null) {
            _hashCode += this.getScheduledEndDate().hashCode();
        }
        if (this.getCalculatedStartDate() != null) {
            _hashCode += this.getCalculatedStartDate().hashCode();
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
        typeDesc.setXmlType(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "Job"));
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
        elemField.setFieldName("companyName");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "companyName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("entityStatus");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "entityStatus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("parent");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "parent"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("percentCompleteOverrideList");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "percentCompleteOverrideList"));
        elemField.setXmlType(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "JobPercentCompleteOverrideList"));
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
        elemField.setFieldName("billPay");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "billPay"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("category");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "category"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("workplace");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "workplace"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "language"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "accountNumber"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("fxRate");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "fxRate"));
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
        elemField.setFieldName("endDate");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "endDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("altPhone");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "altPhone"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("calculatedEndDate");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "calculatedEndDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("calculatedEndDateBaseline");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "calculatedEndDateBaseline"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("startDateBaseline");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "startDateBaseline"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("projectedEndDate");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "projectedEndDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("projectedEndDateBaseline");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "projectedEndDateBaseline"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastBaselineDate");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "lastBaselineDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("jobType");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "jobType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("percentComplete");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "percentComplete"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("estimatedCost");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "estimatedCost"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("estimatedRevenue");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "estimatedRevenue"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("estimatedTime");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "estimatedTime"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "Duration"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("estimatedTimeOverride");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "estimatedTimeOverride"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "Duration"));
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
        elemField.setFieldName("emailPreference");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "emailPreference"));
        elemField.setXmlType(new QName("urn:types.relationships_2022_1.lists.webservices.netsuite.com", "EmailPreference"));
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
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("jobBillingType");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "jobBillingType"));
        elemField.setXmlType(new QName("urn:types.relationships_2022_1.lists.webservices.netsuite.com", "JobBillingType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billingSchedule");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "billingSchedule"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("jobItem");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "jobItem"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("percentTimeComplete");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "percentTimeComplete"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("actualTime");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "actualTime"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "Duration"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("allowTime");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "allowTime"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("timeRemaining");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "timeRemaining"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "Duration"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("limitTimeToAssignees");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "limitTimeToAssignees"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("estimatedLaborCost");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "estimatedLaborCost"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("estimatedLaborCostBaseline");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "estimatedLaborCostBaseline"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("estimateRevRecTemplate");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "estimateRevRecTemplate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revRecForecastRule");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "revRecForecastRule"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("usePercentCompleteOverride");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "usePercentCompleteOverride"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("estimatedLaborRevenue");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "estimatedLaborRevenue"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("estimatedGrossProfit");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "estimatedGrossProfit"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("estimatedGrossProfitPercent");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "estimatedGrossProfitPercent"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("projectExpenseType");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "projectExpenseType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("applyProjectExpenseTypeToAll");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "applyProjectExpenseTypeToAll"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("allowAllResourcesForTasks");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "allowAllResourcesForTasks"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("jobPrice");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "jobPrice"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isUtilizedTime");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "isUtilizedTime"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isProductiveTime");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "isProductiveTime"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isExemptTime");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "isExemptTime"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("materializeTime");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "materializeTime"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("allowExpenses");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "allowExpenses"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("allocatePayrollExpenses");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "allocatePayrollExpenses"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("includeCrmTasksInTotals");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "includeCrmTasksInTotals"));
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
        elemField.setFieldName("jobResourcesList");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "jobResourcesList"));
        elemField.setXmlType(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "JobResourcesList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("plStatementList");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "plStatementList"));
        elemField.setXmlType(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "JobPlStatementList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("addressbookList");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "addressbookList"));
        elemField.setXmlType(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "JobAddressbookList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("milestonesList");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "milestonesList"));
        elemField.setXmlType(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "JobMilestonesList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("creditCardsList");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "creditCardsList"));
        elemField.setXmlType(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "JobCreditCardsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("timeApproval");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "timeApproval"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("plannedWork");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "plannedWork"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "Duration"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("plannedWorkBaseline");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "plannedWorkBaseline"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "Duration"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billingRateCard");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "billingRateCard"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("createChargeRule");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "createChargeRule"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("sourceServiceItemFromRateCard");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "sourceServiceItemFromRateCard"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("projectManager");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "projectManager"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("schedulingMethod");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "schedulingMethod"));
        elemField.setXmlType(new QName("urn:types.relationships_2022_1.lists.webservices.netsuite.com", "JobSchedulingMethod"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("scheduledEndDate");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "scheduledEndDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("calculatedStartDate");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "calculatedStartDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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

