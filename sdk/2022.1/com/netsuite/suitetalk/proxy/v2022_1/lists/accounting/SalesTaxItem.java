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

import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.types.SalesTaxItemAvailable;
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

public class SalesTaxItem
extends Record
implements Serializable {
    private String itemId;
    private String displayName;
    private String description;
    private String rate;
    private RecordRef taxType;
    private RecordRef taxAgency;
    private RecordRef purchaseAccount;
    private RecordRef saleAccount;
    private Boolean isInactive;
    private Calendar effectiveFrom;
    private Calendar validUntil;
    private RecordRefList subsidiaryList;
    private Boolean includeChildren;
    private Boolean eccode;
    private Boolean reverseCharge;
    private RecordRef parent;
    private Boolean service;
    private Boolean exempt;
    private Boolean isDefault;
    private Boolean excludeFromTaxReports;
    private SalesTaxItemAvailable available;
    private Boolean export;
    private RecordRef taxAccount;
    private String county;
    private String city;
    private String state;
    private String zip;
    private RecordRef nexusCountry;
    private String name;
    private CustomFieldList customFieldList;
    private String internalId;
    private String externalId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(SalesTaxItem.class, true);

    public SalesTaxItem() {
    }

    public SalesTaxItem(NullField nullFieldList, String internalId, String externalId, String itemId, String displayName, String description, String rate, RecordRef taxType, RecordRef taxAgency, RecordRef purchaseAccount, RecordRef saleAccount, Boolean isInactive, Calendar effectiveFrom, Calendar validUntil, RecordRefList subsidiaryList, Boolean includeChildren, Boolean eccode, Boolean reverseCharge, RecordRef parent, Boolean service, Boolean exempt, Boolean isDefault, Boolean excludeFromTaxReports, SalesTaxItemAvailable available, Boolean export, RecordRef taxAccount, String county, String city, String state, String zip, RecordRef nexusCountry, String name, CustomFieldList customFieldList) {
        super(nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.itemId = itemId;
        this.displayName = displayName;
        this.description = description;
        this.rate = rate;
        this.taxType = taxType;
        this.taxAgency = taxAgency;
        this.purchaseAccount = purchaseAccount;
        this.saleAccount = saleAccount;
        this.isInactive = isInactive;
        this.effectiveFrom = effectiveFrom;
        this.validUntil = validUntil;
        this.subsidiaryList = subsidiaryList;
        this.includeChildren = includeChildren;
        this.eccode = eccode;
        this.reverseCharge = reverseCharge;
        this.parent = parent;
        this.service = service;
        this.exempt = exempt;
        this.isDefault = isDefault;
        this.excludeFromTaxReports = excludeFromTaxReports;
        this.available = available;
        this.export = export;
        this.taxAccount = taxAccount;
        this.county = county;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.nexusCountry = nexusCountry;
        this.name = name;
        this.customFieldList = customFieldList;
    }

    public String getItemId() {
        return this.itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRate() {
        return this.rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public RecordRef getTaxType() {
        return this.taxType;
    }

    public void setTaxType(RecordRef taxType) {
        this.taxType = taxType;
    }

    public RecordRef getTaxAgency() {
        return this.taxAgency;
    }

    public void setTaxAgency(RecordRef taxAgency) {
        this.taxAgency = taxAgency;
    }

    public RecordRef getPurchaseAccount() {
        return this.purchaseAccount;
    }

    public void setPurchaseAccount(RecordRef purchaseAccount) {
        this.purchaseAccount = purchaseAccount;
    }

    public RecordRef getSaleAccount() {
        return this.saleAccount;
    }

    public void setSaleAccount(RecordRef saleAccount) {
        this.saleAccount = saleAccount;
    }

    public Boolean getIsInactive() {
        return this.isInactive;
    }

    public void setIsInactive(Boolean isInactive) {
        this.isInactive = isInactive;
    }

    public Calendar getEffectiveFrom() {
        return this.effectiveFrom;
    }

    public void setEffectiveFrom(Calendar effectiveFrom) {
        this.effectiveFrom = effectiveFrom;
    }

    public Calendar getValidUntil() {
        return this.validUntil;
    }

    public void setValidUntil(Calendar validUntil) {
        this.validUntil = validUntil;
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

    public Boolean getEccode() {
        return this.eccode;
    }

    public void setEccode(Boolean eccode) {
        this.eccode = eccode;
    }

    public Boolean getReverseCharge() {
        return this.reverseCharge;
    }

    public void setReverseCharge(Boolean reverseCharge) {
        this.reverseCharge = reverseCharge;
    }

    public RecordRef getParent() {
        return this.parent;
    }

    public void setParent(RecordRef parent) {
        this.parent = parent;
    }

    public Boolean getService() {
        return this.service;
    }

    public void setService(Boolean service) {
        this.service = service;
    }

    public Boolean getExempt() {
        return this.exempt;
    }

    public void setExempt(Boolean exempt) {
        this.exempt = exempt;
    }

    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public void setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
    }

    public Boolean getExcludeFromTaxReports() {
        return this.excludeFromTaxReports;
    }

    public void setExcludeFromTaxReports(Boolean excludeFromTaxReports) {
        this.excludeFromTaxReports = excludeFromTaxReports;
    }

    public SalesTaxItemAvailable getAvailable() {
        return this.available;
    }

    public void setAvailable(SalesTaxItemAvailable available) {
        this.available = available;
    }

    public Boolean getExport() {
        return this.export;
    }

    public void setExport(Boolean export) {
        this.export = export;
    }

    public RecordRef getTaxAccount() {
        return this.taxAccount;
    }

    public void setTaxAccount(RecordRef taxAccount) {
        this.taxAccount = taxAccount;
    }

    public String getCounty() {
        return this.county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getCity() {
        return this.city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getZip() {
        return this.zip;
    }

    public void setZip(String zip) {
        this.zip = zip;
    }

    public RecordRef getNexusCountry() {
        return this.nexusCountry;
    }

    public void setNexusCountry(RecordRef nexusCountry) {
        this.nexusCountry = nexusCountry;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
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
        if (!(obj instanceof SalesTaxItem)) {
            return false;
        }
        SalesTaxItem other = (SalesTaxItem)obj;
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
        boolean _equals = super.equals(obj) && (this.itemId == null && other.getItemId() == null || this.itemId != null && this.itemId.equals(other.getItemId())) && (this.displayName == null && other.getDisplayName() == null || this.displayName != null && this.displayName.equals(other.getDisplayName())) && (this.description == null && other.getDescription() == null || this.description != null && this.description.equals(other.getDescription())) && (this.rate == null && other.getRate() == null || this.rate != null && this.rate.equals(other.getRate())) && (this.taxType == null && other.getTaxType() == null || this.taxType != null && this.taxType.equals(other.getTaxType())) && (this.taxAgency == null && other.getTaxAgency() == null || this.taxAgency != null && this.taxAgency.equals(other.getTaxAgency())) && (this.purchaseAccount == null && other.getPurchaseAccount() == null || this.purchaseAccount != null && this.purchaseAccount.equals(other.getPurchaseAccount())) && (this.saleAccount == null && other.getSaleAccount() == null || this.saleAccount != null && this.saleAccount.equals(other.getSaleAccount())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && this.isInactive.equals(other.getIsInactive())) && (this.effectiveFrom == null && other.getEffectiveFrom() == null || this.effectiveFrom != null && this.effectiveFrom.equals(other.getEffectiveFrom())) && (this.validUntil == null && other.getValidUntil() == null || this.validUntil != null && this.validUntil.equals(other.getValidUntil())) && (this.subsidiaryList == null && other.getSubsidiaryList() == null || this.subsidiaryList != null && this.subsidiaryList.equals(other.getSubsidiaryList())) && (this.includeChildren == null && other.getIncludeChildren() == null || this.includeChildren != null && this.includeChildren.equals(other.getIncludeChildren())) && (this.eccode == null && other.getEccode() == null || this.eccode != null && this.eccode.equals(other.getEccode())) && (this.reverseCharge == null && other.getReverseCharge() == null || this.reverseCharge != null && this.reverseCharge.equals(other.getReverseCharge())) && (this.parent == null && other.getParent() == null || this.parent != null && this.parent.equals(other.getParent())) && (this.service == null && other.getService() == null || this.service != null && this.service.equals(other.getService())) && (this.exempt == null && other.getExempt() == null || this.exempt != null && this.exempt.equals(other.getExempt())) && (this.isDefault == null && other.getIsDefault() == null || this.isDefault != null && this.isDefault.equals(other.getIsDefault())) && (this.excludeFromTaxReports == null && other.getExcludeFromTaxReports() == null || this.excludeFromTaxReports != null && this.excludeFromTaxReports.equals(other.getExcludeFromTaxReports())) && (this.available == null && other.getAvailable() == null || this.available != null && this.available.equals(other.getAvailable())) && (this.export == null && other.getExport() == null || this.export != null && this.export.equals(other.getExport())) && (this.taxAccount == null && other.getTaxAccount() == null || this.taxAccount != null && this.taxAccount.equals(other.getTaxAccount())) && (this.county == null && other.getCounty() == null || this.county != null && this.county.equals(other.getCounty())) && (this.city == null && other.getCity() == null || this.city != null && this.city.equals(other.getCity())) && (this.state == null && other.getState() == null || this.state != null && this.state.equals(other.getState())) && (this.zip == null && other.getZip() == null || this.zip != null && this.zip.equals(other.getZip())) && (this.nexusCountry == null && other.getNexusCountry() == null || this.nexusCountry != null && this.nexusCountry.equals(other.getNexusCountry())) && (this.name == null && other.getName() == null || this.name != null && this.name.equals(other.getName())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
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
        if (this.getItemId() != null) {
            _hashCode += this.getItemId().hashCode();
        }
        if (this.getDisplayName() != null) {
            _hashCode += this.getDisplayName().hashCode();
        }
        if (this.getDescription() != null) {
            _hashCode += this.getDescription().hashCode();
        }
        if (this.getRate() != null) {
            _hashCode += this.getRate().hashCode();
        }
        if (this.getTaxType() != null) {
            _hashCode += this.getTaxType().hashCode();
        }
        if (this.getTaxAgency() != null) {
            _hashCode += this.getTaxAgency().hashCode();
        }
        if (this.getPurchaseAccount() != null) {
            _hashCode += this.getPurchaseAccount().hashCode();
        }
        if (this.getSaleAccount() != null) {
            _hashCode += this.getSaleAccount().hashCode();
        }
        if (this.getIsInactive() != null) {
            _hashCode += this.getIsInactive().hashCode();
        }
        if (this.getEffectiveFrom() != null) {
            _hashCode += this.getEffectiveFrom().hashCode();
        }
        if (this.getValidUntil() != null) {
            _hashCode += this.getValidUntil().hashCode();
        }
        if (this.getSubsidiaryList() != null) {
            _hashCode += this.getSubsidiaryList().hashCode();
        }
        if (this.getIncludeChildren() != null) {
            _hashCode += this.getIncludeChildren().hashCode();
        }
        if (this.getEccode() != null) {
            _hashCode += this.getEccode().hashCode();
        }
        if (this.getReverseCharge() != null) {
            _hashCode += this.getReverseCharge().hashCode();
        }
        if (this.getParent() != null) {
            _hashCode += this.getParent().hashCode();
        }
        if (this.getService() != null) {
            _hashCode += this.getService().hashCode();
        }
        if (this.getExempt() != null) {
            _hashCode += this.getExempt().hashCode();
        }
        if (this.getIsDefault() != null) {
            _hashCode += this.getIsDefault().hashCode();
        }
        if (this.getExcludeFromTaxReports() != null) {
            _hashCode += this.getExcludeFromTaxReports().hashCode();
        }
        if (this.getAvailable() != null) {
            _hashCode += this.getAvailable().hashCode();
        }
        if (this.getExport() != null) {
            _hashCode += this.getExport().hashCode();
        }
        if (this.getTaxAccount() != null) {
            _hashCode += this.getTaxAccount().hashCode();
        }
        if (this.getCounty() != null) {
            _hashCode += this.getCounty().hashCode();
        }
        if (this.getCity() != null) {
            _hashCode += this.getCity().hashCode();
        }
        if (this.getState() != null) {
            _hashCode += this.getState().hashCode();
        }
        if (this.getZip() != null) {
            _hashCode += this.getZip().hashCode();
        }
        if (this.getNexusCountry() != null) {
            _hashCode += this.getNexusCountry().hashCode();
        }
        if (this.getName() != null) {
            _hashCode += this.getName().hashCode();
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
        typeDesc.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "SalesTaxItem"));
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
        elemField.setFieldName("itemId");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "itemId"));
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
        elemField.setFieldName("description");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "description"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("taxType");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "taxType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxAgency");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "taxAgency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("purchaseAccount");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "purchaseAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("saleAccount");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "saleAccount"));
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
        elemField.setFieldName("effectiveFrom");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "effectiveFrom"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("validUntil");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "validUntil"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("eccode");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "eccode"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("reverseCharge");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "reverseCharge"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
        elemField.setFieldName("service");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "service"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("exempt");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "exempt"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isDefault");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "isDefault"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("excludeFromTaxReports");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "excludeFromTaxReports"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("available");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "available"));
        elemField.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "SalesTaxItemAvailable"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("export");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "export"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxAccount");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "taxAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("county");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "county"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "city"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "state"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("zip");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "zip"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("nexusCountry");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "nexusCountry"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "name"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
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

