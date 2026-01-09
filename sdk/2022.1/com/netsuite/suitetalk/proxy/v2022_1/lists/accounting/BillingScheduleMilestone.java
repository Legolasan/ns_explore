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
package com.netsuite.suitetalk.proxy.v2022_1.lists.accounting;

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
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

public class BillingScheduleMilestone
implements Serializable {
    private Long milestoneId;
    private Double milestoneAmount;
    private RecordRef milestoneTerms;
    private RecordRef projectTask;
    private Calendar milestoneDate;
    private Boolean milestoneCompleted;
    private Calendar milestoneActualCompletionDate;
    private String comments;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(BillingScheduleMilestone.class, true);

    public BillingScheduleMilestone() {
    }

    public BillingScheduleMilestone(Long milestoneId, Double milestoneAmount, RecordRef milestoneTerms, RecordRef projectTask, Calendar milestoneDate, Boolean milestoneCompleted, Calendar milestoneActualCompletionDate, String comments) {
        this.milestoneId = milestoneId;
        this.milestoneAmount = milestoneAmount;
        this.milestoneTerms = milestoneTerms;
        this.projectTask = projectTask;
        this.milestoneDate = milestoneDate;
        this.milestoneCompleted = milestoneCompleted;
        this.milestoneActualCompletionDate = milestoneActualCompletionDate;
        this.comments = comments;
    }

    public Long getMilestoneId() {
        return this.milestoneId;
    }

    public void setMilestoneId(Long milestoneId) {
        this.milestoneId = milestoneId;
    }

    public Double getMilestoneAmount() {
        return this.milestoneAmount;
    }

    public void setMilestoneAmount(Double milestoneAmount) {
        this.milestoneAmount = milestoneAmount;
    }

    public RecordRef getMilestoneTerms() {
        return this.milestoneTerms;
    }

    public void setMilestoneTerms(RecordRef milestoneTerms) {
        this.milestoneTerms = milestoneTerms;
    }

    public RecordRef getProjectTask() {
        return this.projectTask;
    }

    public void setProjectTask(RecordRef projectTask) {
        this.projectTask = projectTask;
    }

    public Calendar getMilestoneDate() {
        return this.milestoneDate;
    }

    public void setMilestoneDate(Calendar milestoneDate) {
        this.milestoneDate = milestoneDate;
    }

    public Boolean getMilestoneCompleted() {
        return this.milestoneCompleted;
    }

    public void setMilestoneCompleted(Boolean milestoneCompleted) {
        this.milestoneCompleted = milestoneCompleted;
    }

    public Calendar getMilestoneActualCompletionDate() {
        return this.milestoneActualCompletionDate;
    }

    public void setMilestoneActualCompletionDate(Calendar milestoneActualCompletionDate) {
        this.milestoneActualCompletionDate = milestoneActualCompletionDate;
    }

    public String getComments() {
        return this.comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof BillingScheduleMilestone)) {
            return false;
        }
        BillingScheduleMilestone other = (BillingScheduleMilestone)obj;
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
        boolean _equals = (this.milestoneId == null && other.getMilestoneId() == null || this.milestoneId != null && this.milestoneId.equals(other.getMilestoneId())) && (this.milestoneAmount == null && other.getMilestoneAmount() == null || this.milestoneAmount != null && this.milestoneAmount.equals(other.getMilestoneAmount())) && (this.milestoneTerms == null && other.getMilestoneTerms() == null || this.milestoneTerms != null && this.milestoneTerms.equals(other.getMilestoneTerms())) && (this.projectTask == null && other.getProjectTask() == null || this.projectTask != null && this.projectTask.equals(other.getProjectTask())) && (this.milestoneDate == null && other.getMilestoneDate() == null || this.milestoneDate != null && this.milestoneDate.equals(other.getMilestoneDate())) && (this.milestoneCompleted == null && other.getMilestoneCompleted() == null || this.milestoneCompleted != null && this.milestoneCompleted.equals(other.getMilestoneCompleted())) && (this.milestoneActualCompletionDate == null && other.getMilestoneActualCompletionDate() == null || this.milestoneActualCompletionDate != null && this.milestoneActualCompletionDate.equals(other.getMilestoneActualCompletionDate())) && (this.comments == null && other.getComments() == null || this.comments != null && this.comments.equals(other.getComments()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getMilestoneId() != null) {
            _hashCode += this.getMilestoneId().hashCode();
        }
        if (this.getMilestoneAmount() != null) {
            _hashCode += this.getMilestoneAmount().hashCode();
        }
        if (this.getMilestoneTerms() != null) {
            _hashCode += this.getMilestoneTerms().hashCode();
        }
        if (this.getProjectTask() != null) {
            _hashCode += this.getProjectTask().hashCode();
        }
        if (this.getMilestoneDate() != null) {
            _hashCode += this.getMilestoneDate().hashCode();
        }
        if (this.getMilestoneCompleted() != null) {
            _hashCode += this.getMilestoneCompleted().hashCode();
        }
        if (this.getMilestoneActualCompletionDate() != null) {
            _hashCode += this.getMilestoneActualCompletionDate().hashCode();
        }
        if (this.getComments() != null) {
            _hashCode += this.getComments().hashCode();
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
        typeDesc.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "BillingScheduleMilestone"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("milestoneId");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "milestoneId"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("milestoneAmount");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "milestoneAmount"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("milestoneTerms");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "milestoneTerms"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("projectTask");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "projectTask"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("milestoneDate");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "milestoneDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("milestoneCompleted");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "milestoneCompleted"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("milestoneActualCompletionDate");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "milestoneActualCompletionDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("comments");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "comments"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

