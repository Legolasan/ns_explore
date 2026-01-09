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

import com.netsuite.suitetalk.proxy.v2022_1.platform.common.CustomSearchJoin;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.CustomerSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.EmployeeSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.EntitySearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.JobSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.ProjectTaskSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.ResourceAllocationSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.VendorSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchRecord;
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

public class ResourceAllocationSearch
extends SearchRecord
implements Serializable {
    private ResourceAllocationSearchBasic basic;
    private CustomerSearchBasic customerJoin;
    private EmployeeSearchBasic employeeJoin;
    private JobSearchBasic jobJoin;
    private ProjectTaskSearchBasic projectTaskJoin;
    private EntitySearchBasic requestedByJoin;
    private EntitySearchBasic resourceJoin;
    private EmployeeSearchBasic userJoin;
    private VendorSearchBasic vendorJoin;
    private CustomSearchJoin[] customSearchJoin;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(ResourceAllocationSearch.class, true);

    public ResourceAllocationSearch() {
    }

    public ResourceAllocationSearch(ResourceAllocationSearchBasic basic, CustomerSearchBasic customerJoin, EmployeeSearchBasic employeeJoin, JobSearchBasic jobJoin, ProjectTaskSearchBasic projectTaskJoin, EntitySearchBasic requestedByJoin, EntitySearchBasic resourceJoin, EmployeeSearchBasic userJoin, VendorSearchBasic vendorJoin, CustomSearchJoin[] customSearchJoin) {
        this.basic = basic;
        this.customerJoin = customerJoin;
        this.employeeJoin = employeeJoin;
        this.jobJoin = jobJoin;
        this.projectTaskJoin = projectTaskJoin;
        this.requestedByJoin = requestedByJoin;
        this.resourceJoin = resourceJoin;
        this.userJoin = userJoin;
        this.vendorJoin = vendorJoin;
        this.customSearchJoin = customSearchJoin;
    }

    public ResourceAllocationSearchBasic getBasic() {
        return this.basic;
    }

    public void setBasic(ResourceAllocationSearchBasic basic) {
        this.basic = basic;
    }

    public CustomerSearchBasic getCustomerJoin() {
        return this.customerJoin;
    }

    public void setCustomerJoin(CustomerSearchBasic customerJoin) {
        this.customerJoin = customerJoin;
    }

    public EmployeeSearchBasic getEmployeeJoin() {
        return this.employeeJoin;
    }

    public void setEmployeeJoin(EmployeeSearchBasic employeeJoin) {
        this.employeeJoin = employeeJoin;
    }

    public JobSearchBasic getJobJoin() {
        return this.jobJoin;
    }

    public void setJobJoin(JobSearchBasic jobJoin) {
        this.jobJoin = jobJoin;
    }

    public ProjectTaskSearchBasic getProjectTaskJoin() {
        return this.projectTaskJoin;
    }

    public void setProjectTaskJoin(ProjectTaskSearchBasic projectTaskJoin) {
        this.projectTaskJoin = projectTaskJoin;
    }

    public EntitySearchBasic getRequestedByJoin() {
        return this.requestedByJoin;
    }

    public void setRequestedByJoin(EntitySearchBasic requestedByJoin) {
        this.requestedByJoin = requestedByJoin;
    }

    public EntitySearchBasic getResourceJoin() {
        return this.resourceJoin;
    }

    public void setResourceJoin(EntitySearchBasic resourceJoin) {
        this.resourceJoin = resourceJoin;
    }

    public EmployeeSearchBasic getUserJoin() {
        return this.userJoin;
    }

    public void setUserJoin(EmployeeSearchBasic userJoin) {
        this.userJoin = userJoin;
    }

    public VendorSearchBasic getVendorJoin() {
        return this.vendorJoin;
    }

    public void setVendorJoin(VendorSearchBasic vendorJoin) {
        this.vendorJoin = vendorJoin;
    }

    public CustomSearchJoin[] getCustomSearchJoin() {
        return this.customSearchJoin;
    }

    public void setCustomSearchJoin(CustomSearchJoin[] customSearchJoin) {
        this.customSearchJoin = customSearchJoin;
    }

    public CustomSearchJoin getCustomSearchJoin(int i) {
        return this.customSearchJoin[i];
    }

    public void setCustomSearchJoin(int i, CustomSearchJoin _value) {
        this.customSearchJoin[i] = _value;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ResourceAllocationSearch)) {
            return false;
        }
        ResourceAllocationSearch other = (ResourceAllocationSearch)obj;
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
        boolean _equals = super.equals(obj) && (this.basic == null && other.getBasic() == null || this.basic != null && this.basic.equals(other.getBasic())) && (this.customerJoin == null && other.getCustomerJoin() == null || this.customerJoin != null && this.customerJoin.equals(other.getCustomerJoin())) && (this.employeeJoin == null && other.getEmployeeJoin() == null || this.employeeJoin != null && this.employeeJoin.equals(other.getEmployeeJoin())) && (this.jobJoin == null && other.getJobJoin() == null || this.jobJoin != null && this.jobJoin.equals(other.getJobJoin())) && (this.projectTaskJoin == null && other.getProjectTaskJoin() == null || this.projectTaskJoin != null && this.projectTaskJoin.equals(other.getProjectTaskJoin())) && (this.requestedByJoin == null && other.getRequestedByJoin() == null || this.requestedByJoin != null && this.requestedByJoin.equals(other.getRequestedByJoin())) && (this.resourceJoin == null && other.getResourceJoin() == null || this.resourceJoin != null && this.resourceJoin.equals(other.getResourceJoin())) && (this.userJoin == null && other.getUserJoin() == null || this.userJoin != null && this.userJoin.equals(other.getUserJoin())) && (this.vendorJoin == null && other.getVendorJoin() == null || this.vendorJoin != null && this.vendorJoin.equals(other.getVendorJoin())) && (this.customSearchJoin == null && other.getCustomSearchJoin() == null || this.customSearchJoin != null && Arrays.equals(this.customSearchJoin, other.getCustomSearchJoin()));
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
        if (this.getCustomerJoin() != null) {
            _hashCode += this.getCustomerJoin().hashCode();
        }
        if (this.getEmployeeJoin() != null) {
            _hashCode += this.getEmployeeJoin().hashCode();
        }
        if (this.getJobJoin() != null) {
            _hashCode += this.getJobJoin().hashCode();
        }
        if (this.getProjectTaskJoin() != null) {
            _hashCode += this.getProjectTaskJoin().hashCode();
        }
        if (this.getRequestedByJoin() != null) {
            _hashCode += this.getRequestedByJoin().hashCode();
        }
        if (this.getResourceJoin() != null) {
            _hashCode += this.getResourceJoin().hashCode();
        }
        if (this.getUserJoin() != null) {
            _hashCode += this.getUserJoin().hashCode();
        }
        if (this.getVendorJoin() != null) {
            _hashCode += this.getVendorJoin().hashCode();
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
        typeDesc.setXmlType(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "ResourceAllocationSearch"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ResourceAllocationSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customerJoin");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "customerJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "CustomerSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("employeeJoin");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "employeeJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "EmployeeSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("jobJoin");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "jobJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "JobSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("projectTaskJoin");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "projectTaskJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ProjectTaskSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("requestedByJoin");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "requestedByJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "EntitySearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("resourceJoin");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "resourceJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "EntitySearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("userJoin");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "userJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "EmployeeSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vendorJoin");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "vendorJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "VendorSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customSearchJoin");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "customSearchJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "CustomSearchJoin"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

