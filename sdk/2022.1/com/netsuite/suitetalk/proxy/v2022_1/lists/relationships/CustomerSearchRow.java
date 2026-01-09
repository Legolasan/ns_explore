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

import com.netsuite.suitetalk.proxy.v2022_1.platform.common.BillingAccountSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.BillingScheduleSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.CalendarEventSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.CampaignSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.ContactSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.CustomSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.CustomerSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.EmployeeSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.EntityTaxRegistrationSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.FileSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.ItemSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.JobSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.MessageSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.MseSubsidiarySearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.NoteSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.OpportunitySearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.OriginatingLeadSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.PartnerSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.PaymentInstrumentSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.PhoneCallSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.PricingSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.ResourceAllocationSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.SiteCategorySearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.SupportCaseSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.TaskSearchRowBasic;
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

public class CustomerSearchRow
extends SearchRow
implements Serializable {
    private CustomerSearchRowBasic basic;
    private BillingAccountSearchRowBasic billingAccountJoin;
    private BillingScheduleSearchRowBasic billingScheduleJoin;
    private PhoneCallSearchRowBasic callJoin;
    private CampaignSearchRowBasic campaignResponseJoin;
    private SupportCaseSearchRowBasic caseJoin;
    private ContactSearchRowBasic contactJoin;
    private ContactSearchRowBasic contactPrimaryJoin;
    private CalendarEventSearchRowBasic eventJoin;
    private FileSearchRowBasic fileJoin;
    private FileSearchRowBasic hostedPageJoin;
    private JobSearchRowBasic jobJoin;
    private CampaignSearchRowBasic leadSourceJoin;
    private MessageSearchRowBasic messagesJoin;
    private MessageSearchRowBasic messagesFromJoin;
    private MessageSearchRowBasic messagesToJoin;
    private MseSubsidiarySearchRowBasic mseSubsidiaryJoin;
    private OpportunitySearchRowBasic opportunityJoin;
    private OriginatingLeadSearchRowBasic originatingLeadJoin;
    private CustomerSearchRowBasic parentCustomerJoin;
    private PartnerSearchRowBasic partnerJoin;
    private PaymentInstrumentSearchRowBasic paymentInstrumentJoin;
    private PricingSearchRowBasic pricingJoin;
    private ItemSearchRowBasic purchasedItemJoin;
    private ResourceAllocationSearchRowBasic resourceAllocationJoin;
    private EmployeeSearchRowBasic salesRepJoin;
    private CustomerSearchRowBasic subCustomerJoin;
    private TaskSearchRowBasic taskJoin;
    private EntityTaxRegistrationSearchRowBasic taxRegistrationJoin;
    private TimeBillSearchRowBasic timeJoin;
    private CustomerSearchRowBasic topLevelParentJoin;
    private TransactionSearchRowBasic transactionJoin;
    private ItemSearchRowBasic upsellItemJoin;
    private EmployeeSearchRowBasic userJoin;
    private NoteSearchRowBasic userNotesJoin;
    private SiteCategorySearchRowBasic webSiteCategoryJoin;
    private ItemSearchRowBasic webSiteItemJoin;
    private CustomSearchRowBasic[] customSearchJoin;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(CustomerSearchRow.class, true);

    public CustomerSearchRow() {
    }

    public CustomerSearchRow(CustomerSearchRowBasic basic, BillingAccountSearchRowBasic billingAccountJoin, BillingScheduleSearchRowBasic billingScheduleJoin, PhoneCallSearchRowBasic callJoin, CampaignSearchRowBasic campaignResponseJoin, SupportCaseSearchRowBasic caseJoin, ContactSearchRowBasic contactJoin, ContactSearchRowBasic contactPrimaryJoin, CalendarEventSearchRowBasic eventJoin, FileSearchRowBasic fileJoin, FileSearchRowBasic hostedPageJoin, JobSearchRowBasic jobJoin, CampaignSearchRowBasic leadSourceJoin, MessageSearchRowBasic messagesJoin, MessageSearchRowBasic messagesFromJoin, MessageSearchRowBasic messagesToJoin, MseSubsidiarySearchRowBasic mseSubsidiaryJoin, OpportunitySearchRowBasic opportunityJoin, OriginatingLeadSearchRowBasic originatingLeadJoin, CustomerSearchRowBasic parentCustomerJoin, PartnerSearchRowBasic partnerJoin, PaymentInstrumentSearchRowBasic paymentInstrumentJoin, PricingSearchRowBasic pricingJoin, ItemSearchRowBasic purchasedItemJoin, ResourceAllocationSearchRowBasic resourceAllocationJoin, EmployeeSearchRowBasic salesRepJoin, CustomerSearchRowBasic subCustomerJoin, TaskSearchRowBasic taskJoin, EntityTaxRegistrationSearchRowBasic taxRegistrationJoin, TimeBillSearchRowBasic timeJoin, CustomerSearchRowBasic topLevelParentJoin, TransactionSearchRowBasic transactionJoin, ItemSearchRowBasic upsellItemJoin, EmployeeSearchRowBasic userJoin, NoteSearchRowBasic userNotesJoin, SiteCategorySearchRowBasic webSiteCategoryJoin, ItemSearchRowBasic webSiteItemJoin, CustomSearchRowBasic[] customSearchJoin) {
        this.basic = basic;
        this.billingAccountJoin = billingAccountJoin;
        this.billingScheduleJoin = billingScheduleJoin;
        this.callJoin = callJoin;
        this.campaignResponseJoin = campaignResponseJoin;
        this.caseJoin = caseJoin;
        this.contactJoin = contactJoin;
        this.contactPrimaryJoin = contactPrimaryJoin;
        this.eventJoin = eventJoin;
        this.fileJoin = fileJoin;
        this.hostedPageJoin = hostedPageJoin;
        this.jobJoin = jobJoin;
        this.leadSourceJoin = leadSourceJoin;
        this.messagesJoin = messagesJoin;
        this.messagesFromJoin = messagesFromJoin;
        this.messagesToJoin = messagesToJoin;
        this.mseSubsidiaryJoin = mseSubsidiaryJoin;
        this.opportunityJoin = opportunityJoin;
        this.originatingLeadJoin = originatingLeadJoin;
        this.parentCustomerJoin = parentCustomerJoin;
        this.partnerJoin = partnerJoin;
        this.paymentInstrumentJoin = paymentInstrumentJoin;
        this.pricingJoin = pricingJoin;
        this.purchasedItemJoin = purchasedItemJoin;
        this.resourceAllocationJoin = resourceAllocationJoin;
        this.salesRepJoin = salesRepJoin;
        this.subCustomerJoin = subCustomerJoin;
        this.taskJoin = taskJoin;
        this.taxRegistrationJoin = taxRegistrationJoin;
        this.timeJoin = timeJoin;
        this.topLevelParentJoin = topLevelParentJoin;
        this.transactionJoin = transactionJoin;
        this.upsellItemJoin = upsellItemJoin;
        this.userJoin = userJoin;
        this.userNotesJoin = userNotesJoin;
        this.webSiteCategoryJoin = webSiteCategoryJoin;
        this.webSiteItemJoin = webSiteItemJoin;
        this.customSearchJoin = customSearchJoin;
    }

    public CustomerSearchRowBasic getBasic() {
        return this.basic;
    }

    public void setBasic(CustomerSearchRowBasic basic) {
        this.basic = basic;
    }

    public BillingAccountSearchRowBasic getBillingAccountJoin() {
        return this.billingAccountJoin;
    }

    public void setBillingAccountJoin(BillingAccountSearchRowBasic billingAccountJoin) {
        this.billingAccountJoin = billingAccountJoin;
    }

    public BillingScheduleSearchRowBasic getBillingScheduleJoin() {
        return this.billingScheduleJoin;
    }

    public void setBillingScheduleJoin(BillingScheduleSearchRowBasic billingScheduleJoin) {
        this.billingScheduleJoin = billingScheduleJoin;
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

    public ContactSearchRowBasic getContactJoin() {
        return this.contactJoin;
    }

    public void setContactJoin(ContactSearchRowBasic contactJoin) {
        this.contactJoin = contactJoin;
    }

    public ContactSearchRowBasic getContactPrimaryJoin() {
        return this.contactPrimaryJoin;
    }

    public void setContactPrimaryJoin(ContactSearchRowBasic contactPrimaryJoin) {
        this.contactPrimaryJoin = contactPrimaryJoin;
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

    public FileSearchRowBasic getHostedPageJoin() {
        return this.hostedPageJoin;
    }

    public void setHostedPageJoin(FileSearchRowBasic hostedPageJoin) {
        this.hostedPageJoin = hostedPageJoin;
    }

    public JobSearchRowBasic getJobJoin() {
        return this.jobJoin;
    }

    public void setJobJoin(JobSearchRowBasic jobJoin) {
        this.jobJoin = jobJoin;
    }

    public CampaignSearchRowBasic getLeadSourceJoin() {
        return this.leadSourceJoin;
    }

    public void setLeadSourceJoin(CampaignSearchRowBasic leadSourceJoin) {
        this.leadSourceJoin = leadSourceJoin;
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

    public MseSubsidiarySearchRowBasic getMseSubsidiaryJoin() {
        return this.mseSubsidiaryJoin;
    }

    public void setMseSubsidiaryJoin(MseSubsidiarySearchRowBasic mseSubsidiaryJoin) {
        this.mseSubsidiaryJoin = mseSubsidiaryJoin;
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

    public CustomerSearchRowBasic getParentCustomerJoin() {
        return this.parentCustomerJoin;
    }

    public void setParentCustomerJoin(CustomerSearchRowBasic parentCustomerJoin) {
        this.parentCustomerJoin = parentCustomerJoin;
    }

    public PartnerSearchRowBasic getPartnerJoin() {
        return this.partnerJoin;
    }

    public void setPartnerJoin(PartnerSearchRowBasic partnerJoin) {
        this.partnerJoin = partnerJoin;
    }

    public PaymentInstrumentSearchRowBasic getPaymentInstrumentJoin() {
        return this.paymentInstrumentJoin;
    }

    public void setPaymentInstrumentJoin(PaymentInstrumentSearchRowBasic paymentInstrumentJoin) {
        this.paymentInstrumentJoin = paymentInstrumentJoin;
    }

    public PricingSearchRowBasic getPricingJoin() {
        return this.pricingJoin;
    }

    public void setPricingJoin(PricingSearchRowBasic pricingJoin) {
        this.pricingJoin = pricingJoin;
    }

    public ItemSearchRowBasic getPurchasedItemJoin() {
        return this.purchasedItemJoin;
    }

    public void setPurchasedItemJoin(ItemSearchRowBasic purchasedItemJoin) {
        this.purchasedItemJoin = purchasedItemJoin;
    }

    public ResourceAllocationSearchRowBasic getResourceAllocationJoin() {
        return this.resourceAllocationJoin;
    }

    public void setResourceAllocationJoin(ResourceAllocationSearchRowBasic resourceAllocationJoin) {
        this.resourceAllocationJoin = resourceAllocationJoin;
    }

    public EmployeeSearchRowBasic getSalesRepJoin() {
        return this.salesRepJoin;
    }

    public void setSalesRepJoin(EmployeeSearchRowBasic salesRepJoin) {
        this.salesRepJoin = salesRepJoin;
    }

    public CustomerSearchRowBasic getSubCustomerJoin() {
        return this.subCustomerJoin;
    }

    public void setSubCustomerJoin(CustomerSearchRowBasic subCustomerJoin) {
        this.subCustomerJoin = subCustomerJoin;
    }

    public TaskSearchRowBasic getTaskJoin() {
        return this.taskJoin;
    }

    public void setTaskJoin(TaskSearchRowBasic taskJoin) {
        this.taskJoin = taskJoin;
    }

    public EntityTaxRegistrationSearchRowBasic getTaxRegistrationJoin() {
        return this.taxRegistrationJoin;
    }

    public void setTaxRegistrationJoin(EntityTaxRegistrationSearchRowBasic taxRegistrationJoin) {
        this.taxRegistrationJoin = taxRegistrationJoin;
    }

    public TimeBillSearchRowBasic getTimeJoin() {
        return this.timeJoin;
    }

    public void setTimeJoin(TimeBillSearchRowBasic timeJoin) {
        this.timeJoin = timeJoin;
    }

    public CustomerSearchRowBasic getTopLevelParentJoin() {
        return this.topLevelParentJoin;
    }

    public void setTopLevelParentJoin(CustomerSearchRowBasic topLevelParentJoin) {
        this.topLevelParentJoin = topLevelParentJoin;
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

    public SiteCategorySearchRowBasic getWebSiteCategoryJoin() {
        return this.webSiteCategoryJoin;
    }

    public void setWebSiteCategoryJoin(SiteCategorySearchRowBasic webSiteCategoryJoin) {
        this.webSiteCategoryJoin = webSiteCategoryJoin;
    }

    public ItemSearchRowBasic getWebSiteItemJoin() {
        return this.webSiteItemJoin;
    }

    public void setWebSiteItemJoin(ItemSearchRowBasic webSiteItemJoin) {
        this.webSiteItemJoin = webSiteItemJoin;
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
        if (!(obj instanceof CustomerSearchRow)) {
            return false;
        }
        CustomerSearchRow other = (CustomerSearchRow)obj;
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
        boolean _equals = super.equals(obj) && (this.basic == null && other.getBasic() == null || this.basic != null && this.basic.equals(other.getBasic())) && (this.billingAccountJoin == null && other.getBillingAccountJoin() == null || this.billingAccountJoin != null && this.billingAccountJoin.equals(other.getBillingAccountJoin())) && (this.billingScheduleJoin == null && other.getBillingScheduleJoin() == null || this.billingScheduleJoin != null && this.billingScheduleJoin.equals(other.getBillingScheduleJoin())) && (this.callJoin == null && other.getCallJoin() == null || this.callJoin != null && this.callJoin.equals(other.getCallJoin())) && (this.campaignResponseJoin == null && other.getCampaignResponseJoin() == null || this.campaignResponseJoin != null && this.campaignResponseJoin.equals(other.getCampaignResponseJoin())) && (this.caseJoin == null && other.getCaseJoin() == null || this.caseJoin != null && this.caseJoin.equals(other.getCaseJoin())) && (this.contactJoin == null && other.getContactJoin() == null || this.contactJoin != null && this.contactJoin.equals(other.getContactJoin())) && (this.contactPrimaryJoin == null && other.getContactPrimaryJoin() == null || this.contactPrimaryJoin != null && this.contactPrimaryJoin.equals(other.getContactPrimaryJoin())) && (this.eventJoin == null && other.getEventJoin() == null || this.eventJoin != null && this.eventJoin.equals(other.getEventJoin())) && (this.fileJoin == null && other.getFileJoin() == null || this.fileJoin != null && this.fileJoin.equals(other.getFileJoin())) && (this.hostedPageJoin == null && other.getHostedPageJoin() == null || this.hostedPageJoin != null && this.hostedPageJoin.equals(other.getHostedPageJoin())) && (this.jobJoin == null && other.getJobJoin() == null || this.jobJoin != null && this.jobJoin.equals(other.getJobJoin())) && (this.leadSourceJoin == null && other.getLeadSourceJoin() == null || this.leadSourceJoin != null && this.leadSourceJoin.equals(other.getLeadSourceJoin())) && (this.messagesJoin == null && other.getMessagesJoin() == null || this.messagesJoin != null && this.messagesJoin.equals(other.getMessagesJoin())) && (this.messagesFromJoin == null && other.getMessagesFromJoin() == null || this.messagesFromJoin != null && this.messagesFromJoin.equals(other.getMessagesFromJoin())) && (this.messagesToJoin == null && other.getMessagesToJoin() == null || this.messagesToJoin != null && this.messagesToJoin.equals(other.getMessagesToJoin())) && (this.mseSubsidiaryJoin == null && other.getMseSubsidiaryJoin() == null || this.mseSubsidiaryJoin != null && this.mseSubsidiaryJoin.equals(other.getMseSubsidiaryJoin())) && (this.opportunityJoin == null && other.getOpportunityJoin() == null || this.opportunityJoin != null && this.opportunityJoin.equals(other.getOpportunityJoin())) && (this.originatingLeadJoin == null && other.getOriginatingLeadJoin() == null || this.originatingLeadJoin != null && this.originatingLeadJoin.equals(other.getOriginatingLeadJoin())) && (this.parentCustomerJoin == null && other.getParentCustomerJoin() == null || this.parentCustomerJoin != null && this.parentCustomerJoin.equals(other.getParentCustomerJoin())) && (this.partnerJoin == null && other.getPartnerJoin() == null || this.partnerJoin != null && this.partnerJoin.equals(other.getPartnerJoin())) && (this.paymentInstrumentJoin == null && other.getPaymentInstrumentJoin() == null || this.paymentInstrumentJoin != null && this.paymentInstrumentJoin.equals(other.getPaymentInstrumentJoin())) && (this.pricingJoin == null && other.getPricingJoin() == null || this.pricingJoin != null && this.pricingJoin.equals(other.getPricingJoin())) && (this.purchasedItemJoin == null && other.getPurchasedItemJoin() == null || this.purchasedItemJoin != null && this.purchasedItemJoin.equals(other.getPurchasedItemJoin())) && (this.resourceAllocationJoin == null && other.getResourceAllocationJoin() == null || this.resourceAllocationJoin != null && this.resourceAllocationJoin.equals(other.getResourceAllocationJoin())) && (this.salesRepJoin == null && other.getSalesRepJoin() == null || this.salesRepJoin != null && this.salesRepJoin.equals(other.getSalesRepJoin())) && (this.subCustomerJoin == null && other.getSubCustomerJoin() == null || this.subCustomerJoin != null && this.subCustomerJoin.equals(other.getSubCustomerJoin())) && (this.taskJoin == null && other.getTaskJoin() == null || this.taskJoin != null && this.taskJoin.equals(other.getTaskJoin())) && (this.taxRegistrationJoin == null && other.getTaxRegistrationJoin() == null || this.taxRegistrationJoin != null && this.taxRegistrationJoin.equals(other.getTaxRegistrationJoin())) && (this.timeJoin == null && other.getTimeJoin() == null || this.timeJoin != null && this.timeJoin.equals(other.getTimeJoin())) && (this.topLevelParentJoin == null && other.getTopLevelParentJoin() == null || this.topLevelParentJoin != null && this.topLevelParentJoin.equals(other.getTopLevelParentJoin())) && (this.transactionJoin == null && other.getTransactionJoin() == null || this.transactionJoin != null && this.transactionJoin.equals(other.getTransactionJoin())) && (this.upsellItemJoin == null && other.getUpsellItemJoin() == null || this.upsellItemJoin != null && this.upsellItemJoin.equals(other.getUpsellItemJoin())) && (this.userJoin == null && other.getUserJoin() == null || this.userJoin != null && this.userJoin.equals(other.getUserJoin())) && (this.userNotesJoin == null && other.getUserNotesJoin() == null || this.userNotesJoin != null && this.userNotesJoin.equals(other.getUserNotesJoin())) && (this.webSiteCategoryJoin == null && other.getWebSiteCategoryJoin() == null || this.webSiteCategoryJoin != null && this.webSiteCategoryJoin.equals(other.getWebSiteCategoryJoin())) && (this.webSiteItemJoin == null && other.getWebSiteItemJoin() == null || this.webSiteItemJoin != null && this.webSiteItemJoin.equals(other.getWebSiteItemJoin())) && (this.customSearchJoin == null && other.getCustomSearchJoin() == null || this.customSearchJoin != null && Arrays.equals(this.customSearchJoin, other.getCustomSearchJoin()));
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
        if (this.getBillingAccountJoin() != null) {
            _hashCode += this.getBillingAccountJoin().hashCode();
        }
        if (this.getBillingScheduleJoin() != null) {
            _hashCode += this.getBillingScheduleJoin().hashCode();
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
        if (this.getContactJoin() != null) {
            _hashCode += this.getContactJoin().hashCode();
        }
        if (this.getContactPrimaryJoin() != null) {
            _hashCode += this.getContactPrimaryJoin().hashCode();
        }
        if (this.getEventJoin() != null) {
            _hashCode += this.getEventJoin().hashCode();
        }
        if (this.getFileJoin() != null) {
            _hashCode += this.getFileJoin().hashCode();
        }
        if (this.getHostedPageJoin() != null) {
            _hashCode += this.getHostedPageJoin().hashCode();
        }
        if (this.getJobJoin() != null) {
            _hashCode += this.getJobJoin().hashCode();
        }
        if (this.getLeadSourceJoin() != null) {
            _hashCode += this.getLeadSourceJoin().hashCode();
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
        if (this.getMseSubsidiaryJoin() != null) {
            _hashCode += this.getMseSubsidiaryJoin().hashCode();
        }
        if (this.getOpportunityJoin() != null) {
            _hashCode += this.getOpportunityJoin().hashCode();
        }
        if (this.getOriginatingLeadJoin() != null) {
            _hashCode += this.getOriginatingLeadJoin().hashCode();
        }
        if (this.getParentCustomerJoin() != null) {
            _hashCode += this.getParentCustomerJoin().hashCode();
        }
        if (this.getPartnerJoin() != null) {
            _hashCode += this.getPartnerJoin().hashCode();
        }
        if (this.getPaymentInstrumentJoin() != null) {
            _hashCode += this.getPaymentInstrumentJoin().hashCode();
        }
        if (this.getPricingJoin() != null) {
            _hashCode += this.getPricingJoin().hashCode();
        }
        if (this.getPurchasedItemJoin() != null) {
            _hashCode += this.getPurchasedItemJoin().hashCode();
        }
        if (this.getResourceAllocationJoin() != null) {
            _hashCode += this.getResourceAllocationJoin().hashCode();
        }
        if (this.getSalesRepJoin() != null) {
            _hashCode += this.getSalesRepJoin().hashCode();
        }
        if (this.getSubCustomerJoin() != null) {
            _hashCode += this.getSubCustomerJoin().hashCode();
        }
        if (this.getTaskJoin() != null) {
            _hashCode += this.getTaskJoin().hashCode();
        }
        if (this.getTaxRegistrationJoin() != null) {
            _hashCode += this.getTaxRegistrationJoin().hashCode();
        }
        if (this.getTimeJoin() != null) {
            _hashCode += this.getTimeJoin().hashCode();
        }
        if (this.getTopLevelParentJoin() != null) {
            _hashCode += this.getTopLevelParentJoin().hashCode();
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
        if (this.getWebSiteCategoryJoin() != null) {
            _hashCode += this.getWebSiteCategoryJoin().hashCode();
        }
        if (this.getWebSiteItemJoin() != null) {
            _hashCode += this.getWebSiteItemJoin().hashCode();
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
        typeDesc.setXmlType(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "CustomerSearchRow"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "CustomerSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billingAccountJoin");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "billingAccountJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "BillingAccountSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billingScheduleJoin");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "billingScheduleJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "BillingScheduleSearchRowBasic"));
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
        elemField.setFieldName("contactJoin");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "contactJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ContactSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("contactPrimaryJoin");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "contactPrimaryJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ContactSearchRowBasic"));
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
        elemField.setFieldName("hostedPageJoin");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "hostedPageJoin"));
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
        elemField.setFieldName("leadSourceJoin");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "leadSourceJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "CampaignSearchRowBasic"));
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
        elemField.setFieldName("mseSubsidiaryJoin");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "mseSubsidiaryJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "MseSubsidiarySearchRowBasic"));
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
        elemField.setFieldName("originatingLeadJoin");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "originatingLeadJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "OriginatingLeadSearchRowBasic"));
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
        elemField.setFieldName("partnerJoin");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "partnerJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "PartnerSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("paymentInstrumentJoin");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "paymentInstrumentJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "PaymentInstrumentSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("pricingJoin");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "pricingJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "PricingSearchRowBasic"));
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
        elemField.setFieldName("resourceAllocationJoin");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "resourceAllocationJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ResourceAllocationSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("salesRepJoin");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "salesRepJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "EmployeeSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subCustomerJoin");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "subCustomerJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "CustomerSearchRowBasic"));
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
        elemField.setFieldName("taxRegistrationJoin");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "taxRegistrationJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "EntityTaxRegistrationSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("timeJoin");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "timeJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TimeBillSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("topLevelParentJoin");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "topLevelParentJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "CustomerSearchRowBasic"));
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
        elemField.setFieldName("webSiteCategoryJoin");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "webSiteCategoryJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "SiteCategorySearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("webSiteItemJoin");
        elemField.setXmlName(new QName("urn:relationships_2022_1.lists.webservices.netsuite.com", "webSiteItemJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ItemSearchRowBasic"));
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

