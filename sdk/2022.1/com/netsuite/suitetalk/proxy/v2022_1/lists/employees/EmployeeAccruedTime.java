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
package com.netsuite.suitetalk.proxy.v2022_1.lists.employees;

import com.netsuite.suitetalk.proxy.v2022_1.lists.employees.types.EmployeeAccruedTimeAccrualMethod;
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

public class EmployeeAccruedTime
implements Serializable {
    private RecordRef payrollItem;
    private Double accruedHours;
    private Double accrualRate;
    private Double monetaryRate;
    private Boolean resetAccruedHoursAtYearEnd;
    private EmployeeAccruedTimeAccrualMethod accrualMethod;
    private Double maximumAccruedHours;
    private Boolean inactive;
    private Calendar effectiveDate;
    private Calendar expirationDate;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(EmployeeAccruedTime.class, true);

    public EmployeeAccruedTime() {
    }

    public EmployeeAccruedTime(RecordRef payrollItem, Double accruedHours, Double accrualRate, Double monetaryRate, Boolean resetAccruedHoursAtYearEnd, EmployeeAccruedTimeAccrualMethod accrualMethod, Double maximumAccruedHours, Boolean inactive, Calendar effectiveDate, Calendar expirationDate) {
        this.payrollItem = payrollItem;
        this.accruedHours = accruedHours;
        this.accrualRate = accrualRate;
        this.monetaryRate = monetaryRate;
        this.resetAccruedHoursAtYearEnd = resetAccruedHoursAtYearEnd;
        this.accrualMethod = accrualMethod;
        this.maximumAccruedHours = maximumAccruedHours;
        this.inactive = inactive;
        this.effectiveDate = effectiveDate;
        this.expirationDate = expirationDate;
    }

    public RecordRef getPayrollItem() {
        return this.payrollItem;
    }

    public void setPayrollItem(RecordRef payrollItem) {
        this.payrollItem = payrollItem;
    }

    public Double getAccruedHours() {
        return this.accruedHours;
    }

    public void setAccruedHours(Double accruedHours) {
        this.accruedHours = accruedHours;
    }

    public Double getAccrualRate() {
        return this.accrualRate;
    }

    public void setAccrualRate(Double accrualRate) {
        this.accrualRate = accrualRate;
    }

    public Double getMonetaryRate() {
        return this.monetaryRate;
    }

    public void setMonetaryRate(Double monetaryRate) {
        this.monetaryRate = monetaryRate;
    }

    public Boolean getResetAccruedHoursAtYearEnd() {
        return this.resetAccruedHoursAtYearEnd;
    }

    public void setResetAccruedHoursAtYearEnd(Boolean resetAccruedHoursAtYearEnd) {
        this.resetAccruedHoursAtYearEnd = resetAccruedHoursAtYearEnd;
    }

    public EmployeeAccruedTimeAccrualMethod getAccrualMethod() {
        return this.accrualMethod;
    }

    public void setAccrualMethod(EmployeeAccruedTimeAccrualMethod accrualMethod) {
        this.accrualMethod = accrualMethod;
    }

    public Double getMaximumAccruedHours() {
        return this.maximumAccruedHours;
    }

    public void setMaximumAccruedHours(Double maximumAccruedHours) {
        this.maximumAccruedHours = maximumAccruedHours;
    }

    public Boolean getInactive() {
        return this.inactive;
    }

    public void setInactive(Boolean inactive) {
        this.inactive = inactive;
    }

    public Calendar getEffectiveDate() {
        return this.effectiveDate;
    }

    public void setEffectiveDate(Calendar effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public Calendar getExpirationDate() {
        return this.expirationDate;
    }

    public void setExpirationDate(Calendar expirationDate) {
        this.expirationDate = expirationDate;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof EmployeeAccruedTime)) {
            return false;
        }
        EmployeeAccruedTime other = (EmployeeAccruedTime)obj;
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
        boolean _equals = (this.payrollItem == null && other.getPayrollItem() == null || this.payrollItem != null && this.payrollItem.equals(other.getPayrollItem())) && (this.accruedHours == null && other.getAccruedHours() == null || this.accruedHours != null && this.accruedHours.equals(other.getAccruedHours())) && (this.accrualRate == null && other.getAccrualRate() == null || this.accrualRate != null && this.accrualRate.equals(other.getAccrualRate())) && (this.monetaryRate == null && other.getMonetaryRate() == null || this.monetaryRate != null && this.monetaryRate.equals(other.getMonetaryRate())) && (this.resetAccruedHoursAtYearEnd == null && other.getResetAccruedHoursAtYearEnd() == null || this.resetAccruedHoursAtYearEnd != null && this.resetAccruedHoursAtYearEnd.equals(other.getResetAccruedHoursAtYearEnd())) && (this.accrualMethod == null && other.getAccrualMethod() == null || this.accrualMethod != null && this.accrualMethod.equals(other.getAccrualMethod())) && (this.maximumAccruedHours == null && other.getMaximumAccruedHours() == null || this.maximumAccruedHours != null && this.maximumAccruedHours.equals(other.getMaximumAccruedHours())) && (this.inactive == null && other.getInactive() == null || this.inactive != null && this.inactive.equals(other.getInactive())) && (this.effectiveDate == null && other.getEffectiveDate() == null || this.effectiveDate != null && this.effectiveDate.equals(other.getEffectiveDate())) && (this.expirationDate == null && other.getExpirationDate() == null || this.expirationDate != null && this.expirationDate.equals(other.getExpirationDate()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getPayrollItem() != null) {
            _hashCode += this.getPayrollItem().hashCode();
        }
        if (this.getAccruedHours() != null) {
            _hashCode += this.getAccruedHours().hashCode();
        }
        if (this.getAccrualRate() != null) {
            _hashCode += this.getAccrualRate().hashCode();
        }
        if (this.getMonetaryRate() != null) {
            _hashCode += this.getMonetaryRate().hashCode();
        }
        if (this.getResetAccruedHoursAtYearEnd() != null) {
            _hashCode += this.getResetAccruedHoursAtYearEnd().hashCode();
        }
        if (this.getAccrualMethod() != null) {
            _hashCode += this.getAccrualMethod().hashCode();
        }
        if (this.getMaximumAccruedHours() != null) {
            _hashCode += this.getMaximumAccruedHours().hashCode();
        }
        if (this.getInactive() != null) {
            _hashCode += this.getInactive().hashCode();
        }
        if (this.getEffectiveDate() != null) {
            _hashCode += this.getEffectiveDate().hashCode();
        }
        if (this.getExpirationDate() != null) {
            _hashCode += this.getExpirationDate().hashCode();
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
        typeDesc.setXmlType(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "EmployeeAccruedTime"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("payrollItem");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "payrollItem"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("accruedHours");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "accruedHours"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("accrualRate");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "accrualRate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("monetaryRate");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "monetaryRate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("resetAccruedHoursAtYearEnd");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "resetAccruedHoursAtYearEnd"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("accrualMethod");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "accrualMethod"));
        elemField.setXmlType(new QName("urn:types.employees_2022_1.lists.webservices.netsuite.com", "EmployeeAccruedTimeAccrualMethod"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("maximumAccruedHours");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "maximumAccruedHours"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("inactive");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "inactive"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("effectiveDate");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "effectiveDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "expirationDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

