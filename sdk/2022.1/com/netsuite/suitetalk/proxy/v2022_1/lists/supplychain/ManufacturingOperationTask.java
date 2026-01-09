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
package com.netsuite.suitetalk.proxy.v2022_1.lists.supplychain;

import com.netsuite.suitetalk.proxy.v2022_1.lists.supplychain.ManufacturingCostDetailList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.supplychain.ManufacturingOperationTaskPredecessorList;
import com.netsuite.suitetalk.proxy.v2022_1.lists.supplychain.types.ManufacturingOperationTaskStatus;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.CustomFieldList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.NullField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.Record;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
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

public class ManufacturingOperationTask
extends Record
implements Serializable {
    private RecordRef customForm;
    private RecordRef manufacturingWorkCenter;
    private RecordRef manufacturingCostTemplate;
    private String title;
    private Long operationSequence;
    private RecordRef workOrder;
    private RecordRef order;
    private ManufacturingOperationTaskStatus status;
    private String message;
    private Double estimatedWork;
    private Double actualWork;
    private Double remainingWork;
    private Double inputQuantity;
    private Double completedQuantity;
    private Double setupTime;
    private Double runRate;
    private Calendar startDate;
    private Calendar endDate;
    private Boolean autoCalculateLag;
    private Double machineResources;
    private Double laborResources;
    private ManufacturingCostDetailList costDetailList;
    private ManufacturingOperationTaskPredecessorList predecessorList;
    private CustomFieldList customFieldList;
    private String internalId;
    private String externalId;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(ManufacturingOperationTask.class, true);

    public ManufacturingOperationTask() {
    }

    public ManufacturingOperationTask(NullField nullFieldList, String internalId, String externalId, RecordRef customForm, RecordRef manufacturingWorkCenter, RecordRef manufacturingCostTemplate, String title, Long operationSequence, RecordRef workOrder, RecordRef order, ManufacturingOperationTaskStatus status, String message, Double estimatedWork, Double actualWork, Double remainingWork, Double inputQuantity, Double completedQuantity, Double setupTime, Double runRate, Calendar startDate, Calendar endDate, Boolean autoCalculateLag, Double machineResources, Double laborResources, ManufacturingCostDetailList costDetailList, ManufacturingOperationTaskPredecessorList predecessorList, CustomFieldList customFieldList) {
        super(nullFieldList);
        this.internalId = internalId;
        this.externalId = externalId;
        this.customForm = customForm;
        this.manufacturingWorkCenter = manufacturingWorkCenter;
        this.manufacturingCostTemplate = manufacturingCostTemplate;
        this.title = title;
        this.operationSequence = operationSequence;
        this.workOrder = workOrder;
        this.order = order;
        this.status = status;
        this.message = message;
        this.estimatedWork = estimatedWork;
        this.actualWork = actualWork;
        this.remainingWork = remainingWork;
        this.inputQuantity = inputQuantity;
        this.completedQuantity = completedQuantity;
        this.setupTime = setupTime;
        this.runRate = runRate;
        this.startDate = startDate;
        this.endDate = endDate;
        this.autoCalculateLag = autoCalculateLag;
        this.machineResources = machineResources;
        this.laborResources = laborResources;
        this.costDetailList = costDetailList;
        this.predecessorList = predecessorList;
        this.customFieldList = customFieldList;
    }

    public RecordRef getCustomForm() {
        return this.customForm;
    }

    public void setCustomForm(RecordRef customForm) {
        this.customForm = customForm;
    }

    public RecordRef getManufacturingWorkCenter() {
        return this.manufacturingWorkCenter;
    }

    public void setManufacturingWorkCenter(RecordRef manufacturingWorkCenter) {
        this.manufacturingWorkCenter = manufacturingWorkCenter;
    }

    public RecordRef getManufacturingCostTemplate() {
        return this.manufacturingCostTemplate;
    }

    public void setManufacturingCostTemplate(RecordRef manufacturingCostTemplate) {
        this.manufacturingCostTemplate = manufacturingCostTemplate;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getOperationSequence() {
        return this.operationSequence;
    }

    public void setOperationSequence(Long operationSequence) {
        this.operationSequence = operationSequence;
    }

    public RecordRef getWorkOrder() {
        return this.workOrder;
    }

    public void setWorkOrder(RecordRef workOrder) {
        this.workOrder = workOrder;
    }

    public RecordRef getOrder() {
        return this.order;
    }

    public void setOrder(RecordRef order) {
        this.order = order;
    }

    public ManufacturingOperationTaskStatus getStatus() {
        return this.status;
    }

    public void setStatus(ManufacturingOperationTaskStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Double getEstimatedWork() {
        return this.estimatedWork;
    }

    public void setEstimatedWork(Double estimatedWork) {
        this.estimatedWork = estimatedWork;
    }

    public Double getActualWork() {
        return this.actualWork;
    }

    public void setActualWork(Double actualWork) {
        this.actualWork = actualWork;
    }

    public Double getRemainingWork() {
        return this.remainingWork;
    }

    public void setRemainingWork(Double remainingWork) {
        this.remainingWork = remainingWork;
    }

    public Double getInputQuantity() {
        return this.inputQuantity;
    }

    public void setInputQuantity(Double inputQuantity) {
        this.inputQuantity = inputQuantity;
    }

    public Double getCompletedQuantity() {
        return this.completedQuantity;
    }

    public void setCompletedQuantity(Double completedQuantity) {
        this.completedQuantity = completedQuantity;
    }

    public Double getSetupTime() {
        return this.setupTime;
    }

    public void setSetupTime(Double setupTime) {
        this.setupTime = setupTime;
    }

    public Double getRunRate() {
        return this.runRate;
    }

    public void setRunRate(Double runRate) {
        this.runRate = runRate;
    }

    public Calendar getStartDate() {
        return this.startDate;
    }

    public void setStartDate(Calendar startDate) {
        this.startDate = startDate;
    }

    public Calendar getEndDate() {
        return this.endDate;
    }

    public void setEndDate(Calendar endDate) {
        this.endDate = endDate;
    }

    public Boolean getAutoCalculateLag() {
        return this.autoCalculateLag;
    }

    public void setAutoCalculateLag(Boolean autoCalculateLag) {
        this.autoCalculateLag = autoCalculateLag;
    }

    public Double getMachineResources() {
        return this.machineResources;
    }

    public void setMachineResources(Double machineResources) {
        this.machineResources = machineResources;
    }

    public Double getLaborResources() {
        return this.laborResources;
    }

    public void setLaborResources(Double laborResources) {
        this.laborResources = laborResources;
    }

    public ManufacturingCostDetailList getCostDetailList() {
        return this.costDetailList;
    }

    public void setCostDetailList(ManufacturingCostDetailList costDetailList) {
        this.costDetailList = costDetailList;
    }

    public ManufacturingOperationTaskPredecessorList getPredecessorList() {
        return this.predecessorList;
    }

    public void setPredecessorList(ManufacturingOperationTaskPredecessorList predecessorList) {
        this.predecessorList = predecessorList;
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
        if (!(obj instanceof ManufacturingOperationTask)) {
            return false;
        }
        ManufacturingOperationTask other = (ManufacturingOperationTask)obj;
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
        boolean _equals = super.equals(obj) && (this.customForm == null && other.getCustomForm() == null || this.customForm != null && this.customForm.equals(other.getCustomForm())) && (this.manufacturingWorkCenter == null && other.getManufacturingWorkCenter() == null || this.manufacturingWorkCenter != null && this.manufacturingWorkCenter.equals(other.getManufacturingWorkCenter())) && (this.manufacturingCostTemplate == null && other.getManufacturingCostTemplate() == null || this.manufacturingCostTemplate != null && this.manufacturingCostTemplate.equals(other.getManufacturingCostTemplate())) && (this.title == null && other.getTitle() == null || this.title != null && this.title.equals(other.getTitle())) && (this.operationSequence == null && other.getOperationSequence() == null || this.operationSequence != null && this.operationSequence.equals(other.getOperationSequence())) && (this.workOrder == null && other.getWorkOrder() == null || this.workOrder != null && this.workOrder.equals(other.getWorkOrder())) && (this.order == null && other.getOrder() == null || this.order != null && this.order.equals(other.getOrder())) && (this.status == null && other.getStatus() == null || this.status != null && this.status.equals(other.getStatus())) && (this.message == null && other.getMessage() == null || this.message != null && this.message.equals(other.getMessage())) && (this.estimatedWork == null && other.getEstimatedWork() == null || this.estimatedWork != null && this.estimatedWork.equals(other.getEstimatedWork())) && (this.actualWork == null && other.getActualWork() == null || this.actualWork != null && this.actualWork.equals(other.getActualWork())) && (this.remainingWork == null && other.getRemainingWork() == null || this.remainingWork != null && this.remainingWork.equals(other.getRemainingWork())) && (this.inputQuantity == null && other.getInputQuantity() == null || this.inputQuantity != null && this.inputQuantity.equals(other.getInputQuantity())) && (this.completedQuantity == null && other.getCompletedQuantity() == null || this.completedQuantity != null && this.completedQuantity.equals(other.getCompletedQuantity())) && (this.setupTime == null && other.getSetupTime() == null || this.setupTime != null && this.setupTime.equals(other.getSetupTime())) && (this.runRate == null && other.getRunRate() == null || this.runRate != null && this.runRate.equals(other.getRunRate())) && (this.startDate == null && other.getStartDate() == null || this.startDate != null && this.startDate.equals(other.getStartDate())) && (this.endDate == null && other.getEndDate() == null || this.endDate != null && this.endDate.equals(other.getEndDate())) && (this.autoCalculateLag == null && other.getAutoCalculateLag() == null || this.autoCalculateLag != null && this.autoCalculateLag.equals(other.getAutoCalculateLag())) && (this.machineResources == null && other.getMachineResources() == null || this.machineResources != null && this.machineResources.equals(other.getMachineResources())) && (this.laborResources == null && other.getLaborResources() == null || this.laborResources != null && this.laborResources.equals(other.getLaborResources())) && (this.costDetailList == null && other.getCostDetailList() == null || this.costDetailList != null && this.costDetailList.equals(other.getCostDetailList())) && (this.predecessorList == null && other.getPredecessorList() == null || this.predecessorList != null && this.predecessorList.equals(other.getPredecessorList())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId()));
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
        if (this.getCustomForm() != null) {
            _hashCode += this.getCustomForm().hashCode();
        }
        if (this.getManufacturingWorkCenter() != null) {
            _hashCode += this.getManufacturingWorkCenter().hashCode();
        }
        if (this.getManufacturingCostTemplate() != null) {
            _hashCode += this.getManufacturingCostTemplate().hashCode();
        }
        if (this.getTitle() != null) {
            _hashCode += this.getTitle().hashCode();
        }
        if (this.getOperationSequence() != null) {
            _hashCode += this.getOperationSequence().hashCode();
        }
        if (this.getWorkOrder() != null) {
            _hashCode += this.getWorkOrder().hashCode();
        }
        if (this.getOrder() != null) {
            _hashCode += this.getOrder().hashCode();
        }
        if (this.getStatus() != null) {
            _hashCode += this.getStatus().hashCode();
        }
        if (this.getMessage() != null) {
            _hashCode += this.getMessage().hashCode();
        }
        if (this.getEstimatedWork() != null) {
            _hashCode += this.getEstimatedWork().hashCode();
        }
        if (this.getActualWork() != null) {
            _hashCode += this.getActualWork().hashCode();
        }
        if (this.getRemainingWork() != null) {
            _hashCode += this.getRemainingWork().hashCode();
        }
        if (this.getInputQuantity() != null) {
            _hashCode += this.getInputQuantity().hashCode();
        }
        if (this.getCompletedQuantity() != null) {
            _hashCode += this.getCompletedQuantity().hashCode();
        }
        if (this.getSetupTime() != null) {
            _hashCode += this.getSetupTime().hashCode();
        }
        if (this.getRunRate() != null) {
            _hashCode += this.getRunRate().hashCode();
        }
        if (this.getStartDate() != null) {
            _hashCode += this.getStartDate().hashCode();
        }
        if (this.getEndDate() != null) {
            _hashCode += this.getEndDate().hashCode();
        }
        if (this.getAutoCalculateLag() != null) {
            _hashCode += this.getAutoCalculateLag().hashCode();
        }
        if (this.getMachineResources() != null) {
            _hashCode += this.getMachineResources().hashCode();
        }
        if (this.getLaborResources() != null) {
            _hashCode += this.getLaborResources().hashCode();
        }
        if (this.getCostDetailList() != null) {
            _hashCode += this.getCostDetailList().hashCode();
        }
        if (this.getPredecessorList() != null) {
            _hashCode += this.getPredecessorList().hashCode();
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
        typeDesc.setXmlType(new QName("urn:supplychain_2022_1.lists.webservices.netsuite.com", "ManufacturingOperationTask"));
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
        elemField.setFieldName("customForm");
        elemField.setXmlName(new QName("urn:supplychain_2022_1.lists.webservices.netsuite.com", "customForm"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("manufacturingWorkCenter");
        elemField.setXmlName(new QName("urn:supplychain_2022_1.lists.webservices.netsuite.com", "manufacturingWorkCenter"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("manufacturingCostTemplate");
        elemField.setXmlName(new QName("urn:supplychain_2022_1.lists.webservices.netsuite.com", "manufacturingCostTemplate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("title");
        elemField.setXmlName(new QName("urn:supplychain_2022_1.lists.webservices.netsuite.com", "title"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("operationSequence");
        elemField.setXmlName(new QName("urn:supplychain_2022_1.lists.webservices.netsuite.com", "operationSequence"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("workOrder");
        elemField.setXmlName(new QName("urn:supplychain_2022_1.lists.webservices.netsuite.com", "workOrder"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("order");
        elemField.setXmlName(new QName("urn:supplychain_2022_1.lists.webservices.netsuite.com", "order"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new QName("urn:supplychain_2022_1.lists.webservices.netsuite.com", "status"));
        elemField.setXmlType(new QName("urn:types.supplychain_2022_1.lists.webservices.netsuite.com", "ManufacturingOperationTaskStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new QName("urn:supplychain_2022_1.lists.webservices.netsuite.com", "message"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("estimatedWork");
        elemField.setXmlName(new QName("urn:supplychain_2022_1.lists.webservices.netsuite.com", "estimatedWork"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("actualWork");
        elemField.setXmlName(new QName("urn:supplychain_2022_1.lists.webservices.netsuite.com", "actualWork"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("remainingWork");
        elemField.setXmlName(new QName("urn:supplychain_2022_1.lists.webservices.netsuite.com", "remainingWork"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("inputQuantity");
        elemField.setXmlName(new QName("urn:supplychain_2022_1.lists.webservices.netsuite.com", "inputQuantity"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("completedQuantity");
        elemField.setXmlName(new QName("urn:supplychain_2022_1.lists.webservices.netsuite.com", "completedQuantity"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("setupTime");
        elemField.setXmlName(new QName("urn:supplychain_2022_1.lists.webservices.netsuite.com", "setupTime"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("runRate");
        elemField.setXmlName(new QName("urn:supplychain_2022_1.lists.webservices.netsuite.com", "runRate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new QName("urn:supplychain_2022_1.lists.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new QName("urn:supplychain_2022_1.lists.webservices.netsuite.com", "endDate"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("autoCalculateLag");
        elemField.setXmlName(new QName("urn:supplychain_2022_1.lists.webservices.netsuite.com", "autoCalculateLag"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("machineResources");
        elemField.setXmlName(new QName("urn:supplychain_2022_1.lists.webservices.netsuite.com", "machineResources"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("laborResources");
        elemField.setXmlName(new QName("urn:supplychain_2022_1.lists.webservices.netsuite.com", "laborResources"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("costDetailList");
        elemField.setXmlName(new QName("urn:supplychain_2022_1.lists.webservices.netsuite.com", "costDetailList"));
        elemField.setXmlType(new QName("urn:supplychain_2022_1.lists.webservices.netsuite.com", "ManufacturingCostDetailList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("predecessorList");
        elemField.setXmlName(new QName("urn:supplychain_2022_1.lists.webservices.netsuite.com", "predecessorList"));
        elemField.setXmlType(new QName("urn:supplychain_2022_1.lists.webservices.netsuite.com", "ManufacturingOperationTaskPredecessorList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new QName("urn:supplychain_2022_1.lists.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "CustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

