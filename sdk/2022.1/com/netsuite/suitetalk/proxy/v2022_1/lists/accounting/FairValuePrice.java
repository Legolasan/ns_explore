/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.axis.description.AttributeDesc
 *  org.apache.axis.description.ElementDesc
 *  org.apache.axis.description.FieldDesc
 *  org.apache.axis.description.TypeDesc
 *  org.apache.axis.encoding.Deserializer
 *  org.apache.axis.encoding.Serializer
 *  org.apache.axis.encoding.ser.BeanDeserializer
 *  org.apache.axis.encoding.ser.BeanSerializer
 */
package com.netsuite.suitetalk.proxy.v2022_1.lists.accounting;

import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.types.FairValuePriceFairValueRangePolicy;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.CustomFieldList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.DimensionList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.NullField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.Record;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import java.io.Serializable;
import java.util.Calendar;
import javax.xml.namespace.QName;
import org.apache.axis.description.AttributeDesc;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class FairValuePrice
extends Record
implements Serializable {
    private RecordRef customForm;
    private RecordRef item;
    private RecordRef itemRevenueCategory;
    private Double fairValue;
    private RecordRef fairValueFormula;
    private RecordRef currency;
    private RecordRef unitsType;
    private RecordRef units;
    private FairValuePriceFairValueRangePolicy fairValueRangePolicy;
    private Double lowValue;
    private Double lowValuePercent;
    private Double highValue;
    private Double highValuePercent;
    private Boolean isVsoePrice;
    private Calendar startDate;
    private Calendar endDate;
    private CustomFieldList customFieldList;
    private DimensionList dimensionList;
    private String internalId;
    private String externalId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(FairValuePrice.class, true);

    public FairValuePrice() {
    }

    public FairValuePrice(NullField nullFieldList, String internalId, String externalId, RecordRef customForm, RecordRef item, RecordRef itemRevenueCategory, Double fairValue, RecordRef fairValueFormula, RecordRef currency, RecordRef unitsType, RecordRef units, FairValuePriceFairValueRangePolicy fairValueRangePolicy, Double lowValue, Double lowValuePercent, Double highValue, Double highValuePercent, Boolean isVsoePrice, Calendar startDate, Calendar endDate, CustomFieldList customFieldList, DimensionList dimensionList) {
        super(nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.customForm = customForm;
        this.item = item;
        this.itemRevenueCategory = itemRevenueCategory;
        this.fairValue = fairValue;
        this.fairValueFormula = fairValueFormula;
        this.currency = currency;
        this.unitsType = unitsType;
        this.units = units;
        this.fairValueRangePolicy = fairValueRangePolicy;
        this.lowValue = lowValue;
        this.lowValuePercent = lowValuePercent;
        this.highValue = highValue;
        this.highValuePercent = highValuePercent;
        this.isVsoePrice = isVsoePrice;
        this.startDate = startDate;
        this.endDate = endDate;
        this.customFieldList = customFieldList;
        this.dimensionList = dimensionList;
    }

    public RecordRef getCustomForm() {
        return this.customForm;
    }

    public void setCustomForm(RecordRef customForm) {
        this.customForm = customForm;
    }

    public RecordRef getItem() {
        return this.item;
    }

    public void setItem(RecordRef item) {
        this.item = item;
    }

    public RecordRef getItemRevenueCategory() {
        return this.itemRevenueCategory;
    }

    public void setItemRevenueCategory(RecordRef itemRevenueCategory) {
        this.itemRevenueCategory = itemRevenueCategory;
    }

    public Double getFairValue() {
        return this.fairValue;
    }

    public void setFairValue(Double fairValue) {
        this.fairValue = fairValue;
    }

    public RecordRef getFairValueFormula() {
        return this.fairValueFormula;
    }

    public void setFairValueFormula(RecordRef fairValueFormula) {
        this.fairValueFormula = fairValueFormula;
    }

    public RecordRef getCurrency() {
        return this.currency;
    }

    public void setCurrency(RecordRef currency) {
        this.currency = currency;
    }

    public RecordRef getUnitsType() {
        return this.unitsType;
    }

    public void setUnitsType(RecordRef unitsType) {
        this.unitsType = unitsType;
    }

    public RecordRef getUnits() {
        return this.units;
    }

    public void setUnits(RecordRef units) {
        this.units = units;
    }

    public FairValuePriceFairValueRangePolicy getFairValueRangePolicy() {
        return this.fairValueRangePolicy;
    }

    public void setFairValueRangePolicy(FairValuePriceFairValueRangePolicy fairValueRangePolicy) {
        this.fairValueRangePolicy = fairValueRangePolicy;
    }

    public Double getLowValue() {
        return this.lowValue;
    }

    public void setLowValue(Double lowValue) {
        this.lowValue = lowValue;
    }

    public Double getLowValuePercent() {
        return this.lowValuePercent;
    }

    public void setLowValuePercent(Double lowValuePercent) {
        this.lowValuePercent = lowValuePercent;
    }

    public Double getHighValue() {
        return this.highValue;
    }

    public void setHighValue(Double highValue) {
        this.highValue = highValue;
    }

    public Double getHighValuePercent() {
        return this.highValuePercent;
    }

    public void setHighValuePercent(Double highValuePercent) {
        this.highValuePercent = highValuePercent;
    }

    public Boolean getIsVsoePrice() {
        return this.isVsoePrice;
    }

    public void setIsVsoePrice(Boolean isVsoePrice) {
        this.isVsoePrice = isVsoePrice;
    }

    public Calendar getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Calendar startDate) {
        this.startDate = startDate;
    }

    public Calendar getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Calendar endDate) {
        this.endDate = endDate;
    }

    public CustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    public DimensionList getDimensionList() {
        return this.dimensionList;
    }

    public void setDimensionList(DimensionList dimensionList) {
        this.dimensionList = dimensionList;
    }

    public String getInternalId() {
        return this.internalId;
    }

    public void setInternalId(String internalId) {
        this.internalId = internalId;
    }

    public String getExternalId() {
        return this.externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof FairValuePrice)) {
            return false;
        }
        FairValuePrice other = (FairValuePrice)obj;
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
        boolean _equals = super.equals(obj) && (this.customForm == null && other.getCustomForm() == null || this.customForm != null && this.customForm.equals(other.getCustomForm())) && (this.item == null && other.getItem() == null || this.item != null && this.item.equals(other.getItem())) && (this.itemRevenueCategory == null && other.getItemRevenueCategory() == null || this.itemRevenueCategory != null && this.itemRevenueCategory.equals(other.getItemRevenueCategory())) && (this.fairValue == null && other.getFairValue() == null || this.fairValue != null && this.fairValue.equals(other.getFairValue())) && (this.fairValueFormula == null && other.getFairValueFormula() == null || this.fairValueFormula != null && this.fairValueFormula.equals(other.getFairValueFormula())) && (this.currency == null && other.getCurrency() == null || this.currency != null && this.currency.equals(other.getCurrency())) && (this.unitsType == null && other.getUnitsType() == null || this.unitsType != null && this.unitsType.equals(other.getUnitsType())) && (this.units == null && other.getUnits() == null || this.units != null && this.units.equals(other.getUnits())) && (this.fairValueRangePolicy == null && other.getFairValueRangePolicy() == null || this.fairValueRangePolicy != null && this.fairValueRangePolicy.equals(other.getFairValueRangePolicy())) && (this.lowValue == null && other.getLowValue() == null || this.lowValue != null && this.lowValue.equals(other.getLowValue())) && (this.lowValuePercent == null && other.getLowValuePercent() == null || this.lowValuePercent != null && this.lowValuePercent.equals(other.getLowValuePercent())) && (this.highValue == null && other.getHighValue() == null || this.highValue != null && this.highValue.equals(other.getHighValue())) && (this.highValuePercent == null && other.getHighValuePercent() == null || this.highValuePercent != null && this.highValuePercent.equals(other.getHighValuePercent())) && (this.isVsoePrice == null && other.getIsVsoePrice() == null || this.isVsoePrice != null && this.isVsoePrice.equals(other.getIsVsoePrice())) && (this.startDate == null && other.getStartDate() == null || this.startDate != null && this.startDate.equals(other.getStartDate())) && (this.endDate == null && other.getEndDate() == null || this.endDate != null && this.endDate.equals(other.getEndDate())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList())) && (this.dimensionList == null && other.getDimensionList() == null || this.dimensionList != null && this.dimensionList.equals(other.getDimensionList())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
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
        if (this.getCustomForm() != null) {
            _hashCode += this.getCustomForm().hashCode();
        }
        if (this.getItem() != null) {
            _hashCode += this.getItem().hashCode();
        }
        if (this.getItemRevenueCategory() != null) {
            _hashCode += this.getItemRevenueCategory().hashCode();
        }
        if (this.getFairValue() != null) {
            _hashCode += this.getFairValue().hashCode();
        }
        if (this.getFairValueFormula() != null) {
            _hashCode += this.getFairValueFormula().hashCode();
        }
        if (this.getCurrency() != null) {
            _hashCode += this.getCurrency().hashCode();
        }
        if (this.getUnitsType() != null) {
            _hashCode += this.getUnitsType().hashCode();
        }
        if (this.getUnits() != null) {
            _hashCode += this.getUnits().hashCode();
        }
        if (this.getFairValueRangePolicy() != null) {
            _hashCode += this.getFairValueRangePolicy().hashCode();
        }
        if (this.getLowValue() != null) {
            _hashCode += this.getLowValue().hashCode();
        }
        if (this.getLowValuePercent() != null) {
            _hashCode += this.getLowValuePercent().hashCode();
        }
        if (this.getHighValue() != null) {
            _hashCode += this.getHighValue().hashCode();
        }
        if (this.getHighValuePercent() != null) {
            _hashCode += this.getHighValuePercent().hashCode();
        }
        if (this.getIsVsoePrice() != null) {
            _hashCode += this.getIsVsoePrice().hashCode();
        }
        if (this.getStartDate() != null) {
            _hashCode += this.getStartDate().hashCode();
        }
        if (this.getEndDate() != null) {
            _hashCode += this.getEndDate().hashCode();
        }
        if (this.getCustomFieldList() != null) {
            _hashCode += this.getCustomFieldList().hashCode();
        }
        if (this.getDimensionList() != null) {
            _hashCode += this.getDimensionList().hashCode();
        }
        if (this.getInternalId() != null) {
            _hashCode += this.getInternalId().hashCode();
        }
        if (this.getExternalId() != null) {
            _hashCode += this.getExternalId().hashCode();
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
        typeDesc.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "FairValuePrice"));
        AttributeDesc attrField = new AttributeDesc();
        attrField.setFieldName("internalId");
        attrField.setXmlName(new QName("", "internalId"));
        attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc((FieldDesc)attrField);
        attrField = new AttributeDesc();
        attrField.setFieldName("externalId");
        attrField.setXmlName(new QName("", "externalId"));
        attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc((FieldDesc)attrField);
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("customForm");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "item"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemRevenueCategory");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "itemRevenueCategory"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fairValue");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "fairValue"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fairValueFormula");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "fairValueFormula"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("unitsType");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "unitsType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("units");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "units"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fairValueRangePolicy");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "fairValueRangePolicy"));
        elemField.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "FairValuePriceFairValueRangePolicy"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lowValue");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "lowValue"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lowValuePercent");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "lowValuePercent"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("highValue");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "highValue"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("highValuePercent");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "highValuePercent"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isVsoePrice");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "isVsoePrice"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "endDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "CustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("dimensionList");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "dimensionList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "DimensionList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

