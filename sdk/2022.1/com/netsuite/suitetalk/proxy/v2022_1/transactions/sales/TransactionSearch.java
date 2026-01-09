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
package com.netsuite.suitetalk.proxy.v2022_1.transactions.sales;

import com.netsuite.suitetalk.proxy.v2022_1.platform.common.AccountSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.AccountingPeriodSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.AccountingTransactionSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.AddressSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.BillingAccountSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.BinSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.BomRevisionSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.BomSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.CalendarEventSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.CampaignSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.ClassificationSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.ContactSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.CustomSearchJoin;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.CustomerSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.DepartmentSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.EmployeeSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.EntitySearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.ExpenseCategorySearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.FileSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.InstallmentSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.InventoryDetailSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.InventoryNumberSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.ItemRevisionSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.ItemSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.JobSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.LocationSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.ManufacturingOperationTaskSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.MessageSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.NoteSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.OpportunitySearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.PartnerSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.PaymentInstrumentSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.PaymentOptionSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.PayrollItemSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.PhoneCallSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.ProjectTaskSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.RevRecScheduleSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.SalesTaxItemSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.SubsidiarySearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.SupportCaseSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.TaskSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.TaxDetailSearchBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.TimeBillSearchBasic;
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

public class TransactionSearch
extends SearchRecord
implements Serializable {
    private TransactionSearchBasic basic;
    private AccountSearchBasic accountJoin;
    private AccountingPeriodSearchBasic accountingPeriodJoin;
    private AccountingTransactionSearchBasic accountingTransactionJoin;
    private AccountSearchBasic advanceToApplyAccountJoin;
    private TransactionSearchBasic appliedToTransactionJoin;
    private TransactionSearchBasic applyingTransactionJoin;
    private ItemSearchBasic assemblyJoin;
    private AddressSearchBasic billingAddressJoin;
    private TransactionSearchBasic billingTransactionJoin;
    private BinSearchBasic binNumberJoin;
    private BomSearchBasic bomJoin;
    private BomRevisionSearchBasic bomRevisionJoin;
    private PhoneCallSearchBasic callJoin;
    private SupportCaseSearchBasic caseJoin;
    private ClassificationSearchBasic classJoin;
    private TransactionSearchBasic cogsPurchaseJoin;
    private TransactionSearchBasic cogsSaleJoin;
    private ContactSearchBasic contactPrimaryJoin;
    private TransactionSearchBasic createdFromJoin;
    private CustomerSearchBasic customerJoin;
    private CustomerSearchBasic customerMainJoin;
    private DepartmentSearchBasic departmentJoin;
    private TransactionSearchBasic depositTransactionJoin;
    private EmployeeSearchBasic employeeJoin;
    private CalendarEventSearchBasic eventJoin;
    private ExpenseCategorySearchBasic expenseCategoryJoin;
    private FileSearchBasic fileJoin;
    private LocationSearchBasic fromLocationJoin;
    private TransactionSearchBasic fulfillingTransactionJoin;
    private BillingAccountSearchBasic headerBillingAccountJoin;
    private InstallmentSearchBasic installmentJoin;
    private InventoryDetailSearchBasic inventoryDetailJoin;
    private ItemSearchBasic itemJoin;
    private InventoryNumberSearchBasic itemNumberJoin;
    private JobSearchBasic jobJoin;
    private JobSearchBasic jobMainJoin;
    private CampaignSearchBasic leadSourceJoin;
    private BillingAccountSearchBasic lineBillingAccountJoin;
    private FileSearchBasic lineFileJoin;
    private LocationSearchBasic locationJoin;
    private ManufacturingOperationTaskSearchBasic manufacturingOperationTaskJoin;
    private MessageSearchBasic messagesJoin;
    private EntitySearchBasic nextApproverJoin;
    private OpportunitySearchBasic opportunityJoin;
    private VendorSearchBasic outsourcingVendorJoin;
    private TransactionSearchBasic paidTransactionJoin;
    private PartnerSearchBasic partnerJoin;
    private TransactionSearchBasic payingTransactionJoin;
    private PaymentInstrumentSearchBasic paymentInstrumentJoin;
    private PaymentOptionSearchBasic paymentOptionJoin;
    private PayrollItemSearchBasic payrollItemJoin;
    private ProjectTaskSearchBasic projectTaskJoin;
    private TransactionSearchBasic purchaseOrderJoin;
    private EmployeeSearchBasic requestorJoin;
    private TransactionSearchBasic revCommittingTransactionJoin;
    private ItemRevisionSearchBasic revisionJoin;
    private RevRecScheduleSearchBasic revRecScheduleJoin;
    private TransactionSearchBasic rgPostingTransactionJoin;
    private TransactionSearchBasic salesOrderJoin;
    private EmployeeSearchBasic salesRepJoin;
    private AddressSearchBasic shippingAddressJoin;
    private SubsidiarySearchBasic subsidiaryJoin;
    private TaskSearchBasic taskJoin;
    private SalesTaxItemSearchBasic taxCodeJoin;
    private TaxDetailSearchBasic taxDetailJoin;
    private SalesTaxItemSearchBasic taxItemJoin;
    private TimeBillSearchBasic timeJoin;
    private LocationSearchBasic toLocationJoin;
    private EmployeeSearchBasic userJoin;
    private NoteSearchBasic userNotesJoin;
    private VendorSearchBasic vendorJoin;
    private VendorSearchBasic vendorLineJoin;
    private CustomSearchJoin[] customSearchJoin;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(TransactionSearch.class, true);

    public TransactionSearch() {
    }

    public TransactionSearch(TransactionSearchBasic basic, AccountSearchBasic accountJoin, AccountingPeriodSearchBasic accountingPeriodJoin, AccountingTransactionSearchBasic accountingTransactionJoin, AccountSearchBasic advanceToApplyAccountJoin, TransactionSearchBasic appliedToTransactionJoin, TransactionSearchBasic applyingTransactionJoin, ItemSearchBasic assemblyJoin, AddressSearchBasic billingAddressJoin, TransactionSearchBasic billingTransactionJoin, BinSearchBasic binNumberJoin, BomSearchBasic bomJoin, BomRevisionSearchBasic bomRevisionJoin, PhoneCallSearchBasic callJoin, SupportCaseSearchBasic caseJoin, ClassificationSearchBasic classJoin, TransactionSearchBasic cogsPurchaseJoin, TransactionSearchBasic cogsSaleJoin, ContactSearchBasic contactPrimaryJoin, TransactionSearchBasic createdFromJoin, CustomerSearchBasic customerJoin, CustomerSearchBasic customerMainJoin, DepartmentSearchBasic departmentJoin, TransactionSearchBasic depositTransactionJoin, EmployeeSearchBasic employeeJoin, CalendarEventSearchBasic eventJoin, ExpenseCategorySearchBasic expenseCategoryJoin, FileSearchBasic fileJoin, LocationSearchBasic fromLocationJoin, TransactionSearchBasic fulfillingTransactionJoin, BillingAccountSearchBasic headerBillingAccountJoin, InstallmentSearchBasic installmentJoin, InventoryDetailSearchBasic inventoryDetailJoin, ItemSearchBasic itemJoin, InventoryNumberSearchBasic itemNumberJoin, JobSearchBasic jobJoin, JobSearchBasic jobMainJoin, CampaignSearchBasic leadSourceJoin, BillingAccountSearchBasic lineBillingAccountJoin, FileSearchBasic lineFileJoin, LocationSearchBasic locationJoin, ManufacturingOperationTaskSearchBasic manufacturingOperationTaskJoin, MessageSearchBasic messagesJoin, EntitySearchBasic nextApproverJoin, OpportunitySearchBasic opportunityJoin, VendorSearchBasic outsourcingVendorJoin, TransactionSearchBasic paidTransactionJoin, PartnerSearchBasic partnerJoin, TransactionSearchBasic payingTransactionJoin, PaymentInstrumentSearchBasic paymentInstrumentJoin, PaymentOptionSearchBasic paymentOptionJoin, PayrollItemSearchBasic payrollItemJoin, ProjectTaskSearchBasic projectTaskJoin, TransactionSearchBasic purchaseOrderJoin, EmployeeSearchBasic requestorJoin, TransactionSearchBasic revCommittingTransactionJoin, ItemRevisionSearchBasic revisionJoin, RevRecScheduleSearchBasic revRecScheduleJoin, TransactionSearchBasic rgPostingTransactionJoin, TransactionSearchBasic salesOrderJoin, EmployeeSearchBasic salesRepJoin, AddressSearchBasic shippingAddressJoin, SubsidiarySearchBasic subsidiaryJoin, TaskSearchBasic taskJoin, SalesTaxItemSearchBasic taxCodeJoin, TaxDetailSearchBasic taxDetailJoin, SalesTaxItemSearchBasic taxItemJoin, TimeBillSearchBasic timeJoin, LocationSearchBasic toLocationJoin, EmployeeSearchBasic userJoin, NoteSearchBasic userNotesJoin, VendorSearchBasic vendorJoin, VendorSearchBasic vendorLineJoin, CustomSearchJoin[] customSearchJoin) {
        this.basic = basic;
        this.accountJoin = accountJoin;
        this.accountingPeriodJoin = accountingPeriodJoin;
        this.accountingTransactionJoin = accountingTransactionJoin;
        this.advanceToApplyAccountJoin = advanceToApplyAccountJoin;
        this.appliedToTransactionJoin = appliedToTransactionJoin;
        this.applyingTransactionJoin = applyingTransactionJoin;
        this.assemblyJoin = assemblyJoin;
        this.billingAddressJoin = billingAddressJoin;
        this.billingTransactionJoin = billingTransactionJoin;
        this.binNumberJoin = binNumberJoin;
        this.bomJoin = bomJoin;
        this.bomRevisionJoin = bomRevisionJoin;
        this.callJoin = callJoin;
        this.caseJoin = caseJoin;
        this.classJoin = classJoin;
        this.cogsPurchaseJoin = cogsPurchaseJoin;
        this.cogsSaleJoin = cogsSaleJoin;
        this.contactPrimaryJoin = contactPrimaryJoin;
        this.createdFromJoin = createdFromJoin;
        this.customerJoin = customerJoin;
        this.customerMainJoin = customerMainJoin;
        this.departmentJoin = departmentJoin;
        this.depositTransactionJoin = depositTransactionJoin;
        this.employeeJoin = employeeJoin;
        this.eventJoin = eventJoin;
        this.expenseCategoryJoin = expenseCategoryJoin;
        this.fileJoin = fileJoin;
        this.fromLocationJoin = fromLocationJoin;
        this.fulfillingTransactionJoin = fulfillingTransactionJoin;
        this.headerBillingAccountJoin = headerBillingAccountJoin;
        this.installmentJoin = installmentJoin;
        this.inventoryDetailJoin = inventoryDetailJoin;
        this.itemJoin = itemJoin;
        this.itemNumberJoin = itemNumberJoin;
        this.jobJoin = jobJoin;
        this.jobMainJoin = jobMainJoin;
        this.leadSourceJoin = leadSourceJoin;
        this.lineBillingAccountJoin = lineBillingAccountJoin;
        this.lineFileJoin = lineFileJoin;
        this.locationJoin = locationJoin;
        this.manufacturingOperationTaskJoin = manufacturingOperationTaskJoin;
        this.messagesJoin = messagesJoin;
        this.nextApproverJoin = nextApproverJoin;
        this.opportunityJoin = opportunityJoin;
        this.outsourcingVendorJoin = outsourcingVendorJoin;
        this.paidTransactionJoin = paidTransactionJoin;
        this.partnerJoin = partnerJoin;
        this.payingTransactionJoin = payingTransactionJoin;
        this.paymentInstrumentJoin = paymentInstrumentJoin;
        this.paymentOptionJoin = paymentOptionJoin;
        this.payrollItemJoin = payrollItemJoin;
        this.projectTaskJoin = projectTaskJoin;
        this.purchaseOrderJoin = purchaseOrderJoin;
        this.requestorJoin = requestorJoin;
        this.revCommittingTransactionJoin = revCommittingTransactionJoin;
        this.revisionJoin = revisionJoin;
        this.revRecScheduleJoin = revRecScheduleJoin;
        this.rgPostingTransactionJoin = rgPostingTransactionJoin;
        this.salesOrderJoin = salesOrderJoin;
        this.salesRepJoin = salesRepJoin;
        this.shippingAddressJoin = shippingAddressJoin;
        this.subsidiaryJoin = subsidiaryJoin;
        this.taskJoin = taskJoin;
        this.taxCodeJoin = taxCodeJoin;
        this.taxDetailJoin = taxDetailJoin;
        this.taxItemJoin = taxItemJoin;
        this.timeJoin = timeJoin;
        this.toLocationJoin = toLocationJoin;
        this.userJoin = userJoin;
        this.userNotesJoin = userNotesJoin;
        this.vendorJoin = vendorJoin;
        this.vendorLineJoin = vendorLineJoin;
        this.customSearchJoin = customSearchJoin;
    }

    public TransactionSearchBasic getBasic() {
        return this.basic;
    }

    public void setBasic(TransactionSearchBasic basic) {
        this.basic = basic;
    }

    public AccountSearchBasic getAccountJoin() {
        return this.accountJoin;
    }

    public void setAccountJoin(AccountSearchBasic accountJoin) {
        this.accountJoin = accountJoin;
    }

    public AccountingPeriodSearchBasic getAccountingPeriodJoin() {
        return this.accountingPeriodJoin;
    }

    public void setAccountingPeriodJoin(AccountingPeriodSearchBasic accountingPeriodJoin) {
        this.accountingPeriodJoin = accountingPeriodJoin;
    }

    public AccountingTransactionSearchBasic getAccountingTransactionJoin() {
        return this.accountingTransactionJoin;
    }

    public void setAccountingTransactionJoin(AccountingTransactionSearchBasic accountingTransactionJoin) {
        this.accountingTransactionJoin = accountingTransactionJoin;
    }

    public AccountSearchBasic getAdvanceToApplyAccountJoin() {
        return this.advanceToApplyAccountJoin;
    }

    public void setAdvanceToApplyAccountJoin(AccountSearchBasic advanceToApplyAccountJoin) {
        this.advanceToApplyAccountJoin = advanceToApplyAccountJoin;
    }

    public TransactionSearchBasic getAppliedToTransactionJoin() {
        return this.appliedToTransactionJoin;
    }

    public void setAppliedToTransactionJoin(TransactionSearchBasic appliedToTransactionJoin) {
        this.appliedToTransactionJoin = appliedToTransactionJoin;
    }

    public TransactionSearchBasic getApplyingTransactionJoin() {
        return this.applyingTransactionJoin;
    }

    public void setApplyingTransactionJoin(TransactionSearchBasic applyingTransactionJoin) {
        this.applyingTransactionJoin = applyingTransactionJoin;
    }

    public ItemSearchBasic getAssemblyJoin() {
        return this.assemblyJoin;
    }

    public void setAssemblyJoin(ItemSearchBasic assemblyJoin) {
        this.assemblyJoin = assemblyJoin;
    }

    public AddressSearchBasic getBillingAddressJoin() {
        return this.billingAddressJoin;
    }

    public void setBillingAddressJoin(AddressSearchBasic billingAddressJoin) {
        this.billingAddressJoin = billingAddressJoin;
    }

    public TransactionSearchBasic getBillingTransactionJoin() {
        return this.billingTransactionJoin;
    }

    public void setBillingTransactionJoin(TransactionSearchBasic billingTransactionJoin) {
        this.billingTransactionJoin = billingTransactionJoin;
    }

    public BinSearchBasic getBinNumberJoin() {
        return this.binNumberJoin;
    }

    public void setBinNumberJoin(BinSearchBasic binNumberJoin) {
        this.binNumberJoin = binNumberJoin;
    }

    public BomSearchBasic getBomJoin() {
        return this.bomJoin;
    }

    public void setBomJoin(BomSearchBasic bomJoin) {
        this.bomJoin = bomJoin;
    }

    public BomRevisionSearchBasic getBomRevisionJoin() {
        return this.bomRevisionJoin;
    }

    public void setBomRevisionJoin(BomRevisionSearchBasic bomRevisionJoin) {
        this.bomRevisionJoin = bomRevisionJoin;
    }

    public PhoneCallSearchBasic getCallJoin() {
        return this.callJoin;
    }

    public void setCallJoin(PhoneCallSearchBasic callJoin) {
        this.callJoin = callJoin;
    }

    public SupportCaseSearchBasic getCaseJoin() {
        return this.caseJoin;
    }

    public void setCaseJoin(SupportCaseSearchBasic caseJoin) {
        this.caseJoin = caseJoin;
    }

    public ClassificationSearchBasic getClassJoin() {
        return this.classJoin;
    }

    public void setClassJoin(ClassificationSearchBasic classJoin) {
        this.classJoin = classJoin;
    }

    public TransactionSearchBasic getCogsPurchaseJoin() {
        return this.cogsPurchaseJoin;
    }

    public void setCogsPurchaseJoin(TransactionSearchBasic cogsPurchaseJoin) {
        this.cogsPurchaseJoin = cogsPurchaseJoin;
    }

    public TransactionSearchBasic getCogsSaleJoin() {
        return this.cogsSaleJoin;
    }

    public void setCogsSaleJoin(TransactionSearchBasic cogsSaleJoin) {
        this.cogsSaleJoin = cogsSaleJoin;
    }

    public ContactSearchBasic getContactPrimaryJoin() {
        return this.contactPrimaryJoin;
    }

    public void setContactPrimaryJoin(ContactSearchBasic contactPrimaryJoin) {
        this.contactPrimaryJoin = contactPrimaryJoin;
    }

    public TransactionSearchBasic getCreatedFromJoin() {
        return this.createdFromJoin;
    }

    public void setCreatedFromJoin(TransactionSearchBasic createdFromJoin) {
        this.createdFromJoin = createdFromJoin;
    }

    public CustomerSearchBasic getCustomerJoin() {
        return this.customerJoin;
    }

    public void setCustomerJoin(CustomerSearchBasic customerJoin) {
        this.customerJoin = customerJoin;
    }

    public CustomerSearchBasic getCustomerMainJoin() {
        return this.customerMainJoin;
    }

    public void setCustomerMainJoin(CustomerSearchBasic customerMainJoin) {
        this.customerMainJoin = customerMainJoin;
    }

    public DepartmentSearchBasic getDepartmentJoin() {
        return this.departmentJoin;
    }

    public void setDepartmentJoin(DepartmentSearchBasic departmentJoin) {
        this.departmentJoin = departmentJoin;
    }

    public TransactionSearchBasic getDepositTransactionJoin() {
        return this.depositTransactionJoin;
    }

    public void setDepositTransactionJoin(TransactionSearchBasic depositTransactionJoin) {
        this.depositTransactionJoin = depositTransactionJoin;
    }

    public EmployeeSearchBasic getEmployeeJoin() {
        return this.employeeJoin;
    }

    public void setEmployeeJoin(EmployeeSearchBasic employeeJoin) {
        this.employeeJoin = employeeJoin;
    }

    public CalendarEventSearchBasic getEventJoin() {
        return this.eventJoin;
    }

    public void setEventJoin(CalendarEventSearchBasic eventJoin) {
        this.eventJoin = eventJoin;
    }

    public ExpenseCategorySearchBasic getExpenseCategoryJoin() {
        return this.expenseCategoryJoin;
    }

    public void setExpenseCategoryJoin(ExpenseCategorySearchBasic expenseCategoryJoin) {
        this.expenseCategoryJoin = expenseCategoryJoin;
    }

    public FileSearchBasic getFileJoin() {
        return this.fileJoin;
    }

    public void setFileJoin(FileSearchBasic fileJoin) {
        this.fileJoin = fileJoin;
    }

    public LocationSearchBasic getFromLocationJoin() {
        return this.fromLocationJoin;
    }

    public void setFromLocationJoin(LocationSearchBasic fromLocationJoin) {
        this.fromLocationJoin = fromLocationJoin;
    }

    public TransactionSearchBasic getFulfillingTransactionJoin() {
        return this.fulfillingTransactionJoin;
    }

    public void setFulfillingTransactionJoin(TransactionSearchBasic fulfillingTransactionJoin) {
        this.fulfillingTransactionJoin = fulfillingTransactionJoin;
    }

    public BillingAccountSearchBasic getHeaderBillingAccountJoin() {
        return this.headerBillingAccountJoin;
    }

    public void setHeaderBillingAccountJoin(BillingAccountSearchBasic headerBillingAccountJoin) {
        this.headerBillingAccountJoin = headerBillingAccountJoin;
    }

    public InstallmentSearchBasic getInstallmentJoin() {
        return this.installmentJoin;
    }

    public void setInstallmentJoin(InstallmentSearchBasic installmentJoin) {
        this.installmentJoin = installmentJoin;
    }

    public InventoryDetailSearchBasic getInventoryDetailJoin() {
        return this.inventoryDetailJoin;
    }

    public void setInventoryDetailJoin(InventoryDetailSearchBasic inventoryDetailJoin) {
        this.inventoryDetailJoin = inventoryDetailJoin;
    }

    public ItemSearchBasic getItemJoin() {
        return this.itemJoin;
    }

    public void setItemJoin(ItemSearchBasic itemJoin) {
        this.itemJoin = itemJoin;
    }

    public InventoryNumberSearchBasic getItemNumberJoin() {
        return this.itemNumberJoin;
    }

    public void setItemNumberJoin(InventoryNumberSearchBasic itemNumberJoin) {
        this.itemNumberJoin = itemNumberJoin;
    }

    public JobSearchBasic getJobJoin() {
        return this.jobJoin;
    }

    public void setJobJoin(JobSearchBasic jobJoin) {
        this.jobJoin = jobJoin;
    }

    public JobSearchBasic getJobMainJoin() {
        return this.jobMainJoin;
    }

    public void setJobMainJoin(JobSearchBasic jobMainJoin) {
        this.jobMainJoin = jobMainJoin;
    }

    public CampaignSearchBasic getLeadSourceJoin() {
        return this.leadSourceJoin;
    }

    public void setLeadSourceJoin(CampaignSearchBasic leadSourceJoin) {
        this.leadSourceJoin = leadSourceJoin;
    }

    public BillingAccountSearchBasic getLineBillingAccountJoin() {
        return this.lineBillingAccountJoin;
    }

    public void setLineBillingAccountJoin(BillingAccountSearchBasic lineBillingAccountJoin) {
        this.lineBillingAccountJoin = lineBillingAccountJoin;
    }

    public FileSearchBasic getLineFileJoin() {
        return this.lineFileJoin;
    }

    public void setLineFileJoin(FileSearchBasic lineFileJoin) {
        this.lineFileJoin = lineFileJoin;
    }

    public LocationSearchBasic getLocationJoin() {
        return this.locationJoin;
    }

    public void setLocationJoin(LocationSearchBasic locationJoin) {
        this.locationJoin = locationJoin;
    }

    public ManufacturingOperationTaskSearchBasic getManufacturingOperationTaskJoin() {
        return this.manufacturingOperationTaskJoin;
    }

    public void setManufacturingOperationTaskJoin(ManufacturingOperationTaskSearchBasic manufacturingOperationTaskJoin) {
        this.manufacturingOperationTaskJoin = manufacturingOperationTaskJoin;
    }

    public MessageSearchBasic getMessagesJoin() {
        return this.messagesJoin;
    }

    public void setMessagesJoin(MessageSearchBasic messagesJoin) {
        this.messagesJoin = messagesJoin;
    }

    public EntitySearchBasic getNextApproverJoin() {
        return this.nextApproverJoin;
    }

    public void setNextApproverJoin(EntitySearchBasic nextApproverJoin) {
        this.nextApproverJoin = nextApproverJoin;
    }

    public OpportunitySearchBasic getOpportunityJoin() {
        return this.opportunityJoin;
    }

    public void setOpportunityJoin(OpportunitySearchBasic opportunityJoin) {
        this.opportunityJoin = opportunityJoin;
    }

    public VendorSearchBasic getOutsourcingVendorJoin() {
        return this.outsourcingVendorJoin;
    }

    public void setOutsourcingVendorJoin(VendorSearchBasic outsourcingVendorJoin) {
        this.outsourcingVendorJoin = outsourcingVendorJoin;
    }

    public TransactionSearchBasic getPaidTransactionJoin() {
        return this.paidTransactionJoin;
    }

    public void setPaidTransactionJoin(TransactionSearchBasic paidTransactionJoin) {
        this.paidTransactionJoin = paidTransactionJoin;
    }

    public PartnerSearchBasic getPartnerJoin() {
        return this.partnerJoin;
    }

    public void setPartnerJoin(PartnerSearchBasic partnerJoin) {
        this.partnerJoin = partnerJoin;
    }

    public TransactionSearchBasic getPayingTransactionJoin() {
        return this.payingTransactionJoin;
    }

    public void setPayingTransactionJoin(TransactionSearchBasic payingTransactionJoin) {
        this.payingTransactionJoin = payingTransactionJoin;
    }

    public PaymentInstrumentSearchBasic getPaymentInstrumentJoin() {
        return this.paymentInstrumentJoin;
    }

    public void setPaymentInstrumentJoin(PaymentInstrumentSearchBasic paymentInstrumentJoin) {
        this.paymentInstrumentJoin = paymentInstrumentJoin;
    }

    public PaymentOptionSearchBasic getPaymentOptionJoin() {
        return this.paymentOptionJoin;
    }

    public void setPaymentOptionJoin(PaymentOptionSearchBasic paymentOptionJoin) {
        this.paymentOptionJoin = paymentOptionJoin;
    }

    public PayrollItemSearchBasic getPayrollItemJoin() {
        return this.payrollItemJoin;
    }

    public void setPayrollItemJoin(PayrollItemSearchBasic payrollItemJoin) {
        this.payrollItemJoin = payrollItemJoin;
    }

    public ProjectTaskSearchBasic getProjectTaskJoin() {
        return this.projectTaskJoin;
    }

    public void setProjectTaskJoin(ProjectTaskSearchBasic projectTaskJoin) {
        this.projectTaskJoin = projectTaskJoin;
    }

    public TransactionSearchBasic getPurchaseOrderJoin() {
        return this.purchaseOrderJoin;
    }

    public void setPurchaseOrderJoin(TransactionSearchBasic purchaseOrderJoin) {
        this.purchaseOrderJoin = purchaseOrderJoin;
    }

    public EmployeeSearchBasic getRequestorJoin() {
        return this.requestorJoin;
    }

    public void setRequestorJoin(EmployeeSearchBasic requestorJoin) {
        this.requestorJoin = requestorJoin;
    }

    public TransactionSearchBasic getRevCommittingTransactionJoin() {
        return this.revCommittingTransactionJoin;
    }

    public void setRevCommittingTransactionJoin(TransactionSearchBasic revCommittingTransactionJoin) {
        this.revCommittingTransactionJoin = revCommittingTransactionJoin;
    }

    public ItemRevisionSearchBasic getRevisionJoin() {
        return this.revisionJoin;
    }

    public void setRevisionJoin(ItemRevisionSearchBasic revisionJoin) {
        this.revisionJoin = revisionJoin;
    }

    public RevRecScheduleSearchBasic getRevRecScheduleJoin() {
        return this.revRecScheduleJoin;
    }

    public void setRevRecScheduleJoin(RevRecScheduleSearchBasic revRecScheduleJoin) {
        this.revRecScheduleJoin = revRecScheduleJoin;
    }

    public TransactionSearchBasic getRgPostingTransactionJoin() {
        return this.rgPostingTransactionJoin;
    }

    public void setRgPostingTransactionJoin(TransactionSearchBasic rgPostingTransactionJoin) {
        this.rgPostingTransactionJoin = rgPostingTransactionJoin;
    }

    public TransactionSearchBasic getSalesOrderJoin() {
        return this.salesOrderJoin;
    }

    public void setSalesOrderJoin(TransactionSearchBasic salesOrderJoin) {
        this.salesOrderJoin = salesOrderJoin;
    }

    public EmployeeSearchBasic getSalesRepJoin() {
        return this.salesRepJoin;
    }

    public void setSalesRepJoin(EmployeeSearchBasic salesRepJoin) {
        this.salesRepJoin = salesRepJoin;
    }

    public AddressSearchBasic getShippingAddressJoin() {
        return this.shippingAddressJoin;
    }

    public void setShippingAddressJoin(AddressSearchBasic shippingAddressJoin) {
        this.shippingAddressJoin = shippingAddressJoin;
    }

    public SubsidiarySearchBasic getSubsidiaryJoin() {
        return this.subsidiaryJoin;
    }

    public void setSubsidiaryJoin(SubsidiarySearchBasic subsidiaryJoin) {
        this.subsidiaryJoin = subsidiaryJoin;
    }

    public TaskSearchBasic getTaskJoin() {
        return this.taskJoin;
    }

    public void setTaskJoin(TaskSearchBasic taskJoin) {
        this.taskJoin = taskJoin;
    }

    public SalesTaxItemSearchBasic getTaxCodeJoin() {
        return this.taxCodeJoin;
    }

    public void setTaxCodeJoin(SalesTaxItemSearchBasic taxCodeJoin) {
        this.taxCodeJoin = taxCodeJoin;
    }

    public TaxDetailSearchBasic getTaxDetailJoin() {
        return this.taxDetailJoin;
    }

    public void setTaxDetailJoin(TaxDetailSearchBasic taxDetailJoin) {
        this.taxDetailJoin = taxDetailJoin;
    }

    public SalesTaxItemSearchBasic getTaxItemJoin() {
        return this.taxItemJoin;
    }

    public void setTaxItemJoin(SalesTaxItemSearchBasic taxItemJoin) {
        this.taxItemJoin = taxItemJoin;
    }

    public TimeBillSearchBasic getTimeJoin() {
        return this.timeJoin;
    }

    public void setTimeJoin(TimeBillSearchBasic timeJoin) {
        this.timeJoin = timeJoin;
    }

    public LocationSearchBasic getToLocationJoin() {
        return this.toLocationJoin;
    }

    public void setToLocationJoin(LocationSearchBasic toLocationJoin) {
        this.toLocationJoin = toLocationJoin;
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

    public VendorSearchBasic getVendorJoin() {
        return this.vendorJoin;
    }

    public void setVendorJoin(VendorSearchBasic vendorJoin) {
        this.vendorJoin = vendorJoin;
    }

    public VendorSearchBasic getVendorLineJoin() {
        return this.vendorLineJoin;
    }

    public void setVendorLineJoin(VendorSearchBasic vendorLineJoin) {
        this.vendorLineJoin = vendorLineJoin;
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
        if (!(obj instanceof TransactionSearch)) {
            return false;
        }
        TransactionSearch other = (TransactionSearch)obj;
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
        boolean _equals = super.equals(obj) && (this.basic == null && other.getBasic() == null || this.basic != null && this.basic.equals(other.getBasic())) && (this.accountJoin == null && other.getAccountJoin() == null || this.accountJoin != null && this.accountJoin.equals(other.getAccountJoin())) && (this.accountingPeriodJoin == null && other.getAccountingPeriodJoin() == null || this.accountingPeriodJoin != null && this.accountingPeriodJoin.equals(other.getAccountingPeriodJoin())) && (this.accountingTransactionJoin == null && other.getAccountingTransactionJoin() == null || this.accountingTransactionJoin != null && this.accountingTransactionJoin.equals(other.getAccountingTransactionJoin())) && (this.advanceToApplyAccountJoin == null && other.getAdvanceToApplyAccountJoin() == null || this.advanceToApplyAccountJoin != null && this.advanceToApplyAccountJoin.equals(other.getAdvanceToApplyAccountJoin())) && (this.appliedToTransactionJoin == null && other.getAppliedToTransactionJoin() == null || this.appliedToTransactionJoin != null && this.appliedToTransactionJoin.equals(other.getAppliedToTransactionJoin())) && (this.applyingTransactionJoin == null && other.getApplyingTransactionJoin() == null || this.applyingTransactionJoin != null && this.applyingTransactionJoin.equals(other.getApplyingTransactionJoin())) && (this.assemblyJoin == null && other.getAssemblyJoin() == null || this.assemblyJoin != null && this.assemblyJoin.equals(other.getAssemblyJoin())) && (this.billingAddressJoin == null && other.getBillingAddressJoin() == null || this.billingAddressJoin != null && this.billingAddressJoin.equals(other.getBillingAddressJoin())) && (this.billingTransactionJoin == null && other.getBillingTransactionJoin() == null || this.billingTransactionJoin != null && this.billingTransactionJoin.equals(other.getBillingTransactionJoin())) && (this.binNumberJoin == null && other.getBinNumberJoin() == null || this.binNumberJoin != null && this.binNumberJoin.equals(other.getBinNumberJoin())) && (this.bomJoin == null && other.getBomJoin() == null || this.bomJoin != null && this.bomJoin.equals(other.getBomJoin())) && (this.bomRevisionJoin == null && other.getBomRevisionJoin() == null || this.bomRevisionJoin != null && this.bomRevisionJoin.equals(other.getBomRevisionJoin())) && (this.callJoin == null && other.getCallJoin() == null || this.callJoin != null && this.callJoin.equals(other.getCallJoin())) && (this.caseJoin == null && other.getCaseJoin() == null || this.caseJoin != null && this.caseJoin.equals(other.getCaseJoin())) && (this.classJoin == null && other.getClassJoin() == null || this.classJoin != null && this.classJoin.equals(other.getClassJoin())) && (this.cogsPurchaseJoin == null && other.getCogsPurchaseJoin() == null || this.cogsPurchaseJoin != null && this.cogsPurchaseJoin.equals(other.getCogsPurchaseJoin())) && (this.cogsSaleJoin == null && other.getCogsSaleJoin() == null || this.cogsSaleJoin != null && this.cogsSaleJoin.equals(other.getCogsSaleJoin())) && (this.contactPrimaryJoin == null && other.getContactPrimaryJoin() == null || this.contactPrimaryJoin != null && this.contactPrimaryJoin.equals(other.getContactPrimaryJoin())) && (this.createdFromJoin == null && other.getCreatedFromJoin() == null || this.createdFromJoin != null && this.createdFromJoin.equals(other.getCreatedFromJoin())) && (this.customerJoin == null && other.getCustomerJoin() == null || this.customerJoin != null && this.customerJoin.equals(other.getCustomerJoin())) && (this.customerMainJoin == null && other.getCustomerMainJoin() == null || this.customerMainJoin != null && this.customerMainJoin.equals(other.getCustomerMainJoin())) && (this.departmentJoin == null && other.getDepartmentJoin() == null || this.departmentJoin != null && this.departmentJoin.equals(other.getDepartmentJoin())) && (this.depositTransactionJoin == null && other.getDepositTransactionJoin() == null || this.depositTransactionJoin != null && this.depositTransactionJoin.equals(other.getDepositTransactionJoin())) && (this.employeeJoin == null && other.getEmployeeJoin() == null || this.employeeJoin != null && this.employeeJoin.equals(other.getEmployeeJoin())) && (this.eventJoin == null && other.getEventJoin() == null || this.eventJoin != null && this.eventJoin.equals(other.getEventJoin())) && (this.expenseCategoryJoin == null && other.getExpenseCategoryJoin() == null || this.expenseCategoryJoin != null && this.expenseCategoryJoin.equals(other.getExpenseCategoryJoin())) && (this.fileJoin == null && other.getFileJoin() == null || this.fileJoin != null && this.fileJoin.equals(other.getFileJoin())) && (this.fromLocationJoin == null && other.getFromLocationJoin() == null || this.fromLocationJoin != null && this.fromLocationJoin.equals(other.getFromLocationJoin())) && (this.fulfillingTransactionJoin == null && other.getFulfillingTransactionJoin() == null || this.fulfillingTransactionJoin != null && this.fulfillingTransactionJoin.equals(other.getFulfillingTransactionJoin())) && (this.headerBillingAccountJoin == null && other.getHeaderBillingAccountJoin() == null || this.headerBillingAccountJoin != null && this.headerBillingAccountJoin.equals(other.getHeaderBillingAccountJoin())) && (this.installmentJoin == null && other.getInstallmentJoin() == null || this.installmentJoin != null && this.installmentJoin.equals(other.getInstallmentJoin())) && (this.inventoryDetailJoin == null && other.getInventoryDetailJoin() == null || this.inventoryDetailJoin != null && this.inventoryDetailJoin.equals(other.getInventoryDetailJoin())) && (this.itemJoin == null && other.getItemJoin() == null || this.itemJoin != null && this.itemJoin.equals(other.getItemJoin())) && (this.itemNumberJoin == null && other.getItemNumberJoin() == null || this.itemNumberJoin != null && this.itemNumberJoin.equals(other.getItemNumberJoin())) && (this.jobJoin == null && other.getJobJoin() == null || this.jobJoin != null && this.jobJoin.equals(other.getJobJoin())) && (this.jobMainJoin == null && other.getJobMainJoin() == null || this.jobMainJoin != null && this.jobMainJoin.equals(other.getJobMainJoin())) && (this.leadSourceJoin == null && other.getLeadSourceJoin() == null || this.leadSourceJoin != null && this.leadSourceJoin.equals(other.getLeadSourceJoin())) && (this.lineBillingAccountJoin == null && other.getLineBillingAccountJoin() == null || this.lineBillingAccountJoin != null && this.lineBillingAccountJoin.equals(other.getLineBillingAccountJoin())) && (this.lineFileJoin == null && other.getLineFileJoin() == null || this.lineFileJoin != null && this.lineFileJoin.equals(other.getLineFileJoin())) && (this.locationJoin == null && other.getLocationJoin() == null || this.locationJoin != null && this.locationJoin.equals(other.getLocationJoin())) && (this.manufacturingOperationTaskJoin == null && other.getManufacturingOperationTaskJoin() == null || this.manufacturingOperationTaskJoin != null && this.manufacturingOperationTaskJoin.equals(other.getManufacturingOperationTaskJoin())) && (this.messagesJoin == null && other.getMessagesJoin() == null || this.messagesJoin != null && this.messagesJoin.equals(other.getMessagesJoin())) && (this.nextApproverJoin == null && other.getNextApproverJoin() == null || this.nextApproverJoin != null && this.nextApproverJoin.equals(other.getNextApproverJoin())) && (this.opportunityJoin == null && other.getOpportunityJoin() == null || this.opportunityJoin != null && this.opportunityJoin.equals(other.getOpportunityJoin())) && (this.outsourcingVendorJoin == null && other.getOutsourcingVendorJoin() == null || this.outsourcingVendorJoin != null && this.outsourcingVendorJoin.equals(other.getOutsourcingVendorJoin())) && (this.paidTransactionJoin == null && other.getPaidTransactionJoin() == null || this.paidTransactionJoin != null && this.paidTransactionJoin.equals(other.getPaidTransactionJoin())) && (this.partnerJoin == null && other.getPartnerJoin() == null || this.partnerJoin != null && this.partnerJoin.equals(other.getPartnerJoin())) && (this.payingTransactionJoin == null && other.getPayingTransactionJoin() == null || this.payingTransactionJoin != null && this.payingTransactionJoin.equals(other.getPayingTransactionJoin())) && (this.paymentInstrumentJoin == null && other.getPaymentInstrumentJoin() == null || this.paymentInstrumentJoin != null && this.paymentInstrumentJoin.equals(other.getPaymentInstrumentJoin())) && (this.paymentOptionJoin == null && other.getPaymentOptionJoin() == null || this.paymentOptionJoin != null && this.paymentOptionJoin.equals(other.getPaymentOptionJoin())) && (this.payrollItemJoin == null && other.getPayrollItemJoin() == null || this.payrollItemJoin != null && this.payrollItemJoin.equals(other.getPayrollItemJoin())) && (this.projectTaskJoin == null && other.getProjectTaskJoin() == null || this.projectTaskJoin != null && this.projectTaskJoin.equals(other.getProjectTaskJoin())) && (this.purchaseOrderJoin == null && other.getPurchaseOrderJoin() == null || this.purchaseOrderJoin != null && this.purchaseOrderJoin.equals(other.getPurchaseOrderJoin())) && (this.requestorJoin == null && other.getRequestorJoin() == null || this.requestorJoin != null && this.requestorJoin.equals(other.getRequestorJoin())) && (this.revCommittingTransactionJoin == null && other.getRevCommittingTransactionJoin() == null || this.revCommittingTransactionJoin != null && this.revCommittingTransactionJoin.equals(other.getRevCommittingTransactionJoin())) && (this.revisionJoin == null && other.getRevisionJoin() == null || this.revisionJoin != null && this.revisionJoin.equals(other.getRevisionJoin())) && (this.revRecScheduleJoin == null && other.getRevRecScheduleJoin() == null || this.revRecScheduleJoin != null && this.revRecScheduleJoin.equals(other.getRevRecScheduleJoin())) && (this.rgPostingTransactionJoin == null && other.getRgPostingTransactionJoin() == null || this.rgPostingTransactionJoin != null && this.rgPostingTransactionJoin.equals(other.getRgPostingTransactionJoin())) && (this.salesOrderJoin == null && other.getSalesOrderJoin() == null || this.salesOrderJoin != null && this.salesOrderJoin.equals(other.getSalesOrderJoin())) && (this.salesRepJoin == null && other.getSalesRepJoin() == null || this.salesRepJoin != null && this.salesRepJoin.equals(other.getSalesRepJoin())) && (this.shippingAddressJoin == null && other.getShippingAddressJoin() == null || this.shippingAddressJoin != null && this.shippingAddressJoin.equals(other.getShippingAddressJoin())) && (this.subsidiaryJoin == null && other.getSubsidiaryJoin() == null || this.subsidiaryJoin != null && this.subsidiaryJoin.equals(other.getSubsidiaryJoin())) && (this.taskJoin == null && other.getTaskJoin() == null || this.taskJoin != null && this.taskJoin.equals(other.getTaskJoin())) && (this.taxCodeJoin == null && other.getTaxCodeJoin() == null || this.taxCodeJoin != null && this.taxCodeJoin.equals(other.getTaxCodeJoin())) && (this.taxDetailJoin == null && other.getTaxDetailJoin() == null || this.taxDetailJoin != null && this.taxDetailJoin.equals(other.getTaxDetailJoin())) && (this.taxItemJoin == null && other.getTaxItemJoin() == null || this.taxItemJoin != null && this.taxItemJoin.equals(other.getTaxItemJoin())) && (this.timeJoin == null && other.getTimeJoin() == null || this.timeJoin != null && this.timeJoin.equals(other.getTimeJoin())) && (this.toLocationJoin == null && other.getToLocationJoin() == null || this.toLocationJoin != null && this.toLocationJoin.equals(other.getToLocationJoin())) && (this.userJoin == null && other.getUserJoin() == null || this.userJoin != null && this.userJoin.equals(other.getUserJoin())) && (this.userNotesJoin == null && other.getUserNotesJoin() == null || this.userNotesJoin != null && this.userNotesJoin.equals(other.getUserNotesJoin())) && (this.vendorJoin == null && other.getVendorJoin() == null || this.vendorJoin != null && this.vendorJoin.equals(other.getVendorJoin())) && (this.vendorLineJoin == null && other.getVendorLineJoin() == null || this.vendorLineJoin != null && this.vendorLineJoin.equals(other.getVendorLineJoin())) && (this.customSearchJoin == null && other.getCustomSearchJoin() == null || this.customSearchJoin != null && Arrays.equals(this.customSearchJoin, other.getCustomSearchJoin()));
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
        if (this.getAccountJoin() != null) {
            _hashCode += this.getAccountJoin().hashCode();
        }
        if (this.getAccountingPeriodJoin() != null) {
            _hashCode += this.getAccountingPeriodJoin().hashCode();
        }
        if (this.getAccountingTransactionJoin() != null) {
            _hashCode += this.getAccountingTransactionJoin().hashCode();
        }
        if (this.getAdvanceToApplyAccountJoin() != null) {
            _hashCode += this.getAdvanceToApplyAccountJoin().hashCode();
        }
        if (this.getAppliedToTransactionJoin() != null) {
            _hashCode += this.getAppliedToTransactionJoin().hashCode();
        }
        if (this.getApplyingTransactionJoin() != null) {
            _hashCode += this.getApplyingTransactionJoin().hashCode();
        }
        if (this.getAssemblyJoin() != null) {
            _hashCode += this.getAssemblyJoin().hashCode();
        }
        if (this.getBillingAddressJoin() != null) {
            _hashCode += this.getBillingAddressJoin().hashCode();
        }
        if (this.getBillingTransactionJoin() != null) {
            _hashCode += this.getBillingTransactionJoin().hashCode();
        }
        if (this.getBinNumberJoin() != null) {
            _hashCode += this.getBinNumberJoin().hashCode();
        }
        if (this.getBomJoin() != null) {
            _hashCode += this.getBomJoin().hashCode();
        }
        if (this.getBomRevisionJoin() != null) {
            _hashCode += this.getBomRevisionJoin().hashCode();
        }
        if (this.getCallJoin() != null) {
            _hashCode += this.getCallJoin().hashCode();
        }
        if (this.getCaseJoin() != null) {
            _hashCode += this.getCaseJoin().hashCode();
        }
        if (this.getClassJoin() != null) {
            _hashCode += this.getClassJoin().hashCode();
        }
        if (this.getCogsPurchaseJoin() != null) {
            _hashCode += this.getCogsPurchaseJoin().hashCode();
        }
        if (this.getCogsSaleJoin() != null) {
            _hashCode += this.getCogsSaleJoin().hashCode();
        }
        if (this.getContactPrimaryJoin() != null) {
            _hashCode += this.getContactPrimaryJoin().hashCode();
        }
        if (this.getCreatedFromJoin() != null) {
            _hashCode += this.getCreatedFromJoin().hashCode();
        }
        if (this.getCustomerJoin() != null) {
            _hashCode += this.getCustomerJoin().hashCode();
        }
        if (this.getCustomerMainJoin() != null) {
            _hashCode += this.getCustomerMainJoin().hashCode();
        }
        if (this.getDepartmentJoin() != null) {
            _hashCode += this.getDepartmentJoin().hashCode();
        }
        if (this.getDepositTransactionJoin() != null) {
            _hashCode += this.getDepositTransactionJoin().hashCode();
        }
        if (this.getEmployeeJoin() != null) {
            _hashCode += this.getEmployeeJoin().hashCode();
        }
        if (this.getEventJoin() != null) {
            _hashCode += this.getEventJoin().hashCode();
        }
        if (this.getExpenseCategoryJoin() != null) {
            _hashCode += this.getExpenseCategoryJoin().hashCode();
        }
        if (this.getFileJoin() != null) {
            _hashCode += this.getFileJoin().hashCode();
        }
        if (this.getFromLocationJoin() != null) {
            _hashCode += this.getFromLocationJoin().hashCode();
        }
        if (this.getFulfillingTransactionJoin() != null) {
            _hashCode += this.getFulfillingTransactionJoin().hashCode();
        }
        if (this.getHeaderBillingAccountJoin() != null) {
            _hashCode += this.getHeaderBillingAccountJoin().hashCode();
        }
        if (this.getInstallmentJoin() != null) {
            _hashCode += this.getInstallmentJoin().hashCode();
        }
        if (this.getInventoryDetailJoin() != null) {
            _hashCode += this.getInventoryDetailJoin().hashCode();
        }
        if (this.getItemJoin() != null) {
            _hashCode += this.getItemJoin().hashCode();
        }
        if (this.getItemNumberJoin() != null) {
            _hashCode += this.getItemNumberJoin().hashCode();
        }
        if (this.getJobJoin() != null) {
            _hashCode += this.getJobJoin().hashCode();
        }
        if (this.getJobMainJoin() != null) {
            _hashCode += this.getJobMainJoin().hashCode();
        }
        if (this.getLeadSourceJoin() != null) {
            _hashCode += this.getLeadSourceJoin().hashCode();
        }
        if (this.getLineBillingAccountJoin() != null) {
            _hashCode += this.getLineBillingAccountJoin().hashCode();
        }
        if (this.getLineFileJoin() != null) {
            _hashCode += this.getLineFileJoin().hashCode();
        }
        if (this.getLocationJoin() != null) {
            _hashCode += this.getLocationJoin().hashCode();
        }
        if (this.getManufacturingOperationTaskJoin() != null) {
            _hashCode += this.getManufacturingOperationTaskJoin().hashCode();
        }
        if (this.getMessagesJoin() != null) {
            _hashCode += this.getMessagesJoin().hashCode();
        }
        if (this.getNextApproverJoin() != null) {
            _hashCode += this.getNextApproverJoin().hashCode();
        }
        if (this.getOpportunityJoin() != null) {
            _hashCode += this.getOpportunityJoin().hashCode();
        }
        if (this.getOutsourcingVendorJoin() != null) {
            _hashCode += this.getOutsourcingVendorJoin().hashCode();
        }
        if (this.getPaidTransactionJoin() != null) {
            _hashCode += this.getPaidTransactionJoin().hashCode();
        }
        if (this.getPartnerJoin() != null) {
            _hashCode += this.getPartnerJoin().hashCode();
        }
        if (this.getPayingTransactionJoin() != null) {
            _hashCode += this.getPayingTransactionJoin().hashCode();
        }
        if (this.getPaymentInstrumentJoin() != null) {
            _hashCode += this.getPaymentInstrumentJoin().hashCode();
        }
        if (this.getPaymentOptionJoin() != null) {
            _hashCode += this.getPaymentOptionJoin().hashCode();
        }
        if (this.getPayrollItemJoin() != null) {
            _hashCode += this.getPayrollItemJoin().hashCode();
        }
        if (this.getProjectTaskJoin() != null) {
            _hashCode += this.getProjectTaskJoin().hashCode();
        }
        if (this.getPurchaseOrderJoin() != null) {
            _hashCode += this.getPurchaseOrderJoin().hashCode();
        }
        if (this.getRequestorJoin() != null) {
            _hashCode += this.getRequestorJoin().hashCode();
        }
        if (this.getRevCommittingTransactionJoin() != null) {
            _hashCode += this.getRevCommittingTransactionJoin().hashCode();
        }
        if (this.getRevisionJoin() != null) {
            _hashCode += this.getRevisionJoin().hashCode();
        }
        if (this.getRevRecScheduleJoin() != null) {
            _hashCode += this.getRevRecScheduleJoin().hashCode();
        }
        if (this.getRgPostingTransactionJoin() != null) {
            _hashCode += this.getRgPostingTransactionJoin().hashCode();
        }
        if (this.getSalesOrderJoin() != null) {
            _hashCode += this.getSalesOrderJoin().hashCode();
        }
        if (this.getSalesRepJoin() != null) {
            _hashCode += this.getSalesRepJoin().hashCode();
        }
        if (this.getShippingAddressJoin() != null) {
            _hashCode += this.getShippingAddressJoin().hashCode();
        }
        if (this.getSubsidiaryJoin() != null) {
            _hashCode += this.getSubsidiaryJoin().hashCode();
        }
        if (this.getTaskJoin() != null) {
            _hashCode += this.getTaskJoin().hashCode();
        }
        if (this.getTaxCodeJoin() != null) {
            _hashCode += this.getTaxCodeJoin().hashCode();
        }
        if (this.getTaxDetailJoin() != null) {
            _hashCode += this.getTaxDetailJoin().hashCode();
        }
        if (this.getTaxItemJoin() != null) {
            _hashCode += this.getTaxItemJoin().hashCode();
        }
        if (this.getTimeJoin() != null) {
            _hashCode += this.getTimeJoin().hashCode();
        }
        if (this.getToLocationJoin() != null) {
            _hashCode += this.getToLocationJoin().hashCode();
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
        if (this.getVendorLineJoin() != null) {
            _hashCode += this.getVendorLineJoin().hashCode();
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
        typeDesc.setXmlType(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "TransactionSearch"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TransactionSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("accountJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "accountJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "AccountSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("accountingPeriodJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "accountingPeriodJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "AccountingPeriodSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("accountingTransactionJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "accountingTransactionJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "AccountingTransactionSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("advanceToApplyAccountJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "advanceToApplyAccountJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "AccountSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("appliedToTransactionJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "appliedToTransactionJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TransactionSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("applyingTransactionJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "applyingTransactionJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TransactionSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("assemblyJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "assemblyJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ItemSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billingAddressJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "billingAddressJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "AddressSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billingTransactionJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "billingTransactionJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TransactionSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("binNumberJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "binNumberJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "BinSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("bomJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "bomJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "BomSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("bomRevisionJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "bomRevisionJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "BomRevisionSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("callJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "callJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "PhoneCallSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("caseJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "caseJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "SupportCaseSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("classJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "classJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ClassificationSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("cogsPurchaseJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "cogsPurchaseJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TransactionSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("cogsSaleJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "cogsSaleJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TransactionSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("contactPrimaryJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "contactPrimaryJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ContactSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("createdFromJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "createdFromJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TransactionSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customerJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "customerJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "CustomerSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customerMainJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "customerMainJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "CustomerSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("departmentJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "departmentJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "DepartmentSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("depositTransactionJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "depositTransactionJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TransactionSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("employeeJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "employeeJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "EmployeeSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("eventJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "eventJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "CalendarEventSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("expenseCategoryJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "expenseCategoryJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ExpenseCategorySearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fileJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "fileJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "FileSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fromLocationJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "fromLocationJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "LocationSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fulfillingTransactionJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "fulfillingTransactionJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TransactionSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("headerBillingAccountJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "headerBillingAccountJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "BillingAccountSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("installmentJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "installmentJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "InstallmentSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("inventoryDetailJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "inventoryDetailJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "InventoryDetailSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "itemJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ItemSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemNumberJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "itemNumberJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "InventoryNumberSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("jobJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "jobJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "JobSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("jobMainJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "jobMainJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "JobSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("leadSourceJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "leadSourceJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "CampaignSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lineBillingAccountJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "lineBillingAccountJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "BillingAccountSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lineFileJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "lineFileJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "FileSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "locationJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "LocationSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("manufacturingOperationTaskJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "manufacturingOperationTaskJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ManufacturingOperationTaskSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("messagesJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "messagesJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "MessageSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("nextApproverJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "nextApproverJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "EntitySearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("opportunityJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "opportunityJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "OpportunitySearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("outsourcingVendorJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "outsourcingVendorJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "VendorSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("paidTransactionJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "paidTransactionJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TransactionSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("partnerJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "partnerJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "PartnerSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("payingTransactionJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "payingTransactionJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TransactionSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("paymentInstrumentJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "paymentInstrumentJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "PaymentInstrumentSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("paymentOptionJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "paymentOptionJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "PaymentOptionSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("payrollItemJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "payrollItemJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "PayrollItemSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("projectTaskJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "projectTaskJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ProjectTaskSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("purchaseOrderJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "purchaseOrderJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TransactionSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("requestorJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "requestorJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "EmployeeSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revCommittingTransactionJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "revCommittingTransactionJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TransactionSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revisionJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "revisionJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ItemRevisionSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revRecScheduleJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "revRecScheduleJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "RevRecScheduleSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("rgPostingTransactionJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "rgPostingTransactionJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TransactionSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("salesOrderJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "salesOrderJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TransactionSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("salesRepJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "salesRepJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "EmployeeSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shippingAddressJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "shippingAddressJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "AddressSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subsidiaryJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "subsidiaryJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "SubsidiarySearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taskJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "taskJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TaskSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxCodeJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "taxCodeJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "SalesTaxItemSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxDetailJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "taxDetailJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TaxDetailSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxItemJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "taxItemJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "SalesTaxItemSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("timeJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "timeJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TimeBillSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("toLocationJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "toLocationJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "LocationSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("userJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "userJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "EmployeeSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("userNotesJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "userNotesJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "NoteSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vendorJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "vendorJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "VendorSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vendorLineJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "vendorLineJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "VendorSearchBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customSearchJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "customSearchJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "CustomSearchJoin"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

