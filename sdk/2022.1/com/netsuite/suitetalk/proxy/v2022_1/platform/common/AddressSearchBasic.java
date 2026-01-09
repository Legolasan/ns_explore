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

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchBooleanField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchCustomFieldList;
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

public class AddressSearchBasic
extends SearchRecordBasic
implements Serializable {
    private SearchStringField address;
    private SearchStringField address1;
    private SearchStringField address2;
    private SearchStringField address3;
    private SearchStringField addressee;
    private SearchStringField attention;
    private SearchStringField city;
    private SearchEnumMultiSelectField country;
    private SearchStringField countryCode;
    private SearchMultiSelectField externalId;
    private SearchStringField externalIdString;
    private SearchMultiSelectField internalId;
    private SearchLongField internalIdNumber;
    private SearchBooleanField override;
    private SearchStringField phone;
    private SearchStringField state;
    private SearchStringField zip;
    private SearchCustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(AddressSearchBasic.class, true);

    public AddressSearchBasic() {
    }

    public AddressSearchBasic(SearchStringField address, SearchStringField address1, SearchStringField address2, SearchStringField address3, SearchStringField addressee, SearchStringField attention, SearchStringField city, SearchEnumMultiSelectField country, SearchStringField countryCode, SearchMultiSelectField externalId, SearchStringField externalIdString, SearchMultiSelectField internalId, SearchLongField internalIdNumber, SearchBooleanField override, SearchStringField phone, SearchStringField state, SearchStringField zip, SearchCustomFieldList customFieldList) {
        this.address = address;
        this.address1 = address1;
        this.address2 = address2;
        this.address3 = address3;
        this.addressee = addressee;
        this.attention = attention;
        this.city = city;
        this.country = country;
        this.countryCode = countryCode;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.override = override;
        this.phone = phone;
        this.state = state;
        this.zip = zip;
        this.customFieldList = customFieldList;
    }

    public SearchStringField getAddress() {
        return this.address;
    }

    public void setAddress(SearchStringField address) {
        this.address = address;
    }

    public SearchStringField getAddress1() {
        return this.address1;
    }

    public void setAddress1(SearchStringField address1) {
        this.address1 = address1;
    }

    public SearchStringField getAddress2() {
        return this.address2;
    }

    public void setAddress2(SearchStringField address2) {
        this.address2 = address2;
    }

    public SearchStringField getAddress3() {
        return this.address3;
    }

    public void setAddress3(SearchStringField address3) {
        this.address3 = address3;
    }

    public SearchStringField getAddressee() {
        return this.addressee;
    }

    public void setAddressee(SearchStringField addressee) {
        this.addressee = addressee;
    }

    public SearchStringField getAttention() {
        return this.attention;
    }

    public void setAttention(SearchStringField attention) {
        this.attention = attention;
    }

    public SearchStringField getCity() {
        return this.city;
    }

    public void setCity(SearchStringField city) {
        this.city = city;
    }

    public SearchEnumMultiSelectField getCountry() {
        return this.country;
    }

    public void setCountry(SearchEnumMultiSelectField country) {
        this.country = country;
    }

    public SearchStringField getCountryCode() {
        return this.countryCode;
    }

    public void setCountryCode(SearchStringField countryCode) {
        this.countryCode = countryCode;
    }

    public SearchMultiSelectField getExternalId() {
        return this.externalId;
    }

    public void setExternalId(SearchMultiSelectField externalId) {
        this.externalId = externalId;
    }

    public SearchStringField getExternalIdString() {
        return this.externalIdString;
    }

    public void setExternalIdString(SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }

    public SearchMultiSelectField getInternalId() {
        return this.internalId;
    }

    public void setInternalId(SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }

    public SearchLongField getInternalIdNumber() {
        return this.internalIdNumber;
    }

    public void setInternalIdNumber(SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }

    public SearchBooleanField getOverride() {
        return this.override;
    }

    public void setOverride(SearchBooleanField override) {
        this.override = override;
    }

    public SearchStringField getPhone() {
        return this.phone;
    }

    public void setPhone(SearchStringField phone) {
        this.phone = phone;
    }

    public SearchStringField getState() {
        return this.state;
    }

    public void setState(SearchStringField state) {
        this.state = state;
    }

    public SearchStringField getZip() {
        return this.zip;
    }

    public void setZip(SearchStringField zip) {
        this.zip = zip;
    }

    public SearchCustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof AddressSearchBasic)) {
            return false;
        }
        AddressSearchBasic other = (AddressSearchBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.address == null && other.getAddress() == null || this.address != null && this.address.equals(other.getAddress())) && (this.address1 == null && other.getAddress1() == null || this.address1 != null && this.address1.equals(other.getAddress1())) && (this.address2 == null && other.getAddress2() == null || this.address2 != null && this.address2.equals(other.getAddress2())) && (this.address3 == null && other.getAddress3() == null || this.address3 != null && this.address3.equals(other.getAddress3())) && (this.addressee == null && other.getAddressee() == null || this.addressee != null && this.addressee.equals(other.getAddressee())) && (this.attention == null && other.getAttention() == null || this.attention != null && this.attention.equals(other.getAttention())) && (this.city == null && other.getCity() == null || this.city != null && this.city.equals(other.getCity())) && (this.country == null && other.getCountry() == null || this.country != null && this.country.equals(other.getCountry())) && (this.countryCode == null && other.getCountryCode() == null || this.countryCode != null && this.countryCode.equals(other.getCountryCode())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId())) && (this.externalIdString == null && other.getExternalIdString() == null || this.externalIdString != null && this.externalIdString.equals(other.getExternalIdString())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.internalIdNumber == null && other.getInternalIdNumber() == null || this.internalIdNumber != null && this.internalIdNumber.equals(other.getInternalIdNumber())) && (this.override == null && other.getOverride() == null || this.override != null && this.override.equals(other.getOverride())) && (this.phone == null && other.getPhone() == null || this.phone != null && this.phone.equals(other.getPhone())) && (this.state == null && other.getState() == null || this.state != null && this.state.equals(other.getState())) && (this.zip == null && other.getZip() == null || this.zip != null && this.zip.equals(other.getZip())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
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
        if (this.getAddress1() != null) {
            _hashCode += this.getAddress1().hashCode();
        }
        if (this.getAddress2() != null) {
            _hashCode += this.getAddress2().hashCode();
        }
        if (this.getAddress3() != null) {
            _hashCode += this.getAddress3().hashCode();
        }
        if (this.getAddressee() != null) {
            _hashCode += this.getAddressee().hashCode();
        }
        if (this.getAttention() != null) {
            _hashCode += this.getAttention().hashCode();
        }
        if (this.getCity() != null) {
            _hashCode += this.getCity().hashCode();
        }
        if (this.getCountry() != null) {
            _hashCode += this.getCountry().hashCode();
        }
        if (this.getCountryCode() != null) {
            _hashCode += this.getCountryCode().hashCode();
        }
        if (this.getExternalId() != null) {
            _hashCode += this.getExternalId().hashCode();
        }
        if (this.getExternalIdString() != null) {
            _hashCode += this.getExternalIdString().hashCode();
        }
        if (this.getInternalId() != null) {
            _hashCode += this.getInternalId().hashCode();
        }
        if (this.getInternalIdNumber() != null) {
            _hashCode += this.getInternalIdNumber().hashCode();
        }
        if (this.getOverride() != null) {
            _hashCode += this.getOverride().hashCode();
        }
        if (this.getPhone() != null) {
            _hashCode += this.getPhone().hashCode();
        }
        if (this.getState() != null) {
            _hashCode += this.getState().hashCode();
        }
        if (this.getZip() != null) {
            _hashCode += this.getZip().hashCode();
        }
        if (this.getCustomFieldList() != null) {
            _hashCode += this.getCustomFieldList().hashCode();
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "AddressSearchBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("address");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "address"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("address1");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "address1"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("address2");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "address2"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("address3");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "address3"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("addressee");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "addressee"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("attention");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "attention"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "city"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "country"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("countryCode");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "countryCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "externalId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("externalIdString");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "externalIdString"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("internalIdNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "internalIdNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("override");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "override"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("phone");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "phone"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "state"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("zip");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "zip"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchCustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

