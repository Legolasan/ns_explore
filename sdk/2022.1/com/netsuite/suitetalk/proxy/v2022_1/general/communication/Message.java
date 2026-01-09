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
package com.netsuite.suitetalk.proxy.v2022_1.general.communication;

import com.netsuite.suitetalk.proxy.v2022_1.general.communication.MessageMediaItemList;
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

public class Message
extends Record
implements Serializable {
    private RecordRef author;
    private String authorEmail;
    private RecordRef recipient;
    private String recipientEmail;
    private String cc;
    private String bcc;
    private Calendar messageDate;
    private String recordName;
    private String recordTypeName;
    private String subject;
    private String message;
    private Boolean emailed;
    private RecordRef activity;
    private Boolean compressAttachments;
    private Boolean incoming;
    private Calendar lastModifiedDate;
    private RecordRef transaction;
    private MessageMediaItemList mediaItemList;
    private String dateTime;
    private String internalId;
    private String externalId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(Message.class, true);

    public Message() {
    }

    public Message(NullField nullFieldList, String internalId, String externalId, RecordRef author, String authorEmail, RecordRef recipient, String recipientEmail, String cc, String bcc, Calendar messageDate, String recordName, String recordTypeName, String subject, String message, Boolean emailed, RecordRef activity, Boolean compressAttachments, Boolean incoming, Calendar lastModifiedDate, RecordRef transaction, MessageMediaItemList mediaItemList, String dateTime) {
        super(nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.author = author;
        this.authorEmail = authorEmail;
        this.recipient = recipient;
        this.recipientEmail = recipientEmail;
        this.cc = cc;
        this.bcc = bcc;
        this.messageDate = messageDate;
        this.recordName = recordName;
        this.recordTypeName = recordTypeName;
        this.subject = subject;
        this.message = message;
        this.emailed = emailed;
        this.activity = activity;
        this.compressAttachments = compressAttachments;
        this.incoming = incoming;
        this.lastModifiedDate = lastModifiedDate;
        this.transaction = transaction;
        this.mediaItemList = mediaItemList;
        this.dateTime = dateTime;
    }

    public RecordRef getAuthor() {
        return this.author;
    }

    public void setAuthor(RecordRef author) {
        this.author = author;
    }

    public String getAuthorEmail() {
        return this.authorEmail;
    }

    public void setAuthorEmail(String authorEmail) {
        this.authorEmail = authorEmail;
    }

    public RecordRef getRecipient() {
        return this.recipient;
    }

    public void setRecipient(RecordRef recipient) {
        this.recipient = recipient;
    }

    public String getRecipientEmail() {
        return this.recipientEmail;
    }

    public void setRecipientEmail(String recipientEmail) {
        this.recipientEmail = recipientEmail;
    }

    public String getCc() {
        return this.cc;
    }

    public void setCc(String cc) {
        this.cc = cc;
    }

    public String getBcc() {
        return this.bcc;
    }

    public void setBcc(String bcc) {
        this.bcc = bcc;
    }

    public Calendar getMessageDate() {
        return this.messageDate;
    }

    public void setMessageDate(Calendar messageDate) {
        this.messageDate = messageDate;
    }

    public String getRecordName() {
        return this.recordName;
    }

    public void setRecordName(String recordName) {
        this.recordName = recordName;
    }

    public String getRecordTypeName() {
        return this.recordTypeName;
    }

    public void setRecordTypeName(String recordTypeName) {
        this.recordTypeName = recordTypeName;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getEmailed() {
        return this.emailed;
    }

    public void setEmailed(Boolean emailed) {
        this.emailed = emailed;
    }

    public RecordRef getActivity() {
        return this.activity;
    }

    public void setActivity(RecordRef activity) {
        this.activity = activity;
    }

    public Boolean getCompressAttachments() {
        return this.compressAttachments;
    }

    public void setCompressAttachments(Boolean compressAttachments) {
        this.compressAttachments = compressAttachments;
    }

    public Boolean getIncoming() {
        return this.incoming;
    }

    public void setIncoming(Boolean incoming) {
        this.incoming = incoming;
    }

    public Calendar getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    public void setLastModifiedDate(Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public RecordRef getTransaction() {
        return this.transaction;
    }

    public void setTransaction(RecordRef transaction) {
        this.transaction = transaction;
    }

    public MessageMediaItemList getMediaItemList() {
        return this.mediaItemList;
    }

    public void setMediaItemList(MessageMediaItemList mediaItemList) {
        this.mediaItemList = mediaItemList;
    }

    public String getDateTime() {
        return this.dateTime;
    }

    public void setDateTime(String dateTime) {
        this.dateTime = dateTime;
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
        if (!(obj instanceof Message)) {
            return false;
        }
        Message other = (Message)obj;
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
        boolean _equals = super.equals(obj) && (this.author == null && other.getAuthor() == null || this.author != null && this.author.equals(other.getAuthor())) && (this.authorEmail == null && other.getAuthorEmail() == null || this.authorEmail != null && this.authorEmail.equals(other.getAuthorEmail())) && (this.recipient == null && other.getRecipient() == null || this.recipient != null && this.recipient.equals(other.getRecipient())) && (this.recipientEmail == null && other.getRecipientEmail() == null || this.recipientEmail != null && this.recipientEmail.equals(other.getRecipientEmail())) && (this.cc == null && other.getCc() == null || this.cc != null && this.cc.equals(other.getCc())) && (this.bcc == null && other.getBcc() == null || this.bcc != null && this.bcc.equals(other.getBcc())) && (this.messageDate == null && other.getMessageDate() == null || this.messageDate != null && this.messageDate.equals(other.getMessageDate())) && (this.recordName == null && other.getRecordName() == null || this.recordName != null && this.recordName.equals(other.getRecordName())) && (this.recordTypeName == null && other.getRecordTypeName() == null || this.recordTypeName != null && this.recordTypeName.equals(other.getRecordTypeName())) && (this.subject == null && other.getSubject() == null || this.subject != null && this.subject.equals(other.getSubject())) && (this.message == null && other.getMessage() == null || this.message != null && this.message.equals(other.getMessage())) && (this.emailed == null && other.getEmailed() == null || this.emailed != null && this.emailed.equals(other.getEmailed())) && (this.activity == null && other.getActivity() == null || this.activity != null && this.activity.equals(other.getActivity())) && (this.compressAttachments == null && other.getCompressAttachments() == null || this.compressAttachments != null && this.compressAttachments.equals(other.getCompressAttachments())) && (this.incoming == null && other.getIncoming() == null || this.incoming != null && this.incoming.equals(other.getIncoming())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && this.lastModifiedDate.equals(other.getLastModifiedDate())) && (this.transaction == null && other.getTransaction() == null || this.transaction != null && this.transaction.equals(other.getTransaction())) && (this.mediaItemList == null && other.getMediaItemList() == null || this.mediaItemList != null && this.mediaItemList.equals(other.getMediaItemList())) && (this.dateTime == null && other.getDateTime() == null || this.dateTime != null && this.dateTime.equals(other.getDateTime())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
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
        if (this.getRecipient() != null) {
            _hashCode += this.getRecipient().hashCode();
        }
        if (this.getRecipientEmail() != null) {
            _hashCode += this.getRecipientEmail().hashCode();
        }
        if (this.getCc() != null) {
            _hashCode += this.getCc().hashCode();
        }
        if (this.getBcc() != null) {
            _hashCode += this.getBcc().hashCode();
        }
        if (this.getMessageDate() != null) {
            _hashCode += this.getMessageDate().hashCode();
        }
        if (this.getRecordName() != null) {
            _hashCode += this.getRecordName().hashCode();
        }
        if (this.getRecordTypeName() != null) {
            _hashCode += this.getRecordTypeName().hashCode();
        }
        if (this.getSubject() != null) {
            _hashCode += this.getSubject().hashCode();
        }
        if (this.getMessage() != null) {
            _hashCode += this.getMessage().hashCode();
        }
        if (this.getEmailed() != null) {
            _hashCode += this.getEmailed().hashCode();
        }
        if (this.getActivity() != null) {
            _hashCode += this.getActivity().hashCode();
        }
        if (this.getCompressAttachments() != null) {
            _hashCode += this.getCompressAttachments().hashCode();
        }
        if (this.getIncoming() != null) {
            _hashCode += this.getIncoming().hashCode();
        }
        if (this.getLastModifiedDate() != null) {
            _hashCode += this.getLastModifiedDate().hashCode();
        }
        if (this.getTransaction() != null) {
            _hashCode += this.getTransaction().hashCode();
        }
        if (this.getMediaItemList() != null) {
            _hashCode += this.getMediaItemList().hashCode();
        }
        if (this.getDateTime() != null) {
            _hashCode += this.getDateTime().hashCode();
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
        typeDesc.setXmlType(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "Message"));
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
        elemField.setFieldName("author");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "author"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("authorEmail");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "authorEmail"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recipient");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "recipient"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recipientEmail");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "recipientEmail"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("cc");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "cc"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("bcc");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "bcc"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("messageDate");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "messageDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recordName");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "recordName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recordTypeName");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "recordTypeName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "subject"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "message"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("emailed");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "emailed"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("activity");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "activity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("compressAttachments");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "compressAttachments"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("incoming");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "incoming"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("transaction");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "transaction"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("mediaItemList");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "mediaItemList"));
        elemField.setXmlType(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "MessageMediaItemList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("dateTime");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "dateTime"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

