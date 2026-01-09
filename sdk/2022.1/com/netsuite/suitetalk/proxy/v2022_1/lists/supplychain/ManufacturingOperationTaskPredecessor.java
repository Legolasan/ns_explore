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
import com.netsuite.suitetalk.proxy.v2022_1.lists.supplychain.types.ManufacturingOperationTaskPredecessorPredecessorType;
import com.netsuite.suitetalk.proxy.v2022_1.platform.core.RecordRef;
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

public class ManufacturingOperationTaskPredecessor
implements Serializable {
    private RecordRef task;
    private ManufacturingOperationTaskPredecessorPredecessorType type;
    private Calendar startDate;
    private Calendar endDate;
    private ManufacturingLagType lagType;
    private Long lagAmount;
    private String lagUnits;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(ManufacturingOperationTaskPredecessor.class, true);

    public ManufacturingOperationTaskPredecessor() {
    }

    public ManufacturingOperationTaskPredecessor(RecordRef task, ManufacturingOperationTaskPredecessorPredecessorType type, Calendar startDate, Calendar endDate, ManufacturingLagType lagType, Long lagAmount, String lagUnits) {
        this.task = task;
        this.type = type;
        this.startDate = startDate;
        this.endDate = endDate;
        this.lagType = lagType;
        this.lagAmount = lagAmount;
        this.lagUnits = lagUnits;
    }

    public RecordRef getTask() {
        return this.task;
    }

    public void setTask(RecordRef task) {
        this.task = task;
    }

    public ManufacturingOperationTaskPredecessorPredecessorType getType() {
        return this.type;
    }

    public void setType(ManufacturingOperationTaskPredecessorPredecessorType type) {
        this.type = type;
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
        if (!(obj instanceof ManufacturingOperationTaskPredecessor)) {
            return false;
        }
        ManufacturingOperationTaskPredecessor other = (ManufacturingOperationTaskPredecessor)obj;
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
        boolean _equals = (this.task == null && other.getTask() == null || this.task != null && this.task.equals(other.getTask())) && (this.type == null && other.getType() == null || this.type != null && this.type.equals(other.getType())) && (this.startDate == null && other.getStartDate() == null || this.startDate != null && this.startDate.equals(other.getStartDate())) && (this.endDate == null && other.getEndDate() == null || this.endDate != null && this.endDate.equals(other.getEndDate())) && (this.lagType == null && other.getLagType() == null || this.lagType != null && this.lagType.equals(other.getLagType())) && (this.lagAmount == null && other.getLagAmount() == null || this.lagAmount != null && this.lagAmount.equals(other.getLagAmount())) && (this.lagUnits == null && other.getLagUnits() == null || this.lagUnits != null && this.lagUnits.equals(other.getLagUnits()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getTask() != null) {
            _hashCode += this.getTask().hashCode();
        }
        if (this.getType() != null) {
            _hashCode += this.getType().hashCode();
        }
        if (this.getStartDate() != null) {
            _hashCode += this.getStartDate().hashCode();
        }
        if (this.getEndDate() != null) {
            _hashCode += this.getEndDate().hashCode();
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
        typeDesc.setXmlType(new QName("urn:supplychain_2022_1.lists.webservices.netsuite.com", "ManufacturingOperationTaskPredecessor"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("task");
        elemField.setXmlName(new QName("urn:supplychain_2022_1.lists.webservices.netsuite.com", "task"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("type");
        elemField.setXmlName(new QName("urn:supplychain_2022_1.lists.webservices.netsuite.com", "type"));
        elemField.setXmlType(new QName("urn:types.supplychain_2022_1.lists.webservices.netsuite.com", "ManufacturingOperationTaskPredecessorPredecessorType"));
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

