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

import com.netsuite.suitetalk.proxy.v2022_1.general.communication.types.NoteDirection;
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

public class Note
extends Record
implements Serializable {
    private String title;
    private RecordRef noteType;
    private NoteDirection direction;
    private Calendar noteDate;
    private String note;
    private Calendar lastModifiedDate;
    private RecordRef activity;
    private RecordRef author;
    private RecordRef entity;
    private RecordRef folder;
    private RecordRef item;
    private RecordRef media;
    private RecordRef record;
    private RecordRef recordType;
    private RecordRef topic;
    private RecordRef transaction;
    private RecordRef customForm;
    private CustomFieldList customFieldList;
    private String internalId;
    private String externalId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(Note.class, true);

    public Note() {
    }

    public Note(NullField nullFieldList, String internalId, String externalId, String title, RecordRef noteType, NoteDirection direction, Calendar noteDate, String note, Calendar lastModifiedDate, RecordRef activity, RecordRef author, RecordRef entity, RecordRef folder, RecordRef item, RecordRef media, RecordRef record, RecordRef recordType, RecordRef topic, RecordRef transaction, RecordRef customForm, CustomFieldList customFieldList) {
        super(nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.title = title;
        this.noteType = noteType;
        this.direction = direction;
        this.noteDate = noteDate;
        this.note = note;
        this.lastModifiedDate = lastModifiedDate;
        this.activity = activity;
        this.author = author;
        this.entity = entity;
        this.folder = folder;
        this.item = item;
        this.media = media;
        this.record = record;
        this.recordType = recordType;
        this.topic = topic;
        this.transaction = transaction;
        this.customForm = customForm;
        this.customFieldList = customFieldList;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public RecordRef getNoteType() {
        return this.noteType;
    }

    public void setNoteType(RecordRef noteType) {
        this.noteType = noteType;
    }

    public NoteDirection getDirection() {
        return this.direction;
    }

    public void setDirection(NoteDirection direction) {
        this.direction = direction;
    }

    public Calendar getNoteDate() {
        return this.noteDate;
    }

    public void setNoteDate(Calendar noteDate) {
        this.noteDate = noteDate;
    }

    public String getNote() {
        return this.note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Calendar getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    public void setLastModifiedDate(Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public RecordRef getActivity() {
        return this.activity;
    }

    public void setActivity(RecordRef activity) {
        this.activity = activity;
    }

    public RecordRef getAuthor() {
        return this.author;
    }

    public void setAuthor(RecordRef author) {
        this.author = author;
    }

    public RecordRef getEntity() {
        return this.entity;
    }

    public void setEntity(RecordRef entity) {
        this.entity = entity;
    }

    public RecordRef getFolder() {
        return this.folder;
    }

    public void setFolder(RecordRef folder) {
        this.folder = folder;
    }

    public RecordRef getItem() {
        return this.item;
    }

    public void setItem(RecordRef item) {
        this.item = item;
    }

    public RecordRef getMedia() {
        return this.media;
    }

    public void setMedia(RecordRef media) {
        this.media = media;
    }

    public RecordRef getRecord() {
        return this.record;
    }

    public void setRecord(RecordRef record) {
        this.record = record;
    }

    public RecordRef getRecordType() {
        return this.recordType;
    }

    public void setRecordType(RecordRef recordType) {
        this.recordType = recordType;
    }

    public RecordRef getTopic() {
        return this.topic;
    }

    public void setTopic(RecordRef topic) {
        this.topic = topic;
    }

    public RecordRef getTransaction() {
        return this.transaction;
    }

    public void setTransaction(RecordRef transaction) {
        this.transaction = transaction;
    }

    public RecordRef getCustomForm() {
        return this.customForm;
    }

    public void setCustomForm(RecordRef customForm) {
        this.customForm = customForm;
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
        if (!(obj instanceof Note)) {
            return false;
        }
        Note other = (Note)obj;
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
        boolean _equals = super.equals(obj) && (this.title == null && other.getTitle() == null || this.title != null && this.title.equals(other.getTitle())) && (this.noteType == null && other.getNoteType() == null || this.noteType != null && this.noteType.equals(other.getNoteType())) && (this.direction == null && other.getDirection() == null || this.direction != null && this.direction.equals(other.getDirection())) && (this.noteDate == null && other.getNoteDate() == null || this.noteDate != null && this.noteDate.equals(other.getNoteDate())) && (this.note == null && other.getNote() == null || this.note != null && this.note.equals(other.getNote())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && this.lastModifiedDate.equals(other.getLastModifiedDate())) && (this.activity == null && other.getActivity() == null || this.activity != null && this.activity.equals(other.getActivity())) && (this.author == null && other.getAuthor() == null || this.author != null && this.author.equals(other.getAuthor())) && (this.entity == null && other.getEntity() == null || this.entity != null && this.entity.equals(other.getEntity())) && (this.folder == null && other.getFolder() == null || this.folder != null && this.folder.equals(other.getFolder())) && (this.item == null && other.getItem() == null || this.item != null && this.item.equals(other.getItem())) && (this.media == null && other.getMedia() == null || this.media != null && this.media.equals(other.getMedia())) && (this.record == null && other.getRecord() == null || this.record != null && this.record.equals(other.getRecord())) && (this.recordType == null && other.getRecordType() == null || this.recordType != null && this.recordType.equals(other.getRecordType())) && (this.topic == null && other.getTopic() == null || this.topic != null && this.topic.equals(other.getTopic())) && (this.transaction == null && other.getTransaction() == null || this.transaction != null && this.transaction.equals(other.getTransaction())) && (this.customForm == null && other.getCustomForm() == null || this.customForm != null && this.customForm.equals(other.getCustomForm())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
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
        if (this.getTitle() != null) {
            _hashCode += this.getTitle().hashCode();
        }
        if (this.getNoteType() != null) {
            _hashCode += this.getNoteType().hashCode();
        }
        if (this.getDirection() != null) {
            _hashCode += this.getDirection().hashCode();
        }
        if (this.getNoteDate() != null) {
            _hashCode += this.getNoteDate().hashCode();
        }
        if (this.getNote() != null) {
            _hashCode += this.getNote().hashCode();
        }
        if (this.getLastModifiedDate() != null) {
            _hashCode += this.getLastModifiedDate().hashCode();
        }
        if (this.getActivity() != null) {
            _hashCode += this.getActivity().hashCode();
        }
        if (this.getAuthor() != null) {
            _hashCode += this.getAuthor().hashCode();
        }
        if (this.getEntity() != null) {
            _hashCode += this.getEntity().hashCode();
        }
        if (this.getFolder() != null) {
            _hashCode += this.getFolder().hashCode();
        }
        if (this.getItem() != null) {
            _hashCode += this.getItem().hashCode();
        }
        if (this.getMedia() != null) {
            _hashCode += this.getMedia().hashCode();
        }
        if (this.getRecord() != null) {
            _hashCode += this.getRecord().hashCode();
        }
        if (this.getRecordType() != null) {
            _hashCode += this.getRecordType().hashCode();
        }
        if (this.getTopic() != null) {
            _hashCode += this.getTopic().hashCode();
        }
        if (this.getTransaction() != null) {
            _hashCode += this.getTransaction().hashCode();
        }
        if (this.getCustomForm() != null) {
            _hashCode += this.getCustomForm().hashCode();
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
        typeDesc.setXmlType(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "Note"));
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
        elemField.setFieldName("title");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "title"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("noteType");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "noteType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("direction");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "direction"));
        elemField.setXmlType(new QName("urn:types.communication_2022_1.general.webservices.netsuite.com", "NoteDirection"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("noteDate");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "noteDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("note");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "note"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("activity");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "activity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("author");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "author"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("entity");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "entity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("folder");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "folder"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "item"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("media");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "media"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("record");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "record"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recordType");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "recordType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("topic");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "topic"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("customForm");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "CustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

