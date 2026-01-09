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
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class InventoryItemBinNumber
implements Serializable {
    private RecordRef binNumber;
    private String onHand;
    private String onHandAvail;
    private String location;
    private Boolean preferredBin;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(InventoryItemBinNumber.class, true);

    public InventoryItemBinNumber() {
    }

    public InventoryItemBinNumber(RecordRef binNumber, String onHand, String onHandAvail, String location, Boolean preferredBin) {
        this.binNumber = binNumber;
        this.onHand = onHand;
        this.onHandAvail = onHandAvail;
        this.location = location;
        this.preferredBin = preferredBin;
    }

    public RecordRef getBinNumber() {
        return this.binNumber;
    }

    public void setBinNumber(RecordRef binNumber) {
        this.binNumber = binNumber;
    }

    public String getOnHand() {
        return this.onHand;
    }

    public void setOnHand(String onHand) {
        this.onHand = onHand;
    }

    public String getOnHandAvail() {
        return this.onHandAvail;
    }

    public void setOnHandAvail(String onHandAvail) {
        this.onHandAvail = onHandAvail;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Boolean getPreferredBin() {
        return this.preferredBin;
    }

    public void setPreferredBin(Boolean preferredBin) {
        this.preferredBin = preferredBin;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof InventoryItemBinNumber)) {
            return false;
        }
        InventoryItemBinNumber other = (InventoryItemBinNumber)obj;
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
        boolean _equals = (this.binNumber == null && other.getBinNumber() == null || this.binNumber != null && this.binNumber.equals(other.getBinNumber())) && (this.onHand == null && other.getOnHand() == null || this.onHand != null && this.onHand.equals(other.getOnHand())) && (this.onHandAvail == null && other.getOnHandAvail() == null || this.onHandAvail != null && this.onHandAvail.equals(other.getOnHandAvail())) && (this.location == null && other.getLocation() == null || this.location != null && this.location.equals(other.getLocation())) && (this.preferredBin == null && other.getPreferredBin() == null || this.preferredBin != null && this.preferredBin.equals(other.getPreferredBin()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getBinNumber() != null) {
            _hashCode += this.getBinNumber().hashCode();
        }
        if (this.getOnHand() != null) {
            _hashCode += this.getOnHand().hashCode();
        }
        if (this.getOnHandAvail() != null) {
            _hashCode += this.getOnHandAvail().hashCode();
        }
        if (this.getLocation() != null) {
            _hashCode += this.getLocation().hashCode();
        }
        if (this.getPreferredBin() != null) {
            _hashCode += this.getPreferredBin().hashCode();
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
        typeDesc.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "InventoryItemBinNumber"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("binNumber");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "binNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("onHand");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "onHand"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("onHandAvail");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "onHandAvail"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "location"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("preferredBin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "preferredBin"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

