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

public class ManufacturingRoutingSearchBasic
extends SearchRecordBasic
implements Serializable {
    private SearchBooleanField autoCalculateLag;
    private SearchMultiSelectField billOfMaterials;
    private SearchMultiSelectField externalId;
    private SearchStringField externalIdString;
    private SearchMultiSelectField internalId;
    private SearchLongField internalIdNumber;
    private SearchBooleanField isDefault;
    private SearchBooleanField isInactive;
    private SearchMultiSelectField item;
    private SearchDoubleField lagAmount;
    private SearchEnumMultiSelectField lagType;
    private SearchStringField lagUnits;
    private SearchMultiSelectField location;
    private SearchMultiSelectField manufacturingCostTemplate;
    private SearchMultiSelectField manufacturingWorkCenter;
    private SearchStringField memo;
    private SearchStringField name;
    private SearchStringField operationName;
    private SearchDoubleField operationYield;
    private SearchDoubleField runRate;
    private SearchLongField sequence;
    private SearchDoubleField setupTime;
    private SearchMultiSelectField subsidiary;
    private SearchCustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(ManufacturingRoutingSearchBasic.class, true);

    public ManufacturingRoutingSearchBasic() {
    }

    public ManufacturingRoutingSearchBasic(SearchBooleanField autoCalculateLag, SearchMultiSelectField billOfMaterials, SearchMultiSelectField externalId, SearchStringField externalIdString, SearchMultiSelectField internalId, SearchLongField internalIdNumber, SearchBooleanField isDefault, SearchBooleanField isInactive, SearchMultiSelectField item, SearchDoubleField lagAmount, SearchEnumMultiSelectField lagType, SearchStringField lagUnits, SearchMultiSelectField location, SearchMultiSelectField manufacturingCostTemplate, SearchMultiSelectField manufacturingWorkCenter, SearchStringField memo, SearchStringField name, SearchStringField operationName, SearchDoubleField operationYield, SearchDoubleField runRate, SearchLongField sequence, SearchDoubleField setupTime, SearchMultiSelectField subsidiary, SearchCustomFieldList customFieldList) {
        this.autoCalculateLag = autoCalculateLag;
        this.billOfMaterials = billOfMaterials;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
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

    public SearchBooleanField getAutoCalculateLag() {
        return this.autoCalculateLag;
    }

    public void setAutoCalculateLag(SearchBooleanField autoCalculateLag) {
        this.autoCalculateLag = autoCalculateLag;
    }

    public SearchMultiSelectField getBillOfMaterials() {
        return this.billOfMaterials;
    }

    public void setBillOfMaterials(SearchMultiSelectField billOfMaterials) {
        this.billOfMaterials = billOfMaterials;
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

    public SearchBooleanField getIsDefault() {
        return this.isDefault;
    }

    public void setIsDefault(SearchBooleanField isDefault) {
        this.isDefault = isDefault;
    }

    public SearchBooleanField getIsInactive() {
        return this.isInactive;
    }

    public void setIsInactive(SearchBooleanField isInactive) {
        this.isInactive = isInactive;
    }

    public SearchMultiSelectField getItem() {
        return this.item;
    }

    public void setItem(SearchMultiSelectField item) {
        this.item = item;
    }

    public SearchDoubleField getLagAmount() {
        return this.lagAmount;
    }

    public void setLagAmount(SearchDoubleField lagAmount) {
        this.lagAmount = lagAmount;
    }

    public SearchEnumMultiSelectField getLagType() {
        return this.lagType;
    }

    public void setLagType(SearchEnumMultiSelectField lagType) {
        this.lagType = lagType;
    }

    public SearchStringField getLagUnits() {
        return this.lagUnits;
    }

    public void setLagUnits(SearchStringField lagUnits) {
        this.lagUnits = lagUnits;
    }

    public SearchMultiSelectField getLocation() {
        return this.location;
    }

    public void setLocation(SearchMultiSelectField location) {
        this.location = location;
    }

    public SearchMultiSelectField getManufacturingCostTemplate() {
        return this.manufacturingCostTemplate;
    }

    public void setManufacturingCostTemplate(SearchMultiSelectField manufacturingCostTemplate) {
        this.manufacturingCostTemplate = manufacturingCostTemplate;
    }

    public SearchMultiSelectField getManufacturingWorkCenter() {
        return this.manufacturingWorkCenter;
    }

    public void setManufacturingWorkCenter(SearchMultiSelectField manufacturingWorkCenter) {
        this.manufacturingWorkCenter = manufacturingWorkCenter;
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

    public SearchStringField getOperationName() {
        return this.operationName;
    }

    public void setOperationName(SearchStringField operationName) {
        this.operationName = operationName;
    }

    public SearchDoubleField getOperationYield() {
        return this.operationYield;
    }

    public void setOperationYield(SearchDoubleField operationYield) {
        this.operationYield = operationYield;
    }

    public SearchDoubleField getRunRate() {
        return this.runRate;
    }

    public void setRunRate(SearchDoubleField runRate) {
        this.runRate = runRate;
    }

    public SearchLongField getSequence() {
        return this.sequence;
    }

    public void setSequence(SearchLongField sequence) {
        this.sequence = sequence;
    }

    public SearchDoubleField getSetupTime() {
        return this.setupTime;
    }

    public void setSetupTime(SearchDoubleField setupTime) {
        this.setupTime = setupTime;
    }

    public SearchMultiSelectField getSubsidiary() {
        return this.subsidiary;
    }

    public void setSubsidiary(SearchMultiSelectField subsidiary) {
        this.subsidiary = subsidiary;
    }

    public SearchCustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ManufacturingRoutingSearchBasic)) {
            return false;
        }
        ManufacturingRoutingSearchBasic other = (ManufacturingRoutingSearchBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.autoCalculateLag == null && other.getAutoCalculateLag() == null || this.autoCalculateLag != null && this.autoCalculateLag.equals(other.getAutoCalculateLag())) && (this.billOfMaterials == null && other.getBillOfMaterials() == null || this.billOfMaterials != null && this.billOfMaterials.equals(other.getBillOfMaterials())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId())) && (this.externalIdString == null && other.getExternalIdString() == null || this.externalIdString != null && this.externalIdString.equals(other.getExternalIdString())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.internalIdNumber == null && other.getInternalIdNumber() == null || this.internalIdNumber != null && this.internalIdNumber.equals(other.getInternalIdNumber())) && (this.isDefault == null && other.getIsDefault() == null || this.isDefault != null && this.isDefault.equals(other.getIsDefault())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && this.isInactive.equals(other.getIsInactive())) && (this.item == null && other.getItem() == null || this.item != null && this.item.equals(other.getItem())) && (this.lagAmount == null && other.getLagAmount() == null || this.lagAmount != null && this.lagAmount.equals(other.getLagAmount())) && (this.lagType == null && other.getLagType() == null || this.lagType != null && this.lagType.equals(other.getLagType())) && (this.lagUnits == null && other.getLagUnits() == null || this.lagUnits != null && this.lagUnits.equals(other.getLagUnits())) && (this.location == null && other.getLocation() == null || this.location != null && this.location.equals(other.getLocation())) && (this.manufacturingCostTemplate == null && other.getManufacturingCostTemplate() == null || this.manufacturingCostTemplate != null && this.manufacturingCostTemplate.equals(other.getManufacturingCostTemplate())) && (this.manufacturingWorkCenter == null && other.getManufacturingWorkCenter() == null || this.manufacturingWorkCenter != null && this.manufacturingWorkCenter.equals(other.getManufacturingWorkCenter())) && (this.memo == null && other.getMemo() == null || this.memo != null && this.memo.equals(other.getMemo())) && (this.name == null && other.getName() == null || this.name != null && this.name.equals(other.getName())) && (this.operationName == null && other.getOperationName() == null || this.operationName != null && this.operationName.equals(other.getOperationName())) && (this.operationYield == null && other.getOperationYield() == null || this.operationYield != null && this.operationYield.equals(other.getOperationYield())) && (this.runRate == null && other.getRunRate() == null || this.runRate != null && this.runRate.equals(other.getRunRate())) && (this.sequence == null && other.getSequence() == null || this.sequence != null && this.sequence.equals(other.getSequence())) && (this.setupTime == null && other.getSetupTime() == null || this.setupTime != null && this.setupTime.equals(other.getSetupTime())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && this.subsidiary.equals(other.getSubsidiary())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
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
        if (this.getAutoCalculateLag() != null) {
            _hashCode += this.getAutoCalculateLag().hashCode();
        }
        if (this.getBillOfMaterials() != null) {
            _hashCode += this.getBillOfMaterials().hashCode();
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
        if (this.getIsDefault() != null) {
            _hashCode += this.getIsDefault().hashCode();
        }
        if (this.getIsInactive() != null) {
            _hashCode += this.getIsInactive().hashCode();
        }
        if (this.getItem() != null) {
            _hashCode += this.getItem().hashCode();
        }
        if (this.getLagAmount() != null) {
            _hashCode += this.getLagAmount().hashCode();
        }
        if (this.getLagType() != null) {
            _hashCode += this.getLagType().hashCode();
        }
        if (this.getLagUnits() != null) {
            _hashCode += this.getLagUnits().hashCode();
        }
        if (this.getLocation() != null) {
            _hashCode += this.getLocation().hashCode();
        }
        if (this.getManufacturingCostTemplate() != null) {
            _hashCode += this.getManufacturingCostTemplate().hashCode();
        }
        if (this.getManufacturingWorkCenter() != null) {
            _hashCode += this.getManufacturingWorkCenter().hashCode();
        }
        if (this.getMemo() != null) {
            _hashCode += this.getMemo().hashCode();
        }
        if (this.getName() != null) {
            _hashCode += this.getName().hashCode();
        }
        if (this.getOperationName() != null) {
            _hashCode += this.getOperationName().hashCode();
        }
        if (this.getOperationYield() != null) {
            _hashCode += this.getOperationYield().hashCode();
        }
        if (this.getRunRate() != null) {
            _hashCode += this.getRunRate().hashCode();
        }
        if (this.getSequence() != null) {
            _hashCode += this.getSequence().hashCode();
        }
        if (this.getSetupTime() != null) {
            _hashCode += this.getSetupTime().hashCode();
        }
        if (this.getSubsidiary() != null) {
            _hashCode += this.getSubsidiary().hashCode();
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ManufacturingRoutingSearchBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("autoCalculateLag");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "autoCalculateLag"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billOfMaterials");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billOfMaterials"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("isDefault");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isDefault"));
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
        elemField.setFieldName("item");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lagAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lagAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lagType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lagType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lagUnits");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lagUnits"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
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
        elemField.setFieldName("manufacturingCostTemplate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "manufacturingCostTemplate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("manufacturingWorkCenter");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "manufacturingWorkCenter"));
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
        elemField.setFieldName("operationName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "operationName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("operationYield");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "operationYield"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("runRate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "runRate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("sequence");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "sequence"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("setupTime");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "setupTime"));
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
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchCustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

