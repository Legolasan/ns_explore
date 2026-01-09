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
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnDateField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnDoubleField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnLongField;
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

public class EntityGroupSearchRowBasic
extends SearchRowBasic
implements Serializable {
    private SearchColumnStringField[] email;
    private SearchColumnSelectField[] externalId;
    private SearchColumnStringField[] groupName;
    private SearchColumnStringField[] groupType;
    private SearchColumnSelectField[] internalId;
    private SearchColumnBooleanField[] isDynamic;
    private SearchColumnBooleanField[] isInactive;
    private SearchColumnBooleanField[] isManufacturingWorkCenter;
    private SearchColumnBooleanField[] isPrivate;
    private SearchColumnDoubleField[] laborResources;
    private SearchColumnDateField[] lastModifiedDate;
    private SearchColumnDoubleField[] machineResources;
    private SearchColumnSelectField[] owner;
    private SearchColumnStringField[] savedSearch;
    private SearchColumnLongField[] size;
    private SearchColumnSelectField[] subsidiary;
    private SearchColumnSelectField[] workCalendar;
    private SearchColumnCustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(EntityGroupSearchRowBasic.class, true);

    public EntityGroupSearchRowBasic() {
    }

    public EntityGroupSearchRowBasic(SearchColumnStringField[] email, SearchColumnSelectField[] externalId, SearchColumnStringField[] groupName, SearchColumnStringField[] groupType, SearchColumnSelectField[] internalId, SearchColumnBooleanField[] isDynamic, SearchColumnBooleanField[] isInactive, SearchColumnBooleanField[] isManufacturingWorkCenter, SearchColumnBooleanField[] isPrivate, SearchColumnDoubleField[] laborResources, SearchColumnDateField[] lastModifiedDate, SearchColumnDoubleField[] machineResources, SearchColumnSelectField[] owner, SearchColumnStringField[] savedSearch, SearchColumnLongField[] size, SearchColumnSelectField[] subsidiary, SearchColumnSelectField[] workCalendar, SearchColumnCustomFieldList customFieldList) {
        this.email = email;
        this.externalId = externalId;
        this.groupName = groupName;
        this.groupType = groupType;
        this.internalId = internalId;
        this.isDynamic = isDynamic;
        this.isInactive = isInactive;
        this.isManufacturingWorkCenter = isManufacturingWorkCenter;
        this.isPrivate = isPrivate;
        this.laborResources = laborResources;
        this.lastModifiedDate = lastModifiedDate;
        this.machineResources = machineResources;
        this.owner = owner;
        this.savedSearch = savedSearch;
        this.size = size;
        this.subsidiary = subsidiary;
        this.workCalendar = workCalendar;
        this.customFieldList = customFieldList;
    }

    public SearchColumnStringField[] getEmail() {
        return this.email;
    }

    public void setEmail(SearchColumnStringField[] email) {
        this.email = email;
    }

    public SearchColumnStringField getEmail(int i) {
        return this.email[i];
    }

    public void setEmail(int i, SearchColumnStringField _value) {
        this.email[i] = _value;
    }

    public SearchColumnSelectField[] getExternalId() {
        return this.externalId;
    }

    public void setExternalId(SearchColumnSelectField[] externalId) {
        this.externalId = externalId;
    }

    public SearchColumnSelectField getExternalId(int i) {
        return this.externalId[i];
    }

    public void setExternalId(int i, SearchColumnSelectField _value) {
        this.externalId[i] = _value;
    }

    public SearchColumnStringField[] getGroupName() {
        return this.groupName;
    }

    public void setGroupName(SearchColumnStringField[] groupName) {
        this.groupName = groupName;
    }

    public SearchColumnStringField getGroupName(int i) {
        return this.groupName[i];
    }

    public void setGroupName(int i, SearchColumnStringField _value) {
        this.groupName[i] = _value;
    }

    public SearchColumnStringField[] getGroupType() {
        return this.groupType;
    }

    public void setGroupType(SearchColumnStringField[] groupType) {
        this.groupType = groupType;
    }

    public SearchColumnStringField getGroupType(int i) {
        return this.groupType[i];
    }

    public void setGroupType(int i, SearchColumnStringField _value) {
        this.groupType[i] = _value;
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

    public SearchColumnBooleanField[] getIsDynamic() {
        return this.isDynamic;
    }

    public void setIsDynamic(SearchColumnBooleanField[] isDynamic) {
        this.isDynamic = isDynamic;
    }

    public SearchColumnBooleanField getIsDynamic(int i) {
        return this.isDynamic[i];
    }

    public void setIsDynamic(int i, SearchColumnBooleanField _value) {
        this.isDynamic[i] = _value;
    }

    public SearchColumnBooleanField[] getIsInactive() {
        return this.isInactive;
    }

    public void setIsInactive(SearchColumnBooleanField[] isInactive) {
        this.isInactive = isInactive;
    }

    public SearchColumnBooleanField getIsInactive(int i) {
        return this.isInactive[i];
    }

    public void setIsInactive(int i, SearchColumnBooleanField _value) {
        this.isInactive[i] = _value;
    }

    public SearchColumnBooleanField[] getIsManufacturingWorkCenter() {
        return this.isManufacturingWorkCenter;
    }

    public void setIsManufacturingWorkCenter(SearchColumnBooleanField[] isManufacturingWorkCenter) {
        this.isManufacturingWorkCenter = isManufacturingWorkCenter;
    }

    public SearchColumnBooleanField getIsManufacturingWorkCenter(int i) {
        return this.isManufacturingWorkCenter[i];
    }

    public void setIsManufacturingWorkCenter(int i, SearchColumnBooleanField _value) {
        this.isManufacturingWorkCenter[i] = _value;
    }

    public SearchColumnBooleanField[] getIsPrivate() {
        return this.isPrivate;
    }

    public void setIsPrivate(SearchColumnBooleanField[] isPrivate) {
        this.isPrivate = isPrivate;
    }

    public SearchColumnBooleanField getIsPrivate(int i) {
        return this.isPrivate[i];
    }

    public void setIsPrivate(int i, SearchColumnBooleanField _value) {
        this.isPrivate[i] = _value;
    }

    public SearchColumnDoubleField[] getLaborResources() {
        return this.laborResources;
    }

    public void setLaborResources(SearchColumnDoubleField[] laborResources) {
        this.laborResources = laborResources;
    }

    public SearchColumnDoubleField getLaborResources(int i) {
        return this.laborResources[i];
    }

    public void setLaborResources(int i, SearchColumnDoubleField _value) {
        this.laborResources[i] = _value;
    }

    public SearchColumnDateField[] getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    public void setLastModifiedDate(SearchColumnDateField[] lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public SearchColumnDateField getLastModifiedDate(int i) {
        return this.lastModifiedDate[i];
    }

    public void setLastModifiedDate(int i, SearchColumnDateField _value) {
        this.lastModifiedDate[i] = _value;
    }

    public SearchColumnDoubleField[] getMachineResources() {
        return this.machineResources;
    }

    public void setMachineResources(SearchColumnDoubleField[] machineResources) {
        this.machineResources = machineResources;
    }

    public SearchColumnDoubleField getMachineResources(int i) {
        return this.machineResources[i];
    }

    public void setMachineResources(int i, SearchColumnDoubleField _value) {
        this.machineResources[i] = _value;
    }

    public SearchColumnSelectField[] getOwner() {
        return this.owner;
    }

    public void setOwner(SearchColumnSelectField[] owner) {
        this.owner = owner;
    }

    public SearchColumnSelectField getOwner(int i) {
        return this.owner[i];
    }

    public void setOwner(int i, SearchColumnSelectField _value) {
        this.owner[i] = _value;
    }

    public SearchColumnStringField[] getSavedSearch() {
        return this.savedSearch;
    }

    public void setSavedSearch(SearchColumnStringField[] savedSearch) {
        this.savedSearch = savedSearch;
    }

    public SearchColumnStringField getSavedSearch(int i) {
        return this.savedSearch[i];
    }

    public void setSavedSearch(int i, SearchColumnStringField _value) {
        this.savedSearch[i] = _value;
    }

    public SearchColumnLongField[] getSize() {
        return this.size;
    }

    public void setSize(SearchColumnLongField[] size) {
        this.size = size;
    }

    public SearchColumnLongField getSize(int i) {
        return this.size[i];
    }

    public void setSize(int i, SearchColumnLongField _value) {
        this.size[i] = _value;
    }

    public SearchColumnSelectField[] getSubsidiary() {
        return this.subsidiary;
    }

    public void setSubsidiary(SearchColumnSelectField[] subsidiary) {
        this.subsidiary = subsidiary;
    }

    public SearchColumnSelectField getSubsidiary(int i) {
        return this.subsidiary[i];
    }

    public void setSubsidiary(int i, SearchColumnSelectField _value) {
        this.subsidiary[i] = _value;
    }

    public SearchColumnSelectField[] getWorkCalendar() {
        return this.workCalendar;
    }

    public void setWorkCalendar(SearchColumnSelectField[] workCalendar) {
        this.workCalendar = workCalendar;
    }

    public SearchColumnSelectField getWorkCalendar(int i) {
        return this.workCalendar[i];
    }

    public void setWorkCalendar(int i, SearchColumnSelectField _value) {
        this.workCalendar[i] = _value;
    }

    public SearchColumnCustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof EntityGroupSearchRowBasic)) {
            return false;
        }
        EntityGroupSearchRowBasic other = (EntityGroupSearchRowBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.email == null && other.getEmail() == null || this.email != null && Arrays.equals(this.email, other.getEmail())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && Arrays.equals(this.externalId, other.getExternalId())) && (this.groupName == null && other.getGroupName() == null || this.groupName != null && Arrays.equals(this.groupName, other.getGroupName())) && (this.groupType == null && other.getGroupType() == null || this.groupType != null && Arrays.equals(this.groupType, other.getGroupType())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && Arrays.equals(this.internalId, other.getInternalId())) && (this.isDynamic == null && other.getIsDynamic() == null || this.isDynamic != null && Arrays.equals(this.isDynamic, other.getIsDynamic())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && Arrays.equals(this.isInactive, other.getIsInactive())) && (this.isManufacturingWorkCenter == null && other.getIsManufacturingWorkCenter() == null || this.isManufacturingWorkCenter != null && Arrays.equals(this.isManufacturingWorkCenter, other.getIsManufacturingWorkCenter())) && (this.isPrivate == null && other.getIsPrivate() == null || this.isPrivate != null && Arrays.equals(this.isPrivate, other.getIsPrivate())) && (this.laborResources == null && other.getLaborResources() == null || this.laborResources != null && Arrays.equals(this.laborResources, other.getLaborResources())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && Arrays.equals(this.lastModifiedDate, other.getLastModifiedDate())) && (this.machineResources == null && other.getMachineResources() == null || this.machineResources != null && Arrays.equals(this.machineResources, other.getMachineResources())) && (this.owner == null && other.getOwner() == null || this.owner != null && Arrays.equals(this.owner, other.getOwner())) && (this.savedSearch == null && other.getSavedSearch() == null || this.savedSearch != null && Arrays.equals(this.savedSearch, other.getSavedSearch())) && (this.size == null && other.getSize() == null || this.size != null && Arrays.equals(this.size, other.getSize())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && Arrays.equals(this.subsidiary, other.getSubsidiary())) && (this.workCalendar == null && other.getWorkCalendar() == null || this.workCalendar != null && Arrays.equals(this.workCalendar, other.getWorkCalendar())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
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
        if (this.getEmail() != null) {
            for (i = 0; i < Array.getLength(this.getEmail()); ++i) {
                obj = Array.get(this.getEmail(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getExternalId() != null) {
            for (i = 0; i < Array.getLength(this.getExternalId()); ++i) {
                obj = Array.get(this.getExternalId(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getGroupName() != null) {
            for (i = 0; i < Array.getLength(this.getGroupName()); ++i) {
                obj = Array.get(this.getGroupName(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getGroupType() != null) {
            for (i = 0; i < Array.getLength(this.getGroupType()); ++i) {
                obj = Array.get(this.getGroupType(), i);
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
        if (this.getIsDynamic() != null) {
            for (i = 0; i < Array.getLength(this.getIsDynamic()); ++i) {
                obj = Array.get(this.getIsDynamic(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsInactive() != null) {
            for (i = 0; i < Array.getLength(this.getIsInactive()); ++i) {
                obj = Array.get(this.getIsInactive(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsManufacturingWorkCenter() != null) {
            for (i = 0; i < Array.getLength(this.getIsManufacturingWorkCenter()); ++i) {
                obj = Array.get(this.getIsManufacturingWorkCenter(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsPrivate() != null) {
            for (i = 0; i < Array.getLength(this.getIsPrivate()); ++i) {
                obj = Array.get(this.getIsPrivate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLaborResources() != null) {
            for (i = 0; i < Array.getLength(this.getLaborResources()); ++i) {
                obj = Array.get(this.getLaborResources(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLastModifiedDate() != null) {
            for (i = 0; i < Array.getLength(this.getLastModifiedDate()); ++i) {
                obj = Array.get(this.getLastModifiedDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getMachineResources() != null) {
            for (i = 0; i < Array.getLength(this.getMachineResources()); ++i) {
                obj = Array.get(this.getMachineResources(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getOwner() != null) {
            for (i = 0; i < Array.getLength(this.getOwner()); ++i) {
                obj = Array.get(this.getOwner(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSavedSearch() != null) {
            for (i = 0; i < Array.getLength(this.getSavedSearch()); ++i) {
                obj = Array.get(this.getSavedSearch(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSize() != null) {
            for (i = 0; i < Array.getLength(this.getSize()); ++i) {
                obj = Array.get(this.getSize(), i);
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
        if (this.getWorkCalendar() != null) {
            for (i = 0; i < Array.getLength(this.getWorkCalendar()); ++i) {
                obj = Array.get(this.getWorkCalendar(), i);
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "EntityGroupSearchRowBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "email"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "externalId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("groupName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "groupName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("groupType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "groupType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("isDynamic");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isDynamic"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isManufacturingWorkCenter");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isManufacturingWorkCenter"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isPrivate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isPrivate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("laborResources");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "laborResources"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("machineResources");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "machineResources"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "owner"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("savedSearch");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "savedSearch"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("size");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "size"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("workCalendar");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "workCalendar"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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

