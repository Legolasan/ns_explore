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
package com.netsuite.suitetalk.proxy.v2022_1.lists.marketing;

import com.netsuite.suitetalk.proxy.v2022_1.lists.marketing.PromotionCodeCurrencyList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.marketing.PromotionCodeItemsList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.marketing.PromotionCodePartnersList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.marketing.types.PromotionCodeApplyDiscountTo;
import com.netsuite.suitetalk.proxy.v2022_1.lists.marketing.types.PromotionCodeUseType;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.CustomFieldList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.NullField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.Record;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRefList;
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

public class PromotionCode
extends Record
implements Serializable {
    private RecordRef implementation;
    private RecordRef customForm;
    private PromotionCodeUseType useType;
    private Boolean displayLineDiscounts;
    private String code;
    private String codePattern;
    private Long numberToGenerate;
    private String description;
    private RecordRefList locationList;
    private Boolean isInactive;
    private RecordRef discount;
    private String rate;
    private Boolean discountType;
    private PromotionCodeApplyDiscountTo applyDiscountTo;
    private RecordRef freeShipMethod;
    private Double minimumOrderAmount;
    private Calendar startDate;
    private Calendar endDate;
    private Boolean isPublic;
    private PromotionCodeCurrencyList currencyList;
    private Boolean excludeItems;
    private String name;
    private PromotionCodeItemsList itemsList;
    private PromotionCodePartnersList partnersList;
    private CustomFieldList customFieldList;
    private String internalId;
    private String externalId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(PromotionCode.class, true);

    public PromotionCode() {
    }

    public PromotionCode(NullField nullFieldList, String internalId, String externalId, RecordRef implementation, RecordRef customForm, PromotionCodeUseType useType, Boolean displayLineDiscounts, String code, String codePattern, Long numberToGenerate, String description, RecordRefList locationList, Boolean isInactive, RecordRef discount, String rate, Boolean discountType, PromotionCodeApplyDiscountTo applyDiscountTo, RecordRef freeShipMethod, Double minimumOrderAmount, Calendar startDate, Calendar endDate, Boolean isPublic, PromotionCodeCurrencyList currencyList, Boolean excludeItems, String name, PromotionCodeItemsList itemsList, PromotionCodePartnersList partnersList, CustomFieldList customFieldList) {
        super(nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.implementation = implementation;
        this.customForm = customForm;
        this.useType = useType;
        this.displayLineDiscounts = displayLineDiscounts;
        this.code = code;
        this.codePattern = codePattern;
        this.numberToGenerate = numberToGenerate;
        this.description = description;
        this.locationList = locationList;
        this.isInactive = isInactive;
        this.discount = discount;
        this.rate = rate;
        this.discountType = discountType;
        this.applyDiscountTo = applyDiscountTo;
        this.freeShipMethod = freeShipMethod;
        this.minimumOrderAmount = minimumOrderAmount;
        this.startDate = startDate;
        this.endDate = endDate;
        this.isPublic = isPublic;
        this.currencyList = currencyList;
        this.excludeItems = excludeItems;
        this.name = name;
        this.itemsList = itemsList;
        this.partnersList = partnersList;
        this.customFieldList = customFieldList;
    }

    public RecordRef getImplementation() {
        return this.implementation;
    }

    public void setImplementation(RecordRef implementation) {
        this.implementation = implementation;
    }

    public RecordRef getCustomForm() {
        return this.customForm;
    }

    public void setCustomForm(RecordRef customForm) {
        this.customForm = customForm;
    }

    public PromotionCodeUseType getUseType() {
        return this.useType;
    }

    public void setUseType(PromotionCodeUseType useType) {
        this.useType = useType;
    }

    public Boolean getDisplayLineDiscounts() {
        return this.displayLineDiscounts;
    }

    public void setDisplayLineDiscounts(Boolean displayLineDiscounts) {
        this.displayLineDiscounts = displayLineDiscounts;
    }

    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCodePattern() {
        return this.codePattern;
    }

    public void setCodePattern(String codePattern) {
        this.codePattern = codePattern;
    }

    public Long getNumberToGenerate() {
        return this.numberToGenerate;
    }

    public void setNumberToGenerate(Long numberToGenerate) {
        this.numberToGenerate = numberToGenerate;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public RecordRefList getLocationList() {
        return this.locationList;
    }

    public void setLocationList(RecordRefList locationList) {
        this.locationList = locationList;
    }

    public Boolean getIsInactive() {
        return this.isInactive;
    }

    public void setIsInactive(Boolean isInactive) {
        this.isInactive = isInactive;
    }

    public RecordRef getDiscount() {
        return this.discount;
    }

    public void setDiscount(RecordRef discount) {
        this.discount = discount;
    }

    public String getRate() {
        return this.rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public Boolean getDiscountType() {
        return this.discountType;
    }

    public void setDiscountType(Boolean discountType) {
        this.discountType = discountType;
    }

    public PromotionCodeApplyDiscountTo getApplyDiscountTo() {
        return this.applyDiscountTo;
    }

    public void setApplyDiscountTo(PromotionCodeApplyDiscountTo applyDiscountTo) {
        this.applyDiscountTo = applyDiscountTo;
    }

    public RecordRef getFreeShipMethod() {
        return this.freeShipMethod;
    }

    public void setFreeShipMethod(RecordRef freeShipMethod) {
        this.freeShipMethod = freeShipMethod;
    }

    public Double getMinimumOrderAmount() {
        return this.minimumOrderAmount;
    }

    public void setMinimumOrderAmount(Double minimumOrderAmount) {
        this.minimumOrderAmount = minimumOrderAmount;
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

    public Boolean getIsPublic() {
        return this.isPublic;
    }

    public void setIsPublic(Boolean isPublic) {
        this.isPublic = isPublic;
    }

    public PromotionCodeCurrencyList getCurrencyList() {
        return this.currencyList;
    }

    public void setCurrencyList(PromotionCodeCurrencyList currencyList) {
        this.currencyList = currencyList;
    }

    public Boolean getExcludeItems() {
        return this.excludeItems;
    }

    public void setExcludeItems(Boolean excludeItems) {
        this.excludeItems = excludeItems;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PromotionCodeItemsList getItemsList() {
        return this.itemsList;
    }

    public void setItemsList(PromotionCodeItemsList itemsList) {
        this.itemsList = itemsList;
    }

    public PromotionCodePartnersList getPartnersList() {
        return this.partnersList;
    }

    public void setPartnersList(PromotionCodePartnersList partnersList) {
        this.partnersList = partnersList;
    }

    public CustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
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
        if (!(obj instanceof PromotionCode)) {
            return false;
        }
        PromotionCode other = (PromotionCode)obj;
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
        boolean _equals = super.equals(obj) && (this.implementation == null && other.getImplementation() == null || this.implementation != null && this.implementation.equals(other.getImplementation())) && (this.customForm == null && other.getCustomForm() == null || this.customForm != null && this.customForm.equals(other.getCustomForm())) && (this.useType == null && other.getUseType() == null || this.useType != null && this.useType.equals(other.getUseType())) && (this.displayLineDiscounts == null && other.getDisplayLineDiscounts() == null || this.displayLineDiscounts != null && this.displayLineDiscounts.equals(other.getDisplayLineDiscounts())) && (this.code == null && other.getCode() == null || this.code != null && this.code.equals(other.getCode())) && (this.codePattern == null && other.getCodePattern() == null || this.codePattern != null && this.codePattern.equals(other.getCodePattern())) && (this.numberToGenerate == null && other.getNumberToGenerate() == null || this.numberToGenerate != null && this.numberToGenerate.equals(other.getNumberToGenerate())) && (this.description == null && other.getDescription() == null || this.description != null && this.description.equals(other.getDescription())) && (this.locationList == null && other.getLocationList() == null || this.locationList != null && this.locationList.equals(other.getLocationList())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && this.isInactive.equals(other.getIsInactive())) && (this.discount == null && other.getDiscount() == null || this.discount != null && this.discount.equals(other.getDiscount())) && (this.rate == null && other.getRate() == null || this.rate != null && this.rate.equals(other.getRate())) && (this.discountType == null && other.getDiscountType() == null || this.discountType != null && this.discountType.equals(other.getDiscountType())) && (this.applyDiscountTo == null && other.getApplyDiscountTo() == null || this.applyDiscountTo != null && this.applyDiscountTo.equals(other.getApplyDiscountTo())) && (this.freeShipMethod == null && other.getFreeShipMethod() == null || this.freeShipMethod != null && this.freeShipMethod.equals(other.getFreeShipMethod())) && (this.minimumOrderAmount == null && other.getMinimumOrderAmount() == null || this.minimumOrderAmount != null && this.minimumOrderAmount.equals(other.getMinimumOrderAmount())) && (this.startDate == null && other.getStartDate() == null || this.startDate != null && this.startDate.equals(other.getStartDate())) && (this.endDate == null && other.getEndDate() == null || this.endDate != null && this.endDate.equals(other.getEndDate())) && (this.isPublic == null && other.getIsPublic() == null || this.isPublic != null && this.isPublic.equals(other.getIsPublic())) && (this.currencyList == null && other.getCurrencyList() == null || this.currencyList != null && this.currencyList.equals(other.getCurrencyList())) && (this.excludeItems == null && other.getExcludeItems() == null || this.excludeItems != null && this.excludeItems.equals(other.getExcludeItems())) && (this.name == null && other.getName() == null || this.name != null && this.name.equals(other.getName())) && (this.itemsList == null && other.getItemsList() == null || this.itemsList != null && this.itemsList.equals(other.getItemsList())) && (this.partnersList == null && other.getPartnersList() == null || this.partnersList != null && this.partnersList.equals(other.getPartnersList())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
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
        if (this.getImplementation() != null) {
            _hashCode += this.getImplementation().hashCode();
        }
        if (this.getCustomForm() != null) {
            _hashCode += this.getCustomForm().hashCode();
        }
        if (this.getUseType() != null) {
            _hashCode += this.getUseType().hashCode();
        }
        if (this.getDisplayLineDiscounts() != null) {
            _hashCode += this.getDisplayLineDiscounts().hashCode();
        }
        if (this.getCode() != null) {
            _hashCode += this.getCode().hashCode();
        }
        if (this.getCodePattern() != null) {
            _hashCode += this.getCodePattern().hashCode();
        }
        if (this.getNumberToGenerate() != null) {
            _hashCode += this.getNumberToGenerate().hashCode();
        }
        if (this.getDescription() != null) {
            _hashCode += this.getDescription().hashCode();
        }
        if (this.getLocationList() != null) {
            _hashCode += this.getLocationList().hashCode();
        }
        if (this.getIsInactive() != null) {
            _hashCode += this.getIsInactive().hashCode();
        }
        if (this.getDiscount() != null) {
            _hashCode += this.getDiscount().hashCode();
        }
        if (this.getRate() != null) {
            _hashCode += this.getRate().hashCode();
        }
        if (this.getDiscountType() != null) {
            _hashCode += this.getDiscountType().hashCode();
        }
        if (this.getApplyDiscountTo() != null) {
            _hashCode += this.getApplyDiscountTo().hashCode();
        }
        if (this.getFreeShipMethod() != null) {
            _hashCode += this.getFreeShipMethod().hashCode();
        }
        if (this.getMinimumOrderAmount() != null) {
            _hashCode += this.getMinimumOrderAmount().hashCode();
        }
        if (this.getStartDate() != null) {
            _hashCode += this.getStartDate().hashCode();
        }
        if (this.getEndDate() != null) {
            _hashCode += this.getEndDate().hashCode();
        }
        if (this.getIsPublic() != null) {
            _hashCode += this.getIsPublic().hashCode();
        }
        if (this.getCurrencyList() != null) {
            _hashCode += this.getCurrencyList().hashCode();
        }
        if (this.getExcludeItems() != null) {
            _hashCode += this.getExcludeItems().hashCode();
        }
        if (this.getName() != null) {
            _hashCode += this.getName().hashCode();
        }
        if (this.getItemsList() != null) {
            _hashCode += this.getItemsList().hashCode();
        }
        if (this.getPartnersList() != null) {
            _hashCode += this.getPartnersList().hashCode();
        }
        if (this.getCustomFieldList() != null) {
            _hashCode += this.getCustomFieldList().hashCode();
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
        typeDesc.setXmlType(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "PromotionCode"));
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
        elemField.setFieldName("implementation");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "implementation"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customForm");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("useType");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "useType"));
        elemField.setXmlType(new QName("urn:types.marketing_2022_1.lists.webservices.netsuite.com", "PromotionCodeUseType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("displayLineDiscounts");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "displayLineDiscounts"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("code");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "code"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("codePattern");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "codePattern"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("numberToGenerate");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "numberToGenerate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "description"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationList");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "locationList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRefList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("discount");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "discount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("rate");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "rate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("discountType");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "discountType"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("applyDiscountTo");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "applyDiscountTo"));
        elemField.setXmlType(new QName("urn:types.marketing_2022_1.lists.webservices.netsuite.com", "PromotionCodeApplyDiscountTo"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("freeShipMethod");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "freeShipMethod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("minimumOrderAmount");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "minimumOrderAmount"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "endDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isPublic");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "isPublic"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("currencyList");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "currencyList"));
        elemField.setXmlType(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "PromotionCodeCurrencyList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("excludeItems");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "excludeItems"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "name"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemsList");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "itemsList"));
        elemField.setXmlType(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "PromotionCodeItemsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("partnersList");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "partnersList"));
        elemField.setXmlType(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "PromotionCodePartnersList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "CustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

