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

public class PartnerSearchRowBasic
extends SearchRowBasic
implements Serializable {
    private SearchColumnStringField[] address;
    private SearchColumnStringField[] address1;
    private SearchColumnStringField[] address2;
    private SearchColumnStringField[] address3;
    private SearchColumnStringField[] addressee;
    private SearchColumnStringField[] addressInternalId;
    private SearchColumnStringField[] addressLabel;
    private SearchColumnStringField[] addressPhone;
    private SearchColumnStringField[] altEmail;
    private SearchColumnStringField[] altName;
    private SearchColumnStringField[] altPhone;
    private SearchColumnBooleanField[] assignTasks;
    private SearchColumnStringField[] attention;
    private SearchColumnStringField[] billAddress;
    private SearchColumnStringField[] billAddress1;
    private SearchColumnStringField[] billAddress2;
    private SearchColumnStringField[] billAddress3;
    private SearchColumnStringField[] billAddressee;
    private SearchColumnStringField[] billAttention;
    private SearchColumnStringField[] billCity;
    private SearchColumnEnumSelectField[] billCountry;
    private SearchColumnStringField[] billCountryCode;
    private SearchColumnStringField[] billPhone;
    private SearchColumnStringField[] billState;
    private SearchColumnStringField[] billZipCode;
    private SearchColumnStringField[] category;
    private SearchColumnStringField[] city;
    private SearchColumnSelectField[] _class;
    private SearchColumnStringField[] comments;
    private SearchColumnStringField[] companyName;
    private SearchColumnEnumSelectField[] country;
    private SearchColumnStringField[] countryCode;
    private SearchColumnDateField[] dateCreated;
    private SearchColumnStringField[] defaultTaxReg;
    private SearchColumnSelectField[] department;
    private SearchColumnBooleanField[] eligibleForCommission;
    private SearchColumnStringField[] email;
    private SearchColumnEnumSelectField[] emailPreference;
    private SearchColumnStringField[] entityId;
    private SearchColumnLongField[] entityNumber;
    private SearchColumnSelectField[] externalId;
    private SearchColumnStringField[] fax;
    private SearchColumnStringField[] firstName;
    private SearchColumnBooleanField[] giveAccess;
    private SearchColumnEnumSelectField[] globalSubscriptionStatus;
    private SearchColumnBooleanField[] hasDuplicates;
    private SearchColumnStringField[] homePhone;
    private SearchColumnSelectField[] image;
    private SearchColumnSelectField[] internalId;
    private SearchColumnBooleanField[] isDefaultBilling;
    private SearchColumnBooleanField[] isDefaultShipping;
    private SearchColumnBooleanField[] isInactive;
    private SearchColumnBooleanField[] isPerson;
    private SearchColumnEnumSelectField[] language;
    private SearchColumnDateField[] lastModifiedDate;
    private SearchColumnStringField[] lastName;
    private SearchColumnEnumSelectField[] level;
    private SearchColumnSelectField[] location;
    private SearchColumnStringField[] middleName;
    private SearchColumnStringField[] mobilePhone;
    private SearchColumnSelectField[] parent;
    private SearchColumnStringField[] partnerCode;
    private SearchColumnEnumSelectField[] permission;
    private SearchColumnStringField[] phone;
    private SearchColumnStringField[] phoneticName;
    private SearchColumnStringField[] promoCode;
    private SearchColumnStringField[] salutation;
    private SearchColumnStringField[] shipAddress;
    private SearchColumnStringField[] shipAddress1;
    private SearchColumnStringField[] shipAddress2;
    private SearchColumnStringField[] shipAddress3;
    private SearchColumnStringField[] shipAddressee;
    private SearchColumnStringField[] shipAttention;
    private SearchColumnStringField[] shipCity;
    private SearchColumnEnumSelectField[] shipCountry;
    private SearchColumnStringField[] shipCountryCode;
    private SearchColumnStringField[] shipPhone;
    private SearchColumnStringField[] shipState;
    private SearchColumnStringField[] shipZip;
    private SearchColumnStringField[] state;
    private SearchColumnSelectField[] subscription;
    private SearchColumnDateField[] subscriptionDate;
    private SearchColumnBooleanField[] subscriptionStatus;
    private SearchColumnSelectField[] subsidiary;
    private SearchColumnStringField[] title;
    private SearchColumnStringField[] url;
    private SearchColumnStringField[] zipCode;
    private SearchColumnCustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(PartnerSearchRowBasic.class, true);

    public PartnerSearchRowBasic() {
    }

    public PartnerSearchRowBasic(SearchColumnStringField[] address, SearchColumnStringField[] address1, SearchColumnStringField[] address2, SearchColumnStringField[] address3, SearchColumnStringField[] addressee, SearchColumnStringField[] addressInternalId, SearchColumnStringField[] addressLabel, SearchColumnStringField[] addressPhone, SearchColumnStringField[] altEmail, SearchColumnStringField[] altName, SearchColumnStringField[] altPhone, SearchColumnBooleanField[] assignTasks, SearchColumnStringField[] attention, SearchColumnStringField[] billAddress, SearchColumnStringField[] billAddress1, SearchColumnStringField[] billAddress2, SearchColumnStringField[] billAddress3, SearchColumnStringField[] billAddressee, SearchColumnStringField[] billAttention, SearchColumnStringField[] billCity, SearchColumnEnumSelectField[] billCountry, SearchColumnStringField[] billCountryCode, SearchColumnStringField[] billPhone, SearchColumnStringField[] billState, SearchColumnStringField[] billZipCode, SearchColumnStringField[] category, SearchColumnStringField[] city, SearchColumnSelectField[] _class, SearchColumnStringField[] comments, SearchColumnStringField[] companyName, SearchColumnEnumSelectField[] country, SearchColumnStringField[] countryCode, SearchColumnDateField[] dateCreated, SearchColumnStringField[] defaultTaxReg, SearchColumnSelectField[] department, SearchColumnBooleanField[] eligibleForCommission, SearchColumnStringField[] email, SearchColumnEnumSelectField[] emailPreference, SearchColumnStringField[] entityId, SearchColumnLongField[] entityNumber, SearchColumnSelectField[] externalId, SearchColumnStringField[] fax, SearchColumnStringField[] firstName, SearchColumnBooleanField[] giveAccess, SearchColumnEnumSelectField[] globalSubscriptionStatus, SearchColumnBooleanField[] hasDuplicates, SearchColumnStringField[] homePhone, SearchColumnSelectField[] image, SearchColumnSelectField[] internalId, SearchColumnBooleanField[] isDefaultBilling, SearchColumnBooleanField[] isDefaultShipping, SearchColumnBooleanField[] isInactive, SearchColumnBooleanField[] isPerson, SearchColumnEnumSelectField[] language, SearchColumnDateField[] lastModifiedDate, SearchColumnStringField[] lastName, SearchColumnEnumSelectField[] level, SearchColumnSelectField[] location, SearchColumnStringField[] middleName, SearchColumnStringField[] mobilePhone, SearchColumnSelectField[] parent, SearchColumnStringField[] partnerCode, SearchColumnEnumSelectField[] permission, SearchColumnStringField[] phone, SearchColumnStringField[] phoneticName, SearchColumnStringField[] promoCode, SearchColumnStringField[] salutation, SearchColumnStringField[] shipAddress, SearchColumnStringField[] shipAddress1, SearchColumnStringField[] shipAddress2, SearchColumnStringField[] shipAddress3, SearchColumnStringField[] shipAddressee, SearchColumnStringField[] shipAttention, SearchColumnStringField[] shipCity, SearchColumnEnumSelectField[] shipCountry, SearchColumnStringField[] shipCountryCode, SearchColumnStringField[] shipPhone, SearchColumnStringField[] shipState, SearchColumnStringField[] shipZip, SearchColumnStringField[] state, SearchColumnSelectField[] subscription, SearchColumnDateField[] subscriptionDate, SearchColumnBooleanField[] subscriptionStatus, SearchColumnSelectField[] subsidiary, SearchColumnStringField[] title, SearchColumnStringField[] url, SearchColumnStringField[] zipCode, SearchColumnCustomFieldList customFieldList) {
        this.address = address;
        this.address1 = address1;
        this.address2 = address2;
        this.address3 = address3;
        this.addressee = addressee;
        this.addressInternalId = addressInternalId;
        this.addressLabel = addressLabel;
        this.addressPhone = addressPhone;
        this.altEmail = altEmail;
        this.altName = altName;
        this.altPhone = altPhone;
        this.assignTasks = assignTasks;
        this.attention = attention;
        this.billAddress = billAddress;
        this.billAddress1 = billAddress1;
        this.billAddress2 = billAddress2;
        this.billAddress3 = billAddress3;
        this.billAddressee = billAddressee;
        this.billAttention = billAttention;
        this.billCity = billCity;
        this.billCountry = billCountry;
        this.billCountryCode = billCountryCode;
        this.billPhone = billPhone;
        this.billState = billState;
        this.billZipCode = billZipCode;
        this.category = category;
        this.city = city;
        this._class = _class;
        this.comments = comments;
        this.companyName = companyName;
        this.country = country;
        this.countryCode = countryCode;
        this.dateCreated = dateCreated;
        this.defaultTaxReg = defaultTaxReg;
        this.department = department;
        this.eligibleForCommission = eligibleForCommission;
        this.email = email;
        this.emailPreference = emailPreference;
        this.entityId = entityId;
        this.entityNumber = entityNumber;
        this.externalId = externalId;
        this.fax = fax;
        this.firstName = firstName;
        this.giveAccess = giveAccess;
        this.globalSubscriptionStatus = globalSubscriptionStatus;
        this.hasDuplicates = hasDuplicates;
        this.homePhone = homePhone;
        this.image = image;
        this.internalId = internalId;
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
        this.mobilePhone = mobilePhone;
        this.parent = parent;
        this.partnerCode = partnerCode;
        this.permission = permission;
        this.phone = phone;
        this.phoneticName = phoneticName;
        this.promoCode = promoCode;
        this.salutation = salutation;
        this.shipAddress = shipAddress;
        this.shipAddress1 = shipAddress1;
        this.shipAddress2 = shipAddress2;
        this.shipAddress3 = shipAddress3;
        this.shipAddressee = shipAddressee;
        this.shipAttention = shipAttention;
        this.shipCity = shipCity;
        this.shipCountry = shipCountry;
        this.shipCountryCode = shipCountryCode;
        this.shipPhone = shipPhone;
        this.shipState = shipState;
        this.shipZip = shipZip;
        this.state = state;
        this.subscription = subscription;
        this.subscriptionDate = subscriptionDate;
        this.subscriptionStatus = subscriptionStatus;
        this.subsidiary = subsidiary;
        this.title = title;
        this.url = url;
        this.zipCode = zipCode;
        this.customFieldList = customFieldList;
    }

    public SearchColumnStringField[] getAddress() {
        return this.address;
    }

    public void setAddress(SearchColumnStringField[] address) {
        this.address = address;
    }

    public SearchColumnStringField getAddress(int i) {
        return this.address[i];
    }

    public void setAddress(int i, SearchColumnStringField _value) {
        this.address[i] = _value;
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

    public SearchColumnStringField[] getAddressee() {
        return this.addressee;
    }

    public void setAddressee(SearchColumnStringField[] addressee) {
        this.addressee = addressee;
    }

    public SearchColumnStringField getAddressee(int i) {
        return this.addressee[i];
    }

    public void setAddressee(int i, SearchColumnStringField _value) {
        this.addressee[i] = _value;
    }

    public SearchColumnStringField[] getAddressInternalId() {
        return this.addressInternalId;
    }

    public void setAddressInternalId(SearchColumnStringField[] addressInternalId) {
        this.addressInternalId = addressInternalId;
    }

    public SearchColumnStringField getAddressInternalId(int i) {
        return this.addressInternalId[i];
    }

    public void setAddressInternalId(int i, SearchColumnStringField _value) {
        this.addressInternalId[i] = _value;
    }

    public SearchColumnStringField[] getAddressLabel() {
        return this.addressLabel;
    }

    public void setAddressLabel(SearchColumnStringField[] addressLabel) {
        this.addressLabel = addressLabel;
    }

    public SearchColumnStringField getAddressLabel(int i) {
        return this.addressLabel[i];
    }

    public void setAddressLabel(int i, SearchColumnStringField _value) {
        this.addressLabel[i] = _value;
    }

    public SearchColumnStringField[] getAddressPhone() {
        return this.addressPhone;
    }

    public void setAddressPhone(SearchColumnStringField[] addressPhone) {
        this.addressPhone = addressPhone;
    }

    public SearchColumnStringField getAddressPhone(int i) {
        return this.addressPhone[i];
    }

    public void setAddressPhone(int i, SearchColumnStringField _value) {
        this.addressPhone[i] = _value;
    }

    public SearchColumnStringField[] getAltEmail() {
        return this.altEmail;
    }

    public void setAltEmail(SearchColumnStringField[] altEmail) {
        this.altEmail = altEmail;
    }

    public SearchColumnStringField getAltEmail(int i) {
        return this.altEmail[i];
    }

    public void setAltEmail(int i, SearchColumnStringField _value) {
        this.altEmail[i] = _value;
    }

    public SearchColumnStringField[] getAltName() {
        return this.altName;
    }

    public void setAltName(SearchColumnStringField[] altName) {
        this.altName = altName;
    }

    public SearchColumnStringField getAltName(int i) {
        return this.altName[i];
    }

    public void setAltName(int i, SearchColumnStringField _value) {
        this.altName[i] = _value;
    }

    public SearchColumnStringField[] getAltPhone() {
        return this.altPhone;
    }

    public void setAltPhone(SearchColumnStringField[] altPhone) {
        this.altPhone = altPhone;
    }

    public SearchColumnStringField getAltPhone(int i) {
        return this.altPhone[i];
    }

    public void setAltPhone(int i, SearchColumnStringField _value) {
        this.altPhone[i] = _value;
    }

    public SearchColumnBooleanField[] getAssignTasks() {
        return this.assignTasks;
    }

    public void setAssignTasks(SearchColumnBooleanField[] assignTasks) {
        this.assignTasks = assignTasks;
    }

    public SearchColumnBooleanField getAssignTasks(int i) {
        return this.assignTasks[i];
    }

    public void setAssignTasks(int i, SearchColumnBooleanField _value) {
        this.assignTasks[i] = _value;
    }

    public SearchColumnStringField[] getAttention() {
        return this.attention;
    }

    public void setAttention(SearchColumnStringField[] attention) {
        this.attention = attention;
    }

    public SearchColumnStringField getAttention(int i) {
        return this.attention[i];
    }

    public void setAttention(int i, SearchColumnStringField _value) {
        this.attention[i] = _value;
    }

    public SearchColumnStringField[] getBillAddress() {
        return this.billAddress;
    }

    public void setBillAddress(SearchColumnStringField[] billAddress) {
        this.billAddress = billAddress;
    }

    public SearchColumnStringField getBillAddress(int i) {
        return this.billAddress[i];
    }

    public void setBillAddress(int i, SearchColumnStringField _value) {
        this.billAddress[i] = _value;
    }

    public SearchColumnStringField[] getBillAddress1() {
        return this.billAddress1;
    }

    public void setBillAddress1(SearchColumnStringField[] billAddress1) {
        this.billAddress1 = billAddress1;
    }

    public SearchColumnStringField getBillAddress1(int i) {
        return this.billAddress1[i];
    }

    public void setBillAddress1(int i, SearchColumnStringField _value) {
        this.billAddress1[i] = _value;
    }

    public SearchColumnStringField[] getBillAddress2() {
        return this.billAddress2;
    }

    public void setBillAddress2(SearchColumnStringField[] billAddress2) {
        this.billAddress2 = billAddress2;
    }

    public SearchColumnStringField getBillAddress2(int i) {
        return this.billAddress2[i];
    }

    public void setBillAddress2(int i, SearchColumnStringField _value) {
        this.billAddress2[i] = _value;
    }

    public SearchColumnStringField[] getBillAddress3() {
        return this.billAddress3;
    }

    public void setBillAddress3(SearchColumnStringField[] billAddress3) {
        this.billAddress3 = billAddress3;
    }

    public SearchColumnStringField getBillAddress3(int i) {
        return this.billAddress3[i];
    }

    public void setBillAddress3(int i, SearchColumnStringField _value) {
        this.billAddress3[i] = _value;
    }

    public SearchColumnStringField[] getBillAddressee() {
        return this.billAddressee;
    }

    public void setBillAddressee(SearchColumnStringField[] billAddressee) {
        this.billAddressee = billAddressee;
    }

    public SearchColumnStringField getBillAddressee(int i) {
        return this.billAddressee[i];
    }

    public void setBillAddressee(int i, SearchColumnStringField _value) {
        this.billAddressee[i] = _value;
    }

    public SearchColumnStringField[] getBillAttention() {
        return this.billAttention;
    }

    public void setBillAttention(SearchColumnStringField[] billAttention) {
        this.billAttention = billAttention;
    }

    public SearchColumnStringField getBillAttention(int i) {
        return this.billAttention[i];
    }

    public void setBillAttention(int i, SearchColumnStringField _value) {
        this.billAttention[i] = _value;
    }

    public SearchColumnStringField[] getBillCity() {
        return this.billCity;
    }

    public void setBillCity(SearchColumnStringField[] billCity) {
        this.billCity = billCity;
    }

    public SearchColumnStringField getBillCity(int i) {
        return this.billCity[i];
    }

    public void setBillCity(int i, SearchColumnStringField _value) {
        this.billCity[i] = _value;
    }

    public SearchColumnEnumSelectField[] getBillCountry() {
        return this.billCountry;
    }

    public void setBillCountry(SearchColumnEnumSelectField[] billCountry) {
        this.billCountry = billCountry;
    }

    public SearchColumnEnumSelectField getBillCountry(int i) {
        return this.billCountry[i];
    }

    public void setBillCountry(int i, SearchColumnEnumSelectField _value) {
        this.billCountry[i] = _value;
    }

    public SearchColumnStringField[] getBillCountryCode() {
        return this.billCountryCode;
    }

    public void setBillCountryCode(SearchColumnStringField[] billCountryCode) {
        this.billCountryCode = billCountryCode;
    }

    public SearchColumnStringField getBillCountryCode(int i) {
        return this.billCountryCode[i];
    }

    public void setBillCountryCode(int i, SearchColumnStringField _value) {
        this.billCountryCode[i] = _value;
    }

    public SearchColumnStringField[] getBillPhone() {
        return this.billPhone;
    }

    public void setBillPhone(SearchColumnStringField[] billPhone) {
        this.billPhone = billPhone;
    }

    public SearchColumnStringField getBillPhone(int i) {
        return this.billPhone[i];
    }

    public void setBillPhone(int i, SearchColumnStringField _value) {
        this.billPhone[i] = _value;
    }

    public SearchColumnStringField[] getBillState() {
        return this.billState;
    }

    public void setBillState(SearchColumnStringField[] billState) {
        this.billState = billState;
    }

    public SearchColumnStringField getBillState(int i) {
        return this.billState[i];
    }

    public void setBillState(int i, SearchColumnStringField _value) {
        this.billState[i] = _value;
    }

    public SearchColumnStringField[] getBillZipCode() {
        return this.billZipCode;
    }

    public void setBillZipCode(SearchColumnStringField[] billZipCode) {
        this.billZipCode = billZipCode;
    }

    public SearchColumnStringField getBillZipCode(int i) {
        return this.billZipCode[i];
    }

    public void setBillZipCode(int i, SearchColumnStringField _value) {
        this.billZipCode[i] = _value;
    }

    public SearchColumnStringField[] getCategory() {
        return this.category;
    }

    public void setCategory(SearchColumnStringField[] category) {
        this.category = category;
    }

    public SearchColumnStringField getCategory(int i) {
        return this.category[i];
    }

    public void setCategory(int i, SearchColumnStringField _value) {
        this.category[i] = _value;
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

    public SearchColumnSelectField[] get_class() {
        return this._class;
    }

    public void set_class(SearchColumnSelectField[] _class) {
        this._class = _class;
    }

    public SearchColumnSelectField get_class(int i) {
        return this._class[i];
    }

    public void set_class(int i, SearchColumnSelectField _value) {
        this._class[i] = _value;
    }

    public SearchColumnStringField[] getComments() {
        return this.comments;
    }

    public void setComments(SearchColumnStringField[] comments) {
        this.comments = comments;
    }

    public SearchColumnStringField getComments(int i) {
        return this.comments[i];
    }

    public void setComments(int i, SearchColumnStringField _value) {
        this.comments[i] = _value;
    }

    public SearchColumnStringField[] getCompanyName() {
        return this.companyName;
    }

    public void setCompanyName(SearchColumnStringField[] companyName) {
        this.companyName = companyName;
    }

    public SearchColumnStringField getCompanyName(int i) {
        return this.companyName[i];
    }

    public void setCompanyName(int i, SearchColumnStringField _value) {
        this.companyName[i] = _value;
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

    public SearchColumnStringField[] getCountryCode() {
        return this.countryCode;
    }

    public void setCountryCode(SearchColumnStringField[] countryCode) {
        this.countryCode = countryCode;
    }

    public SearchColumnStringField getCountryCode(int i) {
        return this.countryCode[i];
    }

    public void setCountryCode(int i, SearchColumnStringField _value) {
        this.countryCode[i] = _value;
    }

    public SearchColumnDateField[] getDateCreated() {
        return this.dateCreated;
    }

    public void setDateCreated(SearchColumnDateField[] dateCreated) {
        this.dateCreated = dateCreated;
    }

    public SearchColumnDateField getDateCreated(int i) {
        return this.dateCreated[i];
    }

    public void setDateCreated(int i, SearchColumnDateField _value) {
        this.dateCreated[i] = _value;
    }

    public SearchColumnStringField[] getDefaultTaxReg() {
        return this.defaultTaxReg;
    }

    public void setDefaultTaxReg(SearchColumnStringField[] defaultTaxReg) {
        this.defaultTaxReg = defaultTaxReg;
    }

    public SearchColumnStringField getDefaultTaxReg(int i) {
        return this.defaultTaxReg[i];
    }

    public void setDefaultTaxReg(int i, SearchColumnStringField _value) {
        this.defaultTaxReg[i] = _value;
    }

    public SearchColumnSelectField[] getDepartment() {
        return this.department;
    }

    public void setDepartment(SearchColumnSelectField[] department) {
        this.department = department;
    }

    public SearchColumnSelectField getDepartment(int i) {
        return this.department[i];
    }

    public void setDepartment(int i, SearchColumnSelectField _value) {
        this.department[i] = _value;
    }

    public SearchColumnBooleanField[] getEligibleForCommission() {
        return this.eligibleForCommission;
    }

    public void setEligibleForCommission(SearchColumnBooleanField[] eligibleForCommission) {
        this.eligibleForCommission = eligibleForCommission;
    }

    public SearchColumnBooleanField getEligibleForCommission(int i) {
        return this.eligibleForCommission[i];
    }

    public void setEligibleForCommission(int i, SearchColumnBooleanField _value) {
        this.eligibleForCommission[i] = _value;
    }

    public SearchColumnStringField[] getEmail() {
        return this.email;
    }

    public void setEmail(SearchColumnStringField[] email) {
        this.email = email;
    }

    public SearchColumnStringField getEmail(int i) {
        return this.email[i];
    }

    public void setEmail(int i, SearchColumnStringField _value) {
        this.email[i] = _value;
    }

    public SearchColumnEnumSelectField[] getEmailPreference() {
        return this.emailPreference;
    }

    public void setEmailPreference(SearchColumnEnumSelectField[] emailPreference) {
        this.emailPreference = emailPreference;
    }

    public SearchColumnEnumSelectField getEmailPreference(int i) {
        return this.emailPreference[i];
    }

    public void setEmailPreference(int i, SearchColumnEnumSelectField _value) {
        this.emailPreference[i] = _value;
    }

    public SearchColumnStringField[] getEntityId() {
        return this.entityId;
    }

    public void setEntityId(SearchColumnStringField[] entityId) {
        this.entityId = entityId;
    }

    public SearchColumnStringField getEntityId(int i) {
        return this.entityId[i];
    }

    public void setEntityId(int i, SearchColumnStringField _value) {
        this.entityId[i] = _value;
    }

    public SearchColumnLongField[] getEntityNumber() {
        return this.entityNumber;
    }

    public void setEntityNumber(SearchColumnLongField[] entityNumber) {
        this.entityNumber = entityNumber;
    }

    public SearchColumnLongField getEntityNumber(int i) {
        return this.entityNumber[i];
    }

    public void setEntityNumber(int i, SearchColumnLongField _value) {
        this.entityNumber[i] = _value;
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

    public SearchColumnStringField[] getFax() {
        return this.fax;
    }

    public void setFax(SearchColumnStringField[] fax) {
        this.fax = fax;
    }

    public SearchColumnStringField getFax(int i) {
        return this.fax[i];
    }

    public void setFax(int i, SearchColumnStringField _value) {
        this.fax[i] = _value;
    }

    public SearchColumnStringField[] getFirstName() {
        return this.firstName;
    }

    public void setFirstName(SearchColumnStringField[] firstName) {
        this.firstName = firstName;
    }

    public SearchColumnStringField getFirstName(int i) {
        return this.firstName[i];
    }

    public void setFirstName(int i, SearchColumnStringField _value) {
        this.firstName[i] = _value;
    }

    public SearchColumnBooleanField[] getGiveAccess() {
        return this.giveAccess;
    }

    public void setGiveAccess(SearchColumnBooleanField[] giveAccess) {
        this.giveAccess = giveAccess;
    }

    public SearchColumnBooleanField getGiveAccess(int i) {
        return this.giveAccess[i];
    }

    public void setGiveAccess(int i, SearchColumnBooleanField _value) {
        this.giveAccess[i] = _value;
    }

    public SearchColumnEnumSelectField[] getGlobalSubscriptionStatus() {
        return this.globalSubscriptionStatus;
    }

    public void setGlobalSubscriptionStatus(SearchColumnEnumSelectField[] globalSubscriptionStatus) {
        this.globalSubscriptionStatus = globalSubscriptionStatus;
    }

    public SearchColumnEnumSelectField getGlobalSubscriptionStatus(int i) {
        return this.globalSubscriptionStatus[i];
    }

    public void setGlobalSubscriptionStatus(int i, SearchColumnEnumSelectField _value) {
        this.globalSubscriptionStatus[i] = _value;
    }

    public SearchColumnBooleanField[] getHasDuplicates() {
        return this.hasDuplicates;
    }

    public void setHasDuplicates(SearchColumnBooleanField[] hasDuplicates) {
        this.hasDuplicates = hasDuplicates;
    }

    public SearchColumnBooleanField getHasDuplicates(int i) {
        return this.hasDuplicates[i];
    }

    public void setHasDuplicates(int i, SearchColumnBooleanField _value) {
        this.hasDuplicates[i] = _value;
    }

    public SearchColumnStringField[] getHomePhone() {
        return this.homePhone;
    }

    public void setHomePhone(SearchColumnStringField[] homePhone) {
        this.homePhone = homePhone;
    }

    public SearchColumnStringField getHomePhone(int i) {
        return this.homePhone[i];
    }

    public void setHomePhone(int i, SearchColumnStringField _value) {
        this.homePhone[i] = _value;
    }

    public SearchColumnSelectField[] getImage() {
        return this.image;
    }

    public void setImage(SearchColumnSelectField[] image) {
        this.image = image;
    }

    public SearchColumnSelectField getImage(int i) {
        return this.image[i];
    }

    public void setImage(int i, SearchColumnSelectField _value) {
        this.image[i] = _value;
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

    public SearchColumnBooleanField[] getIsDefaultBilling() {
        return this.isDefaultBilling;
    }

    public void setIsDefaultBilling(SearchColumnBooleanField[] isDefaultBilling) {
        this.isDefaultBilling = isDefaultBilling;
    }

    public SearchColumnBooleanField getIsDefaultBilling(int i) {
        return this.isDefaultBilling[i];
    }

    public void setIsDefaultBilling(int i, SearchColumnBooleanField _value) {
        this.isDefaultBilling[i] = _value;
    }

    public SearchColumnBooleanField[] getIsDefaultShipping() {
        return this.isDefaultShipping;
    }

    public void setIsDefaultShipping(SearchColumnBooleanField[] isDefaultShipping) {
        this.isDefaultShipping = isDefaultShipping;
    }

    public SearchColumnBooleanField getIsDefaultShipping(int i) {
        return this.isDefaultShipping[i];
    }

    public void setIsDefaultShipping(int i, SearchColumnBooleanField _value) {
        this.isDefaultShipping[i] = _value;
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

    public SearchColumnBooleanField[] getIsPerson() {
        return this.isPerson;
    }

    public void setIsPerson(SearchColumnBooleanField[] isPerson) {
        this.isPerson = isPerson;
    }

    public SearchColumnBooleanField getIsPerson(int i) {
        return this.isPerson[i];
    }

    public void setIsPerson(int i, SearchColumnBooleanField _value) {
        this.isPerson[i] = _value;
    }

    public SearchColumnEnumSelectField[] getLanguage() {
        return this.language;
    }

    public void setLanguage(SearchColumnEnumSelectField[] language) {
        this.language = language;
    }

    public SearchColumnEnumSelectField getLanguage(int i) {
        return this.language[i];
    }

    public void setLanguage(int i, SearchColumnEnumSelectField _value) {
        this.language[i] = _value;
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

    public SearchColumnStringField[] getLastName() {
        return this.lastName;
    }

    public void setLastName(SearchColumnStringField[] lastName) {
        this.lastName = lastName;
    }

    public SearchColumnStringField getLastName(int i) {
        return this.lastName[i];
    }

    public void setLastName(int i, SearchColumnStringField _value) {
        this.lastName[i] = _value;
    }

    public SearchColumnEnumSelectField[] getLevel() {
        return this.level;
    }

    public void setLevel(SearchColumnEnumSelectField[] level) {
        this.level = level;
    }

    public SearchColumnEnumSelectField getLevel(int i) {
        return this.level[i];
    }

    public void setLevel(int i, SearchColumnEnumSelectField _value) {
        this.level[i] = _value;
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

    public SearchColumnStringField[] getMiddleName() {
        return this.middleName;
    }

    public void setMiddleName(SearchColumnStringField[] middleName) {
        this.middleName = middleName;
    }

    public SearchColumnStringField getMiddleName(int i) {
        return this.middleName[i];
    }

    public void setMiddleName(int i, SearchColumnStringField _value) {
        this.middleName[i] = _value;
    }

    public SearchColumnStringField[] getMobilePhone() {
        return this.mobilePhone;
    }

    public void setMobilePhone(SearchColumnStringField[] mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public SearchColumnStringField getMobilePhone(int i) {
        return this.mobilePhone[i];
    }

    public void setMobilePhone(int i, SearchColumnStringField _value) {
        this.mobilePhone[i] = _value;
    }

    public SearchColumnSelectField[] getParent() {
        return this.parent;
    }

    public void setParent(SearchColumnSelectField[] parent) {
        this.parent = parent;
    }

    public SearchColumnSelectField getParent(int i) {
        return this.parent[i];
    }

    public void setParent(int i, SearchColumnSelectField _value) {
        this.parent[i] = _value;
    }

    public SearchColumnStringField[] getPartnerCode() {
        return this.partnerCode;
    }

    public void setPartnerCode(SearchColumnStringField[] partnerCode) {
        this.partnerCode = partnerCode;
    }

    public SearchColumnStringField getPartnerCode(int i) {
        return this.partnerCode[i];
    }

    public void setPartnerCode(int i, SearchColumnStringField _value) {
        this.partnerCode[i] = _value;
    }

    public SearchColumnEnumSelectField[] getPermission() {
        return this.permission;
    }

    public void setPermission(SearchColumnEnumSelectField[] permission) {
        this.permission = permission;
    }

    public SearchColumnEnumSelectField getPermission(int i) {
        return this.permission[i];
    }

    public void setPermission(int i, SearchColumnEnumSelectField _value) {
        this.permission[i] = _value;
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

    public SearchColumnStringField[] getPhoneticName() {
        return this.phoneticName;
    }

    public void setPhoneticName(SearchColumnStringField[] phoneticName) {
        this.phoneticName = phoneticName;
    }

    public SearchColumnStringField getPhoneticName(int i) {
        return this.phoneticName[i];
    }

    public void setPhoneticName(int i, SearchColumnStringField _value) {
        this.phoneticName[i] = _value;
    }

    public SearchColumnStringField[] getPromoCode() {
        return this.promoCode;
    }

    public void setPromoCode(SearchColumnStringField[] promoCode) {
        this.promoCode = promoCode;
    }

    public SearchColumnStringField getPromoCode(int i) {
        return this.promoCode[i];
    }

    public void setPromoCode(int i, SearchColumnStringField _value) {
        this.promoCode[i] = _value;
    }

    public SearchColumnStringField[] getSalutation() {
        return this.salutation;
    }

    public void setSalutation(SearchColumnStringField[] salutation) {
        this.salutation = salutation;
    }

    public SearchColumnStringField getSalutation(int i) {
        return this.salutation[i];
    }

    public void setSalutation(int i, SearchColumnStringField _value) {
        this.salutation[i] = _value;
    }

    public SearchColumnStringField[] getShipAddress() {
        return this.shipAddress;
    }

    public void setShipAddress(SearchColumnStringField[] shipAddress) {
        this.shipAddress = shipAddress;
    }

    public SearchColumnStringField getShipAddress(int i) {
        return this.shipAddress[i];
    }

    public void setShipAddress(int i, SearchColumnStringField _value) {
        this.shipAddress[i] = _value;
    }

    public SearchColumnStringField[] getShipAddress1() {
        return this.shipAddress1;
    }

    public void setShipAddress1(SearchColumnStringField[] shipAddress1) {
        this.shipAddress1 = shipAddress1;
    }

    public SearchColumnStringField getShipAddress1(int i) {
        return this.shipAddress1[i];
    }

    public void setShipAddress1(int i, SearchColumnStringField _value) {
        this.shipAddress1[i] = _value;
    }

    public SearchColumnStringField[] getShipAddress2() {
        return this.shipAddress2;
    }

    public void setShipAddress2(SearchColumnStringField[] shipAddress2) {
        this.shipAddress2 = shipAddress2;
    }

    public SearchColumnStringField getShipAddress2(int i) {
        return this.shipAddress2[i];
    }

    public void setShipAddress2(int i, SearchColumnStringField _value) {
        this.shipAddress2[i] = _value;
    }

    public SearchColumnStringField[] getShipAddress3() {
        return this.shipAddress3;
    }

    public void setShipAddress3(SearchColumnStringField[] shipAddress3) {
        this.shipAddress3 = shipAddress3;
    }

    public SearchColumnStringField getShipAddress3(int i) {
        return this.shipAddress3[i];
    }

    public void setShipAddress3(int i, SearchColumnStringField _value) {
        this.shipAddress3[i] = _value;
    }

    public SearchColumnStringField[] getShipAddressee() {
        return this.shipAddressee;
    }

    public void setShipAddressee(SearchColumnStringField[] shipAddressee) {
        this.shipAddressee = shipAddressee;
    }

    public SearchColumnStringField getShipAddressee(int i) {
        return this.shipAddressee[i];
    }

    public void setShipAddressee(int i, SearchColumnStringField _value) {
        this.shipAddressee[i] = _value;
    }

    public SearchColumnStringField[] getShipAttention() {
        return this.shipAttention;
    }

    public void setShipAttention(SearchColumnStringField[] shipAttention) {
        this.shipAttention = shipAttention;
    }

    public SearchColumnStringField getShipAttention(int i) {
        return this.shipAttention[i];
    }

    public void setShipAttention(int i, SearchColumnStringField _value) {
        this.shipAttention[i] = _value;
    }

    public SearchColumnStringField[] getShipCity() {
        return this.shipCity;
    }

    public void setShipCity(SearchColumnStringField[] shipCity) {
        this.shipCity = shipCity;
    }

    public SearchColumnStringField getShipCity(int i) {
        return this.shipCity[i];
    }

    public void setShipCity(int i, SearchColumnStringField _value) {
        this.shipCity[i] = _value;
    }

    public SearchColumnEnumSelectField[] getShipCountry() {
        return this.shipCountry;
    }

    public void setShipCountry(SearchColumnEnumSelectField[] shipCountry) {
        this.shipCountry = shipCountry;
    }

    public SearchColumnEnumSelectField getShipCountry(int i) {
        return this.shipCountry[i];
    }

    public void setShipCountry(int i, SearchColumnEnumSelectField _value) {
        this.shipCountry[i] = _value;
    }

    public SearchColumnStringField[] getShipCountryCode() {
        return this.shipCountryCode;
    }

    public void setShipCountryCode(SearchColumnStringField[] shipCountryCode) {
        this.shipCountryCode = shipCountryCode;
    }

    public SearchColumnStringField getShipCountryCode(int i) {
        return this.shipCountryCode[i];
    }

    public void setShipCountryCode(int i, SearchColumnStringField _value) {
        this.shipCountryCode[i] = _value;
    }

    public SearchColumnStringField[] getShipPhone() {
        return this.shipPhone;
    }

    public void setShipPhone(SearchColumnStringField[] shipPhone) {
        this.shipPhone = shipPhone;
    }

    public SearchColumnStringField getShipPhone(int i) {
        return this.shipPhone[i];
    }

    public void setShipPhone(int i, SearchColumnStringField _value) {
        this.shipPhone[i] = _value;
    }

    public SearchColumnStringField[] getShipState() {
        return this.shipState;
    }

    public void setShipState(SearchColumnStringField[] shipState) {
        this.shipState = shipState;
    }

    public SearchColumnStringField getShipState(int i) {
        return this.shipState[i];
    }

    public void setShipState(int i, SearchColumnStringField _value) {
        this.shipState[i] = _value;
    }

    public SearchColumnStringField[] getShipZip() {
        return this.shipZip;
    }

    public void setShipZip(SearchColumnStringField[] shipZip) {
        this.shipZip = shipZip;
    }

    public SearchColumnStringField getShipZip(int i) {
        return this.shipZip[i];
    }

    public void setShipZip(int i, SearchColumnStringField _value) {
        this.shipZip[i] = _value;
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

    public SearchColumnSelectField[] getSubscription() {
        return this.subscription;
    }

    public void setSubscription(SearchColumnSelectField[] subscription) {
        this.subscription = subscription;
    }

    public SearchColumnSelectField getSubscription(int i) {
        return this.subscription[i];
    }

    public void setSubscription(int i, SearchColumnSelectField _value) {
        this.subscription[i] = _value;
    }

    public SearchColumnDateField[] getSubscriptionDate() {
        return this.subscriptionDate;
    }

    public void setSubscriptionDate(SearchColumnDateField[] subscriptionDate) {
        this.subscriptionDate = subscriptionDate;
    }

    public SearchColumnDateField getSubscriptionDate(int i) {
        return this.subscriptionDate[i];
    }

    public void setSubscriptionDate(int i, SearchColumnDateField _value) {
        this.subscriptionDate[i] = _value;
    }

    public SearchColumnBooleanField[] getSubscriptionStatus() {
        return this.subscriptionStatus;
    }

    public void setSubscriptionStatus(SearchColumnBooleanField[] subscriptionStatus) {
        this.subscriptionStatus = subscriptionStatus;
    }

    public SearchColumnBooleanField getSubscriptionStatus(int i) {
        return this.subscriptionStatus[i];
    }

    public void setSubscriptionStatus(int i, SearchColumnBooleanField _value) {
        this.subscriptionStatus[i] = _value;
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

    public SearchColumnStringField[] getTitle() {
        return this.title;
    }

    public void setTitle(SearchColumnStringField[] title) {
        this.title = title;
    }

    public SearchColumnStringField getTitle(int i) {
        return this.title[i];
    }

    public void setTitle(int i, SearchColumnStringField _value) {
        this.title[i] = _value;
    }

    public SearchColumnStringField[] getUrl() {
        return this.url;
    }

    public void setUrl(SearchColumnStringField[] url) {
        this.url = url;
    }

    public SearchColumnStringField getUrl(int i) {
        return this.url[i];
    }

    public void setUrl(int i, SearchColumnStringField _value) {
        this.url[i] = _value;
    }

    public SearchColumnStringField[] getZipCode() {
        return this.zipCode;
    }

    public void setZipCode(SearchColumnStringField[] zipCode) {
        this.zipCode = zipCode;
    }

    public SearchColumnStringField getZipCode(int i) {
        return this.zipCode[i];
    }

    public void setZipCode(int i, SearchColumnStringField _value) {
        this.zipCode[i] = _value;
    }

    public SearchColumnCustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PartnerSearchRowBasic)) {
            return false;
        }
        PartnerSearchRowBasic other = (PartnerSearchRowBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.address == null && other.getAddress() == null || this.address != null && Arrays.equals(this.address, other.getAddress())) && (this.address1 == null && other.getAddress1() == null || this.address1 != null && Arrays.equals(this.address1, other.getAddress1())) && (this.address2 == null && other.getAddress2() == null || this.address2 != null && Arrays.equals(this.address2, other.getAddress2())) && (this.address3 == null && other.getAddress3() == null || this.address3 != null && Arrays.equals(this.address3, other.getAddress3())) && (this.addressee == null && other.getAddressee() == null || this.addressee != null && Arrays.equals(this.addressee, other.getAddressee())) && (this.addressInternalId == null && other.getAddressInternalId() == null || this.addressInternalId != null && Arrays.equals(this.addressInternalId, other.getAddressInternalId())) && (this.addressLabel == null && other.getAddressLabel() == null || this.addressLabel != null && Arrays.equals(this.addressLabel, other.getAddressLabel())) && (this.addressPhone == null && other.getAddressPhone() == null || this.addressPhone != null && Arrays.equals(this.addressPhone, other.getAddressPhone())) && (this.altEmail == null && other.getAltEmail() == null || this.altEmail != null && Arrays.equals(this.altEmail, other.getAltEmail())) && (this.altName == null && other.getAltName() == null || this.altName != null && Arrays.equals(this.altName, other.getAltName())) && (this.altPhone == null && other.getAltPhone() == null || this.altPhone != null && Arrays.equals(this.altPhone, other.getAltPhone())) && (this.assignTasks == null && other.getAssignTasks() == null || this.assignTasks != null && Arrays.equals(this.assignTasks, other.getAssignTasks())) && (this.attention == null && other.getAttention() == null || this.attention != null && Arrays.equals(this.attention, other.getAttention())) && (this.billAddress == null && other.getBillAddress() == null || this.billAddress != null && Arrays.equals(this.billAddress, other.getBillAddress())) && (this.billAddress1 == null && other.getBillAddress1() == null || this.billAddress1 != null && Arrays.equals(this.billAddress1, other.getBillAddress1())) && (this.billAddress2 == null && other.getBillAddress2() == null || this.billAddress2 != null && Arrays.equals(this.billAddress2, other.getBillAddress2())) && (this.billAddress3 == null && other.getBillAddress3() == null || this.billAddress3 != null && Arrays.equals(this.billAddress3, other.getBillAddress3())) && (this.billAddressee == null && other.getBillAddressee() == null || this.billAddressee != null && Arrays.equals(this.billAddressee, other.getBillAddressee())) && (this.billAttention == null && other.getBillAttention() == null || this.billAttention != null && Arrays.equals(this.billAttention, other.getBillAttention())) && (this.billCity == null && other.getBillCity() == null || this.billCity != null && Arrays.equals(this.billCity, other.getBillCity())) && (this.billCountry == null && other.getBillCountry() == null || this.billCountry != null && Arrays.equals(this.billCountry, other.getBillCountry())) && (this.billCountryCode == null && other.getBillCountryCode() == null || this.billCountryCode != null && Arrays.equals(this.billCountryCode, other.getBillCountryCode())) && (this.billPhone == null && other.getBillPhone() == null || this.billPhone != null && Arrays.equals(this.billPhone, other.getBillPhone())) && (this.billState == null && other.getBillState() == null || this.billState != null && Arrays.equals(this.billState, other.getBillState())) && (this.billZipCode == null && other.getBillZipCode() == null || this.billZipCode != null && Arrays.equals(this.billZipCode, other.getBillZipCode())) && (this.category == null && other.getCategory() == null || this.category != null && Arrays.equals(this.category, other.getCategory())) && (this.city == null && other.getCity() == null || this.city != null && Arrays.equals(this.city, other.getCity())) && (this._class == null && other.get_class() == null || this._class != null && Arrays.equals(this._class, other.get_class())) && (this.comments == null && other.getComments() == null || this.comments != null && Arrays.equals(this.comments, other.getComments())) && (this.companyName == null && other.getCompanyName() == null || this.companyName != null && Arrays.equals(this.companyName, other.getCompanyName())) && (this.country == null && other.getCountry() == null || this.country != null && Arrays.equals(this.country, other.getCountry())) && (this.countryCode == null && other.getCountryCode() == null || this.countryCode != null && Arrays.equals(this.countryCode, other.getCountryCode())) && (this.dateCreated == null && other.getDateCreated() == null || this.dateCreated != null && Arrays.equals(this.dateCreated, other.getDateCreated())) && (this.defaultTaxReg == null && other.getDefaultTaxReg() == null || this.defaultTaxReg != null && Arrays.equals(this.defaultTaxReg, other.getDefaultTaxReg())) && (this.department == null && other.getDepartment() == null || this.department != null && Arrays.equals(this.department, other.getDepartment())) && (this.eligibleForCommission == null && other.getEligibleForCommission() == null || this.eligibleForCommission != null && Arrays.equals(this.eligibleForCommission, other.getEligibleForCommission())) && (this.email == null && other.getEmail() == null || this.email != null && Arrays.equals(this.email, other.getEmail())) && (this.emailPreference == null && other.getEmailPreference() == null || this.emailPreference != null && Arrays.equals(this.emailPreference, other.getEmailPreference())) && (this.entityId == null && other.getEntityId() == null || this.entityId != null && Arrays.equals(this.entityId, other.getEntityId())) && (this.entityNumber == null && other.getEntityNumber() == null || this.entityNumber != null && Arrays.equals(this.entityNumber, other.getEntityNumber())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && Arrays.equals(this.externalId, other.getExternalId())) && (this.fax == null && other.getFax() == null || this.fax != null && Arrays.equals(this.fax, other.getFax())) && (this.firstName == null && other.getFirstName() == null || this.firstName != null && Arrays.equals(this.firstName, other.getFirstName())) && (this.giveAccess == null && other.getGiveAccess() == null || this.giveAccess != null && Arrays.equals(this.giveAccess, other.getGiveAccess())) && (this.globalSubscriptionStatus == null && other.getGlobalSubscriptionStatus() == null || this.globalSubscriptionStatus != null && Arrays.equals(this.globalSubscriptionStatus, other.getGlobalSubscriptionStatus())) && (this.hasDuplicates == null && other.getHasDuplicates() == null || this.hasDuplicates != null && Arrays.equals(this.hasDuplicates, other.getHasDuplicates())) && (this.homePhone == null && other.getHomePhone() == null || this.homePhone != null && Arrays.equals(this.homePhone, other.getHomePhone())) && (this.image == null && other.getImage() == null || this.image != null && Arrays.equals(this.image, other.getImage())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && Arrays.equals(this.internalId, other.getInternalId())) && (this.isDefaultBilling == null && other.getIsDefaultBilling() == null || this.isDefaultBilling != null && Arrays.equals(this.isDefaultBilling, other.getIsDefaultBilling())) && (this.isDefaultShipping == null && other.getIsDefaultShipping() == null || this.isDefaultShipping != null && Arrays.equals(this.isDefaultShipping, other.getIsDefaultShipping())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && Arrays.equals(this.isInactive, other.getIsInactive())) && (this.isPerson == null && other.getIsPerson() == null || this.isPerson != null && Arrays.equals(this.isPerson, other.getIsPerson())) && (this.language == null && other.getLanguage() == null || this.language != null && Arrays.equals(this.language, other.getLanguage())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && Arrays.equals(this.lastModifiedDate, other.getLastModifiedDate())) && (this.lastName == null && other.getLastName() == null || this.lastName != null && Arrays.equals(this.lastName, other.getLastName())) && (this.level == null && other.getLevel() == null || this.level != null && Arrays.equals(this.level, other.getLevel())) && (this.location == null && other.getLocation() == null || this.location != null && Arrays.equals(this.location, other.getLocation())) && (this.middleName == null && other.getMiddleName() == null || this.middleName != null && Arrays.equals(this.middleName, other.getMiddleName())) && (this.mobilePhone == null && other.getMobilePhone() == null || this.mobilePhone != null && Arrays.equals(this.mobilePhone, other.getMobilePhone())) && (this.parent == null && other.getParent() == null || this.parent != null && Arrays.equals(this.parent, other.getParent())) && (this.partnerCode == null && other.getPartnerCode() == null || this.partnerCode != null && Arrays.equals(this.partnerCode, other.getPartnerCode())) && (this.permission == null && other.getPermission() == null || this.permission != null && Arrays.equals(this.permission, other.getPermission())) && (this.phone == null && other.getPhone() == null || this.phone != null && Arrays.equals(this.phone, other.getPhone())) && (this.phoneticName == null && other.getPhoneticName() == null || this.phoneticName != null && Arrays.equals(this.phoneticName, other.getPhoneticName())) && (this.promoCode == null && other.getPromoCode() == null || this.promoCode != null && Arrays.equals(this.promoCode, other.getPromoCode())) && (this.salutation == null && other.getSalutation() == null || this.salutation != null && Arrays.equals(this.salutation, other.getSalutation())) && (this.shipAddress == null && other.getShipAddress() == null || this.shipAddress != null && Arrays.equals(this.shipAddress, other.getShipAddress())) && (this.shipAddress1 == null && other.getShipAddress1() == null || this.shipAddress1 != null && Arrays.equals(this.shipAddress1, other.getShipAddress1())) && (this.shipAddress2 == null && other.getShipAddress2() == null || this.shipAddress2 != null && Arrays.equals(this.shipAddress2, other.getShipAddress2())) && (this.shipAddress3 == null && other.getShipAddress3() == null || this.shipAddress3 != null && Arrays.equals(this.shipAddress3, other.getShipAddress3())) && (this.shipAddressee == null && other.getShipAddressee() == null || this.shipAddressee != null && Arrays.equals(this.shipAddressee, other.getShipAddressee())) && (this.shipAttention == null && other.getShipAttention() == null || this.shipAttention != null && Arrays.equals(this.shipAttention, other.getShipAttention())) && (this.shipCity == null && other.getShipCity() == null || this.shipCity != null && Arrays.equals(this.shipCity, other.getShipCity())) && (this.shipCountry == null && other.getShipCountry() == null || this.shipCountry != null && Arrays.equals(this.shipCountry, other.getShipCountry())) && (this.shipCountryCode == null && other.getShipCountryCode() == null || this.shipCountryCode != null && Arrays.equals(this.shipCountryCode, other.getShipCountryCode())) && (this.shipPhone == null && other.getShipPhone() == null || this.shipPhone != null && Arrays.equals(this.shipPhone, other.getShipPhone())) && (this.shipState == null && other.getShipState() == null || this.shipState != null && Arrays.equals(this.shipState, other.getShipState())) && (this.shipZip == null && other.getShipZip() == null || this.shipZip != null && Arrays.equals(this.shipZip, other.getShipZip())) && (this.state == null && other.getState() == null || this.state != null && Arrays.equals(this.state, other.getState())) && (this.subscription == null && other.getSubscription() == null || this.subscription != null && Arrays.equals(this.subscription, other.getSubscription())) && (this.subscriptionDate == null && other.getSubscriptionDate() == null || this.subscriptionDate != null && Arrays.equals(this.subscriptionDate, other.getSubscriptionDate())) && (this.subscriptionStatus == null && other.getSubscriptionStatus() == null || this.subscriptionStatus != null && Arrays.equals(this.subscriptionStatus, other.getSubscriptionStatus())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && Arrays.equals(this.subsidiary, other.getSubsidiary())) && (this.title == null && other.getTitle() == null || this.title != null && Arrays.equals(this.title, other.getTitle())) && (this.url == null && other.getUrl() == null || this.url != null && Arrays.equals(this.url, other.getUrl())) && (this.zipCode == null && other.getZipCode() == null || this.zipCode != null && Arrays.equals(this.zipCode, other.getZipCode())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
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
        if (this.getAddress() != null) {
            for (i = 0; i < Array.getLength(this.getAddress()); ++i) {
                obj = Array.get(this.getAddress(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
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
        if (this.getAddressee() != null) {
            for (i = 0; i < Array.getLength(this.getAddressee()); ++i) {
                obj = Array.get(this.getAddressee(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAddressInternalId() != null) {
            for (i = 0; i < Array.getLength(this.getAddressInternalId()); ++i) {
                obj = Array.get(this.getAddressInternalId(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAddressLabel() != null) {
            for (i = 0; i < Array.getLength(this.getAddressLabel()); ++i) {
                obj = Array.get(this.getAddressLabel(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAddressPhone() != null) {
            for (i = 0; i < Array.getLength(this.getAddressPhone()); ++i) {
                obj = Array.get(this.getAddressPhone(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAltEmail() != null) {
            for (i = 0; i < Array.getLength(this.getAltEmail()); ++i) {
                obj = Array.get(this.getAltEmail(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAltName() != null) {
            for (i = 0; i < Array.getLength(this.getAltName()); ++i) {
                obj = Array.get(this.getAltName(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAltPhone() != null) {
            for (i = 0; i < Array.getLength(this.getAltPhone()); ++i) {
                obj = Array.get(this.getAltPhone(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAssignTasks() != null) {
            for (i = 0; i < Array.getLength(this.getAssignTasks()); ++i) {
                obj = Array.get(this.getAssignTasks(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAttention() != null) {
            for (i = 0; i < Array.getLength(this.getAttention()); ++i) {
                obj = Array.get(this.getAttention(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBillAddress() != null) {
            for (i = 0; i < Array.getLength(this.getBillAddress()); ++i) {
                obj = Array.get(this.getBillAddress(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBillAddress1() != null) {
            for (i = 0; i < Array.getLength(this.getBillAddress1()); ++i) {
                obj = Array.get(this.getBillAddress1(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBillAddress2() != null) {
            for (i = 0; i < Array.getLength(this.getBillAddress2()); ++i) {
                obj = Array.get(this.getBillAddress2(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBillAddress3() != null) {
            for (i = 0; i < Array.getLength(this.getBillAddress3()); ++i) {
                obj = Array.get(this.getBillAddress3(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBillAddressee() != null) {
            for (i = 0; i < Array.getLength(this.getBillAddressee()); ++i) {
                obj = Array.get(this.getBillAddressee(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBillAttention() != null) {
            for (i = 0; i < Array.getLength(this.getBillAttention()); ++i) {
                obj = Array.get(this.getBillAttention(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBillCity() != null) {
            for (i = 0; i < Array.getLength(this.getBillCity()); ++i) {
                obj = Array.get(this.getBillCity(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBillCountry() != null) {
            for (i = 0; i < Array.getLength(this.getBillCountry()); ++i) {
                obj = Array.get(this.getBillCountry(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBillCountryCode() != null) {
            for (i = 0; i < Array.getLength(this.getBillCountryCode()); ++i) {
                obj = Array.get(this.getBillCountryCode(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBillPhone() != null) {
            for (i = 0; i < Array.getLength(this.getBillPhone()); ++i) {
                obj = Array.get(this.getBillPhone(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBillState() != null) {
            for (i = 0; i < Array.getLength(this.getBillState()); ++i) {
                obj = Array.get(this.getBillState(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBillZipCode() != null) {
            for (i = 0; i < Array.getLength(this.getBillZipCode()); ++i) {
                obj = Array.get(this.getBillZipCode(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCategory() != null) {
            for (i = 0; i < Array.getLength(this.getCategory()); ++i) {
                obj = Array.get(this.getCategory(), i);
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
        if (this.get_class() != null) {
            for (i = 0; i < Array.getLength(this.get_class()); ++i) {
                obj = Array.get(this.get_class(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getComments() != null) {
            for (i = 0; i < Array.getLength(this.getComments()); ++i) {
                obj = Array.get(this.getComments(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCompanyName() != null) {
            for (i = 0; i < Array.getLength(this.getCompanyName()); ++i) {
                obj = Array.get(this.getCompanyName(), i);
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
        if (this.getCountryCode() != null) {
            for (i = 0; i < Array.getLength(this.getCountryCode()); ++i) {
                obj = Array.get(this.getCountryCode(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDateCreated() != null) {
            for (i = 0; i < Array.getLength(this.getDateCreated()); ++i) {
                obj = Array.get(this.getDateCreated(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDefaultTaxReg() != null) {
            for (i = 0; i < Array.getLength(this.getDefaultTaxReg()); ++i) {
                obj = Array.get(this.getDefaultTaxReg(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDepartment() != null) {
            for (i = 0; i < Array.getLength(this.getDepartment()); ++i) {
                obj = Array.get(this.getDepartment(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getEligibleForCommission() != null) {
            for (i = 0; i < Array.getLength(this.getEligibleForCommission()); ++i) {
                obj = Array.get(this.getEligibleForCommission(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getEmail() != null) {
            for (i = 0; i < Array.getLength(this.getEmail()); ++i) {
                obj = Array.get(this.getEmail(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getEmailPreference() != null) {
            for (i = 0; i < Array.getLength(this.getEmailPreference()); ++i) {
                obj = Array.get(this.getEmailPreference(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getEntityId() != null) {
            for (i = 0; i < Array.getLength(this.getEntityId()); ++i) {
                obj = Array.get(this.getEntityId(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getEntityNumber() != null) {
            for (i = 0; i < Array.getLength(this.getEntityNumber()); ++i) {
                obj = Array.get(this.getEntityNumber(), i);
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
        if (this.getFax() != null) {
            for (i = 0; i < Array.getLength(this.getFax()); ++i) {
                obj = Array.get(this.getFax(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getFirstName() != null) {
            for (i = 0; i < Array.getLength(this.getFirstName()); ++i) {
                obj = Array.get(this.getFirstName(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getGiveAccess() != null) {
            for (i = 0; i < Array.getLength(this.getGiveAccess()); ++i) {
                obj = Array.get(this.getGiveAccess(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getGlobalSubscriptionStatus() != null) {
            for (i = 0; i < Array.getLength(this.getGlobalSubscriptionStatus()); ++i) {
                obj = Array.get(this.getGlobalSubscriptionStatus(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getHasDuplicates() != null) {
            for (i = 0; i < Array.getLength(this.getHasDuplicates()); ++i) {
                obj = Array.get(this.getHasDuplicates(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getHomePhone() != null) {
            for (i = 0; i < Array.getLength(this.getHomePhone()); ++i) {
                obj = Array.get(this.getHomePhone(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getImage() != null) {
            for (i = 0; i < Array.getLength(this.getImage()); ++i) {
                obj = Array.get(this.getImage(), i);
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
        if (this.getIsDefaultBilling() != null) {
            for (i = 0; i < Array.getLength(this.getIsDefaultBilling()); ++i) {
                obj = Array.get(this.getIsDefaultBilling(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsDefaultShipping() != null) {
            for (i = 0; i < Array.getLength(this.getIsDefaultShipping()); ++i) {
                obj = Array.get(this.getIsDefaultShipping(), i);
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
        if (this.getIsPerson() != null) {
            for (i = 0; i < Array.getLength(this.getIsPerson()); ++i) {
                obj = Array.get(this.getIsPerson(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLanguage() != null) {
            for (i = 0; i < Array.getLength(this.getLanguage()); ++i) {
                obj = Array.get(this.getLanguage(), i);
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
        if (this.getLastName() != null) {
            for (i = 0; i < Array.getLength(this.getLastName()); ++i) {
                obj = Array.get(this.getLastName(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLevel() != null) {
            for (i = 0; i < Array.getLength(this.getLevel()); ++i) {
                obj = Array.get(this.getLevel(), i);
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
        if (this.getMiddleName() != null) {
            for (i = 0; i < Array.getLength(this.getMiddleName()); ++i) {
                obj = Array.get(this.getMiddleName(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getMobilePhone() != null) {
            for (i = 0; i < Array.getLength(this.getMobilePhone()); ++i) {
                obj = Array.get(this.getMobilePhone(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getParent() != null) {
            for (i = 0; i < Array.getLength(this.getParent()); ++i) {
                obj = Array.get(this.getParent(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPartnerCode() != null) {
            for (i = 0; i < Array.getLength(this.getPartnerCode()); ++i) {
                obj = Array.get(this.getPartnerCode(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPermission() != null) {
            for (i = 0; i < Array.getLength(this.getPermission()); ++i) {
                obj = Array.get(this.getPermission(), i);
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
        if (this.getPhoneticName() != null) {
            for (i = 0; i < Array.getLength(this.getPhoneticName()); ++i) {
                obj = Array.get(this.getPhoneticName(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPromoCode() != null) {
            for (i = 0; i < Array.getLength(this.getPromoCode()); ++i) {
                obj = Array.get(this.getPromoCode(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSalutation() != null) {
            for (i = 0; i < Array.getLength(this.getSalutation()); ++i) {
                obj = Array.get(this.getSalutation(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getShipAddress() != null) {
            for (i = 0; i < Array.getLength(this.getShipAddress()); ++i) {
                obj = Array.get(this.getShipAddress(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getShipAddress1() != null) {
            for (i = 0; i < Array.getLength(this.getShipAddress1()); ++i) {
                obj = Array.get(this.getShipAddress1(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getShipAddress2() != null) {
            for (i = 0; i < Array.getLength(this.getShipAddress2()); ++i) {
                obj = Array.get(this.getShipAddress2(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getShipAddress3() != null) {
            for (i = 0; i < Array.getLength(this.getShipAddress3()); ++i) {
                obj = Array.get(this.getShipAddress3(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getShipAddressee() != null) {
            for (i = 0; i < Array.getLength(this.getShipAddressee()); ++i) {
                obj = Array.get(this.getShipAddressee(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getShipAttention() != null) {
            for (i = 0; i < Array.getLength(this.getShipAttention()); ++i) {
                obj = Array.get(this.getShipAttention(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getShipCity() != null) {
            for (i = 0; i < Array.getLength(this.getShipCity()); ++i) {
                obj = Array.get(this.getShipCity(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getShipCountry() != null) {
            for (i = 0; i < Array.getLength(this.getShipCountry()); ++i) {
                obj = Array.get(this.getShipCountry(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getShipCountryCode() != null) {
            for (i = 0; i < Array.getLength(this.getShipCountryCode()); ++i) {
                obj = Array.get(this.getShipCountryCode(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getShipPhone() != null) {
            for (i = 0; i < Array.getLength(this.getShipPhone()); ++i) {
                obj = Array.get(this.getShipPhone(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getShipState() != null) {
            for (i = 0; i < Array.getLength(this.getShipState()); ++i) {
                obj = Array.get(this.getShipState(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getShipZip() != null) {
            for (i = 0; i < Array.getLength(this.getShipZip()); ++i) {
                obj = Array.get(this.getShipZip(), i);
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
        if (this.getSubscription() != null) {
            for (i = 0; i < Array.getLength(this.getSubscription()); ++i) {
                obj = Array.get(this.getSubscription(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSubscriptionDate() != null) {
            for (i = 0; i < Array.getLength(this.getSubscriptionDate()); ++i) {
                obj = Array.get(this.getSubscriptionDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSubscriptionStatus() != null) {
            for (i = 0; i < Array.getLength(this.getSubscriptionStatus()); ++i) {
                obj = Array.get(this.getSubscriptionStatus(), i);
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
        if (this.getTitle() != null) {
            for (i = 0; i < Array.getLength(this.getTitle()); ++i) {
                obj = Array.get(this.getTitle(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getUrl() != null) {
            for (i = 0; i < Array.getLength(this.getUrl()); ++i) {
                obj = Array.get(this.getUrl(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getZipCode() != null) {
            for (i = 0; i < Array.getLength(this.getZipCode()); ++i) {
                obj = Array.get(this.getZipCode(), i);
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "PartnerSearchRowBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "address"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
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
        elemField.setFieldName("addressee");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "addressee"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("addressInternalId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "addressInternalId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("addressLabel");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "addressLabel"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("addressPhone");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "addressPhone"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("altEmail");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "altEmail"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("altName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "altName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("altPhone");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "altPhone"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("assignTasks");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "assignTasks"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("attention");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "attention"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billAddress");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billAddress"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billAddress1");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billAddress1"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billAddress2");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billAddress2"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billAddress3");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billAddress3"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billAddressee");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billAddressee"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billAttention");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billAttention"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billCity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billCity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billCountry");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billCountry"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billCountryCode");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billCountryCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billPhone");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billPhone"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billState");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billState"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billZipCode");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billZipCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "category"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("_class");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "class"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "comments"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("companyName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "companyName"));
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
        elemField.setFieldName("countryCode");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "countryCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("dateCreated");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "dateCreated"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("defaultTaxReg");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "defaultTaxReg"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "department"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("eligibleForCommission");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "eligibleForCommission"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "email"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("emailPreference");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "emailPreference"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("entityId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "entityId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("entityNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "entityNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
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
        elemField.setFieldName("fax");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fax"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "firstName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("giveAccess");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "giveAccess"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("globalSubscriptionStatus");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "globalSubscriptionStatus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("hasDuplicates");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "hasDuplicates"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("homePhone");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "homePhone"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("image");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "image"));
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
        elemField.setFieldName("isDefaultBilling");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isDefaultBilling"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isDefaultShipping");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isDefaultShipping"));
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
        elemField.setFieldName("isPerson");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isPerson"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("language");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "language"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
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
        elemField.setFieldName("lastName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lastName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("level");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "level"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
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
        elemField.setFieldName("middleName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "middleName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("mobilePhone");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "mobilePhone"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "parent"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("partnerCode");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "partnerCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("permission");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "permission"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
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
        elemField.setFieldName("phoneticName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "phoneticName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("promoCode");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "promoCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("salutation");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "salutation"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipAddress");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipAddress"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipAddress1");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipAddress1"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipAddress2");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipAddress2"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipAddress3");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipAddress3"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipAddressee");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipAddressee"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipAttention");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipAttention"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipCity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipCity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipCountry");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipCountry"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipCountryCode");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipCountryCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipPhone");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipPhone"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipState");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipState"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipZip");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "shipZip"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("subscription");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "subscription"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subscriptionDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "subscriptionDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subscriptionStatus");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "subscriptionStatus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
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
        elemField.setFieldName("title");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "title"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "url"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("zipCode");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "zipCode"));
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

