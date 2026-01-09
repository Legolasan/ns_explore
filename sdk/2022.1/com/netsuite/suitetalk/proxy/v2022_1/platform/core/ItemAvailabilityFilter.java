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
package com.netsuite.suitetalk.proxy.v2022_1.platform.core;

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRefList;
import java.io.Serializable;
import java.util.Calendar;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class ItemAvailabilityFilter
implements Serializable {
    private RecordRefList item;
    private Calendar lastQtyAvailableChange;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(ItemAvailabilityFilter.class, true);

    public ItemAvailabilityFilter() {
    }

    public ItemAvailabilityFilter(RecordRefList item, Calendar lastQtyAvailableChange) {
        this.item = item;
        this.lastQtyAvailableChange = lastQtyAvailableChange;
    }

    public RecordRefList getItem() {
        return this.item;
    }

    public void setItem(RecordRefList item) {
        this.item = item;
    }

    public Calendar getLastQtyAvailableChange() {
        return this.lastQtyAvailableChange;
    }

    public void setLastQtyAvailableChange(Calendar lastQtyAvailableChange) {
        this.lastQtyAvailableChange = lastQtyAvailableChange;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ItemAvailabilityFilter)) {
            return false;
        }
        ItemAvailabilityFilter other = (ItemAvailabilityFilter)obj;
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
        boolean _equals = (this.item == null && other.getItem() == null || this.item != null && this.item.equals(other.getItem())) && (this.lastQtyAvailableChange == null && other.getLastQtyAvailableChange() == null || this.lastQtyAvailableChange != null && this.lastQtyAvailableChange.equals(other.getLastQtyAvailableChange()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getItem() != null) {
            _hashCode += this.getItem().hashCode();
        }
        if (this.getLastQtyAvailableChange() != null) {
            _hashCode += this.getLastQtyAvailableChange().hashCode();
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
        typeDesc.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "ItemAvailabilityFilter"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "item"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRefList"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastQtyAvailableChange");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "lastQtyAvailableChange"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

