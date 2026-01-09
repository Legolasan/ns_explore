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

public class ItemDemandPlanSearchRowBasic
extends SearchRowBasic
implements Serializable {
    private SearchColumnSelectField[] alternateSourceItem;
    private SearchColumnLongField[] analysisDuration;
    private SearchColumnDateField[] demandDate;
    private SearchColumnSelectField[] externalId;
    private SearchColumnSelectField[] internalId;
    private SearchColumnSelectField[] item;
    private SearchColumnDateField[] lastModifiedDate;
    private SearchColumnSelectField[] location;
    private SearchColumnStringField[] memo;
    private SearchColumnLongField[] projectionDuration;
    private SearchColumnStringField[] projectionInterval;
    private SearchColumnStringField[] projectionMethod;
    private SearchColumnDateField[] projectionStartDate;
    private SearchColumnDoubleField[] quantity;
    private SearchColumnDoubleField[] quantityUom;
    private SearchColumnSelectField[] subsidiary;
    private SearchColumnSelectField[] units;
    private SearchColumnCustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(ItemDemandPlanSearchRowBasic.class, true);

    public ItemDemandPlanSearchRowBasic() {
    }

    public ItemDemandPlanSearchRowBasic(SearchColumnSelectField[] alternateSourceItem, SearchColumnLongField[] analysisDuration, SearchColumnDateField[] demandDate, SearchColumnSelectField[] externalId, SearchColumnSelectField[] internalId, SearchColumnSelectField[] item, SearchColumnDateField[] lastModifiedDate, SearchColumnSelectField[] location, SearchColumnStringField[] memo, SearchColumnLongField[] projectionDuration, SearchColumnStringField[] projectionInterval, SearchColumnStringField[] projectionMethod, SearchColumnDateField[] projectionStartDate, SearchColumnDoubleField[] quantity, SearchColumnDoubleField[] quantityUom, SearchColumnSelectField[] subsidiary, SearchColumnSelectField[] units, SearchColumnCustomFieldList customFieldList) {
        this.alternateSourceItem = alternateSourceItem;
        this.analysisDuration = analysisDuration;
        this.demandDate = demandDate;
        this.externalId = externalId;
        this.internalId = internalId;
        this.item = item;
        this.lastModifiedDate = lastModifiedDate;
        this.location = location;
        this.memo = memo;
        this.projectionDuration = projectionDuration;
        this.projectionInterval = projectionInterval;
        this.projectionMethod = projectionMethod;
        this.projectionStartDate = projectionStartDate;
        this.quantity = quantity;
        this.quantityUom = quantityUom;
        this.subsidiary = subsidiary;
        this.units = units;
        this.customFieldList = customFieldList;
    }

    public SearchColumnSelectField[] getAlternateSourceItem() {
        return this.alternateSourceItem;
    }

    public void setAlternateSourceItem(SearchColumnSelectField[] alternateSourceItem) {
        this.alternateSourceItem = alternateSourceItem;
    }

    public SearchColumnSelectField getAlternateSourceItem(int i) {
        return this.alternateSourceItem[i];
    }

    public void setAlternateSourceItem(int i, SearchColumnSelectField _value) {
        this.alternateSourceItem[i] = _value;
    }

    public SearchColumnLongField[] getAnalysisDuration() {
        return this.analysisDuration;
    }

    public void setAnalysisDuration(SearchColumnLongField[] analysisDuration) {
        this.analysisDuration = analysisDuration;
    }

    public SearchColumnLongField getAnalysisDuration(int i) {
        return this.analysisDuration[i];
    }

    public void setAnalysisDuration(int i, SearchColumnLongField _value) {
        this.analysisDuration[i] = _value;
    }

    public SearchColumnDateField[] getDemandDate() {
        return this.demandDate;
    }

    public void setDemandDate(SearchColumnDateField[] demandDate) {
        this.demandDate = demandDate;
    }

    public SearchColumnDateField getDemandDate(int i) {
        return this.demandDate[i];
    }

    public void setDemandDate(int i, SearchColumnDateField _value) {
        this.demandDate[i] = _value;
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

    public SearchColumnSelectField[] getItem() {
        return this.item;
    }

    public void setItem(SearchColumnSelectField[] item) {
        this.item = item;
    }

    public SearchColumnSelectField getItem(int i) {
        return this.item[i];
    }

    public void setItem(int i, SearchColumnSelectField _value) {
        this.item[i] = _value;
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

    public SearchColumnSelectField[] getLocation() {
        return this.location;
    }

    public void setLocation(SearchColumnSelectField[] location) {
        this.location = location;
    }

    public SearchColumnSelectField getLocation(int i) {
        return this.location[i];
    }

    public void setLocation(int i, SearchColumnSelectField _value) {
        this.location[i] = _value;
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

    public SearchColumnLongField[] getProjectionDuration() {
        return this.projectionDuration;
    }

    public void setProjectionDuration(SearchColumnLongField[] projectionDuration) {
        this.projectionDuration = projectionDuration;
    }

    public SearchColumnLongField getProjectionDuration(int i) {
        return this.projectionDuration[i];
    }

    public void setProjectionDuration(int i, SearchColumnLongField _value) {
        this.projectionDuration[i] = _value;
    }

    public SearchColumnStringField[] getProjectionInterval() {
        return this.projectionInterval;
    }

    public void setProjectionInterval(SearchColumnStringField[] projectionInterval) {
        this.projectionInterval = projectionInterval;
    }

    public SearchColumnStringField getProjectionInterval(int i) {
        return this.projectionInterval[i];
    }

    public void setProjectionInterval(int i, SearchColumnStringField _value) {
        this.projectionInterval[i] = _value;
    }

    public SearchColumnStringField[] getProjectionMethod() {
        return this.projectionMethod;
    }

    public void setProjectionMethod(SearchColumnStringField[] projectionMethod) {
        this.projectionMethod = projectionMethod;
    }

    public SearchColumnStringField getProjectionMethod(int i) {
        return this.projectionMethod[i];
    }

    public void setProjectionMethod(int i, SearchColumnStringField _value) {
        this.projectionMethod[i] = _value;
    }

    public SearchColumnDateField[] getProjectionStartDate() {
        return this.projectionStartDate;
    }

    public void setProjectionStartDate(SearchColumnDateField[] projectionStartDate) {
        this.projectionStartDate = projectionStartDate;
    }

    public SearchColumnDateField getProjectionStartDate(int i) {
        return this.projectionStartDate[i];
    }

    public void setProjectionStartDate(int i, SearchColumnDateField _value) {
        this.projectionStartDate[i] = _value;
    }

    public SearchColumnDoubleField[] getQuantity() {
        return this.quantity;
    }

    public void setQuantity(SearchColumnDoubleField[] quantity) {
        this.quantity = quantity;
    }

    public SearchColumnDoubleField getQuantity(int i) {
        return this.quantity[i];
    }

    public void setQuantity(int i, SearchColumnDoubleField _value) {
        this.quantity[i] = _value;
    }

    public SearchColumnDoubleField[] getQuantityUom() {
        return this.quantityUom;
    }

    public void setQuantityUom(SearchColumnDoubleField[] quantityUom) {
        this.quantityUom = quantityUom;
    }

    public SearchColumnDoubleField getQuantityUom(int i) {
        return this.quantityUom[i];
    }

    public void setQuantityUom(int i, SearchColumnDoubleField _value) {
        this.quantityUom[i] = _value;
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

    public SearchColumnSelectField[] getUnits() {
        return this.units;
    }

    public void setUnits(SearchColumnSelectField[] units) {
        this.units = units;
    }

    public SearchColumnSelectField getUnits(int i) {
        return this.units[i];
    }

    public void setUnits(int i, SearchColumnSelectField _value) {
        this.units[i] = _value;
    }

    public SearchColumnCustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ItemDemandPlanSearchRowBasic)) {
            return false;
        }
        ItemDemandPlanSearchRowBasic other = (ItemDemandPlanSearchRowBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.alternateSourceItem == null && other.getAlternateSourceItem() == null || this.alternateSourceItem != null && Arrays.equals(this.alternateSourceItem, other.getAlternateSourceItem())) && (this.analysisDuration == null && other.getAnalysisDuration() == null || this.analysisDuration != null && Arrays.equals(this.analysisDuration, other.getAnalysisDuration())) && (this.demandDate == null && other.getDemandDate() == null || this.demandDate != null && Arrays.equals(this.demandDate, other.getDemandDate())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && Arrays.equals(this.externalId, other.getExternalId())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && Arrays.equals(this.internalId, other.getInternalId())) && (this.item == null && other.getItem() == null || this.item != null && Arrays.equals(this.item, other.getItem())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && Arrays.equals(this.lastModifiedDate, other.getLastModifiedDate())) && (this.location == null && other.getLocation() == null || this.location != null && Arrays.equals(this.location, other.getLocation())) && (this.memo == null && other.getMemo() == null || this.memo != null && Arrays.equals(this.memo, other.getMemo())) && (this.projectionDuration == null && other.getProjectionDuration() == null || this.projectionDuration != null && Arrays.equals(this.projectionDuration, other.getProjectionDuration())) && (this.projectionInterval == null && other.getProjectionInterval() == null || this.projectionInterval != null && Arrays.equals(this.projectionInterval, other.getProjectionInterval())) && (this.projectionMethod == null && other.getProjectionMethod() == null || this.projectionMethod != null && Arrays.equals(this.projectionMethod, other.getProjectionMethod())) && (this.projectionStartDate == null && other.getProjectionStartDate() == null || this.projectionStartDate != null && Arrays.equals(this.projectionStartDate, other.getProjectionStartDate())) && (this.quantity == null && other.getQuantity() == null || this.quantity != null && Arrays.equals(this.quantity, other.getQuantity())) && (this.quantityUom == null && other.getQuantityUom() == null || this.quantityUom != null && Arrays.equals(this.quantityUom, other.getQuantityUom())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && Arrays.equals(this.subsidiary, other.getSubsidiary())) && (this.units == null && other.getUnits() == null || this.units != null && Arrays.equals(this.units, other.getUnits())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
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
        if (this.getAlternateSourceItem() != null) {
            for (i = 0; i < Array.getLength(this.getAlternateSourceItem()); ++i) {
                obj = Array.get(this.getAlternateSourceItem(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAnalysisDuration() != null) {
            for (i = 0; i < Array.getLength(this.getAnalysisDuration()); ++i) {
                obj = Array.get(this.getAnalysisDuration(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDemandDate() != null) {
            for (i = 0; i < Array.getLength(this.getDemandDate()); ++i) {
                obj = Array.get(this.getDemandDate(), i);
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
        if (this.getInternalId() != null) {
            for (i = 0; i < Array.getLength(this.getInternalId()); ++i) {
                obj = Array.get(this.getInternalId(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getItem() != null) {
            for (i = 0; i < Array.getLength(this.getItem()); ++i) {
                obj = Array.get(this.getItem(), i);
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
        if (this.getLocation() != null) {
            for (i = 0; i < Array.getLength(this.getLocation()); ++i) {
                obj = Array.get(this.getLocation(), i);
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
        if (this.getProjectionDuration() != null) {
            for (i = 0; i < Array.getLength(this.getProjectionDuration()); ++i) {
                obj = Array.get(this.getProjectionDuration(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getProjectionInterval() != null) {
            for (i = 0; i < Array.getLength(this.getProjectionInterval()); ++i) {
                obj = Array.get(this.getProjectionInterval(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getProjectionMethod() != null) {
            for (i = 0; i < Array.getLength(this.getProjectionMethod()); ++i) {
                obj = Array.get(this.getProjectionMethod(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getProjectionStartDate() != null) {
            for (i = 0; i < Array.getLength(this.getProjectionStartDate()); ++i) {
                obj = Array.get(this.getProjectionStartDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getQuantity() != null) {
            for (i = 0; i < Array.getLength(this.getQuantity()); ++i) {
                obj = Array.get(this.getQuantity(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getQuantityUom() != null) {
            for (i = 0; i < Array.getLength(this.getQuantityUom()); ++i) {
                obj = Array.get(this.getQuantityUom(), i);
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
        if (this.getUnits() != null) {
            for (i = 0; i < Array.getLength(this.getUnits()); ++i) {
                obj = Array.get(this.getUnits(), i);
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ItemDemandPlanSearchRowBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("alternateSourceItem");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "alternateSourceItem"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("analysisDuration");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "analysisDuration"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("demandDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "demandDate"));
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
        elemField.setFieldName("internalId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("location");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "location"));
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
        elemField.setFieldName("projectionDuration");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "projectionDuration"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("projectionInterval");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "projectionInterval"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("projectionMethod");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "projectionMethod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("projectionStartDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "projectionStartDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "quantity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityUom");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "quantityUom"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
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
        elemField.setFieldName("units");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "units"));
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

