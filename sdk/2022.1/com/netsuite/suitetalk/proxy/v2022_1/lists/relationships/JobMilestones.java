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
package com.netsuite.suitetalk.proxy.v2022_1.lists.relationships;

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

public class JobMilestones
implements Serializable {
    private String milestoneName;
    private String milestoneOrder;
    private Calendar milestoneEstComplete;
    private Boolean milestoneCompleted;
    private String milestoneComments;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(JobMilestones.class, true);

    public JobMilestones() {
    }

    public JobMilestones(String milestoneName, String milestoneOrder, Calendar milestoneEstComplete, Boolean milestoneCompleted, String milestoneComments) {
        this.milestoneName = milestoneName;
        this.milestoneOrder = milestoneOrder;
        this.milestoneEstComplete = milestoneEstComplete;
        this.milestoneCompleted = milestoneCompleted;
        this.milestoneComments = milestoneComments;
    }

    public String getMilestoneName() {
        return this.milestoneName;
    }

    public void setMilestoneName(String milestoneName) {
        this.milestoneName = milestoneName;
    }

    public String getMilestoneOrder() {
        return this.milestoneOrder;
    }

    public void setMilestoneOrder(String milestoneOrder) {
        this.milestoneOrder = milestoneOrder;
    }

    public Calendar getMilestoneEstComplete() {
        return this.milestoneEstComplete;
    }

    public void setMilestoneEstComplete(Calendar milestoneEstComplete) {
        this.milestoneEstComplete = milestoneEstComplete;
    }

    public Boolean getMilestoneCompleted() {
        return this.milestoneCompleted;
    }

    public void setMilestoneCompleted(Boolean milestoneCompleted) {
        this.milestoneCompleted = milestoneCompleted;
    }

    public String getMilestoneComments() {
        return this.milestoneComments;
    }

    public void setMilestoneComments(String milestoneComments) {
        this.milestoneComments = milestoneComments;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof JobMilestones)) {
            return false;
        }
        JobMilestones other = (JobMilestones)obj;
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
        boolean _equals = (this.milestoneName == null && other.getMilestoneName() == null || this.milestoneName != null && this.milestoneName.equals(other.getMilestoneName())) && (this.milestoneOrder == null && other.getMilestoneOrder() == null || this.milestoneOrder != null && this.milestoneOrder.equals(other.getMilestoneOrder())) && (this.milestoneEstComplete == null && other.getMilestoneEstComplete() == null || this.milestoneEstComplete != null && this.milestoneEstComplete.equals(other.getMilestoneEstComplete())) && (this.milestoneCompleted == null && other.getMilestoneCompleted() == null || this.milestoneCompleted != null && this.milestoneCompleted.equals(other.getMilestoneCompleted())) && (this.milestoneComments == null && other.getMilestoneComments() == null || this.milestoneComments != null && this.milestoneComments.equals(other.getMilestoneComments()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getMilestoneName() != null) {
            _hashCode += this.getMilestoneName().hashCode();
        }
        if (this.getMilestoneOrder() != null) {
            _hashCode += this.getMilestoneOrder().hashCode();
        }
        if (this.getMilestoneEstComplete() != null) {
            _hashCode += this.getMilestoneEstComplete().hashCode();
        }
        if (this.getMilestoneCompleted() != null) {
            _hashCode += this.getMilestoneCompleted().hashCode();
        }
        if (this.getMilestoneComments() != null) {
            _hashCode += this.getMilestoneComments().hashCode();
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
        typeDesc.setXmlType(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "JobMilestones"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("milestoneName");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "milestoneName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("milestoneOrder");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "milestoneOrder"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("milestoneEstComplete");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "milestoneEstComplete"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("milestoneCompleted");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "milestoneCompleted"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("milestoneComments");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "milestoneComments"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

