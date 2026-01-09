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
package com.netsuite.suitetalk.proxy.v2022_1.transactions.employees;

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.NullField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.Record;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.employees.PaycheckPayContribList;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.employees.PaycheckPayDeductList;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.employees.PaycheckPayDisburseList;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.employees.PaycheckPayEarnList;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.employees.PaycheckPayExpList;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.employees.PaycheckPayPtoList;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.employees.PaycheckPaySummaryList;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.employees.PaycheckPayTaxList;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.employees.PaycheckPayTimeList;
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

public class Paycheck
extends Record
implements Serializable {
    private String batchNumber;
    private Calendar createdDate;
    private Calendar lastModifiedDate;
    private String status;
    private RecordRef entity;
    private String address;
    private RecordRef department;
    private RecordRef location;
    private RecordRef _class;
    private RecordRef workplace;
    private String tranId;
    private Double userAmount;
    private String memo;
    private RecordRef account;
    private String payFrequency;
    private Double balance;
    private Calendar tranDate;
    private RecordRef postingPeriod;
    private Calendar periodEnding;
    private PaycheckPayEarnList payEarnList;
    private PaycheckPayTimeList payTimeList;
    private PaycheckPayExpList payExpList;
    private PaycheckPayPtoList payPtoList;
    private PaycheckPayDeductList payDeductList;
    private PaycheckPayContribList payContribList;
    private PaycheckPayTaxList payTaxList;
    private PaycheckPaySummaryList paySummaryList;
    private PaycheckPayDisburseList payDisburseList;
    private String internalId;
    private String externalId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(Paycheck.class, true);

    public Paycheck() {
    }

    public Paycheck(NullField nullFieldList, String internalId, String externalId, String batchNumber, Calendar createdDate, Calendar lastModifiedDate, String status, RecordRef entity, String address, RecordRef department, RecordRef location, RecordRef _class, RecordRef workplace, String tranId, Double userAmount, String memo, RecordRef account, String payFrequency, Double balance, Calendar tranDate, RecordRef postingPeriod, Calendar periodEnding, PaycheckPayEarnList payEarnList, PaycheckPayTimeList payTimeList, PaycheckPayExpList payExpList, PaycheckPayPtoList payPtoList, PaycheckPayDeductList payDeductList, PaycheckPayContribList payContribList, PaycheckPayTaxList payTaxList, PaycheckPaySummaryList paySummaryList, PaycheckPayDisburseList payDisburseList) {
        super(nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.batchNumber = batchNumber;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.status = status;
        this.entity = entity;
        this.address = address;
        this.department = department;
        this.location = location;
        this._class = _class;
        this.workplace = workplace;
        this.tranId = tranId;
        this.userAmount = userAmount;
        this.memo = memo;
        this.account = account;
        this.payFrequency = payFrequency;
        this.balance = balance;
        this.tranDate = tranDate;
        this.postingPeriod = postingPeriod;
        this.periodEnding = periodEnding;
        this.payEarnList = payEarnList;
        this.payTimeList = payTimeList;
        this.payExpList = payExpList;
        this.payPtoList = payPtoList;
        this.payDeductList = payDeductList;
        this.payContribList = payContribList;
        this.payTaxList = payTaxList;
        this.paySummaryList = paySummaryList;
        this.payDisburseList = payDisburseList;
    }

    public String getBatchNumber() {
        return this.batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber;
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

    public RecordRef getEntity() {
        return this.entity;
    }

    public void setEntity(RecordRef entity) {
        this.entity = entity;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public RecordRef get_class() {
        return this._class;
    }

    public void set_class(RecordRef _class) {
        this._class = _class;
    }

    public RecordRef getWorkplace() {
        return this.workplace;
    }

    public void setWorkplace(RecordRef workplace) {
        this.workplace = workplace;
    }

    public String getTranId() {
        return this.tranId;
    }

    public void setTranId(String tranId) {
        this.tranId = tranId;
    }

    public Double getUserAmount() {
        return this.userAmount;
    }

    public void setUserAmount(Double userAmount) {
        this.userAmount = userAmount;
    }

    public String getMemo() {
        return this.memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public RecordRef getAccount() {
        return this.account;
    }

    public void setAccount(RecordRef account) {
        this.account = account;
    }

    public String getPayFrequency() {
        return this.payFrequency;
    }

    public void setPayFrequency(String payFrequency) {
        this.payFrequency = payFrequency;
    }

    public Double getBalance() {
        return this.balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
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

    public Calendar getPeriodEnding() {
        return this.periodEnding;
    }

    public void setPeriodEnding(Calendar periodEnding) {
        this.periodEnding = periodEnding;
    }

    public PaycheckPayEarnList getPayEarnList() {
        return this.payEarnList;
    }

    public void setPayEarnList(PaycheckPayEarnList payEarnList) {
        this.payEarnList = payEarnList;
    }

    public PaycheckPayTimeList getPayTimeList() {
        return this.payTimeList;
    }

    public void setPayTimeList(PaycheckPayTimeList payTimeList) {
        this.payTimeList = payTimeList;
    }

    public PaycheckPayExpList getPayExpList() {
        return this.payExpList;
    }

    public void setPayExpList(PaycheckPayExpList payExpList) {
        this.payExpList = payExpList;
    }

    public PaycheckPayPtoList getPayPtoList() {
        return this.payPtoList;
    }

    public void setPayPtoList(PaycheckPayPtoList payPtoList) {
        this.payPtoList = payPtoList;
    }

    public PaycheckPayDeductList getPayDeductList() {
        return this.payDeductList;
    }

    public void setPayDeductList(PaycheckPayDeductList payDeductList) {
        this.payDeductList = payDeductList;
    }

    public PaycheckPayContribList getPayContribList() {
        return this.payContribList;
    }

    public void setPayContribList(PaycheckPayContribList payContribList) {
        this.payContribList = payContribList;
    }

    public PaycheckPayTaxList getPayTaxList() {
        return this.payTaxList;
    }

    public void setPayTaxList(PaycheckPayTaxList payTaxList) {
        this.payTaxList = payTaxList;
    }

    public PaycheckPaySummaryList getPaySummaryList() {
        return this.paySummaryList;
    }

    public void setPaySummaryList(PaycheckPaySummaryList paySummaryList) {
        this.paySummaryList = paySummaryList;
    }

    public PaycheckPayDisburseList getPayDisburseList() {
        return this.payDisburseList;
    }

    public void setPayDisburseList(PaycheckPayDisburseList payDisburseList) {
        this.payDisburseList = payDisburseList;
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
        if (!(obj instanceof Paycheck)) {
            return false;
        }
        Paycheck other = (Paycheck)obj;
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
        boolean _equals = super.equals(obj) && (this.batchNumber == null && other.getBatchNumber() == null || this.batchNumber != null && this.batchNumber.equals(other.getBatchNumber())) && (this.createdDate == null && other.getCreatedDate() == null || this.createdDate != null && this.createdDate.equals(other.getCreatedDate())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && this.lastModifiedDate.equals(other.getLastModifiedDate())) && (this.status == null && other.getStatus() == null || this.status != null && this.status.equals(other.getStatus())) && (this.entity == null && other.getEntity() == null || this.entity != null && this.entity.equals(other.getEntity())) && (this.address == null && other.getAddress() == null || this.address != null && this.address.equals(other.getAddress())) && (this.department == null && other.getDepartment() == null || this.department != null && this.department.equals(other.getDepartment())) && (this.location == null && other.getLocation() == null || this.location != null && this.location.equals(other.getLocation())) && (this._class == null && other.get_class() == null || this._class != null && this._class.equals(other.get_class())) && (this.workplace == null && other.getWorkplace() == null || this.workplace != null && this.workplace.equals(other.getWorkplace())) && (this.tranId == null && other.getTranId() == null || this.tranId != null && this.tranId.equals(other.getTranId())) && (this.userAmount == null && other.getUserAmount() == null || this.userAmount != null && this.userAmount.equals(other.getUserAmount())) && (this.memo == null && other.getMemo() == null || this.memo != null && this.memo.equals(other.getMemo())) && (this.account == null && other.getAccount() == null || this.account != null && this.account.equals(other.getAccount())) && (this.payFrequency == null && other.getPayFrequency() == null || this.payFrequency != null && this.payFrequency.equals(other.getPayFrequency())) && (this.balance == null && other.getBalance() == null || this.balance != null && this.balance.equals(other.getBalance())) && (this.tranDate == null && other.getTranDate() == null || this.tranDate != null && this.tranDate.equals(other.getTranDate())) && (this.postingPeriod == null && other.getPostingPeriod() == null || this.postingPeriod != null && this.postingPeriod.equals(other.getPostingPeriod())) && (this.periodEnding == null && other.getPeriodEnding() == null || this.periodEnding != null && this.periodEnding.equals(other.getPeriodEnding())) && (this.payEarnList == null && other.getPayEarnList() == null || this.payEarnList != null && this.payEarnList.equals(other.getPayEarnList())) && (this.payTimeList == null && other.getPayTimeList() == null || this.payTimeList != null && this.payTimeList.equals(other.getPayTimeList())) && (this.payExpList == null && other.getPayExpList() == null || this.payExpList != null && this.payExpList.equals(other.getPayExpList())) && (this.payPtoList == null && other.getPayPtoList() == null || this.payPtoList != null && this.payPtoList.equals(other.getPayPtoList())) && (this.payDeductList == null && other.getPayDeductList() == null || this.payDeductList != null && this.payDeductList.equals(other.getPayDeductList())) && (this.payContribList == null && other.getPayContribList() == null || this.payContribList != null && this.payContribList.equals(other.getPayContribList())) && (this.payTaxList == null && other.getPayTaxList() == null || this.payTaxList != null && this.payTaxList.equals(other.getPayTaxList())) && (this.paySummaryList == null && other.getPaySummaryList() == null || this.paySummaryList != null && this.paySummaryList.equals(other.getPaySummaryList())) && (this.payDisburseList == null && other.getPayDisburseList() == null || this.payDisburseList != null && this.payDisburseList.equals(other.getPayDisburseList())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
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
        if (this.getBatchNumber() != null) {
            _hashCode += this.getBatchNumber().hashCode();
        }
        if (this.getCreatedDate() != null) {
            _hashCode += this.getCreatedDate().hashCode();
        }
        if (this.getLastModifiedDate() != null) {
            _hashCode += this.getLastModifiedDate().hashCode();
        }
        if (this.getStatus() != null) {
            _hashCode += this.getStatus().hashCode();
        }
        if (this.getEntity() != null) {
            _hashCode += this.getEntity().hashCode();
        }
        if (this.getAddress() != null) {
            _hashCode += this.getAddress().hashCode();
        }
        if (this.getDepartment() != null) {
            _hashCode += this.getDepartment().hashCode();
        }
        if (this.getLocation() != null) {
            _hashCode += this.getLocation().hashCode();
        }
        if (this.get_class() != null) {
            _hashCode += this.get_class().hashCode();
        }
        if (this.getWorkplace() != null) {
            _hashCode += this.getWorkplace().hashCode();
        }
        if (this.getTranId() != null) {
            _hashCode += this.getTranId().hashCode();
        }
        if (this.getUserAmount() != null) {
            _hashCode += this.getUserAmount().hashCode();
        }
        if (this.getMemo() != null) {
            _hashCode += this.getMemo().hashCode();
        }
        if (this.getAccount() != null) {
            _hashCode += this.getAccount().hashCode();
        }
        if (this.getPayFrequency() != null) {
            _hashCode += this.getPayFrequency().hashCode();
        }
        if (this.getBalance() != null) {
            _hashCode += this.getBalance().hashCode();
        }
        if (this.getTranDate() != null) {
            _hashCode += this.getTranDate().hashCode();
        }
        if (this.getPostingPeriod() != null) {
            _hashCode += this.getPostingPeriod().hashCode();
        }
        if (this.getPeriodEnding() != null) {
            _hashCode += this.getPeriodEnding().hashCode();
        }
        if (this.getPayEarnList() != null) {
            _hashCode += this.getPayEarnList().hashCode();
        }
        if (this.getPayTimeList() != null) {
            _hashCode += this.getPayTimeList().hashCode();
        }
        if (this.getPayExpList() != null) {
            _hashCode += this.getPayExpList().hashCode();
        }
        if (this.getPayPtoList() != null) {
            _hashCode += this.getPayPtoList().hashCode();
        }
        if (this.getPayDeductList() != null) {
            _hashCode += this.getPayDeductList().hashCode();
        }
        if (this.getPayContribList() != null) {
            _hashCode += this.getPayContribList().hashCode();
        }
        if (this.getPayTaxList() != null) {
            _hashCode += this.getPayTaxList().hashCode();
        }
        if (this.getPaySummaryList() != null) {
            _hashCode += this.getPaySummaryList().hashCode();
        }
        if (this.getPayDisburseList() != null) {
            _hashCode += this.getPayDisburseList().hashCode();
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
        typeDesc.setXmlType(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "Paycheck"));
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
        elemField.setFieldName("batchNumber");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "batchNumber"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "status"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("entity");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "entity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "address"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("location");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "location"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("workplace");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "workplace"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("tranId");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "tranId"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("userAmount");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "userAmount"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("account");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "account"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("payFrequency");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "payFrequency"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "balance"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("tranDate");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "tranDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("postingPeriod");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "postingPeriod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("periodEnding");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "periodEnding"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("payEarnList");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "payEarnList"));
        elemField.setXmlType(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "PaycheckPayEarnList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("payTimeList");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "payTimeList"));
        elemField.setXmlType(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "PaycheckPayTimeList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("payExpList");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "payExpList"));
        elemField.setXmlType(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "PaycheckPayExpList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("payPtoList");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "payPtoList"));
        elemField.setXmlType(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "PaycheckPayPtoList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("payDeductList");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "payDeductList"));
        elemField.setXmlType(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "PaycheckPayDeductList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("payContribList");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "payContribList"));
        elemField.setXmlType(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "PaycheckPayContribList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("payTaxList");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "payTaxList"));
        elemField.setXmlType(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "PaycheckPayTaxList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("paySummaryList");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "paySummaryList"));
        elemField.setXmlType(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "PaycheckPaySummaryList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("payDisburseList");
        elemField.setXmlName(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "payDisburseList"));
        elemField.setXmlType(new QName("urn:employees_2022_1.transactions.webservices.netsuite.com", "PaycheckPayDisburseList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

