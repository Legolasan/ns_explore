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

public class ContactSearchBasic
extends SearchRecordBasic
implements Serializable {
    private SearchStringField address;
    private SearchStringField addressee;
    private SearchStringField addressLabel;
    private SearchStringField addressPhone;
    private SearchStringField attention;
    private SearchBooleanField availableOffline;
    private SearchMultiSelectField category;
    private SearchStringField city;
    private SearchStringField comments;
    private SearchMultiSelectField company;
    private SearchMultiSelectField contactRole;
    private SearchMultiSelectField contactSource;
    private SearchEnumMultiSelectField country;
    private SearchStringField county;
    private SearchDateField dateCreated;
    private SearchMultiSelectField defaultTaxReg;
    private SearchStringField defaultTaxRegText;
    private SearchStringField email;
    private SearchStringField employer;
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
    private SearchBooleanField isPrivate;
    private SearchEnumMultiSelectField language;
    private SearchDateField lastModifiedDate;
    private SearchStringField lastName;
    private SearchEnumMultiSelectField level;
    private SearchStringField middleName;
    private SearchMultiSelectField owner;
    private SearchEnumMultiSelectField permission;
    private SearchStringField phone;
    private SearchStringField phoneticName;
    private SearchStringField salutation;
    private SearchStringField state;
    private SearchMultiSelectField subsidiary;
    private SearchStringField title;
    private SearchEnumMultiSelectField type;
    private SearchStringField zipCode;
    private SearchCustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(ContactSearchBasic.class, true);

    public ContactSearchBasic() {
    }

    public ContactSearchBasic(SearchStringField address, SearchStringField addressee, SearchStringField addressLabel, SearchStringField addressPhone, SearchStringField attention, SearchBooleanField availableOffline, SearchMultiSelectField category, SearchStringField city, SearchStringField comments, SearchMultiSelectField company, SearchMultiSelectField contactRole, SearchMultiSelectField contactSource, SearchEnumMultiSelectField country, SearchStringField county, SearchDateField dateCreated, SearchMultiSelectField defaultTaxReg, SearchStringField defaultTaxRegText, SearchStringField email, SearchStringField employer, SearchStringField entityId, SearchMultiSelectField externalId, SearchStringField externalIdString, SearchStringField fax, SearchStringField firstName, SearchBooleanField giveAccess, SearchEnumMultiSelectField globalSubscriptionStatus, SearchMultiSelectField group, SearchBooleanField hasDuplicates, SearchStringField image, SearchMultiSelectField internalId, SearchLongField internalIdNumber, SearchBooleanField isDefaultBilling, SearchBooleanField isDefaultShipping, SearchBooleanField isInactive, SearchBooleanField isPrivate, SearchEnumMultiSelectField language, SearchDateField lastModifiedDate, SearchStringField lastName, SearchEnumMultiSelectField level, SearchStringField middleName, SearchMultiSelectField owner, SearchEnumMultiSelectField permission, SearchStringField phone, SearchStringField phoneticName, SearchStringField salutation, SearchStringField state, SearchMultiSelectField subsidiary, SearchStringField title, SearchEnumMultiSelectField type, SearchStringField zipCode, SearchCustomFieldList customFieldList) {
        this.address = address;
        this.addressee = addressee;
        this.addressLabel = addressLabel;
        this.addressPhone = addressPhone;
        this.attention = attention;
        this.availableOffline = availableOffline;
        this.category = category;
        this.city = city;
        this.comments = comments;
        this.company = company;
        this.contactRole = contactRole;
        this.contactSource = contactSource;
        this.country = country;
        this.county = county;
        this.dateCreated = dateCreated;
        this.defaultTaxReg = defaultTaxReg;
        this.defaultTaxRegText = defaultTaxRegText;
        this.email = email;
        this.employer = employer;
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
        this.isPrivate = isPrivate;
        this.language = language;
        this.lastModifiedDate = lastModifiedDate;
        this.lastName = lastName;
        this.level = level;
        this.middleName = middleName;
        this.owner = owner;
        this.permission = permission;
        this.phone = phone;
        this.phoneticName = phoneticName;
        this.salutation = salutation;
        this.state = state;
        this.subsidiary = subsidiary;
        this.title = title;
        this.type = type;
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

    public SearchStringField getAttention() {
        return this.attention;
    }

    public void setAttention(SearchStringField attention) {
        this.attention = attention;
    }

    public SearchBooleanField getAvailableOffline() {
        return this.availableOffline;
    }

    public void setAvailableOffline(SearchBooleanField availableOffline) {
        this.availableOffline = availableOffline;
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

    public SearchStringField getComments() {
        return this.comments;
    }

    public void setComments(SearchStringField comments) {
        this.comments = comments;
    }

    public SearchMultiSelectField getCompany() {
        return this.company;
    }

    public void setCompany(SearchMultiSelectField company) {
        this.company = company;
    }

    public SearchMultiSelectField getContactRole() {
        return this.contactRole;
    }

    public void setContactRole(SearchMultiSelectField contactRole) {
        this.contactRole = contactRole;
    }

    public SearchMultiSelectField getContactSource() {
        return this.contactSource;
    }

    public void setContactSource(SearchMultiSelectField contactSource) {
        this.contactSource = contactSource;
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

    public SearchStringField getEmail() {
        return this.email;
    }

    public void setEmail(SearchStringField email) {
        this.email = email;
    }

    public SearchStringField getEmployer() {
        return this.employer;
    }

    public void setEmployer(SearchStringField employer) {
        this.employer = employer;
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

    public SearchBooleanField getIsPrivate() {
        return this.isPrivate;
    }

    public void setIsPrivate(SearchBooleanField isPrivate) {
        this.isPrivate = isPrivate;
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

    public SearchStringField getMiddleName() {
        return this.middleName;
    }

    public void setMiddleName(SearchStringField middleName) {
        this.middleName = middleName;
    }

    public SearchMultiSelectField getOwner() {
        return this.owner;
    }

    public void setOwner(SearchMultiSelectField owner) {
        this.owner = owner;
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

    public SearchStringField getSalutation() {
        return this.salutation;
    }

    public void setSalutation(SearchStringField salutation) {
        this.salutation = salutation;
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

    public SearchEnumMultiSelectField getType() {
        return this.type;
    }

    public void setType(SearchEnumMultiSelectField type) {
        this.type = type;
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
        if (!(obj instanceof ContactSearchBasic)) {
            return false;
        }
        ContactSearchBasic other = (ContactSearchBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.address == null && other.getAddress() == null || this.address != null && this.address.equals(other.getAddress())) && (this.addressee == null && other.getAddressee() == null || this.addressee != null && this.addressee.equals(other.getAddressee())) && (this.addressLabel == null && other.getAddressLabel() == null || this.addressLabel != null && this.addressLabel.equals(other.getAddressLabel())) && (this.addressPhone == null && other.getAddressPhone() == null || this.addressPhone != null && this.addressPhone.equals(other.getAddressPhone())) && (this.attention == null && other.getAttention() == null || this.attention != null && this.attention.equals(other.getAttention())) && (this.availableOffline == null && other.getAvailableOffline() == null || this.availableOffline != null && this.availableOffline.equals(other.getAvailableOffline())) && (this.category == null && other.getCategory() == null || this.category != null && this.category.equals(other.getCategory())) && (this.city == null && other.getCity() == null || this.city != null && this.city.equals(other.getCity())) && (this.comments == null && other.getComments() == null || this.comments != null && this.comments.equals(other.getComments())) && (this.company == null && other.getCompany() == null || this.company != null && this.company.equals(other.getCompany())) && (this.contactRole == null && other.getContactRole() == null || this.contactRole != null && this.contactRole.equals(other.getContactRole())) && (this.contactSource == null && other.getContactSource() == null || this.contactSource != null && this.contactSource.equals(other.getContactSource())) && (this.country == null && other.getCountry() == null || this.country != null && this.country.equals(other.getCountry())) && (this.county == null && other.getCounty() == null || this.county != null && this.county.equals(other.getCounty())) && (this.dateCreated == null && other.getDateCreated() == null || this.dateCreated != null && this.dateCreated.equals(other.getDateCreated())) && (this.defaultTaxReg == null && other.getDefaultTaxReg() == null || this.defaultTaxReg != null && this.defaultTaxReg.equals(other.getDefaultTaxReg())) && (this.defaultTaxRegText == null && other.getDefaultTaxRegText() == null || this.defaultTaxRegText != null && this.defaultTaxRegText.equals(other.getDefaultTaxRegText())) && (this.email == null && other.getEmail() == null || this.email != null && this.email.equals(other.getEmail())) && (this.employer == null && other.getEmployer() == null || this.employer != null && this.employer.equals(other.getEmployer())) && (this.entityId == null && other.getEntityId() == null || this.entityId != null && this.entityId.equals(other.getEntityId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId())) && (this.externalIdString == null && other.getExternalIdString() == null || this.externalIdString != null && this.externalIdString.equals(other.getExternalIdString())) && (this.fax == null && other.getFax() == null || this.fax != null && this.fax.equals(other.getFax())) && (this.firstName == null && other.getFirstName() == null || this.firstName != null && this.firstName.equals(other.getFirstName())) && (this.giveAccess == null && other.getGiveAccess() == null || this.giveAccess != null && this.giveAccess.equals(other.getGiveAccess())) && (this.globalSubscriptionStatus == null && other.getGlobalSubscriptionStatus() == null || this.globalSubscriptionStatus != null && this.globalSubscriptionStatus.equals(other.getGlobalSubscriptionStatus())) && (this.group == null && other.getGroup() == null || this.group != null && this.group.equals(other.getGroup())) && (this.hasDuplicates == null && other.getHasDuplicates() == null || this.hasDuplicates != null && this.hasDuplicates.equals(other.getHasDuplicates())) && (this.image == null && other.getImage() == null || this.image != null && this.image.equals(other.getImage())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.internalIdNumber == null && other.getInternalIdNumber() == null || this.internalIdNumber != null && this.internalIdNumber.equals(other.getInternalIdNumber())) && (this.isDefaultBilling == null && other.getIsDefaultBilling() == null || this.isDefaultBilling != null && this.isDefaultBilling.equals(other.getIsDefaultBilling())) && (this.isDefaultShipping == null && other.getIsDefaultShipping() == null || this.isDefaultShipping != null && this.isDefaultShipping.equals(other.getIsDefaultShipping())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && this.isInactive.equals(other.getIsInactive())) && (this.isPrivate == null && other.getIsPrivate() == null || this.isPrivate != null && this.isPrivate.equals(other.getIsPrivate())) && (this.language == null && other.getLanguage() == null || this.language != null && this.language.equals(other.getLanguage())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && this.lastModifiedDate.equals(other.getLastModifiedDate())) && (this.lastName == null && other.getLastName() == null || this.lastName != null && this.lastName.equals(other.getLastName())) && (this.level == null && other.getLevel() == null || this.level != null && this.level.equals(other.getLevel())) && (this.middleName == null && other.getMiddleName() == null || this.middleName != null && this.middleName.equals(other.getMiddleName())) && (this.owner == null && other.getOwner() == null || this.owner != null && this.owner.equals(other.getOwner())) && (this.permission == null && other.getPermission() == null || this.permission != null && this.permission.equals(other.getPermission())) && (this.phone == null && other.getPhone() == null || this.phone != null && this.phone.equals(other.getPhone())) && (this.phoneticName == null && other.getPhoneticName() == null || this.phoneticName != null && this.phoneticName.equals(other.getPhoneticName())) && (this.salutation == null && other.getSalutation() == null || this.salutation != null && this.salutation.equals(other.getSalutation())) && (this.state == null && other.getState() == null || this.state != null && this.state.equals(other.getState())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && this.subsidiary.equals(other.getSubsidiary())) && (this.title == null && other.getTitle() == null || this.title != null && this.title.equals(other.getTitle())) && (this.type == null && other.getType() == null || this.type != null && this.type.equals(other.getType())) && (this.zipCode == null && other.getZipCode() == null || this.zipCode != null && this.zipCode.equals(other.getZipCode())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
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
        if (this.getAttention() != null) {
            _hashCode += this.getAttention().hashCode();
        }
        if (this.getAvailableOffline() != null) {
            _hashCode += this.getAvailableOffline().hashCode();
        }
        if (this.getCategory() != null) {
            _hashCode += this.getCategory().hashCode();
        }
        if (this.getCity() != null) {
            _hashCode += this.getCity().hashCode();
        }
        if (this.getComments() != null) {
            _hashCode += this.getComments().hashCode();
        }
        if (this.getCompany() != null) {
            _hashCode += this.getCompany().hashCode();
        }
        if (this.getContactRole() != null) {
            _hashCode += this.getContactRole().hashCode();
        }
        if (this.getContactSource() != null) {
            _hashCode += this.getContactSource().hashCode();
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
        if (this.getEmail() != null) {
            _hashCode += this.getEmail().hashCode();
        }
        if (this.getEmployer() != null) {
            _hashCode += this.getEmployer().hashCode();
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
        if (this.getIsPrivate() != null) {
            _hashCode += this.getIsPrivate().hashCode();
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
        if (this.getMiddleName() != null) {
            _hashCode += this.getMiddleName().hashCode();
        }
        if (this.getOwner() != null) {
            _hashCode += this.getOwner().hashCode();
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
        if (this.getSalutation() != null) {
            _hashCode += this.getSalutation().hashCode();
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
        if (this.getType() != null) {
            _hashCode += this.getType().hashCode();
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ContactSearchBasic"));
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
        elemField.setFieldName("attention");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "attention"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("availableOffline");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "availableOffline"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("comments");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "comments"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("company");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "company"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("contactRole");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "contactRole"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("contactSource");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "contactSource"));
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
        elemField.setFieldName("email");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "email"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("employer");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "employer"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
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
        elemField.setFieldName("isPrivate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isPrivate"));
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
        elemField.setFieldName("middleName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "middleName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "owner"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("salutation");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "salutation"));
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
        elemField.setFieldName("type");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "type"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
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

