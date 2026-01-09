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
package com.netsuite.suitetalk.proxy.v2022_1.lists.employees;

import com.netsuite.suitetalk.proxy.v2022_1.lists.employees.types.PayrollItemAccountCategory;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.CustomFieldList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.NullField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.Record;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
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

public class PayrollItem
extends Record
implements Serializable {
    private RecordRef subsidiary;
    private RecordRef itemType;
    private String name;
    private RecordRef vendor;
    private RecordRef expenseAccount;
    private RecordRef liabilityAccount;
    private Boolean employeePaid;
    private PayrollItemAccountCategory accountCategory;
    private Boolean inactive;
    private CustomFieldList customFieldList;
    private String internalId;
    private String externalId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(PayrollItem.class, true);

    public PayrollItem() {
    }

    public PayrollItem(NullField nullFieldList, String internalId, String externalId, RecordRef subsidiary, RecordRef itemType, String name, RecordRef vendor, RecordRef expenseAccount, RecordRef liabilityAccount, Boolean employeePaid, PayrollItemAccountCategory accountCategory, Boolean inactive, CustomFieldList customFieldList) {
        super(nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.subsidiary = subsidiary;
        this.itemType = itemType;
        this.name = name;
        this.vendor = vendor;
        this.expenseAccount = expenseAccount;
        this.liabilityAccount = liabilityAccount;
        this.employeePaid = employeePaid;
        this.accountCategory = accountCategory;
        this.inactive = inactive;
        this.customFieldList = customFieldList;
    }

    public RecordRef getSubsidiary() {
        return this.subsidiary;
    }

    public void setSubsidiary(RecordRef subsidiary) {
        this.subsidiary = subsidiary;
    }

    public RecordRef getItemType() {
        return this.itemType;
    }

    public void setItemType(RecordRef itemType) {
        this.itemType = itemType;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RecordRef getVendor() {
        return this.vendor;
    }

    public void setVendor(RecordRef vendor) {
        this.vendor = vendor;
    }

    public RecordRef getExpenseAccount() {
        return this.expenseAccount;
    }

    public void setExpenseAccount(RecordRef expenseAccount) {
        this.expenseAccount = expenseAccount;
    }

    public RecordRef getLiabilityAccount() {
        return this.liabilityAccount;
    }

    public void setLiabilityAccount(RecordRef liabilityAccount) {
        this.liabilityAccount = liabilityAccount;
    }

    public Boolean getEmployeePaid() {
        return this.employeePaid;
    }

    public void setEmployeePaid(Boolean employeePaid) {
        this.employeePaid = employeePaid;
    }

    public PayrollItemAccountCategory getAccountCategory() {
        return this.accountCategory;
    }

    public void setAccountCategory(PayrollItemAccountCategory accountCategory) {
        this.accountCategory = accountCategory;
    }

    public Boolean getInactive() {
        return this.inactive;
    }

    public void setInactive(Boolean inactive) {
        this.inactive = inactive;
    }

    public CustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
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
        if (!(obj instanceof PayrollItem)) {
            return false;
        }
        PayrollItem other = (PayrollItem)obj;
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
        boolean _equals = super.equals(obj) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && this.subsidiary.equals(other.getSubsidiary())) && (this.itemType == null && other.getItemType() == null || this.itemType != null && this.itemType.equals(other.getItemType())) && (this.name == null && other.getName() == null || this.name != null && this.name.equals(other.getName())) && (this.vendor == null && other.getVendor() == null || this.vendor != null && this.vendor.equals(other.getVendor())) && (this.expenseAccount == null && other.getExpenseAccount() == null || this.expenseAccount != null && this.expenseAccount.equals(other.getExpenseAccount())) && (this.liabilityAccount == null && other.getLiabilityAccount() == null || this.liabilityAccount != null && this.liabilityAccount.equals(other.getLiabilityAccount())) && (this.employeePaid == null && other.getEmployeePaid() == null || this.employeePaid != null && this.employeePaid.equals(other.getEmployeePaid())) && (this.accountCategory == null && other.getAccountCategory() == null || this.accountCategory != null && this.accountCategory.equals(other.getAccountCategory())) && (this.inactive == null && other.getInactive() == null || this.inactive != null && this.inactive.equals(other.getInactive())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
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
        if (this.getSubsidiary() != null) {
            _hashCode += this.getSubsidiary().hashCode();
        }
        if (this.getItemType() != null) {
            _hashCode += this.getItemType().hashCode();
        }
        if (this.getName() != null) {
            _hashCode += this.getName().hashCode();
        }
        if (this.getVendor() != null) {
            _hashCode += this.getVendor().hashCode();
        }
        if (this.getExpenseAccount() != null) {
            _hashCode += this.getExpenseAccount().hashCode();
        }
        if (this.getLiabilityAccount() != null) {
            _hashCode += this.getLiabilityAccount().hashCode();
        }
        if (this.getEmployeePaid() != null) {
            _hashCode += this.getEmployeePaid().hashCode();
        }
        if (this.getAccountCategory() != null) {
            _hashCode += this.getAccountCategory().hashCode();
        }
        if (this.getInactive() != null) {
            _hashCode += this.getInactive().hashCode();
        }
        if (this.getCustomFieldList() != null) {
            _hashCode += this.getCustomFieldList().hashCode();
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
        typeDesc.setXmlType(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "PayrollItem"));
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
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemType");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "itemType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "name"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vendor");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "vendor"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("expenseAccount");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "expenseAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("liabilityAccount");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "liabilityAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("employeePaid");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "employeePaid"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("accountCategory");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "accountCategory"));
        elemField.setXmlType(new QName("urn:types.employees_2022_1.lists.webservices.netsuite.com", "PayrollItemAccountCategory"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("inactive");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "inactive"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "CustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

