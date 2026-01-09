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
package com.netsuite.suitetalk.proxy.v2022_1.general.communication;

import com.netsuite.suitetalk.proxy.v2022_1.platform.common.CalendarEventSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.CampaignSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.ContactSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.CustomSearchJoin;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.CustomerSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.EmployeeSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.EntitySearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.IssueSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.ItemSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.NoteSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.OpportunitySearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.OriginatingLeadSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.PartnerSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.PhoneCallSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.SolutionSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.SupportCaseSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.TaskSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.TransactionSearchBasic;
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

public class NoteSearch
extends SearchRecord
implements Serializable {
    private NoteSearchBasic basic;
    private EmployeeSearchBasic authorJoin;
    private PhoneCallSearchBasic callJoin;
    private CampaignSearchBasic campaignJoin;
    private SupportCaseSearchBasic caseJoin;
    private ContactSearchBasic contactJoin;
    private CustomerSearchBasic customerJoin;
    private EmployeeSearchBasic employeeJoin;
    private EntitySearchBasic entityJoin;
    private CalendarEventSearchBasic eventJoin;
    private IssueSearchBasic issueJoin;
    private ItemSearchBasic itemJoin;
    private OpportunitySearchBasic opportunityJoin;
    private OriginatingLeadSearchBasic originatingLeadJoin;
    private PartnerSearchBasic partnerJoin;
    private SolutionSearchBasic solutionJoin;
    private TaskSearchBasic taskJoin;
    private TransactionSearchBasic transactionJoin;
    private EmployeeSearchBasic userJoin;
    private VendorSearchBasic vendorJoin;
    private CustomSearchJoin[] customSearchJoin;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(NoteSearch.class, true);

    public NoteSearch() {
    }

    public NoteSearch(NoteSearchBasic basic, EmployeeSearchBasic authorJoin, PhoneCallSearchBasic callJoin, CampaignSearchBasic campaignJoin, SupportCaseSearchBasic caseJoin, ContactSearchBasic contactJoin, CustomerSearchBasic customerJoin, EmployeeSearchBasic employeeJoin, EntitySearchBasic entityJoin, CalendarEventSearchBasic eventJoin, IssueSearchBasic issueJoin, ItemSearchBasic itemJoin, OpportunitySearchBasic opportunityJoin, OriginatingLeadSearchBasic originatingLeadJoin, PartnerSearchBasic partnerJoin, SolutionSearchBasic solutionJoin, TaskSearchBasic taskJoin, TransactionSearchBasic transactionJoin, EmployeeSearchBasic userJoin, VendorSearchBasic vendorJoin, CustomSearchJoin[] customSearchJoin) {
        this.basic = basic;
        this.authorJoin = authorJoin;
        this.callJoin = callJoin;
        this.campaignJoin = campaignJoin;
        this.caseJoin = caseJoin;
        this.contactJoin = contactJoin;
        this.customerJoin = customerJoin;
        this.employeeJoin = employeeJoin;
        this.entityJoin = entityJoin;
        this.eventJoin = eventJoin;
        this.issueJoin = issueJoin;
        this.itemJoin = itemJoin;
        this.opportunityJoin = opportunityJoin;
        this.originatingLeadJoin = originatingLeadJoin;
        this.partnerJoin = partnerJoin;
        this.solutionJoin = solutionJoin;
        this.taskJoin = taskJoin;
        this.transactionJoin = transactionJoin;
        this.userJoin = userJoin;
        this.vendorJoin = vendorJoin;
        this.customSearchJoin = customSearchJoin;
    }

    public NoteSearchBasic getBasic() {
        return this.basic;
    }

    public void setBasic(NoteSearchBasic basic) {
        this.basic = basic;
    }

    public EmployeeSearchBasic getAuthorJoin() {
        return this.authorJoin;
    }

    public void setAuthorJoin(EmployeeSearchBasic authorJoin) {
        this.authorJoin = authorJoin;
    }

    public PhoneCallSearchBasic getCallJoin() {
        return this.callJoin;
    }

    public void setCallJoin(PhoneCallSearchBasic callJoin) {
        this.callJoin = callJoin;
    }

    public CampaignSearchBasic getCampaignJoin() {
        return this.campaignJoin;
    }

    public void setCampaignJoin(CampaignSearchBasic campaignJoin) {
        this.campaignJoin = campaignJoin;
    }

    public SupportCaseSearchBasic getCaseJoin() {
        return this.caseJoin;
    }

    public void setCaseJoin(SupportCaseSearchBasic caseJoin) {
        this.caseJoin = caseJoin;
    }

    public ContactSearchBasic getContactJoin() {
        return this.contactJoin;
    }

    public void setContactJoin(ContactSearchBasic contactJoin) {
        this.contactJoin = contactJoin;
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

    public EntitySearchBasic getEntityJoin() {
        return this.entityJoin;
    }

    public void setEntityJoin(EntitySearchBasic entityJoin) {
        this.entityJoin = entityJoin;
    }

    public CalendarEventSearchBasic getEventJoin() {
        return this.eventJoin;
    }

    public void setEventJoin(CalendarEventSearchBasic eventJoin) {
        this.eventJoin = eventJoin;
    }

    public IssueSearchBasic getIssueJoin() {
        return this.issueJoin;
    }

    public void setIssueJoin(IssueSearchBasic issueJoin) {
        this.issueJoin = issueJoin;
    }

    public ItemSearchBasic getItemJoin() {
        return this.itemJoin;
    }

    public void setItemJoin(ItemSearchBasic itemJoin) {
        this.itemJoin = itemJoin;
    }

    public OpportunitySearchBasic getOpportunityJoin() {
        return this.opportunityJoin;
    }

    public void setOpportunityJoin(OpportunitySearchBasic opportunityJoin) {
        this.opportunityJoin = opportunityJoin;
    }

    public OriginatingLeadSearchBasic getOriginatingLeadJoin() {
        return this.originatingLeadJoin;
    }

    public void setOriginatingLeadJoin(OriginatingLeadSearchBasic originatingLeadJoin) {
        this.originatingLeadJoin = originatingLeadJoin;
    }

    public PartnerSearchBasic getPartnerJoin() {
        return this.partnerJoin;
    }

    public void setPartnerJoin(PartnerSearchBasic partnerJoin) {
        this.partnerJoin = partnerJoin;
    }

    public SolutionSearchBasic getSolutionJoin() {
        return this.solutionJoin;
    }

    public void setSolutionJoin(SolutionSearchBasic solutionJoin) {
        this.solutionJoin = solutionJoin;
    }

    public TaskSearchBasic getTaskJoin() {
        return this.taskJoin;
    }

    public void setTaskJoin(TaskSearchBasic taskJoin) {
        this.taskJoin = taskJoin;
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
        if (!(obj instanceof NoteSearch)) {
            return false;
        }
        NoteSearch other = (NoteSearch)obj;
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
        boolean _equals = super.equals(obj) && (this.basic == null && other.getBasic() == null || this.basic != null && this.basic.equals(other.getBasic())) && (this.authorJoin == null && other.getAuthorJoin() == null || this.authorJoin != null && this.authorJoin.equals(other.getAuthorJoin())) && (this.callJoin == null && other.getCallJoin() == null || this.callJoin != null && this.callJoin.equals(other.getCallJoin())) && (this.campaignJoin == null && other.getCampaignJoin() == null || this.campaignJoin != null && this.campaignJoin.equals(other.getCampaignJoin())) && (this.caseJoin == null && other.getCaseJoin() == null || this.caseJoin != null && this.caseJoin.equals(other.getCaseJoin())) && (this.contactJoin == null && other.getContactJoin() == null || this.contactJoin != null && this.contactJoin.equals(other.getContactJoin())) && (this.customerJoin == null && other.getCustomerJoin() == null || this.customerJoin != null && this.customerJoin.equals(other.getCustomerJoin())) && (this.employeeJoin == null && other.getEmployeeJoin() == null || this.employeeJoin != null && this.employeeJoin.equals(other.getEmployeeJoin())) && (this.entityJoin == null && other.getEntityJoin() == null || this.entityJoin != null && this.entityJoin.equals(other.getEntityJoin())) && (this.eventJoin == null && other.getEventJoin() == null || this.eventJoin != null && this.eventJoin.equals(other.getEventJoin())) && (this.issueJoin == null && other.getIssueJoin() == null || this.issueJoin != null && this.issueJoin.equals(other.getIssueJoin())) && (this.itemJoin == null && other.getItemJoin() == null || this.itemJoin != null && this.itemJoin.equals(other.getItemJoin())) && (this.opportunityJoin == null && other.getOpportunityJoin() == null || this.opportunityJoin != null && this.opportunityJoin.equals(other.getOpportunityJoin())) && (this.originatingLeadJoin == null && other.getOriginatingLeadJoin() == null || this.originatingLeadJoin != null && this.originatingLeadJoin.equals(other.getOriginatingLeadJoin())) && (this.partnerJoin == null && other.getPartnerJoin() == null || this.partnerJoin != null && this.partnerJoin.equals(other.getPartnerJoin())) && (this.solutionJoin == null && other.getSolutionJoin() == null || this.solutionJoin != null && this.solutionJoin.equals(other.getSolutionJoin())) && (this.taskJoin == null && other.getTaskJoin() == null || this.taskJoin != null && this.taskJoin.equals(other.getTaskJoin())) && (this.transactionJoin == null && other.getTransactionJoin() == null || this.transactionJoin != null && this.transactionJoin.equals(other.getTransactionJoin())) && (this.userJoin == null && other.getUserJoin() == null || this.userJoin != null && this.userJoin.equals(other.getUserJoin())) && (this.vendorJoin == null && other.getVendorJoin() == null || this.vendorJoin != null && this.vendorJoin.equals(other.getVendorJoin())) && (this.customSearchJoin == null && other.getCustomSearchJoin() == null || this.customSearchJoin != null && Arrays.equals(this.customSearchJoin, other.getCustomSearchJoin()));
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
        if (this.getAuthorJoin() != null) {
            _hashCode += this.getAuthorJoin().hashCode();
        }
        if (this.getCallJoin() != null) {
            _hashCode += this.getCallJoin().hashCode();
        }
        if (this.getCampaignJoin() != null) {
            _hashCode += this.getCampaignJoin().hashCode();
        }
        if (this.getCaseJoin() != null) {
            _hashCode += this.getCaseJoin().hashCode();
        }
        if (this.getContactJoin() != null) {
            _hashCode += this.getContactJoin().hashCode();
        }
        if (this.getCustomerJoin() != null) {
            _hashCode += this.getCustomerJoin().hashCode();
        }
        if (this.getEmployeeJoin() != null) {
            _hashCode += this.getEmployeeJoin().hashCode();
        }
        if (this.getEntityJoin() != null) {
            _hashCode += this.getEntityJoin().hashCode();
        }
        if (this.getEventJoin() != null) {
            _hashCode += this.getEventJoin().hashCode();
        }
        if (this.getIssueJoin() != null) {
            _hashCode += this.getIssueJoin().hashCode();
        }
        if (this.getItemJoin() != null) {
            _hashCode += this.getItemJoin().hashCode();
        }
        if (this.getOpportunityJoin() != null) {
            _hashCode += this.getOpportunityJoin().hashCode();
        }
        if (this.getOriginatingLeadJoin() != null) {
            _hashCode += this.getOriginatingLeadJoin().hashCode();
        }
        if (this.getPartnerJoin() != null) {
            _hashCode += this.getPartnerJoin().hashCode();
        }
        if (this.getSolutionJoin() != null) {
            _hashCode += this.getSolutionJoin().hashCode();
        }
        if (this.getTaskJoin() != null) {
            _hashCode += this.getTaskJoin().hashCode();
        }
        if (this.getTransactionJoin() != null) {
            _hashCode += this.getTransactionJoin().hashCode();
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
        typeDesc.setXmlType(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "NoteSearch"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "NoteSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("authorJoin");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "authorJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "EmployeeSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("callJoin");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "callJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "PhoneCallSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("campaignJoin");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "campaignJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "CampaignSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("caseJoin");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "caseJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "SupportCaseSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("contactJoin");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "contactJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ContactSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customerJoin");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "customerJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "CustomerSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("employeeJoin");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "employeeJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "EmployeeSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("entityJoin");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "entityJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "EntitySearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("eventJoin");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "eventJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "CalendarEventSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("issueJoin");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "issueJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "IssueSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemJoin");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "itemJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ItemSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("opportunityJoin");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "opportunityJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "OpportunitySearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("originatingLeadJoin");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "originatingLeadJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "OriginatingLeadSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("partnerJoin");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "partnerJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "PartnerSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("solutionJoin");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "solutionJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "SolutionSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taskJoin");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "taskJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TaskSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("transactionJoin");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "transactionJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TransactionSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("userJoin");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "userJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "EmployeeSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vendorJoin");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "vendorJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "VendorSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customSearchJoin");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "customSearchJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "CustomSearchJoin"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

