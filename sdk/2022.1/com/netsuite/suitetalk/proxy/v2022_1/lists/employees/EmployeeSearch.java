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
package com.netsuite.suitetalk.proxy.v2022_1.lists.employees;

import com.netsuite.suitetalk.proxy.v2022_1.platform.common.CampaignSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.ChargeSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.CustomSearchJoin;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.DepartmentSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.EmployeeSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.FileSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.HcmJobSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.JobSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.LocationSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.MessageSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.NoteSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.ResourceAllocationSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.SubsidiarySearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.TimeBillSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.TransactionSearchBasic;
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

public class EmployeeSearch
extends SearchRecord
implements Serializable {
    private EmployeeSearchBasic basic;
    private CampaignSearchBasic campaignResponseJoin;
    private ChargeSearchBasic chargeJoin;
    private DepartmentSearchBasic departmentJoin;
    private FileSearchBasic fileJoin;
    private HcmJobSearchBasic hcmJobJoin;
    private LocationSearchBasic locationJoin;
    private JobSearchBasic managedJobJoin;
    private MessageSearchBasic messagesJoin;
    private MessageSearchBasic messagesFromJoin;
    private MessageSearchBasic messagesToJoin;
    private ResourceAllocationSearchBasic resourceAllocationJoin;
    private SubsidiarySearchBasic subsidiaryJoin;
    private TimeBillSearchBasic timeJoin;
    private TransactionSearchBasic transactionJoin;
    private EmployeeSearchBasic userJoin;
    private NoteSearchBasic userNotesJoin;
    private CustomSearchJoin[] customSearchJoin;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(EmployeeSearch.class, true);

    public EmployeeSearch() {
    }

    public EmployeeSearch(EmployeeSearchBasic basic, CampaignSearchBasic campaignResponseJoin, ChargeSearchBasic chargeJoin, DepartmentSearchBasic departmentJoin, FileSearchBasic fileJoin, HcmJobSearchBasic hcmJobJoin, LocationSearchBasic locationJoin, JobSearchBasic managedJobJoin, MessageSearchBasic messagesJoin, MessageSearchBasic messagesFromJoin, MessageSearchBasic messagesToJoin, ResourceAllocationSearchBasic resourceAllocationJoin, SubsidiarySearchBasic subsidiaryJoin, TimeBillSearchBasic timeJoin, TransactionSearchBasic transactionJoin, EmployeeSearchBasic userJoin, NoteSearchBasic userNotesJoin, CustomSearchJoin[] customSearchJoin) {
        this.basic = basic;
        this.campaignResponseJoin = campaignResponseJoin;
        this.chargeJoin = chargeJoin;
        this.departmentJoin = departmentJoin;
        this.fileJoin = fileJoin;
        this.hcmJobJoin = hcmJobJoin;
        this.locationJoin = locationJoin;
        this.managedJobJoin = managedJobJoin;
        this.messagesJoin = messagesJoin;
        this.messagesFromJoin = messagesFromJoin;
        this.messagesToJoin = messagesToJoin;
        this.resourceAllocationJoin = resourceAllocationJoin;
        this.subsidiaryJoin = subsidiaryJoin;
        this.timeJoin = timeJoin;
        this.transactionJoin = transactionJoin;
        this.userJoin = userJoin;
        this.userNotesJoin = userNotesJoin;
        this.customSearchJoin = customSearchJoin;
    }

    public EmployeeSearchBasic getBasic() {
        return this.basic;
    }

    public void setBasic(EmployeeSearchBasic basic) {
        this.basic = basic;
    }

    public CampaignSearchBasic getCampaignResponseJoin() {
        return this.campaignResponseJoin;
    }

    public void setCampaignResponseJoin(CampaignSearchBasic campaignResponseJoin) {
        this.campaignResponseJoin = campaignResponseJoin;
    }

    public ChargeSearchBasic getChargeJoin() {
        return this.chargeJoin;
    }

    public void setChargeJoin(ChargeSearchBasic chargeJoin) {
        this.chargeJoin = chargeJoin;
    }

    public DepartmentSearchBasic getDepartmentJoin() {
        return this.departmentJoin;
    }

    public void setDepartmentJoin(DepartmentSearchBasic departmentJoin) {
        this.departmentJoin = departmentJoin;
    }

    public FileSearchBasic getFileJoin() {
        return this.fileJoin;
    }

    public void setFileJoin(FileSearchBasic fileJoin) {
        this.fileJoin = fileJoin;
    }

    public HcmJobSearchBasic getHcmJobJoin() {
        return this.hcmJobJoin;
    }

    public void setHcmJobJoin(HcmJobSearchBasic hcmJobJoin) {
        this.hcmJobJoin = hcmJobJoin;
    }

    public LocationSearchBasic getLocationJoin() {
        return this.locationJoin;
    }

    public void setLocationJoin(LocationSearchBasic locationJoin) {
        this.locationJoin = locationJoin;
    }

    public JobSearchBasic getManagedJobJoin() {
        return this.managedJobJoin;
    }

    public void setManagedJobJoin(JobSearchBasic managedJobJoin) {
        this.managedJobJoin = managedJobJoin;
    }

    public MessageSearchBasic getMessagesJoin() {
        return this.messagesJoin;
    }

    public void setMessagesJoin(MessageSearchBasic messagesJoin) {
        this.messagesJoin = messagesJoin;
    }

    public MessageSearchBasic getMessagesFromJoin() {
        return this.messagesFromJoin;
    }

    public void setMessagesFromJoin(MessageSearchBasic messagesFromJoin) {
        this.messagesFromJoin = messagesFromJoin;
    }

    public MessageSearchBasic getMessagesToJoin() {
        return this.messagesToJoin;
    }

    public void setMessagesToJoin(MessageSearchBasic messagesToJoin) {
        this.messagesToJoin = messagesToJoin;
    }

    public ResourceAllocationSearchBasic getResourceAllocationJoin() {
        return this.resourceAllocationJoin;
    }

    public void setResourceAllocationJoin(ResourceAllocationSearchBasic resourceAllocationJoin) {
        this.resourceAllocationJoin = resourceAllocationJoin;
    }

    public SubsidiarySearchBasic getSubsidiaryJoin() {
        return this.subsidiaryJoin;
    }

    public void setSubsidiaryJoin(SubsidiarySearchBasic subsidiaryJoin) {
        this.subsidiaryJoin = subsidiaryJoin;
    }

    public TimeBillSearchBasic getTimeJoin() {
        return this.timeJoin;
    }

    public void setTimeJoin(TimeBillSearchBasic timeJoin) {
        this.timeJoin = timeJoin;
    }

    public TransactionSearchBasic getTransactionJoin() {
        return this.transactionJoin;
    }

    public void setTransactionJoin(TransactionSearchBasic transactionJoin) {
        this.transactionJoin = transactionJoin;
    }

    public EmployeeSearchBasic getUserJoin() {
        return this.userJoin;
    }

    public void setUserJoin(EmployeeSearchBasic userJoin) {
        this.userJoin = userJoin;
    }

    public NoteSearchBasic getUserNotesJoin() {
        return this.userNotesJoin;
    }

    public void setUserNotesJoin(NoteSearchBasic userNotesJoin) {
        this.userNotesJoin = userNotesJoin;
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
        if (!(obj instanceof EmployeeSearch)) {
            return false;
        }
        EmployeeSearch other = (EmployeeSearch)obj;
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
        boolean _equals = super.equals(obj) && (this.basic == null && other.getBasic() == null || this.basic != null && this.basic.equals(other.getBasic())) && (this.campaignResponseJoin == null && other.getCampaignResponseJoin() == null || this.campaignResponseJoin != null && this.campaignResponseJoin.equals(other.getCampaignResponseJoin())) && (this.chargeJoin == null && other.getChargeJoin() == null || this.chargeJoin != null && this.chargeJoin.equals(other.getChargeJoin())) && (this.departmentJoin == null && other.getDepartmentJoin() == null || this.departmentJoin != null && this.departmentJoin.equals(other.getDepartmentJoin())) && (this.fileJoin == null && other.getFileJoin() == null || this.fileJoin != null && this.fileJoin.equals(other.getFileJoin())) && (this.hcmJobJoin == null && other.getHcmJobJoin() == null || this.hcmJobJoin != null && this.hcmJobJoin.equals(other.getHcmJobJoin())) && (this.locationJoin == null && other.getLocationJoin() == null || this.locationJoin != null && this.locationJoin.equals(other.getLocationJoin())) && (this.managedJobJoin == null && other.getManagedJobJoin() == null || this.managedJobJoin != null && this.managedJobJoin.equals(other.getManagedJobJoin())) && (this.messagesJoin == null && other.getMessagesJoin() == null || this.messagesJoin != null && this.messagesJoin.equals(other.getMessagesJoin())) && (this.messagesFromJoin == null && other.getMessagesFromJoin() == null || this.messagesFromJoin != null && this.messagesFromJoin.equals(other.getMessagesFromJoin())) && (this.messagesToJoin == null && other.getMessagesToJoin() == null || this.messagesToJoin != null && this.messagesToJoin.equals(other.getMessagesToJoin())) && (this.resourceAllocationJoin == null && other.getResourceAllocationJoin() == null || this.resourceAllocationJoin != null && this.resourceAllocationJoin.equals(other.getResourceAllocationJoin())) && (this.subsidiaryJoin == null && other.getSubsidiaryJoin() == null || this.subsidiaryJoin != null && this.subsidiaryJoin.equals(other.getSubsidiaryJoin())) && (this.timeJoin == null && other.getTimeJoin() == null || this.timeJoin != null && this.timeJoin.equals(other.getTimeJoin())) && (this.transactionJoin == null && other.getTransactionJoin() == null || this.transactionJoin != null && this.transactionJoin.equals(other.getTransactionJoin())) && (this.userJoin == null && other.getUserJoin() == null || this.userJoin != null && this.userJoin.equals(other.getUserJoin())) && (this.userNotesJoin == null && other.getUserNotesJoin() == null || this.userNotesJoin != null && this.userNotesJoin.equals(other.getUserNotesJoin())) && (this.customSearchJoin == null && other.getCustomSearchJoin() == null || this.customSearchJoin != null && Arrays.equals(this.customSearchJoin, other.getCustomSearchJoin()));
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
        if (this.getCampaignResponseJoin() != null) {
            _hashCode += this.getCampaignResponseJoin().hashCode();
        }
        if (this.getChargeJoin() != null) {
            _hashCode += this.getChargeJoin().hashCode();
        }
        if (this.getDepartmentJoin() != null) {
            _hashCode += this.getDepartmentJoin().hashCode();
        }
        if (this.getFileJoin() != null) {
            _hashCode += this.getFileJoin().hashCode();
        }
        if (this.getHcmJobJoin() != null) {
            _hashCode += this.getHcmJobJoin().hashCode();
        }
        if (this.getLocationJoin() != null) {
            _hashCode += this.getLocationJoin().hashCode();
        }
        if (this.getManagedJobJoin() != null) {
            _hashCode += this.getManagedJobJoin().hashCode();
        }
        if (this.getMessagesJoin() != null) {
            _hashCode += this.getMessagesJoin().hashCode();
        }
        if (this.getMessagesFromJoin() != null) {
            _hashCode += this.getMessagesFromJoin().hashCode();
        }
        if (this.getMessagesToJoin() != null) {
            _hashCode += this.getMessagesToJoin().hashCode();
        }
        if (this.getResourceAllocationJoin() != null) {
            _hashCode += this.getResourceAllocationJoin().hashCode();
        }
        if (this.getSubsidiaryJoin() != null) {
            _hashCode += this.getSubsidiaryJoin().hashCode();
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
        typeDesc.setXmlType(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "EmployeeSearch"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "EmployeeSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("campaignResponseJoin");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "campaignResponseJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "CampaignSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("chargeJoin");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "chargeJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ChargeSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("departmentJoin");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "departmentJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "DepartmentSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fileJoin");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "fileJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "FileSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("hcmJobJoin");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "hcmJobJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "HcmJobSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationJoin");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "locationJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "LocationSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("managedJobJoin");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "managedJobJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "JobSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("messagesJoin");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "messagesJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "MessageSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("messagesFromJoin");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "messagesFromJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "MessageSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("messagesToJoin");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "messagesToJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "MessageSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("resourceAllocationJoin");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "resourceAllocationJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ResourceAllocationSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subsidiaryJoin");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "subsidiaryJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "SubsidiarySearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("timeJoin");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "timeJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TimeBillSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("transactionJoin");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "transactionJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TransactionSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("userJoin");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "userJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "EmployeeSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("userNotesJoin");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "userNotesJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "NoteSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customSearchJoin");
        elemField.setXmlName(new QName("urn:employees_2022_1.lists.webservices.netsuite.com", "customSearchJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "CustomSearchJoin"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

