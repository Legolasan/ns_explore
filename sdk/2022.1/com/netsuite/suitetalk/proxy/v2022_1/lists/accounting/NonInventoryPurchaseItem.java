/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.axis.description.AttributeDesc
 *  org.apache.axis.description.ElementDesc
 *  org.apache.axis.description.FieldDesc
 *  org.apache.axis.description.TypeDesc
 *  org.apache.axis.encoding.Deserializer
 *  org.apache.axis.encoding.Serializer
 *  org.apache.axis.encoding.ser.BeanDeserializer
 *  org.apache.axis.encoding.ser.BeanSerializer
 */
package com.netsuite.suitetalk.proxy.v2022_1.lists.accounting;

import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.ItemAccountingBookDetailList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.ItemOptionsList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.ItemVendorList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.MatrixOptionList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.NonInventoryPurchaseItemHierarchyVersionsList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.TranslationList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.accounting.types.ItemMatrixType;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.CustomFieldList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.NullField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.Record;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRefList;
import java.io.Serializable;
import java.util.Calendar;
import javax.xml.namespace.QName;
import org.apache.axis.description.AttributeDesc;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class NonInventoryPurchaseItem
extends Record
implements Serializable {
    private Calendar createdDate;
    private Calendar lastModifiedDate;
    private String purchaseDescription;
    private Double cost;
    private String costUnits;
    private RecordRef expenseAccount;
    private RecordRef issueProduct;
    private Boolean isTaxable;
    private ItemMatrixType matrixType;
    private RecordRef unitsType;
    private RecordRef purchaseUnit;
    private RecordRef customForm;
    private String itemId;
    private String upcCode;
    private String displayName;
    private Boolean includeChildren;
    private String vendorName;
    private RecordRef parent;
    private Boolean isInactive;
    private String matrixItemNameTemplate;
    private Boolean availableToPartners;
    private RecordRef department;
    private RecordRef _class;
    private RecordRef location;
    private RecordRefList subsidiaryList;
    private RecordRef taxSchedule;
    private RecordRef deferralAccount;
    private RecordRef amortizationTemplate;
    private String residual;
    private Long amortizationPeriod;
    private Boolean isFulfillable;
    private Boolean generateAccruals;
    private ItemAccountingBookDetailList accountingBookDetailList;
    private RecordRef costCategory;
    private Double purchaseOrderQuantity;
    private Double purchaseOrderAmount;
    private Double purchaseOrderQuantityDiff;
    private Double receiptQuantity;
    private Double receiptAmount;
    private Double receiptQuantityDiff;
    private String currency;
    private ItemOptionsList itemOptionsList;
    private MatrixOptionList matrixOptionList;
    private ItemVendorList itemVendorList;
    private RecordRef purchaseTaxCode;
    private RecordRef salesTaxCode;
    private TranslationList translationsList;
    private RecordRef vendor;
    private NonInventoryPurchaseItemHierarchyVersionsList hierarchyVersionsList;
    private RecordRef consumptionUnit;
    private RecordRef billQtyVarianceAcct;
    private RecordRef billPriceVarianceAcct;
    private RecordRef billExchRateVarianceAcct;
    private CustomFieldList customFieldList;
    private String internalId;
    private String externalId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(NonInventoryPurchaseItem.class, true);

    public NonInventoryPurchaseItem() {
    }

    public NonInventoryPurchaseItem(NullField nullFieldList, String internalId, String externalId, Calendar createdDate, Calendar lastModifiedDate, String purchaseDescription, Double cost, String costUnits, RecordRef expenseAccount, RecordRef issueProduct, Boolean isTaxable, ItemMatrixType matrixType, RecordRef unitsType, RecordRef purchaseUnit, RecordRef customForm, String itemId, String upcCode, String displayName, Boolean includeChildren, String vendorName, RecordRef parent, Boolean isInactive, String matrixItemNameTemplate, Boolean availableToPartners, RecordRef department, RecordRef _class, RecordRef location, RecordRefList subsidiaryList, RecordRef taxSchedule, RecordRef deferralAccount, RecordRef amortizationTemplate, String residual, Long amortizationPeriod, Boolean isFulfillable, Boolean generateAccruals, ItemAccountingBookDetailList accountingBookDetailList, RecordRef costCategory, Double purchaseOrderQuantity, Double purchaseOrderAmount, Double purchaseOrderQuantityDiff, Double receiptQuantity, Double receiptAmount, Double receiptQuantityDiff, String currency, ItemOptionsList itemOptionsList, MatrixOptionList matrixOptionList, ItemVendorList itemVendorList, RecordRef purchaseTaxCode, RecordRef salesTaxCode, TranslationList translationsList, RecordRef vendor, NonInventoryPurchaseItemHierarchyVersionsList hierarchyVersionsList, RecordRef consumptionUnit, RecordRef billQtyVarianceAcct, RecordRef billPriceVarianceAcct, RecordRef billExchRateVarianceAcct, CustomFieldList customFieldList) {
        super(nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.purchaseDescription = purchaseDescription;
        this.cost = cost;
        this.costUnits = costUnits;
        this.expenseAccount = expenseAccount;
        this.issueProduct = issueProduct;
        this.isTaxable = isTaxable;
        this.matrixType = matrixType;
        this.unitsType = unitsType;
        this.purchaseUnit = purchaseUnit;
        this.customForm = customForm;
        this.itemId = itemId;
        this.upcCode = upcCode;
        this.displayName = displayName;
        this.includeChildren = includeChildren;
        this.vendorName = vendorName;
        this.parent = parent;
        this.isInactive = isInactive;
        this.matrixItemNameTemplate = matrixItemNameTemplate;
        this.availableToPartners = availableToPartners;
        this.department = department;
        this._class = _class;
        this.location = location;
        this.subsidiaryList = subsidiaryList;
        this.taxSchedule = taxSchedule;
        this.deferralAccount = deferralAccount;
        this.amortizationTemplate = amortizationTemplate;
        this.residual = residual;
        this.amortizationPeriod = amortizationPeriod;
        this.isFulfillable = isFulfillable;
        this.generateAccruals = generateAccruals;
        this.accountingBookDetailList = accountingBookDetailList;
        this.costCategory = costCategory;
        this.purchaseOrderQuantity = purchaseOrderQuantity;
        this.purchaseOrderAmount = purchaseOrderAmount;
        this.purchaseOrderQuantityDiff = purchaseOrderQuantityDiff;
        this.receiptQuantity = receiptQuantity;
        this.receiptAmount = receiptAmount;
        this.receiptQuantityDiff = receiptQuantityDiff;
        this.currency = currency;
        this.itemOptionsList = itemOptionsList;
        this.matrixOptionList = matrixOptionList;
        this.itemVendorList = itemVendorList;
        this.purchaseTaxCode = purchaseTaxCode;
        this.salesTaxCode = salesTaxCode;
        this.translationsList = translationsList;
        this.vendor = vendor;
        this.hierarchyVersionsList = hierarchyVersionsList;
        this.consumptionUnit = consumptionUnit;
        this.billQtyVarianceAcct = billQtyVarianceAcct;
        this.billPriceVarianceAcct = billPriceVarianceAcct;
        this.billExchRateVarianceAcct = billExchRateVarianceAcct;
        this.customFieldList = customFieldList;
    }

    public Calendar getCreatedDate() {
        return this.createdDate;
    }

    public void setCreatedDate(Calendar createdDate) {
        this.createdDate = createdDate;
    }

    public Calendar getLastModifiedDate() {
        return this.lastModifiedDate;
    }

    public void setLastModifiedDate(Calendar lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public String getPurchaseDescription() {
        return this.purchaseDescription;
    }

    public void setPurchaseDescription(String purchaseDescription) {
        this.purchaseDescription = purchaseDescription;
    }

    public Double getCost() {
        return this.cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public String getCostUnits() {
        return this.costUnits;
    }

    public void setCostUnits(String costUnits) {
        this.costUnits = costUnits;
    }

    public RecordRef getExpenseAccount() {
        return this.expenseAccount;
    }

    public void setExpenseAccount(RecordRef expenseAccount) {
        this.expenseAccount = expenseAccount;
    }

    public RecordRef getIssueProduct() {
        return this.issueProduct;
    }

    public void setIssueProduct(RecordRef issueProduct) {
        this.issueProduct = issueProduct;
    }

    public Boolean getIsTaxable() {
        return this.isTaxable;
    }

    public void setIsTaxable(Boolean isTaxable) {
        this.isTaxable = isTaxable;
    }

    public ItemMatrixType getMatrixType() {
        return this.matrixType;
    }

    public void setMatrixType(ItemMatrixType matrixType) {
        this.matrixType = matrixType;
    }

    public RecordRef getUnitsType() {
        return this.unitsType;
    }

    public void setUnitsType(RecordRef unitsType) {
        this.unitsType = unitsType;
    }

    public RecordRef getPurchaseUnit() {
        return this.purchaseUnit;
    }

    public void setPurchaseUnit(RecordRef purchaseUnit) {
        this.purchaseUnit = purchaseUnit;
    }

    public RecordRef getCustomForm() {
        return this.customForm;
    }

    public void setCustomForm(RecordRef customForm) {
        this.customForm = customForm;
    }

    public String getItemId() {
        return this.itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getUpcCode() {
        return this.upcCode;
    }

    public void setUpcCode(String upcCode) {
        this.upcCode = upcCode;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public Boolean getIncludeChildren() {
        return this.includeChildren;
    }

    public void setIncludeChildren(Boolean includeChildren) {
        this.includeChildren = includeChildren;
    }

    public String getVendorName() {
        return this.vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public RecordRef getParent() {
        return this.parent;
    }

    public void setParent(RecordRef parent) {
        this.parent = parent;
    }

    public Boolean getIsInactive() {
        return this.isInactive;
    }

    public void setIsInactive(Boolean isInactive) {
        this.isInactive = isInactive;
    }

    public String getMatrixItemNameTemplate() {
        return this.matrixItemNameTemplate;
    }

    public void setMatrixItemNameTemplate(String matrixItemNameTemplate) {
        this.matrixItemNameTemplate = matrixItemNameTemplate;
    }

    public Boolean getAvailableToPartners() {
        return this.availableToPartners;
    }

    public void setAvailableToPartners(Boolean availableToPartners) {
        this.availableToPartners = availableToPartners;
    }

    public RecordRef getDepartment() {
        return this.department;
    }

    public void setDepartment(RecordRef department) {
        this.department = department;
    }

    public RecordRef get_class() {
        return this._class;
    }

    public void set_class(RecordRef _class) {
        this._class = _class;
    }

    public RecordRef getLocation() {
        return this.location;
    }

    public void setLocation(RecordRef location) {
        this.location = location;
    }

    public RecordRefList getSubsidiaryList() {
        return this.subsidiaryList;
    }

    public void setSubsidiaryList(RecordRefList subsidiaryList) {
        this.subsidiaryList = subsidiaryList;
    }

    public RecordRef getTaxSchedule() {
        return this.taxSchedule;
    }

    public void setTaxSchedule(RecordRef taxSchedule) {
        this.taxSchedule = taxSchedule;
    }

    public RecordRef getDeferralAccount() {
        return this.deferralAccount;
    }

    public void setDeferralAccount(RecordRef deferralAccount) {
        this.deferralAccount = deferralAccount;
    }

    public RecordRef getAmortizationTemplate() {
        return this.amortizationTemplate;
    }

    public void setAmortizationTemplate(RecordRef amortizationTemplate) {
        this.amortizationTemplate = amortizationTemplate;
    }

    public String getResidual() {
        return this.residual;
    }

    public void setResidual(String residual) {
        this.residual = residual;
    }

    public Long getAmortizationPeriod() {
        return this.amortizationPeriod;
    }

    public void setAmortizationPeriod(Long amortizationPeriod) {
        this.amortizationPeriod = amortizationPeriod;
    }

    public Boolean getIsFulfillable() {
        return this.isFulfillable;
    }

    public void setIsFulfillable(Boolean isFulfillable) {
        this.isFulfillable = isFulfillable;
    }

    public Boolean getGenerateAccruals() {
        return this.generateAccruals;
    }

    public void setGenerateAccruals(Boolean generateAccruals) {
        this.generateAccruals = generateAccruals;
    }

    public ItemAccountingBookDetailList getAccountingBookDetailList() {
        return this.accountingBookDetailList;
    }

    public void setAccountingBookDetailList(ItemAccountingBookDetailList accountingBookDetailList) {
        this.accountingBookDetailList = accountingBookDetailList;
    }

    public RecordRef getCostCategory() {
        return this.costCategory;
    }

    public void setCostCategory(RecordRef costCategory) {
        this.costCategory = costCategory;
    }

    public Double getPurchaseOrderQuantity() {
        return this.purchaseOrderQuantity;
    }

    public void setPurchaseOrderQuantity(Double purchaseOrderQuantity) {
        this.purchaseOrderQuantity = purchaseOrderQuantity;
    }

    public Double getPurchaseOrderAmount() {
        return this.purchaseOrderAmount;
    }

    public void setPurchaseOrderAmount(Double purchaseOrderAmount) {
        this.purchaseOrderAmount = purchaseOrderAmount;
    }

    public Double getPurchaseOrderQuantityDiff() {
        return this.purchaseOrderQuantityDiff;
    }

    public void setPurchaseOrderQuantityDiff(Double purchaseOrderQuantityDiff) {
        this.purchaseOrderQuantityDiff = purchaseOrderQuantityDiff;
    }

    public Double getReceiptQuantity() {
        return this.receiptQuantity;
    }

    public void setReceiptQuantity(Double receiptQuantity) {
        this.receiptQuantity = receiptQuantity;
    }

    public Double getReceiptAmount() {
        return this.receiptAmount;
    }

    public void setReceiptAmount(Double receiptAmount) {
        this.receiptAmount = receiptAmount;
    }

    public Double getReceiptQuantityDiff() {
        return this.receiptQuantityDiff;
    }

    public void setReceiptQuantityDiff(Double receiptQuantityDiff) {
        this.receiptQuantityDiff = receiptQuantityDiff;
    }

    public String getCurrency() {
        return this.currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public ItemOptionsList getItemOptionsList() {
        return this.itemOptionsList;
    }

    public void setItemOptionsList(ItemOptionsList itemOptionsList) {
        this.itemOptionsList = itemOptionsList;
    }

    public MatrixOptionList getMatrixOptionList() {
        return this.matrixOptionList;
    }

    public void setMatrixOptionList(MatrixOptionList matrixOptionList) {
        this.matrixOptionList = matrixOptionList;
    }

    public ItemVendorList getItemVendorList() {
        return this.itemVendorList;
    }

    public void setItemVendorList(ItemVendorList itemVendorList) {
        this.itemVendorList = itemVendorList;
    }

    public RecordRef getPurchaseTaxCode() {
        return this.purchaseTaxCode;
    }

    public void setPurchaseTaxCode(RecordRef purchaseTaxCode) {
        this.purchaseTaxCode = purchaseTaxCode;
    }

    public RecordRef getSalesTaxCode() {
        return this.salesTaxCode;
    }

    public void setSalesTaxCode(RecordRef salesTaxCode) {
        this.salesTaxCode = salesTaxCode;
    }

    public TranslationList getTranslationsList() {
        return this.translationsList;
    }

    public void setTranslationsList(TranslationList translationsList) {
        this.translationsList = translationsList;
    }

    public RecordRef getVendor() {
        return this.vendor;
    }

    public void setVendor(RecordRef vendor) {
        this.vendor = vendor;
    }

    public NonInventoryPurchaseItemHierarchyVersionsList getHierarchyVersionsList() {
        return this.hierarchyVersionsList;
    }

    public void setHierarchyVersionsList(NonInventoryPurchaseItemHierarchyVersionsList hierarchyVersionsList) {
        this.hierarchyVersionsList = hierarchyVersionsList;
    }

    public RecordRef getConsumptionUnit() {
        return this.consumptionUnit;
    }

    public void setConsumptionUnit(RecordRef consumptionUnit) {
        this.consumptionUnit = consumptionUnit;
    }

    public RecordRef getBillQtyVarianceAcct() {
        return this.billQtyVarianceAcct;
    }

    public void setBillQtyVarianceAcct(RecordRef billQtyVarianceAcct) {
        this.billQtyVarianceAcct = billQtyVarianceAcct;
    }

    public RecordRef getBillPriceVarianceAcct() {
        return this.billPriceVarianceAcct;
    }

    public void setBillPriceVarianceAcct(RecordRef billPriceVarianceAcct) {
        this.billPriceVarianceAcct = billPriceVarianceAcct;
    }

    public RecordRef getBillExchRateVarianceAcct() {
        return this.billExchRateVarianceAcct;
    }

    public void setBillExchRateVarianceAcct(RecordRef billExchRateVarianceAcct) {
        this.billExchRateVarianceAcct = billExchRateVarianceAcct;
    }

    public CustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    public String getInternalId() {
        return this.internalId;
    }

    public void setInternalId(String internalId) {
        this.internalId = internalId;
    }

    public String getExternalId() {
        return this.externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof NonInventoryPurchaseItem)) {
            return false;
        }
        NonInventoryPurchaseItem other = (NonInventoryPurchaseItem)obj;
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
        boolean _equals = super.equals(obj) && (this.createdDate == null && other.getCreatedDate() == null || this.createdDate != null && this.createdDate.equals(other.getCreatedDate())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && this.lastModifiedDate.equals(other.getLastModifiedDate())) && (this.purchaseDescription == null && other.getPurchaseDescription() == null || this.purchaseDescription != null && this.purchaseDescription.equals(other.getPurchaseDescription())) && (this.cost == null && other.getCost() == null || this.cost != null && this.cost.equals(other.getCost())) && (this.costUnits == null && other.getCostUnits() == null || this.costUnits != null && this.costUnits.equals(other.getCostUnits())) && (this.expenseAccount == null && other.getExpenseAccount() == null || this.expenseAccount != null && this.expenseAccount.equals(other.getExpenseAccount())) && (this.issueProduct == null && other.getIssueProduct() == null || this.issueProduct != null && this.issueProduct.equals(other.getIssueProduct())) && (this.isTaxable == null && other.getIsTaxable() == null || this.isTaxable != null && this.isTaxable.equals(other.getIsTaxable())) && (this.matrixType == null && other.getMatrixType() == null || this.matrixType != null && this.matrixType.equals(other.getMatrixType())) && (this.unitsType == null && other.getUnitsType() == null || this.unitsType != null && this.unitsType.equals(other.getUnitsType())) && (this.purchaseUnit == null && other.getPurchaseUnit() == null || this.purchaseUnit != null && this.purchaseUnit.equals(other.getPurchaseUnit())) && (this.customForm == null && other.getCustomForm() == null || this.customForm != null && this.customForm.equals(other.getCustomForm())) && (this.itemId == null && other.getItemId() == null || this.itemId != null && this.itemId.equals(other.getItemId())) && (this.upcCode == null && other.getUpcCode() == null || this.upcCode != null && this.upcCode.equals(other.getUpcCode())) && (this.displayName == null && other.getDisplayName() == null || this.displayName != null && this.displayName.equals(other.getDisplayName())) && (this.includeChildren == null && other.getIncludeChildren() == null || this.includeChildren != null && this.includeChildren.equals(other.getIncludeChildren())) && (this.vendorName == null && other.getVendorName() == null || this.vendorName != null && this.vendorName.equals(other.getVendorName())) && (this.parent == null && other.getParent() == null || this.parent != null && this.parent.equals(other.getParent())) && (this.isInactive == null && other.getIsInactive() == null || this.isInactive != null && this.isInactive.equals(other.getIsInactive())) && (this.matrixItemNameTemplate == null && other.getMatrixItemNameTemplate() == null || this.matrixItemNameTemplate != null && this.matrixItemNameTemplate.equals(other.getMatrixItemNameTemplate())) && (this.availableToPartners == null && other.getAvailableToPartners() == null || this.availableToPartners != null && this.availableToPartners.equals(other.getAvailableToPartners())) && (this.department == null && other.getDepartment() == null || this.department != null && this.department.equals(other.getDepartment())) && (this._class == null && other.get_class() == null || this._class != null && this._class.equals(other.get_class())) && (this.location == null && other.getLocation() == null || this.location != null && this.location.equals(other.getLocation())) && (this.subsidiaryList == null && other.getSubsidiaryList() == null || this.subsidiaryList != null && this.subsidiaryList.equals(other.getSubsidiaryList())) && (this.taxSchedule == null && other.getTaxSchedule() == null || this.taxSchedule != null && this.taxSchedule.equals(other.getTaxSchedule())) && (this.deferralAccount == null && other.getDeferralAccount() == null || this.deferralAccount != null && this.deferralAccount.equals(other.getDeferralAccount())) && (this.amortizationTemplate == null && other.getAmortizationTemplate() == null || this.amortizationTemplate != null && this.amortizationTemplate.equals(other.getAmortizationTemplate())) && (this.residual == null && other.getResidual() == null || this.residual != null && this.residual.equals(other.getResidual())) && (this.amortizationPeriod == null && other.getAmortizationPeriod() == null || this.amortizationPeriod != null && this.amortizationPeriod.equals(other.getAmortizationPeriod())) && (this.isFulfillable == null && other.getIsFulfillable() == null || this.isFulfillable != null && this.isFulfillable.equals(other.getIsFulfillable())) && (this.generateAccruals == null && other.getGenerateAccruals() == null || this.generateAccruals != null && this.generateAccruals.equals(other.getGenerateAccruals())) && (this.accountingBookDetailList == null && other.getAccountingBookDetailList() == null || this.accountingBookDetailList != null && this.accountingBookDetailList.equals(other.getAccountingBookDetailList())) && (this.costCategory == null && other.getCostCategory() == null || this.costCategory != null && this.costCategory.equals(other.getCostCategory())) && (this.purchaseOrderQuantity == null && other.getPurchaseOrderQuantity() == null || this.purchaseOrderQuantity != null && this.purchaseOrderQuantity.equals(other.getPurchaseOrderQuantity())) && (this.purchaseOrderAmount == null && other.getPurchaseOrderAmount() == null || this.purchaseOrderAmount != null && this.purchaseOrderAmount.equals(other.getPurchaseOrderAmount())) && (this.purchaseOrderQuantityDiff == null && other.getPurchaseOrderQuantityDiff() == null || this.purchaseOrderQuantityDiff != null && this.purchaseOrderQuantityDiff.equals(other.getPurchaseOrderQuantityDiff())) && (this.receiptQuantity == null && other.getReceiptQuantity() == null || this.receiptQuantity != null && this.receiptQuantity.equals(other.getReceiptQuantity())) && (this.receiptAmount == null && other.getReceiptAmount() == null || this.receiptAmount != null && this.receiptAmount.equals(other.getReceiptAmount())) && (this.receiptQuantityDiff == null && other.getReceiptQuantityDiff() == null || this.receiptQuantityDiff != null && this.receiptQuantityDiff.equals(other.getReceiptQuantityDiff())) && (this.currency == null && other.getCurrency() == null || this.currency != null && this.currency.equals(other.getCurrency())) && (this.itemOptionsList == null && other.getItemOptionsList() == null || this.itemOptionsList != null && this.itemOptionsList.equals(other.getItemOptionsList())) && (this.matrixOptionList == null && other.getMatrixOptionList() == null || this.matrixOptionList != null && this.matrixOptionList.equals(other.getMatrixOptionList())) && (this.itemVendorList == null && other.getItemVendorList() == null || this.itemVendorList != null && this.itemVendorList.equals(other.getItemVendorList())) && (this.purchaseTaxCode == null && other.getPurchaseTaxCode() == null || this.purchaseTaxCode != null && this.purchaseTaxCode.equals(other.getPurchaseTaxCode())) && (this.salesTaxCode == null && other.getSalesTaxCode() == null || this.salesTaxCode != null && this.salesTaxCode.equals(other.getSalesTaxCode())) && (this.translationsList == null && other.getTranslationsList() == null || this.translationsList != null && this.translationsList.equals(other.getTranslationsList())) && (this.vendor == null && other.getVendor() == null || this.vendor != null && this.vendor.equals(other.getVendor())) && (this.hierarchyVersionsList == null && other.getHierarchyVersionsList() == null || this.hierarchyVersionsList != null && this.hierarchyVersionsList.equals(other.getHierarchyVersionsList())) && (this.consumptionUnit == null && other.getConsumptionUnit() == null || this.consumptionUnit != null && this.consumptionUnit.equals(other.getConsumptionUnit())) && (this.billQtyVarianceAcct == null && other.getBillQtyVarianceAcct() == null || this.billQtyVarianceAcct != null && this.billQtyVarianceAcct.equals(other.getBillQtyVarianceAcct())) && (this.billPriceVarianceAcct == null && other.getBillPriceVarianceAcct() == null || this.billPriceVarianceAcct != null && this.billPriceVarianceAcct.equals(other.getBillPriceVarianceAcct())) && (this.billExchRateVarianceAcct == null && other.getBillExchRateVarianceAcct() == null || this.billExchRateVarianceAcct != null && this.billExchRateVarianceAcct.equals(other.getBillExchRateVarianceAcct())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
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
        if (this.getCreatedDate() != null) {
            _hashCode += this.getCreatedDate().hashCode();
        }
        if (this.getLastModifiedDate() != null) {
            _hashCode += this.getLastModifiedDate().hashCode();
        }
        if (this.getPurchaseDescription() != null) {
            _hashCode += this.getPurchaseDescription().hashCode();
        }
        if (this.getCost() != null) {
            _hashCode += this.getCost().hashCode();
        }
        if (this.getCostUnits() != null) {
            _hashCode += this.getCostUnits().hashCode();
        }
        if (this.getExpenseAccount() != null) {
            _hashCode += this.getExpenseAccount().hashCode();
        }
        if (this.getIssueProduct() != null) {
            _hashCode += this.getIssueProduct().hashCode();
        }
        if (this.getIsTaxable() != null) {
            _hashCode += this.getIsTaxable().hashCode();
        }
        if (this.getMatrixType() != null) {
            _hashCode += this.getMatrixType().hashCode();
        }
        if (this.getUnitsType() != null) {
            _hashCode += this.getUnitsType().hashCode();
        }
        if (this.getPurchaseUnit() != null) {
            _hashCode += this.getPurchaseUnit().hashCode();
        }
        if (this.getCustomForm() != null) {
            _hashCode += this.getCustomForm().hashCode();
        }
        if (this.getItemId() != null) {
            _hashCode += this.getItemId().hashCode();
        }
        if (this.getUpcCode() != null) {
            _hashCode += this.getUpcCode().hashCode();
        }
        if (this.getDisplayName() != null) {
            _hashCode += this.getDisplayName().hashCode();
        }
        if (this.getIncludeChildren() != null) {
            _hashCode += this.getIncludeChildren().hashCode();
        }
        if (this.getVendorName() != null) {
            _hashCode += this.getVendorName().hashCode();
        }
        if (this.getParent() != null) {
            _hashCode += this.getParent().hashCode();
        }
        if (this.getIsInactive() != null) {
            _hashCode += this.getIsInactive().hashCode();
        }
        if (this.getMatrixItemNameTemplate() != null) {
            _hashCode += this.getMatrixItemNameTemplate().hashCode();
        }
        if (this.getAvailableToPartners() != null) {
            _hashCode += this.getAvailableToPartners().hashCode();
        }
        if (this.getDepartment() != null) {
            _hashCode += this.getDepartment().hashCode();
        }
        if (this.get_class() != null) {
            _hashCode += this.get_class().hashCode();
        }
        if (this.getLocation() != null) {
            _hashCode += this.getLocation().hashCode();
        }
        if (this.getSubsidiaryList() != null) {
            _hashCode += this.getSubsidiaryList().hashCode();
        }
        if (this.getTaxSchedule() != null) {
            _hashCode += this.getTaxSchedule().hashCode();
        }
        if (this.getDeferralAccount() != null) {
            _hashCode += this.getDeferralAccount().hashCode();
        }
        if (this.getAmortizationTemplate() != null) {
            _hashCode += this.getAmortizationTemplate().hashCode();
        }
        if (this.getResidual() != null) {
            _hashCode += this.getResidual().hashCode();
        }
        if (this.getAmortizationPeriod() != null) {
            _hashCode += this.getAmortizationPeriod().hashCode();
        }
        if (this.getIsFulfillable() != null) {
            _hashCode += this.getIsFulfillable().hashCode();
        }
        if (this.getGenerateAccruals() != null) {
            _hashCode += this.getGenerateAccruals().hashCode();
        }
        if (this.getAccountingBookDetailList() != null) {
            _hashCode += this.getAccountingBookDetailList().hashCode();
        }
        if (this.getCostCategory() != null) {
            _hashCode += this.getCostCategory().hashCode();
        }
        if (this.getPurchaseOrderQuantity() != null) {
            _hashCode += this.getPurchaseOrderQuantity().hashCode();
        }
        if (this.getPurchaseOrderAmount() != null) {
            _hashCode += this.getPurchaseOrderAmount().hashCode();
        }
        if (this.getPurchaseOrderQuantityDiff() != null) {
            _hashCode += this.getPurchaseOrderQuantityDiff().hashCode();
        }
        if (this.getReceiptQuantity() != null) {
            _hashCode += this.getReceiptQuantity().hashCode();
        }
        if (this.getReceiptAmount() != null) {
            _hashCode += this.getReceiptAmount().hashCode();
        }
        if (this.getReceiptQuantityDiff() != null) {
            _hashCode += this.getReceiptQuantityDiff().hashCode();
        }
        if (this.getCurrency() != null) {
            _hashCode += this.getCurrency().hashCode();
        }
        if (this.getItemOptionsList() != null) {
            _hashCode += this.getItemOptionsList().hashCode();
        }
        if (this.getMatrixOptionList() != null) {
            _hashCode += this.getMatrixOptionList().hashCode();
        }
        if (this.getItemVendorList() != null) {
            _hashCode += this.getItemVendorList().hashCode();
        }
        if (this.getPurchaseTaxCode() != null) {
            _hashCode += this.getPurchaseTaxCode().hashCode();
        }
        if (this.getSalesTaxCode() != null) {
            _hashCode += this.getSalesTaxCode().hashCode();
        }
        if (this.getTranslationsList() != null) {
            _hashCode += this.getTranslationsList().hashCode();
        }
        if (this.getVendor() != null) {
            _hashCode += this.getVendor().hashCode();
        }
        if (this.getHierarchyVersionsList() != null) {
            _hashCode += this.getHierarchyVersionsList().hashCode();
        }
        if (this.getConsumptionUnit() != null) {
            _hashCode += this.getConsumptionUnit().hashCode();
        }
        if (this.getBillQtyVarianceAcct() != null) {
            _hashCode += this.getBillQtyVarianceAcct().hashCode();
        }
        if (this.getBillPriceVarianceAcct() != null) {
            _hashCode += this.getBillPriceVarianceAcct().hashCode();
        }
        if (this.getBillExchRateVarianceAcct() != null) {
            _hashCode += this.getBillExchRateVarianceAcct().hashCode();
        }
        if (this.getCustomFieldList() != null) {
            _hashCode += this.getCustomFieldList().hashCode();
        }
        if (this.getInternalId() != null) {
            _hashCode += this.getInternalId().hashCode();
        }
        if (this.getExternalId() != null) {
            _hashCode += this.getExternalId().hashCode();
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
        typeDesc.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "NonInventoryPurchaseItem"));
        AttributeDesc attrField = new AttributeDesc();
        attrField.setFieldName("internalId");
        attrField.setXmlName(new QName("", "internalId"));
        attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc((FieldDesc)attrField);
        attrField = new AttributeDesc();
        attrField.setFieldName("externalId");
        attrField.setXmlName(new QName("", "externalId"));
        attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc((FieldDesc)attrField);
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("createdDate");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("purchaseDescription");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "purchaseDescription"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("cost");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "cost"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("costUnits");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "costUnits"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("expenseAccount");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "expenseAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("issueProduct");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "issueProduct"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isTaxable");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "isTaxable"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("matrixType");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "matrixType"));
        elemField.setXmlType(new QName("urn:types.accounting_2022_1.lists.webservices.netsuite.com", "ItemMatrixType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("unitsType");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "unitsType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("purchaseUnit");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "purchaseUnit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customForm");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemId");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "itemId"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("upcCode");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "upcCode"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("displayName");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "displayName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("includeChildren");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "includeChildren"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vendorName");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "vendorName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("parent");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "parent"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isInactive");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "isInactive"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("matrixItemNameTemplate");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "matrixItemNameTemplate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("availableToPartners");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "availableToPartners"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "department"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "class"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "location"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subsidiaryList");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "subsidiaryList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRefList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxSchedule");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "taxSchedule"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("deferralAccount");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "deferralAccount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("amortizationTemplate");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "amortizationTemplate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("residual");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "residual"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("amortizationPeriod");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "amortizationPeriod"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isFulfillable");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "isFulfillable"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("generateAccruals");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "generateAccruals"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("accountingBookDetailList");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "accountingBookDetailList"));
        elemField.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "ItemAccountingBookDetailList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("costCategory");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "costCategory"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("purchaseOrderQuantity");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "purchaseOrderQuantity"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("purchaseOrderAmount");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "purchaseOrderAmount"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("purchaseOrderQuantityDiff");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "purchaseOrderQuantityDiff"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("receiptQuantity");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "receiptQuantity"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("receiptAmount");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "receiptAmount"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("receiptQuantityDiff");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "receiptQuantityDiff"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "currency"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemOptionsList");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "itemOptionsList"));
        elemField.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "ItemOptionsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("matrixOptionList");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "matrixOptionList"));
        elemField.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "MatrixOptionList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("itemVendorList");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "itemVendorList"));
        elemField.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "ItemVendorList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("purchaseTaxCode");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "purchaseTaxCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("salesTaxCode");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "salesTaxCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("translationsList");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "translationsList"));
        elemField.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "TranslationList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vendor");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "vendor"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("hierarchyVersionsList");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "hierarchyVersionsList"));
        elemField.setXmlType(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "NonInventoryPurchaseItemHierarchyVersionsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("consumptionUnit");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "consumptionUnit"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billQtyVarianceAcct");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "billQtyVarianceAcct"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billPriceVarianceAcct");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "billPriceVarianceAcct"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billExchRateVarianceAcct");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "billExchRateVarianceAcct"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new QName("urn:accounting_2022_1.lists.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "CustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

