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
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchDateField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchDoubleField;
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

public class FairValuePriceSearchBasic
extends SearchRecordBasic
implements Serializable {
    private SearchMultiSelectField currency;
    private SearchDateField endDate;
    private SearchMultiSelectField externalId;
    private SearchStringField externalIdString;
    private SearchDoubleField fairValue;
    private SearchMultiSelectField fairValueFormula;
    private SearchEnumMultiSelectField fairValueRangePolicy;
    private SearchDoubleField highValue;
    private SearchDoubleField highValuePercent;
    private SearchMultiSelectField internalId;
    private SearchLongField internalIdNumber;
    private SearchBooleanField isVsoePrice;
    private SearchMultiSelectField item;
    private SearchMultiSelectField itemRevenueCategory;
    private SearchDoubleField lowValue;
    private SearchDoubleField lowValuePercent;
    private SearchDateField startDate;
    private SearchMultiSelectField unitsType;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(FairValuePriceSearchBasic.class, true);

    public FairValuePriceSearchBasic() {
    }

    public FairValuePriceSearchBasic(SearchMultiSelectField currency, SearchDateField endDate, SearchMultiSelectField externalId, SearchStringField externalIdString, SearchDoubleField fairValue, SearchMultiSelectField fairValueFormula, SearchEnumMultiSelectField fairValueRangePolicy, SearchDoubleField highValue, SearchDoubleField highValuePercent, SearchMultiSelectField internalId, SearchLongField internalIdNumber, SearchBooleanField isVsoePrice, SearchMultiSelectField item, SearchMultiSelectField itemRevenueCategory, SearchDoubleField lowValue, SearchDoubleField lowValuePercent, SearchDateField startDate, SearchMultiSelectField unitsType) {
        this.currency = currency;
        this.endDate = endDate;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.fairValue = fairValue;
        this.fairValueFormula = fairValueFormula;
        this.fairValueRangePolicy = fairValueRangePolicy;
        this.highValue = highValue;
        this.highValuePercent = highValuePercent;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.isVsoePrice = isVsoePrice;
        this.item = item;
        this.itemRevenueCategory = itemRevenueCategory;
        this.lowValue = lowValue;
        this.lowValuePercent = lowValuePercent;
        this.startDate = startDate;
        this.unitsType = unitsType;
    }

    public SearchMultiSelectField getCurrency() {
        return this.currency;
    }

    public void setCurrency(SearchMultiSelectField currency) {
        this.currency = currency;
    }

    public SearchDateField getEndDate() {
        return this.endDate;
    }

    public void setEndDate(SearchDateField endDate) {
        this.endDate = endDate;
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

    public SearchDoubleField getFairValue() {
        return this.fairValue;
    }

    public void setFairValue(SearchDoubleField fairValue) {
        this.fairValue = fairValue;
    }

    public SearchMultiSelectField getFairValueFormula() {
        return this.fairValueFormula;
    }

    public void setFairValueFormula(SearchMultiSelectField fairValueFormula) {
        this.fairValueFormula = fairValueFormula;
    }

    public SearchEnumMultiSelectField getFairValueRangePolicy() {
        return this.fairValueRangePolicy;
    }

    public void setFairValueRangePolicy(SearchEnumMultiSelectField fairValueRangePolicy) {
        this.fairValueRangePolicy = fairValueRangePolicy;
    }

    public SearchDoubleField getHighValue() {
        return this.highValue;
    }

    public void setHighValue(SearchDoubleField highValue) {
        this.highValue = highValue;
    }

    public SearchDoubleField getHighValuePercent() {
        return this.highValuePercent;
    }

    public void setHighValuePercent(SearchDoubleField highValuePercent) {
        this.highValuePercent = highValuePercent;
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

    public SearchBooleanField getIsVsoePrice() {
        return this.isVsoePrice;
    }

    public void setIsVsoePrice(SearchBooleanField isVsoePrice) {
        this.isVsoePrice = isVsoePrice;
    }

    public SearchMultiSelectField getItem() {
        return this.item;
    }

    public void setItem(SearchMultiSelectField item) {
        this.item = item;
    }

    public SearchMultiSelectField getItemRevenueCategory() {
        return this.itemRevenueCategory;
    }

    public void setItemRevenueCategory(SearchMultiSelectField itemRevenueCategory) {
        this.itemRevenueCategory = itemRevenueCategory;
    }

    public SearchDoubleField getLowValue() {
        return this.lowValue;
    }

    public void setLowValue(SearchDoubleField lowValue) {
        this.lowValue = lowValue;
    }

    public SearchDoubleField getLowValuePercent() {
        return this.lowValuePercent;
    }

    public void setLowValuePercent(SearchDoubleField lowValuePercent) {
        this.lowValuePercent = lowValuePercent;
    }

    public SearchDateField getStartDate() {
        return this.startDate;
    }

    public void setStartDate(SearchDateField startDate) {
        this.startDate = startDate;
    }

    public SearchMultiSelectField getUnitsType() {
        return this.unitsType;
    }

    public void setUnitsType(SearchMultiSelectField unitsType) {
        this.unitsType = unitsType;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof FairValuePriceSearchBasic)) {
            return false;
        }
        FairValuePriceSearchBasic other = (FairValuePriceSearchBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.currency == null && other.getCurrency() == null || this.currency != null && this.currency.equals(other.getCurrency())) && (this.endDate == null && other.getEndDate() == null || this.endDate != null && this.endDate.equals(other.getEndDate())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId())) && (this.externalIdString == null && other.getExternalIdString() == null || this.externalIdString != null && this.externalIdString.equals(other.getExternalIdString())) && (this.fairValue == null && other.getFairValue() == null || this.fairValue != null && this.fairValue.equals(other.getFairValue())) && (this.fairValueFormula == null && other.getFairValueFormula() == null || this.fairValueFormula != null && this.fairValueFormula.equals(other.getFairValueFormula())) && (this.fairValueRangePolicy == null && other.getFairValueRangePolicy() == null || this.fairValueRangePolicy != null && this.fairValueRangePolicy.equals(other.getFairValueRangePolicy())) && (this.highValue == null && other.getHighValue() == null || this.highValue != null && this.highValue.equals(other.getHighValue())) && (this.highValuePercent == null && other.getHighValuePercent() == null || this.highValuePercent != null && this.highValuePercent.equals(other.getHighValuePercent())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.internalIdNumber == null && other.getInternalIdNumber() == null || this.internalIdNumber != null && this.internalIdNumber.equals(other.getInternalIdNumber())) && (this.isVsoePrice == null && other.getIsVsoePrice() == null || this.isVsoePrice != null && this.isVsoePrice.equals(other.getIsVsoePrice())) && (this.item == null && other.getItem() == null || this.item != null && this.item.equals(other.getItem())) && (this.itemRevenueCategory == null && other.getItemRevenueCategory() == null || this.itemRevenueCategory != null && this.itemRevenueCategory.equals(other.getItemRevenueCategory())) && (this.lowValue == null && other.getLowValue() == null || this.lowValue != null && this.lowValue.equals(other.getLowValue())) && (this.lowValuePercent == null && other.getLowValuePercent() == null || this.lowValuePercent != null && this.lowValuePercent.equals(other.getLowValuePercent())) && (this.startDate == null && other.getStartDate() == null || this.startDate != null && this.startDate.equals(other.getStartDate())) && (this.unitsType == null && other.getUnitsType() == null || this.unitsType != null && this.unitsType.equals(other.getUnitsType()));
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
        if (this.getCurrency() != null) {
            _hashCode += this.getCurrency().hashCode();
        }
        if (this.getEndDate() != null) {
            _hashCode += this.getEndDate().hashCode();
        }
        if (this.getExternalId() != null) {
            _hashCode += this.getExternalId().hashCode();
        }
        if (this.getExternalIdString() != null) {
            _hashCode += this.getExternalIdString().hashCode();
        }
        if (this.getFairValue() != null) {
            _hashCode += this.getFairValue().hashCode();
        }
        if (this.getFairValueFormula() != null) {
            _hashCode += this.getFairValueFormula().hashCode();
        }
        if (this.getFairValueRangePolicy() != null) {
            _hashCode += this.getFairValueRangePolicy().hashCode();
        }
        if (this.getHighValue() != null) {
            _hashCode += this.getHighValue().hashCode();
        }
        if (this.getHighValuePercent() != null) {
            _hashCode += this.getHighValuePercent().hashCode();
        }
        if (this.getInternalId() != null) {
            _hashCode += this.getInternalId().hashCode();
        }
        if (this.getInternalIdNumber() != null) {
            _hashCode += this.getInternalIdNumber().hashCode();
        }
        if (this.getIsVsoePrice() != null) {
            _hashCode += this.getIsVsoePrice().hashCode();
        }
        if (this.getItem() != null) {
            _hashCode += this.getItem().hashCode();
        }
        if (this.getItemRevenueCategory() != null) {
            _hashCode += this.getItemRevenueCategory().hashCode();
        }
        if (this.getLowValue() != null) {
            _hashCode += this.getLowValue().hashCode();
        }
        if (this.getLowValuePercent() != null) {
            _hashCode += this.getLowValuePercent().hashCode();
        }
        if (this.getStartDate() != null) {
            _hashCode += this.getStartDate().hashCode();
        }
        if (this.getUnitsType() != null) {
            _hashCode += this.getUnitsType().hashCode();
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "FairValuePriceSearchBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "endDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
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
        elemField.setFieldName("fairValue");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fairValue"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fairValueFormula");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fairValueFormula"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fairValueRangePolicy");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "fairValueRangePolicy"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("highValue");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "highValue"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("highValuePercent");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "highValuePercent"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
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
        elemField.setFieldName("isVsoePrice");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isVsoePrice"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemRevenueCategory");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "itemRevenueCategory"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lowValue");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lowValue"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lowValuePercent");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lowValuePercent"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("unitsType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "unitsType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

