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

public class MessageSearchBasic
extends SearchRecordBasic
implements Serializable {
    private SearchMultiSelectField author;
    private SearchStringField authorEmail;
    private SearchStringField bcc;
    private SearchStringField cc;
    private SearchMultiSelectField externalId;
    private SearchStringField externalIdString;
    private SearchBooleanField hasAttachment;
    private SearchMultiSelectField internalId;
    private SearchLongField internalIdNumber;
    private SearchBooleanField internalOnly;
    private SearchStringField message;
    private SearchDateField messageDate;
    private SearchEnumMultiSelectField messageType;
    private SearchMultiSelectField recipient;
    private SearchStringField recipientEmail;
    private SearchStringField subject;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(MessageSearchBasic.class, true);

    public MessageSearchBasic() {
    }

    public MessageSearchBasic(SearchMultiSelectField author, SearchStringField authorEmail, SearchStringField bcc, SearchStringField cc, SearchMultiSelectField externalId, SearchStringField externalIdString, SearchBooleanField hasAttachment, SearchMultiSelectField internalId, SearchLongField internalIdNumber, SearchBooleanField internalOnly, SearchStringField message, SearchDateField messageDate, SearchEnumMultiSelectField messageType, SearchMultiSelectField recipient, SearchStringField recipientEmail, SearchStringField subject) {
        this.author = author;
        this.authorEmail = authorEmail;
        this.bcc = bcc;
        this.cc = cc;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.hasAttachment = hasAttachment;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.internalOnly = internalOnly;
        this.message = message;
        this.messageDate = messageDate;
        this.messageType = messageType;
        this.recipient = recipient;
        this.recipientEmail = recipientEmail;
        this.subject = subject;
    }

    public SearchMultiSelectField getAuthor() {
        return this.author;
    }

    public void setAuthor(SearchMultiSelectField author) {
        this.author = author;
    }

    public SearchStringField getAuthorEmail() {
        return this.authorEmail;
    }

    public void setAuthorEmail(SearchStringField authorEmail) {
        this.authorEmail = authorEmail;
    }

    public SearchStringField getBcc() {
        return this.bcc;
    }

    public void setBcc(SearchStringField bcc) {
        this.bcc = bcc;
    }

    public SearchStringField getCc() {
        return this.cc;
    }

    public void setCc(SearchStringField cc) {
        this.cc = cc;
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

    public SearchBooleanField getHasAttachment() {
        return this.hasAttachment;
    }

    public void setHasAttachment(SearchBooleanField hasAttachment) {
        this.hasAttachment = hasAttachment;
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

    public SearchBooleanField getInternalOnly() {
        return this.internalOnly;
    }

    public void setInternalOnly(SearchBooleanField internalOnly) {
        this.internalOnly = internalOnly;
    }

    public SearchStringField getMessage() {
        return this.message;
    }

    public void setMessage(SearchStringField message) {
        this.message = message;
    }

    public SearchDateField getMessageDate() {
        return this.messageDate;
    }

    public void setMessageDate(SearchDateField messageDate) {
        this.messageDate = messageDate;
    }

    public SearchEnumMultiSelectField getMessageType() {
        return this.messageType;
    }

    public void setMessageType(SearchEnumMultiSelectField messageType) {
        this.messageType = messageType;
    }

    public SearchMultiSelectField getRecipient() {
        return this.recipient;
    }

    public void setRecipient(SearchMultiSelectField recipient) {
        this.recipient = recipient;
    }

    public SearchStringField getRecipientEmail() {
        return this.recipientEmail;
    }

    public void setRecipientEmail(SearchStringField recipientEmail) {
        this.recipientEmail = recipientEmail;
    }

    public SearchStringField getSubject() {
        return this.subject;
    }

    public void setSubject(SearchStringField subject) {
        this.subject = subject;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof MessageSearchBasic)) {
            return false;
        }
        MessageSearchBasic other = (MessageSearchBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.author == null && other.getAuthor() == null || this.author != null && this.author.equals(other.getAuthor())) && (this.authorEmail == null && other.getAuthorEmail() == null || this.authorEmail != null && this.authorEmail.equals(other.getAuthorEmail())) && (this.bcc == null && other.getBcc() == null || this.bcc != null && this.bcc.equals(other.getBcc())) && (this.cc == null && other.getCc() == null || this.cc != null && this.cc.equals(other.getCc())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId())) && (this.externalIdString == null && other.getExternalIdString() == null || this.externalIdString != null && this.externalIdString.equals(other.getExternalIdString())) && (this.hasAttachment == null && other.getHasAttachment() == null || this.hasAttachment != null && this.hasAttachment.equals(other.getHasAttachment())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.internalIdNumber == null && other.getInternalIdNumber() == null || this.internalIdNumber != null && this.internalIdNumber.equals(other.getInternalIdNumber())) && (this.internalOnly == null && other.getInternalOnly() == null || this.internalOnly != null && this.internalOnly.equals(other.getInternalOnly())) && (this.message == null && other.getMessage() == null || this.message != null && this.message.equals(other.getMessage())) && (this.messageDate == null && other.getMessageDate() == null || this.messageDate != null && this.messageDate.equals(other.getMessageDate())) && (this.messageType == null && other.getMessageType() == null || this.messageType != null && this.messageType.equals(other.getMessageType())) && (this.recipient == null && other.getRecipient() == null || this.recipient != null && this.recipient.equals(other.getRecipient())) && (this.recipientEmail == null && other.getRecipientEmail() == null || this.recipientEmail != null && this.recipientEmail.equals(other.getRecipientEmail())) && (this.subject == null && other.getSubject() == null || this.subject != null && this.subject.equals(other.getSubject()));
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
        if (this.getAuthor() != null) {
            _hashCode += this.getAuthor().hashCode();
        }
        if (this.getAuthorEmail() != null) {
            _hashCode += this.getAuthorEmail().hashCode();
        }
        if (this.getBcc() != null) {
            _hashCode += this.getBcc().hashCode();
        }
        if (this.getCc() != null) {
            _hashCode += this.getCc().hashCode();
        }
        if (this.getExternalId() != null) {
            _hashCode += this.getExternalId().hashCode();
        }
        if (this.getExternalIdString() != null) {
            _hashCode += this.getExternalIdString().hashCode();
        }
        if (this.getHasAttachment() != null) {
            _hashCode += this.getHasAttachment().hashCode();
        }
        if (this.getInternalId() != null) {
            _hashCode += this.getInternalId().hashCode();
        }
        if (this.getInternalIdNumber() != null) {
            _hashCode += this.getInternalIdNumber().hashCode();
        }
        if (this.getInternalOnly() != null) {
            _hashCode += this.getInternalOnly().hashCode();
        }
        if (this.getMessage() != null) {
            _hashCode += this.getMessage().hashCode();
        }
        if (this.getMessageDate() != null) {
            _hashCode += this.getMessageDate().hashCode();
        }
        if (this.getMessageType() != null) {
            _hashCode += this.getMessageType().hashCode();
        }
        if (this.getRecipient() != null) {
            _hashCode += this.getRecipient().hashCode();
        }
        if (this.getRecipientEmail() != null) {
            _hashCode += this.getRecipientEmail().hashCode();
        }
        if (this.getSubject() != null) {
            _hashCode += this.getSubject().hashCode();
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "MessageSearchBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("author");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "author"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("authorEmail");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "authorEmail"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("bcc");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "bcc"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("cc");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "cc"));
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
        elemField.setFieldName("hasAttachment");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "hasAttachment"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
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
        elemField.setFieldName("internalOnly");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "internalOnly"));
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
        elemField.setFieldName("messageDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "messageDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("messageType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "messageType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recipient");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "recipient"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recipientEmail");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "recipientEmail"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "subject"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

