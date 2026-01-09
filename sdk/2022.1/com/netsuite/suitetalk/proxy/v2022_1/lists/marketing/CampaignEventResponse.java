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
package com.netsuite.suitetalk.proxy.v2022_1.lists.marketing;

import java.io.Serializable;
import java.util.Calendar;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class CampaignEventResponse
implements Serializable {
    private String name;
    private String type;
    private Calendar dateSent;
    private Double sent;
    private Double opened;
    private Double openedRatio;
    private Double clickedThru;
    private Double clickedThruRatio;
    private Long responded;
    private Double respondedRatio;
    private Long unsubscribed;
    private Double unsubscribedRatio;
    private Long bounced;
    private Double bouncedRatio;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(CampaignEventResponse.class, true);

    public CampaignEventResponse() {
    }

    public CampaignEventResponse(String name, String type, Calendar dateSent, Double sent, Double opened, Double openedRatio, Double clickedThru, Double clickedThruRatio, Long responded, Double respondedRatio, Long unsubscribed, Double unsubscribedRatio, Long bounced, Double bouncedRatio) {
        this.name = name;
        this.type = type;
        this.dateSent = dateSent;
        this.sent = sent;
        this.opened = opened;
        this.openedRatio = openedRatio;
        this.clickedThru = clickedThru;
        this.clickedThruRatio = clickedThruRatio;
        this.responded = responded;
        this.respondedRatio = respondedRatio;
        this.unsubscribed = unsubscribed;
        this.unsubscribedRatio = unsubscribedRatio;
        this.bounced = bounced;
        this.bouncedRatio = bouncedRatio;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Calendar getDateSent() {
        return this.dateSent;
    }

    public void setDateSent(Calendar dateSent) {
        this.dateSent = dateSent;
    }

    public Double getSent() {
        return this.sent;
    }

    public void setSent(Double sent) {
        this.sent = sent;
    }

    public Double getOpened() {
        return this.opened;
    }

    public void setOpened(Double opened) {
        this.opened = opened;
    }

    public Double getOpenedRatio() {
        return this.openedRatio;
    }

    public void setOpenedRatio(Double openedRatio) {
        this.openedRatio = openedRatio;
    }

    public Double getClickedThru() {
        return this.clickedThru;
    }

    public void setClickedThru(Double clickedThru) {
        this.clickedThru = clickedThru;
    }

    public Double getClickedThruRatio() {
        return this.clickedThruRatio;
    }

    public void setClickedThruRatio(Double clickedThruRatio) {
        this.clickedThruRatio = clickedThruRatio;
    }

    public Long getResponded() {
        return this.responded;
    }

    public void setResponded(Long responded) {
        this.responded = responded;
    }

    public Double getRespondedRatio() {
        return this.respondedRatio;
    }

    public void setRespondedRatio(Double respondedRatio) {
        this.respondedRatio = respondedRatio;
    }

    public Long getUnsubscribed() {
        return this.unsubscribed;
    }

    public void setUnsubscribed(Long unsubscribed) {
        this.unsubscribed = unsubscribed;
    }

    public Double getUnsubscribedRatio() {
        return this.unsubscribedRatio;
    }

    public void setUnsubscribedRatio(Double unsubscribedRatio) {
        this.unsubscribedRatio = unsubscribedRatio;
    }

    public Long getBounced() {
        return this.bounced;
    }

    public void setBounced(Long bounced) {
        this.bounced = bounced;
    }

    public Double getBouncedRatio() {
        return this.bouncedRatio;
    }

    public void setBouncedRatio(Double bouncedRatio) {
        this.bouncedRatio = bouncedRatio;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CampaignEventResponse)) {
            return false;
        }
        CampaignEventResponse other = (CampaignEventResponse)obj;
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
        boolean _equals = (this.name == null && other.getName() == null || this.name != null && this.name.equals(other.getName())) && (this.type == null && other.getType() == null || this.type != null && this.type.equals(other.getType())) && (this.dateSent == null && other.getDateSent() == null || this.dateSent != null && this.dateSent.equals(other.getDateSent())) && (this.sent == null && other.getSent() == null || this.sent != null && this.sent.equals(other.getSent())) && (this.opened == null && other.getOpened() == null || this.opened != null && this.opened.equals(other.getOpened())) && (this.openedRatio == null && other.getOpenedRatio() == null || this.openedRatio != null && this.openedRatio.equals(other.getOpenedRatio())) && (this.clickedThru == null && other.getClickedThru() == null || this.clickedThru != null && this.clickedThru.equals(other.getClickedThru())) && (this.clickedThruRatio == null && other.getClickedThruRatio() == null || this.clickedThruRatio != null && this.clickedThruRatio.equals(other.getClickedThruRatio())) && (this.responded == null && other.getResponded() == null || this.responded != null && this.responded.equals(other.getResponded())) && (this.respondedRatio == null && other.getRespondedRatio() == null || this.respondedRatio != null && this.respondedRatio.equals(other.getRespondedRatio())) && (this.unsubscribed == null && other.getUnsubscribed() == null || this.unsubscribed != null && this.unsubscribed.equals(other.getUnsubscribed())) && (this.unsubscribedRatio == null && other.getUnsubscribedRatio() == null || this.unsubscribedRatio != null && this.unsubscribedRatio.equals(other.getUnsubscribedRatio())) && (this.bounced == null && other.getBounced() == null || this.bounced != null && this.bounced.equals(other.getBounced())) && (this.bouncedRatio == null && other.getBouncedRatio() == null || this.bouncedRatio != null && this.bouncedRatio.equals(other.getBouncedRatio()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getName() != null) {
            _hashCode += this.getName().hashCode();
        }
        if (this.getType() != null) {
            _hashCode += this.getType().hashCode();
        }
        if (this.getDateSent() != null) {
            _hashCode += this.getDateSent().hashCode();
        }
        if (this.getSent() != null) {
            _hashCode += this.getSent().hashCode();
        }
        if (this.getOpened() != null) {
            _hashCode += this.getOpened().hashCode();
        }
        if (this.getOpenedRatio() != null) {
            _hashCode += this.getOpenedRatio().hashCode();
        }
        if (this.getClickedThru() != null) {
            _hashCode += this.getClickedThru().hashCode();
        }
        if (this.getClickedThruRatio() != null) {
            _hashCode += this.getClickedThruRatio().hashCode();
        }
        if (this.getResponded() != null) {
            _hashCode += this.getResponded().hashCode();
        }
        if (this.getRespondedRatio() != null) {
            _hashCode += this.getRespondedRatio().hashCode();
        }
        if (this.getUnsubscribed() != null) {
            _hashCode += this.getUnsubscribed().hashCode();
        }
        if (this.getUnsubscribedRatio() != null) {
            _hashCode += this.getUnsubscribedRatio().hashCode();
        }
        if (this.getBounced() != null) {
            _hashCode += this.getBounced().hashCode();
        }
        if (this.getBouncedRatio() != null) {
            _hashCode += this.getBouncedRatio().hashCode();
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
        typeDesc.setXmlType(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "CampaignEventResponse"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "name"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "type"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("dateSent");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "dateSent"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("sent");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "sent"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("opened");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "opened"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("openedRatio");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "openedRatio"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("clickedThru");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "clickedThru"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("clickedThruRatio");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "clickedThruRatio"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("responded");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "responded"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("respondedRatio");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "respondedRatio"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("unsubscribed");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "unsubscribed"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("unsubscribedRatio");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "unsubscribedRatio"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("bounced");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "bounced"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("bouncedRatio");
        elemField.setXmlName(new QName("urn:marketing_2022_1.lists.webservices.netsuite.com", "bouncedRatio"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

