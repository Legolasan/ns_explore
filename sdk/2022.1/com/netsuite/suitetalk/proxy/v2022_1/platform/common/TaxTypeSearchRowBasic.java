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

public class TaxTypeSearchRowBasic
extends SearchRowBasic
implements Serializable {
    private SearchColumnEnumSelectField[] country;
    private SearchColumnStringField[] description;
    private SearchColumnBooleanField[] doesNotAddToTotal;
    private SearchColumnSelectField[] externalId;
    private SearchColumnSelectField[] internalId;
    private SearchColumnBooleanField[] isInactive;
    private SearchColumnStringField[] name;
    private SearchColumnSelectField[] nexus;
    private SearchColumnSelectField[] payablesAccount;
    private SearchColumnBooleanField[] postToItemCost;
    private SearchColumnSelectField[] receivablesAccount;
    private SearchColumnBooleanField[] reverseCharge;
    private SearchColumnBooleanField[] taxInNetAmount;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(TaxTypeSearchRowBasic.class, true);

    public TaxTypeSearchRowBasic() {
    }

    public TaxTypeSearchRowBasic(SearchColumnEnumSelectField[] country, SearchColumnStringField[] description, SearchColumnBooleanField[] doesNotAddToTotal, SearchColumnSelectField[] externalId, SearchColumnSelectField[] internalId, SearchColumnBooleanField[] isInactive, SearchColumnStringField[] name, SearchColumnSelectField[] nexus, SearchColumnSelectField[] payablesAccount, SearchColumnBooleanField[] postToItemCost, SearchColumnSelectField[] receivablesAccount, SearchColumnBooleanField[] reverseCharge, SearchColumnBooleanField[] taxInNetAmount) {
        this.country = country;
        this.description = description;
        this.doesNotAddToTotal = doesNotAddToTotal;
        this.externalId = externalId;
        this.internalId = internalId;
        this.isInactive = isInactive;
        this.name = name;
        this.nexus = nexus;
        this.payablesAccount = payablesAccount;
        this.postToItemCost = postToItemCost;
        this.receivablesAccount = receivablesAccount;
        this.reverseCharge = reverseCharge;
        this.taxInNetAmount = taxInNetAmount;
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

    public SearchColumnStringField[] getDescription() {
        return this.description;
    }

    public void setDescription(SearchColumnStringField[] description) {
        this.description = description;
    }

    public SearchColumnStringField getDescription(int i) {
        return this.description[i];
    }

    public void setDescription(int i, SearchColumnStringField _value) {
        this.description[i] = _value;
    }

    public SearchColumnBooleanField[] getDoesNotAddToTotal() {
        return this.doesNotAddToTotal;
    }

    public void setDoesNotAddToTotal(SearchColumnBooleanField[] doesNotAddToTotal) {
        this.doesNotAddToTotal = doesNotAddToTotal;
    }

    public SearchColumnBooleanField getDoesNotAddToTotal(int i) {
        return this.doesNotAddToTotal[i];
    }

    public void setDoesNotAddToTotal(int i, SearchColumnBooleanField _value) {
        this.doesNotAddToTotal[i] = _value;
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

    public SearchColumnStringField[] getName() {
        return this.name;
    }

    public void setName(SearchColumnStringField[] name) {
        this.name = name;
    }

    public SearchColumnStringField getName(int i) {
        return this.name[i];
    }

    public void setName(int i, SearchColumnStringField _value) {
        this.name[i] = _value;
    }

    public SearchColumnSelectField[] getNexus() {
        return this.nexus;
    }

    public void setNexus(SearchColumnSelectField[] nexus) {
        this.nexus = nexus;
    }

    public SearchColumnSelectField getNexus(int i) {
        return this.nexus[i];
    }

    public void setNexus(int i, SearchColumnSelectField _value) {
        this.nexus[i] = _value;
    }

    public SearchColumnSelectField[] getPayablesAccount() {
        return this.payablesAccount;
    }

    public void setPayablesAccount(SearchColumnSelectField[] payablesAccount) {
        this.payablesAccount = payablesAccount;
    }

    public SearchColumnSelectField getPayablesAccount(int i) {
        return this.payablesAccount[i];
    }

    public void setPayablesAccount(int i, SearchColumnSelectField _value) {
        this.payablesAccount[i] = _value;
    }

    public SearchColumnBooleanField[] getPostToItemCost() {
        return this.postToItemCost;
    }

    public void setPostToItemCost(SearchColumnBooleanField[] postToItemCost) {
        this.postToItemCost = postToItemCost;
    }

    public SearchColumnBooleanField getPostToItemCost(int i) {
        return this.postToItemCost[i];
    }

    public void setPostToItemCost(int i, SearchColumnBooleanField _value) {
        this.postToItemCost[i] = _value;
    }

    public SearchColumnSelectField[] getReceivablesAccount() {
        return this.receivablesAccount;
    }

    public void setReceivablesAccount(SearchColumnSelectField[] receivablesAccount) {
        this.receivablesAccount = receivablesAccount;
    }

    public SearchColumnSelectField getReceivablesAccount(int i) {
        return this.receivablesAccount[i];
    }

    public void setReceivablesAccount(int i, SearchColumnSelectField _value) {
        this.receivablesAccount[i] = _value;
    }

    public SearchColumnBooleanField[] getReverseCharge() {
        return this.reverseCharge;
    }

    public void setReverseCharge(SearchColumnBooleanField[] reverseCharge) {
        this.reverseCharge = reverseCharge;
    }

    public SearchColumnBooleanField getReverseCharge(int i) {
        return this.reverseCharge[i];
    }

    public void setReverseCharge(int i, SearchColumnBooleanField _value) {
        this.reverseCharge[i] = _value;
    }

    public SearchColumnBooleanField[] getTaxInNetAmount() {
        return this.taxInNetAmount;
    }

    public void setTaxInNetAmount(SearchColumnBooleanField[] taxInNetAmount) {
        this.taxInNetAmount = taxInNetAmount;
    }

    public SearchColumnBooleanField getTaxInNetAmount(int i) {
        return this.taxInNetAmount[i];
    }

    public void setTaxInNetAmount(int i, SearchColumnBooleanField _value) {
        this.taxInNetAmount[i] = _value;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TaxTypeSearchRowBasic)) {
            return false;
        }
        TaxTypeSearchRowBasic other = (TaxTypeSearchRowBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.country == null && other.getCountry() == null || this.country != null && Arrays.equals(this.country, other.getCountry())) && (this.description == null && other.getDescription() == null || this.description != null && Arrays.equals(this.description, other.getDescription())) && (this.doesNotAddToTotal == null && other.getDoesNotAddToTotal() == null || this.doesNotAddToTotal != null && Arrays.equals(this.doesNotAddToTotal, other.getDoesNotAddToTotal())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && Arrays.equals(this.externalId, other.getExternalId())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && Arrays.equals(this.internalId, other.getInternalId())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && Arrays.equals(this.isInactive, other.getIsInactive())) && (this.name == null && other.getName() == null || this.name != null && Arrays.equals(this.name, other.getName())) && (this.nexus == null && other.getNexus() == null || this.nexus != null && Arrays.equals(this.nexus, other.getNexus())) && (this.payablesAccount == null && other.getPayablesAccount() == null || this.payablesAccount != null && Arrays.equals(this.payablesAccount, other.getPayablesAccount())) && (this.postToItemCost == null && other.getPostToItemCost() == null || this.postToItemCost != null && Arrays.equals(this.postToItemCost, other.getPostToItemCost())) && (this.receivablesAccount == null && other.getReceivablesAccount() == null || this.receivablesAccount != null && Arrays.equals(this.receivablesAccount, other.getReceivablesAccount())) && (this.reverseCharge == null && other.getReverseCharge() == null || this.reverseCharge != null && Arrays.equals(this.reverseCharge, other.getReverseCharge())) && (this.taxInNetAmount == null && other.getTaxInNetAmount() == null || this.taxInNetAmount != null && Arrays.equals(this.taxInNetAmount, other.getTaxInNetAmount()));
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
        if (this.getCountry() != null) {
            for (i = 0; i < Array.getLength(this.getCountry()); ++i) {
                obj = Array.get(this.getCountry(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDescription() != null) {
            for (i = 0; i < Array.getLength(this.getDescription()); ++i) {
                obj = Array.get(this.getDescription(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getDoesNotAddToTotal() != null) {
            for (i = 0; i < Array.getLength(this.getDoesNotAddToTotal()); ++i) {
                obj = Array.get(this.getDoesNotAddToTotal(), i);
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
        if (this.getInternalId() != null) {
            for (i = 0; i < Array.getLength(this.getInternalId()); ++i) {
                obj = Array.get(this.getInternalId(), i);
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
        if (this.getName() != null) {
            for (i = 0; i < Array.getLength(this.getName()); ++i) {
                obj = Array.get(this.getName(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getNexus() != null) {
            for (i = 0; i < Array.getLength(this.getNexus()); ++i) {
                obj = Array.get(this.getNexus(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPayablesAccount() != null) {
            for (i = 0; i < Array.getLength(this.getPayablesAccount()); ++i) {
                obj = Array.get(this.getPayablesAccount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPostToItemCost() != null) {
            for (i = 0; i < Array.getLength(this.getPostToItemCost()); ++i) {
                obj = Array.get(this.getPostToItemCost(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getReceivablesAccount() != null) {
            for (i = 0; i < Array.getLength(this.getReceivablesAccount()); ++i) {
                obj = Array.get(this.getReceivablesAccount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getReverseCharge() != null) {
            for (i = 0; i < Array.getLength(this.getReverseCharge()); ++i) {
                obj = Array.get(this.getReverseCharge(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getTaxInNetAmount() != null) {
            for (i = 0; i < Array.getLength(this.getTaxInNetAmount()); ++i) {
                obj = Array.get(this.getTaxInNetAmount(), i);
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TaxTypeSearchRowBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "country"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "description"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("doesNotAddToTotal");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "doesNotAddToTotal"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
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
        elemField.setFieldName("internalId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("name");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "name"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("nexus");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "nexus"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("payablesAccount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "payablesAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("postToItemCost");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "postToItemCost"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("receivablesAccount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "receivablesAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("reverseCharge");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "reverseCharge"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxInNetAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "taxInNetAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

