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

public class LocationSearchRowBasic
extends SearchRowBasic
implements Serializable {
    private SearchColumnStringField[] address1;
    private SearchColumnStringField[] address2;
    private SearchColumnStringField[] address3;
    private SearchColumnBooleanField[] allowStorePickup;
    private SearchColumnEnumSelectField[] autoAssignmentRegionSetting;
    private SearchColumnLongField[] bufferStock;
    private SearchColumnStringField[] city;
    private SearchColumnEnumSelectField[] country;
    private SearchColumnLongField[] dailyShippingCapacity;
    private SearchColumnDateField[] endTime;
    private SearchColumnSelectField[] externalId;
    private SearchColumnEnumSelectField[] geolocationMethod;
    private SearchColumnSelectField[] internalId;
    private SearchColumnBooleanField[] isFriday;
    private SearchColumnBooleanField[] isInactive;
    private SearchColumnBooleanField[] isIncludeInCt;
    private SearchColumnBooleanField[] isMonday;
    private SearchColumnBooleanField[] isOffice;
    private SearchColumnBooleanField[] isSaturday;
    private SearchColumnBooleanField[] isSunday;
    private SearchColumnBooleanField[] isThursday;
    private SearchColumnBooleanField[] isTuesday;
    private SearchColumnBooleanField[] isWednesday;
    private SearchColumnDoubleField[] latitude;
    private SearchColumnEnumSelectField[] locationType;
    private SearchColumnDoubleField[] longitude;
    private SearchColumnBooleanField[] makeInventoryAvailable;
    private SearchColumnBooleanField[] makeInventoryAvailableStore;
    private SearchColumnStringField[] name;
    private SearchColumnStringField[] nameNoHierarchy;
    private SearchColumnDateField[] nextPickupCutOffTime;
    private SearchColumnStringField[] phone;
    private SearchColumnDateField[] sameDayPickupCutOffTime;
    private SearchColumnDoubleField[] soPredConfidence;
    private SearchColumnLongField[] soPredictedDays;
    private SearchColumnDateField[] startTime;
    private SearchColumnStringField[] state;
    private SearchColumnDoubleField[] storePickupBufferStock;
    private SearchColumnSelectField[] subsidiary;
    private SearchColumnEnumSelectField[] timeZone;
    private SearchColumnLongField[] totalShippingCapacity;
    private SearchColumnStringField[] tranPrefix;
    private SearchColumnBooleanField[] usesBins;
    private SearchColumnStringField[] zip;
    private SearchColumnCustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(LocationSearchRowBasic.class, true);

    public LocationSearchRowBasic() {
    }

    public LocationSearchRowBasic(SearchColumnStringField[] address1, SearchColumnStringField[] address2, SearchColumnStringField[] address3, SearchColumnBooleanField[] allowStorePickup, SearchColumnEnumSelectField[] autoAssignmentRegionSetting, SearchColumnLongField[] bufferStock, SearchColumnStringField[] city, SearchColumnEnumSelectField[] country, SearchColumnLongField[] dailyShippingCapacity, SearchColumnDateField[] endTime, SearchColumnSelectField[] externalId, SearchColumnEnumSelectField[] geolocationMethod, SearchColumnSelectField[] internalId, SearchColumnBooleanField[] isFriday, SearchColumnBooleanField[] isInactive, SearchColumnBooleanField[] isIncludeInCt, SearchColumnBooleanField[] isMonday, SearchColumnBooleanField[] isOffice, SearchColumnBooleanField[] isSaturday, SearchColumnBooleanField[] isSunday, SearchColumnBooleanField[] isThursday, SearchColumnBooleanField[] isTuesday, SearchColumnBooleanField[] isWednesday, SearchColumnDoubleField[] latitude, SearchColumnEnumSelectField[] locationType, SearchColumnDoubleField[] longitude, SearchColumnBooleanField[] makeInventoryAvailable, SearchColumnBooleanField[] makeInventoryAvailableStore, SearchColumnStringField[] name, SearchColumnStringField[] nameNoHierarchy, SearchColumnDateField[] nextPickupCutOffTime, SearchColumnStringField[] phone, SearchColumnDateField[] sameDayPickupCutOffTime, SearchColumnDoubleField[] soPredConfidence, SearchColumnLongField[] soPredictedDays, SearchColumnDateField[] startTime, SearchColumnStringField[] state, SearchColumnDoubleField[] storePickupBufferStock, SearchColumnSelectField[] subsidiary, SearchColumnEnumSelectField[] timeZone, SearchColumnLongField[] totalShippingCapacity, SearchColumnStringField[] tranPrefix, SearchColumnBooleanField[] usesBins, SearchColumnStringField[] zip, SearchColumnCustomFieldList customFieldList) {
        this.address1 = address1;
        this.address2 = address2;
        this.address3 = address3;
        this.allowStorePickup = allowStorePickup;
        this.autoAssignmentRegionSetting = autoAssignmentRegionSetting;
        this.bufferStock = bufferStock;
        this.city = city;
        this.country = country;
        this.dailyShippingCapacity = dailyShippingCapacity;
        this.endTime = endTime;
        this.externalId = externalId;
        this.geolocationMethod = geolocationMethod;
        this.internalId = internalId;
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
        this.tranPrefix = tranPrefix;
        this.usesBins = usesBins;
        this.zip = zip;
        this.customFieldList = customFieldList;
    }

    public SearchColumnStringField[] getAddress1() {
        return this.address1;
    }

    public void setAddress1(SearchColumnStringField[] address1) {
        this.address1 = address1;
    }

    public SearchColumnStringField getAddress1(int i) {
        return this.address1[i];
    }

    public void setAddress1(int i, SearchColumnStringField _value) {
        this.address1[i] = _value;
    }

    public SearchColumnStringField[] getAddress2() {
        return this.address2;
    }

    public void setAddress2(SearchColumnStringField[] address2) {
        this.address2 = address2;
    }

    public SearchColumnStringField getAddress2(int i) {
        return this.address2[i];
    }

    public void setAddress2(int i, SearchColumnStringField _value) {
        this.address2[i] = _value;
    }

    public SearchColumnStringField[] getAddress3() {
        return this.address3;
    }

    public void setAddress3(SearchColumnStringField[] address3) {
        this.address3 = address3;
    }

    public SearchColumnStringField getAddress3(int i) {
        return this.address3[i];
    }

    public void setAddress3(int i, SearchColumnStringField _value) {
        this.address3[i] = _value;
    }

    public SearchColumnBooleanField[] getAllowStorePickup() {
        return this.allowStorePickup;
    }

    public void setAllowStorePickup(SearchColumnBooleanField[] allowStorePickup) {
        this.allowStorePickup = allowStorePickup;
    }

    public SearchColumnBooleanField getAllowStorePickup(int i) {
        return this.allowStorePickup[i];
    }

    public void setAllowStorePickup(int i, SearchColumnBooleanField _value) {
        this.allowStorePickup[i] = _value;
    }

    public SearchColumnEnumSelectField[] getAutoAssignmentRegionSetting() {
        return this.autoAssignmentRegionSetting;
    }

    public void setAutoAssignmentRegionSetting(SearchColumnEnumSelectField[] autoAssignmentRegionSetting) {
        this.autoAssignmentRegionSetting = autoAssignmentRegionSetting;
    }

    public SearchColumnEnumSelectField getAutoAssignmentRegionSetting(int i) {
        return this.autoAssignmentRegionSetting[i];
    }

    public void setAutoAssignmentRegionSetting(int i, SearchColumnEnumSelectField _value) {
        this.autoAssignmentRegionSetting[i] = _value;
    }

    public SearchColumnLongField[] getBufferStock() {
        return this.bufferStock;
    }

    public void setBufferStock(SearchColumnLongField[] bufferStock) {
        this.bufferStock = bufferStock;
    }

    public SearchColumnLongField getBufferStock(int i) {
        return this.bufferStock[i];
    }

    public void setBufferStock(int i, SearchColumnLongField _value) {
        this.bufferStock[i] = _value;
    }

    public SearchColumnStringField[] getCity() {
        return this.city;
    }

    public void setCity(SearchColumnStringField[] city) {
        this.city = city;
    }

    public SearchColumnStringField getCity(int i) {
        return this.city[i];
    }

    public void setCity(int i, SearchColumnStringField _value) {
        this.city[i] = _value;
    }

    public SearchColumnEnumSelectField[] getCountry() {
        return this.country;
    }

    public void setCountry(SearchColumnEnumSelectField[] country) {
        this.country = country;
    }

    public SearchColumnEnumSelectField getCountry(int i) {
        return this.country[i];
    }

    public void setCountry(int i, SearchColumnEnumSelectField _value) {
        this.country[i] = _value;
    }

    public SearchColumnLongField[] getDailyShippingCapacity() {
        return this.dailyShippingCapacity;
    }

    public void setDailyShippingCapacity(SearchColumnLongField[] dailyShippingCapacity) {
        this.dailyShippingCapacity = dailyShippingCapacity;
    }

    public SearchColumnLongField getDailyShippingCapacity(int i) {
        return this.dailyShippingCapacity[i];
    }

    public void setDailyShippingCapacity(int i, SearchColumnLongField _value) {
        this.dailyShippingCapacity[i] = _value;
    }

    public SearchColumnDateField[] getEndTime() {
        return this.endTime;
    }

    public void setEndTime(SearchColumnDateField[] endTime) {
        this.endTime = endTime;
    }

    public SearchColumnDateField getEndTime(int i) {
        return this.endTime[i];
    }

    public void setEndTime(int i, SearchColumnDateField _value) {
        this.endTime[i] = _value;
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

    public SearchColumnEnumSelectField[] getGeolocationMethod() {
        return this.geolocationMethod;
    }

    public void setGeolocationMethod(SearchColumnEnumSelectField[] geolocationMethod) {
        this.geolocationMethod = geolocationMethod;
    }

    public SearchColumnEnumSelectField getGeolocationMethod(int i) {
        return this.geolocationMethod[i];
    }

    public void setGeolocationMethod(int i, SearchColumnEnumSelectField _value) {
        this.geolocationMethod[i] = _value;
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

    public SearchColumnBooleanField[] getIsFriday() {
        return this.isFriday;
    }

    public void setIsFriday(SearchColumnBooleanField[] isFriday) {
        this.isFriday = isFriday;
    }

    public SearchColumnBooleanField getIsFriday(int i) {
        return this.isFriday[i];
    }

    public void setIsFriday(int i, SearchColumnBooleanField _value) {
        this.isFriday[i] = _value;
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

    public SearchColumnBooleanField[] getIsIncludeInCt() {
        return this.isIncludeInCt;
    }

    public void setIsIncludeInCt(SearchColumnBooleanField[] isIncludeInCt) {
        this.isIncludeInCt = isIncludeInCt;
    }

    public SearchColumnBooleanField getIsIncludeInCt(int i) {
        return this.isIncludeInCt[i];
    }

    public void setIsIncludeInCt(int i, SearchColumnBooleanField _value) {
        this.isIncludeInCt[i] = _value;
    }

    public SearchColumnBooleanField[] getIsMonday() {
        return this.isMonday;
    }

    public void setIsMonday(SearchColumnBooleanField[] isMonday) {
        this.isMonday = isMonday;
    }

    public SearchColumnBooleanField getIsMonday(int i) {
        return this.isMonday[i];
    }

    public void setIsMonday(int i, SearchColumnBooleanField _value) {
        this.isMonday[i] = _value;
    }

    public SearchColumnBooleanField[] getIsOffice() {
        return this.isOffice;
    }

    public void setIsOffice(SearchColumnBooleanField[] isOffice) {
        this.isOffice = isOffice;
    }

    public SearchColumnBooleanField getIsOffice(int i) {
        return this.isOffice[i];
    }

    public void setIsOffice(int i, SearchColumnBooleanField _value) {
        this.isOffice[i] = _value;
    }

    public SearchColumnBooleanField[] getIsSaturday() {
        return this.isSaturday;
    }

    public void setIsSaturday(SearchColumnBooleanField[] isSaturday) {
        this.isSaturday = isSaturday;
    }

    public SearchColumnBooleanField getIsSaturday(int i) {
        return this.isSaturday[i];
    }

    public void setIsSaturday(int i, SearchColumnBooleanField _value) {
        this.isSaturday[i] = _value;
    }

    public SearchColumnBooleanField[] getIsSunday() {
        return this.isSunday;
    }

    public void setIsSunday(SearchColumnBooleanField[] isSunday) {
        this.isSunday = isSunday;
    }

    public SearchColumnBooleanField getIsSunday(int i) {
        return this.isSunday[i];
    }

    public void setIsSunday(int i, SearchColumnBooleanField _value) {
        this.isSunday[i] = _value;
    }

    public SearchColumnBooleanField[] getIsThursday() {
        return this.isThursday;
    }

    public void setIsThursday(SearchColumnBooleanField[] isThursday) {
        this.isThursday = isThursday;
    }

    public SearchColumnBooleanField getIsThursday(int i) {
        return this.isThursday[i];
    }

    public void setIsThursday(int i, SearchColumnBooleanField _value) {
        this.isThursday[i] = _value;
    }

    public SearchColumnBooleanField[] getIsTuesday() {
        return this.isTuesday;
    }

    public void setIsTuesday(SearchColumnBooleanField[] isTuesday) {
        this.isTuesday = isTuesday;
    }

    public SearchColumnBooleanField getIsTuesday(int i) {
        return this.isTuesday[i];
    }

    public void setIsTuesday(int i, SearchColumnBooleanField _value) {
        this.isTuesday[i] = _value;
    }

    public SearchColumnBooleanField[] getIsWednesday() {
        return this.isWednesday;
    }

    public void setIsWednesday(SearchColumnBooleanField[] isWednesday) {
        this.isWednesday = isWednesday;
    }

    public SearchColumnBooleanField getIsWednesday(int i) {
        return this.isWednesday[i];
    }

    public void setIsWednesday(int i, SearchColumnBooleanField _value) {
        this.isWednesday[i] = _value;
    }

    public SearchColumnDoubleField[] getLatitude() {
        return this.latitude;
    }

    public void setLatitude(SearchColumnDoubleField[] latitude) {
        this.latitude = latitude;
    }

    public SearchColumnDoubleField getLatitude(int i) {
        return this.latitude[i];
    }

    public void setLatitude(int i, SearchColumnDoubleField _value) {
        this.latitude[i] = _value;
    }

    public SearchColumnEnumSelectField[] getLocationType() {
        return this.locationType;
    }

    public void setLocationType(SearchColumnEnumSelectField[] locationType) {
        this.locationType = locationType;
    }

    public SearchColumnEnumSelectField getLocationType(int i) {
        return this.locationType[i];
    }

    public void setLocationType(int i, SearchColumnEnumSelectField _value) {
        this.locationType[i] = _value;
    }

    public SearchColumnDoubleField[] getLongitude() {
        return this.longitude;
    }

    public void setLongitude(SearchColumnDoubleField[] longitude) {
        this.longitude = longitude;
    }

    public SearchColumnDoubleField getLongitude(int i) {
        return this.longitude[i];
    }

    public void setLongitude(int i, SearchColumnDoubleField _value) {
        this.longitude[i] = _value;
    }

    public SearchColumnBooleanField[] getMakeInventoryAvailable() {
        return this.makeInventoryAvailable;
    }

    public void setMakeInventoryAvailable(SearchColumnBooleanField[] makeInventoryAvailable) {
        this.makeInventoryAvailable = makeInventoryAvailable;
    }

    public SearchColumnBooleanField getMakeInventoryAvailable(int i) {
        return this.makeInventoryAvailable[i];
    }

    public void setMakeInventoryAvailable(int i, SearchColumnBooleanField _value) {
        this.makeInventoryAvailable[i] = _value;
    }

    public SearchColumnBooleanField[] getMakeInventoryAvailableStore() {
        return this.makeInventoryAvailableStore;
    }

    public void setMakeInventoryAvailableStore(SearchColumnBooleanField[] makeInventoryAvailableStore) {
        this.makeInventoryAvailableStore = makeInventoryAvailableStore;
    }

    public SearchColumnBooleanField getMakeInventoryAvailableStore(int i) {
        return this.makeInventoryAvailableStore[i];
    }

    public void setMakeInventoryAvailableStore(int i, SearchColumnBooleanField _value) {
        this.makeInventoryAvailableStore[i] = _value;
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

    public SearchColumnStringField[] getNameNoHierarchy() {
        return this.nameNoHierarchy;
    }

    public void setNameNoHierarchy(SearchColumnStringField[] nameNoHierarchy) {
        this.nameNoHierarchy = nameNoHierarchy;
    }

    public SearchColumnStringField getNameNoHierarchy(int i) {
        return this.nameNoHierarchy[i];
    }

    public void setNameNoHierarchy(int i, SearchColumnStringField _value) {
        this.nameNoHierarchy[i] = _value;
    }

    public SearchColumnDateField[] getNextPickupCutOffTime() {
        return this.nextPickupCutOffTime;
    }

    public void setNextPickupCutOffTime(SearchColumnDateField[] nextPickupCutOffTime) {
        this.nextPickupCutOffTime = nextPickupCutOffTime;
    }

    public SearchColumnDateField getNextPickupCutOffTime(int i) {
        return this.nextPickupCutOffTime[i];
    }

    public void setNextPickupCutOffTime(int i, SearchColumnDateField _value) {
        this.nextPickupCutOffTime[i] = _value;
    }

    public SearchColumnStringField[] getPhone() {
        return this.phone;
    }

    public void setPhone(SearchColumnStringField[] phone) {
        this.phone = phone;
    }

    public SearchColumnStringField getPhone(int i) {
        return this.phone[i];
    }

    public void setPhone(int i, SearchColumnStringField _value) {
        this.phone[i] = _value;
    }

    public SearchColumnDateField[] getSameDayPickupCutOffTime() {
        return this.sameDayPickupCutOffTime;
    }

    public void setSameDayPickupCutOffTime(SearchColumnDateField[] sameDayPickupCutOffTime) {
        this.sameDayPickupCutOffTime = sameDayPickupCutOffTime;
    }

    public SearchColumnDateField getSameDayPickupCutOffTime(int i) {
        return this.sameDayPickupCutOffTime[i];
    }

    public void setSameDayPickupCutOffTime(int i, SearchColumnDateField _value) {
        this.sameDayPickupCutOffTime[i] = _value;
    }

    public SearchColumnDoubleField[] getSoPredConfidence() {
        return this.soPredConfidence;
    }

    public void setSoPredConfidence(SearchColumnDoubleField[] soPredConfidence) {
        this.soPredConfidence = soPredConfidence;
    }

    public SearchColumnDoubleField getSoPredConfidence(int i) {
        return this.soPredConfidence[i];
    }

    public void setSoPredConfidence(int i, SearchColumnDoubleField _value) {
        this.soPredConfidence[i] = _value;
    }

    public SearchColumnLongField[] getSoPredictedDays() {
        return this.soPredictedDays;
    }

    public void setSoPredictedDays(SearchColumnLongField[] soPredictedDays) {
        this.soPredictedDays = soPredictedDays;
    }

    public SearchColumnLongField getSoPredictedDays(int i) {
        return this.soPredictedDays[i];
    }

    public void setSoPredictedDays(int i, SearchColumnLongField _value) {
        this.soPredictedDays[i] = _value;
    }

    public SearchColumnDateField[] getStartTime() {
        return this.startTime;
    }

    public void setStartTime(SearchColumnDateField[] startTime) {
        this.startTime = startTime;
    }

    public SearchColumnDateField getStartTime(int i) {
        return this.startTime[i];
    }

    public void setStartTime(int i, SearchColumnDateField _value) {
        this.startTime[i] = _value;
    }

    public SearchColumnStringField[] getState() {
        return this.state;
    }

    public void setState(SearchColumnStringField[] state) {
        this.state = state;
    }

    public SearchColumnStringField getState(int i) {
        return this.state[i];
    }

    public void setState(int i, SearchColumnStringField _value) {
        this.state[i] = _value;
    }

    public SearchColumnDoubleField[] getStorePickupBufferStock() {
        return this.storePickupBufferStock;
    }

    public void setStorePickupBufferStock(SearchColumnDoubleField[] storePickupBufferStock) {
        this.storePickupBufferStock = storePickupBufferStock;
    }

    public SearchColumnDoubleField getStorePickupBufferStock(int i) {
        return this.storePickupBufferStock[i];
    }

    public void setStorePickupBufferStock(int i, SearchColumnDoubleField _value) {
        this.storePickupBufferStock[i] = _value;
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

    public SearchColumnEnumSelectField[] getTimeZone() {
        return this.timeZone;
    }

    public void setTimeZone(SearchColumnEnumSelectField[] timeZone) {
        this.timeZone = timeZone;
    }

    public SearchColumnEnumSelectField getTimeZone(int i) {
        return this.timeZone[i];
    }

    public void setTimeZone(int i, SearchColumnEnumSelectField _value) {
        this.timeZone[i] = _value;
    }

    public SearchColumnLongField[] getTotalShippingCapacity() {
        return this.totalShippingCapacity;
    }

    public void setTotalShippingCapacity(SearchColumnLongField[] totalShippingCapacity) {
        this.totalShippingCapacity = totalShippingCapacity;
    }

    public SearchColumnLongField getTotalShippingCapacity(int i) {
        return this.totalShippingCapacity[i];
    }

    public void setTotalShippingCapacity(int i, SearchColumnLongField _value) {
        this.totalShippingCapacity[i] = _value;
    }

    public SearchColumnStringField[] getTranPrefix() {
        return this.tranPrefix;
    }

    public void setTranPrefix(SearchColumnStringField[] tranPrefix) {
        this.tranPrefix = tranPrefix;
    }

    public SearchColumnStringField getTranPrefix(int i) {
        return this.tranPrefix[i];
    }

    public void setTranPrefix(int i, SearchColumnStringField _value) {
        this.tranPrefix[i] = _value;
    }

    public SearchColumnBooleanField[] getUsesBins() {
        return this.usesBins;
    }

    public void setUsesBins(SearchColumnBooleanField[] usesBins) {
        this.usesBins = usesBins;
    }

    public SearchColumnBooleanField getUsesBins(int i) {
        return this.usesBins[i];
    }

    public void setUsesBins(int i, SearchColumnBooleanField _value) {
        this.usesBins[i] = _value;
    }

    public SearchColumnStringField[] getZip() {
        return this.zip;
    }

    public void setZip(SearchColumnStringField[] zip) {
        this.zip = zip;
    }

    public SearchColumnStringField getZip(int i) {
        return this.zip[i];
    }

    public void setZip(int i, SearchColumnStringField _value) {
        this.zip[i] = _value;
    }

    public SearchColumnCustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof LocationSearchRowBasic)) {
            return false;
        }
        LocationSearchRowBasic other = (LocationSearchRowBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.address1 == null && other.getAddress1() == null || this.address1 != null && Arrays.equals(this.address1, other.getAddress1())) && (this.address2 == null && other.getAddress2() == null || this.address2 != null && Arrays.equals(this.address2, other.getAddress2())) && (this.address3 == null && other.getAddress3() == null || this.address3 != null && Arrays.equals(this.address3, other.getAddress3())) && (this.allowStorePickup == null && other.getAllowStorePickup() == null || this.allowStorePickup != null && Arrays.equals(this.allowStorePickup, other.getAllowStorePickup())) && (this.autoAssignmentRegionSetting == null && other.getAutoAssignmentRegionSetting() == null || this.autoAssignmentRegionSetting != null && Arrays.equals(this.autoAssignmentRegionSetting, other.getAutoAssignmentRegionSetting())) && (this.bufferStock == null && other.getBufferStock() == null || this.bufferStock != null && Arrays.equals(this.bufferStock, other.getBufferStock())) && (this.city == null && other.getCity() == null || this.city != null && Arrays.equals(this.city, other.getCity())) && (this.country == null && other.getCountry() == null || this.country != null && Arrays.equals(this.country, other.getCountry())) && (this.dailyShippingCapacity == null && other.getDailyShippingCapacity() == null || this.dailyShippingCapacity != null && Arrays.equals(this.dailyShippingCapacity, other.getDailyShippingCapacity())) && (this.endTime == null && other.getEndTime() == null || this.endTime != null && Arrays.equals(this.endTime, other.getEndTime())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && Arrays.equals(this.externalId, other.getExternalId())) && (this.geolocationMethod == null && other.getGeolocationMethod() == null || this.geolocationMethod != null && Arrays.equals(this.geolocationMethod, other.getGeolocationMethod())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && Arrays.equals(this.internalId, other.getInternalId())) && (this.isFriday == null && other.getIsFriday() == null || this.isFriday != null && Arrays.equals(this.isFriday, other.getIsFriday())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && Arrays.equals(this.isInactive, other.getIsInactive())) && (this.isIncludeInCt == null && other.getIsIncludeInCt() == null || this.isIncludeInCt != null && Arrays.equals(this.isIncludeInCt, other.getIsIncludeInCt())) && (this.isMonday == null && other.getIsMonday() == null || this.isMonday != null && Arrays.equals(this.isMonday, other.getIsMonday())) && (this.isOffice == null && other.getIsOffice() == null || this.isOffice != null && Arrays.equals(this.isOffice, other.getIsOffice())) && (this.isSaturday == null && other.getIsSaturday() == null || this.isSaturday != null && Arrays.equals(this.isSaturday, other.getIsSaturday())) && (this.isSunday == null && other.getIsSunday() == null || this.isSunday != null && Arrays.equals(this.isSunday, other.getIsSunday())) && (this.isThursday == null && other.getIsThursday() == null || this.isThursday != null && Arrays.equals(this.isThursday, other.getIsThursday())) && (this.isTuesday == null && other.getIsTuesday() == null || this.isTuesday != null && Arrays.equals(this.isTuesday, other.getIsTuesday())) && (this.isWednesday == null && other.getIsWednesday() == null || this.isWednesday != null && Arrays.equals(this.isWednesday, other.getIsWednesday())) && (this.latitude == null && other.getLatitude() == null || this.latitude != null && Arrays.equals(this.latitude, other.getLatitude())) && (this.locationType == null && other.getLocationType() == null || this.locationType != null && Arrays.equals(this.locationType, other.getLocationType())) && (this.longitude == null && other.getLongitude() == null || this.longitude != null && Arrays.equals(this.longitude, other.getLongitude())) && (this.makeInventoryAvailable == null && other.getMakeInventoryAvailable() == null || this.makeInventoryAvailable != null && Arrays.equals(this.makeInventoryAvailable, other.getMakeInventoryAvailable())) && (this.makeInventoryAvailableStore == null && other.getMakeInventoryAvailableStore() == null || this.makeInventoryAvailableStore != null && Arrays.equals(this.makeInventoryAvailableStore, other.getMakeInventoryAvailableStore())) && (this.name == null && other.getName() == null || this.name != null && Arrays.equals(this.name, other.getName())) && (this.nameNoHierarchy == null && other.getNameNoHierarchy() == null || this.nameNoHierarchy != null && Arrays.equals(this.nameNoHierarchy, other.getNameNoHierarchy())) && (this.nextPickupCutOffTime == null && other.getNextPickupCutOffTime() == null || this.nextPickupCutOffTime != null && Arrays.equals(this.nextPickupCutOffTime, other.getNextPickupCutOffTime())) && (this.phone == null && other.getPhone() == null || this.phone != null && Arrays.equals(this.phone, other.getPhone())) && (this.sameDayPickupCutOffTime == null && other.getSameDayPickupCutOffTime() == null || this.sameDayPickupCutOffTime != null && Arrays.equals(this.sameDayPickupCutOffTime, other.getSameDayPickupCutOffTime())) && (this.soPredConfidence == null && other.getSoPredConfidence() == null || this.soPredConfidence != null && Arrays.equals(this.soPredConfidence, other.getSoPredConfidence())) && (this.soPredictedDays == null && other.getSoPredictedDays() == null || this.soPredictedDays != null && Arrays.equals(this.soPredictedDays, other.getSoPredictedDays())) && (this.startTime == null && other.getStartTime() == null || this.startTime != null && Arrays.equals(this.startTime, other.getStartTime())) && (this.state == null && other.getState() == null || this.state != null && Arrays.equals(this.state, other.getState())) && (this.storePickupBufferStock == null && other.getStorePickupBufferStock() == null || this.storePickupBufferStock != null && Arrays.equals(this.storePickupBufferStock, other.getStorePickupBufferStock())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && Arrays.equals(this.subsidiary, other.getSubsidiary())) && (this.timeZone == null && other.getTimeZone() == null || this.timeZone != null && Arrays.equals(this.timeZone, other.getTimeZone())) && (this.totalShippingCapacity == null && other.getTotalShippingCapacity() == null || this.totalShippingCapacity != null && Arrays.equals(this.totalShippingCapacity, other.getTotalShippingCapacity())) && (this.tranPrefix == null && other.getTranPrefix() == null || this.tranPrefix != null && Arrays.equals(this.tranPrefix, other.getTranPrefix())) && (this.usesBins == null && other.getUsesBins() == null || this.usesBins != null && Arrays.equals(this.usesBins, other.getUsesBins())) && (this.zip == null && other.getZip() == null || this.zip != null && Arrays.equals(this.zip, other.getZip())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
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
        if (this.getAddress1() != null) {
            for (i = 0; i < Array.getLength(this.getAddress1()); ++i) {
                obj = Array.get(this.getAddress1(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAddress2() != null) {
            for (i = 0; i < Array.getLength(this.getAddress2()); ++i) {
                obj = Array.get(this.getAddress2(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAddress3() != null) {
            for (i = 0; i < Array.getLength(this.getAddress3()); ++i) {
                obj = Array.get(this.getAddress3(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAllowStorePickup() != null) {
            for (i = 0; i < Array.getLength(this.getAllowStorePickup()); ++i) {
                obj = Array.get(this.getAllowStorePickup(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAutoAssignmentRegionSetting() != null) {
            for (i = 0; i < Array.getLength(this.getAutoAssignmentRegionSetting()); ++i) {
                obj = Array.get(this.getAutoAssignmentRegionSetting(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBufferStock() != null) {
            for (i = 0; i < Array.getLength(this.getBufferStock()); ++i) {
                obj = Array.get(this.getBufferStock(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCity() != null) {
            for (i = 0; i < Array.getLength(this.getCity()); ++i) {
                obj = Array.get(this.getCity(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCountry() != null) {
            for (i = 0; i < Array.getLength(this.getCountry()); ++i) {
                obj = Array.get(this.getCountry(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDailyShippingCapacity() != null) {
            for (i = 0; i < Array.getLength(this.getDailyShippingCapacity()); ++i) {
                obj = Array.get(this.getDailyShippingCapacity(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getEndTime() != null) {
            for (i = 0; i < Array.getLength(this.getEndTime()); ++i) {
                obj = Array.get(this.getEndTime(), i);
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
        if (this.getGeolocationMethod() != null) {
            for (i = 0; i < Array.getLength(this.getGeolocationMethod()); ++i) {
                obj = Array.get(this.getGeolocationMethod(), i);
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
        if (this.getIsFriday() != null) {
            for (i = 0; i < Array.getLength(this.getIsFriday()); ++i) {
                obj = Array.get(this.getIsFriday(), i);
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
        if (this.getIsIncludeInCt() != null) {
            for (i = 0; i < Array.getLength(this.getIsIncludeInCt()); ++i) {
                obj = Array.get(this.getIsIncludeInCt(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsMonday() != null) {
            for (i = 0; i < Array.getLength(this.getIsMonday()); ++i) {
                obj = Array.get(this.getIsMonday(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsOffice() != null) {
            for (i = 0; i < Array.getLength(this.getIsOffice()); ++i) {
                obj = Array.get(this.getIsOffice(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsSaturday() != null) {
            for (i = 0; i < Array.getLength(this.getIsSaturday()); ++i) {
                obj = Array.get(this.getIsSaturday(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsSunday() != null) {
            for (i = 0; i < Array.getLength(this.getIsSunday()); ++i) {
                obj = Array.get(this.getIsSunday(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsThursday() != null) {
            for (i = 0; i < Array.getLength(this.getIsThursday()); ++i) {
                obj = Array.get(this.getIsThursday(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsTuesday() != null) {
            for (i = 0; i < Array.getLength(this.getIsTuesday()); ++i) {
                obj = Array.get(this.getIsTuesday(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsWednesday() != null) {
            for (i = 0; i < Array.getLength(this.getIsWednesday()); ++i) {
                obj = Array.get(this.getIsWednesday(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLatitude() != null) {
            for (i = 0; i < Array.getLength(this.getLatitude()); ++i) {
                obj = Array.get(this.getLatitude(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLocationType() != null) {
            for (i = 0; i < Array.getLength(this.getLocationType()); ++i) {
                obj = Array.get(this.getLocationType(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLongitude() != null) {
            for (i = 0; i < Array.getLength(this.getLongitude()); ++i) {
                obj = Array.get(this.getLongitude(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getMakeInventoryAvailable() != null) {
            for (i = 0; i < Array.getLength(this.getMakeInventoryAvailable()); ++i) {
                obj = Array.get(this.getMakeInventoryAvailable(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getMakeInventoryAvailableStore() != null) {
            for (i = 0; i < Array.getLength(this.getMakeInventoryAvailableStore()); ++i) {
                obj = Array.get(this.getMakeInventoryAvailableStore(), i);
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
        if (this.getNameNoHierarchy() != null) {
            for (i = 0; i < Array.getLength(this.getNameNoHierarchy()); ++i) {
                obj = Array.get(this.getNameNoHierarchy(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getNextPickupCutOffTime() != null) {
            for (i = 0; i < Array.getLength(this.getNextPickupCutOffTime()); ++i) {
                obj = Array.get(this.getNextPickupCutOffTime(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPhone() != null) {
            for (i = 0; i < Array.getLength(this.getPhone()); ++i) {
                obj = Array.get(this.getPhone(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSameDayPickupCutOffTime() != null) {
            for (i = 0; i < Array.getLength(this.getSameDayPickupCutOffTime()); ++i) {
                obj = Array.get(this.getSameDayPickupCutOffTime(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSoPredConfidence() != null) {
            for (i = 0; i < Array.getLength(this.getSoPredConfidence()); ++i) {
                obj = Array.get(this.getSoPredConfidence(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSoPredictedDays() != null) {
            for (i = 0; i < Array.getLength(this.getSoPredictedDays()); ++i) {
                obj = Array.get(this.getSoPredictedDays(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getStartTime() != null) {
            for (i = 0; i < Array.getLength(this.getStartTime()); ++i) {
                obj = Array.get(this.getStartTime(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getState() != null) {
            for (i = 0; i < Array.getLength(this.getState()); ++i) {
                obj = Array.get(this.getState(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getStorePickupBufferStock() != null) {
            for (i = 0; i < Array.getLength(this.getStorePickupBufferStock()); ++i) {
                obj = Array.get(this.getStorePickupBufferStock(), i);
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
        if (this.getTimeZone() != null) {
            for (i = 0; i < Array.getLength(this.getTimeZone()); ++i) {
                obj = Array.get(this.getTimeZone(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTotalShippingCapacity() != null) {
            for (i = 0; i < Array.getLength(this.getTotalShippingCapacity()); ++i) {
                obj = Array.get(this.getTotalShippingCapacity(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTranPrefix() != null) {
            for (i = 0; i < Array.getLength(this.getTranPrefix()); ++i) {
                obj = Array.get(this.getTranPrefix(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getUsesBins() != null) {
            for (i = 0; i < Array.getLength(this.getUsesBins()); ++i) {
                obj = Array.get(this.getUsesBins(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getZip() != null) {
            for (i = 0; i < Array.getLength(this.getZip()); ++i) {
                obj = Array.get(this.getZip(), i);
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "LocationSearchRowBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("address1");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "address1"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("address2");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "address2"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("address3");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "address3"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("allowStorePickup");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "allowStorePickup"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("autoAssignmentRegionSetting");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "autoAssignmentRegionSetting"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("bufferStock");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "bufferStock"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "city"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "country"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("dailyShippingCapacity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "dailyShippingCapacity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("endTime");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "endTime"));
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
        elemField.setFieldName("geolocationMethod");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "geolocationMethod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
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
        elemField.setFieldName("isFriday");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isFriday"));
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
        elemField.setFieldName("isIncludeInCt");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isIncludeInCt"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isMonday");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isMonday"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isOffice");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isOffice"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isSaturday");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isSaturday"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isSunday");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isSunday"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isThursday");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isThursday"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isTuesday");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isTuesday"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isWednesday");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isWednesday"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("latitude");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "latitude"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locationType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("longitude");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "longitude"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("makeInventoryAvailable");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "makeInventoryAvailable"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("makeInventoryAvailableStore");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "makeInventoryAvailableStore"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
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
        elemField.setFieldName("nameNoHierarchy");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "nameNoHierarchy"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("nextPickupCutOffTime");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "nextPickupCutOffTime"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "phone"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("sameDayPickupCutOffTime");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "sameDayPickupCutOffTime"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("soPredConfidence");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "soPredConfidence"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("soPredictedDays");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "soPredictedDays"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("startTime");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "startTime"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "state"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("storePickupBufferStock");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "storePickupBufferStock"));
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
        elemField.setFieldName("timeZone");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "timeZone"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("totalShippingCapacity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "totalShippingCapacity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("tranPrefix");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "tranPrefix"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("usesBins");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "usesBins"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("zip");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "zip"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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

