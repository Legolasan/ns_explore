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

public class SubsidiarySearchRowBasic
extends SearchRowBasic
implements Serializable {
    private SearchColumnSelectField[] accountingBook;
    private SearchColumnSelectField[] accountingBookCurrency;
    private SearchColumnStringField[] address1;
    private SearchColumnStringField[] address2;
    private SearchColumnStringField[] address3;
    private SearchColumnStringField[] anonymousCustomerInboundEmail;
    private SearchColumnStringField[] anonymousCustomerOnlineForms;
    private SearchColumnStringField[] caseAssignmentTemplate;
    private SearchColumnStringField[] caseAutomaticClosureTemplate;
    private SearchColumnStringField[] caseCopyEmployeeTemplate;
    private SearchColumnStringField[] caseCreationTemplate;
    private SearchColumnStringField[] caseEscalationTemplate;
    private SearchColumnStringField[] caseUpdateTemplate;
    private SearchColumnStringField[] city;
    private SearchColumnStringField[] companyNameForSupportMessages;
    private SearchColumnEnumSelectField[] country;
    private SearchColumnSelectField[] currency;
    private SearchColumnDateField[] effectiveFrom;
    private SearchColumnStringField[] email;
    private SearchColumnStringField[] employeeCaseUpdateTemplate;
    private SearchColumnSelectField[] externalId;
    private SearchColumnStringField[] fax;
    private SearchColumnSelectField[] internalId;
    private SearchColumnBooleanField[] isElimination;
    private SearchColumnBooleanField[] isInactive;
    private SearchColumnStringField[] legalName;
    private SearchColumnStringField[] mainSupportEmailAddress;
    private SearchColumnStringField[] name;
    private SearchColumnStringField[] nameNoHierarchy;
    private SearchColumnSelectField[] nexus;
    private SearchColumnStringField[] phone;
    private SearchColumnDoubleField[] purchaseOrderAmount;
    private SearchColumnDoubleField[] purchaseOrderQuantity;
    private SearchColumnDoubleField[] purchaseOrderQuantityDiff;
    private SearchColumnDoubleField[] receiptAmount;
    private SearchColumnDoubleField[] receiptQuantity;
    private SearchColumnDoubleField[] receiptQuantityDiff;
    private SearchColumnStringField[] state;
    private SearchColumnSelectField[] taxEngine;
    private SearchColumnStringField[] taxIdNum;
    private SearchColumnStringField[] taxRegistrationNumber;
    private SearchColumnStringField[] tranPrefix;
    private SearchColumnStringField[] url;
    private SearchColumnDateField[] validUntil;
    private SearchColumnStringField[] zip;
    private SearchColumnCustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(SubsidiarySearchRowBasic.class, true);

    public SubsidiarySearchRowBasic() {
    }

    public SubsidiarySearchRowBasic(SearchColumnSelectField[] accountingBook, SearchColumnSelectField[] accountingBookCurrency, SearchColumnStringField[] address1, SearchColumnStringField[] address2, SearchColumnStringField[] address3, SearchColumnStringField[] anonymousCustomerInboundEmail, SearchColumnStringField[] anonymousCustomerOnlineForms, SearchColumnStringField[] caseAssignmentTemplate, SearchColumnStringField[] caseAutomaticClosureTemplate, SearchColumnStringField[] caseCopyEmployeeTemplate, SearchColumnStringField[] caseCreationTemplate, SearchColumnStringField[] caseEscalationTemplate, SearchColumnStringField[] caseUpdateTemplate, SearchColumnStringField[] city, SearchColumnStringField[] companyNameForSupportMessages, SearchColumnEnumSelectField[] country, SearchColumnSelectField[] currency, SearchColumnDateField[] effectiveFrom, SearchColumnStringField[] email, SearchColumnStringField[] employeeCaseUpdateTemplate, SearchColumnSelectField[] externalId, SearchColumnStringField[] fax, SearchColumnSelectField[] internalId, SearchColumnBooleanField[] isElimination, SearchColumnBooleanField[] isInactive, SearchColumnStringField[] legalName, SearchColumnStringField[] mainSupportEmailAddress, SearchColumnStringField[] name, SearchColumnStringField[] nameNoHierarchy, SearchColumnSelectField[] nexus, SearchColumnStringField[] phone, SearchColumnDoubleField[] purchaseOrderAmount, SearchColumnDoubleField[] purchaseOrderQuantity, SearchColumnDoubleField[] purchaseOrderQuantityDiff, SearchColumnDoubleField[] receiptAmount, SearchColumnDoubleField[] receiptQuantity, SearchColumnDoubleField[] receiptQuantityDiff, SearchColumnStringField[] state, SearchColumnSelectField[] taxEngine, SearchColumnStringField[] taxIdNum, SearchColumnStringField[] taxRegistrationNumber, SearchColumnStringField[] tranPrefix, SearchColumnStringField[] url, SearchColumnDateField[] validUntil, SearchColumnStringField[] zip, SearchColumnCustomFieldList customFieldList) {
        this.accountingBook = accountingBook;
        this.accountingBookCurrency = accountingBookCurrency;
        this.address1 = address1;
        this.address2 = address2;
        this.address3 = address3;
        this.anonymousCustomerInboundEmail = anonymousCustomerInboundEmail;
        this.anonymousCustomerOnlineForms = anonymousCustomerOnlineForms;
        this.caseAssignmentTemplate = caseAssignmentTemplate;
        this.caseAutomaticClosureTemplate = caseAutomaticClosureTemplate;
        this.caseCopyEmployeeTemplate = caseCopyEmployeeTemplate;
        this.caseCreationTemplate = caseCreationTemplate;
        this.caseEscalationTemplate = caseEscalationTemplate;
        this.caseUpdateTemplate = caseUpdateTemplate;
        this.city = city;
        this.companyNameForSupportMessages = companyNameForSupportMessages;
        this.country = country;
        this.currency = currency;
        this.effectiveFrom = effectiveFrom;
        this.email = email;
        this.employeeCaseUpdateTemplate = employeeCaseUpdateTemplate;
        this.externalId = externalId;
        this.fax = fax;
        this.internalId = internalId;
        this.isElimination = isElimination;
        this.isInactive = isInactive;
        this.legalName = legalName;
        this.mainSupportEmailAddress = mainSupportEmailAddress;
        this.name = name;
        this.nameNoHierarchy = nameNoHierarchy;
        this.nexus = nexus;
        this.phone = phone;
        this.purchaseOrderAmount = purchaseOrderAmount;
        this.purchaseOrderQuantity = purchaseOrderQuantity;
        this.purchaseOrderQuantityDiff = purchaseOrderQuantityDiff;
        this.receiptAmount = receiptAmount;
        this.receiptQuantity = receiptQuantity;
        this.receiptQuantityDiff = receiptQuantityDiff;
        this.state = state;
        this.taxEngine = taxEngine;
        this.taxIdNum = taxIdNum;
        this.taxRegistrationNumber = taxRegistrationNumber;
        this.tranPrefix = tranPrefix;
        this.url = url;
        this.validUntil = validUntil;
        this.zip = zip;
        this.customFieldList = customFieldList;
    }

    public SearchColumnSelectField[] getAccountingBook() {
        return this.accountingBook;
    }

    public void setAccountingBook(SearchColumnSelectField[] accountingBook) {
        this.accountingBook = accountingBook;
    }

    public SearchColumnSelectField getAccountingBook(int i) {
        return this.accountingBook[i];
    }

    public void setAccountingBook(int i, SearchColumnSelectField _value) {
        this.accountingBook[i] = _value;
    }

    public SearchColumnSelectField[] getAccountingBookCurrency() {
        return this.accountingBookCurrency;
    }

    public void setAccountingBookCurrency(SearchColumnSelectField[] accountingBookCurrency) {
        this.accountingBookCurrency = accountingBookCurrency;
    }

    public SearchColumnSelectField getAccountingBookCurrency(int i) {
        return this.accountingBookCurrency[i];
    }

    public void setAccountingBookCurrency(int i, SearchColumnSelectField _value) {
        this.accountingBookCurrency[i] = _value;
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

    public SearchColumnStringField[] getAnonymousCustomerInboundEmail() {
        return this.anonymousCustomerInboundEmail;
    }

    public void setAnonymousCustomerInboundEmail(SearchColumnStringField[] anonymousCustomerInboundEmail) {
        this.anonymousCustomerInboundEmail = anonymousCustomerInboundEmail;
    }

    public SearchColumnStringField getAnonymousCustomerInboundEmail(int i) {
        return this.anonymousCustomerInboundEmail[i];
    }

    public void setAnonymousCustomerInboundEmail(int i, SearchColumnStringField _value) {
        this.anonymousCustomerInboundEmail[i] = _value;
    }

    public SearchColumnStringField[] getAnonymousCustomerOnlineForms() {
        return this.anonymousCustomerOnlineForms;
    }

    public void setAnonymousCustomerOnlineForms(SearchColumnStringField[] anonymousCustomerOnlineForms) {
        this.anonymousCustomerOnlineForms = anonymousCustomerOnlineForms;
    }

    public SearchColumnStringField getAnonymousCustomerOnlineForms(int i) {
        return this.anonymousCustomerOnlineForms[i];
    }

    public void setAnonymousCustomerOnlineForms(int i, SearchColumnStringField _value) {
        this.anonymousCustomerOnlineForms[i] = _value;
    }

    public SearchColumnStringField[] getCaseAssignmentTemplate() {
        return this.caseAssignmentTemplate;
    }

    public void setCaseAssignmentTemplate(SearchColumnStringField[] caseAssignmentTemplate) {
        this.caseAssignmentTemplate = caseAssignmentTemplate;
    }

    public SearchColumnStringField getCaseAssignmentTemplate(int i) {
        return this.caseAssignmentTemplate[i];
    }

    public void setCaseAssignmentTemplate(int i, SearchColumnStringField _value) {
        this.caseAssignmentTemplate[i] = _value;
    }

    public SearchColumnStringField[] getCaseAutomaticClosureTemplate() {
        return this.caseAutomaticClosureTemplate;
    }

    public void setCaseAutomaticClosureTemplate(SearchColumnStringField[] caseAutomaticClosureTemplate) {
        this.caseAutomaticClosureTemplate = caseAutomaticClosureTemplate;
    }

    public SearchColumnStringField getCaseAutomaticClosureTemplate(int i) {
        return this.caseAutomaticClosureTemplate[i];
    }

    public void setCaseAutomaticClosureTemplate(int i, SearchColumnStringField _value) {
        this.caseAutomaticClosureTemplate[i] = _value;
    }

    public SearchColumnStringField[] getCaseCopyEmployeeTemplate() {
        return this.caseCopyEmployeeTemplate;
    }

    public void setCaseCopyEmployeeTemplate(SearchColumnStringField[] caseCopyEmployeeTemplate) {
        this.caseCopyEmployeeTemplate = caseCopyEmployeeTemplate;
    }

    public SearchColumnStringField getCaseCopyEmployeeTemplate(int i) {
        return this.caseCopyEmployeeTemplate[i];
    }

    public void setCaseCopyEmployeeTemplate(int i, SearchColumnStringField _value) {
        this.caseCopyEmployeeTemplate[i] = _value;
    }

    public SearchColumnStringField[] getCaseCreationTemplate() {
        return this.caseCreationTemplate;
    }

    public void setCaseCreationTemplate(SearchColumnStringField[] caseCreationTemplate) {
        this.caseCreationTemplate = caseCreationTemplate;
    }

    public SearchColumnStringField getCaseCreationTemplate(int i) {
        return this.caseCreationTemplate[i];
    }

    public void setCaseCreationTemplate(int i, SearchColumnStringField _value) {
        this.caseCreationTemplate[i] = _value;
    }

    public SearchColumnStringField[] getCaseEscalationTemplate() {
        return this.caseEscalationTemplate;
    }

    public void setCaseEscalationTemplate(SearchColumnStringField[] caseEscalationTemplate) {
        this.caseEscalationTemplate = caseEscalationTemplate;
    }

    public SearchColumnStringField getCaseEscalationTemplate(int i) {
        return this.caseEscalationTemplate[i];
    }

    public void setCaseEscalationTemplate(int i, SearchColumnStringField _value) {
        this.caseEscalationTemplate[i] = _value;
    }

    public SearchColumnStringField[] getCaseUpdateTemplate() {
        return this.caseUpdateTemplate;
    }

    public void setCaseUpdateTemplate(SearchColumnStringField[] caseUpdateTemplate) {
        this.caseUpdateTemplate = caseUpdateTemplate;
    }

    public SearchColumnStringField getCaseUpdateTemplate(int i) {
        return this.caseUpdateTemplate[i];
    }

    public void setCaseUpdateTemplate(int i, SearchColumnStringField _value) {
        this.caseUpdateTemplate[i] = _value;
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

    public SearchColumnStringField[] getCompanyNameForSupportMessages() {
        return this.companyNameForSupportMessages;
    }

    public void setCompanyNameForSupportMessages(SearchColumnStringField[] companyNameForSupportMessages) {
        this.companyNameForSupportMessages = companyNameForSupportMessages;
    }

    public SearchColumnStringField getCompanyNameForSupportMessages(int i) {
        return this.companyNameForSupportMessages[i];
    }

    public void setCompanyNameForSupportMessages(int i, SearchColumnStringField _value) {
        this.companyNameForSupportMessages[i] = _value;
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

    public SearchColumnDateField[] getEffectiveFrom() {
        return this.effectiveFrom;
    }

    public void setEffectiveFrom(SearchColumnDateField[] effectiveFrom) {
        this.effectiveFrom = effectiveFrom;
    }

    public SearchColumnDateField getEffectiveFrom(int i) {
        return this.effectiveFrom[i];
    }

    public void setEffectiveFrom(int i, SearchColumnDateField _value) {
        this.effectiveFrom[i] = _value;
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

    public SearchColumnStringField[] getEmployeeCaseUpdateTemplate() {
        return this.employeeCaseUpdateTemplate;
    }

    public void setEmployeeCaseUpdateTemplate(SearchColumnStringField[] employeeCaseUpdateTemplate) {
        this.employeeCaseUpdateTemplate = employeeCaseUpdateTemplate;
    }

    public SearchColumnStringField getEmployeeCaseUpdateTemplate(int i) {
        return this.employeeCaseUpdateTemplate[i];
    }

    public void setEmployeeCaseUpdateTemplate(int i, SearchColumnStringField _value) {
        this.employeeCaseUpdateTemplate[i] = _value;
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

    public SearchColumnBooleanField[] getIsElimination() {
        return this.isElimination;
    }

    public void setIsElimination(SearchColumnBooleanField[] isElimination) {
        this.isElimination = isElimination;
    }

    public SearchColumnBooleanField getIsElimination(int i) {
        return this.isElimination[i];
    }

    public void setIsElimination(int i, SearchColumnBooleanField _value) {
        this.isElimination[i] = _value;
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

    public SearchColumnStringField[] getLegalName() {
        return this.legalName;
    }

    public void setLegalName(SearchColumnStringField[] legalName) {
        this.legalName = legalName;
    }

    public SearchColumnStringField getLegalName(int i) {
        return this.legalName[i];
    }

    public void setLegalName(int i, SearchColumnStringField _value) {
        this.legalName[i] = _value;
    }

    public SearchColumnStringField[] getMainSupportEmailAddress() {
        return this.mainSupportEmailAddress;
    }

    public void setMainSupportEmailAddress(SearchColumnStringField[] mainSupportEmailAddress) {
        this.mainSupportEmailAddress = mainSupportEmailAddress;
    }

    public SearchColumnStringField getMainSupportEmailAddress(int i) {
        return this.mainSupportEmailAddress[i];
    }

    public void setMainSupportEmailAddress(int i, SearchColumnStringField _value) {
        this.mainSupportEmailAddress[i] = _value;
    }

    public SearchColumnStringField[] getName() {
        return this.name;
    }

    public void setName(SearchColumnStringField[] name) {
        this.name = name;
    }

    public SearchColumnStringField getName(int i) {
        return this.name[i];
    }

    public void setName(int i, SearchColumnStringField _value) {
        this.name[i] = _value;
    }

    public SearchColumnStringField[] getNameNoHierarchy() {
        return this.nameNoHierarchy;
    }

    public void setNameNoHierarchy(SearchColumnStringField[] nameNoHierarchy) {
        this.nameNoHierarchy = nameNoHierarchy;
    }

    public SearchColumnStringField getNameNoHierarchy(int i) {
        return this.nameNoHierarchy[i];
    }

    public void setNameNoHierarchy(int i, SearchColumnStringField _value) {
        this.nameNoHierarchy[i] = _value;
    }

    public SearchColumnSelectField[] getNexus() {
        return this.nexus;
    }

    public void setNexus(SearchColumnSelectField[] nexus) {
        this.nexus = nexus;
    }

    public SearchColumnSelectField getNexus(int i) {
        return this.nexus[i];
    }

    public void setNexus(int i, SearchColumnSelectField _value) {
        this.nexus[i] = _value;
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

    public SearchColumnDoubleField[] getPurchaseOrderAmount() {
        return this.purchaseOrderAmount;
    }

    public void setPurchaseOrderAmount(SearchColumnDoubleField[] purchaseOrderAmount) {
        this.purchaseOrderAmount = purchaseOrderAmount;
    }

    public SearchColumnDoubleField getPurchaseOrderAmount(int i) {
        return this.purchaseOrderAmount[i];
    }

    public void setPurchaseOrderAmount(int i, SearchColumnDoubleField _value) {
        this.purchaseOrderAmount[i] = _value;
    }

    public SearchColumnDoubleField[] getPurchaseOrderQuantity() {
        return this.purchaseOrderQuantity;
    }

    public void setPurchaseOrderQuantity(SearchColumnDoubleField[] purchaseOrderQuantity) {
        this.purchaseOrderQuantity = purchaseOrderQuantity;
    }

    public SearchColumnDoubleField getPurchaseOrderQuantity(int i) {
        return this.purchaseOrderQuantity[i];
    }

    public void setPurchaseOrderQuantity(int i, SearchColumnDoubleField _value) {
        this.purchaseOrderQuantity[i] = _value;
    }

    public SearchColumnDoubleField[] getPurchaseOrderQuantityDiff() {
        return this.purchaseOrderQuantityDiff;
    }

    public void setPurchaseOrderQuantityDiff(SearchColumnDoubleField[] purchaseOrderQuantityDiff) {
        this.purchaseOrderQuantityDiff = purchaseOrderQuantityDiff;
    }

    public SearchColumnDoubleField getPurchaseOrderQuantityDiff(int i) {
        return this.purchaseOrderQuantityDiff[i];
    }

    public void setPurchaseOrderQuantityDiff(int i, SearchColumnDoubleField _value) {
        this.purchaseOrderQuantityDiff[i] = _value;
    }

    public SearchColumnDoubleField[] getReceiptAmount() {
        return this.receiptAmount;
    }

    public void setReceiptAmount(SearchColumnDoubleField[] receiptAmount) {
        this.receiptAmount = receiptAmount;
    }

    public SearchColumnDoubleField getReceiptAmount(int i) {
        return this.receiptAmount[i];
    }

    public void setReceiptAmount(int i, SearchColumnDoubleField _value) {
        this.receiptAmount[i] = _value;
    }

    public SearchColumnDoubleField[] getReceiptQuantity() {
        return this.receiptQuantity;
    }

    public void setReceiptQuantity(SearchColumnDoubleField[] receiptQuantity) {
        this.receiptQuantity = receiptQuantity;
    }

    public SearchColumnDoubleField getReceiptQuantity(int i) {
        return this.receiptQuantity[i];
    }

    public void setReceiptQuantity(int i, SearchColumnDoubleField _value) {
        this.receiptQuantity[i] = _value;
    }

    public SearchColumnDoubleField[] getReceiptQuantityDiff() {
        return this.receiptQuantityDiff;
    }

    public void setReceiptQuantityDiff(SearchColumnDoubleField[] receiptQuantityDiff) {
        this.receiptQuantityDiff = receiptQuantityDiff;
    }

    public SearchColumnDoubleField getReceiptQuantityDiff(int i) {
        return this.receiptQuantityDiff[i];
    }

    public void setReceiptQuantityDiff(int i, SearchColumnDoubleField _value) {
        this.receiptQuantityDiff[i] = _value;
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

    public SearchColumnSelectField[] getTaxEngine() {
        return this.taxEngine;
    }

    public void setTaxEngine(SearchColumnSelectField[] taxEngine) {
        this.taxEngine = taxEngine;
    }

    public SearchColumnSelectField getTaxEngine(int i) {
        return this.taxEngine[i];
    }

    public void setTaxEngine(int i, SearchColumnSelectField _value) {
        this.taxEngine[i] = _value;
    }

    public SearchColumnStringField[] getTaxIdNum() {
        return this.taxIdNum;
    }

    public void setTaxIdNum(SearchColumnStringField[] taxIdNum) {
        this.taxIdNum = taxIdNum;
    }

    public SearchColumnStringField getTaxIdNum(int i) {
        return this.taxIdNum[i];
    }

    public void setTaxIdNum(int i, SearchColumnStringField _value) {
        this.taxIdNum[i] = _value;
    }

    public SearchColumnStringField[] getTaxRegistrationNumber() {
        return this.taxRegistrationNumber;
    }

    public void setTaxRegistrationNumber(SearchColumnStringField[] taxRegistrationNumber) {
        this.taxRegistrationNumber = taxRegistrationNumber;
    }

    public SearchColumnStringField getTaxRegistrationNumber(int i) {
        return this.taxRegistrationNumber[i];
    }

    public void setTaxRegistrationNumber(int i, SearchColumnStringField _value) {
        this.taxRegistrationNumber[i] = _value;
    }

    public SearchColumnStringField[] getTranPrefix() {
        return this.tranPrefix;
    }

    public void setTranPrefix(SearchColumnStringField[] tranPrefix) {
        this.tranPrefix = tranPrefix;
    }

    public SearchColumnStringField getTranPrefix(int i) {
        return this.tranPrefix[i];
    }

    public void setTranPrefix(int i, SearchColumnStringField _value) {
        this.tranPrefix[i] = _value;
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

    public SearchColumnDateField[] getValidUntil() {
        return this.validUntil;
    }

    public void setValidUntil(SearchColumnDateField[] validUntil) {
        this.validUntil = validUntil;
    }

    public SearchColumnDateField getValidUntil(int i) {
        return this.validUntil[i];
    }

    public void setValidUntil(int i, SearchColumnDateField _value) {
        this.validUntil[i] = _value;
    }

    public SearchColumnStringField[] getZip() {
        return this.zip;
    }

    public void setZip(SearchColumnStringField[] zip) {
        this.zip = zip;
    }

    public SearchColumnStringField getZip(int i) {
        return this.zip[i];
    }

    public void setZip(int i, SearchColumnStringField _value) {
        this.zip[i] = _value;
    }

    public SearchColumnCustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SubsidiarySearchRowBasic)) {
            return false;
        }
        SubsidiarySearchRowBasic other = (SubsidiarySearchRowBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.accountingBook == null && other.getAccountingBook() == null || this.accountingBook != null && Arrays.equals(this.accountingBook, other.getAccountingBook())) && (this.accountingBookCurrency == null && other.getAccountingBookCurrency() == null || this.accountingBookCurrency != null && Arrays.equals(this.accountingBookCurrency, other.getAccountingBookCurrency())) && (this.address1 == null && other.getAddress1() == null || this.address1 != null && Arrays.equals(this.address1, other.getAddress1())) && (this.address2 == null && other.getAddress2() == null || this.address2 != null && Arrays.equals(this.address2, other.getAddress2())) && (this.address3 == null && other.getAddress3() == null || this.address3 != null && Arrays.equals(this.address3, other.getAddress3())) && (this.anonymousCustomerInboundEmail == null && other.getAnonymousCustomerInboundEmail() == null || this.anonymousCustomerInboundEmail != null && Arrays.equals(this.anonymousCustomerInboundEmail, other.getAnonymousCustomerInboundEmail())) && (this.anonymousCustomerOnlineForms == null && other.getAnonymousCustomerOnlineForms() == null || this.anonymousCustomerOnlineForms != null && Arrays.equals(this.anonymousCustomerOnlineForms, other.getAnonymousCustomerOnlineForms())) && (this.caseAssignmentTemplate == null && other.getCaseAssignmentTemplate() == null || this.caseAssignmentTemplate != null && Arrays.equals(this.caseAssignmentTemplate, other.getCaseAssignmentTemplate())) && (this.caseAutomaticClosureTemplate == null && other.getCaseAutomaticClosureTemplate() == null || this.caseAutomaticClosureTemplate != null && Arrays.equals(this.caseAutomaticClosureTemplate, other.getCaseAutomaticClosureTemplate())) && (this.caseCopyEmployeeTemplate == null && other.getCaseCopyEmployeeTemplate() == null || this.caseCopyEmployeeTemplate != null && Arrays.equals(this.caseCopyEmployeeTemplate, other.getCaseCopyEmployeeTemplate())) && (this.caseCreationTemplate == null && other.getCaseCreationTemplate() == null || this.caseCreationTemplate != null && Arrays.equals(this.caseCreationTemplate, other.getCaseCreationTemplate())) && (this.caseEscalationTemplate == null && other.getCaseEscalationTemplate() == null || this.caseEscalationTemplate != null && Arrays.equals(this.caseEscalationTemplate, other.getCaseEscalationTemplate())) && (this.caseUpdateTemplate == null && other.getCaseUpdateTemplate() == null || this.caseUpdateTemplate != null && Arrays.equals(this.caseUpdateTemplate, other.getCaseUpdateTemplate())) && (this.city == null && other.getCity() == null || this.city != null && Arrays.equals(this.city, other.getCity())) && (this.companyNameForSupportMessages == null && other.getCompanyNameForSupportMessages() == null || this.companyNameForSupportMessages != null && Arrays.equals(this.companyNameForSupportMessages, other.getCompanyNameForSupportMessages())) && (this.country == null && other.getCountry() == null || this.country != null && Arrays.equals(this.country, other.getCountry())) && (this.currency == null && other.getCurrency() == null || this.currency != null && Arrays.equals(this.currency, other.getCurrency())) && (this.effectiveFrom == null && other.getEffectiveFrom() == null || this.effectiveFrom != null && Arrays.equals(this.effectiveFrom, other.getEffectiveFrom())) && (this.email == null && other.getEmail() == null || this.email != null && Arrays.equals(this.email, other.getEmail())) && (this.employeeCaseUpdateTemplate == null && other.getEmployeeCaseUpdateTemplate() == null || this.employeeCaseUpdateTemplate != null && Arrays.equals(this.employeeCaseUpdateTemplate, other.getEmployeeCaseUpdateTemplate())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && Arrays.equals(this.externalId, other.getExternalId())) && (this.fax == null && other.getFax() == null || this.fax != null && Arrays.equals(this.fax, other.getFax())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && Arrays.equals(this.internalId, other.getInternalId())) && (this.isElimination == null && other.getIsElimination() == null || this.isElimination != null && Arrays.equals(this.isElimination, other.getIsElimination())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && Arrays.equals(this.isInactive, other.getIsInactive())) && (this.legalName == null && other.getLegalName() == null || this.legalName != null && Arrays.equals(this.legalName, other.getLegalName())) && (this.mainSupportEmailAddress == null && other.getMainSupportEmailAddress() == null || this.mainSupportEmailAddress != null && Arrays.equals(this.mainSupportEmailAddress, other.getMainSupportEmailAddress())) && (this.name == null && other.getName() == null || this.name != null && Arrays.equals(this.name, other.getName())) && (this.nameNoHierarchy == null && other.getNameNoHierarchy() == null || this.nameNoHierarchy != null && Arrays.equals(this.nameNoHierarchy, other.getNameNoHierarchy())) && (this.nexus == null && other.getNexus() == null || this.nexus != null && Arrays.equals(this.nexus, other.getNexus())) && (this.phone == null && other.getPhone() == null || this.phone != null && Arrays.equals(this.phone, other.getPhone())) && (this.purchaseOrderAmount == null && other.getPurchaseOrderAmount() == null || this.purchaseOrderAmount != null && Arrays.equals(this.purchaseOrderAmount, other.getPurchaseOrderAmount())) && (this.purchaseOrderQuantity == null && other.getPurchaseOrderQuantity() == null || this.purchaseOrderQuantity != null && Arrays.equals(this.purchaseOrderQuantity, other.getPurchaseOrderQuantity())) && (this.purchaseOrderQuantityDiff == null && other.getPurchaseOrderQuantityDiff() == null || this.purchaseOrderQuantityDiff != null && Arrays.equals(this.purchaseOrderQuantityDiff, other.getPurchaseOrderQuantityDiff())) && (this.receiptAmount == null && other.getReceiptAmount() == null || this.receiptAmount != null && Arrays.equals(this.receiptAmount, other.getReceiptAmount())) && (this.receiptQuantity == null && other.getReceiptQuantity() == null || this.receiptQuantity != null && Arrays.equals(this.receiptQuantity, other.getReceiptQuantity())) && (this.receiptQuantityDiff == null && other.getReceiptQuantityDiff() == null || this.receiptQuantityDiff != null && Arrays.equals(this.receiptQuantityDiff, other.getReceiptQuantityDiff())) && (this.state == null && other.getState() == null || this.state != null && Arrays.equals(this.state, other.getState())) && (this.taxEngine == null && other.getTaxEngine() == null || this.taxEngine != null && Arrays.equals(this.taxEngine, other.getTaxEngine())) && (this.taxIdNum == null && other.getTaxIdNum() == null || this.taxIdNum != null && Arrays.equals(this.taxIdNum, other.getTaxIdNum())) && (this.taxRegistrationNumber == null && other.getTaxRegistrationNumber() == null || this.taxRegistrationNumber != null && Arrays.equals(this.taxRegistrationNumber, other.getTaxRegistrationNumber())) && (this.tranPrefix == null && other.getTranPrefix() == null || this.tranPrefix != null && Arrays.equals(this.tranPrefix, other.getTranPrefix())) && (this.url == null && other.getUrl() == null || this.url != null && Arrays.equals(this.url, other.getUrl())) && (this.validUntil == null && other.getValidUntil() == null || this.validUntil != null && Arrays.equals(this.validUntil, other.getValidUntil())) && (this.zip == null && other.getZip() == null || this.zip != null && Arrays.equals(this.zip, other.getZip())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
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
        if (this.getAccountingBook() != null) {
            for (i = 0; i < Array.getLength(this.getAccountingBook()); ++i) {
                obj = Array.get(this.getAccountingBook(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAccountingBookCurrency() != null) {
            for (i = 0; i < Array.getLength(this.getAccountingBookCurrency()); ++i) {
                obj = Array.get(this.getAccountingBookCurrency(), i);
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
        if (this.getAnonymousCustomerInboundEmail() != null) {
            for (i = 0; i < Array.getLength(this.getAnonymousCustomerInboundEmail()); ++i) {
                obj = Array.get(this.getAnonymousCustomerInboundEmail(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAnonymousCustomerOnlineForms() != null) {
            for (i = 0; i < Array.getLength(this.getAnonymousCustomerOnlineForms()); ++i) {
                obj = Array.get(this.getAnonymousCustomerOnlineForms(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCaseAssignmentTemplate() != null) {
            for (i = 0; i < Array.getLength(this.getCaseAssignmentTemplate()); ++i) {
                obj = Array.get(this.getCaseAssignmentTemplate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCaseAutomaticClosureTemplate() != null) {
            for (i = 0; i < Array.getLength(this.getCaseAutomaticClosureTemplate()); ++i) {
                obj = Array.get(this.getCaseAutomaticClosureTemplate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCaseCopyEmployeeTemplate() != null) {
            for (i = 0; i < Array.getLength(this.getCaseCopyEmployeeTemplate()); ++i) {
                obj = Array.get(this.getCaseCopyEmployeeTemplate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCaseCreationTemplate() != null) {
            for (i = 0; i < Array.getLength(this.getCaseCreationTemplate()); ++i) {
                obj = Array.get(this.getCaseCreationTemplate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCaseEscalationTemplate() != null) {
            for (i = 0; i < Array.getLength(this.getCaseEscalationTemplate()); ++i) {
                obj = Array.get(this.getCaseEscalationTemplate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCaseUpdateTemplate() != null) {
            for (i = 0; i < Array.getLength(this.getCaseUpdateTemplate()); ++i) {
                obj = Array.get(this.getCaseUpdateTemplate(), i);
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
        if (this.getCompanyNameForSupportMessages() != null) {
            for (i = 0; i < Array.getLength(this.getCompanyNameForSupportMessages()); ++i) {
                obj = Array.get(this.getCompanyNameForSupportMessages(), i);
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
        if (this.getCurrency() != null) {
            for (i = 0; i < Array.getLength(this.getCurrency()); ++i) {
                obj = Array.get(this.getCurrency(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getEffectiveFrom() != null) {
            for (i = 0; i < Array.getLength(this.getEffectiveFrom()); ++i) {
                obj = Array.get(this.getEffectiveFrom(), i);
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
        if (this.getEmployeeCaseUpdateTemplate() != null) {
            for (i = 0; i < Array.getLength(this.getEmployeeCaseUpdateTemplate()); ++i) {
                obj = Array.get(this.getEmployeeCaseUpdateTemplate(), i);
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
        if (this.getInternalId() != null) {
            for (i = 0; i < Array.getLength(this.getInternalId()); ++i) {
                obj = Array.get(this.getInternalId(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsElimination() != null) {
            for (i = 0; i < Array.getLength(this.getIsElimination()); ++i) {
                obj = Array.get(this.getIsElimination(), i);
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
        if (this.getLegalName() != null) {
            for (i = 0; i < Array.getLength(this.getLegalName()); ++i) {
                obj = Array.get(this.getLegalName(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getMainSupportEmailAddress() != null) {
            for (i = 0; i < Array.getLength(this.getMainSupportEmailAddress()); ++i) {
                obj = Array.get(this.getMainSupportEmailAddress(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getName() != null) {
            for (i = 0; i < Array.getLength(this.getName()); ++i) {
                obj = Array.get(this.getName(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getNameNoHierarchy() != null) {
            for (i = 0; i < Array.getLength(this.getNameNoHierarchy()); ++i) {
                obj = Array.get(this.getNameNoHierarchy(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getNexus() != null) {
            for (i = 0; i < Array.getLength(this.getNexus()); ++i) {
                obj = Array.get(this.getNexus(), i);
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
        if (this.getPurchaseOrderAmount() != null) {
            for (i = 0; i < Array.getLength(this.getPurchaseOrderAmount()); ++i) {
                obj = Array.get(this.getPurchaseOrderAmount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPurchaseOrderQuantity() != null) {
            for (i = 0; i < Array.getLength(this.getPurchaseOrderQuantity()); ++i) {
                obj = Array.get(this.getPurchaseOrderQuantity(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPurchaseOrderQuantityDiff() != null) {
            for (i = 0; i < Array.getLength(this.getPurchaseOrderQuantityDiff()); ++i) {
                obj = Array.get(this.getPurchaseOrderQuantityDiff(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getReceiptAmount() != null) {
            for (i = 0; i < Array.getLength(this.getReceiptAmount()); ++i) {
                obj = Array.get(this.getReceiptAmount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getReceiptQuantity() != null) {
            for (i = 0; i < Array.getLength(this.getReceiptQuantity()); ++i) {
                obj = Array.get(this.getReceiptQuantity(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getReceiptQuantityDiff() != null) {
            for (i = 0; i < Array.getLength(this.getReceiptQuantityDiff()); ++i) {
                obj = Array.get(this.getReceiptQuantityDiff(), i);
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
        if (this.getTaxEngine() != null) {
            for (i = 0; i < Array.getLength(this.getTaxEngine()); ++i) {
                obj = Array.get(this.getTaxEngine(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTaxIdNum() != null) {
            for (i = 0; i < Array.getLength(this.getTaxIdNum()); ++i) {
                obj = Array.get(this.getTaxIdNum(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTaxRegistrationNumber() != null) {
            for (i = 0; i < Array.getLength(this.getTaxRegistrationNumber()); ++i) {
                obj = Array.get(this.getTaxRegistrationNumber(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTranPrefix() != null) {
            for (i = 0; i < Array.getLength(this.getTranPrefix()); ++i) {
                obj = Array.get(this.getTranPrefix(), i);
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
        if (this.getValidUntil() != null) {
            for (i = 0; i < Array.getLength(this.getValidUntil()); ++i) {
                obj = Array.get(this.getValidUntil(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getZip() != null) {
            for (i = 0; i < Array.getLength(this.getZip()); ++i) {
                obj = Array.get(this.getZip(), i);
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "SubsidiarySearchRowBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("accountingBook");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "accountingBook"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("accountingBookCurrency");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "accountingBookCurrency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("anonymousCustomerInboundEmail");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "anonymousCustomerInboundEmail"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("anonymousCustomerOnlineForms");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "anonymousCustomerOnlineForms"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("caseAssignmentTemplate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "caseAssignmentTemplate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("caseAutomaticClosureTemplate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "caseAutomaticClosureTemplate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("caseCopyEmployeeTemplate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "caseCopyEmployeeTemplate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("caseCreationTemplate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "caseCreationTemplate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("caseEscalationTemplate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "caseEscalationTemplate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("caseUpdateTemplate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "caseUpdateTemplate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("companyNameForSupportMessages");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "companyNameForSupportMessages"));
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
        elemField.setFieldName("currency");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("effectiveFrom");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "effectiveFrom"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
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
        elemField.setFieldName("employeeCaseUpdateTemplate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "employeeCaseUpdateTemplate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("internalId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isElimination");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isElimination"));
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
        elemField.setFieldName("legalName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "legalName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("mainSupportEmailAddress");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "mainSupportEmailAddress"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "name"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("nameNoHierarchy");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "nameNoHierarchy"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("nexus");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "nexus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("purchaseOrderAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "purchaseOrderAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("purchaseOrderQuantity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "purchaseOrderQuantity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("purchaseOrderQuantityDiff");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "purchaseOrderQuantityDiff"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("receiptAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "receiptAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("receiptQuantity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "receiptQuantity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("receiptQuantityDiff");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "receiptQuantityDiff"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
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
        elemField.setFieldName("taxEngine");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "taxEngine"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxIdNum");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "taxIdNum"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxRegistrationNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "taxRegistrationNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("tranPrefix");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "tranPrefix"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("validUntil");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "validUntil"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("zip");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "zip"));
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

