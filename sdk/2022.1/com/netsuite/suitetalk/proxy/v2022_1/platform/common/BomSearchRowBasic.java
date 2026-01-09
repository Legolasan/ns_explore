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
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnDateField;
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

public class BomSearchRowBasic
extends SearchRowBasic
implements Serializable {
    private SearchColumnBooleanField[] availableForAllAssemblies;
    private SearchColumnBooleanField[] availableForAllLocations;
    private SearchColumnDateField[] createdDate;
    private SearchColumnSelectField[] externalId;
    private SearchColumnBooleanField[] includeChildren;
    private SearchColumnSelectField[] internalId;
    private SearchColumnBooleanField[] isInactive;
    private SearchColumnSelectField[] legacyBomForAssembly;
    private SearchColumnStringField[] memo;
    private SearchColumnStringField[] name;
    private SearchColumnSelectField[] restrictToAssemblies;
    private SearchColumnSelectField[] restrictToLocations;
    private SearchColumnStringField[] revisionName;
    private SearchColumnSelectField[] subsidiary;
    private SearchColumnSelectField[] subsidiaryNoHierarchy;
    private SearchColumnBooleanField[] useComponentYield;
    private SearchColumnBooleanField[] usedOnAssembly;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(BomSearchRowBasic.class, true);

    public BomSearchRowBasic() {
    }

    public BomSearchRowBasic(SearchColumnBooleanField[] availableForAllAssemblies, SearchColumnBooleanField[] availableForAllLocations, SearchColumnDateField[] createdDate, SearchColumnSelectField[] externalId, SearchColumnBooleanField[] includeChildren, SearchColumnSelectField[] internalId, SearchColumnBooleanField[] isInactive, SearchColumnSelectField[] legacyBomForAssembly, SearchColumnStringField[] memo, SearchColumnStringField[] name, SearchColumnSelectField[] restrictToAssemblies, SearchColumnSelectField[] restrictToLocations, SearchColumnStringField[] revisionName, SearchColumnSelectField[] subsidiary, SearchColumnSelectField[] subsidiaryNoHierarchy, SearchColumnBooleanField[] useComponentYield, SearchColumnBooleanField[] usedOnAssembly) {
        this.availableForAllAssemblies = availableForAllAssemblies;
        this.availableForAllLocations = availableForAllLocations;
        this.createdDate = createdDate;
        this.externalId = externalId;
        this.includeChildren = includeChildren;
        this.internalId = internalId;
        this.isInactive = isInactive;
        this.legacyBomForAssembly = legacyBomForAssembly;
        this.memo = memo;
        this.name = name;
        this.restrictToAssemblies = restrictToAssemblies;
        this.restrictToLocations = restrictToLocations;
        this.revisionName = revisionName;
        this.subsidiary = subsidiary;
        this.subsidiaryNoHierarchy = subsidiaryNoHierarchy;
        this.useComponentYield = useComponentYield;
        this.usedOnAssembly = usedOnAssembly;
    }

    public SearchColumnBooleanField[] getAvailableForAllAssemblies() {
        return this.availableForAllAssemblies;
    }

    public void setAvailableForAllAssemblies(SearchColumnBooleanField[] availableForAllAssemblies) {
        this.availableForAllAssemblies = availableForAllAssemblies;
    }

    public SearchColumnBooleanField getAvailableForAllAssemblies(int i) {
        return this.availableForAllAssemblies[i];
    }

    public void setAvailableForAllAssemblies(int i, SearchColumnBooleanField _value) {
        this.availableForAllAssemblies[i] = _value;
    }

    public SearchColumnBooleanField[] getAvailableForAllLocations() {
        return this.availableForAllLocations;
    }

    public void setAvailableForAllLocations(SearchColumnBooleanField[] availableForAllLocations) {
        this.availableForAllLocations = availableForAllLocations;
    }

    public SearchColumnBooleanField getAvailableForAllLocations(int i) {
        return this.availableForAllLocations[i];
    }

    public void setAvailableForAllLocations(int i, SearchColumnBooleanField _value) {
        this.availableForAllLocations[i] = _value;
    }

    public SearchColumnDateField[] getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(SearchColumnDateField[] createdDate) {
        this.createdDate = createdDate;
    }

    public SearchColumnDateField getCreatedDate(int i) {
        return this.createdDate[i];
    }

    public void setCreatedDate(int i, SearchColumnDateField _value) {
        this.createdDate[i] = _value;
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

    public SearchColumnBooleanField[] getIncludeChildren() {
        return this.includeChildren;
    }

    public void setIncludeChildren(SearchColumnBooleanField[] includeChildren) {
        this.includeChildren = includeChildren;
    }

    public SearchColumnBooleanField getIncludeChildren(int i) {
        return this.includeChildren[i];
    }

    public void setIncludeChildren(int i, SearchColumnBooleanField _value) {
        this.includeChildren[i] = _value;
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

    public SearchColumnSelectField[] getLegacyBomForAssembly() {
        return this.legacyBomForAssembly;
    }

    public void setLegacyBomForAssembly(SearchColumnSelectField[] legacyBomForAssembly) {
        this.legacyBomForAssembly = legacyBomForAssembly;
    }

    public SearchColumnSelectField getLegacyBomForAssembly(int i) {
        return this.legacyBomForAssembly[i];
    }

    public void setLegacyBomForAssembly(int i, SearchColumnSelectField _value) {
        this.legacyBomForAssembly[i] = _value;
    }

    public SearchColumnStringField[] getMemo() {
        return this.memo;
    }

    public void setMemo(SearchColumnStringField[] memo) {
        this.memo = memo;
    }

    public SearchColumnStringField getMemo(int i) {
        return this.memo[i];
    }

    public void setMemo(int i, SearchColumnStringField _value) {
        this.memo[i] = _value;
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

    public SearchColumnSelectField[] getRestrictToAssemblies() {
        return this.restrictToAssemblies;
    }

    public void setRestrictToAssemblies(SearchColumnSelectField[] restrictToAssemblies) {
        this.restrictToAssemblies = restrictToAssemblies;
    }

    public SearchColumnSelectField getRestrictToAssemblies(int i) {
        return this.restrictToAssemblies[i];
    }

    public void setRestrictToAssemblies(int i, SearchColumnSelectField _value) {
        this.restrictToAssemblies[i] = _value;
    }

    public SearchColumnSelectField[] getRestrictToLocations() {
        return this.restrictToLocations;
    }

    public void setRestrictToLocations(SearchColumnSelectField[] restrictToLocations) {
        this.restrictToLocations = restrictToLocations;
    }

    public SearchColumnSelectField getRestrictToLocations(int i) {
        return this.restrictToLocations[i];
    }

    public void setRestrictToLocations(int i, SearchColumnSelectField _value) {
        this.restrictToLocations[i] = _value;
    }

    public SearchColumnStringField[] getRevisionName() {
        return this.revisionName;
    }

    public void setRevisionName(SearchColumnStringField[] revisionName) {
        this.revisionName = revisionName;
    }

    public SearchColumnStringField getRevisionName(int i) {
        return this.revisionName[i];
    }

    public void setRevisionName(int i, SearchColumnStringField _value) {
        this.revisionName[i] = _value;
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

    public SearchColumnSelectField[] getSubsidiaryNoHierarchy() {
        return this.subsidiaryNoHierarchy;
    }

    public void setSubsidiaryNoHierarchy(SearchColumnSelectField[] subsidiaryNoHierarchy) {
        this.subsidiaryNoHierarchy = subsidiaryNoHierarchy;
    }

    public SearchColumnSelectField getSubsidiaryNoHierarchy(int i) {
        return this.subsidiaryNoHierarchy[i];
    }

    public void setSubsidiaryNoHierarchy(int i, SearchColumnSelectField _value) {
        this.subsidiaryNoHierarchy[i] = _value;
    }

    public SearchColumnBooleanField[] getUseComponentYield() {
        return this.useComponentYield;
    }

    public void setUseComponentYield(SearchColumnBooleanField[] useComponentYield) {
        this.useComponentYield = useComponentYield;
    }

    public SearchColumnBooleanField getUseComponentYield(int i) {
        return this.useComponentYield[i];
    }

    public void setUseComponentYield(int i, SearchColumnBooleanField _value) {
        this.useComponentYield[i] = _value;
    }

    public SearchColumnBooleanField[] getUsedOnAssembly() {
        return this.usedOnAssembly;
    }

    public void setUsedOnAssembly(SearchColumnBooleanField[] usedOnAssembly) {
        this.usedOnAssembly = usedOnAssembly;
    }

    public SearchColumnBooleanField getUsedOnAssembly(int i) {
        return this.usedOnAssembly[i];
    }

    public void setUsedOnAssembly(int i, SearchColumnBooleanField _value) {
        this.usedOnAssembly[i] = _value;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof BomSearchRowBasic)) {
            return false;
        }
        BomSearchRowBasic other = (BomSearchRowBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.availableForAllAssemblies == null && other.getAvailableForAllAssemblies() == null || this.availableForAllAssemblies != null && Arrays.equals(this.availableForAllAssemblies, other.getAvailableForAllAssemblies())) && (this.availableForAllLocations == null && other.getAvailableForAllLocations() == null || this.availableForAllLocations != null && Arrays.equals(this.availableForAllLocations, other.getAvailableForAllLocations())) && (this.createdDate == null && other.getCreatedDate() == null || this.createdDate != null && Arrays.equals(this.createdDate, other.getCreatedDate())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && Arrays.equals(this.externalId, other.getExternalId())) && (this.includeChildren == null && other.getIncludeChildren() == null || this.includeChildren != null && Arrays.equals(this.includeChildren, other.getIncludeChildren())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && Arrays.equals(this.internalId, other.getInternalId())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && Arrays.equals(this.isInactive, other.getIsInactive())) && (this.legacyBomForAssembly == null && other.getLegacyBomForAssembly() == null || this.legacyBomForAssembly != null && Arrays.equals(this.legacyBomForAssembly, other.getLegacyBomForAssembly())) && (this.memo == null && other.getMemo() == null || this.memo != null && Arrays.equals(this.memo, other.getMemo())) && (this.name == null && other.getName() == null || this.name != null && Arrays.equals(this.name, other.getName())) && (this.restrictToAssemblies == null && other.getRestrictToAssemblies() == null || this.restrictToAssemblies != null && Arrays.equals(this.restrictToAssemblies, other.getRestrictToAssemblies())) && (this.restrictToLocations == null && other.getRestrictToLocations() == null || this.restrictToLocations != null && Arrays.equals(this.restrictToLocations, other.getRestrictToLocations())) && (this.revisionName == null && other.getRevisionName() == null || this.revisionName != null && Arrays.equals(this.revisionName, other.getRevisionName())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && Arrays.equals(this.subsidiary, other.getSubsidiary())) && (this.subsidiaryNoHierarchy == null && other.getSubsidiaryNoHierarchy() == null || this.subsidiaryNoHierarchy != null && Arrays.equals(this.subsidiaryNoHierarchy, other.getSubsidiaryNoHierarchy())) && (this.useComponentYield == null && other.getUseComponentYield() == null || this.useComponentYield != null && Arrays.equals(this.useComponentYield, other.getUseComponentYield())) && (this.usedOnAssembly == null && other.getUsedOnAssembly() == null || this.usedOnAssembly != null && Arrays.equals(this.usedOnAssembly, other.getUsedOnAssembly()));
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
        if (this.getAvailableForAllAssemblies() != null) {
            for (i = 0; i < Array.getLength(this.getAvailableForAllAssemblies()); ++i) {
                obj = Array.get(this.getAvailableForAllAssemblies(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAvailableForAllLocations() != null) {
            for (i = 0; i < Array.getLength(this.getAvailableForAllLocations()); ++i) {
                obj = Array.get(this.getAvailableForAllLocations(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCreatedDate() != null) {
            for (i = 0; i < Array.getLength(this.getCreatedDate()); ++i) {
                obj = Array.get(this.getCreatedDate(), i);
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
        if (this.getIncludeChildren() != null) {
            for (i = 0; i < Array.getLength(this.getIncludeChildren()); ++i) {
                obj = Array.get(this.getIncludeChildren(), i);
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
        if (this.getLegacyBomForAssembly() != null) {
            for (i = 0; i < Array.getLength(this.getLegacyBomForAssembly()); ++i) {
                obj = Array.get(this.getLegacyBomForAssembly(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getMemo() != null) {
            for (i = 0; i < Array.getLength(this.getMemo()); ++i) {
                obj = Array.get(this.getMemo(), i);
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
        if (this.getRestrictToAssemblies() != null) {
            for (i = 0; i < Array.getLength(this.getRestrictToAssemblies()); ++i) {
                obj = Array.get(this.getRestrictToAssemblies(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRestrictToLocations() != null) {
            for (i = 0; i < Array.getLength(this.getRestrictToLocations()); ++i) {
                obj = Array.get(this.getRestrictToLocations(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRevisionName() != null) {
            for (i = 0; i < Array.getLength(this.getRevisionName()); ++i) {
                obj = Array.get(this.getRevisionName(), i);
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
        if (this.getSubsidiaryNoHierarchy() != null) {
            for (i = 0; i < Array.getLength(this.getSubsidiaryNoHierarchy()); ++i) {
                obj = Array.get(this.getSubsidiaryNoHierarchy(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getUseComponentYield() != null) {
            for (i = 0; i < Array.getLength(this.getUseComponentYield()); ++i) {
                obj = Array.get(this.getUseComponentYield(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getUsedOnAssembly() != null) {
            for (i = 0; i < Array.getLength(this.getUsedOnAssembly()); ++i) {
                obj = Array.get(this.getUsedOnAssembly(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "BomSearchRowBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("availableForAllAssemblies");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "availableForAllAssemblies"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("availableForAllLocations");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "availableForAllLocations"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "createdDate"));
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
        elemField.setFieldName("includeChildren");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "includeChildren"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
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
        elemField.setFieldName("legacyBomForAssembly");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "legacyBomForAssembly"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("restrictToAssemblies");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "restrictToAssemblies"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("restrictToLocations");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "restrictToLocations"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revisionName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "revisionName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("subsidiaryNoHierarchy");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "subsidiaryNoHierarchy"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("useComponentYield");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "useComponentYield"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("usedOnAssembly");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "usedOnAssembly"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

