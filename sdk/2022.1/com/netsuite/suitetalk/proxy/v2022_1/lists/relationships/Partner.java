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
package com.netsuite.suitetalk.proxy.v2022_1.lists.relationships;

import com.netsuite.suitetalk.proxy.v2022_1.lists.relationships.CategoryList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.relationships.ContactAccessRolesList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.relationships.PartnerAddressbookList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.relationships.PartnerPromoCodeList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.relationships.PartnerTaxRegistrationList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.relationships.SubscriptionsList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.relationships.types.EmailPreference;
import com.netsuite.suitetalk.proxy.v2022_1.lists.relationships.types.TaxFractionUnit;
import com.netsuite.suitetalk.proxy.v2022_1.lists.relationships.types.TaxRounding;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.types.GlobalSubscriptionStatus;
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

public class Partner
extends Record
implements Serializable {
    private RecordRef customForm;
    private String entityId;
    private String altName;
    private String partnerCode;
    private Boolean isPerson;
    private String phoneticName;
    private String salutation;
    private String firstName;
    private String middleName;
    private String lastName;
    private String companyName;
    private RecordRef parent;
    private String phone;
    private String fax;
    private String email;
    private String url;
    private String defaultAddress;
    private Boolean isInactive;
    private Calendar lastModifiedDate;
    private Calendar dateCreated;
    private PartnerTaxRegistrationList taxRegistrationList;
    private GlobalSubscriptionStatus globalSubscriptionStatus;
    private String referringUrl;
    private RecordRefList roleList;
    private CategoryList categoryList;
    private String title;
    private String printOnCheckAs;
    private String taxIdNum;
    private String vatRegNumber;
    private String comments;
    private String bcn;
    private RecordRef image;
    private TaxFractionUnit taxFractionUnit;
    private EmailPreference emailPreference;
    private RecordRef defaultTaxReg;
    private TaxRounding taxRounding;
    private RecordRef department;
    private RecordRef location;
    private RecordRef _class;
    private RecordRef subsidiary;
    private String homePhone;
    private String mobilePhone;
    private String altEmail;
    private Boolean giveAccess;
    private RecordRef accessRole;
    private Boolean sendEmail;
    private String password;
    private String password2;
    private Boolean requirePwdChange;
    private Boolean subPartnerLogin;
    private String loginAs;
    private Boolean eligibleForCommission;
    private ContactAccessRolesList contactRolesList;
    private PartnerPromoCodeList promoCodeList;
    private PartnerAddressbookList addressbookList;
    private SubscriptionsList subscriptionsList;
    private CustomFieldList customFieldList;
    private String internalId;
    private String externalId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(Partner.class, true);

    public Partner() {
    }

    public Partner(NullField nullFieldList, String internalId, String externalId, RecordRef customForm, String entityId, String altName, String partnerCode, Boolean isPerson, String phoneticName, String salutation, String firstName, String middleName, String lastName, String companyName, RecordRef parent, String phone, String fax, String email, String url, String defaultAddress, Boolean isInactive, Calendar lastModifiedDate, Calendar dateCreated, PartnerTaxRegistrationList taxRegistrationList, GlobalSubscriptionStatus globalSubscriptionStatus, String referringUrl, RecordRefList roleList, CategoryList categoryList, String title, String printOnCheckAs, String taxIdNum, String vatRegNumber, String comments, String bcn, RecordRef image, TaxFractionUnit taxFractionUnit, EmailPreference emailPreference, RecordRef defaultTaxReg, TaxRounding taxRounding, RecordRef department, RecordRef location, RecordRef _class, RecordRef subsidiary, String homePhone, String mobilePhone, String altEmail, Boolean giveAccess, RecordRef accessRole, Boolean sendEmail, String password, String password2, Boolean requirePwdChange, Boolean subPartnerLogin, String loginAs, Boolean eligibleForCommission, ContactAccessRolesList contactRolesList, PartnerPromoCodeList promoCodeList, PartnerAddressbookList addressbookList, SubscriptionsList subscriptionsList, CustomFieldList customFieldList) {
        super(nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.customForm = customForm;
        this.entityId = entityId;
        this.altName = altName;
        this.partnerCode = partnerCode;
        this.isPerson = isPerson;
        this.phoneticName = phoneticName;
        this.salutation = salutation;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.companyName = companyName;
        this.parent = parent;
        this.phone = phone;
        this.fax = fax;
        this.email = email;
        this.url = url;
        this.defaultAddress = defaultAddress;
        this.isInactive = isInactive;
        this.lastModifiedDate = lastModifiedDate;
        this.dateCreated = dateCreated;
        this.taxRegistrationList = taxRegistrationList;
        this.globalSubscriptionStatus = globalSubscriptionStatus;
        this.referringUrl = referringUrl;
        this.roleList = roleList;
        this.categoryList = categoryList;
        this.title = title;
        this.printOnCheckAs = printOnCheckAs;
        this.taxIdNum = taxIdNum;
        this.vatRegNumber = vatRegNumber;
        this.comments = comments;
        this.bcn = bcn;
        this.image = image;
        this.taxFractionUnit = taxFractionUnit;
        this.emailPreference = emailPreference;
        this.defaultTaxReg = defaultTaxReg;
        this.taxRounding = taxRounding;
        this.department = department;
        this.location = location;
        this._class = _class;
        this.subsidiary = subsidiary;
        this.homePhone = homePhone;
        this.mobilePhone = mobilePhone;
        this.altEmail = altEmail;
        this.giveAccess = giveAccess;
        this.accessRole = accessRole;
        this.sendEmail = sendEmail;
        this.password = password;
        this.password2 = password2;
        this.requirePwdChange = requirePwdChange;
        this.subPartnerLogin = subPartnerLogin;
        this.loginAs = loginAs;
        this.eligibleForCommission = eligibleForCommission;
        this.contactRolesList = contactRolesList;
        this.promoCodeList = promoCodeList;
        this.addressbookList = addressbookList;
        this.subscriptionsList = subscriptionsList;
        this.customFieldList = customFieldList;
    }

    public RecordRef getCustomForm() {
        return this.customForm;
    }

    public void setCustomForm(RecordRef customForm) {
        this.customForm = customForm;
    }

    public String getEntityId() {
        return this.entityId;
    }

    public void setEntityId(String entityId) {
        this.entityId = entityId;
    }

    public String getAltName() {
        return this.altName;
    }

    public void setAltName(String altName) {
        this.altName = altName;
    }

    public String getPartnerCode() {
        return this.partnerCode;
    }

    public void setPartnerCode(String partnerCode) {
        this.partnerCode = partnerCode;
    }

    public Boolean getIsPerson() {
        return this.isPerson;
    }

    public void setIsPerson(Boolean isPerson) {
        this.isPerson = isPerson;
    }

    public String getPhoneticName() {
        return this.phoneticName;
    }

    public void setPhoneticName(String phoneticName) {
        this.phoneticName = phoneticName;
    }

    public String getSalutation() {
        return this.salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return this.middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompanyName() {
        return this.companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public RecordRef getParent() {
        return this.parent;
    }

    public void setParent(RecordRef parent) {
        this.parent = parent;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getFax() {
        return this.fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDefaultAddress() {
        return this.defaultAddress;
    }

    public void setDefaultAddress(String defaultAddress) {
        this.defaultAddress = defaultAddress;
    }

    public Boolean getIsInactive() {
        return this.isInactive;
    }

    public void setIsInactive(Boolean isInactive) {
        this.isInactive = isInactive;
    }

    public Calendar getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    public void setLastModifiedDate(Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public Calendar getDateCreated() {
        return this.dateCreated;
    }

    public void setDateCreated(Calendar dateCreated) {
        this.dateCreated = dateCreated;
    }

    public PartnerTaxRegistrationList getTaxRegistrationList() {
        return this.taxRegistrationList;
    }

    public void setTaxRegistrationList(PartnerTaxRegistrationList taxRegistrationList) {
        this.taxRegistrationList = taxRegistrationList;
    }

    public GlobalSubscriptionStatus getGlobalSubscriptionStatus() {
        return this.globalSubscriptionStatus;
    }

    public void setGlobalSubscriptionStatus(GlobalSubscriptionStatus globalSubscriptionStatus) {
        this.globalSubscriptionStatus = globalSubscriptionStatus;
    }

    public String getReferringUrl() {
        return this.referringUrl;
    }

    public void setReferringUrl(String referringUrl) {
        this.referringUrl = referringUrl;
    }

    public RecordRefList getRoleList() {
        return this.roleList;
    }

    public void setRoleList(RecordRefList roleList) {
        this.roleList = roleList;
    }

    public CategoryList getCategoryList() {
        return this.categoryList;
    }

    public void setCategoryList(CategoryList categoryList) {
        this.categoryList = categoryList;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrintOnCheckAs() {
        return this.printOnCheckAs;
    }

    public void setPrintOnCheckAs(String printOnCheckAs) {
        this.printOnCheckAs = printOnCheckAs;
    }

    public String getTaxIdNum() {
        return this.taxIdNum;
    }

    public void setTaxIdNum(String taxIdNum) {
        this.taxIdNum = taxIdNum;
    }

    public String getVatRegNumber() {
        return this.vatRegNumber;
    }

    public void setVatRegNumber(String vatRegNumber) {
        this.vatRegNumber = vatRegNumber;
    }

    public String getComments() {
        return this.comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getBcn() {
        return this.bcn;
    }

    public void setBcn(String bcn) {
        this.bcn = bcn;
    }

    public RecordRef getImage() {
        return this.image;
    }

    public void setImage(RecordRef image) {
        this.image = image;
    }

    public TaxFractionUnit getTaxFractionUnit() {
        return this.taxFractionUnit;
    }

    public void setTaxFractionUnit(TaxFractionUnit taxFractionUnit) {
        this.taxFractionUnit = taxFractionUnit;
    }

    public EmailPreference getEmailPreference() {
        return this.emailPreference;
    }

    public void setEmailPreference(EmailPreference emailPreference) {
        this.emailPreference = emailPreference;
    }

    public RecordRef getDefaultTaxReg() {
        return this.defaultTaxReg;
    }

    public void setDefaultTaxReg(RecordRef defaultTaxReg) {
        this.defaultTaxReg = defaultTaxReg;
    }

    public TaxRounding getTaxRounding() {
        return this.taxRounding;
    }

    public void setTaxRounding(TaxRounding taxRounding) {
        this.taxRounding = taxRounding;
    }

    public RecordRef getDepartment() {
        return this.department;
    }

    public void setDepartment(RecordRef department) {
        this.department = department;
    }

    public RecordRef getLocation() {
        return this.location;
    }

    public void setLocation(RecordRef location) {
        this.location = location;
    }

    public RecordRef get_class() {
        return this._class;
    }

    public void set_class(RecordRef _class) {
        this._class = _class;
    }

    public RecordRef getSubsidiary() {
        return this.subsidiary;
    }

    public void setSubsidiary(RecordRef subsidiary) {
        this.subsidiary = subsidiary;
    }

    public String getHomePhone() {
        return this.homePhone;
    }

    public void setHomePhone(String homePhone) {
        this.homePhone = homePhone;
    }

    public String getMobilePhone() {
        return this.mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
    }

    public String getAltEmail() {
        return this.altEmail;
    }

    public void setAltEmail(String altEmail) {
        this.altEmail = altEmail;
    }

    public Boolean getGiveAccess() {
        return this.giveAccess;
    }

    public void setGiveAccess(Boolean giveAccess) {
        this.giveAccess = giveAccess;
    }

    public RecordRef getAccessRole() {
        return this.accessRole;
    }

    public void setAccessRole(RecordRef accessRole) {
        this.accessRole = accessRole;
    }

    public Boolean getSendEmail() {
        return this.sendEmail;
    }

    public void setSendEmail(Boolean sendEmail) {
        this.sendEmail = sendEmail;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword2() {
        return this.password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    public Boolean getRequirePwdChange() {
        return this.requirePwdChange;
    }

    public void setRequirePwdChange(Boolean requirePwdChange) {
        this.requirePwdChange = requirePwdChange;
    }

    public Boolean getSubPartnerLogin() {
        return this.subPartnerLogin;
    }

    public void setSubPartnerLogin(Boolean subPartnerLogin) {
        this.subPartnerLogin = subPartnerLogin;
    }

    public String getLoginAs() {
        return this.loginAs;
    }

    public void setLoginAs(String loginAs) {
        this.loginAs = loginAs;
    }

    public Boolean getEligibleForCommission() {
        return this.eligibleForCommission;
    }

    public void setEligibleForCommission(Boolean eligibleForCommission) {
        this.eligibleForCommission = eligibleForCommission;
    }

    public ContactAccessRolesList getContactRolesList() {
        return this.contactRolesList;
    }

    public void setContactRolesList(ContactAccessRolesList contactRolesList) {
        this.contactRolesList = contactRolesList;
    }

    public PartnerPromoCodeList getPromoCodeList() {
        return this.promoCodeList;
    }

    public void setPromoCodeList(PartnerPromoCodeList promoCodeList) {
        this.promoCodeList = promoCodeList;
    }

    public PartnerAddressbookList getAddressbookList() {
        return this.addressbookList;
    }

    public void setAddressbookList(PartnerAddressbookList addressbookList) {
        this.addressbookList = addressbookList;
    }

    public SubscriptionsList getSubscriptionsList() {
        return this.subscriptionsList;
    }

    public void setSubscriptionsList(SubscriptionsList subscriptionsList) {
        this.subscriptionsList = subscriptionsList;
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
        if (!(obj instanceof Partner)) {
            return false;
        }
        Partner other = (Partner)obj;
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
        boolean _equals = super.equals(obj) && (this.customForm == null && other.getCustomForm() == null || this.customForm != null && this.customForm.equals(other.getCustomForm())) && (this.entityId == null && other.getEntityId() == null || this.entityId != null && this.entityId.equals(other.getEntityId())) && (this.altName == null && other.getAltName() == null || this.altName != null && this.altName.equals(other.getAltName())) && (this.partnerCode == null && other.getPartnerCode() == null || this.partnerCode != null && this.partnerCode.equals(other.getPartnerCode())) && (this.isPerson == null && other.getIsPerson() == null || this.isPerson != null && this.isPerson.equals(other.getIsPerson())) && (this.phoneticName == null && other.getPhoneticName() == null || this.phoneticName != null && this.phoneticName.equals(other.getPhoneticName())) && (this.salutation == null && other.getSalutation() == null || this.salutation != null && this.salutation.equals(other.getSalutation())) && (this.firstName == null && other.getFirstName() == null || this.firstName != null && this.firstName.equals(other.getFirstName())) && (this.middleName == null && other.getMiddleName() == null || this.middleName != null && this.middleName.equals(other.getMiddleName())) && (this.lastName == null && other.getLastName() == null || this.lastName != null && this.lastName.equals(other.getLastName())) && (this.companyName == null && other.getCompanyName() == null || this.companyName != null && this.companyName.equals(other.getCompanyName())) && (this.parent == null && other.getParent() == null || this.parent != null && this.parent.equals(other.getParent())) && (this.phone == null && other.getPhone() == null || this.phone != null && this.phone.equals(other.getPhone())) && (this.fax == null && other.getFax() == null || this.fax != null && this.fax.equals(other.getFax())) && (this.email == null && other.getEmail() == null || this.email != null && this.email.equals(other.getEmail())) && (this.url == null && other.getUrl() == null || this.url != null && this.url.equals(other.getUrl())) && (this.defaultAddress == null && other.getDefaultAddress() == null || this.defaultAddress != null && this.defaultAddress.equals(other.getDefaultAddress())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && this.isInactive.equals(other.getIsInactive())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && this.lastModifiedDate.equals(other.getLastModifiedDate())) && (this.dateCreated == null && other.getDateCreated() == null || this.dateCreated != null && this.dateCreated.equals(other.getDateCreated())) && (this.taxRegistrationList == null && other.getTaxRegistrationList() == null || this.taxRegistrationList != null && this.taxRegistrationList.equals(other.getTaxRegistrationList())) && (this.globalSubscriptionStatus == null && other.getGlobalSubscriptionStatus() == null || this.globalSubscriptionStatus != null && this.globalSubscriptionStatus.equals(other.getGlobalSubscriptionStatus())) && (this.referringUrl == null && other.getReferringUrl() == null || this.referringUrl != null && this.referringUrl.equals(other.getReferringUrl())) && (this.roleList == null && other.getRoleList() == null || this.roleList != null && this.roleList.equals(other.getRoleList())) && (this.categoryList == null && other.getCategoryList() == null || this.categoryList != null && this.categoryList.equals(other.getCategoryList())) && (this.title == null && other.getTitle() == null || this.title != null && this.title.equals(other.getTitle())) && (this.printOnCheckAs == null && other.getPrintOnCheckAs() == null || this.printOnCheckAs != null && this.printOnCheckAs.equals(other.getPrintOnCheckAs())) && (this.taxIdNum == null && other.getTaxIdNum() == null || this.taxIdNum != null && this.taxIdNum.equals(other.getTaxIdNum())) && (this.vatRegNumber == null && other.getVatRegNumber() == null || this.vatRegNumber != null && this.vatRegNumber.equals(other.getVatRegNumber())) && (this.comments == null && other.getComments() == null || this.comments != null && this.comments.equals(other.getComments())) && (this.bcn == null && other.getBcn() == null || this.bcn != null && this.bcn.equals(other.getBcn())) && (this.image == null && other.getImage() == null || this.image != null && this.image.equals(other.getImage())) && (this.taxFractionUnit == null && other.getTaxFractionUnit() == null || this.taxFractionUnit != null && this.taxFractionUnit.equals(other.getTaxFractionUnit())) && (this.emailPreference == null && other.getEmailPreference() == null || this.emailPreference != null && this.emailPreference.equals(other.getEmailPreference())) && (this.defaultTaxReg == null && other.getDefaultTaxReg() == null || this.defaultTaxReg != null && this.defaultTaxReg.equals(other.getDefaultTaxReg())) && (this.taxRounding == null && other.getTaxRounding() == null || this.taxRounding != null && this.taxRounding.equals(other.getTaxRounding())) && (this.department == null && other.getDepartment() == null || this.department != null && this.department.equals(other.getDepartment())) && (this.location == null && other.getLocation() == null || this.location != null && this.location.equals(other.getLocation())) && (this._class == null && other.get_class() == null || this._class != null && this._class.equals(other.get_class())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && this.subsidiary.equals(other.getSubsidiary())) && (this.homePhone == null && other.getHomePhone() == null || this.homePhone != null && this.homePhone.equals(other.getHomePhone())) && (this.mobilePhone == null && other.getMobilePhone() == null || this.mobilePhone != null && this.mobilePhone.equals(other.getMobilePhone())) && (this.altEmail == null && other.getAltEmail() == null || this.altEmail != null && this.altEmail.equals(other.getAltEmail())) && (this.giveAccess == null && other.getGiveAccess() == null || this.giveAccess != null && this.giveAccess.equals(other.getGiveAccess())) && (this.accessRole == null && other.getAccessRole() == null || this.accessRole != null && this.accessRole.equals(other.getAccessRole())) && (this.sendEmail == null && other.getSendEmail() == null || this.sendEmail != null && this.sendEmail.equals(other.getSendEmail())) && (this.password == null && other.getPassword() == null || this.password != null && this.password.equals(other.getPassword())) && (this.password2 == null && other.getPassword2() == null || this.password2 != null && this.password2.equals(other.getPassword2())) && (this.requirePwdChange == null && other.getRequirePwdChange() == null || this.requirePwdChange != null && this.requirePwdChange.equals(other.getRequirePwdChange())) && (this.subPartnerLogin == null && other.getSubPartnerLogin() == null || this.subPartnerLogin != null && this.subPartnerLogin.equals(other.getSubPartnerLogin())) && (this.loginAs == null && other.getLoginAs() == null || this.loginAs != null && this.loginAs.equals(other.getLoginAs())) && (this.eligibleForCommission == null && other.getEligibleForCommission() == null || this.eligibleForCommission != null && this.eligibleForCommission.equals(other.getEligibleForCommission())) && (this.contactRolesList == null && other.getContactRolesList() == null || this.contactRolesList != null && this.contactRolesList.equals(other.getContactRolesList())) && (this.promoCodeList == null && other.getPromoCodeList() == null || this.promoCodeList != null && this.promoCodeList.equals(other.getPromoCodeList())) && (this.addressbookList == null && other.getAddressbookList() == null || this.addressbookList != null && this.addressbookList.equals(other.getAddressbookList())) && (this.subscriptionsList == null && other.getSubscriptionsList() == null || this.subscriptionsList != null && this.subscriptionsList.equals(other.getSubscriptionsList())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
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
        if (this.getCustomForm() != null) {
            _hashCode += this.getCustomForm().hashCode();
        }
        if (this.getEntityId() != null) {
            _hashCode += this.getEntityId().hashCode();
        }
        if (this.getAltName() != null) {
            _hashCode += this.getAltName().hashCode();
        }
        if (this.getPartnerCode() != null) {
            _hashCode += this.getPartnerCode().hashCode();
        }
        if (this.getIsPerson() != null) {
            _hashCode += this.getIsPerson().hashCode();
        }
        if (this.getPhoneticName() != null) {
            _hashCode += this.getPhoneticName().hashCode();
        }
        if (this.getSalutation() != null) {
            _hashCode += this.getSalutation().hashCode();
        }
        if (this.getFirstName() != null) {
            _hashCode += this.getFirstName().hashCode();
        }
        if (this.getMiddleName() != null) {
            _hashCode += this.getMiddleName().hashCode();
        }
        if (this.getLastName() != null) {
            _hashCode += this.getLastName().hashCode();
        }
        if (this.getCompanyName() != null) {
            _hashCode += this.getCompanyName().hashCode();
        }
        if (this.getParent() != null) {
            _hashCode += this.getParent().hashCode();
        }
        if (this.getPhone() != null) {
            _hashCode += this.getPhone().hashCode();
        }
        if (this.getFax() != null) {
            _hashCode += this.getFax().hashCode();
        }
        if (this.getEmail() != null) {
            _hashCode += this.getEmail().hashCode();
        }
        if (this.getUrl() != null) {
            _hashCode += this.getUrl().hashCode();
        }
        if (this.getDefaultAddress() != null) {
            _hashCode += this.getDefaultAddress().hashCode();
        }
        if (this.getIsInactive() != null) {
            _hashCode += this.getIsInactive().hashCode();
        }
        if (this.getLastModifiedDate() != null) {
            _hashCode += this.getLastModifiedDate().hashCode();
        }
        if (this.getDateCreated() != null) {
            _hashCode += this.getDateCreated().hashCode();
        }
        if (this.getTaxRegistrationList() != null) {
            _hashCode += this.getTaxRegistrationList().hashCode();
        }
        if (this.getGlobalSubscriptionStatus() != null) {
            _hashCode += this.getGlobalSubscriptionStatus().hashCode();
        }
        if (this.getReferringUrl() != null) {
            _hashCode += this.getReferringUrl().hashCode();
        }
        if (this.getRoleList() != null) {
            _hashCode += this.getRoleList().hashCode();
        }
        if (this.getCategoryList() != null) {
            _hashCode += this.getCategoryList().hashCode();
        }
        if (this.getTitle() != null) {
            _hashCode += this.getTitle().hashCode();
        }
        if (this.getPrintOnCheckAs() != null) {
            _hashCode += this.getPrintOnCheckAs().hashCode();
        }
        if (this.getTaxIdNum() != null) {
            _hashCode += this.getTaxIdNum().hashCode();
        }
        if (this.getVatRegNumber() != null) {
            _hashCode += this.getVatRegNumber().hashCode();
        }
        if (this.getComments() != null) {
            _hashCode += this.getComments().hashCode();
        }
        if (this.getBcn() != null) {
            _hashCode += this.getBcn().hashCode();
        }
        if (this.getImage() != null) {
            _hashCode += this.getImage().hashCode();
        }
        if (this.getTaxFractionUnit() != null) {
            _hashCode += this.getTaxFractionUnit().hashCode();
        }
        if (this.getEmailPreference() != null) {
            _hashCode += this.getEmailPreference().hashCode();
        }
        if (this.getDefaultTaxReg() != null) {
            _hashCode += this.getDefaultTaxReg().hashCode();
        }
        if (this.getTaxRounding() != null) {
            _hashCode += this.getTaxRounding().hashCode();
        }
        if (this.getDepartment() != null) {
            _hashCode += this.getDepartment().hashCode();
        }
        if (this.getLocation() != null) {
            _hashCode += this.getLocation().hashCode();
        }
        if (this.get_class() != null) {
            _hashCode += this.get_class().hashCode();
        }
        if (this.getSubsidiary() != null) {
            _hashCode += this.getSubsidiary().hashCode();
        }
        if (this.getHomePhone() != null) {
            _hashCode += this.getHomePhone().hashCode();
        }
        if (this.getMobilePhone() != null) {
            _hashCode += this.getMobilePhone().hashCode();
        }
        if (this.getAltEmail() != null) {
            _hashCode += this.getAltEmail().hashCode();
        }
        if (this.getGiveAccess() != null) {
            _hashCode += this.getGiveAccess().hashCode();
        }
        if (this.getAccessRole() != null) {
            _hashCode += this.getAccessRole().hashCode();
        }
        if (this.getSendEmail() != null) {
            _hashCode += this.getSendEmail().hashCode();
        }
        if (this.getPassword() != null) {
            _hashCode += this.getPassword().hashCode();
        }
        if (this.getPassword2() != null) {
            _hashCode += this.getPassword2().hashCode();
        }
        if (this.getRequirePwdChange() != null) {
            _hashCode += this.getRequirePwdChange().hashCode();
        }
        if (this.getSubPartnerLogin() != null) {
            _hashCode += this.getSubPartnerLogin().hashCode();
        }
        if (this.getLoginAs() != null) {
            _hashCode += this.getLoginAs().hashCode();
        }
        if (this.getEligibleForCommission() != null) {
            _hashCode += this.getEligibleForCommission().hashCode();
        }
        if (this.getContactRolesList() != null) {
            _hashCode += this.getContactRolesList().hashCode();
        }
        if (this.getPromoCodeList() != null) {
            _hashCode += this.getPromoCodeList().hashCode();
        }
        if (this.getAddressbookList() != null) {
            _hashCode += this.getAddressbookList().hashCode();
        }
        if (this.getSubscriptionsList() != null) {
            _hashCode += this.getSubscriptionsList().hashCode();
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
        typeDesc.setXmlType(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "Partner"));
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
        elemField.setFieldName("customForm");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("entityId");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "entityId"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("altName");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "altName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("partnerCode");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "partnerCode"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isPerson");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "isPerson"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("phoneticName");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "phoneticName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("salutation");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "salutation"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("firstName");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "firstName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("middleName");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "middleName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastName");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "lastName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("companyName");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "companyName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "parent"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "phone"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fax");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "fax"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "email"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("url");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "url"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("defaultAddress");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "defaultAddress"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("dateCreated");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "dateCreated"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxRegistrationList");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "taxRegistrationList"));
        elemField.setXmlType(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "PartnerTaxRegistrationList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("globalSubscriptionStatus");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "globalSubscriptionStatus"));
        elemField.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "GlobalSubscriptionStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("referringUrl");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "referringUrl"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("roleList");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "roleList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRefList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("categoryList");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "categoryList"));
        elemField.setXmlType(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "CategoryList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "title"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("printOnCheckAs");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "printOnCheckAs"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxIdNum");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "taxIdNum"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vatRegNumber");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "vatRegNumber"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "comments"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("bcn");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "bcn"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("image");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "image"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxFractionUnit");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "taxFractionUnit"));
        elemField.setXmlType(new QName("urn:types.relationships_2022_1.lists.webservices.netsuite.com", "TaxFractionUnit"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("emailPreference");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "emailPreference"));
        elemField.setXmlType(new QName("urn:types.relationships_2022_1.lists.webservices.netsuite.com", "EmailPreference"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("defaultTaxReg");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "defaultTaxReg"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxRounding");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "taxRounding"));
        elemField.setXmlType(new QName("urn:types.relationships_2022_1.lists.webservices.netsuite.com", "TaxRounding"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "department"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "location"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "class"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("homePhone");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "homePhone"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("mobilePhone");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "mobilePhone"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("altEmail");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "altEmail"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("giveAccess");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "giveAccess"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("accessRole");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "accessRole"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("sendEmail");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "sendEmail"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("password");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "password"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("password2");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "password2"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("requirePwdChange");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "requirePwdChange"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subPartnerLogin");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "subPartnerLogin"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("loginAs");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "loginAs"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("eligibleForCommission");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "eligibleForCommission"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("contactRolesList");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "contactRolesList"));
        elemField.setXmlType(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "ContactAccessRolesList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("promoCodeList");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "promoCodeList"));
        elemField.setXmlType(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "PartnerPromoCodeList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("addressbookList");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "addressbookList"));
        elemField.setXmlType(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "PartnerAddressbookList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subscriptionsList");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "subscriptionsList"));
        elemField.setXmlType(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "SubscriptionsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "CustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

