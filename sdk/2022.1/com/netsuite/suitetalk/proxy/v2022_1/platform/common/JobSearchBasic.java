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

public class JobSearchBasic
extends SearchRecordBasic
implements Serializable {
    private SearchStringField accountNumber;
    private SearchDoubleField actualTime;
    private SearchStringField address;
    private SearchStringField addressee;
    private SearchStringField addressLabel;
    private SearchStringField addressPhone;
    private SearchBooleanField allocatePayrollExpenses;
    private SearchBooleanField allowAllResourcesForTasks;
    private SearchBooleanField allowExpenses;
    private SearchBooleanField allowTime;
    private SearchBooleanField applyProjectExpenseTypeToAll;
    private SearchStringField attention;
    private SearchMultiSelectField billingRateCard;
    private SearchMultiSelectField billingSchedule;
    private SearchDateField calculatedEndDate;
    private SearchDateField calculatedEndDateBaseline;
    private SearchDateField calculatedStartDate;
    private SearchMultiSelectField category;
    private SearchStringField city;
    private SearchStringField comments;
    private SearchStringField contact;
    private SearchEnumMultiSelectField country;
    private SearchStringField county;
    private SearchMultiSelectField customer;
    private SearchDateField dateCreated;
    private SearchMultiSelectField defaultTaxReg;
    private SearchStringField defaultTaxRegText;
    private SearchStringField email;
    private SearchDateField endDate;
    private SearchStringField entityId;
    private SearchDoubleField estCost;
    private SearchDateField estEndDate;
    private SearchDoubleField estimatedGrossProfit;
    private SearchDoubleField estimatedGrossProfitPercent;
    private SearchDoubleField estimatedLaborCost;
    private SearchDoubleField estimatedLaborCostBaseline;
    private SearchDoubleField estimatedLaborRevenue;
    private SearchDoubleField estimatedTime;
    private SearchDoubleField estimatedTimeOverride;
    private SearchDoubleField estimatedTimeOverrideBaseline;
    private SearchDoubleField estRevenue;
    private SearchMultiSelectField externalId;
    private SearchStringField externalIdString;
    private SearchStringField fax;
    private SearchBooleanField giveAccess;
    private SearchEnumMultiSelectField globalSubscriptionStatus;
    private SearchStringField image;
    private SearchBooleanField includeCrmTasksInTotals;
    private SearchMultiSelectField internalId;
    private SearchLongField internalIdNumber;
    private SearchBooleanField isDefaultBilling;
    private SearchBooleanField isDefaultShipping;
    private SearchBooleanField isExemptTime;
    private SearchBooleanField isInactive;
    private SearchBooleanField isProductiveTime;
    private SearchBooleanField isUtilizedTime;
    private SearchEnumMultiSelectField jobBillingType;
    private SearchMultiSelectField jobItem;
    private SearchDoubleField jobPrice;
    private SearchMultiSelectField jobResource;
    private SearchMultiSelectField jobResourceRole;
    private SearchEnumMultiSelectField language;
    private SearchDateField lastBaselineDate;
    private SearchDateField lastModifiedDate;
    private SearchEnumMultiSelectField level;
    private SearchBooleanField limitTimeToAssignees;
    private SearchBooleanField materializeTime;
    private SearchMultiSelectField parent;
    private SearchLongField pctComplete;
    private SearchLongField percentTimeComplete;
    private SearchEnumMultiSelectField permission;
    private SearchStringField phone;
    private SearchStringField phoneticName;
    private SearchDoubleField plannedWork;
    private SearchDoubleField plannedWorkBaseline;
    private SearchDateField projectedEndDateBaseline;
    private SearchMultiSelectField projectExpenseType;
    private SearchMultiSelectField projectManager;
    private SearchMultiSelectField revRecForecastRule;
    private SearchDateField scheduledEndDate;
    private SearchEnumMultiSelectField schedulingMethod;
    private SearchBooleanField sourceServiceItemFromRateCard;
    private SearchDateField startDate;
    private SearchDateField startDateBaseline;
    private SearchStringField state;
    private SearchMultiSelectField status;
    private SearchMultiSelectField subsidiary;
    private SearchMultiSelectField timeApproval;
    private SearchDoubleField timeRemaining;
    private SearchMultiSelectField type;
    private SearchBooleanField usePercentCompleteOverride;
    private SearchStringField zipCode;
    private SearchCustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(JobSearchBasic.class, true);

    public JobSearchBasic() {
    }

    public JobSearchBasic(SearchStringField accountNumber, SearchDoubleField actualTime, SearchStringField address, SearchStringField addressee, SearchStringField addressLabel, SearchStringField addressPhone, SearchBooleanField allocatePayrollExpenses, SearchBooleanField allowAllResourcesForTasks, SearchBooleanField allowExpenses, SearchBooleanField allowTime, SearchBooleanField applyProjectExpenseTypeToAll, SearchStringField attention, SearchMultiSelectField billingRateCard, SearchMultiSelectField billingSchedule, SearchDateField calculatedEndDate, SearchDateField calculatedEndDateBaseline, SearchDateField calculatedStartDate, SearchMultiSelectField category, SearchStringField city, SearchStringField comments, SearchStringField contact, SearchEnumMultiSelectField country, SearchStringField county, SearchMultiSelectField customer, SearchDateField dateCreated, SearchMultiSelectField defaultTaxReg, SearchStringField defaultTaxRegText, SearchStringField email, SearchDateField endDate, SearchStringField entityId, SearchDoubleField estCost, SearchDateField estEndDate, SearchDoubleField estimatedGrossProfit, SearchDoubleField estimatedGrossProfitPercent, SearchDoubleField estimatedLaborCost, SearchDoubleField estimatedLaborCostBaseline, SearchDoubleField estimatedLaborRevenue, SearchDoubleField estimatedTime, SearchDoubleField estimatedTimeOverride, SearchDoubleField estimatedTimeOverrideBaseline, SearchDoubleField estRevenue, SearchMultiSelectField externalId, SearchStringField externalIdString, SearchStringField fax, SearchBooleanField giveAccess, SearchEnumMultiSelectField globalSubscriptionStatus, SearchStringField image, SearchBooleanField includeCrmTasksInTotals, SearchMultiSelectField internalId, SearchLongField internalIdNumber, SearchBooleanField isDefaultBilling, SearchBooleanField isDefaultShipping, SearchBooleanField isExemptTime, SearchBooleanField isInactive, SearchBooleanField isProductiveTime, SearchBooleanField isUtilizedTime, SearchEnumMultiSelectField jobBillingType, SearchMultiSelectField jobItem, SearchDoubleField jobPrice, SearchMultiSelectField jobResource, SearchMultiSelectField jobResourceRole, SearchEnumMultiSelectField language, SearchDateField lastBaselineDate, SearchDateField lastModifiedDate, SearchEnumMultiSelectField level, SearchBooleanField limitTimeToAssignees, SearchBooleanField materializeTime, SearchMultiSelectField parent, SearchLongField pctComplete, SearchLongField percentTimeComplete, SearchEnumMultiSelectField permission, SearchStringField phone, SearchStringField phoneticName, SearchDoubleField plannedWork, SearchDoubleField plannedWorkBaseline, SearchDateField projectedEndDateBaseline, SearchMultiSelectField projectExpenseType, SearchMultiSelectField projectManager, SearchMultiSelectField revRecForecastRule, SearchDateField scheduledEndDate, SearchEnumMultiSelectField schedulingMethod, SearchBooleanField sourceServiceItemFromRateCard, SearchDateField startDate, SearchDateField startDateBaseline, SearchStringField state, SearchMultiSelectField status, SearchMultiSelectField subsidiary, SearchMultiSelectField timeApproval, SearchDoubleField timeRemaining, SearchMultiSelectField type, SearchBooleanField usePercentCompleteOverride, SearchStringField zipCode, SearchCustomFieldList customFieldList) {
        this.accountNumber = accountNumber;
        this.actualTime = actualTime;
        this.address = address;
        this.addressee = addressee;
        this.addressLabel = addressLabel;
        this.addressPhone = addressPhone;
        this.allocatePayrollExpenses = allocatePayrollExpenses;
        this.allowAllResourcesForTasks = allowAllResourcesForTasks;
        this.allowExpenses = allowExpenses;
        this.allowTime = allowTime;
        this.applyProjectExpenseTypeToAll = applyProjectExpenseTypeToAll;
        this.attention = attention;
        this.billingRateCard = billingRateCard;
        this.billingSchedule = billingSchedule;
        this.calculatedEndDate = calculatedEndDate;
        this.calculatedEndDateBaseline = calculatedEndDateBaseline;
        this.calculatedStartDate = calculatedStartDate;
        this.category = category;
        this.city = city;
        this.comments = comments;
        this.contact = contact;
        this.country = country;
        this.county = county;
        this.customer = customer;
        this.dateCreated = dateCreated;
        this.defaultTaxReg = defaultTaxReg;
        this.defaultTaxRegText = defaultTaxRegText;
        this.email = email;
        this.endDate = endDate;
        this.entityId = entityId;
        this.estCost = estCost;
        this.estEndDate = estEndDate;
        this.estimatedGrossProfit = estimatedGrossProfit;
        this.estimatedGrossProfitPercent = estimatedGrossProfitPercent;
        this.estimatedLaborCost = estimatedLaborCost;
        this.estimatedLaborCostBaseline = estimatedLaborCostBaseline;
        this.estimatedLaborRevenue = estimatedLaborRevenue;
        this.estimatedTime = estimatedTime;
        this.estimatedTimeOverride = estimatedTimeOverride;
        this.estimatedTimeOverrideBaseline = estimatedTimeOverrideBaseline;
        this.estRevenue = estRevenue;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.fax = fax;
        this.giveAccess = giveAccess;
        this.globalSubscriptionStatus = globalSubscriptionStatus;
        this.image = image;
        this.includeCrmTasksInTotals = includeCrmTasksInTotals;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isDefaultBilling = isDefaultBilling;
        this.isDefaultShipping = isDefaultShipping;
        this.isExemptTime = isExemptTime;
        this.isInactive = isInactive;
        this.isProductiveTime = isProductiveTime;
        this.isUtilizedTime = isUtilizedTime;
        this.jobBillingType = jobBillingType;
        this.jobItem = jobItem;
        this.jobPrice = jobPrice;
        this.jobResource = jobResource;
        this.jobResourceRole = jobResourceRole;
        this.language = language;
        this.lastBaselineDate = lastBaselineDate;
        this.lastModifiedDate = lastModifiedDate;
        this.level = level;
        this.limitTimeToAssignees = limitTimeToAssignees;
        this.materializeTime = materializeTime;
        this.parent = parent;
        this.pctComplete = pctComplete;
        this.percentTimeComplete = percentTimeComplete;
        this.permission = permission;
        this.phone = phone;
        this.phoneticName = phoneticName;
        this.plannedWork = plannedWork;
        this.plannedWorkBaseline = plannedWorkBaseline;
        this.projectedEndDateBaseline = projectedEndDateBaseline;
        this.projectExpenseType = projectExpenseType;
        this.projectManager = projectManager;
        this.revRecForecastRule = revRecForecastRule;
        this.scheduledEndDate = scheduledEndDate;
        this.schedulingMethod = schedulingMethod;
        this.sourceServiceItemFromRateCard = sourceServiceItemFromRateCard;
        this.startDate = startDate;
        this.startDateBaseline = startDateBaseline;
        this.state = state;
        this.status = status;
        this.subsidiary = subsidiary;
        this.timeApproval = timeApproval;
        this.timeRemaining = timeRemaining;
        this.type = type;
        this.usePercentCompleteOverride = usePercentCompleteOverride;
        this.zipCode = zipCode;
        this.customFieldList = customFieldList;
    }

    public SearchStringField getAccountNumber() {
        return this.accountNumber;
    }

    public void setAccountNumber(SearchStringField accountNumber) {
        this.accountNumber = accountNumber;
    }

    public SearchDoubleField getActualTime() {
        return this.actualTime;
    }

    public void setActualTime(SearchDoubleField actualTime) {
        this.actualTime = actualTime;
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

    public SearchBooleanField getAllocatePayrollExpenses() {
        return this.allocatePayrollExpenses;
    }

    public void setAllocatePayrollExpenses(SearchBooleanField allocatePayrollExpenses) {
        this.allocatePayrollExpenses = allocatePayrollExpenses;
    }

    public SearchBooleanField getAllowAllResourcesForTasks() {
        return this.allowAllResourcesForTasks;
    }

    public void setAllowAllResourcesForTasks(SearchBooleanField allowAllResourcesForTasks) {
        this.allowAllResourcesForTasks = allowAllResourcesForTasks;
    }

    public SearchBooleanField getAllowExpenses() {
        return this.allowExpenses;
    }

    public void setAllowExpenses(SearchBooleanField allowExpenses) {
        this.allowExpenses = allowExpenses;
    }

    public SearchBooleanField getAllowTime() {
        return this.allowTime;
    }

    public void setAllowTime(SearchBooleanField allowTime) {
        this.allowTime = allowTime;
    }

    public SearchBooleanField getApplyProjectExpenseTypeToAll() {
        return this.applyProjectExpenseTypeToAll;
    }

    public void setApplyProjectExpenseTypeToAll(SearchBooleanField applyProjectExpenseTypeToAll) {
        this.applyProjectExpenseTypeToAll = applyProjectExpenseTypeToAll;
    }

    public SearchStringField getAttention() {
        return this.attention;
    }

    public void setAttention(SearchStringField attention) {
        this.attention = attention;
    }

    public SearchMultiSelectField getBillingRateCard() {
        return this.billingRateCard;
    }

    public void setBillingRateCard(SearchMultiSelectField billingRateCard) {
        this.billingRateCard = billingRateCard;
    }

    public SearchMultiSelectField getBillingSchedule() {
        return this.billingSchedule;
    }

    public void setBillingSchedule(SearchMultiSelectField billingSchedule) {
        this.billingSchedule = billingSchedule;
    }

    public SearchDateField getCalculatedEndDate() {
        return this.calculatedEndDate;
    }

    public void setCalculatedEndDate(SearchDateField calculatedEndDate) {
        this.calculatedEndDate = calculatedEndDate;
    }

    public SearchDateField getCalculatedEndDateBaseline() {
        return this.calculatedEndDateBaseline;
    }

    public void setCalculatedEndDateBaseline(SearchDateField calculatedEndDateBaseline) {
        this.calculatedEndDateBaseline = calculatedEndDateBaseline;
    }

    public SearchDateField getCalculatedStartDate() {
        return this.calculatedStartDate;
    }

    public void setCalculatedStartDate(SearchDateField calculatedStartDate) {
        this.calculatedStartDate = calculatedStartDate;
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

    public SearchMultiSelectField getCustomer() {
        return this.customer;
    }

    public void setCustomer(SearchMultiSelectField customer) {
        this.customer = customer;
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

    public SearchStringField getEmail() {
        return this.email;
    }

    public void setEmail(SearchStringField email) {
        this.email = email;
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

    public SearchDoubleField getEstCost() {
        return this.estCost;
    }

    public void setEstCost(SearchDoubleField estCost) {
        this.estCost = estCost;
    }

    public SearchDateField getEstEndDate() {
        return this.estEndDate;
    }

    public void setEstEndDate(SearchDateField estEndDate) {
        this.estEndDate = estEndDate;
    }

    public SearchDoubleField getEstimatedGrossProfit() {
        return this.estimatedGrossProfit;
    }

    public void setEstimatedGrossProfit(SearchDoubleField estimatedGrossProfit) {
        this.estimatedGrossProfit = estimatedGrossProfit;
    }

    public SearchDoubleField getEstimatedGrossProfitPercent() {
        return this.estimatedGrossProfitPercent;
    }

    public void setEstimatedGrossProfitPercent(SearchDoubleField estimatedGrossProfitPercent) {
        this.estimatedGrossProfitPercent = estimatedGrossProfitPercent;
    }

    public SearchDoubleField getEstimatedLaborCost() {
        return this.estimatedLaborCost;
    }

    public void setEstimatedLaborCost(SearchDoubleField estimatedLaborCost) {
        this.estimatedLaborCost = estimatedLaborCost;
    }

    public SearchDoubleField getEstimatedLaborCostBaseline() {
        return this.estimatedLaborCostBaseline;
    }

    public void setEstimatedLaborCostBaseline(SearchDoubleField estimatedLaborCostBaseline) {
        this.estimatedLaborCostBaseline = estimatedLaborCostBaseline;
    }

    public SearchDoubleField getEstimatedLaborRevenue() {
        return this.estimatedLaborRevenue;
    }

    public void setEstimatedLaborRevenue(SearchDoubleField estimatedLaborRevenue) {
        this.estimatedLaborRevenue = estimatedLaborRevenue;
    }

    public SearchDoubleField getEstimatedTime() {
        return this.estimatedTime;
    }

    public void setEstimatedTime(SearchDoubleField estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    public SearchDoubleField getEstimatedTimeOverride() {
        return this.estimatedTimeOverride;
    }

    public void setEstimatedTimeOverride(SearchDoubleField estimatedTimeOverride) {
        this.estimatedTimeOverride = estimatedTimeOverride;
    }

    public SearchDoubleField getEstimatedTimeOverrideBaseline() {
        return this.estimatedTimeOverrideBaseline;
    }

    public void setEstimatedTimeOverrideBaseline(SearchDoubleField estimatedTimeOverrideBaseline) {
        this.estimatedTimeOverrideBaseline = estimatedTimeOverrideBaseline;
    }

    public SearchDoubleField getEstRevenue() {
        return this.estRevenue;
    }

    public void setEstRevenue(SearchDoubleField estRevenue) {
        this.estRevenue = estRevenue;
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

    public SearchStringField getImage() {
        return this.image;
    }

    public void setImage(SearchStringField image) {
        this.image = image;
    }

    public SearchBooleanField getIncludeCrmTasksInTotals() {
        return this.includeCrmTasksInTotals;
    }

    public void setIncludeCrmTasksInTotals(SearchBooleanField includeCrmTasksInTotals) {
        this.includeCrmTasksInTotals = includeCrmTasksInTotals;
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

    public SearchBooleanField getIsExemptTime() {
        return this.isExemptTime;
    }

    public void setIsExemptTime(SearchBooleanField isExemptTime) {
        this.isExemptTime = isExemptTime;
    }

    public SearchBooleanField getIsInactive() {
        return this.isInactive;
    }

    public void setIsInactive(SearchBooleanField isInactive) {
        this.isInactive = isInactive;
    }

    public SearchBooleanField getIsProductiveTime() {
        return this.isProductiveTime;
    }

    public void setIsProductiveTime(SearchBooleanField isProductiveTime) {
        this.isProductiveTime = isProductiveTime;
    }

    public SearchBooleanField getIsUtilizedTime() {
        return this.isUtilizedTime;
    }

    public void setIsUtilizedTime(SearchBooleanField isUtilizedTime) {
        this.isUtilizedTime = isUtilizedTime;
    }

    public SearchEnumMultiSelectField getJobBillingType() {
        return this.jobBillingType;
    }

    public void setJobBillingType(SearchEnumMultiSelectField jobBillingType) {
        this.jobBillingType = jobBillingType;
    }

    public SearchMultiSelectField getJobItem() {
        return this.jobItem;
    }

    public void setJobItem(SearchMultiSelectField jobItem) {
        this.jobItem = jobItem;
    }

    public SearchDoubleField getJobPrice() {
        return this.jobPrice;
    }

    public void setJobPrice(SearchDoubleField jobPrice) {
        this.jobPrice = jobPrice;
    }

    public SearchMultiSelectField getJobResource() {
        return this.jobResource;
    }

    public void setJobResource(SearchMultiSelectField jobResource) {
        this.jobResource = jobResource;
    }

    public SearchMultiSelectField getJobResourceRole() {
        return this.jobResourceRole;
    }

    public void setJobResourceRole(SearchMultiSelectField jobResourceRole) {
        this.jobResourceRole = jobResourceRole;
    }

    public SearchEnumMultiSelectField getLanguage() {
        return this.language;
    }

    public void setLanguage(SearchEnumMultiSelectField language) {
        this.language = language;
    }

    public SearchDateField getLastBaselineDate() {
        return this.lastBaselineDate;
    }

    public void setLastBaselineDate(SearchDateField lastBaselineDate) {
        this.lastBaselineDate = lastBaselineDate;
    }

    public SearchDateField getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    public void setLastModifiedDate(SearchDateField lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public SearchEnumMultiSelectField getLevel() {
        return this.level;
    }

    public void setLevel(SearchEnumMultiSelectField level) {
        this.level = level;
    }

    public SearchBooleanField getLimitTimeToAssignees() {
        return this.limitTimeToAssignees;
    }

    public void setLimitTimeToAssignees(SearchBooleanField limitTimeToAssignees) {
        this.limitTimeToAssignees = limitTimeToAssignees;
    }

    public SearchBooleanField getMaterializeTime() {
        return this.materializeTime;
    }

    public void setMaterializeTime(SearchBooleanField materializeTime) {
        this.materializeTime = materializeTime;
    }

    public SearchMultiSelectField getParent() {
        return this.parent;
    }

    public void setParent(SearchMultiSelectField parent) {
        this.parent = parent;
    }

    public SearchLongField getPctComplete() {
        return this.pctComplete;
    }

    public void setPctComplete(SearchLongField pctComplete) {
        this.pctComplete = pctComplete;
    }

    public SearchLongField getPercentTimeComplete() {
        return this.percentTimeComplete;
    }

    public void setPercentTimeComplete(SearchLongField percentTimeComplete) {
        this.percentTimeComplete = percentTimeComplete;
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

    public SearchDoubleField getPlannedWork() {
        return this.plannedWork;
    }

    public void setPlannedWork(SearchDoubleField plannedWork) {
        this.plannedWork = plannedWork;
    }

    public SearchDoubleField getPlannedWorkBaseline() {
        return this.plannedWorkBaseline;
    }

    public void setPlannedWorkBaseline(SearchDoubleField plannedWorkBaseline) {
        this.plannedWorkBaseline = plannedWorkBaseline;
    }

    public SearchDateField getProjectedEndDateBaseline() {
        return this.projectedEndDateBaseline;
    }

    public void setProjectedEndDateBaseline(SearchDateField projectedEndDateBaseline) {
        this.projectedEndDateBaseline = projectedEndDateBaseline;
    }

    public SearchMultiSelectField getProjectExpenseType() {
        return this.projectExpenseType;
    }

    public void setProjectExpenseType(SearchMultiSelectField projectExpenseType) {
        this.projectExpenseType = projectExpenseType;
    }

    public SearchMultiSelectField getProjectManager() {
        return this.projectManager;
    }

    public void setProjectManager(SearchMultiSelectField projectManager) {
        this.projectManager = projectManager;
    }

    public SearchMultiSelectField getRevRecForecastRule() {
        return this.revRecForecastRule;
    }

    public void setRevRecForecastRule(SearchMultiSelectField revRecForecastRule) {
        this.revRecForecastRule = revRecForecastRule;
    }

    public SearchDateField getScheduledEndDate() {
        return this.scheduledEndDate;
    }

    public void setScheduledEndDate(SearchDateField scheduledEndDate) {
        this.scheduledEndDate = scheduledEndDate;
    }

    public SearchEnumMultiSelectField getSchedulingMethod() {
        return this.schedulingMethod;
    }

    public void setSchedulingMethod(SearchEnumMultiSelectField schedulingMethod) {
        this.schedulingMethod = schedulingMethod;
    }

    public SearchBooleanField getSourceServiceItemFromRateCard() {
        return this.sourceServiceItemFromRateCard;
    }

    public void setSourceServiceItemFromRateCard(SearchBooleanField sourceServiceItemFromRateCard) {
        this.sourceServiceItemFromRateCard = sourceServiceItemFromRateCard;
    }

    public SearchDateField getStartDate() {
        return this.startDate;
    }

    public void setStartDate(SearchDateField startDate) {
        this.startDate = startDate;
    }

    public SearchDateField getStartDateBaseline() {
        return this.startDateBaseline;
    }

    public void setStartDateBaseline(SearchDateField startDateBaseline) {
        this.startDateBaseline = startDateBaseline;
    }

    public SearchStringField getState() {
        return this.state;
    }

    public void setState(SearchStringField state) {
        this.state = state;
    }

    public SearchMultiSelectField getStatus() {
        return this.status;
    }

    public void setStatus(SearchMultiSelectField status) {
        this.status = status;
    }

    public SearchMultiSelectField getSubsidiary() {
        return this.subsidiary;
    }

    public void setSubsidiary(SearchMultiSelectField subsidiary) {
        this.subsidiary = subsidiary;
    }

    public SearchMultiSelectField getTimeApproval() {
        return this.timeApproval;
    }

    public void setTimeApproval(SearchMultiSelectField timeApproval) {
        this.timeApproval = timeApproval;
    }

    public SearchDoubleField getTimeRemaining() {
        return this.timeRemaining;
    }

    public void setTimeRemaining(SearchDoubleField timeRemaining) {
        this.timeRemaining = timeRemaining;
    }

    public SearchMultiSelectField getType() {
        return this.type;
    }

    public void setType(SearchMultiSelectField type) {
        this.type = type;
    }

    public SearchBooleanField getUsePercentCompleteOverride() {
        return this.usePercentCompleteOverride;
    }

    public void setUsePercentCompleteOverride(SearchBooleanField usePercentCompleteOverride) {
        this.usePercentCompleteOverride = usePercentCompleteOverride;
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
        if (!(obj instanceof JobSearchBasic)) {
            return false;
        }
        JobSearchBasic other = (JobSearchBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.accountNumber == null && other.getAccountNumber() == null || this.accountNumber != null && this.accountNumber.equals(other.getAccountNumber())) && (this.actualTime == null && other.getActualTime() == null || this.actualTime != null && this.actualTime.equals(other.getActualTime())) && (this.address == null && other.getAddress() == null || this.address != null && this.address.equals(other.getAddress())) && (this.addressee == null && other.getAddressee() == null || this.addressee != null && this.addressee.equals(other.getAddressee())) && (this.addressLabel == null && other.getAddressLabel() == null || this.addressLabel != null && this.addressLabel.equals(other.getAddressLabel())) && (this.addressPhone == null && other.getAddressPhone() == null || this.addressPhone != null && this.addressPhone.equals(other.getAddressPhone())) && (this.allocatePayrollExpenses == null && other.getAllocatePayrollExpenses() == null || this.allocatePayrollExpenses != null && this.allocatePayrollExpenses.equals(other.getAllocatePayrollExpenses())) && (this.allowAllResourcesForTasks == null && other.getAllowAllResourcesForTasks() == null || this.allowAllResourcesForTasks != null && this.allowAllResourcesForTasks.equals(other.getAllowAllResourcesForTasks())) && (this.allowExpenses == null && other.getAllowExpenses() == null || this.allowExpenses != null && this.allowExpenses.equals(other.getAllowExpenses())) && (this.allowTime == null && other.getAllowTime() == null || this.allowTime != null && this.allowTime.equals(other.getAllowTime())) && (this.applyProjectExpenseTypeToAll == null && other.getApplyProjectExpenseTypeToAll() == null || this.applyProjectExpenseTypeToAll != null && this.applyProjectExpenseTypeToAll.equals(other.getApplyProjectExpenseTypeToAll())) && (this.attention == null && other.getAttention() == null || this.attention != null && this.attention.equals(other.getAttention())) && (this.billingRateCard == null && other.getBillingRateCard() == null || this.billingRateCard != null && this.billingRateCard.equals(other.getBillingRateCard())) && (this.billingSchedule == null && other.getBillingSchedule() == null || this.billingSchedule != null && this.billingSchedule.equals(other.getBillingSchedule())) && (this.calculatedEndDate == null && other.getCalculatedEndDate() == null || this.calculatedEndDate != null && this.calculatedEndDate.equals(other.getCalculatedEndDate())) && (this.calculatedEndDateBaseline == null && other.getCalculatedEndDateBaseline() == null || this.calculatedEndDateBaseline != null && this.calculatedEndDateBaseline.equals(other.getCalculatedEndDateBaseline())) && (this.calculatedStartDate == null && other.getCalculatedStartDate() == null || this.calculatedStartDate != null && this.calculatedStartDate.equals(other.getCalculatedStartDate())) && (this.category == null && other.getCategory() == null || this.category != null && this.category.equals(other.getCategory())) && (this.city == null && other.getCity() == null || this.city != null && this.city.equals(other.getCity())) && (this.comments == null && other.getComments() == null || this.comments != null && this.comments.equals(other.getComments())) && (this.contact == null && other.getContact() == null || this.contact != null && this.contact.equals(other.getContact())) && (this.country == null && other.getCountry() == null || this.country != null && this.country.equals(other.getCountry())) && (this.county == null && other.getCounty() == null || this.county != null && this.county.equals(other.getCounty())) && (this.customer == null && other.getCustomer() == null || this.customer != null && this.customer.equals(other.getCustomer())) && (this.dateCreated == null && other.getDateCreated() == null || this.dateCreated != null && this.dateCreated.equals(other.getDateCreated())) && (this.defaultTaxReg == null && other.getDefaultTaxReg() == null || this.defaultTaxReg != null && this.defaultTaxReg.equals(other.getDefaultTaxReg())) && (this.defaultTaxRegText == null && other.getDefaultTaxRegText() == null || this.defaultTaxRegText != null && this.defaultTaxRegText.equals(other.getDefaultTaxRegText())) && (this.email == null && other.getEmail() == null || this.email != null && this.email.equals(other.getEmail())) && (this.endDate == null && other.getEndDate() == null || this.endDate != null && this.endDate.equals(other.getEndDate())) && (this.entityId == null && other.getEntityId() == null || this.entityId != null && this.entityId.equals(other.getEntityId())) && (this.estCost == null && other.getEstCost() == null || this.estCost != null && this.estCost.equals(other.getEstCost())) && (this.estEndDate == null && other.getEstEndDate() == null || this.estEndDate != null && this.estEndDate.equals(other.getEstEndDate())) && (this.estimatedGrossProfit == null && other.getEstimatedGrossProfit() == null || this.estimatedGrossProfit != null && this.estimatedGrossProfit.equals(other.getEstimatedGrossProfit())) && (this.estimatedGrossProfitPercent == null && other.getEstimatedGrossProfitPercent() == null || this.estimatedGrossProfitPercent != null && this.estimatedGrossProfitPercent.equals(other.getEstimatedGrossProfitPercent())) && (this.estimatedLaborCost == null && other.getEstimatedLaborCost() == null || this.estimatedLaborCost != null && this.estimatedLaborCost.equals(other.getEstimatedLaborCost())) && (this.estimatedLaborCostBaseline == null && other.getEstimatedLaborCostBaseline() == null || this.estimatedLaborCostBaseline != null && this.estimatedLaborCostBaseline.equals(other.getEstimatedLaborCostBaseline())) && (this.estimatedLaborRevenue == null && other.getEstimatedLaborRevenue() == null || this.estimatedLaborRevenue != null && this.estimatedLaborRevenue.equals(other.getEstimatedLaborRevenue())) && (this.estimatedTime == null && other.getEstimatedTime() == null || this.estimatedTime != null && this.estimatedTime.equals(other.getEstimatedTime())) && (this.estimatedTimeOverride == null && other.getEstimatedTimeOverride() == null || this.estimatedTimeOverride != null && this.estimatedTimeOverride.equals(other.getEstimatedTimeOverride())) && (this.estimatedTimeOverrideBaseline == null && other.getEstimatedTimeOverrideBaseline() == null || this.estimatedTimeOverrideBaseline != null && this.estimatedTimeOverrideBaseline.equals(other.getEstimatedTimeOverrideBaseline())) && (this.estRevenue == null && other.getEstRevenue() == null || this.estRevenue != null && this.estRevenue.equals(other.getEstRevenue())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId())) && (this.externalIdString == null && other.getExternalIdString() == null || this.externalIdString != null && this.externalIdString.equals(other.getExternalIdString())) && (this.fax == null && other.getFax() == null || this.fax != null && this.fax.equals(other.getFax())) && (this.giveAccess == null && other.getGiveAccess() == null || this.giveAccess != null && this.giveAccess.equals(other.getGiveAccess())) && (this.globalSubscriptionStatus == null && other.getGlobalSubscriptionStatus() == null || this.globalSubscriptionStatus != null && this.globalSubscriptionStatus.equals(other.getGlobalSubscriptionStatus())) && (this.image == null && other.getImage() == null || this.image != null && this.image.equals(other.getImage())) && (this.includeCrmTasksInTotals == null && other.getIncludeCrmTasksInTotals() == null || this.includeCrmTasksInTotals != null && this.includeCrmTasksInTotals.equals(other.getIncludeCrmTasksInTotals())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.internalIdNumber == null && other.getInternalIdNumber() == null || this.internalIdNumber != null && this.internalIdNumber.equals(other.getInternalIdNumber())) && (this.isDefaultBilling == null && other.getIsDefaultBilling() == null || this.isDefaultBilling != null && this.isDefaultBilling.equals(other.getIsDefaultBilling())) && (this.isDefaultShipping == null && other.getIsDefaultShipping() == null || this.isDefaultShipping != null && this.isDefaultShipping.equals(other.getIsDefaultShipping())) && (this.isExemptTime == null && other.getIsExemptTime() == null || this.isExemptTime != null && this.isExemptTime.equals(other.getIsExemptTime())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && this.isInactive.equals(other.getIsInactive())) && (this.isProductiveTime == null && other.getIsProductiveTime() == null || this.isProductiveTime != null && this.isProductiveTime.equals(other.getIsProductiveTime())) && (this.isUtilizedTime == null && other.getIsUtilizedTime() == null || this.isUtilizedTime != null && this.isUtilizedTime.equals(other.getIsUtilizedTime())) && (this.jobBillingType == null && other.getJobBillingType() == null || this.jobBillingType != null && this.jobBillingType.equals(other.getJobBillingType())) && (this.jobItem == null && other.getJobItem() == null || this.jobItem != null && this.jobItem.equals(other.getJobItem())) && (this.jobPrice == null && other.getJobPrice() == null || this.jobPrice != null && this.jobPrice.equals(other.getJobPrice())) && (this.jobResource == null && other.getJobResource() == null || this.jobResource != null && this.jobResource.equals(other.getJobResource())) && (this.jobResourceRole == null && other.getJobResourceRole() == null || this.jobResourceRole != null && this.jobResourceRole.equals(other.getJobResourceRole())) && (this.language == null && other.getLanguage() == null || this.language != null && this.language.equals(other.getLanguage())) && (this.lastBaselineDate == null && other.getLastBaselineDate() == null || this.lastBaselineDate != null && this.lastBaselineDate.equals(other.getLastBaselineDate())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && this.lastModifiedDate.equals(other.getLastModifiedDate())) && (this.level == null && other.getLevel() == null || this.level != null && this.level.equals(other.getLevel())) && (this.limitTimeToAssignees == null && other.getLimitTimeToAssignees() == null || this.limitTimeToAssignees != null && this.limitTimeToAssignees.equals(other.getLimitTimeToAssignees())) && (this.materializeTime == null && other.getMaterializeTime() == null || this.materializeTime != null && this.materializeTime.equals(other.getMaterializeTime())) && (this.parent == null && other.getParent() == null || this.parent != null && this.parent.equals(other.getParent())) && (this.pctComplete == null && other.getPctComplete() == null || this.pctComplete != null && this.pctComplete.equals(other.getPctComplete())) && (this.percentTimeComplete == null && other.getPercentTimeComplete() == null || this.percentTimeComplete != null && this.percentTimeComplete.equals(other.getPercentTimeComplete())) && (this.permission == null && other.getPermission() == null || this.permission != null && this.permission.equals(other.getPermission())) && (this.phone == null && other.getPhone() == null || this.phone != null && this.phone.equals(other.getPhone())) && (this.phoneticName == null && other.getPhoneticName() == null || this.phoneticName != null && this.phoneticName.equals(other.getPhoneticName())) && (this.plannedWork == null && other.getPlannedWork() == null || this.plannedWork != null && this.plannedWork.equals(other.getPlannedWork())) && (this.plannedWorkBaseline == null && other.getPlannedWorkBaseline() == null || this.plannedWorkBaseline != null && this.plannedWorkBaseline.equals(other.getPlannedWorkBaseline())) && (this.projectedEndDateBaseline == null && other.getProjectedEndDateBaseline() == null || this.projectedEndDateBaseline != null && this.projectedEndDateBaseline.equals(other.getProjectedEndDateBaseline())) && (this.projectExpenseType == null && other.getProjectExpenseType() == null || this.projectExpenseType != null && this.projectExpenseType.equals(other.getProjectExpenseType())) && (this.projectManager == null && other.getProjectManager() == null || this.projectManager != null && this.projectManager.equals(other.getProjectManager())) && (this.revRecForecastRule == null && other.getRevRecForecastRule() == null || this.revRecForecastRule != null && this.revRecForecastRule.equals(other.getRevRecForecastRule())) && (this.scheduledEndDate == null && other.getScheduledEndDate() == null || this.scheduledEndDate != null && this.scheduledEndDate.equals(other.getScheduledEndDate())) && (this.schedulingMethod == null && other.getSchedulingMethod() == null || this.schedulingMethod != null && this.schedulingMethod.equals(other.getSchedulingMethod())) && (this.sourceServiceItemFromRateCard == null && other.getSourceServiceItemFromRateCard() == null || this.sourceServiceItemFromRateCard != null && this.sourceServiceItemFromRateCard.equals(other.getSourceServiceItemFromRateCard())) && (this.startDate == null && other.getStartDate() == null || this.startDate != null && this.startDate.equals(other.getStartDate())) && (this.startDateBaseline == null && other.getStartDateBaseline() == null || this.startDateBaseline != null && this.startDateBaseline.equals(other.getStartDateBaseline())) && (this.state == null && other.getState() == null || this.state != null && this.state.equals(other.getState())) && (this.status == null && other.getStatus() == null || this.status != null && this.status.equals(other.getStatus())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && this.subsidiary.equals(other.getSubsidiary())) && (this.timeApproval == null && other.getTimeApproval() == null || this.timeApproval != null && this.timeApproval.equals(other.getTimeApproval())) && (this.timeRemaining == null && other.getTimeRemaining() == null || this.timeRemaining != null && this.timeRemaining.equals(other.getTimeRemaining())) && (this.type == null && other.getType() == null || this.type != null && this.type.equals(other.getType())) && (this.usePercentCompleteOverride == null && other.getUsePercentCompleteOverride() == null || this.usePercentCompleteOverride != null && this.usePercentCompleteOverride.equals(other.getUsePercentCompleteOverride())) && (this.zipCode == null && other.getZipCode() == null || this.zipCode != null && this.zipCode.equals(other.getZipCode())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
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
        if (this.getActualTime() != null) {
            _hashCode += this.getActualTime().hashCode();
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
        if (this.getAllocatePayrollExpenses() != null) {
            _hashCode += this.getAllocatePayrollExpenses().hashCode();
        }
        if (this.getAllowAllResourcesForTasks() != null) {
            _hashCode += this.getAllowAllResourcesForTasks().hashCode();
        }
        if (this.getAllowExpenses() != null) {
            _hashCode += this.getAllowExpenses().hashCode();
        }
        if (this.getAllowTime() != null) {
            _hashCode += this.getAllowTime().hashCode();
        }
        if (this.getApplyProjectExpenseTypeToAll() != null) {
            _hashCode += this.getApplyProjectExpenseTypeToAll().hashCode();
        }
        if (this.getAttention() != null) {
            _hashCode += this.getAttention().hashCode();
        }
        if (this.getBillingRateCard() != null) {
            _hashCode += this.getBillingRateCard().hashCode();
        }
        if (this.getBillingSchedule() != null) {
            _hashCode += this.getBillingSchedule().hashCode();
        }
        if (this.getCalculatedEndDate() != null) {
            _hashCode += this.getCalculatedEndDate().hashCode();
        }
        if (this.getCalculatedEndDateBaseline() != null) {
            _hashCode += this.getCalculatedEndDateBaseline().hashCode();
        }
        if (this.getCalculatedStartDate() != null) {
            _hashCode += this.getCalculatedStartDate().hashCode();
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
        if (this.getCustomer() != null) {
            _hashCode += this.getCustomer().hashCode();
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
        if (this.getEmail() != null) {
            _hashCode += this.getEmail().hashCode();
        }
        if (this.getEndDate() != null) {
            _hashCode += this.getEndDate().hashCode();
        }
        if (this.getEntityId() != null) {
            _hashCode += this.getEntityId().hashCode();
        }
        if (this.getEstCost() != null) {
            _hashCode += this.getEstCost().hashCode();
        }
        if (this.getEstEndDate() != null) {
            _hashCode += this.getEstEndDate().hashCode();
        }
        if (this.getEstimatedGrossProfit() != null) {
            _hashCode += this.getEstimatedGrossProfit().hashCode();
        }
        if (this.getEstimatedGrossProfitPercent() != null) {
            _hashCode += this.getEstimatedGrossProfitPercent().hashCode();
        }
        if (this.getEstimatedLaborCost() != null) {
            _hashCode += this.getEstimatedLaborCost().hashCode();
        }
        if (this.getEstimatedLaborCostBaseline() != null) {
            _hashCode += this.getEstimatedLaborCostBaseline().hashCode();
        }
        if (this.getEstimatedLaborRevenue() != null) {
            _hashCode += this.getEstimatedLaborRevenue().hashCode();
        }
        if (this.getEstimatedTime() != null) {
            _hashCode += this.getEstimatedTime().hashCode();
        }
        if (this.getEstimatedTimeOverride() != null) {
            _hashCode += this.getEstimatedTimeOverride().hashCode();
        }
        if (this.getEstimatedTimeOverrideBaseline() != null) {
            _hashCode += this.getEstimatedTimeOverrideBaseline().hashCode();
        }
        if (this.getEstRevenue() != null) {
            _hashCode += this.getEstRevenue().hashCode();
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
        if (this.getGiveAccess() != null) {
            _hashCode += this.getGiveAccess().hashCode();
        }
        if (this.getGlobalSubscriptionStatus() != null) {
            _hashCode += this.getGlobalSubscriptionStatus().hashCode();
        }
        if (this.getImage() != null) {
            _hashCode += this.getImage().hashCode();
        }
        if (this.getIncludeCrmTasksInTotals() != null) {
            _hashCode += this.getIncludeCrmTasksInTotals().hashCode();
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
        if (this.getIsExemptTime() != null) {
            _hashCode += this.getIsExemptTime().hashCode();
        }
        if (this.getIsInactive() != null) {
            _hashCode += this.getIsInactive().hashCode();
        }
        if (this.getIsProductiveTime() != null) {
            _hashCode += this.getIsProductiveTime().hashCode();
        }
        if (this.getIsUtilizedTime() != null) {
            _hashCode += this.getIsUtilizedTime().hashCode();
        }
        if (this.getJobBillingType() != null) {
            _hashCode += this.getJobBillingType().hashCode();
        }
        if (this.getJobItem() != null) {
            _hashCode += this.getJobItem().hashCode();
        }
        if (this.getJobPrice() != null) {
            _hashCode += this.getJobPrice().hashCode();
        }
        if (this.getJobResource() != null) {
            _hashCode += this.getJobResource().hashCode();
        }
        if (this.getJobResourceRole() != null) {
            _hashCode += this.getJobResourceRole().hashCode();
        }
        if (this.getLanguage() != null) {
            _hashCode += this.getLanguage().hashCode();
        }
        if (this.getLastBaselineDate() != null) {
            _hashCode += this.getLastBaselineDate().hashCode();
        }
        if (this.getLastModifiedDate() != null) {
            _hashCode += this.getLastModifiedDate().hashCode();
        }
        if (this.getLevel() != null) {
            _hashCode += this.getLevel().hashCode();
        }
        if (this.getLimitTimeToAssignees() != null) {
            _hashCode += this.getLimitTimeToAssignees().hashCode();
        }
        if (this.getMaterializeTime() != null) {
            _hashCode += this.getMaterializeTime().hashCode();
        }
        if (this.getParent() != null) {
            _hashCode += this.getParent().hashCode();
        }
        if (this.getPctComplete() != null) {
            _hashCode += this.getPctComplete().hashCode();
        }
        if (this.getPercentTimeComplete() != null) {
            _hashCode += this.getPercentTimeComplete().hashCode();
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
        if (this.getPlannedWork() != null) {
            _hashCode += this.getPlannedWork().hashCode();
        }
        if (this.getPlannedWorkBaseline() != null) {
            _hashCode += this.getPlannedWorkBaseline().hashCode();
        }
        if (this.getProjectedEndDateBaseline() != null) {
            _hashCode += this.getProjectedEndDateBaseline().hashCode();
        }
        if (this.getProjectExpenseType() != null) {
            _hashCode += this.getProjectExpenseType().hashCode();
        }
        if (this.getProjectManager() != null) {
            _hashCode += this.getProjectManager().hashCode();
        }
        if (this.getRevRecForecastRule() != null) {
            _hashCode += this.getRevRecForecastRule().hashCode();
        }
        if (this.getScheduledEndDate() != null) {
            _hashCode += this.getScheduledEndDate().hashCode();
        }
        if (this.getSchedulingMethod() != null) {
            _hashCode += this.getSchedulingMethod().hashCode();
        }
        if (this.getSourceServiceItemFromRateCard() != null) {
            _hashCode += this.getSourceServiceItemFromRateCard().hashCode();
        }
        if (this.getStartDate() != null) {
            _hashCode += this.getStartDate().hashCode();
        }
        if (this.getStartDateBaseline() != null) {
            _hashCode += this.getStartDateBaseline().hashCode();
        }
        if (this.getState() != null) {
            _hashCode += this.getState().hashCode();
        }
        if (this.getStatus() != null) {
            _hashCode += this.getStatus().hashCode();
        }
        if (this.getSubsidiary() != null) {
            _hashCode += this.getSubsidiary().hashCode();
        }
        if (this.getTimeApproval() != null) {
            _hashCode += this.getTimeApproval().hashCode();
        }
        if (this.getTimeRemaining() != null) {
            _hashCode += this.getTimeRemaining().hashCode();
        }
        if (this.getType() != null) {
            _hashCode += this.getType().hashCode();
        }
        if (this.getUsePercentCompleteOverride() != null) {
            _hashCode += this.getUsePercentCompleteOverride().hashCode();
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "JobSearchBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "accountNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("actualTime");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "actualTime"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
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
        elemField.setFieldName("allocatePayrollExpenses");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "allocatePayrollExpenses"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("allowAllResourcesForTasks");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "allowAllResourcesForTasks"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("allowExpenses");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "allowExpenses"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("allowTime");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "allowTime"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("applyProjectExpenseTypeToAll");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "applyProjectExpenseTypeToAll"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("billingRateCard");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billingRateCard"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billingSchedule");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billingSchedule"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("calculatedEndDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "calculatedEndDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("calculatedEndDateBaseline");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "calculatedEndDateBaseline"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("calculatedStartDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "calculatedStartDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
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
        elemField.setFieldName("customer");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "customer"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("email");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "email"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
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
        elemField.setFieldName("estCost");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "estCost"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("estEndDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "estEndDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("estimatedGrossProfit");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "estimatedGrossProfit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("estimatedGrossProfitPercent");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "estimatedGrossProfitPercent"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("estimatedLaborCost");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "estimatedLaborCost"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("estimatedLaborCostBaseline");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "estimatedLaborCostBaseline"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("estimatedLaborRevenue");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "estimatedLaborRevenue"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("estimatedTime");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "estimatedTime"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("estimatedTimeOverride");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "estimatedTimeOverride"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("estimatedTimeOverrideBaseline");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "estimatedTimeOverrideBaseline"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("estRevenue");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "estRevenue"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
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
        elemField.setFieldName("image");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "image"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("includeCrmTasksInTotals");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "includeCrmTasksInTotals"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("isExemptTime");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isExemptTime"));
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
        elemField.setFieldName("isProductiveTime");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isProductiveTime"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isUtilizedTime");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isUtilizedTime"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("jobBillingType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "jobBillingType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("jobItem");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "jobItem"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("jobPrice");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "jobPrice"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("jobResource");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "jobResource"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("jobResourceRole");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "jobResourceRole"));
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
        elemField.setFieldName("lastBaselineDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lastBaselineDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
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
        elemField.setFieldName("level");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "level"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("limitTimeToAssignees");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "limitTimeToAssignees"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("materializeTime");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "materializeTime"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("pctComplete");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "pctComplete"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("percentTimeComplete");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "percentTimeComplete"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
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
        elemField.setFieldName("plannedWork");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "plannedWork"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("plannedWorkBaseline");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "plannedWorkBaseline"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("projectedEndDateBaseline");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "projectedEndDateBaseline"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("projectExpenseType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "projectExpenseType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("projectManager");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "projectManager"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revRecForecastRule");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "revRecForecastRule"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("scheduledEndDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "scheduledEndDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("schedulingMethod");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "schedulingMethod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("sourceServiceItemFromRateCard");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "sourceServiceItemFromRateCard"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("startDateBaseline");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "startDateBaseline"));
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
        elemField.setFieldName("status");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "status"));
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
        elemField.setFieldName("timeApproval");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "timeApproval"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("timeRemaining");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "timeRemaining"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "type"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("usePercentCompleteOverride");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "usePercentCompleteOverride"));
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

