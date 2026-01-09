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
package com.netsuite.suitetalk.proxy.v2022_1.lists.supplychain;

import com.netsuite.suitetalk.proxy.v2022_1.lists.supplychain.types.ManufacturingLagType;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
import java.io.Serializable;
import javax.xml.namespace.QName;
import org.apache.axis.description.ElementDesc;
import org.apache.axis.description.FieldDesc;
import org.apache.axis.description.TypeDesc;
import org.apache.axis.encoding.Deserializer;
import org.apache.axis.encoding.Serializer;
import org.apache.axis.encoding.ser.BeanDeserializer;
import org.apache.axis.encoding.ser.BeanSerializer;

public class ManufacturingRoutingRoutingStep
implements Serializable {
    private Long operationSequence;
    private String operationName;
    private RecordRef manufacturingWorkCenter;
    private Double machineResources;
    private Double laborResources;
    private RecordRef manufacturingCostTemplate;
    private Double setupTime;
    private Double runRate;
    private ManufacturingLagType lagType;
    private Long lagAmount;
    private String lagUnits;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(ManufacturingRoutingRoutingStep.class, true);

    public ManufacturingRoutingRoutingStep() {
    }

    public ManufacturingRoutingRoutingStep(Long operationSequence, String operationName, RecordRef manufacturingWorkCenter, Double machineResources, Double laborResources, RecordRef manufacturingCostTemplate, Double setupTime, Double runRate, ManufacturingLagType lagType, Long lagAmount, String lagUnits) {
        this.operationSequence = operationSequence;
        this.operationName = operationName;
        this.manufacturingWorkCenter = manufacturingWorkCenter;
        this.machineResources = machineResources;
        this.laborResources = laborResources;
        this.manufacturingCostTemplate = manufacturingCostTemplate;
        this.setupTime = setupTime;
        this.runRate = runRate;
        this.lagType = lagType;
        this.lagAmount = lagAmount;
        this.lagUnits = lagUnits;
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

    public RecordRef getManufacturingWorkCenter() {
        return this.manufacturingWorkCenter;
    }

    public void setManufacturingWorkCenter(RecordRef manufacturingWorkCenter) {
        this.manufacturingWorkCenter = manufacturingWorkCenter;
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

    public RecordRef getManufacturingCostTemplate() {
        return this.manufacturingCostTemplate;
    }

    public void setManufacturingCostTemplate(RecordRef manufacturingCostTemplate) {
        this.manufacturingCostTemplate = manufacturingCostTemplate;
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

    public ManufacturingLagType getLagType() {
        return this.lagType;
    }

    public void setLagType(ManufacturingLagType lagType) {
        this.lagType = lagType;
    }

    public Long getLagAmount() {
        return this.lagAmount;
    }

    public void setLagAmount(Long lagAmount) {
        this.lagAmount = lagAmount;
    }

    public String getLagUnits() {
        return this.lagUnits;
    }

    public void setLagUnits(String lagUnits) {
        this.lagUnits = lagUnits;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ManufacturingRoutingRoutingStep)) {
            return false;
        }
        ManufacturingRoutingRoutingStep other = (ManufacturingRoutingRoutingStep)obj;
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
        boolean _equals = (this.operationSequence == null && other.getOperationSequence() == null || this.operationSequence != null && this.operationSequence.equals(other.getOperationSequence())) && (this.operationName == null && other.getOperationName() == null || this.operationName != null && this.operationName.equals(other.getOperationName())) && (this.manufacturingWorkCenter == null && other.getManufacturingWorkCenter() == null || this.manufacturingWorkCenter != null && this.manufacturingWorkCenter.equals(other.getManufacturingWorkCenter())) && (this.machineResources == null && other.getMachineResources() == null || this.machineResources != null && this.machineResources.equals(other.getMachineResources())) && (this.laborResources == null && other.getLaborResources() == null || this.laborResources != null && this.laborResources.equals(other.getLaborResources())) && (this.manufacturingCostTemplate == null && other.getManufacturingCostTemplate() == null || this.manufacturingCostTemplate != null && this.manufacturingCostTemplate.equals(other.getManufacturingCostTemplate())) && (this.setupTime == null && other.getSetupTime() == null || this.setupTime != null && this.setupTime.equals(other.getSetupTime())) && (this.runRate == null && other.getRunRate() == null || this.runRate != null && this.runRate.equals(other.getRunRate())) && (this.lagType == null && other.getLagType() == null || this.lagType != null && this.lagType.equals(other.getLagType())) && (this.lagAmount == null && other.getLagAmount() == null || this.lagAmount != null && this.lagAmount.equals(other.getLagAmount())) && (this.lagUnits == null && other.getLagUnits() == null || this.lagUnits != null && this.lagUnits.equals(other.getLagUnits()));
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
        if (this.getManufacturingWorkCenter() != null) {
            _hashCode += this.getManufacturingWorkCenter().hashCode();
        }
        if (this.getMachineResources() != null) {
            _hashCode += this.getMachineResources().hashCode();
        }
        if (this.getLaborResources() != null) {
            _hashCode += this.getLaborResources().hashCode();
        }
        if (this.getManufacturingCostTemplate() != null) {
            _hashCode += this.getManufacturingCostTemplate().hashCode();
        }
        if (this.getSetupTime() != null) {
            _hashCode += this.getSetupTime().hashCode();
        }
        if (this.getRunRate() != null) {
            _hashCode += this.getRunRate().hashCode();
        }
        if (this.getLagType() != null) {
            _hashCode += this.getLagType().hashCode();
        }
        if (this.getLagAmount() != null) {
            _hashCode += this.getLagAmount().hashCode();
        }
        if (this.getLagUnits() != null) {
            _hashCode += this.getLagUnits().hashCode();
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
        typeDesc.setXmlType(new QName("urn:supplychain_2022_1.lists.webservices.netsuite.com", "ManufacturingRoutingRoutingStep"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("operationSequence");
        elemField.setXmlName(new QName("urn:supplychain_2022_1.lists.webservices.netsuite.com", "operationSequence"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("operationName");
        elemField.setXmlName(new QName("urn:supplychain_2022_1.lists.webservices.netsuite.com", "operationName"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("manufacturingCostTemplate");
        elemField.setXmlName(new QName("urn:supplychain_2022_1.lists.webservices.netsuite.com", "manufacturingCostTemplate"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
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
        elemField.setFieldName("lagType");
        elemField.setXmlName(new QName("urn:supplychain_2022_1.lists.webservices.netsuite.com", "lagType"));
        elemField.setXmlType(new QName("urn:types.supplychain_2022_1.lists.webservices.netsuite.com", "ManufacturingLagType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lagAmount");
        elemField.setXmlName(new QName("urn:supplychain_2022_1.lists.webservices.netsuite.com", "lagAmount"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("lagUnits");
        elemField.setXmlName(new QName("urn:supplychain_2022_1.lists.webservices.netsuite.com", "lagUnits"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

