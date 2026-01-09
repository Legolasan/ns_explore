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

public class SupportCaseSearchRowBasic
extends SearchRowBasic
implements Serializable {
    private SearchColumnSelectField[] assigned;
    private SearchColumnBooleanField[] awaitingReply;
    private SearchColumnStringField[] caseNumber;
    private SearchColumnSelectField[] category;
    private SearchColumnSelectField[] company;
    private SearchColumnSelectField[] contact;
    private SearchColumnDateField[] createdDate;
    private SearchColumnEnumSelectField[] customerStage;
    private SearchColumnStringField[] email;
    private SearchColumnDateField[] endDate;
    private SearchColumnSelectField[] escalatee;
    private SearchColumnSelectField[] externalId;
    private SearchColumnBooleanField[] helpDesk;
    private SearchColumnStringField[] inboundEmail;
    private SearchColumnSelectField[] internalId;
    private SearchColumnBooleanField[] isInactive;
    private SearchColumnSelectField[] issue;
    private SearchColumnStringField[] issueNumber;
    private SearchColumnSelectField[] item;
    private SearchColumnDateField[] lastMessageDate;
    private SearchColumnDateField[] lastModifiedDate;
    private SearchColumnDateField[] lastReopenedDate;
    private SearchColumnBooleanField[] locked;
    private SearchColumnSelectField[] module;
    private SearchColumnSelectField[] origin;
    private SearchColumnSelectField[] priority;
    private SearchColumnSelectField[] product;
    private SearchColumnSelectField[] profile;
    private SearchColumnStringField[] serialNumber;
    private SearchColumnEnumSelectField[] stage;
    private SearchColumnDateField[] startDate;
    private SearchColumnSelectField[] status;
    private SearchColumnSelectField[] subsidiary;
    private SearchColumnStringField[] title;
    private SearchColumnCustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(SupportCaseSearchRowBasic.class, true);

    public SupportCaseSearchRowBasic() {
    }

    public SupportCaseSearchRowBasic(SearchColumnSelectField[] assigned, SearchColumnBooleanField[] awaitingReply, SearchColumnStringField[] caseNumber, SearchColumnSelectField[] category, SearchColumnSelectField[] company, SearchColumnSelectField[] contact, SearchColumnDateField[] createdDate, SearchColumnEnumSelectField[] customerStage, SearchColumnStringField[] email, SearchColumnDateField[] endDate, SearchColumnSelectField[] escalatee, SearchColumnSelectField[] externalId, SearchColumnBooleanField[] helpDesk, SearchColumnStringField[] inboundEmail, SearchColumnSelectField[] internalId, SearchColumnBooleanField[] isInactive, SearchColumnSelectField[] issue, SearchColumnStringField[] issueNumber, SearchColumnSelectField[] item, SearchColumnDateField[] lastMessageDate, SearchColumnDateField[] lastModifiedDate, SearchColumnDateField[] lastReopenedDate, SearchColumnBooleanField[] locked, SearchColumnSelectField[] module, SearchColumnSelectField[] origin, SearchColumnSelectField[] priority, SearchColumnSelectField[] product, SearchColumnSelectField[] profile, SearchColumnStringField[] serialNumber, SearchColumnEnumSelectField[] stage, SearchColumnDateField[] startDate, SearchColumnSelectField[] status, SearchColumnSelectField[] subsidiary, SearchColumnStringField[] title, SearchColumnCustomFieldList customFieldList) {
        this.assigned = assigned;
        this.awaitingReply = awaitingReply;
        this.caseNumber = caseNumber;
        this.category = category;
        this.company = company;
        this.contact = contact;
        this.createdDate = createdDate;
        this.customerStage = customerStage;
        this.email = email;
        this.endDate = endDate;
        this.escalatee = escalatee;
        this.externalId = externalId;
        this.helpDesk = helpDesk;
        this.inboundEmail = inboundEmail;
        this.internalId = internalId;
        this.isInactive = isInactive;
        this.issue = issue;
        this.issueNumber = issueNumber;
        this.item = item;
        this.lastMessageDate = lastMessageDate;
        this.lastModifiedDate = lastModifiedDate;
        this.lastReopenedDate = lastReopenedDate;
        this.locked = locked;
        this.module = module;
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

    public SearchColumnSelectField[] getAssigned() {
        return this.assigned;
    }

    public void setAssigned(SearchColumnSelectField[] assigned) {
        this.assigned = assigned;
    }

    public SearchColumnSelectField getAssigned(int i) {
        return this.assigned[i];
    }

    public void setAssigned(int i, SearchColumnSelectField _value) {
        this.assigned[i] = _value;
    }

    public SearchColumnBooleanField[] getAwaitingReply() {
        return this.awaitingReply;
    }

    public void setAwaitingReply(SearchColumnBooleanField[] awaitingReply) {
        this.awaitingReply = awaitingReply;
    }

    public SearchColumnBooleanField getAwaitingReply(int i) {
        return this.awaitingReply[i];
    }

    public void setAwaitingReply(int i, SearchColumnBooleanField _value) {
        this.awaitingReply[i] = _value;
    }

    public SearchColumnStringField[] getCaseNumber() {
        return this.caseNumber;
    }

    public void setCaseNumber(SearchColumnStringField[] caseNumber) {
        this.caseNumber = caseNumber;
    }

    public SearchColumnStringField getCaseNumber(int i) {
        return this.caseNumber[i];
    }

    public void setCaseNumber(int i, SearchColumnStringField _value) {
        this.caseNumber[i] = _value;
    }

    public SearchColumnSelectField[] getCategory() {
        return this.category;
    }

    public void setCategory(SearchColumnSelectField[] category) {
        this.category = category;
    }

    public SearchColumnSelectField getCategory(int i) {
        return this.category[i];
    }

    public void setCategory(int i, SearchColumnSelectField _value) {
        this.category[i] = _value;
    }

    public SearchColumnSelectField[] getCompany() {
        return this.company;
    }

    public void setCompany(SearchColumnSelectField[] company) {
        this.company = company;
    }

    public SearchColumnSelectField getCompany(int i) {
        return this.company[i];
    }

    public void setCompany(int i, SearchColumnSelectField _value) {
        this.company[i] = _value;
    }

    public SearchColumnSelectField[] getContact() {
        return this.contact;
    }

    public void setContact(SearchColumnSelectField[] contact) {
        this.contact = contact;
    }

    public SearchColumnSelectField getContact(int i) {
        return this.contact[i];
    }

    public void setContact(int i, SearchColumnSelectField _value) {
        this.contact[i] = _value;
    }

    public SearchColumnDateField[] getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(SearchColumnDateField[] createdDate) {
        this.createdDate = createdDate;
    }

    public SearchColumnDateField getCreatedDate(int i) {
        return this.createdDate[i];
    }

    public void setCreatedDate(int i, SearchColumnDateField _value) {
        this.createdDate[i] = _value;
    }

    public SearchColumnEnumSelectField[] getCustomerStage() {
        return this.customerStage;
    }

    public void setCustomerStage(SearchColumnEnumSelectField[] customerStage) {
        this.customerStage = customerStage;
    }

    public SearchColumnEnumSelectField getCustomerStage(int i) {
        return this.customerStage[i];
    }

    public void setCustomerStage(int i, SearchColumnEnumSelectField _value) {
        this.customerStage[i] = _value;
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

    public SearchColumnDateField[] getEndDate() {
        return this.endDate;
    }

    public void setEndDate(SearchColumnDateField[] endDate) {
        this.endDate = endDate;
    }

    public SearchColumnDateField getEndDate(int i) {
        return this.endDate[i];
    }

    public void setEndDate(int i, SearchColumnDateField _value) {
        this.endDate[i] = _value;
    }

    public SearchColumnSelectField[] getEscalatee() {
        return this.escalatee;
    }

    public void setEscalatee(SearchColumnSelectField[] escalatee) {
        this.escalatee = escalatee;
    }

    public SearchColumnSelectField getEscalatee(int i) {
        return this.escalatee[i];
    }

    public void setEscalatee(int i, SearchColumnSelectField _value) {
        this.escalatee[i] = _value;
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

    public SearchColumnBooleanField[] getHelpDesk() {
        return this.helpDesk;
    }

    public void setHelpDesk(SearchColumnBooleanField[] helpDesk) {
        this.helpDesk = helpDesk;
    }

    public SearchColumnBooleanField getHelpDesk(int i) {
        return this.helpDesk[i];
    }

    public void setHelpDesk(int i, SearchColumnBooleanField _value) {
        this.helpDesk[i] = _value;
    }

    public SearchColumnStringField[] getInboundEmail() {
        return this.inboundEmail;
    }

    public void setInboundEmail(SearchColumnStringField[] inboundEmail) {
        this.inboundEmail = inboundEmail;
    }

    public SearchColumnStringField getInboundEmail(int i) {
        return this.inboundEmail[i];
    }

    public void setInboundEmail(int i, SearchColumnStringField _value) {
        this.inboundEmail[i] = _value;
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

    public SearchColumnSelectField[] getIssue() {
        return this.issue;
    }

    public void setIssue(SearchColumnSelectField[] issue) {
        this.issue = issue;
    }

    public SearchColumnSelectField getIssue(int i) {
        return this.issue[i];
    }

    public void setIssue(int i, SearchColumnSelectField _value) {
        this.issue[i] = _value;
    }

    public SearchColumnStringField[] getIssueNumber() {
        return this.issueNumber;
    }

    public void setIssueNumber(SearchColumnStringField[] issueNumber) {
        this.issueNumber = issueNumber;
    }

    public SearchColumnStringField getIssueNumber(int i) {
        return this.issueNumber[i];
    }

    public void setIssueNumber(int i, SearchColumnStringField _value) {
        this.issueNumber[i] = _value;
    }

    public SearchColumnSelectField[] getItem() {
        return this.item;
    }

    public void setItem(SearchColumnSelectField[] item) {
        this.item = item;
    }

    public SearchColumnSelectField getItem(int i) {
        return this.item[i];
    }

    public void setItem(int i, SearchColumnSelectField _value) {
        this.item[i] = _value;
    }

    public SearchColumnDateField[] getLastMessageDate() {
        return this.lastMessageDate;
    }

    public void setLastMessageDate(SearchColumnDateField[] lastMessageDate) {
        this.lastMessageDate = lastMessageDate;
    }

    public SearchColumnDateField getLastMessageDate(int i) {
        return this.lastMessageDate[i];
    }

    public void setLastMessageDate(int i, SearchColumnDateField _value) {
        this.lastMessageDate[i] = _value;
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

    public SearchColumnDateField[] getLastReopenedDate() {
        return this.lastReopenedDate;
    }

    public void setLastReopenedDate(SearchColumnDateField[] lastReopenedDate) {
        this.lastReopenedDate = lastReopenedDate;
    }

    public SearchColumnDateField getLastReopenedDate(int i) {
        return this.lastReopenedDate[i];
    }

    public void setLastReopenedDate(int i, SearchColumnDateField _value) {
        this.lastReopenedDate[i] = _value;
    }

    public SearchColumnBooleanField[] getLocked() {
        return this.locked;
    }

    public void setLocked(SearchColumnBooleanField[] locked) {
        this.locked = locked;
    }

    public SearchColumnBooleanField getLocked(int i) {
        return this.locked[i];
    }

    public void setLocked(int i, SearchColumnBooleanField _value) {
        this.locked[i] = _value;
    }

    public SearchColumnSelectField[] getModule() {
        return this.module;
    }

    public void setModule(SearchColumnSelectField[] module) {
        this.module = module;
    }

    public SearchColumnSelectField getModule(int i) {
        return this.module[i];
    }

    public void setModule(int i, SearchColumnSelectField _value) {
        this.module[i] = _value;
    }

    public SearchColumnSelectField[] getOrigin() {
        return this.origin;
    }

    public void setOrigin(SearchColumnSelectField[] origin) {
        this.origin = origin;
    }

    public SearchColumnSelectField getOrigin(int i) {
        return this.origin[i];
    }

    public void setOrigin(int i, SearchColumnSelectField _value) {
        this.origin[i] = _value;
    }

    public SearchColumnSelectField[] getPriority() {
        return this.priority;
    }

    public void setPriority(SearchColumnSelectField[] priority) {
        this.priority = priority;
    }

    public SearchColumnSelectField getPriority(int i) {
        return this.priority[i];
    }

    public void setPriority(int i, SearchColumnSelectField _value) {
        this.priority[i] = _value;
    }

    public SearchColumnSelectField[] getProduct() {
        return this.product;
    }

    public void setProduct(SearchColumnSelectField[] product) {
        this.product = product;
    }

    public SearchColumnSelectField getProduct(int i) {
        return this.product[i];
    }

    public void setProduct(int i, SearchColumnSelectField _value) {
        this.product[i] = _value;
    }

    public SearchColumnSelectField[] getProfile() {
        return this.profile;
    }

    public void setProfile(SearchColumnSelectField[] profile) {
        this.profile = profile;
    }

    public SearchColumnSelectField getProfile(int i) {
        return this.profile[i];
    }

    public void setProfile(int i, SearchColumnSelectField _value) {
        this.profile[i] = _value;
    }

    public SearchColumnStringField[] getSerialNumber() {
        return this.serialNumber;
    }

    public void setSerialNumber(SearchColumnStringField[] serialNumber) {
        this.serialNumber = serialNumber;
    }

    public SearchColumnStringField getSerialNumber(int i) {
        return this.serialNumber[i];
    }

    public void setSerialNumber(int i, SearchColumnStringField _value) {
        this.serialNumber[i] = _value;
    }

    public SearchColumnEnumSelectField[] getStage() {
        return this.stage;
    }

    public void setStage(SearchColumnEnumSelectField[] stage) {
        this.stage = stage;
    }

    public SearchColumnEnumSelectField getStage(int i) {
        return this.stage[i];
    }

    public void setStage(int i, SearchColumnEnumSelectField _value) {
        this.stage[i] = _value;
    }

    public SearchColumnDateField[] getStartDate() {
        return this.startDate;
    }

    public void setStartDate(SearchColumnDateField[] startDate) {
        this.startDate = startDate;
    }

    public SearchColumnDateField getStartDate(int i) {
        return this.startDate[i];
    }

    public void setStartDate(int i, SearchColumnDateField _value) {
        this.startDate[i] = _value;
    }

    public SearchColumnSelectField[] getStatus() {
        return this.status;
    }

    public void setStatus(SearchColumnSelectField[] status) {
        this.status = status;
    }

    public SearchColumnSelectField getStatus(int i) {
        return this.status[i];
    }

    public void setStatus(int i, SearchColumnSelectField _value) {
        this.status[i] = _value;
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

    public SearchColumnCustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SupportCaseSearchRowBasic)) {
            return false;
        }
        SupportCaseSearchRowBasic other = (SupportCaseSearchRowBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.assigned == null && other.getAssigned() == null || this.assigned != null && Arrays.equals(this.assigned, other.getAssigned())) && (this.awaitingReply == null && other.getAwaitingReply() == null || this.awaitingReply != null && Arrays.equals(this.awaitingReply, other.getAwaitingReply())) && (this.caseNumber == null && other.getCaseNumber() == null || this.caseNumber != null && Arrays.equals(this.caseNumber, other.getCaseNumber())) && (this.category == null && other.getCategory() == null || this.category != null && Arrays.equals(this.category, other.getCategory())) && (this.company == null && other.getCompany() == null || this.company != null && Arrays.equals(this.company, other.getCompany())) && (this.contact == null && other.getContact() == null || this.contact != null && Arrays.equals(this.contact, other.getContact())) && (this.createdDate == null && other.getCreatedDate() == null || this.createdDate != null && Arrays.equals(this.createdDate, other.getCreatedDate())) && (this.customerStage == null && other.getCustomerStage() == null || this.customerStage != null && Arrays.equals(this.customerStage, other.getCustomerStage())) && (this.email == null && other.getEmail() == null || this.email != null && Arrays.equals(this.email, other.getEmail())) && (this.endDate == null && other.getEndDate() == null || this.endDate != null && Arrays.equals(this.endDate, other.getEndDate())) && (this.escalatee == null && other.getEscalatee() == null || this.escalatee != null && Arrays.equals(this.escalatee, other.getEscalatee())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && Arrays.equals(this.externalId, other.getExternalId())) && (this.helpDesk == null && other.getHelpDesk() == null || this.helpDesk != null && Arrays.equals(this.helpDesk, other.getHelpDesk())) && (this.inboundEmail == null && other.getInboundEmail() == null || this.inboundEmail != null && Arrays.equals(this.inboundEmail, other.getInboundEmail())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && Arrays.equals(this.internalId, other.getInternalId())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && Arrays.equals(this.isInactive, other.getIsInactive())) && (this.issue == null && other.getIssue() == null || this.issue != null && Arrays.equals(this.issue, other.getIssue())) && (this.issueNumber == null && other.getIssueNumber() == null || this.issueNumber != null && Arrays.equals(this.issueNumber, other.getIssueNumber())) && (this.item == null && other.getItem() == null || this.item != null && Arrays.equals(this.item, other.getItem())) && (this.lastMessageDate == null && other.getLastMessageDate() == null || this.lastMessageDate != null && Arrays.equals(this.lastMessageDate, other.getLastMessageDate())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && Arrays.equals(this.lastModifiedDate, other.getLastModifiedDate())) && (this.lastReopenedDate == null && other.getLastReopenedDate() == null || this.lastReopenedDate != null && Arrays.equals(this.lastReopenedDate, other.getLastReopenedDate())) && (this.locked == null && other.getLocked() == null || this.locked != null && Arrays.equals(this.locked, other.getLocked())) && (this.module == null && other.getModule() == null || this.module != null && Arrays.equals(this.module, other.getModule())) && (this.origin == null && other.getOrigin() == null || this.origin != null && Arrays.equals(this.origin, other.getOrigin())) && (this.priority == null && other.getPriority() == null || this.priority != null && Arrays.equals(this.priority, other.getPriority())) && (this.product == null && other.getProduct() == null || this.product != null && Arrays.equals(this.product, other.getProduct())) && (this.profile == null && other.getProfile() == null || this.profile != null && Arrays.equals(this.profile, other.getProfile())) && (this.serialNumber == null && other.getSerialNumber() == null || this.serialNumber != null && Arrays.equals(this.serialNumber, other.getSerialNumber())) && (this.stage == null && other.getStage() == null || this.stage != null && Arrays.equals(this.stage, other.getStage())) && (this.startDate == null && other.getStartDate() == null || this.startDate != null && Arrays.equals(this.startDate, other.getStartDate())) && (this.status == null && other.getStatus() == null || this.status != null && Arrays.equals(this.status, other.getStatus())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && Arrays.equals(this.subsidiary, other.getSubsidiary())) && (this.title == null && other.getTitle() == null || this.title != null && Arrays.equals(this.title, other.getTitle())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
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
        if (this.getAssigned() != null) {
            for (i = 0; i < Array.getLength(this.getAssigned()); ++i) {
                obj = Array.get(this.getAssigned(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAwaitingReply() != null) {
            for (i = 0; i < Array.getLength(this.getAwaitingReply()); ++i) {
                obj = Array.get(this.getAwaitingReply(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCaseNumber() != null) {
            for (i = 0; i < Array.getLength(this.getCaseNumber()); ++i) {
                obj = Array.get(this.getCaseNumber(), i);
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
        if (this.getCompany() != null) {
            for (i = 0; i < Array.getLength(this.getCompany()); ++i) {
                obj = Array.get(this.getCompany(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getContact() != null) {
            for (i = 0; i < Array.getLength(this.getContact()); ++i) {
                obj = Array.get(this.getContact(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCreatedDate() != null) {
            for (i = 0; i < Array.getLength(this.getCreatedDate()); ++i) {
                obj = Array.get(this.getCreatedDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCustomerStage() != null) {
            for (i = 0; i < Array.getLength(this.getCustomerStage()); ++i) {
                obj = Array.get(this.getCustomerStage(), i);
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
        if (this.getEndDate() != null) {
            for (i = 0; i < Array.getLength(this.getEndDate()); ++i) {
                obj = Array.get(this.getEndDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getEscalatee() != null) {
            for (i = 0; i < Array.getLength(this.getEscalatee()); ++i) {
                obj = Array.get(this.getEscalatee(), i);
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
        if (this.getHelpDesk() != null) {
            for (i = 0; i < Array.getLength(this.getHelpDesk()); ++i) {
                obj = Array.get(this.getHelpDesk(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getInboundEmail() != null) {
            for (i = 0; i < Array.getLength(this.getInboundEmail()); ++i) {
                obj = Array.get(this.getInboundEmail(), i);
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
        if (this.getIsInactive() != null) {
            for (i = 0; i < Array.getLength(this.getIsInactive()); ++i) {
                obj = Array.get(this.getIsInactive(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIssue() != null) {
            for (i = 0; i < Array.getLength(this.getIssue()); ++i) {
                obj = Array.get(this.getIssue(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIssueNumber() != null) {
            for (i = 0; i < Array.getLength(this.getIssueNumber()); ++i) {
                obj = Array.get(this.getIssueNumber(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getItem() != null) {
            for (i = 0; i < Array.getLength(this.getItem()); ++i) {
                obj = Array.get(this.getItem(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLastMessageDate() != null) {
            for (i = 0; i < Array.getLength(this.getLastMessageDate()); ++i) {
                obj = Array.get(this.getLastMessageDate(), i);
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
        if (this.getLastReopenedDate() != null) {
            for (i = 0; i < Array.getLength(this.getLastReopenedDate()); ++i) {
                obj = Array.get(this.getLastReopenedDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLocked() != null) {
            for (i = 0; i < Array.getLength(this.getLocked()); ++i) {
                obj = Array.get(this.getLocked(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getModule() != null) {
            for (i = 0; i < Array.getLength(this.getModule()); ++i) {
                obj = Array.get(this.getModule(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getOrigin() != null) {
            for (i = 0; i < Array.getLength(this.getOrigin()); ++i) {
                obj = Array.get(this.getOrigin(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPriority() != null) {
            for (i = 0; i < Array.getLength(this.getPriority()); ++i) {
                obj = Array.get(this.getPriority(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getProduct() != null) {
            for (i = 0; i < Array.getLength(this.getProduct()); ++i) {
                obj = Array.get(this.getProduct(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getProfile() != null) {
            for (i = 0; i < Array.getLength(this.getProfile()); ++i) {
                obj = Array.get(this.getProfile(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSerialNumber() != null) {
            for (i = 0; i < Array.getLength(this.getSerialNumber()); ++i) {
                obj = Array.get(this.getSerialNumber(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getStage() != null) {
            for (i = 0; i < Array.getLength(this.getStage()); ++i) {
                obj = Array.get(this.getStage(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getStartDate() != null) {
            for (i = 0; i < Array.getLength(this.getStartDate()); ++i) {
                obj = Array.get(this.getStartDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getStatus() != null) {
            for (i = 0; i < Array.getLength(this.getStatus()); ++i) {
                obj = Array.get(this.getStatus(), i);
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "SupportCaseSearchRowBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("assigned");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "assigned"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("awaitingReply");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "awaitingReply"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("caseNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "caseNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("category");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "category"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("company");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "company"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("contact");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "contact"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customerStage");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "customerStage"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
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
        elemField.setFieldName("endDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "endDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("escalatee");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "escalatee"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("helpDesk");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "helpDesk"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("inboundEmail");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "inboundEmail"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("issue");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "issue"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("issueNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "issueNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastMessageDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lastMessageDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
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
        elemField.setFieldName("lastReopenedDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lastReopenedDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locked");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locked"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("module");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "module"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("origin");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "origin"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("priority");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "priority"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("product");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "product"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("profile");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "profile"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("serialNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "serialNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("stage");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "stage"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "status"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnCustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

