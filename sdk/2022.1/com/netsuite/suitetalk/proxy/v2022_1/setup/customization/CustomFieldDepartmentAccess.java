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
package com.netsuite.suitetalk.proxy.v2022_1.setup.customization;

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import com.netsuite.suitetalk.proxy.v2022_1.setup.customization.types.CustomizationAccessLevel;
import com.netsuite.suitetalk.proxy.v2022_1.setup.customization.types.CustomizationSearchLevel;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class CustomFieldDepartmentAccess
implements Serializable {
    private RecordRef dept;
    private CustomizationAccessLevel accessLevel;
    private CustomizationSearchLevel searchLevel;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(CustomFieldDepartmentAccess.class, true);

    public CustomFieldDepartmentAccess() {
    }

    public CustomFieldDepartmentAccess(RecordRef dept, CustomizationAccessLevel accessLevel, CustomizationSearchLevel searchLevel) {
        this.dept = dept;
        this.accessLevel = accessLevel;
        this.searchLevel = searchLevel;
    }

    public RecordRef getDept() {
        return this.dept;
    }

    public void setDept(RecordRef dept) {
        this.dept = dept;
    }

    public CustomizationAccessLevel getAccessLevel() {
        return this.accessLevel;
    }

    public void setAccessLevel(CustomizationAccessLevel accessLevel) {
        this.accessLevel = accessLevel;
    }

    public CustomizationSearchLevel getSearchLevel() {
        return this.searchLevel;
    }

    public void setSearchLevel(CustomizationSearchLevel searchLevel) {
        this.searchLevel = searchLevel;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CustomFieldDepartmentAccess)) {
            return false;
        }
        CustomFieldDepartmentAccess other = (CustomFieldDepartmentAccess)obj;
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
        boolean _equals = (this.dept == null && other.getDept() == null || this.dept != null && this.dept.equals(other.getDept())) && (this.accessLevel == null && other.getAccessLevel() == null || this.accessLevel != null && this.accessLevel.equals(other.getAccessLevel())) && (this.searchLevel == null && other.getSearchLevel() == null || this.searchLevel != null && this.searchLevel.equals(other.getSearchLevel()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getDept() != null) {
            _hashCode += this.getDept().hashCode();
        }
        if (this.getAccessLevel() != null) {
            _hashCode += this.getAccessLevel().hashCode();
        }
        if (this.getSearchLevel() != null) {
            _hashCode += this.getSearchLevel().hashCode();
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
        typeDesc.setXmlType(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "CustomFieldDepartmentAccess"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("dept");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "dept"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("accessLevel");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "accessLevel"));
        elemField.setXmlType(new QName("urn:types.customization_2022_1.setup.webservices.netsuite.com", "CustomizationAccessLevel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("searchLevel");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "searchLevel"));
        elemField.setXmlType(new QName("urn:types.customization_2022_1.setup.webservices.netsuite.com", "CustomizationSearchLevel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

