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

import com.netsuite.suitetalk.proxy.v2022_1.platform.common.AccountSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.AddressSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.CustomSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.EmployeeSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.SubsidiarySearchRowBasic;
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

public class SubsidiarySearchRow
extends SearchRow
implements Serializable {
    private SubsidiarySearchRowBasic basic;
    private AddressSearchRowBasic addressJoin;
    private AccountSearchRowBasic defaultAdvanceToApplyAccountJoin;
    private AddressSearchRowBasic returnAddressJoin;
    private AddressSearchRowBasic shippingAddressJoin;
    private EmployeeSearchRowBasic userJoin;
    private CustomSearchRowBasic[] customSearchJoin;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(SubsidiarySearchRow.class, true);

    public SubsidiarySearchRow() {
    }

    public SubsidiarySearchRow(SubsidiarySearchRowBasic basic, AddressSearchRowBasic addressJoin, AccountSearchRowBasic defaultAdvanceToApplyAccountJoin, AddressSearchRowBasic returnAddressJoin, AddressSearchRowBasic shippingAddressJoin, EmployeeSearchRowBasic userJoin, CustomSearchRowBasic[] customSearchJoin) {
        this.basic = basic;
        this.addressJoin = addressJoin;
        this.defaultAdvanceToApplyAccountJoin = defaultAdvanceToApplyAccountJoin;
        this.returnAddressJoin = returnAddressJoin;
        this.shippingAddressJoin = shippingAddressJoin;
        this.userJoin = userJoin;
        this.customSearchJoin = customSearchJoin;
    }

    public SubsidiarySearchRowBasic getBasic() {
        return this.basic;
    }

    public void setBasic(SubsidiarySearchRowBasic basic) {
        this.basic = basic;
    }

    public AddressSearchRowBasic getAddressJoin() {
        return this.addressJoin;
    }

    public void setAddressJoin(AddressSearchRowBasic addressJoin) {
        this.addressJoin = addressJoin;
    }

    public AccountSearchRowBasic getDefaultAdvanceToApplyAccountJoin() {
        return this.defaultAdvanceToApplyAccountJoin;
    }

    public void setDefaultAdvanceToApplyAccountJoin(AccountSearchRowBasic defaultAdvanceToApplyAccountJoin) {
        this.defaultAdvanceToApplyAccountJoin = defaultAdvanceToApplyAccountJoin;
    }

    public AddressSearchRowBasic getReturnAddressJoin() {
        return this.returnAddressJoin;
    }

    public void setReturnAddressJoin(AddressSearchRowBasic returnAddressJoin) {
        this.returnAddressJoin = returnAddressJoin;
    }

    public AddressSearchRowBasic getShippingAddressJoin() {
        return this.shippingAddressJoin;
    }

    public void setShippingAddressJoin(AddressSearchRowBasic shippingAddressJoin) {
        this.shippingAddressJoin = shippingAddressJoin;
    }

    public EmployeeSearchRowBasic getUserJoin() {
        return this.userJoin;
    }

    public void setUserJoin(EmployeeSearchRowBasic userJoin) {
        this.userJoin = userJoin;
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
        if (!(obj instanceof SubsidiarySearchRow)) {
            return false;
        }
        SubsidiarySearchRow other = (SubsidiarySearchRow)obj;
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
        boolean _equals = super.equals(obj) && (this.basic == null && other.getBasic() == null || this.basic != null && this.basic.equals(other.getBasic())) && (this.addressJoin == null && other.getAddressJoin() == null || this.addressJoin != null && this.addressJoin.equals(other.getAddressJoin())) && (this.defaultAdvanceToApplyAccountJoin == null && other.getDefaultAdvanceToApplyAccountJoin() == null || this.defaultAdvanceToApplyAccountJoin != null && this.defaultAdvanceToApplyAccountJoin.equals(other.getDefaultAdvanceToApplyAccountJoin())) && (this.returnAddressJoin == null && other.getReturnAddressJoin() == null || this.returnAddressJoin != null && this.returnAddressJoin.equals(other.getReturnAddressJoin())) && (this.shippingAddressJoin == null && other.getShippingAddressJoin() == null || this.shippingAddressJoin != null && this.shippingAddressJoin.equals(other.getShippingAddressJoin())) && (this.userJoin == null && other.getUserJoin() == null || this.userJoin != null && this.userJoin.equals(other.getUserJoin())) && (this.customSearchJoin == null && other.getCustomSearchJoin() == null || this.customSearchJoin != null && Arrays.equals(this.customSearchJoin, other.getCustomSearchJoin()));
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
        if (this.getAddressJoin() != null) {
            _hashCode += this.getAddressJoin().hashCode();
        }
        if (this.getDefaultAdvanceToApplyAccountJoin() != null) {
            _hashCode += this.getDefaultAdvanceToApplyAccountJoin().hashCode();
        }
        if (this.getReturnAddressJoin() != null) {
            _hashCode += this.getReturnAddressJoin().hashCode();
        }
        if (this.getShippingAddressJoin() != null) {
            _hashCode += this.getShippingAddressJoin().hashCode();
        }
        if (this.getUserJoin() != null) {
            _hashCode += this.getUserJoin().hashCode();
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
        typeDesc.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "SubsidiarySearchRow"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "SubsidiarySearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("addressJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "addressJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "AddressSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("defaultAdvanceToApplyAccountJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "defaultAdvanceToApplyAccountJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "AccountSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("returnAddressJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "returnAddressJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "AddressSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shippingAddressJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "shippingAddressJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "AddressSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("userJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "userJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "EmployeeSearchRowBasic"));
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

