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

public class SupportCaseSearchBasic
extends SearchRecordBasic
implements Serializable {
    private SearchMultiSelectField assigned;
    private SearchBooleanField awaitingReply;
    private SearchStringField caseNumber;
    private SearchMultiSelectField category;
    private SearchDateField closedDate;
    private SearchStringField company;
    private SearchStringField contact;
    private SearchDateField createdDate;
    private SearchStringField email;
    private SearchMultiSelectField escalateTo;
    private SearchMultiSelectField externalId;
    private SearchStringField externalIdString;
    private SearchBooleanField helpDesk;
    private SearchStringField inboundEmail;
    private SearchMultiSelectField internalId;
    private SearchLongField internalIdNumber;
    private SearchBooleanField isInactive;
    private SearchMultiSelectField issue;
    private SearchMultiSelectField item;
    private SearchBooleanField lastMessage;
    private SearchDateField lastModifiedDate;
    private SearchDateField lastReopenedDate;
    private SearchBooleanField locked;
    private SearchStringField message;
    private SearchMultiSelectField messageAuthor;
    private SearchDateField messageDate;
    private SearchBooleanField messageType;
    private SearchMultiSelectField module;
    private SearchLongField number;
    private SearchMultiSelectField origin;
    private SearchMultiSelectField priority;
    private SearchMultiSelectField product;
    private SearchMultiSelectField profile;
    private SearchStringField serialNumber;
    private SearchEnumMultiSelectField stage;
    private SearchDateField startDate;
    private SearchMultiSelectField status;
    private SearchMultiSelectField subsidiary;
    private SearchStringField title;
    private SearchCustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(SupportCaseSearchBasic.class, true);

    public SupportCaseSearchBasic() {
    }

    public SupportCaseSearchBasic(SearchMultiSelectField assigned, SearchBooleanField awaitingReply, SearchStringField caseNumber, SearchMultiSelectField category, SearchDateField closedDate, SearchStringField company, SearchStringField contact, SearchDateField createdDate, SearchStringField email, SearchMultiSelectField escalateTo, SearchMultiSelectField externalId, SearchStringField externalIdString, SearchBooleanField helpDesk, SearchStringField inboundEmail, SearchMultiSelectField internalId, SearchLongField internalIdNumber, SearchBooleanField isInactive, SearchMultiSelectField issue, SearchMultiSelectField item, SearchBooleanField lastMessage, SearchDateField lastModifiedDate, SearchDateField lastReopenedDate, SearchBooleanField locked, SearchStringField message, SearchMultiSelectField messageAuthor, SearchDateField messageDate, SearchBooleanField messageType, SearchMultiSelectField module, SearchLongField number, SearchMultiSelectField origin, SearchMultiSelectField priority, SearchMultiSelectField product, SearchMultiSelectField profile, SearchStringField serialNumber, SearchEnumMultiSelectField stage, SearchDateField startDate, SearchMultiSelectField status, SearchMultiSelectField subsidiary, SearchStringField title, SearchCustomFieldList customFieldList) {
        this.assigned = assigned;
        this.awaitingReply = awaitingReply;
        this.caseNumber = caseNumber;
        this.category = category;
        this.closedDate = closedDate;
        this.company = company;
        this.contact = contact;
        this.createdDate = createdDate;
        this.email = email;
        this.escalateTo = escalateTo;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.helpDesk = helpDesk;
        this.inboundEmail = inboundEmail;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isInactive = isInactive;
        this.issue = issue;
        this.item = item;
        this.lastMessage = lastMessage;
        this.lastModifiedDate = lastModifiedDate;
        this.lastReopenedDate = lastReopenedDate;
        this.locked = locked;
        this.message = message;
        this.messageAuthor = messageAuthor;
        this.messageDate = messageDate;
        this.messageType = messageType;
        this.module = module;
        this.number = number;
        this.origin = origin;
        this.priority = priority;
        this.product = product;
        this.profile = profile;
        this.serialNumber = serialNumber;
        this.stage = stage;
        this.startDate = startDate;
        this.status = status;
        this.subsidiary = subsidiary;
        this.title = title;
        this.customFieldList = customFieldList;
    }

    public SearchMultiSelectField getAssigned() {
        return this.assigned;
    }

    public void setAssigned(SearchMultiSelectField assigned) {
        this.assigned = assigned;
    }

    public SearchBooleanField getAwaitingReply() {
        return this.awaitingReply;
    }

    public void setAwaitingReply(SearchBooleanField awaitingReply) {
        this.awaitingReply = awaitingReply;
    }

    public SearchStringField getCaseNumber() {
        return this.caseNumber;
    }

    public void setCaseNumber(SearchStringField caseNumber) {
        this.caseNumber = caseNumber;
    }

    public SearchMultiSelectField getCategory() {
        return this.category;
    }

    public void setCategory(SearchMultiSelectField category) {
        this.category = category;
    }

    public SearchDateField getClosedDate() {
        return this.closedDate;
    }

    public void setClosedDate(SearchDateField closedDate) {
        this.closedDate = closedDate;
    }

    public SearchStringField getCompany() {
        return this.company;
    }

    public void setCompany(SearchStringField company) {
        this.company = company;
    }

    public SearchStringField getContact() {
        return this.contact;
    }

    public void setContact(SearchStringField contact) {
        this.contact = contact;
    }

    public SearchDateField getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(SearchDateField createdDate) {
        this.createdDate = createdDate;
    }

    public SearchStringField getEmail() {
        return this.email;
    }

    public void setEmail(SearchStringField email) {
        this.email = email;
    }

    public SearchMultiSelectField getEscalateTo() {
        return this.escalateTo;
    }

    public void setEscalateTo(SearchMultiSelectField escalateTo) {
        this.escalateTo = escalateTo;
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

    public SearchBooleanField getHelpDesk() {
        return this.helpDesk;
    }

    public void setHelpDesk(SearchBooleanField helpDesk) {
        this.helpDesk = helpDesk;
    }

    public SearchStringField getInboundEmail() {
        return this.inboundEmail;
    }

    public void setInboundEmail(SearchStringField inboundEmail) {
        this.inboundEmail = inboundEmail;
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

    public SearchBooleanField getIsInactive() {
        return this.isInactive;
    }

    public void setIsInactive(SearchBooleanField isInactive) {
        this.isInactive = isInactive;
    }

    public SearchMultiSelectField getIssue() {
        return this.issue;
    }

    public void setIssue(SearchMultiSelectField issue) {
        this.issue = issue;
    }

    public SearchMultiSelectField getItem() {
        return this.item;
    }

    public void setItem(SearchMultiSelectField item) {
        this.item = item;
    }

    public SearchBooleanField getLastMessage() {
        return this.lastMessage;
    }

    public void setLastMessage(SearchBooleanField lastMessage) {
        this.lastMessage = lastMessage;
    }

    public SearchDateField getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    public void setLastModifiedDate(SearchDateField lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public SearchDateField getLastReopenedDate() {
        return this.lastReopenedDate;
    }

    public void setLastReopenedDate(SearchDateField lastReopenedDate) {
        this.lastReopenedDate = lastReopenedDate;
    }

    public SearchBooleanField getLocked() {
        return this.locked;
    }

    public void setLocked(SearchBooleanField locked) {
        this.locked = locked;
    }

    public SearchStringField getMessage() {
        return this.message;
    }

    public void setMessage(SearchStringField message) {
        this.message = message;
    }

    public SearchMultiSelectField getMessageAuthor() {
        return this.messageAuthor;
    }

    public void setMessageAuthor(SearchMultiSelectField messageAuthor) {
        this.messageAuthor = messageAuthor;
    }

    public SearchDateField getMessageDate() {
        return this.messageDate;
    }

    public void setMessageDate(SearchDateField messageDate) {
        this.messageDate = messageDate;
    }

    public SearchBooleanField getMessageType() {
        return this.messageType;
    }

    public void setMessageType(SearchBooleanField messageType) {
        this.messageType = messageType;
    }

    public SearchMultiSelectField getModule() {
        return this.module;
    }

    public void setModule(SearchMultiSelectField module) {
        this.module = module;
    }

    public SearchLongField getNumber() {
        return this.number;
    }

    public void setNumber(SearchLongField number) {
        this.number = number;
    }

    public SearchMultiSelectField getOrigin() {
        return this.origin;
    }

    public void setOrigin(SearchMultiSelectField origin) {
        this.origin = origin;
    }

    public SearchMultiSelectField getPriority() {
        return this.priority;
    }

    public void setPriority(SearchMultiSelectField priority) {
        this.priority = priority;
    }

    public SearchMultiSelectField getProduct() {
        return this.product;
    }

    public void setProduct(SearchMultiSelectField product) {
        this.product = product;
    }

    public SearchMultiSelectField getProfile() {
        return this.profile;
    }

    public void setProfile(SearchMultiSelectField profile) {
        this.profile = profile;
    }

    public SearchStringField getSerialNumber() {
        return this.serialNumber;
    }

    public void setSerialNumber(SearchStringField serialNumber) {
        this.serialNumber = serialNumber;
    }

    public SearchEnumMultiSelectField getStage() {
        return this.stage;
    }

    public void setStage(SearchEnumMultiSelectField stage) {
        this.stage = stage;
    }

    public SearchDateField getStartDate() {
        return this.startDate;
    }

    public void setStartDate(SearchDateField startDate) {
        this.startDate = startDate;
    }

    public SearchMultiSelectField getStatus() {
        return this.status;
    }

    public void setStatus(SearchMultiSelectField status) {
        this.status = status;
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

    public SearchCustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SupportCaseSearchBasic)) {
            return false;
        }
        SupportCaseSearchBasic other = (SupportCaseSearchBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.assigned == null && other.getAssigned() == null || this.assigned != null && this.assigned.equals(other.getAssigned())) && (this.awaitingReply == null && other.getAwaitingReply() == null || this.awaitingReply != null && this.awaitingReply.equals(other.getAwaitingReply())) && (this.caseNumber == null && other.getCaseNumber() == null || this.caseNumber != null && this.caseNumber.equals(other.getCaseNumber())) && (this.category == null && other.getCategory() == null || this.category != null && this.category.equals(other.getCategory())) && (this.closedDate == null && other.getClosedDate() == null || this.closedDate != null && this.closedDate.equals(other.getClosedDate())) && (this.company == null && other.getCompany() == null || this.company != null && this.company.equals(other.getCompany())) && (this.contact == null && other.getContact() == null || this.contact != null && this.contact.equals(other.getContact())) && (this.createdDate == null && other.getCreatedDate() == null || this.createdDate != null && this.createdDate.equals(other.getCreatedDate())) && (this.email == null && other.getEmail() == null || this.email != null && this.email.equals(other.getEmail())) && (this.escalateTo == null && other.getEscalateTo() == null || this.escalateTo != null && this.escalateTo.equals(other.getEscalateTo())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId())) && (this.externalIdString == null && other.getExternalIdString() == null || this.externalIdString != null && this.externalIdString.equals(other.getExternalIdString())) && (this.helpDesk == null && other.getHelpDesk() == null || this.helpDesk != null && this.helpDesk.equals(other.getHelpDesk())) && (this.inboundEmail == null && other.getInboundEmail() == null || this.inboundEmail != null && this.inboundEmail.equals(other.getInboundEmail())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.internalIdNumber == null && other.getInternalIdNumber() == null || this.internalIdNumber != null && this.internalIdNumber.equals(other.getInternalIdNumber())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && this.isInactive.equals(other.getIsInactive())) && (this.issue == null && other.getIssue() == null || this.issue != null && this.issue.equals(other.getIssue())) && (this.item == null && other.getItem() == null || this.item != null && this.item.equals(other.getItem())) && (this.lastMessage == null && other.getLastMessage() == null || this.lastMessage != null && this.lastMessage.equals(other.getLastMessage())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && this.lastModifiedDate.equals(other.getLastModifiedDate())) && (this.lastReopenedDate == null && other.getLastReopenedDate() == null || this.lastReopenedDate != null && this.lastReopenedDate.equals(other.getLastReopenedDate())) && (this.locked == null && other.getLocked() == null || this.locked != null && this.locked.equals(other.getLocked())) && (this.message == null && other.getMessage() == null || this.message != null && this.message.equals(other.getMessage())) && (this.messageAuthor == null && other.getMessageAuthor() == null || this.messageAuthor != null && this.messageAuthor.equals(other.getMessageAuthor())) && (this.messageDate == null && other.getMessageDate() == null || this.messageDate != null && this.messageDate.equals(other.getMessageDate())) && (this.messageType == null && other.getMessageType() == null || this.messageType != null && this.messageType.equals(other.getMessageType())) && (this.module == null && other.getModule() == null || this.module != null && this.module.equals(other.getModule())) && (this.number == null && other.getNumber() == null || this.number != null && this.number.equals(other.getNumber())) && (this.origin == null && other.getOrigin() == null || this.origin != null && this.origin.equals(other.getOrigin())) && (this.priority == null && other.getPriority() == null || this.priority != null && this.priority.equals(other.getPriority())) && (this.product == null && other.getProduct() == null || this.product != null && this.product.equals(other.getProduct())) && (this.profile == null && other.getProfile() == null || this.profile != null && this.profile.equals(other.getProfile())) && (this.serialNumber == null && other.getSerialNumber() == null || this.serialNumber != null && this.serialNumber.equals(other.getSerialNumber())) && (this.stage == null && other.getStage() == null || this.stage != null && this.stage.equals(other.getStage())) && (this.startDate == null && other.getStartDate() == null || this.startDate != null && this.startDate.equals(other.getStartDate())) && (this.status == null && other.getStatus() == null || this.status != null && this.status.equals(other.getStatus())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && this.subsidiary.equals(other.getSubsidiary())) && (this.title == null && other.getTitle() == null || this.title != null && this.title.equals(other.getTitle())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
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
        if (this.getAssigned() != null) {
            _hashCode += this.getAssigned().hashCode();
        }
        if (this.getAwaitingReply() != null) {
            _hashCode += this.getAwaitingReply().hashCode();
        }
        if (this.getCaseNumber() != null) {
            _hashCode += this.getCaseNumber().hashCode();
        }
        if (this.getCategory() != null) {
            _hashCode += this.getCategory().hashCode();
        }
        if (this.getClosedDate() != null) {
            _hashCode += this.getClosedDate().hashCode();
        }
        if (this.getCompany() != null) {
            _hashCode += this.getCompany().hashCode();
        }
        if (this.getContact() != null) {
            _hashCode += this.getContact().hashCode();
        }
        if (this.getCreatedDate() != null) {
            _hashCode += this.getCreatedDate().hashCode();
        }
        if (this.getEmail() != null) {
            _hashCode += this.getEmail().hashCode();
        }
        if (this.getEscalateTo() != null) {
            _hashCode += this.getEscalateTo().hashCode();
        }
        if (this.getExternalId() != null) {
            _hashCode += this.getExternalId().hashCode();
        }
        if (this.getExternalIdString() != null) {
            _hashCode += this.getExternalIdString().hashCode();
        }
        if (this.getHelpDesk() != null) {
            _hashCode += this.getHelpDesk().hashCode();
        }
        if (this.getInboundEmail() != null) {
            _hashCode += this.getInboundEmail().hashCode();
        }
        if (this.getInternalId() != null) {
            _hashCode += this.getInternalId().hashCode();
        }
        if (this.getInternalIdNumber() != null) {
            _hashCode += this.getInternalIdNumber().hashCode();
        }
        if (this.getIsInactive() != null) {
            _hashCode += this.getIsInactive().hashCode();
        }
        if (this.getIssue() != null) {
            _hashCode += this.getIssue().hashCode();
        }
        if (this.getItem() != null) {
            _hashCode += this.getItem().hashCode();
        }
        if (this.getLastMessage() != null) {
            _hashCode += this.getLastMessage().hashCode();
        }
        if (this.getLastModifiedDate() != null) {
            _hashCode += this.getLastModifiedDate().hashCode();
        }
        if (this.getLastReopenedDate() != null) {
            _hashCode += this.getLastReopenedDate().hashCode();
        }
        if (this.getLocked() != null) {
            _hashCode += this.getLocked().hashCode();
        }
        if (this.getMessage() != null) {
            _hashCode += this.getMessage().hashCode();
        }
        if (this.getMessageAuthor() != null) {
            _hashCode += this.getMessageAuthor().hashCode();
        }
        if (this.getMessageDate() != null) {
            _hashCode += this.getMessageDate().hashCode();
        }
        if (this.getMessageType() != null) {
            _hashCode += this.getMessageType().hashCode();
        }
        if (this.getModule() != null) {
            _hashCode += this.getModule().hashCode();
        }
        if (this.getNumber() != null) {
            _hashCode += this.getNumber().hashCode();
        }
        if (this.getOrigin() != null) {
            _hashCode += this.getOrigin().hashCode();
        }
        if (this.getPriority() != null) {
            _hashCode += this.getPriority().hashCode();
        }
        if (this.getProduct() != null) {
            _hashCode += this.getProduct().hashCode();
        }
        if (this.getProfile() != null) {
            _hashCode += this.getProfile().hashCode();
        }
        if (this.getSerialNumber() != null) {
            _hashCode += this.getSerialNumber().hashCode();
        }
        if (this.getStage() != null) {
            _hashCode += this.getStage().hashCode();
        }
        if (this.getStartDate() != null) {
            _hashCode += this.getStartDate().hashCode();
        }
        if (this.getStatus() != null) {
            _hashCode += this.getStatus().hashCode();
        }
        if (this.getSubsidiary() != null) {
            _hashCode += this.getSubsidiary().hashCode();
        }
        if (this.getTitle() != null) {
            _hashCode += this.getTitle().hashCode();
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "SupportCaseSearchBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("assigned");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "assigned"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("awaitingReply");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "awaitingReply"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("caseNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "caseNumber"));
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
        elemField.setFieldName("closedDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "closedDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("company");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "company"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("contact");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "contact"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
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
        elemField.setFieldName("escalateTo");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "escalateTo"));
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
        elemField.setFieldName("helpDesk");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "helpDesk"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("inboundEmail");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "inboundEmail"));
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
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("issue");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "issue"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("lastMessage");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lastMessage"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("lastReopenedDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lastReopenedDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locked");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locked"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "message"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("messageAuthor");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "messageAuthor"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("messageDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "messageDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("messageType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "messageType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("module");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "module"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("number");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "number"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("origin");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "origin"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "priority"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "product"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("profile");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "profile"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("serialNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "serialNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("stage");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "stage"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "status"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
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
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchCustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

