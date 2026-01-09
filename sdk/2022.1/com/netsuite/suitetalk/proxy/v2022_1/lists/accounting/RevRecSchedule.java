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
package com.netsuite.suitetalk.proxy.v2022_1.lists.accounting;

import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.RevRecScheduleRecurrenceList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.types.RevRecScheduleAmortizationType;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.types.RevRecScheduleRecogIntervalSrc;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.types.RevRecScheduleRecurrenceType;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.NullField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.Record;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.AttributeDesc;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class RevRecSchedule
extends Record
implements Serializable {
    private String name;
    private RevRecScheduleAmortizationType amortizationType;
    private RevRecScheduleRecurrenceType recurrenceType;
    private RevRecScheduleRecogIntervalSrc recogIntervalSrc;
    private Long amortizationPeriod;
    private Long periodOffset;
    private Long revRecOffset;
    private Double initialAmount;
    private Boolean isInactive;
    private RevRecScheduleRecurrenceList recurrenceList;
    private String internalId;
    private String externalId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(RevRecSchedule.class, true);

    public RevRecSchedule() {
    }

    public RevRecSchedule(NullField nullFieldList, String internalId, String externalId, String name, RevRecScheduleAmortizationType amortizationType, RevRecScheduleRecurrenceType recurrenceType, RevRecScheduleRecogIntervalSrc recogIntervalSrc, Long amortizationPeriod, Long periodOffset, Long revRecOffset, Double initialAmount, Boolean isInactive, RevRecScheduleRecurrenceList recurrenceList) {
        super(nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.name = name;
        this.amortizationType = amortizationType;
        this.recurrenceType = recurrenceType;
        this.recogIntervalSrc = recogIntervalSrc;
        this.amortizationPeriod = amortizationPeriod;
        this.periodOffset = periodOffset;
        this.revRecOffset = revRecOffset;
        this.initialAmount = initialAmount;
        this.isInactive = isInactive;
        this.recurrenceList = recurrenceList;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RevRecScheduleAmortizationType getAmortizationType() {
        return this.amortizationType;
    }

    public void setAmortizationType(RevRecScheduleAmortizationType amortizationType) {
        this.amortizationType = amortizationType;
    }

    public RevRecScheduleRecurrenceType getRecurrenceType() {
        return this.recurrenceType;
    }

    public void setRecurrenceType(RevRecScheduleRecurrenceType recurrenceType) {
        this.recurrenceType = recurrenceType;
    }

    public RevRecScheduleRecogIntervalSrc getRecogIntervalSrc() {
        return this.recogIntervalSrc;
    }

    public void setRecogIntervalSrc(RevRecScheduleRecogIntervalSrc recogIntervalSrc) {
        this.recogIntervalSrc = recogIntervalSrc;
    }

    public Long getAmortizationPeriod() {
        return this.amortizationPeriod;
    }

    public void setAmortizationPeriod(Long amortizationPeriod) {
        this.amortizationPeriod = amortizationPeriod;
    }

    public Long getPeriodOffset() {
        return this.periodOffset;
    }

    public void setPeriodOffset(Long periodOffset) {
        this.periodOffset = periodOffset;
    }

    public Long getRevRecOffset() {
        return this.revRecOffset;
    }

    public void setRevRecOffset(Long revRecOffset) {
        this.revRecOffset = revRecOffset;
    }

    public Double getInitialAmount() {
        return this.initialAmount;
    }

    public void setInitialAmount(Double initialAmount) {
        this.initialAmount = initialAmount;
    }

    public Boolean getIsInactive() {
        return this.isInactive;
    }

    public void setIsInactive(Boolean isInactive) {
        this.isInactive = isInactive;
    }

    public RevRecScheduleRecurrenceList getRecurrenceList() {
        return this.recurrenceList;
    }

    public void setRecurrenceList(RevRecScheduleRecurrenceList recurrenceList) {
        this.recurrenceList = recurrenceList;
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
        if (!(obj instanceof RevRecSchedule)) {
            return false;
        }
        RevRecSchedule other = (RevRecSchedule)obj;
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
        boolean _equals = super.equals(obj) && (this.name == null && other.getName() == null || this.name != null && this.name.equals(other.getName())) && (this.amortizationType == null && other.getAmortizationType() == null || this.amortizationType != null && this.amortizationType.equals(other.getAmortizationType())) && (this.recurrenceType == null && other.getRecurrenceType() == null || this.recurrenceType != null && this.recurrenceType.equals(other.getRecurrenceType())) && (this.recogIntervalSrc == null && other.getRecogIntervalSrc() == null || this.recogIntervalSrc != null && this.recogIntervalSrc.equals(other.getRecogIntervalSrc())) && (this.amortizationPeriod == null && other.getAmortizationPeriod() == null || this.amortizationPeriod != null && this.amortizationPeriod.equals(other.getAmortizationPeriod())) && (this.periodOffset == null && other.getPeriodOffset() == null || this.periodOffset != null && this.periodOffset.equals(other.getPeriodOffset())) && (this.revRecOffset == null && other.getRevRecOffset() == null || this.revRecOffset != null && this.revRecOffset.equals(other.getRevRecOffset())) && (this.initialAmount == null && other.getInitialAmount() == null || this.initialAmount != null && this.initialAmount.equals(other.getInitialAmount())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && this.isInactive.equals(other.getIsInactive())) && (this.recurrenceList == null && other.getRecurrenceList() == null || this.recurrenceList != null && this.recurrenceList.equals(other.getRecurrenceList())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
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
        if (this.getName() != null) {
            _hashCode += this.getName().hashCode();
        }
        if (this.getAmortizationType() != null) {
            _hashCode += this.getAmortizationType().hashCode();
        }
        if (this.getRecurrenceType() != null) {
            _hashCode += this.getRecurrenceType().hashCode();
        }
        if (this.getRecogIntervalSrc() != null) {
            _hashCode += this.getRecogIntervalSrc().hashCode();
        }
        if (this.getAmortizationPeriod() != null) {
            _hashCode += this.getAmortizationPeriod().hashCode();
        }
        if (this.getPeriodOffset() != null) {
            _hashCode += this.getPeriodOffset().hashCode();
        }
        if (this.getRevRecOffset() != null) {
            _hashCode += this.getRevRecOffset().hashCode();
        }
        if (this.getInitialAmount() != null) {
            _hashCode += this.getInitialAmount().hashCode();
        }
        if (this.getIsInactive() != null) {
            _hashCode += this.getIsInactive().hashCode();
        }
        if (this.getRecurrenceList() != null) {
            _hashCode += this.getRecurrenceList().hashCode();
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
        typeDesc.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "RevRecSchedule"));
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
        elemField.setFieldName("name");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "name"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("amortizationType");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "amortizationType"));
        elemField.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "RevRecScheduleAmortizationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recurrenceType");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "recurrenceType"));
        elemField.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "RevRecScheduleRecurrenceType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recogIntervalSrc");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "recogIntervalSrc"));
        elemField.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "RevRecScheduleRecogIntervalSrc"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("amortizationPeriod");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "amortizationPeriod"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("periodOffset");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "periodOffset"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revRecOffset");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "revRecOffset"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("initialAmount");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "initialAmount"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recurrenceList");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "recurrenceList"));
        elemField.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "RevRecScheduleRecurrenceList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

