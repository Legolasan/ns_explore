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

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnEnumSelectField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnLongField;
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

public class EntityTaxRegistrationSearchRowBasic
extends SearchRowBasic
implements Serializable {
    private SearchColumnSelectField[] address;
    private SearchColumnLongField[] id;
    private SearchColumnEnumSelectField[] nexusCountry;
    private SearchColumnStringField[] taxRegistrationNumber;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(EntityTaxRegistrationSearchRowBasic.class, true);

    public EntityTaxRegistrationSearchRowBasic() {
    }

    public EntityTaxRegistrationSearchRowBasic(SearchColumnSelectField[] address, SearchColumnLongField[] id, SearchColumnEnumSelectField[] nexusCountry, SearchColumnStringField[] taxRegistrationNumber) {
        this.address = address;
        this.id = id;
        this.nexusCountry = nexusCountry;
        this.taxRegistrationNumber = taxRegistrationNumber;
    }

    public SearchColumnSelectField[] getAddress() {
        return this.address;
    }

    public void setAddress(SearchColumnSelectField[] address) {
        this.address = address;
    }

    public SearchColumnSelectField getAddress(int i) {
        return this.address[i];
    }

    public void setAddress(int i, SearchColumnSelectField _value) {
        this.address[i] = _value;
    }

    public SearchColumnLongField[] getId() {
        return this.id;
    }

    public void setId(SearchColumnLongField[] id) {
        this.id = id;
    }

    public SearchColumnLongField getId(int i) {
        return this.id[i];
    }

    public void setId(int i, SearchColumnLongField _value) {
        this.id[i] = _value;
    }

    public SearchColumnEnumSelectField[] getNexusCountry() {
        return this.nexusCountry;
    }

    public void setNexusCountry(SearchColumnEnumSelectField[] nexusCountry) {
        this.nexusCountry = nexusCountry;
    }

    public SearchColumnEnumSelectField getNexusCountry(int i) {
        return this.nexusCountry[i];
    }

    public void setNexusCountry(int i, SearchColumnEnumSelectField _value) {
        this.nexusCountry[i] = _value;
    }

    public SearchColumnStringField[] getTaxRegistrationNumber() {
        return this.taxRegistrationNumber;
    }

    public void setTaxRegistrationNumber(SearchColumnStringField[] taxRegistrationNumber) {
        this.taxRegistrationNumber = taxRegistrationNumber;
    }

    public SearchColumnStringField getTaxRegistrationNumber(int i) {
        return this.taxRegistrationNumber[i];
    }

    public void setTaxRegistrationNumber(int i, SearchColumnStringField _value) {
        this.taxRegistrationNumber[i] = _value;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof EntityTaxRegistrationSearchRowBasic)) {
            return false;
        }
        EntityTaxRegistrationSearchRowBasic other = (EntityTaxRegistrationSearchRowBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.address == null && other.getAddress() == null || this.address != null && Arrays.equals(this.address, other.getAddress())) && (this.id == null && other.getId() == null || this.id != null && Arrays.equals(this.id, other.getId())) && (this.nexusCountry == null && other.getNexusCountry() == null || this.nexusCountry != null && Arrays.equals(this.nexusCountry, other.getNexusCountry())) && (this.taxRegistrationNumber == null && other.getTaxRegistrationNumber() == null || this.taxRegistrationNumber != null && Arrays.equals(this.taxRegistrationNumber, other.getTaxRegistrationNumber()));
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
        if (this.getAddress() != null) {
            for (i = 0; i < Array.getLength(this.getAddress()); ++i) {
                obj = Array.get(this.getAddress(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getId() != null) {
            for (i = 0; i < Array.getLength(this.getId()); ++i) {
                obj = Array.get(this.getId(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getNexusCountry() != null) {
            for (i = 0; i < Array.getLength(this.getNexusCountry()); ++i) {
                obj = Array.get(this.getNexusCountry(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTaxRegistrationNumber() != null) {
            for (i = 0; i < Array.getLength(this.getTaxRegistrationNumber()); ++i) {
                obj = Array.get(this.getTaxRegistrationNumber(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "EntityTaxRegistrationSearchRowBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "address"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "id"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("nexusCountry");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "nexusCountry"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxRegistrationNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "taxRegistrationNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

