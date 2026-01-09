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

public class BomRevisionComponentSearchBasic
extends SearchRecordBasic
implements Serializable {
    private SearchDoubleField bomQuantity;
    private SearchMultiSelectField bomRevision;
    private SearchDoubleField componentYield;
    private SearchStringField description;
    private SearchMultiSelectField internalId;
    private SearchLongField internalIdNumber;
    private SearchMultiSelectField item;
    private SearchEnumMultiSelectField itemSource;
    private SearchStringField itemSubtype;
    private SearchMultiSelectField itemType;
    private SearchLongField lineId;
    private SearchDoubleField quantity;
    private SearchStringField units;
    private SearchDoubleField weight;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(BomRevisionComponentSearchBasic.class, true);

    public BomRevisionComponentSearchBasic() {
    }

    public BomRevisionComponentSearchBasic(SearchDoubleField bomQuantity, SearchMultiSelectField bomRevision, SearchDoubleField componentYield, SearchStringField description, SearchMultiSelectField internalId, SearchLongField internalIdNumber, SearchMultiSelectField item, SearchEnumMultiSelectField itemSource, SearchStringField itemSubtype, SearchMultiSelectField itemType, SearchLongField lineId, SearchDoubleField quantity, SearchStringField units, SearchDoubleField weight) {
        this.bomQuantity = bomQuantity;
        this.bomRevision = bomRevision;
        this.componentYield = componentYield;
        this.description = description;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.item = item;
        this.itemSource = itemSource;
        this.itemSubtype = itemSubtype;
        this.itemType = itemType;
        this.lineId = lineId;
        this.quantity = quantity;
        this.units = units;
        this.weight = weight;
    }

    public SearchDoubleField getBomQuantity() {
        return this.bomQuantity;
    }

    public void setBomQuantity(SearchDoubleField bomQuantity) {
        this.bomQuantity = bomQuantity;
    }

    public SearchMultiSelectField getBomRevision() {
        return this.bomRevision;
    }

    public void setBomRevision(SearchMultiSelectField bomRevision) {
        this.bomRevision = bomRevision;
    }

    public SearchDoubleField getComponentYield() {
        return this.componentYield;
    }

    public void setComponentYield(SearchDoubleField componentYield) {
        this.componentYield = componentYield;
    }

    public SearchStringField getDescription() {
        return this.description;
    }

    public void setDescription(SearchStringField description) {
        this.description = description;
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

    public SearchMultiSelectField getItem() {
        return this.item;
    }

    public void setItem(SearchMultiSelectField item) {
        this.item = item;
    }

    public SearchEnumMultiSelectField getItemSource() {
        return this.itemSource;
    }

    public void setItemSource(SearchEnumMultiSelectField itemSource) {
        this.itemSource = itemSource;
    }

    public SearchStringField getItemSubtype() {
        return this.itemSubtype;
    }

    public void setItemSubtype(SearchStringField itemSubtype) {
        this.itemSubtype = itemSubtype;
    }

    public SearchMultiSelectField getItemType() {
        return this.itemType;
    }

    public void setItemType(SearchMultiSelectField itemType) {
        this.itemType = itemType;
    }

    public SearchLongField getLineId() {
        return this.lineId;
    }

    public void setLineId(SearchLongField lineId) {
        this.lineId = lineId;
    }

    public SearchDoubleField getQuantity() {
        return this.quantity;
    }

    public void setQuantity(SearchDoubleField quantity) {
        this.quantity = quantity;
    }

    public SearchStringField getUnits() {
        return this.units;
    }

    public void setUnits(SearchStringField units) {
        this.units = units;
    }

    public SearchDoubleField getWeight() {
        return this.weight;
    }

    public void setWeight(SearchDoubleField weight) {
        this.weight = weight;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof BomRevisionComponentSearchBasic)) {
            return false;
        }
        BomRevisionComponentSearchBasic other = (BomRevisionComponentSearchBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.bomQuantity == null && other.getBomQuantity() == null || this.bomQuantity != null && this.bomQuantity.equals(other.getBomQuantity())) && (this.bomRevision == null && other.getBomRevision() == null || this.bomRevision != null && this.bomRevision.equals(other.getBomRevision())) && (this.componentYield == null && other.getComponentYield() == null || this.componentYield != null && this.componentYield.equals(other.getComponentYield())) && (this.description == null && other.getDescription() == null || this.description != null && this.description.equals(other.getDescription())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.internalIdNumber == null && other.getInternalIdNumber() == null || this.internalIdNumber != null && this.internalIdNumber.equals(other.getInternalIdNumber())) && (this.item == null && other.getItem() == null || this.item != null && this.item.equals(other.getItem())) && (this.itemSource == null && other.getItemSource() == null || this.itemSource != null && this.itemSource.equals(other.getItemSource())) && (this.itemSubtype == null && other.getItemSubtype() == null || this.itemSubtype != null && this.itemSubtype.equals(other.getItemSubtype())) && (this.itemType == null && other.getItemType() == null || this.itemType != null && this.itemType.equals(other.getItemType())) && (this.lineId == null && other.getLineId() == null || this.lineId != null && this.lineId.equals(other.getLineId())) && (this.quantity == null && other.getQuantity() == null || this.quantity != null && this.quantity.equals(other.getQuantity())) && (this.units == null && other.getUnits() == null || this.units != null && this.units.equals(other.getUnits())) && (this.weight == null && other.getWeight() == null || this.weight != null && this.weight.equals(other.getWeight()));
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
        if (this.getBomQuantity() != null) {
            _hashCode += this.getBomQuantity().hashCode();
        }
        if (this.getBomRevision() != null) {
            _hashCode += this.getBomRevision().hashCode();
        }
        if (this.getComponentYield() != null) {
            _hashCode += this.getComponentYield().hashCode();
        }
        if (this.getDescription() != null) {
            _hashCode += this.getDescription().hashCode();
        }
        if (this.getInternalId() != null) {
            _hashCode += this.getInternalId().hashCode();
        }
        if (this.getInternalIdNumber() != null) {
            _hashCode += this.getInternalIdNumber().hashCode();
        }
        if (this.getItem() != null) {
            _hashCode += this.getItem().hashCode();
        }
        if (this.getItemSource() != null) {
            _hashCode += this.getItemSource().hashCode();
        }
        if (this.getItemSubtype() != null) {
            _hashCode += this.getItemSubtype().hashCode();
        }
        if (this.getItemType() != null) {
            _hashCode += this.getItemType().hashCode();
        }
        if (this.getLineId() != null) {
            _hashCode += this.getLineId().hashCode();
        }
        if (this.getQuantity() != null) {
            _hashCode += this.getQuantity().hashCode();
        }
        if (this.getUnits() != null) {
            _hashCode += this.getUnits().hashCode();
        }
        if (this.getWeight() != null) {
            _hashCode += this.getWeight().hashCode();
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "BomRevisionComponentSearchBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("bomQuantity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "bomQuantity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("bomRevision");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "bomRevision"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("componentYield");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "componentYield"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "description"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
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
        elemField.setFieldName("item");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemSource");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "itemSource"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemSubtype");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "itemSubtype"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "itemType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lineId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lineId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "quantity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("units");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "units"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("weight");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "weight"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

