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
package com.netsuite.suitetalk.proxy.v2022_1.platform.core.types;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.HashMap;
import javax.xml.namespace.QName;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.EnumDeserializer;
import org.apache.axis.encoding.ser.EnumSerializer;

public class GetIntegrationGovernanceInfoLimitType
implements Serializable {
    private String _value_;
    private static HashMap _table_ = new HashMap();
    public static final String __account = "_account";
    public static final String __integrationSpecific = "_integrationSpecific";
    public static final String __internal = "_internal";
    public static final GetIntegrationGovernanceInfoLimitType _account = new GetIntegrationGovernanceInfoLimitType("_account");
    public static final GetIntegrationGovernanceInfoLimitType _integrationSpecific = new GetIntegrationGovernanceInfoLimitType("_integrationSpecific");
    public static final GetIntegrationGovernanceInfoLimitType _internal = new GetIntegrationGovernanceInfoLimitType("_internal");
    private static TypeDesc typeDesc = new TypeDesc(GetIntegrationGovernanceInfoLimitType.class);

    protected GetIntegrationGovernanceInfoLimitType(String value) {
        this._value_ = value;
        _table_.put(this._value_, this);
    }

    public String getValue() {
        return this._value_;
    }

    public static GetIntegrationGovernanceInfoLimitType fromValue(String value) throws IllegalArgumentException {
        GetIntegrationGovernanceInfoLimitType enumeration = (GetIntegrationGovernanceInfoLimitType)_table_.get(value);
        if (enumeration == null) {
            throw new IllegalArgumentException();
        }
        return enumeration;
    }

    public static GetIntegrationGovernanceInfoLimitType fromString(String value) throws IllegalArgumentException {
        return GetIntegrationGovernanceInfoLimitType.fromValue(value);
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
        return GetIntegrationGovernanceInfoLimitType.fromValue(this._value_);
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
        typeDesc.setXmlType(new QName("urn:types.core_2022_1.platform.webservices.netsuite.com", "GetIntegrationGovernanceInfoLimitType"));
    }
}

