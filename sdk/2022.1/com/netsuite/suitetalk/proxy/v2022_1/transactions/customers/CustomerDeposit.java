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
package com.netsuite.suitetalk.proxy.v2022_1.transactions.customers;

import com.netsuite.suitetalk.proxy.v2022_1.platform.common.AccountingBookDetailList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.types.AvsMatchCode;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.CustomFieldList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.NullField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.Record;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.customers.CustomerDepositApplyList;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.customers.types.CustomerDepositHandlingMode;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.customers.types.CustomerDepositPaymentOperation;
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

public class CustomerDeposit
extends Record
implements Serializable {
    private Calendar createdDate;
    private Calendar lastModifiedDate;
    private String status;
    private RecordRef customer;
    private RecordRef salesOrder;
    private RecordRef customForm;
    private Double payment;
    private RecordRef currency;
    private Calendar tranDate;
    private RecordRef postingPeriod;
    private RecordRef paymentMethod;
    private Boolean ccIsPurchaseCardBin;
    private String memo;
    private Boolean ccProcessAsPurchaseCard;
    private String currencyName;
    private Double exchangeRate;
    private String checkNum;
    private RecordRef creditCardProcessor;
    private RecordRef creditCard;
    private String ccSecurityCode;
    private String ccNumber;
    private RecordRef subsidiary;
    private RecordRef department;
    private RecordRef _class;
    private RecordRef location;
    private RecordRef paymentOption;
    private String inputAuthCode;
    private String inputReferenceCode;
    private String checkNumber;
    private String paymentCardCsc;
    private RecordRef paymentProcessingProfile;
    private CustomerDepositHandlingMode handlingMode;
    private String outputAuthCode;
    private String outputReferenceCode;
    private CustomerDepositPaymentOperation paymentOperation;
    private String dynamicDescriptor;
    private Calendar ccExpireDate;
    private String debitCardIssueNo;
    private Calendar validFrom;
    private String ccName;
    private String ccStreet;
    private String ccZipCode;
    private Boolean chargeIt;
    private Boolean ccApproved;
    private String pnRefNum;
    private String authCode;
    private AvsMatchCode ccAvsStreetMatch;
    private String softDescriptor;
    private AvsMatchCode ccAvsZipMatch;
    private Boolean isRecurringPayment;
    private AvsMatchCode ccSecurityCodeMatch;
    private String threeDStatusCode;
    private Boolean ignoreAvs;
    private RecordRef account;
    private Boolean undepFunds;
    private String tranId;
    private CustomerDepositApplyList applyList;
    private AccountingBookDetailList accountingBookDetailList;
    private Double salesOrderRequiredDepositDue;
    private CustomFieldList customFieldList;
    private String internalId;
    private String externalId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(CustomerDeposit.class, true);

    public CustomerDeposit() {
    }

    public CustomerDeposit(NullField nullFieldList, String internalId, String externalId, Calendar createdDate, Calendar lastModifiedDate, String status, RecordRef customer, RecordRef salesOrder, RecordRef customForm, Double payment, RecordRef currency, Calendar tranDate, RecordRef postingPeriod, RecordRef paymentMethod, Boolean ccIsPurchaseCardBin, String memo, Boolean ccProcessAsPurchaseCard, String currencyName, Double exchangeRate, String checkNum, RecordRef creditCardProcessor, RecordRef creditCard, String ccSecurityCode, String ccNumber, RecordRef subsidiary, RecordRef department, RecordRef _class, RecordRef location, RecordRef paymentOption, String inputAuthCode, String inputReferenceCode, String checkNumber, String paymentCardCsc, RecordRef paymentProcessingProfile, CustomerDepositHandlingMode handlingMode, String outputAuthCode, String outputReferenceCode, CustomerDepositPaymentOperation paymentOperation, String dynamicDescriptor, Calendar ccExpireDate, String debitCardIssueNo, Calendar validFrom, String ccName, String ccStreet, String ccZipCode, Boolean chargeIt, Boolean ccApproved, String pnRefNum, String authCode, AvsMatchCode ccAvsStreetMatch, String softDescriptor, AvsMatchCode ccAvsZipMatch, Boolean isRecurringPayment, AvsMatchCode ccSecurityCodeMatch, String threeDStatusCode, Boolean ignoreAvs, RecordRef account, Boolean undepFunds, String tranId, CustomerDepositApplyList applyList, AccountingBookDetailList accountingBookDetailList, Double salesOrderRequiredDepositDue, CustomFieldList customFieldList) {
        super(nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.status = status;
        this.customer = customer;
        this.salesOrder = salesOrder;
        this.customForm = customForm;
        this.payment = payment;
        this.currency = currency;
        this.tranDate = tranDate;
        this.postingPeriod = postingPeriod;
        this.paymentMethod = paymentMethod;
        this.ccIsPurchaseCardBin = ccIsPurchaseCardBin;
        this.memo = memo;
        this.ccProcessAsPurchaseCard = ccProcessAsPurchaseCard;
        this.currencyName = currencyName;
        this.exchangeRate = exchangeRate;
        this.checkNum = checkNum;
        this.creditCardProcessor = creditCardProcessor;
        this.creditCard = creditCard;
        this.ccSecurityCode = ccSecurityCode;
        this.ccNumber = ccNumber;
        this.subsidiary = subsidiary;
        this.department = department;
        this._class = _class;
        this.location = location;
        this.paymentOption = paymentOption;
        this.inputAuthCode = inputAuthCode;
        this.inputReferenceCode = inputReferenceCode;
        this.checkNumber = checkNumber;
        this.paymentCardCsc = paymentCardCsc;
        this.paymentProcessingProfile = paymentProcessingProfile;
        this.handlingMode = handlingMode;
        this.outputAuthCode = outputAuthCode;
        this.outputReferenceCode = outputReferenceCode;
        this.paymentOperation = paymentOperation;
        this.dynamicDescriptor = dynamicDescriptor;
        this.ccExpireDate = ccExpireDate;
        this.debitCardIssueNo = debitCardIssueNo;
        this.validFrom = validFrom;
        this.ccName = ccName;
        this.ccStreet = ccStreet;
        this.ccZipCode = ccZipCode;
        this.chargeIt = chargeIt;
        this.ccApproved = ccApproved;
        this.pnRefNum = pnRefNum;
        this.authCode = authCode;
        this.ccAvsStreetMatch = ccAvsStreetMatch;
        this.softDescriptor = softDescriptor;
        this.ccAvsZipMatch = ccAvsZipMatch;
        this.isRecurringPayment = isRecurringPayment;
        this.ccSecurityCodeMatch = ccSecurityCodeMatch;
        this.threeDStatusCode = threeDStatusCode;
        this.ignoreAvs = ignoreAvs;
        this.account = account;
        this.undepFunds = undepFunds;
        this.tranId = tranId;
        this.applyList = applyList;
        this.accountingBookDetailList = accountingBookDetailList;
        this.salesOrderRequiredDepositDue = salesOrderRequiredDepositDue;
        this.customFieldList = customFieldList;
    }

    public Calendar getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(Calendar createdDate) {
        this.createdDate = createdDate;
    }

    public Calendar getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    public void setLastModifiedDate(Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public RecordRef getCustomer() {
        return this.customer;
    }

    public void setCustomer(RecordRef customer) {
        this.customer = customer;
    }

    public RecordRef getSalesOrder() {
        return this.salesOrder;
    }

    public void setSalesOrder(RecordRef salesOrder) {
        this.salesOrder = salesOrder;
    }

    public RecordRef getCustomForm() {
        return this.customForm;
    }

    public void setCustomForm(RecordRef customForm) {
        this.customForm = customForm;
    }

    public Double getPayment() {
        return this.payment;
    }

    public void setPayment(Double payment) {
        this.payment = payment;
    }

    public RecordRef getCurrency() {
        return this.currency;
    }

    public void setCurrency(RecordRef currency) {
        this.currency = currency;
    }

    public Calendar getTranDate() {
        return this.tranDate;
    }

    public void setTranDate(Calendar tranDate) {
        this.tranDate = tranDate;
    }

    public RecordRef getPostingPeriod() {
        return this.postingPeriod;
    }

    public void setPostingPeriod(RecordRef postingPeriod) {
        this.postingPeriod = postingPeriod;
    }

    public RecordRef getPaymentMethod() {
        return this.paymentMethod;
    }

    public void setPaymentMethod(RecordRef paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public Boolean getCcIsPurchaseCardBin() {
        return this.ccIsPurchaseCardBin;
    }

    public void setCcIsPurchaseCardBin(Boolean ccIsPurchaseCardBin) {
        this.ccIsPurchaseCardBin = ccIsPurchaseCardBin;
    }

    public String getMemo() {
        return this.memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Boolean getCcProcessAsPurchaseCard() {
        return this.ccProcessAsPurchaseCard;
    }

    public void setCcProcessAsPurchaseCard(Boolean ccProcessAsPurchaseCard) {
        this.ccProcessAsPurchaseCard = ccProcessAsPurchaseCard;
    }

    public String getCurrencyName() {
        return this.currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public Double getExchangeRate() {
        return this.exchangeRate;
    }

    public void setExchangeRate(Double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public String getCheckNum() {
        return this.checkNum;
    }

    public void setCheckNum(String checkNum) {
        this.checkNum = checkNum;
    }

    public RecordRef getCreditCardProcessor() {
        return this.creditCardProcessor;
    }

    public void setCreditCardProcessor(RecordRef creditCardProcessor) {
        this.creditCardProcessor = creditCardProcessor;
    }

    public RecordRef getCreditCard() {
        return this.creditCard;
    }

    public void setCreditCard(RecordRef creditCard) {
        this.creditCard = creditCard;
    }

    public String getCcSecurityCode() {
        return this.ccSecurityCode;
    }

    public void setCcSecurityCode(String ccSecurityCode) {
        this.ccSecurityCode = ccSecurityCode;
    }

    public String getCcNumber() {
        return this.ccNumber;
    }

    public void setCcNumber(String ccNumber) {
        this.ccNumber = ccNumber;
    }

    public RecordRef getSubsidiary() {
        return this.subsidiary;
    }

    public void setSubsidiary(RecordRef subsidiary) {
        this.subsidiary = subsidiary;
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

    public RecordRef getPaymentOption() {
        return this.paymentOption;
    }

    public void setPaymentOption(RecordRef paymentOption) {
        this.paymentOption = paymentOption;
    }

    public String getInputAuthCode() {
        return this.inputAuthCode;
    }

    public void setInputAuthCode(String inputAuthCode) {
        this.inputAuthCode = inputAuthCode;
    }

    public String getInputReferenceCode() {
        return this.inputReferenceCode;
    }

    public void setInputReferenceCode(String inputReferenceCode) {
        this.inputReferenceCode = inputReferenceCode;
    }

    public String getCheckNumber() {
        return this.checkNumber;
    }

    public void setCheckNumber(String checkNumber) {
        this.checkNumber = checkNumber;
    }

    public String getPaymentCardCsc() {
        return this.paymentCardCsc;
    }

    public void setPaymentCardCsc(String paymentCardCsc) {
        this.paymentCardCsc = paymentCardCsc;
    }

    public RecordRef getPaymentProcessingProfile() {
        return this.paymentProcessingProfile;
    }

    public void setPaymentProcessingProfile(RecordRef paymentProcessingProfile) {
        this.paymentProcessingProfile = paymentProcessingProfile;
    }

    public CustomerDepositHandlingMode getHandlingMode() {
        return this.handlingMode;
    }

    public void setHandlingMode(CustomerDepositHandlingMode handlingMode) {
        this.handlingMode = handlingMode;
    }

    public String getOutputAuthCode() {
        return this.outputAuthCode;
    }

    public void setOutputAuthCode(String outputAuthCode) {
        this.outputAuthCode = outputAuthCode;
    }

    public String getOutputReferenceCode() {
        return this.outputReferenceCode;
    }

    public void setOutputReferenceCode(String outputReferenceCode) {
        this.outputReferenceCode = outputReferenceCode;
    }

    public CustomerDepositPaymentOperation getPaymentOperation() {
        return this.paymentOperation;
    }

    public void setPaymentOperation(CustomerDepositPaymentOperation paymentOperation) {
        this.paymentOperation = paymentOperation;
    }

    public String getDynamicDescriptor() {
        return this.dynamicDescriptor;
    }

    public void setDynamicDescriptor(String dynamicDescriptor) {
        this.dynamicDescriptor = dynamicDescriptor;
    }

    public Calendar getCcExpireDate() {
        return this.ccExpireDate;
    }

    public void setCcExpireDate(Calendar ccExpireDate) {
        this.ccExpireDate = ccExpireDate;
    }

    public String getDebitCardIssueNo() {
        return this.debitCardIssueNo;
    }

    public void setDebitCardIssueNo(String debitCardIssueNo) {
        this.debitCardIssueNo = debitCardIssueNo;
    }

    public Calendar getValidFrom() {
        return this.validFrom;
    }

    public void setValidFrom(Calendar validFrom) {
        this.validFrom = validFrom;
    }

    public String getCcName() {
        return this.ccName;
    }

    public void setCcName(String ccName) {
        this.ccName = ccName;
    }

    public String getCcStreet() {
        return this.ccStreet;
    }

    public void setCcStreet(String ccStreet) {
        this.ccStreet = ccStreet;
    }

    public String getCcZipCode() {
        return this.ccZipCode;
    }

    public void setCcZipCode(String ccZipCode) {
        this.ccZipCode = ccZipCode;
    }

    public Boolean getChargeIt() {
        return this.chargeIt;
    }

    public void setChargeIt(Boolean chargeIt) {
        this.chargeIt = chargeIt;
    }

    public Boolean getCcApproved() {
        return this.ccApproved;
    }

    public void setCcApproved(Boolean ccApproved) {
        this.ccApproved = ccApproved;
    }

    public String getPnRefNum() {
        return this.pnRefNum;
    }

    public void setPnRefNum(String pnRefNum) {
        this.pnRefNum = pnRefNum;
    }

    public String getAuthCode() {
        return this.authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    public AvsMatchCode getCcAvsStreetMatch() {
        return this.ccAvsStreetMatch;
    }

    public void setCcAvsStreetMatch(AvsMatchCode ccAvsStreetMatch) {
        this.ccAvsStreetMatch = ccAvsStreetMatch;
    }

    public String getSoftDescriptor() {
        return this.softDescriptor;
    }

    public void setSoftDescriptor(String softDescriptor) {
        this.softDescriptor = softDescriptor;
    }

    public AvsMatchCode getCcAvsZipMatch() {
        return this.ccAvsZipMatch;
    }

    public void setCcAvsZipMatch(AvsMatchCode ccAvsZipMatch) {
        this.ccAvsZipMatch = ccAvsZipMatch;
    }

    public Boolean getIsRecurringPayment() {
        return this.isRecurringPayment;
    }

    public void setIsRecurringPayment(Boolean isRecurringPayment) {
        this.isRecurringPayment = isRecurringPayment;
    }

    public AvsMatchCode getCcSecurityCodeMatch() {
        return this.ccSecurityCodeMatch;
    }

    public void setCcSecurityCodeMatch(AvsMatchCode ccSecurityCodeMatch) {
        this.ccSecurityCodeMatch = ccSecurityCodeMatch;
    }

    public String getThreeDStatusCode() {
        return this.threeDStatusCode;
    }

    public void setThreeDStatusCode(String threeDStatusCode) {
        this.threeDStatusCode = threeDStatusCode;
    }

    public Boolean getIgnoreAvs() {
        return this.ignoreAvs;
    }

    public void setIgnoreAvs(Boolean ignoreAvs) {
        this.ignoreAvs = ignoreAvs;
    }

    public RecordRef getAccount() {
        return this.account;
    }

    public void setAccount(RecordRef account) {
        this.account = account;
    }

    public Boolean getUndepFunds() {
        return this.undepFunds;
    }

    public void setUndepFunds(Boolean undepFunds) {
        this.undepFunds = undepFunds;
    }

    public String getTranId() {
        return this.tranId;
    }

    public void setTranId(String tranId) {
        this.tranId = tranId;
    }

    public CustomerDepositApplyList getApplyList() {
        return this.applyList;
    }

    public void setApplyList(CustomerDepositApplyList applyList) {
        this.applyList = applyList;
    }

    public AccountingBookDetailList getAccountingBookDetailList() {
        return this.accountingBookDetailList;
    }

    public void setAccountingBookDetailList(AccountingBookDetailList accountingBookDetailList) {
        this.accountingBookDetailList = accountingBookDetailList;
    }

    public Double getSalesOrderRequiredDepositDue() {
        return this.salesOrderRequiredDepositDue;
    }

    public void setSalesOrderRequiredDepositDue(Double salesOrderRequiredDepositDue) {
        this.salesOrderRequiredDepositDue = salesOrderRequiredDepositDue;
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
        if (!(obj instanceof CustomerDeposit)) {
            return false;
        }
        CustomerDeposit other = (CustomerDeposit)obj;
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
        boolean _equals = super.equals(obj) && (this.createdDate == null && other.getCreatedDate() == null || this.createdDate != null && this.createdDate.equals(other.getCreatedDate())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && this.lastModifiedDate.equals(other.getLastModifiedDate())) && (this.status == null && other.getStatus() == null || this.status != null && this.status.equals(other.getStatus())) && (this.customer == null && other.getCustomer() == null || this.customer != null && this.customer.equals(other.getCustomer())) && (this.salesOrder == null && other.getSalesOrder() == null || this.salesOrder != null && this.salesOrder.equals(other.getSalesOrder())) && (this.customForm == null && other.getCustomForm() == null || this.customForm != null && this.customForm.equals(other.getCustomForm())) && (this.payment == null && other.getPayment() == null || this.payment != null && this.payment.equals(other.getPayment())) && (this.currency == null && other.getCurrency() == null || this.currency != null && this.currency.equals(other.getCurrency())) && (this.tranDate == null && other.getTranDate() == null || this.tranDate != null && this.tranDate.equals(other.getTranDate())) && (this.postingPeriod == null && other.getPostingPeriod() == null || this.postingPeriod != null && this.postingPeriod.equals(other.getPostingPeriod())) && (this.paymentMethod == null && other.getPaymentMethod() == null || this.paymentMethod != null && this.paymentMethod.equals(other.getPaymentMethod())) && (this.ccIsPurchaseCardBin == null && other.getCcIsPurchaseCardBin() == null || this.ccIsPurchaseCardBin != null && this.ccIsPurchaseCardBin.equals(other.getCcIsPurchaseCardBin())) && (this.memo == null && other.getMemo() == null || this.memo != null && this.memo.equals(other.getMemo())) && (this.ccProcessAsPurchaseCard == null && other.getCcProcessAsPurchaseCard() == null || this.ccProcessAsPurchaseCard != null && this.ccProcessAsPurchaseCard.equals(other.getCcProcessAsPurchaseCard())) && (this.currencyName == null && other.getCurrencyName() == null || this.currencyName != null && this.currencyName.equals(other.getCurrencyName())) && (this.exchangeRate == null && other.getExchangeRate() == null || this.exchangeRate != null && this.exchangeRate.equals(other.getExchangeRate())) && (this.checkNum == null && other.getCheckNum() == null || this.checkNum != null && this.checkNum.equals(other.getCheckNum())) && (this.creditCardProcessor == null && other.getCreditCardProcessor() == null || this.creditCardProcessor != null && this.creditCardProcessor.equals(other.getCreditCardProcessor())) && (this.creditCard == null && other.getCreditCard() == null || this.creditCard != null && this.creditCard.equals(other.getCreditCard())) && (this.ccSecurityCode == null && other.getCcSecurityCode() == null || this.ccSecurityCode != null && this.ccSecurityCode.equals(other.getCcSecurityCode())) && (this.ccNumber == null && other.getCcNumber() == null || this.ccNumber != null && this.ccNumber.equals(other.getCcNumber())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && this.subsidiary.equals(other.getSubsidiary())) && (this.department == null && other.getDepartment() == null || this.department != null && this.department.equals(other.getDepartment())) && (this._class == null && other.get_class() == null || this._class != null && this._class.equals(other.get_class())) && (this.location == null && other.getLocation() == null || this.location != null && this.location.equals(other.getLocation())) && (this.paymentOption == null && other.getPaymentOption() == null || this.paymentOption != null && this.paymentOption.equals(other.getPaymentOption())) && (this.inputAuthCode == null && other.getInputAuthCode() == null || this.inputAuthCode != null && this.inputAuthCode.equals(other.getInputAuthCode())) && (this.inputReferenceCode == null && other.getInputReferenceCode() == null || this.inputReferenceCode != null && this.inputReferenceCode.equals(other.getInputReferenceCode())) && (this.checkNumber == null && other.getCheckNumber() == null || this.checkNumber != null && this.checkNumber.equals(other.getCheckNumber())) && (this.paymentCardCsc == null && other.getPaymentCardCsc() == null || this.paymentCardCsc != null && this.paymentCardCsc.equals(other.getPaymentCardCsc())) && (this.paymentProcessingProfile == null && other.getPaymentProcessingProfile() == null || this.paymentProcessingProfile != null && this.paymentProcessingProfile.equals(other.getPaymentProcessingProfile())) && (this.handlingMode == null && other.getHandlingMode() == null || this.handlingMode != null && this.handlingMode.equals(other.getHandlingMode())) && (this.outputAuthCode == null && other.getOutputAuthCode() == null || this.outputAuthCode != null && this.outputAuthCode.equals(other.getOutputAuthCode())) && (this.outputReferenceCode == null && other.getOutputReferenceCode() == null || this.outputReferenceCode != null && this.outputReferenceCode.equals(other.getOutputReferenceCode())) && (this.paymentOperation == null && other.getPaymentOperation() == null || this.paymentOperation != null && this.paymentOperation.equals(other.getPaymentOperation())) && (this.dynamicDescriptor == null && other.getDynamicDescriptor() == null || this.dynamicDescriptor != null && this.dynamicDescriptor.equals(other.getDynamicDescriptor())) && (this.ccExpireDate == null && other.getCcExpireDate() == null || this.ccExpireDate != null && this.ccExpireDate.equals(other.getCcExpireDate())) && (this.debitCardIssueNo == null && other.getDebitCardIssueNo() == null || this.debitCardIssueNo != null && this.debitCardIssueNo.equals(other.getDebitCardIssueNo())) && (this.validFrom == null && other.getValidFrom() == null || this.validFrom != null && this.validFrom.equals(other.getValidFrom())) && (this.ccName == null && other.getCcName() == null || this.ccName != null && this.ccName.equals(other.getCcName())) && (this.ccStreet == null && other.getCcStreet() == null || this.ccStreet != null && this.ccStreet.equals(other.getCcStreet())) && (this.ccZipCode == null && other.getCcZipCode() == null || this.ccZipCode != null && this.ccZipCode.equals(other.getCcZipCode())) && (this.chargeIt == null && other.getChargeIt() == null || this.chargeIt != null && this.chargeIt.equals(other.getChargeIt())) && (this.ccApproved == null && other.getCcApproved() == null || this.ccApproved != null && this.ccApproved.equals(other.getCcApproved())) && (this.pnRefNum == null && other.getPnRefNum() == null || this.pnRefNum != null && this.pnRefNum.equals(other.getPnRefNum())) && (this.authCode == null && other.getAuthCode() == null || this.authCode != null && this.authCode.equals(other.getAuthCode())) && (this.ccAvsStreetMatch == null && other.getCcAvsStreetMatch() == null || this.ccAvsStreetMatch != null && this.ccAvsStreetMatch.equals(other.getCcAvsStreetMatch())) && (this.softDescriptor == null && other.getSoftDescriptor() == null || this.softDescriptor != null && this.softDescriptor.equals(other.getSoftDescriptor())) && (this.ccAvsZipMatch == null && other.getCcAvsZipMatch() == null || this.ccAvsZipMatch != null && this.ccAvsZipMatch.equals(other.getCcAvsZipMatch())) && (this.isRecurringPayment == null && other.getIsRecurringPayment() == null || this.isRecurringPayment != null && this.isRecurringPayment.equals(other.getIsRecurringPayment())) && (this.ccSecurityCodeMatch == null && other.getCcSecurityCodeMatch() == null || this.ccSecurityCodeMatch != null && this.ccSecurityCodeMatch.equals(other.getCcSecurityCodeMatch())) && (this.threeDStatusCode == null && other.getThreeDStatusCode() == null || this.threeDStatusCode != null && this.threeDStatusCode.equals(other.getThreeDStatusCode())) && (this.ignoreAvs == null && other.getIgnoreAvs() == null || this.ignoreAvs != null && this.ignoreAvs.equals(other.getIgnoreAvs())) && (this.account == null && other.getAccount() == null || this.account != null && this.account.equals(other.getAccount())) && (this.undepFunds == null && other.getUndepFunds() == null || this.undepFunds != null && this.undepFunds.equals(other.getUndepFunds())) && (this.tranId == null && other.getTranId() == null || this.tranId != null && this.tranId.equals(other.getTranId())) && (this.applyList == null && other.getApplyList() == null || this.applyList != null && this.applyList.equals(other.getApplyList())) && (this.accountingBookDetailList == null && other.getAccountingBookDetailList() == null || this.accountingBookDetailList != null && this.accountingBookDetailList.equals(other.getAccountingBookDetailList())) && (this.salesOrderRequiredDepositDue == null && other.getSalesOrderRequiredDepositDue() == null || this.salesOrderRequiredDepositDue != null && this.salesOrderRequiredDepositDue.equals(other.getSalesOrderRequiredDepositDue())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
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
        if (this.getCreatedDate() != null) {
            _hashCode += this.getCreatedDate().hashCode();
        }
        if (this.getLastModifiedDate() != null) {
            _hashCode += this.getLastModifiedDate().hashCode();
        }
        if (this.getStatus() != null) {
            _hashCode += this.getStatus().hashCode();
        }
        if (this.getCustomer() != null) {
            _hashCode += this.getCustomer().hashCode();
        }
        if (this.getSalesOrder() != null) {
            _hashCode += this.getSalesOrder().hashCode();
        }
        if (this.getCustomForm() != null) {
            _hashCode += this.getCustomForm().hashCode();
        }
        if (this.getPayment() != null) {
            _hashCode += this.getPayment().hashCode();
        }
        if (this.getCurrency() != null) {
            _hashCode += this.getCurrency().hashCode();
        }
        if (this.getTranDate() != null) {
            _hashCode += this.getTranDate().hashCode();
        }
        if (this.getPostingPeriod() != null) {
            _hashCode += this.getPostingPeriod().hashCode();
        }
        if (this.getPaymentMethod() != null) {
            _hashCode += this.getPaymentMethod().hashCode();
        }
        if (this.getCcIsPurchaseCardBin() != null) {
            _hashCode += this.getCcIsPurchaseCardBin().hashCode();
        }
        if (this.getMemo() != null) {
            _hashCode += this.getMemo().hashCode();
        }
        if (this.getCcProcessAsPurchaseCard() != null) {
            _hashCode += this.getCcProcessAsPurchaseCard().hashCode();
        }
        if (this.getCurrencyName() != null) {
            _hashCode += this.getCurrencyName().hashCode();
        }
        if (this.getExchangeRate() != null) {
            _hashCode += this.getExchangeRate().hashCode();
        }
        if (this.getCheckNum() != null) {
            _hashCode += this.getCheckNum().hashCode();
        }
        if (this.getCreditCardProcessor() != null) {
            _hashCode += this.getCreditCardProcessor().hashCode();
        }
        if (this.getCreditCard() != null) {
            _hashCode += this.getCreditCard().hashCode();
        }
        if (this.getCcSecurityCode() != null) {
            _hashCode += this.getCcSecurityCode().hashCode();
        }
        if (this.getCcNumber() != null) {
            _hashCode += this.getCcNumber().hashCode();
        }
        if (this.getSubsidiary() != null) {
            _hashCode += this.getSubsidiary().hashCode();
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
        if (this.getPaymentOption() != null) {
            _hashCode += this.getPaymentOption().hashCode();
        }
        if (this.getInputAuthCode() != null) {
            _hashCode += this.getInputAuthCode().hashCode();
        }
        if (this.getInputReferenceCode() != null) {
            _hashCode += this.getInputReferenceCode().hashCode();
        }
        if (this.getCheckNumber() != null) {
            _hashCode += this.getCheckNumber().hashCode();
        }
        if (this.getPaymentCardCsc() != null) {
            _hashCode += this.getPaymentCardCsc().hashCode();
        }
        if (this.getPaymentProcessingProfile() != null) {
            _hashCode += this.getPaymentProcessingProfile().hashCode();
        }
        if (this.getHandlingMode() != null) {
            _hashCode += this.getHandlingMode().hashCode();
        }
        if (this.getOutputAuthCode() != null) {
            _hashCode += this.getOutputAuthCode().hashCode();
        }
        if (this.getOutputReferenceCode() != null) {
            _hashCode += this.getOutputReferenceCode().hashCode();
        }
        if (this.getPaymentOperation() != null) {
            _hashCode += this.getPaymentOperation().hashCode();
        }
        if (this.getDynamicDescriptor() != null) {
            _hashCode += this.getDynamicDescriptor().hashCode();
        }
        if (this.getCcExpireDate() != null) {
            _hashCode += this.getCcExpireDate().hashCode();
        }
        if (this.getDebitCardIssueNo() != null) {
            _hashCode += this.getDebitCardIssueNo().hashCode();
        }
        if (this.getValidFrom() != null) {
            _hashCode += this.getValidFrom().hashCode();
        }
        if (this.getCcName() != null) {
            _hashCode += this.getCcName().hashCode();
        }
        if (this.getCcStreet() != null) {
            _hashCode += this.getCcStreet().hashCode();
        }
        if (this.getCcZipCode() != null) {
            _hashCode += this.getCcZipCode().hashCode();
        }
        if (this.getChargeIt() != null) {
            _hashCode += this.getChargeIt().hashCode();
        }
        if (this.getCcApproved() != null) {
            _hashCode += this.getCcApproved().hashCode();
        }
        if (this.getPnRefNum() != null) {
            _hashCode += this.getPnRefNum().hashCode();
        }
        if (this.getAuthCode() != null) {
            _hashCode += this.getAuthCode().hashCode();
        }
        if (this.getCcAvsStreetMatch() != null) {
            _hashCode += this.getCcAvsStreetMatch().hashCode();
        }
        if (this.getSoftDescriptor() != null) {
            _hashCode += this.getSoftDescriptor().hashCode();
        }
        if (this.getCcAvsZipMatch() != null) {
            _hashCode += this.getCcAvsZipMatch().hashCode();
        }
        if (this.getIsRecurringPayment() != null) {
            _hashCode += this.getIsRecurringPayment().hashCode();
        }
        if (this.getCcSecurityCodeMatch() != null) {
            _hashCode += this.getCcSecurityCodeMatch().hashCode();
        }
        if (this.getThreeDStatusCode() != null) {
            _hashCode += this.getThreeDStatusCode().hashCode();
        }
        if (this.getIgnoreAvs() != null) {
            _hashCode += this.getIgnoreAvs().hashCode();
        }
        if (this.getAccount() != null) {
            _hashCode += this.getAccount().hashCode();
        }
        if (this.getUndepFunds() != null) {
            _hashCode += this.getUndepFunds().hashCode();
        }
        if (this.getTranId() != null) {
            _hashCode += this.getTranId().hashCode();
        }
        if (this.getApplyList() != null) {
            _hashCode += this.getApplyList().hashCode();
        }
        if (this.getAccountingBookDetailList() != null) {
            _hashCode += this.getAccountingBookDetailList().hashCode();
        }
        if (this.getSalesOrderRequiredDepositDue() != null) {
            _hashCode += this.getSalesOrderRequiredDepositDue().hashCode();
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
        typeDesc.setXmlType(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "CustomerDeposit"));
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
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "status"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customer");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "customer"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("salesOrder");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "salesOrder"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customForm");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("payment");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "payment"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("tranDate");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "tranDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("postingPeriod");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "postingPeriod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("paymentMethod");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "paymentMethod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ccIsPurchaseCardBin");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "ccIsPurchaseCardBin"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ccProcessAsPurchaseCard");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "ccProcessAsPurchaseCard"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("currencyName");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "currencyName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("exchangeRate");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "exchangeRate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("checkNum");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "checkNum"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("creditCardProcessor");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "creditCardProcessor"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("creditCard");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "creditCard"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ccSecurityCode");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "ccSecurityCode"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ccNumber");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "ccNumber"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "department"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "class"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "location"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("paymentOption");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "paymentOption"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("inputAuthCode");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "inputAuthCode"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("inputReferenceCode");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "inputReferenceCode"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("checkNumber");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "checkNumber"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("paymentCardCsc");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "paymentCardCsc"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("paymentProcessingProfile");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "paymentProcessingProfile"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("handlingMode");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "handlingMode"));
        elemField.setXmlType(new QName("urn:types.customers_2022_1.transactions.webservices.netsuite.com", "CustomerDepositHandlingMode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("outputAuthCode");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "outputAuthCode"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("outputReferenceCode");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "outputReferenceCode"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("paymentOperation");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "paymentOperation"));
        elemField.setXmlType(new QName("urn:types.customers_2022_1.transactions.webservices.netsuite.com", "CustomerDepositPaymentOperation"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("dynamicDescriptor");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "dynamicDescriptor"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ccExpireDate");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "ccExpireDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("debitCardIssueNo");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "debitCardIssueNo"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("validFrom");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "validFrom"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ccName");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "ccName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ccStreet");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "ccStreet"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ccZipCode");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "ccZipCode"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("chargeIt");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "chargeIt"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ccApproved");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "ccApproved"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("pnRefNum");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "pnRefNum"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("authCode");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "authCode"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ccAvsStreetMatch");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "ccAvsStreetMatch"));
        elemField.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "AvsMatchCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("softDescriptor");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "softDescriptor"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ccAvsZipMatch");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "ccAvsZipMatch"));
        elemField.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "AvsMatchCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isRecurringPayment");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "isRecurringPayment"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ccSecurityCodeMatch");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "ccSecurityCodeMatch"));
        elemField.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "AvsMatchCode"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("threeDStatusCode");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "threeDStatusCode"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("ignoreAvs");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "ignoreAvs"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "account"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("undepFunds");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "undepFunds"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("tranId");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "tranId"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("applyList");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "applyList"));
        elemField.setXmlType(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "CustomerDepositApplyList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("accountingBookDetailList");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "accountingBookDetailList"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "AccountingBookDetailList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("salesOrderRequiredDepositDue");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "salesOrderRequiredDepositDue"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "CustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

