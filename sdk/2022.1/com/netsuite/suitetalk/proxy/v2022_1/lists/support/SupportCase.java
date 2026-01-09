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
package com.netsuite.suitetalk.proxy.v2022_1.lists.support;

import com.netsuite.suitetalk.proxy.v2022_1.lists.support.EmailEmployeesList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.support.SupportCaseEscalateToList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.support.SupportCaseSolutionsList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.support.SupportCaseTimeItemList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.CustomFieldList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.NullField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.Record;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
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

public class SupportCase
extends Record
implements Serializable {
    private String escalationMessage;
    private Calendar lastReopenedDate;
    private Calendar endDate;
    private String incomingMessage;
    private RecordRef insertSolution;
    private String outgoingMessage;
    private String searchSolution;
    private Boolean emailForm;
    private String newSolutionFromMsg;
    private Boolean internalOnly;
    private RecordRef customForm;
    private String title;
    private String caseNumber;
    private Calendar startDate;
    private Calendar createdDate;
    private Calendar lastModifiedDate;
    private Calendar lastMessageDate;
    private RecordRef company;
    private RecordRef profile;
    private RecordRef subsidiary;
    private RecordRef contact;
    private String email;
    private String phone;
    private RecordRef product;
    private RecordRef module;
    private RecordRef item;
    private RecordRef serialNumber;
    private String inboundEmail;
    private RecordRef issue;
    private RecordRef status;
    private Boolean isInactive;
    private RecordRef priority;
    private RecordRef origin;
    private RecordRef category;
    private RecordRef assigned;
    private Boolean helpDesk;
    private EmailEmployeesList emailEmployeesList;
    private SupportCaseEscalateToList escalateToList;
    private SupportCaseTimeItemList timeItemList;
    private SupportCaseSolutionsList solutionsList;
    private CustomFieldList customFieldList;
    private String internalId;
    private String externalId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(SupportCase.class, true);

    public SupportCase() {
    }

    public SupportCase(NullField nullFieldList, String internalId, String externalId, String escalationMessage, Calendar lastReopenedDate, Calendar endDate, String incomingMessage, RecordRef insertSolution, String outgoingMessage, String searchSolution, Boolean emailForm, String newSolutionFromMsg, Boolean internalOnly, RecordRef customForm, String title, String caseNumber, Calendar startDate, Calendar createdDate, Calendar lastModifiedDate, Calendar lastMessageDate, RecordRef company, RecordRef profile, RecordRef subsidiary, RecordRef contact, String email, String phone, RecordRef product, RecordRef module, RecordRef item, RecordRef serialNumber, String inboundEmail, RecordRef issue, RecordRef status, Boolean isInactive, RecordRef priority, RecordRef origin, RecordRef category, RecordRef assigned, Boolean helpDesk, EmailEmployeesList emailEmployeesList, SupportCaseEscalateToList escalateToList, SupportCaseTimeItemList timeItemList, SupportCaseSolutionsList solutionsList, CustomFieldList customFieldList) {
        super(nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.escalationMessage = escalationMessage;
        this.lastReopenedDate = lastReopenedDate;
        this.endDate = endDate;
        this.incomingMessage = incomingMessage;
        this.insertSolution = insertSolution;
        this.outgoingMessage = outgoingMessage;
        this.searchSolution = searchSolution;
        this.emailForm = emailForm;
        this.newSolutionFromMsg = newSolutionFromMsg;
        this.internalOnly = internalOnly;
        this.customForm = customForm;
        this.title = title;
        this.caseNumber = caseNumber;
        this.startDate = startDate;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.lastMessageDate = lastMessageDate;
        this.company = company;
        this.profile = profile;
        this.subsidiary = subsidiary;
        this.contact = contact;
        this.email = email;
        this.phone = phone;
        this.product = product;
        this.module = module;
        this.item = item;
        this.serialNumber = serialNumber;
        this.inboundEmail = inboundEmail;
        this.issue = issue;
        this.status = status;
        this.isInactive = isInactive;
        this.priority = priority;
        this.origin = origin;
        this.category = category;
        this.assigned = assigned;
        this.helpDesk = helpDesk;
        this.emailEmployeesList = emailEmployeesList;
        this.escalateToList = escalateToList;
        this.timeItemList = timeItemList;
        this.solutionsList = solutionsList;
        this.customFieldList = customFieldList;
    }

    public String getEscalationMessage() {
        return this.escalationMessage;
    }

    public void setEscalationMessage(String escalationMessage) {
        this.escalationMessage = escalationMessage;
    }

    public Calendar getLastReopenedDate() {
        return this.lastReopenedDate;
    }

    public void setLastReopenedDate(Calendar lastReopenedDate) {
        this.lastReopenedDate = lastReopenedDate;
    }

    public Calendar getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Calendar endDate) {
        this.endDate = endDate;
    }

    public String getIncomingMessage() {
        return this.incomingMessage;
    }

    public void setIncomingMessage(String incomingMessage) {
        this.incomingMessage = incomingMessage;
    }

    public RecordRef getInsertSolution() {
        return this.insertSolution;
    }

    public void setInsertSolution(RecordRef insertSolution) {
        this.insertSolution = insertSolution;
    }

    public String getOutgoingMessage() {
        return this.outgoingMessage;
    }

    public void setOutgoingMessage(String outgoingMessage) {
        this.outgoingMessage = outgoingMessage;
    }

    public String getSearchSolution() {
        return this.searchSolution;
    }

    public void setSearchSolution(String searchSolution) {
        this.searchSolution = searchSolution;
    }

    public Boolean getEmailForm() {
        return this.emailForm;
    }

    public void setEmailForm(Boolean emailForm) {
        this.emailForm = emailForm;
    }

    public String getNewSolutionFromMsg() {
        return this.newSolutionFromMsg;
    }

    public void setNewSolutionFromMsg(String newSolutionFromMsg) {
        this.newSolutionFromMsg = newSolutionFromMsg;
    }

    public Boolean getInternalOnly() {
        return this.internalOnly;
    }

    public void setInternalOnly(Boolean internalOnly) {
        this.internalOnly = internalOnly;
    }

    public RecordRef getCustomForm() {
        return this.customForm;
    }

    public void setCustomForm(RecordRef customForm) {
        this.customForm = customForm;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCaseNumber() {
        return this.caseNumber;
    }

    public void setCaseNumber(String caseNumber) {
        this.caseNumber = caseNumber;
    }

    public Calendar getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Calendar startDate) {
        this.startDate = startDate;
    }

    public Calendar getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(Calendar createdDate) {
        this.createdDate = createdDate;
    }

    public Calendar getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    public void setLastModifiedDate(Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public Calendar getLastMessageDate() {
        return this.lastMessageDate;
    }

    public void setLastMessageDate(Calendar lastMessageDate) {
        this.lastMessageDate = lastMessageDate;
    }

    public RecordRef getCompany() {
        return this.company;
    }

    public void setCompany(RecordRef company) {
        this.company = company;
    }

    public RecordRef getProfile() {
        return this.profile;
    }

    public void setProfile(RecordRef profile) {
        this.profile = profile;
    }

    public RecordRef getSubsidiary() {
        return this.subsidiary;
    }

    public void setSubsidiary(RecordRef subsidiary) {
        this.subsidiary = subsidiary;
    }

    public RecordRef getContact() {
        return this.contact;
    }

    public void setContact(RecordRef contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return this.phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public RecordRef getProduct() {
        return this.product;
    }

    public void setProduct(RecordRef product) {
        this.product = product;
    }

    public RecordRef getModule() {
        return this.module;
    }

    public void setModule(RecordRef module) {
        this.module = module;
    }

    public RecordRef getItem() {
        return this.item;
    }

    public void setItem(RecordRef item) {
        this.item = item;
    }

    public RecordRef getSerialNumber() {
        return this.serialNumber;
    }

    public void setSerialNumber(RecordRef serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getInboundEmail() {
        return this.inboundEmail;
    }

    public void setInboundEmail(String inboundEmail) {
        this.inboundEmail = inboundEmail;
    }

    public RecordRef getIssue() {
        return this.issue;
    }

    public void setIssue(RecordRef issue) {
        this.issue = issue;
    }

    public RecordRef getStatus() {
        return this.status;
    }

    public void setStatus(RecordRef status) {
        this.status = status;
    }

    public Boolean getIsInactive() {
        return this.isInactive;
    }

    public void setIsInactive(Boolean isInactive) {
        this.isInactive = isInactive;
    }

    public RecordRef getPriority() {
        return this.priority;
    }

    public void setPriority(RecordRef priority) {
        this.priority = priority;
    }

    public RecordRef getOrigin() {
        return this.origin;
    }

    public void setOrigin(RecordRef origin) {
        this.origin = origin;
    }

    public RecordRef getCategory() {
        return this.category;
    }

    public void setCategory(RecordRef category) {
        this.category = category;
    }

    public RecordRef getAssigned() {
        return this.assigned;
    }

    public void setAssigned(RecordRef assigned) {
        this.assigned = assigned;
    }

    public Boolean getHelpDesk() {
        return this.helpDesk;
    }

    public void setHelpDesk(Boolean helpDesk) {
        this.helpDesk = helpDesk;
    }

    public EmailEmployeesList getEmailEmployeesList() {
        return this.emailEmployeesList;
    }

    public void setEmailEmployeesList(EmailEmployeesList emailEmployeesList) {
        this.emailEmployeesList = emailEmployeesList;
    }

    public SupportCaseEscalateToList getEscalateToList() {
        return this.escalateToList;
    }

    public void setEscalateToList(SupportCaseEscalateToList escalateToList) {
        this.escalateToList = escalateToList;
    }

    public SupportCaseTimeItemList getTimeItemList() {
        return this.timeItemList;
    }

    public void setTimeItemList(SupportCaseTimeItemList timeItemList) {
        this.timeItemList = timeItemList;
    }

    public SupportCaseSolutionsList getSolutionsList() {
        return this.solutionsList;
    }

    public void setSolutionsList(SupportCaseSolutionsList solutionsList) {
        this.solutionsList = solutionsList;
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
        if (!(obj instanceof SupportCase)) {
            return false;
        }
        SupportCase other = (SupportCase)obj;
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
        boolean _equals = super.equals(obj) && (this.escalationMessage == null && other.getEscalationMessage() == null || this.escalationMessage != null && this.escalationMessage.equals(other.getEscalationMessage())) && (this.lastReopenedDate == null && other.getLastReopenedDate() == null || this.lastReopenedDate != null && this.lastReopenedDate.equals(other.getLastReopenedDate())) && (this.endDate == null && other.getEndDate() == null || this.endDate != null && this.endDate.equals(other.getEndDate())) && (this.incomingMessage == null && other.getIncomingMessage() == null || this.incomingMessage != null && this.incomingMessage.equals(other.getIncomingMessage())) && (this.insertSolution == null && other.getInsertSolution() == null || this.insertSolution != null && this.insertSolution.equals(other.getInsertSolution())) && (this.outgoingMessage == null && other.getOutgoingMessage() == null || this.outgoingMessage != null && this.outgoingMessage.equals(other.getOutgoingMessage())) && (this.searchSolution == null && other.getSearchSolution() == null || this.searchSolution != null && this.searchSolution.equals(other.getSearchSolution())) && (this.emailForm == null && other.getEmailForm() == null || this.emailForm != null && this.emailForm.equals(other.getEmailForm())) && (this.newSolutionFromMsg == null && other.getNewSolutionFromMsg() == null || this.newSolutionFromMsg != null && this.newSolutionFromMsg.equals(other.getNewSolutionFromMsg())) && (this.internalOnly == null && other.getInternalOnly() == null || this.internalOnly != null && this.internalOnly.equals(other.getInternalOnly())) && (this.customForm == null && other.getCustomForm() == null || this.customForm != null && this.customForm.equals(other.getCustomForm())) && (this.title == null && other.getTitle() == null || this.title != null && this.title.equals(other.getTitle())) && (this.caseNumber == null && other.getCaseNumber() == null || this.caseNumber != null && this.caseNumber.equals(other.getCaseNumber())) && (this.startDate == null && other.getStartDate() == null || this.startDate != null && this.startDate.equals(other.getStartDate())) && (this.createdDate == null && other.getCreatedDate() == null || this.createdDate != null && this.createdDate.equals(other.getCreatedDate())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && this.lastModifiedDate.equals(other.getLastModifiedDate())) && (this.lastMessageDate == null && other.getLastMessageDate() == null || this.lastMessageDate != null && this.lastMessageDate.equals(other.getLastMessageDate())) && (this.company == null && other.getCompany() == null || this.company != null && this.company.equals(other.getCompany())) && (this.profile == null && other.getProfile() == null || this.profile != null && this.profile.equals(other.getProfile())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && this.subsidiary.equals(other.getSubsidiary())) && (this.contact == null && other.getContact() == null || this.contact != null && this.contact.equals(other.getContact())) && (this.email == null && other.getEmail() == null || this.email != null && this.email.equals(other.getEmail())) && (this.phone == null && other.getPhone() == null || this.phone != null && this.phone.equals(other.getPhone())) && (this.product == null && other.getProduct() == null || this.product != null && this.product.equals(other.getProduct())) && (this.module == null && other.getModule() == null || this.module != null && this.module.equals(other.getModule())) && (this.item == null && other.getItem() == null || this.item != null && this.item.equals(other.getItem())) && (this.serialNumber == null && other.getSerialNumber() == null || this.serialNumber != null && this.serialNumber.equals(other.getSerialNumber())) && (this.inboundEmail == null && other.getInboundEmail() == null || this.inboundEmail != null && this.inboundEmail.equals(other.getInboundEmail())) && (this.issue == null && other.getIssue() == null || this.issue != null && this.issue.equals(other.getIssue())) && (this.status == null && other.getStatus() == null || this.status != null && this.status.equals(other.getStatus())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && this.isInactive.equals(other.getIsInactive())) && (this.priority == null && other.getPriority() == null || this.priority != null && this.priority.equals(other.getPriority())) && (this.origin == null && other.getOrigin() == null || this.origin != null && this.origin.equals(other.getOrigin())) && (this.category == null && other.getCategory() == null || this.category != null && this.category.equals(other.getCategory())) && (this.assigned == null && other.getAssigned() == null || this.assigned != null && this.assigned.equals(other.getAssigned())) && (this.helpDesk == null && other.getHelpDesk() == null || this.helpDesk != null && this.helpDesk.equals(other.getHelpDesk())) && (this.emailEmployeesList == null && other.getEmailEmployeesList() == null || this.emailEmployeesList != null && this.emailEmployeesList.equals(other.getEmailEmployeesList())) && (this.escalateToList == null && other.getEscalateToList() == null || this.escalateToList != null && this.escalateToList.equals(other.getEscalateToList())) && (this.timeItemList == null && other.getTimeItemList() == null || this.timeItemList != null && this.timeItemList.equals(other.getTimeItemList())) && (this.solutionsList == null && other.getSolutionsList() == null || this.solutionsList != null && this.solutionsList.equals(other.getSolutionsList())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
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
        if (this.getEscalationMessage() != null) {
            _hashCode += this.getEscalationMessage().hashCode();
        }
        if (this.getLastReopenedDate() != null) {
            _hashCode += this.getLastReopenedDate().hashCode();
        }
        if (this.getEndDate() != null) {
            _hashCode += this.getEndDate().hashCode();
        }
        if (this.getIncomingMessage() != null) {
            _hashCode += this.getIncomingMessage().hashCode();
        }
        if (this.getInsertSolution() != null) {
            _hashCode += this.getInsertSolution().hashCode();
        }
        if (this.getOutgoingMessage() != null) {
            _hashCode += this.getOutgoingMessage().hashCode();
        }
        if (this.getSearchSolution() != null) {
            _hashCode += this.getSearchSolution().hashCode();
        }
        if (this.getEmailForm() != null) {
            _hashCode += this.getEmailForm().hashCode();
        }
        if (this.getNewSolutionFromMsg() != null) {
            _hashCode += this.getNewSolutionFromMsg().hashCode();
        }
        if (this.getInternalOnly() != null) {
            _hashCode += this.getInternalOnly().hashCode();
        }
        if (this.getCustomForm() != null) {
            _hashCode += this.getCustomForm().hashCode();
        }
        if (this.getTitle() != null) {
            _hashCode += this.getTitle().hashCode();
        }
        if (this.getCaseNumber() != null) {
            _hashCode += this.getCaseNumber().hashCode();
        }
        if (this.getStartDate() != null) {
            _hashCode += this.getStartDate().hashCode();
        }
        if (this.getCreatedDate() != null) {
            _hashCode += this.getCreatedDate().hashCode();
        }
        if (this.getLastModifiedDate() != null) {
            _hashCode += this.getLastModifiedDate().hashCode();
        }
        if (this.getLastMessageDate() != null) {
            _hashCode += this.getLastMessageDate().hashCode();
        }
        if (this.getCompany() != null) {
            _hashCode += this.getCompany().hashCode();
        }
        if (this.getProfile() != null) {
            _hashCode += this.getProfile().hashCode();
        }
        if (this.getSubsidiary() != null) {
            _hashCode += this.getSubsidiary().hashCode();
        }
        if (this.getContact() != null) {
            _hashCode += this.getContact().hashCode();
        }
        if (this.getEmail() != null) {
            _hashCode += this.getEmail().hashCode();
        }
        if (this.getPhone() != null) {
            _hashCode += this.getPhone().hashCode();
        }
        if (this.getProduct() != null) {
            _hashCode += this.getProduct().hashCode();
        }
        if (this.getModule() != null) {
            _hashCode += this.getModule().hashCode();
        }
        if (this.getItem() != null) {
            _hashCode += this.getItem().hashCode();
        }
        if (this.getSerialNumber() != null) {
            _hashCode += this.getSerialNumber().hashCode();
        }
        if (this.getInboundEmail() != null) {
            _hashCode += this.getInboundEmail().hashCode();
        }
        if (this.getIssue() != null) {
            _hashCode += this.getIssue().hashCode();
        }
        if (this.getStatus() != null) {
            _hashCode += this.getStatus().hashCode();
        }
        if (this.getIsInactive() != null) {
            _hashCode += this.getIsInactive().hashCode();
        }
        if (this.getPriority() != null) {
            _hashCode += this.getPriority().hashCode();
        }
        if (this.getOrigin() != null) {
            _hashCode += this.getOrigin().hashCode();
        }
        if (this.getCategory() != null) {
            _hashCode += this.getCategory().hashCode();
        }
        if (this.getAssigned() != null) {
            _hashCode += this.getAssigned().hashCode();
        }
        if (this.getHelpDesk() != null) {
            _hashCode += this.getHelpDesk().hashCode();
        }
        if (this.getEmailEmployeesList() != null) {
            _hashCode += this.getEmailEmployeesList().hashCode();
        }
        if (this.getEscalateToList() != null) {
            _hashCode += this.getEscalateToList().hashCode();
        }
        if (this.getTimeItemList() != null) {
            _hashCode += this.getTimeItemList().hashCode();
        }
        if (this.getSolutionsList() != null) {
            _hashCode += this.getSolutionsList().hashCode();
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
        typeDesc.setXmlType(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "SupportCase"));
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
        elemField.setFieldName("escalationMessage");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "escalationMessage"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastReopenedDate");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "lastReopenedDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "endDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("incomingMessage");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "incomingMessage"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("insertSolution");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "insertSolution"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("outgoingMessage");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "outgoingMessage"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("searchSolution");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "searchSolution"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("emailForm");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "emailForm"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("newSolutionFromMsg");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "newSolutionFromMsg"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("internalOnly");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "internalOnly"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customForm");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "title"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("caseNumber");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "caseNumber"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastMessageDate");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "lastMessageDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("company");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "company"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("profile");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "profile"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("contact");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "contact"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "email"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "phone"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "product"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("module");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "module"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "item"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("serialNumber");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "serialNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("inboundEmail");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "inboundEmail"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("issue");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "issue"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "status"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "priority"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("origin");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "origin"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "category"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("assigned");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "assigned"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("helpDesk");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "helpDesk"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("emailEmployeesList");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "emailEmployeesList"));
        elemField.setXmlType(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "EmailEmployeesList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("escalateToList");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "escalateToList"));
        elemField.setXmlType(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "SupportCaseEscalateToList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("timeItemList");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "timeItemList"));
        elemField.setXmlType(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "SupportCaseTimeItemList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("solutionsList");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "solutionsList"));
        elemField.setXmlType(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "SupportCaseSolutionsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new QName("urn:support_2022_1.lists.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "CustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

