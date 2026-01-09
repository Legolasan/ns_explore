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

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnBooleanField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnCustomFieldList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnDateField;
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

public class CustomRecordSearchRowBasic
extends SearchRowBasic
implements Serializable {
    private RecordRef recType;
    private SearchColumnStringField[] altName;
    private SearchColumnBooleanField[] availableOffline;
    private SearchColumnDateField[] created;
    private SearchColumnSelectField[] externalId;
    private SearchColumnLongField[] id;
    private SearchColumnSelectField[] internalId;
    private SearchColumnBooleanField[] isInactive;
    private SearchColumnDateField[] lastModified;
    private SearchColumnSelectField[] lastModifiedBy;
    private SearchColumnStringField[] name;
    private SearchColumnSelectField[] owner;
    private SearchColumnSelectField[] parent;
    private SearchColumnCustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(CustomRecordSearchRowBasic.class, true);

    public CustomRecordSearchRowBasic() {
    }

    public CustomRecordSearchRowBasic(RecordRef recType, SearchColumnStringField[] altName, SearchColumnBooleanField[] availableOffline, SearchColumnDateField[] created, SearchColumnSelectField[] externalId, SearchColumnLongField[] id, SearchColumnSelectField[] internalId, SearchColumnBooleanField[] isInactive, SearchColumnDateField[] lastModified, SearchColumnSelectField[] lastModifiedBy, SearchColumnStringField[] name, SearchColumnSelectField[] owner, SearchColumnSelectField[] parent, SearchColumnCustomFieldList customFieldList) {
        this.recType = recType;
        this.altName = altName;
        this.availableOffline = availableOffline;
        this.created = created;
        this.externalId = externalId;
        this.id = id;
        this.internalId = internalId;
        this.isInactive = isInactive;
        this.lastModified = lastModified;
        this.lastModifiedBy = lastModifiedBy;
        this.name = name;
        this.owner = owner;
        this.parent = parent;
        this.customFieldList = customFieldList;
    }

    public RecordRef getRecType() {
        return this.recType;
    }

    public void setRecType(RecordRef recType) {
        this.recType = recType;
    }

    public SearchColumnStringField[] getAltName() {
        return this.altName;
    }

    public void setAltName(SearchColumnStringField[] altName) {
        this.altName = altName;
    }

    public SearchColumnStringField getAltName(int i) {
        return this.altName[i];
    }

    public void setAltName(int i, SearchColumnStringField _value) {
        this.altName[i] = _value;
    }

    public SearchColumnBooleanField[] getAvailableOffline() {
        return this.availableOffline;
    }

    public void setAvailableOffline(SearchColumnBooleanField[] availableOffline) {
        this.availableOffline = availableOffline;
    }

    public SearchColumnBooleanField getAvailableOffline(int i) {
        return this.availableOffline[i];
    }

    public void setAvailableOffline(int i, SearchColumnBooleanField _value) {
        this.availableOffline[i] = _value;
    }

    public SearchColumnDateField[] getCreated() {
        return this.created;
    }

    public void setCreated(SearchColumnDateField[] created) {
        this.created = created;
    }

    public SearchColumnDateField getCreated(int i) {
        return this.created[i];
    }

    public void setCreated(int i, SearchColumnDateField _value) {
        this.created[i] = _value;
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

    public SearchColumnLongField[] getId() {
        return this.id;
    }

    public void setId(SearchColumnLongField[] id) {
        this.id = id;
    }

    public SearchColumnLongField getId(int i) {
        return this.id[i];
    }

    public void setId(int i, SearchColumnLongField _value) {
        this.id[i] = _value;
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

    public SearchColumnDateField[] getLastModified() {
        return this.lastModified;
    }

    public void setLastModified(SearchColumnDateField[] lastModified) {
        this.lastModified = lastModified;
    }

    public SearchColumnDateField getLastModified(int i) {
        return this.lastModified[i];
    }

    public void setLastModified(int i, SearchColumnDateField _value) {
        this.lastModified[i] = _value;
    }

    public SearchColumnSelectField[] getLastModifiedBy() {
        return this.lastModifiedBy;
    }

    public void setLastModifiedBy(SearchColumnSelectField[] lastModifiedBy) {
        this.lastModifiedBy = lastModifiedBy;
    }

    public SearchColumnSelectField getLastModifiedBy(int i) {
        return this.lastModifiedBy[i];
    }

    public void setLastModifiedBy(int i, SearchColumnSelectField _value) {
        this.lastModifiedBy[i] = _value;
    }

    public SearchColumnStringField[] getName() {
        return this.name;
    }

    public void setName(SearchColumnStringField[] name) {
        this.name = name;
    }

    public SearchColumnStringField getName(int i) {
        return this.name[i];
    }

    public void setName(int i, SearchColumnStringField _value) {
        this.name[i] = _value;
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

    public SearchColumnSelectField[] getParent() {
        return this.parent;
    }

    public void setParent(SearchColumnSelectField[] parent) {
        this.parent = parent;
    }

    public SearchColumnSelectField getParent(int i) {
        return this.parent[i];
    }

    public void setParent(int i, SearchColumnSelectField _value) {
        this.parent[i] = _value;
    }

    public SearchColumnCustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CustomRecordSearchRowBasic)) {
            return false;
        }
        CustomRecordSearchRowBasic other = (CustomRecordSearchRowBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.recType == null && other.getRecType() == null || this.recType != null && this.recType.equals(other.getRecType())) && (this.altName == null && other.getAltName() == null || this.altName != null && Arrays.equals(this.altName, other.getAltName())) && (this.availableOffline == null && other.getAvailableOffline() == null || this.availableOffline != null && Arrays.equals(this.availableOffline, other.getAvailableOffline())) && (this.created == null && other.getCreated() == null || this.created != null && Arrays.equals(this.created, other.getCreated())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && Arrays.equals(this.externalId, other.getExternalId())) && (this.id == null && other.getId() == null || this.id != null && Arrays.equals(this.id, other.getId())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && Arrays.equals(this.internalId, other.getInternalId())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && Arrays.equals(this.isInactive, other.getIsInactive())) && (this.lastModified == null && other.getLastModified() == null || this.lastModified != null && Arrays.equals(this.lastModified, other.getLastModified())) && (this.lastModifiedBy == null && other.getLastModifiedBy() == null || this.lastModifiedBy != null && Arrays.equals(this.lastModifiedBy, other.getLastModifiedBy())) && (this.name == null && other.getName() == null || this.name != null && Arrays.equals(this.name, other.getName())) && (this.owner == null && other.getOwner() == null || this.owner != null && Arrays.equals(this.owner, other.getOwner())) && (this.parent == null && other.getParent() == null || this.parent != null && Arrays.equals(this.parent, other.getParent())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
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
        if (this.getRecType() != null) {
            _hashCode += this.getRecType().hashCode();
        }
        if (this.getAltName() != null) {
            for (i = 0; i < Array.getLength(this.getAltName()); ++i) {
                obj = Array.get(this.getAltName(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAvailableOffline() != null) {
            for (i = 0; i < Array.getLength(this.getAvailableOffline()); ++i) {
                obj = Array.get(this.getAvailableOffline(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCreated() != null) {
            for (i = 0; i < Array.getLength(this.getCreated()); ++i) {
                obj = Array.get(this.getCreated(), i);
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
        if (this.getId() != null) {
            for (i = 0; i < Array.getLength(this.getId()); ++i) {
                obj = Array.get(this.getId(), i);
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
        if (this.getIsInactive() != null) {
            for (i = 0; i < Array.getLength(this.getIsInactive()); ++i) {
                obj = Array.get(this.getIsInactive(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLastModified() != null) {
            for (i = 0; i < Array.getLength(this.getLastModified()); ++i) {
                obj = Array.get(this.getLastModified(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLastModifiedBy() != null) {
            for (i = 0; i < Array.getLength(this.getLastModifiedBy()); ++i) {
                obj = Array.get(this.getLastModifiedBy(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getName() != null) {
            for (i = 0; i < Array.getLength(this.getName()); ++i) {
                obj = Array.get(this.getName(), i);
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
        if (this.getParent() != null) {
            for (i = 0; i < Array.getLength(this.getParent()); ++i) {
                obj = Array.get(this.getParent(), i);
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "CustomRecordSearchRowBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("recType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "recType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("altName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "altName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("availableOffline");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "availableOffline"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("created");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "created"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
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
        elemField.setFieldName("id");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "id"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
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
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastModified");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lastModified"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastModifiedBy");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lastModifiedBy"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "name"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("parent");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "parent"));
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

