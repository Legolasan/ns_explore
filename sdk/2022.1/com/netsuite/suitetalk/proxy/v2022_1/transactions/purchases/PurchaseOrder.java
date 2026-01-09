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
package com.netsuite.suitetalk.proxy.v2022_1.transactions.purchases;

import com.netsuite.suitetalk.proxy.v2022_1.platform.common.AccountingBookDetailList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.Address;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.TaxDetailsList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.types.IntercoStatus;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.CustomFieldList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.NullField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.Record;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.purchases.PurchaseOrderExpenseList;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.purchases.PurchaseOrderItemList;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.purchases.types.PurchaseOrderOrderStatus;
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

public class PurchaseOrder
extends Record
implements Serializable {
    private Calendar createdDate;
    private Calendar lastModifiedDate;
    private RecordRef nexus;
    private RecordRef subsidiaryTaxRegNum;
    private Boolean taxRegOverride;
    private Boolean taxDetailsOverride;
    private RecordRef customForm;
    private RecordRef entity;
    private RecordRef purchaseContract;
    private String vatRegNum;
    private RecordRef employee;
    private Boolean supervisorApproval;
    private Calendar tranDate;
    private String tranId;
    private RecordRef entityTaxRegNum;
    private Calendar taxPointDate;
    private RecordRef createdFrom;
    private RecordRef terms;
    private Calendar dueDate;
    private String otherRefNum;
    private Double availableVendorCredit;
    private String memo;
    private RecordRef approvalStatus;
    private Double exchangeRate;
    private RecordRef nextApprover;
    private String source;
    private String currencyName;
    private Boolean toBePrinted;
    private Boolean toBeEmailed;
    private String email;
    private Boolean toBeFaxed;
    private String fax;
    private String message;
    private Address billingAddress;
    private RecordRef billAddressList;
    private RecordRef currency;
    private RecordRef shipTo;
    private Double subTotal;
    private Double taxTotal;
    private Double tax2Total;
    private Address shippingAddress;
    private Boolean shipIsResidential;
    private RecordRef shipAddressList;
    private String fob;
    private Calendar shipDate;
    private RecordRef shipMethod;
    private RecordRef incoterm;
    private String trackingNumbers;
    private String linkedTrackingNumbers;
    private Double total;
    private RecordRef _class;
    private RecordRef department;
    private RecordRef location;
    private RecordRef subsidiary;
    private RecordRef intercoTransaction;
    private IntercoStatus intercoStatus;
    private String status;
    private PurchaseOrderOrderStatus orderStatus;
    private PurchaseOrderItemList itemList;
    private AccountingBookDetailList accountingBookDetailList;
    private PurchaseOrderExpenseList expenseList;
    private TaxDetailsList taxDetailsList;
    private CustomFieldList customFieldList;
    private String internalId;
    private String externalId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(PurchaseOrder.class, true);

    public PurchaseOrder() {
    }

    public PurchaseOrder(NullField nullFieldList, String internalId, String externalId, Calendar createdDate, Calendar lastModifiedDate, RecordRef nexus, RecordRef subsidiaryTaxRegNum, Boolean taxRegOverride, Boolean taxDetailsOverride, RecordRef customForm, RecordRef entity, RecordRef purchaseContract, String vatRegNum, RecordRef employee, Boolean supervisorApproval, Calendar tranDate, String tranId, RecordRef entityTaxRegNum, Calendar taxPointDate, RecordRef createdFrom, RecordRef terms, Calendar dueDate, String otherRefNum, Double availableVendorCredit, String memo, RecordRef approvalStatus, Double exchangeRate, RecordRef nextApprover, String source, String currencyName, Boolean toBePrinted, Boolean toBeEmailed, String email, Boolean toBeFaxed, String fax, String message, Address billingAddress, RecordRef billAddressList, RecordRef currency, RecordRef shipTo, Double subTotal, Double taxTotal, Double tax2Total, Address shippingAddress, Boolean shipIsResidential, RecordRef shipAddressList, String fob, Calendar shipDate, RecordRef shipMethod, RecordRef incoterm, String trackingNumbers, String linkedTrackingNumbers, Double total, RecordRef _class, RecordRef department, RecordRef location, RecordRef subsidiary, RecordRef intercoTransaction, IntercoStatus intercoStatus, String status, PurchaseOrderOrderStatus orderStatus, PurchaseOrderItemList itemList, AccountingBookDetailList accountingBookDetailList, PurchaseOrderExpenseList expenseList, TaxDetailsList taxDetailsList, CustomFieldList customFieldList) {
        super(nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.nexus = nexus;
        this.subsidiaryTaxRegNum = subsidiaryTaxRegNum;
        this.taxRegOverride = taxRegOverride;
        this.taxDetailsOverride = taxDetailsOverride;
        this.customForm = customForm;
        this.entity = entity;
        this.purchaseContract = purchaseContract;
        this.vatRegNum = vatRegNum;
        this.employee = employee;
        this.supervisorApproval = supervisorApproval;
        this.tranDate = tranDate;
        this.tranId = tranId;
        this.entityTaxRegNum = entityTaxRegNum;
        this.taxPointDate = taxPointDate;
        this.createdFrom = createdFrom;
        this.terms = terms;
        this.dueDate = dueDate;
        this.otherRefNum = otherRefNum;
        this.availableVendorCredit = availableVendorCredit;
        this.memo = memo;
        this.approvalStatus = approvalStatus;
        this.exchangeRate = exchangeRate;
        this.nextApprover = nextApprover;
        this.source = source;
        this.currencyName = currencyName;
        this.toBePrinted = toBePrinted;
        this.toBeEmailed = toBeEmailed;
        this.email = email;
        this.toBeFaxed = toBeFaxed;
        this.fax = fax;
        this.message = message;
        this.billingAddress = billingAddress;
        this.billAddressList = billAddressList;
        this.currency = currency;
        this.shipTo = shipTo;
        this.subTotal = subTotal;
        this.taxTotal = taxTotal;
        this.tax2Total = tax2Total;
        this.shippingAddress = shippingAddress;
        this.shipIsResidential = shipIsResidential;
        this.shipAddressList = shipAddressList;
        this.fob = fob;
        this.shipDate = shipDate;
        this.shipMethod = shipMethod;
        this.incoterm = incoterm;
        this.trackingNumbers = trackingNumbers;
        this.linkedTrackingNumbers = linkedTrackingNumbers;
        this.total = total;
        this._class = _class;
        this.department = department;
        this.location = location;
        this.subsidiary = subsidiary;
        this.intercoTransaction = intercoTransaction;
        this.intercoStatus = intercoStatus;
        this.status = status;
        this.orderStatus = orderStatus;
        this.itemList = itemList;
        this.accountingBookDetailList = accountingBookDetailList;
        this.expenseList = expenseList;
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

    public RecordRef getEntity() {
        return this.entity;
    }

    public void setEntity(RecordRef entity) {
        this.entity = entity;
    }

    public RecordRef getPurchaseContract() {
        return this.purchaseContract;
    }

    public void setPurchaseContract(RecordRef purchaseContract) {
        this.purchaseContract = purchaseContract;
    }

    public String getVatRegNum() {
        return this.vatRegNum;
    }

    public void setVatRegNum(String vatRegNum) {
        this.vatRegNum = vatRegNum;
    }

    public RecordRef getEmployee() {
        return this.employee;
    }

    public void setEmployee(RecordRef employee) {
        this.employee = employee;
    }

    public Boolean getSupervisorApproval() {
        return this.supervisorApproval;
    }

    public void setSupervisorApproval(Boolean supervisorApproval) {
        this.supervisorApproval = supervisorApproval;
    }

    public Calendar getTranDate() {
        return this.tranDate;
    }

    public void setTranDate(Calendar tranDate) {
        this.tranDate = tranDate;
    }

    public String getTranId() {
        return this.tranId;
    }

    public void setTranId(String tranId) {
        this.tranId = tranId;
    }

    public RecordRef getEntityTaxRegNum() {
        return this.entityTaxRegNum;
    }

    public void setEntityTaxRegNum(RecordRef entityTaxRegNum) {
        this.entityTaxRegNum = entityTaxRegNum;
    }

    public Calendar getTaxPointDate() {
        return this.taxPointDate;
    }

    public void setTaxPointDate(Calendar taxPointDate) {
        this.taxPointDate = taxPointDate;
    }

    public RecordRef getCreatedFrom() {
        return this.createdFrom;
    }

    public void setCreatedFrom(RecordRef createdFrom) {
        this.createdFrom = createdFrom;
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

    public String getOtherRefNum() {
        return this.otherRefNum;
    }

    public void setOtherRefNum(String otherRefNum) {
        this.otherRefNum = otherRefNum;
    }

    public Double getAvailableVendorCredit() {
        return this.availableVendorCredit;
    }

    public void setAvailableVendorCredit(Double availableVendorCredit) {
        this.availableVendorCredit = availableVendorCredit;
    }

    public String getMemo() {
        return this.memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public RecordRef getApprovalStatus() {
        return this.approvalStatus;
    }

    public void setApprovalStatus(RecordRef approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public Double getExchangeRate() {
        return this.exchangeRate;
    }

    public void setExchangeRate(Double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public RecordRef getNextApprover() {
        return this.nextApprover;
    }

    public void setNextApprover(RecordRef nextApprover) {
        this.nextApprover = nextApprover;
    }

    public String getSource() {
        return this.source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getCurrencyName() {
        return this.currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public Boolean getToBePrinted() {
        return this.toBePrinted;
    }

    public void setToBePrinted(Boolean toBePrinted) {
        this.toBePrinted = toBePrinted;
    }

    public Boolean getToBeEmailed() {
        return this.toBeEmailed;
    }

    public void setToBeEmailed(Boolean toBeEmailed) {
        this.toBeEmailed = toBeEmailed;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getToBeFaxed() {
        return this.toBeFaxed;
    }

    public void setToBeFaxed(Boolean toBeFaxed) {
        this.toBeFaxed = toBeFaxed;
    }

    public String getFax() {
        return this.fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Address getBillingAddress() {
        return this.billingAddress;
    }

    public void setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
    }

    public RecordRef getBillAddressList() {
        return this.billAddressList;
    }

    public void setBillAddressList(RecordRef billAddressList) {
        this.billAddressList = billAddressList;
    }

    public RecordRef getCurrency() {
        return this.currency;
    }

    public void setCurrency(RecordRef currency) {
        this.currency = currency;
    }

    public RecordRef getShipTo() {
        return this.shipTo;
    }

    public void setShipTo(RecordRef shipTo) {
        this.shipTo = shipTo;
    }

    public Double getSubTotal() {
        return this.subTotal;
    }

    public void setSubTotal(Double subTotal) {
        this.subTotal = subTotal;
    }

    public Double getTaxTotal() {
        return this.taxTotal;
    }

    public void setTaxTotal(Double taxTotal) {
        this.taxTotal = taxTotal;
    }

    public Double getTax2Total() {
        return this.tax2Total;
    }

    public void setTax2Total(Double tax2Total) {
        this.tax2Total = tax2Total;
    }

    public Address getShippingAddress() {
        return this.shippingAddress;
    }

    public void setShippingAddress(Address shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public Boolean getShipIsResidential() {
        return this.shipIsResidential;
    }

    public void setShipIsResidential(Boolean shipIsResidential) {
        this.shipIsResidential = shipIsResidential;
    }

    public RecordRef getShipAddressList() {
        return this.shipAddressList;
    }

    public void setShipAddressList(RecordRef shipAddressList) {
        this.shipAddressList = shipAddressList;
    }

    public String getFob() {
        return this.fob;
    }

    public void setFob(String fob) {
        this.fob = fob;
    }

    public Calendar getShipDate() {
        return this.shipDate;
    }

    public void setShipDate(Calendar shipDate) {
        this.shipDate = shipDate;
    }

    public RecordRef getShipMethod() {
        return this.shipMethod;
    }

    public void setShipMethod(RecordRef shipMethod) {
        this.shipMethod = shipMethod;
    }

    public RecordRef getIncoterm() {
        return this.incoterm;
    }

    public void setIncoterm(RecordRef incoterm) {
        this.incoterm = incoterm;
    }

    public String getTrackingNumbers() {
        return this.trackingNumbers;
    }

    public void setTrackingNumbers(String trackingNumbers) {
        this.trackingNumbers = trackingNumbers;
    }

    public String getLinkedTrackingNumbers() {
        return this.linkedTrackingNumbers;
    }

    public void setLinkedTrackingNumbers(String linkedTrackingNumbers) {
        this.linkedTrackingNumbers = linkedTrackingNumbers;
    }

    public Double getTotal() {
        return this.total;
    }

    public void setTotal(Double total) {
        this.total = total;
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

    public RecordRef getSubsidiary() {
        return this.subsidiary;
    }

    public void setSubsidiary(RecordRef subsidiary) {
        this.subsidiary = subsidiary;
    }

    public RecordRef getIntercoTransaction() {
        return this.intercoTransaction;
    }

    public void setIntercoTransaction(RecordRef intercoTransaction) {
        this.intercoTransaction = intercoTransaction;
    }

    public IntercoStatus getIntercoStatus() {
        return this.intercoStatus;
    }

    public void setIntercoStatus(IntercoStatus intercoStatus) {
        this.intercoStatus = intercoStatus;
    }

    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public PurchaseOrderOrderStatus getOrderStatus() {
        return this.orderStatus;
    }

    public void setOrderStatus(PurchaseOrderOrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public PurchaseOrderItemList getItemList() {
        return this.itemList;
    }

    public void setItemList(PurchaseOrderItemList itemList) {
        this.itemList = itemList;
    }

    public AccountingBookDetailList getAccountingBookDetailList() {
        return this.accountingBookDetailList;
    }

    public void setAccountingBookDetailList(AccountingBookDetailList accountingBookDetailList) {
        this.accountingBookDetailList = accountingBookDetailList;
    }

    public PurchaseOrderExpenseList getExpenseList() {
        return this.expenseList;
    }

    public void setExpenseList(PurchaseOrderExpenseList expenseList) {
        this.expenseList = expenseList;
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
        if (!(obj instanceof PurchaseOrder)) {
            return false;
        }
        PurchaseOrder other = (PurchaseOrder)obj;
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
        boolean _equals = super.equals(obj) && (this.createdDate == null && other.getCreatedDate() == null || this.createdDate != null && this.createdDate.equals(other.getCreatedDate())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && this.lastModifiedDate.equals(other.getLastModifiedDate())) && (this.nexus == null && other.getNexus() == null || this.nexus != null && this.nexus.equals(other.getNexus())) && (this.subsidiaryTaxRegNum == null && other.getSubsidiaryTaxRegNum() == null || this.subsidiaryTaxRegNum != null && this.subsidiaryTaxRegNum.equals(other.getSubsidiaryTaxRegNum())) && (this.taxRegOverride == null && other.getTaxRegOverride() == null || this.taxRegOverride != null && this.taxRegOverride.equals(other.getTaxRegOverride())) && (this.taxDetailsOverride == null && other.getTaxDetailsOverride() == null || this.taxDetailsOverride != null && this.taxDetailsOverride.equals(other.getTaxDetailsOverride())) && (this.customForm == null && other.getCustomForm() == null || this.customForm != null && this.customForm.equals(other.getCustomForm())) && (this.entity == null && other.getEntity() == null || this.entity != null && this.entity.equals(other.getEntity())) && (this.purchaseContract == null && other.getPurchaseContract() == null || this.purchaseContract != null && this.purchaseContract.equals(other.getPurchaseContract())) && (this.vatRegNum == null && other.getVatRegNum() == null || this.vatRegNum != null && this.vatRegNum.equals(other.getVatRegNum())) && (this.employee == null && other.getEmployee() == null || this.employee != null && this.employee.equals(other.getEmployee())) && (this.supervisorApproval == null && other.getSupervisorApproval() == null || this.supervisorApproval != null && this.supervisorApproval.equals(other.getSupervisorApproval())) && (this.tranDate == null && other.getTranDate() == null || this.tranDate != null && this.tranDate.equals(other.getTranDate())) && (this.tranId == null && other.getTranId() == null || this.tranId != null && this.tranId.equals(other.getTranId())) && (this.entityTaxRegNum == null && other.getEntityTaxRegNum() == null || this.entityTaxRegNum != null && this.entityTaxRegNum.equals(other.getEntityTaxRegNum())) && (this.taxPointDate == null && other.getTaxPointDate() == null || this.taxPointDate != null && this.taxPointDate.equals(other.getTaxPointDate())) && (this.createdFrom == null && other.getCreatedFrom() == null || this.createdFrom != null && this.createdFrom.equals(other.getCreatedFrom())) && (this.terms == null && other.getTerms() == null || this.terms != null && this.terms.equals(other.getTerms())) && (this.dueDate == null && other.getDueDate() == null || this.dueDate != null && this.dueDate.equals(other.getDueDate())) && (this.otherRefNum == null && other.getOtherRefNum() == null || this.otherRefNum != null && this.otherRefNum.equals(other.getOtherRefNum())) && (this.availableVendorCredit == null && other.getAvailableVendorCredit() == null || this.availableVendorCredit != null && this.availableVendorCredit.equals(other.getAvailableVendorCredit())) && (this.memo == null && other.getMemo() == null || this.memo != null && this.memo.equals(other.getMemo())) && (this.approvalStatus == null && other.getApprovalStatus() == null || this.approvalStatus != null && this.approvalStatus.equals(other.getApprovalStatus())) && (this.exchangeRate == null && other.getExchangeRate() == null || this.exchangeRate != null && this.exchangeRate.equals(other.getExchangeRate())) && (this.nextApprover == null && other.getNextApprover() == null || this.nextApprover != null && this.nextApprover.equals(other.getNextApprover())) && (this.source == null && other.getSource() == null || this.source != null && this.source.equals(other.getSource())) && (this.currencyName == null && other.getCurrencyName() == null || this.currencyName != null && this.currencyName.equals(other.getCurrencyName())) && (this.toBePrinted == null && other.getToBePrinted() == null || this.toBePrinted != null && this.toBePrinted.equals(other.getToBePrinted())) && (this.toBeEmailed == null && other.getToBeEmailed() == null || this.toBeEmailed != null && this.toBeEmailed.equals(other.getToBeEmailed())) && (this.email == null && other.getEmail() == null || this.email != null && this.email.equals(other.getEmail())) && (this.toBeFaxed == null && other.getToBeFaxed() == null || this.toBeFaxed != null && this.toBeFaxed.equals(other.getToBeFaxed())) && (this.fax == null && other.getFax() == null || this.fax != null && this.fax.equals(other.getFax())) && (this.message == null && other.getMessage() == null || this.message != null && this.message.equals(other.getMessage())) && (this.billingAddress == null && other.getBillingAddress() == null || this.billingAddress != null && this.billingAddress.equals(other.getBillingAddress())) && (this.billAddressList == null && other.getBillAddressList() == null || this.billAddressList != null && this.billAddressList.equals(other.getBillAddressList())) && (this.currency == null && other.getCurrency() == null || this.currency != null && this.currency.equals(other.getCurrency())) && (this.shipTo == null && other.getShipTo() == null || this.shipTo != null && this.shipTo.equals(other.getShipTo())) && (this.subTotal == null && other.getSubTotal() == null || this.subTotal != null && this.subTotal.equals(other.getSubTotal())) && (this.taxTotal == null && other.getTaxTotal() == null || this.taxTotal != null && this.taxTotal.equals(other.getTaxTotal())) && (this.tax2Total == null && other.getTax2Total() == null || this.tax2Total != null && this.tax2Total.equals(other.getTax2Total())) && (this.shippingAddress == null && other.getShippingAddress() == null || this.shippingAddress != null && this.shippingAddress.equals(other.getShippingAddress())) && (this.shipIsResidential == null && other.getShipIsResidential() == null || this.shipIsResidential != null && this.shipIsResidential.equals(other.getShipIsResidential())) && (this.shipAddressList == null && other.getShipAddressList() == null || this.shipAddressList != null && this.shipAddressList.equals(other.getShipAddressList())) && (this.fob == null && other.getFob() == null || this.fob != null && this.fob.equals(other.getFob())) && (this.shipDate == null && other.getShipDate() == null || this.shipDate != null && this.shipDate.equals(other.getShipDate())) && (this.shipMethod == null && other.getShipMethod() == null || this.shipMethod != null && this.shipMethod.equals(other.getShipMethod())) && (this.incoterm == null && other.getIncoterm() == null || this.incoterm != null && this.incoterm.equals(other.getIncoterm())) && (this.trackingNumbers == null && other.getTrackingNumbers() == null || this.trackingNumbers != null && this.trackingNumbers.equals(other.getTrackingNumbers())) && (this.linkedTrackingNumbers == null && other.getLinkedTrackingNumbers() == null || this.linkedTrackingNumbers != null && this.linkedTrackingNumbers.equals(other.getLinkedTrackingNumbers())) && (this.total == null && other.getTotal() == null || this.total != null && this.total.equals(other.getTotal())) && (this._class == null && other.get_class() == null || this._class != null && this._class.equals(other.get_class())) && (this.department == null && other.getDepartment() == null || this.department != null && this.department.equals(other.getDepartment())) && (this.location == null && other.getLocation() == null || this.location != null && this.location.equals(other.getLocation())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && this.subsidiary.equals(other.getSubsidiary())) && (this.intercoTransaction == null && other.getIntercoTransaction() == null || this.intercoTransaction != null && this.intercoTransaction.equals(other.getIntercoTransaction())) && (this.intercoStatus == null && other.getIntercoStatus() == null || this.intercoStatus != null && this.intercoStatus.equals(other.getIntercoStatus())) && (this.status == null && other.getStatus() == null || this.status != null && this.status.equals(other.getStatus())) && (this.orderStatus == null && other.getOrderStatus() == null || this.orderStatus != null && this.orderStatus.equals(other.getOrderStatus())) && (this.itemList == null && other.getItemList() == null || this.itemList != null && this.itemList.equals(other.getItemList())) && (this.accountingBookDetailList == null && other.getAccountingBookDetailList() == null || this.accountingBookDetailList != null && this.accountingBookDetailList.equals(other.getAccountingBookDetailList())) && (this.expenseList == null && other.getExpenseList() == null || this.expenseList != null && this.expenseList.equals(other.getExpenseList())) && (this.taxDetailsList == null && other.getTaxDetailsList() == null || this.taxDetailsList != null && this.taxDetailsList.equals(other.getTaxDetailsList())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
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
        if (this.getEntity() != null) {
            _hashCode += this.getEntity().hashCode();
        }
        if (this.getPurchaseContract() != null) {
            _hashCode += this.getPurchaseContract().hashCode();
        }
        if (this.getVatRegNum() != null) {
            _hashCode += this.getVatRegNum().hashCode();
        }
        if (this.getEmployee() != null) {
            _hashCode += this.getEmployee().hashCode();
        }
        if (this.getSupervisorApproval() != null) {
            _hashCode += this.getSupervisorApproval().hashCode();
        }
        if (this.getTranDate() != null) {
            _hashCode += this.getTranDate().hashCode();
        }
        if (this.getTranId() != null) {
            _hashCode += this.getTranId().hashCode();
        }
        if (this.getEntityTaxRegNum() != null) {
            _hashCode += this.getEntityTaxRegNum().hashCode();
        }
        if (this.getTaxPointDate() != null) {
            _hashCode += this.getTaxPointDate().hashCode();
        }
        if (this.getCreatedFrom() != null) {
            _hashCode += this.getCreatedFrom().hashCode();
        }
        if (this.getTerms() != null) {
            _hashCode += this.getTerms().hashCode();
        }
        if (this.getDueDate() != null) {
            _hashCode += this.getDueDate().hashCode();
        }
        if (this.getOtherRefNum() != null) {
            _hashCode += this.getOtherRefNum().hashCode();
        }
        if (this.getAvailableVendorCredit() != null) {
            _hashCode += this.getAvailableVendorCredit().hashCode();
        }
        if (this.getMemo() != null) {
            _hashCode += this.getMemo().hashCode();
        }
        if (this.getApprovalStatus() != null) {
            _hashCode += this.getApprovalStatus().hashCode();
        }
        if (this.getExchangeRate() != null) {
            _hashCode += this.getExchangeRate().hashCode();
        }
        if (this.getNextApprover() != null) {
            _hashCode += this.getNextApprover().hashCode();
        }
        if (this.getSource() != null) {
            _hashCode += this.getSource().hashCode();
        }
        if (this.getCurrencyName() != null) {
            _hashCode += this.getCurrencyName().hashCode();
        }
        if (this.getToBePrinted() != null) {
            _hashCode += this.getToBePrinted().hashCode();
        }
        if (this.getToBeEmailed() != null) {
            _hashCode += this.getToBeEmailed().hashCode();
        }
        if (this.getEmail() != null) {
            _hashCode += this.getEmail().hashCode();
        }
        if (this.getToBeFaxed() != null) {
            _hashCode += this.getToBeFaxed().hashCode();
        }
        if (this.getFax() != null) {
            _hashCode += this.getFax().hashCode();
        }
        if (this.getMessage() != null) {
            _hashCode += this.getMessage().hashCode();
        }
        if (this.getBillingAddress() != null) {
            _hashCode += this.getBillingAddress().hashCode();
        }
        if (this.getBillAddressList() != null) {
            _hashCode += this.getBillAddressList().hashCode();
        }
        if (this.getCurrency() != null) {
            _hashCode += this.getCurrency().hashCode();
        }
        if (this.getShipTo() != null) {
            _hashCode += this.getShipTo().hashCode();
        }
        if (this.getSubTotal() != null) {
            _hashCode += this.getSubTotal().hashCode();
        }
        if (this.getTaxTotal() != null) {
            _hashCode += this.getTaxTotal().hashCode();
        }
        if (this.getTax2Total() != null) {
            _hashCode += this.getTax2Total().hashCode();
        }
        if (this.getShippingAddress() != null) {
            _hashCode += this.getShippingAddress().hashCode();
        }
        if (this.getShipIsResidential() != null) {
            _hashCode += this.getShipIsResidential().hashCode();
        }
        if (this.getShipAddressList() != null) {
            _hashCode += this.getShipAddressList().hashCode();
        }
        if (this.getFob() != null) {
            _hashCode += this.getFob().hashCode();
        }
        if (this.getShipDate() != null) {
            _hashCode += this.getShipDate().hashCode();
        }
        if (this.getShipMethod() != null) {
            _hashCode += this.getShipMethod().hashCode();
        }
        if (this.getIncoterm() != null) {
            _hashCode += this.getIncoterm().hashCode();
        }
        if (this.getTrackingNumbers() != null) {
            _hashCode += this.getTrackingNumbers().hashCode();
        }
        if (this.getLinkedTrackingNumbers() != null) {
            _hashCode += this.getLinkedTrackingNumbers().hashCode();
        }
        if (this.getTotal() != null) {
            _hashCode += this.getTotal().hashCode();
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
        if (this.getSubsidiary() != null) {
            _hashCode += this.getSubsidiary().hashCode();
        }
        if (this.getIntercoTransaction() != null) {
            _hashCode += this.getIntercoTransaction().hashCode();
        }
        if (this.getIntercoStatus() != null) {
            _hashCode += this.getIntercoStatus().hashCode();
        }
        if (this.getStatus() != null) {
            _hashCode += this.getStatus().hashCode();
        }
        if (this.getOrderStatus() != null) {
            _hashCode += this.getOrderStatus().hashCode();
        }
        if (this.getItemList() != null) {
            _hashCode += this.getItemList().hashCode();
        }
        if (this.getAccountingBookDetailList() != null) {
            _hashCode += this.getAccountingBookDetailList().hashCode();
        }
        if (this.getExpenseList() != null) {
            _hashCode += this.getExpenseList().hashCode();
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
        typeDesc.setXmlType(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "PurchaseOrder"));
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
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("nexus");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "nexus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subsidiaryTaxRegNum");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "subsidiaryTaxRegNum"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxRegOverride");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "taxRegOverride"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxDetailsOverride");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "taxDetailsOverride"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customForm");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("entity");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "entity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("purchaseContract");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "purchaseContract"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vatRegNum");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "vatRegNum"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("employee");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "employee"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("supervisorApproval");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "supervisorApproval"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("tranDate");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "tranDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("tranId");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "tranId"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("entityTaxRegNum");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "entityTaxRegNum"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxPointDate");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "taxPointDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("createdFrom");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "createdFrom"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("terms");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "terms"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("dueDate");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "dueDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("otherRefNum");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "otherRefNum"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("availableVendorCredit");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "availableVendorCredit"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("approvalStatus");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "approvalStatus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("exchangeRate");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "exchangeRate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("nextApprover");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "nextApprover"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("source");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "source"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("currencyName");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "currencyName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("toBePrinted");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "toBePrinted"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("toBeEmailed");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "toBeEmailed"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "email"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("toBeFaxed");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "toBeFaxed"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fax");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "fax"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "message"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billingAddress");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "billingAddress"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billAddressList");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "billAddressList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipTo");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "shipTo"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subTotal");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "subTotal"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxTotal");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "taxTotal"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("tax2Total");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "tax2Total"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shippingAddress");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "shippingAddress"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipIsResidential");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "shipIsResidential"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipAddressList");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "shipAddressList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fob");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "fob"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipDate");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "shipDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipMethod");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "shipMethod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("incoterm");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "incoterm"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("trackingNumbers");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "trackingNumbers"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("linkedTrackingNumbers");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "linkedTrackingNumbers"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("total");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "total"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "class"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "department"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "location"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("intercoTransaction");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "intercoTransaction"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("intercoStatus");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "intercoStatus"));
        elemField.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "IntercoStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "status"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("orderStatus");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "orderStatus"));
        elemField.setXmlType(new QName("urn:types.purchases_2022_1.transactions.webservices.netsuite.com", "PurchaseOrderOrderStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemList");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "itemList"));
        elemField.setXmlType(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "PurchaseOrderItemList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("accountingBookDetailList");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "accountingBookDetailList"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "AccountingBookDetailList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("expenseList");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "expenseList"));
        elemField.setXmlType(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "PurchaseOrderExpenseList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxDetailsList");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "taxDetailsList"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TaxDetailsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "CustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

