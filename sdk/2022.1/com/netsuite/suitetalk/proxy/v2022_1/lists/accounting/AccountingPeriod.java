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

import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.AccountingPeriodFiscalCalendarsList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.NullField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.Record;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import java.io.Serializable;
import java.util.Calendar;
import javax.xml.namespace.QName;
import org.apache.axis.description.AttributeDesc;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class AccountingPeriod
extends Record
implements Serializable {
    private String periodName;
    private RecordRef parent;
    private Calendar startDate;
    private Calendar endDate;
    private RecordRef fiscalCalendar;
    private Calendar closedOnDate;
    private Boolean isAdjust;
    private AccountingPeriodFiscalCalendarsList fiscalCalendarsList;
    private Boolean isQuarter;
    private Boolean isYear;
    private Boolean closed;
    private Boolean apLocked;
    private Boolean arLocked;
    private Boolean payrollLocked;
    private Boolean allLocked;
    private Boolean allowNonGLChanges;
    private String internalId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(AccountingPeriod.class, true);

    public AccountingPeriod() {
    }

    public AccountingPeriod(NullField nullFieldList, String internalId, String periodName, RecordRef parent, Calendar startDate, Calendar endDate, RecordRef fiscalCalendar, Calendar closedOnDate, Boolean isAdjust, AccountingPeriodFiscalCalendarsList fiscalCalendarsList, Boolean isQuarter, Boolean isYear, Boolean closed, Boolean apLocked, Boolean arLocked, Boolean payrollLocked, Boolean allLocked, Boolean allowNonGLChanges) {
        super(nullFieldList);
        this.internalId = internalId;
        this.periodName = periodName;
        this.parent = parent;
        this.startDate = startDate;
        this.endDate = endDate;
        this.fiscalCalendar = fiscalCalendar;
        this.closedOnDate = closedOnDate;
        this.isAdjust = isAdjust;
        this.fiscalCalendarsList = fiscalCalendarsList;
        this.isQuarter = isQuarter;
        this.isYear = isYear;
        this.closed = closed;
        this.apLocked = apLocked;
        this.arLocked = arLocked;
        this.payrollLocked = payrollLocked;
        this.allLocked = allLocked;
        this.allowNonGLChanges = allowNonGLChanges;
    }

    public String getPeriodName() {
        return this.periodName;
    }

    public void setPeriodName(String periodName) {
        this.periodName = periodName;
    }

    public RecordRef getParent() {
        return this.parent;
    }

    public void setParent(RecordRef parent) {
        this.parent = parent;
    }

    public Calendar getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Calendar startDate) {
        this.startDate = startDate;
    }

    public Calendar getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Calendar endDate) {
        this.endDate = endDate;
    }

    public RecordRef getFiscalCalendar() {
        return this.fiscalCalendar;
    }

    public void setFiscalCalendar(RecordRef fiscalCalendar) {
        this.fiscalCalendar = fiscalCalendar;
    }

    public Calendar getClosedOnDate() {
        return this.closedOnDate;
    }

    public void setClosedOnDate(Calendar closedOnDate) {
        this.closedOnDate = closedOnDate;
    }

    public Boolean getIsAdjust() {
        return this.isAdjust;
    }

    public void setIsAdjust(Boolean isAdjust) {
        this.isAdjust = isAdjust;
    }

    public AccountingPeriodFiscalCalendarsList getFiscalCalendarsList() {
        return this.fiscalCalendarsList;
    }

    public void setFiscalCalendarsList(AccountingPeriodFiscalCalendarsList fiscalCalendarsList) {
        this.fiscalCalendarsList = fiscalCalendarsList;
    }

    public Boolean getIsQuarter() {
        return this.isQuarter;
    }

    public void setIsQuarter(Boolean isQuarter) {
        this.isQuarter = isQuarter;
    }

    public Boolean getIsYear() {
        return this.isYear;
    }

    public void setIsYear(Boolean isYear) {
        this.isYear = isYear;
    }

    public Boolean getClosed() {
        return this.closed;
    }

    public void setClosed(Boolean closed) {
        this.closed = closed;
    }

    public Boolean getApLocked() {
        return this.apLocked;
    }

    public void setApLocked(Boolean apLocked) {
        this.apLocked = apLocked;
    }

    public Boolean getArLocked() {
        return this.arLocked;
    }

    public void setArLocked(Boolean arLocked) {
        this.arLocked = arLocked;
    }

    public Boolean getPayrollLocked() {
        return this.payrollLocked;
    }

    public void setPayrollLocked(Boolean payrollLocked) {
        this.payrollLocked = payrollLocked;
    }

    public Boolean getAllLocked() {
        return this.allLocked;
    }

    public void setAllLocked(Boolean allLocked) {
        this.allLocked = allLocked;
    }

    public Boolean getAllowNonGLChanges() {
        return this.allowNonGLChanges;
    }

    public void setAllowNonGLChanges(Boolean allowNonGLChanges) {
        this.allowNonGLChanges = allowNonGLChanges;
    }

    public String getInternalId() {
        return this.internalId;
    }

    public void setInternalId(String internalId) {
        this.internalId = internalId;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof AccountingPeriod)) {
            return false;
        }
        AccountingPeriod other = (AccountingPeriod)obj;
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
        boolean _equals = super.equals(obj) && (this.periodName == null && other.getPeriodName() == null || this.periodName != null && this.periodName.equals(other.getPeriodName())) && (this.parent == null && other.getParent() == null || this.parent != null && this.parent.equals(other.getParent())) && (this.startDate == null && other.getStartDate() == null || this.startDate != null && this.startDate.equals(other.getStartDate())) && (this.endDate == null && other.getEndDate() == null || this.endDate != null && this.endDate.equals(other.getEndDate())) && (this.fiscalCalendar == null && other.getFiscalCalendar() == null || this.fiscalCalendar != null && this.fiscalCalendar.equals(other.getFiscalCalendar())) && (this.closedOnDate == null && other.getClosedOnDate() == null || this.closedOnDate != null && this.closedOnDate.equals(other.getClosedOnDate())) && (this.isAdjust == null && other.getIsAdjust() == null || this.isAdjust != null && this.isAdjust.equals(other.getIsAdjust())) && (this.fiscalCalendarsList == null && other.getFiscalCalendarsList() == null || this.fiscalCalendarsList != null && this.fiscalCalendarsList.equals(other.getFiscalCalendarsList())) && (this.isQuarter == null && other.getIsQuarter() == null || this.isQuarter != null && this.isQuarter.equals(other.getIsQuarter())) && (this.isYear == null && other.getIsYear() == null || this.isYear != null && this.isYear.equals(other.getIsYear())) && (this.closed == null && other.getClosed() == null || this.closed != null && this.closed.equals(other.getClosed())) && (this.apLocked == null && other.getApLocked() == null || this.apLocked != null && this.apLocked.equals(other.getApLocked())) && (this.arLocked == null && other.getArLocked() == null || this.arLocked != null && this.arLocked.equals(other.getArLocked())) && (this.payrollLocked == null && other.getPayrollLocked() == null || this.payrollLocked != null && this.payrollLocked.equals(other.getPayrollLocked())) && (this.allLocked == null && other.getAllLocked() == null || this.allLocked != null && this.allLocked.equals(other.getAllLocked())) && (this.allowNonGLChanges == null && other.getAllowNonGLChanges() == null || this.allowNonGLChanges != null && this.allowNonGLChanges.equals(other.getAllowNonGLChanges())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId()));
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
        if (this.getPeriodName() != null) {
            _hashCode += this.getPeriodName().hashCode();
        }
        if (this.getParent() != null) {
            _hashCode += this.getParent().hashCode();
        }
        if (this.getStartDate() != null) {
            _hashCode += this.getStartDate().hashCode();
        }
        if (this.getEndDate() != null) {
            _hashCode += this.getEndDate().hashCode();
        }
        if (this.getFiscalCalendar() != null) {
            _hashCode += this.getFiscalCalendar().hashCode();
        }
        if (this.getClosedOnDate() != null) {
            _hashCode += this.getClosedOnDate().hashCode();
        }
        if (this.getIsAdjust() != null) {
            _hashCode += this.getIsAdjust().hashCode();
        }
        if (this.getFiscalCalendarsList() != null) {
            _hashCode += this.getFiscalCalendarsList().hashCode();
        }
        if (this.getIsQuarter() != null) {
            _hashCode += this.getIsQuarter().hashCode();
        }
        if (this.getIsYear() != null) {
            _hashCode += this.getIsYear().hashCode();
        }
        if (this.getClosed() != null) {
            _hashCode += this.getClosed().hashCode();
        }
        if (this.getApLocked() != null) {
            _hashCode += this.getApLocked().hashCode();
        }
        if (this.getArLocked() != null) {
            _hashCode += this.getArLocked().hashCode();
        }
        if (this.getPayrollLocked() != null) {
            _hashCode += this.getPayrollLocked().hashCode();
        }
        if (this.getAllLocked() != null) {
            _hashCode += this.getAllLocked().hashCode();
        }
        if (this.getAllowNonGLChanges() != null) {
            _hashCode += this.getAllowNonGLChanges().hashCode();
        }
        if (this.getInternalId() != null) {
            _hashCode += this.getInternalId().hashCode();
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
        typeDesc.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "AccountingPeriod"));
        AttributeDesc attrField = new AttributeDesc();
        attrField.setFieldName("internalId");
        attrField.setXmlName(new QName("", "internalId"));
        attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc((FieldDesc)attrField);
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("periodName");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "periodName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "parent"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "endDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fiscalCalendar");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "fiscalCalendar"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("closedOnDate");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "closedOnDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isAdjust");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "isAdjust"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fiscalCalendarsList");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "fiscalCalendarsList"));
        elemField.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "AccountingPeriodFiscalCalendarsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isQuarter");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "isQuarter"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isYear");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "isYear"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("closed");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "closed"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("apLocked");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "apLocked"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("arLocked");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "arLocked"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("payrollLocked");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "payrollLocked"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("allLocked");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "allLocked"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("allowNonGLChanges");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "allowNonGLChanges"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

