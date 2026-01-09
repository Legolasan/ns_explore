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
package com.netsuite.suitetalk.proxy.v2022_1.activities.scheduling;

import com.netsuite.suitetalk.proxy.v2022_1.platform.common.CustomSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.EmployeeSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.JobSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.NoteSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.ProjectTaskAssignmentSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.ProjectTaskSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.ResourceAllocationSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.TimeBillSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.TransactionSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchRow;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class ProjectTaskSearchRow
extends SearchRow
implements Serializable {
    private ProjectTaskSearchRowBasic basic;
    private JobSearchRowBasic jobJoin;
    private ProjectTaskSearchRowBasic predecessorJoin;
    private ProjectTaskAssignmentSearchRowBasic projectTaskAssignmentJoin;
    private ResourceAllocationSearchRowBasic resourceAllocationJoin;
    private ProjectTaskSearchRowBasic successorJoin;
    private TimeBillSearchRowBasic timeJoin;
    private TransactionSearchRowBasic transactionJoin;
    private EmployeeSearchRowBasic userJoin;
    private NoteSearchRowBasic userNotesJoin;
    private CustomSearchRowBasic[] customSearchJoin;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(ProjectTaskSearchRow.class, true);

    public ProjectTaskSearchRow() {
    }

    public ProjectTaskSearchRow(ProjectTaskSearchRowBasic basic, JobSearchRowBasic jobJoin, ProjectTaskSearchRowBasic predecessorJoin, ProjectTaskAssignmentSearchRowBasic projectTaskAssignmentJoin, ResourceAllocationSearchRowBasic resourceAllocationJoin, ProjectTaskSearchRowBasic successorJoin, TimeBillSearchRowBasic timeJoin, TransactionSearchRowBasic transactionJoin, EmployeeSearchRowBasic userJoin, NoteSearchRowBasic userNotesJoin, CustomSearchRowBasic[] customSearchJoin) {
        this.basic = basic;
        this.jobJoin = jobJoin;
        this.predecessorJoin = predecessorJoin;
        this.projectTaskAssignmentJoin = projectTaskAssignmentJoin;
        this.resourceAllocationJoin = resourceAllocationJoin;
        this.successorJoin = successorJoin;
        this.timeJoin = timeJoin;
        this.transactionJoin = transactionJoin;
        this.userJoin = userJoin;
        this.userNotesJoin = userNotesJoin;
        this.customSearchJoin = customSearchJoin;
    }

    public ProjectTaskSearchRowBasic getBasic() {
        return this.basic;
    }

    public void setBasic(ProjectTaskSearchRowBasic basic) {
        this.basic = basic;
    }

    public JobSearchRowBasic getJobJoin() {
        return this.jobJoin;
    }

    public void setJobJoin(JobSearchRowBasic jobJoin) {
        this.jobJoin = jobJoin;
    }

    public ProjectTaskSearchRowBasic getPredecessorJoin() {
        return this.predecessorJoin;
    }

    public void setPredecessorJoin(ProjectTaskSearchRowBasic predecessorJoin) {
        this.predecessorJoin = predecessorJoin;
    }

    public ProjectTaskAssignmentSearchRowBasic getProjectTaskAssignmentJoin() {
        return this.projectTaskAssignmentJoin;
    }

    public void setProjectTaskAssignmentJoin(ProjectTaskAssignmentSearchRowBasic projectTaskAssignmentJoin) {
        this.projectTaskAssignmentJoin = projectTaskAssignmentJoin;
    }

    public ResourceAllocationSearchRowBasic getResourceAllocationJoin() {
        return this.resourceAllocationJoin;
    }

    public void setResourceAllocationJoin(ResourceAllocationSearchRowBasic resourceAllocationJoin) {
        this.resourceAllocationJoin = resourceAllocationJoin;
    }

    public ProjectTaskSearchRowBasic getSuccessorJoin() {
        return this.successorJoin;
    }

    public void setSuccessorJoin(ProjectTaskSearchRowBasic successorJoin) {
        this.successorJoin = successorJoin;
    }

    public TimeBillSearchRowBasic getTimeJoin() {
        return this.timeJoin;
    }

    public void setTimeJoin(TimeBillSearchRowBasic timeJoin) {
        this.timeJoin = timeJoin;
    }

    public TransactionSearchRowBasic getTransactionJoin() {
        return this.transactionJoin;
    }

    public void setTransactionJoin(TransactionSearchRowBasic transactionJoin) {
        this.transactionJoin = transactionJoin;
    }

    public EmployeeSearchRowBasic getUserJoin() {
        return this.userJoin;
    }

    public void setUserJoin(EmployeeSearchRowBasic userJoin) {
        this.userJoin = userJoin;
    }

    public NoteSearchRowBasic getUserNotesJoin() {
        return this.userNotesJoin;
    }

    public void setUserNotesJoin(NoteSearchRowBasic userNotesJoin) {
        this.userNotesJoin = userNotesJoin;
    }

    public CustomSearchRowBasic[] getCustomSearchJoin() {
        return this.customSearchJoin;
    }

    public void setCustomSearchJoin(CustomSearchRowBasic[] customSearchJoin) {
        this.customSearchJoin = customSearchJoin;
    }

    public CustomSearchRowBasic getCustomSearchJoin(int i) {
        return this.customSearchJoin[i];
    }

    public void setCustomSearchJoin(int i, CustomSearchRowBasic _value) {
        this.customSearchJoin[i] = _value;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ProjectTaskSearchRow)) {
            return false;
        }
        ProjectTaskSearchRow other = (ProjectTaskSearchRow)obj;
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
        boolean _equals = super.equals(obj) && (this.basic == null && other.getBasic() == null || this.basic != null && this.basic.equals(other.getBasic())) && (this.jobJoin == null && other.getJobJoin() == null || this.jobJoin != null && this.jobJoin.equals(other.getJobJoin())) && (this.predecessorJoin == null && other.getPredecessorJoin() == null || this.predecessorJoin != null && this.predecessorJoin.equals(other.getPredecessorJoin())) && (this.projectTaskAssignmentJoin == null && other.getProjectTaskAssignmentJoin() == null || this.projectTaskAssignmentJoin != null && this.projectTaskAssignmentJoin.equals(other.getProjectTaskAssignmentJoin())) && (this.resourceAllocationJoin == null && other.getResourceAllocationJoin() == null || this.resourceAllocationJoin != null && this.resourceAllocationJoin.equals(other.getResourceAllocationJoin())) && (this.successorJoin == null && other.getSuccessorJoin() == null || this.successorJoin != null && this.successorJoin.equals(other.getSuccessorJoin())) && (this.timeJoin == null && other.getTimeJoin() == null || this.timeJoin != null && this.timeJoin.equals(other.getTimeJoin())) && (this.transactionJoin == null && other.getTransactionJoin() == null || this.transactionJoin != null && this.transactionJoin.equals(other.getTransactionJoin())) && (this.userJoin == null && other.getUserJoin() == null || this.userJoin != null && this.userJoin.equals(other.getUserJoin())) && (this.userNotesJoin == null && other.getUserNotesJoin() == null || this.userNotesJoin != null && this.userNotesJoin.equals(other.getUserNotesJoin())) && (this.customSearchJoin == null && other.getCustomSearchJoin() == null || this.customSearchJoin != null && Arrays.equals(this.customSearchJoin, other.getCustomSearchJoin()));
        this.__equalsCalc = null;
        return _equals;
    }

    @Override
    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (this.getBasic() != null) {
            _hashCode += this.getBasic().hashCode();
        }
        if (this.getJobJoin() != null) {
            _hashCode += this.getJobJoin().hashCode();
        }
        if (this.getPredecessorJoin() != null) {
            _hashCode += this.getPredecessorJoin().hashCode();
        }
        if (this.getProjectTaskAssignmentJoin() != null) {
            _hashCode += this.getProjectTaskAssignmentJoin().hashCode();
        }
        if (this.getResourceAllocationJoin() != null) {
            _hashCode += this.getResourceAllocationJoin().hashCode();
        }
        if (this.getSuccessorJoin() != null) {
            _hashCode += this.getSuccessorJoin().hashCode();
        }
        if (this.getTimeJoin() != null) {
            _hashCode += this.getTimeJoin().hashCode();
        }
        if (this.getTransactionJoin() != null) {
            _hashCode += this.getTransactionJoin().hashCode();
        }
        if (this.getUserJoin() != null) {
            _hashCode += this.getUserJoin().hashCode();
        }
        if (this.getUserNotesJoin() != null) {
            _hashCode += this.getUserNotesJoin().hashCode();
        }
        if (this.getCustomSearchJoin() != null) {
            for (int i = 0; i < Array.getLength(this.getCustomSearchJoin()); ++i) {
                Object obj = Array.get(this.getCustomSearchJoin(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
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
        typeDesc.setXmlType(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "ProjectTaskSearchRow"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ProjectTaskSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("jobJoin");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "jobJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "JobSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("predecessorJoin");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "predecessorJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ProjectTaskSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("projectTaskAssignmentJoin");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "projectTaskAssignmentJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ProjectTaskAssignmentSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("resourceAllocationJoin");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "resourceAllocationJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ResourceAllocationSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("successorJoin");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "successorJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ProjectTaskSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("timeJoin");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "timeJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TimeBillSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("transactionJoin");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "transactionJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("userJoin");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "userJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "EmployeeSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("userNotesJoin");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "userNotesJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "NoteSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customSearchJoin");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "customSearchJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "CustomSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

