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

public class EmployeeEarning
implements Serializable {
    private RecordRef payrollItem;
    private String payRate;
    private Boolean primaryEarning;
    private Double defaultHours;
    private Boolean inactive;
    private Boolean defaultEarning;
    private Calendar effectiveDate;
    private Calendar expirationDate;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(EmployeeEarning.class, true);

    public EmployeeEarning() {
    }

    public EmployeeEarning(RecordRef payrollItem, String payRate, Boolean primaryEarning, Double defaultHours, Boolean inactive, Boolean defaultEarning, Calendar effectiveDate, Calendar expirationDate) {
        this.payrollItem = payrollItem;
        this.payRate = payRate;
        this.primaryEarning = primaryEarning;
        this.defaultHours = defaultHours;
        this.inactive = inactive;
        this.defaultEarning = defaultEarning;
        this.effectiveDate = effectiveDate;
        this.expirationDate = expirationDate;
    }

    public RecordRef getPayrollItem() {
        return this.payrollItem;
    }

    public void setPayrollItem(RecordRef payrollItem) {
        this.payrollItem = payrollItem;
    }

    public String getPayRate() {
        return this.payRate;
    }

    public void setPayRate(String payRate) {
        this.payRate = payRate;
    }

    public Boolean getPrimaryEarning() {
        return this.primaryEarning;
    }

    public void setPrimaryEarning(Boolean primaryEarning) {
        this.primaryEarning = primaryEarning;
    }

    public Double getDefaultHours() {
        return this.defaultHours;
    }

    public void setDefaultHours(Double defaultHours) {
        this.defaultHours = defaultHours;
    }

    public Boolean getInactive() {
        return this.inactive;
    }

    public void setInactive(Boolean inactive) {
        this.inactive = inactive;
    }

    public Boolean getDefaultEarning() {
        return this.defaultEarning;
    }

    public void setDefaultEarning(Boolean defaultEarning) {
        this.defaultEarning = defaultEarning;
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
        if (!(obj instanceof EmployeeEarning)) {
            return false;
        }
        EmployeeEarning other = (EmployeeEarning)obj;
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
        boolean _equals = (this.payrollItem == null && other.getPayrollItem() == null || this.payrollItem != null && this.payrollItem.equals(other.getPayrollItem())) && (this.payRate == null && other.getPayRate() == null || this.payRate != null && this.payRate.equals(other.getPayRate())) && (this.primaryEarning == null && other.getPrimaryEarning() == null || this.primaryEarning != null && this.primaryEarning.equals(other.getPrimaryEarning())) && (this.defaultHours == null && other.getDefaultHours() == null || this.defaultHours != null && this.defaultHours.equals(other.getDefaultHours())) && (this.inactive == null && other.getInactive() == null || this.inactive != null && this.inactive.equals(other.getInactive())) && (this.defaultEarning == null && other.getDefaultEarning() == null || this.defaultEarning != null && this.defaultEarning.equals(other.getDefaultEarning())) && (this.effectiveDate == null && other.getEffectiveDate() == null || this.effectiveDate != null && this.effectiveDate.equals(other.getEffectiveDate())) && (this.expirationDate == null && other.getExpirationDate() == null || this.expirationDate != null && this.expirationDate.equals(other.getExpirationDate()));
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
        if (this.getPayRate() != null) {
            _hashCode += this.getPayRate().hashCode();
        }
        if (this.getPrimaryEarning() != null) {
            _hashCode += this.getPrimaryEarning().hashCode();
        }
        if (this.getDefaultHours() != null) {
            _hashCode += this.getDefaultHours().hashCode();
        }
        if (this.getInactive() != null) {
            _hashCode += this.getInactive().hashCode();
        }
        if (this.getDefaultEarning() != null) {
            _hashCode += this.getDefaultEarning().hashCode();
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
        typeDesc.setXmlType(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "EmployeeEarning"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("payrollItem");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "payrollItem"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("payRate");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "payRate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("primaryEarning");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "primaryEarning"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("defaultHours");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "defaultHours"));
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
        elemField.setFieldName("defaultEarning");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "defaultEarning"));
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

