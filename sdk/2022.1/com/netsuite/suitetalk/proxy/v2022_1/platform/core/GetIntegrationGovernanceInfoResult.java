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
package com.netsuite.suitetalk.proxy.v2022_1.platform.core;

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.Status;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.types.GetIntegrationGovernanceInfoLimitType;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class GetIntegrationGovernanceInfoResult
implements Serializable {
    private Status status;
    private Long integrationConcurrencyLimit;
    private GetIntegrationGovernanceInfoLimitType limitType;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(GetIntegrationGovernanceInfoResult.class, true);

    public GetIntegrationGovernanceInfoResult() {
    }

    public GetIntegrationGovernanceInfoResult(Status status, Long integrationConcurrencyLimit, GetIntegrationGovernanceInfoLimitType limitType) {
        this.status = status;
        this.integrationConcurrencyLimit = integrationConcurrencyLimit;
        this.limitType = limitType;
    }

    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Long getIntegrationConcurrencyLimit() {
        return this.integrationConcurrencyLimit;
    }

    public void setIntegrationConcurrencyLimit(Long integrationConcurrencyLimit) {
        this.integrationConcurrencyLimit = integrationConcurrencyLimit;
    }

    public GetIntegrationGovernanceInfoLimitType getLimitType() {
        return this.limitType;
    }

    public void setLimitType(GetIntegrationGovernanceInfoLimitType limitType) {
        this.limitType = limitType;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetIntegrationGovernanceInfoResult)) {
            return false;
        }
        GetIntegrationGovernanceInfoResult other = (GetIntegrationGovernanceInfoResult)obj;
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
        boolean _equals = (this.status == null && other.getStatus() == null || this.status != null && this.status.equals(other.getStatus())) && (this.integrationConcurrencyLimit == null && other.getIntegrationConcurrencyLimit() == null || this.integrationConcurrencyLimit != null && this.integrationConcurrencyLimit.equals(other.getIntegrationConcurrencyLimit())) && (this.limitType == null && other.getLimitType() == null || this.limitType != null && this.limitType.equals(other.getLimitType()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getStatus() != null) {
            _hashCode += this.getStatus().hashCode();
        }
        if (this.getIntegrationConcurrencyLimit() != null) {
            _hashCode += this.getIntegrationConcurrencyLimit().hashCode();
        }
        if (this.getLimitType() != null) {
            _hashCode += this.getLimitType().hashCode();
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
        typeDesc.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "GetIntegrationGovernanceInfoResult"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "status"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "Status"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("integrationConcurrencyLimit");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "integrationConcurrencyLimit"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("limitType");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "limitType"));
        elemField.setXmlType(new QName("urn:types.core_2022_1.platform.webservices.netsuite.com", "GetIntegrationGovernanceInfoLimitType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

