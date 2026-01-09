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
package com.netsuite.suitetalk.proxy.v2022_1.platform.core;

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.InitializeAuxRef;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.InitializeRef;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.InitializeRefList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.types.InitializeType;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class InitializeRecord
implements Serializable {
    private InitializeType type;
    private InitializeRef reference;
    private InitializeAuxRef auxReference;
    private InitializeRefList referenceList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(InitializeRecord.class, true);

    public InitializeRecord() {
    }

    public InitializeRecord(InitializeType type, InitializeRef reference, InitializeAuxRef auxReference, InitializeRefList referenceList) {
        this.type = type;
        this.reference = reference;
        this.auxReference = auxReference;
        this.referenceList = referenceList;
    }

    public InitializeType getType() {
        return this.type;
    }

    public void setType(InitializeType type) {
        this.type = type;
    }

    public InitializeRef getReference() {
        return this.reference;
    }

    public void setReference(InitializeRef reference) {
        this.reference = reference;
    }

    public InitializeAuxRef getAuxReference() {
        return this.auxReference;
    }

    public void setAuxReference(InitializeAuxRef auxReference) {
        this.auxReference = auxReference;
    }

    public InitializeRefList getReferenceList() {
        return this.referenceList;
    }

    public void setReferenceList(InitializeRefList referenceList) {
        this.referenceList = referenceList;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof InitializeRecord)) {
            return false;
        }
        InitializeRecord other = (InitializeRecord)obj;
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
        boolean _equals = (this.type == null && other.getType() == null || this.type != null && this.type.equals(other.getType())) && (this.reference == null && other.getReference() == null || this.reference != null && this.reference.equals(other.getReference())) && (this.auxReference == null && other.getAuxReference() == null || this.auxReference != null && this.auxReference.equals(other.getAuxReference())) && (this.referenceList == null && other.getReferenceList() == null || this.referenceList != null && this.referenceList.equals(other.getReferenceList()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getType() != null) {
            _hashCode += this.getType().hashCode();
        }
        if (this.getReference() != null) {
            _hashCode += this.getReference().hashCode();
        }
        if (this.getAuxReference() != null) {
            _hashCode += this.getAuxReference().hashCode();
        }
        if (this.getReferenceList() != null) {
            _hashCode += this.getReferenceList().hashCode();
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
        typeDesc.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "InitializeRecord"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "type"));
        elemField.setXmlType(new QName("urn:types.core_2022_1.platform.webservices.netsuite.com", "InitializeType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("reference");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "reference"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "InitializeRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("auxReference");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "auxReference"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "InitializeAuxRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("referenceList");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "referenceList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "InitializeRefList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

