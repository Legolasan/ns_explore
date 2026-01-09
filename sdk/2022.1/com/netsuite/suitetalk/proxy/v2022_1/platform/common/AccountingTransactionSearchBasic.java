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
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchDateField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchDoubleField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchEnumMultiSelectField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchLongField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchMultiSelectField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchRecordBasic;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class AccountingTransactionSearchBasic
extends SearchRecordBasic
implements Serializable {
    private SearchMultiSelectField account;
    private SearchMultiSelectField accountingBook;
    private SearchMultiSelectField accountType;
    private SearchDoubleField altSalesAmount;
    private SearchDoubleField altSalesNetAmount;
    private SearchDoubleField amount;
    private SearchBooleanField bookSpecificTransaction;
    private SearchMultiSelectField catchUpPeriod;
    private SearchDoubleField creditAmount;
    private SearchBooleanField customGL;
    private SearchDoubleField debitAmount;
    private SearchBooleanField deferRevRec;
    private SearchDoubleField exchangeRate;
    private SearchDoubleField grossAmount;
    private SearchMultiSelectField internalId;
    private SearchLongField internalIdNumber;
    private SearchBooleanField multiSubsidiary;
    private SearchDoubleField netAmount;
    private SearchBooleanField posting;
    private SearchDoubleField quantityRevCommitted;
    private SearchDoubleField recognizedRevenue;
    private SearchEnumMultiSelectField revCommitStatus;
    private SearchEnumMultiSelectField revenueStatus;
    private SearchDateField revRecEndDate;
    private SearchBooleanField revRecOnRevCommitment;
    private SearchDateField revRecStartDate;
    private SearchMultiSelectField subsidiary;
    private SearchBooleanField tranIsVsoeBundle;
    private SearchEnumMultiSelectField type;
    private SearchDoubleField vsoeAllocation;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(AccountingTransactionSearchBasic.class, true);

    public AccountingTransactionSearchBasic() {
    }

    public AccountingTransactionSearchBasic(SearchMultiSelectField account, SearchMultiSelectField accountingBook, SearchMultiSelectField accountType, SearchDoubleField altSalesAmount, SearchDoubleField altSalesNetAmount, SearchDoubleField amount, SearchBooleanField bookSpecificTransaction, SearchMultiSelectField catchUpPeriod, SearchDoubleField creditAmount, SearchBooleanField customGL, SearchDoubleField debitAmount, SearchBooleanField deferRevRec, SearchDoubleField exchangeRate, SearchDoubleField grossAmount, SearchMultiSelectField internalId, SearchLongField internalIdNumber, SearchBooleanField multiSubsidiary, SearchDoubleField netAmount, SearchBooleanField posting, SearchDoubleField quantityRevCommitted, SearchDoubleField recognizedRevenue, SearchEnumMultiSelectField revCommitStatus, SearchEnumMultiSelectField revenueStatus, SearchDateField revRecEndDate, SearchBooleanField revRecOnRevCommitment, SearchDateField revRecStartDate, SearchMultiSelectField subsidiary, SearchBooleanField tranIsVsoeBundle, SearchEnumMultiSelectField type, SearchDoubleField vsoeAllocation) {
        this.account = account;
        this.accountingBook = accountingBook;
        this.accountType = accountType;
        this.altSalesAmount = altSalesAmount;
        this.altSalesNetAmount = altSalesNetAmount;
        this.amount = amount;
        this.bookSpecificTransaction = bookSpecificTransaction;
        this.catchUpPeriod = catchUpPeriod;
        this.creditAmount = creditAmount;
        this.customGL = customGL;
        this.debitAmount = debitAmount;
        this.deferRevRec = deferRevRec;
        this.exchangeRate = exchangeRate;
        this.grossAmount = grossAmount;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.multiSubsidiary = multiSubsidiary;
        this.netAmount = netAmount;
        this.posting = posting;
        this.quantityRevCommitted = quantityRevCommitted;
        this.recognizedRevenue = recognizedRevenue;
        this.revCommitStatus = revCommitStatus;
        this.revenueStatus = revenueStatus;
        this.revRecEndDate = revRecEndDate;
        this.revRecOnRevCommitment = revRecOnRevCommitment;
        this.revRecStartDate = revRecStartDate;
        this.subsidiary = subsidiary;
        this.tranIsVsoeBundle = tranIsVsoeBundle;
        this.type = type;
        this.vsoeAllocation = vsoeAllocation;
    }

    public SearchMultiSelectField getAccount() {
        return this.account;
    }

    public void setAccount(SearchMultiSelectField account) {
        this.account = account;
    }

    public SearchMultiSelectField getAccountingBook() {
        return this.accountingBook;
    }

    public void setAccountingBook(SearchMultiSelectField accountingBook) {
        this.accountingBook = accountingBook;
    }

    public SearchMultiSelectField getAccountType() {
        return this.accountType;
    }

    public void setAccountType(SearchMultiSelectField accountType) {
        this.accountType = accountType;
    }

    public SearchDoubleField getAltSalesAmount() {
        return this.altSalesAmount;
    }

    public void setAltSalesAmount(SearchDoubleField altSalesAmount) {
        this.altSalesAmount = altSalesAmount;
    }

    public SearchDoubleField getAltSalesNetAmount() {
        return this.altSalesNetAmount;
    }

    public void setAltSalesNetAmount(SearchDoubleField altSalesNetAmount) {
        this.altSalesNetAmount = altSalesNetAmount;
    }

    public SearchDoubleField getAmount() {
        return this.amount;
    }

    public void setAmount(SearchDoubleField amount) {
        this.amount = amount;
    }

    public SearchBooleanField getBookSpecificTransaction() {
        return this.bookSpecificTransaction;
    }

    public void setBookSpecificTransaction(SearchBooleanField bookSpecificTransaction) {
        this.bookSpecificTransaction = bookSpecificTransaction;
    }

    public SearchMultiSelectField getCatchUpPeriod() {
        return this.catchUpPeriod;
    }

    public void setCatchUpPeriod(SearchMultiSelectField catchUpPeriod) {
        this.catchUpPeriod = catchUpPeriod;
    }

    public SearchDoubleField getCreditAmount() {
        return this.creditAmount;
    }

    public void setCreditAmount(SearchDoubleField creditAmount) {
        this.creditAmount = creditAmount;
    }

    public SearchBooleanField getCustomGL() {
        return this.customGL;
    }

    public void setCustomGL(SearchBooleanField customGL) {
        this.customGL = customGL;
    }

    public SearchDoubleField getDebitAmount() {
        return this.debitAmount;
    }

    public void setDebitAmount(SearchDoubleField debitAmount) {
        this.debitAmount = debitAmount;
    }

    public SearchBooleanField getDeferRevRec() {
        return this.deferRevRec;
    }

    public void setDeferRevRec(SearchBooleanField deferRevRec) {
        this.deferRevRec = deferRevRec;
    }

    public SearchDoubleField getExchangeRate() {
        return this.exchangeRate;
    }

    public void setExchangeRate(SearchDoubleField exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public SearchDoubleField getGrossAmount() {
        return this.grossAmount;
    }

    public void setGrossAmount(SearchDoubleField grossAmount) {
        this.grossAmount = grossAmount;
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

    public SearchBooleanField getMultiSubsidiary() {
        return this.multiSubsidiary;
    }

    public void setMultiSubsidiary(SearchBooleanField multiSubsidiary) {
        this.multiSubsidiary = multiSubsidiary;
    }

    public SearchDoubleField getNetAmount() {
        return this.netAmount;
    }

    public void setNetAmount(SearchDoubleField netAmount) {
        this.netAmount = netAmount;
    }

    public SearchBooleanField getPosting() {
        return this.posting;
    }

    public void setPosting(SearchBooleanField posting) {
        this.posting = posting;
    }

    public SearchDoubleField getQuantityRevCommitted() {
        return this.quantityRevCommitted;
    }

    public void setQuantityRevCommitted(SearchDoubleField quantityRevCommitted) {
        this.quantityRevCommitted = quantityRevCommitted;
    }

    public SearchDoubleField getRecognizedRevenue() {
        return this.recognizedRevenue;
    }

    public void setRecognizedRevenue(SearchDoubleField recognizedRevenue) {
        this.recognizedRevenue = recognizedRevenue;
    }

    public SearchEnumMultiSelectField getRevCommitStatus() {
        return this.revCommitStatus;
    }

    public void setRevCommitStatus(SearchEnumMultiSelectField revCommitStatus) {
        this.revCommitStatus = revCommitStatus;
    }

    public SearchEnumMultiSelectField getRevenueStatus() {
        return this.revenueStatus;
    }

    public void setRevenueStatus(SearchEnumMultiSelectField revenueStatus) {
        this.revenueStatus = revenueStatus;
    }

    public SearchDateField getRevRecEndDate() {
        return this.revRecEndDate;
    }

    public void setRevRecEndDate(SearchDateField revRecEndDate) {
        this.revRecEndDate = revRecEndDate;
    }

    public SearchBooleanField getRevRecOnRevCommitment() {
        return this.revRecOnRevCommitment;
    }

    public void setRevRecOnRevCommitment(SearchBooleanField revRecOnRevCommitment) {
        this.revRecOnRevCommitment = revRecOnRevCommitment;
    }

    public SearchDateField getRevRecStartDate() {
        return this.revRecStartDate;
    }

    public void setRevRecStartDate(SearchDateField revRecStartDate) {
        this.revRecStartDate = revRecStartDate;
    }

    public SearchMultiSelectField getSubsidiary() {
        return this.subsidiary;
    }

    public void setSubsidiary(SearchMultiSelectField subsidiary) {
        this.subsidiary = subsidiary;
    }

    public SearchBooleanField getTranIsVsoeBundle() {
        return this.tranIsVsoeBundle;
    }

    public void setTranIsVsoeBundle(SearchBooleanField tranIsVsoeBundle) {
        this.tranIsVsoeBundle = tranIsVsoeBundle;
    }

    public SearchEnumMultiSelectField getType() {
        return this.type;
    }

    public void setType(SearchEnumMultiSelectField type) {
        this.type = type;
    }

    public SearchDoubleField getVsoeAllocation() {
        return this.vsoeAllocation;
    }

    public void setVsoeAllocation(SearchDoubleField vsoeAllocation) {
        this.vsoeAllocation = vsoeAllocation;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof AccountingTransactionSearchBasic)) {
            return false;
        }
        AccountingTransactionSearchBasic other = (AccountingTransactionSearchBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.account == null && other.getAccount() == null || this.account != null && this.account.equals(other.getAccount())) && (this.accountingBook == null && other.getAccountingBook() == null || this.accountingBook != null && this.accountingBook.equals(other.getAccountingBook())) && (this.accountType == null && other.getAccountType() == null || this.accountType != null && this.accountType.equals(other.getAccountType())) && (this.altSalesAmount == null && other.getAltSalesAmount() == null || this.altSalesAmount != null && this.altSalesAmount.equals(other.getAltSalesAmount())) && (this.altSalesNetAmount == null && other.getAltSalesNetAmount() == null || this.altSalesNetAmount != null && this.altSalesNetAmount.equals(other.getAltSalesNetAmount())) && (this.amount == null && other.getAmount() == null || this.amount != null && this.amount.equals(other.getAmount())) && (this.bookSpecificTransaction == null && other.getBookSpecificTransaction() == null || this.bookSpecificTransaction != null && this.bookSpecificTransaction.equals(other.getBookSpecificTransaction())) && (this.catchUpPeriod == null && other.getCatchUpPeriod() == null || this.catchUpPeriod != null && this.catchUpPeriod.equals(other.getCatchUpPeriod())) && (this.creditAmount == null && other.getCreditAmount() == null || this.creditAmount != null && this.creditAmount.equals(other.getCreditAmount())) && (this.customGL == null && other.getCustomGL() == null || this.customGL != null && this.customGL.equals(other.getCustomGL())) && (this.debitAmount == null && other.getDebitAmount() == null || this.debitAmount != null && this.debitAmount.equals(other.getDebitAmount())) && (this.deferRevRec == null && other.getDeferRevRec() == null || this.deferRevRec != null && this.deferRevRec.equals(other.getDeferRevRec())) && (this.exchangeRate == null && other.getExchangeRate() == null || this.exchangeRate != null && this.exchangeRate.equals(other.getExchangeRate())) && (this.grossAmount == null && other.getGrossAmount() == null || this.grossAmount != null && this.grossAmount.equals(other.getGrossAmount())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.internalIdNumber == null && other.getInternalIdNumber() == null || this.internalIdNumber != null && this.internalIdNumber.equals(other.getInternalIdNumber())) && (this.multiSubsidiary == null && other.getMultiSubsidiary() == null || this.multiSubsidiary != null && this.multiSubsidiary.equals(other.getMultiSubsidiary())) && (this.netAmount == null && other.getNetAmount() == null || this.netAmount != null && this.netAmount.equals(other.getNetAmount())) && (this.posting == null && other.getPosting() == null || this.posting != null && this.posting.equals(other.getPosting())) && (this.quantityRevCommitted == null && other.getQuantityRevCommitted() == null || this.quantityRevCommitted != null && this.quantityRevCommitted.equals(other.getQuantityRevCommitted())) && (this.recognizedRevenue == null && other.getRecognizedRevenue() == null || this.recognizedRevenue != null && this.recognizedRevenue.equals(other.getRecognizedRevenue())) && (this.revCommitStatus == null && other.getRevCommitStatus() == null || this.revCommitStatus != null && this.revCommitStatus.equals(other.getRevCommitStatus())) && (this.revenueStatus == null && other.getRevenueStatus() == null || this.revenueStatus != null && this.revenueStatus.equals(other.getRevenueStatus())) && (this.revRecEndDate == null && other.getRevRecEndDate() == null || this.revRecEndDate != null && this.revRecEndDate.equals(other.getRevRecEndDate())) && (this.revRecOnRevCommitment == null && other.getRevRecOnRevCommitment() == null || this.revRecOnRevCommitment != null && this.revRecOnRevCommitment.equals(other.getRevRecOnRevCommitment())) && (this.revRecStartDate == null && other.getRevRecStartDate() == null || this.revRecStartDate != null && this.revRecStartDate.equals(other.getRevRecStartDate())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && this.subsidiary.equals(other.getSubsidiary())) && (this.tranIsVsoeBundle == null && other.getTranIsVsoeBundle() == null || this.tranIsVsoeBundle != null && this.tranIsVsoeBundle.equals(other.getTranIsVsoeBundle())) && (this.type == null && other.getType() == null || this.type != null && this.type.equals(other.getType())) && (this.vsoeAllocation == null && other.getVsoeAllocation() == null || this.vsoeAllocation != null && this.vsoeAllocation.equals(other.getVsoeAllocation()));
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
        if (this.getAccount() != null) {
            _hashCode += this.getAccount().hashCode();
        }
        if (this.getAccountingBook() != null) {
            _hashCode += this.getAccountingBook().hashCode();
        }
        if (this.getAccountType() != null) {
            _hashCode += this.getAccountType().hashCode();
        }
        if (this.getAltSalesAmount() != null) {
            _hashCode += this.getAltSalesAmount().hashCode();
        }
        if (this.getAltSalesNetAmount() != null) {
            _hashCode += this.getAltSalesNetAmount().hashCode();
        }
        if (this.getAmount() != null) {
            _hashCode += this.getAmount().hashCode();
        }
        if (this.getBookSpecificTransaction() != null) {
            _hashCode += this.getBookSpecificTransaction().hashCode();
        }
        if (this.getCatchUpPeriod() != null) {
            _hashCode += this.getCatchUpPeriod().hashCode();
        }
        if (this.getCreditAmount() != null) {
            _hashCode += this.getCreditAmount().hashCode();
        }
        if (this.getCustomGL() != null) {
            _hashCode += this.getCustomGL().hashCode();
        }
        if (this.getDebitAmount() != null) {
            _hashCode += this.getDebitAmount().hashCode();
        }
        if (this.getDeferRevRec() != null) {
            _hashCode += this.getDeferRevRec().hashCode();
        }
        if (this.getExchangeRate() != null) {
            _hashCode += this.getExchangeRate().hashCode();
        }
        if (this.getGrossAmount() != null) {
            _hashCode += this.getGrossAmount().hashCode();
        }
        if (this.getInternalId() != null) {
            _hashCode += this.getInternalId().hashCode();
        }
        if (this.getInternalIdNumber() != null) {
            _hashCode += this.getInternalIdNumber().hashCode();
        }
        if (this.getMultiSubsidiary() != null) {
            _hashCode += this.getMultiSubsidiary().hashCode();
        }
        if (this.getNetAmount() != null) {
            _hashCode += this.getNetAmount().hashCode();
        }
        if (this.getPosting() != null) {
            _hashCode += this.getPosting().hashCode();
        }
        if (this.getQuantityRevCommitted() != null) {
            _hashCode += this.getQuantityRevCommitted().hashCode();
        }
        if (this.getRecognizedRevenue() != null) {
            _hashCode += this.getRecognizedRevenue().hashCode();
        }
        if (this.getRevCommitStatus() != null) {
            _hashCode += this.getRevCommitStatus().hashCode();
        }
        if (this.getRevenueStatus() != null) {
            _hashCode += this.getRevenueStatus().hashCode();
        }
        if (this.getRevRecEndDate() != null) {
            _hashCode += this.getRevRecEndDate().hashCode();
        }
        if (this.getRevRecOnRevCommitment() != null) {
            _hashCode += this.getRevRecOnRevCommitment().hashCode();
        }
        if (this.getRevRecStartDate() != null) {
            _hashCode += this.getRevRecStartDate().hashCode();
        }
        if (this.getSubsidiary() != null) {
            _hashCode += this.getSubsidiary().hashCode();
        }
        if (this.getTranIsVsoeBundle() != null) {
            _hashCode += this.getTranIsVsoeBundle().hashCode();
        }
        if (this.getType() != null) {
            _hashCode += this.getType().hashCode();
        }
        if (this.getVsoeAllocation() != null) {
            _hashCode += this.getVsoeAllocation().hashCode();
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "AccountingTransactionSearchBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "account"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("accountingBook");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "accountingBook"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("accountType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "accountType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("altSalesAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "altSalesAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("altSalesNetAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "altSalesNetAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "amount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("bookSpecificTransaction");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "bookSpecificTransaction"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("catchUpPeriod");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "catchUpPeriod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("creditAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "creditAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customGL");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "customGL"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("debitAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "debitAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("deferRevRec");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "deferRevRec"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("exchangeRate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "exchangeRate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("grossAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "grossAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
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
        elemField.setFieldName("multiSubsidiary");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "multiSubsidiary"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("netAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "netAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("posting");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "posting"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityRevCommitted");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "quantityRevCommitted"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recognizedRevenue");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "recognizedRevenue"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revCommitStatus");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "revCommitStatus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revenueStatus");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "revenueStatus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revRecEndDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "revRecEndDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revRecOnRevCommitment");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "revRecOnRevCommitment"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revRecStartDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "revRecStartDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
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
        elemField.setFieldName("tranIsVsoeBundle");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "tranIsVsoeBundle"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "type"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vsoeAllocation");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "vsoeAllocation"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

