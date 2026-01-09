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
package com.netsuite.suitetalk.proxy.v2022_1.transactions.inventory.types;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

public class WorkOrderOrderStatus
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __built = "_built";
    public static final String __cancelled = "_cancelled";
    public static final String __closed = "_closed";
    public static final String __inProcess = "_inProcess";
    public static final String __planned = "_planned";
    public static final String __released = "_released";
    public static final String __undefined = "_undefined";
    public static final WorkOrderOrderStatus _built = new WorkOrderOrderStatus("_built");
    public static final WorkOrderOrderStatus _cancelled = new WorkOrderOrderStatus("_cancelled");
    public static final WorkOrderOrderStatus _closed = new WorkOrderOrderStatus("_closed");
    public static final WorkOrderOrderStatus _inProcess = new WorkOrderOrderStatus("_inProcess");
    public static final WorkOrderOrderStatus _planned = new WorkOrderOrderStatus("_planned");
    public static final WorkOrderOrderStatus _released = new WorkOrderOrderStatus("_released");
    public static final WorkOrderOrderStatus _undefined = new WorkOrderOrderStatus("_undefined");
    private static TypeDesc typeDesc = new TypeDesc(WorkOrderOrderStatus.class);

    protected WorkOrderOrderStatus(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static WorkOrderOrderStatus fromValue(String value) throws IllegalArgumentException {
        WorkOrderOrderStatus enumeration = (WorkOrderOrderStatus)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static WorkOrderOrderStatus fromString(String value) throws IllegalArgumentException {
        return WorkOrderOrderStatus.fromValue(value);
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
        return WorkOrderOrderStatus.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.inventory_2022_1.transactions.webservices.netsuite.com", "WorkOrderOrderStatus"));
    }
}

