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
package com.netsuite.suitetalk.proxy.v2022_1.setup.customization;

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.NullField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import com.netsuite.suitetalk.proxy.v2022_1.setup.customization.CustomFieldDepartmentAccessList;
import com.netsuite.suitetalk.proxy.v2022_1.setup.customization.CustomFieldRoleAccessList;
import com.netsuite.suitetalk.proxy.v2022_1.setup.customization.CustomFieldSubAccessList;
import com.netsuite.suitetalk.proxy.v2022_1.setup.customization.CustomFieldTranslationsList;
import com.netsuite.suitetalk.proxy.v2022_1.setup.customization.CustomFieldType;
import com.netsuite.suitetalk.proxy.v2022_1.setup.customization.TransactionColumnCustomFieldFilterList;
import com.netsuite.suitetalk.proxy.v2022_1.setup.customization.types.CustomizationAccessLevel;
import com.netsuite.suitetalk.proxy.v2022_1.setup.customization.types.CustomizationDisplayType;
import com.netsuite.suitetalk.proxy.v2022_1.setup.customization.types.CustomizationDynamicDefault;
import com.netsuite.suitetalk.proxy.v2022_1.setup.customization.types.CustomizationFieldType;
import com.netsuite.suitetalk.proxy.v2022_1.setup.customization.types.CustomizationSearchLevel;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.AttributeDesc;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class TransactionColumnCustomField
extends CustomFieldType
implements Serializable {
    private String label;
    private RecordRef owner;
    private String description;
    private RecordRef selectRecordType;
    private Boolean storeValue;
    private RecordRef insertBefore;
    private Boolean availableToSso;
    private CustomizationDisplayType displayType;
    private Long displayWidth;
    private Long displayHeight;
    private String help;
    private String linkText;
    private Boolean isMandatory;
    private Long maxLength;
    private Double minValue;
    private Double maxValue;
    private Boolean defaultChecked;
    private String defaultValue;
    private Boolean isFormula;
    private RecordRef defaultSelection;
    private CustomizationDynamicDefault dynamicDefault;
    private RecordRef sourceList;
    private RecordRef sourceFrom;
    private RecordRef sourceFilterBy;
    private RecordRef customSegment;
    private Boolean colExpense;
    private Boolean colPurchase;
    private Boolean colSale;
    private Boolean colOpportunity;
    private Boolean colStore;
    private Boolean colStoreHidden;
    private Boolean colJournal;
    private Boolean colBuild;
    private Boolean colExpenseReport;
    private Boolean colTime;
    private Boolean colTransferOrder;
    private Boolean colTimeGroup;
    private Boolean colItemReceipt;
    private Boolean colItemReceiptOrder;
    private Boolean colItemFulfillment;
    private Boolean colItemFulfillmentOrder;
    private Boolean colPrintFlag;
    private Boolean colPickingTicket;
    private Boolean colPackingSlip;
    private Boolean colReturnForm;
    private Boolean colStoreWithGroups;
    private Boolean colGroupOnInvoices;
    private Boolean colKitItem;
    private TransactionColumnCustomFieldFilterList filterList;
    private CustomizationAccessLevel accessLevel;
    private CustomizationSearchLevel searchLevel;
    private CustomFieldRoleAccessList roleAccessList;
    private CustomFieldDepartmentAccessList deptAccessList;
    private CustomFieldSubAccessList subAccessList;
    private CustomFieldTranslationsList translationsList;
    private String internalId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(TransactionColumnCustomField.class, true);

    public TransactionColumnCustomField() {
    }

    public TransactionColumnCustomField(NullField nullFieldList, CustomizationFieldType fieldType, String scriptId, String internalId, String label, RecordRef owner, String description, RecordRef selectRecordType, Boolean storeValue, RecordRef insertBefore, Boolean availableToSso, CustomizationDisplayType displayType, Long displayWidth, Long displayHeight, String help, String linkText, Boolean isMandatory, Long maxLength, Double minValue, Double maxValue, Boolean defaultChecked, String defaultValue, Boolean isFormula, RecordRef defaultSelection, CustomizationDynamicDefault dynamicDefault, RecordRef sourceList, RecordRef sourceFrom, RecordRef sourceFilterBy, RecordRef customSegment, Boolean colExpense, Boolean colPurchase, Boolean colSale, Boolean colOpportunity, Boolean colStore, Boolean colStoreHidden, Boolean colJournal, Boolean colBuild, Boolean colExpenseReport, Boolean colTime, Boolean colTransferOrder, Boolean colTimeGroup, Boolean colItemReceipt, Boolean colItemReceiptOrder, Boolean colItemFulfillment, Boolean colItemFulfillmentOrder, Boolean colPrintFlag, Boolean colPickingTicket, Boolean colPackingSlip, Boolean colReturnForm, Boolean colStoreWithGroups, Boolean colGroupOnInvoices, Boolean colKitItem, TransactionColumnCustomFieldFilterList filterList, CustomizationAccessLevel accessLevel, CustomizationSearchLevel searchLevel, CustomFieldRoleAccessList roleAccessList, CustomFieldDepartmentAccessList deptAccessList, CustomFieldSubAccessList subAccessList, CustomFieldTranslationsList translationsList) {
        super(nullFieldList, fieldType, scriptId);
        this.internalId = internalId;
        this.label = label;
        this.owner = owner;
        this.description = description;
        this.selectRecordType = selectRecordType;
        this.storeValue = storeValue;
        this.insertBefore = insertBefore;
        this.availableToSso = availableToSso;
        this.displayType = displayType;
        this.displayWidth = displayWidth;
        this.displayHeight = displayHeight;
        this.help = help;
        this.linkText = linkText;
        this.isMandatory = isMandatory;
        this.maxLength = maxLength;
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.defaultChecked = defaultChecked;
        this.defaultValue = defaultValue;
        this.isFormula = isFormula;
        this.defaultSelection = defaultSelection;
        this.dynamicDefault = dynamicDefault;
        this.sourceList = sourceList;
        this.sourceFrom = sourceFrom;
        this.sourceFilterBy = sourceFilterBy;
        this.customSegment = customSegment;
        this.colExpense = colExpense;
        this.colPurchase = colPurchase;
        this.colSale = colSale;
        this.colOpportunity = colOpportunity;
        this.colStore = colStore;
        this.colStoreHidden = colStoreHidden;
        this.colJournal = colJournal;
        this.colBuild = colBuild;
        this.colExpenseReport = colExpenseReport;
        this.colTime = colTime;
        this.colTransferOrder = colTransferOrder;
        this.colTimeGroup = colTimeGroup;
        this.colItemReceipt = colItemReceipt;
        this.colItemReceiptOrder = colItemReceiptOrder;
        this.colItemFulfillment = colItemFulfillment;
        this.colItemFulfillmentOrder = colItemFulfillmentOrder;
        this.colPrintFlag = colPrintFlag;
        this.colPickingTicket = colPickingTicket;
        this.colPackingSlip = colPackingSlip;
        this.colReturnForm = colReturnForm;
        this.colStoreWithGroups = colStoreWithGroups;
        this.colGroupOnInvoices = colGroupOnInvoices;
        this.colKitItem = colKitItem;
        this.filterList = filterList;
        this.accessLevel = accessLevel;
        this.searchLevel = searchLevel;
        this.roleAccessList = roleAccessList;
        this.deptAccessList = deptAccessList;
        this.subAccessList = subAccessList;
        this.translationsList = translationsList;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public RecordRef getOwner() {
        return this.owner;
    }

    public void setOwner(RecordRef owner) {
        this.owner = owner;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public RecordRef getSelectRecordType() {
        return this.selectRecordType;
    }

    public void setSelectRecordType(RecordRef selectRecordType) {
        this.selectRecordType = selectRecordType;
    }

    public Boolean getStoreValue() {
        return this.storeValue;
    }

    public void setStoreValue(Boolean storeValue) {
        this.storeValue = storeValue;
    }

    public RecordRef getInsertBefore() {
        return this.insertBefore;
    }

    public void setInsertBefore(RecordRef insertBefore) {
        this.insertBefore = insertBefore;
    }

    public Boolean getAvailableToSso() {
        return this.availableToSso;
    }

    public void setAvailableToSso(Boolean availableToSso) {
        this.availableToSso = availableToSso;
    }

    public CustomizationDisplayType getDisplayType() {
        return this.displayType;
    }

    public void setDisplayType(CustomizationDisplayType displayType) {
        this.displayType = displayType;
    }

    public Long getDisplayWidth() {
        return this.displayWidth;
    }

    public void setDisplayWidth(Long displayWidth) {
        this.displayWidth = displayWidth;
    }

    public Long getDisplayHeight() {
        return this.displayHeight;
    }

    public void setDisplayHeight(Long displayHeight) {
        this.displayHeight = displayHeight;
    }

    public String getHelp() {
        return this.help;
    }

    public void setHelp(String help) {
        this.help = help;
    }

    public String getLinkText() {
        return this.linkText;
    }

    public void setLinkText(String linkText) {
        this.linkText = linkText;
    }

    public Boolean getIsMandatory() {
        return this.isMandatory;
    }

    public void setIsMandatory(Boolean isMandatory) {
        this.isMandatory = isMandatory;
    }

    public Long getMaxLength() {
        return this.maxLength;
    }

    public void setMaxLength(Long maxLength) {
        this.maxLength = maxLength;
    }

    public Double getMinValue() {
        return this.minValue;
    }

    public void setMinValue(Double minValue) {
        this.minValue = minValue;
    }

    public Double getMaxValue() {
        return this.maxValue;
    }

    public void setMaxValue(Double maxValue) {
        this.maxValue = maxValue;
    }

    public Boolean getDefaultChecked() {
        return this.defaultChecked;
    }

    public void setDefaultChecked(Boolean defaultChecked) {
        this.defaultChecked = defaultChecked;
    }

    public String getDefaultValue() {
        return this.defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public Boolean getIsFormula() {
        return this.isFormula;
    }

    public void setIsFormula(Boolean isFormula) {
        this.isFormula = isFormula;
    }

    public RecordRef getDefaultSelection() {
        return this.defaultSelection;
    }

    public void setDefaultSelection(RecordRef defaultSelection) {
        this.defaultSelection = defaultSelection;
    }

    public CustomizationDynamicDefault getDynamicDefault() {
        return this.dynamicDefault;
    }

    public void setDynamicDefault(CustomizationDynamicDefault dynamicDefault) {
        this.dynamicDefault = dynamicDefault;
    }

    public RecordRef getSourceList() {
        return this.sourceList;
    }

    public void setSourceList(RecordRef sourceList) {
        this.sourceList = sourceList;
    }

    public RecordRef getSourceFrom() {
        return this.sourceFrom;
    }

    public void setSourceFrom(RecordRef sourceFrom) {
        this.sourceFrom = sourceFrom;
    }

    public RecordRef getSourceFilterBy() {
        return this.sourceFilterBy;
    }

    public void setSourceFilterBy(RecordRef sourceFilterBy) {
        this.sourceFilterBy = sourceFilterBy;
    }

    public RecordRef getCustomSegment() {
        return this.customSegment;
    }

    public void setCustomSegment(RecordRef customSegment) {
        this.customSegment = customSegment;
    }

    public Boolean getColExpense() {
        return this.colExpense;
    }

    public void setColExpense(Boolean colExpense) {
        this.colExpense = colExpense;
    }

    public Boolean getColPurchase() {
        return this.colPurchase;
    }

    public void setColPurchase(Boolean colPurchase) {
        this.colPurchase = colPurchase;
    }

    public Boolean getColSale() {
        return this.colSale;
    }

    public void setColSale(Boolean colSale) {
        this.colSale = colSale;
    }

    public Boolean getColOpportunity() {
        return this.colOpportunity;
    }

    public void setColOpportunity(Boolean colOpportunity) {
        this.colOpportunity = colOpportunity;
    }

    public Boolean getColStore() {
        return this.colStore;
    }

    public void setColStore(Boolean colStore) {
        this.colStore = colStore;
    }

    public Boolean getColStoreHidden() {
        return this.colStoreHidden;
    }

    public void setColStoreHidden(Boolean colStoreHidden) {
        this.colStoreHidden = colStoreHidden;
    }

    public Boolean getColJournal() {
        return this.colJournal;
    }

    public void setColJournal(Boolean colJournal) {
        this.colJournal = colJournal;
    }

    public Boolean getColBuild() {
        return this.colBuild;
    }

    public void setColBuild(Boolean colBuild) {
        this.colBuild = colBuild;
    }

    public Boolean getColExpenseReport() {
        return this.colExpenseReport;
    }

    public void setColExpenseReport(Boolean colExpenseReport) {
        this.colExpenseReport = colExpenseReport;
    }

    public Boolean getColTime() {
        return this.colTime;
    }

    public void setColTime(Boolean colTime) {
        this.colTime = colTime;
    }

    public Boolean getColTransferOrder() {
        return this.colTransferOrder;
    }

    public void setColTransferOrder(Boolean colTransferOrder) {
        this.colTransferOrder = colTransferOrder;
    }

    public Boolean getColTimeGroup() {
        return this.colTimeGroup;
    }

    public void setColTimeGroup(Boolean colTimeGroup) {
        this.colTimeGroup = colTimeGroup;
    }

    public Boolean getColItemReceipt() {
        return this.colItemReceipt;
    }

    public void setColItemReceipt(Boolean colItemReceipt) {
        this.colItemReceipt = colItemReceipt;
    }

    public Boolean getColItemReceiptOrder() {
        return this.colItemReceiptOrder;
    }

    public void setColItemReceiptOrder(Boolean colItemReceiptOrder) {
        this.colItemReceiptOrder = colItemReceiptOrder;
    }

    public Boolean getColItemFulfillment() {
        return this.colItemFulfillment;
    }

    public void setColItemFulfillment(Boolean colItemFulfillment) {
        this.colItemFulfillment = colItemFulfillment;
    }

    public Boolean getColItemFulfillmentOrder() {
        return this.colItemFulfillmentOrder;
    }

    public void setColItemFulfillmentOrder(Boolean colItemFulfillmentOrder) {
        this.colItemFulfillmentOrder = colItemFulfillmentOrder;
    }

    public Boolean getColPrintFlag() {
        return this.colPrintFlag;
    }

    public void setColPrintFlag(Boolean colPrintFlag) {
        this.colPrintFlag = colPrintFlag;
    }

    public Boolean getColPickingTicket() {
        return this.colPickingTicket;
    }

    public void setColPickingTicket(Boolean colPickingTicket) {
        this.colPickingTicket = colPickingTicket;
    }

    public Boolean getColPackingSlip() {
        return this.colPackingSlip;
    }

    public void setColPackingSlip(Boolean colPackingSlip) {
        this.colPackingSlip = colPackingSlip;
    }

    public Boolean getColReturnForm() {
        return this.colReturnForm;
    }

    public void setColReturnForm(Boolean colReturnForm) {
        this.colReturnForm = colReturnForm;
    }

    public Boolean getColStoreWithGroups() {
        return this.colStoreWithGroups;
    }

    public void setColStoreWithGroups(Boolean colStoreWithGroups) {
        this.colStoreWithGroups = colStoreWithGroups;
    }

    public Boolean getColGroupOnInvoices() {
        return this.colGroupOnInvoices;
    }

    public void setColGroupOnInvoices(Boolean colGroupOnInvoices) {
        this.colGroupOnInvoices = colGroupOnInvoices;
    }

    public Boolean getColKitItem() {
        return this.colKitItem;
    }

    public void setColKitItem(Boolean colKitItem) {
        this.colKitItem = colKitItem;
    }

    public TransactionColumnCustomFieldFilterList getFilterList() {
        return this.filterList;
    }

    public void setFilterList(TransactionColumnCustomFieldFilterList filterList) {
        this.filterList = filterList;
    }

    public CustomizationAccessLevel getAccessLevel() {
        return this.accessLevel;
    }

    public void setAccessLevel(CustomizationAccessLevel accessLevel) {
        this.accessLevel = accessLevel;
    }

    public CustomizationSearchLevel getSearchLevel() {
        return this.searchLevel;
    }

    public void setSearchLevel(CustomizationSearchLevel searchLevel) {
        this.searchLevel = searchLevel;
    }

    public CustomFieldRoleAccessList getRoleAccessList() {
        return this.roleAccessList;
    }

    public void setRoleAccessList(CustomFieldRoleAccessList roleAccessList) {
        this.roleAccessList = roleAccessList;
    }

    public CustomFieldDepartmentAccessList getDeptAccessList() {
        return this.deptAccessList;
    }

    public void setDeptAccessList(CustomFieldDepartmentAccessList deptAccessList) {
        this.deptAccessList = deptAccessList;
    }

    public CustomFieldSubAccessList getSubAccessList() {
        return this.subAccessList;
    }

    public void setSubAccessList(CustomFieldSubAccessList subAccessList) {
        this.subAccessList = subAccessList;
    }

    public CustomFieldTranslationsList getTranslationsList() {
        return this.translationsList;
    }

    public void setTranslationsList(CustomFieldTranslationsList translationsList) {
        this.translationsList = translationsList;
    }

    public String getInternalId() {
        return this.internalId;
    }

    public void setInternalId(String internalId) {
        this.internalId = internalId;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof TransactionColumnCustomField)) {
            return false;
        }
        TransactionColumnCustomField other = (TransactionColumnCustomField)obj;
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
        boolean _equals = super.equals(obj) && (this.label == null && other.getLabel() == null || this.label != null && this.label.equals(other.getLabel())) && (this.owner == null && other.getOwner() == null || this.owner != null && this.owner.equals(other.getOwner())) && (this.description == null && other.getDescription() == null || this.description != null && this.description.equals(other.getDescription())) && (this.selectRecordType == null && other.getSelectRecordType() == null || this.selectRecordType != null && this.selectRecordType.equals(other.getSelectRecordType())) && (this.storeValue == null && other.getStoreValue() == null || this.storeValue != null && this.storeValue.equals(other.getStoreValue())) && (this.insertBefore == null && other.getInsertBefore() == null || this.insertBefore != null && this.insertBefore.equals(other.getInsertBefore())) && (this.availableToSso == null && other.getAvailableToSso() == null || this.availableToSso != null && this.availableToSso.equals(other.getAvailableToSso())) && (this.displayType == null && other.getDisplayType() == null || this.displayType != null && this.displayType.equals(other.getDisplayType())) && (this.displayWidth == null && other.getDisplayWidth() == null || this.displayWidth != null && this.displayWidth.equals(other.getDisplayWidth())) && (this.displayHeight == null && other.getDisplayHeight() == null || this.displayHeight != null && this.displayHeight.equals(other.getDisplayHeight())) && (this.help == null && other.getHelp() == null || this.help != null && this.help.equals(other.getHelp())) && (this.linkText == null && other.getLinkText() == null || this.linkText != null && this.linkText.equals(other.getLinkText())) && (this.isMandatory == null && other.getIsMandatory() == null || this.isMandatory != null && this.isMandatory.equals(other.getIsMandatory())) && (this.maxLength == null && other.getMaxLength() == null || this.maxLength != null && this.maxLength.equals(other.getMaxLength())) && (this.minValue == null && other.getMinValue() == null || this.minValue != null && this.minValue.equals(other.getMinValue())) && (this.maxValue == null && other.getMaxValue() == null || this.maxValue != null && this.maxValue.equals(other.getMaxValue())) && (this.defaultChecked == null && other.getDefaultChecked() == null || this.defaultChecked != null && this.defaultChecked.equals(other.getDefaultChecked())) && (this.defaultValue == null && other.getDefaultValue() == null || this.defaultValue != null && this.defaultValue.equals(other.getDefaultValue())) && (this.isFormula == null && other.getIsFormula() == null || this.isFormula != null && this.isFormula.equals(other.getIsFormula())) && (this.defaultSelection == null && other.getDefaultSelection() == null || this.defaultSelection != null && this.defaultSelection.equals(other.getDefaultSelection())) && (this.dynamicDefault == null && other.getDynamicDefault() == null || this.dynamicDefault != null && this.dynamicDefault.equals(other.getDynamicDefault())) && (this.sourceList == null && other.getSourceList() == null || this.sourceList != null && this.sourceList.equals(other.getSourceList())) && (this.sourceFrom == null && other.getSourceFrom() == null || this.sourceFrom != null && this.sourceFrom.equals(other.getSourceFrom())) && (this.sourceFilterBy == null && other.getSourceFilterBy() == null || this.sourceFilterBy != null && this.sourceFilterBy.equals(other.getSourceFilterBy())) && (this.customSegment == null && other.getCustomSegment() == null || this.customSegment != null && this.customSegment.equals(other.getCustomSegment())) && (this.colExpense == null && other.getColExpense() == null || this.colExpense != null && this.colExpense.equals(other.getColExpense())) && (this.colPurchase == null && other.getColPurchase() == null || this.colPurchase != null && this.colPurchase.equals(other.getColPurchase())) && (this.colSale == null && other.getColSale() == null || this.colSale != null && this.colSale.equals(other.getColSale())) && (this.colOpportunity == null && other.getColOpportunity() == null || this.colOpportunity != null && this.colOpportunity.equals(other.getColOpportunity())) && (this.colStore == null && other.getColStore() == null || this.colStore != null && this.colStore.equals(other.getColStore())) && (this.colStoreHidden == null && other.getColStoreHidden() == null || this.colStoreHidden != null && this.colStoreHidden.equals(other.getColStoreHidden())) && (this.colJournal == null && other.getColJournal() == null || this.colJournal != null && this.colJournal.equals(other.getColJournal())) && (this.colBuild == null && other.getColBuild() == null || this.colBuild != null && this.colBuild.equals(other.getColBuild())) && (this.colExpenseReport == null && other.getColExpenseReport() == null || this.colExpenseReport != null && this.colExpenseReport.equals(other.getColExpenseReport())) && (this.colTime == null && other.getColTime() == null || this.colTime != null && this.colTime.equals(other.getColTime())) && (this.colTransferOrder == null && other.getColTransferOrder() == null || this.colTransferOrder != null && this.colTransferOrder.equals(other.getColTransferOrder())) && (this.colTimeGroup == null && other.getColTimeGroup() == null || this.colTimeGroup != null && this.colTimeGroup.equals(other.getColTimeGroup())) && (this.colItemReceipt == null && other.getColItemReceipt() == null || this.colItemReceipt != null && this.colItemReceipt.equals(other.getColItemReceipt())) && (this.colItemReceiptOrder == null && other.getColItemReceiptOrder() == null || this.colItemReceiptOrder != null && this.colItemReceiptOrder.equals(other.getColItemReceiptOrder())) && (this.colItemFulfillment == null && other.getColItemFulfillment() == null || this.colItemFulfillment != null && this.colItemFulfillment.equals(other.getColItemFulfillment())) && (this.colItemFulfillmentOrder == null && other.getColItemFulfillmentOrder() == null || this.colItemFulfillmentOrder != null && this.colItemFulfillmentOrder.equals(other.getColItemFulfillmentOrder())) && (this.colPrintFlag == null && other.getColPrintFlag() == null || this.colPrintFlag != null && this.colPrintFlag.equals(other.getColPrintFlag())) && (this.colPickingTicket == null && other.getColPickingTicket() == null || this.colPickingTicket != null && this.colPickingTicket.equals(other.getColPickingTicket())) && (this.colPackingSlip == null && other.getColPackingSlip() == null || this.colPackingSlip != null && this.colPackingSlip.equals(other.getColPackingSlip())) && (this.colReturnForm == null && other.getColReturnForm() == null || this.colReturnForm != null && this.colReturnForm.equals(other.getColReturnForm())) && (this.colStoreWithGroups == null && other.getColStoreWithGroups() == null || this.colStoreWithGroups != null && this.colStoreWithGroups.equals(other.getColStoreWithGroups())) && (this.colGroupOnInvoices == null && other.getColGroupOnInvoices() == null || this.colGroupOnInvoices != null && this.colGroupOnInvoices.equals(other.getColGroupOnInvoices())) && (this.colKitItem == null && other.getColKitItem() == null || this.colKitItem != null && this.colKitItem.equals(other.getColKitItem())) && (this.filterList == null && other.getFilterList() == null || this.filterList != null && this.filterList.equals(other.getFilterList())) && (this.accessLevel == null && other.getAccessLevel() == null || this.accessLevel != null && this.accessLevel.equals(other.getAccessLevel())) && (this.searchLevel == null && other.getSearchLevel() == null || this.searchLevel != null && this.searchLevel.equals(other.getSearchLevel())) && (this.roleAccessList == null && other.getRoleAccessList() == null || this.roleAccessList != null && this.roleAccessList.equals(other.getRoleAccessList())) && (this.deptAccessList == null && other.getDeptAccessList() == null || this.deptAccessList != null && this.deptAccessList.equals(other.getDeptAccessList())) && (this.subAccessList == null && other.getSubAccessList() == null || this.subAccessList != null && this.subAccessList.equals(other.getSubAccessList())) && (this.translationsList == null && other.getTranslationsList() == null || this.translationsList != null && this.translationsList.equals(other.getTranslationsList())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId()));
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
        if (this.getLabel() != null) {
            _hashCode += this.getLabel().hashCode();
        }
        if (this.getOwner() != null) {
            _hashCode += this.getOwner().hashCode();
        }
        if (this.getDescription() != null) {
            _hashCode += this.getDescription().hashCode();
        }
        if (this.getSelectRecordType() != null) {
            _hashCode += this.getSelectRecordType().hashCode();
        }
        if (this.getStoreValue() != null) {
            _hashCode += this.getStoreValue().hashCode();
        }
        if (this.getInsertBefore() != null) {
            _hashCode += this.getInsertBefore().hashCode();
        }
        if (this.getAvailableToSso() != null) {
            _hashCode += this.getAvailableToSso().hashCode();
        }
        if (this.getDisplayType() != null) {
            _hashCode += this.getDisplayType().hashCode();
        }
        if (this.getDisplayWidth() != null) {
            _hashCode += this.getDisplayWidth().hashCode();
        }
        if (this.getDisplayHeight() != null) {
            _hashCode += this.getDisplayHeight().hashCode();
        }
        if (this.getHelp() != null) {
            _hashCode += this.getHelp().hashCode();
        }
        if (this.getLinkText() != null) {
            _hashCode += this.getLinkText().hashCode();
        }
        if (this.getIsMandatory() != null) {
            _hashCode += this.getIsMandatory().hashCode();
        }
        if (this.getMaxLength() != null) {
            _hashCode += this.getMaxLength().hashCode();
        }
        if (this.getMinValue() != null) {
            _hashCode += this.getMinValue().hashCode();
        }
        if (this.getMaxValue() != null) {
            _hashCode += this.getMaxValue().hashCode();
        }
        if (this.getDefaultChecked() != null) {
            _hashCode += this.getDefaultChecked().hashCode();
        }
        if (this.getDefaultValue() != null) {
            _hashCode += this.getDefaultValue().hashCode();
        }
        if (this.getIsFormula() != null) {
            _hashCode += this.getIsFormula().hashCode();
        }
        if (this.getDefaultSelection() != null) {
            _hashCode += this.getDefaultSelection().hashCode();
        }
        if (this.getDynamicDefault() != null) {
            _hashCode += this.getDynamicDefault().hashCode();
        }
        if (this.getSourceList() != null) {
            _hashCode += this.getSourceList().hashCode();
        }
        if (this.getSourceFrom() != null) {
            _hashCode += this.getSourceFrom().hashCode();
        }
        if (this.getSourceFilterBy() != null) {
            _hashCode += this.getSourceFilterBy().hashCode();
        }
        if (this.getCustomSegment() != null) {
            _hashCode += this.getCustomSegment().hashCode();
        }
        if (this.getColExpense() != null) {
            _hashCode += this.getColExpense().hashCode();
        }
        if (this.getColPurchase() != null) {
            _hashCode += this.getColPurchase().hashCode();
        }
        if (this.getColSale() != null) {
            _hashCode += this.getColSale().hashCode();
        }
        if (this.getColOpportunity() != null) {
            _hashCode += this.getColOpportunity().hashCode();
        }
        if (this.getColStore() != null) {
            _hashCode += this.getColStore().hashCode();
        }
        if (this.getColStoreHidden() != null) {
            _hashCode += this.getColStoreHidden().hashCode();
        }
        if (this.getColJournal() != null) {
            _hashCode += this.getColJournal().hashCode();
        }
        if (this.getColBuild() != null) {
            _hashCode += this.getColBuild().hashCode();
        }
        if (this.getColExpenseReport() != null) {
            _hashCode += this.getColExpenseReport().hashCode();
        }
        if (this.getColTime() != null) {
            _hashCode += this.getColTime().hashCode();
        }
        if (this.getColTransferOrder() != null) {
            _hashCode += this.getColTransferOrder().hashCode();
        }
        if (this.getColTimeGroup() != null) {
            _hashCode += this.getColTimeGroup().hashCode();
        }
        if (this.getColItemReceipt() != null) {
            _hashCode += this.getColItemReceipt().hashCode();
        }
        if (this.getColItemReceiptOrder() != null) {
            _hashCode += this.getColItemReceiptOrder().hashCode();
        }
        if (this.getColItemFulfillment() != null) {
            _hashCode += this.getColItemFulfillment().hashCode();
        }
        if (this.getColItemFulfillmentOrder() != null) {
            _hashCode += this.getColItemFulfillmentOrder().hashCode();
        }
        if (this.getColPrintFlag() != null) {
            _hashCode += this.getColPrintFlag().hashCode();
        }
        if (this.getColPickingTicket() != null) {
            _hashCode += this.getColPickingTicket().hashCode();
        }
        if (this.getColPackingSlip() != null) {
            _hashCode += this.getColPackingSlip().hashCode();
        }
        if (this.getColReturnForm() != null) {
            _hashCode += this.getColReturnForm().hashCode();
        }
        if (this.getColStoreWithGroups() != null) {
            _hashCode += this.getColStoreWithGroups().hashCode();
        }
        if (this.getColGroupOnInvoices() != null) {
            _hashCode += this.getColGroupOnInvoices().hashCode();
        }
        if (this.getColKitItem() != null) {
            _hashCode += this.getColKitItem().hashCode();
        }
        if (this.getFilterList() != null) {
            _hashCode += this.getFilterList().hashCode();
        }
        if (this.getAccessLevel() != null) {
            _hashCode += this.getAccessLevel().hashCode();
        }
        if (this.getSearchLevel() != null) {
            _hashCode += this.getSearchLevel().hashCode();
        }
        if (this.getRoleAccessList() != null) {
            _hashCode += this.getRoleAccessList().hashCode();
        }
        if (this.getDeptAccessList() != null) {
            _hashCode += this.getDeptAccessList().hashCode();
        }
        if (this.getSubAccessList() != null) {
            _hashCode += this.getSubAccessList().hashCode();
        }
        if (this.getTranslationsList() != null) {
            _hashCode += this.getTranslationsList().hashCode();
        }
        if (this.getInternalId() != null) {
            _hashCode += this.getInternalId().hashCode();
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
        typeDesc.setXmlType(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "TransactionColumnCustomField"));
        AttributeDesc attrField = new AttributeDesc();
        attrField.setFieldName("internalId");
        attrField.setXmlName(new QName("", "internalId"));
        attrField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        typeDesc.addFieldDesc((FieldDesc)attrField);
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("label");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "label"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("owner");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "owner"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "description"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("selectRecordType");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "selectRecordType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("storeValue");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "storeValue"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("insertBefore");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "insertBefore"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("availableToSso");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "availableToSso"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("displayType");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "displayType"));
        elemField.setXmlType(new QName("urn:types.customization_2022_1.setup.webservices.netsuite.com", "CustomizationDisplayType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("displayWidth");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "displayWidth"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("displayHeight");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "displayHeight"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("help");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "help"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("linkText");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "linkText"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isMandatory");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "isMandatory"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("maxLength");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "maxLength"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("minValue");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "minValue"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("maxValue");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "maxValue"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("defaultChecked");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "defaultChecked"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("defaultValue");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "defaultValue"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isFormula");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "isFormula"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("defaultSelection");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "defaultSelection"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("dynamicDefault");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "dynamicDefault"));
        elemField.setXmlType(new QName("urn:types.customization_2022_1.setup.webservices.netsuite.com", "CustomizationDynamicDefault"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("sourceList");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "sourceList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("sourceFrom");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "sourceFrom"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("sourceFilterBy");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "sourceFilterBy"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customSegment");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "customSegment"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("colExpense");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "colExpense"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("colPurchase");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "colPurchase"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("colSale");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "colSale"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("colOpportunity");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "colOpportunity"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("colStore");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "colStore"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("colStoreHidden");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "colStoreHidden"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("colJournal");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "colJournal"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("colBuild");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "colBuild"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("colExpenseReport");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "colExpenseReport"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("colTime");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "colTime"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("colTransferOrder");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "colTransferOrder"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("colTimeGroup");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "colTimeGroup"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("colItemReceipt");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "colItemReceipt"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("colItemReceiptOrder");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "colItemReceiptOrder"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("colItemFulfillment");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "colItemFulfillment"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("colItemFulfillmentOrder");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "colItemFulfillmentOrder"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("colPrintFlag");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "colPrintFlag"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("colPickingTicket");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "colPickingTicket"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("colPackingSlip");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "colPackingSlip"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("colReturnForm");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "colReturnForm"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("colStoreWithGroups");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "colStoreWithGroups"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("colGroupOnInvoices");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "colGroupOnInvoices"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("colKitItem");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "colKitItem"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("filterList");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "filterList"));
        elemField.setXmlType(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "TransactionColumnCustomFieldFilterList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("accessLevel");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "accessLevel"));
        elemField.setXmlType(new QName("urn:types.customization_2022_1.setup.webservices.netsuite.com", "CustomizationAccessLevel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("searchLevel");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "searchLevel"));
        elemField.setXmlType(new QName("urn:types.customization_2022_1.setup.webservices.netsuite.com", "CustomizationSearchLevel"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("roleAccessList");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "roleAccessList"));
        elemField.setXmlType(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "CustomFieldRoleAccessList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("deptAccessList");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "deptAccessList"));
        elemField.setXmlType(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "CustomFieldDepartmentAccessList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subAccessList");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "subAccessList"));
        elemField.setXmlType(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "CustomFieldSubAccessList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("translationsList");
        elemField.setXmlName(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "translationsList"));
        elemField.setXmlType(new QName("urn:customization_2022_1.setup.webservices.netsuite.com", "CustomFieldTranslationsList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

