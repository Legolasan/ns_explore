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
import java.util.Calendar;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class LotNumberedInventoryItemNumbers
implements Serializable {
    private RecordRef serialNumber;
    private Double quantityOnHand;
    private Calendar expirationDate;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(LotNumberedInventoryItemNumbers.class, true);

    public LotNumberedInventoryItemNumbers() {
    }

    public LotNumberedInventoryItemNumbers(RecordRef serialNumber, Double quantityOnHand, Calendar expirationDate) {
        this.serialNumber = serialNumber;
        this.quantityOnHand = quantityOnHand;
        this.expirationDate = expirationDate;
    }

    public RecordRef getSerialNumber() {
        return this.serialNumber;
    }

    public void setSerialNumber(RecordRef serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Double getQuantityOnHand() {
        return this.quantityOnHand;
    }

    public void setQuantityOnHand(Double quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }

    public Calendar getExpirationDate() {
        return this.expirationDate;
    }

    public void setExpirationDate(Calendar expirationDate) {
        this.expirationDate = expirationDate;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof LotNumberedInventoryItemNumbers)) {
            return false;
        }
        LotNumberedInventoryItemNumbers other = (LotNumberedInventoryItemNumbers)obj;
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
        boolean _equals = (this.serialNumber == null && other.getSerialNumber() == null || this.serialNumber != null && this.serialNumber.equals(other.getSerialNumber())) && (this.quantityOnHand == null && other.getQuantityOnHand() == null || this.quantityOnHand != null && this.quantityOnHand.equals(other.getQuantityOnHand())) && (this.expirationDate == null && other.getExpirationDate() == null || this.expirationDate != null && this.expirationDate.equals(other.getExpirationDate()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getSerialNumber() != null) {
            _hashCode += this.getSerialNumber().hashCode();
        }
        if (this.getQuantityOnHand() != null) {
            _hashCode += this.getQuantityOnHand().hashCode();
        }
        if (this.getExpirationDate() != null) {
            _hashCode += this.getExpirationDate().hashCode();
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
        typeDesc.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "LotNumberedInventoryItemNumbers"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("serialNumber");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "serialNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityOnHand");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "quantityOnHand"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "expirationDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

