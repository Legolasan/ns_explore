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

import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.NonInventoryPurchaseItemHierarchyVersions;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import javax.xml.namespace.QName;
import org.apache.axis.description.AttributeDesc;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class NonInventoryPurchaseItemHierarchyVersionsList
implements Serializable {
    private NonInventoryPurchaseItemHierarchyVersions[] nonInventoryPurchaseItemHierarchyVersions;
    private boolean replaceAll;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(NonInventoryPurchaseItemHierarchyVersionsList.class, true);

    public NonInventoryPurchaseItemHierarchyVersionsList() {
    }

    public NonInventoryPurchaseItemHierarchyVersionsList(NonInventoryPurchaseItemHierarchyVersions[] nonInventoryPurchaseItemHierarchyVersions, boolean replaceAll) {
        this.nonInventoryPurchaseItemHierarchyVersions = nonInventoryPurchaseItemHierarchyVersions;
        this.replaceAll = replaceAll;
    }

    public NonInventoryPurchaseItemHierarchyVersions[] getNonInventoryPurchaseItemHierarchyVersions() {
        return this.nonInventoryPurchaseItemHierarchyVersions;
    }

    public void setNonInventoryPurchaseItemHierarchyVersions(NonInventoryPurchaseItemHierarchyVersions[] nonInventoryPurchaseItemHierarchyVersions) {
        this.nonInventoryPurchaseItemHierarchyVersions = nonInventoryPurchaseItemHierarchyVersions;
    }

    public NonInventoryPurchaseItemHierarchyVersions getNonInventoryPurchaseItemHierarchyVersions(int i) {
        return this.nonInventoryPurchaseItemHierarchyVersions[i];
    }

    public void setNonInventoryPurchaseItemHierarchyVersions(int i, NonInventoryPurchaseItemHierarchyVersions _value) {
        this.nonInventoryPurchaseItemHierarchyVersions[i] = _value;
    }

    public boolean isReplaceAll() {
        return this.replaceAll;
    }

    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof NonInventoryPurchaseItemHierarchyVersionsList)) {
            return false;
        }
        NonInventoryPurchaseItemHierarchyVersionsList other = (NonInventoryPurchaseItemHierarchyVersionsList)obj;
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
        boolean _equals = (this.nonInventoryPurchaseItemHierarchyVersions == null && other.getNonInventoryPurchaseItemHierarchyVersions() == null || this.nonInventoryPurchaseItemHierarchyVersions != null && Arrays.equals(this.nonInventoryPurchaseItemHierarchyVersions, other.getNonInventoryPurchaseItemHierarchyVersions())) && this.replaceAll == other.isReplaceAll();
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getNonInventoryPurchaseItemHierarchyVersions() != null) {
            for (int i = 0; i < Array.getLength(this.getNonInventoryPurchaseItemHierarchyVersions()); ++i) {
                Object obj = Array.get(this.getNonInventoryPurchaseItemHierarchyVersions(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        Boolean bl = this.isReplaceAll() ? Boolean.TRUE : Boolean.FALSE;
        this.__hashCodeCalc = false;
        return _hashCode += bl.hashCode();
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
        typeDesc.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "NonInventoryPurchaseItemHierarchyVersionsList"));
        AttributeDesc attrField = new AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new QName("", "replaceAll"));
        attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc((FieldDesc)attrField);
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("nonInventoryPurchaseItemHierarchyVersions");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "nonInventoryPurchaseItemHierarchyVersions"));
        elemField.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "NonInventoryPurchaseItemHierarchyVersions"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

