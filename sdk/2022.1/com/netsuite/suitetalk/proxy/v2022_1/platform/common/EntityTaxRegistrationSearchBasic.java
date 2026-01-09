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

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchEnumMultiSelectField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchLongField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchMultiSelectField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchRecordBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchStringField;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class EntityTaxRegistrationSearchBasic
extends SearchRecordBasic
implements Serializable {
    private SearchMultiSelectField address;
    private SearchLongField id;
    private SearchEnumMultiSelectField nexusCountry;
    private SearchStringField taxRegistrationNumber;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(EntityTaxRegistrationSearchBasic.class, true);

    public EntityTaxRegistrationSearchBasic() {
    }

    public EntityTaxRegistrationSearchBasic(SearchMultiSelectField address, SearchLongField id, SearchEnumMultiSelectField nexusCountry, SearchStringField taxRegistrationNumber) {
        this.address = address;
        this.id = id;
        this.nexusCountry = nexusCountry;
        this.taxRegistrationNumber = taxRegistrationNumber;
    }

    public SearchMultiSelectField getAddress() {
        return this.address;
    }

    public void setAddress(SearchMultiSelectField address) {
        this.address = address;
    }

    public SearchLongField getId() {
        return this.id;
    }

    public void setId(SearchLongField id) {
        this.id = id;
    }

    public SearchEnumMultiSelectField getNexusCountry() {
        return this.nexusCountry;
    }

    public void setNexusCountry(SearchEnumMultiSelectField nexusCountry) {
        this.nexusCountry = nexusCountry;
    }

    public SearchStringField getTaxRegistrationNumber() {
        return this.taxRegistrationNumber;
    }

    public void setTaxRegistrationNumber(SearchStringField taxRegistrationNumber) {
        this.taxRegistrationNumber = taxRegistrationNumber;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof EntityTaxRegistrationSearchBasic)) {
            return false;
        }
        EntityTaxRegistrationSearchBasic other = (EntityTaxRegistrationSearchBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.address == null && other.getAddress() == null || this.address != null && this.address.equals(other.getAddress())) && (this.id == null && other.getId() == null || this.id != null && this.id.equals(other.getId())) && (this.nexusCountry == null && other.getNexusCountry() == null || this.nexusCountry != null && this.nexusCountry.equals(other.getNexusCountry())) && (this.taxRegistrationNumber == null && other.getTaxRegistrationNumber() == null || this.taxRegistrationNumber != null && this.taxRegistrationNumber.equals(other.getTaxRegistrationNumber()));
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
        if (this.getAddress() != null) {
            _hashCode += this.getAddress().hashCode();
        }
        if (this.getId() != null) {
            _hashCode += this.getId().hashCode();
        }
        if (this.getNexusCountry() != null) {
            _hashCode += this.getNexusCountry().hashCode();
        }
        if (this.getTaxRegistrationNumber() != null) {
            _hashCode += this.getTaxRegistrationNumber().hashCode();
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "EntityTaxRegistrationSearchBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "address"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "id"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("nexusCountry");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "nexusCountry"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxRegistrationNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "taxRegistrationNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

