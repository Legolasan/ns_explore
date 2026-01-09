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
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class CustomRecordTypeChildren
implements Serializable {
    private String childDescr;
    private RecordRef childTab;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(CustomRecordTypeChildren.class, true);

    public CustomRecordTypeChildren() {
    }

    public CustomRecordTypeChildren(String childDescr, RecordRef childTab) {
        this.childDescr = childDescr;
        this.childTab = childTab;
    }

    public String getChildDescr() {
        return this.childDescr;
    }

    public void setChildDescr(String childDescr) {
        this.childDescr = childDescr;
    }

    public RecordRef getChildTab() {
        return this.childTab;
    }

    public void setChildTab(RecordRef childTab) {
        this.childTab = childTab;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CustomRecordTypeChildren)) {
            return false;
        }
        CustomRecordTypeChildren other = (CustomRecordTypeChildren)obj;
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
        boolean _equals = (this.childDescr == null && other.getChildDescr() == null || this.childDescr != null && this.childDescr.equals(other.getChildDescr())) && (this.childTab == null && other.getChildTab() == null || this.childTab != null && this.childTab.equals(other.getChildTab()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getChildDescr() != null) {
            _hashCode += this.getChildDescr().hashCode();
        }
        if (this.getChildTab() != null) {
            _hashCode += this.getChildTab().hashCode();
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
        typeDesc.setXmlType(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "CustomRecordTypeChildren"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("childDescr");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "childDescr"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("childTab");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "childTab"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

