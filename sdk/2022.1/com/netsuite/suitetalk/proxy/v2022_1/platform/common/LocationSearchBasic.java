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

public class LocationSearchBasic
extends SearchRecordBasic
implements Serializable {
    private SearchStringField address;
    private SearchBooleanField allowStorePickup;
    private SearchEnumMultiSelectField autoAssignmentRegionSetting;
    private SearchLongField bufferStock;
    private SearchStringField city;
    private SearchEnumMultiSelectField country;
    private SearchStringField county;
    private SearchLongField dailyShippingCapacity;
    private SearchDateField endTime;
    private SearchMultiSelectField externalId;
    private SearchStringField externalIdString;
    private SearchEnumMultiSelectField geolocationMethod;
    private SearchMultiSelectField internalId;
    private SearchLongField internalIdNumber;
    private SearchBooleanField isFriday;
    private SearchBooleanField isInactive;
    private SearchBooleanField isIncludeInCt;
    private SearchBooleanField isMonday;
    private SearchBooleanField isOffice;
    private SearchBooleanField isSaturday;
    private SearchBooleanField isSunday;
    private SearchBooleanField isThursday;
    private SearchBooleanField isTuesday;
    private SearchBooleanField isWednesday;
    private SearchDoubleField latitude;
    private SearchEnumMultiSelectField locationType;
    private SearchDoubleField longitude;
    private SearchBooleanField makeInventoryAvailable;
    private SearchBooleanField makeInventoryAvailableStore;
    private SearchStringField name;
    private SearchStringField nameNoHierarchy;
    private SearchDateField nextPickupCutOffTime;
    private SearchStringField phone;
    private SearchDateField sameDayPickupCutOffTime;
    private SearchDoubleField soPredConfidence;
    private SearchLongField soPredictedDays;
    private SearchDateField startTime;
    private SearchStringField state;
    private SearchDoubleField storePickupBufferStock;
    private SearchMultiSelectField subsidiary;
    private SearchEnumMultiSelectField timeZone;
    private SearchLongField totalShippingCapacity;
    private SearchStringField tranprefix;
    private SearchBooleanField usesBins;
    private SearchStringField zip;
    private SearchCustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(LocationSearchBasic.class, true);

    public LocationSearchBasic() {
    }

    public LocationSearchBasic(SearchStringField address, SearchBooleanField allowStorePickup, SearchEnumMultiSelectField autoAssignmentRegionSetting, SearchLongField bufferStock, SearchStringField city, SearchEnumMultiSelectField country, SearchStringField county, SearchLongField dailyShippingCapacity, SearchDateField endTime, SearchMultiSelectField externalId, SearchStringField externalIdString, SearchEnumMultiSelectField geolocationMethod, SearchMultiSelectField internalId, SearchLongField internalIdNumber, SearchBooleanField isFriday, SearchBooleanField isInactive, SearchBooleanField isIncludeInCt, SearchBooleanField isMonday, SearchBooleanField isOffice, SearchBooleanField isSaturday, SearchBooleanField isSunday, SearchBooleanField isThursday, SearchBooleanField isTuesday, SearchBooleanField isWednesday, SearchDoubleField latitude, SearchEnumMultiSelectField locationType, SearchDoubleField longitude, SearchBooleanField makeInventoryAvailable, SearchBooleanField makeInventoryAvailableStore, SearchStringField name, SearchStringField nameNoHierarchy, SearchDateField nextPickupCutOffTime, SearchStringField phone, SearchDateField sameDayPickupCutOffTime, SearchDoubleField soPredConfidence, SearchLongField soPredictedDays, SearchDateField startTime, SearchStringField state, SearchDoubleField storePickupBufferStock, SearchMultiSelectField subsidiary, SearchEnumMultiSelectField timeZone, SearchLongField totalShippingCapacity, SearchStringField tranprefix, SearchBooleanField usesBins, SearchStringField zip, SearchCustomFieldList customFieldList) {
        this.address = address;
        this.allowStorePickup = allowStorePickup;
        this.autoAssignmentRegionSetting = autoAssignmentRegionSetting;
        this.bufferStock = bufferStock;
        this.city = city;
        this.country = country;
        this.county = county;
        this.dailyShippingCapacity = dailyShippingCapacity;
        this.endTime = endTime;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.geolocationMethod = geolocationMethod;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isFriday = isFriday;
        this.isInactive = isInactive;
        this.isIncludeInCt = isIncludeInCt;
        this.isMonday = isMonday;
        this.isOffice = isOffice;
        this.isSaturday = isSaturday;
        this.isSunday = isSunday;
        this.isThursday = isThursday;
        this.isTuesday = isTuesday;
        this.isWednesday = isWednesday;
        this.latitude = latitude;
        this.locationType = locationType;
        this.longitude = longitude;
        this.makeInventoryAvailable = makeInventoryAvailable;
        this.makeInventoryAvailableStore = makeInventoryAvailableStore;
        this.name = name;
        this.nameNoHierarchy = nameNoHierarchy;
        this.nextPickupCutOffTime = nextPickupCutOffTime;
        this.phone = phone;
        this.sameDayPickupCutOffTime = sameDayPickupCutOffTime;
        this.soPredConfidence = soPredConfidence;
        this.soPredictedDays = soPredictedDays;
        this.startTime = startTime;
        this.state = state;
        this.storePickupBufferStock = storePickupBufferStock;
        this.subsidiary = subsidiary;
        this.timeZone = timeZone;
        this.totalShippingCapacity = totalShippingCapacity;
        this.tranprefix = tranprefix;
        this.usesBins = usesBins;
        this.zip = zip;
        this.customFieldList = customFieldList;
    }

    public SearchStringField getAddress() {
        return this.address;
    }

    public void setAddress(SearchStringField address) {
        this.address = address;
    }

    public SearchBooleanField getAllowStorePickup() {
        return this.allowStorePickup;
    }

    public void setAllowStorePickup(SearchBooleanField allowStorePickup) {
        this.allowStorePickup = allowStorePickup;
    }

    public SearchEnumMultiSelectField getAutoAssignmentRegionSetting() {
        return this.autoAssignmentRegionSetting;
    }

    public void setAutoAssignmentRegionSetting(SearchEnumMultiSelectField autoAssignmentRegionSetting) {
        this.autoAssignmentRegionSetting = autoAssignmentRegionSetting;
    }

    public SearchLongField getBufferStock() {
        return this.bufferStock;
    }

    public void setBufferStock(SearchLongField bufferStock) {
        this.bufferStock = bufferStock;
    }

    public SearchStringField getCity() {
        return this.city;
    }

    public void setCity(SearchStringField city) {
        this.city = city;
    }

    public SearchEnumMultiSelectField getCountry() {
        return this.country;
    }

    public void setCountry(SearchEnumMultiSelectField country) {
        this.country = country;
    }

    public SearchStringField getCounty() {
        return this.county;
    }

    public void setCounty(SearchStringField county) {
        this.county = county;
    }

    public SearchLongField getDailyShippingCapacity() {
        return this.dailyShippingCapacity;
    }

    public void setDailyShippingCapacity(SearchLongField dailyShippingCapacity) {
        this.dailyShippingCapacity = dailyShippingCapacity;
    }

    public SearchDateField getEndTime() {
        return this.endTime;
    }

    public void setEndTime(SearchDateField endTime) {
        this.endTime = endTime;
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

    public SearchEnumMultiSelectField getGeolocationMethod() {
        return this.geolocationMethod;
    }

    public void setGeolocationMethod(SearchEnumMultiSelectField geolocationMethod) {
        this.geolocationMethod = geolocationMethod;
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

    public SearchBooleanField getIsFriday() {
        return this.isFriday;
    }

    public void setIsFriday(SearchBooleanField isFriday) {
        this.isFriday = isFriday;
    }

    public SearchBooleanField getIsInactive() {
        return this.isInactive;
    }

    public void setIsInactive(SearchBooleanField isInactive) {
        this.isInactive = isInactive;
    }

    public SearchBooleanField getIsIncludeInCt() {
        return this.isIncludeInCt;
    }

    public void setIsIncludeInCt(SearchBooleanField isIncludeInCt) {
        this.isIncludeInCt = isIncludeInCt;
    }

    public SearchBooleanField getIsMonday() {
        return this.isMonday;
    }

    public void setIsMonday(SearchBooleanField isMonday) {
        this.isMonday = isMonday;
    }

    public SearchBooleanField getIsOffice() {
        return this.isOffice;
    }

    public void setIsOffice(SearchBooleanField isOffice) {
        this.isOffice = isOffice;
    }

    public SearchBooleanField getIsSaturday() {
        return this.isSaturday;
    }

    public void setIsSaturday(SearchBooleanField isSaturday) {
        this.isSaturday = isSaturday;
    }

    public SearchBooleanField getIsSunday() {
        return this.isSunday;
    }

    public void setIsSunday(SearchBooleanField isSunday) {
        this.isSunday = isSunday;
    }

    public SearchBooleanField getIsThursday() {
        return this.isThursday;
    }

    public void setIsThursday(SearchBooleanField isThursday) {
        this.isThursday = isThursday;
    }

    public SearchBooleanField getIsTuesday() {
        return this.isTuesday;
    }

    public void setIsTuesday(SearchBooleanField isTuesday) {
        this.isTuesday = isTuesday;
    }

    public SearchBooleanField getIsWednesday() {
        return this.isWednesday;
    }

    public void setIsWednesday(SearchBooleanField isWednesday) {
        this.isWednesday = isWednesday;
    }

    public SearchDoubleField getLatitude() {
        return this.latitude;
    }

    public void setLatitude(SearchDoubleField latitude) {
        this.latitude = latitude;
    }

    public SearchEnumMultiSelectField getLocationType() {
        return this.locationType;
    }

    public void setLocationType(SearchEnumMultiSelectField locationType) {
        this.locationType = locationType;
    }

    public SearchDoubleField getLongitude() {
        return this.longitude;
    }

    public void setLongitude(SearchDoubleField longitude) {
        this.longitude = longitude;
    }

    public SearchBooleanField getMakeInventoryAvailable() {
        return this.makeInventoryAvailable;
    }

    public void setMakeInventoryAvailable(SearchBooleanField makeInventoryAvailable) {
        this.makeInventoryAvailable = makeInventoryAvailable;
    }

    public SearchBooleanField getMakeInventoryAvailableStore() {
        return this.makeInventoryAvailableStore;
    }

    public void setMakeInventoryAvailableStore(SearchBooleanField makeInventoryAvailableStore) {
        this.makeInventoryAvailableStore = makeInventoryAvailableStore;
    }

    public SearchStringField getName() {
        return this.name;
    }

    public void setName(SearchStringField name) {
        this.name = name;
    }

    public SearchStringField getNameNoHierarchy() {
        return this.nameNoHierarchy;
    }

    public void setNameNoHierarchy(SearchStringField nameNoHierarchy) {
        this.nameNoHierarchy = nameNoHierarchy;
    }

    public SearchDateField getNextPickupCutOffTime() {
        return this.nextPickupCutOffTime;
    }

    public void setNextPickupCutOffTime(SearchDateField nextPickupCutOffTime) {
        this.nextPickupCutOffTime = nextPickupCutOffTime;
    }

    public SearchStringField getPhone() {
        return this.phone;
    }

    public void setPhone(SearchStringField phone) {
        this.phone = phone;
    }

    public SearchDateField getSameDayPickupCutOffTime() {
        return this.sameDayPickupCutOffTime;
    }

    public void setSameDayPickupCutOffTime(SearchDateField sameDayPickupCutOffTime) {
        this.sameDayPickupCutOffTime = sameDayPickupCutOffTime;
    }

    public SearchDoubleField getSoPredConfidence() {
        return this.soPredConfidence;
    }

    public void setSoPredConfidence(SearchDoubleField soPredConfidence) {
        this.soPredConfidence = soPredConfidence;
    }

    public SearchLongField getSoPredictedDays() {
        return this.soPredictedDays;
    }

    public void setSoPredictedDays(SearchLongField soPredictedDays) {
        this.soPredictedDays = soPredictedDays;
    }

    public SearchDateField getStartTime() {
        return this.startTime;
    }

    public void setStartTime(SearchDateField startTime) {
        this.startTime = startTime;
    }

    public SearchStringField getState() {
        return this.state;
    }

    public void setState(SearchStringField state) {
        this.state = state;
    }

    public SearchDoubleField getStorePickupBufferStock() {
        return this.storePickupBufferStock;
    }

    public void setStorePickupBufferStock(SearchDoubleField storePickupBufferStock) {
        this.storePickupBufferStock = storePickupBufferStock;
    }

    public SearchMultiSelectField getSubsidiary() {
        return this.subsidiary;
    }

    public void setSubsidiary(SearchMultiSelectField subsidiary) {
        this.subsidiary = subsidiary;
    }

    public SearchEnumMultiSelectField getTimeZone() {
        return this.timeZone;
    }

    public void setTimeZone(SearchEnumMultiSelectField timeZone) {
        this.timeZone = timeZone;
    }

    public SearchLongField getTotalShippingCapacity() {
        return this.totalShippingCapacity;
    }

    public void setTotalShippingCapacity(SearchLongField totalShippingCapacity) {
        this.totalShippingCapacity = totalShippingCapacity;
    }

    public SearchStringField getTranprefix() {
        return this.tranprefix;
    }

    public void setTranprefix(SearchStringField tranprefix) {
        this.tranprefix = tranprefix;
    }

    public SearchBooleanField getUsesBins() {
        return this.usesBins;
    }

    public void setUsesBins(SearchBooleanField usesBins) {
        this.usesBins = usesBins;
    }

    public SearchStringField getZip() {
        return this.zip;
    }

    public void setZip(SearchStringField zip) {
        this.zip = zip;
    }

    public SearchCustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof LocationSearchBasic)) {
            return false;
        }
        LocationSearchBasic other = (LocationSearchBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.address == null && other.getAddress() == null || this.address != null && this.address.equals(other.getAddress())) && (this.allowStorePickup == null && other.getAllowStorePickup() == null || this.allowStorePickup != null && this.allowStorePickup.equals(other.getAllowStorePickup())) && (this.autoAssignmentRegionSetting == null && other.getAutoAssignmentRegionSetting() == null || this.autoAssignmentRegionSetting != null && this.autoAssignmentRegionSetting.equals(other.getAutoAssignmentRegionSetting())) && (this.bufferStock == null && other.getBufferStock() == null || this.bufferStock != null && this.bufferStock.equals(other.getBufferStock())) && (this.city == null && other.getCity() == null || this.city != null && this.city.equals(other.getCity())) && (this.country == null && other.getCountry() == null || this.country != null && this.country.equals(other.getCountry())) && (this.county == null && other.getCounty() == null || this.county != null && this.county.equals(other.getCounty())) && (this.dailyShippingCapacity == null && other.getDailyShippingCapacity() == null || this.dailyShippingCapacity != null && this.dailyShippingCapacity.equals(other.getDailyShippingCapacity())) && (this.endTime == null && other.getEndTime() == null || this.endTime != null && this.endTime.equals(other.getEndTime())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId())) && (this.externalIdString == null && other.getExternalIdString() == null || this.externalIdString != null && this.externalIdString.equals(other.getExternalIdString())) && (this.geolocationMethod == null && other.getGeolocationMethod() == null || this.geolocationMethod != null && this.geolocationMethod.equals(other.getGeolocationMethod())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.internalIdNumber == null && other.getInternalIdNumber() == null || this.internalIdNumber != null && this.internalIdNumber.equals(other.getInternalIdNumber())) && (this.isFriday == null && other.getIsFriday() == null || this.isFriday != null && this.isFriday.equals(other.getIsFriday())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && this.isInactive.equals(other.getIsInactive())) && (this.isIncludeInCt == null && other.getIsIncludeInCt() == null || this.isIncludeInCt != null && this.isIncludeInCt.equals(other.getIsIncludeInCt())) && (this.isMonday == null && other.getIsMonday() == null || this.isMonday != null && this.isMonday.equals(other.getIsMonday())) && (this.isOffice == null && other.getIsOffice() == null || this.isOffice != null && this.isOffice.equals(other.getIsOffice())) && (this.isSaturday == null && other.getIsSaturday() == null || this.isSaturday != null && this.isSaturday.equals(other.getIsSaturday())) && (this.isSunday == null && other.getIsSunday() == null || this.isSunday != null && this.isSunday.equals(other.getIsSunday())) && (this.isThursday == null && other.getIsThursday() == null || this.isThursday != null && this.isThursday.equals(other.getIsThursday())) && (this.isTuesday == null && other.getIsTuesday() == null || this.isTuesday != null && this.isTuesday.equals(other.getIsTuesday())) && (this.isWednesday == null && other.getIsWednesday() == null || this.isWednesday != null && this.isWednesday.equals(other.getIsWednesday())) && (this.latitude == null && other.getLatitude() == null || this.latitude != null && this.latitude.equals(other.getLatitude())) && (this.locationType == null && other.getLocationType() == null || this.locationType != null && this.locationType.equals(other.getLocationType())) && (this.longitude == null && other.getLongitude() == null || this.longitude != null && this.longitude.equals(other.getLongitude())) && (this.makeInventoryAvailable == null && other.getMakeInventoryAvailable() == null || this.makeInventoryAvailable != null && this.makeInventoryAvailable.equals(other.getMakeInventoryAvailable())) && (this.makeInventoryAvailableStore == null && other.getMakeInventoryAvailableStore() == null || this.makeInventoryAvailableStore != null && this.makeInventoryAvailableStore.equals(other.getMakeInventoryAvailableStore())) && (this.name == null && other.getName() == null || this.name != null && this.name.equals(other.getName())) && (this.nameNoHierarchy == null && other.getNameNoHierarchy() == null || this.nameNoHierarchy != null && this.nameNoHierarchy.equals(other.getNameNoHierarchy())) && (this.nextPickupCutOffTime == null && other.getNextPickupCutOffTime() == null || this.nextPickupCutOffTime != null && this.nextPickupCutOffTime.equals(other.getNextPickupCutOffTime())) && (this.phone == null && other.getPhone() == null || this.phone != null && this.phone.equals(other.getPhone())) && (this.sameDayPickupCutOffTime == null && other.getSameDayPickupCutOffTime() == null || this.sameDayPickupCutOffTime != null && this.sameDayPickupCutOffTime.equals(other.getSameDayPickupCutOffTime())) && (this.soPredConfidence == null && other.getSoPredConfidence() == null || this.soPredConfidence != null && this.soPredConfidence.equals(other.getSoPredConfidence())) && (this.soPredictedDays == null && other.getSoPredictedDays() == null || this.soPredictedDays != null && this.soPredictedDays.equals(other.getSoPredictedDays())) && (this.startTime == null && other.getStartTime() == null || this.startTime != null && this.startTime.equals(other.getStartTime())) && (this.state == null && other.getState() == null || this.state != null && this.state.equals(other.getState())) && (this.storePickupBufferStock == null && other.getStorePickupBufferStock() == null || this.storePickupBufferStock != null && this.storePickupBufferStock.equals(other.getStorePickupBufferStock())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && this.subsidiary.equals(other.getSubsidiary())) && (this.timeZone == null && other.getTimeZone() == null || this.timeZone != null && this.timeZone.equals(other.getTimeZone())) && (this.totalShippingCapacity == null && other.getTotalShippingCapacity() == null || this.totalShippingCapacity != null && this.totalShippingCapacity.equals(other.getTotalShippingCapacity())) && (this.tranprefix == null && other.getTranprefix() == null || this.tranprefix != null && this.tranprefix.equals(other.getTranprefix())) && (this.usesBins == null && other.getUsesBins() == null || this.usesBins != null && this.usesBins.equals(other.getUsesBins())) && (this.zip == null && other.getZip() == null || this.zip != null && this.zip.equals(other.getZip())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
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
        if (this.getAddress() != null) {
            _hashCode += this.getAddress().hashCode();
        }
        if (this.getAllowStorePickup() != null) {
            _hashCode += this.getAllowStorePickup().hashCode();
        }
        if (this.getAutoAssignmentRegionSetting() != null) {
            _hashCode += this.getAutoAssignmentRegionSetting().hashCode();
        }
        if (this.getBufferStock() != null) {
            _hashCode += this.getBufferStock().hashCode();
        }
        if (this.getCity() != null) {
            _hashCode += this.getCity().hashCode();
        }
        if (this.getCountry() != null) {
            _hashCode += this.getCountry().hashCode();
        }
        if (this.getCounty() != null) {
            _hashCode += this.getCounty().hashCode();
        }
        if (this.getDailyShippingCapacity() != null) {
            _hashCode += this.getDailyShippingCapacity().hashCode();
        }
        if (this.getEndTime() != null) {
            _hashCode += this.getEndTime().hashCode();
        }
        if (this.getExternalId() != null) {
            _hashCode += this.getExternalId().hashCode();
        }
        if (this.getExternalIdString() != null) {
            _hashCode += this.getExternalIdString().hashCode();
        }
        if (this.getGeolocationMethod() != null) {
            _hashCode += this.getGeolocationMethod().hashCode();
        }
        if (this.getInternalId() != null) {
            _hashCode += this.getInternalId().hashCode();
        }
        if (this.getInternalIdNumber() != null) {
            _hashCode += this.getInternalIdNumber().hashCode();
        }
        if (this.getIsFriday() != null) {
            _hashCode += this.getIsFriday().hashCode();
        }
        if (this.getIsInactive() != null) {
            _hashCode += this.getIsInactive().hashCode();
        }
        if (this.getIsIncludeInCt() != null) {
            _hashCode += this.getIsIncludeInCt().hashCode();
        }
        if (this.getIsMonday() != null) {
            _hashCode += this.getIsMonday().hashCode();
        }
        if (this.getIsOffice() != null) {
            _hashCode += this.getIsOffice().hashCode();
        }
        if (this.getIsSaturday() != null) {
            _hashCode += this.getIsSaturday().hashCode();
        }
        if (this.getIsSunday() != null) {
            _hashCode += this.getIsSunday().hashCode();
        }
        if (this.getIsThursday() != null) {
            _hashCode += this.getIsThursday().hashCode();
        }
        if (this.getIsTuesday() != null) {
            _hashCode += this.getIsTuesday().hashCode();
        }
        if (this.getIsWednesday() != null) {
            _hashCode += this.getIsWednesday().hashCode();
        }
        if (this.getLatitude() != null) {
            _hashCode += this.getLatitude().hashCode();
        }
        if (this.getLocationType() != null) {
            _hashCode += this.getLocationType().hashCode();
        }
        if (this.getLongitude() != null) {
            _hashCode += this.getLongitude().hashCode();
        }
        if (this.getMakeInventoryAvailable() != null) {
            _hashCode += this.getMakeInventoryAvailable().hashCode();
        }
        if (this.getMakeInventoryAvailableStore() != null) {
            _hashCode += this.getMakeInventoryAvailableStore().hashCode();
        }
        if (this.getName() != null) {
            _hashCode += this.getName().hashCode();
        }
        if (this.getNameNoHierarchy() != null) {
            _hashCode += this.getNameNoHierarchy().hashCode();
        }
        if (this.getNextPickupCutOffTime() != null) {
            _hashCode += this.getNextPickupCutOffTime().hashCode();
        }
        if (this.getPhone() != null) {
            _hashCode += this.getPhone().hashCode();
        }
        if (this.getSameDayPickupCutOffTime() != null) {
            _hashCode += this.getSameDayPickupCutOffTime().hashCode();
        }
        if (this.getSoPredConfidence() != null) {
            _hashCode += this.getSoPredConfidence().hashCode();
        }
        if (this.getSoPredictedDays() != null) {
            _hashCode += this.getSoPredictedDays().hashCode();
        }
        if (this.getStartTime() != null) {
            _hashCode += this.getStartTime().hashCode();
        }
        if (this.getState() != null) {
            _hashCode += this.getState().hashCode();
        }
        if (this.getStorePickupBufferStock() != null) {
            _hashCode += this.getStorePickupBufferStock().hashCode();
        }
        if (this.getSubsidiary() != null) {
            _hashCode += this.getSubsidiary().hashCode();
        }
        if (this.getTimeZone() != null) {
            _hashCode += this.getTimeZone().hashCode();
        }
        if (this.getTotalShippingCapacity() != null) {
            _hashCode += this.getTotalShippingCapacity().hashCode();
        }
        if (this.getTranprefix() != null) {
            _hashCode += this.getTranprefix().hashCode();
        }
        if (this.getUsesBins() != null) {
            _hashCode += this.getUsesBins().hashCode();
        }
        if (this.getZip() != null) {
            _hashCode += this.getZip().hashCode();
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "LocationSearchBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "address"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("allowStorePickup");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "allowStorePickup"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("autoAssignmentRegionSetting");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "autoAssignmentRegionSetting"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("bufferStock");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "bufferStock"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "city"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "country"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("county");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "county"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("dailyShippingCapacity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "dailyShippingCapacity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("endTime");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "endTime"));
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
        elemField.setFieldName("geolocationMethod");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "geolocationMethod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
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
        elemField.setFieldName("isFriday");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isFriday"));
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
        elemField.setFieldName("isIncludeInCt");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isIncludeInCt"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isMonday");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isMonday"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isOffice");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isOffice"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isSaturday");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isSaturday"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isSunday");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isSunday"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isThursday");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isThursday"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isTuesday");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isTuesday"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isWednesday");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isWednesday"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("latitude");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "latitude"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("longitude");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "longitude"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("makeInventoryAvailable");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "makeInventoryAvailable"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("makeInventoryAvailableStore");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "makeInventoryAvailableStore"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("nameNoHierarchy");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "nameNoHierarchy"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("nextPickupCutOffTime");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "nextPickupCutOffTime"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "phone"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("sameDayPickupCutOffTime");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "sameDayPickupCutOffTime"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("soPredConfidence");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "soPredConfidence"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("soPredictedDays");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "soPredictedDays"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "startTime"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "state"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("storePickupBufferStock");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "storePickupBufferStock"));
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
        elemField.setFieldName("timeZone");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "timeZone"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("totalShippingCapacity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "totalShippingCapacity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("tranprefix");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "tranprefix"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("usesBins");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "usesBins"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("zip");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "zip"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
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

