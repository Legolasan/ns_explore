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
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.ClassificationSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.CustomSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.DepartmentSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.ItemAccountMappingSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.LocationSearchRowBasic;
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

public class ItemAccountMappingSearchRow
extends SearchRow
implements Serializable {
    private ItemAccountMappingSearchRowBasic basic;
    private ClassificationSearchRowBasic classJoin;
    private DepartmentSearchRowBasic departmentJoin;
    private AccountSearchRowBasic destinationAccountJoin;
    private LocationSearchRowBasic locationJoin;
    private AccountSearchRowBasic sourceAccountJoin;
    private SubsidiarySearchRowBasic subsidiaryJoin;
    private CustomSearchRowBasic[] customSearchJoin;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(ItemAccountMappingSearchRow.class, true);

    public ItemAccountMappingSearchRow() {
    }

    public ItemAccountMappingSearchRow(ItemAccountMappingSearchRowBasic basic, ClassificationSearchRowBasic classJoin, DepartmentSearchRowBasic departmentJoin, AccountSearchRowBasic destinationAccountJoin, LocationSearchRowBasic locationJoin, AccountSearchRowBasic sourceAccountJoin, SubsidiarySearchRowBasic subsidiaryJoin, CustomSearchRowBasic[] customSearchJoin) {
        this.basic = basic;
        this.classJoin = classJoin;
        this.departmentJoin = departmentJoin;
        this.destinationAccountJoin = destinationAccountJoin;
        this.locationJoin = locationJoin;
        this.sourceAccountJoin = sourceAccountJoin;
        this.subsidiaryJoin = subsidiaryJoin;
        this.customSearchJoin = customSearchJoin;
    }

    public ItemAccountMappingSearchRowBasic getBasic() {
        return this.basic;
    }

    public void setBasic(ItemAccountMappingSearchRowBasic basic) {
        this.basic = basic;
    }

    public ClassificationSearchRowBasic getClassJoin() {
        return this.classJoin;
    }

    public void setClassJoin(ClassificationSearchRowBasic classJoin) {
        this.classJoin = classJoin;
    }

    public DepartmentSearchRowBasic getDepartmentJoin() {
        return this.departmentJoin;
    }

    public void setDepartmentJoin(DepartmentSearchRowBasic departmentJoin) {
        this.departmentJoin = departmentJoin;
    }

    public AccountSearchRowBasic getDestinationAccountJoin() {
        return this.destinationAccountJoin;
    }

    public void setDestinationAccountJoin(AccountSearchRowBasic destinationAccountJoin) {
        this.destinationAccountJoin = destinationAccountJoin;
    }

    public LocationSearchRowBasic getLocationJoin() {
        return this.locationJoin;
    }

    public void setLocationJoin(LocationSearchRowBasic locationJoin) {
        this.locationJoin = locationJoin;
    }

    public AccountSearchRowBasic getSourceAccountJoin() {
        return this.sourceAccountJoin;
    }

    public void setSourceAccountJoin(AccountSearchRowBasic sourceAccountJoin) {
        this.sourceAccountJoin = sourceAccountJoin;
    }

    public SubsidiarySearchRowBasic getSubsidiaryJoin() {
        return this.subsidiaryJoin;
    }

    public void setSubsidiaryJoin(SubsidiarySearchRowBasic subsidiaryJoin) {
        this.subsidiaryJoin = subsidiaryJoin;
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
        if (!(obj instanceof ItemAccountMappingSearchRow)) {
            return false;
        }
        ItemAccountMappingSearchRow other = (ItemAccountMappingSearchRow)obj;
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
        boolean _equals = super.equals(obj) && (this.basic == null && other.getBasic() == null || this.basic != null && this.basic.equals(other.getBasic())) && (this.classJoin == null && other.getClassJoin() == null || this.classJoin != null && this.classJoin.equals(other.getClassJoin())) && (this.departmentJoin == null && other.getDepartmentJoin() == null || this.departmentJoin != null && this.departmentJoin.equals(other.getDepartmentJoin())) && (this.destinationAccountJoin == null && other.getDestinationAccountJoin() == null || this.destinationAccountJoin != null && this.destinationAccountJoin.equals(other.getDestinationAccountJoin())) && (this.locationJoin == null && other.getLocationJoin() == null || this.locationJoin != null && this.locationJoin.equals(other.getLocationJoin())) && (this.sourceAccountJoin == null && other.getSourceAccountJoin() == null || this.sourceAccountJoin != null && this.sourceAccountJoin.equals(other.getSourceAccountJoin())) && (this.subsidiaryJoin == null && other.getSubsidiaryJoin() == null || this.subsidiaryJoin != null && this.subsidiaryJoin.equals(other.getSubsidiaryJoin())) && (this.customSearchJoin == null && other.getCustomSearchJoin() == null || this.customSearchJoin != null && Arrays.equals(this.customSearchJoin, other.getCustomSearchJoin()));
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
        if (this.getClassJoin() != null) {
            _hashCode += this.getClassJoin().hashCode();
        }
        if (this.getDepartmentJoin() != null) {
            _hashCode += this.getDepartmentJoin().hashCode();
        }
        if (this.getDestinationAccountJoin() != null) {
            _hashCode += this.getDestinationAccountJoin().hashCode();
        }
        if (this.getLocationJoin() != null) {
            _hashCode += this.getLocationJoin().hashCode();
        }
        if (this.getSourceAccountJoin() != null) {
            _hashCode += this.getSourceAccountJoin().hashCode();
        }
        if (this.getSubsidiaryJoin() != null) {
            _hashCode += this.getSubsidiaryJoin().hashCode();
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
        typeDesc.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "ItemAccountMappingSearchRow"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ItemAccountMappingSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("classJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "classJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ClassificationSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("departmentJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "departmentJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "DepartmentSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("destinationAccountJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "destinationAccountJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "AccountSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "locationJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "LocationSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("sourceAccountJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "sourceAccountJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "AccountSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subsidiaryJoin");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "subsidiaryJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "SubsidiarySearchRowBasic"));
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

