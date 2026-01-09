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

public class PartnerSearchBasic
extends SearchRecordBasic
implements Serializable {
    private SearchStringField address;
    private SearchStringField addressee;
    private SearchStringField addressLabel;
    private SearchStringField addressPhone;
    private SearchBooleanField assignTasks;
    private SearchStringField attention;
    private SearchStringField billAddress;
    private SearchMultiSelectField category;
    private SearchStringField city;
    private SearchMultiSelectField _class;
    private SearchStringField comments;
    private SearchMultiSelectField commissionPlan;
    private SearchEnumMultiSelectField country;
    private SearchStringField county;
    private SearchDateField dateCreated;
    private SearchMultiSelectField defaultTaxReg;
    private SearchStringField defaultTaxRegText;
    private SearchMultiSelectField department;
    private SearchBooleanField eligibleForCommission;
    private SearchStringField email;
    private SearchEnumMultiSelectField emailPreference;
    private SearchStringField entityId;
    private SearchMultiSelectField externalId;
    private SearchStringField externalIdString;
    private SearchStringField fax;
    private SearchStringField firstName;
    private SearchBooleanField giveAccess;
    private SearchEnumMultiSelectField globalSubscriptionStatus;
    private SearchMultiSelectField group;
    private SearchBooleanField hasDuplicates;
    private SearchStringField image;
    private SearchMultiSelectField internalId;
    private SearchLongField internalIdNumber;
    private SearchBooleanField isDefaultBilling;
    private SearchBooleanField isDefaultShipping;
    private SearchBooleanField isInactive;
    private SearchBooleanField isPerson;
    private SearchEnumMultiSelectField language;
    private SearchDateField lastModifiedDate;
    private SearchStringField lastName;
    private SearchEnumMultiSelectField level;
    private SearchMultiSelectField location;
    private SearchStringField middleName;
    private SearchEnumMultiSelectField otherRelationships;
    private SearchMultiSelectField parent;
    private SearchStringField partnerCode;
    private SearchEnumMultiSelectField permission;
    private SearchStringField phone;
    private SearchStringField phoneticName;
    private SearchMultiSelectField promoCode;
    private SearchStringField salutation;
    private SearchStringField shipAddress;
    private SearchStringField state;
    private SearchMultiSelectField subsidiary;
    private SearchStringField title;
    private SearchStringField URL;
    private SearchStringField zipCode;
    private SearchCustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(PartnerSearchBasic.class, true);

    public PartnerSearchBasic() {
    }

    public PartnerSearchBasic(SearchStringField address, SearchStringField addressee, SearchStringField addressLabel, SearchStringField addressPhone, SearchBooleanField assignTasks, SearchStringField attention, SearchStringField billAddress, SearchMultiSelectField category, SearchStringField city, SearchMultiSelectField _class, SearchStringField comments, SearchMultiSelectField commissionPlan, SearchEnumMultiSelectField country, SearchStringField county, SearchDateField dateCreated, SearchMultiSelectField defaultTaxReg, SearchStringField defaultTaxRegText, SearchMultiSelectField department, SearchBooleanField eligibleForCommission, SearchStringField email, SearchEnumMultiSelectField emailPreference, SearchStringField entityId, SearchMultiSelectField externalId, SearchStringField externalIdString, SearchStringField fax, SearchStringField firstName, SearchBooleanField giveAccess, SearchEnumMultiSelectField globalSubscriptionStatus, SearchMultiSelectField group, SearchBooleanField hasDuplicates, SearchStringField image, SearchMultiSelectField internalId, SearchLongField internalIdNumber, SearchBooleanField isDefaultBilling, SearchBooleanField isDefaultShipping, SearchBooleanField isInactive, SearchBooleanField isPerson, SearchEnumMultiSelectField language, SearchDateField lastModifiedDate, SearchStringField lastName, SearchEnumMultiSelectField level, SearchMultiSelectField location, SearchStringField middleName, SearchEnumMultiSelectField otherRelationships, SearchMultiSelectField parent, SearchStringField partnerCode, SearchEnumMultiSelectField permission, SearchStringField phone, SearchStringField phoneticName, SearchMultiSelectField promoCode, SearchStringField salutation, SearchStringField shipAddress, SearchStringField state, SearchMultiSelectField subsidiary, SearchStringField title, SearchStringField URL2, SearchStringField zipCode, SearchCustomFieldList customFieldList) {
        this.address = address;
        this.addressee = addressee;
        this.addressLabel = addressLabel;
        this.addressPhone = addressPhone;
        this.assignTasks = assignTasks;
        this.attention = attention;
        this.billAddress = billAddress;
        this.category = category;
        this.city = city;
        this._class = _class;
        this.comments = comments;
        this.commissionPlan = commissionPlan;
        this.country = country;
        this.county = county;
        this.dateCreated = dateCreated;
        this.defaultTaxReg = defaultTaxReg;
        this.defaultTaxRegText = defaultTaxRegText;
        this.department = department;
        this.eligibleForCommission = eligibleForCommission;
        this.email = email;
        this.emailPreference = emailPreference;
        this.entityId = entityId;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.fax = fax;
        this.firstName = firstName;
        this.giveAccess = giveAccess;
        this.globalSubscriptionStatus = globalSubscriptionStatus;
        this.group = group;
        this.hasDuplicates = hasDuplicates;
        this.image = image;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isDefaultBilling = isDefaultBilling;
        this.isDefaultShipping = isDefaultShipping;
        this.isInactive = isInactive;
        this.isPerson = isPerson;
        this.language = language;
        this.lastModifiedDate = lastModifiedDate;
        this.lastName = lastName;
        this.level = level;
        this.location = location;
        this.middleName = middleName;
        this.otherRelationships = otherRelationships;
        this.parent = parent;
        this.partnerCode = partnerCode;
        this.permission = permission;
        this.phone = phone;
        this.phoneticName = phoneticName;
        this.promoCode = promoCode;
        this.salutation = salutation;
        this.shipAddress = shipAddress;
        this.state = state;
        this.subsidiary = subsidiary;
        this.title = title;
        this.URL = URL2;
        this.zipCode = zipCode;
        this.customFieldList = customFieldList;
    }

    public SearchStringField getAddress() {
        return this.address;
    }

    public void setAddress(SearchStringField address) {
        this.address = address;
    }

    public SearchStringField getAddressee() {
        return this.addressee;
    }

    public void setAddressee(SearchStringField addressee) {
        this.addressee = addressee;
    }

    public SearchStringField getAddressLabel() {
        return this.addressLabel;
    }

    public void setAddressLabel(SearchStringField addressLabel) {
        this.addressLabel = addressLabel;
    }

    public SearchStringField getAddressPhone() {
        return this.addressPhone;
    }

    public void setAddressPhone(SearchStringField addressPhone) {
        this.addressPhone = addressPhone;
    }

    public SearchBooleanField getAssignTasks() {
        return this.assignTasks;
    }

    public void setAssignTasks(SearchBooleanField assignTasks) {
        this.assignTasks = assignTasks;
    }

    public SearchStringField getAttention() {
        return this.attention;
    }

    public void setAttention(SearchStringField attention) {
        this.attention = attention;
    }

    public SearchStringField getBillAddress() {
        return this.billAddress;
    }

    public void setBillAddress(SearchStringField billAddress) {
        this.billAddress = billAddress;
    }

    public SearchMultiSelectField getCategory() {
        return this.category;
    }

    public void setCategory(SearchMultiSelectField category) {
        this.category = category;
    }

    public SearchStringField getCity() {
        return this.city;
    }

    public void setCity(SearchStringField city) {
        this.city = city;
    }

    public SearchMultiSelectField get_class() {
        return this._class;
    }

    public void set_class(SearchMultiSelectField _class) {
        this._class = _class;
    }

    public SearchStringField getComments() {
        return this.comments;
    }

    public void setComments(SearchStringField comments) {
        this.comments = comments;
    }

    public SearchMultiSelectField getCommissionPlan() {
        return this.commissionPlan;
    }

    public void setCommissionPlan(SearchMultiSelectField commissionPlan) {
        this.commissionPlan = commissionPlan;
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

    public SearchDateField getDateCreated() {
        return this.dateCreated;
    }

    public void setDateCreated(SearchDateField dateCreated) {
        this.dateCreated = dateCreated;
    }

    public SearchMultiSelectField getDefaultTaxReg() {
        return this.defaultTaxReg;
    }

    public void setDefaultTaxReg(SearchMultiSelectField defaultTaxReg) {
        this.defaultTaxReg = defaultTaxReg;
    }

    public SearchStringField getDefaultTaxRegText() {
        return this.defaultTaxRegText;
    }

    public void setDefaultTaxRegText(SearchStringField defaultTaxRegText) {
        this.defaultTaxRegText = defaultTaxRegText;
    }

    public SearchMultiSelectField getDepartment() {
        return this.department;
    }

    public void setDepartment(SearchMultiSelectField department) {
        this.department = department;
    }

    public SearchBooleanField getEligibleForCommission() {
        return this.eligibleForCommission;
    }

    public void setEligibleForCommission(SearchBooleanField eligibleForCommission) {
        this.eligibleForCommission = eligibleForCommission;
    }

    public SearchStringField getEmail() {
        return this.email;
    }

    public void setEmail(SearchStringField email) {
        this.email = email;
    }

    public SearchEnumMultiSelectField getEmailPreference() {
        return this.emailPreference;
    }

    public void setEmailPreference(SearchEnumMultiSelectField emailPreference) {
        this.emailPreference = emailPreference;
    }

    public SearchStringField getEntityId() {
        return this.entityId;
    }

    public void setEntityId(SearchStringField entityId) {
        this.entityId = entityId;
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

    public SearchStringField getFax() {
        return this.fax;
    }

    public void setFax(SearchStringField fax) {
        this.fax = fax;
    }

    public SearchStringField getFirstName() {
        return this.firstName;
    }

    public void setFirstName(SearchStringField firstName) {
        this.firstName = firstName;
    }

    public SearchBooleanField getGiveAccess() {
        return this.giveAccess;
    }

    public void setGiveAccess(SearchBooleanField giveAccess) {
        this.giveAccess = giveAccess;
    }

    public SearchEnumMultiSelectField getGlobalSubscriptionStatus() {
        return this.globalSubscriptionStatus;
    }

    public void setGlobalSubscriptionStatus(SearchEnumMultiSelectField globalSubscriptionStatus) {
        this.globalSubscriptionStatus = globalSubscriptionStatus;
    }

    public SearchMultiSelectField getGroup() {
        return this.group;
    }

    public void setGroup(SearchMultiSelectField group) {
        this.group = group;
    }

    public SearchBooleanField getHasDuplicates() {
        return this.hasDuplicates;
    }

    public void setHasDuplicates(SearchBooleanField hasDuplicates) {
        this.hasDuplicates = hasDuplicates;
    }

    public SearchStringField getImage() {
        return this.image;
    }

    public void setImage(SearchStringField image) {
        this.image = image;
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

    public SearchBooleanField getIsDefaultBilling() {
        return this.isDefaultBilling;
    }

    public void setIsDefaultBilling(SearchBooleanField isDefaultBilling) {
        this.isDefaultBilling = isDefaultBilling;
    }

    public SearchBooleanField getIsDefaultShipping() {
        return this.isDefaultShipping;
    }

    public void setIsDefaultShipping(SearchBooleanField isDefaultShipping) {
        this.isDefaultShipping = isDefaultShipping;
    }

    public SearchBooleanField getIsInactive() {
        return this.isInactive;
    }

    public void setIsInactive(SearchBooleanField isInactive) {
        this.isInactive = isInactive;
    }

    public SearchBooleanField getIsPerson() {
        return this.isPerson;
    }

    public void setIsPerson(SearchBooleanField isPerson) {
        this.isPerson = isPerson;
    }

    public SearchEnumMultiSelectField getLanguage() {
        return this.language;
    }

    public void setLanguage(SearchEnumMultiSelectField language) {
        this.language = language;
    }

    public SearchDateField getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    public void setLastModifiedDate(SearchDateField lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public SearchStringField getLastName() {
        return this.lastName;
    }

    public void setLastName(SearchStringField lastName) {
        this.lastName = lastName;
    }

    public SearchEnumMultiSelectField getLevel() {
        return this.level;
    }

    public void setLevel(SearchEnumMultiSelectField level) {
        this.level = level;
    }

    public SearchMultiSelectField getLocation() {
        return this.location;
    }

    public void setLocation(SearchMultiSelectField location) {
        this.location = location;
    }

    public SearchStringField getMiddleName() {
        return this.middleName;
    }

    public void setMiddleName(SearchStringField middleName) {
        this.middleName = middleName;
    }

    public SearchEnumMultiSelectField getOtherRelationships() {
        return this.otherRelationships;
    }

    public void setOtherRelationships(SearchEnumMultiSelectField otherRelationships) {
        this.otherRelationships = otherRelationships;
    }

    public SearchMultiSelectField getParent() {
        return this.parent;
    }

    public void setParent(SearchMultiSelectField parent) {
        this.parent = parent;
    }

    public SearchStringField getPartnerCode() {
        return this.partnerCode;
    }

    public void setPartnerCode(SearchStringField partnerCode) {
        this.partnerCode = partnerCode;
    }

    public SearchEnumMultiSelectField getPermission() {
        return this.permission;
    }

    public void setPermission(SearchEnumMultiSelectField permission) {
        this.permission = permission;
    }

    public SearchStringField getPhone() {
        return this.phone;
    }

    public void setPhone(SearchStringField phone) {
        this.phone = phone;
    }

    public SearchStringField getPhoneticName() {
        return this.phoneticName;
    }

    public void setPhoneticName(SearchStringField phoneticName) {
        this.phoneticName = phoneticName;
    }

    public SearchMultiSelectField getPromoCode() {
        return this.promoCode;
    }

    public void setPromoCode(SearchMultiSelectField promoCode) {
        this.promoCode = promoCode;
    }

    public SearchStringField getSalutation() {
        return this.salutation;
    }

    public void setSalutation(SearchStringField salutation) {
        this.salutation = salutation;
    }

    public SearchStringField getShipAddress() {
        return this.shipAddress;
    }

    public void setShipAddress(SearchStringField shipAddress) {
        this.shipAddress = shipAddress;
    }

    public SearchStringField getState() {
        return this.state;
    }

    public void setState(SearchStringField state) {
        this.state = state;
    }

    public SearchMultiSelectField getSubsidiary() {
        return this.subsidiary;
    }

    public void setSubsidiary(SearchMultiSelectField subsidiary) {
        this.subsidiary = subsidiary;
    }

    public SearchStringField getTitle() {
        return this.title;
    }

    public void setTitle(SearchStringField title) {
        this.title = title;
    }

    public SearchStringField getURL() {
        return this.URL;
    }

    public void setURL(SearchStringField URL2) {
        this.URL = URL2;
    }

    public SearchStringField getZipCode() {
        return this.zipCode;
    }

    public void setZipCode(SearchStringField zipCode) {
        this.zipCode = zipCode;
    }

    public SearchCustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PartnerSearchBasic)) {
            return false;
        }
        PartnerSearchBasic other = (PartnerSearchBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.address == null && other.getAddress() == null || this.address != null && this.address.equals(other.getAddress())) && (this.addressee == null && other.getAddressee() == null || this.addressee != null && this.addressee.equals(other.getAddressee())) && (this.addressLabel == null && other.getAddressLabel() == null || this.addressLabel != null && this.addressLabel.equals(other.getAddressLabel())) && (this.addressPhone == null && other.getAddressPhone() == null || this.addressPhone != null && this.addressPhone.equals(other.getAddressPhone())) && (this.assignTasks == null && other.getAssignTasks() == null || this.assignTasks != null && this.assignTasks.equals(other.getAssignTasks())) && (this.attention == null && other.getAttention() == null || this.attention != null && this.attention.equals(other.getAttention())) && (this.billAddress == null && other.getBillAddress() == null || this.billAddress != null && this.billAddress.equals(other.getBillAddress())) && (this.category == null && other.getCategory() == null || this.category != null && this.category.equals(other.getCategory())) && (this.city == null && other.getCity() == null || this.city != null && this.city.equals(other.getCity())) && (this._class == null && other.get_class() == null || this._class != null && this._class.equals(other.get_class())) && (this.comments == null && other.getComments() == null || this.comments != null && this.comments.equals(other.getComments())) && (this.commissionPlan == null && other.getCommissionPlan() == null || this.commissionPlan != null && this.commissionPlan.equals(other.getCommissionPlan())) && (this.country == null && other.getCountry() == null || this.country != null && this.country.equals(other.getCountry())) && (this.county == null && other.getCounty() == null || this.county != null && this.county.equals(other.getCounty())) && (this.dateCreated == null && other.getDateCreated() == null || this.dateCreated != null && this.dateCreated.equals(other.getDateCreated())) && (this.defaultTaxReg == null && other.getDefaultTaxReg() == null || this.defaultTaxReg != null && this.defaultTaxReg.equals(other.getDefaultTaxReg())) && (this.defaultTaxRegText == null && other.getDefaultTaxRegText() == null || this.defaultTaxRegText != null && this.defaultTaxRegText.equals(other.getDefaultTaxRegText())) && (this.department == null && other.getDepartment() == null || this.department != null && this.department.equals(other.getDepartment())) && (this.eligibleForCommission == null && other.getEligibleForCommission() == null || this.eligibleForCommission != null && this.eligibleForCommission.equals(other.getEligibleForCommission())) && (this.email == null && other.getEmail() == null || this.email != null && this.email.equals(other.getEmail())) && (this.emailPreference == null && other.getEmailPreference() == null || this.emailPreference != null && this.emailPreference.equals(other.getEmailPreference())) && (this.entityId == null && other.getEntityId() == null || this.entityId != null && this.entityId.equals(other.getEntityId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId())) && (this.externalIdString == null && other.getExternalIdString() == null || this.externalIdString != null && this.externalIdString.equals(other.getExternalIdString())) && (this.fax == null && other.getFax() == null || this.fax != null && this.fax.equals(other.getFax())) && (this.firstName == null && other.getFirstName() == null || this.firstName != null && this.firstName.equals(other.getFirstName())) && (this.giveAccess == null && other.getGiveAccess() == null || this.giveAccess != null && this.giveAccess.equals(other.getGiveAccess())) && (this.globalSubscriptionStatus == null && other.getGlobalSubscriptionStatus() == null || this.globalSubscriptionStatus != null && this.globalSubscriptionStatus.equals(other.getGlobalSubscriptionStatus())) && (this.group == null && other.getGroup() == null || this.group != null && this.group.equals(other.getGroup())) && (this.hasDuplicates == null && other.getHasDuplicates() == null || this.hasDuplicates != null && this.hasDuplicates.equals(other.getHasDuplicates())) && (this.image == null && other.getImage() == null || this.image != null && this.image.equals(other.getImage())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.internalIdNumber == null && other.getInternalIdNumber() == null || this.internalIdNumber != null && this.internalIdNumber.equals(other.getInternalIdNumber())) && (this.isDefaultBilling == null && other.getIsDefaultBilling() == null || this.isDefaultBilling != null && this.isDefaultBilling.equals(other.getIsDefaultBilling())) && (this.isDefaultShipping == null && other.getIsDefaultShipping() == null || this.isDefaultShipping != null && this.isDefaultShipping.equals(other.getIsDefaultShipping())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && this.isInactive.equals(other.getIsInactive())) && (this.isPerson == null && other.getIsPerson() == null || this.isPerson != null && this.isPerson.equals(other.getIsPerson())) && (this.language == null && other.getLanguage() == null || this.language != null && this.language.equals(other.getLanguage())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && this.lastModifiedDate.equals(other.getLastModifiedDate())) && (this.lastName == null && other.getLastName() == null || this.lastName != null && this.lastName.equals(other.getLastName())) && (this.level == null && other.getLevel() == null || this.level != null && this.level.equals(other.getLevel())) && (this.location == null && other.getLocation() == null || this.location != null && this.location.equals(other.getLocation())) && (this.middleName == null && other.getMiddleName() == null || this.middleName != null && this.middleName.equals(other.getMiddleName())) && (this.otherRelationships == null && other.getOtherRelationships() == null || this.otherRelationships != null && this.otherRelationships.equals(other.getOtherRelationships())) && (this.parent == null && other.getParent() == null || this.parent != null && this.parent.equals(other.getParent())) && (this.partnerCode == null && other.getPartnerCode() == null || this.partnerCode != null && this.partnerCode.equals(other.getPartnerCode())) && (this.permission == null && other.getPermission() == null || this.permission != null && this.permission.equals(other.getPermission())) && (this.phone == null && other.getPhone() == null || this.phone != null && this.phone.equals(other.getPhone())) && (this.phoneticName == null && other.getPhoneticName() == null || this.phoneticName != null && this.phoneticName.equals(other.getPhoneticName())) && (this.promoCode == null && other.getPromoCode() == null || this.promoCode != null && this.promoCode.equals(other.getPromoCode())) && (this.salutation == null && other.getSalutation() == null || this.salutation != null && this.salutation.equals(other.getSalutation())) && (this.shipAddress == null && other.getShipAddress() == null || this.shipAddress != null && this.shipAddress.equals(other.getShipAddress())) && (this.state == null && other.getState() == null || this.state != null && this.state.equals(other.getState())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && this.subsidiary.equals(other.getSubsidiary())) && (this.title == null && other.getTitle() == null || this.title != null && this.title.equals(other.getTitle())) && (this.URL == null && other.getURL() == null || this.URL != null && this.URL.equals(other.getURL())) && (this.zipCode == null && other.getZipCode() == null || this.zipCode != null && this.zipCode.equals(other.getZipCode())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
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
        if (this.getAddressee() != null) {
            _hashCode += this.getAddressee().hashCode();
        }
        if (this.getAddressLabel() != null) {
            _hashCode += this.getAddressLabel().hashCode();
        }
        if (this.getAddressPhone() != null) {
            _hashCode += this.getAddressPhone().hashCode();
        }
        if (this.getAssignTasks() != null) {
            _hashCode += this.getAssignTasks().hashCode();
        }
        if (this.getAttention() != null) {
            _hashCode += this.getAttention().hashCode();
        }
        if (this.getBillAddress() != null) {
            _hashCode += this.getBillAddress().hashCode();
        }
        if (this.getCategory() != null) {
            _hashCode += this.getCategory().hashCode();
        }
        if (this.getCity() != null) {
            _hashCode += this.getCity().hashCode();
        }
        if (this.get_class() != null) {
            _hashCode += this.get_class().hashCode();
        }
        if (this.getComments() != null) {
            _hashCode += this.getComments().hashCode();
        }
        if (this.getCommissionPlan() != null) {
            _hashCode += this.getCommissionPlan().hashCode();
        }
        if (this.getCountry() != null) {
            _hashCode += this.getCountry().hashCode();
        }
        if (this.getCounty() != null) {
            _hashCode += this.getCounty().hashCode();
        }
        if (this.getDateCreated() != null) {
            _hashCode += this.getDateCreated().hashCode();
        }
        if (this.getDefaultTaxReg() != null) {
            _hashCode += this.getDefaultTaxReg().hashCode();
        }
        if (this.getDefaultTaxRegText() != null) {
            _hashCode += this.getDefaultTaxRegText().hashCode();
        }
        if (this.getDepartment() != null) {
            _hashCode += this.getDepartment().hashCode();
        }
        if (this.getEligibleForCommission() != null) {
            _hashCode += this.getEligibleForCommission().hashCode();
        }
        if (this.getEmail() != null) {
            _hashCode += this.getEmail().hashCode();
        }
        if (this.getEmailPreference() != null) {
            _hashCode += this.getEmailPreference().hashCode();
        }
        if (this.getEntityId() != null) {
            _hashCode += this.getEntityId().hashCode();
        }
        if (this.getExternalId() != null) {
            _hashCode += this.getExternalId().hashCode();
        }
        if (this.getExternalIdString() != null) {
            _hashCode += this.getExternalIdString().hashCode();
        }
        if (this.getFax() != null) {
            _hashCode += this.getFax().hashCode();
        }
        if (this.getFirstName() != null) {
            _hashCode += this.getFirstName().hashCode();
        }
        if (this.getGiveAccess() != null) {
            _hashCode += this.getGiveAccess().hashCode();
        }
        if (this.getGlobalSubscriptionStatus() != null) {
            _hashCode += this.getGlobalSubscriptionStatus().hashCode();
        }
        if (this.getGroup() != null) {
            _hashCode += this.getGroup().hashCode();
        }
        if (this.getHasDuplicates() != null) {
            _hashCode += this.getHasDuplicates().hashCode();
        }
        if (this.getImage() != null) {
            _hashCode += this.getImage().hashCode();
        }
        if (this.getInternalId() != null) {
            _hashCode += this.getInternalId().hashCode();
        }
        if (this.getInternalIdNumber() != null) {
            _hashCode += this.getInternalIdNumber().hashCode();
        }
        if (this.getIsDefaultBilling() != null) {
            _hashCode += this.getIsDefaultBilling().hashCode();
        }
        if (this.getIsDefaultShipping() != null) {
            _hashCode += this.getIsDefaultShipping().hashCode();
        }
        if (this.getIsInactive() != null) {
            _hashCode += this.getIsInactive().hashCode();
        }
        if (this.getIsPerson() != null) {
            _hashCode += this.getIsPerson().hashCode();
        }
        if (this.getLanguage() != null) {
            _hashCode += this.getLanguage().hashCode();
        }
        if (this.getLastModifiedDate() != null) {
            _hashCode += this.getLastModifiedDate().hashCode();
        }
        if (this.getLastName() != null) {
            _hashCode += this.getLastName().hashCode();
        }
        if (this.getLevel() != null) {
            _hashCode += this.getLevel().hashCode();
        }
        if (this.getLocation() != null) {
            _hashCode += this.getLocation().hashCode();
        }
        if (this.getMiddleName() != null) {
            _hashCode += this.getMiddleName().hashCode();
        }
        if (this.getOtherRelationships() != null) {
            _hashCode += this.getOtherRelationships().hashCode();
        }
        if (this.getParent() != null) {
            _hashCode += this.getParent().hashCode();
        }
        if (this.getPartnerCode() != null) {
            _hashCode += this.getPartnerCode().hashCode();
        }
        if (this.getPermission() != null) {
            _hashCode += this.getPermission().hashCode();
        }
        if (this.getPhone() != null) {
            _hashCode += this.getPhone().hashCode();
        }
        if (this.getPhoneticName() != null) {
            _hashCode += this.getPhoneticName().hashCode();
        }
        if (this.getPromoCode() != null) {
            _hashCode += this.getPromoCode().hashCode();
        }
        if (this.getSalutation() != null) {
            _hashCode += this.getSalutation().hashCode();
        }
        if (this.getShipAddress() != null) {
            _hashCode += this.getShipAddress().hashCode();
        }
        if (this.getState() != null) {
            _hashCode += this.getState().hashCode();
        }
        if (this.getSubsidiary() != null) {
            _hashCode += this.getSubsidiary().hashCode();
        }
        if (this.getTitle() != null) {
            _hashCode += this.getTitle().hashCode();
        }
        if (this.getURL() != null) {
            _hashCode += this.getURL().hashCode();
        }
        if (this.getZipCode() != null) {
            _hashCode += this.getZipCode().hashCode();
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "PartnerSearchBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "address"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("addressee");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "addressee"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("addressLabel");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "addressLabel"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("addressPhone");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "addressPhone"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("assignTasks");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "assignTasks"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("attention");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "attention"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billAddress");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billAddress"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "category"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("_class");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "class"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "comments"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("commissionPlan");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "commissionPlan"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("dateCreated");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "dateCreated"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("defaultTaxReg");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "defaultTaxReg"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("defaultTaxRegText");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "defaultTaxRegText"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "department"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("eligibleForCommission");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "eligibleForCommission"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "email"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("emailPreference");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "emailPreference"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("entityId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "entityId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
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
        elemField.setFieldName("fax");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fax"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "firstName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("giveAccess");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "giveAccess"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("globalSubscriptionStatus");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "globalSubscriptionStatus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("group");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "group"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("hasDuplicates");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "hasDuplicates"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("image");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "image"));
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
        elemField.setFieldName("isDefaultBilling");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isDefaultBilling"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isDefaultShipping");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isDefaultShipping"));
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
        elemField.setFieldName("isPerson");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isPerson"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "language"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
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
        elemField.setFieldName("lastName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lastName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("level");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "level"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
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
        elemField.setFieldName("middleName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "middleName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("otherRelationships");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "otherRelationships"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "parent"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("partnerCode");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "partnerCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("permission");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "permission"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
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
        elemField.setFieldName("phoneticName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "phoneticName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("promoCode");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "promoCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("salutation");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "salutation"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipAddress");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipAddress"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
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
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "title"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("URL");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "URL"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("zipCode");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "zipCode"));
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

