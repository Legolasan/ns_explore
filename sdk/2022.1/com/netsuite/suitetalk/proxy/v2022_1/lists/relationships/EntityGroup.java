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
package com.netsuite.suitetalk.proxy.v2022_1.lists.relationships;

import com.netsuite.suitetalk.proxy.v2022_1.lists.relationships.types.EntityGroupType;
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

public class EntityGroup
extends Record
implements Serializable {
    private String groupName;
    private EntityGroupType groupType;
    private String email;
    private RecordRef groupOwner;
    private Boolean isSavedSearch;
    private EntityGroupType parentGroupType;
    private RecordRef savedSearch;
    private Boolean isSalesTeam;
    private String comments;
    private Boolean isPrivate;
    private RecordRef restrictionGroup;
    private Boolean isInactive;
    private Boolean isSalesRep;
    private Boolean isSupportRep;
    private Boolean isProductTeam;
    private Boolean isFunctionalTeam;
    private RecordRef issueRole;
    private Boolean isManufacturingWorkCenter;
    private RecordRef subsidiary;
    private Double machineResources;
    private Double laborResources;
    private RecordRef workCalendar;
    private CustomFieldList customFieldList;
    private String internalId;
    private String externalId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(EntityGroup.class, true);

    public EntityGroup() {
    }

    public EntityGroup(NullField nullFieldList, String internalId, String externalId, String groupName, EntityGroupType groupType, String email, RecordRef groupOwner, Boolean isSavedSearch, EntityGroupType parentGroupType, RecordRef savedSearch, Boolean isSalesTeam, String comments, Boolean isPrivate, RecordRef restrictionGroup, Boolean isInactive, Boolean isSalesRep, Boolean isSupportRep, Boolean isProductTeam, Boolean isFunctionalTeam, RecordRef issueRole, Boolean isManufacturingWorkCenter, RecordRef subsidiary, Double machineResources, Double laborResources, RecordRef workCalendar, CustomFieldList customFieldList) {
        super(nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.groupName = groupName;
        this.groupType = groupType;
        this.email = email;
        this.groupOwner = groupOwner;
        this.isSavedSearch = isSavedSearch;
        this.parentGroupType = parentGroupType;
        this.savedSearch = savedSearch;
        this.isSalesTeam = isSalesTeam;
        this.comments = comments;
        this.isPrivate = isPrivate;
        this.restrictionGroup = restrictionGroup;
        this.isInactive = isInactive;
        this.isSalesRep = isSalesRep;
        this.isSupportRep = isSupportRep;
        this.isProductTeam = isProductTeam;
        this.isFunctionalTeam = isFunctionalTeam;
        this.issueRole = issueRole;
        this.isManufacturingWorkCenter = isManufacturingWorkCenter;
        this.subsidiary = subsidiary;
        this.machineResources = machineResources;
        this.laborResources = laborResources;
        this.workCalendar = workCalendar;
        this.customFieldList = customFieldList;
    }

    public String getGroupName() {
        return this.groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public EntityGroupType getGroupType() {
        return this.groupType;
    }

    public void setGroupType(EntityGroupType groupType) {
        this.groupType = groupType;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public RecordRef getGroupOwner() {
        return this.groupOwner;
    }

    public void setGroupOwner(RecordRef groupOwner) {
        this.groupOwner = groupOwner;
    }

    public Boolean getIsSavedSearch() {
        return this.isSavedSearch;
    }

    public void setIsSavedSearch(Boolean isSavedSearch) {
        this.isSavedSearch = isSavedSearch;
    }

    public EntityGroupType getParentGroupType() {
        return this.parentGroupType;
    }

    public void setParentGroupType(EntityGroupType parentGroupType) {
        this.parentGroupType = parentGroupType;
    }

    public RecordRef getSavedSearch() {
        return this.savedSearch;
    }

    public void setSavedSearch(RecordRef savedSearch) {
        this.savedSearch = savedSearch;
    }

    public Boolean getIsSalesTeam() {
        return this.isSalesTeam;
    }

    public void setIsSalesTeam(Boolean isSalesTeam) {
        this.isSalesTeam = isSalesTeam;
    }

    public String getComments() {
        return this.comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Boolean getIsPrivate() {
        return this.isPrivate;
    }

    public void setIsPrivate(Boolean isPrivate) {
        this.isPrivate = isPrivate;
    }

    public RecordRef getRestrictionGroup() {
        return this.restrictionGroup;
    }

    public void setRestrictionGroup(RecordRef restrictionGroup) {
        this.restrictionGroup = restrictionGroup;
    }

    public Boolean getIsInactive() {
        return this.isInactive;
    }

    public void setIsInactive(Boolean isInactive) {
        this.isInactive = isInactive;
    }

    public Boolean getIsSalesRep() {
        return this.isSalesRep;
    }

    public void setIsSalesRep(Boolean isSalesRep) {
        this.isSalesRep = isSalesRep;
    }

    public Boolean getIsSupportRep() {
        return this.isSupportRep;
    }

    public void setIsSupportRep(Boolean isSupportRep) {
        this.isSupportRep = isSupportRep;
    }

    public Boolean getIsProductTeam() {
        return this.isProductTeam;
    }

    public void setIsProductTeam(Boolean isProductTeam) {
        this.isProductTeam = isProductTeam;
    }

    public Boolean getIsFunctionalTeam() {
        return this.isFunctionalTeam;
    }

    public void setIsFunctionalTeam(Boolean isFunctionalTeam) {
        this.isFunctionalTeam = isFunctionalTeam;
    }

    public RecordRef getIssueRole() {
        return this.issueRole;
    }

    public void setIssueRole(RecordRef issueRole) {
        this.issueRole = issueRole;
    }

    public Boolean getIsManufacturingWorkCenter() {
        return this.isManufacturingWorkCenter;
    }

    public void setIsManufacturingWorkCenter(Boolean isManufacturingWorkCenter) {
        this.isManufacturingWorkCenter = isManufacturingWorkCenter;
    }

    public RecordRef getSubsidiary() {
        return this.subsidiary;
    }

    public void setSubsidiary(RecordRef subsidiary) {
        this.subsidiary = subsidiary;
    }

    public Double getMachineResources() {
        return this.machineResources;
    }

    public void setMachineResources(Double machineResources) {
        this.machineResources = machineResources;
    }

    public Double getLaborResources() {
        return this.laborResources;
    }

    public void setLaborResources(Double laborResources) {
        this.laborResources = laborResources;
    }

    public RecordRef getWorkCalendar() {
        return this.workCalendar;
    }

    public void setWorkCalendar(RecordRef workCalendar) {
        this.workCalendar = workCalendar;
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
        if (!(obj instanceof EntityGroup)) {
            return false;
        }
        EntityGroup other = (EntityGroup)obj;
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
        boolean _equals = super.equals(obj) && (this.groupName == null && other.getGroupName() == null || this.groupName != null && this.groupName.equals(other.getGroupName())) && (this.groupType == null && other.getGroupType() == null || this.groupType != null && this.groupType.equals(other.getGroupType())) && (this.email == null && other.getEmail() == null || this.email != null && this.email.equals(other.getEmail())) && (this.groupOwner == null && other.getGroupOwner() == null || this.groupOwner != null && this.groupOwner.equals(other.getGroupOwner())) && (this.isSavedSearch == null && other.getIsSavedSearch() == null || this.isSavedSearch != null && this.isSavedSearch.equals(other.getIsSavedSearch())) && (this.parentGroupType == null && other.getParentGroupType() == null || this.parentGroupType != null && this.parentGroupType.equals(other.getParentGroupType())) && (this.savedSearch == null && other.getSavedSearch() == null || this.savedSearch != null && this.savedSearch.equals(other.getSavedSearch())) && (this.isSalesTeam == null && other.getIsSalesTeam() == null || this.isSalesTeam != null && this.isSalesTeam.equals(other.getIsSalesTeam())) && (this.comments == null && other.getComments() == null || this.comments != null && this.comments.equals(other.getComments())) && (this.isPrivate == null && other.getIsPrivate() == null || this.isPrivate != null && this.isPrivate.equals(other.getIsPrivate())) && (this.restrictionGroup == null && other.getRestrictionGroup() == null || this.restrictionGroup != null && this.restrictionGroup.equals(other.getRestrictionGroup())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && this.isInactive.equals(other.getIsInactive())) && (this.isSalesRep == null && other.getIsSalesRep() == null || this.isSalesRep != null && this.isSalesRep.equals(other.getIsSalesRep())) && (this.isSupportRep == null && other.getIsSupportRep() == null || this.isSupportRep != null && this.isSupportRep.equals(other.getIsSupportRep())) && (this.isProductTeam == null && other.getIsProductTeam() == null || this.isProductTeam != null && this.isProductTeam.equals(other.getIsProductTeam())) && (this.isFunctionalTeam == null && other.getIsFunctionalTeam() == null || this.isFunctionalTeam != null && this.isFunctionalTeam.equals(other.getIsFunctionalTeam())) && (this.issueRole == null && other.getIssueRole() == null || this.issueRole != null && this.issueRole.equals(other.getIssueRole())) && (this.isManufacturingWorkCenter == null && other.getIsManufacturingWorkCenter() == null || this.isManufacturingWorkCenter != null && this.isManufacturingWorkCenter.equals(other.getIsManufacturingWorkCenter())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && this.subsidiary.equals(other.getSubsidiary())) && (this.machineResources == null && other.getMachineResources() == null || this.machineResources != null && this.machineResources.equals(other.getMachineResources())) && (this.laborResources == null && other.getLaborResources() == null || this.laborResources != null && this.laborResources.equals(other.getLaborResources())) && (this.workCalendar == null && other.getWorkCalendar() == null || this.workCalendar != null && this.workCalendar.equals(other.getWorkCalendar())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
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
        if (this.getGroupName() != null) {
            _hashCode += this.getGroupName().hashCode();
        }
        if (this.getGroupType() != null) {
            _hashCode += this.getGroupType().hashCode();
        }
        if (this.getEmail() != null) {
            _hashCode += this.getEmail().hashCode();
        }
        if (this.getGroupOwner() != null) {
            _hashCode += this.getGroupOwner().hashCode();
        }
        if (this.getIsSavedSearch() != null) {
            _hashCode += this.getIsSavedSearch().hashCode();
        }
        if (this.getParentGroupType() != null) {
            _hashCode += this.getParentGroupType().hashCode();
        }
        if (this.getSavedSearch() != null) {
            _hashCode += this.getSavedSearch().hashCode();
        }
        if (this.getIsSalesTeam() != null) {
            _hashCode += this.getIsSalesTeam().hashCode();
        }
        if (this.getComments() != null) {
            _hashCode += this.getComments().hashCode();
        }
        if (this.getIsPrivate() != null) {
            _hashCode += this.getIsPrivate().hashCode();
        }
        if (this.getRestrictionGroup() != null) {
            _hashCode += this.getRestrictionGroup().hashCode();
        }
        if (this.getIsInactive() != null) {
            _hashCode += this.getIsInactive().hashCode();
        }
        if (this.getIsSalesRep() != null) {
            _hashCode += this.getIsSalesRep().hashCode();
        }
        if (this.getIsSupportRep() != null) {
            _hashCode += this.getIsSupportRep().hashCode();
        }
        if (this.getIsProductTeam() != null) {
            _hashCode += this.getIsProductTeam().hashCode();
        }
        if (this.getIsFunctionalTeam() != null) {
            _hashCode += this.getIsFunctionalTeam().hashCode();
        }
        if (this.getIssueRole() != null) {
            _hashCode += this.getIssueRole().hashCode();
        }
        if (this.getIsManufacturingWorkCenter() != null) {
            _hashCode += this.getIsManufacturingWorkCenter().hashCode();
        }
        if (this.getSubsidiary() != null) {
            _hashCode += this.getSubsidiary().hashCode();
        }
        if (this.getMachineResources() != null) {
            _hashCode += this.getMachineResources().hashCode();
        }
        if (this.getLaborResources() != null) {
            _hashCode += this.getLaborResources().hashCode();
        }
        if (this.getWorkCalendar() != null) {
            _hashCode += this.getWorkCalendar().hashCode();
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
        typeDesc.setXmlType(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "EntityGroup"));
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
        elemField.setFieldName("groupName");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "groupName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("groupType");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "groupType"));
        elemField.setXmlType(new QName("urn:types.relationships_2022_1.lists.webservices.netsuite.com", "EntityGroupType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "email"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("groupOwner");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "groupOwner"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isSavedSearch");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "isSavedSearch"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("parentGroupType");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "parentGroupType"));
        elemField.setXmlType(new QName("urn:types.relationships_2022_1.lists.webservices.netsuite.com", "EntityGroupType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("savedSearch");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "savedSearch"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isSalesTeam");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "isSalesTeam"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "comments"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isPrivate");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "isPrivate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("restrictionGroup");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "restrictionGroup"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isSalesRep");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "isSalesRep"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isSupportRep");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "isSupportRep"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isProductTeam");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "isProductTeam"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isFunctionalTeam");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "isFunctionalTeam"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("issueRole");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "issueRole"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isManufacturingWorkCenter");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "isManufacturingWorkCenter"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("machineResources");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "machineResources"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("laborResources");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "laborResources"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("workCalendar");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "workCalendar"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "CustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

