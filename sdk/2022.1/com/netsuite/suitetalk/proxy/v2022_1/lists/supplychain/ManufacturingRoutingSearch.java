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
package com.netsuite.suitetalk.proxy.v2022_1.lists.supplychain;

import com.netsuite.suitetalk.proxy.v2022_1.platform.common.CustomSearchJoin;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.EmployeeSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.EntityGroupSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.ItemSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.LocationSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.ManufacturingCostTemplateSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.ManufacturingRoutingSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchRecord;
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

public class ManufacturingRoutingSearch
extends SearchRecord
implements Serializable {
    private ManufacturingRoutingSearchBasic basic;
    private ItemSearchBasic itemJoin;
    private LocationSearchBasic locationJoin;
    private ManufacturingCostTemplateSearchBasic manufacturingCostTemplateJoin;
    private EntityGroupSearchBasic manufacturingWorkCenterJoin;
    private EmployeeSearchBasic userJoin;
    private CustomSearchJoin[] customSearchJoin;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(ManufacturingRoutingSearch.class, true);

    public ManufacturingRoutingSearch() {
    }

    public ManufacturingRoutingSearch(ManufacturingRoutingSearchBasic basic, ItemSearchBasic itemJoin, LocationSearchBasic locationJoin, ManufacturingCostTemplateSearchBasic manufacturingCostTemplateJoin, EntityGroupSearchBasic manufacturingWorkCenterJoin, EmployeeSearchBasic userJoin, CustomSearchJoin[] customSearchJoin) {
        this.basic = basic;
        this.itemJoin = itemJoin;
        this.locationJoin = locationJoin;
        this.manufacturingCostTemplateJoin = manufacturingCostTemplateJoin;
        this.manufacturingWorkCenterJoin = manufacturingWorkCenterJoin;
        this.userJoin = userJoin;
        this.customSearchJoin = customSearchJoin;
    }

    public ManufacturingRoutingSearchBasic getBasic() {
        return this.basic;
    }

    public void setBasic(ManufacturingRoutingSearchBasic basic) {
        this.basic = basic;
    }

    public ItemSearchBasic getItemJoin() {
        return this.itemJoin;
    }

    public void setItemJoin(ItemSearchBasic itemJoin) {
        this.itemJoin = itemJoin;
    }

    public LocationSearchBasic getLocationJoin() {
        return this.locationJoin;
    }

    public void setLocationJoin(LocationSearchBasic locationJoin) {
        this.locationJoin = locationJoin;
    }

    public ManufacturingCostTemplateSearchBasic getManufacturingCostTemplateJoin() {
        return this.manufacturingCostTemplateJoin;
    }

    public void setManufacturingCostTemplateJoin(ManufacturingCostTemplateSearchBasic manufacturingCostTemplateJoin) {
        this.manufacturingCostTemplateJoin = manufacturingCostTemplateJoin;
    }

    public EntityGroupSearchBasic getManufacturingWorkCenterJoin() {
        return this.manufacturingWorkCenterJoin;
    }

    public void setManufacturingWorkCenterJoin(EntityGroupSearchBasic manufacturingWorkCenterJoin) {
        this.manufacturingWorkCenterJoin = manufacturingWorkCenterJoin;
    }

    public EmployeeSearchBasic getUserJoin() {
        return this.userJoin;
    }

    public void setUserJoin(EmployeeSearchBasic userJoin) {
        this.userJoin = userJoin;
    }

    public CustomSearchJoin[] getCustomSearchJoin() {
        return this.customSearchJoin;
    }

    public void setCustomSearchJoin(CustomSearchJoin[] customSearchJoin) {
        this.customSearchJoin = customSearchJoin;
    }

    public CustomSearchJoin getCustomSearchJoin(int i) {
        return this.customSearchJoin[i];
    }

    public void setCustomSearchJoin(int i, CustomSearchJoin _value) {
        this.customSearchJoin[i] = _value;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ManufacturingRoutingSearch)) {
            return false;
        }
        ManufacturingRoutingSearch other = (ManufacturingRoutingSearch)obj;
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
        boolean _equals = super.equals(obj) && (this.basic == null && other.getBasic() == null || this.basic != null && this.basic.equals(other.getBasic())) && (this.itemJoin == null && other.getItemJoin() == null || this.itemJoin != null && this.itemJoin.equals(other.getItemJoin())) && (this.locationJoin == null && other.getLocationJoin() == null || this.locationJoin != null && this.locationJoin.equals(other.getLocationJoin())) && (this.manufacturingCostTemplateJoin == null && other.getManufacturingCostTemplateJoin() == null || this.manufacturingCostTemplateJoin != null && this.manufacturingCostTemplateJoin.equals(other.getManufacturingCostTemplateJoin())) && (this.manufacturingWorkCenterJoin == null && other.getManufacturingWorkCenterJoin() == null || this.manufacturingWorkCenterJoin != null && this.manufacturingWorkCenterJoin.equals(other.getManufacturingWorkCenterJoin())) && (this.userJoin == null && other.getUserJoin() == null || this.userJoin != null && this.userJoin.equals(other.getUserJoin())) && (this.customSearchJoin == null && other.getCustomSearchJoin() == null || this.customSearchJoin != null && Arrays.equals(this.customSearchJoin, other.getCustomSearchJoin()));
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
        if (this.getItemJoin() != null) {
            _hashCode += this.getItemJoin().hashCode();
        }
        if (this.getLocationJoin() != null) {
            _hashCode += this.getLocationJoin().hashCode();
        }
        if (this.getManufacturingCostTemplateJoin() != null) {
            _hashCode += this.getManufacturingCostTemplateJoin().hashCode();
        }
        if (this.getManufacturingWorkCenterJoin() != null) {
            _hashCode += this.getManufacturingWorkCenterJoin().hashCode();
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
        typeDesc.setXmlType(new QName("urn:supplychain_2022_1.lists.webservices.netsuite.com", "ManufacturingRoutingSearch"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new QName("urn:supplychain_2022_1.lists.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ManufacturingRoutingSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemJoin");
        elemField.setXmlName(new QName("urn:supplychain_2022_1.lists.webservices.netsuite.com", "itemJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ItemSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationJoin");
        elemField.setXmlName(new QName("urn:supplychain_2022_1.lists.webservices.netsuite.com", "locationJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "LocationSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("manufacturingCostTemplateJoin");
        elemField.setXmlName(new QName("urn:supplychain_2022_1.lists.webservices.netsuite.com", "manufacturingCostTemplateJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ManufacturingCostTemplateSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("manufacturingWorkCenterJoin");
        elemField.setXmlName(new QName("urn:supplychain_2022_1.lists.webservices.netsuite.com", "manufacturingWorkCenterJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "EntityGroupSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("userJoin");
        elemField.setXmlName(new QName("urn:supplychain_2022_1.lists.webservices.netsuite.com", "userJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "EmployeeSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customSearchJoin");
        elemField.setXmlName(new QName("urn:supplychain_2022_1.lists.webservices.netsuite.com", "customSearchJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "CustomSearchJoin"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

