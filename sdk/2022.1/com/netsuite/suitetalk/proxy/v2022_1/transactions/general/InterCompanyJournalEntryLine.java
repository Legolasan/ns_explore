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

public class InterCompanyJournalEntryLine
implements Serializable {
    private RecordRef lineSubsidiary;
    private RecordRef account;
    private Long line;
    private Double debit;
    private Double credit;
    private RecordRef taxCode;
    private String memo;
    private Double taxRate1;
    private RecordRef entity;
    private Double grossAmt;
    private RecordRef schedule;
    private RecordRef department;
    private Calendar startDate;
    private RecordRef _class;
    private Calendar endDate;
    private RecordRef location;
    private RecordRef revenueRecognitionRule;
    private Boolean eliminate;
    private String residual;
    private RecordRef amortizationSched;
    private RecordRef scheduleNum;
    private Calendar amortizStartDate;
    private Calendar amortizationEndDate;
    private String amortizationResidual;
    private Double tax1Amt;
    private RecordRef tax1Acct;
    private CustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(InterCompanyJournalEntryLine.class, true);

    public InterCompanyJournalEntryLine() {
    }

    public InterCompanyJournalEntryLine(RecordRef lineSubsidiary, RecordRef account, Long line, Double debit, Double credit, RecordRef taxCode, String memo, Double taxRate1, RecordRef entity, Double grossAmt, RecordRef schedule, RecordRef department, Calendar startDate, RecordRef _class, Calendar endDate, RecordRef location, RecordRef revenueRecognitionRule, Boolean eliminate, String residual, RecordRef amortizationSched, RecordRef scheduleNum, Calendar amortizStartDate, Calendar amortizationEndDate, String amortizationResidual, Double tax1Amt, RecordRef tax1Acct, CustomFieldList customFieldList) {
        this.lineSubsidiary = lineSubsidiary;
        this.account = account;
        this.line = line;
        this.debit = debit;
        this.credit = credit;
        this.taxCode = taxCode;
        this.memo = memo;
        this.taxRate1 = taxRate1;
        this.entity = entity;
        this.grossAmt = grossAmt;
        this.schedule = schedule;
        this.department = department;
        this.startDate = startDate;
        this._class = _class;
        this.endDate = endDate;
        this.location = location;
        this.revenueRecognitionRule = revenueRecognitionRule;
        this.eliminate = eliminate;
        this.residual = residual;
        this.amortizationSched = amortizationSched;
        this.scheduleNum = scheduleNum;
        this.amortizStartDate = amortizStartDate;
        this.amortizationEndDate = amortizationEndDate;
        this.amortizationResidual = amortizationResidual;
        this.tax1Amt = tax1Amt;
        this.tax1Acct = tax1Acct;
        this.customFieldList = customFieldList;
    }

    public RecordRef getLineSubsidiary() {
        return this.lineSubsidiary;
    }

    public void setLineSubsidiary(RecordRef lineSubsidiary) {
        this.lineSubsidiary = lineSubsidiary;
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

    public RecordRef getSchedule() {
        return this.schedule;
    }

    public void setSchedule(RecordRef schedule) {
        this.schedule = schedule;
    }

    public RecordRef getDepartment() {
        return this.department;
    }

    public void setDepartment(RecordRef department) {
        this.department = department;
    }

    public Calendar getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Calendar startDate) {
        this.startDate = startDate;
    }

    public RecordRef get_class() {
        return this._class;
    }

    public void set_class(RecordRef _class) {
        this._class = _class;
    }

    public Calendar getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Calendar endDate) {
        this.endDate = endDate;
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

    public String getResidual() {
        return this.residual;
    }

    public void setResidual(String residual) {
        this.residual = residual;
    }

    public RecordRef getAmortizationSched() {
        return this.amortizationSched;
    }

    public void setAmortizationSched(RecordRef amortizationSched) {
        this.amortizationSched = amortizationSched;
    }

    public RecordRef getScheduleNum() {
        return this.scheduleNum;
    }

    public void setScheduleNum(RecordRef scheduleNum) {
        this.scheduleNum = scheduleNum;
    }

    public Calendar getAmortizStartDate() {
        return this.amortizStartDate;
    }

    public void setAmortizStartDate(Calendar amortizStartDate) {
        this.amortizStartDate = amortizStartDate;
    }

    public Calendar getAmortizationEndDate() {
        return this.amortizationEndDate;
    }

    public void setAmortizationEndDate(Calendar amortizationEndDate) {
        this.amortizationEndDate = amortizationEndDate;
    }

    public String getAmortizationResidual() {
        return this.amortizationResidual;
    }

    public void setAmortizationResidual(String amortizationResidual) {
        this.amortizationResidual = amortizationResidual;
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
        if (!(obj instanceof InterCompanyJournalEntryLine)) {
            return false;
        }
        InterCompanyJournalEntryLine other = (InterCompanyJournalEntryLine)obj;
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
        boolean _equals = (this.lineSubsidiary == null && other.getLineSubsidiary() == null || this.lineSubsidiary != null && this.lineSubsidiary.equals(other.getLineSubsidiary())) && (this.account == null && other.getAccount() == null || this.account != null && this.account.equals(other.getAccount())) && (this.line == null && other.getLine() == null || this.line != null && this.line.equals(other.getLine())) && (this.debit == null && other.getDebit() == null || this.debit != null && this.debit.equals(other.getDebit())) && (this.credit == null && other.getCredit() == null || this.credit != null && this.credit.equals(other.getCredit())) && (this.taxCode == null && other.getTaxCode() == null || this.taxCode != null && this.taxCode.equals(other.getTaxCode())) && (this.memo == null && other.getMemo() == null || this.memo != null && this.memo.equals(other.getMemo())) && (this.taxRate1 == null && other.getTaxRate1() == null || this.taxRate1 != null && this.taxRate1.equals(other.getTaxRate1())) && (this.entity == null && other.getEntity() == null || this.entity != null && this.entity.equals(other.getEntity())) && (this.grossAmt == null && other.getGrossAmt() == null || this.grossAmt != null && this.grossAmt.equals(other.getGrossAmt())) && (this.schedule == null && other.getSchedule() == null || this.schedule != null && this.schedule.equals(other.getSchedule())) && (this.department == null && other.getDepartment() == null || this.department != null && this.department.equals(other.getDepartment())) && (this.startDate == null && other.getStartDate() == null || this.startDate != null && this.startDate.equals(other.getStartDate())) && (this._class == null && other.get_class() == null || this._class != null && this._class.equals(other.get_class())) && (this.endDate == null && other.getEndDate() == null || this.endDate != null && this.endDate.equals(other.getEndDate())) && (this.location == null && other.getLocation() == null || this.location != null && this.location.equals(other.getLocation())) && (this.revenueRecognitionRule == null && other.getRevenueRecognitionRule() == null || this.revenueRecognitionRule != null && this.revenueRecognitionRule.equals(other.getRevenueRecognitionRule())) && (this.eliminate == null && other.getEliminate() == null || this.eliminate != null && this.eliminate.equals(other.getEliminate())) && (this.residual == null && other.getResidual() == null || this.residual != null && this.residual.equals(other.getResidual())) && (this.amortizationSched == null && other.getAmortizationSched() == null || this.amortizationSched != null && this.amortizationSched.equals(other.getAmortizationSched())) && (this.scheduleNum == null && other.getScheduleNum() == null || this.scheduleNum != null && this.scheduleNum.equals(other.getScheduleNum())) && (this.amortizStartDate == null && other.getAmortizStartDate() == null || this.amortizStartDate != null && this.amortizStartDate.equals(other.getAmortizStartDate())) && (this.amortizationEndDate == null && other.getAmortizationEndDate() == null || this.amortizationEndDate != null && this.amortizationEndDate.equals(other.getAmortizationEndDate())) && (this.amortizationResidual == null && other.getAmortizationResidual() == null || this.amortizationResidual != null && this.amortizationResidual.equals(other.getAmortizationResidual())) && (this.tax1Amt == null && other.getTax1Amt() == null || this.tax1Amt != null && this.tax1Amt.equals(other.getTax1Amt())) && (this.tax1Acct == null && other.getTax1Acct() == null || this.tax1Acct != null && this.tax1Acct.equals(other.getTax1Acct())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getLineSubsidiary() != null) {
            _hashCode += this.getLineSubsidiary().hashCode();
        }
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
        if (this.getSchedule() != null) {
            _hashCode += this.getSchedule().hashCode();
        }
        if (this.getDepartment() != null) {
            _hashCode += this.getDepartment().hashCode();
        }
        if (this.getStartDate() != null) {
            _hashCode += this.getStartDate().hashCode();
        }
        if (this.get_class() != null) {
            _hashCode += this.get_class().hashCode();
        }
        if (this.getEndDate() != null) {
            _hashCode += this.getEndDate().hashCode();
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
        if (this.getResidual() != null) {
            _hashCode += this.getResidual().hashCode();
        }
        if (this.getAmortizationSched() != null) {
            _hashCode += this.getAmortizationSched().hashCode();
        }
        if (this.getScheduleNum() != null) {
            _hashCode += this.getScheduleNum().hashCode();
        }
        if (this.getAmortizStartDate() != null) {
            _hashCode += this.getAmortizStartDate().hashCode();
        }
        if (this.getAmortizationEndDate() != null) {
            _hashCode += this.getAmortizationEndDate().hashCode();
        }
        if (this.getAmortizationResidual() != null) {
            _hashCode += this.getAmortizationResidual().hashCode();
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
        typeDesc.setXmlType(new QName("urn:general_2022_1.transactions.webservices.netsuite.com", "InterCompanyJournalEntryLine"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("lineSubsidiary");
        elemField.setXmlName(new QName("urn:general_2022_1.transactions.webservices.netsuite.com", "lineSubsidiary"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
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
        elemField.setFieldName("schedule");
        elemField.setXmlName(new QName("urn:general_2022_1.transactions.webservices.netsuite.com", "schedule"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("startDate");
        elemField.setXmlName(new QName("urn:general_2022_1.transactions.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("endDate");
        elemField.setXmlName(new QName("urn:general_2022_1.transactions.webservices.netsuite.com", "endDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("residual");
        elemField.setXmlName(new QName("urn:general_2022_1.transactions.webservices.netsuite.com", "residual"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("amortizationSched");
        elemField.setXmlName(new QName("urn:general_2022_1.transactions.webservices.netsuite.com", "amortizationSched"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("amortizStartDate");
        elemField.setXmlName(new QName("urn:general_2022_1.transactions.webservices.netsuite.com", "amortizStartDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("amortizationEndDate");
        elemField.setXmlName(new QName("urn:general_2022_1.transactions.webservices.netsuite.com", "amortizationEndDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("amortizationResidual");
        elemField.setXmlName(new QName("urn:general_2022_1.transactions.webservices.netsuite.com", "amortizationResidual"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
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

