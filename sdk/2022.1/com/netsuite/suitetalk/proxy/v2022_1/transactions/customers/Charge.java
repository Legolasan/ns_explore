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

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.NullField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.Record;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.customers.types.ChargeStage;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.customers.types.ChargeUse;
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

public class Charge
extends Record
implements Serializable {
    private RecordRef customForm;
    private RecordRef salesOrder;
    private RecordRef billTo;
    private RecordRef billingAccount;
    private ChargeStage stage;
    private Calendar chargeDate;
    private ChargeUse use;
    private RecordRef chargeType;
    private RecordRef projectTask;
    private String description;
    private Calendar createdDate;
    private RecordRef timeRecord;
    private String rate;
    private Double quantity;
    private Double amount;
    private RecordRef billingItem;
    private RecordRef currency;
    private RecordRef transaction;
    private RecordRef transactionLine;
    private RecordRef _class;
    private RecordRef department;
    private RecordRef location;
    private RecordRef salesOrderLine;
    private RecordRef subscriptionLine;
    private RecordRef invoice;
    private RecordRef invoiceLine;
    private RecordRef rule;
    private String runId;
    private String internalId;
    private String externalId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(Charge.class, true);

    public Charge() {
    }

    public Charge(NullField nullFieldList, String internalId, String externalId, RecordRef customForm, RecordRef salesOrder, RecordRef billTo, RecordRef billingAccount, ChargeStage stage, Calendar chargeDate, ChargeUse use, RecordRef chargeType, RecordRef projectTask, String description, Calendar createdDate, RecordRef timeRecord, String rate, Double quantity, Double amount, RecordRef billingItem, RecordRef currency, RecordRef transaction, RecordRef transactionLine, RecordRef _class, RecordRef department, RecordRef location, RecordRef salesOrderLine, RecordRef subscriptionLine, RecordRef invoice, RecordRef invoiceLine, RecordRef rule, String runId) {
        super(nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.customForm = customForm;
        this.salesOrder = salesOrder;
        this.billTo = billTo;
        this.billingAccount = billingAccount;
        this.stage = stage;
        this.chargeDate = chargeDate;
        this.use = use;
        this.chargeType = chargeType;
        this.projectTask = projectTask;
        this.description = description;
        this.createdDate = createdDate;
        this.timeRecord = timeRecord;
        this.rate = rate;
        this.quantity = quantity;
        this.amount = amount;
        this.billingItem = billingItem;
        this.currency = currency;
        this.transaction = transaction;
        this.transactionLine = transactionLine;
        this._class = _class;
        this.department = department;
        this.location = location;
        this.salesOrderLine = salesOrderLine;
        this.subscriptionLine = subscriptionLine;
        this.invoice = invoice;
        this.invoiceLine = invoiceLine;
        this.rule = rule;
        this.runId = runId;
    }

    public RecordRef getCustomForm() {
        return this.customForm;
    }

    public void setCustomForm(RecordRef customForm) {
        this.customForm = customForm;
    }

    public RecordRef getSalesOrder() {
        return this.salesOrder;
    }

    public void setSalesOrder(RecordRef salesOrder) {
        this.salesOrder = salesOrder;
    }

    public RecordRef getBillTo() {
        return this.billTo;
    }

    public void setBillTo(RecordRef billTo) {
        this.billTo = billTo;
    }

    public RecordRef getBillingAccount() {
        return this.billingAccount;
    }

    public void setBillingAccount(RecordRef billingAccount) {
        this.billingAccount = billingAccount;
    }

    public ChargeStage getStage() {
        return this.stage;
    }

    public void setStage(ChargeStage stage) {
        this.stage = stage;
    }

    public Calendar getChargeDate() {
        return this.chargeDate;
    }

    public void setChargeDate(Calendar chargeDate) {
        this.chargeDate = chargeDate;
    }

    public ChargeUse getUse() {
        return this.use;
    }

    public void setUse(ChargeUse use) {
        this.use = use;
    }

    public RecordRef getChargeType() {
        return this.chargeType;
    }

    public void setChargeType(RecordRef chargeType) {
        this.chargeType = chargeType;
    }

    public RecordRef getProjectTask() {
        return this.projectTask;
    }

    public void setProjectTask(RecordRef projectTask) {
        this.projectTask = projectTask;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Calendar getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(Calendar createdDate) {
        this.createdDate = createdDate;
    }

    public RecordRef getTimeRecord() {
        return this.timeRecord;
    }

    public void setTimeRecord(RecordRef timeRecord) {
        this.timeRecord = timeRecord;
    }

    public String getRate() {
        return this.rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public Double getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Double getAmount() {
        return this.amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public RecordRef getBillingItem() {
        return this.billingItem;
    }

    public void setBillingItem(RecordRef billingItem) {
        this.billingItem = billingItem;
    }

    public RecordRef getCurrency() {
        return this.currency;
    }

    public void setCurrency(RecordRef currency) {
        this.currency = currency;
    }

    public RecordRef getTransaction() {
        return this.transaction;
    }

    public void setTransaction(RecordRef transaction) {
        this.transaction = transaction;
    }

    public RecordRef getTransactionLine() {
        return this.transactionLine;
    }

    public void setTransactionLine(RecordRef transactionLine) {
        this.transactionLine = transactionLine;
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

    public RecordRef getSalesOrderLine() {
        return this.salesOrderLine;
    }

    public void setSalesOrderLine(RecordRef salesOrderLine) {
        this.salesOrderLine = salesOrderLine;
    }

    public RecordRef getSubscriptionLine() {
        return this.subscriptionLine;
    }

    public void setSubscriptionLine(RecordRef subscriptionLine) {
        this.subscriptionLine = subscriptionLine;
    }

    public RecordRef getInvoice() {
        return this.invoice;
    }

    public void setInvoice(RecordRef invoice) {
        this.invoice = invoice;
    }

    public RecordRef getInvoiceLine() {
        return this.invoiceLine;
    }

    public void setInvoiceLine(RecordRef invoiceLine) {
        this.invoiceLine = invoiceLine;
    }

    public RecordRef getRule() {
        return this.rule;
    }

    public void setRule(RecordRef rule) {
        this.rule = rule;
    }

    public String getRunId() {
        return this.runId;
    }

    public void setRunId(String runId) {
        this.runId = runId;
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
        if (!(obj instanceof Charge)) {
            return false;
        }
        Charge other = (Charge)obj;
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
        boolean _equals = super.equals(obj) && (this.customForm == null && other.getCustomForm() == null || this.customForm != null && this.customForm.equals(other.getCustomForm())) && (this.salesOrder == null && other.getSalesOrder() == null || this.salesOrder != null && this.salesOrder.equals(other.getSalesOrder())) && (this.billTo == null && other.getBillTo() == null || this.billTo != null && this.billTo.equals(other.getBillTo())) && (this.billingAccount == null && other.getBillingAccount() == null || this.billingAccount != null && this.billingAccount.equals(other.getBillingAccount())) && (this.stage == null && other.getStage() == null || this.stage != null && this.stage.equals(other.getStage())) && (this.chargeDate == null && other.getChargeDate() == null || this.chargeDate != null && this.chargeDate.equals(other.getChargeDate())) && (this.use == null && other.getUse() == null || this.use != null && this.use.equals(other.getUse())) && (this.chargeType == null && other.getChargeType() == null || this.chargeType != null && this.chargeType.equals(other.getChargeType())) && (this.projectTask == null && other.getProjectTask() == null || this.projectTask != null && this.projectTask.equals(other.getProjectTask())) && (this.description == null && other.getDescription() == null || this.description != null && this.description.equals(other.getDescription())) && (this.createdDate == null && other.getCreatedDate() == null || this.createdDate != null && this.createdDate.equals(other.getCreatedDate())) && (this.timeRecord == null && other.getTimeRecord() == null || this.timeRecord != null && this.timeRecord.equals(other.getTimeRecord())) && (this.rate == null && other.getRate() == null || this.rate != null && this.rate.equals(other.getRate())) && (this.quantity == null && other.getQuantity() == null || this.quantity != null && this.quantity.equals(other.getQuantity())) && (this.amount == null && other.getAmount() == null || this.amount != null && this.amount.equals(other.getAmount())) && (this.billingItem == null && other.getBillingItem() == null || this.billingItem != null && this.billingItem.equals(other.getBillingItem())) && (this.currency == null && other.getCurrency() == null || this.currency != null && this.currency.equals(other.getCurrency())) && (this.transaction == null && other.getTransaction() == null || this.transaction != null && this.transaction.equals(other.getTransaction())) && (this.transactionLine == null && other.getTransactionLine() == null || this.transactionLine != null && this.transactionLine.equals(other.getTransactionLine())) && (this._class == null && other.get_class() == null || this._class != null && this._class.equals(other.get_class())) && (this.department == null && other.getDepartment() == null || this.department != null && this.department.equals(other.getDepartment())) && (this.location == null && other.getLocation() == null || this.location != null && this.location.equals(other.getLocation())) && (this.salesOrderLine == null && other.getSalesOrderLine() == null || this.salesOrderLine != null && this.salesOrderLine.equals(other.getSalesOrderLine())) && (this.subscriptionLine == null && other.getSubscriptionLine() == null || this.subscriptionLine != null && this.subscriptionLine.equals(other.getSubscriptionLine())) && (this.invoice == null && other.getInvoice() == null || this.invoice != null && this.invoice.equals(other.getInvoice())) && (this.invoiceLine == null && other.getInvoiceLine() == null || this.invoiceLine != null && this.invoiceLine.equals(other.getInvoiceLine())) && (this.rule == null && other.getRule() == null || this.rule != null && this.rule.equals(other.getRule())) && (this.runId == null && other.getRunId() == null || this.runId != null && this.runId.equals(other.getRunId())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
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
        if (this.getCustomForm() != null) {
            _hashCode += this.getCustomForm().hashCode();
        }
        if (this.getSalesOrder() != null) {
            _hashCode += this.getSalesOrder().hashCode();
        }
        if (this.getBillTo() != null) {
            _hashCode += this.getBillTo().hashCode();
        }
        if (this.getBillingAccount() != null) {
            _hashCode += this.getBillingAccount().hashCode();
        }
        if (this.getStage() != null) {
            _hashCode += this.getStage().hashCode();
        }
        if (this.getChargeDate() != null) {
            _hashCode += this.getChargeDate().hashCode();
        }
        if (this.getUse() != null) {
            _hashCode += this.getUse().hashCode();
        }
        if (this.getChargeType() != null) {
            _hashCode += this.getChargeType().hashCode();
        }
        if (this.getProjectTask() != null) {
            _hashCode += this.getProjectTask().hashCode();
        }
        if (this.getDescription() != null) {
            _hashCode += this.getDescription().hashCode();
        }
        if (this.getCreatedDate() != null) {
            _hashCode += this.getCreatedDate().hashCode();
        }
        if (this.getTimeRecord() != null) {
            _hashCode += this.getTimeRecord().hashCode();
        }
        if (this.getRate() != null) {
            _hashCode += this.getRate().hashCode();
        }
        if (this.getQuantity() != null) {
            _hashCode += this.getQuantity().hashCode();
        }
        if (this.getAmount() != null) {
            _hashCode += this.getAmount().hashCode();
        }
        if (this.getBillingItem() != null) {
            _hashCode += this.getBillingItem().hashCode();
        }
        if (this.getCurrency() != null) {
            _hashCode += this.getCurrency().hashCode();
        }
        if (this.getTransaction() != null) {
            _hashCode += this.getTransaction().hashCode();
        }
        if (this.getTransactionLine() != null) {
            _hashCode += this.getTransactionLine().hashCode();
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
        if (this.getSalesOrderLine() != null) {
            _hashCode += this.getSalesOrderLine().hashCode();
        }
        if (this.getSubscriptionLine() != null) {
            _hashCode += this.getSubscriptionLine().hashCode();
        }
        if (this.getInvoice() != null) {
            _hashCode += this.getInvoice().hashCode();
        }
        if (this.getInvoiceLine() != null) {
            _hashCode += this.getInvoiceLine().hashCode();
        }
        if (this.getRule() != null) {
            _hashCode += this.getRule().hashCode();
        }
        if (this.getRunId() != null) {
            _hashCode += this.getRunId().hashCode();
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
        typeDesc.setXmlType(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "Charge"));
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
        elemField.setFieldName("customForm");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "customForm"));
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
        elemField.setFieldName("billTo");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "billTo"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billingAccount");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "billingAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("stage");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "stage"));
        elemField.setXmlType(new QName("urn:types.customers_2022_1.transactions.webservices.netsuite.com", "ChargeStage"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("chargeDate");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "chargeDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("use");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "use"));
        elemField.setXmlType(new QName("urn:types.customers_2022_1.transactions.webservices.netsuite.com", "ChargeUse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("chargeType");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "chargeType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("projectTask");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "projectTask"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "description"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("timeRecord");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "timeRecord"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("rate");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "rate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "quantity"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "amount"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billingItem");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "billingItem"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("transaction");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "transaction"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("transactionLine");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "transactionLine"));
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
        elemField.setFieldName("department");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "department"));
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
        elemField.setFieldName("salesOrderLine");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "salesOrderLine"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subscriptionLine");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "subscriptionLine"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("invoice");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "invoice"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("invoiceLine");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "invoiceLine"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("rule");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "rule"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("runId");
        elemField.setXmlName(new QName("urn:customers_2022_1.transactions.webservices.netsuite.com", "runId"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

