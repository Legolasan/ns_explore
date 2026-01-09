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
package com.netsuite.suitetalk.proxy.v2022_1.activities.scheduling;

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

public class ProjectTaskAssignee
implements Serializable {
    private RecordRef resource;
    private Double units;
    private RecordRef serviceItem;
    private Double estimatedWork;
    private Double unitCost;
    private Double unitPrice;
    private Double cost;
    private Double price;
    private Double plannedWork;
    private Object __equalsCalc = null;
    private boolean __hashCodeCalc = false;
    private static TypeDesc typeDesc = new TypeDesc(ProjectTaskAssignee.class, true);

    public ProjectTaskAssignee() {
    }

    public ProjectTaskAssignee(RecordRef resource, Double units, RecordRef serviceItem, Double estimatedWork, Double unitCost, Double unitPrice, Double cost, Double price, Double plannedWork) {
        this.resource = resource;
        this.units = units;
        this.serviceItem = serviceItem;
        this.estimatedWork = estimatedWork;
        this.unitCost = unitCost;
        this.unitPrice = unitPrice;
        this.cost = cost;
        this.price = price;
        this.plannedWork = plannedWork;
    }

    public RecordRef getResource() {
        return this.resource;
    }

    public void setResource(RecordRef resource) {
        this.resource = resource;
    }

    public Double getUnits() {
        return this.units;
    }

    public void setUnits(Double units) {
        this.units = units;
    }

    public RecordRef getServiceItem() {
        return this.serviceItem;
    }

    public void setServiceItem(RecordRef serviceItem) {
        this.serviceItem = serviceItem;
    }

    public Double getEstimatedWork() {
        return this.estimatedWork;
    }

    public void setEstimatedWork(Double estimatedWork) {
        this.estimatedWork = estimatedWork;
    }

    public Double getUnitCost() {
        return this.unitCost;
    }

    public void setUnitCost(Double unitCost) {
        this.unitCost = unitCost;
    }

    public Double getUnitPrice() {
        return this.unitPrice;
    }

    public void setUnitPrice(Double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public Double getCost() {
        return this.cost;
    }

    public void setCost(Double cost) {
        this.cost = cost;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPlannedWork() {
        return this.plannedWork;
    }

    public void setPlannedWork(Double plannedWork) {
        this.plannedWork = plannedWork;
    }

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ProjectTaskAssignee)) {
            return false;
        }
        ProjectTaskAssignee other = (ProjectTaskAssignee)obj;
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
        boolean _equals = (this.resource == null && other.getResource() == null || this.resource != null && this.resource.equals(other.getResource())) && (this.units == null && other.getUnits() == null || this.units != null && this.units.equals(other.getUnits())) && (this.serviceItem == null && other.getServiceItem() == null || this.serviceItem != null && this.serviceItem.equals(other.getServiceItem())) && (this.estimatedWork == null && other.getEstimatedWork() == null || this.estimatedWork != null && this.estimatedWork.equals(other.getEstimatedWork())) && (this.unitCost == null && other.getUnitCost() == null || this.unitCost != null && this.unitCost.equals(other.getUnitCost())) && (this.unitPrice == null && other.getUnitPrice() == null || this.unitPrice != null && this.unitPrice.equals(other.getUnitPrice())) && (this.cost == null && other.getCost() == null || this.cost != null && this.cost.equals(other.getCost())) && (this.price == null && other.getPrice() == null || this.price != null && this.price.equals(other.getPrice())) && (this.plannedWork == null && other.getPlannedWork() == null || this.plannedWork != null && this.plannedWork.equals(other.getPlannedWork()));
        this.__equalsCalc = null;
        return _equals;
    }

    public synchronized int hashCode() {
        if (this.__hashCodeCalc) {
            return 0;
        }
        this.__hashCodeCalc = true;
        int _hashCode = 1;
        if (this.getResource() != null) {
            _hashCode += this.getResource().hashCode();
        }
        if (this.getUnits() != null) {
            _hashCode += this.getUnits().hashCode();
        }
        if (this.getServiceItem() != null) {
            _hashCode += this.getServiceItem().hashCode();
        }
        if (this.getEstimatedWork() != null) {
            _hashCode += this.getEstimatedWork().hashCode();
        }
        if (this.getUnitCost() != null) {
            _hashCode += this.getUnitCost().hashCode();
        }
        if (this.getUnitPrice() != null) {
            _hashCode += this.getUnitPrice().hashCode();
        }
        if (this.getCost() != null) {
            _hashCode += this.getCost().hashCode();
        }
        if (this.getPrice() != null) {
            _hashCode += this.getPrice().hashCode();
        }
        if (this.getPlannedWork() != null) {
            _hashCode += this.getPlannedWork().hashCode();
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
        typeDesc.setXmlType(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "ProjectTaskAssignee"));
        ElementDesc elemField = new ElementDesc();
        elemField.setFieldName("resource");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "resource"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("units");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "units"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("serviceItem");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "serviceItem"));
        elemField.setXmlType(new QName("urn:core_2022_1.platform.webservices.netsuite.com", "RecordRef"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("estimatedWork");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "estimatedWork"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("unitCost");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "unitCost"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("unitPrice");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "unitPrice"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("cost");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "cost"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("price");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "price"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
        elemField = new ElementDesc();
        elemField.setFieldName("plannedWork");
        elemField.setXmlName(new QName("urn:scheduling_2022_1.activities.webservices.netsuite.com", "plannedWork"));
        elemField.setXmlType(new QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc((FieldDesc)elemField);
    }
}

