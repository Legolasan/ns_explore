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

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchCustomFieldList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchDateField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchDoubleField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchLongField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchRecordBasic;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class InstallmentSearchBasic
extends SearchRecordBasic
implements Serializable {
    private SearchDoubleField amount;
    private SearchDoubleField amountPaid;
    private SearchDoubleField amountRemaining;
    private SearchLongField daysOverdue;
    private SearchDateField dueDate;
    private SearchDoubleField fxAmount;
    private SearchDoubleField fxAmountPaid;
    private SearchDoubleField fxAmountRemaining;
    private SearchLongField installmentNumber;
    private SearchCustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(InstallmentSearchBasic.class, true);

    public InstallmentSearchBasic() {
    }

    public InstallmentSearchBasic(SearchDoubleField amount, SearchDoubleField amountPaid, SearchDoubleField amountRemaining, SearchLongField daysOverdue, SearchDateField dueDate, SearchDoubleField fxAmount, SearchDoubleField fxAmountPaid, SearchDoubleField fxAmountRemaining, SearchLongField installmentNumber, SearchCustomFieldList customFieldList) {
        this.amount = amount;
        this.amountPaid = amountPaid;
        this.amountRemaining = amountRemaining;
        this.daysOverdue = daysOverdue;
        this.dueDate = dueDate;
        this.fxAmount = fxAmount;
        this.fxAmountPaid = fxAmountPaid;
        this.fxAmountRemaining = fxAmountRemaining;
        this.installmentNumber = installmentNumber;
        this.customFieldList = customFieldList;
    }

    public SearchDoubleField getAmount() {
        return this.amount;
    }

    public void setAmount(SearchDoubleField amount) {
        this.amount = amount;
    }

    public SearchDoubleField getAmountPaid() {
        return this.amountPaid;
    }

    public void setAmountPaid(SearchDoubleField amountPaid) {
        this.amountPaid = amountPaid;
    }

    public SearchDoubleField getAmountRemaining() {
        return this.amountRemaining;
    }

    public void setAmountRemaining(SearchDoubleField amountRemaining) {
        this.amountRemaining = amountRemaining;
    }

    public SearchLongField getDaysOverdue() {
        return this.daysOverdue;
    }

    public void setDaysOverdue(SearchLongField daysOverdue) {
        this.daysOverdue = daysOverdue;
    }

    public SearchDateField getDueDate() {
        return this.dueDate;
    }

    public void setDueDate(SearchDateField dueDate) {
        this.dueDate = dueDate;
    }

    public SearchDoubleField getFxAmount() {
        return this.fxAmount;
    }

    public void setFxAmount(SearchDoubleField fxAmount) {
        this.fxAmount = fxAmount;
    }

    public SearchDoubleField getFxAmountPaid() {
        return this.fxAmountPaid;
    }

    public void setFxAmountPaid(SearchDoubleField fxAmountPaid) {
        this.fxAmountPaid = fxAmountPaid;
    }

    public SearchDoubleField getFxAmountRemaining() {
        return this.fxAmountRemaining;
    }

    public void setFxAmountRemaining(SearchDoubleField fxAmountRemaining) {
        this.fxAmountRemaining = fxAmountRemaining;
    }

    public SearchLongField getInstallmentNumber() {
        return this.installmentNumber;
    }

    public void setInstallmentNumber(SearchLongField installmentNumber) {
        this.installmentNumber = installmentNumber;
    }

    public SearchCustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof InstallmentSearchBasic)) {
            return false;
        }
        InstallmentSearchBasic other = (InstallmentSearchBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.amount == null && other.getAmount() == null || this.amount != null && this.amount.equals(other.getAmount())) && (this.amountPaid == null && other.getAmountPaid() == null || this.amountPaid != null && this.amountPaid.equals(other.getAmountPaid())) && (this.amountRemaining == null && other.getAmountRemaining() == null || this.amountRemaining != null && this.amountRemaining.equals(other.getAmountRemaining())) && (this.daysOverdue == null && other.getDaysOverdue() == null || this.daysOverdue != null && this.daysOverdue.equals(other.getDaysOverdue())) && (this.dueDate == null && other.getDueDate() == null || this.dueDate != null && this.dueDate.equals(other.getDueDate())) && (this.fxAmount == null && other.getFxAmount() == null || this.fxAmount != null && this.fxAmount.equals(other.getFxAmount())) && (this.fxAmountPaid == null && other.getFxAmountPaid() == null || this.fxAmountPaid != null && this.fxAmountPaid.equals(other.getFxAmountPaid())) && (this.fxAmountRemaining == null && other.getFxAmountRemaining() == null || this.fxAmountRemaining != null && this.fxAmountRemaining.equals(other.getFxAmountRemaining())) && (this.installmentNumber == null && other.getInstallmentNumber() == null || this.installmentNumber != null && this.installmentNumber.equals(other.getInstallmentNumber())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
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
        if (this.getAmount() != null) {
            _hashCode += this.getAmount().hashCode();
        }
        if (this.getAmountPaid() != null) {
            _hashCode += this.getAmountPaid().hashCode();
        }
        if (this.getAmountRemaining() != null) {
            _hashCode += this.getAmountRemaining().hashCode();
        }
        if (this.getDaysOverdue() != null) {
            _hashCode += this.getDaysOverdue().hashCode();
        }
        if (this.getDueDate() != null) {
            _hashCode += this.getDueDate().hashCode();
        }
        if (this.getFxAmount() != null) {
            _hashCode += this.getFxAmount().hashCode();
        }
        if (this.getFxAmountPaid() != null) {
            _hashCode += this.getFxAmountPaid().hashCode();
        }
        if (this.getFxAmountRemaining() != null) {
            _hashCode += this.getFxAmountRemaining().hashCode();
        }
        if (this.getInstallmentNumber() != null) {
            _hashCode += this.getInstallmentNumber().hashCode();
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "InstallmentSearchBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "amount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("amountPaid");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "amountPaid"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("amountRemaining");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "amountRemaining"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("daysOverdue");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "daysOverdue"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("dueDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "dueDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fxAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fxAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fxAmountPaid");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fxAmountPaid"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fxAmountRemaining");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fxAmountRemaining"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("installmentNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "installmentNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchCustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

