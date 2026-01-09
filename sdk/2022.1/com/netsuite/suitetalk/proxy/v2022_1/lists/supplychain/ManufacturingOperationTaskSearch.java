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
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.ManufacturingOperationTaskSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.TransactionSearchBasic;
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

public class ManufacturingOperationTaskSearch
extends SearchRecord
implements Serializable {
    private ManufacturingOperationTaskSearchBasic basic;
    private ManufacturingOperationTaskSearchBasic predecessorJoin;
    private EmployeeSearchBasic userJoin;
    private TransactionSearchBasic workOrderJoin;
    private CustomSearchJoin[] customSearchJoin;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(ManufacturingOperationTaskSearch.class, true);

    public ManufacturingOperationTaskSearch() {
    }

    public ManufacturingOperationTaskSearch(ManufacturingOperationTaskSearchBasic basic, ManufacturingOperationTaskSearchBasic predecessorJoin, EmployeeSearchBasic userJoin, TransactionSearchBasic workOrderJoin, CustomSearchJoin[] customSearchJoin) {
        this.basic = basic;
        this.predecessorJoin = predecessorJoin;
        this.userJoin = userJoin;
        this.workOrderJoin = workOrderJoin;
        this.customSearchJoin = customSearchJoin;
    }

    public ManufacturingOperationTaskSearchBasic getBasic() {
        return this.basic;
    }

    public void setBasic(ManufacturingOperationTaskSearchBasic basic) {
        this.basic = basic;
    }

    public ManufacturingOperationTaskSearchBasic getPredecessorJoin() {
        return this.predecessorJoin;
    }

    public void setPredecessorJoin(ManufacturingOperationTaskSearchBasic predecessorJoin) {
        this.predecessorJoin = predecessorJoin;
    }

    public EmployeeSearchBasic getUserJoin() {
        return this.userJoin;
    }

    public void setUserJoin(EmployeeSearchBasic userJoin) {
        this.userJoin = userJoin;
    }

    public TransactionSearchBasic getWorkOrderJoin() {
        return this.workOrderJoin;
    }

    public void setWorkOrderJoin(TransactionSearchBasic workOrderJoin) {
        this.workOrderJoin = workOrderJoin;
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
        if (!(obj instanceof ManufacturingOperationTaskSearch)) {
            return false;
        }
        ManufacturingOperationTaskSearch other = (ManufacturingOperationTaskSearch)obj;
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
        boolean _equals = super.equals(obj) && (this.basic == null && other.getBasic() == null || this.basic != null && this.basic.equals(other.getBasic())) && (this.predecessorJoin == null && other.getPredecessorJoin() == null || this.predecessorJoin != null && this.predecessorJoin.equals(other.getPredecessorJoin())) && (this.userJoin == null && other.getUserJoin() == null || this.userJoin != null && this.userJoin.equals(other.getUserJoin())) && (this.workOrderJoin == null && other.getWorkOrderJoin() == null || this.workOrderJoin != null && this.workOrderJoin.equals(other.getWorkOrderJoin())) && (this.customSearchJoin == null && other.getCustomSearchJoin() == null || this.customSearchJoin != null && Arrays.equals(this.customSearchJoin, other.getCustomSearchJoin()));
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
        if (this.getPredecessorJoin() != null) {
            _hashCode += this.getPredecessorJoin().hashCode();
        }
        if (this.getUserJoin() != null) {
            _hashCode += this.getUserJoin().hashCode();
        }
        if (this.getWorkOrderJoin() != null) {
            _hashCode += this.getWorkOrderJoin().hashCode();
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
        typeDesc.setXmlType(new QName("urn:supplychain_2022_1.lists.webservices.netsuite.com", "ManufacturingOperationTaskSearch"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new QName("urn:supplychain_2022_1.lists.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ManufacturingOperationTaskSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("predecessorJoin");
        elemField.setXmlName(new QName("urn:supplychain_2022_1.lists.webservices.netsuite.com", "predecessorJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ManufacturingOperationTaskSearchBasic"));
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
        elemField.setFieldName("workOrderJoin");
        elemField.setXmlName(new QName("urn:supplychain_2022_1.lists.webservices.netsuite.com", "workOrderJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TransactionSearchBasic"));
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

