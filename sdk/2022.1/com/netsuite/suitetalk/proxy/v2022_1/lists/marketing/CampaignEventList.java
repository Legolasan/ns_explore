/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.axis.description.AttributeDesc
 *  org.apache.axis.description.ElementDesc
 *  org.apache.axis.description.FieldDesc
 *  org.apache.axis.description.TypeDesc
 *  org.apache.axis.encoding.Deserializer
 *  org.apache.axis.encoding.Serializer
 *  org.apache.axis.encoding.ser.BeanDeserializer
 *  org.apache.axis.encoding.ser.BeanSerializer
 */
package com.netsuite.suitetalk.proxy.v2022_1.lists.marketing;

import com.netsuite.suitetalk.proxy.v2022_1.lists.marketing.CampaignEvent;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import javax.xml.namespace.QName;
import org.apache.axis.description.AttributeDesc;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class CampaignEventList
implements Serializable {
    private CampaignEvent[] campaignEvent;
    private boolean replaceAll;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(CampaignEventList.class, true);

    public CampaignEventList() {
    }

    public CampaignEventList(CampaignEvent[] campaignEvent, boolean replaceAll) {
        this.campaignEvent = campaignEvent;
        this.replaceAll = replaceAll;
    }

    public CampaignEvent[] getCampaignEvent() {
        return this.campaignEvent;
    }

    public void setCampaignEvent(CampaignEvent[] campaignEvent) {
        this.campaignEvent = campaignEvent;
    }

    public CampaignEvent getCampaignEvent(int i) {
        return this.campaignEvent[i];
    }

    public void setCampaignEvent(int i, CampaignEvent _value) {
        this.campaignEvent[i] = _value;
    }

    public boolean isReplaceAll() {
        return this.replaceAll;
    }

    public void setReplaceAll(boolean replaceAll) {
        this.replaceAll = replaceAll;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CampaignEventList)) {
            return false;
        }
        CampaignEventList other = (CampaignEventList)obj;
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
        boolean _equals = (this.campaignEvent == null && other.getCampaignEvent() == null || this.campaignEvent != null && Arrays.equals(this.campaignEvent, other.getCampaignEvent())) && this.replaceAll == other.isReplaceAll();
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getCampaignEvent() != null) {
            for (int i = 0; i < Array.getLength(this.getCampaignEvent()); ++i) {
                Object obj = Array.get(this.getCampaignEvent(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        Boolean bl = this.isReplaceAll() ? Boolean.TRUE : Boolean.FALSE;
        this.__hashCodeCalc = false;
        return _hashCode += bl.hashCode();
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
        typeDesc.setXmlType(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "CampaignEventList"));
        AttributeDesc attrField = new AttributeDesc();
        attrField.setFieldName("replaceAll");
        attrField.setXmlName(new QName("", "replaceAll"));
        attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        typeDesc.addFieldDesc((FieldDesc)attrField);
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("campaignEvent");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "campaignEvent"));
        elemField.setXmlType(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "CampaignEvent"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

