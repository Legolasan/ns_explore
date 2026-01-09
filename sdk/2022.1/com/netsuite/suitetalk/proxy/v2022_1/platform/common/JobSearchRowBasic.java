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

public class JobSearchRowBasic
extends SearchRowBasic
implements Serializable {
    private SearchColumnStringField[] accountNumber;
    private SearchColumnDoubleField[] actualTime;
    private SearchColumnStringField[] address;
    private SearchColumnStringField[] address1;
    private SearchColumnStringField[] address2;
    private SearchColumnStringField[] address3;
    private SearchColumnStringField[] addressee;
    private SearchColumnStringField[] addressInternalId;
    private SearchColumnStringField[] addressLabel;
    private SearchColumnStringField[] addressPhone;
    private SearchColumnBooleanField[] allocatePayrollExpenses;
    private SearchColumnBooleanField[] allowAllResourcesForTasks;
    private SearchColumnBooleanField[] allowExpenses;
    private SearchColumnBooleanField[] allowTime;
    private SearchColumnStringField[] altContact;
    private SearchColumnStringField[] altEmail;
    private SearchColumnStringField[] altName;
    private SearchColumnStringField[] altPhone;
    private SearchColumnStringField[] attention;
    private SearchColumnStringField[] billAddress1;
    private SearchColumnStringField[] billAddress2;
    private SearchColumnStringField[] billAddress3;
    private SearchColumnStringField[] billAddressee;
    private SearchColumnStringField[] billAttention;
    private SearchColumnStringField[] billCity;
    private SearchColumnEnumSelectField[] billCountry;
    private SearchColumnStringField[] billCountryCode;
    private SearchColumnSelectField[] billingRateCard;
    private SearchColumnSelectField[] billingSchedule;
    private SearchColumnStringField[] billPhone;
    private SearchColumnStringField[] billState;
    private SearchColumnStringField[] billZipCode;
    private SearchColumnDateField[] calculatedEndDate;
    private SearchColumnDateField[] calculatedEndDateBaseline;
    private SearchColumnDateField[] calculatedStartDate;
    private SearchColumnSelectField[] category;
    private SearchColumnStringField[] city;
    private SearchColumnStringField[] comments;
    private SearchColumnStringField[] companyName;
    private SearchColumnStringField[] contact;
    private SearchColumnEnumSelectField[] country;
    private SearchColumnStringField[] countryCode;
    private SearchColumnSelectField[] customer;
    private SearchColumnDateField[] dateCreated;
    private SearchColumnStringField[] defaultTaxReg;
    private SearchColumnStringField[] email;
    private SearchColumnDateField[] endDate;
    private SearchColumnStringField[] entityId;
    private SearchColumnLongField[] entityNumber;
    private SearchColumnSelectField[] entityStatus;
    private SearchColumnDoubleField[] estimatedCost;
    private SearchColumnDoubleField[] estimatedGrossProfit;
    private SearchColumnDoubleField[] estimatedGrossProfitPercent;
    private SearchColumnDoubleField[] estimatedLaborCost;
    private SearchColumnDoubleField[] estimatedLaborCostBaseline;
    private SearchColumnDoubleField[] estimatedLaborRevenue;
    private SearchColumnDoubleField[] estimatedRevenue;
    private SearchColumnDoubleField[] estimatedTime;
    private SearchColumnDoubleField[] estimatedTimeOverride;
    private SearchColumnDoubleField[] estimatedTimeOverrideBaseline;
    private SearchColumnSelectField[] externalId;
    private SearchColumnStringField[] fax;
    private SearchColumnEnumSelectField[] globalSubscriptionStatus;
    private SearchColumnSelectField[] image;
    private SearchColumnBooleanField[] includeCrmTasksInTotals;
    private SearchColumnSelectField[] internalId;
    private SearchColumnBooleanField[] isDefaultBilling;
    private SearchColumnBooleanField[] isDefaultShipping;
    private SearchColumnBooleanField[] isExemptTime;
    private SearchColumnBooleanField[] isInactive;
    private SearchColumnBooleanField[] isProductiveTime;
    private SearchColumnBooleanField[] isUtilizedTime;
    private SearchColumnEnumSelectField[] jobBillingType;
    private SearchColumnSelectField[] jobItem;
    private SearchColumnDoubleField[] jobPrice;
    private SearchColumnSelectField[] jobResource;
    private SearchColumnSelectField[] jobResourceRole;
    private SearchColumnEnumSelectField[] language;
    private SearchColumnDateField[] lastBaselineDate;
    private SearchColumnDateField[] lastModifiedDate;
    private SearchColumnEnumSelectField[] level;
    private SearchColumnBooleanField[] limitTimeToAssignees;
    private SearchColumnBooleanField[] materializeTime;
    private SearchColumnDoubleField[] percentComplete;
    private SearchColumnDoubleField[] percentTimeComplete;
    private SearchColumnEnumSelectField[] permission;
    private SearchColumnStringField[] phone;
    private SearchColumnStringField[] phoneticName;
    private SearchColumnDoubleField[] plannedWork;
    private SearchColumnDoubleField[] plannedWorkBaseline;
    private SearchColumnDateField[] projectedEndDate;
    private SearchColumnDateField[] projectedEndDateBaseline;
    private SearchColumnSelectField[] projectExpenseType;
    private SearchColumnSelectField[] projectManager;
    private SearchColumnSelectField[] revRecForecastRule;
    private SearchColumnDateField[] scheduledEndDate;
    private SearchColumnEnumSelectField[] schedulingMethod;
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
    private SearchColumnBooleanField[] sourceServiceItemFromRateCard;
    private SearchColumnDateField[] startDate;
    private SearchColumnDateField[] startDateBaseline;
    private SearchColumnStringField[] state;
    private SearchColumnSelectField[] subscription;
    private SearchColumnDateField[] subscriptionDate;
    private SearchColumnBooleanField[] subscriptionStatus;
    private SearchColumnSelectField[] subsidiary;
    private SearchColumnSelectField[] timeApproval;
    private SearchColumnDoubleField[] timeRemaining;
    private SearchColumnBooleanField[] usePercentCompleteOverride;
    private SearchColumnStringField[] zipCode;
    private SearchColumnCustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(JobSearchRowBasic.class, true);

    public JobSearchRowBasic() {
    }

    public JobSearchRowBasic(SearchColumnStringField[] accountNumber, SearchColumnDoubleField[] actualTime, SearchColumnStringField[] address, SearchColumnStringField[] address1, SearchColumnStringField[] address2, SearchColumnStringField[] address3, SearchColumnStringField[] addressee, SearchColumnStringField[] addressInternalId, SearchColumnStringField[] addressLabel, SearchColumnStringField[] addressPhone, SearchColumnBooleanField[] allocatePayrollExpenses, SearchColumnBooleanField[] allowAllResourcesForTasks, SearchColumnBooleanField[] allowExpenses, SearchColumnBooleanField[] allowTime, SearchColumnStringField[] altContact, SearchColumnStringField[] altEmail, SearchColumnStringField[] altName, SearchColumnStringField[] altPhone, SearchColumnStringField[] attention, SearchColumnStringField[] billAddress1, SearchColumnStringField[] billAddress2, SearchColumnStringField[] billAddress3, SearchColumnStringField[] billAddressee, SearchColumnStringField[] billAttention, SearchColumnStringField[] billCity, SearchColumnEnumSelectField[] billCountry, SearchColumnStringField[] billCountryCode, SearchColumnSelectField[] billingRateCard, SearchColumnSelectField[] billingSchedule, SearchColumnStringField[] billPhone, SearchColumnStringField[] billState, SearchColumnStringField[] billZipCode, SearchColumnDateField[] calculatedEndDate, SearchColumnDateField[] calculatedEndDateBaseline, SearchColumnDateField[] calculatedStartDate, SearchColumnSelectField[] category, SearchColumnStringField[] city, SearchColumnStringField[] comments, SearchColumnStringField[] companyName, SearchColumnStringField[] contact, SearchColumnEnumSelectField[] country, SearchColumnStringField[] countryCode, SearchColumnSelectField[] customer, SearchColumnDateField[] dateCreated, SearchColumnStringField[] defaultTaxReg, SearchColumnStringField[] email, SearchColumnDateField[] endDate, SearchColumnStringField[] entityId, SearchColumnLongField[] entityNumber, SearchColumnSelectField[] entityStatus, SearchColumnDoubleField[] estimatedCost, SearchColumnDoubleField[] estimatedGrossProfit, SearchColumnDoubleField[] estimatedGrossProfitPercent, SearchColumnDoubleField[] estimatedLaborCost, SearchColumnDoubleField[] estimatedLaborCostBaseline, SearchColumnDoubleField[] estimatedLaborRevenue, SearchColumnDoubleField[] estimatedRevenue, SearchColumnDoubleField[] estimatedTime, SearchColumnDoubleField[] estimatedTimeOverride, SearchColumnDoubleField[] estimatedTimeOverrideBaseline, SearchColumnSelectField[] externalId, SearchColumnStringField[] fax, SearchColumnEnumSelectField[] globalSubscriptionStatus, SearchColumnSelectField[] image, SearchColumnBooleanField[] includeCrmTasksInTotals, SearchColumnSelectField[] internalId, SearchColumnBooleanField[] isDefaultBilling, SearchColumnBooleanField[] isDefaultShipping, SearchColumnBooleanField[] isExemptTime, SearchColumnBooleanField[] isInactive, SearchColumnBooleanField[] isProductiveTime, SearchColumnBooleanField[] isUtilizedTime, SearchColumnEnumSelectField[] jobBillingType, SearchColumnSelectField[] jobItem, SearchColumnDoubleField[] jobPrice, SearchColumnSelectField[] jobResource, SearchColumnSelectField[] jobResourceRole, SearchColumnEnumSelectField[] language, SearchColumnDateField[] lastBaselineDate, SearchColumnDateField[] lastModifiedDate, SearchColumnEnumSelectField[] level, SearchColumnBooleanField[] limitTimeToAssignees, SearchColumnBooleanField[] materializeTime, SearchColumnDoubleField[] percentComplete, SearchColumnDoubleField[] percentTimeComplete, SearchColumnEnumSelectField[] permission, SearchColumnStringField[] phone, SearchColumnStringField[] phoneticName, SearchColumnDoubleField[] plannedWork, SearchColumnDoubleField[] plannedWorkBaseline, SearchColumnDateField[] projectedEndDate, SearchColumnDateField[] projectedEndDateBaseline, SearchColumnSelectField[] projectExpenseType, SearchColumnSelectField[] projectManager, SearchColumnSelectField[] revRecForecastRule, SearchColumnDateField[] scheduledEndDate, SearchColumnEnumSelectField[] schedulingMethod, SearchColumnStringField[] shipAddress1, SearchColumnStringField[] shipAddress2, SearchColumnStringField[] shipAddress3, SearchColumnStringField[] shipAddressee, SearchColumnStringField[] shipAttention, SearchColumnStringField[] shipCity, SearchColumnEnumSelectField[] shipCountry, SearchColumnStringField[] shipCountryCode, SearchColumnStringField[] shipPhone, SearchColumnStringField[] shipState, SearchColumnStringField[] shipZip, SearchColumnBooleanField[] sourceServiceItemFromRateCard, SearchColumnDateField[] startDate, SearchColumnDateField[] startDateBaseline, SearchColumnStringField[] state, SearchColumnSelectField[] subscription, SearchColumnDateField[] subscriptionDate, SearchColumnBooleanField[] subscriptionStatus, SearchColumnSelectField[] subsidiary, SearchColumnSelectField[] timeApproval, SearchColumnDoubleField[] timeRemaining, SearchColumnBooleanField[] usePercentCompleteOverride, SearchColumnStringField[] zipCode, SearchColumnCustomFieldList customFieldList) {
        this.accountNumber = accountNumber;
        this.actualTime = actualTime;
        this.address = address;
        this.address1 = address1;
        this.address2 = address2;
        this.address3 = address3;
        this.addressee = addressee;
        this.addressInternalId = addressInternalId;
        this.addressLabel = addressLabel;
        this.addressPhone = addressPhone;
        this.allocatePayrollExpenses = allocatePayrollExpenses;
        this.allowAllResourcesForTasks = allowAllResourcesForTasks;
        this.allowExpenses = allowExpenses;
        this.allowTime = allowTime;
        this.altContact = altContact;
        this.altEmail = altEmail;
        this.altName = altName;
        this.altPhone = altPhone;
        this.attention = attention;
        this.billAddress1 = billAddress1;
        this.billAddress2 = billAddress2;
        this.billAddress3 = billAddress3;
        this.billAddressee = billAddressee;
        this.billAttention = billAttention;
        this.billCity = billCity;
        this.billCountry = billCountry;
        this.billCountryCode = billCountryCode;
        this.billingRateCard = billingRateCard;
        this.billingSchedule = billingSchedule;
        this.billPhone = billPhone;
        this.billState = billState;
        this.billZipCode = billZipCode;
        this.calculatedEndDate = calculatedEndDate;
        this.calculatedEndDateBaseline = calculatedEndDateBaseline;
        this.calculatedStartDate = calculatedStartDate;
        this.category = category;
        this.city = city;
        this.comments = comments;
        this.companyName = companyName;
        this.contact = contact;
        this.country = country;
        this.countryCode = countryCode;
        this.customer = customer;
        this.dateCreated = dateCreated;
        this.defaultTaxReg = defaultTaxReg;
        this.email = email;
        this.endDate = endDate;
        this.entityId = entityId;
        this.entityNumber = entityNumber;
        this.entityStatus = entityStatus;
        this.estimatedCost = estimatedCost;
        this.estimatedGrossProfit = estimatedGrossProfit;
        this.estimatedGrossProfitPercent = estimatedGrossProfitPercent;
        this.estimatedLaborCost = estimatedLaborCost;
        this.estimatedLaborCostBaseline = estimatedLaborCostBaseline;
        this.estimatedLaborRevenue = estimatedLaborRevenue;
        this.estimatedRevenue = estimatedRevenue;
        this.estimatedTime = estimatedTime;
        this.estimatedTimeOverride = estimatedTimeOverride;
        this.estimatedTimeOverrideBaseline = estimatedTimeOverrideBaseline;
        this.externalId = externalId;
        this.fax = fax;
        this.globalSubscriptionStatus = globalSubscriptionStatus;
        this.image = image;
        this.includeCrmTasksInTotals = includeCrmTasksInTotals;
        this.internalId = internalId;
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
        this.percentComplete = percentComplete;
        this.percentTimeComplete = percentTimeComplete;
        this.permission = permission;
        this.phone = phone;
        this.phoneticName = phoneticName;
        this.plannedWork = plannedWork;
        this.plannedWorkBaseline = plannedWorkBaseline;
        this.projectedEndDate = projectedEndDate;
        this.projectedEndDateBaseline = projectedEndDateBaseline;
        this.projectExpenseType = projectExpenseType;
        this.projectManager = projectManager;
        this.revRecForecastRule = revRecForecastRule;
        this.scheduledEndDate = scheduledEndDate;
        this.schedulingMethod = schedulingMethod;
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
        this.sourceServiceItemFromRateCard = sourceServiceItemFromRateCard;
        this.startDate = startDate;
        this.startDateBaseline = startDateBaseline;
        this.state = state;
        this.subscription = subscription;
        this.subscriptionDate = subscriptionDate;
        this.subscriptionStatus = subscriptionStatus;
        this.subsidiary = subsidiary;
        this.timeApproval = timeApproval;
        this.timeRemaining = timeRemaining;
        this.usePercentCompleteOverride = usePercentCompleteOverride;
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

    public SearchColumnDoubleField[] getActualTime() {
        return this.actualTime;
    }

    public void setActualTime(SearchColumnDoubleField[] actualTime) {
        this.actualTime = actualTime;
    }

    public SearchColumnDoubleField getActualTime(int i) {
        return this.actualTime[i];
    }

    public void setActualTime(int i, SearchColumnDoubleField _value) {
        this.actualTime[i] = _value;
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

    public SearchColumnBooleanField[] getAllocatePayrollExpenses() {
        return this.allocatePayrollExpenses;
    }

    public void setAllocatePayrollExpenses(SearchColumnBooleanField[] allocatePayrollExpenses) {
        this.allocatePayrollExpenses = allocatePayrollExpenses;
    }

    public SearchColumnBooleanField getAllocatePayrollExpenses(int i) {
        return this.allocatePayrollExpenses[i];
    }

    public void setAllocatePayrollExpenses(int i, SearchColumnBooleanField _value) {
        this.allocatePayrollExpenses[i] = _value;
    }

    public SearchColumnBooleanField[] getAllowAllResourcesForTasks() {
        return this.allowAllResourcesForTasks;
    }

    public void setAllowAllResourcesForTasks(SearchColumnBooleanField[] allowAllResourcesForTasks) {
        this.allowAllResourcesForTasks = allowAllResourcesForTasks;
    }

    public SearchColumnBooleanField getAllowAllResourcesForTasks(int i) {
        return this.allowAllResourcesForTasks[i];
    }

    public void setAllowAllResourcesForTasks(int i, SearchColumnBooleanField _value) {
        this.allowAllResourcesForTasks[i] = _value;
    }

    public SearchColumnBooleanField[] getAllowExpenses() {
        return this.allowExpenses;
    }

    public void setAllowExpenses(SearchColumnBooleanField[] allowExpenses) {
        this.allowExpenses = allowExpenses;
    }

    public SearchColumnBooleanField getAllowExpenses(int i) {
        return this.allowExpenses[i];
    }

    public void setAllowExpenses(int i, SearchColumnBooleanField _value) {
        this.allowExpenses[i] = _value;
    }

    public SearchColumnBooleanField[] getAllowTime() {
        return this.allowTime;
    }

    public void setAllowTime(SearchColumnBooleanField[] allowTime) {
        this.allowTime = allowTime;
    }

    public SearchColumnBooleanField getAllowTime(int i) {
        return this.allowTime[i];
    }

    public void setAllowTime(int i, SearchColumnBooleanField _value) {
        this.allowTime[i] = _value;
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

    public SearchColumnSelectField[] getBillingRateCard() {
        return this.billingRateCard;
    }

    public void setBillingRateCard(SearchColumnSelectField[] billingRateCard) {
        this.billingRateCard = billingRateCard;
    }

    public SearchColumnSelectField getBillingRateCard(int i) {
        return this.billingRateCard[i];
    }

    public void setBillingRateCard(int i, SearchColumnSelectField _value) {
        this.billingRateCard[i] = _value;
    }

    public SearchColumnSelectField[] getBillingSchedule() {
        return this.billingSchedule;
    }

    public void setBillingSchedule(SearchColumnSelectField[] billingSchedule) {
        this.billingSchedule = billingSchedule;
    }

    public SearchColumnSelectField getBillingSchedule(int i) {
        return this.billingSchedule[i];
    }

    public void setBillingSchedule(int i, SearchColumnSelectField _value) {
        this.billingSchedule[i] = _value;
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

    public SearchColumnDateField[] getCalculatedEndDate() {
        return this.calculatedEndDate;
    }

    public void setCalculatedEndDate(SearchColumnDateField[] calculatedEndDate) {
        this.calculatedEndDate = calculatedEndDate;
    }

    public SearchColumnDateField getCalculatedEndDate(int i) {
        return this.calculatedEndDate[i];
    }

    public void setCalculatedEndDate(int i, SearchColumnDateField _value) {
        this.calculatedEndDate[i] = _value;
    }

    public SearchColumnDateField[] getCalculatedEndDateBaseline() {
        return this.calculatedEndDateBaseline;
    }

    public void setCalculatedEndDateBaseline(SearchColumnDateField[] calculatedEndDateBaseline) {
        this.calculatedEndDateBaseline = calculatedEndDateBaseline;
    }

    public SearchColumnDateField getCalculatedEndDateBaseline(int i) {
        return this.calculatedEndDateBaseline[i];
    }

    public void setCalculatedEndDateBaseline(int i, SearchColumnDateField _value) {
        this.calculatedEndDateBaseline[i] = _value;
    }

    public SearchColumnDateField[] getCalculatedStartDate() {
        return this.calculatedStartDate;
    }

    public void setCalculatedStartDate(SearchColumnDateField[] calculatedStartDate) {
        this.calculatedStartDate = calculatedStartDate;
    }

    public SearchColumnDateField getCalculatedStartDate(int i) {
        return this.calculatedStartDate[i];
    }

    public void setCalculatedStartDate(int i, SearchColumnDateField _value) {
        this.calculatedStartDate[i] = _value;
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

    public SearchColumnSelectField[] getCustomer() {
        return this.customer;
    }

    public void setCustomer(SearchColumnSelectField[] customer) {
        this.customer = customer;
    }

    public SearchColumnSelectField getCustomer(int i) {
        return this.customer[i];
    }

    public void setCustomer(int i, SearchColumnSelectField _value) {
        this.customer[i] = _value;
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

    public SearchColumnDoubleField[] getEstimatedCost() {
        return this.estimatedCost;
    }

    public void setEstimatedCost(SearchColumnDoubleField[] estimatedCost) {
        this.estimatedCost = estimatedCost;
    }

    public SearchColumnDoubleField getEstimatedCost(int i) {
        return this.estimatedCost[i];
    }

    public void setEstimatedCost(int i, SearchColumnDoubleField _value) {
        this.estimatedCost[i] = _value;
    }

    public SearchColumnDoubleField[] getEstimatedGrossProfit() {
        return this.estimatedGrossProfit;
    }

    public void setEstimatedGrossProfit(SearchColumnDoubleField[] estimatedGrossProfit) {
        this.estimatedGrossProfit = estimatedGrossProfit;
    }

    public SearchColumnDoubleField getEstimatedGrossProfit(int i) {
        return this.estimatedGrossProfit[i];
    }

    public void setEstimatedGrossProfit(int i, SearchColumnDoubleField _value) {
        this.estimatedGrossProfit[i] = _value;
    }

    public SearchColumnDoubleField[] getEstimatedGrossProfitPercent() {
        return this.estimatedGrossProfitPercent;
    }

    public void setEstimatedGrossProfitPercent(SearchColumnDoubleField[] estimatedGrossProfitPercent) {
        this.estimatedGrossProfitPercent = estimatedGrossProfitPercent;
    }

    public SearchColumnDoubleField getEstimatedGrossProfitPercent(int i) {
        return this.estimatedGrossProfitPercent[i];
    }

    public void setEstimatedGrossProfitPercent(int i, SearchColumnDoubleField _value) {
        this.estimatedGrossProfitPercent[i] = _value;
    }

    public SearchColumnDoubleField[] getEstimatedLaborCost() {
        return this.estimatedLaborCost;
    }

    public void setEstimatedLaborCost(SearchColumnDoubleField[] estimatedLaborCost) {
        this.estimatedLaborCost = estimatedLaborCost;
    }

    public SearchColumnDoubleField getEstimatedLaborCost(int i) {
        return this.estimatedLaborCost[i];
    }

    public void setEstimatedLaborCost(int i, SearchColumnDoubleField _value) {
        this.estimatedLaborCost[i] = _value;
    }

    public SearchColumnDoubleField[] getEstimatedLaborCostBaseline() {
        return this.estimatedLaborCostBaseline;
    }

    public void setEstimatedLaborCostBaseline(SearchColumnDoubleField[] estimatedLaborCostBaseline) {
        this.estimatedLaborCostBaseline = estimatedLaborCostBaseline;
    }

    public SearchColumnDoubleField getEstimatedLaborCostBaseline(int i) {
        return this.estimatedLaborCostBaseline[i];
    }

    public void setEstimatedLaborCostBaseline(int i, SearchColumnDoubleField _value) {
        this.estimatedLaborCostBaseline[i] = _value;
    }

    public SearchColumnDoubleField[] getEstimatedLaborRevenue() {
        return this.estimatedLaborRevenue;
    }

    public void setEstimatedLaborRevenue(SearchColumnDoubleField[] estimatedLaborRevenue) {
        this.estimatedLaborRevenue = estimatedLaborRevenue;
    }

    public SearchColumnDoubleField getEstimatedLaborRevenue(int i) {
        return this.estimatedLaborRevenue[i];
    }

    public void setEstimatedLaborRevenue(int i, SearchColumnDoubleField _value) {
        this.estimatedLaborRevenue[i] = _value;
    }

    public SearchColumnDoubleField[] getEstimatedRevenue() {
        return this.estimatedRevenue;
    }

    public void setEstimatedRevenue(SearchColumnDoubleField[] estimatedRevenue) {
        this.estimatedRevenue = estimatedRevenue;
    }

    public SearchColumnDoubleField getEstimatedRevenue(int i) {
        return this.estimatedRevenue[i];
    }

    public void setEstimatedRevenue(int i, SearchColumnDoubleField _value) {
        this.estimatedRevenue[i] = _value;
    }

    public SearchColumnDoubleField[] getEstimatedTime() {
        return this.estimatedTime;
    }

    public void setEstimatedTime(SearchColumnDoubleField[] estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    public SearchColumnDoubleField getEstimatedTime(int i) {
        return this.estimatedTime[i];
    }

    public void setEstimatedTime(int i, SearchColumnDoubleField _value) {
        this.estimatedTime[i] = _value;
    }

    public SearchColumnDoubleField[] getEstimatedTimeOverride() {
        return this.estimatedTimeOverride;
    }

    public void setEstimatedTimeOverride(SearchColumnDoubleField[] estimatedTimeOverride) {
        this.estimatedTimeOverride = estimatedTimeOverride;
    }

    public SearchColumnDoubleField getEstimatedTimeOverride(int i) {
        return this.estimatedTimeOverride[i];
    }

    public void setEstimatedTimeOverride(int i, SearchColumnDoubleField _value) {
        this.estimatedTimeOverride[i] = _value;
    }

    public SearchColumnDoubleField[] getEstimatedTimeOverrideBaseline() {
        return this.estimatedTimeOverrideBaseline;
    }

    public void setEstimatedTimeOverrideBaseline(SearchColumnDoubleField[] estimatedTimeOverrideBaseline) {
        this.estimatedTimeOverrideBaseline = estimatedTimeOverrideBaseline;
    }

    public SearchColumnDoubleField getEstimatedTimeOverrideBaseline(int i) {
        return this.estimatedTimeOverrideBaseline[i];
    }

    public void setEstimatedTimeOverrideBaseline(int i, SearchColumnDoubleField _value) {
        this.estimatedTimeOverrideBaseline[i] = _value;
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

    public SearchColumnBooleanField[] getIncludeCrmTasksInTotals() {
        return this.includeCrmTasksInTotals;
    }

    public void setIncludeCrmTasksInTotals(SearchColumnBooleanField[] includeCrmTasksInTotals) {
        this.includeCrmTasksInTotals = includeCrmTasksInTotals;
    }

    public SearchColumnBooleanField getIncludeCrmTasksInTotals(int i) {
        return this.includeCrmTasksInTotals[i];
    }

    public void setIncludeCrmTasksInTotals(int i, SearchColumnBooleanField _value) {
        this.includeCrmTasksInTotals[i] = _value;
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

    public SearchColumnBooleanField[] getIsExemptTime() {
        return this.isExemptTime;
    }

    public void setIsExemptTime(SearchColumnBooleanField[] isExemptTime) {
        this.isExemptTime = isExemptTime;
    }

    public SearchColumnBooleanField getIsExemptTime(int i) {
        return this.isExemptTime[i];
    }

    public void setIsExemptTime(int i, SearchColumnBooleanField _value) {
        this.isExemptTime[i] = _value;
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

    public SearchColumnBooleanField[] getIsProductiveTime() {
        return this.isProductiveTime;
    }

    public void setIsProductiveTime(SearchColumnBooleanField[] isProductiveTime) {
        this.isProductiveTime = isProductiveTime;
    }

    public SearchColumnBooleanField getIsProductiveTime(int i) {
        return this.isProductiveTime[i];
    }

    public void setIsProductiveTime(int i, SearchColumnBooleanField _value) {
        this.isProductiveTime[i] = _value;
    }

    public SearchColumnBooleanField[] getIsUtilizedTime() {
        return this.isUtilizedTime;
    }

    public void setIsUtilizedTime(SearchColumnBooleanField[] isUtilizedTime) {
        this.isUtilizedTime = isUtilizedTime;
    }

    public SearchColumnBooleanField getIsUtilizedTime(int i) {
        return this.isUtilizedTime[i];
    }

    public void setIsUtilizedTime(int i, SearchColumnBooleanField _value) {
        this.isUtilizedTime[i] = _value;
    }

    public SearchColumnEnumSelectField[] getJobBillingType() {
        return this.jobBillingType;
    }

    public void setJobBillingType(SearchColumnEnumSelectField[] jobBillingType) {
        this.jobBillingType = jobBillingType;
    }

    public SearchColumnEnumSelectField getJobBillingType(int i) {
        return this.jobBillingType[i];
    }

    public void setJobBillingType(int i, SearchColumnEnumSelectField _value) {
        this.jobBillingType[i] = _value;
    }

    public SearchColumnSelectField[] getJobItem() {
        return this.jobItem;
    }

    public void setJobItem(SearchColumnSelectField[] jobItem) {
        this.jobItem = jobItem;
    }

    public SearchColumnSelectField getJobItem(int i) {
        return this.jobItem[i];
    }

    public void setJobItem(int i, SearchColumnSelectField _value) {
        this.jobItem[i] = _value;
    }

    public SearchColumnDoubleField[] getJobPrice() {
        return this.jobPrice;
    }

    public void setJobPrice(SearchColumnDoubleField[] jobPrice) {
        this.jobPrice = jobPrice;
    }

    public SearchColumnDoubleField getJobPrice(int i) {
        return this.jobPrice[i];
    }

    public void setJobPrice(int i, SearchColumnDoubleField _value) {
        this.jobPrice[i] = _value;
    }

    public SearchColumnSelectField[] getJobResource() {
        return this.jobResource;
    }

    public void setJobResource(SearchColumnSelectField[] jobResource) {
        this.jobResource = jobResource;
    }

    public SearchColumnSelectField getJobResource(int i) {
        return this.jobResource[i];
    }

    public void setJobResource(int i, SearchColumnSelectField _value) {
        this.jobResource[i] = _value;
    }

    public SearchColumnSelectField[] getJobResourceRole() {
        return this.jobResourceRole;
    }

    public void setJobResourceRole(SearchColumnSelectField[] jobResourceRole) {
        this.jobResourceRole = jobResourceRole;
    }

    public SearchColumnSelectField getJobResourceRole(int i) {
        return this.jobResourceRole[i];
    }

    public void setJobResourceRole(int i, SearchColumnSelectField _value) {
        this.jobResourceRole[i] = _value;
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

    public SearchColumnDateField[] getLastBaselineDate() {
        return this.lastBaselineDate;
    }

    public void setLastBaselineDate(SearchColumnDateField[] lastBaselineDate) {
        this.lastBaselineDate = lastBaselineDate;
    }

    public SearchColumnDateField getLastBaselineDate(int i) {
        return this.lastBaselineDate[i];
    }

    public void setLastBaselineDate(int i, SearchColumnDateField _value) {
        this.lastBaselineDate[i] = _value;
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

    public SearchColumnBooleanField[] getLimitTimeToAssignees() {
        return this.limitTimeToAssignees;
    }

    public void setLimitTimeToAssignees(SearchColumnBooleanField[] limitTimeToAssignees) {
        this.limitTimeToAssignees = limitTimeToAssignees;
    }

    public SearchColumnBooleanField getLimitTimeToAssignees(int i) {
        return this.limitTimeToAssignees[i];
    }

    public void setLimitTimeToAssignees(int i, SearchColumnBooleanField _value) {
        this.limitTimeToAssignees[i] = _value;
    }

    public SearchColumnBooleanField[] getMaterializeTime() {
        return this.materializeTime;
    }

    public void setMaterializeTime(SearchColumnBooleanField[] materializeTime) {
        this.materializeTime = materializeTime;
    }

    public SearchColumnBooleanField getMaterializeTime(int i) {
        return this.materializeTime[i];
    }

    public void setMaterializeTime(int i, SearchColumnBooleanField _value) {
        this.materializeTime[i] = _value;
    }

    public SearchColumnDoubleField[] getPercentComplete() {
        return this.percentComplete;
    }

    public void setPercentComplete(SearchColumnDoubleField[] percentComplete) {
        this.percentComplete = percentComplete;
    }

    public SearchColumnDoubleField getPercentComplete(int i) {
        return this.percentComplete[i];
    }

    public void setPercentComplete(int i, SearchColumnDoubleField _value) {
        this.percentComplete[i] = _value;
    }

    public SearchColumnDoubleField[] getPercentTimeComplete() {
        return this.percentTimeComplete;
    }

    public void setPercentTimeComplete(SearchColumnDoubleField[] percentTimeComplete) {
        this.percentTimeComplete = percentTimeComplete;
    }

    public SearchColumnDoubleField getPercentTimeComplete(int i) {
        return this.percentTimeComplete[i];
    }

    public void setPercentTimeComplete(int i, SearchColumnDoubleField _value) {
        this.percentTimeComplete[i] = _value;
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

    public SearchColumnDoubleField[] getPlannedWork() {
        return this.plannedWork;
    }

    public void setPlannedWork(SearchColumnDoubleField[] plannedWork) {
        this.plannedWork = plannedWork;
    }

    public SearchColumnDoubleField getPlannedWork(int i) {
        return this.plannedWork[i];
    }

    public void setPlannedWork(int i, SearchColumnDoubleField _value) {
        this.plannedWork[i] = _value;
    }

    public SearchColumnDoubleField[] getPlannedWorkBaseline() {
        return this.plannedWorkBaseline;
    }

    public void setPlannedWorkBaseline(SearchColumnDoubleField[] plannedWorkBaseline) {
        this.plannedWorkBaseline = plannedWorkBaseline;
    }

    public SearchColumnDoubleField getPlannedWorkBaseline(int i) {
        return this.plannedWorkBaseline[i];
    }

    public void setPlannedWorkBaseline(int i, SearchColumnDoubleField _value) {
        this.plannedWorkBaseline[i] = _value;
    }

    public SearchColumnDateField[] getProjectedEndDate() {
        return this.projectedEndDate;
    }

    public void setProjectedEndDate(SearchColumnDateField[] projectedEndDate) {
        this.projectedEndDate = projectedEndDate;
    }

    public SearchColumnDateField getProjectedEndDate(int i) {
        return this.projectedEndDate[i];
    }

    public void setProjectedEndDate(int i, SearchColumnDateField _value) {
        this.projectedEndDate[i] = _value;
    }

    public SearchColumnDateField[] getProjectedEndDateBaseline() {
        return this.projectedEndDateBaseline;
    }

    public void setProjectedEndDateBaseline(SearchColumnDateField[] projectedEndDateBaseline) {
        this.projectedEndDateBaseline = projectedEndDateBaseline;
    }

    public SearchColumnDateField getProjectedEndDateBaseline(int i) {
        return this.projectedEndDateBaseline[i];
    }

    public void setProjectedEndDateBaseline(int i, SearchColumnDateField _value) {
        this.projectedEndDateBaseline[i] = _value;
    }

    public SearchColumnSelectField[] getProjectExpenseType() {
        return this.projectExpenseType;
    }

    public void setProjectExpenseType(SearchColumnSelectField[] projectExpenseType) {
        this.projectExpenseType = projectExpenseType;
    }

    public SearchColumnSelectField getProjectExpenseType(int i) {
        return this.projectExpenseType[i];
    }

    public void setProjectExpenseType(int i, SearchColumnSelectField _value) {
        this.projectExpenseType[i] = _value;
    }

    public SearchColumnSelectField[] getProjectManager() {
        return this.projectManager;
    }

    public void setProjectManager(SearchColumnSelectField[] projectManager) {
        this.projectManager = projectManager;
    }

    public SearchColumnSelectField getProjectManager(int i) {
        return this.projectManager[i];
    }

    public void setProjectManager(int i, SearchColumnSelectField _value) {
        this.projectManager[i] = _value;
    }

    public SearchColumnSelectField[] getRevRecForecastRule() {
        return this.revRecForecastRule;
    }

    public void setRevRecForecastRule(SearchColumnSelectField[] revRecForecastRule) {
        this.revRecForecastRule = revRecForecastRule;
    }

    public SearchColumnSelectField getRevRecForecastRule(int i) {
        return this.revRecForecastRule[i];
    }

    public void setRevRecForecastRule(int i, SearchColumnSelectField _value) {
        this.revRecForecastRule[i] = _value;
    }

    public SearchColumnDateField[] getScheduledEndDate() {
        return this.scheduledEndDate;
    }

    public void setScheduledEndDate(SearchColumnDateField[] scheduledEndDate) {
        this.scheduledEndDate = scheduledEndDate;
    }

    public SearchColumnDateField getScheduledEndDate(int i) {
        return this.scheduledEndDate[i];
    }

    public void setScheduledEndDate(int i, SearchColumnDateField _value) {
        this.scheduledEndDate[i] = _value;
    }

    public SearchColumnEnumSelectField[] getSchedulingMethod() {
        return this.schedulingMethod;
    }

    public void setSchedulingMethod(SearchColumnEnumSelectField[] schedulingMethod) {
        this.schedulingMethod = schedulingMethod;
    }

    public SearchColumnEnumSelectField getSchedulingMethod(int i) {
        return this.schedulingMethod[i];
    }

    public void setSchedulingMethod(int i, SearchColumnEnumSelectField _value) {
        this.schedulingMethod[i] = _value;
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

    public SearchColumnBooleanField[] getSourceServiceItemFromRateCard() {
        return this.sourceServiceItemFromRateCard;
    }

    public void setSourceServiceItemFromRateCard(SearchColumnBooleanField[] sourceServiceItemFromRateCard) {
        this.sourceServiceItemFromRateCard = sourceServiceItemFromRateCard;
    }

    public SearchColumnBooleanField getSourceServiceItemFromRateCard(int i) {
        return this.sourceServiceItemFromRateCard[i];
    }

    public void setSourceServiceItemFromRateCard(int i, SearchColumnBooleanField _value) {
        this.sourceServiceItemFromRateCard[i] = _value;
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

    public SearchColumnDateField[] getStartDateBaseline() {
        return this.startDateBaseline;
    }

    public void setStartDateBaseline(SearchColumnDateField[] startDateBaseline) {
        this.startDateBaseline = startDateBaseline;
    }

    public SearchColumnDateField getStartDateBaseline(int i) {
        return this.startDateBaseline[i];
    }

    public void setStartDateBaseline(int i, SearchColumnDateField _value) {
        this.startDateBaseline[i] = _value;
    }

    public SearchColumnStringField[] getState() {
        return this.state;
    }

    public void setState(SearchColumnStringField[] state) {
        this.state = state;
    }

    public SearchColumnStringField getState(int i) {
        return this.state[i];
    }

    public void setState(int i, SearchColumnStringField _value) {
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

    public SearchColumnSelectField[] getTimeApproval() {
        return this.timeApproval;
    }

    public void setTimeApproval(SearchColumnSelectField[] timeApproval) {
        this.timeApproval = timeApproval;
    }

    public SearchColumnSelectField getTimeApproval(int i) {
        return this.timeApproval[i];
    }

    public void setTimeApproval(int i, SearchColumnSelectField _value) {
        this.timeApproval[i] = _value;
    }

    public SearchColumnDoubleField[] getTimeRemaining() {
        return this.timeRemaining;
    }

    public void setTimeRemaining(SearchColumnDoubleField[] timeRemaining) {
        this.timeRemaining = timeRemaining;
    }

    public SearchColumnDoubleField getTimeRemaining(int i) {
        return this.timeRemaining[i];
    }

    public void setTimeRemaining(int i, SearchColumnDoubleField _value) {
        this.timeRemaining[i] = _value;
    }

    public SearchColumnBooleanField[] getUsePercentCompleteOverride() {
        return this.usePercentCompleteOverride;
    }

    public void setUsePercentCompleteOverride(SearchColumnBooleanField[] usePercentCompleteOverride) {
        this.usePercentCompleteOverride = usePercentCompleteOverride;
    }

    public SearchColumnBooleanField getUsePercentCompleteOverride(int i) {
        return this.usePercentCompleteOverride[i];
    }

    public void setUsePercentCompleteOverride(int i, SearchColumnBooleanField _value) {
        this.usePercentCompleteOverride[i] = _value;
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
        if (!(obj instanceof JobSearchRowBasic)) {
            return false;
        }
        JobSearchRowBasic other = (JobSearchRowBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.accountNumber == null && other.getAccountNumber() == null || this.accountNumber != null && Arrays.equals(this.accountNumber, other.getAccountNumber())) && (this.actualTime == null && other.getActualTime() == null || this.actualTime != null && Arrays.equals(this.actualTime, other.getActualTime())) && (this.address == null && other.getAddress() == null || this.address != null && Arrays.equals(this.address, other.getAddress())) && (this.address1 == null && other.getAddress1() == null || this.address1 != null && Arrays.equals(this.address1, other.getAddress1())) && (this.address2 == null && other.getAddress2() == null || this.address2 != null && Arrays.equals(this.address2, other.getAddress2())) && (this.address3 == null && other.getAddress3() == null || this.address3 != null && Arrays.equals(this.address3, other.getAddress3())) && (this.addressee == null && other.getAddressee() == null || this.addressee != null && Arrays.equals(this.addressee, other.getAddressee())) && (this.addressInternalId == null && other.getAddressInternalId() == null || this.addressInternalId != null && Arrays.equals(this.addressInternalId, other.getAddressInternalId())) && (this.addressLabel == null && other.getAddressLabel() == null || this.addressLabel != null && Arrays.equals(this.addressLabel, other.getAddressLabel())) && (this.addressPhone == null && other.getAddressPhone() == null || this.addressPhone != null && Arrays.equals(this.addressPhone, other.getAddressPhone())) && (this.allocatePayrollExpenses == null && other.getAllocatePayrollExpenses() == null || this.allocatePayrollExpenses != null && Arrays.equals(this.allocatePayrollExpenses, other.getAllocatePayrollExpenses())) && (this.allowAllResourcesForTasks == null && other.getAllowAllResourcesForTasks() == null || this.allowAllResourcesForTasks != null && Arrays.equals(this.allowAllResourcesForTasks, other.getAllowAllResourcesForTasks())) && (this.allowExpenses == null && other.getAllowExpenses() == null || this.allowExpenses != null && Arrays.equals(this.allowExpenses, other.getAllowExpenses())) && (this.allowTime == null && other.getAllowTime() == null || this.allowTime != null && Arrays.equals(this.allowTime, other.getAllowTime())) && (this.altContact == null && other.getAltContact() == null || this.altContact != null && Arrays.equals(this.altContact, other.getAltContact())) && (this.altEmail == null && other.getAltEmail() == null || this.altEmail != null && Arrays.equals(this.altEmail, other.getAltEmail())) && (this.altName == null && other.getAltName() == null || this.altName != null && Arrays.equals(this.altName, other.getAltName())) && (this.altPhone == null && other.getAltPhone() == null || this.altPhone != null && Arrays.equals(this.altPhone, other.getAltPhone())) && (this.attention == null && other.getAttention() == null || this.attention != null && Arrays.equals(this.attention, other.getAttention())) && (this.billAddress1 == null && other.getBillAddress1() == null || this.billAddress1 != null && Arrays.equals(this.billAddress1, other.getBillAddress1())) && (this.billAddress2 == null && other.getBillAddress2() == null || this.billAddress2 != null && Arrays.equals(this.billAddress2, other.getBillAddress2())) && (this.billAddress3 == null && other.getBillAddress3() == null || this.billAddress3 != null && Arrays.equals(this.billAddress3, other.getBillAddress3())) && (this.billAddressee == null && other.getBillAddressee() == null || this.billAddressee != null && Arrays.equals(this.billAddressee, other.getBillAddressee())) && (this.billAttention == null && other.getBillAttention() == null || this.billAttention != null && Arrays.equals(this.billAttention, other.getBillAttention())) && (this.billCity == null && other.getBillCity() == null || this.billCity != null && Arrays.equals(this.billCity, other.getBillCity())) && (this.billCountry == null && other.getBillCountry() == null || this.billCountry != null && Arrays.equals(this.billCountry, other.getBillCountry())) && (this.billCountryCode == null && other.getBillCountryCode() == null || this.billCountryCode != null && Arrays.equals(this.billCountryCode, other.getBillCountryCode())) && (this.billingRateCard == null && other.getBillingRateCard() == null || this.billingRateCard != null && Arrays.equals(this.billingRateCard, other.getBillingRateCard())) && (this.billingSchedule == null && other.getBillingSchedule() == null || this.billingSchedule != null && Arrays.equals(this.billingSchedule, other.getBillingSchedule())) && (this.billPhone == null && other.getBillPhone() == null || this.billPhone != null && Arrays.equals(this.billPhone, other.getBillPhone())) && (this.billState == null && other.getBillState() == null || this.billState != null && Arrays.equals(this.billState, other.getBillState())) && (this.billZipCode == null && other.getBillZipCode() == null || this.billZipCode != null && Arrays.equals(this.billZipCode, other.getBillZipCode())) && (this.calculatedEndDate == null && other.getCalculatedEndDate() == null || this.calculatedEndDate != null && Arrays.equals(this.calculatedEndDate, other.getCalculatedEndDate())) && (this.calculatedEndDateBaseline == null && other.getCalculatedEndDateBaseline() == null || this.calculatedEndDateBaseline != null && Arrays.equals(this.calculatedEndDateBaseline, other.getCalculatedEndDateBaseline())) && (this.calculatedStartDate == null && other.getCalculatedStartDate() == null || this.calculatedStartDate != null && Arrays.equals(this.calculatedStartDate, other.getCalculatedStartDate())) && (this.category == null && other.getCategory() == null || this.category != null && Arrays.equals(this.category, other.getCategory())) && (this.city == null && other.getCity() == null || this.city != null && Arrays.equals(this.city, other.getCity())) && (this.comments == null && other.getComments() == null || this.comments != null && Arrays.equals(this.comments, other.getComments())) && (this.companyName == null && other.getCompanyName() == null || this.companyName != null && Arrays.equals(this.companyName, other.getCompanyName())) && (this.contact == null && other.getContact() == null || this.contact != null && Arrays.equals(this.contact, other.getContact())) && (this.country == null && other.getCountry() == null || this.country != null && Arrays.equals(this.country, other.getCountry())) && (this.countryCode == null && other.getCountryCode() == null || this.countryCode != null && Arrays.equals(this.countryCode, other.getCountryCode())) && (this.customer == null && other.getCustomer() == null || this.customer != null && Arrays.equals(this.customer, other.getCustomer())) && (this.dateCreated == null && other.getDateCreated() == null || this.dateCreated != null && Arrays.equals(this.dateCreated, other.getDateCreated())) && (this.defaultTaxReg == null && other.getDefaultTaxReg() == null || this.defaultTaxReg != null && Arrays.equals(this.defaultTaxReg, other.getDefaultTaxReg())) && (this.email == null && other.getEmail() == null || this.email != null && Arrays.equals(this.email, other.getEmail())) && (this.endDate == null && other.getEndDate() == null || this.endDate != null && Arrays.equals(this.endDate, other.getEndDate())) && (this.entityId == null && other.getEntityId() == null || this.entityId != null && Arrays.equals(this.entityId, other.getEntityId())) && (this.entityNumber == null && other.getEntityNumber() == null || this.entityNumber != null && Arrays.equals(this.entityNumber, other.getEntityNumber())) && (this.entityStatus == null && other.getEntityStatus() == null || this.entityStatus != null && Arrays.equals(this.entityStatus, other.getEntityStatus())) && (this.estimatedCost == null && other.getEstimatedCost() == null || this.estimatedCost != null && Arrays.equals(this.estimatedCost, other.getEstimatedCost())) && (this.estimatedGrossProfit == null && other.getEstimatedGrossProfit() == null || this.estimatedGrossProfit != null && Arrays.equals(this.estimatedGrossProfit, other.getEstimatedGrossProfit())) && (this.estimatedGrossProfitPercent == null && other.getEstimatedGrossProfitPercent() == null || this.estimatedGrossProfitPercent != null && Arrays.equals(this.estimatedGrossProfitPercent, other.getEstimatedGrossProfitPercent())) && (this.estimatedLaborCost == null && other.getEstimatedLaborCost() == null || this.estimatedLaborCost != null && Arrays.equals(this.estimatedLaborCost, other.getEstimatedLaborCost())) && (this.estimatedLaborCostBaseline == null && other.getEstimatedLaborCostBaseline() == null || this.estimatedLaborCostBaseline != null && Arrays.equals(this.estimatedLaborCostBaseline, other.getEstimatedLaborCostBaseline())) && (this.estimatedLaborRevenue == null && other.getEstimatedLaborRevenue() == null || this.estimatedLaborRevenue != null && Arrays.equals(this.estimatedLaborRevenue, other.getEstimatedLaborRevenue())) && (this.estimatedRevenue == null && other.getEstimatedRevenue() == null || this.estimatedRevenue != null && Arrays.equals(this.estimatedRevenue, other.getEstimatedRevenue())) && (this.estimatedTime == null && other.getEstimatedTime() == null || this.estimatedTime != null && Arrays.equals(this.estimatedTime, other.getEstimatedTime())) && (this.estimatedTimeOverride == null && other.getEstimatedTimeOverride() == null || this.estimatedTimeOverride != null && Arrays.equals(this.estimatedTimeOverride, other.getEstimatedTimeOverride())) && (this.estimatedTimeOverrideBaseline == null && other.getEstimatedTimeOverrideBaseline() == null || this.estimatedTimeOverrideBaseline != null && Arrays.equals(this.estimatedTimeOverrideBaseline, other.getEstimatedTimeOverrideBaseline())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && Arrays.equals(this.externalId, other.getExternalId())) && (this.fax == null && other.getFax() == null || this.fax != null && Arrays.equals(this.fax, other.getFax())) && (this.globalSubscriptionStatus == null && other.getGlobalSubscriptionStatus() == null || this.globalSubscriptionStatus != null && Arrays.equals(this.globalSubscriptionStatus, other.getGlobalSubscriptionStatus())) && (this.image == null && other.getImage() == null || this.image != null && Arrays.equals(this.image, other.getImage())) && (this.includeCrmTasksInTotals == null && other.getIncludeCrmTasksInTotals() == null || this.includeCrmTasksInTotals != null && Arrays.equals(this.includeCrmTasksInTotals, other.getIncludeCrmTasksInTotals())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && Arrays.equals(this.internalId, other.getInternalId())) && (this.isDefaultBilling == null && other.getIsDefaultBilling() == null || this.isDefaultBilling != null && Arrays.equals(this.isDefaultBilling, other.getIsDefaultBilling())) && (this.isDefaultShipping == null && other.getIsDefaultShipping() == null || this.isDefaultShipping != null && Arrays.equals(this.isDefaultShipping, other.getIsDefaultShipping())) && (this.isExemptTime == null && other.getIsExemptTime() == null || this.isExemptTime != null && Arrays.equals(this.isExemptTime, other.getIsExemptTime())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && Arrays.equals(this.isInactive, other.getIsInactive())) && (this.isProductiveTime == null && other.getIsProductiveTime() == null || this.isProductiveTime != null && Arrays.equals(this.isProductiveTime, other.getIsProductiveTime())) && (this.isUtilizedTime == null && other.getIsUtilizedTime() == null || this.isUtilizedTime != null && Arrays.equals(this.isUtilizedTime, other.getIsUtilizedTime())) && (this.jobBillingType == null && other.getJobBillingType() == null || this.jobBillingType != null && Arrays.equals(this.jobBillingType, other.getJobBillingType())) && (this.jobItem == null && other.getJobItem() == null || this.jobItem != null && Arrays.equals(this.jobItem, other.getJobItem())) && (this.jobPrice == null && other.getJobPrice() == null || this.jobPrice != null && Arrays.equals(this.jobPrice, other.getJobPrice())) && (this.jobResource == null && other.getJobResource() == null || this.jobResource != null && Arrays.equals(this.jobResource, other.getJobResource())) && (this.jobResourceRole == null && other.getJobResourceRole() == null || this.jobResourceRole != null && Arrays.equals(this.jobResourceRole, other.getJobResourceRole())) && (this.language == null && other.getLanguage() == null || this.language != null && Arrays.equals(this.language, other.getLanguage())) && (this.lastBaselineDate == null && other.getLastBaselineDate() == null || this.lastBaselineDate != null && Arrays.equals(this.lastBaselineDate, other.getLastBaselineDate())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && Arrays.equals(this.lastModifiedDate, other.getLastModifiedDate())) && (this.level == null && other.getLevel() == null || this.level != null && Arrays.equals(this.level, other.getLevel())) && (this.limitTimeToAssignees == null && other.getLimitTimeToAssignees() == null || this.limitTimeToAssignees != null && Arrays.equals(this.limitTimeToAssignees, other.getLimitTimeToAssignees())) && (this.materializeTime == null && other.getMaterializeTime() == null || this.materializeTime != null && Arrays.equals(this.materializeTime, other.getMaterializeTime())) && (this.percentComplete == null && other.getPercentComplete() == null || this.percentComplete != null && Arrays.equals(this.percentComplete, other.getPercentComplete())) && (this.percentTimeComplete == null && other.getPercentTimeComplete() == null || this.percentTimeComplete != null && Arrays.equals(this.percentTimeComplete, other.getPercentTimeComplete())) && (this.permission == null && other.getPermission() == null || this.permission != null && Arrays.equals(this.permission, other.getPermission())) && (this.phone == null && other.getPhone() == null || this.phone != null && Arrays.equals(this.phone, other.getPhone())) && (this.phoneticName == null && other.getPhoneticName() == null || this.phoneticName != null && Arrays.equals(this.phoneticName, other.getPhoneticName())) && (this.plannedWork == null && other.getPlannedWork() == null || this.plannedWork != null && Arrays.equals(this.plannedWork, other.getPlannedWork())) && (this.plannedWorkBaseline == null && other.getPlannedWorkBaseline() == null || this.plannedWorkBaseline != null && Arrays.equals(this.plannedWorkBaseline, other.getPlannedWorkBaseline())) && (this.projectedEndDate == null && other.getProjectedEndDate() == null || this.projectedEndDate != null && Arrays.equals(this.projectedEndDate, other.getProjectedEndDate())) && (this.projectedEndDateBaseline == null && other.getProjectedEndDateBaseline() == null || this.projectedEndDateBaseline != null && Arrays.equals(this.projectedEndDateBaseline, other.getProjectedEndDateBaseline())) && (this.projectExpenseType == null && other.getProjectExpenseType() == null || this.projectExpenseType != null && Arrays.equals(this.projectExpenseType, other.getProjectExpenseType())) && (this.projectManager == null && other.getProjectManager() == null || this.projectManager != null && Arrays.equals(this.projectManager, other.getProjectManager())) && (this.revRecForecastRule == null && other.getRevRecForecastRule() == null || this.revRecForecastRule != null && Arrays.equals(this.revRecForecastRule, other.getRevRecForecastRule())) && (this.scheduledEndDate == null && other.getScheduledEndDate() == null || this.scheduledEndDate != null && Arrays.equals(this.scheduledEndDate, other.getScheduledEndDate())) && (this.schedulingMethod == null && other.getSchedulingMethod() == null || this.schedulingMethod != null && Arrays.equals(this.schedulingMethod, other.getSchedulingMethod())) && (this.shipAddress1 == null && other.getShipAddress1() == null || this.shipAddress1 != null && Arrays.equals(this.shipAddress1, other.getShipAddress1())) && (this.shipAddress2 == null && other.getShipAddress2() == null || this.shipAddress2 != null && Arrays.equals(this.shipAddress2, other.getShipAddress2())) && (this.shipAddress3 == null && other.getShipAddress3() == null || this.shipAddress3 != null && Arrays.equals(this.shipAddress3, other.getShipAddress3())) && (this.shipAddressee == null && other.getShipAddressee() == null || this.shipAddressee != null && Arrays.equals(this.shipAddressee, other.getShipAddressee())) && (this.shipAttention == null && other.getShipAttention() == null || this.shipAttention != null && Arrays.equals(this.shipAttention, other.getShipAttention())) && (this.shipCity == null && other.getShipCity() == null || this.shipCity != null && Arrays.equals(this.shipCity, other.getShipCity())) && (this.shipCountry == null && other.getShipCountry() == null || this.shipCountry != null && Arrays.equals(this.shipCountry, other.getShipCountry())) && (this.shipCountryCode == null && other.getShipCountryCode() == null || this.shipCountryCode != null && Arrays.equals(this.shipCountryCode, other.getShipCountryCode())) && (this.shipPhone == null && other.getShipPhone() == null || this.shipPhone != null && Arrays.equals(this.shipPhone, other.getShipPhone())) && (this.shipState == null && other.getShipState() == null || this.shipState != null && Arrays.equals(this.shipState, other.getShipState())) && (this.shipZip == null && other.getShipZip() == null || this.shipZip != null && Arrays.equals(this.shipZip, other.getShipZip())) && (this.sourceServiceItemFromRateCard == null && other.getSourceServiceItemFromRateCard() == null || this.sourceServiceItemFromRateCard != null && Arrays.equals(this.sourceServiceItemFromRateCard, other.getSourceServiceItemFromRateCard())) && (this.startDate == null && other.getStartDate() == null || this.startDate != null && Arrays.equals(this.startDate, other.getStartDate())) && (this.startDateBaseline == null && other.getStartDateBaseline() == null || this.startDateBaseline != null && Arrays.equals(this.startDateBaseline, other.getStartDateBaseline())) && (this.state == null && other.getState() == null || this.state != null && Arrays.equals(this.state, other.getState())) && (this.subscription == null && other.getSubscription() == null || this.subscription != null && Arrays.equals(this.subscription, other.getSubscription())) && (this.subscriptionDate == null && other.getSubscriptionDate() == null || this.subscriptionDate != null && Arrays.equals(this.subscriptionDate, other.getSubscriptionDate())) && (this.subscriptionStatus == null && other.getSubscriptionStatus() == null || this.subscriptionStatus != null && Arrays.equals(this.subscriptionStatus, other.getSubscriptionStatus())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && Arrays.equals(this.subsidiary, other.getSubsidiary())) && (this.timeApproval == null && other.getTimeApproval() == null || this.timeApproval != null && Arrays.equals(this.timeApproval, other.getTimeApproval())) && (this.timeRemaining == null && other.getTimeRemaining() == null || this.timeRemaining != null && Arrays.equals(this.timeRemaining, other.getTimeRemaining())) && (this.usePercentCompleteOverride == null && other.getUsePercentCompleteOverride() == null || this.usePercentCompleteOverride != null && Arrays.equals(this.usePercentCompleteOverride, other.getUsePercentCompleteOverride())) && (this.zipCode == null && other.getZipCode() == null || this.zipCode != null && Arrays.equals(this.zipCode, other.getZipCode())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
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
        if (this.getActualTime() != null) {
            for (i = 0; i < Array.getLength(this.getActualTime()); ++i) {
                obj = Array.get(this.getActualTime(), i);
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
        if (this.getAllocatePayrollExpenses() != null) {
            for (i = 0; i < Array.getLength(this.getAllocatePayrollExpenses()); ++i) {
                obj = Array.get(this.getAllocatePayrollExpenses(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAllowAllResourcesForTasks() != null) {
            for (i = 0; i < Array.getLength(this.getAllowAllResourcesForTasks()); ++i) {
                obj = Array.get(this.getAllowAllResourcesForTasks(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAllowExpenses() != null) {
            for (i = 0; i < Array.getLength(this.getAllowExpenses()); ++i) {
                obj = Array.get(this.getAllowExpenses(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAllowTime() != null) {
            for (i = 0; i < Array.getLength(this.getAllowTime()); ++i) {
                obj = Array.get(this.getAllowTime(), i);
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
        if (this.getAttention() != null) {
            for (i = 0; i < Array.getLength(this.getAttention()); ++i) {
                obj = Array.get(this.getAttention(), i);
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
        if (this.getBillingRateCard() != null) {
            for (i = 0; i < Array.getLength(this.getBillingRateCard()); ++i) {
                obj = Array.get(this.getBillingRateCard(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBillingSchedule() != null) {
            for (i = 0; i < Array.getLength(this.getBillingSchedule()); ++i) {
                obj = Array.get(this.getBillingSchedule(), i);
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
        if (this.getCalculatedEndDate() != null) {
            for (i = 0; i < Array.getLength(this.getCalculatedEndDate()); ++i) {
                obj = Array.get(this.getCalculatedEndDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCalculatedEndDateBaseline() != null) {
            for (i = 0; i < Array.getLength(this.getCalculatedEndDateBaseline()); ++i) {
                obj = Array.get(this.getCalculatedEndDateBaseline(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCalculatedStartDate() != null) {
            for (i = 0; i < Array.getLength(this.getCalculatedStartDate()); ++i) {
                obj = Array.get(this.getCalculatedStartDate(), i);
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
        if (this.getContact() != null) {
            for (i = 0; i < Array.getLength(this.getContact()); ++i) {
                obj = Array.get(this.getContact(), i);
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
        if (this.getCustomer() != null) {
            for (i = 0; i < Array.getLength(this.getCustomer()); ++i) {
                obj = Array.get(this.getCustomer(), i);
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
        if (this.getDefaultTaxReg() != null) {
            for (i = 0; i < Array.getLength(this.getDefaultTaxReg()); ++i) {
                obj = Array.get(this.getDefaultTaxReg(), i);
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
        if (this.getEstimatedCost() != null) {
            for (i = 0; i < Array.getLength(this.getEstimatedCost()); ++i) {
                obj = Array.get(this.getEstimatedCost(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getEstimatedGrossProfit() != null) {
            for (i = 0; i < Array.getLength(this.getEstimatedGrossProfit()); ++i) {
                obj = Array.get(this.getEstimatedGrossProfit(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getEstimatedGrossProfitPercent() != null) {
            for (i = 0; i < Array.getLength(this.getEstimatedGrossProfitPercent()); ++i) {
                obj = Array.get(this.getEstimatedGrossProfitPercent(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getEstimatedLaborCost() != null) {
            for (i = 0; i < Array.getLength(this.getEstimatedLaborCost()); ++i) {
                obj = Array.get(this.getEstimatedLaborCost(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getEstimatedLaborCostBaseline() != null) {
            for (i = 0; i < Array.getLength(this.getEstimatedLaborCostBaseline()); ++i) {
                obj = Array.get(this.getEstimatedLaborCostBaseline(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getEstimatedLaborRevenue() != null) {
            for (i = 0; i < Array.getLength(this.getEstimatedLaborRevenue()); ++i) {
                obj = Array.get(this.getEstimatedLaborRevenue(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getEstimatedRevenue() != null) {
            for (i = 0; i < Array.getLength(this.getEstimatedRevenue()); ++i) {
                obj = Array.get(this.getEstimatedRevenue(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getEstimatedTime() != null) {
            for (i = 0; i < Array.getLength(this.getEstimatedTime()); ++i) {
                obj = Array.get(this.getEstimatedTime(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getEstimatedTimeOverride() != null) {
            for (i = 0; i < Array.getLength(this.getEstimatedTimeOverride()); ++i) {
                obj = Array.get(this.getEstimatedTimeOverride(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getEstimatedTimeOverrideBaseline() != null) {
            for (i = 0; i < Array.getLength(this.getEstimatedTimeOverrideBaseline()); ++i) {
                obj = Array.get(this.getEstimatedTimeOverrideBaseline(), i);
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
        if (this.getGlobalSubscriptionStatus() != null) {
            for (i = 0; i < Array.getLength(this.getGlobalSubscriptionStatus()); ++i) {
                obj = Array.get(this.getGlobalSubscriptionStatus(), i);
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
        if (this.getIncludeCrmTasksInTotals() != null) {
            for (i = 0; i < Array.getLength(this.getIncludeCrmTasksInTotals()); ++i) {
                obj = Array.get(this.getIncludeCrmTasksInTotals(), i);
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
        if (this.getIsExemptTime() != null) {
            for (i = 0; i < Array.getLength(this.getIsExemptTime()); ++i) {
                obj = Array.get(this.getIsExemptTime(), i);
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
        if (this.getIsProductiveTime() != null) {
            for (i = 0; i < Array.getLength(this.getIsProductiveTime()); ++i) {
                obj = Array.get(this.getIsProductiveTime(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsUtilizedTime() != null) {
            for (i = 0; i < Array.getLength(this.getIsUtilizedTime()); ++i) {
                obj = Array.get(this.getIsUtilizedTime(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getJobBillingType() != null) {
            for (i = 0; i < Array.getLength(this.getJobBillingType()); ++i) {
                obj = Array.get(this.getJobBillingType(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getJobItem() != null) {
            for (i = 0; i < Array.getLength(this.getJobItem()); ++i) {
                obj = Array.get(this.getJobItem(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getJobPrice() != null) {
            for (i = 0; i < Array.getLength(this.getJobPrice()); ++i) {
                obj = Array.get(this.getJobPrice(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getJobResource() != null) {
            for (i = 0; i < Array.getLength(this.getJobResource()); ++i) {
                obj = Array.get(this.getJobResource(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getJobResourceRole() != null) {
            for (i = 0; i < Array.getLength(this.getJobResourceRole()); ++i) {
                obj = Array.get(this.getJobResourceRole(), i);
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
        if (this.getLastBaselineDate() != null) {
            for (i = 0; i < Array.getLength(this.getLastBaselineDate()); ++i) {
                obj = Array.get(this.getLastBaselineDate(), i);
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
        if (this.getLevel() != null) {
            for (i = 0; i < Array.getLength(this.getLevel()); ++i) {
                obj = Array.get(this.getLevel(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLimitTimeToAssignees() != null) {
            for (i = 0; i < Array.getLength(this.getLimitTimeToAssignees()); ++i) {
                obj = Array.get(this.getLimitTimeToAssignees(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getMaterializeTime() != null) {
            for (i = 0; i < Array.getLength(this.getMaterializeTime()); ++i) {
                obj = Array.get(this.getMaterializeTime(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPercentComplete() != null) {
            for (i = 0; i < Array.getLength(this.getPercentComplete()); ++i) {
                obj = Array.get(this.getPercentComplete(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPercentTimeComplete() != null) {
            for (i = 0; i < Array.getLength(this.getPercentTimeComplete()); ++i) {
                obj = Array.get(this.getPercentTimeComplete(), i);
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
        if (this.getPlannedWork() != null) {
            for (i = 0; i < Array.getLength(this.getPlannedWork()); ++i) {
                obj = Array.get(this.getPlannedWork(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPlannedWorkBaseline() != null) {
            for (i = 0; i < Array.getLength(this.getPlannedWorkBaseline()); ++i) {
                obj = Array.get(this.getPlannedWorkBaseline(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getProjectedEndDate() != null) {
            for (i = 0; i < Array.getLength(this.getProjectedEndDate()); ++i) {
                obj = Array.get(this.getProjectedEndDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getProjectedEndDateBaseline() != null) {
            for (i = 0; i < Array.getLength(this.getProjectedEndDateBaseline()); ++i) {
                obj = Array.get(this.getProjectedEndDateBaseline(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getProjectExpenseType() != null) {
            for (i = 0; i < Array.getLength(this.getProjectExpenseType()); ++i) {
                obj = Array.get(this.getProjectExpenseType(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getProjectManager() != null) {
            for (i = 0; i < Array.getLength(this.getProjectManager()); ++i) {
                obj = Array.get(this.getProjectManager(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRevRecForecastRule() != null) {
            for (i = 0; i < Array.getLength(this.getRevRecForecastRule()); ++i) {
                obj = Array.get(this.getRevRecForecastRule(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getScheduledEndDate() != null) {
            for (i = 0; i < Array.getLength(this.getScheduledEndDate()); ++i) {
                obj = Array.get(this.getScheduledEndDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSchedulingMethod() != null) {
            for (i = 0; i < Array.getLength(this.getSchedulingMethod()); ++i) {
                obj = Array.get(this.getSchedulingMethod(), i);
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
        if (this.getSourceServiceItemFromRateCard() != null) {
            for (i = 0; i < Array.getLength(this.getSourceServiceItemFromRateCard()); ++i) {
                obj = Array.get(this.getSourceServiceItemFromRateCard(), i);
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
        if (this.getStartDateBaseline() != null) {
            for (i = 0; i < Array.getLength(this.getStartDateBaseline()); ++i) {
                obj = Array.get(this.getStartDateBaseline(), i);
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
        if (this.getTimeApproval() != null) {
            for (i = 0; i < Array.getLength(this.getTimeApproval()); ++i) {
                obj = Array.get(this.getTimeApproval(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTimeRemaining() != null) {
            for (i = 0; i < Array.getLength(this.getTimeRemaining()); ++i) {
                obj = Array.get(this.getTimeRemaining(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getUsePercentCompleteOverride() != null) {
            for (i = 0; i < Array.getLength(this.getUsePercentCompleteOverride()); ++i) {
                obj = Array.get(this.getUsePercentCompleteOverride(), i);
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "JobSearchRowBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "accountNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("actualTime");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "actualTime"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
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
        elemField.setFieldName("allocatePayrollExpenses");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "allocatePayrollExpenses"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("allowAllResourcesForTasks");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "allowAllResourcesForTasks"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("allowExpenses");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "allowExpenses"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("allowTime");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "allowTime"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
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
        elemField.setFieldName("attention");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "attention"));
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
        elemField.setFieldName("billingRateCard");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billingRateCard"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billingSchedule");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billingSchedule"));
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
        elemField.setFieldName("calculatedEndDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "calculatedEndDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("calculatedEndDateBaseline");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "calculatedEndDateBaseline"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("calculatedStartDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "calculatedStartDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
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
        elemField.setFieldName("contact");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "contact"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("customer");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "customer"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("defaultTaxReg");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "defaultTaxReg"));
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
        elemField.setFieldName("estimatedCost");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "estimatedCost"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("estimatedGrossProfit");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "estimatedGrossProfit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("estimatedGrossProfitPercent");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "estimatedGrossProfitPercent"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("estimatedLaborCost");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "estimatedLaborCost"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("estimatedLaborCostBaseline");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "estimatedLaborCostBaseline"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("estimatedLaborRevenue");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "estimatedLaborRevenue"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("estimatedRevenue");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "estimatedRevenue"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("estimatedTime");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "estimatedTime"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("estimatedTimeOverride");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "estimatedTimeOverride"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("estimatedTimeOverrideBaseline");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "estimatedTimeOverrideBaseline"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
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
        elemField.setFieldName("globalSubscriptionStatus");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "globalSubscriptionStatus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
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
        elemField.setFieldName("includeCrmTasksInTotals");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "includeCrmTasksInTotals"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
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
        elemField.setFieldName("isExemptTime");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isExemptTime"));
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
        elemField.setFieldName("isProductiveTime");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isProductiveTime"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isUtilizedTime");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isUtilizedTime"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("jobBillingType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "jobBillingType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("jobItem");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "jobItem"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("jobPrice");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "jobPrice"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("jobResource");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "jobResource"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("jobResourceRole");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "jobResourceRole"));
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
        elemField.setFieldName("lastBaselineDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lastBaselineDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
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
        elemField.setFieldName("level");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "level"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("limitTimeToAssignees");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "limitTimeToAssignees"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("materializeTime");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "materializeTime"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("percentComplete");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "percentComplete"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("percentTimeComplete");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "percentTimeComplete"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
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
        elemField.setFieldName("plannedWork");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "plannedWork"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("plannedWorkBaseline");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "plannedWorkBaseline"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("projectedEndDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "projectedEndDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("projectedEndDateBaseline");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "projectedEndDateBaseline"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("projectExpenseType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "projectExpenseType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("projectManager");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "projectManager"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revRecForecastRule");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "revRecForecastRule"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("scheduledEndDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "scheduledEndDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("schedulingMethod");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "schedulingMethod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
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
        elemField.setFieldName("sourceServiceItemFromRateCard");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "sourceServiceItemFromRateCard"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
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
        elemField.setFieldName("startDateBaseline");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "startDateBaseline"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "state"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("timeApproval");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "timeApproval"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("timeRemaining");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "timeRemaining"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("usePercentCompleteOverride");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "usePercentCompleteOverride"));
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

