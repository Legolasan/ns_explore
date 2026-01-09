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

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnDoubleField;
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

public class PricingSearchRowBasic
extends SearchRowBasic
implements Serializable {
    private SearchColumnSelectField[] currency;
    private SearchColumnSelectField[] customer;
    private SearchColumnSelectField[] internalId;
    private SearchColumnSelectField[] item;
    private SearchColumnDoubleField[] maximumQuantity;
    private SearchColumnDoubleField[] minimumQuantity;
    private SearchColumnSelectField[] priceLevel;
    private SearchColumnStringField[] quantityRange;
    private SearchColumnSelectField[] saleUnit;
    private SearchColumnDoubleField[] unitPrice;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(PricingSearchRowBasic.class, true);

    public PricingSearchRowBasic() {
    }

    public PricingSearchRowBasic(SearchColumnSelectField[] currency, SearchColumnSelectField[] customer, SearchColumnSelectField[] internalId, SearchColumnSelectField[] item, SearchColumnDoubleField[] maximumQuantity, SearchColumnDoubleField[] minimumQuantity, SearchColumnSelectField[] priceLevel, SearchColumnStringField[] quantityRange, SearchColumnSelectField[] saleUnit, SearchColumnDoubleField[] unitPrice) {
        this.currency = currency;
        this.customer = customer;
        this.internalId = internalId;
        this.item = item;
        this.maximumQuantity = maximumQuantity;
        this.minimumQuantity = minimumQuantity;
        this.priceLevel = priceLevel;
        this.quantityRange = quantityRange;
        this.saleUnit = saleUnit;
        this.unitPrice = unitPrice;
    }

    public SearchColumnSelectField[] getCurrency() {
        return this.currency;
    }

    public void setCurrency(SearchColumnSelectField[] currency) {
        this.currency = currency;
    }

    public SearchColumnSelectField getCurrency(int i) {
        return this.currency[i];
    }

    public void setCurrency(int i, SearchColumnSelectField _value) {
        this.currency[i] = _value;
    }

    public SearchColumnSelectField[] getCustomer() {
        return this.customer;
    }

    public void setCustomer(SearchColumnSelectField[] customer) {
        this.customer = customer;
    }

    public SearchColumnSelectField getCustomer(int i) {
        return this.customer[i];
    }

    public void setCustomer(int i, SearchColumnSelectField _value) {
        this.customer[i] = _value;
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

    public SearchColumnSelectField[] getItem() {
        return this.item;
    }

    public void setItem(SearchColumnSelectField[] item) {
        this.item = item;
    }

    public SearchColumnSelectField getItem(int i) {
        return this.item[i];
    }

    public void setItem(int i, SearchColumnSelectField _value) {
        this.item[i] = _value;
    }

    public SearchColumnDoubleField[] getMaximumQuantity() {
        return this.maximumQuantity;
    }

    public void setMaximumQuantity(SearchColumnDoubleField[] maximumQuantity) {
        this.maximumQuantity = maximumQuantity;
    }

    public SearchColumnDoubleField getMaximumQuantity(int i) {
        return this.maximumQuantity[i];
    }

    public void setMaximumQuantity(int i, SearchColumnDoubleField _value) {
        this.maximumQuantity[i] = _value;
    }

    public SearchColumnDoubleField[] getMinimumQuantity() {
        return this.minimumQuantity;
    }

    public void setMinimumQuantity(SearchColumnDoubleField[] minimumQuantity) {
        this.minimumQuantity = minimumQuantity;
    }

    public SearchColumnDoubleField getMinimumQuantity(int i) {
        return this.minimumQuantity[i];
    }

    public void setMinimumQuantity(int i, SearchColumnDoubleField _value) {
        this.minimumQuantity[i] = _value;
    }

    public SearchColumnSelectField[] getPriceLevel() {
        return this.priceLevel;
    }

    public void setPriceLevel(SearchColumnSelectField[] priceLevel) {
        this.priceLevel = priceLevel;
    }

    public SearchColumnSelectField getPriceLevel(int i) {
        return this.priceLevel[i];
    }

    public void setPriceLevel(int i, SearchColumnSelectField _value) {
        this.priceLevel[i] = _value;
    }

    public SearchColumnStringField[] getQuantityRange() {
        return this.quantityRange;
    }

    public void setQuantityRange(SearchColumnStringField[] quantityRange) {
        this.quantityRange = quantityRange;
    }

    public SearchColumnStringField getQuantityRange(int i) {
        return this.quantityRange[i];
    }

    public void setQuantityRange(int i, SearchColumnStringField _value) {
        this.quantityRange[i] = _value;
    }

    public SearchColumnSelectField[] getSaleUnit() {
        return this.saleUnit;
    }

    public void setSaleUnit(SearchColumnSelectField[] saleUnit) {
        this.saleUnit = saleUnit;
    }

    public SearchColumnSelectField getSaleUnit(int i) {
        return this.saleUnit[i];
    }

    public void setSaleUnit(int i, SearchColumnSelectField _value) {
        this.saleUnit[i] = _value;
    }

    public SearchColumnDoubleField[] getUnitPrice() {
        return this.unitPrice;
    }

    public void setUnitPrice(SearchColumnDoubleField[] unitPrice) {
        this.unitPrice = unitPrice;
    }

    public SearchColumnDoubleField getUnitPrice(int i) {
        return this.unitPrice[i];
    }

    public void setUnitPrice(int i, SearchColumnDoubleField _value) {
        this.unitPrice[i] = _value;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PricingSearchRowBasic)) {
            return false;
        }
        PricingSearchRowBasic other = (PricingSearchRowBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.currency == null && other.getCurrency() == null || this.currency != null && Arrays.equals(this.currency, other.getCurrency())) && (this.customer == null && other.getCustomer() == null || this.customer != null && Arrays.equals(this.customer, other.getCustomer())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && Arrays.equals(this.internalId, other.getInternalId())) && (this.item == null && other.getItem() == null || this.item != null && Arrays.equals(this.item, other.getItem())) && (this.maximumQuantity == null && other.getMaximumQuantity() == null || this.maximumQuantity != null && Arrays.equals(this.maximumQuantity, other.getMaximumQuantity())) && (this.minimumQuantity == null && other.getMinimumQuantity() == null || this.minimumQuantity != null && Arrays.equals(this.minimumQuantity, other.getMinimumQuantity())) && (this.priceLevel == null && other.getPriceLevel() == null || this.priceLevel != null && Arrays.equals(this.priceLevel, other.getPriceLevel())) && (this.quantityRange == null && other.getQuantityRange() == null || this.quantityRange != null && Arrays.equals(this.quantityRange, other.getQuantityRange())) && (this.saleUnit == null && other.getSaleUnit() == null || this.saleUnit != null && Arrays.equals(this.saleUnit, other.getSaleUnit())) && (this.unitPrice == null && other.getUnitPrice() == null || this.unitPrice != null && Arrays.equals(this.unitPrice, other.getUnitPrice()));
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
        if (this.getCurrency() != null) {
            for (i = 0; i < Array.getLength(this.getCurrency()); ++i) {
                obj = Array.get(this.getCurrency(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCustomer() != null) {
            for (i = 0; i < Array.getLength(this.getCustomer()); ++i) {
                obj = Array.get(this.getCustomer(), i);
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
        if (this.getItem() != null) {
            for (i = 0; i < Array.getLength(this.getItem()); ++i) {
                obj = Array.get(this.getItem(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getMaximumQuantity() != null) {
            for (i = 0; i < Array.getLength(this.getMaximumQuantity()); ++i) {
                obj = Array.get(this.getMaximumQuantity(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getMinimumQuantity() != null) {
            for (i = 0; i < Array.getLength(this.getMinimumQuantity()); ++i) {
                obj = Array.get(this.getMinimumQuantity(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPriceLevel() != null) {
            for (i = 0; i < Array.getLength(this.getPriceLevel()); ++i) {
                obj = Array.get(this.getPriceLevel(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getQuantityRange() != null) {
            for (i = 0; i < Array.getLength(this.getQuantityRange()); ++i) {
                obj = Array.get(this.getQuantityRange(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSaleUnit() != null) {
            for (i = 0; i < Array.getLength(this.getSaleUnit()); ++i) {
                obj = Array.get(this.getSaleUnit(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getUnitPrice() != null) {
            for (i = 0; i < Array.getLength(this.getUnitPrice()); ++i) {
                obj = Array.get(this.getUnitPrice(), i);
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "PricingSearchRowBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customer");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "customer"));
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
        elemField.setFieldName("item");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("maximumQuantity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "maximumQuantity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("minimumQuantity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "minimumQuantity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("priceLevel");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "priceLevel"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityRange");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "quantityRange"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("saleUnit");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "saleUnit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("unitPrice");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "unitPrice"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

