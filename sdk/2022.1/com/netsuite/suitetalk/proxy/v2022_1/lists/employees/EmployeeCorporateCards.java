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
package com.netsuite.suitetalk.proxy.v2022_1.lists.employees;

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

public class EmployeeCorporateCards
implements Serializable {
    private String embossedName;
    private Calendar expiration;
    private RecordRef corporateCardProfile;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(EmployeeCorporateCards.class, true);

    public EmployeeCorporateCards() {
    }

    public EmployeeCorporateCards(String embossedName, Calendar expiration, RecordRef corporateCardProfile) {
        this.embossedName = embossedName;
        this.expiration = expiration;
        this.corporateCardProfile = corporateCardProfile;
    }

    public String getEmbossedName() {
        return this.embossedName;
    }

    public void setEmbossedName(String embossedName) {
        this.embossedName = embossedName;
    }

    public Calendar getExpiration() {
        return this.expiration;
    }

    public void setExpiration(Calendar expiration) {
        this.expiration = expiration;
    }

    public RecordRef getCorporateCardProfile() {
        return this.corporateCardProfile;
    }

    public void setCorporateCardProfile(RecordRef corporateCardProfile) {
        this.corporateCardProfile = corporateCardProfile;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof EmployeeCorporateCards)) {
            return false;
        }
        EmployeeCorporateCards other = (EmployeeCorporateCards)obj;
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
        boolean _equals = (this.embossedName == null && other.getEmbossedName() == null || this.embossedName != null && this.embossedName.equals(other.getEmbossedName())) && (this.expiration == null && other.getExpiration() == null || this.expiration != null && this.expiration.equals(other.getExpiration())) && (this.corporateCardProfile == null && other.getCorporateCardProfile() == null || this.corporateCardProfile != null && this.corporateCardProfile.equals(other.getCorporateCardProfile()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getEmbossedName() != null) {
            _hashCode += this.getEmbossedName().hashCode();
        }
        if (this.getExpiration() != null) {
            _hashCode += this.getExpiration().hashCode();
        }
        if (this.getCorporateCardProfile() != null) {
            _hashCode += this.getCorporateCardProfile().hashCode();
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
        typeDesc.setXmlType(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "EmployeeCorporateCards"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("embossedName");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "embossedName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("expiration");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "expiration"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("corporateCardProfile");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "corporateCardProfile"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

