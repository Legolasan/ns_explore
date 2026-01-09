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

import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.ItemGroupHierarchyVersionsList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.ItemMemberList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.TranslationList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.types.ShippingCarrier;
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

public class ItemGroup
extends Record
implements Serializable {
    private Calendar createdDate;
    private Calendar lastModifiedDate;
    private RecordRef customForm;
    private Boolean includeStartEndLines;
    private Boolean isVsoeBundle;
    private RecordRef defaultItemShipMethod;
    private Boolean availableToPartners;
    private Boolean isInactive;
    private String itemId;
    private String upcCode;
    private String displayName;
    private String vendorName;
    private RecordRef issueProduct;
    private RecordRef parent;
    private String description;
    private RecordRefList subsidiaryList;
    private Boolean includeChildren;
    private RecordRef department;
    private RecordRef _class;
    private RecordRef location;
    private ShippingCarrier itemCarrier;
    private RecordRefList itemShipMethodList;
    private Boolean printItems;
    private ItemMemberList memberList;
    private TranslationList translationsList;
    private ItemGroupHierarchyVersionsList hierarchyVersionsList;
    private CustomFieldList customFieldList;
    private String internalId;
    private String externalId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(ItemGroup.class, true);

    public ItemGroup() {
    }

    public ItemGroup(NullField nullFieldList, String internalId, String externalId, Calendar createdDate, Calendar lastModifiedDate, RecordRef customForm, Boolean includeStartEndLines, Boolean isVsoeBundle, RecordRef defaultItemShipMethod, Boolean availableToPartners, Boolean isInactive, String itemId, String upcCode, String displayName, String vendorName, RecordRef issueProduct, RecordRef parent, String description, RecordRefList subsidiaryList, Boolean includeChildren, RecordRef department, RecordRef _class, RecordRef location, ShippingCarrier itemCarrier, RecordRefList itemShipMethodList, Boolean printItems, ItemMemberList memberList, TranslationList translationsList, ItemGroupHierarchyVersionsList hierarchyVersionsList, CustomFieldList customFieldList) {
        super(nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.customForm = customForm;
        this.includeStartEndLines = includeStartEndLines;
        this.isVsoeBundle = isVsoeBundle;
        this.defaultItemShipMethod = defaultItemShipMethod;
        this.availableToPartners = availableToPartners;
        this.isInactive = isInactive;
        this.itemId = itemId;
        this.upcCode = upcCode;
        this.displayName = displayName;
        this.vendorName = vendorName;
        this.issueProduct = issueProduct;
        this.parent = parent;
        this.description = description;
        this.subsidiaryList = subsidiaryList;
        this.includeChildren = includeChildren;
        this.department = department;
        this._class = _class;
        this.location = location;
        this.itemCarrier = itemCarrier;
        this.itemShipMethodList = itemShipMethodList;
        this.printItems = printItems;
        this.memberList = memberList;
        this.translationsList = translationsList;
        this.hierarchyVersionsList = hierarchyVersionsList;
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

    public RecordRef getCustomForm() {
        return this.customForm;
    }

    public void setCustomForm(RecordRef customForm) {
        this.customForm = customForm;
    }

    public Boolean getIncludeStartEndLines() {
        return this.includeStartEndLines;
    }

    public void setIncludeStartEndLines(Boolean includeStartEndLines) {
        this.includeStartEndLines = includeStartEndLines;
    }

    public Boolean getIsVsoeBundle() {
        return this.isVsoeBundle;
    }

    public void setIsVsoeBundle(Boolean isVsoeBundle) {
        this.isVsoeBundle = isVsoeBundle;
    }

    public RecordRef getDefaultItemShipMethod() {
        return this.defaultItemShipMethod;
    }

    public void setDefaultItemShipMethod(RecordRef defaultItemShipMethod) {
        this.defaultItemShipMethod = defaultItemShipMethod;
    }

    public Boolean getAvailableToPartners() {
        return this.availableToPartners;
    }

    public void setAvailableToPartners(Boolean availableToPartners) {
        this.availableToPartners = availableToPartners;
    }

    public Boolean getIsInactive() {
        return this.isInactive;
    }

    public void setIsInactive(Boolean isInactive) {
        this.isInactive = isInactive;
    }

    public String getItemId() {
        return this.itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
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

    public RecordRef getIssueProduct() {
        return this.issueProduct;
    }

    public void setIssueProduct(RecordRef issueProduct) {
        this.issueProduct = issueProduct;
    }

    public RecordRef getParent() {
        return this.parent;
    }

    public void setParent(RecordRef parent) {
        this.parent = parent;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public RecordRefList getSubsidiaryList() {
        return this.subsidiaryList;
    }

    public void setSubsidiaryList(RecordRefList subsidiaryList) {
        this.subsidiaryList = subsidiaryList;
    }

    public Boolean getIncludeChildren() {
        return this.includeChildren;
    }

    public void setIncludeChildren(Boolean includeChildren) {
        this.includeChildren = includeChildren;
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

    public ShippingCarrier getItemCarrier() {
        return this.itemCarrier;
    }

    public void setItemCarrier(ShippingCarrier itemCarrier) {
        this.itemCarrier = itemCarrier;
    }

    public RecordRefList getItemShipMethodList() {
        return this.itemShipMethodList;
    }

    public void setItemShipMethodList(RecordRefList itemShipMethodList) {
        this.itemShipMethodList = itemShipMethodList;
    }

    public Boolean getPrintItems() {
        return this.printItems;
    }

    public void setPrintItems(Boolean printItems) {
        this.printItems = printItems;
    }

    public ItemMemberList getMemberList() {
        return this.memberList;
    }

    public void setMemberList(ItemMemberList memberList) {
        this.memberList = memberList;
    }

    public TranslationList getTranslationsList() {
        return this.translationsList;
    }

    public void setTranslationsList(TranslationList translationsList) {
        this.translationsList = translationsList;
    }

    public ItemGroupHierarchyVersionsList getHierarchyVersionsList() {
        return this.hierarchyVersionsList;
    }

    public void setHierarchyVersionsList(ItemGroupHierarchyVersionsList hierarchyVersionsList) {
        this.hierarchyVersionsList = hierarchyVersionsList;
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
        if (!(obj instanceof ItemGroup)) {
            return false;
        }
        ItemGroup other = (ItemGroup)obj;
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
        boolean _equals = super.equals(obj) && (this.createdDate == null && other.getCreatedDate() == null || this.createdDate != null && this.createdDate.equals(other.getCreatedDate())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && this.lastModifiedDate.equals(other.getLastModifiedDate())) && (this.customForm == null && other.getCustomForm() == null || this.customForm != null && this.customForm.equals(other.getCustomForm())) && (this.includeStartEndLines == null && other.getIncludeStartEndLines() == null || this.includeStartEndLines != null && this.includeStartEndLines.equals(other.getIncludeStartEndLines())) && (this.isVsoeBundle == null && other.getIsVsoeBundle() == null || this.isVsoeBundle != null && this.isVsoeBundle.equals(other.getIsVsoeBundle())) && (this.defaultItemShipMethod == null && other.getDefaultItemShipMethod() == null || this.defaultItemShipMethod != null && this.defaultItemShipMethod.equals(other.getDefaultItemShipMethod())) && (this.availableToPartners == null && other.getAvailableToPartners() == null || this.availableToPartners != null && this.availableToPartners.equals(other.getAvailableToPartners())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && this.isInactive.equals(other.getIsInactive())) && (this.itemId == null && other.getItemId() == null || this.itemId != null && this.itemId.equals(other.getItemId())) && (this.upcCode == null && other.getUpcCode() == null || this.upcCode != null && this.upcCode.equals(other.getUpcCode())) && (this.displayName == null && other.getDisplayName() == null || this.displayName != null && this.displayName.equals(other.getDisplayName())) && (this.vendorName == null && other.getVendorName() == null || this.vendorName != null && this.vendorName.equals(other.getVendorName())) && (this.issueProduct == null && other.getIssueProduct() == null || this.issueProduct != null && this.issueProduct.equals(other.getIssueProduct())) && (this.parent == null && other.getParent() == null || this.parent != null && this.parent.equals(other.getParent())) && (this.description == null && other.getDescription() == null || this.description != null && this.description.equals(other.getDescription())) && (this.subsidiaryList == null && other.getSubsidiaryList() == null || this.subsidiaryList != null && this.subsidiaryList.equals(other.getSubsidiaryList())) && (this.includeChildren == null && other.getIncludeChildren() == null || this.includeChildren != null && this.includeChildren.equals(other.getIncludeChildren())) && (this.department == null && other.getDepartment() == null || this.department != null && this.department.equals(other.getDepartment())) && (this._class == null && other.get_class() == null || this._class != null && this._class.equals(other.get_class())) && (this.location == null && other.getLocation() == null || this.location != null && this.location.equals(other.getLocation())) && (this.itemCarrier == null && other.getItemCarrier() == null || this.itemCarrier != null && this.itemCarrier.equals(other.getItemCarrier())) && (this.itemShipMethodList == null && other.getItemShipMethodList() == null || this.itemShipMethodList != null && this.itemShipMethodList.equals(other.getItemShipMethodList())) && (this.printItems == null && other.getPrintItems() == null || this.printItems != null && this.printItems.equals(other.getPrintItems())) && (this.memberList == null && other.getMemberList() == null || this.memberList != null && this.memberList.equals(other.getMemberList())) && (this.translationsList == null && other.getTranslationsList() == null || this.translationsList != null && this.translationsList.equals(other.getTranslationsList())) && (this.hierarchyVersionsList == null && other.getHierarchyVersionsList() == null || this.hierarchyVersionsList != null && this.hierarchyVersionsList.equals(other.getHierarchyVersionsList())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
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
        if (this.getCustomForm() != null) {
            _hashCode += this.getCustomForm().hashCode();
        }
        if (this.getIncludeStartEndLines() != null) {
            _hashCode += this.getIncludeStartEndLines().hashCode();
        }
        if (this.getIsVsoeBundle() != null) {
            _hashCode += this.getIsVsoeBundle().hashCode();
        }
        if (this.getDefaultItemShipMethod() != null) {
            _hashCode += this.getDefaultItemShipMethod().hashCode();
        }
        if (this.getAvailableToPartners() != null) {
            _hashCode += this.getAvailableToPartners().hashCode();
        }
        if (this.getIsInactive() != null) {
            _hashCode += this.getIsInactive().hashCode();
        }
        if (this.getItemId() != null) {
            _hashCode += this.getItemId().hashCode();
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
        if (this.getIssueProduct() != null) {
            _hashCode += this.getIssueProduct().hashCode();
        }
        if (this.getParent() != null) {
            _hashCode += this.getParent().hashCode();
        }
        if (this.getDescription() != null) {
            _hashCode += this.getDescription().hashCode();
        }
        if (this.getSubsidiaryList() != null) {
            _hashCode += this.getSubsidiaryList().hashCode();
        }
        if (this.getIncludeChildren() != null) {
            _hashCode += this.getIncludeChildren().hashCode();
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
        if (this.getItemCarrier() != null) {
            _hashCode += this.getItemCarrier().hashCode();
        }
        if (this.getItemShipMethodList() != null) {
            _hashCode += this.getItemShipMethodList().hashCode();
        }
        if (this.getPrintItems() != null) {
            _hashCode += this.getPrintItems().hashCode();
        }
        if (this.getMemberList() != null) {
            _hashCode += this.getMemberList().hashCode();
        }
        if (this.getTranslationsList() != null) {
            _hashCode += this.getTranslationsList().hashCode();
        }
        if (this.getHierarchyVersionsList() != null) {
            _hashCode += this.getHierarchyVersionsList().hashCode();
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
        typeDesc.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "ItemGroup"));
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
        elemField.setFieldName("customForm");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("includeStartEndLines");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "includeStartEndLines"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isVsoeBundle");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "isVsoeBundle"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("defaultItemShipMethod");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "defaultItemShipMethod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("issueProduct");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "issueProduct"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("description");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "description"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("includeChildren");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "includeChildren"));
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
        elemField.setFieldName("itemCarrier");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "itemCarrier"));
        elemField.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "ShippingCarrier"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemShipMethodList");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "itemShipMethodList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRefList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("printItems");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "printItems"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("memberList");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "memberList"));
        elemField.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "ItemMemberList"));
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
        elemField.setFieldName("hierarchyVersionsList");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "hierarchyVersionsList"));
        elemField.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "ItemGroupHierarchyVersionsList"));
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

