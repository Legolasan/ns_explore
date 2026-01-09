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
package com.netsuite.suitetalk.proxy.v2022_1.transactions.employees;

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.CustomFieldList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import java.io.Serializable;
import java.util.Calendar;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class ExpenseReportExpense
implements Serializable {
    private Long line;
    private Calendar expenseDate;
    private RecordRef category;
    private Double quantity;
    private Double rate;
    private Double foreignAmount;
    private RecordRef currency;
    private Double exchangeRate;
    private Double amount;
    private RecordRef taxCode;
    private String memo;
    private Double taxRate1;
    private Double tax1Amt;
    private RecordRef department;
    private Double grossAmt;
    private Double taxRate2;
    private RecordRef _class;
    private RecordRef customer;
    private RecordRef location;
    private Boolean isBillable;
    private RecordRef expMediaItem;
    private Boolean isNonReimbursable;
    private Boolean corporateCreditCard;
    private Boolean receipt;
    private Long refNumber;
    private String taxDetailsReference;
    private RecordRef expenseAccount;
    private CustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(ExpenseReportExpense.class, true);

    public ExpenseReportExpense() {
    }

    public ExpenseReportExpense(Long line, Calendar expenseDate, RecordRef category, Double quantity, Double rate, Double foreignAmount, RecordRef currency, Double exchangeRate, Double amount, RecordRef taxCode, String memo, Double taxRate1, Double tax1Amt, RecordRef department, Double grossAmt, Double taxRate2, RecordRef _class, RecordRef customer, RecordRef location, Boolean isBillable, RecordRef expMediaItem, Boolean isNonReimbursable, Boolean corporateCreditCard, Boolean receipt, Long refNumber, String taxDetailsReference, RecordRef expenseAccount, CustomFieldList customFieldList) {
        this.line = line;
        this.expenseDate = expenseDate;
        this.category = category;
        this.quantity = quantity;
        this.rate = rate;
        this.foreignAmount = foreignAmount;
        this.currency = currency;
        this.exchangeRate = exchangeRate;
        this.amount = amount;
        this.taxCode = taxCode;
        this.memo = memo;
        this.taxRate1 = taxRate1;
        this.tax1Amt = tax1Amt;
        this.department = department;
        this.grossAmt = grossAmt;
        this.taxRate2 = taxRate2;
        this._class = _class;
        this.customer = customer;
        this.location = location;
        this.isBillable = isBillable;
        this.expMediaItem = expMediaItem;
        this.isNonReimbursable = isNonReimbursable;
        this.corporateCreditCard = corporateCreditCard;
        this.receipt = receipt;
        this.refNumber = refNumber;
        this.taxDetailsReference = taxDetailsReference;
        this.expenseAccount = expenseAccount;
        this.customFieldList = customFieldList;
    }

    public Long getLine() {
        return this.line;
    }

    public void setLine(Long line) {
        this.line = line;
    }

    public Calendar getExpenseDate() {
        return this.expenseDate;
    }

    public void setExpenseDate(Calendar expenseDate) {
        this.expenseDate = expenseDate;
    }

    public RecordRef getCategory() {
        return this.category;
    }

    public void setCategory(RecordRef category) {
        this.category = category;
    }

    public Double getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Double getRate() {
        return this.rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Double getForeignAmount() {
        return this.foreignAmount;
    }

    public void setForeignAmount(Double foreignAmount) {
        this.foreignAmount = foreignAmount;
    }

    public RecordRef getCurrency() {
        return this.currency;
    }

    public void setCurrency(RecordRef currency) {
        this.currency = currency;
    }

    public Double getExchangeRate() {
        return this.exchangeRate;
    }

    public void setExchangeRate(Double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public Double getAmount() {
        return this.amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public RecordRef getTaxCode() {
        return this.taxCode;
    }

    public void setTaxCode(RecordRef taxCode) {
        this.taxCode = taxCode;
    }

    public String getMemo() {
        return this.memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Double getTaxRate1() {
        return this.taxRate1;
    }

    public void setTaxRate1(Double taxRate1) {
        this.taxRate1 = taxRate1;
    }

    public Double getTax1Amt() {
        return this.tax1Amt;
    }

    public void setTax1Amt(Double tax1Amt) {
        this.tax1Amt = tax1Amt;
    }

    public RecordRef getDepartment() {
        return this.department;
    }

    public void setDepartment(RecordRef department) {
        this.department = department;
    }

    public Double getGrossAmt() {
        return this.grossAmt;
    }

    public void setGrossAmt(Double grossAmt) {
        this.grossAmt = grossAmt;
    }

    public Double getTaxRate2() {
        return this.taxRate2;
    }

    public void setTaxRate2(Double taxRate2) {
        this.taxRate2 = taxRate2;
    }

    public RecordRef get_class() {
        return this._class;
    }

    public void set_class(RecordRef _class) {
        this._class = _class;
    }

    public RecordRef getCustomer() {
        return this.customer;
    }

    public void setCustomer(RecordRef customer) {
        this.customer = customer;
    }

    public RecordRef getLocation() {
        return this.location;
    }

    public void setLocation(RecordRef location) {
        this.location = location;
    }

    public Boolean getIsBillable() {
        return this.isBillable;
    }

    public void setIsBillable(Boolean isBillable) {
        this.isBillable = isBillable;
    }

    public RecordRef getExpMediaItem() {
        return this.expMediaItem;
    }

    public void setExpMediaItem(RecordRef expMediaItem) {
        this.expMediaItem = expMediaItem;
    }

    public Boolean getIsNonReimbursable() {
        return this.isNonReimbursable;
    }

    public void setIsNonReimbursable(Boolean isNonReimbursable) {
        this.isNonReimbursable = isNonReimbursable;
    }

    public Boolean getCorporateCreditCard() {
        return this.corporateCreditCard;
    }

    public void setCorporateCreditCard(Boolean corporateCreditCard) {
        this.corporateCreditCard = corporateCreditCard;
    }

    public Boolean getReceipt() {
        return this.receipt;
    }

    public void setReceipt(Boolean receipt) {
        this.receipt = receipt;
    }

    public Long getRefNumber() {
        return this.refNumber;
    }

    public void setRefNumber(Long refNumber) {
        this.refNumber = refNumber;
    }

    public String getTaxDetailsReference() {
        return this.taxDetailsReference;
    }

    public void setTaxDetailsReference(String taxDetailsReference) {
        this.taxDetailsReference = taxDetailsReference;
    }

    public RecordRef getExpenseAccount() {
        return this.expenseAccount;
    }

    public void setExpenseAccount(RecordRef expenseAccount) {
        this.expenseAccount = expenseAccount;
    }

    public CustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ExpenseReportExpense)) {
            return false;
        }
        ExpenseReportExpense other = (ExpenseReportExpense)obj;
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
        boolean _equals = (this.line == null && other.getLine() == null || this.line != null && this.line.equals(other.getLine())) && (this.expenseDate == null && other.getExpenseDate() == null || this.expenseDate != null && this.expenseDate.equals(other.getExpenseDate())) && (this.category == null && other.getCategory() == null || this.category != null && this.category.equals(other.getCategory())) && (this.quantity == null && other.getQuantity() == null || this.quantity != null && this.quantity.equals(other.getQuantity())) && (this.rate == null && other.getRate() == null || this.rate != null && this.rate.equals(other.getRate())) && (this.foreignAmount == null && other.getForeignAmount() == null || this.foreignAmount != null && this.foreignAmount.equals(other.getForeignAmount())) && (this.currency == null && other.getCurrency() == null || this.currency != null && this.currency.equals(other.getCurrency())) && (this.exchangeRate == null && other.getExchangeRate() == null || this.exchangeRate != null && this.exchangeRate.equals(other.getExchangeRate())) && (this.amount == null && other.getAmount() == null || this.amount != null && this.amount.equals(other.getAmount())) && (this.taxCode == null && other.getTaxCode() == null || this.taxCode != null && this.taxCode.equals(other.getTaxCode())) && (this.memo == null && other.getMemo() == null || this.memo != null && this.memo.equals(other.getMemo())) && (this.taxRate1 == null && other.getTaxRate1() == null || this.taxRate1 != null && this.taxRate1.equals(other.getTaxRate1())) && (this.tax1Amt == null && other.getTax1Amt() == null || this.tax1Amt != null && this.tax1Amt.equals(other.getTax1Amt())) && (this.department == null && other.getDepartment() == null || this.department != null && this.department.equals(other.getDepartment())) && (this.grossAmt == null && other.getGrossAmt() == null || this.grossAmt != null && this.grossAmt.equals(other.getGrossAmt())) && (this.taxRate2 == null && other.getTaxRate2() == null || this.taxRate2 != null && this.taxRate2.equals(other.getTaxRate2())) && (this._class == null && other.get_class() == null || this._class != null && this._class.equals(other.get_class())) && (this.customer == null && other.getCustomer() == null || this.customer != null && this.customer.equals(other.getCustomer())) && (this.location == null && other.getLocation() == null || this.location != null && this.location.equals(other.getLocation())) && (this.isBillable == null && other.getIsBillable() == null || this.isBillable != null && this.isBillable.equals(other.getIsBillable())) && (this.expMediaItem == null && other.getExpMediaItem() == null || this.expMediaItem != null && this.expMediaItem.equals(other.getExpMediaItem())) && (this.isNonReimbursable == null && other.getIsNonReimbursable() == null || this.isNonReimbursable != null && this.isNonReimbursable.equals(other.getIsNonReimbursable())) && (this.corporateCreditCard == null && other.getCorporateCreditCard() == null || this.corporateCreditCard != null && this.corporateCreditCard.equals(other.getCorporateCreditCard())) && (this.receipt == null && other.getReceipt() == null || this.receipt != null && this.receipt.equals(other.getReceipt())) && (this.refNumber == null && other.getRefNumber() == null || this.refNumber != null && this.refNumber.equals(other.getRefNumber())) && (this.taxDetailsReference == null && other.getTaxDetailsReference() == null || this.taxDetailsReference != null && this.taxDetailsReference.equals(other.getTaxDetailsReference())) && (this.expenseAccount == null && other.getExpenseAccount() == null || this.expenseAccount != null && this.expenseAccount.equals(other.getExpenseAccount())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getLine() != null) {
            _hashCode += this.getLine().hashCode();
        }
        if (this.getExpenseDate() != null) {
            _hashCode += this.getExpenseDate().hashCode();
        }
        if (this.getCategory() != null) {
            _hashCode += this.getCategory().hashCode();
        }
        if (this.getQuantity() != null) {
            _hashCode += this.getQuantity().hashCode();
        }
        if (this.getRate() != null) {
            _hashCode += this.getRate().hashCode();
        }
        if (this.getForeignAmount() != null) {
            _hashCode += this.getForeignAmount().hashCode();
        }
        if (this.getCurrency() != null) {
            _hashCode += this.getCurrency().hashCode();
        }
        if (this.getExchangeRate() != null) {
            _hashCode += this.getExchangeRate().hashCode();
        }
        if (this.getAmount() != null) {
            _hashCode += this.getAmount().hashCode();
        }
        if (this.getTaxCode() != null) {
            _hashCode += this.getTaxCode().hashCode();
        }
        if (this.getMemo() != null) {
            _hashCode += this.getMemo().hashCode();
        }
        if (this.getTaxRate1() != null) {
            _hashCode += this.getTaxRate1().hashCode();
        }
        if (this.getTax1Amt() != null) {
            _hashCode += this.getTax1Amt().hashCode();
        }
        if (this.getDepartment() != null) {
            _hashCode += this.getDepartment().hashCode();
        }
        if (this.getGrossAmt() != null) {
            _hashCode += this.getGrossAmt().hashCode();
        }
        if (this.getTaxRate2() != null) {
            _hashCode += this.getTaxRate2().hashCode();
        }
        if (this.get_class() != null) {
            _hashCode += this.get_class().hashCode();
        }
        if (this.getCustomer() != null) {
            _hashCode += this.getCustomer().hashCode();
        }
        if (this.getLocation() != null) {
            _hashCode += this.getLocation().hashCode();
        }
        if (this.getIsBillable() != null) {
            _hashCode += this.getIsBillable().hashCode();
        }
        if (this.getExpMediaItem() != null) {
            _hashCode += this.getExpMediaItem().hashCode();
        }
        if (this.getIsNonReimbursable() != null) {
            _hashCode += this.getIsNonReimbursable().hashCode();
        }
        if (this.getCorporateCreditCard() != null) {
            _hashCode += this.getCorporateCreditCard().hashCode();
        }
        if (this.getReceipt() != null) {
            _hashCode += this.getReceipt().hashCode();
        }
        if (this.getRefNumber() != null) {
            _hashCode += this.getRefNumber().hashCode();
        }
        if (this.getTaxDetailsReference() != null) {
            _hashCode += this.getTaxDetailsReference().hashCode();
        }
        if (this.getExpenseAccount() != null) {
            _hashCode += this.getExpenseAccount().hashCode();
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
        typeDesc.setXmlType(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "ExpenseReportExpense"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("line");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "line"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("expenseDate");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "expenseDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "category"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "quantity"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("rate");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "rate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("foreignAmount");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "foreignAmount"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("exchangeRate");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "exchangeRate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "amount"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxCode");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "taxCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxRate1");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "taxRate1"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("tax1Amt");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "tax1Amt"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "department"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("grossAmt");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "grossAmt"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxRate2");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "taxRate2"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "class"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customer");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "customer"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "location"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isBillable");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "isBillable"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("expMediaItem");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "expMediaItem"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isNonReimbursable");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "isNonReimbursable"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("corporateCreditCard");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "corporateCreditCard"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("receipt");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "receipt"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("refNumber");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "refNumber"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxDetailsReference");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "taxDetailsReference"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("expenseAccount");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "expenseAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "CustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

