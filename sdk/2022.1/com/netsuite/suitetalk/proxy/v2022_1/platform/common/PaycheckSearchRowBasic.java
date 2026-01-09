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
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnLongField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnSelectField;
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

public class PaycheckSearchRowBasic
extends SearchRowBasic
implements Serializable {
    private SearchColumnSelectField[] account;
    private SearchColumnDateField[] amendedDate;
    private SearchColumnDoubleField[] amount;
    private SearchColumnLongField[] batchNumber;
    private SearchColumnDateField[] checkDate;
    private SearchColumnSelectField[] employee;
    private SearchColumnSelectField[] externalId;
    private SearchColumnBooleanField[] hasGLImpact;
    private SearchColumnDoubleField[] hours;
    private SearchColumnSelectField[] internalId;
    private SearchColumnSelectField[] payrollItem;
    private SearchColumnSelectField[] payrollItemType;
    private SearchColumnDoubleField[] subjectWages;
    private SearchColumnDoubleField[] taxableWages;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(PaycheckSearchRowBasic.class, true);

    public PaycheckSearchRowBasic() {
    }

    public PaycheckSearchRowBasic(SearchColumnSelectField[] account, SearchColumnDateField[] amendedDate, SearchColumnDoubleField[] amount, SearchColumnLongField[] batchNumber, SearchColumnDateField[] checkDate, SearchColumnSelectField[] employee, SearchColumnSelectField[] externalId, SearchColumnBooleanField[] hasGLImpact, SearchColumnDoubleField[] hours, SearchColumnSelectField[] internalId, SearchColumnSelectField[] payrollItem, SearchColumnSelectField[] payrollItemType, SearchColumnDoubleField[] subjectWages, SearchColumnDoubleField[] taxableWages) {
        this.account = account;
        this.amendedDate = amendedDate;
        this.amount = amount;
        this.batchNumber = batchNumber;
        this.checkDate = checkDate;
        this.employee = employee;
        this.externalId = externalId;
        this.hasGLImpact = hasGLImpact;
        this.hours = hours;
        this.internalId = internalId;
        this.payrollItem = payrollItem;
        this.payrollItemType = payrollItemType;
        this.subjectWages = subjectWages;
        this.taxableWages = taxableWages;
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

    public SearchColumnDateField[] getAmendedDate() {
        return this.amendedDate;
    }

    public void setAmendedDate(SearchColumnDateField[] amendedDate) {
        this.amendedDate = amendedDate;
    }

    public SearchColumnDateField getAmendedDate(int i) {
        return this.amendedDate[i];
    }

    public void setAmendedDate(int i, SearchColumnDateField _value) {
        this.amendedDate[i] = _value;
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

    public SearchColumnLongField[] getBatchNumber() {
        return this.batchNumber;
    }

    public void setBatchNumber(SearchColumnLongField[] batchNumber) {
        this.batchNumber = batchNumber;
    }

    public SearchColumnLongField getBatchNumber(int i) {
        return this.batchNumber[i];
    }

    public void setBatchNumber(int i, SearchColumnLongField _value) {
        this.batchNumber[i] = _value;
    }

    public SearchColumnDateField[] getCheckDate() {
        return this.checkDate;
    }

    public void setCheckDate(SearchColumnDateField[] checkDate) {
        this.checkDate = checkDate;
    }

    public SearchColumnDateField getCheckDate(int i) {
        return this.checkDate[i];
    }

    public void setCheckDate(int i, SearchColumnDateField _value) {
        this.checkDate[i] = _value;
    }

    public SearchColumnSelectField[] getEmployee() {
        return this.employee;
    }

    public void setEmployee(SearchColumnSelectField[] employee) {
        this.employee = employee;
    }

    public SearchColumnSelectField getEmployee(int i) {
        return this.employee[i];
    }

    public void setEmployee(int i, SearchColumnSelectField _value) {
        this.employee[i] = _value;
    }

    public SearchColumnSelectField[] getExternalId() {
        return this.externalId;
    }

    public void setExternalId(SearchColumnSelectField[] externalId) {
        this.externalId = externalId;
    }

    public SearchColumnSelectField getExternalId(int i) {
        return this.externalId[i];
    }

    public void setExternalId(int i, SearchColumnSelectField _value) {
        this.externalId[i] = _value;
    }

    public SearchColumnBooleanField[] getHasGLImpact() {
        return this.hasGLImpact;
    }

    public void setHasGLImpact(SearchColumnBooleanField[] hasGLImpact) {
        this.hasGLImpact = hasGLImpact;
    }

    public SearchColumnBooleanField getHasGLImpact(int i) {
        return this.hasGLImpact[i];
    }

    public void setHasGLImpact(int i, SearchColumnBooleanField _value) {
        this.hasGLImpact[i] = _value;
    }

    public SearchColumnDoubleField[] getHours() {
        return this.hours;
    }

    public void setHours(SearchColumnDoubleField[] hours) {
        this.hours = hours;
    }

    public SearchColumnDoubleField getHours(int i) {
        return this.hours[i];
    }

    public void setHours(int i, SearchColumnDoubleField _value) {
        this.hours[i] = _value;
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

    public SearchColumnSelectField[] getPayrollItem() {
        return this.payrollItem;
    }

    public void setPayrollItem(SearchColumnSelectField[] payrollItem) {
        this.payrollItem = payrollItem;
    }

    public SearchColumnSelectField getPayrollItem(int i) {
        return this.payrollItem[i];
    }

    public void setPayrollItem(int i, SearchColumnSelectField _value) {
        this.payrollItem[i] = _value;
    }

    public SearchColumnSelectField[] getPayrollItemType() {
        return this.payrollItemType;
    }

    public void setPayrollItemType(SearchColumnSelectField[] payrollItemType) {
        this.payrollItemType = payrollItemType;
    }

    public SearchColumnSelectField getPayrollItemType(int i) {
        return this.payrollItemType[i];
    }

    public void setPayrollItemType(int i, SearchColumnSelectField _value) {
        this.payrollItemType[i] = _value;
    }

    public SearchColumnDoubleField[] getSubjectWages() {
        return this.subjectWages;
    }

    public void setSubjectWages(SearchColumnDoubleField[] subjectWages) {
        this.subjectWages = subjectWages;
    }

    public SearchColumnDoubleField getSubjectWages(int i) {
        return this.subjectWages[i];
    }

    public void setSubjectWages(int i, SearchColumnDoubleField _value) {
        this.subjectWages[i] = _value;
    }

    public SearchColumnDoubleField[] getTaxableWages() {
        return this.taxableWages;
    }

    public void setTaxableWages(SearchColumnDoubleField[] taxableWages) {
        this.taxableWages = taxableWages;
    }

    public SearchColumnDoubleField getTaxableWages(int i) {
        return this.taxableWages[i];
    }

    public void setTaxableWages(int i, SearchColumnDoubleField _value) {
        this.taxableWages[i] = _value;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PaycheckSearchRowBasic)) {
            return false;
        }
        PaycheckSearchRowBasic other = (PaycheckSearchRowBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.account == null && other.getAccount() == null || this.account != null && Arrays.equals(this.account, other.getAccount())) && (this.amendedDate == null && other.getAmendedDate() == null || this.amendedDate != null && Arrays.equals(this.amendedDate, other.getAmendedDate())) && (this.amount == null && other.getAmount() == null || this.amount != null && Arrays.equals(this.amount, other.getAmount())) && (this.batchNumber == null && other.getBatchNumber() == null || this.batchNumber != null && Arrays.equals(this.batchNumber, other.getBatchNumber())) && (this.checkDate == null && other.getCheckDate() == null || this.checkDate != null && Arrays.equals(this.checkDate, other.getCheckDate())) && (this.employee == null && other.getEmployee() == null || this.employee != null && Arrays.equals(this.employee, other.getEmployee())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && Arrays.equals(this.externalId, other.getExternalId())) && (this.hasGLImpact == null && other.getHasGLImpact() == null || this.hasGLImpact != null && Arrays.equals(this.hasGLImpact, other.getHasGLImpact())) && (this.hours == null && other.getHours() == null || this.hours != null && Arrays.equals(this.hours, other.getHours())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && Arrays.equals(this.internalId, other.getInternalId())) && (this.payrollItem == null && other.getPayrollItem() == null || this.payrollItem != null && Arrays.equals(this.payrollItem, other.getPayrollItem())) && (this.payrollItemType == null && other.getPayrollItemType() == null || this.payrollItemType != null && Arrays.equals(this.payrollItemType, other.getPayrollItemType())) && (this.subjectWages == null && other.getSubjectWages() == null || this.subjectWages != null && Arrays.equals(this.subjectWages, other.getSubjectWages())) && (this.taxableWages == null && other.getTaxableWages() == null || this.taxableWages != null && Arrays.equals(this.taxableWages, other.getTaxableWages()));
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
        if (this.getAmendedDate() != null) {
            for (i = 0; i < Array.getLength(this.getAmendedDate()); ++i) {
                obj = Array.get(this.getAmendedDate(), i);
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
        if (this.getBatchNumber() != null) {
            for (i = 0; i < Array.getLength(this.getBatchNumber()); ++i) {
                obj = Array.get(this.getBatchNumber(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCheckDate() != null) {
            for (i = 0; i < Array.getLength(this.getCheckDate()); ++i) {
                obj = Array.get(this.getCheckDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getEmployee() != null) {
            for (i = 0; i < Array.getLength(this.getEmployee()); ++i) {
                obj = Array.get(this.getEmployee(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getExternalId() != null) {
            for (i = 0; i < Array.getLength(this.getExternalId()); ++i) {
                obj = Array.get(this.getExternalId(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getHasGLImpact() != null) {
            for (i = 0; i < Array.getLength(this.getHasGLImpact()); ++i) {
                obj = Array.get(this.getHasGLImpact(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getHours() != null) {
            for (i = 0; i < Array.getLength(this.getHours()); ++i) {
                obj = Array.get(this.getHours(), i);
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
        if (this.getPayrollItem() != null) {
            for (i = 0; i < Array.getLength(this.getPayrollItem()); ++i) {
                obj = Array.get(this.getPayrollItem(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPayrollItemType() != null) {
            for (i = 0; i < Array.getLength(this.getPayrollItemType()); ++i) {
                obj = Array.get(this.getPayrollItemType(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSubjectWages() != null) {
            for (i = 0; i < Array.getLength(this.getSubjectWages()); ++i) {
                obj = Array.get(this.getSubjectWages(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTaxableWages() != null) {
            for (i = 0; i < Array.getLength(this.getTaxableWages()); ++i) {
                obj = Array.get(this.getTaxableWages(), i);
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "PaycheckSearchRowBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "account"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("amendedDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "amendedDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
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
        elemField.setFieldName("batchNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "batchNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("checkDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "checkDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("employee");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "employee"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "externalId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("hasGLImpact");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "hasGLImpact"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("hours");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "hours"));
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
        elemField.setFieldName("payrollItem");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "payrollItem"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("payrollItemType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "payrollItemType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subjectWages");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "subjectWages"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxableWages");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "taxableWages"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

