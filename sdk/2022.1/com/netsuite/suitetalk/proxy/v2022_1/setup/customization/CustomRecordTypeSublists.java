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
package com.netsuite.suitetalk.proxy.v2022_1.setup.customization;

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import com.netsuite.suitetalk.proxy.v2022_1.setup.customization.LanguageValueList;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class CustomRecordTypeSublists
implements Serializable {
    private RecordRef recordSearch;
    private String recordDescr;
    private LanguageValueList recordDescrLanguageValueList;
    private RecordRef recordTab;
    private String recordId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(CustomRecordTypeSublists.class, true);

    public CustomRecordTypeSublists() {
    }

    public CustomRecordTypeSublists(RecordRef recordSearch, String recordDescr, LanguageValueList recordDescrLanguageValueList, RecordRef recordTab, String recordId) {
        this.recordSearch = recordSearch;
        this.recordDescr = recordDescr;
        this.recordDescrLanguageValueList = recordDescrLanguageValueList;
        this.recordTab = recordTab;
        this.recordId = recordId;
    }

    public RecordRef getRecordSearch() {
        return this.recordSearch;
    }

    public void setRecordSearch(RecordRef recordSearch) {
        this.recordSearch = recordSearch;
    }

    public String getRecordDescr() {
        return this.recordDescr;
    }

    public void setRecordDescr(String recordDescr) {
        this.recordDescr = recordDescr;
    }

    public LanguageValueList getRecordDescrLanguageValueList() {
        return this.recordDescrLanguageValueList;
    }

    public void setRecordDescrLanguageValueList(LanguageValueList recordDescrLanguageValueList) {
        this.recordDescrLanguageValueList = recordDescrLanguageValueList;
    }

    public RecordRef getRecordTab() {
        return this.recordTab;
    }

    public void setRecordTab(RecordRef recordTab) {
        this.recordTab = recordTab;
    }

    public String getRecordId() {
        return this.recordId;
    }

    public void setRecordId(String recordId) {
        this.recordId = recordId;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CustomRecordTypeSublists)) {
            return false;
        }
        CustomRecordTypeSublists other = (CustomRecordTypeSublists)obj;
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
        boolean _equals = (this.recordSearch == null && other.getRecordSearch() == null || this.recordSearch != null && this.recordSearch.equals(other.getRecordSearch())) && (this.recordDescr == null && other.getRecordDescr() == null || this.recordDescr != null && this.recordDescr.equals(other.getRecordDescr())) && (this.recordDescrLanguageValueList == null && other.getRecordDescrLanguageValueList() == null || this.recordDescrLanguageValueList != null && this.recordDescrLanguageValueList.equals(other.getRecordDescrLanguageValueList())) && (this.recordTab == null && other.getRecordTab() == null || this.recordTab != null && this.recordTab.equals(other.getRecordTab())) && (this.recordId == null && other.getRecordId() == null || this.recordId != null && this.recordId.equals(other.getRecordId()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getRecordSearch() != null) {
            _hashCode += this.getRecordSearch().hashCode();
        }
        if (this.getRecordDescr() != null) {
            _hashCode += this.getRecordDescr().hashCode();
        }
        if (this.getRecordDescrLanguageValueList() != null) {
            _hashCode += this.getRecordDescrLanguageValueList().hashCode();
        }
        if (this.getRecordTab() != null) {
            _hashCode += this.getRecordTab().hashCode();
        }
        if (this.getRecordId() != null) {
            _hashCode += this.getRecordId().hashCode();
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
        typeDesc.setXmlType(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "CustomRecordTypeSublists"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("recordSearch");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "recordSearch"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recordDescr");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "recordDescr"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recordDescrLanguageValueList");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "recordDescrLanguageValueList"));
        elemField.setXmlType(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "LanguageValueList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recordTab");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "recordTab"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("recordId");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "recordId"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

