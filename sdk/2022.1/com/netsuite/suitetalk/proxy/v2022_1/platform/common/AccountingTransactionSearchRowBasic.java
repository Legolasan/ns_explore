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

public class AccountingTransactionSearchRowBasic
extends SearchRowBasic
implements Serializable {
    private SearchColumnSelectField[] account;
    private SearchColumnSelectField[] accountingBook;
    private SearchColumnStringField[] accountType;
    private SearchColumnDoubleField[] altSalesAmount;
    private SearchColumnDoubleField[] altSalesNetAmount;
    private SearchColumnDoubleField[] amount;
    private SearchColumnStringField[] baseCurrency;
    private SearchColumnStringField[] catchUpPeriod;
    private SearchColumnDoubleField[] creditAmount;
    private SearchColumnBooleanField[] customGL;
    private SearchColumnDateField[] dateCreated;
    private SearchColumnDoubleField[] debitAmount;
    private SearchColumnBooleanField[] deferRevRec;
    private SearchColumnDoubleField[] exchangeRate;
    private SearchColumnDoubleField[] fxAmount;
    private SearchColumnDoubleField[] grossAmount;
    private SearchColumnSelectField[] internalId;
    private SearchColumnDateField[] lastModifiedDate;
    private SearchColumnBooleanField[] multiSubsidiary;
    private SearchColumnDoubleField[] netAmount;
    private SearchColumnBooleanField[] posting;
    private SearchColumnDoubleField[] quantityRevCommitted;
    private SearchColumnDoubleField[] recognizedRevenue;
    private SearchColumnEnumSelectField[] revCommitStatus;
    private SearchColumnEnumSelectField[] revenueStatus;
    private SearchColumnDateField[] revRecEndDate;
    private SearchColumnBooleanField[] revRecOnRevCommitment;
    private SearchColumnDateField[] revRecStartDate;
    private SearchColumnSelectField[] subsidiary;
    private SearchColumnBooleanField[] tranIsVsoeBundle;
    private SearchColumnDoubleField[] vsoeAllocation;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(AccountingTransactionSearchRowBasic.class, true);

    public AccountingTransactionSearchRowBasic() {
    }

    public AccountingTransactionSearchRowBasic(SearchColumnSelectField[] account, SearchColumnSelectField[] accountingBook, SearchColumnStringField[] accountType, SearchColumnDoubleField[] altSalesAmount, SearchColumnDoubleField[] altSalesNetAmount, SearchColumnDoubleField[] amount, SearchColumnStringField[] baseCurrency, SearchColumnStringField[] catchUpPeriod, SearchColumnDoubleField[] creditAmount, SearchColumnBooleanField[] customGL, SearchColumnDateField[] dateCreated, SearchColumnDoubleField[] debitAmount, SearchColumnBooleanField[] deferRevRec, SearchColumnDoubleField[] exchangeRate, SearchColumnDoubleField[] fxAmount, SearchColumnDoubleField[] grossAmount, SearchColumnSelectField[] internalId, SearchColumnDateField[] lastModifiedDate, SearchColumnBooleanField[] multiSubsidiary, SearchColumnDoubleField[] netAmount, SearchColumnBooleanField[] posting, SearchColumnDoubleField[] quantityRevCommitted, SearchColumnDoubleField[] recognizedRevenue, SearchColumnEnumSelectField[] revCommitStatus, SearchColumnEnumSelectField[] revenueStatus, SearchColumnDateField[] revRecEndDate, SearchColumnBooleanField[] revRecOnRevCommitment, SearchColumnDateField[] revRecStartDate, SearchColumnSelectField[] subsidiary, SearchColumnBooleanField[] tranIsVsoeBundle, SearchColumnDoubleField[] vsoeAllocation) {
        this.account = account;
        this.accountingBook = accountingBook;
        this.accountType = accountType;
        this.altSalesAmount = altSalesAmount;
        this.altSalesNetAmount = altSalesNetAmount;
        this.amount = amount;
        this.baseCurrency = baseCurrency;
        this.catchUpPeriod = catchUpPeriod;
        this.creditAmount = creditAmount;
        this.customGL = customGL;
        this.dateCreated = dateCreated;
        this.debitAmount = debitAmount;
        this.deferRevRec = deferRevRec;
        this.exchangeRate = exchangeRate;
        this.fxAmount = fxAmount;
        this.grossAmount = grossAmount;
        this.internalId = internalId;
        this.lastModifiedDate = lastModifiedDate;
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
        this.vsoeAllocation = vsoeAllocation;
    }

    public SearchColumnSelectField[] getAccount() {
        return this.account;
    }

    public void setAccount(SearchColumnSelectField[] account) {
        this.account = account;
    }

    public SearchColumnSelectField getAccount(int i) {
        return this.account[i];
    }

    public void setAccount(int i, SearchColumnSelectField _value) {
        this.account[i] = _value;
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

    public SearchColumnStringField[] getAccountType() {
        return this.accountType;
    }

    public void setAccountType(SearchColumnStringField[] accountType) {
        this.accountType = accountType;
    }

    public SearchColumnStringField getAccountType(int i) {
        return this.accountType[i];
    }

    public void setAccountType(int i, SearchColumnStringField _value) {
        this.accountType[i] = _value;
    }

    public SearchColumnDoubleField[] getAltSalesAmount() {
        return this.altSalesAmount;
    }

    public void setAltSalesAmount(SearchColumnDoubleField[] altSalesAmount) {
        this.altSalesAmount = altSalesAmount;
    }

    public SearchColumnDoubleField getAltSalesAmount(int i) {
        return this.altSalesAmount[i];
    }

    public void setAltSalesAmount(int i, SearchColumnDoubleField _value) {
        this.altSalesAmount[i] = _value;
    }

    public SearchColumnDoubleField[] getAltSalesNetAmount() {
        return this.altSalesNetAmount;
    }

    public void setAltSalesNetAmount(SearchColumnDoubleField[] altSalesNetAmount) {
        this.altSalesNetAmount = altSalesNetAmount;
    }

    public SearchColumnDoubleField getAltSalesNetAmount(int i) {
        return this.altSalesNetAmount[i];
    }

    public void setAltSalesNetAmount(int i, SearchColumnDoubleField _value) {
        this.altSalesNetAmount[i] = _value;
    }

    public SearchColumnDoubleField[] getAmount() {
        return this.amount;
    }

    public void setAmount(SearchColumnDoubleField[] amount) {
        this.amount = amount;
    }

    public SearchColumnDoubleField getAmount(int i) {
        return this.amount[i];
    }

    public void setAmount(int i, SearchColumnDoubleField _value) {
        this.amount[i] = _value;
    }

    public SearchColumnStringField[] getBaseCurrency() {
        return this.baseCurrency;
    }

    public void setBaseCurrency(SearchColumnStringField[] baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public SearchColumnStringField getBaseCurrency(int i) {
        return this.baseCurrency[i];
    }

    public void setBaseCurrency(int i, SearchColumnStringField _value) {
        this.baseCurrency[i] = _value;
    }

    public SearchColumnStringField[] getCatchUpPeriod() {
        return this.catchUpPeriod;
    }

    public void setCatchUpPeriod(SearchColumnStringField[] catchUpPeriod) {
        this.catchUpPeriod = catchUpPeriod;
    }

    public SearchColumnStringField getCatchUpPeriod(int i) {
        return this.catchUpPeriod[i];
    }

    public void setCatchUpPeriod(int i, SearchColumnStringField _value) {
        this.catchUpPeriod[i] = _value;
    }

    public SearchColumnDoubleField[] getCreditAmount() {
        return this.creditAmount;
    }

    public void setCreditAmount(SearchColumnDoubleField[] creditAmount) {
        this.creditAmount = creditAmount;
    }

    public SearchColumnDoubleField getCreditAmount(int i) {
        return this.creditAmount[i];
    }

    public void setCreditAmount(int i, SearchColumnDoubleField _value) {
        this.creditAmount[i] = _value;
    }

    public SearchColumnBooleanField[] getCustomGL() {
        return this.customGL;
    }

    public void setCustomGL(SearchColumnBooleanField[] customGL) {
        this.customGL = customGL;
    }

    public SearchColumnBooleanField getCustomGL(int i) {
        return this.customGL[i];
    }

    public void setCustomGL(int i, SearchColumnBooleanField _value) {
        this.customGL[i] = _value;
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

    public SearchColumnDoubleField[] getDebitAmount() {
        return this.debitAmount;
    }

    public void setDebitAmount(SearchColumnDoubleField[] debitAmount) {
        this.debitAmount = debitAmount;
    }

    public SearchColumnDoubleField getDebitAmount(int i) {
        return this.debitAmount[i];
    }

    public void setDebitAmount(int i, SearchColumnDoubleField _value) {
        this.debitAmount[i] = _value;
    }

    public SearchColumnBooleanField[] getDeferRevRec() {
        return this.deferRevRec;
    }

    public void setDeferRevRec(SearchColumnBooleanField[] deferRevRec) {
        this.deferRevRec = deferRevRec;
    }

    public SearchColumnBooleanField getDeferRevRec(int i) {
        return this.deferRevRec[i];
    }

    public void setDeferRevRec(int i, SearchColumnBooleanField _value) {
        this.deferRevRec[i] = _value;
    }

    public SearchColumnDoubleField[] getExchangeRate() {
        return this.exchangeRate;
    }

    public void setExchangeRate(SearchColumnDoubleField[] exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public SearchColumnDoubleField getExchangeRate(int i) {
        return this.exchangeRate[i];
    }

    public void setExchangeRate(int i, SearchColumnDoubleField _value) {
        this.exchangeRate[i] = _value;
    }

    public SearchColumnDoubleField[] getFxAmount() {
        return this.fxAmount;
    }

    public void setFxAmount(SearchColumnDoubleField[] fxAmount) {
        this.fxAmount = fxAmount;
    }

    public SearchColumnDoubleField getFxAmount(int i) {
        return this.fxAmount[i];
    }

    public void setFxAmount(int i, SearchColumnDoubleField _value) {
        this.fxAmount[i] = _value;
    }

    public SearchColumnDoubleField[] getGrossAmount() {
        return this.grossAmount;
    }

    public void setGrossAmount(SearchColumnDoubleField[] grossAmount) {
        this.grossAmount = grossAmount;
    }

    public SearchColumnDoubleField getGrossAmount(int i) {
        return this.grossAmount[i];
    }

    public void setGrossAmount(int i, SearchColumnDoubleField _value) {
        this.grossAmount[i] = _value;
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

    public SearchColumnBooleanField[] getMultiSubsidiary() {
        return this.multiSubsidiary;
    }

    public void setMultiSubsidiary(SearchColumnBooleanField[] multiSubsidiary) {
        this.multiSubsidiary = multiSubsidiary;
    }

    public SearchColumnBooleanField getMultiSubsidiary(int i) {
        return this.multiSubsidiary[i];
    }

    public void setMultiSubsidiary(int i, SearchColumnBooleanField _value) {
        this.multiSubsidiary[i] = _value;
    }

    public SearchColumnDoubleField[] getNetAmount() {
        return this.netAmount;
    }

    public void setNetAmount(SearchColumnDoubleField[] netAmount) {
        this.netAmount = netAmount;
    }

    public SearchColumnDoubleField getNetAmount(int i) {
        return this.netAmount[i];
    }

    public void setNetAmount(int i, SearchColumnDoubleField _value) {
        this.netAmount[i] = _value;
    }

    public SearchColumnBooleanField[] getPosting() {
        return this.posting;
    }

    public void setPosting(SearchColumnBooleanField[] posting) {
        this.posting = posting;
    }

    public SearchColumnBooleanField getPosting(int i) {
        return this.posting[i];
    }

    public void setPosting(int i, SearchColumnBooleanField _value) {
        this.posting[i] = _value;
    }

    public SearchColumnDoubleField[] getQuantityRevCommitted() {
        return this.quantityRevCommitted;
    }

    public void setQuantityRevCommitted(SearchColumnDoubleField[] quantityRevCommitted) {
        this.quantityRevCommitted = quantityRevCommitted;
    }

    public SearchColumnDoubleField getQuantityRevCommitted(int i) {
        return this.quantityRevCommitted[i];
    }

    public void setQuantityRevCommitted(int i, SearchColumnDoubleField _value) {
        this.quantityRevCommitted[i] = _value;
    }

    public SearchColumnDoubleField[] getRecognizedRevenue() {
        return this.recognizedRevenue;
    }

    public void setRecognizedRevenue(SearchColumnDoubleField[] recognizedRevenue) {
        this.recognizedRevenue = recognizedRevenue;
    }

    public SearchColumnDoubleField getRecognizedRevenue(int i) {
        return this.recognizedRevenue[i];
    }

    public void setRecognizedRevenue(int i, SearchColumnDoubleField _value) {
        this.recognizedRevenue[i] = _value;
    }

    public SearchColumnEnumSelectField[] getRevCommitStatus() {
        return this.revCommitStatus;
    }

    public void setRevCommitStatus(SearchColumnEnumSelectField[] revCommitStatus) {
        this.revCommitStatus = revCommitStatus;
    }

    public SearchColumnEnumSelectField getRevCommitStatus(int i) {
        return this.revCommitStatus[i];
    }

    public void setRevCommitStatus(int i, SearchColumnEnumSelectField _value) {
        this.revCommitStatus[i] = _value;
    }

    public SearchColumnEnumSelectField[] getRevenueStatus() {
        return this.revenueStatus;
    }

    public void setRevenueStatus(SearchColumnEnumSelectField[] revenueStatus) {
        this.revenueStatus = revenueStatus;
    }

    public SearchColumnEnumSelectField getRevenueStatus(int i) {
        return this.revenueStatus[i];
    }

    public void setRevenueStatus(int i, SearchColumnEnumSelectField _value) {
        this.revenueStatus[i] = _value;
    }

    public SearchColumnDateField[] getRevRecEndDate() {
        return this.revRecEndDate;
    }

    public void setRevRecEndDate(SearchColumnDateField[] revRecEndDate) {
        this.revRecEndDate = revRecEndDate;
    }

    public SearchColumnDateField getRevRecEndDate(int i) {
        return this.revRecEndDate[i];
    }

    public void setRevRecEndDate(int i, SearchColumnDateField _value) {
        this.revRecEndDate[i] = _value;
    }

    public SearchColumnBooleanField[] getRevRecOnRevCommitment() {
        return this.revRecOnRevCommitment;
    }

    public void setRevRecOnRevCommitment(SearchColumnBooleanField[] revRecOnRevCommitment) {
        this.revRecOnRevCommitment = revRecOnRevCommitment;
    }

    public SearchColumnBooleanField getRevRecOnRevCommitment(int i) {
        return this.revRecOnRevCommitment[i];
    }

    public void setRevRecOnRevCommitment(int i, SearchColumnBooleanField _value) {
        this.revRecOnRevCommitment[i] = _value;
    }

    public SearchColumnDateField[] getRevRecStartDate() {
        return this.revRecStartDate;
    }

    public void setRevRecStartDate(SearchColumnDateField[] revRecStartDate) {
        this.revRecStartDate = revRecStartDate;
    }

    public SearchColumnDateField getRevRecStartDate(int i) {
        return this.revRecStartDate[i];
    }

    public void setRevRecStartDate(int i, SearchColumnDateField _value) {
        this.revRecStartDate[i] = _value;
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

    public SearchColumnBooleanField[] getTranIsVsoeBundle() {
        return this.tranIsVsoeBundle;
    }

    public void setTranIsVsoeBundle(SearchColumnBooleanField[] tranIsVsoeBundle) {
        this.tranIsVsoeBundle = tranIsVsoeBundle;
    }

    public SearchColumnBooleanField getTranIsVsoeBundle(int i) {
        return this.tranIsVsoeBundle[i];
    }

    public void setTranIsVsoeBundle(int i, SearchColumnBooleanField _value) {
        this.tranIsVsoeBundle[i] = _value;
    }

    public SearchColumnDoubleField[] getVsoeAllocation() {
        return this.vsoeAllocation;
    }

    public void setVsoeAllocation(SearchColumnDoubleField[] vsoeAllocation) {
        this.vsoeAllocation = vsoeAllocation;
    }

    public SearchColumnDoubleField getVsoeAllocation(int i) {
        return this.vsoeAllocation[i];
    }

    public void setVsoeAllocation(int i, SearchColumnDoubleField _value) {
        this.vsoeAllocation[i] = _value;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof AccountingTransactionSearchRowBasic)) {
            return false;
        }
        AccountingTransactionSearchRowBasic other = (AccountingTransactionSearchRowBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.account == null && other.getAccount() == null || this.account != null && Arrays.equals(this.account, other.getAccount())) && (this.accountingBook == null && other.getAccountingBook() == null || this.accountingBook != null && Arrays.equals(this.accountingBook, other.getAccountingBook())) && (this.accountType == null && other.getAccountType() == null || this.accountType != null && Arrays.equals(this.accountType, other.getAccountType())) && (this.altSalesAmount == null && other.getAltSalesAmount() == null || this.altSalesAmount != null && Arrays.equals(this.altSalesAmount, other.getAltSalesAmount())) && (this.altSalesNetAmount == null && other.getAltSalesNetAmount() == null || this.altSalesNetAmount != null && Arrays.equals(this.altSalesNetAmount, other.getAltSalesNetAmount())) && (this.amount == null && other.getAmount() == null || this.amount != null && Arrays.equals(this.amount, other.getAmount())) && (this.baseCurrency == null && other.getBaseCurrency() == null || this.baseCurrency != null && Arrays.equals(this.baseCurrency, other.getBaseCurrency())) && (this.catchUpPeriod == null && other.getCatchUpPeriod() == null || this.catchUpPeriod != null && Arrays.equals(this.catchUpPeriod, other.getCatchUpPeriod())) && (this.creditAmount == null && other.getCreditAmount() == null || this.creditAmount != null && Arrays.equals(this.creditAmount, other.getCreditAmount())) && (this.customGL == null && other.getCustomGL() == null || this.customGL != null && Arrays.equals(this.customGL, other.getCustomGL())) && (this.dateCreated == null && other.getDateCreated() == null || this.dateCreated != null && Arrays.equals(this.dateCreated, other.getDateCreated())) && (this.debitAmount == null && other.getDebitAmount() == null || this.debitAmount != null && Arrays.equals(this.debitAmount, other.getDebitAmount())) && (this.deferRevRec == null && other.getDeferRevRec() == null || this.deferRevRec != null && Arrays.equals(this.deferRevRec, other.getDeferRevRec())) && (this.exchangeRate == null && other.getExchangeRate() == null || this.exchangeRate != null && Arrays.equals(this.exchangeRate, other.getExchangeRate())) && (this.fxAmount == null && other.getFxAmount() == null || this.fxAmount != null && Arrays.equals(this.fxAmount, other.getFxAmount())) && (this.grossAmount == null && other.getGrossAmount() == null || this.grossAmount != null && Arrays.equals(this.grossAmount, other.getGrossAmount())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && Arrays.equals(this.internalId, other.getInternalId())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && Arrays.equals(this.lastModifiedDate, other.getLastModifiedDate())) && (this.multiSubsidiary == null && other.getMultiSubsidiary() == null || this.multiSubsidiary != null && Arrays.equals(this.multiSubsidiary, other.getMultiSubsidiary())) && (this.netAmount == null && other.getNetAmount() == null || this.netAmount != null && Arrays.equals(this.netAmount, other.getNetAmount())) && (this.posting == null && other.getPosting() == null || this.posting != null && Arrays.equals(this.posting, other.getPosting())) && (this.quantityRevCommitted == null && other.getQuantityRevCommitted() == null || this.quantityRevCommitted != null && Arrays.equals(this.quantityRevCommitted, other.getQuantityRevCommitted())) && (this.recognizedRevenue == null && other.getRecognizedRevenue() == null || this.recognizedRevenue != null && Arrays.equals(this.recognizedRevenue, other.getRecognizedRevenue())) && (this.revCommitStatus == null && other.getRevCommitStatus() == null || this.revCommitStatus != null && Arrays.equals(this.revCommitStatus, other.getRevCommitStatus())) && (this.revenueStatus == null && other.getRevenueStatus() == null || this.revenueStatus != null && Arrays.equals(this.revenueStatus, other.getRevenueStatus())) && (this.revRecEndDate == null && other.getRevRecEndDate() == null || this.revRecEndDate != null && Arrays.equals(this.revRecEndDate, other.getRevRecEndDate())) && (this.revRecOnRevCommitment == null && other.getRevRecOnRevCommitment() == null || this.revRecOnRevCommitment != null && Arrays.equals(this.revRecOnRevCommitment, other.getRevRecOnRevCommitment())) && (this.revRecStartDate == null && other.getRevRecStartDate() == null || this.revRecStartDate != null && Arrays.equals(this.revRecStartDate, other.getRevRecStartDate())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && Arrays.equals(this.subsidiary, other.getSubsidiary())) && (this.tranIsVsoeBundle == null && other.getTranIsVsoeBundle() == null || this.tranIsVsoeBundle != null && Arrays.equals(this.tranIsVsoeBundle, other.getTranIsVsoeBundle())) && (this.vsoeAllocation == null && other.getVsoeAllocation() == null || this.vsoeAllocation != null && Arrays.equals(this.vsoeAllocation, other.getVsoeAllocation()));
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
        if (this.getAccount() != null) {
            for (i = 0; i < Array.getLength(this.getAccount()); ++i) {
                obj = Array.get(this.getAccount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAccountingBook() != null) {
            for (i = 0; i < Array.getLength(this.getAccountingBook()); ++i) {
                obj = Array.get(this.getAccountingBook(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAccountType() != null) {
            for (i = 0; i < Array.getLength(this.getAccountType()); ++i) {
                obj = Array.get(this.getAccountType(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAltSalesAmount() != null) {
            for (i = 0; i < Array.getLength(this.getAltSalesAmount()); ++i) {
                obj = Array.get(this.getAltSalesAmount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAltSalesNetAmount() != null) {
            for (i = 0; i < Array.getLength(this.getAltSalesNetAmount()); ++i) {
                obj = Array.get(this.getAltSalesNetAmount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAmount() != null) {
            for (i = 0; i < Array.getLength(this.getAmount()); ++i) {
                obj = Array.get(this.getAmount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBaseCurrency() != null) {
            for (i = 0; i < Array.getLength(this.getBaseCurrency()); ++i) {
                obj = Array.get(this.getBaseCurrency(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCatchUpPeriod() != null) {
            for (i = 0; i < Array.getLength(this.getCatchUpPeriod()); ++i) {
                obj = Array.get(this.getCatchUpPeriod(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCreditAmount() != null) {
            for (i = 0; i < Array.getLength(this.getCreditAmount()); ++i) {
                obj = Array.get(this.getCreditAmount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCustomGL() != null) {
            for (i = 0; i < Array.getLength(this.getCustomGL()); ++i) {
                obj = Array.get(this.getCustomGL(), i);
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
        if (this.getDebitAmount() != null) {
            for (i = 0; i < Array.getLength(this.getDebitAmount()); ++i) {
                obj = Array.get(this.getDebitAmount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDeferRevRec() != null) {
            for (i = 0; i < Array.getLength(this.getDeferRevRec()); ++i) {
                obj = Array.get(this.getDeferRevRec(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getExchangeRate() != null) {
            for (i = 0; i < Array.getLength(this.getExchangeRate()); ++i) {
                obj = Array.get(this.getExchangeRate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getFxAmount() != null) {
            for (i = 0; i < Array.getLength(this.getFxAmount()); ++i) {
                obj = Array.get(this.getFxAmount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getGrossAmount() != null) {
            for (i = 0; i < Array.getLength(this.getGrossAmount()); ++i) {
                obj = Array.get(this.getGrossAmount(), i);
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
        if (this.getLastModifiedDate() != null) {
            for (i = 0; i < Array.getLength(this.getLastModifiedDate()); ++i) {
                obj = Array.get(this.getLastModifiedDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getMultiSubsidiary() != null) {
            for (i = 0; i < Array.getLength(this.getMultiSubsidiary()); ++i) {
                obj = Array.get(this.getMultiSubsidiary(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getNetAmount() != null) {
            for (i = 0; i < Array.getLength(this.getNetAmount()); ++i) {
                obj = Array.get(this.getNetAmount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPosting() != null) {
            for (i = 0; i < Array.getLength(this.getPosting()); ++i) {
                obj = Array.get(this.getPosting(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getQuantityRevCommitted() != null) {
            for (i = 0; i < Array.getLength(this.getQuantityRevCommitted()); ++i) {
                obj = Array.get(this.getQuantityRevCommitted(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRecognizedRevenue() != null) {
            for (i = 0; i < Array.getLength(this.getRecognizedRevenue()); ++i) {
                obj = Array.get(this.getRecognizedRevenue(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRevCommitStatus() != null) {
            for (i = 0; i < Array.getLength(this.getRevCommitStatus()); ++i) {
                obj = Array.get(this.getRevCommitStatus(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRevenueStatus() != null) {
            for (i = 0; i < Array.getLength(this.getRevenueStatus()); ++i) {
                obj = Array.get(this.getRevenueStatus(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRevRecEndDate() != null) {
            for (i = 0; i < Array.getLength(this.getRevRecEndDate()); ++i) {
                obj = Array.get(this.getRevRecEndDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRevRecOnRevCommitment() != null) {
            for (i = 0; i < Array.getLength(this.getRevRecOnRevCommitment()); ++i) {
                obj = Array.get(this.getRevRecOnRevCommitment(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRevRecStartDate() != null) {
            for (i = 0; i < Array.getLength(this.getRevRecStartDate()); ++i) {
                obj = Array.get(this.getRevRecStartDate(), i);
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
        if (this.getTranIsVsoeBundle() != null) {
            for (i = 0; i < Array.getLength(this.getTranIsVsoeBundle()); ++i) {
                obj = Array.get(this.getTranIsVsoeBundle(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getVsoeAllocation() != null) {
            for (i = 0; i < Array.getLength(this.getVsoeAllocation()); ++i) {
                obj = Array.get(this.getVsoeAllocation(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "AccountingTransactionSearchRowBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "account"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("accountingBook");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "accountingBook"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("accountType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "accountType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("altSalesAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "altSalesAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("altSalesNetAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "altSalesNetAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "amount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("baseCurrency");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "baseCurrency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("catchUpPeriod");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "catchUpPeriod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("creditAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "creditAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customGL");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "customGL"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
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
        elemField.setFieldName("debitAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "debitAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("deferRevRec");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "deferRevRec"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("exchangeRate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "exchangeRate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fxAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fxAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("grossAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "grossAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
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
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("multiSubsidiary");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "multiSubsidiary"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("netAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "netAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("posting");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "posting"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityRevCommitted");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "quantityRevCommitted"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recognizedRevenue");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "recognizedRevenue"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revCommitStatus");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "revCommitStatus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revenueStatus");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "revenueStatus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revRecEndDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "revRecEndDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revRecOnRevCommitment");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "revRecOnRevCommitment"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revRecStartDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "revRecStartDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
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
        elemField.setFieldName("tranIsVsoeBundle");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "tranIsVsoeBundle"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vsoeAllocation");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "vsoeAllocation"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

