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
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchCustomFieldList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchDateField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchDoubleField;
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

public class EntityGroupSearchBasic
extends SearchRecordBasic
implements Serializable {
    private SearchStringField email;
    private SearchMultiSelectField externalId;
    private SearchStringField externalIdString;
    private SearchStringField groupName;
    private SearchMultiSelectField groupOwner;
    private SearchMultiSelectField groupType;
    private SearchMultiSelectField internalId;
    private SearchLongField internalIdNumber;
    private SearchBooleanField isDynamic;
    private SearchBooleanField isInactive;
    private SearchBooleanField isManufacturingWorkCenter;
    private SearchBooleanField isPrivate;
    private SearchDoubleField laborResources;
    private SearchDateField lastModifiedDate;
    private SearchDoubleField machineResources;
    private SearchMultiSelectField subsidiary;
    private SearchMultiSelectField workCalendar;
    private SearchCustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(EntityGroupSearchBasic.class, true);

    public EntityGroupSearchBasic() {
    }

    public EntityGroupSearchBasic(SearchStringField email, SearchMultiSelectField externalId, SearchStringField externalIdString, SearchStringField groupName, SearchMultiSelectField groupOwner, SearchMultiSelectField groupType, SearchMultiSelectField internalId, SearchLongField internalIdNumber, SearchBooleanField isDynamic, SearchBooleanField isInactive, SearchBooleanField isManufacturingWorkCenter, SearchBooleanField isPrivate, SearchDoubleField laborResources, SearchDateField lastModifiedDate, SearchDoubleField machineResources, SearchMultiSelectField subsidiary, SearchMultiSelectField workCalendar, SearchCustomFieldList customFieldList) {
        this.email = email;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.groupName = groupName;
        this.groupOwner = groupOwner;
        this.groupType = groupType;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isDynamic = isDynamic;
        this.isInactive = isInactive;
        this.isManufacturingWorkCenter = isManufacturingWorkCenter;
        this.isPrivate = isPrivate;
        this.laborResources = laborResources;
        this.lastModifiedDate = lastModifiedDate;
        this.machineResources = machineResources;
        this.subsidiary = subsidiary;
        this.workCalendar = workCalendar;
        this.customFieldList = customFieldList;
    }

    public SearchStringField getEmail() {
        return this.email;
    }

    public void setEmail(SearchStringField email) {
        this.email = email;
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

    public SearchStringField getGroupName() {
        return this.groupName;
    }

    public void setGroupName(SearchStringField groupName) {
        this.groupName = groupName;
    }

    public SearchMultiSelectField getGroupOwner() {
        return this.groupOwner;
    }

    public void setGroupOwner(SearchMultiSelectField groupOwner) {
        this.groupOwner = groupOwner;
    }

    public SearchMultiSelectField getGroupType() {
        return this.groupType;
    }

    public void setGroupType(SearchMultiSelectField groupType) {
        this.groupType = groupType;
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

    public SearchBooleanField getIsDynamic() {
        return this.isDynamic;
    }

    public void setIsDynamic(SearchBooleanField isDynamic) {
        this.isDynamic = isDynamic;
    }

    public SearchBooleanField getIsInactive() {
        return this.isInactive;
    }

    public void setIsInactive(SearchBooleanField isInactive) {
        this.isInactive = isInactive;
    }

    public SearchBooleanField getIsManufacturingWorkCenter() {
        return this.isManufacturingWorkCenter;
    }

    public void setIsManufacturingWorkCenter(SearchBooleanField isManufacturingWorkCenter) {
        this.isManufacturingWorkCenter = isManufacturingWorkCenter;
    }

    public SearchBooleanField getIsPrivate() {
        return this.isPrivate;
    }

    public void setIsPrivate(SearchBooleanField isPrivate) {
        this.isPrivate = isPrivate;
    }

    public SearchDoubleField getLaborResources() {
        return this.laborResources;
    }

    public void setLaborResources(SearchDoubleField laborResources) {
        this.laborResources = laborResources;
    }

    public SearchDateField getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    public void setLastModifiedDate(SearchDateField lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public SearchDoubleField getMachineResources() {
        return this.machineResources;
    }

    public void setMachineResources(SearchDoubleField machineResources) {
        this.machineResources = machineResources;
    }

    public SearchMultiSelectField getSubsidiary() {
        return this.subsidiary;
    }

    public void setSubsidiary(SearchMultiSelectField subsidiary) {
        this.subsidiary = subsidiary;
    }

    public SearchMultiSelectField getWorkCalendar() {
        return this.workCalendar;
    }

    public void setWorkCalendar(SearchMultiSelectField workCalendar) {
        this.workCalendar = workCalendar;
    }

    public SearchCustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof EntityGroupSearchBasic)) {
            return false;
        }
        EntityGroupSearchBasic other = (EntityGroupSearchBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.email == null && other.getEmail() == null || this.email != null && this.email.equals(other.getEmail())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId())) && (this.externalIdString == null && other.getExternalIdString() == null || this.externalIdString != null && this.externalIdString.equals(other.getExternalIdString())) && (this.groupName == null && other.getGroupName() == null || this.groupName != null && this.groupName.equals(other.getGroupName())) && (this.groupOwner == null && other.getGroupOwner() == null || this.groupOwner != null && this.groupOwner.equals(other.getGroupOwner())) && (this.groupType == null && other.getGroupType() == null || this.groupType != null && this.groupType.equals(other.getGroupType())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.internalIdNumber == null && other.getInternalIdNumber() == null || this.internalIdNumber != null && this.internalIdNumber.equals(other.getInternalIdNumber())) && (this.isDynamic == null && other.getIsDynamic() == null || this.isDynamic != null && this.isDynamic.equals(other.getIsDynamic())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && this.isInactive.equals(other.getIsInactive())) && (this.isManufacturingWorkCenter == null && other.getIsManufacturingWorkCenter() == null || this.isManufacturingWorkCenter != null && this.isManufacturingWorkCenter.equals(other.getIsManufacturingWorkCenter())) && (this.isPrivate == null && other.getIsPrivate() == null || this.isPrivate != null && this.isPrivate.equals(other.getIsPrivate())) && (this.laborResources == null && other.getLaborResources() == null || this.laborResources != null && this.laborResources.equals(other.getLaborResources())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && this.lastModifiedDate.equals(other.getLastModifiedDate())) && (this.machineResources == null && other.getMachineResources() == null || this.machineResources != null && this.machineResources.equals(other.getMachineResources())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && this.subsidiary.equals(other.getSubsidiary())) && (this.workCalendar == null && other.getWorkCalendar() == null || this.workCalendar != null && this.workCalendar.equals(other.getWorkCalendar())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
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
        if (this.getEmail() != null) {
            _hashCode += this.getEmail().hashCode();
        }
        if (this.getExternalId() != null) {
            _hashCode += this.getExternalId().hashCode();
        }
        if (this.getExternalIdString() != null) {
            _hashCode += this.getExternalIdString().hashCode();
        }
        if (this.getGroupName() != null) {
            _hashCode += this.getGroupName().hashCode();
        }
        if (this.getGroupOwner() != null) {
            _hashCode += this.getGroupOwner().hashCode();
        }
        if (this.getGroupType() != null) {
            _hashCode += this.getGroupType().hashCode();
        }
        if (this.getInternalId() != null) {
            _hashCode += this.getInternalId().hashCode();
        }
        if (this.getInternalIdNumber() != null) {
            _hashCode += this.getInternalIdNumber().hashCode();
        }
        if (this.getIsDynamic() != null) {
            _hashCode += this.getIsDynamic().hashCode();
        }
        if (this.getIsInactive() != null) {
            _hashCode += this.getIsInactive().hashCode();
        }
        if (this.getIsManufacturingWorkCenter() != null) {
            _hashCode += this.getIsManufacturingWorkCenter().hashCode();
        }
        if (this.getIsPrivate() != null) {
            _hashCode += this.getIsPrivate().hashCode();
        }
        if (this.getLaborResources() != null) {
            _hashCode += this.getLaborResources().hashCode();
        }
        if (this.getLastModifiedDate() != null) {
            _hashCode += this.getLastModifiedDate().hashCode();
        }
        if (this.getMachineResources() != null) {
            _hashCode += this.getMachineResources().hashCode();
        }
        if (this.getSubsidiary() != null) {
            _hashCode += this.getSubsidiary().hashCode();
        }
        if (this.getWorkCalendar() != null) {
            _hashCode += this.getWorkCalendar().hashCode();
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "EntityGroupSearchBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "email"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
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
        elemField.setFieldName("groupName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "groupName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("groupOwner");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "groupOwner"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("groupType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "groupType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("isDynamic");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isDynamic"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("isManufacturingWorkCenter");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isManufacturingWorkCenter"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isPrivate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isPrivate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("laborResources");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "laborResources"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("machineResources");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "machineResources"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
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
        elemField.setFieldName("workCalendar");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "workCalendar"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchCustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

