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

import com.netsuite.suitetalk.proxy.v2022_1.platform.common.CalendarEventSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.CampaignSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.ContactSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.CustomSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.CustomerSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.EmployeeSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.EntitySearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.IssueSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.ItemSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.NoteSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.OpportunitySearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.OriginatingLeadSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.PartnerSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.PhoneCallSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.SolutionSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.SupportCaseSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.TaskSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.TransactionSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.VendorSearchRowBasic;
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

public class NoteSearchRow
extends SearchRow
implements Serializable {
    private NoteSearchRowBasic basic;
    private EmployeeSearchRowBasic authorJoin;
    private PhoneCallSearchRowBasic callJoin;
    private CampaignSearchRowBasic campaignJoin;
    private SupportCaseSearchRowBasic caseJoin;
    private ContactSearchRowBasic contactJoin;
    private CustomerSearchRowBasic customerJoin;
    private EmployeeSearchRowBasic employeeJoin;
    private EntitySearchRowBasic entityJoin;
    private CalendarEventSearchRowBasic eventJoin;
    private IssueSearchRowBasic issueJoin;
    private ItemSearchRowBasic itemJoin;
    private OpportunitySearchRowBasic opportunityJoin;
    private OriginatingLeadSearchRowBasic originatingLeadJoin;
    private PartnerSearchRowBasic partnerJoin;
    private SolutionSearchRowBasic solutionJoin;
    private TaskSearchRowBasic taskJoin;
    private TransactionSearchRowBasic transactionJoin;
    private EmployeeSearchRowBasic userJoin;
    private VendorSearchRowBasic vendorJoin;
    private CustomSearchRowBasic[] customSearchJoin;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(NoteSearchRow.class, true);

    public NoteSearchRow() {
    }

    public NoteSearchRow(NoteSearchRowBasic basic, EmployeeSearchRowBasic authorJoin, PhoneCallSearchRowBasic callJoin, CampaignSearchRowBasic campaignJoin, SupportCaseSearchRowBasic caseJoin, ContactSearchRowBasic contactJoin, CustomerSearchRowBasic customerJoin, EmployeeSearchRowBasic employeeJoin, EntitySearchRowBasic entityJoin, CalendarEventSearchRowBasic eventJoin, IssueSearchRowBasic issueJoin, ItemSearchRowBasic itemJoin, OpportunitySearchRowBasic opportunityJoin, OriginatingLeadSearchRowBasic originatingLeadJoin, PartnerSearchRowBasic partnerJoin, SolutionSearchRowBasic solutionJoin, TaskSearchRowBasic taskJoin, TransactionSearchRowBasic transactionJoin, EmployeeSearchRowBasic userJoin, VendorSearchRowBasic vendorJoin, CustomSearchRowBasic[] customSearchJoin) {
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

    public NoteSearchRowBasic getBasic() {
        return this.basic;
    }

    public void setBasic(NoteSearchRowBasic basic) {
        this.basic = basic;
    }

    public EmployeeSearchRowBasic getAuthorJoin() {
        return this.authorJoin;
    }

    public void setAuthorJoin(EmployeeSearchRowBasic authorJoin) {
        this.authorJoin = authorJoin;
    }

    public PhoneCallSearchRowBasic getCallJoin() {
        return this.callJoin;
    }

    public void setCallJoin(PhoneCallSearchRowBasic callJoin) {
        this.callJoin = callJoin;
    }

    public CampaignSearchRowBasic getCampaignJoin() {
        return this.campaignJoin;
    }

    public void setCampaignJoin(CampaignSearchRowBasic campaignJoin) {
        this.campaignJoin = campaignJoin;
    }

    public SupportCaseSearchRowBasic getCaseJoin() {
        return this.caseJoin;
    }

    public void setCaseJoin(SupportCaseSearchRowBasic caseJoin) {
        this.caseJoin = caseJoin;
    }

    public ContactSearchRowBasic getContactJoin() {
        return this.contactJoin;
    }

    public void setContactJoin(ContactSearchRowBasic contactJoin) {
        this.contactJoin = contactJoin;
    }

    public CustomerSearchRowBasic getCustomerJoin() {
        return this.customerJoin;
    }

    public void setCustomerJoin(CustomerSearchRowBasic customerJoin) {
        this.customerJoin = customerJoin;
    }

    public EmployeeSearchRowBasic getEmployeeJoin() {
        return this.employeeJoin;
    }

    public void setEmployeeJoin(EmployeeSearchRowBasic employeeJoin) {
        this.employeeJoin = employeeJoin;
    }

    public EntitySearchRowBasic getEntityJoin() {
        return this.entityJoin;
    }

    public void setEntityJoin(EntitySearchRowBasic entityJoin) {
        this.entityJoin = entityJoin;
    }

    public CalendarEventSearchRowBasic getEventJoin() {
        return this.eventJoin;
    }

    public void setEventJoin(CalendarEventSearchRowBasic eventJoin) {
        this.eventJoin = eventJoin;
    }

    public IssueSearchRowBasic getIssueJoin() {
        return this.issueJoin;
    }

    public void setIssueJoin(IssueSearchRowBasic issueJoin) {
        this.issueJoin = issueJoin;
    }

    public ItemSearchRowBasic getItemJoin() {
        return this.itemJoin;
    }

    public void setItemJoin(ItemSearchRowBasic itemJoin) {
        this.itemJoin = itemJoin;
    }

    public OpportunitySearchRowBasic getOpportunityJoin() {
        return this.opportunityJoin;
    }

    public void setOpportunityJoin(OpportunitySearchRowBasic opportunityJoin) {
        this.opportunityJoin = opportunityJoin;
    }

    public OriginatingLeadSearchRowBasic getOriginatingLeadJoin() {
        return this.originatingLeadJoin;
    }

    public void setOriginatingLeadJoin(OriginatingLeadSearchRowBasic originatingLeadJoin) {
        this.originatingLeadJoin = originatingLeadJoin;
    }

    public PartnerSearchRowBasic getPartnerJoin() {
        return this.partnerJoin;
    }

    public void setPartnerJoin(PartnerSearchRowBasic partnerJoin) {
        this.partnerJoin = partnerJoin;
    }

    public SolutionSearchRowBasic getSolutionJoin() {
        return this.solutionJoin;
    }

    public void setSolutionJoin(SolutionSearchRowBasic solutionJoin) {
        this.solutionJoin = solutionJoin;
    }

    public TaskSearchRowBasic getTaskJoin() {
        return this.taskJoin;
    }

    public void setTaskJoin(TaskSearchRowBasic taskJoin) {
        this.taskJoin = taskJoin;
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

    public VendorSearchRowBasic getVendorJoin() {
        return this.vendorJoin;
    }

    public void setVendorJoin(VendorSearchRowBasic vendorJoin) {
        this.vendorJoin = vendorJoin;
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
        if (!(obj instanceof NoteSearchRow)) {
            return false;
        }
        NoteSearchRow other = (NoteSearchRow)obj;
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
        typeDesc.setXmlType(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "NoteSearchRow"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "NoteSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("authorJoin");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "authorJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "EmployeeSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("callJoin");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "callJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "PhoneCallSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("campaignJoin");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "campaignJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "CampaignSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("caseJoin");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "caseJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "SupportCaseSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("contactJoin");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "contactJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ContactSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customerJoin");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "customerJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "CustomerSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("employeeJoin");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "employeeJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "EmployeeSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("entityJoin");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "entityJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "EntitySearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("eventJoin");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "eventJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "CalendarEventSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("issueJoin");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "issueJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "IssueSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemJoin");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "itemJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ItemSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("opportunityJoin");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "opportunityJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "OpportunitySearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("originatingLeadJoin");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "originatingLeadJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "OriginatingLeadSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("partnerJoin");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "partnerJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "PartnerSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("solutionJoin");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "solutionJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "SolutionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taskJoin");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "taskJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TaskSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("transactionJoin");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "transactionJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("userJoin");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "userJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "EmployeeSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vendorJoin");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "vendorJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "VendorSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customSearchJoin");
        elemField.setXmlName(new QName("urn:communication_2022_1.general.webservices.netsuite.com", "customSearchJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "CustomSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

