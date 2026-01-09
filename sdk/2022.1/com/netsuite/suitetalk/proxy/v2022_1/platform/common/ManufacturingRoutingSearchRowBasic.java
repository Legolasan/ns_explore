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
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnDoubleField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnEnumSelectField;
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

public class ManufacturingRoutingSearchRowBasic
extends SearchRowBasic
implements Serializable {
    private SearchColumnBooleanField[] autoCalculateLag;
    private SearchColumnSelectField[] billOfMaterials;
    private SearchColumnSelectField[] externalId;
    private SearchColumnSelectField[] internalId;
    private SearchColumnBooleanField[] isDefault;
    private SearchColumnBooleanField[] isInactive;
    private SearchColumnSelectField[] item;
    private SearchColumnDoubleField[] lagAmount;
    private SearchColumnEnumSelectField[] lagType;
    private SearchColumnStringField[] lagUnits;
    private SearchColumnSelectField[] location;
    private SearchColumnSelectField[] manufacturingCostTemplate;
    private SearchColumnSelectField[] manufacturingWorkCenter;
    private SearchColumnStringField[] memo;
    private SearchColumnStringField[] name;
    private SearchColumnStringField[] operationName;
    private SearchColumnDoubleField[] operationYield;
    private SearchColumnDoubleField[] runRate;
    private SearchColumnLongField[] sequence;
    private SearchColumnDoubleField[] setupTime;
    private SearchColumnSelectField[] subsidiary;
    private SearchColumnCustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(ManufacturingRoutingSearchRowBasic.class, true);

    public ManufacturingRoutingSearchRowBasic() {
    }

    public ManufacturingRoutingSearchRowBasic(SearchColumnBooleanField[] autoCalculateLag, SearchColumnSelectField[] billOfMaterials, SearchColumnSelectField[] externalId, SearchColumnSelectField[] internalId, SearchColumnBooleanField[] isDefault, SearchColumnBooleanField[] isInactive, SearchColumnSelectField[] item, SearchColumnDoubleField[] lagAmount, SearchColumnEnumSelectField[] lagType, SearchColumnStringField[] lagUnits, SearchColumnSelectField[] location, SearchColumnSelectField[] manufacturingCostTemplate, SearchColumnSelectField[] manufacturingWorkCenter, SearchColumnStringField[] memo, SearchColumnStringField[] name, SearchColumnStringField[] operationName, SearchColumnDoubleField[] operationYield, SearchColumnDoubleField[] runRate, SearchColumnLongField[] sequence, SearchColumnDoubleField[] setupTime, SearchColumnSelectField[] subsidiary, SearchColumnCustomFieldList customFieldList) {
        this.autoCalculateLag = autoCalculateLag;
        this.billOfMaterials = billOfMaterials;
        this.externalId = externalId;
        this.internalId = internalId;
        this.isDefault = isDefault;
        this.isInactive = isInactive;
        this.item = item;
        this.lagAmount = lagAmount;
        this.lagType = lagType;
        this.lagUnits = lagUnits;
        this.location = location;
        this.manufacturingCostTemplate = manufacturingCostTemplate;
        this.manufacturingWorkCenter = manufacturingWorkCenter;
        this.memo = memo;
        this.name = name;
        this.operationName = operationName;
        this.operationYield = operationYield;
        this.runRate = runRate;
        this.sequence = sequence;
        this.setupTime = setupTime;
        this.subsidiary = subsidiary;
        this.customFieldList = customFieldList;
    }

    public SearchColumnBooleanField[] getAutoCalculateLag() {
        return this.autoCalculateLag;
    }

    public void setAutoCalculateLag(SearchColumnBooleanField[] autoCalculateLag) {
        this.autoCalculateLag = autoCalculateLag;
    }

    public SearchColumnBooleanField getAutoCalculateLag(int i) {
        return this.autoCalculateLag[i];
    }

    public void setAutoCalculateLag(int i, SearchColumnBooleanField _value) {
        this.autoCalculateLag[i] = _value;
    }

    public SearchColumnSelectField[] getBillOfMaterials() {
        return this.billOfMaterials;
    }

    public void setBillOfMaterials(SearchColumnSelectField[] billOfMaterials) {
        this.billOfMaterials = billOfMaterials;
    }

    public SearchColumnSelectField getBillOfMaterials(int i) {
        return this.billOfMaterials[i];
    }

    public void setBillOfMaterials(int i, SearchColumnSelectField _value) {
        this.billOfMaterials[i] = _value;
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

    public SearchColumnBooleanField[] getIsDefault() {
        return this.isDefault;
    }

    public void setIsDefault(SearchColumnBooleanField[] isDefault) {
        this.isDefault = isDefault;
    }

    public SearchColumnBooleanField getIsDefault(int i) {
        return this.isDefault[i];
    }

    public void setIsDefault(int i, SearchColumnBooleanField _value) {
        this.isDefault[i] = _value;
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

    public SearchColumnDoubleField[] getLagAmount() {
        return this.lagAmount;
    }

    public void setLagAmount(SearchColumnDoubleField[] lagAmount) {
        this.lagAmount = lagAmount;
    }

    public SearchColumnDoubleField getLagAmount(int i) {
        return this.lagAmount[i];
    }

    public void setLagAmount(int i, SearchColumnDoubleField _value) {
        this.lagAmount[i] = _value;
    }

    public SearchColumnEnumSelectField[] getLagType() {
        return this.lagType;
    }

    public void setLagType(SearchColumnEnumSelectField[] lagType) {
        this.lagType = lagType;
    }

    public SearchColumnEnumSelectField getLagType(int i) {
        return this.lagType[i];
    }

    public void setLagType(int i, SearchColumnEnumSelectField _value) {
        this.lagType[i] = _value;
    }

    public SearchColumnStringField[] getLagUnits() {
        return this.lagUnits;
    }

    public void setLagUnits(SearchColumnStringField[] lagUnits) {
        this.lagUnits = lagUnits;
    }

    public SearchColumnStringField getLagUnits(int i) {
        return this.lagUnits[i];
    }

    public void setLagUnits(int i, SearchColumnStringField _value) {
        this.lagUnits[i] = _value;
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

    public SearchColumnSelectField[] getManufacturingCostTemplate() {
        return this.manufacturingCostTemplate;
    }

    public void setManufacturingCostTemplate(SearchColumnSelectField[] manufacturingCostTemplate) {
        this.manufacturingCostTemplate = manufacturingCostTemplate;
    }

    public SearchColumnSelectField getManufacturingCostTemplate(int i) {
        return this.manufacturingCostTemplate[i];
    }

    public void setManufacturingCostTemplate(int i, SearchColumnSelectField _value) {
        this.manufacturingCostTemplate[i] = _value;
    }

    public SearchColumnSelectField[] getManufacturingWorkCenter() {
        return this.manufacturingWorkCenter;
    }

    public void setManufacturingWorkCenter(SearchColumnSelectField[] manufacturingWorkCenter) {
        this.manufacturingWorkCenter = manufacturingWorkCenter;
    }

    public SearchColumnSelectField getManufacturingWorkCenter(int i) {
        return this.manufacturingWorkCenter[i];
    }

    public void setManufacturingWorkCenter(int i, SearchColumnSelectField _value) {
        this.manufacturingWorkCenter[i] = _value;
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

    public SearchColumnStringField[] getOperationName() {
        return this.operationName;
    }

    public void setOperationName(SearchColumnStringField[] operationName) {
        this.operationName = operationName;
    }

    public SearchColumnStringField getOperationName(int i) {
        return this.operationName[i];
    }

    public void setOperationName(int i, SearchColumnStringField _value) {
        this.operationName[i] = _value;
    }

    public SearchColumnDoubleField[] getOperationYield() {
        return this.operationYield;
    }

    public void setOperationYield(SearchColumnDoubleField[] operationYield) {
        this.operationYield = operationYield;
    }

    public SearchColumnDoubleField getOperationYield(int i) {
        return this.operationYield[i];
    }

    public void setOperationYield(int i, SearchColumnDoubleField _value) {
        this.operationYield[i] = _value;
    }

    public SearchColumnDoubleField[] getRunRate() {
        return this.runRate;
    }

    public void setRunRate(SearchColumnDoubleField[] runRate) {
        this.runRate = runRate;
    }

    public SearchColumnDoubleField getRunRate(int i) {
        return this.runRate[i];
    }

    public void setRunRate(int i, SearchColumnDoubleField _value) {
        this.runRate[i] = _value;
    }

    public SearchColumnLongField[] getSequence() {
        return this.sequence;
    }

    public void setSequence(SearchColumnLongField[] sequence) {
        this.sequence = sequence;
    }

    public SearchColumnLongField getSequence(int i) {
        return this.sequence[i];
    }

    public void setSequence(int i, SearchColumnLongField _value) {
        this.sequence[i] = _value;
    }

    public SearchColumnDoubleField[] getSetupTime() {
        return this.setupTime;
    }

    public void setSetupTime(SearchColumnDoubleField[] setupTime) {
        this.setupTime = setupTime;
    }

    public SearchColumnDoubleField getSetupTime(int i) {
        return this.setupTime[i];
    }

    public void setSetupTime(int i, SearchColumnDoubleField _value) {
        this.setupTime[i] = _value;
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

    public SearchColumnCustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ManufacturingRoutingSearchRowBasic)) {
            return false;
        }
        ManufacturingRoutingSearchRowBasic other = (ManufacturingRoutingSearchRowBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.autoCalculateLag == null && other.getAutoCalculateLag() == null || this.autoCalculateLag != null && Arrays.equals(this.autoCalculateLag, other.getAutoCalculateLag())) && (this.billOfMaterials == null && other.getBillOfMaterials() == null || this.billOfMaterials != null && Arrays.equals(this.billOfMaterials, other.getBillOfMaterials())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && Arrays.equals(this.externalId, other.getExternalId())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && Arrays.equals(this.internalId, other.getInternalId())) && (this.isDefault == null && other.getIsDefault() == null || this.isDefault != null && Arrays.equals(this.isDefault, other.getIsDefault())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && Arrays.equals(this.isInactive, other.getIsInactive())) && (this.item == null && other.getItem() == null || this.item != null && Arrays.equals(this.item, other.getItem())) && (this.lagAmount == null && other.getLagAmount() == null || this.lagAmount != null && Arrays.equals(this.lagAmount, other.getLagAmount())) && (this.lagType == null && other.getLagType() == null || this.lagType != null && Arrays.equals(this.lagType, other.getLagType())) && (this.lagUnits == null && other.getLagUnits() == null || this.lagUnits != null && Arrays.equals(this.lagUnits, other.getLagUnits())) && (this.location == null && other.getLocation() == null || this.location != null && Arrays.equals(this.location, other.getLocation())) && (this.manufacturingCostTemplate == null && other.getManufacturingCostTemplate() == null || this.manufacturingCostTemplate != null && Arrays.equals(this.manufacturingCostTemplate, other.getManufacturingCostTemplate())) && (this.manufacturingWorkCenter == null && other.getManufacturingWorkCenter() == null || this.manufacturingWorkCenter != null && Arrays.equals(this.manufacturingWorkCenter, other.getManufacturingWorkCenter())) && (this.memo == null && other.getMemo() == null || this.memo != null && Arrays.equals(this.memo, other.getMemo())) && (this.name == null && other.getName() == null || this.name != null && Arrays.equals(this.name, other.getName())) && (this.operationName == null && other.getOperationName() == null || this.operationName != null && Arrays.equals(this.operationName, other.getOperationName())) && (this.operationYield == null && other.getOperationYield() == null || this.operationYield != null && Arrays.equals(this.operationYield, other.getOperationYield())) && (this.runRate == null && other.getRunRate() == null || this.runRate != null && Arrays.equals(this.runRate, other.getRunRate())) && (this.sequence == null && other.getSequence() == null || this.sequence != null && Arrays.equals(this.sequence, other.getSequence())) && (this.setupTime == null && other.getSetupTime() == null || this.setupTime != null && Arrays.equals(this.setupTime, other.getSetupTime())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && Arrays.equals(this.subsidiary, other.getSubsidiary())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
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
        if (this.getAutoCalculateLag() != null) {
            for (i = 0; i < Array.getLength(this.getAutoCalculateLag()); ++i) {
                obj = Array.get(this.getAutoCalculateLag(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBillOfMaterials() != null) {
            for (i = 0; i < Array.getLength(this.getBillOfMaterials()); ++i) {
                obj = Array.get(this.getBillOfMaterials(), i);
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
        if (this.getIsDefault() != null) {
            for (i = 0; i < Array.getLength(this.getIsDefault()); ++i) {
                obj = Array.get(this.getIsDefault(), i);
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
        if (this.getItem() != null) {
            for (i = 0; i < Array.getLength(this.getItem()); ++i) {
                obj = Array.get(this.getItem(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLagAmount() != null) {
            for (i = 0; i < Array.getLength(this.getLagAmount()); ++i) {
                obj = Array.get(this.getLagAmount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLagType() != null) {
            for (i = 0; i < Array.getLength(this.getLagType()); ++i) {
                obj = Array.get(this.getLagType(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLagUnits() != null) {
            for (i = 0; i < Array.getLength(this.getLagUnits()); ++i) {
                obj = Array.get(this.getLagUnits(), i);
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
        if (this.getManufacturingCostTemplate() != null) {
            for (i = 0; i < Array.getLength(this.getManufacturingCostTemplate()); ++i) {
                obj = Array.get(this.getManufacturingCostTemplate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getManufacturingWorkCenter() != null) {
            for (i = 0; i < Array.getLength(this.getManufacturingWorkCenter()); ++i) {
                obj = Array.get(this.getManufacturingWorkCenter(), i);
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
        if (this.getOperationName() != null) {
            for (i = 0; i < Array.getLength(this.getOperationName()); ++i) {
                obj = Array.get(this.getOperationName(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getOperationYield() != null) {
            for (i = 0; i < Array.getLength(this.getOperationYield()); ++i) {
                obj = Array.get(this.getOperationYield(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRunRate() != null) {
            for (i = 0; i < Array.getLength(this.getRunRate()); ++i) {
                obj = Array.get(this.getRunRate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSequence() != null) {
            for (i = 0; i < Array.getLength(this.getSequence()); ++i) {
                obj = Array.get(this.getSequence(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSetupTime() != null) {
            for (i = 0; i < Array.getLength(this.getSetupTime()); ++i) {
                obj = Array.get(this.getSetupTime(), i);
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ManufacturingRoutingSearchRowBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("autoCalculateLag");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "autoCalculateLag"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billOfMaterials");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billOfMaterials"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("isDefault");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isDefault"));
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
        elemField.setFieldName("item");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lagAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lagAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lagType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lagType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lagUnits");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lagUnits"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("manufacturingCostTemplate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "manufacturingCostTemplate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("manufacturingWorkCenter");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "manufacturingWorkCenter"));
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
        elemField.setFieldName("operationName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "operationName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("operationYield");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "operationYield"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("runRate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "runRate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("sequence");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "sequence"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("setupTime");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "setupTime"));
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
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnCustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

