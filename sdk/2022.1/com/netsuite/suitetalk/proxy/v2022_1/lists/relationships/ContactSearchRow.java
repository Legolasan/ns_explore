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

import com.netsuite.suitetalk.proxy.v2022_1.platform.common.CalendarEventSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.CampaignSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.ContactSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.CustomSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.CustomerSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.EmployeeSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.FileSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.ItemSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.JobSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.MessageSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.NoteSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.OpportunitySearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.PartnerSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.PhoneCallSearchRowBasic;
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

public class ContactSearchRow
extends SearchRow
implements Serializable {
    private ContactSearchRowBasic basic;
    private PhoneCallSearchRowBasic callJoin;
    private CampaignSearchRowBasic campaignResponseJoin;
    private SupportCaseSearchRowBasic caseJoin;
    private CustomerSearchRowBasic customerJoin;
    private CustomerSearchRowBasic customerPrimaryJoin;
    private CalendarEventSearchRowBasic eventJoin;
    private FileSearchRowBasic fileJoin;
    private JobSearchRowBasic jobJoin;
    private JobSearchRowBasic jobPrimaryJoin;
    private MessageSearchRowBasic messagesJoin;
    private MessageSearchRowBasic messagesFromJoin;
    private MessageSearchRowBasic messagesToJoin;
    private OpportunitySearchRowBasic opportunityJoin;
    private CustomerSearchRowBasic parentCustomerJoin;
    private JobSearchRowBasic parentJobJoin;
    private PartnerSearchRowBasic parentPartnerJoin;
    private VendorSearchRowBasic parentVendorJoin;
    private PartnerSearchRowBasic partnerJoin;
    private PartnerSearchRowBasic partnerPrimaryJoin;
    private ItemSearchRowBasic purchasedItemJoin;
    private TaskSearchRowBasic taskJoin;
    private TransactionSearchRowBasic transactionJoin;
    private ItemSearchRowBasic upsellItemJoin;
    private EmployeeSearchRowBasic userJoin;
    private NoteSearchRowBasic userNotesJoin;
    private VendorSearchRowBasic vendorJoin;
    private VendorSearchRowBasic vendorPrimaryJoin;
    private CustomSearchRowBasic[] customSearchJoin;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(ContactSearchRow.class, true);

    public ContactSearchRow() {
    }

    public ContactSearchRow(ContactSearchRowBasic basic, PhoneCallSearchRowBasic callJoin, CampaignSearchRowBasic campaignResponseJoin, SupportCaseSearchRowBasic caseJoin, CustomerSearchRowBasic customerJoin, CustomerSearchRowBasic customerPrimaryJoin, CalendarEventSearchRowBasic eventJoin, FileSearchRowBasic fileJoin, JobSearchRowBasic jobJoin, JobSearchRowBasic jobPrimaryJoin, MessageSearchRowBasic messagesJoin, MessageSearchRowBasic messagesFromJoin, MessageSearchRowBasic messagesToJoin, OpportunitySearchRowBasic opportunityJoin, CustomerSearchRowBasic parentCustomerJoin, JobSearchRowBasic parentJobJoin, PartnerSearchRowBasic parentPartnerJoin, VendorSearchRowBasic parentVendorJoin, PartnerSearchRowBasic partnerJoin, PartnerSearchRowBasic partnerPrimaryJoin, ItemSearchRowBasic purchasedItemJoin, TaskSearchRowBasic taskJoin, TransactionSearchRowBasic transactionJoin, ItemSearchRowBasic upsellItemJoin, EmployeeSearchRowBasic userJoin, NoteSearchRowBasic userNotesJoin, VendorSearchRowBasic vendorJoin, VendorSearchRowBasic vendorPrimaryJoin, CustomSearchRowBasic[] customSearchJoin) {
        this.basic = basic;
        this.callJoin = callJoin;
        this.campaignResponseJoin = campaignResponseJoin;
        this.caseJoin = caseJoin;
        this.customerJoin = customerJoin;
        this.customerPrimaryJoin = customerPrimaryJoin;
        this.eventJoin = eventJoin;
        this.fileJoin = fileJoin;
        this.jobJoin = jobJoin;
        this.jobPrimaryJoin = jobPrimaryJoin;
        this.messagesJoin = messagesJoin;
        this.messagesFromJoin = messagesFromJoin;
        this.messagesToJoin = messagesToJoin;
        this.opportunityJoin = opportunityJoin;
        this.parentCustomerJoin = parentCustomerJoin;
        this.parentJobJoin = parentJobJoin;
        this.parentPartnerJoin = parentPartnerJoin;
        this.parentVendorJoin = parentVendorJoin;
        this.partnerJoin = partnerJoin;
        this.partnerPrimaryJoin = partnerPrimaryJoin;
        this.purchasedItemJoin = purchasedItemJoin;
        this.taskJoin = taskJoin;
        this.transactionJoin = transactionJoin;
        this.upsellItemJoin = upsellItemJoin;
        this.userJoin = userJoin;
        this.userNotesJoin = userNotesJoin;
        this.vendorJoin = vendorJoin;
        this.vendorPrimaryJoin = vendorPrimaryJoin;
        this.customSearchJoin = customSearchJoin;
    }

    public ContactSearchRowBasic getBasic() {
        return this.basic;
    }

    public void setBasic(ContactSearchRowBasic basic) {
        this.basic = basic;
    }

    public PhoneCallSearchRowBasic getCallJoin() {
        return this.callJoin;
    }

    public void setCallJoin(PhoneCallSearchRowBasic callJoin) {
        this.callJoin = callJoin;
    }

    public CampaignSearchRowBasic getCampaignResponseJoin() {
        return this.campaignResponseJoin;
    }

    public void setCampaignResponseJoin(CampaignSearchRowBasic campaignResponseJoin) {
        this.campaignResponseJoin = campaignResponseJoin;
    }

    public SupportCaseSearchRowBasic getCaseJoin() {
        return this.caseJoin;
    }

    public void setCaseJoin(SupportCaseSearchRowBasic caseJoin) {
        this.caseJoin = caseJoin;
    }

    public CustomerSearchRowBasic getCustomerJoin() {
        return this.customerJoin;
    }

    public void setCustomerJoin(CustomerSearchRowBasic customerJoin) {
        this.customerJoin = customerJoin;
    }

    public CustomerSearchRowBasic getCustomerPrimaryJoin() {
        return this.customerPrimaryJoin;
    }

    public void setCustomerPrimaryJoin(CustomerSearchRowBasic customerPrimaryJoin) {
        this.customerPrimaryJoin = customerPrimaryJoin;
    }

    public CalendarEventSearchRowBasic getEventJoin() {
        return this.eventJoin;
    }

    public void setEventJoin(CalendarEventSearchRowBasic eventJoin) {
        this.eventJoin = eventJoin;
    }

    public FileSearchRowBasic getFileJoin() {
        return this.fileJoin;
    }

    public void setFileJoin(FileSearchRowBasic fileJoin) {
        this.fileJoin = fileJoin;
    }

    public JobSearchRowBasic getJobJoin() {
        return this.jobJoin;
    }

    public void setJobJoin(JobSearchRowBasic jobJoin) {
        this.jobJoin = jobJoin;
    }

    public JobSearchRowBasic getJobPrimaryJoin() {
        return this.jobPrimaryJoin;
    }

    public void setJobPrimaryJoin(JobSearchRowBasic jobPrimaryJoin) {
        this.jobPrimaryJoin = jobPrimaryJoin;
    }

    public MessageSearchRowBasic getMessagesJoin() {
        return this.messagesJoin;
    }

    public void setMessagesJoin(MessageSearchRowBasic messagesJoin) {
        this.messagesJoin = messagesJoin;
    }

    public MessageSearchRowBasic getMessagesFromJoin() {
        return this.messagesFromJoin;
    }

    public void setMessagesFromJoin(MessageSearchRowBasic messagesFromJoin) {
        this.messagesFromJoin = messagesFromJoin;
    }

    public MessageSearchRowBasic getMessagesToJoin() {
        return this.messagesToJoin;
    }

    public void setMessagesToJoin(MessageSearchRowBasic messagesToJoin) {
        this.messagesToJoin = messagesToJoin;
    }

    public OpportunitySearchRowBasic getOpportunityJoin() {
        return this.opportunityJoin;
    }

    public void setOpportunityJoin(OpportunitySearchRowBasic opportunityJoin) {
        this.opportunityJoin = opportunityJoin;
    }

    public CustomerSearchRowBasic getParentCustomerJoin() {
        return this.parentCustomerJoin;
    }

    public void setParentCustomerJoin(CustomerSearchRowBasic parentCustomerJoin) {
        this.parentCustomerJoin = parentCustomerJoin;
    }

    public JobSearchRowBasic getParentJobJoin() {
        return this.parentJobJoin;
    }

    public void setParentJobJoin(JobSearchRowBasic parentJobJoin) {
        this.parentJobJoin = parentJobJoin;
    }

    public PartnerSearchRowBasic getParentPartnerJoin() {
        return this.parentPartnerJoin;
    }

    public void setParentPartnerJoin(PartnerSearchRowBasic parentPartnerJoin) {
        this.parentPartnerJoin = parentPartnerJoin;
    }

    public VendorSearchRowBasic getParentVendorJoin() {
        return this.parentVendorJoin;
    }

    public void setParentVendorJoin(VendorSearchRowBasic parentVendorJoin) {
        this.parentVendorJoin = parentVendorJoin;
    }

    public PartnerSearchRowBasic getPartnerJoin() {
        return this.partnerJoin;
    }

    public void setPartnerJoin(PartnerSearchRowBasic partnerJoin) {
        this.partnerJoin = partnerJoin;
    }

    public PartnerSearchRowBasic getPartnerPrimaryJoin() {
        return this.partnerPrimaryJoin;
    }

    public void setPartnerPrimaryJoin(PartnerSearchRowBasic partnerPrimaryJoin) {
        this.partnerPrimaryJoin = partnerPrimaryJoin;
    }

    public ItemSearchRowBasic getPurchasedItemJoin() {
        return this.purchasedItemJoin;
    }

    public void setPurchasedItemJoin(ItemSearchRowBasic purchasedItemJoin) {
        this.purchasedItemJoin = purchasedItemJoin;
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

    public ItemSearchRowBasic getUpsellItemJoin() {
        return this.upsellItemJoin;
    }

    public void setUpsellItemJoin(ItemSearchRowBasic upsellItemJoin) {
        this.upsellItemJoin = upsellItemJoin;
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

    public VendorSearchRowBasic getVendorJoin() {
        return this.vendorJoin;
    }

    public void setVendorJoin(VendorSearchRowBasic vendorJoin) {
        this.vendorJoin = vendorJoin;
    }

    public VendorSearchRowBasic getVendorPrimaryJoin() {
        return this.vendorPrimaryJoin;
    }

    public void setVendorPrimaryJoin(VendorSearchRowBasic vendorPrimaryJoin) {
        this.vendorPrimaryJoin = vendorPrimaryJoin;
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
        if (!(obj instanceof ContactSearchRow)) {
            return false;
        }
        ContactSearchRow other = (ContactSearchRow)obj;
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
        boolean _equals = super.equals(obj) && (this.basic == null && other.getBasic() == null || this.basic != null && this.basic.equals(other.getBasic())) && (this.callJoin == null && other.getCallJoin() == null || this.callJoin != null && this.callJoin.equals(other.getCallJoin())) && (this.campaignResponseJoin == null && other.getCampaignResponseJoin() == null || this.campaignResponseJoin != null && this.campaignResponseJoin.equals(other.getCampaignResponseJoin())) && (this.caseJoin == null && other.getCaseJoin() == null || this.caseJoin != null && this.caseJoin.equals(other.getCaseJoin())) && (this.customerJoin == null && other.getCustomerJoin() == null || this.customerJoin != null && this.customerJoin.equals(other.getCustomerJoin())) && (this.customerPrimaryJoin == null && other.getCustomerPrimaryJoin() == null || this.customerPrimaryJoin != null && this.customerPrimaryJoin.equals(other.getCustomerPrimaryJoin())) && (this.eventJoin == null && other.getEventJoin() == null || this.eventJoin != null && this.eventJoin.equals(other.getEventJoin())) && (this.fileJoin == null && other.getFileJoin() == null || this.fileJoin != null && this.fileJoin.equals(other.getFileJoin())) && (this.jobJoin == null && other.getJobJoin() == null || this.jobJoin != null && this.jobJoin.equals(other.getJobJoin())) && (this.jobPrimaryJoin == null && other.getJobPrimaryJoin() == null || this.jobPrimaryJoin != null && this.jobPrimaryJoin.equals(other.getJobPrimaryJoin())) && (this.messagesJoin == null && other.getMessagesJoin() == null || this.messagesJoin != null && this.messagesJoin.equals(other.getMessagesJoin())) && (this.messagesFromJoin == null && other.getMessagesFromJoin() == null || this.messagesFromJoin != null && this.messagesFromJoin.equals(other.getMessagesFromJoin())) && (this.messagesToJoin == null && other.getMessagesToJoin() == null || this.messagesToJoin != null && this.messagesToJoin.equals(other.getMessagesToJoin())) && (this.opportunityJoin == null && other.getOpportunityJoin() == null || this.opportunityJoin != null && this.opportunityJoin.equals(other.getOpportunityJoin())) && (this.parentCustomerJoin == null && other.getParentCustomerJoin() == null || this.parentCustomerJoin != null && this.parentCustomerJoin.equals(other.getParentCustomerJoin())) && (this.parentJobJoin == null && other.getParentJobJoin() == null || this.parentJobJoin != null && this.parentJobJoin.equals(other.getParentJobJoin())) && (this.parentPartnerJoin == null && other.getParentPartnerJoin() == null || this.parentPartnerJoin != null && this.parentPartnerJoin.equals(other.getParentPartnerJoin())) && (this.parentVendorJoin == null && other.getParentVendorJoin() == null || this.parentVendorJoin != null && this.parentVendorJoin.equals(other.getParentVendorJoin())) && (this.partnerJoin == null && other.getPartnerJoin() == null || this.partnerJoin != null && this.partnerJoin.equals(other.getPartnerJoin())) && (this.partnerPrimaryJoin == null && other.getPartnerPrimaryJoin() == null || this.partnerPrimaryJoin != null && this.partnerPrimaryJoin.equals(other.getPartnerPrimaryJoin())) && (this.purchasedItemJoin == null && other.getPurchasedItemJoin() == null || this.purchasedItemJoin != null && this.purchasedItemJoin.equals(other.getPurchasedItemJoin())) && (this.taskJoin == null && other.getTaskJoin() == null || this.taskJoin != null && this.taskJoin.equals(other.getTaskJoin())) && (this.transactionJoin == null && other.getTransactionJoin() == null || this.transactionJoin != null && this.transactionJoin.equals(other.getTransactionJoin())) && (this.upsellItemJoin == null && other.getUpsellItemJoin() == null || this.upsellItemJoin != null && this.upsellItemJoin.equals(other.getUpsellItemJoin())) && (this.userJoin == null && other.getUserJoin() == null || this.userJoin != null && this.userJoin.equals(other.getUserJoin())) && (this.userNotesJoin == null && other.getUserNotesJoin() == null || this.userNotesJoin != null && this.userNotesJoin.equals(other.getUserNotesJoin())) && (this.vendorJoin == null && other.getVendorJoin() == null || this.vendorJoin != null && this.vendorJoin.equals(other.getVendorJoin())) && (this.vendorPrimaryJoin == null && other.getVendorPrimaryJoin() == null || this.vendorPrimaryJoin != null && this.vendorPrimaryJoin.equals(other.getVendorPrimaryJoin())) && (this.customSearchJoin == null && other.getCustomSearchJoin() == null || this.customSearchJoin != null && Arrays.equals(this.customSearchJoin, other.getCustomSearchJoin()));
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
        if (this.getCallJoin() != null) {
            _hashCode += this.getCallJoin().hashCode();
        }
        if (this.getCampaignResponseJoin() != null) {
            _hashCode += this.getCampaignResponseJoin().hashCode();
        }
        if (this.getCaseJoin() != null) {
            _hashCode += this.getCaseJoin().hashCode();
        }
        if (this.getCustomerJoin() != null) {
            _hashCode += this.getCustomerJoin().hashCode();
        }
        if (this.getCustomerPrimaryJoin() != null) {
            _hashCode += this.getCustomerPrimaryJoin().hashCode();
        }
        if (this.getEventJoin() != null) {
            _hashCode += this.getEventJoin().hashCode();
        }
        if (this.getFileJoin() != null) {
            _hashCode += this.getFileJoin().hashCode();
        }
        if (this.getJobJoin() != null) {
            _hashCode += this.getJobJoin().hashCode();
        }
        if (this.getJobPrimaryJoin() != null) {
            _hashCode += this.getJobPrimaryJoin().hashCode();
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
        if (this.getOpportunityJoin() != null) {
            _hashCode += this.getOpportunityJoin().hashCode();
        }
        if (this.getParentCustomerJoin() != null) {
            _hashCode += this.getParentCustomerJoin().hashCode();
        }
        if (this.getParentJobJoin() != null) {
            _hashCode += this.getParentJobJoin().hashCode();
        }
        if (this.getParentPartnerJoin() != null) {
            _hashCode += this.getParentPartnerJoin().hashCode();
        }
        if (this.getParentVendorJoin() != null) {
            _hashCode += this.getParentVendorJoin().hashCode();
        }
        if (this.getPartnerJoin() != null) {
            _hashCode += this.getPartnerJoin().hashCode();
        }
        if (this.getPartnerPrimaryJoin() != null) {
            _hashCode += this.getPartnerPrimaryJoin().hashCode();
        }
        if (this.getPurchasedItemJoin() != null) {
            _hashCode += this.getPurchasedItemJoin().hashCode();
        }
        if (this.getTaskJoin() != null) {
            _hashCode += this.getTaskJoin().hashCode();
        }
        if (this.getTransactionJoin() != null) {
            _hashCode += this.getTransactionJoin().hashCode();
        }
        if (this.getUpsellItemJoin() != null) {
            _hashCode += this.getUpsellItemJoin().hashCode();
        }
        if (this.getUserJoin() != null) {
            _hashCode += this.getUserJoin().hashCode();
        }
        if (this.getUserNotesJoin() != null) {
            _hashCode += this.getUserNotesJoin().hashCode();
        }
        if (this.getVendorJoin() != null) {
            _hashCode += this.getVendorJoin().hashCode();
        }
        if (this.getVendorPrimaryJoin() != null) {
            _hashCode += this.getVendorPrimaryJoin().hashCode();
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
        typeDesc.setXmlType(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "ContactSearchRow"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ContactSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("callJoin");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "callJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "PhoneCallSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("campaignResponseJoin");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "campaignResponseJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "CampaignSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("caseJoin");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "caseJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "SupportCaseSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customerJoin");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "customerJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "CustomerSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customerPrimaryJoin");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "customerPrimaryJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "CustomerSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("eventJoin");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "eventJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "CalendarEventSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fileJoin");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "fileJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "FileSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("jobJoin");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "jobJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "JobSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("jobPrimaryJoin");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "jobPrimaryJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "JobSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("messagesJoin");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "messagesJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "MessageSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("messagesFromJoin");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "messagesFromJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "MessageSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("messagesToJoin");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "messagesToJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "MessageSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("opportunityJoin");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "opportunityJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "OpportunitySearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("parentCustomerJoin");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "parentCustomerJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "CustomerSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("parentJobJoin");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "parentJobJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "JobSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("parentPartnerJoin");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "parentPartnerJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "PartnerSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("parentVendorJoin");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "parentVendorJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "VendorSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("partnerJoin");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "partnerJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "PartnerSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("partnerPrimaryJoin");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "partnerPrimaryJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "PartnerSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("purchasedItemJoin");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "purchasedItemJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ItemSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taskJoin");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "taskJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TaskSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("transactionJoin");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "transactionJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("upsellItemJoin");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "upsellItemJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ItemSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("userJoin");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "userJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "EmployeeSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("userNotesJoin");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "userNotesJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "NoteSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vendorJoin");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "vendorJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "VendorSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vendorPrimaryJoin");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "vendorPrimaryJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "VendorSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customSearchJoin");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "customSearchJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "CustomSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

