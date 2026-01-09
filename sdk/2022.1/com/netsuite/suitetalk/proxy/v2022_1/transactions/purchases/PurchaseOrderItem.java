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
package com.netsuite.suitetalk.proxy.v2022_1.transactions.purchases;

import com.netsuite.suitetalk.proxy.v2022_1.platform.common.InventoryDetail;
import com.netsuite.suitetalk.proxy.v2022_1.platform.common.types.TransactionBillVarianceStatus;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.CustomFieldList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRefList;
import java.io.Serializable;
import java.util.Calendar;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class PurchaseOrderItem
implements Serializable {
    private RecordRef item;
    private Long line;
    private Double quantityOnShipments;
    private String vendorName;
    private Double quantityReceived;
    private Double quantityBilled;
    private Double quantityAvailable;
    private Double quantityOnHand;
    private RecordRef taxCode;
    private Double taxRate1;
    private Double taxRate2;
    private Double quantity;
    private Double tax1Amt;
    private Double grossAmt;
    private RecordRef units;
    private InventoryDetail inventoryDetail;
    private String serialNumbers;
    private String description;
    private RecordRef purchaseContract;
    private String rate;
    private Double amount;
    private CustomFieldList options;
    private Double taxAmount;
    private RecordRef department;
    private RecordRef _class;
    private RecordRef location;
    private RecordRef landedCostCategory;
    private RecordRef customer;
    private Boolean isBillable;
    private TransactionBillVarianceStatus billVarianceStatus;
    private Boolean matchBillToReceipt;
    private Calendar expectedReceiptDate;
    private Boolean isClosed;
    private String taxDetailsReference;
    private RecordRef createdFrom;
    private RecordRef assembly;
    private Boolean createOutsourcedWO;
    private Calendar productionEndDate;
    private RecordRef billOfMaterialsRevision;
    private Calendar productionStartDate;
    private RecordRef assemblyUnits;
    private RecordRef billOfMaterials;
    private RecordRefList linkedOrderList;
    private CustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(PurchaseOrderItem.class, true);

    public PurchaseOrderItem() {
    }

    public PurchaseOrderItem(RecordRef item, Long line, Double quantityOnShipments, String vendorName, Double quantityReceived, Double quantityBilled, Double quantityAvailable, Double quantityOnHand, RecordRef taxCode, Double taxRate1, Double taxRate2, Double quantity, Double tax1Amt, Double grossAmt, RecordRef units, InventoryDetail inventoryDetail, String serialNumbers, String description, RecordRef purchaseContract, String rate, Double amount, CustomFieldList options, Double taxAmount, RecordRef department, RecordRef _class, RecordRef location, RecordRef landedCostCategory, RecordRef customer, Boolean isBillable, TransactionBillVarianceStatus billVarianceStatus, Boolean matchBillToReceipt, Calendar expectedReceiptDate, Boolean isClosed, String taxDetailsReference, RecordRef createdFrom, RecordRef assembly, Boolean createOutsourcedWO, Calendar productionEndDate, RecordRef billOfMaterialsRevision, Calendar productionStartDate, RecordRef assemblyUnits, RecordRef billOfMaterials, RecordRefList linkedOrderList, CustomFieldList customFieldList) {
        this.item = item;
        this.line = line;
        this.quantityOnShipments = quantityOnShipments;
        this.vendorName = vendorName;
        this.quantityReceived = quantityReceived;
        this.quantityBilled = quantityBilled;
        this.quantityAvailable = quantityAvailable;
        this.quantityOnHand = quantityOnHand;
        this.taxCode = taxCode;
        this.taxRate1 = taxRate1;
        this.taxRate2 = taxRate2;
        this.quantity = quantity;
        this.tax1Amt = tax1Amt;
        this.grossAmt = grossAmt;
        this.units = units;
        this.inventoryDetail = inventoryDetail;
        this.serialNumbers = serialNumbers;
        this.description = description;
        this.purchaseContract = purchaseContract;
        this.rate = rate;
        this.amount = amount;
        this.options = options;
        this.taxAmount = taxAmount;
        this.department = department;
        this._class = _class;
        this.location = location;
        this.landedCostCategory = landedCostCategory;
        this.customer = customer;
        this.isBillable = isBillable;
        this.billVarianceStatus = billVarianceStatus;
        this.matchBillToReceipt = matchBillToReceipt;
        this.expectedReceiptDate = expectedReceiptDate;
        this.isClosed = isClosed;
        this.taxDetailsReference = taxDetailsReference;
        this.createdFrom = createdFrom;
        this.assembly = assembly;
        this.createOutsourcedWO = createOutsourcedWO;
        this.productionEndDate = productionEndDate;
        this.billOfMaterialsRevision = billOfMaterialsRevision;
        this.productionStartDate = productionStartDate;
        this.assemblyUnits = assemblyUnits;
        this.billOfMaterials = billOfMaterials;
        this.linkedOrderList = linkedOrderList;
        this.customFieldList = customFieldList;
    }

    public RecordRef getItem() {
        return this.item;
    }

    public void setItem(RecordRef item) {
        this.item = item;
    }

    public Long getLine() {
        return this.line;
    }

    public void setLine(Long line) {
        this.line = line;
    }

    public Double getQuantityOnShipments() {
        return this.quantityOnShipments;
    }

    public void setQuantityOnShipments(Double quantityOnShipments) {
        this.quantityOnShipments = quantityOnShipments;
    }

    public String getVendorName() {
        return this.vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public Double getQuantityReceived() {
        return this.quantityReceived;
    }

    public void setQuantityReceived(Double quantityReceived) {
        this.quantityReceived = quantityReceived;
    }

    public Double getQuantityBilled() {
        return this.quantityBilled;
    }

    public void setQuantityBilled(Double quantityBilled) {
        this.quantityBilled = quantityBilled;
    }

    public Double getQuantityAvailable() {
        return this.quantityAvailable;
    }

    public void setQuantityAvailable(Double quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

    public Double getQuantityOnHand() {
        return this.quantityOnHand;
    }

    public void setQuantityOnHand(Double quantityOnHand) {
        this.quantityOnHand = quantityOnHand;
    }

    public RecordRef getTaxCode() {
        return this.taxCode;
    }

    public void setTaxCode(RecordRef taxCode) {
        this.taxCode = taxCode;
    }

    public Double getTaxRate1() {
        return this.taxRate1;
    }

    public void setTaxRate1(Double taxRate1) {
        this.taxRate1 = taxRate1;
    }

    public Double getTaxRate2() {
        return this.taxRate2;
    }

    public void setTaxRate2(Double taxRate2) {
        this.taxRate2 = taxRate2;
    }

    public Double getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Double getTax1Amt() {
        return this.tax1Amt;
    }

    public void setTax1Amt(Double tax1Amt) {
        this.tax1Amt = tax1Amt;
    }

    public Double getGrossAmt() {
        return this.grossAmt;
    }

    public void setGrossAmt(Double grossAmt) {
        this.grossAmt = grossAmt;
    }

    public RecordRef getUnits() {
        return this.units;
    }

    public void setUnits(RecordRef units) {
        this.units = units;
    }

    public InventoryDetail getInventoryDetail() {
        return this.inventoryDetail;
    }

    public void setInventoryDetail(InventoryDetail inventoryDetail) {
        this.inventoryDetail = inventoryDetail;
    }

    public String getSerialNumbers() {
        return this.serialNumbers;
    }

    public void setSerialNumbers(String serialNumbers) {
        this.serialNumbers = serialNumbers;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public RecordRef getPurchaseContract() {
        return this.purchaseContract;
    }

    public void setPurchaseContract(RecordRef purchaseContract) {
        this.purchaseContract = purchaseContract;
    }

    public String getRate() {
        return this.rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    public Double getAmount() {
        return this.amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

    public CustomFieldList getOptions() {
        return this.options;
    }

    public void setOptions(CustomFieldList options) {
        this.options = options;
    }

    public Double getTaxAmount() {
        return this.taxAmount;
    }

    public void setTaxAmount(Double taxAmount) {
        this.taxAmount = taxAmount;
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

    public RecordRef getLandedCostCategory() {
        return this.landedCostCategory;
    }

    public void setLandedCostCategory(RecordRef landedCostCategory) {
        this.landedCostCategory = landedCostCategory;
    }

    public RecordRef getCustomer() {
        return this.customer;
    }

    public void setCustomer(RecordRef customer) {
        this.customer = customer;
    }

    public Boolean getIsBillable() {
        return this.isBillable;
    }

    public void setIsBillable(Boolean isBillable) {
        this.isBillable = isBillable;
    }

    public TransactionBillVarianceStatus getBillVarianceStatus() {
        return this.billVarianceStatus;
    }

    public void setBillVarianceStatus(TransactionBillVarianceStatus billVarianceStatus) {
        this.billVarianceStatus = billVarianceStatus;
    }

    public Boolean getMatchBillToReceipt() {
        return this.matchBillToReceipt;
    }

    public void setMatchBillToReceipt(Boolean matchBillToReceipt) {
        this.matchBillToReceipt = matchBillToReceipt;
    }

    public Calendar getExpectedReceiptDate() {
        return this.expectedReceiptDate;
    }

    public void setExpectedReceiptDate(Calendar expectedReceiptDate) {
        this.expectedReceiptDate = expectedReceiptDate;
    }

    public Boolean getIsClosed() {
        return this.isClosed;
    }

    public void setIsClosed(Boolean isClosed) {
        this.isClosed = isClosed;
    }

    public String getTaxDetailsReference() {
        return this.taxDetailsReference;
    }

    public void setTaxDetailsReference(String taxDetailsReference) {
        this.taxDetailsReference = taxDetailsReference;
    }

    public RecordRef getCreatedFrom() {
        return this.createdFrom;
    }

    public void setCreatedFrom(RecordRef createdFrom) {
        this.createdFrom = createdFrom;
    }

    public RecordRef getAssembly() {
        return this.assembly;
    }

    public void setAssembly(RecordRef assembly) {
        this.assembly = assembly;
    }

    public Boolean getCreateOutsourcedWO() {
        return this.createOutsourcedWO;
    }

    public void setCreateOutsourcedWO(Boolean createOutsourcedWO) {
        this.createOutsourcedWO = createOutsourcedWO;
    }

    public Calendar getProductionEndDate() {
        return this.productionEndDate;
    }

    public void setProductionEndDate(Calendar productionEndDate) {
        this.productionEndDate = productionEndDate;
    }

    public RecordRef getBillOfMaterialsRevision() {
        return this.billOfMaterialsRevision;
    }

    public void setBillOfMaterialsRevision(RecordRef billOfMaterialsRevision) {
        this.billOfMaterialsRevision = billOfMaterialsRevision;
    }

    public Calendar getProductionStartDate() {
        return this.productionStartDate;
    }

    public void setProductionStartDate(Calendar productionStartDate) {
        this.productionStartDate = productionStartDate;
    }

    public RecordRef getAssemblyUnits() {
        return this.assemblyUnits;
    }

    public void setAssemblyUnits(RecordRef assemblyUnits) {
        this.assemblyUnits = assemblyUnits;
    }

    public RecordRef getBillOfMaterials() {
        return this.billOfMaterials;
    }

    public void setBillOfMaterials(RecordRef billOfMaterials) {
        this.billOfMaterials = billOfMaterials;
    }

    public RecordRefList getLinkedOrderList() {
        return this.linkedOrderList;
    }

    public void setLinkedOrderList(RecordRefList linkedOrderList) {
        this.linkedOrderList = linkedOrderList;
    }

    public CustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(CustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PurchaseOrderItem)) {
            return false;
        }
        PurchaseOrderItem other = (PurchaseOrderItem)obj;
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
        boolean _equals = (this.item == null && other.getItem() == null || this.item != null && this.item.equals(other.getItem())) && (this.line == null && other.getLine() == null || this.line != null && this.line.equals(other.getLine())) && (this.quantityOnShipments == null && other.getQuantityOnShipments() == null || this.quantityOnShipments != null && this.quantityOnShipments.equals(other.getQuantityOnShipments())) && (this.vendorName == null && other.getVendorName() == null || this.vendorName != null && this.vendorName.equals(other.getVendorName())) && (this.quantityReceived == null && other.getQuantityReceived() == null || this.quantityReceived != null && this.quantityReceived.equals(other.getQuantityReceived())) && (this.quantityBilled == null && other.getQuantityBilled() == null || this.quantityBilled != null && this.quantityBilled.equals(other.getQuantityBilled())) && (this.quantityAvailable == null && other.getQuantityAvailable() == null || this.quantityAvailable != null && this.quantityAvailable.equals(other.getQuantityAvailable())) && (this.quantityOnHand == null && other.getQuantityOnHand() == null || this.quantityOnHand != null && this.quantityOnHand.equals(other.getQuantityOnHand())) && (this.taxCode == null && other.getTaxCode() == null || this.taxCode != null && this.taxCode.equals(other.getTaxCode())) && (this.taxRate1 == null && other.getTaxRate1() == null || this.taxRate1 != null && this.taxRate1.equals(other.getTaxRate1())) && (this.taxRate2 == null && other.getTaxRate2() == null || this.taxRate2 != null && this.taxRate2.equals(other.getTaxRate2())) && (this.quantity == null && other.getQuantity() == null || this.quantity != null && this.quantity.equals(other.getQuantity())) && (this.tax1Amt == null && other.getTax1Amt() == null || this.tax1Amt != null && this.tax1Amt.equals(other.getTax1Amt())) && (this.grossAmt == null && other.getGrossAmt() == null || this.grossAmt != null && this.grossAmt.equals(other.getGrossAmt())) && (this.units == null && other.getUnits() == null || this.units != null && this.units.equals(other.getUnits())) && (this.inventoryDetail == null && other.getInventoryDetail() == null || this.inventoryDetail != null && this.inventoryDetail.equals(other.getInventoryDetail())) && (this.serialNumbers == null && other.getSerialNumbers() == null || this.serialNumbers != null && this.serialNumbers.equals(other.getSerialNumbers())) && (this.description == null && other.getDescription() == null || this.description != null && this.description.equals(other.getDescription())) && (this.purchaseContract == null && other.getPurchaseContract() == null || this.purchaseContract != null && this.purchaseContract.equals(other.getPurchaseContract())) && (this.rate == null && other.getRate() == null || this.rate != null && this.rate.equals(other.getRate())) && (this.amount == null && other.getAmount() == null || this.amount != null && this.amount.equals(other.getAmount())) && (this.options == null && other.getOptions() == null || this.options != null && this.options.equals(other.getOptions())) && (this.taxAmount == null && other.getTaxAmount() == null || this.taxAmount != null && this.taxAmount.equals(other.getTaxAmount())) && (this.department == null && other.getDepartment() == null || this.department != null && this.department.equals(other.getDepartment())) && (this._class == null && other.get_class() == null || this._class != null && this._class.equals(other.get_class())) && (this.location == null && other.getLocation() == null || this.location != null && this.location.equals(other.getLocation())) && (this.landedCostCategory == null && other.getLandedCostCategory() == null || this.landedCostCategory != null && this.landedCostCategory.equals(other.getLandedCostCategory())) && (this.customer == null && other.getCustomer() == null || this.customer != null && this.customer.equals(other.getCustomer())) && (this.isBillable == null && other.getIsBillable() == null || this.isBillable != null && this.isBillable.equals(other.getIsBillable())) && (this.billVarianceStatus == null && other.getBillVarianceStatus() == null || this.billVarianceStatus != null && this.billVarianceStatus.equals(other.getBillVarianceStatus())) && (this.matchBillToReceipt == null && other.getMatchBillToReceipt() == null || this.matchBillToReceipt != null && this.matchBillToReceipt.equals(other.getMatchBillToReceipt())) && (this.expectedReceiptDate == null && other.getExpectedReceiptDate() == null || this.expectedReceiptDate != null && this.expectedReceiptDate.equals(other.getExpectedReceiptDate())) && (this.isClosed == null && other.getIsClosed() == null || this.isClosed != null && this.isClosed.equals(other.getIsClosed())) && (this.taxDetailsReference == null && other.getTaxDetailsReference() == null || this.taxDetailsReference != null && this.taxDetailsReference.equals(other.getTaxDetailsReference())) && (this.createdFrom == null && other.getCreatedFrom() == null || this.createdFrom != null && this.createdFrom.equals(other.getCreatedFrom())) && (this.assembly == null && other.getAssembly() == null || this.assembly != null && this.assembly.equals(other.getAssembly())) && (this.createOutsourcedWO == null && other.getCreateOutsourcedWO() == null || this.createOutsourcedWO != null && this.createOutsourcedWO.equals(other.getCreateOutsourcedWO())) && (this.productionEndDate == null && other.getProductionEndDate() == null || this.productionEndDate != null && this.productionEndDate.equals(other.getProductionEndDate())) && (this.billOfMaterialsRevision == null && other.getBillOfMaterialsRevision() == null || this.billOfMaterialsRevision != null && this.billOfMaterialsRevision.equals(other.getBillOfMaterialsRevision())) && (this.productionStartDate == null && other.getProductionStartDate() == null || this.productionStartDate != null && this.productionStartDate.equals(other.getProductionStartDate())) && (this.assemblyUnits == null && other.getAssemblyUnits() == null || this.assemblyUnits != null && this.assemblyUnits.equals(other.getAssemblyUnits())) && (this.billOfMaterials == null && other.getBillOfMaterials() == null || this.billOfMaterials != null && this.billOfMaterials.equals(other.getBillOfMaterials())) && (this.linkedOrderList == null && other.getLinkedOrderList() == null || this.linkedOrderList != null && this.linkedOrderList.equals(other.getLinkedOrderList())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getItem() != null) {
            _hashCode += this.getItem().hashCode();
        }
        if (this.getLine() != null) {
            _hashCode += this.getLine().hashCode();
        }
        if (this.getQuantityOnShipments() != null) {
            _hashCode += this.getQuantityOnShipments().hashCode();
        }
        if (this.getVendorName() != null) {
            _hashCode += this.getVendorName().hashCode();
        }
        if (this.getQuantityReceived() != null) {
            _hashCode += this.getQuantityReceived().hashCode();
        }
        if (this.getQuantityBilled() != null) {
            _hashCode += this.getQuantityBilled().hashCode();
        }
        if (this.getQuantityAvailable() != null) {
            _hashCode += this.getQuantityAvailable().hashCode();
        }
        if (this.getQuantityOnHand() != null) {
            _hashCode += this.getQuantityOnHand().hashCode();
        }
        if (this.getTaxCode() != null) {
            _hashCode += this.getTaxCode().hashCode();
        }
        if (this.getTaxRate1() != null) {
            _hashCode += this.getTaxRate1().hashCode();
        }
        if (this.getTaxRate2() != null) {
            _hashCode += this.getTaxRate2().hashCode();
        }
        if (this.getQuantity() != null) {
            _hashCode += this.getQuantity().hashCode();
        }
        if (this.getTax1Amt() != null) {
            _hashCode += this.getTax1Amt().hashCode();
        }
        if (this.getGrossAmt() != null) {
            _hashCode += this.getGrossAmt().hashCode();
        }
        if (this.getUnits() != null) {
            _hashCode += this.getUnits().hashCode();
        }
        if (this.getInventoryDetail() != null) {
            _hashCode += this.getInventoryDetail().hashCode();
        }
        if (this.getSerialNumbers() != null) {
            _hashCode += this.getSerialNumbers().hashCode();
        }
        if (this.getDescription() != null) {
            _hashCode += this.getDescription().hashCode();
        }
        if (this.getPurchaseContract() != null) {
            _hashCode += this.getPurchaseContract().hashCode();
        }
        if (this.getRate() != null) {
            _hashCode += this.getRate().hashCode();
        }
        if (this.getAmount() != null) {
            _hashCode += this.getAmount().hashCode();
        }
        if (this.getOptions() != null) {
            _hashCode += this.getOptions().hashCode();
        }
        if (this.getTaxAmount() != null) {
            _hashCode += this.getTaxAmount().hashCode();
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
        if (this.getLandedCostCategory() != null) {
            _hashCode += this.getLandedCostCategory().hashCode();
        }
        if (this.getCustomer() != null) {
            _hashCode += this.getCustomer().hashCode();
        }
        if (this.getIsBillable() != null) {
            _hashCode += this.getIsBillable().hashCode();
        }
        if (this.getBillVarianceStatus() != null) {
            _hashCode += this.getBillVarianceStatus().hashCode();
        }
        if (this.getMatchBillToReceipt() != null) {
            _hashCode += this.getMatchBillToReceipt().hashCode();
        }
        if (this.getExpectedReceiptDate() != null) {
            _hashCode += this.getExpectedReceiptDate().hashCode();
        }
        if (this.getIsClosed() != null) {
            _hashCode += this.getIsClosed().hashCode();
        }
        if (this.getTaxDetailsReference() != null) {
            _hashCode += this.getTaxDetailsReference().hashCode();
        }
        if (this.getCreatedFrom() != null) {
            _hashCode += this.getCreatedFrom().hashCode();
        }
        if (this.getAssembly() != null) {
            _hashCode += this.getAssembly().hashCode();
        }
        if (this.getCreateOutsourcedWO() != null) {
            _hashCode += this.getCreateOutsourcedWO().hashCode();
        }
        if (this.getProductionEndDate() != null) {
            _hashCode += this.getProductionEndDate().hashCode();
        }
        if (this.getBillOfMaterialsRevision() != null) {
            _hashCode += this.getBillOfMaterialsRevision().hashCode();
        }
        if (this.getProductionStartDate() != null) {
            _hashCode += this.getProductionStartDate().hashCode();
        }
        if (this.getAssemblyUnits() != null) {
            _hashCode += this.getAssemblyUnits().hashCode();
        }
        if (this.getBillOfMaterials() != null) {
            _hashCode += this.getBillOfMaterials().hashCode();
        }
        if (this.getLinkedOrderList() != null) {
            _hashCode += this.getLinkedOrderList().hashCode();
        }
        if (this.getCustomFieldList() != null) {
            _hashCode += this.getCustomFieldList().hashCode();
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
        typeDesc.setXmlType(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "PurchaseOrderItem"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "item"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("line");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "line"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityOnShipments");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "quantityOnShipments"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("vendorName");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "vendorName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityReceived");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "quantityReceived"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityBilled");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "quantityBilled"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityAvailable");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "quantityAvailable"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityOnHand");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "quantityOnHand"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxCode");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "taxCode"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxRate1");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "taxRate1"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxRate2");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "taxRate2"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "quantity"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("tax1Amt");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "tax1Amt"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("grossAmt");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "grossAmt"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("units");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "units"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("inventoryDetail");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "inventoryDetail"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "InventoryDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("serialNumbers");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "serialNumbers"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "description"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("purchaseContract");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "purchaseContract"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("rate");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "rate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "amount"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("options");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "options"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "CustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxAmount");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "taxAmount"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "department"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "class"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "location"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("landedCostCategory");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "landedCostCategory"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customer");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "customer"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isBillable");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "isBillable"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billVarianceStatus");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "billVarianceStatus"));
        elemField.setXmlType(new QName("urn:types.common_2022_1.platform.webservices.netsuite.com", "TransactionBillVarianceStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("matchBillToReceipt");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "matchBillToReceipt"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("expectedReceiptDate");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "expectedReceiptDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isClosed");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "isClosed"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("taxDetailsReference");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "taxDetailsReference"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("createdFrom");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "createdFrom"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("assembly");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "assembly"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("createOutsourcedWO");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "createOutsourcedWO"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("productionEndDate");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "productionEndDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billOfMaterialsRevision");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "billOfMaterialsRevision"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("productionStartDate");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "productionStartDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("assemblyUnits");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "assemblyUnits"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("billOfMaterials");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "billOfMaterials"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("linkedOrderList");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "linkedOrderList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRefList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new QName("urn:purchases_2022_1.transactions.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "CustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

