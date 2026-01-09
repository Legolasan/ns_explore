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
package com.netsuite.suitetalk.proxy.v2022_1.platform.common;

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchCustomFieldList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchDateField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchDoubleField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchEnumMultiSelectField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchLongField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchMultiSelectField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchRecordBasic;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchStringField;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class ManufacturingOperationTaskSearchBasic
extends SearchRecordBasic
implements Serializable {
    private SearchDoubleField actualRunTime;
    private SearchDoubleField actualSetupTime;
    private SearchDoubleField completedQuantity;
    private SearchDateField endDate;
    private SearchDoubleField estimatedWork;
    private SearchMultiSelectField externalId;
    private SearchStringField externalIdString;
    private SearchLongField id;
    private SearchDoubleField inputQuantity;
    private SearchMultiSelectField internalId;
    private SearchLongField internalIdNumber;
    private SearchDoubleField laborResources;
    private SearchDoubleField lagAmount;
    private SearchEnumMultiSelectField lagType;
    private SearchStringField lagUnits;
    private SearchDoubleField machineResources;
    private SearchMultiSelectField manufacturingCostTemplate;
    private SearchMultiSelectField manufacturingWorkCenter;
    private SearchStringField name;
    private SearchDoubleField order;
    private SearchMultiSelectField predecessor;
    private SearchDoubleField remainingQuantity;
    private SearchDoubleField runRate;
    private SearchDoubleField runTime;
    private SearchLongField sequence;
    private SearchDoubleField setupTime;
    private SearchDateField startDate;
    private SearchMultiSelectField status;
    private SearchMultiSelectField workOrder;
    private SearchCustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(ManufacturingOperationTaskSearchBasic.class, true);

    public ManufacturingOperationTaskSearchBasic() {
    }

    public ManufacturingOperationTaskSearchBasic(SearchDoubleField actualRunTime, SearchDoubleField actualSetupTime, SearchDoubleField completedQuantity, SearchDateField endDate, SearchDoubleField estimatedWork, SearchMultiSelectField externalId, SearchStringField externalIdString, SearchLongField id, SearchDoubleField inputQuantity, SearchMultiSelectField internalId, SearchLongField internalIdNumber, SearchDoubleField laborResources, SearchDoubleField lagAmount, SearchEnumMultiSelectField lagType, SearchStringField lagUnits, SearchDoubleField machineResources, SearchMultiSelectField manufacturingCostTemplate, SearchMultiSelectField manufacturingWorkCenter, SearchStringField name, SearchDoubleField order, SearchMultiSelectField predecessor, SearchDoubleField remainingQuantity, SearchDoubleField runRate, SearchDoubleField runTime, SearchLongField sequence, SearchDoubleField setupTime, SearchDateField startDate, SearchMultiSelectField status, SearchMultiSelectField workOrder, SearchCustomFieldList customFieldList) {
        this.actualRunTime = actualRunTime;
        this.actualSetupTime = actualSetupTime;
        this.completedQuantity = completedQuantity;
        this.endDate = endDate;
        this.estimatedWork = estimatedWork;
        this.externalId = externalId;
        this.externalIdString = externalIdString;
        this.id = id;
        this.inputQuantity = inputQuantity;
        this.internalId = internalId;
        this.internalIdNumber = internalIdNumber;
        this.laborResources = laborResources;
        this.lagAmount = lagAmount;
        this.lagType = lagType;
        this.lagUnits = lagUnits;
        this.machineResources = machineResources;
        this.manufacturingCostTemplate = manufacturingCostTemplate;
        this.manufacturingWorkCenter = manufacturingWorkCenter;
        this.name = name;
        this.order = order;
        this.predecessor = predecessor;
        this.remainingQuantity = remainingQuantity;
        this.runRate = runRate;
        this.runTime = runTime;
        this.sequence = sequence;
        this.setupTime = setupTime;
        this.startDate = startDate;
        this.status = status;
        this.workOrder = workOrder;
        this.customFieldList = customFieldList;
    }

    public SearchDoubleField getActualRunTime() {
        return this.actualRunTime;
    }

    public void setActualRunTime(SearchDoubleField actualRunTime) {
        this.actualRunTime = actualRunTime;
    }

    public SearchDoubleField getActualSetupTime() {
        return this.actualSetupTime;
    }

    public void setActualSetupTime(SearchDoubleField actualSetupTime) {
        this.actualSetupTime = actualSetupTime;
    }

    public SearchDoubleField getCompletedQuantity() {
        return this.completedQuantity;
    }

    public void setCompletedQuantity(SearchDoubleField completedQuantity) {
        this.completedQuantity = completedQuantity;
    }

    public SearchDateField getEndDate() {
        return this.endDate;
    }

    public void setEndDate(SearchDateField endDate) {
        this.endDate = endDate;
    }

    public SearchDoubleField getEstimatedWork() {
        return this.estimatedWork;
    }

    public void setEstimatedWork(SearchDoubleField estimatedWork) {
        this.estimatedWork = estimatedWork;
    }

    public SearchMultiSelectField getExternalId() {
        return this.externalId;
    }

    public void setExternalId(SearchMultiSelectField externalId) {
        this.externalId = externalId;
    }

    public SearchStringField getExternalIdString() {
        return this.externalIdString;
    }

    public void setExternalIdString(SearchStringField externalIdString) {
        this.externalIdString = externalIdString;
    }

    public SearchLongField getId() {
        return this.id;
    }

    public void setId(SearchLongField id) {
        this.id = id;
    }

    public SearchDoubleField getInputQuantity() {
        return this.inputQuantity;
    }

    public void setInputQuantity(SearchDoubleField inputQuantity) {
        this.inputQuantity = inputQuantity;
    }

    public SearchMultiSelectField getInternalId() {
        return this.internalId;
    }

    public void setInternalId(SearchMultiSelectField internalId) {
        this.internalId = internalId;
    }

    public SearchLongField getInternalIdNumber() {
        return this.internalIdNumber;
    }

    public void setInternalIdNumber(SearchLongField internalIdNumber) {
        this.internalIdNumber = internalIdNumber;
    }

    public SearchDoubleField getLaborResources() {
        return this.laborResources;
    }

    public void setLaborResources(SearchDoubleField laborResources) {
        this.laborResources = laborResources;
    }

    public SearchDoubleField getLagAmount() {
        return this.lagAmount;
    }

    public void setLagAmount(SearchDoubleField lagAmount) {
        this.lagAmount = lagAmount;
    }

    public SearchEnumMultiSelectField getLagType() {
        return this.lagType;
    }

    public void setLagType(SearchEnumMultiSelectField lagType) {
        this.lagType = lagType;
    }

    public SearchStringField getLagUnits() {
        return this.lagUnits;
    }

    public void setLagUnits(SearchStringField lagUnits) {
        this.lagUnits = lagUnits;
    }

    public SearchDoubleField getMachineResources() {
        return this.machineResources;
    }

    public void setMachineResources(SearchDoubleField machineResources) {
        this.machineResources = machineResources;
    }

    public SearchMultiSelectField getManufacturingCostTemplate() {
        return this.manufacturingCostTemplate;
    }

    public void setManufacturingCostTemplate(SearchMultiSelectField manufacturingCostTemplate) {
        this.manufacturingCostTemplate = manufacturingCostTemplate;
    }

    public SearchMultiSelectField getManufacturingWorkCenter() {
        return this.manufacturingWorkCenter;
    }

    public void setManufacturingWorkCenter(SearchMultiSelectField manufacturingWorkCenter) {
        this.manufacturingWorkCenter = manufacturingWorkCenter;
    }

    public SearchStringField getName() {
        return this.name;
    }

    public void setName(SearchStringField name) {
        this.name = name;
    }

    public SearchDoubleField getOrder() {
        return this.order;
    }

    public void setOrder(SearchDoubleField order) {
        this.order = order;
    }

    public SearchMultiSelectField getPredecessor() {
        return this.predecessor;
    }

    public void setPredecessor(SearchMultiSelectField predecessor) {
        this.predecessor = predecessor;
    }

    public SearchDoubleField getRemainingQuantity() {
        return this.remainingQuantity;
    }

    public void setRemainingQuantity(SearchDoubleField remainingQuantity) {
        this.remainingQuantity = remainingQuantity;
    }

    public SearchDoubleField getRunRate() {
        return this.runRate;
    }

    public void setRunRate(SearchDoubleField runRate) {
        this.runRate = runRate;
    }

    public SearchDoubleField getRunTime() {
        return this.runTime;
    }

    public void setRunTime(SearchDoubleField runTime) {
        this.runTime = runTime;
    }

    public SearchLongField getSequence() {
        return this.sequence;
    }

    public void setSequence(SearchLongField sequence) {
        this.sequence = sequence;
    }

    public SearchDoubleField getSetupTime() {
        return this.setupTime;
    }

    public void setSetupTime(SearchDoubleField setupTime) {
        this.setupTime = setupTime;
    }

    public SearchDateField getStartDate() {
        return this.startDate;
    }

    public void setStartDate(SearchDateField startDate) {
        this.startDate = startDate;
    }

    public SearchMultiSelectField getStatus() {
        return this.status;
    }

    public void setStatus(SearchMultiSelectField status) {
        this.status = status;
    }

    public SearchMultiSelectField getWorkOrder() {
        return this.workOrder;
    }

    public void setWorkOrder(SearchMultiSelectField workOrder) {
        this.workOrder = workOrder;
    }

    public SearchCustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(SearchCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ManufacturingOperationTaskSearchBasic)) {
            return false;
        }
        ManufacturingOperationTaskSearchBasic other = (ManufacturingOperationTaskSearchBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.actualRunTime == null && other.getActualRunTime() == null || this.actualRunTime != null && this.actualRunTime.equals(other.getActualRunTime())) && (this.actualSetupTime == null && other.getActualSetupTime() == null || this.actualSetupTime != null && this.actualSetupTime.equals(other.getActualSetupTime())) && (this.completedQuantity == null && other.getCompletedQuantity() == null || this.completedQuantity != null && this.completedQuantity.equals(other.getCompletedQuantity())) && (this.endDate == null && other.getEndDate() == null || this.endDate != null && this.endDate.equals(other.getEndDate())) && (this.estimatedWork == null && other.getEstimatedWork() == null || this.estimatedWork != null && this.estimatedWork.equals(other.getEstimatedWork())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && this.externalId.equals(other.getExternalId())) && (this.externalIdString == null && other.getExternalIdString() == null || this.externalIdString != null && this.externalIdString.equals(other.getExternalIdString())) && (this.id == null && other.getId() == null || this.id != null && this.id.equals(other.getId())) && (this.inputQuantity == null && other.getInputQuantity() == null || this.inputQuantity != null && this.inputQuantity.equals(other.getInputQuantity())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && this.internalId.equals(other.getInternalId())) && (this.internalIdNumber == null && other.getInternalIdNumber() == null || this.internalIdNumber != null && this.internalIdNumber.equals(other.getInternalIdNumber())) && (this.laborResources == null && other.getLaborResources() == null || this.laborResources != null && this.laborResources.equals(other.getLaborResources())) && (this.lagAmount == null && other.getLagAmount() == null || this.lagAmount != null && this.lagAmount.equals(other.getLagAmount())) && (this.lagType == null && other.getLagType() == null || this.lagType != null && this.lagType.equals(other.getLagType())) && (this.lagUnits == null && other.getLagUnits() == null || this.lagUnits != null && this.lagUnits.equals(other.getLagUnits())) && (this.machineResources == null && other.getMachineResources() == null || this.machineResources != null && this.machineResources.equals(other.getMachineResources())) && (this.manufacturingCostTemplate == null && other.getManufacturingCostTemplate() == null || this.manufacturingCostTemplate != null && this.manufacturingCostTemplate.equals(other.getManufacturingCostTemplate())) && (this.manufacturingWorkCenter == null && other.getManufacturingWorkCenter() == null || this.manufacturingWorkCenter != null && this.manufacturingWorkCenter.equals(other.getManufacturingWorkCenter())) && (this.name == null && other.getName() == null || this.name != null && this.name.equals(other.getName())) && (this.order == null && other.getOrder() == null || this.order != null && this.order.equals(other.getOrder())) && (this.predecessor == null && other.getPredecessor() == null || this.predecessor != null && this.predecessor.equals(other.getPredecessor())) && (this.remainingQuantity == null && other.getRemainingQuantity() == null || this.remainingQuantity != null && this.remainingQuantity.equals(other.getRemainingQuantity())) && (this.runRate == null && other.getRunRate() == null || this.runRate != null && this.runRate.equals(other.getRunRate())) && (this.runTime == null && other.getRunTime() == null || this.runTime != null && this.runTime.equals(other.getRunTime())) && (this.sequence == null && other.getSequence() == null || this.sequence != null && this.sequence.equals(other.getSequence())) && (this.setupTime == null && other.getSetupTime() == null || this.setupTime != null && this.setupTime.equals(other.getSetupTime())) && (this.startDate == null && other.getStartDate() == null || this.startDate != null && this.startDate.equals(other.getStartDate())) && (this.status == null && other.getStatus() == null || this.status != null && this.status.equals(other.getStatus())) && (this.workOrder == null && other.getWorkOrder() == null || this.workOrder != null && this.workOrder.equals(other.getWorkOrder())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
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
        if (this.getActualRunTime() != null) {
            _hashCode += this.getActualRunTime().hashCode();
        }
        if (this.getActualSetupTime() != null) {
            _hashCode += this.getActualSetupTime().hashCode();
        }
        if (this.getCompletedQuantity() != null) {
            _hashCode += this.getCompletedQuantity().hashCode();
        }
        if (this.getEndDate() != null) {
            _hashCode += this.getEndDate().hashCode();
        }
        if (this.getEstimatedWork() != null) {
            _hashCode += this.getEstimatedWork().hashCode();
        }
        if (this.getExternalId() != null) {
            _hashCode += this.getExternalId().hashCode();
        }
        if (this.getExternalIdString() != null) {
            _hashCode += this.getExternalIdString().hashCode();
        }
        if (this.getId() != null) {
            _hashCode += this.getId().hashCode();
        }
        if (this.getInputQuantity() != null) {
            _hashCode += this.getInputQuantity().hashCode();
        }
        if (this.getInternalId() != null) {
            _hashCode += this.getInternalId().hashCode();
        }
        if (this.getInternalIdNumber() != null) {
            _hashCode += this.getInternalIdNumber().hashCode();
        }
        if (this.getLaborResources() != null) {
            _hashCode += this.getLaborResources().hashCode();
        }
        if (this.getLagAmount() != null) {
            _hashCode += this.getLagAmount().hashCode();
        }
        if (this.getLagType() != null) {
            _hashCode += this.getLagType().hashCode();
        }
        if (this.getLagUnits() != null) {
            _hashCode += this.getLagUnits().hashCode();
        }
        if (this.getMachineResources() != null) {
            _hashCode += this.getMachineResources().hashCode();
        }
        if (this.getManufacturingCostTemplate() != null) {
            _hashCode += this.getManufacturingCostTemplate().hashCode();
        }
        if (this.getManufacturingWorkCenter() != null) {
            _hashCode += this.getManufacturingWorkCenter().hashCode();
        }
        if (this.getName() != null) {
            _hashCode += this.getName().hashCode();
        }
        if (this.getOrder() != null) {
            _hashCode += this.getOrder().hashCode();
        }
        if (this.getPredecessor() != null) {
            _hashCode += this.getPredecessor().hashCode();
        }
        if (this.getRemainingQuantity() != null) {
            _hashCode += this.getRemainingQuantity().hashCode();
        }
        if (this.getRunRate() != null) {
            _hashCode += this.getRunRate().hashCode();
        }
        if (this.getRunTime() != null) {
            _hashCode += this.getRunTime().hashCode();
        }
        if (this.getSequence() != null) {
            _hashCode += this.getSequence().hashCode();
        }
        if (this.getSetupTime() != null) {
            _hashCode += this.getSetupTime().hashCode();
        }
        if (this.getStartDate() != null) {
            _hashCode += this.getStartDate().hashCode();
        }
        if (this.getStatus() != null) {
            _hashCode += this.getStatus().hashCode();
        }
        if (this.getWorkOrder() != null) {
            _hashCode += this.getWorkOrder().hashCode();
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ManufacturingOperationTaskSearchBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("actualRunTime");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "actualRunTime"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("actualSetupTime");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "actualSetupTime"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("completedQuantity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "completedQuantity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "endDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("estimatedWork");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "estimatedWork"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "externalId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("externalIdString");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "externalIdString"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "id"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("inputQuantity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "inputQuantity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("internalIdNumber");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "internalIdNumber"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("laborResources");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "laborResources"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lagAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lagAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lagType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lagType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchEnumMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lagUnits");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lagUnits"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("machineResources");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "machineResources"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("manufacturingCostTemplate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "manufacturingCostTemplate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("manufacturingWorkCenter");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "manufacturingWorkCenter"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "name"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("order");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "order"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("predecessor");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "predecessor"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("remainingQuantity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "remainingQuantity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("runRate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "runRate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("runTime");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "runTime"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("sequence");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "sequence"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("setupTime");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "setupTime"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "status"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("workOrder");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "workOrder"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchMultiSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchCustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

