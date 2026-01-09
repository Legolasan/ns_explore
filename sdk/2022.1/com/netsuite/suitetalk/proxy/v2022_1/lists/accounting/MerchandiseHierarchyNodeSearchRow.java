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
package com.netsuite.suitetalk.proxy.v2022_1.lists.accounting;

import com.netsuite.suitetalk.proxy.v2022_1.platform.common.MerchandiseHierarchyNodeSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchRow;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class MerchandiseHierarchyNodeSearchRow
extends SearchRow
implements Serializable {
    private MerchandiseHierarchyNodeSearchRowBasic basic;
    private MerchandiseHierarchyNodeSearchRowBasic parentNodeJoin;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(MerchandiseHierarchyNodeSearchRow.class, true);

    public MerchandiseHierarchyNodeSearchRow() {
    }

    public MerchandiseHierarchyNodeSearchRow(MerchandiseHierarchyNodeSearchRowBasic basic, MerchandiseHierarchyNodeSearchRowBasic parentNodeJoin) {
        this.basic = basic;
        this.parentNodeJoin = parentNodeJoin;
    }

    public MerchandiseHierarchyNodeSearchRowBasic getBasic() {
        return this.basic;
    }

    public void setBasic(MerchandiseHierarchyNodeSearchRowBasic basic) {
        this.basic = basic;
    }

    public MerchandiseHierarchyNodeSearchRowBasic getParentNodeJoin() {
        return this.parentNodeJoin;
    }

    public void setParentNodeJoin(MerchandiseHierarchyNodeSearchRowBasic parentNodeJoin) {
        this.parentNodeJoin = parentNodeJoin;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof MerchandiseHierarchyNodeSearchRow)) {
            return false;
        }
        MerchandiseHierarchyNodeSearchRow other = (MerchandiseHierarchyNodeSearchRow)obj;
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
        boolean _equals = super.equals(obj) && (this.basic == null && other.getBasic() == null || this.basic != null && this.basic.equals(other.getBasic())) && (this.parentNodeJoin == null && other.getParentNodeJoin() == null || this.parentNodeJoin != null && this.parentNodeJoin.equals(other.getParentNodeJoin()));
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
        if (this.getBasic() != null) {
            _hashCode += this.getBasic().hashCode();
        }
        if (this.getParentNodeJoin() != null) {
            _hashCode += this.getParentNodeJoin().hashCode();
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
        typeDesc.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "MerchandiseHierarchyNodeSearchRow"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "MerchandiseHierarchyNodeSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("parentNodeJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "parentNodeJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "MerchandiseHierarchyNodeSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

