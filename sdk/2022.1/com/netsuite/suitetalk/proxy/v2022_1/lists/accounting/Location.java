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

import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.ClassTranslationList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.LocationBusinessHoursList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.LocationRegionsList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.types.LocationAutoAssignmentRegionSetting;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.types.LocationGeolocationMethod;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.types.LocationTimeZone;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.types.LocationType;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.Address;
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

public class Location
extends Record
implements Serializable {
    private String name;
    private RecordRef parent;
    private Boolean includeChildren;
    private RecordRefList subsidiaryList;
    private Boolean isInactive;
    private String tranPrefix;
    private Address mainAddress;
    private Address returnAddress;
    private LocationType locationType;
    private LocationTimeZone timeZone;
    private Double latitude;
    private Double longitude;
    private RecordRef logo;
    private Boolean useBins;
    private Boolean makeInventoryAvailable;
    private Boolean makeInventoryAvailableStore;
    private LocationGeolocationMethod geolocationMethod;
    private LocationAutoAssignmentRegionSetting autoAssignmentRegionSetting;
    private Calendar nextPickupCutOffTime;
    private Long bufferStock;
    private Boolean allowStorePickup;
    private Double storePickupBufferStock;
    private Long dailyShippingCapacity;
    private Long totalShippingCapacity;
    private LocationRegionsList includeLocationRegionsList;
    private LocationRegionsList excludeLocationRegionsList;
    private LocationBusinessHoursList businessHoursList;
    private ClassTranslationList classTranslationList;
    private Boolean includeInControlTower;
    private Long soPredictedDays;
    private Double soPredConfidence;
    private CustomFieldList customFieldList;
    private String internalId;
    private String externalId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(Location.class, true);

    public Location() {
    }

    public Location(NullField nullFieldList, String internalId, String externalId, String name, RecordRef parent, Boolean includeChildren, RecordRefList subsidiaryList, Boolean isInactive, String tranPrefix, Address mainAddress, Address returnAddress, LocationType locationType, LocationTimeZone timeZone, Double latitude, Double longitude, RecordRef logo, Boolean useBins, Boolean makeInventoryAvailable, Boolean makeInventoryAvailableStore, LocationGeolocationMethod geolocationMethod, LocationAutoAssignmentRegionSetting autoAssignmentRegionSetting, Calendar nextPickupCutOffTime, Long bufferStock, Boolean allowStorePickup, Double storePickupBufferStock, Long dailyShippingCapacity, Long totalShippingCapacity, LocationRegionsList includeLocationRegionsList, LocationRegionsList excludeLocationRegionsList, LocationBusinessHoursList businessHoursList, ClassTranslationList classTranslationList, Boolean includeInControlTower, Long soPredictedDays, Double soPredConfidence, CustomFieldList customFieldList) {
        super(nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.name = name;
        this.parent = parent;
        this.includeChildren = includeChildren;
        this.subsidiaryList = subsidiaryList;
        this.isInactive = isInactive;
        this.tranPrefix = tranPrefix;
        this.mainAddress = mainAddress;
        this.returnAddress = returnAddress;
        this.locationType = locationType;
        this.timeZone = timeZone;
        this.latitude = latitude;
        this.longitude = longitude;
        this.logo = logo;
        this.useBins = useBins;
        this.makeInventoryAvailable = makeInventoryAvailable;
        this.makeInventoryAvailableStore = makeInventoryAvailableStore;
        this.geolocationMethod = geolocationMethod;
        this.autoAssignmentRegionSetting = autoAssignmentRegionSetting;
        this.nextPickupCutOffTime = nextPickupCutOffTime;
        this.bufferStock = bufferStock;
        this.allowStorePickup = allowStorePickup;
        this.storePickupBufferStock = storePickupBufferStock;
        this.dailyShippingCapacity = dailyShippingCapacity;
        this.totalShippingCapacity = totalShippingCapacity;
        this.includeLocationRegionsList = includeLocationRegionsList;
        this.excludeLocationRegionsList = excludeLocationRegionsList;
        this.businessHoursList = businessHoursList;
        this.classTranslationList = classTranslationList;
        this.includeInControlTower = includeInControlTower;
        this.soPredictedDays = soPredictedDays;
        this.soPredConfidence = soPredConfidence;
        this.customFieldList = customFieldList;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RecordRef getParent() {
        return this.parent;
    }

    public void setParent(RecordRef parent) {
        this.parent = parent;
    }

    public Boolean getIncludeChildren() {
        return this.includeChildren;
    }

    public void setIncludeChildren(Boolean includeChildren) {
        this.includeChildren = includeChildren;
    }

    public RecordRefList getSubsidiaryList() {
        return this.subsidiaryList;
    }

    public void setSubsidiaryList(RecordRefList subsidiaryList) {
        this.subsidiaryList = subsidiaryList;
    }

    public Boolean getIsInactive() {
        return this.isInactive;
    }

    public void setIsInactive(Boolean isInactive) {
        this.isInactive = isInactive;
    }

    public String getTranPrefix() {
        return this.tranPrefix;
    }

    public void setTranPrefix(String tranPrefix) {
        this.tranPrefix = tranPrefix;
    }

    public Address getMainAddress() {
        return this.mainAddress;
    }

    public void setMainAddress(Address mainAddress) {
        this.mainAddress = mainAddress;
    }

    public Address getReturnAddress() {
        return this.returnAddress;
    }

    public void setReturnAddress(Address returnAddress) {
        this.returnAddress = returnAddress;
    }

    public LocationType getLocationType() {
        return this.locationType;
    }

    public void setLocationType(LocationType locationType) {
        this.locationType = locationType;
    }

    public LocationTimeZone getTimeZone() {
        return this.timeZone;
    }

    public void setTimeZone(LocationTimeZone timeZone) {
        this.timeZone = timeZone;
    }

    public Double getLatitude() {
        return this.latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return this.longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public RecordRef getLogo() {
        return this.logo;
    }

    public void setLogo(RecordRef logo) {
        this.logo = logo;
    }

    public Boolean getUseBins() {
        return this.useBins;
    }

    public void setUseBins(Boolean useBins) {
        this.useBins = useBins;
    }

    public Boolean getMakeInventoryAvailable() {
        return this.makeInventoryAvailable;
    }

    public void setMakeInventoryAvailable(Boolean makeInventoryAvailable) {
        this.makeInventoryAvailable = makeInventoryAvailable;
    }

    public Boolean getMakeInventoryAvailableStore() {
        return this.makeInventoryAvailableStore;
    }

    public void setMakeInventoryAvailableStore(Boolean makeInventoryAvailableStore) {
        this.makeInventoryAvailableStore = makeInventoryAvailableStore;
    }

    public LocationGeolocationMethod getGeolocationMethod() {
        return this.geolocationMethod;
    }

    public void setGeolocationMethod(LocationGeolocationMethod geolocationMethod) {
        this.geolocationMethod = geolocationMethod;
    }

    public LocationAutoAssignmentRegionSetting getAutoAssignmentRegionSetting() {
        return this.autoAssignmentRegionSetting;
    }

    public void setAutoAssignmentRegionSetting(LocationAutoAssignmentRegionSetting autoAssignmentRegionSetting) {
        this.autoAssignmentRegionSetting = autoAssignmentRegionSetting;
    }

    public Calendar getNextPickupCutOffTime() {
        return this.nextPickupCutOffTime;
    }

    public void setNextPickupCutOffTime(Calendar nextPickupCutOffTime) {
        this.nextPickupCutOffTime = nextPickupCutOffTime;
    }

    public Long getBufferStock() {
        return this.bufferStock;
    }

    public void setBufferStock(Long bufferStock) {
        this.bufferStock = bufferStock;
    }

    public Boolean getAllowStorePickup() {
        return this.allowStorePickup;
    }

    public void setAllowStorePickup(Boolean allowStorePickup) {
        this.allowStorePickup = allowStorePickup;
    }

    public Double getStorePickupBufferStock() {
        return this.storePickupBufferStock;
    }

    public void setStorePickupBufferStock(Double storePickupBufferStock) {
        this.storePickupBufferStock = storePickupBufferStock;
    }

    public Long getDailyShippingCapacity() {
        return this.dailyShippingCapacity;
    }

    public void setDailyShippingCapacity(Long dailyShippingCapacity) {
        this.dailyShippingCapacity = dailyShippingCapacity;
    }

    public Long getTotalShippingCapacity() {
        return this.totalShippingCapacity;
    }

    public void setTotalShippingCapacity(Long totalShippingCapacity) {
        this.totalShippingCapacity = totalShippingCapacity;
    }

    public LocationRegionsList getIncludeLocationRegionsList() {
        return this.includeLocationRegionsList;
    }

    public void setIncludeLocationRegionsList(LocationRegionsList includeLocationRegionsList) {
        this.includeLocationRegionsList = includeLocationRegionsList;
    }

    public LocationRegionsList getExcludeLocationRegionsList() {
        return this.excludeLocationRegionsList;
    }

    public void setExcludeLocationRegionsList(LocationRegionsList excludeLocationRegionsList) {
        this.excludeLocationRegionsList = excludeLocationRegionsList;
    }

    public LocationBusinessHoursList getBusinessHoursList() {
        return this.businessHoursList;
    }

    public void setBusinessHoursList(LocationBusinessHoursList businessHoursList) {
        this.businessHoursList = businessHoursList;
    }

    public ClassTranslationList getClassTranslationList() {
        return this.classTranslationList;
    }

    public void setClassTranslationList(ClassTranslationList classTranslationList) {
        this.classTranslationList = classTranslationList;
    }

    public Boolean getIncludeInControlTower() {
        return this.includeInControlTower;
    }

    public void setIncludeInControlTower(Boolean includeInControlTower) {
        this.includeInControlTower = includeInControlTower;
    }

    public Long getSoPredictedDays() {
        return this.soPredictedDays;
    }

    public void setSoPredictedDays(Long soPredictedDays) {
        this.soPredictedDays = soPredictedDays;
    }

    public Double getSoPredConfidence() {
        return this.soPredConfidence;
    }

    public void setSoPredConfidence(Double soPredConfidence) {
        this.soPredConfidence = soPredConfidence;
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
        if (!(obj instanceof Location)) {
            return false;
        }
        Location other = (Location)obj;
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
        boolean _equals = super.equals(obj) && (this.name == null && other.getName() == null || this.name != null && this.name.equals(other.getName())) && (this.parent == null && other.getParent() == null || this.parent != null && this.parent.equals(other.getParent())) && (this.includeChildren == null && other.getIncludeChildren() == null || this.includeChildren != null && this.includeChildren.equals(other.getIncludeChildren())) && (this.subsidiaryList == null && other.getSubsidiaryList() == null || this.subsidiaryList != null && this.subsidiaryList.equals(other.getSubsidiaryList())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && this.isInactive.equals(other.getIsInactive())) && (this.tranPrefix == null && other.getTranPrefix() == null || this.tranPrefix != null && this.tranPrefix.equals(other.getTranPrefix())) && (this.mainAddress == null && other.getMainAddress() == null || this.mainAddress != null && this.mainAddress.equals(other.getMainAddress())) && (this.returnAddress == null && other.getReturnAddress() == null || this.returnAddress != null && this.returnAddress.equals(other.getReturnAddress())) && (this.locationType == null && other.getLocationType() == null || this.locationType != null && this.locationType.equals(other.getLocationType())) && (this.timeZone == null && other.getTimeZone() == null || this.timeZone != null && this.timeZone.equals(other.getTimeZone())) && (this.latitude == null && other.getLatitude() == null || this.latitude != null && this.latitude.equals(other.getLatitude())) && (this.longitude == null && other.getLongitude() == null || this.longitude != null && this.longitude.equals(other.getLongitude())) && (this.logo == null && other.getLogo() == null || this.logo != null && this.logo.equals(other.getLogo())) && (this.useBins == null && other.getUseBins() == null || this.useBins != null && this.useBins.equals(other.getUseBins())) && (this.makeInventoryAvailable == null && other.getMakeInventoryAvailable() == null || this.makeInventoryAvailable != null && this.makeInventoryAvailable.equals(other.getMakeInventoryAvailable())) && (this.makeInventoryAvailableStore == null && other.getMakeInventoryAvailableStore() == null || this.makeInventoryAvailableStore != null && this.makeInventoryAvailableStore.equals(other.getMakeInventoryAvailableStore())) && (this.geolocationMethod == null && other.getGeolocationMethod() == null || this.geolocationMethod != null && this.geolocationMethod.equals(other.getGeolocationMethod())) && (this.autoAssignmentRegionSetting == null && other.getAutoAssignmentRegionSetting() == null || this.autoAssignmentRegionSetting != null && this.autoAssignmentRegionSetting.equals(other.getAutoAssignmentRegionSetting())) && (this.nextPickupCutOffTime == null && other.getNextPickupCutOffTime() == null || this.nextPickupCutOffTime != null && this.nextPickupCutOffTime.equals(other.getNextPickupCutOffTime())) && (this.bufferStock == null && other.getBufferStock() == null || this.bufferStock != null && this.bufferStock.equals(other.getBufferStock())) && (this.allowStorePickup == null && other.getAllowStorePickup() == null || this.allowStorePickup != null && this.allowStorePickup.equals(other.getAllowStorePickup())) && (this.storePickupBufferStock == null && other.getStorePickupBufferStock() == null || this.storePickupBufferStock != null && this.storePickupBufferStock.equals(other.getStorePickupBufferStock())) && (this.dailyShippingCapacity == null && other.getDailyShippingCapacity() == null || this.dailyShippingCapacity != null && this.dailyShippingCapacity.equals(other.getDailyShippingCapacity())) && (this.totalShippingCapacity == null && other.getTotalShippingCapacity() == null || this.totalShippingCapacity != null && this.totalShippingCapacity.equals(other.getTotalShippingCapacity())) && (this.includeLocationRegionsList == null && other.getIncludeLocationRegionsList() == null || this.includeLocationRegionsList != null && this.includeLocationRegionsList.equals(other.getIncludeLocationRegionsList())) && (this.excludeLocationRegionsList == null && other.getExcludeLocationRegionsList() == null || this.excludeLocationRegionsList != null && this.excludeLocationRegionsList.equals(other.getExcludeLocationRegionsList())) && (this.businessHoursList == null && other.getBusinessHoursList() == null || this.businessHoursList != null && this.businessHoursList.equals(other.getBusinessHoursList())) && (this.classTranslationList == null && other.getClassTranslationList() == null || this.classTranslationList != null && this.classTranslationList.equals(other.getClassTranslationList())) && (this.includeInControlTower == null && other.getIncludeInControlTower() == null || this.includeInControlTower != null && this.includeInControlTower.equals(other.getIncludeInControlTower())) && (this.soPredictedDays == null && other.getSoPredictedDays() == null || this.soPredictedDays != null && this.soPredictedDays.equals(other.getSoPredictedDays())) && (this.soPredConfidence == null && other.getSoPredConfidence() == null || this.soPredConfidence != null && this.soPredConfidence.equals(other.getSoPredConfidence())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
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
        if (this.getName() != null) {
            _hashCode += this.getName().hashCode();
        }
        if (this.getParent() != null) {
            _hashCode += this.getParent().hashCode();
        }
        if (this.getIncludeChildren() != null) {
            _hashCode += this.getIncludeChildren().hashCode();
        }
        if (this.getSubsidiaryList() != null) {
            _hashCode += this.getSubsidiaryList().hashCode();
        }
        if (this.getIsInactive() != null) {
            _hashCode += this.getIsInactive().hashCode();
        }
        if (this.getTranPrefix() != null) {
            _hashCode += this.getTranPrefix().hashCode();
        }
        if (this.getMainAddress() != null) {
            _hashCode += this.getMainAddress().hashCode();
        }
        if (this.getReturnAddress() != null) {
            _hashCode += this.getReturnAddress().hashCode();
        }
        if (this.getLocationType() != null) {
            _hashCode += this.getLocationType().hashCode();
        }
        if (this.getTimeZone() != null) {
            _hashCode += this.getTimeZone().hashCode();
        }
        if (this.getLatitude() != null) {
            _hashCode += this.getLatitude().hashCode();
        }
        if (this.getLongitude() != null) {
            _hashCode += this.getLongitude().hashCode();
        }
        if (this.getLogo() != null) {
            _hashCode += this.getLogo().hashCode();
        }
        if (this.getUseBins() != null) {
            _hashCode += this.getUseBins().hashCode();
        }
        if (this.getMakeInventoryAvailable() != null) {
            _hashCode += this.getMakeInventoryAvailable().hashCode();
        }
        if (this.getMakeInventoryAvailableStore() != null) {
            _hashCode += this.getMakeInventoryAvailableStore().hashCode();
        }
        if (this.getGeolocationMethod() != null) {
            _hashCode += this.getGeolocationMethod().hashCode();
        }
        if (this.getAutoAssignmentRegionSetting() != null) {
            _hashCode += this.getAutoAssignmentRegionSetting().hashCode();
        }
        if (this.getNextPickupCutOffTime() != null) {
            _hashCode += this.getNextPickupCutOffTime().hashCode();
        }
        if (this.getBufferStock() != null) {
            _hashCode += this.getBufferStock().hashCode();
        }
        if (this.getAllowStorePickup() != null) {
            _hashCode += this.getAllowStorePickup().hashCode();
        }
        if (this.getStorePickupBufferStock() != null) {
            _hashCode += this.getStorePickupBufferStock().hashCode();
        }
        if (this.getDailyShippingCapacity() != null) {
            _hashCode += this.getDailyShippingCapacity().hashCode();
        }
        if (this.getTotalShippingCapacity() != null) {
            _hashCode += this.getTotalShippingCapacity().hashCode();
        }
        if (this.getIncludeLocationRegionsList() != null) {
            _hashCode += this.getIncludeLocationRegionsList().hashCode();
        }
        if (this.getExcludeLocationRegionsList() != null) {
            _hashCode += this.getExcludeLocationRegionsList().hashCode();
        }
        if (this.getBusinessHoursList() != null) {
            _hashCode += this.getBusinessHoursList().hashCode();
        }
        if (this.getClassTranslationList() != null) {
            _hashCode += this.getClassTranslationList().hashCode();
        }
        if (this.getIncludeInControlTower() != null) {
            _hashCode += this.getIncludeInControlTower().hashCode();
        }
        if (this.getSoPredictedDays() != null) {
            _hashCode += this.getSoPredictedDays().hashCode();
        }
        if (this.getSoPredConfidence() != null) {
            _hashCode += this.getSoPredConfidence().hashCode();
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
        typeDesc.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "Location"));
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
        elemField.setFieldName("name");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "name"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "parent"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("subsidiaryList");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "subsidiaryList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRefList"));
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
        elemField.setFieldName("tranPrefix");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "tranPrefix"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("mainAddress");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "mainAddress"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("returnAddress");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "returnAddress"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "Address"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationType");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "locationType"));
        elemField.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "LocationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("timeZone");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "timeZone"));
        elemField.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "LocationTimeZone"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("latitude");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "latitude"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("longitude");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "longitude"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("logo");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "logo"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("useBins");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "useBins"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("makeInventoryAvailable");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "makeInventoryAvailable"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("makeInventoryAvailableStore");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "makeInventoryAvailableStore"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("geolocationMethod");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "geolocationMethod"));
        elemField.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "LocationGeolocationMethod"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("autoAssignmentRegionSetting");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "autoAssignmentRegionSetting"));
        elemField.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "LocationAutoAssignmentRegionSetting"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("nextPickupCutOffTime");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "nextPickupCutOffTime"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("bufferStock");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "bufferStock"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("allowStorePickup");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "allowStorePickup"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("storePickupBufferStock");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "storePickupBufferStock"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("dailyShippingCapacity");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "dailyShippingCapacity"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("totalShippingCapacity");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "totalShippingCapacity"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("includeLocationRegionsList");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "includeLocationRegionsList"));
        elemField.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "LocationRegionsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("excludeLocationRegionsList");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "excludeLocationRegionsList"));
        elemField.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "LocationRegionsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("businessHoursList");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "businessHoursList"));
        elemField.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "LocationBusinessHoursList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("classTranslationList");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "classTranslationList"));
        elemField.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "ClassTranslationList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("includeInControlTower");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "includeInControlTower"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("soPredictedDays");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "soPredictedDays"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("soPredConfidence");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "soPredConfidence"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
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

