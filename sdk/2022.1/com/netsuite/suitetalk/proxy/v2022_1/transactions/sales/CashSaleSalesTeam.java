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
package com.netsuite.suitetalk.proxy.v2022_1.transactions.sales;

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class CashSaleSalesTeam
implements Serializable {
    private RecordRef employee;
    private RecordRef salesRole;
    private Boolean isPrimary;
    private Double contribution;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(CashSaleSalesTeam.class, true);

    public CashSaleSalesTeam() {
    }

    public CashSaleSalesTeam(RecordRef employee, RecordRef salesRole, Boolean isPrimary, Double contribution) {
        this.employee = employee;
        this.salesRole = salesRole;
        this.isPrimary = isPrimary;
        this.contribution = contribution;
    }

    public RecordRef getEmployee() {
        return this.employee;
    }

    public void setEmployee(RecordRef employee) {
        this.employee = employee;
    }

    public RecordRef getSalesRole() {
        return this.salesRole;
    }

    public void setSalesRole(RecordRef salesRole) {
        this.salesRole = salesRole;
    }

    public Boolean getIsPrimary() {
        return this.isPrimary;
    }

    public void setIsPrimary(Boolean isPrimary) {
        this.isPrimary = isPrimary;
    }

    public Double getContribution() {
        return this.contribution;
    }

    public void setContribution(Double contribution) {
        this.contribution = contribution;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CashSaleSalesTeam)) {
            return false;
        }
        CashSaleSalesTeam other = (CashSaleSalesTeam)obj;
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
        boolean _equals = (this.employee == null && other.getEmployee() == null || this.employee != null && this.employee.equals(other.getEmployee())) && (this.salesRole == null && other.getSalesRole() == null || this.salesRole != null && this.salesRole.equals(other.getSalesRole())) && (this.isPrimary == null && other.getIsPrimary() == null || this.isPrimary != null && this.isPrimary.equals(other.getIsPrimary())) && (this.contribution == null && other.getContribution() == null || this.contribution != null && this.contribution.equals(other.getContribution()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getEmployee() != null) {
            _hashCode += this.getEmployee().hashCode();
        }
        if (this.getSalesRole() != null) {
            _hashCode += this.getSalesRole().hashCode();
        }
        if (this.getIsPrimary() != null) {
            _hashCode += this.getIsPrimary().hashCode();
        }
        if (this.getContribution() != null) {
            _hashCode += this.getContribution().hashCode();
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
        typeDesc.setXmlType(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "CashSaleSalesTeam"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("employee");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "employee"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("salesRole");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "salesRole"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isPrimary");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "isPrimary"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("contribution");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "contribution"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

