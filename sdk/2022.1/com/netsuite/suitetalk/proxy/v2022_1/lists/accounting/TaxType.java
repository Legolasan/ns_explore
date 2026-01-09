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

import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.TaxTypeNexusAccountsList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.TaxTypeNexusesTaxList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.types.Country;
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

public class TaxType
extends Record
implements Serializable {
    private String name;
    private String description;
    private Boolean doesNotAddToTotal;
    private Boolean postToItemCost;
    private Boolean taxInNetAmount;
    private Boolean reverseCharge;
    private Boolean isInactive;
    private TaxTypeNexusAccountsList nexusAccountsList;
    private TaxTypeNexusesTaxList nexusesTaxList;
    private Country country;
    private String internalId;
    private String externalId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(TaxType.class, true);

    public TaxType() {
    }

    public TaxType(NullField nullFieldList, String internalId, String externalId, String name, String description, Boolean doesNotAddToTotal, Boolean postToItemCost, Boolean taxInNetAmount, Boolean reverseCharge, Boolean isInactive, TaxTypeNexusAccountsList nexusAccountsList, TaxTypeNexusesTaxList nexusesTaxList, Country country) {
        super(nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.name = name;
        this.description = description;
        this.doesNotAddToTotal = doesNotAddToTotal;
        this.postToItemCost = postToItemCost;
        this.taxInNetAmount = taxInNetAmount;
        this.reverseCharge = reverseCharge;
        this.isInactive = isInactive;
        this.nexusAccountsList = nexusAccountsList;
        this.nexusesTaxList = nexusesTaxList;
        this.country = country;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getDoesNotAddToTotal() {
        return this.doesNotAddToTotal;
    }

    public void setDoesNotAddToTotal(Boolean doesNotAddToTotal) {
        this.doesNotAddToTotal = doesNotAddToTotal;
    }

    public Boolean getPostToItemCost() {
        return this.postToItemCost;
    }

    public void setPostToItemCost(Boolean postToItemCost) {
        this.postToItemCost = postToItemCost;
    }

    public Boolean getTaxInNetAmount() {
        return this.taxInNetAmount;
    }

    public void setTaxInNetAmount(Boolean taxInNetAmount) {
        this.taxInNetAmount = taxInNetAmount;
    }

    public Boolean getReverseCharge() {
        return this.reverseCharge;
    }

    public void setReverseCharge(Boolean reverseCharge) {
        this.reverseCharge = reverseCharge;
    }

    public Boolean getIsInactive() {
        return this.isInactive;
    }

    public void setIsInactive(Boolean isInactive) {
        this.isInactive = isInactive;
    }

    public TaxTypeNexusAccountsList getNexusAccountsList() {
        return this.nexusAccountsList;
    }

    public void setNexusAccountsList(TaxTypeNexusAccountsList nexusAccountsList) {
        this.nexusAccountsList = nexusAccountsList;
    }

    public TaxTypeNexusesTaxList getNexusesTaxList() {
        return this.nexusesTaxList;
    }

    public void setNexusesTaxList(TaxTypeNexusesTaxList nexusesTaxList) {
        this.nexusesTaxList = nexusesTaxList;
    }

    public Country getCountry() {
        return this.country;
    }

    public void setCountry(Country country) {
        this.country = country;
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
        if (!(obj instanceof TaxType)) {
            return false;
        }
        TaxType other = (TaxType)obj;
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
        boolean _equals = super.equals(obj) && (this.name == null && other.getName() == null || this.name != null && this.name.equals(other.getName())) && (this.description == null && other.getDescription() == null || this.description != null && this.description.equals(other.getDescription())) && (this.doesNotAddToTotal == null && other.getDoesNotAddToTotal() == null || this.doesNotAddToTotal != null && this.doesNotAddToTotal.equals(other.getDoesNotAddToTotal())) && (this.postToItemCost == null && other.getPostToItemCost() == null || this.postToItemCost != null && this.postToItemCost.equals(other.getPostToItemCost())) && (this.taxInNetAmount == null && other.getTaxInNetAmount() == null || this.taxInNetAmount != null && this.taxInNetAmount.equals(other.getTaxInNetAmount())) && (this.reverseCharge == null && other.getReverseCharge() == null || this.reverseCharge != null && this.reverseCharge.equals(other.getReverseCharge())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && this.isInactive.equals(other.getIsInactive())) && (this.nexusAccountsList == null && other.getNexusAccountsList() == null || this.nexusAccountsList != null && this.nexusAccountsList.equals(other.getNexusAccountsList())) && (this.nexusesTaxList == null && other.getNexusesTaxList() == null || this.nexusesTaxList != null && this.nexusesTaxList.equals(other.getNexusesTaxList())) && (this.country == null && other.getCountry() == null || this.country != null && this.country.equals(other.getCountry())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
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
        if (this.getDescription() != null) {
            _hashCode += this.getDescription().hashCode();
        }
        if (this.getDoesNotAddToTotal() != null) {
            _hashCode += this.getDoesNotAddToTotal().hashCode();
        }
        if (this.getPostToItemCost() != null) {
            _hashCode += this.getPostToItemCost().hashCode();
        }
        if (this.getTaxInNetAmount() != null) {
            _hashCode += this.getTaxInNetAmount().hashCode();
        }
        if (this.getReverseCharge() != null) {
            _hashCode += this.getReverseCharge().hashCode();
        }
        if (this.getIsInactive() != null) {
            _hashCode += this.getIsInactive().hashCode();
        }
        if (this.getNexusAccountsList() != null) {
            _hashCode += this.getNexusAccountsList().hashCode();
        }
        if (this.getNexusesTaxList() != null) {
            _hashCode += this.getNexusesTaxList().hashCode();
        }
        if (this.getCountry() != null) {
            _hashCode += this.getCountry().hashCode();
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
        typeDesc.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "TaxType"));
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
        elemField.setFieldName("description");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "description"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("doesNotAddToTotal");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "doesNotAddToTotal"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("postToItemCost");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "postToItemCost"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxInNetAmount");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "taxInNetAmount"));
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
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("nexusAccountsList");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "nexusAccountsList"));
        elemField.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "TaxTypeNexusAccountsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("nexusesTaxList");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "nexusesTaxList"));
        elemField.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "TaxTypeNexusesTaxList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "country"));
        elemField.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "Country"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

