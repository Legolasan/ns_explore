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

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnBooleanField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnDateField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnSelectField;
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

public class AccountingPeriodSearchRowBasic
extends SearchRowBasic
implements Serializable {
    private SearchColumnBooleanField[] allLocked;
    private SearchColumnBooleanField[] allowNonGLChanges;
    private SearchColumnBooleanField[] apLocked;
    private SearchColumnBooleanField[] arLocked;
    private SearchColumnBooleanField[] closed;
    private SearchColumnDateField[] closedOnDate;
    private SearchColumnDateField[] endDate;
    private SearchColumnSelectField[] internalId;
    private SearchColumnBooleanField[] isAdjust;
    private SearchColumnBooleanField[] isInactive;
    private SearchColumnBooleanField[] isQuarter;
    private SearchColumnBooleanField[] isYear;
    private SearchColumnSelectField[] parent;
    private SearchColumnBooleanField[] payrollLocked;
    private SearchColumnStringField[] periodName;
    private SearchColumnDateField[] startDate;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(AccountingPeriodSearchRowBasic.class, true);

    public AccountingPeriodSearchRowBasic() {
    }

    public AccountingPeriodSearchRowBasic(SearchColumnBooleanField[] allLocked, SearchColumnBooleanField[] allowNonGLChanges, SearchColumnBooleanField[] apLocked, SearchColumnBooleanField[] arLocked, SearchColumnBooleanField[] closed, SearchColumnDateField[] closedOnDate, SearchColumnDateField[] endDate, SearchColumnSelectField[] internalId, SearchColumnBooleanField[] isAdjust, SearchColumnBooleanField[] isInactive, SearchColumnBooleanField[] isQuarter, SearchColumnBooleanField[] isYear, SearchColumnSelectField[] parent, SearchColumnBooleanField[] payrollLocked, SearchColumnStringField[] periodName, SearchColumnDateField[] startDate) {
        this.allLocked = allLocked;
        this.allowNonGLChanges = allowNonGLChanges;
        this.apLocked = apLocked;
        this.arLocked = arLocked;
        this.closed = closed;
        this.closedOnDate = closedOnDate;
        this.endDate = endDate;
        this.internalId = internalId;
        this.isAdjust = isAdjust;
        this.isInactive = isInactive;
        this.isQuarter = isQuarter;
        this.isYear = isYear;
        this.parent = parent;
        this.payrollLocked = payrollLocked;
        this.periodName = periodName;
        this.startDate = startDate;
    }

    public SearchColumnBooleanField[] getAllLocked() {
        return this.allLocked;
    }

    public void setAllLocked(SearchColumnBooleanField[] allLocked) {
        this.allLocked = allLocked;
    }

    public SearchColumnBooleanField getAllLocked(int i) {
        return this.allLocked[i];
    }

    public void setAllLocked(int i, SearchColumnBooleanField _value) {
        this.allLocked[i] = _value;
    }

    public SearchColumnBooleanField[] getAllowNonGLChanges() {
        return this.allowNonGLChanges;
    }

    public void setAllowNonGLChanges(SearchColumnBooleanField[] allowNonGLChanges) {
        this.allowNonGLChanges = allowNonGLChanges;
    }

    public SearchColumnBooleanField getAllowNonGLChanges(int i) {
        return this.allowNonGLChanges[i];
    }

    public void setAllowNonGLChanges(int i, SearchColumnBooleanField _value) {
        this.allowNonGLChanges[i] = _value;
    }

    public SearchColumnBooleanField[] getApLocked() {
        return this.apLocked;
    }

    public void setApLocked(SearchColumnBooleanField[] apLocked) {
        this.apLocked = apLocked;
    }

    public SearchColumnBooleanField getApLocked(int i) {
        return this.apLocked[i];
    }

    public void setApLocked(int i, SearchColumnBooleanField _value) {
        this.apLocked[i] = _value;
    }

    public SearchColumnBooleanField[] getArLocked() {
        return this.arLocked;
    }

    public void setArLocked(SearchColumnBooleanField[] arLocked) {
        this.arLocked = arLocked;
    }

    public SearchColumnBooleanField getArLocked(int i) {
        return this.arLocked[i];
    }

    public void setArLocked(int i, SearchColumnBooleanField _value) {
        this.arLocked[i] = _value;
    }

    public SearchColumnBooleanField[] getClosed() {
        return this.closed;
    }

    public void setClosed(SearchColumnBooleanField[] closed) {
        this.closed = closed;
    }

    public SearchColumnBooleanField getClosed(int i) {
        return this.closed[i];
    }

    public void setClosed(int i, SearchColumnBooleanField _value) {
        this.closed[i] = _value;
    }

    public SearchColumnDateField[] getClosedOnDate() {
        return this.closedOnDate;
    }

    public void setClosedOnDate(SearchColumnDateField[] closedOnDate) {
        this.closedOnDate = closedOnDate;
    }

    public SearchColumnDateField getClosedOnDate(int i) {
        return this.closedOnDate[i];
    }

    public void setClosedOnDate(int i, SearchColumnDateField _value) {
        this.closedOnDate[i] = _value;
    }

    public SearchColumnDateField[] getEndDate() {
        return this.endDate;
    }

    public void setEndDate(SearchColumnDateField[] endDate) {
        this.endDate = endDate;
    }

    public SearchColumnDateField getEndDate(int i) {
        return this.endDate[i];
    }

    public void setEndDate(int i, SearchColumnDateField _value) {
        this.endDate[i] = _value;
    }

    public SearchColumnSelectField[] getInternalId() {
        return this.internalId;
    }

    public void setInternalId(SearchColumnSelectField[] internalId) {
        this.internalId = internalId;
    }

    public SearchColumnSelectField getInternalId(int i) {
        return this.internalId[i];
    }

    public void setInternalId(int i, SearchColumnSelectField _value) {
        this.internalId[i] = _value;
    }

    public SearchColumnBooleanField[] getIsAdjust() {
        return this.isAdjust;
    }

    public void setIsAdjust(SearchColumnBooleanField[] isAdjust) {
        this.isAdjust = isAdjust;
    }

    public SearchColumnBooleanField getIsAdjust(int i) {
        return this.isAdjust[i];
    }

    public void setIsAdjust(int i, SearchColumnBooleanField _value) {
        this.isAdjust[i] = _value;
    }

    public SearchColumnBooleanField[] getIsInactive() {
        return this.isInactive;
    }

    public void setIsInactive(SearchColumnBooleanField[] isInactive) {
        this.isInactive = isInactive;
    }

    public SearchColumnBooleanField getIsInactive(int i) {
        return this.isInactive[i];
    }

    public void setIsInactive(int i, SearchColumnBooleanField _value) {
        this.isInactive[i] = _value;
    }

    public SearchColumnBooleanField[] getIsQuarter() {
        return this.isQuarter;
    }

    public void setIsQuarter(SearchColumnBooleanField[] isQuarter) {
        this.isQuarter = isQuarter;
    }

    public SearchColumnBooleanField getIsQuarter(int i) {
        return this.isQuarter[i];
    }

    public void setIsQuarter(int i, SearchColumnBooleanField _value) {
        this.isQuarter[i] = _value;
    }

    public SearchColumnBooleanField[] getIsYear() {
        return this.isYear;
    }

    public void setIsYear(SearchColumnBooleanField[] isYear) {
        this.isYear = isYear;
    }

    public SearchColumnBooleanField getIsYear(int i) {
        return this.isYear[i];
    }

    public void setIsYear(int i, SearchColumnBooleanField _value) {
        this.isYear[i] = _value;
    }

    public SearchColumnSelectField[] getParent() {
        return this.parent;
    }

    public void setParent(SearchColumnSelectField[] parent) {
        this.parent = parent;
    }

    public SearchColumnSelectField getParent(int i) {
        return this.parent[i];
    }

    public void setParent(int i, SearchColumnSelectField _value) {
        this.parent[i] = _value;
    }

    public SearchColumnBooleanField[] getPayrollLocked() {
        return this.payrollLocked;
    }

    public void setPayrollLocked(SearchColumnBooleanField[] payrollLocked) {
        this.payrollLocked = payrollLocked;
    }

    public SearchColumnBooleanField getPayrollLocked(int i) {
        return this.payrollLocked[i];
    }

    public void setPayrollLocked(int i, SearchColumnBooleanField _value) {
        this.payrollLocked[i] = _value;
    }

    public SearchColumnStringField[] getPeriodName() {
        return this.periodName;
    }

    public void setPeriodName(SearchColumnStringField[] periodName) {
        this.periodName = periodName;
    }

    public SearchColumnStringField getPeriodName(int i) {
        return this.periodName[i];
    }

    public void setPeriodName(int i, SearchColumnStringField _value) {
        this.periodName[i] = _value;
    }

    public SearchColumnDateField[] getStartDate() {
        return this.startDate;
    }

    public void setStartDate(SearchColumnDateField[] startDate) {
        this.startDate = startDate;
    }

    public SearchColumnDateField getStartDate(int i) {
        return this.startDate[i];
    }

    public void setStartDate(int i, SearchColumnDateField _value) {
        this.startDate[i] = _value;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof AccountingPeriodSearchRowBasic)) {
            return false;
        }
        AccountingPeriodSearchRowBasic other = (AccountingPeriodSearchRowBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.allLocked == null && other.getAllLocked() == null || this.allLocked != null && Arrays.equals(this.allLocked, other.getAllLocked())) && (this.allowNonGLChanges == null && other.getAllowNonGLChanges() == null || this.allowNonGLChanges != null && Arrays.equals(this.allowNonGLChanges, other.getAllowNonGLChanges())) && (this.apLocked == null && other.getApLocked() == null || this.apLocked != null && Arrays.equals(this.apLocked, other.getApLocked())) && (this.arLocked == null && other.getArLocked() == null || this.arLocked != null && Arrays.equals(this.arLocked, other.getArLocked())) && (this.closed == null && other.getClosed() == null || this.closed != null && Arrays.equals(this.closed, other.getClosed())) && (this.closedOnDate == null && other.getClosedOnDate() == null || this.closedOnDate != null && Arrays.equals(this.closedOnDate, other.getClosedOnDate())) && (this.endDate == null && other.getEndDate() == null || this.endDate != null && Arrays.equals(this.endDate, other.getEndDate())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && Arrays.equals(this.internalId, other.getInternalId())) && (this.isAdjust == null && other.getIsAdjust() == null || this.isAdjust != null && Arrays.equals(this.isAdjust, other.getIsAdjust())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && Arrays.equals(this.isInactive, other.getIsInactive())) && (this.isQuarter == null && other.getIsQuarter() == null || this.isQuarter != null && Arrays.equals(this.isQuarter, other.getIsQuarter())) && (this.isYear == null && other.getIsYear() == null || this.isYear != null && Arrays.equals(this.isYear, other.getIsYear())) && (this.parent == null && other.getParent() == null || this.parent != null && Arrays.equals(this.parent, other.getParent())) && (this.payrollLocked == null && other.getPayrollLocked() == null || this.payrollLocked != null && Arrays.equals(this.payrollLocked, other.getPayrollLocked())) && (this.periodName == null && other.getPeriodName() == null || this.periodName != null && Arrays.equals(this.periodName, other.getPeriodName())) && (this.startDate == null && other.getStartDate() == null || this.startDate != null && Arrays.equals(this.startDate, other.getStartDate()));
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
        if (this.getAllLocked() != null) {
            for (i = 0; i < Array.getLength(this.getAllLocked()); ++i) {
                obj = Array.get(this.getAllLocked(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAllowNonGLChanges() != null) {
            for (i = 0; i < Array.getLength(this.getAllowNonGLChanges()); ++i) {
                obj = Array.get(this.getAllowNonGLChanges(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getApLocked() != null) {
            for (i = 0; i < Array.getLength(this.getApLocked()); ++i) {
                obj = Array.get(this.getApLocked(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getArLocked() != null) {
            for (i = 0; i < Array.getLength(this.getArLocked()); ++i) {
                obj = Array.get(this.getArLocked(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getClosed() != null) {
            for (i = 0; i < Array.getLength(this.getClosed()); ++i) {
                obj = Array.get(this.getClosed(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getClosedOnDate() != null) {
            for (i = 0; i < Array.getLength(this.getClosedOnDate()); ++i) {
                obj = Array.get(this.getClosedOnDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getEndDate() != null) {
            for (i = 0; i < Array.getLength(this.getEndDate()); ++i) {
                obj = Array.get(this.getEndDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getInternalId() != null) {
            for (i = 0; i < Array.getLength(this.getInternalId()); ++i) {
                obj = Array.get(this.getInternalId(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsAdjust() != null) {
            for (i = 0; i < Array.getLength(this.getIsAdjust()); ++i) {
                obj = Array.get(this.getIsAdjust(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsInactive() != null) {
            for (i = 0; i < Array.getLength(this.getIsInactive()); ++i) {
                obj = Array.get(this.getIsInactive(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsQuarter() != null) {
            for (i = 0; i < Array.getLength(this.getIsQuarter()); ++i) {
                obj = Array.get(this.getIsQuarter(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsYear() != null) {
            for (i = 0; i < Array.getLength(this.getIsYear()); ++i) {
                obj = Array.get(this.getIsYear(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getParent() != null) {
            for (i = 0; i < Array.getLength(this.getParent()); ++i) {
                obj = Array.get(this.getParent(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPayrollLocked() != null) {
            for (i = 0; i < Array.getLength(this.getPayrollLocked()); ++i) {
                obj = Array.get(this.getPayrollLocked(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPeriodName() != null) {
            for (i = 0; i < Array.getLength(this.getPeriodName()); ++i) {
                obj = Array.get(this.getPeriodName(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getStartDate() != null) {
            for (i = 0; i < Array.getLength(this.getStartDate()); ++i) {
                obj = Array.get(this.getStartDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "AccountingPeriodSearchRowBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("allLocked");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "allLocked"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("allowNonGLChanges");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "allowNonGLChanges"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("apLocked");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "apLocked"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("arLocked");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "arLocked"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("closed");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "closed"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("closedOnDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "closedOnDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "endDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isAdjust");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isAdjust"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isQuarter");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isQuarter"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isYear");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isYear"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "parent"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("payrollLocked");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "payrollLocked"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("periodName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "periodName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

