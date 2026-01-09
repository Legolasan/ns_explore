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
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.Address;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.CustomFieldList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.NullField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.Record;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.customers.CustomerRefundApplyList;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.customers.CustomerRefundDepositList;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.customers.types.CustomerRefundHandlingMode;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.customers.types.CustomerRefundPaymentOperation;
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

public class CustomerRefund
extends Record
implements Serializable {
    private Calendar createdDate;
    private Calendar lastModifiedDate;
    private String status;
    private String transactionNumber;
    private RecordRef customer;
    private RecordRef customForm;
    private Double balance;
    private RecordRef arAcct;
    private String currencyName;
    private Double exchangeRate;
    private Double total;
    private RecordRef currency;
    private Calendar tranDate;
    private RecordRef voidJournal;
    private RecordRef postingPeriod;
    private String memo;
    private RecordRef paymentMethod;
    private RecordRef account;
    private Boolean toBePrinted;
    private String tranId;
    private String debitCardIssueNo;
    private RecordRef creditCardProcessor;
    private Boolean chargeIt;
    private String pnRefNum;
    private Calendar validFrom;
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
    private CustomerRefundHandlingMode handlingMode;
    private String outputAuthCode;
    private String outputReferenceCode;
    private CustomerRefundPaymentOperation paymentOperation;
    private String dynamicDescriptor;
    private RecordRef creditCard;
    private Boolean ccIsPurchaseCardBin;
    private String ccNumber;
    private Boolean ccProcessAsPurchaseCard;
    private Calendar ccExpireDate;
    private String ccName;
    private String ccStreet;
    private String ccZipCode;
    private Boolean ccApproved;
    private CustomerRefundApplyList applyList;
    private CustomerRefundDepositList depositList;
    private AccountingBookDetailList accountingBookDetailList;
    private RecordRef payeeAddressList;
    private Address payeeAddress;
    private CustomFieldList customFieldList;
    private String internalId;
    private String externalId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(CustomerRefund.class, true);

    public CustomerRefund() {
    }

    public CustomerRefund(NullField nullFieldList, String internalId, String externalId, Calendar createdDate, Calendar lastModifiedDate, String status, String transactionNumber, RecordRef customer, RecordRef customForm, Double balance, RecordRef arAcct, String currencyName, Double exchangeRate, Double total, RecordRef currency, Calendar tranDate, RecordRef voidJournal, RecordRef postingPeriod, String memo, RecordRef paymentMethod, RecordRef account, Boolean toBePrinted, String tranId, String debitCardIssueNo, RecordRef creditCardProcessor, Boolean chargeIt, String pnRefNum, Calendar validFrom, RecordRef subsidiary, RecordRef department, RecordRef _class, RecordRef location, RecordRef paymentOption, String inputAuthCode, String inputReferenceCode, String checkNumber, String paymentCardCsc, RecordRef paymentProcessingProfile, CustomerRefundHandlingMode handlingMode, String outputAuthCode, String outputReferenceCode, CustomerRefundPaymentOperation paymentOperation, String dynamicDescriptor, RecordRef creditCard, Boolean ccIsPurchaseCardBin, String ccNumber, Boolean ccProcessAsPurchaseCard, Calendar ccExpireDate, String ccName, String ccStreet, String ccZipCode, Boolean ccApproved, CustomerRefundApplyList applyList, CustomerRefundDepositList depositList, AccountingBookDetailList accountingBookDetailList, RecordRef payeeAddressList, Address payeeAddress, CustomFieldList customFieldList) {
        super(nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.status = status;
        this.transactionNumber = transactionNumber;
        this.customer = customer;
        this.customForm = customForm;
        this.balance = balance;
        this.arAcct = arAcct;
        this.currencyName = currencyName;
        this.exchangeRate = exchangeRate;
        this.total = total;
        this.currency = currency;
        this.tranDate = tranDate;
        this.voidJournal = voidJournal;
        this.postingPeriod = postingPeriod;
        this.memo = memo;
        this.paymentMethod = paymentMethod;
        this.account = account;
        this.toBePrinted = toBePrinted;
        this.tranId = tranId;
        this.debitCardIssueNo = debitCardIssueNo;
        this.creditCardProcessor = creditCardProcessor;
        this.chargeIt = chargeIt;
        this.pnRefNum = pnRefNum;
        this.validFrom = validFrom;
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
        this.creditCard = creditCard;
        this.ccIsPurchaseCardBin = ccIsPurchaseCardBin;
        this.ccNumber = ccNumber;
        this.ccProcessAsPurchaseCard = ccProcessAsPurchaseCard;
        this.ccExpireDate = ccExpireDate;
        this.ccName = ccName;
        this.ccStreet = ccStreet;
        this.ccZipCode = ccZipCode;
        this.ccApproved = ccApproved;
        this.applyList = applyList;
        this.depositList = depositList;
        this.accountingBookDetailList = accountingBookDetailList;
        this.payeeAddressList = payeeAddressList;
        this.payeeAddress = payeeAddress;
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

    public String getTransactionNumber() {
        return this.transactionNumber;
    }

    public void setTransactionNumber(String transactionNumber) {
        this.transactionNumber = transactionNumber;
    }

    public RecordRef getCustomer() {
        return this.customer;
    }

    public void setCustomer(RecordRef customer) {
        this.customer = customer;
    }

    public RecordRef getCustomForm() {
        return this.customForm;
    }

    public void setCustomForm(RecordRef customForm) {
        this.customForm = customForm;
    }

    public Double getBalance() {
        return this.balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public RecordRef getArAcct() {
        return this.arAcct;
    }

    public void setArAcct(RecordRef arAcct) {
        this.arAcct = arAcct;
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

    public Double getTotal() {
        return this.total;
    }

    public void setTotal(Double total) {
        this.total = total;
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

    public RecordRef getVoidJournal() {
        return this.voidJournal;
    }

    public void setVoidJournal(RecordRef voidJournal) {
        this.voidJournal = voidJournal;
    }

    public RecordRef getPostingPeriod() {
        return this.postingPeriod;
    }

    public void setPostingPeriod(RecordRef postingPeriod) {
        this.postingPeriod = postingPeriod;
    }

    public String getMemo() {
        return this.memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public RecordRef getPaymentMethod() {
        return this.paymentMethod;
    }

    public void setPaymentMethod(RecordRef paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    public RecordRef getAccount() {
        return this.account;
    }

    public void setAccount(RecordRef account) {
        this.account = account;
    }

    public Boolean getToBePrinted() {
        return this.toBePrinted;
    }

    public void setToBePrinted(Boolean toBePrinted) {
        this.toBePrinted = toBePrinted;
    }

    public String getTranId() {
        return this.tranId;
    }

    public void setTranId(String tranId) {
        this.tranId = tranId;
    }

    public String getDebitCardIssueNo() {
        return this.debitCardIssueNo;
    }

    public void setDebitCardIssueNo(String debitCardIssueNo) {
        this.debitCardIssueNo = debitCardIssueNo;
    }

    public RecordRef getCreditCardProcessor() {
        return this.creditCardProcessor;
    }

    public void setCreditCardProcessor(RecordRef creditCardProcessor) {
        this.creditCardProcessor = creditCardProcessor;
    }

    public Boolean getChargeIt() {
        return this.chargeIt;
    }

    public void setChargeIt(Boolean chargeIt) {
        this.chargeIt = chargeIt;
    }

    public String getPnRefNum() {
        return this.pnRefNum;
    }

    public void setPnRefNum(String pnRefNum) {
        this.pnRefNum = pnRefNum;
    }

    public Calendar getValidFrom() {
        return this.validFrom;
    }

    public void setValidFrom(Calendar validFrom) {
        this.validFrom = validFrom;
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

    public CustomerRefundHandlingMode getHandlingMode() {
        return this.handlingMode;
    }

    public void setHandlingMode(CustomerRefundHandlingMode handlingMode) {
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

    public CustomerRefundPaymentOperation getPaymentOperation() {
        return this.paymentOperation;
    }

    public void setPaymentOperation(CustomerRefundPaymentOperation paymentOperation) {
        this.paymentOperation = paymentOperation;
    }

    public String getDynamicDescriptor() {
        return this.dynamicDescriptor;
    }

    public void setDynamicDescriptor(String dynamicDescriptor) {
        this.dynamicDescriptor = dynamicDescriptor;
    }

    public RecordRef getCreditCard() {
        return this.creditCard;
    }

    public void setCreditCard(RecordRef creditCard) {
        this.creditCard = creditCard;
    }

    public Boolean getCcIsPurchaseCardBin() {
        return this.ccIsPurchaseCardBin;
    }

    public void setCcIsPurchaseCardBin(Boolean ccIsPurchaseCardBin) {
        this.ccIsPurchaseCardBin = ccIsPurchaseCardBin;
    }

    public String getCcNumber() {
        return this.ccNumber;
    }

    public void setCcNumber(String ccNumber) {
        this.ccNumber = ccNumber;
    }

    public Boolean getCcProcessAsPurchaseCard() {
        return this.ccProcessAsPurchaseCard;
    }

    public void setCcProcessAsPurchaseCard(Boolean ccProcessAsPurchaseCard) {
        this.ccProcessAsPurchaseCard = ccProcessAsPurchaseCard;
    }

    public Calendar getCcExpireDate() {
        return this.ccExpireDate;
    }

    public void setCcExpireDate(Calendar ccExpireDate) {
        this.ccExpireDate = ccExpireDate;
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

    public Boolean getCcApproved() {
        return this.ccApproved;
    }

    public void setCcApproved(Boolean ccApproved) {
        this.ccApproved = ccApproved;
    }

    public CustomerRefundApplyList getApplyList() {
        return this.applyList;
    }

    public void setApplyList(CustomerRefundApplyList applyList) {
        this.applyList = applyList;
    }

    public CustomerRefundDepositList getDepositList() {
        return this.depositList;
    }

    public void setDepositList(CustomerRefundDepositList depositList) {
        this.depositList = depositList;
    }

    public AccountingBookDetailList getAccountingBookDetailList() {
        return this.accountingBookDetailList;
    }

    public void setAccountingBookDetailList(AccountingBookDetailList accountingBookDetailList) {
        this.accountingBookDetailList = accountingBookDetailList;
    }

    public RecordRef getPayeeAddressList() {
        return this.payeeAddressList;
    }

    public void setPayeeAddressList(RecordRef payeeAddressList) {
        this.payeeAddressList = payeeAddressList;
    }

    public Address getPayeeAddress() {
        return this.payeeAddress;
    }

    public void setPayeeAddress(Address payeeAddress) {
        this.payeeAddress = payeeAddress;
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
        if (!(obj instanceof CustomerRefund)) {
            return false;
        }
        CustomerRefund other = (CustomerRefund)obj;
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
        boolean _equals = super.equals(obj) && (this.createdDate == null && other.getCreatedDate() == null || this.createdDate != null && this.createdDate.equals(other.getCreatedDate())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && this.lastModifiedDate.equals(other.getLastModifiedDate())) && (this.status == null && other.getStatus() == null || this.status != null && this.status.equals(other.getStatus())) && (this.transactionNumber == null && other.getTransactionNumber() == null || this.transactionNumber != null && this.transactionNumber.equals(other.getTransactionNumber())) && (this.customer == null && other.getCustomer() == null || this.customer != null && this.customer.equals(other.getCustomer())) && (this.customForm == null && other.getCustomForm() == null || this.customForm != null && this.customForm.equals(other.getCustomForm())) && (this.balance == null && other.getBalance() == null || this.balance != null && this.balance.equals(other.getBalance())) && (this.arAcct == null && other.getArAcct() == null || this.arAcct != null && this.arAcct.equals(other.getArAcct())) && (this.currencyName == null && other.getCurrencyName() == null || this.currencyName != null && this.currencyName.equals(other.getCurrencyName())) && (this.exchangeRate == null && other.getExchangeRate() == null || this.exchangeRate != null && this.exchangeRate.equals(other.getExchangeRate())) && (this.total == null && other.getTotal() == null || this.total != null && this.total.equals(other.getTotal())) && (this.currency == null && other.getCurrency() == null || this.currency != null && this.currency.equals(other.getCurrency())) && (this.tranDate == null && other.getTranDate() == null || this.tranDate != null && this.tranDate.equals(other.getTranDate())) && (this.voidJournal == null && other.getVoidJournal() == null || this.voidJournal != null && this.voidJournal.equals(other.getVoidJournal())) && (this.postingPeriod == null && other.getPostingPeriod() == null || this.postingPeriod != null && this.postingPeriod.equals(other.getPostingPeriod())) && (this.memo == null && other.getMemo() == null || this.memo != null && this.memo.equals(other.getMemo())) && (this.paymentMethod == null && other.getPaymentMethod() == null || this.paymentMethod != null && this.paymentMethod.equals(other.getPaymentMethod())) && (this.account == null && other.getAccount() == null || this.account != null && this.account.equals(other.getAccount())) && (this.toBePrinted == null && other.getToBePrinted() == null || this.toBePrinted != null && this.toBePrinted.equals(other.getToBePrinted())) && (this.tranId == null && other.getTranId() == null || this.tranId != null && this.tranId.equals(other.getTranId())) && (this.debitCardIssueNo == null && other.getDebitCardIssueNo() == null || this.debitCardIssueNo != null && this.debitCardIssueNo.equals(other.getDebitCardIssueNo())) && (this.creditCardProcessor == null && other.getCreditCardProcessor() == null || this.creditCardProcessor != null && this.creditCardProcessor.equals(other.getCreditCardProcessor())) && (this.chargeIt == null && other.getChargeIt() == null || this.chargeIt != null && this.chargeIt.equals(other.getChargeIt())) && (this.pnRefNum == null && other.getPnRefNum() == null || this.pnRefNum != null && this.pnRefNum.equals(other.getPnRefNum())) && (this.validFrom == null && other.getValidFrom() == null || this.validFrom != null && this.validFrom.equals(other.getValidFrom())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && this.subsidiary.equals(other.getSubsidiary())) && (this.department == null && other.getDepartment() == null || this.department != null && this.department.equals(other.getDepartment())) && (this._class == null && other.get_class() == null || this._class != null && this._class.equals(other.get_class())) && (this.location == null && other.getLocation() == null || this.location != null && this.location.equals(other.getLocation())) && (this.paymentOption == null && other.getPaymentOption() == null || this.paymentOption != null && this.paymentOption.equals(other.getPaymentOption())) && (this.inputAuthCode == null && other.getInputAuthCode() == null || this.inputAuthCode != null && this.inputAuthCode.equals(other.getInputAuthCode())) && (this.inputReferenceCode == null && other.getInputReferenceCode() == null || this.inputReferenceCode != null && this.inputReferenceCode.equals(other.getInputReferenceCode())) && (this.checkNumber == null && other.getCheckNumber() == null || this.checkNumber != null && this.checkNumber.equals(other.getCheckNumber())) && (this.paymentCardCsc == null && other.getPaymentCardCsc() == null || this.paymentCardCsc != null && this.paymentCardCsc.equals(other.getPaymentCardCsc())) && (this.paymentProcessingProfile == null && other.getPaymentProcessingProfile() == null || this.paymentProcessingProfile != null && this.paymentProcessingProfile.equals(other.getPaymentProcessingProfile())) && (this.handlingMode == null && other.getHandlingMode() == null || this.handlingMode != null && this.handlingMode.equals(other.getHandlingMode())) && (this.outputAuthCode == null && other.getOutputAuthCode() == null || this.outputAuthCode != null && this.outputAuthCode.equals(other.getOutputAuthCode())) && (this.outputReferenceCode == null && other.getOutputReferenceCode() == null || this.outputReferenceCode != null && this.outputReferenceCode.equals(other.getOutputReferenceCode())) && (this.paymentOperation == null && other.getPaymentOperation() == null || this.paymentOperation != null && this.paymentOperation.equals(other.getPaymentOperation())) && (this.dynamicDescriptor == null && other.getDynamicDescriptor() == null || this.dynamicDescriptor != null && this.dynamicDescriptor.equals(other.getDynamicDescriptor())) && (this.creditCard == null && other.getCreditCard() == null || this.creditCard != null && this.creditCard.equals(other.getCreditCard())) && (this.ccIsPurchaseCardBin == null && other.getCcIsPurchaseCardBin() == null || this.ccIsPurchaseCardBin != null && this.ccIsPurchaseCardBin.equals(other.getCcIsPurchaseCardBin())) && (this.ccNumber == null && other.getCcNumber() == null || this.ccNumber != null && this.ccNumber.equals(other.getCcNumber())) && (this.ccProcessAsPurchaseCard == null && other.getCcProcessAsPurchaseCard() == null || this.ccProcessAsPurchaseCard != null && this.ccProcessAsPurchaseCard.equals(other.getCcProcessAsPurchaseCard())) && (this.ccExpireDate == null && other.getCcExpireDate() == null || this.ccExpireDate != null && this.ccExpireDate.equals(other.getCcExpireDate())) && (this.ccName == null && other.getCcName() == null || this.ccName != null && this.ccName.equals(other.getCcName())) && (this.ccStreet == null && other.getCcStreet() == null || this.ccStreet != null && this.ccStreet.equals(other.getCcStreet())) && (this.ccZipCode == null && other.getCcZipCode() == null || this.ccZipCode != null && this.ccZipCode.equals(other.getCcZipCode())) && (this.ccApproved == null && other.getCcApproved() == null || this.ccApproved != null && this.ccApproved.equals(other.getCcApproved())) && (this.applyList == null && other.getApplyList() == null || this.applyList != null && this.applyList.equals(other.getApplyList())) && (this.depositList == null && other.getDepositList() == null || this.depositList != null && this.depositList.equals(other.getDepositList())) && (this.accountingBookDetailList == null && other.getAccountingBookDetailList() == null || this.accountingBookDetailList != null && this.accountingBookDetailList.equals(other.getAccountingBookDetailList())) && (this.payeeAddressList == null && other.getPayeeAddressList() == null || this.payeeAddressList != null && this.payeeAddressList.equals(other.getPayeeAddressList())) && (this.payeeAddress == null && other.getPayeeAddress() == null || this.payeeAddress != null && this.payeeAddress.equals(other.getPayeeAddress())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
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
        if (this.getTransactionNumber() != null) {
            _hashCode += this.getTransactionNumber().hashCode();
        }
        if (this.getCustomer() != null) {
            _hashCode += this.getCustomer().hashCode();
        }
        if (this.getCustomForm() != null) {
            _hashCode += this.getCustomForm().hashCode();
        }
        if (this.getBalance() != null) {
            _hashCode += this.getBalance().hashCode();
        }
        if (this.getArAcct() != null) {
            _hashCode += this.getArAcct().hashCode();
        }
        if (this.getCurrencyName() != null) {
            _hashCode += this.getCurrencyName().hashCode();
        }
        if (this.getExchangeRate() != null) {
            _hashCode += this.getExchangeRate().hashCode();
        }
        if (this.getTotal() != null) {
            _hashCode += this.getTotal().hashCode();
        }
        if (this.getCurrency() != null) {
            _hashCode += this.getCurrency().hashCode();
        }
        if (this.getTranDate() != null) {
            _hashCode += this.getTranDate().hashCode();
        }
        if (this.getVoidJournal() != null) {
            _hashCode += this.getVoidJournal().hashCode();
        }
        if (this.getPostingPeriod() != null) {
            _hashCode += this.getPostingPeriod().hashCode();
        }
        if (this.getMemo() != null) {
            _hashCode += this.getMemo().hashCode();
        }
        if (this.getPaymentMethod() != null) {
            _hashCode += this.getPaymentMethod().hashCode();
        }
        if (this.getAccount() != null) {
            _hashCode += this.getAccount().hashCode();
        }
        if (this.getToBePrinted() != null) {
            _hashCode += this.getToBePrinted().hashCode();
        }
        if (this.getTranId() != null) {
            _hashCode += this.getTranId().hashCode();
        }
        if (this.getDebitCardIssueNo() != null) {
            _hashCode += this.getDebitCardIssueNo().hashCode();
        }
        if (this.getCreditCardProcessor() != null) {
            _hashCode += this.getCreditCardProcessor().hashCode();
        }
        if (this.getChargeIt() != null) {
            _hashCode += this.getChargeIt().hashCode();
        }
        if (this.getPnRefNum() != null) {
            _hashCode += this.getPnRefNum().hashCode();
        }
        if (this.getValidFrom() != null) {
            _hashCode += this.getValidFrom().hashCode();
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
        if (this.getCreditCard() != null) {
            _hashCode += this.getCreditCard().hashCode();
        }
        if (this.getCcIsPurchaseCardBin() != null) {
            _hashCode += this.getCcIsPurchaseCardBin().hashCode();
        }
        if (this.getCcNumber() != null) {
            _hashCode += this.getCcNumber().hashCode();
        }
        if (this.getCcProcessAsPurchaseCard() != null) {
            _hashCode += this.getCcProcessAsPurchaseCard().hashCode();
        }
        if (this.getCcExpireDate() != null) {
            _hashCode += this.getCcExpireDate().hashCode();
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
        if (this.getCcApproved() != null) {
            _hashCode += this.getCcApproved().hashCode();
        }
        if (this.getApplyList() != null) {
            _hashCode += this.getApplyList().hashCode();
        }
        if (this.getDepositList() != null) {
            _hashCode += this.getDepositList().hashCode();
        }
        if (this.getAccountingBookDetailList() != null) {
            _hashCode += this.getAccountingBookDetailList().hashCode();
        }
        if (this.getPayeeAddressList() != null) {
            _hashCode += this.getPayeeAddressList().hashCode();
        }
        if (this.getPayeeAddress() != null) {
            _hashCode += this.getPayeeAddress().hashCode();
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
        typeDesc.setXmlType(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "CustomerRefund"));
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
        elemField.setFieldName("transactionNumber");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "transactionNumber"));
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
        elemField.setFieldName("customForm");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "balance"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("arAcct");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "arAcct"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("total");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "total"));
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
        elemField.setFieldName("voidJournal");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "voidJournal"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("memo");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("account");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "account"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("toBePrinted");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "toBePrinted"));
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
        elemField.setFieldName("debitCardIssueNo");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "debitCardIssueNo"));
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
        elemField.setFieldName("chargeIt");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "chargeIt"));
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
        elemField.setFieldName("validFrom");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "validFrom"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setXmlType(new QName("urn:types.customers_2022_1.transactions.webservices.netsuite.com", "CustomerRefundHandlingMode"));
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
        elemField.setXmlType(new QName("urn:types.customers_2022_1.transactions.webservices.netsuite.com", "CustomerRefundPaymentOperation"));
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
        elemField.setFieldName("creditCard");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "creditCard"));
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
        elemField.setFieldName("ccNumber");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "ccNumber"));
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
        elemField.setFieldName("ccExpireDate");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "ccExpireDate"));
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
        elemField.setFieldName("ccApproved");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "ccApproved"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("applyList");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "applyList"));
        elemField.setXmlType(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "CustomerRefundApplyList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("depositList");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "depositList"));
        elemField.setXmlType(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "CustomerRefundDepositList"));
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
        elemField.setFieldName("payeeAddressList");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "payeeAddressList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("payeeAddress");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "payeeAddress"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "Address"));
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

