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
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnDateField;
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

public class InventoryNumberSearchRowBasic
extends SearchRowBasic
implements Serializable {
    private SearchColumnDateField[] expirationDate;
    private SearchColumnSelectField[] externalId;
    private SearchColumnSelectField[] internalId;
    private SearchColumnStringField[] inventoryNumber;
    private SearchColumnBooleanField[] isonhand;
    private SearchColumnSelectField[] item;
    private SearchColumnSelectField[] location;
    private SearchColumnStringField[] memo;
    private SearchColumnDoubleField[] quantityavailable;
    private SearchColumnDoubleField[] quantityintransit;
    private SearchColumnDoubleField[] quantityonhand;
    private SearchColumnDoubleField[] quantityonorder;
    private SearchColumnCustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(InventoryNumberSearchRowBasic.class, true);

    public InventoryNumberSearchRowBasic() {
    }

    public InventoryNumberSearchRowBasic(SearchColumnDateField[] expirationDate, SearchColumnSelectField[] externalId, SearchColumnSelectField[] internalId, SearchColumnStringField[] inventoryNumber, SearchColumnBooleanField[] isonhand, SearchColumnSelectField[] item, SearchColumnSelectField[] location, SearchColumnStringField[] memo, SearchColumnDoubleField[] quantityavailable, SearchColumnDoubleField[] quantityintransit, SearchColumnDoubleField[] quantityonhand, SearchColumnDoubleField[] quantityonorder, SearchColumnCustomFieldList customFieldList) {
        this.expirationDate = expirationDate;
        this.externalId = externalId;
        this.internalId = internalId;
        this.inventoryNumber = inventoryNumber;
        this.isonhand = isonhand;
        this.item = item;
        this.location = location;
        this.memo = memo;
        this.quantityavailable = quantityavailable;
        this.quantityintransit = quantityintransit;
        this.quantityonhand = quantityonhand;
        this.quantityonorder = quantityonorder;
        this.customFieldList = customFieldList;
    }

    public SearchColumnDateField[] getExpirationDate() {
        return this.expirationDate;
    }

    public void setExpirationDate(SearchColumnDateField[] expirationDate) {
        this.expirationDate = expirationDate;
    }

    public SearchColumnDateField getExpirationDate(int i) {
        return this.expirationDate[i];
    }

    public void setExpirationDate(int i, SearchColumnDateField _value) {
        this.expirationDate[i] = _value;
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

    public SearchColumnStringField[] getInventoryNumber() {
        return this.inventoryNumber;
    }

    public void setInventoryNumber(SearchColumnStringField[] inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }

    public SearchColumnStringField getInventoryNumber(int i) {
        return this.inventoryNumber[i];
    }

    public void setInventoryNumber(int i, SearchColumnStringField _value) {
        this.inventoryNumber[i] = _value;
    }

    public SearchColumnBooleanField[] getIsonhand() {
        return this.isonhand;
    }

    public void setIsonhand(SearchColumnBooleanField[] isonhand) {
        this.isonhand = isonhand;
    }

    public SearchColumnBooleanField getIsonhand(int i) {
        return this.isonhand[i];
    }

    public void setIsonhand(int i, SearchColumnBooleanField _value) {
        this.isonhand[i] = _value;
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

    public SearchColumnSelectField[] getLocation() {
        return this.location;
    }

    public void setLocation(SearchColumnSelectField[] location) {
        this.location = location;
    }

    public SearchColumnSelectField getLocation(int i) {
        return this.location[i];
    }

    public void setLocation(int i, SearchColumnSelectField _value) {
        this.location[i] = _value;
    }

    public SearchColumnStringField[] getMemo() {
        return this.memo;
    }

    public void setMemo(SearchColumnStringField[] memo) {
        this.memo = memo;
    }

    public SearchColumnStringField getMemo(int i) {
        return this.memo[i];
    }

    public void setMemo(int i, SearchColumnStringField _value) {
        this.memo[i] = _value;
    }

    public SearchColumnDoubleField[] getQuantityavailable() {
        return this.quantityavailable;
    }

    public void setQuantityavailable(SearchColumnDoubleField[] quantityavailable) {
        this.quantityavailable = quantityavailable;
    }

    public SearchColumnDoubleField getQuantityavailable(int i) {
        return this.quantityavailable[i];
    }

    public void setQuantityavailable(int i, SearchColumnDoubleField _value) {
        this.quantityavailable[i] = _value;
    }

    public SearchColumnDoubleField[] getQuantityintransit() {
        return this.quantityintransit;
    }

    public void setQuantityintransit(SearchColumnDoubleField[] quantityintransit) {
        this.quantityintransit = quantityintransit;
    }

    public SearchColumnDoubleField getQuantityintransit(int i) {
        return this.quantityintransit[i];
    }

    public void setQuantityintransit(int i, SearchColumnDoubleField _value) {
        this.quantityintransit[i] = _value;
    }

    public SearchColumnDoubleField[] getQuantityonhand() {
        return this.quantityonhand;
    }

    public void setQuantityonhand(SearchColumnDoubleField[] quantityonhand) {
        this.quantityonhand = quantityonhand;
    }

    public SearchColumnDoubleField getQuantityonhand(int i) {
        return this.quantityonhand[i];
    }

    public void setQuantityonhand(int i, SearchColumnDoubleField _value) {
        this.quantityonhand[i] = _value;
    }

    public SearchColumnDoubleField[] getQuantityonorder() {
        return this.quantityonorder;
    }

    public void setQuantityonorder(SearchColumnDoubleField[] quantityonorder) {
        this.quantityonorder = quantityonorder;
    }

    public SearchColumnDoubleField getQuantityonorder(int i) {
        return this.quantityonorder[i];
    }

    public void setQuantityonorder(int i, SearchColumnDoubleField _value) {
        this.quantityonorder[i] = _value;
    }

    public SearchColumnCustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof InventoryNumberSearchRowBasic)) {
            return false;
        }
        InventoryNumberSearchRowBasic other = (InventoryNumberSearchRowBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.expirationDate == null && other.getExpirationDate() == null || this.expirationDate != null && Arrays.equals(this.expirationDate, other.getExpirationDate())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && Arrays.equals(this.externalId, other.getExternalId())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && Arrays.equals(this.internalId, other.getInternalId())) && (this.inventoryNumber == null && other.getInventoryNumber() == null || this.inventoryNumber != null && Arrays.equals(this.inventoryNumber, other.getInventoryNumber())) && (this.isonhand == null && other.getIsonhand() == null || this.isonhand != null && Arrays.equals(this.isonhand, other.getIsonhand())) && (this.item == null && other.getItem() == null || this.item != null && Arrays.equals(this.item, other.getItem())) && (this.location == null && other.getLocation() == null || this.location != null && Arrays.equals(this.location, other.getLocation())) && (this.memo == null && other.getMemo() == null || this.memo != null && Arrays.equals(this.memo, other.getMemo())) && (this.quantityavailable == null && other.getQuantityavailable() == null || this.quantityavailable != null && Arrays.equals(this.quantityavailable, other.getQuantityavailable())) && (this.quantityintransit == null && other.getQuantityintransit() == null || this.quantityintransit != null && Arrays.equals(this.quantityintransit, other.getQuantityintransit())) && (this.quantityonhand == null && other.getQuantityonhand() == null || this.quantityonhand != null && Arrays.equals(this.quantityonhand, other.getQuantityonhand())) && (this.quantityonorder == null && other.getQuantityonorder() == null || this.quantityonorder != null && Arrays.equals(this.quantityonorder, other.getQuantityonorder())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
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
        if (this.getExpirationDate() != null) {
            for (i = 0; i < Array.getLength(this.getExpirationDate()); ++i) {
                obj = Array.get(this.getExpirationDate(), i);
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
        if (this.getInventoryNumber() != null) {
            for (i = 0; i < Array.getLength(this.getInventoryNumber()); ++i) {
                obj = Array.get(this.getInventoryNumber(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getIsonhand() != null) {
            for (i = 0; i < Array.getLength(this.getIsonhand()); ++i) {
                obj = Array.get(this.getIsonhand(), i);
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
        if (this.getLocation() != null) {
            for (i = 0; i < Array.getLength(this.getLocation()); ++i) {
                obj = Array.get(this.getLocation(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getMemo() != null) {
            for (i = 0; i < Array.getLength(this.getMemo()); ++i) {
                obj = Array.get(this.getMemo(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getQuantityavailable() != null) {
            for (i = 0; i < Array.getLength(this.getQuantityavailable()); ++i) {
                obj = Array.get(this.getQuantityavailable(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getQuantityintransit() != null) {
            for (i = 0; i < Array.getLength(this.getQuantityintransit()); ++i) {
                obj = Array.get(this.getQuantityintransit(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getQuantityonhand() != null) {
            for (i = 0; i < Array.getLength(this.getQuantityonhand()); ++i) {
                obj = Array.get(this.getQuantityonhand(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getQuantityonorder() != null) {
            for (i = 0; i < Array.getLength(this.getQuantityonorder()); ++i) {
                obj = Array.get(this.getQuantityonorder(), i);
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "InventoryNumberSearchRowBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("expirationDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "expirationDate"));
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
        elemField.setFieldName("internalId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("inventoryNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "inventoryNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isonhand");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "isonhand"));
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
        elemField.setFieldName("location");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "location"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityavailable");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "quantityavailable"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityintransit");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "quantityintransit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityonhand");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "quantityonhand"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityonorder");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "quantityonorder"));
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

