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
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnCustomFieldList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnDateField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnEnumSelectField;
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

public class BillingAccountSearchRowBasic
extends SearchRowBasic
implements Serializable {
    private SearchColumnSelectField[] billingSchedule;
    private SearchColumnSelectField[] cashSaleForm;
    private SearchColumnSelectField[] _class;
    private SearchColumnSelectField[] currency;
    private SearchColumnSelectField[] customer;
    private SearchColumnBooleanField[] customerDefault;
    private SearchColumnDateField[] dateCreated;
    private SearchColumnSelectField[] department;
    private SearchColumnSelectField[] externalId;
    private SearchColumnEnumSelectField[] frequency;
    private SearchColumnStringField[] idNumber;
    private SearchColumnBooleanField[] inactive;
    private SearchColumnSelectField[] internalId;
    private SearchColumnSelectField[] invoiceForm;
    private SearchColumnDateField[] lastBillCycleDate;
    private SearchColumnDateField[] lastBillDate;
    private SearchColumnSelectField[] location;
    private SearchColumnStringField[] memo;
    private SearchColumnStringField[] name;
    private SearchColumnDateField[] nextBillCycleDate;
    private SearchColumnDateField[] startDate;
    private SearchColumnSelectField[] subsidiary;
    private SearchColumnCustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(BillingAccountSearchRowBasic.class, true);

    public BillingAccountSearchRowBasic() {
    }

    public BillingAccountSearchRowBasic(SearchColumnSelectField[] billingSchedule, SearchColumnSelectField[] cashSaleForm, SearchColumnSelectField[] _class, SearchColumnSelectField[] currency, SearchColumnSelectField[] customer, SearchColumnBooleanField[] customerDefault, SearchColumnDateField[] dateCreated, SearchColumnSelectField[] department, SearchColumnSelectField[] externalId, SearchColumnEnumSelectField[] frequency, SearchColumnStringField[] idNumber, SearchColumnBooleanField[] inactive, SearchColumnSelectField[] internalId, SearchColumnSelectField[] invoiceForm, SearchColumnDateField[] lastBillCycleDate, SearchColumnDateField[] lastBillDate, SearchColumnSelectField[] location, SearchColumnStringField[] memo, SearchColumnStringField[] name, SearchColumnDateField[] nextBillCycleDate, SearchColumnDateField[] startDate, SearchColumnSelectField[] subsidiary, SearchColumnCustomFieldList customFieldList) {
        this.billingSchedule = billingSchedule;
        this.cashSaleForm = cashSaleForm;
        this._class = _class;
        this.currency = currency;
        this.customer = customer;
        this.customerDefault = customerDefault;
        this.dateCreated = dateCreated;
        this.department = department;
        this.externalId = externalId;
        this.frequency = frequency;
        this.idNumber = idNumber;
        this.inactive = inactive;
        this.internalId = internalId;
        this.invoiceForm = invoiceForm;
        this.lastBillCycleDate = lastBillCycleDate;
        this.lastBillDate = lastBillDate;
        this.location = location;
        this.memo = memo;
        this.name = name;
        this.nextBillCycleDate = nextBillCycleDate;
        this.startDate = startDate;
        this.subsidiary = subsidiary;
        this.customFieldList = customFieldList;
    }

    public SearchColumnSelectField[] getBillingSchedule() {
        return this.billingSchedule;
    }

    public void setBillingSchedule(SearchColumnSelectField[] billingSchedule) {
        this.billingSchedule = billingSchedule;
    }

    public SearchColumnSelectField getBillingSchedule(int i) {
        return this.billingSchedule[i];
    }

    public void setBillingSchedule(int i, SearchColumnSelectField _value) {
        this.billingSchedule[i] = _value;
    }

    public SearchColumnSelectField[] getCashSaleForm() {
        return this.cashSaleForm;
    }

    public void setCashSaleForm(SearchColumnSelectField[] cashSaleForm) {
        this.cashSaleForm = cashSaleForm;
    }

    public SearchColumnSelectField getCashSaleForm(int i) {
        return this.cashSaleForm[i];
    }

    public void setCashSaleForm(int i, SearchColumnSelectField _value) {
        this.cashSaleForm[i] = _value;
    }

    public SearchColumnSelectField[] get_class() {
        return this._class;
    }

    public void set_class(SearchColumnSelectField[] _class) {
        this._class = _class;
    }

    public SearchColumnSelectField get_class(int i) {
        return this._class[i];
    }

    public void set_class(int i, SearchColumnSelectField _value) {
        this._class[i] = _value;
    }

    public SearchColumnSelectField[] getCurrency() {
        return this.currency;
    }

    public void setCurrency(SearchColumnSelectField[] currency) {
        this.currency = currency;
    }

    public SearchColumnSelectField getCurrency(int i) {
        return this.currency[i];
    }

    public void setCurrency(int i, SearchColumnSelectField _value) {
        this.currency[i] = _value;
    }

    public SearchColumnSelectField[] getCustomer() {
        return this.customer;
    }

    public void setCustomer(SearchColumnSelectField[] customer) {
        this.customer = customer;
    }

    public SearchColumnSelectField getCustomer(int i) {
        return this.customer[i];
    }

    public void setCustomer(int i, SearchColumnSelectField _value) {
        this.customer[i] = _value;
    }

    public SearchColumnBooleanField[] getCustomerDefault() {
        return this.customerDefault;
    }

    public void setCustomerDefault(SearchColumnBooleanField[] customerDefault) {
        this.customerDefault = customerDefault;
    }

    public SearchColumnBooleanField getCustomerDefault(int i) {
        return this.customerDefault[i];
    }

    public void setCustomerDefault(int i, SearchColumnBooleanField _value) {
        this.customerDefault[i] = _value;
    }

    public SearchColumnDateField[] getDateCreated() {
        return this.dateCreated;
    }

    public void setDateCreated(SearchColumnDateField[] dateCreated) {
        this.dateCreated = dateCreated;
    }

    public SearchColumnDateField getDateCreated(int i) {
        return this.dateCreated[i];
    }

    public void setDateCreated(int i, SearchColumnDateField _value) {
        this.dateCreated[i] = _value;
    }

    public SearchColumnSelectField[] getDepartment() {
        return this.department;
    }

    public void setDepartment(SearchColumnSelectField[] department) {
        this.department = department;
    }

    public SearchColumnSelectField getDepartment(int i) {
        return this.department[i];
    }

    public void setDepartment(int i, SearchColumnSelectField _value) {
        this.department[i] = _value;
    }

    public SearchColumnSelectField[] getExternalId() {
        return this.externalId;
    }

    public void setExternalId(SearchColumnSelectField[] externalId) {
        this.externalId = externalId;
    }

    public SearchColumnSelectField getExternalId(int i) {
        return this.externalId[i];
    }

    public void setExternalId(int i, SearchColumnSelectField _value) {
        this.externalId[i] = _value;
    }

    public SearchColumnEnumSelectField[] getFrequency() {
        return this.frequency;
    }

    public void setFrequency(SearchColumnEnumSelectField[] frequency) {
        this.frequency = frequency;
    }

    public SearchColumnEnumSelectField getFrequency(int i) {
        return this.frequency[i];
    }

    public void setFrequency(int i, SearchColumnEnumSelectField _value) {
        this.frequency[i] = _value;
    }

    public SearchColumnStringField[] getIdNumber() {
        return this.idNumber;
    }

    public void setIdNumber(SearchColumnStringField[] idNumber) {
        this.idNumber = idNumber;
    }

    public SearchColumnStringField getIdNumber(int i) {
        return this.idNumber[i];
    }

    public void setIdNumber(int i, SearchColumnStringField _value) {
        this.idNumber[i] = _value;
    }

    public SearchColumnBooleanField[] getInactive() {
        return this.inactive;
    }

    public void setInactive(SearchColumnBooleanField[] inactive) {
        this.inactive = inactive;
    }

    public SearchColumnBooleanField getInactive(int i) {
        return this.inactive[i];
    }

    public void setInactive(int i, SearchColumnBooleanField _value) {
        this.inactive[i] = _value;
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

    public SearchColumnSelectField[] getInvoiceForm() {
        return this.invoiceForm;
    }

    public void setInvoiceForm(SearchColumnSelectField[] invoiceForm) {
        this.invoiceForm = invoiceForm;
    }

    public SearchColumnSelectField getInvoiceForm(int i) {
        return this.invoiceForm[i];
    }

    public void setInvoiceForm(int i, SearchColumnSelectField _value) {
        this.invoiceForm[i] = _value;
    }

    public SearchColumnDateField[] getLastBillCycleDate() {
        return this.lastBillCycleDate;
    }

    public void setLastBillCycleDate(SearchColumnDateField[] lastBillCycleDate) {
        this.lastBillCycleDate = lastBillCycleDate;
    }

    public SearchColumnDateField getLastBillCycleDate(int i) {
        return this.lastBillCycleDate[i];
    }

    public void setLastBillCycleDate(int i, SearchColumnDateField _value) {
        this.lastBillCycleDate[i] = _value;
    }

    public SearchColumnDateField[] getLastBillDate() {
        return this.lastBillDate;
    }

    public void setLastBillDate(SearchColumnDateField[] lastBillDate) {
        this.lastBillDate = lastBillDate;
    }

    public SearchColumnDateField getLastBillDate(int i) {
        return this.lastBillDate[i];
    }

    public void setLastBillDate(int i, SearchColumnDateField _value) {
        this.lastBillDate[i] = _value;
    }

    public SearchColumnSelectField[] getLocation() {
        return this.location;
    }

    public void setLocation(SearchColumnSelectField[] location) {
        this.location = location;
    }

    public SearchColumnSelectField getLocation(int i) {
        return this.location[i];
    }

    public void setLocation(int i, SearchColumnSelectField _value) {
        this.location[i] = _value;
    }

    public SearchColumnStringField[] getMemo() {
        return this.memo;
    }

    public void setMemo(SearchColumnStringField[] memo) {
        this.memo = memo;
    }

    public SearchColumnStringField getMemo(int i) {
        return this.memo[i];
    }

    public void setMemo(int i, SearchColumnStringField _value) {
        this.memo[i] = _value;
    }

    public SearchColumnStringField[] getName() {
        return this.name;
    }

    public void setName(SearchColumnStringField[] name) {
        this.name = name;
    }

    public SearchColumnStringField getName(int i) {
        return this.name[i];
    }

    public void setName(int i, SearchColumnStringField _value) {
        this.name[i] = _value;
    }

    public SearchColumnDateField[] getNextBillCycleDate() {
        return this.nextBillCycleDate;
    }

    public void setNextBillCycleDate(SearchColumnDateField[] nextBillCycleDate) {
        this.nextBillCycleDate = nextBillCycleDate;
    }

    public SearchColumnDateField getNextBillCycleDate(int i) {
        return this.nextBillCycleDate[i];
    }

    public void setNextBillCycleDate(int i, SearchColumnDateField _value) {
        this.nextBillCycleDate[i] = _value;
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

    public SearchColumnSelectField[] getSubsidiary() {
        return this.subsidiary;
    }

    public void setSubsidiary(SearchColumnSelectField[] subsidiary) {
        this.subsidiary = subsidiary;
    }

    public SearchColumnSelectField getSubsidiary(int i) {
        return this.subsidiary[i];
    }

    public void setSubsidiary(int i, SearchColumnSelectField _value) {
        this.subsidiary[i] = _value;
    }

    public SearchColumnCustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof BillingAccountSearchRowBasic)) {
            return false;
        }
        BillingAccountSearchRowBasic other = (BillingAccountSearchRowBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.billingSchedule == null && other.getBillingSchedule() == null || this.billingSchedule != null && Arrays.equals(this.billingSchedule, other.getBillingSchedule())) && (this.cashSaleForm == null && other.getCashSaleForm() == null || this.cashSaleForm != null && Arrays.equals(this.cashSaleForm, other.getCashSaleForm())) && (this._class == null && other.get_class() == null || this._class != null && Arrays.equals(this._class, other.get_class())) && (this.currency == null && other.getCurrency() == null || this.currency != null && Arrays.equals(this.currency, other.getCurrency())) && (this.customer == null && other.getCustomer() == null || this.customer != null && Arrays.equals(this.customer, other.getCustomer())) && (this.customerDefault == null && other.getCustomerDefault() == null || this.customerDefault != null && Arrays.equals(this.customerDefault, other.getCustomerDefault())) && (this.dateCreated == null && other.getDateCreated() == null || this.dateCreated != null && Arrays.equals(this.dateCreated, other.getDateCreated())) && (this.department == null && other.getDepartment() == null || this.department != null && Arrays.equals(this.department, other.getDepartment())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && Arrays.equals(this.externalId, other.getExternalId())) && (this.frequency == null && other.getFrequency() == null || this.frequency != null && Arrays.equals(this.frequency, other.getFrequency())) && (this.idNumber == null && other.getIdNumber() == null || this.idNumber != null && Arrays.equals(this.idNumber, other.getIdNumber())) && (this.inactive == null && other.getInactive() == null || this.inactive != null && Arrays.equals(this.inactive, other.getInactive())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && Arrays.equals(this.internalId, other.getInternalId())) && (this.invoiceForm == null && other.getInvoiceForm() == null || this.invoiceForm != null && Arrays.equals(this.invoiceForm, other.getInvoiceForm())) && (this.lastBillCycleDate == null && other.getLastBillCycleDate() == null || this.lastBillCycleDate != null && Arrays.equals(this.lastBillCycleDate, other.getLastBillCycleDate())) && (this.lastBillDate == null && other.getLastBillDate() == null || this.lastBillDate != null && Arrays.equals(this.lastBillDate, other.getLastBillDate())) && (this.location == null && other.getLocation() == null || this.location != null && Arrays.equals(this.location, other.getLocation())) && (this.memo == null && other.getMemo() == null || this.memo != null && Arrays.equals(this.memo, other.getMemo())) && (this.name == null && other.getName() == null || this.name != null && Arrays.equals(this.name, other.getName())) && (this.nextBillCycleDate == null && other.getNextBillCycleDate() == null || this.nextBillCycleDate != null && Arrays.equals(this.nextBillCycleDate, other.getNextBillCycleDate())) && (this.startDate == null && other.getStartDate() == null || this.startDate != null && Arrays.equals(this.startDate, other.getStartDate())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && Arrays.equals(this.subsidiary, other.getSubsidiary())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
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
        if (this.getBillingSchedule() != null) {
            for (i = 0; i < Array.getLength(this.getBillingSchedule()); ++i) {
                obj = Array.get(this.getBillingSchedule(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCashSaleForm() != null) {
            for (i = 0; i < Array.getLength(this.getCashSaleForm()); ++i) {
                obj = Array.get(this.getCashSaleForm(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.get_class() != null) {
            for (i = 0; i < Array.getLength(this.get_class()); ++i) {
                obj = Array.get(this.get_class(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCurrency() != null) {
            for (i = 0; i < Array.getLength(this.getCurrency()); ++i) {
                obj = Array.get(this.getCurrency(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCustomer() != null) {
            for (i = 0; i < Array.getLength(this.getCustomer()); ++i) {
                obj = Array.get(this.getCustomer(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCustomerDefault() != null) {
            for (i = 0; i < Array.getLength(this.getCustomerDefault()); ++i) {
                obj = Array.get(this.getCustomerDefault(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDateCreated() != null) {
            for (i = 0; i < Array.getLength(this.getDateCreated()); ++i) {
                obj = Array.get(this.getDateCreated(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDepartment() != null) {
            for (i = 0; i < Array.getLength(this.getDepartment()); ++i) {
                obj = Array.get(this.getDepartment(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getExternalId() != null) {
            for (i = 0; i < Array.getLength(this.getExternalId()); ++i) {
                obj = Array.get(this.getExternalId(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getFrequency() != null) {
            for (i = 0; i < Array.getLength(this.getFrequency()); ++i) {
                obj = Array.get(this.getFrequency(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIdNumber() != null) {
            for (i = 0; i < Array.getLength(this.getIdNumber()); ++i) {
                obj = Array.get(this.getIdNumber(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getInactive() != null) {
            for (i = 0; i < Array.getLength(this.getInactive()); ++i) {
                obj = Array.get(this.getInactive(), i);
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
        if (this.getInvoiceForm() != null) {
            for (i = 0; i < Array.getLength(this.getInvoiceForm()); ++i) {
                obj = Array.get(this.getInvoiceForm(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLastBillCycleDate() != null) {
            for (i = 0; i < Array.getLength(this.getLastBillCycleDate()); ++i) {
                obj = Array.get(this.getLastBillCycleDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLastBillDate() != null) {
            for (i = 0; i < Array.getLength(this.getLastBillDate()); ++i) {
                obj = Array.get(this.getLastBillDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLocation() != null) {
            for (i = 0; i < Array.getLength(this.getLocation()); ++i) {
                obj = Array.get(this.getLocation(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getMemo() != null) {
            for (i = 0; i < Array.getLength(this.getMemo()); ++i) {
                obj = Array.get(this.getMemo(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getName() != null) {
            for (i = 0; i < Array.getLength(this.getName()); ++i) {
                obj = Array.get(this.getName(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getNextBillCycleDate() != null) {
            for (i = 0; i < Array.getLength(this.getNextBillCycleDate()); ++i) {
                obj = Array.get(this.getNextBillCycleDate(), i);
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
        if (this.getSubsidiary() != null) {
            for (i = 0; i < Array.getLength(this.getSubsidiary()); ++i) {
                obj = Array.get(this.getSubsidiary(), i);
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "BillingAccountSearchRowBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("billingSchedule");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billingSchedule"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("cashSaleForm");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "cashSaleForm"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "class"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customer");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "customer"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customerDefault");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "customerDefault"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("dateCreated");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "dateCreated"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "department"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "externalId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("frequency");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "frequency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("idNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "idNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("inactive");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "inactive"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
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
        elemField.setFieldName("invoiceForm");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "invoiceForm"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastBillCycleDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lastBillCycleDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastBillDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lastBillDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "location"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "name"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("nextBillCycleDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "nextBillCycleDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
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
        elemField = new ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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

