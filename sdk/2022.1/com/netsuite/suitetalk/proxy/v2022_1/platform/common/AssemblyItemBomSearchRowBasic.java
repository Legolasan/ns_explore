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

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnBooleanField;
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

public class AssemblyItemBomSearchRowBasic
extends SearchRowBasic
implements Serializable {
    private SearchColumnSelectField[] assembly;
    private SearchColumnSelectField[] billOfMaterials;
    private SearchColumnBooleanField[] _default;
    private SearchColumnSelectField[] locations;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(AssemblyItemBomSearchRowBasic.class, true);

    public AssemblyItemBomSearchRowBasic() {
    }

    public AssemblyItemBomSearchRowBasic(SearchColumnSelectField[] assembly, SearchColumnSelectField[] billOfMaterials, SearchColumnBooleanField[] _default, SearchColumnSelectField[] locations) {
        this.assembly = assembly;
        this.billOfMaterials = billOfMaterials;
        this._default = _default;
        this.locations = locations;
    }

    public SearchColumnSelectField[] getAssembly() {
        return this.assembly;
    }

    public void setAssembly(SearchColumnSelectField[] assembly) {
        this.assembly = assembly;
    }

    public SearchColumnSelectField getAssembly(int i) {
        return this.assembly[i];
    }

    public void setAssembly(int i, SearchColumnSelectField _value) {
        this.assembly[i] = _value;
    }

    public SearchColumnSelectField[] getBillOfMaterials() {
        return this.billOfMaterials;
    }

    public void setBillOfMaterials(SearchColumnSelectField[] billOfMaterials) {
        this.billOfMaterials = billOfMaterials;
    }

    public SearchColumnSelectField getBillOfMaterials(int i) {
        return this.billOfMaterials[i];
    }

    public void setBillOfMaterials(int i, SearchColumnSelectField _value) {
        this.billOfMaterials[i] = _value;
    }

    public SearchColumnBooleanField[] get_default() {
        return this._default;
    }

    public void set_default(SearchColumnBooleanField[] _default) {
        this._default = _default;
    }

    public SearchColumnBooleanField get_default(int i) {
        return this._default[i];
    }

    public void set_default(int i, SearchColumnBooleanField _value) {
        this._default[i] = _value;
    }

    public SearchColumnSelectField[] getLocations() {
        return this.locations;
    }

    public void setLocations(SearchColumnSelectField[] locations) {
        this.locations = locations;
    }

    public SearchColumnSelectField getLocations(int i) {
        return this.locations[i];
    }

    public void setLocations(int i, SearchColumnSelectField _value) {
        this.locations[i] = _value;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof AssemblyItemBomSearchRowBasic)) {
            return false;
        }
        AssemblyItemBomSearchRowBasic other = (AssemblyItemBomSearchRowBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.assembly == null && other.getAssembly() == null || this.assembly != null && Arrays.equals(this.assembly, other.getAssembly())) && (this.billOfMaterials == null && other.getBillOfMaterials() == null || this.billOfMaterials != null && Arrays.equals(this.billOfMaterials, other.getBillOfMaterials())) && (this._default == null && other.get_default() == null || this._default != null && Arrays.equals(this._default, other.get_default())) && (this.locations == null && other.getLocations() == null || this.locations != null && Arrays.equals(this.locations, other.getLocations()));
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
        if (this.getAssembly() != null) {
            for (i = 0; i < Array.getLength(this.getAssembly()); ++i) {
                obj = Array.get(this.getAssembly(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getBillOfMaterials() != null) {
            for (i = 0; i < Array.getLength(this.getBillOfMaterials()); ++i) {
                obj = Array.get(this.getBillOfMaterials(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.get_default() != null) {
            for (i = 0; i < Array.getLength(this.get_default()); ++i) {
                obj = Array.get(this.get_default(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLocations() != null) {
            for (i = 0; i < Array.getLength(this.getLocations()); ++i) {
                obj = Array.get(this.getLocations(), i);
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "AssemblyItemBomSearchRowBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("assembly");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "assembly"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billOfMaterials");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "billOfMaterials"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("_default");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "default"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnBooleanField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locations");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "locations"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

