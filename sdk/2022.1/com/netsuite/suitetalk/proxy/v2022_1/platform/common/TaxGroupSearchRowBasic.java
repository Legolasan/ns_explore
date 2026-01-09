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

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnBooleanField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnDoubleField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnEnumSelectField;
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

public class TaxGroupSearchRowBasic
extends SearchRowBasic
implements Serializable {
    private SearchColumnStringField[] city;
    private SearchColumnEnumSelectField[] country;
    private SearchColumnStringField[] county;
    private SearchColumnSelectField[] externalId;
    private SearchColumnBooleanField[] includeChildren;
    private SearchColumnSelectField[] internalId;
    private SearchColumnBooleanField[] isDefault;
    private SearchColumnBooleanField[] isInactive;
    private SearchColumnStringField[] itemId;
    private SearchColumnBooleanField[] piggyBack;
    private SearchColumnDoubleField[] rate;
    private SearchColumnSelectField[] state;
    private SearchColumnStringField[] stateDisplayName;
    private SearchColumnSelectField[] subsidiary;
    private SearchColumnSelectField[] subsidiaryNoHierarchy;
    private SearchColumnSelectField[] taxItem1;
    private SearchColumnSelectField[] taxItem2;
    private SearchColumnSelectField[] taxType;
    private SearchColumnDoubleField[] unitPrice1;
    private SearchColumnDoubleField[] unitPrice2;
    private SearchColumnStringField[] zip;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(TaxGroupSearchRowBasic.class, true);

    public TaxGroupSearchRowBasic() {
    }

    public TaxGroupSearchRowBasic(SearchColumnStringField[] city, SearchColumnEnumSelectField[] country, SearchColumnStringField[] county, SearchColumnSelectField[] externalId, SearchColumnBooleanField[] includeChildren, SearchColumnSelectField[] internalId, SearchColumnBooleanField[] isDefault, SearchColumnBooleanField[] isInactive, SearchColumnStringField[] itemId, SearchColumnBooleanField[] piggyBack, SearchColumnDoubleField[] rate, SearchColumnSelectField[] state, SearchColumnStringField[] stateDisplayName, SearchColumnSelectField[] subsidiary, SearchColumnSelectField[] subsidiaryNoHierarchy, SearchColumnSelectField[] taxItem1, SearchColumnSelectField[] taxItem2, SearchColumnSelectField[] taxType, SearchColumnDoubleField[] unitPrice1, SearchColumnDoubleField[] unitPrice2, SearchColumnStringField[] zip) {
        this.city = city;
        this.country = country;
        this.county = county;
        this.externalId = externalId;
        this.includeChildren = includeChildren;
        this.internalId = internalId;
        this.isDefault = isDefault;
        this.isInactive = isInactive;
        this.itemId = itemId;
        this.piggyBack = piggyBack;
        this.rate = rate;
        this.state = state;
        this.stateDisplayName = stateDisplayName;
        this.subsidiary = subsidiary;
        this.subsidiaryNoHierarchy = subsidiaryNoHierarchy;
        this.taxItem1 = taxItem1;
        this.taxItem2 = taxItem2;
        this.taxType = taxType;
        this.unitPrice1 = unitPrice1;
        this.unitPrice2 = unitPrice2;
        this.zip = zip;
    }

    public SearchColumnStringField[] getCity() {
        return this.city;
    }

    public void setCity(SearchColumnStringField[] city) {
        this.city = city;
    }

    public SearchColumnStringField getCity(int i) {
        return this.city[i];
    }

    public void setCity(int i, SearchColumnStringField _value) {
        this.city[i] = _value;
    }

    public SearchColumnEnumSelectField[] getCountry() {
        return this.country;
    }

    public void setCountry(SearchColumnEnumSelectField[] country) {
        this.country = country;
    }

    public SearchColumnEnumSelectField getCountry(int i) {
        return this.country[i];
    }

    public void setCountry(int i, SearchColumnEnumSelectField _value) {
        this.country[i] = _value;
    }

    public SearchColumnStringField[] getCounty() {
        return this.county;
    }

    public void setCounty(SearchColumnStringField[] county) {
        this.county = county;
    }

    public SearchColumnStringField getCounty(int i) {
        return this.county[i];
    }

    public void setCounty(int i, SearchColumnStringField _value) {
        this.county[i] = _value;
    }

    public SearchColumnSelectField[] getExternalId() {
        return this.externalId;
    }

    public void setExternalId(SearchColumnSelectField[] externalId) {
        this.externalId = externalId;
    }

    public SearchColumnSelectField getExternalId(int i) {
        return this.externalId[i];
    }

    public void setExternalId(int i, SearchColumnSelectField _value) {
        this.externalId[i] = _value;
    }

    public SearchColumnBooleanField[] getIncludeChildren() {
        return this.includeChildren;
    }

    public void setIncludeChildren(SearchColumnBooleanField[] includeChildren) {
        this.includeChildren = includeChildren;
    }

    public SearchColumnBooleanField getIncludeChildren(int i) {
        return this.includeChildren[i];
    }

    public void setIncludeChildren(int i, SearchColumnBooleanField _value) {
        this.includeChildren[i] = _value;
    }

    public SearchColumnSelectField[] getInternalId() {
        return this.internalId;
    }

    public void setInternalId(SearchColumnSelectField[] internalId) {
        this.internalId = internalId;
    }

    public SearchColumnSelectField getInternalId(int i) {
        return this.internalId[i];
    }

    public void setInternalId(int i, SearchColumnSelectField _value) {
        this.internalId[i] = _value;
    }

    public SearchColumnBooleanField[] getIsDefault() {
        return this.isDefault;
    }

    public void setIsDefault(SearchColumnBooleanField[] isDefault) {
        this.isDefault = isDefault;
    }

    public SearchColumnBooleanField getIsDefault(int i) {
        return this.isDefault[i];
    }

    public void setIsDefault(int i, SearchColumnBooleanField _value) {
        this.isDefault[i] = _value;
    }

    public SearchColumnBooleanField[] getIsInactive() {
        return this.isInactive;
    }

    public void setIsInactive(SearchColumnBooleanField[] isInactive) {
        this.isInactive = isInactive;
    }

    public SearchColumnBooleanField getIsInactive(int i) {
        return this.isInactive[i];
    }

    public void setIsInactive(int i, SearchColumnBooleanField _value) {
        this.isInactive[i] = _value;
    }

    public SearchColumnStringField[] getItemId() {
        return this.itemId;
    }

    public void setItemId(SearchColumnStringField[] itemId) {
        this.itemId = itemId;
    }

    public SearchColumnStringField getItemId(int i) {
        return this.itemId[i];
    }

    public void setItemId(int i, SearchColumnStringField _value) {
        this.itemId[i] = _value;
    }

    public SearchColumnBooleanField[] getPiggyBack() {
        return this.piggyBack;
    }

    public void setPiggyBack(SearchColumnBooleanField[] piggyBack) {
        this.piggyBack = piggyBack;
    }

    public SearchColumnBooleanField getPiggyBack(int i) {
        return this.piggyBack[i];
    }

    public void setPiggyBack(int i, SearchColumnBooleanField _value) {
        this.piggyBack[i] = _value;
    }

    public SearchColumnDoubleField[] getRate() {
        return this.rate;
    }

    public void setRate(SearchColumnDoubleField[] rate) {
        this.rate = rate;
    }

    public SearchColumnDoubleField getRate(int i) {
        return this.rate[i];
    }

    public void setRate(int i, SearchColumnDoubleField _value) {
        this.rate[i] = _value;
    }

    public SearchColumnSelectField[] getState() {
        return this.state;
    }

    public void setState(SearchColumnSelectField[] state) {
        this.state = state;
    }

    public SearchColumnSelectField getState(int i) {
        return this.state[i];
    }

    public void setState(int i, SearchColumnSelectField _value) {
        this.state[i] = _value;
    }

    public SearchColumnStringField[] getStateDisplayName() {
        return this.stateDisplayName;
    }

    public void setStateDisplayName(SearchColumnStringField[] stateDisplayName) {
        this.stateDisplayName = stateDisplayName;
    }

    public SearchColumnStringField getStateDisplayName(int i) {
        return this.stateDisplayName[i];
    }

    public void setStateDisplayName(int i, SearchColumnStringField _value) {
        this.stateDisplayName[i] = _value;
    }

    public SearchColumnSelectField[] getSubsidiary() {
        return this.subsidiary;
    }

    public void setSubsidiary(SearchColumnSelectField[] subsidiary) {
        this.subsidiary = subsidiary;
    }

    public SearchColumnSelectField getSubsidiary(int i) {
        return this.subsidiary[i];
    }

    public void setSubsidiary(int i, SearchColumnSelectField _value) {
        this.subsidiary[i] = _value;
    }

    public SearchColumnSelectField[] getSubsidiaryNoHierarchy() {
        return this.subsidiaryNoHierarchy;
    }

    public void setSubsidiaryNoHierarchy(SearchColumnSelectField[] subsidiaryNoHierarchy) {
        this.subsidiaryNoHierarchy = subsidiaryNoHierarchy;
    }

    public SearchColumnSelectField getSubsidiaryNoHierarchy(int i) {
        return this.subsidiaryNoHierarchy[i];
    }

    public void setSubsidiaryNoHierarchy(int i, SearchColumnSelectField _value) {
        this.subsidiaryNoHierarchy[i] = _value;
    }

    public SearchColumnSelectField[] getTaxItem1() {
        return this.taxItem1;
    }

    public void setTaxItem1(SearchColumnSelectField[] taxItem1) {
        this.taxItem1 = taxItem1;
    }

    public SearchColumnSelectField getTaxItem1(int i) {
        return this.taxItem1[i];
    }

    public void setTaxItem1(int i, SearchColumnSelectField _value) {
        this.taxItem1[i] = _value;
    }

    public SearchColumnSelectField[] getTaxItem2() {
        return this.taxItem2;
    }

    public void setTaxItem2(SearchColumnSelectField[] taxItem2) {
        this.taxItem2 = taxItem2;
    }

    public SearchColumnSelectField getTaxItem2(int i) {
        return this.taxItem2[i];
    }

    public void setTaxItem2(int i, SearchColumnSelectField _value) {
        this.taxItem2[i] = _value;
    }

    public SearchColumnSelectField[] getTaxType() {
        return this.taxType;
    }

    public void setTaxType(SearchColumnSelectField[] taxType) {
        this.taxType = taxType;
    }

    public SearchColumnSelectField getTaxType(int i) {
        return this.taxType[i];
    }

    public void setTaxType(int i, SearchColumnSelectField _value) {
        this.taxType[i] = _value;
    }

    public SearchColumnDoubleField[] getUnitPrice1() {
        return this.unitPrice1;
    }

    public void setUnitPrice1(SearchColumnDoubleField[] unitPrice1) {
        this.unitPrice1 = unitPrice1;
    }

    public SearchColumnDoubleField getUnitPrice1(int i) {
        return this.unitPrice1[i];
    }

    public void setUnitPrice1(int i, SearchColumnDoubleField _value) {
        this.unitPrice1[i] = _value;
    }

    public SearchColumnDoubleField[] getUnitPrice2() {
        return this.unitPrice2;
    }

    public void setUnitPrice2(SearchColumnDoubleField[] unitPrice2) {
        this.unitPrice2 = unitPrice2;
    }

    public SearchColumnDoubleField getUnitPrice2(int i) {
        return this.unitPrice2[i];
    }

    public void setUnitPrice2(int i, SearchColumnDoubleField _value) {
        this.unitPrice2[i] = _value;
    }

    public SearchColumnStringField[] getZip() {
        return this.zip;
    }

    public void setZip(SearchColumnStringField[] zip) {
        this.zip = zip;
    }

    public SearchColumnStringField getZip(int i) {
        return this.zip[i];
    }

    public void setZip(int i, SearchColumnStringField _value) {
        this.zip[i] = _value;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TaxGroupSearchRowBasic)) {
            return false;
        }
        TaxGroupSearchRowBasic other = (TaxGroupSearchRowBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.city == null && other.getCity() == null || this.city != null && Arrays.equals(this.city, other.getCity())) && (this.country == null && other.getCountry() == null || this.country != null && Arrays.equals(this.country, other.getCountry())) && (this.county == null && other.getCounty() == null || this.county != null && Arrays.equals(this.county, other.getCounty())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && Arrays.equals(this.externalId, other.getExternalId())) && (this.includeChildren == null && other.getIncludeChildren() == null || this.includeChildren != null && Arrays.equals(this.includeChildren, other.getIncludeChildren())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && Arrays.equals(this.internalId, other.getInternalId())) && (this.isDefault == null && other.getIsDefault() == null || this.isDefault != null && Arrays.equals(this.isDefault, other.getIsDefault())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && Arrays.equals(this.isInactive, other.getIsInactive())) && (this.itemId == null && other.getItemId() == null || this.itemId != null && Arrays.equals(this.itemId, other.getItemId())) && (this.piggyBack == null && other.getPiggyBack() == null || this.piggyBack != null && Arrays.equals(this.piggyBack, other.getPiggyBack())) && (this.rate == null && other.getRate() == null || this.rate != null && Arrays.equals(this.rate, other.getRate())) && (this.state == null && other.getState() == null || this.state != null && Arrays.equals(this.state, other.getState())) && (this.stateDisplayName == null && other.getStateDisplayName() == null || this.stateDisplayName != null && Arrays.equals(this.stateDisplayName, other.getStateDisplayName())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && Arrays.equals(this.subsidiary, other.getSubsidiary())) && (this.subsidiaryNoHierarchy == null && other.getSubsidiaryNoHierarchy() == null || this.subsidiaryNoHierarchy != null && Arrays.equals(this.subsidiaryNoHierarchy, other.getSubsidiaryNoHierarchy())) && (this.taxItem1 == null && other.getTaxItem1() == null || this.taxItem1 != null && Arrays.equals(this.taxItem1, other.getTaxItem1())) && (this.taxItem2 == null && other.getTaxItem2() == null || this.taxItem2 != null && Arrays.equals(this.taxItem2, other.getTaxItem2())) && (this.taxType == null && other.getTaxType() == null || this.taxType != null && Arrays.equals(this.taxType, other.getTaxType())) && (this.unitPrice1 == null && other.getUnitPrice1() == null || this.unitPrice1 != null && Arrays.equals(this.unitPrice1, other.getUnitPrice1())) && (this.unitPrice2 == null && other.getUnitPrice2() == null || this.unitPrice2 != null && Arrays.equals(this.unitPrice2, other.getUnitPrice2())) && (this.zip == null && other.getZip() == null || this.zip != null && Arrays.equals(this.zip, other.getZip()));
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
        if (this.getCity() != null) {
            for (i = 0; i < Array.getLength(this.getCity()); ++i) {
                obj = Array.get(this.getCity(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCountry() != null) {
            for (i = 0; i < Array.getLength(this.getCountry()); ++i) {
                obj = Array.get(this.getCountry(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCounty() != null) {
            for (i = 0; i < Array.getLength(this.getCounty()); ++i) {
                obj = Array.get(this.getCounty(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getExternalId() != null) {
            for (i = 0; i < Array.getLength(this.getExternalId()); ++i) {
                obj = Array.get(this.getExternalId(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIncludeChildren() != null) {
            for (i = 0; i < Array.getLength(this.getIncludeChildren()); ++i) {
                obj = Array.get(this.getIncludeChildren(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getInternalId() != null) {
            for (i = 0; i < Array.getLength(this.getInternalId()); ++i) {
                obj = Array.get(this.getInternalId(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsDefault() != null) {
            for (i = 0; i < Array.getLength(this.getIsDefault()); ++i) {
                obj = Array.get(this.getIsDefault(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsInactive() != null) {
            for (i = 0; i < Array.getLength(this.getIsInactive()); ++i) {
                obj = Array.get(this.getIsInactive(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getItemId() != null) {
            for (i = 0; i < Array.getLength(this.getItemId()); ++i) {
                obj = Array.get(this.getItemId(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPiggyBack() != null) {
            for (i = 0; i < Array.getLength(this.getPiggyBack()); ++i) {
                obj = Array.get(this.getPiggyBack(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRate() != null) {
            for (i = 0; i < Array.getLength(this.getRate()); ++i) {
                obj = Array.get(this.getRate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getState() != null) {
            for (i = 0; i < Array.getLength(this.getState()); ++i) {
                obj = Array.get(this.getState(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getStateDisplayName() != null) {
            for (i = 0; i < Array.getLength(this.getStateDisplayName()); ++i) {
                obj = Array.get(this.getStateDisplayName(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSubsidiary() != null) {
            for (i = 0; i < Array.getLength(this.getSubsidiary()); ++i) {
                obj = Array.get(this.getSubsidiary(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSubsidiaryNoHierarchy() != null) {
            for (i = 0; i < Array.getLength(this.getSubsidiaryNoHierarchy()); ++i) {
                obj = Array.get(this.getSubsidiaryNoHierarchy(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTaxItem1() != null) {
            for (i = 0; i < Array.getLength(this.getTaxItem1()); ++i) {
                obj = Array.get(this.getTaxItem1(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTaxItem2() != null) {
            for (i = 0; i < Array.getLength(this.getTaxItem2()); ++i) {
                obj = Array.get(this.getTaxItem2(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTaxType() != null) {
            for (i = 0; i < Array.getLength(this.getTaxType()); ++i) {
                obj = Array.get(this.getTaxType(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getUnitPrice1() != null) {
            for (i = 0; i < Array.getLength(this.getUnitPrice1()); ++i) {
                obj = Array.get(this.getUnitPrice1(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getUnitPrice2() != null) {
            for (i = 0; i < Array.getLength(this.getUnitPrice2()); ++i) {
                obj = Array.get(this.getUnitPrice2(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getZip() != null) {
            for (i = 0; i < Array.getLength(this.getZip()); ++i) {
                obj = Array.get(this.getZip(), i);
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TaxGroupSearchRowBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("city");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "city"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "country"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("county");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "county"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "externalId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("includeChildren");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "includeChildren"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isDefault");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isDefault"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "itemId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("piggyBack");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "piggyBack"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("rate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "rate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("state");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "state"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("stateDisplayName");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "stateDisplayName"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subsidiaryNoHierarchy");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "subsidiaryNoHierarchy"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxItem1");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "taxItem1"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxItem2");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "taxItem2"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "taxType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("unitPrice1");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "unitPrice1"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("unitPrice2");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "unitPrice2"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("zip");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "zip"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

