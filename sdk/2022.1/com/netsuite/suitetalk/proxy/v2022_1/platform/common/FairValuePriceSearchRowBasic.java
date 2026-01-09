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
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnDateField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnDoubleField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnEnumSelectField;
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

public class FairValuePriceSearchRowBasic
extends SearchRowBasic
implements Serializable {
    private SearchColumnSelectField[] currency;
    private SearchColumnDateField[] endDate;
    private SearchColumnSelectField[] externalId;
    private SearchColumnDoubleField[] fairValue;
    private SearchColumnSelectField[] fairValueFormula;
    private SearchColumnEnumSelectField[] fairValueRangePolicy;
    private SearchColumnDoubleField[] highValue;
    private SearchColumnDoubleField[] highValuePercent;
    private SearchColumnSelectField[] internalId;
    private SearchColumnBooleanField[] isVsoePrice;
    private SearchColumnSelectField[] item;
    private SearchColumnSelectField[] itemRevenueCategory;
    private SearchColumnDoubleField[] lowValue;
    private SearchColumnDoubleField[] lowValuePercent;
    private SearchColumnDateField[] startDate;
    private SearchColumnSelectField[] units;
    private SearchColumnSelectField[] unitsType;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(FairValuePriceSearchRowBasic.class, true);

    public FairValuePriceSearchRowBasic() {
    }

    public FairValuePriceSearchRowBasic(SearchColumnSelectField[] currency, SearchColumnDateField[] endDate, SearchColumnSelectField[] externalId, SearchColumnDoubleField[] fairValue, SearchColumnSelectField[] fairValueFormula, SearchColumnEnumSelectField[] fairValueRangePolicy, SearchColumnDoubleField[] highValue, SearchColumnDoubleField[] highValuePercent, SearchColumnSelectField[] internalId, SearchColumnBooleanField[] isVsoePrice, SearchColumnSelectField[] item, SearchColumnSelectField[] itemRevenueCategory, SearchColumnDoubleField[] lowValue, SearchColumnDoubleField[] lowValuePercent, SearchColumnDateField[] startDate, SearchColumnSelectField[] units, SearchColumnSelectField[] unitsType) {
        this.currency = currency;
        this.endDate = endDate;
        this.externalId = externalId;
        this.fairValue = fairValue;
        this.fairValueFormula = fairValueFormula;
        this.fairValueRangePolicy = fairValueRangePolicy;
        this.highValue = highValue;
        this.highValuePercent = highValuePercent;
        this.internalId = internalId;
        this.isVsoePrice = isVsoePrice;
        this.item = item;
        this.itemRevenueCategory = itemRevenueCategory;
        this.lowValue = lowValue;
        this.lowValuePercent = lowValuePercent;
        this.startDate = startDate;
        this.units = units;
        this.unitsType = unitsType;
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

    public SearchColumnDateField[] getEndDate() {
        return this.endDate;
    }

    public void setEndDate(SearchColumnDateField[] endDate) {
        this.endDate = endDate;
    }

    public SearchColumnDateField getEndDate(int i) {
        return this.endDate[i];
    }

    public void setEndDate(int i, SearchColumnDateField _value) {
        this.endDate[i] = _value;
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

    public SearchColumnDoubleField[] getFairValue() {
        return this.fairValue;
    }

    public void setFairValue(SearchColumnDoubleField[] fairValue) {
        this.fairValue = fairValue;
    }

    public SearchColumnDoubleField getFairValue(int i) {
        return this.fairValue[i];
    }

    public void setFairValue(int i, SearchColumnDoubleField _value) {
        this.fairValue[i] = _value;
    }

    public SearchColumnSelectField[] getFairValueFormula() {
        return this.fairValueFormula;
    }

    public void setFairValueFormula(SearchColumnSelectField[] fairValueFormula) {
        this.fairValueFormula = fairValueFormula;
    }

    public SearchColumnSelectField getFairValueFormula(int i) {
        return this.fairValueFormula[i];
    }

    public void setFairValueFormula(int i, SearchColumnSelectField _value) {
        this.fairValueFormula[i] = _value;
    }

    public SearchColumnEnumSelectField[] getFairValueRangePolicy() {
        return this.fairValueRangePolicy;
    }

    public void setFairValueRangePolicy(SearchColumnEnumSelectField[] fairValueRangePolicy) {
        this.fairValueRangePolicy = fairValueRangePolicy;
    }

    public SearchColumnEnumSelectField getFairValueRangePolicy(int i) {
        return this.fairValueRangePolicy[i];
    }

    public void setFairValueRangePolicy(int i, SearchColumnEnumSelectField _value) {
        this.fairValueRangePolicy[i] = _value;
    }

    public SearchColumnDoubleField[] getHighValue() {
        return this.highValue;
    }

    public void setHighValue(SearchColumnDoubleField[] highValue) {
        this.highValue = highValue;
    }

    public SearchColumnDoubleField getHighValue(int i) {
        return this.highValue[i];
    }

    public void setHighValue(int i, SearchColumnDoubleField _value) {
        this.highValue[i] = _value;
    }

    public SearchColumnDoubleField[] getHighValuePercent() {
        return this.highValuePercent;
    }

    public void setHighValuePercent(SearchColumnDoubleField[] highValuePercent) {
        this.highValuePercent = highValuePercent;
    }

    public SearchColumnDoubleField getHighValuePercent(int i) {
        return this.highValuePercent[i];
    }

    public void setHighValuePercent(int i, SearchColumnDoubleField _value) {
        this.highValuePercent[i] = _value;
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

    public SearchColumnBooleanField[] getIsVsoePrice() {
        return this.isVsoePrice;
    }

    public void setIsVsoePrice(SearchColumnBooleanField[] isVsoePrice) {
        this.isVsoePrice = isVsoePrice;
    }

    public SearchColumnBooleanField getIsVsoePrice(int i) {
        return this.isVsoePrice[i];
    }

    public void setIsVsoePrice(int i, SearchColumnBooleanField _value) {
        this.isVsoePrice[i] = _value;
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

    public SearchColumnSelectField[] getItemRevenueCategory() {
        return this.itemRevenueCategory;
    }

    public void setItemRevenueCategory(SearchColumnSelectField[] itemRevenueCategory) {
        this.itemRevenueCategory = itemRevenueCategory;
    }

    public SearchColumnSelectField getItemRevenueCategory(int i) {
        return this.itemRevenueCategory[i];
    }

    public void setItemRevenueCategory(int i, SearchColumnSelectField _value) {
        this.itemRevenueCategory[i] = _value;
    }

    public SearchColumnDoubleField[] getLowValue() {
        return this.lowValue;
    }

    public void setLowValue(SearchColumnDoubleField[] lowValue) {
        this.lowValue = lowValue;
    }

    public SearchColumnDoubleField getLowValue(int i) {
        return this.lowValue[i];
    }

    public void setLowValue(int i, SearchColumnDoubleField _value) {
        this.lowValue[i] = _value;
    }

    public SearchColumnDoubleField[] getLowValuePercent() {
        return this.lowValuePercent;
    }

    public void setLowValuePercent(SearchColumnDoubleField[] lowValuePercent) {
        this.lowValuePercent = lowValuePercent;
    }

    public SearchColumnDoubleField getLowValuePercent(int i) {
        return this.lowValuePercent[i];
    }

    public void setLowValuePercent(int i, SearchColumnDoubleField _value) {
        this.lowValuePercent[i] = _value;
    }

    public SearchColumnDateField[] getStartDate() {
        return this.startDate;
    }

    public void setStartDate(SearchColumnDateField[] startDate) {
        this.startDate = startDate;
    }

    public SearchColumnDateField getStartDate(int i) {
        return this.startDate[i];
    }

    public void setStartDate(int i, SearchColumnDateField _value) {
        this.startDate[i] = _value;
    }

    public SearchColumnSelectField[] getUnits() {
        return this.units;
    }

    public void setUnits(SearchColumnSelectField[] units) {
        this.units = units;
    }

    public SearchColumnSelectField getUnits(int i) {
        return this.units[i];
    }

    public void setUnits(int i, SearchColumnSelectField _value) {
        this.units[i] = _value;
    }

    public SearchColumnSelectField[] getUnitsType() {
        return this.unitsType;
    }

    public void setUnitsType(SearchColumnSelectField[] unitsType) {
        this.unitsType = unitsType;
    }

    public SearchColumnSelectField getUnitsType(int i) {
        return this.unitsType[i];
    }

    public void setUnitsType(int i, SearchColumnSelectField _value) {
        this.unitsType[i] = _value;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof FairValuePriceSearchRowBasic)) {
            return false;
        }
        FairValuePriceSearchRowBasic other = (FairValuePriceSearchRowBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.currency == null && other.getCurrency() == null || this.currency != null && Arrays.equals(this.currency, other.getCurrency())) && (this.endDate == null && other.getEndDate() == null || this.endDate != null && Arrays.equals(this.endDate, other.getEndDate())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && Arrays.equals(this.externalId, other.getExternalId())) && (this.fairValue == null && other.getFairValue() == null || this.fairValue != null && Arrays.equals(this.fairValue, other.getFairValue())) && (this.fairValueFormula == null && other.getFairValueFormula() == null || this.fairValueFormula != null && Arrays.equals(this.fairValueFormula, other.getFairValueFormula())) && (this.fairValueRangePolicy == null && other.getFairValueRangePolicy() == null || this.fairValueRangePolicy != null && Arrays.equals(this.fairValueRangePolicy, other.getFairValueRangePolicy())) && (this.highValue == null && other.getHighValue() == null || this.highValue != null && Arrays.equals(this.highValue, other.getHighValue())) && (this.highValuePercent == null && other.getHighValuePercent() == null || this.highValuePercent != null && Arrays.equals(this.highValuePercent, other.getHighValuePercent())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && Arrays.equals(this.internalId, other.getInternalId())) && (this.isVsoePrice == null && other.getIsVsoePrice() == null || this.isVsoePrice != null && Arrays.equals(this.isVsoePrice, other.getIsVsoePrice())) && (this.item == null && other.getItem() == null || this.item != null && Arrays.equals(this.item, other.getItem())) && (this.itemRevenueCategory == null && other.getItemRevenueCategory() == null || this.itemRevenueCategory != null && Arrays.equals(this.itemRevenueCategory, other.getItemRevenueCategory())) && (this.lowValue == null && other.getLowValue() == null || this.lowValue != null && Arrays.equals(this.lowValue, other.getLowValue())) && (this.lowValuePercent == null && other.getLowValuePercent() == null || this.lowValuePercent != null && Arrays.equals(this.lowValuePercent, other.getLowValuePercent())) && (this.startDate == null && other.getStartDate() == null || this.startDate != null && Arrays.equals(this.startDate, other.getStartDate())) && (this.units == null && other.getUnits() == null || this.units != null && Arrays.equals(this.units, other.getUnits())) && (this.unitsType == null && other.getUnitsType() == null || this.unitsType != null && Arrays.equals(this.unitsType, other.getUnitsType()));
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
        if (this.getEndDate() != null) {
            for (i = 0; i < Array.getLength(this.getEndDate()); ++i) {
                obj = Array.get(this.getEndDate(), i);
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
        if (this.getFairValue() != null) {
            for (i = 0; i < Array.getLength(this.getFairValue()); ++i) {
                obj = Array.get(this.getFairValue(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getFairValueFormula() != null) {
            for (i = 0; i < Array.getLength(this.getFairValueFormula()); ++i) {
                obj = Array.get(this.getFairValueFormula(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getFairValueRangePolicy() != null) {
            for (i = 0; i < Array.getLength(this.getFairValueRangePolicy()); ++i) {
                obj = Array.get(this.getFairValueRangePolicy(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getHighValue() != null) {
            for (i = 0; i < Array.getLength(this.getHighValue()); ++i) {
                obj = Array.get(this.getHighValue(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getHighValuePercent() != null) {
            for (i = 0; i < Array.getLength(this.getHighValuePercent()); ++i) {
                obj = Array.get(this.getHighValuePercent(), i);
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
        if (this.getIsVsoePrice() != null) {
            for (i = 0; i < Array.getLength(this.getIsVsoePrice()); ++i) {
                obj = Array.get(this.getIsVsoePrice(), i);
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
        if (this.getItemRevenueCategory() != null) {
            for (i = 0; i < Array.getLength(this.getItemRevenueCategory()); ++i) {
                obj = Array.get(this.getItemRevenueCategory(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLowValue() != null) {
            for (i = 0; i < Array.getLength(this.getLowValue()); ++i) {
                obj = Array.get(this.getLowValue(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLowValuePercent() != null) {
            for (i = 0; i < Array.getLength(this.getLowValuePercent()); ++i) {
                obj = Array.get(this.getLowValuePercent(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getStartDate() != null) {
            for (i = 0; i < Array.getLength(this.getStartDate()); ++i) {
                obj = Array.get(this.getStartDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getUnits() != null) {
            for (i = 0; i < Array.getLength(this.getUnits()); ++i) {
                obj = Array.get(this.getUnits(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getUnitsType() != null) {
            for (i = 0; i < Array.getLength(this.getUnitsType()); ++i) {
                obj = Array.get(this.getUnitsType(), i);
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "FairValuePriceSearchRowBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "endDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
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
        elemField.setFieldName("fairValue");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fairValue"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fairValueFormula");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fairValueFormula"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fairValueRangePolicy");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fairValueRangePolicy"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("highValue");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "highValue"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("highValuePercent");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "highValuePercent"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
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
        elemField.setFieldName("isVsoePrice");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isVsoePrice"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
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
        elemField.setFieldName("itemRevenueCategory");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "itemRevenueCategory"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lowValue");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lowValue"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lowValuePercent");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lowValuePercent"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("units");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "units"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("unitsType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "unitsType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

