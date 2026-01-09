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

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnCustomFieldList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnDoubleField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnEnumSelectField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnLongField;
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

public class BomRevisionComponentSearchRowBasic
extends SearchRowBasic
implements Serializable {
    private SearchColumnDoubleField[] bomQuantity;
    private SearchColumnSelectField[] bomRevision;
    private SearchColumnDoubleField[] componentYield;
    private SearchColumnStringField[] description;
    private SearchColumnSelectField[] internalId;
    private SearchColumnSelectField[] item;
    private SearchColumnEnumSelectField[] itemSource;
    private SearchColumnStringField[] itemSubtype;
    private SearchColumnSelectField[] itemType;
    private SearchColumnLongField[] lineId;
    private SearchColumnDoubleField[] quantity;
    private SearchColumnStringField[] units;
    private SearchColumnDoubleField[] weight;
    private SearchColumnCustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(BomRevisionComponentSearchRowBasic.class, true);

    public BomRevisionComponentSearchRowBasic() {
    }

    public BomRevisionComponentSearchRowBasic(SearchColumnDoubleField[] bomQuantity, SearchColumnSelectField[] bomRevision, SearchColumnDoubleField[] componentYield, SearchColumnStringField[] description, SearchColumnSelectField[] internalId, SearchColumnSelectField[] item, SearchColumnEnumSelectField[] itemSource, SearchColumnStringField[] itemSubtype, SearchColumnSelectField[] itemType, SearchColumnLongField[] lineId, SearchColumnDoubleField[] quantity, SearchColumnStringField[] units, SearchColumnDoubleField[] weight, SearchColumnCustomFieldList customFieldList) {
        this.bomQuantity = bomQuantity;
        this.bomRevision = bomRevision;
        this.componentYield = componentYield;
        this.description = description;
        this.internalId = internalId;
        this.item = item;
        this.itemSource = itemSource;
        this.itemSubtype = itemSubtype;
        this.itemType = itemType;
        this.lineId = lineId;
        this.quantity = quantity;
        this.units = units;
        this.weight = weight;
        this.customFieldList = customFieldList;
    }

    public SearchColumnDoubleField[] getBomQuantity() {
        return this.bomQuantity;
    }

    public void setBomQuantity(SearchColumnDoubleField[] bomQuantity) {
        this.bomQuantity = bomQuantity;
    }

    public SearchColumnDoubleField getBomQuantity(int i) {
        return this.bomQuantity[i];
    }

    public void setBomQuantity(int i, SearchColumnDoubleField _value) {
        this.bomQuantity[i] = _value;
    }

    public SearchColumnSelectField[] getBomRevision() {
        return this.bomRevision;
    }

    public void setBomRevision(SearchColumnSelectField[] bomRevision) {
        this.bomRevision = bomRevision;
    }

    public SearchColumnSelectField getBomRevision(int i) {
        return this.bomRevision[i];
    }

    public void setBomRevision(int i, SearchColumnSelectField _value) {
        this.bomRevision[i] = _value;
    }

    public SearchColumnDoubleField[] getComponentYield() {
        return this.componentYield;
    }

    public void setComponentYield(SearchColumnDoubleField[] componentYield) {
        this.componentYield = componentYield;
    }

    public SearchColumnDoubleField getComponentYield(int i) {
        return this.componentYield[i];
    }

    public void setComponentYield(int i, SearchColumnDoubleField _value) {
        this.componentYield[i] = _value;
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

    public SearchColumnEnumSelectField[] getItemSource() {
        return this.itemSource;
    }

    public void setItemSource(SearchColumnEnumSelectField[] itemSource) {
        this.itemSource = itemSource;
    }

    public SearchColumnEnumSelectField getItemSource(int i) {
        return this.itemSource[i];
    }

    public void setItemSource(int i, SearchColumnEnumSelectField _value) {
        this.itemSource[i] = _value;
    }

    public SearchColumnStringField[] getItemSubtype() {
        return this.itemSubtype;
    }

    public void setItemSubtype(SearchColumnStringField[] itemSubtype) {
        this.itemSubtype = itemSubtype;
    }

    public SearchColumnStringField getItemSubtype(int i) {
        return this.itemSubtype[i];
    }

    public void setItemSubtype(int i, SearchColumnStringField _value) {
        this.itemSubtype[i] = _value;
    }

    public SearchColumnSelectField[] getItemType() {
        return this.itemType;
    }

    public void setItemType(SearchColumnSelectField[] itemType) {
        this.itemType = itemType;
    }

    public SearchColumnSelectField getItemType(int i) {
        return this.itemType[i];
    }

    public void setItemType(int i, SearchColumnSelectField _value) {
        this.itemType[i] = _value;
    }

    public SearchColumnLongField[] getLineId() {
        return this.lineId;
    }

    public void setLineId(SearchColumnLongField[] lineId) {
        this.lineId = lineId;
    }

    public SearchColumnLongField getLineId(int i) {
        return this.lineId[i];
    }

    public void setLineId(int i, SearchColumnLongField _value) {
        this.lineId[i] = _value;
    }

    public SearchColumnDoubleField[] getQuantity() {
        return this.quantity;
    }

    public void setQuantity(SearchColumnDoubleField[] quantity) {
        this.quantity = quantity;
    }

    public SearchColumnDoubleField getQuantity(int i) {
        return this.quantity[i];
    }

    public void setQuantity(int i, SearchColumnDoubleField _value) {
        this.quantity[i] = _value;
    }

    public SearchColumnStringField[] getUnits() {
        return this.units;
    }

    public void setUnits(SearchColumnStringField[] units) {
        this.units = units;
    }

    public SearchColumnStringField getUnits(int i) {
        return this.units[i];
    }

    public void setUnits(int i, SearchColumnStringField _value) {
        this.units[i] = _value;
    }

    public SearchColumnDoubleField[] getWeight() {
        return this.weight;
    }

    public void setWeight(SearchColumnDoubleField[] weight) {
        this.weight = weight;
    }

    public SearchColumnDoubleField getWeight(int i) {
        return this.weight[i];
    }

    public void setWeight(int i, SearchColumnDoubleField _value) {
        this.weight[i] = _value;
    }

    public SearchColumnCustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof BomRevisionComponentSearchRowBasic)) {
            return false;
        }
        BomRevisionComponentSearchRowBasic other = (BomRevisionComponentSearchRowBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.bomQuantity == null && other.getBomQuantity() == null || this.bomQuantity != null && Arrays.equals(this.bomQuantity, other.getBomQuantity())) && (this.bomRevision == null && other.getBomRevision() == null || this.bomRevision != null && Arrays.equals(this.bomRevision, other.getBomRevision())) && (this.componentYield == null && other.getComponentYield() == null || this.componentYield != null && Arrays.equals(this.componentYield, other.getComponentYield())) && (this.description == null && other.getDescription() == null || this.description != null && Arrays.equals(this.description, other.getDescription())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && Arrays.equals(this.internalId, other.getInternalId())) && (this.item == null && other.getItem() == null || this.item != null && Arrays.equals(this.item, other.getItem())) && (this.itemSource == null && other.getItemSource() == null || this.itemSource != null && Arrays.equals(this.itemSource, other.getItemSource())) && (this.itemSubtype == null && other.getItemSubtype() == null || this.itemSubtype != null && Arrays.equals(this.itemSubtype, other.getItemSubtype())) && (this.itemType == null && other.getItemType() == null || this.itemType != null && Arrays.equals(this.itemType, other.getItemType())) && (this.lineId == null && other.getLineId() == null || this.lineId != null && Arrays.equals(this.lineId, other.getLineId())) && (this.quantity == null && other.getQuantity() == null || this.quantity != null && Arrays.equals(this.quantity, other.getQuantity())) && (this.units == null && other.getUnits() == null || this.units != null && Arrays.equals(this.units, other.getUnits())) && (this.weight == null && other.getWeight() == null || this.weight != null && Arrays.equals(this.weight, other.getWeight())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
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
        if (this.getBomQuantity() != null) {
            for (i = 0; i < Array.getLength(this.getBomQuantity()); ++i) {
                obj = Array.get(this.getBomQuantity(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBomRevision() != null) {
            for (i = 0; i < Array.getLength(this.getBomRevision()); ++i) {
                obj = Array.get(this.getBomRevision(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getComponentYield() != null) {
            for (i = 0; i < Array.getLength(this.getComponentYield()); ++i) {
                obj = Array.get(this.getComponentYield(), i);
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
        if (this.getItemSource() != null) {
            for (i = 0; i < Array.getLength(this.getItemSource()); ++i) {
                obj = Array.get(this.getItemSource(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getItemSubtype() != null) {
            for (i = 0; i < Array.getLength(this.getItemSubtype()); ++i) {
                obj = Array.get(this.getItemSubtype(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getItemType() != null) {
            for (i = 0; i < Array.getLength(this.getItemType()); ++i) {
                obj = Array.get(this.getItemType(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLineId() != null) {
            for (i = 0; i < Array.getLength(this.getLineId()); ++i) {
                obj = Array.get(this.getLineId(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getQuantity() != null) {
            for (i = 0; i < Array.getLength(this.getQuantity()); ++i) {
                obj = Array.get(this.getQuantity(), i);
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
        if (this.getWeight() != null) {
            for (i = 0; i < Array.getLength(this.getWeight()); ++i) {
                obj = Array.get(this.getWeight(), i);
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "BomRevisionComponentSearchRowBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("bomQuantity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "bomQuantity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("bomRevision");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "bomRevision"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("componentYield");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "componentYield"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
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
        elemField.setFieldName("itemSource");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "itemSource"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemSubtype");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "itemSubtype"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "itemType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lineId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lineId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "quantity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("units");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "units"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("weight");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "weight"));
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

