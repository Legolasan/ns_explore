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

public class MessageSearchRowBasic
extends SearchRowBasic
implements Serializable {
    private SearchColumnSelectField[] author;
    private SearchColumnStringField[] authorEmail;
    private SearchColumnStringField[] bcc;
    private SearchColumnStringField[] cc;
    private SearchColumnSelectField[] externalId;
    private SearchColumnBooleanField[] hasAttachment;
    private SearchColumnSelectField[] internalId;
    private SearchColumnBooleanField[] internalOnly;
    private SearchColumnBooleanField[] isEmailed;
    private SearchColumnBooleanField[] isIncoming;
    private SearchColumnStringField[] message;
    private SearchColumnDateField[] messageDate;
    private SearchColumnEnumSelectField[] messageType;
    private SearchColumnSelectField[] recipient;
    private SearchColumnStringField[] recipientEmail;
    private SearchColumnStringField[] subject;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(MessageSearchRowBasic.class, true);

    public MessageSearchRowBasic() {
    }

    public MessageSearchRowBasic(SearchColumnSelectField[] author, SearchColumnStringField[] authorEmail, SearchColumnStringField[] bcc, SearchColumnStringField[] cc, SearchColumnSelectField[] externalId, SearchColumnBooleanField[] hasAttachment, SearchColumnSelectField[] internalId, SearchColumnBooleanField[] internalOnly, SearchColumnBooleanField[] isEmailed, SearchColumnBooleanField[] isIncoming, SearchColumnStringField[] message, SearchColumnDateField[] messageDate, SearchColumnEnumSelectField[] messageType, SearchColumnSelectField[] recipient, SearchColumnStringField[] recipientEmail, SearchColumnStringField[] subject) {
        this.author = author;
        this.authorEmail = authorEmail;
        this.bcc = bcc;
        this.cc = cc;
        this.externalId = externalId;
        this.hasAttachment = hasAttachment;
        this.internalId = internalId;
        this.internalOnly = internalOnly;
        this.isEmailed = isEmailed;
        this.isIncoming = isIncoming;
        this.message = message;
        this.messageDate = messageDate;
        this.messageType = messageType;
        this.recipient = recipient;
        this.recipientEmail = recipientEmail;
        this.subject = subject;
    }

    public SearchColumnSelectField[] getAuthor() {
        return this.author;
    }

    public void setAuthor(SearchColumnSelectField[] author) {
        this.author = author;
    }

    public SearchColumnSelectField getAuthor(int i) {
        return this.author[i];
    }

    public void setAuthor(int i, SearchColumnSelectField _value) {
        this.author[i] = _value;
    }

    public SearchColumnStringField[] getAuthorEmail() {
        return this.authorEmail;
    }

    public void setAuthorEmail(SearchColumnStringField[] authorEmail) {
        this.authorEmail = authorEmail;
    }

    public SearchColumnStringField getAuthorEmail(int i) {
        return this.authorEmail[i];
    }

    public void setAuthorEmail(int i, SearchColumnStringField _value) {
        this.authorEmail[i] = _value;
    }

    public SearchColumnStringField[] getBcc() {
        return this.bcc;
    }

    public void setBcc(SearchColumnStringField[] bcc) {
        this.bcc = bcc;
    }

    public SearchColumnStringField getBcc(int i) {
        return this.bcc[i];
    }

    public void setBcc(int i, SearchColumnStringField _value) {
        this.bcc[i] = _value;
    }

    public SearchColumnStringField[] getCc() {
        return this.cc;
    }

    public void setCc(SearchColumnStringField[] cc) {
        this.cc = cc;
    }

    public SearchColumnStringField getCc(int i) {
        return this.cc[i];
    }

    public void setCc(int i, SearchColumnStringField _value) {
        this.cc[i] = _value;
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

    public SearchColumnBooleanField[] getHasAttachment() {
        return this.hasAttachment;
    }

    public void setHasAttachment(SearchColumnBooleanField[] hasAttachment) {
        this.hasAttachment = hasAttachment;
    }

    public SearchColumnBooleanField getHasAttachment(int i) {
        return this.hasAttachment[i];
    }

    public void setHasAttachment(int i, SearchColumnBooleanField _value) {
        this.hasAttachment[i] = _value;
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

    public SearchColumnBooleanField[] getInternalOnly() {
        return this.internalOnly;
    }

    public void setInternalOnly(SearchColumnBooleanField[] internalOnly) {
        this.internalOnly = internalOnly;
    }

    public SearchColumnBooleanField getInternalOnly(int i) {
        return this.internalOnly[i];
    }

    public void setInternalOnly(int i, SearchColumnBooleanField _value) {
        this.internalOnly[i] = _value;
    }

    public SearchColumnBooleanField[] getIsEmailed() {
        return this.isEmailed;
    }

    public void setIsEmailed(SearchColumnBooleanField[] isEmailed) {
        this.isEmailed = isEmailed;
    }

    public SearchColumnBooleanField getIsEmailed(int i) {
        return this.isEmailed[i];
    }

    public void setIsEmailed(int i, SearchColumnBooleanField _value) {
        this.isEmailed[i] = _value;
    }

    public SearchColumnBooleanField[] getIsIncoming() {
        return this.isIncoming;
    }

    public void setIsIncoming(SearchColumnBooleanField[] isIncoming) {
        this.isIncoming = isIncoming;
    }

    public SearchColumnBooleanField getIsIncoming(int i) {
        return this.isIncoming[i];
    }

    public void setIsIncoming(int i, SearchColumnBooleanField _value) {
        this.isIncoming[i] = _value;
    }

    public SearchColumnStringField[] getMessage() {
        return this.message;
    }

    public void setMessage(SearchColumnStringField[] message) {
        this.message = message;
    }

    public SearchColumnStringField getMessage(int i) {
        return this.message[i];
    }

    public void setMessage(int i, SearchColumnStringField _value) {
        this.message[i] = _value;
    }

    public SearchColumnDateField[] getMessageDate() {
        return this.messageDate;
    }

    public void setMessageDate(SearchColumnDateField[] messageDate) {
        this.messageDate = messageDate;
    }

    public SearchColumnDateField getMessageDate(int i) {
        return this.messageDate[i];
    }

    public void setMessageDate(int i, SearchColumnDateField _value) {
        this.messageDate[i] = _value;
    }

    public SearchColumnEnumSelectField[] getMessageType() {
        return this.messageType;
    }

    public void setMessageType(SearchColumnEnumSelectField[] messageType) {
        this.messageType = messageType;
    }

    public SearchColumnEnumSelectField getMessageType(int i) {
        return this.messageType[i];
    }

    public void setMessageType(int i, SearchColumnEnumSelectField _value) {
        this.messageType[i] = _value;
    }

    public SearchColumnSelectField[] getRecipient() {
        return this.recipient;
    }

    public void setRecipient(SearchColumnSelectField[] recipient) {
        this.recipient = recipient;
    }

    public SearchColumnSelectField getRecipient(int i) {
        return this.recipient[i];
    }

    public void setRecipient(int i, SearchColumnSelectField _value) {
        this.recipient[i] = _value;
    }

    public SearchColumnStringField[] getRecipientEmail() {
        return this.recipientEmail;
    }

    public void setRecipientEmail(SearchColumnStringField[] recipientEmail) {
        this.recipientEmail = recipientEmail;
    }

    public SearchColumnStringField getRecipientEmail(int i) {
        return this.recipientEmail[i];
    }

    public void setRecipientEmail(int i, SearchColumnStringField _value) {
        this.recipientEmail[i] = _value;
    }

    public SearchColumnStringField[] getSubject() {
        return this.subject;
    }

    public void setSubject(SearchColumnStringField[] subject) {
        this.subject = subject;
    }

    public SearchColumnStringField getSubject(int i) {
        return this.subject[i];
    }

    public void setSubject(int i, SearchColumnStringField _value) {
        this.subject[i] = _value;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof MessageSearchRowBasic)) {
            return false;
        }
        MessageSearchRowBasic other = (MessageSearchRowBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.author == null && other.getAuthor() == null || this.author != null && Arrays.equals(this.author, other.getAuthor())) && (this.authorEmail == null && other.getAuthorEmail() == null || this.authorEmail != null && Arrays.equals(this.authorEmail, other.getAuthorEmail())) && (this.bcc == null && other.getBcc() == null || this.bcc != null && Arrays.equals(this.bcc, other.getBcc())) && (this.cc == null && other.getCc() == null || this.cc != null && Arrays.equals(this.cc, other.getCc())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && Arrays.equals(this.externalId, other.getExternalId())) && (this.hasAttachment == null && other.getHasAttachment() == null || this.hasAttachment != null && Arrays.equals(this.hasAttachment, other.getHasAttachment())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && Arrays.equals(this.internalId, other.getInternalId())) && (this.internalOnly == null && other.getInternalOnly() == null || this.internalOnly != null && Arrays.equals(this.internalOnly, other.getInternalOnly())) && (this.isEmailed == null && other.getIsEmailed() == null || this.isEmailed != null && Arrays.equals(this.isEmailed, other.getIsEmailed())) && (this.isIncoming == null && other.getIsIncoming() == null || this.isIncoming != null && Arrays.equals(this.isIncoming, other.getIsIncoming())) && (this.message == null && other.getMessage() == null || this.message != null && Arrays.equals(this.message, other.getMessage())) && (this.messageDate == null && other.getMessageDate() == null || this.messageDate != null && Arrays.equals(this.messageDate, other.getMessageDate())) && (this.messageType == null && other.getMessageType() == null || this.messageType != null && Arrays.equals(this.messageType, other.getMessageType())) && (this.recipient == null && other.getRecipient() == null || this.recipient != null && Arrays.equals(this.recipient, other.getRecipient())) && (this.recipientEmail == null && other.getRecipientEmail() == null || this.recipientEmail != null && Arrays.equals(this.recipientEmail, other.getRecipientEmail())) && (this.subject == null && other.getSubject() == null || this.subject != null && Arrays.equals(this.subject, other.getSubject()));
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
        if (this.getAuthor() != null) {
            for (i = 0; i < Array.getLength(this.getAuthor()); ++i) {
                obj = Array.get(this.getAuthor(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getAuthorEmail() != null) {
            for (i = 0; i < Array.getLength(this.getAuthorEmail()); ++i) {
                obj = Array.get(this.getAuthorEmail(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBcc() != null) {
            for (i = 0; i < Array.getLength(this.getBcc()); ++i) {
                obj = Array.get(this.getBcc(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCc() != null) {
            for (i = 0; i < Array.getLength(this.getCc()); ++i) {
                obj = Array.get(this.getCc(), i);
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
        if (this.getHasAttachment() != null) {
            for (i = 0; i < Array.getLength(this.getHasAttachment()); ++i) {
                obj = Array.get(this.getHasAttachment(), i);
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
        if (this.getInternalOnly() != null) {
            for (i = 0; i < Array.getLength(this.getInternalOnly()); ++i) {
                obj = Array.get(this.getInternalOnly(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsEmailed() != null) {
            for (i = 0; i < Array.getLength(this.getIsEmailed()); ++i) {
                obj = Array.get(this.getIsEmailed(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsIncoming() != null) {
            for (i = 0; i < Array.getLength(this.getIsIncoming()); ++i) {
                obj = Array.get(this.getIsIncoming(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getMessage() != null) {
            for (i = 0; i < Array.getLength(this.getMessage()); ++i) {
                obj = Array.get(this.getMessage(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getMessageDate() != null) {
            for (i = 0; i < Array.getLength(this.getMessageDate()); ++i) {
                obj = Array.get(this.getMessageDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getMessageType() != null) {
            for (i = 0; i < Array.getLength(this.getMessageType()); ++i) {
                obj = Array.get(this.getMessageType(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRecipient() != null) {
            for (i = 0; i < Array.getLength(this.getRecipient()); ++i) {
                obj = Array.get(this.getRecipient(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRecipientEmail() != null) {
            for (i = 0; i < Array.getLength(this.getRecipientEmail()); ++i) {
                obj = Array.get(this.getRecipientEmail(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSubject() != null) {
            for (i = 0; i < Array.getLength(this.getSubject()); ++i) {
                obj = Array.get(this.getSubject(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "MessageSearchRowBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("author");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "author"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("authorEmail");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "authorEmail"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("bcc");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "bcc"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("cc");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "cc"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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
        elemField.setFieldName("hasAttachment");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "hasAttachment"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
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
        elemField.setFieldName("internalOnly");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "internalOnly"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isEmailed");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isEmailed"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isIncoming");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isIncoming"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "message"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("messageDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "messageDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("messageType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "messageType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recipient");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "recipient"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recipientEmail");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "recipientEmail"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subject");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "subject"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

