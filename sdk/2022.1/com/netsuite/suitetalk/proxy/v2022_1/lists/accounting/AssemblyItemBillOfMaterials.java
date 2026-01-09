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
package com.netsuite.suitetalk.proxy.v2022_1.lists.accounting;

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRefList;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class AssemblyItemBillOfMaterials
implements Serializable {
    private RecordRef billOfMaterials;
    private String currentRevision;
    private Boolean masterDefault;
    private RecordRefList defaultForLocationList;
    private String inactive;
    private String memo;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(AssemblyItemBillOfMaterials.class, true);

    public AssemblyItemBillOfMaterials() {
    }

    public AssemblyItemBillOfMaterials(RecordRef billOfMaterials, String currentRevision, Boolean masterDefault, RecordRefList defaultForLocationList, String inactive, String memo) {
        this.billOfMaterials = billOfMaterials;
        this.currentRevision = currentRevision;
        this.masterDefault = masterDefault;
        this.defaultForLocationList = defaultForLocationList;
        this.inactive = inactive;
        this.memo = memo;
    }

    public RecordRef getBillOfMaterials() {
        return this.billOfMaterials;
    }

    public void setBillOfMaterials(RecordRef billOfMaterials) {
        this.billOfMaterials = billOfMaterials;
    }

    public String getCurrentRevision() {
        return this.currentRevision;
    }

    public void setCurrentRevision(String currentRevision) {
        this.currentRevision = currentRevision;
    }

    public Boolean getMasterDefault() {
        return this.masterDefault;
    }

    public void setMasterDefault(Boolean masterDefault) {
        this.masterDefault = masterDefault;
    }

    public RecordRefList getDefaultForLocationList() {
        return this.defaultForLocationList;
    }

    public void setDefaultForLocationList(RecordRefList defaultForLocationList) {
        this.defaultForLocationList = defaultForLocationList;
    }

    public String getInactive() {
        return this.inactive;
    }

    public void setInactive(String inactive) {
        this.inactive = inactive;
    }

    public String getMemo() {
        return this.memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof AssemblyItemBillOfMaterials)) {
            return false;
        }
        AssemblyItemBillOfMaterials other = (AssemblyItemBillOfMaterials)obj;
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
        boolean _equals = (this.billOfMaterials == null && other.getBillOfMaterials() == null || this.billOfMaterials != null && this.billOfMaterials.equals(other.getBillOfMaterials())) && (this.currentRevision == null && other.getCurrentRevision() == null || this.currentRevision != null && this.currentRevision.equals(other.getCurrentRevision())) && (this.masterDefault == null && other.getMasterDefault() == null || this.masterDefault != null && this.masterDefault.equals(other.getMasterDefault())) && (this.defaultForLocationList == null && other.getDefaultForLocationList() == null || this.defaultForLocationList != null && this.defaultForLocationList.equals(other.getDefaultForLocationList())) && (this.inactive == null && other.getInactive() == null || this.inactive != null && this.inactive.equals(other.getInactive())) && (this.memo == null && other.getMemo() == null || this.memo != null && this.memo.equals(other.getMemo()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getBillOfMaterials() != null) {
            _hashCode += this.getBillOfMaterials().hashCode();
        }
        if (this.getCurrentRevision() != null) {
            _hashCode += this.getCurrentRevision().hashCode();
        }
        if (this.getMasterDefault() != null) {
            _hashCode += this.getMasterDefault().hashCode();
        }
        if (this.getDefaultForLocationList() != null) {
            _hashCode += this.getDefaultForLocationList().hashCode();
        }
        if (this.getInactive() != null) {
            _hashCode += this.getInactive().hashCode();
        }
        if (this.getMemo() != null) {
            _hashCode += this.getMemo().hashCode();
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
        typeDesc.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "AssemblyItemBillOfMaterials"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("billOfMaterials");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "billOfMaterials"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("currentRevision");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "currentRevision"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("masterDefault");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "masterDefault"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("defaultForLocationList");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "defaultForLocationList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRefList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("inactive");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "inactive"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

