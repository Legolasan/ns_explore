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

public class CustomRecordTypeTabs
implements Serializable {
    private String tabTitle;
    private RecordRef tabParent;
    private LanguageValueList tabTitleLanguageValueList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(CustomRecordTypeTabs.class, true);

    public CustomRecordTypeTabs() {
    }

    public CustomRecordTypeTabs(String tabTitle, RecordRef tabParent, LanguageValueList tabTitleLanguageValueList) {
        this.tabTitle = tabTitle;
        this.tabParent = tabParent;
        this.tabTitleLanguageValueList = tabTitleLanguageValueList;
    }

    public String getTabTitle() {
        return this.tabTitle;
    }

    public void setTabTitle(String tabTitle) {
        this.tabTitle = tabTitle;
    }

    public RecordRef getTabParent() {
        return this.tabParent;
    }

    public void setTabParent(RecordRef tabParent) {
        this.tabParent = tabParent;
    }

    public LanguageValueList getTabTitleLanguageValueList() {
        return this.tabTitleLanguageValueList;
    }

    public void setTabTitleLanguageValueList(LanguageValueList tabTitleLanguageValueList) {
        this.tabTitleLanguageValueList = tabTitleLanguageValueList;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CustomRecordTypeTabs)) {
            return false;
        }
        CustomRecordTypeTabs other = (CustomRecordTypeTabs)obj;
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
        boolean _equals = (this.tabTitle == null && other.getTabTitle() == null || this.tabTitle != null && this.tabTitle.equals(other.getTabTitle())) && (this.tabParent == null && other.getTabParent() == null || this.tabParent != null && this.tabParent.equals(other.getTabParent())) && (this.tabTitleLanguageValueList == null && other.getTabTitleLanguageValueList() == null || this.tabTitleLanguageValueList != null && this.tabTitleLanguageValueList.equals(other.getTabTitleLanguageValueList()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getTabTitle() != null) {
            _hashCode += this.getTabTitle().hashCode();
        }
        if (this.getTabParent() != null) {
            _hashCode += this.getTabParent().hashCode();
        }
        if (this.getTabTitleLanguageValueList() != null) {
            _hashCode += this.getTabTitleLanguageValueList().hashCode();
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
        typeDesc.setXmlType(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "CustomRecordTypeTabs"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("tabTitle");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "tabTitle"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("tabParent");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "tabParent"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("tabTitleLanguageValueList");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "tabTitleLanguageValueList"));
        elemField.setXmlType(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "LanguageValueList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

