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

import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnCustomFieldList;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnDateField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnDoubleField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnEnumSelectField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnLongField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnSelectField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchColumnStringField;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.SearchRowBasic;
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

public class ManufacturingOperationTaskSearchRowBasic
extends SearchRowBasic
implements Serializable {
    private SearchColumnDoubleField[] actualRunTime;
    private SearchColumnDoubleField[] actualSetupTime;
    private SearchColumnDoubleField[] completedQuantity;
    private SearchColumnDateField[] endDate;
    private SearchColumnDoubleField[] estimatedWork;
    private SearchColumnSelectField[] externalId;
    private SearchColumnLongField[] id;
    private SearchColumnDoubleField[] inputQuantity;
    private SearchColumnSelectField[] internalId;
    private SearchColumnDoubleField[] laborResources;
    private SearchColumnDoubleField[] lagAmount;
    private SearchColumnEnumSelectField[] lagType;
    private SearchColumnStringField[] lagUnits;
    private SearchColumnDoubleField[] machineResources;
    private SearchColumnSelectField[] manufacturingCostTemplate;
    private SearchColumnSelectField[] manufacturingWorkCenter;
    private SearchColumnStringField[] message;
    private SearchColumnStringField[] name;
    private SearchColumnDoubleField[] order;
    private SearchColumnSelectField[] predecessor;
    private SearchColumnStringField[] predecessorType;
    private SearchColumnDoubleField[] remainingQuantity;
    private SearchColumnDoubleField[] runRate;
    private SearchColumnDoubleField[] runTime;
    private SearchColumnLongField[] sequence;
    private SearchColumnDoubleField[] setupTime;
    private SearchColumnDateField[] startDate;
    private SearchColumnSelectField[] status;
    private SearchColumnStringField[] workOrder;
    private SearchColumnCustomFieldList customFieldList;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(ManufacturingOperationTaskSearchRowBasic.class, true);

    public ManufacturingOperationTaskSearchRowBasic() {
    }

    public ManufacturingOperationTaskSearchRowBasic(SearchColumnDoubleField[] actualRunTime, SearchColumnDoubleField[] actualSetupTime, SearchColumnDoubleField[] completedQuantity, SearchColumnDateField[] endDate, SearchColumnDoubleField[] estimatedWork, SearchColumnSelectField[] externalId, SearchColumnLongField[] id, SearchColumnDoubleField[] inputQuantity, SearchColumnSelectField[] internalId, SearchColumnDoubleField[] laborResources, SearchColumnDoubleField[] lagAmount, SearchColumnEnumSelectField[] lagType, SearchColumnStringField[] lagUnits, SearchColumnDoubleField[] machineResources, SearchColumnSelectField[] manufacturingCostTemplate, SearchColumnSelectField[] manufacturingWorkCenter, SearchColumnStringField[] message, SearchColumnStringField[] name, SearchColumnDoubleField[] order, SearchColumnSelectField[] predecessor, SearchColumnStringField[] predecessorType, SearchColumnDoubleField[] remainingQuantity, SearchColumnDoubleField[] runRate, SearchColumnDoubleField[] runTime, SearchColumnLongField[] sequence, SearchColumnDoubleField[] setupTime, SearchColumnDateField[] startDate, SearchColumnSelectField[] status, SearchColumnStringField[] workOrder, SearchColumnCustomFieldList customFieldList) {
        this.actualRunTime = actualRunTime;
        this.actualSetupTime = actualSetupTime;
        this.completedQuantity = completedQuantity;
        this.endDate = endDate;
        this.estimatedWork = estimatedWork;
        this.externalId = externalId;
        this.id = id;
        this.inputQuantity = inputQuantity;
        this.internalId = internalId;
        this.laborResources = laborResources;
        this.lagAmount = lagAmount;
        this.lagType = lagType;
        this.lagUnits = lagUnits;
        this.machineResources = machineResources;
        this.manufacturingCostTemplate = manufacturingCostTemplate;
        this.manufacturingWorkCenter = manufacturingWorkCenter;
        this.message = message;
        this.name = name;
        this.order = order;
        this.predecessor = predecessor;
        this.predecessorType = predecessorType;
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

    public SearchColumnDoubleField[] getActualRunTime() {
        return this.actualRunTime;
    }

    public void setActualRunTime(SearchColumnDoubleField[] actualRunTime) {
        this.actualRunTime = actualRunTime;
    }

    public SearchColumnDoubleField getActualRunTime(int i) {
        return this.actualRunTime[i];
    }

    public void setActualRunTime(int i, SearchColumnDoubleField _value) {
        this.actualRunTime[i] = _value;
    }

    public SearchColumnDoubleField[] getActualSetupTime() {
        return this.actualSetupTime;
    }

    public void setActualSetupTime(SearchColumnDoubleField[] actualSetupTime) {
        this.actualSetupTime = actualSetupTime;
    }

    public SearchColumnDoubleField getActualSetupTime(int i) {
        return this.actualSetupTime[i];
    }

    public void setActualSetupTime(int i, SearchColumnDoubleField _value) {
        this.actualSetupTime[i] = _value;
    }

    public SearchColumnDoubleField[] getCompletedQuantity() {
        return this.completedQuantity;
    }

    public void setCompletedQuantity(SearchColumnDoubleField[] completedQuantity) {
        this.completedQuantity = completedQuantity;
    }

    public SearchColumnDoubleField getCompletedQuantity(int i) {
        return this.completedQuantity[i];
    }

    public void setCompletedQuantity(int i, SearchColumnDoubleField _value) {
        this.completedQuantity[i] = _value;
    }

    public SearchColumnDateField[] getEndDate() {
        return this.endDate;
    }

    public void setEndDate(SearchColumnDateField[] endDate) {
        this.endDate = endDate;
    }

    public SearchColumnDateField getEndDate(int i) {
        return this.endDate[i];
    }

    public void setEndDate(int i, SearchColumnDateField _value) {
        this.endDate[i] = _value;
    }

    public SearchColumnDoubleField[] getEstimatedWork() {
        return this.estimatedWork;
    }

    public void setEstimatedWork(SearchColumnDoubleField[] estimatedWork) {
        this.estimatedWork = estimatedWork;
    }

    public SearchColumnDoubleField getEstimatedWork(int i) {
        return this.estimatedWork[i];
    }

    public void setEstimatedWork(int i, SearchColumnDoubleField _value) {
        this.estimatedWork[i] = _value;
    }

    public SearchColumnSelectField[] getExternalId() {
        return this.externalId;
    }

    public void setExternalId(SearchColumnSelectField[] externalId) {
        this.externalId = externalId;
    }

    public SearchColumnSelectField getExternalId(int i) {
        return this.externalId[i];
    }

    public void setExternalId(int i, SearchColumnSelectField _value) {
        this.externalId[i] = _value;
    }

    public SearchColumnLongField[] getId() {
        return this.id;
    }

    public void setId(SearchColumnLongField[] id) {
        this.id = id;
    }

    public SearchColumnLongField getId(int i) {
        return this.id[i];
    }

    public void setId(int i, SearchColumnLongField _value) {
        this.id[i] = _value;
    }

    public SearchColumnDoubleField[] getInputQuantity() {
        return this.inputQuantity;
    }

    public void setInputQuantity(SearchColumnDoubleField[] inputQuantity) {
        this.inputQuantity = inputQuantity;
    }

    public SearchColumnDoubleField getInputQuantity(int i) {
        return this.inputQuantity[i];
    }

    public void setInputQuantity(int i, SearchColumnDoubleField _value) {
        this.inputQuantity[i] = _value;
    }

    public SearchColumnSelectField[] getInternalId() {
        return this.internalId;
    }

    public void setInternalId(SearchColumnSelectField[] internalId) {
        this.internalId = internalId;
    }

    public SearchColumnSelectField getInternalId(int i) {
        return this.internalId[i];
    }

    public void setInternalId(int i, SearchColumnSelectField _value) {
        this.internalId[i] = _value;
    }

    public SearchColumnDoubleField[] getLaborResources() {
        return this.laborResources;
    }

    public void setLaborResources(SearchColumnDoubleField[] laborResources) {
        this.laborResources = laborResources;
    }

    public SearchColumnDoubleField getLaborResources(int i) {
        return this.laborResources[i];
    }

    public void setLaborResources(int i, SearchColumnDoubleField _value) {
        this.laborResources[i] = _value;
    }

    public SearchColumnDoubleField[] getLagAmount() {
        return this.lagAmount;
    }

    public void setLagAmount(SearchColumnDoubleField[] lagAmount) {
        this.lagAmount = lagAmount;
    }

    public SearchColumnDoubleField getLagAmount(int i) {
        return this.lagAmount[i];
    }

    public void setLagAmount(int i, SearchColumnDoubleField _value) {
        this.lagAmount[i] = _value;
    }

    public SearchColumnEnumSelectField[] getLagType() {
        return this.lagType;
    }

    public void setLagType(SearchColumnEnumSelectField[] lagType) {
        this.lagType = lagType;
    }

    public SearchColumnEnumSelectField getLagType(int i) {
        return this.lagType[i];
    }

    public void setLagType(int i, SearchColumnEnumSelectField _value) {
        this.lagType[i] = _value;
    }

    public SearchColumnStringField[] getLagUnits() {
        return this.lagUnits;
    }

    public void setLagUnits(SearchColumnStringField[] lagUnits) {
        this.lagUnits = lagUnits;
    }

    public SearchColumnStringField getLagUnits(int i) {
        return this.lagUnits[i];
    }

    public void setLagUnits(int i, SearchColumnStringField _value) {
        this.lagUnits[i] = _value;
    }

    public SearchColumnDoubleField[] getMachineResources() {
        return this.machineResources;
    }

    public void setMachineResources(SearchColumnDoubleField[] machineResources) {
        this.machineResources = machineResources;
    }

    public SearchColumnDoubleField getMachineResources(int i) {
        return this.machineResources[i];
    }

    public void setMachineResources(int i, SearchColumnDoubleField _value) {
        this.machineResources[i] = _value;
    }

    public SearchColumnSelectField[] getManufacturingCostTemplate() {
        return this.manufacturingCostTemplate;
    }

    public void setManufacturingCostTemplate(SearchColumnSelectField[] manufacturingCostTemplate) {
        this.manufacturingCostTemplate = manufacturingCostTemplate;
    }

    public SearchColumnSelectField getManufacturingCostTemplate(int i) {
        return this.manufacturingCostTemplate[i];
    }

    public void setManufacturingCostTemplate(int i, SearchColumnSelectField _value) {
        this.manufacturingCostTemplate[i] = _value;
    }

    public SearchColumnSelectField[] getManufacturingWorkCenter() {
        return this.manufacturingWorkCenter;
    }

    public void setManufacturingWorkCenter(SearchColumnSelectField[] manufacturingWorkCenter) {
        this.manufacturingWorkCenter = manufacturingWorkCenter;
    }

    public SearchColumnSelectField getManufacturingWorkCenter(int i) {
        return this.manufacturingWorkCenter[i];
    }

    public void setManufacturingWorkCenter(int i, SearchColumnSelectField _value) {
        this.manufacturingWorkCenter[i] = _value;
    }

    public SearchColumnStringField[] getMessage() {
        return this.message;
    }

    public void setMessage(SearchColumnStringField[] message) {
        this.message = message;
    }

    public SearchColumnStringField getMessage(int i) {
        return this.message[i];
    }

    public void setMessage(int i, SearchColumnStringField _value) {
        this.message[i] = _value;
    }

    public SearchColumnStringField[] getName() {
        return this.name;
    }

    public void setName(SearchColumnStringField[] name) {
        this.name = name;
    }

    public SearchColumnStringField getName(int i) {
        return this.name[i];
    }

    public void setName(int i, SearchColumnStringField _value) {
        this.name[i] = _value;
    }

    public SearchColumnDoubleField[] getOrder() {
        return this.order;
    }

    public void setOrder(SearchColumnDoubleField[] order) {
        this.order = order;
    }

    public SearchColumnDoubleField getOrder(int i) {
        return this.order[i];
    }

    public void setOrder(int i, SearchColumnDoubleField _value) {
        this.order[i] = _value;
    }

    public SearchColumnSelectField[] getPredecessor() {
        return this.predecessor;
    }

    public void setPredecessor(SearchColumnSelectField[] predecessor) {
        this.predecessor = predecessor;
    }

    public SearchColumnSelectField getPredecessor(int i) {
        return this.predecessor[i];
    }

    public void setPredecessor(int i, SearchColumnSelectField _value) {
        this.predecessor[i] = _value;
    }

    public SearchColumnStringField[] getPredecessorType() {
        return this.predecessorType;
    }

    public void setPredecessorType(SearchColumnStringField[] predecessorType) {
        this.predecessorType = predecessorType;
    }

    public SearchColumnStringField getPredecessorType(int i) {
        return this.predecessorType[i];
    }

    public void setPredecessorType(int i, SearchColumnStringField _value) {
        this.predecessorType[i] = _value;
    }

    public SearchColumnDoubleField[] getRemainingQuantity() {
        return this.remainingQuantity;
    }

    public void setRemainingQuantity(SearchColumnDoubleField[] remainingQuantity) {
        this.remainingQuantity = remainingQuantity;
    }

    public SearchColumnDoubleField getRemainingQuantity(int i) {
        return this.remainingQuantity[i];
    }

    public void setRemainingQuantity(int i, SearchColumnDoubleField _value) {
        this.remainingQuantity[i] = _value;
    }

    public SearchColumnDoubleField[] getRunRate() {
        return this.runRate;
    }

    public void setRunRate(SearchColumnDoubleField[] runRate) {
        this.runRate = runRate;
    }

    public SearchColumnDoubleField getRunRate(int i) {
        return this.runRate[i];
    }

    public void setRunRate(int i, SearchColumnDoubleField _value) {
        this.runRate[i] = _value;
    }

    public SearchColumnDoubleField[] getRunTime() {
        return this.runTime;
    }

    public void setRunTime(SearchColumnDoubleField[] runTime) {
        this.runTime = runTime;
    }

    public SearchColumnDoubleField getRunTime(int i) {
        return this.runTime[i];
    }

    public void setRunTime(int i, SearchColumnDoubleField _value) {
        this.runTime[i] = _value;
    }

    public SearchColumnLongField[] getSequence() {
        return this.sequence;
    }

    public void setSequence(SearchColumnLongField[] sequence) {
        this.sequence = sequence;
    }

    public SearchColumnLongField getSequence(int i) {
        return this.sequence[i];
    }

    public void setSequence(int i, SearchColumnLongField _value) {
        this.sequence[i] = _value;
    }

    public SearchColumnDoubleField[] getSetupTime() {
        return this.setupTime;
    }

    public void setSetupTime(SearchColumnDoubleField[] setupTime) {
        this.setupTime = setupTime;
    }

    public SearchColumnDoubleField getSetupTime(int i) {
        return this.setupTime[i];
    }

    public void setSetupTime(int i, SearchColumnDoubleField _value) {
        this.setupTime[i] = _value;
    }

    public SearchColumnDateField[] getStartDate() {
        return this.startDate;
    }

    public void setStartDate(SearchColumnDateField[] startDate) {
        this.startDate = startDate;
    }

    public SearchColumnDateField getStartDate(int i) {
        return this.startDate[i];
    }

    public void setStartDate(int i, SearchColumnDateField _value) {
        this.startDate[i] = _value;
    }

    public SearchColumnSelectField[] getStatus() {
        return this.status;
    }

    public void setStatus(SearchColumnSelectField[] status) {
        this.status = status;
    }

    public SearchColumnSelectField getStatus(int i) {
        return this.status[i];
    }

    public void setStatus(int i, SearchColumnSelectField _value) {
        this.status[i] = _value;
    }

    public SearchColumnStringField[] getWorkOrder() {
        return this.workOrder;
    }

    public void setWorkOrder(SearchColumnStringField[] workOrder) {
        this.workOrder = workOrder;
    }

    public SearchColumnStringField getWorkOrder(int i) {
        return this.workOrder[i];
    }

    public void setWorkOrder(int i, SearchColumnStringField _value) {
        this.workOrder[i] = _value;
    }

    public SearchColumnCustomFieldList getCustomFieldList() {
        return this.customFieldList;
    }

    public void setCustomFieldList(SearchColumnCustomFieldList customFieldList) {
        this.customFieldList = customFieldList;
    }

    @Override
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ManufacturingOperationTaskSearchRowBasic)) {
            return false;
        }
        ManufacturingOperationTaskSearchRowBasic other = (ManufacturingOperationTaskSearchRowBasic)obj;
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
        boolean _equals = super.equals(obj) && (this.actualRunTime == null && other.getActualRunTime() == null || this.actualRunTime != null && Arrays.equals(this.actualRunTime, other.getActualRunTime())) && (this.actualSetupTime == null && other.getActualSetupTime() == null || this.actualSetupTime != null && Arrays.equals(this.actualSetupTime, other.getActualSetupTime())) && (this.completedQuantity == null && other.getCompletedQuantity() == null || this.completedQuantity != null && Arrays.equals(this.completedQuantity, other.getCompletedQuantity())) && (this.endDate == null && other.getEndDate() == null || this.endDate != null && Arrays.equals(this.endDate, other.getEndDate())) && (this.estimatedWork == null && other.getEstimatedWork() == null || this.estimatedWork != null && Arrays.equals(this.estimatedWork, other.getEstimatedWork())) && (this.externalId == null && other.getExternalId() == null || this.externalId != null && Arrays.equals(this.externalId, other.getExternalId())) && (this.id == null && other.getId() == null || this.id != null && Arrays.equals(this.id, other.getId())) && (this.inputQuantity == null && other.getInputQuantity() == null || this.inputQuantity != null && Arrays.equals(this.inputQuantity, other.getInputQuantity())) && (this.internalId == null && other.getInternalId() == null || this.internalId != null && Arrays.equals(this.internalId, other.getInternalId())) && (this.laborResources == null && other.getLaborResources() == null || this.laborResources != null && Arrays.equals(this.laborResources, other.getLaborResources())) && (this.lagAmount == null && other.getLagAmount() == null || this.lagAmount != null && Arrays.equals(this.lagAmount, other.getLagAmount())) && (this.lagType == null && other.getLagType() == null || this.lagType != null && Arrays.equals(this.lagType, other.getLagType())) && (this.lagUnits == null && other.getLagUnits() == null || this.lagUnits != null && Arrays.equals(this.lagUnits, other.getLagUnits())) && (this.machineResources == null && other.getMachineResources() == null || this.machineResources != null && Arrays.equals(this.machineResources, other.getMachineResources())) && (this.manufacturingCostTemplate == null && other.getManufacturingCostTemplate() == null || this.manufacturingCostTemplate != null && Arrays.equals(this.manufacturingCostTemplate, other.getManufacturingCostTemplate())) && (this.manufacturingWorkCenter == null && other.getManufacturingWorkCenter() == null || this.manufacturingWorkCenter != null && Arrays.equals(this.manufacturingWorkCenter, other.getManufacturingWorkCenter())) && (this.message == null && other.getMessage() == null || this.message != null && Arrays.equals(this.message, other.getMessage())) && (this.name == null && other.getName() == null || this.name != null && Arrays.equals(this.name, other.getName())) && (this.order == null && other.getOrder() == null || this.order != null && Arrays.equals(this.order, other.getOrder())) && (this.predecessor == null && other.getPredecessor() == null || this.predecessor != null && Arrays.equals(this.predecessor, other.getPredecessor())) && (this.predecessorType == null && other.getPredecessorType() == null || this.predecessorType != null && Arrays.equals(this.predecessorType, other.getPredecessorType())) && (this.remainingQuantity == null && other.getRemainingQuantity() == null || this.remainingQuantity != null && Arrays.equals(this.remainingQuantity, other.getRemainingQuantity())) && (this.runRate == null && other.getRunRate() == null || this.runRate != null && Arrays.equals(this.runRate, other.getRunRate())) && (this.runTime == null && other.getRunTime() == null || this.runTime != null && Arrays.equals(this.runTime, other.getRunTime())) && (this.sequence == null && other.getSequence() == null || this.sequence != null && Arrays.equals(this.sequence, other.getSequence())) && (this.setupTime == null && other.getSetupTime() == null || this.setupTime != null && Arrays.equals(this.setupTime, other.getSetupTime())) && (this.startDate == null && other.getStartDate() == null || this.startDate != null && Arrays.equals(this.startDate, other.getStartDate())) && (this.status == null && other.getStatus() == null || this.status != null && Arrays.equals(this.status, other.getStatus())) && (this.workOrder == null && other.getWorkOrder() == null || this.workOrder != null && Arrays.equals(this.workOrder, other.getWorkOrder())) && (this.customFieldList == null && other.getCustomFieldList() == null || this.customFieldList != null && this.customFieldList.equals(other.getCustomFieldList()));
        this.__equalsCalc = null;
        return _equals;
    }

    @Override
    public synchronized int hashCode() {
        Object obj;
        int i;
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (this.getActualRunTime() != null) {
            for (i = 0; i < Array.getLength(this.getActualRunTime()); ++i) {
                obj = Array.get(this.getActualRunTime(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getActualSetupTime() != null) {
            for (i = 0; i < Array.getLength(this.getActualSetupTime()); ++i) {
                obj = Array.get(this.getActualSetupTime(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getCompletedQuantity() != null) {
            for (i = 0; i < Array.getLength(this.getCompletedQuantity()); ++i) {
                obj = Array.get(this.getCompletedQuantity(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getEndDate() != null) {
            for (i = 0; i < Array.getLength(this.getEndDate()); ++i) {
                obj = Array.get(this.getEndDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getEstimatedWork() != null) {
            for (i = 0; i < Array.getLength(this.getEstimatedWork()); ++i) {
                obj = Array.get(this.getEstimatedWork(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getExternalId() != null) {
            for (i = 0; i < Array.getLength(this.getExternalId()); ++i) {
                obj = Array.get(this.getExternalId(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getId() != null) {
            for (i = 0; i < Array.getLength(this.getId()); ++i) {
                obj = Array.get(this.getId(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getInputQuantity() != null) {
            for (i = 0; i < Array.getLength(this.getInputQuantity()); ++i) {
                obj = Array.get(this.getInputQuantity(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getInternalId() != null) {
            for (i = 0; i < Array.getLength(this.getInternalId()); ++i) {
                obj = Array.get(this.getInternalId(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLaborResources() != null) {
            for (i = 0; i < Array.getLength(this.getLaborResources()); ++i) {
                obj = Array.get(this.getLaborResources(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLagAmount() != null) {
            for (i = 0; i < Array.getLength(this.getLagAmount()); ++i) {
                obj = Array.get(this.getLagAmount(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLagType() != null) {
            for (i = 0; i < Array.getLength(this.getLagType()); ++i) {
                obj = Array.get(this.getLagType(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getLagUnits() != null) {
            for (i = 0; i < Array.getLength(this.getLagUnits()); ++i) {
                obj = Array.get(this.getLagUnits(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getMachineResources() != null) {
            for (i = 0; i < Array.getLength(this.getMachineResources()); ++i) {
                obj = Array.get(this.getMachineResources(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getManufacturingCostTemplate() != null) {
            for (i = 0; i < Array.getLength(this.getManufacturingCostTemplate()); ++i) {
                obj = Array.get(this.getManufacturingCostTemplate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getManufacturingWorkCenter() != null) {
            for (i = 0; i < Array.getLength(this.getManufacturingWorkCenter()); ++i) {
                obj = Array.get(this.getManufacturingWorkCenter(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getMessage() != null) {
            for (i = 0; i < Array.getLength(this.getMessage()); ++i) {
                obj = Array.get(this.getMessage(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getName() != null) {
            for (i = 0; i < Array.getLength(this.getName()); ++i) {
                obj = Array.get(this.getName(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getOrder() != null) {
            for (i = 0; i < Array.getLength(this.getOrder()); ++i) {
                obj = Array.get(this.getOrder(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPredecessor() != null) {
            for (i = 0; i < Array.getLength(this.getPredecessor()); ++i) {
                obj = Array.get(this.getPredecessor(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getPredecessorType() != null) {
            for (i = 0; i < Array.getLength(this.getPredecessorType()); ++i) {
                obj = Array.get(this.getPredecessorType(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRemainingQuantity() != null) {
            for (i = 0; i < Array.getLength(this.getRemainingQuantity()); ++i) {
                obj = Array.get(this.getRemainingQuantity(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRunRate() != null) {
            for (i = 0; i < Array.getLength(this.getRunRate()); ++i) {
                obj = Array.get(this.getRunRate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getRunTime() != null) {
            for (i = 0; i < Array.getLength(this.getRunTime()); ++i) {
                obj = Array.get(this.getRunTime(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSequence() != null) {
            for (i = 0; i < Array.getLength(this.getSequence()); ++i) {
                obj = Array.get(this.getSequence(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getSetupTime() != null) {
            for (i = 0; i < Array.getLength(this.getSetupTime()); ++i) {
                obj = Array.get(this.getSetupTime(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getStartDate() != null) {
            for (i = 0; i < Array.getLength(this.getStartDate()); ++i) {
                obj = Array.get(this.getStartDate(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getStatus() != null) {
            for (i = 0; i < Array.getLength(this.getStatus()); ++i) {
                obj = Array.get(this.getStatus(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
        }
        if (this.getWorkOrder() != null) {
            for (i = 0; i < Array.getLength(this.getWorkOrder()); ++i) {
                obj = Array.get(this.getWorkOrder(), i);
                if (obj == null || obj.getClass().isArray()) continue;
                _hashCode += obj.hashCode();
            }
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
        typeDesc.setXmlType(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "ManufacturingOperationTaskSearchRowBasic"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("actualRunTime");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "actualRunTime"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("actualSetupTime");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "actualSetupTime"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("completedQuantity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "completedQuantity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("endDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "endDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("estimatedWork");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "estimatedWork"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("externalId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "externalId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "id"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("inputQuantity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "inputQuantity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("internalId");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "internalId"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("laborResources");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "laborResources"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lagAmount");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lagAmount"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lagType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lagType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnEnumSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lagUnits");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "lagUnits"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("machineResources");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "machineResources"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("manufacturingCostTemplate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "manufacturingCostTemplate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("manufacturingWorkCenter");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "manufacturingWorkCenter"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("message");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "message"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "name"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("order");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "order"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("predecessor");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "predecessor"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("predecessorType");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "predecessorType"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("remainingQuantity");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "remainingQuantity"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("runRate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "runRate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("runTime");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "runTime"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("sequence");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "sequence"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnLongField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("setupTime");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "setupTime"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDoubleField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("startDate");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "startDate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnDateField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "status"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnSelectField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("workOrder");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "workOrder"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnStringField"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("customFieldList");
        elemField.setXmlName(new QName("urn:common_2022_1.platform.webservices.netsuite.com", "customFieldList"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "SearchColumnCustomFieldList"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

