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

import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.TranslationList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.CustomFieldList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.NullField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.Record;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRefList;
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

public class MarkupItem
extends Record
implements Serializable {
    private Calendar createdDate;
    private Calendar lastModifiedDate;
    private String description;
    private Boolean nonPosting;
    private RecordRef account;
    private Boolean includeChildren;
    private String rate;
    private Boolean isPreTax;
    private RecordRef customForm;
    private String itemId;
    private RecordRef issueProduct;
    private String upcCode;
    private String displayName;
    private String vendorName;
    private RecordRef parent;
    private Boolean isInactive;
    private Boolean availableToPartners;
    private RecordRef department;
    private RecordRef _class;
    private RecordRef location;
    private RecordRefList subsidiaryList;
    private RecordRef taxSchedule;
    private RecordRef deferredRevenueAccount;
    private RecordRef expenseAccount;
    private RecordRef incomeAccount;
    private RecordRef revRecSchedule;
    private RecordRef salesTaxCode;
    private TranslationList translationsList;
    private CustomFieldList customFieldList;
    private String internalId;
    private String externalId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(MarkupItem.class, true);

    public MarkupItem() {
    }

    public MarkupItem(NullField nullFieldList, String internalId, String externalId, Calendar createdDate, Calendar lastModifiedDate, String description, Boolean nonPosting, RecordRef account, Boolean includeChildren, String rate, Boolean isPreTax, RecordRef customForm, String itemId, RecordRef issueProduct, String upcCode, String displayName, String vendorName, RecordRef parent, Boolean isInactive, Boolean availableToPartners, RecordRef department, RecordRef _class, RecordRef location, RecordRefList subsidiaryList, RecordRef taxSchedule, RecordRef deferredRevenueAccount, RecordRef expenseAccount, RecordRef incomeAccount, RecordRef revRecSchedule, RecordRef salesTaxCode, TranslationList translationsList, CustomFieldList customFieldList) {
        super(nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.description = description;
        this.nonPosting = nonPosting;
        this.account = account;
        this.includeChildren = includeChildren;
        this.rate = rate;
        this.isPreTax = isPreTax;
        this.customForm = customForm;
        this.itemId = itemId;
        this.issueProduct = issueProduct;
        this.upcCode = upcCode;
        this.displayName = displayName;
        this.vendorName = vendorName;
        this.parent = parent;
        this.isInactive = isInactive;
        this.availableToPartners = availableToPartners;
        this.department = department;
        this._class = _class;
        this.location = location;
        this.subsidiaryList = subsidiaryList;
        this.taxSchedule = taxSchedule;
        this.deferredRevenueAccount = deferredRevenueAccount;
        this.expenseAccount = expenseAccount;
        this.incomeAccount = incomeAccount;
        this.revRecSchedule = revRecSchedule;
        this.salesTaxCode = salesTaxCode;
        this.translationsList = translationsList;
        this.customFieldList = customFieldList;
    }

    public Calendar getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(Calendar createdDate) {
        this.createdDate = createdDate;
    }

    public Calendar getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    public void setLastModifiedDate(Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getNonPosting() {
        return this.nonPosting;
    }

    public void setNonPosting(Boolean nonPosting) {
        this.nonPosting = nonPosting;
    }

    public RecordRef getAccount() {
        return this.account;
    }

    public void setAccount(RecordRef account) {
        this.account = account;
    }

    public Boolean getIncludeChildren() {
        return this.includeChildren;
    }

    public void setIncludeChildren(Boolean includeChildren) {
        this.includeChildren = includeChildren;
    }

    public String getRate() {
        return this.rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public Boolean getIsPreTax() {
        return this.isPreTax;
    }

    public void setIsPreTax(Boolean isPreTax) {
        this.isPreTax = isPreTax;
    }

    public RecordRef getCustomForm() {
        return this.customForm;
    }

    public void setCustomForm(RecordRef customForm) {
        this.customForm = customForm;
    }

    public String getItemId() {
        return this.itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public RecordRef getIssueProduct() {
        return this.issueProduct;
    }

    public void setIssueProduct(RecordRef issueProduct) {
        this.issueProduct = issueProduct;
    }

    public String getUpcCode() {
        return this.upcCode;
    }

    public void setUpcCode(String upcCode) {
        this.upcCode = upcCode;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getVendorName() {
        return this.vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public RecordRef getParent() {
        return this.parent;
    }

    public void setParent(RecordRef parent) {
        this.parent = parent;
    }

    public Boolean getIsInactive() {
        return this.isInactive;
    }

    public void setIsInactive(Boolean isInactive) {
        this.isInactive = isInactive;
    }

    public Boolean getAvailableToPartners() {
        return this.availableToPartners;
    }

    public void setAvailableToPartners(Boolean availableToPartners) {
        this.availableToPartners = availableToPartners;
    }

    public RecordRef getDepartment() {
        return this.department;
    }

    public void setDepartment(RecordRef department) {
        this.department = department;
    }

    public RecordRef get_class() {
        return this._class;
    }

    public void set_class(RecordRef _class) {
        this._class = _class;
    }

    public RecordRef getLocation() {
        return this.location;
    }

    public void setLocation(RecordRef location) {
        this.location = location;
    }

    public RecordRefList getSubsidiaryList() {
        return this.subsidiaryList;
    }

    public void setSubsidiaryList(RecordRefList subsidiaryList) {
        this.subsidiaryList = subsidiaryList;
    }

    public RecordRef getTaxSchedule() {
        return this.taxSchedule;
    }

    public void setTaxSchedule(RecordRef taxSchedule) {
        this.taxSchedule = taxSchedule;
    }

    public RecordRef getDeferredRevenueAccount() {
        return this.deferredRevenueAccount;
    }

    public void setDeferredRevenueAccount(RecordRef deferredRevenueAccount) {
        this.deferredRevenueAccount = deferredRevenueAccount;
    }

    public RecordRef getExpenseAccount() {
        return this.expenseAccount;
    }

    public void setExpenseAccount(RecordRef expenseAccount) {
        this.expenseAccount = expenseAccount;
    }

    public RecordRef getIncomeAccount() {
        return this.incomeAccount;
    }

    public void setIncomeAccount(RecordRef incomeAccount) {
        this.incomeAccount = incomeAccount;
    }

    public RecordRef getRevRecSchedule() {
        return this.revRecSchedule;
    }

    public void setRevRecSchedule(RecordRef revRecSchedule) {
        this.revRecSchedule = revRecSchedule;
    }

    public RecordRef getSalesTaxCode() {
        return this.salesTaxCode;
    }

    public void setSalesTaxCode(RecordRef salesTaxCode) {
        this.salesTaxCode = salesTaxCode;
    }

    public TranslationList getTranslationsList() {
        return this.translationsList;
    }

    public void setTranslationsList(TranslationList translationsList) {
        this.translationsList = translationsList;
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
        if (!(obj instanceof MarkupItem)) {
            return false;
        }
        MarkupItem other = (MarkupItem)obj;
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
        boolean _equals = super.equals(obj) && (this.createdDate == null && other.getCreatedDate() == null || this.createdDate != null && this.createdDate.equals(other.getCreatedDate())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && this.lastModifiedDate.equals(other.getLastModifiedDate())) && (this.description == null && other.getDescription() == null || this.description != null && this.description.equals(other.getDescription())) && (this.nonPosting == null && other.getNonPosting() == null || this.nonPosting != null && this.nonPosting.equals(other.getNonPosting())) && (this.account == null && other.getAccount() == null || this.account != null && this.account.equals(other.getAccount())) && (this.includeChildren == null && other.getIncludeChildren() == null || this.includeChildren != null && this.includeChildren.equals(other.getIncludeChildren())) && (this.rate == null && other.getRate() == null || this.rate != null && this.rate.equals(other.getRate())) && (this.isPreTax == null && other.getIsPreTax() == null || this.isPreTax != null && this.isPreTax.equals(other.getIsPreTax())) && (this.customForm == null && other.getCustomForm() == null || this.customForm != null && this.customForm.equals(other.getCustomForm())) && (this.itemId == null && other.getItemId() == null || this.itemId != null && this.itemId.equals(other.getItemId())) && (this.issueProduct == null && other.getIssueProduct() == null || this.issueProduct != null && this.issueProduct.equals(other.getIssueProduct())) && (this.upcCode == null && other.getUpcCode() == null || this.upcCode != null && this.upcCode.equals(other.getUpcCode())) && (this.displayName == null && other.getDisplayName() == null || this.displayName != null && this.displayName.equals(other.getDisplayName())) && (this.vendorName == null && other.getVendorName() == null || this.vendorName != null && this.vendorName.equals(other.getVendorName())) && (this.parent == null && other.getParent() == null || this.parent != null && this.parent.equals(other.getParent())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && this.isInactive.equals(other.getIsInactive())) && (this.availableToPartners == null && other.getAvailableToPartners() == null || this.availableToPartners != null && this.availableToPartners.equals(other.getAvailableToPartners())) && (this.department == null && other.getDepartment() == null || this.department != null && this.department.equals(other.getDepartment())) && (this._class == null && other.get_class() == null || this._class != null && this._class.equals(other.get_class())) && (this.location == null && other.getLocation() == null || this.location != null && this.location.equals(other.getLocation())) && (this.subsidiaryList == null && other.getSubsidiaryList() == null || this.subsidiaryList != null && this.subsidiaryList.equals(other.getSubsidiaryList())) && (this.taxSchedule == null && other.getTaxSchedule() == null || this.taxSchedule != null && this.taxSchedule.equals(other.getTaxSchedule())) && (this.deferredRevenueAccount == null && other.getDeferredRevenueAccount() == null || this.deferredRevenueAccount != null && this.deferredRevenueAccount.equals(other.getDeferredRevenueAccount())) && (this.expenseAccount == null && other.getExpenseAccount() == null || this.expenseAccount != null && this.expenseAccount.equals(other.getExpenseAccount())) && (this.incomeAccount == null && other.getIncomeAccount() == null || this.incomeAccount != null && this.incomeAccount.equals(other.getIncomeAccount())) && (this.revRecSchedule == null && other.getRevRecSchedule() == null || this.revRecSchedule != null && this.revRecSchedule.equals(other.getRevRecSchedule())) && (this.salesTaxCode == null && other.getSalesTaxCode() == null || this.salesTaxCode != null && this.salesTaxCode.equals(other.getSalesTaxCode())) && (this.translationsList == null && other.getTranslationsList() == null || this.translationsList != null && this.translationsList.equals(other.getTranslationsList())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
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
        if (this.getCreatedDate() != null) {
            _hashCode += this.getCreatedDate().hashCode();
        }
        if (this.getLastModifiedDate() != null) {
            _hashCode += this.getLastModifiedDate().hashCode();
        }
        if (this.getDescription() != null) {
            _hashCode += this.getDescription().hashCode();
        }
        if (this.getNonPosting() != null) {
            _hashCode += this.getNonPosting().hashCode();
        }
        if (this.getAccount() != null) {
            _hashCode += this.getAccount().hashCode();
        }
        if (this.getIncludeChildren() != null) {
            _hashCode += this.getIncludeChildren().hashCode();
        }
        if (this.getRate() != null) {
            _hashCode += this.getRate().hashCode();
        }
        if (this.getIsPreTax() != null) {
            _hashCode += this.getIsPreTax().hashCode();
        }
        if (this.getCustomForm() != null) {
            _hashCode += this.getCustomForm().hashCode();
        }
        if (this.getItemId() != null) {
            _hashCode += this.getItemId().hashCode();
        }
        if (this.getIssueProduct() != null) {
            _hashCode += this.getIssueProduct().hashCode();
        }
        if (this.getUpcCode() != null) {
            _hashCode += this.getUpcCode().hashCode();
        }
        if (this.getDisplayName() != null) {
            _hashCode += this.getDisplayName().hashCode();
        }
        if (this.getVendorName() != null) {
            _hashCode += this.getVendorName().hashCode();
        }
        if (this.getParent() != null) {
            _hashCode += this.getParent().hashCode();
        }
        if (this.getIsInactive() != null) {
            _hashCode += this.getIsInactive().hashCode();
        }
        if (this.getAvailableToPartners() != null) {
            _hashCode += this.getAvailableToPartners().hashCode();
        }
        if (this.getDepartment() != null) {
            _hashCode += this.getDepartment().hashCode();
        }
        if (this.get_class() != null) {
            _hashCode += this.get_class().hashCode();
        }
        if (this.getLocation() != null) {
            _hashCode += this.getLocation().hashCode();
        }
        if (this.getSubsidiaryList() != null) {
            _hashCode += this.getSubsidiaryList().hashCode();
        }
        if (this.getTaxSchedule() != null) {
            _hashCode += this.getTaxSchedule().hashCode();
        }
        if (this.getDeferredRevenueAccount() != null) {
            _hashCode += this.getDeferredRevenueAccount().hashCode();
        }
        if (this.getExpenseAccount() != null) {
            _hashCode += this.getExpenseAccount().hashCode();
        }
        if (this.getIncomeAccount() != null) {
            _hashCode += this.getIncomeAccount().hashCode();
        }
        if (this.getRevRecSchedule() != null) {
            _hashCode += this.getRevRecSchedule().hashCode();
        }
        if (this.getSalesTaxCode() != null) {
            _hashCode += this.getSalesTaxCode().hashCode();
        }
        if (this.getTranslationsList() != null) {
            _hashCode += this.getTranslationsList().hashCode();
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
        typeDesc.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "MarkupItem"));
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
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "description"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("nonPosting");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "nonPosting"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("account");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "account"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("includeChildren");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "includeChildren"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("rate");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "rate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isPreTax");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "isPreTax"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customForm");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemId");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "itemId"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("issueProduct");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "issueProduct"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("upcCode");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "upcCode"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("displayName");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "displayName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vendorName");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "vendorName"));
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
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("availableToPartners");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "availableToPartners"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "department"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "class"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "location"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subsidiaryList");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "subsidiaryList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRefList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxSchedule");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "taxSchedule"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("deferredRevenueAccount");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "deferredRevenueAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("expenseAccount");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "expenseAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("incomeAccount");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "incomeAccount"));
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
        elemField.setFieldName("salesTaxCode");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "salesTaxCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("translationsList");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "translationsList"));
        elemField.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "TranslationList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "CustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

