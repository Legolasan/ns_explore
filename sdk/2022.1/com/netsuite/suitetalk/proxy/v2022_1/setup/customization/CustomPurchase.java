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
package com.netsuite.suitetalk.proxy.v2022_1.setup.customization;

import com.netsuite.suitetalk.proxy.v2022_1.platform.common.AccountingBookDetailList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.Address;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.InstallmentList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.PurchLandedCostList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.TaxDetailsList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.types.LandedCostMethod;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.CustomFieldList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.NullField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.Record;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRefList;
import com.netsuite.suitetalk.proxy.v2022_1.setup.customization.CustomPurchaseExpenseList;
import com.netsuite.suitetalk.proxy.v2022_1.setup.customization.CustomPurchaseItemList;
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

public class CustomPurchase
extends Record
implements Serializable {
    private Calendar createdDate;
    private Calendar lastModifiedDate;
    private RecordRef tranType;
    private RecordRef nexus;
    private RecordRef subsidiaryTaxRegNum;
    private Boolean taxRegOverride;
    private Boolean taxDetailsOverride;
    private RecordRef customForm;
    private RecordRef billAddressList;
    private RecordRef account;
    private RecordRef entity;
    private RecordRef subsidiary;
    private RecordRef postingPeriod;
    private Calendar tranDate;
    private String currencyName;
    private Address billingAddress;
    private Double exchangeRate;
    private RecordRef entityTaxRegNum;
    private RecordRef terms;
    private Calendar dueDate;
    private Calendar discountDate;
    private String tranId;
    private RecordRef createdFrom;
    private Double userTotal;
    private Double discountAmount;
    private Double taxTotal;
    private Boolean paymentHold;
    private String memo;
    private RecordRef tranStatus;
    private Double availableVendorCredit;
    private LandedCostMethod landedCostMethod;
    private Boolean landedCostPerLine;
    private RecordRef currency;
    private RecordRef incoterm;
    private RecordRef _class;
    private RecordRef department;
    private RecordRef location;
    private String status;
    private String transactionNumber;
    private Boolean overrideInstallments;
    private InstallmentList installmentList;
    private CustomPurchaseExpenseList expenseList;
    private AccountingBookDetailList accountingBookDetailList;
    private CustomPurchaseItemList itemList;
    private PurchLandedCostList landedCostsList;
    private RecordRefList purchaseOrderList;
    private TaxDetailsList taxDetailsList;
    private CustomFieldList customFieldList;
    private String internalId;
    private String externalId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(CustomPurchase.class, true);

    public CustomPurchase() {
    }

    public CustomPurchase(NullField nullFieldList, String internalId, String externalId, Calendar createdDate, Calendar lastModifiedDate, RecordRef tranType, RecordRef nexus, RecordRef subsidiaryTaxRegNum, Boolean taxRegOverride, Boolean taxDetailsOverride, RecordRef customForm, RecordRef billAddressList, RecordRef account, RecordRef entity, RecordRef subsidiary, RecordRef postingPeriod, Calendar tranDate, String currencyName, Address billingAddress, Double exchangeRate, RecordRef entityTaxRegNum, RecordRef terms, Calendar dueDate, Calendar discountDate, String tranId, RecordRef createdFrom, Double userTotal, Double discountAmount, Double taxTotal, Boolean paymentHold, String memo, RecordRef tranStatus, Double availableVendorCredit, LandedCostMethod landedCostMethod, Boolean landedCostPerLine, RecordRef currency, RecordRef incoterm, RecordRef _class, RecordRef department, RecordRef location, String status, String transactionNumber, Boolean overrideInstallments, InstallmentList installmentList, CustomPurchaseExpenseList expenseList, AccountingBookDetailList accountingBookDetailList, CustomPurchaseItemList itemList, PurchLandedCostList landedCostsList, RecordRefList purchaseOrderList, TaxDetailsList taxDetailsList, CustomFieldList customFieldList) {
        super(nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.tranType = tranType;
        this.nexus = nexus;
        this.subsidiaryTaxRegNum = subsidiaryTaxRegNum;
        this.taxRegOverride = taxRegOverride;
        this.taxDetailsOverride = taxDetailsOverride;
        this.customForm = customForm;
        this.billAddressList = billAddressList;
        this.account = account;
        this.entity = entity;
        this.subsidiary = subsidiary;
        this.postingPeriod = postingPeriod;
        this.tranDate = tranDate;
        this.currencyName = currencyName;
        this.billingAddress = billingAddress;
        this.exchangeRate = exchangeRate;
        this.entityTaxRegNum = entityTaxRegNum;
        this.terms = terms;
        this.dueDate = dueDate;
        this.discountDate = discountDate;
        this.tranId = tranId;
        this.createdFrom = createdFrom;
        this.userTotal = userTotal;
        this.discountAmount = discountAmount;
        this.taxTotal = taxTotal;
        this.paymentHold = paymentHold;
        this.memo = memo;
        this.tranStatus = tranStatus;
        this.availableVendorCredit = availableVendorCredit;
        this.landedCostMethod = landedCostMethod;
        this.landedCostPerLine = landedCostPerLine;
        this.currency = currency;
        this.incoterm = incoterm;
        this._class = _class;
        this.department = department;
        this.location = location;
        this.status = status;
        this.transactionNumber = transactionNumber;
        this.overrideInstallments = overrideInstallments;
        this.installmentList = installmentList;
        this.expenseList = expenseList;
        this.accountingBookDetailList = accountingBookDetailList;
        this.itemList = itemList;
        this.landedCostsList = landedCostsList;
        this.purchaseOrderList = purchaseOrderList;
        this.taxDetailsList = taxDetailsList;
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

    public RecordRef getTranType() {
        return this.tranType;
    }

    public void setTranType(RecordRef tranType) {
        this.tranType = tranType;
    }

    public RecordRef getNexus() {
        return this.nexus;
    }

    public void setNexus(RecordRef nexus) {
        this.nexus = nexus;
    }

    public RecordRef getSubsidiaryTaxRegNum() {
        return this.subsidiaryTaxRegNum;
    }

    public void setSubsidiaryTaxRegNum(RecordRef subsidiaryTaxRegNum) {
        this.subsidiaryTaxRegNum = subsidiaryTaxRegNum;
    }

    public Boolean getTaxRegOverride() {
        return this.taxRegOverride;
    }

    public void setTaxRegOverride(Boolean taxRegOverride) {
        this.taxRegOverride = taxRegOverride;
    }

    public Boolean getTaxDetailsOverride() {
        return this.taxDetailsOverride;
    }

    public void setTaxDetailsOverride(Boolean taxDetailsOverride) {
        this.taxDetailsOverride = taxDetailsOverride;
    }

    public RecordRef getCustomForm() {
        return this.customForm;
    }

    public void setCustomForm(RecordRef customForm) {
        this.customForm = customForm;
    }

    public RecordRef getBillAddressList() {
        return this.billAddressList;
    }

    public void setBillAddressList(RecordRef billAddressList) {
        this.billAddressList = billAddressList;
    }

    public RecordRef getAccount() {
        return this.account;
    }

    public void setAccount(RecordRef account) {
        this.account = account;
    }

    public RecordRef getEntity() {
        return this.entity;
    }

    public void setEntity(RecordRef entity) {
        this.entity = entity;
    }

    public RecordRef getSubsidiary() {
        return this.subsidiary;
    }

    public void setSubsidiary(RecordRef subsidiary) {
        this.subsidiary = subsidiary;
    }

    public RecordRef getPostingPeriod() {
        return this.postingPeriod;
    }

    public void setPostingPeriod(RecordRef postingPeriod) {
        this.postingPeriod = postingPeriod;
    }

    public Calendar getTranDate() {
        return this.tranDate;
    }

    public void setTranDate(Calendar tranDate) {
        this.tranDate = tranDate;
    }

    public String getCurrencyName() {
        return this.currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public Address getBillingAddress() {
        return this.billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public Double getExchangeRate() {
        return this.exchangeRate;
    }

    public void setExchangeRate(Double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public RecordRef getEntityTaxRegNum() {
        return this.entityTaxRegNum;
    }

    public void setEntityTaxRegNum(RecordRef entityTaxRegNum) {
        this.entityTaxRegNum = entityTaxRegNum;
    }

    public RecordRef getTerms() {
        return this.terms;
    }

    public void setTerms(RecordRef terms) {
        this.terms = terms;
    }

    public Calendar getDueDate() {
        return this.dueDate;
    }

    public void setDueDate(Calendar dueDate) {
        this.dueDate = dueDate;
    }

    public Calendar getDiscountDate() {
        return this.discountDate;
    }

    public void setDiscountDate(Calendar discountDate) {
        this.discountDate = discountDate;
    }

    public String getTranId() {
        return this.tranId;
    }

    public void setTranId(String tranId) {
        this.tranId = tranId;
    }

    public RecordRef getCreatedFrom() {
        return this.createdFrom;
    }

    public void setCreatedFrom(RecordRef createdFrom) {
        this.createdFrom = createdFrom;
    }

    public Double getUserTotal() {
        return this.userTotal;
    }

    public void setUserTotal(Double userTotal) {
        this.userTotal = userTotal;
    }

    public Double getDiscountAmount() {
        return this.discountAmount;
    }

    public void setDiscountAmount(Double discountAmount) {
        this.discountAmount = discountAmount;
    }

    public Double getTaxTotal() {
        return this.taxTotal;
    }

    public void setTaxTotal(Double taxTotal) {
        this.taxTotal = taxTotal;
    }

    public Boolean getPaymentHold() {
        return this.paymentHold;
    }

    public void setPaymentHold(Boolean paymentHold) {
        this.paymentHold = paymentHold;
    }

    public String getMemo() {
        return this.memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public RecordRef getTranStatus() {
        return this.tranStatus;
    }

    public void setTranStatus(RecordRef tranStatus) {
        this.tranStatus = tranStatus;
    }

    public Double getAvailableVendorCredit() {
        return this.availableVendorCredit;
    }

    public void setAvailableVendorCredit(Double availableVendorCredit) {
        this.availableVendorCredit = availableVendorCredit;
    }

    public LandedCostMethod getLandedCostMethod() {
        return this.landedCostMethod;
    }

    public void setLandedCostMethod(LandedCostMethod landedCostMethod) {
        this.landedCostMethod = landedCostMethod;
    }

    public Boolean getLandedCostPerLine() {
        return this.landedCostPerLine;
    }

    public void setLandedCostPerLine(Boolean landedCostPerLine) {
        this.landedCostPerLine = landedCostPerLine;
    }

    public RecordRef getCurrency() {
        return this.currency;
    }

    public void setCurrency(RecordRef currency) {
        this.currency = currency;
    }

    public RecordRef getIncoterm() {
        return this.incoterm;
    }

    public void setIncoterm(RecordRef incoterm) {
        this.incoterm = incoterm;
    }

    public RecordRef get_class() {
        return this._class;
    }

    public void set_class(RecordRef _class) {
        this._class = _class;
    }

    public RecordRef getDepartment() {
        return this.department;
    }

    public void setDepartment(RecordRef department) {
        this.department = department;
    }

    public RecordRef getLocation() {
        return this.location;
    }

    public void setLocation(RecordRef location) {
        this.location = location;
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

    public Boolean getOverrideInstallments() {
        return this.overrideInstallments;
    }

    public void setOverrideInstallments(Boolean overrideInstallments) {
        this.overrideInstallments = overrideInstallments;
    }

    public InstallmentList getInstallmentList() {
        return this.installmentList;
    }

    public void setInstallmentList(InstallmentList installmentList) {
        this.installmentList = installmentList;
    }

    public CustomPurchaseExpenseList getExpenseList() {
        return this.expenseList;
    }

    public void setExpenseList(CustomPurchaseExpenseList expenseList) {
        this.expenseList = expenseList;
    }

    public AccountingBookDetailList getAccountingBookDetailList() {
        return this.accountingBookDetailList;
    }

    public void setAccountingBookDetailList(AccountingBookDetailList accountingBookDetailList) {
        this.accountingBookDetailList = accountingBookDetailList;
    }

    public CustomPurchaseItemList getItemList() {
        return this.itemList;
    }

    public void setItemList(CustomPurchaseItemList itemList) {
        this.itemList = itemList;
    }

    public PurchLandedCostList getLandedCostsList() {
        return this.landedCostsList;
    }

    public void setLandedCostsList(PurchLandedCostList landedCostsList) {
        this.landedCostsList = landedCostsList;
    }

    public RecordRefList getPurchaseOrderList() {
        return this.purchaseOrderList;
    }

    public void setPurchaseOrderList(RecordRefList purchaseOrderList) {
        this.purchaseOrderList = purchaseOrderList;
    }

    public TaxDetailsList getTaxDetailsList() {
        return this.taxDetailsList;
    }

    public void setTaxDetailsList(TaxDetailsList taxDetailsList) {
        this.taxDetailsList = taxDetailsList;
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
        if (!(obj instanceof CustomPurchase)) {
            return false;
        }
        CustomPurchase other = (CustomPurchase)obj;
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
        boolean _equals = super.equals(obj) && (this.createdDate == null && other.getCreatedDate() == null || this.createdDate != null && this.createdDate.equals(other.getCreatedDate())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && this.lastModifiedDate.equals(other.getLastModifiedDate())) && (this.tranType == null && other.getTranType() == null || this.tranType != null && this.tranType.equals(other.getTranType())) && (this.nexus == null && other.getNexus() == null || this.nexus != null && this.nexus.equals(other.getNexus())) && (this.subsidiaryTaxRegNum == null && other.getSubsidiaryTaxRegNum() == null || this.subsidiaryTaxRegNum != null && this.subsidiaryTaxRegNum.equals(other.getSubsidiaryTaxRegNum())) && (this.taxRegOverride == null && other.getTaxRegOverride() == null || this.taxRegOverride != null && this.taxRegOverride.equals(other.getTaxRegOverride())) && (this.taxDetailsOverride == null && other.getTaxDetailsOverride() == null || this.taxDetailsOverride != null && this.taxDetailsOverride.equals(other.getTaxDetailsOverride())) && (this.customForm == null && other.getCustomForm() == null || this.customForm != null && this.customForm.equals(other.getCustomForm())) && (this.billAddressList == null && other.getBillAddressList() == null || this.billAddressList != null && this.billAddressList.equals(other.getBillAddressList())) && (this.account == null && other.getAccount() == null || this.account != null && this.account.equals(other.getAccount())) && (this.entity == null && other.getEntity() == null || this.entity != null && this.entity.equals(other.getEntity())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && this.subsidiary.equals(other.getSubsidiary())) && (this.postingPeriod == null && other.getPostingPeriod() == null || this.postingPeriod != null && this.postingPeriod.equals(other.getPostingPeriod())) && (this.tranDate == null && other.getTranDate() == null || this.tranDate != null && this.tranDate.equals(other.getTranDate())) && (this.currencyName == null && other.getCurrencyName() == null || this.currencyName != null && this.currencyName.equals(other.getCurrencyName())) && (this.billingAddress == null && other.getBillingAddress() == null || this.billingAddress != null && this.billingAddress.equals(other.getBillingAddress())) && (this.exchangeRate == null && other.getExchangeRate() == null || this.exchangeRate != null && this.exchangeRate.equals(other.getExchangeRate())) && (this.entityTaxRegNum == null && other.getEntityTaxRegNum() == null || this.entityTaxRegNum != null && this.entityTaxRegNum.equals(other.getEntityTaxRegNum())) && (this.terms == null && other.getTerms() == null || this.terms != null && this.terms.equals(other.getTerms())) && (this.dueDate == null && other.getDueDate() == null || this.dueDate != null && this.dueDate.equals(other.getDueDate())) && (this.discountDate == null && other.getDiscountDate() == null || this.discountDate != null && this.discountDate.equals(other.getDiscountDate())) && (this.tranId == null && other.getTranId() == null || this.tranId != null && this.tranId.equals(other.getTranId())) && (this.createdFrom == null && other.getCreatedFrom() == null || this.createdFrom != null && this.createdFrom.equals(other.getCreatedFrom())) && (this.userTotal == null && other.getUserTotal() == null || this.userTotal != null && this.userTotal.equals(other.getUserTotal())) && (this.discountAmount == null && other.getDiscountAmount() == null || this.discountAmount != null && this.discountAmount.equals(other.getDiscountAmount())) && (this.taxTotal == null && other.getTaxTotal() == null || this.taxTotal != null && this.taxTotal.equals(other.getTaxTotal())) && (this.paymentHold == null && other.getPaymentHold() == null || this.paymentHold != null && this.paymentHold.equals(other.getPaymentHold())) && (this.memo == null && other.getMemo() == null || this.memo != null && this.memo.equals(other.getMemo())) && (this.tranStatus == null && other.getTranStatus() == null || this.tranStatus != null && this.tranStatus.equals(other.getTranStatus())) && (this.availableVendorCredit == null && other.getAvailableVendorCredit() == null || this.availableVendorCredit != null && this.availableVendorCredit.equals(other.getAvailableVendorCredit())) && (this.landedCostMethod == null && other.getLandedCostMethod() == null || this.landedCostMethod != null && this.landedCostMethod.equals(other.getLandedCostMethod())) && (this.landedCostPerLine == null && other.getLandedCostPerLine() == null || this.landedCostPerLine != null && this.landedCostPerLine.equals(other.getLandedCostPerLine())) && (this.currency == null && other.getCurrency() == null || this.currency != null && this.currency.equals(other.getCurrency())) && (this.incoterm == null && other.getIncoterm() == null || this.incoterm != null && this.incoterm.equals(other.getIncoterm())) && (this._class == null && other.get_class() == null || this._class != null && this._class.equals(other.get_class())) && (this.department == null && other.getDepartment() == null || this.department != null && this.department.equals(other.getDepartment())) && (this.location == null && other.getLocation() == null || this.location != null && this.location.equals(other.getLocation())) && (this.status == null && other.getStatus() == null || this.status != null && this.status.equals(other.getStatus())) && (this.transactionNumber == null && other.getTransactionNumber() == null || this.transactionNumber != null && this.transactionNumber.equals(other.getTransactionNumber())) && (this.overrideInstallments == null && other.getOverrideInstallments() == null || this.overrideInstallments != null && this.overrideInstallments.equals(other.getOverrideInstallments())) && (this.installmentList == null && other.getInstallmentList() == null || this.installmentList != null && this.installmentList.equals(other.getInstallmentList())) && (this.expenseList == null && other.getExpenseList() == null || this.expenseList != null && this.expenseList.equals(other.getExpenseList())) && (this.accountingBookDetailList == null && other.getAccountingBookDetailList() == null || this.accountingBookDetailList != null && this.accountingBookDetailList.equals(other.getAccountingBookDetailList())) && (this.itemList == null && other.getItemList() == null || this.itemList != null && this.itemList.equals(other.getItemList())) && (this.landedCostsList == null && other.getLandedCostsList() == null || this.landedCostsList != null && this.landedCostsList.equals(other.getLandedCostsList())) && (this.purchaseOrderList == null && other.getPurchaseOrderList() == null || this.purchaseOrderList != null && this.purchaseOrderList.equals(other.getPurchaseOrderList())) && (this.taxDetailsList == null && other.getTaxDetailsList() == null || this.taxDetailsList != null && this.taxDetailsList.equals(other.getTaxDetailsList())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
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
        if (this.getTranType() != null) {
            _hashCode += this.getTranType().hashCode();
        }
        if (this.getNexus() != null) {
            _hashCode += this.getNexus().hashCode();
        }
        if (this.getSubsidiaryTaxRegNum() != null) {
            _hashCode += this.getSubsidiaryTaxRegNum().hashCode();
        }
        if (this.getTaxRegOverride() != null) {
            _hashCode += this.getTaxRegOverride().hashCode();
        }
        if (this.getTaxDetailsOverride() != null) {
            _hashCode += this.getTaxDetailsOverride().hashCode();
        }
        if (this.getCustomForm() != null) {
            _hashCode += this.getCustomForm().hashCode();
        }
        if (this.getBillAddressList() != null) {
            _hashCode += this.getBillAddressList().hashCode();
        }
        if (this.getAccount() != null) {
            _hashCode += this.getAccount().hashCode();
        }
        if (this.getEntity() != null) {
            _hashCode += this.getEntity().hashCode();
        }
        if (this.getSubsidiary() != null) {
            _hashCode += this.getSubsidiary().hashCode();
        }
        if (this.getPostingPeriod() != null) {
            _hashCode += this.getPostingPeriod().hashCode();
        }
        if (this.getTranDate() != null) {
            _hashCode += this.getTranDate().hashCode();
        }
        if (this.getCurrencyName() != null) {
            _hashCode += this.getCurrencyName().hashCode();
        }
        if (this.getBillingAddress() != null) {
            _hashCode += this.getBillingAddress().hashCode();
        }
        if (this.getExchangeRate() != null) {
            _hashCode += this.getExchangeRate().hashCode();
        }
        if (this.getEntityTaxRegNum() != null) {
            _hashCode += this.getEntityTaxRegNum().hashCode();
        }
        if (this.getTerms() != null) {
            _hashCode += this.getTerms().hashCode();
        }
        if (this.getDueDate() != null) {
            _hashCode += this.getDueDate().hashCode();
        }
        if (this.getDiscountDate() != null) {
            _hashCode += this.getDiscountDate().hashCode();
        }
        if (this.getTranId() != null) {
            _hashCode += this.getTranId().hashCode();
        }
        if (this.getCreatedFrom() != null) {
            _hashCode += this.getCreatedFrom().hashCode();
        }
        if (this.getUserTotal() != null) {
            _hashCode += this.getUserTotal().hashCode();
        }
        if (this.getDiscountAmount() != null) {
            _hashCode += this.getDiscountAmount().hashCode();
        }
        if (this.getTaxTotal() != null) {
            _hashCode += this.getTaxTotal().hashCode();
        }
        if (this.getPaymentHold() != null) {
            _hashCode += this.getPaymentHold().hashCode();
        }
        if (this.getMemo() != null) {
            _hashCode += this.getMemo().hashCode();
        }
        if (this.getTranStatus() != null) {
            _hashCode += this.getTranStatus().hashCode();
        }
        if (this.getAvailableVendorCredit() != null) {
            _hashCode += this.getAvailableVendorCredit().hashCode();
        }
        if (this.getLandedCostMethod() != null) {
            _hashCode += this.getLandedCostMethod().hashCode();
        }
        if (this.getLandedCostPerLine() != null) {
            _hashCode += this.getLandedCostPerLine().hashCode();
        }
        if (this.getCurrency() != null) {
            _hashCode += this.getCurrency().hashCode();
        }
        if (this.getIncoterm() != null) {
            _hashCode += this.getIncoterm().hashCode();
        }
        if (this.get_class() != null) {
            _hashCode += this.get_class().hashCode();
        }
        if (this.getDepartment() != null) {
            _hashCode += this.getDepartment().hashCode();
        }
        if (this.getLocation() != null) {
            _hashCode += this.getLocation().hashCode();
        }
        if (this.getStatus() != null) {
            _hashCode += this.getStatus().hashCode();
        }
        if (this.getTransactionNumber() != null) {
            _hashCode += this.getTransactionNumber().hashCode();
        }
        if (this.getOverrideInstallments() != null) {
            _hashCode += this.getOverrideInstallments().hashCode();
        }
        if (this.getInstallmentList() != null) {
            _hashCode += this.getInstallmentList().hashCode();
        }
        if (this.getExpenseList() != null) {
            _hashCode += this.getExpenseList().hashCode();
        }
        if (this.getAccountingBookDetailList() != null) {
            _hashCode += this.getAccountingBookDetailList().hashCode();
        }
        if (this.getItemList() != null) {
            _hashCode += this.getItemList().hashCode();
        }
        if (this.getLandedCostsList() != null) {
            _hashCode += this.getLandedCostsList().hashCode();
        }
        if (this.getPurchaseOrderList() != null) {
            _hashCode += this.getPurchaseOrderList().hashCode();
        }
        if (this.getTaxDetailsList() != null) {
            _hashCode += this.getTaxDetailsList().hashCode();
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
        typeDesc.setXmlType(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "CustomPurchase"));
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
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("tranType");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "tranType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("nexus");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "nexus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subsidiaryTaxRegNum");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "subsidiaryTaxRegNum"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxRegOverride");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "taxRegOverride"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxDetailsOverride");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "taxDetailsOverride"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customForm");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billAddressList");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "billAddressList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "account"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("entity");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "entity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("postingPeriod");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "postingPeriod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("tranDate");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "tranDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("currencyName");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "currencyName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billingAddress");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "billingAddress"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("exchangeRate");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "exchangeRate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("entityTaxRegNum");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "entityTaxRegNum"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("terms");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "terms"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("dueDate");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "dueDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("discountDate");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "discountDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("tranId");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "tranId"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("createdFrom");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "createdFrom"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("userTotal");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "userTotal"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("discountAmount");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "discountAmount"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxTotal");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "taxTotal"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("paymentHold");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "paymentHold"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("tranStatus");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "tranStatus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("availableVendorCredit");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "availableVendorCredit"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("landedCostMethod");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "landedCostMethod"));
        elemField.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "LandedCostMethod"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("landedCostPerLine");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "landedCostPerLine"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("incoterm");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "incoterm"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "class"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "department"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "location"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "status"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("transactionNumber");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "transactionNumber"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("overrideInstallments");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "overrideInstallments"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("installmentList");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "installmentList"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "InstallmentList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("expenseList");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "expenseList"));
        elemField.setXmlType(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "CustomPurchaseExpenseList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("accountingBookDetailList");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "accountingBookDetailList"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "AccountingBookDetailList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemList");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "itemList"));
        elemField.setXmlType(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "CustomPurchaseItemList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("landedCostsList");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "landedCostsList"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "PurchLandedCostList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("purchaseOrderList");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "purchaseOrderList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRefList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxDetailsList");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "taxDetailsList"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TaxDetailsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "CustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

