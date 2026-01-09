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

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchCustomFieldList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchDateField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchDoubleField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchEnumMultiSelectField;
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

public class ItemDemandPlanSearchBasic
extends SearchRecordBasic
implements Serializable {
    private SearchMultiSelectField alternateSourceItem;
    private SearchLongField analysisDuration;
    private SearchDateField demandDate;
    private SearchMultiSelectField externalId;
    private SearchStringField externalIdString;
    private SearchMultiSelectField internalId;
    private SearchLongField internalIdNumber;
    private SearchMultiSelectField item;
    private SearchDateField lastModifiedDate;
    private SearchMultiSelectField location;
    private SearchStringField memo;
    private SearchLongField projectionDuration;
    private SearchMultiSelectField projectionInterval;
    private SearchEnumMultiSelectField projectionMethod;
    private SearchDateField projectionStartDate;
    private SearchDoubleField quantity;
    private SearchMultiSelectField subsidiary;
    private SearchMultiSelectField units;
    private SearchCustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(ItemDemandPlanSearchBasic.class, true);

    public ItemDemandPlanSearchBasic() {
    }

    public ItemDemandPlanSearchBasic(SearchMultiSelectField alternateSourceItem, SearchLongField analysisDuration, SearchDateField demandDate, SearchMultiSelectField externalId, SearchStringField externalIdString, SearchMultiSelectField internalId, SearchLongField internalIdNumber, SearchMultiSelectField item, SearchDateField lastModifiedDate, SearchMultiSelectField location, SearchStringField memo, SearchLongField projectionDuration, SearchMultiSelectField projectionInterval, SearchEnumMultiSelectField projectionMethod, SearchDateField projectionStartDate, SearchDoubleField quantity, SearchMultiSelectField subsidiary, SearchMultiSelectField units, SearchCustomFieldList customFieldList) {
        this.alternateSourceItem = alternateSourceItem;
        this.analysisDuration = analysisDuration;
        this.demandDate = demandDate;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.item = item;
        this.lastModifiedDate = lastModifiedDate;
        this.location = location;
        this.memo = memo;
        this.projectionDuration = projectionDuration;
        this.projectionInterval = projectionInterval;
        this.projectionMethod = projectionMethod;
        this.projectionStartDate = projectionStartDate;
        this.quantity = quantity;
        this.subsidiary = subsidiary;
        this.units = units;
        this.customFieldList = customFieldList;
    }

    public SearchMultiSelectField getAlternateSourceItem() {
        return this.alternateSourceItem;
    }

    public void setAlternateSourceItem(SearchMultiSelectField alternateSourceItem) {
        this.alternateSourceItem = alternateSourceItem;
    }

    public SearchLongField getAnalysisDuration() {
        return this.analysisDuration;
    }

    public void setAnalysisDuration(SearchLongField analysisDuration) {
        this.analysisDuration = analysisDuration;
    }

    public SearchDateField getDemandDate() {
        return this.demandDate;
    }

    public void setDemandDate(SearchDateField demandDate) {
        this.demandDate = demandDate;
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

    public SearchMultiSelectField getItem() {
        return this.item;
    }

    public void setItem(SearchMultiSelectField item) {
        this.item = item;
    }

    public SearchDateField getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    public void setLastModifiedDate(SearchDateField lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public SearchMultiSelectField getLocation() {
        return this.location;
    }

    public void setLocation(SearchMultiSelectField location) {
        this.location = location;
    }

    public SearchStringField getMemo() {
        return this.memo;
    }

    public void setMemo(SearchStringField memo) {
        this.memo = memo;
    }

    public SearchLongField getProjectionDuration() {
        return this.projectionDuration;
    }

    public void setProjectionDuration(SearchLongField projectionDuration) {
        this.projectionDuration = projectionDuration;
    }

    public SearchMultiSelectField getProjectionInterval() {
        return this.projectionInterval;
    }

    public void setProjectionInterval(SearchMultiSelectField projectionInterval) {
        this.projectionInterval = projectionInterval;
    }

    public SearchEnumMultiSelectField getProjectionMethod() {
        return this.projectionMethod;
    }

    public void setProjectionMethod(SearchEnumMultiSelectField projectionMethod) {
        this.projectionMethod = projectionMethod;
    }

    public SearchDateField getProjectionStartDate() {
        return this.projectionStartDate;
    }

    public void setProjectionStartDate(SearchDateField projectionStartDate) {
        this.projectionStartDate = projectionStartDate;
    }

    public SearchDoubleField getQuantity() {
        return this.quantity;
    }

    public void setQuantity(SearchDoubleField quantity) {
        this.quantity = quantity;
    }

    public SearchMultiSelectField getSubsidiary() {
        return this.subsidiary;
    }

    public void setSubsidiary(SearchMultiSelectField subsidiary) {
        this.subsidiary = subsidiary;
    }

    public SearchMultiSelectField getUnits() {
        return this.units;
    }

    public void setUnits(SearchMultiSelectField units) {
        this.units = units;
    }

    public SearchCustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ItemDemandPlanSearchBasic)) {
            return false;
        }
        ItemDemandPlanSearchBasic other = (ItemDemandPlanSearchBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.alternateSourceItem == null && other.getAlternateSourceItem() == null || this.alternateSourceItem != null && this.alternateSourceItem.equals(other.getAlternateSourceItem())) && (this.analysisDuration == null && other.getAnalysisDuration() == null || this.analysisDuration != null && this.analysisDuration.equals(other.getAnalysisDuration())) && (this.demandDate == null && other.getDemandDate() == null || this.demandDate != null && this.demandDate.equals(other.getDemandDate())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId())) && (this.externalIdString == null && other.getExternalIdString() == null || this.externalIdString != null && this.externalIdString.equals(other.getExternalIdString())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.internalIdNumber == null && other.getInternalIdNumber() == null || this.internalIdNumber != null && this.internalIdNumber.equals(other.getInternalIdNumber())) && (this.item == null && other.getItem() == null || this.item != null && this.item.equals(other.getItem())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && this.lastModifiedDate.equals(other.getLastModifiedDate())) && (this.location == null && other.getLocation() == null || this.location != null && this.location.equals(other.getLocation())) && (this.memo == null && other.getMemo() == null || this.memo != null && this.memo.equals(other.getMemo())) && (this.projectionDuration == null && other.getProjectionDuration() == null || this.projectionDuration != null && this.projectionDuration.equals(other.getProjectionDuration())) && (this.projectionInterval == null && other.getProjectionInterval() == null || this.projectionInterval != null && this.projectionInterval.equals(other.getProjectionInterval())) && (this.projectionMethod == null && other.getProjectionMethod() == null || this.projectionMethod != null && this.projectionMethod.equals(other.getProjectionMethod())) && (this.projectionStartDate == null && other.getProjectionStartDate() == null || this.projectionStartDate != null && this.projectionStartDate.equals(other.getProjectionStartDate())) && (this.quantity == null && other.getQuantity() == null || this.quantity != null && this.quantity.equals(other.getQuantity())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && this.subsidiary.equals(other.getSubsidiary())) && (this.units == null && other.getUnits() == null || this.units != null && this.units.equals(other.getUnits())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
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
        if (this.getAlternateSourceItem() != null) {
            _hashCode += this.getAlternateSourceItem().hashCode();
        }
        if (this.getAnalysisDuration() != null) {
            _hashCode += this.getAnalysisDuration().hashCode();
        }
        if (this.getDemandDate() != null) {
            _hashCode += this.getDemandDate().hashCode();
        }
        if (this.getExternalId() != null) {
            _hashCode += this.getExternalId().hashCode();
        }
        if (this.getExternalIdString() != null) {
            _hashCode += this.getExternalIdString().hashCode();
        }
        if (this.getInternalId() != null) {
            _hashCode += this.getInternalId().hashCode();
        }
        if (this.getInternalIdNumber() != null) {
            _hashCode += this.getInternalIdNumber().hashCode();
        }
        if (this.getItem() != null) {
            _hashCode += this.getItem().hashCode();
        }
        if (this.getLastModifiedDate() != null) {
            _hashCode += this.getLastModifiedDate().hashCode();
        }
        if (this.getLocation() != null) {
            _hashCode += this.getLocation().hashCode();
        }
        if (this.getMemo() != null) {
            _hashCode += this.getMemo().hashCode();
        }
        if (this.getProjectionDuration() != null) {
            _hashCode += this.getProjectionDuration().hashCode();
        }
        if (this.getProjectionInterval() != null) {
            _hashCode += this.getProjectionInterval().hashCode();
        }
        if (this.getProjectionMethod() != null) {
            _hashCode += this.getProjectionMethod().hashCode();
        }
        if (this.getProjectionStartDate() != null) {
            _hashCode += this.getProjectionStartDate().hashCode();
        }
        if (this.getQuantity() != null) {
            _hashCode += this.getQuantity().hashCode();
        }
        if (this.getSubsidiary() != null) {
            _hashCode += this.getSubsidiary().hashCode();
        }
        if (this.getUnits() != null) {
            _hashCode += this.getUnits().hashCode();
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ItemDemandPlanSearchBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("alternateSourceItem");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "alternateSourceItem"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("analysisDuration");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "analysisDuration"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("demandDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "demandDate"));
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
        elemField.setFieldName("item");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("location");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "location"));
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
        elemField.setFieldName("projectionDuration");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "projectionDuration"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("projectionInterval");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "projectionInterval"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("projectionMethod");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "projectionMethod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("projectionStartDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "projectionStartDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "quantity"));
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
        elemField.setFieldName("units");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "units"));
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

