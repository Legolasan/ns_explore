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
package com.netsuite.suitetalk.proxy.v2022_1.transactions.inventory;

import com.netsuite.suitetalk.proxy.v2022_1.platform.common.InventoryDetail;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.CustomFieldList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.NullField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.Record;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.inventory.WorkOrderCompletionComponentList;
import com.netsuite.suitetalk.proxy.v2022_1.transactions.inventory.WorkOrderCompletionOperationList;
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

public class WorkOrderCompletion
extends Record
implements Serializable {
    private Calendar createdDate;
    private Calendar lastModifiedDate;
    private RecordRef customForm;
    private String tranId;
    private RecordRef item;
    private Double quantity;
    private Double scrapQuantity;
    private RecordRef units;
    private Boolean isBackflush;
    private Double orderQuantity;
    private Double total;
    private RecordRef createdFrom;
    private InventoryDetail inventoryDetail;
    private Calendar tranDate;
    private RecordRef postingPeriod;
    private String memo;
    private RecordRef subsidiary;
    private RecordRef department;
    private RecordRef _class;
    private RecordRef location;
    private RecordRef revision;
    private RecordRef startOperation;
    private RecordRef endOperation;
    private Double completedQuantity;
    private RecordRef manufacturingRouting;
    private WorkOrderCompletionComponentList componentList;
    private WorkOrderCompletionOperationList operationList;
    private CustomFieldList customFieldList;
    private String internalId;
    private String externalId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(WorkOrderCompletion.class, true);

    public WorkOrderCompletion() {
    }

    public WorkOrderCompletion(NullField nullFieldList, String internalId, String externalId, Calendar createdDate, Calendar lastModifiedDate, RecordRef customForm, String tranId, RecordRef item, Double quantity, Double scrapQuantity, RecordRef units, Boolean isBackflush, Double orderQuantity, Double total, RecordRef createdFrom, InventoryDetail inventoryDetail, Calendar tranDate, RecordRef postingPeriod, String memo, RecordRef subsidiary, RecordRef department, RecordRef _class, RecordRef location, RecordRef revision, RecordRef startOperation, RecordRef endOperation, Double completedQuantity, RecordRef manufacturingRouting, WorkOrderCompletionComponentList componentList, WorkOrderCompletionOperationList operationList, CustomFieldList customFieldList) {
        super(nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.createdDate = createdDate;
        this.lastModifiedDate = lastModifiedDate;
        this.customForm = customForm;
        this.tranId = tranId;
        this.item = item;
        this.quantity = quantity;
        this.scrapQuantity = scrapQuantity;
        this.units = units;
        this.isBackflush = isBackflush;
        this.orderQuantity = orderQuantity;
        this.total = total;
        this.createdFrom = createdFrom;
        this.inventoryDetail = inventoryDetail;
        this.tranDate = tranDate;
        this.postingPeriod = postingPeriod;
        this.memo = memo;
        this.subsidiary = subsidiary;
        this.department = department;
        this._class = _class;
        this.location = location;
        this.revision = revision;
        this.startOperation = startOperation;
        this.endOperation = endOperation;
        this.completedQuantity = completedQuantity;
        this.manufacturingRouting = manufacturingRouting;
        this.componentList = componentList;
        this.operationList = operationList;
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

    public RecordRef getCustomForm() {
        return this.customForm;
    }

    public void setCustomForm(RecordRef customForm) {
        this.customForm = customForm;
    }

    public String getTranId() {
        return this.tranId;
    }

    public void setTranId(String tranId) {
        this.tranId = tranId;
    }

    public RecordRef getItem() {
        return this.item;
    }

    public void setItem(RecordRef item) {
        this.item = item;
    }

    public Double getQuantity() {
        return this.quantity;
    }

    public void setQuantity(Double quantity) {
        this.quantity = quantity;
    }

    public Double getScrapQuantity() {
        return this.scrapQuantity;
    }

    public void setScrapQuantity(Double scrapQuantity) {
        this.scrapQuantity = scrapQuantity;
    }

    public RecordRef getUnits() {
        return this.units;
    }

    public void setUnits(RecordRef units) {
        this.units = units;
    }

    public Boolean getIsBackflush() {
        return this.isBackflush;
    }

    public void setIsBackflush(Boolean isBackflush) {
        this.isBackflush = isBackflush;
    }

    public Double getOrderQuantity() {
        return this.orderQuantity;
    }

    public void setOrderQuantity(Double orderQuantity) {
        this.orderQuantity = orderQuantity;
    }

    public Double getTotal() {
        return this.total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public RecordRef getCreatedFrom() {
        return this.createdFrom;
    }

    public void setCreatedFrom(RecordRef createdFrom) {
        this.createdFrom = createdFrom;
    }

    public InventoryDetail getInventoryDetail() {
        return this.inventoryDetail;
    }

    public void setInventoryDetail(InventoryDetail inventoryDetail) {
        this.inventoryDetail = inventoryDetail;
    }

    public Calendar getTranDate() {
        return this.tranDate;
    }

    public void setTranDate(Calendar tranDate) {
        this.tranDate = tranDate;
    }

    public RecordRef getPostingPeriod() {
        return this.postingPeriod;
    }

    public void setPostingPeriod(RecordRef postingPeriod) {
        this.postingPeriod = postingPeriod;
    }

    public String getMemo() {
        return this.memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public RecordRef getSubsidiary() {
        return this.subsidiary;
    }

    public void setSubsidiary(RecordRef subsidiary) {
        this.subsidiary = subsidiary;
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

    public RecordRef getRevision() {
        return this.revision;
    }

    public void setRevision(RecordRef revision) {
        this.revision = revision;
    }

    public RecordRef getStartOperation() {
        return this.startOperation;
    }

    public void setStartOperation(RecordRef startOperation) {
        this.startOperation = startOperation;
    }

    public RecordRef getEndOperation() {
        return this.endOperation;
    }

    public void setEndOperation(RecordRef endOperation) {
        this.endOperation = endOperation;
    }

    public Double getCompletedQuantity() {
        return this.completedQuantity;
    }

    public void setCompletedQuantity(Double completedQuantity) {
        this.completedQuantity = completedQuantity;
    }

    public RecordRef getManufacturingRouting() {
        return this.manufacturingRouting;
    }

    public void setManufacturingRouting(RecordRef manufacturingRouting) {
        this.manufacturingRouting = manufacturingRouting;
    }

    public WorkOrderCompletionComponentList getComponentList() {
        return this.componentList;
    }

    public void setComponentList(WorkOrderCompletionComponentList componentList) {
        this.componentList = componentList;
    }

    public WorkOrderCompletionOperationList getOperationList() {
        return this.operationList;
    }

    public void setOperationList(WorkOrderCompletionOperationList operationList) {
        this.operationList = operationList;
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
        if (!(obj instanceof WorkOrderCompletion)) {
            return false;
        }
        WorkOrderCompletion other = (WorkOrderCompletion)obj;
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
        boolean _equals = super.equals(obj) && (this.createdDate == null && other.getCreatedDate() == null || this.createdDate != null && this.createdDate.equals(other.getCreatedDate())) && (this.lastModifiedDate == null && other.getLastModifiedDate() == null || this.lastModifiedDate != null && this.lastModifiedDate.equals(other.getLastModifiedDate())) && (this.customForm == null && other.getCustomForm() == null || this.customForm != null && this.customForm.equals(other.getCustomForm())) && (this.tranId == null && other.getTranId() == null || this.tranId != null && this.tranId.equals(other.getTranId())) && (this.item == null && other.getItem() == null || this.item != null && this.item.equals(other.getItem())) && (this.quantity == null && other.getQuantity() == null || this.quantity != null && this.quantity.equals(other.getQuantity())) && (this.scrapQuantity == null && other.getScrapQuantity() == null || this.scrapQuantity != null && this.scrapQuantity.equals(other.getScrapQuantity())) && (this.units == null && other.getUnits() == null || this.units != null && this.units.equals(other.getUnits())) && (this.isBackflush == null && other.getIsBackflush() == null || this.isBackflush != null && this.isBackflush.equals(other.getIsBackflush())) && (this.orderQuantity == null && other.getOrderQuantity() == null || this.orderQuantity != null && this.orderQuantity.equals(other.getOrderQuantity())) && (this.total == null && other.getTotal() == null || this.total != null && this.total.equals(other.getTotal())) && (this.createdFrom == null && other.getCreatedFrom() == null || this.createdFrom != null && this.createdFrom.equals(other.getCreatedFrom())) && (this.inventoryDetail == null && other.getInventoryDetail() == null || this.inventoryDetail != null && this.inventoryDetail.equals(other.getInventoryDetail())) && (this.tranDate == null && other.getTranDate() == null || this.tranDate != null && this.tranDate.equals(other.getTranDate())) && (this.postingPeriod == null && other.getPostingPeriod() == null || this.postingPeriod != null && this.postingPeriod.equals(other.getPostingPeriod())) && (this.memo == null && other.getMemo() == null || this.memo != null && this.memo.equals(other.getMemo())) && (this.subsidiary == null && other.getSubsidiary() == null || this.subsidiary != null && this.subsidiary.equals(other.getSubsidiary())) && (this.department == null && other.getDepartment() == null || this.department != null && this.department.equals(other.getDepartment())) && (this._class == null && other.get_class() == null || this._class != null && this._class.equals(other.get_class())) && (this.location == null && other.getLocation() == null || this.location != null && this.location.equals(other.getLocation())) && (this.revision == null && other.getRevision() == null || this.revision != null && this.revision.equals(other.getRevision())) && (this.startOperation == null && other.getStartOperation() == null || this.startOperation != null && this.startOperation.equals(other.getStartOperation())) && (this.endOperation == null && other.getEndOperation() == null || this.endOperation != null && this.endOperation.equals(other.getEndOperation())) && (this.completedQuantity == null && other.getCompletedQuantity() == null || this.completedQuantity != null && this.completedQuantity.equals(other.getCompletedQuantity())) && (this.manufacturingRouting == null && other.getManufacturingRouting() == null || this.manufacturingRouting != null && this.manufacturingRouting.equals(other.getManufacturingRouting())) && (this.componentList == null && other.getComponentList() == null || this.componentList != null && this.componentList.equals(other.getComponentList())) && (this.operationList == null && other.getOperationList() == null || this.operationList != null && this.operationList.equals(other.getOperationList())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
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
        if (this.getCustomForm() != null) {
            _hashCode += this.getCustomForm().hashCode();
        }
        if (this.getTranId() != null) {
            _hashCode += this.getTranId().hashCode();
        }
        if (this.getItem() != null) {
            _hashCode += this.getItem().hashCode();
        }
        if (this.getQuantity() != null) {
            _hashCode += this.getQuantity().hashCode();
        }
        if (this.getScrapQuantity() != null) {
            _hashCode += this.getScrapQuantity().hashCode();
        }
        if (this.getUnits() != null) {
            _hashCode += this.getUnits().hashCode();
        }
        if (this.getIsBackflush() != null) {
            _hashCode += this.getIsBackflush().hashCode();
        }
        if (this.getOrderQuantity() != null) {
            _hashCode += this.getOrderQuantity().hashCode();
        }
        if (this.getTotal() != null) {
            _hashCode += this.getTotal().hashCode();
        }
        if (this.getCreatedFrom() != null) {
            _hashCode += this.getCreatedFrom().hashCode();
        }
        if (this.getInventoryDetail() != null) {
            _hashCode += this.getInventoryDetail().hashCode();
        }
        if (this.getTranDate() != null) {
            _hashCode += this.getTranDate().hashCode();
        }
        if (this.getPostingPeriod() != null) {
            _hashCode += this.getPostingPeriod().hashCode();
        }
        if (this.getMemo() != null) {
            _hashCode += this.getMemo().hashCode();
        }
        if (this.getSubsidiary() != null) {
            _hashCode += this.getSubsidiary().hashCode();
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
        if (this.getRevision() != null) {
            _hashCode += this.getRevision().hashCode();
        }
        if (this.getStartOperation() != null) {
            _hashCode += this.getStartOperation().hashCode();
        }
        if (this.getEndOperation() != null) {
            _hashCode += this.getEndOperation().hashCode();
        }
        if (this.getCompletedQuantity() != null) {
            _hashCode += this.getCompletedQuantity().hashCode();
        }
        if (this.getManufacturingRouting() != null) {
            _hashCode += this.getManufacturingRouting().hashCode();
        }
        if (this.getComponentList() != null) {
            _hashCode += this.getComponentList().hashCode();
        }
        if (this.getOperationList() != null) {
            _hashCode += this.getOperationList().hashCode();
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
        typeDesc.setXmlType(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "WorkOrderCompletion"));
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
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "createdDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lastModifiedDate");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "lastModifiedDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customForm");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("tranId");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "tranId"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("item");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "item"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantity");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "quantity"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("scrapQuantity");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "scrapQuantity"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("units");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "units"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("isBackflush");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "isBackflush"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("orderQuantity");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "orderQuantity"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("total");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "total"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("createdFrom");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "createdFrom"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("inventoryDetail");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "inventoryDetail"));
        elemField.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "InventoryDetail"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("tranDate");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "tranDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("postingPeriod");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "postingPeriod"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("memo");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "memo"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("subsidiary");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "subsidiary"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("department");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "department"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("_class");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "class"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("location");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "location"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("revision");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "revision"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("startOperation");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "startOperation"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("endOperation");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "endOperation"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("completedQuantity");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "completedQuantity"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("manufacturingRouting");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "manufacturingRouting"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("componentList");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "componentList"));
        elemField.setXmlType(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "WorkOrderCompletionComponentList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("operationList");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "operationList"));
        elemField.setXmlType(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "WorkOrderCompletionOperationList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "CustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

