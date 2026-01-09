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
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnCustomFieldList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnDoubleField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnSelectField;
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

public class VendorSubsidiaryRelationshipSearchRowBasic
extends SearchRowBasic
implements Serializable {
    private SearchColumnDoubleField[] balance;
    private SearchColumnDoubleField[] balancebase;
    private SearchColumnSelectField[] baseCurrency;
    private SearchColumnDoubleField[] creditlimit;
    private SearchColumnSelectField[] entity;
    private SearchColumnSelectField[] externalId;
    private SearchColumnSelectField[] internalId;
    private SearchColumnDoubleField[] inTransitBalance;
    private SearchColumnDoubleField[] inTransitBalanceBase;
    private SearchColumnBooleanField[] isprimarysub;
    private SearchColumnSelectField[] primaryCurrency;
    private SearchColumnSelectField[] subsidiary;
    private SearchColumnSelectField[] taxitem;
    private SearchColumnDoubleField[] unbilledorders;
    private SearchColumnDoubleField[] unbilledordersbase;
    private SearchColumnCustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(VendorSubsidiaryRelationshipSearchRowBasic.class, true);

    public VendorSubsidiaryRelationshipSearchRowBasic() {
    }

    public VendorSubsidiaryRelationshipSearchRowBasic(SearchColumnDoubleField[] balance, SearchColumnDoubleField[] balancebase, SearchColumnSelectField[] baseCurrency, SearchColumnDoubleField[] creditlimit, SearchColumnSelectField[] entity, SearchColumnSelectField[] externalId, SearchColumnSelectField[] internalId, SearchColumnDoubleField[] inTransitBalance, SearchColumnDoubleField[] inTransitBalanceBase, SearchColumnBooleanField[] isprimarysub, SearchColumnSelectField[] primaryCurrency, SearchColumnSelectField[] subsidiary, SearchColumnSelectField[] taxitem, SearchColumnDoubleField[] unbilledorders, SearchColumnDoubleField[] unbilledordersbase, SearchColumnCustomFieldList customFieldList) {
        this.balance = balance;
        this.balancebase = balancebase;
        this.baseCurrency = baseCurrency;
        this.creditlimit = creditlimit;
        this.entity = entity;
        this.externalId = externalId;
        this.internalId = internalId;
        this.inTransitBalance = inTransitBalance;
        this.inTransitBalanceBase = inTransitBalanceBase;
        this.isprimarysub = isprimarysub;
        this.primaryCurrency = primaryCurrency;
        this.subsidiary = subsidiary;
        this.taxitem = taxitem;
        this.unbilledorders = unbilledorders;
        this.unbilledordersbase = unbilledordersbase;
        this.customFieldList = customFieldList;
    }

    public SearchColumnDoubleField[] getBalance() {
        return this.balance;
    }

    public void setBalance(SearchColumnDoubleField[] balance) {
        this.balance = balance;
    }

    public SearchColumnDoubleField getBalance(int i) {
        return this.balance[i];
    }

    public void setBalance(int i, SearchColumnDoubleField _value) {
        this.balance[i] = _value;
    }

    public SearchColumnDoubleField[] getBalancebase() {
        return this.balancebase;
    }

    public void setBalancebase(SearchColumnDoubleField[] balancebase) {
        this.balancebase = balancebase;
    }

    public SearchColumnDoubleField getBalancebase(int i) {
        return this.balancebase[i];
    }

    public void setBalancebase(int i, SearchColumnDoubleField _value) {
        this.balancebase[i] = _value;
    }

    public SearchColumnSelectField[] getBaseCurrency() {
        return this.baseCurrency;
    }

    public void setBaseCurrency(SearchColumnSelectField[] baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public SearchColumnSelectField getBaseCurrency(int i) {
        return this.baseCurrency[i];
    }

    public void setBaseCurrency(int i, SearchColumnSelectField _value) {
        this.baseCurrency[i] = _value;
    }

    public SearchColumnDoubleField[] getCreditlimit() {
        return this.creditlimit;
    }

    public void setCreditlimit(SearchColumnDoubleField[] creditlimit) {
        this.creditlimit = creditlimit;
    }

    public SearchColumnDoubleField getCreditlimit(int i) {
        return this.creditlimit[i];
    }

    public void setCreditlimit(int i, SearchColumnDoubleField _value) {
        this.creditlimit[i] = _value;
    }

    public SearchColumnSelectField[] getEntity() {
        return this.entity;
    }

    public void setEntity(SearchColumnSelectField[] entity) {
        this.entity = entity;
    }

    public SearchColumnSelectField getEntity(int i) {
        return this.entity[i];
    }

    public void setEntity(int i, SearchColumnSelectField _value) {
        this.entity[i] = _value;
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

    public SearchColumnDoubleField[] getInTransitBalance() {
        return this.inTransitBalance;
    }

    public void setInTransitBalance(SearchColumnDoubleField[] inTransitBalance) {
        this.inTransitBalance = inTransitBalance;
    }

    public SearchColumnDoubleField getInTransitBalance(int i) {
        return this.inTransitBalance[i];
    }

    public void setInTransitBalance(int i, SearchColumnDoubleField _value) {
        this.inTransitBalance[i] = _value;
    }

    public SearchColumnDoubleField[] getInTransitBalanceBase() {
        return this.inTransitBalanceBase;
    }

    public void setInTransitBalanceBase(SearchColumnDoubleField[] inTransitBalanceBase) {
        this.inTransitBalanceBase = inTransitBalanceBase;
    }

    public SearchColumnDoubleField getInTransitBalanceBase(int i) {
        return this.inTransitBalanceBase[i];
    }

    public void setInTransitBalanceBase(int i, SearchColumnDoubleField _value) {
        this.inTransitBalanceBase[i] = _value;
    }

    public SearchColumnBooleanField[] getIsprimarysub() {
        return this.isprimarysub;
    }

    public void setIsprimarysub(SearchColumnBooleanField[] isprimarysub) {
        this.isprimarysub = isprimarysub;
    }

    public SearchColumnBooleanField getIsprimarysub(int i) {
        return this.isprimarysub[i];
    }

    public void setIsprimarysub(int i, SearchColumnBooleanField _value) {
        this.isprimarysub[i] = _value;
    }

    public SearchColumnSelectField[] getPrimaryCurrency() {
        return this.primaryCurrency;
    }

    public void setPrimaryCurrency(SearchColumnSelectField[] primaryCurrency) {
        this.primaryCurrency = primaryCurrency;
    }

    public SearchColumnSelectField getPrimaryCurrency(int i) {
        return this.primaryCurrency[i];
    }

    public void setPrimaryCurrency(int i, SearchColumnSelectField _value) {
        this.primaryCurrency[i] = _value;
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

    public SearchColumnSelectField[] getTaxitem() {
        return this.taxitem;
    }

    public void setTaxitem(SearchColumnSelectField[] taxitem) {
        this.taxitem = taxitem;
    }

    public SearchColumnSelectField getTaxitem(int i) {
        return this.taxitem[i];
    }

    public void setTaxitem(int i, SearchColumnSelectField _value) {
        this.taxitem[i] = _value;
    }

    public SearchColumnDoubleField[] getUnbilledorders() {
        return this.unbilledorders;
    }

    public void setUnbilledorders(SearchColumnDoubleField[] unbilledorders) {
        this.unbilledorders = unbilledorders;
    }

    public SearchColumnDoubleField getUnbilledorders(int i) {
        return this.unbilledorders[i];
    }

    public void setUnbilledorders(int i, SearchColumnDoubleField _value) {
        this.unbilledorders[i] = _value;
    }

    public SearchColumnDoubleField[] getUnbilledordersbase() {
        return this.unbilledordersbase;
    }

    public void setUnbilledordersbase(SearchColumnDoubleField[] unbilledordersbase) {
        this.unbilledordersbase = unbilledordersbase;
    }

    public SearchColumnDoubleField getUnbilledordersbase(int i) {
        return this.unbilledordersbase[i];
    }

    public void setUnbilledordersbase(int i, SearchColumnDoubleField _value) {
        this.unbilledordersbase[i] = _value;
    }

    public SearchColumnCustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof VendorSubsidiaryRelationshipSearchRowBasic)) {
            return false;
        }
        VendorSubsidiaryRelationshipSearchRowBasic other = (VendorSubsidiaryRelationshipSearchRowBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.balance == null && other.getBalance() == null || this.balance != null && Arrays.equals(this.balance, other.getBalance())) && (this.balancebase == null && other.getBalancebase() == null || this.balancebase != null && Arrays.equals(this.balancebase, other.getBalancebase())) && (this.baseCurrency == null && other.getBaseCurrency() == null || this.baseCurrency != null && Arrays.equals(this.baseCurrency, other.getBaseCurrency())) && (this.creditlimit == null && other.getCreditlimit() == null || this.creditlimit != null && Arrays.equals(this.creditlimit, other.getCreditlimit())) && (this.entity == null && other.getEntity() == null || this.entity != null && Arrays.equals(this.entity, other.getEntity())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && Arrays.equals(this.externalId, other.getExternalId())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && Arrays.equals(this.internalId, other.getInternalId())) && (this.inTransitBalance == null && other.getInTransitBalance() == null || this.inTransitBalance != null && Arrays.equals(this.inTransitBalance, other.getInTransitBalance())) && (this.inTransitBalanceBase == null && other.getInTransitBalanceBase() == null || this.inTransitBalanceBase != null && Arrays.equals(this.inTransitBalanceBase, other.getInTransitBalanceBase())) && (this.isprimarysub == null && other.getIsprimarysub() == null || this.isprimarysub != null && Arrays.equals(this.isprimarysub, other.getIsprimarysub())) && (this.primaryCurrency == null && other.getPrimaryCurrency() == null || this.primaryCurrency != null && Arrays.equals(this.primaryCurrency, other.getPrimaryCurrency())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && Arrays.equals(this.subsidiary, other.getSubsidiary())) && (this.taxitem == null && other.getTaxitem() == null || this.taxitem != null && Arrays.equals(this.taxitem, other.getTaxitem())) && (this.unbilledorders == null && other.getUnbilledorders() == null || this.unbilledorders != null && Arrays.equals(this.unbilledorders, other.getUnbilledorders())) && (this.unbilledordersbase == null && other.getUnbilledordersbase() == null || this.unbilledordersbase != null && Arrays.equals(this.unbilledordersbase, other.getUnbilledordersbase())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
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
        if (this.getBalance() != null) {
            for (i = 0; i < Array.getLength(this.getBalance()); ++i) {
                obj = Array.get(this.getBalance(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBalancebase() != null) {
            for (i = 0; i < Array.getLength(this.getBalancebase()); ++i) {
                obj = Array.get(this.getBalancebase(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBaseCurrency() != null) {
            for (i = 0; i < Array.getLength(this.getBaseCurrency()); ++i) {
                obj = Array.get(this.getBaseCurrency(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCreditlimit() != null) {
            for (i = 0; i < Array.getLength(this.getCreditlimit()); ++i) {
                obj = Array.get(this.getCreditlimit(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getEntity() != null) {
            for (i = 0; i < Array.getLength(this.getEntity()); ++i) {
                obj = Array.get(this.getEntity(), i);
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
        if (this.getInTransitBalance() != null) {
            for (i = 0; i < Array.getLength(this.getInTransitBalance()); ++i) {
                obj = Array.get(this.getInTransitBalance(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getInTransitBalanceBase() != null) {
            for (i = 0; i < Array.getLength(this.getInTransitBalanceBase()); ++i) {
                obj = Array.get(this.getInTransitBalanceBase(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsprimarysub() != null) {
            for (i = 0; i < Array.getLength(this.getIsprimarysub()); ++i) {
                obj = Array.get(this.getIsprimarysub(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPrimaryCurrency() != null) {
            for (i = 0; i < Array.getLength(this.getPrimaryCurrency()); ++i) {
                obj = Array.get(this.getPrimaryCurrency(), i);
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
        if (this.getTaxitem() != null) {
            for (i = 0; i < Array.getLength(this.getTaxitem()); ++i) {
                obj = Array.get(this.getTaxitem(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getUnbilledorders() != null) {
            for (i = 0; i < Array.getLength(this.getUnbilledorders()); ++i) {
                obj = Array.get(this.getUnbilledorders(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getUnbilledordersbase() != null) {
            for (i = 0; i < Array.getLength(this.getUnbilledordersbase()); ++i) {
                obj = Array.get(this.getUnbilledordersbase(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "VendorSubsidiaryRelationshipSearchRowBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "balance"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("balancebase");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "balancebase"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("baseCurrency");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "baseCurrency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("creditlimit");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "creditlimit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("entity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "entity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("inTransitBalance");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "inTransitBalance"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("inTransitBalanceBase");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "inTransitBalanceBase"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isprimarysub");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isprimarysub"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("primaryCurrency");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "primaryCurrency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
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
        elemField.setFieldName("taxitem");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "taxitem"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("unbilledorders");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "unbilledorders"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("unbilledordersbase");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "unbilledordersbase"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnCustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

