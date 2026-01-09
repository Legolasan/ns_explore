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

import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class DataCenterUrls
implements Serializable {
    private String restDomain;
    private String webservicesDomain;
    private String systemDomain;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(DataCenterUrls.class, true);

    public DataCenterUrls() {
    }

    public DataCenterUrls(String restDomain, String webservicesDomain, String systemDomain) {
        this.restDomain = restDomain;
        this.webservicesDomain = webservicesDomain;
        this.systemDomain = systemDomain;
    }

    public String getRestDomain() {
        return this.restDomain;
    }

    public void setRestDomain(String restDomain) {
        this.restDomain = restDomain;
    }

    public String getWebservicesDomain() {
        return this.webservicesDomain;
    }

    public void setWebservicesDomain(String webservicesDomain) {
        this.webservicesDomain = webservicesDomain;
    }

    public String getSystemDomain() {
        return this.systemDomain;
    }

    public void setSystemDomain(String systemDomain) {
        this.systemDomain = systemDomain;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof DataCenterUrls)) {
            return false;
        }
        DataCenterUrls other = (DataCenterUrls)obj;
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
        boolean _equals = (this.restDomain == null && other.getRestDomain() == null || this.restDomain != null && this.restDomain.equals(other.getRestDomain())) && (this.webservicesDomain == null && other.getWebservicesDomain() == null || this.webservicesDomain != null && this.webservicesDomain.equals(other.getWebservicesDomain())) && (this.systemDomain == null && other.getSystemDomain() == null || this.systemDomain != null && this.systemDomain.equals(other.getSystemDomain()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getRestDomain() != null) {
            _hashCode += this.getRestDomain().hashCode();
        }
        if (this.getWebservicesDomain() != null) {
            _hashCode += this.getWebservicesDomain().hashCode();
        }
        if (this.getSystemDomain() != null) {
            _hashCode += this.getSystemDomain().hashCode();
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
        typeDesc.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "DataCenterUrls"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("restDomain");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "restDomain"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("webservicesDomain");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "webservicesDomain"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("systemDomain");
        elemField.setXmlName(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "systemDomain"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

