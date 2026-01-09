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

public class BomSearchBasic
extends SearchRecordBasic
implements Serializable {
    private SearchBooleanField availableForAllAssemblies;
    private SearchBooleanField availableForAllLocations;
    private SearchDateField createdDate;
    private SearchMultiSelectField externalId;
    private SearchStringField externalIdString;
    private SearchBooleanField includeChildren;
    private SearchMultiSelectField internalId;
    private SearchLongField internalIdNumber;
    private SearchBooleanField isInactive;
    private SearchMultiSelectField legacyBomForAssembly;
    private SearchStringField memo;
    private SearchStringField name;
    private SearchMultiSelectField restrictToAssemblies;
    private SearchMultiSelectField restrictToLocations;
    private SearchMultiSelectField subsidiary;
    private SearchBooleanField useComponentYield;
    private SearchBooleanField usedOnAssembly;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(BomSearchBasic.class, true);

    public BomSearchBasic() {
    }

    public BomSearchBasic(SearchBooleanField availableForAllAssemblies, SearchBooleanField availableForAllLocations, SearchDateField createdDate, SearchMultiSelectField externalId, SearchStringField externalIdString, SearchBooleanField includeChildren, SearchMultiSelectField internalId, SearchLongField internalIdNumber, SearchBooleanField isInactive, SearchMultiSelectField legacyBomForAssembly, SearchStringField memo, SearchStringField name, SearchMultiSelectField restrictToAssemblies, SearchMultiSelectField restrictToLocations, SearchMultiSelectField subsidiary, SearchBooleanField useComponentYield, SearchBooleanField usedOnAssembly) {
        this.availableForAllAssemblies = availableForAllAssemblies;
        this.availableForAllLocations = availableForAllLocations;
        this.createdDate = createdDate;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.includeChildren = includeChildren;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isInactive = isInactive;
        this.legacyBomForAssembly = legacyBomForAssembly;
        this.memo = memo;
        this.name = name;
        this.restrictToAssemblies = restrictToAssemblies;
        this.restrictToLocations = restrictToLocations;
        this.subsidiary = subsidiary;
        this.useComponentYield = useComponentYield;
        this.usedOnAssembly = usedOnAssembly;
    }

    public SearchBooleanField getAvailableForAllAssemblies() {
        return this.availableForAllAssemblies;
    }

    public void setAvailableForAllAssemblies(SearchBooleanField availableForAllAssemblies) {
        this.availableForAllAssemblies = availableForAllAssemblies;
    }

    public SearchBooleanField getAvailableForAllLocations() {
        return this.availableForAllLocations;
    }

    public void setAvailableForAllLocations(SearchBooleanField availableForAllLocations) {
        this.availableForAllLocations = availableForAllLocations;
    }

    public SearchDateField getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(SearchDateField createdDate) {
        this.createdDate = createdDate;
    }

    public SearchMultiSelectField getExternalId() {
        return this.externalId;
    }

    public void setExternalId(SearchMultiSelectField externalId) {
        this.externalId = externalId;
    }

    public SearchStringField getExternalIdString() {
        return this.externalIdString;
    }

    public void setExternalIdString(SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }

    public SearchBooleanField getIncludeChildren() {
        return this.includeChildren;
    }

    public void setIncludeChildren(SearchBooleanField includeChildren) {
        this.includeChildren = includeChildren;
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

    public SearchBooleanField getIsInactive() {
        return this.isInactive;
    }

    public void setIsInactive(SearchBooleanField isInactive) {
        this.isInactive = isInactive;
    }

    public SearchMultiSelectField getLegacyBomForAssembly() {
        return this.legacyBomForAssembly;
    }

    public void setLegacyBomForAssembly(SearchMultiSelectField legacyBomForAssembly) {
        this.legacyBomForAssembly = legacyBomForAssembly;
    }

    public SearchStringField getMemo() {
        return this.memo;
    }

    public void setMemo(SearchStringField memo) {
        this.memo = memo;
    }

    public SearchStringField getName() {
        return this.name;
    }

    public void setName(SearchStringField name) {
        this.name = name;
    }

    public SearchMultiSelectField getRestrictToAssemblies() {
        return this.restrictToAssemblies;
    }

    public void setRestrictToAssemblies(SearchMultiSelectField restrictToAssemblies) {
        this.restrictToAssemblies = restrictToAssemblies;
    }

    public SearchMultiSelectField getRestrictToLocations() {
        return this.restrictToLocations;
    }

    public void setRestrictToLocations(SearchMultiSelectField restrictToLocations) {
        this.restrictToLocations = restrictToLocations;
    }

    public SearchMultiSelectField getSubsidiary() {
        return this.subsidiary;
    }

    public void setSubsidiary(SearchMultiSelectField subsidiary) {
        this.subsidiary = subsidiary;
    }

    public SearchBooleanField getUseComponentYield() {
        return this.useComponentYield;
    }

    public void setUseComponentYield(SearchBooleanField useComponentYield) {
        this.useComponentYield = useComponentYield;
    }

    public SearchBooleanField getUsedOnAssembly() {
        return this.usedOnAssembly;
    }

    public void setUsedOnAssembly(SearchBooleanField usedOnAssembly) {
        this.usedOnAssembly = usedOnAssembly;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof BomSearchBasic)) {
            return false;
        }
        BomSearchBasic other = (BomSearchBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.availableForAllAssemblies == null && other.getAvailableForAllAssemblies() == null || this.availableForAllAssemblies != null && this.availableForAllAssemblies.equals(other.getAvailableForAllAssemblies())) && (this.availableForAllLocations == null && other.getAvailableForAllLocations() == null || this.availableForAllLocations != null && this.availableForAllLocations.equals(other.getAvailableForAllLocations())) && (this.createdDate == null && other.getCreatedDate() == null || this.createdDate != null && this.createdDate.equals(other.getCreatedDate())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId())) && (this.externalIdString == null && other.getExternalIdString() == null || this.externalIdString != null && this.externalIdString.equals(other.getExternalIdString())) && (this.includeChildren == null && other.getIncludeChildren() == null || this.includeChildren != null && this.includeChildren.equals(other.getIncludeChildren())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.internalIdNumber == null && other.getInternalIdNumber() == null || this.internalIdNumber != null && this.internalIdNumber.equals(other.getInternalIdNumber())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && this.isInactive.equals(other.getIsInactive())) && (this.legacyBomForAssembly == null && other.getLegacyBomForAssembly() == null || this.legacyBomForAssembly != null && this.legacyBomForAssembly.equals(other.getLegacyBomForAssembly())) && (this.memo == null && other.getMemo() == null || this.memo != null && this.memo.equals(other.getMemo())) && (this.name == null && other.getName() == null || this.name != null && this.name.equals(other.getName())) && (this.restrictToAssemblies == null && other.getRestrictToAssemblies() == null || this.restrictToAssemblies != null && this.restrictToAssemblies.equals(other.getRestrictToAssemblies())) && (this.restrictToLocations == null && other.getRestrictToLocations() == null || this.restrictToLocations != null && this.restrictToLocations.equals(other.getRestrictToLocations())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && this.subsidiary.equals(other.getSubsidiary())) && (this.useComponentYield == null && other.getUseComponentYield() == null || this.useComponentYield != null && this.useComponentYield.equals(other.getUseComponentYield())) && (this.usedOnAssembly == null && other.getUsedOnAssembly() == null || this.usedOnAssembly != null && this.usedOnAssembly.equals(other.getUsedOnAssembly()));
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
        if (this.getAvailableForAllAssemblies() != null) {
            _hashCode += this.getAvailableForAllAssemblies().hashCode();
        }
        if (this.getAvailableForAllLocations() != null) {
            _hashCode += this.getAvailableForAllLocations().hashCode();
        }
        if (this.getCreatedDate() != null) {
            _hashCode += this.getCreatedDate().hashCode();
        }
        if (this.getExternalId() != null) {
            _hashCode += this.getExternalId().hashCode();
        }
        if (this.getExternalIdString() != null) {
            _hashCode += this.getExternalIdString().hashCode();
        }
        if (this.getIncludeChildren() != null) {
            _hashCode += this.getIncludeChildren().hashCode();
        }
        if (this.getInternalId() != null) {
            _hashCode += this.getInternalId().hashCode();
        }
        if (this.getInternalIdNumber() != null) {
            _hashCode += this.getInternalIdNumber().hashCode();
        }
        if (this.getIsInactive() != null) {
            _hashCode += this.getIsInactive().hashCode();
        }
        if (this.getLegacyBomForAssembly() != null) {
            _hashCode += this.getLegacyBomForAssembly().hashCode();
        }
        if (this.getMemo() != null) {
            _hashCode += this.getMemo().hashCode();
        }
        if (this.getName() != null) {
            _hashCode += this.getName().hashCode();
        }
        if (this.getRestrictToAssemblies() != null) {
            _hashCode += this.getRestrictToAssemblies().hashCode();
        }
        if (this.getRestrictToLocations() != null) {
            _hashCode += this.getRestrictToLocations().hashCode();
        }
        if (this.getSubsidiary() != null) {
            _hashCode += this.getSubsidiary().hashCode();
        }
        if (this.getUseComponentYield() != null) {
            _hashCode += this.getUseComponentYield().hashCode();
        }
        if (this.getUsedOnAssembly() != null) {
            _hashCode += this.getUsedOnAssembly().hashCode();
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "BomSearchBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("availableForAllAssemblies");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "availableForAllAssemblies"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("availableForAllLocations");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "availableForAllLocations"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "externalId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("externalIdString");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "externalIdString"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("includeChildren");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "includeChildren"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("legacyBomForAssembly");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "legacyBomForAssembly"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "name"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("restrictToAssemblies");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "restrictToAssemblies"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("restrictToLocations");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "restrictToLocations"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("useComponentYield");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "useComponentYield"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("usedOnAssembly");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "usedOnAssembly"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

