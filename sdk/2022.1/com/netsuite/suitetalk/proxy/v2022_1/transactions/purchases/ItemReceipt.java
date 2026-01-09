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
package com.netsuite.suitetalk.proxy.v2022_1.transactions.purchases;

import com.netsuite.suitetalk.proxy.v2022_1.platform.common.AccountingBookDetailList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.PurchLandedCostList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.types.LandedCostMethod;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.CustomFieldList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.NullField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.Record;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.purchases.ItemReceiptExpenseList;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.purchases.ItemReceiptItemList;
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

public class ItemReceipt
extends Record
implements Serializable {
    private Calendar createdDate;
    private Calendar lastModifiedDate;
    private RecordRef customForm;
    private Double exchangeRate;
    private RecordRef entity;
    private String currencyName;
    private RecordRef subsidiary;
    private RecordRef createdFrom;
    private Calendar tranDate;
    private RecordRef partner;
    private RecordRef postingPeriod;
    private String tranId;
    private RecordRef inboundShipment;
    private String memo;
    private RecordRef itemFulfillment;
    private RecordRef currency;
    private LandedCostMethod landedCostMethod;
    private Boolean landedCostPerLine;
    private ItemReceiptItemList itemList;
    private ItemReceiptExpenseList expenseList;
    private PurchLandedCostList landedCostsList;
    private AccountingBookDetailList accountingBookDetailList;
    private CustomFieldList customFieldList;
    private String internalId;
    private String externalId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(ItemReceipt.class, true);

    public ItemReceipt() {
    }

    public ItemReceipt(NullField nullFieldList, String internalId, String externalId, Calendar createdDate, Calendar lastModifiedDate, RecordRef customForm, Double exchangeRate, RecordRef entity, String currencyName, RecordRef subsidiary, RecordRef createdFrom, Calendar tranDate, RecordRef partner, RecordRef postingPeriod, String tranId, RecordRef inboundShipment, String memo, RecordRef itemFulfillment, RecordRef currency, LandedCostMethod landedCostMethod, Boolean landedCostPerLine, ItemReceiptItemList itemList, ItemReceiptExpenseList expenseList, PurchLandedCostList landedCostsList, AccountingBookDetailList accountingBookDetailList, CustomFieldList customFieldList) {
        super(nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.customForm = customForm;
        this.exchangeRate = exchangeRate;
        this.entity = entity;
        this.currencyName = currencyName;
        this.subsidiary = subsidiary;
        this.createdFrom = createdFrom;
        this.tranDate = tranDate;
        this.partner = partner;
        this.postingPeriod = postingPeriod;
        this.tranId = tranId;
        this.inboundShipment = inboundShipment;
        this.memo = memo;
        this.itemFulfillment = itemFulfillment;
        this.currency = currency;
        this.landedCostMethod = landedCostMethod;
        this.landedCostPerLine = landedCostPerLine;
        this.itemList = itemList;
        this.expenseList = expenseList;
        this.landedCostsList = landedCostsList;
        this.accountingBookDetailList = accountingBookDetailList;
        this.customFieldList = customFieldList;
    }

    public Calendar getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(Calendar createdDate) {
        this.createdDate = createdDate;
    }

    public Calendar getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    public void setLastModifiedDate(Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public RecordRef getCustomForm() {
        return this.customForm;
    }

    public void setCustomForm(RecordRef customForm) {
        this.customForm = customForm;
    }

    public Double getExchangeRate() {
        return this.exchangeRate;
    }

    public void setExchangeRate(Double exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public RecordRef getEntity() {
        return this.entity;
    }

    public void setEntity(RecordRef entity) {
        this.entity = entity;
    }

    public String getCurrencyName() {
        return this.currencyName;
    }

    public void setCurrencyName(String currencyName) {
        this.currencyName = currencyName;
    }

    public RecordRef getSubsidiary() {
        return this.subsidiary;
    }

    public void setSubsidiary(RecordRef subsidiary) {
        this.subsidiary = subsidiary;
    }

    public RecordRef getCreatedFrom() {
        return this.createdFrom;
    }

    public void setCreatedFrom(RecordRef createdFrom) {
        this.createdFrom = createdFrom;
    }

    public Calendar getTranDate() {
        return this.tranDate;
    }

    public void setTranDate(Calendar tranDate) {
        this.tranDate = tranDate;
    }

    public RecordRef getPartner() {
        return this.partner;
    }

    public void setPartner(RecordRef partner) {
        this.partner = partner;
    }

    public RecordRef getPostingPeriod() {
        return this.postingPeriod;
    }

    public void setPostingPeriod(RecordRef postingPeriod) {
        this.postingPeriod = postingPeriod;
    }

    public String getTranId() {
        return this.tranId;
    }

    public void setTranId(String tranId) {
        this.tranId = tranId;
    }

    public RecordRef getInboundShipment() {
        return this.inboundShipment;
    }

    public void setInboundShipment(RecordRef inboundShipment) {
        this.inboundShipment = inboundShipment;
    }

    public String getMemo() {
        return this.memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public RecordRef getItemFulfillment() {
        return this.itemFulfillment;
    }

    public void setItemFulfillment(RecordRef itemFulfillment) {
        this.itemFulfillment = itemFulfillment;
    }

    public RecordRef getCurrency() {
        return this.currency;
    }

    public void setCurrency(RecordRef currency) {
        this.currency = currency;
    }

    public LandedCostMethod getLandedCostMethod() {
        return this.landedCostMethod;
    }

    public void setLandedCostMethod(LandedCostMethod landedCostMethod) {
        this.landedCostMethod = landedCostMethod;
    }

    public Boolean getLandedCostPerLine() {
        return this.landedCostPerLine;
    }

    public void setLandedCostPerLine(Boolean landedCostPerLine) {
        this.landedCostPerLine = landedCostPerLine;
    }

    public ItemReceiptItemList getItemList() {
        return this.itemList;
    }

    public void setItemList(ItemReceiptItemList itemList) {
        this.itemList = itemList;
    }

    public ItemReceiptExpenseList getExpenseList() {
        return this.expenseList;
    }

    public void setExpenseList(ItemReceiptExpenseList expenseList) {
        this.expenseList = expenseList;
    }

    public PurchLandedCostList getLandedCostsList() {
        return this.landedCostsList;
    }

    public void setLandedCostsList(PurchLandedCostList landedCostsList) {
        this.landedCostsList = landedCostsList;
    }

    public AccountingBookDetailList getAccountingBookDetailList() {
        return this.accountingBookDetailList;
    }

    public void setAccountingBookDetailList(AccountingBookDetailList accountingBookDetailList) {
        this.accountingBookDetailList = accountingBookDetailList;
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
        if (!(obj instanceof ItemReceipt)) {
            return false;
        }
        ItemReceipt other = (ItemReceipt)obj;
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
        boolean _equals = super.equals(obj) && (this.createdDate == null && other.getCreatedDate() == null || this.createdDate != null && this.createdDate.equals(other.getCreatedDate())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && this.lastModifiedDate.equals(other.getLastModifiedDate())) && (this.customForm == null && other.getCustomForm() == null || this.customForm != null && this.customForm.equals(other.getCustomForm())) && (this.exchangeRate == null && other.getExchangeRate() == null || this.exchangeRate != null && this.exchangeRate.equals(other.getExchangeRate())) && (this.entity == null && other.getEntity() == null || this.entity != null && this.entity.equals(other.getEntity())) && (this.currencyName == null && other.getCurrencyName() == null || this.currencyName != null && this.currencyName.equals(other.getCurrencyName())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && this.subsidiary.equals(other.getSubsidiary())) && (this.createdFrom == null && other.getCreatedFrom() == null || this.createdFrom != null && this.createdFrom.equals(other.getCreatedFrom())) && (this.tranDate == null && other.getTranDate() == null || this.tranDate != null && this.tranDate.equals(other.getTranDate())) && (this.partner == null && other.getPartner() == null || this.partner != null && this.partner.equals(other.getPartner())) && (this.postingPeriod == null && other.getPostingPeriod() == null || this.postingPeriod != null && this.postingPeriod.equals(other.getPostingPeriod())) && (this.tranId == null && other.getTranId() == null || this.tranId != null && this.tranId.equals(other.getTranId())) && (this.inboundShipment == null && other.getInboundShipment() == null || this.inboundShipment != null && this.inboundShipment.equals(other.getInboundShipment())) && (this.memo == null && other.getMemo() == null || this.memo != null && this.memo.equals(other.getMemo())) && (this.itemFulfillment == null && other.getItemFulfillment() == null || this.itemFulfillment != null && this.itemFulfillment.equals(other.getItemFulfillment())) && (this.currency == null && other.getCurrency() == null || this.currency != null && this.currency.equals(other.getCurrency())) && (this.landedCostMethod == null && other.getLandedCostMethod() == null || this.landedCostMethod != null && this.landedCostMethod.equals(other.getLandedCostMethod())) && (this.landedCostPerLine == null && other.getLandedCostPerLine() == null || this.landedCostPerLine != null && this.landedCostPerLine.equals(other.getLandedCostPerLine())) && (this.itemList == null && other.getItemList() == null || this.itemList != null && this.itemList.equals(other.getItemList())) && (this.expenseList == null && other.getExpenseList() == null || this.expenseList != null && this.expenseList.equals(other.getExpenseList())) && (this.landedCostsList == null && other.getLandedCostsList() == null || this.landedCostsList != null && this.landedCostsList.equals(other.getLandedCostsList())) && (this.accountingBookDetailList == null && other.getAccountingBookDetailList() == null || this.accountingBookDetailList != null && this.accountingBookDetailList.equals(other.getAccountingBookDetailList())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
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
        if (this.getCreatedDate() != null) {
            _hashCode += this.getCreatedDate().hashCode();
        }
        if (this.getLastModifiedDate() != null) {
            _hashCode += this.getLastModifiedDate().hashCode();
        }
        if (this.getCustomForm() != null) {
            _hashCode += this.getCustomForm().hashCode();
        }
        if (this.getExchangeRate() != null) {
            _hashCode += this.getExchangeRate().hashCode();
        }
        if (this.getEntity() != null) {
            _hashCode += this.getEntity().hashCode();
        }
        if (this.getCurrencyName() != null) {
            _hashCode += this.getCurrencyName().hashCode();
        }
        if (this.getSubsidiary() != null) {
            _hashCode += this.getSubsidiary().hashCode();
        }
        if (this.getCreatedFrom() != null) {
            _hashCode += this.getCreatedFrom().hashCode();
        }
        if (this.getTranDate() != null) {
            _hashCode += this.getTranDate().hashCode();
        }
        if (this.getPartner() != null) {
            _hashCode += this.getPartner().hashCode();
        }
        if (this.getPostingPeriod() != null) {
            _hashCode += this.getPostingPeriod().hashCode();
        }
        if (this.getTranId() != null) {
            _hashCode += this.getTranId().hashCode();
        }
        if (this.getInboundShipment() != null) {
            _hashCode += this.getInboundShipment().hashCode();
        }
        if (this.getMemo() != null) {
            _hashCode += this.getMemo().hashCode();
        }
        if (this.getItemFulfillment() != null) {
            _hashCode += this.getItemFulfillment().hashCode();
        }
        if (this.getCurrency() != null) {
            _hashCode += this.getCurrency().hashCode();
        }
        if (this.getLandedCostMethod() != null) {
            _hashCode += this.getLandedCostMethod().hashCode();
        }
        if (this.getLandedCostPerLine() != null) {
            _hashCode += this.getLandedCostPerLine().hashCode();
        }
        if (this.getItemList() != null) {
            _hashCode += this.getItemList().hashCode();
        }
        if (this.getExpenseList() != null) {
            _hashCode += this.getExpenseList().hashCode();
        }
        if (this.getLandedCostsList() != null) {
            _hashCode += this.getLandedCostsList().hashCode();
        }
        if (this.getAccountingBookDetailList() != null) {
            _hashCode += this.getAccountingBookDetailList().hashCode();
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
        typeDesc.setXmlType(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "ItemReceipt"));
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
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customForm");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("exchangeRate");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "exchangeRate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("entity");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "entity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("currencyName");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "currencyName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("createdFrom");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "createdFrom"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("tranDate");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "tranDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("partner");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "partner"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("postingPeriod");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "postingPeriod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("tranId");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "tranId"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("inboundShipment");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "inboundShipment"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemFulfillment");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "itemFulfillment"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("landedCostMethod");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "landedCostMethod"));
        elemField.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "LandedCostMethod"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("landedCostPerLine");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "landedCostPerLine"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemList");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "itemList"));
        elemField.setXmlType(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "ItemReceiptItemList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("expenseList");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "expenseList"));
        elemField.setXmlType(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "ItemReceiptExpenseList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("landedCostsList");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "landedCostsList"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "PurchLandedCostList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("accountingBookDetailList");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "accountingBookDetailList"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "AccountingBookDetailList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "CustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

