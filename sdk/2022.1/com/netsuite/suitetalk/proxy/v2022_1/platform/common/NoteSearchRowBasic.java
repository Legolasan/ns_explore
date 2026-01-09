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

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnCustomFieldList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnDateField;
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

public class NoteSearchRowBasic
extends SearchRowBasic
implements Serializable {
    private SearchColumnSelectField[] author;
    private SearchColumnStringField[] direction;
    private SearchColumnSelectField[] externalId;
    private SearchColumnSelectField[] internalId;
    private SearchColumnStringField[] note;
    private SearchColumnDateField[] noteDate;
    private SearchColumnStringField[] noteType;
    private SearchColumnStringField[] title;
    private SearchColumnCustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(NoteSearchRowBasic.class, true);

    public NoteSearchRowBasic() {
    }

    public NoteSearchRowBasic(SearchColumnSelectField[] author, SearchColumnStringField[] direction, SearchColumnSelectField[] externalId, SearchColumnSelectField[] internalId, SearchColumnStringField[] note, SearchColumnDateField[] noteDate, SearchColumnStringField[] noteType, SearchColumnStringField[] title, SearchColumnCustomFieldList customFieldList) {
        this.author = author;
        this.direction = direction;
        this.externalId = externalId;
        this.internalId = internalId;
        this.note = note;
        this.noteDate = noteDate;
        this.noteType = noteType;
        this.title = title;
        this.customFieldList = customFieldList;
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

    public SearchColumnStringField[] getDirection() {
        return this.direction;
    }

    public void setDirection(SearchColumnStringField[] direction) {
        this.direction = direction;
    }

    public SearchColumnStringField getDirection(int i) {
        return this.direction[i];
    }

    public void setDirection(int i, SearchColumnStringField _value) {
        this.direction[i] = _value;
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

    public SearchColumnStringField[] getNote() {
        return this.note;
    }

    public void setNote(SearchColumnStringField[] note) {
        this.note = note;
    }

    public SearchColumnStringField getNote(int i) {
        return this.note[i];
    }

    public void setNote(int i, SearchColumnStringField _value) {
        this.note[i] = _value;
    }

    public SearchColumnDateField[] getNoteDate() {
        return this.noteDate;
    }

    public void setNoteDate(SearchColumnDateField[] noteDate) {
        this.noteDate = noteDate;
    }

    public SearchColumnDateField getNoteDate(int i) {
        return this.noteDate[i];
    }

    public void setNoteDate(int i, SearchColumnDateField _value) {
        this.noteDate[i] = _value;
    }

    public SearchColumnStringField[] getNoteType() {
        return this.noteType;
    }

    public void setNoteType(SearchColumnStringField[] noteType) {
        this.noteType = noteType;
    }

    public SearchColumnStringField getNoteType(int i) {
        return this.noteType[i];
    }

    public void setNoteType(int i, SearchColumnStringField _value) {
        this.noteType[i] = _value;
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
        if (!(obj instanceof NoteSearchRowBasic)) {
            return false;
        }
        NoteSearchRowBasic other = (NoteSearchRowBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.author == null && other.getAuthor() == null || this.author != null && Arrays.equals(this.author, other.getAuthor())) && (this.direction == null && other.getDirection() == null || this.direction != null && Arrays.equals(this.direction, other.getDirection())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && Arrays.equals(this.externalId, other.getExternalId())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && Arrays.equals(this.internalId, other.getInternalId())) && (this.note == null && other.getNote() == null || this.note != null && Arrays.equals(this.note, other.getNote())) && (this.noteDate == null && other.getNoteDate() == null || this.noteDate != null && Arrays.equals(this.noteDate, other.getNoteDate())) && (this.noteType == null && other.getNoteType() == null || this.noteType != null && Arrays.equals(this.noteType, other.getNoteType())) && (this.title == null && other.getTitle() == null || this.title != null && Arrays.equals(this.title, other.getTitle())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
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
        if (this.getDirection() != null) {
            for (i = 0; i < Array.getLength(this.getDirection()); ++i) {
                obj = Array.get(this.getDirection(), i);
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
        if (this.getInternalId() != null) {
            for (i = 0; i < Array.getLength(this.getInternalId()); ++i) {
                obj = Array.get(this.getInternalId(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getNote() != null) {
            for (i = 0; i < Array.getLength(this.getNote()); ++i) {
                obj = Array.get(this.getNote(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getNoteDate() != null) {
            for (i = 0; i < Array.getLength(this.getNoteDate()); ++i) {
                obj = Array.get(this.getNoteDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getNoteType() != null) {
            for (i = 0; i < Array.getLength(this.getNoteType()); ++i) {
                obj = Array.get(this.getNoteType(), i);
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "NoteSearchRowBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("author");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "author"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("direction");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "direction"));
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
        elemField.setFieldName("internalId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("note");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "note"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("noteDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "noteDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("noteType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "noteType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
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

