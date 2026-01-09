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

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnCustomFieldList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnDateField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnDoubleField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnLongField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnStringField;
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

public class InstallmentSearchRowBasic
extends SearchRowBasic
implements Serializable {
    private SearchColumnDoubleField[] amount;
    private SearchColumnDoubleField[] amountPaid;
    private SearchColumnDoubleField[] amountRemaining;
    private SearchColumnLongField[] daysOverdue;
    private SearchColumnDateField[] dueDate;
    private SearchColumnDoubleField[] fxAmount;
    private SearchColumnDoubleField[] fxAmountPaid;
    private SearchColumnDoubleField[] fxAmountRemaining;
    private SearchColumnLongField[] installmentNumber;
    private SearchColumnStringField[] status;
    private SearchColumnCustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(InstallmentSearchRowBasic.class, true);

    public InstallmentSearchRowBasic() {
    }

    public InstallmentSearchRowBasic(SearchColumnDoubleField[] amount, SearchColumnDoubleField[] amountPaid, SearchColumnDoubleField[] amountRemaining, SearchColumnLongField[] daysOverdue, SearchColumnDateField[] dueDate, SearchColumnDoubleField[] fxAmount, SearchColumnDoubleField[] fxAmountPaid, SearchColumnDoubleField[] fxAmountRemaining, SearchColumnLongField[] installmentNumber, SearchColumnStringField[] status, SearchColumnCustomFieldList customFieldList) {
        this.amount = amount;
        this.amountPaid = amountPaid;
        this.amountRemaining = amountRemaining;
        this.daysOverdue = daysOverdue;
        this.dueDate = dueDate;
        this.fxAmount = fxAmount;
        this.fxAmountPaid = fxAmountPaid;
        this.fxAmountRemaining = fxAmountRemaining;
        this.installmentNumber = installmentNumber;
        this.status = status;
        this.customFieldList = customFieldList;
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

    public SearchColumnDoubleField[] getAmountPaid() {
        return this.amountPaid;
    }

    public void setAmountPaid(SearchColumnDoubleField[] amountPaid) {
        this.amountPaid = amountPaid;
    }

    public SearchColumnDoubleField getAmountPaid(int i) {
        return this.amountPaid[i];
    }

    public void setAmountPaid(int i, SearchColumnDoubleField _value) {
        this.amountPaid[i] = _value;
    }

    public SearchColumnDoubleField[] getAmountRemaining() {
        return this.amountRemaining;
    }

    public void setAmountRemaining(SearchColumnDoubleField[] amountRemaining) {
        this.amountRemaining = amountRemaining;
    }

    public SearchColumnDoubleField getAmountRemaining(int i) {
        return this.amountRemaining[i];
    }

    public void setAmountRemaining(int i, SearchColumnDoubleField _value) {
        this.amountRemaining[i] = _value;
    }

    public SearchColumnLongField[] getDaysOverdue() {
        return this.daysOverdue;
    }

    public void setDaysOverdue(SearchColumnLongField[] daysOverdue) {
        this.daysOverdue = daysOverdue;
    }

    public SearchColumnLongField getDaysOverdue(int i) {
        return this.daysOverdue[i];
    }

    public void setDaysOverdue(int i, SearchColumnLongField _value) {
        this.daysOverdue[i] = _value;
    }

    public SearchColumnDateField[] getDueDate() {
        return this.dueDate;
    }

    public void setDueDate(SearchColumnDateField[] dueDate) {
        this.dueDate = dueDate;
    }

    public SearchColumnDateField getDueDate(int i) {
        return this.dueDate[i];
    }

    public void setDueDate(int i, SearchColumnDateField _value) {
        this.dueDate[i] = _value;
    }

    public SearchColumnDoubleField[] getFxAmount() {
        return this.fxAmount;
    }

    public void setFxAmount(SearchColumnDoubleField[] fxAmount) {
        this.fxAmount = fxAmount;
    }

    public SearchColumnDoubleField getFxAmount(int i) {
        return this.fxAmount[i];
    }

    public void setFxAmount(int i, SearchColumnDoubleField _value) {
        this.fxAmount[i] = _value;
    }

    public SearchColumnDoubleField[] getFxAmountPaid() {
        return this.fxAmountPaid;
    }

    public void setFxAmountPaid(SearchColumnDoubleField[] fxAmountPaid) {
        this.fxAmountPaid = fxAmountPaid;
    }

    public SearchColumnDoubleField getFxAmountPaid(int i) {
        return this.fxAmountPaid[i];
    }

    public void setFxAmountPaid(int i, SearchColumnDoubleField _value) {
        this.fxAmountPaid[i] = _value;
    }

    public SearchColumnDoubleField[] getFxAmountRemaining() {
        return this.fxAmountRemaining;
    }

    public void setFxAmountRemaining(SearchColumnDoubleField[] fxAmountRemaining) {
        this.fxAmountRemaining = fxAmountRemaining;
    }

    public SearchColumnDoubleField getFxAmountRemaining(int i) {
        return this.fxAmountRemaining[i];
    }

    public void setFxAmountRemaining(int i, SearchColumnDoubleField _value) {
        this.fxAmountRemaining[i] = _value;
    }

    public SearchColumnLongField[] getInstallmentNumber() {
        return this.installmentNumber;
    }

    public void setInstallmentNumber(SearchColumnLongField[] installmentNumber) {
        this.installmentNumber = installmentNumber;
    }

    public SearchColumnLongField getInstallmentNumber(int i) {
        return this.installmentNumber[i];
    }

    public void setInstallmentNumber(int i, SearchColumnLongField _value) {
        this.installmentNumber[i] = _value;
    }

    public SearchColumnStringField[] getStatus() {
        return this.status;
    }

    public void setStatus(SearchColumnStringField[] status) {
        this.status = status;
    }

    public SearchColumnStringField getStatus(int i) {
        return this.status[i];
    }

    public void setStatus(int i, SearchColumnStringField _value) {
        this.status[i] = _value;
    }

    public SearchColumnCustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof InstallmentSearchRowBasic)) {
            return false;
        }
        InstallmentSearchRowBasic other = (InstallmentSearchRowBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.amount == null && other.getAmount() == null || this.amount != null && Arrays.equals(this.amount, other.getAmount())) && (this.amountPaid == null && other.getAmountPaid() == null || this.amountPaid != null && Arrays.equals(this.amountPaid, other.getAmountPaid())) && (this.amountRemaining == null && other.getAmountRemaining() == null || this.amountRemaining != null && Arrays.equals(this.amountRemaining, other.getAmountRemaining())) && (this.daysOverdue == null && other.getDaysOverdue() == null || this.daysOverdue != null && Arrays.equals(this.daysOverdue, other.getDaysOverdue())) && (this.dueDate == null && other.getDueDate() == null || this.dueDate != null && Arrays.equals(this.dueDate, other.getDueDate())) && (this.fxAmount == null && other.getFxAmount() == null || this.fxAmount != null && Arrays.equals(this.fxAmount, other.getFxAmount())) && (this.fxAmountPaid == null && other.getFxAmountPaid() == null || this.fxAmountPaid != null && Arrays.equals(this.fxAmountPaid, other.getFxAmountPaid())) && (this.fxAmountRemaining == null && other.getFxAmountRemaining() == null || this.fxAmountRemaining != null && Arrays.equals(this.fxAmountRemaining, other.getFxAmountRemaining())) && (this.installmentNumber == null && other.getInstallmentNumber() == null || this.installmentNumber != null && Arrays.equals(this.installmentNumber, other.getInstallmentNumber())) && (this.status == null && other.getStatus() == null || this.status != null && Arrays.equals(this.status, other.getStatus())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
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
        if (this.getAmount() != null) {
            for (i = 0; i < Array.getLength(this.getAmount()); ++i) {
                obj = Array.get(this.getAmount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAmountPaid() != null) {
            for (i = 0; i < Array.getLength(this.getAmountPaid()); ++i) {
                obj = Array.get(this.getAmountPaid(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAmountRemaining() != null) {
            for (i = 0; i < Array.getLength(this.getAmountRemaining()); ++i) {
                obj = Array.get(this.getAmountRemaining(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDaysOverdue() != null) {
            for (i = 0; i < Array.getLength(this.getDaysOverdue()); ++i) {
                obj = Array.get(this.getDaysOverdue(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDueDate() != null) {
            for (i = 0; i < Array.getLength(this.getDueDate()); ++i) {
                obj = Array.get(this.getDueDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getFxAmount() != null) {
            for (i = 0; i < Array.getLength(this.getFxAmount()); ++i) {
                obj = Array.get(this.getFxAmount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getFxAmountPaid() != null) {
            for (i = 0; i < Array.getLength(this.getFxAmountPaid()); ++i) {
                obj = Array.get(this.getFxAmountPaid(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getFxAmountRemaining() != null) {
            for (i = 0; i < Array.getLength(this.getFxAmountRemaining()); ++i) {
                obj = Array.get(this.getFxAmountRemaining(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getInstallmentNumber() != null) {
            for (i = 0; i < Array.getLength(this.getInstallmentNumber()); ++i) {
                obj = Array.get(this.getInstallmentNumber(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getStatus() != null) {
            for (i = 0; i < Array.getLength(this.getStatus()); ++i) {
                obj = Array.get(this.getStatus(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "InstallmentSearchRowBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "amount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("amountPaid");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "amountPaid"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("amountRemaining");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "amountRemaining"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("daysOverdue");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "daysOverdue"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("dueDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "dueDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fxAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fxAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fxAmountPaid");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fxAmountPaid"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fxAmountRemaining");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fxAmountRemaining"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("installmentNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "installmentNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "status"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnCustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

