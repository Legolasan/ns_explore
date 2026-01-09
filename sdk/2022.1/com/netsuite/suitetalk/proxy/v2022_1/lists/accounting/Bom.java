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

public class Bom
extends Record
implements Serializable {
    private RecordRef customForm;
    private String name;
    private Boolean usedOnAssembly;
    private Calendar createdDate;
    private Boolean isInactive;
    private Boolean useComponentYield;
    private String memo;
    private RecordRef legacyBomForAssembly;
    private Boolean availableForAllAssemblies;
    private RecordRefList restrictToAssembliesList;
    private Boolean availableForAllLocations;
    private RecordRefList restrictToLocationsList;
    private RecordRefList subsidiaryList;
    private Boolean includeChildren;
    private CustomFieldList customFieldList;
    private String internalId;
    private String externalId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(Bom.class, true);

    public Bom() {
    }

    public Bom(NullField nullFieldList, String internalId, String externalId, RecordRef customForm, String name, Boolean usedOnAssembly, Calendar createdDate, Boolean isInactive, Boolean useComponentYield, String memo, RecordRef legacyBomForAssembly, Boolean availableForAllAssemblies, RecordRefList restrictToAssembliesList, Boolean availableForAllLocations, RecordRefList restrictToLocationsList, RecordRefList subsidiaryList, Boolean includeChildren, CustomFieldList customFieldList) {
        super(nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.customForm = customForm;
        this.name = name;
        this.usedOnAssembly = usedOnAssembly;
        this.createdDate = createdDate;
        this.isInactive = isInactive;
        this.useComponentYield = useComponentYield;
        this.memo = memo;
        this.legacyBomForAssembly = legacyBomForAssembly;
        this.availableForAllAssemblies = availableForAllAssemblies;
        this.restrictToAssembliesList = restrictToAssembliesList;
        this.availableForAllLocations = availableForAllLocations;
        this.restrictToLocationsList = restrictToLocationsList;
        this.subsidiaryList = subsidiaryList;
        this.includeChildren = includeChildren;
        this.customFieldList = customFieldList;
    }

    public RecordRef getCustomForm() {
        return this.customForm;
    }

    public void setCustomForm(RecordRef customForm) {
        this.customForm = customForm;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getUsedOnAssembly() {
        return this.usedOnAssembly;
    }

    public void setUsedOnAssembly(Boolean usedOnAssembly) {
        this.usedOnAssembly = usedOnAssembly;
    }

    public Calendar getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(Calendar createdDate) {
        this.createdDate = createdDate;
    }

    public Boolean getIsInactive() {
        return this.isInactive;
    }

    public void setIsInactive(Boolean isInactive) {
        this.isInactive = isInactive;
    }

    public Boolean getUseComponentYield() {
        return this.useComponentYield;
    }

    public void setUseComponentYield(Boolean useComponentYield) {
        this.useComponentYield = useComponentYield;
    }

    public String getMemo() {
        return this.memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public RecordRef getLegacyBomForAssembly() {
        return this.legacyBomForAssembly;
    }

    public void setLegacyBomForAssembly(RecordRef legacyBomForAssembly) {
        this.legacyBomForAssembly = legacyBomForAssembly;
    }

    public Boolean getAvailableForAllAssemblies() {
        return this.availableForAllAssemblies;
    }

    public void setAvailableForAllAssemblies(Boolean availableForAllAssemblies) {
        this.availableForAllAssemblies = availableForAllAssemblies;
    }

    public RecordRefList getRestrictToAssembliesList() {
        return this.restrictToAssembliesList;
    }

    public void setRestrictToAssembliesList(RecordRefList restrictToAssembliesList) {
        this.restrictToAssembliesList = restrictToAssembliesList;
    }

    public Boolean getAvailableForAllLocations() {
        return this.availableForAllLocations;
    }

    public void setAvailableForAllLocations(Boolean availableForAllLocations) {
        this.availableForAllLocations = availableForAllLocations;
    }

    public RecordRefList getRestrictToLocationsList() {
        return this.restrictToLocationsList;
    }

    public void setRestrictToLocationsList(RecordRefList restrictToLocationsList) {
        this.restrictToLocationsList = restrictToLocationsList;
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
        if (!(obj instanceof Bom)) {
            return false;
        }
        Bom other = (Bom)obj;
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
        boolean _equals = super.equals(obj) && (this.customForm == null && other.getCustomForm() == null || this.customForm != null && this.customForm.equals(other.getCustomForm())) && (this.name == null && other.getName() == null || this.name != null && this.name.equals(other.getName())) && (this.usedOnAssembly == null && other.getUsedOnAssembly() == null || this.usedOnAssembly != null && this.usedOnAssembly.equals(other.getUsedOnAssembly())) && (this.createdDate == null && other.getCreatedDate() == null || this.createdDate != null && this.createdDate.equals(other.getCreatedDate())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && this.isInactive.equals(other.getIsInactive())) && (this.useComponentYield == null && other.getUseComponentYield() == null || this.useComponentYield != null && this.useComponentYield.equals(other.getUseComponentYield())) && (this.memo == null && other.getMemo() == null || this.memo != null && this.memo.equals(other.getMemo())) && (this.legacyBomForAssembly == null && other.getLegacyBomForAssembly() == null || this.legacyBomForAssembly != null && this.legacyBomForAssembly.equals(other.getLegacyBomForAssembly())) && (this.availableForAllAssemblies == null && other.getAvailableForAllAssemblies() == null || this.availableForAllAssemblies != null && this.availableForAllAssemblies.equals(other.getAvailableForAllAssemblies())) && (this.restrictToAssembliesList == null && other.getRestrictToAssembliesList() == null || this.restrictToAssembliesList != null && this.restrictToAssembliesList.equals(other.getRestrictToAssembliesList())) && (this.availableForAllLocations == null && other.getAvailableForAllLocations() == null || this.availableForAllLocations != null && this.availableForAllLocations.equals(other.getAvailableForAllLocations())) && (this.restrictToLocationsList == null && other.getRestrictToLocationsList() == null || this.restrictToLocationsList != null && this.restrictToLocationsList.equals(other.getRestrictToLocationsList())) && (this.subsidiaryList == null && other.getSubsidiaryList() == null || this.subsidiaryList != null && this.subsidiaryList.equals(other.getSubsidiaryList())) && (this.includeChildren == null && other.getIncludeChildren() == null || this.includeChildren != null && this.includeChildren.equals(other.getIncludeChildren())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
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
        if (this.getCustomForm() != null) {
            _hashCode += this.getCustomForm().hashCode();
        }
        if (this.getName() != null) {
            _hashCode += this.getName().hashCode();
        }
        if (this.getUsedOnAssembly() != null) {
            _hashCode += this.getUsedOnAssembly().hashCode();
        }
        if (this.getCreatedDate() != null) {
            _hashCode += this.getCreatedDate().hashCode();
        }
        if (this.getIsInactive() != null) {
            _hashCode += this.getIsInactive().hashCode();
        }
        if (this.getUseComponentYield() != null) {
            _hashCode += this.getUseComponentYield().hashCode();
        }
        if (this.getMemo() != null) {
            _hashCode += this.getMemo().hashCode();
        }
        if (this.getLegacyBomForAssembly() != null) {
            _hashCode += this.getLegacyBomForAssembly().hashCode();
        }
        if (this.getAvailableForAllAssemblies() != null) {
            _hashCode += this.getAvailableForAllAssemblies().hashCode();
        }
        if (this.getRestrictToAssembliesList() != null) {
            _hashCode += this.getRestrictToAssembliesList().hashCode();
        }
        if (this.getAvailableForAllLocations() != null) {
            _hashCode += this.getAvailableForAllLocations().hashCode();
        }
        if (this.getRestrictToLocationsList() != null) {
            _hashCode += this.getRestrictToLocationsList().hashCode();
        }
        if (this.getSubsidiaryList() != null) {
            _hashCode += this.getSubsidiaryList().hashCode();
        }
        if (this.getIncludeChildren() != null) {
            _hashCode += this.getIncludeChildren().hashCode();
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
        typeDesc.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "Bom"));
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
        elemField.setFieldName("customForm");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "customForm"));
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
        elemField.setFieldName("usedOnAssembly");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "usedOnAssembly"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("useComponentYield");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "useComponentYield"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("legacyBomForAssembly");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "legacyBomForAssembly"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("availableForAllAssemblies");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "availableForAllAssemblies"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("restrictToAssembliesList");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "restrictToAssembliesList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRefList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("availableForAllLocations");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "availableForAllLocations"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("restrictToLocationsList");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "restrictToLocationsList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRefList"));
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
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "CustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

