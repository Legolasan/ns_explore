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
package com.netsuite.suitetalk.proxy.v2022_1.transactions.general;

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

public class JournalEntryLine
implements Serializable {
    private RecordRef account;
    private Long line;
    private Double debit;
    private Double credit;
    private RecordRef taxAccount;
    private RecordRef lineTaxCode;
    private Double lineTaxRate;
    private Double debitTax;
    private Double creditTax;
    private Double taxBasis;
    private Double totalAmount;
    private RecordRef taxCode;
    private String memo;
    private Double taxRate1;
    private RecordRef entity;
    private Double grossAmt;
    private RecordRef department;
    private RecordRef _class;
    private RecordRef location;
    private RecordRef revenueRecognitionRule;
    private Boolean eliminate;
    private RecordRef schedule;
    private Calendar startDate;
    private Calendar endDate;
    private String residual;
    private RecordRef scheduleNum;
    private Double tax1Amt;
    private RecordRef tax1Acct;
    private CustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(JournalEntryLine.class, true);

    public JournalEntryLine() {
    }

    public JournalEntryLine(RecordRef account, Long line, Double debit, Double credit, RecordRef taxAccount, RecordRef lineTaxCode, Double lineTaxRate, Double debitTax, Double creditTax, Double taxBasis, Double totalAmount, RecordRef taxCode, String memo, Double taxRate1, RecordRef entity, Double grossAmt, RecordRef department, RecordRef _class, RecordRef location, RecordRef revenueRecognitionRule, Boolean eliminate, RecordRef schedule, Calendar startDate, Calendar endDate, String residual, RecordRef scheduleNum, Double tax1Amt, RecordRef tax1Acct, CustomFieldList customFieldList) {
        this.account = account;
        this.line = line;
        this.debit = debit;
        this.credit = credit;
        this.taxAccount = taxAccount;
        this.lineTaxCode = lineTaxCode;
        this.lineTaxRate = lineTaxRate;
        this.debitTax = debitTax;
        this.creditTax = creditTax;
        this.taxBasis = taxBasis;
        this.totalAmount = totalAmount;
        this.taxCode = taxCode;
        this.memo = memo;
        this.taxRate1 = taxRate1;
        this.entity = entity;
        this.grossAmt = grossAmt;
        this.department = department;
        this._class = _class;
        this.location = location;
        this.revenueRecognitionRule = revenueRecognitionRule;
        this.eliminate = eliminate;
        this.schedule = schedule;
        this.startDate = startDate;
        this.endDate = endDate;
        this.residual = residual;
        this.scheduleNum = scheduleNum;
        this.tax1Amt = tax1Amt;
        this.tax1Acct = tax1Acct;
        this.customFieldList = customFieldList;
    }

    public RecordRef getAccount() {
        return this.account;
    }

    public void setAccount(RecordRef account) {
        this.account = account;
    }

    public Long getLine() {
        return this.line;
    }

    public void setLine(Long line) {
        this.line = line;
    }

    public Double getDebit() {
        return this.debit;
    }

    public void setDebit(Double debit) {
        this.debit = debit;
    }

    public Double getCredit() {
        return this.credit;
    }

    public void setCredit(Double credit) {
        this.credit = credit;
    }

    public RecordRef getTaxAccount() {
        return this.taxAccount;
    }

    public void setTaxAccount(RecordRef taxAccount) {
        this.taxAccount = taxAccount;
    }

    public RecordRef getLineTaxCode() {
        return this.lineTaxCode;
    }

    public void setLineTaxCode(RecordRef lineTaxCode) {
        this.lineTaxCode = lineTaxCode;
    }

    public Double getLineTaxRate() {
        return this.lineTaxRate;
    }

    public void setLineTaxRate(Double lineTaxRate) {
        this.lineTaxRate = lineTaxRate;
    }

    public Double getDebitTax() {
        return this.debitTax;
    }

    public void setDebitTax(Double debitTax) {
        this.debitTax = debitTax;
    }

    public Double getCreditTax() {
        return this.creditTax;
    }

    public void setCreditTax(Double creditTax) {
        this.creditTax = creditTax;
    }

    public Double getTaxBasis() {
        return this.taxBasis;
    }

    public void setTaxBasis(Double taxBasis) {
        this.taxBasis = taxBasis;
    }

    public Double getTotalAmount() {
        return this.totalAmount;
    }

    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
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

    public RecordRef getEntity() {
        return this.entity;
    }

    public void setEntity(RecordRef entity) {
        this.entity = entity;
    }

    public Double getGrossAmt() {
        return this.grossAmt;
    }

    public void setGrossAmt(Double grossAmt) {
        this.grossAmt = grossAmt;
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

    public RecordRef getRevenueRecognitionRule() {
        return this.revenueRecognitionRule;
    }

    public void setRevenueRecognitionRule(RecordRef revenueRecognitionRule) {
        this.revenueRecognitionRule = revenueRecognitionRule;
    }

    public Boolean getEliminate() {
        return this.eliminate;
    }

    public void setEliminate(Boolean eliminate) {
        this.eliminate = eliminate;
    }

    public RecordRef getSchedule() {
        return this.schedule;
    }

    public void setSchedule(RecordRef schedule) {
        this.schedule = schedule;
    }

    public Calendar getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Calendar startDate) {
        this.startDate = startDate;
    }

    public Calendar getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Calendar endDate) {
        this.endDate = endDate;
    }

    public String getResidual() {
        return this.residual;
    }

    public void setResidual(String residual) {
        this.residual = residual;
    }

    public RecordRef getScheduleNum() {
        return this.scheduleNum;
    }

    public void setScheduleNum(RecordRef scheduleNum) {
        this.scheduleNum = scheduleNum;
    }

    public Double getTax1Amt() {
        return this.tax1Amt;
    }

    public void setTax1Amt(Double tax1Amt) {
        this.tax1Amt = tax1Amt;
    }

    public RecordRef getTax1Acct() {
        return this.tax1Acct;
    }

    public void setTax1Acct(RecordRef tax1Acct) {
        this.tax1Acct = tax1Acct;
    }

    public CustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof JournalEntryLine)) {
            return false;
        }
        JournalEntryLine other = (JournalEntryLine)obj;
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
        boolean _equals = (this.account == null && other.getAccount() == null || this.account != null && this.account.equals(other.getAccount())) && (this.line == null && other.getLine() == null || this.line != null && this.line.equals(other.getLine())) && (this.debit == null && other.getDebit() == null || this.debit != null && this.debit.equals(other.getDebit())) && (this.credit == null && other.getCredit() == null || this.credit != null && this.credit.equals(other.getCredit())) && (this.taxAccount == null && other.getTaxAccount() == null || this.taxAccount != null && this.taxAccount.equals(other.getTaxAccount())) && (this.lineTaxCode == null && other.getLineTaxCode() == null || this.lineTaxCode != null && this.lineTaxCode.equals(other.getLineTaxCode())) && (this.lineTaxRate == null && other.getLineTaxRate() == null || this.lineTaxRate != null && this.lineTaxRate.equals(other.getLineTaxRate())) && (this.debitTax == null && other.getDebitTax() == null || this.debitTax != null && this.debitTax.equals(other.getDebitTax())) && (this.creditTax == null && other.getCreditTax() == null || this.creditTax != null && this.creditTax.equals(other.getCreditTax())) && (this.taxBasis == null && other.getTaxBasis() == null || this.taxBasis != null && this.taxBasis.equals(other.getTaxBasis())) && (this.totalAmount == null && other.getTotalAmount() == null || this.totalAmount != null && this.totalAmount.equals(other.getTotalAmount())) && (this.taxCode == null && other.getTaxCode() == null || this.taxCode != null && this.taxCode.equals(other.getTaxCode())) && (this.memo == null && other.getMemo() == null || this.memo != null && this.memo.equals(other.getMemo())) && (this.taxRate1 == null && other.getTaxRate1() == null || this.taxRate1 != null && this.taxRate1.equals(other.getTaxRate1())) && (this.entity == null && other.getEntity() == null || this.entity != null && this.entity.equals(other.getEntity())) && (this.grossAmt == null && other.getGrossAmt() == null || this.grossAmt != null && this.grossAmt.equals(other.getGrossAmt())) && (this.department == null && other.getDepartment() == null || this.department != null && this.department.equals(other.getDepartment())) && (this._class == null && other.get_class() == null || this._class != null && this._class.equals(other.get_class())) && (this.location == null && other.getLocation() == null || this.location != null && this.location.equals(other.getLocation())) && (this.revenueRecognitionRule == null && other.getRevenueRecognitionRule() == null || this.revenueRecognitionRule != null && this.revenueRecognitionRule.equals(other.getRevenueRecognitionRule())) && (this.eliminate == null && other.getEliminate() == null || this.eliminate != null && this.eliminate.equals(other.getEliminate())) && (this.schedule == null && other.getSchedule() == null || this.schedule != null && this.schedule.equals(other.getSchedule())) && (this.startDate == null && other.getStartDate() == null || this.startDate != null && this.startDate.equals(other.getStartDate())) && (this.endDate == null && other.getEndDate() == null || this.endDate != null && this.endDate.equals(other.getEndDate())) && (this.residual == null && other.getResidual() == null || this.residual != null && this.residual.equals(other.getResidual())) && (this.scheduleNum == null && other.getScheduleNum() == null || this.scheduleNum != null && this.scheduleNum.equals(other.getScheduleNum())) && (this.tax1Amt == null && other.getTax1Amt() == null || this.tax1Amt != null && this.tax1Amt.equals(other.getTax1Amt())) && (this.tax1Acct == null && other.getTax1Acct() == null || this.tax1Acct != null && this.tax1Acct.equals(other.getTax1Acct())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getAccount() != null) {
            _hashCode += this.getAccount().hashCode();
        }
        if (this.getLine() != null) {
            _hashCode += this.getLine().hashCode();
        }
        if (this.getDebit() != null) {
            _hashCode += this.getDebit().hashCode();
        }
        if (this.getCredit() != null) {
            _hashCode += this.getCredit().hashCode();
        }
        if (this.getTaxAccount() != null) {
            _hashCode += this.getTaxAccount().hashCode();
        }
        if (this.getLineTaxCode() != null) {
            _hashCode += this.getLineTaxCode().hashCode();
        }
        if (this.getLineTaxRate() != null) {
            _hashCode += this.getLineTaxRate().hashCode();
        }
        if (this.getDebitTax() != null) {
            _hashCode += this.getDebitTax().hashCode();
        }
        if (this.getCreditTax() != null) {
            _hashCode += this.getCreditTax().hashCode();
        }
        if (this.getTaxBasis() != null) {
            _hashCode += this.getTaxBasis().hashCode();
        }
        if (this.getTotalAmount() != null) {
            _hashCode += this.getTotalAmount().hashCode();
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
        if (this.getEntity() != null) {
            _hashCode += this.getEntity().hashCode();
        }
        if (this.getGrossAmt() != null) {
            _hashCode += this.getGrossAmt().hashCode();
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
        if (this.getRevenueRecognitionRule() != null) {
            _hashCode += this.getRevenueRecognitionRule().hashCode();
        }
        if (this.getEliminate() != null) {
            _hashCode += this.getEliminate().hashCode();
        }
        if (this.getSchedule() != null) {
            _hashCode += this.getSchedule().hashCode();
        }
        if (this.getStartDate() != null) {
            _hashCode += this.getStartDate().hashCode();
        }
        if (this.getEndDate() != null) {
            _hashCode += this.getEndDate().hashCode();
        }
        if (this.getResidual() != null) {
            _hashCode += this.getResidual().hashCode();
        }
        if (this.getScheduleNum() != null) {
            _hashCode += this.getScheduleNum().hashCode();
        }
        if (this.getTax1Amt() != null) {
            _hashCode += this.getTax1Amt().hashCode();
        }
        if (this.getTax1Acct() != null) {
            _hashCode += this.getTax1Acct().hashCode();
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
        typeDesc.setXmlType(new QName("urn:general_2022_1.transactions.webservices.netsuite.com", "JournalEntryLine"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new QName("urn:general_2022_1.transactions.webservices.netsuite.com", "account"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("line");
        elemField.setXmlName(new QName("urn:general_2022_1.transactions.webservices.netsuite.com", "line"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("debit");
        elemField.setXmlName(new QName("urn:general_2022_1.transactions.webservices.netsuite.com", "debit"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("credit");
        elemField.setXmlName(new QName("urn:general_2022_1.transactions.webservices.netsuite.com", "credit"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxAccount");
        elemField.setXmlName(new QName("urn:general_2022_1.transactions.webservices.netsuite.com", "taxAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lineTaxCode");
        elemField.setXmlName(new QName("urn:general_2022_1.transactions.webservices.netsuite.com", "lineTaxCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lineTaxRate");
        elemField.setXmlName(new QName("urn:general_2022_1.transactions.webservices.netsuite.com", "lineTaxRate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("debitTax");
        elemField.setXmlName(new QName("urn:general_2022_1.transactions.webservices.netsuite.com", "debitTax"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("creditTax");
        elemField.setXmlName(new QName("urn:general_2022_1.transactions.webservices.netsuite.com", "creditTax"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxBasis");
        elemField.setXmlName(new QName("urn:general_2022_1.transactions.webservices.netsuite.com", "taxBasis"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("totalAmount");
        elemField.setXmlName(new QName("urn:general_2022_1.transactions.webservices.netsuite.com", "totalAmount"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxCode");
        elemField.setXmlName(new QName("urn:general_2022_1.transactions.webservices.netsuite.com", "taxCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new QName("urn:general_2022_1.transactions.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxRate1");
        elemField.setXmlName(new QName("urn:general_2022_1.transactions.webservices.netsuite.com", "taxRate1"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("entity");
        elemField.setXmlName(new QName("urn:general_2022_1.transactions.webservices.netsuite.com", "entity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("grossAmt");
        elemField.setXmlName(new QName("urn:general_2022_1.transactions.webservices.netsuite.com", "grossAmt"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new QName("urn:general_2022_1.transactions.webservices.netsuite.com", "department"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new QName("urn:general_2022_1.transactions.webservices.netsuite.com", "class"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new QName("urn:general_2022_1.transactions.webservices.netsuite.com", "location"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revenueRecognitionRule");
        elemField.setXmlName(new QName("urn:general_2022_1.transactions.webservices.netsuite.com", "revenueRecognitionRule"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("eliminate");
        elemField.setXmlName(new QName("urn:general_2022_1.transactions.webservices.netsuite.com", "eliminate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("schedule");
        elemField.setXmlName(new QName("urn:general_2022_1.transactions.webservices.netsuite.com", "schedule"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new QName("urn:general_2022_1.transactions.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new QName("urn:general_2022_1.transactions.webservices.netsuite.com", "endDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("residual");
        elemField.setXmlName(new QName("urn:general_2022_1.transactions.webservices.netsuite.com", "residual"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("scheduleNum");
        elemField.setXmlName(new QName("urn:general_2022_1.transactions.webservices.netsuite.com", "scheduleNum"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("tax1Amt");
        elemField.setXmlName(new QName("urn:general_2022_1.transactions.webservices.netsuite.com", "tax1Amt"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("tax1Acct");
        elemField.setXmlName(new QName("urn:general_2022_1.transactions.webservices.netsuite.com", "tax1Acct"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new QName("urn:general_2022_1.transactions.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "CustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

