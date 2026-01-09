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

public class InventoryNumberBinSearchRowBasic
extends SearchRowBasic
implements Serializable {
    private SearchColumnSelectField[] binNumber;
    private SearchColumnSelectField[] inventoryNumber;
    private SearchColumnSelectField[] location;
    private SearchColumnDoubleField[] quantityAvailable;
    private SearchColumnDoubleField[] quantityOnHand;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(InventoryNumberBinSearchRowBasic.class, true);

    public InventoryNumberBinSearchRowBasic() {
    }

    public InventoryNumberBinSearchRowBasic(SearchColumnSelectField[] binNumber, SearchColumnSelectField[] inventoryNumber, SearchColumnSelectField[] location, SearchColumnDoubleField[] quantityAvailable, SearchColumnDoubleField[] quantityOnHand) {
        this.binNumber = binNumber;
        this.inventoryNumber = inventoryNumber;
        this.location = location;
        this.quantityAvailable = quantityAvailable;
        this.quantityOnHand = quantityOnHand;
    }

    public SearchColumnSelectField[] getBinNumber() {
        return this.binNumber;
    }

    public void setBinNumber(SearchColumnSelectField[] binNumber) {
        this.binNumber = binNumber;
    }

    public SearchColumnSelectField getBinNumber(int i) {
        return this.binNumber[i];
    }

    public void setBinNumber(int i, SearchColumnSelectField _value) {
        this.binNumber[i] = _value;
    }

    public SearchColumnSelectField[] getInventoryNumber() {
        return this.inventoryNumber;
    }

    public void setInventoryNumber(SearchColumnSelectField[] inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }

    public SearchColumnSelectField getInventoryNumber(int i) {
        return this.inventoryNumber[i];
    }

    public void setInventoryNumber(int i, SearchColumnSelectField _value) {
        this.inventoryNumber[i] = _value;
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

    public SearchColumnDoubleField[] getQuantityAvailable() {
        return this.quantityAvailable;
    }

    public void setQuantityAvailable(SearchColumnDoubleField[] quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

    public SearchColumnDoubleField getQuantityAvailable(int i) {
        return this.quantityAvailable[i];
    }

    public void setQuantityAvailable(int i, SearchColumnDoubleField _value) {
        this.quantityAvailable[i] = _value;
    }

    public SearchColumnDoubleField[] getQuantityOnHand() {
        return this.quantityOnHand;
    }

    public void setQuantityOnHand(SearchColumnDoubleField[] quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }

    public SearchColumnDoubleField getQuantityOnHand(int i) {
        return this.quantityOnHand[i];
    }

    public void setQuantityOnHand(int i, SearchColumnDoubleField _value) {
        this.quantityOnHand[i] = _value;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof InventoryNumberBinSearchRowBasic)) {
            return false;
        }
        InventoryNumberBinSearchRowBasic other = (InventoryNumberBinSearchRowBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.binNumber == null && other.getBinNumber() == null || this.binNumber != null && Arrays.equals(this.binNumber, other.getBinNumber())) && (this.inventoryNumber == null && other.getInventoryNumber() == null || this.inventoryNumber != null && Arrays.equals(this.inventoryNumber, other.getInventoryNumber())) && (this.location == null && other.getLocation() == null || this.location != null && Arrays.equals(this.location, other.getLocation())) && (this.quantityAvailable == null && other.getQuantityAvailable() == null || this.quantityAvailable != null && Arrays.equals(this.quantityAvailable, other.getQuantityAvailable())) && (this.quantityOnHand == null && other.getQuantityOnHand() == null || this.quantityOnHand != null && Arrays.equals(this.quantityOnHand, other.getQuantityOnHand()));
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
        if (this.getBinNumber() != null) {
            for (i = 0; i < Array.getLength(this.getBinNumber()); ++i) {
                obj = Array.get(this.getBinNumber(), i);
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
        if (this.getLocation() != null) {
            for (i = 0; i < Array.getLength(this.getLocation()); ++i) {
                obj = Array.get(this.getLocation(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getQuantityAvailable() != null) {
            for (i = 0; i < Array.getLength(this.getQuantityAvailable()); ++i) {
                obj = Array.get(this.getQuantityAvailable(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getQuantityOnHand() != null) {
            for (i = 0; i < Array.getLength(this.getQuantityOnHand()); ++i) {
                obj = Array.get(this.getQuantityOnHand(), i);
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "InventoryNumberBinSearchRowBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("binNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "binNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("inventoryNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "inventoryNumber"));
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
        elemField.setFieldName("quantityAvailable");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "quantityAvailable"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityOnHand");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "quantityOnHand"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

