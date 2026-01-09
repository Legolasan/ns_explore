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
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class GetAccountGovernanceInfoResult
implements Serializable {
    private Status status;
    private Long accountConcurrencyLimit;
    private Long unallocatedConcurrencyLimit;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(GetAccountGovernanceInfoResult.class, true);

    public GetAccountGovernanceInfoResult() {
    }

    public GetAccountGovernanceInfoResult(Status status, Long accountConcurrencyLimit, Long unallocatedConcurrencyLimit) {
        this.status = status;
        this.accountConcurrencyLimit = accountConcurrencyLimit;
        this.unallocatedConcurrencyLimit = unallocatedConcurrencyLimit;
    }

    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Long getAccountConcurrencyLimit() {
        return this.accountConcurrencyLimit;
    }

    public void setAccountConcurrencyLimit(Long accountConcurrencyLimit) {
        this.accountConcurrencyLimit = accountConcurrencyLimit;
    }

    public Long getUnallocatedConcurrencyLimit() {
        return this.unallocatedConcurrencyLimit;
    }

    public void setUnallocatedConcurrencyLimit(Long unallocatedConcurrencyLimit) {
        this.unallocatedConcurrencyLimit = unallocatedConcurrencyLimit;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetAccountGovernanceInfoResult)) {
            return false;
        }
        GetAccountGovernanceInfoResult other = (GetAccountGovernanceInfoResult)obj;
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
        boolean _equals = (this.status == null && other.getStatus() == null || this.status != null && this.status.equals(other.getStatus())) && (this.accountConcurrencyLimit == null && other.getAccountConcurrencyLimit() == null || this.accountConcurrencyLimit != null && this.accountConcurrencyLimit.equals(other.getAccountConcurrencyLimit())) && (this.unallocatedConcurrencyLimit == null && other.getUnallocatedConcurrencyLimit() == null || this.unallocatedConcurrencyLimit != null && this.unallocatedConcurrencyLimit.equals(other.getUnallocatedConcurrencyLimit()));
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
        if (this.getAccountConcurrencyLimit() != null) {
            _hashCode += this.getAccountConcurrencyLimit().hashCode();
        }
        if (this.getUnallocatedConcurrencyLimit() != null) {
            _hashCode += this.getUnallocatedConcurrencyLimit().hashCode();
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
        typeDesc.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "GetAccountGovernanceInfoResult"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "status"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "Status"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("accountConcurrencyLimit");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "accountConcurrencyLimit"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("unallocatedConcurrencyLimit");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "unallocatedConcurrencyLimit"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

