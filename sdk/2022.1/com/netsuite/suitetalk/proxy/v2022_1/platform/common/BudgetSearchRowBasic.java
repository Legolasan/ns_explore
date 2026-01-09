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
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnDoubleField;
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

public class BudgetSearchRowBasic
extends SearchRowBasic
implements Serializable {
    private SearchColumnStringField[] account;
    private SearchColumnStringField[] accountingBook;
    private SearchColumnDoubleField[] amount;
    private SearchColumnStringField[] category;
    private SearchColumnStringField[] _class;
    private SearchColumnStringField[] classnohierarchy;
    private SearchColumnStringField[] currency;
    private SearchColumnStringField[] customer;
    private SearchColumnStringField[] department;
    private SearchColumnStringField[] departmentnohierarchy;
    private SearchColumnBooleanField[] global;
    private SearchColumnSelectField[] internalId;
    private SearchColumnStringField[] item;
    private SearchColumnStringField[] location;
    private SearchColumnStringField[] locationnohierarchy;
    private SearchColumnStringField[] subsidiary;
    private SearchColumnStringField[] subsidiarynohierarchy;
    private SearchColumnStringField[] year;
    private SearchColumnStringField[] year2;
    private SearchColumnCustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(BudgetSearchRowBasic.class, true);

    public BudgetSearchRowBasic() {
    }

    public BudgetSearchRowBasic(SearchColumnStringField[] account, SearchColumnStringField[] accountingBook, SearchColumnDoubleField[] amount, SearchColumnStringField[] category, SearchColumnStringField[] _class, SearchColumnStringField[] classnohierarchy, SearchColumnStringField[] currency, SearchColumnStringField[] customer, SearchColumnStringField[] department, SearchColumnStringField[] departmentnohierarchy, SearchColumnBooleanField[] global, SearchColumnSelectField[] internalId, SearchColumnStringField[] item, SearchColumnStringField[] location, SearchColumnStringField[] locationnohierarchy, SearchColumnStringField[] subsidiary, SearchColumnStringField[] subsidiarynohierarchy, SearchColumnStringField[] year, SearchColumnStringField[] year2, SearchColumnCustomFieldList customFieldList) {
        this.account = account;
        this.accountingBook = accountingBook;
        this.amount = amount;
        this.category = category;
        this._class = _class;
        this.classnohierarchy = classnohierarchy;
        this.currency = currency;
        this.customer = customer;
        this.department = department;
        this.departmentnohierarchy = departmentnohierarchy;
        this.global = global;
        this.internalId = internalId;
        this.item = item;
        this.location = location;
        this.locationnohierarchy = locationnohierarchy;
        this.subsidiary = subsidiary;
        this.subsidiarynohierarchy = subsidiarynohierarchy;
        this.year = year;
        this.year2 = year2;
        this.customFieldList = customFieldList;
    }

    public SearchColumnStringField[] getAccount() {
        return this.account;
    }

    public void setAccount(SearchColumnStringField[] account) {
        this.account = account;
    }

    public SearchColumnStringField getAccount(int i) {
        return this.account[i];
    }

    public void setAccount(int i, SearchColumnStringField _value) {
        this.account[i] = _value;
    }

    public SearchColumnStringField[] getAccountingBook() {
        return this.accountingBook;
    }

    public void setAccountingBook(SearchColumnStringField[] accountingBook) {
        this.accountingBook = accountingBook;
    }

    public SearchColumnStringField getAccountingBook(int i) {
        return this.accountingBook[i];
    }

    public void setAccountingBook(int i, SearchColumnStringField _value) {
        this.accountingBook[i] = _value;
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

    public SearchColumnStringField[] getCategory() {
        return this.category;
    }

    public void setCategory(SearchColumnStringField[] category) {
        this.category = category;
    }

    public SearchColumnStringField getCategory(int i) {
        return this.category[i];
    }

    public void setCategory(int i, SearchColumnStringField _value) {
        this.category[i] = _value;
    }

    public SearchColumnStringField[] get_class() {
        return this._class;
    }

    public void set_class(SearchColumnStringField[] _class) {
        this._class = _class;
    }

    public SearchColumnStringField get_class(int i) {
        return this._class[i];
    }

    public void set_class(int i, SearchColumnStringField _value) {
        this._class[i] = _value;
    }

    public SearchColumnStringField[] getClassnohierarchy() {
        return this.classnohierarchy;
    }

    public void setClassnohierarchy(SearchColumnStringField[] classnohierarchy) {
        this.classnohierarchy = classnohierarchy;
    }

    public SearchColumnStringField getClassnohierarchy(int i) {
        return this.classnohierarchy[i];
    }

    public void setClassnohierarchy(int i, SearchColumnStringField _value) {
        this.classnohierarchy[i] = _value;
    }

    public SearchColumnStringField[] getCurrency() {
        return this.currency;
    }

    public void setCurrency(SearchColumnStringField[] currency) {
        this.currency = currency;
    }

    public SearchColumnStringField getCurrency(int i) {
        return this.currency[i];
    }

    public void setCurrency(int i, SearchColumnStringField _value) {
        this.currency[i] = _value;
    }

    public SearchColumnStringField[] getCustomer() {
        return this.customer;
    }

    public void setCustomer(SearchColumnStringField[] customer) {
        this.customer = customer;
    }

    public SearchColumnStringField getCustomer(int i) {
        return this.customer[i];
    }

    public void setCustomer(int i, SearchColumnStringField _value) {
        this.customer[i] = _value;
    }

    public SearchColumnStringField[] getDepartment() {
        return this.department;
    }

    public void setDepartment(SearchColumnStringField[] department) {
        this.department = department;
    }

    public SearchColumnStringField getDepartment(int i) {
        return this.department[i];
    }

    public void setDepartment(int i, SearchColumnStringField _value) {
        this.department[i] = _value;
    }

    public SearchColumnStringField[] getDepartmentnohierarchy() {
        return this.departmentnohierarchy;
    }

    public void setDepartmentnohierarchy(SearchColumnStringField[] departmentnohierarchy) {
        this.departmentnohierarchy = departmentnohierarchy;
    }

    public SearchColumnStringField getDepartmentnohierarchy(int i) {
        return this.departmentnohierarchy[i];
    }

    public void setDepartmentnohierarchy(int i, SearchColumnStringField _value) {
        this.departmentnohierarchy[i] = _value;
    }

    public SearchColumnBooleanField[] getGlobal() {
        return this.global;
    }

    public void setGlobal(SearchColumnBooleanField[] global) {
        this.global = global;
    }

    public SearchColumnBooleanField getGlobal(int i) {
        return this.global[i];
    }

    public void setGlobal(int i, SearchColumnBooleanField _value) {
        this.global[i] = _value;
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

    public SearchColumnStringField[] getItem() {
        return this.item;
    }

    public void setItem(SearchColumnStringField[] item) {
        this.item = item;
    }

    public SearchColumnStringField getItem(int i) {
        return this.item[i];
    }

    public void setItem(int i, SearchColumnStringField _value) {
        this.item[i] = _value;
    }

    public SearchColumnStringField[] getLocation() {
        return this.location;
    }

    public void setLocation(SearchColumnStringField[] location) {
        this.location = location;
    }

    public SearchColumnStringField getLocation(int i) {
        return this.location[i];
    }

    public void setLocation(int i, SearchColumnStringField _value) {
        this.location[i] = _value;
    }

    public SearchColumnStringField[] getLocationnohierarchy() {
        return this.locationnohierarchy;
    }

    public void setLocationnohierarchy(SearchColumnStringField[] locationnohierarchy) {
        this.locationnohierarchy = locationnohierarchy;
    }

    public SearchColumnStringField getLocationnohierarchy(int i) {
        return this.locationnohierarchy[i];
    }

    public void setLocationnohierarchy(int i, SearchColumnStringField _value) {
        this.locationnohierarchy[i] = _value;
    }

    public SearchColumnStringField[] getSubsidiary() {
        return this.subsidiary;
    }

    public void setSubsidiary(SearchColumnStringField[] subsidiary) {
        this.subsidiary = subsidiary;
    }

    public SearchColumnStringField getSubsidiary(int i) {
        return this.subsidiary[i];
    }

    public void setSubsidiary(int i, SearchColumnStringField _value) {
        this.subsidiary[i] = _value;
    }

    public SearchColumnStringField[] getSubsidiarynohierarchy() {
        return this.subsidiarynohierarchy;
    }

    public void setSubsidiarynohierarchy(SearchColumnStringField[] subsidiarynohierarchy) {
        this.subsidiarynohierarchy = subsidiarynohierarchy;
    }

    public SearchColumnStringField getSubsidiarynohierarchy(int i) {
        return this.subsidiarynohierarchy[i];
    }

    public void setSubsidiarynohierarchy(int i, SearchColumnStringField _value) {
        this.subsidiarynohierarchy[i] = _value;
    }

    public SearchColumnStringField[] getYear() {
        return this.year;
    }

    public void setYear(SearchColumnStringField[] year) {
        this.year = year;
    }

    public SearchColumnStringField getYear(int i) {
        return this.year[i];
    }

    public void setYear(int i, SearchColumnStringField _value) {
        this.year[i] = _value;
    }

    public SearchColumnStringField[] getYear2() {
        return this.year2;
    }

    public void setYear2(SearchColumnStringField[] year2) {
        this.year2 = year2;
    }

    public SearchColumnStringField getYear2(int i) {
        return this.year2[i];
    }

    public void setYear2(int i, SearchColumnStringField _value) {
        this.year2[i] = _value;
    }

    public SearchColumnCustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof BudgetSearchRowBasic)) {
            return false;
        }
        BudgetSearchRowBasic other = (BudgetSearchRowBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.account == null && other.getAccount() == null || this.account != null && Arrays.equals(this.account, other.getAccount())) && (this.accountingBook == null && other.getAccountingBook() == null || this.accountingBook != null && Arrays.equals(this.accountingBook, other.getAccountingBook())) && (this.amount == null && other.getAmount() == null || this.amount != null && Arrays.equals(this.amount, other.getAmount())) && (this.category == null && other.getCategory() == null || this.category != null && Arrays.equals(this.category, other.getCategory())) && (this._class == null && other.get_class() == null || this._class != null && Arrays.equals(this._class, other.get_class())) && (this.classnohierarchy == null && other.getClassnohierarchy() == null || this.classnohierarchy != null && Arrays.equals(this.classnohierarchy, other.getClassnohierarchy())) && (this.currency == null && other.getCurrency() == null || this.currency != null && Arrays.equals(this.currency, other.getCurrency())) && (this.customer == null && other.getCustomer() == null || this.customer != null && Arrays.equals(this.customer, other.getCustomer())) && (this.department == null && other.getDepartment() == null || this.department != null && Arrays.equals(this.department, other.getDepartment())) && (this.departmentnohierarchy == null && other.getDepartmentnohierarchy() == null || this.departmentnohierarchy != null && Arrays.equals(this.departmentnohierarchy, other.getDepartmentnohierarchy())) && (this.global == null && other.getGlobal() == null || this.global != null && Arrays.equals(this.global, other.getGlobal())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && Arrays.equals(this.internalId, other.getInternalId())) && (this.item == null && other.getItem() == null || this.item != null && Arrays.equals(this.item, other.getItem())) && (this.location == null && other.getLocation() == null || this.location != null && Arrays.equals(this.location, other.getLocation())) && (this.locationnohierarchy == null && other.getLocationnohierarchy() == null || this.locationnohierarchy != null && Arrays.equals(this.locationnohierarchy, other.getLocationnohierarchy())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && Arrays.equals(this.subsidiary, other.getSubsidiary())) && (this.subsidiarynohierarchy == null && other.getSubsidiarynohierarchy() == null || this.subsidiarynohierarchy != null && Arrays.equals(this.subsidiarynohierarchy, other.getSubsidiarynohierarchy())) && (this.year == null && other.getYear() == null || this.year != null && Arrays.equals(this.year, other.getYear())) && (this.year2 == null && other.getYear2() == null || this.year2 != null && Arrays.equals(this.year2, other.getYear2())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
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
        if (this.getAccount() != null) {
            for (i = 0; i < Array.getLength(this.getAccount()); ++i) {
                obj = Array.get(this.getAccount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAccountingBook() != null) {
            for (i = 0; i < Array.getLength(this.getAccountingBook()); ++i) {
                obj = Array.get(this.getAccountingBook(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAmount() != null) {
            for (i = 0; i < Array.getLength(this.getAmount()); ++i) {
                obj = Array.get(this.getAmount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCategory() != null) {
            for (i = 0; i < Array.getLength(this.getCategory()); ++i) {
                obj = Array.get(this.getCategory(), i);
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
        if (this.getClassnohierarchy() != null) {
            for (i = 0; i < Array.getLength(this.getClassnohierarchy()); ++i) {
                obj = Array.get(this.getClassnohierarchy(), i);
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
        if (this.getDepartment() != null) {
            for (i = 0; i < Array.getLength(this.getDepartment()); ++i) {
                obj = Array.get(this.getDepartment(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDepartmentnohierarchy() != null) {
            for (i = 0; i < Array.getLength(this.getDepartmentnohierarchy()); ++i) {
                obj = Array.get(this.getDepartmentnohierarchy(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getGlobal() != null) {
            for (i = 0; i < Array.getLength(this.getGlobal()); ++i) {
                obj = Array.get(this.getGlobal(), i);
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
        if (this.getItem() != null) {
            for (i = 0; i < Array.getLength(this.getItem()); ++i) {
                obj = Array.get(this.getItem(), i);
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
        if (this.getLocationnohierarchy() != null) {
            for (i = 0; i < Array.getLength(this.getLocationnohierarchy()); ++i) {
                obj = Array.get(this.getLocationnohierarchy(), i);
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
        if (this.getSubsidiarynohierarchy() != null) {
            for (i = 0; i < Array.getLength(this.getSubsidiarynohierarchy()); ++i) {
                obj = Array.get(this.getSubsidiarynohierarchy(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getYear() != null) {
            for (i = 0; i < Array.getLength(this.getYear()); ++i) {
                obj = Array.get(this.getYear(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getYear2() != null) {
            for (i = 0; i < Array.getLength(this.getYear2()); ++i) {
                obj = Array.get(this.getYear2(), i);
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "BudgetSearchRowBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "account"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("accountingBook");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "accountingBook"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "amount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "category"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "class"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("classnohierarchy");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "classnohierarchy"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customer");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "customer"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "department"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("departmentnohierarchy");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "departmentnohierarchy"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("global");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "global"));
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
        elemField.setFieldName("item");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "location"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationnohierarchy");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationnohierarchy"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subsidiarynohierarchy");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "subsidiarynohierarchy"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("year");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "year"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("year2");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "year2"));
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

