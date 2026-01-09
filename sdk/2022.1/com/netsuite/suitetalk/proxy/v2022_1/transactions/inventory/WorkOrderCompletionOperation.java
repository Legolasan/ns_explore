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
package com.netsuite.suitetalk.proxy.v2022_1.transactions.inventory;

import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class WorkOrderCompletionOperation
implements Serializable {
    private Long operationSequence;
    private String operationName;
    private String workCenter;
    private Double machineResources;
    private Double laborResources;
    private Double inputQuantity;
    private Double quantityRemaining;
    private Double predecessorCompletedQuantity;
    private Double completedQuantity;
    private Boolean recordSetup;
    private Double machineSetupTime;
    private Double laborSetupTime;
    private Double machineRunTime;
    private Double laborRunTime;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(WorkOrderCompletionOperation.class, true);

    public WorkOrderCompletionOperation() {
    }

    public WorkOrderCompletionOperation(Long operationSequence, String operationName, String workCenter, Double machineResources, Double laborResources, Double inputQuantity, Double quantityRemaining, Double predecessorCompletedQuantity, Double completedQuantity, Boolean recordSetup, Double machineSetupTime, Double laborSetupTime, Double machineRunTime, Double laborRunTime) {
        this.operationSequence = operationSequence;
        this.operationName = operationName;
        this.workCenter = workCenter;
        this.machineResources = machineResources;
        this.laborResources = laborResources;
        this.inputQuantity = inputQuantity;
        this.quantityRemaining = quantityRemaining;
        this.predecessorCompletedQuantity = predecessorCompletedQuantity;
        this.completedQuantity = completedQuantity;
        this.recordSetup = recordSetup;
        this.machineSetupTime = machineSetupTime;
        this.laborSetupTime = laborSetupTime;
        this.machineRunTime = machineRunTime;
        this.laborRunTime = laborRunTime;
    }

    public Long getOperationSequence() {
        return this.operationSequence;
    }

    public void setOperationSequence(Long operationSequence) {
        this.operationSequence = operationSequence;
    }

    public String getOperationName() {
        return this.operationName;
    }

    public void setOperationName(String operationName) {
        this.operationName = operationName;
    }

    public String getWorkCenter() {
        return this.workCenter;
    }

    public void setWorkCenter(String workCenter) {
        this.workCenter = workCenter;
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

    public Double getInputQuantity() {
        return this.inputQuantity;
    }

    public void setInputQuantity(Double inputQuantity) {
        this.inputQuantity = inputQuantity;
    }

    public Double getQuantityRemaining() {
        return this.quantityRemaining;
    }

    public void setQuantityRemaining(Double quantityRemaining) {
        this.quantityRemaining = quantityRemaining;
    }

    public Double getPredecessorCompletedQuantity() {
        return this.predecessorCompletedQuantity;
    }

    public void setPredecessorCompletedQuantity(Double predecessorCompletedQuantity) {
        this.predecessorCompletedQuantity = predecessorCompletedQuantity;
    }

    public Double getCompletedQuantity() {
        return this.completedQuantity;
    }

    public void setCompletedQuantity(Double completedQuantity) {
        this.completedQuantity = completedQuantity;
    }

    public Boolean getRecordSetup() {
        return this.recordSetup;
    }

    public void setRecordSetup(Boolean recordSetup) {
        this.recordSetup = recordSetup;
    }

    public Double getMachineSetupTime() {
        return this.machineSetupTime;
    }

    public void setMachineSetupTime(Double machineSetupTime) {
        this.machineSetupTime = machineSetupTime;
    }

    public Double getLaborSetupTime() {
        return this.laborSetupTime;
    }

    public void setLaborSetupTime(Double laborSetupTime) {
        this.laborSetupTime = laborSetupTime;
    }

    public Double getMachineRunTime() {
        return this.machineRunTime;
    }

    public void setMachineRunTime(Double machineRunTime) {
        this.machineRunTime = machineRunTime;
    }

    public Double getLaborRunTime() {
        return this.laborRunTime;
    }

    public void setLaborRunTime(Double laborRunTime) {
        this.laborRunTime = laborRunTime;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof WorkOrderCompletionOperation)) {
            return false;
        }
        WorkOrderCompletionOperation other = (WorkOrderCompletionOperation)obj;
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
        boolean _equals = (this.operationSequence == null && other.getOperationSequence() == null || this.operationSequence != null && this.operationSequence.equals(other.getOperationSequence())) && (this.operationName == null && other.getOperationName() == null || this.operationName != null && this.operationName.equals(other.getOperationName())) && (this.workCenter == null && other.getWorkCenter() == null || this.workCenter != null && this.workCenter.equals(other.getWorkCenter())) && (this.machineResources == null && other.getMachineResources() == null || this.machineResources != null && this.machineResources.equals(other.getMachineResources())) && (this.laborResources == null && other.getLaborResources() == null || this.laborResources != null && this.laborResources.equals(other.getLaborResources())) && (this.inputQuantity == null && other.getInputQuantity() == null || this.inputQuantity != null && this.inputQuantity.equals(other.getInputQuantity())) && (this.quantityRemaining == null && other.getQuantityRemaining() == null || this.quantityRemaining != null && this.quantityRemaining.equals(other.getQuantityRemaining())) && (this.predecessorCompletedQuantity == null && other.getPredecessorCompletedQuantity() == null || this.predecessorCompletedQuantity != null && this.predecessorCompletedQuantity.equals(other.getPredecessorCompletedQuantity())) && (this.completedQuantity == null && other.getCompletedQuantity() == null || this.completedQuantity != null && this.completedQuantity.equals(other.getCompletedQuantity())) && (this.recordSetup == null && other.getRecordSetup() == null || this.recordSetup != null && this.recordSetup.equals(other.getRecordSetup())) && (this.machineSetupTime == null && other.getMachineSetupTime() == null || this.machineSetupTime != null && this.machineSetupTime.equals(other.getMachineSetupTime())) && (this.laborSetupTime == null && other.getLaborSetupTime() == null || this.laborSetupTime != null && this.laborSetupTime.equals(other.getLaborSetupTime())) && (this.machineRunTime == null && other.getMachineRunTime() == null || this.machineRunTime != null && this.machineRunTime.equals(other.getMachineRunTime())) && (this.laborRunTime == null && other.getLaborRunTime() == null || this.laborRunTime != null && this.laborRunTime.equals(other.getLaborRunTime()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getOperationSequence() != null) {
            _hashCode += this.getOperationSequence().hashCode();
        }
        if (this.getOperationName() != null) {
            _hashCode += this.getOperationName().hashCode();
        }
        if (this.getWorkCenter() != null) {
            _hashCode += this.getWorkCenter().hashCode();
        }
        if (this.getMachineResources() != null) {
            _hashCode += this.getMachineResources().hashCode();
        }
        if (this.getLaborResources() != null) {
            _hashCode += this.getLaborResources().hashCode();
        }
        if (this.getInputQuantity() != null) {
            _hashCode += this.getInputQuantity().hashCode();
        }
        if (this.getQuantityRemaining() != null) {
            _hashCode += this.getQuantityRemaining().hashCode();
        }
        if (this.getPredecessorCompletedQuantity() != null) {
            _hashCode += this.getPredecessorCompletedQuantity().hashCode();
        }
        if (this.getCompletedQuantity() != null) {
            _hashCode += this.getCompletedQuantity().hashCode();
        }
        if (this.getRecordSetup() != null) {
            _hashCode += this.getRecordSetup().hashCode();
        }
        if (this.getMachineSetupTime() != null) {
            _hashCode += this.getMachineSetupTime().hashCode();
        }
        if (this.getLaborSetupTime() != null) {
            _hashCode += this.getLaborSetupTime().hashCode();
        }
        if (this.getMachineRunTime() != null) {
            _hashCode += this.getMachineRunTime().hashCode();
        }
        if (this.getLaborRunTime() != null) {
            _hashCode += this.getLaborRunTime().hashCode();
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
        typeDesc.setXmlType(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "WorkOrderCompletionOperation"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("operationSequence");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "operationSequence"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("operationName");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "operationName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("workCenter");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "workCenter"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("machineResources");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "machineResources"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("laborResources");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "laborResources"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("inputQuantity");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "inputQuantity"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("quantityRemaining");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "quantityRemaining"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("predecessorCompletedQuantity");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "predecessorCompletedQuantity"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("recordSetup");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "recordSetup"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("machineSetupTime");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "machineSetupTime"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("laborSetupTime");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "laborSetupTime"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("machineRunTime");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "machineRunTime"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("laborRunTime");
        elemField.setXmlName(new QName("urn:inventory_2022_1.transactions.webservices.netsuite.com", "laborRunTime"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

