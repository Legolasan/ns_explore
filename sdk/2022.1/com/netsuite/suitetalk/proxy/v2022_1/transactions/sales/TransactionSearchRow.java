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

import com.netsuite.suitetalk.proxy.v2022_1.platform.common.AccountSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.AccountingPeriodSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.AccountingTransactionSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.AddressSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.BillingAccountSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.BinSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.BomRevisionSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.BomSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.CalendarEventSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.CampaignSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.ClassificationSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.ContactSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.CustomSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.CustomerSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.DepartmentSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.EmployeeSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.EntitySearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.ExpenseCategorySearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.FileSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.InstallmentSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.InventoryDetailSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.InventoryNumberSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.ItemRevisionSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.ItemSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.JobSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.LocationSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.ManufacturingOperationTaskSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.MessageSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.NoteSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.OpportunitySearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.PartnerSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.PaymentInstrumentSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.PaymentOptionSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.PayrollItemSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.PhoneCallSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.ProjectTaskSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.RevRecScheduleSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.SalesTaxItemSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.SubsidiarySearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.SupportCaseSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.TaskSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.TaxDetailSearchRowBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.TimeBillSearchRowBasic;
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

public class TransactionSearchRow
extends SearchRow
implements Serializable {
    private TransactionSearchRowBasic basic;
    private AccountSearchRowBasic accountJoin;
    private AccountingPeriodSearchRowBasic accountingPeriodJoin;
    private AccountingTransactionSearchRowBasic accountingTransactionJoin;
    private AccountSearchRowBasic advanceToApplyAccountJoin;
    private TransactionSearchRowBasic appliedToTransactionJoin;
    private TransactionSearchRowBasic applyingTransactionJoin;
    private ItemSearchRowBasic assemblyJoin;
    private AddressSearchRowBasic billingAddressJoin;
    private TransactionSearchRowBasic billingTransactionJoin;
    private BinSearchRowBasic binNumberJoin;
    private BomSearchRowBasic bomJoin;
    private BomRevisionSearchRowBasic bomRevisionJoin;
    private PhoneCallSearchRowBasic callJoin;
    private SupportCaseSearchRowBasic caseJoin;
    private ClassificationSearchRowBasic classJoin;
    private TransactionSearchRowBasic cogsPurchaseJoin;
    private TransactionSearchRowBasic cogsSaleJoin;
    private ContactSearchRowBasic contactPrimaryJoin;
    private TransactionSearchRowBasic createdFromJoin;
    private CustomerSearchRowBasic customerJoin;
    private CustomerSearchRowBasic customerMainJoin;
    private DepartmentSearchRowBasic departmentJoin;
    private TransactionSearchRowBasic depositTransactionJoin;
    private EmployeeSearchRowBasic employeeJoin;
    private CalendarEventSearchRowBasic eventJoin;
    private ExpenseCategorySearchRowBasic expenseCategoryJoin;
    private FileSearchRowBasic fileJoin;
    private LocationSearchRowBasic fromLocationJoin;
    private TransactionSearchRowBasic fulfillingTransactionJoin;
    private BillingAccountSearchRowBasic headerBillingAccountJoin;
    private InstallmentSearchRowBasic installmentJoin;
    private InventoryDetailSearchRowBasic inventoryDetailJoin;
    private ItemSearchRowBasic itemJoin;
    private InventoryNumberSearchRowBasic itemNumberJoin;
    private JobSearchRowBasic jobJoin;
    private JobSearchRowBasic jobMainJoin;
    private CampaignSearchRowBasic leadSourceJoin;
    private BillingAccountSearchRowBasic lineBillingAccountJoin;
    private FileSearchRowBasic lineFileJoin;
    private LocationSearchRowBasic locationJoin;
    private ManufacturingOperationTaskSearchRowBasic manufacturingOperationTaskJoin;
    private MessageSearchRowBasic messagesJoin;
    private EntitySearchRowBasic nextApproverJoin;
    private OpportunitySearchRowBasic opportunityJoin;
    private VendorSearchRowBasic outsourcingVendorJoin;
    private TransactionSearchRowBasic paidTransactionJoin;
    private PartnerSearchRowBasic partnerJoin;
    private TransactionSearchRowBasic payingTransactionJoin;
    private PaymentInstrumentSearchRowBasic paymentInstrumentJoin;
    private PaymentOptionSearchRowBasic paymentOptionJoin;
    private PayrollItemSearchRowBasic payrollItemJoin;
    private ProjectTaskSearchRowBasic projectTaskJoin;
    private TransactionSearchRowBasic purchaseOrderJoin;
    private EmployeeSearchRowBasic requestorJoin;
    private TransactionSearchRowBasic revCommittingTransactionJoin;
    private ItemRevisionSearchRowBasic revisionJoin;
    private RevRecScheduleSearchRowBasic revRecScheduleJoin;
    private TransactionSearchRowBasic rgPostingTransactionJoin;
    private TransactionSearchRowBasic salesOrderJoin;
    private EmployeeSearchRowBasic salesRepJoin;
    private AddressSearchRowBasic shippingAddressJoin;
    private SubsidiarySearchRowBasic subsidiaryJoin;
    private TaskSearchRowBasic taskJoin;
    private SalesTaxItemSearchRowBasic taxCodeJoin;
    private TaxDetailSearchRowBasic taxDetailJoin;
    private SalesTaxItemSearchRowBasic taxItemJoin;
    private TimeBillSearchRowBasic timeJoin;
    private LocationSearchRowBasic toLocationJoin;
    private EmployeeSearchRowBasic userJoin;
    private NoteSearchRowBasic userNotesJoin;
    private VendorSearchRowBasic vendorJoin;
    private VendorSearchRowBasic vendorLineJoin;
    private CustomSearchRowBasic[] customSearchJoin;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(TransactionSearchRow.class, true);

    public TransactionSearchRow() {
    }

    public TransactionSearchRow(TransactionSearchRowBasic basic, AccountSearchRowBasic accountJoin, AccountingPeriodSearchRowBasic accountingPeriodJoin, AccountingTransactionSearchRowBasic accountingTransactionJoin, AccountSearchRowBasic advanceToApplyAccountJoin, TransactionSearchRowBasic appliedToTransactionJoin, TransactionSearchRowBasic applyingTransactionJoin, ItemSearchRowBasic assemblyJoin, AddressSearchRowBasic billingAddressJoin, TransactionSearchRowBasic billingTransactionJoin, BinSearchRowBasic binNumberJoin, BomSearchRowBasic bomJoin, BomRevisionSearchRowBasic bomRevisionJoin, PhoneCallSearchRowBasic callJoin, SupportCaseSearchRowBasic caseJoin, ClassificationSearchRowBasic classJoin, TransactionSearchRowBasic cogsPurchaseJoin, TransactionSearchRowBasic cogsSaleJoin, ContactSearchRowBasic contactPrimaryJoin, TransactionSearchRowBasic createdFromJoin, CustomerSearchRowBasic customerJoin, CustomerSearchRowBasic customerMainJoin, DepartmentSearchRowBasic departmentJoin, TransactionSearchRowBasic depositTransactionJoin, EmployeeSearchRowBasic employeeJoin, CalendarEventSearchRowBasic eventJoin, ExpenseCategorySearchRowBasic expenseCategoryJoin, FileSearchRowBasic fileJoin, LocationSearchRowBasic fromLocationJoin, TransactionSearchRowBasic fulfillingTransactionJoin, BillingAccountSearchRowBasic headerBillingAccountJoin, InstallmentSearchRowBasic installmentJoin, InventoryDetailSearchRowBasic inventoryDetailJoin, ItemSearchRowBasic itemJoin, InventoryNumberSearchRowBasic itemNumberJoin, JobSearchRowBasic jobJoin, JobSearchRowBasic jobMainJoin, CampaignSearchRowBasic leadSourceJoin, BillingAccountSearchRowBasic lineBillingAccountJoin, FileSearchRowBasic lineFileJoin, LocationSearchRowBasic locationJoin, ManufacturingOperationTaskSearchRowBasic manufacturingOperationTaskJoin, MessageSearchRowBasic messagesJoin, EntitySearchRowBasic nextApproverJoin, OpportunitySearchRowBasic opportunityJoin, VendorSearchRowBasic outsourcingVendorJoin, TransactionSearchRowBasic paidTransactionJoin, PartnerSearchRowBasic partnerJoin, TransactionSearchRowBasic payingTransactionJoin, PaymentInstrumentSearchRowBasic paymentInstrumentJoin, PaymentOptionSearchRowBasic paymentOptionJoin, PayrollItemSearchRowBasic payrollItemJoin, ProjectTaskSearchRowBasic projectTaskJoin, TransactionSearchRowBasic purchaseOrderJoin, EmployeeSearchRowBasic requestorJoin, TransactionSearchRowBasic revCommittingTransactionJoin, ItemRevisionSearchRowBasic revisionJoin, RevRecScheduleSearchRowBasic revRecScheduleJoin, TransactionSearchRowBasic rgPostingTransactionJoin, TransactionSearchRowBasic salesOrderJoin, EmployeeSearchRowBasic salesRepJoin, AddressSearchRowBasic shippingAddressJoin, SubsidiarySearchRowBasic subsidiaryJoin, TaskSearchRowBasic taskJoin, SalesTaxItemSearchRowBasic taxCodeJoin, TaxDetailSearchRowBasic taxDetailJoin, SalesTaxItemSearchRowBasic taxItemJoin, TimeBillSearchRowBasic timeJoin, LocationSearchRowBasic toLocationJoin, EmployeeSearchRowBasic userJoin, NoteSearchRowBasic userNotesJoin, VendorSearchRowBasic vendorJoin, VendorSearchRowBasic vendorLineJoin, CustomSearchRowBasic[] customSearchJoin) {
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

    public TransactionSearchRowBasic getBasic() {
        return this.basic;
    }

    public void setBasic(TransactionSearchRowBasic basic) {
        this.basic = basic;
    }

    public AccountSearchRowBasic getAccountJoin() {
        return this.accountJoin;
    }

    public void setAccountJoin(AccountSearchRowBasic accountJoin) {
        this.accountJoin = accountJoin;
    }

    public AccountingPeriodSearchRowBasic getAccountingPeriodJoin() {
        return this.accountingPeriodJoin;
    }

    public void setAccountingPeriodJoin(AccountingPeriodSearchRowBasic accountingPeriodJoin) {
        this.accountingPeriodJoin = accountingPeriodJoin;
    }

    public AccountingTransactionSearchRowBasic getAccountingTransactionJoin() {
        return this.accountingTransactionJoin;
    }

    public void setAccountingTransactionJoin(AccountingTransactionSearchRowBasic accountingTransactionJoin) {
        this.accountingTransactionJoin = accountingTransactionJoin;
    }

    public AccountSearchRowBasic getAdvanceToApplyAccountJoin() {
        return this.advanceToApplyAccountJoin;
    }

    public void setAdvanceToApplyAccountJoin(AccountSearchRowBasic advanceToApplyAccountJoin) {
        this.advanceToApplyAccountJoin = advanceToApplyAccountJoin;
    }

    public TransactionSearchRowBasic getAppliedToTransactionJoin() {
        return this.appliedToTransactionJoin;
    }

    public void setAppliedToTransactionJoin(TransactionSearchRowBasic appliedToTransactionJoin) {
        this.appliedToTransactionJoin = appliedToTransactionJoin;
    }

    public TransactionSearchRowBasic getApplyingTransactionJoin() {
        return this.applyingTransactionJoin;
    }

    public void setApplyingTransactionJoin(TransactionSearchRowBasic applyingTransactionJoin) {
        this.applyingTransactionJoin = applyingTransactionJoin;
    }

    public ItemSearchRowBasic getAssemblyJoin() {
        return this.assemblyJoin;
    }

    public void setAssemblyJoin(ItemSearchRowBasic assemblyJoin) {
        this.assemblyJoin = assemblyJoin;
    }

    public AddressSearchRowBasic getBillingAddressJoin() {
        return this.billingAddressJoin;
    }

    public void setBillingAddressJoin(AddressSearchRowBasic billingAddressJoin) {
        this.billingAddressJoin = billingAddressJoin;
    }

    public TransactionSearchRowBasic getBillingTransactionJoin() {
        return this.billingTransactionJoin;
    }

    public void setBillingTransactionJoin(TransactionSearchRowBasic billingTransactionJoin) {
        this.billingTransactionJoin = billingTransactionJoin;
    }

    public BinSearchRowBasic getBinNumberJoin() {
        return this.binNumberJoin;
    }

    public void setBinNumberJoin(BinSearchRowBasic binNumberJoin) {
        this.binNumberJoin = binNumberJoin;
    }

    public BomSearchRowBasic getBomJoin() {
        return this.bomJoin;
    }

    public void setBomJoin(BomSearchRowBasic bomJoin) {
        this.bomJoin = bomJoin;
    }

    public BomRevisionSearchRowBasic getBomRevisionJoin() {
        return this.bomRevisionJoin;
    }

    public void setBomRevisionJoin(BomRevisionSearchRowBasic bomRevisionJoin) {
        this.bomRevisionJoin = bomRevisionJoin;
    }

    public PhoneCallSearchRowBasic getCallJoin() {
        return this.callJoin;
    }

    public void setCallJoin(PhoneCallSearchRowBasic callJoin) {
        this.callJoin = callJoin;
    }

    public SupportCaseSearchRowBasic getCaseJoin() {
        return this.caseJoin;
    }

    public void setCaseJoin(SupportCaseSearchRowBasic caseJoin) {
        this.caseJoin = caseJoin;
    }

    public ClassificationSearchRowBasic getClassJoin() {
        return this.classJoin;
    }

    public void setClassJoin(ClassificationSearchRowBasic classJoin) {
        this.classJoin = classJoin;
    }

    public TransactionSearchRowBasic getCogsPurchaseJoin() {
        return this.cogsPurchaseJoin;
    }

    public void setCogsPurchaseJoin(TransactionSearchRowBasic cogsPurchaseJoin) {
        this.cogsPurchaseJoin = cogsPurchaseJoin;
    }

    public TransactionSearchRowBasic getCogsSaleJoin() {
        return this.cogsSaleJoin;
    }

    public void setCogsSaleJoin(TransactionSearchRowBasic cogsSaleJoin) {
        this.cogsSaleJoin = cogsSaleJoin;
    }

    public ContactSearchRowBasic getContactPrimaryJoin() {
        return this.contactPrimaryJoin;
    }

    public void setContactPrimaryJoin(ContactSearchRowBasic contactPrimaryJoin) {
        this.contactPrimaryJoin = contactPrimaryJoin;
    }

    public TransactionSearchRowBasic getCreatedFromJoin() {
        return this.createdFromJoin;
    }

    public void setCreatedFromJoin(TransactionSearchRowBasic createdFromJoin) {
        this.createdFromJoin = createdFromJoin;
    }

    public CustomerSearchRowBasic getCustomerJoin() {
        return this.customerJoin;
    }

    public void setCustomerJoin(CustomerSearchRowBasic customerJoin) {
        this.customerJoin = customerJoin;
    }

    public CustomerSearchRowBasic getCustomerMainJoin() {
        return this.customerMainJoin;
    }

    public void setCustomerMainJoin(CustomerSearchRowBasic customerMainJoin) {
        this.customerMainJoin = customerMainJoin;
    }

    public DepartmentSearchRowBasic getDepartmentJoin() {
        return this.departmentJoin;
    }

    public void setDepartmentJoin(DepartmentSearchRowBasic departmentJoin) {
        this.departmentJoin = departmentJoin;
    }

    public TransactionSearchRowBasic getDepositTransactionJoin() {
        return this.depositTransactionJoin;
    }

    public void setDepositTransactionJoin(TransactionSearchRowBasic depositTransactionJoin) {
        this.depositTransactionJoin = depositTransactionJoin;
    }

    public EmployeeSearchRowBasic getEmployeeJoin() {
        return this.employeeJoin;
    }

    public void setEmployeeJoin(EmployeeSearchRowBasic employeeJoin) {
        this.employeeJoin = employeeJoin;
    }

    public CalendarEventSearchRowBasic getEventJoin() {
        return this.eventJoin;
    }

    public void setEventJoin(CalendarEventSearchRowBasic eventJoin) {
        this.eventJoin = eventJoin;
    }

    public ExpenseCategorySearchRowBasic getExpenseCategoryJoin() {
        return this.expenseCategoryJoin;
    }

    public void setExpenseCategoryJoin(ExpenseCategorySearchRowBasic expenseCategoryJoin) {
        this.expenseCategoryJoin = expenseCategoryJoin;
    }

    public FileSearchRowBasic getFileJoin() {
        return this.fileJoin;
    }

    public void setFileJoin(FileSearchRowBasic fileJoin) {
        this.fileJoin = fileJoin;
    }

    public LocationSearchRowBasic getFromLocationJoin() {
        return this.fromLocationJoin;
    }

    public void setFromLocationJoin(LocationSearchRowBasic fromLocationJoin) {
        this.fromLocationJoin = fromLocationJoin;
    }

    public TransactionSearchRowBasic getFulfillingTransactionJoin() {
        return this.fulfillingTransactionJoin;
    }

    public void setFulfillingTransactionJoin(TransactionSearchRowBasic fulfillingTransactionJoin) {
        this.fulfillingTransactionJoin = fulfillingTransactionJoin;
    }

    public BillingAccountSearchRowBasic getHeaderBillingAccountJoin() {
        return this.headerBillingAccountJoin;
    }

    public void setHeaderBillingAccountJoin(BillingAccountSearchRowBasic headerBillingAccountJoin) {
        this.headerBillingAccountJoin = headerBillingAccountJoin;
    }

    public InstallmentSearchRowBasic getInstallmentJoin() {
        return this.installmentJoin;
    }

    public void setInstallmentJoin(InstallmentSearchRowBasic installmentJoin) {
        this.installmentJoin = installmentJoin;
    }

    public InventoryDetailSearchRowBasic getInventoryDetailJoin() {
        return this.inventoryDetailJoin;
    }

    public void setInventoryDetailJoin(InventoryDetailSearchRowBasic inventoryDetailJoin) {
        this.inventoryDetailJoin = inventoryDetailJoin;
    }

    public ItemSearchRowBasic getItemJoin() {
        return this.itemJoin;
    }

    public void setItemJoin(ItemSearchRowBasic itemJoin) {
        this.itemJoin = itemJoin;
    }

    public InventoryNumberSearchRowBasic getItemNumberJoin() {
        return this.itemNumberJoin;
    }

    public void setItemNumberJoin(InventoryNumberSearchRowBasic itemNumberJoin) {
        this.itemNumberJoin = itemNumberJoin;
    }

    public JobSearchRowBasic getJobJoin() {
        return this.jobJoin;
    }

    public void setJobJoin(JobSearchRowBasic jobJoin) {
        this.jobJoin = jobJoin;
    }

    public JobSearchRowBasic getJobMainJoin() {
        return this.jobMainJoin;
    }

    public void setJobMainJoin(JobSearchRowBasic jobMainJoin) {
        this.jobMainJoin = jobMainJoin;
    }

    public CampaignSearchRowBasic getLeadSourceJoin() {
        return this.leadSourceJoin;
    }

    public void setLeadSourceJoin(CampaignSearchRowBasic leadSourceJoin) {
        this.leadSourceJoin = leadSourceJoin;
    }

    public BillingAccountSearchRowBasic getLineBillingAccountJoin() {
        return this.lineBillingAccountJoin;
    }

    public void setLineBillingAccountJoin(BillingAccountSearchRowBasic lineBillingAccountJoin) {
        this.lineBillingAccountJoin = lineBillingAccountJoin;
    }

    public FileSearchRowBasic getLineFileJoin() {
        return this.lineFileJoin;
    }

    public void setLineFileJoin(FileSearchRowBasic lineFileJoin) {
        this.lineFileJoin = lineFileJoin;
    }

    public LocationSearchRowBasic getLocationJoin() {
        return this.locationJoin;
    }

    public void setLocationJoin(LocationSearchRowBasic locationJoin) {
        this.locationJoin = locationJoin;
    }

    public ManufacturingOperationTaskSearchRowBasic getManufacturingOperationTaskJoin() {
        return this.manufacturingOperationTaskJoin;
    }

    public void setManufacturingOperationTaskJoin(ManufacturingOperationTaskSearchRowBasic manufacturingOperationTaskJoin) {
        this.manufacturingOperationTaskJoin = manufacturingOperationTaskJoin;
    }

    public MessageSearchRowBasic getMessagesJoin() {
        return this.messagesJoin;
    }

    public void setMessagesJoin(MessageSearchRowBasic messagesJoin) {
        this.messagesJoin = messagesJoin;
    }

    public EntitySearchRowBasic getNextApproverJoin() {
        return this.nextApproverJoin;
    }

    public void setNextApproverJoin(EntitySearchRowBasic nextApproverJoin) {
        this.nextApproverJoin = nextApproverJoin;
    }

    public OpportunitySearchRowBasic getOpportunityJoin() {
        return this.opportunityJoin;
    }

    public void setOpportunityJoin(OpportunitySearchRowBasic opportunityJoin) {
        this.opportunityJoin = opportunityJoin;
    }

    public VendorSearchRowBasic getOutsourcingVendorJoin() {
        return this.outsourcingVendorJoin;
    }

    public void setOutsourcingVendorJoin(VendorSearchRowBasic outsourcingVendorJoin) {
        this.outsourcingVendorJoin = outsourcingVendorJoin;
    }

    public TransactionSearchRowBasic getPaidTransactionJoin() {
        return this.paidTransactionJoin;
    }

    public void setPaidTransactionJoin(TransactionSearchRowBasic paidTransactionJoin) {
        this.paidTransactionJoin = paidTransactionJoin;
    }

    public PartnerSearchRowBasic getPartnerJoin() {
        return this.partnerJoin;
    }

    public void setPartnerJoin(PartnerSearchRowBasic partnerJoin) {
        this.partnerJoin = partnerJoin;
    }

    public TransactionSearchRowBasic getPayingTransactionJoin() {
        return this.payingTransactionJoin;
    }

    public void setPayingTransactionJoin(TransactionSearchRowBasic payingTransactionJoin) {
        this.payingTransactionJoin = payingTransactionJoin;
    }

    public PaymentInstrumentSearchRowBasic getPaymentInstrumentJoin() {
        return this.paymentInstrumentJoin;
    }

    public void setPaymentInstrumentJoin(PaymentInstrumentSearchRowBasic paymentInstrumentJoin) {
        this.paymentInstrumentJoin = paymentInstrumentJoin;
    }

    public PaymentOptionSearchRowBasic getPaymentOptionJoin() {
        return this.paymentOptionJoin;
    }

    public void setPaymentOptionJoin(PaymentOptionSearchRowBasic paymentOptionJoin) {
        this.paymentOptionJoin = paymentOptionJoin;
    }

    public PayrollItemSearchRowBasic getPayrollItemJoin() {
        return this.payrollItemJoin;
    }

    public void setPayrollItemJoin(PayrollItemSearchRowBasic payrollItemJoin) {
        this.payrollItemJoin = payrollItemJoin;
    }

    public ProjectTaskSearchRowBasic getProjectTaskJoin() {
        return this.projectTaskJoin;
    }

    public void setProjectTaskJoin(ProjectTaskSearchRowBasic projectTaskJoin) {
        this.projectTaskJoin = projectTaskJoin;
    }

    public TransactionSearchRowBasic getPurchaseOrderJoin() {
        return this.purchaseOrderJoin;
    }

    public void setPurchaseOrderJoin(TransactionSearchRowBasic purchaseOrderJoin) {
        this.purchaseOrderJoin = purchaseOrderJoin;
    }

    public EmployeeSearchRowBasic getRequestorJoin() {
        return this.requestorJoin;
    }

    public void setRequestorJoin(EmployeeSearchRowBasic requestorJoin) {
        this.requestorJoin = requestorJoin;
    }

    public TransactionSearchRowBasic getRevCommittingTransactionJoin() {
        return this.revCommittingTransactionJoin;
    }

    public void setRevCommittingTransactionJoin(TransactionSearchRowBasic revCommittingTransactionJoin) {
        this.revCommittingTransactionJoin = revCommittingTransactionJoin;
    }

    public ItemRevisionSearchRowBasic getRevisionJoin() {
        return this.revisionJoin;
    }

    public void setRevisionJoin(ItemRevisionSearchRowBasic revisionJoin) {
        this.revisionJoin = revisionJoin;
    }

    public RevRecScheduleSearchRowBasic getRevRecScheduleJoin() {
        return this.revRecScheduleJoin;
    }

    public void setRevRecScheduleJoin(RevRecScheduleSearchRowBasic revRecScheduleJoin) {
        this.revRecScheduleJoin = revRecScheduleJoin;
    }

    public TransactionSearchRowBasic getRgPostingTransactionJoin() {
        return this.rgPostingTransactionJoin;
    }

    public void setRgPostingTransactionJoin(TransactionSearchRowBasic rgPostingTransactionJoin) {
        this.rgPostingTransactionJoin = rgPostingTransactionJoin;
    }

    public TransactionSearchRowBasic getSalesOrderJoin() {
        return this.salesOrderJoin;
    }

    public void setSalesOrderJoin(TransactionSearchRowBasic salesOrderJoin) {
        this.salesOrderJoin = salesOrderJoin;
    }

    public EmployeeSearchRowBasic getSalesRepJoin() {
        return this.salesRepJoin;
    }

    public void setSalesRepJoin(EmployeeSearchRowBasic salesRepJoin) {
        this.salesRepJoin = salesRepJoin;
    }

    public AddressSearchRowBasic getShippingAddressJoin() {
        return this.shippingAddressJoin;
    }

    public void setShippingAddressJoin(AddressSearchRowBasic shippingAddressJoin) {
        this.shippingAddressJoin = shippingAddressJoin;
    }

    public SubsidiarySearchRowBasic getSubsidiaryJoin() {
        return this.subsidiaryJoin;
    }

    public void setSubsidiaryJoin(SubsidiarySearchRowBasic subsidiaryJoin) {
        this.subsidiaryJoin = subsidiaryJoin;
    }

    public TaskSearchRowBasic getTaskJoin() {
        return this.taskJoin;
    }

    public void setTaskJoin(TaskSearchRowBasic taskJoin) {
        this.taskJoin = taskJoin;
    }

    public SalesTaxItemSearchRowBasic getTaxCodeJoin() {
        return this.taxCodeJoin;
    }

    public void setTaxCodeJoin(SalesTaxItemSearchRowBasic taxCodeJoin) {
        this.taxCodeJoin = taxCodeJoin;
    }

    public TaxDetailSearchRowBasic getTaxDetailJoin() {
        return this.taxDetailJoin;
    }

    public void setTaxDetailJoin(TaxDetailSearchRowBasic taxDetailJoin) {
        this.taxDetailJoin = taxDetailJoin;
    }

    public SalesTaxItemSearchRowBasic getTaxItemJoin() {
        return this.taxItemJoin;
    }

    public void setTaxItemJoin(SalesTaxItemSearchRowBasic taxItemJoin) {
        this.taxItemJoin = taxItemJoin;
    }

    public TimeBillSearchRowBasic getTimeJoin() {
        return this.timeJoin;
    }

    public void setTimeJoin(TimeBillSearchRowBasic timeJoin) {
        this.timeJoin = timeJoin;
    }

    public LocationSearchRowBasic getToLocationJoin() {
        return this.toLocationJoin;
    }

    public void setToLocationJoin(LocationSearchRowBasic toLocationJoin) {
        this.toLocationJoin = toLocationJoin;
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

    public VendorSearchRowBasic getVendorLineJoin() {
        return this.vendorLineJoin;
    }

    public void setVendorLineJoin(VendorSearchRowBasic vendorLineJoin) {
        this.vendorLineJoin = vendorLineJoin;
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
        if (!(obj instanceof TransactionSearchRow)) {
            return false;
        }
        TransactionSearchRow other = (TransactionSearchRow)obj;
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
        typeDesc.setXmlType(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "TransactionSearchRow"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("basic");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "basic"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("accountJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "accountJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "AccountSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("accountingPeriodJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "accountingPeriodJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "AccountingPeriodSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("accountingTransactionJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "accountingTransactionJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "AccountingTransactionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("advanceToApplyAccountJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "advanceToApplyAccountJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "AccountSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("appliedToTransactionJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "appliedToTransactionJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("applyingTransactionJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "applyingTransactionJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("assemblyJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "assemblyJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ItemSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billingAddressJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "billingAddressJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "AddressSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billingTransactionJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "billingTransactionJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("binNumberJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "binNumberJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "BinSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("bomJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "bomJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "BomSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("bomRevisionJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "bomRevisionJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "BomRevisionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("callJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "callJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "PhoneCallSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("caseJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "caseJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "SupportCaseSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("classJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "classJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ClassificationSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("cogsPurchaseJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "cogsPurchaseJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("cogsSaleJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "cogsSaleJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("contactPrimaryJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "contactPrimaryJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ContactSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("createdFromJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "createdFromJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customerJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "customerJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "CustomerSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customerMainJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "customerMainJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "CustomerSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("departmentJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "departmentJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "DepartmentSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("depositTransactionJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "depositTransactionJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("employeeJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "employeeJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "EmployeeSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("eventJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "eventJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "CalendarEventSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("expenseCategoryJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "expenseCategoryJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ExpenseCategorySearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fileJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "fileJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "FileSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fromLocationJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "fromLocationJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "LocationSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("fulfillingTransactionJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "fulfillingTransactionJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("headerBillingAccountJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "headerBillingAccountJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "BillingAccountSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("installmentJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "installmentJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "InstallmentSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("inventoryDetailJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "inventoryDetailJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "InventoryDetailSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "itemJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ItemSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemNumberJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "itemNumberJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "InventoryNumberSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("jobJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "jobJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "JobSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("jobMainJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "jobMainJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "JobSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("leadSourceJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "leadSourceJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "CampaignSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lineBillingAccountJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "lineBillingAccountJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "BillingAccountSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lineFileJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "lineFileJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "FileSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("locationJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "locationJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "LocationSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("manufacturingOperationTaskJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "manufacturingOperationTaskJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ManufacturingOperationTaskSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("messagesJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "messagesJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "MessageSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("nextApproverJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "nextApproverJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "EntitySearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("opportunityJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "opportunityJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "OpportunitySearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("outsourcingVendorJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "outsourcingVendorJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "VendorSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("paidTransactionJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "paidTransactionJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("partnerJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "partnerJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "PartnerSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("payingTransactionJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "payingTransactionJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("paymentInstrumentJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "paymentInstrumentJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "PaymentInstrumentSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("paymentOptionJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "paymentOptionJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "PaymentOptionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("payrollItemJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "payrollItemJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "PayrollItemSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("projectTaskJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "projectTaskJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ProjectTaskSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("purchaseOrderJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "purchaseOrderJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("requestorJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "requestorJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "EmployeeSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revCommittingTransactionJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "revCommittingTransactionJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revisionJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "revisionJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ItemRevisionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revRecScheduleJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "revRecScheduleJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "RevRecScheduleSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("rgPostingTransactionJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "rgPostingTransactionJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("salesOrderJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "salesOrderJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TransactionSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("salesRepJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "salesRepJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "EmployeeSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("shippingAddressJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "shippingAddressJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "AddressSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subsidiaryJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "subsidiaryJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "SubsidiarySearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taskJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "taskJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TaskSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxCodeJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "taxCodeJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "SalesTaxItemSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxDetailJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "taxDetailJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TaxDetailSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxItemJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "taxItemJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "SalesTaxItemSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("timeJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "timeJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "TimeBillSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("toLocationJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "toLocationJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "LocationSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("userJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "userJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "EmployeeSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("userNotesJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "userNotesJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "NoteSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vendorJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "vendorJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "VendorSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vendorLineJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "vendorLineJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "VendorSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customSearchJoin");
        elemField.setXmlName(new QName("urn:sales_2022_1.transactions.webservices.netsuite.com", "customSearchJoin"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "CustomSearchRowBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

