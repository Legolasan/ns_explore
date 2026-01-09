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

public class EmployeeCompanyContribution
implements Serializable {
    private RecordRef payrollItem;
    private String rate;
    private Double limit;
    private Boolean inactive;
    private Calendar effectiveDate;
    private Calendar expirationDate;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(EmployeeCompanyContribution.class, true);

    public EmployeeCompanyContribution() {
    }

    public EmployeeCompanyContribution(RecordRef payrollItem, String rate, Double limit, Boolean inactive, Calendar effectiveDate, Calendar expirationDate) {
        this.payrollItem = payrollItem;
        this.rate = rate;
        this.limit = limit;
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

    public String getRate() {
        return this.rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public Double getLimit() {
        return this.limit;
    }

    public void setLimit(Double limit) {
        this.limit = limit;
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
        if (!(obj instanceof EmployeeCompanyContribution)) {
            return false;
        }
        EmployeeCompanyContribution other = (EmployeeCompanyContribution)obj;
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
        boolean _equals = (this.payrollItem == null && other.getPayrollItem() == null || this.payrollItem != null && this.payrollItem.equals(other.getPayrollItem())) && (this.rate == null && other.getRate() == null || this.rate != null && this.rate.equals(other.getRate())) && (this.limit == null && other.getLimit() == null || this.limit != null && this.limit.equals(other.getLimit())) && (this.inactive == null && other.getInactive() == null || this.inactive != null && this.inactive.equals(other.getInactive())) && (this.effectiveDate == null && other.getEffectiveDate() == null || this.effectiveDate != null && this.effectiveDate.equals(other.getEffectiveDate())) && (this.expirationDate == null && other.getExpirationDate() == null || this.expirationDate != null && this.expirationDate.equals(other.getExpirationDate()));
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
        if (this.getRate() != null) {
            _hashCode += this.getRate().hashCode();
        }
        if (this.getLimit() != null) {
            _hashCode += this.getLimit().hashCode();
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
        typeDesc.setXmlType(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "EmployeeCompanyContribution"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("payrollItem");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "payrollItem"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("rate");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "rate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("limit");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "limit"));
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

