/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.axis.description.TypeDesc
 *  org.apache.axis.encoding.Deserializer
 *  org.apache.axis.encoding.Serializer
 *  org.apache.axis.encoding.ser.EnumDeserializer
 *  org.apache.axis.encoding.ser.EnumSerializer
 */
package com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.types;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

public class CostCategoryItemCostType
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __laborRun = "_laborRun";
    public static final String __laborRunOverhead = "_laborRunOverhead";
    public static final String __laborSetup = "_laborSetup";
    public static final String __laborSetupOverhead = "_laborSetupOverhead";
    public static final String __landed = "_landed";
    public static final String __machineRun = "_machineRun";
    public static final String __machineRunOverhead = "_machineRunOverhead";
    public static final String __machineSetup = "_machineSetup";
    public static final String __machineSetupOverhead = "_machineSetupOverhead";
    public static final String __material = "_material";
    public static final String __materialOverhead = "_materialOverhead";
    public static final String __outsourcingCharge = "_outsourcingCharge";
    public static final String __service = "_service";
    public static final CostCategoryItemCostType _laborRun = new CostCategoryItemCostType("_laborRun");
    public static final CostCategoryItemCostType _laborRunOverhead = new CostCategoryItemCostType("_laborRunOverhead");
    public static final CostCategoryItemCostType _laborSetup = new CostCategoryItemCostType("_laborSetup");
    public static final CostCategoryItemCostType _laborSetupOverhead = new CostCategoryItemCostType("_laborSetupOverhead");
    public static final CostCategoryItemCostType _landed = new CostCategoryItemCostType("_landed");
    public static final CostCategoryItemCostType _machineRun = new CostCategoryItemCostType("_machineRun");
    public static final CostCategoryItemCostType _machineRunOverhead = new CostCategoryItemCostType("_machineRunOverhead");
    public static final CostCategoryItemCostType _machineSetup = new CostCategoryItemCostType("_machineSetup");
    public static final CostCategoryItemCostType _machineSetupOverhead = new CostCategoryItemCostType("_machineSetupOverhead");
    public static final CostCategoryItemCostType _material = new CostCategoryItemCostType("_material");
    public static final CostCategoryItemCostType _materialOverhead = new CostCategoryItemCostType("_materialOverhead");
    public static final CostCategoryItemCostType _outsourcingCharge = new CostCategoryItemCostType("_outsourcingCharge");
    public static final CostCategoryItemCostType _service = new CostCategoryItemCostType("_service");
    private static TypeDesc typeDesc = new TypeDesc(CostCategoryItemCostType.class);

    protected CostCategoryItemCostType(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static CostCategoryItemCostType fromValue(String value) throws IllegalArgumentException {
        CostCategoryItemCostType enumeration = (CostCategoryItemCostType)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static CostCategoryItemCostType fromString(String value) throws IllegalArgumentException {
        return CostCategoryItemCostType.fromValue(value);
    }

    public boolean equals(Object obj) {
        return obj == this;
    }

    public int hashCode() {
        return this.toString().hashCode();
    }

    public String toString() {
        return this._value_;
    }

    public Object readResolve() throws ObjectStreamException {
        return CostCategoryItemCostType.fromValue(this._value_);
    }

    public static Serializer getSerializer(String mechType, Class _javaType, QName _xmlType) {
        return new EnumSerializer(_javaType, _xmlType);
    }

    public static Deserializer getDeserializer(String mechType, Class _javaType, QName _xmlType) {
        return new EnumDeserializer(_javaType, _xmlType);
    }

    public static TypeDesc getTypeDesc() {
        return typeDesc;
    }

    static {
        typeDesc.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "CostCategoryItemCostType"));
    }
}

