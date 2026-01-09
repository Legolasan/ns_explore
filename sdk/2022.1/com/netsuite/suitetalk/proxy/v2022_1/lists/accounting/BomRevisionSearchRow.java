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

import com.netsuite.suitetalk.proxy.v2022_1.platform.common.BomRevisionComponentSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.BomRevisionSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.BomSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.CustomSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.TransactionSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchRow;
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

public class BomRevisionSearchRow
extends SearchRow
implements Serializable {
    private BomRevisionSearchRowBasic basic;
    private BomSearchRowBasic billOfMaterialsJoin;
    private BomRevisionComponentSearchRowBasic componentJoin;
    private TransactionSearchRowBasic transactionJoin;
    private CustomSearchRowBasic[] customSearchJoin;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(BomRevisionSearchRow.class, true);

    public BomRevisionSearchRow() {
    }

    public BomRevisionSearchRow(BomRevisionSearchRowBasic basic, BomSearchRowBasic billOfMaterialsJoin, BomRevisionComponentSearchRowBasic componentJoin, TransactionSearchRowBasic transactionJoin, CustomSearchRowBasic[] customSearchJoin) {
        this.basic = basic;
        this.billOfMaterialsJoin = billOfMaterialsJoin;
        this.componentJoin = componentJoin;
        this.transactionJoin = transactionJoin;
        this.customSearchJoin = customSearchJoin;
    }

    public BomRevisionSearchRowBasic getBasic() {
        return this.basic;
    }

    public void setBasic(BomRevisionSearchRowBasic basic) {
        this.basic = basic;
    }

    public BomSearchRowBasic getBillOfMaterialsJoin() {
        return this.billOfMaterialsJoin;
    }

    public void setBillOfMaterialsJoin(BomSearchRowBasic billOfMaterialsJoin) {
        this.billOfMaterialsJoin = billOfMaterialsJoin;
    }

    public BomRevisionComponentSearchRowBasic getComponentJoin() {
        return this.componentJoin;
    }

    public void setComponentJoin(BomRevisionComponentSearchRowBasic componentJoin) {
        this.componentJoin = componentJoin;
    }

    public TransactionSearchRowBasic getTransactionJoin() {
        return this.transactionJoin;
    }

    public void setTransactionJoin(TransactionSearchRowBasic transactionJoin) {
        this.transactionJoin = transactionJoin;
    }

    public CustomSearchRowBasic[] getCustomSearchJoin() {
        return this.customSearchJoin;
    }

    public void setCustomSearchJoin(CustomSearchRowBasic[] customSearchJoin) {
        this.customSearchJoin = customSearchJoin;
    }

    public CustomSearchRowBasic getCustomSearchJoin(int i) {
        return this.customSearchJoin[i];
    }

    public void setCustomSearchJoin(int i, CustomSearchRowBasic _value) {
        this.customSearchJoin[i] = _value;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof BomRevisionSearchRow)) {
            return false;
        }
        BomRevisionSearchRow other = (BomRevisionSearchRow)obj;
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
        boolean _equals = super.equals(obj) && (this.basic == null && other.getBasic() == null || this.basic != null && this.basic.equals(other.getBasic())) && (this.billOfMaterialsJoin == null && other.getBillOfMaterialsJoin() == null || this.billOfMaterialsJoin != null && this.billOfMaterialsJoin.equals(other.getBillOfMaterialsJoin())) && (this.componentJoin == null && other.getComponentJoin() == null || this.componentJoin != null && this.componentJoin.equals(other.getComponentJoin())) && (this.transactionJoin == null && other.getTransactionJoin() == null || this.transactionJoin != null && this.transactionJoin.equals(other.getTransactionJoin())) && (this.customSearchJoin == null && other.getCustomSearchJoin() == null || this.customSearchJoin != null && Arrays.equals(this.customSearchJoin, other.getCustomSearchJoin()));
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
        if (this.getBillOfMaterialsJoin() != null) {
            _hashCode += this.getBillOfMaterialsJoin().hashCode();
        }
        if (this.getComponentJoin() != null) {
            _hashCode += this.getComponentJoin().hashCode();
        }
        if (this.getTransactionJoin() != null) {
            _hashCode += this.getTransactionJoin().hashCode();
        }
        if (this.getCustomSearchJoin() != null) {
            for (int i = 0; i < Array.getLength(this.getCustomSearchJoin()); ++i) {
                Object obj = Array.get(this.getCustomSearchJoin(), i);
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
        typeDesc.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "BomRevisionSearchRow"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "BomRevisionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billOfMaterialsJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "billOfMaterialsJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "BomSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("componentJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "componentJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "BomRevisionComponentSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("transactionJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "transactionJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customSearchJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "customSearchJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "CustomSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

