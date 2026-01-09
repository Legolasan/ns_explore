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

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.types.AsyncStatusType;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class AsyncStatusResult
implements Serializable {
    private String jobId;
    private AsyncStatusType status;
    private double percentCompleted;
    private double estRemainingDuration;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(AsyncStatusResult.class, true);

    public AsyncStatusResult() {
    }

    public AsyncStatusResult(String jobId, AsyncStatusType status, double percentCompleted, double estRemainingDuration) {
        this.jobId = jobId;
        this.status = status;
        this.percentCompleted = percentCompleted;
        this.estRemainingDuration = estRemainingDuration;
    }

    public String getJobId() {
        return this.jobId;
    }

    public void setJobId(String jobId) {
        this.jobId = jobId;
    }

    public AsyncStatusType getStatus() {
        return this.status;
    }

    public void setStatus(AsyncStatusType status) {
        this.status = status;
    }

    public double getPercentCompleted() {
        return this.percentCompleted;
    }

    public void setPercentCompleted(double percentCompleted) {
        this.percentCompleted = percentCompleted;
    }

    public double getEstRemainingDuration() {
        return this.estRemainingDuration;
    }

    public void setEstRemainingDuration(double estRemainingDuration) {
        this.estRemainingDuration = estRemainingDuration;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof AsyncStatusResult)) {
            return false;
        }
        AsyncStatusResult other = (AsyncStatusResult)obj;
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
        boolean _equals = (this.jobId == null && other.getJobId() == null || this.jobId != null && this.jobId.equals(other.getJobId())) && (this.status == null && other.getStatus() == null || this.status != null && this.status.equals(other.getStatus())) && this.percentCompleted == other.getPercentCompleted() && this.estRemainingDuration == other.getEstRemainingDuration();
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getJobId() != null) {
            _hashCode += this.getJobId().hashCode();
        }
        if (this.getStatus() != null) {
            _hashCode += this.getStatus().hashCode();
        }
        _hashCode += new Double(this.getPercentCompleted()).hashCode();
        this.__hashCodeCalc = false;
        return _hashCode += new Double(this.getEstRemainingDuration()).hashCode();
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
        typeDesc.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "AsyncStatusResult"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("jobId");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "jobId"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "status"));
        elemField.setXmlType(new QName("urn:types.core_2022_1.platform.webservices.netsuite.com", "AsyncStatusType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("percentCompleted");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "percentCompleted"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("estRemainingDuration");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "estRemainingDuration"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

