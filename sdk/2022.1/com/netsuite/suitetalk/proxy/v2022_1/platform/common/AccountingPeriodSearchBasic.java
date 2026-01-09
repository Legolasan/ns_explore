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

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchBooleanField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchDateField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchLongField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchMultiSelectField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchRecordBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchStringField;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class AccountingPeriodSearchBasic
extends SearchRecordBasic
implements Serializable {
    private SearchBooleanField allLocked;
    private SearchBooleanField allowNonGlChanges;
    private SearchBooleanField apLocked;
    private SearchBooleanField arLocked;
    private SearchBooleanField closed;
    private SearchDateField closedOnDate;
    private SearchDateField endDate;
    private SearchMultiSelectField internalId;
    private SearchLongField internalIdNumber;
    private SearchBooleanField isAdjust;
    private SearchBooleanField isInactive;
    private SearchBooleanField isQuarter;
    private SearchBooleanField isYear;
    private SearchMultiSelectField parent;
    private SearchBooleanField payrollLocked;
    private SearchStringField periodName;
    private SearchDateField startDate;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(AccountingPeriodSearchBasic.class, true);

    public AccountingPeriodSearchBasic() {
    }

    public AccountingPeriodSearchBasic(SearchBooleanField allLocked, SearchBooleanField allowNonGlChanges, SearchBooleanField apLocked, SearchBooleanField arLocked, SearchBooleanField closed, SearchDateField closedOnDate, SearchDateField endDate, SearchMultiSelectField internalId, SearchLongField internalIdNumber, SearchBooleanField isAdjust, SearchBooleanField isInactive, SearchBooleanField isQuarter, SearchBooleanField isYear, SearchMultiSelectField parent, SearchBooleanField payrollLocked, SearchStringField periodName, SearchDateField startDate) {
        this.allLocked = allLocked;
        this.allowNonGlChanges = allowNonGlChanges;
        this.apLocked = apLocked;
        this.arLocked = arLocked;
        this.closed = closed;
        this.closedOnDate = closedOnDate;
        this.endDate = endDate;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isAdjust = isAdjust;
        this.isInactive = isInactive;
        this.isQuarter = isQuarter;
        this.isYear = isYear;
        this.parent = parent;
        this.payrollLocked = payrollLocked;
        this.periodName = periodName;
        this.startDate = startDate;
    }

    public SearchBooleanField getAllLocked() {
        return this.allLocked;
    }

    public void setAllLocked(SearchBooleanField allLocked) {
        this.allLocked = allLocked;
    }

    public SearchBooleanField getAllowNonGlChanges() {
        return this.allowNonGlChanges;
    }

    public void setAllowNonGlChanges(SearchBooleanField allowNonGlChanges) {
        this.allowNonGlChanges = allowNonGlChanges;
    }

    public SearchBooleanField getApLocked() {
        return this.apLocked;
    }

    public void setApLocked(SearchBooleanField apLocked) {
        this.apLocked = apLocked;
    }

    public SearchBooleanField getArLocked() {
        return this.arLocked;
    }

    public void setArLocked(SearchBooleanField arLocked) {
        this.arLocked = arLocked;
    }

    public SearchBooleanField getClosed() {
        return this.closed;
    }

    public void setClosed(SearchBooleanField closed) {
        this.closed = closed;
    }

    public SearchDateField getClosedOnDate() {
        return this.closedOnDate;
    }

    public void setClosedOnDate(SearchDateField closedOnDate) {
        this.closedOnDate = closedOnDate;
    }

    public SearchDateField getEndDate() {
        return this.endDate;
    }

    public void setEndDate(SearchDateField endDate) {
        this.endDate = endDate;
    }

    public SearchMultiSelectField getInternalId() {
        return this.internalId;
    }

    public void setInternalId(SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }

    public SearchLongField getInternalIdNumber() {
        return this.internalIdNumber;
    }

    public void setInternalIdNumber(SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }

    public SearchBooleanField getIsAdjust() {
        return this.isAdjust;
    }

    public void setIsAdjust(SearchBooleanField isAdjust) {
        this.isAdjust = isAdjust;
    }

    public SearchBooleanField getIsInactive() {
        return this.isInactive;
    }

    public void setIsInactive(SearchBooleanField isInactive) {
        this.isInactive = isInactive;
    }

    public SearchBooleanField getIsQuarter() {
        return this.isQuarter;
    }

    public void setIsQuarter(SearchBooleanField isQuarter) {
        this.isQuarter = isQuarter;
    }

    public SearchBooleanField getIsYear() {
        return this.isYear;
    }

    public void setIsYear(SearchBooleanField isYear) {
        this.isYear = isYear;
    }

    public SearchMultiSelectField getParent() {
        return this.parent;
    }

    public void setParent(SearchMultiSelectField parent) {
        this.parent = parent;
    }

    public SearchBooleanField getPayrollLocked() {
        return this.payrollLocked;
    }

    public void setPayrollLocked(SearchBooleanField payrollLocked) {
        this.payrollLocked = payrollLocked;
    }

    public SearchStringField getPeriodName() {
        return this.periodName;
    }

    public void setPeriodName(SearchStringField periodName) {
        this.periodName = periodName;
    }

    public SearchDateField getStartDate() {
        return this.startDate;
    }

    public void setStartDate(SearchDateField startDate) {
        this.startDate = startDate;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof AccountingPeriodSearchBasic)) {
            return false;
        }
        AccountingPeriodSearchBasic other = (AccountingPeriodSearchBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.allLocked == null && other.getAllLocked() == null || this.allLocked != null && this.allLocked.equals(other.getAllLocked())) && (this.allowNonGlChanges == null && other.getAllowNonGlChanges() == null || this.allowNonGlChanges != null && this.allowNonGlChanges.equals(other.getAllowNonGlChanges())) && (this.apLocked == null && other.getApLocked() == null || this.apLocked != null && this.apLocked.equals(other.getApLocked())) && (this.arLocked == null && other.getArLocked() == null || this.arLocked != null && this.arLocked.equals(other.getArLocked())) && (this.closed == null && other.getClosed() == null || this.closed != null && this.closed.equals(other.getClosed())) && (this.closedOnDate == null && other.getClosedOnDate() == null || this.closedOnDate != null && this.closedOnDate.equals(other.getClosedOnDate())) && (this.endDate == null && other.getEndDate() == null || this.endDate != null && this.endDate.equals(other.getEndDate())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.internalIdNumber == null && other.getInternalIdNumber() == null || this.internalIdNumber != null && this.internalIdNumber.equals(other.getInternalIdNumber())) && (this.isAdjust == null && other.getIsAdjust() == null || this.isAdjust != null && this.isAdjust.equals(other.getIsAdjust())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && this.isInactive.equals(other.getIsInactive())) && (this.isQuarter == null && other.getIsQuarter() == null || this.isQuarter != null && this.isQuarter.equals(other.getIsQuarter())) && (this.isYear == null && other.getIsYear() == null || this.isYear != null && this.isYear.equals(other.getIsYear())) && (this.parent == null && other.getParent() == null || this.parent != null && this.parent.equals(other.getParent())) && (this.payrollLocked == null && other.getPayrollLocked() == null || this.payrollLocked != null && this.payrollLocked.equals(other.getPayrollLocked())) && (this.periodName == null && other.getPeriodName() == null || this.periodName != null && this.periodName.equals(other.getPeriodName())) && (this.startDate == null && other.getStartDate() == null || this.startDate != null && this.startDate.equals(other.getStartDate()));
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
        if (this.getAllLocked() != null) {
            _hashCode += this.getAllLocked().hashCode();
        }
        if (this.getAllowNonGlChanges() != null) {
            _hashCode += this.getAllowNonGlChanges().hashCode();
        }
        if (this.getApLocked() != null) {
            _hashCode += this.getApLocked().hashCode();
        }
        if (this.getArLocked() != null) {
            _hashCode += this.getArLocked().hashCode();
        }
        if (this.getClosed() != null) {
            _hashCode += this.getClosed().hashCode();
        }
        if (this.getClosedOnDate() != null) {
            _hashCode += this.getClosedOnDate().hashCode();
        }
        if (this.getEndDate() != null) {
            _hashCode += this.getEndDate().hashCode();
        }
        if (this.getInternalId() != null) {
            _hashCode += this.getInternalId().hashCode();
        }
        if (this.getInternalIdNumber() != null) {
            _hashCode += this.getInternalIdNumber().hashCode();
        }
        if (this.getIsAdjust() != null) {
            _hashCode += this.getIsAdjust().hashCode();
        }
        if (this.getIsInactive() != null) {
            _hashCode += this.getIsInactive().hashCode();
        }
        if (this.getIsQuarter() != null) {
            _hashCode += this.getIsQuarter().hashCode();
        }
        if (this.getIsYear() != null) {
            _hashCode += this.getIsYear().hashCode();
        }
        if (this.getParent() != null) {
            _hashCode += this.getParent().hashCode();
        }
        if (this.getPayrollLocked() != null) {
            _hashCode += this.getPayrollLocked().hashCode();
        }
        if (this.getPeriodName() != null) {
            _hashCode += this.getPeriodName().hashCode();
        }
        if (this.getStartDate() != null) {
            _hashCode += this.getStartDate().hashCode();
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "AccountingPeriodSearchBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("allLocked");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "allLocked"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("allowNonGlChanges");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "allowNonGlChanges"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("apLocked");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "apLocked"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("arLocked");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "arLocked"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("closed");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "closed"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("closedOnDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "closedOnDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "endDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("internalIdNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "internalIdNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isAdjust");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isAdjust"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isQuarter");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isQuarter"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isYear");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isYear"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "parent"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("payrollLocked");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "payrollLocked"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("periodName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "periodName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

