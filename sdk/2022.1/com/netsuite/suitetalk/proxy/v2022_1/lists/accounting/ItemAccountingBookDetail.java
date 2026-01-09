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

public class ItemAccountingBookDetail
implements Serializable {
    private RecordRef accountingBook;
    private RecordRef createRevenuePlansOn;
    private RecordRef revenueRecognitionRule;
    private RecordRef revRecForecastRule;
    private RecordRef revRecSchedule;
    private Boolean sameAsPrimaryRevRec;
    private RecordRef amortizationTemplate;
    private Boolean sameAsPrimaryAmortization;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(ItemAccountingBookDetail.class, true);

    public ItemAccountingBookDetail() {
    }

    public ItemAccountingBookDetail(RecordRef accountingBook, RecordRef createRevenuePlansOn, RecordRef revenueRecognitionRule, RecordRef revRecForecastRule, RecordRef revRecSchedule, Boolean sameAsPrimaryRevRec, RecordRef amortizationTemplate, Boolean sameAsPrimaryAmortization) {
        this.accountingBook = accountingBook;
        this.createRevenuePlansOn = createRevenuePlansOn;
        this.revenueRecognitionRule = revenueRecognitionRule;
        this.revRecForecastRule = revRecForecastRule;
        this.revRecSchedule = revRecSchedule;
        this.sameAsPrimaryRevRec = sameAsPrimaryRevRec;
        this.amortizationTemplate = amortizationTemplate;
        this.sameAsPrimaryAmortization = sameAsPrimaryAmortization;
    }

    public RecordRef getAccountingBook() {
        return this.accountingBook;
    }

    public void setAccountingBook(RecordRef accountingBook) {
        this.accountingBook = accountingBook;
    }

    public RecordRef getCreateRevenuePlansOn() {
        return this.createRevenuePlansOn;
    }

    public void setCreateRevenuePlansOn(RecordRef createRevenuePlansOn) {
        this.createRevenuePlansOn = createRevenuePlansOn;
    }

    public RecordRef getRevenueRecognitionRule() {
        return this.revenueRecognitionRule;
    }

    public void setRevenueRecognitionRule(RecordRef revenueRecognitionRule) {
        this.revenueRecognitionRule = revenueRecognitionRule;
    }

    public RecordRef getRevRecForecastRule() {
        return this.revRecForecastRule;
    }

    public void setRevRecForecastRule(RecordRef revRecForecastRule) {
        this.revRecForecastRule = revRecForecastRule;
    }

    public RecordRef getRevRecSchedule() {
        return this.revRecSchedule;
    }

    public void setRevRecSchedule(RecordRef revRecSchedule) {
        this.revRecSchedule = revRecSchedule;
    }

    public Boolean getSameAsPrimaryRevRec() {
        return this.sameAsPrimaryRevRec;
    }

    public void setSameAsPrimaryRevRec(Boolean sameAsPrimaryRevRec) {
        this.sameAsPrimaryRevRec = sameAsPrimaryRevRec;
    }

    public RecordRef getAmortizationTemplate() {
        return this.amortizationTemplate;
    }

    public void setAmortizationTemplate(RecordRef amortizationTemplate) {
        this.amortizationTemplate = amortizationTemplate;
    }

    public Boolean getSameAsPrimaryAmortization() {
        return this.sameAsPrimaryAmortization;
    }

    public void setSameAsPrimaryAmortization(Boolean sameAsPrimaryAmortization) {
        this.sameAsPrimaryAmortization = sameAsPrimaryAmortization;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ItemAccountingBookDetail)) {
            return false;
        }
        ItemAccountingBookDetail other = (ItemAccountingBookDetail)obj;
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
        boolean _equals = (this.accountingBook == null && other.getAccountingBook() == null || this.accountingBook != null && this.accountingBook.equals(other.getAccountingBook())) && (this.createRevenuePlansOn == null && other.getCreateRevenuePlansOn() == null || this.createRevenuePlansOn != null && this.createRevenuePlansOn.equals(other.getCreateRevenuePlansOn())) && (this.revenueRecognitionRule == null && other.getRevenueRecognitionRule() == null || this.revenueRecognitionRule != null && this.revenueRecognitionRule.equals(other.getRevenueRecognitionRule())) && (this.revRecForecastRule == null && other.getRevRecForecastRule() == null || this.revRecForecastRule != null && this.revRecForecastRule.equals(other.getRevRecForecastRule())) && (this.revRecSchedule == null && other.getRevRecSchedule() == null || this.revRecSchedule != null && this.revRecSchedule.equals(other.getRevRecSchedule())) && (this.sameAsPrimaryRevRec == null && other.getSameAsPrimaryRevRec() == null || this.sameAsPrimaryRevRec != null && this.sameAsPrimaryRevRec.equals(other.getSameAsPrimaryRevRec())) && (this.amortizationTemplate == null && other.getAmortizationTemplate() == null || this.amortizationTemplate != null && this.amortizationTemplate.equals(other.getAmortizationTemplate())) && (this.sameAsPrimaryAmortization == null && other.getSameAsPrimaryAmortization() == null || this.sameAsPrimaryAmortization != null && this.sameAsPrimaryAmortization.equals(other.getSameAsPrimaryAmortization()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getAccountingBook() != null) {
            _hashCode += this.getAccountingBook().hashCode();
        }
        if (this.getCreateRevenuePlansOn() != null) {
            _hashCode += this.getCreateRevenuePlansOn().hashCode();
        }
        if (this.getRevenueRecognitionRule() != null) {
            _hashCode += this.getRevenueRecognitionRule().hashCode();
        }
        if (this.getRevRecForecastRule() != null) {
            _hashCode += this.getRevRecForecastRule().hashCode();
        }
        if (this.getRevRecSchedule() != null) {
            _hashCode += this.getRevRecSchedule().hashCode();
        }
        if (this.getSameAsPrimaryRevRec() != null) {
            _hashCode += this.getSameAsPrimaryRevRec().hashCode();
        }
        if (this.getAmortizationTemplate() != null) {
            _hashCode += this.getAmortizationTemplate().hashCode();
        }
        if (this.getSameAsPrimaryAmortization() != null) {
            _hashCode += this.getSameAsPrimaryAmortization().hashCode();
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
        typeDesc.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "ItemAccountingBookDetail"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("accountingBook");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "accountingBook"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("createRevenuePlansOn");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "createRevenuePlansOn"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revenueRecognitionRule");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "revenueRecognitionRule"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revRecForecastRule");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "revRecForecastRule"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revRecSchedule");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "revRecSchedule"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("sameAsPrimaryRevRec");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "sameAsPrimaryRevRec"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("amortizationTemplate");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "amortizationTemplate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("sameAsPrimaryAmortization");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "sameAsPrimaryAmortization"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

