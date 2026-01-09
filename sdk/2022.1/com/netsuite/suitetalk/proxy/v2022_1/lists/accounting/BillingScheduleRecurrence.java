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
package com.netsuite.suitetalk.proxy.v2022_1.lists.accounting;

import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.types.BillingScheduleRecurrenceRecurrenceUnits;
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

public class BillingScheduleRecurrence
implements Serializable {
    private Long recurrenceId;
    private Long count;
    private BillingScheduleRecurrenceRecurrenceUnits units;
    private Boolean relativeToPrevious;
    private Calendar recurrenceDate;
    private Double amount;
    private RecordRef paymentTerms;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(BillingScheduleRecurrence.class, true);

    public BillingScheduleRecurrence() {
    }

    public BillingScheduleRecurrence(Long recurrenceId, Long count, BillingScheduleRecurrenceRecurrenceUnits units, Boolean relativeToPrevious, Calendar recurrenceDate, Double amount, RecordRef paymentTerms) {
        this.recurrenceId = recurrenceId;
        this.count = count;
        this.units = units;
        this.relativeToPrevious = relativeToPrevious;
        this.recurrenceDate = recurrenceDate;
        this.amount = amount;
        this.paymentTerms = paymentTerms;
    }

    public Long getRecurrenceId() {
        return this.recurrenceId;
    }

    public void setRecurrenceId(Long recurrenceId) {
        this.recurrenceId = recurrenceId;
    }

    public Long getCount() {
        return this.count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public BillingScheduleRecurrenceRecurrenceUnits getUnits() {
        return this.units;
    }

    public void setUnits(BillingScheduleRecurrenceRecurrenceUnits units) {
        this.units = units;
    }

    public Boolean getRelativeToPrevious() {
        return this.relativeToPrevious;
    }

    public void setRelativeToPrevious(Boolean relativeToPrevious) {
        this.relativeToPrevious = relativeToPrevious;
    }

    public Calendar getRecurrenceDate() {
        return this.recurrenceDate;
    }

    public void setRecurrenceDate(Calendar recurrenceDate) {
        this.recurrenceDate = recurrenceDate;
    }

    public Double getAmount() {
        return this.amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public RecordRef getPaymentTerms() {
        return this.paymentTerms;
    }

    public void setPaymentTerms(RecordRef paymentTerms) {
        this.paymentTerms = paymentTerms;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof BillingScheduleRecurrence)) {
            return false;
        }
        BillingScheduleRecurrence other = (BillingScheduleRecurrence)obj;
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
        boolean _equals = (this.recurrenceId == null && other.getRecurrenceId() == null || this.recurrenceId != null && this.recurrenceId.equals(other.getRecurrenceId())) && (this.count == null && other.getCount() == null || this.count != null && this.count.equals(other.getCount())) && (this.units == null && other.getUnits() == null || this.units != null && this.units.equals(other.getUnits())) && (this.relativeToPrevious == null && other.getRelativeToPrevious() == null || this.relativeToPrevious != null && this.relativeToPrevious.equals(other.getRelativeToPrevious())) && (this.recurrenceDate == null && other.getRecurrenceDate() == null || this.recurrenceDate != null && this.recurrenceDate.equals(other.getRecurrenceDate())) && (this.amount == null && other.getAmount() == null || this.amount != null && this.amount.equals(other.getAmount())) && (this.paymentTerms == null && other.getPaymentTerms() == null || this.paymentTerms != null && this.paymentTerms.equals(other.getPaymentTerms()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getRecurrenceId() != null) {
            _hashCode += this.getRecurrenceId().hashCode();
        }
        if (this.getCount() != null) {
            _hashCode += this.getCount().hashCode();
        }
        if (this.getUnits() != null) {
            _hashCode += this.getUnits().hashCode();
        }
        if (this.getRelativeToPrevious() != null) {
            _hashCode += this.getRelativeToPrevious().hashCode();
        }
        if (this.getRecurrenceDate() != null) {
            _hashCode += this.getRecurrenceDate().hashCode();
        }
        if (this.getAmount() != null) {
            _hashCode += this.getAmount().hashCode();
        }
        if (this.getPaymentTerms() != null) {
            _hashCode += this.getPaymentTerms().hashCode();
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
        typeDesc.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "BillingScheduleRecurrence"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("recurrenceId");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "recurrenceId"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("count");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "count"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("units");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "units"));
        elemField.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "BillingScheduleRecurrenceRecurrenceUnits"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("relativeToPrevious");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "relativeToPrevious"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recurrenceDate");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "recurrenceDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "amount"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("paymentTerms");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "paymentTerms"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

