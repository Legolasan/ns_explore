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

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.CustomFieldList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.NullField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.Record;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.purchases.InboundShipmentItemsList;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.purchases.InboundShipmentLandedCostList;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.purchases.types.InboundShipmentShipmentStatus;
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

public class InboundShipment
extends Record
implements Serializable {
    private RecordRef customForm;
    private String shipmentNumber;
    private String externalDocumentNumber;
    private InboundShipmentShipmentStatus shipmentStatus;
    private Calendar expectedShippingDate;
    private Calendar actualShippingDate;
    private Calendar expectedDeliveryDate;
    private Calendar actualDeliveryDate;
    private String shipmentMemo;
    private String vesselNumber;
    private String billOfLading;
    private InboundShipmentLandedCostList landedCostList;
    private InboundShipmentItemsList itemsList;
    private RecordRef shipmentBaseCurrency;
    private CustomFieldList customFieldList;
    private String internalId;
    private String externalId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(InboundShipment.class, true);

    public InboundShipment() {
    }

    public InboundShipment(NullField nullFieldList, String internalId, String externalId, RecordRef customForm, String shipmentNumber, String externalDocumentNumber, InboundShipmentShipmentStatus shipmentStatus, Calendar expectedShippingDate, Calendar actualShippingDate, Calendar expectedDeliveryDate, Calendar actualDeliveryDate, String shipmentMemo, String vesselNumber, String billOfLading, InboundShipmentLandedCostList landedCostList, InboundShipmentItemsList itemsList, RecordRef shipmentBaseCurrency, CustomFieldList customFieldList) {
        super(nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.customForm = customForm;
        this.shipmentNumber = shipmentNumber;
        this.externalDocumentNumber = externalDocumentNumber;
        this.shipmentStatus = shipmentStatus;
        this.expectedShippingDate = expectedShippingDate;
        this.actualShippingDate = actualShippingDate;
        this.expectedDeliveryDate = expectedDeliveryDate;
        this.actualDeliveryDate = actualDeliveryDate;
        this.shipmentMemo = shipmentMemo;
        this.vesselNumber = vesselNumber;
        this.billOfLading = billOfLading;
        this.landedCostList = landedCostList;
        this.itemsList = itemsList;
        this.shipmentBaseCurrency = shipmentBaseCurrency;
        this.customFieldList = customFieldList;
    }

    public RecordRef getCustomForm() {
        return this.customForm;
    }

    public void setCustomForm(RecordRef customForm) {
        this.customForm = customForm;
    }

    public String getShipmentNumber() {
        return this.shipmentNumber;
    }

    public void setShipmentNumber(String shipmentNumber) {
        this.shipmentNumber = shipmentNumber;
    }

    public String getExternalDocumentNumber() {
        return this.externalDocumentNumber;
    }

    public void setExternalDocumentNumber(String externalDocumentNumber) {
        this.externalDocumentNumber = externalDocumentNumber;
    }

    public InboundShipmentShipmentStatus getShipmentStatus() {
        return this.shipmentStatus;
    }

    public void setShipmentStatus(InboundShipmentShipmentStatus shipmentStatus) {
        this.shipmentStatus = shipmentStatus;
    }

    public Calendar getExpectedShippingDate() {
        return this.expectedShippingDate;
    }

    public void setExpectedShippingDate(Calendar expectedShippingDate) {
        this.expectedShippingDate = expectedShippingDate;
    }

    public Calendar getActualShippingDate() {
        return this.actualShippingDate;
    }

    public void setActualShippingDate(Calendar actualShippingDate) {
        this.actualShippingDate = actualShippingDate;
    }

    public Calendar getExpectedDeliveryDate() {
        return this.expectedDeliveryDate;
    }

    public void setExpectedDeliveryDate(Calendar expectedDeliveryDate) {
        this.expectedDeliveryDate = expectedDeliveryDate;
    }

    public Calendar getActualDeliveryDate() {
        return this.actualDeliveryDate;
    }

    public void setActualDeliveryDate(Calendar actualDeliveryDate) {
        this.actualDeliveryDate = actualDeliveryDate;
    }

    public String getShipmentMemo() {
        return this.shipmentMemo;
    }

    public void setShipmentMemo(String shipmentMemo) {
        this.shipmentMemo = shipmentMemo;
    }

    public String getVesselNumber() {
        return this.vesselNumber;
    }

    public void setVesselNumber(String vesselNumber) {
        this.vesselNumber = vesselNumber;
    }

    public String getBillOfLading() {
        return this.billOfLading;
    }

    public void setBillOfLading(String billOfLading) {
        this.billOfLading = billOfLading;
    }

    public InboundShipmentLandedCostList getLandedCostList() {
        return this.landedCostList;
    }

    public void setLandedCostList(InboundShipmentLandedCostList landedCostList) {
        this.landedCostList = landedCostList;
    }

    public InboundShipmentItemsList getItemsList() {
        return this.itemsList;
    }

    public void setItemsList(InboundShipmentItemsList itemsList) {
        this.itemsList = itemsList;
    }

    public RecordRef getShipmentBaseCurrency() {
        return this.shipmentBaseCurrency;
    }

    public void setShipmentBaseCurrency(RecordRef shipmentBaseCurrency) {
        this.shipmentBaseCurrency = shipmentBaseCurrency;
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
        if (!(obj instanceof InboundShipment)) {
            return false;
        }
        InboundShipment other = (InboundShipment)obj;
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
        boolean _equals = super.equals(obj) && (this.customForm == null && other.getCustomForm() == null || this.customForm != null && this.customForm.equals(other.getCustomForm())) && (this.shipmentNumber == null && other.getShipmentNumber() == null || this.shipmentNumber != null && this.shipmentNumber.equals(other.getShipmentNumber())) && (this.externalDocumentNumber == null && other.getExternalDocumentNumber() == null || this.externalDocumentNumber != null && this.externalDocumentNumber.equals(other.getExternalDocumentNumber())) && (this.shipmentStatus == null && other.getShipmentStatus() == null || this.shipmentStatus != null && this.shipmentStatus.equals(other.getShipmentStatus())) && (this.expectedShippingDate == null && other.getExpectedShippingDate() == null || this.expectedShippingDate != null && this.expectedShippingDate.equals(other.getExpectedShippingDate())) && (this.actualShippingDate == null && other.getActualShippingDate() == null || this.actualShippingDate != null && this.actualShippingDate.equals(other.getActualShippingDate())) && (this.expectedDeliveryDate == null && other.getExpectedDeliveryDate() == null || this.expectedDeliveryDate != null && this.expectedDeliveryDate.equals(other.getExpectedDeliveryDate())) && (this.actualDeliveryDate == null && other.getActualDeliveryDate() == null || this.actualDeliveryDate != null && this.actualDeliveryDate.equals(other.getActualDeliveryDate())) && (this.shipmentMemo == null && other.getShipmentMemo() == null || this.shipmentMemo != null && this.shipmentMemo.equals(other.getShipmentMemo())) && (this.vesselNumber == null && other.getVesselNumber() == null || this.vesselNumber != null && this.vesselNumber.equals(other.getVesselNumber())) && (this.billOfLading == null && other.getBillOfLading() == null || this.billOfLading != null && this.billOfLading.equals(other.getBillOfLading())) && (this.landedCostList == null && other.getLandedCostList() == null || this.landedCostList != null && this.landedCostList.equals(other.getLandedCostList())) && (this.itemsList == null && other.getItemsList() == null || this.itemsList != null && this.itemsList.equals(other.getItemsList())) && (this.shipmentBaseCurrency == null && other.getShipmentBaseCurrency() == null || this.shipmentBaseCurrency != null && this.shipmentBaseCurrency.equals(other.getShipmentBaseCurrency())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
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
        if (this.getShipmentNumber() != null) {
            _hashCode += this.getShipmentNumber().hashCode();
        }
        if (this.getExternalDocumentNumber() != null) {
            _hashCode += this.getExternalDocumentNumber().hashCode();
        }
        if (this.getShipmentStatus() != null) {
            _hashCode += this.getShipmentStatus().hashCode();
        }
        if (this.getExpectedShippingDate() != null) {
            _hashCode += this.getExpectedShippingDate().hashCode();
        }
        if (this.getActualShippingDate() != null) {
            _hashCode += this.getActualShippingDate().hashCode();
        }
        if (this.getExpectedDeliveryDate() != null) {
            _hashCode += this.getExpectedDeliveryDate().hashCode();
        }
        if (this.getActualDeliveryDate() != null) {
            _hashCode += this.getActualDeliveryDate().hashCode();
        }
        if (this.getShipmentMemo() != null) {
            _hashCode += this.getShipmentMemo().hashCode();
        }
        if (this.getVesselNumber() != null) {
            _hashCode += this.getVesselNumber().hashCode();
        }
        if (this.getBillOfLading() != null) {
            _hashCode += this.getBillOfLading().hashCode();
        }
        if (this.getLandedCostList() != null) {
            _hashCode += this.getLandedCostList().hashCode();
        }
        if (this.getItemsList() != null) {
            _hashCode += this.getItemsList().hashCode();
        }
        if (this.getShipmentBaseCurrency() != null) {
            _hashCode += this.getShipmentBaseCurrency().hashCode();
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
        typeDesc.setXmlType(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "InboundShipment"));
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
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipmentNumber");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "shipmentNumber"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("externalDocumentNumber");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "externalDocumentNumber"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipmentStatus");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "shipmentStatus"));
        elemField.setXmlType(new QName("urn:types.purchases_2022_1.transactions.webservices.netsuite.com", "InboundShipmentShipmentStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("expectedShippingDate");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "expectedShippingDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("actualShippingDate");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "actualShippingDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("expectedDeliveryDate");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "expectedDeliveryDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("actualDeliveryDate");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "actualDeliveryDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipmentMemo");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "shipmentMemo"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vesselNumber");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "vesselNumber"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billOfLading");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "billOfLading"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("landedCostList");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "landedCostList"));
        elemField.setXmlType(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "InboundShipmentLandedCostList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemsList");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "itemsList"));
        elemField.setXmlType(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "InboundShipmentItemsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shipmentBaseCurrency");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "shipmentBaseCurrency"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
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

